package de.upb.llvm_parser.ui.contentassist.antlr.internal; 

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
import de.upb.llvm_parser.services.LLVMGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalLLVMParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_OREST", "RULE_INT_TYPE", "RULE_SL_COMMENT", "RULE_ARRAYL", "RULE_ARRAYR", "RULE_STRING", "RULE_INT", "RULE_POINTER", "RULE_VALID_ID", "RULE_ID", "RULE_CSTRING", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'opaque'", "'datalayout'", "'triple'", "'global'", "'unnamed_addr'", "'constant'", "'void'", "'null'", "'label'", "'undef'", "'true'", "'false'", "'half'", "'float'", "'double'", "'x86_fp80'", "'fp128'", "'ppc_fp128'", "'()'", "')'", "')*'", "')**'", "')***'", "')****'", "')*****'", "'zeroext'", "'signext'", "'inreg'", "'byval'", "'sret'", "'noalias'", "'nocapture'", "'nest'", "'ccc'", "'fastcc'", "'coldcc'", "'x86_stdcallcc'", "'x86_fastcallcc'", "'x86_thiscallcc'", "'arm_apcscc'", "'arm_aapcscc'", "'arm_aapcs_vfpcc'", "'msp430_intrcc'", "'ptx_kernel'", "'ptx_device'", "'spir_func'", "'spir_kernel'", "'address_safety'", "'alwaysinline'", "'nonlazybind'", "'inlinehint'", "'naked'", "'noimplicitfloat'", "'noinline'", "'noredzone'", "'noreturn'", "'nounwind'", "'optsize'", "'readnone'", "'readonly'", "'returns_twice'", "'ssp'", "'sspreq'", "'uwtable'", "'default'", "'hidden'", "'protected'", "'private'", "'linker_private'", "'linker_private_weak'", "'available_externally'", "'linkonce'", "'common'", "'appending'", "'extern_weak'", "'linkonce_odr'", "'linkonce_odr_auto_hide'", "'dllimport'", "'dllexport'", "'external'", "'internal'", "'weak'", "'weak_odr'", "'module'", "'asm'", "'target'", "'='", "'deplibs'", "','", "'type'", "'define'", "'section '", "'declare'", "'<'", "'x'", "'>'", "'{'", "'}'", "'('", "':'", "'cc'", "'alignstack'", "'align'"
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
    public static final int RULE_STRING=9;
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
    public static final int RULE_POINTER=11;
    public static final int T__117=117;
    public static final int T__114=114;
    public static final int T__115=115;
    public static final int T__120=120;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int T__55=55;
    public static final int RULE_ARRAYL=7;
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
    public static final int RULE_ARRAYR=8;
    public static final int T__59=59;
    public static final int T__103=103;
    public static final int T__104=104;
    public static final int T__105=105;
    public static final int T__106=106;
    public static final int T__111=111;
    public static final int T__110=110;
    public static final int RULE_INT=10;
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
    public static final int RULE_VALID_ID=12;
    public static final int T__100=100;
    public static final int RULE_SL_COMMENT=6;
    public static final int RULE_INT_TYPE=5;
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
    public static final int RULE_OREST=4;
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
    public String getGrammarFileName() { return "../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g"; }


     
     	private LLVMGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(LLVMGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleLLVM"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:60:1: entryRuleLLVM : ruleLLVM EOF ;
    public final void entryRuleLLVM() throws RecognitionException {
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:61:1: ( ruleLLVM EOF )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:62:1: ruleLLVM EOF
            {
             before(grammarAccess.getLLVMRule()); 
            pushFollow(FOLLOW_ruleLLVM_in_entryRuleLLVM61);
            ruleLLVM();

            state._fsp--;

             after(grammarAccess.getLLVMRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLLVM68); 

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
    // $ANTLR end "entryRuleLLVM"


    // $ANTLR start "ruleLLVM"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:69:1: ruleLLVM : ( ( rule__LLVM__ElementsAssignment )* ) ;
    public final void ruleLLVM() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:73:2: ( ( ( rule__LLVM__ElementsAssignment )* ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:74:1: ( ( rule__LLVM__ElementsAssignment )* )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:74:1: ( ( rule__LLVM__ElementsAssignment )* )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:75:1: ( rule__LLVM__ElementsAssignment )*
            {
             before(grammarAccess.getLLVMAccess().getElementsAssignment()); 
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:76:1: ( rule__LLVM__ElementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_VALID_ID||LA1_0==101||LA1_0==103||LA1_0==105||LA1_0==108||LA1_0==110) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:76:2: rule__LLVM__ElementsAssignment
            	    {
            	    pushFollow(FOLLOW_rule__LLVM__ElementsAssignment_in_ruleLLVM94);
            	    rule__LLVM__ElementsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getLLVMAccess().getElementsAssignment()); 

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
    // $ANTLR end "ruleLLVM"


    // $ANTLR start "entryRuleAbstractElement"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:88:1: entryRuleAbstractElement : ruleAbstractElement EOF ;
    public final void entryRuleAbstractElement() throws RecognitionException {
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:89:1: ( ruleAbstractElement EOF )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:90:1: ruleAbstractElement EOF
            {
             before(grammarAccess.getAbstractElementRule()); 
            pushFollow(FOLLOW_ruleAbstractElement_in_entryRuleAbstractElement122);
            ruleAbstractElement();

            state._fsp--;

             after(grammarAccess.getAbstractElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractElement129); 

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
    // $ANTLR end "entryRuleAbstractElement"


    // $ANTLR start "ruleAbstractElement"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:97:1: ruleAbstractElement : ( ( rule__AbstractElement__Alternatives ) ) ;
    public final void ruleAbstractElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:101:2: ( ( ( rule__AbstractElement__Alternatives ) ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:102:1: ( ( rule__AbstractElement__Alternatives ) )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:102:1: ( ( rule__AbstractElement__Alternatives ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:103:1: ( rule__AbstractElement__Alternatives )
            {
             before(grammarAccess.getAbstractElementAccess().getAlternatives()); 
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:104:1: ( rule__AbstractElement__Alternatives )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:104:2: rule__AbstractElement__Alternatives
            {
            pushFollow(FOLLOW_rule__AbstractElement__Alternatives_in_ruleAbstractElement155);
            rule__AbstractElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAbstractElementAccess().getAlternatives()); 

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
    // $ANTLR end "ruleAbstractElement"


    // $ANTLR start "entryRuleTopLevelEntity"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:116:1: entryRuleTopLevelEntity : ruleTopLevelEntity EOF ;
    public final void entryRuleTopLevelEntity() throws RecognitionException {
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:117:1: ( ruleTopLevelEntity EOF )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:118:1: ruleTopLevelEntity EOF
            {
             before(grammarAccess.getTopLevelEntityRule()); 
            pushFollow(FOLLOW_ruleTopLevelEntity_in_entryRuleTopLevelEntity182);
            ruleTopLevelEntity();

            state._fsp--;

             after(grammarAccess.getTopLevelEntityRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTopLevelEntity189); 

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
    // $ANTLR end "entryRuleTopLevelEntity"


    // $ANTLR start "ruleTopLevelEntity"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:125:1: ruleTopLevelEntity : ( ( rule__TopLevelEntity__Alternatives ) ) ;
    public final void ruleTopLevelEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:129:2: ( ( ( rule__TopLevelEntity__Alternatives ) ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:130:1: ( ( rule__TopLevelEntity__Alternatives ) )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:130:1: ( ( rule__TopLevelEntity__Alternatives ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:131:1: ( rule__TopLevelEntity__Alternatives )
            {
             before(grammarAccess.getTopLevelEntityAccess().getAlternatives()); 
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:132:1: ( rule__TopLevelEntity__Alternatives )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:132:2: rule__TopLevelEntity__Alternatives
            {
            pushFollow(FOLLOW_rule__TopLevelEntity__Alternatives_in_ruleTopLevelEntity215);
            rule__TopLevelEntity__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTopLevelEntityAccess().getAlternatives()); 

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
    // $ANTLR end "ruleTopLevelEntity"


    // $ANTLR start "entryRuleMainLevelEntity"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:144:1: entryRuleMainLevelEntity : ruleMainLevelEntity EOF ;
    public final void entryRuleMainLevelEntity() throws RecognitionException {
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:145:1: ( ruleMainLevelEntity EOF )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:146:1: ruleMainLevelEntity EOF
            {
             before(grammarAccess.getMainLevelEntityRule()); 
            pushFollow(FOLLOW_ruleMainLevelEntity_in_entryRuleMainLevelEntity242);
            ruleMainLevelEntity();

            state._fsp--;

             after(grammarAccess.getMainLevelEntityRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMainLevelEntity249); 

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
    // $ANTLR end "entryRuleMainLevelEntity"


    // $ANTLR start "ruleMainLevelEntity"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:153:1: ruleMainLevelEntity : ( ( rule__MainLevelEntity__Alternatives ) ) ;
    public final void ruleMainLevelEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:157:2: ( ( ( rule__MainLevelEntity__Alternatives ) ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:158:1: ( ( rule__MainLevelEntity__Alternatives ) )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:158:1: ( ( rule__MainLevelEntity__Alternatives ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:159:1: ( rule__MainLevelEntity__Alternatives )
            {
             before(grammarAccess.getMainLevelEntityAccess().getAlternatives()); 
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:160:1: ( rule__MainLevelEntity__Alternatives )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:160:2: rule__MainLevelEntity__Alternatives
            {
            pushFollow(FOLLOW_rule__MainLevelEntity__Alternatives_in_ruleMainLevelEntity275);
            rule__MainLevelEntity__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMainLevelEntityAccess().getAlternatives()); 

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
    // $ANTLR end "ruleMainLevelEntity"


    // $ANTLR start "entryRuleTypeDefinition"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:172:1: entryRuleTypeDefinition : ruleTypeDefinition EOF ;
    public final void entryRuleTypeDefinition() throws RecognitionException {
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:173:1: ( ruleTypeDefinition EOF )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:174:1: ruleTypeDefinition EOF
            {
             before(grammarAccess.getTypeDefinitionRule()); 
            pushFollow(FOLLOW_ruleTypeDefinition_in_entryRuleTypeDefinition302);
            ruleTypeDefinition();

            state._fsp--;

             after(grammarAccess.getTypeDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeDefinition309); 

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
    // $ANTLR end "entryRuleTypeDefinition"


    // $ANTLR start "ruleTypeDefinition"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:181:1: ruleTypeDefinition : ( ( rule__TypeDefinition__Group__0 ) ) ;
    public final void ruleTypeDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:185:2: ( ( ( rule__TypeDefinition__Group__0 ) ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:186:1: ( ( rule__TypeDefinition__Group__0 ) )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:186:1: ( ( rule__TypeDefinition__Group__0 ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:187:1: ( rule__TypeDefinition__Group__0 )
            {
             before(grammarAccess.getTypeDefinitionAccess().getGroup()); 
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:188:1: ( rule__TypeDefinition__Group__0 )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:188:2: rule__TypeDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__TypeDefinition__Group__0_in_ruleTypeDefinition335);
            rule__TypeDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTypeDefinitionAccess().getGroup()); 

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
    // $ANTLR end "ruleTypeDefinition"


    // $ANTLR start "entryRuleFunctionDefinition"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:200:1: entryRuleFunctionDefinition : ruleFunctionDefinition EOF ;
    public final void entryRuleFunctionDefinition() throws RecognitionException {
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:201:1: ( ruleFunctionDefinition EOF )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:202:1: ruleFunctionDefinition EOF
            {
             before(grammarAccess.getFunctionDefinitionRule()); 
            pushFollow(FOLLOW_ruleFunctionDefinition_in_entryRuleFunctionDefinition362);
            ruleFunctionDefinition();

            state._fsp--;

             after(grammarAccess.getFunctionDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionDefinition369); 

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
    // $ANTLR end "entryRuleFunctionDefinition"


    // $ANTLR start "ruleFunctionDefinition"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:209:1: ruleFunctionDefinition : ( ( rule__FunctionDefinition__Alternatives ) ) ;
    public final void ruleFunctionDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:213:2: ( ( ( rule__FunctionDefinition__Alternatives ) ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:214:1: ( ( rule__FunctionDefinition__Alternatives ) )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:214:1: ( ( rule__FunctionDefinition__Alternatives ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:215:1: ( rule__FunctionDefinition__Alternatives )
            {
             before(grammarAccess.getFunctionDefinitionAccess().getAlternatives()); 
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:216:1: ( rule__FunctionDefinition__Alternatives )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:216:2: rule__FunctionDefinition__Alternatives
            {
            pushFollow(FOLLOW_rule__FunctionDefinition__Alternatives_in_ruleFunctionDefinition395);
            rule__FunctionDefinition__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFunctionDefinitionAccess().getAlternatives()); 

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
    // $ANTLR end "ruleFunctionDefinition"


    // $ANTLR start "entryRuleTypeUse"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:230:1: entryRuleTypeUse : ruleTypeUse EOF ;
    public final void entryRuleTypeUse() throws RecognitionException {
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:231:1: ( ruleTypeUse EOF )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:232:1: ruleTypeUse EOF
            {
             before(grammarAccess.getTypeUseRule()); 
            pushFollow(FOLLOW_ruleTypeUse_in_entryRuleTypeUse424);
            ruleTypeUse();

            state._fsp--;

             after(grammarAccess.getTypeUseRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeUse431); 

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
    // $ANTLR end "entryRuleTypeUse"


    // $ANTLR start "ruleTypeUse"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:239:1: ruleTypeUse : ( ( rule__TypeUse__Alternatives ) ) ;
    public final void ruleTypeUse() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:243:2: ( ( ( rule__TypeUse__Alternatives ) ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:244:1: ( ( rule__TypeUse__Alternatives ) )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:244:1: ( ( rule__TypeUse__Alternatives ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:245:1: ( rule__TypeUse__Alternatives )
            {
             before(grammarAccess.getTypeUseAccess().getAlternatives()); 
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:246:1: ( rule__TypeUse__Alternatives )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:246:2: rule__TypeUse__Alternatives
            {
            pushFollow(FOLLOW_rule__TypeUse__Alternatives_in_ruleTypeUse457);
            rule__TypeUse__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeUseAccess().getAlternatives()); 

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
    // $ANTLR end "ruleTypeUse"


    // $ANTLR start "entryRuleAddressUse"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:258:1: entryRuleAddressUse : ruleAddressUse EOF ;
    public final void entryRuleAddressUse() throws RecognitionException {
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:259:1: ( ruleAddressUse EOF )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:260:1: ruleAddressUse EOF
            {
             before(grammarAccess.getAddressUseRule()); 
            pushFollow(FOLLOW_ruleAddressUse_in_entryRuleAddressUse484);
            ruleAddressUse();

            state._fsp--;

             after(grammarAccess.getAddressUseRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAddressUse491); 

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
    // $ANTLR end "entryRuleAddressUse"


    // $ANTLR start "ruleAddressUse"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:267:1: ruleAddressUse : ( ( rule__AddressUse__Group__0 ) ) ;
    public final void ruleAddressUse() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:271:2: ( ( ( rule__AddressUse__Group__0 ) ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:272:1: ( ( rule__AddressUse__Group__0 ) )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:272:1: ( ( rule__AddressUse__Group__0 ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:273:1: ( rule__AddressUse__Group__0 )
            {
             before(grammarAccess.getAddressUseAccess().getGroup()); 
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:274:1: ( rule__AddressUse__Group__0 )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:274:2: rule__AddressUse__Group__0
            {
            pushFollow(FOLLOW_rule__AddressUse__Group__0_in_ruleAddressUse517);
            rule__AddressUse__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAddressUseAccess().getGroup()); 

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
    // $ANTLR end "ruleAddressUse"


    // $ANTLR start "entryRuleAddress"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:286:1: entryRuleAddress : ruleAddress EOF ;
    public final void entryRuleAddress() throws RecognitionException {
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:287:1: ( ruleAddress EOF )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:288:1: ruleAddress EOF
            {
             before(grammarAccess.getAddressRule()); 
            pushFollow(FOLLOW_ruleAddress_in_entryRuleAddress544);
            ruleAddress();

            state._fsp--;

             after(grammarAccess.getAddressRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAddress551); 

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
    // $ANTLR end "entryRuleAddress"


    // $ANTLR start "ruleAddress"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:295:1: ruleAddress : ( ( rule__Address__NameAssignment ) ) ;
    public final void ruleAddress() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:299:2: ( ( ( rule__Address__NameAssignment ) ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:300:1: ( ( rule__Address__NameAssignment ) )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:300:1: ( ( rule__Address__NameAssignment ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:301:1: ( rule__Address__NameAssignment )
            {
             before(grammarAccess.getAddressAccess().getNameAssignment()); 
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:302:1: ( rule__Address__NameAssignment )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:302:2: rule__Address__NameAssignment
            {
            pushFollow(FOLLOW_rule__Address__NameAssignment_in_ruleAddress577);
            rule__Address__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getAddressAccess().getNameAssignment()); 

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
    // $ANTLR end "ruleAddress"


    // $ANTLR start "entryRulePredefined"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:314:1: entryRulePredefined : rulePredefined EOF ;
    public final void entryRulePredefined() throws RecognitionException {
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:315:1: ( rulePredefined EOF )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:316:1: rulePredefined EOF
            {
             before(grammarAccess.getPredefinedRule()); 
            pushFollow(FOLLOW_rulePredefined_in_entryRulePredefined604);
            rulePredefined();

            state._fsp--;

             after(grammarAccess.getPredefinedRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePredefined611); 

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
    // $ANTLR end "entryRulePredefined"


    // $ANTLR start "rulePredefined"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:323:1: rulePredefined : ( ( rule__Predefined__Group__0 ) ) ;
    public final void rulePredefined() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:327:2: ( ( ( rule__Predefined__Group__0 ) ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:328:1: ( ( rule__Predefined__Group__0 ) )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:328:1: ( ( rule__Predefined__Group__0 ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:329:1: ( rule__Predefined__Group__0 )
            {
             before(grammarAccess.getPredefinedAccess().getGroup()); 
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:330:1: ( rule__Predefined__Group__0 )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:330:2: rule__Predefined__Group__0
            {
            pushFollow(FOLLOW_rule__Predefined__Group__0_in_rulePredefined637);
            rule__Predefined__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPredefinedAccess().getGroup()); 

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
    // $ANTLR end "rulePredefined"


    // $ANTLR start "entryRulePrimitive_Type"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:342:1: entryRulePrimitive_Type : rulePrimitive_Type EOF ;
    public final void entryRulePrimitive_Type() throws RecognitionException {
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:343:1: ( rulePrimitive_Type EOF )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:344:1: rulePrimitive_Type EOF
            {
             before(grammarAccess.getPrimitive_TypeRule()); 
            pushFollow(FOLLOW_rulePrimitive_Type_in_entryRulePrimitive_Type664);
            rulePrimitive_Type();

            state._fsp--;

             after(grammarAccess.getPrimitive_TypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitive_Type671); 

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
    // $ANTLR end "entryRulePrimitive_Type"


    // $ANTLR start "rulePrimitive_Type"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:351:1: rulePrimitive_Type : ( ( rule__Primitive_Type__Alternatives ) ) ;
    public final void rulePrimitive_Type() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:355:2: ( ( ( rule__Primitive_Type__Alternatives ) ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:356:1: ( ( rule__Primitive_Type__Alternatives ) )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:356:1: ( ( rule__Primitive_Type__Alternatives ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:357:1: ( rule__Primitive_Type__Alternatives )
            {
             before(grammarAccess.getPrimitive_TypeAccess().getAlternatives()); 
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:358:1: ( rule__Primitive_Type__Alternatives )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:358:2: rule__Primitive_Type__Alternatives
            {
            pushFollow(FOLLOW_rule__Primitive_Type__Alternatives_in_rulePrimitive_Type697);
            rule__Primitive_Type__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrimitive_TypeAccess().getAlternatives()); 

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
    // $ANTLR end "rulePrimitive_Type"


    // $ANTLR start "entryRuleFloatingPoint_Type"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:370:1: entryRuleFloatingPoint_Type : ruleFloatingPoint_Type EOF ;
    public final void entryRuleFloatingPoint_Type() throws RecognitionException {
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:371:1: ( ruleFloatingPoint_Type EOF )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:372:1: ruleFloatingPoint_Type EOF
            {
             before(grammarAccess.getFloatingPoint_TypeRule()); 
            pushFollow(FOLLOW_ruleFloatingPoint_Type_in_entryRuleFloatingPoint_Type724);
            ruleFloatingPoint_Type();

            state._fsp--;

             after(grammarAccess.getFloatingPoint_TypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFloatingPoint_Type731); 

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
    // $ANTLR end "entryRuleFloatingPoint_Type"


    // $ANTLR start "ruleFloatingPoint_Type"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:379:1: ruleFloatingPoint_Type : ( ( rule__FloatingPoint_Type__Alternatives ) ) ;
    public final void ruleFloatingPoint_Type() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:383:2: ( ( ( rule__FloatingPoint_Type__Alternatives ) ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:384:1: ( ( rule__FloatingPoint_Type__Alternatives ) )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:384:1: ( ( rule__FloatingPoint_Type__Alternatives ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:385:1: ( rule__FloatingPoint_Type__Alternatives )
            {
             before(grammarAccess.getFloatingPoint_TypeAccess().getAlternatives()); 
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:386:1: ( rule__FloatingPoint_Type__Alternatives )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:386:2: rule__FloatingPoint_Type__Alternatives
            {
            pushFollow(FOLLOW_rule__FloatingPoint_Type__Alternatives_in_ruleFloatingPoint_Type757);
            rule__FloatingPoint_Type__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFloatingPoint_TypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleFloatingPoint_Type"


    // $ANTLR start "entryRulePredefined_Types"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:398:1: entryRulePredefined_Types : rulePredefined_Types EOF ;
    public final void entryRulePredefined_Types() throws RecognitionException {
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:399:1: ( rulePredefined_Types EOF )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:400:1: rulePredefined_Types EOF
            {
             before(grammarAccess.getPredefined_TypesRule()); 
            pushFollow(FOLLOW_rulePredefined_Types_in_entryRulePredefined_Types784);
            rulePredefined_Types();

            state._fsp--;

             after(grammarAccess.getPredefined_TypesRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePredefined_Types791); 

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
    // $ANTLR end "entryRulePredefined_Types"


    // $ANTLR start "rulePredefined_Types"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:407:1: rulePredefined_Types : ( ( rule__Predefined_Types__Alternatives ) ) ;
    public final void rulePredefined_Types() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:411:2: ( ( ( rule__Predefined_Types__Alternatives ) ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:412:1: ( ( rule__Predefined_Types__Alternatives ) )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:412:1: ( ( rule__Predefined_Types__Alternatives ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:413:1: ( rule__Predefined_Types__Alternatives )
            {
             before(grammarAccess.getPredefined_TypesAccess().getAlternatives()); 
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:414:1: ( rule__Predefined_Types__Alternatives )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:414:2: rule__Predefined_Types__Alternatives
            {
            pushFollow(FOLLOW_rule__Predefined_Types__Alternatives_in_rulePredefined_Types817);
            rule__Predefined_Types__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPredefined_TypesAccess().getAlternatives()); 

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
    // $ANTLR end "rulePredefined_Types"


    // $ANTLR start "entryRuleVector"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:426:1: entryRuleVector : ruleVector EOF ;
    public final void entryRuleVector() throws RecognitionException {
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:427:1: ( ruleVector EOF )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:428:1: ruleVector EOF
            {
             before(grammarAccess.getVectorRule()); 
            pushFollow(FOLLOW_ruleVector_in_entryRuleVector844);
            ruleVector();

            state._fsp--;

             after(grammarAccess.getVectorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVector851); 

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
    // $ANTLR end "entryRuleVector"


    // $ANTLR start "ruleVector"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:435:1: ruleVector : ( ( rule__Vector__Group__0 ) ) ;
    public final void ruleVector() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:439:2: ( ( ( rule__Vector__Group__0 ) ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:440:1: ( ( rule__Vector__Group__0 ) )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:440:1: ( ( rule__Vector__Group__0 ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:441:1: ( rule__Vector__Group__0 )
            {
             before(grammarAccess.getVectorAccess().getGroup()); 
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:442:1: ( rule__Vector__Group__0 )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:442:2: rule__Vector__Group__0
            {
            pushFollow(FOLLOW_rule__Vector__Group__0_in_ruleVector877);
            rule__Vector__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVectorAccess().getGroup()); 

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
    // $ANTLR end "ruleVector"


    // $ANTLR start "entryRuleArray"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:454:1: entryRuleArray : ruleArray EOF ;
    public final void entryRuleArray() throws RecognitionException {
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:455:1: ( ruleArray EOF )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:456:1: ruleArray EOF
            {
             before(grammarAccess.getArrayRule()); 
            pushFollow(FOLLOW_ruleArray_in_entryRuleArray904);
            ruleArray();

            state._fsp--;

             after(grammarAccess.getArrayRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArray911); 

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
    // $ANTLR end "entryRuleArray"


    // $ANTLR start "ruleArray"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:463:1: ruleArray : ( ( rule__Array__Group__0 ) ) ;
    public final void ruleArray() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:467:2: ( ( ( rule__Array__Group__0 ) ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:468:1: ( ( rule__Array__Group__0 ) )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:468:1: ( ( rule__Array__Group__0 ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:469:1: ( rule__Array__Group__0 )
            {
             before(grammarAccess.getArrayAccess().getGroup()); 
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:470:1: ( rule__Array__Group__0 )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:470:2: rule__Array__Group__0
            {
            pushFollow(FOLLOW_rule__Array__Group__0_in_ruleArray937);
            rule__Array__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getArrayAccess().getGroup()); 

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
    // $ANTLR end "ruleArray"


    // $ANTLR start "entryRuleConstant"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:486:1: entryRuleConstant : ruleConstant EOF ;
    public final void entryRuleConstant() throws RecognitionException {
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:487:1: ( ruleConstant EOF )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:488:1: ruleConstant EOF
            {
             before(grammarAccess.getConstantRule()); 
            pushFollow(FOLLOW_ruleConstant_in_entryRuleConstant968);
            ruleConstant();

            state._fsp--;

             after(grammarAccess.getConstantRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstant975); 

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
    // $ANTLR end "entryRuleConstant"


    // $ANTLR start "ruleConstant"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:495:1: ruleConstant : ( ( rule__Constant__ValueAssignment ) ) ;
    public final void ruleConstant() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:499:2: ( ( ( rule__Constant__ValueAssignment ) ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:500:1: ( ( rule__Constant__ValueAssignment ) )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:500:1: ( ( rule__Constant__ValueAssignment ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:501:1: ( rule__Constant__ValueAssignment )
            {
             before(grammarAccess.getConstantAccess().getValueAssignment()); 
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:502:1: ( rule__Constant__ValueAssignment )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:502:2: rule__Constant__ValueAssignment
            {
            pushFollow(FOLLOW_rule__Constant__ValueAssignment_in_ruleConstant1001);
            rule__Constant__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getConstantAccess().getValueAssignment()); 

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
    // $ANTLR end "ruleConstant"


    // $ANTLR start "entryRuleNonConstantValue"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:514:1: entryRuleNonConstantValue : ruleNonConstantValue EOF ;
    public final void entryRuleNonConstantValue() throws RecognitionException {
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:515:1: ( ruleNonConstantValue EOF )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:516:1: ruleNonConstantValue EOF
            {
             before(grammarAccess.getNonConstantValueRule()); 
            pushFollow(FOLLOW_ruleNonConstantValue_in_entryRuleNonConstantValue1028);
            ruleNonConstantValue();

            state._fsp--;

             after(grammarAccess.getNonConstantValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNonConstantValue1035); 

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
    // $ANTLR end "entryRuleNonConstantValue"


    // $ANTLR start "ruleNonConstantValue"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:523:1: ruleNonConstantValue : ( ( rule__NonConstantValue__Group__0 ) ) ;
    public final void ruleNonConstantValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:527:2: ( ( ( rule__NonConstantValue__Group__0 ) ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:528:1: ( ( rule__NonConstantValue__Group__0 ) )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:528:1: ( ( rule__NonConstantValue__Group__0 ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:529:1: ( rule__NonConstantValue__Group__0 )
            {
             before(grammarAccess.getNonConstantValueAccess().getGroup()); 
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:530:1: ( rule__NonConstantValue__Group__0 )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:530:2: rule__NonConstantValue__Group__0
            {
            pushFollow(FOLLOW_rule__NonConstantValue__Group__0_in_ruleNonConstantValue1061);
            rule__NonConstantValue__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNonConstantValueAccess().getGroup()); 

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
    // $ANTLR end "ruleNonConstantValue"


    // $ANTLR start "entryRuleValue"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:542:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:543:1: ( ruleValue EOF )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:544:1: ruleValue EOF
            {
             before(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue1088);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue1095); 

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
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:551:1: ruleValue : ( ( rule__Value__Alternatives ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:555:2: ( ( ( rule__Value__Alternatives ) ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:556:1: ( ( rule__Value__Alternatives ) )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:556:1: ( ( rule__Value__Alternatives ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:557:1: ( rule__Value__Alternatives )
            {
             before(grammarAccess.getValueAccess().getAlternatives()); 
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:558:1: ( rule__Value__Alternatives )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:558:2: rule__Value__Alternatives
            {
            pushFollow(FOLLOW_rule__Value__Alternatives_in_ruleValue1121);
            rule__Value__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getValueAccess().getAlternatives()); 

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
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleStructure"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:570:1: entryRuleStructure : ruleStructure EOF ;
    public final void entryRuleStructure() throws RecognitionException {
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:571:1: ( ruleStructure EOF )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:572:1: ruleStructure EOF
            {
             before(grammarAccess.getStructureRule()); 
            pushFollow(FOLLOW_ruleStructure_in_entryRuleStructure1148);
            ruleStructure();

            state._fsp--;

             after(grammarAccess.getStructureRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStructure1155); 

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
    // $ANTLR end "entryRuleStructure"


    // $ANTLR start "ruleStructure"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:579:1: ruleStructure : ( ( rule__Structure__Group__0 ) ) ;
    public final void ruleStructure() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:583:2: ( ( ( rule__Structure__Group__0 ) ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:584:1: ( ( rule__Structure__Group__0 ) )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:584:1: ( ( rule__Structure__Group__0 ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:585:1: ( rule__Structure__Group__0 )
            {
             before(grammarAccess.getStructureAccess().getGroup()); 
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:586:1: ( rule__Structure__Group__0 )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:586:2: rule__Structure__Group__0
            {
            pushFollow(FOLLOW_rule__Structure__Group__0_in_ruleStructure1181);
            rule__Structure__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStructureAccess().getGroup()); 

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
    // $ANTLR end "ruleStructure"


    // $ANTLR start "entryRuleOpaque"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:598:1: entryRuleOpaque : ruleOpaque EOF ;
    public final void entryRuleOpaque() throws RecognitionException {
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:599:1: ( ruleOpaque EOF )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:600:1: ruleOpaque EOF
            {
             before(grammarAccess.getOpaqueRule()); 
            pushFollow(FOLLOW_ruleOpaque_in_entryRuleOpaque1208);
            ruleOpaque();

            state._fsp--;

             after(grammarAccess.getOpaqueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpaque1215); 

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
    // $ANTLR end "entryRuleOpaque"


    // $ANTLR start "ruleOpaque"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:607:1: ruleOpaque : ( 'opaque' ) ;
    public final void ruleOpaque() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:611:2: ( ( 'opaque' ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:612:1: ( 'opaque' )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:612:1: ( 'opaque' )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:613:1: 'opaque'
            {
             before(grammarAccess.getOpaqueAccess().getOpaqueKeyword()); 
            match(input,18,FOLLOW_18_in_ruleOpaque1242); 
             after(grammarAccess.getOpaqueAccess().getOpaqueKeyword()); 

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
    // $ANTLR end "ruleOpaque"


    // $ANTLR start "entryRuleParameterList"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:628:1: entryRuleParameterList : ruleParameterList EOF ;
    public final void entryRuleParameterList() throws RecognitionException {
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:629:1: ( ruleParameterList EOF )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:630:1: ruleParameterList EOF
            {
             before(grammarAccess.getParameterListRule()); 
            pushFollow(FOLLOW_ruleParameterList_in_entryRuleParameterList1270);
            ruleParameterList();

            state._fsp--;

             after(grammarAccess.getParameterListRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterList1277); 

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
    // $ANTLR end "entryRuleParameterList"


    // $ANTLR start "ruleParameterList"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:637:1: ruleParameterList : ( ( rule__ParameterList__Group__0 ) ) ;
    public final void ruleParameterList() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:641:2: ( ( ( rule__ParameterList__Group__0 ) ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:642:1: ( ( rule__ParameterList__Group__0 ) )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:642:1: ( ( rule__ParameterList__Group__0 ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:643:1: ( rule__ParameterList__Group__0 )
            {
             before(grammarAccess.getParameterListAccess().getGroup()); 
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:644:1: ( rule__ParameterList__Group__0 )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:644:2: rule__ParameterList__Group__0
            {
            pushFollow(FOLLOW_rule__ParameterList__Group__0_in_ruleParameterList1303);
            rule__ParameterList__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterListAccess().getGroup()); 

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
    // $ANTLR end "ruleParameterList"


    // $ANTLR start "entryRuleFunctionBody"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:656:1: entryRuleFunctionBody : ruleFunctionBody EOF ;
    public final void entryRuleFunctionBody() throws RecognitionException {
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:657:1: ( ruleFunctionBody EOF )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:658:1: ruleFunctionBody EOF
            {
             before(grammarAccess.getFunctionBodyRule()); 
            pushFollow(FOLLOW_ruleFunctionBody_in_entryRuleFunctionBody1330);
            ruleFunctionBody();

            state._fsp--;

             after(grammarAccess.getFunctionBodyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionBody1337); 

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
    // $ANTLR end "entryRuleFunctionBody"


    // $ANTLR start "ruleFunctionBody"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:665:1: ruleFunctionBody : ( ( rule__FunctionBody__Group__0 ) ) ;
    public final void ruleFunctionBody() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:669:2: ( ( ( rule__FunctionBody__Group__0 ) ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:670:1: ( ( rule__FunctionBody__Group__0 ) )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:670:1: ( ( rule__FunctionBody__Group__0 ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:671:1: ( rule__FunctionBody__Group__0 )
            {
             before(grammarAccess.getFunctionBodyAccess().getGroup()); 
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:672:1: ( rule__FunctionBody__Group__0 )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:672:2: rule__FunctionBody__Group__0
            {
            pushFollow(FOLLOW_rule__FunctionBody__Group__0_in_ruleFunctionBody1363);
            rule__FunctionBody__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFunctionBodyAccess().getGroup()); 

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
    // $ANTLR end "ruleFunctionBody"


    // $ANTLR start "entryRuleBasicBlock"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:684:1: entryRuleBasicBlock : ruleBasicBlock EOF ;
    public final void entryRuleBasicBlock() throws RecognitionException {
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:685:1: ( ruleBasicBlock EOF )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:686:1: ruleBasicBlock EOF
            {
             before(grammarAccess.getBasicBlockRule()); 
            pushFollow(FOLLOW_ruleBasicBlock_in_entryRuleBasicBlock1390);
            ruleBasicBlock();

            state._fsp--;

             after(grammarAccess.getBasicBlockRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBasicBlock1397); 

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
    // $ANTLR end "entryRuleBasicBlock"


    // $ANTLR start "ruleBasicBlock"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:693:1: ruleBasicBlock : ( ( rule__BasicBlock__Group__0 ) ) ;
    public final void ruleBasicBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:697:2: ( ( ( rule__BasicBlock__Group__0 ) ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:698:1: ( ( rule__BasicBlock__Group__0 ) )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:698:1: ( ( rule__BasicBlock__Group__0 ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:699:1: ( rule__BasicBlock__Group__0 )
            {
             before(grammarAccess.getBasicBlockAccess().getGroup()); 
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:700:1: ( rule__BasicBlock__Group__0 )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:700:2: rule__BasicBlock__Group__0
            {
            pushFollow(FOLLOW_rule__BasicBlock__Group__0_in_ruleBasicBlock1423);
            rule__BasicBlock__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBasicBlockAccess().getGroup()); 

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
    // $ANTLR end "ruleBasicBlock"


    // $ANTLR start "entryRuleTypeList"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:712:1: entryRuleTypeList : ruleTypeList EOF ;
    public final void entryRuleTypeList() throws RecognitionException {
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:713:1: ( ruleTypeList EOF )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:714:1: ruleTypeList EOF
            {
             before(grammarAccess.getTypeListRule()); 
            pushFollow(FOLLOW_ruleTypeList_in_entryRuleTypeList1450);
            ruleTypeList();

            state._fsp--;

             after(grammarAccess.getTypeListRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeList1457); 

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
    // $ANTLR end "entryRuleTypeList"


    // $ANTLR start "ruleTypeList"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:721:1: ruleTypeList : ( ( rule__TypeList__Group__0 ) ) ;
    public final void ruleTypeList() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:725:2: ( ( ( rule__TypeList__Group__0 ) ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:726:1: ( ( rule__TypeList__Group__0 ) )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:726:1: ( ( rule__TypeList__Group__0 ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:727:1: ( rule__TypeList__Group__0 )
            {
             before(grammarAccess.getTypeListAccess().getGroup()); 
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:728:1: ( rule__TypeList__Group__0 )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:728:2: rule__TypeList__Group__0
            {
            pushFollow(FOLLOW_rule__TypeList__Group__0_in_ruleTypeList1483);
            rule__TypeList__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTypeListAccess().getGroup()); 

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
    // $ANTLR end "ruleTypeList"


    // $ANTLR start "entryRuleRETURN_ATTRIBUTES"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:740:1: entryRuleRETURN_ATTRIBUTES : ruleRETURN_ATTRIBUTES EOF ;
    public final void entryRuleRETURN_ATTRIBUTES() throws RecognitionException {
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:741:1: ( ruleRETURN_ATTRIBUTES EOF )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:742:1: ruleRETURN_ATTRIBUTES EOF
            {
             before(grammarAccess.getRETURN_ATTRIBUTESRule()); 
            pushFollow(FOLLOW_ruleRETURN_ATTRIBUTES_in_entryRuleRETURN_ATTRIBUTES1510);
            ruleRETURN_ATTRIBUTES();

            state._fsp--;

             after(grammarAccess.getRETURN_ATTRIBUTESRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRETURN_ATTRIBUTES1517); 

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
    // $ANTLR end "entryRuleRETURN_ATTRIBUTES"


    // $ANTLR start "ruleRETURN_ATTRIBUTES"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:749:1: ruleRETURN_ATTRIBUTES : ( ( rule__RETURN_ATTRIBUTES__Alternatives ) ) ;
    public final void ruleRETURN_ATTRIBUTES() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:753:2: ( ( ( rule__RETURN_ATTRIBUTES__Alternatives ) ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:754:1: ( ( rule__RETURN_ATTRIBUTES__Alternatives ) )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:754:1: ( ( rule__RETURN_ATTRIBUTES__Alternatives ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:755:1: ( rule__RETURN_ATTRIBUTES__Alternatives )
            {
             before(grammarAccess.getRETURN_ATTRIBUTESAccess().getAlternatives()); 
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:756:1: ( rule__RETURN_ATTRIBUTES__Alternatives )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:756:2: rule__RETURN_ATTRIBUTES__Alternatives
            {
            pushFollow(FOLLOW_rule__RETURN_ATTRIBUTES__Alternatives_in_ruleRETURN_ATTRIBUTES1543);
            rule__RETURN_ATTRIBUTES__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRETURN_ATTRIBUTESAccess().getAlternatives()); 

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
    // $ANTLR end "ruleRETURN_ATTRIBUTES"


    // $ANTLR start "entryRuleCallingConv"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:768:1: entryRuleCallingConv : ruleCallingConv EOF ;
    public final void entryRuleCallingConv() throws RecognitionException {
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:769:1: ( ruleCallingConv EOF )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:770:1: ruleCallingConv EOF
            {
             before(grammarAccess.getCallingConvRule()); 
            pushFollow(FOLLOW_ruleCallingConv_in_entryRuleCallingConv1570);
            ruleCallingConv();

            state._fsp--;

             after(grammarAccess.getCallingConvRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCallingConv1577); 

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
    // $ANTLR end "entryRuleCallingConv"


    // $ANTLR start "ruleCallingConv"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:777:1: ruleCallingConv : ( ( rule__CallingConv__Alternatives ) ) ;
    public final void ruleCallingConv() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:781:2: ( ( ( rule__CallingConv__Alternatives ) ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:782:1: ( ( rule__CallingConv__Alternatives ) )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:782:1: ( ( rule__CallingConv__Alternatives ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:783:1: ( rule__CallingConv__Alternatives )
            {
             before(grammarAccess.getCallingConvAccess().getAlternatives()); 
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:784:1: ( rule__CallingConv__Alternatives )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:784:2: rule__CallingConv__Alternatives
            {
            pushFollow(FOLLOW_rule__CallingConv__Alternatives_in_ruleCallingConv1603);
            rule__CallingConv__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCallingConvAccess().getAlternatives()); 

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
    // $ANTLR end "ruleCallingConv"


    // $ANTLR start "entryRuleFUNCTION_ATTRIBUTES"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:796:1: entryRuleFUNCTION_ATTRIBUTES : ruleFUNCTION_ATTRIBUTES EOF ;
    public final void entryRuleFUNCTION_ATTRIBUTES() throws RecognitionException {
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:797:1: ( ruleFUNCTION_ATTRIBUTES EOF )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:798:1: ruleFUNCTION_ATTRIBUTES EOF
            {
             before(grammarAccess.getFUNCTION_ATTRIBUTESRule()); 
            pushFollow(FOLLOW_ruleFUNCTION_ATTRIBUTES_in_entryRuleFUNCTION_ATTRIBUTES1630);
            ruleFUNCTION_ATTRIBUTES();

            state._fsp--;

             after(grammarAccess.getFUNCTION_ATTRIBUTESRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFUNCTION_ATTRIBUTES1637); 

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
    // $ANTLR end "entryRuleFUNCTION_ATTRIBUTES"


    // $ANTLR start "ruleFUNCTION_ATTRIBUTES"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:805:1: ruleFUNCTION_ATTRIBUTES : ( ( rule__FUNCTION_ATTRIBUTES__Alternatives ) ) ;
    public final void ruleFUNCTION_ATTRIBUTES() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:809:2: ( ( ( rule__FUNCTION_ATTRIBUTES__Alternatives ) ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:810:1: ( ( rule__FUNCTION_ATTRIBUTES__Alternatives ) )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:810:1: ( ( rule__FUNCTION_ATTRIBUTES__Alternatives ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:811:1: ( rule__FUNCTION_ATTRIBUTES__Alternatives )
            {
             before(grammarAccess.getFUNCTION_ATTRIBUTESAccess().getAlternatives()); 
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:812:1: ( rule__FUNCTION_ATTRIBUTES__Alternatives )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:812:2: rule__FUNCTION_ATTRIBUTES__Alternatives
            {
            pushFollow(FOLLOW_rule__FUNCTION_ATTRIBUTES__Alternatives_in_ruleFUNCTION_ATTRIBUTES1663);
            rule__FUNCTION_ATTRIBUTES__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFUNCTION_ATTRIBUTESAccess().getAlternatives()); 

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
    // $ANTLR end "ruleFUNCTION_ATTRIBUTES"


    // $ANTLR start "entryRuleVISIBILITY"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:824:1: entryRuleVISIBILITY : ruleVISIBILITY EOF ;
    public final void entryRuleVISIBILITY() throws RecognitionException {
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:825:1: ( ruleVISIBILITY EOF )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:826:1: ruleVISIBILITY EOF
            {
             before(grammarAccess.getVISIBILITYRule()); 
            pushFollow(FOLLOW_ruleVISIBILITY_in_entryRuleVISIBILITY1690);
            ruleVISIBILITY();

            state._fsp--;

             after(grammarAccess.getVISIBILITYRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVISIBILITY1697); 

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
    // $ANTLR end "entryRuleVISIBILITY"


    // $ANTLR start "ruleVISIBILITY"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:833:1: ruleVISIBILITY : ( ( rule__VISIBILITY__Alternatives ) ) ;
    public final void ruleVISIBILITY() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:837:2: ( ( ( rule__VISIBILITY__Alternatives ) ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:838:1: ( ( rule__VISIBILITY__Alternatives ) )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:838:1: ( ( rule__VISIBILITY__Alternatives ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:839:1: ( rule__VISIBILITY__Alternatives )
            {
             before(grammarAccess.getVISIBILITYAccess().getAlternatives()); 
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:840:1: ( rule__VISIBILITY__Alternatives )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:840:2: rule__VISIBILITY__Alternatives
            {
            pushFollow(FOLLOW_rule__VISIBILITY__Alternatives_in_ruleVISIBILITY1723);
            rule__VISIBILITY__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getVISIBILITYAccess().getAlternatives()); 

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
    // $ANTLR end "ruleVISIBILITY"


    // $ANTLR start "entryRuleLINKAGE"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:852:1: entryRuleLINKAGE : ruleLINKAGE EOF ;
    public final void entryRuleLINKAGE() throws RecognitionException {
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:853:1: ( ruleLINKAGE EOF )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:854:1: ruleLINKAGE EOF
            {
             before(grammarAccess.getLINKAGERule()); 
            pushFollow(FOLLOW_ruleLINKAGE_in_entryRuleLINKAGE1750);
            ruleLINKAGE();

            state._fsp--;

             after(grammarAccess.getLINKAGERule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLINKAGE1757); 

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
    // $ANTLR end "entryRuleLINKAGE"


    // $ANTLR start "ruleLINKAGE"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:861:1: ruleLINKAGE : ( ( rule__LINKAGE__Alternatives ) ) ;
    public final void ruleLINKAGE() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:865:2: ( ( ( rule__LINKAGE__Alternatives ) ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:866:1: ( ( rule__LINKAGE__Alternatives ) )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:866:1: ( ( rule__LINKAGE__Alternatives ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:867:1: ( rule__LINKAGE__Alternatives )
            {
             before(grammarAccess.getLINKAGEAccess().getAlternatives()); 
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:868:1: ( rule__LINKAGE__Alternatives )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:868:2: rule__LINKAGE__Alternatives
            {
            pushFollow(FOLLOW_rule__LINKAGE__Alternatives_in_ruleLINKAGE1783);
            rule__LINKAGE__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLINKAGEAccess().getAlternatives()); 

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
    // $ANTLR end "ruleLINKAGE"


    // $ANTLR start "entryRuleALIAS_LINKAGE"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:880:1: entryRuleALIAS_LINKAGE : ruleALIAS_LINKAGE EOF ;
    public final void entryRuleALIAS_LINKAGE() throws RecognitionException {
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:881:1: ( ruleALIAS_LINKAGE EOF )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:882:1: ruleALIAS_LINKAGE EOF
            {
             before(grammarAccess.getALIAS_LINKAGERule()); 
            pushFollow(FOLLOW_ruleALIAS_LINKAGE_in_entryRuleALIAS_LINKAGE1810);
            ruleALIAS_LINKAGE();

            state._fsp--;

             after(grammarAccess.getALIAS_LINKAGERule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleALIAS_LINKAGE1817); 

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
    // $ANTLR end "entryRuleALIAS_LINKAGE"


    // $ANTLR start "ruleALIAS_LINKAGE"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:889:1: ruleALIAS_LINKAGE : ( ( rule__ALIAS_LINKAGE__Alternatives ) ) ;
    public final void ruleALIAS_LINKAGE() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:893:2: ( ( ( rule__ALIAS_LINKAGE__Alternatives ) ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:894:1: ( ( rule__ALIAS_LINKAGE__Alternatives ) )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:894:1: ( ( rule__ALIAS_LINKAGE__Alternatives ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:895:1: ( rule__ALIAS_LINKAGE__Alternatives )
            {
             before(grammarAccess.getALIAS_LINKAGEAccess().getAlternatives()); 
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:896:1: ( rule__ALIAS_LINKAGE__Alternatives )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:896:2: rule__ALIAS_LINKAGE__Alternatives
            {
            pushFollow(FOLLOW_rule__ALIAS_LINKAGE__Alternatives_in_ruleALIAS_LINKAGE1843);
            rule__ALIAS_LINKAGE__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getALIAS_LINKAGEAccess().getAlternatives()); 

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
    // $ANTLR end "ruleALIAS_LINKAGE"


    // $ANTLR start "entryRuleALIGNMENT"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:908:1: entryRuleALIGNMENT : ruleALIGNMENT EOF ;
    public final void entryRuleALIGNMENT() throws RecognitionException {
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:909:1: ( ruleALIGNMENT EOF )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:910:1: ruleALIGNMENT EOF
            {
             before(grammarAccess.getALIGNMENTRule()); 
            pushFollow(FOLLOW_ruleALIGNMENT_in_entryRuleALIGNMENT1870);
            ruleALIGNMENT();

            state._fsp--;

             after(grammarAccess.getALIGNMENTRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleALIGNMENT1877); 

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
    // $ANTLR end "entryRuleALIGNMENT"


    // $ANTLR start "ruleALIGNMENT"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:917:1: ruleALIGNMENT : ( ( rule__ALIGNMENT__Group__0 ) ) ;
    public final void ruleALIGNMENT() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:921:2: ( ( ( rule__ALIGNMENT__Group__0 ) ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:922:1: ( ( rule__ALIGNMENT__Group__0 ) )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:922:1: ( ( rule__ALIGNMENT__Group__0 ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:923:1: ( rule__ALIGNMENT__Group__0 )
            {
             before(grammarAccess.getALIGNMENTAccess().getGroup()); 
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:924:1: ( rule__ALIGNMENT__Group__0 )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:924:2: rule__ALIGNMENT__Group__0
            {
            pushFollow(FOLLOW_rule__ALIGNMENT__Group__0_in_ruleALIGNMENT1903);
            rule__ALIGNMENT__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getALIGNMENTAccess().getGroup()); 

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
    // $ANTLR end "ruleALIGNMENT"


    // $ANTLR start "rule__AbstractElement__Alternatives"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:936:1: rule__AbstractElement__Alternatives : ( ( ( rule__AbstractElement__Group_0__0 ) ) | ( ( rule__AbstractElement__Group_1__0 ) ) );
    public final void rule__AbstractElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:940:1: ( ( ( rule__AbstractElement__Group_0__0 ) ) | ( ( rule__AbstractElement__Group_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==101||LA2_0==103||LA2_0==105) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_VALID_ID||LA2_0==108||LA2_0==110) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:941:1: ( ( rule__AbstractElement__Group_0__0 ) )
                    {
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:941:1: ( ( rule__AbstractElement__Group_0__0 ) )
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:942:1: ( rule__AbstractElement__Group_0__0 )
                    {
                     before(grammarAccess.getAbstractElementAccess().getGroup_0()); 
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:943:1: ( rule__AbstractElement__Group_0__0 )
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:943:2: rule__AbstractElement__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__AbstractElement__Group_0__0_in_rule__AbstractElement__Alternatives1939);
                    rule__AbstractElement__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAbstractElementAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:947:6: ( ( rule__AbstractElement__Group_1__0 ) )
                    {
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:947:6: ( ( rule__AbstractElement__Group_1__0 ) )
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:948:1: ( rule__AbstractElement__Group_1__0 )
                    {
                     before(grammarAccess.getAbstractElementAccess().getGroup_1()); 
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:949:1: ( rule__AbstractElement__Group_1__0 )
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:949:2: rule__AbstractElement__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__AbstractElement__Group_1__0_in_rule__AbstractElement__Alternatives1957);
                    rule__AbstractElement__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAbstractElementAccess().getGroup_1()); 

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
    // $ANTLR end "rule__AbstractElement__Alternatives"


    // $ANTLR start "rule__TopLevelEntity__Alternatives"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:958:1: rule__TopLevelEntity__Alternatives : ( ( ( rule__TopLevelEntity__Group_0__0 ) ) | ( ( rule__TopLevelEntity__Group_1__0 ) ) | ( ( rule__TopLevelEntity__Group_2__0 ) ) );
    public final void rule__TopLevelEntity__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:962:1: ( ( ( rule__TopLevelEntity__Group_0__0 ) ) | ( ( rule__TopLevelEntity__Group_1__0 ) ) | ( ( rule__TopLevelEntity__Group_2__0 ) ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 101:
                {
                alt3=1;
                }
                break;
            case 103:
                {
                alt3=2;
                }
                break;
            case 105:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:963:1: ( ( rule__TopLevelEntity__Group_0__0 ) )
                    {
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:963:1: ( ( rule__TopLevelEntity__Group_0__0 ) )
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:964:1: ( rule__TopLevelEntity__Group_0__0 )
                    {
                     before(grammarAccess.getTopLevelEntityAccess().getGroup_0()); 
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:965:1: ( rule__TopLevelEntity__Group_0__0 )
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:965:2: rule__TopLevelEntity__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__TopLevelEntity__Group_0__0_in_rule__TopLevelEntity__Alternatives1990);
                    rule__TopLevelEntity__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTopLevelEntityAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:969:6: ( ( rule__TopLevelEntity__Group_1__0 ) )
                    {
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:969:6: ( ( rule__TopLevelEntity__Group_1__0 ) )
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:970:1: ( rule__TopLevelEntity__Group_1__0 )
                    {
                     before(grammarAccess.getTopLevelEntityAccess().getGroup_1()); 
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:971:1: ( rule__TopLevelEntity__Group_1__0 )
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:971:2: rule__TopLevelEntity__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__TopLevelEntity__Group_1__0_in_rule__TopLevelEntity__Alternatives2008);
                    rule__TopLevelEntity__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTopLevelEntityAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:975:6: ( ( rule__TopLevelEntity__Group_2__0 ) )
                    {
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:975:6: ( ( rule__TopLevelEntity__Group_2__0 ) )
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:976:1: ( rule__TopLevelEntity__Group_2__0 )
                    {
                     before(grammarAccess.getTopLevelEntityAccess().getGroup_2()); 
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:977:1: ( rule__TopLevelEntity__Group_2__0 )
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:977:2: rule__TopLevelEntity__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__TopLevelEntity__Group_2__0_in_rule__TopLevelEntity__Alternatives2026);
                    rule__TopLevelEntity__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTopLevelEntityAccess().getGroup_2()); 

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
    // $ANTLR end "rule__TopLevelEntity__Alternatives"


    // $ANTLR start "rule__TopLevelEntity__Alternatives_1_1"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:986:1: rule__TopLevelEntity__Alternatives_1_1 : ( ( 'datalayout' ) | ( 'triple' ) );
    public final void rule__TopLevelEntity__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:990:1: ( ( 'datalayout' ) | ( 'triple' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==19) ) {
                alt4=1;
            }
            else if ( (LA4_0==20) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:991:1: ( 'datalayout' )
                    {
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:991:1: ( 'datalayout' )
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:992:1: 'datalayout'
                    {
                     before(grammarAccess.getTopLevelEntityAccess().getDatalayoutKeyword_1_1_0()); 
                    match(input,19,FOLLOW_19_in_rule__TopLevelEntity__Alternatives_1_12060); 
                     after(grammarAccess.getTopLevelEntityAccess().getDatalayoutKeyword_1_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:999:6: ( 'triple' )
                    {
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:999:6: ( 'triple' )
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1000:1: 'triple'
                    {
                     before(grammarAccess.getTopLevelEntityAccess().getTripleKeyword_1_1_1()); 
                    match(input,20,FOLLOW_20_in_rule__TopLevelEntity__Alternatives_1_12080); 
                     after(grammarAccess.getTopLevelEntityAccess().getTripleKeyword_1_1_1()); 

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
    // $ANTLR end "rule__TopLevelEntity__Alternatives_1_1"


    // $ANTLR start "rule__MainLevelEntity__Alternatives"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1012:1: rule__MainLevelEntity__Alternatives : ( ( ruleTypeDefinition ) | ( ruleFunctionDefinition ) );
    public final void rule__MainLevelEntity__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1016:1: ( ( ruleTypeDefinition ) | ( ruleFunctionDefinition ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_VALID_ID) ) {
                alt5=1;
            }
            else if ( (LA5_0==108||LA5_0==110) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1017:1: ( ruleTypeDefinition )
                    {
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1017:1: ( ruleTypeDefinition )
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1018:1: ruleTypeDefinition
                    {
                     before(grammarAccess.getMainLevelEntityAccess().getTypeDefinitionParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleTypeDefinition_in_rule__MainLevelEntity__Alternatives2114);
                    ruleTypeDefinition();

                    state._fsp--;

                     after(grammarAccess.getMainLevelEntityAccess().getTypeDefinitionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1023:6: ( ruleFunctionDefinition )
                    {
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1023:6: ( ruleFunctionDefinition )
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1024:1: ruleFunctionDefinition
                    {
                     before(grammarAccess.getMainLevelEntityAccess().getFunctionDefinitionParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleFunctionDefinition_in_rule__MainLevelEntity__Alternatives2131);
                    ruleFunctionDefinition();

                    state._fsp--;

                     after(grammarAccess.getMainLevelEntityAccess().getFunctionDefinitionParserRuleCall_1()); 

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
    // $ANTLR end "rule__MainLevelEntity__Alternatives"


    // $ANTLR start "rule__TypeDefinition__Alternatives_2"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1034:1: rule__TypeDefinition__Alternatives_2 : ( ( ruleLINKAGE ) | ( 'global' ) | ( 'unnamed_addr' ) | ( 'constant' ) );
    public final void rule__TypeDefinition__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1038:1: ( ( ruleLINKAGE ) | ( 'global' ) | ( 'unnamed_addr' ) | ( 'constant' ) )
            int alt6=4;
            switch ( input.LA(1) ) {
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
            case 92:
            case 93:
            case 94:
            case 95:
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
                {
                alt6=1;
                }
                break;
            case 21:
                {
                alt6=2;
                }
                break;
            case 22:
                {
                alt6=3;
                }
                break;
            case 23:
                {
                alt6=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1039:1: ( ruleLINKAGE )
                    {
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1039:1: ( ruleLINKAGE )
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1040:1: ruleLINKAGE
                    {
                     before(grammarAccess.getTypeDefinitionAccess().getLINKAGEParserRuleCall_2_0()); 
                    pushFollow(FOLLOW_ruleLINKAGE_in_rule__TypeDefinition__Alternatives_22163);
                    ruleLINKAGE();

                    state._fsp--;

                     after(grammarAccess.getTypeDefinitionAccess().getLINKAGEParserRuleCall_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1045:6: ( 'global' )
                    {
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1045:6: ( 'global' )
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1046:1: 'global'
                    {
                     before(grammarAccess.getTypeDefinitionAccess().getGlobalKeyword_2_1()); 
                    match(input,21,FOLLOW_21_in_rule__TypeDefinition__Alternatives_22181); 
                     after(grammarAccess.getTypeDefinitionAccess().getGlobalKeyword_2_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1053:6: ( 'unnamed_addr' )
                    {
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1053:6: ( 'unnamed_addr' )
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1054:1: 'unnamed_addr'
                    {
                     before(grammarAccess.getTypeDefinitionAccess().getUnnamed_addrKeyword_2_2()); 
                    match(input,22,FOLLOW_22_in_rule__TypeDefinition__Alternatives_22201); 
                     after(grammarAccess.getTypeDefinitionAccess().getUnnamed_addrKeyword_2_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1061:6: ( 'constant' )
                    {
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1061:6: ( 'constant' )
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1062:1: 'constant'
                    {
                     before(grammarAccess.getTypeDefinitionAccess().getConstantKeyword_2_3()); 
                    match(input,23,FOLLOW_23_in_rule__TypeDefinition__Alternatives_22221); 
                     after(grammarAccess.getTypeDefinitionAccess().getConstantKeyword_2_3()); 

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
    // $ANTLR end "rule__TypeDefinition__Alternatives_2"


    // $ANTLR start "rule__TypeDefinition__Alternatives_3_1"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1074:1: rule__TypeDefinition__Alternatives_3_1 : ( ( ( rule__TypeDefinition__StructAssignment_3_1_0 ) ) | ( ruleOpaque ) );
    public final void rule__TypeDefinition__Alternatives_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1078:1: ( ( ( rule__TypeDefinition__StructAssignment_3_1_0 ) ) | ( ruleOpaque ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==114) ) {
                alt7=1;
            }
            else if ( (LA7_0==18) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1079:1: ( ( rule__TypeDefinition__StructAssignment_3_1_0 ) )
                    {
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1079:1: ( ( rule__TypeDefinition__StructAssignment_3_1_0 ) )
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1080:1: ( rule__TypeDefinition__StructAssignment_3_1_0 )
                    {
                     before(grammarAccess.getTypeDefinitionAccess().getStructAssignment_3_1_0()); 
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1081:1: ( rule__TypeDefinition__StructAssignment_3_1_0 )
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1081:2: rule__TypeDefinition__StructAssignment_3_1_0
                    {
                    pushFollow(FOLLOW_rule__TypeDefinition__StructAssignment_3_1_0_in_rule__TypeDefinition__Alternatives_3_12255);
                    rule__TypeDefinition__StructAssignment_3_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeDefinitionAccess().getStructAssignment_3_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1085:6: ( ruleOpaque )
                    {
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1085:6: ( ruleOpaque )
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1086:1: ruleOpaque
                    {
                     before(grammarAccess.getTypeDefinitionAccess().getOpaqueParserRuleCall_3_1_1()); 
                    pushFollow(FOLLOW_ruleOpaque_in_rule__TypeDefinition__Alternatives_3_12273);
                    ruleOpaque();

                    state._fsp--;

                     after(grammarAccess.getTypeDefinitionAccess().getOpaqueParserRuleCall_3_1_1()); 

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
    // $ANTLR end "rule__TypeDefinition__Alternatives_3_1"


    // $ANTLR start "rule__FunctionDefinition__Alternatives"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1096:1: rule__FunctionDefinition__Alternatives : ( ( ( rule__FunctionDefinition__Group_0__0 ) ) | ( ( rule__FunctionDefinition__Group_1__0 ) ) );
    public final void rule__FunctionDefinition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1100:1: ( ( ( rule__FunctionDefinition__Group_0__0 ) ) | ( ( rule__FunctionDefinition__Group_1__0 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==108) ) {
                alt8=1;
            }
            else if ( (LA8_0==110) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1101:1: ( ( rule__FunctionDefinition__Group_0__0 ) )
                    {
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1101:1: ( ( rule__FunctionDefinition__Group_0__0 ) )
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1102:1: ( rule__FunctionDefinition__Group_0__0 )
                    {
                     before(grammarAccess.getFunctionDefinitionAccess().getGroup_0()); 
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1103:1: ( rule__FunctionDefinition__Group_0__0 )
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1103:2: rule__FunctionDefinition__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__FunctionDefinition__Group_0__0_in_rule__FunctionDefinition__Alternatives2305);
                    rule__FunctionDefinition__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFunctionDefinitionAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1107:6: ( ( rule__FunctionDefinition__Group_1__0 ) )
                    {
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1107:6: ( ( rule__FunctionDefinition__Group_1__0 ) )
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1108:1: ( rule__FunctionDefinition__Group_1__0 )
                    {
                     before(grammarAccess.getFunctionDefinitionAccess().getGroup_1()); 
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1109:1: ( rule__FunctionDefinition__Group_1__0 )
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1109:2: rule__FunctionDefinition__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__FunctionDefinition__Group_1__0_in_rule__FunctionDefinition__Alternatives2323);
                    rule__FunctionDefinition__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFunctionDefinitionAccess().getGroup_1()); 

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
    // $ANTLR end "rule__FunctionDefinition__Alternatives"


    // $ANTLR start "rule__FunctionDefinition__Alternatives_1_7"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1118:1: rule__FunctionDefinition__Alternatives_1_7 : ( ( ( rule__FunctionDefinition__TListAssignment_1_7_0 ) ) | ( RULE_OREST ) );
    public final void rule__FunctionDefinition__Alternatives_1_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1122:1: ( ( ( rule__FunctionDefinition__TListAssignment_1_7_0 ) ) | ( RULE_OREST ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==36||LA9_0==116) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_OREST) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1123:1: ( ( rule__FunctionDefinition__TListAssignment_1_7_0 ) )
                    {
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1123:1: ( ( rule__FunctionDefinition__TListAssignment_1_7_0 ) )
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1124:1: ( rule__FunctionDefinition__TListAssignment_1_7_0 )
                    {
                     before(grammarAccess.getFunctionDefinitionAccess().getTListAssignment_1_7_0()); 
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1125:1: ( rule__FunctionDefinition__TListAssignment_1_7_0 )
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1125:2: rule__FunctionDefinition__TListAssignment_1_7_0
                    {
                    pushFollow(FOLLOW_rule__FunctionDefinition__TListAssignment_1_7_0_in_rule__FunctionDefinition__Alternatives_1_72356);
                    rule__FunctionDefinition__TListAssignment_1_7_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFunctionDefinitionAccess().getTListAssignment_1_7_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1129:6: ( RULE_OREST )
                    {
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1129:6: ( RULE_OREST )
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1130:1: RULE_OREST
                    {
                     before(grammarAccess.getFunctionDefinitionAccess().getORESTTerminalRuleCall_1_7_1()); 
                    match(input,RULE_OREST,FOLLOW_RULE_OREST_in_rule__FunctionDefinition__Alternatives_1_72374); 
                     after(grammarAccess.getFunctionDefinitionAccess().getORESTTerminalRuleCall_1_7_1()); 

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
    // $ANTLR end "rule__FunctionDefinition__Alternatives_1_7"


    // $ANTLR start "rule__TypeUse__Alternatives"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1140:1: rule__TypeUse__Alternatives : ( ( rulePredefined ) | ( ruleAddressUse ) );
    public final void rule__TypeUse__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1144:1: ( ( rulePredefined ) | ( ruleAddressUse ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_INT_TYPE||(LA10_0>=24 && LA10_0<=35)) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_VALID_ID) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1145:1: ( rulePredefined )
                    {
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1145:1: ( rulePredefined )
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1146:1: rulePredefined
                    {
                     before(grammarAccess.getTypeUseAccess().getPredefinedParserRuleCall_0()); 
                    pushFollow(FOLLOW_rulePredefined_in_rule__TypeUse__Alternatives2406);
                    rulePredefined();

                    state._fsp--;

                     after(grammarAccess.getTypeUseAccess().getPredefinedParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1151:6: ( ruleAddressUse )
                    {
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1151:6: ( ruleAddressUse )
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1152:1: ruleAddressUse
                    {
                     before(grammarAccess.getTypeUseAccess().getAddressUseParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleAddressUse_in_rule__TypeUse__Alternatives2423);
                    ruleAddressUse();

                    state._fsp--;

                     after(grammarAccess.getTypeUseAccess().getAddressUseParserRuleCall_1()); 

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
    // $ANTLR end "rule__TypeUse__Alternatives"


    // $ANTLR start "rule__Primitive_Type__Alternatives"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1162:1: rule__Primitive_Type__Alternatives : ( ( 'void' ) | ( 'null' ) | ( 'label' ) | ( 'undef' ) | ( 'true' ) | ( 'false' ) );
    public final void rule__Primitive_Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1166:1: ( ( 'void' ) | ( 'null' ) | ( 'label' ) | ( 'undef' ) | ( 'true' ) | ( 'false' ) )
            int alt11=6;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt11=1;
                }
                break;
            case 25:
                {
                alt11=2;
                }
                break;
            case 26:
                {
                alt11=3;
                }
                break;
            case 27:
                {
                alt11=4;
                }
                break;
            case 28:
                {
                alt11=5;
                }
                break;
            case 29:
                {
                alt11=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1167:1: ( 'void' )
                    {
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1167:1: ( 'void' )
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1168:1: 'void'
                    {
                     before(grammarAccess.getPrimitive_TypeAccess().getVoidKeyword_0()); 
                    match(input,24,FOLLOW_24_in_rule__Primitive_Type__Alternatives2456); 
                     after(grammarAccess.getPrimitive_TypeAccess().getVoidKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1175:6: ( 'null' )
                    {
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1175:6: ( 'null' )
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1176:1: 'null'
                    {
                     before(grammarAccess.getPrimitive_TypeAccess().getNullKeyword_1()); 
                    match(input,25,FOLLOW_25_in_rule__Primitive_Type__Alternatives2476); 
                     after(grammarAccess.getPrimitive_TypeAccess().getNullKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1183:6: ( 'label' )
                    {
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1183:6: ( 'label' )
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1184:1: 'label'
                    {
                     before(grammarAccess.getPrimitive_TypeAccess().getLabelKeyword_2()); 
                    match(input,26,FOLLOW_26_in_rule__Primitive_Type__Alternatives2496); 
                     after(grammarAccess.getPrimitive_TypeAccess().getLabelKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1191:6: ( 'undef' )
                    {
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1191:6: ( 'undef' )
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1192:1: 'undef'
                    {
                     before(grammarAccess.getPrimitive_TypeAccess().getUndefKeyword_3()); 
                    match(input,27,FOLLOW_27_in_rule__Primitive_Type__Alternatives2516); 
                     after(grammarAccess.getPrimitive_TypeAccess().getUndefKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1199:6: ( 'true' )
                    {
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1199:6: ( 'true' )
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1200:1: 'true'
                    {
                     before(grammarAccess.getPrimitive_TypeAccess().getTrueKeyword_4()); 
                    match(input,28,FOLLOW_28_in_rule__Primitive_Type__Alternatives2536); 
                     after(grammarAccess.getPrimitive_TypeAccess().getTrueKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1207:6: ( 'false' )
                    {
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1207:6: ( 'false' )
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1208:1: 'false'
                    {
                     before(grammarAccess.getPrimitive_TypeAccess().getFalseKeyword_5()); 
                    match(input,29,FOLLOW_29_in_rule__Primitive_Type__Alternatives2556); 
                     after(grammarAccess.getPrimitive_TypeAccess().getFalseKeyword_5()); 

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
    // $ANTLR end "rule__Primitive_Type__Alternatives"


    // $ANTLR start "rule__FloatingPoint_Type__Alternatives"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1220:1: rule__FloatingPoint_Type__Alternatives : ( ( 'half' ) | ( 'float' ) | ( 'double' ) | ( 'x86_fp80' ) | ( 'fp128' ) | ( 'ppc_fp128' ) );
    public final void rule__FloatingPoint_Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1224:1: ( ( 'half' ) | ( 'float' ) | ( 'double' ) | ( 'x86_fp80' ) | ( 'fp128' ) | ( 'ppc_fp128' ) )
            int alt12=6;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt12=1;
                }
                break;
            case 31:
                {
                alt12=2;
                }
                break;
            case 32:
                {
                alt12=3;
                }
                break;
            case 33:
                {
                alt12=4;
                }
                break;
            case 34:
                {
                alt12=5;
                }
                break;
            case 35:
                {
                alt12=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1225:1: ( 'half' )
                    {
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1225:1: ( 'half' )
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1226:1: 'half'
                    {
                     before(grammarAccess.getFloatingPoint_TypeAccess().getHalfKeyword_0()); 
                    match(input,30,FOLLOW_30_in_rule__FloatingPoint_Type__Alternatives2591); 
                     after(grammarAccess.getFloatingPoint_TypeAccess().getHalfKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1233:6: ( 'float' )
                    {
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1233:6: ( 'float' )
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1234:1: 'float'
                    {
                     before(grammarAccess.getFloatingPoint_TypeAccess().getFloatKeyword_1()); 
                    match(input,31,FOLLOW_31_in_rule__FloatingPoint_Type__Alternatives2611); 
                     after(grammarAccess.getFloatingPoint_TypeAccess().getFloatKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1241:6: ( 'double' )
                    {
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1241:6: ( 'double' )
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1242:1: 'double'
                    {
                     before(grammarAccess.getFloatingPoint_TypeAccess().getDoubleKeyword_2()); 
                    match(input,32,FOLLOW_32_in_rule__FloatingPoint_Type__Alternatives2631); 
                     after(grammarAccess.getFloatingPoint_TypeAccess().getDoubleKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1249:6: ( 'x86_fp80' )
                    {
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1249:6: ( 'x86_fp80' )
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1250:1: 'x86_fp80'
                    {
                     before(grammarAccess.getFloatingPoint_TypeAccess().getX86_fp80Keyword_3()); 
                    match(input,33,FOLLOW_33_in_rule__FloatingPoint_Type__Alternatives2651); 
                     after(grammarAccess.getFloatingPoint_TypeAccess().getX86_fp80Keyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1257:6: ( 'fp128' )
                    {
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1257:6: ( 'fp128' )
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1258:1: 'fp128'
                    {
                     before(grammarAccess.getFloatingPoint_TypeAccess().getFp128Keyword_4()); 
                    match(input,34,FOLLOW_34_in_rule__FloatingPoint_Type__Alternatives2671); 
                     after(grammarAccess.getFloatingPoint_TypeAccess().getFp128Keyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1265:6: ( 'ppc_fp128' )
                    {
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1265:6: ( 'ppc_fp128' )
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1266:1: 'ppc_fp128'
                    {
                     before(grammarAccess.getFloatingPoint_TypeAccess().getPpc_fp128Keyword_5()); 
                    match(input,35,FOLLOW_35_in_rule__FloatingPoint_Type__Alternatives2691); 
                     after(grammarAccess.getFloatingPoint_TypeAccess().getPpc_fp128Keyword_5()); 

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
    // $ANTLR end "rule__FloatingPoint_Type__Alternatives"


    // $ANTLR start "rule__Predefined_Types__Alternatives"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1278:1: rule__Predefined_Types__Alternatives : ( ( rulePrimitive_Type ) | ( RULE_INT_TYPE ) | ( ruleFloatingPoint_Type ) );
    public final void rule__Predefined_Types__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1282:1: ( ( rulePrimitive_Type ) | ( RULE_INT_TYPE ) | ( ruleFloatingPoint_Type ) )
            int alt13=3;
            switch ( input.LA(1) ) {
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
                {
                alt13=1;
                }
                break;
            case RULE_INT_TYPE:
                {
                alt13=2;
                }
                break;
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
                {
                alt13=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1283:1: ( rulePrimitive_Type )
                    {
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1283:1: ( rulePrimitive_Type )
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1284:1: rulePrimitive_Type
                    {
                     before(grammarAccess.getPredefined_TypesAccess().getPrimitive_TypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_rulePrimitive_Type_in_rule__Predefined_Types__Alternatives2725);
                    rulePrimitive_Type();

                    state._fsp--;

                     after(grammarAccess.getPredefined_TypesAccess().getPrimitive_TypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1289:6: ( RULE_INT_TYPE )
                    {
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1289:6: ( RULE_INT_TYPE )
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1290:1: RULE_INT_TYPE
                    {
                     before(grammarAccess.getPredefined_TypesAccess().getINT_TYPETerminalRuleCall_1()); 
                    match(input,RULE_INT_TYPE,FOLLOW_RULE_INT_TYPE_in_rule__Predefined_Types__Alternatives2742); 
                     after(grammarAccess.getPredefined_TypesAccess().getINT_TYPETerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1295:6: ( ruleFloatingPoint_Type )
                    {
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1295:6: ( ruleFloatingPoint_Type )
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1296:1: ruleFloatingPoint_Type
                    {
                     before(grammarAccess.getPredefined_TypesAccess().getFloatingPoint_TypeParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleFloatingPoint_Type_in_rule__Predefined_Types__Alternatives2759);
                    ruleFloatingPoint_Type();

                    state._fsp--;

                     after(grammarAccess.getPredefined_TypesAccess().getFloatingPoint_TypeParserRuleCall_2()); 

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
    // $ANTLR end "rule__Predefined_Types__Alternatives"


    // $ANTLR start "rule__Value__Alternatives"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1307:1: rule__Value__Alternatives : ( ( ruleConstant ) | ( ruleNonConstantValue ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1311:1: ( ( ruleConstant ) | ( ruleNonConstantValue ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_INT) ) {
                alt14=1;
            }
            else if ( (LA14_0==RULE_VALID_ID) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1312:1: ( ruleConstant )
                    {
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1312:1: ( ruleConstant )
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1313:1: ruleConstant
                    {
                     before(grammarAccess.getValueAccess().getConstantParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleConstant_in_rule__Value__Alternatives2792);
                    ruleConstant();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getConstantParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1318:6: ( ruleNonConstantValue )
                    {
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1318:6: ( ruleNonConstantValue )
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1319:1: ruleNonConstantValue
                    {
                     before(grammarAccess.getValueAccess().getNonConstantValueParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleNonConstantValue_in_rule__Value__Alternatives2809);
                    ruleNonConstantValue();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getNonConstantValueParserRuleCall_1()); 

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
    // $ANTLR end "rule__Value__Alternatives"


    // $ANTLR start "rule__TypeList__Alternatives_1"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1329:1: rule__TypeList__Alternatives_1 : ( ( '()' ) | ( ( rule__TypeList__Group_1_1__0 ) ) );
    public final void rule__TypeList__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1333:1: ( ( '()' ) | ( ( rule__TypeList__Group_1_1__0 ) ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==36) ) {
                alt15=1;
            }
            else if ( (LA15_0==116) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1334:1: ( '()' )
                    {
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1334:1: ( '()' )
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1335:1: '()'
                    {
                     before(grammarAccess.getTypeListAccess().getLeftParenthesisRightParenthesisKeyword_1_0()); 
                    match(input,36,FOLLOW_36_in_rule__TypeList__Alternatives_12842); 
                     after(grammarAccess.getTypeListAccess().getLeftParenthesisRightParenthesisKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1342:6: ( ( rule__TypeList__Group_1_1__0 ) )
                    {
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1342:6: ( ( rule__TypeList__Group_1_1__0 ) )
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1343:1: ( rule__TypeList__Group_1_1__0 )
                    {
                     before(grammarAccess.getTypeListAccess().getGroup_1_1()); 
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1344:1: ( rule__TypeList__Group_1_1__0 )
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1344:2: rule__TypeList__Group_1_1__0
                    {
                    pushFollow(FOLLOW_rule__TypeList__Group_1_1__0_in_rule__TypeList__Alternatives_12861);
                    rule__TypeList__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeListAccess().getGroup_1_1()); 

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
    // $ANTLR end "rule__TypeList__Alternatives_1"


    // $ANTLR start "rule__TypeList__Alternatives_1_1_2"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1353:1: rule__TypeList__Alternatives_1_1_2 : ( ( ')' ) | ( ')*' ) | ( ')**' ) | ( ')***' ) | ( ')****' ) | ( ')*****' ) );
    public final void rule__TypeList__Alternatives_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1357:1: ( ( ')' ) | ( ')*' ) | ( ')**' ) | ( ')***' ) | ( ')****' ) | ( ')*****' ) )
            int alt16=6;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt16=1;
                }
                break;
            case 38:
                {
                alt16=2;
                }
                break;
            case 39:
                {
                alt16=3;
                }
                break;
            case 40:
                {
                alt16=4;
                }
                break;
            case 41:
                {
                alt16=5;
                }
                break;
            case 42:
                {
                alt16=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1358:1: ( ')' )
                    {
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1358:1: ( ')' )
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1359:1: ')'
                    {
                     before(grammarAccess.getTypeListAccess().getRightParenthesisKeyword_1_1_2_0()); 
                    match(input,37,FOLLOW_37_in_rule__TypeList__Alternatives_1_1_22895); 
                     after(grammarAccess.getTypeListAccess().getRightParenthesisKeyword_1_1_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1366:6: ( ')*' )
                    {
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1366:6: ( ')*' )
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1367:1: ')*'
                    {
                     before(grammarAccess.getTypeListAccess().getRightParenthesisAsteriskKeyword_1_1_2_1()); 
                    match(input,38,FOLLOW_38_in_rule__TypeList__Alternatives_1_1_22915); 
                     after(grammarAccess.getTypeListAccess().getRightParenthesisAsteriskKeyword_1_1_2_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1374:6: ( ')**' )
                    {
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1374:6: ( ')**' )
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1375:1: ')**'
                    {
                     before(grammarAccess.getTypeListAccess().getRightParenthesisAsteriskAsteriskKeyword_1_1_2_2()); 
                    match(input,39,FOLLOW_39_in_rule__TypeList__Alternatives_1_1_22935); 
                     after(grammarAccess.getTypeListAccess().getRightParenthesisAsteriskAsteriskKeyword_1_1_2_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1382:6: ( ')***' )
                    {
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1382:6: ( ')***' )
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1383:1: ')***'
                    {
                     before(grammarAccess.getTypeListAccess().getRightParenthesisAsteriskAsteriskAsteriskKeyword_1_1_2_3()); 
                    match(input,40,FOLLOW_40_in_rule__TypeList__Alternatives_1_1_22955); 
                     after(grammarAccess.getTypeListAccess().getRightParenthesisAsteriskAsteriskAsteriskKeyword_1_1_2_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1390:6: ( ')****' )
                    {
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1390:6: ( ')****' )
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1391:1: ')****'
                    {
                     before(grammarAccess.getTypeListAccess().getRightParenthesisAsteriskAsteriskAsteriskAsteriskKeyword_1_1_2_4()); 
                    match(input,41,FOLLOW_41_in_rule__TypeList__Alternatives_1_1_22975); 
                     after(grammarAccess.getTypeListAccess().getRightParenthesisAsteriskAsteriskAsteriskAsteriskKeyword_1_1_2_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1398:6: ( ')*****' )
                    {
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1398:6: ( ')*****' )
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1399:1: ')*****'
                    {
                     before(grammarAccess.getTypeListAccess().getRightParenthesisAsteriskAsteriskAsteriskAsteriskAsteriskKeyword_1_1_2_5()); 
                    match(input,42,FOLLOW_42_in_rule__TypeList__Alternatives_1_1_22995); 
                     after(grammarAccess.getTypeListAccess().getRightParenthesisAsteriskAsteriskAsteriskAsteriskAsteriskKeyword_1_1_2_5()); 

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
    // $ANTLR end "rule__TypeList__Alternatives_1_1_2"


    // $ANTLR start "rule__RETURN_ATTRIBUTES__Alternatives"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1411:1: rule__RETURN_ATTRIBUTES__Alternatives : ( ( 'zeroext' ) | ( 'signext' ) | ( 'inreg' ) | ( 'byval' ) | ( 'sret' ) | ( 'noalias' ) | ( 'nocapture' ) | ( 'nest' ) );
    public final void rule__RETURN_ATTRIBUTES__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1415:1: ( ( 'zeroext' ) | ( 'signext' ) | ( 'inreg' ) | ( 'byval' ) | ( 'sret' ) | ( 'noalias' ) | ( 'nocapture' ) | ( 'nest' ) )
            int alt17=8;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt17=1;
                }
                break;
            case 44:
                {
                alt17=2;
                }
                break;
            case 45:
                {
                alt17=3;
                }
                break;
            case 46:
                {
                alt17=4;
                }
                break;
            case 47:
                {
                alt17=5;
                }
                break;
            case 48:
                {
                alt17=6;
                }
                break;
            case 49:
                {
                alt17=7;
                }
                break;
            case 50:
                {
                alt17=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1416:1: ( 'zeroext' )
                    {
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1416:1: ( 'zeroext' )
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1417:1: 'zeroext'
                    {
                     before(grammarAccess.getRETURN_ATTRIBUTESAccess().getZeroextKeyword_0()); 
                    match(input,43,FOLLOW_43_in_rule__RETURN_ATTRIBUTES__Alternatives3030); 
                     after(grammarAccess.getRETURN_ATTRIBUTESAccess().getZeroextKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1424:6: ( 'signext' )
                    {
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1424:6: ( 'signext' )
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1425:1: 'signext'
                    {
                     before(grammarAccess.getRETURN_ATTRIBUTESAccess().getSignextKeyword_1()); 
                    match(input,44,FOLLOW_44_in_rule__RETURN_ATTRIBUTES__Alternatives3050); 
                     after(grammarAccess.getRETURN_ATTRIBUTESAccess().getSignextKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1432:6: ( 'inreg' )
                    {
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1432:6: ( 'inreg' )
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1433:1: 'inreg'
                    {
                     before(grammarAccess.getRETURN_ATTRIBUTESAccess().getInregKeyword_2()); 
                    match(input,45,FOLLOW_45_in_rule__RETURN_ATTRIBUTES__Alternatives3070); 
                     after(grammarAccess.getRETURN_ATTRIBUTESAccess().getInregKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1440:6: ( 'byval' )
                    {
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1440:6: ( 'byval' )
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1441:1: 'byval'
                    {
                     before(grammarAccess.getRETURN_ATTRIBUTESAccess().getByvalKeyword_3()); 
                    match(input,46,FOLLOW_46_in_rule__RETURN_ATTRIBUTES__Alternatives3090); 
                     after(grammarAccess.getRETURN_ATTRIBUTESAccess().getByvalKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1448:6: ( 'sret' )
                    {
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1448:6: ( 'sret' )
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1449:1: 'sret'
                    {
                     before(grammarAccess.getRETURN_ATTRIBUTESAccess().getSretKeyword_4()); 
                    match(input,47,FOLLOW_47_in_rule__RETURN_ATTRIBUTES__Alternatives3110); 
                     after(grammarAccess.getRETURN_ATTRIBUTESAccess().getSretKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1456:6: ( 'noalias' )
                    {
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1456:6: ( 'noalias' )
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1457:1: 'noalias'
                    {
                     before(grammarAccess.getRETURN_ATTRIBUTESAccess().getNoaliasKeyword_5()); 
                    match(input,48,FOLLOW_48_in_rule__RETURN_ATTRIBUTES__Alternatives3130); 
                     after(grammarAccess.getRETURN_ATTRIBUTESAccess().getNoaliasKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1464:6: ( 'nocapture' )
                    {
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1464:6: ( 'nocapture' )
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1465:1: 'nocapture'
                    {
                     before(grammarAccess.getRETURN_ATTRIBUTESAccess().getNocaptureKeyword_6()); 
                    match(input,49,FOLLOW_49_in_rule__RETURN_ATTRIBUTES__Alternatives3150); 
                     after(grammarAccess.getRETURN_ATTRIBUTESAccess().getNocaptureKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1472:6: ( 'nest' )
                    {
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1472:6: ( 'nest' )
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1473:1: 'nest'
                    {
                     before(grammarAccess.getRETURN_ATTRIBUTESAccess().getNestKeyword_7()); 
                    match(input,50,FOLLOW_50_in_rule__RETURN_ATTRIBUTES__Alternatives3170); 
                     after(grammarAccess.getRETURN_ATTRIBUTESAccess().getNestKeyword_7()); 

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
    // $ANTLR end "rule__RETURN_ATTRIBUTES__Alternatives"


    // $ANTLR start "rule__CallingConv__Alternatives"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1485:1: rule__CallingConv__Alternatives : ( ( 'ccc' ) | ( 'fastcc' ) | ( 'coldcc' ) | ( 'x86_stdcallcc' ) | ( 'x86_fastcallcc' ) | ( 'x86_thiscallcc' ) | ( 'arm_apcscc' ) | ( 'arm_aapcscc' ) | ( 'arm_aapcs_vfpcc' ) | ( 'msp430_intrcc' ) | ( 'ptx_kernel' ) | ( 'ptx_device' ) | ( 'spir_func' ) | ( 'spir_kernel' ) | ( ( rule__CallingConv__Group_14__0 ) ) );
    public final void rule__CallingConv__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1489:1: ( ( 'ccc' ) | ( 'fastcc' ) | ( 'coldcc' ) | ( 'x86_stdcallcc' ) | ( 'x86_fastcallcc' ) | ( 'x86_thiscallcc' ) | ( 'arm_apcscc' ) | ( 'arm_aapcscc' ) | ( 'arm_aapcs_vfpcc' ) | ( 'msp430_intrcc' ) | ( 'ptx_kernel' ) | ( 'ptx_device' ) | ( 'spir_func' ) | ( 'spir_kernel' ) | ( ( rule__CallingConv__Group_14__0 ) ) )
            int alt18=15;
            switch ( input.LA(1) ) {
            case 51:
                {
                alt18=1;
                }
                break;
            case 52:
                {
                alt18=2;
                }
                break;
            case 53:
                {
                alt18=3;
                }
                break;
            case 54:
                {
                alt18=4;
                }
                break;
            case 55:
                {
                alt18=5;
                }
                break;
            case 56:
                {
                alt18=6;
                }
                break;
            case 57:
                {
                alt18=7;
                }
                break;
            case 58:
                {
                alt18=8;
                }
                break;
            case 59:
                {
                alt18=9;
                }
                break;
            case 60:
                {
                alt18=10;
                }
                break;
            case 61:
                {
                alt18=11;
                }
                break;
            case 62:
                {
                alt18=12;
                }
                break;
            case 63:
                {
                alt18=13;
                }
                break;
            case 64:
                {
                alt18=14;
                }
                break;
            case 118:
                {
                alt18=15;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1490:1: ( 'ccc' )
                    {
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1490:1: ( 'ccc' )
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1491:1: 'ccc'
                    {
                     before(grammarAccess.getCallingConvAccess().getCccKeyword_0()); 
                    match(input,51,FOLLOW_51_in_rule__CallingConv__Alternatives3205); 
                     after(grammarAccess.getCallingConvAccess().getCccKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1498:6: ( 'fastcc' )
                    {
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1498:6: ( 'fastcc' )
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1499:1: 'fastcc'
                    {
                     before(grammarAccess.getCallingConvAccess().getFastccKeyword_1()); 
                    match(input,52,FOLLOW_52_in_rule__CallingConv__Alternatives3225); 
                     after(grammarAccess.getCallingConvAccess().getFastccKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1506:6: ( 'coldcc' )
                    {
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1506:6: ( 'coldcc' )
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1507:1: 'coldcc'
                    {
                     before(grammarAccess.getCallingConvAccess().getColdccKeyword_2()); 
                    match(input,53,FOLLOW_53_in_rule__CallingConv__Alternatives3245); 
                     after(grammarAccess.getCallingConvAccess().getColdccKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1514:6: ( 'x86_stdcallcc' )
                    {
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1514:6: ( 'x86_stdcallcc' )
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1515:1: 'x86_stdcallcc'
                    {
                     before(grammarAccess.getCallingConvAccess().getX86_stdcallccKeyword_3()); 
                    match(input,54,FOLLOW_54_in_rule__CallingConv__Alternatives3265); 
                     after(grammarAccess.getCallingConvAccess().getX86_stdcallccKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1522:6: ( 'x86_fastcallcc' )
                    {
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1522:6: ( 'x86_fastcallcc' )
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1523:1: 'x86_fastcallcc'
                    {
                     before(grammarAccess.getCallingConvAccess().getX86_fastcallccKeyword_4()); 
                    match(input,55,FOLLOW_55_in_rule__CallingConv__Alternatives3285); 
                     after(grammarAccess.getCallingConvAccess().getX86_fastcallccKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1530:6: ( 'x86_thiscallcc' )
                    {
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1530:6: ( 'x86_thiscallcc' )
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1531:1: 'x86_thiscallcc'
                    {
                     before(grammarAccess.getCallingConvAccess().getX86_thiscallccKeyword_5()); 
                    match(input,56,FOLLOW_56_in_rule__CallingConv__Alternatives3305); 
                     after(grammarAccess.getCallingConvAccess().getX86_thiscallccKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1538:6: ( 'arm_apcscc' )
                    {
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1538:6: ( 'arm_apcscc' )
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1539:1: 'arm_apcscc'
                    {
                     before(grammarAccess.getCallingConvAccess().getArm_apcsccKeyword_6()); 
                    match(input,57,FOLLOW_57_in_rule__CallingConv__Alternatives3325); 
                     after(grammarAccess.getCallingConvAccess().getArm_apcsccKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1546:6: ( 'arm_aapcscc' )
                    {
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1546:6: ( 'arm_aapcscc' )
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1547:1: 'arm_aapcscc'
                    {
                     before(grammarAccess.getCallingConvAccess().getArm_aapcsccKeyword_7()); 
                    match(input,58,FOLLOW_58_in_rule__CallingConv__Alternatives3345); 
                     after(grammarAccess.getCallingConvAccess().getArm_aapcsccKeyword_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1554:6: ( 'arm_aapcs_vfpcc' )
                    {
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1554:6: ( 'arm_aapcs_vfpcc' )
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1555:1: 'arm_aapcs_vfpcc'
                    {
                     before(grammarAccess.getCallingConvAccess().getArm_aapcs_vfpccKeyword_8()); 
                    match(input,59,FOLLOW_59_in_rule__CallingConv__Alternatives3365); 
                     after(grammarAccess.getCallingConvAccess().getArm_aapcs_vfpccKeyword_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1562:6: ( 'msp430_intrcc' )
                    {
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1562:6: ( 'msp430_intrcc' )
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1563:1: 'msp430_intrcc'
                    {
                     before(grammarAccess.getCallingConvAccess().getMsp430_intrccKeyword_9()); 
                    match(input,60,FOLLOW_60_in_rule__CallingConv__Alternatives3385); 
                     after(grammarAccess.getCallingConvAccess().getMsp430_intrccKeyword_9()); 

                    }


                    }
                    break;
                case 11 :
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1570:6: ( 'ptx_kernel' )
                    {
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1570:6: ( 'ptx_kernel' )
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1571:1: 'ptx_kernel'
                    {
                     before(grammarAccess.getCallingConvAccess().getPtx_kernelKeyword_10()); 
                    match(input,61,FOLLOW_61_in_rule__CallingConv__Alternatives3405); 
                     after(grammarAccess.getCallingConvAccess().getPtx_kernelKeyword_10()); 

                    }


                    }
                    break;
                case 12 :
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1578:6: ( 'ptx_device' )
                    {
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1578:6: ( 'ptx_device' )
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1579:1: 'ptx_device'
                    {
                     before(grammarAccess.getCallingConvAccess().getPtx_deviceKeyword_11()); 
                    match(input,62,FOLLOW_62_in_rule__CallingConv__Alternatives3425); 
                     after(grammarAccess.getCallingConvAccess().getPtx_deviceKeyword_11()); 

                    }


                    }
                    break;
                case 13 :
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1586:6: ( 'spir_func' )
                    {
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1586:6: ( 'spir_func' )
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1587:1: 'spir_func'
                    {
                     before(grammarAccess.getCallingConvAccess().getSpir_funcKeyword_12()); 
                    match(input,63,FOLLOW_63_in_rule__CallingConv__Alternatives3445); 
                     after(grammarAccess.getCallingConvAccess().getSpir_funcKeyword_12()); 

                    }


                    }
                    break;
                case 14 :
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1594:6: ( 'spir_kernel' )
                    {
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1594:6: ( 'spir_kernel' )
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1595:1: 'spir_kernel'
                    {
                     before(grammarAccess.getCallingConvAccess().getSpir_kernelKeyword_13()); 
                    match(input,64,FOLLOW_64_in_rule__CallingConv__Alternatives3465); 
                     after(grammarAccess.getCallingConvAccess().getSpir_kernelKeyword_13()); 

                    }


                    }
                    break;
                case 15 :
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1602:6: ( ( rule__CallingConv__Group_14__0 ) )
                    {
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1602:6: ( ( rule__CallingConv__Group_14__0 ) )
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1603:1: ( rule__CallingConv__Group_14__0 )
                    {
                     before(grammarAccess.getCallingConvAccess().getGroup_14()); 
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1604:1: ( rule__CallingConv__Group_14__0 )
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1604:2: rule__CallingConv__Group_14__0
                    {
                    pushFollow(FOLLOW_rule__CallingConv__Group_14__0_in_rule__CallingConv__Alternatives3484);
                    rule__CallingConv__Group_14__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCallingConvAccess().getGroup_14()); 

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
    // $ANTLR end "rule__CallingConv__Alternatives"


    // $ANTLR start "rule__FUNCTION_ATTRIBUTES__Alternatives"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1613:1: rule__FUNCTION_ATTRIBUTES__Alternatives : ( ( 'address_safety' ) | ( ( rule__FUNCTION_ATTRIBUTES__Group_1__0 ) ) | ( 'alwaysinline' ) | ( 'nonlazybind' ) | ( 'inlinehint' ) | ( 'naked' ) | ( 'noimplicitfloat' ) | ( 'noinline' ) | ( 'noredzone' ) | ( 'noreturn' ) | ( 'nounwind' ) | ( 'optsize' ) | ( 'readnone' ) | ( 'readonly' ) | ( 'returns_twice' ) | ( 'ssp' ) | ( 'sspreq' ) | ( 'uwtable' ) );
    public final void rule__FUNCTION_ATTRIBUTES__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1617:1: ( ( 'address_safety' ) | ( ( rule__FUNCTION_ATTRIBUTES__Group_1__0 ) ) | ( 'alwaysinline' ) | ( 'nonlazybind' ) | ( 'inlinehint' ) | ( 'naked' ) | ( 'noimplicitfloat' ) | ( 'noinline' ) | ( 'noredzone' ) | ( 'noreturn' ) | ( 'nounwind' ) | ( 'optsize' ) | ( 'readnone' ) | ( 'readonly' ) | ( 'returns_twice' ) | ( 'ssp' ) | ( 'sspreq' ) | ( 'uwtable' ) )
            int alt19=18;
            switch ( input.LA(1) ) {
            case 65:
                {
                alt19=1;
                }
                break;
            case 119:
                {
                alt19=2;
                }
                break;
            case 66:
                {
                alt19=3;
                }
                break;
            case 67:
                {
                alt19=4;
                }
                break;
            case 68:
                {
                alt19=5;
                }
                break;
            case 69:
                {
                alt19=6;
                }
                break;
            case 70:
                {
                alt19=7;
                }
                break;
            case 71:
                {
                alt19=8;
                }
                break;
            case 72:
                {
                alt19=9;
                }
                break;
            case 73:
                {
                alt19=10;
                }
                break;
            case 74:
                {
                alt19=11;
                }
                break;
            case 75:
                {
                alt19=12;
                }
                break;
            case 76:
                {
                alt19=13;
                }
                break;
            case 77:
                {
                alt19=14;
                }
                break;
            case 78:
                {
                alt19=15;
                }
                break;
            case 79:
                {
                alt19=16;
                }
                break;
            case 80:
                {
                alt19=17;
                }
                break;
            case 81:
                {
                alt19=18;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1618:1: ( 'address_safety' )
                    {
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1618:1: ( 'address_safety' )
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1619:1: 'address_safety'
                    {
                     before(grammarAccess.getFUNCTION_ATTRIBUTESAccess().getAddress_safetyKeyword_0()); 
                    match(input,65,FOLLOW_65_in_rule__FUNCTION_ATTRIBUTES__Alternatives3518); 
                     after(grammarAccess.getFUNCTION_ATTRIBUTESAccess().getAddress_safetyKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1626:6: ( ( rule__FUNCTION_ATTRIBUTES__Group_1__0 ) )
                    {
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1626:6: ( ( rule__FUNCTION_ATTRIBUTES__Group_1__0 ) )
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1627:1: ( rule__FUNCTION_ATTRIBUTES__Group_1__0 )
                    {
                     before(grammarAccess.getFUNCTION_ATTRIBUTESAccess().getGroup_1()); 
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1628:1: ( rule__FUNCTION_ATTRIBUTES__Group_1__0 )
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1628:2: rule__FUNCTION_ATTRIBUTES__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__FUNCTION_ATTRIBUTES__Group_1__0_in_rule__FUNCTION_ATTRIBUTES__Alternatives3537);
                    rule__FUNCTION_ATTRIBUTES__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFUNCTION_ATTRIBUTESAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1632:6: ( 'alwaysinline' )
                    {
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1632:6: ( 'alwaysinline' )
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1633:1: 'alwaysinline'
                    {
                     before(grammarAccess.getFUNCTION_ATTRIBUTESAccess().getAlwaysinlineKeyword_2()); 
                    match(input,66,FOLLOW_66_in_rule__FUNCTION_ATTRIBUTES__Alternatives3556); 
                     after(grammarAccess.getFUNCTION_ATTRIBUTESAccess().getAlwaysinlineKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1640:6: ( 'nonlazybind' )
                    {
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1640:6: ( 'nonlazybind' )
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1641:1: 'nonlazybind'
                    {
                     before(grammarAccess.getFUNCTION_ATTRIBUTESAccess().getNonlazybindKeyword_3()); 
                    match(input,67,FOLLOW_67_in_rule__FUNCTION_ATTRIBUTES__Alternatives3576); 
                     after(grammarAccess.getFUNCTION_ATTRIBUTESAccess().getNonlazybindKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1648:6: ( 'inlinehint' )
                    {
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1648:6: ( 'inlinehint' )
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1649:1: 'inlinehint'
                    {
                     before(grammarAccess.getFUNCTION_ATTRIBUTESAccess().getInlinehintKeyword_4()); 
                    match(input,68,FOLLOW_68_in_rule__FUNCTION_ATTRIBUTES__Alternatives3596); 
                     after(grammarAccess.getFUNCTION_ATTRIBUTESAccess().getInlinehintKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1656:6: ( 'naked' )
                    {
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1656:6: ( 'naked' )
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1657:1: 'naked'
                    {
                     before(grammarAccess.getFUNCTION_ATTRIBUTESAccess().getNakedKeyword_5()); 
                    match(input,69,FOLLOW_69_in_rule__FUNCTION_ATTRIBUTES__Alternatives3616); 
                     after(grammarAccess.getFUNCTION_ATTRIBUTESAccess().getNakedKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1664:6: ( 'noimplicitfloat' )
                    {
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1664:6: ( 'noimplicitfloat' )
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1665:1: 'noimplicitfloat'
                    {
                     before(grammarAccess.getFUNCTION_ATTRIBUTESAccess().getNoimplicitfloatKeyword_6()); 
                    match(input,70,FOLLOW_70_in_rule__FUNCTION_ATTRIBUTES__Alternatives3636); 
                     after(grammarAccess.getFUNCTION_ATTRIBUTESAccess().getNoimplicitfloatKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1672:6: ( 'noinline' )
                    {
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1672:6: ( 'noinline' )
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1673:1: 'noinline'
                    {
                     before(grammarAccess.getFUNCTION_ATTRIBUTESAccess().getNoinlineKeyword_7()); 
                    match(input,71,FOLLOW_71_in_rule__FUNCTION_ATTRIBUTES__Alternatives3656); 
                     after(grammarAccess.getFUNCTION_ATTRIBUTESAccess().getNoinlineKeyword_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1680:6: ( 'noredzone' )
                    {
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1680:6: ( 'noredzone' )
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1681:1: 'noredzone'
                    {
                     before(grammarAccess.getFUNCTION_ATTRIBUTESAccess().getNoredzoneKeyword_8()); 
                    match(input,72,FOLLOW_72_in_rule__FUNCTION_ATTRIBUTES__Alternatives3676); 
                     after(grammarAccess.getFUNCTION_ATTRIBUTESAccess().getNoredzoneKeyword_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1688:6: ( 'noreturn' )
                    {
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1688:6: ( 'noreturn' )
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1689:1: 'noreturn'
                    {
                     before(grammarAccess.getFUNCTION_ATTRIBUTESAccess().getNoreturnKeyword_9()); 
                    match(input,73,FOLLOW_73_in_rule__FUNCTION_ATTRIBUTES__Alternatives3696); 
                     after(grammarAccess.getFUNCTION_ATTRIBUTESAccess().getNoreturnKeyword_9()); 

                    }


                    }
                    break;
                case 11 :
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1696:6: ( 'nounwind' )
                    {
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1696:6: ( 'nounwind' )
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1697:1: 'nounwind'
                    {
                     before(grammarAccess.getFUNCTION_ATTRIBUTESAccess().getNounwindKeyword_10()); 
                    match(input,74,FOLLOW_74_in_rule__FUNCTION_ATTRIBUTES__Alternatives3716); 
                     after(grammarAccess.getFUNCTION_ATTRIBUTESAccess().getNounwindKeyword_10()); 

                    }


                    }
                    break;
                case 12 :
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1704:6: ( 'optsize' )
                    {
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1704:6: ( 'optsize' )
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1705:1: 'optsize'
                    {
                     before(grammarAccess.getFUNCTION_ATTRIBUTESAccess().getOptsizeKeyword_11()); 
                    match(input,75,FOLLOW_75_in_rule__FUNCTION_ATTRIBUTES__Alternatives3736); 
                     after(grammarAccess.getFUNCTION_ATTRIBUTESAccess().getOptsizeKeyword_11()); 

                    }


                    }
                    break;
                case 13 :
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1712:6: ( 'readnone' )
                    {
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1712:6: ( 'readnone' )
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1713:1: 'readnone'
                    {
                     before(grammarAccess.getFUNCTION_ATTRIBUTESAccess().getReadnoneKeyword_12()); 
                    match(input,76,FOLLOW_76_in_rule__FUNCTION_ATTRIBUTES__Alternatives3756); 
                     after(grammarAccess.getFUNCTION_ATTRIBUTESAccess().getReadnoneKeyword_12()); 

                    }


                    }
                    break;
                case 14 :
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1720:6: ( 'readonly' )
                    {
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1720:6: ( 'readonly' )
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1721:1: 'readonly'
                    {
                     before(grammarAccess.getFUNCTION_ATTRIBUTESAccess().getReadonlyKeyword_13()); 
                    match(input,77,FOLLOW_77_in_rule__FUNCTION_ATTRIBUTES__Alternatives3776); 
                     after(grammarAccess.getFUNCTION_ATTRIBUTESAccess().getReadonlyKeyword_13()); 

                    }


                    }
                    break;
                case 15 :
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1728:6: ( 'returns_twice' )
                    {
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1728:6: ( 'returns_twice' )
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1729:1: 'returns_twice'
                    {
                     before(grammarAccess.getFUNCTION_ATTRIBUTESAccess().getReturns_twiceKeyword_14()); 
                    match(input,78,FOLLOW_78_in_rule__FUNCTION_ATTRIBUTES__Alternatives3796); 
                     after(grammarAccess.getFUNCTION_ATTRIBUTESAccess().getReturns_twiceKeyword_14()); 

                    }


                    }
                    break;
                case 16 :
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1736:6: ( 'ssp' )
                    {
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1736:6: ( 'ssp' )
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1737:1: 'ssp'
                    {
                     before(grammarAccess.getFUNCTION_ATTRIBUTESAccess().getSspKeyword_15()); 
                    match(input,79,FOLLOW_79_in_rule__FUNCTION_ATTRIBUTES__Alternatives3816); 
                     after(grammarAccess.getFUNCTION_ATTRIBUTESAccess().getSspKeyword_15()); 

                    }


                    }
                    break;
                case 17 :
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1744:6: ( 'sspreq' )
                    {
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1744:6: ( 'sspreq' )
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1745:1: 'sspreq'
                    {
                     before(grammarAccess.getFUNCTION_ATTRIBUTESAccess().getSspreqKeyword_16()); 
                    match(input,80,FOLLOW_80_in_rule__FUNCTION_ATTRIBUTES__Alternatives3836); 
                     after(grammarAccess.getFUNCTION_ATTRIBUTESAccess().getSspreqKeyword_16()); 

                    }


                    }
                    break;
                case 18 :
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1752:6: ( 'uwtable' )
                    {
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1752:6: ( 'uwtable' )
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1753:1: 'uwtable'
                    {
                     before(grammarAccess.getFUNCTION_ATTRIBUTESAccess().getUwtableKeyword_17()); 
                    match(input,81,FOLLOW_81_in_rule__FUNCTION_ATTRIBUTES__Alternatives3856); 
                     after(grammarAccess.getFUNCTION_ATTRIBUTESAccess().getUwtableKeyword_17()); 

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
    // $ANTLR end "rule__FUNCTION_ATTRIBUTES__Alternatives"


    // $ANTLR start "rule__VISIBILITY__Alternatives"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1765:1: rule__VISIBILITY__Alternatives : ( ( 'default' ) | ( 'hidden' ) | ( 'protected' ) );
    public final void rule__VISIBILITY__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1769:1: ( ( 'default' ) | ( 'hidden' ) | ( 'protected' ) )
            int alt20=3;
            switch ( input.LA(1) ) {
            case 82:
                {
                alt20=1;
                }
                break;
            case 83:
                {
                alt20=2;
                }
                break;
            case 84:
                {
                alt20=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1770:1: ( 'default' )
                    {
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1770:1: ( 'default' )
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1771:1: 'default'
                    {
                     before(grammarAccess.getVISIBILITYAccess().getDefaultKeyword_0()); 
                    match(input,82,FOLLOW_82_in_rule__VISIBILITY__Alternatives3891); 
                     after(grammarAccess.getVISIBILITYAccess().getDefaultKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1778:6: ( 'hidden' )
                    {
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1778:6: ( 'hidden' )
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1779:1: 'hidden'
                    {
                     before(grammarAccess.getVISIBILITYAccess().getHiddenKeyword_1()); 
                    match(input,83,FOLLOW_83_in_rule__VISIBILITY__Alternatives3911); 
                     after(grammarAccess.getVISIBILITYAccess().getHiddenKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1786:6: ( 'protected' )
                    {
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1786:6: ( 'protected' )
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1787:1: 'protected'
                    {
                     before(grammarAccess.getVISIBILITYAccess().getProtectedKeyword_2()); 
                    match(input,84,FOLLOW_84_in_rule__VISIBILITY__Alternatives3931); 
                     after(grammarAccess.getVISIBILITYAccess().getProtectedKeyword_2()); 

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
    // $ANTLR end "rule__VISIBILITY__Alternatives"


    // $ANTLR start "rule__LINKAGE__Alternatives"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1799:1: rule__LINKAGE__Alternatives : ( ( 'private' ) | ( 'linker_private' ) | ( 'linker_private_weak' ) | ( 'available_externally' ) | ( 'linkonce' ) | ( 'common' ) | ( 'appending' ) | ( 'extern_weak' ) | ( 'linkonce_odr' ) | ( 'linkonce_odr_auto_hide' ) | ( 'dllimport' ) | ( 'dllexport' ) | ( ruleALIAS_LINKAGE ) );
    public final void rule__LINKAGE__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1803:1: ( ( 'private' ) | ( 'linker_private' ) | ( 'linker_private_weak' ) | ( 'available_externally' ) | ( 'linkonce' ) | ( 'common' ) | ( 'appending' ) | ( 'extern_weak' ) | ( 'linkonce_odr' ) | ( 'linkonce_odr_auto_hide' ) | ( 'dllimport' ) | ( 'dllexport' ) | ( ruleALIAS_LINKAGE ) )
            int alt21=13;
            switch ( input.LA(1) ) {
            case 85:
                {
                alt21=1;
                }
                break;
            case 86:
                {
                alt21=2;
                }
                break;
            case 87:
                {
                alt21=3;
                }
                break;
            case 88:
                {
                alt21=4;
                }
                break;
            case 89:
                {
                alt21=5;
                }
                break;
            case 90:
                {
                alt21=6;
                }
                break;
            case 91:
                {
                alt21=7;
                }
                break;
            case 92:
                {
                alt21=8;
                }
                break;
            case 93:
                {
                alt21=9;
                }
                break;
            case 94:
                {
                alt21=10;
                }
                break;
            case 95:
                {
                alt21=11;
                }
                break;
            case 96:
                {
                alt21=12;
                }
                break;
            case 97:
            case 98:
            case 99:
            case 100:
                {
                alt21=13;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1804:1: ( 'private' )
                    {
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1804:1: ( 'private' )
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1805:1: 'private'
                    {
                     before(grammarAccess.getLINKAGEAccess().getPrivateKeyword_0()); 
                    match(input,85,FOLLOW_85_in_rule__LINKAGE__Alternatives3966); 
                     after(grammarAccess.getLINKAGEAccess().getPrivateKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1812:6: ( 'linker_private' )
                    {
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1812:6: ( 'linker_private' )
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1813:1: 'linker_private'
                    {
                     before(grammarAccess.getLINKAGEAccess().getLinker_privateKeyword_1()); 
                    match(input,86,FOLLOW_86_in_rule__LINKAGE__Alternatives3986); 
                     after(grammarAccess.getLINKAGEAccess().getLinker_privateKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1820:6: ( 'linker_private_weak' )
                    {
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1820:6: ( 'linker_private_weak' )
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1821:1: 'linker_private_weak'
                    {
                     before(grammarAccess.getLINKAGEAccess().getLinker_private_weakKeyword_2()); 
                    match(input,87,FOLLOW_87_in_rule__LINKAGE__Alternatives4006); 
                     after(grammarAccess.getLINKAGEAccess().getLinker_private_weakKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1828:6: ( 'available_externally' )
                    {
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1828:6: ( 'available_externally' )
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1829:1: 'available_externally'
                    {
                     before(grammarAccess.getLINKAGEAccess().getAvailable_externallyKeyword_3()); 
                    match(input,88,FOLLOW_88_in_rule__LINKAGE__Alternatives4026); 
                     after(grammarAccess.getLINKAGEAccess().getAvailable_externallyKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1836:6: ( 'linkonce' )
                    {
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1836:6: ( 'linkonce' )
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1837:1: 'linkonce'
                    {
                     before(grammarAccess.getLINKAGEAccess().getLinkonceKeyword_4()); 
                    match(input,89,FOLLOW_89_in_rule__LINKAGE__Alternatives4046); 
                     after(grammarAccess.getLINKAGEAccess().getLinkonceKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1844:6: ( 'common' )
                    {
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1844:6: ( 'common' )
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1845:1: 'common'
                    {
                     before(grammarAccess.getLINKAGEAccess().getCommonKeyword_5()); 
                    match(input,90,FOLLOW_90_in_rule__LINKAGE__Alternatives4066); 
                     after(grammarAccess.getLINKAGEAccess().getCommonKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1852:6: ( 'appending' )
                    {
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1852:6: ( 'appending' )
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1853:1: 'appending'
                    {
                     before(grammarAccess.getLINKAGEAccess().getAppendingKeyword_6()); 
                    match(input,91,FOLLOW_91_in_rule__LINKAGE__Alternatives4086); 
                     after(grammarAccess.getLINKAGEAccess().getAppendingKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1860:6: ( 'extern_weak' )
                    {
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1860:6: ( 'extern_weak' )
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1861:1: 'extern_weak'
                    {
                     before(grammarAccess.getLINKAGEAccess().getExtern_weakKeyword_7()); 
                    match(input,92,FOLLOW_92_in_rule__LINKAGE__Alternatives4106); 
                     after(grammarAccess.getLINKAGEAccess().getExtern_weakKeyword_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1868:6: ( 'linkonce_odr' )
                    {
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1868:6: ( 'linkonce_odr' )
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1869:1: 'linkonce_odr'
                    {
                     before(grammarAccess.getLINKAGEAccess().getLinkonce_odrKeyword_8()); 
                    match(input,93,FOLLOW_93_in_rule__LINKAGE__Alternatives4126); 
                     after(grammarAccess.getLINKAGEAccess().getLinkonce_odrKeyword_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1876:6: ( 'linkonce_odr_auto_hide' )
                    {
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1876:6: ( 'linkonce_odr_auto_hide' )
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1877:1: 'linkonce_odr_auto_hide'
                    {
                     before(grammarAccess.getLINKAGEAccess().getLinkonce_odr_auto_hideKeyword_9()); 
                    match(input,94,FOLLOW_94_in_rule__LINKAGE__Alternatives4146); 
                     after(grammarAccess.getLINKAGEAccess().getLinkonce_odr_auto_hideKeyword_9()); 

                    }


                    }
                    break;
                case 11 :
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1884:6: ( 'dllimport' )
                    {
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1884:6: ( 'dllimport' )
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1885:1: 'dllimport'
                    {
                     before(grammarAccess.getLINKAGEAccess().getDllimportKeyword_10()); 
                    match(input,95,FOLLOW_95_in_rule__LINKAGE__Alternatives4166); 
                     after(grammarAccess.getLINKAGEAccess().getDllimportKeyword_10()); 

                    }


                    }
                    break;
                case 12 :
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1892:6: ( 'dllexport' )
                    {
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1892:6: ( 'dllexport' )
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1893:1: 'dllexport'
                    {
                     before(grammarAccess.getLINKAGEAccess().getDllexportKeyword_11()); 
                    match(input,96,FOLLOW_96_in_rule__LINKAGE__Alternatives4186); 
                     after(grammarAccess.getLINKAGEAccess().getDllexportKeyword_11()); 

                    }


                    }
                    break;
                case 13 :
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1900:6: ( ruleALIAS_LINKAGE )
                    {
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1900:6: ( ruleALIAS_LINKAGE )
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1901:1: ruleALIAS_LINKAGE
                    {
                     before(grammarAccess.getLINKAGEAccess().getALIAS_LINKAGEParserRuleCall_12()); 
                    pushFollow(FOLLOW_ruleALIAS_LINKAGE_in_rule__LINKAGE__Alternatives4205);
                    ruleALIAS_LINKAGE();

                    state._fsp--;

                     after(grammarAccess.getLINKAGEAccess().getALIAS_LINKAGEParserRuleCall_12()); 

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
    // $ANTLR end "rule__LINKAGE__Alternatives"


    // $ANTLR start "rule__ALIAS_LINKAGE__Alternatives"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1911:1: rule__ALIAS_LINKAGE__Alternatives : ( ( 'external' ) | ( 'internal' ) | ( 'weak' ) | ( 'weak_odr' ) );
    public final void rule__ALIAS_LINKAGE__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1915:1: ( ( 'external' ) | ( 'internal' ) | ( 'weak' ) | ( 'weak_odr' ) )
            int alt22=4;
            switch ( input.LA(1) ) {
            case 97:
                {
                alt22=1;
                }
                break;
            case 98:
                {
                alt22=2;
                }
                break;
            case 99:
                {
                alt22=3;
                }
                break;
            case 100:
                {
                alt22=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1916:1: ( 'external' )
                    {
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1916:1: ( 'external' )
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1917:1: 'external'
                    {
                     before(grammarAccess.getALIAS_LINKAGEAccess().getExternalKeyword_0()); 
                    match(input,97,FOLLOW_97_in_rule__ALIAS_LINKAGE__Alternatives4238); 
                     after(grammarAccess.getALIAS_LINKAGEAccess().getExternalKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1924:6: ( 'internal' )
                    {
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1924:6: ( 'internal' )
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1925:1: 'internal'
                    {
                     before(grammarAccess.getALIAS_LINKAGEAccess().getInternalKeyword_1()); 
                    match(input,98,FOLLOW_98_in_rule__ALIAS_LINKAGE__Alternatives4258); 
                     after(grammarAccess.getALIAS_LINKAGEAccess().getInternalKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1932:6: ( 'weak' )
                    {
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1932:6: ( 'weak' )
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1933:1: 'weak'
                    {
                     before(grammarAccess.getALIAS_LINKAGEAccess().getWeakKeyword_2()); 
                    match(input,99,FOLLOW_99_in_rule__ALIAS_LINKAGE__Alternatives4278); 
                     after(grammarAccess.getALIAS_LINKAGEAccess().getWeakKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1940:6: ( 'weak_odr' )
                    {
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1940:6: ( 'weak_odr' )
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1941:1: 'weak_odr'
                    {
                     before(grammarAccess.getALIAS_LINKAGEAccess().getWeak_odrKeyword_3()); 
                    match(input,100,FOLLOW_100_in_rule__ALIAS_LINKAGE__Alternatives4298); 
                     after(grammarAccess.getALIAS_LINKAGEAccess().getWeak_odrKeyword_3()); 

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
    // $ANTLR end "rule__ALIAS_LINKAGE__Alternatives"


    // $ANTLR start "rule__AbstractElement__Group_0__0"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1955:1: rule__AbstractElement__Group_0__0 : rule__AbstractElement__Group_0__0__Impl rule__AbstractElement__Group_0__1 ;
    public final void rule__AbstractElement__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1959:1: ( rule__AbstractElement__Group_0__0__Impl rule__AbstractElement__Group_0__1 )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1960:2: rule__AbstractElement__Group_0__0__Impl rule__AbstractElement__Group_0__1
            {
            pushFollow(FOLLOW_rule__AbstractElement__Group_0__0__Impl_in_rule__AbstractElement__Group_0__04330);
            rule__AbstractElement__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AbstractElement__Group_0__1_in_rule__AbstractElement__Group_0__04333);
            rule__AbstractElement__Group_0__1();

            state._fsp--;


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
    // $ANTLR end "rule__AbstractElement__Group_0__0"


    // $ANTLR start "rule__AbstractElement__Group_0__0__Impl"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1967:1: rule__AbstractElement__Group_0__0__Impl : ( ruleTopLevelEntity ) ;
    public final void rule__AbstractElement__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1971:1: ( ( ruleTopLevelEntity ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1972:1: ( ruleTopLevelEntity )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1972:1: ( ruleTopLevelEntity )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1973:1: ruleTopLevelEntity
            {
             before(grammarAccess.getAbstractElementAccess().getTopLevelEntityParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleTopLevelEntity_in_rule__AbstractElement__Group_0__0__Impl4360);
            ruleTopLevelEntity();

            state._fsp--;

             after(grammarAccess.getAbstractElementAccess().getTopLevelEntityParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__AbstractElement__Group_0__0__Impl"


    // $ANTLR start "rule__AbstractElement__Group_0__1"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1984:1: rule__AbstractElement__Group_0__1 : rule__AbstractElement__Group_0__1__Impl ;
    public final void rule__AbstractElement__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1988:1: ( rule__AbstractElement__Group_0__1__Impl )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1989:2: rule__AbstractElement__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__AbstractElement__Group_0__1__Impl_in_rule__AbstractElement__Group_0__14389);
            rule__AbstractElement__Group_0__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__AbstractElement__Group_0__1"


    // $ANTLR start "rule__AbstractElement__Group_0__1__Impl"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1995:1: rule__AbstractElement__Group_0__1__Impl : ( ( RULE_SL_COMMENT )? ) ;
    public final void rule__AbstractElement__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:1999:1: ( ( ( RULE_SL_COMMENT )? ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2000:1: ( ( RULE_SL_COMMENT )? )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2000:1: ( ( RULE_SL_COMMENT )? )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2001:1: ( RULE_SL_COMMENT )?
            {
             before(grammarAccess.getAbstractElementAccess().getSL_COMMENTTerminalRuleCall_0_1()); 
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2002:1: ( RULE_SL_COMMENT )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_SL_COMMENT) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2002:3: RULE_SL_COMMENT
                    {
                    match(input,RULE_SL_COMMENT,FOLLOW_RULE_SL_COMMENT_in_rule__AbstractElement__Group_0__1__Impl4417); 

                    }
                    break;

            }

             after(grammarAccess.getAbstractElementAccess().getSL_COMMENTTerminalRuleCall_0_1()); 

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
    // $ANTLR end "rule__AbstractElement__Group_0__1__Impl"


    // $ANTLR start "rule__AbstractElement__Group_1__0"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2016:1: rule__AbstractElement__Group_1__0 : rule__AbstractElement__Group_1__0__Impl rule__AbstractElement__Group_1__1 ;
    public final void rule__AbstractElement__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2020:1: ( rule__AbstractElement__Group_1__0__Impl rule__AbstractElement__Group_1__1 )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2021:2: rule__AbstractElement__Group_1__0__Impl rule__AbstractElement__Group_1__1
            {
            pushFollow(FOLLOW_rule__AbstractElement__Group_1__0__Impl_in_rule__AbstractElement__Group_1__04452);
            rule__AbstractElement__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AbstractElement__Group_1__1_in_rule__AbstractElement__Group_1__04455);
            rule__AbstractElement__Group_1__1();

            state._fsp--;


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
    // $ANTLR end "rule__AbstractElement__Group_1__0"


    // $ANTLR start "rule__AbstractElement__Group_1__0__Impl"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2028:1: rule__AbstractElement__Group_1__0__Impl : ( ruleMainLevelEntity ) ;
    public final void rule__AbstractElement__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2032:1: ( ( ruleMainLevelEntity ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2033:1: ( ruleMainLevelEntity )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2033:1: ( ruleMainLevelEntity )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2034:1: ruleMainLevelEntity
            {
             before(grammarAccess.getAbstractElementAccess().getMainLevelEntityParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleMainLevelEntity_in_rule__AbstractElement__Group_1__0__Impl4482);
            ruleMainLevelEntity();

            state._fsp--;

             after(grammarAccess.getAbstractElementAccess().getMainLevelEntityParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__AbstractElement__Group_1__0__Impl"


    // $ANTLR start "rule__AbstractElement__Group_1__1"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2045:1: rule__AbstractElement__Group_1__1 : rule__AbstractElement__Group_1__1__Impl ;
    public final void rule__AbstractElement__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2049:1: ( rule__AbstractElement__Group_1__1__Impl )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2050:2: rule__AbstractElement__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__AbstractElement__Group_1__1__Impl_in_rule__AbstractElement__Group_1__14511);
            rule__AbstractElement__Group_1__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__AbstractElement__Group_1__1"


    // $ANTLR start "rule__AbstractElement__Group_1__1__Impl"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2056:1: rule__AbstractElement__Group_1__1__Impl : ( ( RULE_SL_COMMENT )? ) ;
    public final void rule__AbstractElement__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2060:1: ( ( ( RULE_SL_COMMENT )? ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2061:1: ( ( RULE_SL_COMMENT )? )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2061:1: ( ( RULE_SL_COMMENT )? )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2062:1: ( RULE_SL_COMMENT )?
            {
             before(grammarAccess.getAbstractElementAccess().getSL_COMMENTTerminalRuleCall_1_1()); 
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2063:1: ( RULE_SL_COMMENT )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_SL_COMMENT) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2063:3: RULE_SL_COMMENT
                    {
                    match(input,RULE_SL_COMMENT,FOLLOW_RULE_SL_COMMENT_in_rule__AbstractElement__Group_1__1__Impl4539); 

                    }
                    break;

            }

             after(grammarAccess.getAbstractElementAccess().getSL_COMMENTTerminalRuleCall_1_1()); 

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
    // $ANTLR end "rule__AbstractElement__Group_1__1__Impl"


    // $ANTLR start "rule__TopLevelEntity__Group_0__0"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2077:1: rule__TopLevelEntity__Group_0__0 : rule__TopLevelEntity__Group_0__0__Impl rule__TopLevelEntity__Group_0__1 ;
    public final void rule__TopLevelEntity__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2081:1: ( rule__TopLevelEntity__Group_0__0__Impl rule__TopLevelEntity__Group_0__1 )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2082:2: rule__TopLevelEntity__Group_0__0__Impl rule__TopLevelEntity__Group_0__1
            {
            pushFollow(FOLLOW_rule__TopLevelEntity__Group_0__0__Impl_in_rule__TopLevelEntity__Group_0__04574);
            rule__TopLevelEntity__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TopLevelEntity__Group_0__1_in_rule__TopLevelEntity__Group_0__04577);
            rule__TopLevelEntity__Group_0__1();

            state._fsp--;


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
    // $ANTLR end "rule__TopLevelEntity__Group_0__0"


    // $ANTLR start "rule__TopLevelEntity__Group_0__0__Impl"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2089:1: rule__TopLevelEntity__Group_0__0__Impl : ( 'module' ) ;
    public final void rule__TopLevelEntity__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2093:1: ( ( 'module' ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2094:1: ( 'module' )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2094:1: ( 'module' )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2095:1: 'module'
            {
             before(grammarAccess.getTopLevelEntityAccess().getModuleKeyword_0_0()); 
            match(input,101,FOLLOW_101_in_rule__TopLevelEntity__Group_0__0__Impl4605); 
             after(grammarAccess.getTopLevelEntityAccess().getModuleKeyword_0_0()); 

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
    // $ANTLR end "rule__TopLevelEntity__Group_0__0__Impl"


    // $ANTLR start "rule__TopLevelEntity__Group_0__1"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2108:1: rule__TopLevelEntity__Group_0__1 : rule__TopLevelEntity__Group_0__1__Impl rule__TopLevelEntity__Group_0__2 ;
    public final void rule__TopLevelEntity__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2112:1: ( rule__TopLevelEntity__Group_0__1__Impl rule__TopLevelEntity__Group_0__2 )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2113:2: rule__TopLevelEntity__Group_0__1__Impl rule__TopLevelEntity__Group_0__2
            {
            pushFollow(FOLLOW_rule__TopLevelEntity__Group_0__1__Impl_in_rule__TopLevelEntity__Group_0__14636);
            rule__TopLevelEntity__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TopLevelEntity__Group_0__2_in_rule__TopLevelEntity__Group_0__14639);
            rule__TopLevelEntity__Group_0__2();

            state._fsp--;


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
    // $ANTLR end "rule__TopLevelEntity__Group_0__1"


    // $ANTLR start "rule__TopLevelEntity__Group_0__1__Impl"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2120:1: rule__TopLevelEntity__Group_0__1__Impl : ( 'asm' ) ;
    public final void rule__TopLevelEntity__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2124:1: ( ( 'asm' ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2125:1: ( 'asm' )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2125:1: ( 'asm' )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2126:1: 'asm'
            {
             before(grammarAccess.getTopLevelEntityAccess().getAsmKeyword_0_1()); 
            match(input,102,FOLLOW_102_in_rule__TopLevelEntity__Group_0__1__Impl4667); 
             after(grammarAccess.getTopLevelEntityAccess().getAsmKeyword_0_1()); 

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
    // $ANTLR end "rule__TopLevelEntity__Group_0__1__Impl"


    // $ANTLR start "rule__TopLevelEntity__Group_0__2"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2139:1: rule__TopLevelEntity__Group_0__2 : rule__TopLevelEntity__Group_0__2__Impl ;
    public final void rule__TopLevelEntity__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2143:1: ( rule__TopLevelEntity__Group_0__2__Impl )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2144:2: rule__TopLevelEntity__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__TopLevelEntity__Group_0__2__Impl_in_rule__TopLevelEntity__Group_0__24698);
            rule__TopLevelEntity__Group_0__2__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__TopLevelEntity__Group_0__2"


    // $ANTLR start "rule__TopLevelEntity__Group_0__2__Impl"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2150:1: rule__TopLevelEntity__Group_0__2__Impl : ( ( rule__TopLevelEntity__ModuleAssignment_0_2 ) ) ;
    public final void rule__TopLevelEntity__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2154:1: ( ( ( rule__TopLevelEntity__ModuleAssignment_0_2 ) ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2155:1: ( ( rule__TopLevelEntity__ModuleAssignment_0_2 ) )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2155:1: ( ( rule__TopLevelEntity__ModuleAssignment_0_2 ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2156:1: ( rule__TopLevelEntity__ModuleAssignment_0_2 )
            {
             before(grammarAccess.getTopLevelEntityAccess().getModuleAssignment_0_2()); 
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2157:1: ( rule__TopLevelEntity__ModuleAssignment_0_2 )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2157:2: rule__TopLevelEntity__ModuleAssignment_0_2
            {
            pushFollow(FOLLOW_rule__TopLevelEntity__ModuleAssignment_0_2_in_rule__TopLevelEntity__Group_0__2__Impl4725);
            rule__TopLevelEntity__ModuleAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getTopLevelEntityAccess().getModuleAssignment_0_2()); 

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
    // $ANTLR end "rule__TopLevelEntity__Group_0__2__Impl"


    // $ANTLR start "rule__TopLevelEntity__Group_1__0"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2173:1: rule__TopLevelEntity__Group_1__0 : rule__TopLevelEntity__Group_1__0__Impl rule__TopLevelEntity__Group_1__1 ;
    public final void rule__TopLevelEntity__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2177:1: ( rule__TopLevelEntity__Group_1__0__Impl rule__TopLevelEntity__Group_1__1 )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2178:2: rule__TopLevelEntity__Group_1__0__Impl rule__TopLevelEntity__Group_1__1
            {
            pushFollow(FOLLOW_rule__TopLevelEntity__Group_1__0__Impl_in_rule__TopLevelEntity__Group_1__04761);
            rule__TopLevelEntity__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TopLevelEntity__Group_1__1_in_rule__TopLevelEntity__Group_1__04764);
            rule__TopLevelEntity__Group_1__1();

            state._fsp--;


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
    // $ANTLR end "rule__TopLevelEntity__Group_1__0"


    // $ANTLR start "rule__TopLevelEntity__Group_1__0__Impl"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2185:1: rule__TopLevelEntity__Group_1__0__Impl : ( 'target' ) ;
    public final void rule__TopLevelEntity__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2189:1: ( ( 'target' ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2190:1: ( 'target' )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2190:1: ( 'target' )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2191:1: 'target'
            {
             before(grammarAccess.getTopLevelEntityAccess().getTargetKeyword_1_0()); 
            match(input,103,FOLLOW_103_in_rule__TopLevelEntity__Group_1__0__Impl4792); 
             after(grammarAccess.getTopLevelEntityAccess().getTargetKeyword_1_0()); 

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
    // $ANTLR end "rule__TopLevelEntity__Group_1__0__Impl"


    // $ANTLR start "rule__TopLevelEntity__Group_1__1"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2204:1: rule__TopLevelEntity__Group_1__1 : rule__TopLevelEntity__Group_1__1__Impl rule__TopLevelEntity__Group_1__2 ;
    public final void rule__TopLevelEntity__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2208:1: ( rule__TopLevelEntity__Group_1__1__Impl rule__TopLevelEntity__Group_1__2 )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2209:2: rule__TopLevelEntity__Group_1__1__Impl rule__TopLevelEntity__Group_1__2
            {
            pushFollow(FOLLOW_rule__TopLevelEntity__Group_1__1__Impl_in_rule__TopLevelEntity__Group_1__14823);
            rule__TopLevelEntity__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TopLevelEntity__Group_1__2_in_rule__TopLevelEntity__Group_1__14826);
            rule__TopLevelEntity__Group_1__2();

            state._fsp--;


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
    // $ANTLR end "rule__TopLevelEntity__Group_1__1"


    // $ANTLR start "rule__TopLevelEntity__Group_1__1__Impl"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2216:1: rule__TopLevelEntity__Group_1__1__Impl : ( ( rule__TopLevelEntity__Alternatives_1_1 ) ) ;
    public final void rule__TopLevelEntity__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2220:1: ( ( ( rule__TopLevelEntity__Alternatives_1_1 ) ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2221:1: ( ( rule__TopLevelEntity__Alternatives_1_1 ) )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2221:1: ( ( rule__TopLevelEntity__Alternatives_1_1 ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2222:1: ( rule__TopLevelEntity__Alternatives_1_1 )
            {
             before(grammarAccess.getTopLevelEntityAccess().getAlternatives_1_1()); 
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2223:1: ( rule__TopLevelEntity__Alternatives_1_1 )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2223:2: rule__TopLevelEntity__Alternatives_1_1
            {
            pushFollow(FOLLOW_rule__TopLevelEntity__Alternatives_1_1_in_rule__TopLevelEntity__Group_1__1__Impl4853);
            rule__TopLevelEntity__Alternatives_1_1();

            state._fsp--;


            }

             after(grammarAccess.getTopLevelEntityAccess().getAlternatives_1_1()); 

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
    // $ANTLR end "rule__TopLevelEntity__Group_1__1__Impl"


    // $ANTLR start "rule__TopLevelEntity__Group_1__2"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2233:1: rule__TopLevelEntity__Group_1__2 : rule__TopLevelEntity__Group_1__2__Impl rule__TopLevelEntity__Group_1__3 ;
    public final void rule__TopLevelEntity__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2237:1: ( rule__TopLevelEntity__Group_1__2__Impl rule__TopLevelEntity__Group_1__3 )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2238:2: rule__TopLevelEntity__Group_1__2__Impl rule__TopLevelEntity__Group_1__3
            {
            pushFollow(FOLLOW_rule__TopLevelEntity__Group_1__2__Impl_in_rule__TopLevelEntity__Group_1__24883);
            rule__TopLevelEntity__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TopLevelEntity__Group_1__3_in_rule__TopLevelEntity__Group_1__24886);
            rule__TopLevelEntity__Group_1__3();

            state._fsp--;


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
    // $ANTLR end "rule__TopLevelEntity__Group_1__2"


    // $ANTLR start "rule__TopLevelEntity__Group_1__2__Impl"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2245:1: rule__TopLevelEntity__Group_1__2__Impl : ( '=' ) ;
    public final void rule__TopLevelEntity__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2249:1: ( ( '=' ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2250:1: ( '=' )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2250:1: ( '=' )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2251:1: '='
            {
             before(grammarAccess.getTopLevelEntityAccess().getEqualsSignKeyword_1_2()); 
            match(input,104,FOLLOW_104_in_rule__TopLevelEntity__Group_1__2__Impl4914); 
             after(grammarAccess.getTopLevelEntityAccess().getEqualsSignKeyword_1_2()); 

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
    // $ANTLR end "rule__TopLevelEntity__Group_1__2__Impl"


    // $ANTLR start "rule__TopLevelEntity__Group_1__3"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2264:1: rule__TopLevelEntity__Group_1__3 : rule__TopLevelEntity__Group_1__3__Impl ;
    public final void rule__TopLevelEntity__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2268:1: ( rule__TopLevelEntity__Group_1__3__Impl )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2269:2: rule__TopLevelEntity__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__TopLevelEntity__Group_1__3__Impl_in_rule__TopLevelEntity__Group_1__34945);
            rule__TopLevelEntity__Group_1__3__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__TopLevelEntity__Group_1__3"


    // $ANTLR start "rule__TopLevelEntity__Group_1__3__Impl"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2275:1: rule__TopLevelEntity__Group_1__3__Impl : ( ( rule__TopLevelEntity__TargetAssignment_1_3 ) ) ;
    public final void rule__TopLevelEntity__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2279:1: ( ( ( rule__TopLevelEntity__TargetAssignment_1_3 ) ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2280:1: ( ( rule__TopLevelEntity__TargetAssignment_1_3 ) )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2280:1: ( ( rule__TopLevelEntity__TargetAssignment_1_3 ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2281:1: ( rule__TopLevelEntity__TargetAssignment_1_3 )
            {
             before(grammarAccess.getTopLevelEntityAccess().getTargetAssignment_1_3()); 
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2282:1: ( rule__TopLevelEntity__TargetAssignment_1_3 )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2282:2: rule__TopLevelEntity__TargetAssignment_1_3
            {
            pushFollow(FOLLOW_rule__TopLevelEntity__TargetAssignment_1_3_in_rule__TopLevelEntity__Group_1__3__Impl4972);
            rule__TopLevelEntity__TargetAssignment_1_3();

            state._fsp--;


            }

             after(grammarAccess.getTopLevelEntityAccess().getTargetAssignment_1_3()); 

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
    // $ANTLR end "rule__TopLevelEntity__Group_1__3__Impl"


    // $ANTLR start "rule__TopLevelEntity__Group_2__0"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2300:1: rule__TopLevelEntity__Group_2__0 : rule__TopLevelEntity__Group_2__0__Impl rule__TopLevelEntity__Group_2__1 ;
    public final void rule__TopLevelEntity__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2304:1: ( rule__TopLevelEntity__Group_2__0__Impl rule__TopLevelEntity__Group_2__1 )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2305:2: rule__TopLevelEntity__Group_2__0__Impl rule__TopLevelEntity__Group_2__1
            {
            pushFollow(FOLLOW_rule__TopLevelEntity__Group_2__0__Impl_in_rule__TopLevelEntity__Group_2__05010);
            rule__TopLevelEntity__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TopLevelEntity__Group_2__1_in_rule__TopLevelEntity__Group_2__05013);
            rule__TopLevelEntity__Group_2__1();

            state._fsp--;


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
    // $ANTLR end "rule__TopLevelEntity__Group_2__0"


    // $ANTLR start "rule__TopLevelEntity__Group_2__0__Impl"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2312:1: rule__TopLevelEntity__Group_2__0__Impl : ( 'deplibs' ) ;
    public final void rule__TopLevelEntity__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2316:1: ( ( 'deplibs' ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2317:1: ( 'deplibs' )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2317:1: ( 'deplibs' )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2318:1: 'deplibs'
            {
             before(grammarAccess.getTopLevelEntityAccess().getDeplibsKeyword_2_0()); 
            match(input,105,FOLLOW_105_in_rule__TopLevelEntity__Group_2__0__Impl5041); 
             after(grammarAccess.getTopLevelEntityAccess().getDeplibsKeyword_2_0()); 

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
    // $ANTLR end "rule__TopLevelEntity__Group_2__0__Impl"


    // $ANTLR start "rule__TopLevelEntity__Group_2__1"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2331:1: rule__TopLevelEntity__Group_2__1 : rule__TopLevelEntity__Group_2__1__Impl rule__TopLevelEntity__Group_2__2 ;
    public final void rule__TopLevelEntity__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2335:1: ( rule__TopLevelEntity__Group_2__1__Impl rule__TopLevelEntity__Group_2__2 )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2336:2: rule__TopLevelEntity__Group_2__1__Impl rule__TopLevelEntity__Group_2__2
            {
            pushFollow(FOLLOW_rule__TopLevelEntity__Group_2__1__Impl_in_rule__TopLevelEntity__Group_2__15072);
            rule__TopLevelEntity__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TopLevelEntity__Group_2__2_in_rule__TopLevelEntity__Group_2__15075);
            rule__TopLevelEntity__Group_2__2();

            state._fsp--;


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
    // $ANTLR end "rule__TopLevelEntity__Group_2__1"


    // $ANTLR start "rule__TopLevelEntity__Group_2__1__Impl"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2343:1: rule__TopLevelEntity__Group_2__1__Impl : ( '=' ) ;
    public final void rule__TopLevelEntity__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2347:1: ( ( '=' ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2348:1: ( '=' )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2348:1: ( '=' )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2349:1: '='
            {
             before(grammarAccess.getTopLevelEntityAccess().getEqualsSignKeyword_2_1()); 
            match(input,104,FOLLOW_104_in_rule__TopLevelEntity__Group_2__1__Impl5103); 
             after(grammarAccess.getTopLevelEntityAccess().getEqualsSignKeyword_2_1()); 

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
    // $ANTLR end "rule__TopLevelEntity__Group_2__1__Impl"


    // $ANTLR start "rule__TopLevelEntity__Group_2__2"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2362:1: rule__TopLevelEntity__Group_2__2 : rule__TopLevelEntity__Group_2__2__Impl rule__TopLevelEntity__Group_2__3 ;
    public final void rule__TopLevelEntity__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2366:1: ( rule__TopLevelEntity__Group_2__2__Impl rule__TopLevelEntity__Group_2__3 )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2367:2: rule__TopLevelEntity__Group_2__2__Impl rule__TopLevelEntity__Group_2__3
            {
            pushFollow(FOLLOW_rule__TopLevelEntity__Group_2__2__Impl_in_rule__TopLevelEntity__Group_2__25134);
            rule__TopLevelEntity__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TopLevelEntity__Group_2__3_in_rule__TopLevelEntity__Group_2__25137);
            rule__TopLevelEntity__Group_2__3();

            state._fsp--;


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
    // $ANTLR end "rule__TopLevelEntity__Group_2__2"


    // $ANTLR start "rule__TopLevelEntity__Group_2__2__Impl"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2374:1: rule__TopLevelEntity__Group_2__2__Impl : ( RULE_ARRAYL ) ;
    public final void rule__TopLevelEntity__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2378:1: ( ( RULE_ARRAYL ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2379:1: ( RULE_ARRAYL )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2379:1: ( RULE_ARRAYL )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2380:1: RULE_ARRAYL
            {
             before(grammarAccess.getTopLevelEntityAccess().getARRAYLTerminalRuleCall_2_2()); 
            match(input,RULE_ARRAYL,FOLLOW_RULE_ARRAYL_in_rule__TopLevelEntity__Group_2__2__Impl5164); 
             after(grammarAccess.getTopLevelEntityAccess().getARRAYLTerminalRuleCall_2_2()); 

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
    // $ANTLR end "rule__TopLevelEntity__Group_2__2__Impl"


    // $ANTLR start "rule__TopLevelEntity__Group_2__3"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2391:1: rule__TopLevelEntity__Group_2__3 : rule__TopLevelEntity__Group_2__3__Impl rule__TopLevelEntity__Group_2__4 ;
    public final void rule__TopLevelEntity__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2395:1: ( rule__TopLevelEntity__Group_2__3__Impl rule__TopLevelEntity__Group_2__4 )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2396:2: rule__TopLevelEntity__Group_2__3__Impl rule__TopLevelEntity__Group_2__4
            {
            pushFollow(FOLLOW_rule__TopLevelEntity__Group_2__3__Impl_in_rule__TopLevelEntity__Group_2__35193);
            rule__TopLevelEntity__Group_2__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TopLevelEntity__Group_2__4_in_rule__TopLevelEntity__Group_2__35196);
            rule__TopLevelEntity__Group_2__4();

            state._fsp--;


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
    // $ANTLR end "rule__TopLevelEntity__Group_2__3"


    // $ANTLR start "rule__TopLevelEntity__Group_2__3__Impl"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2403:1: rule__TopLevelEntity__Group_2__3__Impl : ( ( rule__TopLevelEntity__LibsAssignment_2_3 ) ) ;
    public final void rule__TopLevelEntity__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2407:1: ( ( ( rule__TopLevelEntity__LibsAssignment_2_3 ) ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2408:1: ( ( rule__TopLevelEntity__LibsAssignment_2_3 ) )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2408:1: ( ( rule__TopLevelEntity__LibsAssignment_2_3 ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2409:1: ( rule__TopLevelEntity__LibsAssignment_2_3 )
            {
             before(grammarAccess.getTopLevelEntityAccess().getLibsAssignment_2_3()); 
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2410:1: ( rule__TopLevelEntity__LibsAssignment_2_3 )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2410:2: rule__TopLevelEntity__LibsAssignment_2_3
            {
            pushFollow(FOLLOW_rule__TopLevelEntity__LibsAssignment_2_3_in_rule__TopLevelEntity__Group_2__3__Impl5223);
            rule__TopLevelEntity__LibsAssignment_2_3();

            state._fsp--;


            }

             after(grammarAccess.getTopLevelEntityAccess().getLibsAssignment_2_3()); 

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
    // $ANTLR end "rule__TopLevelEntity__Group_2__3__Impl"


    // $ANTLR start "rule__TopLevelEntity__Group_2__4"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2420:1: rule__TopLevelEntity__Group_2__4 : rule__TopLevelEntity__Group_2__4__Impl rule__TopLevelEntity__Group_2__5 ;
    public final void rule__TopLevelEntity__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2424:1: ( rule__TopLevelEntity__Group_2__4__Impl rule__TopLevelEntity__Group_2__5 )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2425:2: rule__TopLevelEntity__Group_2__4__Impl rule__TopLevelEntity__Group_2__5
            {
            pushFollow(FOLLOW_rule__TopLevelEntity__Group_2__4__Impl_in_rule__TopLevelEntity__Group_2__45253);
            rule__TopLevelEntity__Group_2__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TopLevelEntity__Group_2__5_in_rule__TopLevelEntity__Group_2__45256);
            rule__TopLevelEntity__Group_2__5();

            state._fsp--;


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
    // $ANTLR end "rule__TopLevelEntity__Group_2__4"


    // $ANTLR start "rule__TopLevelEntity__Group_2__4__Impl"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2432:1: rule__TopLevelEntity__Group_2__4__Impl : ( ( rule__TopLevelEntity__Group_2_4__0 )* ) ;
    public final void rule__TopLevelEntity__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2436:1: ( ( ( rule__TopLevelEntity__Group_2_4__0 )* ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2437:1: ( ( rule__TopLevelEntity__Group_2_4__0 )* )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2437:1: ( ( rule__TopLevelEntity__Group_2_4__0 )* )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2438:1: ( rule__TopLevelEntity__Group_2_4__0 )*
            {
             before(grammarAccess.getTopLevelEntityAccess().getGroup_2_4()); 
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2439:1: ( rule__TopLevelEntity__Group_2_4__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==106) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2439:2: rule__TopLevelEntity__Group_2_4__0
            	    {
            	    pushFollow(FOLLOW_rule__TopLevelEntity__Group_2_4__0_in_rule__TopLevelEntity__Group_2__4__Impl5283);
            	    rule__TopLevelEntity__Group_2_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getTopLevelEntityAccess().getGroup_2_4()); 

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
    // $ANTLR end "rule__TopLevelEntity__Group_2__4__Impl"


    // $ANTLR start "rule__TopLevelEntity__Group_2__5"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2449:1: rule__TopLevelEntity__Group_2__5 : rule__TopLevelEntity__Group_2__5__Impl ;
    public final void rule__TopLevelEntity__Group_2__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2453:1: ( rule__TopLevelEntity__Group_2__5__Impl )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2454:2: rule__TopLevelEntity__Group_2__5__Impl
            {
            pushFollow(FOLLOW_rule__TopLevelEntity__Group_2__5__Impl_in_rule__TopLevelEntity__Group_2__55314);
            rule__TopLevelEntity__Group_2__5__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__TopLevelEntity__Group_2__5"


    // $ANTLR start "rule__TopLevelEntity__Group_2__5__Impl"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2460:1: rule__TopLevelEntity__Group_2__5__Impl : ( RULE_ARRAYR ) ;
    public final void rule__TopLevelEntity__Group_2__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2464:1: ( ( RULE_ARRAYR ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2465:1: ( RULE_ARRAYR )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2465:1: ( RULE_ARRAYR )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2466:1: RULE_ARRAYR
            {
             before(grammarAccess.getTopLevelEntityAccess().getARRAYRTerminalRuleCall_2_5()); 
            match(input,RULE_ARRAYR,FOLLOW_RULE_ARRAYR_in_rule__TopLevelEntity__Group_2__5__Impl5341); 
             after(grammarAccess.getTopLevelEntityAccess().getARRAYRTerminalRuleCall_2_5()); 

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
    // $ANTLR end "rule__TopLevelEntity__Group_2__5__Impl"


    // $ANTLR start "rule__TopLevelEntity__Group_2_4__0"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2489:1: rule__TopLevelEntity__Group_2_4__0 : rule__TopLevelEntity__Group_2_4__0__Impl rule__TopLevelEntity__Group_2_4__1 ;
    public final void rule__TopLevelEntity__Group_2_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2493:1: ( rule__TopLevelEntity__Group_2_4__0__Impl rule__TopLevelEntity__Group_2_4__1 )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2494:2: rule__TopLevelEntity__Group_2_4__0__Impl rule__TopLevelEntity__Group_2_4__1
            {
            pushFollow(FOLLOW_rule__TopLevelEntity__Group_2_4__0__Impl_in_rule__TopLevelEntity__Group_2_4__05382);
            rule__TopLevelEntity__Group_2_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TopLevelEntity__Group_2_4__1_in_rule__TopLevelEntity__Group_2_4__05385);
            rule__TopLevelEntity__Group_2_4__1();

            state._fsp--;


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
    // $ANTLR end "rule__TopLevelEntity__Group_2_4__0"


    // $ANTLR start "rule__TopLevelEntity__Group_2_4__0__Impl"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2501:1: rule__TopLevelEntity__Group_2_4__0__Impl : ( ',' ) ;
    public final void rule__TopLevelEntity__Group_2_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2505:1: ( ( ',' ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2506:1: ( ',' )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2506:1: ( ',' )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2507:1: ','
            {
             before(grammarAccess.getTopLevelEntityAccess().getCommaKeyword_2_4_0()); 
            match(input,106,FOLLOW_106_in_rule__TopLevelEntity__Group_2_4__0__Impl5413); 
             after(grammarAccess.getTopLevelEntityAccess().getCommaKeyword_2_4_0()); 

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
    // $ANTLR end "rule__TopLevelEntity__Group_2_4__0__Impl"


    // $ANTLR start "rule__TopLevelEntity__Group_2_4__1"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2520:1: rule__TopLevelEntity__Group_2_4__1 : rule__TopLevelEntity__Group_2_4__1__Impl ;
    public final void rule__TopLevelEntity__Group_2_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2524:1: ( rule__TopLevelEntity__Group_2_4__1__Impl )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2525:2: rule__TopLevelEntity__Group_2_4__1__Impl
            {
            pushFollow(FOLLOW_rule__TopLevelEntity__Group_2_4__1__Impl_in_rule__TopLevelEntity__Group_2_4__15444);
            rule__TopLevelEntity__Group_2_4__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__TopLevelEntity__Group_2_4__1"


    // $ANTLR start "rule__TopLevelEntity__Group_2_4__1__Impl"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2531:1: rule__TopLevelEntity__Group_2_4__1__Impl : ( ( rule__TopLevelEntity__LibsAssignment_2_4_1 ) ) ;
    public final void rule__TopLevelEntity__Group_2_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2535:1: ( ( ( rule__TopLevelEntity__LibsAssignment_2_4_1 ) ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2536:1: ( ( rule__TopLevelEntity__LibsAssignment_2_4_1 ) )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2536:1: ( ( rule__TopLevelEntity__LibsAssignment_2_4_1 ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2537:1: ( rule__TopLevelEntity__LibsAssignment_2_4_1 )
            {
             before(grammarAccess.getTopLevelEntityAccess().getLibsAssignment_2_4_1()); 
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2538:1: ( rule__TopLevelEntity__LibsAssignment_2_4_1 )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2538:2: rule__TopLevelEntity__LibsAssignment_2_4_1
            {
            pushFollow(FOLLOW_rule__TopLevelEntity__LibsAssignment_2_4_1_in_rule__TopLevelEntity__Group_2_4__1__Impl5471);
            rule__TopLevelEntity__LibsAssignment_2_4_1();

            state._fsp--;


            }

             after(grammarAccess.getTopLevelEntityAccess().getLibsAssignment_2_4_1()); 

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
    // $ANTLR end "rule__TopLevelEntity__Group_2_4__1__Impl"


    // $ANTLR start "rule__TypeDefinition__Group__0"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2552:1: rule__TypeDefinition__Group__0 : rule__TypeDefinition__Group__0__Impl rule__TypeDefinition__Group__1 ;
    public final void rule__TypeDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2556:1: ( rule__TypeDefinition__Group__0__Impl rule__TypeDefinition__Group__1 )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2557:2: rule__TypeDefinition__Group__0__Impl rule__TypeDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__TypeDefinition__Group__0__Impl_in_rule__TypeDefinition__Group__05505);
            rule__TypeDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeDefinition__Group__1_in_rule__TypeDefinition__Group__05508);
            rule__TypeDefinition__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__TypeDefinition__Group__0"


    // $ANTLR start "rule__TypeDefinition__Group__0__Impl"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2564:1: rule__TypeDefinition__Group__0__Impl : ( ( rule__TypeDefinition__AddressAssignment_0 ) ) ;
    public final void rule__TypeDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2568:1: ( ( ( rule__TypeDefinition__AddressAssignment_0 ) ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2569:1: ( ( rule__TypeDefinition__AddressAssignment_0 ) )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2569:1: ( ( rule__TypeDefinition__AddressAssignment_0 ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2570:1: ( rule__TypeDefinition__AddressAssignment_0 )
            {
             before(grammarAccess.getTypeDefinitionAccess().getAddressAssignment_0()); 
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2571:1: ( rule__TypeDefinition__AddressAssignment_0 )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2571:2: rule__TypeDefinition__AddressAssignment_0
            {
            pushFollow(FOLLOW_rule__TypeDefinition__AddressAssignment_0_in_rule__TypeDefinition__Group__0__Impl5535);
            rule__TypeDefinition__AddressAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTypeDefinitionAccess().getAddressAssignment_0()); 

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
    // $ANTLR end "rule__TypeDefinition__Group__0__Impl"


    // $ANTLR start "rule__TypeDefinition__Group__1"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2581:1: rule__TypeDefinition__Group__1 : rule__TypeDefinition__Group__1__Impl rule__TypeDefinition__Group__2 ;
    public final void rule__TypeDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2585:1: ( rule__TypeDefinition__Group__1__Impl rule__TypeDefinition__Group__2 )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2586:2: rule__TypeDefinition__Group__1__Impl rule__TypeDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__TypeDefinition__Group__1__Impl_in_rule__TypeDefinition__Group__15565);
            rule__TypeDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeDefinition__Group__2_in_rule__TypeDefinition__Group__15568);
            rule__TypeDefinition__Group__2();

            state._fsp--;


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
    // $ANTLR end "rule__TypeDefinition__Group__1"


    // $ANTLR start "rule__TypeDefinition__Group__1__Impl"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2593:1: rule__TypeDefinition__Group__1__Impl : ( '=' ) ;
    public final void rule__TypeDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2597:1: ( ( '=' ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2598:1: ( '=' )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2598:1: ( '=' )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2599:1: '='
            {
             before(grammarAccess.getTypeDefinitionAccess().getEqualsSignKeyword_1()); 
            match(input,104,FOLLOW_104_in_rule__TypeDefinition__Group__1__Impl5596); 
             after(grammarAccess.getTypeDefinitionAccess().getEqualsSignKeyword_1()); 

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
    // $ANTLR end "rule__TypeDefinition__Group__1__Impl"


    // $ANTLR start "rule__TypeDefinition__Group__2"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2612:1: rule__TypeDefinition__Group__2 : rule__TypeDefinition__Group__2__Impl rule__TypeDefinition__Group__3 ;
    public final void rule__TypeDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2616:1: ( rule__TypeDefinition__Group__2__Impl rule__TypeDefinition__Group__3 )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2617:2: rule__TypeDefinition__Group__2__Impl rule__TypeDefinition__Group__3
            {
            pushFollow(FOLLOW_rule__TypeDefinition__Group__2__Impl_in_rule__TypeDefinition__Group__25627);
            rule__TypeDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeDefinition__Group__3_in_rule__TypeDefinition__Group__25630);
            rule__TypeDefinition__Group__3();

            state._fsp--;


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
    // $ANTLR end "rule__TypeDefinition__Group__2"


    // $ANTLR start "rule__TypeDefinition__Group__2__Impl"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2624:1: rule__TypeDefinition__Group__2__Impl : ( ( rule__TypeDefinition__Alternatives_2 )* ) ;
    public final void rule__TypeDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2628:1: ( ( ( rule__TypeDefinition__Alternatives_2 )* ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2629:1: ( ( rule__TypeDefinition__Alternatives_2 )* )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2629:1: ( ( rule__TypeDefinition__Alternatives_2 )* )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2630:1: ( rule__TypeDefinition__Alternatives_2 )*
            {
             before(grammarAccess.getTypeDefinitionAccess().getAlternatives_2()); 
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2631:1: ( rule__TypeDefinition__Alternatives_2 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=21 && LA26_0<=23)||(LA26_0>=85 && LA26_0<=100)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2631:2: rule__TypeDefinition__Alternatives_2
            	    {
            	    pushFollow(FOLLOW_rule__TypeDefinition__Alternatives_2_in_rule__TypeDefinition__Group__2__Impl5657);
            	    rule__TypeDefinition__Alternatives_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getTypeDefinitionAccess().getAlternatives_2()); 

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
    // $ANTLR end "rule__TypeDefinition__Group__2__Impl"


    // $ANTLR start "rule__TypeDefinition__Group__3"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2641:1: rule__TypeDefinition__Group__3 : rule__TypeDefinition__Group__3__Impl ;
    public final void rule__TypeDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2645:1: ( rule__TypeDefinition__Group__3__Impl )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2646:2: rule__TypeDefinition__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__TypeDefinition__Group__3__Impl_in_rule__TypeDefinition__Group__35688);
            rule__TypeDefinition__Group__3__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__TypeDefinition__Group__3"


    // $ANTLR start "rule__TypeDefinition__Group__3__Impl"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2652:1: rule__TypeDefinition__Group__3__Impl : ( ( rule__TypeDefinition__Group_3__0 ) ) ;
    public final void rule__TypeDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2656:1: ( ( ( rule__TypeDefinition__Group_3__0 ) ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2657:1: ( ( rule__TypeDefinition__Group_3__0 ) )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2657:1: ( ( rule__TypeDefinition__Group_3__0 ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2658:1: ( rule__TypeDefinition__Group_3__0 )
            {
             before(grammarAccess.getTypeDefinitionAccess().getGroup_3()); 
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2659:1: ( rule__TypeDefinition__Group_3__0 )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2659:2: rule__TypeDefinition__Group_3__0
            {
            pushFollow(FOLLOW_rule__TypeDefinition__Group_3__0_in_rule__TypeDefinition__Group__3__Impl5715);
            rule__TypeDefinition__Group_3__0();

            state._fsp--;


            }

             after(grammarAccess.getTypeDefinitionAccess().getGroup_3()); 

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
    // $ANTLR end "rule__TypeDefinition__Group__3__Impl"


    // $ANTLR start "rule__TypeDefinition__Group_3__0"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2677:1: rule__TypeDefinition__Group_3__0 : rule__TypeDefinition__Group_3__0__Impl rule__TypeDefinition__Group_3__1 ;
    public final void rule__TypeDefinition__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2681:1: ( rule__TypeDefinition__Group_3__0__Impl rule__TypeDefinition__Group_3__1 )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2682:2: rule__TypeDefinition__Group_3__0__Impl rule__TypeDefinition__Group_3__1
            {
            pushFollow(FOLLOW_rule__TypeDefinition__Group_3__0__Impl_in_rule__TypeDefinition__Group_3__05753);
            rule__TypeDefinition__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeDefinition__Group_3__1_in_rule__TypeDefinition__Group_3__05756);
            rule__TypeDefinition__Group_3__1();

            state._fsp--;


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
    // $ANTLR end "rule__TypeDefinition__Group_3__0"


    // $ANTLR start "rule__TypeDefinition__Group_3__0__Impl"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2689:1: rule__TypeDefinition__Group_3__0__Impl : ( 'type' ) ;
    public final void rule__TypeDefinition__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2693:1: ( ( 'type' ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2694:1: ( 'type' )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2694:1: ( 'type' )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2695:1: 'type'
            {
             before(grammarAccess.getTypeDefinitionAccess().getTypeKeyword_3_0()); 
            match(input,107,FOLLOW_107_in_rule__TypeDefinition__Group_3__0__Impl5784); 
             after(grammarAccess.getTypeDefinitionAccess().getTypeKeyword_3_0()); 

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
    // $ANTLR end "rule__TypeDefinition__Group_3__0__Impl"


    // $ANTLR start "rule__TypeDefinition__Group_3__1"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2708:1: rule__TypeDefinition__Group_3__1 : rule__TypeDefinition__Group_3__1__Impl ;
    public final void rule__TypeDefinition__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2712:1: ( rule__TypeDefinition__Group_3__1__Impl )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2713:2: rule__TypeDefinition__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__TypeDefinition__Group_3__1__Impl_in_rule__TypeDefinition__Group_3__15815);
            rule__TypeDefinition__Group_3__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__TypeDefinition__Group_3__1"


    // $ANTLR start "rule__TypeDefinition__Group_3__1__Impl"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2719:1: rule__TypeDefinition__Group_3__1__Impl : ( ( rule__TypeDefinition__Alternatives_3_1 ) ) ;
    public final void rule__TypeDefinition__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2723:1: ( ( ( rule__TypeDefinition__Alternatives_3_1 ) ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2724:1: ( ( rule__TypeDefinition__Alternatives_3_1 ) )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2724:1: ( ( rule__TypeDefinition__Alternatives_3_1 ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2725:1: ( rule__TypeDefinition__Alternatives_3_1 )
            {
             before(grammarAccess.getTypeDefinitionAccess().getAlternatives_3_1()); 
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2726:1: ( rule__TypeDefinition__Alternatives_3_1 )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2726:2: rule__TypeDefinition__Alternatives_3_1
            {
            pushFollow(FOLLOW_rule__TypeDefinition__Alternatives_3_1_in_rule__TypeDefinition__Group_3__1__Impl5842);
            rule__TypeDefinition__Alternatives_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTypeDefinitionAccess().getAlternatives_3_1()); 

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
    // $ANTLR end "rule__TypeDefinition__Group_3__1__Impl"


    // $ANTLR start "rule__FunctionDefinition__Group_0__0"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2740:1: rule__FunctionDefinition__Group_0__0 : rule__FunctionDefinition__Group_0__0__Impl rule__FunctionDefinition__Group_0__1 ;
    public final void rule__FunctionDefinition__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2744:1: ( rule__FunctionDefinition__Group_0__0__Impl rule__FunctionDefinition__Group_0__1 )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2745:2: rule__FunctionDefinition__Group_0__0__Impl rule__FunctionDefinition__Group_0__1
            {
            pushFollow(FOLLOW_rule__FunctionDefinition__Group_0__0__Impl_in_rule__FunctionDefinition__Group_0__05876);
            rule__FunctionDefinition__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FunctionDefinition__Group_0__1_in_rule__FunctionDefinition__Group_0__05879);
            rule__FunctionDefinition__Group_0__1();

            state._fsp--;


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
    // $ANTLR end "rule__FunctionDefinition__Group_0__0"


    // $ANTLR start "rule__FunctionDefinition__Group_0__0__Impl"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2752:1: rule__FunctionDefinition__Group_0__0__Impl : ( 'define' ) ;
    public final void rule__FunctionDefinition__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2756:1: ( ( 'define' ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2757:1: ( 'define' )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2757:1: ( 'define' )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2758:1: 'define'
            {
             before(grammarAccess.getFunctionDefinitionAccess().getDefineKeyword_0_0()); 
            match(input,108,FOLLOW_108_in_rule__FunctionDefinition__Group_0__0__Impl5907); 
             after(grammarAccess.getFunctionDefinitionAccess().getDefineKeyword_0_0()); 

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
    // $ANTLR end "rule__FunctionDefinition__Group_0__0__Impl"


    // $ANTLR start "rule__FunctionDefinition__Group_0__1"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2771:1: rule__FunctionDefinition__Group_0__1 : rule__FunctionDefinition__Group_0__1__Impl rule__FunctionDefinition__Group_0__2 ;
    public final void rule__FunctionDefinition__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2775:1: ( rule__FunctionDefinition__Group_0__1__Impl rule__FunctionDefinition__Group_0__2 )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2776:2: rule__FunctionDefinition__Group_0__1__Impl rule__FunctionDefinition__Group_0__2
            {
            pushFollow(FOLLOW_rule__FunctionDefinition__Group_0__1__Impl_in_rule__FunctionDefinition__Group_0__15938);
            rule__FunctionDefinition__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FunctionDefinition__Group_0__2_in_rule__FunctionDefinition__Group_0__15941);
            rule__FunctionDefinition__Group_0__2();

            state._fsp--;


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
    // $ANTLR end "rule__FunctionDefinition__Group_0__1"


    // $ANTLR start "rule__FunctionDefinition__Group_0__1__Impl"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2783:1: rule__FunctionDefinition__Group_0__1__Impl : ( ( ruleLINKAGE )? ) ;
    public final void rule__FunctionDefinition__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2787:1: ( ( ( ruleLINKAGE )? ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2788:1: ( ( ruleLINKAGE )? )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2788:1: ( ( ruleLINKAGE )? )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2789:1: ( ruleLINKAGE )?
            {
             before(grammarAccess.getFunctionDefinitionAccess().getLINKAGEParserRuleCall_0_1()); 
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2790:1: ( ruleLINKAGE )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0>=85 && LA27_0<=100)) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2790:3: ruleLINKAGE
                    {
                    pushFollow(FOLLOW_ruleLINKAGE_in_rule__FunctionDefinition__Group_0__1__Impl5969);
                    ruleLINKAGE();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFunctionDefinitionAccess().getLINKAGEParserRuleCall_0_1()); 

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
    // $ANTLR end "rule__FunctionDefinition__Group_0__1__Impl"


    // $ANTLR start "rule__FunctionDefinition__Group_0__2"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2800:1: rule__FunctionDefinition__Group_0__2 : rule__FunctionDefinition__Group_0__2__Impl rule__FunctionDefinition__Group_0__3 ;
    public final void rule__FunctionDefinition__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2804:1: ( rule__FunctionDefinition__Group_0__2__Impl rule__FunctionDefinition__Group_0__3 )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2805:2: rule__FunctionDefinition__Group_0__2__Impl rule__FunctionDefinition__Group_0__3
            {
            pushFollow(FOLLOW_rule__FunctionDefinition__Group_0__2__Impl_in_rule__FunctionDefinition__Group_0__26000);
            rule__FunctionDefinition__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FunctionDefinition__Group_0__3_in_rule__FunctionDefinition__Group_0__26003);
            rule__FunctionDefinition__Group_0__3();

            state._fsp--;


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
    // $ANTLR end "rule__FunctionDefinition__Group_0__2"


    // $ANTLR start "rule__FunctionDefinition__Group_0__2__Impl"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2812:1: rule__FunctionDefinition__Group_0__2__Impl : ( ( ruleVISIBILITY )? ) ;
    public final void rule__FunctionDefinition__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2816:1: ( ( ( ruleVISIBILITY )? ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2817:1: ( ( ruleVISIBILITY )? )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2817:1: ( ( ruleVISIBILITY )? )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2818:1: ( ruleVISIBILITY )?
            {
             before(grammarAccess.getFunctionDefinitionAccess().getVISIBILITYParserRuleCall_0_2()); 
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2819:1: ( ruleVISIBILITY )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>=82 && LA28_0<=84)) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2819:3: ruleVISIBILITY
                    {
                    pushFollow(FOLLOW_ruleVISIBILITY_in_rule__FunctionDefinition__Group_0__2__Impl6031);
                    ruleVISIBILITY();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFunctionDefinitionAccess().getVISIBILITYParserRuleCall_0_2()); 

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
    // $ANTLR end "rule__FunctionDefinition__Group_0__2__Impl"


    // $ANTLR start "rule__FunctionDefinition__Group_0__3"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2829:1: rule__FunctionDefinition__Group_0__3 : rule__FunctionDefinition__Group_0__3__Impl rule__FunctionDefinition__Group_0__4 ;
    public final void rule__FunctionDefinition__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2833:1: ( rule__FunctionDefinition__Group_0__3__Impl rule__FunctionDefinition__Group_0__4 )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2834:2: rule__FunctionDefinition__Group_0__3__Impl rule__FunctionDefinition__Group_0__4
            {
            pushFollow(FOLLOW_rule__FunctionDefinition__Group_0__3__Impl_in_rule__FunctionDefinition__Group_0__36062);
            rule__FunctionDefinition__Group_0__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FunctionDefinition__Group_0__4_in_rule__FunctionDefinition__Group_0__36065);
            rule__FunctionDefinition__Group_0__4();

            state._fsp--;


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
    // $ANTLR end "rule__FunctionDefinition__Group_0__3"


    // $ANTLR start "rule__FunctionDefinition__Group_0__3__Impl"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2841:1: rule__FunctionDefinition__Group_0__3__Impl : ( ( ruleCallingConv )? ) ;
    public final void rule__FunctionDefinition__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2845:1: ( ( ( ruleCallingConv )? ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2846:1: ( ( ruleCallingConv )? )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2846:1: ( ( ruleCallingConv )? )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2847:1: ( ruleCallingConv )?
            {
             before(grammarAccess.getFunctionDefinitionAccess().getCallingConvParserRuleCall_0_3()); 
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2848:1: ( ruleCallingConv )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0>=51 && LA29_0<=64)||LA29_0==118) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2848:3: ruleCallingConv
                    {
                    pushFollow(FOLLOW_ruleCallingConv_in_rule__FunctionDefinition__Group_0__3__Impl6093);
                    ruleCallingConv();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFunctionDefinitionAccess().getCallingConvParserRuleCall_0_3()); 

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
    // $ANTLR end "rule__FunctionDefinition__Group_0__3__Impl"


    // $ANTLR start "rule__FunctionDefinition__Group_0__4"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2858:1: rule__FunctionDefinition__Group_0__4 : rule__FunctionDefinition__Group_0__4__Impl rule__FunctionDefinition__Group_0__5 ;
    public final void rule__FunctionDefinition__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2862:1: ( rule__FunctionDefinition__Group_0__4__Impl rule__FunctionDefinition__Group_0__5 )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2863:2: rule__FunctionDefinition__Group_0__4__Impl rule__FunctionDefinition__Group_0__5
            {
            pushFollow(FOLLOW_rule__FunctionDefinition__Group_0__4__Impl_in_rule__FunctionDefinition__Group_0__46124);
            rule__FunctionDefinition__Group_0__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FunctionDefinition__Group_0__5_in_rule__FunctionDefinition__Group_0__46127);
            rule__FunctionDefinition__Group_0__5();

            state._fsp--;


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
    // $ANTLR end "rule__FunctionDefinition__Group_0__4"


    // $ANTLR start "rule__FunctionDefinition__Group_0__4__Impl"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2870:1: rule__FunctionDefinition__Group_0__4__Impl : ( ( ruleRETURN_ATTRIBUTES )? ) ;
    public final void rule__FunctionDefinition__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2874:1: ( ( ( ruleRETURN_ATTRIBUTES )? ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2875:1: ( ( ruleRETURN_ATTRIBUTES )? )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2875:1: ( ( ruleRETURN_ATTRIBUTES )? )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2876:1: ( ruleRETURN_ATTRIBUTES )?
            {
             before(grammarAccess.getFunctionDefinitionAccess().getRETURN_ATTRIBUTESParserRuleCall_0_4()); 
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2877:1: ( ruleRETURN_ATTRIBUTES )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( ((LA30_0>=43 && LA30_0<=50)) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2877:3: ruleRETURN_ATTRIBUTES
                    {
                    pushFollow(FOLLOW_ruleRETURN_ATTRIBUTES_in_rule__FunctionDefinition__Group_0__4__Impl6155);
                    ruleRETURN_ATTRIBUTES();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFunctionDefinitionAccess().getRETURN_ATTRIBUTESParserRuleCall_0_4()); 

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
    // $ANTLR end "rule__FunctionDefinition__Group_0__4__Impl"


    // $ANTLR start "rule__FunctionDefinition__Group_0__5"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2887:1: rule__FunctionDefinition__Group_0__5 : rule__FunctionDefinition__Group_0__5__Impl rule__FunctionDefinition__Group_0__6 ;
    public final void rule__FunctionDefinition__Group_0__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2891:1: ( rule__FunctionDefinition__Group_0__5__Impl rule__FunctionDefinition__Group_0__6 )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2892:2: rule__FunctionDefinition__Group_0__5__Impl rule__FunctionDefinition__Group_0__6
            {
            pushFollow(FOLLOW_rule__FunctionDefinition__Group_0__5__Impl_in_rule__FunctionDefinition__Group_0__56186);
            rule__FunctionDefinition__Group_0__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FunctionDefinition__Group_0__6_in_rule__FunctionDefinition__Group_0__56189);
            rule__FunctionDefinition__Group_0__6();

            state._fsp--;


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
    // $ANTLR end "rule__FunctionDefinition__Group_0__5"


    // $ANTLR start "rule__FunctionDefinition__Group_0__5__Impl"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2899:1: rule__FunctionDefinition__Group_0__5__Impl : ( ( rule__FunctionDefinition__ReturnTypeAssignment_0_5 ) ) ;
    public final void rule__FunctionDefinition__Group_0__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2903:1: ( ( ( rule__FunctionDefinition__ReturnTypeAssignment_0_5 ) ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2904:1: ( ( rule__FunctionDefinition__ReturnTypeAssignment_0_5 ) )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2904:1: ( ( rule__FunctionDefinition__ReturnTypeAssignment_0_5 ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2905:1: ( rule__FunctionDefinition__ReturnTypeAssignment_0_5 )
            {
             before(grammarAccess.getFunctionDefinitionAccess().getReturnTypeAssignment_0_5()); 
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2906:1: ( rule__FunctionDefinition__ReturnTypeAssignment_0_5 )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2906:2: rule__FunctionDefinition__ReturnTypeAssignment_0_5
            {
            pushFollow(FOLLOW_rule__FunctionDefinition__ReturnTypeAssignment_0_5_in_rule__FunctionDefinition__Group_0__5__Impl6216);
            rule__FunctionDefinition__ReturnTypeAssignment_0_5();

            state._fsp--;


            }

             after(grammarAccess.getFunctionDefinitionAccess().getReturnTypeAssignment_0_5()); 

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
    // $ANTLR end "rule__FunctionDefinition__Group_0__5__Impl"


    // $ANTLR start "rule__FunctionDefinition__Group_0__6"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2916:1: rule__FunctionDefinition__Group_0__6 : rule__FunctionDefinition__Group_0__6__Impl rule__FunctionDefinition__Group_0__7 ;
    public final void rule__FunctionDefinition__Group_0__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2920:1: ( rule__FunctionDefinition__Group_0__6__Impl rule__FunctionDefinition__Group_0__7 )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2921:2: rule__FunctionDefinition__Group_0__6__Impl rule__FunctionDefinition__Group_0__7
            {
            pushFollow(FOLLOW_rule__FunctionDefinition__Group_0__6__Impl_in_rule__FunctionDefinition__Group_0__66246);
            rule__FunctionDefinition__Group_0__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FunctionDefinition__Group_0__7_in_rule__FunctionDefinition__Group_0__66249);
            rule__FunctionDefinition__Group_0__7();

            state._fsp--;


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
    // $ANTLR end "rule__FunctionDefinition__Group_0__6"


    // $ANTLR start "rule__FunctionDefinition__Group_0__6__Impl"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2928:1: rule__FunctionDefinition__Group_0__6__Impl : ( ( rule__FunctionDefinition__AddressAssignment_0_6 ) ) ;
    public final void rule__FunctionDefinition__Group_0__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2932:1: ( ( ( rule__FunctionDefinition__AddressAssignment_0_6 ) ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2933:1: ( ( rule__FunctionDefinition__AddressAssignment_0_6 ) )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2933:1: ( ( rule__FunctionDefinition__AddressAssignment_0_6 ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2934:1: ( rule__FunctionDefinition__AddressAssignment_0_6 )
            {
             before(grammarAccess.getFunctionDefinitionAccess().getAddressAssignment_0_6()); 
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2935:1: ( rule__FunctionDefinition__AddressAssignment_0_6 )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2935:2: rule__FunctionDefinition__AddressAssignment_0_6
            {
            pushFollow(FOLLOW_rule__FunctionDefinition__AddressAssignment_0_6_in_rule__FunctionDefinition__Group_0__6__Impl6276);
            rule__FunctionDefinition__AddressAssignment_0_6();

            state._fsp--;


            }

             after(grammarAccess.getFunctionDefinitionAccess().getAddressAssignment_0_6()); 

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
    // $ANTLR end "rule__FunctionDefinition__Group_0__6__Impl"


    // $ANTLR start "rule__FunctionDefinition__Group_0__7"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2945:1: rule__FunctionDefinition__Group_0__7 : rule__FunctionDefinition__Group_0__7__Impl rule__FunctionDefinition__Group_0__8 ;
    public final void rule__FunctionDefinition__Group_0__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2949:1: ( rule__FunctionDefinition__Group_0__7__Impl rule__FunctionDefinition__Group_0__8 )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2950:2: rule__FunctionDefinition__Group_0__7__Impl rule__FunctionDefinition__Group_0__8
            {
            pushFollow(FOLLOW_rule__FunctionDefinition__Group_0__7__Impl_in_rule__FunctionDefinition__Group_0__76306);
            rule__FunctionDefinition__Group_0__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FunctionDefinition__Group_0__8_in_rule__FunctionDefinition__Group_0__76309);
            rule__FunctionDefinition__Group_0__8();

            state._fsp--;


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
    // $ANTLR end "rule__FunctionDefinition__Group_0__7"


    // $ANTLR start "rule__FunctionDefinition__Group_0__7__Impl"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2957:1: rule__FunctionDefinition__Group_0__7__Impl : ( ( rule__FunctionDefinition__PlAssignment_0_7 ) ) ;
    public final void rule__FunctionDefinition__Group_0__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2961:1: ( ( ( rule__FunctionDefinition__PlAssignment_0_7 ) ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2962:1: ( ( rule__FunctionDefinition__PlAssignment_0_7 ) )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2962:1: ( ( rule__FunctionDefinition__PlAssignment_0_7 ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2963:1: ( rule__FunctionDefinition__PlAssignment_0_7 )
            {
             before(grammarAccess.getFunctionDefinitionAccess().getPlAssignment_0_7()); 
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2964:1: ( rule__FunctionDefinition__PlAssignment_0_7 )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2964:2: rule__FunctionDefinition__PlAssignment_0_7
            {
            pushFollow(FOLLOW_rule__FunctionDefinition__PlAssignment_0_7_in_rule__FunctionDefinition__Group_0__7__Impl6336);
            rule__FunctionDefinition__PlAssignment_0_7();

            state._fsp--;


            }

             after(grammarAccess.getFunctionDefinitionAccess().getPlAssignment_0_7()); 

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
    // $ANTLR end "rule__FunctionDefinition__Group_0__7__Impl"


    // $ANTLR start "rule__FunctionDefinition__Group_0__8"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2974:1: rule__FunctionDefinition__Group_0__8 : rule__FunctionDefinition__Group_0__8__Impl rule__FunctionDefinition__Group_0__9 ;
    public final void rule__FunctionDefinition__Group_0__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2978:1: ( rule__FunctionDefinition__Group_0__8__Impl rule__FunctionDefinition__Group_0__9 )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2979:2: rule__FunctionDefinition__Group_0__8__Impl rule__FunctionDefinition__Group_0__9
            {
            pushFollow(FOLLOW_rule__FunctionDefinition__Group_0__8__Impl_in_rule__FunctionDefinition__Group_0__86366);
            rule__FunctionDefinition__Group_0__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FunctionDefinition__Group_0__9_in_rule__FunctionDefinition__Group_0__86369);
            rule__FunctionDefinition__Group_0__9();

            state._fsp--;


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
    // $ANTLR end "rule__FunctionDefinition__Group_0__8"


    // $ANTLR start "rule__FunctionDefinition__Group_0__8__Impl"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2986:1: rule__FunctionDefinition__Group_0__8__Impl : ( ( 'unnamed_addr' )? ) ;
    public final void rule__FunctionDefinition__Group_0__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2990:1: ( ( ( 'unnamed_addr' )? ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2991:1: ( ( 'unnamed_addr' )? )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2991:1: ( ( 'unnamed_addr' )? )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2992:1: ( 'unnamed_addr' )?
            {
             before(grammarAccess.getFunctionDefinitionAccess().getUnnamed_addrKeyword_0_8()); 
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2993:1: ( 'unnamed_addr' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==22) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:2994:2: 'unnamed_addr'
                    {
                    match(input,22,FOLLOW_22_in_rule__FunctionDefinition__Group_0__8__Impl6398); 

                    }
                    break;

            }

             after(grammarAccess.getFunctionDefinitionAccess().getUnnamed_addrKeyword_0_8()); 

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
    // $ANTLR end "rule__FunctionDefinition__Group_0__8__Impl"


    // $ANTLR start "rule__FunctionDefinition__Group_0__9"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3005:1: rule__FunctionDefinition__Group_0__9 : rule__FunctionDefinition__Group_0__9__Impl rule__FunctionDefinition__Group_0__10 ;
    public final void rule__FunctionDefinition__Group_0__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3009:1: ( rule__FunctionDefinition__Group_0__9__Impl rule__FunctionDefinition__Group_0__10 )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3010:2: rule__FunctionDefinition__Group_0__9__Impl rule__FunctionDefinition__Group_0__10
            {
            pushFollow(FOLLOW_rule__FunctionDefinition__Group_0__9__Impl_in_rule__FunctionDefinition__Group_0__96431);
            rule__FunctionDefinition__Group_0__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FunctionDefinition__Group_0__10_in_rule__FunctionDefinition__Group_0__96434);
            rule__FunctionDefinition__Group_0__10();

            state._fsp--;


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
    // $ANTLR end "rule__FunctionDefinition__Group_0__9"


    // $ANTLR start "rule__FunctionDefinition__Group_0__9__Impl"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3017:1: rule__FunctionDefinition__Group_0__9__Impl : ( ( ruleFUNCTION_ATTRIBUTES )* ) ;
    public final void rule__FunctionDefinition__Group_0__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3021:1: ( ( ( ruleFUNCTION_ATTRIBUTES )* ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3022:1: ( ( ruleFUNCTION_ATTRIBUTES )* )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3022:1: ( ( ruleFUNCTION_ATTRIBUTES )* )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3023:1: ( ruleFUNCTION_ATTRIBUTES )*
            {
             before(grammarAccess.getFunctionDefinitionAccess().getFUNCTION_ATTRIBUTESParserRuleCall_0_9()); 
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3024:1: ( ruleFUNCTION_ATTRIBUTES )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( ((LA32_0>=65 && LA32_0<=81)||LA32_0==119) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3024:3: ruleFUNCTION_ATTRIBUTES
            	    {
            	    pushFollow(FOLLOW_ruleFUNCTION_ATTRIBUTES_in_rule__FunctionDefinition__Group_0__9__Impl6462);
            	    ruleFUNCTION_ATTRIBUTES();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

             after(grammarAccess.getFunctionDefinitionAccess().getFUNCTION_ATTRIBUTESParserRuleCall_0_9()); 

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
    // $ANTLR end "rule__FunctionDefinition__Group_0__9__Impl"


    // $ANTLR start "rule__FunctionDefinition__Group_0__10"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3034:1: rule__FunctionDefinition__Group_0__10 : rule__FunctionDefinition__Group_0__10__Impl rule__FunctionDefinition__Group_0__11 ;
    public final void rule__FunctionDefinition__Group_0__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3038:1: ( rule__FunctionDefinition__Group_0__10__Impl rule__FunctionDefinition__Group_0__11 )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3039:2: rule__FunctionDefinition__Group_0__10__Impl rule__FunctionDefinition__Group_0__11
            {
            pushFollow(FOLLOW_rule__FunctionDefinition__Group_0__10__Impl_in_rule__FunctionDefinition__Group_0__106493);
            rule__FunctionDefinition__Group_0__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FunctionDefinition__Group_0__11_in_rule__FunctionDefinition__Group_0__106496);
            rule__FunctionDefinition__Group_0__11();

            state._fsp--;


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
    // $ANTLR end "rule__FunctionDefinition__Group_0__10"


    // $ANTLR start "rule__FunctionDefinition__Group_0__10__Impl"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3046:1: rule__FunctionDefinition__Group_0__10__Impl : ( ( rule__FunctionDefinition__Group_0_10__0 )? ) ;
    public final void rule__FunctionDefinition__Group_0__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3050:1: ( ( ( rule__FunctionDefinition__Group_0_10__0 )? ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3051:1: ( ( rule__FunctionDefinition__Group_0_10__0 )? )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3051:1: ( ( rule__FunctionDefinition__Group_0_10__0 )? )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3052:1: ( rule__FunctionDefinition__Group_0_10__0 )?
            {
             before(grammarAccess.getFunctionDefinitionAccess().getGroup_0_10()); 
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3053:1: ( rule__FunctionDefinition__Group_0_10__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==109) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3053:2: rule__FunctionDefinition__Group_0_10__0
                    {
                    pushFollow(FOLLOW_rule__FunctionDefinition__Group_0_10__0_in_rule__FunctionDefinition__Group_0__10__Impl6523);
                    rule__FunctionDefinition__Group_0_10__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFunctionDefinitionAccess().getGroup_0_10()); 

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
    // $ANTLR end "rule__FunctionDefinition__Group_0__10__Impl"


    // $ANTLR start "rule__FunctionDefinition__Group_0__11"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3063:1: rule__FunctionDefinition__Group_0__11 : rule__FunctionDefinition__Group_0__11__Impl rule__FunctionDefinition__Group_0__12 ;
    public final void rule__FunctionDefinition__Group_0__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3067:1: ( rule__FunctionDefinition__Group_0__11__Impl rule__FunctionDefinition__Group_0__12 )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3068:2: rule__FunctionDefinition__Group_0__11__Impl rule__FunctionDefinition__Group_0__12
            {
            pushFollow(FOLLOW_rule__FunctionDefinition__Group_0__11__Impl_in_rule__FunctionDefinition__Group_0__116554);
            rule__FunctionDefinition__Group_0__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FunctionDefinition__Group_0__12_in_rule__FunctionDefinition__Group_0__116557);
            rule__FunctionDefinition__Group_0__12();

            state._fsp--;


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
    // $ANTLR end "rule__FunctionDefinition__Group_0__11"


    // $ANTLR start "rule__FunctionDefinition__Group_0__11__Impl"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3075:1: rule__FunctionDefinition__Group_0__11__Impl : ( ( ruleALIGNMENT )? ) ;
    public final void rule__FunctionDefinition__Group_0__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3079:1: ( ( ( ruleALIGNMENT )? ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3080:1: ( ( ruleALIGNMENT )? )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3080:1: ( ( ruleALIGNMENT )? )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3081:1: ( ruleALIGNMENT )?
            {
             before(grammarAccess.getFunctionDefinitionAccess().getALIGNMENTParserRuleCall_0_11()); 
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3082:1: ( ruleALIGNMENT )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==120) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3082:3: ruleALIGNMENT
                    {
                    pushFollow(FOLLOW_ruleALIGNMENT_in_rule__FunctionDefinition__Group_0__11__Impl6585);
                    ruleALIGNMENT();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFunctionDefinitionAccess().getALIGNMENTParserRuleCall_0_11()); 

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
    // $ANTLR end "rule__FunctionDefinition__Group_0__11__Impl"


    // $ANTLR start "rule__FunctionDefinition__Group_0__12"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3092:1: rule__FunctionDefinition__Group_0__12 : rule__FunctionDefinition__Group_0__12__Impl ;
    public final void rule__FunctionDefinition__Group_0__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3096:1: ( rule__FunctionDefinition__Group_0__12__Impl )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3097:2: rule__FunctionDefinition__Group_0__12__Impl
            {
            pushFollow(FOLLOW_rule__FunctionDefinition__Group_0__12__Impl_in_rule__FunctionDefinition__Group_0__126616);
            rule__FunctionDefinition__Group_0__12__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__FunctionDefinition__Group_0__12"


    // $ANTLR start "rule__FunctionDefinition__Group_0__12__Impl"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3103:1: rule__FunctionDefinition__Group_0__12__Impl : ( ( rule__FunctionDefinition__BodyAssignment_0_12 ) ) ;
    public final void rule__FunctionDefinition__Group_0__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3107:1: ( ( ( rule__FunctionDefinition__BodyAssignment_0_12 ) ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3108:1: ( ( rule__FunctionDefinition__BodyAssignment_0_12 ) )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3108:1: ( ( rule__FunctionDefinition__BodyAssignment_0_12 ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3109:1: ( rule__FunctionDefinition__BodyAssignment_0_12 )
            {
             before(grammarAccess.getFunctionDefinitionAccess().getBodyAssignment_0_12()); 
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3110:1: ( rule__FunctionDefinition__BodyAssignment_0_12 )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3110:2: rule__FunctionDefinition__BodyAssignment_0_12
            {
            pushFollow(FOLLOW_rule__FunctionDefinition__BodyAssignment_0_12_in_rule__FunctionDefinition__Group_0__12__Impl6643);
            rule__FunctionDefinition__BodyAssignment_0_12();

            state._fsp--;


            }

             after(grammarAccess.getFunctionDefinitionAccess().getBodyAssignment_0_12()); 

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
    // $ANTLR end "rule__FunctionDefinition__Group_0__12__Impl"


    // $ANTLR start "rule__FunctionDefinition__Group_0_10__0"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3146:1: rule__FunctionDefinition__Group_0_10__0 : rule__FunctionDefinition__Group_0_10__0__Impl rule__FunctionDefinition__Group_0_10__1 ;
    public final void rule__FunctionDefinition__Group_0_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3150:1: ( rule__FunctionDefinition__Group_0_10__0__Impl rule__FunctionDefinition__Group_0_10__1 )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3151:2: rule__FunctionDefinition__Group_0_10__0__Impl rule__FunctionDefinition__Group_0_10__1
            {
            pushFollow(FOLLOW_rule__FunctionDefinition__Group_0_10__0__Impl_in_rule__FunctionDefinition__Group_0_10__06699);
            rule__FunctionDefinition__Group_0_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FunctionDefinition__Group_0_10__1_in_rule__FunctionDefinition__Group_0_10__06702);
            rule__FunctionDefinition__Group_0_10__1();

            state._fsp--;


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
    // $ANTLR end "rule__FunctionDefinition__Group_0_10__0"


    // $ANTLR start "rule__FunctionDefinition__Group_0_10__0__Impl"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3158:1: rule__FunctionDefinition__Group_0_10__0__Impl : ( 'section ' ) ;
    public final void rule__FunctionDefinition__Group_0_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3162:1: ( ( 'section ' ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3163:1: ( 'section ' )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3163:1: ( 'section ' )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3164:1: 'section '
            {
             before(grammarAccess.getFunctionDefinitionAccess().getSectionKeyword_0_10_0()); 
            match(input,109,FOLLOW_109_in_rule__FunctionDefinition__Group_0_10__0__Impl6730); 
             after(grammarAccess.getFunctionDefinitionAccess().getSectionKeyword_0_10_0()); 

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
    // $ANTLR end "rule__FunctionDefinition__Group_0_10__0__Impl"


    // $ANTLR start "rule__FunctionDefinition__Group_0_10__1"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3177:1: rule__FunctionDefinition__Group_0_10__1 : rule__FunctionDefinition__Group_0_10__1__Impl ;
    public final void rule__FunctionDefinition__Group_0_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3181:1: ( rule__FunctionDefinition__Group_0_10__1__Impl )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3182:2: rule__FunctionDefinition__Group_0_10__1__Impl
            {
            pushFollow(FOLLOW_rule__FunctionDefinition__Group_0_10__1__Impl_in_rule__FunctionDefinition__Group_0_10__16761);
            rule__FunctionDefinition__Group_0_10__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__FunctionDefinition__Group_0_10__1"


    // $ANTLR start "rule__FunctionDefinition__Group_0_10__1__Impl"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3188:1: rule__FunctionDefinition__Group_0_10__1__Impl : ( RULE_STRING ) ;
    public final void rule__FunctionDefinition__Group_0_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3192:1: ( ( RULE_STRING ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3193:1: ( RULE_STRING )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3193:1: ( RULE_STRING )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3194:1: RULE_STRING
            {
             before(grammarAccess.getFunctionDefinitionAccess().getSTRINGTerminalRuleCall_0_10_1()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__FunctionDefinition__Group_0_10__1__Impl6788); 
             after(grammarAccess.getFunctionDefinitionAccess().getSTRINGTerminalRuleCall_0_10_1()); 

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
    // $ANTLR end "rule__FunctionDefinition__Group_0_10__1__Impl"


    // $ANTLR start "rule__FunctionDefinition__Group_1__0"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3209:1: rule__FunctionDefinition__Group_1__0 : rule__FunctionDefinition__Group_1__0__Impl rule__FunctionDefinition__Group_1__1 ;
    public final void rule__FunctionDefinition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3213:1: ( rule__FunctionDefinition__Group_1__0__Impl rule__FunctionDefinition__Group_1__1 )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3214:2: rule__FunctionDefinition__Group_1__0__Impl rule__FunctionDefinition__Group_1__1
            {
            pushFollow(FOLLOW_rule__FunctionDefinition__Group_1__0__Impl_in_rule__FunctionDefinition__Group_1__06821);
            rule__FunctionDefinition__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FunctionDefinition__Group_1__1_in_rule__FunctionDefinition__Group_1__06824);
            rule__FunctionDefinition__Group_1__1();

            state._fsp--;


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
    // $ANTLR end "rule__FunctionDefinition__Group_1__0"


    // $ANTLR start "rule__FunctionDefinition__Group_1__0__Impl"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3221:1: rule__FunctionDefinition__Group_1__0__Impl : ( 'declare' ) ;
    public final void rule__FunctionDefinition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3225:1: ( ( 'declare' ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3226:1: ( 'declare' )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3226:1: ( 'declare' )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3227:1: 'declare'
            {
             before(grammarAccess.getFunctionDefinitionAccess().getDeclareKeyword_1_0()); 
            match(input,110,FOLLOW_110_in_rule__FunctionDefinition__Group_1__0__Impl6852); 
             after(grammarAccess.getFunctionDefinitionAccess().getDeclareKeyword_1_0()); 

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
    // $ANTLR end "rule__FunctionDefinition__Group_1__0__Impl"


    // $ANTLR start "rule__FunctionDefinition__Group_1__1"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3240:1: rule__FunctionDefinition__Group_1__1 : rule__FunctionDefinition__Group_1__1__Impl rule__FunctionDefinition__Group_1__2 ;
    public final void rule__FunctionDefinition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3244:1: ( rule__FunctionDefinition__Group_1__1__Impl rule__FunctionDefinition__Group_1__2 )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3245:2: rule__FunctionDefinition__Group_1__1__Impl rule__FunctionDefinition__Group_1__2
            {
            pushFollow(FOLLOW_rule__FunctionDefinition__Group_1__1__Impl_in_rule__FunctionDefinition__Group_1__16883);
            rule__FunctionDefinition__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FunctionDefinition__Group_1__2_in_rule__FunctionDefinition__Group_1__16886);
            rule__FunctionDefinition__Group_1__2();

            state._fsp--;


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
    // $ANTLR end "rule__FunctionDefinition__Group_1__1"


    // $ANTLR start "rule__FunctionDefinition__Group_1__1__Impl"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3252:1: rule__FunctionDefinition__Group_1__1__Impl : ( ( ruleLINKAGE )? ) ;
    public final void rule__FunctionDefinition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3256:1: ( ( ( ruleLINKAGE )? ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3257:1: ( ( ruleLINKAGE )? )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3257:1: ( ( ruleLINKAGE )? )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3258:1: ( ruleLINKAGE )?
            {
             before(grammarAccess.getFunctionDefinitionAccess().getLINKAGEParserRuleCall_1_1()); 
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3259:1: ( ruleLINKAGE )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( ((LA35_0>=85 && LA35_0<=100)) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3259:3: ruleLINKAGE
                    {
                    pushFollow(FOLLOW_ruleLINKAGE_in_rule__FunctionDefinition__Group_1__1__Impl6914);
                    ruleLINKAGE();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFunctionDefinitionAccess().getLINKAGEParserRuleCall_1_1()); 

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
    // $ANTLR end "rule__FunctionDefinition__Group_1__1__Impl"


    // $ANTLR start "rule__FunctionDefinition__Group_1__2"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3269:1: rule__FunctionDefinition__Group_1__2 : rule__FunctionDefinition__Group_1__2__Impl rule__FunctionDefinition__Group_1__3 ;
    public final void rule__FunctionDefinition__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3273:1: ( rule__FunctionDefinition__Group_1__2__Impl rule__FunctionDefinition__Group_1__3 )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3274:2: rule__FunctionDefinition__Group_1__2__Impl rule__FunctionDefinition__Group_1__3
            {
            pushFollow(FOLLOW_rule__FunctionDefinition__Group_1__2__Impl_in_rule__FunctionDefinition__Group_1__26945);
            rule__FunctionDefinition__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FunctionDefinition__Group_1__3_in_rule__FunctionDefinition__Group_1__26948);
            rule__FunctionDefinition__Group_1__3();

            state._fsp--;


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
    // $ANTLR end "rule__FunctionDefinition__Group_1__2"


    // $ANTLR start "rule__FunctionDefinition__Group_1__2__Impl"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3281:1: rule__FunctionDefinition__Group_1__2__Impl : ( ( ruleVISIBILITY )? ) ;
    public final void rule__FunctionDefinition__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3285:1: ( ( ( ruleVISIBILITY )? ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3286:1: ( ( ruleVISIBILITY )? )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3286:1: ( ( ruleVISIBILITY )? )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3287:1: ( ruleVISIBILITY )?
            {
             before(grammarAccess.getFunctionDefinitionAccess().getVISIBILITYParserRuleCall_1_2()); 
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3288:1: ( ruleVISIBILITY )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( ((LA36_0>=82 && LA36_0<=84)) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3288:3: ruleVISIBILITY
                    {
                    pushFollow(FOLLOW_ruleVISIBILITY_in_rule__FunctionDefinition__Group_1__2__Impl6976);
                    ruleVISIBILITY();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFunctionDefinitionAccess().getVISIBILITYParserRuleCall_1_2()); 

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
    // $ANTLR end "rule__FunctionDefinition__Group_1__2__Impl"


    // $ANTLR start "rule__FunctionDefinition__Group_1__3"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3298:1: rule__FunctionDefinition__Group_1__3 : rule__FunctionDefinition__Group_1__3__Impl rule__FunctionDefinition__Group_1__4 ;
    public final void rule__FunctionDefinition__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3302:1: ( rule__FunctionDefinition__Group_1__3__Impl rule__FunctionDefinition__Group_1__4 )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3303:2: rule__FunctionDefinition__Group_1__3__Impl rule__FunctionDefinition__Group_1__4
            {
            pushFollow(FOLLOW_rule__FunctionDefinition__Group_1__3__Impl_in_rule__FunctionDefinition__Group_1__37007);
            rule__FunctionDefinition__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FunctionDefinition__Group_1__4_in_rule__FunctionDefinition__Group_1__37010);
            rule__FunctionDefinition__Group_1__4();

            state._fsp--;


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
    // $ANTLR end "rule__FunctionDefinition__Group_1__3"


    // $ANTLR start "rule__FunctionDefinition__Group_1__3__Impl"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3310:1: rule__FunctionDefinition__Group_1__3__Impl : ( ( ruleCallingConv )? ) ;
    public final void rule__FunctionDefinition__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3314:1: ( ( ( ruleCallingConv )? ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3315:1: ( ( ruleCallingConv )? )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3315:1: ( ( ruleCallingConv )? )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3316:1: ( ruleCallingConv )?
            {
             before(grammarAccess.getFunctionDefinitionAccess().getCallingConvParserRuleCall_1_3()); 
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3317:1: ( ruleCallingConv )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( ((LA37_0>=51 && LA37_0<=64)||LA37_0==118) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3317:3: ruleCallingConv
                    {
                    pushFollow(FOLLOW_ruleCallingConv_in_rule__FunctionDefinition__Group_1__3__Impl7038);
                    ruleCallingConv();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFunctionDefinitionAccess().getCallingConvParserRuleCall_1_3()); 

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
    // $ANTLR end "rule__FunctionDefinition__Group_1__3__Impl"


    // $ANTLR start "rule__FunctionDefinition__Group_1__4"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3327:1: rule__FunctionDefinition__Group_1__4 : rule__FunctionDefinition__Group_1__4__Impl rule__FunctionDefinition__Group_1__5 ;
    public final void rule__FunctionDefinition__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3331:1: ( rule__FunctionDefinition__Group_1__4__Impl rule__FunctionDefinition__Group_1__5 )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3332:2: rule__FunctionDefinition__Group_1__4__Impl rule__FunctionDefinition__Group_1__5
            {
            pushFollow(FOLLOW_rule__FunctionDefinition__Group_1__4__Impl_in_rule__FunctionDefinition__Group_1__47069);
            rule__FunctionDefinition__Group_1__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FunctionDefinition__Group_1__5_in_rule__FunctionDefinition__Group_1__47072);
            rule__FunctionDefinition__Group_1__5();

            state._fsp--;


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
    // $ANTLR end "rule__FunctionDefinition__Group_1__4"


    // $ANTLR start "rule__FunctionDefinition__Group_1__4__Impl"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3339:1: rule__FunctionDefinition__Group_1__4__Impl : ( ( ruleRETURN_ATTRIBUTES )? ) ;
    public final void rule__FunctionDefinition__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3343:1: ( ( ( ruleRETURN_ATTRIBUTES )? ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3344:1: ( ( ruleRETURN_ATTRIBUTES )? )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3344:1: ( ( ruleRETURN_ATTRIBUTES )? )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3345:1: ( ruleRETURN_ATTRIBUTES )?
            {
             before(grammarAccess.getFunctionDefinitionAccess().getRETURN_ATTRIBUTESParserRuleCall_1_4()); 
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3346:1: ( ruleRETURN_ATTRIBUTES )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( ((LA38_0>=43 && LA38_0<=50)) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3346:3: ruleRETURN_ATTRIBUTES
                    {
                    pushFollow(FOLLOW_ruleRETURN_ATTRIBUTES_in_rule__FunctionDefinition__Group_1__4__Impl7100);
                    ruleRETURN_ATTRIBUTES();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFunctionDefinitionAccess().getRETURN_ATTRIBUTESParserRuleCall_1_4()); 

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
    // $ANTLR end "rule__FunctionDefinition__Group_1__4__Impl"


    // $ANTLR start "rule__FunctionDefinition__Group_1__5"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3356:1: rule__FunctionDefinition__Group_1__5 : rule__FunctionDefinition__Group_1__5__Impl rule__FunctionDefinition__Group_1__6 ;
    public final void rule__FunctionDefinition__Group_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3360:1: ( rule__FunctionDefinition__Group_1__5__Impl rule__FunctionDefinition__Group_1__6 )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3361:2: rule__FunctionDefinition__Group_1__5__Impl rule__FunctionDefinition__Group_1__6
            {
            pushFollow(FOLLOW_rule__FunctionDefinition__Group_1__5__Impl_in_rule__FunctionDefinition__Group_1__57131);
            rule__FunctionDefinition__Group_1__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FunctionDefinition__Group_1__6_in_rule__FunctionDefinition__Group_1__57134);
            rule__FunctionDefinition__Group_1__6();

            state._fsp--;


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
    // $ANTLR end "rule__FunctionDefinition__Group_1__5"


    // $ANTLR start "rule__FunctionDefinition__Group_1__5__Impl"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3368:1: rule__FunctionDefinition__Group_1__5__Impl : ( ( rule__FunctionDefinition__ReturnTypeAssignment_1_5 ) ) ;
    public final void rule__FunctionDefinition__Group_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3372:1: ( ( ( rule__FunctionDefinition__ReturnTypeAssignment_1_5 ) ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3373:1: ( ( rule__FunctionDefinition__ReturnTypeAssignment_1_5 ) )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3373:1: ( ( rule__FunctionDefinition__ReturnTypeAssignment_1_5 ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3374:1: ( rule__FunctionDefinition__ReturnTypeAssignment_1_5 )
            {
             before(grammarAccess.getFunctionDefinitionAccess().getReturnTypeAssignment_1_5()); 
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3375:1: ( rule__FunctionDefinition__ReturnTypeAssignment_1_5 )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3375:2: rule__FunctionDefinition__ReturnTypeAssignment_1_5
            {
            pushFollow(FOLLOW_rule__FunctionDefinition__ReturnTypeAssignment_1_5_in_rule__FunctionDefinition__Group_1__5__Impl7161);
            rule__FunctionDefinition__ReturnTypeAssignment_1_5();

            state._fsp--;


            }

             after(grammarAccess.getFunctionDefinitionAccess().getReturnTypeAssignment_1_5()); 

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
    // $ANTLR end "rule__FunctionDefinition__Group_1__5__Impl"


    // $ANTLR start "rule__FunctionDefinition__Group_1__6"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3385:1: rule__FunctionDefinition__Group_1__6 : rule__FunctionDefinition__Group_1__6__Impl rule__FunctionDefinition__Group_1__7 ;
    public final void rule__FunctionDefinition__Group_1__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3389:1: ( rule__FunctionDefinition__Group_1__6__Impl rule__FunctionDefinition__Group_1__7 )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3390:2: rule__FunctionDefinition__Group_1__6__Impl rule__FunctionDefinition__Group_1__7
            {
            pushFollow(FOLLOW_rule__FunctionDefinition__Group_1__6__Impl_in_rule__FunctionDefinition__Group_1__67191);
            rule__FunctionDefinition__Group_1__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FunctionDefinition__Group_1__7_in_rule__FunctionDefinition__Group_1__67194);
            rule__FunctionDefinition__Group_1__7();

            state._fsp--;


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
    // $ANTLR end "rule__FunctionDefinition__Group_1__6"


    // $ANTLR start "rule__FunctionDefinition__Group_1__6__Impl"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3397:1: rule__FunctionDefinition__Group_1__6__Impl : ( ( rule__FunctionDefinition__AddressAssignment_1_6 ) ) ;
    public final void rule__FunctionDefinition__Group_1__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3401:1: ( ( ( rule__FunctionDefinition__AddressAssignment_1_6 ) ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3402:1: ( ( rule__FunctionDefinition__AddressAssignment_1_6 ) )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3402:1: ( ( rule__FunctionDefinition__AddressAssignment_1_6 ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3403:1: ( rule__FunctionDefinition__AddressAssignment_1_6 )
            {
             before(grammarAccess.getFunctionDefinitionAccess().getAddressAssignment_1_6()); 
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3404:1: ( rule__FunctionDefinition__AddressAssignment_1_6 )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3404:2: rule__FunctionDefinition__AddressAssignment_1_6
            {
            pushFollow(FOLLOW_rule__FunctionDefinition__AddressAssignment_1_6_in_rule__FunctionDefinition__Group_1__6__Impl7221);
            rule__FunctionDefinition__AddressAssignment_1_6();

            state._fsp--;


            }

             after(grammarAccess.getFunctionDefinitionAccess().getAddressAssignment_1_6()); 

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
    // $ANTLR end "rule__FunctionDefinition__Group_1__6__Impl"


    // $ANTLR start "rule__FunctionDefinition__Group_1__7"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3414:1: rule__FunctionDefinition__Group_1__7 : rule__FunctionDefinition__Group_1__7__Impl rule__FunctionDefinition__Group_1__8 ;
    public final void rule__FunctionDefinition__Group_1__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3418:1: ( rule__FunctionDefinition__Group_1__7__Impl rule__FunctionDefinition__Group_1__8 )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3419:2: rule__FunctionDefinition__Group_1__7__Impl rule__FunctionDefinition__Group_1__8
            {
            pushFollow(FOLLOW_rule__FunctionDefinition__Group_1__7__Impl_in_rule__FunctionDefinition__Group_1__77251);
            rule__FunctionDefinition__Group_1__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FunctionDefinition__Group_1__8_in_rule__FunctionDefinition__Group_1__77254);
            rule__FunctionDefinition__Group_1__8();

            state._fsp--;


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
    // $ANTLR end "rule__FunctionDefinition__Group_1__7"


    // $ANTLR start "rule__FunctionDefinition__Group_1__7__Impl"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3426:1: rule__FunctionDefinition__Group_1__7__Impl : ( ( rule__FunctionDefinition__Alternatives_1_7 ) ) ;
    public final void rule__FunctionDefinition__Group_1__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3430:1: ( ( ( rule__FunctionDefinition__Alternatives_1_7 ) ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3431:1: ( ( rule__FunctionDefinition__Alternatives_1_7 ) )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3431:1: ( ( rule__FunctionDefinition__Alternatives_1_7 ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3432:1: ( rule__FunctionDefinition__Alternatives_1_7 )
            {
             before(grammarAccess.getFunctionDefinitionAccess().getAlternatives_1_7()); 
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3433:1: ( rule__FunctionDefinition__Alternatives_1_7 )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3433:2: rule__FunctionDefinition__Alternatives_1_7
            {
            pushFollow(FOLLOW_rule__FunctionDefinition__Alternatives_1_7_in_rule__FunctionDefinition__Group_1__7__Impl7281);
            rule__FunctionDefinition__Alternatives_1_7();

            state._fsp--;


            }

             after(grammarAccess.getFunctionDefinitionAccess().getAlternatives_1_7()); 

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
    // $ANTLR end "rule__FunctionDefinition__Group_1__7__Impl"


    // $ANTLR start "rule__FunctionDefinition__Group_1__8"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3443:1: rule__FunctionDefinition__Group_1__8 : rule__FunctionDefinition__Group_1__8__Impl rule__FunctionDefinition__Group_1__9 ;
    public final void rule__FunctionDefinition__Group_1__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3447:1: ( rule__FunctionDefinition__Group_1__8__Impl rule__FunctionDefinition__Group_1__9 )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3448:2: rule__FunctionDefinition__Group_1__8__Impl rule__FunctionDefinition__Group_1__9
            {
            pushFollow(FOLLOW_rule__FunctionDefinition__Group_1__8__Impl_in_rule__FunctionDefinition__Group_1__87311);
            rule__FunctionDefinition__Group_1__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FunctionDefinition__Group_1__9_in_rule__FunctionDefinition__Group_1__87314);
            rule__FunctionDefinition__Group_1__9();

            state._fsp--;


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
    // $ANTLR end "rule__FunctionDefinition__Group_1__8"


    // $ANTLR start "rule__FunctionDefinition__Group_1__8__Impl"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3455:1: rule__FunctionDefinition__Group_1__8__Impl : ( ( 'unnamed_addr' )? ) ;
    public final void rule__FunctionDefinition__Group_1__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3459:1: ( ( ( 'unnamed_addr' )? ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3460:1: ( ( 'unnamed_addr' )? )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3460:1: ( ( 'unnamed_addr' )? )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3461:1: ( 'unnamed_addr' )?
            {
             before(grammarAccess.getFunctionDefinitionAccess().getUnnamed_addrKeyword_1_8()); 
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3462:1: ( 'unnamed_addr' )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==22) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3463:2: 'unnamed_addr'
                    {
                    match(input,22,FOLLOW_22_in_rule__FunctionDefinition__Group_1__8__Impl7343); 

                    }
                    break;

            }

             after(grammarAccess.getFunctionDefinitionAccess().getUnnamed_addrKeyword_1_8()); 

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
    // $ANTLR end "rule__FunctionDefinition__Group_1__8__Impl"


    // $ANTLR start "rule__FunctionDefinition__Group_1__9"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3474:1: rule__FunctionDefinition__Group_1__9 : rule__FunctionDefinition__Group_1__9__Impl rule__FunctionDefinition__Group_1__10 ;
    public final void rule__FunctionDefinition__Group_1__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3478:1: ( rule__FunctionDefinition__Group_1__9__Impl rule__FunctionDefinition__Group_1__10 )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3479:2: rule__FunctionDefinition__Group_1__9__Impl rule__FunctionDefinition__Group_1__10
            {
            pushFollow(FOLLOW_rule__FunctionDefinition__Group_1__9__Impl_in_rule__FunctionDefinition__Group_1__97376);
            rule__FunctionDefinition__Group_1__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FunctionDefinition__Group_1__10_in_rule__FunctionDefinition__Group_1__97379);
            rule__FunctionDefinition__Group_1__10();

            state._fsp--;


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
    // $ANTLR end "rule__FunctionDefinition__Group_1__9"


    // $ANTLR start "rule__FunctionDefinition__Group_1__9__Impl"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3486:1: rule__FunctionDefinition__Group_1__9__Impl : ( ( ruleFUNCTION_ATTRIBUTES )* ) ;
    public final void rule__FunctionDefinition__Group_1__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3490:1: ( ( ( ruleFUNCTION_ATTRIBUTES )* ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3491:1: ( ( ruleFUNCTION_ATTRIBUTES )* )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3491:1: ( ( ruleFUNCTION_ATTRIBUTES )* )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3492:1: ( ruleFUNCTION_ATTRIBUTES )*
            {
             before(grammarAccess.getFunctionDefinitionAccess().getFUNCTION_ATTRIBUTESParserRuleCall_1_9()); 
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3493:1: ( ruleFUNCTION_ATTRIBUTES )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( ((LA40_0>=65 && LA40_0<=81)||LA40_0==119) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3493:3: ruleFUNCTION_ATTRIBUTES
            	    {
            	    pushFollow(FOLLOW_ruleFUNCTION_ATTRIBUTES_in_rule__FunctionDefinition__Group_1__9__Impl7407);
            	    ruleFUNCTION_ATTRIBUTES();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

             after(grammarAccess.getFunctionDefinitionAccess().getFUNCTION_ATTRIBUTESParserRuleCall_1_9()); 

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
    // $ANTLR end "rule__FunctionDefinition__Group_1__9__Impl"


    // $ANTLR start "rule__FunctionDefinition__Group_1__10"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3503:1: rule__FunctionDefinition__Group_1__10 : rule__FunctionDefinition__Group_1__10__Impl rule__FunctionDefinition__Group_1__11 ;
    public final void rule__FunctionDefinition__Group_1__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3507:1: ( rule__FunctionDefinition__Group_1__10__Impl rule__FunctionDefinition__Group_1__11 )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3508:2: rule__FunctionDefinition__Group_1__10__Impl rule__FunctionDefinition__Group_1__11
            {
            pushFollow(FOLLOW_rule__FunctionDefinition__Group_1__10__Impl_in_rule__FunctionDefinition__Group_1__107438);
            rule__FunctionDefinition__Group_1__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FunctionDefinition__Group_1__11_in_rule__FunctionDefinition__Group_1__107441);
            rule__FunctionDefinition__Group_1__11();

            state._fsp--;


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
    // $ANTLR end "rule__FunctionDefinition__Group_1__10"


    // $ANTLR start "rule__FunctionDefinition__Group_1__10__Impl"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3515:1: rule__FunctionDefinition__Group_1__10__Impl : ( ( rule__FunctionDefinition__Group_1_10__0 )? ) ;
    public final void rule__FunctionDefinition__Group_1__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3519:1: ( ( ( rule__FunctionDefinition__Group_1_10__0 )? ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3520:1: ( ( rule__FunctionDefinition__Group_1_10__0 )? )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3520:1: ( ( rule__FunctionDefinition__Group_1_10__0 )? )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3521:1: ( rule__FunctionDefinition__Group_1_10__0 )?
            {
             before(grammarAccess.getFunctionDefinitionAccess().getGroup_1_10()); 
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3522:1: ( rule__FunctionDefinition__Group_1_10__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==109) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3522:2: rule__FunctionDefinition__Group_1_10__0
                    {
                    pushFollow(FOLLOW_rule__FunctionDefinition__Group_1_10__0_in_rule__FunctionDefinition__Group_1__10__Impl7468);
                    rule__FunctionDefinition__Group_1_10__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFunctionDefinitionAccess().getGroup_1_10()); 

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
    // $ANTLR end "rule__FunctionDefinition__Group_1__10__Impl"


    // $ANTLR start "rule__FunctionDefinition__Group_1__11"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3532:1: rule__FunctionDefinition__Group_1__11 : rule__FunctionDefinition__Group_1__11__Impl ;
    public final void rule__FunctionDefinition__Group_1__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3536:1: ( rule__FunctionDefinition__Group_1__11__Impl )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3537:2: rule__FunctionDefinition__Group_1__11__Impl
            {
            pushFollow(FOLLOW_rule__FunctionDefinition__Group_1__11__Impl_in_rule__FunctionDefinition__Group_1__117499);
            rule__FunctionDefinition__Group_1__11__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__FunctionDefinition__Group_1__11"


    // $ANTLR start "rule__FunctionDefinition__Group_1__11__Impl"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3543:1: rule__FunctionDefinition__Group_1__11__Impl : ( ( ruleALIGNMENT )? ) ;
    public final void rule__FunctionDefinition__Group_1__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3547:1: ( ( ( ruleALIGNMENT )? ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3548:1: ( ( ruleALIGNMENT )? )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3548:1: ( ( ruleALIGNMENT )? )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3549:1: ( ruleALIGNMENT )?
            {
             before(grammarAccess.getFunctionDefinitionAccess().getALIGNMENTParserRuleCall_1_11()); 
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3550:1: ( ruleALIGNMENT )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==120) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3550:3: ruleALIGNMENT
                    {
                    pushFollow(FOLLOW_ruleALIGNMENT_in_rule__FunctionDefinition__Group_1__11__Impl7527);
                    ruleALIGNMENT();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFunctionDefinitionAccess().getALIGNMENTParserRuleCall_1_11()); 

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
    // $ANTLR end "rule__FunctionDefinition__Group_1__11__Impl"


    // $ANTLR start "rule__FunctionDefinition__Group_1_10__0"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3584:1: rule__FunctionDefinition__Group_1_10__0 : rule__FunctionDefinition__Group_1_10__0__Impl rule__FunctionDefinition__Group_1_10__1 ;
    public final void rule__FunctionDefinition__Group_1_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3588:1: ( rule__FunctionDefinition__Group_1_10__0__Impl rule__FunctionDefinition__Group_1_10__1 )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3589:2: rule__FunctionDefinition__Group_1_10__0__Impl rule__FunctionDefinition__Group_1_10__1
            {
            pushFollow(FOLLOW_rule__FunctionDefinition__Group_1_10__0__Impl_in_rule__FunctionDefinition__Group_1_10__07582);
            rule__FunctionDefinition__Group_1_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FunctionDefinition__Group_1_10__1_in_rule__FunctionDefinition__Group_1_10__07585);
            rule__FunctionDefinition__Group_1_10__1();

            state._fsp--;


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
    // $ANTLR end "rule__FunctionDefinition__Group_1_10__0"


    // $ANTLR start "rule__FunctionDefinition__Group_1_10__0__Impl"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3596:1: rule__FunctionDefinition__Group_1_10__0__Impl : ( 'section ' ) ;
    public final void rule__FunctionDefinition__Group_1_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3600:1: ( ( 'section ' ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3601:1: ( 'section ' )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3601:1: ( 'section ' )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3602:1: 'section '
            {
             before(grammarAccess.getFunctionDefinitionAccess().getSectionKeyword_1_10_0()); 
            match(input,109,FOLLOW_109_in_rule__FunctionDefinition__Group_1_10__0__Impl7613); 
             after(grammarAccess.getFunctionDefinitionAccess().getSectionKeyword_1_10_0()); 

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
    // $ANTLR end "rule__FunctionDefinition__Group_1_10__0__Impl"


    // $ANTLR start "rule__FunctionDefinition__Group_1_10__1"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3615:1: rule__FunctionDefinition__Group_1_10__1 : rule__FunctionDefinition__Group_1_10__1__Impl ;
    public final void rule__FunctionDefinition__Group_1_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3619:1: ( rule__FunctionDefinition__Group_1_10__1__Impl )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3620:2: rule__FunctionDefinition__Group_1_10__1__Impl
            {
            pushFollow(FOLLOW_rule__FunctionDefinition__Group_1_10__1__Impl_in_rule__FunctionDefinition__Group_1_10__17644);
            rule__FunctionDefinition__Group_1_10__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__FunctionDefinition__Group_1_10__1"


    // $ANTLR start "rule__FunctionDefinition__Group_1_10__1__Impl"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3626:1: rule__FunctionDefinition__Group_1_10__1__Impl : ( RULE_STRING ) ;
    public final void rule__FunctionDefinition__Group_1_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3630:1: ( ( RULE_STRING ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3631:1: ( RULE_STRING )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3631:1: ( RULE_STRING )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3632:1: RULE_STRING
            {
             before(grammarAccess.getFunctionDefinitionAccess().getSTRINGTerminalRuleCall_1_10_1()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__FunctionDefinition__Group_1_10__1__Impl7671); 
             after(grammarAccess.getFunctionDefinitionAccess().getSTRINGTerminalRuleCall_1_10_1()); 

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
    // $ANTLR end "rule__FunctionDefinition__Group_1_10__1__Impl"


    // $ANTLR start "rule__AddressUse__Group__0"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3648:1: rule__AddressUse__Group__0 : rule__AddressUse__Group__0__Impl rule__AddressUse__Group__1 ;
    public final void rule__AddressUse__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3652:1: ( rule__AddressUse__Group__0__Impl rule__AddressUse__Group__1 )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3653:2: rule__AddressUse__Group__0__Impl rule__AddressUse__Group__1
            {
            pushFollow(FOLLOW_rule__AddressUse__Group__0__Impl_in_rule__AddressUse__Group__07705);
            rule__AddressUse__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AddressUse__Group__1_in_rule__AddressUse__Group__07708);
            rule__AddressUse__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__AddressUse__Group__0"


    // $ANTLR start "rule__AddressUse__Group__0__Impl"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3660:1: rule__AddressUse__Group__0__Impl : ( ( rule__AddressUse__AddressAssignment_0 ) ) ;
    public final void rule__AddressUse__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3664:1: ( ( ( rule__AddressUse__AddressAssignment_0 ) ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3665:1: ( ( rule__AddressUse__AddressAssignment_0 ) )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3665:1: ( ( rule__AddressUse__AddressAssignment_0 ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3666:1: ( rule__AddressUse__AddressAssignment_0 )
            {
             before(grammarAccess.getAddressUseAccess().getAddressAssignment_0()); 
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3667:1: ( rule__AddressUse__AddressAssignment_0 )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3667:2: rule__AddressUse__AddressAssignment_0
            {
            pushFollow(FOLLOW_rule__AddressUse__AddressAssignment_0_in_rule__AddressUse__Group__0__Impl7735);
            rule__AddressUse__AddressAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAddressUseAccess().getAddressAssignment_0()); 

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
    // $ANTLR end "rule__AddressUse__Group__0__Impl"


    // $ANTLR start "rule__AddressUse__Group__1"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3677:1: rule__AddressUse__Group__1 : rule__AddressUse__Group__1__Impl ;
    public final void rule__AddressUse__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3681:1: ( rule__AddressUse__Group__1__Impl )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3682:2: rule__AddressUse__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__AddressUse__Group__1__Impl_in_rule__AddressUse__Group__17765);
            rule__AddressUse__Group__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__AddressUse__Group__1"


    // $ANTLR start "rule__AddressUse__Group__1__Impl"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3688:1: rule__AddressUse__Group__1__Impl : ( ( rule__AddressUse__PointerAssignment_1 )? ) ;
    public final void rule__AddressUse__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3692:1: ( ( ( rule__AddressUse__PointerAssignment_1 )? ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3693:1: ( ( rule__AddressUse__PointerAssignment_1 )? )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3693:1: ( ( rule__AddressUse__PointerAssignment_1 )? )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3694:1: ( rule__AddressUse__PointerAssignment_1 )?
            {
             before(grammarAccess.getAddressUseAccess().getPointerAssignment_1()); 
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3695:1: ( rule__AddressUse__PointerAssignment_1 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==RULE_POINTER) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3695:2: rule__AddressUse__PointerAssignment_1
                    {
                    pushFollow(FOLLOW_rule__AddressUse__PointerAssignment_1_in_rule__AddressUse__Group__1__Impl7792);
                    rule__AddressUse__PointerAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAddressUseAccess().getPointerAssignment_1()); 

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
    // $ANTLR end "rule__AddressUse__Group__1__Impl"


    // $ANTLR start "rule__Predefined__Group__0"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3709:1: rule__Predefined__Group__0 : rule__Predefined__Group__0__Impl rule__Predefined__Group__1 ;
    public final void rule__Predefined__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3713:1: ( rule__Predefined__Group__0__Impl rule__Predefined__Group__1 )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3714:2: rule__Predefined__Group__0__Impl rule__Predefined__Group__1
            {
            pushFollow(FOLLOW_rule__Predefined__Group__0__Impl_in_rule__Predefined__Group__07827);
            rule__Predefined__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Predefined__Group__1_in_rule__Predefined__Group__07830);
            rule__Predefined__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__Predefined__Group__0"


    // $ANTLR start "rule__Predefined__Group__0__Impl"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3721:1: rule__Predefined__Group__0__Impl : ( ( rule__Predefined__TypeAssignment_0 ) ) ;
    public final void rule__Predefined__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3725:1: ( ( ( rule__Predefined__TypeAssignment_0 ) ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3726:1: ( ( rule__Predefined__TypeAssignment_0 ) )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3726:1: ( ( rule__Predefined__TypeAssignment_0 ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3727:1: ( rule__Predefined__TypeAssignment_0 )
            {
             before(grammarAccess.getPredefinedAccess().getTypeAssignment_0()); 
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3728:1: ( rule__Predefined__TypeAssignment_0 )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3728:2: rule__Predefined__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__Predefined__TypeAssignment_0_in_rule__Predefined__Group__0__Impl7857);
            rule__Predefined__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPredefinedAccess().getTypeAssignment_0()); 

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
    // $ANTLR end "rule__Predefined__Group__0__Impl"


    // $ANTLR start "rule__Predefined__Group__1"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3738:1: rule__Predefined__Group__1 : rule__Predefined__Group__1__Impl ;
    public final void rule__Predefined__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3742:1: ( rule__Predefined__Group__1__Impl )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3743:2: rule__Predefined__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Predefined__Group__1__Impl_in_rule__Predefined__Group__17887);
            rule__Predefined__Group__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__Predefined__Group__1"


    // $ANTLR start "rule__Predefined__Group__1__Impl"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3749:1: rule__Predefined__Group__1__Impl : ( ( rule__Predefined__PointerAssignment_1 )? ) ;
    public final void rule__Predefined__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3753:1: ( ( ( rule__Predefined__PointerAssignment_1 )? ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3754:1: ( ( rule__Predefined__PointerAssignment_1 )? )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3754:1: ( ( rule__Predefined__PointerAssignment_1 )? )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3755:1: ( rule__Predefined__PointerAssignment_1 )?
            {
             before(grammarAccess.getPredefinedAccess().getPointerAssignment_1()); 
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3756:1: ( rule__Predefined__PointerAssignment_1 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_POINTER) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3756:2: rule__Predefined__PointerAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Predefined__PointerAssignment_1_in_rule__Predefined__Group__1__Impl7914);
                    rule__Predefined__PointerAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPredefinedAccess().getPointerAssignment_1()); 

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
    // $ANTLR end "rule__Predefined__Group__1__Impl"


    // $ANTLR start "rule__Vector__Group__0"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3770:1: rule__Vector__Group__0 : rule__Vector__Group__0__Impl rule__Vector__Group__1 ;
    public final void rule__Vector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3774:1: ( rule__Vector__Group__0__Impl rule__Vector__Group__1 )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3775:2: rule__Vector__Group__0__Impl rule__Vector__Group__1
            {
            pushFollow(FOLLOW_rule__Vector__Group__0__Impl_in_rule__Vector__Group__07949);
            rule__Vector__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Vector__Group__1_in_rule__Vector__Group__07952);
            rule__Vector__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__Vector__Group__0"


    // $ANTLR start "rule__Vector__Group__0__Impl"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3782:1: rule__Vector__Group__0__Impl : ( '<' ) ;
    public final void rule__Vector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3786:1: ( ( '<' ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3787:1: ( '<' )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3787:1: ( '<' )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3788:1: '<'
            {
             before(grammarAccess.getVectorAccess().getLessThanSignKeyword_0()); 
            match(input,111,FOLLOW_111_in_rule__Vector__Group__0__Impl7980); 
             after(grammarAccess.getVectorAccess().getLessThanSignKeyword_0()); 

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
    // $ANTLR end "rule__Vector__Group__0__Impl"


    // $ANTLR start "rule__Vector__Group__1"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3801:1: rule__Vector__Group__1 : rule__Vector__Group__1__Impl rule__Vector__Group__2 ;
    public final void rule__Vector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3805:1: ( rule__Vector__Group__1__Impl rule__Vector__Group__2 )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3806:2: rule__Vector__Group__1__Impl rule__Vector__Group__2
            {
            pushFollow(FOLLOW_rule__Vector__Group__1__Impl_in_rule__Vector__Group__18011);
            rule__Vector__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Vector__Group__2_in_rule__Vector__Group__18014);
            rule__Vector__Group__2();

            state._fsp--;


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
    // $ANTLR end "rule__Vector__Group__1"


    // $ANTLR start "rule__Vector__Group__1__Impl"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3813:1: rule__Vector__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__Vector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3817:1: ( ( RULE_INT ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3818:1: ( RULE_INT )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3818:1: ( RULE_INT )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3819:1: RULE_INT
            {
             before(grammarAccess.getVectorAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Vector__Group__1__Impl8041); 
             after(grammarAccess.getVectorAccess().getINTTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__Vector__Group__1__Impl"


    // $ANTLR start "rule__Vector__Group__2"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3830:1: rule__Vector__Group__2 : rule__Vector__Group__2__Impl rule__Vector__Group__3 ;
    public final void rule__Vector__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3834:1: ( rule__Vector__Group__2__Impl rule__Vector__Group__3 )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3835:2: rule__Vector__Group__2__Impl rule__Vector__Group__3
            {
            pushFollow(FOLLOW_rule__Vector__Group__2__Impl_in_rule__Vector__Group__28070);
            rule__Vector__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Vector__Group__3_in_rule__Vector__Group__28073);
            rule__Vector__Group__3();

            state._fsp--;


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
    // $ANTLR end "rule__Vector__Group__2"


    // $ANTLR start "rule__Vector__Group__2__Impl"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3842:1: rule__Vector__Group__2__Impl : ( 'x' ) ;
    public final void rule__Vector__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3846:1: ( ( 'x' ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3847:1: ( 'x' )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3847:1: ( 'x' )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3848:1: 'x'
            {
             before(grammarAccess.getVectorAccess().getXKeyword_2()); 
            match(input,112,FOLLOW_112_in_rule__Vector__Group__2__Impl8101); 
             after(grammarAccess.getVectorAccess().getXKeyword_2()); 

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
    // $ANTLR end "rule__Vector__Group__2__Impl"


    // $ANTLR start "rule__Vector__Group__3"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3861:1: rule__Vector__Group__3 : rule__Vector__Group__3__Impl rule__Vector__Group__4 ;
    public final void rule__Vector__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3865:1: ( rule__Vector__Group__3__Impl rule__Vector__Group__4 )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3866:2: rule__Vector__Group__3__Impl rule__Vector__Group__4
            {
            pushFollow(FOLLOW_rule__Vector__Group__3__Impl_in_rule__Vector__Group__38132);
            rule__Vector__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Vector__Group__4_in_rule__Vector__Group__38135);
            rule__Vector__Group__4();

            state._fsp--;


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
    // $ANTLR end "rule__Vector__Group__3"


    // $ANTLR start "rule__Vector__Group__3__Impl"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3873:1: rule__Vector__Group__3__Impl : ( ruleTypeUse ) ;
    public final void rule__Vector__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3877:1: ( ( ruleTypeUse ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3878:1: ( ruleTypeUse )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3878:1: ( ruleTypeUse )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3879:1: ruleTypeUse
            {
             before(grammarAccess.getVectorAccess().getTypeUseParserRuleCall_3()); 
            pushFollow(FOLLOW_ruleTypeUse_in_rule__Vector__Group__3__Impl8162);
            ruleTypeUse();

            state._fsp--;

             after(grammarAccess.getVectorAccess().getTypeUseParserRuleCall_3()); 

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
    // $ANTLR end "rule__Vector__Group__3__Impl"


    // $ANTLR start "rule__Vector__Group__4"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3890:1: rule__Vector__Group__4 : rule__Vector__Group__4__Impl ;
    public final void rule__Vector__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3894:1: ( rule__Vector__Group__4__Impl )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3895:2: rule__Vector__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Vector__Group__4__Impl_in_rule__Vector__Group__48191);
            rule__Vector__Group__4__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__Vector__Group__4"


    // $ANTLR start "rule__Vector__Group__4__Impl"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3901:1: rule__Vector__Group__4__Impl : ( '>' ) ;
    public final void rule__Vector__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3905:1: ( ( '>' ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3906:1: ( '>' )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3906:1: ( '>' )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3907:1: '>'
            {
             before(grammarAccess.getVectorAccess().getGreaterThanSignKeyword_4()); 
            match(input,113,FOLLOW_113_in_rule__Vector__Group__4__Impl8219); 
             after(grammarAccess.getVectorAccess().getGreaterThanSignKeyword_4()); 

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
    // $ANTLR end "rule__Vector__Group__4__Impl"


    // $ANTLR start "rule__Array__Group__0"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3930:1: rule__Array__Group__0 : rule__Array__Group__0__Impl rule__Array__Group__1 ;
    public final void rule__Array__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3934:1: ( rule__Array__Group__0__Impl rule__Array__Group__1 )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3935:2: rule__Array__Group__0__Impl rule__Array__Group__1
            {
            pushFollow(FOLLOW_rule__Array__Group__0__Impl_in_rule__Array__Group__08260);
            rule__Array__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Array__Group__1_in_rule__Array__Group__08263);
            rule__Array__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__Array__Group__0"


    // $ANTLR start "rule__Array__Group__0__Impl"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3942:1: rule__Array__Group__0__Impl : ( RULE_ARRAYL ) ;
    public final void rule__Array__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3946:1: ( ( RULE_ARRAYL ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3947:1: ( RULE_ARRAYL )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3947:1: ( RULE_ARRAYL )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3948:1: RULE_ARRAYL
            {
             before(grammarAccess.getArrayAccess().getARRAYLTerminalRuleCall_0()); 
            match(input,RULE_ARRAYL,FOLLOW_RULE_ARRAYL_in_rule__Array__Group__0__Impl8290); 
             after(grammarAccess.getArrayAccess().getARRAYLTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__Array__Group__0__Impl"


    // $ANTLR start "rule__Array__Group__1"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3959:1: rule__Array__Group__1 : rule__Array__Group__1__Impl rule__Array__Group__2 ;
    public final void rule__Array__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3963:1: ( rule__Array__Group__1__Impl rule__Array__Group__2 )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3964:2: rule__Array__Group__1__Impl rule__Array__Group__2
            {
            pushFollow(FOLLOW_rule__Array__Group__1__Impl_in_rule__Array__Group__18319);
            rule__Array__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Array__Group__2_in_rule__Array__Group__18322);
            rule__Array__Group__2();

            state._fsp--;


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
    // $ANTLR end "rule__Array__Group__1"


    // $ANTLR start "rule__Array__Group__1__Impl"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3971:1: rule__Array__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__Array__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3975:1: ( ( RULE_INT ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3976:1: ( RULE_INT )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3976:1: ( RULE_INT )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3977:1: RULE_INT
            {
             before(grammarAccess.getArrayAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Array__Group__1__Impl8349); 
             after(grammarAccess.getArrayAccess().getINTTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__Array__Group__1__Impl"


    // $ANTLR start "rule__Array__Group__2"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3988:1: rule__Array__Group__2 : rule__Array__Group__2__Impl rule__Array__Group__3 ;
    public final void rule__Array__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3992:1: ( rule__Array__Group__2__Impl rule__Array__Group__3 )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:3993:2: rule__Array__Group__2__Impl rule__Array__Group__3
            {
            pushFollow(FOLLOW_rule__Array__Group__2__Impl_in_rule__Array__Group__28378);
            rule__Array__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Array__Group__3_in_rule__Array__Group__28381);
            rule__Array__Group__3();

            state._fsp--;


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
    // $ANTLR end "rule__Array__Group__2"


    // $ANTLR start "rule__Array__Group__2__Impl"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4000:1: rule__Array__Group__2__Impl : ( 'x' ) ;
    public final void rule__Array__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4004:1: ( ( 'x' ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4005:1: ( 'x' )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4005:1: ( 'x' )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4006:1: 'x'
            {
             before(grammarAccess.getArrayAccess().getXKeyword_2()); 
            match(input,112,FOLLOW_112_in_rule__Array__Group__2__Impl8409); 
             after(grammarAccess.getArrayAccess().getXKeyword_2()); 

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
    // $ANTLR end "rule__Array__Group__2__Impl"


    // $ANTLR start "rule__Array__Group__3"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4019:1: rule__Array__Group__3 : rule__Array__Group__3__Impl rule__Array__Group__4 ;
    public final void rule__Array__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4023:1: ( rule__Array__Group__3__Impl rule__Array__Group__4 )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4024:2: rule__Array__Group__3__Impl rule__Array__Group__4
            {
            pushFollow(FOLLOW_rule__Array__Group__3__Impl_in_rule__Array__Group__38440);
            rule__Array__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Array__Group__4_in_rule__Array__Group__38443);
            rule__Array__Group__4();

            state._fsp--;


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
    // $ANTLR end "rule__Array__Group__3"


    // $ANTLR start "rule__Array__Group__3__Impl"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4031:1: rule__Array__Group__3__Impl : ( ruleTypeUse ) ;
    public final void rule__Array__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4035:1: ( ( ruleTypeUse ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4036:1: ( ruleTypeUse )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4036:1: ( ruleTypeUse )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4037:1: ruleTypeUse
            {
             before(grammarAccess.getArrayAccess().getTypeUseParserRuleCall_3()); 
            pushFollow(FOLLOW_ruleTypeUse_in_rule__Array__Group__3__Impl8470);
            ruleTypeUse();

            state._fsp--;

             after(grammarAccess.getArrayAccess().getTypeUseParserRuleCall_3()); 

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
    // $ANTLR end "rule__Array__Group__3__Impl"


    // $ANTLR start "rule__Array__Group__4"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4048:1: rule__Array__Group__4 : rule__Array__Group__4__Impl ;
    public final void rule__Array__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4052:1: ( rule__Array__Group__4__Impl )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4053:2: rule__Array__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Array__Group__4__Impl_in_rule__Array__Group__48499);
            rule__Array__Group__4__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__Array__Group__4"


    // $ANTLR start "rule__Array__Group__4__Impl"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4059:1: rule__Array__Group__4__Impl : ( RULE_ARRAYR ) ;
    public final void rule__Array__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4063:1: ( ( RULE_ARRAYR ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4064:1: ( RULE_ARRAYR )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4064:1: ( RULE_ARRAYR )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4065:1: RULE_ARRAYR
            {
             before(grammarAccess.getArrayAccess().getARRAYRTerminalRuleCall_4()); 
            match(input,RULE_ARRAYR,FOLLOW_RULE_ARRAYR_in_rule__Array__Group__4__Impl8526); 
             after(grammarAccess.getArrayAccess().getARRAYRTerminalRuleCall_4()); 

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
    // $ANTLR end "rule__Array__Group__4__Impl"


    // $ANTLR start "rule__NonConstantValue__Group__0"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4087:1: rule__NonConstantValue__Group__0 : rule__NonConstantValue__Group__0__Impl rule__NonConstantValue__Group__1 ;
    public final void rule__NonConstantValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4091:1: ( rule__NonConstantValue__Group__0__Impl rule__NonConstantValue__Group__1 )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4092:2: rule__NonConstantValue__Group__0__Impl rule__NonConstantValue__Group__1
            {
            pushFollow(FOLLOW_rule__NonConstantValue__Group__0__Impl_in_rule__NonConstantValue__Group__08566);
            rule__NonConstantValue__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NonConstantValue__Group__1_in_rule__NonConstantValue__Group__08569);
            rule__NonConstantValue__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__NonConstantValue__Group__0"


    // $ANTLR start "rule__NonConstantValue__Group__0__Impl"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4099:1: rule__NonConstantValue__Group__0__Impl : ( ( rule__NonConstantValue__NameAssignment_0 ) ) ;
    public final void rule__NonConstantValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4103:1: ( ( ( rule__NonConstantValue__NameAssignment_0 ) ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4104:1: ( ( rule__NonConstantValue__NameAssignment_0 ) )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4104:1: ( ( rule__NonConstantValue__NameAssignment_0 ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4105:1: ( rule__NonConstantValue__NameAssignment_0 )
            {
             before(grammarAccess.getNonConstantValueAccess().getNameAssignment_0()); 
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4106:1: ( rule__NonConstantValue__NameAssignment_0 )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4106:2: rule__NonConstantValue__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__NonConstantValue__NameAssignment_0_in_rule__NonConstantValue__Group__0__Impl8596);
            rule__NonConstantValue__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getNonConstantValueAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__NonConstantValue__Group__0__Impl"


    // $ANTLR start "rule__NonConstantValue__Group__1"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4116:1: rule__NonConstantValue__Group__1 : rule__NonConstantValue__Group__1__Impl ;
    public final void rule__NonConstantValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4120:1: ( rule__NonConstantValue__Group__1__Impl )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4121:2: rule__NonConstantValue__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__NonConstantValue__Group__1__Impl_in_rule__NonConstantValue__Group__18626);
            rule__NonConstantValue__Group__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__NonConstantValue__Group__1"


    // $ANTLR start "rule__NonConstantValue__Group__1__Impl"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4127:1: rule__NonConstantValue__Group__1__Impl : ( ( rule__NonConstantValue__PointerAssignment_1 )? ) ;
    public final void rule__NonConstantValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4131:1: ( ( ( rule__NonConstantValue__PointerAssignment_1 )? ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4132:1: ( ( rule__NonConstantValue__PointerAssignment_1 )? )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4132:1: ( ( rule__NonConstantValue__PointerAssignment_1 )? )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4133:1: ( rule__NonConstantValue__PointerAssignment_1 )?
            {
             before(grammarAccess.getNonConstantValueAccess().getPointerAssignment_1()); 
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4134:1: ( rule__NonConstantValue__PointerAssignment_1 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==RULE_POINTER) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4134:2: rule__NonConstantValue__PointerAssignment_1
                    {
                    pushFollow(FOLLOW_rule__NonConstantValue__PointerAssignment_1_in_rule__NonConstantValue__Group__1__Impl8653);
                    rule__NonConstantValue__PointerAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNonConstantValueAccess().getPointerAssignment_1()); 

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
    // $ANTLR end "rule__NonConstantValue__Group__1__Impl"


    // $ANTLR start "rule__Structure__Group__0"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4148:1: rule__Structure__Group__0 : rule__Structure__Group__0__Impl rule__Structure__Group__1 ;
    public final void rule__Structure__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4152:1: ( rule__Structure__Group__0__Impl rule__Structure__Group__1 )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4153:2: rule__Structure__Group__0__Impl rule__Structure__Group__1
            {
            pushFollow(FOLLOW_rule__Structure__Group__0__Impl_in_rule__Structure__Group__08688);
            rule__Structure__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Structure__Group__1_in_rule__Structure__Group__08691);
            rule__Structure__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__Structure__Group__0"


    // $ANTLR start "rule__Structure__Group__0__Impl"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4160:1: rule__Structure__Group__0__Impl : ( () ) ;
    public final void rule__Structure__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4164:1: ( ( () ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4165:1: ( () )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4165:1: ( () )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4166:1: ()
            {
             before(grammarAccess.getStructureAccess().getStructureAction_0()); 
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4167:1: ()
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4169:1: 
            {
            }

             after(grammarAccess.getStructureAccess().getStructureAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Structure__Group__0__Impl"


    // $ANTLR start "rule__Structure__Group__1"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4179:1: rule__Structure__Group__1 : rule__Structure__Group__1__Impl rule__Structure__Group__2 ;
    public final void rule__Structure__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4183:1: ( rule__Structure__Group__1__Impl rule__Structure__Group__2 )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4184:2: rule__Structure__Group__1__Impl rule__Structure__Group__2
            {
            pushFollow(FOLLOW_rule__Structure__Group__1__Impl_in_rule__Structure__Group__18749);
            rule__Structure__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Structure__Group__2_in_rule__Structure__Group__18752);
            rule__Structure__Group__2();

            state._fsp--;


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
    // $ANTLR end "rule__Structure__Group__1"


    // $ANTLR start "rule__Structure__Group__1__Impl"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4191:1: rule__Structure__Group__1__Impl : ( '{' ) ;
    public final void rule__Structure__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4195:1: ( ( '{' ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4196:1: ( '{' )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4196:1: ( '{' )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4197:1: '{'
            {
             before(grammarAccess.getStructureAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,114,FOLLOW_114_in_rule__Structure__Group__1__Impl8780); 
             after(grammarAccess.getStructureAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__Structure__Group__1__Impl"


    // $ANTLR start "rule__Structure__Group__2"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4210:1: rule__Structure__Group__2 : rule__Structure__Group__2__Impl rule__Structure__Group__3 ;
    public final void rule__Structure__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4214:1: ( rule__Structure__Group__2__Impl rule__Structure__Group__3 )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4215:2: rule__Structure__Group__2__Impl rule__Structure__Group__3
            {
            pushFollow(FOLLOW_rule__Structure__Group__2__Impl_in_rule__Structure__Group__28811);
            rule__Structure__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Structure__Group__3_in_rule__Structure__Group__28814);
            rule__Structure__Group__3();

            state._fsp--;


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
    // $ANTLR end "rule__Structure__Group__2"


    // $ANTLR start "rule__Structure__Group__2__Impl"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4222:1: rule__Structure__Group__2__Impl : ( ( rule__Structure__Group_2__0 )? ) ;
    public final void rule__Structure__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4226:1: ( ( ( rule__Structure__Group_2__0 )? ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4227:1: ( ( rule__Structure__Group_2__0 )? )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4227:1: ( ( rule__Structure__Group_2__0 )? )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4228:1: ( rule__Structure__Group_2__0 )?
            {
             before(grammarAccess.getStructureAccess().getGroup_2()); 
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4229:1: ( rule__Structure__Group_2__0 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==RULE_INT_TYPE||LA46_0==RULE_VALID_ID||(LA46_0>=24 && LA46_0<=35)) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4229:2: rule__Structure__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Structure__Group_2__0_in_rule__Structure__Group__2__Impl8841);
                    rule__Structure__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStructureAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Structure__Group__2__Impl"


    // $ANTLR start "rule__Structure__Group__3"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4239:1: rule__Structure__Group__3 : rule__Structure__Group__3__Impl rule__Structure__Group__4 ;
    public final void rule__Structure__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4243:1: ( rule__Structure__Group__3__Impl rule__Structure__Group__4 )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4244:2: rule__Structure__Group__3__Impl rule__Structure__Group__4
            {
            pushFollow(FOLLOW_rule__Structure__Group__3__Impl_in_rule__Structure__Group__38872);
            rule__Structure__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Structure__Group__4_in_rule__Structure__Group__38875);
            rule__Structure__Group__4();

            state._fsp--;


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
    // $ANTLR end "rule__Structure__Group__3"


    // $ANTLR start "rule__Structure__Group__3__Impl"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4251:1: rule__Structure__Group__3__Impl : ( '}' ) ;
    public final void rule__Structure__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4255:1: ( ( '}' ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4256:1: ( '}' )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4256:1: ( '}' )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4257:1: '}'
            {
             before(grammarAccess.getStructureAccess().getRightCurlyBracketKeyword_3()); 
            match(input,115,FOLLOW_115_in_rule__Structure__Group__3__Impl8903); 
             after(grammarAccess.getStructureAccess().getRightCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__Structure__Group__3__Impl"


    // $ANTLR start "rule__Structure__Group__4"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4270:1: rule__Structure__Group__4 : rule__Structure__Group__4__Impl ;
    public final void rule__Structure__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4274:1: ( rule__Structure__Group__4__Impl )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4275:2: rule__Structure__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Structure__Group__4__Impl_in_rule__Structure__Group__48934);
            rule__Structure__Group__4__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__Structure__Group__4"


    // $ANTLR start "rule__Structure__Group__4__Impl"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4281:1: rule__Structure__Group__4__Impl : ( ( RULE_POINTER )? ) ;
    public final void rule__Structure__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4285:1: ( ( ( RULE_POINTER )? ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4286:1: ( ( RULE_POINTER )? )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4286:1: ( ( RULE_POINTER )? )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4287:1: ( RULE_POINTER )?
            {
             before(grammarAccess.getStructureAccess().getPOINTERTerminalRuleCall_4()); 
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4288:1: ( RULE_POINTER )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==RULE_POINTER) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4288:3: RULE_POINTER
                    {
                    match(input,RULE_POINTER,FOLLOW_RULE_POINTER_in_rule__Structure__Group__4__Impl8962); 

                    }
                    break;

            }

             after(grammarAccess.getStructureAccess().getPOINTERTerminalRuleCall_4()); 

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
    // $ANTLR end "rule__Structure__Group__4__Impl"


    // $ANTLR start "rule__Structure__Group_2__0"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4308:1: rule__Structure__Group_2__0 : rule__Structure__Group_2__0__Impl rule__Structure__Group_2__1 ;
    public final void rule__Structure__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4312:1: ( rule__Structure__Group_2__0__Impl rule__Structure__Group_2__1 )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4313:2: rule__Structure__Group_2__0__Impl rule__Structure__Group_2__1
            {
            pushFollow(FOLLOW_rule__Structure__Group_2__0__Impl_in_rule__Structure__Group_2__09003);
            rule__Structure__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Structure__Group_2__1_in_rule__Structure__Group_2__09006);
            rule__Structure__Group_2__1();

            state._fsp--;


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
    // $ANTLR end "rule__Structure__Group_2__0"


    // $ANTLR start "rule__Structure__Group_2__0__Impl"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4320:1: rule__Structure__Group_2__0__Impl : ( ( rule__Structure__TypesAssignment_2_0 ) ) ;
    public final void rule__Structure__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4324:1: ( ( ( rule__Structure__TypesAssignment_2_0 ) ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4325:1: ( ( rule__Structure__TypesAssignment_2_0 ) )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4325:1: ( ( rule__Structure__TypesAssignment_2_0 ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4326:1: ( rule__Structure__TypesAssignment_2_0 )
            {
             before(grammarAccess.getStructureAccess().getTypesAssignment_2_0()); 
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4327:1: ( rule__Structure__TypesAssignment_2_0 )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4327:2: rule__Structure__TypesAssignment_2_0
            {
            pushFollow(FOLLOW_rule__Structure__TypesAssignment_2_0_in_rule__Structure__Group_2__0__Impl9033);
            rule__Structure__TypesAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getStructureAccess().getTypesAssignment_2_0()); 

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
    // $ANTLR end "rule__Structure__Group_2__0__Impl"


    // $ANTLR start "rule__Structure__Group_2__1"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4337:1: rule__Structure__Group_2__1 : rule__Structure__Group_2__1__Impl ;
    public final void rule__Structure__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4341:1: ( rule__Structure__Group_2__1__Impl )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4342:2: rule__Structure__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Structure__Group_2__1__Impl_in_rule__Structure__Group_2__19063);
            rule__Structure__Group_2__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__Structure__Group_2__1"


    // $ANTLR start "rule__Structure__Group_2__1__Impl"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4348:1: rule__Structure__Group_2__1__Impl : ( ( rule__Structure__Group_2_1__0 )* ) ;
    public final void rule__Structure__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4352:1: ( ( ( rule__Structure__Group_2_1__0 )* ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4353:1: ( ( rule__Structure__Group_2_1__0 )* )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4353:1: ( ( rule__Structure__Group_2_1__0 )* )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4354:1: ( rule__Structure__Group_2_1__0 )*
            {
             before(grammarAccess.getStructureAccess().getGroup_2_1()); 
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4355:1: ( rule__Structure__Group_2_1__0 )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==106) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4355:2: rule__Structure__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Structure__Group_2_1__0_in_rule__Structure__Group_2__1__Impl9090);
            	    rule__Structure__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);

             after(grammarAccess.getStructureAccess().getGroup_2_1()); 

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
    // $ANTLR end "rule__Structure__Group_2__1__Impl"


    // $ANTLR start "rule__Structure__Group_2_1__0"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4369:1: rule__Structure__Group_2_1__0 : rule__Structure__Group_2_1__0__Impl rule__Structure__Group_2_1__1 ;
    public final void rule__Structure__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4373:1: ( rule__Structure__Group_2_1__0__Impl rule__Structure__Group_2_1__1 )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4374:2: rule__Structure__Group_2_1__0__Impl rule__Structure__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__Structure__Group_2_1__0__Impl_in_rule__Structure__Group_2_1__09125);
            rule__Structure__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Structure__Group_2_1__1_in_rule__Structure__Group_2_1__09128);
            rule__Structure__Group_2_1__1();

            state._fsp--;


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
    // $ANTLR end "rule__Structure__Group_2_1__0"


    // $ANTLR start "rule__Structure__Group_2_1__0__Impl"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4381:1: rule__Structure__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__Structure__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4385:1: ( ( ',' ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4386:1: ( ',' )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4386:1: ( ',' )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4387:1: ','
            {
             before(grammarAccess.getStructureAccess().getCommaKeyword_2_1_0()); 
            match(input,106,FOLLOW_106_in_rule__Structure__Group_2_1__0__Impl9156); 
             after(grammarAccess.getStructureAccess().getCommaKeyword_2_1_0()); 

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
    // $ANTLR end "rule__Structure__Group_2_1__0__Impl"


    // $ANTLR start "rule__Structure__Group_2_1__1"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4400:1: rule__Structure__Group_2_1__1 : rule__Structure__Group_2_1__1__Impl ;
    public final void rule__Structure__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4404:1: ( rule__Structure__Group_2_1__1__Impl )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4405:2: rule__Structure__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Structure__Group_2_1__1__Impl_in_rule__Structure__Group_2_1__19187);
            rule__Structure__Group_2_1__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__Structure__Group_2_1__1"


    // $ANTLR start "rule__Structure__Group_2_1__1__Impl"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4411:1: rule__Structure__Group_2_1__1__Impl : ( ( rule__Structure__TypesAssignment_2_1_1 ) ) ;
    public final void rule__Structure__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4415:1: ( ( ( rule__Structure__TypesAssignment_2_1_1 ) ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4416:1: ( ( rule__Structure__TypesAssignment_2_1_1 ) )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4416:1: ( ( rule__Structure__TypesAssignment_2_1_1 ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4417:1: ( rule__Structure__TypesAssignment_2_1_1 )
            {
             before(grammarAccess.getStructureAccess().getTypesAssignment_2_1_1()); 
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4418:1: ( rule__Structure__TypesAssignment_2_1_1 )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4418:2: rule__Structure__TypesAssignment_2_1_1
            {
            pushFollow(FOLLOW_rule__Structure__TypesAssignment_2_1_1_in_rule__Structure__Group_2_1__1__Impl9214);
            rule__Structure__TypesAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getStructureAccess().getTypesAssignment_2_1_1()); 

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
    // $ANTLR end "rule__Structure__Group_2_1__1__Impl"


    // $ANTLR start "rule__ParameterList__Group__0"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4432:1: rule__ParameterList__Group__0 : rule__ParameterList__Group__0__Impl rule__ParameterList__Group__1 ;
    public final void rule__ParameterList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4436:1: ( rule__ParameterList__Group__0__Impl rule__ParameterList__Group__1 )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4437:2: rule__ParameterList__Group__0__Impl rule__ParameterList__Group__1
            {
            pushFollow(FOLLOW_rule__ParameterList__Group__0__Impl_in_rule__ParameterList__Group__09248);
            rule__ParameterList__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParameterList__Group__1_in_rule__ParameterList__Group__09251);
            rule__ParameterList__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__ParameterList__Group__0"


    // $ANTLR start "rule__ParameterList__Group__0__Impl"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4444:1: rule__ParameterList__Group__0__Impl : ( () ) ;
    public final void rule__ParameterList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4448:1: ( ( () ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4449:1: ( () )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4449:1: ( () )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4450:1: ()
            {
             before(grammarAccess.getParameterListAccess().getParameterListAction_0()); 
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4451:1: ()
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4453:1: 
            {
            }

             after(grammarAccess.getParameterListAccess().getParameterListAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterList__Group__0__Impl"


    // $ANTLR start "rule__ParameterList__Group__1"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4463:1: rule__ParameterList__Group__1 : rule__ParameterList__Group__1__Impl rule__ParameterList__Group__2 ;
    public final void rule__ParameterList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4467:1: ( rule__ParameterList__Group__1__Impl rule__ParameterList__Group__2 )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4468:2: rule__ParameterList__Group__1__Impl rule__ParameterList__Group__2
            {
            pushFollow(FOLLOW_rule__ParameterList__Group__1__Impl_in_rule__ParameterList__Group__19309);
            rule__ParameterList__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParameterList__Group__2_in_rule__ParameterList__Group__19312);
            rule__ParameterList__Group__2();

            state._fsp--;


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
    // $ANTLR end "rule__ParameterList__Group__1"


    // $ANTLR start "rule__ParameterList__Group__1__Impl"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4475:1: rule__ParameterList__Group__1__Impl : ( '(' ) ;
    public final void rule__ParameterList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4479:1: ( ( '(' ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4480:1: ( '(' )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4480:1: ( '(' )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4481:1: '('
            {
             before(grammarAccess.getParameterListAccess().getLeftParenthesisKeyword_1()); 
            match(input,116,FOLLOW_116_in_rule__ParameterList__Group__1__Impl9340); 
             after(grammarAccess.getParameterListAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__ParameterList__Group__1__Impl"


    // $ANTLR start "rule__ParameterList__Group__2"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4494:1: rule__ParameterList__Group__2 : rule__ParameterList__Group__2__Impl rule__ParameterList__Group__3 ;
    public final void rule__ParameterList__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4498:1: ( rule__ParameterList__Group__2__Impl rule__ParameterList__Group__3 )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4499:2: rule__ParameterList__Group__2__Impl rule__ParameterList__Group__3
            {
            pushFollow(FOLLOW_rule__ParameterList__Group__2__Impl_in_rule__ParameterList__Group__29371);
            rule__ParameterList__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParameterList__Group__3_in_rule__ParameterList__Group__29374);
            rule__ParameterList__Group__3();

            state._fsp--;


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
    // $ANTLR end "rule__ParameterList__Group__2"


    // $ANTLR start "rule__ParameterList__Group__2__Impl"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4506:1: rule__ParameterList__Group__2__Impl : ( ( rule__ParameterList__Group_2__0 )? ) ;
    public final void rule__ParameterList__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4510:1: ( ( ( rule__ParameterList__Group_2__0 )? ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4511:1: ( ( rule__ParameterList__Group_2__0 )? )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4511:1: ( ( rule__ParameterList__Group_2__0 )? )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4512:1: ( rule__ParameterList__Group_2__0 )?
            {
             before(grammarAccess.getParameterListAccess().getGroup_2()); 
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4513:1: ( rule__ParameterList__Group_2__0 )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==RULE_INT_TYPE||LA49_0==RULE_VALID_ID||(LA49_0>=24 && LA49_0<=35)) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4513:2: rule__ParameterList__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__ParameterList__Group_2__0_in_rule__ParameterList__Group__2__Impl9401);
                    rule__ParameterList__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getParameterListAccess().getGroup_2()); 

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
    // $ANTLR end "rule__ParameterList__Group__2__Impl"


    // $ANTLR start "rule__ParameterList__Group__3"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4523:1: rule__ParameterList__Group__3 : rule__ParameterList__Group__3__Impl ;
    public final void rule__ParameterList__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4527:1: ( rule__ParameterList__Group__3__Impl )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4528:2: rule__ParameterList__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ParameterList__Group__3__Impl_in_rule__ParameterList__Group__39432);
            rule__ParameterList__Group__3__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__ParameterList__Group__3"


    // $ANTLR start "rule__ParameterList__Group__3__Impl"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4534:1: rule__ParameterList__Group__3__Impl : ( ')' ) ;
    public final void rule__ParameterList__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4538:1: ( ( ')' ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4539:1: ( ')' )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4539:1: ( ')' )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4540:1: ')'
            {
             before(grammarAccess.getParameterListAccess().getRightParenthesisKeyword_3()); 
            match(input,37,FOLLOW_37_in_rule__ParameterList__Group__3__Impl9460); 
             after(grammarAccess.getParameterListAccess().getRightParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__ParameterList__Group__3__Impl"


    // $ANTLR start "rule__ParameterList__Group_2__0"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4561:1: rule__ParameterList__Group_2__0 : rule__ParameterList__Group_2__0__Impl rule__ParameterList__Group_2__1 ;
    public final void rule__ParameterList__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4565:1: ( rule__ParameterList__Group_2__0__Impl rule__ParameterList__Group_2__1 )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4566:2: rule__ParameterList__Group_2__0__Impl rule__ParameterList__Group_2__1
            {
            pushFollow(FOLLOW_rule__ParameterList__Group_2__0__Impl_in_rule__ParameterList__Group_2__09499);
            rule__ParameterList__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParameterList__Group_2__1_in_rule__ParameterList__Group_2__09502);
            rule__ParameterList__Group_2__1();

            state._fsp--;


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
    // $ANTLR end "rule__ParameterList__Group_2__0"


    // $ANTLR start "rule__ParameterList__Group_2__0__Impl"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4573:1: rule__ParameterList__Group_2__0__Impl : ( ( rule__ParameterList__TypesAssignment_2_0 ) ) ;
    public final void rule__ParameterList__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4577:1: ( ( ( rule__ParameterList__TypesAssignment_2_0 ) ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4578:1: ( ( rule__ParameterList__TypesAssignment_2_0 ) )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4578:1: ( ( rule__ParameterList__TypesAssignment_2_0 ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4579:1: ( rule__ParameterList__TypesAssignment_2_0 )
            {
             before(grammarAccess.getParameterListAccess().getTypesAssignment_2_0()); 
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4580:1: ( rule__ParameterList__TypesAssignment_2_0 )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4580:2: rule__ParameterList__TypesAssignment_2_0
            {
            pushFollow(FOLLOW_rule__ParameterList__TypesAssignment_2_0_in_rule__ParameterList__Group_2__0__Impl9529);
            rule__ParameterList__TypesAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getParameterListAccess().getTypesAssignment_2_0()); 

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
    // $ANTLR end "rule__ParameterList__Group_2__0__Impl"


    // $ANTLR start "rule__ParameterList__Group_2__1"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4590:1: rule__ParameterList__Group_2__1 : rule__ParameterList__Group_2__1__Impl rule__ParameterList__Group_2__2 ;
    public final void rule__ParameterList__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4594:1: ( rule__ParameterList__Group_2__1__Impl rule__ParameterList__Group_2__2 )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4595:2: rule__ParameterList__Group_2__1__Impl rule__ParameterList__Group_2__2
            {
            pushFollow(FOLLOW_rule__ParameterList__Group_2__1__Impl_in_rule__ParameterList__Group_2__19559);
            rule__ParameterList__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParameterList__Group_2__2_in_rule__ParameterList__Group_2__19562);
            rule__ParameterList__Group_2__2();

            state._fsp--;


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
    // $ANTLR end "rule__ParameterList__Group_2__1"


    // $ANTLR start "rule__ParameterList__Group_2__1__Impl"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4602:1: rule__ParameterList__Group_2__1__Impl : ( ( rule__ParameterList__ListsAssignment_2_1 )? ) ;
    public final void rule__ParameterList__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4606:1: ( ( ( rule__ParameterList__ListsAssignment_2_1 )? ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4607:1: ( ( rule__ParameterList__ListsAssignment_2_1 )? )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4607:1: ( ( rule__ParameterList__ListsAssignment_2_1 )? )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4608:1: ( rule__ParameterList__ListsAssignment_2_1 )?
            {
             before(grammarAccess.getParameterListAccess().getListsAssignment_2_1()); 
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4609:1: ( rule__ParameterList__ListsAssignment_2_1 )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==36||LA50_0==116) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4609:2: rule__ParameterList__ListsAssignment_2_1
                    {
                    pushFollow(FOLLOW_rule__ParameterList__ListsAssignment_2_1_in_rule__ParameterList__Group_2__1__Impl9589);
                    rule__ParameterList__ListsAssignment_2_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getParameterListAccess().getListsAssignment_2_1()); 

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
    // $ANTLR end "rule__ParameterList__Group_2__1__Impl"


    // $ANTLR start "rule__ParameterList__Group_2__2"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4619:1: rule__ParameterList__Group_2__2 : rule__ParameterList__Group_2__2__Impl rule__ParameterList__Group_2__3 ;
    public final void rule__ParameterList__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4623:1: ( rule__ParameterList__Group_2__2__Impl rule__ParameterList__Group_2__3 )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4624:2: rule__ParameterList__Group_2__2__Impl rule__ParameterList__Group_2__3
            {
            pushFollow(FOLLOW_rule__ParameterList__Group_2__2__Impl_in_rule__ParameterList__Group_2__29620);
            rule__ParameterList__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParameterList__Group_2__3_in_rule__ParameterList__Group_2__29623);
            rule__ParameterList__Group_2__3();

            state._fsp--;


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
    // $ANTLR end "rule__ParameterList__Group_2__2"


    // $ANTLR start "rule__ParameterList__Group_2__2__Impl"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4631:1: rule__ParameterList__Group_2__2__Impl : ( ( ruleRETURN_ATTRIBUTES )* ) ;
    public final void rule__ParameterList__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4635:1: ( ( ( ruleRETURN_ATTRIBUTES )* ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4636:1: ( ( ruleRETURN_ATTRIBUTES )* )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4636:1: ( ( ruleRETURN_ATTRIBUTES )* )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4637:1: ( ruleRETURN_ATTRIBUTES )*
            {
             before(grammarAccess.getParameterListAccess().getRETURN_ATTRIBUTESParserRuleCall_2_2()); 
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4638:1: ( ruleRETURN_ATTRIBUTES )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( ((LA51_0>=43 && LA51_0<=50)) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4638:3: ruleRETURN_ATTRIBUTES
            	    {
            	    pushFollow(FOLLOW_ruleRETURN_ATTRIBUTES_in_rule__ParameterList__Group_2__2__Impl9651);
            	    ruleRETURN_ATTRIBUTES();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);

             after(grammarAccess.getParameterListAccess().getRETURN_ATTRIBUTESParserRuleCall_2_2()); 

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
    // $ANTLR end "rule__ParameterList__Group_2__2__Impl"


    // $ANTLR start "rule__ParameterList__Group_2__3"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4648:1: rule__ParameterList__Group_2__3 : rule__ParameterList__Group_2__3__Impl rule__ParameterList__Group_2__4 ;
    public final void rule__ParameterList__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4652:1: ( rule__ParameterList__Group_2__3__Impl rule__ParameterList__Group_2__4 )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4653:2: rule__ParameterList__Group_2__3__Impl rule__ParameterList__Group_2__4
            {
            pushFollow(FOLLOW_rule__ParameterList__Group_2__3__Impl_in_rule__ParameterList__Group_2__39682);
            rule__ParameterList__Group_2__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParameterList__Group_2__4_in_rule__ParameterList__Group_2__39685);
            rule__ParameterList__Group_2__4();

            state._fsp--;


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
    // $ANTLR end "rule__ParameterList__Group_2__3"


    // $ANTLR start "rule__ParameterList__Group_2__3__Impl"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4660:1: rule__ParameterList__Group_2__3__Impl : ( ( rule__ParameterList__VariablesAssignment_2_3 ) ) ;
    public final void rule__ParameterList__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4664:1: ( ( ( rule__ParameterList__VariablesAssignment_2_3 ) ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4665:1: ( ( rule__ParameterList__VariablesAssignment_2_3 ) )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4665:1: ( ( rule__ParameterList__VariablesAssignment_2_3 ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4666:1: ( rule__ParameterList__VariablesAssignment_2_3 )
            {
             before(grammarAccess.getParameterListAccess().getVariablesAssignment_2_3()); 
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4667:1: ( rule__ParameterList__VariablesAssignment_2_3 )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4667:2: rule__ParameterList__VariablesAssignment_2_3
            {
            pushFollow(FOLLOW_rule__ParameterList__VariablesAssignment_2_3_in_rule__ParameterList__Group_2__3__Impl9712);
            rule__ParameterList__VariablesAssignment_2_3();

            state._fsp--;


            }

             after(grammarAccess.getParameterListAccess().getVariablesAssignment_2_3()); 

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
    // $ANTLR end "rule__ParameterList__Group_2__3__Impl"


    // $ANTLR start "rule__ParameterList__Group_2__4"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4677:1: rule__ParameterList__Group_2__4 : rule__ParameterList__Group_2__4__Impl ;
    public final void rule__ParameterList__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4681:1: ( rule__ParameterList__Group_2__4__Impl )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4682:2: rule__ParameterList__Group_2__4__Impl
            {
            pushFollow(FOLLOW_rule__ParameterList__Group_2__4__Impl_in_rule__ParameterList__Group_2__49742);
            rule__ParameterList__Group_2__4__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__ParameterList__Group_2__4"


    // $ANTLR start "rule__ParameterList__Group_2__4__Impl"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4688:1: rule__ParameterList__Group_2__4__Impl : ( ( rule__ParameterList__Group_2_4__0 )* ) ;
    public final void rule__ParameterList__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4692:1: ( ( ( rule__ParameterList__Group_2_4__0 )* ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4693:1: ( ( rule__ParameterList__Group_2_4__0 )* )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4693:1: ( ( rule__ParameterList__Group_2_4__0 )* )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4694:1: ( rule__ParameterList__Group_2_4__0 )*
            {
             before(grammarAccess.getParameterListAccess().getGroup_2_4()); 
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4695:1: ( rule__ParameterList__Group_2_4__0 )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==106) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4695:2: rule__ParameterList__Group_2_4__0
            	    {
            	    pushFollow(FOLLOW_rule__ParameterList__Group_2_4__0_in_rule__ParameterList__Group_2__4__Impl9769);
            	    rule__ParameterList__Group_2_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);

             after(grammarAccess.getParameterListAccess().getGroup_2_4()); 

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
    // $ANTLR end "rule__ParameterList__Group_2__4__Impl"


    // $ANTLR start "rule__ParameterList__Group_2_4__0"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4715:1: rule__ParameterList__Group_2_4__0 : rule__ParameterList__Group_2_4__0__Impl rule__ParameterList__Group_2_4__1 ;
    public final void rule__ParameterList__Group_2_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4719:1: ( rule__ParameterList__Group_2_4__0__Impl rule__ParameterList__Group_2_4__1 )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4720:2: rule__ParameterList__Group_2_4__0__Impl rule__ParameterList__Group_2_4__1
            {
            pushFollow(FOLLOW_rule__ParameterList__Group_2_4__0__Impl_in_rule__ParameterList__Group_2_4__09810);
            rule__ParameterList__Group_2_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParameterList__Group_2_4__1_in_rule__ParameterList__Group_2_4__09813);
            rule__ParameterList__Group_2_4__1();

            state._fsp--;


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
    // $ANTLR end "rule__ParameterList__Group_2_4__0"


    // $ANTLR start "rule__ParameterList__Group_2_4__0__Impl"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4727:1: rule__ParameterList__Group_2_4__0__Impl : ( ',' ) ;
    public final void rule__ParameterList__Group_2_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4731:1: ( ( ',' ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4732:1: ( ',' )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4732:1: ( ',' )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4733:1: ','
            {
             before(grammarAccess.getParameterListAccess().getCommaKeyword_2_4_0()); 
            match(input,106,FOLLOW_106_in_rule__ParameterList__Group_2_4__0__Impl9841); 
             after(grammarAccess.getParameterListAccess().getCommaKeyword_2_4_0()); 

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
    // $ANTLR end "rule__ParameterList__Group_2_4__0__Impl"


    // $ANTLR start "rule__ParameterList__Group_2_4__1"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4746:1: rule__ParameterList__Group_2_4__1 : rule__ParameterList__Group_2_4__1__Impl rule__ParameterList__Group_2_4__2 ;
    public final void rule__ParameterList__Group_2_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4750:1: ( rule__ParameterList__Group_2_4__1__Impl rule__ParameterList__Group_2_4__2 )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4751:2: rule__ParameterList__Group_2_4__1__Impl rule__ParameterList__Group_2_4__2
            {
            pushFollow(FOLLOW_rule__ParameterList__Group_2_4__1__Impl_in_rule__ParameterList__Group_2_4__19872);
            rule__ParameterList__Group_2_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParameterList__Group_2_4__2_in_rule__ParameterList__Group_2_4__19875);
            rule__ParameterList__Group_2_4__2();

            state._fsp--;


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
    // $ANTLR end "rule__ParameterList__Group_2_4__1"


    // $ANTLR start "rule__ParameterList__Group_2_4__1__Impl"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4758:1: rule__ParameterList__Group_2_4__1__Impl : ( ( rule__ParameterList__TypesAssignment_2_4_1 ) ) ;
    public final void rule__ParameterList__Group_2_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4762:1: ( ( ( rule__ParameterList__TypesAssignment_2_4_1 ) ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4763:1: ( ( rule__ParameterList__TypesAssignment_2_4_1 ) )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4763:1: ( ( rule__ParameterList__TypesAssignment_2_4_1 ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4764:1: ( rule__ParameterList__TypesAssignment_2_4_1 )
            {
             before(grammarAccess.getParameterListAccess().getTypesAssignment_2_4_1()); 
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4765:1: ( rule__ParameterList__TypesAssignment_2_4_1 )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4765:2: rule__ParameterList__TypesAssignment_2_4_1
            {
            pushFollow(FOLLOW_rule__ParameterList__TypesAssignment_2_4_1_in_rule__ParameterList__Group_2_4__1__Impl9902);
            rule__ParameterList__TypesAssignment_2_4_1();

            state._fsp--;


            }

             after(grammarAccess.getParameterListAccess().getTypesAssignment_2_4_1()); 

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
    // $ANTLR end "rule__ParameterList__Group_2_4__1__Impl"


    // $ANTLR start "rule__ParameterList__Group_2_4__2"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4775:1: rule__ParameterList__Group_2_4__2 : rule__ParameterList__Group_2_4__2__Impl rule__ParameterList__Group_2_4__3 ;
    public final void rule__ParameterList__Group_2_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4779:1: ( rule__ParameterList__Group_2_4__2__Impl rule__ParameterList__Group_2_4__3 )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4780:2: rule__ParameterList__Group_2_4__2__Impl rule__ParameterList__Group_2_4__3
            {
            pushFollow(FOLLOW_rule__ParameterList__Group_2_4__2__Impl_in_rule__ParameterList__Group_2_4__29932);
            rule__ParameterList__Group_2_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParameterList__Group_2_4__3_in_rule__ParameterList__Group_2_4__29935);
            rule__ParameterList__Group_2_4__3();

            state._fsp--;


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
    // $ANTLR end "rule__ParameterList__Group_2_4__2"


    // $ANTLR start "rule__ParameterList__Group_2_4__2__Impl"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4787:1: rule__ParameterList__Group_2_4__2__Impl : ( ( rule__ParameterList__ListsAssignment_2_4_2 )? ) ;
    public final void rule__ParameterList__Group_2_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4791:1: ( ( ( rule__ParameterList__ListsAssignment_2_4_2 )? ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4792:1: ( ( rule__ParameterList__ListsAssignment_2_4_2 )? )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4792:1: ( ( rule__ParameterList__ListsAssignment_2_4_2 )? )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4793:1: ( rule__ParameterList__ListsAssignment_2_4_2 )?
            {
             before(grammarAccess.getParameterListAccess().getListsAssignment_2_4_2()); 
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4794:1: ( rule__ParameterList__ListsAssignment_2_4_2 )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==36||LA53_0==116) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4794:2: rule__ParameterList__ListsAssignment_2_4_2
                    {
                    pushFollow(FOLLOW_rule__ParameterList__ListsAssignment_2_4_2_in_rule__ParameterList__Group_2_4__2__Impl9962);
                    rule__ParameterList__ListsAssignment_2_4_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getParameterListAccess().getListsAssignment_2_4_2()); 

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
    // $ANTLR end "rule__ParameterList__Group_2_4__2__Impl"


    // $ANTLR start "rule__ParameterList__Group_2_4__3"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4804:1: rule__ParameterList__Group_2_4__3 : rule__ParameterList__Group_2_4__3__Impl rule__ParameterList__Group_2_4__4 ;
    public final void rule__ParameterList__Group_2_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4808:1: ( rule__ParameterList__Group_2_4__3__Impl rule__ParameterList__Group_2_4__4 )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4809:2: rule__ParameterList__Group_2_4__3__Impl rule__ParameterList__Group_2_4__4
            {
            pushFollow(FOLLOW_rule__ParameterList__Group_2_4__3__Impl_in_rule__ParameterList__Group_2_4__39993);
            rule__ParameterList__Group_2_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParameterList__Group_2_4__4_in_rule__ParameterList__Group_2_4__39996);
            rule__ParameterList__Group_2_4__4();

            state._fsp--;


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
    // $ANTLR end "rule__ParameterList__Group_2_4__3"


    // $ANTLR start "rule__ParameterList__Group_2_4__3__Impl"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4816:1: rule__ParameterList__Group_2_4__3__Impl : ( ( ruleRETURN_ATTRIBUTES )* ) ;
    public final void rule__ParameterList__Group_2_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4820:1: ( ( ( ruleRETURN_ATTRIBUTES )* ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4821:1: ( ( ruleRETURN_ATTRIBUTES )* )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4821:1: ( ( ruleRETURN_ATTRIBUTES )* )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4822:1: ( ruleRETURN_ATTRIBUTES )*
            {
             before(grammarAccess.getParameterListAccess().getRETURN_ATTRIBUTESParserRuleCall_2_4_3()); 
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4823:1: ( ruleRETURN_ATTRIBUTES )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( ((LA54_0>=43 && LA54_0<=50)) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4823:3: ruleRETURN_ATTRIBUTES
            	    {
            	    pushFollow(FOLLOW_ruleRETURN_ATTRIBUTES_in_rule__ParameterList__Group_2_4__3__Impl10024);
            	    ruleRETURN_ATTRIBUTES();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop54;
                }
            } while (true);

             after(grammarAccess.getParameterListAccess().getRETURN_ATTRIBUTESParserRuleCall_2_4_3()); 

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
    // $ANTLR end "rule__ParameterList__Group_2_4__3__Impl"


    // $ANTLR start "rule__ParameterList__Group_2_4__4"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4833:1: rule__ParameterList__Group_2_4__4 : rule__ParameterList__Group_2_4__4__Impl ;
    public final void rule__ParameterList__Group_2_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4837:1: ( rule__ParameterList__Group_2_4__4__Impl )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4838:2: rule__ParameterList__Group_2_4__4__Impl
            {
            pushFollow(FOLLOW_rule__ParameterList__Group_2_4__4__Impl_in_rule__ParameterList__Group_2_4__410055);
            rule__ParameterList__Group_2_4__4__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__ParameterList__Group_2_4__4"


    // $ANTLR start "rule__ParameterList__Group_2_4__4__Impl"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4844:1: rule__ParameterList__Group_2_4__4__Impl : ( ( rule__ParameterList__VariablesAssignment_2_4_4 ) ) ;
    public final void rule__ParameterList__Group_2_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4848:1: ( ( ( rule__ParameterList__VariablesAssignment_2_4_4 ) ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4849:1: ( ( rule__ParameterList__VariablesAssignment_2_4_4 ) )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4849:1: ( ( rule__ParameterList__VariablesAssignment_2_4_4 ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4850:1: ( rule__ParameterList__VariablesAssignment_2_4_4 )
            {
             before(grammarAccess.getParameterListAccess().getVariablesAssignment_2_4_4()); 
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4851:1: ( rule__ParameterList__VariablesAssignment_2_4_4 )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4851:2: rule__ParameterList__VariablesAssignment_2_4_4
            {
            pushFollow(FOLLOW_rule__ParameterList__VariablesAssignment_2_4_4_in_rule__ParameterList__Group_2_4__4__Impl10082);
            rule__ParameterList__VariablesAssignment_2_4_4();

            state._fsp--;


            }

             after(grammarAccess.getParameterListAccess().getVariablesAssignment_2_4_4()); 

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
    // $ANTLR end "rule__ParameterList__Group_2_4__4__Impl"


    // $ANTLR start "rule__FunctionBody__Group__0"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4871:1: rule__FunctionBody__Group__0 : rule__FunctionBody__Group__0__Impl rule__FunctionBody__Group__1 ;
    public final void rule__FunctionBody__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4875:1: ( rule__FunctionBody__Group__0__Impl rule__FunctionBody__Group__1 )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4876:2: rule__FunctionBody__Group__0__Impl rule__FunctionBody__Group__1
            {
            pushFollow(FOLLOW_rule__FunctionBody__Group__0__Impl_in_rule__FunctionBody__Group__010122);
            rule__FunctionBody__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FunctionBody__Group__1_in_rule__FunctionBody__Group__010125);
            rule__FunctionBody__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__FunctionBody__Group__0"


    // $ANTLR start "rule__FunctionBody__Group__0__Impl"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4883:1: rule__FunctionBody__Group__0__Impl : ( '{' ) ;
    public final void rule__FunctionBody__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4887:1: ( ( '{' ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4888:1: ( '{' )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4888:1: ( '{' )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4889:1: '{'
            {
             before(grammarAccess.getFunctionBodyAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,114,FOLLOW_114_in_rule__FunctionBody__Group__0__Impl10153); 
             after(grammarAccess.getFunctionBodyAccess().getLeftCurlyBracketKeyword_0()); 

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
    // $ANTLR end "rule__FunctionBody__Group__0__Impl"


    // $ANTLR start "rule__FunctionBody__Group__1"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4902:1: rule__FunctionBody__Group__1 : rule__FunctionBody__Group__1__Impl rule__FunctionBody__Group__2 ;
    public final void rule__FunctionBody__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4906:1: ( rule__FunctionBody__Group__1__Impl rule__FunctionBody__Group__2 )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4907:2: rule__FunctionBody__Group__1__Impl rule__FunctionBody__Group__2
            {
            pushFollow(FOLLOW_rule__FunctionBody__Group__1__Impl_in_rule__FunctionBody__Group__110184);
            rule__FunctionBody__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FunctionBody__Group__2_in_rule__FunctionBody__Group__110187);
            rule__FunctionBody__Group__2();

            state._fsp--;


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
    // $ANTLR end "rule__FunctionBody__Group__1"


    // $ANTLR start "rule__FunctionBody__Group__1__Impl"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4914:1: rule__FunctionBody__Group__1__Impl : ( ( ( rule__FunctionBody__BlocksAssignment_1 ) ) ( ( rule__FunctionBody__BlocksAssignment_1 )* ) ) ;
    public final void rule__FunctionBody__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4918:1: ( ( ( ( rule__FunctionBody__BlocksAssignment_1 ) ) ( ( rule__FunctionBody__BlocksAssignment_1 )* ) ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4919:1: ( ( ( rule__FunctionBody__BlocksAssignment_1 ) ) ( ( rule__FunctionBody__BlocksAssignment_1 )* ) )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4919:1: ( ( ( rule__FunctionBody__BlocksAssignment_1 ) ) ( ( rule__FunctionBody__BlocksAssignment_1 )* ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4920:1: ( ( rule__FunctionBody__BlocksAssignment_1 ) ) ( ( rule__FunctionBody__BlocksAssignment_1 )* )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4920:1: ( ( rule__FunctionBody__BlocksAssignment_1 ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4921:1: ( rule__FunctionBody__BlocksAssignment_1 )
            {
             before(grammarAccess.getFunctionBodyAccess().getBlocksAssignment_1()); 
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4922:1: ( rule__FunctionBody__BlocksAssignment_1 )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4922:2: rule__FunctionBody__BlocksAssignment_1
            {
            pushFollow(FOLLOW_rule__FunctionBody__BlocksAssignment_1_in_rule__FunctionBody__Group__1__Impl10216);
            rule__FunctionBody__BlocksAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFunctionBodyAccess().getBlocksAssignment_1()); 

            }

            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4925:1: ( ( rule__FunctionBody__BlocksAssignment_1 )* )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4926:1: ( rule__FunctionBody__BlocksAssignment_1 )*
            {
             before(grammarAccess.getFunctionBodyAccess().getBlocksAssignment_1()); 
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4927:1: ( rule__FunctionBody__BlocksAssignment_1 )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==RULE_ID) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4927:2: rule__FunctionBody__BlocksAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__FunctionBody__BlocksAssignment_1_in_rule__FunctionBody__Group__1__Impl10228);
            	    rule__FunctionBody__BlocksAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop55;
                }
            } while (true);

             after(grammarAccess.getFunctionBodyAccess().getBlocksAssignment_1()); 

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
    // $ANTLR end "rule__FunctionBody__Group__1__Impl"


    // $ANTLR start "rule__FunctionBody__Group__2"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4938:1: rule__FunctionBody__Group__2 : rule__FunctionBody__Group__2__Impl ;
    public final void rule__FunctionBody__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4942:1: ( rule__FunctionBody__Group__2__Impl )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4943:2: rule__FunctionBody__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__FunctionBody__Group__2__Impl_in_rule__FunctionBody__Group__210261);
            rule__FunctionBody__Group__2__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__FunctionBody__Group__2"


    // $ANTLR start "rule__FunctionBody__Group__2__Impl"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4949:1: rule__FunctionBody__Group__2__Impl : ( '}' ) ;
    public final void rule__FunctionBody__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4953:1: ( ( '}' ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4954:1: ( '}' )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4954:1: ( '}' )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4955:1: '}'
            {
             before(grammarAccess.getFunctionBodyAccess().getRightCurlyBracketKeyword_2()); 
            match(input,115,FOLLOW_115_in_rule__FunctionBody__Group__2__Impl10289); 
             after(grammarAccess.getFunctionBodyAccess().getRightCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__FunctionBody__Group__2__Impl"


    // $ANTLR start "rule__BasicBlock__Group__0"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4974:1: rule__BasicBlock__Group__0 : rule__BasicBlock__Group__0__Impl rule__BasicBlock__Group__1 ;
    public final void rule__BasicBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4978:1: ( rule__BasicBlock__Group__0__Impl rule__BasicBlock__Group__1 )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4979:2: rule__BasicBlock__Group__0__Impl rule__BasicBlock__Group__1
            {
            pushFollow(FOLLOW_rule__BasicBlock__Group__0__Impl_in_rule__BasicBlock__Group__010326);
            rule__BasicBlock__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BasicBlock__Group__1_in_rule__BasicBlock__Group__010329);
            rule__BasicBlock__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__BasicBlock__Group__0"


    // $ANTLR start "rule__BasicBlock__Group__0__Impl"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4986:1: rule__BasicBlock__Group__0__Impl : ( ( rule__BasicBlock__LabelAssignment_0 ) ) ;
    public final void rule__BasicBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4990:1: ( ( ( rule__BasicBlock__LabelAssignment_0 ) ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4991:1: ( ( rule__BasicBlock__LabelAssignment_0 ) )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4991:1: ( ( rule__BasicBlock__LabelAssignment_0 ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4992:1: ( rule__BasicBlock__LabelAssignment_0 )
            {
             before(grammarAccess.getBasicBlockAccess().getLabelAssignment_0()); 
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4993:1: ( rule__BasicBlock__LabelAssignment_0 )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:4993:2: rule__BasicBlock__LabelAssignment_0
            {
            pushFollow(FOLLOW_rule__BasicBlock__LabelAssignment_0_in_rule__BasicBlock__Group__0__Impl10356);
            rule__BasicBlock__LabelAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getBasicBlockAccess().getLabelAssignment_0()); 

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
    // $ANTLR end "rule__BasicBlock__Group__0__Impl"


    // $ANTLR start "rule__BasicBlock__Group__1"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5003:1: rule__BasicBlock__Group__1 : rule__BasicBlock__Group__1__Impl ;
    public final void rule__BasicBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5007:1: ( rule__BasicBlock__Group__1__Impl )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5008:2: rule__BasicBlock__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__BasicBlock__Group__1__Impl_in_rule__BasicBlock__Group__110386);
            rule__BasicBlock__Group__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__BasicBlock__Group__1"


    // $ANTLR start "rule__BasicBlock__Group__1__Impl"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5014:1: rule__BasicBlock__Group__1__Impl : ( ':' ) ;
    public final void rule__BasicBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5018:1: ( ( ':' ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5019:1: ( ':' )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5019:1: ( ':' )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5020:1: ':'
            {
             before(grammarAccess.getBasicBlockAccess().getColonKeyword_1()); 
            match(input,117,FOLLOW_117_in_rule__BasicBlock__Group__1__Impl10414); 
             after(grammarAccess.getBasicBlockAccess().getColonKeyword_1()); 

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
    // $ANTLR end "rule__BasicBlock__Group__1__Impl"


    // $ANTLR start "rule__TypeList__Group__0"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5037:1: rule__TypeList__Group__0 : rule__TypeList__Group__0__Impl rule__TypeList__Group__1 ;
    public final void rule__TypeList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5041:1: ( rule__TypeList__Group__0__Impl rule__TypeList__Group__1 )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5042:2: rule__TypeList__Group__0__Impl rule__TypeList__Group__1
            {
            pushFollow(FOLLOW_rule__TypeList__Group__0__Impl_in_rule__TypeList__Group__010449);
            rule__TypeList__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeList__Group__1_in_rule__TypeList__Group__010452);
            rule__TypeList__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__TypeList__Group__0"


    // $ANTLR start "rule__TypeList__Group__0__Impl"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5049:1: rule__TypeList__Group__0__Impl : ( () ) ;
    public final void rule__TypeList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5053:1: ( ( () ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5054:1: ( () )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5054:1: ( () )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5055:1: ()
            {
             before(grammarAccess.getTypeListAccess().getTypeListAction_0()); 
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5056:1: ()
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5058:1: 
            {
            }

             after(grammarAccess.getTypeListAccess().getTypeListAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeList__Group__0__Impl"


    // $ANTLR start "rule__TypeList__Group__1"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5068:1: rule__TypeList__Group__1 : rule__TypeList__Group__1__Impl ;
    public final void rule__TypeList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5072:1: ( rule__TypeList__Group__1__Impl )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5073:2: rule__TypeList__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__TypeList__Group__1__Impl_in_rule__TypeList__Group__110510);
            rule__TypeList__Group__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__TypeList__Group__1"


    // $ANTLR start "rule__TypeList__Group__1__Impl"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5079:1: rule__TypeList__Group__1__Impl : ( ( rule__TypeList__Alternatives_1 ) ) ;
    public final void rule__TypeList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5083:1: ( ( ( rule__TypeList__Alternatives_1 ) ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5084:1: ( ( rule__TypeList__Alternatives_1 ) )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5084:1: ( ( rule__TypeList__Alternatives_1 ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5085:1: ( rule__TypeList__Alternatives_1 )
            {
             before(grammarAccess.getTypeListAccess().getAlternatives_1()); 
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5086:1: ( rule__TypeList__Alternatives_1 )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5086:2: rule__TypeList__Alternatives_1
            {
            pushFollow(FOLLOW_rule__TypeList__Alternatives_1_in_rule__TypeList__Group__1__Impl10537);
            rule__TypeList__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getTypeListAccess().getAlternatives_1()); 

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
    // $ANTLR end "rule__TypeList__Group__1__Impl"


    // $ANTLR start "rule__TypeList__Group_1_1__0"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5100:1: rule__TypeList__Group_1_1__0 : rule__TypeList__Group_1_1__0__Impl rule__TypeList__Group_1_1__1 ;
    public final void rule__TypeList__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5104:1: ( rule__TypeList__Group_1_1__0__Impl rule__TypeList__Group_1_1__1 )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5105:2: rule__TypeList__Group_1_1__0__Impl rule__TypeList__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__TypeList__Group_1_1__0__Impl_in_rule__TypeList__Group_1_1__010571);
            rule__TypeList__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeList__Group_1_1__1_in_rule__TypeList__Group_1_1__010574);
            rule__TypeList__Group_1_1__1();

            state._fsp--;


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
    // $ANTLR end "rule__TypeList__Group_1_1__0"


    // $ANTLR start "rule__TypeList__Group_1_1__0__Impl"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5112:1: rule__TypeList__Group_1_1__0__Impl : ( '(' ) ;
    public final void rule__TypeList__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5116:1: ( ( '(' ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5117:1: ( '(' )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5117:1: ( '(' )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5118:1: '('
            {
             before(grammarAccess.getTypeListAccess().getLeftParenthesisKeyword_1_1_0()); 
            match(input,116,FOLLOW_116_in_rule__TypeList__Group_1_1__0__Impl10602); 
             after(grammarAccess.getTypeListAccess().getLeftParenthesisKeyword_1_1_0()); 

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
    // $ANTLR end "rule__TypeList__Group_1_1__0__Impl"


    // $ANTLR start "rule__TypeList__Group_1_1__1"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5131:1: rule__TypeList__Group_1_1__1 : rule__TypeList__Group_1_1__1__Impl rule__TypeList__Group_1_1__2 ;
    public final void rule__TypeList__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5135:1: ( rule__TypeList__Group_1_1__1__Impl rule__TypeList__Group_1_1__2 )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5136:2: rule__TypeList__Group_1_1__1__Impl rule__TypeList__Group_1_1__2
            {
            pushFollow(FOLLOW_rule__TypeList__Group_1_1__1__Impl_in_rule__TypeList__Group_1_1__110633);
            rule__TypeList__Group_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeList__Group_1_1__2_in_rule__TypeList__Group_1_1__110636);
            rule__TypeList__Group_1_1__2();

            state._fsp--;


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
    // $ANTLR end "rule__TypeList__Group_1_1__1"


    // $ANTLR start "rule__TypeList__Group_1_1__1__Impl"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5143:1: rule__TypeList__Group_1_1__1__Impl : ( ( rule__TypeList__Group_1_1_1__0 )? ) ;
    public final void rule__TypeList__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5147:1: ( ( ( rule__TypeList__Group_1_1_1__0 )? ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5148:1: ( ( rule__TypeList__Group_1_1_1__0 )? )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5148:1: ( ( rule__TypeList__Group_1_1_1__0 )? )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5149:1: ( rule__TypeList__Group_1_1_1__0 )?
            {
             before(grammarAccess.getTypeListAccess().getGroup_1_1_1()); 
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5150:1: ( rule__TypeList__Group_1_1_1__0 )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==RULE_INT_TYPE||LA56_0==RULE_VALID_ID||(LA56_0>=24 && LA56_0<=35)) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5150:2: rule__TypeList__Group_1_1_1__0
                    {
                    pushFollow(FOLLOW_rule__TypeList__Group_1_1_1__0_in_rule__TypeList__Group_1_1__1__Impl10663);
                    rule__TypeList__Group_1_1_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTypeListAccess().getGroup_1_1_1()); 

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
    // $ANTLR end "rule__TypeList__Group_1_1__1__Impl"


    // $ANTLR start "rule__TypeList__Group_1_1__2"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5160:1: rule__TypeList__Group_1_1__2 : rule__TypeList__Group_1_1__2__Impl ;
    public final void rule__TypeList__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5164:1: ( rule__TypeList__Group_1_1__2__Impl )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5165:2: rule__TypeList__Group_1_1__2__Impl
            {
            pushFollow(FOLLOW_rule__TypeList__Group_1_1__2__Impl_in_rule__TypeList__Group_1_1__210694);
            rule__TypeList__Group_1_1__2__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__TypeList__Group_1_1__2"


    // $ANTLR start "rule__TypeList__Group_1_1__2__Impl"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5171:1: rule__TypeList__Group_1_1__2__Impl : ( ( rule__TypeList__Alternatives_1_1_2 ) ) ;
    public final void rule__TypeList__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5175:1: ( ( ( rule__TypeList__Alternatives_1_1_2 ) ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5176:1: ( ( rule__TypeList__Alternatives_1_1_2 ) )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5176:1: ( ( rule__TypeList__Alternatives_1_1_2 ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5177:1: ( rule__TypeList__Alternatives_1_1_2 )
            {
             before(grammarAccess.getTypeListAccess().getAlternatives_1_1_2()); 
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5178:1: ( rule__TypeList__Alternatives_1_1_2 )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5178:2: rule__TypeList__Alternatives_1_1_2
            {
            pushFollow(FOLLOW_rule__TypeList__Alternatives_1_1_2_in_rule__TypeList__Group_1_1__2__Impl10721);
            rule__TypeList__Alternatives_1_1_2();

            state._fsp--;


            }

             after(grammarAccess.getTypeListAccess().getAlternatives_1_1_2()); 

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
    // $ANTLR end "rule__TypeList__Group_1_1__2__Impl"


    // $ANTLR start "rule__TypeList__Group_1_1_1__0"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5194:1: rule__TypeList__Group_1_1_1__0 : rule__TypeList__Group_1_1_1__0__Impl rule__TypeList__Group_1_1_1__1 ;
    public final void rule__TypeList__Group_1_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5198:1: ( rule__TypeList__Group_1_1_1__0__Impl rule__TypeList__Group_1_1_1__1 )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5199:2: rule__TypeList__Group_1_1_1__0__Impl rule__TypeList__Group_1_1_1__1
            {
            pushFollow(FOLLOW_rule__TypeList__Group_1_1_1__0__Impl_in_rule__TypeList__Group_1_1_1__010757);
            rule__TypeList__Group_1_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeList__Group_1_1_1__1_in_rule__TypeList__Group_1_1_1__010760);
            rule__TypeList__Group_1_1_1__1();

            state._fsp--;


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
    // $ANTLR end "rule__TypeList__Group_1_1_1__0"


    // $ANTLR start "rule__TypeList__Group_1_1_1__0__Impl"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5206:1: rule__TypeList__Group_1_1_1__0__Impl : ( ( rule__TypeList__TypesAssignment_1_1_1_0 ) ) ;
    public final void rule__TypeList__Group_1_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5210:1: ( ( ( rule__TypeList__TypesAssignment_1_1_1_0 ) ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5211:1: ( ( rule__TypeList__TypesAssignment_1_1_1_0 ) )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5211:1: ( ( rule__TypeList__TypesAssignment_1_1_1_0 ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5212:1: ( rule__TypeList__TypesAssignment_1_1_1_0 )
            {
             before(grammarAccess.getTypeListAccess().getTypesAssignment_1_1_1_0()); 
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5213:1: ( rule__TypeList__TypesAssignment_1_1_1_0 )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5213:2: rule__TypeList__TypesAssignment_1_1_1_0
            {
            pushFollow(FOLLOW_rule__TypeList__TypesAssignment_1_1_1_0_in_rule__TypeList__Group_1_1_1__0__Impl10787);
            rule__TypeList__TypesAssignment_1_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getTypeListAccess().getTypesAssignment_1_1_1_0()); 

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
    // $ANTLR end "rule__TypeList__Group_1_1_1__0__Impl"


    // $ANTLR start "rule__TypeList__Group_1_1_1__1"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5223:1: rule__TypeList__Group_1_1_1__1 : rule__TypeList__Group_1_1_1__1__Impl rule__TypeList__Group_1_1_1__2 ;
    public final void rule__TypeList__Group_1_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5227:1: ( rule__TypeList__Group_1_1_1__1__Impl rule__TypeList__Group_1_1_1__2 )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5228:2: rule__TypeList__Group_1_1_1__1__Impl rule__TypeList__Group_1_1_1__2
            {
            pushFollow(FOLLOW_rule__TypeList__Group_1_1_1__1__Impl_in_rule__TypeList__Group_1_1_1__110817);
            rule__TypeList__Group_1_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeList__Group_1_1_1__2_in_rule__TypeList__Group_1_1_1__110820);
            rule__TypeList__Group_1_1_1__2();

            state._fsp--;


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
    // $ANTLR end "rule__TypeList__Group_1_1_1__1"


    // $ANTLR start "rule__TypeList__Group_1_1_1__1__Impl"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5235:1: rule__TypeList__Group_1_1_1__1__Impl : ( ( rule__TypeList__TypelistsAssignment_1_1_1_1 )? ) ;
    public final void rule__TypeList__Group_1_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5239:1: ( ( ( rule__TypeList__TypelistsAssignment_1_1_1_1 )? ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5240:1: ( ( rule__TypeList__TypelistsAssignment_1_1_1_1 )? )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5240:1: ( ( rule__TypeList__TypelistsAssignment_1_1_1_1 )? )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5241:1: ( rule__TypeList__TypelistsAssignment_1_1_1_1 )?
            {
             before(grammarAccess.getTypeListAccess().getTypelistsAssignment_1_1_1_1()); 
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5242:1: ( rule__TypeList__TypelistsAssignment_1_1_1_1 )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==36||LA57_0==116) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5242:2: rule__TypeList__TypelistsAssignment_1_1_1_1
                    {
                    pushFollow(FOLLOW_rule__TypeList__TypelistsAssignment_1_1_1_1_in_rule__TypeList__Group_1_1_1__1__Impl10847);
                    rule__TypeList__TypelistsAssignment_1_1_1_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTypeListAccess().getTypelistsAssignment_1_1_1_1()); 

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
    // $ANTLR end "rule__TypeList__Group_1_1_1__1__Impl"


    // $ANTLR start "rule__TypeList__Group_1_1_1__2"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5252:1: rule__TypeList__Group_1_1_1__2 : rule__TypeList__Group_1_1_1__2__Impl rule__TypeList__Group_1_1_1__3 ;
    public final void rule__TypeList__Group_1_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5256:1: ( rule__TypeList__Group_1_1_1__2__Impl rule__TypeList__Group_1_1_1__3 )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5257:2: rule__TypeList__Group_1_1_1__2__Impl rule__TypeList__Group_1_1_1__3
            {
            pushFollow(FOLLOW_rule__TypeList__Group_1_1_1__2__Impl_in_rule__TypeList__Group_1_1_1__210878);
            rule__TypeList__Group_1_1_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeList__Group_1_1_1__3_in_rule__TypeList__Group_1_1_1__210881);
            rule__TypeList__Group_1_1_1__3();

            state._fsp--;


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
    // $ANTLR end "rule__TypeList__Group_1_1_1__2"


    // $ANTLR start "rule__TypeList__Group_1_1_1__2__Impl"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5264:1: rule__TypeList__Group_1_1_1__2__Impl : ( ( ruleRETURN_ATTRIBUTES )? ) ;
    public final void rule__TypeList__Group_1_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5268:1: ( ( ( ruleRETURN_ATTRIBUTES )? ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5269:1: ( ( ruleRETURN_ATTRIBUTES )? )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5269:1: ( ( ruleRETURN_ATTRIBUTES )? )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5270:1: ( ruleRETURN_ATTRIBUTES )?
            {
             before(grammarAccess.getTypeListAccess().getRETURN_ATTRIBUTESParserRuleCall_1_1_1_2()); 
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5271:1: ( ruleRETURN_ATTRIBUTES )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( ((LA58_0>=43 && LA58_0<=50)) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5271:3: ruleRETURN_ATTRIBUTES
                    {
                    pushFollow(FOLLOW_ruleRETURN_ATTRIBUTES_in_rule__TypeList__Group_1_1_1__2__Impl10909);
                    ruleRETURN_ATTRIBUTES();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTypeListAccess().getRETURN_ATTRIBUTESParserRuleCall_1_1_1_2()); 

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
    // $ANTLR end "rule__TypeList__Group_1_1_1__2__Impl"


    // $ANTLR start "rule__TypeList__Group_1_1_1__3"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5281:1: rule__TypeList__Group_1_1_1__3 : rule__TypeList__Group_1_1_1__3__Impl ;
    public final void rule__TypeList__Group_1_1_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5285:1: ( rule__TypeList__Group_1_1_1__3__Impl )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5286:2: rule__TypeList__Group_1_1_1__3__Impl
            {
            pushFollow(FOLLOW_rule__TypeList__Group_1_1_1__3__Impl_in_rule__TypeList__Group_1_1_1__310940);
            rule__TypeList__Group_1_1_1__3__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__TypeList__Group_1_1_1__3"


    // $ANTLR start "rule__TypeList__Group_1_1_1__3__Impl"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5292:1: rule__TypeList__Group_1_1_1__3__Impl : ( ( rule__TypeList__Group_1_1_1_3__0 )* ) ;
    public final void rule__TypeList__Group_1_1_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5296:1: ( ( ( rule__TypeList__Group_1_1_1_3__0 )* ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5297:1: ( ( rule__TypeList__Group_1_1_1_3__0 )* )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5297:1: ( ( rule__TypeList__Group_1_1_1_3__0 )* )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5298:1: ( rule__TypeList__Group_1_1_1_3__0 )*
            {
             before(grammarAccess.getTypeListAccess().getGroup_1_1_1_3()); 
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5299:1: ( rule__TypeList__Group_1_1_1_3__0 )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==106) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5299:2: rule__TypeList__Group_1_1_1_3__0
            	    {
            	    pushFollow(FOLLOW_rule__TypeList__Group_1_1_1_3__0_in_rule__TypeList__Group_1_1_1__3__Impl10967);
            	    rule__TypeList__Group_1_1_1_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop59;
                }
            } while (true);

             after(grammarAccess.getTypeListAccess().getGroup_1_1_1_3()); 

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
    // $ANTLR end "rule__TypeList__Group_1_1_1__3__Impl"


    // $ANTLR start "rule__TypeList__Group_1_1_1_3__0"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5317:1: rule__TypeList__Group_1_1_1_3__0 : rule__TypeList__Group_1_1_1_3__0__Impl rule__TypeList__Group_1_1_1_3__1 ;
    public final void rule__TypeList__Group_1_1_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5321:1: ( rule__TypeList__Group_1_1_1_3__0__Impl rule__TypeList__Group_1_1_1_3__1 )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5322:2: rule__TypeList__Group_1_1_1_3__0__Impl rule__TypeList__Group_1_1_1_3__1
            {
            pushFollow(FOLLOW_rule__TypeList__Group_1_1_1_3__0__Impl_in_rule__TypeList__Group_1_1_1_3__011006);
            rule__TypeList__Group_1_1_1_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeList__Group_1_1_1_3__1_in_rule__TypeList__Group_1_1_1_3__011009);
            rule__TypeList__Group_1_1_1_3__1();

            state._fsp--;


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
    // $ANTLR end "rule__TypeList__Group_1_1_1_3__0"


    // $ANTLR start "rule__TypeList__Group_1_1_1_3__0__Impl"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5329:1: rule__TypeList__Group_1_1_1_3__0__Impl : ( ',' ) ;
    public final void rule__TypeList__Group_1_1_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5333:1: ( ( ',' ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5334:1: ( ',' )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5334:1: ( ',' )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5335:1: ','
            {
             before(grammarAccess.getTypeListAccess().getCommaKeyword_1_1_1_3_0()); 
            match(input,106,FOLLOW_106_in_rule__TypeList__Group_1_1_1_3__0__Impl11037); 
             after(grammarAccess.getTypeListAccess().getCommaKeyword_1_1_1_3_0()); 

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
    // $ANTLR end "rule__TypeList__Group_1_1_1_3__0__Impl"


    // $ANTLR start "rule__TypeList__Group_1_1_1_3__1"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5348:1: rule__TypeList__Group_1_1_1_3__1 : rule__TypeList__Group_1_1_1_3__1__Impl rule__TypeList__Group_1_1_1_3__2 ;
    public final void rule__TypeList__Group_1_1_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5352:1: ( rule__TypeList__Group_1_1_1_3__1__Impl rule__TypeList__Group_1_1_1_3__2 )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5353:2: rule__TypeList__Group_1_1_1_3__1__Impl rule__TypeList__Group_1_1_1_3__2
            {
            pushFollow(FOLLOW_rule__TypeList__Group_1_1_1_3__1__Impl_in_rule__TypeList__Group_1_1_1_3__111068);
            rule__TypeList__Group_1_1_1_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeList__Group_1_1_1_3__2_in_rule__TypeList__Group_1_1_1_3__111071);
            rule__TypeList__Group_1_1_1_3__2();

            state._fsp--;


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
    // $ANTLR end "rule__TypeList__Group_1_1_1_3__1"


    // $ANTLR start "rule__TypeList__Group_1_1_1_3__1__Impl"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5360:1: rule__TypeList__Group_1_1_1_3__1__Impl : ( ( rule__TypeList__TypesAssignment_1_1_1_3_1 ) ) ;
    public final void rule__TypeList__Group_1_1_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5364:1: ( ( ( rule__TypeList__TypesAssignment_1_1_1_3_1 ) ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5365:1: ( ( rule__TypeList__TypesAssignment_1_1_1_3_1 ) )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5365:1: ( ( rule__TypeList__TypesAssignment_1_1_1_3_1 ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5366:1: ( rule__TypeList__TypesAssignment_1_1_1_3_1 )
            {
             before(grammarAccess.getTypeListAccess().getTypesAssignment_1_1_1_3_1()); 
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5367:1: ( rule__TypeList__TypesAssignment_1_1_1_3_1 )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5367:2: rule__TypeList__TypesAssignment_1_1_1_3_1
            {
            pushFollow(FOLLOW_rule__TypeList__TypesAssignment_1_1_1_3_1_in_rule__TypeList__Group_1_1_1_3__1__Impl11098);
            rule__TypeList__TypesAssignment_1_1_1_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTypeListAccess().getTypesAssignment_1_1_1_3_1()); 

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
    // $ANTLR end "rule__TypeList__Group_1_1_1_3__1__Impl"


    // $ANTLR start "rule__TypeList__Group_1_1_1_3__2"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5377:1: rule__TypeList__Group_1_1_1_3__2 : rule__TypeList__Group_1_1_1_3__2__Impl rule__TypeList__Group_1_1_1_3__3 ;
    public final void rule__TypeList__Group_1_1_1_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5381:1: ( rule__TypeList__Group_1_1_1_3__2__Impl rule__TypeList__Group_1_1_1_3__3 )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5382:2: rule__TypeList__Group_1_1_1_3__2__Impl rule__TypeList__Group_1_1_1_3__3
            {
            pushFollow(FOLLOW_rule__TypeList__Group_1_1_1_3__2__Impl_in_rule__TypeList__Group_1_1_1_3__211128);
            rule__TypeList__Group_1_1_1_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeList__Group_1_1_1_3__3_in_rule__TypeList__Group_1_1_1_3__211131);
            rule__TypeList__Group_1_1_1_3__3();

            state._fsp--;


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
    // $ANTLR end "rule__TypeList__Group_1_1_1_3__2"


    // $ANTLR start "rule__TypeList__Group_1_1_1_3__2__Impl"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5389:1: rule__TypeList__Group_1_1_1_3__2__Impl : ( ( rule__TypeList__TypelistsAssignment_1_1_1_3_2 )? ) ;
    public final void rule__TypeList__Group_1_1_1_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5393:1: ( ( ( rule__TypeList__TypelistsAssignment_1_1_1_3_2 )? ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5394:1: ( ( rule__TypeList__TypelistsAssignment_1_1_1_3_2 )? )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5394:1: ( ( rule__TypeList__TypelistsAssignment_1_1_1_3_2 )? )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5395:1: ( rule__TypeList__TypelistsAssignment_1_1_1_3_2 )?
            {
             before(grammarAccess.getTypeListAccess().getTypelistsAssignment_1_1_1_3_2()); 
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5396:1: ( rule__TypeList__TypelistsAssignment_1_1_1_3_2 )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==36||LA60_0==116) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5396:2: rule__TypeList__TypelistsAssignment_1_1_1_3_2
                    {
                    pushFollow(FOLLOW_rule__TypeList__TypelistsAssignment_1_1_1_3_2_in_rule__TypeList__Group_1_1_1_3__2__Impl11158);
                    rule__TypeList__TypelistsAssignment_1_1_1_3_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTypeListAccess().getTypelistsAssignment_1_1_1_3_2()); 

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
    // $ANTLR end "rule__TypeList__Group_1_1_1_3__2__Impl"


    // $ANTLR start "rule__TypeList__Group_1_1_1_3__3"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5406:1: rule__TypeList__Group_1_1_1_3__3 : rule__TypeList__Group_1_1_1_3__3__Impl ;
    public final void rule__TypeList__Group_1_1_1_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5410:1: ( rule__TypeList__Group_1_1_1_3__3__Impl )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5411:2: rule__TypeList__Group_1_1_1_3__3__Impl
            {
            pushFollow(FOLLOW_rule__TypeList__Group_1_1_1_3__3__Impl_in_rule__TypeList__Group_1_1_1_3__311189);
            rule__TypeList__Group_1_1_1_3__3__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__TypeList__Group_1_1_1_3__3"


    // $ANTLR start "rule__TypeList__Group_1_1_1_3__3__Impl"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5417:1: rule__TypeList__Group_1_1_1_3__3__Impl : ( ( ruleRETURN_ATTRIBUTES )? ) ;
    public final void rule__TypeList__Group_1_1_1_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5421:1: ( ( ( ruleRETURN_ATTRIBUTES )? ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5422:1: ( ( ruleRETURN_ATTRIBUTES )? )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5422:1: ( ( ruleRETURN_ATTRIBUTES )? )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5423:1: ( ruleRETURN_ATTRIBUTES )?
            {
             before(grammarAccess.getTypeListAccess().getRETURN_ATTRIBUTESParserRuleCall_1_1_1_3_3()); 
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5424:1: ( ruleRETURN_ATTRIBUTES )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( ((LA61_0>=43 && LA61_0<=50)) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5424:3: ruleRETURN_ATTRIBUTES
                    {
                    pushFollow(FOLLOW_ruleRETURN_ATTRIBUTES_in_rule__TypeList__Group_1_1_1_3__3__Impl11217);
                    ruleRETURN_ATTRIBUTES();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTypeListAccess().getRETURN_ATTRIBUTESParserRuleCall_1_1_1_3_3()); 

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
    // $ANTLR end "rule__TypeList__Group_1_1_1_3__3__Impl"


    // $ANTLR start "rule__CallingConv__Group_14__0"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5442:1: rule__CallingConv__Group_14__0 : rule__CallingConv__Group_14__0__Impl rule__CallingConv__Group_14__1 ;
    public final void rule__CallingConv__Group_14__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5446:1: ( rule__CallingConv__Group_14__0__Impl rule__CallingConv__Group_14__1 )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5447:2: rule__CallingConv__Group_14__0__Impl rule__CallingConv__Group_14__1
            {
            pushFollow(FOLLOW_rule__CallingConv__Group_14__0__Impl_in_rule__CallingConv__Group_14__011256);
            rule__CallingConv__Group_14__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CallingConv__Group_14__1_in_rule__CallingConv__Group_14__011259);
            rule__CallingConv__Group_14__1();

            state._fsp--;


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
    // $ANTLR end "rule__CallingConv__Group_14__0"


    // $ANTLR start "rule__CallingConv__Group_14__0__Impl"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5454:1: rule__CallingConv__Group_14__0__Impl : ( 'cc' ) ;
    public final void rule__CallingConv__Group_14__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5458:1: ( ( 'cc' ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5459:1: ( 'cc' )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5459:1: ( 'cc' )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5460:1: 'cc'
            {
             before(grammarAccess.getCallingConvAccess().getCcKeyword_14_0()); 
            match(input,118,FOLLOW_118_in_rule__CallingConv__Group_14__0__Impl11287); 
             after(grammarAccess.getCallingConvAccess().getCcKeyword_14_0()); 

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
    // $ANTLR end "rule__CallingConv__Group_14__0__Impl"


    // $ANTLR start "rule__CallingConv__Group_14__1"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5473:1: rule__CallingConv__Group_14__1 : rule__CallingConv__Group_14__1__Impl rule__CallingConv__Group_14__2 ;
    public final void rule__CallingConv__Group_14__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5477:1: ( rule__CallingConv__Group_14__1__Impl rule__CallingConv__Group_14__2 )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5478:2: rule__CallingConv__Group_14__1__Impl rule__CallingConv__Group_14__2
            {
            pushFollow(FOLLOW_rule__CallingConv__Group_14__1__Impl_in_rule__CallingConv__Group_14__111318);
            rule__CallingConv__Group_14__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CallingConv__Group_14__2_in_rule__CallingConv__Group_14__111321);
            rule__CallingConv__Group_14__2();

            state._fsp--;


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
    // $ANTLR end "rule__CallingConv__Group_14__1"


    // $ANTLR start "rule__CallingConv__Group_14__1__Impl"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5485:1: rule__CallingConv__Group_14__1__Impl : ( '<' ) ;
    public final void rule__CallingConv__Group_14__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5489:1: ( ( '<' ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5490:1: ( '<' )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5490:1: ( '<' )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5491:1: '<'
            {
             before(grammarAccess.getCallingConvAccess().getLessThanSignKeyword_14_1()); 
            match(input,111,FOLLOW_111_in_rule__CallingConv__Group_14__1__Impl11349); 
             after(grammarAccess.getCallingConvAccess().getLessThanSignKeyword_14_1()); 

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
    // $ANTLR end "rule__CallingConv__Group_14__1__Impl"


    // $ANTLR start "rule__CallingConv__Group_14__2"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5504:1: rule__CallingConv__Group_14__2 : rule__CallingConv__Group_14__2__Impl rule__CallingConv__Group_14__3 ;
    public final void rule__CallingConv__Group_14__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5508:1: ( rule__CallingConv__Group_14__2__Impl rule__CallingConv__Group_14__3 )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5509:2: rule__CallingConv__Group_14__2__Impl rule__CallingConv__Group_14__3
            {
            pushFollow(FOLLOW_rule__CallingConv__Group_14__2__Impl_in_rule__CallingConv__Group_14__211380);
            rule__CallingConv__Group_14__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CallingConv__Group_14__3_in_rule__CallingConv__Group_14__211383);
            rule__CallingConv__Group_14__3();

            state._fsp--;


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
    // $ANTLR end "rule__CallingConv__Group_14__2"


    // $ANTLR start "rule__CallingConv__Group_14__2__Impl"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5516:1: rule__CallingConv__Group_14__2__Impl : ( RULE_INT ) ;
    public final void rule__CallingConv__Group_14__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5520:1: ( ( RULE_INT ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5521:1: ( RULE_INT )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5521:1: ( RULE_INT )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5522:1: RULE_INT
            {
             before(grammarAccess.getCallingConvAccess().getINTTerminalRuleCall_14_2()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__CallingConv__Group_14__2__Impl11410); 
             after(grammarAccess.getCallingConvAccess().getINTTerminalRuleCall_14_2()); 

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
    // $ANTLR end "rule__CallingConv__Group_14__2__Impl"


    // $ANTLR start "rule__CallingConv__Group_14__3"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5533:1: rule__CallingConv__Group_14__3 : rule__CallingConv__Group_14__3__Impl rule__CallingConv__Group_14__4 ;
    public final void rule__CallingConv__Group_14__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5537:1: ( rule__CallingConv__Group_14__3__Impl rule__CallingConv__Group_14__4 )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5538:2: rule__CallingConv__Group_14__3__Impl rule__CallingConv__Group_14__4
            {
            pushFollow(FOLLOW_rule__CallingConv__Group_14__3__Impl_in_rule__CallingConv__Group_14__311439);
            rule__CallingConv__Group_14__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CallingConv__Group_14__4_in_rule__CallingConv__Group_14__311442);
            rule__CallingConv__Group_14__4();

            state._fsp--;


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
    // $ANTLR end "rule__CallingConv__Group_14__3"


    // $ANTLR start "rule__CallingConv__Group_14__3__Impl"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5545:1: rule__CallingConv__Group_14__3__Impl : ( '>' ) ;
    public final void rule__CallingConv__Group_14__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5549:1: ( ( '>' ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5550:1: ( '>' )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5550:1: ( '>' )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5551:1: '>'
            {
             before(grammarAccess.getCallingConvAccess().getGreaterThanSignKeyword_14_3()); 
            match(input,113,FOLLOW_113_in_rule__CallingConv__Group_14__3__Impl11470); 
             after(grammarAccess.getCallingConvAccess().getGreaterThanSignKeyword_14_3()); 

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
    // $ANTLR end "rule__CallingConv__Group_14__3__Impl"


    // $ANTLR start "rule__CallingConv__Group_14__4"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5564:1: rule__CallingConv__Group_14__4 : rule__CallingConv__Group_14__4__Impl ;
    public final void rule__CallingConv__Group_14__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5568:1: ( rule__CallingConv__Group_14__4__Impl )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5569:2: rule__CallingConv__Group_14__4__Impl
            {
            pushFollow(FOLLOW_rule__CallingConv__Group_14__4__Impl_in_rule__CallingConv__Group_14__411501);
            rule__CallingConv__Group_14__4__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__CallingConv__Group_14__4"


    // $ANTLR start "rule__CallingConv__Group_14__4__Impl"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5575:1: rule__CallingConv__Group_14__4__Impl : ( RULE_INT ) ;
    public final void rule__CallingConv__Group_14__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5579:1: ( ( RULE_INT ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5580:1: ( RULE_INT )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5580:1: ( RULE_INT )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5581:1: RULE_INT
            {
             before(grammarAccess.getCallingConvAccess().getINTTerminalRuleCall_14_4()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__CallingConv__Group_14__4__Impl11528); 
             after(grammarAccess.getCallingConvAccess().getINTTerminalRuleCall_14_4()); 

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
    // $ANTLR end "rule__CallingConv__Group_14__4__Impl"


    // $ANTLR start "rule__FUNCTION_ATTRIBUTES__Group_1__0"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5602:1: rule__FUNCTION_ATTRIBUTES__Group_1__0 : rule__FUNCTION_ATTRIBUTES__Group_1__0__Impl rule__FUNCTION_ATTRIBUTES__Group_1__1 ;
    public final void rule__FUNCTION_ATTRIBUTES__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5606:1: ( rule__FUNCTION_ATTRIBUTES__Group_1__0__Impl rule__FUNCTION_ATTRIBUTES__Group_1__1 )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5607:2: rule__FUNCTION_ATTRIBUTES__Group_1__0__Impl rule__FUNCTION_ATTRIBUTES__Group_1__1
            {
            pushFollow(FOLLOW_rule__FUNCTION_ATTRIBUTES__Group_1__0__Impl_in_rule__FUNCTION_ATTRIBUTES__Group_1__011567);
            rule__FUNCTION_ATTRIBUTES__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FUNCTION_ATTRIBUTES__Group_1__1_in_rule__FUNCTION_ATTRIBUTES__Group_1__011570);
            rule__FUNCTION_ATTRIBUTES__Group_1__1();

            state._fsp--;


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
    // $ANTLR end "rule__FUNCTION_ATTRIBUTES__Group_1__0"


    // $ANTLR start "rule__FUNCTION_ATTRIBUTES__Group_1__0__Impl"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5614:1: rule__FUNCTION_ATTRIBUTES__Group_1__0__Impl : ( 'alignstack' ) ;
    public final void rule__FUNCTION_ATTRIBUTES__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5618:1: ( ( 'alignstack' ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5619:1: ( 'alignstack' )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5619:1: ( 'alignstack' )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5620:1: 'alignstack'
            {
             before(grammarAccess.getFUNCTION_ATTRIBUTESAccess().getAlignstackKeyword_1_0()); 
            match(input,119,FOLLOW_119_in_rule__FUNCTION_ATTRIBUTES__Group_1__0__Impl11598); 
             after(grammarAccess.getFUNCTION_ATTRIBUTESAccess().getAlignstackKeyword_1_0()); 

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
    // $ANTLR end "rule__FUNCTION_ATTRIBUTES__Group_1__0__Impl"


    // $ANTLR start "rule__FUNCTION_ATTRIBUTES__Group_1__1"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5633:1: rule__FUNCTION_ATTRIBUTES__Group_1__1 : rule__FUNCTION_ATTRIBUTES__Group_1__1__Impl rule__FUNCTION_ATTRIBUTES__Group_1__2 ;
    public final void rule__FUNCTION_ATTRIBUTES__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5637:1: ( rule__FUNCTION_ATTRIBUTES__Group_1__1__Impl rule__FUNCTION_ATTRIBUTES__Group_1__2 )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5638:2: rule__FUNCTION_ATTRIBUTES__Group_1__1__Impl rule__FUNCTION_ATTRIBUTES__Group_1__2
            {
            pushFollow(FOLLOW_rule__FUNCTION_ATTRIBUTES__Group_1__1__Impl_in_rule__FUNCTION_ATTRIBUTES__Group_1__111629);
            rule__FUNCTION_ATTRIBUTES__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FUNCTION_ATTRIBUTES__Group_1__2_in_rule__FUNCTION_ATTRIBUTES__Group_1__111632);
            rule__FUNCTION_ATTRIBUTES__Group_1__2();

            state._fsp--;


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
    // $ANTLR end "rule__FUNCTION_ATTRIBUTES__Group_1__1"


    // $ANTLR start "rule__FUNCTION_ATTRIBUTES__Group_1__1__Impl"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5645:1: rule__FUNCTION_ATTRIBUTES__Group_1__1__Impl : ( '(' ) ;
    public final void rule__FUNCTION_ATTRIBUTES__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5649:1: ( ( '(' ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5650:1: ( '(' )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5650:1: ( '(' )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5651:1: '('
            {
             before(grammarAccess.getFUNCTION_ATTRIBUTESAccess().getLeftParenthesisKeyword_1_1()); 
            match(input,116,FOLLOW_116_in_rule__FUNCTION_ATTRIBUTES__Group_1__1__Impl11660); 
             after(grammarAccess.getFUNCTION_ATTRIBUTESAccess().getLeftParenthesisKeyword_1_1()); 

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
    // $ANTLR end "rule__FUNCTION_ATTRIBUTES__Group_1__1__Impl"


    // $ANTLR start "rule__FUNCTION_ATTRIBUTES__Group_1__2"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5664:1: rule__FUNCTION_ATTRIBUTES__Group_1__2 : rule__FUNCTION_ATTRIBUTES__Group_1__2__Impl rule__FUNCTION_ATTRIBUTES__Group_1__3 ;
    public final void rule__FUNCTION_ATTRIBUTES__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5668:1: ( rule__FUNCTION_ATTRIBUTES__Group_1__2__Impl rule__FUNCTION_ATTRIBUTES__Group_1__3 )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5669:2: rule__FUNCTION_ATTRIBUTES__Group_1__2__Impl rule__FUNCTION_ATTRIBUTES__Group_1__3
            {
            pushFollow(FOLLOW_rule__FUNCTION_ATTRIBUTES__Group_1__2__Impl_in_rule__FUNCTION_ATTRIBUTES__Group_1__211691);
            rule__FUNCTION_ATTRIBUTES__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FUNCTION_ATTRIBUTES__Group_1__3_in_rule__FUNCTION_ATTRIBUTES__Group_1__211694);
            rule__FUNCTION_ATTRIBUTES__Group_1__3();

            state._fsp--;


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
    // $ANTLR end "rule__FUNCTION_ATTRIBUTES__Group_1__2"


    // $ANTLR start "rule__FUNCTION_ATTRIBUTES__Group_1__2__Impl"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5676:1: rule__FUNCTION_ATTRIBUTES__Group_1__2__Impl : ( '<' ) ;
    public final void rule__FUNCTION_ATTRIBUTES__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5680:1: ( ( '<' ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5681:1: ( '<' )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5681:1: ( '<' )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5682:1: '<'
            {
             before(grammarAccess.getFUNCTION_ATTRIBUTESAccess().getLessThanSignKeyword_1_2()); 
            match(input,111,FOLLOW_111_in_rule__FUNCTION_ATTRIBUTES__Group_1__2__Impl11722); 
             after(grammarAccess.getFUNCTION_ATTRIBUTESAccess().getLessThanSignKeyword_1_2()); 

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
    // $ANTLR end "rule__FUNCTION_ATTRIBUTES__Group_1__2__Impl"


    // $ANTLR start "rule__FUNCTION_ATTRIBUTES__Group_1__3"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5695:1: rule__FUNCTION_ATTRIBUTES__Group_1__3 : rule__FUNCTION_ATTRIBUTES__Group_1__3__Impl rule__FUNCTION_ATTRIBUTES__Group_1__4 ;
    public final void rule__FUNCTION_ATTRIBUTES__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5699:1: ( rule__FUNCTION_ATTRIBUTES__Group_1__3__Impl rule__FUNCTION_ATTRIBUTES__Group_1__4 )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5700:2: rule__FUNCTION_ATTRIBUTES__Group_1__3__Impl rule__FUNCTION_ATTRIBUTES__Group_1__4
            {
            pushFollow(FOLLOW_rule__FUNCTION_ATTRIBUTES__Group_1__3__Impl_in_rule__FUNCTION_ATTRIBUTES__Group_1__311753);
            rule__FUNCTION_ATTRIBUTES__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FUNCTION_ATTRIBUTES__Group_1__4_in_rule__FUNCTION_ATTRIBUTES__Group_1__311756);
            rule__FUNCTION_ATTRIBUTES__Group_1__4();

            state._fsp--;


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
    // $ANTLR end "rule__FUNCTION_ATTRIBUTES__Group_1__3"


    // $ANTLR start "rule__FUNCTION_ATTRIBUTES__Group_1__3__Impl"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5707:1: rule__FUNCTION_ATTRIBUTES__Group_1__3__Impl : ( RULE_INT ) ;
    public final void rule__FUNCTION_ATTRIBUTES__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5711:1: ( ( RULE_INT ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5712:1: ( RULE_INT )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5712:1: ( RULE_INT )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5713:1: RULE_INT
            {
             before(grammarAccess.getFUNCTION_ATTRIBUTESAccess().getINTTerminalRuleCall_1_3()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__FUNCTION_ATTRIBUTES__Group_1__3__Impl11783); 
             after(grammarAccess.getFUNCTION_ATTRIBUTESAccess().getINTTerminalRuleCall_1_3()); 

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
    // $ANTLR end "rule__FUNCTION_ATTRIBUTES__Group_1__3__Impl"


    // $ANTLR start "rule__FUNCTION_ATTRIBUTES__Group_1__4"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5724:1: rule__FUNCTION_ATTRIBUTES__Group_1__4 : rule__FUNCTION_ATTRIBUTES__Group_1__4__Impl rule__FUNCTION_ATTRIBUTES__Group_1__5 ;
    public final void rule__FUNCTION_ATTRIBUTES__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5728:1: ( rule__FUNCTION_ATTRIBUTES__Group_1__4__Impl rule__FUNCTION_ATTRIBUTES__Group_1__5 )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5729:2: rule__FUNCTION_ATTRIBUTES__Group_1__4__Impl rule__FUNCTION_ATTRIBUTES__Group_1__5
            {
            pushFollow(FOLLOW_rule__FUNCTION_ATTRIBUTES__Group_1__4__Impl_in_rule__FUNCTION_ATTRIBUTES__Group_1__411812);
            rule__FUNCTION_ATTRIBUTES__Group_1__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FUNCTION_ATTRIBUTES__Group_1__5_in_rule__FUNCTION_ATTRIBUTES__Group_1__411815);
            rule__FUNCTION_ATTRIBUTES__Group_1__5();

            state._fsp--;


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
    // $ANTLR end "rule__FUNCTION_ATTRIBUTES__Group_1__4"


    // $ANTLR start "rule__FUNCTION_ATTRIBUTES__Group_1__4__Impl"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5736:1: rule__FUNCTION_ATTRIBUTES__Group_1__4__Impl : ( '>' ) ;
    public final void rule__FUNCTION_ATTRIBUTES__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5740:1: ( ( '>' ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5741:1: ( '>' )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5741:1: ( '>' )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5742:1: '>'
            {
             before(grammarAccess.getFUNCTION_ATTRIBUTESAccess().getGreaterThanSignKeyword_1_4()); 
            match(input,113,FOLLOW_113_in_rule__FUNCTION_ATTRIBUTES__Group_1__4__Impl11843); 
             after(grammarAccess.getFUNCTION_ATTRIBUTESAccess().getGreaterThanSignKeyword_1_4()); 

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
    // $ANTLR end "rule__FUNCTION_ATTRIBUTES__Group_1__4__Impl"


    // $ANTLR start "rule__FUNCTION_ATTRIBUTES__Group_1__5"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5755:1: rule__FUNCTION_ATTRIBUTES__Group_1__5 : rule__FUNCTION_ATTRIBUTES__Group_1__5__Impl ;
    public final void rule__FUNCTION_ATTRIBUTES__Group_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5759:1: ( rule__FUNCTION_ATTRIBUTES__Group_1__5__Impl )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5760:2: rule__FUNCTION_ATTRIBUTES__Group_1__5__Impl
            {
            pushFollow(FOLLOW_rule__FUNCTION_ATTRIBUTES__Group_1__5__Impl_in_rule__FUNCTION_ATTRIBUTES__Group_1__511874);
            rule__FUNCTION_ATTRIBUTES__Group_1__5__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__FUNCTION_ATTRIBUTES__Group_1__5"


    // $ANTLR start "rule__FUNCTION_ATTRIBUTES__Group_1__5__Impl"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5766:1: rule__FUNCTION_ATTRIBUTES__Group_1__5__Impl : ( ')' ) ;
    public final void rule__FUNCTION_ATTRIBUTES__Group_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5770:1: ( ( ')' ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5771:1: ( ')' )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5771:1: ( ')' )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5772:1: ')'
            {
             before(grammarAccess.getFUNCTION_ATTRIBUTESAccess().getRightParenthesisKeyword_1_5()); 
            match(input,37,FOLLOW_37_in_rule__FUNCTION_ATTRIBUTES__Group_1__5__Impl11902); 
             after(grammarAccess.getFUNCTION_ATTRIBUTESAccess().getRightParenthesisKeyword_1_5()); 

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
    // $ANTLR end "rule__FUNCTION_ATTRIBUTES__Group_1__5__Impl"


    // $ANTLR start "rule__ALIGNMENT__Group__0"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5797:1: rule__ALIGNMENT__Group__0 : rule__ALIGNMENT__Group__0__Impl rule__ALIGNMENT__Group__1 ;
    public final void rule__ALIGNMENT__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5801:1: ( rule__ALIGNMENT__Group__0__Impl rule__ALIGNMENT__Group__1 )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5802:2: rule__ALIGNMENT__Group__0__Impl rule__ALIGNMENT__Group__1
            {
            pushFollow(FOLLOW_rule__ALIGNMENT__Group__0__Impl_in_rule__ALIGNMENT__Group__011945);
            rule__ALIGNMENT__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ALIGNMENT__Group__1_in_rule__ALIGNMENT__Group__011948);
            rule__ALIGNMENT__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__ALIGNMENT__Group__0"


    // $ANTLR start "rule__ALIGNMENT__Group__0__Impl"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5809:1: rule__ALIGNMENT__Group__0__Impl : ( 'align' ) ;
    public final void rule__ALIGNMENT__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5813:1: ( ( 'align' ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5814:1: ( 'align' )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5814:1: ( 'align' )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5815:1: 'align'
            {
             before(grammarAccess.getALIGNMENTAccess().getAlignKeyword_0()); 
            match(input,120,FOLLOW_120_in_rule__ALIGNMENT__Group__0__Impl11976); 
             after(grammarAccess.getALIGNMENTAccess().getAlignKeyword_0()); 

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
    // $ANTLR end "rule__ALIGNMENT__Group__0__Impl"


    // $ANTLR start "rule__ALIGNMENT__Group__1"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5828:1: rule__ALIGNMENT__Group__1 : rule__ALIGNMENT__Group__1__Impl ;
    public final void rule__ALIGNMENT__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5832:1: ( rule__ALIGNMENT__Group__1__Impl )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5833:2: rule__ALIGNMENT__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ALIGNMENT__Group__1__Impl_in_rule__ALIGNMENT__Group__112007);
            rule__ALIGNMENT__Group__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__ALIGNMENT__Group__1"


    // $ANTLR start "rule__ALIGNMENT__Group__1__Impl"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5839:1: rule__ALIGNMENT__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__ALIGNMENT__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5843:1: ( ( RULE_INT ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5844:1: ( RULE_INT )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5844:1: ( RULE_INT )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5845:1: RULE_INT
            {
             before(grammarAccess.getALIGNMENTAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__ALIGNMENT__Group__1__Impl12034); 
             after(grammarAccess.getALIGNMENTAccess().getINTTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__ALIGNMENT__Group__1__Impl"


    // $ANTLR start "rule__LLVM__ElementsAssignment"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5861:1: rule__LLVM__ElementsAssignment : ( ruleAbstractElement ) ;
    public final void rule__LLVM__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5865:1: ( ( ruleAbstractElement ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5866:1: ( ruleAbstractElement )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5866:1: ( ruleAbstractElement )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5867:1: ruleAbstractElement
            {
             before(grammarAccess.getLLVMAccess().getElementsAbstractElementParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleAbstractElement_in_rule__LLVM__ElementsAssignment12072);
            ruleAbstractElement();

            state._fsp--;

             after(grammarAccess.getLLVMAccess().getElementsAbstractElementParserRuleCall_0()); 

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
    // $ANTLR end "rule__LLVM__ElementsAssignment"


    // $ANTLR start "rule__TopLevelEntity__ModuleAssignment_0_2"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5876:1: rule__TopLevelEntity__ModuleAssignment_0_2 : ( RULE_STRING ) ;
    public final void rule__TopLevelEntity__ModuleAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5880:1: ( ( RULE_STRING ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5881:1: ( RULE_STRING )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5881:1: ( RULE_STRING )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5882:1: RULE_STRING
            {
             before(grammarAccess.getTopLevelEntityAccess().getModuleSTRINGTerminalRuleCall_0_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__TopLevelEntity__ModuleAssignment_0_212103); 
             after(grammarAccess.getTopLevelEntityAccess().getModuleSTRINGTerminalRuleCall_0_2_0()); 

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
    // $ANTLR end "rule__TopLevelEntity__ModuleAssignment_0_2"


    // $ANTLR start "rule__TopLevelEntity__TargetAssignment_1_3"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5891:1: rule__TopLevelEntity__TargetAssignment_1_3 : ( RULE_STRING ) ;
    public final void rule__TopLevelEntity__TargetAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5895:1: ( ( RULE_STRING ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5896:1: ( RULE_STRING )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5896:1: ( RULE_STRING )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5897:1: RULE_STRING
            {
             before(grammarAccess.getTopLevelEntityAccess().getTargetSTRINGTerminalRuleCall_1_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__TopLevelEntity__TargetAssignment_1_312134); 
             after(grammarAccess.getTopLevelEntityAccess().getTargetSTRINGTerminalRuleCall_1_3_0()); 

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
    // $ANTLR end "rule__TopLevelEntity__TargetAssignment_1_3"


    // $ANTLR start "rule__TopLevelEntity__LibsAssignment_2_3"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5906:1: rule__TopLevelEntity__LibsAssignment_2_3 : ( RULE_STRING ) ;
    public final void rule__TopLevelEntity__LibsAssignment_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5910:1: ( ( RULE_STRING ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5911:1: ( RULE_STRING )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5911:1: ( RULE_STRING )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5912:1: RULE_STRING
            {
             before(grammarAccess.getTopLevelEntityAccess().getLibsSTRINGTerminalRuleCall_2_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__TopLevelEntity__LibsAssignment_2_312165); 
             after(grammarAccess.getTopLevelEntityAccess().getLibsSTRINGTerminalRuleCall_2_3_0()); 

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
    // $ANTLR end "rule__TopLevelEntity__LibsAssignment_2_3"


    // $ANTLR start "rule__TopLevelEntity__LibsAssignment_2_4_1"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5921:1: rule__TopLevelEntity__LibsAssignment_2_4_1 : ( RULE_STRING ) ;
    public final void rule__TopLevelEntity__LibsAssignment_2_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5925:1: ( ( RULE_STRING ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5926:1: ( RULE_STRING )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5926:1: ( RULE_STRING )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5927:1: RULE_STRING
            {
             before(grammarAccess.getTopLevelEntityAccess().getLibsSTRINGTerminalRuleCall_2_4_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__TopLevelEntity__LibsAssignment_2_4_112196); 
             after(grammarAccess.getTopLevelEntityAccess().getLibsSTRINGTerminalRuleCall_2_4_1_0()); 

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
    // $ANTLR end "rule__TopLevelEntity__LibsAssignment_2_4_1"


    // $ANTLR start "rule__TypeDefinition__AddressAssignment_0"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5936:1: rule__TypeDefinition__AddressAssignment_0 : ( ruleAddress ) ;
    public final void rule__TypeDefinition__AddressAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5940:1: ( ( ruleAddress ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5941:1: ( ruleAddress )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5941:1: ( ruleAddress )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5942:1: ruleAddress
            {
             before(grammarAccess.getTypeDefinitionAccess().getAddressAddressParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleAddress_in_rule__TypeDefinition__AddressAssignment_012227);
            ruleAddress();

            state._fsp--;

             after(grammarAccess.getTypeDefinitionAccess().getAddressAddressParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__TypeDefinition__AddressAssignment_0"


    // $ANTLR start "rule__TypeDefinition__StructAssignment_3_1_0"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5951:1: rule__TypeDefinition__StructAssignment_3_1_0 : ( ruleStructure ) ;
    public final void rule__TypeDefinition__StructAssignment_3_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5955:1: ( ( ruleStructure ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5956:1: ( ruleStructure )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5956:1: ( ruleStructure )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5957:1: ruleStructure
            {
             before(grammarAccess.getTypeDefinitionAccess().getStructStructureParserRuleCall_3_1_0_0()); 
            pushFollow(FOLLOW_ruleStructure_in_rule__TypeDefinition__StructAssignment_3_1_012258);
            ruleStructure();

            state._fsp--;

             after(grammarAccess.getTypeDefinitionAccess().getStructStructureParserRuleCall_3_1_0_0()); 

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
    // $ANTLR end "rule__TypeDefinition__StructAssignment_3_1_0"


    // $ANTLR start "rule__FunctionDefinition__ReturnTypeAssignment_0_5"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5966:1: rule__FunctionDefinition__ReturnTypeAssignment_0_5 : ( ruleTypeUse ) ;
    public final void rule__FunctionDefinition__ReturnTypeAssignment_0_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5970:1: ( ( ruleTypeUse ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5971:1: ( ruleTypeUse )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5971:1: ( ruleTypeUse )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5972:1: ruleTypeUse
            {
             before(grammarAccess.getFunctionDefinitionAccess().getReturnTypeTypeUseParserRuleCall_0_5_0()); 
            pushFollow(FOLLOW_ruleTypeUse_in_rule__FunctionDefinition__ReturnTypeAssignment_0_512289);
            ruleTypeUse();

            state._fsp--;

             after(grammarAccess.getFunctionDefinitionAccess().getReturnTypeTypeUseParserRuleCall_0_5_0()); 

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
    // $ANTLR end "rule__FunctionDefinition__ReturnTypeAssignment_0_5"


    // $ANTLR start "rule__FunctionDefinition__AddressAssignment_0_6"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5981:1: rule__FunctionDefinition__AddressAssignment_0_6 : ( ruleAddress ) ;
    public final void rule__FunctionDefinition__AddressAssignment_0_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5985:1: ( ( ruleAddress ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5986:1: ( ruleAddress )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5986:1: ( ruleAddress )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5987:1: ruleAddress
            {
             before(grammarAccess.getFunctionDefinitionAccess().getAddressAddressParserRuleCall_0_6_0()); 
            pushFollow(FOLLOW_ruleAddress_in_rule__FunctionDefinition__AddressAssignment_0_612320);
            ruleAddress();

            state._fsp--;

             after(grammarAccess.getFunctionDefinitionAccess().getAddressAddressParserRuleCall_0_6_0()); 

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
    // $ANTLR end "rule__FunctionDefinition__AddressAssignment_0_6"


    // $ANTLR start "rule__FunctionDefinition__PlAssignment_0_7"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:5996:1: rule__FunctionDefinition__PlAssignment_0_7 : ( ruleParameterList ) ;
    public final void rule__FunctionDefinition__PlAssignment_0_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:6000:1: ( ( ruleParameterList ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:6001:1: ( ruleParameterList )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:6001:1: ( ruleParameterList )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:6002:1: ruleParameterList
            {
             before(grammarAccess.getFunctionDefinitionAccess().getPlParameterListParserRuleCall_0_7_0()); 
            pushFollow(FOLLOW_ruleParameterList_in_rule__FunctionDefinition__PlAssignment_0_712351);
            ruleParameterList();

            state._fsp--;

             after(grammarAccess.getFunctionDefinitionAccess().getPlParameterListParserRuleCall_0_7_0()); 

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
    // $ANTLR end "rule__FunctionDefinition__PlAssignment_0_7"


    // $ANTLR start "rule__FunctionDefinition__BodyAssignment_0_12"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:6011:1: rule__FunctionDefinition__BodyAssignment_0_12 : ( ruleFunctionBody ) ;
    public final void rule__FunctionDefinition__BodyAssignment_0_12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:6015:1: ( ( ruleFunctionBody ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:6016:1: ( ruleFunctionBody )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:6016:1: ( ruleFunctionBody )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:6017:1: ruleFunctionBody
            {
             before(grammarAccess.getFunctionDefinitionAccess().getBodyFunctionBodyParserRuleCall_0_12_0()); 
            pushFollow(FOLLOW_ruleFunctionBody_in_rule__FunctionDefinition__BodyAssignment_0_1212382);
            ruleFunctionBody();

            state._fsp--;

             after(grammarAccess.getFunctionDefinitionAccess().getBodyFunctionBodyParserRuleCall_0_12_0()); 

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
    // $ANTLR end "rule__FunctionDefinition__BodyAssignment_0_12"


    // $ANTLR start "rule__FunctionDefinition__ReturnTypeAssignment_1_5"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:6026:1: rule__FunctionDefinition__ReturnTypeAssignment_1_5 : ( ruleTypeUse ) ;
    public final void rule__FunctionDefinition__ReturnTypeAssignment_1_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:6030:1: ( ( ruleTypeUse ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:6031:1: ( ruleTypeUse )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:6031:1: ( ruleTypeUse )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:6032:1: ruleTypeUse
            {
             before(grammarAccess.getFunctionDefinitionAccess().getReturnTypeTypeUseParserRuleCall_1_5_0()); 
            pushFollow(FOLLOW_ruleTypeUse_in_rule__FunctionDefinition__ReturnTypeAssignment_1_512413);
            ruleTypeUse();

            state._fsp--;

             after(grammarAccess.getFunctionDefinitionAccess().getReturnTypeTypeUseParserRuleCall_1_5_0()); 

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
    // $ANTLR end "rule__FunctionDefinition__ReturnTypeAssignment_1_5"


    // $ANTLR start "rule__FunctionDefinition__AddressAssignment_1_6"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:6041:1: rule__FunctionDefinition__AddressAssignment_1_6 : ( ruleAddress ) ;
    public final void rule__FunctionDefinition__AddressAssignment_1_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:6045:1: ( ( ruleAddress ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:6046:1: ( ruleAddress )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:6046:1: ( ruleAddress )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:6047:1: ruleAddress
            {
             before(grammarAccess.getFunctionDefinitionAccess().getAddressAddressParserRuleCall_1_6_0()); 
            pushFollow(FOLLOW_ruleAddress_in_rule__FunctionDefinition__AddressAssignment_1_612444);
            ruleAddress();

            state._fsp--;

             after(grammarAccess.getFunctionDefinitionAccess().getAddressAddressParserRuleCall_1_6_0()); 

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
    // $ANTLR end "rule__FunctionDefinition__AddressAssignment_1_6"


    // $ANTLR start "rule__FunctionDefinition__TListAssignment_1_7_0"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:6056:1: rule__FunctionDefinition__TListAssignment_1_7_0 : ( ruleTypeList ) ;
    public final void rule__FunctionDefinition__TListAssignment_1_7_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:6060:1: ( ( ruleTypeList ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:6061:1: ( ruleTypeList )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:6061:1: ( ruleTypeList )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:6062:1: ruleTypeList
            {
             before(grammarAccess.getFunctionDefinitionAccess().getTListTypeListParserRuleCall_1_7_0_0()); 
            pushFollow(FOLLOW_ruleTypeList_in_rule__FunctionDefinition__TListAssignment_1_7_012475);
            ruleTypeList();

            state._fsp--;

             after(grammarAccess.getFunctionDefinitionAccess().getTListTypeListParserRuleCall_1_7_0_0()); 

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
    // $ANTLR end "rule__FunctionDefinition__TListAssignment_1_7_0"


    // $ANTLR start "rule__AddressUse__AddressAssignment_0"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:6075:1: rule__AddressUse__AddressAssignment_0 : ( ( RULE_VALID_ID ) ) ;
    public final void rule__AddressUse__AddressAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:6079:1: ( ( ( RULE_VALID_ID ) ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:6080:1: ( ( RULE_VALID_ID ) )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:6080:1: ( ( RULE_VALID_ID ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:6081:1: ( RULE_VALID_ID )
            {
             before(grammarAccess.getAddressUseAccess().getAddressAddressCrossReference_0_0()); 
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:6082:1: ( RULE_VALID_ID )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:6083:1: RULE_VALID_ID
            {
             before(grammarAccess.getAddressUseAccess().getAddressAddressVALID_IDTerminalRuleCall_0_0_1()); 
            match(input,RULE_VALID_ID,FOLLOW_RULE_VALID_ID_in_rule__AddressUse__AddressAssignment_012514); 
             after(grammarAccess.getAddressUseAccess().getAddressAddressVALID_IDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getAddressUseAccess().getAddressAddressCrossReference_0_0()); 

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
    // $ANTLR end "rule__AddressUse__AddressAssignment_0"


    // $ANTLR start "rule__AddressUse__PointerAssignment_1"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:6094:1: rule__AddressUse__PointerAssignment_1 : ( RULE_POINTER ) ;
    public final void rule__AddressUse__PointerAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:6098:1: ( ( RULE_POINTER ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:6099:1: ( RULE_POINTER )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:6099:1: ( RULE_POINTER )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:6100:1: RULE_POINTER
            {
             before(grammarAccess.getAddressUseAccess().getPointerPOINTERTerminalRuleCall_1_0()); 
            match(input,RULE_POINTER,FOLLOW_RULE_POINTER_in_rule__AddressUse__PointerAssignment_112549); 
             after(grammarAccess.getAddressUseAccess().getPointerPOINTERTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__AddressUse__PointerAssignment_1"


    // $ANTLR start "rule__Address__NameAssignment"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:6109:1: rule__Address__NameAssignment : ( RULE_VALID_ID ) ;
    public final void rule__Address__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:6113:1: ( ( RULE_VALID_ID ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:6114:1: ( RULE_VALID_ID )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:6114:1: ( RULE_VALID_ID )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:6115:1: RULE_VALID_ID
            {
             before(grammarAccess.getAddressAccess().getNameVALID_IDTerminalRuleCall_0()); 
            match(input,RULE_VALID_ID,FOLLOW_RULE_VALID_ID_in_rule__Address__NameAssignment12580); 
             after(grammarAccess.getAddressAccess().getNameVALID_IDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__Address__NameAssignment"


    // $ANTLR start "rule__Predefined__TypeAssignment_0"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:6124:1: rule__Predefined__TypeAssignment_0 : ( rulePredefined_Types ) ;
    public final void rule__Predefined__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:6128:1: ( ( rulePredefined_Types ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:6129:1: ( rulePredefined_Types )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:6129:1: ( rulePredefined_Types )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:6130:1: rulePredefined_Types
            {
             before(grammarAccess.getPredefinedAccess().getTypePredefined_TypesParserRuleCall_0_0()); 
            pushFollow(FOLLOW_rulePredefined_Types_in_rule__Predefined__TypeAssignment_012611);
            rulePredefined_Types();

            state._fsp--;

             after(grammarAccess.getPredefinedAccess().getTypePredefined_TypesParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Predefined__TypeAssignment_0"


    // $ANTLR start "rule__Predefined__PointerAssignment_1"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:6139:1: rule__Predefined__PointerAssignment_1 : ( RULE_POINTER ) ;
    public final void rule__Predefined__PointerAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:6143:1: ( ( RULE_POINTER ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:6144:1: ( RULE_POINTER )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:6144:1: ( RULE_POINTER )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:6145:1: RULE_POINTER
            {
             before(grammarAccess.getPredefinedAccess().getPointerPOINTERTerminalRuleCall_1_0()); 
            match(input,RULE_POINTER,FOLLOW_RULE_POINTER_in_rule__Predefined__PointerAssignment_112642); 
             after(grammarAccess.getPredefinedAccess().getPointerPOINTERTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Predefined__PointerAssignment_1"


    // $ANTLR start "rule__Constant__ValueAssignment"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:6154:1: rule__Constant__ValueAssignment : ( RULE_INT ) ;
    public final void rule__Constant__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:6158:1: ( ( RULE_INT ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:6159:1: ( RULE_INT )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:6159:1: ( RULE_INT )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:6160:1: RULE_INT
            {
             before(grammarAccess.getConstantAccess().getValueINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Constant__ValueAssignment12673); 
             after(grammarAccess.getConstantAccess().getValueINTTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__Constant__ValueAssignment"


    // $ANTLR start "rule__NonConstantValue__NameAssignment_0"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:6169:1: rule__NonConstantValue__NameAssignment_0 : ( RULE_VALID_ID ) ;
    public final void rule__NonConstantValue__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:6173:1: ( ( RULE_VALID_ID ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:6174:1: ( RULE_VALID_ID )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:6174:1: ( RULE_VALID_ID )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:6175:1: RULE_VALID_ID
            {
             before(grammarAccess.getNonConstantValueAccess().getNameVALID_IDTerminalRuleCall_0_0()); 
            match(input,RULE_VALID_ID,FOLLOW_RULE_VALID_ID_in_rule__NonConstantValue__NameAssignment_012704); 
             after(grammarAccess.getNonConstantValueAccess().getNameVALID_IDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__NonConstantValue__NameAssignment_0"


    // $ANTLR start "rule__NonConstantValue__PointerAssignment_1"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:6184:1: rule__NonConstantValue__PointerAssignment_1 : ( RULE_POINTER ) ;
    public final void rule__NonConstantValue__PointerAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:6188:1: ( ( RULE_POINTER ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:6189:1: ( RULE_POINTER )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:6189:1: ( RULE_POINTER )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:6190:1: RULE_POINTER
            {
             before(grammarAccess.getNonConstantValueAccess().getPointerPOINTERTerminalRuleCall_1_0()); 
            match(input,RULE_POINTER,FOLLOW_RULE_POINTER_in_rule__NonConstantValue__PointerAssignment_112735); 
             after(grammarAccess.getNonConstantValueAccess().getPointerPOINTERTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__NonConstantValue__PointerAssignment_1"


    // $ANTLR start "rule__Structure__TypesAssignment_2_0"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:6199:1: rule__Structure__TypesAssignment_2_0 : ( ruleTypeUse ) ;
    public final void rule__Structure__TypesAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:6203:1: ( ( ruleTypeUse ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:6204:1: ( ruleTypeUse )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:6204:1: ( ruleTypeUse )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:6205:1: ruleTypeUse
            {
             before(grammarAccess.getStructureAccess().getTypesTypeUseParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_ruleTypeUse_in_rule__Structure__TypesAssignment_2_012766);
            ruleTypeUse();

            state._fsp--;

             after(grammarAccess.getStructureAccess().getTypesTypeUseParserRuleCall_2_0_0()); 

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
    // $ANTLR end "rule__Structure__TypesAssignment_2_0"


    // $ANTLR start "rule__Structure__TypesAssignment_2_1_1"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:6214:1: rule__Structure__TypesAssignment_2_1_1 : ( ruleTypeUse ) ;
    public final void rule__Structure__TypesAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:6218:1: ( ( ruleTypeUse ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:6219:1: ( ruleTypeUse )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:6219:1: ( ruleTypeUse )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:6220:1: ruleTypeUse
            {
             before(grammarAccess.getStructureAccess().getTypesTypeUseParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_ruleTypeUse_in_rule__Structure__TypesAssignment_2_1_112797);
            ruleTypeUse();

            state._fsp--;

             after(grammarAccess.getStructureAccess().getTypesTypeUseParserRuleCall_2_1_1_0()); 

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
    // $ANTLR end "rule__Structure__TypesAssignment_2_1_1"


    // $ANTLR start "rule__ParameterList__TypesAssignment_2_0"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:6229:1: rule__ParameterList__TypesAssignment_2_0 : ( ruleTypeUse ) ;
    public final void rule__ParameterList__TypesAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:6233:1: ( ( ruleTypeUse ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:6234:1: ( ruleTypeUse )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:6234:1: ( ruleTypeUse )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:6235:1: ruleTypeUse
            {
             before(grammarAccess.getParameterListAccess().getTypesTypeUseParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_ruleTypeUse_in_rule__ParameterList__TypesAssignment_2_012828);
            ruleTypeUse();

            state._fsp--;

             after(grammarAccess.getParameterListAccess().getTypesTypeUseParserRuleCall_2_0_0()); 

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
    // $ANTLR end "rule__ParameterList__TypesAssignment_2_0"


    // $ANTLR start "rule__ParameterList__ListsAssignment_2_1"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:6244:1: rule__ParameterList__ListsAssignment_2_1 : ( ruleTypeList ) ;
    public final void rule__ParameterList__ListsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:6248:1: ( ( ruleTypeList ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:6249:1: ( ruleTypeList )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:6249:1: ( ruleTypeList )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:6250:1: ruleTypeList
            {
             before(grammarAccess.getParameterListAccess().getListsTypeListParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleTypeList_in_rule__ParameterList__ListsAssignment_2_112859);
            ruleTypeList();

            state._fsp--;

             after(grammarAccess.getParameterListAccess().getListsTypeListParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__ParameterList__ListsAssignment_2_1"


    // $ANTLR start "rule__ParameterList__VariablesAssignment_2_3"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:6259:1: rule__ParameterList__VariablesAssignment_2_3 : ( ruleValue ) ;
    public final void rule__ParameterList__VariablesAssignment_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:6263:1: ( ( ruleValue ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:6264:1: ( ruleValue )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:6264:1: ( ruleValue )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:6265:1: ruleValue
            {
             before(grammarAccess.getParameterListAccess().getVariablesValueParserRuleCall_2_3_0()); 
            pushFollow(FOLLOW_ruleValue_in_rule__ParameterList__VariablesAssignment_2_312890);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getParameterListAccess().getVariablesValueParserRuleCall_2_3_0()); 

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
    // $ANTLR end "rule__ParameterList__VariablesAssignment_2_3"


    // $ANTLR start "rule__ParameterList__TypesAssignment_2_4_1"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:6274:1: rule__ParameterList__TypesAssignment_2_4_1 : ( ruleTypeUse ) ;
    public final void rule__ParameterList__TypesAssignment_2_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:6278:1: ( ( ruleTypeUse ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:6279:1: ( ruleTypeUse )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:6279:1: ( ruleTypeUse )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:6280:1: ruleTypeUse
            {
             before(grammarAccess.getParameterListAccess().getTypesTypeUseParserRuleCall_2_4_1_0()); 
            pushFollow(FOLLOW_ruleTypeUse_in_rule__ParameterList__TypesAssignment_2_4_112921);
            ruleTypeUse();

            state._fsp--;

             after(grammarAccess.getParameterListAccess().getTypesTypeUseParserRuleCall_2_4_1_0()); 

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
    // $ANTLR end "rule__ParameterList__TypesAssignment_2_4_1"


    // $ANTLR start "rule__ParameterList__ListsAssignment_2_4_2"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:6289:1: rule__ParameterList__ListsAssignment_2_4_2 : ( ruleTypeList ) ;
    public final void rule__ParameterList__ListsAssignment_2_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:6293:1: ( ( ruleTypeList ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:6294:1: ( ruleTypeList )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:6294:1: ( ruleTypeList )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:6295:1: ruleTypeList
            {
             before(grammarAccess.getParameterListAccess().getListsTypeListParserRuleCall_2_4_2_0()); 
            pushFollow(FOLLOW_ruleTypeList_in_rule__ParameterList__ListsAssignment_2_4_212952);
            ruleTypeList();

            state._fsp--;

             after(grammarAccess.getParameterListAccess().getListsTypeListParserRuleCall_2_4_2_0()); 

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
    // $ANTLR end "rule__ParameterList__ListsAssignment_2_4_2"


    // $ANTLR start "rule__ParameterList__VariablesAssignment_2_4_4"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:6304:1: rule__ParameterList__VariablesAssignment_2_4_4 : ( ruleValue ) ;
    public final void rule__ParameterList__VariablesAssignment_2_4_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:6308:1: ( ( ruleValue ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:6309:1: ( ruleValue )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:6309:1: ( ruleValue )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:6310:1: ruleValue
            {
             before(grammarAccess.getParameterListAccess().getVariablesValueParserRuleCall_2_4_4_0()); 
            pushFollow(FOLLOW_ruleValue_in_rule__ParameterList__VariablesAssignment_2_4_412983);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getParameterListAccess().getVariablesValueParserRuleCall_2_4_4_0()); 

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
    // $ANTLR end "rule__ParameterList__VariablesAssignment_2_4_4"


    // $ANTLR start "rule__FunctionBody__BlocksAssignment_1"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:6319:1: rule__FunctionBody__BlocksAssignment_1 : ( ruleBasicBlock ) ;
    public final void rule__FunctionBody__BlocksAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:6323:1: ( ( ruleBasicBlock ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:6324:1: ( ruleBasicBlock )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:6324:1: ( ruleBasicBlock )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:6325:1: ruleBasicBlock
            {
             before(grammarAccess.getFunctionBodyAccess().getBlocksBasicBlockParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleBasicBlock_in_rule__FunctionBody__BlocksAssignment_113014);
            ruleBasicBlock();

            state._fsp--;

             after(grammarAccess.getFunctionBodyAccess().getBlocksBasicBlockParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__FunctionBody__BlocksAssignment_1"


    // $ANTLR start "rule__BasicBlock__LabelAssignment_0"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:6334:1: rule__BasicBlock__LabelAssignment_0 : ( RULE_ID ) ;
    public final void rule__BasicBlock__LabelAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:6338:1: ( ( RULE_ID ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:6339:1: ( RULE_ID )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:6339:1: ( RULE_ID )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:6340:1: RULE_ID
            {
             before(grammarAccess.getBasicBlockAccess().getLabelIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BasicBlock__LabelAssignment_013045); 
             after(grammarAccess.getBasicBlockAccess().getLabelIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__BasicBlock__LabelAssignment_0"


    // $ANTLR start "rule__TypeList__TypesAssignment_1_1_1_0"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:6349:1: rule__TypeList__TypesAssignment_1_1_1_0 : ( ruleTypeUse ) ;
    public final void rule__TypeList__TypesAssignment_1_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:6353:1: ( ( ruleTypeUse ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:6354:1: ( ruleTypeUse )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:6354:1: ( ruleTypeUse )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:6355:1: ruleTypeUse
            {
             before(grammarAccess.getTypeListAccess().getTypesTypeUseParserRuleCall_1_1_1_0_0()); 
            pushFollow(FOLLOW_ruleTypeUse_in_rule__TypeList__TypesAssignment_1_1_1_013076);
            ruleTypeUse();

            state._fsp--;

             after(grammarAccess.getTypeListAccess().getTypesTypeUseParserRuleCall_1_1_1_0_0()); 

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
    // $ANTLR end "rule__TypeList__TypesAssignment_1_1_1_0"


    // $ANTLR start "rule__TypeList__TypelistsAssignment_1_1_1_1"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:6364:1: rule__TypeList__TypelistsAssignment_1_1_1_1 : ( ruleTypeList ) ;
    public final void rule__TypeList__TypelistsAssignment_1_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:6368:1: ( ( ruleTypeList ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:6369:1: ( ruleTypeList )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:6369:1: ( ruleTypeList )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:6370:1: ruleTypeList
            {
             before(grammarAccess.getTypeListAccess().getTypelistsTypeListParserRuleCall_1_1_1_1_0()); 
            pushFollow(FOLLOW_ruleTypeList_in_rule__TypeList__TypelistsAssignment_1_1_1_113107);
            ruleTypeList();

            state._fsp--;

             after(grammarAccess.getTypeListAccess().getTypelistsTypeListParserRuleCall_1_1_1_1_0()); 

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
    // $ANTLR end "rule__TypeList__TypelistsAssignment_1_1_1_1"


    // $ANTLR start "rule__TypeList__TypesAssignment_1_1_1_3_1"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:6379:1: rule__TypeList__TypesAssignment_1_1_1_3_1 : ( ruleTypeUse ) ;
    public final void rule__TypeList__TypesAssignment_1_1_1_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:6383:1: ( ( ruleTypeUse ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:6384:1: ( ruleTypeUse )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:6384:1: ( ruleTypeUse )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:6385:1: ruleTypeUse
            {
             before(grammarAccess.getTypeListAccess().getTypesTypeUseParserRuleCall_1_1_1_3_1_0()); 
            pushFollow(FOLLOW_ruleTypeUse_in_rule__TypeList__TypesAssignment_1_1_1_3_113138);
            ruleTypeUse();

            state._fsp--;

             after(grammarAccess.getTypeListAccess().getTypesTypeUseParserRuleCall_1_1_1_3_1_0()); 

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
    // $ANTLR end "rule__TypeList__TypesAssignment_1_1_1_3_1"


    // $ANTLR start "rule__TypeList__TypelistsAssignment_1_1_1_3_2"
    // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:6394:1: rule__TypeList__TypelistsAssignment_1_1_1_3_2 : ( ruleTypeList ) ;
    public final void rule__TypeList__TypelistsAssignment_1_1_1_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:6398:1: ( ( ruleTypeList ) )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:6399:1: ( ruleTypeList )
            {
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:6399:1: ( ruleTypeList )
            // ../de.upb.llvm_parser.ui/src-gen/de/upb/llvm_parser/ui/contentassist/antlr/internal/InternalLLVM.g:6400:1: ruleTypeList
            {
             before(grammarAccess.getTypeListAccess().getTypelistsTypeListParserRuleCall_1_1_1_3_2_0()); 
            pushFollow(FOLLOW_ruleTypeList_in_rule__TypeList__TypelistsAssignment_1_1_1_3_213169);
            ruleTypeList();

            state._fsp--;

             after(grammarAccess.getTypeListAccess().getTypelistsTypeListParserRuleCall_1_1_1_3_2_0()); 

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
    // $ANTLR end "rule__TypeList__TypelistsAssignment_1_1_1_3_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleLLVM_in_entryRuleLLVM61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLLVM68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LLVM__ElementsAssignment_in_ruleLLVM94 = new BitSet(new long[]{0x0000000000001002L,0x000052A000000000L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_entryRuleAbstractElement122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractElement129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AbstractElement__Alternatives_in_ruleAbstractElement155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTopLevelEntity_in_entryRuleTopLevelEntity182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTopLevelEntity189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopLevelEntity__Alternatives_in_ruleTopLevelEntity215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMainLevelEntity_in_entryRuleMainLevelEntity242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMainLevelEntity249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MainLevelEntity__Alternatives_in_ruleMainLevelEntity275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDefinition_in_entryRuleTypeDefinition302 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeDefinition309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDefinition__Group__0_in_ruleTypeDefinition335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionDefinition_in_entryRuleFunctionDefinition362 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionDefinition369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Alternatives_in_ruleFunctionDefinition395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeUse_in_entryRuleTypeUse424 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeUse431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeUse__Alternatives_in_ruleTypeUse457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddressUse_in_entryRuleAddressUse484 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAddressUse491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddressUse__Group__0_in_ruleAddressUse517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddress_in_entryRuleAddress544 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAddress551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Address__NameAssignment_in_ruleAddress577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredefined_in_entryRulePredefined604 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePredefined611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Predefined__Group__0_in_rulePredefined637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitive_Type_in_entryRulePrimitive_Type664 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitive_Type671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primitive_Type__Alternatives_in_rulePrimitive_Type697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatingPoint_Type_in_entryRuleFloatingPoint_Type724 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFloatingPoint_Type731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FloatingPoint_Type__Alternatives_in_ruleFloatingPoint_Type757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredefined_Types_in_entryRulePredefined_Types784 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePredefined_Types791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Predefined_Types__Alternatives_in_rulePredefined_Types817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVector_in_entryRuleVector844 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVector851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vector__Group__0_in_ruleVector877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArray_in_entryRuleArray904 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArray911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Array__Group__0_in_ruleArray937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstant_in_entryRuleConstant968 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstant975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__ValueAssignment_in_ruleConstant1001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNonConstantValue_in_entryRuleNonConstantValue1028 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNonConstantValue1035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NonConstantValue__Group__0_in_ruleNonConstantValue1061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue1088 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue1095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Value__Alternatives_in_ruleValue1121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructure_in_entryRuleStructure1148 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStructure1155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Structure__Group__0_in_ruleStructure1181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpaque_in_entryRuleOpaque1208 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpaque1215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleOpaque1242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterList_in_entryRuleParameterList1270 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterList1277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterList__Group__0_in_ruleParameterList1303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionBody_in_entryRuleFunctionBody1330 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionBody1337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionBody__Group__0_in_ruleFunctionBody1363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicBlock_in_entryRuleBasicBlock1390 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBasicBlock1397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicBlock__Group__0_in_ruleBasicBlock1423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeList_in_entryRuleTypeList1450 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeList1457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeList__Group__0_in_ruleTypeList1483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRETURN_ATTRIBUTES_in_entryRuleRETURN_ATTRIBUTES1510 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRETURN_ATTRIBUTES1517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RETURN_ATTRIBUTES__Alternatives_in_ruleRETURN_ATTRIBUTES1543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCallingConv_in_entryRuleCallingConv1570 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCallingConv1577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CallingConv__Alternatives_in_ruleCallingConv1603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFUNCTION_ATTRIBUTES_in_entryRuleFUNCTION_ATTRIBUTES1630 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFUNCTION_ATTRIBUTES1637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FUNCTION_ATTRIBUTES__Alternatives_in_ruleFUNCTION_ATTRIBUTES1663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVISIBILITY_in_entryRuleVISIBILITY1690 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVISIBILITY1697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VISIBILITY__Alternatives_in_ruleVISIBILITY1723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLINKAGE_in_entryRuleLINKAGE1750 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLINKAGE1757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LINKAGE__Alternatives_in_ruleLINKAGE1783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleALIAS_LINKAGE_in_entryRuleALIAS_LINKAGE1810 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleALIAS_LINKAGE1817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ALIAS_LINKAGE__Alternatives_in_ruleALIAS_LINKAGE1843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleALIGNMENT_in_entryRuleALIGNMENT1870 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleALIGNMENT1877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ALIGNMENT__Group__0_in_ruleALIGNMENT1903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AbstractElement__Group_0__0_in_rule__AbstractElement__Alternatives1939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AbstractElement__Group_1__0_in_rule__AbstractElement__Alternatives1957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopLevelEntity__Group_0__0_in_rule__TopLevelEntity__Alternatives1990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopLevelEntity__Group_1__0_in_rule__TopLevelEntity__Alternatives2008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopLevelEntity__Group_2__0_in_rule__TopLevelEntity__Alternatives2026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__TopLevelEntity__Alternatives_1_12060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__TopLevelEntity__Alternatives_1_12080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDefinition_in_rule__MainLevelEntity__Alternatives2114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionDefinition_in_rule__MainLevelEntity__Alternatives2131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLINKAGE_in_rule__TypeDefinition__Alternatives_22163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__TypeDefinition__Alternatives_22181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__TypeDefinition__Alternatives_22201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__TypeDefinition__Alternatives_22221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDefinition__StructAssignment_3_1_0_in_rule__TypeDefinition__Alternatives_3_12255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpaque_in_rule__TypeDefinition__Alternatives_3_12273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group_0__0_in_rule__FunctionDefinition__Alternatives2305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group_1__0_in_rule__FunctionDefinition__Alternatives2323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__TListAssignment_1_7_0_in_rule__FunctionDefinition__Alternatives_1_72356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OREST_in_rule__FunctionDefinition__Alternatives_1_72374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredefined_in_rule__TypeUse__Alternatives2406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddressUse_in_rule__TypeUse__Alternatives2423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Primitive_Type__Alternatives2456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Primitive_Type__Alternatives2476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Primitive_Type__Alternatives2496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Primitive_Type__Alternatives2516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Primitive_Type__Alternatives2536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Primitive_Type__Alternatives2556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__FloatingPoint_Type__Alternatives2591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__FloatingPoint_Type__Alternatives2611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__FloatingPoint_Type__Alternatives2631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__FloatingPoint_Type__Alternatives2651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__FloatingPoint_Type__Alternatives2671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__FloatingPoint_Type__Alternatives2691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitive_Type_in_rule__Predefined_Types__Alternatives2725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_TYPE_in_rule__Predefined_Types__Alternatives2742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatingPoint_Type_in_rule__Predefined_Types__Alternatives2759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstant_in_rule__Value__Alternatives2792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNonConstantValue_in_rule__Value__Alternatives2809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__TypeList__Alternatives_12842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeList__Group_1_1__0_in_rule__TypeList__Alternatives_12861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__TypeList__Alternatives_1_1_22895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__TypeList__Alternatives_1_1_22915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__TypeList__Alternatives_1_1_22935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__TypeList__Alternatives_1_1_22955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__TypeList__Alternatives_1_1_22975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__TypeList__Alternatives_1_1_22995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__RETURN_ATTRIBUTES__Alternatives3030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__RETURN_ATTRIBUTES__Alternatives3050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__RETURN_ATTRIBUTES__Alternatives3070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__RETURN_ATTRIBUTES__Alternatives3090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__RETURN_ATTRIBUTES__Alternatives3110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__RETURN_ATTRIBUTES__Alternatives3130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__RETURN_ATTRIBUTES__Alternatives3150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__RETURN_ATTRIBUTES__Alternatives3170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__CallingConv__Alternatives3205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__CallingConv__Alternatives3225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__CallingConv__Alternatives3245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__CallingConv__Alternatives3265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rule__CallingConv__Alternatives3285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rule__CallingConv__Alternatives3305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_rule__CallingConv__Alternatives3325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rule__CallingConv__Alternatives3345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_rule__CallingConv__Alternatives3365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_rule__CallingConv__Alternatives3385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_rule__CallingConv__Alternatives3405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_rule__CallingConv__Alternatives3425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_rule__CallingConv__Alternatives3445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_rule__CallingConv__Alternatives3465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CallingConv__Group_14__0_in_rule__CallingConv__Alternatives3484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_rule__FUNCTION_ATTRIBUTES__Alternatives3518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FUNCTION_ATTRIBUTES__Group_1__0_in_rule__FUNCTION_ATTRIBUTES__Alternatives3537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_rule__FUNCTION_ATTRIBUTES__Alternatives3556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_rule__FUNCTION_ATTRIBUTES__Alternatives3576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_rule__FUNCTION_ATTRIBUTES__Alternatives3596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_rule__FUNCTION_ATTRIBUTES__Alternatives3616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_rule__FUNCTION_ATTRIBUTES__Alternatives3636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_rule__FUNCTION_ATTRIBUTES__Alternatives3656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_rule__FUNCTION_ATTRIBUTES__Alternatives3676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_rule__FUNCTION_ATTRIBUTES__Alternatives3696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_rule__FUNCTION_ATTRIBUTES__Alternatives3716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_rule__FUNCTION_ATTRIBUTES__Alternatives3736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_rule__FUNCTION_ATTRIBUTES__Alternatives3756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_rule__FUNCTION_ATTRIBUTES__Alternatives3776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_rule__FUNCTION_ATTRIBUTES__Alternatives3796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_rule__FUNCTION_ATTRIBUTES__Alternatives3816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_rule__FUNCTION_ATTRIBUTES__Alternatives3836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_rule__FUNCTION_ATTRIBUTES__Alternatives3856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_rule__VISIBILITY__Alternatives3891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_rule__VISIBILITY__Alternatives3911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_rule__VISIBILITY__Alternatives3931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_rule__LINKAGE__Alternatives3966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_rule__LINKAGE__Alternatives3986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_rule__LINKAGE__Alternatives4006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_rule__LINKAGE__Alternatives4026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_rule__LINKAGE__Alternatives4046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_rule__LINKAGE__Alternatives4066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_rule__LINKAGE__Alternatives4086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_rule__LINKAGE__Alternatives4106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_rule__LINKAGE__Alternatives4126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_rule__LINKAGE__Alternatives4146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_rule__LINKAGE__Alternatives4166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_rule__LINKAGE__Alternatives4186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleALIAS_LINKAGE_in_rule__LINKAGE__Alternatives4205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_rule__ALIAS_LINKAGE__Alternatives4238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_98_in_rule__ALIAS_LINKAGE__Alternatives4258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_99_in_rule__ALIAS_LINKAGE__Alternatives4278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_100_in_rule__ALIAS_LINKAGE__Alternatives4298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AbstractElement__Group_0__0__Impl_in_rule__AbstractElement__Group_0__04330 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__AbstractElement__Group_0__1_in_rule__AbstractElement__Group_0__04333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTopLevelEntity_in_rule__AbstractElement__Group_0__0__Impl4360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AbstractElement__Group_0__1__Impl_in_rule__AbstractElement__Group_0__14389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SL_COMMENT_in_rule__AbstractElement__Group_0__1__Impl4417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AbstractElement__Group_1__0__Impl_in_rule__AbstractElement__Group_1__04452 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__AbstractElement__Group_1__1_in_rule__AbstractElement__Group_1__04455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMainLevelEntity_in_rule__AbstractElement__Group_1__0__Impl4482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AbstractElement__Group_1__1__Impl_in_rule__AbstractElement__Group_1__14511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SL_COMMENT_in_rule__AbstractElement__Group_1__1__Impl4539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopLevelEntity__Group_0__0__Impl_in_rule__TopLevelEntity__Group_0__04574 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_rule__TopLevelEntity__Group_0__1_in_rule__TopLevelEntity__Group_0__04577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_101_in_rule__TopLevelEntity__Group_0__0__Impl4605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopLevelEntity__Group_0__1__Impl_in_rule__TopLevelEntity__Group_0__14636 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__TopLevelEntity__Group_0__2_in_rule__TopLevelEntity__Group_0__14639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_102_in_rule__TopLevelEntity__Group_0__1__Impl4667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopLevelEntity__Group_0__2__Impl_in_rule__TopLevelEntity__Group_0__24698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopLevelEntity__ModuleAssignment_0_2_in_rule__TopLevelEntity__Group_0__2__Impl4725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopLevelEntity__Group_1__0__Impl_in_rule__TopLevelEntity__Group_1__04761 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_rule__TopLevelEntity__Group_1__1_in_rule__TopLevelEntity__Group_1__04764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_103_in_rule__TopLevelEntity__Group_1__0__Impl4792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopLevelEntity__Group_1__1__Impl_in_rule__TopLevelEntity__Group_1__14823 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_rule__TopLevelEntity__Group_1__2_in_rule__TopLevelEntity__Group_1__14826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopLevelEntity__Alternatives_1_1_in_rule__TopLevelEntity__Group_1__1__Impl4853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopLevelEntity__Group_1__2__Impl_in_rule__TopLevelEntity__Group_1__24883 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__TopLevelEntity__Group_1__3_in_rule__TopLevelEntity__Group_1__24886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_104_in_rule__TopLevelEntity__Group_1__2__Impl4914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopLevelEntity__Group_1__3__Impl_in_rule__TopLevelEntity__Group_1__34945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopLevelEntity__TargetAssignment_1_3_in_rule__TopLevelEntity__Group_1__3__Impl4972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopLevelEntity__Group_2__0__Impl_in_rule__TopLevelEntity__Group_2__05010 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_rule__TopLevelEntity__Group_2__1_in_rule__TopLevelEntity__Group_2__05013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_105_in_rule__TopLevelEntity__Group_2__0__Impl5041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopLevelEntity__Group_2__1__Impl_in_rule__TopLevelEntity__Group_2__15072 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__TopLevelEntity__Group_2__2_in_rule__TopLevelEntity__Group_2__15075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_104_in_rule__TopLevelEntity__Group_2__1__Impl5103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopLevelEntity__Group_2__2__Impl_in_rule__TopLevelEntity__Group_2__25134 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__TopLevelEntity__Group_2__3_in_rule__TopLevelEntity__Group_2__25137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ARRAYL_in_rule__TopLevelEntity__Group_2__2__Impl5164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopLevelEntity__Group_2__3__Impl_in_rule__TopLevelEntity__Group_2__35193 = new BitSet(new long[]{0x0000000000000100L,0x0000040000000000L});
    public static final BitSet FOLLOW_rule__TopLevelEntity__Group_2__4_in_rule__TopLevelEntity__Group_2__35196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopLevelEntity__LibsAssignment_2_3_in_rule__TopLevelEntity__Group_2__3__Impl5223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopLevelEntity__Group_2__4__Impl_in_rule__TopLevelEntity__Group_2__45253 = new BitSet(new long[]{0x0000000000000100L,0x0000040000000000L});
    public static final BitSet FOLLOW_rule__TopLevelEntity__Group_2__5_in_rule__TopLevelEntity__Group_2__45256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopLevelEntity__Group_2_4__0_in_rule__TopLevelEntity__Group_2__4__Impl5283 = new BitSet(new long[]{0x0000000000000002L,0x0000040000000000L});
    public static final BitSet FOLLOW_rule__TopLevelEntity__Group_2__5__Impl_in_rule__TopLevelEntity__Group_2__55314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ARRAYR_in_rule__TopLevelEntity__Group_2__5__Impl5341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopLevelEntity__Group_2_4__0__Impl_in_rule__TopLevelEntity__Group_2_4__05382 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__TopLevelEntity__Group_2_4__1_in_rule__TopLevelEntity__Group_2_4__05385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_106_in_rule__TopLevelEntity__Group_2_4__0__Impl5413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopLevelEntity__Group_2_4__1__Impl_in_rule__TopLevelEntity__Group_2_4__15444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopLevelEntity__LibsAssignment_2_4_1_in_rule__TopLevelEntity__Group_2_4__1__Impl5471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDefinition__Group__0__Impl_in_rule__TypeDefinition__Group__05505 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_rule__TypeDefinition__Group__1_in_rule__TypeDefinition__Group__05508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDefinition__AddressAssignment_0_in_rule__TypeDefinition__Group__0__Impl5535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDefinition__Group__1__Impl_in_rule__TypeDefinition__Group__15565 = new BitSet(new long[]{0x0000000000E00000L,0x0000081FFFE00000L});
    public static final BitSet FOLLOW_rule__TypeDefinition__Group__2_in_rule__TypeDefinition__Group__15568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_104_in_rule__TypeDefinition__Group__1__Impl5596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDefinition__Group__2__Impl_in_rule__TypeDefinition__Group__25627 = new BitSet(new long[]{0x0000000000E00000L,0x0000081FFFE00000L});
    public static final BitSet FOLLOW_rule__TypeDefinition__Group__3_in_rule__TypeDefinition__Group__25630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDefinition__Alternatives_2_in_rule__TypeDefinition__Group__2__Impl5657 = new BitSet(new long[]{0x0000000000E00002L,0x0000001FFFE00000L});
    public static final BitSet FOLLOW_rule__TypeDefinition__Group__3__Impl_in_rule__TypeDefinition__Group__35688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDefinition__Group_3__0_in_rule__TypeDefinition__Group__3__Impl5715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDefinition__Group_3__0__Impl_in_rule__TypeDefinition__Group_3__05753 = new BitSet(new long[]{0x0000000000040000L,0x0004000000000000L});
    public static final BitSet FOLLOW_rule__TypeDefinition__Group_3__1_in_rule__TypeDefinition__Group_3__05756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_107_in_rule__TypeDefinition__Group_3__0__Impl5784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDefinition__Group_3__1__Impl_in_rule__TypeDefinition__Group_3__15815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDefinition__Alternatives_3_1_in_rule__TypeDefinition__Group_3__1__Impl5842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group_0__0__Impl_in_rule__FunctionDefinition__Group_0__05876 = new BitSet(new long[]{0xFFFFF80FFF001020L,0x0040001FFFFC0001L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group_0__1_in_rule__FunctionDefinition__Group_0__05879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_108_in_rule__FunctionDefinition__Group_0__0__Impl5907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group_0__1__Impl_in_rule__FunctionDefinition__Group_0__15938 = new BitSet(new long[]{0xFFFFF80FFF001020L,0x0040001FFFFC0001L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group_0__2_in_rule__FunctionDefinition__Group_0__15941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLINKAGE_in_rule__FunctionDefinition__Group_0__1__Impl5969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group_0__2__Impl_in_rule__FunctionDefinition__Group_0__26000 = new BitSet(new long[]{0xFFFFF80FFF001020L,0x0040001FFFFC0001L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group_0__3_in_rule__FunctionDefinition__Group_0__26003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVISIBILITY_in_rule__FunctionDefinition__Group_0__2__Impl6031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group_0__3__Impl_in_rule__FunctionDefinition__Group_0__36062 = new BitSet(new long[]{0xFFFFF80FFF001020L,0x0040001FFFFC0001L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group_0__4_in_rule__FunctionDefinition__Group_0__36065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCallingConv_in_rule__FunctionDefinition__Group_0__3__Impl6093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group_0__4__Impl_in_rule__FunctionDefinition__Group_0__46124 = new BitSet(new long[]{0xFFFFF80FFF001020L,0x0040001FFFFC0001L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group_0__5_in_rule__FunctionDefinition__Group_0__46127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRETURN_ATTRIBUTES_in_rule__FunctionDefinition__Group_0__4__Impl6155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group_0__5__Impl_in_rule__FunctionDefinition__Group_0__56186 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group_0__6_in_rule__FunctionDefinition__Group_0__56189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__ReturnTypeAssignment_0_5_in_rule__FunctionDefinition__Group_0__5__Impl6216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group_0__6__Impl_in_rule__FunctionDefinition__Group_0__66246 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group_0__7_in_rule__FunctionDefinition__Group_0__66249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__AddressAssignment_0_6_in_rule__FunctionDefinition__Group_0__6__Impl6276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group_0__7__Impl_in_rule__FunctionDefinition__Group_0__76306 = new BitSet(new long[]{0x0000000000400000L,0x018420000003FFFEL});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group_0__8_in_rule__FunctionDefinition__Group_0__76309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__PlAssignment_0_7_in_rule__FunctionDefinition__Group_0__7__Impl6336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group_0__8__Impl_in_rule__FunctionDefinition__Group_0__86366 = new BitSet(new long[]{0x0000000000400000L,0x018420000003FFFEL});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group_0__9_in_rule__FunctionDefinition__Group_0__86369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__FunctionDefinition__Group_0__8__Impl6398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group_0__9__Impl_in_rule__FunctionDefinition__Group_0__96431 = new BitSet(new long[]{0x0000000000400000L,0x018420000003FFFEL});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group_0__10_in_rule__FunctionDefinition__Group_0__96434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFUNCTION_ATTRIBUTES_in_rule__FunctionDefinition__Group_0__9__Impl6462 = new BitSet(new long[]{0x0000000000000002L,0x008000000003FFFEL});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group_0__10__Impl_in_rule__FunctionDefinition__Group_0__106493 = new BitSet(new long[]{0x0000000000400000L,0x018420000003FFFEL});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group_0__11_in_rule__FunctionDefinition__Group_0__106496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group_0_10__0_in_rule__FunctionDefinition__Group_0__10__Impl6523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group_0__11__Impl_in_rule__FunctionDefinition__Group_0__116554 = new BitSet(new long[]{0x0000000000400000L,0x018420000003FFFEL});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group_0__12_in_rule__FunctionDefinition__Group_0__116557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleALIGNMENT_in_rule__FunctionDefinition__Group_0__11__Impl6585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group_0__12__Impl_in_rule__FunctionDefinition__Group_0__126616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__BodyAssignment_0_12_in_rule__FunctionDefinition__Group_0__12__Impl6643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group_0_10__0__Impl_in_rule__FunctionDefinition__Group_0_10__06699 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group_0_10__1_in_rule__FunctionDefinition__Group_0_10__06702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_109_in_rule__FunctionDefinition__Group_0_10__0__Impl6730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group_0_10__1__Impl_in_rule__FunctionDefinition__Group_0_10__16761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__FunctionDefinition__Group_0_10__1__Impl6788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group_1__0__Impl_in_rule__FunctionDefinition__Group_1__06821 = new BitSet(new long[]{0xFFFFF80FFF001020L,0x0040001FFFFC0001L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group_1__1_in_rule__FunctionDefinition__Group_1__06824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_110_in_rule__FunctionDefinition__Group_1__0__Impl6852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group_1__1__Impl_in_rule__FunctionDefinition__Group_1__16883 = new BitSet(new long[]{0xFFFFF80FFF001020L,0x0040001FFFFC0001L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group_1__2_in_rule__FunctionDefinition__Group_1__16886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLINKAGE_in_rule__FunctionDefinition__Group_1__1__Impl6914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group_1__2__Impl_in_rule__FunctionDefinition__Group_1__26945 = new BitSet(new long[]{0xFFFFF80FFF001020L,0x0040001FFFFC0001L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group_1__3_in_rule__FunctionDefinition__Group_1__26948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVISIBILITY_in_rule__FunctionDefinition__Group_1__2__Impl6976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group_1__3__Impl_in_rule__FunctionDefinition__Group_1__37007 = new BitSet(new long[]{0xFFFFF80FFF001020L,0x0040001FFFFC0001L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group_1__4_in_rule__FunctionDefinition__Group_1__37010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCallingConv_in_rule__FunctionDefinition__Group_1__3__Impl7038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group_1__4__Impl_in_rule__FunctionDefinition__Group_1__47069 = new BitSet(new long[]{0xFFFFF80FFF001020L,0x0040001FFFFC0001L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group_1__5_in_rule__FunctionDefinition__Group_1__47072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRETURN_ATTRIBUTES_in_rule__FunctionDefinition__Group_1__4__Impl7100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group_1__5__Impl_in_rule__FunctionDefinition__Group_1__57131 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group_1__6_in_rule__FunctionDefinition__Group_1__57134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__ReturnTypeAssignment_1_5_in_rule__FunctionDefinition__Group_1__5__Impl7161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group_1__6__Impl_in_rule__FunctionDefinition__Group_1__67191 = new BitSet(new long[]{0x0000001000000010L,0x0010000000000000L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group_1__7_in_rule__FunctionDefinition__Group_1__67194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__AddressAssignment_1_6_in_rule__FunctionDefinition__Group_1__6__Impl7221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group_1__7__Impl_in_rule__FunctionDefinition__Group_1__77251 = new BitSet(new long[]{0x0000000000400000L,0x018020000003FFFEL});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group_1__8_in_rule__FunctionDefinition__Group_1__77254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Alternatives_1_7_in_rule__FunctionDefinition__Group_1__7__Impl7281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group_1__8__Impl_in_rule__FunctionDefinition__Group_1__87311 = new BitSet(new long[]{0x0000000000400000L,0x018020000003FFFEL});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group_1__9_in_rule__FunctionDefinition__Group_1__87314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__FunctionDefinition__Group_1__8__Impl7343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group_1__9__Impl_in_rule__FunctionDefinition__Group_1__97376 = new BitSet(new long[]{0x0000000000400000L,0x018020000003FFFEL});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group_1__10_in_rule__FunctionDefinition__Group_1__97379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFUNCTION_ATTRIBUTES_in_rule__FunctionDefinition__Group_1__9__Impl7407 = new BitSet(new long[]{0x0000000000000002L,0x008000000003FFFEL});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group_1__10__Impl_in_rule__FunctionDefinition__Group_1__107438 = new BitSet(new long[]{0x0000000000400000L,0x018020000003FFFEL});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group_1__11_in_rule__FunctionDefinition__Group_1__107441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group_1_10__0_in_rule__FunctionDefinition__Group_1__10__Impl7468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group_1__11__Impl_in_rule__FunctionDefinition__Group_1__117499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleALIGNMENT_in_rule__FunctionDefinition__Group_1__11__Impl7527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group_1_10__0__Impl_in_rule__FunctionDefinition__Group_1_10__07582 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group_1_10__1_in_rule__FunctionDefinition__Group_1_10__07585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_109_in_rule__FunctionDefinition__Group_1_10__0__Impl7613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group_1_10__1__Impl_in_rule__FunctionDefinition__Group_1_10__17644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__FunctionDefinition__Group_1_10__1__Impl7671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddressUse__Group__0__Impl_in_rule__AddressUse__Group__07705 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__AddressUse__Group__1_in_rule__AddressUse__Group__07708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddressUse__AddressAssignment_0_in_rule__AddressUse__Group__0__Impl7735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddressUse__Group__1__Impl_in_rule__AddressUse__Group__17765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddressUse__PointerAssignment_1_in_rule__AddressUse__Group__1__Impl7792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Predefined__Group__0__Impl_in_rule__Predefined__Group__07827 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__Predefined__Group__1_in_rule__Predefined__Group__07830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Predefined__TypeAssignment_0_in_rule__Predefined__Group__0__Impl7857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Predefined__Group__1__Impl_in_rule__Predefined__Group__17887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Predefined__PointerAssignment_1_in_rule__Predefined__Group__1__Impl7914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vector__Group__0__Impl_in_rule__Vector__Group__07949 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rule__Vector__Group__1_in_rule__Vector__Group__07952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_111_in_rule__Vector__Group__0__Impl7980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vector__Group__1__Impl_in_rule__Vector__Group__18011 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_rule__Vector__Group__2_in_rule__Vector__Group__18014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Vector__Group__1__Impl8041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vector__Group__2__Impl_in_rule__Vector__Group__28070 = new BitSet(new long[]{0xFFFFF80FFF001020L,0x0040001FFFFC0001L});
    public static final BitSet FOLLOW_rule__Vector__Group__3_in_rule__Vector__Group__28073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_112_in_rule__Vector__Group__2__Impl8101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vector__Group__3__Impl_in_rule__Vector__Group__38132 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_rule__Vector__Group__4_in_rule__Vector__Group__38135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeUse_in_rule__Vector__Group__3__Impl8162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vector__Group__4__Impl_in_rule__Vector__Group__48191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_113_in_rule__Vector__Group__4__Impl8219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Array__Group__0__Impl_in_rule__Array__Group__08260 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rule__Array__Group__1_in_rule__Array__Group__08263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ARRAYL_in_rule__Array__Group__0__Impl8290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Array__Group__1__Impl_in_rule__Array__Group__18319 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_rule__Array__Group__2_in_rule__Array__Group__18322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Array__Group__1__Impl8349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Array__Group__2__Impl_in_rule__Array__Group__28378 = new BitSet(new long[]{0xFFFFF80FFF001020L,0x0040001FFFFC0001L});
    public static final BitSet FOLLOW_rule__Array__Group__3_in_rule__Array__Group__28381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_112_in_rule__Array__Group__2__Impl8409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Array__Group__3__Impl_in_rule__Array__Group__38440 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__Array__Group__4_in_rule__Array__Group__38443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeUse_in_rule__Array__Group__3__Impl8470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Array__Group__4__Impl_in_rule__Array__Group__48499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ARRAYR_in_rule__Array__Group__4__Impl8526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NonConstantValue__Group__0__Impl_in_rule__NonConstantValue__Group__08566 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__NonConstantValue__Group__1_in_rule__NonConstantValue__Group__08569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NonConstantValue__NameAssignment_0_in_rule__NonConstantValue__Group__0__Impl8596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NonConstantValue__Group__1__Impl_in_rule__NonConstantValue__Group__18626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NonConstantValue__PointerAssignment_1_in_rule__NonConstantValue__Group__1__Impl8653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Structure__Group__0__Impl_in_rule__Structure__Group__08688 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_rule__Structure__Group__1_in_rule__Structure__Group__08691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Structure__Group__1__Impl_in_rule__Structure__Group__18749 = new BitSet(new long[]{0xFFFFF80FFF001020L,0x0048001FFFFC0001L});
    public static final BitSet FOLLOW_rule__Structure__Group__2_in_rule__Structure__Group__18752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_114_in_rule__Structure__Group__1__Impl8780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Structure__Group__2__Impl_in_rule__Structure__Group__28811 = new BitSet(new long[]{0xFFFFF80FFF001020L,0x0048001FFFFC0001L});
    public static final BitSet FOLLOW_rule__Structure__Group__3_in_rule__Structure__Group__28814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Structure__Group_2__0_in_rule__Structure__Group__2__Impl8841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Structure__Group__3__Impl_in_rule__Structure__Group__38872 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__Structure__Group__4_in_rule__Structure__Group__38875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_115_in_rule__Structure__Group__3__Impl8903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Structure__Group__4__Impl_in_rule__Structure__Group__48934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_POINTER_in_rule__Structure__Group__4__Impl8962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Structure__Group_2__0__Impl_in_rule__Structure__Group_2__09003 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_rule__Structure__Group_2__1_in_rule__Structure__Group_2__09006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Structure__TypesAssignment_2_0_in_rule__Structure__Group_2__0__Impl9033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Structure__Group_2__1__Impl_in_rule__Structure__Group_2__19063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Structure__Group_2_1__0_in_rule__Structure__Group_2__1__Impl9090 = new BitSet(new long[]{0x0000000000000002L,0x0000040000000000L});
    public static final BitSet FOLLOW_rule__Structure__Group_2_1__0__Impl_in_rule__Structure__Group_2_1__09125 = new BitSet(new long[]{0xFFFFF80FFF001020L,0x0040001FFFFC0001L});
    public static final BitSet FOLLOW_rule__Structure__Group_2_1__1_in_rule__Structure__Group_2_1__09128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_106_in_rule__Structure__Group_2_1__0__Impl9156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Structure__Group_2_1__1__Impl_in_rule__Structure__Group_2_1__19187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Structure__TypesAssignment_2_1_1_in_rule__Structure__Group_2_1__1__Impl9214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterList__Group__0__Impl_in_rule__ParameterList__Group__09248 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_rule__ParameterList__Group__1_in_rule__ParameterList__Group__09251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterList__Group__1__Impl_in_rule__ParameterList__Group__19309 = new BitSet(new long[]{0xFFFFF82FFF001020L,0x0040001FFFFC0001L});
    public static final BitSet FOLLOW_rule__ParameterList__Group__2_in_rule__ParameterList__Group__19312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_116_in_rule__ParameterList__Group__1__Impl9340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterList__Group__2__Impl_in_rule__ParameterList__Group__29371 = new BitSet(new long[]{0xFFFFF82FFF001020L,0x0040001FFFFC0001L});
    public static final BitSet FOLLOW_rule__ParameterList__Group__3_in_rule__ParameterList__Group__29374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterList__Group_2__0_in_rule__ParameterList__Group__2__Impl9401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterList__Group__3__Impl_in_rule__ParameterList__Group__39432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__ParameterList__Group__3__Impl9460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterList__Group_2__0__Impl_in_rule__ParameterList__Group_2__09499 = new BitSet(new long[]{0x0007F81000001400L,0x0010000000000000L});
    public static final BitSet FOLLOW_rule__ParameterList__Group_2__1_in_rule__ParameterList__Group_2__09502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterList__TypesAssignment_2_0_in_rule__ParameterList__Group_2__0__Impl9529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterList__Group_2__1__Impl_in_rule__ParameterList__Group_2__19559 = new BitSet(new long[]{0x0007F81000001400L,0x0010000000000000L});
    public static final BitSet FOLLOW_rule__ParameterList__Group_2__2_in_rule__ParameterList__Group_2__19562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterList__ListsAssignment_2_1_in_rule__ParameterList__Group_2__1__Impl9589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterList__Group_2__2__Impl_in_rule__ParameterList__Group_2__29620 = new BitSet(new long[]{0x0007F81000001400L,0x0010000000000000L});
    public static final BitSet FOLLOW_rule__ParameterList__Group_2__3_in_rule__ParameterList__Group_2__29623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRETURN_ATTRIBUTES_in_rule__ParameterList__Group_2__2__Impl9651 = new BitSet(new long[]{0x0007F80000000002L});
    public static final BitSet FOLLOW_rule__ParameterList__Group_2__3__Impl_in_rule__ParameterList__Group_2__39682 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_rule__ParameterList__Group_2__4_in_rule__ParameterList__Group_2__39685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterList__VariablesAssignment_2_3_in_rule__ParameterList__Group_2__3__Impl9712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterList__Group_2__4__Impl_in_rule__ParameterList__Group_2__49742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterList__Group_2_4__0_in_rule__ParameterList__Group_2__4__Impl9769 = new BitSet(new long[]{0x0000000000000002L,0x0000040000000000L});
    public static final BitSet FOLLOW_rule__ParameterList__Group_2_4__0__Impl_in_rule__ParameterList__Group_2_4__09810 = new BitSet(new long[]{0xFFFFF80FFF001020L,0x0040001FFFFC0001L});
    public static final BitSet FOLLOW_rule__ParameterList__Group_2_4__1_in_rule__ParameterList__Group_2_4__09813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_106_in_rule__ParameterList__Group_2_4__0__Impl9841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterList__Group_2_4__1__Impl_in_rule__ParameterList__Group_2_4__19872 = new BitSet(new long[]{0x0007F81000001400L,0x0010000000000000L});
    public static final BitSet FOLLOW_rule__ParameterList__Group_2_4__2_in_rule__ParameterList__Group_2_4__19875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterList__TypesAssignment_2_4_1_in_rule__ParameterList__Group_2_4__1__Impl9902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterList__Group_2_4__2__Impl_in_rule__ParameterList__Group_2_4__29932 = new BitSet(new long[]{0x0007F81000001400L,0x0010000000000000L});
    public static final BitSet FOLLOW_rule__ParameterList__Group_2_4__3_in_rule__ParameterList__Group_2_4__29935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterList__ListsAssignment_2_4_2_in_rule__ParameterList__Group_2_4__2__Impl9962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterList__Group_2_4__3__Impl_in_rule__ParameterList__Group_2_4__39993 = new BitSet(new long[]{0x0007F81000001400L,0x0010000000000000L});
    public static final BitSet FOLLOW_rule__ParameterList__Group_2_4__4_in_rule__ParameterList__Group_2_4__39996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRETURN_ATTRIBUTES_in_rule__ParameterList__Group_2_4__3__Impl10024 = new BitSet(new long[]{0x0007F80000000002L});
    public static final BitSet FOLLOW_rule__ParameterList__Group_2_4__4__Impl_in_rule__ParameterList__Group_2_4__410055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterList__VariablesAssignment_2_4_4_in_rule__ParameterList__Group_2_4__4__Impl10082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionBody__Group__0__Impl_in_rule__FunctionBody__Group__010122 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__FunctionBody__Group__1_in_rule__FunctionBody__Group__010125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_114_in_rule__FunctionBody__Group__0__Impl10153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionBody__Group__1__Impl_in_rule__FunctionBody__Group__110184 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_rule__FunctionBody__Group__2_in_rule__FunctionBody__Group__110187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionBody__BlocksAssignment_1_in_rule__FunctionBody__Group__1__Impl10216 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_rule__FunctionBody__BlocksAssignment_1_in_rule__FunctionBody__Group__1__Impl10228 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_rule__FunctionBody__Group__2__Impl_in_rule__FunctionBody__Group__210261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_115_in_rule__FunctionBody__Group__2__Impl10289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicBlock__Group__0__Impl_in_rule__BasicBlock__Group__010326 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_rule__BasicBlock__Group__1_in_rule__BasicBlock__Group__010329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicBlock__LabelAssignment_0_in_rule__BasicBlock__Group__0__Impl10356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicBlock__Group__1__Impl_in_rule__BasicBlock__Group__110386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_117_in_rule__BasicBlock__Group__1__Impl10414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeList__Group__0__Impl_in_rule__TypeList__Group__010449 = new BitSet(new long[]{0x0000001000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_rule__TypeList__Group__1_in_rule__TypeList__Group__010452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeList__Group__1__Impl_in_rule__TypeList__Group__110510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeList__Alternatives_1_in_rule__TypeList__Group__1__Impl10537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeList__Group_1_1__0__Impl_in_rule__TypeList__Group_1_1__010571 = new BitSet(new long[]{0xFFFFFFEFFF001020L,0x0040001FFFFC0001L});
    public static final BitSet FOLLOW_rule__TypeList__Group_1_1__1_in_rule__TypeList__Group_1_1__010574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_116_in_rule__TypeList__Group_1_1__0__Impl10602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeList__Group_1_1__1__Impl_in_rule__TypeList__Group_1_1__110633 = new BitSet(new long[]{0xFFFFFFEFFF001020L,0x0040001FFFFC0001L});
    public static final BitSet FOLLOW_rule__TypeList__Group_1_1__2_in_rule__TypeList__Group_1_1__110636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeList__Group_1_1_1__0_in_rule__TypeList__Group_1_1__1__Impl10663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeList__Group_1_1__2__Impl_in_rule__TypeList__Group_1_1__210694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeList__Alternatives_1_1_2_in_rule__TypeList__Group_1_1__2__Impl10721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeList__Group_1_1_1__0__Impl_in_rule__TypeList__Group_1_1_1__010757 = new BitSet(new long[]{0x0007F81000000000L,0x0010040000000000L});
    public static final BitSet FOLLOW_rule__TypeList__Group_1_1_1__1_in_rule__TypeList__Group_1_1_1__010760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeList__TypesAssignment_1_1_1_0_in_rule__TypeList__Group_1_1_1__0__Impl10787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeList__Group_1_1_1__1__Impl_in_rule__TypeList__Group_1_1_1__110817 = new BitSet(new long[]{0x0007F81000000000L,0x0010040000000000L});
    public static final BitSet FOLLOW_rule__TypeList__Group_1_1_1__2_in_rule__TypeList__Group_1_1_1__110820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeList__TypelistsAssignment_1_1_1_1_in_rule__TypeList__Group_1_1_1__1__Impl10847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeList__Group_1_1_1__2__Impl_in_rule__TypeList__Group_1_1_1__210878 = new BitSet(new long[]{0x0007F81000000000L,0x0010040000000000L});
    public static final BitSet FOLLOW_rule__TypeList__Group_1_1_1__3_in_rule__TypeList__Group_1_1_1__210881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRETURN_ATTRIBUTES_in_rule__TypeList__Group_1_1_1__2__Impl10909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeList__Group_1_1_1__3__Impl_in_rule__TypeList__Group_1_1_1__310940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeList__Group_1_1_1_3__0_in_rule__TypeList__Group_1_1_1__3__Impl10967 = new BitSet(new long[]{0x0000000000000002L,0x0000040000000000L});
    public static final BitSet FOLLOW_rule__TypeList__Group_1_1_1_3__0__Impl_in_rule__TypeList__Group_1_1_1_3__011006 = new BitSet(new long[]{0xFFFFF80FFF001020L,0x0040001FFFFC0001L});
    public static final BitSet FOLLOW_rule__TypeList__Group_1_1_1_3__1_in_rule__TypeList__Group_1_1_1_3__011009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_106_in_rule__TypeList__Group_1_1_1_3__0__Impl11037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeList__Group_1_1_1_3__1__Impl_in_rule__TypeList__Group_1_1_1_3__111068 = new BitSet(new long[]{0x0007F81000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_rule__TypeList__Group_1_1_1_3__2_in_rule__TypeList__Group_1_1_1_3__111071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeList__TypesAssignment_1_1_1_3_1_in_rule__TypeList__Group_1_1_1_3__1__Impl11098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeList__Group_1_1_1_3__2__Impl_in_rule__TypeList__Group_1_1_1_3__211128 = new BitSet(new long[]{0x0007F81000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_rule__TypeList__Group_1_1_1_3__3_in_rule__TypeList__Group_1_1_1_3__211131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeList__TypelistsAssignment_1_1_1_3_2_in_rule__TypeList__Group_1_1_1_3__2__Impl11158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeList__Group_1_1_1_3__3__Impl_in_rule__TypeList__Group_1_1_1_3__311189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRETURN_ATTRIBUTES_in_rule__TypeList__Group_1_1_1_3__3__Impl11217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CallingConv__Group_14__0__Impl_in_rule__CallingConv__Group_14__011256 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_rule__CallingConv__Group_14__1_in_rule__CallingConv__Group_14__011259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_118_in_rule__CallingConv__Group_14__0__Impl11287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CallingConv__Group_14__1__Impl_in_rule__CallingConv__Group_14__111318 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rule__CallingConv__Group_14__2_in_rule__CallingConv__Group_14__111321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_111_in_rule__CallingConv__Group_14__1__Impl11349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CallingConv__Group_14__2__Impl_in_rule__CallingConv__Group_14__211380 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_rule__CallingConv__Group_14__3_in_rule__CallingConv__Group_14__211383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__CallingConv__Group_14__2__Impl11410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CallingConv__Group_14__3__Impl_in_rule__CallingConv__Group_14__311439 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rule__CallingConv__Group_14__4_in_rule__CallingConv__Group_14__311442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_113_in_rule__CallingConv__Group_14__3__Impl11470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CallingConv__Group_14__4__Impl_in_rule__CallingConv__Group_14__411501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__CallingConv__Group_14__4__Impl11528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FUNCTION_ATTRIBUTES__Group_1__0__Impl_in_rule__FUNCTION_ATTRIBUTES__Group_1__011567 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_rule__FUNCTION_ATTRIBUTES__Group_1__1_in_rule__FUNCTION_ATTRIBUTES__Group_1__011570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_119_in_rule__FUNCTION_ATTRIBUTES__Group_1__0__Impl11598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FUNCTION_ATTRIBUTES__Group_1__1__Impl_in_rule__FUNCTION_ATTRIBUTES__Group_1__111629 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_rule__FUNCTION_ATTRIBUTES__Group_1__2_in_rule__FUNCTION_ATTRIBUTES__Group_1__111632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_116_in_rule__FUNCTION_ATTRIBUTES__Group_1__1__Impl11660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FUNCTION_ATTRIBUTES__Group_1__2__Impl_in_rule__FUNCTION_ATTRIBUTES__Group_1__211691 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rule__FUNCTION_ATTRIBUTES__Group_1__3_in_rule__FUNCTION_ATTRIBUTES__Group_1__211694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_111_in_rule__FUNCTION_ATTRIBUTES__Group_1__2__Impl11722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FUNCTION_ATTRIBUTES__Group_1__3__Impl_in_rule__FUNCTION_ATTRIBUTES__Group_1__311753 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_rule__FUNCTION_ATTRIBUTES__Group_1__4_in_rule__FUNCTION_ATTRIBUTES__Group_1__311756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__FUNCTION_ATTRIBUTES__Group_1__3__Impl11783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FUNCTION_ATTRIBUTES__Group_1__4__Impl_in_rule__FUNCTION_ATTRIBUTES__Group_1__411812 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__FUNCTION_ATTRIBUTES__Group_1__5_in_rule__FUNCTION_ATTRIBUTES__Group_1__411815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_113_in_rule__FUNCTION_ATTRIBUTES__Group_1__4__Impl11843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FUNCTION_ATTRIBUTES__Group_1__5__Impl_in_rule__FUNCTION_ATTRIBUTES__Group_1__511874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__FUNCTION_ATTRIBUTES__Group_1__5__Impl11902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ALIGNMENT__Group__0__Impl_in_rule__ALIGNMENT__Group__011945 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rule__ALIGNMENT__Group__1_in_rule__ALIGNMENT__Group__011948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_120_in_rule__ALIGNMENT__Group__0__Impl11976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ALIGNMENT__Group__1__Impl_in_rule__ALIGNMENT__Group__112007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__ALIGNMENT__Group__1__Impl12034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_rule__LLVM__ElementsAssignment12072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__TopLevelEntity__ModuleAssignment_0_212103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__TopLevelEntity__TargetAssignment_1_312134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__TopLevelEntity__LibsAssignment_2_312165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__TopLevelEntity__LibsAssignment_2_4_112196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddress_in_rule__TypeDefinition__AddressAssignment_012227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructure_in_rule__TypeDefinition__StructAssignment_3_1_012258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeUse_in_rule__FunctionDefinition__ReturnTypeAssignment_0_512289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddress_in_rule__FunctionDefinition__AddressAssignment_0_612320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterList_in_rule__FunctionDefinition__PlAssignment_0_712351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionBody_in_rule__FunctionDefinition__BodyAssignment_0_1212382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeUse_in_rule__FunctionDefinition__ReturnTypeAssignment_1_512413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddress_in_rule__FunctionDefinition__AddressAssignment_1_612444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeList_in_rule__FunctionDefinition__TListAssignment_1_7_012475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VALID_ID_in_rule__AddressUse__AddressAssignment_012514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_POINTER_in_rule__AddressUse__PointerAssignment_112549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VALID_ID_in_rule__Address__NameAssignment12580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredefined_Types_in_rule__Predefined__TypeAssignment_012611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_POINTER_in_rule__Predefined__PointerAssignment_112642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Constant__ValueAssignment12673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VALID_ID_in_rule__NonConstantValue__NameAssignment_012704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_POINTER_in_rule__NonConstantValue__PointerAssignment_112735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeUse_in_rule__Structure__TypesAssignment_2_012766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeUse_in_rule__Structure__TypesAssignment_2_1_112797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeUse_in_rule__ParameterList__TypesAssignment_2_012828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeList_in_rule__ParameterList__ListsAssignment_2_112859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rule__ParameterList__VariablesAssignment_2_312890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeUse_in_rule__ParameterList__TypesAssignment_2_4_112921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeList_in_rule__ParameterList__ListsAssignment_2_4_212952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rule__ParameterList__VariablesAssignment_2_4_412983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicBlock_in_rule__FunctionBody__BlocksAssignment_113014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BasicBlock__LabelAssignment_013045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeUse_in_rule__TypeList__TypesAssignment_1_1_1_013076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeList_in_rule__TypeList__TypelistsAssignment_1_1_1_113107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeUse_in_rule__TypeList__TypesAssignment_1_1_1_3_113138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeList_in_rule__TypeList__TypelistsAssignment_1_1_1_3_213169 = new BitSet(new long[]{0x0000000000000002L});

}