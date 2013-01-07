; ModuleID = 'search_example.cpp'
target datalayout = "e-p:32:32:32-i1:8:8-i8:8:8-i16:16:16-i32:32:32-i64:32:64-f32:32:32-f64:32:64-v64:64:64-v128:128:128-a0:0:64-f80:32:32-n8:16:32-S128"
target triple = "i386-pc-linux-gnu"

%"class.std::ios_base::Init" = type { i8 }
%"class.std::basic_string" = type { %"struct.std::basic_string<char, std::char_traits<char>, std::allocator<char> >::_Alloc_hider" }
%"struct.std::basic_string<char, std::char_traits<char>, std::allocator<char> >::_Alloc_hider" = type { i8* }
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
%"class.std::allocator" = type { i8 }
%"class.__gnu_cxx::__normal_iterator" = type { i8* }
%"class.boost::algorithm::boyer_moore" = type { %"class.__gnu_cxx::__normal_iterator", %"class.__gnu_cxx::__normal_iterator", i32, %"class.boost::algorithm::detail::skip_table", %"class.std::vector" }
%"class.boost::algorithm::detail::skip_table" = type { %"class.boost::array", i32 }
%"class.boost::array" = type { [256 x i32] }
%"class.std::vector" = type { %"struct.std::_Vector_base" }
%"struct.std::_Vector_base" = type { %"struct.std::_Vector_base<int, std::allocator<int> >::_Vector_impl" }
%"struct.std::_Vector_base<int, std::allocator<int> >::_Vector_impl" = type { i32*, i32*, i32* }
%"class.boost::algorithm::boyer_moore_horspool" = type { %"class.__gnu_cxx::__normal_iterator", %"class.__gnu_cxx::__normal_iterator", i32, %"class.boost::algorithm::detail::skip_table" }
%"class.boost::algorithm::knuth_morris_pratt" = type { %"class.__gnu_cxx::__normal_iterator", %"class.__gnu_cxx::__normal_iterator", i32, %"class.std::vector" }
%"class.std::allocator.0" = type { i8 }
%"class.__gnu_cxx::new_allocator.1" = type { i8 }
%"struct.std::random_access_iterator_tag" = type { i8 }
%"class.std::vector.3" = type { %"struct.std::_Vector_base.4" }
%"struct.std::_Vector_base.4" = type { %"struct.std::_Vector_base<char, std::allocator<char> >::_Vector_impl" }
%"struct.std::_Vector_base<char, std::allocator<char> >::_Vector_impl" = type { i8*, i8*, i8* }
%"class.__gnu_cxx::__normal_iterator.5" = type { i8* }
%"class.__gnu_cxx::new_allocator" = type { i8 }

@_ZStL8__ioinit = internal global %"class.std::ios_base::Init" zeroinitializer, align 1
@__dso_handle = external unnamed_addr global i8
@_ZL8haystack = internal global %"class.std::basic_string" zeroinitializer, align 4
@.str = private unnamed_addr constant [25 x i8] c"ABACAB is it everywhere!\00", align 1
@_ZL7needle1 = internal global %"class.std::basic_string" zeroinitializer, align 4
@.str3 = private unnamed_addr constant [5 x i8] c"ACAB\00", align 1
@_ZL7needle2 = internal global %"class.std::basic_string" zeroinitializer, align 4
@.str5 = private unnamed_addr constant [8 x i8] c"not ABA\00", align 1
@_ZSt4cout = external global %"class.std::basic_ostream"
@.str6 = private unnamed_addr constant [8 x i8] c"Found '\00", align 1
@.str7 = private unnamed_addr constant [8 x i8] c"'  in '\00", align 1
@.str8 = private unnamed_addr constant [18 x i8] c"' (boyer-moore 1)\00", align 1
@.str9 = private unnamed_addr constant [15 x i8] c"Did NOT find '\00", align 1
@.str10 = private unnamed_addr constant [18 x i8] c"' (boyer-moore 2)\00", align 1
@.str11 = private unnamed_addr constant [25 x i8] c"' (boyer-moore-horspool)\00", align 1
@.str12 = private unnamed_addr constant [23 x i8] c"' (knuth_morris_pratt)\00", align 1
@.str13 = private unnamed_addr constant [6 x i8] c"i < N\00", align 1
@.str14 = private unnamed_addr constant [13 x i8] c"out of range\00", align 1
@__PRETTY_FUNCTION__._ZNK5boost5arrayIiLj256EEixEj = private unnamed_addr constant [87 x i8] c"const_reference boost::array<int, 256>::operator[](size_type) const [T = int, N = 256]\00", align 1
@.str15 = private unnamed_addr constant [42 x i8] c"/home/thomas/boost_1_52_0/boost/array.hpp\00", align 1
@_ZSt4cerr = external global %"class.std::basic_ostream"
@.str16 = private unnamed_addr constant [43 x i8] c"***** Internal Program Error - assertion (\00", align 1
@.str17 = private unnamed_addr constant [13 x i8] c") failed in \00", align 1
@.str18 = private unnamed_addr constant [3 x i8] c":\0A\00", align 1
@.str19 = private unnamed_addr constant [4 x i8] c"): \00", align 1
@__PRETTY_FUNCTION__._ZN5boost5arrayIiLj256EEixEj = private unnamed_addr constant [75 x i8] c"reference boost::array<int, 256>::operator[](size_type) [T = int, N = 256]\00", align 1
@.str20 = private unnamed_addr constant [10 x i8] c"count > 0\00", align 1
@.str21 = private unnamed_addr constant [68 x i8] c"/home/thomas/boost_1_52_0/boost/algorithm/searching/boyer_moore.hpp\00", align 1
@__PRETTY_FUNCTION__._ZN5boost9algorithm11boyer_mooreIN9__gnu_cxx17__normal_iteratorIPKcSsEENS0_6detail9BM_traitsIS6_EEE17compute_bm_prefixINS3_IPcSt6vectorIcSaIcEEEESD_IiSaIiEEEEvT_SJ_RT0_ = private unnamed_addr constant [596 x i8] c"void boost::algorithm::boyer_moore<__gnu_cxx::__normal_iterator<const char *, std::basic_string<char> >, boost::algorithm::detail::BM_traits<__gnu_cxx::__normal_iterator<const char *, std::basic_string<char> > > >::compute_bm_prefix(Iter, Iter, Container &) [patIter = __gnu_cxx::__normal_iterator<const char *, std::basic_string<char> >, traits = boost::algorithm::detail::BM_traits<__gnu_cxx::__normal_iterator<const char *, std::basic_string<char> > >, Iter = __gnu_cxx::__normal_iterator<char *, std::vector<char, std::allocator<char> > >, Container = std::vector<int, std::allocator<int> >]\00", align 1
@.str22 = private unnamed_addr constant [24 x i8] c"prefix.size () == count\00", align 1
@.str23 = private unnamed_addr constant [10 x i8] c"k < count\00", align 1
@__PRETTY_FUNCTION__._ZN5boost9algorithm11boyer_mooreIN9__gnu_cxx17__normal_iteratorIPKcSsEENS0_6detail9BM_traitsIS6_EEE17compute_bm_prefixIS6_St6vectorIiSaIiEEEEvT_SF_RT0_ = private unnamed_addr constant [585 x i8] c"void boost::algorithm::boyer_moore<__gnu_cxx::__normal_iterator<const char *, std::basic_string<char> >, boost::algorithm::detail::BM_traits<__gnu_cxx::__normal_iterator<const char *, std::basic_string<char> > > >::compute_bm_prefix(Iter, Iter, Container &) [patIter = __gnu_cxx::__normal_iterator<const char *, std::basic_string<char> >, traits = boost::algorithm::detail::BM_traits<__gnu_cxx::__normal_iterator<const char *, std::basic_string<char> > >, Iter = __gnu_cxx::__normal_iterator<const char *, std::basic_string<char> >, Container = std::vector<int, std::allocator<int> >]\00", align 1
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

define internal void @__cxx_global_var_init1() section ".text.startup" {
entry:
  %ref.tmp = alloca %"class.std::allocator", align 1
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  call void @_ZNSaIcEC1Ev(%"class.std::allocator"* %ref.tmp) nounwind
  invoke void @_ZNSsC1EPKcRKSaIcE(%"class.std::basic_string"* @_ZL8haystack, i8* getelementptr inbounds ([25 x i8]* @.str, i32 0, i32 0), %"class.std::allocator"* %ref.tmp)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %entry
  call void @_ZNSaIcED1Ev(%"class.std::allocator"* %ref.tmp) nounwind
  %0 = call i32 @__cxa_atexit(void (i8*)* bitcast (void (%"class.std::basic_string"*)* @_ZNSsD1Ev to void (i8*)*), i8* bitcast (%"class.std::basic_string"* @_ZL8haystack to i8*), i8* @__dso_handle) nounwind
  ret void

lpad:                                             ; preds = %entry
  %1 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %2 = extractvalue { i8*, i32 } %1, 0
  store i8* %2, i8** %exn.slot
  %3 = extractvalue { i8*, i32 } %1, 1
  store i32 %3, i32* %ehselector.slot
  call void @_ZNSaIcED1Ev(%"class.std::allocator"* %ref.tmp) nounwind
  br label %eh.resume

eh.resume:                                        ; preds = %lpad
  %exn = load i8** %exn.slot
  %sel = load i32* %ehselector.slot
  %lpad.val = insertvalue { i8*, i32 } undef, i8* %exn, 0
  %lpad.val1 = insertvalue { i8*, i32 } %lpad.val, i32 %sel, 1
  resume { i8*, i32 } %lpad.val1
}

declare void @_ZNSsC1EPKcRKSaIcE(%"class.std::basic_string"*, i8*, %"class.std::allocator"*)

declare void @_ZNSaIcEC1Ev(%"class.std::allocator"*) nounwind

declare i32 @__gxx_personality_v0(...)

declare void @_ZNSaIcED1Ev(%"class.std::allocator"*) nounwind

declare void @_ZNSsD1Ev(%"class.std::basic_string"*)

define internal void @__cxx_global_var_init2() section ".text.startup" {
entry:
  %ref.tmp = alloca %"class.std::allocator", align 1
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  call void @_ZNSaIcEC1Ev(%"class.std::allocator"* %ref.tmp) nounwind
  invoke void @_ZNSsC1EPKcRKSaIcE(%"class.std::basic_string"* @_ZL7needle1, i8* getelementptr inbounds ([5 x i8]* @.str3, i32 0, i32 0), %"class.std::allocator"* %ref.tmp)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %entry
  call void @_ZNSaIcED1Ev(%"class.std::allocator"* %ref.tmp) nounwind
  %0 = call i32 @__cxa_atexit(void (i8*)* bitcast (void (%"class.std::basic_string"*)* @_ZNSsD1Ev to void (i8*)*), i8* bitcast (%"class.std::basic_string"* @_ZL7needle1 to i8*), i8* @__dso_handle) nounwind
  ret void

lpad:                                             ; preds = %entry
  %1 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %2 = extractvalue { i8*, i32 } %1, 0
  store i8* %2, i8** %exn.slot
  %3 = extractvalue { i8*, i32 } %1, 1
  store i32 %3, i32* %ehselector.slot
  call void @_ZNSaIcED1Ev(%"class.std::allocator"* %ref.tmp) nounwind
  br label %eh.resume

eh.resume:                                        ; preds = %lpad
  %exn = load i8** %exn.slot
  %sel = load i32* %ehselector.slot
  %lpad.val = insertvalue { i8*, i32 } undef, i8* %exn, 0
  %lpad.val1 = insertvalue { i8*, i32 } %lpad.val, i32 %sel, 1
  resume { i8*, i32 } %lpad.val1
}

define internal void @__cxx_global_var_init4() section ".text.startup" {
entry:
  %ref.tmp = alloca %"class.std::allocator", align 1
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  call void @_ZNSaIcEC1Ev(%"class.std::allocator"* %ref.tmp) nounwind
  invoke void @_ZNSsC1EPKcRKSaIcE(%"class.std::basic_string"* @_ZL7needle2, i8* getelementptr inbounds ([8 x i8]* @.str5, i32 0, i32 0), %"class.std::allocator"* %ref.tmp)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %entry
  call void @_ZNSaIcED1Ev(%"class.std::allocator"* %ref.tmp) nounwind
  %0 = call i32 @__cxa_atexit(void (i8*)* bitcast (void (%"class.std::basic_string"*)* @_ZNSsD1Ev to void (i8*)*), i8* bitcast (%"class.std::basic_string"* @_ZL7needle2 to i8*), i8* @__dso_handle) nounwind
  ret void

lpad:                                             ; preds = %entry
  %1 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %2 = extractvalue { i8*, i32 } %1, 0
  store i8* %2, i8** %exn.slot
  %3 = extractvalue { i8*, i32 } %1, 1
  store i32 %3, i32* %ehselector.slot
  call void @_ZNSaIcED1Ev(%"class.std::allocator"* %ref.tmp) nounwind
  br label %eh.resume

eh.resume:                                        ; preds = %lpad
  %exn = load i8** %exn.slot
  %sel = load i32* %ehselector.slot
  %lpad.val = insertvalue { i8*, i32 } undef, i8* %exn, 0
  %lpad.val1 = insertvalue { i8*, i32 } %lpad.val, i32 %sel, 1
  resume { i8*, i32 } %lpad.val1
}

define i32 @main(i32, i8**) {
entry:
  %retval = alloca i32, align 4
  %.addr = alloca i32, align 4
  %.addr1 = alloca i8**, align 4
  %ref.tmp = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %agg.tmp = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %agg.tmp2 = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %agg.tmp3 = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %agg.tmp4 = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %ref.tmp5 = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %search1 = alloca %"class.boost::algorithm::boyer_moore", align 4
  %agg.tmp18 = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %agg.tmp19 = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %ref.tmp20 = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %agg.tmp21 = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  %agg.tmp22 = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %ref.tmp25 = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %ref.tmp56 = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %agg.tmp57 = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %agg.tmp59 = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %agg.tmp61 = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %agg.tmp63 = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %ref.tmp66 = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %ref.tmp97 = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %agg.tmp98 = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %agg.tmp100 = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %agg.tmp102 = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %agg.tmp104 = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %ref.tmp107 = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %cleanup.dest.slot = alloca i32
  store i32 0, i32* %retval
  store i32 %0, i32* %.addr, align 4
  store i8** %1, i8*** %.addr1, align 4
  call void @_ZNKSs5beginEv(%"class.__gnu_cxx::__normal_iterator"* sret %agg.tmp, %"class.std::basic_string"* @_ZL8haystack)
  call void @_ZNKSs3endEv(%"class.__gnu_cxx::__normal_iterator"* sret %agg.tmp2, %"class.std::basic_string"* @_ZL8haystack)
  call void @_ZNKSs5beginEv(%"class.__gnu_cxx::__normal_iterator"* sret %agg.tmp3, %"class.std::basic_string"* @_ZL7needle1)
  call void @_ZNKSs3endEv(%"class.__gnu_cxx::__normal_iterator"* sret %agg.tmp4, %"class.std::basic_string"* @_ZL7needle1)
  call void @_ZN5boost9algorithm18boyer_moore_searchIN9__gnu_cxx17__normal_iteratorIPKcSsEES6_EET0_S7_S7_T_S8_(%"class.__gnu_cxx::__normal_iterator"* sret %ref.tmp, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %agg.tmp, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %agg.tmp2, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %agg.tmp3, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %agg.tmp4)
  call void @_ZNKSs3endEv(%"class.__gnu_cxx::__normal_iterator"* sret %ref.tmp5, %"class.std::basic_string"* @_ZL8haystack)
  %call = call zeroext i1 @_ZN9__gnu_cxxneIPKcSsEEbRKNS_17__normal_iteratorIT_T0_EES8_(%"class.__gnu_cxx::__normal_iterator"* %ref.tmp, %"class.__gnu_cxx::__normal_iterator"* %ref.tmp5)
  br i1 %call, label %if.then, label %if.else

if.then:                                          ; preds = %entry
  %call6 = call %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* @_ZSt4cout, i8* getelementptr inbounds ([8 x i8]* @.str6, i32 0, i32 0))
  %call7 = call %"class.std::basic_ostream"* @_ZStlsIcSt11char_traitsIcESaIcEERSt13basic_ostreamIT_T0_ES7_RKSbIS4_S5_T1_E(%"class.std::basic_ostream"* %call6, %"class.std::basic_string"* @_ZL7needle1)
  %call8 = call %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* %call7, i8* getelementptr inbounds ([8 x i8]* @.str7, i32 0, i32 0))
  %call9 = call %"class.std::basic_ostream"* @_ZStlsIcSt11char_traitsIcESaIcEERSt13basic_ostreamIT_T0_ES7_RKSbIS4_S5_T1_E(%"class.std::basic_ostream"* %call8, %"class.std::basic_string"* @_ZL8haystack)
  %call10 = call %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* %call9, i8* getelementptr inbounds ([18 x i8]* @.str8, i32 0, i32 0))
  %call11 = call %"class.std::basic_ostream"* @_ZNSolsEPFRSoS_E(%"class.std::basic_ostream"* %call10, %"class.std::basic_ostream"* (%"class.std::basic_ostream"*)* @_ZSt4endlIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_)
  br label %if.end

if.else:                                          ; preds = %entry
  %call12 = call %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* @_ZSt4cout, i8* getelementptr inbounds ([15 x i8]* @.str9, i32 0, i32 0))
  %call13 = call %"class.std::basic_ostream"* @_ZStlsIcSt11char_traitsIcESaIcEERSt13basic_ostreamIT_T0_ES7_RKSbIS4_S5_T1_E(%"class.std::basic_ostream"* %call12, %"class.std::basic_string"* @_ZL7needle1)
  %call14 = call %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* %call13, i8* getelementptr inbounds ([8 x i8]* @.str7, i32 0, i32 0))
  %call15 = call %"class.std::basic_ostream"* @_ZStlsIcSt11char_traitsIcESaIcEERSt13basic_ostreamIT_T0_ES7_RKSbIS4_S5_T1_E(%"class.std::basic_ostream"* %call14, %"class.std::basic_string"* @_ZL8haystack)
  %call16 = call %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* %call15, i8* getelementptr inbounds ([18 x i8]* @.str8, i32 0, i32 0))
  %call17 = call %"class.std::basic_ostream"* @_ZNSolsEPFRSoS_E(%"class.std::basic_ostream"* %call16, %"class.std::basic_ostream"* (%"class.std::basic_ostream"*)* @_ZSt4endlIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_)
  br label %if.end

if.end:                                           ; preds = %if.else, %if.then
  call void @_ZNKSs5beginEv(%"class.__gnu_cxx::__normal_iterator"* sret %agg.tmp18, %"class.std::basic_string"* @_ZL7needle1)
  call void @_ZNKSs3endEv(%"class.__gnu_cxx::__normal_iterator"* sret %agg.tmp19, %"class.std::basic_string"* @_ZL7needle1)
  call void @_ZN5boost9algorithm11boyer_mooreIN9__gnu_cxx17__normal_iteratorIPKcSsEENS0_6detail9BM_traitsIS6_EEEC1ES6_S6_(%"class.boost::algorithm::boyer_moore"* %search1, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %agg.tmp18, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %agg.tmp19)
  invoke void @_ZNKSs5beginEv(%"class.__gnu_cxx::__normal_iterator"* sret %agg.tmp21, %"class.std::basic_string"* @_ZL8haystack)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %if.end
  invoke void @_ZNKSs3endEv(%"class.__gnu_cxx::__normal_iterator"* sret %agg.tmp22, %"class.std::basic_string"* @_ZL8haystack)
          to label %invoke.cont23 unwind label %lpad

invoke.cont23:                                    ; preds = %invoke.cont
  invoke void @_ZNK5boost9algorithm11boyer_mooreIN9__gnu_cxx17__normal_iteratorIPKcSsEENS0_6detail9BM_traitsIS6_EEEclIS6_EET_SC_SC_(%"class.__gnu_cxx::__normal_iterator"* sret %ref.tmp20, %"class.boost::algorithm::boyer_moore"* %search1, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %agg.tmp21, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %agg.tmp22)
          to label %invoke.cont24 unwind label %lpad

invoke.cont24:                                    ; preds = %invoke.cont23
  invoke void @_ZNKSs3endEv(%"class.__gnu_cxx::__normal_iterator"* sret %ref.tmp25, %"class.std::basic_string"* @_ZL8haystack)
          to label %invoke.cont26 unwind label %lpad

invoke.cont26:                                    ; preds = %invoke.cont24
  %call28 = invoke zeroext i1 @_ZN9__gnu_cxxneIPKcSsEEbRKNS_17__normal_iteratorIT_T0_EES8_(%"class.__gnu_cxx::__normal_iterator"* %ref.tmp20, %"class.__gnu_cxx::__normal_iterator"* %ref.tmp25)
          to label %invoke.cont27 unwind label %lpad

invoke.cont27:                                    ; preds = %invoke.cont26
  br i1 %call28, label %if.then29, label %if.else42

if.then29:                                        ; preds = %invoke.cont27
  %call31 = invoke %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* @_ZSt4cout, i8* getelementptr inbounds ([8 x i8]* @.str6, i32 0, i32 0))
          to label %invoke.cont30 unwind label %lpad

invoke.cont30:                                    ; preds = %if.then29
  %call33 = invoke %"class.std::basic_ostream"* @_ZStlsIcSt11char_traitsIcESaIcEERSt13basic_ostreamIT_T0_ES7_RKSbIS4_S5_T1_E(%"class.std::basic_ostream"* %call31, %"class.std::basic_string"* @_ZL7needle1)
          to label %invoke.cont32 unwind label %lpad

invoke.cont32:                                    ; preds = %invoke.cont30
  %call35 = invoke %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* %call33, i8* getelementptr inbounds ([8 x i8]* @.str7, i32 0, i32 0))
          to label %invoke.cont34 unwind label %lpad

invoke.cont34:                                    ; preds = %invoke.cont32
  %call37 = invoke %"class.std::basic_ostream"* @_ZStlsIcSt11char_traitsIcESaIcEERSt13basic_ostreamIT_T0_ES7_RKSbIS4_S5_T1_E(%"class.std::basic_ostream"* %call35, %"class.std::basic_string"* @_ZL8haystack)
          to label %invoke.cont36 unwind label %lpad

invoke.cont36:                                    ; preds = %invoke.cont34
  %call39 = invoke %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* %call37, i8* getelementptr inbounds ([18 x i8]* @.str10, i32 0, i32 0))
          to label %invoke.cont38 unwind label %lpad

invoke.cont38:                                    ; preds = %invoke.cont36
  %call41 = invoke %"class.std::basic_ostream"* @_ZNSolsEPFRSoS_E(%"class.std::basic_ostream"* %call39, %"class.std::basic_ostream"* (%"class.std::basic_ostream"*)* @_ZSt4endlIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_)
          to label %invoke.cont40 unwind label %lpad

invoke.cont40:                                    ; preds = %invoke.cont38
  br label %if.end55

lpad:                                             ; preds = %invoke.cont133, %invoke.cont131, %invoke.cont129, %invoke.cont127, %invoke.cont125, %if.else124, %invoke.cont120, %invoke.cont118, %invoke.cont116, %invoke.cont114, %invoke.cont112, %if.then111, %invoke.cont108, %invoke.cont106, %invoke.cont105, %invoke.cont103, %invoke.cont101, %invoke.cont99, %if.end96, %invoke.cont92, %invoke.cont90, %invoke.cont88, %invoke.cont86, %invoke.cont84, %if.else83, %invoke.cont79, %invoke.cont77, %invoke.cont75, %invoke.cont73, %invoke.cont71, %if.then70, %invoke.cont67, %invoke.cont65, %invoke.cont64, %invoke.cont62, %invoke.cont60, %invoke.cont58, %if.end55, %invoke.cont51, %invoke.cont49, %invoke.cont47, %invoke.cont45, %invoke.cont43, %if.else42, %invoke.cont38, %invoke.cont36, %invoke.cont34, %invoke.cont32, %invoke.cont30, %if.then29, %invoke.cont26, %invoke.cont24, %invoke.cont23, %invoke.cont, %if.end
  %2 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %3 = extractvalue { i8*, i32 } %2, 0
  store i8* %3, i8** %exn.slot
  %4 = extractvalue { i8*, i32 } %2, 1
  store i32 %4, i32* %ehselector.slot
  invoke void @_ZN5boost9algorithm11boyer_mooreIN9__gnu_cxx17__normal_iteratorIPKcSsEENS0_6detail9BM_traitsIS6_EEED1Ev(%"class.boost::algorithm::boyer_moore"* %search1)
          to label %invoke.cont138 unwind label %terminate.lpad

if.else42:                                        ; preds = %invoke.cont27
  %call44 = invoke %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* @_ZSt4cout, i8* getelementptr inbounds ([15 x i8]* @.str9, i32 0, i32 0))
          to label %invoke.cont43 unwind label %lpad

invoke.cont43:                                    ; preds = %if.else42
  %call46 = invoke %"class.std::basic_ostream"* @_ZStlsIcSt11char_traitsIcESaIcEERSt13basic_ostreamIT_T0_ES7_RKSbIS4_S5_T1_E(%"class.std::basic_ostream"* %call44, %"class.std::basic_string"* @_ZL7needle1)
          to label %invoke.cont45 unwind label %lpad

invoke.cont45:                                    ; preds = %invoke.cont43
  %call48 = invoke %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* %call46, i8* getelementptr inbounds ([8 x i8]* @.str7, i32 0, i32 0))
          to label %invoke.cont47 unwind label %lpad

invoke.cont47:                                    ; preds = %invoke.cont45
  %call50 = invoke %"class.std::basic_ostream"* @_ZStlsIcSt11char_traitsIcESaIcEERSt13basic_ostreamIT_T0_ES7_RKSbIS4_S5_T1_E(%"class.std::basic_ostream"* %call48, %"class.std::basic_string"* @_ZL8haystack)
          to label %invoke.cont49 unwind label %lpad

invoke.cont49:                                    ; preds = %invoke.cont47
  %call52 = invoke %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* %call50, i8* getelementptr inbounds ([18 x i8]* @.str10, i32 0, i32 0))
          to label %invoke.cont51 unwind label %lpad

invoke.cont51:                                    ; preds = %invoke.cont49
  %call54 = invoke %"class.std::basic_ostream"* @_ZNSolsEPFRSoS_E(%"class.std::basic_ostream"* %call52, %"class.std::basic_ostream"* (%"class.std::basic_ostream"*)* @_ZSt4endlIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_)
          to label %invoke.cont53 unwind label %lpad

invoke.cont53:                                    ; preds = %invoke.cont51
  br label %if.end55

if.end55:                                         ; preds = %invoke.cont53, %invoke.cont40
  invoke void @_ZNKSs5beginEv(%"class.__gnu_cxx::__normal_iterator"* sret %agg.tmp57, %"class.std::basic_string"* @_ZL8haystack)
          to label %invoke.cont58 unwind label %lpad

invoke.cont58:                                    ; preds = %if.end55
  invoke void @_ZNKSs3endEv(%"class.__gnu_cxx::__normal_iterator"* sret %agg.tmp59, %"class.std::basic_string"* @_ZL8haystack)
          to label %invoke.cont60 unwind label %lpad

invoke.cont60:                                    ; preds = %invoke.cont58
  invoke void @_ZNKSs5beginEv(%"class.__gnu_cxx::__normal_iterator"* sret %agg.tmp61, %"class.std::basic_string"* @_ZL7needle1)
          to label %invoke.cont62 unwind label %lpad

invoke.cont62:                                    ; preds = %invoke.cont60
  invoke void @_ZNKSs3endEv(%"class.__gnu_cxx::__normal_iterator"* sret %agg.tmp63, %"class.std::basic_string"* @_ZL7needle1)
          to label %invoke.cont64 unwind label %lpad

invoke.cont64:                                    ; preds = %invoke.cont62
  invoke void @_ZN5boost9algorithm27boyer_moore_horspool_searchIN9__gnu_cxx17__normal_iteratorIPKcSsEES6_EET0_S7_S7_T_S8_(%"class.__gnu_cxx::__normal_iterator"* sret %ref.tmp56, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %agg.tmp57, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %agg.tmp59, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %agg.tmp61, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %agg.tmp63)
          to label %invoke.cont65 unwind label %lpad

invoke.cont65:                                    ; preds = %invoke.cont64
  invoke void @_ZNKSs3endEv(%"class.__gnu_cxx::__normal_iterator"* sret %ref.tmp66, %"class.std::basic_string"* @_ZL8haystack)
          to label %invoke.cont67 unwind label %lpad

invoke.cont67:                                    ; preds = %invoke.cont65
  %call69 = invoke zeroext i1 @_ZN9__gnu_cxxneIPKcSsEEbRKNS_17__normal_iteratorIT_T0_EES8_(%"class.__gnu_cxx::__normal_iterator"* %ref.tmp56, %"class.__gnu_cxx::__normal_iterator"* %ref.tmp66)
          to label %invoke.cont68 unwind label %lpad

invoke.cont68:                                    ; preds = %invoke.cont67
  br i1 %call69, label %if.then70, label %if.else83

if.then70:                                        ; preds = %invoke.cont68
  %call72 = invoke %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* @_ZSt4cout, i8* getelementptr inbounds ([8 x i8]* @.str6, i32 0, i32 0))
          to label %invoke.cont71 unwind label %lpad

invoke.cont71:                                    ; preds = %if.then70
  %call74 = invoke %"class.std::basic_ostream"* @_ZStlsIcSt11char_traitsIcESaIcEERSt13basic_ostreamIT_T0_ES7_RKSbIS4_S5_T1_E(%"class.std::basic_ostream"* %call72, %"class.std::basic_string"* @_ZL7needle1)
          to label %invoke.cont73 unwind label %lpad

invoke.cont73:                                    ; preds = %invoke.cont71
  %call76 = invoke %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* %call74, i8* getelementptr inbounds ([8 x i8]* @.str7, i32 0, i32 0))
          to label %invoke.cont75 unwind label %lpad

invoke.cont75:                                    ; preds = %invoke.cont73
  %call78 = invoke %"class.std::basic_ostream"* @_ZStlsIcSt11char_traitsIcESaIcEERSt13basic_ostreamIT_T0_ES7_RKSbIS4_S5_T1_E(%"class.std::basic_ostream"* %call76, %"class.std::basic_string"* @_ZL8haystack)
          to label %invoke.cont77 unwind label %lpad

invoke.cont77:                                    ; preds = %invoke.cont75
  %call80 = invoke %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* %call78, i8* getelementptr inbounds ([25 x i8]* @.str11, i32 0, i32 0))
          to label %invoke.cont79 unwind label %lpad

invoke.cont79:                                    ; preds = %invoke.cont77
  %call82 = invoke %"class.std::basic_ostream"* @_ZNSolsEPFRSoS_E(%"class.std::basic_ostream"* %call80, %"class.std::basic_ostream"* (%"class.std::basic_ostream"*)* @_ZSt4endlIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_)
          to label %invoke.cont81 unwind label %lpad

invoke.cont81:                                    ; preds = %invoke.cont79
  br label %if.end96

if.else83:                                        ; preds = %invoke.cont68
  %call85 = invoke %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* @_ZSt4cout, i8* getelementptr inbounds ([15 x i8]* @.str9, i32 0, i32 0))
          to label %invoke.cont84 unwind label %lpad

invoke.cont84:                                    ; preds = %if.else83
  %call87 = invoke %"class.std::basic_ostream"* @_ZStlsIcSt11char_traitsIcESaIcEERSt13basic_ostreamIT_T0_ES7_RKSbIS4_S5_T1_E(%"class.std::basic_ostream"* %call85, %"class.std::basic_string"* @_ZL7needle1)
          to label %invoke.cont86 unwind label %lpad

invoke.cont86:                                    ; preds = %invoke.cont84
  %call89 = invoke %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* %call87, i8* getelementptr inbounds ([8 x i8]* @.str7, i32 0, i32 0))
          to label %invoke.cont88 unwind label %lpad

invoke.cont88:                                    ; preds = %invoke.cont86
  %call91 = invoke %"class.std::basic_ostream"* @_ZStlsIcSt11char_traitsIcESaIcEERSt13basic_ostreamIT_T0_ES7_RKSbIS4_S5_T1_E(%"class.std::basic_ostream"* %call89, %"class.std::basic_string"* @_ZL8haystack)
          to label %invoke.cont90 unwind label %lpad

invoke.cont90:                                    ; preds = %invoke.cont88
  %call93 = invoke %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* %call91, i8* getelementptr inbounds ([25 x i8]* @.str11, i32 0, i32 0))
          to label %invoke.cont92 unwind label %lpad

invoke.cont92:                                    ; preds = %invoke.cont90
  %call95 = invoke %"class.std::basic_ostream"* @_ZNSolsEPFRSoS_E(%"class.std::basic_ostream"* %call93, %"class.std::basic_ostream"* (%"class.std::basic_ostream"*)* @_ZSt4endlIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_)
          to label %invoke.cont94 unwind label %lpad

invoke.cont94:                                    ; preds = %invoke.cont92
  br label %if.end96

if.end96:                                         ; preds = %invoke.cont94, %invoke.cont81
  invoke void @_ZNKSs5beginEv(%"class.__gnu_cxx::__normal_iterator"* sret %agg.tmp98, %"class.std::basic_string"* @_ZL8haystack)
          to label %invoke.cont99 unwind label %lpad

invoke.cont99:                                    ; preds = %if.end96
  invoke void @_ZNKSs3endEv(%"class.__gnu_cxx::__normal_iterator"* sret %agg.tmp100, %"class.std::basic_string"* @_ZL8haystack)
          to label %invoke.cont101 unwind label %lpad

invoke.cont101:                                   ; preds = %invoke.cont99
  invoke void @_ZNKSs5beginEv(%"class.__gnu_cxx::__normal_iterator"* sret %agg.tmp102, %"class.std::basic_string"* @_ZL7needle1)
          to label %invoke.cont103 unwind label %lpad

invoke.cont103:                                   ; preds = %invoke.cont101
  invoke void @_ZNKSs3endEv(%"class.__gnu_cxx::__normal_iterator"* sret %agg.tmp104, %"class.std::basic_string"* @_ZL7needle1)
          to label %invoke.cont105 unwind label %lpad

invoke.cont105:                                   ; preds = %invoke.cont103
  invoke void @_ZN5boost9algorithm25knuth_morris_pratt_searchIN9__gnu_cxx17__normal_iteratorIPKcSsEES6_EET0_S7_S7_T_S8_(%"class.__gnu_cxx::__normal_iterator"* sret %ref.tmp97, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %agg.tmp98, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %agg.tmp100, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %agg.tmp102, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %agg.tmp104)
          to label %invoke.cont106 unwind label %lpad

invoke.cont106:                                   ; preds = %invoke.cont105
  invoke void @_ZNKSs3endEv(%"class.__gnu_cxx::__normal_iterator"* sret %ref.tmp107, %"class.std::basic_string"* @_ZL8haystack)
          to label %invoke.cont108 unwind label %lpad

invoke.cont108:                                   ; preds = %invoke.cont106
  %call110 = invoke zeroext i1 @_ZN9__gnu_cxxneIPKcSsEEbRKNS_17__normal_iteratorIT_T0_EES8_(%"class.__gnu_cxx::__normal_iterator"* %ref.tmp97, %"class.__gnu_cxx::__normal_iterator"* %ref.tmp107)
          to label %invoke.cont109 unwind label %lpad

invoke.cont109:                                   ; preds = %invoke.cont108
  br i1 %call110, label %if.then111, label %if.else124

if.then111:                                       ; preds = %invoke.cont109
  %call113 = invoke %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* @_ZSt4cout, i8* getelementptr inbounds ([8 x i8]* @.str6, i32 0, i32 0))
          to label %invoke.cont112 unwind label %lpad

invoke.cont112:                                   ; preds = %if.then111
  %call115 = invoke %"class.std::basic_ostream"* @_ZStlsIcSt11char_traitsIcESaIcEERSt13basic_ostreamIT_T0_ES7_RKSbIS4_S5_T1_E(%"class.std::basic_ostream"* %call113, %"class.std::basic_string"* @_ZL7needle1)
          to label %invoke.cont114 unwind label %lpad

invoke.cont114:                                   ; preds = %invoke.cont112
  %call117 = invoke %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* %call115, i8* getelementptr inbounds ([8 x i8]* @.str7, i32 0, i32 0))
          to label %invoke.cont116 unwind label %lpad

invoke.cont116:                                   ; preds = %invoke.cont114
  %call119 = invoke %"class.std::basic_ostream"* @_ZStlsIcSt11char_traitsIcESaIcEERSt13basic_ostreamIT_T0_ES7_RKSbIS4_S5_T1_E(%"class.std::basic_ostream"* %call117, %"class.std::basic_string"* @_ZL8haystack)
          to label %invoke.cont118 unwind label %lpad

invoke.cont118:                                   ; preds = %invoke.cont116
  %call121 = invoke %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* %call119, i8* getelementptr inbounds ([23 x i8]* @.str12, i32 0, i32 0))
          to label %invoke.cont120 unwind label %lpad

invoke.cont120:                                   ; preds = %invoke.cont118
  %call123 = invoke %"class.std::basic_ostream"* @_ZNSolsEPFRSoS_E(%"class.std::basic_ostream"* %call121, %"class.std::basic_ostream"* (%"class.std::basic_ostream"*)* @_ZSt4endlIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_)
          to label %invoke.cont122 unwind label %lpad

invoke.cont122:                                   ; preds = %invoke.cont120
  br label %if.end137

if.else124:                                       ; preds = %invoke.cont109
  %call126 = invoke %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* @_ZSt4cout, i8* getelementptr inbounds ([15 x i8]* @.str9, i32 0, i32 0))
          to label %invoke.cont125 unwind label %lpad

invoke.cont125:                                   ; preds = %if.else124
  %call128 = invoke %"class.std::basic_ostream"* @_ZStlsIcSt11char_traitsIcESaIcEERSt13basic_ostreamIT_T0_ES7_RKSbIS4_S5_T1_E(%"class.std::basic_ostream"* %call126, %"class.std::basic_string"* @_ZL7needle1)
          to label %invoke.cont127 unwind label %lpad

invoke.cont127:                                   ; preds = %invoke.cont125
  %call130 = invoke %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* %call128, i8* getelementptr inbounds ([8 x i8]* @.str7, i32 0, i32 0))
          to label %invoke.cont129 unwind label %lpad

invoke.cont129:                                   ; preds = %invoke.cont127
  %call132 = invoke %"class.std::basic_ostream"* @_ZStlsIcSt11char_traitsIcESaIcEERSt13basic_ostreamIT_T0_ES7_RKSbIS4_S5_T1_E(%"class.std::basic_ostream"* %call130, %"class.std::basic_string"* @_ZL8haystack)
          to label %invoke.cont131 unwind label %lpad

invoke.cont131:                                   ; preds = %invoke.cont129
  %call134 = invoke %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* %call132, i8* getelementptr inbounds ([23 x i8]* @.str12, i32 0, i32 0))
          to label %invoke.cont133 unwind label %lpad

invoke.cont133:                                   ; preds = %invoke.cont131
  %call136 = invoke %"class.std::basic_ostream"* @_ZNSolsEPFRSoS_E(%"class.std::basic_ostream"* %call134, %"class.std::basic_ostream"* (%"class.std::basic_ostream"*)* @_ZSt4endlIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_)
          to label %invoke.cont135 unwind label %lpad

invoke.cont135:                                   ; preds = %invoke.cont133
  br label %if.end137

if.end137:                                        ; preds = %invoke.cont135, %invoke.cont122
  store i32 0, i32* %retval
  store i32 1, i32* %cleanup.dest.slot
  call void @_ZN5boost9algorithm11boyer_mooreIN9__gnu_cxx17__normal_iteratorIPKcSsEENS0_6detail9BM_traitsIS6_EEED1Ev(%"class.boost::algorithm::boyer_moore"* %search1)
  %5 = load i32* %retval
  ret i32 %5

invoke.cont138:                                   ; preds = %lpad
  br label %eh.resume

eh.resume:                                        ; preds = %invoke.cont138
  %exn = load i8** %exn.slot
  %sel = load i32* %ehselector.slot
  %lpad.val = insertvalue { i8*, i32 } undef, i8* %exn, 0
  %lpad.val139 = insertvalue { i8*, i32 } %lpad.val, i32 %sel, 1
  resume { i8*, i32 } %lpad.val139

terminate.lpad:                                   ; preds = %lpad
  %6 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          catch i8* null
  call void @_ZSt9terminatev() noreturn nounwind
  unreachable
}

define linkonce_odr zeroext i1 @_ZN9__gnu_cxxneIPKcSsEEbRKNS_17__normal_iteratorIT_T0_EES8_(%"class.__gnu_cxx::__normal_iterator"* %__lhs, %"class.__gnu_cxx::__normal_iterator"* %__rhs) nounwind inlinehint {
entry:
  %__lhs.addr = alloca %"class.__gnu_cxx::__normal_iterator"*, align 4
  %__rhs.addr = alloca %"class.__gnu_cxx::__normal_iterator"*, align 4
  store %"class.__gnu_cxx::__normal_iterator"* %__lhs, %"class.__gnu_cxx::__normal_iterator"** %__lhs.addr, align 4
  store %"class.__gnu_cxx::__normal_iterator"* %__rhs, %"class.__gnu_cxx::__normal_iterator"** %__rhs.addr, align 4
  %0 = load %"class.__gnu_cxx::__normal_iterator"** %__lhs.addr, align 4
  %call = call i8** @_ZNK9__gnu_cxx17__normal_iteratorIPKcSsE4baseEv(%"class.__gnu_cxx::__normal_iterator"* %0)
  %1 = load i8** %call
  %2 = load %"class.__gnu_cxx::__normal_iterator"** %__rhs.addr, align 4
  %call1 = call i8** @_ZNK9__gnu_cxx17__normal_iteratorIPKcSsE4baseEv(%"class.__gnu_cxx::__normal_iterator"* %2)
  %3 = load i8** %call1
  %cmp = icmp ne i8* %1, %3
  ret i1 %cmp
}

define linkonce_odr void @_ZN5boost9algorithm18boyer_moore_searchIN9__gnu_cxx17__normal_iteratorIPKcSsEES6_EET0_S7_S7_T_S8_(%"class.__gnu_cxx::__normal_iterator"* noalias sret %agg.result, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %corpus_first, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %corpus_last, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %pat_first, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %pat_last) {
entry:
  %bm = alloca %"class.boost::algorithm::boyer_moore", align 4
  %agg.tmp = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %agg.tmp1 = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %agg.tmp2 = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %agg.tmp3 = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  %cleanup.dest.slot = alloca i32
  %0 = bitcast %"class.__gnu_cxx::__normal_iterator"* %agg.tmp to i8*
  %1 = bitcast %"class.__gnu_cxx::__normal_iterator"* %pat_first to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %0, i8* %1, i32 4, i32 4, i1 false)
  %2 = bitcast %"class.__gnu_cxx::__normal_iterator"* %agg.tmp1 to i8*
  %3 = bitcast %"class.__gnu_cxx::__normal_iterator"* %pat_last to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %2, i8* %3, i32 4, i32 4, i1 false)
  call void @_ZN5boost9algorithm11boyer_mooreIN9__gnu_cxx17__normal_iteratorIPKcSsEENS0_6detail9BM_traitsIS6_EEEC1ES6_S6_(%"class.boost::algorithm::boyer_moore"* %bm, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %agg.tmp, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %agg.tmp1)
  %4 = bitcast %"class.__gnu_cxx::__normal_iterator"* %agg.tmp2 to i8*
  %5 = bitcast %"class.__gnu_cxx::__normal_iterator"* %corpus_first to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %4, i8* %5, i32 4, i32 4, i1 false)
  %6 = bitcast %"class.__gnu_cxx::__normal_iterator"* %agg.tmp3 to i8*
  %7 = bitcast %"class.__gnu_cxx::__normal_iterator"* %corpus_last to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %6, i8* %7, i32 4, i32 4, i1 false)
  invoke void @_ZNK5boost9algorithm11boyer_mooreIN9__gnu_cxx17__normal_iteratorIPKcSsEENS0_6detail9BM_traitsIS6_EEEclIS6_EET_SC_SC_(%"class.__gnu_cxx::__normal_iterator"* sret %agg.result, %"class.boost::algorithm::boyer_moore"* %bm, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %agg.tmp2, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %agg.tmp3)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %entry
  store i32 1, i32* %cleanup.dest.slot
  call void @_ZN5boost9algorithm11boyer_mooreIN9__gnu_cxx17__normal_iteratorIPKcSsEENS0_6detail9BM_traitsIS6_EEED1Ev(%"class.boost::algorithm::boyer_moore"* %bm)
  ret void

lpad:                                             ; preds = %entry
  %8 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %9 = extractvalue { i8*, i32 } %8, 0
  store i8* %9, i8** %exn.slot
  %10 = extractvalue { i8*, i32 } %8, 1
  store i32 %10, i32* %ehselector.slot
  invoke void @_ZN5boost9algorithm11boyer_mooreIN9__gnu_cxx17__normal_iteratorIPKcSsEENS0_6detail9BM_traitsIS6_EEED1Ev(%"class.boost::algorithm::boyer_moore"* %bm)
          to label %invoke.cont4 unwind label %terminate.lpad

invoke.cont4:                                     ; preds = %lpad
  br label %eh.resume

eh.resume:                                        ; preds = %invoke.cont4
  %exn = load i8** %exn.slot
  %sel = load i32* %ehselector.slot
  %lpad.val = insertvalue { i8*, i32 } undef, i8* %exn, 0
  %lpad.val5 = insertvalue { i8*, i32 } %lpad.val, i32 %sel, 1
  resume { i8*, i32 } %lpad.val5

terminate.lpad:                                   ; preds = %lpad
  %11 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          catch i8* null
  call void @_ZSt9terminatev() noreturn nounwind
  unreachable
}

declare void @_ZNKSs5beginEv(%"class.__gnu_cxx::__normal_iterator"* sret, %"class.std::basic_string"*)

declare void @_ZNKSs3endEv(%"class.__gnu_cxx::__normal_iterator"* sret, %"class.std::basic_string"*)

declare %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"*, i8*)

declare %"class.std::basic_ostream"* @_ZStlsIcSt11char_traitsIcESaIcEERSt13basic_ostreamIT_T0_ES7_RKSbIS4_S5_T1_E(%"class.std::basic_ostream"*, %"class.std::basic_string"*)

declare %"class.std::basic_ostream"* @_ZNSolsEPFRSoS_E(%"class.std::basic_ostream"*, %"class.std::basic_ostream"* (%"class.std::basic_ostream"*)*)

declare %"class.std::basic_ostream"* @_ZSt4endlIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_(%"class.std::basic_ostream"*)

define linkonce_odr void @_ZN5boost9algorithm11boyer_mooreIN9__gnu_cxx17__normal_iteratorIPKcSsEENS0_6detail9BM_traitsIS6_EEEC1ES6_S6_(%"class.boost::algorithm::boyer_moore"* %this, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %first, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %last) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::algorithm::boyer_moore"*, align 4
  store %"class.boost::algorithm::boyer_moore"* %this, %"class.boost::algorithm::boyer_moore"** %this.addr, align 4
  %this1 = load %"class.boost::algorithm::boyer_moore"** %this.addr
  call void @_ZN5boost9algorithm11boyer_mooreIN9__gnu_cxx17__normal_iteratorIPKcSsEENS0_6detail9BM_traitsIS6_EEEC2ES6_S6_(%"class.boost::algorithm::boyer_moore"* %this1, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %first, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %last)
  ret void
}

define linkonce_odr void @_ZNK5boost9algorithm11boyer_mooreIN9__gnu_cxx17__normal_iteratorIPKcSsEENS0_6detail9BM_traitsIS6_EEEclIS6_EET_SC_SC_(%"class.__gnu_cxx::__normal_iterator"* noalias sret %agg.result, %"class.boost::algorithm::boyer_moore"* %this, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %corpus_first, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %corpus_last) align 2 {
entry:
  %this.addr = alloca %"class.boost::algorithm::boyer_moore"*, align 4
  %k_corpus_length = alloca i32, align 4
  %agg.tmp = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %agg.tmp5 = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %agg.tmp9 = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %agg.tmp10 = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  store %"class.boost::algorithm::boyer_moore"* %this, %"class.boost::algorithm::boyer_moore"** %this.addr, align 4
  %this1 = load %"class.boost::algorithm::boyer_moore"** %this.addr
  %call = call zeroext i1 @_ZN9__gnu_cxxeqIPKcSsEEbRKNS_17__normal_iteratorIT_T0_EES8_(%"class.__gnu_cxx::__normal_iterator"* %corpus_first, %"class.__gnu_cxx::__normal_iterator"* %corpus_last)
  br i1 %call, label %if.then, label %if.end

if.then:                                          ; preds = %entry
  %0 = bitcast %"class.__gnu_cxx::__normal_iterator"* %agg.result to i8*
  %1 = bitcast %"class.__gnu_cxx::__normal_iterator"* %corpus_last to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %0, i8* %1, i32 4, i32 4, i1 false)
  br label %return

if.end:                                           ; preds = %entry
  %pat_first = getelementptr inbounds %"class.boost::algorithm::boyer_moore"* %this1, i32 0, i32 0
  %pat_last = getelementptr inbounds %"class.boost::algorithm::boyer_moore"* %this1, i32 0, i32 1
  %call2 = call zeroext i1 @_ZN9__gnu_cxxeqIPKcSsEEbRKNS_17__normal_iteratorIT_T0_EES8_(%"class.__gnu_cxx::__normal_iterator"* %pat_first, %"class.__gnu_cxx::__normal_iterator"* %pat_last)
  br i1 %call2, label %if.then3, label %if.end4

if.then3:                                         ; preds = %if.end
  %2 = bitcast %"class.__gnu_cxx::__normal_iterator"* %agg.result to i8*
  %3 = bitcast %"class.__gnu_cxx::__normal_iterator"* %corpus_first to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %2, i8* %3, i32 4, i32 4, i1 false)
  br label %return

if.end4:                                          ; preds = %if.end
  %4 = bitcast %"class.__gnu_cxx::__normal_iterator"* %agg.tmp to i8*
  %5 = bitcast %"class.__gnu_cxx::__normal_iterator"* %corpus_first to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %4, i8* %5, i32 4, i32 4, i1 false)
  %6 = bitcast %"class.__gnu_cxx::__normal_iterator"* %agg.tmp5 to i8*
  %7 = bitcast %"class.__gnu_cxx::__normal_iterator"* %corpus_last to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %6, i8* %7, i32 4, i32 4, i1 false)
  %call6 = call i32 @_ZSt8distanceIN9__gnu_cxx17__normal_iteratorIPKcSsEEENSt15iterator_traitsIT_E15difference_typeES6_S6_(%"class.__gnu_cxx::__normal_iterator"* byval align 4 %agg.tmp, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %agg.tmp5)
  store i32 %call6, i32* %k_corpus_length, align 4
  %8 = load i32* %k_corpus_length, align 4
  %k_pattern_length = getelementptr inbounds %"class.boost::algorithm::boyer_moore"* %this1, i32 0, i32 2
  %9 = load i32* %k_pattern_length, align 4
  %cmp = icmp slt i32 %8, %9
  br i1 %cmp, label %if.then7, label %if.end8

if.then7:                                         ; preds = %if.end4
  %10 = bitcast %"class.__gnu_cxx::__normal_iterator"* %agg.result to i8*
  %11 = bitcast %"class.__gnu_cxx::__normal_iterator"* %corpus_last to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %10, i8* %11, i32 4, i32 4, i1 false)
  br label %return

if.end8:                                          ; preds = %if.end4
  %12 = bitcast %"class.__gnu_cxx::__normal_iterator"* %agg.tmp9 to i8*
  %13 = bitcast %"class.__gnu_cxx::__normal_iterator"* %corpus_first to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %12, i8* %13, i32 4, i32 4, i1 false)
  %14 = bitcast %"class.__gnu_cxx::__normal_iterator"* %agg.tmp10 to i8*
  %15 = bitcast %"class.__gnu_cxx::__normal_iterator"* %corpus_last to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %14, i8* %15, i32 4, i32 4, i1 false)
  call void @_ZNK5boost9algorithm11boyer_mooreIN9__gnu_cxx17__normal_iteratorIPKcSsEENS0_6detail9BM_traitsIS6_EEE9do_searchIS6_EET_SC_SC_(%"class.__gnu_cxx::__normal_iterator"* sret %agg.result, %"class.boost::algorithm::boyer_moore"* %this1, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %agg.tmp9, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %agg.tmp10)
  br label %return

return:                                           ; preds = %if.end8, %if.then7, %if.then3, %if.then
  ret void
}

define linkonce_odr void @_ZN5boost9algorithm27boyer_moore_horspool_searchIN9__gnu_cxx17__normal_iteratorIPKcSsEES6_EET0_S7_S7_T_S8_(%"class.__gnu_cxx::__normal_iterator"* noalias sret %agg.result, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %corpus_first, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %corpus_last, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %pat_first, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %pat_last) {
entry:
  %bmh = alloca %"class.boost::algorithm::boyer_moore_horspool", align 4
  %agg.tmp = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %agg.tmp1 = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %agg.tmp2 = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %agg.tmp3 = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  %cleanup.dest.slot = alloca i32
  %0 = bitcast %"class.__gnu_cxx::__normal_iterator"* %agg.tmp to i8*
  %1 = bitcast %"class.__gnu_cxx::__normal_iterator"* %pat_first to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %0, i8* %1, i32 4, i32 4, i1 false)
  %2 = bitcast %"class.__gnu_cxx::__normal_iterator"* %agg.tmp1 to i8*
  %3 = bitcast %"class.__gnu_cxx::__normal_iterator"* %pat_last to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %2, i8* %3, i32 4, i32 4, i1 false)
  call void @_ZN5boost9algorithm20boyer_moore_horspoolIN9__gnu_cxx17__normal_iteratorIPKcSsEENS0_6detail9BM_traitsIS6_EEEC1ES6_S6_(%"class.boost::algorithm::boyer_moore_horspool"* %bmh, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %agg.tmp, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %agg.tmp1)
  %4 = bitcast %"class.__gnu_cxx::__normal_iterator"* %agg.tmp2 to i8*
  %5 = bitcast %"class.__gnu_cxx::__normal_iterator"* %corpus_first to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %4, i8* %5, i32 4, i32 4, i1 false)
  %6 = bitcast %"class.__gnu_cxx::__normal_iterator"* %agg.tmp3 to i8*
  %7 = bitcast %"class.__gnu_cxx::__normal_iterator"* %corpus_last to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %6, i8* %7, i32 4, i32 4, i1 false)
  invoke void @_ZNK5boost9algorithm20boyer_moore_horspoolIN9__gnu_cxx17__normal_iteratorIPKcSsEENS0_6detail9BM_traitsIS6_EEEclIS6_EET_SC_SC_(%"class.__gnu_cxx::__normal_iterator"* sret %agg.result, %"class.boost::algorithm::boyer_moore_horspool"* %bmh, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %agg.tmp2, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %agg.tmp3)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %entry
  store i32 1, i32* %cleanup.dest.slot
  call void @_ZN5boost9algorithm20boyer_moore_horspoolIN9__gnu_cxx17__normal_iteratorIPKcSsEENS0_6detail9BM_traitsIS6_EEED1Ev(%"class.boost::algorithm::boyer_moore_horspool"* %bmh)
  ret void

lpad:                                             ; preds = %entry
  %8 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %9 = extractvalue { i8*, i32 } %8, 0
  store i8* %9, i8** %exn.slot
  %10 = extractvalue { i8*, i32 } %8, 1
  store i32 %10, i32* %ehselector.slot
  invoke void @_ZN5boost9algorithm20boyer_moore_horspoolIN9__gnu_cxx17__normal_iteratorIPKcSsEENS0_6detail9BM_traitsIS6_EEED1Ev(%"class.boost::algorithm::boyer_moore_horspool"* %bmh)
          to label %invoke.cont4 unwind label %terminate.lpad

invoke.cont4:                                     ; preds = %lpad
  br label %eh.resume

eh.resume:                                        ; preds = %invoke.cont4
  %exn = load i8** %exn.slot
  %sel = load i32* %ehselector.slot
  %lpad.val = insertvalue { i8*, i32 } undef, i8* %exn, 0
  %lpad.val5 = insertvalue { i8*, i32 } %lpad.val, i32 %sel, 1
  resume { i8*, i32 } %lpad.val5

terminate.lpad:                                   ; preds = %lpad
  %11 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          catch i8* null
  call void @_ZSt9terminatev() noreturn nounwind
  unreachable
}

define linkonce_odr void @_ZN5boost9algorithm25knuth_morris_pratt_searchIN9__gnu_cxx17__normal_iteratorIPKcSsEES6_EET0_S7_S7_T_S8_(%"class.__gnu_cxx::__normal_iterator"* noalias sret %agg.result, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %corpus_first, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %corpus_last, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %pat_first, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %pat_last) {
entry:
  %kmp = alloca %"class.boost::algorithm::knuth_morris_pratt", align 4
  %agg.tmp = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %agg.tmp1 = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %agg.tmp2 = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %agg.tmp3 = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  %cleanup.dest.slot = alloca i32
  %0 = bitcast %"class.__gnu_cxx::__normal_iterator"* %agg.tmp to i8*
  %1 = bitcast %"class.__gnu_cxx::__normal_iterator"* %pat_first to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %0, i8* %1, i32 4, i32 4, i1 false)
  %2 = bitcast %"class.__gnu_cxx::__normal_iterator"* %agg.tmp1 to i8*
  %3 = bitcast %"class.__gnu_cxx::__normal_iterator"* %pat_last to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %2, i8* %3, i32 4, i32 4, i1 false)
  call void @_ZN5boost9algorithm18knuth_morris_prattIN9__gnu_cxx17__normal_iteratorIPKcSsEEEC1ES6_S6_(%"class.boost::algorithm::knuth_morris_pratt"* %kmp, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %agg.tmp, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %agg.tmp1)
  %4 = bitcast %"class.__gnu_cxx::__normal_iterator"* %agg.tmp2 to i8*
  %5 = bitcast %"class.__gnu_cxx::__normal_iterator"* %corpus_first to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %4, i8* %5, i32 4, i32 4, i1 false)
  %6 = bitcast %"class.__gnu_cxx::__normal_iterator"* %agg.tmp3 to i8*
  %7 = bitcast %"class.__gnu_cxx::__normal_iterator"* %corpus_last to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %6, i8* %7, i32 4, i32 4, i1 false)
  invoke void @_ZNK5boost9algorithm18knuth_morris_prattIN9__gnu_cxx17__normal_iteratorIPKcSsEEEclIS6_EET_S9_S9_(%"class.__gnu_cxx::__normal_iterator"* sret %agg.result, %"class.boost::algorithm::knuth_morris_pratt"* %kmp, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %agg.tmp2, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %agg.tmp3)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %entry
  store i32 1, i32* %cleanup.dest.slot
  call void @_ZN5boost9algorithm18knuth_morris_prattIN9__gnu_cxx17__normal_iteratorIPKcSsEEED1Ev(%"class.boost::algorithm::knuth_morris_pratt"* %kmp)
  ret void

lpad:                                             ; preds = %entry
  %8 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %9 = extractvalue { i8*, i32 } %8, 0
  store i8* %9, i8** %exn.slot
  %10 = extractvalue { i8*, i32 } %8, 1
  store i32 %10, i32* %ehselector.slot
  invoke void @_ZN5boost9algorithm18knuth_morris_prattIN9__gnu_cxx17__normal_iteratorIPKcSsEEED1Ev(%"class.boost::algorithm::knuth_morris_pratt"* %kmp)
          to label %invoke.cont4 unwind label %terminate.lpad

invoke.cont4:                                     ; preds = %lpad
  br label %eh.resume

eh.resume:                                        ; preds = %invoke.cont4
  %exn = load i8** %exn.slot
  %sel = load i32* %ehselector.slot
  %lpad.val = insertvalue { i8*, i32 } undef, i8* %exn, 0
  %lpad.val5 = insertvalue { i8*, i32 } %lpad.val, i32 %sel, 1
  resume { i8*, i32 } %lpad.val5

terminate.lpad:                                   ; preds = %lpad
  %11 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          catch i8* null
  call void @_ZSt9terminatev() noreturn nounwind
  unreachable
}

define linkonce_odr void @_ZN5boost9algorithm11boyer_mooreIN9__gnu_cxx17__normal_iteratorIPKcSsEENS0_6detail9BM_traitsIS6_EEED1Ev(%"class.boost::algorithm::boyer_moore"* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::algorithm::boyer_moore"*, align 4
  store %"class.boost::algorithm::boyer_moore"* %this, %"class.boost::algorithm::boyer_moore"** %this.addr, align 4
  %this1 = load %"class.boost::algorithm::boyer_moore"** %this.addr
  call void @_ZN5boost9algorithm11boyer_mooreIN9__gnu_cxx17__normal_iteratorIPKcSsEENS0_6detail9BM_traitsIS6_EEED2Ev(%"class.boost::algorithm::boyer_moore"* %this1)
  ret void
}

declare void @_ZSt9terminatev()

define linkonce_odr void @_ZN5boost9algorithm18knuth_morris_prattIN9__gnu_cxx17__normal_iteratorIPKcSsEEEC1ES6_S6_(%"class.boost::algorithm::knuth_morris_pratt"* %this, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %first, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %last) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::algorithm::knuth_morris_pratt"*, align 4
  store %"class.boost::algorithm::knuth_morris_pratt"* %this, %"class.boost::algorithm::knuth_morris_pratt"** %this.addr, align 4
  %this1 = load %"class.boost::algorithm::knuth_morris_pratt"** %this.addr
  call void @_ZN5boost9algorithm18knuth_morris_prattIN9__gnu_cxx17__normal_iteratorIPKcSsEEEC2ES6_S6_(%"class.boost::algorithm::knuth_morris_pratt"* %this1, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %first, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %last)
  ret void
}

declare void @llvm.memcpy.p0i8.p0i8.i32(i8* nocapture, i8* nocapture, i32, i32, i1) nounwind

define linkonce_odr void @_ZNK5boost9algorithm18knuth_morris_prattIN9__gnu_cxx17__normal_iteratorIPKcSsEEEclIS6_EET_S9_S9_(%"class.__gnu_cxx::__normal_iterator"* noalias sret %agg.result, %"class.boost::algorithm::knuth_morris_pratt"* %this, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %corpus_first, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %corpus_last) align 2 {
entry:
  %this.addr = alloca %"class.boost::algorithm::knuth_morris_pratt"*, align 4
  %k_corpus_length = alloca i32, align 4
  %agg.tmp = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %agg.tmp5 = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %agg.tmp9 = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %agg.tmp10 = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  store %"class.boost::algorithm::knuth_morris_pratt"* %this, %"class.boost::algorithm::knuth_morris_pratt"** %this.addr, align 4
  %this1 = load %"class.boost::algorithm::knuth_morris_pratt"** %this.addr
  %call = call zeroext i1 @_ZN9__gnu_cxxeqIPKcSsEEbRKNS_17__normal_iteratorIT_T0_EES8_(%"class.__gnu_cxx::__normal_iterator"* %corpus_first, %"class.__gnu_cxx::__normal_iterator"* %corpus_last)
  br i1 %call, label %if.then, label %if.end

if.then:                                          ; preds = %entry
  %0 = bitcast %"class.__gnu_cxx::__normal_iterator"* %agg.result to i8*
  %1 = bitcast %"class.__gnu_cxx::__normal_iterator"* %corpus_last to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %0, i8* %1, i32 4, i32 4, i1 false)
  br label %return

if.end:                                           ; preds = %entry
  %pat_first = getelementptr inbounds %"class.boost::algorithm::knuth_morris_pratt"* %this1, i32 0, i32 0
  %pat_last = getelementptr inbounds %"class.boost::algorithm::knuth_morris_pratt"* %this1, i32 0, i32 1
  %call2 = call zeroext i1 @_ZN9__gnu_cxxeqIPKcSsEEbRKNS_17__normal_iteratorIT_T0_EES8_(%"class.__gnu_cxx::__normal_iterator"* %pat_first, %"class.__gnu_cxx::__normal_iterator"* %pat_last)
  br i1 %call2, label %if.then3, label %if.end4

if.then3:                                         ; preds = %if.end
  %2 = bitcast %"class.__gnu_cxx::__normal_iterator"* %agg.result to i8*
  %3 = bitcast %"class.__gnu_cxx::__normal_iterator"* %corpus_first to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %2, i8* %3, i32 4, i32 4, i1 false)
  br label %return

if.end4:                                          ; preds = %if.end
  %4 = bitcast %"class.__gnu_cxx::__normal_iterator"* %agg.tmp to i8*
  %5 = bitcast %"class.__gnu_cxx::__normal_iterator"* %corpus_first to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %4, i8* %5, i32 4, i32 4, i1 false)
  %6 = bitcast %"class.__gnu_cxx::__normal_iterator"* %agg.tmp5 to i8*
  %7 = bitcast %"class.__gnu_cxx::__normal_iterator"* %corpus_last to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %6, i8* %7, i32 4, i32 4, i1 false)
  %call6 = call i32 @_ZSt8distanceIN9__gnu_cxx17__normal_iteratorIPKcSsEEENSt15iterator_traitsIT_E15difference_typeES6_S6_(%"class.__gnu_cxx::__normal_iterator"* byval align 4 %agg.tmp, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %agg.tmp5)
  store i32 %call6, i32* %k_corpus_length, align 4
  %8 = load i32* %k_corpus_length, align 4
  %k_pattern_length = getelementptr inbounds %"class.boost::algorithm::knuth_morris_pratt"* %this1, i32 0, i32 2
  %9 = load i32* %k_pattern_length, align 4
  %cmp = icmp slt i32 %8, %9
  br i1 %cmp, label %if.then7, label %if.end8

if.then7:                                         ; preds = %if.end4
  %10 = bitcast %"class.__gnu_cxx::__normal_iterator"* %agg.result to i8*
  %11 = bitcast %"class.__gnu_cxx::__normal_iterator"* %corpus_last to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %10, i8* %11, i32 4, i32 4, i1 false)
  br label %return

if.end8:                                          ; preds = %if.end4
  %12 = bitcast %"class.__gnu_cxx::__normal_iterator"* %agg.tmp9 to i8*
  %13 = bitcast %"class.__gnu_cxx::__normal_iterator"* %corpus_first to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %12, i8* %13, i32 4, i32 4, i1 false)
  %14 = bitcast %"class.__gnu_cxx::__normal_iterator"* %agg.tmp10 to i8*
  %15 = bitcast %"class.__gnu_cxx::__normal_iterator"* %corpus_last to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %14, i8* %15, i32 4, i32 4, i1 false)
  %16 = load i32* %k_corpus_length, align 4
  call void @_ZNK5boost9algorithm18knuth_morris_prattIN9__gnu_cxx17__normal_iteratorIPKcSsEEE9do_searchIS6_EET_S9_S9_i(%"class.__gnu_cxx::__normal_iterator"* sret %agg.result, %"class.boost::algorithm::knuth_morris_pratt"* %this1, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %agg.tmp9, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %agg.tmp10, i32 %16)
  br label %return

return:                                           ; preds = %if.end8, %if.then7, %if.then3, %if.then
  ret void
}

define linkonce_odr void @_ZN5boost9algorithm18knuth_morris_prattIN9__gnu_cxx17__normal_iteratorIPKcSsEEED1Ev(%"class.boost::algorithm::knuth_morris_pratt"* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::algorithm::knuth_morris_pratt"*, align 4
  store %"class.boost::algorithm::knuth_morris_pratt"* %this, %"class.boost::algorithm::knuth_morris_pratt"** %this.addr, align 4
  %this1 = load %"class.boost::algorithm::knuth_morris_pratt"** %this.addr
  call void @_ZN5boost9algorithm18knuth_morris_prattIN9__gnu_cxx17__normal_iteratorIPKcSsEEED2Ev(%"class.boost::algorithm::knuth_morris_pratt"* %this1)
  ret void
}

define linkonce_odr void @_ZN5boost9algorithm18knuth_morris_prattIN9__gnu_cxx17__normal_iteratorIPKcSsEEED2Ev(%"class.boost::algorithm::knuth_morris_pratt"* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::algorithm::knuth_morris_pratt"*, align 4
  store %"class.boost::algorithm::knuth_morris_pratt"* %this, %"class.boost::algorithm::knuth_morris_pratt"** %this.addr, align 4
  %this1 = load %"class.boost::algorithm::knuth_morris_pratt"** %this.addr
  %skip_ = getelementptr inbounds %"class.boost::algorithm::knuth_morris_pratt"* %this1, i32 0, i32 3
  call void @_ZNSt6vectorIiSaIiEED1Ev(%"class.std::vector"* %skip_)
  ret void
}

define linkonce_odr void @_ZNSt6vectorIiSaIiEED1Ev(%"class.std::vector"* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.std::vector"*, align 4
  store %"class.std::vector"* %this, %"class.std::vector"** %this.addr, align 4
  %this1 = load %"class.std::vector"** %this.addr
  call void @_ZNSt6vectorIiSaIiEED2Ev(%"class.std::vector"* %this1)
  ret void
}

define linkonce_odr void @_ZNSt6vectorIiSaIiEED2Ev(%"class.std::vector"* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.std::vector"*, align 4
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  store %"class.std::vector"* %this, %"class.std::vector"** %this.addr, align 4
  %this1 = load %"class.std::vector"** %this.addr
  %0 = bitcast %"class.std::vector"* %this1 to %"struct.std::_Vector_base"*
  %_M_impl = getelementptr inbounds %"struct.std::_Vector_base"* %0, i32 0, i32 0
  %_M_start = getelementptr inbounds %"struct.std::_Vector_base<int, std::allocator<int> >::_Vector_impl"* %_M_impl, i32 0, i32 0
  %1 = load i32** %_M_start, align 4
  %2 = bitcast %"class.std::vector"* %this1 to %"struct.std::_Vector_base"*
  %_M_impl2 = getelementptr inbounds %"struct.std::_Vector_base"* %2, i32 0, i32 0
  %_M_finish = getelementptr inbounds %"struct.std::_Vector_base<int, std::allocator<int> >::_Vector_impl"* %_M_impl2, i32 0, i32 1
  %3 = load i32** %_M_finish, align 4
  %4 = bitcast %"class.std::vector"* %this1 to %"struct.std::_Vector_base"*
  %call = invoke %"class.std::allocator.0"* @_ZNSt12_Vector_baseIiSaIiEE19_M_get_Tp_allocatorEv(%"struct.std::_Vector_base"* %4)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %entry
  invoke void @_ZSt8_DestroyIPiiEvT_S1_RSaIT0_E(i32* %1, i32* %3, %"class.std::allocator.0"* %call)
          to label %invoke.cont3 unwind label %lpad

invoke.cont3:                                     ; preds = %invoke.cont
  %5 = bitcast %"class.std::vector"* %this1 to %"struct.std::_Vector_base"*
  call void @_ZNSt12_Vector_baseIiSaIiEED2Ev(%"struct.std::_Vector_base"* %5)
  ret void

lpad:                                             ; preds = %invoke.cont, %entry
  %6 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %7 = extractvalue { i8*, i32 } %6, 0
  store i8* %7, i8** %exn.slot
  %8 = extractvalue { i8*, i32 } %6, 1
  store i32 %8, i32* %ehselector.slot
  %9 = bitcast %"class.std::vector"* %this1 to %"struct.std::_Vector_base"*
  invoke void @_ZNSt12_Vector_baseIiSaIiEED2Ev(%"struct.std::_Vector_base"* %9)
          to label %invoke.cont4 unwind label %terminate.lpad

invoke.cont4:                                     ; preds = %lpad
  br label %eh.resume

eh.resume:                                        ; preds = %invoke.cont4
  %exn = load i8** %exn.slot
  %sel = load i32* %ehselector.slot
  %lpad.val = insertvalue { i8*, i32 } undef, i8* %exn, 0
  %lpad.val5 = insertvalue { i8*, i32 } %lpad.val, i32 %sel, 1
  resume { i8*, i32 } %lpad.val5

terminate.lpad:                                   ; preds = %lpad
  %10 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          catch i8* null
  call void @_ZSt9terminatev() noreturn nounwind
  unreachable
}

define linkonce_odr void @_ZSt8_DestroyIPiiEvT_S1_RSaIT0_E(i32* %__first, i32* %__last, %"class.std::allocator.0"*) inlinehint {
entry:
  %__first.addr = alloca i32*, align 4
  %__last.addr = alloca i32*, align 4
  %.addr = alloca %"class.std::allocator.0"*, align 4
  store i32* %__first, i32** %__first.addr, align 4
  store i32* %__last, i32** %__last.addr, align 4
  store %"class.std::allocator.0"* %0, %"class.std::allocator.0"** %.addr, align 4
  %1 = load i32** %__first.addr, align 4
  %2 = load i32** %__last.addr, align 4
  call void @_ZSt8_DestroyIPiEvT_S1_(i32* %1, i32* %2)
  ret void
}

define linkonce_odr %"class.std::allocator.0"* @_ZNSt12_Vector_baseIiSaIiEE19_M_get_Tp_allocatorEv(%"struct.std::_Vector_base"* %this) nounwind align 2 {
entry:
  %this.addr = alloca %"struct.std::_Vector_base"*, align 4
  store %"struct.std::_Vector_base"* %this, %"struct.std::_Vector_base"** %this.addr, align 4
  %this1 = load %"struct.std::_Vector_base"** %this.addr
  %_M_impl = getelementptr inbounds %"struct.std::_Vector_base"* %this1, i32 0, i32 0
  %0 = bitcast %"struct.std::_Vector_base<int, std::allocator<int> >::_Vector_impl"* %_M_impl to %"class.std::allocator.0"*
  ret %"class.std::allocator.0"* %0
}

define linkonce_odr void @_ZNSt12_Vector_baseIiSaIiEED2Ev(%"struct.std::_Vector_base"* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"struct.std::_Vector_base"*, align 4
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  store %"struct.std::_Vector_base"* %this, %"struct.std::_Vector_base"** %this.addr, align 4
  %this1 = load %"struct.std::_Vector_base"** %this.addr
  %_M_impl = getelementptr inbounds %"struct.std::_Vector_base"* %this1, i32 0, i32 0
  %_M_start = getelementptr inbounds %"struct.std::_Vector_base<int, std::allocator<int> >::_Vector_impl"* %_M_impl, i32 0, i32 0
  %0 = load i32** %_M_start, align 4
  %_M_impl2 = getelementptr inbounds %"struct.std::_Vector_base"* %this1, i32 0, i32 0
  %_M_end_of_storage = getelementptr inbounds %"struct.std::_Vector_base<int, std::allocator<int> >::_Vector_impl"* %_M_impl2, i32 0, i32 2
  %1 = load i32** %_M_end_of_storage, align 4
  %_M_impl3 = getelementptr inbounds %"struct.std::_Vector_base"* %this1, i32 0, i32 0
  %_M_start4 = getelementptr inbounds %"struct.std::_Vector_base<int, std::allocator<int> >::_Vector_impl"* %_M_impl3, i32 0, i32 0
  %2 = load i32** %_M_start4, align 4
  %sub.ptr.lhs.cast = ptrtoint i32* %1 to i32
  %sub.ptr.rhs.cast = ptrtoint i32* %2 to i32
  %sub.ptr.sub = sub i32 %sub.ptr.lhs.cast, %sub.ptr.rhs.cast
  %sub.ptr.div = sdiv exact i32 %sub.ptr.sub, 4
  invoke void @_ZNSt12_Vector_baseIiSaIiEE13_M_deallocateEPij(%"struct.std::_Vector_base"* %this1, i32* %0, i32 %sub.ptr.div)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %entry
  %_M_impl5 = getelementptr inbounds %"struct.std::_Vector_base"* %this1, i32 0, i32 0
  call void @_ZNSt12_Vector_baseIiSaIiEE12_Vector_implD1Ev(%"struct.std::_Vector_base<int, std::allocator<int> >::_Vector_impl"* %_M_impl5) nounwind
  ret void

lpad:                                             ; preds = %entry
  %3 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %4 = extractvalue { i8*, i32 } %3, 0
  store i8* %4, i8** %exn.slot
  %5 = extractvalue { i8*, i32 } %3, 1
  store i32 %5, i32* %ehselector.slot
  %_M_impl6 = getelementptr inbounds %"struct.std::_Vector_base"* %this1, i32 0, i32 0
  call void @_ZNSt12_Vector_baseIiSaIiEE12_Vector_implD1Ev(%"struct.std::_Vector_base<int, std::allocator<int> >::_Vector_impl"* %_M_impl6) nounwind
  br label %eh.resume

eh.resume:                                        ; preds = %lpad
  %exn = load i8** %exn.slot
  %sel = load i32* %ehselector.slot
  %lpad.val = insertvalue { i8*, i32 } undef, i8* %exn, 0
  %lpad.val7 = insertvalue { i8*, i32 } %lpad.val, i32 %sel, 1
  resume { i8*, i32 } %lpad.val7
}

define linkonce_odr void @_ZNSt12_Vector_baseIiSaIiEE13_M_deallocateEPij(%"struct.std::_Vector_base"* %this, i32* %__p, i32 %__n) align 2 {
entry:
  %this.addr = alloca %"struct.std::_Vector_base"*, align 4
  %__p.addr = alloca i32*, align 4
  %__n.addr = alloca i32, align 4
  store %"struct.std::_Vector_base"* %this, %"struct.std::_Vector_base"** %this.addr, align 4
  store i32* %__p, i32** %__p.addr, align 4
  store i32 %__n, i32* %__n.addr, align 4
  %this1 = load %"struct.std::_Vector_base"** %this.addr
  %0 = load i32** %__p.addr, align 4
  %tobool = icmp ne i32* %0, null
  br i1 %tobool, label %if.then, label %if.end

if.then:                                          ; preds = %entry
  %_M_impl = getelementptr inbounds %"struct.std::_Vector_base"* %this1, i32 0, i32 0
  %1 = bitcast %"struct.std::_Vector_base<int, std::allocator<int> >::_Vector_impl"* %_M_impl to %"class.__gnu_cxx::new_allocator.1"*
  %2 = load i32** %__p.addr, align 4
  %3 = load i32* %__n.addr, align 4
  call void @_ZN9__gnu_cxx13new_allocatorIiE10deallocateEPij(%"class.__gnu_cxx::new_allocator.1"* %1, i32* %2, i32 %3)
  br label %if.end

if.end:                                           ; preds = %if.then, %entry
  ret void
}

define linkonce_odr void @_ZNSt12_Vector_baseIiSaIiEE12_Vector_implD1Ev(%"struct.std::_Vector_base<int, std::allocator<int> >::_Vector_impl"* %this) unnamed_addr nounwind inlinehint align 2 {
entry:
  %this.addr = alloca %"struct.std::_Vector_base<int, std::allocator<int> >::_Vector_impl"*, align 4
  store %"struct.std::_Vector_base<int, std::allocator<int> >::_Vector_impl"* %this, %"struct.std::_Vector_base<int, std::allocator<int> >::_Vector_impl"** %this.addr, align 4
  %this1 = load %"struct.std::_Vector_base<int, std::allocator<int> >::_Vector_impl"** %this.addr
  call void @_ZNSt12_Vector_baseIiSaIiEE12_Vector_implD2Ev(%"struct.std::_Vector_base<int, std::allocator<int> >::_Vector_impl"* %this1) nounwind
  ret void
}

define linkonce_odr void @_ZNSt12_Vector_baseIiSaIiEE12_Vector_implD2Ev(%"struct.std::_Vector_base<int, std::allocator<int> >::_Vector_impl"* %this) unnamed_addr nounwind inlinehint align 2 {
entry:
  %this.addr = alloca %"struct.std::_Vector_base<int, std::allocator<int> >::_Vector_impl"*, align 4
  store %"struct.std::_Vector_base<int, std::allocator<int> >::_Vector_impl"* %this, %"struct.std::_Vector_base<int, std::allocator<int> >::_Vector_impl"** %this.addr, align 4
  %this1 = load %"struct.std::_Vector_base<int, std::allocator<int> >::_Vector_impl"** %this.addr
  %0 = bitcast %"struct.std::_Vector_base<int, std::allocator<int> >::_Vector_impl"* %this1 to %"class.std::allocator.0"*
  call void @_ZNSaIiED2Ev(%"class.std::allocator.0"* %0) nounwind
  ret void
}

define linkonce_odr void @_ZNSaIiED2Ev(%"class.std::allocator.0"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.std::allocator.0"*, align 4
  store %"class.std::allocator.0"* %this, %"class.std::allocator.0"** %this.addr, align 4
  %this1 = load %"class.std::allocator.0"** %this.addr
  %0 = bitcast %"class.std::allocator.0"* %this1 to %"class.__gnu_cxx::new_allocator.1"*
  call void @_ZN9__gnu_cxx13new_allocatorIiED2Ev(%"class.__gnu_cxx::new_allocator.1"* %0) nounwind
  ret void
}

define linkonce_odr void @_ZN9__gnu_cxx13new_allocatorIiED2Ev(%"class.__gnu_cxx::new_allocator.1"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.__gnu_cxx::new_allocator.1"*, align 4
  store %"class.__gnu_cxx::new_allocator.1"* %this, %"class.__gnu_cxx::new_allocator.1"** %this.addr, align 4
  %this1 = load %"class.__gnu_cxx::new_allocator.1"** %this.addr
  ret void
}

define linkonce_odr void @_ZN9__gnu_cxx13new_allocatorIiE10deallocateEPij(%"class.__gnu_cxx::new_allocator.1"* %this, i32* %__p, i32) nounwind align 2 {
entry:
  %this.addr = alloca %"class.__gnu_cxx::new_allocator.1"*, align 4
  %__p.addr = alloca i32*, align 4
  %.addr = alloca i32, align 4
  store %"class.__gnu_cxx::new_allocator.1"* %this, %"class.__gnu_cxx::new_allocator.1"** %this.addr, align 4
  store i32* %__p, i32** %__p.addr, align 4
  store i32 %0, i32* %.addr, align 4
  %this1 = load %"class.__gnu_cxx::new_allocator.1"** %this.addr
  %1 = load i32** %__p.addr, align 4
  %2 = bitcast i32* %1 to i8*
  call void @_ZdlPv(i8* %2) nounwind
  ret void
}

declare void @_ZdlPv(i8*) nounwind

define linkonce_odr void @_ZSt8_DestroyIPiEvT_S1_(i32* %__first, i32* %__last) inlinehint {
entry:
  %__first.addr = alloca i32*, align 4
  %__last.addr = alloca i32*, align 4
  store i32* %__first, i32** %__first.addr, align 4
  store i32* %__last, i32** %__last.addr, align 4
  %0 = load i32** %__first.addr, align 4
  %1 = load i32** %__last.addr, align 4
  call void @_ZNSt12_Destroy_auxILb1EE9__destroyIPiEEvT_S3_(i32* %0, i32* %1)
  ret void
}

define linkonce_odr void @_ZNSt12_Destroy_auxILb1EE9__destroyIPiEEvT_S3_(i32*, i32*) nounwind align 2 {
entry:
  %.addr = alloca i32*, align 4
  %.addr1 = alloca i32*, align 4
  store i32* %0, i32** %.addr, align 4
  store i32* %1, i32** %.addr1, align 4
  ret void
}

define linkonce_odr zeroext i1 @_ZN9__gnu_cxxeqIPKcSsEEbRKNS_17__normal_iteratorIT_T0_EES8_(%"class.__gnu_cxx::__normal_iterator"* %__lhs, %"class.__gnu_cxx::__normal_iterator"* %__rhs) nounwind inlinehint {
entry:
  %__lhs.addr = alloca %"class.__gnu_cxx::__normal_iterator"*, align 4
  %__rhs.addr = alloca %"class.__gnu_cxx::__normal_iterator"*, align 4
  store %"class.__gnu_cxx::__normal_iterator"* %__lhs, %"class.__gnu_cxx::__normal_iterator"** %__lhs.addr, align 4
  store %"class.__gnu_cxx::__normal_iterator"* %__rhs, %"class.__gnu_cxx::__normal_iterator"** %__rhs.addr, align 4
  %0 = load %"class.__gnu_cxx::__normal_iterator"** %__lhs.addr, align 4
  %call = call i8** @_ZNK9__gnu_cxx17__normal_iteratorIPKcSsE4baseEv(%"class.__gnu_cxx::__normal_iterator"* %0)
  %1 = load i8** %call
  %2 = load %"class.__gnu_cxx::__normal_iterator"** %__rhs.addr, align 4
  %call1 = call i8** @_ZNK9__gnu_cxx17__normal_iteratorIPKcSsE4baseEv(%"class.__gnu_cxx::__normal_iterator"* %2)
  %3 = load i8** %call1
  %cmp = icmp eq i8* %1, %3
  ret i1 %cmp
}

define linkonce_odr i32 @_ZSt8distanceIN9__gnu_cxx17__normal_iteratorIPKcSsEEENSt15iterator_traitsIT_E15difference_typeES6_S6_(%"class.__gnu_cxx::__normal_iterator"* byval align 4 %__first, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %__last) inlinehint {
entry:
  %agg.tmp = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %agg.tmp1 = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %agg.tmp2 = alloca %"struct.std::random_access_iterator_tag", align 1
  %0 = bitcast %"class.__gnu_cxx::__normal_iterator"* %agg.tmp to i8*
  %1 = bitcast %"class.__gnu_cxx::__normal_iterator"* %__first to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %0, i8* %1, i32 4, i32 4, i1 false)
  %2 = bitcast %"class.__gnu_cxx::__normal_iterator"* %agg.tmp1 to i8*
  %3 = bitcast %"class.__gnu_cxx::__normal_iterator"* %__last to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %2, i8* %3, i32 4, i32 4, i1 false)
  call void @_ZSt19__iterator_categoryIN9__gnu_cxx17__normal_iteratorIPKcSsEEENSt15iterator_traitsIT_E17iterator_categoryERKS6_(%"struct.std::random_access_iterator_tag"* sret %agg.tmp2, %"class.__gnu_cxx::__normal_iterator"* %__first)
  %call = call i32 @_ZSt10__distanceIN9__gnu_cxx17__normal_iteratorIPKcSsEEENSt15iterator_traitsIT_E15difference_typeES6_S6_St26random_access_iterator_tag(%"class.__gnu_cxx::__normal_iterator"* byval align 4 %agg.tmp, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %agg.tmp1)
  ret i32 %call
}

define linkonce_odr void @_ZNK5boost9algorithm18knuth_morris_prattIN9__gnu_cxx17__normal_iteratorIPKcSsEEE9do_searchIS6_EET_S9_S9_i(%"class.__gnu_cxx::__normal_iterator"* noalias sret %agg.result, %"class.boost::algorithm::knuth_morris_pratt"* %this, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %corpus_first, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %corpus_last, i32 %k_corpus_length) align 2 {
entry:
  %this.addr = alloca %"class.boost::algorithm::knuth_morris_pratt"*, align 4
  %k_corpus_length.addr = alloca i32, align 4
  %match_start = alloca i32, align 4
  %last_match = alloca i32, align 4
  %idx = alloca i32, align 4
  %ref.tmp = alloca i32, align 4
  store %"class.boost::algorithm::knuth_morris_pratt"* %this, %"class.boost::algorithm::knuth_morris_pratt"** %this.addr, align 4
  store i32 %k_corpus_length, i32* %k_corpus_length.addr, align 4
  %this1 = load %"class.boost::algorithm::knuth_morris_pratt"** %this.addr
  store i32 0, i32* %match_start, align 4
  %0 = load i32* %k_corpus_length.addr, align 4
  %k_pattern_length = getelementptr inbounds %"class.boost::algorithm::knuth_morris_pratt"* %this1, i32 0, i32 2
  %1 = load i32* %k_pattern_length, align 4
  %sub = sub nsw i32 %0, %1
  store i32 %sub, i32* %last_match, align 4
  store i32 0, i32* %idx, align 4
  br label %while.cond

while.cond:                                       ; preds = %cond.end, %entry
  %2 = load i32* %match_start, align 4
  %3 = load i32* %last_match, align 4
  %cmp = icmp sle i32 %2, %3
  br i1 %cmp, label %while.body, label %while.end17

while.body:                                       ; preds = %while.cond
  br label %while.cond2

while.cond2:                                      ; preds = %if.end, %while.body
  %pat_first = getelementptr inbounds %"class.boost::algorithm::knuth_morris_pratt"* %this1, i32 0, i32 0
  %call = call i8* @_ZNK9__gnu_cxx17__normal_iteratorIPKcSsEixERKi(%"class.__gnu_cxx::__normal_iterator"* %pat_first, i32* %idx)
  %4 = load i8* %call
  %conv = sext i8 %4 to i32
  %5 = load i32* %match_start, align 4
  %6 = load i32* %idx, align 4
  %add = add nsw i32 %5, %6
  store i32 %add, i32* %ref.tmp, align 4
  %call3 = call i8* @_ZNK9__gnu_cxx17__normal_iteratorIPKcSsEixERKi(%"class.__gnu_cxx::__normal_iterator"* %corpus_first, i32* %ref.tmp)
  %7 = load i8* %call3
  %conv4 = sext i8 %7 to i32
  %cmp5 = icmp eq i32 %conv, %conv4
  br i1 %cmp5, label %while.body6, label %while.end

while.body6:                                      ; preds = %while.cond2
  %8 = load i32* %idx, align 4
  %inc = add nsw i32 %8, 1
  store i32 %inc, i32* %idx, align 4
  %k_pattern_length7 = getelementptr inbounds %"class.boost::algorithm::knuth_morris_pratt"* %this1, i32 0, i32 2
  %9 = load i32* %k_pattern_length7, align 4
  %cmp8 = icmp eq i32 %inc, %9
  br i1 %cmp8, label %if.then, label %if.end

if.then:                                          ; preds = %while.body6
  call void @_ZNK9__gnu_cxx17__normal_iteratorIPKcSsEplERKi(%"class.__gnu_cxx::__normal_iterator"* sret %agg.result, %"class.__gnu_cxx::__normal_iterator"* %corpus_first, i32* %match_start)
  br label %return

if.end:                                           ; preds = %while.body6
  br label %while.cond2

while.end:                                        ; preds = %while.cond2
  %10 = load i32* %idx, align 4
  %skip_ = getelementptr inbounds %"class.boost::algorithm::knuth_morris_pratt"* %this1, i32 0, i32 3
  %11 = load i32* %idx, align 4
  %call9 = call i32* @_ZNKSt6vectorIiSaIiEEixEj(%"class.std::vector"* %skip_, i32 %11)
  %12 = load i32* %call9
  %sub10 = sub nsw i32 %10, %12
  %13 = load i32* %match_start, align 4
  %add11 = add nsw i32 %13, %sub10
  store i32 %add11, i32* %match_start, align 4
  %skip_12 = getelementptr inbounds %"class.boost::algorithm::knuth_morris_pratt"* %this1, i32 0, i32 3
  %14 = load i32* %idx, align 4
  %call13 = call i32* @_ZNKSt6vectorIiSaIiEEixEj(%"class.std::vector"* %skip_12, i32 %14)
  %15 = load i32* %call13
  %cmp14 = icmp sge i32 %15, 0
  br i1 %cmp14, label %cond.true, label %cond.false

cond.true:                                        ; preds = %while.end
  %skip_15 = getelementptr inbounds %"class.boost::algorithm::knuth_morris_pratt"* %this1, i32 0, i32 3
  %16 = load i32* %idx, align 4
  %call16 = call i32* @_ZNKSt6vectorIiSaIiEEixEj(%"class.std::vector"* %skip_15, i32 %16)
  %17 = load i32* %call16
  br label %cond.end

cond.false:                                       ; preds = %while.end
  br label %cond.end

cond.end:                                         ; preds = %cond.false, %cond.true
  %cond = phi i32 [ %17, %cond.true ], [ 0, %cond.false ]
  store i32 %cond, i32* %idx, align 4
  br label %while.cond

while.end17:                                      ; preds = %while.cond
  %18 = bitcast %"class.__gnu_cxx::__normal_iterator"* %agg.result to i8*
  %19 = bitcast %"class.__gnu_cxx::__normal_iterator"* %corpus_last to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %18, i8* %19, i32 4, i32 4, i1 false)
  br label %return

return:                                           ; preds = %while.end17, %if.then
  ret void
}

define linkonce_odr i8* @_ZNK9__gnu_cxx17__normal_iteratorIPKcSsEixERKi(%"class.__gnu_cxx::__normal_iterator"* %this, i32* %__n) nounwind align 2 {
entry:
  %this.addr = alloca %"class.__gnu_cxx::__normal_iterator"*, align 4
  %__n.addr = alloca i32*, align 4
  store %"class.__gnu_cxx::__normal_iterator"* %this, %"class.__gnu_cxx::__normal_iterator"** %this.addr, align 4
  store i32* %__n, i32** %__n.addr, align 4
  %this1 = load %"class.__gnu_cxx::__normal_iterator"** %this.addr
  %0 = load i32** %__n.addr, align 4
  %1 = load i32* %0, align 4
  %_M_current = getelementptr inbounds %"class.__gnu_cxx::__normal_iterator"* %this1, i32 0, i32 0
  %2 = load i8** %_M_current, align 4
  %arrayidx = getelementptr inbounds i8* %2, i32 %1
  ret i8* %arrayidx
}

define linkonce_odr void @_ZNK9__gnu_cxx17__normal_iteratorIPKcSsEplERKi(%"class.__gnu_cxx::__normal_iterator"* noalias sret %agg.result, %"class.__gnu_cxx::__normal_iterator"* %this, i32* %__n) align 2 {
entry:
  %this.addr = alloca %"class.__gnu_cxx::__normal_iterator"*, align 4
  %__n.addr = alloca i32*, align 4
  %ref.tmp = alloca i8*, align 4
  store %"class.__gnu_cxx::__normal_iterator"* %this, %"class.__gnu_cxx::__normal_iterator"** %this.addr, align 4
  store i32* %__n, i32** %__n.addr, align 4
  %this1 = load %"class.__gnu_cxx::__normal_iterator"** %this.addr
  %_M_current = getelementptr inbounds %"class.__gnu_cxx::__normal_iterator"* %this1, i32 0, i32 0
  %0 = load i8** %_M_current, align 4
  %1 = load i32** %__n.addr, align 4
  %2 = load i32* %1, align 4
  %add.ptr = getelementptr inbounds i8* %0, i32 %2
  store i8* %add.ptr, i8** %ref.tmp, align 4
  call void @_ZN9__gnu_cxx17__normal_iteratorIPKcSsEC1ERKS2_(%"class.__gnu_cxx::__normal_iterator"* %agg.result, i8** %ref.tmp)
  ret void
}

define linkonce_odr i32* @_ZNKSt6vectorIiSaIiEEixEj(%"class.std::vector"* %this, i32 %__n) nounwind align 2 {
entry:
  %this.addr = alloca %"class.std::vector"*, align 4
  %__n.addr = alloca i32, align 4
  store %"class.std::vector"* %this, %"class.std::vector"** %this.addr, align 4
  store i32 %__n, i32* %__n.addr, align 4
  %this1 = load %"class.std::vector"** %this.addr
  %0 = bitcast %"class.std::vector"* %this1 to %"struct.std::_Vector_base"*
  %_M_impl = getelementptr inbounds %"struct.std::_Vector_base"* %0, i32 0, i32 0
  %_M_start = getelementptr inbounds %"struct.std::_Vector_base<int, std::allocator<int> >::_Vector_impl"* %_M_impl, i32 0, i32 0
  %1 = load i32** %_M_start, align 4
  %2 = load i32* %__n.addr, align 4
  %add.ptr = getelementptr inbounds i32* %1, i32 %2
  ret i32* %add.ptr
}

define linkonce_odr void @_ZN9__gnu_cxx17__normal_iteratorIPKcSsEC1ERKS2_(%"class.__gnu_cxx::__normal_iterator"* %this, i8** %__i) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.__gnu_cxx::__normal_iterator"*, align 4
  %__i.addr = alloca i8**, align 4
  store %"class.__gnu_cxx::__normal_iterator"* %this, %"class.__gnu_cxx::__normal_iterator"** %this.addr, align 4
  store i8** %__i, i8*** %__i.addr, align 4
  %this1 = load %"class.__gnu_cxx::__normal_iterator"** %this.addr
  %0 = load i8*** %__i.addr
  call void @_ZN9__gnu_cxx17__normal_iteratorIPKcSsEC2ERKS2_(%"class.__gnu_cxx::__normal_iterator"* %this1, i8** %0)
  ret void
}

define linkonce_odr void @_ZN9__gnu_cxx17__normal_iteratorIPKcSsEC2ERKS2_(%"class.__gnu_cxx::__normal_iterator"* %this, i8** %__i) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.__gnu_cxx::__normal_iterator"*, align 4
  %__i.addr = alloca i8**, align 4
  store %"class.__gnu_cxx::__normal_iterator"* %this, %"class.__gnu_cxx::__normal_iterator"** %this.addr, align 4
  store i8** %__i, i8*** %__i.addr, align 4
  %this1 = load %"class.__gnu_cxx::__normal_iterator"** %this.addr
  %_M_current = getelementptr inbounds %"class.__gnu_cxx::__normal_iterator"* %this1, i32 0, i32 0
  %0 = load i8*** %__i.addr, align 4
  %1 = load i8** %0, align 4
  store i8* %1, i8** %_M_current, align 4
  ret void
}

define linkonce_odr i32 @_ZSt10__distanceIN9__gnu_cxx17__normal_iteratorIPKcSsEEENSt15iterator_traitsIT_E15difference_typeES6_S6_St26random_access_iterator_tag(%"class.__gnu_cxx::__normal_iterator"* byval align 4 %__first, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %__last) inlinehint {
entry:
  %0 = alloca %"struct.std::random_access_iterator_tag", align 1
  %call = call i32 @_ZN9__gnu_cxxmiIPKcSsEENS_17__normal_iteratorIT_T0_E15difference_typeERKS6_S9_(%"class.__gnu_cxx::__normal_iterator"* %__last, %"class.__gnu_cxx::__normal_iterator"* %__first)
  ret i32 %call
}

define linkonce_odr void @_ZSt19__iterator_categoryIN9__gnu_cxx17__normal_iteratorIPKcSsEEENSt15iterator_traitsIT_E17iterator_categoryERKS6_(%"struct.std::random_access_iterator_tag"* noalias sret %agg.result, %"class.__gnu_cxx::__normal_iterator"*) nounwind inlinehint {
entry:
  %.addr = alloca %"class.__gnu_cxx::__normal_iterator"*, align 4
  store %"class.__gnu_cxx::__normal_iterator"* %0, %"class.__gnu_cxx::__normal_iterator"** %.addr, align 4
  ret void
}

define linkonce_odr i32 @_ZN9__gnu_cxxmiIPKcSsEENS_17__normal_iteratorIT_T0_E15difference_typeERKS6_S9_(%"class.__gnu_cxx::__normal_iterator"* %__lhs, %"class.__gnu_cxx::__normal_iterator"* %__rhs) inlinehint {
entry:
  %__lhs.addr = alloca %"class.__gnu_cxx::__normal_iterator"*, align 4
  %__rhs.addr = alloca %"class.__gnu_cxx::__normal_iterator"*, align 4
  store %"class.__gnu_cxx::__normal_iterator"* %__lhs, %"class.__gnu_cxx::__normal_iterator"** %__lhs.addr, align 4
  store %"class.__gnu_cxx::__normal_iterator"* %__rhs, %"class.__gnu_cxx::__normal_iterator"** %__rhs.addr, align 4
  %0 = load %"class.__gnu_cxx::__normal_iterator"** %__lhs.addr, align 4
  %call = call i8** @_ZNK9__gnu_cxx17__normal_iteratorIPKcSsE4baseEv(%"class.__gnu_cxx::__normal_iterator"* %0)
  %1 = load i8** %call
  %2 = load %"class.__gnu_cxx::__normal_iterator"** %__rhs.addr, align 4
  %call1 = call i8** @_ZNK9__gnu_cxx17__normal_iteratorIPKcSsE4baseEv(%"class.__gnu_cxx::__normal_iterator"* %2)
  %3 = load i8** %call1
  %sub.ptr.lhs.cast = ptrtoint i8* %1 to i32
  %sub.ptr.rhs.cast = ptrtoint i8* %3 to i32
  %sub.ptr.sub = sub i32 %sub.ptr.lhs.cast, %sub.ptr.rhs.cast
  ret i32 %sub.ptr.sub
}

define linkonce_odr i8** @_ZNK9__gnu_cxx17__normal_iteratorIPKcSsE4baseEv(%"class.__gnu_cxx::__normal_iterator"* %this) nounwind align 2 {
entry:
  %this.addr = alloca %"class.__gnu_cxx::__normal_iterator"*, align 4
  store %"class.__gnu_cxx::__normal_iterator"* %this, %"class.__gnu_cxx::__normal_iterator"** %this.addr, align 4
  %this1 = load %"class.__gnu_cxx::__normal_iterator"** %this.addr
  %_M_current = getelementptr inbounds %"class.__gnu_cxx::__normal_iterator"* %this1, i32 0, i32 0
  ret i8** %_M_current
}

define linkonce_odr void @_ZN5boost9algorithm18knuth_morris_prattIN9__gnu_cxx17__normal_iteratorIPKcSsEEEC2ES6_S6_(%"class.boost::algorithm::knuth_morris_pratt"* %this, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %first, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %last) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::algorithm::knuth_morris_pratt"*, align 4
  %agg.tmp = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %agg.tmp3 = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %ref.tmp = alloca i32, align 4
  %ref.tmp6 = alloca %"class.std::allocator.0", align 1
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  %agg.tmp7 = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %agg.tmp9 = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  store %"class.boost::algorithm::knuth_morris_pratt"* %this, %"class.boost::algorithm::knuth_morris_pratt"** %this.addr, align 4
  %this1 = load %"class.boost::algorithm::knuth_morris_pratt"** %this.addr
  %pat_first = getelementptr inbounds %"class.boost::algorithm::knuth_morris_pratt"* %this1, i32 0, i32 0
  %0 = bitcast %"class.__gnu_cxx::__normal_iterator"* %pat_first to i8*
  %1 = bitcast %"class.__gnu_cxx::__normal_iterator"* %first to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %0, i8* %1, i32 4, i32 4, i1 false)
  %pat_last = getelementptr inbounds %"class.boost::algorithm::knuth_morris_pratt"* %this1, i32 0, i32 1
  %2 = bitcast %"class.__gnu_cxx::__normal_iterator"* %pat_last to i8*
  %3 = bitcast %"class.__gnu_cxx::__normal_iterator"* %last to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %2, i8* %3, i32 4, i32 4, i1 false)
  %k_pattern_length = getelementptr inbounds %"class.boost::algorithm::knuth_morris_pratt"* %this1, i32 0, i32 2
  %pat_first2 = getelementptr inbounds %"class.boost::algorithm::knuth_morris_pratt"* %this1, i32 0, i32 0
  %4 = bitcast %"class.__gnu_cxx::__normal_iterator"* %agg.tmp to i8*
  %5 = bitcast %"class.__gnu_cxx::__normal_iterator"* %pat_first2 to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %4, i8* %5, i32 4, i32 4, i1 false)
  %pat_last4 = getelementptr inbounds %"class.boost::algorithm::knuth_morris_pratt"* %this1, i32 0, i32 1
  %6 = bitcast %"class.__gnu_cxx::__normal_iterator"* %agg.tmp3 to i8*
  %7 = bitcast %"class.__gnu_cxx::__normal_iterator"* %pat_last4 to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %6, i8* %7, i32 4, i32 4, i1 false)
  %call = call i32 @_ZSt8distanceIN9__gnu_cxx17__normal_iteratorIPKcSsEEENSt15iterator_traitsIT_E15difference_typeES6_S6_(%"class.__gnu_cxx::__normal_iterator"* byval align 4 %agg.tmp, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %agg.tmp3)
  store i32 %call, i32* %k_pattern_length, align 4
  %skip_ = getelementptr inbounds %"class.boost::algorithm::knuth_morris_pratt"* %this1, i32 0, i32 3
  %k_pattern_length5 = getelementptr inbounds %"class.boost::algorithm::knuth_morris_pratt"* %this1, i32 0, i32 2
  %8 = load i32* %k_pattern_length5, align 4
  %add = add nsw i32 %8, 1
  store i32 0, i32* %ref.tmp, align 4
  call void @_ZNSaIiEC1Ev(%"class.std::allocator.0"* %ref.tmp6) nounwind
  invoke void @_ZNSt6vectorIiSaIiEEC1EjRKiRKS0_(%"class.std::vector"* %skip_, i32 %add, i32* %ref.tmp, %"class.std::allocator.0"* %ref.tmp6)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %entry
  call void @_ZNSaIiED1Ev(%"class.std::allocator.0"* %ref.tmp6) nounwind
  %pat_first8 = getelementptr inbounds %"class.boost::algorithm::knuth_morris_pratt"* %this1, i32 0, i32 0
  %9 = bitcast %"class.__gnu_cxx::__normal_iterator"* %agg.tmp7 to i8*
  %10 = bitcast %"class.__gnu_cxx::__normal_iterator"* %pat_first8 to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %9, i8* %10, i32 4, i32 4, i1 false)
  %pat_last10 = getelementptr inbounds %"class.boost::algorithm::knuth_morris_pratt"* %this1, i32 0, i32 1
  %11 = bitcast %"class.__gnu_cxx::__normal_iterator"* %agg.tmp9 to i8*
  %12 = bitcast %"class.__gnu_cxx::__normal_iterator"* %pat_last10 to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %11, i8* %12, i32 4, i32 4, i1 false)
  invoke void @_ZN5boost9algorithm18knuth_morris_prattIN9__gnu_cxx17__normal_iteratorIPKcSsEEE15init_skip_tableES6_S6_(%"class.boost::algorithm::knuth_morris_pratt"* %this1, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %agg.tmp7, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %agg.tmp9)
          to label %invoke.cont12 unwind label %lpad11

invoke.cont12:                                    ; preds = %invoke.cont
  ret void

lpad:                                             ; preds = %entry
  %13 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %14 = extractvalue { i8*, i32 } %13, 0
  store i8* %14, i8** %exn.slot
  %15 = extractvalue { i8*, i32 } %13, 1
  store i32 %15, i32* %ehselector.slot
  call void @_ZNSaIiED1Ev(%"class.std::allocator.0"* %ref.tmp6) nounwind
  br label %eh.resume

lpad11:                                           ; preds = %invoke.cont
  %16 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %17 = extractvalue { i8*, i32 } %16, 0
  store i8* %17, i8** %exn.slot
  %18 = extractvalue { i8*, i32 } %16, 1
  store i32 %18, i32* %ehselector.slot
  invoke void @_ZNSt6vectorIiSaIiEED1Ev(%"class.std::vector"* %skip_)
          to label %invoke.cont13 unwind label %terminate.lpad

invoke.cont13:                                    ; preds = %lpad11
  br label %eh.resume

eh.resume:                                        ; preds = %invoke.cont13, %lpad
  %exn = load i8** %exn.slot
  %sel = load i32* %ehselector.slot
  %lpad.val = insertvalue { i8*, i32 } undef, i8* %exn, 0
  %lpad.val14 = insertvalue { i8*, i32 } %lpad.val, i32 %sel, 1
  resume { i8*, i32 } %lpad.val14

terminate.lpad:                                   ; preds = %lpad11
  %19 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          catch i8* null
  call void @_ZSt9terminatev() noreturn nounwind
  unreachable
}

define linkonce_odr void @_ZNSt6vectorIiSaIiEEC1EjRKiRKS0_(%"class.std::vector"* %this, i32 %__n, i32* %__value, %"class.std::allocator.0"* %__a) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.std::vector"*, align 4
  %__n.addr = alloca i32, align 4
  %__value.addr = alloca i32*, align 4
  %__a.addr = alloca %"class.std::allocator.0"*, align 4
  store %"class.std::vector"* %this, %"class.std::vector"** %this.addr, align 4
  store i32 %__n, i32* %__n.addr, align 4
  store i32* %__value, i32** %__value.addr, align 4
  store %"class.std::allocator.0"* %__a, %"class.std::allocator.0"** %__a.addr, align 4
  %this1 = load %"class.std::vector"** %this.addr
  %0 = load i32* %__n.addr, align 4
  %1 = load i32** %__value.addr
  %2 = load %"class.std::allocator.0"** %__a.addr
  call void @_ZNSt6vectorIiSaIiEEC2EjRKiRKS0_(%"class.std::vector"* %this1, i32 %0, i32* %1, %"class.std::allocator.0"* %2)
  ret void
}

define linkonce_odr void @_ZNSaIiEC1Ev(%"class.std::allocator.0"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.std::allocator.0"*, align 4
  store %"class.std::allocator.0"* %this, %"class.std::allocator.0"** %this.addr, align 4
  %this1 = load %"class.std::allocator.0"** %this.addr
  call void @_ZNSaIiEC2Ev(%"class.std::allocator.0"* %this1) nounwind
  ret void
}

define linkonce_odr void @_ZNSaIiED1Ev(%"class.std::allocator.0"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.std::allocator.0"*, align 4
  store %"class.std::allocator.0"* %this, %"class.std::allocator.0"** %this.addr, align 4
  %this1 = load %"class.std::allocator.0"** %this.addr
  call void @_ZNSaIiED2Ev(%"class.std::allocator.0"* %this1) nounwind
  ret void
}

define linkonce_odr void @_ZN5boost9algorithm18knuth_morris_prattIN9__gnu_cxx17__normal_iteratorIPKcSsEEE15init_skip_tableES6_S6_(%"class.boost::algorithm::knuth_morris_pratt"* %this, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %first, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %last) align 2 {
entry:
  %this.addr = alloca %"class.boost::algorithm::knuth_morris_pratt"*, align 4
  %count = alloca i32, align 4
  %agg.tmp = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %agg.tmp2 = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %j = alloca i32, align 4
  %i = alloca i32, align 4
  %ref.tmp = alloca i32, align 4
  store %"class.boost::algorithm::knuth_morris_pratt"* %this, %"class.boost::algorithm::knuth_morris_pratt"** %this.addr, align 4
  %this1 = load %"class.boost::algorithm::knuth_morris_pratt"** %this.addr
  %0 = bitcast %"class.__gnu_cxx::__normal_iterator"* %agg.tmp to i8*
  %1 = bitcast %"class.__gnu_cxx::__normal_iterator"* %first to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %0, i8* %1, i32 4, i32 4, i1 false)
  %2 = bitcast %"class.__gnu_cxx::__normal_iterator"* %agg.tmp2 to i8*
  %3 = bitcast %"class.__gnu_cxx::__normal_iterator"* %last to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %2, i8* %3, i32 4, i32 4, i1 false)
  %call = call i32 @_ZSt8distanceIN9__gnu_cxx17__normal_iteratorIPKcSsEEENSt15iterator_traitsIT_E15difference_typeES6_S6_(%"class.__gnu_cxx::__normal_iterator"* byval align 4 %agg.tmp, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %agg.tmp2)
  store i32 %call, i32* %count, align 4
  %skip_ = getelementptr inbounds %"class.boost::algorithm::knuth_morris_pratt"* %this1, i32 0, i32 3
  %call3 = call i32* @_ZNSt6vectorIiSaIiEEixEj(%"class.std::vector"* %skip_, i32 0)
  store i32 -1, i32* %call3
  store i32 1, i32* %i, align 4
  br label %for.cond

for.cond:                                         ; preds = %for.inc, %entry
  %4 = load i32* %i, align 4
  %5 = load i32* %count, align 4
  %cmp = icmp sle i32 %4, %5
  br i1 %cmp, label %for.body, label %for.end

for.body:                                         ; preds = %for.cond
  %skip_4 = getelementptr inbounds %"class.boost::algorithm::knuth_morris_pratt"* %this1, i32 0, i32 3
  %6 = load i32* %i, align 4
  %sub = sub nsw i32 %6, 1
  %call5 = call i32* @_ZNSt6vectorIiSaIiEEixEj(%"class.std::vector"* %skip_4, i32 %sub)
  %7 = load i32* %call5
  store i32 %7, i32* %j, align 4
  br label %while.cond

while.cond:                                       ; preds = %if.end, %for.body
  %8 = load i32* %j, align 4
  %cmp6 = icmp sge i32 %8, 0
  br i1 %cmp6, label %while.body, label %while.end

while.body:                                       ; preds = %while.cond
  %call7 = call i8* @_ZNK9__gnu_cxx17__normal_iteratorIPKcSsEixERKi(%"class.__gnu_cxx::__normal_iterator"* %first, i32* %j)
  %9 = load i8* %call7
  %conv = sext i8 %9 to i32
  %10 = load i32* %i, align 4
  %sub8 = sub nsw i32 %10, 1
  store i32 %sub8, i32* %ref.tmp, align 4
  %call9 = call i8* @_ZNK9__gnu_cxx17__normal_iteratorIPKcSsEixERKi(%"class.__gnu_cxx::__normal_iterator"* %first, i32* %ref.tmp)
  %11 = load i8* %call9
  %conv10 = sext i8 %11 to i32
  %cmp11 = icmp eq i32 %conv, %conv10
  br i1 %cmp11, label %if.then, label %if.end

if.then:                                          ; preds = %while.body
  br label %while.end

if.end:                                           ; preds = %while.body
  %skip_12 = getelementptr inbounds %"class.boost::algorithm::knuth_morris_pratt"* %this1, i32 0, i32 3
  %12 = load i32* %j, align 4
  %call13 = call i32* @_ZNSt6vectorIiSaIiEEixEj(%"class.std::vector"* %skip_12, i32 %12)
  %13 = load i32* %call13
  store i32 %13, i32* %j, align 4
  br label %while.cond

while.end:                                        ; preds = %if.then, %while.cond
  %14 = load i32* %j, align 4
  %add = add nsw i32 %14, 1
  %skip_14 = getelementptr inbounds %"class.boost::algorithm::knuth_morris_pratt"* %this1, i32 0, i32 3
  %15 = load i32* %i, align 4
  %call15 = call i32* @_ZNSt6vectorIiSaIiEEixEj(%"class.std::vector"* %skip_14, i32 %15)
  store i32 %add, i32* %call15
  br label %for.inc

for.inc:                                          ; preds = %while.end
  %16 = load i32* %i, align 4
  %inc = add nsw i32 %16, 1
  store i32 %inc, i32* %i, align 4
  br label %for.cond

for.end:                                          ; preds = %for.cond
  ret void
}

define linkonce_odr i32* @_ZNSt6vectorIiSaIiEEixEj(%"class.std::vector"* %this, i32 %__n) nounwind align 2 {
entry:
  %this.addr = alloca %"class.std::vector"*, align 4
  %__n.addr = alloca i32, align 4
  store %"class.std::vector"* %this, %"class.std::vector"** %this.addr, align 4
  store i32 %__n, i32* %__n.addr, align 4
  %this1 = load %"class.std::vector"** %this.addr
  %0 = bitcast %"class.std::vector"* %this1 to %"struct.std::_Vector_base"*
  %_M_impl = getelementptr inbounds %"struct.std::_Vector_base"* %0, i32 0, i32 0
  %_M_start = getelementptr inbounds %"struct.std::_Vector_base<int, std::allocator<int> >::_Vector_impl"* %_M_impl, i32 0, i32 0
  %1 = load i32** %_M_start, align 4
  %2 = load i32* %__n.addr, align 4
  %add.ptr = getelementptr inbounds i32* %1, i32 %2
  ret i32* %add.ptr
}

define linkonce_odr void @_ZNSaIiEC2Ev(%"class.std::allocator.0"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.std::allocator.0"*, align 4
  store %"class.std::allocator.0"* %this, %"class.std::allocator.0"** %this.addr, align 4
  %this1 = load %"class.std::allocator.0"** %this.addr
  %0 = bitcast %"class.std::allocator.0"* %this1 to %"class.__gnu_cxx::new_allocator.1"*
  call void @_ZN9__gnu_cxx13new_allocatorIiEC2Ev(%"class.__gnu_cxx::new_allocator.1"* %0) nounwind
  ret void
}

define linkonce_odr void @_ZN9__gnu_cxx13new_allocatorIiEC2Ev(%"class.__gnu_cxx::new_allocator.1"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.__gnu_cxx::new_allocator.1"*, align 4
  store %"class.__gnu_cxx::new_allocator.1"* %this, %"class.__gnu_cxx::new_allocator.1"** %this.addr, align 4
  %this1 = load %"class.__gnu_cxx::new_allocator.1"** %this.addr
  ret void
}

define linkonce_odr void @_ZNSt6vectorIiSaIiEEC2EjRKiRKS0_(%"class.std::vector"* %this, i32 %__n, i32* %__value, %"class.std::allocator.0"* %__a) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.std::vector"*, align 4
  %__n.addr = alloca i32, align 4
  %__value.addr = alloca i32*, align 4
  %__a.addr = alloca %"class.std::allocator.0"*, align 4
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  store %"class.std::vector"* %this, %"class.std::vector"** %this.addr, align 4
  store i32 %__n, i32* %__n.addr, align 4
  store i32* %__value, i32** %__value.addr, align 4
  store %"class.std::allocator.0"* %__a, %"class.std::allocator.0"** %__a.addr, align 4
  %this1 = load %"class.std::vector"** %this.addr
  %0 = bitcast %"class.std::vector"* %this1 to %"struct.std::_Vector_base"*
  %1 = load i32* %__n.addr, align 4
  %2 = load %"class.std::allocator.0"** %__a.addr, align 4
  call void @_ZNSt12_Vector_baseIiSaIiEEC2EjRKS0_(%"struct.std::_Vector_base"* %0, i32 %1, %"class.std::allocator.0"* %2)
  %3 = load i32* %__n.addr, align 4
  %4 = load i32** %__value.addr, align 4
  invoke void @_ZNSt6vectorIiSaIiEE18_M_fill_initializeEjRKi(%"class.std::vector"* %this1, i32 %3, i32* %4)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %entry
  ret void

lpad:                                             ; preds = %entry
  %5 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %6 = extractvalue { i8*, i32 } %5, 0
  store i8* %6, i8** %exn.slot
  %7 = extractvalue { i8*, i32 } %5, 1
  store i32 %7, i32* %ehselector.slot
  %8 = bitcast %"class.std::vector"* %this1 to %"struct.std::_Vector_base"*
  invoke void @_ZNSt12_Vector_baseIiSaIiEED2Ev(%"struct.std::_Vector_base"* %8)
          to label %invoke.cont2 unwind label %terminate.lpad

invoke.cont2:                                     ; preds = %lpad
  br label %eh.resume

eh.resume:                                        ; preds = %invoke.cont2
  %exn = load i8** %exn.slot
  %sel = load i32* %ehselector.slot
  %lpad.val = insertvalue { i8*, i32 } undef, i8* %exn, 0
  %lpad.val3 = insertvalue { i8*, i32 } %lpad.val, i32 %sel, 1
  resume { i8*, i32 } %lpad.val3

terminate.lpad:                                   ; preds = %lpad
  %9 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          catch i8* null
  call void @_ZSt9terminatev() noreturn nounwind
  unreachable
}

define linkonce_odr void @_ZNSt12_Vector_baseIiSaIiEEC2EjRKS0_(%"struct.std::_Vector_base"* %this, i32 %__n, %"class.std::allocator.0"* %__a) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"struct.std::_Vector_base"*, align 4
  %__n.addr = alloca i32, align 4
  %__a.addr = alloca %"class.std::allocator.0"*, align 4
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  store %"struct.std::_Vector_base"* %this, %"struct.std::_Vector_base"** %this.addr, align 4
  store i32 %__n, i32* %__n.addr, align 4
  store %"class.std::allocator.0"* %__a, %"class.std::allocator.0"** %__a.addr, align 4
  %this1 = load %"struct.std::_Vector_base"** %this.addr
  %_M_impl = getelementptr inbounds %"struct.std::_Vector_base"* %this1, i32 0, i32 0
  %0 = load %"class.std::allocator.0"** %__a.addr, align 4
  call void @_ZNSt12_Vector_baseIiSaIiEE12_Vector_implC1ERKS0_(%"struct.std::_Vector_base<int, std::allocator<int> >::_Vector_impl"* %_M_impl, %"class.std::allocator.0"* %0)
  %1 = load i32* %__n.addr, align 4
  %call = invoke i32* @_ZNSt12_Vector_baseIiSaIiEE11_M_allocateEj(%"struct.std::_Vector_base"* %this1, i32 %1)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %entry
  %_M_impl2 = getelementptr inbounds %"struct.std::_Vector_base"* %this1, i32 0, i32 0
  %_M_start = getelementptr inbounds %"struct.std::_Vector_base<int, std::allocator<int> >::_Vector_impl"* %_M_impl2, i32 0, i32 0
  store i32* %call, i32** %_M_start, align 4
  %_M_impl3 = getelementptr inbounds %"struct.std::_Vector_base"* %this1, i32 0, i32 0
  %_M_start4 = getelementptr inbounds %"struct.std::_Vector_base<int, std::allocator<int> >::_Vector_impl"* %_M_impl3, i32 0, i32 0
  %2 = load i32** %_M_start4, align 4
  %_M_impl5 = getelementptr inbounds %"struct.std::_Vector_base"* %this1, i32 0, i32 0
  %_M_finish = getelementptr inbounds %"struct.std::_Vector_base<int, std::allocator<int> >::_Vector_impl"* %_M_impl5, i32 0, i32 1
  store i32* %2, i32** %_M_finish, align 4
  %_M_impl6 = getelementptr inbounds %"struct.std::_Vector_base"* %this1, i32 0, i32 0
  %_M_start7 = getelementptr inbounds %"struct.std::_Vector_base<int, std::allocator<int> >::_Vector_impl"* %_M_impl6, i32 0, i32 0
  %3 = load i32** %_M_start7, align 4
  %4 = load i32* %__n.addr, align 4
  %add.ptr = getelementptr inbounds i32* %3, i32 %4
  %_M_impl8 = getelementptr inbounds %"struct.std::_Vector_base"* %this1, i32 0, i32 0
  %_M_end_of_storage = getelementptr inbounds %"struct.std::_Vector_base<int, std::allocator<int> >::_Vector_impl"* %_M_impl8, i32 0, i32 2
  store i32* %add.ptr, i32** %_M_end_of_storage, align 4
  ret void

lpad:                                             ; preds = %entry
  %5 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %6 = extractvalue { i8*, i32 } %5, 0
  store i8* %6, i8** %exn.slot
  %7 = extractvalue { i8*, i32 } %5, 1
  store i32 %7, i32* %ehselector.slot
  call void @_ZNSt12_Vector_baseIiSaIiEE12_Vector_implD1Ev(%"struct.std::_Vector_base<int, std::allocator<int> >::_Vector_impl"* %_M_impl) nounwind
  br label %eh.resume

eh.resume:                                        ; preds = %lpad
  %exn = load i8** %exn.slot
  %sel = load i32* %ehselector.slot
  %lpad.val = insertvalue { i8*, i32 } undef, i8* %exn, 0
  %lpad.val9 = insertvalue { i8*, i32 } %lpad.val, i32 %sel, 1
  resume { i8*, i32 } %lpad.val9
}

define linkonce_odr void @_ZNSt6vectorIiSaIiEE18_M_fill_initializeEjRKi(%"class.std::vector"* %this, i32 %__n, i32* %__value) align 2 {
entry:
  %this.addr = alloca %"class.std::vector"*, align 4
  %__n.addr = alloca i32, align 4
  %__value.addr = alloca i32*, align 4
  store %"class.std::vector"* %this, %"class.std::vector"** %this.addr, align 4
  store i32 %__n, i32* %__n.addr, align 4
  store i32* %__value, i32** %__value.addr, align 4
  %this1 = load %"class.std::vector"** %this.addr
  %0 = bitcast %"class.std::vector"* %this1 to %"struct.std::_Vector_base"*
  %_M_impl = getelementptr inbounds %"struct.std::_Vector_base"* %0, i32 0, i32 0
  %_M_start = getelementptr inbounds %"struct.std::_Vector_base<int, std::allocator<int> >::_Vector_impl"* %_M_impl, i32 0, i32 0
  %1 = load i32** %_M_start, align 4
  %2 = load i32* %__n.addr, align 4
  %3 = load i32** %__value.addr, align 4
  %4 = bitcast %"class.std::vector"* %this1 to %"struct.std::_Vector_base"*
  %call = call %"class.std::allocator.0"* @_ZNSt12_Vector_baseIiSaIiEE19_M_get_Tp_allocatorEv(%"struct.std::_Vector_base"* %4)
  call void @_ZSt24__uninitialized_fill_n_aIPijiiEvT_T0_RKT1_RSaIT2_E(i32* %1, i32 %2, i32* %3, %"class.std::allocator.0"* %call)
  %5 = bitcast %"class.std::vector"* %this1 to %"struct.std::_Vector_base"*
  %_M_impl2 = getelementptr inbounds %"struct.std::_Vector_base"* %5, i32 0, i32 0
  %_M_end_of_storage = getelementptr inbounds %"struct.std::_Vector_base<int, std::allocator<int> >::_Vector_impl"* %_M_impl2, i32 0, i32 2
  %6 = load i32** %_M_end_of_storage, align 4
  %7 = bitcast %"class.std::vector"* %this1 to %"struct.std::_Vector_base"*
  %_M_impl3 = getelementptr inbounds %"struct.std::_Vector_base"* %7, i32 0, i32 0
  %_M_finish = getelementptr inbounds %"struct.std::_Vector_base<int, std::allocator<int> >::_Vector_impl"* %_M_impl3, i32 0, i32 1
  store i32* %6, i32** %_M_finish, align 4
  ret void
}

define linkonce_odr void @_ZSt24__uninitialized_fill_n_aIPijiiEvT_T0_RKT1_RSaIT2_E(i32* %__first, i32 %__n, i32* %__x, %"class.std::allocator.0"*) inlinehint {
entry:
  %__first.addr = alloca i32*, align 4
  %__n.addr = alloca i32, align 4
  %__x.addr = alloca i32*, align 4
  %.addr = alloca %"class.std::allocator.0"*, align 4
  store i32* %__first, i32** %__first.addr, align 4
  store i32 %__n, i32* %__n.addr, align 4
  store i32* %__x, i32** %__x.addr, align 4
  store %"class.std::allocator.0"* %0, %"class.std::allocator.0"** %.addr, align 4
  %1 = load i32** %__first.addr, align 4
  %2 = load i32* %__n.addr, align 4
  %3 = load i32** %__x.addr, align 4
  call void @_ZSt20uninitialized_fill_nIPijiEvT_T0_RKT1_(i32* %1, i32 %2, i32* %3)
  ret void
}

define linkonce_odr void @_ZSt20uninitialized_fill_nIPijiEvT_T0_RKT1_(i32* %__first, i32 %__n, i32* %__x) inlinehint {
entry:
  %__first.addr = alloca i32*, align 4
  %__n.addr = alloca i32, align 4
  %__x.addr = alloca i32*, align 4
  store i32* %__first, i32** %__first.addr, align 4
  store i32 %__n, i32* %__n.addr, align 4
  store i32* %__x, i32** %__x.addr, align 4
  %0 = load i32** %__first.addr, align 4
  %1 = load i32* %__n.addr, align 4
  %2 = load i32** %__x.addr, align 4
  call void @_ZNSt22__uninitialized_fill_nILb1EE15__uninit_fill_nIPijiEEvT_T0_RKT1_(i32* %0, i32 %1, i32* %2)
  ret void
}

define linkonce_odr void @_ZNSt22__uninitialized_fill_nILb1EE15__uninit_fill_nIPijiEEvT_T0_RKT1_(i32* %__first, i32 %__n, i32* %__x) align 2 {
entry:
  %__first.addr = alloca i32*, align 4
  %__n.addr = alloca i32, align 4
  %__x.addr = alloca i32*, align 4
  store i32* %__first, i32** %__first.addr, align 4
  store i32 %__n, i32* %__n.addr, align 4
  store i32* %__x, i32** %__x.addr, align 4
  %0 = load i32** %__first.addr, align 4
  %1 = load i32* %__n.addr, align 4
  %2 = load i32** %__x.addr, align 4
  %call = call i32* @_ZSt6fill_nIPijiET_S1_T0_RKT1_(i32* %0, i32 %1, i32* %2)
  ret void
}

define linkonce_odr i32* @_ZSt6fill_nIPijiET_S1_T0_RKT1_(i32* %__first, i32 %__n, i32* %__value) {
entry:
  %__first.addr = alloca i32*, align 4
  %__n.addr = alloca i32, align 4
  %__value.addr = alloca i32*, align 4
  store i32* %__first, i32** %__first.addr, align 4
  store i32 %__n, i32* %__n.addr, align 4
  store i32* %__value, i32** %__value.addr, align 4
  %0 = load i32** %__first.addr, align 4
  %call = call i32* @_ZSt12__niter_baseIPiENSt11_Niter_baseIT_E13iterator_typeES2_(i32* %0)
  %1 = load i32* %__n.addr, align 4
  %2 = load i32** %__value.addr, align 4
  %call1 = call i32* @_ZSt10__fill_n_aIPijiEN9__gnu_cxx11__enable_ifIXsr11__is_scalarIT1_EE7__valueET_E6__typeES4_T0_RKS3_(i32* %call, i32 %1, i32* %2)
  ret i32* %call1
}

define linkonce_odr i32* @_ZSt10__fill_n_aIPijiEN9__gnu_cxx11__enable_ifIXsr11__is_scalarIT1_EE7__valueET_E6__typeES4_T0_RKS3_(i32* %__first, i32 %__n, i32* %__value) nounwind inlinehint {
entry:
  %__first.addr = alloca i32*, align 4
  %__n.addr = alloca i32, align 4
  %__value.addr = alloca i32*, align 4
  %__tmp = alloca i32, align 4
  %__niter = alloca i32, align 4
  store i32* %__first, i32** %__first.addr, align 4
  store i32 %__n, i32* %__n.addr, align 4
  store i32* %__value, i32** %__value.addr, align 4
  %0 = load i32** %__value.addr, align 4
  %1 = load i32* %0, align 4
  store i32 %1, i32* %__tmp, align 4
  %2 = load i32* %__n.addr, align 4
  store i32 %2, i32* %__niter, align 4
  br label %for.cond

for.cond:                                         ; preds = %for.inc, %entry
  %3 = load i32* %__niter, align 4
  %cmp = icmp ugt i32 %3, 0
  br i1 %cmp, label %for.body, label %for.end

for.body:                                         ; preds = %for.cond
  %4 = load i32* %__tmp, align 4
  %5 = load i32** %__first.addr, align 4
  store i32 %4, i32* %5, align 4
  br label %for.inc

for.inc:                                          ; preds = %for.body
  %6 = load i32* %__niter, align 4
  %dec = add i32 %6, -1
  store i32 %dec, i32* %__niter, align 4
  %7 = load i32** %__first.addr, align 4
  %incdec.ptr = getelementptr inbounds i32* %7, i32 1
  store i32* %incdec.ptr, i32** %__first.addr, align 4
  br label %for.cond

for.end:                                          ; preds = %for.cond
  %8 = load i32** %__first.addr, align 4
  ret i32* %8
}

define linkonce_odr i32* @_ZSt12__niter_baseIPiENSt11_Niter_baseIT_E13iterator_typeES2_(i32* %__it) inlinehint {
entry:
  %__it.addr = alloca i32*, align 4
  store i32* %__it, i32** %__it.addr, align 4
  %0 = load i32** %__it.addr, align 4
  %call = call i32* @_ZNSt10_Iter_baseIPiLb0EE7_S_baseES0_(i32* %0)
  ret i32* %call
}

define linkonce_odr i32* @_ZNSt10_Iter_baseIPiLb0EE7_S_baseES0_(i32* %__it) nounwind align 2 {
entry:
  %__it.addr = alloca i32*, align 4
  store i32* %__it, i32** %__it.addr, align 4
  %0 = load i32** %__it.addr, align 4
  ret i32* %0
}

define linkonce_odr void @_ZNSt12_Vector_baseIiSaIiEE12_Vector_implC1ERKS0_(%"struct.std::_Vector_base<int, std::allocator<int> >::_Vector_impl"* %this, %"class.std::allocator.0"* %__a) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"struct.std::_Vector_base<int, std::allocator<int> >::_Vector_impl"*, align 4
  %__a.addr = alloca %"class.std::allocator.0"*, align 4
  store %"struct.std::_Vector_base<int, std::allocator<int> >::_Vector_impl"* %this, %"struct.std::_Vector_base<int, std::allocator<int> >::_Vector_impl"** %this.addr, align 4
  store %"class.std::allocator.0"* %__a, %"class.std::allocator.0"** %__a.addr, align 4
  %this1 = load %"struct.std::_Vector_base<int, std::allocator<int> >::_Vector_impl"** %this.addr
  %0 = load %"class.std::allocator.0"** %__a.addr
  call void @_ZNSt12_Vector_baseIiSaIiEE12_Vector_implC2ERKS0_(%"struct.std::_Vector_base<int, std::allocator<int> >::_Vector_impl"* %this1, %"class.std::allocator.0"* %0)
  ret void
}

define linkonce_odr i32* @_ZNSt12_Vector_baseIiSaIiEE11_M_allocateEj(%"struct.std::_Vector_base"* %this, i32 %__n) align 2 {
entry:
  %this.addr = alloca %"struct.std::_Vector_base"*, align 4
  %__n.addr = alloca i32, align 4
  store %"struct.std::_Vector_base"* %this, %"struct.std::_Vector_base"** %this.addr, align 4
  store i32 %__n, i32* %__n.addr, align 4
  %this1 = load %"struct.std::_Vector_base"** %this.addr
  %0 = load i32* %__n.addr, align 4
  %cmp = icmp ne i32 %0, 0
  br i1 %cmp, label %cond.true, label %cond.false

cond.true:                                        ; preds = %entry
  %_M_impl = getelementptr inbounds %"struct.std::_Vector_base"* %this1, i32 0, i32 0
  %1 = bitcast %"struct.std::_Vector_base<int, std::allocator<int> >::_Vector_impl"* %_M_impl to %"class.__gnu_cxx::new_allocator.1"*
  %2 = load i32* %__n.addr, align 4
  %call = call i32* @_ZN9__gnu_cxx13new_allocatorIiE8allocateEjPKv(%"class.__gnu_cxx::new_allocator.1"* %1, i32 %2, i8* null)
  br label %cond.end

cond.false:                                       ; preds = %entry
  br label %cond.end

cond.end:                                         ; preds = %cond.false, %cond.true
  %cond = phi i32* [ %call, %cond.true ], [ null, %cond.false ]
  ret i32* %cond
}

define linkonce_odr i32* @_ZN9__gnu_cxx13new_allocatorIiE8allocateEjPKv(%"class.__gnu_cxx::new_allocator.1"* %this, i32 %__n, i8*) align 2 {
entry:
  %this.addr = alloca %"class.__gnu_cxx::new_allocator.1"*, align 4
  %__n.addr = alloca i32, align 4
  %.addr = alloca i8*, align 4
  store %"class.__gnu_cxx::new_allocator.1"* %this, %"class.__gnu_cxx::new_allocator.1"** %this.addr, align 4
  store i32 %__n, i32* %__n.addr, align 4
  store i8* %0, i8** %.addr, align 4
  %this1 = load %"class.__gnu_cxx::new_allocator.1"** %this.addr
  %1 = load i32* %__n.addr, align 4
  %call = call i32 @_ZNK9__gnu_cxx13new_allocatorIiE8max_sizeEv(%"class.__gnu_cxx::new_allocator.1"* %this1) nounwind
  %cmp = icmp ugt i32 %1, %call
  br i1 %cmp, label %if.then, label %if.end

if.then:                                          ; preds = %entry
  call void @_ZSt17__throw_bad_allocv() noreturn
  unreachable

if.end:                                           ; preds = %entry
  %2 = load i32* %__n.addr, align 4
  %mul = mul i32 %2, 4
  %call2 = call noalias i8* @_Znwj(i32 %mul)
  %3 = bitcast i8* %call2 to i32*
  ret i32* %3
}

define linkonce_odr i32 @_ZNK9__gnu_cxx13new_allocatorIiE8max_sizeEv(%"class.__gnu_cxx::new_allocator.1"* %this) nounwind align 2 {
entry:
  %this.addr = alloca %"class.__gnu_cxx::new_allocator.1"*, align 4
  store %"class.__gnu_cxx::new_allocator.1"* %this, %"class.__gnu_cxx::new_allocator.1"** %this.addr, align 4
  %this1 = load %"class.__gnu_cxx::new_allocator.1"** %this.addr
  ret i32 1073741823
}

declare void @_ZSt17__throw_bad_allocv() noreturn

declare noalias i8* @_Znwj(i32)

define linkonce_odr void @_ZNSt12_Vector_baseIiSaIiEE12_Vector_implC2ERKS0_(%"struct.std::_Vector_base<int, std::allocator<int> >::_Vector_impl"* %this, %"class.std::allocator.0"* %__a) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"struct.std::_Vector_base<int, std::allocator<int> >::_Vector_impl"*, align 4
  %__a.addr = alloca %"class.std::allocator.0"*, align 4
  store %"struct.std::_Vector_base<int, std::allocator<int> >::_Vector_impl"* %this, %"struct.std::_Vector_base<int, std::allocator<int> >::_Vector_impl"** %this.addr, align 4
  store %"class.std::allocator.0"* %__a, %"class.std::allocator.0"** %__a.addr, align 4
  %this1 = load %"struct.std::_Vector_base<int, std::allocator<int> >::_Vector_impl"** %this.addr
  %0 = bitcast %"struct.std::_Vector_base<int, std::allocator<int> >::_Vector_impl"* %this1 to %"class.std::allocator.0"*
  %1 = load %"class.std::allocator.0"** %__a.addr, align 4
  call void @_ZNSaIiEC2ERKS_(%"class.std::allocator.0"* %0, %"class.std::allocator.0"* %1) nounwind
  %_M_start = getelementptr inbounds %"struct.std::_Vector_base<int, std::allocator<int> >::_Vector_impl"* %this1, i32 0, i32 0
  store i32* null, i32** %_M_start, align 4
  %_M_finish = getelementptr inbounds %"struct.std::_Vector_base<int, std::allocator<int> >::_Vector_impl"* %this1, i32 0, i32 1
  store i32* null, i32** %_M_finish, align 4
  %_M_end_of_storage = getelementptr inbounds %"struct.std::_Vector_base<int, std::allocator<int> >::_Vector_impl"* %this1, i32 0, i32 2
  store i32* null, i32** %_M_end_of_storage, align 4
  ret void
}

define linkonce_odr void @_ZNSaIiEC2ERKS_(%"class.std::allocator.0"* %this, %"class.std::allocator.0"* %__a) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.std::allocator.0"*, align 4
  %__a.addr = alloca %"class.std::allocator.0"*, align 4
  store %"class.std::allocator.0"* %this, %"class.std::allocator.0"** %this.addr, align 4
  store %"class.std::allocator.0"* %__a, %"class.std::allocator.0"** %__a.addr, align 4
  %this1 = load %"class.std::allocator.0"** %this.addr
  %0 = bitcast %"class.std::allocator.0"* %this1 to %"class.__gnu_cxx::new_allocator.1"*
  %1 = load %"class.std::allocator.0"** %__a.addr, align 4
  %2 = bitcast %"class.std::allocator.0"* %1 to %"class.__gnu_cxx::new_allocator.1"*
  call void @_ZN9__gnu_cxx13new_allocatorIiEC2ERKS1_(%"class.__gnu_cxx::new_allocator.1"* %0, %"class.__gnu_cxx::new_allocator.1"* %2) nounwind
  ret void
}

define linkonce_odr void @_ZN9__gnu_cxx13new_allocatorIiEC2ERKS1_(%"class.__gnu_cxx::new_allocator.1"* %this, %"class.__gnu_cxx::new_allocator.1"*) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.__gnu_cxx::new_allocator.1"*, align 4
  %.addr = alloca %"class.__gnu_cxx::new_allocator.1"*, align 4
  store %"class.__gnu_cxx::new_allocator.1"* %this, %"class.__gnu_cxx::new_allocator.1"** %this.addr, align 4
  store %"class.__gnu_cxx::new_allocator.1"* %0, %"class.__gnu_cxx::new_allocator.1"** %.addr, align 4
  %this1 = load %"class.__gnu_cxx::new_allocator.1"** %this.addr
  ret void
}

define linkonce_odr void @_ZN5boost9algorithm20boyer_moore_horspoolIN9__gnu_cxx17__normal_iteratorIPKcSsEENS0_6detail9BM_traitsIS6_EEEC1ES6_S6_(%"class.boost::algorithm::boyer_moore_horspool"* %this, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %first, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %last) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::algorithm::boyer_moore_horspool"*, align 4
  store %"class.boost::algorithm::boyer_moore_horspool"* %this, %"class.boost::algorithm::boyer_moore_horspool"** %this.addr, align 4
  %this1 = load %"class.boost::algorithm::boyer_moore_horspool"** %this.addr
  call void @_ZN5boost9algorithm20boyer_moore_horspoolIN9__gnu_cxx17__normal_iteratorIPKcSsEENS0_6detail9BM_traitsIS6_EEEC2ES6_S6_(%"class.boost::algorithm::boyer_moore_horspool"* %this1, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %first, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %last)
  ret void
}

define linkonce_odr void @_ZNK5boost9algorithm20boyer_moore_horspoolIN9__gnu_cxx17__normal_iteratorIPKcSsEENS0_6detail9BM_traitsIS6_EEEclIS6_EET_SC_SC_(%"class.__gnu_cxx::__normal_iterator"* noalias sret %agg.result, %"class.boost::algorithm::boyer_moore_horspool"* %this, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %corpus_first, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %corpus_last) align 2 {
entry:
  %this.addr = alloca %"class.boost::algorithm::boyer_moore_horspool"*, align 4
  %k_corpus_length = alloca i32, align 4
  %agg.tmp = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %agg.tmp5 = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %agg.tmp9 = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %agg.tmp10 = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  store %"class.boost::algorithm::boyer_moore_horspool"* %this, %"class.boost::algorithm::boyer_moore_horspool"** %this.addr, align 4
  %this1 = load %"class.boost::algorithm::boyer_moore_horspool"** %this.addr
  %call = call zeroext i1 @_ZN9__gnu_cxxeqIPKcSsEEbRKNS_17__normal_iteratorIT_T0_EES8_(%"class.__gnu_cxx::__normal_iterator"* %corpus_first, %"class.__gnu_cxx::__normal_iterator"* %corpus_last)
  br i1 %call, label %if.then, label %if.end

if.then:                                          ; preds = %entry
  %0 = bitcast %"class.__gnu_cxx::__normal_iterator"* %agg.result to i8*
  %1 = bitcast %"class.__gnu_cxx::__normal_iterator"* %corpus_last to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %0, i8* %1, i32 4, i32 4, i1 false)
  br label %return

if.end:                                           ; preds = %entry
  %pat_first = getelementptr inbounds %"class.boost::algorithm::boyer_moore_horspool"* %this1, i32 0, i32 0
  %pat_last = getelementptr inbounds %"class.boost::algorithm::boyer_moore_horspool"* %this1, i32 0, i32 1
  %call2 = call zeroext i1 @_ZN9__gnu_cxxeqIPKcSsEEbRKNS_17__normal_iteratorIT_T0_EES8_(%"class.__gnu_cxx::__normal_iterator"* %pat_first, %"class.__gnu_cxx::__normal_iterator"* %pat_last)
  br i1 %call2, label %if.then3, label %if.end4

if.then3:                                         ; preds = %if.end
  %2 = bitcast %"class.__gnu_cxx::__normal_iterator"* %agg.result to i8*
  %3 = bitcast %"class.__gnu_cxx::__normal_iterator"* %corpus_first to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %2, i8* %3, i32 4, i32 4, i1 false)
  br label %return

if.end4:                                          ; preds = %if.end
  %4 = bitcast %"class.__gnu_cxx::__normal_iterator"* %agg.tmp to i8*
  %5 = bitcast %"class.__gnu_cxx::__normal_iterator"* %corpus_first to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %4, i8* %5, i32 4, i32 4, i1 false)
  %6 = bitcast %"class.__gnu_cxx::__normal_iterator"* %agg.tmp5 to i8*
  %7 = bitcast %"class.__gnu_cxx::__normal_iterator"* %corpus_last to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %6, i8* %7, i32 4, i32 4, i1 false)
  %call6 = call i32 @_ZSt8distanceIN9__gnu_cxx17__normal_iteratorIPKcSsEEENSt15iterator_traitsIT_E15difference_typeES6_S6_(%"class.__gnu_cxx::__normal_iterator"* byval align 4 %agg.tmp, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %agg.tmp5)
  store i32 %call6, i32* %k_corpus_length, align 4
  %8 = load i32* %k_corpus_length, align 4
  %k_pattern_length = getelementptr inbounds %"class.boost::algorithm::boyer_moore_horspool"* %this1, i32 0, i32 2
  %9 = load i32* %k_pattern_length, align 4
  %cmp = icmp slt i32 %8, %9
  br i1 %cmp, label %if.then7, label %if.end8

if.then7:                                         ; preds = %if.end4
  %10 = bitcast %"class.__gnu_cxx::__normal_iterator"* %agg.result to i8*
  %11 = bitcast %"class.__gnu_cxx::__normal_iterator"* %corpus_last to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %10, i8* %11, i32 4, i32 4, i1 false)
  br label %return

if.end8:                                          ; preds = %if.end4
  %12 = bitcast %"class.__gnu_cxx::__normal_iterator"* %agg.tmp9 to i8*
  %13 = bitcast %"class.__gnu_cxx::__normal_iterator"* %corpus_first to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %12, i8* %13, i32 4, i32 4, i1 false)
  %14 = bitcast %"class.__gnu_cxx::__normal_iterator"* %agg.tmp10 to i8*
  %15 = bitcast %"class.__gnu_cxx::__normal_iterator"* %corpus_last to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %14, i8* %15, i32 4, i32 4, i1 false)
  call void @_ZNK5boost9algorithm20boyer_moore_horspoolIN9__gnu_cxx17__normal_iteratorIPKcSsEENS0_6detail9BM_traitsIS6_EEE9do_searchIS6_EET_SC_SC_(%"class.__gnu_cxx::__normal_iterator"* sret %agg.result, %"class.boost::algorithm::boyer_moore_horspool"* %this1, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %agg.tmp9, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %agg.tmp10)
  br label %return

return:                                           ; preds = %if.end8, %if.then7, %if.then3, %if.then
  ret void
}

define linkonce_odr void @_ZN5boost9algorithm20boyer_moore_horspoolIN9__gnu_cxx17__normal_iteratorIPKcSsEENS0_6detail9BM_traitsIS6_EEED1Ev(%"class.boost::algorithm::boyer_moore_horspool"* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::algorithm::boyer_moore_horspool"*, align 4
  store %"class.boost::algorithm::boyer_moore_horspool"* %this, %"class.boost::algorithm::boyer_moore_horspool"** %this.addr, align 4
  %this1 = load %"class.boost::algorithm::boyer_moore_horspool"** %this.addr
  call void @_ZN5boost9algorithm20boyer_moore_horspoolIN9__gnu_cxx17__normal_iteratorIPKcSsEENS0_6detail9BM_traitsIS6_EEED2Ev(%"class.boost::algorithm::boyer_moore_horspool"* %this1)
  ret void
}

define linkonce_odr void @_ZN5boost9algorithm20boyer_moore_horspoolIN9__gnu_cxx17__normal_iteratorIPKcSsEENS0_6detail9BM_traitsIS6_EEED2Ev(%"class.boost::algorithm::boyer_moore_horspool"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::algorithm::boyer_moore_horspool"*, align 4
  store %"class.boost::algorithm::boyer_moore_horspool"* %this, %"class.boost::algorithm::boyer_moore_horspool"** %this.addr, align 4
  %this1 = load %"class.boost::algorithm::boyer_moore_horspool"** %this.addr
  ret void
}

define linkonce_odr void @_ZNK5boost9algorithm20boyer_moore_horspoolIN9__gnu_cxx17__normal_iteratorIPKcSsEENS0_6detail9BM_traitsIS6_EEE9do_searchIS6_EET_SC_SC_(%"class.__gnu_cxx::__normal_iterator"* noalias sret %agg.result, %"class.boost::algorithm::boyer_moore_horspool"* %this, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %corpus_first, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %corpus_last) align 2 {
entry:
  %this.addr = alloca %"class.boost::algorithm::boyer_moore_horspool"*, align 4
  %curPos = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %lastPos = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %j = alloca i32, align 4
  %ref.tmp = alloca i32, align 4
  %ref.tmp5 = alloca i32, align 4
  %ref.tmp12 = alloca i32, align 4
  %ref.tmp15 = alloca i32, align 4
  store %"class.boost::algorithm::boyer_moore_horspool"* %this, %"class.boost::algorithm::boyer_moore_horspool"** %this.addr, align 4
  %this1 = load %"class.boost::algorithm::boyer_moore_horspool"** %this.addr
  %0 = bitcast %"class.__gnu_cxx::__normal_iterator"* %curPos to i8*
  %1 = bitcast %"class.__gnu_cxx::__normal_iterator"* %corpus_first to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %0, i8* %1, i32 4, i32 4, i1 false)
  %k_pattern_length = getelementptr inbounds %"class.boost::algorithm::boyer_moore_horspool"* %this1, i32 0, i32 2
  call void @_ZNK9__gnu_cxx17__normal_iteratorIPKcSsEmiERKi(%"class.__gnu_cxx::__normal_iterator"* sret %lastPos, %"class.__gnu_cxx::__normal_iterator"* %corpus_last, i32* %k_pattern_length)
  br label %while.cond

while.cond:                                       ; preds = %while.end, %entry
  %call = call zeroext i1 @_ZN9__gnu_cxxleIPKcSsEEbRKNS_17__normal_iteratorIT_T0_EES8_(%"class.__gnu_cxx::__normal_iterator"* %curPos, %"class.__gnu_cxx::__normal_iterator"* %lastPos)
  br i1 %call, label %while.body, label %while.end17

while.body:                                       ; preds = %while.cond
  %k_pattern_length2 = getelementptr inbounds %"class.boost::algorithm::boyer_moore_horspool"* %this1, i32 0, i32 2
  %2 = load i32* %k_pattern_length2, align 4
  %sub = sub nsw i32 %2, 1
  store i32 %sub, i32* %j, align 4
  br label %while.cond3

while.cond3:                                      ; preds = %if.end, %while.body
  %pat_first = getelementptr inbounds %"class.boost::algorithm::boyer_moore_horspool"* %this1, i32 0, i32 0
  %3 = load i32* %j, align 4
  store i32 %3, i32* %ref.tmp, align 4
  %call4 = call i8* @_ZNK9__gnu_cxx17__normal_iteratorIPKcSsEixERKi(%"class.__gnu_cxx::__normal_iterator"* %pat_first, i32* %ref.tmp)
  %4 = load i8* %call4
  %conv = sext i8 %4 to i32
  %5 = load i32* %j, align 4
  store i32 %5, i32* %ref.tmp5, align 4
  %call6 = call i8* @_ZNK9__gnu_cxx17__normal_iteratorIPKcSsEixERKi(%"class.__gnu_cxx::__normal_iterator"* %curPos, i32* %ref.tmp5)
  %6 = load i8* %call6
  %conv7 = sext i8 %6 to i32
  %cmp = icmp eq i32 %conv, %conv7
  br i1 %cmp, label %while.body8, label %while.end

while.body8:                                      ; preds = %while.cond3
  %7 = load i32* %j, align 4
  %cmp9 = icmp eq i32 %7, 0
  br i1 %cmp9, label %if.then, label %if.end

if.then:                                          ; preds = %while.body8
  %8 = bitcast %"class.__gnu_cxx::__normal_iterator"* %agg.result to i8*
  %9 = bitcast %"class.__gnu_cxx::__normal_iterator"* %curPos to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %8, i8* %9, i32 4, i32 4, i1 false)
  br label %return

if.end:                                           ; preds = %while.body8
  %10 = load i32* %j, align 4
  %dec = add i32 %10, -1
  store i32 %dec, i32* %j, align 4
  br label %while.cond3

while.end:                                        ; preds = %while.cond3
  %skip_ = getelementptr inbounds %"class.boost::algorithm::boyer_moore_horspool"* %this1, i32 0, i32 3
  %k_pattern_length10 = getelementptr inbounds %"class.boost::algorithm::boyer_moore_horspool"* %this1, i32 0, i32 2
  %11 = load i32* %k_pattern_length10, align 4
  %sub11 = sub nsw i32 %11, 1
  store i32 %sub11, i32* %ref.tmp12, align 4
  %call13 = call i8* @_ZNK9__gnu_cxx17__normal_iteratorIPKcSsEixERKi(%"class.__gnu_cxx::__normal_iterator"* %curPos, i32* %ref.tmp12)
  %12 = load i8* %call13
  %call14 = call i32 @_ZNK5boost9algorithm6detail10skip_tableIciLb1EEixEc(%"class.boost::algorithm::detail::skip_table"* %skip_, i8 signext %12)
  store i32 %call14, i32* %ref.tmp15, align 4
  %call16 = call %"class.__gnu_cxx::__normal_iterator"* @_ZN9__gnu_cxx17__normal_iteratorIPKcSsEpLERKi(%"class.__gnu_cxx::__normal_iterator"* %curPos, i32* %ref.tmp15)
  br label %while.cond

while.end17:                                      ; preds = %while.cond
  %13 = bitcast %"class.__gnu_cxx::__normal_iterator"* %agg.result to i8*
  %14 = bitcast %"class.__gnu_cxx::__normal_iterator"* %corpus_last to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %13, i8* %14, i32 4, i32 4, i1 false)
  br label %return

return:                                           ; preds = %while.end17, %if.then
  ret void
}

define linkonce_odr void @_ZNK9__gnu_cxx17__normal_iteratorIPKcSsEmiERKi(%"class.__gnu_cxx::__normal_iterator"* noalias sret %agg.result, %"class.__gnu_cxx::__normal_iterator"* %this, i32* %__n) align 2 {
entry:
  %this.addr = alloca %"class.__gnu_cxx::__normal_iterator"*, align 4
  %__n.addr = alloca i32*, align 4
  %ref.tmp = alloca i8*, align 4
  store %"class.__gnu_cxx::__normal_iterator"* %this, %"class.__gnu_cxx::__normal_iterator"** %this.addr, align 4
  store i32* %__n, i32** %__n.addr, align 4
  %this1 = load %"class.__gnu_cxx::__normal_iterator"** %this.addr
  %_M_current = getelementptr inbounds %"class.__gnu_cxx::__normal_iterator"* %this1, i32 0, i32 0
  %0 = load i8** %_M_current, align 4
  %1 = load i32** %__n.addr, align 4
  %2 = load i32* %1, align 4
  %idx.neg = sub i32 0, %2
  %add.ptr = getelementptr inbounds i8* %0, i32 %idx.neg
  store i8* %add.ptr, i8** %ref.tmp, align 4
  call void @_ZN9__gnu_cxx17__normal_iteratorIPKcSsEC1ERKS2_(%"class.__gnu_cxx::__normal_iterator"* %agg.result, i8** %ref.tmp)
  ret void
}

define linkonce_odr zeroext i1 @_ZN9__gnu_cxxleIPKcSsEEbRKNS_17__normal_iteratorIT_T0_EES8_(%"class.__gnu_cxx::__normal_iterator"* %__lhs, %"class.__gnu_cxx::__normal_iterator"* %__rhs) nounwind inlinehint {
entry:
  %__lhs.addr = alloca %"class.__gnu_cxx::__normal_iterator"*, align 4
  %__rhs.addr = alloca %"class.__gnu_cxx::__normal_iterator"*, align 4
  store %"class.__gnu_cxx::__normal_iterator"* %__lhs, %"class.__gnu_cxx::__normal_iterator"** %__lhs.addr, align 4
  store %"class.__gnu_cxx::__normal_iterator"* %__rhs, %"class.__gnu_cxx::__normal_iterator"** %__rhs.addr, align 4
  %0 = load %"class.__gnu_cxx::__normal_iterator"** %__lhs.addr, align 4
  %call = call i8** @_ZNK9__gnu_cxx17__normal_iteratorIPKcSsE4baseEv(%"class.__gnu_cxx::__normal_iterator"* %0)
  %1 = load i8** %call
  %2 = load %"class.__gnu_cxx::__normal_iterator"** %__rhs.addr, align 4
  %call1 = call i8** @_ZNK9__gnu_cxx17__normal_iteratorIPKcSsE4baseEv(%"class.__gnu_cxx::__normal_iterator"* %2)
  %3 = load i8** %call1
  %cmp = icmp ule i8* %1, %3
  ret i1 %cmp
}

define linkonce_odr %"class.__gnu_cxx::__normal_iterator"* @_ZN9__gnu_cxx17__normal_iteratorIPKcSsEpLERKi(%"class.__gnu_cxx::__normal_iterator"* %this, i32* %__n) nounwind align 2 {
entry:
  %this.addr = alloca %"class.__gnu_cxx::__normal_iterator"*, align 4
  %__n.addr = alloca i32*, align 4
  store %"class.__gnu_cxx::__normal_iterator"* %this, %"class.__gnu_cxx::__normal_iterator"** %this.addr, align 4
  store i32* %__n, i32** %__n.addr, align 4
  %this1 = load %"class.__gnu_cxx::__normal_iterator"** %this.addr
  %0 = load i32** %__n.addr, align 4
  %1 = load i32* %0, align 4
  %_M_current = getelementptr inbounds %"class.__gnu_cxx::__normal_iterator"* %this1, i32 0, i32 0
  %2 = load i8** %_M_current, align 4
  %add.ptr = getelementptr inbounds i8* %2, i32 %1
  store i8* %add.ptr, i8** %_M_current, align 4
  ret %"class.__gnu_cxx::__normal_iterator"* %this1
}

define linkonce_odr i32 @_ZNK5boost9algorithm6detail10skip_tableIciLb1EEixEc(%"class.boost::algorithm::detail::skip_table"* %this, i8 signext %key) align 2 {
entry:
  %this.addr = alloca %"class.boost::algorithm::detail::skip_table"*, align 4
  %key.addr = alloca i8, align 1
  store %"class.boost::algorithm::detail::skip_table"* %this, %"class.boost::algorithm::detail::skip_table"** %this.addr, align 4
  store i8 %key, i8* %key.addr, align 1
  %this1 = load %"class.boost::algorithm::detail::skip_table"** %this.addr
  %skip_ = getelementptr inbounds %"class.boost::algorithm::detail::skip_table"* %this1, i32 0, i32 0
  %0 = load i8* %key.addr, align 1
  %conv = zext i8 %0 to i32
  %call = call i32* @_ZNK5boost5arrayIiLj256EEixEj(%"class.boost::array"* %skip_, i32 %conv)
  %1 = load i32* %call
  ret i32 %1
}

define linkonce_odr i32* @_ZNK5boost5arrayIiLj256EEixEj(%"class.boost::array"* %this, i32 %i) align 2 {
entry:
  %this.addr = alloca %"class.boost::array"*, align 4
  %i.addr = alloca i32, align 4
  store %"class.boost::array"* %this, %"class.boost::array"** %this.addr, align 4
  store i32 %i, i32* %i.addr, align 4
  %this1 = load %"class.boost::array"** %this.addr
  %0 = load i32* %i.addr, align 4
  %cmp = icmp ult i32 %0, 256
  br i1 %cmp, label %cond.true, label %cond.false

cond.true:                                        ; preds = %entry
  br label %cond.end

cond.false:                                       ; preds = %entry
  call void @_ZN5boost9assertion6detail20assertion_failed_msgEPKcS3_S3_S3_l(i8* getelementptr inbounds ([6 x i8]* @.str13, i32 0, i32 0), i8* getelementptr inbounds ([13 x i8]* @.str14, i32 0, i32 0), i8* getelementptr inbounds ([87 x i8]* @__PRETTY_FUNCTION__._ZNK5boost5arrayIiLj256EEixEj, i32 0, i32 0), i8* getelementptr inbounds ([42 x i8]* @.str15, i32 0, i32 0), i32 129)
  br label %cond.end

cond.end:                                         ; preds = %cond.false, %cond.true
  %1 = load i32* %i.addr, align 4
  %elems = getelementptr inbounds %"class.boost::array"* %this1, i32 0, i32 0
  %arrayidx = getelementptr inbounds [256 x i32]* %elems, i32 0, i32 %1
  ret i32* %arrayidx
}

define linkonce_odr void @_ZN5boost9assertion6detail20assertion_failed_msgEPKcS3_S3_S3_l(i8* %expr, i8* %msg, i8* %function, i8* %file, i32 %line) inlinehint {
entry:
  %expr.addr = alloca i8*, align 4
  %msg.addr = alloca i8*, align 4
  %function.addr = alloca i8*, align 4
  %file.addr = alloca i8*, align 4
  %line.addr = alloca i32, align 4
  store i8* %expr, i8** %expr.addr, align 4
  store i8* %msg, i8** %msg.addr, align 4
  store i8* %function, i8** %function.addr, align 4
  store i8* %file, i8** %file.addr, align 4
  store i32 %line, i32* %line.addr, align 4
  %call = call %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* @_ZSt4cerr, i8* getelementptr inbounds ([43 x i8]* @.str16, i32 0, i32 0))
  %0 = load i8** %expr.addr, align 4
  %call1 = call %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* %call, i8* %0)
  %call2 = call %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* %call1, i8* getelementptr inbounds ([13 x i8]* @.str17, i32 0, i32 0))
  %1 = load i8** %function.addr, align 4
  %call3 = call %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* %call2, i8* %1)
  %call4 = call %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* %call3, i8* getelementptr inbounds ([3 x i8]* @.str18, i32 0, i32 0))
  %2 = load i8** %file.addr, align 4
  %call5 = call %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* %call4, i8* %2)
  %call6 = call %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_c(%"class.std::basic_ostream"* %call5, i8 signext 40)
  %3 = load i32* %line.addr, align 4
  %call7 = call %"class.std::basic_ostream"* @_ZNSolsEl(%"class.std::basic_ostream"* %call6, i32 %3)
  %call8 = call %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* %call7, i8* getelementptr inbounds ([4 x i8]* @.str19, i32 0, i32 0))
  %4 = load i8** %msg.addr, align 4
  %call9 = call %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* %call8, i8* %4)
  %call10 = call %"class.std::basic_ostream"* @_ZNSolsEPFRSoS_E(%"class.std::basic_ostream"* %call9, %"class.std::basic_ostream"* (%"class.std::basic_ostream"*)* @_ZSt4endlIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_)
  call void @abort() noreturn nounwind
  unreachable

return:                                           ; No predecessors!
  ret void
}

declare %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_c(%"class.std::basic_ostream"*, i8 signext)

declare %"class.std::basic_ostream"* @_ZNSolsEl(%"class.std::basic_ostream"*, i32)

declare void @abort() noreturn nounwind

define linkonce_odr void @_ZN5boost9algorithm20boyer_moore_horspoolIN9__gnu_cxx17__normal_iteratorIPKcSsEENS0_6detail9BM_traitsIS6_EEEC2ES6_S6_(%"class.boost::algorithm::boyer_moore_horspool"* %this, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %first, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %last) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::algorithm::boyer_moore_horspool"*, align 4
  %agg.tmp = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %agg.tmp3 = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %i = alloca i32, align 4
  %iter = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %ref.tmp = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %ref.tmp8 = alloca i32, align 4
  store %"class.boost::algorithm::boyer_moore_horspool"* %this, %"class.boost::algorithm::boyer_moore_horspool"** %this.addr, align 4
  %this1 = load %"class.boost::algorithm::boyer_moore_horspool"** %this.addr
  %pat_first = getelementptr inbounds %"class.boost::algorithm::boyer_moore_horspool"* %this1, i32 0, i32 0
  %0 = bitcast %"class.__gnu_cxx::__normal_iterator"* %pat_first to i8*
  %1 = bitcast %"class.__gnu_cxx::__normal_iterator"* %first to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %0, i8* %1, i32 4, i32 4, i1 false)
  %pat_last = getelementptr inbounds %"class.boost::algorithm::boyer_moore_horspool"* %this1, i32 0, i32 1
  %2 = bitcast %"class.__gnu_cxx::__normal_iterator"* %pat_last to i8*
  %3 = bitcast %"class.__gnu_cxx::__normal_iterator"* %last to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %2, i8* %3, i32 4, i32 4, i1 false)
  %k_pattern_length = getelementptr inbounds %"class.boost::algorithm::boyer_moore_horspool"* %this1, i32 0, i32 2
  %pat_first2 = getelementptr inbounds %"class.boost::algorithm::boyer_moore_horspool"* %this1, i32 0, i32 0
  %4 = bitcast %"class.__gnu_cxx::__normal_iterator"* %agg.tmp to i8*
  %5 = bitcast %"class.__gnu_cxx::__normal_iterator"* %pat_first2 to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %4, i8* %5, i32 4, i32 4, i1 false)
  %pat_last4 = getelementptr inbounds %"class.boost::algorithm::boyer_moore_horspool"* %this1, i32 0, i32 1
  %6 = bitcast %"class.__gnu_cxx::__normal_iterator"* %agg.tmp3 to i8*
  %7 = bitcast %"class.__gnu_cxx::__normal_iterator"* %pat_last4 to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %6, i8* %7, i32 4, i32 4, i1 false)
  %call = call i32 @_ZSt8distanceIN9__gnu_cxx17__normal_iteratorIPKcSsEEENSt15iterator_traitsIT_E15difference_typeES6_S6_(%"class.__gnu_cxx::__normal_iterator"* byval align 4 %agg.tmp, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %agg.tmp3)
  store i32 %call, i32* %k_pattern_length, align 4
  %skip_ = getelementptr inbounds %"class.boost::algorithm::boyer_moore_horspool"* %this1, i32 0, i32 3
  %k_pattern_length5 = getelementptr inbounds %"class.boost::algorithm::boyer_moore_horspool"* %this1, i32 0, i32 2
  %8 = load i32* %k_pattern_length5, align 4
  %k_pattern_length6 = getelementptr inbounds %"class.boost::algorithm::boyer_moore_horspool"* %this1, i32 0, i32 2
  %9 = load i32* %k_pattern_length6, align 4
  call void @_ZN5boost9algorithm6detail10skip_tableIciLb1EEC1Eji(%"class.boost::algorithm::detail::skip_table"* %skip_, i32 %8, i32 %9)
  store i32 0, i32* %i, align 4
  %call7 = call zeroext i1 @_ZN9__gnu_cxxneIPKcSsEEbRKNS_17__normal_iteratorIT_T0_EES8_(%"class.__gnu_cxx::__normal_iterator"* %first, %"class.__gnu_cxx::__normal_iterator"* %last)
  br i1 %call7, label %if.then, label %if.end

if.then:                                          ; preds = %entry
  %10 = bitcast %"class.__gnu_cxx::__normal_iterator"* %iter to i8*
  %11 = bitcast %"class.__gnu_cxx::__normal_iterator"* %first to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %10, i8* %11, i32 4, i32 4, i1 false)
  br label %for.cond

for.cond:                                         ; preds = %for.inc, %if.then
  store i32 1, i32* %ref.tmp8, align 4
  call void @_ZNK9__gnu_cxx17__normal_iteratorIPKcSsEmiERKi(%"class.__gnu_cxx::__normal_iterator"* sret %ref.tmp, %"class.__gnu_cxx::__normal_iterator"* %last, i32* %ref.tmp8)
  %call9 = call zeroext i1 @_ZN9__gnu_cxxneIPKcSsEEbRKNS_17__normal_iteratorIT_T0_EES8_(%"class.__gnu_cxx::__normal_iterator"* %iter, %"class.__gnu_cxx::__normal_iterator"* %ref.tmp)
  br i1 %call9, label %for.body, label %for.end

for.body:                                         ; preds = %for.cond
  %skip_10 = getelementptr inbounds %"class.boost::algorithm::boyer_moore_horspool"* %this1, i32 0, i32 3
  %call11 = call i8* @_ZNK9__gnu_cxx17__normal_iteratorIPKcSsEdeEv(%"class.__gnu_cxx::__normal_iterator"* %iter)
  %12 = load i8* %call11
  %k_pattern_length12 = getelementptr inbounds %"class.boost::algorithm::boyer_moore_horspool"* %this1, i32 0, i32 2
  %13 = load i32* %k_pattern_length12, align 4
  %sub = sub nsw i32 %13, 1
  %14 = load i32* %i, align 4
  %sub13 = sub i32 %sub, %14
  call void @_ZN5boost9algorithm6detail10skip_tableIciLb1EE6insertEci(%"class.boost::algorithm::detail::skip_table"* %skip_10, i8 signext %12, i32 %sub13)
  br label %for.inc

for.inc:                                          ; preds = %for.body
  %call14 = call %"class.__gnu_cxx::__normal_iterator"* @_ZN9__gnu_cxx17__normal_iteratorIPKcSsEppEv(%"class.__gnu_cxx::__normal_iterator"* %iter)
  %15 = load i32* %i, align 4
  %inc = add i32 %15, 1
  store i32 %inc, i32* %i, align 4
  br label %for.cond

for.end:                                          ; preds = %for.cond
  br label %if.end

if.end:                                           ; preds = %for.end, %entry
  ret void
}

define linkonce_odr void @_ZN5boost9algorithm6detail10skip_tableIciLb1EEC1Eji(%"class.boost::algorithm::detail::skip_table"* %this, i32 %patSize, i32 %default_value) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::algorithm::detail::skip_table"*, align 4
  %patSize.addr = alloca i32, align 4
  %default_value.addr = alloca i32, align 4
  store %"class.boost::algorithm::detail::skip_table"* %this, %"class.boost::algorithm::detail::skip_table"** %this.addr, align 4
  store i32 %patSize, i32* %patSize.addr, align 4
  store i32 %default_value, i32* %default_value.addr, align 4
  %this1 = load %"class.boost::algorithm::detail::skip_table"** %this.addr
  %0 = load i32* %patSize.addr, align 4
  %1 = load i32* %default_value.addr, align 4
  call void @_ZN5boost9algorithm6detail10skip_tableIciLb1EEC2Eji(%"class.boost::algorithm::detail::skip_table"* %this1, i32 %0, i32 %1)
  ret void
}

define linkonce_odr void @_ZN5boost9algorithm6detail10skip_tableIciLb1EE6insertEci(%"class.boost::algorithm::detail::skip_table"* %this, i8 signext %key, i32 %val) align 2 {
entry:
  %this.addr = alloca %"class.boost::algorithm::detail::skip_table"*, align 4
  %key.addr = alloca i8, align 1
  %val.addr = alloca i32, align 4
  store %"class.boost::algorithm::detail::skip_table"* %this, %"class.boost::algorithm::detail::skip_table"** %this.addr, align 4
  store i8 %key, i8* %key.addr, align 1
  store i32 %val, i32* %val.addr, align 4
  %this1 = load %"class.boost::algorithm::detail::skip_table"** %this.addr
  %0 = load i32* %val.addr, align 4
  %skip_ = getelementptr inbounds %"class.boost::algorithm::detail::skip_table"* %this1, i32 0, i32 0
  %1 = load i8* %key.addr, align 1
  %conv = zext i8 %1 to i32
  %call = call i32* @_ZN5boost5arrayIiLj256EEixEj(%"class.boost::array"* %skip_, i32 %conv)
  store i32 %0, i32* %call
  ret void
}

define linkonce_odr i8* @_ZNK9__gnu_cxx17__normal_iteratorIPKcSsEdeEv(%"class.__gnu_cxx::__normal_iterator"* %this) nounwind align 2 {
entry:
  %this.addr = alloca %"class.__gnu_cxx::__normal_iterator"*, align 4
  store %"class.__gnu_cxx::__normal_iterator"* %this, %"class.__gnu_cxx::__normal_iterator"** %this.addr, align 4
  %this1 = load %"class.__gnu_cxx::__normal_iterator"** %this.addr
  %_M_current = getelementptr inbounds %"class.__gnu_cxx::__normal_iterator"* %this1, i32 0, i32 0
  %0 = load i8** %_M_current, align 4
  ret i8* %0
}

define linkonce_odr %"class.__gnu_cxx::__normal_iterator"* @_ZN9__gnu_cxx17__normal_iteratorIPKcSsEppEv(%"class.__gnu_cxx::__normal_iterator"* %this) nounwind align 2 {
entry:
  %this.addr = alloca %"class.__gnu_cxx::__normal_iterator"*, align 4
  store %"class.__gnu_cxx::__normal_iterator"* %this, %"class.__gnu_cxx::__normal_iterator"** %this.addr, align 4
  %this1 = load %"class.__gnu_cxx::__normal_iterator"** %this.addr
  %_M_current = getelementptr inbounds %"class.__gnu_cxx::__normal_iterator"* %this1, i32 0, i32 0
  %0 = load i8** %_M_current, align 4
  %incdec.ptr = getelementptr inbounds i8* %0, i32 1
  store i8* %incdec.ptr, i8** %_M_current, align 4
  ret %"class.__gnu_cxx::__normal_iterator"* %this1
}

define linkonce_odr i32* @_ZN5boost5arrayIiLj256EEixEj(%"class.boost::array"* %this, i32 %i) align 2 {
entry:
  %this.addr = alloca %"class.boost::array"*, align 4
  %i.addr = alloca i32, align 4
  store %"class.boost::array"* %this, %"class.boost::array"** %this.addr, align 4
  store i32 %i, i32* %i.addr, align 4
  %this1 = load %"class.boost::array"** %this.addr
  %0 = load i32* %i.addr, align 4
  %cmp = icmp ult i32 %0, 256
  br i1 %cmp, label %cond.true, label %cond.false

cond.true:                                        ; preds = %entry
  br label %cond.end

cond.false:                                       ; preds = %entry
  call void @_ZN5boost9assertion6detail20assertion_failed_msgEPKcS3_S3_S3_l(i8* getelementptr inbounds ([6 x i8]* @.str13, i32 0, i32 0), i8* getelementptr inbounds ([13 x i8]* @.str14, i32 0, i32 0), i8* getelementptr inbounds ([75 x i8]* @__PRETTY_FUNCTION__._ZN5boost5arrayIiLj256EEixEj, i32 0, i32 0), i8* getelementptr inbounds ([42 x i8]* @.str15, i32 0, i32 0), i32 123)
  br label %cond.end

cond.end:                                         ; preds = %cond.false, %cond.true
  %1 = load i32* %i.addr, align 4
  %elems = getelementptr inbounds %"class.boost::array"* %this1, i32 0, i32 0
  %arrayidx = getelementptr inbounds [256 x i32]* %elems, i32 0, i32 %1
  ret i32* %arrayidx
}

define linkonce_odr void @_ZN5boost9algorithm6detail10skip_tableIciLb1EEC2Eji(%"class.boost::algorithm::detail::skip_table"* %this, i32 %patSize, i32 %default_value) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::algorithm::detail::skip_table"*, align 4
  %patSize.addr = alloca i32, align 4
  %default_value.addr = alloca i32, align 4
  store %"class.boost::algorithm::detail::skip_table"* %this, %"class.boost::algorithm::detail::skip_table"** %this.addr, align 4
  store i32 %patSize, i32* %patSize.addr, align 4
  store i32 %default_value, i32* %default_value.addr, align 4
  %this1 = load %"class.boost::algorithm::detail::skip_table"** %this.addr
  %skip_ = getelementptr inbounds %"class.boost::algorithm::detail::skip_table"* %this1, i32 0, i32 0
  %k_default_value = getelementptr inbounds %"class.boost::algorithm::detail::skip_table"* %this1, i32 0, i32 1
  %0 = load i32* %default_value.addr, align 4
  store i32 %0, i32* %k_default_value, align 4
  %skip_2 = getelementptr inbounds %"class.boost::algorithm::detail::skip_table"* %this1, i32 0, i32 0
  %call = call i32* @_ZN5boost5arrayIiLj256EE5beginEv(%"class.boost::array"* %skip_2)
  %skip_3 = getelementptr inbounds %"class.boost::algorithm::detail::skip_table"* %this1, i32 0, i32 0
  %call4 = call i32 @_ZN5boost5arrayIiLj256EE4sizeEv()
  %call5 = call i32* @_ZSt6fill_nIPijiET_S1_T0_RKT1_(i32* %call, i32 %call4, i32* %default_value.addr)
  ret void
}

define linkonce_odr i32* @_ZN5boost5arrayIiLj256EE5beginEv(%"class.boost::array"* %this) nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::array"*, align 4
  store %"class.boost::array"* %this, %"class.boost::array"** %this.addr, align 4
  %this1 = load %"class.boost::array"** %this.addr
  %elems = getelementptr inbounds %"class.boost::array"* %this1, i32 0, i32 0
  %arraydecay = getelementptr inbounds [256 x i32]* %elems, i32 0, i32 0
  ret i32* %arraydecay
}

define linkonce_odr i32 @_ZN5boost5arrayIiLj256EE4sizeEv() nounwind align 2 {
entry:
  ret i32 256
}

define linkonce_odr void @_ZNK5boost9algorithm11boyer_mooreIN9__gnu_cxx17__normal_iteratorIPKcSsEENS0_6detail9BM_traitsIS6_EEE9do_searchIS6_EET_SC_SC_(%"class.__gnu_cxx::__normal_iterator"* noalias sret %agg.result, %"class.boost::algorithm::boyer_moore"* %this, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %corpus_first, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %corpus_last) align 2 {
entry:
  %this.addr = alloca %"class.boost::algorithm::boyer_moore"*, align 4
  %curPos = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %lastPos = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %j = alloca i32, align 4
  %k = alloca i32, align 4
  %m = alloca i32, align 4
  %ref.tmp = alloca i32, align 4
  %ref.tmp6 = alloca i32, align 4
  %ref.tmp12 = alloca i32, align 4
  store %"class.boost::algorithm::boyer_moore"* %this, %"class.boost::algorithm::boyer_moore"** %this.addr, align 4
  %this1 = load %"class.boost::algorithm::boyer_moore"** %this.addr
  %0 = bitcast %"class.__gnu_cxx::__normal_iterator"* %curPos to i8*
  %1 = bitcast %"class.__gnu_cxx::__normal_iterator"* %corpus_first to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %0, i8* %1, i32 4, i32 4, i1 false)
  %k_pattern_length = getelementptr inbounds %"class.boost::algorithm::boyer_moore"* %this1, i32 0, i32 2
  call void @_ZNK9__gnu_cxx17__normal_iteratorIPKcSsEmiERKi(%"class.__gnu_cxx::__normal_iterator"* sret %lastPos, %"class.__gnu_cxx::__normal_iterator"* %corpus_last, i32* %k_pattern_length)
  br label %while.cond

while.cond:                                       ; preds = %if.end25, %entry
  %call = call zeroext i1 @_ZN9__gnu_cxxleIPKcSsEEbRKNS_17__normal_iteratorIT_T0_EES8_(%"class.__gnu_cxx::__normal_iterator"* %curPos, %"class.__gnu_cxx::__normal_iterator"* %lastPos)
  br i1 %call, label %while.body, label %while.end26

while.body:                                       ; preds = %while.cond
  %k_pattern_length2 = getelementptr inbounds %"class.boost::algorithm::boyer_moore"* %this1, i32 0, i32 2
  %2 = load i32* %k_pattern_length2, align 4
  store i32 %2, i32* %j, align 4
  br label %while.cond3

while.cond3:                                      ; preds = %if.end, %while.body
  %pat_first = getelementptr inbounds %"class.boost::algorithm::boyer_moore"* %this1, i32 0, i32 0
  %3 = load i32* %j, align 4
  %sub = sub nsw i32 %3, 1
  store i32 %sub, i32* %ref.tmp, align 4
  %call4 = call i8* @_ZNK9__gnu_cxx17__normal_iteratorIPKcSsEixERKi(%"class.__gnu_cxx::__normal_iterator"* %pat_first, i32* %ref.tmp)
  %4 = load i8* %call4
  %conv = sext i8 %4 to i32
  %5 = load i32* %j, align 4
  %sub5 = sub nsw i32 %5, 1
  store i32 %sub5, i32* %ref.tmp6, align 4
  %call7 = call i8* @_ZNK9__gnu_cxx17__normal_iteratorIPKcSsEixERKi(%"class.__gnu_cxx::__normal_iterator"* %curPos, i32* %ref.tmp6)
  %6 = load i8* %call7
  %conv8 = sext i8 %6 to i32
  %cmp = icmp eq i32 %conv, %conv8
  br i1 %cmp, label %while.body9, label %while.end

while.body9:                                      ; preds = %while.cond3
  %7 = load i32* %j, align 4
  %dec = add nsw i32 %7, -1
  store i32 %dec, i32* %j, align 4
  %8 = load i32* %j, align 4
  %cmp10 = icmp eq i32 %8, 0
  br i1 %cmp10, label %if.then, label %if.end

if.then:                                          ; preds = %while.body9
  %9 = bitcast %"class.__gnu_cxx::__normal_iterator"* %agg.result to i8*
  %10 = bitcast %"class.__gnu_cxx::__normal_iterator"* %curPos to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %9, i8* %10, i32 4, i32 4, i1 false)
  br label %return

if.end:                                           ; preds = %while.body9
  br label %while.cond3

while.end:                                        ; preds = %while.cond3
  %skip_ = getelementptr inbounds %"class.boost::algorithm::boyer_moore"* %this1, i32 0, i32 3
  %11 = load i32* %j, align 4
  %sub11 = sub nsw i32 %11, 1
  store i32 %sub11, i32* %ref.tmp12, align 4
  %call13 = call i8* @_ZNK9__gnu_cxx17__normal_iteratorIPKcSsEixERKi(%"class.__gnu_cxx::__normal_iterator"* %curPos, i32* %ref.tmp12)
  %12 = load i8* %call13
  %call14 = call i32 @_ZNK5boost9algorithm6detail10skip_tableIciLb1EEixEc(%"class.boost::algorithm::detail::skip_table"* %skip_, i8 signext %12)
  store i32 %call14, i32* %k, align 4
  %13 = load i32* %j, align 4
  %14 = load i32* %k, align 4
  %sub15 = sub nsw i32 %13, %14
  %sub16 = sub nsw i32 %sub15, 1
  store i32 %sub16, i32* %m, align 4
  %15 = load i32* %k, align 4
  %16 = load i32* %j, align 4
  %cmp17 = icmp slt i32 %15, %16
  br i1 %cmp17, label %land.lhs.true, label %if.else

land.lhs.true:                                    ; preds = %while.end
  %17 = load i32* %m, align 4
  %suffix_ = getelementptr inbounds %"class.boost::algorithm::boyer_moore"* %this1, i32 0, i32 4
  %18 = load i32* %j, align 4
  %call18 = call i32* @_ZNKSt6vectorIiSaIiEEixEj(%"class.std::vector"* %suffix_, i32 %18)
  %19 = load i32* %call18
  %cmp19 = icmp sgt i32 %17, %19
  br i1 %cmp19, label %if.then20, label %if.else

if.then20:                                        ; preds = %land.lhs.true
  %call21 = call %"class.__gnu_cxx::__normal_iterator"* @_ZN9__gnu_cxx17__normal_iteratorIPKcSsEpLERKi(%"class.__gnu_cxx::__normal_iterator"* %curPos, i32* %m)
  br label %if.end25

if.else:                                          ; preds = %land.lhs.true, %while.end
  %suffix_22 = getelementptr inbounds %"class.boost::algorithm::boyer_moore"* %this1, i32 0, i32 4
  %20 = load i32* %j, align 4
  %call23 = call i32* @_ZNKSt6vectorIiSaIiEEixEj(%"class.std::vector"* %suffix_22, i32 %20)
  %call24 = call %"class.__gnu_cxx::__normal_iterator"* @_ZN9__gnu_cxx17__normal_iteratorIPKcSsEpLERKi(%"class.__gnu_cxx::__normal_iterator"* %curPos, i32* %call23)
  br label %if.end25

if.end25:                                         ; preds = %if.else, %if.then20
  br label %while.cond

while.end26:                                      ; preds = %while.cond
  %21 = bitcast %"class.__gnu_cxx::__normal_iterator"* %agg.result to i8*
  %22 = bitcast %"class.__gnu_cxx::__normal_iterator"* %corpus_last to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %21, i8* %22, i32 4, i32 4, i1 false)
  br label %return

return:                                           ; preds = %while.end26, %if.then
  ret void
}

define linkonce_odr void @_ZN5boost9algorithm11boyer_mooreIN9__gnu_cxx17__normal_iteratorIPKcSsEENS0_6detail9BM_traitsIS6_EEED2Ev(%"class.boost::algorithm::boyer_moore"* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::algorithm::boyer_moore"*, align 4
  store %"class.boost::algorithm::boyer_moore"* %this, %"class.boost::algorithm::boyer_moore"** %this.addr, align 4
  %this1 = load %"class.boost::algorithm::boyer_moore"** %this.addr
  %suffix_ = getelementptr inbounds %"class.boost::algorithm::boyer_moore"* %this1, i32 0, i32 4
  call void @_ZNSt6vectorIiSaIiEED1Ev(%"class.std::vector"* %suffix_)
  ret void
}

define linkonce_odr void @_ZN5boost9algorithm11boyer_mooreIN9__gnu_cxx17__normal_iteratorIPKcSsEENS0_6detail9BM_traitsIS6_EEEC2ES6_S6_(%"class.boost::algorithm::boyer_moore"* %this, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %first, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %last) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::algorithm::boyer_moore"*, align 4
  %agg.tmp = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %agg.tmp3 = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %ref.tmp = alloca i32, align 4
  %ref.tmp7 = alloca %"class.std::allocator.0", align 1
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  %agg.tmp8 = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %agg.tmp9 = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %agg.tmp12 = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %agg.tmp13 = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  store %"class.boost::algorithm::boyer_moore"* %this, %"class.boost::algorithm::boyer_moore"** %this.addr, align 4
  %this1 = load %"class.boost::algorithm::boyer_moore"** %this.addr
  %pat_first = getelementptr inbounds %"class.boost::algorithm::boyer_moore"* %this1, i32 0, i32 0
  %0 = bitcast %"class.__gnu_cxx::__normal_iterator"* %pat_first to i8*
  %1 = bitcast %"class.__gnu_cxx::__normal_iterator"* %first to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %0, i8* %1, i32 4, i32 4, i1 false)
  %pat_last = getelementptr inbounds %"class.boost::algorithm::boyer_moore"* %this1, i32 0, i32 1
  %2 = bitcast %"class.__gnu_cxx::__normal_iterator"* %pat_last to i8*
  %3 = bitcast %"class.__gnu_cxx::__normal_iterator"* %last to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %2, i8* %3, i32 4, i32 4, i1 false)
  %k_pattern_length = getelementptr inbounds %"class.boost::algorithm::boyer_moore"* %this1, i32 0, i32 2
  %pat_first2 = getelementptr inbounds %"class.boost::algorithm::boyer_moore"* %this1, i32 0, i32 0
  %4 = bitcast %"class.__gnu_cxx::__normal_iterator"* %agg.tmp to i8*
  %5 = bitcast %"class.__gnu_cxx::__normal_iterator"* %pat_first2 to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %4, i8* %5, i32 4, i32 4, i1 false)
  %pat_last4 = getelementptr inbounds %"class.boost::algorithm::boyer_moore"* %this1, i32 0, i32 1
  %6 = bitcast %"class.__gnu_cxx::__normal_iterator"* %agg.tmp3 to i8*
  %7 = bitcast %"class.__gnu_cxx::__normal_iterator"* %pat_last4 to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %6, i8* %7, i32 4, i32 4, i1 false)
  %call = call i32 @_ZSt8distanceIN9__gnu_cxx17__normal_iteratorIPKcSsEEENSt15iterator_traitsIT_E15difference_typeES6_S6_(%"class.__gnu_cxx::__normal_iterator"* byval align 4 %agg.tmp, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %agg.tmp3)
  store i32 %call, i32* %k_pattern_length, align 4
  %skip_ = getelementptr inbounds %"class.boost::algorithm::boyer_moore"* %this1, i32 0, i32 3
  %k_pattern_length5 = getelementptr inbounds %"class.boost::algorithm::boyer_moore"* %this1, i32 0, i32 2
  %8 = load i32* %k_pattern_length5, align 4
  call void @_ZN5boost9algorithm6detail10skip_tableIciLb1EEC1Eji(%"class.boost::algorithm::detail::skip_table"* %skip_, i32 %8, i32 -1)
  %suffix_ = getelementptr inbounds %"class.boost::algorithm::boyer_moore"* %this1, i32 0, i32 4
  %k_pattern_length6 = getelementptr inbounds %"class.boost::algorithm::boyer_moore"* %this1, i32 0, i32 2
  %9 = load i32* %k_pattern_length6, align 4
  %add = add nsw i32 %9, 1
  store i32 0, i32* %ref.tmp, align 4
  call void @_ZNSaIiEC1Ev(%"class.std::allocator.0"* %ref.tmp7) nounwind
  invoke void @_ZNSt6vectorIiSaIiEEC1EjRKiRKS0_(%"class.std::vector"* %suffix_, i32 %add, i32* %ref.tmp, %"class.std::allocator.0"* %ref.tmp7)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %entry
  call void @_ZNSaIiED1Ev(%"class.std::allocator.0"* %ref.tmp7) nounwind
  %10 = bitcast %"class.__gnu_cxx::__normal_iterator"* %agg.tmp8 to i8*
  %11 = bitcast %"class.__gnu_cxx::__normal_iterator"* %first to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %10, i8* %11, i32 4, i32 4, i1 false)
  %12 = bitcast %"class.__gnu_cxx::__normal_iterator"* %agg.tmp9 to i8*
  %13 = bitcast %"class.__gnu_cxx::__normal_iterator"* %last to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %12, i8* %13, i32 4, i32 4, i1 false)
  invoke void @_ZN5boost9algorithm11boyer_mooreIN9__gnu_cxx17__normal_iteratorIPKcSsEENS0_6detail9BM_traitsIS6_EEE16build_skip_tableES6_S6_(%"class.boost::algorithm::boyer_moore"* %this1, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %agg.tmp8, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %agg.tmp9)
          to label %invoke.cont11 unwind label %lpad10

invoke.cont11:                                    ; preds = %invoke.cont
  %14 = bitcast %"class.__gnu_cxx::__normal_iterator"* %agg.tmp12 to i8*
  %15 = bitcast %"class.__gnu_cxx::__normal_iterator"* %first to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %14, i8* %15, i32 4, i32 4, i1 false)
  %16 = bitcast %"class.__gnu_cxx::__normal_iterator"* %agg.tmp13 to i8*
  %17 = bitcast %"class.__gnu_cxx::__normal_iterator"* %last to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %16, i8* %17, i32 4, i32 4, i1 false)
  invoke void @_ZN5boost9algorithm11boyer_mooreIN9__gnu_cxx17__normal_iteratorIPKcSsEENS0_6detail9BM_traitsIS6_EEE18build_suffix_tableES6_S6_(%"class.boost::algorithm::boyer_moore"* %this1, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %agg.tmp12, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %agg.tmp13)
          to label %invoke.cont14 unwind label %lpad10

invoke.cont14:                                    ; preds = %invoke.cont11
  ret void

lpad:                                             ; preds = %entry
  %18 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %19 = extractvalue { i8*, i32 } %18, 0
  store i8* %19, i8** %exn.slot
  %20 = extractvalue { i8*, i32 } %18, 1
  store i32 %20, i32* %ehselector.slot
  call void @_ZNSaIiED1Ev(%"class.std::allocator.0"* %ref.tmp7) nounwind
  br label %eh.resume

lpad10:                                           ; preds = %invoke.cont11, %invoke.cont
  %21 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %22 = extractvalue { i8*, i32 } %21, 0
  store i8* %22, i8** %exn.slot
  %23 = extractvalue { i8*, i32 } %21, 1
  store i32 %23, i32* %ehselector.slot
  invoke void @_ZNSt6vectorIiSaIiEED1Ev(%"class.std::vector"* %suffix_)
          to label %invoke.cont15 unwind label %terminate.lpad

invoke.cont15:                                    ; preds = %lpad10
  br label %eh.resume

eh.resume:                                        ; preds = %invoke.cont15, %lpad
  %exn = load i8** %exn.slot
  %sel = load i32* %ehselector.slot
  %lpad.val = insertvalue { i8*, i32 } undef, i8* %exn, 0
  %lpad.val16 = insertvalue { i8*, i32 } %lpad.val, i32 %sel, 1
  resume { i8*, i32 } %lpad.val16

terminate.lpad:                                   ; preds = %lpad10
  %24 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          catch i8* null
  call void @_ZSt9terminatev() noreturn nounwind
  unreachable
}

define linkonce_odr void @_ZN5boost9algorithm11boyer_mooreIN9__gnu_cxx17__normal_iteratorIPKcSsEENS0_6detail9BM_traitsIS6_EEE16build_skip_tableES6_S6_(%"class.boost::algorithm::boyer_moore"* %this, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %first, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %last) align 2 {
entry:
  %this.addr = alloca %"class.boost::algorithm::boyer_moore"*, align 4
  %i = alloca i32, align 4
  store %"class.boost::algorithm::boyer_moore"* %this, %"class.boost::algorithm::boyer_moore"** %this.addr, align 4
  %this1 = load %"class.boost::algorithm::boyer_moore"** %this.addr
  store i32 0, i32* %i, align 4
  br label %for.cond

for.cond:                                         ; preds = %for.inc, %entry
  %call = call zeroext i1 @_ZN9__gnu_cxxneIPKcSsEEbRKNS_17__normal_iteratorIT_T0_EES8_(%"class.__gnu_cxx::__normal_iterator"* %first, %"class.__gnu_cxx::__normal_iterator"* %last)
  br i1 %call, label %for.body, label %for.end

for.body:                                         ; preds = %for.cond
  %skip_ = getelementptr inbounds %"class.boost::algorithm::boyer_moore"* %this1, i32 0, i32 3
  %call2 = call i8* @_ZNK9__gnu_cxx17__normal_iteratorIPKcSsEdeEv(%"class.__gnu_cxx::__normal_iterator"* %first)
  %0 = load i8* %call2
  %1 = load i32* %i, align 4
  call void @_ZN5boost9algorithm6detail10skip_tableIciLb1EE6insertEci(%"class.boost::algorithm::detail::skip_table"* %skip_, i8 signext %0, i32 %1)
  br label %for.inc

for.inc:                                          ; preds = %for.body
  %call3 = call %"class.__gnu_cxx::__normal_iterator"* @_ZN9__gnu_cxx17__normal_iteratorIPKcSsEppEv(%"class.__gnu_cxx::__normal_iterator"* %first)
  %2 = load i32* %i, align 4
  %inc = add i32 %2, 1
  store i32 %inc, i32* %i, align 4
  br label %for.cond

for.end:                                          ; preds = %for.cond
  ret void
}

define linkonce_odr void @_ZN5boost9algorithm11boyer_mooreIN9__gnu_cxx17__normal_iteratorIPKcSsEENS0_6detail9BM_traitsIS6_EEE18build_suffix_tableES6_S6_(%"class.boost::algorithm::boyer_moore"* %this, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %pat_first, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %pat_last) align 2 {
entry:
  %this.addr = alloca %"class.boost::algorithm::boyer_moore"*, align 4
  %count = alloca i32, align 4
  %agg.tmp = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %agg.tmp2 = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %reversed = alloca %"class.std::vector.3", align 4
  %ref.tmp = alloca i8, align 1
  %ref.tmp3 = alloca %"class.std::allocator", align 1
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  %agg.tmp4 = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %agg.tmp5 = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %agg.tmp6 = alloca %"class.__gnu_cxx::__normal_iterator.5", align 4
  %tmp = alloca %"class.__gnu_cxx::__normal_iterator.5", align 4
  %prefix = alloca %"class.std::vector", align 4
  %ref.tmp11 = alloca i32, align 4
  %ref.tmp12 = alloca %"class.std::allocator.0", align 1
  %agg.tmp15 = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %agg.tmp16 = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %prefix_reversed = alloca %"class.std::vector", align 4
  %ref.tmp20 = alloca i32, align 4
  %ref.tmp21 = alloca %"class.std::allocator.0", align 1
  %agg.tmp24 = alloca %"class.__gnu_cxx::__normal_iterator.5", align 4
  %agg.tmp27 = alloca %"class.__gnu_cxx::__normal_iterator.5", align 4
  %i = alloca i32, align 4
  %i38 = alloca i32, align 4
  %j = alloca i32, align 4
  %k = alloca i32, align 4
  store %"class.boost::algorithm::boyer_moore"* %this, %"class.boost::algorithm::boyer_moore"** %this.addr, align 4
  %this1 = load %"class.boost::algorithm::boyer_moore"** %this.addr
  %0 = bitcast %"class.__gnu_cxx::__normal_iterator"* %agg.tmp to i8*
  %1 = bitcast %"class.__gnu_cxx::__normal_iterator"* %pat_first to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %0, i8* %1, i32 4, i32 4, i1 false)
  %2 = bitcast %"class.__gnu_cxx::__normal_iterator"* %agg.tmp2 to i8*
  %3 = bitcast %"class.__gnu_cxx::__normal_iterator"* %pat_last to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %2, i8* %3, i32 4, i32 4, i1 false)
  %call = call i32 @_ZSt8distanceIN9__gnu_cxx17__normal_iteratorIPKcSsEEENSt15iterator_traitsIT_E15difference_typeES6_S6_(%"class.__gnu_cxx::__normal_iterator"* byval align 4 %agg.tmp, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %agg.tmp2)
  store i32 %call, i32* %count, align 4
  %4 = load i32* %count, align 4
  %cmp = icmp ugt i32 %4, 0
  br i1 %cmp, label %if.then, label %if.end67

if.then:                                          ; preds = %entry
  %5 = load i32* %count, align 4
  store i8 0, i8* %ref.tmp, align 1
  call void @_ZNSaIcEC1Ev(%"class.std::allocator"* %ref.tmp3) nounwind
  invoke void @_ZNSt6vectorIcSaIcEEC1EjRKcRKS0_(%"class.std::vector.3"* %reversed, i32 %5, i8* %ref.tmp, %"class.std::allocator"* %ref.tmp3)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %if.then
  call void @_ZNSaIcED1Ev(%"class.std::allocator"* %ref.tmp3) nounwind
  %6 = bitcast %"class.__gnu_cxx::__normal_iterator"* %agg.tmp4 to i8*
  %7 = bitcast %"class.__gnu_cxx::__normal_iterator"* %pat_first to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %6, i8* %7, i32 4, i32 4, i1 false)
  %8 = bitcast %"class.__gnu_cxx::__normal_iterator"* %agg.tmp5 to i8*
  %9 = bitcast %"class.__gnu_cxx::__normal_iterator"* %pat_last to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %8, i8* %9, i32 4, i32 4, i1 false)
  invoke void @_ZNSt6vectorIcSaIcEE5beginEv(%"class.__gnu_cxx::__normal_iterator.5"* sret %agg.tmp6, %"class.std::vector.3"* %reversed)
          to label %invoke.cont8 unwind label %lpad7

invoke.cont8:                                     ; preds = %invoke.cont
  invoke void @_ZSt12reverse_copyIN9__gnu_cxx17__normal_iteratorIPKcSsEENS1_IPcSt6vectorIcSaIcEEEEET0_T_SB_SA_(%"class.__gnu_cxx::__normal_iterator.5"* sret %tmp, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %agg.tmp4, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %agg.tmp5, %"class.__gnu_cxx::__normal_iterator.5"* byval align 4 %agg.tmp6)
          to label %invoke.cont9 unwind label %lpad7

invoke.cont9:                                     ; preds = %invoke.cont8
  %10 = load i32* %count, align 4
  store i32 0, i32* %ref.tmp11, align 4
  call void @_ZNSaIiEC1Ev(%"class.std::allocator.0"* %ref.tmp12) nounwind
  invoke void @_ZNSt6vectorIiSaIiEEC1EjRKiRKS0_(%"class.std::vector"* %prefix, i32 %10, i32* %ref.tmp11, %"class.std::allocator.0"* %ref.tmp12)
          to label %invoke.cont14 unwind label %lpad13

invoke.cont14:                                    ; preds = %invoke.cont9
  call void @_ZNSaIiED1Ev(%"class.std::allocator.0"* %ref.tmp12) nounwind
  %11 = bitcast %"class.__gnu_cxx::__normal_iterator"* %agg.tmp15 to i8*
  %12 = bitcast %"class.__gnu_cxx::__normal_iterator"* %pat_first to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %11, i8* %12, i32 4, i32 4, i1 false)
  %13 = bitcast %"class.__gnu_cxx::__normal_iterator"* %agg.tmp16 to i8*
  %14 = bitcast %"class.__gnu_cxx::__normal_iterator"* %pat_last to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %13, i8* %14, i32 4, i32 4, i1 false)
  invoke void @_ZN5boost9algorithm11boyer_mooreIN9__gnu_cxx17__normal_iteratorIPKcSsEENS0_6detail9BM_traitsIS6_EEE17compute_bm_prefixIS6_St6vectorIiSaIiEEEEvT_SF_RT0_(%"class.boost::algorithm::boyer_moore"* %this1, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %agg.tmp15, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %agg.tmp16, %"class.std::vector"* %prefix)
          to label %invoke.cont18 unwind label %lpad17

invoke.cont18:                                    ; preds = %invoke.cont14
  %15 = load i32* %count, align 4
  store i32 0, i32* %ref.tmp20, align 4
  call void @_ZNSaIiEC1Ev(%"class.std::allocator.0"* %ref.tmp21) nounwind
  invoke void @_ZNSt6vectorIiSaIiEEC1EjRKiRKS0_(%"class.std::vector"* %prefix_reversed, i32 %15, i32* %ref.tmp20, %"class.std::allocator.0"* %ref.tmp21)
          to label %invoke.cont23 unwind label %lpad22

invoke.cont23:                                    ; preds = %invoke.cont18
  call void @_ZNSaIiED1Ev(%"class.std::allocator.0"* %ref.tmp21) nounwind
  invoke void @_ZNSt6vectorIcSaIcEE5beginEv(%"class.__gnu_cxx::__normal_iterator.5"* sret %agg.tmp24, %"class.std::vector.3"* %reversed)
          to label %invoke.cont26 unwind label %lpad25

invoke.cont26:                                    ; preds = %invoke.cont23
  invoke void @_ZNSt6vectorIcSaIcEE3endEv(%"class.__gnu_cxx::__normal_iterator.5"* sret %agg.tmp27, %"class.std::vector.3"* %reversed)
          to label %invoke.cont28 unwind label %lpad25

invoke.cont28:                                    ; preds = %invoke.cont26
  invoke void @_ZN5boost9algorithm11boyer_mooreIN9__gnu_cxx17__normal_iteratorIPKcSsEENS0_6detail9BM_traitsIS6_EEE17compute_bm_prefixINS3_IPcSt6vectorIcSaIcEEEESD_IiSaIiEEEEvT_SJ_RT0_(%"class.boost::algorithm::boyer_moore"* %this1, %"class.__gnu_cxx::__normal_iterator.5"* byval align 4 %agg.tmp24, %"class.__gnu_cxx::__normal_iterator.5"* byval align 4 %agg.tmp27, %"class.std::vector"* %prefix_reversed)
          to label %invoke.cont29 unwind label %lpad25

invoke.cont29:                                    ; preds = %invoke.cont28
  store i32 0, i32* %i, align 4
  br label %for.cond

for.cond:                                         ; preds = %for.inc, %invoke.cont29
  %16 = load i32* %i, align 4
  %17 = load i32* %count, align 4
  %cmp31 = icmp ule i32 %16, %17
  br i1 %cmp31, label %for.body, label %for.end

for.body:                                         ; preds = %for.cond
  %18 = load i32* %count, align 4
  %19 = load i32* %count, align 4
  %sub = sub i32 %19, 1
  %call33 = invoke i32* @_ZNSt6vectorIiSaIiEEixEj(%"class.std::vector"* %prefix, i32 %sub)
          to label %invoke.cont32 unwind label %lpad25

invoke.cont32:                                    ; preds = %for.body
  %20 = load i32* %call33
  %sub34 = sub i32 %18, %20
  %suffix_ = getelementptr inbounds %"class.boost::algorithm::boyer_moore"* %this1, i32 0, i32 4
  %21 = load i32* %i, align 4
  %call36 = invoke i32* @_ZNSt6vectorIiSaIiEEixEj(%"class.std::vector"* %suffix_, i32 %21)
          to label %invoke.cont35 unwind label %lpad25

invoke.cont35:                                    ; preds = %invoke.cont32
  store i32 %sub34, i32* %call36
  br label %for.inc

for.inc:                                          ; preds = %invoke.cont35
  %22 = load i32* %i, align 4
  %inc = add i32 %22, 1
  store i32 %inc, i32* %i, align 4
  br label %for.cond

lpad:                                             ; preds = %if.then
  %23 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %24 = extractvalue { i8*, i32 } %23, 0
  store i8* %24, i8** %exn.slot
  %25 = extractvalue { i8*, i32 } %23, 1
  store i32 %25, i32* %ehselector.slot
  call void @_ZNSaIcED1Ev(%"class.std::allocator"* %ref.tmp3) nounwind
  br label %eh.resume

lpad7:                                            ; preds = %invoke.cont61, %invoke.cont8, %invoke.cont
  %26 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %27 = extractvalue { i8*, i32 } %26, 0
  store i8* %27, i8** %exn.slot
  %28 = extractvalue { i8*, i32 } %26, 1
  store i32 %28, i32* %ehselector.slot
  br label %ehcleanup65

lpad13:                                           ; preds = %invoke.cont9
  %29 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %30 = extractvalue { i8*, i32 } %29, 0
  store i8* %30, i8** %exn.slot
  %31 = extractvalue { i8*, i32 } %29, 1
  store i32 %31, i32* %ehselector.slot
  call void @_ZNSaIiED1Ev(%"class.std::allocator.0"* %ref.tmp12) nounwind
  br label %ehcleanup65

lpad17:                                           ; preds = %for.end60, %invoke.cont14
  %32 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %33 = extractvalue { i8*, i32 } %32, 0
  store i8* %33, i8** %exn.slot
  %34 = extractvalue { i8*, i32 } %32, 1
  store i32 %34, i32* %ehselector.slot
  br label %ehcleanup

lpad22:                                           ; preds = %invoke.cont18
  %35 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %36 = extractvalue { i8*, i32 } %35, 0
  store i8* %36, i8** %exn.slot
  %37 = extractvalue { i8*, i32 } %35, 1
  store i32 %37, i32* %ehselector.slot
  call void @_ZNSaIiED1Ev(%"class.std::allocator.0"* %ref.tmp21) nounwind
  br label %ehcleanup

lpad25:                                           ; preds = %if.then54, %invoke.cont47, %invoke.cont43, %for.body41, %invoke.cont32, %for.body, %invoke.cont28, %invoke.cont26, %invoke.cont23
  %38 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %39 = extractvalue { i8*, i32 } %38, 0
  store i8* %39, i8** %exn.slot
  %40 = extractvalue { i8*, i32 } %38, 1
  store i32 %40, i32* %ehselector.slot
  invoke void @_ZNSt6vectorIiSaIiEED1Ev(%"class.std::vector"* %prefix_reversed)
          to label %invoke.cont62 unwind label %terminate.lpad

for.end:                                          ; preds = %for.cond
  store i32 0, i32* %i38, align 4
  br label %for.cond39

for.cond39:                                       ; preds = %for.inc58, %for.end
  %41 = load i32* %i38, align 4
  %42 = load i32* %count, align 4
  %cmp40 = icmp ult i32 %41, %42
  br i1 %cmp40, label %for.body41, label %for.end60

for.body41:                                       ; preds = %for.cond39
  %43 = load i32* %count, align 4
  %44 = load i32* %i38, align 4
  %call44 = invoke i32* @_ZNSt6vectorIiSaIiEEixEj(%"class.std::vector"* %prefix_reversed, i32 %44)
          to label %invoke.cont43 unwind label %lpad25

invoke.cont43:                                    ; preds = %for.body41
  %45 = load i32* %call44
  %sub45 = sub i32 %43, %45
  store i32 %sub45, i32* %j, align 4
  %46 = load i32* %i38, align 4
  %47 = load i32* %i38, align 4
  %call48 = invoke i32* @_ZNSt6vectorIiSaIiEEixEj(%"class.std::vector"* %prefix_reversed, i32 %47)
          to label %invoke.cont47 unwind label %lpad25

invoke.cont47:                                    ; preds = %invoke.cont43
  %48 = load i32* %call48
  %sub49 = sub i32 %46, %48
  %add = add i32 %sub49, 1
  store i32 %add, i32* %k, align 4
  %suffix_50 = getelementptr inbounds %"class.boost::algorithm::boyer_moore"* %this1, i32 0, i32 4
  %49 = load i32* %j, align 4
  %call52 = invoke i32* @_ZNSt6vectorIiSaIiEEixEj(%"class.std::vector"* %suffix_50, i32 %49)
          to label %invoke.cont51 unwind label %lpad25

invoke.cont51:                                    ; preds = %invoke.cont47
  %50 = load i32* %call52
  %51 = load i32* %k, align 4
  %cmp53 = icmp sgt i32 %50, %51
  br i1 %cmp53, label %if.then54, label %if.end

if.then54:                                        ; preds = %invoke.cont51
  %52 = load i32* %k, align 4
  %suffix_55 = getelementptr inbounds %"class.boost::algorithm::boyer_moore"* %this1, i32 0, i32 4
  %53 = load i32* %j, align 4
  %call57 = invoke i32* @_ZNSt6vectorIiSaIiEEixEj(%"class.std::vector"* %suffix_55, i32 %53)
          to label %invoke.cont56 unwind label %lpad25

invoke.cont56:                                    ; preds = %if.then54
  store i32 %52, i32* %call57
  br label %if.end

if.end:                                           ; preds = %invoke.cont56, %invoke.cont51
  br label %for.inc58

for.inc58:                                        ; preds = %if.end
  %54 = load i32* %i38, align 4
  %inc59 = add i32 %54, 1
  store i32 %inc59, i32* %i38, align 4
  br label %for.cond39

for.end60:                                        ; preds = %for.cond39
  invoke void @_ZNSt6vectorIiSaIiEED1Ev(%"class.std::vector"* %prefix_reversed)
          to label %invoke.cont61 unwind label %lpad17

invoke.cont61:                                    ; preds = %for.end60
  invoke void @_ZNSt6vectorIiSaIiEED1Ev(%"class.std::vector"* %prefix)
          to label %invoke.cont63 unwind label %lpad7

invoke.cont63:                                    ; preds = %invoke.cont61
  call void @_ZNSt6vectorIcSaIcEED1Ev(%"class.std::vector.3"* %reversed)
  br label %if.end67

invoke.cont62:                                    ; preds = %lpad25
  br label %ehcleanup

ehcleanup:                                        ; preds = %invoke.cont62, %lpad22, %lpad17
  invoke void @_ZNSt6vectorIiSaIiEED1Ev(%"class.std::vector"* %prefix)
          to label %invoke.cont64 unwind label %terminate.lpad

invoke.cont64:                                    ; preds = %ehcleanup
  br label %ehcleanup65

ehcleanup65:                                      ; preds = %invoke.cont64, %lpad13, %lpad7
  invoke void @_ZNSt6vectorIcSaIcEED1Ev(%"class.std::vector.3"* %reversed)
          to label %invoke.cont66 unwind label %terminate.lpad

invoke.cont66:                                    ; preds = %ehcleanup65
  br label %eh.resume

if.end67:                                         ; preds = %invoke.cont63, %entry
  ret void

eh.resume:                                        ; preds = %invoke.cont66, %lpad
  %exn = load i8** %exn.slot
  %sel = load i32* %ehselector.slot
  %lpad.val = insertvalue { i8*, i32 } undef, i8* %exn, 0
  %lpad.val68 = insertvalue { i8*, i32 } %lpad.val, i32 %sel, 1
  resume { i8*, i32 } %lpad.val68

terminate.lpad:                                   ; preds = %ehcleanup65, %ehcleanup, %lpad25
  %55 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          catch i8* null
  call void @_ZSt9terminatev() noreturn nounwind
  unreachable
}

define linkonce_odr void @_ZNSt6vectorIcSaIcEEC1EjRKcRKS0_(%"class.std::vector.3"* %this, i32 %__n, i8* %__value, %"class.std::allocator"* %__a) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.std::vector.3"*, align 4
  %__n.addr = alloca i32, align 4
  %__value.addr = alloca i8*, align 4
  %__a.addr = alloca %"class.std::allocator"*, align 4
  store %"class.std::vector.3"* %this, %"class.std::vector.3"** %this.addr, align 4
  store i32 %__n, i32* %__n.addr, align 4
  store i8* %__value, i8** %__value.addr, align 4
  store %"class.std::allocator"* %__a, %"class.std::allocator"** %__a.addr, align 4
  %this1 = load %"class.std::vector.3"** %this.addr
  %0 = load i32* %__n.addr, align 4
  %1 = load i8** %__value.addr
  %2 = load %"class.std::allocator"** %__a.addr
  call void @_ZNSt6vectorIcSaIcEEC2EjRKcRKS0_(%"class.std::vector.3"* %this1, i32 %0, i8* %1, %"class.std::allocator"* %2)
  ret void
}

define linkonce_odr void @_ZSt12reverse_copyIN9__gnu_cxx17__normal_iteratorIPKcSsEENS1_IPcSt6vectorIcSaIcEEEEET0_T_SB_SA_(%"class.__gnu_cxx::__normal_iterator.5"* noalias sret %agg.result, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %__first, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %__last, %"class.__gnu_cxx::__normal_iterator.5"* byval align 4 %__result) {
entry:
  br label %while.cond

while.cond:                                       ; preds = %while.body, %entry
  %call = call zeroext i1 @_ZN9__gnu_cxxneIPKcSsEEbRKNS_17__normal_iteratorIT_T0_EES8_(%"class.__gnu_cxx::__normal_iterator"* %__first, %"class.__gnu_cxx::__normal_iterator"* %__last)
  br i1 %call, label %while.body, label %while.end

while.body:                                       ; preds = %while.cond
  %call1 = call %"class.__gnu_cxx::__normal_iterator"* @_ZN9__gnu_cxx17__normal_iteratorIPKcSsEmmEv(%"class.__gnu_cxx::__normal_iterator"* %__last)
  %call2 = call i8* @_ZNK9__gnu_cxx17__normal_iteratorIPKcSsEdeEv(%"class.__gnu_cxx::__normal_iterator"* %__last)
  %0 = load i8* %call2
  %call3 = call i8* @_ZNK9__gnu_cxx17__normal_iteratorIPcSt6vectorIcSaIcEEEdeEv(%"class.__gnu_cxx::__normal_iterator.5"* %__result)
  store i8 %0, i8* %call3
  %call4 = call %"class.__gnu_cxx::__normal_iterator.5"* @_ZN9__gnu_cxx17__normal_iteratorIPcSt6vectorIcSaIcEEEppEv(%"class.__gnu_cxx::__normal_iterator.5"* %__result)
  br label %while.cond

while.end:                                        ; preds = %while.cond
  %1 = bitcast %"class.__gnu_cxx::__normal_iterator.5"* %agg.result to i8*
  %2 = bitcast %"class.__gnu_cxx::__normal_iterator.5"* %__result to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %1, i8* %2, i32 4, i32 4, i1 false)
  ret void
}

define linkonce_odr void @_ZNSt6vectorIcSaIcEE5beginEv(%"class.__gnu_cxx::__normal_iterator.5"* noalias sret %agg.result, %"class.std::vector.3"* %this) align 2 {
entry:
  %this.addr = alloca %"class.std::vector.3"*, align 4
  store %"class.std::vector.3"* %this, %"class.std::vector.3"** %this.addr, align 4
  %this1 = load %"class.std::vector.3"** %this.addr
  %0 = bitcast %"class.std::vector.3"* %this1 to %"struct.std::_Vector_base.4"*
  %_M_impl = getelementptr inbounds %"struct.std::_Vector_base.4"* %0, i32 0, i32 0
  %_M_start = getelementptr inbounds %"struct.std::_Vector_base<char, std::allocator<char> >::_Vector_impl"* %_M_impl, i32 0, i32 0
  call void @_ZN9__gnu_cxx17__normal_iteratorIPcSt6vectorIcSaIcEEEC1ERKS1_(%"class.__gnu_cxx::__normal_iterator.5"* %agg.result, i8** %_M_start)
  ret void
}

define linkonce_odr void @_ZN5boost9algorithm11boyer_mooreIN9__gnu_cxx17__normal_iteratorIPKcSsEENS0_6detail9BM_traitsIS6_EEE17compute_bm_prefixIS6_St6vectorIiSaIiEEEEvT_SF_RT0_(%"class.boost::algorithm::boyer_moore"* %this, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %pat_first, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %pat_last, %"class.std::vector"* %prefix) align 2 {
entry:
  %this.addr = alloca %"class.boost::algorithm::boyer_moore"*, align 4
  %prefix.addr = alloca %"class.std::vector"*, align 4
  %count = alloca i32, align 4
  %agg.tmp = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %agg.tmp2 = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %k = alloca i32, align 4
  %i = alloca i32, align 4
  %ref.tmp = alloca i32, align 4
  %ref.tmp16 = alloca i32, align 4
  %ref.tmp25 = alloca i32, align 4
  %ref.tmp28 = alloca i32, align 4
  store %"class.boost::algorithm::boyer_moore"* %this, %"class.boost::algorithm::boyer_moore"** %this.addr, align 4
  store %"class.std::vector"* %prefix, %"class.std::vector"** %prefix.addr, align 4
  %this1 = load %"class.boost::algorithm::boyer_moore"** %this.addr
  %0 = bitcast %"class.__gnu_cxx::__normal_iterator"* %agg.tmp to i8*
  %1 = bitcast %"class.__gnu_cxx::__normal_iterator"* %pat_first to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %0, i8* %1, i32 4, i32 4, i1 false)
  %2 = bitcast %"class.__gnu_cxx::__normal_iterator"* %agg.tmp2 to i8*
  %3 = bitcast %"class.__gnu_cxx::__normal_iterator"* %pat_last to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %2, i8* %3, i32 4, i32 4, i1 false)
  %call = call i32 @_ZSt8distanceIN9__gnu_cxx17__normal_iteratorIPKcSsEEENSt15iterator_traitsIT_E15difference_typeES6_S6_(%"class.__gnu_cxx::__normal_iterator"* byval align 4 %agg.tmp, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %agg.tmp2)
  store i32 %call, i32* %count, align 4
  %4 = load i32* %count, align 4
  %cmp = icmp ugt i32 %4, 0
  br i1 %cmp, label %cond.true, label %cond.false

cond.true:                                        ; preds = %entry
  br label %cond.end

cond.false:                                       ; preds = %entry
  call void @__assert_fail(i8* getelementptr inbounds ([10 x i8]* @.str20, i32 0, i32 0), i8* getelementptr inbounds ([68 x i8]* @.str21, i32 0, i32 0), i32 154, i8* getelementptr inbounds ([585 x i8]* @__PRETTY_FUNCTION__._ZN5boost9algorithm11boyer_mooreIN9__gnu_cxx17__normal_iteratorIPKcSsEENS0_6detail9BM_traitsIS6_EEE17compute_bm_prefixIS6_St6vectorIiSaIiEEEEvT_SF_RT0_, i32 0, i32 0)) noreturn nounwind
  unreachable
                                                  ; No predecessors!
  br label %cond.end

cond.end:                                         ; preds = %5, %cond.true
  %6 = load %"class.std::vector"** %prefix.addr, align 4
  %call3 = call i32 @_ZNKSt6vectorIiSaIiEE4sizeEv(%"class.std::vector"* %6)
  %7 = load i32* %count, align 4
  %cmp4 = icmp eq i32 %call3, %7
  br i1 %cmp4, label %cond.true5, label %cond.false6

cond.true5:                                       ; preds = %cond.end
  br label %cond.end7

cond.false6:                                      ; preds = %cond.end
  call void @__assert_fail(i8* getelementptr inbounds ([24 x i8]* @.str22, i32 0, i32 0), i8* getelementptr inbounds ([68 x i8]* @.str21, i32 0, i32 0), i32 155, i8* getelementptr inbounds ([585 x i8]* @__PRETTY_FUNCTION__._ZN5boost9algorithm11boyer_mooreIN9__gnu_cxx17__normal_iteratorIPKcSsEENS0_6detail9BM_traitsIS6_EEE17compute_bm_prefixIS6_St6vectorIiSaIiEEEEvT_SF_RT0_, i32 0, i32 0)) noreturn nounwind
  unreachable
                                                  ; No predecessors!
  br label %cond.end7

cond.end7:                                        ; preds = %8, %cond.true5
  %9 = load %"class.std::vector"** %prefix.addr, align 4
  %call8 = call i32* @_ZNSt6vectorIiSaIiEEixEj(%"class.std::vector"* %9, i32 0)
  store i32 0, i32* %call8
  store i32 0, i32* %k, align 4
  store i32 1, i32* %i, align 4
  br label %for.cond

for.cond:                                         ; preds = %for.inc, %cond.end7
  %10 = load i32* %i, align 4
  %11 = load i32* %count, align 4
  %cmp9 = icmp ult i32 %10, %11
  br i1 %cmp9, label %for.body, label %for.end

for.body:                                         ; preds = %for.cond
  %12 = load i32* %k, align 4
  %13 = load i32* %count, align 4
  %cmp10 = icmp ult i32 %12, %13
  br i1 %cmp10, label %cond.true11, label %cond.false12

cond.true11:                                      ; preds = %for.body
  br label %cond.end13

cond.false12:                                     ; preds = %for.body
  call void @__assert_fail(i8* getelementptr inbounds ([10 x i8]* @.str23, i32 0, i32 0), i8* getelementptr inbounds ([68 x i8]* @.str21, i32 0, i32 0), i32 160, i8* getelementptr inbounds ([585 x i8]* @__PRETTY_FUNCTION__._ZN5boost9algorithm11boyer_mooreIN9__gnu_cxx17__normal_iteratorIPKcSsEENS0_6detail9BM_traitsIS6_EEE17compute_bm_prefixIS6_St6vectorIiSaIiEEEEvT_SF_RT0_, i32 0, i32 0)) noreturn nounwind
  unreachable
                                                  ; No predecessors!
  br label %cond.end13

cond.end13:                                       ; preds = %14, %cond.true11
  br label %while.cond

while.cond:                                       ; preds = %cond.end23, %cond.end13
  %15 = load i32* %k, align 4
  %cmp14 = icmp ugt i32 %15, 0
  br i1 %cmp14, label %land.rhs, label %land.end

land.rhs:                                         ; preds = %while.cond
  %16 = load i32* %k, align 4
  store i32 %16, i32* %ref.tmp, align 4
  %call15 = call i8* @_ZNK9__gnu_cxx17__normal_iteratorIPKcSsEixERKi(%"class.__gnu_cxx::__normal_iterator"* %pat_first, i32* %ref.tmp)
  %17 = load i8* %call15
  %conv = sext i8 %17 to i32
  %18 = load i32* %i, align 4
  store i32 %18, i32* %ref.tmp16, align 4
  %call17 = call i8* @_ZNK9__gnu_cxx17__normal_iteratorIPKcSsEixERKi(%"class.__gnu_cxx::__normal_iterator"* %pat_first, i32* %ref.tmp16)
  %19 = load i8* %call17
  %conv18 = sext i8 %19 to i32
  %cmp19 = icmp ne i32 %conv, %conv18
  br label %land.end

land.end:                                         ; preds = %land.rhs, %while.cond
  %20 = phi i1 [ false, %while.cond ], [ %cmp19, %land.rhs ]
  br i1 %20, label %while.body, label %while.end

while.body:                                       ; preds = %land.end
  %21 = load i32* %k, align 4
  %22 = load i32* %count, align 4
  %cmp20 = icmp ult i32 %21, %22
  br i1 %cmp20, label %cond.true21, label %cond.false22

cond.true21:                                      ; preds = %while.body
  br label %cond.end23

cond.false22:                                     ; preds = %while.body
  call void @__assert_fail(i8* getelementptr inbounds ([10 x i8]* @.str23, i32 0, i32 0), i8* getelementptr inbounds ([68 x i8]* @.str21, i32 0, i32 0), i32 162, i8* getelementptr inbounds ([585 x i8]* @__PRETTY_FUNCTION__._ZN5boost9algorithm11boyer_mooreIN9__gnu_cxx17__normal_iteratorIPKcSsEENS0_6detail9BM_traitsIS6_EEE17compute_bm_prefixIS6_St6vectorIiSaIiEEEEvT_SF_RT0_, i32 0, i32 0)) noreturn nounwind
  unreachable
                                                  ; No predecessors!
  br label %cond.end23

cond.end23:                                       ; preds = %23, %cond.true21
  %24 = load %"class.std::vector"** %prefix.addr, align 4
  %25 = load i32* %k, align 4
  %sub = sub i32 %25, 1
  %call24 = call i32* @_ZNSt6vectorIiSaIiEEixEj(%"class.std::vector"* %24, i32 %sub)
  %26 = load i32* %call24
  store i32 %26, i32* %k, align 4
  br label %while.cond

while.end:                                        ; preds = %land.end
  %27 = load i32* %k, align 4
  store i32 %27, i32* %ref.tmp25, align 4
  %call26 = call i8* @_ZNK9__gnu_cxx17__normal_iteratorIPKcSsEixERKi(%"class.__gnu_cxx::__normal_iterator"* %pat_first, i32* %ref.tmp25)
  %28 = load i8* %call26
  %conv27 = sext i8 %28 to i32
  %29 = load i32* %i, align 4
  store i32 %29, i32* %ref.tmp28, align 4
  %call29 = call i8* @_ZNK9__gnu_cxx17__normal_iteratorIPKcSsEixERKi(%"class.__gnu_cxx::__normal_iterator"* %pat_first, i32* %ref.tmp28)
  %30 = load i8* %call29
  %conv30 = sext i8 %30 to i32
  %cmp31 = icmp eq i32 %conv27, %conv30
  br i1 %cmp31, label %if.then, label %if.end

if.then:                                          ; preds = %while.end
  %31 = load i32* %k, align 4
  %inc = add i32 %31, 1
  store i32 %inc, i32* %k, align 4
  br label %if.end

if.end:                                           ; preds = %if.then, %while.end
  %32 = load i32* %k, align 4
  %33 = load %"class.std::vector"** %prefix.addr, align 4
  %34 = load i32* %i, align 4
  %call32 = call i32* @_ZNSt6vectorIiSaIiEEixEj(%"class.std::vector"* %33, i32 %34)
  store i32 %32, i32* %call32
  br label %for.inc

for.inc:                                          ; preds = %if.end
  %35 = load i32* %i, align 4
  %inc33 = add i32 %35, 1
  store i32 %inc33, i32* %i, align 4
  br label %for.cond

for.end:                                          ; preds = %for.cond
  ret void
}

define linkonce_odr void @_ZN5boost9algorithm11boyer_mooreIN9__gnu_cxx17__normal_iteratorIPKcSsEENS0_6detail9BM_traitsIS6_EEE17compute_bm_prefixINS3_IPcSt6vectorIcSaIcEEEESD_IiSaIiEEEEvT_SJ_RT0_(%"class.boost::algorithm::boyer_moore"* %this, %"class.__gnu_cxx::__normal_iterator.5"* byval align 4 %pat_first, %"class.__gnu_cxx::__normal_iterator.5"* byval align 4 %pat_last, %"class.std::vector"* %prefix) align 2 {
entry:
  %this.addr = alloca %"class.boost::algorithm::boyer_moore"*, align 4
  %prefix.addr = alloca %"class.std::vector"*, align 4
  %count = alloca i32, align 4
  %agg.tmp = alloca %"class.__gnu_cxx::__normal_iterator.5", align 4
  %agg.tmp2 = alloca %"class.__gnu_cxx::__normal_iterator.5", align 4
  %k = alloca i32, align 4
  %i = alloca i32, align 4
  %ref.tmp = alloca i32, align 4
  %ref.tmp16 = alloca i32, align 4
  %ref.tmp25 = alloca i32, align 4
  %ref.tmp28 = alloca i32, align 4
  store %"class.boost::algorithm::boyer_moore"* %this, %"class.boost::algorithm::boyer_moore"** %this.addr, align 4
  store %"class.std::vector"* %prefix, %"class.std::vector"** %prefix.addr, align 4
  %this1 = load %"class.boost::algorithm::boyer_moore"** %this.addr
  %0 = bitcast %"class.__gnu_cxx::__normal_iterator.5"* %agg.tmp to i8*
  %1 = bitcast %"class.__gnu_cxx::__normal_iterator.5"* %pat_first to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %0, i8* %1, i32 4, i32 4, i1 false)
  %2 = bitcast %"class.__gnu_cxx::__normal_iterator.5"* %agg.tmp2 to i8*
  %3 = bitcast %"class.__gnu_cxx::__normal_iterator.5"* %pat_last to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %2, i8* %3, i32 4, i32 4, i1 false)
  %call = call i32 @_ZSt8distanceIN9__gnu_cxx17__normal_iteratorIPcSt6vectorIcSaIcEEEEENSt15iterator_traitsIT_E15difference_typeES8_S8_(%"class.__gnu_cxx::__normal_iterator.5"* byval align 4 %agg.tmp, %"class.__gnu_cxx::__normal_iterator.5"* byval align 4 %agg.tmp2)
  store i32 %call, i32* %count, align 4
  %4 = load i32* %count, align 4
  %cmp = icmp ugt i32 %4, 0
  br i1 %cmp, label %cond.true, label %cond.false

cond.true:                                        ; preds = %entry
  br label %cond.end

cond.false:                                       ; preds = %entry
  call void @__assert_fail(i8* getelementptr inbounds ([10 x i8]* @.str20, i32 0, i32 0), i8* getelementptr inbounds ([68 x i8]* @.str21, i32 0, i32 0), i32 154, i8* getelementptr inbounds ([596 x i8]* @__PRETTY_FUNCTION__._ZN5boost9algorithm11boyer_mooreIN9__gnu_cxx17__normal_iteratorIPKcSsEENS0_6detail9BM_traitsIS6_EEE17compute_bm_prefixINS3_IPcSt6vectorIcSaIcEEEESD_IiSaIiEEEEvT_SJ_RT0_, i32 0, i32 0)) noreturn nounwind
  unreachable
                                                  ; No predecessors!
  br label %cond.end

cond.end:                                         ; preds = %5, %cond.true
  %6 = load %"class.std::vector"** %prefix.addr, align 4
  %call3 = call i32 @_ZNKSt6vectorIiSaIiEE4sizeEv(%"class.std::vector"* %6)
  %7 = load i32* %count, align 4
  %cmp4 = icmp eq i32 %call3, %7
  br i1 %cmp4, label %cond.true5, label %cond.false6

cond.true5:                                       ; preds = %cond.end
  br label %cond.end7

cond.false6:                                      ; preds = %cond.end
  call void @__assert_fail(i8* getelementptr inbounds ([24 x i8]* @.str22, i32 0, i32 0), i8* getelementptr inbounds ([68 x i8]* @.str21, i32 0, i32 0), i32 155, i8* getelementptr inbounds ([596 x i8]* @__PRETTY_FUNCTION__._ZN5boost9algorithm11boyer_mooreIN9__gnu_cxx17__normal_iteratorIPKcSsEENS0_6detail9BM_traitsIS6_EEE17compute_bm_prefixINS3_IPcSt6vectorIcSaIcEEEESD_IiSaIiEEEEvT_SJ_RT0_, i32 0, i32 0)) noreturn nounwind
  unreachable
                                                  ; No predecessors!
  br label %cond.end7

cond.end7:                                        ; preds = %8, %cond.true5
  %9 = load %"class.std::vector"** %prefix.addr, align 4
  %call8 = call i32* @_ZNSt6vectorIiSaIiEEixEj(%"class.std::vector"* %9, i32 0)
  store i32 0, i32* %call8
  store i32 0, i32* %k, align 4
  store i32 1, i32* %i, align 4
  br label %for.cond

for.cond:                                         ; preds = %for.inc, %cond.end7
  %10 = load i32* %i, align 4
  %11 = load i32* %count, align 4
  %cmp9 = icmp ult i32 %10, %11
  br i1 %cmp9, label %for.body, label %for.end

for.body:                                         ; preds = %for.cond
  %12 = load i32* %k, align 4
  %13 = load i32* %count, align 4
  %cmp10 = icmp ult i32 %12, %13
  br i1 %cmp10, label %cond.true11, label %cond.false12

cond.true11:                                      ; preds = %for.body
  br label %cond.end13

cond.false12:                                     ; preds = %for.body
  call void @__assert_fail(i8* getelementptr inbounds ([10 x i8]* @.str23, i32 0, i32 0), i8* getelementptr inbounds ([68 x i8]* @.str21, i32 0, i32 0), i32 160, i8* getelementptr inbounds ([596 x i8]* @__PRETTY_FUNCTION__._ZN5boost9algorithm11boyer_mooreIN9__gnu_cxx17__normal_iteratorIPKcSsEENS0_6detail9BM_traitsIS6_EEE17compute_bm_prefixINS3_IPcSt6vectorIcSaIcEEEESD_IiSaIiEEEEvT_SJ_RT0_, i32 0, i32 0)) noreturn nounwind
  unreachable
                                                  ; No predecessors!
  br label %cond.end13

cond.end13:                                       ; preds = %14, %cond.true11
  br label %while.cond

while.cond:                                       ; preds = %cond.end23, %cond.end13
  %15 = load i32* %k, align 4
  %cmp14 = icmp ugt i32 %15, 0
  br i1 %cmp14, label %land.rhs, label %land.end

land.rhs:                                         ; preds = %while.cond
  %16 = load i32* %k, align 4
  store i32 %16, i32* %ref.tmp, align 4
  %call15 = call i8* @_ZNK9__gnu_cxx17__normal_iteratorIPcSt6vectorIcSaIcEEEixERKi(%"class.__gnu_cxx::__normal_iterator.5"* %pat_first, i32* %ref.tmp)
  %17 = load i8* %call15
  %conv = sext i8 %17 to i32
  %18 = load i32* %i, align 4
  store i32 %18, i32* %ref.tmp16, align 4
  %call17 = call i8* @_ZNK9__gnu_cxx17__normal_iteratorIPcSt6vectorIcSaIcEEEixERKi(%"class.__gnu_cxx::__normal_iterator.5"* %pat_first, i32* %ref.tmp16)
  %19 = load i8* %call17
  %conv18 = sext i8 %19 to i32
  %cmp19 = icmp ne i32 %conv, %conv18
  br label %land.end

land.end:                                         ; preds = %land.rhs, %while.cond
  %20 = phi i1 [ false, %while.cond ], [ %cmp19, %land.rhs ]
  br i1 %20, label %while.body, label %while.end

while.body:                                       ; preds = %land.end
  %21 = load i32* %k, align 4
  %22 = load i32* %count, align 4
  %cmp20 = icmp ult i32 %21, %22
  br i1 %cmp20, label %cond.true21, label %cond.false22

cond.true21:                                      ; preds = %while.body
  br label %cond.end23

cond.false22:                                     ; preds = %while.body
  call void @__assert_fail(i8* getelementptr inbounds ([10 x i8]* @.str23, i32 0, i32 0), i8* getelementptr inbounds ([68 x i8]* @.str21, i32 0, i32 0), i32 162, i8* getelementptr inbounds ([596 x i8]* @__PRETTY_FUNCTION__._ZN5boost9algorithm11boyer_mooreIN9__gnu_cxx17__normal_iteratorIPKcSsEENS0_6detail9BM_traitsIS6_EEE17compute_bm_prefixINS3_IPcSt6vectorIcSaIcEEEESD_IiSaIiEEEEvT_SJ_RT0_, i32 0, i32 0)) noreturn nounwind
  unreachable
                                                  ; No predecessors!
  br label %cond.end23

cond.end23:                                       ; preds = %23, %cond.true21
  %24 = load %"class.std::vector"** %prefix.addr, align 4
  %25 = load i32* %k, align 4
  %sub = sub i32 %25, 1
  %call24 = call i32* @_ZNSt6vectorIiSaIiEEixEj(%"class.std::vector"* %24, i32 %sub)
  %26 = load i32* %call24
  store i32 %26, i32* %k, align 4
  br label %while.cond

while.end:                                        ; preds = %land.end
  %27 = load i32* %k, align 4
  store i32 %27, i32* %ref.tmp25, align 4
  %call26 = call i8* @_ZNK9__gnu_cxx17__normal_iteratorIPcSt6vectorIcSaIcEEEixERKi(%"class.__gnu_cxx::__normal_iterator.5"* %pat_first, i32* %ref.tmp25)
  %28 = load i8* %call26
  %conv27 = sext i8 %28 to i32
  %29 = load i32* %i, align 4
  store i32 %29, i32* %ref.tmp28, align 4
  %call29 = call i8* @_ZNK9__gnu_cxx17__normal_iteratorIPcSt6vectorIcSaIcEEEixERKi(%"class.__gnu_cxx::__normal_iterator.5"* %pat_first, i32* %ref.tmp28)
  %30 = load i8* %call29
  %conv30 = sext i8 %30 to i32
  %cmp31 = icmp eq i32 %conv27, %conv30
  br i1 %cmp31, label %if.then, label %if.end

if.then:                                          ; preds = %while.end
  %31 = load i32* %k, align 4
  %inc = add i32 %31, 1
  store i32 %inc, i32* %k, align 4
  br label %if.end

if.end:                                           ; preds = %if.then, %while.end
  %32 = load i32* %k, align 4
  %33 = load %"class.std::vector"** %prefix.addr, align 4
  %34 = load i32* %i, align 4
  %call32 = call i32* @_ZNSt6vectorIiSaIiEEixEj(%"class.std::vector"* %33, i32 %34)
  store i32 %32, i32* %call32
  br label %for.inc

for.inc:                                          ; preds = %if.end
  %35 = load i32* %i, align 4
  %inc33 = add i32 %35, 1
  store i32 %inc33, i32* %i, align 4
  br label %for.cond

for.end:                                          ; preds = %for.cond
  ret void
}

define linkonce_odr void @_ZNSt6vectorIcSaIcEE3endEv(%"class.__gnu_cxx::__normal_iterator.5"* noalias sret %agg.result, %"class.std::vector.3"* %this) align 2 {
entry:
  %this.addr = alloca %"class.std::vector.3"*, align 4
  store %"class.std::vector.3"* %this, %"class.std::vector.3"** %this.addr, align 4
  %this1 = load %"class.std::vector.3"** %this.addr
  %0 = bitcast %"class.std::vector.3"* %this1 to %"struct.std::_Vector_base.4"*
  %_M_impl = getelementptr inbounds %"struct.std::_Vector_base.4"* %0, i32 0, i32 0
  %_M_finish = getelementptr inbounds %"struct.std::_Vector_base<char, std::allocator<char> >::_Vector_impl"* %_M_impl, i32 0, i32 1
  call void @_ZN9__gnu_cxx17__normal_iteratorIPcSt6vectorIcSaIcEEEC1ERKS1_(%"class.__gnu_cxx::__normal_iterator.5"* %agg.result, i8** %_M_finish)
  ret void
}

define linkonce_odr void @_ZNSt6vectorIcSaIcEED1Ev(%"class.std::vector.3"* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.std::vector.3"*, align 4
  store %"class.std::vector.3"* %this, %"class.std::vector.3"** %this.addr, align 4
  %this1 = load %"class.std::vector.3"** %this.addr
  call void @_ZNSt6vectorIcSaIcEED2Ev(%"class.std::vector.3"* %this1)
  ret void
}

define linkonce_odr void @_ZNSt6vectorIcSaIcEED2Ev(%"class.std::vector.3"* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.std::vector.3"*, align 4
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  store %"class.std::vector.3"* %this, %"class.std::vector.3"** %this.addr, align 4
  %this1 = load %"class.std::vector.3"** %this.addr
  %0 = bitcast %"class.std::vector.3"* %this1 to %"struct.std::_Vector_base.4"*
  %_M_impl = getelementptr inbounds %"struct.std::_Vector_base.4"* %0, i32 0, i32 0
  %_M_start = getelementptr inbounds %"struct.std::_Vector_base<char, std::allocator<char> >::_Vector_impl"* %_M_impl, i32 0, i32 0
  %1 = load i8** %_M_start, align 4
  %2 = bitcast %"class.std::vector.3"* %this1 to %"struct.std::_Vector_base.4"*
  %_M_impl2 = getelementptr inbounds %"struct.std::_Vector_base.4"* %2, i32 0, i32 0
  %_M_finish = getelementptr inbounds %"struct.std::_Vector_base<char, std::allocator<char> >::_Vector_impl"* %_M_impl2, i32 0, i32 1
  %3 = load i8** %_M_finish, align 4
  %4 = bitcast %"class.std::vector.3"* %this1 to %"struct.std::_Vector_base.4"*
  %call = invoke %"class.std::allocator"* @_ZNSt12_Vector_baseIcSaIcEE19_M_get_Tp_allocatorEv(%"struct.std::_Vector_base.4"* %4)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %entry
  invoke void @_ZSt8_DestroyIPccEvT_S1_RSaIT0_E(i8* %1, i8* %3, %"class.std::allocator"* %call)
          to label %invoke.cont3 unwind label %lpad

invoke.cont3:                                     ; preds = %invoke.cont
  %5 = bitcast %"class.std::vector.3"* %this1 to %"struct.std::_Vector_base.4"*
  call void @_ZNSt12_Vector_baseIcSaIcEED2Ev(%"struct.std::_Vector_base.4"* %5)
  ret void

lpad:                                             ; preds = %invoke.cont, %entry
  %6 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %7 = extractvalue { i8*, i32 } %6, 0
  store i8* %7, i8** %exn.slot
  %8 = extractvalue { i8*, i32 } %6, 1
  store i32 %8, i32* %ehselector.slot
  %9 = bitcast %"class.std::vector.3"* %this1 to %"struct.std::_Vector_base.4"*
  invoke void @_ZNSt12_Vector_baseIcSaIcEED2Ev(%"struct.std::_Vector_base.4"* %9)
          to label %invoke.cont4 unwind label %terminate.lpad

invoke.cont4:                                     ; preds = %lpad
  br label %eh.resume

eh.resume:                                        ; preds = %invoke.cont4
  %exn = load i8** %exn.slot
  %sel = load i32* %ehselector.slot
  %lpad.val = insertvalue { i8*, i32 } undef, i8* %exn, 0
  %lpad.val5 = insertvalue { i8*, i32 } %lpad.val, i32 %sel, 1
  resume { i8*, i32 } %lpad.val5

terminate.lpad:                                   ; preds = %lpad
  %10 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          catch i8* null
  call void @_ZSt9terminatev() noreturn nounwind
  unreachable
}

define linkonce_odr void @_ZSt8_DestroyIPccEvT_S1_RSaIT0_E(i8* %__first, i8* %__last, %"class.std::allocator"*) inlinehint {
entry:
  %__first.addr = alloca i8*, align 4
  %__last.addr = alloca i8*, align 4
  %.addr = alloca %"class.std::allocator"*, align 4
  store i8* %__first, i8** %__first.addr, align 4
  store i8* %__last, i8** %__last.addr, align 4
  store %"class.std::allocator"* %0, %"class.std::allocator"** %.addr, align 4
  %1 = load i8** %__first.addr, align 4
  %2 = load i8** %__last.addr, align 4
  call void @_ZSt8_DestroyIPcEvT_S1_(i8* %1, i8* %2)
  ret void
}

define linkonce_odr %"class.std::allocator"* @_ZNSt12_Vector_baseIcSaIcEE19_M_get_Tp_allocatorEv(%"struct.std::_Vector_base.4"* %this) nounwind align 2 {
entry:
  %this.addr = alloca %"struct.std::_Vector_base.4"*, align 4
  store %"struct.std::_Vector_base.4"* %this, %"struct.std::_Vector_base.4"** %this.addr, align 4
  %this1 = load %"struct.std::_Vector_base.4"** %this.addr
  %_M_impl = getelementptr inbounds %"struct.std::_Vector_base.4"* %this1, i32 0, i32 0
  %0 = bitcast %"struct.std::_Vector_base<char, std::allocator<char> >::_Vector_impl"* %_M_impl to %"class.std::allocator"*
  ret %"class.std::allocator"* %0
}

define linkonce_odr void @_ZNSt12_Vector_baseIcSaIcEED2Ev(%"struct.std::_Vector_base.4"* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"struct.std::_Vector_base.4"*, align 4
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  store %"struct.std::_Vector_base.4"* %this, %"struct.std::_Vector_base.4"** %this.addr, align 4
  %this1 = load %"struct.std::_Vector_base.4"** %this.addr
  %_M_impl = getelementptr inbounds %"struct.std::_Vector_base.4"* %this1, i32 0, i32 0
  %_M_start = getelementptr inbounds %"struct.std::_Vector_base<char, std::allocator<char> >::_Vector_impl"* %_M_impl, i32 0, i32 0
  %0 = load i8** %_M_start, align 4
  %_M_impl2 = getelementptr inbounds %"struct.std::_Vector_base.4"* %this1, i32 0, i32 0
  %_M_end_of_storage = getelementptr inbounds %"struct.std::_Vector_base<char, std::allocator<char> >::_Vector_impl"* %_M_impl2, i32 0, i32 2
  %1 = load i8** %_M_end_of_storage, align 4
  %_M_impl3 = getelementptr inbounds %"struct.std::_Vector_base.4"* %this1, i32 0, i32 0
  %_M_start4 = getelementptr inbounds %"struct.std::_Vector_base<char, std::allocator<char> >::_Vector_impl"* %_M_impl3, i32 0, i32 0
  %2 = load i8** %_M_start4, align 4
  %sub.ptr.lhs.cast = ptrtoint i8* %1 to i32
  %sub.ptr.rhs.cast = ptrtoint i8* %2 to i32
  %sub.ptr.sub = sub i32 %sub.ptr.lhs.cast, %sub.ptr.rhs.cast
  invoke void @_ZNSt12_Vector_baseIcSaIcEE13_M_deallocateEPcj(%"struct.std::_Vector_base.4"* %this1, i8* %0, i32 %sub.ptr.sub)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %entry
  %_M_impl5 = getelementptr inbounds %"struct.std::_Vector_base.4"* %this1, i32 0, i32 0
  call void @_ZNSt12_Vector_baseIcSaIcEE12_Vector_implD1Ev(%"struct.std::_Vector_base<char, std::allocator<char> >::_Vector_impl"* %_M_impl5) nounwind
  ret void

lpad:                                             ; preds = %entry
  %3 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %4 = extractvalue { i8*, i32 } %3, 0
  store i8* %4, i8** %exn.slot
  %5 = extractvalue { i8*, i32 } %3, 1
  store i32 %5, i32* %ehselector.slot
  %_M_impl6 = getelementptr inbounds %"struct.std::_Vector_base.4"* %this1, i32 0, i32 0
  call void @_ZNSt12_Vector_baseIcSaIcEE12_Vector_implD1Ev(%"struct.std::_Vector_base<char, std::allocator<char> >::_Vector_impl"* %_M_impl6) nounwind
  br label %eh.resume

eh.resume:                                        ; preds = %lpad
  %exn = load i8** %exn.slot
  %sel = load i32* %ehselector.slot
  %lpad.val = insertvalue { i8*, i32 } undef, i8* %exn, 0
  %lpad.val7 = insertvalue { i8*, i32 } %lpad.val, i32 %sel, 1
  resume { i8*, i32 } %lpad.val7
}

define linkonce_odr void @_ZNSt12_Vector_baseIcSaIcEE13_M_deallocateEPcj(%"struct.std::_Vector_base.4"* %this, i8* %__p, i32 %__n) align 2 {
entry:
  %this.addr = alloca %"struct.std::_Vector_base.4"*, align 4
  %__p.addr = alloca i8*, align 4
  %__n.addr = alloca i32, align 4
  store %"struct.std::_Vector_base.4"* %this, %"struct.std::_Vector_base.4"** %this.addr, align 4
  store i8* %__p, i8** %__p.addr, align 4
  store i32 %__n, i32* %__n.addr, align 4
  %this1 = load %"struct.std::_Vector_base.4"** %this.addr
  %0 = load i8** %__p.addr, align 4
  %tobool = icmp ne i8* %0, null
  br i1 %tobool, label %if.then, label %if.end

if.then:                                          ; preds = %entry
  %_M_impl = getelementptr inbounds %"struct.std::_Vector_base.4"* %this1, i32 0, i32 0
  %1 = bitcast %"struct.std::_Vector_base<char, std::allocator<char> >::_Vector_impl"* %_M_impl to %"class.__gnu_cxx::new_allocator"*
  %2 = load i8** %__p.addr, align 4
  %3 = load i32* %__n.addr, align 4
  call void @_ZN9__gnu_cxx13new_allocatorIcE10deallocateEPcj(%"class.__gnu_cxx::new_allocator"* %1, i8* %2, i32 %3)
  br label %if.end

if.end:                                           ; preds = %if.then, %entry
  ret void
}

define linkonce_odr void @_ZNSt12_Vector_baseIcSaIcEE12_Vector_implD1Ev(%"struct.std::_Vector_base<char, std::allocator<char> >::_Vector_impl"* %this) unnamed_addr nounwind inlinehint align 2 {
entry:
  %this.addr = alloca %"struct.std::_Vector_base<char, std::allocator<char> >::_Vector_impl"*, align 4
  store %"struct.std::_Vector_base<char, std::allocator<char> >::_Vector_impl"* %this, %"struct.std::_Vector_base<char, std::allocator<char> >::_Vector_impl"** %this.addr, align 4
  %this1 = load %"struct.std::_Vector_base<char, std::allocator<char> >::_Vector_impl"** %this.addr
  call void @_ZNSt12_Vector_baseIcSaIcEE12_Vector_implD2Ev(%"struct.std::_Vector_base<char, std::allocator<char> >::_Vector_impl"* %this1) nounwind
  ret void
}

define linkonce_odr void @_ZNSt12_Vector_baseIcSaIcEE12_Vector_implD2Ev(%"struct.std::_Vector_base<char, std::allocator<char> >::_Vector_impl"* %this) unnamed_addr nounwind inlinehint align 2 {
entry:
  %this.addr = alloca %"struct.std::_Vector_base<char, std::allocator<char> >::_Vector_impl"*, align 4
  store %"struct.std::_Vector_base<char, std::allocator<char> >::_Vector_impl"* %this, %"struct.std::_Vector_base<char, std::allocator<char> >::_Vector_impl"** %this.addr, align 4
  %this1 = load %"struct.std::_Vector_base<char, std::allocator<char> >::_Vector_impl"** %this.addr
  %0 = bitcast %"struct.std::_Vector_base<char, std::allocator<char> >::_Vector_impl"* %this1 to %"class.std::allocator"*
  call void @_ZNSaIcED2Ev(%"class.std::allocator"* %0) nounwind
  ret void
}

declare void @_ZNSaIcED2Ev(%"class.std::allocator"*) nounwind

define linkonce_odr void @_ZN9__gnu_cxx13new_allocatorIcE10deallocateEPcj(%"class.__gnu_cxx::new_allocator"* %this, i8* %__p, i32) nounwind align 2 {
entry:
  %this.addr = alloca %"class.__gnu_cxx::new_allocator"*, align 4
  %__p.addr = alloca i8*, align 4
  %.addr = alloca i32, align 4
  store %"class.__gnu_cxx::new_allocator"* %this, %"class.__gnu_cxx::new_allocator"** %this.addr, align 4
  store i8* %__p, i8** %__p.addr, align 4
  store i32 %0, i32* %.addr, align 4
  %this1 = load %"class.__gnu_cxx::new_allocator"** %this.addr
  %1 = load i8** %__p.addr, align 4
  call void @_ZdlPv(i8* %1) nounwind
  ret void
}

define linkonce_odr void @_ZSt8_DestroyIPcEvT_S1_(i8* %__first, i8* %__last) inlinehint {
entry:
  %__first.addr = alloca i8*, align 4
  %__last.addr = alloca i8*, align 4
  store i8* %__first, i8** %__first.addr, align 4
  store i8* %__last, i8** %__last.addr, align 4
  %0 = load i8** %__first.addr, align 4
  %1 = load i8** %__last.addr, align 4
  call void @_ZNSt12_Destroy_auxILb1EE9__destroyIPcEEvT_S3_(i8* %0, i8* %1)
  ret void
}

define linkonce_odr void @_ZNSt12_Destroy_auxILb1EE9__destroyIPcEEvT_S3_(i8*, i8*) nounwind align 2 {
entry:
  %.addr = alloca i8*, align 4
  %.addr1 = alloca i8*, align 4
  store i8* %0, i8** %.addr, align 4
  store i8* %1, i8** %.addr1, align 4
  ret void
}

define linkonce_odr void @_ZN9__gnu_cxx17__normal_iteratorIPcSt6vectorIcSaIcEEEC1ERKS1_(%"class.__gnu_cxx::__normal_iterator.5"* %this, i8** %__i) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.__gnu_cxx::__normal_iterator.5"*, align 4
  %__i.addr = alloca i8**, align 4
  store %"class.__gnu_cxx::__normal_iterator.5"* %this, %"class.__gnu_cxx::__normal_iterator.5"** %this.addr, align 4
  store i8** %__i, i8*** %__i.addr, align 4
  %this1 = load %"class.__gnu_cxx::__normal_iterator.5"** %this.addr
  %0 = load i8*** %__i.addr
  call void @_ZN9__gnu_cxx17__normal_iteratorIPcSt6vectorIcSaIcEEEC2ERKS1_(%"class.__gnu_cxx::__normal_iterator.5"* %this1, i8** %0)
  ret void
}

define linkonce_odr void @_ZN9__gnu_cxx17__normal_iteratorIPcSt6vectorIcSaIcEEEC2ERKS1_(%"class.__gnu_cxx::__normal_iterator.5"* %this, i8** %__i) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.__gnu_cxx::__normal_iterator.5"*, align 4
  %__i.addr = alloca i8**, align 4
  store %"class.__gnu_cxx::__normal_iterator.5"* %this, %"class.__gnu_cxx::__normal_iterator.5"** %this.addr, align 4
  store i8** %__i, i8*** %__i.addr, align 4
  %this1 = load %"class.__gnu_cxx::__normal_iterator.5"** %this.addr
  %_M_current = getelementptr inbounds %"class.__gnu_cxx::__normal_iterator.5"* %this1, i32 0, i32 0
  %0 = load i8*** %__i.addr, align 4
  %1 = load i8** %0, align 4
  store i8* %1, i8** %_M_current, align 4
  ret void
}

define linkonce_odr i32 @_ZSt8distanceIN9__gnu_cxx17__normal_iteratorIPcSt6vectorIcSaIcEEEEENSt15iterator_traitsIT_E15difference_typeES8_S8_(%"class.__gnu_cxx::__normal_iterator.5"* byval align 4 %__first, %"class.__gnu_cxx::__normal_iterator.5"* byval align 4 %__last) inlinehint {
entry:
  %agg.tmp = alloca %"class.__gnu_cxx::__normal_iterator.5", align 4
  %agg.tmp1 = alloca %"class.__gnu_cxx::__normal_iterator.5", align 4
  %agg.tmp2 = alloca %"struct.std::random_access_iterator_tag", align 1
  %0 = bitcast %"class.__gnu_cxx::__normal_iterator.5"* %agg.tmp to i8*
  %1 = bitcast %"class.__gnu_cxx::__normal_iterator.5"* %__first to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %0, i8* %1, i32 4, i32 4, i1 false)
  %2 = bitcast %"class.__gnu_cxx::__normal_iterator.5"* %agg.tmp1 to i8*
  %3 = bitcast %"class.__gnu_cxx::__normal_iterator.5"* %__last to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %2, i8* %3, i32 4, i32 4, i1 false)
  call void @_ZSt19__iterator_categoryIN9__gnu_cxx17__normal_iteratorIPcSt6vectorIcSaIcEEEEENSt15iterator_traitsIT_E17iterator_categoryERKS8_(%"struct.std::random_access_iterator_tag"* sret %agg.tmp2, %"class.__gnu_cxx::__normal_iterator.5"* %__first)
  %call = call i32 @_ZSt10__distanceIN9__gnu_cxx17__normal_iteratorIPcSt6vectorIcSaIcEEEEENSt15iterator_traitsIT_E15difference_typeES8_S8_St26random_access_iterator_tag(%"class.__gnu_cxx::__normal_iterator.5"* byval align 4 %agg.tmp, %"class.__gnu_cxx::__normal_iterator.5"* byval align 4 %agg.tmp1)
  ret i32 %call
}

declare void @__assert_fail(i8*, i8*, i32, i8*) noreturn nounwind

define linkonce_odr i32 @_ZNKSt6vectorIiSaIiEE4sizeEv(%"class.std::vector"* %this) nounwind align 2 {
entry:
  %this.addr = alloca %"class.std::vector"*, align 4
  store %"class.std::vector"* %this, %"class.std::vector"** %this.addr, align 4
  %this1 = load %"class.std::vector"** %this.addr
  %0 = bitcast %"class.std::vector"* %this1 to %"struct.std::_Vector_base"*
  %_M_impl = getelementptr inbounds %"struct.std::_Vector_base"* %0, i32 0, i32 0
  %_M_finish = getelementptr inbounds %"struct.std::_Vector_base<int, std::allocator<int> >::_Vector_impl"* %_M_impl, i32 0, i32 1
  %1 = load i32** %_M_finish, align 4
  %2 = bitcast %"class.std::vector"* %this1 to %"struct.std::_Vector_base"*
  %_M_impl2 = getelementptr inbounds %"struct.std::_Vector_base"* %2, i32 0, i32 0
  %_M_start = getelementptr inbounds %"struct.std::_Vector_base<int, std::allocator<int> >::_Vector_impl"* %_M_impl2, i32 0, i32 0
  %3 = load i32** %_M_start, align 4
  %sub.ptr.lhs.cast = ptrtoint i32* %1 to i32
  %sub.ptr.rhs.cast = ptrtoint i32* %3 to i32
  %sub.ptr.sub = sub i32 %sub.ptr.lhs.cast, %sub.ptr.rhs.cast
  %sub.ptr.div = sdiv exact i32 %sub.ptr.sub, 4
  ret i32 %sub.ptr.div
}

define linkonce_odr i8* @_ZNK9__gnu_cxx17__normal_iteratorIPcSt6vectorIcSaIcEEEixERKi(%"class.__gnu_cxx::__normal_iterator.5"* %this, i32* %__n) nounwind align 2 {
entry:
  %this.addr = alloca %"class.__gnu_cxx::__normal_iterator.5"*, align 4
  %__n.addr = alloca i32*, align 4
  store %"class.__gnu_cxx::__normal_iterator.5"* %this, %"class.__gnu_cxx::__normal_iterator.5"** %this.addr, align 4
  store i32* %__n, i32** %__n.addr, align 4
  %this1 = load %"class.__gnu_cxx::__normal_iterator.5"** %this.addr
  %0 = load i32** %__n.addr, align 4
  %1 = load i32* %0, align 4
  %_M_current = getelementptr inbounds %"class.__gnu_cxx::__normal_iterator.5"* %this1, i32 0, i32 0
  %2 = load i8** %_M_current, align 4
  %arrayidx = getelementptr inbounds i8* %2, i32 %1
  ret i8* %arrayidx
}

define linkonce_odr i32 @_ZSt10__distanceIN9__gnu_cxx17__normal_iteratorIPcSt6vectorIcSaIcEEEEENSt15iterator_traitsIT_E15difference_typeES8_S8_St26random_access_iterator_tag(%"class.__gnu_cxx::__normal_iterator.5"* byval align 4 %__first, %"class.__gnu_cxx::__normal_iterator.5"* byval align 4 %__last) inlinehint {
entry:
  %0 = alloca %"struct.std::random_access_iterator_tag", align 1
  %call = call i32 @_ZN9__gnu_cxxmiIPcSt6vectorIcSaIcEEEENS_17__normal_iteratorIT_T0_E15difference_typeERKS8_SB_(%"class.__gnu_cxx::__normal_iterator.5"* %__last, %"class.__gnu_cxx::__normal_iterator.5"* %__first)
  ret i32 %call
}

define linkonce_odr void @_ZSt19__iterator_categoryIN9__gnu_cxx17__normal_iteratorIPcSt6vectorIcSaIcEEEEENSt15iterator_traitsIT_E17iterator_categoryERKS8_(%"struct.std::random_access_iterator_tag"* noalias sret %agg.result, %"class.__gnu_cxx::__normal_iterator.5"*) nounwind inlinehint {
entry:
  %.addr = alloca %"class.__gnu_cxx::__normal_iterator.5"*, align 4
  store %"class.__gnu_cxx::__normal_iterator.5"* %0, %"class.__gnu_cxx::__normal_iterator.5"** %.addr, align 4
  ret void
}

define linkonce_odr i32 @_ZN9__gnu_cxxmiIPcSt6vectorIcSaIcEEEENS_17__normal_iteratorIT_T0_E15difference_typeERKS8_SB_(%"class.__gnu_cxx::__normal_iterator.5"* %__lhs, %"class.__gnu_cxx::__normal_iterator.5"* %__rhs) inlinehint {
entry:
  %__lhs.addr = alloca %"class.__gnu_cxx::__normal_iterator.5"*, align 4
  %__rhs.addr = alloca %"class.__gnu_cxx::__normal_iterator.5"*, align 4
  store %"class.__gnu_cxx::__normal_iterator.5"* %__lhs, %"class.__gnu_cxx::__normal_iterator.5"** %__lhs.addr, align 4
  store %"class.__gnu_cxx::__normal_iterator.5"* %__rhs, %"class.__gnu_cxx::__normal_iterator.5"** %__rhs.addr, align 4
  %0 = load %"class.__gnu_cxx::__normal_iterator.5"** %__lhs.addr, align 4
  %call = call i8** @_ZNK9__gnu_cxx17__normal_iteratorIPcSt6vectorIcSaIcEEE4baseEv(%"class.__gnu_cxx::__normal_iterator.5"* %0)
  %1 = load i8** %call
  %2 = load %"class.__gnu_cxx::__normal_iterator.5"** %__rhs.addr, align 4
  %call1 = call i8** @_ZNK9__gnu_cxx17__normal_iteratorIPcSt6vectorIcSaIcEEE4baseEv(%"class.__gnu_cxx::__normal_iterator.5"* %2)
  %3 = load i8** %call1
  %sub.ptr.lhs.cast = ptrtoint i8* %1 to i32
  %sub.ptr.rhs.cast = ptrtoint i8* %3 to i32
  %sub.ptr.sub = sub i32 %sub.ptr.lhs.cast, %sub.ptr.rhs.cast
  ret i32 %sub.ptr.sub
}

define linkonce_odr i8** @_ZNK9__gnu_cxx17__normal_iteratorIPcSt6vectorIcSaIcEEE4baseEv(%"class.__gnu_cxx::__normal_iterator.5"* %this) nounwind align 2 {
entry:
  %this.addr = alloca %"class.__gnu_cxx::__normal_iterator.5"*, align 4
  store %"class.__gnu_cxx::__normal_iterator.5"* %this, %"class.__gnu_cxx::__normal_iterator.5"** %this.addr, align 4
  %this1 = load %"class.__gnu_cxx::__normal_iterator.5"** %this.addr
  %_M_current = getelementptr inbounds %"class.__gnu_cxx::__normal_iterator.5"* %this1, i32 0, i32 0
  ret i8** %_M_current
}

define linkonce_odr %"class.__gnu_cxx::__normal_iterator"* @_ZN9__gnu_cxx17__normal_iteratorIPKcSsEmmEv(%"class.__gnu_cxx::__normal_iterator"* %this) nounwind align 2 {
entry:
  %this.addr = alloca %"class.__gnu_cxx::__normal_iterator"*, align 4
  store %"class.__gnu_cxx::__normal_iterator"* %this, %"class.__gnu_cxx::__normal_iterator"** %this.addr, align 4
  %this1 = load %"class.__gnu_cxx::__normal_iterator"** %this.addr
  %_M_current = getelementptr inbounds %"class.__gnu_cxx::__normal_iterator"* %this1, i32 0, i32 0
  %0 = load i8** %_M_current, align 4
  %incdec.ptr = getelementptr inbounds i8* %0, i32 -1
  store i8* %incdec.ptr, i8** %_M_current, align 4
  ret %"class.__gnu_cxx::__normal_iterator"* %this1
}

define linkonce_odr i8* @_ZNK9__gnu_cxx17__normal_iteratorIPcSt6vectorIcSaIcEEEdeEv(%"class.__gnu_cxx::__normal_iterator.5"* %this) nounwind align 2 {
entry:
  %this.addr = alloca %"class.__gnu_cxx::__normal_iterator.5"*, align 4
  store %"class.__gnu_cxx::__normal_iterator.5"* %this, %"class.__gnu_cxx::__normal_iterator.5"** %this.addr, align 4
  %this1 = load %"class.__gnu_cxx::__normal_iterator.5"** %this.addr
  %_M_current = getelementptr inbounds %"class.__gnu_cxx::__normal_iterator.5"* %this1, i32 0, i32 0
  %0 = load i8** %_M_current, align 4
  ret i8* %0
}

define linkonce_odr %"class.__gnu_cxx::__normal_iterator.5"* @_ZN9__gnu_cxx17__normal_iteratorIPcSt6vectorIcSaIcEEEppEv(%"class.__gnu_cxx::__normal_iterator.5"* %this) nounwind align 2 {
entry:
  %this.addr = alloca %"class.__gnu_cxx::__normal_iterator.5"*, align 4
  store %"class.__gnu_cxx::__normal_iterator.5"* %this, %"class.__gnu_cxx::__normal_iterator.5"** %this.addr, align 4
  %this1 = load %"class.__gnu_cxx::__normal_iterator.5"** %this.addr
  %_M_current = getelementptr inbounds %"class.__gnu_cxx::__normal_iterator.5"* %this1, i32 0, i32 0
  %0 = load i8** %_M_current, align 4
  %incdec.ptr = getelementptr inbounds i8* %0, i32 1
  store i8* %incdec.ptr, i8** %_M_current, align 4
  ret %"class.__gnu_cxx::__normal_iterator.5"* %this1
}

define linkonce_odr void @_ZNSt6vectorIcSaIcEEC2EjRKcRKS0_(%"class.std::vector.3"* %this, i32 %__n, i8* %__value, %"class.std::allocator"* %__a) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.std::vector.3"*, align 4
  %__n.addr = alloca i32, align 4
  %__value.addr = alloca i8*, align 4
  %__a.addr = alloca %"class.std::allocator"*, align 4
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  store %"class.std::vector.3"* %this, %"class.std::vector.3"** %this.addr, align 4
  store i32 %__n, i32* %__n.addr, align 4
  store i8* %__value, i8** %__value.addr, align 4
  store %"class.std::allocator"* %__a, %"class.std::allocator"** %__a.addr, align 4
  %this1 = load %"class.std::vector.3"** %this.addr
  %0 = bitcast %"class.std::vector.3"* %this1 to %"struct.std::_Vector_base.4"*
  %1 = load i32* %__n.addr, align 4
  %2 = load %"class.std::allocator"** %__a.addr, align 4
  call void @_ZNSt12_Vector_baseIcSaIcEEC2EjRKS0_(%"struct.std::_Vector_base.4"* %0, i32 %1, %"class.std::allocator"* %2)
  %3 = load i32* %__n.addr, align 4
  %4 = load i8** %__value.addr, align 4
  invoke void @_ZNSt6vectorIcSaIcEE18_M_fill_initializeEjRKc(%"class.std::vector.3"* %this1, i32 %3, i8* %4)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %entry
  ret void

lpad:                                             ; preds = %entry
  %5 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %6 = extractvalue { i8*, i32 } %5, 0
  store i8* %6, i8** %exn.slot
  %7 = extractvalue { i8*, i32 } %5, 1
  store i32 %7, i32* %ehselector.slot
  %8 = bitcast %"class.std::vector.3"* %this1 to %"struct.std::_Vector_base.4"*
  invoke void @_ZNSt12_Vector_baseIcSaIcEED2Ev(%"struct.std::_Vector_base.4"* %8)
          to label %invoke.cont2 unwind label %terminate.lpad

invoke.cont2:                                     ; preds = %lpad
  br label %eh.resume

eh.resume:                                        ; preds = %invoke.cont2
  %exn = load i8** %exn.slot
  %sel = load i32* %ehselector.slot
  %lpad.val = insertvalue { i8*, i32 } undef, i8* %exn, 0
  %lpad.val3 = insertvalue { i8*, i32 } %lpad.val, i32 %sel, 1
  resume { i8*, i32 } %lpad.val3

terminate.lpad:                                   ; preds = %lpad
  %9 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          catch i8* null
  call void @_ZSt9terminatev() noreturn nounwind
  unreachable
}

define linkonce_odr void @_ZNSt12_Vector_baseIcSaIcEEC2EjRKS0_(%"struct.std::_Vector_base.4"* %this, i32 %__n, %"class.std::allocator"* %__a) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"struct.std::_Vector_base.4"*, align 4
  %__n.addr = alloca i32, align 4
  %__a.addr = alloca %"class.std::allocator"*, align 4
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  store %"struct.std::_Vector_base.4"* %this, %"struct.std::_Vector_base.4"** %this.addr, align 4
  store i32 %__n, i32* %__n.addr, align 4
  store %"class.std::allocator"* %__a, %"class.std::allocator"** %__a.addr, align 4
  %this1 = load %"struct.std::_Vector_base.4"** %this.addr
  %_M_impl = getelementptr inbounds %"struct.std::_Vector_base.4"* %this1, i32 0, i32 0
  %0 = load %"class.std::allocator"** %__a.addr, align 4
  call void @_ZNSt12_Vector_baseIcSaIcEE12_Vector_implC1ERKS0_(%"struct.std::_Vector_base<char, std::allocator<char> >::_Vector_impl"* %_M_impl, %"class.std::allocator"* %0)
  %1 = load i32* %__n.addr, align 4
  %call = invoke i8* @_ZNSt12_Vector_baseIcSaIcEE11_M_allocateEj(%"struct.std::_Vector_base.4"* %this1, i32 %1)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %entry
  %_M_impl2 = getelementptr inbounds %"struct.std::_Vector_base.4"* %this1, i32 0, i32 0
  %_M_start = getelementptr inbounds %"struct.std::_Vector_base<char, std::allocator<char> >::_Vector_impl"* %_M_impl2, i32 0, i32 0
  store i8* %call, i8** %_M_start, align 4
  %_M_impl3 = getelementptr inbounds %"struct.std::_Vector_base.4"* %this1, i32 0, i32 0
  %_M_start4 = getelementptr inbounds %"struct.std::_Vector_base<char, std::allocator<char> >::_Vector_impl"* %_M_impl3, i32 0, i32 0
  %2 = load i8** %_M_start4, align 4
  %_M_impl5 = getelementptr inbounds %"struct.std::_Vector_base.4"* %this1, i32 0, i32 0
  %_M_finish = getelementptr inbounds %"struct.std::_Vector_base<char, std::allocator<char> >::_Vector_impl"* %_M_impl5, i32 0, i32 1
  store i8* %2, i8** %_M_finish, align 4
  %_M_impl6 = getelementptr inbounds %"struct.std::_Vector_base.4"* %this1, i32 0, i32 0
  %_M_start7 = getelementptr inbounds %"struct.std::_Vector_base<char, std::allocator<char> >::_Vector_impl"* %_M_impl6, i32 0, i32 0
  %3 = load i8** %_M_start7, align 4
  %4 = load i32* %__n.addr, align 4
  %add.ptr = getelementptr inbounds i8* %3, i32 %4
  %_M_impl8 = getelementptr inbounds %"struct.std::_Vector_base.4"* %this1, i32 0, i32 0
  %_M_end_of_storage = getelementptr inbounds %"struct.std::_Vector_base<char, std::allocator<char> >::_Vector_impl"* %_M_impl8, i32 0, i32 2
  store i8* %add.ptr, i8** %_M_end_of_storage, align 4
  ret void

lpad:                                             ; preds = %entry
  %5 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %6 = extractvalue { i8*, i32 } %5, 0
  store i8* %6, i8** %exn.slot
  %7 = extractvalue { i8*, i32 } %5, 1
  store i32 %7, i32* %ehselector.slot
  call void @_ZNSt12_Vector_baseIcSaIcEE12_Vector_implD1Ev(%"struct.std::_Vector_base<char, std::allocator<char> >::_Vector_impl"* %_M_impl) nounwind
  br label %eh.resume

eh.resume:                                        ; preds = %lpad
  %exn = load i8** %exn.slot
  %sel = load i32* %ehselector.slot
  %lpad.val = insertvalue { i8*, i32 } undef, i8* %exn, 0
  %lpad.val9 = insertvalue { i8*, i32 } %lpad.val, i32 %sel, 1
  resume { i8*, i32 } %lpad.val9
}

define linkonce_odr void @_ZNSt6vectorIcSaIcEE18_M_fill_initializeEjRKc(%"class.std::vector.3"* %this, i32 %__n, i8* %__value) align 2 {
entry:
  %this.addr = alloca %"class.std::vector.3"*, align 4
  %__n.addr = alloca i32, align 4
  %__value.addr = alloca i8*, align 4
  store %"class.std::vector.3"* %this, %"class.std::vector.3"** %this.addr, align 4
  store i32 %__n, i32* %__n.addr, align 4
  store i8* %__value, i8** %__value.addr, align 4
  %this1 = load %"class.std::vector.3"** %this.addr
  %0 = bitcast %"class.std::vector.3"* %this1 to %"struct.std::_Vector_base.4"*
  %_M_impl = getelementptr inbounds %"struct.std::_Vector_base.4"* %0, i32 0, i32 0
  %_M_start = getelementptr inbounds %"struct.std::_Vector_base<char, std::allocator<char> >::_Vector_impl"* %_M_impl, i32 0, i32 0
  %1 = load i8** %_M_start, align 4
  %2 = load i32* %__n.addr, align 4
  %3 = load i8** %__value.addr, align 4
  %4 = bitcast %"class.std::vector.3"* %this1 to %"struct.std::_Vector_base.4"*
  %call = call %"class.std::allocator"* @_ZNSt12_Vector_baseIcSaIcEE19_M_get_Tp_allocatorEv(%"struct.std::_Vector_base.4"* %4)
  call void @_ZSt24__uninitialized_fill_n_aIPcjccEvT_T0_RKT1_RSaIT2_E(i8* %1, i32 %2, i8* %3, %"class.std::allocator"* %call)
  %5 = bitcast %"class.std::vector.3"* %this1 to %"struct.std::_Vector_base.4"*
  %_M_impl2 = getelementptr inbounds %"struct.std::_Vector_base.4"* %5, i32 0, i32 0
  %_M_end_of_storage = getelementptr inbounds %"struct.std::_Vector_base<char, std::allocator<char> >::_Vector_impl"* %_M_impl2, i32 0, i32 2
  %6 = load i8** %_M_end_of_storage, align 4
  %7 = bitcast %"class.std::vector.3"* %this1 to %"struct.std::_Vector_base.4"*
  %_M_impl3 = getelementptr inbounds %"struct.std::_Vector_base.4"* %7, i32 0, i32 0
  %_M_finish = getelementptr inbounds %"struct.std::_Vector_base<char, std::allocator<char> >::_Vector_impl"* %_M_impl3, i32 0, i32 1
  store i8* %6, i8** %_M_finish, align 4
  ret void
}

define linkonce_odr void @_ZSt24__uninitialized_fill_n_aIPcjccEvT_T0_RKT1_RSaIT2_E(i8* %__first, i32 %__n, i8* %__x, %"class.std::allocator"*) inlinehint {
entry:
  %__first.addr = alloca i8*, align 4
  %__n.addr = alloca i32, align 4
  %__x.addr = alloca i8*, align 4
  %.addr = alloca %"class.std::allocator"*, align 4
  store i8* %__first, i8** %__first.addr, align 4
  store i32 %__n, i32* %__n.addr, align 4
  store i8* %__x, i8** %__x.addr, align 4
  store %"class.std::allocator"* %0, %"class.std::allocator"** %.addr, align 4
  %1 = load i8** %__first.addr, align 4
  %2 = load i32* %__n.addr, align 4
  %3 = load i8** %__x.addr, align 4
  call void @_ZSt20uninitialized_fill_nIPcjcEvT_T0_RKT1_(i8* %1, i32 %2, i8* %3)
  ret void
}

define linkonce_odr void @_ZSt20uninitialized_fill_nIPcjcEvT_T0_RKT1_(i8* %__first, i32 %__n, i8* %__x) inlinehint {
entry:
  %__first.addr = alloca i8*, align 4
  %__n.addr = alloca i32, align 4
  %__x.addr = alloca i8*, align 4
  store i8* %__first, i8** %__first.addr, align 4
  store i32 %__n, i32* %__n.addr, align 4
  store i8* %__x, i8** %__x.addr, align 4
  %0 = load i8** %__first.addr, align 4
  %1 = load i32* %__n.addr, align 4
  %2 = load i8** %__x.addr, align 4
  call void @_ZNSt22__uninitialized_fill_nILb1EE15__uninit_fill_nIPcjcEEvT_T0_RKT1_(i8* %0, i32 %1, i8* %2)
  ret void
}

define linkonce_odr void @_ZNSt22__uninitialized_fill_nILb1EE15__uninit_fill_nIPcjcEEvT_T0_RKT1_(i8* %__first, i32 %__n, i8* %__x) align 2 {
entry:
  %__first.addr = alloca i8*, align 4
  %__n.addr = alloca i32, align 4
  %__x.addr = alloca i8*, align 4
  store i8* %__first, i8** %__first.addr, align 4
  store i32 %__n, i32* %__n.addr, align 4
  store i8* %__x, i8** %__x.addr, align 4
  %0 = load i8** %__first.addr, align 4
  %1 = load i32* %__n.addr, align 4
  %2 = load i8** %__x.addr, align 4
  %call = call i8* @_ZSt6fill_nIPcjcET_S1_T0_RKT1_(i8* %0, i32 %1, i8* %2)
  ret void
}

define linkonce_odr i8* @_ZSt6fill_nIPcjcET_S1_T0_RKT1_(i8* %__first, i32 %__n, i8* %__value) inlinehint {
entry:
  %__first.addr = alloca i8*, align 4
  %__n.addr = alloca i32, align 4
  %__value.addr = alloca i8*, align 4
  store i8* %__first, i8** %__first.addr, align 4
  store i32 %__n, i32* %__n.addr, align 4
  store i8* %__value, i8** %__value.addr, align 4
  %0 = load i8** %__first.addr, align 4
  %call = call i8* @_ZSt12__niter_baseIPcENSt11_Niter_baseIT_E13iterator_typeES2_(i8* %0)
  %1 = load i32* %__n.addr, align 4
  %2 = load i8** %__value.addr, align 4
  %call1 = call i8* @_ZSt10__fill_n_aIjcEN9__gnu_cxx11__enable_ifIXsr9__is_byteIT0_EE7__valueEPS2_E6__typeES3_T_RKS2_(i8* %call, i32 %1, i8* %2)
  ret i8* %call1
}

define linkonce_odr i8* @_ZSt10__fill_n_aIjcEN9__gnu_cxx11__enable_ifIXsr9__is_byteIT0_EE7__valueEPS2_E6__typeES3_T_RKS2_(i8* %__first, i32 %__n, i8* %__c) inlinehint {
entry:
  %__first.addr = alloca i8*, align 4
  %__n.addr = alloca i32, align 4
  %__c.addr = alloca i8*, align 4
  store i8* %__first, i8** %__first.addr, align 4
  store i32 %__n, i32* %__n.addr, align 4
  store i8* %__c, i8** %__c.addr, align 4
  %0 = load i8** %__first.addr, align 4
  %1 = load i8** %__first.addr, align 4
  %2 = load i32* %__n.addr, align 4
  %add.ptr = getelementptr inbounds i8* %1, i32 %2
  %3 = load i8** %__c.addr, align 4
  call void @_ZSt8__fill_aIcEN9__gnu_cxx11__enable_ifIXsr9__is_byteIT_EE7__valueEvE6__typeEPS2_S5_RKS2_(i8* %0, i8* %add.ptr, i8* %3)
  %4 = load i8** %__first.addr, align 4
  %5 = load i32* %__n.addr, align 4
  %add.ptr1 = getelementptr inbounds i8* %4, i32 %5
  ret i8* %add.ptr1
}

define linkonce_odr i8* @_ZSt12__niter_baseIPcENSt11_Niter_baseIT_E13iterator_typeES2_(i8* %__it) inlinehint {
entry:
  %__it.addr = alloca i8*, align 4
  store i8* %__it, i8** %__it.addr, align 4
  %0 = load i8** %__it.addr, align 4
  %call = call i8* @_ZNSt10_Iter_baseIPcLb0EE7_S_baseES0_(i8* %0)
  ret i8* %call
}

define linkonce_odr i8* @_ZNSt10_Iter_baseIPcLb0EE7_S_baseES0_(i8* %__it) nounwind align 2 {
entry:
  %__it.addr = alloca i8*, align 4
  store i8* %__it, i8** %__it.addr, align 4
  %0 = load i8** %__it.addr, align 4
  ret i8* %0
}

define linkonce_odr void @_ZSt8__fill_aIcEN9__gnu_cxx11__enable_ifIXsr9__is_byteIT_EE7__valueEvE6__typeEPS2_S5_RKS2_(i8* %__first, i8* %__last, i8* %__c) nounwind inlinehint {
entry:
  %__first.addr = alloca i8*, align 4
  %__last.addr = alloca i8*, align 4
  %__c.addr = alloca i8*, align 4
  %__tmp = alloca i8, align 1
  store i8* %__first, i8** %__first.addr, align 4
  store i8* %__last, i8** %__last.addr, align 4
  store i8* %__c, i8** %__c.addr, align 4
  %0 = load i8** %__c.addr, align 4
  %1 = load i8* %0, align 1
  store i8 %1, i8* %__tmp, align 1
  %2 = load i8** %__first.addr, align 4
  %3 = load i8* %__tmp, align 1
  %conv = zext i8 %3 to i32
  %4 = trunc i32 %conv to i8
  %5 = load i8** %__last.addr, align 4
  %6 = load i8** %__first.addr, align 4
  %sub.ptr.lhs.cast = ptrtoint i8* %5 to i32
  %sub.ptr.rhs.cast = ptrtoint i8* %6 to i32
  %sub.ptr.sub = sub i32 %sub.ptr.lhs.cast, %sub.ptr.rhs.cast
  call void @llvm.memset.p0i8.i32(i8* %2, i8 %4, i32 %sub.ptr.sub, i32 1, i1 false)
  ret void
}

declare void @llvm.memset.p0i8.i32(i8* nocapture, i8, i32, i32, i1) nounwind

define linkonce_odr void @_ZNSt12_Vector_baseIcSaIcEE12_Vector_implC1ERKS0_(%"struct.std::_Vector_base<char, std::allocator<char> >::_Vector_impl"* %this, %"class.std::allocator"* %__a) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"struct.std::_Vector_base<char, std::allocator<char> >::_Vector_impl"*, align 4
  %__a.addr = alloca %"class.std::allocator"*, align 4
  store %"struct.std::_Vector_base<char, std::allocator<char> >::_Vector_impl"* %this, %"struct.std::_Vector_base<char, std::allocator<char> >::_Vector_impl"** %this.addr, align 4
  store %"class.std::allocator"* %__a, %"class.std::allocator"** %__a.addr, align 4
  %this1 = load %"struct.std::_Vector_base<char, std::allocator<char> >::_Vector_impl"** %this.addr
  %0 = load %"class.std::allocator"** %__a.addr
  call void @_ZNSt12_Vector_baseIcSaIcEE12_Vector_implC2ERKS0_(%"struct.std::_Vector_base<char, std::allocator<char> >::_Vector_impl"* %this1, %"class.std::allocator"* %0)
  ret void
}

define linkonce_odr i8* @_ZNSt12_Vector_baseIcSaIcEE11_M_allocateEj(%"struct.std::_Vector_base.4"* %this, i32 %__n) align 2 {
entry:
  %this.addr = alloca %"struct.std::_Vector_base.4"*, align 4
  %__n.addr = alloca i32, align 4
  store %"struct.std::_Vector_base.4"* %this, %"struct.std::_Vector_base.4"** %this.addr, align 4
  store i32 %__n, i32* %__n.addr, align 4
  %this1 = load %"struct.std::_Vector_base.4"** %this.addr
  %0 = load i32* %__n.addr, align 4
  %cmp = icmp ne i32 %0, 0
  br i1 %cmp, label %cond.true, label %cond.false

cond.true:                                        ; preds = %entry
  %_M_impl = getelementptr inbounds %"struct.std::_Vector_base.4"* %this1, i32 0, i32 0
  %1 = bitcast %"struct.std::_Vector_base<char, std::allocator<char> >::_Vector_impl"* %_M_impl to %"class.__gnu_cxx::new_allocator"*
  %2 = load i32* %__n.addr, align 4
  %call = call i8* @_ZN9__gnu_cxx13new_allocatorIcE8allocateEjPKv(%"class.__gnu_cxx::new_allocator"* %1, i32 %2, i8* null)
  br label %cond.end

cond.false:                                       ; preds = %entry
  br label %cond.end

cond.end:                                         ; preds = %cond.false, %cond.true
  %cond = phi i8* [ %call, %cond.true ], [ null, %cond.false ]
  ret i8* %cond
}

define linkonce_odr i8* @_ZN9__gnu_cxx13new_allocatorIcE8allocateEjPKv(%"class.__gnu_cxx::new_allocator"* %this, i32 %__n, i8*) align 2 {
entry:
  %this.addr = alloca %"class.__gnu_cxx::new_allocator"*, align 4
  %__n.addr = alloca i32, align 4
  %.addr = alloca i8*, align 4
  store %"class.__gnu_cxx::new_allocator"* %this, %"class.__gnu_cxx::new_allocator"** %this.addr, align 4
  store i32 %__n, i32* %__n.addr, align 4
  store i8* %0, i8** %.addr, align 4
  %this1 = load %"class.__gnu_cxx::new_allocator"** %this.addr
  %1 = load i32* %__n.addr, align 4
  %call = call i32 @_ZNK9__gnu_cxx13new_allocatorIcE8max_sizeEv(%"class.__gnu_cxx::new_allocator"* %this1) nounwind
  %cmp = icmp ugt i32 %1, %call
  br i1 %cmp, label %if.then, label %if.end

if.then:                                          ; preds = %entry
  call void @_ZSt17__throw_bad_allocv() noreturn
  unreachable

if.end:                                           ; preds = %entry
  %2 = load i32* %__n.addr, align 4
  %mul = mul i32 %2, 1
  %call2 = call noalias i8* @_Znwj(i32 %mul)
  ret i8* %call2
}

define linkonce_odr i32 @_ZNK9__gnu_cxx13new_allocatorIcE8max_sizeEv(%"class.__gnu_cxx::new_allocator"* %this) nounwind align 2 {
entry:
  %this.addr = alloca %"class.__gnu_cxx::new_allocator"*, align 4
  store %"class.__gnu_cxx::new_allocator"* %this, %"class.__gnu_cxx::new_allocator"** %this.addr, align 4
  %this1 = load %"class.__gnu_cxx::new_allocator"** %this.addr
  ret i32 -1
}

define linkonce_odr void @_ZNSt12_Vector_baseIcSaIcEE12_Vector_implC2ERKS0_(%"struct.std::_Vector_base<char, std::allocator<char> >::_Vector_impl"* %this, %"class.std::allocator"* %__a) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"struct.std::_Vector_base<char, std::allocator<char> >::_Vector_impl"*, align 4
  %__a.addr = alloca %"class.std::allocator"*, align 4
  store %"struct.std::_Vector_base<char, std::allocator<char> >::_Vector_impl"* %this, %"struct.std::_Vector_base<char, std::allocator<char> >::_Vector_impl"** %this.addr, align 4
  store %"class.std::allocator"* %__a, %"class.std::allocator"** %__a.addr, align 4
  %this1 = load %"struct.std::_Vector_base<char, std::allocator<char> >::_Vector_impl"** %this.addr
  %0 = bitcast %"struct.std::_Vector_base<char, std::allocator<char> >::_Vector_impl"* %this1 to %"class.std::allocator"*
  %1 = load %"class.std::allocator"** %__a.addr, align 4
  call void @_ZNSaIcEC2ERKS_(%"class.std::allocator"* %0, %"class.std::allocator"* %1) nounwind
  %_M_start = getelementptr inbounds %"struct.std::_Vector_base<char, std::allocator<char> >::_Vector_impl"* %this1, i32 0, i32 0
  store i8* null, i8** %_M_start, align 4
  %_M_finish = getelementptr inbounds %"struct.std::_Vector_base<char, std::allocator<char> >::_Vector_impl"* %this1, i32 0, i32 1
  store i8* null, i8** %_M_finish, align 4
  %_M_end_of_storage = getelementptr inbounds %"struct.std::_Vector_base<char, std::allocator<char> >::_Vector_impl"* %this1, i32 0, i32 2
  store i8* null, i8** %_M_end_of_storage, align 4
  ret void
}

declare void @_ZNSaIcEC2ERKS_(%"class.std::allocator"*, %"class.std::allocator"*) nounwind

define internal void @_GLOBAL__I_a() section ".text.startup" {
entry:
  call void @__cxx_global_var_init()
  call void @__cxx_global_var_init1()
  call void @__cxx_global_var_init2()
  call void @__cxx_global_var_init4()
  ret void
}
