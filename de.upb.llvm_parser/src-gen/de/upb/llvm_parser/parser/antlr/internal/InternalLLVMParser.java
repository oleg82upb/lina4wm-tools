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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ALIAS_LINKAGE", "RULE_ATOMIC_ORDERING", "RULE_BIN_OP", "RULE_RETURN_ATTRIBUTES", "RULE_CAST_OP", "RULE_I_PREDICATES", "RULE_VISIBILITY", "RULE_LINKAGE", "RULE_INT_TYPE", "RULE_ID", "RULE_BOOL", "RULE_SL_COMMENT", "RULE_STRING", "RULE_UNKNOWN_TYPE", "RULE_VALID_ID", "RULE_POINTER", "RULE_PRIMITIVE_VALUE", "RULE_FLOATING_POINT_TYPE", "RULE_INITIALIZER", "RULE_METADATA", "RULE_F_PREDICATES", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'-'", "'.'", "'ccc'", "'fastcc'", "'coldcc'", "'x86_stdcallcc'", "'x86_fastcallcc'", "'x86_thiscallcc'", "'arm_apcscc'", "'arm_aapcscc'", "'arm_aapcs_vfpcc'", "'msp430_intrcc'", "'ptx_kernel'", "'ptx_device'", "'spir_func'", "'spir_kernel'", "'cc'", "'<'", "'>'", "'address_safety'", "'alignstack'", "'('", "')'", "'alwaysinline'", "'nonlazybind'", "'inlinehint'", "'naked'", "'noimplicitfloat'", "'noinline'", "'noredzone'", "'noreturn'", "'nounwind'", "'optsize'", "'readnone'", "'readonly'", "'returns_twice'", "'ssp'", "'sspreq'", "'uwtable'", "'catch'", "'invoke'", "'resume'", "'switch'", "'module'", "'asm'", "'target'", "'datalayout'", "'triple'", "'='", "'deplibs'", "'['", "','", "']'", "'type'", "'opaque'", "'global'", "'unnamed_addr'", "'constant'", "'align'", "'define'", "'()'", "'section '", "'declare'", "'alias'", "'x'", "'[]'", "'{'", "'}'", "':'", "'add'", "'fadd'", "'sub'", "'fsub'", "'mul'", "'fmul'", "'udiv'", "'sdiv'", "'fdiv'", "'urem'", "'srem'", "'frem'", "'nsw'", "'nuw'", "'shl'", "'lshr'", "'ashr'", "'and'", "'or'", "'xor'", "'to'", "'metadata'", "'!'", "'!{'", "'getelementptr'", "'inbounds'", "'fence'", "'singlethread'", "'cmpxchg'", "'volatile'", "'atomicrmw'", "'load'", "'atomic'", "'store'", "'tail'", "'call'", "'!srcloc'", "'alloca'", "'phi'", "'landingpad'", "'personality'", "'cleanup'", "'filter'", "'select'", "'va_arg'", "'extractvalue'", "'insertvalue'", "'extractelement'", "'insertelement'", "'shufflevector'", "'icmp'", "'fcmp'", "'indirectbr'", "'label'", "'unwind'", "'unreachable'", "'ret'", "'!dbg'", "'br'"
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

                if ( (LA1_0==RULE_VALID_ID||LA1_0==RULE_METADATA||LA1_0==72||LA1_0==74||LA1_0==78||LA1_0==88||LA1_0==91) ) {
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


    // $ANTLR start "entryRuleCALLING_CONV"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:153:1: entryRuleCALLING_CONV returns [String current=null] : iv_ruleCALLING_CONV= ruleCALLING_CONV EOF ;
    public final String entryRuleCALLING_CONV() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCALLING_CONV = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:154:2: (iv_ruleCALLING_CONV= ruleCALLING_CONV EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:155:2: iv_ruleCALLING_CONV= ruleCALLING_CONV EOF
            {
             newCompositeNode(grammarAccess.getCALLING_CONVRule()); 
            pushFollow(FOLLOW_ruleCALLING_CONV_in_entryRuleCALLING_CONV316);
            iv_ruleCALLING_CONV=ruleCALLING_CONV();

            state._fsp--;

             current =iv_ruleCALLING_CONV.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCALLING_CONV327); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCALLING_CONV"


    // $ANTLR start "ruleCALLING_CONV"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:162:1: ruleCALLING_CONV returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'ccc' | kw= 'fastcc' | kw= 'coldcc' | kw= 'x86_stdcallcc' | kw= 'x86_fastcallcc' | kw= 'x86_thiscallcc' | kw= 'arm_apcscc' | kw= 'arm_aapcscc' | kw= 'arm_aapcs_vfpcc' | kw= 'msp430_intrcc' | kw= 'ptx_kernel' | kw= 'ptx_device' | kw= 'spir_func' | kw= 'spir_kernel' | (kw= 'cc' kw= '<' this_NUMBER_16= ruleNUMBER kw= '>' this_NUMBER_18= ruleNUMBER ) ) ;
    public final AntlrDatatypeRuleToken ruleCALLING_CONV() throws RecognitionException {
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
                    kw=(Token)match(input,31,FOLLOW_31_in_ruleCALLING_CONV365); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCALLING_CONVAccess().getCccKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:174:2: kw= 'fastcc'
                    {
                    kw=(Token)match(input,32,FOLLOW_32_in_ruleCALLING_CONV384); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCALLING_CONVAccess().getFastccKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:181:2: kw= 'coldcc'
                    {
                    kw=(Token)match(input,33,FOLLOW_33_in_ruleCALLING_CONV403); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCALLING_CONVAccess().getColdccKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:188:2: kw= 'x86_stdcallcc'
                    {
                    kw=(Token)match(input,34,FOLLOW_34_in_ruleCALLING_CONV422); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCALLING_CONVAccess().getX86_stdcallccKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:195:2: kw= 'x86_fastcallcc'
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleCALLING_CONV441); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCALLING_CONVAccess().getX86_fastcallccKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:202:2: kw= 'x86_thiscallcc'
                    {
                    kw=(Token)match(input,36,FOLLOW_36_in_ruleCALLING_CONV460); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCALLING_CONVAccess().getX86_thiscallccKeyword_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:209:2: kw= 'arm_apcscc'
                    {
                    kw=(Token)match(input,37,FOLLOW_37_in_ruleCALLING_CONV479); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCALLING_CONVAccess().getArm_apcsccKeyword_6()); 
                        

                    }
                    break;
                case 8 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:216:2: kw= 'arm_aapcscc'
                    {
                    kw=(Token)match(input,38,FOLLOW_38_in_ruleCALLING_CONV498); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCALLING_CONVAccess().getArm_aapcsccKeyword_7()); 
                        

                    }
                    break;
                case 9 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:223:2: kw= 'arm_aapcs_vfpcc'
                    {
                    kw=(Token)match(input,39,FOLLOW_39_in_ruleCALLING_CONV517); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCALLING_CONVAccess().getArm_aapcs_vfpccKeyword_8()); 
                        

                    }
                    break;
                case 10 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:230:2: kw= 'msp430_intrcc'
                    {
                    kw=(Token)match(input,40,FOLLOW_40_in_ruleCALLING_CONV536); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCALLING_CONVAccess().getMsp430_intrccKeyword_9()); 
                        

                    }
                    break;
                case 11 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:237:2: kw= 'ptx_kernel'
                    {
                    kw=(Token)match(input,41,FOLLOW_41_in_ruleCALLING_CONV555); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCALLING_CONVAccess().getPtx_kernelKeyword_10()); 
                        

                    }
                    break;
                case 12 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:244:2: kw= 'ptx_device'
                    {
                    kw=(Token)match(input,42,FOLLOW_42_in_ruleCALLING_CONV574); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCALLING_CONVAccess().getPtx_deviceKeyword_11()); 
                        

                    }
                    break;
                case 13 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:251:2: kw= 'spir_func'
                    {
                    kw=(Token)match(input,43,FOLLOW_43_in_ruleCALLING_CONV593); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCALLING_CONVAccess().getSpir_funcKeyword_12()); 
                        

                    }
                    break;
                case 14 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:258:2: kw= 'spir_kernel'
                    {
                    kw=(Token)match(input,44,FOLLOW_44_in_ruleCALLING_CONV612); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCALLING_CONVAccess().getSpir_kernelKeyword_13()); 
                        

                    }
                    break;
                case 15 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:264:6: (kw= 'cc' kw= '<' this_NUMBER_16= ruleNUMBER kw= '>' this_NUMBER_18= ruleNUMBER )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:264:6: (kw= 'cc' kw= '<' this_NUMBER_16= ruleNUMBER kw= '>' this_NUMBER_18= ruleNUMBER )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:265:2: kw= 'cc' kw= '<' this_NUMBER_16= ruleNUMBER kw= '>' this_NUMBER_18= ruleNUMBER
                    {
                    kw=(Token)match(input,45,FOLLOW_45_in_ruleCALLING_CONV632); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCALLING_CONVAccess().getCcKeyword_14_0()); 
                        
                    kw=(Token)match(input,46,FOLLOW_46_in_ruleCALLING_CONV645); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCALLING_CONVAccess().getLessThanSignKeyword_14_1()); 
                        
                     
                            newCompositeNode(grammarAccess.getCALLING_CONVAccess().getNUMBERParserRuleCall_14_2()); 
                        
                    pushFollow(FOLLOW_ruleNUMBER_in_ruleCALLING_CONV667);
                    this_NUMBER_16=ruleNUMBER();

                    state._fsp--;


                    		current.merge(this_NUMBER_16);
                        
                     
                            afterParserOrEnumRuleCall();
                        
                    kw=(Token)match(input,47,FOLLOW_47_in_ruleCALLING_CONV685); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCALLING_CONVAccess().getGreaterThanSignKeyword_14_3()); 
                        
                     
                            newCompositeNode(grammarAccess.getCALLING_CONVAccess().getNUMBERParserRuleCall_14_4()); 
                        
                    pushFollow(FOLLOW_ruleNUMBER_in_ruleCALLING_CONV707);
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
    // $ANTLR end "ruleCALLING_CONV"


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
            else if ( (LA12_0==RULE_VALID_ID||LA12_0==RULE_METADATA||LA12_0==88||LA12_0==91) ) {
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
                    case 94:
                    case 95:
                        {
                        alt16=2;
                        }
                        break;
                    case 82:
                        {
                        alt16=1;
                        }
                        break;
                    case 92:
                        {
                        alt16=4;
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
            case 91:
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

            if ( (LA17_0==95) ) {
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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1178:1: ruleFunctionDefinition returns [EObject current=null] : ( (otherlv_0= 'define' (this_LINKAGE_1= RULE_LINKAGE | this_ALIAS_LINKAGE_2= RULE_ALIAS_LINKAGE )? (this_VISIBILITY_3= RULE_VISIBILITY )? ( ruleCALLING_CONV )? (this_RETURN_ATTRIBUTES_5= RULE_RETURN_ATTRIBUTES )? ( (lv_returnType_6_0= ruleTypeUse ) ) ( (lv_address_7_0= ruleAddress ) ) (otherlv_8= '()' | (otherlv_9= '(' ( (lv_parameter_10_0= ruleFunctionParameterList ) )? otherlv_11= ')' ) ) (otherlv_12= 'unnamed_addr' )? ( ruleFUNCTION_ATTRIBUTES )* (otherlv_14= 'section ' this_STRING_15= RULE_STRING )? (otherlv_16= 'align' ( (lv_align_17_0= ruleNUMBER ) ) )? ( (lv_body_18_0= ruleFunctionBody ) ) ) | (otherlv_19= 'declare' (this_LINKAGE_20= RULE_LINKAGE | this_ALIAS_LINKAGE_21= RULE_ALIAS_LINKAGE )? (this_VISIBILITY_22= RULE_VISIBILITY )? ( ruleCALLING_CONV )? (this_RETURN_ATTRIBUTES_24= RULE_RETURN_ATTRIBUTES )? ( (lv_returnType_25_0= ruleTypeUse ) ) ( (lv_address_26_0= ruleAddress ) ) (otherlv_27= '()' | (otherlv_28= '(' ( (lv_parameter_29_0= ruleFunctionParameterList ) )? otherlv_30= ')' ) ) (otherlv_31= 'unnamed_addr' )? ( ruleFUNCTION_ATTRIBUTES )* (otherlv_33= 'section ' this_STRING_34= RULE_STRING )? (otherlv_35= 'align' ( (lv_align_36_0= ruleNUMBER ) ) )? ) ) ;
    public final EObject ruleFunctionDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_LINKAGE_1=null;
        Token this_ALIAS_LINKAGE_2=null;
        Token this_VISIBILITY_3=null;
        Token this_RETURN_ATTRIBUTES_5=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token this_STRING_15=null;
        Token otherlv_16=null;
        Token otherlv_19=null;
        Token this_LINKAGE_20=null;
        Token this_ALIAS_LINKAGE_21=null;
        Token this_VISIBILITY_22=null;
        Token this_RETURN_ATTRIBUTES_24=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        Token otherlv_33=null;
        Token this_STRING_34=null;
        Token otherlv_35=null;
        EObject lv_returnType_6_0 = null;

        EObject lv_address_7_0 = null;

        EObject lv_parameter_10_0 = null;

        AntlrDatatypeRuleToken lv_align_17_0 = null;

        EObject lv_body_18_0 = null;

        EObject lv_returnType_25_0 = null;

        EObject lv_address_26_0 = null;

        EObject lv_parameter_29_0 = null;

        AntlrDatatypeRuleToken lv_align_36_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1181:28: ( ( (otherlv_0= 'define' (this_LINKAGE_1= RULE_LINKAGE | this_ALIAS_LINKAGE_2= RULE_ALIAS_LINKAGE )? (this_VISIBILITY_3= RULE_VISIBILITY )? ( ruleCALLING_CONV )? (this_RETURN_ATTRIBUTES_5= RULE_RETURN_ATTRIBUTES )? ( (lv_returnType_6_0= ruleTypeUse ) ) ( (lv_address_7_0= ruleAddress ) ) (otherlv_8= '()' | (otherlv_9= '(' ( (lv_parameter_10_0= ruleFunctionParameterList ) )? otherlv_11= ')' ) ) (otherlv_12= 'unnamed_addr' )? ( ruleFUNCTION_ATTRIBUTES )* (otherlv_14= 'section ' this_STRING_15= RULE_STRING )? (otherlv_16= 'align' ( (lv_align_17_0= ruleNUMBER ) ) )? ( (lv_body_18_0= ruleFunctionBody ) ) ) | (otherlv_19= 'declare' (this_LINKAGE_20= RULE_LINKAGE | this_ALIAS_LINKAGE_21= RULE_ALIAS_LINKAGE )? (this_VISIBILITY_22= RULE_VISIBILITY )? ( ruleCALLING_CONV )? (this_RETURN_ATTRIBUTES_24= RULE_RETURN_ATTRIBUTES )? ( (lv_returnType_25_0= ruleTypeUse ) ) ( (lv_address_26_0= ruleAddress ) ) (otherlv_27= '()' | (otherlv_28= '(' ( (lv_parameter_29_0= ruleFunctionParameterList ) )? otherlv_30= ')' ) ) (otherlv_31= 'unnamed_addr' )? ( ruleFUNCTION_ATTRIBUTES )* (otherlv_33= 'section ' this_STRING_34= RULE_STRING )? (otherlv_35= 'align' ( (lv_align_36_0= ruleNUMBER ) ) )? ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1182:1: ( (otherlv_0= 'define' (this_LINKAGE_1= RULE_LINKAGE | this_ALIAS_LINKAGE_2= RULE_ALIAS_LINKAGE )? (this_VISIBILITY_3= RULE_VISIBILITY )? ( ruleCALLING_CONV )? (this_RETURN_ATTRIBUTES_5= RULE_RETURN_ATTRIBUTES )? ( (lv_returnType_6_0= ruleTypeUse ) ) ( (lv_address_7_0= ruleAddress ) ) (otherlv_8= '()' | (otherlv_9= '(' ( (lv_parameter_10_0= ruleFunctionParameterList ) )? otherlv_11= ')' ) ) (otherlv_12= 'unnamed_addr' )? ( ruleFUNCTION_ATTRIBUTES )* (otherlv_14= 'section ' this_STRING_15= RULE_STRING )? (otherlv_16= 'align' ( (lv_align_17_0= ruleNUMBER ) ) )? ( (lv_body_18_0= ruleFunctionBody ) ) ) | (otherlv_19= 'declare' (this_LINKAGE_20= RULE_LINKAGE | this_ALIAS_LINKAGE_21= RULE_ALIAS_LINKAGE )? (this_VISIBILITY_22= RULE_VISIBILITY )? ( ruleCALLING_CONV )? (this_RETURN_ATTRIBUTES_24= RULE_RETURN_ATTRIBUTES )? ( (lv_returnType_25_0= ruleTypeUse ) ) ( (lv_address_26_0= ruleAddress ) ) (otherlv_27= '()' | (otherlv_28= '(' ( (lv_parameter_29_0= ruleFunctionParameterList ) )? otherlv_30= ')' ) ) (otherlv_31= 'unnamed_addr' )? ( ruleFUNCTION_ATTRIBUTES )* (otherlv_33= 'section ' this_STRING_34= RULE_STRING )? (otherlv_35= 'align' ( (lv_align_36_0= ruleNUMBER ) ) )? ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1182:1: ( (otherlv_0= 'define' (this_LINKAGE_1= RULE_LINKAGE | this_ALIAS_LINKAGE_2= RULE_ALIAS_LINKAGE )? (this_VISIBILITY_3= RULE_VISIBILITY )? ( ruleCALLING_CONV )? (this_RETURN_ATTRIBUTES_5= RULE_RETURN_ATTRIBUTES )? ( (lv_returnType_6_0= ruleTypeUse ) ) ( (lv_address_7_0= ruleAddress ) ) (otherlv_8= '()' | (otherlv_9= '(' ( (lv_parameter_10_0= ruleFunctionParameterList ) )? otherlv_11= ')' ) ) (otherlv_12= 'unnamed_addr' )? ( ruleFUNCTION_ATTRIBUTES )* (otherlv_14= 'section ' this_STRING_15= RULE_STRING )? (otherlv_16= 'align' ( (lv_align_17_0= ruleNUMBER ) ) )? ( (lv_body_18_0= ruleFunctionBody ) ) ) | (otherlv_19= 'declare' (this_LINKAGE_20= RULE_LINKAGE | this_ALIAS_LINKAGE_21= RULE_ALIAS_LINKAGE )? (this_VISIBILITY_22= RULE_VISIBILITY )? ( ruleCALLING_CONV )? (this_RETURN_ATTRIBUTES_24= RULE_RETURN_ATTRIBUTES )? ( (lv_returnType_25_0= ruleTypeUse ) ) ( (lv_address_26_0= ruleAddress ) ) (otherlv_27= '()' | (otherlv_28= '(' ( (lv_parameter_29_0= ruleFunctionParameterList ) )? otherlv_30= ')' ) ) (otherlv_31= 'unnamed_addr' )? ( ruleFUNCTION_ATTRIBUTES )* (otherlv_33= 'section ' this_STRING_34= RULE_STRING )? (otherlv_35= 'align' ( (lv_align_36_0= ruleNUMBER ) ) )? ) )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==88) ) {
                alt40=1;
            }
            else if ( (LA40_0==91) ) {
                alt40=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1182:2: (otherlv_0= 'define' (this_LINKAGE_1= RULE_LINKAGE | this_ALIAS_LINKAGE_2= RULE_ALIAS_LINKAGE )? (this_VISIBILITY_3= RULE_VISIBILITY )? ( ruleCALLING_CONV )? (this_RETURN_ATTRIBUTES_5= RULE_RETURN_ATTRIBUTES )? ( (lv_returnType_6_0= ruleTypeUse ) ) ( (lv_address_7_0= ruleAddress ) ) (otherlv_8= '()' | (otherlv_9= '(' ( (lv_parameter_10_0= ruleFunctionParameterList ) )? otherlv_11= ')' ) ) (otherlv_12= 'unnamed_addr' )? ( ruleFUNCTION_ATTRIBUTES )* (otherlv_14= 'section ' this_STRING_15= RULE_STRING )? (otherlv_16= 'align' ( (lv_align_17_0= ruleNUMBER ) ) )? ( (lv_body_18_0= ruleFunctionBody ) ) )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1182:2: (otherlv_0= 'define' (this_LINKAGE_1= RULE_LINKAGE | this_ALIAS_LINKAGE_2= RULE_ALIAS_LINKAGE )? (this_VISIBILITY_3= RULE_VISIBILITY )? ( ruleCALLING_CONV )? (this_RETURN_ATTRIBUTES_5= RULE_RETURN_ATTRIBUTES )? ( (lv_returnType_6_0= ruleTypeUse ) ) ( (lv_address_7_0= ruleAddress ) ) (otherlv_8= '()' | (otherlv_9= '(' ( (lv_parameter_10_0= ruleFunctionParameterList ) )? otherlv_11= ')' ) ) (otherlv_12= 'unnamed_addr' )? ( ruleFUNCTION_ATTRIBUTES )* (otherlv_14= 'section ' this_STRING_15= RULE_STRING )? (otherlv_16= 'align' ( (lv_align_17_0= ruleNUMBER ) ) )? ( (lv_body_18_0= ruleFunctionBody ) ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1182:4: otherlv_0= 'define' (this_LINKAGE_1= RULE_LINKAGE | this_ALIAS_LINKAGE_2= RULE_ALIAS_LINKAGE )? (this_VISIBILITY_3= RULE_VISIBILITY )? ( ruleCALLING_CONV )? (this_RETURN_ATTRIBUTES_5= RULE_RETURN_ATTRIBUTES )? ( (lv_returnType_6_0= ruleTypeUse ) ) ( (lv_address_7_0= ruleAddress ) ) (otherlv_8= '()' | (otherlv_9= '(' ( (lv_parameter_10_0= ruleFunctionParameterList ) )? otherlv_11= ')' ) ) (otherlv_12= 'unnamed_addr' )? ( ruleFUNCTION_ATTRIBUTES )* (otherlv_14= 'section ' this_STRING_15= RULE_STRING )? (otherlv_16= 'align' ( (lv_align_17_0= ruleNUMBER ) ) )? ( (lv_body_18_0= ruleFunctionBody ) )
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

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1199:3: ( ruleCALLING_CONV )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( ((LA22_0>=31 && LA22_0<=45)) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1200:5: ruleCALLING_CONV
                            {
                             
                                    newCompositeNode(grammarAccess.getFunctionDefinitionAccess().getCALLING_CONVParserRuleCall_0_3()); 
                                
                            pushFollow(FOLLOW_ruleCALLING_CONV_in_ruleFunctionDefinition3176);
                            ruleCALLING_CONV();

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

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1247:2: (otherlv_8= '()' | (otherlv_9= '(' ( (lv_parameter_10_0= ruleFunctionParameterList ) )? otherlv_11= ')' ) )
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==89) ) {
                        alt25=1;
                    }
                    else if ( (LA25_0==50) ) {
                        alt25=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 25, 0, input);

                        throw nvae;
                    }
                    switch (alt25) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1247:4: otherlv_8= '()'
                            {
                            otherlv_8=(Token)match(input,89,FOLLOW_89_in_ruleFunctionDefinition3245); 

                                	newLeafNode(otherlv_8, grammarAccess.getFunctionDefinitionAccess().getLeftParenthesisRightParenthesisKeyword_0_7_0());
                                

                            }
                            break;
                        case 2 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1252:6: (otherlv_9= '(' ( (lv_parameter_10_0= ruleFunctionParameterList ) )? otherlv_11= ')' )
                            {
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1252:6: (otherlv_9= '(' ( (lv_parameter_10_0= ruleFunctionParameterList ) )? otherlv_11= ')' )
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1252:8: otherlv_9= '(' ( (lv_parameter_10_0= ruleFunctionParameterList ) )? otherlv_11= ')'
                            {
                            otherlv_9=(Token)match(input,50,FOLLOW_50_in_ruleFunctionDefinition3264); 

                                	newLeafNode(otherlv_9, grammarAccess.getFunctionDefinitionAccess().getLeftParenthesisKeyword_0_7_1_0());
                                
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1256:1: ( (lv_parameter_10_0= ruleFunctionParameterList ) )?
                            int alt24=2;
                            int LA24_0 = input.LA(1);

                            if ( (LA24_0==RULE_INT_TYPE||LA24_0==RULE_VALID_ID||(LA24_0>=RULE_PRIMITIVE_VALUE && LA24_0<=RULE_FLOATING_POINT_TYPE)) ) {
                                alt24=1;
                            }
                            switch (alt24) {
                                case 1 :
                                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1257:1: (lv_parameter_10_0= ruleFunctionParameterList )
                                    {
                                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1257:1: (lv_parameter_10_0= ruleFunctionParameterList )
                                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1258:3: lv_parameter_10_0= ruleFunctionParameterList
                                    {
                                     
                                    	        newCompositeNode(grammarAccess.getFunctionDefinitionAccess().getParameterFunctionParameterListParserRuleCall_0_7_1_1_0()); 
                                    	    
                                    pushFollow(FOLLOW_ruleFunctionParameterList_in_ruleFunctionDefinition3285);
                                    lv_parameter_10_0=ruleFunctionParameterList();

                                    state._fsp--;


                                    	        if (current==null) {
                                    	            current = createModelElementForParent(grammarAccess.getFunctionDefinitionRule());
                                    	        }
                                           		set(
                                           			current, 
                                           			"parameter",
                                            		lv_parameter_10_0, 
                                            		"FunctionParameterList");
                                    	        afterParserOrEnumRuleCall();
                                    	    

                                    }


                                    }
                                    break;

                            }

                            otherlv_11=(Token)match(input,51,FOLLOW_51_in_ruleFunctionDefinition3298); 

                                	newLeafNode(otherlv_11, grammarAccess.getFunctionDefinitionAccess().getRightParenthesisKeyword_0_7_1_2());
                                

                            }


                            }
                            break;

                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1278:3: (otherlv_12= 'unnamed_addr' )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==85) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1278:5: otherlv_12= 'unnamed_addr'
                            {
                            otherlv_12=(Token)match(input,85,FOLLOW_85_in_ruleFunctionDefinition3313); 

                                	newLeafNode(otherlv_12, grammarAccess.getFunctionDefinitionAccess().getUnnamed_addrKeyword_0_8());
                                

                            }
                            break;

                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1282:3: ( ruleFUNCTION_ATTRIBUTES )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( ((LA27_0>=48 && LA27_0<=49)||(LA27_0>=52 && LA27_0<=67)) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1283:5: ruleFUNCTION_ATTRIBUTES
                    	    {
                    	     
                    	            newCompositeNode(grammarAccess.getFunctionDefinitionAccess().getFUNCTION_ATTRIBUTESParserRuleCall_0_9()); 
                    	        
                    	    pushFollow(FOLLOW_ruleFUNCTION_ATTRIBUTES_in_ruleFunctionDefinition3332);
                    	    ruleFUNCTION_ATTRIBUTES();

                    	    state._fsp--;

                    	     
                    	            afterParserOrEnumRuleCall();
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop27;
                        }
                    } while (true);

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1290:3: (otherlv_14= 'section ' this_STRING_15= RULE_STRING )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==90) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1290:5: otherlv_14= 'section ' this_STRING_15= RULE_STRING
                            {
                            otherlv_14=(Token)match(input,90,FOLLOW_90_in_ruleFunctionDefinition3346); 

                                	newLeafNode(otherlv_14, grammarAccess.getFunctionDefinitionAccess().getSectionKeyword_0_10_0());
                                
                            this_STRING_15=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionDefinition3357); 
                             
                                newLeafNode(this_STRING_15, grammarAccess.getFunctionDefinitionAccess().getSTRINGTerminalRuleCall_0_10_1()); 
                                

                            }
                            break;

                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1298:3: (otherlv_16= 'align' ( (lv_align_17_0= ruleNUMBER ) ) )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==87) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1298:5: otherlv_16= 'align' ( (lv_align_17_0= ruleNUMBER ) )
                            {
                            otherlv_16=(Token)match(input,87,FOLLOW_87_in_ruleFunctionDefinition3371); 

                                	newLeafNode(otherlv_16, grammarAccess.getFunctionDefinitionAccess().getAlignKeyword_0_11_0());
                                
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1302:1: ( (lv_align_17_0= ruleNUMBER ) )
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1303:1: (lv_align_17_0= ruleNUMBER )
                            {
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1303:1: (lv_align_17_0= ruleNUMBER )
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1304:3: lv_align_17_0= ruleNUMBER
                            {
                             
                            	        newCompositeNode(grammarAccess.getFunctionDefinitionAccess().getAlignNUMBERParserRuleCall_0_11_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleNUMBER_in_ruleFunctionDefinition3392);
                            lv_align_17_0=ruleNUMBER();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getFunctionDefinitionRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"align",
                                    		lv_align_17_0, 
                                    		"NUMBER");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }
                            break;

                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1320:4: ( (lv_body_18_0= ruleFunctionBody ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1321:1: (lv_body_18_0= ruleFunctionBody )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1321:1: (lv_body_18_0= ruleFunctionBody )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1322:3: lv_body_18_0= ruleFunctionBody
                    {
                     
                    	        newCompositeNode(grammarAccess.getFunctionDefinitionAccess().getBodyFunctionBodyParserRuleCall_0_12_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFunctionBody_in_ruleFunctionDefinition3415);
                    lv_body_18_0=ruleFunctionBody();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFunctionDefinitionRule());
                    	        }
                           		set(
                           			current, 
                           			"body",
                            		lv_body_18_0, 
                            		"FunctionBody");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1339:6: (otherlv_19= 'declare' (this_LINKAGE_20= RULE_LINKAGE | this_ALIAS_LINKAGE_21= RULE_ALIAS_LINKAGE )? (this_VISIBILITY_22= RULE_VISIBILITY )? ( ruleCALLING_CONV )? (this_RETURN_ATTRIBUTES_24= RULE_RETURN_ATTRIBUTES )? ( (lv_returnType_25_0= ruleTypeUse ) ) ( (lv_address_26_0= ruleAddress ) ) (otherlv_27= '()' | (otherlv_28= '(' ( (lv_parameter_29_0= ruleFunctionParameterList ) )? otherlv_30= ')' ) ) (otherlv_31= 'unnamed_addr' )? ( ruleFUNCTION_ATTRIBUTES )* (otherlv_33= 'section ' this_STRING_34= RULE_STRING )? (otherlv_35= 'align' ( (lv_align_36_0= ruleNUMBER ) ) )? )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1339:6: (otherlv_19= 'declare' (this_LINKAGE_20= RULE_LINKAGE | this_ALIAS_LINKAGE_21= RULE_ALIAS_LINKAGE )? (this_VISIBILITY_22= RULE_VISIBILITY )? ( ruleCALLING_CONV )? (this_RETURN_ATTRIBUTES_24= RULE_RETURN_ATTRIBUTES )? ( (lv_returnType_25_0= ruleTypeUse ) ) ( (lv_address_26_0= ruleAddress ) ) (otherlv_27= '()' | (otherlv_28= '(' ( (lv_parameter_29_0= ruleFunctionParameterList ) )? otherlv_30= ')' ) ) (otherlv_31= 'unnamed_addr' )? ( ruleFUNCTION_ATTRIBUTES )* (otherlv_33= 'section ' this_STRING_34= RULE_STRING )? (otherlv_35= 'align' ( (lv_align_36_0= ruleNUMBER ) ) )? )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1339:8: otherlv_19= 'declare' (this_LINKAGE_20= RULE_LINKAGE | this_ALIAS_LINKAGE_21= RULE_ALIAS_LINKAGE )? (this_VISIBILITY_22= RULE_VISIBILITY )? ( ruleCALLING_CONV )? (this_RETURN_ATTRIBUTES_24= RULE_RETURN_ATTRIBUTES )? ( (lv_returnType_25_0= ruleTypeUse ) ) ( (lv_address_26_0= ruleAddress ) ) (otherlv_27= '()' | (otherlv_28= '(' ( (lv_parameter_29_0= ruleFunctionParameterList ) )? otherlv_30= ')' ) ) (otherlv_31= 'unnamed_addr' )? ( ruleFUNCTION_ATTRIBUTES )* (otherlv_33= 'section ' this_STRING_34= RULE_STRING )? (otherlv_35= 'align' ( (lv_align_36_0= ruleNUMBER ) ) )?
                    {
                    otherlv_19=(Token)match(input,91,FOLLOW_91_in_ruleFunctionDefinition3435); 

                        	newLeafNode(otherlv_19, grammarAccess.getFunctionDefinitionAccess().getDeclareKeyword_1_0());
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1343:1: (this_LINKAGE_20= RULE_LINKAGE | this_ALIAS_LINKAGE_21= RULE_ALIAS_LINKAGE )?
                    int alt30=3;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==RULE_LINKAGE) ) {
                        alt30=1;
                    }
                    else if ( (LA30_0==RULE_ALIAS_LINKAGE) ) {
                        alt30=2;
                    }
                    switch (alt30) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1343:2: this_LINKAGE_20= RULE_LINKAGE
                            {
                            this_LINKAGE_20=(Token)match(input,RULE_LINKAGE,FOLLOW_RULE_LINKAGE_in_ruleFunctionDefinition3447); 
                             
                                newLeafNode(this_LINKAGE_20, grammarAccess.getFunctionDefinitionAccess().getLINKAGETerminalRuleCall_1_1_0()); 
                                

                            }
                            break;
                        case 2 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1348:6: this_ALIAS_LINKAGE_21= RULE_ALIAS_LINKAGE
                            {
                            this_ALIAS_LINKAGE_21=(Token)match(input,RULE_ALIAS_LINKAGE,FOLLOW_RULE_ALIAS_LINKAGE_in_ruleFunctionDefinition3463); 
                             
                                newLeafNode(this_ALIAS_LINKAGE_21, grammarAccess.getFunctionDefinitionAccess().getALIAS_LINKAGETerminalRuleCall_1_1_1()); 
                                

                            }
                            break;

                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1352:3: (this_VISIBILITY_22= RULE_VISIBILITY )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==RULE_VISIBILITY) ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1352:4: this_VISIBILITY_22= RULE_VISIBILITY
                            {
                            this_VISIBILITY_22=(Token)match(input,RULE_VISIBILITY,FOLLOW_RULE_VISIBILITY_in_ruleFunctionDefinition3476); 
                             
                                newLeafNode(this_VISIBILITY_22, grammarAccess.getFunctionDefinitionAccess().getVISIBILITYTerminalRuleCall_1_2()); 
                                

                            }
                            break;

                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1356:3: ( ruleCALLING_CONV )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( ((LA32_0>=31 && LA32_0<=45)) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1357:5: ruleCALLING_CONV
                            {
                             
                                    newCompositeNode(grammarAccess.getFunctionDefinitionAccess().getCALLING_CONVParserRuleCall_1_3()); 
                                
                            pushFollow(FOLLOW_ruleCALLING_CONV_in_ruleFunctionDefinition3494);
                            ruleCALLING_CONV();

                            state._fsp--;

                             
                                    afterParserOrEnumRuleCall();
                                

                            }
                            break;

                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1364:3: (this_RETURN_ATTRIBUTES_24= RULE_RETURN_ATTRIBUTES )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==RULE_RETURN_ATTRIBUTES) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1364:4: this_RETURN_ATTRIBUTES_24= RULE_RETURN_ATTRIBUTES
                            {
                            this_RETURN_ATTRIBUTES_24=(Token)match(input,RULE_RETURN_ATTRIBUTES,FOLLOW_RULE_RETURN_ATTRIBUTES_in_ruleFunctionDefinition3507); 
                             
                                newLeafNode(this_RETURN_ATTRIBUTES_24, grammarAccess.getFunctionDefinitionAccess().getRETURN_ATTRIBUTESTerminalRuleCall_1_4()); 
                                

                            }
                            break;

                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1368:3: ( (lv_returnType_25_0= ruleTypeUse ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1369:1: (lv_returnType_25_0= ruleTypeUse )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1369:1: (lv_returnType_25_0= ruleTypeUse )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1370:3: lv_returnType_25_0= ruleTypeUse
                    {
                     
                    	        newCompositeNode(grammarAccess.getFunctionDefinitionAccess().getReturnTypeTypeUseParserRuleCall_1_5_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTypeUse_in_ruleFunctionDefinition3529);
                    lv_returnType_25_0=ruleTypeUse();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFunctionDefinitionRule());
                    	        }
                           		set(
                           			current, 
                           			"returnType",
                            		lv_returnType_25_0, 
                            		"TypeUse");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1386:2: ( (lv_address_26_0= ruleAddress ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1387:1: (lv_address_26_0= ruleAddress )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1387:1: (lv_address_26_0= ruleAddress )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1388:3: lv_address_26_0= ruleAddress
                    {
                     
                    	        newCompositeNode(grammarAccess.getFunctionDefinitionAccess().getAddressAddressParserRuleCall_1_6_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAddress_in_ruleFunctionDefinition3550);
                    lv_address_26_0=ruleAddress();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFunctionDefinitionRule());
                    	        }
                           		set(
                           			current, 
                           			"address",
                            		lv_address_26_0, 
                            		"Address");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1404:2: (otherlv_27= '()' | (otherlv_28= '(' ( (lv_parameter_29_0= ruleFunctionParameterList ) )? otherlv_30= ')' ) )
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==89) ) {
                        alt35=1;
                    }
                    else if ( (LA35_0==50) ) {
                        alt35=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 35, 0, input);

                        throw nvae;
                    }
                    switch (alt35) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1404:4: otherlv_27= '()'
                            {
                            otherlv_27=(Token)match(input,89,FOLLOW_89_in_ruleFunctionDefinition3563); 

                                	newLeafNode(otherlv_27, grammarAccess.getFunctionDefinitionAccess().getLeftParenthesisRightParenthesisKeyword_1_7_0());
                                

                            }
                            break;
                        case 2 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1409:6: (otherlv_28= '(' ( (lv_parameter_29_0= ruleFunctionParameterList ) )? otherlv_30= ')' )
                            {
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1409:6: (otherlv_28= '(' ( (lv_parameter_29_0= ruleFunctionParameterList ) )? otherlv_30= ')' )
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1409:8: otherlv_28= '(' ( (lv_parameter_29_0= ruleFunctionParameterList ) )? otherlv_30= ')'
                            {
                            otherlv_28=(Token)match(input,50,FOLLOW_50_in_ruleFunctionDefinition3582); 

                                	newLeafNode(otherlv_28, grammarAccess.getFunctionDefinitionAccess().getLeftParenthesisKeyword_1_7_1_0());
                                
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1413:1: ( (lv_parameter_29_0= ruleFunctionParameterList ) )?
                            int alt34=2;
                            int LA34_0 = input.LA(1);

                            if ( (LA34_0==RULE_INT_TYPE||LA34_0==RULE_VALID_ID||(LA34_0>=RULE_PRIMITIVE_VALUE && LA34_0<=RULE_FLOATING_POINT_TYPE)) ) {
                                alt34=1;
                            }
                            switch (alt34) {
                                case 1 :
                                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1414:1: (lv_parameter_29_0= ruleFunctionParameterList )
                                    {
                                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1414:1: (lv_parameter_29_0= ruleFunctionParameterList )
                                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1415:3: lv_parameter_29_0= ruleFunctionParameterList
                                    {
                                     
                                    	        newCompositeNode(grammarAccess.getFunctionDefinitionAccess().getParameterFunctionParameterListParserRuleCall_1_7_1_1_0()); 
                                    	    
                                    pushFollow(FOLLOW_ruleFunctionParameterList_in_ruleFunctionDefinition3603);
                                    lv_parameter_29_0=ruleFunctionParameterList();

                                    state._fsp--;


                                    	        if (current==null) {
                                    	            current = createModelElementForParent(grammarAccess.getFunctionDefinitionRule());
                                    	        }
                                           		set(
                                           			current, 
                                           			"parameter",
                                            		lv_parameter_29_0, 
                                            		"FunctionParameterList");
                                    	        afterParserOrEnumRuleCall();
                                    	    

                                    }


                                    }
                                    break;

                            }

                            otherlv_30=(Token)match(input,51,FOLLOW_51_in_ruleFunctionDefinition3616); 

                                	newLeafNode(otherlv_30, grammarAccess.getFunctionDefinitionAccess().getRightParenthesisKeyword_1_7_1_2());
                                

                            }


                            }
                            break;

                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1435:3: (otherlv_31= 'unnamed_addr' )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==85) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1435:5: otherlv_31= 'unnamed_addr'
                            {
                            otherlv_31=(Token)match(input,85,FOLLOW_85_in_ruleFunctionDefinition3631); 

                                	newLeafNode(otherlv_31, grammarAccess.getFunctionDefinitionAccess().getUnnamed_addrKeyword_1_8());
                                

                            }
                            break;

                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1439:3: ( ruleFUNCTION_ATTRIBUTES )*
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( ((LA37_0>=48 && LA37_0<=49)||(LA37_0>=52 && LA37_0<=67)) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1440:5: ruleFUNCTION_ATTRIBUTES
                    	    {
                    	     
                    	            newCompositeNode(grammarAccess.getFunctionDefinitionAccess().getFUNCTION_ATTRIBUTESParserRuleCall_1_9()); 
                    	        
                    	    pushFollow(FOLLOW_ruleFUNCTION_ATTRIBUTES_in_ruleFunctionDefinition3650);
                    	    ruleFUNCTION_ATTRIBUTES();

                    	    state._fsp--;

                    	     
                    	            afterParserOrEnumRuleCall();
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop37;
                        }
                    } while (true);

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1447:3: (otherlv_33= 'section ' this_STRING_34= RULE_STRING )?
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==90) ) {
                        alt38=1;
                    }
                    switch (alt38) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1447:5: otherlv_33= 'section ' this_STRING_34= RULE_STRING
                            {
                            otherlv_33=(Token)match(input,90,FOLLOW_90_in_ruleFunctionDefinition3664); 

                                	newLeafNode(otherlv_33, grammarAccess.getFunctionDefinitionAccess().getSectionKeyword_1_10_0());
                                
                            this_STRING_34=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionDefinition3675); 
                             
                                newLeafNode(this_STRING_34, grammarAccess.getFunctionDefinitionAccess().getSTRINGTerminalRuleCall_1_10_1()); 
                                

                            }
                            break;

                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1455:3: (otherlv_35= 'align' ( (lv_align_36_0= ruleNUMBER ) ) )?
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==87) ) {
                        alt39=1;
                    }
                    switch (alt39) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1455:5: otherlv_35= 'align' ( (lv_align_36_0= ruleNUMBER ) )
                            {
                            otherlv_35=(Token)match(input,87,FOLLOW_87_in_ruleFunctionDefinition3689); 

                                	newLeafNode(otherlv_35, grammarAccess.getFunctionDefinitionAccess().getAlignKeyword_1_11_0());
                                
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1459:1: ( (lv_align_36_0= ruleNUMBER ) )
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1460:1: (lv_align_36_0= ruleNUMBER )
                            {
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1460:1: (lv_align_36_0= ruleNUMBER )
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1461:3: lv_align_36_0= ruleNUMBER
                            {
                             
                            	        newCompositeNode(grammarAccess.getFunctionDefinitionAccess().getAlignNUMBERParserRuleCall_1_11_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleNUMBER_in_ruleFunctionDefinition3710);
                            lv_align_36_0=ruleNUMBER();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getFunctionDefinitionRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"align",
                                    		lv_align_36_0, 
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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1485:1: entryRuleAliasDefinition returns [EObject current=null] : iv_ruleAliasDefinition= ruleAliasDefinition EOF ;
    public final EObject entryRuleAliasDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAliasDefinition = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1486:2: (iv_ruleAliasDefinition= ruleAliasDefinition EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1487:2: iv_ruleAliasDefinition= ruleAliasDefinition EOF
            {
             newCompositeNode(grammarAccess.getAliasDefinitionRule()); 
            pushFollow(FOLLOW_ruleAliasDefinition_in_entryRuleAliasDefinition3749);
            iv_ruleAliasDefinition=ruleAliasDefinition();

            state._fsp--;

             current =iv_ruleAliasDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAliasDefinition3759); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1494:1: ruleAliasDefinition returns [EObject current=null] : ( ( (lv_address_0_0= ruleAddress ) ) otherlv_1= '=' otherlv_2= 'alias' (this_ALIAS_LINKAGE_3= RULE_ALIAS_LINKAGE )? (this_VISIBILITY_4= RULE_VISIBILITY )? ( (lv_aliastype_5_0= ruleTypeUse ) ) ( (lv_aliasvalue_6_0= ruleValue ) ) ( (lv_aliasee_7_0= ruleTypeUse ) ) ) ;
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
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1497:28: ( ( ( (lv_address_0_0= ruleAddress ) ) otherlv_1= '=' otherlv_2= 'alias' (this_ALIAS_LINKAGE_3= RULE_ALIAS_LINKAGE )? (this_VISIBILITY_4= RULE_VISIBILITY )? ( (lv_aliastype_5_0= ruleTypeUse ) ) ( (lv_aliasvalue_6_0= ruleValue ) ) ( (lv_aliasee_7_0= ruleTypeUse ) ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1498:1: ( ( (lv_address_0_0= ruleAddress ) ) otherlv_1= '=' otherlv_2= 'alias' (this_ALIAS_LINKAGE_3= RULE_ALIAS_LINKAGE )? (this_VISIBILITY_4= RULE_VISIBILITY )? ( (lv_aliastype_5_0= ruleTypeUse ) ) ( (lv_aliasvalue_6_0= ruleValue ) ) ( (lv_aliasee_7_0= ruleTypeUse ) ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1498:1: ( ( (lv_address_0_0= ruleAddress ) ) otherlv_1= '=' otherlv_2= 'alias' (this_ALIAS_LINKAGE_3= RULE_ALIAS_LINKAGE )? (this_VISIBILITY_4= RULE_VISIBILITY )? ( (lv_aliastype_5_0= ruleTypeUse ) ) ( (lv_aliasvalue_6_0= ruleValue ) ) ( (lv_aliasee_7_0= ruleTypeUse ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1498:2: ( (lv_address_0_0= ruleAddress ) ) otherlv_1= '=' otherlv_2= 'alias' (this_ALIAS_LINKAGE_3= RULE_ALIAS_LINKAGE )? (this_VISIBILITY_4= RULE_VISIBILITY )? ( (lv_aliastype_5_0= ruleTypeUse ) ) ( (lv_aliasvalue_6_0= ruleValue ) ) ( (lv_aliasee_7_0= ruleTypeUse ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1498:2: ( (lv_address_0_0= ruleAddress ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1499:1: (lv_address_0_0= ruleAddress )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1499:1: (lv_address_0_0= ruleAddress )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1500:3: lv_address_0_0= ruleAddress
            {
             
            	        newCompositeNode(grammarAccess.getAliasDefinitionAccess().getAddressAddressParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleAddress_in_ruleAliasDefinition3805);
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

            otherlv_1=(Token)match(input,77,FOLLOW_77_in_ruleAliasDefinition3817); 

                	newLeafNode(otherlv_1, grammarAccess.getAliasDefinitionAccess().getEqualsSignKeyword_1());
                
            otherlv_2=(Token)match(input,92,FOLLOW_92_in_ruleAliasDefinition3829); 

                	newLeafNode(otherlv_2, grammarAccess.getAliasDefinitionAccess().getAliasKeyword_2());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1524:1: (this_ALIAS_LINKAGE_3= RULE_ALIAS_LINKAGE )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==RULE_ALIAS_LINKAGE) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1524:2: this_ALIAS_LINKAGE_3= RULE_ALIAS_LINKAGE
                    {
                    this_ALIAS_LINKAGE_3=(Token)match(input,RULE_ALIAS_LINKAGE,FOLLOW_RULE_ALIAS_LINKAGE_in_ruleAliasDefinition3841); 
                     
                        newLeafNode(this_ALIAS_LINKAGE_3, grammarAccess.getAliasDefinitionAccess().getALIAS_LINKAGETerminalRuleCall_3()); 
                        

                    }
                    break;

            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1528:3: (this_VISIBILITY_4= RULE_VISIBILITY )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==RULE_VISIBILITY) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1528:4: this_VISIBILITY_4= RULE_VISIBILITY
                    {
                    this_VISIBILITY_4=(Token)match(input,RULE_VISIBILITY,FOLLOW_RULE_VISIBILITY_in_ruleAliasDefinition3854); 
                     
                        newLeafNode(this_VISIBILITY_4, grammarAccess.getAliasDefinitionAccess().getVISIBILITYTerminalRuleCall_4()); 
                        

                    }
                    break;

            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1532:3: ( (lv_aliastype_5_0= ruleTypeUse ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1533:1: (lv_aliastype_5_0= ruleTypeUse )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1533:1: (lv_aliastype_5_0= ruleTypeUse )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1534:3: lv_aliastype_5_0= ruleTypeUse
            {
             
            	        newCompositeNode(grammarAccess.getAliasDefinitionAccess().getAliastypeTypeUseParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeUse_in_ruleAliasDefinition3876);
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

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1550:2: ( (lv_aliasvalue_6_0= ruleValue ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1551:1: (lv_aliasvalue_6_0= ruleValue )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1551:1: (lv_aliasvalue_6_0= ruleValue )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1552:3: lv_aliasvalue_6_0= ruleValue
            {
             
            	        newCompositeNode(grammarAccess.getAliasDefinitionAccess().getAliasvalueValueParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleValue_in_ruleAliasDefinition3897);
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

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1568:2: ( (lv_aliasee_7_0= ruleTypeUse ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1569:1: (lv_aliasee_7_0= ruleTypeUse )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1569:1: (lv_aliasee_7_0= ruleTypeUse )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1570:3: lv_aliasee_7_0= ruleTypeUse
            {
             
            	        newCompositeNode(grammarAccess.getAliasDefinitionAccess().getAliaseeTypeUseParserRuleCall_7_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeUse_in_ruleAliasDefinition3918);
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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1594:1: entryRuleTypeUse returns [EObject current=null] : iv_ruleTypeUse= ruleTypeUse EOF ;
    public final EObject entryRuleTypeUse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeUse = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1595:2: (iv_ruleTypeUse= ruleTypeUse EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1596:2: iv_ruleTypeUse= ruleTypeUse EOF
            {
             newCompositeNode(grammarAccess.getTypeUseRule()); 
            pushFollow(FOLLOW_ruleTypeUse_in_entryRuleTypeUse3954);
            iv_ruleTypeUse=ruleTypeUse();

            state._fsp--;

             current =iv_ruleTypeUse; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeUse3964); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1603:1: ruleTypeUse returns [EObject current=null] : ( (this_Predefined_0= rulePredefined | this_AddressUse_1= ruleAddressUse ) ( (lv_functionInput_2_0= RULE_UNKNOWN_TYPE ) )? ) ;
    public final EObject ruleTypeUse() throws RecognitionException {
        EObject current = null;

        Token lv_functionInput_2_0=null;
        EObject this_Predefined_0 = null;

        EObject this_AddressUse_1 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1606:28: ( ( (this_Predefined_0= rulePredefined | this_AddressUse_1= ruleAddressUse ) ( (lv_functionInput_2_0= RULE_UNKNOWN_TYPE ) )? ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1607:1: ( (this_Predefined_0= rulePredefined | this_AddressUse_1= ruleAddressUse ) ( (lv_functionInput_2_0= RULE_UNKNOWN_TYPE ) )? )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1607:1: ( (this_Predefined_0= rulePredefined | this_AddressUse_1= ruleAddressUse ) ( (lv_functionInput_2_0= RULE_UNKNOWN_TYPE ) )? )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1607:2: (this_Predefined_0= rulePredefined | this_AddressUse_1= ruleAddressUse ) ( (lv_functionInput_2_0= RULE_UNKNOWN_TYPE ) )?
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1607:2: (this_Predefined_0= rulePredefined | this_AddressUse_1= ruleAddressUse )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==RULE_INT_TYPE||(LA43_0>=RULE_PRIMITIVE_VALUE && LA43_0<=RULE_FLOATING_POINT_TYPE)) ) {
                alt43=1;
            }
            else if ( (LA43_0==RULE_VALID_ID) ) {
                alt43=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1608:5: this_Predefined_0= rulePredefined
                    {
                     
                            newCompositeNode(grammarAccess.getTypeUseAccess().getPredefinedParserRuleCall_0_0()); 
                        
                    pushFollow(FOLLOW_rulePredefined_in_ruleTypeUse4012);
                    this_Predefined_0=rulePredefined();

                    state._fsp--;

                     
                            current = this_Predefined_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1618:5: this_AddressUse_1= ruleAddressUse
                    {
                     
                            newCompositeNode(grammarAccess.getTypeUseAccess().getAddressUseParserRuleCall_0_1()); 
                        
                    pushFollow(FOLLOW_ruleAddressUse_in_ruleTypeUse4039);
                    this_AddressUse_1=ruleAddressUse();

                    state._fsp--;

                     
                            current = this_AddressUse_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1626:2: ( (lv_functionInput_2_0= RULE_UNKNOWN_TYPE ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_UNKNOWN_TYPE) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1627:1: (lv_functionInput_2_0= RULE_UNKNOWN_TYPE )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1627:1: (lv_functionInput_2_0= RULE_UNKNOWN_TYPE )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1628:3: lv_functionInput_2_0= RULE_UNKNOWN_TYPE
                    {
                    lv_functionInput_2_0=(Token)match(input,RULE_UNKNOWN_TYPE,FOLLOW_RULE_UNKNOWN_TYPE_in_ruleTypeUse4056); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1652:1: entryRuleAddressUse returns [EObject current=null] : iv_ruleAddressUse= ruleAddressUse EOF ;
    public final EObject entryRuleAddressUse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddressUse = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1653:2: (iv_ruleAddressUse= ruleAddressUse EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1654:2: iv_ruleAddressUse= ruleAddressUse EOF
            {
             newCompositeNode(grammarAccess.getAddressUseRule()); 
            pushFollow(FOLLOW_ruleAddressUse_in_entryRuleAddressUse4098);
            iv_ruleAddressUse=ruleAddressUse();

            state._fsp--;

             current =iv_ruleAddressUse; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAddressUse4108); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1661:1: ruleAddressUse returns [EObject current=null] : ( ( (otherlv_0= RULE_VALID_ID ) ) ( (lv_pointer_1_0= RULE_POINTER ) )? ) ;
    public final EObject ruleAddressUse() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_pointer_1_0=null;

         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1664:28: ( ( ( (otherlv_0= RULE_VALID_ID ) ) ( (lv_pointer_1_0= RULE_POINTER ) )? ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1665:1: ( ( (otherlv_0= RULE_VALID_ID ) ) ( (lv_pointer_1_0= RULE_POINTER ) )? )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1665:1: ( ( (otherlv_0= RULE_VALID_ID ) ) ( (lv_pointer_1_0= RULE_POINTER ) )? )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1665:2: ( (otherlv_0= RULE_VALID_ID ) ) ( (lv_pointer_1_0= RULE_POINTER ) )?
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1665:2: ( (otherlv_0= RULE_VALID_ID ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1666:1: (otherlv_0= RULE_VALID_ID )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1666:1: (otherlv_0= RULE_VALID_ID )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1667:3: otherlv_0= RULE_VALID_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAddressUseRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_VALID_ID,FOLLOW_RULE_VALID_ID_in_ruleAddressUse4153); 

            		newLeafNode(otherlv_0, grammarAccess.getAddressUseAccess().getAddressAddressCrossReference_0_0()); 
            	

            }


            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1678:2: ( (lv_pointer_1_0= RULE_POINTER ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==RULE_POINTER) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1679:1: (lv_pointer_1_0= RULE_POINTER )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1679:1: (lv_pointer_1_0= RULE_POINTER )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1680:3: lv_pointer_1_0= RULE_POINTER
                    {
                    lv_pointer_1_0=(Token)match(input,RULE_POINTER,FOLLOW_RULE_POINTER_in_ruleAddressUse4170); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1704:1: entryRuleAddress returns [EObject current=null] : iv_ruleAddress= ruleAddress EOF ;
    public final EObject entryRuleAddress() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddress = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1705:2: (iv_ruleAddress= ruleAddress EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1706:2: iv_ruleAddress= ruleAddress EOF
            {
             newCompositeNode(grammarAccess.getAddressRule()); 
            pushFollow(FOLLOW_ruleAddress_in_entryRuleAddress4212);
            iv_ruleAddress=ruleAddress();

            state._fsp--;

             current =iv_ruleAddress; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAddress4222); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1713:1: ruleAddress returns [EObject current=null] : ( (lv_name_0_0= RULE_VALID_ID ) ) ;
    public final EObject ruleAddress() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1716:28: ( ( (lv_name_0_0= RULE_VALID_ID ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1717:1: ( (lv_name_0_0= RULE_VALID_ID ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1717:1: ( (lv_name_0_0= RULE_VALID_ID ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1718:1: (lv_name_0_0= RULE_VALID_ID )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1718:1: (lv_name_0_0= RULE_VALID_ID )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1719:3: lv_name_0_0= RULE_VALID_ID
            {
            lv_name_0_0=(Token)match(input,RULE_VALID_ID,FOLLOW_RULE_VALID_ID_in_ruleAddress4263); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1743:1: entryRulePredefined returns [EObject current=null] : iv_rulePredefined= rulePredefined EOF ;
    public final EObject entryRulePredefined() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredefined = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1744:2: (iv_rulePredefined= rulePredefined EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1745:2: iv_rulePredefined= rulePredefined EOF
            {
             newCompositeNode(grammarAccess.getPredefinedRule()); 
            pushFollow(FOLLOW_rulePredefined_in_entryRulePredefined4303);
            iv_rulePredefined=rulePredefined();

            state._fsp--;

             current =iv_rulePredefined; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePredefined4313); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1752:1: rulePredefined returns [EObject current=null] : ( ( ( (lv_type_0_1= RULE_PRIMITIVE_VALUE | lv_type_0_2= RULE_INT_TYPE | lv_type_0_3= RULE_FLOATING_POINT_TYPE ) ) ) ( (lv_pointer_1_0= RULE_POINTER ) )? ) ;
    public final EObject rulePredefined() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_1=null;
        Token lv_type_0_2=null;
        Token lv_type_0_3=null;
        Token lv_pointer_1_0=null;

         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1755:28: ( ( ( ( (lv_type_0_1= RULE_PRIMITIVE_VALUE | lv_type_0_2= RULE_INT_TYPE | lv_type_0_3= RULE_FLOATING_POINT_TYPE ) ) ) ( (lv_pointer_1_0= RULE_POINTER ) )? ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1756:1: ( ( ( (lv_type_0_1= RULE_PRIMITIVE_VALUE | lv_type_0_2= RULE_INT_TYPE | lv_type_0_3= RULE_FLOATING_POINT_TYPE ) ) ) ( (lv_pointer_1_0= RULE_POINTER ) )? )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1756:1: ( ( ( (lv_type_0_1= RULE_PRIMITIVE_VALUE | lv_type_0_2= RULE_INT_TYPE | lv_type_0_3= RULE_FLOATING_POINT_TYPE ) ) ) ( (lv_pointer_1_0= RULE_POINTER ) )? )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1756:2: ( ( (lv_type_0_1= RULE_PRIMITIVE_VALUE | lv_type_0_2= RULE_INT_TYPE | lv_type_0_3= RULE_FLOATING_POINT_TYPE ) ) ) ( (lv_pointer_1_0= RULE_POINTER ) )?
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1756:2: ( ( (lv_type_0_1= RULE_PRIMITIVE_VALUE | lv_type_0_2= RULE_INT_TYPE | lv_type_0_3= RULE_FLOATING_POINT_TYPE ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1757:1: ( (lv_type_0_1= RULE_PRIMITIVE_VALUE | lv_type_0_2= RULE_INT_TYPE | lv_type_0_3= RULE_FLOATING_POINT_TYPE ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1757:1: ( (lv_type_0_1= RULE_PRIMITIVE_VALUE | lv_type_0_2= RULE_INT_TYPE | lv_type_0_3= RULE_FLOATING_POINT_TYPE ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1758:1: (lv_type_0_1= RULE_PRIMITIVE_VALUE | lv_type_0_2= RULE_INT_TYPE | lv_type_0_3= RULE_FLOATING_POINT_TYPE )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1758:1: (lv_type_0_1= RULE_PRIMITIVE_VALUE | lv_type_0_2= RULE_INT_TYPE | lv_type_0_3= RULE_FLOATING_POINT_TYPE )
            int alt46=3;
            switch ( input.LA(1) ) {
            case RULE_PRIMITIVE_VALUE:
                {
                alt46=1;
                }
                break;
            case RULE_INT_TYPE:
                {
                alt46=2;
                }
                break;
            case RULE_FLOATING_POINT_TYPE:
                {
                alt46=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }

            switch (alt46) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1759:3: lv_type_0_1= RULE_PRIMITIVE_VALUE
                    {
                    lv_type_0_1=(Token)match(input,RULE_PRIMITIVE_VALUE,FOLLOW_RULE_PRIMITIVE_VALUE_in_rulePredefined4357); 

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
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1774:8: lv_type_0_2= RULE_INT_TYPE
                    {
                    lv_type_0_2=(Token)match(input,RULE_INT_TYPE,FOLLOW_RULE_INT_TYPE_in_rulePredefined4377); 

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
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1789:8: lv_type_0_3= RULE_FLOATING_POINT_TYPE
                    {
                    lv_type_0_3=(Token)match(input,RULE_FLOATING_POINT_TYPE,FOLLOW_RULE_FLOATING_POINT_TYPE_in_rulePredefined4397); 

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

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1807:2: ( (lv_pointer_1_0= RULE_POINTER ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==RULE_POINTER) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1808:1: (lv_pointer_1_0= RULE_POINTER )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1808:1: (lv_pointer_1_0= RULE_POINTER )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1809:3: lv_pointer_1_0= RULE_POINTER
                    {
                    lv_pointer_1_0=(Token)match(input,RULE_POINTER,FOLLOW_RULE_POINTER_in_rulePredefined4422); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1833:1: entryRuleVector returns [EObject current=null] : iv_ruleVector= ruleVector EOF ;
    public final EObject entryRuleVector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVector = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1834:2: (iv_ruleVector= ruleVector EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1835:2: iv_ruleVector= ruleVector EOF
            {
             newCompositeNode(grammarAccess.getVectorRule()); 
            pushFollow(FOLLOW_ruleVector_in_entryRuleVector4464);
            iv_ruleVector=ruleVector();

            state._fsp--;

             current =iv_ruleVector; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVector4474); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1842:1: ruleVector returns [EObject current=null] : (otherlv_0= '<' ( (lv_length_1_0= ruleNUMBER ) ) otherlv_2= 'x' ( (lv_type_3_0= ruleTypeUse ) ) otherlv_4= '>' ) ;
    public final EObject ruleVector() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_length_1_0 = null;

        EObject lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1845:28: ( (otherlv_0= '<' ( (lv_length_1_0= ruleNUMBER ) ) otherlv_2= 'x' ( (lv_type_3_0= ruleTypeUse ) ) otherlv_4= '>' ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1846:1: (otherlv_0= '<' ( (lv_length_1_0= ruleNUMBER ) ) otherlv_2= 'x' ( (lv_type_3_0= ruleTypeUse ) ) otherlv_4= '>' )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1846:1: (otherlv_0= '<' ( (lv_length_1_0= ruleNUMBER ) ) otherlv_2= 'x' ( (lv_type_3_0= ruleTypeUse ) ) otherlv_4= '>' )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1846:3: otherlv_0= '<' ( (lv_length_1_0= ruleNUMBER ) ) otherlv_2= 'x' ( (lv_type_3_0= ruleTypeUse ) ) otherlv_4= '>'
            {
            otherlv_0=(Token)match(input,46,FOLLOW_46_in_ruleVector4511); 

                	newLeafNode(otherlv_0, grammarAccess.getVectorAccess().getLessThanSignKeyword_0());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1850:1: ( (lv_length_1_0= ruleNUMBER ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1851:1: (lv_length_1_0= ruleNUMBER )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1851:1: (lv_length_1_0= ruleNUMBER )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1852:3: lv_length_1_0= ruleNUMBER
            {
             
            	        newCompositeNode(grammarAccess.getVectorAccess().getLengthNUMBERParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleNUMBER_in_ruleVector4532);
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

            otherlv_2=(Token)match(input,93,FOLLOW_93_in_ruleVector4544); 

                	newLeafNode(otherlv_2, grammarAccess.getVectorAccess().getXKeyword_2());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1872:1: ( (lv_type_3_0= ruleTypeUse ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1873:1: (lv_type_3_0= ruleTypeUse )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1873:1: (lv_type_3_0= ruleTypeUse )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1874:3: lv_type_3_0= ruleTypeUse
            {
             
            	        newCompositeNode(grammarAccess.getVectorAccess().getTypeTypeUseParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeUse_in_ruleVector4565);
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

            otherlv_4=(Token)match(input,47,FOLLOW_47_in_ruleVector4577); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1902:1: entryRuleArray returns [EObject current=null] : iv_ruleArray= ruleArray EOF ;
    public final EObject entryRuleArray() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArray = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1903:2: (iv_ruleArray= ruleArray EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1904:2: iv_ruleArray= ruleArray EOF
            {
             newCompositeNode(grammarAccess.getArrayRule()); 
            pushFollow(FOLLOW_ruleArray_in_entryRuleArray4613);
            iv_ruleArray=ruleArray();

            state._fsp--;

             current =iv_ruleArray; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArray4623); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1911:1: ruleArray returns [EObject current=null] : ( () ( (otherlv_1= '[' ( (lv_length_2_0= ruleNUMBER ) ) otherlv_3= 'x' ( ( (lv_type_4_1= ruleTypeUse | lv_type_4_2= ruleAggregate_Type ) ) ) otherlv_5= ']' ) | otherlv_6= '[]' | (otherlv_7= '[' otherlv_8= ']' ) ) (this_POINTER_9= RULE_POINTER )? ) ;
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
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1914:28: ( ( () ( (otherlv_1= '[' ( (lv_length_2_0= ruleNUMBER ) ) otherlv_3= 'x' ( ( (lv_type_4_1= ruleTypeUse | lv_type_4_2= ruleAggregate_Type ) ) ) otherlv_5= ']' ) | otherlv_6= '[]' | (otherlv_7= '[' otherlv_8= ']' ) ) (this_POINTER_9= RULE_POINTER )? ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1915:1: ( () ( (otherlv_1= '[' ( (lv_length_2_0= ruleNUMBER ) ) otherlv_3= 'x' ( ( (lv_type_4_1= ruleTypeUse | lv_type_4_2= ruleAggregate_Type ) ) ) otherlv_5= ']' ) | otherlv_6= '[]' | (otherlv_7= '[' otherlv_8= ']' ) ) (this_POINTER_9= RULE_POINTER )? )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1915:1: ( () ( (otherlv_1= '[' ( (lv_length_2_0= ruleNUMBER ) ) otherlv_3= 'x' ( ( (lv_type_4_1= ruleTypeUse | lv_type_4_2= ruleAggregate_Type ) ) ) otherlv_5= ']' ) | otherlv_6= '[]' | (otherlv_7= '[' otherlv_8= ']' ) ) (this_POINTER_9= RULE_POINTER )? )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1915:2: () ( (otherlv_1= '[' ( (lv_length_2_0= ruleNUMBER ) ) otherlv_3= 'x' ( ( (lv_type_4_1= ruleTypeUse | lv_type_4_2= ruleAggregate_Type ) ) ) otherlv_5= ']' ) | otherlv_6= '[]' | (otherlv_7= '[' otherlv_8= ']' ) ) (this_POINTER_9= RULE_POINTER )?
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1915:2: ()
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1916:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getArrayAccess().getArrayAction_0(),
                        current);
                

            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1921:2: ( (otherlv_1= '[' ( (lv_length_2_0= ruleNUMBER ) ) otherlv_3= 'x' ( ( (lv_type_4_1= ruleTypeUse | lv_type_4_2= ruleAggregate_Type ) ) ) otherlv_5= ']' ) | otherlv_6= '[]' | (otherlv_7= '[' otherlv_8= ']' ) )
            int alt49=3;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==79) ) {
                int LA49_1 = input.LA(2);

                if ( (LA49_1==RULE_INT||LA49_1==29) ) {
                    alt49=1;
                }
                else if ( (LA49_1==81) ) {
                    alt49=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 49, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA49_0==94) ) {
                alt49=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }
            switch (alt49) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1921:3: (otherlv_1= '[' ( (lv_length_2_0= ruleNUMBER ) ) otherlv_3= 'x' ( ( (lv_type_4_1= ruleTypeUse | lv_type_4_2= ruleAggregate_Type ) ) ) otherlv_5= ']' )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1921:3: (otherlv_1= '[' ( (lv_length_2_0= ruleNUMBER ) ) otherlv_3= 'x' ( ( (lv_type_4_1= ruleTypeUse | lv_type_4_2= ruleAggregate_Type ) ) ) otherlv_5= ']' )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1921:5: otherlv_1= '[' ( (lv_length_2_0= ruleNUMBER ) ) otherlv_3= 'x' ( ( (lv_type_4_1= ruleTypeUse | lv_type_4_2= ruleAggregate_Type ) ) ) otherlv_5= ']'
                    {
                    otherlv_1=(Token)match(input,79,FOLLOW_79_in_ruleArray4671); 

                        	newLeafNode(otherlv_1, grammarAccess.getArrayAccess().getLeftSquareBracketKeyword_1_0_0());
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1925:1: ( (lv_length_2_0= ruleNUMBER ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1926:1: (lv_length_2_0= ruleNUMBER )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1926:1: (lv_length_2_0= ruleNUMBER )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1927:3: lv_length_2_0= ruleNUMBER
                    {
                     
                    	        newCompositeNode(grammarAccess.getArrayAccess().getLengthNUMBERParserRuleCall_1_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleNUMBER_in_ruleArray4692);
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

                    otherlv_3=(Token)match(input,93,FOLLOW_93_in_ruleArray4704); 

                        	newLeafNode(otherlv_3, grammarAccess.getArrayAccess().getXKeyword_1_0_2());
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1947:1: ( ( (lv_type_4_1= ruleTypeUse | lv_type_4_2= ruleAggregate_Type ) ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1948:1: ( (lv_type_4_1= ruleTypeUse | lv_type_4_2= ruleAggregate_Type ) )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1948:1: ( (lv_type_4_1= ruleTypeUse | lv_type_4_2= ruleAggregate_Type ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1949:1: (lv_type_4_1= ruleTypeUse | lv_type_4_2= ruleAggregate_Type )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1949:1: (lv_type_4_1= ruleTypeUse | lv_type_4_2= ruleAggregate_Type )
                    int alt48=2;
                    int LA48_0 = input.LA(1);

                    if ( (LA48_0==RULE_INT_TYPE||LA48_0==RULE_VALID_ID||(LA48_0>=RULE_PRIMITIVE_VALUE && LA48_0<=RULE_FLOATING_POINT_TYPE)) ) {
                        alt48=1;
                    }
                    else if ( (LA48_0==46||LA48_0==79||(LA48_0>=94 && LA48_0<=95)) ) {
                        alt48=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 48, 0, input);

                        throw nvae;
                    }
                    switch (alt48) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1950:3: lv_type_4_1= ruleTypeUse
                            {
                             
                            	        newCompositeNode(grammarAccess.getArrayAccess().getTypeTypeUseParserRuleCall_1_0_3_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleTypeUse_in_ruleArray4727);
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
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1965:8: lv_type_4_2= ruleAggregate_Type
                            {
                             
                            	        newCompositeNode(grammarAccess.getArrayAccess().getTypeAggregate_TypeParserRuleCall_1_0_3_0_1()); 
                            	    
                            pushFollow(FOLLOW_ruleAggregate_Type_in_ruleArray4746);
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

                    otherlv_5=(Token)match(input,81,FOLLOW_81_in_ruleArray4761); 

                        	newLeafNode(otherlv_5, grammarAccess.getArrayAccess().getRightSquareBracketKeyword_1_0_4());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1988:7: otherlv_6= '[]'
                    {
                    otherlv_6=(Token)match(input,94,FOLLOW_94_in_ruleArray4780); 

                        	newLeafNode(otherlv_6, grammarAccess.getArrayAccess().getLeftSquareBracketRightSquareBracketKeyword_1_1());
                        

                    }
                    break;
                case 3 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1993:6: (otherlv_7= '[' otherlv_8= ']' )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1993:6: (otherlv_7= '[' otherlv_8= ']' )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1993:8: otherlv_7= '[' otherlv_8= ']'
                    {
                    otherlv_7=(Token)match(input,79,FOLLOW_79_in_ruleArray4799); 

                        	newLeafNode(otherlv_7, grammarAccess.getArrayAccess().getLeftSquareBracketKeyword_1_2_0());
                        
                    otherlv_8=(Token)match(input,81,FOLLOW_81_in_ruleArray4811); 

                        	newLeafNode(otherlv_8, grammarAccess.getArrayAccess().getRightSquareBracketKeyword_1_2_1());
                        

                    }


                    }
                    break;

            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2001:3: (this_POINTER_9= RULE_POINTER )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==RULE_POINTER) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2001:4: this_POINTER_9= RULE_POINTER
                    {
                    this_POINTER_9=(Token)match(input,RULE_POINTER,FOLLOW_RULE_POINTER_in_ruleArray4825); 
                     
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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2013:1: entryRuleAggregate_Type returns [EObject current=null] : iv_ruleAggregate_Type= ruleAggregate_Type EOF ;
    public final EObject entryRuleAggregate_Type() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAggregate_Type = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2014:2: (iv_ruleAggregate_Type= ruleAggregate_Type EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2015:2: iv_ruleAggregate_Type= ruleAggregate_Type EOF
            {
             newCompositeNode(grammarAccess.getAggregate_TypeRule()); 
            pushFollow(FOLLOW_ruleAggregate_Type_in_entryRuleAggregate_Type4862);
            iv_ruleAggregate_Type=ruleAggregate_Type();

            state._fsp--;

             current =iv_ruleAggregate_Type; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAggregate_Type4872); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2022:1: ruleAggregate_Type returns [EObject current=null] : (this_Structure_0= ruleStructure | this_Array_1= ruleArray | this_Vector_2= ruleVector ) ;
    public final EObject ruleAggregate_Type() throws RecognitionException {
        EObject current = null;

        EObject this_Structure_0 = null;

        EObject this_Array_1 = null;

        EObject this_Vector_2 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2025:28: ( (this_Structure_0= ruleStructure | this_Array_1= ruleArray | this_Vector_2= ruleVector ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2026:1: (this_Structure_0= ruleStructure | this_Array_1= ruleArray | this_Vector_2= ruleVector )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2026:1: (this_Structure_0= ruleStructure | this_Array_1= ruleArray | this_Vector_2= ruleVector )
            int alt51=3;
            switch ( input.LA(1) ) {
            case 95:
                {
                alt51=1;
                }
                break;
            case 79:
            case 94:
                {
                alt51=2;
                }
                break;
            case 46:
                {
                alt51=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }

            switch (alt51) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2027:5: this_Structure_0= ruleStructure
                    {
                     
                            newCompositeNode(grammarAccess.getAggregate_TypeAccess().getStructureParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleStructure_in_ruleAggregate_Type4919);
                    this_Structure_0=ruleStructure();

                    state._fsp--;

                     
                            current = this_Structure_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2037:5: this_Array_1= ruleArray
                    {
                     
                            newCompositeNode(grammarAccess.getAggregate_TypeAccess().getArrayParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleArray_in_ruleAggregate_Type4946);
                    this_Array_1=ruleArray();

                    state._fsp--;

                     
                            current = this_Array_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2047:5: this_Vector_2= ruleVector
                    {
                     
                            newCompositeNode(grammarAccess.getAggregate_TypeAccess().getVectorParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleVector_in_ruleAggregate_Type4973);
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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2063:1: entryRuleConstant returns [EObject current=null] : iv_ruleConstant= ruleConstant EOF ;
    public final EObject entryRuleConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstant = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2064:2: (iv_ruleConstant= ruleConstant EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2065:2: iv_ruleConstant= ruleConstant EOF
            {
             newCompositeNode(grammarAccess.getConstantRule()); 
            pushFollow(FOLLOW_ruleConstant_in_entryRuleConstant5008);
            iv_ruleConstant=ruleConstant();

            state._fsp--;

             current =iv_ruleConstant; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstant5018); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2072:1: ruleConstant returns [EObject current=null] : ( (lv_value_0_0= ruleNUMBER ) ) ;
    public final EObject ruleConstant() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2075:28: ( ( (lv_value_0_0= ruleNUMBER ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2076:1: ( (lv_value_0_0= ruleNUMBER ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2076:1: ( (lv_value_0_0= ruleNUMBER ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2077:1: (lv_value_0_0= ruleNUMBER )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2077:1: (lv_value_0_0= ruleNUMBER )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2078:3: lv_value_0_0= ruleNUMBER
            {
             
            	        newCompositeNode(grammarAccess.getConstantAccess().getValueNUMBERParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleNUMBER_in_ruleConstant5063);
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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2102:1: entryRulePrimitiveValue returns [EObject current=null] : iv_rulePrimitiveValue= rulePrimitiveValue EOF ;
    public final EObject entryRulePrimitiveValue() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveValue = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2103:2: (iv_rulePrimitiveValue= rulePrimitiveValue EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2104:2: iv_rulePrimitiveValue= rulePrimitiveValue EOF
            {
             newCompositeNode(grammarAccess.getPrimitiveValueRule()); 
            pushFollow(FOLLOW_rulePrimitiveValue_in_entryRulePrimitiveValue5098);
            iv_rulePrimitiveValue=rulePrimitiveValue();

            state._fsp--;

             current =iv_rulePrimitiveValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitiveValue5108); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2111:1: rulePrimitiveValue returns [EObject current=null] : ( ( (lv_value_0_1= RULE_STRING | lv_value_0_2= RULE_PRIMITIVE_VALUE | lv_value_0_3= RULE_INITIALIZER | lv_value_0_4= RULE_BOOL ) ) ) ;
    public final EObject rulePrimitiveValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_1=null;
        Token lv_value_0_2=null;
        Token lv_value_0_3=null;
        Token lv_value_0_4=null;

         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2114:28: ( ( ( (lv_value_0_1= RULE_STRING | lv_value_0_2= RULE_PRIMITIVE_VALUE | lv_value_0_3= RULE_INITIALIZER | lv_value_0_4= RULE_BOOL ) ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2115:1: ( ( (lv_value_0_1= RULE_STRING | lv_value_0_2= RULE_PRIMITIVE_VALUE | lv_value_0_3= RULE_INITIALIZER | lv_value_0_4= RULE_BOOL ) ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2115:1: ( ( (lv_value_0_1= RULE_STRING | lv_value_0_2= RULE_PRIMITIVE_VALUE | lv_value_0_3= RULE_INITIALIZER | lv_value_0_4= RULE_BOOL ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2116:1: ( (lv_value_0_1= RULE_STRING | lv_value_0_2= RULE_PRIMITIVE_VALUE | lv_value_0_3= RULE_INITIALIZER | lv_value_0_4= RULE_BOOL ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2116:1: ( (lv_value_0_1= RULE_STRING | lv_value_0_2= RULE_PRIMITIVE_VALUE | lv_value_0_3= RULE_INITIALIZER | lv_value_0_4= RULE_BOOL ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2117:1: (lv_value_0_1= RULE_STRING | lv_value_0_2= RULE_PRIMITIVE_VALUE | lv_value_0_3= RULE_INITIALIZER | lv_value_0_4= RULE_BOOL )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2117:1: (lv_value_0_1= RULE_STRING | lv_value_0_2= RULE_PRIMITIVE_VALUE | lv_value_0_3= RULE_INITIALIZER | lv_value_0_4= RULE_BOOL )
            int alt52=4;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt52=1;
                }
                break;
            case RULE_PRIMITIVE_VALUE:
                {
                alt52=2;
                }
                break;
            case RULE_INITIALIZER:
                {
                alt52=3;
                }
                break;
            case RULE_BOOL:
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
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2118:3: lv_value_0_1= RULE_STRING
                    {
                    lv_value_0_1=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePrimitiveValue5151); 

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
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2133:8: lv_value_0_2= RULE_PRIMITIVE_VALUE
                    {
                    lv_value_0_2=(Token)match(input,RULE_PRIMITIVE_VALUE,FOLLOW_RULE_PRIMITIVE_VALUE_in_rulePrimitiveValue5171); 

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
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2148:8: lv_value_0_3= RULE_INITIALIZER
                    {
                    lv_value_0_3=(Token)match(input,RULE_INITIALIZER,FOLLOW_RULE_INITIALIZER_in_rulePrimitiveValue5191); 

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
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2163:8: lv_value_0_4= RULE_BOOL
                    {
                    lv_value_0_4=(Token)match(input,RULE_BOOL,FOLLOW_RULE_BOOL_in_rulePrimitiveValue5211); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2189:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2190:2: (iv_ruleValue= ruleValue EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2191:2: iv_ruleValue= ruleValue EOF
            {
             newCompositeNode(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue5254);
            iv_ruleValue=ruleValue();

            state._fsp--;

             current =iv_ruleValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue5264); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2198:1: ruleValue returns [EObject current=null] : (this_NestedCast_0= ruleNestedCast | this_NestedGetElementPtr_1= ruleNestedGetElementPtr | this_Constant_2= ruleConstant | this_AddressUse_3= ruleAddressUse | this_PrimitiveValue_4= rulePrimitiveValue | this_ValueStruct_5= ruleValueStruct ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        EObject this_NestedCast_0 = null;

        EObject this_NestedGetElementPtr_1 = null;

        EObject this_Constant_2 = null;

        EObject this_AddressUse_3 = null;

        EObject this_PrimitiveValue_4 = null;

        EObject this_ValueStruct_5 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2201:28: ( (this_NestedCast_0= ruleNestedCast | this_NestedGetElementPtr_1= ruleNestedGetElementPtr | this_Constant_2= ruleConstant | this_AddressUse_3= ruleAddressUse | this_PrimitiveValue_4= rulePrimitiveValue | this_ValueStruct_5= ruleValueStruct ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2202:1: (this_NestedCast_0= ruleNestedCast | this_NestedGetElementPtr_1= ruleNestedGetElementPtr | this_Constant_2= ruleConstant | this_AddressUse_3= ruleAddressUse | this_PrimitiveValue_4= rulePrimitiveValue | this_ValueStruct_5= ruleValueStruct )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2202:1: (this_NestedCast_0= ruleNestedCast | this_NestedGetElementPtr_1= ruleNestedGetElementPtr | this_Constant_2= ruleConstant | this_AddressUse_3= ruleAddressUse | this_PrimitiveValue_4= rulePrimitiveValue | this_ValueStruct_5= ruleValueStruct )
            int alt53=6;
            switch ( input.LA(1) ) {
            case RULE_CAST_OP:
                {
                alt53=1;
                }
                break;
            case 122:
                {
                alt53=2;
                }
                break;
            case RULE_INT:
            case 29:
                {
                alt53=3;
                }
                break;
            case RULE_VALID_ID:
                {
                alt53=4;
                }
                break;
            case RULE_BOOL:
            case RULE_STRING:
            case RULE_PRIMITIVE_VALUE:
            case RULE_INITIALIZER:
                {
                alt53=5;
                }
                break;
            case 95:
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
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2203:5: this_NestedCast_0= ruleNestedCast
                    {
                     
                            newCompositeNode(grammarAccess.getValueAccess().getNestedCastParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleNestedCast_in_ruleValue5311);
                    this_NestedCast_0=ruleNestedCast();

                    state._fsp--;

                     
                            current = this_NestedCast_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2213:5: this_NestedGetElementPtr_1= ruleNestedGetElementPtr
                    {
                     
                            newCompositeNode(grammarAccess.getValueAccess().getNestedGetElementPtrParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleNestedGetElementPtr_in_ruleValue5338);
                    this_NestedGetElementPtr_1=ruleNestedGetElementPtr();

                    state._fsp--;

                     
                            current = this_NestedGetElementPtr_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2223:5: this_Constant_2= ruleConstant
                    {
                     
                            newCompositeNode(grammarAccess.getValueAccess().getConstantParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleConstant_in_ruleValue5365);
                    this_Constant_2=ruleConstant();

                    state._fsp--;

                     
                            current = this_Constant_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2233:5: this_AddressUse_3= ruleAddressUse
                    {
                     
                            newCompositeNode(grammarAccess.getValueAccess().getAddressUseParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleAddressUse_in_ruleValue5392);
                    this_AddressUse_3=ruleAddressUse();

                    state._fsp--;

                     
                            current = this_AddressUse_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2243:5: this_PrimitiveValue_4= rulePrimitiveValue
                    {
                     
                            newCompositeNode(grammarAccess.getValueAccess().getPrimitiveValueParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_rulePrimitiveValue_in_ruleValue5419);
                    this_PrimitiveValue_4=rulePrimitiveValue();

                    state._fsp--;

                     
                            current = this_PrimitiveValue_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2253:5: this_ValueStruct_5= ruleValueStruct
                    {
                     
                            newCompositeNode(grammarAccess.getValueAccess().getValueStructParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleValueStruct_in_ruleValue5446);
                    this_ValueStruct_5=ruleValueStruct();

                    state._fsp--;

                     
                            current = this_ValueStruct_5; 
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


    // $ANTLR start "entryRuleValueStruct"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2269:1: entryRuleValueStruct returns [EObject current=null] : iv_ruleValueStruct= ruleValueStruct EOF ;
    public final EObject entryRuleValueStruct() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValueStruct = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2270:2: (iv_ruleValueStruct= ruleValueStruct EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2271:2: iv_ruleValueStruct= ruleValueStruct EOF
            {
             newCompositeNode(grammarAccess.getValueStructRule()); 
            pushFollow(FOLLOW_ruleValueStruct_in_entryRuleValueStruct5481);
            iv_ruleValueStruct=ruleValueStruct();

            state._fsp--;

             current =iv_ruleValueStruct; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValueStruct5491); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValueStruct"


    // $ANTLR start "ruleValueStruct"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2278:1: ruleValueStruct returns [EObject current=null] : (otherlv_0= '{' ( (lv_values_1_0= ruleParameter ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleParameter ) ) )* otherlv_4= '}' ) ;
    public final EObject ruleValueStruct() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_values_1_0 = null;

        EObject lv_values_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2281:28: ( (otherlv_0= '{' ( (lv_values_1_0= ruleParameter ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleParameter ) ) )* otherlv_4= '}' ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2282:1: (otherlv_0= '{' ( (lv_values_1_0= ruleParameter ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleParameter ) ) )* otherlv_4= '}' )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2282:1: (otherlv_0= '{' ( (lv_values_1_0= ruleParameter ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleParameter ) ) )* otherlv_4= '}' )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2282:3: otherlv_0= '{' ( (lv_values_1_0= ruleParameter ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleParameter ) ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,95,FOLLOW_95_in_ruleValueStruct5528); 

                	newLeafNode(otherlv_0, grammarAccess.getValueStructAccess().getLeftCurlyBracketKeyword_0());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2286:1: ( (lv_values_1_0= ruleParameter ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2287:1: (lv_values_1_0= ruleParameter )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2287:1: (lv_values_1_0= ruleParameter )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2288:3: lv_values_1_0= ruleParameter
            {
             
            	        newCompositeNode(grammarAccess.getValueStructAccess().getValuesParameterParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleParameter_in_ruleValueStruct5549);
            lv_values_1_0=ruleParameter();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getValueStructRule());
            	        }
                   		add(
                   			current, 
                   			"values",
                    		lv_values_1_0, 
                    		"Parameter");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2304:2: (otherlv_2= ',' ( (lv_values_3_0= ruleParameter ) ) )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==80) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2304:4: otherlv_2= ',' ( (lv_values_3_0= ruleParameter ) )
            	    {
            	    otherlv_2=(Token)match(input,80,FOLLOW_80_in_ruleValueStruct5562); 

            	        	newLeafNode(otherlv_2, grammarAccess.getValueStructAccess().getCommaKeyword_2_0());
            	        
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2308:1: ( (lv_values_3_0= ruleParameter ) )
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2309:1: (lv_values_3_0= ruleParameter )
            	    {
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2309:1: (lv_values_3_0= ruleParameter )
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2310:3: lv_values_3_0= ruleParameter
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getValueStructAccess().getValuesParameterParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleParameter_in_ruleValueStruct5583);
            	    lv_values_3_0=ruleParameter();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getValueStructRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"values",
            	            		lv_values_3_0, 
            	            		"Parameter");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop54;
                }
            } while (true);

            otherlv_4=(Token)match(input,96,FOLLOW_96_in_ruleValueStruct5597); 

                	newLeafNode(otherlv_4, grammarAccess.getValueStructAccess().getRightCurlyBracketKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValueStruct"


    // $ANTLR start "entryRuleStructure"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2338:1: entryRuleStructure returns [EObject current=null] : iv_ruleStructure= ruleStructure EOF ;
    public final EObject entryRuleStructure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStructure = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2339:2: (iv_ruleStructure= ruleStructure EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2340:2: iv_ruleStructure= ruleStructure EOF
            {
             newCompositeNode(grammarAccess.getStructureRule()); 
            pushFollow(FOLLOW_ruleStructure_in_entryRuleStructure5633);
            iv_ruleStructure=ruleStructure();

            state._fsp--;

             current =iv_ruleStructure; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStructure5643); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2347:1: ruleStructure returns [EObject current=null] : ( () otherlv_1= '{' ( ( ( (lv_types_2_1= ruleTypeUse | lv_types_2_2= ruleAggregate_Type ) ) ) (otherlv_3= ',' ( ( (lv_types_4_1= ruleTypeUse | lv_types_4_2= ruleAggregate_Type ) ) ) )* )? otherlv_5= '}' (this_POINTER_6= RULE_POINTER )? ) ;
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
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2350:28: ( ( () otherlv_1= '{' ( ( ( (lv_types_2_1= ruleTypeUse | lv_types_2_2= ruleAggregate_Type ) ) ) (otherlv_3= ',' ( ( (lv_types_4_1= ruleTypeUse | lv_types_4_2= ruleAggregate_Type ) ) ) )* )? otherlv_5= '}' (this_POINTER_6= RULE_POINTER )? ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2351:1: ( () otherlv_1= '{' ( ( ( (lv_types_2_1= ruleTypeUse | lv_types_2_2= ruleAggregate_Type ) ) ) (otherlv_3= ',' ( ( (lv_types_4_1= ruleTypeUse | lv_types_4_2= ruleAggregate_Type ) ) ) )* )? otherlv_5= '}' (this_POINTER_6= RULE_POINTER )? )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2351:1: ( () otherlv_1= '{' ( ( ( (lv_types_2_1= ruleTypeUse | lv_types_2_2= ruleAggregate_Type ) ) ) (otherlv_3= ',' ( ( (lv_types_4_1= ruleTypeUse | lv_types_4_2= ruleAggregate_Type ) ) ) )* )? otherlv_5= '}' (this_POINTER_6= RULE_POINTER )? )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2351:2: () otherlv_1= '{' ( ( ( (lv_types_2_1= ruleTypeUse | lv_types_2_2= ruleAggregate_Type ) ) ) (otherlv_3= ',' ( ( (lv_types_4_1= ruleTypeUse | lv_types_4_2= ruleAggregate_Type ) ) ) )* )? otherlv_5= '}' (this_POINTER_6= RULE_POINTER )?
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2351:2: ()
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2352:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getStructureAccess().getStructureAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,95,FOLLOW_95_in_ruleStructure5689); 

                	newLeafNode(otherlv_1, grammarAccess.getStructureAccess().getLeftCurlyBracketKeyword_1());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2361:1: ( ( ( (lv_types_2_1= ruleTypeUse | lv_types_2_2= ruleAggregate_Type ) ) ) (otherlv_3= ',' ( ( (lv_types_4_1= ruleTypeUse | lv_types_4_2= ruleAggregate_Type ) ) ) )* )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==RULE_INT_TYPE||LA58_0==RULE_VALID_ID||(LA58_0>=RULE_PRIMITIVE_VALUE && LA58_0<=RULE_FLOATING_POINT_TYPE)||LA58_0==46||LA58_0==79||(LA58_0>=94 && LA58_0<=95)) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2361:2: ( ( (lv_types_2_1= ruleTypeUse | lv_types_2_2= ruleAggregate_Type ) ) ) (otherlv_3= ',' ( ( (lv_types_4_1= ruleTypeUse | lv_types_4_2= ruleAggregate_Type ) ) ) )*
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2361:2: ( ( (lv_types_2_1= ruleTypeUse | lv_types_2_2= ruleAggregate_Type ) ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2362:1: ( (lv_types_2_1= ruleTypeUse | lv_types_2_2= ruleAggregate_Type ) )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2362:1: ( (lv_types_2_1= ruleTypeUse | lv_types_2_2= ruleAggregate_Type ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2363:1: (lv_types_2_1= ruleTypeUse | lv_types_2_2= ruleAggregate_Type )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2363:1: (lv_types_2_1= ruleTypeUse | lv_types_2_2= ruleAggregate_Type )
                    int alt55=2;
                    int LA55_0 = input.LA(1);

                    if ( (LA55_0==RULE_INT_TYPE||LA55_0==RULE_VALID_ID||(LA55_0>=RULE_PRIMITIVE_VALUE && LA55_0<=RULE_FLOATING_POINT_TYPE)) ) {
                        alt55=1;
                    }
                    else if ( (LA55_0==46||LA55_0==79||(LA55_0>=94 && LA55_0<=95)) ) {
                        alt55=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 55, 0, input);

                        throw nvae;
                    }
                    switch (alt55) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2364:3: lv_types_2_1= ruleTypeUse
                            {
                             
                            	        newCompositeNode(grammarAccess.getStructureAccess().getTypesTypeUseParserRuleCall_2_0_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleTypeUse_in_ruleStructure5713);
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
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2379:8: lv_types_2_2= ruleAggregate_Type
                            {
                             
                            	        newCompositeNode(grammarAccess.getStructureAccess().getTypesAggregate_TypeParserRuleCall_2_0_0_1()); 
                            	    
                            pushFollow(FOLLOW_ruleAggregate_Type_in_ruleStructure5732);
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

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2397:2: (otherlv_3= ',' ( ( (lv_types_4_1= ruleTypeUse | lv_types_4_2= ruleAggregate_Type ) ) ) )*
                    loop57:
                    do {
                        int alt57=2;
                        int LA57_0 = input.LA(1);

                        if ( (LA57_0==80) ) {
                            alt57=1;
                        }


                        switch (alt57) {
                    	case 1 :
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2397:4: otherlv_3= ',' ( ( (lv_types_4_1= ruleTypeUse | lv_types_4_2= ruleAggregate_Type ) ) )
                    	    {
                    	    otherlv_3=(Token)match(input,80,FOLLOW_80_in_ruleStructure5748); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getStructureAccess().getCommaKeyword_2_1_0());
                    	        
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2401:1: ( ( (lv_types_4_1= ruleTypeUse | lv_types_4_2= ruleAggregate_Type ) ) )
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2402:1: ( (lv_types_4_1= ruleTypeUse | lv_types_4_2= ruleAggregate_Type ) )
                    	    {
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2402:1: ( (lv_types_4_1= ruleTypeUse | lv_types_4_2= ruleAggregate_Type ) )
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2403:1: (lv_types_4_1= ruleTypeUse | lv_types_4_2= ruleAggregate_Type )
                    	    {
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2403:1: (lv_types_4_1= ruleTypeUse | lv_types_4_2= ruleAggregate_Type )
                    	    int alt56=2;
                    	    int LA56_0 = input.LA(1);

                    	    if ( (LA56_0==RULE_INT_TYPE||LA56_0==RULE_VALID_ID||(LA56_0>=RULE_PRIMITIVE_VALUE && LA56_0<=RULE_FLOATING_POINT_TYPE)) ) {
                    	        alt56=1;
                    	    }
                    	    else if ( (LA56_0==46||LA56_0==79||(LA56_0>=94 && LA56_0<=95)) ) {
                    	        alt56=2;
                    	    }
                    	    else {
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 56, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt56) {
                    	        case 1 :
                    	            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2404:3: lv_types_4_1= ruleTypeUse
                    	            {
                    	             
                    	            	        newCompositeNode(grammarAccess.getStructureAccess().getTypesTypeUseParserRuleCall_2_1_1_0_0()); 
                    	            	    
                    	            pushFollow(FOLLOW_ruleTypeUse_in_ruleStructure5771);
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
                    	            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2419:8: lv_types_4_2= ruleAggregate_Type
                    	            {
                    	             
                    	            	        newCompositeNode(grammarAccess.getStructureAccess().getTypesAggregate_TypeParserRuleCall_2_1_1_0_1()); 
                    	            	    
                    	            pushFollow(FOLLOW_ruleAggregate_Type_in_ruleStructure5790);
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
                    	    break loop57;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,96,FOLLOW_96_in_ruleStructure5809); 

                	newLeafNode(otherlv_5, grammarAccess.getStructureAccess().getRightCurlyBracketKeyword_3());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2441:1: (this_POINTER_6= RULE_POINTER )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==RULE_POINTER) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2441:2: this_POINTER_6= RULE_POINTER
                    {
                    this_POINTER_6=(Token)match(input,RULE_POINTER,FOLLOW_RULE_POINTER_in_ruleStructure5821); 
                     
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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2453:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2454:2: (iv_ruleParameter= ruleParameter EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2455:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter5858);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter5868); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2462:1: ruleParameter returns [EObject current=null] : ( ( ( (lv_type_0_1= ruleTypeUse | lv_type_0_2= ruleAggregate_Type ) ) ) ( ( (this_RETURN_ATTRIBUTES_1= RULE_RETURN_ATTRIBUTES )+ ( (lv_value_2_0= ruleValue ) ) ) | ( ( (lv_value_3_0= ruleValue ) )? (this_RETURN_ATTRIBUTES_4= RULE_RETURN_ATTRIBUTES )* ) ) ) ;
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
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2465:28: ( ( ( ( (lv_type_0_1= ruleTypeUse | lv_type_0_2= ruleAggregate_Type ) ) ) ( ( (this_RETURN_ATTRIBUTES_1= RULE_RETURN_ATTRIBUTES )+ ( (lv_value_2_0= ruleValue ) ) ) | ( ( (lv_value_3_0= ruleValue ) )? (this_RETURN_ATTRIBUTES_4= RULE_RETURN_ATTRIBUTES )* ) ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2466:1: ( ( ( (lv_type_0_1= ruleTypeUse | lv_type_0_2= ruleAggregate_Type ) ) ) ( ( (this_RETURN_ATTRIBUTES_1= RULE_RETURN_ATTRIBUTES )+ ( (lv_value_2_0= ruleValue ) ) ) | ( ( (lv_value_3_0= ruleValue ) )? (this_RETURN_ATTRIBUTES_4= RULE_RETURN_ATTRIBUTES )* ) ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2466:1: ( ( ( (lv_type_0_1= ruleTypeUse | lv_type_0_2= ruleAggregate_Type ) ) ) ( ( (this_RETURN_ATTRIBUTES_1= RULE_RETURN_ATTRIBUTES )+ ( (lv_value_2_0= ruleValue ) ) ) | ( ( (lv_value_3_0= ruleValue ) )? (this_RETURN_ATTRIBUTES_4= RULE_RETURN_ATTRIBUTES )* ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2466:2: ( ( (lv_type_0_1= ruleTypeUse | lv_type_0_2= ruleAggregate_Type ) ) ) ( ( (this_RETURN_ATTRIBUTES_1= RULE_RETURN_ATTRIBUTES )+ ( (lv_value_2_0= ruleValue ) ) ) | ( ( (lv_value_3_0= ruleValue ) )? (this_RETURN_ATTRIBUTES_4= RULE_RETURN_ATTRIBUTES )* ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2466:2: ( ( (lv_type_0_1= ruleTypeUse | lv_type_0_2= ruleAggregate_Type ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2467:1: ( (lv_type_0_1= ruleTypeUse | lv_type_0_2= ruleAggregate_Type ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2467:1: ( (lv_type_0_1= ruleTypeUse | lv_type_0_2= ruleAggregate_Type ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2468:1: (lv_type_0_1= ruleTypeUse | lv_type_0_2= ruleAggregate_Type )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2468:1: (lv_type_0_1= ruleTypeUse | lv_type_0_2= ruleAggregate_Type )
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==RULE_INT_TYPE||LA60_0==RULE_VALID_ID||(LA60_0>=RULE_PRIMITIVE_VALUE && LA60_0<=RULE_FLOATING_POINT_TYPE)) ) {
                alt60=1;
            }
            else if ( (LA60_0==46||LA60_0==79||(LA60_0>=94 && LA60_0<=95)) ) {
                alt60=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }
            switch (alt60) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2469:3: lv_type_0_1= ruleTypeUse
                    {
                     
                    	        newCompositeNode(grammarAccess.getParameterAccess().getTypeTypeUseParserRuleCall_0_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTypeUse_in_ruleParameter5916);
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
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2484:8: lv_type_0_2= ruleAggregate_Type
                    {
                     
                    	        newCompositeNode(grammarAccess.getParameterAccess().getTypeAggregate_TypeParserRuleCall_0_0_1()); 
                    	    
                    pushFollow(FOLLOW_ruleAggregate_Type_in_ruleParameter5935);
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

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2502:2: ( ( (this_RETURN_ATTRIBUTES_1= RULE_RETURN_ATTRIBUTES )+ ( (lv_value_2_0= ruleValue ) ) ) | ( ( (lv_value_3_0= ruleValue ) )? (this_RETURN_ATTRIBUTES_4= RULE_RETURN_ATTRIBUTES )* ) )
            int alt64=2;
            alt64 = dfa64.predict(input);
            switch (alt64) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2502:3: ( (this_RETURN_ATTRIBUTES_1= RULE_RETURN_ATTRIBUTES )+ ( (lv_value_2_0= ruleValue ) ) )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2502:3: ( (this_RETURN_ATTRIBUTES_1= RULE_RETURN_ATTRIBUTES )+ ( (lv_value_2_0= ruleValue ) ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2502:4: (this_RETURN_ATTRIBUTES_1= RULE_RETURN_ATTRIBUTES )+ ( (lv_value_2_0= ruleValue ) )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2502:4: (this_RETURN_ATTRIBUTES_1= RULE_RETURN_ATTRIBUTES )+
                    int cnt61=0;
                    loop61:
                    do {
                        int alt61=2;
                        int LA61_0 = input.LA(1);

                        if ( (LA61_0==RULE_RETURN_ATTRIBUTES) ) {
                            alt61=1;
                        }


                        switch (alt61) {
                    	case 1 :
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2502:5: this_RETURN_ATTRIBUTES_1= RULE_RETURN_ATTRIBUTES
                    	    {
                    	    this_RETURN_ATTRIBUTES_1=(Token)match(input,RULE_RETURN_ATTRIBUTES,FOLLOW_RULE_RETURN_ATTRIBUTES_in_ruleParameter5952); 
                    	     
                    	        newLeafNode(this_RETURN_ATTRIBUTES_1, grammarAccess.getParameterAccess().getRETURN_ATTRIBUTESTerminalRuleCall_1_0_0()); 
                    	        

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt61 >= 1 ) break loop61;
                                EarlyExitException eee =
                                    new EarlyExitException(61, input);
                                throw eee;
                        }
                        cnt61++;
                    } while (true);

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2506:3: ( (lv_value_2_0= ruleValue ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2507:1: (lv_value_2_0= ruleValue )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2507:1: (lv_value_2_0= ruleValue )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2508:3: lv_value_2_0= ruleValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getParameterAccess().getValueValueParserRuleCall_1_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleValue_in_ruleParameter5974);
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
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2525:6: ( ( (lv_value_3_0= ruleValue ) )? (this_RETURN_ATTRIBUTES_4= RULE_RETURN_ATTRIBUTES )* )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2525:6: ( ( (lv_value_3_0= ruleValue ) )? (this_RETURN_ATTRIBUTES_4= RULE_RETURN_ATTRIBUTES )* )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2525:7: ( (lv_value_3_0= ruleValue ) )? (this_RETURN_ATTRIBUTES_4= RULE_RETURN_ATTRIBUTES )*
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2525:7: ( (lv_value_3_0= ruleValue ) )?
                    int alt62=2;
                    switch ( input.LA(1) ) {
                        case RULE_CAST_OP:
                            {
                            int LA62_1 = input.LA(2);

                            if ( (LA62_1==50) ) {
                                alt62=1;
                            }
                            }
                            break;
                        case RULE_INT:
                        case RULE_STRING:
                        case RULE_PRIMITIVE_VALUE:
                        case RULE_INITIALIZER:
                        case 29:
                        case 95:
                        case 122:
                            {
                            alt62=1;
                            }
                            break;
                        case RULE_VALID_ID:
                            {
                            int LA62_3 = input.LA(2);

                            if ( (LA62_3==EOF||(LA62_3>=RULE_ALIAS_LINKAGE && LA62_3<=RULE_SL_COMMENT)||(LA62_3>=RULE_VALID_ID && LA62_3<=RULE_POINTER)||LA62_3==RULE_METADATA||(LA62_3>=50 && LA62_3<=51)||(LA62_3>=68 && LA62_3<=72)||LA62_3==74||LA62_3==78||LA62_3==80||(LA62_3>=88 && LA62_3<=89)||LA62_3==91||LA62_3==96||(LA62_3>=124 && LA62_3<=125)||LA62_3==127||(LA62_3>=131 && LA62_3<=133)||LA62_3==150||(LA62_3>=153 && LA62_3<=154)||LA62_3==156) ) {
                                alt62=1;
                            }
                            }
                            break;
                        case RULE_BOOL:
                            {
                            int LA62_4 = input.LA(2);

                            if ( (LA62_4==EOF||(LA62_4>=RULE_ALIAS_LINKAGE && LA62_4<=RULE_SL_COMMENT)||LA62_4==RULE_VALID_ID||LA62_4==RULE_METADATA||(LA62_4>=50 && LA62_4<=51)||(LA62_4>=68 && LA62_4<=72)||LA62_4==74||LA62_4==78||LA62_4==80||(LA62_4>=88 && LA62_4<=89)||LA62_4==91||LA62_4==96||(LA62_4>=124 && LA62_4<=125)||LA62_4==127||(LA62_4>=131 && LA62_4<=133)||LA62_4==150||(LA62_4>=153 && LA62_4<=154)||LA62_4==156) ) {
                                alt62=1;
                            }
                            }
                            break;
                    }

                    switch (alt62) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2526:1: (lv_value_3_0= ruleValue )
                            {
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2526:1: (lv_value_3_0= ruleValue )
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2527:3: lv_value_3_0= ruleValue
                            {
                             
                            	        newCompositeNode(grammarAccess.getParameterAccess().getValueValueParserRuleCall_1_1_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleValue_in_ruleParameter6003);
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

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2543:3: (this_RETURN_ATTRIBUTES_4= RULE_RETURN_ATTRIBUTES )*
                    loop63:
                    do {
                        int alt63=2;
                        int LA63_0 = input.LA(1);

                        if ( (LA63_0==RULE_RETURN_ATTRIBUTES) ) {
                            int LA63_2 = input.LA(2);

                            if ( (LA63_2==EOF||(LA63_2>=RULE_ALIAS_LINKAGE && LA63_2<=RULE_SL_COMMENT)||LA63_2==RULE_VALID_ID||LA63_2==RULE_METADATA||(LA63_2>=50 && LA63_2<=51)||(LA63_2>=68 && LA63_2<=72)||LA63_2==74||LA63_2==78||LA63_2==80||(LA63_2>=88 && LA63_2<=89)||LA63_2==91||LA63_2==96||(LA63_2>=124 && LA63_2<=125)||LA63_2==127||(LA63_2>=131 && LA63_2<=133)||LA63_2==150||(LA63_2>=153 && LA63_2<=154)||LA63_2==156) ) {
                                alt63=1;
                            }


                        }


                        switch (alt63) {
                    	case 1 :
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2543:4: this_RETURN_ATTRIBUTES_4= RULE_RETURN_ATTRIBUTES
                    	    {
                    	    this_RETURN_ATTRIBUTES_4=(Token)match(input,RULE_RETURN_ATTRIBUTES,FOLLOW_RULE_RETURN_ATTRIBUTES_in_ruleParameter6016); 
                    	     
                    	        newLeafNode(this_RETURN_ATTRIBUTES_4, grammarAccess.getParameterAccess().getRETURN_ATTRIBUTESTerminalRuleCall_1_1_1()); 
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop63;
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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2555:1: entryRuleParameterList returns [EObject current=null] : iv_ruleParameterList= ruleParameterList EOF ;
    public final EObject entryRuleParameterList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterList = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2556:2: (iv_ruleParameterList= ruleParameterList EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2557:2: iv_ruleParameterList= ruleParameterList EOF
            {
             newCompositeNode(grammarAccess.getParameterListRule()); 
            pushFollow(FOLLOW_ruleParameterList_in_entryRuleParameterList6055);
            iv_ruleParameterList=ruleParameterList();

            state._fsp--;

             current =iv_ruleParameterList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterList6065); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2564:1: ruleParameterList returns [EObject current=null] : ( () (otherlv_1= '()' | (otherlv_2= '(' ( ( (lv_params_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleParameter ) ) )* )? otherlv_6= ')' ) ) ) ;
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
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2567:28: ( ( () (otherlv_1= '()' | (otherlv_2= '(' ( ( (lv_params_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleParameter ) ) )* )? otherlv_6= ')' ) ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2568:1: ( () (otherlv_1= '()' | (otherlv_2= '(' ( ( (lv_params_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleParameter ) ) )* )? otherlv_6= ')' ) ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2568:1: ( () (otherlv_1= '()' | (otherlv_2= '(' ( ( (lv_params_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleParameter ) ) )* )? otherlv_6= ')' ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2568:2: () (otherlv_1= '()' | (otherlv_2= '(' ( ( (lv_params_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleParameter ) ) )* )? otherlv_6= ')' ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2568:2: ()
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2569:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getParameterListAccess().getParameterListAction_0(),
                        current);
                

            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2574:2: (otherlv_1= '()' | (otherlv_2= '(' ( ( (lv_params_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleParameter ) ) )* )? otherlv_6= ')' ) )
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==89) ) {
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
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2574:4: otherlv_1= '()'
                    {
                    otherlv_1=(Token)match(input,89,FOLLOW_89_in_ruleParameterList6112); 

                        	newLeafNode(otherlv_1, grammarAccess.getParameterListAccess().getLeftParenthesisRightParenthesisKeyword_1_0());
                        

                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2579:6: (otherlv_2= '(' ( ( (lv_params_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleParameter ) ) )* )? otherlv_6= ')' )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2579:6: (otherlv_2= '(' ( ( (lv_params_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleParameter ) ) )* )? otherlv_6= ')' )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2579:8: otherlv_2= '(' ( ( (lv_params_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleParameter ) ) )* )? otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,50,FOLLOW_50_in_ruleParameterList6131); 

                        	newLeafNode(otherlv_2, grammarAccess.getParameterListAccess().getLeftParenthesisKeyword_1_1_0());
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2583:1: ( ( (lv_params_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleParameter ) ) )* )?
                    int alt66=2;
                    int LA66_0 = input.LA(1);

                    if ( (LA66_0==RULE_INT_TYPE||LA66_0==RULE_VALID_ID||(LA66_0>=RULE_PRIMITIVE_VALUE && LA66_0<=RULE_FLOATING_POINT_TYPE)||LA66_0==46||LA66_0==79||(LA66_0>=94 && LA66_0<=95)) ) {
                        alt66=1;
                    }
                    switch (alt66) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2583:2: ( (lv_params_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleParameter ) ) )*
                            {
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2583:2: ( (lv_params_3_0= ruleParameter ) )
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2584:1: (lv_params_3_0= ruleParameter )
                            {
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2584:1: (lv_params_3_0= ruleParameter )
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2585:3: lv_params_3_0= ruleParameter
                            {
                             
                            	        newCompositeNode(grammarAccess.getParameterListAccess().getParamsParameterParserRuleCall_1_1_1_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleParameter_in_ruleParameterList6153);
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

                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2601:2: (otherlv_4= ',' ( (lv_params_5_0= ruleParameter ) ) )*
                            loop65:
                            do {
                                int alt65=2;
                                int LA65_0 = input.LA(1);

                                if ( (LA65_0==80) ) {
                                    alt65=1;
                                }


                                switch (alt65) {
                            	case 1 :
                            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2601:4: otherlv_4= ',' ( (lv_params_5_0= ruleParameter ) )
                            	    {
                            	    otherlv_4=(Token)match(input,80,FOLLOW_80_in_ruleParameterList6166); 

                            	        	newLeafNode(otherlv_4, grammarAccess.getParameterListAccess().getCommaKeyword_1_1_1_1_0());
                            	        
                            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2605:1: ( (lv_params_5_0= ruleParameter ) )
                            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2606:1: (lv_params_5_0= ruleParameter )
                            	    {
                            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2606:1: (lv_params_5_0= ruleParameter )
                            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2607:3: lv_params_5_0= ruleParameter
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getParameterListAccess().getParamsParameterParserRuleCall_1_1_1_1_1_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleParameter_in_ruleParameterList6187);
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
                            	    break loop65;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_6=(Token)match(input,51,FOLLOW_51_in_ruleParameterList6203); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2635:1: entryRuleFunctionParameter returns [EObject current=null] : iv_ruleFunctionParameter= ruleFunctionParameter EOF ;
    public final EObject entryRuleFunctionParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionParameter = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2636:2: (iv_ruleFunctionParameter= ruleFunctionParameter EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2637:2: iv_ruleFunctionParameter= ruleFunctionParameter EOF
            {
             newCompositeNode(grammarAccess.getFunctionParameterRule()); 
            pushFollow(FOLLOW_ruleFunctionParameter_in_entryRuleFunctionParameter6241);
            iv_ruleFunctionParameter=ruleFunctionParameter();

            state._fsp--;

             current =iv_ruleFunctionParameter; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionParameter6251); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2644:1: ruleFunctionParameter returns [EObject current=null] : ( ( (lv_type_0_0= ruleTypeUse ) ) (this_RETURN_ATTRIBUTES_1= RULE_RETURN_ATTRIBUTES )* ( (lv_value_2_0= ruleAddress ) )? ) ;
    public final EObject ruleFunctionParameter() throws RecognitionException {
        EObject current = null;

        Token this_RETURN_ATTRIBUTES_1=null;
        EObject lv_type_0_0 = null;

        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2647:28: ( ( ( (lv_type_0_0= ruleTypeUse ) ) (this_RETURN_ATTRIBUTES_1= RULE_RETURN_ATTRIBUTES )* ( (lv_value_2_0= ruleAddress ) )? ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2648:1: ( ( (lv_type_0_0= ruleTypeUse ) ) (this_RETURN_ATTRIBUTES_1= RULE_RETURN_ATTRIBUTES )* ( (lv_value_2_0= ruleAddress ) )? )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2648:1: ( ( (lv_type_0_0= ruleTypeUse ) ) (this_RETURN_ATTRIBUTES_1= RULE_RETURN_ATTRIBUTES )* ( (lv_value_2_0= ruleAddress ) )? )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2648:2: ( (lv_type_0_0= ruleTypeUse ) ) (this_RETURN_ATTRIBUTES_1= RULE_RETURN_ATTRIBUTES )* ( (lv_value_2_0= ruleAddress ) )?
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2648:2: ( (lv_type_0_0= ruleTypeUse ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2649:1: (lv_type_0_0= ruleTypeUse )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2649:1: (lv_type_0_0= ruleTypeUse )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2650:3: lv_type_0_0= ruleTypeUse
            {
             
            	        newCompositeNode(grammarAccess.getFunctionParameterAccess().getTypeTypeUseParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeUse_in_ruleFunctionParameter6297);
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

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2666:2: (this_RETURN_ATTRIBUTES_1= RULE_RETURN_ATTRIBUTES )*
            loop68:
            do {
                int alt68=2;
                int LA68_0 = input.LA(1);

                if ( (LA68_0==RULE_RETURN_ATTRIBUTES) ) {
                    alt68=1;
                }


                switch (alt68) {
            	case 1 :
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2666:3: this_RETURN_ATTRIBUTES_1= RULE_RETURN_ATTRIBUTES
            	    {
            	    this_RETURN_ATTRIBUTES_1=(Token)match(input,RULE_RETURN_ATTRIBUTES,FOLLOW_RULE_RETURN_ATTRIBUTES_in_ruleFunctionParameter6309); 
            	     
            	        newLeafNode(this_RETURN_ATTRIBUTES_1, grammarAccess.getFunctionParameterAccess().getRETURN_ATTRIBUTESTerminalRuleCall_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop68;
                }
            } while (true);

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2670:3: ( (lv_value_2_0= ruleAddress ) )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==RULE_VALID_ID) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2671:1: (lv_value_2_0= ruleAddress )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2671:1: (lv_value_2_0= ruleAddress )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2672:3: lv_value_2_0= ruleAddress
                    {
                     
                    	        newCompositeNode(grammarAccess.getFunctionParameterAccess().getValueAddressParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAddress_in_ruleFunctionParameter6331);
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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2696:1: entryRuleFunctionParameterList returns [EObject current=null] : iv_ruleFunctionParameterList= ruleFunctionParameterList EOF ;
    public final EObject entryRuleFunctionParameterList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionParameterList = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2697:2: (iv_ruleFunctionParameterList= ruleFunctionParameterList EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2698:2: iv_ruleFunctionParameterList= ruleFunctionParameterList EOF
            {
             newCompositeNode(grammarAccess.getFunctionParameterListRule()); 
            pushFollow(FOLLOW_ruleFunctionParameterList_in_entryRuleFunctionParameterList6368);
            iv_ruleFunctionParameterList=ruleFunctionParameterList();

            state._fsp--;

             current =iv_ruleFunctionParameterList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionParameterList6378); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2705:1: ruleFunctionParameterList returns [EObject current=null] : ( () ( (lv_params_1_0= ruleFunctionParameter ) ) (otherlv_2= ',' ( (lv_params_3_0= ruleFunctionParameter ) ) )* ) ;
    public final EObject ruleFunctionParameterList() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_params_1_0 = null;

        EObject lv_params_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2708:28: ( ( () ( (lv_params_1_0= ruleFunctionParameter ) ) (otherlv_2= ',' ( (lv_params_3_0= ruleFunctionParameter ) ) )* ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2709:1: ( () ( (lv_params_1_0= ruleFunctionParameter ) ) (otherlv_2= ',' ( (lv_params_3_0= ruleFunctionParameter ) ) )* )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2709:1: ( () ( (lv_params_1_0= ruleFunctionParameter ) ) (otherlv_2= ',' ( (lv_params_3_0= ruleFunctionParameter ) ) )* )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2709:2: () ( (lv_params_1_0= ruleFunctionParameter ) ) (otherlv_2= ',' ( (lv_params_3_0= ruleFunctionParameter ) ) )*
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2709:2: ()
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2710:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getFunctionParameterListAccess().getFunctionParameterListAction_0(),
                        current);
                

            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2715:2: ( (lv_params_1_0= ruleFunctionParameter ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2716:1: (lv_params_1_0= ruleFunctionParameter )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2716:1: (lv_params_1_0= ruleFunctionParameter )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2717:3: lv_params_1_0= ruleFunctionParameter
            {
             
            	        newCompositeNode(grammarAccess.getFunctionParameterListAccess().getParamsFunctionParameterParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleFunctionParameter_in_ruleFunctionParameterList6433);
            lv_params_1_0=ruleFunctionParameter();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFunctionParameterListRule());
            	        }
                   		add(
                   			current, 
                   			"params",
                    		lv_params_1_0, 
                    		"FunctionParameter");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2733:2: (otherlv_2= ',' ( (lv_params_3_0= ruleFunctionParameter ) ) )*
            loop70:
            do {
                int alt70=2;
                int LA70_0 = input.LA(1);

                if ( (LA70_0==80) ) {
                    alt70=1;
                }


                switch (alt70) {
            	case 1 :
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2733:4: otherlv_2= ',' ( (lv_params_3_0= ruleFunctionParameter ) )
            	    {
            	    otherlv_2=(Token)match(input,80,FOLLOW_80_in_ruleFunctionParameterList6446); 

            	        	newLeafNode(otherlv_2, grammarAccess.getFunctionParameterListAccess().getCommaKeyword_2_0());
            	        
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2737:1: ( (lv_params_3_0= ruleFunctionParameter ) )
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2738:1: (lv_params_3_0= ruleFunctionParameter )
            	    {
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2738:1: (lv_params_3_0= ruleFunctionParameter )
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2739:3: lv_params_3_0= ruleFunctionParameter
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFunctionParameterListAccess().getParamsFunctionParameterParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleFunctionParameter_in_ruleFunctionParameterList6467);
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


            	    }
            	    break;

            	default :
            	    break loop70;
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
    // $ANTLR end "ruleFunctionParameterList"


    // $ANTLR start "entryRuleFunctionBody"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2763:1: entryRuleFunctionBody returns [EObject current=null] : iv_ruleFunctionBody= ruleFunctionBody EOF ;
    public final EObject entryRuleFunctionBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionBody = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2764:2: (iv_ruleFunctionBody= ruleFunctionBody EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2765:2: iv_ruleFunctionBody= ruleFunctionBody EOF
            {
             newCompositeNode(grammarAccess.getFunctionBodyRule()); 
            pushFollow(FOLLOW_ruleFunctionBody_in_entryRuleFunctionBody6505);
            iv_ruleFunctionBody=ruleFunctionBody();

            state._fsp--;

             current =iv_ruleFunctionBody; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionBody6515); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2772:1: ruleFunctionBody returns [EObject current=null] : ( ( (lv_meta_0_0= ruleMetadataValue ) )* otherlv_1= '{' ( (lv_blocks_2_0= ruleBasicBlock ) )+ otherlv_3= '}' ) ;
    public final EObject ruleFunctionBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_meta_0_0 = null;

        EObject lv_blocks_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2775:28: ( ( ( (lv_meta_0_0= ruleMetadataValue ) )* otherlv_1= '{' ( (lv_blocks_2_0= ruleBasicBlock ) )+ otherlv_3= '}' ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2776:1: ( ( (lv_meta_0_0= ruleMetadataValue ) )* otherlv_1= '{' ( (lv_blocks_2_0= ruleBasicBlock ) )+ otherlv_3= '}' )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2776:1: ( ( (lv_meta_0_0= ruleMetadataValue ) )* otherlv_1= '{' ( (lv_blocks_2_0= ruleBasicBlock ) )+ otherlv_3= '}' )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2776:2: ( (lv_meta_0_0= ruleMetadataValue ) )* otherlv_1= '{' ( (lv_blocks_2_0= ruleBasicBlock ) )+ otherlv_3= '}'
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2776:2: ( (lv_meta_0_0= ruleMetadataValue ) )*
            loop71:
            do {
                int alt71=2;
                int LA71_0 = input.LA(1);

                if ( (LA71_0==RULE_METADATA) ) {
                    alt71=1;
                }


                switch (alt71) {
            	case 1 :
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2777:1: (lv_meta_0_0= ruleMetadataValue )
            	    {
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2777:1: (lv_meta_0_0= ruleMetadataValue )
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2778:3: lv_meta_0_0= ruleMetadataValue
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFunctionBodyAccess().getMetaMetadataValueParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMetadataValue_in_ruleFunctionBody6561);
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
            	    break loop71;
                }
            } while (true);

            otherlv_1=(Token)match(input,95,FOLLOW_95_in_ruleFunctionBody6574); 

                	newLeafNode(otherlv_1, grammarAccess.getFunctionBodyAccess().getLeftCurlyBracketKeyword_1());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2798:1: ( (lv_blocks_2_0= ruleBasicBlock ) )+
            int cnt72=0;
            loop72:
            do {
                int alt72=2;
                int LA72_0 = input.LA(1);

                if ( ((LA72_0>=RULE_ALIAS_LINKAGE && LA72_0<=RULE_BOOL)||(LA72_0>=68 && LA72_0<=71)) ) {
                    alt72=1;
                }


                switch (alt72) {
            	case 1 :
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2799:1: (lv_blocks_2_0= ruleBasicBlock )
            	    {
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2799:1: (lv_blocks_2_0= ruleBasicBlock )
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2800:3: lv_blocks_2_0= ruleBasicBlock
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFunctionBodyAccess().getBlocksBasicBlockParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleBasicBlock_in_ruleFunctionBody6595);
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
            	    if ( cnt72 >= 1 ) break loop72;
                        EarlyExitException eee =
                            new EarlyExitException(72, input);
                        throw eee;
                }
                cnt72++;
            } while (true);

            otherlv_3=(Token)match(input,96,FOLLOW_96_in_ruleFunctionBody6608); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2828:1: entryRuleInstruction returns [EObject current=null] : iv_ruleInstruction= ruleInstruction EOF ;
    public final EObject entryRuleInstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstruction = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2829:2: (iv_ruleInstruction= ruleInstruction EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2830:2: iv_ruleInstruction= ruleInstruction EOF
            {
             newCompositeNode(grammarAccess.getInstructionRule()); 
            pushFollow(FOLLOW_ruleInstruction_in_entryRuleInstruction6644);
            iv_ruleInstruction=ruleInstruction();

            state._fsp--;

             current =iv_ruleInstruction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInstruction6654); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2837:1: ruleInstruction returns [EObject current=null] : (this_Store_0= ruleStore | this_Load_1= ruleLoad | this_GetElementPtr_2= ruleGetElementPtr | this_Alloc_3= ruleAlloc | this_CmpXchg_4= ruleCmpXchg | this_AtomicRMW_5= ruleAtomicRMW | this_Fence_6= ruleFence | this_Return_7= ruleReturn | this_Branch_8= ruleBranch | this_Switch_9= ruleSwitch | this_IndirectBranch_10= ruleIndirectBranch | this_Invoke_11= ruleInvoke | this_Resume_12= ruleResume | this_Unreachable_13= ruleUnreachable | this_LogicOperation_14= ruleLogicOperation | this_ArithmeticOperation_15= ruleArithmeticOperation | this_Compare_16= ruleCompare | this_Cast_17= ruleCast | this_ShuffleVector_18= ruleShuffleVector | this_InsertElement_19= ruleInsertElement | this_ExtractElement_20= ruleExtractElement | this_InsertValue_21= ruleInsertValue | this_ExtractValue_22= ruleExtractValue | this_Phi_23= rulePhi | this_Select_24= ruleSelect | this_Call_25= ruleCall | this_VariableAttributeAccess_26= ruleVariableAttributeAccess | this_LandingPad_27= ruleLandingPad ) ;
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
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2840:28: ( (this_Store_0= ruleStore | this_Load_1= ruleLoad | this_GetElementPtr_2= ruleGetElementPtr | this_Alloc_3= ruleAlloc | this_CmpXchg_4= ruleCmpXchg | this_AtomicRMW_5= ruleAtomicRMW | this_Fence_6= ruleFence | this_Return_7= ruleReturn | this_Branch_8= ruleBranch | this_Switch_9= ruleSwitch | this_IndirectBranch_10= ruleIndirectBranch | this_Invoke_11= ruleInvoke | this_Resume_12= ruleResume | this_Unreachable_13= ruleUnreachable | this_LogicOperation_14= ruleLogicOperation | this_ArithmeticOperation_15= ruleArithmeticOperation | this_Compare_16= ruleCompare | this_Cast_17= ruleCast | this_ShuffleVector_18= ruleShuffleVector | this_InsertElement_19= ruleInsertElement | this_ExtractElement_20= ruleExtractElement | this_InsertValue_21= ruleInsertValue | this_ExtractValue_22= ruleExtractValue | this_Phi_23= rulePhi | this_Select_24= ruleSelect | this_Call_25= ruleCall | this_VariableAttributeAccess_26= ruleVariableAttributeAccess | this_LandingPad_27= ruleLandingPad ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2841:1: (this_Store_0= ruleStore | this_Load_1= ruleLoad | this_GetElementPtr_2= ruleGetElementPtr | this_Alloc_3= ruleAlloc | this_CmpXchg_4= ruleCmpXchg | this_AtomicRMW_5= ruleAtomicRMW | this_Fence_6= ruleFence | this_Return_7= ruleReturn | this_Branch_8= ruleBranch | this_Switch_9= ruleSwitch | this_IndirectBranch_10= ruleIndirectBranch | this_Invoke_11= ruleInvoke | this_Resume_12= ruleResume | this_Unreachable_13= ruleUnreachable | this_LogicOperation_14= ruleLogicOperation | this_ArithmeticOperation_15= ruleArithmeticOperation | this_Compare_16= ruleCompare | this_Cast_17= ruleCast | this_ShuffleVector_18= ruleShuffleVector | this_InsertElement_19= ruleInsertElement | this_ExtractElement_20= ruleExtractElement | this_InsertValue_21= ruleInsertValue | this_ExtractValue_22= ruleExtractValue | this_Phi_23= rulePhi | this_Select_24= ruleSelect | this_Call_25= ruleCall | this_VariableAttributeAccess_26= ruleVariableAttributeAccess | this_LandingPad_27= ruleLandingPad )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2841:1: (this_Store_0= ruleStore | this_Load_1= ruleLoad | this_GetElementPtr_2= ruleGetElementPtr | this_Alloc_3= ruleAlloc | this_CmpXchg_4= ruleCmpXchg | this_AtomicRMW_5= ruleAtomicRMW | this_Fence_6= ruleFence | this_Return_7= ruleReturn | this_Branch_8= ruleBranch | this_Switch_9= ruleSwitch | this_IndirectBranch_10= ruleIndirectBranch | this_Invoke_11= ruleInvoke | this_Resume_12= ruleResume | this_Unreachable_13= ruleUnreachable | this_LogicOperation_14= ruleLogicOperation | this_ArithmeticOperation_15= ruleArithmeticOperation | this_Compare_16= ruleCompare | this_Cast_17= ruleCast | this_ShuffleVector_18= ruleShuffleVector | this_InsertElement_19= ruleInsertElement | this_ExtractElement_20= ruleExtractElement | this_InsertValue_21= ruleInsertValue | this_ExtractValue_22= ruleExtractValue | this_Phi_23= rulePhi | this_Select_24= ruleSelect | this_Call_25= ruleCall | this_VariableAttributeAccess_26= ruleVariableAttributeAccess | this_LandingPad_27= ruleLandingPad )
            int alt73=28;
            alt73 = dfa73.predict(input);
            switch (alt73) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2842:5: this_Store_0= ruleStore
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getStoreParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleStore_in_ruleInstruction6701);
                    this_Store_0=ruleStore();

                    state._fsp--;

                     
                            current = this_Store_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2852:5: this_Load_1= ruleLoad
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getLoadParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleLoad_in_ruleInstruction6728);
                    this_Load_1=ruleLoad();

                    state._fsp--;

                     
                            current = this_Load_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2862:5: this_GetElementPtr_2= ruleGetElementPtr
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getGetElementPtrParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleGetElementPtr_in_ruleInstruction6755);
                    this_GetElementPtr_2=ruleGetElementPtr();

                    state._fsp--;

                     
                            current = this_GetElementPtr_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2872:5: this_Alloc_3= ruleAlloc
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getAllocParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleAlloc_in_ruleInstruction6782);
                    this_Alloc_3=ruleAlloc();

                    state._fsp--;

                     
                            current = this_Alloc_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2882:5: this_CmpXchg_4= ruleCmpXchg
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getCmpXchgParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleCmpXchg_in_ruleInstruction6809);
                    this_CmpXchg_4=ruleCmpXchg();

                    state._fsp--;

                     
                            current = this_CmpXchg_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2892:5: this_AtomicRMW_5= ruleAtomicRMW
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getAtomicRMWParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleAtomicRMW_in_ruleInstruction6836);
                    this_AtomicRMW_5=ruleAtomicRMW();

                    state._fsp--;

                     
                            current = this_AtomicRMW_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2902:5: this_Fence_6= ruleFence
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getFenceParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleFence_in_ruleInstruction6863);
                    this_Fence_6=ruleFence();

                    state._fsp--;

                     
                            current = this_Fence_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2912:5: this_Return_7= ruleReturn
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getReturnParserRuleCall_7()); 
                        
                    pushFollow(FOLLOW_ruleReturn_in_ruleInstruction6890);
                    this_Return_7=ruleReturn();

                    state._fsp--;

                     
                            current = this_Return_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 9 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2922:5: this_Branch_8= ruleBranch
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getBranchParserRuleCall_8()); 
                        
                    pushFollow(FOLLOW_ruleBranch_in_ruleInstruction6917);
                    this_Branch_8=ruleBranch();

                    state._fsp--;

                     
                            current = this_Branch_8; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 10 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2932:5: this_Switch_9= ruleSwitch
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getSwitchParserRuleCall_9()); 
                        
                    pushFollow(FOLLOW_ruleSwitch_in_ruleInstruction6944);
                    this_Switch_9=ruleSwitch();

                    state._fsp--;

                     
                            current = this_Switch_9; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 11 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2942:5: this_IndirectBranch_10= ruleIndirectBranch
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getIndirectBranchParserRuleCall_10()); 
                        
                    pushFollow(FOLLOW_ruleIndirectBranch_in_ruleInstruction6971);
                    this_IndirectBranch_10=ruleIndirectBranch();

                    state._fsp--;

                     
                            current = this_IndirectBranch_10; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 12 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2952:5: this_Invoke_11= ruleInvoke
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getInvokeParserRuleCall_11()); 
                        
                    pushFollow(FOLLOW_ruleInvoke_in_ruleInstruction6998);
                    this_Invoke_11=ruleInvoke();

                    state._fsp--;

                     
                            current = this_Invoke_11; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 13 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2962:5: this_Resume_12= ruleResume
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getResumeParserRuleCall_12()); 
                        
                    pushFollow(FOLLOW_ruleResume_in_ruleInstruction7025);
                    this_Resume_12=ruleResume();

                    state._fsp--;

                     
                            current = this_Resume_12; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 14 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2972:5: this_Unreachable_13= ruleUnreachable
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getUnreachableParserRuleCall_13()); 
                        
                    pushFollow(FOLLOW_ruleUnreachable_in_ruleInstruction7052);
                    this_Unreachable_13=ruleUnreachable();

                    state._fsp--;

                     
                            current = this_Unreachable_13; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 15 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2982:5: this_LogicOperation_14= ruleLogicOperation
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getLogicOperationParserRuleCall_14()); 
                        
                    pushFollow(FOLLOW_ruleLogicOperation_in_ruleInstruction7079);
                    this_LogicOperation_14=ruleLogicOperation();

                    state._fsp--;

                     
                            current = this_LogicOperation_14; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 16 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2992:5: this_ArithmeticOperation_15= ruleArithmeticOperation
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getArithmeticOperationParserRuleCall_15()); 
                        
                    pushFollow(FOLLOW_ruleArithmeticOperation_in_ruleInstruction7106);
                    this_ArithmeticOperation_15=ruleArithmeticOperation();

                    state._fsp--;

                     
                            current = this_ArithmeticOperation_15; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 17 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3002:5: this_Compare_16= ruleCompare
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getCompareParserRuleCall_16()); 
                        
                    pushFollow(FOLLOW_ruleCompare_in_ruleInstruction7133);
                    this_Compare_16=ruleCompare();

                    state._fsp--;

                     
                            current = this_Compare_16; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 18 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3012:5: this_Cast_17= ruleCast
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getCastParserRuleCall_17()); 
                        
                    pushFollow(FOLLOW_ruleCast_in_ruleInstruction7160);
                    this_Cast_17=ruleCast();

                    state._fsp--;

                     
                            current = this_Cast_17; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 19 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3022:5: this_ShuffleVector_18= ruleShuffleVector
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getShuffleVectorParserRuleCall_18()); 
                        
                    pushFollow(FOLLOW_ruleShuffleVector_in_ruleInstruction7187);
                    this_ShuffleVector_18=ruleShuffleVector();

                    state._fsp--;

                     
                            current = this_ShuffleVector_18; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 20 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3032:5: this_InsertElement_19= ruleInsertElement
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getInsertElementParserRuleCall_19()); 
                        
                    pushFollow(FOLLOW_ruleInsertElement_in_ruleInstruction7214);
                    this_InsertElement_19=ruleInsertElement();

                    state._fsp--;

                     
                            current = this_InsertElement_19; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 21 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3042:5: this_ExtractElement_20= ruleExtractElement
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getExtractElementParserRuleCall_20()); 
                        
                    pushFollow(FOLLOW_ruleExtractElement_in_ruleInstruction7241);
                    this_ExtractElement_20=ruleExtractElement();

                    state._fsp--;

                     
                            current = this_ExtractElement_20; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 22 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3052:5: this_InsertValue_21= ruleInsertValue
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getInsertValueParserRuleCall_21()); 
                        
                    pushFollow(FOLLOW_ruleInsertValue_in_ruleInstruction7268);
                    this_InsertValue_21=ruleInsertValue();

                    state._fsp--;

                     
                            current = this_InsertValue_21; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 23 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3062:5: this_ExtractValue_22= ruleExtractValue
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getExtractValueParserRuleCall_22()); 
                        
                    pushFollow(FOLLOW_ruleExtractValue_in_ruleInstruction7295);
                    this_ExtractValue_22=ruleExtractValue();

                    state._fsp--;

                     
                            current = this_ExtractValue_22; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 24 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3072:5: this_Phi_23= rulePhi
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getPhiParserRuleCall_23()); 
                        
                    pushFollow(FOLLOW_rulePhi_in_ruleInstruction7322);
                    this_Phi_23=rulePhi();

                    state._fsp--;

                     
                            current = this_Phi_23; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 25 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3082:5: this_Select_24= ruleSelect
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getSelectParserRuleCall_24()); 
                        
                    pushFollow(FOLLOW_ruleSelect_in_ruleInstruction7349);
                    this_Select_24=ruleSelect();

                    state._fsp--;

                     
                            current = this_Select_24; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 26 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3092:5: this_Call_25= ruleCall
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getCallParserRuleCall_25()); 
                        
                    pushFollow(FOLLOW_ruleCall_in_ruleInstruction7376);
                    this_Call_25=ruleCall();

                    state._fsp--;

                     
                            current = this_Call_25; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 27 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3102:5: this_VariableAttributeAccess_26= ruleVariableAttributeAccess
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getVariableAttributeAccessParserRuleCall_26()); 
                        
                    pushFollow(FOLLOW_ruleVariableAttributeAccess_in_ruleInstruction7403);
                    this_VariableAttributeAccess_26=ruleVariableAttributeAccess();

                    state._fsp--;

                     
                            current = this_VariableAttributeAccess_26; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 28 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3112:5: this_LandingPad_27= ruleLandingPad
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getLandingPadParserRuleCall_27()); 
                        
                    pushFollow(FOLLOW_ruleLandingPad_in_ruleInstruction7430);
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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3128:1: entryRuleBasicBlock returns [EObject current=null] : iv_ruleBasicBlock= ruleBasicBlock EOF ;
    public final EObject entryRuleBasicBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBasicBlock = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3129:2: (iv_ruleBasicBlock= ruleBasicBlock EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3130:2: iv_ruleBasicBlock= ruleBasicBlock EOF
            {
             newCompositeNode(grammarAccess.getBasicBlockRule()); 
            pushFollow(FOLLOW_ruleBasicBlock_in_entryRuleBasicBlock7465);
            iv_ruleBasicBlock=ruleBasicBlock();

            state._fsp--;

             current =iv_ruleBasicBlock; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBasicBlock7475); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3137:1: ruleBasicBlock returns [EObject current=null] : ( ( ( (lv_label_0_0= ruleLABEL_ID ) ) otherlv_1= ':' ) ( (lv_instructions_2_0= ruleInstruction ) )+ ) ;
    public final EObject ruleBasicBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_label_0_0 = null;

        EObject lv_instructions_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3140:28: ( ( ( ( (lv_label_0_0= ruleLABEL_ID ) ) otherlv_1= ':' ) ( (lv_instructions_2_0= ruleInstruction ) )+ ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3141:1: ( ( ( (lv_label_0_0= ruleLABEL_ID ) ) otherlv_1= ':' ) ( (lv_instructions_2_0= ruleInstruction ) )+ )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3141:1: ( ( ( (lv_label_0_0= ruleLABEL_ID ) ) otherlv_1= ':' ) ( (lv_instructions_2_0= ruleInstruction ) )+ )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3141:2: ( ( (lv_label_0_0= ruleLABEL_ID ) ) otherlv_1= ':' ) ( (lv_instructions_2_0= ruleInstruction ) )+
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3141:2: ( ( (lv_label_0_0= ruleLABEL_ID ) ) otherlv_1= ':' )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3141:3: ( (lv_label_0_0= ruleLABEL_ID ) ) otherlv_1= ':'
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3141:3: ( (lv_label_0_0= ruleLABEL_ID ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3142:1: (lv_label_0_0= ruleLABEL_ID )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3142:1: (lv_label_0_0= ruleLABEL_ID )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3143:3: lv_label_0_0= ruleLABEL_ID
            {
             
            	        newCompositeNode(grammarAccess.getBasicBlockAccess().getLabelLABEL_IDParserRuleCall_0_0_0()); 
            	    
            pushFollow(FOLLOW_ruleLABEL_ID_in_ruleBasicBlock7522);
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

            otherlv_1=(Token)match(input,97,FOLLOW_97_in_ruleBasicBlock7534); 

                	newLeafNode(otherlv_1, grammarAccess.getBasicBlockAccess().getColonKeyword_0_1());
                

            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3163:2: ( (lv_instructions_2_0= ruleInstruction ) )+
            int cnt74=0;
            loop74:
            do {
                int alt74=2;
                switch ( input.LA(1) ) {
                case 69:
                    {
                    int LA74_2 = input.LA(2);

                    if ( (LA74_2==RULE_RETURN_ATTRIBUTES||LA74_2==RULE_INT_TYPE||LA74_2==RULE_VALID_ID||(LA74_2>=RULE_PRIMITIVE_VALUE && LA74_2<=RULE_FLOATING_POINT_TYPE)||(LA74_2>=31 && LA74_2<=45)) ) {
                        alt74=1;
                    }


                    }
                    break;
                case 70:
                    {
                    int LA74_3 = input.LA(2);

                    if ( (LA74_3==95) ) {
                        alt74=1;
                    }


                    }
                    break;
                case 71:
                    {
                    int LA74_4 = input.LA(2);

                    if ( (LA74_4==RULE_INT_TYPE||LA74_4==RULE_VALID_ID||(LA74_4>=RULE_PRIMITIVE_VALUE && LA74_4<=RULE_FLOATING_POINT_TYPE)||LA74_4==46||LA74_4==79||(LA74_4>=94 && LA74_4<=95)) ) {
                        alt74=1;
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
                    alt74=1;
                    }
                    break;

                }

                switch (alt74) {
            	case 1 :
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3164:1: (lv_instructions_2_0= ruleInstruction )
            	    {
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3164:1: (lv_instructions_2_0= ruleInstruction )
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3165:3: lv_instructions_2_0= ruleInstruction
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBasicBlockAccess().getInstructionsInstructionParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleInstruction_in_ruleBasicBlock7556);
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
    // $ANTLR end "ruleBasicBlock"


    // $ANTLR start "entryRuleArithmeticOperation"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3189:1: entryRuleArithmeticOperation returns [EObject current=null] : iv_ruleArithmeticOperation= ruleArithmeticOperation EOF ;
    public final EObject entryRuleArithmeticOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArithmeticOperation = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3190:2: (iv_ruleArithmeticOperation= ruleArithmeticOperation EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3191:2: iv_ruleArithmeticOperation= ruleArithmeticOperation EOF
            {
             newCompositeNode(grammarAccess.getArithmeticOperationRule()); 
            pushFollow(FOLLOW_ruleArithmeticOperation_in_entryRuleArithmeticOperation7593);
            iv_ruleArithmeticOperation=ruleArithmeticOperation();

            state._fsp--;

             current =iv_ruleArithmeticOperation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArithmeticOperation7603); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3198:1: ruleArithmeticOperation returns [EObject current=null] : ( ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' ( ( (lv_operation_2_1= 'add' | lv_operation_2_2= 'fadd' | lv_operation_2_3= 'sub' | lv_operation_2_4= 'fsub' | lv_operation_2_5= 'mul' | lv_operation_2_6= 'fmul' | lv_operation_2_7= 'udiv' | lv_operation_2_8= 'sdiv' | lv_operation_2_9= 'fdiv' | lv_operation_2_10= 'urem' | lv_operation_2_11= 'srem' | lv_operation_2_12= 'frem' ) ) ) ( (otherlv_3= 'nsw' | otherlv_4= 'nuw' ) (otherlv_5= 'nuw' | otherlv_6= 'nsw' )? )? ( (lv_optype_7_0= ruleTypeUse ) ) ( (lv_value1_8_0= ruleValue ) ) otherlv_9= ',' ( (lv_value2_10_0= ruleValue ) ) ) ;
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
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3201:28: ( ( ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' ( ( (lv_operation_2_1= 'add' | lv_operation_2_2= 'fadd' | lv_operation_2_3= 'sub' | lv_operation_2_4= 'fsub' | lv_operation_2_5= 'mul' | lv_operation_2_6= 'fmul' | lv_operation_2_7= 'udiv' | lv_operation_2_8= 'sdiv' | lv_operation_2_9= 'fdiv' | lv_operation_2_10= 'urem' | lv_operation_2_11= 'srem' | lv_operation_2_12= 'frem' ) ) ) ( (otherlv_3= 'nsw' | otherlv_4= 'nuw' ) (otherlv_5= 'nuw' | otherlv_6= 'nsw' )? )? ( (lv_optype_7_0= ruleTypeUse ) ) ( (lv_value1_8_0= ruleValue ) ) otherlv_9= ',' ( (lv_value2_10_0= ruleValue ) ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3202:1: ( ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' ( ( (lv_operation_2_1= 'add' | lv_operation_2_2= 'fadd' | lv_operation_2_3= 'sub' | lv_operation_2_4= 'fsub' | lv_operation_2_5= 'mul' | lv_operation_2_6= 'fmul' | lv_operation_2_7= 'udiv' | lv_operation_2_8= 'sdiv' | lv_operation_2_9= 'fdiv' | lv_operation_2_10= 'urem' | lv_operation_2_11= 'srem' | lv_operation_2_12= 'frem' ) ) ) ( (otherlv_3= 'nsw' | otherlv_4= 'nuw' ) (otherlv_5= 'nuw' | otherlv_6= 'nsw' )? )? ( (lv_optype_7_0= ruleTypeUse ) ) ( (lv_value1_8_0= ruleValue ) ) otherlv_9= ',' ( (lv_value2_10_0= ruleValue ) ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3202:1: ( ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' ( ( (lv_operation_2_1= 'add' | lv_operation_2_2= 'fadd' | lv_operation_2_3= 'sub' | lv_operation_2_4= 'fsub' | lv_operation_2_5= 'mul' | lv_operation_2_6= 'fmul' | lv_operation_2_7= 'udiv' | lv_operation_2_8= 'sdiv' | lv_operation_2_9= 'fdiv' | lv_operation_2_10= 'urem' | lv_operation_2_11= 'srem' | lv_operation_2_12= 'frem' ) ) ) ( (otherlv_3= 'nsw' | otherlv_4= 'nuw' ) (otherlv_5= 'nuw' | otherlv_6= 'nsw' )? )? ( (lv_optype_7_0= ruleTypeUse ) ) ( (lv_value1_8_0= ruleValue ) ) otherlv_9= ',' ( (lv_value2_10_0= ruleValue ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3202:2: ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' ( ( (lv_operation_2_1= 'add' | lv_operation_2_2= 'fadd' | lv_operation_2_3= 'sub' | lv_operation_2_4= 'fsub' | lv_operation_2_5= 'mul' | lv_operation_2_6= 'fmul' | lv_operation_2_7= 'udiv' | lv_operation_2_8= 'sdiv' | lv_operation_2_9= 'fdiv' | lv_operation_2_10= 'urem' | lv_operation_2_11= 'srem' | lv_operation_2_12= 'frem' ) ) ) ( (otherlv_3= 'nsw' | otherlv_4= 'nuw' ) (otherlv_5= 'nuw' | otherlv_6= 'nsw' )? )? ( (lv_optype_7_0= ruleTypeUse ) ) ( (lv_value1_8_0= ruleValue ) ) otherlv_9= ',' ( (lv_value2_10_0= ruleValue ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3202:2: ( (lv_result_0_0= ruleAddress ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3203:1: (lv_result_0_0= ruleAddress )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3203:1: (lv_result_0_0= ruleAddress )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3204:3: lv_result_0_0= ruleAddress
            {
             
            	        newCompositeNode(grammarAccess.getArithmeticOperationAccess().getResultAddressParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleAddress_in_ruleArithmeticOperation7649);
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

            otherlv_1=(Token)match(input,77,FOLLOW_77_in_ruleArithmeticOperation7661); 

                	newLeafNode(otherlv_1, grammarAccess.getArithmeticOperationAccess().getEqualsSignKeyword_1());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3224:1: ( ( (lv_operation_2_1= 'add' | lv_operation_2_2= 'fadd' | lv_operation_2_3= 'sub' | lv_operation_2_4= 'fsub' | lv_operation_2_5= 'mul' | lv_operation_2_6= 'fmul' | lv_operation_2_7= 'udiv' | lv_operation_2_8= 'sdiv' | lv_operation_2_9= 'fdiv' | lv_operation_2_10= 'urem' | lv_operation_2_11= 'srem' | lv_operation_2_12= 'frem' ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3225:1: ( (lv_operation_2_1= 'add' | lv_operation_2_2= 'fadd' | lv_operation_2_3= 'sub' | lv_operation_2_4= 'fsub' | lv_operation_2_5= 'mul' | lv_operation_2_6= 'fmul' | lv_operation_2_7= 'udiv' | lv_operation_2_8= 'sdiv' | lv_operation_2_9= 'fdiv' | lv_operation_2_10= 'urem' | lv_operation_2_11= 'srem' | lv_operation_2_12= 'frem' ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3225:1: ( (lv_operation_2_1= 'add' | lv_operation_2_2= 'fadd' | lv_operation_2_3= 'sub' | lv_operation_2_4= 'fsub' | lv_operation_2_5= 'mul' | lv_operation_2_6= 'fmul' | lv_operation_2_7= 'udiv' | lv_operation_2_8= 'sdiv' | lv_operation_2_9= 'fdiv' | lv_operation_2_10= 'urem' | lv_operation_2_11= 'srem' | lv_operation_2_12= 'frem' ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3226:1: (lv_operation_2_1= 'add' | lv_operation_2_2= 'fadd' | lv_operation_2_3= 'sub' | lv_operation_2_4= 'fsub' | lv_operation_2_5= 'mul' | lv_operation_2_6= 'fmul' | lv_operation_2_7= 'udiv' | lv_operation_2_8= 'sdiv' | lv_operation_2_9= 'fdiv' | lv_operation_2_10= 'urem' | lv_operation_2_11= 'srem' | lv_operation_2_12= 'frem' )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3226:1: (lv_operation_2_1= 'add' | lv_operation_2_2= 'fadd' | lv_operation_2_3= 'sub' | lv_operation_2_4= 'fsub' | lv_operation_2_5= 'mul' | lv_operation_2_6= 'fmul' | lv_operation_2_7= 'udiv' | lv_operation_2_8= 'sdiv' | lv_operation_2_9= 'fdiv' | lv_operation_2_10= 'urem' | lv_operation_2_11= 'srem' | lv_operation_2_12= 'frem' )
            int alt75=12;
            switch ( input.LA(1) ) {
            case 98:
                {
                alt75=1;
                }
                break;
            case 99:
                {
                alt75=2;
                }
                break;
            case 100:
                {
                alt75=3;
                }
                break;
            case 101:
                {
                alt75=4;
                }
                break;
            case 102:
                {
                alt75=5;
                }
                break;
            case 103:
                {
                alt75=6;
                }
                break;
            case 104:
                {
                alt75=7;
                }
                break;
            case 105:
                {
                alt75=8;
                }
                break;
            case 106:
                {
                alt75=9;
                }
                break;
            case 107:
                {
                alt75=10;
                }
                break;
            case 108:
                {
                alt75=11;
                }
                break;
            case 109:
                {
                alt75=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;
            }

            switch (alt75) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3227:3: lv_operation_2_1= 'add'
                    {
                    lv_operation_2_1=(Token)match(input,98,FOLLOW_98_in_ruleArithmeticOperation7681); 

                            newLeafNode(lv_operation_2_1, grammarAccess.getArithmeticOperationAccess().getOperationAddKeyword_2_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getArithmeticOperationRule());
                    	        }
                           		setWithLastConsumed(current, "operation", lv_operation_2_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3239:8: lv_operation_2_2= 'fadd'
                    {
                    lv_operation_2_2=(Token)match(input,99,FOLLOW_99_in_ruleArithmeticOperation7710); 

                            newLeafNode(lv_operation_2_2, grammarAccess.getArithmeticOperationAccess().getOperationFaddKeyword_2_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getArithmeticOperationRule());
                    	        }
                           		setWithLastConsumed(current, "operation", lv_operation_2_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3251:8: lv_operation_2_3= 'sub'
                    {
                    lv_operation_2_3=(Token)match(input,100,FOLLOW_100_in_ruleArithmeticOperation7739); 

                            newLeafNode(lv_operation_2_3, grammarAccess.getArithmeticOperationAccess().getOperationSubKeyword_2_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getArithmeticOperationRule());
                    	        }
                           		setWithLastConsumed(current, "operation", lv_operation_2_3, null);
                    	    

                    }
                    break;
                case 4 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3263:8: lv_operation_2_4= 'fsub'
                    {
                    lv_operation_2_4=(Token)match(input,101,FOLLOW_101_in_ruleArithmeticOperation7768); 

                            newLeafNode(lv_operation_2_4, grammarAccess.getArithmeticOperationAccess().getOperationFsubKeyword_2_0_3());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getArithmeticOperationRule());
                    	        }
                           		setWithLastConsumed(current, "operation", lv_operation_2_4, null);
                    	    

                    }
                    break;
                case 5 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3275:8: lv_operation_2_5= 'mul'
                    {
                    lv_operation_2_5=(Token)match(input,102,FOLLOW_102_in_ruleArithmeticOperation7797); 

                            newLeafNode(lv_operation_2_5, grammarAccess.getArithmeticOperationAccess().getOperationMulKeyword_2_0_4());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getArithmeticOperationRule());
                    	        }
                           		setWithLastConsumed(current, "operation", lv_operation_2_5, null);
                    	    

                    }
                    break;
                case 6 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3287:8: lv_operation_2_6= 'fmul'
                    {
                    lv_operation_2_6=(Token)match(input,103,FOLLOW_103_in_ruleArithmeticOperation7826); 

                            newLeafNode(lv_operation_2_6, grammarAccess.getArithmeticOperationAccess().getOperationFmulKeyword_2_0_5());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getArithmeticOperationRule());
                    	        }
                           		setWithLastConsumed(current, "operation", lv_operation_2_6, null);
                    	    

                    }
                    break;
                case 7 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3299:8: lv_operation_2_7= 'udiv'
                    {
                    lv_operation_2_7=(Token)match(input,104,FOLLOW_104_in_ruleArithmeticOperation7855); 

                            newLeafNode(lv_operation_2_7, grammarAccess.getArithmeticOperationAccess().getOperationUdivKeyword_2_0_6());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getArithmeticOperationRule());
                    	        }
                           		setWithLastConsumed(current, "operation", lv_operation_2_7, null);
                    	    

                    }
                    break;
                case 8 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3311:8: lv_operation_2_8= 'sdiv'
                    {
                    lv_operation_2_8=(Token)match(input,105,FOLLOW_105_in_ruleArithmeticOperation7884); 

                            newLeafNode(lv_operation_2_8, grammarAccess.getArithmeticOperationAccess().getOperationSdivKeyword_2_0_7());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getArithmeticOperationRule());
                    	        }
                           		setWithLastConsumed(current, "operation", lv_operation_2_8, null);
                    	    

                    }
                    break;
                case 9 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3323:8: lv_operation_2_9= 'fdiv'
                    {
                    lv_operation_2_9=(Token)match(input,106,FOLLOW_106_in_ruleArithmeticOperation7913); 

                            newLeafNode(lv_operation_2_9, grammarAccess.getArithmeticOperationAccess().getOperationFdivKeyword_2_0_8());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getArithmeticOperationRule());
                    	        }
                           		setWithLastConsumed(current, "operation", lv_operation_2_9, null);
                    	    

                    }
                    break;
                case 10 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3335:8: lv_operation_2_10= 'urem'
                    {
                    lv_operation_2_10=(Token)match(input,107,FOLLOW_107_in_ruleArithmeticOperation7942); 

                            newLeafNode(lv_operation_2_10, grammarAccess.getArithmeticOperationAccess().getOperationUremKeyword_2_0_9());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getArithmeticOperationRule());
                    	        }
                           		setWithLastConsumed(current, "operation", lv_operation_2_10, null);
                    	    

                    }
                    break;
                case 11 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3347:8: lv_operation_2_11= 'srem'
                    {
                    lv_operation_2_11=(Token)match(input,108,FOLLOW_108_in_ruleArithmeticOperation7971); 

                            newLeafNode(lv_operation_2_11, grammarAccess.getArithmeticOperationAccess().getOperationSremKeyword_2_0_10());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getArithmeticOperationRule());
                    	        }
                           		setWithLastConsumed(current, "operation", lv_operation_2_11, null);
                    	    

                    }
                    break;
                case 12 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3359:8: lv_operation_2_12= 'frem'
                    {
                    lv_operation_2_12=(Token)match(input,109,FOLLOW_109_in_ruleArithmeticOperation8000); 

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

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3374:2: ( (otherlv_3= 'nsw' | otherlv_4= 'nuw' ) (otherlv_5= 'nuw' | otherlv_6= 'nsw' )? )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( ((LA78_0>=110 && LA78_0<=111)) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3374:3: (otherlv_3= 'nsw' | otherlv_4= 'nuw' ) (otherlv_5= 'nuw' | otherlv_6= 'nsw' )?
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3374:3: (otherlv_3= 'nsw' | otherlv_4= 'nuw' )
                    int alt76=2;
                    int LA76_0 = input.LA(1);

                    if ( (LA76_0==110) ) {
                        alt76=1;
                    }
                    else if ( (LA76_0==111) ) {
                        alt76=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 76, 0, input);

                        throw nvae;
                    }
                    switch (alt76) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3374:5: otherlv_3= 'nsw'
                            {
                            otherlv_3=(Token)match(input,110,FOLLOW_110_in_ruleArithmeticOperation8030); 

                                	newLeafNode(otherlv_3, grammarAccess.getArithmeticOperationAccess().getNswKeyword_3_0_0());
                                

                            }
                            break;
                        case 2 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3379:7: otherlv_4= 'nuw'
                            {
                            otherlv_4=(Token)match(input,111,FOLLOW_111_in_ruleArithmeticOperation8048); 

                                	newLeafNode(otherlv_4, grammarAccess.getArithmeticOperationAccess().getNuwKeyword_3_0_1());
                                

                            }
                            break;

                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3383:2: (otherlv_5= 'nuw' | otherlv_6= 'nsw' )?
                    int alt77=3;
                    int LA77_0 = input.LA(1);

                    if ( (LA77_0==111) ) {
                        alt77=1;
                    }
                    else if ( (LA77_0==110) ) {
                        alt77=2;
                    }
                    switch (alt77) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3383:4: otherlv_5= 'nuw'
                            {
                            otherlv_5=(Token)match(input,111,FOLLOW_111_in_ruleArithmeticOperation8062); 

                                	newLeafNode(otherlv_5, grammarAccess.getArithmeticOperationAccess().getNuwKeyword_3_1_0());
                                

                            }
                            break;
                        case 2 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3388:7: otherlv_6= 'nsw'
                            {
                            otherlv_6=(Token)match(input,110,FOLLOW_110_in_ruleArithmeticOperation8080); 

                                	newLeafNode(otherlv_6, grammarAccess.getArithmeticOperationAccess().getNswKeyword_3_1_1());
                                

                            }
                            break;

                    }


                    }
                    break;

            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3392:5: ( (lv_optype_7_0= ruleTypeUse ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3393:1: (lv_optype_7_0= ruleTypeUse )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3393:1: (lv_optype_7_0= ruleTypeUse )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3394:3: lv_optype_7_0= ruleTypeUse
            {
             
            	        newCompositeNode(grammarAccess.getArithmeticOperationAccess().getOptypeTypeUseParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeUse_in_ruleArithmeticOperation8105);
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

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3410:2: ( (lv_value1_8_0= ruleValue ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3411:1: (lv_value1_8_0= ruleValue )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3411:1: (lv_value1_8_0= ruleValue )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3412:3: lv_value1_8_0= ruleValue
            {
             
            	        newCompositeNode(grammarAccess.getArithmeticOperationAccess().getValue1ValueParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleValue_in_ruleArithmeticOperation8126);
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

            otherlv_9=(Token)match(input,80,FOLLOW_80_in_ruleArithmeticOperation8138); 

                	newLeafNode(otherlv_9, grammarAccess.getArithmeticOperationAccess().getCommaKeyword_6());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3432:1: ( (lv_value2_10_0= ruleValue ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3433:1: (lv_value2_10_0= ruleValue )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3433:1: (lv_value2_10_0= ruleValue )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3434:3: lv_value2_10_0= ruleValue
            {
             
            	        newCompositeNode(grammarAccess.getArithmeticOperationAccess().getValue2ValueParserRuleCall_7_0()); 
            	    
            pushFollow(FOLLOW_ruleValue_in_ruleArithmeticOperation8159);
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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3458:1: entryRuleLogicOperation returns [EObject current=null] : iv_ruleLogicOperation= ruleLogicOperation EOF ;
    public final EObject entryRuleLogicOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicOperation = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3459:2: (iv_ruleLogicOperation= ruleLogicOperation EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3460:2: iv_ruleLogicOperation= ruleLogicOperation EOF
            {
             newCompositeNode(grammarAccess.getLogicOperationRule()); 
            pushFollow(FOLLOW_ruleLogicOperation_in_entryRuleLogicOperation8195);
            iv_ruleLogicOperation=ruleLogicOperation();

            state._fsp--;

             current =iv_ruleLogicOperation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLogicOperation8205); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3467:1: ruleLogicOperation returns [EObject current=null] : ( ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' ( ( (lv_operation_2_1= 'shl' | lv_operation_2_2= 'lshr' | lv_operation_2_3= 'ashr' | lv_operation_2_4= 'and' | lv_operation_2_5= 'or' | lv_operation_2_6= 'xor' ) ) ) ( (lv_optype_3_0= ruleTypeUse ) ) ( (lv_value1_4_0= ruleValue ) ) otherlv_5= ',' ( (lv_value2_6_0= ruleValue ) ) ) ;
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
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3470:28: ( ( ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' ( ( (lv_operation_2_1= 'shl' | lv_operation_2_2= 'lshr' | lv_operation_2_3= 'ashr' | lv_operation_2_4= 'and' | lv_operation_2_5= 'or' | lv_operation_2_6= 'xor' ) ) ) ( (lv_optype_3_0= ruleTypeUse ) ) ( (lv_value1_4_0= ruleValue ) ) otherlv_5= ',' ( (lv_value2_6_0= ruleValue ) ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3471:1: ( ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' ( ( (lv_operation_2_1= 'shl' | lv_operation_2_2= 'lshr' | lv_operation_2_3= 'ashr' | lv_operation_2_4= 'and' | lv_operation_2_5= 'or' | lv_operation_2_6= 'xor' ) ) ) ( (lv_optype_3_0= ruleTypeUse ) ) ( (lv_value1_4_0= ruleValue ) ) otherlv_5= ',' ( (lv_value2_6_0= ruleValue ) ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3471:1: ( ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' ( ( (lv_operation_2_1= 'shl' | lv_operation_2_2= 'lshr' | lv_operation_2_3= 'ashr' | lv_operation_2_4= 'and' | lv_operation_2_5= 'or' | lv_operation_2_6= 'xor' ) ) ) ( (lv_optype_3_0= ruleTypeUse ) ) ( (lv_value1_4_0= ruleValue ) ) otherlv_5= ',' ( (lv_value2_6_0= ruleValue ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3471:2: ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' ( ( (lv_operation_2_1= 'shl' | lv_operation_2_2= 'lshr' | lv_operation_2_3= 'ashr' | lv_operation_2_4= 'and' | lv_operation_2_5= 'or' | lv_operation_2_6= 'xor' ) ) ) ( (lv_optype_3_0= ruleTypeUse ) ) ( (lv_value1_4_0= ruleValue ) ) otherlv_5= ',' ( (lv_value2_6_0= ruleValue ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3471:2: ( (lv_result_0_0= ruleAddress ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3472:1: (lv_result_0_0= ruleAddress )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3472:1: (lv_result_0_0= ruleAddress )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3473:3: lv_result_0_0= ruleAddress
            {
             
            	        newCompositeNode(grammarAccess.getLogicOperationAccess().getResultAddressParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleAddress_in_ruleLogicOperation8251);
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

            otherlv_1=(Token)match(input,77,FOLLOW_77_in_ruleLogicOperation8263); 

                	newLeafNode(otherlv_1, grammarAccess.getLogicOperationAccess().getEqualsSignKeyword_1());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3493:1: ( ( (lv_operation_2_1= 'shl' | lv_operation_2_2= 'lshr' | lv_operation_2_3= 'ashr' | lv_operation_2_4= 'and' | lv_operation_2_5= 'or' | lv_operation_2_6= 'xor' ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3494:1: ( (lv_operation_2_1= 'shl' | lv_operation_2_2= 'lshr' | lv_operation_2_3= 'ashr' | lv_operation_2_4= 'and' | lv_operation_2_5= 'or' | lv_operation_2_6= 'xor' ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3494:1: ( (lv_operation_2_1= 'shl' | lv_operation_2_2= 'lshr' | lv_operation_2_3= 'ashr' | lv_operation_2_4= 'and' | lv_operation_2_5= 'or' | lv_operation_2_6= 'xor' ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3495:1: (lv_operation_2_1= 'shl' | lv_operation_2_2= 'lshr' | lv_operation_2_3= 'ashr' | lv_operation_2_4= 'and' | lv_operation_2_5= 'or' | lv_operation_2_6= 'xor' )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3495:1: (lv_operation_2_1= 'shl' | lv_operation_2_2= 'lshr' | lv_operation_2_3= 'ashr' | lv_operation_2_4= 'and' | lv_operation_2_5= 'or' | lv_operation_2_6= 'xor' )
            int alt79=6;
            switch ( input.LA(1) ) {
            case 112:
                {
                alt79=1;
                }
                break;
            case 113:
                {
                alt79=2;
                }
                break;
            case 114:
                {
                alt79=3;
                }
                break;
            case 115:
                {
                alt79=4;
                }
                break;
            case 116:
                {
                alt79=5;
                }
                break;
            case 117:
                {
                alt79=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 79, 0, input);

                throw nvae;
            }

            switch (alt79) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3496:3: lv_operation_2_1= 'shl'
                    {
                    lv_operation_2_1=(Token)match(input,112,FOLLOW_112_in_ruleLogicOperation8283); 

                            newLeafNode(lv_operation_2_1, grammarAccess.getLogicOperationAccess().getOperationShlKeyword_2_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLogicOperationRule());
                    	        }
                           		setWithLastConsumed(current, "operation", lv_operation_2_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3508:8: lv_operation_2_2= 'lshr'
                    {
                    lv_operation_2_2=(Token)match(input,113,FOLLOW_113_in_ruleLogicOperation8312); 

                            newLeafNode(lv_operation_2_2, grammarAccess.getLogicOperationAccess().getOperationLshrKeyword_2_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLogicOperationRule());
                    	        }
                           		setWithLastConsumed(current, "operation", lv_operation_2_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3520:8: lv_operation_2_3= 'ashr'
                    {
                    lv_operation_2_3=(Token)match(input,114,FOLLOW_114_in_ruleLogicOperation8341); 

                            newLeafNode(lv_operation_2_3, grammarAccess.getLogicOperationAccess().getOperationAshrKeyword_2_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLogicOperationRule());
                    	        }
                           		setWithLastConsumed(current, "operation", lv_operation_2_3, null);
                    	    

                    }
                    break;
                case 4 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3532:8: lv_operation_2_4= 'and'
                    {
                    lv_operation_2_4=(Token)match(input,115,FOLLOW_115_in_ruleLogicOperation8370); 

                            newLeafNode(lv_operation_2_4, grammarAccess.getLogicOperationAccess().getOperationAndKeyword_2_0_3());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLogicOperationRule());
                    	        }
                           		setWithLastConsumed(current, "operation", lv_operation_2_4, null);
                    	    

                    }
                    break;
                case 5 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3544:8: lv_operation_2_5= 'or'
                    {
                    lv_operation_2_5=(Token)match(input,116,FOLLOW_116_in_ruleLogicOperation8399); 

                            newLeafNode(lv_operation_2_5, grammarAccess.getLogicOperationAccess().getOperationOrKeyword_2_0_4());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLogicOperationRule());
                    	        }
                           		setWithLastConsumed(current, "operation", lv_operation_2_5, null);
                    	    

                    }
                    break;
                case 6 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3556:8: lv_operation_2_6= 'xor'
                    {
                    lv_operation_2_6=(Token)match(input,117,FOLLOW_117_in_ruleLogicOperation8428); 

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

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3571:2: ( (lv_optype_3_0= ruleTypeUse ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3572:1: (lv_optype_3_0= ruleTypeUse )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3572:1: (lv_optype_3_0= ruleTypeUse )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3573:3: lv_optype_3_0= ruleTypeUse
            {
             
            	        newCompositeNode(grammarAccess.getLogicOperationAccess().getOptypeTypeUseParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeUse_in_ruleLogicOperation8465);
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

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3589:2: ( (lv_value1_4_0= ruleValue ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3590:1: (lv_value1_4_0= ruleValue )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3590:1: (lv_value1_4_0= ruleValue )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3591:3: lv_value1_4_0= ruleValue
            {
             
            	        newCompositeNode(grammarAccess.getLogicOperationAccess().getValue1ValueParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleValue_in_ruleLogicOperation8486);
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

            otherlv_5=(Token)match(input,80,FOLLOW_80_in_ruleLogicOperation8498); 

                	newLeafNode(otherlv_5, grammarAccess.getLogicOperationAccess().getCommaKeyword_5());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3611:1: ( (lv_value2_6_0= ruleValue ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3612:1: (lv_value2_6_0= ruleValue )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3612:1: (lv_value2_6_0= ruleValue )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3613:3: lv_value2_6_0= ruleValue
            {
             
            	        newCompositeNode(grammarAccess.getLogicOperationAccess().getValue2ValueParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleValue_in_ruleLogicOperation8519);
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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3637:1: entryRuleCast returns [EObject current=null] : iv_ruleCast= ruleCast EOF ;
    public final EObject entryRuleCast() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCast = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3638:2: (iv_ruleCast= ruleCast EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3639:2: iv_ruleCast= ruleCast EOF
            {
             newCompositeNode(grammarAccess.getCastRule()); 
            pushFollow(FOLLOW_ruleCast_in_entryRuleCast8555);
            iv_ruleCast=ruleCast();

            state._fsp--;

             current =iv_ruleCast; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCast8565); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3646:1: ruleCast returns [EObject current=null] : ( ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' ( (lv_operation_2_0= RULE_CAST_OP ) ) ( ( (lv_from_3_1= ruleTypeUse | lv_from_3_2= ruleAggregate_Type ) ) ) ( (lv_value_4_0= ruleValue ) ) otherlv_5= 'to' ( (lv_to_6_0= ruleTypeUse ) ) ) ;
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
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3649:28: ( ( ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' ( (lv_operation_2_0= RULE_CAST_OP ) ) ( ( (lv_from_3_1= ruleTypeUse | lv_from_3_2= ruleAggregate_Type ) ) ) ( (lv_value_4_0= ruleValue ) ) otherlv_5= 'to' ( (lv_to_6_0= ruleTypeUse ) ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3650:1: ( ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' ( (lv_operation_2_0= RULE_CAST_OP ) ) ( ( (lv_from_3_1= ruleTypeUse | lv_from_3_2= ruleAggregate_Type ) ) ) ( (lv_value_4_0= ruleValue ) ) otherlv_5= 'to' ( (lv_to_6_0= ruleTypeUse ) ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3650:1: ( ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' ( (lv_operation_2_0= RULE_CAST_OP ) ) ( ( (lv_from_3_1= ruleTypeUse | lv_from_3_2= ruleAggregate_Type ) ) ) ( (lv_value_4_0= ruleValue ) ) otherlv_5= 'to' ( (lv_to_6_0= ruleTypeUse ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3650:2: ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' ( (lv_operation_2_0= RULE_CAST_OP ) ) ( ( (lv_from_3_1= ruleTypeUse | lv_from_3_2= ruleAggregate_Type ) ) ) ( (lv_value_4_0= ruleValue ) ) otherlv_5= 'to' ( (lv_to_6_0= ruleTypeUse ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3650:2: ( (lv_result_0_0= ruleAddress ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3651:1: (lv_result_0_0= ruleAddress )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3651:1: (lv_result_0_0= ruleAddress )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3652:3: lv_result_0_0= ruleAddress
            {
             
            	        newCompositeNode(grammarAccess.getCastAccess().getResultAddressParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleAddress_in_ruleCast8611);
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

            otherlv_1=(Token)match(input,77,FOLLOW_77_in_ruleCast8623); 

                	newLeafNode(otherlv_1, grammarAccess.getCastAccess().getEqualsSignKeyword_1());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3672:1: ( (lv_operation_2_0= RULE_CAST_OP ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3673:1: (lv_operation_2_0= RULE_CAST_OP )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3673:1: (lv_operation_2_0= RULE_CAST_OP )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3674:3: lv_operation_2_0= RULE_CAST_OP
            {
            lv_operation_2_0=(Token)match(input,RULE_CAST_OP,FOLLOW_RULE_CAST_OP_in_ruleCast8640); 

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

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3690:2: ( ( (lv_from_3_1= ruleTypeUse | lv_from_3_2= ruleAggregate_Type ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3691:1: ( (lv_from_3_1= ruleTypeUse | lv_from_3_2= ruleAggregate_Type ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3691:1: ( (lv_from_3_1= ruleTypeUse | lv_from_3_2= ruleAggregate_Type ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3692:1: (lv_from_3_1= ruleTypeUse | lv_from_3_2= ruleAggregate_Type )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3692:1: (lv_from_3_1= ruleTypeUse | lv_from_3_2= ruleAggregate_Type )
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==RULE_INT_TYPE||LA80_0==RULE_VALID_ID||(LA80_0>=RULE_PRIMITIVE_VALUE && LA80_0<=RULE_FLOATING_POINT_TYPE)) ) {
                alt80=1;
            }
            else if ( (LA80_0==46||LA80_0==79||(LA80_0>=94 && LA80_0<=95)) ) {
                alt80=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 80, 0, input);

                throw nvae;
            }
            switch (alt80) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3693:3: lv_from_3_1= ruleTypeUse
                    {
                     
                    	        newCompositeNode(grammarAccess.getCastAccess().getFromTypeUseParserRuleCall_3_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTypeUse_in_ruleCast8668);
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
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3708:8: lv_from_3_2= ruleAggregate_Type
                    {
                     
                    	        newCompositeNode(grammarAccess.getCastAccess().getFromAggregate_TypeParserRuleCall_3_0_1()); 
                    	    
                    pushFollow(FOLLOW_ruleAggregate_Type_in_ruleCast8687);
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

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3726:2: ( (lv_value_4_0= ruleValue ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3727:1: (lv_value_4_0= ruleValue )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3727:1: (lv_value_4_0= ruleValue )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3728:3: lv_value_4_0= ruleValue
            {
             
            	        newCompositeNode(grammarAccess.getCastAccess().getValueValueParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleValue_in_ruleCast8711);
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

            otherlv_5=(Token)match(input,118,FOLLOW_118_in_ruleCast8723); 

                	newLeafNode(otherlv_5, grammarAccess.getCastAccess().getToKeyword_5());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3748:1: ( (lv_to_6_0= ruleTypeUse ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3749:1: (lv_to_6_0= ruleTypeUse )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3749:1: (lv_to_6_0= ruleTypeUse )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3750:3: lv_to_6_0= ruleTypeUse
            {
             
            	        newCompositeNode(grammarAccess.getCastAccess().getToTypeUseParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeUse_in_ruleCast8744);
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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3774:1: entryRuleNestedCast returns [EObject current=null] : iv_ruleNestedCast= ruleNestedCast EOF ;
    public final EObject entryRuleNestedCast() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNestedCast = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3775:2: (iv_ruleNestedCast= ruleNestedCast EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3776:2: iv_ruleNestedCast= ruleNestedCast EOF
            {
             newCompositeNode(grammarAccess.getNestedCastRule()); 
            pushFollow(FOLLOW_ruleNestedCast_in_entryRuleNestedCast8780);
            iv_ruleNestedCast=ruleNestedCast();

            state._fsp--;

             current =iv_ruleNestedCast; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNestedCast8790); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3783:1: ruleNestedCast returns [EObject current=null] : ( ( (lv_operation_0_0= RULE_CAST_OP ) ) otherlv_1= '(' ( ( (lv_from_2_1= ruleTypeUse | lv_from_2_2= ruleAggregate_Type ) ) ) ( (lv_value_3_0= ruleValue ) ) otherlv_4= 'to' ( (lv_to_5_0= ruleTypeUse ) ) otherlv_6= ')' ) ;
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
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3786:28: ( ( ( (lv_operation_0_0= RULE_CAST_OP ) ) otherlv_1= '(' ( ( (lv_from_2_1= ruleTypeUse | lv_from_2_2= ruleAggregate_Type ) ) ) ( (lv_value_3_0= ruleValue ) ) otherlv_4= 'to' ( (lv_to_5_0= ruleTypeUse ) ) otherlv_6= ')' ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3787:1: ( ( (lv_operation_0_0= RULE_CAST_OP ) ) otherlv_1= '(' ( ( (lv_from_2_1= ruleTypeUse | lv_from_2_2= ruleAggregate_Type ) ) ) ( (lv_value_3_0= ruleValue ) ) otherlv_4= 'to' ( (lv_to_5_0= ruleTypeUse ) ) otherlv_6= ')' )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3787:1: ( ( (lv_operation_0_0= RULE_CAST_OP ) ) otherlv_1= '(' ( ( (lv_from_2_1= ruleTypeUse | lv_from_2_2= ruleAggregate_Type ) ) ) ( (lv_value_3_0= ruleValue ) ) otherlv_4= 'to' ( (lv_to_5_0= ruleTypeUse ) ) otherlv_6= ')' )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3787:2: ( (lv_operation_0_0= RULE_CAST_OP ) ) otherlv_1= '(' ( ( (lv_from_2_1= ruleTypeUse | lv_from_2_2= ruleAggregate_Type ) ) ) ( (lv_value_3_0= ruleValue ) ) otherlv_4= 'to' ( (lv_to_5_0= ruleTypeUse ) ) otherlv_6= ')'
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3787:2: ( (lv_operation_0_0= RULE_CAST_OP ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3788:1: (lv_operation_0_0= RULE_CAST_OP )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3788:1: (lv_operation_0_0= RULE_CAST_OP )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3789:3: lv_operation_0_0= RULE_CAST_OP
            {
            lv_operation_0_0=(Token)match(input,RULE_CAST_OP,FOLLOW_RULE_CAST_OP_in_ruleNestedCast8832); 

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

            otherlv_1=(Token)match(input,50,FOLLOW_50_in_ruleNestedCast8849); 

                	newLeafNode(otherlv_1, grammarAccess.getNestedCastAccess().getLeftParenthesisKeyword_1());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3809:1: ( ( (lv_from_2_1= ruleTypeUse | lv_from_2_2= ruleAggregate_Type ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3810:1: ( (lv_from_2_1= ruleTypeUse | lv_from_2_2= ruleAggregate_Type ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3810:1: ( (lv_from_2_1= ruleTypeUse | lv_from_2_2= ruleAggregate_Type ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3811:1: (lv_from_2_1= ruleTypeUse | lv_from_2_2= ruleAggregate_Type )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3811:1: (lv_from_2_1= ruleTypeUse | lv_from_2_2= ruleAggregate_Type )
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==RULE_INT_TYPE||LA81_0==RULE_VALID_ID||(LA81_0>=RULE_PRIMITIVE_VALUE && LA81_0<=RULE_FLOATING_POINT_TYPE)) ) {
                alt81=1;
            }
            else if ( (LA81_0==46||LA81_0==79||(LA81_0>=94 && LA81_0<=95)) ) {
                alt81=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 81, 0, input);

                throw nvae;
            }
            switch (alt81) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3812:3: lv_from_2_1= ruleTypeUse
                    {
                     
                    	        newCompositeNode(grammarAccess.getNestedCastAccess().getFromTypeUseParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTypeUse_in_ruleNestedCast8872);
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
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3827:8: lv_from_2_2= ruleAggregate_Type
                    {
                     
                    	        newCompositeNode(grammarAccess.getNestedCastAccess().getFromAggregate_TypeParserRuleCall_2_0_1()); 
                    	    
                    pushFollow(FOLLOW_ruleAggregate_Type_in_ruleNestedCast8891);
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

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3845:2: ( (lv_value_3_0= ruleValue ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3846:1: (lv_value_3_0= ruleValue )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3846:1: (lv_value_3_0= ruleValue )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3847:3: lv_value_3_0= ruleValue
            {
             
            	        newCompositeNode(grammarAccess.getNestedCastAccess().getValueValueParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleValue_in_ruleNestedCast8915);
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

            otherlv_4=(Token)match(input,118,FOLLOW_118_in_ruleNestedCast8927); 

                	newLeafNode(otherlv_4, grammarAccess.getNestedCastAccess().getToKeyword_4());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3867:1: ( (lv_to_5_0= ruleTypeUse ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3868:1: (lv_to_5_0= ruleTypeUse )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3868:1: (lv_to_5_0= ruleTypeUse )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3869:3: lv_to_5_0= ruleTypeUse
            {
             
            	        newCompositeNode(grammarAccess.getNestedCastAccess().getToTypeUseParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeUse_in_ruleNestedCast8948);
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

            otherlv_6=(Token)match(input,51,FOLLOW_51_in_ruleNestedCast8960); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3897:1: entryRuleMetaArgValue returns [EObject current=null] : iv_ruleMetaArgValue= ruleMetaArgValue EOF ;
    public final EObject entryRuleMetaArgValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetaArgValue = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3898:2: (iv_ruleMetaArgValue= ruleMetaArgValue EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3899:2: iv_ruleMetaArgValue= ruleMetaArgValue EOF
            {
             newCompositeNode(grammarAccess.getMetaArgValueRule()); 
            pushFollow(FOLLOW_ruleMetaArgValue_in_entryRuleMetaArgValue8996);
            iv_ruleMetaArgValue=ruleMetaArgValue();

            state._fsp--;

             current =iv_ruleMetaArgValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMetaArgValue9006); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3906:1: ruleMetaArgValue returns [EObject current=null] : ( ( (lv_arg_0_0= RULE_METADATA ) ) ( ( (lv_value_1_1= RULE_METADATA | lv_value_1_2= RULE_STRING ) ) ) ) ;
    public final EObject ruleMetaArgValue() throws RecognitionException {
        EObject current = null;

        Token lv_arg_0_0=null;
        Token lv_value_1_1=null;
        Token lv_value_1_2=null;

         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3909:28: ( ( ( (lv_arg_0_0= RULE_METADATA ) ) ( ( (lv_value_1_1= RULE_METADATA | lv_value_1_2= RULE_STRING ) ) ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3910:1: ( ( (lv_arg_0_0= RULE_METADATA ) ) ( ( (lv_value_1_1= RULE_METADATA | lv_value_1_2= RULE_STRING ) ) ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3910:1: ( ( (lv_arg_0_0= RULE_METADATA ) ) ( ( (lv_value_1_1= RULE_METADATA | lv_value_1_2= RULE_STRING ) ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3910:2: ( (lv_arg_0_0= RULE_METADATA ) ) ( ( (lv_value_1_1= RULE_METADATA | lv_value_1_2= RULE_STRING ) ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3910:2: ( (lv_arg_0_0= RULE_METADATA ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3911:1: (lv_arg_0_0= RULE_METADATA )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3911:1: (lv_arg_0_0= RULE_METADATA )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3912:3: lv_arg_0_0= RULE_METADATA
            {
            lv_arg_0_0=(Token)match(input,RULE_METADATA,FOLLOW_RULE_METADATA_in_ruleMetaArgValue9048); 

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

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3928:2: ( ( (lv_value_1_1= RULE_METADATA | lv_value_1_2= RULE_STRING ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3929:1: ( (lv_value_1_1= RULE_METADATA | lv_value_1_2= RULE_STRING ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3929:1: ( (lv_value_1_1= RULE_METADATA | lv_value_1_2= RULE_STRING ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3930:1: (lv_value_1_1= RULE_METADATA | lv_value_1_2= RULE_STRING )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3930:1: (lv_value_1_1= RULE_METADATA | lv_value_1_2= RULE_STRING )
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==RULE_METADATA) ) {
                alt82=1;
            }
            else if ( (LA82_0==RULE_STRING) ) {
                alt82=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 82, 0, input);

                throw nvae;
            }
            switch (alt82) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3931:3: lv_value_1_1= RULE_METADATA
                    {
                    lv_value_1_1=(Token)match(input,RULE_METADATA,FOLLOW_RULE_METADATA_in_ruleMetaArgValue9072); 

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
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3946:8: lv_value_1_2= RULE_STRING
                    {
                    lv_value_1_2=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMetaArgValue9092); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3972:1: entryRuleMeta returns [EObject current=null] : iv_ruleMeta= ruleMeta EOF ;
    public final EObject entryRuleMeta() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMeta = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3973:2: (iv_ruleMeta= ruleMeta EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3974:2: iv_ruleMeta= ruleMeta EOF
            {
             newCompositeNode(grammarAccess.getMetaRule()); 
            pushFollow(FOLLOW_ruleMeta_in_entryRuleMeta9136);
            iv_ruleMeta=ruleMeta();

            state._fsp--;

             current =iv_ruleMeta; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMeta9146); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3981:1: ruleMeta returns [EObject current=null] : ( (otherlv_0= 'metadata' ( (lv_meta_1_0= RULE_METADATA ) ) ) | ( ( (lv_arg_2_0= rulePredefined ) )? ( (lv_value_3_0= ruleValue ) ) ) ) ;
    public final EObject ruleMeta() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_meta_1_0=null;
        EObject lv_arg_2_0 = null;

        EObject lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3984:28: ( ( (otherlv_0= 'metadata' ( (lv_meta_1_0= RULE_METADATA ) ) ) | ( ( (lv_arg_2_0= rulePredefined ) )? ( (lv_value_3_0= ruleValue ) ) ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3985:1: ( (otherlv_0= 'metadata' ( (lv_meta_1_0= RULE_METADATA ) ) ) | ( ( (lv_arg_2_0= rulePredefined ) )? ( (lv_value_3_0= ruleValue ) ) ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3985:1: ( (otherlv_0= 'metadata' ( (lv_meta_1_0= RULE_METADATA ) ) ) | ( ( (lv_arg_2_0= rulePredefined ) )? ( (lv_value_3_0= ruleValue ) ) ) )
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==119) ) {
                alt84=1;
            }
            else if ( (LA84_0==RULE_INT||LA84_0==RULE_CAST_OP||LA84_0==RULE_INT_TYPE||LA84_0==RULE_BOOL||LA84_0==RULE_STRING||LA84_0==RULE_VALID_ID||(LA84_0>=RULE_PRIMITIVE_VALUE && LA84_0<=RULE_INITIALIZER)||LA84_0==29||LA84_0==95||LA84_0==122) ) {
                alt84=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 84, 0, input);

                throw nvae;
            }
            switch (alt84) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3985:2: (otherlv_0= 'metadata' ( (lv_meta_1_0= RULE_METADATA ) ) )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3985:2: (otherlv_0= 'metadata' ( (lv_meta_1_0= RULE_METADATA ) ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3985:4: otherlv_0= 'metadata' ( (lv_meta_1_0= RULE_METADATA ) )
                    {
                    otherlv_0=(Token)match(input,119,FOLLOW_119_in_ruleMeta9184); 

                        	newLeafNode(otherlv_0, grammarAccess.getMetaAccess().getMetadataKeyword_0_0());
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3989:1: ( (lv_meta_1_0= RULE_METADATA ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3990:1: (lv_meta_1_0= RULE_METADATA )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3990:1: (lv_meta_1_0= RULE_METADATA )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3991:3: lv_meta_1_0= RULE_METADATA
                    {
                    lv_meta_1_0=(Token)match(input,RULE_METADATA,FOLLOW_RULE_METADATA_in_ruleMeta9201); 

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
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4008:6: ( ( (lv_arg_2_0= rulePredefined ) )? ( (lv_value_3_0= ruleValue ) ) )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4008:6: ( ( (lv_arg_2_0= rulePredefined ) )? ( (lv_value_3_0= ruleValue ) ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4008:7: ( (lv_arg_2_0= rulePredefined ) )? ( (lv_value_3_0= ruleValue ) )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4008:7: ( (lv_arg_2_0= rulePredefined ) )?
                    int alt83=2;
                    int LA83_0 = input.LA(1);

                    if ( (LA83_0==RULE_PRIMITIVE_VALUE) ) {
                        int LA83_1 = input.LA(2);

                        if ( (LA83_1==RULE_INT||LA83_1==RULE_CAST_OP||LA83_1==RULE_BOOL||LA83_1==RULE_STRING||(LA83_1>=RULE_VALID_ID && LA83_1<=RULE_PRIMITIVE_VALUE)||LA83_1==RULE_INITIALIZER||LA83_1==29||LA83_1==95||LA83_1==122) ) {
                            alt83=1;
                        }
                    }
                    else if ( (LA83_0==RULE_INT_TYPE||LA83_0==RULE_FLOATING_POINT_TYPE) ) {
                        alt83=1;
                    }
                    switch (alt83) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4009:1: (lv_arg_2_0= rulePredefined )
                            {
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4009:1: (lv_arg_2_0= rulePredefined )
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4010:3: lv_arg_2_0= rulePredefined
                            {
                             
                            	        newCompositeNode(grammarAccess.getMetaAccess().getArgPredefinedParserRuleCall_1_0_0()); 
                            	    
                            pushFollow(FOLLOW_rulePredefined_in_ruleMeta9235);
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

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4026:3: ( (lv_value_3_0= ruleValue ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4027:1: (lv_value_3_0= ruleValue )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4027:1: (lv_value_3_0= ruleValue )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4028:3: lv_value_3_0= ruleValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getMetaAccess().getValueValueParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleValue_in_ruleMeta9257);
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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4052:1: entryRuleMetadataValue returns [EObject current=null] : iv_ruleMetadataValue= ruleMetadataValue EOF ;
    public final EObject entryRuleMetadataValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetadataValue = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4053:2: (iv_ruleMetadataValue= ruleMetadataValue EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4054:2: iv_ruleMetadataValue= ruleMetadataValue EOF
            {
             newCompositeNode(grammarAccess.getMetadataValueRule()); 
            pushFollow(FOLLOW_ruleMetadataValue_in_entryRuleMetadataValue9294);
            iv_ruleMetadataValue=ruleMetadataValue();

            state._fsp--;

             current =iv_ruleMetadataValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMetadataValue9304); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4061:1: ruleMetadataValue returns [EObject current=null] : ( ( (lv_nodeId_0_0= RULE_METADATA ) ) otherlv_1= '=' (otherlv_2= 'metadata' )? ( (otherlv_3= '!' otherlv_4= '{' ) | otherlv_5= '!{' ) ( (lv_values_6_0= ruleMeta ) ) (otherlv_7= ',' ( (lv_values_8_0= ruleMeta ) ) )* otherlv_9= '}' ) ;
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
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4064:28: ( ( ( (lv_nodeId_0_0= RULE_METADATA ) ) otherlv_1= '=' (otherlv_2= 'metadata' )? ( (otherlv_3= '!' otherlv_4= '{' ) | otherlv_5= '!{' ) ( (lv_values_6_0= ruleMeta ) ) (otherlv_7= ',' ( (lv_values_8_0= ruleMeta ) ) )* otherlv_9= '}' ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4065:1: ( ( (lv_nodeId_0_0= RULE_METADATA ) ) otherlv_1= '=' (otherlv_2= 'metadata' )? ( (otherlv_3= '!' otherlv_4= '{' ) | otherlv_5= '!{' ) ( (lv_values_6_0= ruleMeta ) ) (otherlv_7= ',' ( (lv_values_8_0= ruleMeta ) ) )* otherlv_9= '}' )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4065:1: ( ( (lv_nodeId_0_0= RULE_METADATA ) ) otherlv_1= '=' (otherlv_2= 'metadata' )? ( (otherlv_3= '!' otherlv_4= '{' ) | otherlv_5= '!{' ) ( (lv_values_6_0= ruleMeta ) ) (otherlv_7= ',' ( (lv_values_8_0= ruleMeta ) ) )* otherlv_9= '}' )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4065:2: ( (lv_nodeId_0_0= RULE_METADATA ) ) otherlv_1= '=' (otherlv_2= 'metadata' )? ( (otherlv_3= '!' otherlv_4= '{' ) | otherlv_5= '!{' ) ( (lv_values_6_0= ruleMeta ) ) (otherlv_7= ',' ( (lv_values_8_0= ruleMeta ) ) )* otherlv_9= '}'
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4065:2: ( (lv_nodeId_0_0= RULE_METADATA ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4066:1: (lv_nodeId_0_0= RULE_METADATA )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4066:1: (lv_nodeId_0_0= RULE_METADATA )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4067:3: lv_nodeId_0_0= RULE_METADATA
            {
            lv_nodeId_0_0=(Token)match(input,RULE_METADATA,FOLLOW_RULE_METADATA_in_ruleMetadataValue9346); 

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

            otherlv_1=(Token)match(input,77,FOLLOW_77_in_ruleMetadataValue9363); 

                	newLeafNode(otherlv_1, grammarAccess.getMetadataValueAccess().getEqualsSignKeyword_1());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4087:1: (otherlv_2= 'metadata' )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==119) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4087:3: otherlv_2= 'metadata'
                    {
                    otherlv_2=(Token)match(input,119,FOLLOW_119_in_ruleMetadataValue9376); 

                        	newLeafNode(otherlv_2, grammarAccess.getMetadataValueAccess().getMetadataKeyword_2());
                        

                    }
                    break;

            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4091:3: ( (otherlv_3= '!' otherlv_4= '{' ) | otherlv_5= '!{' )
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==120) ) {
                alt86=1;
            }
            else if ( (LA86_0==121) ) {
                alt86=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 86, 0, input);

                throw nvae;
            }
            switch (alt86) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4091:4: (otherlv_3= '!' otherlv_4= '{' )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4091:4: (otherlv_3= '!' otherlv_4= '{' )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4091:6: otherlv_3= '!' otherlv_4= '{'
                    {
                    otherlv_3=(Token)match(input,120,FOLLOW_120_in_ruleMetadataValue9392); 

                        	newLeafNode(otherlv_3, grammarAccess.getMetadataValueAccess().getExclamationMarkKeyword_3_0_0());
                        
                    otherlv_4=(Token)match(input,95,FOLLOW_95_in_ruleMetadataValue9404); 

                        	newLeafNode(otherlv_4, grammarAccess.getMetadataValueAccess().getLeftCurlyBracketKeyword_3_0_1());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4100:7: otherlv_5= '!{'
                    {
                    otherlv_5=(Token)match(input,121,FOLLOW_121_in_ruleMetadataValue9423); 

                        	newLeafNode(otherlv_5, grammarAccess.getMetadataValueAccess().getExclamationMarkLeftCurlyBracketKeyword_3_1());
                        

                    }
                    break;

            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4104:2: ( (lv_values_6_0= ruleMeta ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4105:1: (lv_values_6_0= ruleMeta )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4105:1: (lv_values_6_0= ruleMeta )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4106:3: lv_values_6_0= ruleMeta
            {
             
            	        newCompositeNode(grammarAccess.getMetadataValueAccess().getValuesMetaParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleMeta_in_ruleMetadataValue9445);
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

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4122:2: (otherlv_7= ',' ( (lv_values_8_0= ruleMeta ) ) )*
            loop87:
            do {
                int alt87=2;
                int LA87_0 = input.LA(1);

                if ( (LA87_0==80) ) {
                    alt87=1;
                }


                switch (alt87) {
            	case 1 :
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4122:4: otherlv_7= ',' ( (lv_values_8_0= ruleMeta ) )
            	    {
            	    otherlv_7=(Token)match(input,80,FOLLOW_80_in_ruleMetadataValue9458); 

            	        	newLeafNode(otherlv_7, grammarAccess.getMetadataValueAccess().getCommaKeyword_5_0());
            	        
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4126:1: ( (lv_values_8_0= ruleMeta ) )
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4127:1: (lv_values_8_0= ruleMeta )
            	    {
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4127:1: (lv_values_8_0= ruleMeta )
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4128:3: lv_values_8_0= ruleMeta
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMetadataValueAccess().getValuesMetaParserRuleCall_5_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMeta_in_ruleMetadataValue9479);
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
            	    break loop87;
                }
            } while (true);

            otherlv_9=(Token)match(input,96,FOLLOW_96_in_ruleMetadataValue9493); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4156:1: entryRuleGetElementPtr returns [EObject current=null] : iv_ruleGetElementPtr= ruleGetElementPtr EOF ;
    public final EObject entryRuleGetElementPtr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGetElementPtr = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4157:2: (iv_ruleGetElementPtr= ruleGetElementPtr EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4158:2: iv_ruleGetElementPtr= ruleGetElementPtr EOF
            {
             newCompositeNode(grammarAccess.getGetElementPtrRule()); 
            pushFollow(FOLLOW_ruleGetElementPtr_in_entryRuleGetElementPtr9529);
            iv_ruleGetElementPtr=ruleGetElementPtr();

            state._fsp--;

             current =iv_ruleGetElementPtr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGetElementPtr9539); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4165:1: ruleGetElementPtr returns [EObject current=null] : ( ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' otherlv_2= 'getelementptr' (otherlv_3= 'inbounds' )? ( ( (lv_aggregate_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_indices_6_0= ruleParameter ) ) )* ) ) ;
    public final EObject ruleGetElementPtr() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_result_0_0 = null;

        EObject lv_aggregate_4_0 = null;

        EObject lv_indices_6_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4168:28: ( ( ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' otherlv_2= 'getelementptr' (otherlv_3= 'inbounds' )? ( ( (lv_aggregate_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_indices_6_0= ruleParameter ) ) )* ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4169:1: ( ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' otherlv_2= 'getelementptr' (otherlv_3= 'inbounds' )? ( ( (lv_aggregate_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_indices_6_0= ruleParameter ) ) )* ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4169:1: ( ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' otherlv_2= 'getelementptr' (otherlv_3= 'inbounds' )? ( ( (lv_aggregate_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_indices_6_0= ruleParameter ) ) )* ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4169:2: ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' otherlv_2= 'getelementptr' (otherlv_3= 'inbounds' )? ( ( (lv_aggregate_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_indices_6_0= ruleParameter ) ) )* )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4169:2: ( (lv_result_0_0= ruleAddress ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4170:1: (lv_result_0_0= ruleAddress )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4170:1: (lv_result_0_0= ruleAddress )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4171:3: lv_result_0_0= ruleAddress
            {
             
            	        newCompositeNode(grammarAccess.getGetElementPtrAccess().getResultAddressParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleAddress_in_ruleGetElementPtr9585);
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

            otherlv_1=(Token)match(input,77,FOLLOW_77_in_ruleGetElementPtr9597); 

                	newLeafNode(otherlv_1, grammarAccess.getGetElementPtrAccess().getEqualsSignKeyword_1());
                
            otherlv_2=(Token)match(input,122,FOLLOW_122_in_ruleGetElementPtr9609); 

                	newLeafNode(otherlv_2, grammarAccess.getGetElementPtrAccess().getGetelementptrKeyword_2());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4195:1: (otherlv_3= 'inbounds' )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==123) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4195:3: otherlv_3= 'inbounds'
                    {
                    otherlv_3=(Token)match(input,123,FOLLOW_123_in_ruleGetElementPtr9622); 

                        	newLeafNode(otherlv_3, grammarAccess.getGetElementPtrAccess().getInboundsKeyword_3());
                        

                    }
                    break;

            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4199:3: ( ( (lv_aggregate_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_indices_6_0= ruleParameter ) ) )* )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4199:4: ( (lv_aggregate_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_indices_6_0= ruleParameter ) ) )*
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4199:4: ( (lv_aggregate_4_0= ruleParameter ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4200:1: (lv_aggregate_4_0= ruleParameter )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4200:1: (lv_aggregate_4_0= ruleParameter )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4201:3: lv_aggregate_4_0= ruleParameter
            {
             
            	        newCompositeNode(grammarAccess.getGetElementPtrAccess().getAggregateParameterParserRuleCall_4_0_0()); 
            	    
            pushFollow(FOLLOW_ruleParameter_in_ruleGetElementPtr9646);
            lv_aggregate_4_0=ruleParameter();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getGetElementPtrRule());
            	        }
                   		set(
                   			current, 
                   			"aggregate",
                    		lv_aggregate_4_0, 
                    		"Parameter");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4217:2: (otherlv_5= ',' ( (lv_indices_6_0= ruleParameter ) ) )*
            loop89:
            do {
                int alt89=2;
                int LA89_0 = input.LA(1);

                if ( (LA89_0==80) ) {
                    alt89=1;
                }


                switch (alt89) {
            	case 1 :
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4217:4: otherlv_5= ',' ( (lv_indices_6_0= ruleParameter ) )
            	    {
            	    otherlv_5=(Token)match(input,80,FOLLOW_80_in_ruleGetElementPtr9659); 

            	        	newLeafNode(otherlv_5, grammarAccess.getGetElementPtrAccess().getCommaKeyword_4_1_0());
            	        
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4221:1: ( (lv_indices_6_0= ruleParameter ) )
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4222:1: (lv_indices_6_0= ruleParameter )
            	    {
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4222:1: (lv_indices_6_0= ruleParameter )
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4223:3: lv_indices_6_0= ruleParameter
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGetElementPtrAccess().getIndicesParameterParserRuleCall_4_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleParameter_in_ruleGetElementPtr9680);
            	    lv_indices_6_0=ruleParameter();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getGetElementPtrRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"indices",
            	            		lv_indices_6_0, 
            	            		"Parameter");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop89;
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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4247:1: entryRuleNestedGetElementPtr returns [EObject current=null] : iv_ruleNestedGetElementPtr= ruleNestedGetElementPtr EOF ;
    public final EObject entryRuleNestedGetElementPtr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNestedGetElementPtr = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4248:2: (iv_ruleNestedGetElementPtr= ruleNestedGetElementPtr EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4249:2: iv_ruleNestedGetElementPtr= ruleNestedGetElementPtr EOF
            {
             newCompositeNode(grammarAccess.getNestedGetElementPtrRule()); 
            pushFollow(FOLLOW_ruleNestedGetElementPtr_in_entryRuleNestedGetElementPtr9719);
            iv_ruleNestedGetElementPtr=ruleNestedGetElementPtr();

            state._fsp--;

             current =iv_ruleNestedGetElementPtr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNestedGetElementPtr9729); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4256:1: ruleNestedGetElementPtr returns [EObject current=null] : (otherlv_0= 'getelementptr' (otherlv_1= 'inbounds' )? (otherlv_2= '(' ( (lv_aggregate_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_indices_5_0= ruleParameter ) ) )* otherlv_6= ')' ) ) ;
    public final EObject ruleNestedGetElementPtr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_aggregate_3_0 = null;

        EObject lv_indices_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4259:28: ( (otherlv_0= 'getelementptr' (otherlv_1= 'inbounds' )? (otherlv_2= '(' ( (lv_aggregate_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_indices_5_0= ruleParameter ) ) )* otherlv_6= ')' ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4260:1: (otherlv_0= 'getelementptr' (otherlv_1= 'inbounds' )? (otherlv_2= '(' ( (lv_aggregate_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_indices_5_0= ruleParameter ) ) )* otherlv_6= ')' ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4260:1: (otherlv_0= 'getelementptr' (otherlv_1= 'inbounds' )? (otherlv_2= '(' ( (lv_aggregate_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_indices_5_0= ruleParameter ) ) )* otherlv_6= ')' ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4260:3: otherlv_0= 'getelementptr' (otherlv_1= 'inbounds' )? (otherlv_2= '(' ( (lv_aggregate_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_indices_5_0= ruleParameter ) ) )* otherlv_6= ')' )
            {
            otherlv_0=(Token)match(input,122,FOLLOW_122_in_ruleNestedGetElementPtr9766); 

                	newLeafNode(otherlv_0, grammarAccess.getNestedGetElementPtrAccess().getGetelementptrKeyword_0());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4264:1: (otherlv_1= 'inbounds' )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==123) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4264:3: otherlv_1= 'inbounds'
                    {
                    otherlv_1=(Token)match(input,123,FOLLOW_123_in_ruleNestedGetElementPtr9779); 

                        	newLeafNode(otherlv_1, grammarAccess.getNestedGetElementPtrAccess().getInboundsKeyword_1());
                        

                    }
                    break;

            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4268:3: (otherlv_2= '(' ( (lv_aggregate_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_indices_5_0= ruleParameter ) ) )* otherlv_6= ')' )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4268:5: otherlv_2= '(' ( (lv_aggregate_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_indices_5_0= ruleParameter ) ) )* otherlv_6= ')'
            {
            otherlv_2=(Token)match(input,50,FOLLOW_50_in_ruleNestedGetElementPtr9794); 

                	newLeafNode(otherlv_2, grammarAccess.getNestedGetElementPtrAccess().getLeftParenthesisKeyword_2_0());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4272:1: ( (lv_aggregate_3_0= ruleParameter ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4273:1: (lv_aggregate_3_0= ruleParameter )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4273:1: (lv_aggregate_3_0= ruleParameter )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4274:3: lv_aggregate_3_0= ruleParameter
            {
             
            	        newCompositeNode(grammarAccess.getNestedGetElementPtrAccess().getAggregateParameterParserRuleCall_2_1_0()); 
            	    
            pushFollow(FOLLOW_ruleParameter_in_ruleNestedGetElementPtr9815);
            lv_aggregate_3_0=ruleParameter();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNestedGetElementPtrRule());
            	        }
                   		set(
                   			current, 
                   			"aggregate",
                    		lv_aggregate_3_0, 
                    		"Parameter");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4290:2: (otherlv_4= ',' ( (lv_indices_5_0= ruleParameter ) ) )*
            loop91:
            do {
                int alt91=2;
                int LA91_0 = input.LA(1);

                if ( (LA91_0==80) ) {
                    alt91=1;
                }


                switch (alt91) {
            	case 1 :
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4290:4: otherlv_4= ',' ( (lv_indices_5_0= ruleParameter ) )
            	    {
            	    otherlv_4=(Token)match(input,80,FOLLOW_80_in_ruleNestedGetElementPtr9828); 

            	        	newLeafNode(otherlv_4, grammarAccess.getNestedGetElementPtrAccess().getCommaKeyword_2_2_0());
            	        
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4294:1: ( (lv_indices_5_0= ruleParameter ) )
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4295:1: (lv_indices_5_0= ruleParameter )
            	    {
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4295:1: (lv_indices_5_0= ruleParameter )
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4296:3: lv_indices_5_0= ruleParameter
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getNestedGetElementPtrAccess().getIndicesParameterParserRuleCall_2_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleParameter_in_ruleNestedGetElementPtr9849);
            	    lv_indices_5_0=ruleParameter();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getNestedGetElementPtrRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"indices",
            	            		lv_indices_5_0, 
            	            		"Parameter");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop91;
                }
            } while (true);

            otherlv_6=(Token)match(input,51,FOLLOW_51_in_ruleNestedGetElementPtr9863); 

                	newLeafNode(otherlv_6, grammarAccess.getNestedGetElementPtrAccess().getRightParenthesisKeyword_2_3());
                

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4324:1: entryRuleFence returns [EObject current=null] : iv_ruleFence= ruleFence EOF ;
    public final EObject entryRuleFence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFence = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4325:2: (iv_ruleFence= ruleFence EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4326:2: iv_ruleFence= ruleFence EOF
            {
             newCompositeNode(grammarAccess.getFenceRule()); 
            pushFollow(FOLLOW_ruleFence_in_entryRuleFence9900);
            iv_ruleFence=ruleFence();

            state._fsp--;

             current =iv_ruleFence; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFence9910); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4333:1: ruleFence returns [EObject current=null] : (otherlv_0= 'fence' (otherlv_1= 'singlethread' )? ( (lv_ordering_2_0= RULE_ATOMIC_ORDERING ) ) ) ;
    public final EObject ruleFence() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_ordering_2_0=null;

         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4336:28: ( (otherlv_0= 'fence' (otherlv_1= 'singlethread' )? ( (lv_ordering_2_0= RULE_ATOMIC_ORDERING ) ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4337:1: (otherlv_0= 'fence' (otherlv_1= 'singlethread' )? ( (lv_ordering_2_0= RULE_ATOMIC_ORDERING ) ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4337:1: (otherlv_0= 'fence' (otherlv_1= 'singlethread' )? ( (lv_ordering_2_0= RULE_ATOMIC_ORDERING ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4337:3: otherlv_0= 'fence' (otherlv_1= 'singlethread' )? ( (lv_ordering_2_0= RULE_ATOMIC_ORDERING ) )
            {
            otherlv_0=(Token)match(input,124,FOLLOW_124_in_ruleFence9947); 

                	newLeafNode(otherlv_0, grammarAccess.getFenceAccess().getFenceKeyword_0());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4341:1: (otherlv_1= 'singlethread' )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==125) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4341:3: otherlv_1= 'singlethread'
                    {
                    otherlv_1=(Token)match(input,125,FOLLOW_125_in_ruleFence9960); 

                        	newLeafNode(otherlv_1, grammarAccess.getFenceAccess().getSinglethreadKeyword_1());
                        

                    }
                    break;

            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4345:3: ( (lv_ordering_2_0= RULE_ATOMIC_ORDERING ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4346:1: (lv_ordering_2_0= RULE_ATOMIC_ORDERING )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4346:1: (lv_ordering_2_0= RULE_ATOMIC_ORDERING )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4347:3: lv_ordering_2_0= RULE_ATOMIC_ORDERING
            {
            lv_ordering_2_0=(Token)match(input,RULE_ATOMIC_ORDERING,FOLLOW_RULE_ATOMIC_ORDERING_in_ruleFence9979); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4371:1: entryRuleCmpXchg returns [EObject current=null] : iv_ruleCmpXchg= ruleCmpXchg EOF ;
    public final EObject entryRuleCmpXchg() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCmpXchg = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4372:2: (iv_ruleCmpXchg= ruleCmpXchg EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4373:2: iv_ruleCmpXchg= ruleCmpXchg EOF
            {
             newCompositeNode(grammarAccess.getCmpXchgRule()); 
            pushFollow(FOLLOW_ruleCmpXchg_in_entryRuleCmpXchg10020);
            iv_ruleCmpXchg=ruleCmpXchg();

            state._fsp--;

             current =iv_ruleCmpXchg; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCmpXchg10030); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4380:1: ruleCmpXchg returns [EObject current=null] : ( ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' otherlv_2= 'cmpxchg' ( (lv_volatile_3_0= 'volatile' ) )? ( (lv_address_4_0= ruleParameter ) ) otherlv_5= ',' ( (lv_value_6_0= ruleParameter ) ) otherlv_7= ',' ( (lv_newValue_8_0= ruleParameter ) ) (otherlv_9= 'singlethread' )? ( (lv_ordering_10_0= RULE_ATOMIC_ORDERING ) ) ) ;
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
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4383:28: ( ( ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' otherlv_2= 'cmpxchg' ( (lv_volatile_3_0= 'volatile' ) )? ( (lv_address_4_0= ruleParameter ) ) otherlv_5= ',' ( (lv_value_6_0= ruleParameter ) ) otherlv_7= ',' ( (lv_newValue_8_0= ruleParameter ) ) (otherlv_9= 'singlethread' )? ( (lv_ordering_10_0= RULE_ATOMIC_ORDERING ) ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4384:1: ( ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' otherlv_2= 'cmpxchg' ( (lv_volatile_3_0= 'volatile' ) )? ( (lv_address_4_0= ruleParameter ) ) otherlv_5= ',' ( (lv_value_6_0= ruleParameter ) ) otherlv_7= ',' ( (lv_newValue_8_0= ruleParameter ) ) (otherlv_9= 'singlethread' )? ( (lv_ordering_10_0= RULE_ATOMIC_ORDERING ) ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4384:1: ( ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' otherlv_2= 'cmpxchg' ( (lv_volatile_3_0= 'volatile' ) )? ( (lv_address_4_0= ruleParameter ) ) otherlv_5= ',' ( (lv_value_6_0= ruleParameter ) ) otherlv_7= ',' ( (lv_newValue_8_0= ruleParameter ) ) (otherlv_9= 'singlethread' )? ( (lv_ordering_10_0= RULE_ATOMIC_ORDERING ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4384:2: ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' otherlv_2= 'cmpxchg' ( (lv_volatile_3_0= 'volatile' ) )? ( (lv_address_4_0= ruleParameter ) ) otherlv_5= ',' ( (lv_value_6_0= ruleParameter ) ) otherlv_7= ',' ( (lv_newValue_8_0= ruleParameter ) ) (otherlv_9= 'singlethread' )? ( (lv_ordering_10_0= RULE_ATOMIC_ORDERING ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4384:2: ( (lv_result_0_0= ruleAddress ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4385:1: (lv_result_0_0= ruleAddress )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4385:1: (lv_result_0_0= ruleAddress )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4386:3: lv_result_0_0= ruleAddress
            {
             
            	        newCompositeNode(grammarAccess.getCmpXchgAccess().getResultAddressParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleAddress_in_ruleCmpXchg10076);
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

            otherlv_1=(Token)match(input,77,FOLLOW_77_in_ruleCmpXchg10088); 

                	newLeafNode(otherlv_1, grammarAccess.getCmpXchgAccess().getEqualsSignKeyword_1());
                
            otherlv_2=(Token)match(input,126,FOLLOW_126_in_ruleCmpXchg10100); 

                	newLeafNode(otherlv_2, grammarAccess.getCmpXchgAccess().getCmpxchgKeyword_2());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4410:1: ( (lv_volatile_3_0= 'volatile' ) )?
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==127) ) {
                alt93=1;
            }
            switch (alt93) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4411:1: (lv_volatile_3_0= 'volatile' )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4411:1: (lv_volatile_3_0= 'volatile' )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4412:3: lv_volatile_3_0= 'volatile'
                    {
                    lv_volatile_3_0=(Token)match(input,127,FOLLOW_127_in_ruleCmpXchg10118); 

                            newLeafNode(lv_volatile_3_0, grammarAccess.getCmpXchgAccess().getVolatileVolatileKeyword_3_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCmpXchgRule());
                    	        }
                           		setWithLastConsumed(current, "volatile", true, "volatile");
                    	    

                    }


                    }
                    break;

            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4425:3: ( (lv_address_4_0= ruleParameter ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4426:1: (lv_address_4_0= ruleParameter )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4426:1: (lv_address_4_0= ruleParameter )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4427:3: lv_address_4_0= ruleParameter
            {
             
            	        newCompositeNode(grammarAccess.getCmpXchgAccess().getAddressParameterParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleParameter_in_ruleCmpXchg10153);
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

            otherlv_5=(Token)match(input,80,FOLLOW_80_in_ruleCmpXchg10165); 

                	newLeafNode(otherlv_5, grammarAccess.getCmpXchgAccess().getCommaKeyword_5());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4447:1: ( (lv_value_6_0= ruleParameter ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4448:1: (lv_value_6_0= ruleParameter )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4448:1: (lv_value_6_0= ruleParameter )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4449:3: lv_value_6_0= ruleParameter
            {
             
            	        newCompositeNode(grammarAccess.getCmpXchgAccess().getValueParameterParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleParameter_in_ruleCmpXchg10186);
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

            otherlv_7=(Token)match(input,80,FOLLOW_80_in_ruleCmpXchg10198); 

                	newLeafNode(otherlv_7, grammarAccess.getCmpXchgAccess().getCommaKeyword_7());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4469:1: ( (lv_newValue_8_0= ruleParameter ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4470:1: (lv_newValue_8_0= ruleParameter )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4470:1: (lv_newValue_8_0= ruleParameter )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4471:3: lv_newValue_8_0= ruleParameter
            {
             
            	        newCompositeNode(grammarAccess.getCmpXchgAccess().getNewValueParameterParserRuleCall_8_0()); 
            	    
            pushFollow(FOLLOW_ruleParameter_in_ruleCmpXchg10219);
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

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4487:2: (otherlv_9= 'singlethread' )?
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==125) ) {
                alt94=1;
            }
            switch (alt94) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4487:4: otherlv_9= 'singlethread'
                    {
                    otherlv_9=(Token)match(input,125,FOLLOW_125_in_ruleCmpXchg10232); 

                        	newLeafNode(otherlv_9, grammarAccess.getCmpXchgAccess().getSinglethreadKeyword_9());
                        

                    }
                    break;

            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4491:3: ( (lv_ordering_10_0= RULE_ATOMIC_ORDERING ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4492:1: (lv_ordering_10_0= RULE_ATOMIC_ORDERING )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4492:1: (lv_ordering_10_0= RULE_ATOMIC_ORDERING )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4493:3: lv_ordering_10_0= RULE_ATOMIC_ORDERING
            {
            lv_ordering_10_0=(Token)match(input,RULE_ATOMIC_ORDERING,FOLLOW_RULE_ATOMIC_ORDERING_in_ruleCmpXchg10251); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4517:1: entryRuleAtomicRMW returns [EObject current=null] : iv_ruleAtomicRMW= ruleAtomicRMW EOF ;
    public final EObject entryRuleAtomicRMW() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicRMW = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4518:2: (iv_ruleAtomicRMW= ruleAtomicRMW EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4519:2: iv_ruleAtomicRMW= ruleAtomicRMW EOF
            {
             newCompositeNode(grammarAccess.getAtomicRMWRule()); 
            pushFollow(FOLLOW_ruleAtomicRMW_in_entryRuleAtomicRMW10292);
            iv_ruleAtomicRMW=ruleAtomicRMW();

            state._fsp--;

             current =iv_ruleAtomicRMW; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtomicRMW10302); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4526:1: ruleAtomicRMW returns [EObject current=null] : ( ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' otherlv_2= 'atomicrmw' ( (lv_volatile_3_0= 'volatile' ) )? ( (lv_operation_4_0= RULE_BIN_OP ) ) ( (lv_address_5_0= ruleParameter ) ) otherlv_6= ',' ( (lv_argument_7_0= ruleParameter ) ) (otherlv_8= 'singlethread' )? ( (lv_ordering_9_0= RULE_ATOMIC_ORDERING ) ) ) ;
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
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4529:28: ( ( ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' otherlv_2= 'atomicrmw' ( (lv_volatile_3_0= 'volatile' ) )? ( (lv_operation_4_0= RULE_BIN_OP ) ) ( (lv_address_5_0= ruleParameter ) ) otherlv_6= ',' ( (lv_argument_7_0= ruleParameter ) ) (otherlv_8= 'singlethread' )? ( (lv_ordering_9_0= RULE_ATOMIC_ORDERING ) ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4530:1: ( ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' otherlv_2= 'atomicrmw' ( (lv_volatile_3_0= 'volatile' ) )? ( (lv_operation_4_0= RULE_BIN_OP ) ) ( (lv_address_5_0= ruleParameter ) ) otherlv_6= ',' ( (lv_argument_7_0= ruleParameter ) ) (otherlv_8= 'singlethread' )? ( (lv_ordering_9_0= RULE_ATOMIC_ORDERING ) ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4530:1: ( ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' otherlv_2= 'atomicrmw' ( (lv_volatile_3_0= 'volatile' ) )? ( (lv_operation_4_0= RULE_BIN_OP ) ) ( (lv_address_5_0= ruleParameter ) ) otherlv_6= ',' ( (lv_argument_7_0= ruleParameter ) ) (otherlv_8= 'singlethread' )? ( (lv_ordering_9_0= RULE_ATOMIC_ORDERING ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4530:2: ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' otherlv_2= 'atomicrmw' ( (lv_volatile_3_0= 'volatile' ) )? ( (lv_operation_4_0= RULE_BIN_OP ) ) ( (lv_address_5_0= ruleParameter ) ) otherlv_6= ',' ( (lv_argument_7_0= ruleParameter ) ) (otherlv_8= 'singlethread' )? ( (lv_ordering_9_0= RULE_ATOMIC_ORDERING ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4530:2: ( (lv_result_0_0= ruleAddress ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4531:1: (lv_result_0_0= ruleAddress )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4531:1: (lv_result_0_0= ruleAddress )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4532:3: lv_result_0_0= ruleAddress
            {
             
            	        newCompositeNode(grammarAccess.getAtomicRMWAccess().getResultAddressParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleAddress_in_ruleAtomicRMW10348);
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

            otherlv_1=(Token)match(input,77,FOLLOW_77_in_ruleAtomicRMW10360); 

                	newLeafNode(otherlv_1, grammarAccess.getAtomicRMWAccess().getEqualsSignKeyword_1());
                
            otherlv_2=(Token)match(input,128,FOLLOW_128_in_ruleAtomicRMW10372); 

                	newLeafNode(otherlv_2, grammarAccess.getAtomicRMWAccess().getAtomicrmwKeyword_2());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4556:1: ( (lv_volatile_3_0= 'volatile' ) )?
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==127) ) {
                alt95=1;
            }
            switch (alt95) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4557:1: (lv_volatile_3_0= 'volatile' )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4557:1: (lv_volatile_3_0= 'volatile' )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4558:3: lv_volatile_3_0= 'volatile'
                    {
                    lv_volatile_3_0=(Token)match(input,127,FOLLOW_127_in_ruleAtomicRMW10390); 

                            newLeafNode(lv_volatile_3_0, grammarAccess.getAtomicRMWAccess().getVolatileVolatileKeyword_3_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAtomicRMWRule());
                    	        }
                           		setWithLastConsumed(current, "volatile", true, "volatile");
                    	    

                    }


                    }
                    break;

            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4571:3: ( (lv_operation_4_0= RULE_BIN_OP ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4572:1: (lv_operation_4_0= RULE_BIN_OP )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4572:1: (lv_operation_4_0= RULE_BIN_OP )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4573:3: lv_operation_4_0= RULE_BIN_OP
            {
            lv_operation_4_0=(Token)match(input,RULE_BIN_OP,FOLLOW_RULE_BIN_OP_in_ruleAtomicRMW10421); 

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

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4589:2: ( (lv_address_5_0= ruleParameter ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4590:1: (lv_address_5_0= ruleParameter )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4590:1: (lv_address_5_0= ruleParameter )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4591:3: lv_address_5_0= ruleParameter
            {
             
            	        newCompositeNode(grammarAccess.getAtomicRMWAccess().getAddressParameterParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleParameter_in_ruleAtomicRMW10447);
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

            otherlv_6=(Token)match(input,80,FOLLOW_80_in_ruleAtomicRMW10459); 

                	newLeafNode(otherlv_6, grammarAccess.getAtomicRMWAccess().getCommaKeyword_6());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4611:1: ( (lv_argument_7_0= ruleParameter ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4612:1: (lv_argument_7_0= ruleParameter )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4612:1: (lv_argument_7_0= ruleParameter )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4613:3: lv_argument_7_0= ruleParameter
            {
             
            	        newCompositeNode(grammarAccess.getAtomicRMWAccess().getArgumentParameterParserRuleCall_7_0()); 
            	    
            pushFollow(FOLLOW_ruleParameter_in_ruleAtomicRMW10480);
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

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4629:2: (otherlv_8= 'singlethread' )?
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==125) ) {
                alt96=1;
            }
            switch (alt96) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4629:4: otherlv_8= 'singlethread'
                    {
                    otherlv_8=(Token)match(input,125,FOLLOW_125_in_ruleAtomicRMW10493); 

                        	newLeafNode(otherlv_8, grammarAccess.getAtomicRMWAccess().getSinglethreadKeyword_8());
                        

                    }
                    break;

            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4633:3: ( (lv_ordering_9_0= RULE_ATOMIC_ORDERING ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4634:1: (lv_ordering_9_0= RULE_ATOMIC_ORDERING )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4634:1: (lv_ordering_9_0= RULE_ATOMIC_ORDERING )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4635:3: lv_ordering_9_0= RULE_ATOMIC_ORDERING
            {
            lv_ordering_9_0=(Token)match(input,RULE_ATOMIC_ORDERING,FOLLOW_RULE_ATOMIC_ORDERING_in_ruleAtomicRMW10512); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4659:1: entryRuleLoad returns [EObject current=null] : iv_ruleLoad= ruleLoad EOF ;
    public final EObject entryRuleLoad() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoad = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4660:2: (iv_ruleLoad= ruleLoad EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4661:2: iv_ruleLoad= ruleLoad EOF
            {
             newCompositeNode(grammarAccess.getLoadRule()); 
            pushFollow(FOLLOW_ruleLoad_in_entryRuleLoad10553);
            iv_ruleLoad=ruleLoad();

            state._fsp--;

             current =iv_ruleLoad; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLoad10563); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4668:1: ruleLoad returns [EObject current=null] : ( ( ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' ( ( ( (lv_volatile_2_0= 'volatile' ) ) otherlv_3= 'load' ) | (otherlv_4= 'load' ( (lv_volatile_5_0= 'volatile' ) )? ) ) ( (lv_address_6_0= ruleParameter ) ) (otherlv_7= ',' otherlv_8= 'align' ( (lv_align_9_0= ruleNUMBER ) ) )? (otherlv_10= ',' ( (lv_meta_11_0= ruleMetaArgValue ) ) )* ) | ( ( (lv_result_12_0= ruleAddress ) ) otherlv_13= '=' otherlv_14= 'load' ( (lv_atomic_15_0= 'atomic' ) ) ( (lv_volatile_16_0= 'volatile' ) )? ( (lv_address_17_0= ruleParameter ) ) (otherlv_18= 'singlethread' )? ( (lv_ordering_19_0= RULE_ATOMIC_ORDERING ) ) (otherlv_20= ',' otherlv_21= 'align' ( (lv_align_22_0= ruleNUMBER ) ) )? ) ) ;
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
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4671:28: ( ( ( ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' ( ( ( (lv_volatile_2_0= 'volatile' ) ) otherlv_3= 'load' ) | (otherlv_4= 'load' ( (lv_volatile_5_0= 'volatile' ) )? ) ) ( (lv_address_6_0= ruleParameter ) ) (otherlv_7= ',' otherlv_8= 'align' ( (lv_align_9_0= ruleNUMBER ) ) )? (otherlv_10= ',' ( (lv_meta_11_0= ruleMetaArgValue ) ) )* ) | ( ( (lv_result_12_0= ruleAddress ) ) otherlv_13= '=' otherlv_14= 'load' ( (lv_atomic_15_0= 'atomic' ) ) ( (lv_volatile_16_0= 'volatile' ) )? ( (lv_address_17_0= ruleParameter ) ) (otherlv_18= 'singlethread' )? ( (lv_ordering_19_0= RULE_ATOMIC_ORDERING ) ) (otherlv_20= ',' otherlv_21= 'align' ( (lv_align_22_0= ruleNUMBER ) ) )? ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4672:1: ( ( ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' ( ( ( (lv_volatile_2_0= 'volatile' ) ) otherlv_3= 'load' ) | (otherlv_4= 'load' ( (lv_volatile_5_0= 'volatile' ) )? ) ) ( (lv_address_6_0= ruleParameter ) ) (otherlv_7= ',' otherlv_8= 'align' ( (lv_align_9_0= ruleNUMBER ) ) )? (otherlv_10= ',' ( (lv_meta_11_0= ruleMetaArgValue ) ) )* ) | ( ( (lv_result_12_0= ruleAddress ) ) otherlv_13= '=' otherlv_14= 'load' ( (lv_atomic_15_0= 'atomic' ) ) ( (lv_volatile_16_0= 'volatile' ) )? ( (lv_address_17_0= ruleParameter ) ) (otherlv_18= 'singlethread' )? ( (lv_ordering_19_0= RULE_ATOMIC_ORDERING ) ) (otherlv_20= ',' otherlv_21= 'align' ( (lv_align_22_0= ruleNUMBER ) ) )? ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4672:1: ( ( ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' ( ( ( (lv_volatile_2_0= 'volatile' ) ) otherlv_3= 'load' ) | (otherlv_4= 'load' ( (lv_volatile_5_0= 'volatile' ) )? ) ) ( (lv_address_6_0= ruleParameter ) ) (otherlv_7= ',' otherlv_8= 'align' ( (lv_align_9_0= ruleNUMBER ) ) )? (otherlv_10= ',' ( (lv_meta_11_0= ruleMetaArgValue ) ) )* ) | ( ( (lv_result_12_0= ruleAddress ) ) otherlv_13= '=' otherlv_14= 'load' ( (lv_atomic_15_0= 'atomic' ) ) ( (lv_volatile_16_0= 'volatile' ) )? ( (lv_address_17_0= ruleParameter ) ) (otherlv_18= 'singlethread' )? ( (lv_ordering_19_0= RULE_ATOMIC_ORDERING ) ) (otherlv_20= ',' otherlv_21= 'align' ( (lv_align_22_0= ruleNUMBER ) ) )? ) )
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( (LA104_0==RULE_VALID_ID) ) {
                int LA104_1 = input.LA(2);

                if ( (LA104_1==77) ) {
                    int LA104_2 = input.LA(3);

                    if ( (LA104_2==127) ) {
                        alt104=1;
                    }
                    else if ( (LA104_2==129) ) {
                        int LA104_4 = input.LA(4);

                        if ( (LA104_4==RULE_INT_TYPE||LA104_4==RULE_VALID_ID||(LA104_4>=RULE_PRIMITIVE_VALUE && LA104_4<=RULE_FLOATING_POINT_TYPE)||LA104_4==46||LA104_4==79||(LA104_4>=94 && LA104_4<=95)||LA104_4==127) ) {
                            alt104=1;
                        }
                        else if ( (LA104_4==130) ) {
                            alt104=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 104, 4, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 104, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 104, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 104, 0, input);

                throw nvae;
            }
            switch (alt104) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4672:2: ( ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' ( ( ( (lv_volatile_2_0= 'volatile' ) ) otherlv_3= 'load' ) | (otherlv_4= 'load' ( (lv_volatile_5_0= 'volatile' ) )? ) ) ( (lv_address_6_0= ruleParameter ) ) (otherlv_7= ',' otherlv_8= 'align' ( (lv_align_9_0= ruleNUMBER ) ) )? (otherlv_10= ',' ( (lv_meta_11_0= ruleMetaArgValue ) ) )* )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4672:2: ( ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' ( ( ( (lv_volatile_2_0= 'volatile' ) ) otherlv_3= 'load' ) | (otherlv_4= 'load' ( (lv_volatile_5_0= 'volatile' ) )? ) ) ( (lv_address_6_0= ruleParameter ) ) (otherlv_7= ',' otherlv_8= 'align' ( (lv_align_9_0= ruleNUMBER ) ) )? (otherlv_10= ',' ( (lv_meta_11_0= ruleMetaArgValue ) ) )* )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4672:3: ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' ( ( ( (lv_volatile_2_0= 'volatile' ) ) otherlv_3= 'load' ) | (otherlv_4= 'load' ( (lv_volatile_5_0= 'volatile' ) )? ) ) ( (lv_address_6_0= ruleParameter ) ) (otherlv_7= ',' otherlv_8= 'align' ( (lv_align_9_0= ruleNUMBER ) ) )? (otherlv_10= ',' ( (lv_meta_11_0= ruleMetaArgValue ) ) )*
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4672:3: ( (lv_result_0_0= ruleAddress ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4673:1: (lv_result_0_0= ruleAddress )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4673:1: (lv_result_0_0= ruleAddress )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4674:3: lv_result_0_0= ruleAddress
                    {
                     
                    	        newCompositeNode(grammarAccess.getLoadAccess().getResultAddressParserRuleCall_0_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAddress_in_ruleLoad10610);
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

                    otherlv_1=(Token)match(input,77,FOLLOW_77_in_ruleLoad10622); 

                        	newLeafNode(otherlv_1, grammarAccess.getLoadAccess().getEqualsSignKeyword_0_1());
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4694:1: ( ( ( (lv_volatile_2_0= 'volatile' ) ) otherlv_3= 'load' ) | (otherlv_4= 'load' ( (lv_volatile_5_0= 'volatile' ) )? ) )
                    int alt98=2;
                    int LA98_0 = input.LA(1);

                    if ( (LA98_0==127) ) {
                        alt98=1;
                    }
                    else if ( (LA98_0==129) ) {
                        alt98=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 98, 0, input);

                        throw nvae;
                    }
                    switch (alt98) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4694:2: ( ( (lv_volatile_2_0= 'volatile' ) ) otherlv_3= 'load' )
                            {
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4694:2: ( ( (lv_volatile_2_0= 'volatile' ) ) otherlv_3= 'load' )
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4694:3: ( (lv_volatile_2_0= 'volatile' ) ) otherlv_3= 'load'
                            {
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4694:3: ( (lv_volatile_2_0= 'volatile' ) )
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4695:1: (lv_volatile_2_0= 'volatile' )
                            {
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4695:1: (lv_volatile_2_0= 'volatile' )
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4696:3: lv_volatile_2_0= 'volatile'
                            {
                            lv_volatile_2_0=(Token)match(input,127,FOLLOW_127_in_ruleLoad10642); 

                                    newLeafNode(lv_volatile_2_0, grammarAccess.getLoadAccess().getVolatileVolatileKeyword_0_2_0_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getLoadRule());
                            	        }
                                   		setWithLastConsumed(current, "volatile", true, "volatile");
                            	    

                            }


                            }

                            otherlv_3=(Token)match(input,129,FOLLOW_129_in_ruleLoad10667); 

                                	newLeafNode(otherlv_3, grammarAccess.getLoadAccess().getLoadKeyword_0_2_0_1());
                                

                            }


                            }
                            break;
                        case 2 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4714:6: (otherlv_4= 'load' ( (lv_volatile_5_0= 'volatile' ) )? )
                            {
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4714:6: (otherlv_4= 'load' ( (lv_volatile_5_0= 'volatile' ) )? )
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4714:8: otherlv_4= 'load' ( (lv_volatile_5_0= 'volatile' ) )?
                            {
                            otherlv_4=(Token)match(input,129,FOLLOW_129_in_ruleLoad10687); 

                                	newLeafNode(otherlv_4, grammarAccess.getLoadAccess().getLoadKeyword_0_2_1_0());
                                
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4718:1: ( (lv_volatile_5_0= 'volatile' ) )?
                            int alt97=2;
                            int LA97_0 = input.LA(1);

                            if ( (LA97_0==127) ) {
                                alt97=1;
                            }
                            switch (alt97) {
                                case 1 :
                                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4719:1: (lv_volatile_5_0= 'volatile' )
                                    {
                                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4719:1: (lv_volatile_5_0= 'volatile' )
                                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4720:3: lv_volatile_5_0= 'volatile'
                                    {
                                    lv_volatile_5_0=(Token)match(input,127,FOLLOW_127_in_ruleLoad10705); 

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

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4733:5: ( (lv_address_6_0= ruleParameter ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4734:1: (lv_address_6_0= ruleParameter )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4734:1: (lv_address_6_0= ruleParameter )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4735:3: lv_address_6_0= ruleParameter
                    {
                     
                    	        newCompositeNode(grammarAccess.getLoadAccess().getAddressParameterParserRuleCall_0_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleParameter_in_ruleLoad10742);
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

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4751:2: (otherlv_7= ',' otherlv_8= 'align' ( (lv_align_9_0= ruleNUMBER ) ) )?
                    int alt99=2;
                    int LA99_0 = input.LA(1);

                    if ( (LA99_0==80) ) {
                        int LA99_1 = input.LA(2);

                        if ( (LA99_1==87) ) {
                            alt99=1;
                        }
                    }
                    switch (alt99) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4751:4: otherlv_7= ',' otherlv_8= 'align' ( (lv_align_9_0= ruleNUMBER ) )
                            {
                            otherlv_7=(Token)match(input,80,FOLLOW_80_in_ruleLoad10755); 

                                	newLeafNode(otherlv_7, grammarAccess.getLoadAccess().getCommaKeyword_0_4_0());
                                
                            otherlv_8=(Token)match(input,87,FOLLOW_87_in_ruleLoad10767); 

                                	newLeafNode(otherlv_8, grammarAccess.getLoadAccess().getAlignKeyword_0_4_1());
                                
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4759:1: ( (lv_align_9_0= ruleNUMBER ) )
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4760:1: (lv_align_9_0= ruleNUMBER )
                            {
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4760:1: (lv_align_9_0= ruleNUMBER )
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4761:3: lv_align_9_0= ruleNUMBER
                            {
                             
                            	        newCompositeNode(grammarAccess.getLoadAccess().getAlignNUMBERParserRuleCall_0_4_2_0()); 
                            	    
                            pushFollow(FOLLOW_ruleNUMBER_in_ruleLoad10788);
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

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4777:4: (otherlv_10= ',' ( (lv_meta_11_0= ruleMetaArgValue ) ) )*
                    loop100:
                    do {
                        int alt100=2;
                        int LA100_0 = input.LA(1);

                        if ( (LA100_0==80) ) {
                            alt100=1;
                        }


                        switch (alt100) {
                    	case 1 :
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4777:6: otherlv_10= ',' ( (lv_meta_11_0= ruleMetaArgValue ) )
                    	    {
                    	    otherlv_10=(Token)match(input,80,FOLLOW_80_in_ruleLoad10803); 

                    	        	newLeafNode(otherlv_10, grammarAccess.getLoadAccess().getCommaKeyword_0_5_0());
                    	        
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4781:1: ( (lv_meta_11_0= ruleMetaArgValue ) )
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4782:1: (lv_meta_11_0= ruleMetaArgValue )
                    	    {
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4782:1: (lv_meta_11_0= ruleMetaArgValue )
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4783:3: lv_meta_11_0= ruleMetaArgValue
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getLoadAccess().getMetaMetaArgValueParserRuleCall_0_5_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleMetaArgValue_in_ruleLoad10824);
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
                    	    break loop100;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4800:6: ( ( (lv_result_12_0= ruleAddress ) ) otherlv_13= '=' otherlv_14= 'load' ( (lv_atomic_15_0= 'atomic' ) ) ( (lv_volatile_16_0= 'volatile' ) )? ( (lv_address_17_0= ruleParameter ) ) (otherlv_18= 'singlethread' )? ( (lv_ordering_19_0= RULE_ATOMIC_ORDERING ) ) (otherlv_20= ',' otherlv_21= 'align' ( (lv_align_22_0= ruleNUMBER ) ) )? )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4800:6: ( ( (lv_result_12_0= ruleAddress ) ) otherlv_13= '=' otherlv_14= 'load' ( (lv_atomic_15_0= 'atomic' ) ) ( (lv_volatile_16_0= 'volatile' ) )? ( (lv_address_17_0= ruleParameter ) ) (otherlv_18= 'singlethread' )? ( (lv_ordering_19_0= RULE_ATOMIC_ORDERING ) ) (otherlv_20= ',' otherlv_21= 'align' ( (lv_align_22_0= ruleNUMBER ) ) )? )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4800:7: ( (lv_result_12_0= ruleAddress ) ) otherlv_13= '=' otherlv_14= 'load' ( (lv_atomic_15_0= 'atomic' ) ) ( (lv_volatile_16_0= 'volatile' ) )? ( (lv_address_17_0= ruleParameter ) ) (otherlv_18= 'singlethread' )? ( (lv_ordering_19_0= RULE_ATOMIC_ORDERING ) ) (otherlv_20= ',' otherlv_21= 'align' ( (lv_align_22_0= ruleNUMBER ) ) )?
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4800:7: ( (lv_result_12_0= ruleAddress ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4801:1: (lv_result_12_0= ruleAddress )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4801:1: (lv_result_12_0= ruleAddress )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4802:3: lv_result_12_0= ruleAddress
                    {
                     
                    	        newCompositeNode(grammarAccess.getLoadAccess().getResultAddressParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAddress_in_ruleLoad10855);
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

                    otherlv_13=(Token)match(input,77,FOLLOW_77_in_ruleLoad10867); 

                        	newLeafNode(otherlv_13, grammarAccess.getLoadAccess().getEqualsSignKeyword_1_1());
                        
                    otherlv_14=(Token)match(input,129,FOLLOW_129_in_ruleLoad10879); 

                        	newLeafNode(otherlv_14, grammarAccess.getLoadAccess().getLoadKeyword_1_2());
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4826:1: ( (lv_atomic_15_0= 'atomic' ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4827:1: (lv_atomic_15_0= 'atomic' )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4827:1: (lv_atomic_15_0= 'atomic' )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4828:3: lv_atomic_15_0= 'atomic'
                    {
                    lv_atomic_15_0=(Token)match(input,130,FOLLOW_130_in_ruleLoad10897); 

                            newLeafNode(lv_atomic_15_0, grammarAccess.getLoadAccess().getAtomicAtomicKeyword_1_3_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLoadRule());
                    	        }
                           		setWithLastConsumed(current, "atomic", true, "atomic");
                    	    

                    }


                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4841:2: ( (lv_volatile_16_0= 'volatile' ) )?
                    int alt101=2;
                    int LA101_0 = input.LA(1);

                    if ( (LA101_0==127) ) {
                        alt101=1;
                    }
                    switch (alt101) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4842:1: (lv_volatile_16_0= 'volatile' )
                            {
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4842:1: (lv_volatile_16_0= 'volatile' )
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4843:3: lv_volatile_16_0= 'volatile'
                            {
                            lv_volatile_16_0=(Token)match(input,127,FOLLOW_127_in_ruleLoad10928); 

                                    newLeafNode(lv_volatile_16_0, grammarAccess.getLoadAccess().getVolatileVolatileKeyword_1_4_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getLoadRule());
                            	        }
                                   		setWithLastConsumed(current, "volatile", true, "volatile");
                            	    

                            }


                            }
                            break;

                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4856:3: ( (lv_address_17_0= ruleParameter ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4857:1: (lv_address_17_0= ruleParameter )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4857:1: (lv_address_17_0= ruleParameter )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4858:3: lv_address_17_0= ruleParameter
                    {
                     
                    	        newCompositeNode(grammarAccess.getLoadAccess().getAddressParameterParserRuleCall_1_5_0()); 
                    	    
                    pushFollow(FOLLOW_ruleParameter_in_ruleLoad10963);
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

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4874:2: (otherlv_18= 'singlethread' )?
                    int alt102=2;
                    int LA102_0 = input.LA(1);

                    if ( (LA102_0==125) ) {
                        alt102=1;
                    }
                    switch (alt102) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4874:4: otherlv_18= 'singlethread'
                            {
                            otherlv_18=(Token)match(input,125,FOLLOW_125_in_ruleLoad10976); 

                                	newLeafNode(otherlv_18, grammarAccess.getLoadAccess().getSinglethreadKeyword_1_6());
                                

                            }
                            break;

                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4878:3: ( (lv_ordering_19_0= RULE_ATOMIC_ORDERING ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4879:1: (lv_ordering_19_0= RULE_ATOMIC_ORDERING )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4879:1: (lv_ordering_19_0= RULE_ATOMIC_ORDERING )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4880:3: lv_ordering_19_0= RULE_ATOMIC_ORDERING
                    {
                    lv_ordering_19_0=(Token)match(input,RULE_ATOMIC_ORDERING,FOLLOW_RULE_ATOMIC_ORDERING_in_ruleLoad10995); 

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

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4896:2: (otherlv_20= ',' otherlv_21= 'align' ( (lv_align_22_0= ruleNUMBER ) ) )?
                    int alt103=2;
                    int LA103_0 = input.LA(1);

                    if ( (LA103_0==80) ) {
                        alt103=1;
                    }
                    switch (alt103) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4896:4: otherlv_20= ',' otherlv_21= 'align' ( (lv_align_22_0= ruleNUMBER ) )
                            {
                            otherlv_20=(Token)match(input,80,FOLLOW_80_in_ruleLoad11013); 

                                	newLeafNode(otherlv_20, grammarAccess.getLoadAccess().getCommaKeyword_1_8_0());
                                
                            otherlv_21=(Token)match(input,87,FOLLOW_87_in_ruleLoad11025); 

                                	newLeafNode(otherlv_21, grammarAccess.getLoadAccess().getAlignKeyword_1_8_1());
                                
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4904:1: ( (lv_align_22_0= ruleNUMBER ) )
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4905:1: (lv_align_22_0= ruleNUMBER )
                            {
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4905:1: (lv_align_22_0= ruleNUMBER )
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4906:3: lv_align_22_0= ruleNUMBER
                            {
                             
                            	        newCompositeNode(grammarAccess.getLoadAccess().getAlignNUMBERParserRuleCall_1_8_2_0()); 
                            	    
                            pushFollow(FOLLOW_ruleNUMBER_in_ruleLoad11046);
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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4930:1: entryRuleStore returns [EObject current=null] : iv_ruleStore= ruleStore EOF ;
    public final EObject entryRuleStore() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStore = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4931:2: (iv_ruleStore= ruleStore EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4932:2: iv_ruleStore= ruleStore EOF
            {
             newCompositeNode(grammarAccess.getStoreRule()); 
            pushFollow(FOLLOW_ruleStore_in_entryRuleStore11085);
            iv_ruleStore=ruleStore();

            state._fsp--;

             current =iv_ruleStore; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStore11095); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4939:1: ruleStore returns [EObject current=null] : ( ( ( ( ( (lv_volatile_0_0= 'volatile' ) ) otherlv_1= 'store' ) | (otherlv_2= 'store' ( (lv_volatile_3_0= 'volatile' ) )? ) ) ( (lv_value_4_0= ruleParameter ) ) otherlv_5= ',' ( (lv_targetAddress_6_0= ruleParameter ) ) (otherlv_7= ',' otherlv_8= 'align' ( (lv_align_9_0= ruleNUMBER ) ) )? (otherlv_10= ',' ( (lv_meta_11_0= ruleMetaArgValue ) ) )* ) | (otherlv_12= 'store' ( (lv_atomic_13_0= 'atomic' ) ) ( (lv_volatile_14_0= 'volatile' ) )? ( (lv_value_15_0= ruleParameter ) ) otherlv_16= ',' ( (lv_targetAddress_17_0= ruleParameter ) ) (otherlv_18= 'singlethread' )? ( (lv_ordering_19_0= RULE_ATOMIC_ORDERING ) ) (otherlv_20= ',' otherlv_21= 'align' ( (lv_align_22_0= ruleNUMBER ) ) )? ) ) ;
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
        EObject lv_value_4_0 = null;

        EObject lv_targetAddress_6_0 = null;

        AntlrDatatypeRuleToken lv_align_9_0 = null;

        EObject lv_meta_11_0 = null;

        EObject lv_value_15_0 = null;

        EObject lv_targetAddress_17_0 = null;

        AntlrDatatypeRuleToken lv_align_22_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4942:28: ( ( ( ( ( ( (lv_volatile_0_0= 'volatile' ) ) otherlv_1= 'store' ) | (otherlv_2= 'store' ( (lv_volatile_3_0= 'volatile' ) )? ) ) ( (lv_value_4_0= ruleParameter ) ) otherlv_5= ',' ( (lv_targetAddress_6_0= ruleParameter ) ) (otherlv_7= ',' otherlv_8= 'align' ( (lv_align_9_0= ruleNUMBER ) ) )? (otherlv_10= ',' ( (lv_meta_11_0= ruleMetaArgValue ) ) )* ) | (otherlv_12= 'store' ( (lv_atomic_13_0= 'atomic' ) ) ( (lv_volatile_14_0= 'volatile' ) )? ( (lv_value_15_0= ruleParameter ) ) otherlv_16= ',' ( (lv_targetAddress_17_0= ruleParameter ) ) (otherlv_18= 'singlethread' )? ( (lv_ordering_19_0= RULE_ATOMIC_ORDERING ) ) (otherlv_20= ',' otherlv_21= 'align' ( (lv_align_22_0= ruleNUMBER ) ) )? ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4943:1: ( ( ( ( ( (lv_volatile_0_0= 'volatile' ) ) otherlv_1= 'store' ) | (otherlv_2= 'store' ( (lv_volatile_3_0= 'volatile' ) )? ) ) ( (lv_value_4_0= ruleParameter ) ) otherlv_5= ',' ( (lv_targetAddress_6_0= ruleParameter ) ) (otherlv_7= ',' otherlv_8= 'align' ( (lv_align_9_0= ruleNUMBER ) ) )? (otherlv_10= ',' ( (lv_meta_11_0= ruleMetaArgValue ) ) )* ) | (otherlv_12= 'store' ( (lv_atomic_13_0= 'atomic' ) ) ( (lv_volatile_14_0= 'volatile' ) )? ( (lv_value_15_0= ruleParameter ) ) otherlv_16= ',' ( (lv_targetAddress_17_0= ruleParameter ) ) (otherlv_18= 'singlethread' )? ( (lv_ordering_19_0= RULE_ATOMIC_ORDERING ) ) (otherlv_20= ',' otherlv_21= 'align' ( (lv_align_22_0= ruleNUMBER ) ) )? ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4943:1: ( ( ( ( ( (lv_volatile_0_0= 'volatile' ) ) otherlv_1= 'store' ) | (otherlv_2= 'store' ( (lv_volatile_3_0= 'volatile' ) )? ) ) ( (lv_value_4_0= ruleParameter ) ) otherlv_5= ',' ( (lv_targetAddress_6_0= ruleParameter ) ) (otherlv_7= ',' otherlv_8= 'align' ( (lv_align_9_0= ruleNUMBER ) ) )? (otherlv_10= ',' ( (lv_meta_11_0= ruleMetaArgValue ) ) )* ) | (otherlv_12= 'store' ( (lv_atomic_13_0= 'atomic' ) ) ( (lv_volatile_14_0= 'volatile' ) )? ( (lv_value_15_0= ruleParameter ) ) otherlv_16= ',' ( (lv_targetAddress_17_0= ruleParameter ) ) (otherlv_18= 'singlethread' )? ( (lv_ordering_19_0= RULE_ATOMIC_ORDERING ) ) (otherlv_20= ',' otherlv_21= 'align' ( (lv_align_22_0= ruleNUMBER ) ) )? ) )
            int alt112=2;
            int LA112_0 = input.LA(1);

            if ( (LA112_0==127) ) {
                alt112=1;
            }
            else if ( (LA112_0==131) ) {
                int LA112_2 = input.LA(2);

                if ( (LA112_2==130) ) {
                    alt112=2;
                }
                else if ( (LA112_2==RULE_INT_TYPE||LA112_2==RULE_VALID_ID||(LA112_2>=RULE_PRIMITIVE_VALUE && LA112_2<=RULE_FLOATING_POINT_TYPE)||LA112_2==46||LA112_2==79||(LA112_2>=94 && LA112_2<=95)||LA112_2==127) ) {
                    alt112=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 112, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 112, 0, input);

                throw nvae;
            }
            switch (alt112) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4943:2: ( ( ( ( (lv_volatile_0_0= 'volatile' ) ) otherlv_1= 'store' ) | (otherlv_2= 'store' ( (lv_volatile_3_0= 'volatile' ) )? ) ) ( (lv_value_4_0= ruleParameter ) ) otherlv_5= ',' ( (lv_targetAddress_6_0= ruleParameter ) ) (otherlv_7= ',' otherlv_8= 'align' ( (lv_align_9_0= ruleNUMBER ) ) )? (otherlv_10= ',' ( (lv_meta_11_0= ruleMetaArgValue ) ) )* )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4943:2: ( ( ( ( (lv_volatile_0_0= 'volatile' ) ) otherlv_1= 'store' ) | (otherlv_2= 'store' ( (lv_volatile_3_0= 'volatile' ) )? ) ) ( (lv_value_4_0= ruleParameter ) ) otherlv_5= ',' ( (lv_targetAddress_6_0= ruleParameter ) ) (otherlv_7= ',' otherlv_8= 'align' ( (lv_align_9_0= ruleNUMBER ) ) )? (otherlv_10= ',' ( (lv_meta_11_0= ruleMetaArgValue ) ) )* )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4943:3: ( ( ( (lv_volatile_0_0= 'volatile' ) ) otherlv_1= 'store' ) | (otherlv_2= 'store' ( (lv_volatile_3_0= 'volatile' ) )? ) ) ( (lv_value_4_0= ruleParameter ) ) otherlv_5= ',' ( (lv_targetAddress_6_0= ruleParameter ) ) (otherlv_7= ',' otherlv_8= 'align' ( (lv_align_9_0= ruleNUMBER ) ) )? (otherlv_10= ',' ( (lv_meta_11_0= ruleMetaArgValue ) ) )*
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4943:3: ( ( ( (lv_volatile_0_0= 'volatile' ) ) otherlv_1= 'store' ) | (otherlv_2= 'store' ( (lv_volatile_3_0= 'volatile' ) )? ) )
                    int alt106=2;
                    int LA106_0 = input.LA(1);

                    if ( (LA106_0==127) ) {
                        alt106=1;
                    }
                    else if ( (LA106_0==131) ) {
                        alt106=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 106, 0, input);

                        throw nvae;
                    }
                    switch (alt106) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4943:4: ( ( (lv_volatile_0_0= 'volatile' ) ) otherlv_1= 'store' )
                            {
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4943:4: ( ( (lv_volatile_0_0= 'volatile' ) ) otherlv_1= 'store' )
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4943:5: ( (lv_volatile_0_0= 'volatile' ) ) otherlv_1= 'store'
                            {
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4943:5: ( (lv_volatile_0_0= 'volatile' ) )
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4944:1: (lv_volatile_0_0= 'volatile' )
                            {
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4944:1: (lv_volatile_0_0= 'volatile' )
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4945:3: lv_volatile_0_0= 'volatile'
                            {
                            lv_volatile_0_0=(Token)match(input,127,FOLLOW_127_in_ruleStore11141); 

                                    newLeafNode(lv_volatile_0_0, grammarAccess.getStoreAccess().getVolatileVolatileKeyword_0_0_0_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getStoreRule());
                            	        }
                                   		setWithLastConsumed(current, "volatile", true, "volatile");
                            	    

                            }


                            }

                            otherlv_1=(Token)match(input,131,FOLLOW_131_in_ruleStore11166); 

                                	newLeafNode(otherlv_1, grammarAccess.getStoreAccess().getStoreKeyword_0_0_0_1());
                                

                            }


                            }
                            break;
                        case 2 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4963:6: (otherlv_2= 'store' ( (lv_volatile_3_0= 'volatile' ) )? )
                            {
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4963:6: (otherlv_2= 'store' ( (lv_volatile_3_0= 'volatile' ) )? )
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4963:8: otherlv_2= 'store' ( (lv_volatile_3_0= 'volatile' ) )?
                            {
                            otherlv_2=(Token)match(input,131,FOLLOW_131_in_ruleStore11186); 

                                	newLeafNode(otherlv_2, grammarAccess.getStoreAccess().getStoreKeyword_0_0_1_0());
                                
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4967:1: ( (lv_volatile_3_0= 'volatile' ) )?
                            int alt105=2;
                            int LA105_0 = input.LA(1);

                            if ( (LA105_0==127) ) {
                                alt105=1;
                            }
                            switch (alt105) {
                                case 1 :
                                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4968:1: (lv_volatile_3_0= 'volatile' )
                                    {
                                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4968:1: (lv_volatile_3_0= 'volatile' )
                                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4969:3: lv_volatile_3_0= 'volatile'
                                    {
                                    lv_volatile_3_0=(Token)match(input,127,FOLLOW_127_in_ruleStore11204); 

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

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4982:5: ( (lv_value_4_0= ruleParameter ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4983:1: (lv_value_4_0= ruleParameter )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4983:1: (lv_value_4_0= ruleParameter )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4984:3: lv_value_4_0= ruleParameter
                    {
                     
                    	        newCompositeNode(grammarAccess.getStoreAccess().getValueParameterParserRuleCall_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleParameter_in_ruleStore11241);
                    lv_value_4_0=ruleParameter();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStoreRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_4_0, 
                            		"Parameter");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_5=(Token)match(input,80,FOLLOW_80_in_ruleStore11253); 

                        	newLeafNode(otherlv_5, grammarAccess.getStoreAccess().getCommaKeyword_0_2());
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5004:1: ( (lv_targetAddress_6_0= ruleParameter ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5005:1: (lv_targetAddress_6_0= ruleParameter )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5005:1: (lv_targetAddress_6_0= ruleParameter )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5006:3: lv_targetAddress_6_0= ruleParameter
                    {
                     
                    	        newCompositeNode(grammarAccess.getStoreAccess().getTargetAddressParameterParserRuleCall_0_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleParameter_in_ruleStore11274);
                    lv_targetAddress_6_0=ruleParameter();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStoreRule());
                    	        }
                           		set(
                           			current, 
                           			"targetAddress",
                            		lv_targetAddress_6_0, 
                            		"Parameter");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5022:2: (otherlv_7= ',' otherlv_8= 'align' ( (lv_align_9_0= ruleNUMBER ) ) )?
                    int alt107=2;
                    int LA107_0 = input.LA(1);

                    if ( (LA107_0==80) ) {
                        int LA107_1 = input.LA(2);

                        if ( (LA107_1==87) ) {
                            alt107=1;
                        }
                    }
                    switch (alt107) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5022:4: otherlv_7= ',' otherlv_8= 'align' ( (lv_align_9_0= ruleNUMBER ) )
                            {
                            otherlv_7=(Token)match(input,80,FOLLOW_80_in_ruleStore11287); 

                                	newLeafNode(otherlv_7, grammarAccess.getStoreAccess().getCommaKeyword_0_4_0());
                                
                            otherlv_8=(Token)match(input,87,FOLLOW_87_in_ruleStore11299); 

                                	newLeafNode(otherlv_8, grammarAccess.getStoreAccess().getAlignKeyword_0_4_1());
                                
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5030:1: ( (lv_align_9_0= ruleNUMBER ) )
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5031:1: (lv_align_9_0= ruleNUMBER )
                            {
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5031:1: (lv_align_9_0= ruleNUMBER )
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5032:3: lv_align_9_0= ruleNUMBER
                            {
                             
                            	        newCompositeNode(grammarAccess.getStoreAccess().getAlignNUMBERParserRuleCall_0_4_2_0()); 
                            	    
                            pushFollow(FOLLOW_ruleNUMBER_in_ruleStore11320);
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

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5048:4: (otherlv_10= ',' ( (lv_meta_11_0= ruleMetaArgValue ) ) )*
                    loop108:
                    do {
                        int alt108=2;
                        int LA108_0 = input.LA(1);

                        if ( (LA108_0==80) ) {
                            alt108=1;
                        }


                        switch (alt108) {
                    	case 1 :
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5048:6: otherlv_10= ',' ( (lv_meta_11_0= ruleMetaArgValue ) )
                    	    {
                    	    otherlv_10=(Token)match(input,80,FOLLOW_80_in_ruleStore11335); 

                    	        	newLeafNode(otherlv_10, grammarAccess.getStoreAccess().getCommaKeyword_0_5_0());
                    	        
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5052:1: ( (lv_meta_11_0= ruleMetaArgValue ) )
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5053:1: (lv_meta_11_0= ruleMetaArgValue )
                    	    {
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5053:1: (lv_meta_11_0= ruleMetaArgValue )
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5054:3: lv_meta_11_0= ruleMetaArgValue
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getStoreAccess().getMetaMetaArgValueParserRuleCall_0_5_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleMetaArgValue_in_ruleStore11356);
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
                    	    break loop108;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5071:6: (otherlv_12= 'store' ( (lv_atomic_13_0= 'atomic' ) ) ( (lv_volatile_14_0= 'volatile' ) )? ( (lv_value_15_0= ruleParameter ) ) otherlv_16= ',' ( (lv_targetAddress_17_0= ruleParameter ) ) (otherlv_18= 'singlethread' )? ( (lv_ordering_19_0= RULE_ATOMIC_ORDERING ) ) (otherlv_20= ',' otherlv_21= 'align' ( (lv_align_22_0= ruleNUMBER ) ) )? )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5071:6: (otherlv_12= 'store' ( (lv_atomic_13_0= 'atomic' ) ) ( (lv_volatile_14_0= 'volatile' ) )? ( (lv_value_15_0= ruleParameter ) ) otherlv_16= ',' ( (lv_targetAddress_17_0= ruleParameter ) ) (otherlv_18= 'singlethread' )? ( (lv_ordering_19_0= RULE_ATOMIC_ORDERING ) ) (otherlv_20= ',' otherlv_21= 'align' ( (lv_align_22_0= ruleNUMBER ) ) )? )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5071:8: otherlv_12= 'store' ( (lv_atomic_13_0= 'atomic' ) ) ( (lv_volatile_14_0= 'volatile' ) )? ( (lv_value_15_0= ruleParameter ) ) otherlv_16= ',' ( (lv_targetAddress_17_0= ruleParameter ) ) (otherlv_18= 'singlethread' )? ( (lv_ordering_19_0= RULE_ATOMIC_ORDERING ) ) (otherlv_20= ',' otherlv_21= 'align' ( (lv_align_22_0= ruleNUMBER ) ) )?
                    {
                    otherlv_12=(Token)match(input,131,FOLLOW_131_in_ruleStore11378); 

                        	newLeafNode(otherlv_12, grammarAccess.getStoreAccess().getStoreKeyword_1_0());
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5075:1: ( (lv_atomic_13_0= 'atomic' ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5076:1: (lv_atomic_13_0= 'atomic' )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5076:1: (lv_atomic_13_0= 'atomic' )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5077:3: lv_atomic_13_0= 'atomic'
                    {
                    lv_atomic_13_0=(Token)match(input,130,FOLLOW_130_in_ruleStore11396); 

                            newLeafNode(lv_atomic_13_0, grammarAccess.getStoreAccess().getAtomicAtomicKeyword_1_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStoreRule());
                    	        }
                           		setWithLastConsumed(current, "atomic", true, "atomic");
                    	    

                    }


                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5090:2: ( (lv_volatile_14_0= 'volatile' ) )?
                    int alt109=2;
                    int LA109_0 = input.LA(1);

                    if ( (LA109_0==127) ) {
                        alt109=1;
                    }
                    switch (alt109) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5091:1: (lv_volatile_14_0= 'volatile' )
                            {
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5091:1: (lv_volatile_14_0= 'volatile' )
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5092:3: lv_volatile_14_0= 'volatile'
                            {
                            lv_volatile_14_0=(Token)match(input,127,FOLLOW_127_in_ruleStore11427); 

                                    newLeafNode(lv_volatile_14_0, grammarAccess.getStoreAccess().getVolatileVolatileKeyword_1_2_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getStoreRule());
                            	        }
                                   		setWithLastConsumed(current, "volatile", true, "volatile");
                            	    

                            }


                            }
                            break;

                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5105:3: ( (lv_value_15_0= ruleParameter ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5106:1: (lv_value_15_0= ruleParameter )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5106:1: (lv_value_15_0= ruleParameter )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5107:3: lv_value_15_0= ruleParameter
                    {
                     
                    	        newCompositeNode(grammarAccess.getStoreAccess().getValueParameterParserRuleCall_1_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleParameter_in_ruleStore11462);
                    lv_value_15_0=ruleParameter();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStoreRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_15_0, 
                            		"Parameter");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_16=(Token)match(input,80,FOLLOW_80_in_ruleStore11474); 

                        	newLeafNode(otherlv_16, grammarAccess.getStoreAccess().getCommaKeyword_1_4());
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5127:1: ( (lv_targetAddress_17_0= ruleParameter ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5128:1: (lv_targetAddress_17_0= ruleParameter )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5128:1: (lv_targetAddress_17_0= ruleParameter )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5129:3: lv_targetAddress_17_0= ruleParameter
                    {
                     
                    	        newCompositeNode(grammarAccess.getStoreAccess().getTargetAddressParameterParserRuleCall_1_5_0()); 
                    	    
                    pushFollow(FOLLOW_ruleParameter_in_ruleStore11495);
                    lv_targetAddress_17_0=ruleParameter();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStoreRule());
                    	        }
                           		set(
                           			current, 
                           			"targetAddress",
                            		lv_targetAddress_17_0, 
                            		"Parameter");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5145:2: (otherlv_18= 'singlethread' )?
                    int alt110=2;
                    int LA110_0 = input.LA(1);

                    if ( (LA110_0==125) ) {
                        alt110=1;
                    }
                    switch (alt110) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5145:4: otherlv_18= 'singlethread'
                            {
                            otherlv_18=(Token)match(input,125,FOLLOW_125_in_ruleStore11508); 

                                	newLeafNode(otherlv_18, grammarAccess.getStoreAccess().getSinglethreadKeyword_1_6());
                                

                            }
                            break;

                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5149:3: ( (lv_ordering_19_0= RULE_ATOMIC_ORDERING ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5150:1: (lv_ordering_19_0= RULE_ATOMIC_ORDERING )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5150:1: (lv_ordering_19_0= RULE_ATOMIC_ORDERING )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5151:3: lv_ordering_19_0= RULE_ATOMIC_ORDERING
                    {
                    lv_ordering_19_0=(Token)match(input,RULE_ATOMIC_ORDERING,FOLLOW_RULE_ATOMIC_ORDERING_in_ruleStore11527); 

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

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5167:2: (otherlv_20= ',' otherlv_21= 'align' ( (lv_align_22_0= ruleNUMBER ) ) )?
                    int alt111=2;
                    int LA111_0 = input.LA(1);

                    if ( (LA111_0==80) ) {
                        alt111=1;
                    }
                    switch (alt111) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5167:4: otherlv_20= ',' otherlv_21= 'align' ( (lv_align_22_0= ruleNUMBER ) )
                            {
                            otherlv_20=(Token)match(input,80,FOLLOW_80_in_ruleStore11545); 

                                	newLeafNode(otherlv_20, grammarAccess.getStoreAccess().getCommaKeyword_1_8_0());
                                
                            otherlv_21=(Token)match(input,87,FOLLOW_87_in_ruleStore11557); 

                                	newLeafNode(otherlv_21, grammarAccess.getStoreAccess().getAlignKeyword_1_8_1());
                                
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5175:1: ( (lv_align_22_0= ruleNUMBER ) )
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5176:1: (lv_align_22_0= ruleNUMBER )
                            {
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5176:1: (lv_align_22_0= ruleNUMBER )
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5177:3: lv_align_22_0= ruleNUMBER
                            {
                             
                            	        newCompositeNode(grammarAccess.getStoreAccess().getAlignNUMBERParserRuleCall_1_8_2_0()); 
                            	    
                            pushFollow(FOLLOW_ruleNUMBER_in_ruleStore11578);
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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5201:1: entryRuleCall returns [EObject current=null] : iv_ruleCall= ruleCall EOF ;
    public final EObject entryRuleCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCall = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5202:2: (iv_ruleCall= ruleCall EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5203:2: iv_ruleCall= ruleCall EOF
            {
             newCompositeNode(grammarAccess.getCallRule()); 
            pushFollow(FOLLOW_ruleCall_in_entryRuleCall11617);
            iv_ruleCall=ruleCall();

            state._fsp--;

             current =iv_ruleCall; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCall11627); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5210:1: ruleCall returns [EObject current=null] : ( ( ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' )? (otherlv_2= 'tail' )? otherlv_3= 'call' ( ruleCALLING_CONV )? (this_RETURN_ATTRIBUTES_5= RULE_RETURN_ATTRIBUTES )? ( (lv_function_6_0= ruleParameter ) ) ( (lv_pList_7_0= ruleParameterList ) ) ( ruleFUNCTION_ATTRIBUTES )* (otherlv_9= ',' otherlv_10= '!srcloc' otherlv_11= '!' ruleNUMBER )* ) ;
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
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5213:28: ( ( ( ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' )? (otherlv_2= 'tail' )? otherlv_3= 'call' ( ruleCALLING_CONV )? (this_RETURN_ATTRIBUTES_5= RULE_RETURN_ATTRIBUTES )? ( (lv_function_6_0= ruleParameter ) ) ( (lv_pList_7_0= ruleParameterList ) ) ( ruleFUNCTION_ATTRIBUTES )* (otherlv_9= ',' otherlv_10= '!srcloc' otherlv_11= '!' ruleNUMBER )* ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5214:1: ( ( ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' )? (otherlv_2= 'tail' )? otherlv_3= 'call' ( ruleCALLING_CONV )? (this_RETURN_ATTRIBUTES_5= RULE_RETURN_ATTRIBUTES )? ( (lv_function_6_0= ruleParameter ) ) ( (lv_pList_7_0= ruleParameterList ) ) ( ruleFUNCTION_ATTRIBUTES )* (otherlv_9= ',' otherlv_10= '!srcloc' otherlv_11= '!' ruleNUMBER )* )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5214:1: ( ( ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' )? (otherlv_2= 'tail' )? otherlv_3= 'call' ( ruleCALLING_CONV )? (this_RETURN_ATTRIBUTES_5= RULE_RETURN_ATTRIBUTES )? ( (lv_function_6_0= ruleParameter ) ) ( (lv_pList_7_0= ruleParameterList ) ) ( ruleFUNCTION_ATTRIBUTES )* (otherlv_9= ',' otherlv_10= '!srcloc' otherlv_11= '!' ruleNUMBER )* )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5214:2: ( ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' )? (otherlv_2= 'tail' )? otherlv_3= 'call' ( ruleCALLING_CONV )? (this_RETURN_ATTRIBUTES_5= RULE_RETURN_ATTRIBUTES )? ( (lv_function_6_0= ruleParameter ) ) ( (lv_pList_7_0= ruleParameterList ) ) ( ruleFUNCTION_ATTRIBUTES )* (otherlv_9= ',' otherlv_10= '!srcloc' otherlv_11= '!' ruleNUMBER )*
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5214:2: ( ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' )?
            int alt113=2;
            int LA113_0 = input.LA(1);

            if ( (LA113_0==RULE_VALID_ID) ) {
                alt113=1;
            }
            switch (alt113) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5214:3: ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '='
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5214:3: ( (lv_result_0_0= ruleAddress ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5215:1: (lv_result_0_0= ruleAddress )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5215:1: (lv_result_0_0= ruleAddress )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5216:3: lv_result_0_0= ruleAddress
                    {
                     
                    	        newCompositeNode(grammarAccess.getCallAccess().getResultAddressParserRuleCall_0_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAddress_in_ruleCall11674);
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

                    otherlv_1=(Token)match(input,77,FOLLOW_77_in_ruleCall11686); 

                        	newLeafNode(otherlv_1, grammarAccess.getCallAccess().getEqualsSignKeyword_0_1());
                        

                    }
                    break;

            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5236:3: (otherlv_2= 'tail' )?
            int alt114=2;
            int LA114_0 = input.LA(1);

            if ( (LA114_0==132) ) {
                alt114=1;
            }
            switch (alt114) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5236:5: otherlv_2= 'tail'
                    {
                    otherlv_2=(Token)match(input,132,FOLLOW_132_in_ruleCall11701); 

                        	newLeafNode(otherlv_2, grammarAccess.getCallAccess().getTailKeyword_1());
                        

                    }
                    break;

            }

            otherlv_3=(Token)match(input,133,FOLLOW_133_in_ruleCall11715); 

                	newLeafNode(otherlv_3, grammarAccess.getCallAccess().getCallKeyword_2());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5244:1: ( ruleCALLING_CONV )?
            int alt115=2;
            int LA115_0 = input.LA(1);

            if ( ((LA115_0>=31 && LA115_0<=45)) ) {
                alt115=1;
            }
            switch (alt115) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5245:5: ruleCALLING_CONV
                    {
                     
                            newCompositeNode(grammarAccess.getCallAccess().getCALLING_CONVParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleCALLING_CONV_in_ruleCall11732);
                    ruleCALLING_CONV();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5252:3: (this_RETURN_ATTRIBUTES_5= RULE_RETURN_ATTRIBUTES )?
            int alt116=2;
            int LA116_0 = input.LA(1);

            if ( (LA116_0==RULE_RETURN_ATTRIBUTES) ) {
                alt116=1;
            }
            switch (alt116) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5252:4: this_RETURN_ATTRIBUTES_5= RULE_RETURN_ATTRIBUTES
                    {
                    this_RETURN_ATTRIBUTES_5=(Token)match(input,RULE_RETURN_ATTRIBUTES,FOLLOW_RULE_RETURN_ATTRIBUTES_in_ruleCall11745); 
                     
                        newLeafNode(this_RETURN_ATTRIBUTES_5, grammarAccess.getCallAccess().getRETURN_ATTRIBUTESTerminalRuleCall_4()); 
                        

                    }
                    break;

            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5256:3: ( (lv_function_6_0= ruleParameter ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5257:1: (lv_function_6_0= ruleParameter )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5257:1: (lv_function_6_0= ruleParameter )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5258:3: lv_function_6_0= ruleParameter
            {
             
            	        newCompositeNode(grammarAccess.getCallAccess().getFunctionParameterParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleParameter_in_ruleCall11767);
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

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5274:2: ( (lv_pList_7_0= ruleParameterList ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5275:1: (lv_pList_7_0= ruleParameterList )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5275:1: (lv_pList_7_0= ruleParameterList )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5276:3: lv_pList_7_0= ruleParameterList
            {
             
            	        newCompositeNode(grammarAccess.getCallAccess().getPListParameterListParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleParameterList_in_ruleCall11788);
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

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5292:2: ( ruleFUNCTION_ATTRIBUTES )*
            loop117:
            do {
                int alt117=2;
                int LA117_0 = input.LA(1);

                if ( ((LA117_0>=48 && LA117_0<=49)||(LA117_0>=52 && LA117_0<=67)) ) {
                    alt117=1;
                }


                switch (alt117) {
            	case 1 :
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5293:5: ruleFUNCTION_ATTRIBUTES
            	    {
            	     
            	            newCompositeNode(grammarAccess.getCallAccess().getFUNCTION_ATTRIBUTESParserRuleCall_7()); 
            	        
            	    pushFollow(FOLLOW_ruleFUNCTION_ATTRIBUTES_in_ruleCall11805);
            	    ruleFUNCTION_ATTRIBUTES();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop117;
                }
            } while (true);

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5300:3: (otherlv_9= ',' otherlv_10= '!srcloc' otherlv_11= '!' ruleNUMBER )*
            loop118:
            do {
                int alt118=2;
                int LA118_0 = input.LA(1);

                if ( (LA118_0==80) ) {
                    alt118=1;
                }


                switch (alt118) {
            	case 1 :
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5300:5: otherlv_9= ',' otherlv_10= '!srcloc' otherlv_11= '!' ruleNUMBER
            	    {
            	    otherlv_9=(Token)match(input,80,FOLLOW_80_in_ruleCall11819); 

            	        	newLeafNode(otherlv_9, grammarAccess.getCallAccess().getCommaKeyword_8_0());
            	        
            	    otherlv_10=(Token)match(input,134,FOLLOW_134_in_ruleCall11831); 

            	        	newLeafNode(otherlv_10, grammarAccess.getCallAccess().getSrclocKeyword_8_1());
            	        
            	    otherlv_11=(Token)match(input,120,FOLLOW_120_in_ruleCall11843); 

            	        	newLeafNode(otherlv_11, grammarAccess.getCallAccess().getExclamationMarkKeyword_8_2());
            	        
            	     
            	            newCompositeNode(grammarAccess.getCallAccess().getNUMBERParserRuleCall_8_3()); 
            	        
            	    pushFollow(FOLLOW_ruleNUMBER_in_ruleCall11859);
            	    ruleNUMBER();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        

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
    // $ANTLR end "ruleCall"


    // $ANTLR start "entryRuleAlloc"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5328:1: entryRuleAlloc returns [EObject current=null] : iv_ruleAlloc= ruleAlloc EOF ;
    public final EObject entryRuleAlloc() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlloc = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5329:2: (iv_ruleAlloc= ruleAlloc EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5330:2: iv_ruleAlloc= ruleAlloc EOF
            {
             newCompositeNode(grammarAccess.getAllocRule()); 
            pushFollow(FOLLOW_ruleAlloc_in_entryRuleAlloc11896);
            iv_ruleAlloc=ruleAlloc();

            state._fsp--;

             current =iv_ruleAlloc; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAlloc11906); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5337:1: ruleAlloc returns [EObject current=null] : ( ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' otherlv_2= 'alloca' ( (lv_type_3_0= ruleTypeUse ) ) (otherlv_4= ',' ( (lv_numOfElements_5_0= ruleParameter ) ) )? (otherlv_6= ',' otherlv_7= 'align' ( (lv_align_8_0= ruleNUMBER ) ) )? ) ;
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
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5340:28: ( ( ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' otherlv_2= 'alloca' ( (lv_type_3_0= ruleTypeUse ) ) (otherlv_4= ',' ( (lv_numOfElements_5_0= ruleParameter ) ) )? (otherlv_6= ',' otherlv_7= 'align' ( (lv_align_8_0= ruleNUMBER ) ) )? ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5341:1: ( ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' otherlv_2= 'alloca' ( (lv_type_3_0= ruleTypeUse ) ) (otherlv_4= ',' ( (lv_numOfElements_5_0= ruleParameter ) ) )? (otherlv_6= ',' otherlv_7= 'align' ( (lv_align_8_0= ruleNUMBER ) ) )? )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5341:1: ( ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' otherlv_2= 'alloca' ( (lv_type_3_0= ruleTypeUse ) ) (otherlv_4= ',' ( (lv_numOfElements_5_0= ruleParameter ) ) )? (otherlv_6= ',' otherlv_7= 'align' ( (lv_align_8_0= ruleNUMBER ) ) )? )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5341:2: ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' otherlv_2= 'alloca' ( (lv_type_3_0= ruleTypeUse ) ) (otherlv_4= ',' ( (lv_numOfElements_5_0= ruleParameter ) ) )? (otherlv_6= ',' otherlv_7= 'align' ( (lv_align_8_0= ruleNUMBER ) ) )?
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5341:2: ( (lv_result_0_0= ruleAddress ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5342:1: (lv_result_0_0= ruleAddress )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5342:1: (lv_result_0_0= ruleAddress )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5343:3: lv_result_0_0= ruleAddress
            {
             
            	        newCompositeNode(grammarAccess.getAllocAccess().getResultAddressParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleAddress_in_ruleAlloc11952);
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

            otherlv_1=(Token)match(input,77,FOLLOW_77_in_ruleAlloc11964); 

                	newLeafNode(otherlv_1, grammarAccess.getAllocAccess().getEqualsSignKeyword_1());
                
            otherlv_2=(Token)match(input,135,FOLLOW_135_in_ruleAlloc11976); 

                	newLeafNode(otherlv_2, grammarAccess.getAllocAccess().getAllocaKeyword_2());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5367:1: ( (lv_type_3_0= ruleTypeUse ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5368:1: (lv_type_3_0= ruleTypeUse )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5368:1: (lv_type_3_0= ruleTypeUse )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5369:3: lv_type_3_0= ruleTypeUse
            {
             
            	        newCompositeNode(grammarAccess.getAllocAccess().getTypeTypeUseParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeUse_in_ruleAlloc11997);
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

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5385:2: (otherlv_4= ',' ( (lv_numOfElements_5_0= ruleParameter ) ) )?
            int alt119=2;
            int LA119_0 = input.LA(1);

            if ( (LA119_0==80) ) {
                int LA119_1 = input.LA(2);

                if ( (LA119_1==RULE_INT_TYPE||LA119_1==RULE_VALID_ID||(LA119_1>=RULE_PRIMITIVE_VALUE && LA119_1<=RULE_FLOATING_POINT_TYPE)||LA119_1==46||LA119_1==79||(LA119_1>=94 && LA119_1<=95)) ) {
                    alt119=1;
                }
            }
            switch (alt119) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5385:4: otherlv_4= ',' ( (lv_numOfElements_5_0= ruleParameter ) )
                    {
                    otherlv_4=(Token)match(input,80,FOLLOW_80_in_ruleAlloc12010); 

                        	newLeafNode(otherlv_4, grammarAccess.getAllocAccess().getCommaKeyword_4_0());
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5389:1: ( (lv_numOfElements_5_0= ruleParameter ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5390:1: (lv_numOfElements_5_0= ruleParameter )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5390:1: (lv_numOfElements_5_0= ruleParameter )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5391:3: lv_numOfElements_5_0= ruleParameter
                    {
                     
                    	        newCompositeNode(grammarAccess.getAllocAccess().getNumOfElementsParameterParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleParameter_in_ruleAlloc12031);
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

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5407:4: (otherlv_6= ',' otherlv_7= 'align' ( (lv_align_8_0= ruleNUMBER ) ) )?
            int alt120=2;
            int LA120_0 = input.LA(1);

            if ( (LA120_0==80) ) {
                alt120=1;
            }
            switch (alt120) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5407:6: otherlv_6= ',' otherlv_7= 'align' ( (lv_align_8_0= ruleNUMBER ) )
                    {
                    otherlv_6=(Token)match(input,80,FOLLOW_80_in_ruleAlloc12046); 

                        	newLeafNode(otherlv_6, grammarAccess.getAllocAccess().getCommaKeyword_5_0());
                        
                    otherlv_7=(Token)match(input,87,FOLLOW_87_in_ruleAlloc12058); 

                        	newLeafNode(otherlv_7, grammarAccess.getAllocAccess().getAlignKeyword_5_1());
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5415:1: ( (lv_align_8_0= ruleNUMBER ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5416:1: (lv_align_8_0= ruleNUMBER )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5416:1: (lv_align_8_0= ruleNUMBER )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5417:3: lv_align_8_0= ruleNUMBER
                    {
                     
                    	        newCompositeNode(grammarAccess.getAllocAccess().getAlignNUMBERParserRuleCall_5_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleNUMBER_in_ruleAlloc12079);
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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5441:1: entryRulePhiCase returns [EObject current=null] : iv_rulePhiCase= rulePhiCase EOF ;
    public final EObject entryRulePhiCase() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePhiCase = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5442:2: (iv_rulePhiCase= rulePhiCase EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5443:2: iv_rulePhiCase= rulePhiCase EOF
            {
             newCompositeNode(grammarAccess.getPhiCaseRule()); 
            pushFollow(FOLLOW_rulePhiCase_in_entryRulePhiCase12117);
            iv_rulePhiCase=rulePhiCase();

            state._fsp--;

             current =iv_rulePhiCase; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePhiCase12127); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5450:1: rulePhiCase returns [EObject current=null] : ( ( (lv_value_0_0= ruleValue ) ) otherlv_1= ',' ( (lv_label_2_0= RULE_VALID_ID ) ) ) ;
    public final EObject rulePhiCase() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_label_2_0=null;
        EObject lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5453:28: ( ( ( (lv_value_0_0= ruleValue ) ) otherlv_1= ',' ( (lv_label_2_0= RULE_VALID_ID ) ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5454:1: ( ( (lv_value_0_0= ruleValue ) ) otherlv_1= ',' ( (lv_label_2_0= RULE_VALID_ID ) ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5454:1: ( ( (lv_value_0_0= ruleValue ) ) otherlv_1= ',' ( (lv_label_2_0= RULE_VALID_ID ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5454:2: ( (lv_value_0_0= ruleValue ) ) otherlv_1= ',' ( (lv_label_2_0= RULE_VALID_ID ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5454:2: ( (lv_value_0_0= ruleValue ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5455:1: (lv_value_0_0= ruleValue )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5455:1: (lv_value_0_0= ruleValue )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5456:3: lv_value_0_0= ruleValue
            {
             
            	        newCompositeNode(grammarAccess.getPhiCaseAccess().getValueValueParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleValue_in_rulePhiCase12173);
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

            otherlv_1=(Token)match(input,80,FOLLOW_80_in_rulePhiCase12185); 

                	newLeafNode(otherlv_1, grammarAccess.getPhiCaseAccess().getCommaKeyword_1());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5476:1: ( (lv_label_2_0= RULE_VALID_ID ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5477:1: (lv_label_2_0= RULE_VALID_ID )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5477:1: (lv_label_2_0= RULE_VALID_ID )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5478:3: lv_label_2_0= RULE_VALID_ID
            {
            lv_label_2_0=(Token)match(input,RULE_VALID_ID,FOLLOW_RULE_VALID_ID_in_rulePhiCase12202); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5502:1: entryRulePhi returns [EObject current=null] : iv_rulePhi= rulePhi EOF ;
    public final EObject entryRulePhi() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePhi = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5503:2: (iv_rulePhi= rulePhi EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5504:2: iv_rulePhi= rulePhi EOF
            {
             newCompositeNode(grammarAccess.getPhiRule()); 
            pushFollow(FOLLOW_rulePhi_in_entryRulePhi12243);
            iv_rulePhi=rulePhi();

            state._fsp--;

             current =iv_rulePhi; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePhi12253); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5511:1: rulePhi returns [EObject current=null] : ( ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' otherlv_2= 'phi' ( (lv_type_3_0= ruleTypeUse ) ) otherlv_4= '[' ( (lv_cases_5_0= rulePhiCase ) ) otherlv_6= ']' (otherlv_7= ',' otherlv_8= '[' ( (lv_cases_9_0= rulePhiCase ) ) otherlv_10= ']' )* ) ;
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
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5514:28: ( ( ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' otherlv_2= 'phi' ( (lv_type_3_0= ruleTypeUse ) ) otherlv_4= '[' ( (lv_cases_5_0= rulePhiCase ) ) otherlv_6= ']' (otherlv_7= ',' otherlv_8= '[' ( (lv_cases_9_0= rulePhiCase ) ) otherlv_10= ']' )* ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5515:1: ( ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' otherlv_2= 'phi' ( (lv_type_3_0= ruleTypeUse ) ) otherlv_4= '[' ( (lv_cases_5_0= rulePhiCase ) ) otherlv_6= ']' (otherlv_7= ',' otherlv_8= '[' ( (lv_cases_9_0= rulePhiCase ) ) otherlv_10= ']' )* )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5515:1: ( ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' otherlv_2= 'phi' ( (lv_type_3_0= ruleTypeUse ) ) otherlv_4= '[' ( (lv_cases_5_0= rulePhiCase ) ) otherlv_6= ']' (otherlv_7= ',' otherlv_8= '[' ( (lv_cases_9_0= rulePhiCase ) ) otherlv_10= ']' )* )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5515:2: ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' otherlv_2= 'phi' ( (lv_type_3_0= ruleTypeUse ) ) otherlv_4= '[' ( (lv_cases_5_0= rulePhiCase ) ) otherlv_6= ']' (otherlv_7= ',' otherlv_8= '[' ( (lv_cases_9_0= rulePhiCase ) ) otherlv_10= ']' )*
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5515:2: ( (lv_result_0_0= ruleAddress ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5516:1: (lv_result_0_0= ruleAddress )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5516:1: (lv_result_0_0= ruleAddress )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5517:3: lv_result_0_0= ruleAddress
            {
             
            	        newCompositeNode(grammarAccess.getPhiAccess().getResultAddressParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleAddress_in_rulePhi12299);
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

            otherlv_1=(Token)match(input,77,FOLLOW_77_in_rulePhi12311); 

                	newLeafNode(otherlv_1, grammarAccess.getPhiAccess().getEqualsSignKeyword_1());
                
            otherlv_2=(Token)match(input,136,FOLLOW_136_in_rulePhi12323); 

                	newLeafNode(otherlv_2, grammarAccess.getPhiAccess().getPhiKeyword_2());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5541:1: ( (lv_type_3_0= ruleTypeUse ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5542:1: (lv_type_3_0= ruleTypeUse )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5542:1: (lv_type_3_0= ruleTypeUse )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5543:3: lv_type_3_0= ruleTypeUse
            {
             
            	        newCompositeNode(grammarAccess.getPhiAccess().getTypeTypeUseParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeUse_in_rulePhi12344);
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

            otherlv_4=(Token)match(input,79,FOLLOW_79_in_rulePhi12356); 

                	newLeafNode(otherlv_4, grammarAccess.getPhiAccess().getLeftSquareBracketKeyword_4());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5563:1: ( (lv_cases_5_0= rulePhiCase ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5564:1: (lv_cases_5_0= rulePhiCase )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5564:1: (lv_cases_5_0= rulePhiCase )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5565:3: lv_cases_5_0= rulePhiCase
            {
             
            	        newCompositeNode(grammarAccess.getPhiAccess().getCasesPhiCaseParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_rulePhiCase_in_rulePhi12377);
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

            otherlv_6=(Token)match(input,81,FOLLOW_81_in_rulePhi12389); 

                	newLeafNode(otherlv_6, grammarAccess.getPhiAccess().getRightSquareBracketKeyword_6());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5585:1: (otherlv_7= ',' otherlv_8= '[' ( (lv_cases_9_0= rulePhiCase ) ) otherlv_10= ']' )*
            loop121:
            do {
                int alt121=2;
                int LA121_0 = input.LA(1);

                if ( (LA121_0==80) ) {
                    alt121=1;
                }


                switch (alt121) {
            	case 1 :
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5585:3: otherlv_7= ',' otherlv_8= '[' ( (lv_cases_9_0= rulePhiCase ) ) otherlv_10= ']'
            	    {
            	    otherlv_7=(Token)match(input,80,FOLLOW_80_in_rulePhi12402); 

            	        	newLeafNode(otherlv_7, grammarAccess.getPhiAccess().getCommaKeyword_7_0());
            	        
            	    otherlv_8=(Token)match(input,79,FOLLOW_79_in_rulePhi12414); 

            	        	newLeafNode(otherlv_8, grammarAccess.getPhiAccess().getLeftSquareBracketKeyword_7_1());
            	        
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5593:1: ( (lv_cases_9_0= rulePhiCase ) )
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5594:1: (lv_cases_9_0= rulePhiCase )
            	    {
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5594:1: (lv_cases_9_0= rulePhiCase )
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5595:3: lv_cases_9_0= rulePhiCase
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPhiAccess().getCasesPhiCaseParserRuleCall_7_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePhiCase_in_rulePhi12435);
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

            	    otherlv_10=(Token)match(input,81,FOLLOW_81_in_rulePhi12447); 

            	        	newLeafNode(otherlv_10, grammarAccess.getPhiAccess().getRightSquareBracketKeyword_7_3());
            	        

            	    }
            	    break;

            	default :
            	    break loop121;
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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5623:1: entryRuleLandingPad returns [EObject current=null] : iv_ruleLandingPad= ruleLandingPad EOF ;
    public final EObject entryRuleLandingPad() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLandingPad = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5624:2: (iv_ruleLandingPad= ruleLandingPad EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5625:2: iv_ruleLandingPad= ruleLandingPad EOF
            {
             newCompositeNode(grammarAccess.getLandingPadRule()); 
            pushFollow(FOLLOW_ruleLandingPad_in_entryRuleLandingPad12485);
            iv_ruleLandingPad=ruleLandingPad();

            state._fsp--;

             current =iv_ruleLandingPad; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLandingPad12495); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5632:1: ruleLandingPad returns [EObject current=null] : ( ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' otherlv_2= 'landingpad' ( (lv_struct_3_0= ruleStructure ) ) otherlv_4= 'personality' ( (lv_personalitytype_5_0= ruleTypeUse ) ) ( (lv_personalityvalue_6_0= ruleValue ) ) ( (otherlv_7= 'cleanup' ( (lv_clause_8_0= ruleClause ) )* ) | ( (lv_clause_9_0= ruleClause ) )+ ) ) ;
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
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5635:28: ( ( ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' otherlv_2= 'landingpad' ( (lv_struct_3_0= ruleStructure ) ) otherlv_4= 'personality' ( (lv_personalitytype_5_0= ruleTypeUse ) ) ( (lv_personalityvalue_6_0= ruleValue ) ) ( (otherlv_7= 'cleanup' ( (lv_clause_8_0= ruleClause ) )* ) | ( (lv_clause_9_0= ruleClause ) )+ ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5636:1: ( ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' otherlv_2= 'landingpad' ( (lv_struct_3_0= ruleStructure ) ) otherlv_4= 'personality' ( (lv_personalitytype_5_0= ruleTypeUse ) ) ( (lv_personalityvalue_6_0= ruleValue ) ) ( (otherlv_7= 'cleanup' ( (lv_clause_8_0= ruleClause ) )* ) | ( (lv_clause_9_0= ruleClause ) )+ ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5636:1: ( ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' otherlv_2= 'landingpad' ( (lv_struct_3_0= ruleStructure ) ) otherlv_4= 'personality' ( (lv_personalitytype_5_0= ruleTypeUse ) ) ( (lv_personalityvalue_6_0= ruleValue ) ) ( (otherlv_7= 'cleanup' ( (lv_clause_8_0= ruleClause ) )* ) | ( (lv_clause_9_0= ruleClause ) )+ ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5636:2: ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' otherlv_2= 'landingpad' ( (lv_struct_3_0= ruleStructure ) ) otherlv_4= 'personality' ( (lv_personalitytype_5_0= ruleTypeUse ) ) ( (lv_personalityvalue_6_0= ruleValue ) ) ( (otherlv_7= 'cleanup' ( (lv_clause_8_0= ruleClause ) )* ) | ( (lv_clause_9_0= ruleClause ) )+ )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5636:2: ( (lv_result_0_0= ruleAddress ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5637:1: (lv_result_0_0= ruleAddress )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5637:1: (lv_result_0_0= ruleAddress )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5638:3: lv_result_0_0= ruleAddress
            {
             
            	        newCompositeNode(grammarAccess.getLandingPadAccess().getResultAddressParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleAddress_in_ruleLandingPad12541);
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

            otherlv_1=(Token)match(input,77,FOLLOW_77_in_ruleLandingPad12553); 

                	newLeafNode(otherlv_1, grammarAccess.getLandingPadAccess().getEqualsSignKeyword_1());
                
            otherlv_2=(Token)match(input,137,FOLLOW_137_in_ruleLandingPad12565); 

                	newLeafNode(otherlv_2, grammarAccess.getLandingPadAccess().getLandingpadKeyword_2());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5662:1: ( (lv_struct_3_0= ruleStructure ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5663:1: (lv_struct_3_0= ruleStructure )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5663:1: (lv_struct_3_0= ruleStructure )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5664:3: lv_struct_3_0= ruleStructure
            {
             
            	        newCompositeNode(grammarAccess.getLandingPadAccess().getStructStructureParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleStructure_in_ruleLandingPad12586);
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

            otherlv_4=(Token)match(input,138,FOLLOW_138_in_ruleLandingPad12598); 

                	newLeafNode(otherlv_4, grammarAccess.getLandingPadAccess().getPersonalityKeyword_4());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5684:1: ( (lv_personalitytype_5_0= ruleTypeUse ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5685:1: (lv_personalitytype_5_0= ruleTypeUse )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5685:1: (lv_personalitytype_5_0= ruleTypeUse )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5686:3: lv_personalitytype_5_0= ruleTypeUse
            {
             
            	        newCompositeNode(grammarAccess.getLandingPadAccess().getPersonalitytypeTypeUseParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeUse_in_ruleLandingPad12619);
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

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5702:2: ( (lv_personalityvalue_6_0= ruleValue ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5703:1: (lv_personalityvalue_6_0= ruleValue )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5703:1: (lv_personalityvalue_6_0= ruleValue )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5704:3: lv_personalityvalue_6_0= ruleValue
            {
             
            	        newCompositeNode(grammarAccess.getLandingPadAccess().getPersonalityvalueValueParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleValue_in_ruleLandingPad12640);
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

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5720:2: ( (otherlv_7= 'cleanup' ( (lv_clause_8_0= ruleClause ) )* ) | ( (lv_clause_9_0= ruleClause ) )+ )
            int alt124=2;
            int LA124_0 = input.LA(1);

            if ( (LA124_0==139) ) {
                alt124=1;
            }
            else if ( (LA124_0==68||LA124_0==140) ) {
                alt124=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 124, 0, input);

                throw nvae;
            }
            switch (alt124) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5720:3: (otherlv_7= 'cleanup' ( (lv_clause_8_0= ruleClause ) )* )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5720:3: (otherlv_7= 'cleanup' ( (lv_clause_8_0= ruleClause ) )* )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5720:5: otherlv_7= 'cleanup' ( (lv_clause_8_0= ruleClause ) )*
                    {
                    otherlv_7=(Token)match(input,139,FOLLOW_139_in_ruleLandingPad12654); 

                        	newLeafNode(otherlv_7, grammarAccess.getLandingPadAccess().getCleanupKeyword_7_0_0());
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5724:1: ( (lv_clause_8_0= ruleClause ) )*
                    loop122:
                    do {
                        int alt122=2;
                        int LA122_0 = input.LA(1);

                        if ( (LA122_0==68) ) {
                            int LA122_2 = input.LA(2);

                            if ( (LA122_2==RULE_INT_TYPE||LA122_2==RULE_VALID_ID||(LA122_2>=RULE_PRIMITIVE_VALUE && LA122_2<=RULE_FLOATING_POINT_TYPE)) ) {
                                alt122=1;
                            }


                        }
                        else if ( (LA122_0==140) ) {
                            alt122=1;
                        }


                        switch (alt122) {
                    	case 1 :
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5725:1: (lv_clause_8_0= ruleClause )
                    	    {
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5725:1: (lv_clause_8_0= ruleClause )
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5726:3: lv_clause_8_0= ruleClause
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getLandingPadAccess().getClauseClauseParserRuleCall_7_0_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleClause_in_ruleLandingPad12675);
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
                    	    break loop122;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5743:6: ( (lv_clause_9_0= ruleClause ) )+
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5743:6: ( (lv_clause_9_0= ruleClause ) )+
                    int cnt123=0;
                    loop123:
                    do {
                        int alt123=2;
                        int LA123_0 = input.LA(1);

                        if ( (LA123_0==68) ) {
                            int LA123_2 = input.LA(2);

                            if ( (LA123_2==RULE_INT_TYPE||LA123_2==RULE_VALID_ID||(LA123_2>=RULE_PRIMITIVE_VALUE && LA123_2<=RULE_FLOATING_POINT_TYPE)) ) {
                                alt123=1;
                            }


                        }
                        else if ( (LA123_0==140) ) {
                            alt123=1;
                        }


                        switch (alt123) {
                    	case 1 :
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5744:1: (lv_clause_9_0= ruleClause )
                    	    {
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5744:1: (lv_clause_9_0= ruleClause )
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5745:3: lv_clause_9_0= ruleClause
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getLandingPadAccess().getClauseClauseParserRuleCall_7_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleClause_in_ruleLandingPad12704);
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
                    	    if ( cnt123 >= 1 ) break loop123;
                                EarlyExitException eee =
                                    new EarlyExitException(123, input);
                                throw eee;
                        }
                        cnt123++;
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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5769:1: entryRuleClause returns [EObject current=null] : iv_ruleClause= ruleClause EOF ;
    public final EObject entryRuleClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClause = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5770:2: (iv_ruleClause= ruleClause EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5771:2: iv_ruleClause= ruleClause EOF
            {
             newCompositeNode(grammarAccess.getClauseRule()); 
            pushFollow(FOLLOW_ruleClause_in_entryRuleClause12742);
            iv_ruleClause=ruleClause();

            state._fsp--;

             current =iv_ruleClause; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClause12752); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5778:1: ruleClause returns [EObject current=null] : ( (otherlv_0= 'catch' ( (lv_type_1_0= ruleTypeUse ) ) ( (lv_value_2_0= ruleValue ) ) ) | (otherlv_3= 'filter' ( (lv_filterarray_4_0= ruleArray ) ) ( (lv_constant_5_0= ruleValue ) ) ) ) ;
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
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5781:28: ( ( (otherlv_0= 'catch' ( (lv_type_1_0= ruleTypeUse ) ) ( (lv_value_2_0= ruleValue ) ) ) | (otherlv_3= 'filter' ( (lv_filterarray_4_0= ruleArray ) ) ( (lv_constant_5_0= ruleValue ) ) ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5782:1: ( (otherlv_0= 'catch' ( (lv_type_1_0= ruleTypeUse ) ) ( (lv_value_2_0= ruleValue ) ) ) | (otherlv_3= 'filter' ( (lv_filterarray_4_0= ruleArray ) ) ( (lv_constant_5_0= ruleValue ) ) ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5782:1: ( (otherlv_0= 'catch' ( (lv_type_1_0= ruleTypeUse ) ) ( (lv_value_2_0= ruleValue ) ) ) | (otherlv_3= 'filter' ( (lv_filterarray_4_0= ruleArray ) ) ( (lv_constant_5_0= ruleValue ) ) ) )
            int alt125=2;
            int LA125_0 = input.LA(1);

            if ( (LA125_0==68) ) {
                alt125=1;
            }
            else if ( (LA125_0==140) ) {
                alt125=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 125, 0, input);

                throw nvae;
            }
            switch (alt125) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5782:2: (otherlv_0= 'catch' ( (lv_type_1_0= ruleTypeUse ) ) ( (lv_value_2_0= ruleValue ) ) )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5782:2: (otherlv_0= 'catch' ( (lv_type_1_0= ruleTypeUse ) ) ( (lv_value_2_0= ruleValue ) ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5782:4: otherlv_0= 'catch' ( (lv_type_1_0= ruleTypeUse ) ) ( (lv_value_2_0= ruleValue ) )
                    {
                    otherlv_0=(Token)match(input,68,FOLLOW_68_in_ruleClause12790); 

                        	newLeafNode(otherlv_0, grammarAccess.getClauseAccess().getCatchKeyword_0_0());
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5786:1: ( (lv_type_1_0= ruleTypeUse ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5787:1: (lv_type_1_0= ruleTypeUse )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5787:1: (lv_type_1_0= ruleTypeUse )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5788:3: lv_type_1_0= ruleTypeUse
                    {
                     
                    	        newCompositeNode(grammarAccess.getClauseAccess().getTypeTypeUseParserRuleCall_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTypeUse_in_ruleClause12811);
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

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5804:2: ( (lv_value_2_0= ruleValue ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5805:1: (lv_value_2_0= ruleValue )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5805:1: (lv_value_2_0= ruleValue )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5806:3: lv_value_2_0= ruleValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getClauseAccess().getValueValueParserRuleCall_0_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleValue_in_ruleClause12832);
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
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5823:6: (otherlv_3= 'filter' ( (lv_filterarray_4_0= ruleArray ) ) ( (lv_constant_5_0= ruleValue ) ) )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5823:6: (otherlv_3= 'filter' ( (lv_filterarray_4_0= ruleArray ) ) ( (lv_constant_5_0= ruleValue ) ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5823:8: otherlv_3= 'filter' ( (lv_filterarray_4_0= ruleArray ) ) ( (lv_constant_5_0= ruleValue ) )
                    {
                    otherlv_3=(Token)match(input,140,FOLLOW_140_in_ruleClause12852); 

                        	newLeafNode(otherlv_3, grammarAccess.getClauseAccess().getFilterKeyword_1_0());
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5827:1: ( (lv_filterarray_4_0= ruleArray ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5828:1: (lv_filterarray_4_0= ruleArray )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5828:1: (lv_filterarray_4_0= ruleArray )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5829:3: lv_filterarray_4_0= ruleArray
                    {
                     
                    	        newCompositeNode(grammarAccess.getClauseAccess().getFilterarrayArrayParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleArray_in_ruleClause12873);
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

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5845:2: ( (lv_constant_5_0= ruleValue ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5846:1: (lv_constant_5_0= ruleValue )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5846:1: (lv_constant_5_0= ruleValue )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5847:3: lv_constant_5_0= ruleValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getClauseAccess().getConstantValueParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleValue_in_ruleClause12894);
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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5871:1: entryRuleSelect returns [EObject current=null] : iv_ruleSelect= ruleSelect EOF ;
    public final EObject entryRuleSelect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelect = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5872:2: (iv_ruleSelect= ruleSelect EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5873:2: iv_ruleSelect= ruleSelect EOF
            {
             newCompositeNode(grammarAccess.getSelectRule()); 
            pushFollow(FOLLOW_ruleSelect_in_entryRuleSelect12931);
            iv_ruleSelect=ruleSelect();

            state._fsp--;

             current =iv_ruleSelect; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelect12941); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5880:1: ruleSelect returns [EObject current=null] : ( ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' otherlv_2= 'select' ( (lv_condition_3_0= ruleParameter ) ) otherlv_4= ',' ( (lv_trueValue_5_0= ruleParameter ) ) otherlv_6= ',' ( (lv_elseValue_7_0= ruleParameter ) ) ) ;
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
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5883:28: ( ( ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' otherlv_2= 'select' ( (lv_condition_3_0= ruleParameter ) ) otherlv_4= ',' ( (lv_trueValue_5_0= ruleParameter ) ) otherlv_6= ',' ( (lv_elseValue_7_0= ruleParameter ) ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5884:1: ( ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' otherlv_2= 'select' ( (lv_condition_3_0= ruleParameter ) ) otherlv_4= ',' ( (lv_trueValue_5_0= ruleParameter ) ) otherlv_6= ',' ( (lv_elseValue_7_0= ruleParameter ) ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5884:1: ( ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' otherlv_2= 'select' ( (lv_condition_3_0= ruleParameter ) ) otherlv_4= ',' ( (lv_trueValue_5_0= ruleParameter ) ) otherlv_6= ',' ( (lv_elseValue_7_0= ruleParameter ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5884:2: ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' otherlv_2= 'select' ( (lv_condition_3_0= ruleParameter ) ) otherlv_4= ',' ( (lv_trueValue_5_0= ruleParameter ) ) otherlv_6= ',' ( (lv_elseValue_7_0= ruleParameter ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5884:2: ( (lv_result_0_0= ruleAddress ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5885:1: (lv_result_0_0= ruleAddress )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5885:1: (lv_result_0_0= ruleAddress )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5886:3: lv_result_0_0= ruleAddress
            {
             
            	        newCompositeNode(grammarAccess.getSelectAccess().getResultAddressParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleAddress_in_ruleSelect12987);
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

            otherlv_1=(Token)match(input,77,FOLLOW_77_in_ruleSelect12999); 

                	newLeafNode(otherlv_1, grammarAccess.getSelectAccess().getEqualsSignKeyword_1());
                
            otherlv_2=(Token)match(input,141,FOLLOW_141_in_ruleSelect13011); 

                	newLeafNode(otherlv_2, grammarAccess.getSelectAccess().getSelectKeyword_2());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5910:1: ( (lv_condition_3_0= ruleParameter ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5911:1: (lv_condition_3_0= ruleParameter )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5911:1: (lv_condition_3_0= ruleParameter )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5912:3: lv_condition_3_0= ruleParameter
            {
             
            	        newCompositeNode(grammarAccess.getSelectAccess().getConditionParameterParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleParameter_in_ruleSelect13032);
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

            otherlv_4=(Token)match(input,80,FOLLOW_80_in_ruleSelect13044); 

                	newLeafNode(otherlv_4, grammarAccess.getSelectAccess().getCommaKeyword_4());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5932:1: ( (lv_trueValue_5_0= ruleParameter ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5933:1: (lv_trueValue_5_0= ruleParameter )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5933:1: (lv_trueValue_5_0= ruleParameter )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5934:3: lv_trueValue_5_0= ruleParameter
            {
             
            	        newCompositeNode(grammarAccess.getSelectAccess().getTrueValueParameterParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleParameter_in_ruleSelect13065);
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

            otherlv_6=(Token)match(input,80,FOLLOW_80_in_ruleSelect13077); 

                	newLeafNode(otherlv_6, grammarAccess.getSelectAccess().getCommaKeyword_6());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5954:1: ( (lv_elseValue_7_0= ruleParameter ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5955:1: (lv_elseValue_7_0= ruleParameter )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5955:1: (lv_elseValue_7_0= ruleParameter )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5956:3: lv_elseValue_7_0= ruleParameter
            {
             
            	        newCompositeNode(grammarAccess.getSelectAccess().getElseValueParameterParserRuleCall_7_0()); 
            	    
            pushFollow(FOLLOW_ruleParameter_in_ruleSelect13098);
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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5980:1: entryRuleVariableAttributeAccess returns [EObject current=null] : iv_ruleVariableAttributeAccess= ruleVariableAttributeAccess EOF ;
    public final EObject entryRuleVariableAttributeAccess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableAttributeAccess = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5981:2: (iv_ruleVariableAttributeAccess= ruleVariableAttributeAccess EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5982:2: iv_ruleVariableAttributeAccess= ruleVariableAttributeAccess EOF
            {
             newCompositeNode(grammarAccess.getVariableAttributeAccessRule()); 
            pushFollow(FOLLOW_ruleVariableAttributeAccess_in_entryRuleVariableAttributeAccess13134);
            iv_ruleVariableAttributeAccess=ruleVariableAttributeAccess();

            state._fsp--;

             current =iv_ruleVariableAttributeAccess; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableAttributeAccess13144); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5989:1: ruleVariableAttributeAccess returns [EObject current=null] : ( ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' otherlv_2= 'va_arg' ( (lv_vaList_3_0= ruleParameter ) ) otherlv_4= ',' ( (lv_aType_5_0= ruleTypeUse ) ) ) ;
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
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5992:28: ( ( ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' otherlv_2= 'va_arg' ( (lv_vaList_3_0= ruleParameter ) ) otherlv_4= ',' ( (lv_aType_5_0= ruleTypeUse ) ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5993:1: ( ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' otherlv_2= 'va_arg' ( (lv_vaList_3_0= ruleParameter ) ) otherlv_4= ',' ( (lv_aType_5_0= ruleTypeUse ) ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5993:1: ( ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' otherlv_2= 'va_arg' ( (lv_vaList_3_0= ruleParameter ) ) otherlv_4= ',' ( (lv_aType_5_0= ruleTypeUse ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5993:2: ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' otherlv_2= 'va_arg' ( (lv_vaList_3_0= ruleParameter ) ) otherlv_4= ',' ( (lv_aType_5_0= ruleTypeUse ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5993:2: ( (lv_result_0_0= ruleAddress ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5994:1: (lv_result_0_0= ruleAddress )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5994:1: (lv_result_0_0= ruleAddress )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5995:3: lv_result_0_0= ruleAddress
            {
             
            	        newCompositeNode(grammarAccess.getVariableAttributeAccessAccess().getResultAddressParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleAddress_in_ruleVariableAttributeAccess13190);
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

            otherlv_1=(Token)match(input,77,FOLLOW_77_in_ruleVariableAttributeAccess13202); 

                	newLeafNode(otherlv_1, grammarAccess.getVariableAttributeAccessAccess().getEqualsSignKeyword_1());
                
            otherlv_2=(Token)match(input,142,FOLLOW_142_in_ruleVariableAttributeAccess13214); 

                	newLeafNode(otherlv_2, grammarAccess.getVariableAttributeAccessAccess().getVa_argKeyword_2());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6019:1: ( (lv_vaList_3_0= ruleParameter ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6020:1: (lv_vaList_3_0= ruleParameter )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6020:1: (lv_vaList_3_0= ruleParameter )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6021:3: lv_vaList_3_0= ruleParameter
            {
             
            	        newCompositeNode(grammarAccess.getVariableAttributeAccessAccess().getVaListParameterParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleParameter_in_ruleVariableAttributeAccess13235);
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

            otherlv_4=(Token)match(input,80,FOLLOW_80_in_ruleVariableAttributeAccess13247); 

                	newLeafNode(otherlv_4, grammarAccess.getVariableAttributeAccessAccess().getCommaKeyword_4());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6041:1: ( (lv_aType_5_0= ruleTypeUse ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6042:1: (lv_aType_5_0= ruleTypeUse )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6042:1: (lv_aType_5_0= ruleTypeUse )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6043:3: lv_aType_5_0= ruleTypeUse
            {
             
            	        newCompositeNode(grammarAccess.getVariableAttributeAccessAccess().getATypeTypeUseParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeUse_in_ruleVariableAttributeAccess13268);
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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6067:1: entryRuleExtractValue returns [EObject current=null] : iv_ruleExtractValue= ruleExtractValue EOF ;
    public final EObject entryRuleExtractValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtractValue = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6068:2: (iv_ruleExtractValue= ruleExtractValue EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6069:2: iv_ruleExtractValue= ruleExtractValue EOF
            {
             newCompositeNode(grammarAccess.getExtractValueRule()); 
            pushFollow(FOLLOW_ruleExtractValue_in_entryRuleExtractValue13304);
            iv_ruleExtractValue=ruleExtractValue();

            state._fsp--;

             current =iv_ruleExtractValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExtractValue13314); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6076:1: ruleExtractValue returns [EObject current=null] : ( ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' otherlv_2= 'extractvalue' ( (lv_aggerate_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_index_5_0= ruleNUMBER ) ) )+ ) ;
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
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6079:28: ( ( ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' otherlv_2= 'extractvalue' ( (lv_aggerate_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_index_5_0= ruleNUMBER ) ) )+ ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6080:1: ( ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' otherlv_2= 'extractvalue' ( (lv_aggerate_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_index_5_0= ruleNUMBER ) ) )+ )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6080:1: ( ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' otherlv_2= 'extractvalue' ( (lv_aggerate_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_index_5_0= ruleNUMBER ) ) )+ )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6080:2: ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' otherlv_2= 'extractvalue' ( (lv_aggerate_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_index_5_0= ruleNUMBER ) ) )+
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6080:2: ( (lv_result_0_0= ruleAddress ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6081:1: (lv_result_0_0= ruleAddress )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6081:1: (lv_result_0_0= ruleAddress )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6082:3: lv_result_0_0= ruleAddress
            {
             
            	        newCompositeNode(grammarAccess.getExtractValueAccess().getResultAddressParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleAddress_in_ruleExtractValue13360);
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

            otherlv_1=(Token)match(input,77,FOLLOW_77_in_ruleExtractValue13372); 

                	newLeafNode(otherlv_1, grammarAccess.getExtractValueAccess().getEqualsSignKeyword_1());
                
            otherlv_2=(Token)match(input,143,FOLLOW_143_in_ruleExtractValue13384); 

                	newLeafNode(otherlv_2, grammarAccess.getExtractValueAccess().getExtractvalueKeyword_2());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6106:1: ( (lv_aggerate_3_0= ruleParameter ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6107:1: (lv_aggerate_3_0= ruleParameter )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6107:1: (lv_aggerate_3_0= ruleParameter )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6108:3: lv_aggerate_3_0= ruleParameter
            {
             
            	        newCompositeNode(grammarAccess.getExtractValueAccess().getAggerateParameterParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleParameter_in_ruleExtractValue13405);
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

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6124:2: (otherlv_4= ',' ( (lv_index_5_0= ruleNUMBER ) ) )+
            int cnt126=0;
            loop126:
            do {
                int alt126=2;
                int LA126_0 = input.LA(1);

                if ( (LA126_0==80) ) {
                    alt126=1;
                }


                switch (alt126) {
            	case 1 :
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6124:4: otherlv_4= ',' ( (lv_index_5_0= ruleNUMBER ) )
            	    {
            	    otherlv_4=(Token)match(input,80,FOLLOW_80_in_ruleExtractValue13418); 

            	        	newLeafNode(otherlv_4, grammarAccess.getExtractValueAccess().getCommaKeyword_4_0());
            	        
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6128:1: ( (lv_index_5_0= ruleNUMBER ) )
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6129:1: (lv_index_5_0= ruleNUMBER )
            	    {
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6129:1: (lv_index_5_0= ruleNUMBER )
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6130:3: lv_index_5_0= ruleNUMBER
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExtractValueAccess().getIndexNUMBERParserRuleCall_4_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleNUMBER_in_ruleExtractValue13439);
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
            	    if ( cnt126 >= 1 ) break loop126;
                        EarlyExitException eee =
                            new EarlyExitException(126, input);
                        throw eee;
                }
                cnt126++;
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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6154:1: entryRuleInsertValue returns [EObject current=null] : iv_ruleInsertValue= ruleInsertValue EOF ;
    public final EObject entryRuleInsertValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInsertValue = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6155:2: (iv_ruleInsertValue= ruleInsertValue EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6156:2: iv_ruleInsertValue= ruleInsertValue EOF
            {
             newCompositeNode(grammarAccess.getInsertValueRule()); 
            pushFollow(FOLLOW_ruleInsertValue_in_entryRuleInsertValue13477);
            iv_ruleInsertValue=ruleInsertValue();

            state._fsp--;

             current =iv_ruleInsertValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInsertValue13487); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6163:1: ruleInsertValue returns [EObject current=null] : ( ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' otherlv_2= 'insertvalue' ( (lv_aggerate_3_0= ruleParameter ) ) otherlv_4= ',' ( (lv_value_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_index_7_0= ruleNUMBER ) ) )+ ) ;
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
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6166:28: ( ( ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' otherlv_2= 'insertvalue' ( (lv_aggerate_3_0= ruleParameter ) ) otherlv_4= ',' ( (lv_value_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_index_7_0= ruleNUMBER ) ) )+ ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6167:1: ( ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' otherlv_2= 'insertvalue' ( (lv_aggerate_3_0= ruleParameter ) ) otherlv_4= ',' ( (lv_value_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_index_7_0= ruleNUMBER ) ) )+ )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6167:1: ( ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' otherlv_2= 'insertvalue' ( (lv_aggerate_3_0= ruleParameter ) ) otherlv_4= ',' ( (lv_value_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_index_7_0= ruleNUMBER ) ) )+ )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6167:2: ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' otherlv_2= 'insertvalue' ( (lv_aggerate_3_0= ruleParameter ) ) otherlv_4= ',' ( (lv_value_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_index_7_0= ruleNUMBER ) ) )+
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6167:2: ( (lv_result_0_0= ruleAddress ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6168:1: (lv_result_0_0= ruleAddress )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6168:1: (lv_result_0_0= ruleAddress )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6169:3: lv_result_0_0= ruleAddress
            {
             
            	        newCompositeNode(grammarAccess.getInsertValueAccess().getResultAddressParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleAddress_in_ruleInsertValue13533);
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

            otherlv_1=(Token)match(input,77,FOLLOW_77_in_ruleInsertValue13545); 

                	newLeafNode(otherlv_1, grammarAccess.getInsertValueAccess().getEqualsSignKeyword_1());
                
            otherlv_2=(Token)match(input,144,FOLLOW_144_in_ruleInsertValue13557); 

                	newLeafNode(otherlv_2, grammarAccess.getInsertValueAccess().getInsertvalueKeyword_2());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6193:1: ( (lv_aggerate_3_0= ruleParameter ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6194:1: (lv_aggerate_3_0= ruleParameter )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6194:1: (lv_aggerate_3_0= ruleParameter )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6195:3: lv_aggerate_3_0= ruleParameter
            {
             
            	        newCompositeNode(grammarAccess.getInsertValueAccess().getAggerateParameterParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleParameter_in_ruleInsertValue13578);
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

            otherlv_4=(Token)match(input,80,FOLLOW_80_in_ruleInsertValue13590); 

                	newLeafNode(otherlv_4, grammarAccess.getInsertValueAccess().getCommaKeyword_4());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6215:1: ( (lv_value_5_0= ruleParameter ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6216:1: (lv_value_5_0= ruleParameter )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6216:1: (lv_value_5_0= ruleParameter )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6217:3: lv_value_5_0= ruleParameter
            {
             
            	        newCompositeNode(grammarAccess.getInsertValueAccess().getValueParameterParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleParameter_in_ruleInsertValue13611);
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

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6233:2: (otherlv_6= ',' ( (lv_index_7_0= ruleNUMBER ) ) )+
            int cnt127=0;
            loop127:
            do {
                int alt127=2;
                int LA127_0 = input.LA(1);

                if ( (LA127_0==80) ) {
                    alt127=1;
                }


                switch (alt127) {
            	case 1 :
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6233:4: otherlv_6= ',' ( (lv_index_7_0= ruleNUMBER ) )
            	    {
            	    otherlv_6=(Token)match(input,80,FOLLOW_80_in_ruleInsertValue13624); 

            	        	newLeafNode(otherlv_6, grammarAccess.getInsertValueAccess().getCommaKeyword_6_0());
            	        
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6237:1: ( (lv_index_7_0= ruleNUMBER ) )
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6238:1: (lv_index_7_0= ruleNUMBER )
            	    {
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6238:1: (lv_index_7_0= ruleNUMBER )
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6239:3: lv_index_7_0= ruleNUMBER
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getInsertValueAccess().getIndexNUMBERParserRuleCall_6_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleNUMBER_in_ruleInsertValue13645);
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
            	    if ( cnt127 >= 1 ) break loop127;
                        EarlyExitException eee =
                            new EarlyExitException(127, input);
                        throw eee;
                }
                cnt127++;
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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6263:1: entryRuleExtractElement returns [EObject current=null] : iv_ruleExtractElement= ruleExtractElement EOF ;
    public final EObject entryRuleExtractElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtractElement = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6264:2: (iv_ruleExtractElement= ruleExtractElement EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6265:2: iv_ruleExtractElement= ruleExtractElement EOF
            {
             newCompositeNode(grammarAccess.getExtractElementRule()); 
            pushFollow(FOLLOW_ruleExtractElement_in_entryRuleExtractElement13683);
            iv_ruleExtractElement=ruleExtractElement();

            state._fsp--;

             current =iv_ruleExtractElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExtractElement13693); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6272:1: ruleExtractElement returns [EObject current=null] : ( ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' otherlv_2= 'extractelement' ( (lv_vector_3_0= ruleParameter ) ) otherlv_4= ',' ( (lv_index_5_0= ruleParameter ) ) ) ;
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
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6275:28: ( ( ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' otherlv_2= 'extractelement' ( (lv_vector_3_0= ruleParameter ) ) otherlv_4= ',' ( (lv_index_5_0= ruleParameter ) ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6276:1: ( ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' otherlv_2= 'extractelement' ( (lv_vector_3_0= ruleParameter ) ) otherlv_4= ',' ( (lv_index_5_0= ruleParameter ) ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6276:1: ( ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' otherlv_2= 'extractelement' ( (lv_vector_3_0= ruleParameter ) ) otherlv_4= ',' ( (lv_index_5_0= ruleParameter ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6276:2: ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' otherlv_2= 'extractelement' ( (lv_vector_3_0= ruleParameter ) ) otherlv_4= ',' ( (lv_index_5_0= ruleParameter ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6276:2: ( (lv_result_0_0= ruleAddress ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6277:1: (lv_result_0_0= ruleAddress )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6277:1: (lv_result_0_0= ruleAddress )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6278:3: lv_result_0_0= ruleAddress
            {
             
            	        newCompositeNode(grammarAccess.getExtractElementAccess().getResultAddressParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleAddress_in_ruleExtractElement13739);
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

            otherlv_1=(Token)match(input,77,FOLLOW_77_in_ruleExtractElement13751); 

                	newLeafNode(otherlv_1, grammarAccess.getExtractElementAccess().getEqualsSignKeyword_1());
                
            otherlv_2=(Token)match(input,145,FOLLOW_145_in_ruleExtractElement13763); 

                	newLeafNode(otherlv_2, grammarAccess.getExtractElementAccess().getExtractelementKeyword_2());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6302:1: ( (lv_vector_3_0= ruleParameter ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6303:1: (lv_vector_3_0= ruleParameter )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6303:1: (lv_vector_3_0= ruleParameter )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6304:3: lv_vector_3_0= ruleParameter
            {
             
            	        newCompositeNode(grammarAccess.getExtractElementAccess().getVectorParameterParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleParameter_in_ruleExtractElement13784);
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

            otherlv_4=(Token)match(input,80,FOLLOW_80_in_ruleExtractElement13796); 

                	newLeafNode(otherlv_4, grammarAccess.getExtractElementAccess().getCommaKeyword_4());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6324:1: ( (lv_index_5_0= ruleParameter ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6325:1: (lv_index_5_0= ruleParameter )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6325:1: (lv_index_5_0= ruleParameter )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6326:3: lv_index_5_0= ruleParameter
            {
             
            	        newCompositeNode(grammarAccess.getExtractElementAccess().getIndexParameterParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleParameter_in_ruleExtractElement13817);
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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6350:1: entryRuleInsertElement returns [EObject current=null] : iv_ruleInsertElement= ruleInsertElement EOF ;
    public final EObject entryRuleInsertElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInsertElement = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6351:2: (iv_ruleInsertElement= ruleInsertElement EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6352:2: iv_ruleInsertElement= ruleInsertElement EOF
            {
             newCompositeNode(grammarAccess.getInsertElementRule()); 
            pushFollow(FOLLOW_ruleInsertElement_in_entryRuleInsertElement13853);
            iv_ruleInsertElement=ruleInsertElement();

            state._fsp--;

             current =iv_ruleInsertElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInsertElement13863); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6359:1: ruleInsertElement returns [EObject current=null] : ( ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' otherlv_2= 'insertelement' ( (lv_vector_3_0= ruleParameter ) ) otherlv_4= ',' ( (lv_value_5_0= ruleParameter ) ) otherlv_6= ',' ( (lv_index_7_0= ruleParameter ) ) ) ;
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
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6362:28: ( ( ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' otherlv_2= 'insertelement' ( (lv_vector_3_0= ruleParameter ) ) otherlv_4= ',' ( (lv_value_5_0= ruleParameter ) ) otherlv_6= ',' ( (lv_index_7_0= ruleParameter ) ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6363:1: ( ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' otherlv_2= 'insertelement' ( (lv_vector_3_0= ruleParameter ) ) otherlv_4= ',' ( (lv_value_5_0= ruleParameter ) ) otherlv_6= ',' ( (lv_index_7_0= ruleParameter ) ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6363:1: ( ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' otherlv_2= 'insertelement' ( (lv_vector_3_0= ruleParameter ) ) otherlv_4= ',' ( (lv_value_5_0= ruleParameter ) ) otherlv_6= ',' ( (lv_index_7_0= ruleParameter ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6363:2: ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' otherlv_2= 'insertelement' ( (lv_vector_3_0= ruleParameter ) ) otherlv_4= ',' ( (lv_value_5_0= ruleParameter ) ) otherlv_6= ',' ( (lv_index_7_0= ruleParameter ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6363:2: ( (lv_result_0_0= ruleAddress ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6364:1: (lv_result_0_0= ruleAddress )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6364:1: (lv_result_0_0= ruleAddress )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6365:3: lv_result_0_0= ruleAddress
            {
             
            	        newCompositeNode(grammarAccess.getInsertElementAccess().getResultAddressParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleAddress_in_ruleInsertElement13909);
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

            otherlv_1=(Token)match(input,77,FOLLOW_77_in_ruleInsertElement13921); 

                	newLeafNode(otherlv_1, grammarAccess.getInsertElementAccess().getEqualsSignKeyword_1());
                
            otherlv_2=(Token)match(input,146,FOLLOW_146_in_ruleInsertElement13933); 

                	newLeafNode(otherlv_2, grammarAccess.getInsertElementAccess().getInsertelementKeyword_2());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6389:1: ( (lv_vector_3_0= ruleParameter ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6390:1: (lv_vector_3_0= ruleParameter )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6390:1: (lv_vector_3_0= ruleParameter )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6391:3: lv_vector_3_0= ruleParameter
            {
             
            	        newCompositeNode(grammarAccess.getInsertElementAccess().getVectorParameterParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleParameter_in_ruleInsertElement13954);
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

            otherlv_4=(Token)match(input,80,FOLLOW_80_in_ruleInsertElement13966); 

                	newLeafNode(otherlv_4, grammarAccess.getInsertElementAccess().getCommaKeyword_4());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6411:1: ( (lv_value_5_0= ruleParameter ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6412:1: (lv_value_5_0= ruleParameter )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6412:1: (lv_value_5_0= ruleParameter )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6413:3: lv_value_5_0= ruleParameter
            {
             
            	        newCompositeNode(grammarAccess.getInsertElementAccess().getValueParameterParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleParameter_in_ruleInsertElement13987);
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

            otherlv_6=(Token)match(input,80,FOLLOW_80_in_ruleInsertElement13999); 

                	newLeafNode(otherlv_6, grammarAccess.getInsertElementAccess().getCommaKeyword_6());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6433:1: ( (lv_index_7_0= ruleParameter ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6434:1: (lv_index_7_0= ruleParameter )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6434:1: (lv_index_7_0= ruleParameter )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6435:3: lv_index_7_0= ruleParameter
            {
             
            	        newCompositeNode(grammarAccess.getInsertElementAccess().getIndexParameterParserRuleCall_7_0()); 
            	    
            pushFollow(FOLLOW_ruleParameter_in_ruleInsertElement14020);
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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6459:1: entryRuleShuffleVector returns [EObject current=null] : iv_ruleShuffleVector= ruleShuffleVector EOF ;
    public final EObject entryRuleShuffleVector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShuffleVector = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6460:2: (iv_ruleShuffleVector= ruleShuffleVector EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6461:2: iv_ruleShuffleVector= ruleShuffleVector EOF
            {
             newCompositeNode(grammarAccess.getShuffleVectorRule()); 
            pushFollow(FOLLOW_ruleShuffleVector_in_entryRuleShuffleVector14056);
            iv_ruleShuffleVector=ruleShuffleVector();

            state._fsp--;

             current =iv_ruleShuffleVector; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleShuffleVector14066); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6468:1: ruleShuffleVector returns [EObject current=null] : ( ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' otherlv_2= 'shufflevector' ( (lv_value1_3_0= ruleParameter ) ) otherlv_4= ',' ( (lv_value2_5_0= ruleParameter ) ) otherlv_6= ',' ( (lv_mask_7_0= ruleParameter ) ) ) ;
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
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6471:28: ( ( ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' otherlv_2= 'shufflevector' ( (lv_value1_3_0= ruleParameter ) ) otherlv_4= ',' ( (lv_value2_5_0= ruleParameter ) ) otherlv_6= ',' ( (lv_mask_7_0= ruleParameter ) ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6472:1: ( ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' otherlv_2= 'shufflevector' ( (lv_value1_3_0= ruleParameter ) ) otherlv_4= ',' ( (lv_value2_5_0= ruleParameter ) ) otherlv_6= ',' ( (lv_mask_7_0= ruleParameter ) ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6472:1: ( ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' otherlv_2= 'shufflevector' ( (lv_value1_3_0= ruleParameter ) ) otherlv_4= ',' ( (lv_value2_5_0= ruleParameter ) ) otherlv_6= ',' ( (lv_mask_7_0= ruleParameter ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6472:2: ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' otherlv_2= 'shufflevector' ( (lv_value1_3_0= ruleParameter ) ) otherlv_4= ',' ( (lv_value2_5_0= ruleParameter ) ) otherlv_6= ',' ( (lv_mask_7_0= ruleParameter ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6472:2: ( (lv_result_0_0= ruleAddress ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6473:1: (lv_result_0_0= ruleAddress )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6473:1: (lv_result_0_0= ruleAddress )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6474:3: lv_result_0_0= ruleAddress
            {
             
            	        newCompositeNode(grammarAccess.getShuffleVectorAccess().getResultAddressParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleAddress_in_ruleShuffleVector14112);
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

            otherlv_1=(Token)match(input,77,FOLLOW_77_in_ruleShuffleVector14124); 

                	newLeafNode(otherlv_1, grammarAccess.getShuffleVectorAccess().getEqualsSignKeyword_1());
                
            otherlv_2=(Token)match(input,147,FOLLOW_147_in_ruleShuffleVector14136); 

                	newLeafNode(otherlv_2, grammarAccess.getShuffleVectorAccess().getShufflevectorKeyword_2());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6498:1: ( (lv_value1_3_0= ruleParameter ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6499:1: (lv_value1_3_0= ruleParameter )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6499:1: (lv_value1_3_0= ruleParameter )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6500:3: lv_value1_3_0= ruleParameter
            {
             
            	        newCompositeNode(grammarAccess.getShuffleVectorAccess().getValue1ParameterParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleParameter_in_ruleShuffleVector14157);
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

            otherlv_4=(Token)match(input,80,FOLLOW_80_in_ruleShuffleVector14169); 

                	newLeafNode(otherlv_4, grammarAccess.getShuffleVectorAccess().getCommaKeyword_4());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6520:1: ( (lv_value2_5_0= ruleParameter ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6521:1: (lv_value2_5_0= ruleParameter )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6521:1: (lv_value2_5_0= ruleParameter )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6522:3: lv_value2_5_0= ruleParameter
            {
             
            	        newCompositeNode(grammarAccess.getShuffleVectorAccess().getValue2ParameterParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleParameter_in_ruleShuffleVector14190);
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

            otherlv_6=(Token)match(input,80,FOLLOW_80_in_ruleShuffleVector14202); 

                	newLeafNode(otherlv_6, grammarAccess.getShuffleVectorAccess().getCommaKeyword_6());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6542:1: ( (lv_mask_7_0= ruleParameter ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6543:1: (lv_mask_7_0= ruleParameter )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6543:1: (lv_mask_7_0= ruleParameter )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6544:3: lv_mask_7_0= ruleParameter
            {
             
            	        newCompositeNode(grammarAccess.getShuffleVectorAccess().getMaskParameterParserRuleCall_7_0()); 
            	    
            pushFollow(FOLLOW_ruleParameter_in_ruleShuffleVector14223);
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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6568:1: entryRuleCompare returns [EObject current=null] : iv_ruleCompare= ruleCompare EOF ;
    public final EObject entryRuleCompare() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompare = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6569:2: (iv_ruleCompare= ruleCompare EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6570:2: iv_ruleCompare= ruleCompare EOF
            {
             newCompositeNode(grammarAccess.getCompareRule()); 
            pushFollow(FOLLOW_ruleCompare_in_entryRuleCompare14259);
            iv_ruleCompare=ruleCompare();

            state._fsp--;

             current =iv_ruleCompare; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompare14269); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6577:1: ruleCompare returns [EObject current=null] : ( ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' ( (otherlv_2= 'icmp' | otherlv_3= 'fcmp' ) ( ( (lv_cond_4_1= RULE_I_PREDICATES | lv_cond_4_2= RULE_F_PREDICATES | lv_cond_4_3= RULE_BOOL ) ) ) ( (lv_opType_5_0= ruleTypeUse ) ) ( (lv_operand1_6_0= ruleValue ) ) otherlv_7= ',' ( (lv_operand2_8_0= ruleValue ) ) ) ) ;
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
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6580:28: ( ( ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' ( (otherlv_2= 'icmp' | otherlv_3= 'fcmp' ) ( ( (lv_cond_4_1= RULE_I_PREDICATES | lv_cond_4_2= RULE_F_PREDICATES | lv_cond_4_3= RULE_BOOL ) ) ) ( (lv_opType_5_0= ruleTypeUse ) ) ( (lv_operand1_6_0= ruleValue ) ) otherlv_7= ',' ( (lv_operand2_8_0= ruleValue ) ) ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6581:1: ( ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' ( (otherlv_2= 'icmp' | otherlv_3= 'fcmp' ) ( ( (lv_cond_4_1= RULE_I_PREDICATES | lv_cond_4_2= RULE_F_PREDICATES | lv_cond_4_3= RULE_BOOL ) ) ) ( (lv_opType_5_0= ruleTypeUse ) ) ( (lv_operand1_6_0= ruleValue ) ) otherlv_7= ',' ( (lv_operand2_8_0= ruleValue ) ) ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6581:1: ( ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' ( (otherlv_2= 'icmp' | otherlv_3= 'fcmp' ) ( ( (lv_cond_4_1= RULE_I_PREDICATES | lv_cond_4_2= RULE_F_PREDICATES | lv_cond_4_3= RULE_BOOL ) ) ) ( (lv_opType_5_0= ruleTypeUse ) ) ( (lv_operand1_6_0= ruleValue ) ) otherlv_7= ',' ( (lv_operand2_8_0= ruleValue ) ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6581:2: ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' ( (otherlv_2= 'icmp' | otherlv_3= 'fcmp' ) ( ( (lv_cond_4_1= RULE_I_PREDICATES | lv_cond_4_2= RULE_F_PREDICATES | lv_cond_4_3= RULE_BOOL ) ) ) ( (lv_opType_5_0= ruleTypeUse ) ) ( (lv_operand1_6_0= ruleValue ) ) otherlv_7= ',' ( (lv_operand2_8_0= ruleValue ) ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6581:2: ( (lv_result_0_0= ruleAddress ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6582:1: (lv_result_0_0= ruleAddress )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6582:1: (lv_result_0_0= ruleAddress )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6583:3: lv_result_0_0= ruleAddress
            {
             
            	        newCompositeNode(grammarAccess.getCompareAccess().getResultAddressParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleAddress_in_ruleCompare14315);
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

            otherlv_1=(Token)match(input,77,FOLLOW_77_in_ruleCompare14327); 

                	newLeafNode(otherlv_1, grammarAccess.getCompareAccess().getEqualsSignKeyword_1());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6603:1: ( (otherlv_2= 'icmp' | otherlv_3= 'fcmp' ) ( ( (lv_cond_4_1= RULE_I_PREDICATES | lv_cond_4_2= RULE_F_PREDICATES | lv_cond_4_3= RULE_BOOL ) ) ) ( (lv_opType_5_0= ruleTypeUse ) ) ( (lv_operand1_6_0= ruleValue ) ) otherlv_7= ',' ( (lv_operand2_8_0= ruleValue ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6603:2: (otherlv_2= 'icmp' | otherlv_3= 'fcmp' ) ( ( (lv_cond_4_1= RULE_I_PREDICATES | lv_cond_4_2= RULE_F_PREDICATES | lv_cond_4_3= RULE_BOOL ) ) ) ( (lv_opType_5_0= ruleTypeUse ) ) ( (lv_operand1_6_0= ruleValue ) ) otherlv_7= ',' ( (lv_operand2_8_0= ruleValue ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6603:2: (otherlv_2= 'icmp' | otherlv_3= 'fcmp' )
            int alt128=2;
            int LA128_0 = input.LA(1);

            if ( (LA128_0==148) ) {
                alt128=1;
            }
            else if ( (LA128_0==149) ) {
                alt128=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 128, 0, input);

                throw nvae;
            }
            switch (alt128) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6603:4: otherlv_2= 'icmp'
                    {
                    otherlv_2=(Token)match(input,148,FOLLOW_148_in_ruleCompare14341); 

                        	newLeafNode(otherlv_2, grammarAccess.getCompareAccess().getIcmpKeyword_2_0_0());
                        

                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6608:7: otherlv_3= 'fcmp'
                    {
                    otherlv_3=(Token)match(input,149,FOLLOW_149_in_ruleCompare14359); 

                        	newLeafNode(otherlv_3, grammarAccess.getCompareAccess().getFcmpKeyword_2_0_1());
                        

                    }
                    break;

            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6612:2: ( ( (lv_cond_4_1= RULE_I_PREDICATES | lv_cond_4_2= RULE_F_PREDICATES | lv_cond_4_3= RULE_BOOL ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6613:1: ( (lv_cond_4_1= RULE_I_PREDICATES | lv_cond_4_2= RULE_F_PREDICATES | lv_cond_4_3= RULE_BOOL ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6613:1: ( (lv_cond_4_1= RULE_I_PREDICATES | lv_cond_4_2= RULE_F_PREDICATES | lv_cond_4_3= RULE_BOOL ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6614:1: (lv_cond_4_1= RULE_I_PREDICATES | lv_cond_4_2= RULE_F_PREDICATES | lv_cond_4_3= RULE_BOOL )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6614:1: (lv_cond_4_1= RULE_I_PREDICATES | lv_cond_4_2= RULE_F_PREDICATES | lv_cond_4_3= RULE_BOOL )
            int alt129=3;
            switch ( input.LA(1) ) {
            case RULE_I_PREDICATES:
                {
                alt129=1;
                }
                break;
            case RULE_F_PREDICATES:
                {
                alt129=2;
                }
                break;
            case RULE_BOOL:
                {
                alt129=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 129, 0, input);

                throw nvae;
            }

            switch (alt129) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6615:3: lv_cond_4_1= RULE_I_PREDICATES
                    {
                    lv_cond_4_1=(Token)match(input,RULE_I_PREDICATES,FOLLOW_RULE_I_PREDICATES_in_ruleCompare14379); 

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
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6630:8: lv_cond_4_2= RULE_F_PREDICATES
                    {
                    lv_cond_4_2=(Token)match(input,RULE_F_PREDICATES,FOLLOW_RULE_F_PREDICATES_in_ruleCompare14399); 

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
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6645:8: lv_cond_4_3= RULE_BOOL
                    {
                    lv_cond_4_3=(Token)match(input,RULE_BOOL,FOLLOW_RULE_BOOL_in_ruleCompare14419); 

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

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6663:2: ( (lv_opType_5_0= ruleTypeUse ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6664:1: (lv_opType_5_0= ruleTypeUse )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6664:1: (lv_opType_5_0= ruleTypeUse )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6665:3: lv_opType_5_0= ruleTypeUse
            {
             
            	        newCompositeNode(grammarAccess.getCompareAccess().getOpTypeTypeUseParserRuleCall_2_2_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeUse_in_ruleCompare14448);
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

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6681:2: ( (lv_operand1_6_0= ruleValue ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6682:1: (lv_operand1_6_0= ruleValue )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6682:1: (lv_operand1_6_0= ruleValue )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6683:3: lv_operand1_6_0= ruleValue
            {
             
            	        newCompositeNode(grammarAccess.getCompareAccess().getOperand1ValueParserRuleCall_2_3_0()); 
            	    
            pushFollow(FOLLOW_ruleValue_in_ruleCompare14469);
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

            otherlv_7=(Token)match(input,80,FOLLOW_80_in_ruleCompare14481); 

                	newLeafNode(otherlv_7, grammarAccess.getCompareAccess().getCommaKeyword_2_4());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6703:1: ( (lv_operand2_8_0= ruleValue ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6704:1: (lv_operand2_8_0= ruleValue )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6704:1: (lv_operand2_8_0= ruleValue )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6705:3: lv_operand2_8_0= ruleValue
            {
             
            	        newCompositeNode(grammarAccess.getCompareAccess().getOperand2ValueParserRuleCall_2_5_0()); 
            	    
            pushFollow(FOLLOW_ruleValue_in_ruleCompare14502);
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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6729:1: entryRuleIndirectBranch returns [EObject current=null] : iv_ruleIndirectBranch= ruleIndirectBranch EOF ;
    public final EObject entryRuleIndirectBranch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIndirectBranch = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6730:2: (iv_ruleIndirectBranch= ruleIndirectBranch EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6731:2: iv_ruleIndirectBranch= ruleIndirectBranch EOF
            {
             newCompositeNode(grammarAccess.getIndirectBranchRule()); 
            pushFollow(FOLLOW_ruleIndirectBranch_in_entryRuleIndirectBranch14539);
            iv_ruleIndirectBranch=ruleIndirectBranch();

            state._fsp--;

             current =iv_ruleIndirectBranch; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIndirectBranch14549); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6738:1: ruleIndirectBranch returns [EObject current=null] : (otherlv_0= 'indirectbr' ( (lv_target_1_0= ruleParameter ) ) otherlv_2= ',' otherlv_3= '[' (otherlv_4= 'label' ( (lv_potTargetLabels_5_0= RULE_VALID_ID ) ) (otherlv_6= ',' otherlv_7= 'label' ( (lv_potTargetLabels_8_0= RULE_VALID_ID ) ) )* )? otherlv_9= ']' ) ;
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
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6741:28: ( (otherlv_0= 'indirectbr' ( (lv_target_1_0= ruleParameter ) ) otherlv_2= ',' otherlv_3= '[' (otherlv_4= 'label' ( (lv_potTargetLabels_5_0= RULE_VALID_ID ) ) (otherlv_6= ',' otherlv_7= 'label' ( (lv_potTargetLabels_8_0= RULE_VALID_ID ) ) )* )? otherlv_9= ']' ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6742:1: (otherlv_0= 'indirectbr' ( (lv_target_1_0= ruleParameter ) ) otherlv_2= ',' otherlv_3= '[' (otherlv_4= 'label' ( (lv_potTargetLabels_5_0= RULE_VALID_ID ) ) (otherlv_6= ',' otherlv_7= 'label' ( (lv_potTargetLabels_8_0= RULE_VALID_ID ) ) )* )? otherlv_9= ']' )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6742:1: (otherlv_0= 'indirectbr' ( (lv_target_1_0= ruleParameter ) ) otherlv_2= ',' otherlv_3= '[' (otherlv_4= 'label' ( (lv_potTargetLabels_5_0= RULE_VALID_ID ) ) (otherlv_6= ',' otherlv_7= 'label' ( (lv_potTargetLabels_8_0= RULE_VALID_ID ) ) )* )? otherlv_9= ']' )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6742:3: otherlv_0= 'indirectbr' ( (lv_target_1_0= ruleParameter ) ) otherlv_2= ',' otherlv_3= '[' (otherlv_4= 'label' ( (lv_potTargetLabels_5_0= RULE_VALID_ID ) ) (otherlv_6= ',' otherlv_7= 'label' ( (lv_potTargetLabels_8_0= RULE_VALID_ID ) ) )* )? otherlv_9= ']'
            {
            otherlv_0=(Token)match(input,150,FOLLOW_150_in_ruleIndirectBranch14586); 

                	newLeafNode(otherlv_0, grammarAccess.getIndirectBranchAccess().getIndirectbrKeyword_0());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6746:1: ( (lv_target_1_0= ruleParameter ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6747:1: (lv_target_1_0= ruleParameter )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6747:1: (lv_target_1_0= ruleParameter )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6748:3: lv_target_1_0= ruleParameter
            {
             
            	        newCompositeNode(grammarAccess.getIndirectBranchAccess().getTargetParameterParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleParameter_in_ruleIndirectBranch14607);
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

            otherlv_2=(Token)match(input,80,FOLLOW_80_in_ruleIndirectBranch14619); 

                	newLeafNode(otherlv_2, grammarAccess.getIndirectBranchAccess().getCommaKeyword_2());
                
            otherlv_3=(Token)match(input,79,FOLLOW_79_in_ruleIndirectBranch14631); 

                	newLeafNode(otherlv_3, grammarAccess.getIndirectBranchAccess().getLeftSquareBracketKeyword_3());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6772:1: (otherlv_4= 'label' ( (lv_potTargetLabels_5_0= RULE_VALID_ID ) ) (otherlv_6= ',' otherlv_7= 'label' ( (lv_potTargetLabels_8_0= RULE_VALID_ID ) ) )* )?
            int alt131=2;
            int LA131_0 = input.LA(1);

            if ( (LA131_0==151) ) {
                alt131=1;
            }
            switch (alt131) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6772:3: otherlv_4= 'label' ( (lv_potTargetLabels_5_0= RULE_VALID_ID ) ) (otherlv_6= ',' otherlv_7= 'label' ( (lv_potTargetLabels_8_0= RULE_VALID_ID ) ) )*
                    {
                    otherlv_4=(Token)match(input,151,FOLLOW_151_in_ruleIndirectBranch14644); 

                        	newLeafNode(otherlv_4, grammarAccess.getIndirectBranchAccess().getLabelKeyword_4_0());
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6776:1: ( (lv_potTargetLabels_5_0= RULE_VALID_ID ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6777:1: (lv_potTargetLabels_5_0= RULE_VALID_ID )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6777:1: (lv_potTargetLabels_5_0= RULE_VALID_ID )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6778:3: lv_potTargetLabels_5_0= RULE_VALID_ID
                    {
                    lv_potTargetLabels_5_0=(Token)match(input,RULE_VALID_ID,FOLLOW_RULE_VALID_ID_in_ruleIndirectBranch14661); 

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

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6794:2: (otherlv_6= ',' otherlv_7= 'label' ( (lv_potTargetLabels_8_0= RULE_VALID_ID ) ) )*
                    loop130:
                    do {
                        int alt130=2;
                        int LA130_0 = input.LA(1);

                        if ( (LA130_0==80) ) {
                            alt130=1;
                        }


                        switch (alt130) {
                    	case 1 :
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6794:4: otherlv_6= ',' otherlv_7= 'label' ( (lv_potTargetLabels_8_0= RULE_VALID_ID ) )
                    	    {
                    	    otherlv_6=(Token)match(input,80,FOLLOW_80_in_ruleIndirectBranch14679); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getIndirectBranchAccess().getCommaKeyword_4_2_0());
                    	        
                    	    otherlv_7=(Token)match(input,151,FOLLOW_151_in_ruleIndirectBranch14691); 

                    	        	newLeafNode(otherlv_7, grammarAccess.getIndirectBranchAccess().getLabelKeyword_4_2_1());
                    	        
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6802:1: ( (lv_potTargetLabels_8_0= RULE_VALID_ID ) )
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6803:1: (lv_potTargetLabels_8_0= RULE_VALID_ID )
                    	    {
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6803:1: (lv_potTargetLabels_8_0= RULE_VALID_ID )
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6804:3: lv_potTargetLabels_8_0= RULE_VALID_ID
                    	    {
                    	    lv_potTargetLabels_8_0=(Token)match(input,RULE_VALID_ID,FOLLOW_RULE_VALID_ID_in_ruleIndirectBranch14708); 

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
                    	    break loop130;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_9=(Token)match(input,81,FOLLOW_81_in_ruleIndirectBranch14729); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6832:1: entryRuleSwitch returns [EObject current=null] : iv_ruleSwitch= ruleSwitch EOF ;
    public final EObject entryRuleSwitch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSwitch = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6833:2: (iv_ruleSwitch= ruleSwitch EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6834:2: iv_ruleSwitch= ruleSwitch EOF
            {
             newCompositeNode(grammarAccess.getSwitchRule()); 
            pushFollow(FOLLOW_ruleSwitch_in_entryRuleSwitch14765);
            iv_ruleSwitch=ruleSwitch();

            state._fsp--;

             current =iv_ruleSwitch; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSwitch14775); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6841:1: ruleSwitch returns [EObject current=null] : (otherlv_0= 'switch' ( (lv_caseValue_1_0= ruleParameter ) ) otherlv_2= ',' otherlv_3= 'label' ( (lv_defaultCase_4_0= RULE_VALID_ID ) ) otherlv_5= '[' ( (lv_cases_6_0= ruleSwitchCase ) )* otherlv_7= ']' ) ;
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
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6844:28: ( (otherlv_0= 'switch' ( (lv_caseValue_1_0= ruleParameter ) ) otherlv_2= ',' otherlv_3= 'label' ( (lv_defaultCase_4_0= RULE_VALID_ID ) ) otherlv_5= '[' ( (lv_cases_6_0= ruleSwitchCase ) )* otherlv_7= ']' ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6845:1: (otherlv_0= 'switch' ( (lv_caseValue_1_0= ruleParameter ) ) otherlv_2= ',' otherlv_3= 'label' ( (lv_defaultCase_4_0= RULE_VALID_ID ) ) otherlv_5= '[' ( (lv_cases_6_0= ruleSwitchCase ) )* otherlv_7= ']' )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6845:1: (otherlv_0= 'switch' ( (lv_caseValue_1_0= ruleParameter ) ) otherlv_2= ',' otherlv_3= 'label' ( (lv_defaultCase_4_0= RULE_VALID_ID ) ) otherlv_5= '[' ( (lv_cases_6_0= ruleSwitchCase ) )* otherlv_7= ']' )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6845:3: otherlv_0= 'switch' ( (lv_caseValue_1_0= ruleParameter ) ) otherlv_2= ',' otherlv_3= 'label' ( (lv_defaultCase_4_0= RULE_VALID_ID ) ) otherlv_5= '[' ( (lv_cases_6_0= ruleSwitchCase ) )* otherlv_7= ']'
            {
            otherlv_0=(Token)match(input,71,FOLLOW_71_in_ruleSwitch14812); 

                	newLeafNode(otherlv_0, grammarAccess.getSwitchAccess().getSwitchKeyword_0());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6849:1: ( (lv_caseValue_1_0= ruleParameter ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6850:1: (lv_caseValue_1_0= ruleParameter )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6850:1: (lv_caseValue_1_0= ruleParameter )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6851:3: lv_caseValue_1_0= ruleParameter
            {
             
            	        newCompositeNode(grammarAccess.getSwitchAccess().getCaseValueParameterParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleParameter_in_ruleSwitch14833);
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

            otherlv_2=(Token)match(input,80,FOLLOW_80_in_ruleSwitch14845); 

                	newLeafNode(otherlv_2, grammarAccess.getSwitchAccess().getCommaKeyword_2());
                
            otherlv_3=(Token)match(input,151,FOLLOW_151_in_ruleSwitch14857); 

                	newLeafNode(otherlv_3, grammarAccess.getSwitchAccess().getLabelKeyword_3());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6875:1: ( (lv_defaultCase_4_0= RULE_VALID_ID ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6876:1: (lv_defaultCase_4_0= RULE_VALID_ID )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6876:1: (lv_defaultCase_4_0= RULE_VALID_ID )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6877:3: lv_defaultCase_4_0= RULE_VALID_ID
            {
            lv_defaultCase_4_0=(Token)match(input,RULE_VALID_ID,FOLLOW_RULE_VALID_ID_in_ruleSwitch14874); 

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

            otherlv_5=(Token)match(input,79,FOLLOW_79_in_ruleSwitch14891); 

                	newLeafNode(otherlv_5, grammarAccess.getSwitchAccess().getLeftSquareBracketKeyword_5());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6897:1: ( (lv_cases_6_0= ruleSwitchCase ) )*
            loop132:
            do {
                int alt132=2;
                int LA132_0 = input.LA(1);

                if ( (LA132_0==RULE_INT_TYPE||LA132_0==RULE_VALID_ID||(LA132_0>=RULE_PRIMITIVE_VALUE && LA132_0<=RULE_FLOATING_POINT_TYPE)||LA132_0==46||LA132_0==79||(LA132_0>=94 && LA132_0<=95)) ) {
                    alt132=1;
                }


                switch (alt132) {
            	case 1 :
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6898:1: (lv_cases_6_0= ruleSwitchCase )
            	    {
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6898:1: (lv_cases_6_0= ruleSwitchCase )
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6899:3: lv_cases_6_0= ruleSwitchCase
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSwitchAccess().getCasesSwitchCaseParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSwitchCase_in_ruleSwitch14912);
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
            	    break loop132;
                }
            } while (true);

            otherlv_7=(Token)match(input,81,FOLLOW_81_in_ruleSwitch14925); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6927:1: entryRuleSwitchCase returns [EObject current=null] : iv_ruleSwitchCase= ruleSwitchCase EOF ;
    public final EObject entryRuleSwitchCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSwitchCase = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6928:2: (iv_ruleSwitchCase= ruleSwitchCase EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6929:2: iv_ruleSwitchCase= ruleSwitchCase EOF
            {
             newCompositeNode(grammarAccess.getSwitchCaseRule()); 
            pushFollow(FOLLOW_ruleSwitchCase_in_entryRuleSwitchCase14961);
            iv_ruleSwitchCase=ruleSwitchCase();

            state._fsp--;

             current =iv_ruleSwitchCase; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSwitchCase14971); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6936:1: ruleSwitchCase returns [EObject current=null] : ( ( (lv_caseValue_0_0= ruleParameter ) ) otherlv_1= ',' otherlv_2= 'label' ( (lv_destination_3_0= RULE_VALID_ID ) ) ) ;
    public final EObject ruleSwitchCase() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_destination_3_0=null;
        EObject lv_caseValue_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6939:28: ( ( ( (lv_caseValue_0_0= ruleParameter ) ) otherlv_1= ',' otherlv_2= 'label' ( (lv_destination_3_0= RULE_VALID_ID ) ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6940:1: ( ( (lv_caseValue_0_0= ruleParameter ) ) otherlv_1= ',' otherlv_2= 'label' ( (lv_destination_3_0= RULE_VALID_ID ) ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6940:1: ( ( (lv_caseValue_0_0= ruleParameter ) ) otherlv_1= ',' otherlv_2= 'label' ( (lv_destination_3_0= RULE_VALID_ID ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6940:2: ( (lv_caseValue_0_0= ruleParameter ) ) otherlv_1= ',' otherlv_2= 'label' ( (lv_destination_3_0= RULE_VALID_ID ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6940:2: ( (lv_caseValue_0_0= ruleParameter ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6941:1: (lv_caseValue_0_0= ruleParameter )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6941:1: (lv_caseValue_0_0= ruleParameter )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6942:3: lv_caseValue_0_0= ruleParameter
            {
             
            	        newCompositeNode(grammarAccess.getSwitchCaseAccess().getCaseValueParameterParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleParameter_in_ruleSwitchCase15017);
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

            otherlv_1=(Token)match(input,80,FOLLOW_80_in_ruleSwitchCase15029); 

                	newLeafNode(otherlv_1, grammarAccess.getSwitchCaseAccess().getCommaKeyword_1());
                
            otherlv_2=(Token)match(input,151,FOLLOW_151_in_ruleSwitchCase15041); 

                	newLeafNode(otherlv_2, grammarAccess.getSwitchCaseAccess().getLabelKeyword_2());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6966:1: ( (lv_destination_3_0= RULE_VALID_ID ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6967:1: (lv_destination_3_0= RULE_VALID_ID )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6967:1: (lv_destination_3_0= RULE_VALID_ID )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6968:3: lv_destination_3_0= RULE_VALID_ID
            {
            lv_destination_3_0=(Token)match(input,RULE_VALID_ID,FOLLOW_RULE_VALID_ID_in_ruleSwitchCase15058); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6992:1: entryRuleInvoke returns [EObject current=null] : iv_ruleInvoke= ruleInvoke EOF ;
    public final EObject entryRuleInvoke() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInvoke = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6993:2: (iv_ruleInvoke= ruleInvoke EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6994:2: iv_ruleInvoke= ruleInvoke EOF
            {
             newCompositeNode(grammarAccess.getInvokeRule()); 
            pushFollow(FOLLOW_ruleInvoke_in_entryRuleInvoke15099);
            iv_ruleInvoke=ruleInvoke();

            state._fsp--;

             current =iv_ruleInvoke; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInvoke15109); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7001:1: ruleInvoke returns [EObject current=null] : (otherlv_0= 'invoke' ( ruleCALLING_CONV )? (this_RETURN_ATTRIBUTES_2= RULE_RETURN_ATTRIBUTES )? ( (lv_returnType_3_0= ruleTypeUse ) ) ( (lv_name_4_0= ruleAddress ) ) ( (lv_pList_5_0= ruleParameterList ) ) ( ruleFUNCTION_ATTRIBUTES )* otherlv_7= 'to' otherlv_8= 'label' ( (lv_targetLabel_9_0= RULE_VALID_ID ) ) otherlv_10= 'unwind' otherlv_11= 'label' ( (lv_unwindTargetLabel_12_0= RULE_VALID_ID ) ) ) ;
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
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7004:28: ( (otherlv_0= 'invoke' ( ruleCALLING_CONV )? (this_RETURN_ATTRIBUTES_2= RULE_RETURN_ATTRIBUTES )? ( (lv_returnType_3_0= ruleTypeUse ) ) ( (lv_name_4_0= ruleAddress ) ) ( (lv_pList_5_0= ruleParameterList ) ) ( ruleFUNCTION_ATTRIBUTES )* otherlv_7= 'to' otherlv_8= 'label' ( (lv_targetLabel_9_0= RULE_VALID_ID ) ) otherlv_10= 'unwind' otherlv_11= 'label' ( (lv_unwindTargetLabel_12_0= RULE_VALID_ID ) ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7005:1: (otherlv_0= 'invoke' ( ruleCALLING_CONV )? (this_RETURN_ATTRIBUTES_2= RULE_RETURN_ATTRIBUTES )? ( (lv_returnType_3_0= ruleTypeUse ) ) ( (lv_name_4_0= ruleAddress ) ) ( (lv_pList_5_0= ruleParameterList ) ) ( ruleFUNCTION_ATTRIBUTES )* otherlv_7= 'to' otherlv_8= 'label' ( (lv_targetLabel_9_0= RULE_VALID_ID ) ) otherlv_10= 'unwind' otherlv_11= 'label' ( (lv_unwindTargetLabel_12_0= RULE_VALID_ID ) ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7005:1: (otherlv_0= 'invoke' ( ruleCALLING_CONV )? (this_RETURN_ATTRIBUTES_2= RULE_RETURN_ATTRIBUTES )? ( (lv_returnType_3_0= ruleTypeUse ) ) ( (lv_name_4_0= ruleAddress ) ) ( (lv_pList_5_0= ruleParameterList ) ) ( ruleFUNCTION_ATTRIBUTES )* otherlv_7= 'to' otherlv_8= 'label' ( (lv_targetLabel_9_0= RULE_VALID_ID ) ) otherlv_10= 'unwind' otherlv_11= 'label' ( (lv_unwindTargetLabel_12_0= RULE_VALID_ID ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7005:3: otherlv_0= 'invoke' ( ruleCALLING_CONV )? (this_RETURN_ATTRIBUTES_2= RULE_RETURN_ATTRIBUTES )? ( (lv_returnType_3_0= ruleTypeUse ) ) ( (lv_name_4_0= ruleAddress ) ) ( (lv_pList_5_0= ruleParameterList ) ) ( ruleFUNCTION_ATTRIBUTES )* otherlv_7= 'to' otherlv_8= 'label' ( (lv_targetLabel_9_0= RULE_VALID_ID ) ) otherlv_10= 'unwind' otherlv_11= 'label' ( (lv_unwindTargetLabel_12_0= RULE_VALID_ID ) )
            {
            otherlv_0=(Token)match(input,69,FOLLOW_69_in_ruleInvoke15146); 

                	newLeafNode(otherlv_0, grammarAccess.getInvokeAccess().getInvokeKeyword_0());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7009:1: ( ruleCALLING_CONV )?
            int alt133=2;
            int LA133_0 = input.LA(1);

            if ( ((LA133_0>=31 && LA133_0<=45)) ) {
                alt133=1;
            }
            switch (alt133) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7010:5: ruleCALLING_CONV
                    {
                     
                            newCompositeNode(grammarAccess.getInvokeAccess().getCALLING_CONVParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleCALLING_CONV_in_ruleInvoke15163);
                    ruleCALLING_CONV();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7017:3: (this_RETURN_ATTRIBUTES_2= RULE_RETURN_ATTRIBUTES )?
            int alt134=2;
            int LA134_0 = input.LA(1);

            if ( (LA134_0==RULE_RETURN_ATTRIBUTES) ) {
                alt134=1;
            }
            switch (alt134) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7017:4: this_RETURN_ATTRIBUTES_2= RULE_RETURN_ATTRIBUTES
                    {
                    this_RETURN_ATTRIBUTES_2=(Token)match(input,RULE_RETURN_ATTRIBUTES,FOLLOW_RULE_RETURN_ATTRIBUTES_in_ruleInvoke15176); 
                     
                        newLeafNode(this_RETURN_ATTRIBUTES_2, grammarAccess.getInvokeAccess().getRETURN_ATTRIBUTESTerminalRuleCall_2()); 
                        

                    }
                    break;

            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7021:3: ( (lv_returnType_3_0= ruleTypeUse ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7022:1: (lv_returnType_3_0= ruleTypeUse )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7022:1: (lv_returnType_3_0= ruleTypeUse )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7023:3: lv_returnType_3_0= ruleTypeUse
            {
             
            	        newCompositeNode(grammarAccess.getInvokeAccess().getReturnTypeTypeUseParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeUse_in_ruleInvoke15198);
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

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7039:2: ( (lv_name_4_0= ruleAddress ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7040:1: (lv_name_4_0= ruleAddress )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7040:1: (lv_name_4_0= ruleAddress )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7041:3: lv_name_4_0= ruleAddress
            {
             
            	        newCompositeNode(grammarAccess.getInvokeAccess().getNameAddressParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleAddress_in_ruleInvoke15219);
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

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7057:2: ( (lv_pList_5_0= ruleParameterList ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7058:1: (lv_pList_5_0= ruleParameterList )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7058:1: (lv_pList_5_0= ruleParameterList )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7059:3: lv_pList_5_0= ruleParameterList
            {
             
            	        newCompositeNode(grammarAccess.getInvokeAccess().getPListParameterListParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleParameterList_in_ruleInvoke15240);
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

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7075:2: ( ruleFUNCTION_ATTRIBUTES )*
            loop135:
            do {
                int alt135=2;
                int LA135_0 = input.LA(1);

                if ( ((LA135_0>=48 && LA135_0<=49)||(LA135_0>=52 && LA135_0<=67)) ) {
                    alt135=1;
                }


                switch (alt135) {
            	case 1 :
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7076:5: ruleFUNCTION_ATTRIBUTES
            	    {
            	     
            	            newCompositeNode(grammarAccess.getInvokeAccess().getFUNCTION_ATTRIBUTESParserRuleCall_6()); 
            	        
            	    pushFollow(FOLLOW_ruleFUNCTION_ATTRIBUTES_in_ruleInvoke15257);
            	    ruleFUNCTION_ATTRIBUTES();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop135;
                }
            } while (true);

            otherlv_7=(Token)match(input,118,FOLLOW_118_in_ruleInvoke15270); 

                	newLeafNode(otherlv_7, grammarAccess.getInvokeAccess().getToKeyword_7());
                
            otherlv_8=(Token)match(input,151,FOLLOW_151_in_ruleInvoke15282); 

                	newLeafNode(otherlv_8, grammarAccess.getInvokeAccess().getLabelKeyword_8());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7091:1: ( (lv_targetLabel_9_0= RULE_VALID_ID ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7092:1: (lv_targetLabel_9_0= RULE_VALID_ID )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7092:1: (lv_targetLabel_9_0= RULE_VALID_ID )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7093:3: lv_targetLabel_9_0= RULE_VALID_ID
            {
            lv_targetLabel_9_0=(Token)match(input,RULE_VALID_ID,FOLLOW_RULE_VALID_ID_in_ruleInvoke15299); 

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

            otherlv_10=(Token)match(input,152,FOLLOW_152_in_ruleInvoke15316); 

                	newLeafNode(otherlv_10, grammarAccess.getInvokeAccess().getUnwindKeyword_10());
                
            otherlv_11=(Token)match(input,151,FOLLOW_151_in_ruleInvoke15328); 

                	newLeafNode(otherlv_11, grammarAccess.getInvokeAccess().getLabelKeyword_11());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7117:1: ( (lv_unwindTargetLabel_12_0= RULE_VALID_ID ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7118:1: (lv_unwindTargetLabel_12_0= RULE_VALID_ID )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7118:1: (lv_unwindTargetLabel_12_0= RULE_VALID_ID )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7119:3: lv_unwindTargetLabel_12_0= RULE_VALID_ID
            {
            lv_unwindTargetLabel_12_0=(Token)match(input,RULE_VALID_ID,FOLLOW_RULE_VALID_ID_in_ruleInvoke15345); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7143:1: entryRuleResume returns [EObject current=null] : iv_ruleResume= ruleResume EOF ;
    public final EObject entryRuleResume() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResume = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7144:2: (iv_ruleResume= ruleResume EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7145:2: iv_ruleResume= ruleResume EOF
            {
             newCompositeNode(grammarAccess.getResumeRule()); 
            pushFollow(FOLLOW_ruleResume_in_entryRuleResume15386);
            iv_ruleResume=ruleResume();

            state._fsp--;

             current =iv_ruleResume; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleResume15396); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7152:1: ruleResume returns [EObject current=null] : (otherlv_0= 'resume' ( (lv_type_1_0= ruleStructure ) ) ( (lv_value_2_0= ruleValue ) ) ) ;
    public final EObject ruleResume() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_type_1_0 = null;

        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7155:28: ( (otherlv_0= 'resume' ( (lv_type_1_0= ruleStructure ) ) ( (lv_value_2_0= ruleValue ) ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7156:1: (otherlv_0= 'resume' ( (lv_type_1_0= ruleStructure ) ) ( (lv_value_2_0= ruleValue ) ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7156:1: (otherlv_0= 'resume' ( (lv_type_1_0= ruleStructure ) ) ( (lv_value_2_0= ruleValue ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7156:3: otherlv_0= 'resume' ( (lv_type_1_0= ruleStructure ) ) ( (lv_value_2_0= ruleValue ) )
            {
            otherlv_0=(Token)match(input,70,FOLLOW_70_in_ruleResume15433); 

                	newLeafNode(otherlv_0, grammarAccess.getResumeAccess().getResumeKeyword_0());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7160:1: ( (lv_type_1_0= ruleStructure ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7161:1: (lv_type_1_0= ruleStructure )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7161:1: (lv_type_1_0= ruleStructure )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7162:3: lv_type_1_0= ruleStructure
            {
             
            	        newCompositeNode(grammarAccess.getResumeAccess().getTypeStructureParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleStructure_in_ruleResume15454);
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

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7178:2: ( (lv_value_2_0= ruleValue ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7179:1: (lv_value_2_0= ruleValue )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7179:1: (lv_value_2_0= ruleValue )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7180:3: lv_value_2_0= ruleValue
            {
             
            	        newCompositeNode(grammarAccess.getResumeAccess().getValueValueParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleValue_in_ruleResume15475);
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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7204:1: entryRuleUnreachable returns [EObject current=null] : iv_ruleUnreachable= ruleUnreachable EOF ;
    public final EObject entryRuleUnreachable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnreachable = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7205:2: (iv_ruleUnreachable= ruleUnreachable EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7206:2: iv_ruleUnreachable= ruleUnreachable EOF
            {
             newCompositeNode(grammarAccess.getUnreachableRule()); 
            pushFollow(FOLLOW_ruleUnreachable_in_entryRuleUnreachable15511);
            iv_ruleUnreachable=ruleUnreachable();

            state._fsp--;

             current =iv_ruleUnreachable; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnreachable15521); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7213:1: ruleUnreachable returns [EObject current=null] : ( () otherlv_1= 'unreachable' ) ;
    public final EObject ruleUnreachable() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7216:28: ( ( () otherlv_1= 'unreachable' ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7217:1: ( () otherlv_1= 'unreachable' )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7217:1: ( () otherlv_1= 'unreachable' )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7217:2: () otherlv_1= 'unreachable'
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7217:2: ()
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7218:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getUnreachableAccess().getUnreachableAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,153,FOLLOW_153_in_ruleUnreachable15567); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7235:1: entryRuleReturn returns [EObject current=null] : iv_ruleReturn= ruleReturn EOF ;
    public final EObject entryRuleReturn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReturn = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7236:2: (iv_ruleReturn= ruleReturn EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7237:2: iv_ruleReturn= ruleReturn EOF
            {
             newCompositeNode(grammarAccess.getReturnRule()); 
            pushFollow(FOLLOW_ruleReturn_in_entryRuleReturn15603);
            iv_ruleReturn=ruleReturn();

            state._fsp--;

             current =iv_ruleReturn; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReturn15613); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7244:1: ruleReturn returns [EObject current=null] : (otherlv_0= 'ret' ( (lv_value_1_0= ruleParameter ) ) (otherlv_2= ',' otherlv_3= '!dbg' otherlv_4= '!' ruleNUMBER )? ) ;
    public final EObject ruleReturn() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7247:28: ( (otherlv_0= 'ret' ( (lv_value_1_0= ruleParameter ) ) (otherlv_2= ',' otherlv_3= '!dbg' otherlv_4= '!' ruleNUMBER )? ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7248:1: (otherlv_0= 'ret' ( (lv_value_1_0= ruleParameter ) ) (otherlv_2= ',' otherlv_3= '!dbg' otherlv_4= '!' ruleNUMBER )? )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7248:1: (otherlv_0= 'ret' ( (lv_value_1_0= ruleParameter ) ) (otherlv_2= ',' otherlv_3= '!dbg' otherlv_4= '!' ruleNUMBER )? )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7248:3: otherlv_0= 'ret' ( (lv_value_1_0= ruleParameter ) ) (otherlv_2= ',' otherlv_3= '!dbg' otherlv_4= '!' ruleNUMBER )?
            {
            otherlv_0=(Token)match(input,154,FOLLOW_154_in_ruleReturn15650); 

                	newLeafNode(otherlv_0, grammarAccess.getReturnAccess().getRetKeyword_0());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7252:1: ( (lv_value_1_0= ruleParameter ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7253:1: (lv_value_1_0= ruleParameter )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7253:1: (lv_value_1_0= ruleParameter )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7254:3: lv_value_1_0= ruleParameter
            {
             
            	        newCompositeNode(grammarAccess.getReturnAccess().getValueParameterParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleParameter_in_ruleReturn15671);
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

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7270:2: (otherlv_2= ',' otherlv_3= '!dbg' otherlv_4= '!' ruleNUMBER )?
            int alt136=2;
            int LA136_0 = input.LA(1);

            if ( (LA136_0==80) ) {
                alt136=1;
            }
            switch (alt136) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7270:4: otherlv_2= ',' otherlv_3= '!dbg' otherlv_4= '!' ruleNUMBER
                    {
                    otherlv_2=(Token)match(input,80,FOLLOW_80_in_ruleReturn15684); 

                        	newLeafNode(otherlv_2, grammarAccess.getReturnAccess().getCommaKeyword_2_0());
                        
                    otherlv_3=(Token)match(input,155,FOLLOW_155_in_ruleReturn15696); 

                        	newLeafNode(otherlv_3, grammarAccess.getReturnAccess().getDbgKeyword_2_1());
                        
                    otherlv_4=(Token)match(input,120,FOLLOW_120_in_ruleReturn15708); 

                        	newLeafNode(otherlv_4, grammarAccess.getReturnAccess().getExclamationMarkKeyword_2_2());
                        
                     
                            newCompositeNode(grammarAccess.getReturnAccess().getNUMBERParserRuleCall_2_3()); 
                        
                    pushFollow(FOLLOW_ruleNUMBER_in_ruleReturn15724);
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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7298:1: entryRuleBranch returns [EObject current=null] : iv_ruleBranch= ruleBranch EOF ;
    public final EObject entryRuleBranch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBranch = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7299:2: (iv_ruleBranch= ruleBranch EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7300:2: iv_ruleBranch= ruleBranch EOF
            {
             newCompositeNode(grammarAccess.getBranchRule()); 
            pushFollow(FOLLOW_ruleBranch_in_entryRuleBranch15761);
            iv_ruleBranch=ruleBranch();

            state._fsp--;

             current =iv_ruleBranch; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBranch15771); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7307:1: ruleBranch returns [EObject current=null] : ( (otherlv_0= 'br' otherlv_1= 'label' ( (lv_destination_2_0= RULE_VALID_ID ) ) ) | (otherlv_3= 'br' this_INT_TYPE_4= RULE_INT_TYPE ( (lv_condition_5_0= ruleValue ) ) otherlv_6= ',' otherlv_7= 'label' ( (lv_destination_8_0= RULE_VALID_ID ) ) otherlv_9= ',' otherlv_10= 'label' ( (lv_elseDestination_11_0= RULE_VALID_ID ) ) ) ) ;
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
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7310:28: ( ( (otherlv_0= 'br' otherlv_1= 'label' ( (lv_destination_2_0= RULE_VALID_ID ) ) ) | (otherlv_3= 'br' this_INT_TYPE_4= RULE_INT_TYPE ( (lv_condition_5_0= ruleValue ) ) otherlv_6= ',' otherlv_7= 'label' ( (lv_destination_8_0= RULE_VALID_ID ) ) otherlv_9= ',' otherlv_10= 'label' ( (lv_elseDestination_11_0= RULE_VALID_ID ) ) ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7311:1: ( (otherlv_0= 'br' otherlv_1= 'label' ( (lv_destination_2_0= RULE_VALID_ID ) ) ) | (otherlv_3= 'br' this_INT_TYPE_4= RULE_INT_TYPE ( (lv_condition_5_0= ruleValue ) ) otherlv_6= ',' otherlv_7= 'label' ( (lv_destination_8_0= RULE_VALID_ID ) ) otherlv_9= ',' otherlv_10= 'label' ( (lv_elseDestination_11_0= RULE_VALID_ID ) ) ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7311:1: ( (otherlv_0= 'br' otherlv_1= 'label' ( (lv_destination_2_0= RULE_VALID_ID ) ) ) | (otherlv_3= 'br' this_INT_TYPE_4= RULE_INT_TYPE ( (lv_condition_5_0= ruleValue ) ) otherlv_6= ',' otherlv_7= 'label' ( (lv_destination_8_0= RULE_VALID_ID ) ) otherlv_9= ',' otherlv_10= 'label' ( (lv_elseDestination_11_0= RULE_VALID_ID ) ) ) )
            int alt137=2;
            int LA137_0 = input.LA(1);

            if ( (LA137_0==156) ) {
                int LA137_1 = input.LA(2);

                if ( (LA137_1==151) ) {
                    alt137=1;
                }
                else if ( (LA137_1==RULE_INT_TYPE) ) {
                    alt137=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 137, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 137, 0, input);

                throw nvae;
            }
            switch (alt137) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7311:2: (otherlv_0= 'br' otherlv_1= 'label' ( (lv_destination_2_0= RULE_VALID_ID ) ) )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7311:2: (otherlv_0= 'br' otherlv_1= 'label' ( (lv_destination_2_0= RULE_VALID_ID ) ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7311:4: otherlv_0= 'br' otherlv_1= 'label' ( (lv_destination_2_0= RULE_VALID_ID ) )
                    {
                    otherlv_0=(Token)match(input,156,FOLLOW_156_in_ruleBranch15809); 

                        	newLeafNode(otherlv_0, grammarAccess.getBranchAccess().getBrKeyword_0_0());
                        
                    otherlv_1=(Token)match(input,151,FOLLOW_151_in_ruleBranch15821); 

                        	newLeafNode(otherlv_1, grammarAccess.getBranchAccess().getLabelKeyword_0_1());
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7319:1: ( (lv_destination_2_0= RULE_VALID_ID ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7320:1: (lv_destination_2_0= RULE_VALID_ID )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7320:1: (lv_destination_2_0= RULE_VALID_ID )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7321:3: lv_destination_2_0= RULE_VALID_ID
                    {
                    lv_destination_2_0=(Token)match(input,RULE_VALID_ID,FOLLOW_RULE_VALID_ID_in_ruleBranch15838); 

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
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7338:6: (otherlv_3= 'br' this_INT_TYPE_4= RULE_INT_TYPE ( (lv_condition_5_0= ruleValue ) ) otherlv_6= ',' otherlv_7= 'label' ( (lv_destination_8_0= RULE_VALID_ID ) ) otherlv_9= ',' otherlv_10= 'label' ( (lv_elseDestination_11_0= RULE_VALID_ID ) ) )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7338:6: (otherlv_3= 'br' this_INT_TYPE_4= RULE_INT_TYPE ( (lv_condition_5_0= ruleValue ) ) otherlv_6= ',' otherlv_7= 'label' ( (lv_destination_8_0= RULE_VALID_ID ) ) otherlv_9= ',' otherlv_10= 'label' ( (lv_elseDestination_11_0= RULE_VALID_ID ) ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7338:8: otherlv_3= 'br' this_INT_TYPE_4= RULE_INT_TYPE ( (lv_condition_5_0= ruleValue ) ) otherlv_6= ',' otherlv_7= 'label' ( (lv_destination_8_0= RULE_VALID_ID ) ) otherlv_9= ',' otherlv_10= 'label' ( (lv_elseDestination_11_0= RULE_VALID_ID ) )
                    {
                    otherlv_3=(Token)match(input,156,FOLLOW_156_in_ruleBranch15863); 

                        	newLeafNode(otherlv_3, grammarAccess.getBranchAccess().getBrKeyword_1_0());
                        
                    this_INT_TYPE_4=(Token)match(input,RULE_INT_TYPE,FOLLOW_RULE_INT_TYPE_in_ruleBranch15874); 
                     
                        newLeafNode(this_INT_TYPE_4, grammarAccess.getBranchAccess().getINT_TYPETerminalRuleCall_1_1()); 
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7346:1: ( (lv_condition_5_0= ruleValue ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7347:1: (lv_condition_5_0= ruleValue )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7347:1: (lv_condition_5_0= ruleValue )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7348:3: lv_condition_5_0= ruleValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getBranchAccess().getConditionValueParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleValue_in_ruleBranch15894);
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

                    otherlv_6=(Token)match(input,80,FOLLOW_80_in_ruleBranch15906); 

                        	newLeafNode(otherlv_6, grammarAccess.getBranchAccess().getCommaKeyword_1_3());
                        
                    otherlv_7=(Token)match(input,151,FOLLOW_151_in_ruleBranch15918); 

                        	newLeafNode(otherlv_7, grammarAccess.getBranchAccess().getLabelKeyword_1_4());
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7372:1: ( (lv_destination_8_0= RULE_VALID_ID ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7373:1: (lv_destination_8_0= RULE_VALID_ID )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7373:1: (lv_destination_8_0= RULE_VALID_ID )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7374:3: lv_destination_8_0= RULE_VALID_ID
                    {
                    lv_destination_8_0=(Token)match(input,RULE_VALID_ID,FOLLOW_RULE_VALID_ID_in_ruleBranch15935); 

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

                    otherlv_9=(Token)match(input,80,FOLLOW_80_in_ruleBranch15952); 

                        	newLeafNode(otherlv_9, grammarAccess.getBranchAccess().getCommaKeyword_1_6());
                        
                    otherlv_10=(Token)match(input,151,FOLLOW_151_in_ruleBranch15964); 

                        	newLeafNode(otherlv_10, grammarAccess.getBranchAccess().getLabelKeyword_1_7());
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7398:1: ( (lv_elseDestination_11_0= RULE_VALID_ID ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7399:1: (lv_elseDestination_11_0= RULE_VALID_ID )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7399:1: (lv_elseDestination_11_0= RULE_VALID_ID )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7400:3: lv_elseDestination_11_0= RULE_VALID_ID
                    {
                    lv_elseDestination_11_0=(Token)match(input,RULE_VALID_ID,FOLLOW_RULE_VALID_ID_in_ruleBranch15981); 

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


    protected DFA64 dfa64 = new DFA64(this);
    protected DFA73 dfa73 = new DFA73(this);
    static final String DFA64_eotS =
        "\7\uffff";
    static final String DFA64_eofS =
        "\2\2\3\uffff\2\4";
    static final String DFA64_minS =
        "\2\4\1\uffff\1\36\1\uffff\2\5";
    static final String DFA64_maxS =
        "\2\u009c\1\uffff\1\141\1\uffff\2\u009c";
    static final String DFA64_acceptS =
        "\2\uffff\1\2\1\uffff\1\1\2\uffff";
    static final String DFA64_specialS =
        "\7\uffff}>";
    static final String[] DFA64_transitionS = {
            "\4\2\1\1\11\2\1\uffff\1\2\1\uffff\1\2\1\uffff\2\2\4\uffff\1"+
            "\2\24\uffff\2\2\20\uffff\5\2\1\uffff\1\2\3\uffff\1\2\1\uffff"+
            "\1\2\7\uffff\2\2\1\uffff\1\2\3\uffff\2\2\31\uffff\1\2\1\uffff"+
            "\2\2\1\uffff\1\2\3\uffff\3\2\20\uffff\1\2\2\uffff\2\2\1\uffff"+
            "\1\2",
            "\1\4\3\2\1\1\1\3\5\2\1\6\1\2\1\4\1\uffff\1\5\1\uffff\1\4\1"+
            "\uffff\1\4\1\2\4\uffff\1\4\1\2\23\uffff\2\2\20\uffff\5\2\1\uffff"+
            "\1\2\3\uffff\1\2\1\uffff\1\2\7\uffff\2\2\1\uffff\1\2\3\uffff"+
            "\1\4\2\2\30\uffff\1\4\1\uffff\2\2\1\uffff\1\2\3\uffff\3\2\20"+
            "\uffff\1\2\2\uffff\2\2\1\uffff\1\2",
            "",
            "\1\2\23\uffff\1\4\56\uffff\1\2",
            "",
            "\14\4\2\uffff\2\4\3\uffff\1\4\31\uffff\2\4\20\uffff\5\4\1"+
            "\uffff\1\4\2\uffff\1\2\1\4\1\uffff\1\4\7\uffff\2\4\1\uffff\1"+
            "\4\4\uffff\1\4\33\uffff\2\4\1\uffff\1\4\3\uffff\3\4\20\uffff"+
            "\1\4\2\uffff\2\4\1\uffff\1\4",
            "\14\4\2\uffff\1\4\4\uffff\1\4\5\uffff\1\2\23\uffff\2\4\20"+
            "\uffff\5\4\1\uffff\1\4\3\uffff\1\4\1\uffff\1\4\7\uffff\2\4\1"+
            "\uffff\1\4\4\uffff\1\4\1\2\32\uffff\2\4\1\uffff\1\4\3\uffff"+
            "\3\4\20\uffff\1\4\2\uffff\2\4\1\uffff\1\4"
    };

    static final short[] DFA64_eot = DFA.unpackEncodedString(DFA64_eotS);
    static final short[] DFA64_eof = DFA.unpackEncodedString(DFA64_eofS);
    static final char[] DFA64_min = DFA.unpackEncodedStringToUnsignedChars(DFA64_minS);
    static final char[] DFA64_max = DFA.unpackEncodedStringToUnsignedChars(DFA64_maxS);
    static final short[] DFA64_accept = DFA.unpackEncodedString(DFA64_acceptS);
    static final short[] DFA64_special = DFA.unpackEncodedString(DFA64_specialS);
    static final short[][] DFA64_transition;

    static {
        int numStates = DFA64_transitionS.length;
        DFA64_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA64_transition[i] = DFA.unpackEncodedString(DFA64_transitionS[i]);
        }
    }

    class DFA64 extends DFA {

        public DFA64(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 64;
            this.eot = DFA64_eot;
            this.eof = DFA64_eof;
            this.min = DFA64_min;
            this.max = DFA64_max;
            this.accept = DFA64_accept;
            this.special = DFA64_special;
            this.transition = DFA64_transition;
        }
        public String getDescription() {
            return "2502:2: ( ( (this_RETURN_ATTRIBUTES_1= RULE_RETURN_ATTRIBUTES )+ ( (lv_value_2_0= ruleValue ) ) ) | ( ( (lv_value_3_0= ruleValue ) )? (this_RETURN_ATTRIBUTES_4= RULE_RETURN_ATTRIBUTES )* ) )";
        }
    }
    static final String DFA73_eotS =
        "\37\uffff";
    static final String DFA73_eofS =
        "\37\uffff";
    static final String DFA73_minS =
        "\1\23\1\uffff\1\115\11\uffff\1\11\22\uffff";
    static final String DFA73_maxS =
        "\1\u009c\1\uffff\1\115\11\uffff\1\u0095\22\uffff";
    static final String DFA73_acceptS =
        "\1\uffff\1\1\1\uffff\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\32"+
        "\1\uffff\1\22\1\31\1\27\1\30\1\25\1\26\1\2\1\34\1\17\1\20\1\6\1"+
        "\21\1\33\1\24\1\4\1\23\1\5\1\3";
    static final String DFA73_specialS =
        "\37\uffff}>";
    static final String[] DFA73_transitionS = {
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
            "\1\15\130\uffff\14\26\2\uffff\6\25\4\uffff\1\36\3\uffff\1"+
            "\35\1\23\1\27\1\23\2\uffff\2\13\1\uffff\1\33\1\20\1\24\3\uffff"+
            "\1\16\1\31\1\17\1\22\1\21\1\32\1\34\2\30",
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

    static final short[] DFA73_eot = DFA.unpackEncodedString(DFA73_eotS);
    static final short[] DFA73_eof = DFA.unpackEncodedString(DFA73_eofS);
    static final char[] DFA73_min = DFA.unpackEncodedStringToUnsignedChars(DFA73_minS);
    static final char[] DFA73_max = DFA.unpackEncodedStringToUnsignedChars(DFA73_maxS);
    static final short[] DFA73_accept = DFA.unpackEncodedString(DFA73_acceptS);
    static final short[] DFA73_special = DFA.unpackEncodedString(DFA73_specialS);
    static final short[][] DFA73_transition;

    static {
        int numStates = DFA73_transitionS.length;
        DFA73_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA73_transition[i] = DFA.unpackEncodedString(DFA73_transitionS[i]);
        }
    }

    class DFA73 extends DFA {

        public DFA73(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 73;
            this.eot = DFA73_eot;
            this.eof = DFA73_eof;
            this.min = DFA73_min;
            this.max = DFA73_max;
            this.accept = DFA73_accept;
            this.special = DFA73_special;
            this.transition = DFA73_transition;
        }
        public String getDescription() {
            return "2841:1: (this_Store_0= ruleStore | this_Load_1= ruleLoad | this_GetElementPtr_2= ruleGetElementPtr | this_Alloc_3= ruleAlloc | this_CmpXchg_4= ruleCmpXchg | this_AtomicRMW_5= ruleAtomicRMW | this_Fence_6= ruleFence | this_Return_7= ruleReturn | this_Branch_8= ruleBranch | this_Switch_9= ruleSwitch | this_IndirectBranch_10= ruleIndirectBranch | this_Invoke_11= ruleInvoke | this_Resume_12= ruleResume | this_Unreachable_13= ruleUnreachable | this_LogicOperation_14= ruleLogicOperation | this_ArithmeticOperation_15= ruleArithmeticOperation | this_Compare_16= ruleCompare | this_Cast_17= ruleCast | this_ShuffleVector_18= ruleShuffleVector | this_InsertElement_19= ruleInsertElement | this_ExtractElement_20= ruleExtractElement | this_InsertValue_21= ruleInsertValue | this_ExtractValue_22= ruleExtractValue | this_Phi_23= rulePhi | this_Select_24= ruleSelect | this_Call_25= ruleCall | this_VariableAttributeAccess_26= ruleVariableAttributeAccess | this_LandingPad_27= ruleLandingPad )";
        }
    }
 

    public static final BitSet FOLLOW_ruleLLVM_in_entryRuleLLVM75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLLVM85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_ruleLLVM130 = new BitSet(new long[]{0x0000000001080002L,0x0000000009004500L});
    public static final BitSet FOLLOW_ruleNUMBER_in_entryRuleNUMBER167 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNUMBER178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleNUMBER217 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNUMBER234 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30_in_ruleNUMBER253 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNUMBER268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCALLING_CONV_in_entryRuleCALLING_CONV316 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCALLING_CONV327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleCALLING_CONV365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleCALLING_CONV384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleCALLING_CONV403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleCALLING_CONV422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleCALLING_CONV441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleCALLING_CONV460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleCALLING_CONV479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleCALLING_CONV498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleCALLING_CONV517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleCALLING_CONV536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleCALLING_CONV555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleCALLING_CONV574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleCALLING_CONV593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleCALLING_CONV612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleCALLING_CONV632 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleCALLING_CONV645 = new BitSet(new long[]{0x0000000020000010L});
    public static final BitSet FOLLOW_ruleNUMBER_in_ruleCALLING_CONV667 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleCALLING_CONV685 = new BitSet(new long[]{0x0000000020000010L});
    public static final BitSet FOLLOW_ruleNUMBER_in_ruleCALLING_CONV707 = new BitSet(new long[]{0x0000000000000002L});
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
    public static final BitSet FOLLOW_82_in_ruleTypeDefinition2735 = new BitSet(new long[]{0x0000000000000000L,0x0000000080080000L});
    public static final BitSet FOLLOW_ruleStructure_in_ruleTypeDefinition2757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_ruleTypeDefinition2775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGlobalDefinition_in_entryRuleGlobalDefinition2813 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGlobalDefinition2823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddress_in_ruleGlobalDefinition2869 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_ruleGlobalDefinition2881 = new BitSet(new long[]{0x0000400000683020L,0x00000000C0708000L});
    public static final BitSet FOLLOW_RULE_LINKAGE_in_ruleGlobalDefinition2893 = new BitSet(new long[]{0x0000400000683020L,0x00000000C0708000L});
    public static final BitSet FOLLOW_RULE_ALIAS_LINKAGE_in_ruleGlobalDefinition2909 = new BitSet(new long[]{0x0000400000683020L,0x00000000C0708000L});
    public static final BitSet FOLLOW_84_in_ruleGlobalDefinition2926 = new BitSet(new long[]{0x0000400000683020L,0x00000000C0708000L});
    public static final BitSet FOLLOW_85_in_ruleGlobalDefinition2944 = new BitSet(new long[]{0x0000400000683020L,0x00000000C0708000L});
    public static final BitSet FOLLOW_86_in_ruleGlobalDefinition2962 = new BitSet(new long[]{0x0000400000683020L,0x00000000C0708000L});
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
    public static final BitSet FOLLOW_ruleCALLING_CONV_in_ruleFunctionDefinition3176 = new BitSet(new long[]{0x0000000000682100L});
    public static final BitSet FOLLOW_RULE_RETURN_ATTRIBUTES_in_ruleFunctionDefinition3189 = new BitSet(new long[]{0x0000000000682000L});
    public static final BitSet FOLLOW_ruleTypeUse_in_ruleFunctionDefinition3211 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ruleAddress_in_ruleFunctionDefinition3232 = new BitSet(new long[]{0x0004000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_ruleFunctionDefinition3245 = new BitSet(new long[]{0xFFF3000001080000L,0x000000008DA0450FL});
    public static final BitSet FOLLOW_50_in_ruleFunctionDefinition3264 = new BitSet(new long[]{0x0008000000682000L});
    public static final BitSet FOLLOW_ruleFunctionParameterList_in_ruleFunctionDefinition3285 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_ruleFunctionDefinition3298 = new BitSet(new long[]{0xFFF3000001080000L,0x000000008DA0450FL});
    public static final BitSet FOLLOW_85_in_ruleFunctionDefinition3313 = new BitSet(new long[]{0xFFF3000001080000L,0x000000008DA0450FL});
    public static final BitSet FOLLOW_ruleFUNCTION_ATTRIBUTES_in_ruleFunctionDefinition3332 = new BitSet(new long[]{0xFFF3000001080000L,0x000000008DA0450FL});
    public static final BitSet FOLLOW_90_in_ruleFunctionDefinition3346 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionDefinition3357 = new BitSet(new long[]{0xFFF3000001080000L,0x000000008DA0450FL});
    public static final BitSet FOLLOW_87_in_ruleFunctionDefinition3371 = new BitSet(new long[]{0x0000000020000010L});
    public static final BitSet FOLLOW_ruleNUMBER_in_ruleFunctionDefinition3392 = new BitSet(new long[]{0xFFF3000001080000L,0x000000008DA0450FL});
    public static final BitSet FOLLOW_ruleFunctionBody_in_ruleFunctionDefinition3415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_ruleFunctionDefinition3435 = new BitSet(new long[]{0x00003FFF80683920L});
    public static final BitSet FOLLOW_RULE_LINKAGE_in_ruleFunctionDefinition3447 = new BitSet(new long[]{0x00003FFF80682900L});
    public static final BitSet FOLLOW_RULE_ALIAS_LINKAGE_in_ruleFunctionDefinition3463 = new BitSet(new long[]{0x00003FFF80682900L});
    public static final BitSet FOLLOW_RULE_VISIBILITY_in_ruleFunctionDefinition3476 = new BitSet(new long[]{0x00003FFF80682100L});
    public static final BitSet FOLLOW_ruleCALLING_CONV_in_ruleFunctionDefinition3494 = new BitSet(new long[]{0x0000000000682100L});
    public static final BitSet FOLLOW_RULE_RETURN_ATTRIBUTES_in_ruleFunctionDefinition3507 = new BitSet(new long[]{0x0000000000682000L});
    public static final BitSet FOLLOW_ruleTypeUse_in_ruleFunctionDefinition3529 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ruleAddress_in_ruleFunctionDefinition3550 = new BitSet(new long[]{0x0004000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_ruleFunctionDefinition3563 = new BitSet(new long[]{0xFFF3000000000002L,0x0000000004A0000FL});
    public static final BitSet FOLLOW_50_in_ruleFunctionDefinition3582 = new BitSet(new long[]{0x0008000000682000L});
    public static final BitSet FOLLOW_ruleFunctionParameterList_in_ruleFunctionDefinition3603 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_ruleFunctionDefinition3616 = new BitSet(new long[]{0xFFF3000000000002L,0x0000000004A0000FL});
    public static final BitSet FOLLOW_85_in_ruleFunctionDefinition3631 = new BitSet(new long[]{0xFFF3000000000002L,0x000000000480000FL});
    public static final BitSet FOLLOW_ruleFUNCTION_ATTRIBUTES_in_ruleFunctionDefinition3650 = new BitSet(new long[]{0xFFF3000000000002L,0x000000000480000FL});
    public static final BitSet FOLLOW_90_in_ruleFunctionDefinition3664 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionDefinition3675 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
    public static final BitSet FOLLOW_87_in_ruleFunctionDefinition3689 = new BitSet(new long[]{0x0000000020000010L});
    public static final BitSet FOLLOW_ruleNUMBER_in_ruleFunctionDefinition3710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAliasDefinition_in_entryRuleAliasDefinition3749 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAliasDefinition3759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddress_in_ruleAliasDefinition3805 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_ruleAliasDefinition3817 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_92_in_ruleAliasDefinition3829 = new BitSet(new long[]{0x0000000000682820L});
    public static final BitSet FOLLOW_RULE_ALIAS_LINKAGE_in_ruleAliasDefinition3841 = new BitSet(new long[]{0x0000000000682800L});
    public static final BitSet FOLLOW_RULE_VISIBILITY_in_ruleAliasDefinition3854 = new BitSet(new long[]{0x0000000000682000L});
    public static final BitSet FOLLOW_ruleTypeUse_in_ruleAliasDefinition3876 = new BitSet(new long[]{0x0000000020EAA210L,0x0400000080000000L});
    public static final BitSet FOLLOW_ruleValue_in_ruleAliasDefinition3897 = new BitSet(new long[]{0x0000000000682000L});
    public static final BitSet FOLLOW_ruleTypeUse_in_ruleAliasDefinition3918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeUse_in_entryRuleTypeUse3954 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeUse3964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredefined_in_ruleTypeUse4012 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_ruleAddressUse_in_ruleTypeUse4039 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_RULE_UNKNOWN_TYPE_in_ruleTypeUse4056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddressUse_in_entryRuleAddressUse4098 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAddressUse4108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VALID_ID_in_ruleAddressUse4153 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_RULE_POINTER_in_ruleAddressUse4170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddress_in_entryRuleAddress4212 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAddress4222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VALID_ID_in_ruleAddress4263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredefined_in_entryRulePredefined4303 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePredefined4313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PRIMITIVE_VALUE_in_rulePredefined4357 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_RULE_INT_TYPE_in_rulePredefined4377 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_RULE_FLOATING_POINT_TYPE_in_rulePredefined4397 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_RULE_POINTER_in_rulePredefined4422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVector_in_entryRuleVector4464 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVector4474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleVector4511 = new BitSet(new long[]{0x0000000020000010L});
    public static final BitSet FOLLOW_ruleNUMBER_in_ruleVector4532 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_93_in_ruleVector4544 = new BitSet(new long[]{0x0000000000682000L});
    public static final BitSet FOLLOW_ruleTypeUse_in_ruleVector4565 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleVector4577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArray_in_entryRuleArray4613 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArray4623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleArray4671 = new BitSet(new long[]{0x0000000020000010L});
    public static final BitSet FOLLOW_ruleNUMBER_in_ruleArray4692 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_93_in_ruleArray4704 = new BitSet(new long[]{0x0000400000683020L,0x00000000C0708000L});
    public static final BitSet FOLLOW_ruleTypeUse_in_ruleArray4727 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_ruleAggregate_Type_in_ruleArray4746 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_ruleArray4761 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_94_in_ruleArray4780 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_79_in_ruleArray4799 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_ruleArray4811 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_RULE_POINTER_in_ruleArray4825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAggregate_Type_in_entryRuleAggregate_Type4862 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAggregate_Type4872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructure_in_ruleAggregate_Type4919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArray_in_ruleAggregate_Type4946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVector_in_ruleAggregate_Type4973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstant_in_entryRuleConstant5008 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstant5018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNUMBER_in_ruleConstant5063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveValue_in_entryRulePrimitiveValue5098 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveValue5108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePrimitiveValue5151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PRIMITIVE_VALUE_in_rulePrimitiveValue5171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INITIALIZER_in_rulePrimitiveValue5191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOL_in_rulePrimitiveValue5211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue5254 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue5264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNestedCast_in_ruleValue5311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNestedGetElementPtr_in_ruleValue5338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstant_in_ruleValue5365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddressUse_in_ruleValue5392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveValue_in_ruleValue5419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueStruct_in_ruleValue5446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueStruct_in_entryRuleValueStruct5481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValueStruct5491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_ruleValueStruct5528 = new BitSet(new long[]{0x0000400000683020L,0x00000000C0708000L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleValueStruct5549 = new BitSet(new long[]{0x0000000000000000L,0x0000000100010000L});
    public static final BitSet FOLLOW_80_in_ruleValueStruct5562 = new BitSet(new long[]{0x0000400000683020L,0x00000000C0708000L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleValueStruct5583 = new BitSet(new long[]{0x0000000000000000L,0x0000000100010000L});
    public static final BitSet FOLLOW_96_in_ruleValueStruct5597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructure_in_entryRuleStructure5633 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStructure5643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_ruleStructure5689 = new BitSet(new long[]{0x0000400000683020L,0x00000001C0708000L});
    public static final BitSet FOLLOW_ruleTypeUse_in_ruleStructure5713 = new BitSet(new long[]{0x0000000000000000L,0x0000000100010000L});
    public static final BitSet FOLLOW_ruleAggregate_Type_in_ruleStructure5732 = new BitSet(new long[]{0x0000000000000000L,0x0000000100010000L});
    public static final BitSet FOLLOW_80_in_ruleStructure5748 = new BitSet(new long[]{0x0000400000683020L,0x00000000C0708000L});
    public static final BitSet FOLLOW_ruleTypeUse_in_ruleStructure5771 = new BitSet(new long[]{0x0000000000000000L,0x0000000100010000L});
    public static final BitSet FOLLOW_ruleAggregate_Type_in_ruleStructure5790 = new BitSet(new long[]{0x0000000000000000L,0x0000000100010000L});
    public static final BitSet FOLLOW_96_in_ruleStructure5809 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_RULE_POINTER_in_ruleStructure5821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter5858 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter5868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeUse_in_ruleParameter5916 = new BitSet(new long[]{0x0000000020EAA312L,0x0400000080000000L});
    public static final BitSet FOLLOW_ruleAggregate_Type_in_ruleParameter5935 = new BitSet(new long[]{0x0000000020EAA312L,0x0400000080000000L});
    public static final BitSet FOLLOW_RULE_RETURN_ATTRIBUTES_in_ruleParameter5952 = new BitSet(new long[]{0x0000000020EAA310L,0x0400000080000000L});
    public static final BitSet FOLLOW_ruleValue_in_ruleParameter5974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_ruleParameter6003 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_RULE_RETURN_ATTRIBUTES_in_ruleParameter6016 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_ruleParameterList_in_entryRuleParameterList6055 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterList6065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_ruleParameterList6112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleParameterList6131 = new BitSet(new long[]{0x0008400000683020L,0x00000000C0708000L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleParameterList6153 = new BitSet(new long[]{0x0008000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_ruleParameterList6166 = new BitSet(new long[]{0x0000400000683020L,0x00000000C0708000L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleParameterList6187 = new BitSet(new long[]{0x0008000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_51_in_ruleParameterList6203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionParameter_in_entryRuleFunctionParameter6241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionParameter6251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeUse_in_ruleFunctionParameter6297 = new BitSet(new long[]{0x0000000000080102L});
    public static final BitSet FOLLOW_RULE_RETURN_ATTRIBUTES_in_ruleFunctionParameter6309 = new BitSet(new long[]{0x0000000000080102L});
    public static final BitSet FOLLOW_ruleAddress_in_ruleFunctionParameter6331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionParameterList_in_entryRuleFunctionParameterList6368 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionParameterList6378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionParameter_in_ruleFunctionParameterList6433 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_ruleFunctionParameterList6446 = new BitSet(new long[]{0x0000000000682000L});
    public static final BitSet FOLLOW_ruleFunctionParameter_in_ruleFunctionParameterList6467 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleFunctionBody_in_entryRuleFunctionBody6505 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionBody6515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetadataValue_in_ruleFunctionBody6561 = new BitSet(new long[]{0x0000000001080000L,0x0000000089004500L});
    public static final BitSet FOLLOW_95_in_ruleFunctionBody6574 = new BitSet(new long[]{0x000000000000FFE0L,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleBasicBlock_in_ruleFunctionBody6595 = new BitSet(new long[]{0x000000000000FFE0L,0x00000001000000F0L});
    public static final BitSet FOLLOW_96_in_ruleFunctionBody6608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstruction_in_entryRuleInstruction6644 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInstruction6654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStore_in_ruleInstruction6701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLoad_in_ruleInstruction6728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGetElementPtr_in_ruleInstruction6755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlloc_in_ruleInstruction6782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCmpXchg_in_ruleInstruction6809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicRMW_in_ruleInstruction6836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFence_in_ruleInstruction6863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReturn_in_ruleInstruction6890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBranch_in_ruleInstruction6917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSwitch_in_ruleInstruction6944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIndirectBranch_in_ruleInstruction6971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInvoke_in_ruleInstruction6998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResume_in_ruleInstruction7025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnreachable_in_ruleInstruction7052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicOperation_in_ruleInstruction7079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArithmeticOperation_in_ruleInstruction7106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompare_in_ruleInstruction7133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCast_in_ruleInstruction7160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleShuffleVector_in_ruleInstruction7187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInsertElement_in_ruleInstruction7214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtractElement_in_ruleInstruction7241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInsertValue_in_ruleInstruction7268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtractValue_in_ruleInstruction7295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePhi_in_ruleInstruction7322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelect_in_ruleInstruction7349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCall_in_ruleInstruction7376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableAttributeAccess_in_ruleInstruction7403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLandingPad_in_ruleInstruction7430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicBlock_in_entryRuleBasicBlock7465 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBasicBlock7475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLABEL_ID_in_ruleBasicBlock7522 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_97_in_ruleBasicBlock7534 = new BitSet(new long[]{0x0000000000080000L,0x90000000000000E0L,0x0000000016400038L});
    public static final BitSet FOLLOW_ruleInstruction_in_ruleBasicBlock7556 = new BitSet(new long[]{0x0000000000080002L,0x90000000000000E0L,0x0000000016400038L});
    public static final BitSet FOLLOW_ruleArithmeticOperation_in_entryRuleArithmeticOperation7593 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArithmeticOperation7603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddress_in_ruleArithmeticOperation7649 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_ruleArithmeticOperation7661 = new BitSet(new long[]{0x0000000000000000L,0x00003FFC00000000L});
    public static final BitSet FOLLOW_98_in_ruleArithmeticOperation7681 = new BitSet(new long[]{0x0000000000682000L,0x0000C00000000000L});
    public static final BitSet FOLLOW_99_in_ruleArithmeticOperation7710 = new BitSet(new long[]{0x0000000000682000L,0x0000C00000000000L});
    public static final BitSet FOLLOW_100_in_ruleArithmeticOperation7739 = new BitSet(new long[]{0x0000000000682000L,0x0000C00000000000L});
    public static final BitSet FOLLOW_101_in_ruleArithmeticOperation7768 = new BitSet(new long[]{0x0000000000682000L,0x0000C00000000000L});
    public static final BitSet FOLLOW_102_in_ruleArithmeticOperation7797 = new BitSet(new long[]{0x0000000000682000L,0x0000C00000000000L});
    public static final BitSet FOLLOW_103_in_ruleArithmeticOperation7826 = new BitSet(new long[]{0x0000000000682000L,0x0000C00000000000L});
    public static final BitSet FOLLOW_104_in_ruleArithmeticOperation7855 = new BitSet(new long[]{0x0000000000682000L,0x0000C00000000000L});
    public static final BitSet FOLLOW_105_in_ruleArithmeticOperation7884 = new BitSet(new long[]{0x0000000000682000L,0x0000C00000000000L});
    public static final BitSet FOLLOW_106_in_ruleArithmeticOperation7913 = new BitSet(new long[]{0x0000000000682000L,0x0000C00000000000L});
    public static final BitSet FOLLOW_107_in_ruleArithmeticOperation7942 = new BitSet(new long[]{0x0000000000682000L,0x0000C00000000000L});
    public static final BitSet FOLLOW_108_in_ruleArithmeticOperation7971 = new BitSet(new long[]{0x0000000000682000L,0x0000C00000000000L});
    public static final BitSet FOLLOW_109_in_ruleArithmeticOperation8000 = new BitSet(new long[]{0x0000000000682000L,0x0000C00000000000L});
    public static final BitSet FOLLOW_110_in_ruleArithmeticOperation8030 = new BitSet(new long[]{0x0000000000682000L,0x0000C00000000000L});
    public static final BitSet FOLLOW_111_in_ruleArithmeticOperation8048 = new BitSet(new long[]{0x0000000000682000L,0x0000C00000000000L});
    public static final BitSet FOLLOW_111_in_ruleArithmeticOperation8062 = new BitSet(new long[]{0x0000000000682000L});
    public static final BitSet FOLLOW_110_in_ruleArithmeticOperation8080 = new BitSet(new long[]{0x0000000000682000L});
    public static final BitSet FOLLOW_ruleTypeUse_in_ruleArithmeticOperation8105 = new BitSet(new long[]{0x0000000020EAA210L,0x0400000080000000L});
    public static final BitSet FOLLOW_ruleValue_in_ruleArithmeticOperation8126 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_ruleArithmeticOperation8138 = new BitSet(new long[]{0x0000000020EAA210L,0x0400000080000000L});
    public static final BitSet FOLLOW_ruleValue_in_ruleArithmeticOperation8159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicOperation_in_entryRuleLogicOperation8195 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLogicOperation8205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddress_in_ruleLogicOperation8251 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_ruleLogicOperation8263 = new BitSet(new long[]{0x0000000000000000L,0x003F000000000000L});
    public static final BitSet FOLLOW_112_in_ruleLogicOperation8283 = new BitSet(new long[]{0x0000000000682000L});
    public static final BitSet FOLLOW_113_in_ruleLogicOperation8312 = new BitSet(new long[]{0x0000000000682000L});
    public static final BitSet FOLLOW_114_in_ruleLogicOperation8341 = new BitSet(new long[]{0x0000000000682000L});
    public static final BitSet FOLLOW_115_in_ruleLogicOperation8370 = new BitSet(new long[]{0x0000000000682000L});
    public static final BitSet FOLLOW_116_in_ruleLogicOperation8399 = new BitSet(new long[]{0x0000000000682000L});
    public static final BitSet FOLLOW_117_in_ruleLogicOperation8428 = new BitSet(new long[]{0x0000000000682000L});
    public static final BitSet FOLLOW_ruleTypeUse_in_ruleLogicOperation8465 = new BitSet(new long[]{0x0000000020EAA210L,0x0400000080000000L});
    public static final BitSet FOLLOW_ruleValue_in_ruleLogicOperation8486 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_ruleLogicOperation8498 = new BitSet(new long[]{0x0000000020EAA210L,0x0400000080000000L});
    public static final BitSet FOLLOW_ruleValue_in_ruleLogicOperation8519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCast_in_entryRuleCast8555 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCast8565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddress_in_ruleCast8611 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_ruleCast8623 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_CAST_OP_in_ruleCast8640 = new BitSet(new long[]{0x0000400000683020L,0x00000000C0708000L});
    public static final BitSet FOLLOW_ruleTypeUse_in_ruleCast8668 = new BitSet(new long[]{0x0000000020EAA210L,0x0400000080000000L});
    public static final BitSet FOLLOW_ruleAggregate_Type_in_ruleCast8687 = new BitSet(new long[]{0x0000000020EAA210L,0x0400000080000000L});
    public static final BitSet FOLLOW_ruleValue_in_ruleCast8711 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_ruleCast8723 = new BitSet(new long[]{0x0000000000682000L});
    public static final BitSet FOLLOW_ruleTypeUse_in_ruleCast8744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNestedCast_in_entryRuleNestedCast8780 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNestedCast8790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CAST_OP_in_ruleNestedCast8832 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_ruleNestedCast8849 = new BitSet(new long[]{0x0000400000683020L,0x00000000C0708000L});
    public static final BitSet FOLLOW_ruleTypeUse_in_ruleNestedCast8872 = new BitSet(new long[]{0x0000000020EAA210L,0x0400000080000000L});
    public static final BitSet FOLLOW_ruleAggregate_Type_in_ruleNestedCast8891 = new BitSet(new long[]{0x0000000020EAA210L,0x0400000080000000L});
    public static final BitSet FOLLOW_ruleValue_in_ruleNestedCast8915 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_ruleNestedCast8927 = new BitSet(new long[]{0x0000000000682000L});
    public static final BitSet FOLLOW_ruleTypeUse_in_ruleNestedCast8948 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_ruleNestedCast8960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetaArgValue_in_entryRuleMetaArgValue8996 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMetaArgValue9006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_METADATA_in_ruleMetaArgValue9048 = new BitSet(new long[]{0x0000000001020000L});
    public static final BitSet FOLLOW_RULE_METADATA_in_ruleMetaArgValue9072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMetaArgValue9092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMeta_in_entryRuleMeta9136 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMeta9146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_119_in_ruleMeta9184 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_RULE_METADATA_in_ruleMeta9201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredefined_in_ruleMeta9235 = new BitSet(new long[]{0x0000000020EAA210L,0x0400000080000000L});
    public static final BitSet FOLLOW_ruleValue_in_ruleMeta9257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetadataValue_in_entryRuleMetadataValue9294 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMetadataValue9304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_METADATA_in_ruleMetadataValue9346 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_ruleMetadataValue9363 = new BitSet(new long[]{0x0000000000000000L,0x0380000000000000L});
    public static final BitSet FOLLOW_119_in_ruleMetadataValue9376 = new BitSet(new long[]{0x0000000000000000L,0x0300000000000000L});
    public static final BitSet FOLLOW_120_in_ruleMetadataValue9392 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_95_in_ruleMetadataValue9404 = new BitSet(new long[]{0x0000000020EAA210L,0x0480000080000000L});
    public static final BitSet FOLLOW_121_in_ruleMetadataValue9423 = new BitSet(new long[]{0x0000000020EAA210L,0x0480000080000000L});
    public static final BitSet FOLLOW_ruleMeta_in_ruleMetadataValue9445 = new BitSet(new long[]{0x0000000000000000L,0x0000000100010000L});
    public static final BitSet FOLLOW_80_in_ruleMetadataValue9458 = new BitSet(new long[]{0x0000000020EAA210L,0x0480000080000000L});
    public static final BitSet FOLLOW_ruleMeta_in_ruleMetadataValue9479 = new BitSet(new long[]{0x0000000000000000L,0x0000000100010000L});
    public static final BitSet FOLLOW_96_in_ruleMetadataValue9493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGetElementPtr_in_entryRuleGetElementPtr9529 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGetElementPtr9539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddress_in_ruleGetElementPtr9585 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_ruleGetElementPtr9597 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_122_in_ruleGetElementPtr9609 = new BitSet(new long[]{0x0000400000683020L,0x08000000C0708000L});
    public static final BitSet FOLLOW_123_in_ruleGetElementPtr9622 = new BitSet(new long[]{0x0000400000683020L,0x00000000C0708000L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleGetElementPtr9646 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_ruleGetElementPtr9659 = new BitSet(new long[]{0x0000400000683020L,0x00000000C0708000L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleGetElementPtr9680 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleNestedGetElementPtr_in_entryRuleNestedGetElementPtr9719 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNestedGetElementPtr9729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_122_in_ruleNestedGetElementPtr9766 = new BitSet(new long[]{0x0004000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_123_in_ruleNestedGetElementPtr9779 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_ruleNestedGetElementPtr9794 = new BitSet(new long[]{0x0000400000683020L,0x00000000C0708000L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleNestedGetElementPtr9815 = new BitSet(new long[]{0x0008000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_ruleNestedGetElementPtr9828 = new BitSet(new long[]{0x0000400000683020L,0x00000000C0708000L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleNestedGetElementPtr9849 = new BitSet(new long[]{0x0008000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_51_in_ruleNestedGetElementPtr9863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFence_in_entryRuleFence9900 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFence9910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_124_in_ruleFence9947 = new BitSet(new long[]{0x0000000000000040L,0x2000000000000000L});
    public static final BitSet FOLLOW_125_in_ruleFence9960 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ATOMIC_ORDERING_in_ruleFence9979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCmpXchg_in_entryRuleCmpXchg10020 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCmpXchg10030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddress_in_ruleCmpXchg10076 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_ruleCmpXchg10088 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_126_in_ruleCmpXchg10100 = new BitSet(new long[]{0x0000400000683020L,0x80000000C0708000L});
    public static final BitSet FOLLOW_127_in_ruleCmpXchg10118 = new BitSet(new long[]{0x0000400000683020L,0x00000000C0708000L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleCmpXchg10153 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_ruleCmpXchg10165 = new BitSet(new long[]{0x0000400000683020L,0x00000000C0708000L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleCmpXchg10186 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_ruleCmpXchg10198 = new BitSet(new long[]{0x0000400000683020L,0x00000000C0708000L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleCmpXchg10219 = new BitSet(new long[]{0x0000000000000040L,0x2000000000000000L});
    public static final BitSet FOLLOW_125_in_ruleCmpXchg10232 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ATOMIC_ORDERING_in_ruleCmpXchg10251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicRMW_in_entryRuleAtomicRMW10292 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtomicRMW10302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddress_in_ruleAtomicRMW10348 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_ruleAtomicRMW10360 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_128_in_ruleAtomicRMW10372 = new BitSet(new long[]{0x0000000000000080L,0x8000000000000000L});
    public static final BitSet FOLLOW_127_in_ruleAtomicRMW10390 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_BIN_OP_in_ruleAtomicRMW10421 = new BitSet(new long[]{0x0000400000683020L,0x00000000C0708000L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleAtomicRMW10447 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_ruleAtomicRMW10459 = new BitSet(new long[]{0x0000400000683020L,0x00000000C0708000L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleAtomicRMW10480 = new BitSet(new long[]{0x0000000000000040L,0x2000000000000000L});
    public static final BitSet FOLLOW_125_in_ruleAtomicRMW10493 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ATOMIC_ORDERING_in_ruleAtomicRMW10512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLoad_in_entryRuleLoad10553 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLoad10563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddress_in_ruleLoad10610 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_ruleLoad10622 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_127_in_ruleLoad10642 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_129_in_ruleLoad10667 = new BitSet(new long[]{0x0000400000683020L,0x00000000C0708000L});
    public static final BitSet FOLLOW_129_in_ruleLoad10687 = new BitSet(new long[]{0x0000400000683020L,0x80000000C0708000L});
    public static final BitSet FOLLOW_127_in_ruleLoad10705 = new BitSet(new long[]{0x0000400000683020L,0x00000000C0708000L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleLoad10742 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_ruleLoad10755 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_87_in_ruleLoad10767 = new BitSet(new long[]{0x0000000020000010L});
    public static final BitSet FOLLOW_ruleNUMBER_in_ruleLoad10788 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_ruleLoad10803 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ruleMetaArgValue_in_ruleLoad10824 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleAddress_in_ruleLoad10855 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_ruleLoad10867 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_129_in_ruleLoad10879 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_130_in_ruleLoad10897 = new BitSet(new long[]{0x0000400000683020L,0x80000000C0708000L});
    public static final BitSet FOLLOW_127_in_ruleLoad10928 = new BitSet(new long[]{0x0000400000683020L,0x00000000C0708000L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleLoad10963 = new BitSet(new long[]{0x0000000000000040L,0x2000000000000000L});
    public static final BitSet FOLLOW_125_in_ruleLoad10976 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ATOMIC_ORDERING_in_ruleLoad10995 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_ruleLoad11013 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_87_in_ruleLoad11025 = new BitSet(new long[]{0x0000000020000010L});
    public static final BitSet FOLLOW_ruleNUMBER_in_ruleLoad11046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStore_in_entryRuleStore11085 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStore11095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_127_in_ruleStore11141 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_131_in_ruleStore11166 = new BitSet(new long[]{0x0000400000683020L,0x00000000C0708000L});
    public static final BitSet FOLLOW_131_in_ruleStore11186 = new BitSet(new long[]{0x0000400000683020L,0x80000000C0708000L});
    public static final BitSet FOLLOW_127_in_ruleStore11204 = new BitSet(new long[]{0x0000400000683020L,0x00000000C0708000L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleStore11241 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_ruleStore11253 = new BitSet(new long[]{0x0000400000683020L,0x00000000C0708000L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleStore11274 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_ruleStore11287 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_87_in_ruleStore11299 = new BitSet(new long[]{0x0000000020000010L});
    public static final BitSet FOLLOW_ruleNUMBER_in_ruleStore11320 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_ruleStore11335 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ruleMetaArgValue_in_ruleStore11356 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_131_in_ruleStore11378 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_130_in_ruleStore11396 = new BitSet(new long[]{0x0000400000683020L,0x80000000C0708000L});
    public static final BitSet FOLLOW_127_in_ruleStore11427 = new BitSet(new long[]{0x0000400000683020L,0x00000000C0708000L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleStore11462 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_ruleStore11474 = new BitSet(new long[]{0x0000400000683020L,0x00000000C0708000L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleStore11495 = new BitSet(new long[]{0x0000000000000040L,0x2000000000000000L});
    public static final BitSet FOLLOW_125_in_ruleStore11508 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ATOMIC_ORDERING_in_ruleStore11527 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_ruleStore11545 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_87_in_ruleStore11557 = new BitSet(new long[]{0x0000000020000010L});
    public static final BitSet FOLLOW_ruleNUMBER_in_ruleStore11578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCall_in_entryRuleCall11617 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCall11627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddress_in_ruleCall11674 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_ruleCall11686 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000030L});
    public static final BitSet FOLLOW_132_in_ruleCall11701 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_133_in_ruleCall11715 = new BitSet(new long[]{0x00007FFF80683120L,0x00000000C0708000L});
    public static final BitSet FOLLOW_ruleCALLING_CONV_in_ruleCall11732 = new BitSet(new long[]{0x0000400000683120L,0x00000000C0708000L});
    public static final BitSet FOLLOW_RULE_RETURN_ATTRIBUTES_in_ruleCall11745 = new BitSet(new long[]{0x0000400000683020L,0x00000000C0708000L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleCall11767 = new BitSet(new long[]{0x0004000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_ruleParameterList_in_ruleCall11788 = new BitSet(new long[]{0xFFF3000000000002L,0x000000000001000FL});
    public static final BitSet FOLLOW_ruleFUNCTION_ATTRIBUTES_in_ruleCall11805 = new BitSet(new long[]{0xFFF3000000000002L,0x000000000001000FL});
    public static final BitSet FOLLOW_80_in_ruleCall11819 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_134_in_ruleCall11831 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_120_in_ruleCall11843 = new BitSet(new long[]{0x0000000020000010L});
    public static final BitSet FOLLOW_ruleNUMBER_in_ruleCall11859 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleAlloc_in_entryRuleAlloc11896 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAlloc11906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddress_in_ruleAlloc11952 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_ruleAlloc11964 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_135_in_ruleAlloc11976 = new BitSet(new long[]{0x0000000000682000L});
    public static final BitSet FOLLOW_ruleTypeUse_in_ruleAlloc11997 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_ruleAlloc12010 = new BitSet(new long[]{0x0000400000683020L,0x00000000C0708000L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleAlloc12031 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_ruleAlloc12046 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_87_in_ruleAlloc12058 = new BitSet(new long[]{0x0000000020000010L});
    public static final BitSet FOLLOW_ruleNUMBER_in_ruleAlloc12079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePhiCase_in_entryRulePhiCase12117 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePhiCase12127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rulePhiCase12173 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_rulePhiCase12185 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_RULE_VALID_ID_in_rulePhiCase12202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePhi_in_entryRulePhi12243 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePhi12253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddress_in_rulePhi12299 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_rulePhi12311 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_136_in_rulePhi12323 = new BitSet(new long[]{0x0000000000682000L});
    public static final BitSet FOLLOW_ruleTypeUse_in_rulePhi12344 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_rulePhi12356 = new BitSet(new long[]{0x0000000020EAA210L,0x0400000080000000L});
    public static final BitSet FOLLOW_rulePhiCase_in_rulePhi12377 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_rulePhi12389 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_rulePhi12402 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_rulePhi12414 = new BitSet(new long[]{0x0000000020EAA210L,0x0400000080000000L});
    public static final BitSet FOLLOW_rulePhiCase_in_rulePhi12435 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_rulePhi12447 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleLandingPad_in_entryRuleLandingPad12485 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLandingPad12495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddress_in_ruleLandingPad12541 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_ruleLandingPad12553 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_137_in_ruleLandingPad12565 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_ruleStructure_in_ruleLandingPad12586 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_138_in_ruleLandingPad12598 = new BitSet(new long[]{0x0000000000682000L});
    public static final BitSet FOLLOW_ruleTypeUse_in_ruleLandingPad12619 = new BitSet(new long[]{0x0000000020EAA210L,0x0400000080000000L});
    public static final BitSet FOLLOW_ruleValue_in_ruleLandingPad12640 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L,0x0000000000001800L});
    public static final BitSet FOLLOW_139_in_ruleLandingPad12654 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L,0x0000000000001800L});
    public static final BitSet FOLLOW_ruleClause_in_ruleLandingPad12675 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L,0x0000000000001800L});
    public static final BitSet FOLLOW_ruleClause_in_ruleLandingPad12704 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L,0x0000000000001800L});
    public static final BitSet FOLLOW_ruleClause_in_entryRuleClause12742 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClause12752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleClause12790 = new BitSet(new long[]{0x0000000000682000L});
    public static final BitSet FOLLOW_ruleTypeUse_in_ruleClause12811 = new BitSet(new long[]{0x0000000020EAA210L,0x0400000080000000L});
    public static final BitSet FOLLOW_ruleValue_in_ruleClause12832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_140_in_ruleClause12852 = new BitSet(new long[]{0x0000000000000000L,0x0000000040008000L});
    public static final BitSet FOLLOW_ruleArray_in_ruleClause12873 = new BitSet(new long[]{0x0000000020EAA210L,0x0400000080000000L});
    public static final BitSet FOLLOW_ruleValue_in_ruleClause12894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelect_in_entryRuleSelect12931 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelect12941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddress_in_ruleSelect12987 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_ruleSelect12999 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_141_in_ruleSelect13011 = new BitSet(new long[]{0x0000400000683020L,0x00000000C0708000L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleSelect13032 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_ruleSelect13044 = new BitSet(new long[]{0x0000400000683020L,0x00000000C0708000L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleSelect13065 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_ruleSelect13077 = new BitSet(new long[]{0x0000400000683020L,0x00000000C0708000L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleSelect13098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableAttributeAccess_in_entryRuleVariableAttributeAccess13134 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableAttributeAccess13144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddress_in_ruleVariableAttributeAccess13190 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_ruleVariableAttributeAccess13202 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_142_in_ruleVariableAttributeAccess13214 = new BitSet(new long[]{0x0000400000683020L,0x00000000C0708000L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleVariableAttributeAccess13235 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_ruleVariableAttributeAccess13247 = new BitSet(new long[]{0x0000000000682000L});
    public static final BitSet FOLLOW_ruleTypeUse_in_ruleVariableAttributeAccess13268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtractValue_in_entryRuleExtractValue13304 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExtractValue13314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddress_in_ruleExtractValue13360 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_ruleExtractValue13372 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_143_in_ruleExtractValue13384 = new BitSet(new long[]{0x0000400000683020L,0x00000000C0708000L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleExtractValue13405 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_ruleExtractValue13418 = new BitSet(new long[]{0x0000000020000010L});
    public static final BitSet FOLLOW_ruleNUMBER_in_ruleExtractValue13439 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleInsertValue_in_entryRuleInsertValue13477 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInsertValue13487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddress_in_ruleInsertValue13533 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_ruleInsertValue13545 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_144_in_ruleInsertValue13557 = new BitSet(new long[]{0x0000400000683020L,0x00000000C0708000L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleInsertValue13578 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_ruleInsertValue13590 = new BitSet(new long[]{0x0000400000683020L,0x00000000C0708000L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleInsertValue13611 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_ruleInsertValue13624 = new BitSet(new long[]{0x0000000020000010L});
    public static final BitSet FOLLOW_ruleNUMBER_in_ruleInsertValue13645 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleExtractElement_in_entryRuleExtractElement13683 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExtractElement13693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddress_in_ruleExtractElement13739 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_ruleExtractElement13751 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_145_in_ruleExtractElement13763 = new BitSet(new long[]{0x0000400000683020L,0x00000000C0708000L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleExtractElement13784 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_ruleExtractElement13796 = new BitSet(new long[]{0x0000400000683020L,0x00000000C0708000L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleExtractElement13817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInsertElement_in_entryRuleInsertElement13853 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInsertElement13863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddress_in_ruleInsertElement13909 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_ruleInsertElement13921 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_146_in_ruleInsertElement13933 = new BitSet(new long[]{0x0000400000683020L,0x00000000C0708000L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleInsertElement13954 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_ruleInsertElement13966 = new BitSet(new long[]{0x0000400000683020L,0x00000000C0708000L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleInsertElement13987 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_ruleInsertElement13999 = new BitSet(new long[]{0x0000400000683020L,0x00000000C0708000L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleInsertElement14020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleShuffleVector_in_entryRuleShuffleVector14056 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleShuffleVector14066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddress_in_ruleShuffleVector14112 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_ruleShuffleVector14124 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_147_in_ruleShuffleVector14136 = new BitSet(new long[]{0x0000400000683020L,0x00000000C0708000L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleShuffleVector14157 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_ruleShuffleVector14169 = new BitSet(new long[]{0x0000400000683020L,0x00000000C0708000L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleShuffleVector14190 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_ruleShuffleVector14202 = new BitSet(new long[]{0x0000400000683020L,0x00000000C0708000L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleShuffleVector14223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompare_in_entryRuleCompare14259 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompare14269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddress_in_ruleCompare14315 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_ruleCompare14327 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000300000L});
    public static final BitSet FOLLOW_148_in_ruleCompare14341 = new BitSet(new long[]{0x0000000002008400L});
    public static final BitSet FOLLOW_149_in_ruleCompare14359 = new BitSet(new long[]{0x0000000002008400L});
    public static final BitSet FOLLOW_RULE_I_PREDICATES_in_ruleCompare14379 = new BitSet(new long[]{0x0000000000682000L});
    public static final BitSet FOLLOW_RULE_F_PREDICATES_in_ruleCompare14399 = new BitSet(new long[]{0x0000000000682000L});
    public static final BitSet FOLLOW_RULE_BOOL_in_ruleCompare14419 = new BitSet(new long[]{0x0000000000682000L});
    public static final BitSet FOLLOW_ruleTypeUse_in_ruleCompare14448 = new BitSet(new long[]{0x0000000020EAA210L,0x0400000080000000L});
    public static final BitSet FOLLOW_ruleValue_in_ruleCompare14469 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_ruleCompare14481 = new BitSet(new long[]{0x0000000020EAA210L,0x0400000080000000L});
    public static final BitSet FOLLOW_ruleValue_in_ruleCompare14502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIndirectBranch_in_entryRuleIndirectBranch14539 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIndirectBranch14549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_150_in_ruleIndirectBranch14586 = new BitSet(new long[]{0x0000400000683020L,0x00000000C0708000L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleIndirectBranch14607 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_ruleIndirectBranch14619 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_ruleIndirectBranch14631 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L,0x0000000000800000L});
    public static final BitSet FOLLOW_151_in_ruleIndirectBranch14644 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_RULE_VALID_ID_in_ruleIndirectBranch14661 = new BitSet(new long[]{0x0000000000000000L,0x0000000000030000L});
    public static final BitSet FOLLOW_80_in_ruleIndirectBranch14679 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_151_in_ruleIndirectBranch14691 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_RULE_VALID_ID_in_ruleIndirectBranch14708 = new BitSet(new long[]{0x0000000000000000L,0x0000000000030000L});
    public static final BitSet FOLLOW_81_in_ruleIndirectBranch14729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSwitch_in_entryRuleSwitch14765 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSwitch14775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleSwitch14812 = new BitSet(new long[]{0x0000400000683020L,0x00000000C0708000L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleSwitch14833 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_ruleSwitch14845 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_151_in_ruleSwitch14857 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_RULE_VALID_ID_in_ruleSwitch14874 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_ruleSwitch14891 = new BitSet(new long[]{0x0000400000683020L,0x00000000C0728000L});
    public static final BitSet FOLLOW_ruleSwitchCase_in_ruleSwitch14912 = new BitSet(new long[]{0x0000400000683020L,0x00000000C0728000L});
    public static final BitSet FOLLOW_81_in_ruleSwitch14925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSwitchCase_in_entryRuleSwitchCase14961 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSwitchCase14971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleSwitchCase15017 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_ruleSwitchCase15029 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_151_in_ruleSwitchCase15041 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_RULE_VALID_ID_in_ruleSwitchCase15058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInvoke_in_entryRuleInvoke15099 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInvoke15109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleInvoke15146 = new BitSet(new long[]{0x00003FFF80682100L});
    public static final BitSet FOLLOW_ruleCALLING_CONV_in_ruleInvoke15163 = new BitSet(new long[]{0x0000000000682100L});
    public static final BitSet FOLLOW_RULE_RETURN_ATTRIBUTES_in_ruleInvoke15176 = new BitSet(new long[]{0x0000000000682000L});
    public static final BitSet FOLLOW_ruleTypeUse_in_ruleInvoke15198 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ruleAddress_in_ruleInvoke15219 = new BitSet(new long[]{0x0004000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_ruleParameterList_in_ruleInvoke15240 = new BitSet(new long[]{0xFFF3000000000000L,0x004000000000000FL});
    public static final BitSet FOLLOW_ruleFUNCTION_ATTRIBUTES_in_ruleInvoke15257 = new BitSet(new long[]{0xFFF3000000000000L,0x004000000000000FL});
    public static final BitSet FOLLOW_118_in_ruleInvoke15270 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_151_in_ruleInvoke15282 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_RULE_VALID_ID_in_ruleInvoke15299 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_152_in_ruleInvoke15316 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_151_in_ruleInvoke15328 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_RULE_VALID_ID_in_ruleInvoke15345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResume_in_entryRuleResume15386 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResume15396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleResume15433 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_ruleStructure_in_ruleResume15454 = new BitSet(new long[]{0x0000000020EAA210L,0x0400000080000000L});
    public static final BitSet FOLLOW_ruleValue_in_ruleResume15475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnreachable_in_entryRuleUnreachable15511 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnreachable15521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_153_in_ruleUnreachable15567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReturn_in_entryRuleReturn15603 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReturn15613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_154_in_ruleReturn15650 = new BitSet(new long[]{0x0000400000683020L,0x00000000C0708000L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleReturn15671 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_ruleReturn15684 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_155_in_ruleReturn15696 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_120_in_ruleReturn15708 = new BitSet(new long[]{0x0000000020000010L});
    public static final BitSet FOLLOW_ruleNUMBER_in_ruleReturn15724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBranch_in_entryRuleBranch15761 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBranch15771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_156_in_ruleBranch15809 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_151_in_ruleBranch15821 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_RULE_VALID_ID_in_ruleBranch15838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_156_in_ruleBranch15863 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_RULE_INT_TYPE_in_ruleBranch15874 = new BitSet(new long[]{0x0000000020EAA210L,0x0400000080000000L});
    public static final BitSet FOLLOW_ruleValue_in_ruleBranch15894 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_ruleBranch15906 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_151_in_ruleBranch15918 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_RULE_VALID_ID_in_ruleBranch15935 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_ruleBranch15952 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_151_in_ruleBranch15964 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_RULE_VALID_ID_in_ruleBranch15981 = new BitSet(new long[]{0x0000000000000002L});

}