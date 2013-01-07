; ModuleID = 'random_demo.cpp'
target datalayout = "e-p:32:32:32-i1:8:8-i8:8:8-i16:16:16-i32:32:32-i64:32:64-f32:32:32-f64:32:64-v64:64:64-v128:128:128-a0:0:64-f80:32:32-n8:16:32-S128"
target triple = "i386-pc-linux-gnu"

%"class.std::ios_base::Init" = type { i8 }
%"class.std::basic_ostream" = type { i32 (...)**, %"class.std::basic_ios" }
%"class.std::basic_ios" = type { %"class.std::ios_base", %"class.std::basic_ostream"*, i8, i8, %"class.std::basic_streambuf"*, %"class.std::ctype"*, %"class.std::num_put"*, %"class.std::num_get"* }
%"class.std::ios_base" = type { i32 (...)**, i32, i32, i32, i32, i32, %"struct.std::ios_base::_Callback_list"*, %"struct.std::ios_base::_Words", [8 x %"struct.std::ios_base::_Words"], i32, %"struct.std::ios_base::_Words"*, %"class.std::locale" }
%"struct.std::ios_base::_Callback_list" = type { %"struct.std::ios_base::_Callback_list"*, void (i32, %"class.std::ios_base"*, i32)*, i32, i32 }
%"struct.std::ios_base::_Words" = type { i8*, i32 }
%"class.std::locale" = type { %"class.std::locale::_Impl"* }
%"class.std::locale::_Impl" = type { i32, %"class.std::locale::facet"**, i32, %"class.std::locale::facet"**, i8** }
%"class.std::locale::facet" = type { i32 (...)**, i32 }
%"class.std::basic_streambuf" = type { i32 (...)**, i8*, i8*, i8*, i8*, i8*, i8*, %"class.std::locale" }
%"class.std::ctype" = type { %"class.std::locale::facet", %struct.__locale_struct*, i8, i32*, i32*, i16*, i8, [256 x i8], [256 x i8], i8 }
%struct.__locale_struct = type { [13 x %struct.__locale_data*], i16*, i32*, i32*, [13 x i8*] }
%struct.__locale_data = type opaque
%"class.std::num_put" = type { %"class.std::locale::facet" }
%"class.std::num_get" = type { %"class.std::locale::facet" }
%"class.boost::random::linear_congruential_engine" = type { i32 }
%"class.boost::random::variate_generator" = type { %"class.boost::random::linear_congruential_engine"*, %"class.boost::uniform_int" }
%"class.boost::uniform_int" = type { %"class.boost::random::uniform_int_distribution" }
%"class.boost::random::uniform_int_distribution" = type { i32, i32 }
%"class.boost::generator_iterator" = type { %"class.boost::random::variate_generator"*, i32 }
%"class.boost::detail::postfix_increment_proxy" = type { i32 }
%"class.boost::iterator_facade" = type { i8 }
%"class.boost::uniform_real" = type { %"class.boost::random::uniform_real_distribution" }
%"class.boost::random::uniform_real_distribution" = type { double, double }
%"class.boost::random::variate_generator.0" = type { %"class.boost::random::linear_congruential_engine"*, %"class.boost::uniform_real" }
%"class.std::basic_ofstream" = type { %"class.std::basic_ostream.base", %"class.std::basic_filebuf", %"class.std::basic_ios" }
%"class.std::basic_ostream.base" = type { i32 (...)** }
%"class.std::basic_filebuf" = type { %"class.std::basic_streambuf", %union.pthread_mutex_t, %"class.std::__basic_file", i32, %struct.__mbstate_t, %struct.__mbstate_t, %struct.__mbstate_t, i8*, i32, i8, i8, i8, i8, i8*, i8*, i8, %"class.std::codecvt"*, i8*, i32, i8*, i8* }
%union.pthread_mutex_t = type { %"struct.<anonymous union>::__pthread_mutex_s" }
%"struct.<anonymous union>::__pthread_mutex_s" = type { i32, i32, i32, i32, i32, %union.anon }
%union.anon = type { i32 }
%"class.std::__basic_file" = type { %struct._IO_FILE*, i8 }
%struct._IO_FILE = type { i32, i8*, i8*, i8*, i8*, i8*, i8*, i8*, i8*, i8*, i8*, i8*, %struct._IO_marker*, %struct._IO_FILE*, i32, i32, i32, i16, i8, [1 x i8], i8*, i64, i8*, i8*, i8*, i8*, i32, i32, [40 x i8] }
%struct._IO_marker = type { %struct._IO_marker*, %struct._IO_FILE*, i32 }
%struct.__mbstate_t = type { i32, %union.anon.1 }
%union.anon.1 = type { i32 }
%"class.std::codecvt" = type { %"class.std::__codecvt_abstract_base", %struct.__locale_struct* }
%"class.std::__codecvt_abstract_base" = type { %"class.std::locale::facet" }
%"struct.mpl_::bool_" = type { i8 }
%"struct.boost::is_integral" = type { i8 }
%"struct.boost::random::detail::subtract" = type { i8 }
%"struct.boost::random::detail::subtract.2" = type { i8 }
%"struct.boost::random::detail::add" = type { i8 }
%"struct.boost::random::detail::add.3" = type { i8 }
%"struct.boost::random::detail::div_t" = type { i64, i64 }

@_ZStL8__ioinit = internal global %"class.std::ios_base::Init" zeroinitializer, align 1
@__dso_handle = external global i8
@_ZSt4cout = external global %"class.std::basic_ostream"
@.str = private unnamed_addr constant [2 x i8] c" \00", align 1
@.str1 = private unnamed_addr constant [49 x i8] c"10 samples of a uniform distribution in [0..1):\0A\00", align 1
@.str2 = private unnamed_addr constant [35 x i8] c"\0Aexperiment: roll a die 10 times:\0A\00", align 1
@.str3 = private unnamed_addr constant [35 x i8] c"redo the experiment to verify it:\0A\00", align 1
@.str4 = private unnamed_addr constant [29 x i8] c"generator == saved_generator\00", align 1
@.str5 = private unnamed_addr constant [16 x i8] c"random_demo.cpp\00", align 1
@__PRETTY_FUNCTION__.main = private unnamed_addr constant [11 x i8] c"int main()\00", align 1
@.str6 = private unnamed_addr constant [10 x i8] c"rng.saved\00", align 1
@.str7 = private unnamed_addr constant [22 x i8] c"supress_warnings == 0\00", align 1
@.str8 = private unnamed_addr constant [60 x i8] c"/home/thomas/boost_1_52_0/boost/random/detail/const_mod.hpp\00", align 1
@__PRETTY_FUNCTION__._ZN5boost6random9const_modIjLj2147483647EE8mult_addEjjj = private unnamed_addr constant [144 x i8] c"static IntType boost::random::const_mod<unsigned int, 2147483647>::mult_add(IntType, IntType, IntType) [IntType = unsigned int, m = 2147483647]\00", align 1
@.str9 = private unnamed_addr constant [23 x i8] c"suppress_warnings == 0\00", align 1
@__PRETTY_FUNCTION__._ZN5boost6random9const_modIjLj2147483647EE12mult_generalEjj = private unnamed_addr constant [139 x i8] c"static IntType boost::random::const_mod<unsigned int, 2147483647>::mult_general(IntType, IntType) [IntType = unsigned int, m = 2147483647]\00", align 1
@.str10 = private unnamed_addr constant [13 x i8] c"modulus == m\00", align 1
@_ZZN5boost6random6detail9muldivmodEyyyE4bits = linkonce_odr constant i32 32, align 4
@_ZZN5boost6random6detail9muldivmodEyyyE4mask = linkonce_odr constant i64 4294967295, align 8
@__PRETTY_FUNCTION__._ZN5boost6random9const_modIjLj2147483647EE10mult_smallEjj = private unnamed_addr constant [137 x i8] c"static IntType boost::random::const_mod<unsigned int, 2147483647>::mult_small(IntType, IntType) [IntType = unsigned int, m = 2147483647]\00", align 1
@.str11 = private unnamed_addr constant [14 x i8] c"_x >= (min)()\00", align 1
@.str12 = private unnamed_addr constant [63 x i8] c"/home/thomas/boost_1_52_0/boost/random/linear_congruential.hpp\00", align 1
@__PRETTY_FUNCTION__._ZN5boost6random26linear_congruential_engineIjLj48271ELj0ELj2147483647EE4seedERKj = private unnamed_addr constant [165 x i8] c"void boost::random::linear_congruential_engine<unsigned int, 48271, 0, 2147483647>::seed(const IntType &) [IntType = unsigned int, a = 48271, c = 0, m = 2147483647]\00", align 1
@.str13 = private unnamed_addr constant [14 x i8] c"_x <= (max)()\00", align 1
@.str14 = private unnamed_addr constant [12 x i8] c"divisor > 0\00", align 1
@.str15 = private unnamed_addr constant [69 x i8] c"/home/thomas/boost_1_52_0/boost/random/uniform_real_distribution.hpp\00", align 1
@__PRETTY_FUNCTION__._ZN5boost6random6detail21generate_uniform_realINS0_26linear_congruential_engineIjLj48271ELj0ELj2147483647EEEdEET0_RT_S5_S5_N4mpl_5bool_ILb1EEE = private unnamed_addr constant [183 x i8] c"T boost::random::detail::generate_uniform_real(Engine &, T, T, boost::mpl::true_) [Engine = boost::random::linear_congruential_engine<unsigned int, 48271, 0, 2147483647>, T = double]\00", align 1
@.str16 = private unnamed_addr constant [39 x i8] c"numerator >= 0 && numerator <= divisor\00", align 1
@.str17 = private unnamed_addr constant [19 x i8] c"min_arg <= max_arg\00", align 1
@.str18 = private unnamed_addr constant [56 x i8] c"/home/thomas/boost_1_52_0/boost/random/uniform_real.hpp\00", align 1
@__PRETTY_FUNCTION__._ZN5boost12uniform_realIdEC2Edd = private unnamed_addr constant [82 x i8] c"boost::uniform_real<double>::uniform_real(RealType, RealType) [RealType = double]\00", align 1
@__PRETTY_FUNCTION__._ZN5boost6random25uniform_real_distributionIdEC2Edd = private unnamed_addr constant [116 x i8] c"boost::random::uniform_real_distribution<double>::uniform_real_distribution(RealType, RealType) [RealType = double]\00", align 1
@.str19 = private unnamed_addr constant [68 x i8] c"/home/thomas/boost_1_52_0/boost/random/uniform_int_distribution.hpp\00", align 1
@__PRETTY_FUNCTION__._ZN5boost6random24uniform_int_distributionIiEC2Eii = private unnamed_addr constant [105 x i8] c"boost::random::uniform_int_distribution<int>::uniform_int_distribution(IntType, IntType) [IntType = int]\00", align 1
@llvm.global_ctors = appending global [1 x { i32, void ()* }] [{ i32, void ()* } { i32 65535, void ()* @_GLOBAL__I_a }]

define internal void @__cxx_global_var_init() section ".text.startup" {
entry:
  call void @_ZNSt8ios_base4InitC1Ev(%"class.std::ios_base::Init"* @_ZStL8__ioinit)
  %0 = call i32 @__cxa_atexit(void (i8*)* bitcast (void (%"class.std::ios_base::Init"*)* @_ZNSt8ios_base4InitD1Ev to void (i8*)*), i8* getelementptr inbounds (%"class.std::ios_base::Init"* @_ZStL8__ioinit, i32 0, i32 0), i8* @__dso_handle) nounwind
  ret void
}

declare void @_ZNSt8ios_base4InitC1Ev(%"class.std::ios_base::Init"*)

declare void @_ZNSt8ios_base4InitD1Ev(%"class.std::ios_base::Init"*)

declare i32 @__cxa_atexit(void (i8*)*, i8*, i8*) nounwind

define void @_Z10experimentRN5boost6random26linear_congruential_engineIjLj48271ELj0ELj2147483647EEE(%"class.boost::random::linear_congruential_engine"* %generator) {
entry:
  %generator.addr = alloca %"class.boost::random::linear_congruential_engine"*, align 4
  %die_gen = alloca %"class.boost::random::variate_generator", align 4
  %agg.tmp = alloca %"class.boost::uniform_int", align 4
  %die = alloca %"class.boost::generator_iterator", align 4
  %i = alloca i32, align 4
  %tmp = alloca %"class.boost::detail::postfix_increment_proxy", align 4
  store %"class.boost::random::linear_congruential_engine"* %generator, %"class.boost::random::linear_congruential_engine"** %generator.addr, align 4
  %0 = load %"class.boost::random::linear_congruential_engine"** %generator.addr, align 4
  call void @_ZN5boost11uniform_intIiEC1Eii(%"class.boost::uniform_int"* %agg.tmp, i32 1, i32 6)
  call void @_ZN5boost6random17variate_generatorIRNS0_26linear_congruential_engineIjLj48271ELj0ELj2147483647EEENS_11uniform_intIiEEEC1ES4_S6_(%"class.boost::random::variate_generator"* %die_gen, %"class.boost::random::linear_congruential_engine"* %0, %"class.boost::uniform_int"* byval align 4 %agg.tmp)
  call void @_ZN5boost18generator_iteratorINS_6random17variate_generatorIRNS1_26linear_congruential_engineIjLj48271ELj0ELj2147483647EEENS_11uniform_intIiEEEEEC1EPS8_(%"class.boost::generator_iterator"* %die, %"class.boost::random::variate_generator"* %die_gen)
  store i32 0, i32* %i, align 4
  br label %for.cond

for.cond:                                         ; preds = %for.inc, %entry
  %1 = load i32* %i, align 4
  %cmp = icmp slt i32 %1, 10
  br i1 %cmp, label %for.body, label %for.end

for.body:                                         ; preds = %for.cond
  %2 = bitcast %"class.boost::generator_iterator"* %die to %"class.boost::iterator_facade"*
  call void @_ZN5boostppINS_18generator_iteratorINS_6random17variate_generatorIRNS2_26linear_congruential_engineIjLj48271ELj0ELj2147483647EEENS_11uniform_intIiEEEEEEiNS_25single_pass_traversal_tagERKiiEENS_6detail24postfix_increment_resultIT_T0_T2_T1_E4typeERNS_15iterator_facadeISG_SH_SJ_SI_T3_EEi(%"class.boost::detail::postfix_increment_proxy"* sret %tmp, %"class.boost::iterator_facade"* %2, i32 0)
  %call = call i32* @_ZNK5boost6detail23postfix_increment_proxyINS_18generator_iteratorINS_6random17variate_generatorIRNS3_26linear_congruential_engineIjLj48271ELj0ELj2147483647EEENS_11uniform_intIiEEEEEEEdeEv(%"class.boost::detail::postfix_increment_proxy"* %tmp)
  %3 = load i32* %call
  %call1 = call %"class.std::basic_ostream"* @_ZNSolsEi(%"class.std::basic_ostream"* @_ZSt4cout, i32 %3)
  %call2 = call %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* %call1, i8* getelementptr inbounds ([2 x i8]* @.str, i32 0, i32 0))
  br label %for.inc

for.inc:                                          ; preds = %for.body
  %4 = load i32* %i, align 4
  %inc = add nsw i32 %4, 1
  store i32 %inc, i32* %i, align 4
  br label %for.cond

for.end:                                          ; preds = %for.cond
  %call3 = call %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_c(%"class.std::basic_ostream"* @_ZSt4cout, i8 signext 10)
  ret void
}

define linkonce_odr void @_ZN5boost6random17variate_generatorIRNS0_26linear_congruential_engineIjLj48271ELj0ELj2147483647EEENS_11uniform_intIiEEEC1ES4_S6_(%"class.boost::random::variate_generator"* %this, %"class.boost::random::linear_congruential_engine"* %e, %"class.boost::uniform_int"* byval align 4 %d) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::random::variate_generator"*, align 4
  %e.addr = alloca %"class.boost::random::linear_congruential_engine"*, align 4
  store %"class.boost::random::variate_generator"* %this, %"class.boost::random::variate_generator"** %this.addr, align 4
  store %"class.boost::random::linear_congruential_engine"* %e, %"class.boost::random::linear_congruential_engine"** %e.addr, align 4
  %this1 = load %"class.boost::random::variate_generator"** %this.addr
  %0 = load %"class.boost::random::linear_congruential_engine"** %e.addr
  call void @_ZN5boost6random17variate_generatorIRNS0_26linear_congruential_engineIjLj48271ELj0ELj2147483647EEENS_11uniform_intIiEEEC2ES4_S6_(%"class.boost::random::variate_generator"* %this1, %"class.boost::random::linear_congruential_engine"* %0, %"class.boost::uniform_int"* byval align 4 %d)
  ret void
}

define linkonce_odr void @_ZN5boost11uniform_intIiEC1Eii(%"class.boost::uniform_int"* %this, i32 %min_arg, i32 %max_arg) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::uniform_int"*, align 4
  %min_arg.addr = alloca i32, align 4
  %max_arg.addr = alloca i32, align 4
  store %"class.boost::uniform_int"* %this, %"class.boost::uniform_int"** %this.addr, align 4
  store i32 %min_arg, i32* %min_arg.addr, align 4
  store i32 %max_arg, i32* %max_arg.addr, align 4
  %this1 = load %"class.boost::uniform_int"** %this.addr
  %0 = load i32* %min_arg.addr, align 4
  %1 = load i32* %max_arg.addr, align 4
  call void @_ZN5boost11uniform_intIiEC2Eii(%"class.boost::uniform_int"* %this1, i32 %0, i32 %1)
  ret void
}

define linkonce_odr void @_ZN5boost18generator_iteratorINS_6random17variate_generatorIRNS1_26linear_congruential_engineIjLj48271ELj0ELj2147483647EEENS_11uniform_intIiEEEEEC1EPS8_(%"class.boost::generator_iterator"* %this, %"class.boost::random::variate_generator"* %g) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::generator_iterator"*, align 4
  %g.addr = alloca %"class.boost::random::variate_generator"*, align 4
  store %"class.boost::generator_iterator"* %this, %"class.boost::generator_iterator"** %this.addr, align 4
  store %"class.boost::random::variate_generator"* %g, %"class.boost::random::variate_generator"** %g.addr, align 4
  %this1 = load %"class.boost::generator_iterator"** %this.addr
  %0 = load %"class.boost::random::variate_generator"** %g.addr, align 4
  call void @_ZN5boost18generator_iteratorINS_6random17variate_generatorIRNS1_26linear_congruential_engineIjLj48271ELj0ELj2147483647EEENS_11uniform_intIiEEEEEC2EPS8_(%"class.boost::generator_iterator"* %this1, %"class.boost::random::variate_generator"* %0)
  ret void
}

declare %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"*, i8*)

declare %"class.std::basic_ostream"* @_ZNSolsEi(%"class.std::basic_ostream"*, i32)

define linkonce_odr void @_ZN5boostppINS_18generator_iteratorINS_6random17variate_generatorIRNS2_26linear_congruential_engineIjLj48271ELj0ELj2147483647EEENS_11uniform_intIiEEEEEEiNS_25single_pass_traversal_tagERKiiEENS_6detail24postfix_increment_resultIT_T0_T2_T1_E4typeERNS_15iterator_facadeISG_SH_SJ_SI_T3_EEi(%"class.boost::detail::postfix_increment_proxy"* noalias sret %agg.result, %"class.boost::iterator_facade"* %i, i32) inlinehint {
entry:
  %i.addr = alloca %"class.boost::iterator_facade"*, align 4
  %.addr = alloca i32, align 4
  store %"class.boost::iterator_facade"* %i, %"class.boost::iterator_facade"** %i.addr, align 4
  store i32 %0, i32* %.addr, align 4
  %1 = load %"class.boost::iterator_facade"** %i.addr, align 4
  %2 = bitcast %"class.boost::iterator_facade"* %1 to %"class.boost::generator_iterator"*
  call void @_ZN5boost6detail23postfix_increment_proxyINS_18generator_iteratorINS_6random17variate_generatorIRNS3_26linear_congruential_engineIjLj48271ELj0ELj2147483647EEENS_11uniform_intIiEEEEEEEC1ERKSB_(%"class.boost::detail::postfix_increment_proxy"* %agg.result, %"class.boost::generator_iterator"* %2)
  %3 = load %"class.boost::iterator_facade"** %i.addr, align 4
  %call = call %"class.boost::generator_iterator"* @_ZN5boost15iterator_facadeINS_18generator_iteratorINS_6random17variate_generatorIRNS2_26linear_congruential_engineIjLj48271ELj0ELj2147483647EEENS_11uniform_intIiEEEEEEiNS_25single_pass_traversal_tagERKiiEppEv(%"class.boost::iterator_facade"* %3)
  ret void
}

define linkonce_odr i32* @_ZNK5boost6detail23postfix_increment_proxyINS_18generator_iteratorINS_6random17variate_generatorIRNS3_26linear_congruential_engineIjLj48271ELj0ELj2147483647EEENS_11uniform_intIiEEEEEEEdeEv(%"class.boost::detail::postfix_increment_proxy"* %this) nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::detail::postfix_increment_proxy"*, align 4
  store %"class.boost::detail::postfix_increment_proxy"* %this, %"class.boost::detail::postfix_increment_proxy"** %this.addr, align 4
  %this1 = load %"class.boost::detail::postfix_increment_proxy"** %this.addr
  %stored_value = getelementptr inbounds %"class.boost::detail::postfix_increment_proxy"* %this1, i32 0, i32 0
  ret i32* %stored_value
}

declare %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_c(%"class.std::basic_ostream"*, i8 signext)

define i32 @main() {
entry:
  %retval = alloca i32, align 4
  %generator = alloca %"class.boost::random::linear_congruential_engine", align 4
  %ref.tmp = alloca i32, align 4
  %uni_dist = alloca %"class.boost::uniform_real", align 4
  %uni = alloca %"class.boost::random::variate_generator.0", align 4
  %agg.tmp = alloca %"class.boost::uniform_real", align 4
  %i = alloca i32, align 4
  %ref.tmp6 = alloca i32, align 4
  %saved_generator = alloca %"class.boost::random::linear_congruential_engine", align 4
  %degen_dist = alloca %"class.boost::uniform_int", align 4
  %deg = alloca %"class.boost::random::variate_generator", align 4
  %agg.tmp10 = alloca %"class.boost::uniform_int", align 4
  %file = alloca %"class.std::basic_ofstream", align 4
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  store i32 0, i32* %retval
  store i32 42, i32* %ref.tmp, align 4
  call void @_ZN5boost6random26linear_congruential_engineIjLj48271ELj0ELj2147483647EEC1ERKj(%"class.boost::random::linear_congruential_engine"* %generator, i32* %ref.tmp)
  %call = call %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* @_ZSt4cout, i8* getelementptr inbounds ([49 x i8]* @.str1, i32 0, i32 0))
  call void @_ZN5boost12uniform_realIdEC1Edd(%"class.boost::uniform_real"* %uni_dist, double 0.000000e+00, double 1.000000e+00)
  %0 = bitcast %"class.boost::uniform_real"* %agg.tmp to i8*
  %1 = bitcast %"class.boost::uniform_real"* %uni_dist to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %0, i8* %1, i32 16, i32 4, i1 false)
  call void @_ZN5boost6random17variate_generatorIRNS0_26linear_congruential_engineIjLj48271ELj0ELj2147483647EEENS_12uniform_realIdEEEC1ES4_S6_(%"class.boost::random::variate_generator.0"* %uni, %"class.boost::random::linear_congruential_engine"* %generator, %"class.boost::uniform_real"* byval align 4 %agg.tmp)
  %vtable = load i8** bitcast (%"class.std::basic_ostream"* @_ZSt4cout to i8**)
  %vbase.offset.ptr = getelementptr i8* %vtable, i64 -12
  %2 = bitcast i8* %vbase.offset.ptr to i32*
  %vbase.offset = load i32* %2
  %add.ptr = getelementptr inbounds i8* bitcast (%"class.std::basic_ostream"* @_ZSt4cout to i8*), i32 %vbase.offset
  %3 = bitcast i8* %add.ptr to %"class.std::ios_base"*
  %call1 = call i32 @_ZNSt8ios_base4setfESt13_Ios_Fmtflags(%"class.std::ios_base"* %3, i32 4)
  store i32 0, i32* %i, align 4
  br label %for.cond

for.cond:                                         ; preds = %for.inc, %entry
  %4 = load i32* %i, align 4
  %cmp = icmp slt i32 %4, 10
  br i1 %cmp, label %for.body, label %for.end

for.body:                                         ; preds = %for.cond
  %call2 = call double @_ZN5boost6random17variate_generatorIRNS0_26linear_congruential_engineIjLj48271ELj0ELj2147483647EEENS_12uniform_realIdEEEclEv(%"class.boost::random::variate_generator.0"* %uni)
  %call3 = call %"class.std::basic_ostream"* @_ZNSolsEd(%"class.std::basic_ostream"* @_ZSt4cout, double %call2)
  %call4 = call %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_c(%"class.std::basic_ostream"* %call3, i8 signext 10)
  br label %for.inc

for.inc:                                          ; preds = %for.body
  %5 = load i32* %i, align 4
  %inc = add nsw i32 %5, 1
  store i32 %inc, i32* %i, align 4
  br label %for.cond

for.end:                                          ; preds = %for.cond
  %call5 = call i32 @time(i32* null) nounwind
  store i32 %call5, i32* %ref.tmp6, align 4
  call void @_ZN5boost6random26linear_congruential_engineIjLj48271ELj0ELj2147483647EE4seedERKj(%"class.boost::random::linear_congruential_engine"* %generator, i32* %ref.tmp6)
  %call7 = call %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* @_ZSt4cout, i8* getelementptr inbounds ([35 x i8]* @.str2, i32 0, i32 0))
  %6 = bitcast %"class.boost::random::linear_congruential_engine"* %saved_generator to i8*
  %7 = bitcast %"class.boost::random::linear_congruential_engine"* %generator to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %6, i8* %7, i32 4, i32 4, i1 false)
  call void @_Z10experimentRN5boost6random26linear_congruential_engineIjLj48271ELj0ELj2147483647EEE(%"class.boost::random::linear_congruential_engine"* %generator)
  %call8 = call %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* @_ZSt4cout, i8* getelementptr inbounds ([35 x i8]* @.str3, i32 0, i32 0))
  call void @_Z10experimentRN5boost6random26linear_congruential_engineIjLj48271ELj0ELj2147483647EEE(%"class.boost::random::linear_congruential_engine"* %saved_generator)
  %call9 = call zeroext i1 @_ZN5boost6randomeqERKNS0_26linear_congruential_engineIjLj48271ELj0ELj2147483647EEES4_(%"class.boost::random::linear_congruential_engine"* %generator, %"class.boost::random::linear_congruential_engine"* %saved_generator)
  br i1 %call9, label %cond.true, label %cond.false

cond.true:                                        ; preds = %for.end
  br label %cond.end

cond.false:                                       ; preds = %for.end
  call void @__assert_fail(i8* getelementptr inbounds ([29 x i8]* @.str4, i32 0, i32 0), i8* getelementptr inbounds ([16 x i8]* @.str5, i32 0, i32 0), i32 95, i8* getelementptr inbounds ([11 x i8]* @__PRETTY_FUNCTION__.main, i32 0, i32 0)) noreturn nounwind
  unreachable
                                                  ; No predecessors!
  br label %cond.end

cond.end:                                         ; preds = %8, %cond.true
  call void @_ZN5boost11uniform_intIiEC1Eii(%"class.boost::uniform_int"* %degen_dist, i32 4, i32 4)
  %9 = bitcast %"class.boost::uniform_int"* %agg.tmp10 to i8*
  %10 = bitcast %"class.boost::uniform_int"* %degen_dist to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %9, i8* %10, i32 8, i32 4, i1 false)
  call void @_ZN5boost6random17variate_generatorIRNS0_26linear_congruential_engineIjLj48271ELj0ELj2147483647EEENS_11uniform_intIiEEEC1ES4_S6_(%"class.boost::random::variate_generator"* %deg, %"class.boost::random::linear_congruential_engine"* %generator, %"class.boost::uniform_int"* byval align 4 %agg.tmp10)
  %call11 = call i32 @_ZN5boost6random17variate_generatorIRNS0_26linear_congruential_engineIjLj48271ELj0ELj2147483647EEENS_11uniform_intIiEEEclEv(%"class.boost::random::variate_generator"* %deg)
  %call12 = call %"class.std::basic_ostream"* @_ZNSolsEi(%"class.std::basic_ostream"* @_ZSt4cout, i32 %call11)
  %call13 = call %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* %call12, i8* getelementptr inbounds ([2 x i8]* @.str, i32 0, i32 0))
  %call14 = call i32 @_ZN5boost6random17variate_generatorIRNS0_26linear_congruential_engineIjLj48271ELj0ELj2147483647EEENS_11uniform_intIiEEEclEv(%"class.boost::random::variate_generator"* %deg)
  %call15 = call %"class.std::basic_ostream"* @_ZNSolsEi(%"class.std::basic_ostream"* %call13, i32 %call14)
  %call16 = call %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* %call15, i8* getelementptr inbounds ([2 x i8]* @.str, i32 0, i32 0))
  %call17 = call i32 @_ZN5boost6random17variate_generatorIRNS0_26linear_congruential_engineIjLj48271ELj0ELj2147483647EEENS_11uniform_intIiEEEclEv(%"class.boost::random::variate_generator"* %deg)
  %call18 = call %"class.std::basic_ostream"* @_ZNSolsEi(%"class.std::basic_ostream"* %call16, i32 %call17)
  %call19 = call %"class.std::basic_ostream"* @_ZNSolsEPFRSoS_E(%"class.std::basic_ostream"* %call18, %"class.std::basic_ostream"* (%"class.std::basic_ostream"*)* @_ZSt4endlIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_)
  call void @_ZNSt14basic_ofstreamIcSt11char_traitsIcEEC1EPKcSt13_Ios_Openmode(%"class.std::basic_ofstream"* %file, i8* getelementptr inbounds ([10 x i8]* @.str6, i32 0, i32 0), i32 32)
  %11 = bitcast %"class.std::basic_ofstream"* %file to %"class.std::basic_ostream"*
  %call20 = invoke %"class.std::basic_ostream"* @_ZN5boost6randomlsIcSt11char_traitsIcEEERSt13basic_ostreamIT_T0_ES8_RKNS0_26linear_congruential_engineIjLj48271ELj0ELj2147483647EEE(%"class.std::basic_ostream"* %11, %"class.boost::random::linear_congruential_engine"* %generator)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %cond.end
  call void @_ZNSt14basic_ofstreamIcSt11char_traitsIcEED1Ev(%"class.std::basic_ofstream"* %file)
  ret i32 0

lpad:                                             ; preds = %cond.end
  %12 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %13 = extractvalue { i8*, i32 } %12, 0
  store i8* %13, i8** %exn.slot
  %14 = extractvalue { i8*, i32 } %12, 1
  store i32 %14, i32* %ehselector.slot
  invoke void @_ZNSt14basic_ofstreamIcSt11char_traitsIcEED1Ev(%"class.std::basic_ofstream"* %file)
          to label %invoke.cont21 unwind label %terminate.lpad

invoke.cont21:                                    ; preds = %lpad
  br label %eh.resume

eh.resume:                                        ; preds = %invoke.cont21
  %exn = load i8** %exn.slot
  %sel = load i32* %ehselector.slot
  %lpad.val = insertvalue { i8*, i32 } undef, i8* %exn, 0
  %lpad.val22 = insertvalue { i8*, i32 } %lpad.val, i32 %sel, 1
  resume { i8*, i32 } %lpad.val22

terminate.lpad:                                   ; preds = %lpad
  %15 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          catch i8* null
  call void @_ZSt9terminatev() noreturn nounwind
  unreachable
}

define linkonce_odr void @_ZN5boost6random26linear_congruential_engineIjLj48271ELj0ELj2147483647EEC1ERKj(%"class.boost::random::linear_congruential_engine"* %this, i32* %x0) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::random::linear_congruential_engine"*, align 4
  %x0.addr = alloca i32*, align 4
  store %"class.boost::random::linear_congruential_engine"* %this, %"class.boost::random::linear_congruential_engine"** %this.addr, align 4
  store i32* %x0, i32** %x0.addr, align 4
  %this1 = load %"class.boost::random::linear_congruential_engine"** %this.addr
  %0 = load i32** %x0.addr
  call void @_ZN5boost6random26linear_congruential_engineIjLj48271ELj0ELj2147483647EEC2ERKj(%"class.boost::random::linear_congruential_engine"* %this1, i32* %0)
  ret void
}

define linkonce_odr void @_ZN5boost12uniform_realIdEC1Edd(%"class.boost::uniform_real"* %this, double %min_arg, double %max_arg) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::uniform_real"*, align 4
  %min_arg.addr = alloca double, align 8
  %max_arg.addr = alloca double, align 8
  store %"class.boost::uniform_real"* %this, %"class.boost::uniform_real"** %this.addr, align 4
  store double %min_arg, double* %min_arg.addr, align 8
  store double %max_arg, double* %max_arg.addr, align 8
  %this1 = load %"class.boost::uniform_real"** %this.addr
  %0 = load double* %min_arg.addr, align 8
  %1 = load double* %max_arg.addr, align 8
  call void @_ZN5boost12uniform_realIdEC2Edd(%"class.boost::uniform_real"* %this1, double %0, double %1)
  ret void
}

define linkonce_odr void @_ZN5boost6random17variate_generatorIRNS0_26linear_congruential_engineIjLj48271ELj0ELj2147483647EEENS_12uniform_realIdEEEC1ES4_S6_(%"class.boost::random::variate_generator.0"* %this, %"class.boost::random::linear_congruential_engine"* %e, %"class.boost::uniform_real"* byval align 4 %d) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::random::variate_generator.0"*, align 4
  %e.addr = alloca %"class.boost::random::linear_congruential_engine"*, align 4
  store %"class.boost::random::variate_generator.0"* %this, %"class.boost::random::variate_generator.0"** %this.addr, align 4
  store %"class.boost::random::linear_congruential_engine"* %e, %"class.boost::random::linear_congruential_engine"** %e.addr, align 4
  %this1 = load %"class.boost::random::variate_generator.0"** %this.addr
  %0 = load %"class.boost::random::linear_congruential_engine"** %e.addr
  call void @_ZN5boost6random17variate_generatorIRNS0_26linear_congruential_engineIjLj48271ELj0ELj2147483647EEENS_12uniform_realIdEEEC2ES4_S6_(%"class.boost::random::variate_generator.0"* %this1, %"class.boost::random::linear_congruential_engine"* %0, %"class.boost::uniform_real"* byval align 4 %d)
  ret void
}

declare void @llvm.memcpy.p0i8.p0i8.i32(i8* nocapture, i8* nocapture, i32, i32, i1) nounwind

define linkonce_odr i32 @_ZNSt8ios_base4setfESt13_Ios_Fmtflags(%"class.std::ios_base"* %this, i32 %__fmtfl) align 2 {
entry:
  %this.addr = alloca %"class.std::ios_base"*, align 4
  %__fmtfl.addr = alloca i32, align 4
  %__old = alloca i32, align 4
  store %"class.std::ios_base"* %this, %"class.std::ios_base"** %this.addr, align 4
  store i32 %__fmtfl, i32* %__fmtfl.addr, align 4
  %this1 = load %"class.std::ios_base"** %this.addr
  %_M_flags = getelementptr inbounds %"class.std::ios_base"* %this1, i32 0, i32 3
  %0 = load i32* %_M_flags, align 4
  store i32 %0, i32* %__old, align 4
  %_M_flags2 = getelementptr inbounds %"class.std::ios_base"* %this1, i32 0, i32 3
  %1 = load i32* %__fmtfl.addr, align 4
  %call = call i32* @_ZStoRRSt13_Ios_FmtflagsS_(i32* %_M_flags2, i32 %1)
  %2 = load i32* %__old, align 4
  ret i32 %2
}

declare %"class.std::basic_ostream"* @_ZNSolsEd(%"class.std::basic_ostream"*, double)

define linkonce_odr double @_ZN5boost6random17variate_generatorIRNS0_26linear_congruential_engineIjLj48271ELj0ELj2147483647EEENS_12uniform_realIdEEEclEv(%"class.boost::random::variate_generator.0"* %this) align 2 {
entry:
  %this.addr = alloca %"class.boost::random::variate_generator.0"*, align 4
  store %"class.boost::random::variate_generator.0"* %this, %"class.boost::random::variate_generator.0"** %this.addr, align 4
  %this1 = load %"class.boost::random::variate_generator.0"** %this.addr
  %_dist = getelementptr inbounds %"class.boost::random::variate_generator.0"* %this1, i32 0, i32 1
  %0 = bitcast %"class.boost::uniform_real"* %_dist to %"class.boost::random::uniform_real_distribution"*
  %call = call %"class.boost::random::linear_congruential_engine"* @_ZN5boost6random17variate_generatorIRNS0_26linear_congruential_engineIjLj48271ELj0ELj2147483647EEENS_12uniform_realIdEEE6engineEv(%"class.boost::random::variate_generator.0"* %this1)
  %call2 = call double @_ZNK5boost6random25uniform_real_distributionIdEclINS0_26linear_congruential_engineIjLj48271ELj0ELj2147483647EEEEEdRT_(%"class.boost::random::uniform_real_distribution"* %0, %"class.boost::random::linear_congruential_engine"* %call)
  ret double %call2
}

define linkonce_odr void @_ZN5boost6random26linear_congruential_engineIjLj48271ELj0ELj2147483647EE4seedERKj(%"class.boost::random::linear_congruential_engine"* %this, i32* %x0) nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::random::linear_congruential_engine"*, align 4
  %x0.addr = alloca i32*, align 4
  store %"class.boost::random::linear_congruential_engine"* %this, %"class.boost::random::linear_congruential_engine"** %this.addr, align 4
  store i32* %x0, i32** %x0.addr, align 4
  %this1 = load %"class.boost::random::linear_congruential_engine"** %this.addr
  %0 = load i32** %x0.addr, align 4
  %1 = load i32* %0, align 4
  %rem = urem i32 %1, 2147483647
  %_x = getelementptr inbounds %"class.boost::random::linear_congruential_engine"* %this1, i32 0, i32 0
  store i32 %rem, i32* %_x, align 4
  %_x2 = getelementptr inbounds %"class.boost::random::linear_congruential_engine"* %this1, i32 0, i32 0
  %2 = load i32* %_x2, align 4
  %cmp = icmp ule i32 %2, 0
  br i1 %cmp, label %land.lhs.true, label %if.end

land.lhs.true:                                    ; preds = %entry
  %_x3 = getelementptr inbounds %"class.boost::random::linear_congruential_engine"* %this1, i32 0, i32 0
  %3 = load i32* %_x3, align 4
  %cmp4 = icmp ne i32 %3, 0
  br i1 %cmp4, label %if.then, label %if.end

if.then:                                          ; preds = %land.lhs.true
  %_x5 = getelementptr inbounds %"class.boost::random::linear_congruential_engine"* %this1, i32 0, i32 0
  %4 = load i32* %_x5, align 4
  %add = add i32 %4, 2147483647
  store i32 %add, i32* %_x5, align 4
  br label %if.end

if.end:                                           ; preds = %if.then, %land.lhs.true, %entry
  %_x6 = getelementptr inbounds %"class.boost::random::linear_congruential_engine"* %this1, i32 0, i32 0
  %5 = load i32* %_x6, align 4
  %cmp7 = icmp eq i32 %5, 0
  br i1 %cmp7, label %if.then8, label %if.end10

if.then8:                                         ; preds = %if.end
  %_x9 = getelementptr inbounds %"class.boost::random::linear_congruential_engine"* %this1, i32 0, i32 0
  store i32 1, i32* %_x9, align 4
  br label %if.end10

if.end10:                                         ; preds = %if.then8, %if.end
  %_x11 = getelementptr inbounds %"class.boost::random::linear_congruential_engine"* %this1, i32 0, i32 0
  %6 = load i32* %_x11, align 4
  %call = call i32 @_ZN5boost6random26linear_congruential_engineIjLj48271ELj0ELj2147483647EE3minEv()
  %cmp12 = icmp uge i32 %6, %call
  br i1 %cmp12, label %cond.true, label %cond.false

cond.true:                                        ; preds = %if.end10
  br label %cond.end

cond.false:                                       ; preds = %if.end10
  call void @__assert_fail(i8* getelementptr inbounds ([14 x i8]* @.str11, i32 0, i32 0), i8* getelementptr inbounds ([63 x i8]* @.str12, i32 0, i32 0), i32 143, i8* getelementptr inbounds ([165 x i8]* @__PRETTY_FUNCTION__._ZN5boost6random26linear_congruential_engineIjLj48271ELj0ELj2147483647EE4seedERKj, i32 0, i32 0)) noreturn nounwind
  unreachable
                                                  ; No predecessors!
  br label %cond.end

cond.end:                                         ; preds = %7, %cond.true
  %_x13 = getelementptr inbounds %"class.boost::random::linear_congruential_engine"* %this1, i32 0, i32 0
  %8 = load i32* %_x13, align 4
  %call14 = call i32 @_ZN5boost6random26linear_congruential_engineIjLj48271ELj0ELj2147483647EE3maxEv()
  %cmp15 = icmp ule i32 %8, %call14
  br i1 %cmp15, label %cond.true16, label %cond.false17

cond.true16:                                      ; preds = %cond.end
  br label %cond.end18

cond.false17:                                     ; preds = %cond.end
  call void @__assert_fail(i8* getelementptr inbounds ([14 x i8]* @.str13, i32 0, i32 0), i8* getelementptr inbounds ([63 x i8]* @.str12, i32 0, i32 0), i32 144, i8* getelementptr inbounds ([165 x i8]* @__PRETTY_FUNCTION__._ZN5boost6random26linear_congruential_engineIjLj48271ELj0ELj2147483647EE4seedERKj, i32 0, i32 0)) noreturn nounwind
  unreachable
                                                  ; No predecessors!
  br label %cond.end18

cond.end18:                                       ; preds = %9, %cond.true16
  ret void
}

declare i32 @time(i32*) nounwind

define linkonce_odr zeroext i1 @_ZN5boost6randomeqERKNS0_26linear_congruential_engineIjLj48271ELj0ELj2147483647EEES4_(%"class.boost::random::linear_congruential_engine"* %x, %"class.boost::random::linear_congruential_engine"* %y) nounwind {
entry:
  %x.addr = alloca %"class.boost::random::linear_congruential_engine"*, align 4
  %y.addr = alloca %"class.boost::random::linear_congruential_engine"*, align 4
  store %"class.boost::random::linear_congruential_engine"* %x, %"class.boost::random::linear_congruential_engine"** %x.addr, align 4
  store %"class.boost::random::linear_congruential_engine"* %y, %"class.boost::random::linear_congruential_engine"** %y.addr, align 4
  %0 = load %"class.boost::random::linear_congruential_engine"** %x.addr, align 4
  %_x = getelementptr inbounds %"class.boost::random::linear_congruential_engine"* %0, i32 0, i32 0
  %1 = load i32* %_x, align 4
  %2 = load %"class.boost::random::linear_congruential_engine"** %y.addr, align 4
  %_x1 = getelementptr inbounds %"class.boost::random::linear_congruential_engine"* %2, i32 0, i32 0
  %3 = load i32* %_x1, align 4
  %cmp = icmp eq i32 %1, %3
  ret i1 %cmp
}

declare void @__assert_fail(i8*, i8*, i32, i8*) noreturn nounwind

define linkonce_odr i32 @_ZN5boost6random17variate_generatorIRNS0_26linear_congruential_engineIjLj48271ELj0ELj2147483647EEENS_11uniform_intIiEEEclEv(%"class.boost::random::variate_generator"* %this) align 2 {
entry:
  %this.addr = alloca %"class.boost::random::variate_generator"*, align 4
  store %"class.boost::random::variate_generator"* %this, %"class.boost::random::variate_generator"** %this.addr, align 4
  %this1 = load %"class.boost::random::variate_generator"** %this.addr
  %_dist = getelementptr inbounds %"class.boost::random::variate_generator"* %this1, i32 0, i32 1
  %call = call %"class.boost::random::linear_congruential_engine"* @_ZN5boost6random17variate_generatorIRNS0_26linear_congruential_engineIjLj48271ELj0ELj2147483647EEENS_11uniform_intIiEEE6engineEv(%"class.boost::random::variate_generator"* %this1)
  %call2 = call i32 @_ZNK5boost11uniform_intIiEclINS_6random26linear_congruential_engineIjLj48271ELj0ELj2147483647EEEEEiRT_(%"class.boost::uniform_int"* %_dist, %"class.boost::random::linear_congruential_engine"* %call)
  ret i32 %call2
}

declare %"class.std::basic_ostream"* @_ZNSolsEPFRSoS_E(%"class.std::basic_ostream"*, %"class.std::basic_ostream"* (%"class.std::basic_ostream"*)*)

declare %"class.std::basic_ostream"* @_ZSt4endlIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_(%"class.std::basic_ostream"*)

declare void @_ZNSt14basic_ofstreamIcSt11char_traitsIcEEC1EPKcSt13_Ios_Openmode(%"class.std::basic_ofstream"*, i8*, i32)

define linkonce_odr %"class.std::basic_ostream"* @_ZN5boost6randomlsIcSt11char_traitsIcEEERSt13basic_ostreamIT_T0_ES8_RKNS0_26linear_congruential_engineIjLj48271ELj0ELj2147483647EEE(%"class.std::basic_ostream"* %os, %"class.boost::random::linear_congruential_engine"* %lcg) {
entry:
  %os.addr = alloca %"class.std::basic_ostream"*, align 4
  %lcg.addr = alloca %"class.boost::random::linear_congruential_engine"*, align 4
  store %"class.std::basic_ostream"* %os, %"class.std::basic_ostream"** %os.addr, align 4
  store %"class.boost::random::linear_congruential_engine"* %lcg, %"class.boost::random::linear_congruential_engine"** %lcg.addr, align 4
  %0 = load %"class.std::basic_ostream"** %os.addr, align 4
  %1 = load %"class.boost::random::linear_congruential_engine"** %lcg.addr, align 4
  %_x = getelementptr inbounds %"class.boost::random::linear_congruential_engine"* %1, i32 0, i32 0
  %2 = load i32* %_x, align 4
  %call = call %"class.std::basic_ostream"* @_ZNSolsEj(%"class.std::basic_ostream"* %0, i32 %2)
  ret %"class.std::basic_ostream"* %call
}

declare i32 @__gxx_personality_v0(...)

declare void @_ZNSt14basic_ofstreamIcSt11char_traitsIcEED1Ev(%"class.std::basic_ofstream"*)

declare void @_ZSt9terminatev()

declare %"class.std::basic_ostream"* @_ZNSolsEj(%"class.std::basic_ostream"*, i32)

define linkonce_odr i32 @_ZNK5boost11uniform_intIiEclINS_6random26linear_congruential_engineIjLj48271ELj0ELj2147483647EEEEEiRT_(%"class.boost::uniform_int"* %this, %"class.boost::random::linear_congruential_engine"* %eng) align 2 {
entry:
  %this.addr = alloca %"class.boost::uniform_int"*, align 4
  %eng.addr = alloca %"class.boost::random::linear_congruential_engine"*, align 4
  store %"class.boost::uniform_int"* %this, %"class.boost::uniform_int"** %this.addr, align 4
  store %"class.boost::random::linear_congruential_engine"* %eng, %"class.boost::random::linear_congruential_engine"** %eng.addr, align 4
  %this1 = load %"class.boost::uniform_int"** %this.addr
  %0 = bitcast %"class.boost::uniform_int"* %this1 to %"class.boost::random::uniform_int_distribution"*
  %1 = load %"class.boost::random::linear_congruential_engine"** %eng.addr, align 4
  %call = call i32 @_ZNK5boost6random24uniform_int_distributionIiEclINS0_26linear_congruential_engineIjLj48271ELj0ELj2147483647EEEEEiRT_(%"class.boost::random::uniform_int_distribution"* %0, %"class.boost::random::linear_congruential_engine"* %1)
  ret i32 %call
}

define linkonce_odr %"class.boost::random::linear_congruential_engine"* @_ZN5boost6random17variate_generatorIRNS0_26linear_congruential_engineIjLj48271ELj0ELj2147483647EEENS_11uniform_intIiEEE6engineEv(%"class.boost::random::variate_generator"* %this) align 2 {
entry:
  %this.addr = alloca %"class.boost::random::variate_generator"*, align 4
  store %"class.boost::random::variate_generator"* %this, %"class.boost::random::variate_generator"** %this.addr, align 4
  %this1 = load %"class.boost::random::variate_generator"** %this.addr
  %_eng = getelementptr inbounds %"class.boost::random::variate_generator"* %this1, i32 0, i32 0
  %ref = load %"class.boost::random::linear_congruential_engine"** %_eng, align 4
  %call = call %"class.boost::random::linear_congruential_engine"* @_ZN5boost6random6detail10ptr_helperIRNS0_26linear_congruential_engineIjLj48271ELj0ELj2147483647EEEE3refES5_(%"class.boost::random::linear_congruential_engine"* %ref)
  ret %"class.boost::random::linear_congruential_engine"* %call
}

define linkonce_odr %"class.boost::random::linear_congruential_engine"* @_ZN5boost6random6detail10ptr_helperIRNS0_26linear_congruential_engineIjLj48271ELj0ELj2147483647EEEE3refES5_(%"class.boost::random::linear_congruential_engine"* %r) nounwind align 2 {
entry:
  %r.addr = alloca %"class.boost::random::linear_congruential_engine"*, align 4
  store %"class.boost::random::linear_congruential_engine"* %r, %"class.boost::random::linear_congruential_engine"** %r.addr, align 4
  %0 = load %"class.boost::random::linear_congruential_engine"** %r.addr, align 4
  ret %"class.boost::random::linear_congruential_engine"* %0
}

define linkonce_odr i32 @_ZNK5boost6random24uniform_int_distributionIiEclINS0_26linear_congruential_engineIjLj48271ELj0ELj2147483647EEEEEiRT_(%"class.boost::random::uniform_int_distribution"* %this, %"class.boost::random::linear_congruential_engine"* %eng) align 2 {
entry:
  %this.addr = alloca %"class.boost::random::uniform_int_distribution"*, align 4
  %eng.addr = alloca %"class.boost::random::linear_congruential_engine"*, align 4
  store %"class.boost::random::uniform_int_distribution"* %this, %"class.boost::random::uniform_int_distribution"** %this.addr, align 4
  store %"class.boost::random::linear_congruential_engine"* %eng, %"class.boost::random::linear_congruential_engine"** %eng.addr, align 4
  %this1 = load %"class.boost::random::uniform_int_distribution"** %this.addr
  %0 = load %"class.boost::random::linear_congruential_engine"** %eng.addr, align 4
  %_min = getelementptr inbounds %"class.boost::random::uniform_int_distribution"* %this1, i32 0, i32 0
  %1 = load i32* %_min, align 4
  %_max = getelementptr inbounds %"class.boost::random::uniform_int_distribution"* %this1, i32 0, i32 1
  %2 = load i32* %_max, align 4
  %call = call i32 @_ZN5boost6random6detail20generate_uniform_intINS0_26linear_congruential_engineIjLj48271ELj0ELj2147483647EEEiEET0_RT_S5_S5_(%"class.boost::random::linear_congruential_engine"* %0, i32 %1, i32 %2)
  ret i32 %call
}

define linkonce_odr i32 @_ZN5boost6random6detail20generate_uniform_intINS0_26linear_congruential_engineIjLj48271ELj0ELj2147483647EEEiEET0_RT_S5_S5_(%"class.boost::random::linear_congruential_engine"* %eng, i32 %min_value, i32 %max_value) inlinehint {
entry:
  %eng.addr = alloca %"class.boost::random::linear_congruential_engine"*, align 4
  %min_value.addr = alloca i32, align 4
  %max_value.addr = alloca i32, align 4
  %agg.tmp = alloca %"struct.mpl_::bool_", align 1
  %ref.tmp = alloca %"struct.boost::is_integral", align 1
  store %"class.boost::random::linear_congruential_engine"* %eng, %"class.boost::random::linear_congruential_engine"** %eng.addr, align 4
  store i32 %min_value, i32* %min_value.addr, align 4
  store i32 %max_value, i32* %max_value.addr, align 4
  %0 = load %"class.boost::random::linear_congruential_engine"** %eng.addr, align 4
  %1 = load i32* %min_value.addr, align 4
  %2 = load i32* %max_value.addr, align 4
  %3 = bitcast %"struct.boost::is_integral"* %ref.tmp to %"struct.mpl_::bool_"*
  %call = call i32 @_ZN5boost6random6detail20generate_uniform_intINS0_26linear_congruential_engineIjLj48271ELj0ELj2147483647EEEiEET0_RT_S5_S5_N4mpl_5bool_ILb1EEE(%"class.boost::random::linear_congruential_engine"* %0, i32 %1, i32 %2)
  ret i32 %call
}

define linkonce_odr i32 @_ZN5boost6random6detail20generate_uniform_intINS0_26linear_congruential_engineIjLj48271ELj0ELj2147483647EEEiEET0_RT_S5_S5_N4mpl_5bool_ILb1EEE(%"class.boost::random::linear_congruential_engine"* %eng, i32 %min_value, i32 %max_value) {
entry:
  %retval = alloca i32, align 4
  %eng.addr = alloca %"class.boost::random::linear_congruential_engine"*, align 4
  %min_value.addr = alloca i32, align 4
  %max_value.addr = alloca i32, align 4
  %0 = alloca %"struct.mpl_::bool_", align 1
  %range = alloca i32, align 4
  %tmp = alloca %"struct.boost::random::detail::subtract", align 1
  %bmin = alloca i32, align 4
  %brange = alloca i32, align 4
  %tmp4 = alloca %"struct.boost::random::detail::subtract.2", align 1
  %v = alloca i32, align 4
  %tmp11 = alloca %"struct.boost::random::detail::subtract.2", align 1
  %tmp14 = alloca %"struct.boost::random::detail::add", align 1
  %limit = alloca i32, align 4
  %result = alloca i32, align 4
  %mult = alloca i32, align 4
  %tmp34 = alloca %"struct.boost::random::detail::subtract.2", align 1
  %result_increment = alloca i32, align 4
  %agg.tmp = alloca %"struct.mpl_::bool_", align 1
  %tmp61 = alloca %"struct.boost::random::detail::add", align 1
  %bucket_size = alloca i32, align 4
  %result83 = alloca i32, align 4
  %tmp84 = alloca %"struct.boost::random::detail::subtract.2", align 1
  %tmp90 = alloca %"struct.boost::random::detail::add", align 1
  store %"class.boost::random::linear_congruential_engine"* %eng, %"class.boost::random::linear_congruential_engine"** %eng.addr, align 4
  store i32 %min_value, i32* %min_value.addr, align 4
  store i32 %max_value, i32* %max_value.addr, align 4
  %1 = load i32* %max_value.addr, align 4
  %2 = load i32* %min_value.addr, align 4
  %call = call i32 @_ZN5boost6random6detail8subtractIiLb1EEclEii(%"struct.boost::random::detail::subtract"* %tmp, i32 %1, i32 %2)
  store i32 %call, i32* %range, align 4
  %3 = load %"class.boost::random::linear_congruential_engine"** %eng.addr, align 4
  %call2 = call i32 @_ZN5boost6random26linear_congruential_engineIjLj48271ELj0ELj2147483647EE3minEv()
  store i32 %call2, i32* %bmin, align 4
  %4 = load %"class.boost::random::linear_congruential_engine"** %eng.addr, align 4
  %call5 = call i32 @_ZN5boost6random26linear_congruential_engineIjLj48271ELj0ELj2147483647EE3maxEv()
  %5 = load %"class.boost::random::linear_congruential_engine"** %eng.addr, align 4
  %call6 = call i32 @_ZN5boost6random26linear_congruential_engineIjLj48271ELj0ELj2147483647EE3minEv()
  %call7 = call i32 @_ZN5boost6random6detail8subtractIjLb0EEclEjj(%"struct.boost::random::detail::subtract.2"* %tmp4, i32 %call5, i32 %call6)
  store i32 %call7, i32* %brange, align 4
  %6 = load i32* %range, align 4
  %cmp = icmp eq i32 %6, 0
  br i1 %cmp, label %if.then, label %if.else

if.then:                                          ; preds = %entry
  %7 = load i32* %min_value.addr, align 4
  store i32 %7, i32* %retval
  br label %return

if.else:                                          ; preds = %entry
  %8 = load i32* %brange, align 4
  %9 = load i32* %range, align 4
  %cmp8 = icmp eq i32 %8, %9
  br i1 %cmp8, label %if.then9, label %if.else16

if.then9:                                         ; preds = %if.else
  %10 = load %"class.boost::random::linear_congruential_engine"** %eng.addr, align 4
  %call12 = call i32 @_ZN5boost6random26linear_congruential_engineIjLj48271ELj0ELj2147483647EEclEv(%"class.boost::random::linear_congruential_engine"* %10)
  %11 = load i32* %bmin, align 4
  %call13 = call i32 @_ZN5boost6random6detail8subtractIjLb0EEclEjj(%"struct.boost::random::detail::subtract.2"* %tmp11, i32 %call12, i32 %11)
  store i32 %call13, i32* %v, align 4
  %12 = load i32* %v, align 4
  %13 = load i32* %min_value.addr, align 4
  %call15 = call i32 @_ZN5boost6random6detail3addIjiLb1EEclEji(%"struct.boost::random::detail::add"* %tmp14, i32 %12, i32 %13)
  store i32 %call15, i32* %retval
  br label %return

if.else16:                                        ; preds = %if.else
  %14 = load i32* %brange, align 4
  %15 = load i32* %range, align 4
  %cmp17 = icmp ult i32 %14, %15
  br i1 %cmp17, label %if.then18, label %if.else63

if.then18:                                        ; preds = %if.else16
  br label %for.cond

for.cond:                                         ; preds = %if.then59, %if.then56, %if.then51, %if.then18
  %16 = load i32* %range, align 4
  %call20 = call i32 @_ZNSt14numeric_limitsIjE3maxEv() nounwind
  %cmp21 = icmp eq i32 %16, %call20
  br i1 %cmp21, label %if.then22, label %if.else26

if.then22:                                        ; preds = %for.cond
  %17 = load i32* %range, align 4
  %18 = load i32* %brange, align 4
  %add = add i32 %18, 1
  %div = udiv i32 %17, %add
  store i32 %div, i32* %limit, align 4
  %19 = load i32* %range, align 4
  %20 = load i32* %brange, align 4
  %add23 = add i32 %20, 1
  %rem = urem i32 %19, %add23
  %21 = load i32* %brange, align 4
  %cmp24 = icmp eq i32 %rem, %21
  br i1 %cmp24, label %if.then25, label %if.end

if.then25:                                        ; preds = %if.then22
  %22 = load i32* %limit, align 4
  %inc = add i32 %22, 1
  store i32 %inc, i32* %limit, align 4
  br label %if.end

if.end:                                           ; preds = %if.then25, %if.then22
  br label %if.end30

if.else26:                                        ; preds = %for.cond
  %23 = load i32* %range, align 4
  %add27 = add i32 %23, 1
  %24 = load i32* %brange, align 4
  %add28 = add i32 %24, 1
  %div29 = udiv i32 %add27, %add28
  store i32 %div29, i32* %limit, align 4
  br label %if.end30

if.end30:                                         ; preds = %if.else26, %if.end
  store i32 0, i32* %result, align 4
  store i32 1, i32* %mult, align 4
  br label %while.cond

while.cond:                                       ; preds = %if.end42, %if.end30
  %25 = load i32* %mult, align 4
  %26 = load i32* %limit, align 4
  %cmp33 = icmp ule i32 %25, %26
  br i1 %cmp33, label %while.body, label %while.end

while.body:                                       ; preds = %while.cond
  %27 = load %"class.boost::random::linear_congruential_engine"** %eng.addr, align 4
  %call35 = call i32 @_ZN5boost6random26linear_congruential_engineIjLj48271ELj0ELj2147483647EEclEv(%"class.boost::random::linear_congruential_engine"* %27)
  %28 = load i32* %bmin, align 4
  %call36 = call i32 @_ZN5boost6random6detail8subtractIjLb0EEclEjj(%"struct.boost::random::detail::subtract.2"* %tmp34, i32 %call35, i32 %28)
  %29 = load i32* %mult, align 4
  %mul = mul i32 %call36, %29
  %30 = load i32* %result, align 4
  %add37 = add i32 %30, %mul
  store i32 %add37, i32* %result, align 4
  %31 = load i32* %mult, align 4
  %32 = load i32* %brange, align 4
  %mul38 = mul i32 %31, %32
  %33 = load i32* %range, align 4
  %34 = load i32* %mult, align 4
  %sub = sub i32 %33, %34
  %add39 = add i32 %sub, 1
  %cmp40 = icmp eq i32 %mul38, %add39
  br i1 %cmp40, label %if.then41, label %if.end42

if.then41:                                        ; preds = %while.body
  %35 = load i32* %result, align 4
  store i32 %35, i32* %retval
  br label %return

if.end42:                                         ; preds = %while.body
  %36 = load i32* %brange, align 4
  %add43 = add i32 %36, 1
  %37 = load i32* %mult, align 4
  %mul44 = mul i32 %37, %add43
  store i32 %mul44, i32* %mult, align 4
  br label %while.cond

while.end:                                        ; preds = %while.cond
  %38 = load %"class.boost::random::linear_congruential_engine"** %eng.addr, align 4
  %39 = load i32* %range, align 4
  %40 = load i32* %mult, align 4
  %div46 = udiv i32 %39, %40
  %call47 = call i32 @_ZN5boost6random6detail20generate_uniform_intINS0_26linear_congruential_engineIjLj48271ELj0ELj2147483647EEEjEET0_RT_S5_S5_N4mpl_5bool_ILb1EEE(%"class.boost::random::linear_congruential_engine"* %38, i32 0, i32 %div46)
  store i32 %call47, i32* %result_increment, align 4
  %call48 = call i32 @_ZNSt14numeric_limitsIjE3maxEv() nounwind
  %41 = load i32* %mult, align 4
  %div49 = udiv i32 %call48, %41
  %42 = load i32* %result_increment, align 4
  %cmp50 = icmp ult i32 %div49, %42
  br i1 %cmp50, label %if.then51, label %if.end52

if.then51:                                        ; preds = %while.end
  br label %for.cond

if.end52:                                         ; preds = %while.end
  %43 = load i32* %mult, align 4
  %44 = load i32* %result_increment, align 4
  %mul53 = mul i32 %44, %43
  store i32 %mul53, i32* %result_increment, align 4
  %45 = load i32* %result_increment, align 4
  %46 = load i32* %result, align 4
  %add54 = add i32 %46, %45
  store i32 %add54, i32* %result, align 4
  %47 = load i32* %result, align 4
  %48 = load i32* %result_increment, align 4
  %cmp55 = icmp ult i32 %47, %48
  br i1 %cmp55, label %if.then56, label %if.end57

if.then56:                                        ; preds = %if.end52
  br label %for.cond

if.end57:                                         ; preds = %if.end52
  %49 = load i32* %result, align 4
  %50 = load i32* %range, align 4
  %cmp58 = icmp ugt i32 %49, %50
  br i1 %cmp58, label %if.then59, label %if.end60

if.then59:                                        ; preds = %if.end57
  br label %for.cond

if.end60:                                         ; preds = %if.end57
  %51 = load i32* %result, align 4
  %52 = load i32* %min_value.addr, align 4
  %call62 = call i32 @_ZN5boost6random6detail3addIjiLb1EEclEji(%"struct.boost::random::detail::add"* %tmp61, i32 %51, i32 %52)
  store i32 %call62, i32* %retval
  br label %return

if.else63:                                        ; preds = %if.else16
  %53 = load i32* %brange, align 4
  %call65 = call i32 @_ZNSt14numeric_limitsIjE3maxEv() nounwind
  %cmp66 = icmp eq i32 %53, %call65
  br i1 %cmp66, label %if.then67, label %if.else76

if.then67:                                        ; preds = %if.else63
  %54 = load i32* %brange, align 4
  %55 = load i32* %range, align 4
  %add68 = add i32 %55, 1
  %div69 = udiv i32 %54, %add68
  store i32 %div69, i32* %bucket_size, align 4
  %56 = load i32* %brange, align 4
  %57 = load i32* %range, align 4
  %add70 = add i32 %57, 1
  %rem71 = urem i32 %56, %add70
  %58 = load i32* %range, align 4
  %cmp72 = icmp eq i32 %rem71, %58
  br i1 %cmp72, label %if.then73, label %if.end75

if.then73:                                        ; preds = %if.then67
  %59 = load i32* %bucket_size, align 4
  %inc74 = add i32 %59, 1
  store i32 %inc74, i32* %bucket_size, align 4
  br label %if.end75

if.end75:                                         ; preds = %if.then73, %if.then67
  br label %if.end80

if.else76:                                        ; preds = %if.else63
  %60 = load i32* %brange, align 4
  %add77 = add i32 %60, 1
  %61 = load i32* %range, align 4
  %add78 = add i32 %61, 1
  %div79 = udiv i32 %add77, %add78
  store i32 %div79, i32* %bucket_size, align 4
  br label %if.end80

if.end80:                                         ; preds = %if.else76, %if.end75
  br label %for.cond81

for.cond81:                                       ; preds = %if.end92, %if.end80
  %62 = load %"class.boost::random::linear_congruential_engine"** %eng.addr, align 4
  %call85 = call i32 @_ZN5boost6random26linear_congruential_engineIjLj48271ELj0ELj2147483647EEclEv(%"class.boost::random::linear_congruential_engine"* %62)
  %63 = load i32* %bmin, align 4
  %call86 = call i32 @_ZN5boost6random6detail8subtractIjLb0EEclEjj(%"struct.boost::random::detail::subtract.2"* %tmp84, i32 %call85, i32 %63)
  store i32 %call86, i32* %result83, align 4
  %64 = load i32* %bucket_size, align 4
  %65 = load i32* %result83, align 4
  %div87 = udiv i32 %65, %64
  store i32 %div87, i32* %result83, align 4
  %66 = load i32* %result83, align 4
  %67 = load i32* %range, align 4
  %cmp88 = icmp ule i32 %66, %67
  br i1 %cmp88, label %if.then89, label %if.end92

if.then89:                                        ; preds = %for.cond81
  %68 = load i32* %result83, align 4
  %69 = load i32* %min_value.addr, align 4
  %call91 = call i32 @_ZN5boost6random6detail3addIjiLb1EEclEji(%"struct.boost::random::detail::add"* %tmp90, i32 %68, i32 %69)
  store i32 %call91, i32* %retval
  br label %return

if.end92:                                         ; preds = %for.cond81
  br label %for.cond81

return:                                           ; preds = %if.then89, %if.end60, %if.then41, %if.then9, %if.then
  %70 = load i32* %retval
  ret i32 %70
}

define linkonce_odr i32 @_ZN5boost6random6detail8subtractIiLb1EEclEii(%"struct.boost::random::detail::subtract"* %this, i32 %x, i32 %y) nounwind align 2 {
entry:
  %retval = alloca i32, align 4
  %this.addr = alloca %"struct.boost::random::detail::subtract"*, align 4
  %x.addr = alloca i32, align 4
  %y.addr = alloca i32, align 4
  store %"struct.boost::random::detail::subtract"* %this, %"struct.boost::random::detail::subtract"** %this.addr, align 4
  store i32 %x, i32* %x.addr, align 4
  store i32 %y, i32* %y.addr, align 4
  %this1 = load %"struct.boost::random::detail::subtract"** %this.addr
  %0 = load i32* %y.addr, align 4
  %cmp = icmp sge i32 %0, 0
  br i1 %cmp, label %if.then, label %if.end

if.then:                                          ; preds = %entry
  %1 = load i32* %x.addr, align 4
  %2 = load i32* %y.addr, align 4
  %sub = sub i32 %1, %2
  store i32 %sub, i32* %retval
  br label %return

if.end:                                           ; preds = %entry
  %3 = load i32* %x.addr, align 4
  %cmp2 = icmp sge i32 %3, 0
  br i1 %cmp2, label %if.then3, label %if.end7

if.then3:                                         ; preds = %if.end
  %4 = load i32* %x.addr, align 4
  %5 = load i32* %y.addr, align 4
  %add = add nsw i32 %5, 1
  %sub4 = sub nsw i32 0, %add
  %add5 = add i32 %4, %sub4
  %add6 = add i32 %add5, 1
  store i32 %add6, i32* %retval
  br label %return

if.end7:                                          ; preds = %if.end
  %6 = load i32* %x.addr, align 4
  %7 = load i32* %y.addr, align 4
  %sub8 = sub nsw i32 %6, %7
  store i32 %sub8, i32* %retval
  br label %return

return:                                           ; preds = %if.end7, %if.then3, %if.then
  %8 = load i32* %retval
  ret i32 %8
}

define linkonce_odr i32 @_ZN5boost6random26linear_congruential_engineIjLj48271ELj0ELj2147483647EE3minEv() nounwind align 2 {
entry:
  ret i32 1
}

define linkonce_odr i32 @_ZN5boost6random6detail8subtractIjLb0EEclEjj(%"struct.boost::random::detail::subtract.2"* %this, i32 %x, i32 %y) nounwind align 2 {
entry:
  %this.addr = alloca %"struct.boost::random::detail::subtract.2"*, align 4
  %x.addr = alloca i32, align 4
  %y.addr = alloca i32, align 4
  store %"struct.boost::random::detail::subtract.2"* %this, %"struct.boost::random::detail::subtract.2"** %this.addr, align 4
  store i32 %x, i32* %x.addr, align 4
  store i32 %y, i32* %y.addr, align 4
  %this1 = load %"struct.boost::random::detail::subtract.2"** %this.addr
  %0 = load i32* %x.addr, align 4
  %1 = load i32* %y.addr, align 4
  %sub = sub i32 %0, %1
  ret i32 %sub
}

define linkonce_odr i32 @_ZN5boost6random26linear_congruential_engineIjLj48271ELj0ELj2147483647EE3maxEv() nounwind align 2 {
entry:
  ret i32 2147483646
}

define linkonce_odr i32 @_ZN5boost6random26linear_congruential_engineIjLj48271ELj0ELj2147483647EEclEv(%"class.boost::random::linear_congruential_engine"* %this) align 2 {
entry:
  %this.addr = alloca %"class.boost::random::linear_congruential_engine"*, align 4
  store %"class.boost::random::linear_congruential_engine"* %this, %"class.boost::random::linear_congruential_engine"** %this.addr, align 4
  %this1 = load %"class.boost::random::linear_congruential_engine"** %this.addr
  %_x = getelementptr inbounds %"class.boost::random::linear_congruential_engine"* %this1, i32 0, i32 0
  %0 = load i32* %_x, align 4
  %call = call i32 @_ZN5boost6random9const_modIjLj2147483647EE8mult_addEjjj(i32 48271, i32 %0, i32 0)
  %_x2 = getelementptr inbounds %"class.boost::random::linear_congruential_engine"* %this1, i32 0, i32 0
  store i32 %call, i32* %_x2, align 4
  %_x3 = getelementptr inbounds %"class.boost::random::linear_congruential_engine"* %this1, i32 0, i32 0
  %1 = load i32* %_x3, align 4
  ret i32 %1
}

define linkonce_odr i32 @_ZN5boost6random6detail3addIjiLb1EEclEji(%"struct.boost::random::detail::add"* %this, i32 %x, i32 %y) nounwind align 2 {
entry:
  %retval = alloca i32, align 4
  %this.addr = alloca %"struct.boost::random::detail::add"*, align 4
  %x.addr = alloca i32, align 4
  %y.addr = alloca i32, align 4
  store %"struct.boost::random::detail::add"* %this, %"struct.boost::random::detail::add"** %this.addr, align 4
  store i32 %x, i32* %x.addr, align 4
  store i32 %y, i32* %y.addr, align 4
  %this1 = load %"struct.boost::random::detail::add"** %this.addr
  %0 = load i32* %y.addr, align 4
  %cmp = icmp sge i32 %0, 0
  br i1 %cmp, label %if.then, label %if.end

if.then:                                          ; preds = %entry
  %1 = load i32* %x.addr, align 4
  %2 = load i32* %y.addr, align 4
  %add = add nsw i32 %1, %2
  store i32 %add, i32* %retval
  br label %return

if.end:                                           ; preds = %entry
  %3 = load i32* %x.addr, align 4
  %4 = load i32* %y.addr, align 4
  %add2 = add nsw i32 %4, 1
  %sub = sub nsw i32 0, %add2
  %cmp3 = icmp ugt i32 %3, %sub
  br i1 %cmp3, label %if.then4, label %if.end9

if.then4:                                         ; preds = %if.end
  %5 = load i32* %x.addr, align 4
  %6 = load i32* %y.addr, align 4
  %add5 = add nsw i32 %6, 1
  %sub6 = sub nsw i32 0, %add5
  %sub7 = sub i32 %5, %sub6
  %sub8 = sub i32 %sub7, 1
  store i32 %sub8, i32* %retval
  br label %return

if.end9:                                          ; preds = %if.end
  %7 = load i32* %x.addr, align 4
  %8 = load i32* %y.addr, align 4
  %add10 = add nsw i32 %7, %8
  store i32 %add10, i32* %retval
  br label %return

return:                                           ; preds = %if.end9, %if.then4, %if.then
  %9 = load i32* %retval
  ret i32 %9
}

define linkonce_odr i32 @_ZNSt14numeric_limitsIjE3maxEv() nounwind align 2 {
entry:
  ret i32 -1
}

define linkonce_odr i32 @_ZN5boost6random6detail20generate_uniform_intINS0_26linear_congruential_engineIjLj48271ELj0ELj2147483647EEEjEET0_RT_S5_S5_N4mpl_5bool_ILb1EEE(%"class.boost::random::linear_congruential_engine"* %eng, i32 %min_value, i32 %max_value) {
entry:
  %retval = alloca i32, align 4
  %eng.addr = alloca %"class.boost::random::linear_congruential_engine"*, align 4
  %min_value.addr = alloca i32, align 4
  %max_value.addr = alloca i32, align 4
  %0 = alloca %"struct.mpl_::bool_", align 1
  %range = alloca i32, align 4
  %tmp = alloca %"struct.boost::random::detail::subtract.2", align 1
  %bmin = alloca i32, align 4
  %brange = alloca i32, align 4
  %tmp4 = alloca %"struct.boost::random::detail::subtract.2", align 1
  %v = alloca i32, align 4
  %tmp11 = alloca %"struct.boost::random::detail::subtract.2", align 1
  %tmp14 = alloca %"struct.boost::random::detail::add.3", align 1
  %limit = alloca i32, align 4
  %result = alloca i32, align 4
  %mult = alloca i32, align 4
  %tmp34 = alloca %"struct.boost::random::detail::subtract.2", align 1
  %result_increment = alloca i32, align 4
  %agg.tmp = alloca %"struct.mpl_::bool_", align 1
  %tmp61 = alloca %"struct.boost::random::detail::add.3", align 1
  %bucket_size = alloca i32, align 4
  %result83 = alloca i32, align 4
  %tmp84 = alloca %"struct.boost::random::detail::subtract.2", align 1
  %tmp90 = alloca %"struct.boost::random::detail::add.3", align 1
  store %"class.boost::random::linear_congruential_engine"* %eng, %"class.boost::random::linear_congruential_engine"** %eng.addr, align 4
  store i32 %min_value, i32* %min_value.addr, align 4
  store i32 %max_value, i32* %max_value.addr, align 4
  %1 = load i32* %max_value.addr, align 4
  %2 = load i32* %min_value.addr, align 4
  %call = call i32 @_ZN5boost6random6detail8subtractIjLb0EEclEjj(%"struct.boost::random::detail::subtract.2"* %tmp, i32 %1, i32 %2)
  store i32 %call, i32* %range, align 4
  %3 = load %"class.boost::random::linear_congruential_engine"** %eng.addr, align 4
  %call2 = call i32 @_ZN5boost6random26linear_congruential_engineIjLj48271ELj0ELj2147483647EE3minEv()
  store i32 %call2, i32* %bmin, align 4
  %4 = load %"class.boost::random::linear_congruential_engine"** %eng.addr, align 4
  %call5 = call i32 @_ZN5boost6random26linear_congruential_engineIjLj48271ELj0ELj2147483647EE3maxEv()
  %5 = load %"class.boost::random::linear_congruential_engine"** %eng.addr, align 4
  %call6 = call i32 @_ZN5boost6random26linear_congruential_engineIjLj48271ELj0ELj2147483647EE3minEv()
  %call7 = call i32 @_ZN5boost6random6detail8subtractIjLb0EEclEjj(%"struct.boost::random::detail::subtract.2"* %tmp4, i32 %call5, i32 %call6)
  store i32 %call7, i32* %brange, align 4
  %6 = load i32* %range, align 4
  %cmp = icmp eq i32 %6, 0
  br i1 %cmp, label %if.then, label %if.else

if.then:                                          ; preds = %entry
  %7 = load i32* %min_value.addr, align 4
  store i32 %7, i32* %retval
  br label %return

if.else:                                          ; preds = %entry
  %8 = load i32* %brange, align 4
  %9 = load i32* %range, align 4
  %cmp8 = icmp eq i32 %8, %9
  br i1 %cmp8, label %if.then9, label %if.else16

if.then9:                                         ; preds = %if.else
  %10 = load %"class.boost::random::linear_congruential_engine"** %eng.addr, align 4
  %call12 = call i32 @_ZN5boost6random26linear_congruential_engineIjLj48271ELj0ELj2147483647EEclEv(%"class.boost::random::linear_congruential_engine"* %10)
  %11 = load i32* %bmin, align 4
  %call13 = call i32 @_ZN5boost6random6detail8subtractIjLb0EEclEjj(%"struct.boost::random::detail::subtract.2"* %tmp11, i32 %call12, i32 %11)
  store i32 %call13, i32* %v, align 4
  %12 = load i32* %v, align 4
  %13 = load i32* %min_value.addr, align 4
  %call15 = call i32 @_ZN5boost6random6detail3addIjjLb0EEclEjj(%"struct.boost::random::detail::add.3"* %tmp14, i32 %12, i32 %13)
  store i32 %call15, i32* %retval
  br label %return

if.else16:                                        ; preds = %if.else
  %14 = load i32* %brange, align 4
  %15 = load i32* %range, align 4
  %cmp17 = icmp ult i32 %14, %15
  br i1 %cmp17, label %if.then18, label %if.else63

if.then18:                                        ; preds = %if.else16
  br label %for.cond

for.cond:                                         ; preds = %if.then59, %if.then56, %if.then51, %if.then18
  %16 = load i32* %range, align 4
  %call20 = call i32 @_ZNSt14numeric_limitsIjE3maxEv() nounwind
  %cmp21 = icmp eq i32 %16, %call20
  br i1 %cmp21, label %if.then22, label %if.else26

if.then22:                                        ; preds = %for.cond
  %17 = load i32* %range, align 4
  %18 = load i32* %brange, align 4
  %add = add i32 %18, 1
  %div = udiv i32 %17, %add
  store i32 %div, i32* %limit, align 4
  %19 = load i32* %range, align 4
  %20 = load i32* %brange, align 4
  %add23 = add i32 %20, 1
  %rem = urem i32 %19, %add23
  %21 = load i32* %brange, align 4
  %cmp24 = icmp eq i32 %rem, %21
  br i1 %cmp24, label %if.then25, label %if.end

if.then25:                                        ; preds = %if.then22
  %22 = load i32* %limit, align 4
  %inc = add i32 %22, 1
  store i32 %inc, i32* %limit, align 4
  br label %if.end

if.end:                                           ; preds = %if.then25, %if.then22
  br label %if.end30

if.else26:                                        ; preds = %for.cond
  %23 = load i32* %range, align 4
  %add27 = add i32 %23, 1
  %24 = load i32* %brange, align 4
  %add28 = add i32 %24, 1
  %div29 = udiv i32 %add27, %add28
  store i32 %div29, i32* %limit, align 4
  br label %if.end30

if.end30:                                         ; preds = %if.else26, %if.end
  store i32 0, i32* %result, align 4
  store i32 1, i32* %mult, align 4
  br label %while.cond

while.cond:                                       ; preds = %if.end42, %if.end30
  %25 = load i32* %mult, align 4
  %26 = load i32* %limit, align 4
  %cmp33 = icmp ule i32 %25, %26
  br i1 %cmp33, label %while.body, label %while.end

while.body:                                       ; preds = %while.cond
  %27 = load %"class.boost::random::linear_congruential_engine"** %eng.addr, align 4
  %call35 = call i32 @_ZN5boost6random26linear_congruential_engineIjLj48271ELj0ELj2147483647EEclEv(%"class.boost::random::linear_congruential_engine"* %27)
  %28 = load i32* %bmin, align 4
  %call36 = call i32 @_ZN5boost6random6detail8subtractIjLb0EEclEjj(%"struct.boost::random::detail::subtract.2"* %tmp34, i32 %call35, i32 %28)
  %29 = load i32* %mult, align 4
  %mul = mul i32 %call36, %29
  %30 = load i32* %result, align 4
  %add37 = add i32 %30, %mul
  store i32 %add37, i32* %result, align 4
  %31 = load i32* %mult, align 4
  %32 = load i32* %brange, align 4
  %mul38 = mul i32 %31, %32
  %33 = load i32* %range, align 4
  %34 = load i32* %mult, align 4
  %sub = sub i32 %33, %34
  %add39 = add i32 %sub, 1
  %cmp40 = icmp eq i32 %mul38, %add39
  br i1 %cmp40, label %if.then41, label %if.end42

if.then41:                                        ; preds = %while.body
  %35 = load i32* %result, align 4
  store i32 %35, i32* %retval
  br label %return

if.end42:                                         ; preds = %while.body
  %36 = load i32* %brange, align 4
  %add43 = add i32 %36, 1
  %37 = load i32* %mult, align 4
  %mul44 = mul i32 %37, %add43
  store i32 %mul44, i32* %mult, align 4
  br label %while.cond

while.end:                                        ; preds = %while.cond
  %38 = load %"class.boost::random::linear_congruential_engine"** %eng.addr, align 4
  %39 = load i32* %range, align 4
  %40 = load i32* %mult, align 4
  %div46 = udiv i32 %39, %40
  %call47 = call i32 @_ZN5boost6random6detail20generate_uniform_intINS0_26linear_congruential_engineIjLj48271ELj0ELj2147483647EEEjEET0_RT_S5_S5_N4mpl_5bool_ILb1EEE(%"class.boost::random::linear_congruential_engine"* %38, i32 0, i32 %div46)
  store i32 %call47, i32* %result_increment, align 4
  %call48 = call i32 @_ZNSt14numeric_limitsIjE3maxEv() nounwind
  %41 = load i32* %mult, align 4
  %div49 = udiv i32 %call48, %41
  %42 = load i32* %result_increment, align 4
  %cmp50 = icmp ult i32 %div49, %42
  br i1 %cmp50, label %if.then51, label %if.end52

if.then51:                                        ; preds = %while.end
  br label %for.cond

if.end52:                                         ; preds = %while.end
  %43 = load i32* %mult, align 4
  %44 = load i32* %result_increment, align 4
  %mul53 = mul i32 %44, %43
  store i32 %mul53, i32* %result_increment, align 4
  %45 = load i32* %result_increment, align 4
  %46 = load i32* %result, align 4
  %add54 = add i32 %46, %45
  store i32 %add54, i32* %result, align 4
  %47 = load i32* %result, align 4
  %48 = load i32* %result_increment, align 4
  %cmp55 = icmp ult i32 %47, %48
  br i1 %cmp55, label %if.then56, label %if.end57

if.then56:                                        ; preds = %if.end52
  br label %for.cond

if.end57:                                         ; preds = %if.end52
  %49 = load i32* %result, align 4
  %50 = load i32* %range, align 4
  %cmp58 = icmp ugt i32 %49, %50
  br i1 %cmp58, label %if.then59, label %if.end60

if.then59:                                        ; preds = %if.end57
  br label %for.cond

if.end60:                                         ; preds = %if.end57
  %51 = load i32* %result, align 4
  %52 = load i32* %min_value.addr, align 4
  %call62 = call i32 @_ZN5boost6random6detail3addIjjLb0EEclEjj(%"struct.boost::random::detail::add.3"* %tmp61, i32 %51, i32 %52)
  store i32 %call62, i32* %retval
  br label %return

if.else63:                                        ; preds = %if.else16
  %53 = load i32* %brange, align 4
  %call65 = call i32 @_ZNSt14numeric_limitsIjE3maxEv() nounwind
  %cmp66 = icmp eq i32 %53, %call65
  br i1 %cmp66, label %if.then67, label %if.else76

if.then67:                                        ; preds = %if.else63
  %54 = load i32* %brange, align 4
  %55 = load i32* %range, align 4
  %add68 = add i32 %55, 1
  %div69 = udiv i32 %54, %add68
  store i32 %div69, i32* %bucket_size, align 4
  %56 = load i32* %brange, align 4
  %57 = load i32* %range, align 4
  %add70 = add i32 %57, 1
  %rem71 = urem i32 %56, %add70
  %58 = load i32* %range, align 4
  %cmp72 = icmp eq i32 %rem71, %58
  br i1 %cmp72, label %if.then73, label %if.end75

if.then73:                                        ; preds = %if.then67
  %59 = load i32* %bucket_size, align 4
  %inc74 = add i32 %59, 1
  store i32 %inc74, i32* %bucket_size, align 4
  br label %if.end75

if.end75:                                         ; preds = %if.then73, %if.then67
  br label %if.end80

if.else76:                                        ; preds = %if.else63
  %60 = load i32* %brange, align 4
  %add77 = add i32 %60, 1
  %61 = load i32* %range, align 4
  %add78 = add i32 %61, 1
  %div79 = udiv i32 %add77, %add78
  store i32 %div79, i32* %bucket_size, align 4
  br label %if.end80

if.end80:                                         ; preds = %if.else76, %if.end75
  br label %for.cond81

for.cond81:                                       ; preds = %if.end92, %if.end80
  %62 = load %"class.boost::random::linear_congruential_engine"** %eng.addr, align 4
  %call85 = call i32 @_ZN5boost6random26linear_congruential_engineIjLj48271ELj0ELj2147483647EEclEv(%"class.boost::random::linear_congruential_engine"* %62)
  %63 = load i32* %bmin, align 4
  %call86 = call i32 @_ZN5boost6random6detail8subtractIjLb0EEclEjj(%"struct.boost::random::detail::subtract.2"* %tmp84, i32 %call85, i32 %63)
  store i32 %call86, i32* %result83, align 4
  %64 = load i32* %bucket_size, align 4
  %65 = load i32* %result83, align 4
  %div87 = udiv i32 %65, %64
  store i32 %div87, i32* %result83, align 4
  %66 = load i32* %result83, align 4
  %67 = load i32* %range, align 4
  %cmp88 = icmp ule i32 %66, %67
  br i1 %cmp88, label %if.then89, label %if.end92

if.then89:                                        ; preds = %for.cond81
  %68 = load i32* %result83, align 4
  %69 = load i32* %min_value.addr, align 4
  %call91 = call i32 @_ZN5boost6random6detail3addIjjLb0EEclEjj(%"struct.boost::random::detail::add.3"* %tmp90, i32 %68, i32 %69)
  store i32 %call91, i32* %retval
  br label %return

if.end92:                                         ; preds = %for.cond81
  br label %for.cond81

return:                                           ; preds = %if.then89, %if.end60, %if.then41, %if.then9, %if.then
  %70 = load i32* %retval
  ret i32 %70
}

define linkonce_odr i32 @_ZN5boost6random6detail3addIjjLb0EEclEjj(%"struct.boost::random::detail::add.3"* %this, i32 %x, i32 %y) nounwind align 2 {
entry:
  %this.addr = alloca %"struct.boost::random::detail::add.3"*, align 4
  %x.addr = alloca i32, align 4
  %y.addr = alloca i32, align 4
  store %"struct.boost::random::detail::add.3"* %this, %"struct.boost::random::detail::add.3"** %this.addr, align 4
  store i32 %x, i32* %x.addr, align 4
  store i32 %y, i32* %y.addr, align 4
  %this1 = load %"struct.boost::random::detail::add.3"** %this.addr
  %0 = load i32* %x.addr, align 4
  %1 = load i32* %y.addr, align 4
  %add = add i32 %0, %1
  ret i32 %add
}

define linkonce_odr i32 @_ZN5boost6random9const_modIjLj2147483647EE8mult_addEjjj(i32 %a, i32 %x, i32 %c) align 2 {
entry:
  %retval = alloca i32, align 4
  %a.addr = alloca i32, align 4
  %x.addr = alloca i32, align 4
  %c.addr = alloca i32, align 4
  %supress_warnings = alloca i32, align 4
  store i32 %a, i32* %a.addr, align 4
  store i32 %x, i32* %x.addr, align 4
  store i32 %c, i32* %c.addr, align 4
  %call = call i32 @_ZN5boost6random9const_modIjLj2147483647EE10unsigned_mEv()
  %sub = sub i32 %call, 1
  %call1 = call i32 @_ZN5boost6random9const_modIjLj2147483647EE10unsigned_mEv()
  %and = and i32 %sub, %call1
  %cmp = icmp eq i32 %and, 0
  br i1 %cmp, label %if.then, label %if.else

if.then:                                          ; preds = %entry
  %0 = load i32* %a.addr, align 4
  %1 = load i32* %x.addr, align 4
  %mul = mul i32 %0, %1
  %2 = load i32* %c.addr, align 4
  %add = add i32 %mul, %2
  %call2 = call i32 @_ZN5boost6random9const_modIjLj2147483647EE10unsigned_mEv()
  %sub3 = sub i32 %call2, 1
  %and4 = and i32 %add, %sub3
  store i32 %and4, i32* %retval
  br label %return

if.else:                                          ; preds = %entry
  %3 = load i32* %a.addr, align 4
  %cmp5 = icmp eq i32 %3, 0
  br i1 %cmp5, label %if.then6, label %if.else7

if.then6:                                         ; preds = %if.else
  %4 = load i32* %c.addr, align 4
  store i32 %4, i32* %retval
  br label %return

if.else7:                                         ; preds = %if.else
  %5 = load i32* %c.addr, align 4
  %sub8 = sub i32 -1, %5
  %6 = load i32* %a.addr, align 4
  %div = udiv i32 %sub8, %6
  %cmp9 = icmp ule i32 2147483647, %div
  br i1 %cmp9, label %if.then10, label %if.else15

if.then10:                                        ; preds = %if.else7
  store i32 0, i32* %supress_warnings, align 4
  %7 = load i32* %supress_warnings, align 4
  %cmp11 = icmp eq i32 %7, 0
  br i1 %cmp11, label %cond.true, label %cond.false

cond.true:                                        ; preds = %if.then10
  br label %cond.end

cond.false:                                       ; preds = %if.then10
  call void @__assert_fail(i8* getelementptr inbounds ([22 x i8]* @.str7, i32 0, i32 0), i8* getelementptr inbounds ([60 x i8]* @.str8, i32 0, i32 0), i32 81, i8* getelementptr inbounds ([144 x i8]* @__PRETTY_FUNCTION__._ZN5boost6random9const_modIjLj2147483647EE8mult_addEjjj, i32 0, i32 0)) noreturn nounwind
  unreachable
                                                  ; No predecessors!
  br label %cond.end

cond.end:                                         ; preds = %8, %cond.true
  %9 = load i32* %a.addr, align 4
  %10 = load i32* %x.addr, align 4
  %mul12 = mul i32 %9, %10
  %11 = load i32* %c.addr, align 4
  %add13 = add i32 %mul12, %11
  %12 = load i32* %supress_warnings, align 4
  %add14 = add i32 2147483647, %12
  %rem = urem i32 %add13, %add14
  store i32 %rem, i32* %retval
  br label %return

if.else15:                                        ; preds = %if.else7
  %13 = load i32* %a.addr, align 4
  %14 = load i32* %x.addr, align 4
  %call16 = call i32 @_ZN5boost6random9const_modIjLj2147483647EE4multEjj(i32 %13, i32 %14)
  %15 = load i32* %c.addr, align 4
  %call17 = call i32 @_ZN5boost6random9const_modIjLj2147483647EE3addEjj(i32 %call16, i32 %15)
  store i32 %call17, i32* %retval
  br label %return

return:                                           ; preds = %if.else15, %cond.end, %if.then6, %if.then
  %16 = load i32* %retval
  ret i32 %16
}

define linkonce_odr i32 @_ZN5boost6random9const_modIjLj2147483647EE10unsigned_mEv() nounwind align 2 {
entry:
  ret i32 2147483647
}

define linkonce_odr i32 @_ZN5boost6random9const_modIjLj2147483647EE3addEjj(i32 %x, i32 %c) align 2 {
entry:
  %retval = alloca i32, align 4
  %x.addr = alloca i32, align 4
  %c.addr = alloca i32, align 4
  store i32 %x, i32* %x.addr, align 4
  store i32 %c, i32* %c.addr, align 4
  %call = call i32 @_ZN5boost6random9const_modIjLj2147483647EE10unsigned_mEv()
  %sub = sub i32 %call, 1
  %call1 = call i32 @_ZN5boost6random9const_modIjLj2147483647EE10unsigned_mEv()
  %and = and i32 %sub, %call1
  %cmp = icmp eq i32 %and, 0
  br i1 %cmp, label %if.then, label %if.else

if.then:                                          ; preds = %entry
  %0 = load i32* %x.addr, align 4
  %1 = load i32* %c.addr, align 4
  %add = add i32 %0, %1
  %call2 = call i32 @_ZN5boost6random9const_modIjLj2147483647EE10unsigned_mEv()
  %sub3 = sub i32 %call2, 1
  %and4 = and i32 %add, %sub3
  store i32 %and4, i32* %retval
  br label %return

if.else:                                          ; preds = %entry
  %2 = load i32* %c.addr, align 4
  %cmp5 = icmp eq i32 %2, 0
  br i1 %cmp5, label %if.then6, label %if.else7

if.then6:                                         ; preds = %if.else
  %3 = load i32* %x.addr, align 4
  store i32 %3, i32* %retval
  br label %return

if.else7:                                         ; preds = %if.else
  %4 = load i32* %x.addr, align 4
  %5 = load i32* %c.addr, align 4
  %sub8 = sub i32 2147483647, %5
  %cmp9 = icmp ult i32 %4, %sub8
  br i1 %cmp9, label %if.then10, label %if.else12

if.then10:                                        ; preds = %if.else7
  %6 = load i32* %x.addr, align 4
  %7 = load i32* %c.addr, align 4
  %add11 = add i32 %6, %7
  store i32 %add11, i32* %retval
  br label %return

if.else12:                                        ; preds = %if.else7
  %8 = load i32* %x.addr, align 4
  %9 = load i32* %c.addr, align 4
  %sub13 = sub i32 2147483647, %9
  %sub14 = sub i32 %8, %sub13
  store i32 %sub14, i32* %retval
  br label %return

return:                                           ; preds = %if.else12, %if.then10, %if.then6, %if.then
  %10 = load i32* %retval
  ret i32 %10
}

define linkonce_odr i32 @_ZN5boost6random9const_modIjLj2147483647EE4multEjj(i32 %a, i32 %x) align 2 {
entry:
  %retval = alloca i32, align 4
  %a.addr = alloca i32, align 4
  %x.addr = alloca i32, align 4
  store i32 %a, i32* %a.addr, align 4
  store i32 %x, i32* %x.addr, align 4
  %call = call i32 @_ZN5boost6random9const_modIjLj2147483647EE10unsigned_mEv()
  %sub = sub i32 %call, 1
  %call1 = call i32 @_ZN5boost6random9const_modIjLj2147483647EE10unsigned_mEv()
  %and = and i32 %sub, %call1
  %cmp = icmp eq i32 %and, 0
  br i1 %cmp, label %if.then, label %if.else

if.then:                                          ; preds = %entry
  %0 = load i32* %a.addr, align 4
  %1 = load i32* %x.addr, align 4
  %mul = mul i32 %0, %1
  %call2 = call i32 @_ZN5boost6random9const_modIjLj2147483647EE10unsigned_mEv()
  %sub3 = sub i32 %call2, 1
  %and4 = and i32 %mul, %sub3
  store i32 %and4, i32* %retval
  br label %return

if.else:                                          ; preds = %entry
  %2 = load i32* %a.addr, align 4
  %cmp5 = icmp eq i32 %2, 0
  br i1 %cmp5, label %if.then6, label %if.else7

if.then6:                                         ; preds = %if.else
  store i32 0, i32* %retval
  br label %return

if.else7:                                         ; preds = %if.else
  %3 = load i32* %a.addr, align 4
  %cmp8 = icmp eq i32 %3, 1
  br i1 %cmp8, label %if.then9, label %if.else10

if.then9:                                         ; preds = %if.else7
  %4 = load i32* %x.addr, align 4
  store i32 %4, i32* %retval
  br label %return

if.else10:                                        ; preds = %if.else7
  %5 = load i32* %a.addr, align 4
  %div = udiv i32 -1, %5
  %cmp11 = icmp ule i32 2147483647, %div
  br i1 %cmp11, label %if.then12, label %if.else14

if.then12:                                        ; preds = %if.else10
  %6 = load i32* %a.addr, align 4
  %7 = load i32* %x.addr, align 4
  %call13 = call i32 @_ZN5boost6random9const_modIjLj2147483647EE10mult_smallEjj(i32 %6, i32 %7)
  store i32 %call13, i32* %retval
  br label %return

if.else14:                                        ; preds = %if.else10
  %8 = load i32* %a.addr, align 4
  %9 = load i32* %x.addr, align 4
  %call15 = call i32 @_ZN5boost6random9const_modIjLj2147483647EE12mult_generalEjj(i32 %8, i32 %9)
  store i32 %call15, i32* %retval
  br label %return

return:                                           ; preds = %if.else14, %if.then12, %if.then9, %if.then6, %if.then
  %10 = load i32* %retval
  ret i32 %10
}

define linkonce_odr i32 @_ZN5boost6random9const_modIjLj2147483647EE10mult_smallEjj(i32 %a, i32 %x) nounwind align 2 {
entry:
  %a.addr = alloca i32, align 4
  %x.addr = alloca i32, align 4
  %supress_warnings = alloca i32, align 4
  store i32 %a, i32* %a.addr, align 4
  store i32 %x, i32* %x.addr, align 4
  store i32 0, i32* %supress_warnings, align 4
  %0 = load i32* %supress_warnings, align 4
  %cmp = icmp eq i32 %0, 0
  br i1 %cmp, label %cond.true, label %cond.false

cond.true:                                        ; preds = %entry
  br label %cond.end

cond.false:                                       ; preds = %entry
  call void @__assert_fail(i8* getelementptr inbounds ([22 x i8]* @.str7, i32 0, i32 0), i8* getelementptr inbounds ([60 x i8]* @.str8, i32 0, i32 0), i32 112, i8* getelementptr inbounds ([137 x i8]* @__PRETTY_FUNCTION__._ZN5boost6random9const_modIjLj2147483647EE10mult_smallEjj, i32 0, i32 0)) noreturn nounwind
  unreachable
                                                  ; No predecessors!
  br label %cond.end

cond.end:                                         ; preds = %1, %cond.true
  %2 = load i32* %a.addr, align 4
  %3 = load i32* %x.addr, align 4
  %mul = mul i32 %2, %3
  %4 = load i32* %supress_warnings, align 4
  %add = add i32 2147483647, %4
  %rem = urem i32 %mul, %add
  ret i32 %rem
}

define linkonce_odr i32 @_ZN5boost6random9const_modIjLj2147483647EE12mult_generalEjj(i32 %a, i32 %b) align 2 {
entry:
  %retval = alloca i32, align 4
  %a.addr = alloca i32, align 4
  %b.addr = alloca i32, align 4
  %suppress_warnings = alloca i32, align 4
  %modulus = alloca i32, align 4
  store i32 %a, i32* %a.addr, align 4
  store i32 %b, i32* %b.addr, align 4
  store i32 0, i32* %suppress_warnings, align 4
  %0 = load i32* %suppress_warnings, align 4
  %cmp = icmp eq i32 %0, 0
  br i1 %cmp, label %cond.true, label %cond.false

cond.true:                                        ; preds = %entry
  br label %cond.end

cond.false:                                       ; preds = %entry
  call void @__assert_fail(i8* getelementptr inbounds ([23 x i8]* @.str9, i32 0, i32 0), i8* getelementptr inbounds ([60 x i8]* @.str8, i32 0, i32 0), i32 129, i8* getelementptr inbounds ([139 x i8]* @__PRETTY_FUNCTION__._ZN5boost6random9const_modIjLj2147483647EE12mult_generalEjj, i32 0, i32 0)) noreturn nounwind
  unreachable
                                                  ; No predecessors!
  br label %cond.end

cond.end:                                         ; preds = %1, %cond.true
  %2 = load i32* %suppress_warnings, align 4
  %add = add i32 2147483647, %2
  store i32 %add, i32* %modulus, align 4
  %3 = load i32* %modulus, align 4
  %cmp1 = icmp eq i32 %3, 2147483647
  br i1 %cmp1, label %cond.true2, label %cond.false3

cond.true2:                                       ; preds = %cond.end
  br label %cond.end4

cond.false3:                                      ; preds = %cond.end
  call void @__assert_fail(i8* getelementptr inbounds ([13 x i8]* @.str10, i32 0, i32 0), i8* getelementptr inbounds ([60 x i8]* @.str8, i32 0, i32 0), i32 131, i8* getelementptr inbounds ([139 x i8]* @__PRETTY_FUNCTION__._ZN5boost6random9const_modIjLj2147483647EE12mult_generalEjj, i32 0, i32 0)) noreturn nounwind
  unreachable
                                                  ; No predecessors!
  br label %cond.end4

cond.end4:                                        ; preds = %4, %cond.true2
  %5 = load i32* %modulus, align 4
  %conv = zext i32 %5 to i64
  %call = call i64 @_ZNSt14numeric_limitsIyE3maxEv() nounwind
  %6 = load i32* %modulus, align 4
  %conv5 = zext i32 %6 to i64
  %div = udiv i64 %call, %conv5
  %cmp6 = icmp ule i64 %conv, %div
  br i1 %cmp6, label %if.then, label %if.else

if.then:                                          ; preds = %cond.end4
  %7 = load i32* %a.addr, align 4
  %conv7 = zext i32 %7 to i64
  %8 = load i32* %b.addr, align 4
  %conv8 = zext i32 %8 to i64
  %mul = mul i64 %conv7, %conv8
  %9 = load i32* %modulus, align 4
  %conv9 = zext i32 %9 to i64
  %rem = urem i64 %mul, %conv9
  %conv10 = trunc i64 %rem to i32
  store i32 %conv10, i32* %retval
  br label %return

if.else:                                          ; preds = %cond.end4
  %10 = load i32* %a.addr, align 4
  %conv11 = zext i32 %10 to i64
  %11 = load i32* %b.addr, align 4
  %conv12 = zext i32 %11 to i64
  %12 = load i32* %modulus, align 4
  %conv13 = zext i32 %12 to i64
  %call14 = call i64 @_ZN5boost6random6detail6mulmodEyyy(i64 %conv11, i64 %conv12, i64 %conv13)
  %conv15 = trunc i64 %call14 to i32
  store i32 %conv15, i32* %retval
  br label %return

return:                                           ; preds = %if.else, %if.then
  %13 = load i32* %retval
  ret i32 %13
}

define linkonce_odr i64 @_ZNSt14numeric_limitsIyE3maxEv() nounwind align 2 {
entry:
  ret i64 -1
}

define linkonce_odr i64 @_ZN5boost6random6detail6mulmodEyyy(i64 %a, i64 %b, i64 %m) inlinehint {
entry:
  %a.addr = alloca i64, align 8
  %b.addr = alloca i64, align 8
  %m.addr = alloca i64, align 8
  %tmp = alloca %"struct.boost::random::detail::div_t", align 4
  store i64 %a, i64* %a.addr, align 8
  store i64 %b, i64* %b.addr, align 8
  store i64 %m, i64* %m.addr, align 8
  %0 = load i64* %a.addr, align 8
  %1 = load i64* %b.addr, align 8
  %2 = load i64* %m.addr, align 8
  call void @_ZN5boost6random6detail9muldivmodEyyy(%"struct.boost::random::detail::div_t"* sret %tmp, i64 %0, i64 %1, i64 %2)
  %remainder = getelementptr inbounds %"struct.boost::random::detail::div_t"* %tmp, i32 0, i32 1
  %3 = load i64* %remainder, align 4
  ret i64 %3
}

define linkonce_odr void @_ZN5boost6random6detail9muldivmodEyyy(%"struct.boost::random::detail::div_t"* noalias sret %agg.result, i64 %a, i64 %b, i64 %m) nounwind inlinehint {
entry:
  %t.addr.i.i.i.i.i.i.i = alloca i64, align 8
  %accum.addr.i.i.i.i.i.i.i = alloca i32, align 4
  %t.addr.i.i.i.i.i.i = alloca i64, align 8
  %accum.addr.i.i.i.i.i.i = alloca i32, align 4
  %update.i.i.i.i.i.i = alloca i32, align 4
  %t.addr.i.i.i.i.i = alloca i64, align 8
  %accum.addr.i.i.i.i.i = alloca i32, align 4
  %update.i.i.i.i.i = alloca i32, align 4
  %t.addr.i.i.i.i = alloca i64, align 8
  %accum.addr.i.i.i.i = alloca i32, align 4
  %update.i.i.i.i = alloca i32, align 4
  %t.addr.i.i.i = alloca i64, align 8
  %accum.addr.i.i.i = alloca i32, align 4
  %update.i.i.i = alloca i32, align 4
  %t.addr.i.i = alloca i64, align 8
  %accum.addr.i.i = alloca i32, align 4
  %update.i.i = alloca i32, align 4
  %t.addr.i = alloca i64, align 8
  %a.addr = alloca i64, align 8
  %b.addr = alloca i64, align 8
  %m.addr = alloca i64, align 8
  %shift = alloca i32, align 4
  %product = alloca [4 x i32], align 4
  %a_ = alloca [2 x i32], align 4
  %b_ = alloca [2 x i32], align 4
  %m_ = alloca [2 x i32], align 4
  %i = alloca i32, align 4
  %carry = alloca i32, align 4
  %j = alloca i32, align 4
  %temp = alloca i64, align 8
  %quotient = alloca [2 x i32], align 4
  %result = alloca %"struct.boost::random::detail::div_t", align 4
  %i60 = alloca i32, align 4
  %temp64 = alloca i64, align 8
  %q = alloca i32, align 4
  %rem = alloca i64, align 8
  %diff = alloca i64, align 8
  %error = alloca i32, align 4
  %result118 = alloca %"struct.boost::random::detail::div_t", align 4
  store i64 %a, i64* %a.addr, align 8
  store i64 %b, i64* %b.addr, align 8
  store i64 %m, i64* %m.addr, align 8
  %0 = load i64* %m.addr, align 8
  store i64 %0, i64* %t.addr.i, align 8
  %1 = load i64* %t.addr.i, align 8
  store i64 %1, i64* %t.addr.i.i, align 8
  store i32 0, i32* %accum.addr.i.i, align 4
  %2 = load i64* %t.addr.i.i, align 8
  %shr.i.i = lshr i64 %2, 32
  %cmp.i.i = icmp ne i64 %shr.i.i, 0
  %conv.i.i = zext i1 %cmp.i.i to i32
  %mul.i.i = mul nsw i32 %conv.i.i, 32
  store i32 %mul.i.i, i32* %update.i.i, align 4
  %3 = load i64* %t.addr.i.i, align 8
  %4 = load i32* %update.i.i, align 4
  %sh_prom.i.i = zext i32 %4 to i64
  %shr1.i.i = lshr i64 %3, %sh_prom.i.i
  %5 = load i32* %accum.addr.i.i, align 4
  %6 = load i32* %update.i.i, align 4
  %add.i.i = add nsw i32 %5, %6
  store i64 %shr1.i.i, i64* %t.addr.i.i.i, align 8
  store i32 %add.i.i, i32* %accum.addr.i.i.i, align 4
  %7 = load i64* %t.addr.i.i.i, align 8
  %shr.i.i.i = lshr i64 %7, 16
  %cmp.i.i.i = icmp ne i64 %shr.i.i.i, 0
  %conv.i.i.i = zext i1 %cmp.i.i.i to i32
  %mul.i.i.i = mul nsw i32 %conv.i.i.i, 16
  store i32 %mul.i.i.i, i32* %update.i.i.i, align 4
  %8 = load i64* %t.addr.i.i.i, align 8
  %9 = load i32* %update.i.i.i, align 4
  %sh_prom.i.i.i = zext i32 %9 to i64
  %shr1.i.i.i = lshr i64 %8, %sh_prom.i.i.i
  %10 = load i32* %accum.addr.i.i.i, align 4
  %11 = load i32* %update.i.i.i, align 4
  %add.i.i.i = add nsw i32 %10, %11
  store i64 %shr1.i.i.i, i64* %t.addr.i.i.i.i, align 8
  store i32 %add.i.i.i, i32* %accum.addr.i.i.i.i, align 4
  %12 = load i64* %t.addr.i.i.i.i, align 8
  %shr.i.i.i.i = lshr i64 %12, 8
  %cmp.i.i.i.i = icmp ne i64 %shr.i.i.i.i, 0
  %conv.i.i.i.i = zext i1 %cmp.i.i.i.i to i32
  %mul.i.i.i.i = mul nsw i32 %conv.i.i.i.i, 8
  store i32 %mul.i.i.i.i, i32* %update.i.i.i.i, align 4
  %13 = load i64* %t.addr.i.i.i.i, align 8
  %14 = load i32* %update.i.i.i.i, align 4
  %sh_prom.i.i.i.i = zext i32 %14 to i64
  %shr1.i.i.i.i = lshr i64 %13, %sh_prom.i.i.i.i
  %15 = load i32* %accum.addr.i.i.i.i, align 4
  %16 = load i32* %update.i.i.i.i, align 4
  %add.i.i.i.i = add nsw i32 %15, %16
  store i64 %shr1.i.i.i.i, i64* %t.addr.i.i.i.i.i, align 8
  store i32 %add.i.i.i.i, i32* %accum.addr.i.i.i.i.i, align 4
  %17 = load i64* %t.addr.i.i.i.i.i, align 8
  %shr.i.i.i.i.i = lshr i64 %17, 4
  %cmp.i.i.i.i.i = icmp ne i64 %shr.i.i.i.i.i, 0
  %conv.i.i.i.i.i = zext i1 %cmp.i.i.i.i.i to i32
  %mul.i.i.i.i.i = mul nsw i32 %conv.i.i.i.i.i, 4
  store i32 %mul.i.i.i.i.i, i32* %update.i.i.i.i.i, align 4
  %18 = load i64* %t.addr.i.i.i.i.i, align 8
  %19 = load i32* %update.i.i.i.i.i, align 4
  %sh_prom.i.i.i.i.i = zext i32 %19 to i64
  %shr1.i.i.i.i.i = lshr i64 %18, %sh_prom.i.i.i.i.i
  %20 = load i32* %accum.addr.i.i.i.i.i, align 4
  %21 = load i32* %update.i.i.i.i.i, align 4
  %add.i.i.i.i.i = add nsw i32 %20, %21
  store i64 %shr1.i.i.i.i.i, i64* %t.addr.i.i.i.i.i.i, align 8
  store i32 %add.i.i.i.i.i, i32* %accum.addr.i.i.i.i.i.i, align 4
  %22 = load i64* %t.addr.i.i.i.i.i.i, align 8
  %shr.i.i.i.i.i.i = lshr i64 %22, 2
  %cmp.i.i.i.i.i.i = icmp ne i64 %shr.i.i.i.i.i.i, 0
  %conv.i.i.i.i.i.i = zext i1 %cmp.i.i.i.i.i.i to i32
  %mul.i.i.i.i.i.i = mul nsw i32 %conv.i.i.i.i.i.i, 2
  store i32 %mul.i.i.i.i.i.i, i32* %update.i.i.i.i.i.i, align 4
  %23 = load i64* %t.addr.i.i.i.i.i.i, align 8
  %24 = load i32* %update.i.i.i.i.i.i, align 4
  %sh_prom.i.i.i.i.i.i = zext i32 %24 to i64
  %shr1.i.i.i.i.i.i = lshr i64 %23, %sh_prom.i.i.i.i.i.i
  %25 = load i32* %accum.addr.i.i.i.i.i.i, align 4
  %26 = load i32* %update.i.i.i.i.i.i, align 4
  %add.i.i.i.i.i.i = add nsw i32 %25, %26
  store i64 %shr1.i.i.i.i.i.i, i64* %t.addr.i.i.i.i.i.i.i, align 8
  store i32 %add.i.i.i.i.i.i, i32* %accum.addr.i.i.i.i.i.i.i, align 4
  %27 = load i64* %t.addr.i.i.i.i.i.i.i, align 8
  %shr.i.i.i.i.i.i.i = lshr i64 %27, 1
  %conv.i.i.i.i.i.i.i = trunc i64 %shr.i.i.i.i.i.i.i to i32
  %28 = load i32* %accum.addr.i.i.i.i.i.i.i, align 4
  %add.i.i.i.i.i.i.i = add nsw i32 %conv.i.i.i.i.i.i.i, %28
  %sub = sub nsw i32 63, %add.i.i.i.i.i.i.i
  store i32 %sub, i32* %shift, align 4
  %29 = load i32* %shift, align 4
  %30 = load i64* %a.addr, align 8
  %sh_prom = zext i32 %29 to i64
  %shl = shl i64 %30, %sh_prom
  store i64 %shl, i64* %a.addr, align 8
  %31 = load i32* %shift, align 4
  %32 = load i64* %m.addr, align 8
  %sh_prom1 = zext i32 %31 to i64
  %shl2 = shl i64 %32, %sh_prom1
  store i64 %shl2, i64* %m.addr, align 8
  %33 = bitcast [4 x i32]* %product to i8*
  call void @llvm.memset.p0i8.i32(i8* %33, i8 0, i32 16, i32 4, i1 false)
  %arrayinit.begin = getelementptr inbounds [2 x i32]* %a_, i32 0, i32 0
  %34 = load i64* %a.addr, align 8
  %and = and i64 %34, 4294967295
  %conv = trunc i64 %and to i32
  store i32 %conv, i32* %arrayinit.begin
  %arrayinit.element = getelementptr inbounds i32* %arrayinit.begin, i32 1
  %35 = load i64* %a.addr, align 8
  %shr = lshr i64 %35, 32
  %and3 = and i64 %shr, 4294967295
  %conv4 = trunc i64 %and3 to i32
  store i32 %conv4, i32* %arrayinit.element
  %arrayinit.begin5 = getelementptr inbounds [2 x i32]* %b_, i32 0, i32 0
  %36 = load i64* %b.addr, align 8
  %and6 = and i64 %36, 4294967295
  %conv7 = trunc i64 %and6 to i32
  store i32 %conv7, i32* %arrayinit.begin5
  %arrayinit.element8 = getelementptr inbounds i32* %arrayinit.begin5, i32 1
  %37 = load i64* %b.addr, align 8
  %shr9 = lshr i64 %37, 32
  %and10 = and i64 %shr9, 4294967295
  %conv11 = trunc i64 %and10 to i32
  store i32 %conv11, i32* %arrayinit.element8
  %arrayinit.begin12 = getelementptr inbounds [2 x i32]* %m_, i32 0, i32 0
  %38 = load i64* %m.addr, align 8
  %and13 = and i64 %38, 4294967295
  %conv14 = trunc i64 %and13 to i32
  store i32 %conv14, i32* %arrayinit.begin12
  %arrayinit.element15 = getelementptr inbounds i32* %arrayinit.begin12, i32 1
  %39 = load i64* %m.addr, align 8
  %shr16 = lshr i64 %39, 32
  %and17 = and i64 %shr16, 4294967295
  %conv18 = trunc i64 %and17 to i32
  store i32 %conv18, i32* %arrayinit.element15
  store i32 0, i32* %i, align 4
  br label %for.cond

for.cond:                                         ; preds = %for.inc40, %entry
  %40 = load i32* %i, align 4
  %cmp = icmp slt i32 %40, 2
  br i1 %cmp, label %for.body, label %for.end42

for.body:                                         ; preds = %for.cond
  store i32 0, i32* %carry, align 4
  store i32 0, i32* %j, align 4
  br label %for.cond19

for.cond19:                                       ; preds = %for.inc, %for.body
  %41 = load i32* %j, align 4
  %cmp20 = icmp slt i32 %41, 2
  br i1 %cmp20, label %for.body21, label %for.end

for.body21:                                       ; preds = %for.cond19
  %42 = load i32* %i, align 4
  %arrayidx = getelementptr inbounds [2 x i32]* %a_, i32 0, i32 %42
  %43 = load i32* %arrayidx, align 4
  %conv22 = zext i32 %43 to i64
  %44 = load i32* %j, align 4
  %arrayidx23 = getelementptr inbounds [2 x i32]* %b_, i32 0, i32 %44
  %45 = load i32* %arrayidx23, align 4
  %conv24 = zext i32 %45 to i64
  %mul = mul i64 %conv22, %conv24
  %46 = load i32* %carry, align 4
  %conv25 = zext i32 %46 to i64
  %add = add i64 %mul, %conv25
  %47 = load i32* %i, align 4
  %48 = load i32* %j, align 4
  %add26 = add nsw i32 %47, %48
  %arrayidx27 = getelementptr inbounds [4 x i32]* %product, i32 0, i32 %add26
  %49 = load i32* %arrayidx27, align 4
  %conv28 = zext i32 %49 to i64
  %add29 = add i64 %add, %conv28
  store i64 %add29, i64* %temp, align 8
  %50 = load i64* %temp, align 8
  %and30 = and i64 %50, 4294967295
  %conv31 = trunc i64 %and30 to i32
  %51 = load i32* %i, align 4
  %52 = load i32* %j, align 4
  %add32 = add nsw i32 %51, %52
  %arrayidx33 = getelementptr inbounds [4 x i32]* %product, i32 0, i32 %add32
  store i32 %conv31, i32* %arrayidx33, align 4
  %53 = load i64* %temp, align 8
  %shr34 = lshr i64 %53, 32
  %conv35 = trunc i64 %shr34 to i32
  store i32 %conv35, i32* %carry, align 4
  br label %for.inc

for.inc:                                          ; preds = %for.body21
  %54 = load i32* %j, align 4
  %inc = add nsw i32 %54, 1
  store i32 %inc, i32* %j, align 4
  br label %for.cond19

for.end:                                          ; preds = %for.cond19
  %55 = load i32* %carry, align 4
  %cmp36 = icmp ne i32 %55, 0
  br i1 %cmp36, label %if.then, label %if.end

if.then:                                          ; preds = %for.end
  %56 = load i32* %carry, align 4
  %57 = load i32* %i, align 4
  %add37 = add nsw i32 %57, 2
  %arrayidx38 = getelementptr inbounds [4 x i32]* %product, i32 0, i32 %add37
  %58 = load i32* %arrayidx38, align 4
  %add39 = add i32 %58, %56
  store i32 %add39, i32* %arrayidx38, align 4
  br label %if.end

if.end:                                           ; preds = %if.then, %for.end
  br label %for.inc40

for.inc40:                                        ; preds = %if.end
  %59 = load i32* %i, align 4
  %inc41 = add nsw i32 %59, 1
  store i32 %inc41, i32* %i, align 4
  br label %for.cond

for.end42:                                        ; preds = %for.cond
  %60 = load i64* %m.addr, align 8
  %cmp43 = icmp eq i64 %60, 0
  br i1 %cmp43, label %if.then44, label %if.end59

if.then44:                                        ; preds = %for.end42
  %quotient45 = getelementptr inbounds %"struct.boost::random::detail::div_t"* %result, i32 0, i32 0
  %arrayidx46 = getelementptr inbounds [4 x i32]* %product, i32 0, i32 3
  %61 = load i32* %arrayidx46, align 4
  %conv47 = zext i32 %61 to i64
  %shl48 = shl i64 %conv47, 32
  %arrayidx49 = getelementptr inbounds [4 x i32]* %product, i32 0, i32 2
  %62 = load i32* %arrayidx49, align 4
  %conv50 = zext i32 %62 to i64
  %or = or i64 %shl48, %conv50
  store i64 %or, i64* %quotient45, align 4
  %remainder = getelementptr inbounds %"struct.boost::random::detail::div_t"* %result, i32 0, i32 1
  %arrayidx51 = getelementptr inbounds [4 x i32]* %product, i32 0, i32 1
  %63 = load i32* %arrayidx51, align 4
  %conv52 = zext i32 %63 to i64
  %shl53 = shl i64 %conv52, 32
  %arrayidx54 = getelementptr inbounds [4 x i32]* %product, i32 0, i32 0
  %64 = load i32* %arrayidx54, align 4
  %conv55 = zext i32 %64 to i64
  %or56 = or i64 %shl53, %conv55
  %65 = load i32* %shift, align 4
  %sh_prom57 = zext i32 %65 to i64
  %shr58 = lshr i64 %or56, %sh_prom57
  store i64 %shr58, i64* %remainder, align 4
  %66 = bitcast %"struct.boost::random::detail::div_t"* %agg.result to i8*
  %67 = bitcast %"struct.boost::random::detail::div_t"* %result to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %66, i8* %67, i32 16, i32 4, i1 false)
  br label %return

if.end59:                                         ; preds = %for.end42
  store i32 3, i32* %i60, align 4
  br label %for.cond61

for.cond61:                                       ; preds = %for.inc116, %if.end59
  %68 = load i32* %i60, align 4
  %cmp62 = icmp sge i32 %68, 2
  br i1 %cmp62, label %for.body63, label %for.end117

for.body63:                                       ; preds = %for.cond61
  %69 = load i32* %i60, align 4
  %arrayidx65 = getelementptr inbounds [4 x i32]* %product, i32 0, i32 %69
  %70 = load i32* %arrayidx65, align 4
  %conv66 = zext i32 %70 to i64
  %shl67 = shl i64 %conv66, 32
  %71 = load i32* %i60, align 4
  %sub68 = sub nsw i32 %71, 1
  %arrayidx69 = getelementptr inbounds [4 x i32]* %product, i32 0, i32 %sub68
  %72 = load i32* %arrayidx69, align 4
  %conv70 = zext i32 %72 to i64
  %or71 = or i64 %shl67, %conv70
  store i64 %or71, i64* %temp64, align 8
  %73 = load i32* %i60, align 4
  %arrayidx72 = getelementptr inbounds [4 x i32]* %product, i32 0, i32 %73
  %74 = load i32* %arrayidx72, align 4
  %arrayidx73 = getelementptr inbounds [2 x i32]* %m_, i32 0, i32 1
  %75 = load i32* %arrayidx73, align 4
  %cmp74 = icmp eq i32 %74, %75
  br i1 %cmp74, label %cond.true, label %cond.false

cond.true:                                        ; preds = %for.body63
  br label %cond.end

cond.false:                                       ; preds = %for.body63
  %76 = load i64* %temp64, align 8
  %arrayidx75 = getelementptr inbounds [2 x i32]* %m_, i32 0, i32 1
  %77 = load i32* %arrayidx75, align 4
  %conv76 = zext i32 %77 to i64
  %div = udiv i64 %76, %conv76
  br label %cond.end

cond.end:                                         ; preds = %cond.false, %cond.true
  %cond = phi i64 [ 4294967295, %cond.true ], [ %div, %cond.false ]
  %conv77 = trunc i64 %cond to i32
  store i32 %conv77, i32* %q, align 4
  %78 = load i64* %temp64, align 8
  %79 = load i32* %q, align 4
  %conv78 = zext i32 %79 to i64
  %arrayidx79 = getelementptr inbounds [2 x i32]* %m_, i32 0, i32 1
  %80 = load i32* %arrayidx79, align 4
  %conv80 = zext i32 %80 to i64
  %mul81 = mul i64 %conv78, %conv80
  %sub82 = sub i64 %78, %mul81
  %shl83 = shl i64 %sub82, 32
  %81 = load i32* %i60, align 4
  %sub84 = sub nsw i32 %81, 2
  %arrayidx85 = getelementptr inbounds [4 x i32]* %product, i32 0, i32 %sub84
  %82 = load i32* %arrayidx85, align 4
  %conv86 = zext i32 %82 to i64
  %add87 = add i64 %shl83, %conv86
  store i64 %add87, i64* %rem, align 8
  %arrayidx88 = getelementptr inbounds [2 x i32]* %m_, i32 0, i32 0
  %83 = load i32* %arrayidx88, align 4
  %conv89 = zext i32 %83 to i64
  %84 = load i32* %q, align 4
  %conv90 = zext i32 %84 to i64
  %mul91 = mul i64 %conv89, %conv90
  store i64 %mul91, i64* %diff, align 8
  store i32 0, i32* %error, align 4
  %85 = load i64* %diff, align 8
  %86 = load i64* %rem, align 8
  %cmp92 = icmp ugt i64 %85, %86
  br i1 %cmp92, label %if.then93, label %if.end98

if.then93:                                        ; preds = %cond.end
  %87 = load i64* %diff, align 8
  %88 = load i64* %rem, align 8
  %sub94 = sub i64 %87, %88
  %89 = load i64* %m.addr, align 8
  %cmp95 = icmp ugt i64 %sub94, %89
  br i1 %cmp95, label %if.then96, label %if.else

if.then96:                                        ; preds = %if.then93
  store i32 2, i32* %error, align 4
  br label %if.end97

if.else:                                          ; preds = %if.then93
  store i32 1, i32* %error, align 4
  br label %if.end97

if.end97:                                         ; preds = %if.else, %if.then96
  br label %if.end98

if.end98:                                         ; preds = %if.end97, %cond.end
  %90 = load i32* %error, align 4
  %91 = load i32* %q, align 4
  %sub99 = sub i32 %91, %90
  store i32 %sub99, i32* %q, align 4
  %92 = load i64* %rem, align 8
  %93 = load i32* %error, align 4
  %conv100 = sext i32 %93 to i64
  %94 = load i64* %m.addr, align 8
  %mul101 = mul i64 %conv100, %94
  %add102 = add i64 %92, %mul101
  %95 = load i64* %diff, align 8
  %sub103 = sub i64 %add102, %95
  store i64 %sub103, i64* %rem, align 8
  %96 = load i32* %q, align 4
  %97 = load i32* %i60, align 4
  %sub104 = sub nsw i32 %97, 2
  %arrayidx105 = getelementptr inbounds [2 x i32]* %quotient, i32 0, i32 %sub104
  store i32 %96, i32* %arrayidx105, align 4
  %98 = load i32* %i60, align 4
  %arrayidx106 = getelementptr inbounds [4 x i32]* %product, i32 0, i32 %98
  store i32 0, i32* %arrayidx106, align 4
  %99 = load i64* %rem, align 8
  %shr107 = lshr i64 %99, 32
  %and108 = and i64 %shr107, 4294967295
  %conv109 = trunc i64 %and108 to i32
  %100 = load i32* %i60, align 4
  %sub110 = sub nsw i32 %100, 1
  %arrayidx111 = getelementptr inbounds [4 x i32]* %product, i32 0, i32 %sub110
  store i32 %conv109, i32* %arrayidx111, align 4
  %101 = load i64* %rem, align 8
  %and112 = and i64 %101, 4294967295
  %conv113 = trunc i64 %and112 to i32
  %102 = load i32* %i60, align 4
  %sub114 = sub nsw i32 %102, 2
  %arrayidx115 = getelementptr inbounds [4 x i32]* %product, i32 0, i32 %sub114
  store i32 %conv113, i32* %arrayidx115, align 4
  br label %for.inc116

for.inc116:                                       ; preds = %if.end98
  %103 = load i32* %i60, align 4
  %dec = add nsw i32 %103, -1
  store i32 %dec, i32* %i60, align 4
  br label %for.cond61

for.end117:                                       ; preds = %for.cond61
  %quotient119 = getelementptr inbounds %"struct.boost::random::detail::div_t"* %result118, i32 0, i32 0
  %arrayidx120 = getelementptr inbounds [2 x i32]* %quotient, i32 0, i32 1
  %104 = load i32* %arrayidx120, align 4
  %conv121 = zext i32 %104 to i64
  %shl122 = shl i64 %conv121, 32
  %arrayidx123 = getelementptr inbounds [2 x i32]* %quotient, i32 0, i32 0
  %105 = load i32* %arrayidx123, align 4
  %conv124 = zext i32 %105 to i64
  %or125 = or i64 %shl122, %conv124
  store i64 %or125, i64* %quotient119, align 4
  %remainder126 = getelementptr inbounds %"struct.boost::random::detail::div_t"* %result118, i32 0, i32 1
  %arrayidx127 = getelementptr inbounds [4 x i32]* %product, i32 0, i32 1
  %106 = load i32* %arrayidx127, align 4
  %conv128 = zext i32 %106 to i64
  %shl129 = shl i64 %conv128, 32
  %arrayidx130 = getelementptr inbounds [4 x i32]* %product, i32 0, i32 0
  %107 = load i32* %arrayidx130, align 4
  %conv131 = zext i32 %107 to i64
  %or132 = or i64 %shl129, %conv131
  %108 = load i32* %shift, align 4
  %sh_prom133 = zext i32 %108 to i64
  %shr134 = lshr i64 %or132, %sh_prom133
  store i64 %shr134, i64* %remainder126, align 4
  %109 = bitcast %"struct.boost::random::detail::div_t"* %agg.result to i8*
  %110 = bitcast %"struct.boost::random::detail::div_t"* %result118 to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %109, i8* %110, i32 16, i32 4, i1 false)
  br label %return

return:                                           ; preds = %for.end117, %if.then44
  ret void
}

declare void @llvm.memset.p0i8.i32(i8* nocapture, i8, i32, i32, i1) nounwind

define linkonce_odr double @_ZNK5boost6random25uniform_real_distributionIdEclINS0_26linear_congruential_engineIjLj48271ELj0ELj2147483647EEEEEdRT_(%"class.boost::random::uniform_real_distribution"* %this, %"class.boost::random::linear_congruential_engine"* %eng) align 2 {
entry:
  %this.addr = alloca %"class.boost::random::uniform_real_distribution"*, align 4
  %eng.addr = alloca %"class.boost::random::linear_congruential_engine"*, align 4
  store %"class.boost::random::uniform_real_distribution"* %this, %"class.boost::random::uniform_real_distribution"** %this.addr, align 4
  store %"class.boost::random::linear_congruential_engine"* %eng, %"class.boost::random::linear_congruential_engine"** %eng.addr, align 4
  %this1 = load %"class.boost::random::uniform_real_distribution"** %this.addr
  %0 = load %"class.boost::random::linear_congruential_engine"** %eng.addr, align 4
  %_min = getelementptr inbounds %"class.boost::random::uniform_real_distribution"* %this1, i32 0, i32 0
  %1 = load double* %_min, align 4
  %_max = getelementptr inbounds %"class.boost::random::uniform_real_distribution"* %this1, i32 0, i32 1
  %2 = load double* %_max, align 4
  %call = call double @_ZN5boost6random6detail21generate_uniform_realINS0_26linear_congruential_engineIjLj48271ELj0ELj2147483647EEEdEET0_RT_S5_S5_(%"class.boost::random::linear_congruential_engine"* %0, double %1, double %2)
  ret double %call
}

define linkonce_odr %"class.boost::random::linear_congruential_engine"* @_ZN5boost6random17variate_generatorIRNS0_26linear_congruential_engineIjLj48271ELj0ELj2147483647EEENS_12uniform_realIdEEE6engineEv(%"class.boost::random::variate_generator.0"* %this) nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::random::variate_generator.0"*, align 4
  store %"class.boost::random::variate_generator.0"* %this, %"class.boost::random::variate_generator.0"** %this.addr, align 4
  %this1 = load %"class.boost::random::variate_generator.0"** %this.addr
  %_eng = getelementptr inbounds %"class.boost::random::variate_generator.0"* %this1, i32 0, i32 0
  %ref = load %"class.boost::random::linear_congruential_engine"** %_eng, align 4
  %call = call %"class.boost::random::linear_congruential_engine"* @_ZN5boost6random6detail10ptr_helperIRNS0_26linear_congruential_engineIjLj48271ELj0ELj2147483647EEEE3refES5_(%"class.boost::random::linear_congruential_engine"* %ref)
  ret %"class.boost::random::linear_congruential_engine"* %call
}

define linkonce_odr double @_ZN5boost6random6detail21generate_uniform_realINS0_26linear_congruential_engineIjLj48271ELj0ELj2147483647EEEdEET0_RT_S5_S5_(%"class.boost::random::linear_congruential_engine"* %eng, double %min_value, double %max_value) inlinehint {
entry:
  %eng.addr = alloca %"class.boost::random::linear_congruential_engine"*, align 4
  %min_value.addr = alloca double, align 8
  %max_value.addr = alloca double, align 8
  %agg.tmp = alloca %"struct.mpl_::bool_", align 1
  %ref.tmp = alloca %"struct.boost::is_integral", align 1
  store %"class.boost::random::linear_congruential_engine"* %eng, %"class.boost::random::linear_congruential_engine"** %eng.addr, align 4
  store double %min_value, double* %min_value.addr, align 8
  store double %max_value, double* %max_value.addr, align 8
  %0 = load %"class.boost::random::linear_congruential_engine"** %eng.addr, align 4
  %1 = load double* %min_value.addr, align 8
  %2 = load double* %max_value.addr, align 8
  %3 = bitcast %"struct.boost::is_integral"* %ref.tmp to %"struct.mpl_::bool_"*
  %call = call double @_ZN5boost6random6detail21generate_uniform_realINS0_26linear_congruential_engineIjLj48271ELj0ELj2147483647EEEdEET0_RT_S5_S5_N4mpl_5bool_ILb1EEE(%"class.boost::random::linear_congruential_engine"* %0, double %1, double %2)
  ret double %call
}

define linkonce_odr double @_ZN5boost6random6detail21generate_uniform_realINS0_26linear_congruential_engineIjLj48271ELj0ELj2147483647EEEdEET0_RT_S5_S5_N4mpl_5bool_ILb1EEE(%"class.boost::random::linear_congruential_engine"* %eng, double %min_value, double %max_value) {
entry:
  %eng.addr = alloca %"class.boost::random::linear_congruential_engine"*, align 4
  %min_value.addr = alloca double, align 8
  %max_value.addr = alloca double, align 8
  %0 = alloca %"struct.mpl_::bool_", align 1
  %numerator = alloca double, align 8
  %tmp = alloca %"struct.boost::random::detail::subtract.2", align 1
  %divisor = alloca double, align 8
  %tmp4 = alloca %"struct.boost::random::detail::subtract.2", align 1
  %result = alloca double, align 8
  store %"class.boost::random::linear_congruential_engine"* %eng, %"class.boost::random::linear_congruential_engine"** %eng.addr, align 4
  store double %min_value, double* %min_value.addr, align 8
  store double %max_value, double* %max_value.addr, align 8
  br label %for.cond

for.cond:                                         ; preds = %if.end, %entry
  %1 = load %"class.boost::random::linear_congruential_engine"** %eng.addr, align 4
  %call = call i32 @_ZN5boost6random26linear_congruential_engineIjLj48271ELj0ELj2147483647EEclEv(%"class.boost::random::linear_congruential_engine"* %1)
  %2 = load %"class.boost::random::linear_congruential_engine"** %eng.addr, align 4
  %call1 = call i32 @_ZN5boost6random26linear_congruential_engineIjLj48271ELj0ELj2147483647EE3minEv()
  %call2 = call i32 @_ZN5boost6random6detail8subtractIjLb0EEclEjj(%"struct.boost::random::detail::subtract.2"* %tmp, i32 %call, i32 %call1)
  %conv = uitofp i32 %call2 to double
  store double %conv, double* %numerator, align 8
  %3 = load %"class.boost::random::linear_congruential_engine"** %eng.addr, align 4
  %call5 = call i32 @_ZN5boost6random26linear_congruential_engineIjLj48271ELj0ELj2147483647EE3maxEv()
  %4 = load %"class.boost::random::linear_congruential_engine"** %eng.addr, align 4
  %call6 = call i32 @_ZN5boost6random26linear_congruential_engineIjLj48271ELj0ELj2147483647EE3minEv()
  %call7 = call i32 @_ZN5boost6random6detail8subtractIjLb0EEclEjj(%"struct.boost::random::detail::subtract.2"* %tmp4, i32 %call5, i32 %call6)
  %conv8 = uitofp i32 %call7 to double
  %add = fadd double %conv8, 1.000000e+00
  store double %add, double* %divisor, align 8
  %5 = load double* %divisor, align 8
  %cmp = fcmp ogt double %5, 0.000000e+00
  br i1 %cmp, label %cond.true, label %cond.false

cond.true:                                        ; preds = %for.cond
  br label %cond.end

cond.false:                                       ; preds = %for.cond
  call void @__assert_fail(i8* getelementptr inbounds ([12 x i8]* @.str14, i32 0, i32 0), i8* getelementptr inbounds ([69 x i8]* @.str15, i32 0, i32 0), i32 59, i8* getelementptr inbounds ([183 x i8]* @__PRETTY_FUNCTION__._ZN5boost6random6detail21generate_uniform_realINS0_26linear_congruential_engineIjLj48271ELj0ELj2147483647EEEdEET0_RT_S5_S5_N4mpl_5bool_ILb1EEE, i32 0, i32 0)) noreturn nounwind
  unreachable
                                                  ; No predecessors!
  br label %cond.end

cond.end:                                         ; preds = %6, %cond.true
  %7 = load double* %numerator, align 8
  %cmp9 = fcmp oge double %7, 0.000000e+00
  br i1 %cmp9, label %land.lhs.true, label %cond.false12

land.lhs.true:                                    ; preds = %cond.end
  %8 = load double* %numerator, align 8
  %9 = load double* %divisor, align 8
  %cmp10 = fcmp ole double %8, %9
  br i1 %cmp10, label %cond.true11, label %cond.false12

cond.true11:                                      ; preds = %land.lhs.true
  br label %cond.end13

cond.false12:                                     ; preds = %land.lhs.true, %cond.end
  call void @__assert_fail(i8* getelementptr inbounds ([39 x i8]* @.str16, i32 0, i32 0), i8* getelementptr inbounds ([69 x i8]* @.str15, i32 0, i32 0), i32 60, i8* getelementptr inbounds ([183 x i8]* @__PRETTY_FUNCTION__._ZN5boost6random6detail21generate_uniform_realINS0_26linear_congruential_engineIjLj48271ELj0ELj2147483647EEEdEET0_RT_S5_S5_N4mpl_5bool_ILb1EEE, i32 0, i32 0)) noreturn nounwind
  unreachable
                                                  ; No predecessors!
  br label %cond.end13

cond.end13:                                       ; preds = %10, %cond.true11
  %11 = load double* %numerator, align 8
  %12 = load double* %divisor, align 8
  %div = fdiv double %11, %12
  %13 = load double* %max_value.addr, align 8
  %14 = load double* %min_value.addr, align 8
  %sub = fsub double %13, %14
  %mul = fmul double %div, %sub
  %15 = load double* %min_value.addr, align 8
  %add15 = fadd double %mul, %15
  store double %add15, double* %result, align 8
  %16 = load double* %result, align 8
  %17 = load double* %max_value.addr, align 8
  %cmp16 = fcmp olt double %16, %17
  br i1 %cmp16, label %if.then, label %if.end

if.then:                                          ; preds = %cond.end13
  %18 = load double* %result, align 8
  ret double %18

if.end:                                           ; preds = %cond.end13
  br label %for.cond
}

define linkonce_odr void @_ZN5boost6random17variate_generatorIRNS0_26linear_congruential_engineIjLj48271ELj0ELj2147483647EEENS_12uniform_realIdEEEC2ES4_S6_(%"class.boost::random::variate_generator.0"* %this, %"class.boost::random::linear_congruential_engine"* %e, %"class.boost::uniform_real"* byval align 4 %d) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::random::variate_generator.0"*, align 4
  %e.addr = alloca %"class.boost::random::linear_congruential_engine"*, align 4
  store %"class.boost::random::variate_generator.0"* %this, %"class.boost::random::variate_generator.0"** %this.addr, align 4
  store %"class.boost::random::linear_congruential_engine"* %e, %"class.boost::random::linear_congruential_engine"** %e.addr, align 4
  %this1 = load %"class.boost::random::variate_generator.0"** %this.addr
  %0 = getelementptr inbounds %"class.boost::random::variate_generator.0"* %this1, i32 0, i32 0
  %1 = load %"class.boost::random::linear_congruential_engine"** %e.addr, align 4
  store %"class.boost::random::linear_congruential_engine"* %1, %"class.boost::random::linear_congruential_engine"** %0, align 4
  %_dist = getelementptr inbounds %"class.boost::random::variate_generator.0"* %this1, i32 0, i32 1
  %2 = bitcast %"class.boost::uniform_real"* %_dist to i8*
  %3 = bitcast %"class.boost::uniform_real"* %d to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %2, i8* %3, i32 16, i32 4, i1 false)
  ret void
}

define linkonce_odr void @_ZN5boost12uniform_realIdEC2Edd(%"class.boost::uniform_real"* %this, double %min_arg, double %max_arg) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::uniform_real"*, align 4
  %min_arg.addr = alloca double, align 8
  %max_arg.addr = alloca double, align 8
  store %"class.boost::uniform_real"* %this, %"class.boost::uniform_real"** %this.addr, align 4
  store double %min_arg, double* %min_arg.addr, align 8
  store double %max_arg, double* %max_arg.addr, align 8
  %this1 = load %"class.boost::uniform_real"** %this.addr
  %0 = bitcast %"class.boost::uniform_real"* %this1 to %"class.boost::random::uniform_real_distribution"*
  %1 = load double* %min_arg.addr, align 8
  %2 = load double* %max_arg.addr, align 8
  call void @_ZN5boost6random25uniform_real_distributionIdEC2Edd(%"class.boost::random::uniform_real_distribution"* %0, double %1, double %2)
  %3 = load double* %min_arg.addr, align 8
  %4 = load double* %max_arg.addr, align 8
  %cmp = fcmp ole double %3, %4
  br i1 %cmp, label %cond.true, label %cond.false

cond.true:                                        ; preds = %entry
  br label %cond.end

cond.false:                                       ; preds = %entry
  call void @__assert_fail(i8* getelementptr inbounds ([19 x i8]* @.str17, i32 0, i32 0), i8* getelementptr inbounds ([56 x i8]* @.str18, i32 0, i32 0), i32 66, i8* getelementptr inbounds ([82 x i8]* @__PRETTY_FUNCTION__._ZN5boost12uniform_realIdEC2Edd, i32 0, i32 0)) noreturn nounwind
  unreachable
                                                  ; No predecessors!
  br label %cond.end

cond.end:                                         ; preds = %5, %cond.true
  ret void
}

define linkonce_odr void @_ZN5boost6random25uniform_real_distributionIdEC2Edd(%"class.boost::random::uniform_real_distribution"* %this, double %min_arg, double %max_arg) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::random::uniform_real_distribution"*, align 4
  %min_arg.addr = alloca double, align 8
  %max_arg.addr = alloca double, align 8
  store %"class.boost::random::uniform_real_distribution"* %this, %"class.boost::random::uniform_real_distribution"** %this.addr, align 4
  store double %min_arg, double* %min_arg.addr, align 8
  store double %max_arg, double* %max_arg.addr, align 8
  %this1 = load %"class.boost::random::uniform_real_distribution"** %this.addr
  %_min = getelementptr inbounds %"class.boost::random::uniform_real_distribution"* %this1, i32 0, i32 0
  %0 = load double* %min_arg.addr, align 8
  store double %0, double* %_min, align 4
  %_max = getelementptr inbounds %"class.boost::random::uniform_real_distribution"* %this1, i32 0, i32 1
  %1 = load double* %max_arg.addr, align 8
  store double %1, double* %_max, align 4
  %2 = load double* %min_arg.addr, align 8
  %3 = load double* %max_arg.addr, align 8
  %cmp = fcmp ole double %2, %3
  br i1 %cmp, label %cond.true, label %cond.false

cond.true:                                        ; preds = %entry
  br label %cond.end

cond.false:                                       ; preds = %entry
  call void @__assert_fail(i8* getelementptr inbounds ([19 x i8]* @.str17, i32 0, i32 0), i8* getelementptr inbounds ([69 x i8]* @.str15, i32 0, i32 0), i32 157, i8* getelementptr inbounds ([116 x i8]* @__PRETTY_FUNCTION__._ZN5boost6random25uniform_real_distributionIdEC2Edd, i32 0, i32 0)) noreturn nounwind
  unreachable
                                                  ; No predecessors!
  br label %cond.end

cond.end:                                         ; preds = %4, %cond.true
  ret void
}

define linkonce_odr void @_ZN5boost6random26linear_congruential_engineIjLj48271ELj0ELj2147483647EEC2ERKj(%"class.boost::random::linear_congruential_engine"* %this, i32* %x0) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::random::linear_congruential_engine"*, align 4
  %x0.addr = alloca i32*, align 4
  store %"class.boost::random::linear_congruential_engine"* %this, %"class.boost::random::linear_congruential_engine"** %this.addr, align 4
  store i32* %x0, i32** %x0.addr, align 4
  %this1 = load %"class.boost::random::linear_congruential_engine"** %this.addr
  %0 = load i32** %x0.addr, align 4
  call void @_ZN5boost6random26linear_congruential_engineIjLj48271ELj0ELj2147483647EE4seedERKj(%"class.boost::random::linear_congruential_engine"* %this1, i32* %0)
  ret void
}

define linkonce_odr void @_ZN5boost6detail23postfix_increment_proxyINS_18generator_iteratorINS_6random17variate_generatorIRNS3_26linear_congruential_engineIjLj48271ELj0ELj2147483647EEENS_11uniform_intIiEEEEEEEC1ERKSB_(%"class.boost::detail::postfix_increment_proxy"* %this, %"class.boost::generator_iterator"* %x) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::detail::postfix_increment_proxy"*, align 4
  %x.addr = alloca %"class.boost::generator_iterator"*, align 4
  store %"class.boost::detail::postfix_increment_proxy"* %this, %"class.boost::detail::postfix_increment_proxy"** %this.addr, align 4
  store %"class.boost::generator_iterator"* %x, %"class.boost::generator_iterator"** %x.addr, align 4
  %this1 = load %"class.boost::detail::postfix_increment_proxy"** %this.addr
  %0 = load %"class.boost::generator_iterator"** %x.addr
  call void @_ZN5boost6detail23postfix_increment_proxyINS_18generator_iteratorINS_6random17variate_generatorIRNS3_26linear_congruential_engineIjLj48271ELj0ELj2147483647EEENS_11uniform_intIiEEEEEEEC2ERKSB_(%"class.boost::detail::postfix_increment_proxy"* %this1, %"class.boost::generator_iterator"* %0)
  ret void
}

define linkonce_odr %"class.boost::generator_iterator"* @_ZN5boost15iterator_facadeINS_18generator_iteratorINS_6random17variate_generatorIRNS2_26linear_congruential_engineIjLj48271ELj0ELj2147483647EEENS_11uniform_intIiEEEEEEiNS_25single_pass_traversal_tagERKiiEppEv(%"class.boost::iterator_facade"* %this) align 2 {
entry:
  %this.addr = alloca %"class.boost::iterator_facade"*, align 4
  store %"class.boost::iterator_facade"* %this, %"class.boost::iterator_facade"** %this.addr, align 4
  %this1 = load %"class.boost::iterator_facade"** %this.addr
  %call = call %"class.boost::generator_iterator"* @_ZN5boost15iterator_facadeINS_18generator_iteratorINS_6random17variate_generatorIRNS2_26linear_congruential_engineIjLj48271ELj0ELj2147483647EEENS_11uniform_intIiEEEEEEiNS_25single_pass_traversal_tagERKiiE7derivedEv(%"class.boost::iterator_facade"* %this1)
  call void @_ZN5boost20iterator_core_access9incrementINS_18generator_iteratorINS_6random17variate_generatorIRNS3_26linear_congruential_engineIjLj48271ELj0ELj2147483647EEENS_11uniform_intIiEEEEEEEEvRT_(%"class.boost::generator_iterator"* %call)
  %call2 = call %"class.boost::generator_iterator"* @_ZN5boost15iterator_facadeINS_18generator_iteratorINS_6random17variate_generatorIRNS2_26linear_congruential_engineIjLj48271ELj0ELj2147483647EEENS_11uniform_intIiEEEEEEiNS_25single_pass_traversal_tagERKiiE7derivedEv(%"class.boost::iterator_facade"* %this1)
  ret %"class.boost::generator_iterator"* %call2
}

define linkonce_odr void @_ZN5boost20iterator_core_access9incrementINS_18generator_iteratorINS_6random17variate_generatorIRNS3_26linear_congruential_engineIjLj48271ELj0ELj2147483647EEENS_11uniform_intIiEEEEEEEEvRT_(%"class.boost::generator_iterator"* %f) align 2 {
entry:
  %f.addr = alloca %"class.boost::generator_iterator"*, align 4
  store %"class.boost::generator_iterator"* %f, %"class.boost::generator_iterator"** %f.addr, align 4
  %0 = load %"class.boost::generator_iterator"** %f.addr, align 4
  call void @_ZN5boost18generator_iteratorINS_6random17variate_generatorIRNS1_26linear_congruential_engineIjLj48271ELj0ELj2147483647EEENS_11uniform_intIiEEEEE9incrementEv(%"class.boost::generator_iterator"* %0)
  ret void
}

define linkonce_odr %"class.boost::generator_iterator"* @_ZN5boost15iterator_facadeINS_18generator_iteratorINS_6random17variate_generatorIRNS2_26linear_congruential_engineIjLj48271ELj0ELj2147483647EEENS_11uniform_intIiEEEEEEiNS_25single_pass_traversal_tagERKiiE7derivedEv(%"class.boost::iterator_facade"* %this) nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::iterator_facade"*, align 4
  store %"class.boost::iterator_facade"* %this, %"class.boost::iterator_facade"** %this.addr, align 4
  %this1 = load %"class.boost::iterator_facade"** %this.addr
  %0 = bitcast %"class.boost::iterator_facade"* %this1 to %"class.boost::generator_iterator"*
  ret %"class.boost::generator_iterator"* %0
}

define linkonce_odr void @_ZN5boost18generator_iteratorINS_6random17variate_generatorIRNS1_26linear_congruential_engineIjLj48271ELj0ELj2147483647EEENS_11uniform_intIiEEEEE9incrementEv(%"class.boost::generator_iterator"* %this) align 2 {
entry:
  %this.addr = alloca %"class.boost::generator_iterator"*, align 4
  store %"class.boost::generator_iterator"* %this, %"class.boost::generator_iterator"** %this.addr, align 4
  %this1 = load %"class.boost::generator_iterator"** %this.addr
  %m_g = getelementptr inbounds %"class.boost::generator_iterator"* %this1, i32 0, i32 0
  %0 = load %"class.boost::random::variate_generator"** %m_g, align 4
  %call = call i32 @_ZN5boost6random17variate_generatorIRNS0_26linear_congruential_engineIjLj48271ELj0ELj2147483647EEENS_11uniform_intIiEEEclEv(%"class.boost::random::variate_generator"* %0)
  %m_value = getelementptr inbounds %"class.boost::generator_iterator"* %this1, i32 0, i32 1
  store i32 %call, i32* %m_value, align 4
  ret void
}

define linkonce_odr void @_ZN5boost6detail23postfix_increment_proxyINS_18generator_iteratorINS_6random17variate_generatorIRNS3_26linear_congruential_engineIjLj48271ELj0ELj2147483647EEENS_11uniform_intIiEEEEEEEC2ERKSB_(%"class.boost::detail::postfix_increment_proxy"* %this, %"class.boost::generator_iterator"* %x) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::detail::postfix_increment_proxy"*, align 4
  %x.addr = alloca %"class.boost::generator_iterator"*, align 4
  store %"class.boost::detail::postfix_increment_proxy"* %this, %"class.boost::detail::postfix_increment_proxy"** %this.addr, align 4
  store %"class.boost::generator_iterator"* %x, %"class.boost::generator_iterator"** %x.addr, align 4
  %this1 = load %"class.boost::detail::postfix_increment_proxy"** %this.addr
  %stored_value = getelementptr inbounds %"class.boost::detail::postfix_increment_proxy"* %this1, i32 0, i32 0
  %0 = load %"class.boost::generator_iterator"** %x.addr, align 4
  %1 = bitcast %"class.boost::generator_iterator"* %0 to %"class.boost::iterator_facade"*
  %call = call i32* @_ZNK5boost15iterator_facadeINS_18generator_iteratorINS_6random17variate_generatorIRNS2_26linear_congruential_engineIjLj48271ELj0ELj2147483647EEENS_11uniform_intIiEEEEEEiNS_25single_pass_traversal_tagERKiiEdeEv(%"class.boost::iterator_facade"* %1)
  %2 = load i32* %call
  store i32 %2, i32* %stored_value, align 4
  ret void
}

define linkonce_odr i32* @_ZNK5boost15iterator_facadeINS_18generator_iteratorINS_6random17variate_generatorIRNS2_26linear_congruential_engineIjLj48271ELj0ELj2147483647EEENS_11uniform_intIiEEEEEEiNS_25single_pass_traversal_tagERKiiEdeEv(%"class.boost::iterator_facade"* %this) align 2 {
entry:
  %this.addr = alloca %"class.boost::iterator_facade"*, align 4
  store %"class.boost::iterator_facade"* %this, %"class.boost::iterator_facade"** %this.addr, align 4
  %this1 = load %"class.boost::iterator_facade"** %this.addr
  %call = call %"class.boost::generator_iterator"* @_ZNK5boost15iterator_facadeINS_18generator_iteratorINS_6random17variate_generatorIRNS2_26linear_congruential_engineIjLj48271ELj0ELj2147483647EEENS_11uniform_intIiEEEEEEiNS_25single_pass_traversal_tagERKiiE7derivedEv(%"class.boost::iterator_facade"* %this1)
  %call2 = call i32* @_ZN5boost20iterator_core_access11dereferenceINS_18generator_iteratorINS_6random17variate_generatorIRNS3_26linear_congruential_engineIjLj48271ELj0ELj2147483647EEENS_11uniform_intIiEEEEEEEENT_9referenceERKSC_(%"class.boost::generator_iterator"* %call)
  ret i32* %call2
}

define linkonce_odr i32* @_ZN5boost20iterator_core_access11dereferenceINS_18generator_iteratorINS_6random17variate_generatorIRNS3_26linear_congruential_engineIjLj48271ELj0ELj2147483647EEENS_11uniform_intIiEEEEEEEENT_9referenceERKSC_(%"class.boost::generator_iterator"* %f) align 2 {
entry:
  %f.addr = alloca %"class.boost::generator_iterator"*, align 4
  store %"class.boost::generator_iterator"* %f, %"class.boost::generator_iterator"** %f.addr, align 4
  %0 = load %"class.boost::generator_iterator"** %f.addr, align 4
  %call = call i32* @_ZNK5boost18generator_iteratorINS_6random17variate_generatorIRNS1_26linear_congruential_engineIjLj48271ELj0ELj2147483647EEENS_11uniform_intIiEEEEE11dereferenceEv(%"class.boost::generator_iterator"* %0)
  ret i32* %call
}

define linkonce_odr %"class.boost::generator_iterator"* @_ZNK5boost15iterator_facadeINS_18generator_iteratorINS_6random17variate_generatorIRNS2_26linear_congruential_engineIjLj48271ELj0ELj2147483647EEENS_11uniform_intIiEEEEEEiNS_25single_pass_traversal_tagERKiiE7derivedEv(%"class.boost::iterator_facade"* %this) nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::iterator_facade"*, align 4
  store %"class.boost::iterator_facade"* %this, %"class.boost::iterator_facade"** %this.addr, align 4
  %this1 = load %"class.boost::iterator_facade"** %this.addr
  %0 = bitcast %"class.boost::iterator_facade"* %this1 to %"class.boost::generator_iterator"*
  ret %"class.boost::generator_iterator"* %0
}

define linkonce_odr i32* @_ZNK5boost18generator_iteratorINS_6random17variate_generatorIRNS1_26linear_congruential_engineIjLj48271ELj0ELj2147483647EEENS_11uniform_intIiEEEEE11dereferenceEv(%"class.boost::generator_iterator"* %this) nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::generator_iterator"*, align 4
  store %"class.boost::generator_iterator"* %this, %"class.boost::generator_iterator"** %this.addr, align 4
  %this1 = load %"class.boost::generator_iterator"** %this.addr
  %m_value = getelementptr inbounds %"class.boost::generator_iterator"* %this1, i32 0, i32 1
  ret i32* %m_value
}

define linkonce_odr void @_ZN5boost18generator_iteratorINS_6random17variate_generatorIRNS1_26linear_congruential_engineIjLj48271ELj0ELj2147483647EEENS_11uniform_intIiEEEEEC2EPS8_(%"class.boost::generator_iterator"* %this, %"class.boost::random::variate_generator"* %g) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::generator_iterator"*, align 4
  %g.addr = alloca %"class.boost::random::variate_generator"*, align 4
  store %"class.boost::generator_iterator"* %this, %"class.boost::generator_iterator"** %this.addr, align 4
  store %"class.boost::random::variate_generator"* %g, %"class.boost::random::variate_generator"** %g.addr, align 4
  %this1 = load %"class.boost::generator_iterator"** %this.addr
  %0 = bitcast %"class.boost::generator_iterator"* %this1 to %"class.boost::iterator_facade"*
  %m_g = getelementptr inbounds %"class.boost::generator_iterator"* %this1, i32 0, i32 0
  %1 = load %"class.boost::random::variate_generator"** %g.addr, align 4
  store %"class.boost::random::variate_generator"* %1, %"class.boost::random::variate_generator"** %m_g, align 4
  %m_value = getelementptr inbounds %"class.boost::generator_iterator"* %this1, i32 0, i32 1
  %m_g2 = getelementptr inbounds %"class.boost::generator_iterator"* %this1, i32 0, i32 0
  %2 = load %"class.boost::random::variate_generator"** %m_g2, align 4
  %call = call i32 @_ZN5boost6random17variate_generatorIRNS0_26linear_congruential_engineIjLj48271ELj0ELj2147483647EEENS_11uniform_intIiEEEclEv(%"class.boost::random::variate_generator"* %2)
  store i32 %call, i32* %m_value, align 4
  ret void
}

define linkonce_odr void @_ZN5boost6random17variate_generatorIRNS0_26linear_congruential_engineIjLj48271ELj0ELj2147483647EEENS_11uniform_intIiEEEC2ES4_S6_(%"class.boost::random::variate_generator"* %this, %"class.boost::random::linear_congruential_engine"* %e, %"class.boost::uniform_int"* byval align 4 %d) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::random::variate_generator"*, align 4
  %e.addr = alloca %"class.boost::random::linear_congruential_engine"*, align 4
  store %"class.boost::random::variate_generator"* %this, %"class.boost::random::variate_generator"** %this.addr, align 4
  store %"class.boost::random::linear_congruential_engine"* %e, %"class.boost::random::linear_congruential_engine"** %e.addr, align 4
  %this1 = load %"class.boost::random::variate_generator"** %this.addr
  %0 = getelementptr inbounds %"class.boost::random::variate_generator"* %this1, i32 0, i32 0
  %1 = load %"class.boost::random::linear_congruential_engine"** %e.addr, align 4
  store %"class.boost::random::linear_congruential_engine"* %1, %"class.boost::random::linear_congruential_engine"** %0, align 4
  %_dist = getelementptr inbounds %"class.boost::random::variate_generator"* %this1, i32 0, i32 1
  %2 = bitcast %"class.boost::uniform_int"* %_dist to i8*
  %3 = bitcast %"class.boost::uniform_int"* %d to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %2, i8* %3, i32 8, i32 4, i1 false)
  ret void
}

define linkonce_odr void @_ZN5boost11uniform_intIiEC2Eii(%"class.boost::uniform_int"* %this, i32 %min_arg, i32 %max_arg) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::uniform_int"*, align 4
  %min_arg.addr = alloca i32, align 4
  %max_arg.addr = alloca i32, align 4
  store %"class.boost::uniform_int"* %this, %"class.boost::uniform_int"** %this.addr, align 4
  store i32 %min_arg, i32* %min_arg.addr, align 4
  store i32 %max_arg, i32* %max_arg.addr, align 4
  %this1 = load %"class.boost::uniform_int"** %this.addr
  %0 = bitcast %"class.boost::uniform_int"* %this1 to %"class.boost::random::uniform_int_distribution"*
  %1 = load i32* %min_arg.addr, align 4
  %2 = load i32* %max_arg.addr, align 4
  call void @_ZN5boost6random24uniform_int_distributionIiEC2Eii(%"class.boost::random::uniform_int_distribution"* %0, i32 %1, i32 %2)
  ret void
}

define linkonce_odr void @_ZN5boost6random24uniform_int_distributionIiEC2Eii(%"class.boost::random::uniform_int_distribution"* %this, i32 %min_arg, i32 %max_arg) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::random::uniform_int_distribution"*, align 4
  %min_arg.addr = alloca i32, align 4
  %max_arg.addr = alloca i32, align 4
  store %"class.boost::random::uniform_int_distribution"* %this, %"class.boost::random::uniform_int_distribution"** %this.addr, align 4
  store i32 %min_arg, i32* %min_arg.addr, align 4
  store i32 %max_arg, i32* %max_arg.addr, align 4
  %this1 = load %"class.boost::random::uniform_int_distribution"** %this.addr
  %_min = getelementptr inbounds %"class.boost::random::uniform_int_distribution"* %this1, i32 0, i32 0
  %0 = load i32* %min_arg.addr, align 4
  store i32 %0, i32* %_min, align 4
  %_max = getelementptr inbounds %"class.boost::random::uniform_int_distribution"* %this1, i32 0, i32 1
  %1 = load i32* %max_arg.addr, align 4
  store i32 %1, i32* %_max, align 4
  %2 = load i32* %min_arg.addr, align 4
  %3 = load i32* %max_arg.addr, align 4
  %cmp = icmp sle i32 %2, %3
  br i1 %cmp, label %cond.true, label %cond.false

cond.true:                                        ; preds = %entry
  br label %cond.end

cond.false:                                       ; preds = %entry
  call void @__assert_fail(i8* getelementptr inbounds ([19 x i8]* @.str17, i32 0, i32 0), i8* getelementptr inbounds ([68 x i8]* @.str19, i32 0, i32 0), i32 318, i8* getelementptr inbounds ([105 x i8]* @__PRETTY_FUNCTION__._ZN5boost6random24uniform_int_distributionIiEC2Eii, i32 0, i32 0)) noreturn nounwind
  unreachable
                                                  ; No predecessors!
  br label %cond.end

cond.end:                                         ; preds = %4, %cond.true
  ret void
}

define linkonce_odr i32* @_ZStoRRSt13_Ios_FmtflagsS_(i32* %__a, i32 %__b) inlinehint {
entry:
  %__a.addr = alloca i32*, align 4
  %__b.addr = alloca i32, align 4
  store i32* %__a, i32** %__a.addr, align 4
  store i32 %__b, i32* %__b.addr, align 4
  %0 = load i32** %__a.addr, align 4
  %1 = load i32* %0, align 4
  %2 = load i32* %__b.addr, align 4
  %call = call i32 @_ZStorSt13_Ios_FmtflagsS_(i32 %1, i32 %2)
  %3 = load i32** %__a.addr, align 4
  store i32 %call, i32* %3, align 4
  ret i32* %3
}

define linkonce_odr i32 @_ZStorSt13_Ios_FmtflagsS_(i32 %__a, i32 %__b) nounwind inlinehint {
entry:
  %__a.addr = alloca i32, align 4
  %__b.addr = alloca i32, align 4
  store i32 %__a, i32* %__a.addr, align 4
  store i32 %__b, i32* %__b.addr, align 4
  %0 = load i32* %__a.addr, align 4
  %1 = load i32* %__b.addr, align 4
  %or = or i32 %0, %1
  ret i32 %or
}

define internal void @_GLOBAL__I_a() section ".text.startup" {
entry:
  call void @__cxx_global_var_init()
  ret void
}
