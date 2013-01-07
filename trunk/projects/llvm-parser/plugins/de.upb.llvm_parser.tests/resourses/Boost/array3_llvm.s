; ModuleID = 'array3.cpp'
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
%"class.boost::array" = type { [4 x %"class.std::basic_string"] }
%"class.std::basic_string" = type { %"struct.std::basic_string<char, std::char_traits<char>, std::allocator<char> >::_Alloc_hider" }
%"struct.std::basic_string<char, std::char_traits<char>, std::allocator<char> >::_Alloc_hider" = type { i8* }
%"class.std::allocator" = type { i8 }
%"class.std::reverse_iterator" = type { %"class.std::basic_string"* }
%"class.std::reverse_iterator.0" = type { %"class.std::basic_string"* }
%"struct.std::iterator.1" = type { i8 }
%"struct.std::iterator" = type { i8 }
%"class.std::out_of_range" = type { %"class.std::logic_error" }
%"class.std::logic_error" = type { %"class.std::exception", %"class.std::basic_string" }
%"class.std::exception" = type { i32 (...)** }
%"struct.boost::exception_detail::error_info_injector" = type { %"class.std::out_of_range", %"class.boost::exception" }
%"class.boost::exception" = type { i32 (...)**, %"class.boost::exception_detail::refcount_ptr", i8*, i8*, i32 }
%"class.boost::exception_detail::refcount_ptr" = type { %"struct.boost::exception_detail::error_info_container"* }
%"struct.boost::exception_detail::error_info_container" = type { i32 (...)** }
%"class.boost::exception_detail::clone_impl" = type { %"struct.boost::exception_detail::error_info_injector", %"class.boost::exception_detail::clone_base" }
%"class.boost::exception_detail::clone_base" = type { i32 (...)** }
%"struct.boost::exception_detail::clone_impl<boost::exception_detail::error_info_injector<std::out_of_range> >::clone_tag" = type { i8 }

@_ZStL8__ioinit = internal global %"class.std::ios_base::Init" zeroinitializer, align 1
@__dso_handle = external global i8
@.str = private unnamed_addr constant [7 x i8] c"spring\00", align 1
@.str1 = private unnamed_addr constant [7 x i8] c"summer\00", align 1
@.str2 = private unnamed_addr constant [7 x i8] c"autumn\00", align 1
@.str3 = private unnamed_addr constant [7 x i8] c"winter\00", align 1
@_ZSt4cout = external global %"class.std::basic_ostream"
@.str4 = private unnamed_addr constant [12 x i8] c"one way:   \00", align 1
@.str5 = private unnamed_addr constant [12 x i8] c"other way: \00", align 1
@.str6 = private unnamed_addr constant [12 x i8] c"reverse:   \00", align 1
@.str7 = private unnamed_addr constant [2 x i8] c" \00", align 1
@.str8 = private unnamed_addr constant [6 x i8] c"i < N\00", align 1
@.str9 = private unnamed_addr constant [13 x i8] c"out of range\00", align 1
@__PRETTY_FUNCTION__._ZNK5boost5arrayISsLj4EEixEj = private unnamed_addr constant [123 x i8] c"const_reference boost::array<std::basic_string<char>, 4>::operator[](size_type) const [T = std::basic_string<char>, N = 4]\00", align 1
@.str10 = private unnamed_addr constant [42 x i8] c"/home/thomas/boost_1_52_0/boost/array.hpp\00", align 1
@_ZSt4cerr = external global %"class.std::basic_ostream"
@.str11 = private unnamed_addr constant [43 x i8] c"***** Internal Program Error - assertion (\00", align 1
@.str12 = private unnamed_addr constant [13 x i8] c") failed in \00", align 1
@.str13 = private unnamed_addr constant [3 x i8] c":\0A\00", align 1
@.str14 = private unnamed_addr constant [4 x i8] c"): \00", align 1
@.str15 = private unnamed_addr constant [28 x i8] c"array<>: index out of range\00", align 1
@_ZTVN10__cxxabiv121__vmi_class_type_infoE = external global i8*
@_ZTSN5boost16exception_detail10clone_implINS0_19error_info_injectorISt12out_of_rangeEEEE = linkonce_odr constant [85 x i8] c"N5boost16exception_detail10clone_implINS0_19error_info_injectorISt12out_of_rangeEEEE\00"
@_ZTSN5boost16exception_detail19error_info_injectorISt12out_of_rangeEE = linkonce_odr constant [66 x i8] c"N5boost16exception_detail19error_info_injectorISt12out_of_rangeEE\00"
@_ZTISt12out_of_range = external constant i8*
@_ZTVN10__cxxabiv117__class_type_infoE = external global i8*
@_ZTSN5boost9exceptionE = linkonce_odr constant [19 x i8] c"N5boost9exceptionE\00"
@_ZTIN5boost9exceptionE = linkonce_odr unnamed_addr constant { i8*, i8* } { i8* bitcast (i8** getelementptr inbounds (i8** @_ZTVN10__cxxabiv117__class_type_infoE, i32 2) to i8*), i8* getelementptr inbounds ([19 x i8]* @_ZTSN5boost9exceptionE, i32 0, i32 0) }
@_ZTIN5boost16exception_detail19error_info_injectorISt12out_of_rangeEE = linkonce_odr unnamed_addr constant { i8*, i8*, i32, i32, i8*, i32, i8*, i32 } { i8* bitcast (i8** getelementptr inbounds (i8** @_ZTVN10__cxxabiv121__vmi_class_type_infoE, i32 2) to i8*), i8* getelementptr inbounds ([66 x i8]* @_ZTSN5boost16exception_detail19error_info_injectorISt12out_of_rangeEE, i32 0, i32 0), i32 0, i32 2, i8* bitcast (i8** @_ZTISt12out_of_range to i8*), i32 2, i8* bitcast ({ i8*, i8* }* @_ZTIN5boost9exceptionE to i8*), i32 2050 }
@_ZTSN5boost16exception_detail10clone_baseE = linkonce_odr constant [39 x i8] c"N5boost16exception_detail10clone_baseE\00"
@_ZTIN5boost16exception_detail10clone_baseE = linkonce_odr unnamed_addr constant { i8*, i8* } { i8* bitcast (i8** getelementptr inbounds (i8** @_ZTVN10__cxxabiv117__class_type_infoE, i32 2) to i8*), i8* getelementptr inbounds ([39 x i8]* @_ZTSN5boost16exception_detail10clone_baseE, i32 0, i32 0) }
@_ZTIN5boost16exception_detail10clone_implINS0_19error_info_injectorISt12out_of_rangeEEEE = linkonce_odr unnamed_addr constant { i8*, i8*, i32, i32, i8*, i32, i8*, i32 } { i8* bitcast (i8** getelementptr inbounds (i8** @_ZTVN10__cxxabiv121__vmi_class_type_infoE, i32 2) to i8*), i8* getelementptr inbounds ([85 x i8]* @_ZTSN5boost16exception_detail10clone_implINS0_19error_info_injectorISt12out_of_rangeEEEE, i32 0, i32 0), i32 0, i32 2, i8* bitcast ({ i8*, i8*, i32, i32, i8*, i32, i8*, i32 }* @_ZTIN5boost16exception_detail19error_info_injectorISt12out_of_rangeEE to i8*), i32 2, i8* bitcast ({ i8*, i8* }* @_ZTIN5boost16exception_detail10clone_baseE to i8*), i32 -3069 }
@_ZTVN5boost9exceptionE = linkonce_odr unnamed_addr constant [4 x i8*] [i8* null, i8* bitcast ({ i8*, i8* }* @_ZTIN5boost9exceptionE to i8*), i8* bitcast (void ()* @__cxa_pure_virtual to i8*), i8* bitcast (void ()* @__cxa_pure_virtual to i8*)]
@_ZTVN5boost16exception_detail10clone_implINS0_19error_info_injectorISt12out_of_rangeEEEE = linkonce_odr unnamed_addr constant [21 x i8*] [i8* inttoptr (i32 28 to i8*), i8* null, i8* bitcast ({ i8*, i8*, i32, i32, i8*, i32, i8*, i32 }* @_ZTIN5boost16exception_detail10clone_implINS0_19error_info_injectorISt12out_of_rangeEEEE to i8*), i8* bitcast (void (%"class.boost::exception_detail::clone_impl"*)* @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorISt12out_of_rangeEEED1Ev to i8*), i8* bitcast (void (%"class.boost::exception_detail::clone_impl"*)* @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorISt12out_of_rangeEEED0Ev to i8*), i8* bitcast (i8* (%"class.std::logic_error"*)* @_ZNKSt11logic_error4whatEv to i8*), i8* bitcast (%"class.boost::exception_detail::clone_base"* (%"class.boost::exception_detail::clone_impl"*)* @_ZNK5boost16exception_detail10clone_implINS0_19error_info_injectorISt12out_of_rangeEEE5cloneEv to i8*), i8* bitcast (void (%"class.boost::exception_detail::clone_impl"*)* @_ZNK5boost16exception_detail10clone_implINS0_19error_info_injectorISt12out_of_rangeEEE7rethrowEv to i8*), i8* inttoptr (i32 -8 to i8*), i8* bitcast ({ i8*, i8*, i32, i32, i8*, i32, i8*, i32 }* @_ZTIN5boost16exception_detail10clone_implINS0_19error_info_injectorISt12out_of_rangeEEEE to i8*), i8* bitcast (void (%"class.boost::exception_detail::clone_impl"*)* @_ZThn8_N5boost16exception_detail10clone_implINS0_19error_info_injectorISt12out_of_rangeEEED1Ev to i8*), i8* bitcast (void (%"class.boost::exception_detail::clone_impl"*)* @_ZThn8_N5boost16exception_detail10clone_implINS0_19error_info_injectorISt12out_of_rangeEEED0Ev to i8*), i8* inttoptr (i32 -28 to i8*), i8* inttoptr (i32 -28 to i8*), i8* inttoptr (i32 -28 to i8*), i8* inttoptr (i32 -28 to i8*), i8* bitcast ({ i8*, i8*, i32, i32, i8*, i32, i8*, i32 }* @_ZTIN5boost16exception_detail10clone_implINS0_19error_info_injectorISt12out_of_rangeEEEE to i8*), i8* bitcast (%"class.boost::exception_detail::clone_base"* (%"class.boost::exception_detail::clone_impl"*)* @_ZTv0_n12_NK5boost16exception_detail10clone_implINS0_19error_info_injectorISt12out_of_rangeEEE5cloneEv to i8*), i8* bitcast (void (%"class.boost::exception_detail::clone_impl"*)* @_ZTv0_n16_NK5boost16exception_detail10clone_implINS0_19error_info_injectorISt12out_of_rangeEEE7rethrowEv to i8*), i8* bitcast (void (%"class.boost::exception_detail::clone_impl"*)* @_ZTv0_n20_N5boost16exception_detail10clone_implINS0_19error_info_injectorISt12out_of_rangeEEED1Ev to i8*), i8* bitcast (void (%"class.boost::exception_detail::clone_impl"*)* @_ZTv0_n20_N5boost16exception_detail10clone_implINS0_19error_info_injectorISt12out_of_rangeEEED0Ev to i8*)]
@_ZTTN5boost16exception_detail10clone_implINS0_19error_info_injectorISt12out_of_rangeEEEE = linkonce_odr unnamed_addr constant [2 x i8*] [i8* bitcast (i8** getelementptr inbounds ([21 x i8*]* @_ZTVN5boost16exception_detail10clone_implINS0_19error_info_injectorISt12out_of_rangeEEEE, i64 0, i64 3) to i8*), i8* bitcast (i8** getelementptr inbounds ([21 x i8*]* @_ZTVN5boost16exception_detail10clone_implINS0_19error_info_injectorISt12out_of_rangeEEEE, i64 0, i64 17) to i8*)]
@_ZTVN5boost16exception_detail19error_info_injectorISt12out_of_rangeEE = linkonce_odr unnamed_addr constant [9 x i8*] [i8* null, i8* bitcast ({ i8*, i8*, i32, i32, i8*, i32, i8*, i32 }* @_ZTIN5boost16exception_detail19error_info_injectorISt12out_of_rangeEE to i8*), i8* bitcast (void (%"struct.boost::exception_detail::error_info_injector"*)* @_ZN5boost16exception_detail19error_info_injectorISt12out_of_rangeED1Ev to i8*), i8* bitcast (void (%"struct.boost::exception_detail::error_info_injector"*)* @_ZN5boost16exception_detail19error_info_injectorISt12out_of_rangeED0Ev to i8*), i8* bitcast (i8* (%"class.std::logic_error"*)* @_ZNKSt11logic_error4whatEv to i8*), i8* inttoptr (i32 -8 to i8*), i8* bitcast ({ i8*, i8*, i32, i32, i8*, i32, i8*, i32 }* @_ZTIN5boost16exception_detail19error_info_injectorISt12out_of_rangeEE to i8*), i8* bitcast (void (%"struct.boost::exception_detail::error_info_injector"*)* @_ZThn8_N5boost16exception_detail19error_info_injectorISt12out_of_rangeED1Ev to i8*), i8* bitcast (void (%"struct.boost::exception_detail::error_info_injector"*)* @_ZThn8_N5boost16exception_detail19error_info_injectorISt12out_of_rangeED0Ev to i8*)]
@_ZTVSt12out_of_range = external unnamed_addr constant [5 x i8*]
@_ZTVSt11logic_error = external unnamed_addr constant [5 x i8*]
@_ZTVSt9exception = external unnamed_addr constant [5 x i8*]
@_ZTVN5boost16exception_detail10clone_baseE = linkonce_odr unnamed_addr constant [6 x i8*] [i8* null, i8* bitcast ({ i8*, i8* }* @_ZTIN5boost16exception_detail10clone_baseE to i8*), i8* bitcast (void ()* @__cxa_pure_virtual to i8*), i8* bitcast (void ()* @__cxa_pure_virtual to i8*), i8* bitcast (void (%"class.boost::exception_detail::clone_base"*)* @_ZN5boost16exception_detail10clone_baseD1Ev to i8*), i8* bitcast (void (%"class.boost::exception_detail::clone_base"*)* @_ZN5boost16exception_detail10clone_baseD0Ev to i8*)]
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

define i32 @main() {
entry:
  %retval = alloca i32, align 4
  %seasons = alloca %"class.boost::array", align 4
  %arrayinit.endOfInit = alloca %"class.std::basic_string"*
  %ref.tmp = alloca %"class.std::allocator", align 1
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  %ref.tmp1 = alloca %"class.std::allocator", align 1
  %ref.tmp5 = alloca %"class.std::allocator", align 1
  %ref.tmp9 = alloca %"class.std::allocator", align 1
  %cleanup.isactive = alloca i1
  %seasons_orig = alloca %"class.boost::array", align 4
  %i = alloca i32, align 4
  %pos = alloca %"class.std::reverse_iterator", align 4
  %ref.tmp39 = alloca %"class.std::reverse_iterator", align 4
  %pos56 = alloca %"class.std::reverse_iterator.0", align 4
  %ref.tmp59 = alloca %"class.std::reverse_iterator.0", align 4
  %cleanup.dest.slot = alloca i32
  store i32 0, i32* %retval
  %elems = getelementptr inbounds %"class.boost::array"* %seasons, i32 0, i32 0
  %arrayinit.begin = getelementptr inbounds [4 x %"class.std::basic_string"]* %elems, i32 0, i32 0
  store i1 true, i1* %cleanup.isactive
  store %"class.std::basic_string"* %arrayinit.begin, %"class.std::basic_string"** %arrayinit.endOfInit
  call void @_ZNSaIcEC1Ev(%"class.std::allocator"* %ref.tmp) nounwind
  invoke void @_ZNSsC1EPKcRKSaIcE(%"class.std::basic_string"* %arrayinit.begin, i8* getelementptr inbounds ([7 x i8]* @.str, i32 0, i32 0), %"class.std::allocator"* %ref.tmp)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %entry
  %arrayinit.element = getelementptr inbounds %"class.std::basic_string"* %arrayinit.begin, i32 1
  store %"class.std::basic_string"* %arrayinit.element, %"class.std::basic_string"** %arrayinit.endOfInit
  call void @_ZNSaIcEC1Ev(%"class.std::allocator"* %ref.tmp1) nounwind
  invoke void @_ZNSsC1EPKcRKSaIcE(%"class.std::basic_string"* %arrayinit.element, i8* getelementptr inbounds ([7 x i8]* @.str1, i32 0, i32 0), %"class.std::allocator"* %ref.tmp1)
          to label %invoke.cont3 unwind label %lpad2

invoke.cont3:                                     ; preds = %invoke.cont
  %arrayinit.element4 = getelementptr inbounds %"class.std::basic_string"* %arrayinit.element, i32 1
  store %"class.std::basic_string"* %arrayinit.element4, %"class.std::basic_string"** %arrayinit.endOfInit
  call void @_ZNSaIcEC1Ev(%"class.std::allocator"* %ref.tmp5) nounwind
  invoke void @_ZNSsC1EPKcRKSaIcE(%"class.std::basic_string"* %arrayinit.element4, i8* getelementptr inbounds ([7 x i8]* @.str2, i32 0, i32 0), %"class.std::allocator"* %ref.tmp5)
          to label %invoke.cont7 unwind label %lpad6

invoke.cont7:                                     ; preds = %invoke.cont3
  %arrayinit.element8 = getelementptr inbounds %"class.std::basic_string"* %arrayinit.element4, i32 1
  store %"class.std::basic_string"* %arrayinit.element8, %"class.std::basic_string"** %arrayinit.endOfInit
  call void @_ZNSaIcEC1Ev(%"class.std::allocator"* %ref.tmp9) nounwind
  invoke void @_ZNSsC1EPKcRKSaIcE(%"class.std::basic_string"* %arrayinit.element8, i8* getelementptr inbounds ([7 x i8]* @.str3, i32 0, i32 0), %"class.std::allocator"* %ref.tmp9)
          to label %invoke.cont11 unwind label %lpad10

invoke.cont11:                                    ; preds = %invoke.cont7
  store i1 false, i1* %cleanup.isactive
  call void @_ZNSaIcED1Ev(%"class.std::allocator"* %ref.tmp9) nounwind
  call void @_ZNSaIcED1Ev(%"class.std::allocator"* %ref.tmp5) nounwind
  call void @_ZNSaIcED1Ev(%"class.std::allocator"* %ref.tmp1) nounwind
  call void @_ZNSaIcED1Ev(%"class.std::allocator"* %ref.tmp) nounwind
  invoke void @_ZN5boost5arrayISsLj4EEC1ERKS1_(%"class.boost::array"* %seasons_orig, %"class.boost::array"* %seasons)
          to label %invoke.cont18 unwind label %lpad17

invoke.cont18:                                    ; preds = %invoke.cont11
  %call = invoke i32 @_ZN5boost5arrayISsLj4EE4sizeEv()
          to label %invoke.cont20 unwind label %lpad19

invoke.cont20:                                    ; preds = %invoke.cont18
  %sub = sub i32 %call, 1
  store i32 %sub, i32* %i, align 4
  br label %for.cond

for.cond:                                         ; preds = %for.inc, %invoke.cont20
  %0 = load i32* %i, align 4
  %cmp = icmp ugt i32 %0, 0
  br i1 %cmp, label %for.body, label %for.end

for.body:                                         ; preds = %for.cond
  %1 = load i32* %i, align 4
  %call22 = invoke %"class.std::basic_string"* @_ZN5boost5arrayISsLj4EE2atEj(%"class.boost::array"* %seasons, i32 %1)
          to label %invoke.cont21 unwind label %lpad19

invoke.cont21:                                    ; preds = %for.body
  %2 = load i32* %i, align 4
  %add = add i32 %2, 1
  %call24 = invoke i32 @_ZN5boost5arrayISsLj4EE4sizeEv()
          to label %invoke.cont23 unwind label %lpad19

invoke.cont23:                                    ; preds = %invoke.cont21
  %rem = urem i32 %add, %call24
  %call26 = invoke %"class.std::basic_string"* @_ZN5boost5arrayISsLj4EE2atEj(%"class.boost::array"* %seasons, i32 %rem)
          to label %invoke.cont25 unwind label %lpad19

invoke.cont25:                                    ; preds = %invoke.cont23
  invoke void @_ZSt4swapIcSt11char_traitsIcESaIcEEvRSbIT_T0_T1_ES7_(%"class.std::basic_string"* %call22, %"class.std::basic_string"* %call26)
          to label %invoke.cont27 unwind label %lpad19

invoke.cont27:                                    ; preds = %invoke.cont25
  br label %for.inc

for.inc:                                          ; preds = %invoke.cont27
  %3 = load i32* %i, align 4
  %dec = add i32 %3, -1
  store i32 %dec, i32* %i, align 4
  br label %for.cond

lpad:                                             ; preds = %entry
  %4 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %5 = extractvalue { i8*, i32 } %4, 0
  store i8* %5, i8** %exn.slot
  %6 = extractvalue { i8*, i32 } %4, 1
  store i32 %6, i32* %ehselector.slot
  br label %ehcleanup13

lpad2:                                            ; preds = %invoke.cont
  %7 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %8 = extractvalue { i8*, i32 } %7, 0
  store i8* %8, i8** %exn.slot
  %9 = extractvalue { i8*, i32 } %7, 1
  store i32 %9, i32* %ehselector.slot
  br label %ehcleanup12

lpad6:                                            ; preds = %invoke.cont3
  %10 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %11 = extractvalue { i8*, i32 } %10, 0
  store i8* %11, i8** %exn.slot
  %12 = extractvalue { i8*, i32 } %10, 1
  store i32 %12, i32* %ehselector.slot
  br label %ehcleanup

lpad10:                                           ; preds = %invoke.cont7
  %13 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %14 = extractvalue { i8*, i32 } %13, 0
  store i8* %14, i8** %exn.slot
  %15 = extractvalue { i8*, i32 } %13, 1
  store i32 %15, i32* %ehselector.slot
  call void @_ZNSaIcED1Ev(%"class.std::allocator"* %ref.tmp9) nounwind
  br label %ehcleanup

ehcleanup:                                        ; preds = %lpad10, %lpad6
  call void @_ZNSaIcED1Ev(%"class.std::allocator"* %ref.tmp5) nounwind
  br label %ehcleanup12

ehcleanup12:                                      ; preds = %ehcleanup, %lpad2
  call void @_ZNSaIcED1Ev(%"class.std::allocator"* %ref.tmp1) nounwind
  br label %ehcleanup13

ehcleanup13:                                      ; preds = %ehcleanup12, %lpad
  call void @_ZNSaIcED1Ev(%"class.std::allocator"* %ref.tmp) nounwind
  %cleanup.is_active = load i1* %cleanup.isactive
  br i1 %cleanup.is_active, label %cleanup.action, label %cleanup.done

cleanup.action:                                   ; preds = %ehcleanup13
  %16 = load %"class.std::basic_string"** %arrayinit.endOfInit
  %arraydestroy.isempty = icmp eq %"class.std::basic_string"* %arrayinit.begin, %16
  br i1 %arraydestroy.isempty, label %arraydestroy.done16, label %arraydestroy.body

arraydestroy.body:                                ; preds = %invoke.cont15, %cleanup.action
  %arraydestroy.elementPast = phi %"class.std::basic_string"* [ %16, %cleanup.action ], [ %arraydestroy.element, %invoke.cont15 ]
  %arraydestroy.element = getelementptr inbounds %"class.std::basic_string"* %arraydestroy.elementPast, i32 -1
  invoke void @_ZNSsD1Ev(%"class.std::basic_string"* %arraydestroy.element)
          to label %invoke.cont15 unwind label %terminate.lpad

invoke.cont15:                                    ; preds = %arraydestroy.body
  %arraydestroy.done = icmp eq %"class.std::basic_string"* %arraydestroy.element, %arrayinit.begin
  br i1 %arraydestroy.done, label %arraydestroy.done16, label %arraydestroy.body

arraydestroy.done16:                              ; preds = %invoke.cont15, %cleanup.action
  br label %cleanup.done

cleanup.done:                                     ; preds = %arraydestroy.done16, %ehcleanup13
  br label %eh.resume

lpad17:                                           ; preds = %invoke.cont74, %invoke.cont11
  %17 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %18 = extractvalue { i8*, i32 } %17, 0
  store i8* %18, i8** %exn.slot
  %19 = extractvalue { i8*, i32 } %17, 1
  store i32 %19, i32* %ehselector.slot
  br label %ehcleanup79

lpad19:                                           ; preds = %for.end73, %for.inc70, %invoke.cont66, %invoke.cont64, %for.body63, %invoke.cont60, %for.cond58, %invoke.cont54, %for.end53, %for.inc50, %invoke.cont46, %invoke.cont44, %for.body43, %invoke.cont40, %for.cond38, %invoke.cont35, %invoke.cont34, %invoke.cont33, %invoke.cont31, %invoke.cont30, %invoke.cont28, %for.end, %invoke.cont25, %invoke.cont23, %invoke.cont21, %for.body, %invoke.cont18
  %20 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %21 = extractvalue { i8*, i32 } %20, 0
  store i8* %21, i8** %exn.slot
  %22 = extractvalue { i8*, i32 } %20, 1
  store i32 %22, i32* %ehselector.slot
  invoke void @_ZN5boost5arrayISsLj4EED1Ev(%"class.boost::array"* %seasons_orig)
          to label %invoke.cont78 unwind label %terminate.lpad

for.end:                                          ; preds = %for.cond
  %call29 = invoke %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* @_ZSt4cout, i8* getelementptr inbounds ([12 x i8]* @.str4, i32 0, i32 0))
          to label %invoke.cont28 unwind label %lpad19

invoke.cont28:                                    ; preds = %for.end
  invoke void @_Z14print_elementsIN5boost5arrayISsLj4EEEEvRKT_(%"class.boost::array"* %seasons)
          to label %invoke.cont30 unwind label %lpad19

invoke.cont30:                                    ; preds = %invoke.cont28
  %call32 = invoke %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* @_ZSt4cout, i8* getelementptr inbounds ([12 x i8]* @.str5, i32 0, i32 0))
          to label %invoke.cont31 unwind label %lpad19

invoke.cont31:                                    ; preds = %invoke.cont30
  invoke void @_ZSt4swapIN5boost5arrayISsLj4EEEEvRT_S4_(%"class.boost::array"* %seasons, %"class.boost::array"* %seasons_orig)
          to label %invoke.cont33 unwind label %lpad19

invoke.cont33:                                    ; preds = %invoke.cont31
  invoke void @_Z14print_elementsIN5boost5arrayISsLj4EEEEvRKT_(%"class.boost::array"* %seasons)
          to label %invoke.cont34 unwind label %lpad19

invoke.cont34:                                    ; preds = %invoke.cont33
  %call36 = invoke %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* @_ZSt4cout, i8* getelementptr inbounds ([12 x i8]* @.str6, i32 0, i32 0))
          to label %invoke.cont35 unwind label %lpad19

invoke.cont35:                                    ; preds = %invoke.cont34
  invoke void @_ZN5boost5arrayISsLj4EE6rbeginEv(%"class.std::reverse_iterator"* sret %pos, %"class.boost::array"* %seasons)
          to label %invoke.cont37 unwind label %lpad19

invoke.cont37:                                    ; preds = %invoke.cont35
  br label %for.cond38

for.cond38:                                       ; preds = %invoke.cont51, %invoke.cont37
  invoke void @_ZN5boost5arrayISsLj4EE4rendEv(%"class.std::reverse_iterator"* sret %ref.tmp39, %"class.boost::array"* %seasons)
          to label %invoke.cont40 unwind label %lpad19

invoke.cont40:                                    ; preds = %for.cond38
  %call42 = invoke zeroext i1 @_ZStltIPSsEbRKSt16reverse_iteratorIT_ES5_(%"class.std::reverse_iterator"* %pos, %"class.std::reverse_iterator"* %ref.tmp39)
          to label %invoke.cont41 unwind label %lpad19

invoke.cont41:                                    ; preds = %invoke.cont40
  br i1 %call42, label %for.body43, label %for.end53

for.body43:                                       ; preds = %invoke.cont41
  %call45 = invoke %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* @_ZSt4cout, i8* getelementptr inbounds ([2 x i8]* @.str7, i32 0, i32 0))
          to label %invoke.cont44 unwind label %lpad19

invoke.cont44:                                    ; preds = %for.body43
  %call47 = invoke %"class.std::basic_string"* @_ZNKSt16reverse_iteratorIPSsEdeEv(%"class.std::reverse_iterator"* %pos)
          to label %invoke.cont46 unwind label %lpad19

invoke.cont46:                                    ; preds = %invoke.cont44
  %call49 = invoke %"class.std::basic_ostream"* @_ZStlsIcSt11char_traitsIcESaIcEERSt13basic_ostreamIT_T0_ES7_RKSbIS4_S5_T1_E(%"class.std::basic_ostream"* %call45, %"class.std::basic_string"* %call47)
          to label %invoke.cont48 unwind label %lpad19

invoke.cont48:                                    ; preds = %invoke.cont46
  br label %for.inc50

for.inc50:                                        ; preds = %invoke.cont48
  %call52 = invoke %"class.std::reverse_iterator"* @_ZNSt16reverse_iteratorIPSsEppEv(%"class.std::reverse_iterator"* %pos)
          to label %invoke.cont51 unwind label %lpad19

invoke.cont51:                                    ; preds = %for.inc50
  br label %for.cond38

for.end53:                                        ; preds = %invoke.cont41
  %call55 = invoke %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* @_ZSt4cout, i8* getelementptr inbounds ([12 x i8]* @.str6, i32 0, i32 0))
          to label %invoke.cont54 unwind label %lpad19

invoke.cont54:                                    ; preds = %for.end53
  invoke void @_ZNK5boost5arrayISsLj4EE7crbeginEv(%"class.std::reverse_iterator.0"* sret %pos56, %"class.boost::array"* %seasons)
          to label %invoke.cont57 unwind label %lpad19

invoke.cont57:                                    ; preds = %invoke.cont54
  br label %for.cond58

for.cond58:                                       ; preds = %invoke.cont71, %invoke.cont57
  invoke void @_ZNK5boost5arrayISsLj4EE5crendEv(%"class.std::reverse_iterator.0"* sret %ref.tmp59, %"class.boost::array"* %seasons)
          to label %invoke.cont60 unwind label %lpad19

invoke.cont60:                                    ; preds = %for.cond58
  %call62 = invoke zeroext i1 @_ZStltIPKSsEbRKSt16reverse_iteratorIT_ES6_(%"class.std::reverse_iterator.0"* %pos56, %"class.std::reverse_iterator.0"* %ref.tmp59)
          to label %invoke.cont61 unwind label %lpad19

invoke.cont61:                                    ; preds = %invoke.cont60
  br i1 %call62, label %for.body63, label %for.end73

for.body63:                                       ; preds = %invoke.cont61
  %call65 = invoke %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* @_ZSt4cout, i8* getelementptr inbounds ([2 x i8]* @.str7, i32 0, i32 0))
          to label %invoke.cont64 unwind label %lpad19

invoke.cont64:                                    ; preds = %for.body63
  %call67 = invoke %"class.std::basic_string"* @_ZNKSt16reverse_iteratorIPKSsEdeEv(%"class.std::reverse_iterator.0"* %pos56)
          to label %invoke.cont66 unwind label %lpad19

invoke.cont66:                                    ; preds = %invoke.cont64
  %call69 = invoke %"class.std::basic_ostream"* @_ZStlsIcSt11char_traitsIcESaIcEERSt13basic_ostreamIT_T0_ES7_RKSbIS4_S5_T1_E(%"class.std::basic_ostream"* %call65, %"class.std::basic_string"* %call67)
          to label %invoke.cont68 unwind label %lpad19

invoke.cont68:                                    ; preds = %invoke.cont66
  br label %for.inc70

for.inc70:                                        ; preds = %invoke.cont68
  %call72 = invoke %"class.std::reverse_iterator.0"* @_ZNSt16reverse_iteratorIPKSsEppEv(%"class.std::reverse_iterator.0"* %pos56)
          to label %invoke.cont71 unwind label %lpad19

invoke.cont71:                                    ; preds = %for.inc70
  br label %for.cond58

for.end73:                                        ; preds = %invoke.cont61
  %call75 = invoke %"class.std::basic_ostream"* @_ZNSolsEPFRSoS_E(%"class.std::basic_ostream"* @_ZSt4cout, %"class.std::basic_ostream"* (%"class.std::basic_ostream"*)* @_ZSt4endlIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_)
          to label %invoke.cont74 unwind label %lpad19

invoke.cont74:                                    ; preds = %for.end73
  store i32 0, i32* %retval
  store i32 1, i32* %cleanup.dest.slot
  invoke void @_ZN5boost5arrayISsLj4EED1Ev(%"class.boost::array"* %seasons_orig)
          to label %invoke.cont76 unwind label %lpad17

invoke.cont76:                                    ; preds = %invoke.cont74
  call void @_ZN5boost5arrayISsLj4EED1Ev(%"class.boost::array"* %seasons)
  %23 = load i32* %retval
  ret i32 %23

invoke.cont78:                                    ; preds = %lpad19
  br label %ehcleanup79

ehcleanup79:                                      ; preds = %invoke.cont78, %lpad17
  invoke void @_ZN5boost5arrayISsLj4EED1Ev(%"class.boost::array"* %seasons)
          to label %invoke.cont80 unwind label %terminate.lpad

invoke.cont80:                                    ; preds = %ehcleanup79
  br label %eh.resume

eh.resume:                                        ; preds = %invoke.cont80, %cleanup.done
  %exn = load i8** %exn.slot
  %sel = load i32* %ehselector.slot
  %lpad.val = insertvalue { i8*, i32 } undef, i8* %exn, 0
  %lpad.val81 = insertvalue { i8*, i32 } %lpad.val, i32 %sel, 1
  resume { i8*, i32 } %lpad.val81

terminate.lpad:                                   ; preds = %ehcleanup79, %lpad19, %arraydestroy.body
  %24 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          catch i8* null
  call void @_ZSt9terminatev() noreturn nounwind
  unreachable
}

declare void @_ZNSsC1EPKcRKSaIcE(%"class.std::basic_string"*, i8*, %"class.std::allocator"*)

declare void @_ZNSaIcEC1Ev(%"class.std::allocator"*) nounwind

declare i32 @__gxx_personality_v0(...)

declare void @_ZNSaIcED1Ev(%"class.std::allocator"*) nounwind

declare void @_ZNSsD1Ev(%"class.std::basic_string"*)

declare void @_ZSt9terminatev()

define linkonce_odr void @_ZN5boost5arrayISsLj4EEC1ERKS1_(%"class.boost::array"* %this, %"class.boost::array"*) unnamed_addr inlinehint align 2 {
entry:
  %this.addr = alloca %"class.boost::array"*, align 4
  %.addr = alloca %"class.boost::array"*, align 4
  store %"class.boost::array"* %this, %"class.boost::array"** %this.addr, align 4
  store %"class.boost::array"* %0, %"class.boost::array"** %.addr, align 4
  %this1 = load %"class.boost::array"** %this.addr
  %1 = load %"class.boost::array"** %.addr
  call void @_ZN5boost5arrayISsLj4EEC2ERKS1_(%"class.boost::array"* %this1, %"class.boost::array"* %1)
  ret void
}

define linkonce_odr i32 @_ZN5boost5arrayISsLj4EE4sizeEv() nounwind align 2 {
entry:
  ret i32 4
}

define linkonce_odr void @_ZSt4swapIcSt11char_traitsIcESaIcEEvRSbIT_T0_T1_ES7_(%"class.std::basic_string"* %__lhs, %"class.std::basic_string"* %__rhs) inlinehint {
entry:
  %__lhs.addr = alloca %"class.std::basic_string"*, align 4
  %__rhs.addr = alloca %"class.std::basic_string"*, align 4
  store %"class.std::basic_string"* %__lhs, %"class.std::basic_string"** %__lhs.addr, align 4
  store %"class.std::basic_string"* %__rhs, %"class.std::basic_string"** %__rhs.addr, align 4
  %0 = load %"class.std::basic_string"** %__lhs.addr, align 4
  %1 = load %"class.std::basic_string"** %__rhs.addr, align 4
  call void @_ZNSs4swapERSs(%"class.std::basic_string"* %0, %"class.std::basic_string"* %1)
  ret void
}

define linkonce_odr %"class.std::basic_string"* @_ZN5boost5arrayISsLj4EE2atEj(%"class.boost::array"* %this, i32 %i) align 2 {
entry:
  %this.addr = alloca %"class.boost::array"*, align 4
  %i.addr = alloca i32, align 4
  store %"class.boost::array"* %this, %"class.boost::array"** %this.addr, align 4
  store i32 %i, i32* %i.addr, align 4
  %this1 = load %"class.boost::array"** %this.addr
  %0 = load i32* %i.addr, align 4
  call void @_ZN5boost5arrayISsLj4EE10rangecheckEj(i32 %0)
  %1 = load i32* %i.addr, align 4
  %elems = getelementptr inbounds %"class.boost::array"* %this1, i32 0, i32 0
  %arrayidx = getelementptr inbounds [4 x %"class.std::basic_string"]* %elems, i32 0, i32 %1
  ret %"class.std::basic_string"* %arrayidx
}

declare %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"*, i8*)

define linkonce_odr void @_Z14print_elementsIN5boost5arrayISsLj4EEEEvRKT_(%"class.boost::array"* %x) {
entry:
  %x.addr = alloca %"class.boost::array"*, align 4
  %i = alloca i32, align 4
  store %"class.boost::array"* %x, %"class.boost::array"** %x.addr, align 4
  store i32 0, i32* %i, align 4
  br label %for.cond

for.cond:                                         ; preds = %for.inc, %entry
  %0 = load i32* %i, align 4
  %1 = load %"class.boost::array"** %x.addr, align 4
  %call = call i32 @_ZN5boost5arrayISsLj4EE4sizeEv()
  %cmp = icmp ult i32 %0, %call
  br i1 %cmp, label %for.body, label %for.end

for.body:                                         ; preds = %for.cond
  %call1 = call %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* @_ZSt4cout, i8* getelementptr inbounds ([2 x i8]* @.str7, i32 0, i32 0))
  %2 = load %"class.boost::array"** %x.addr, align 4
  %3 = load i32* %i, align 4
  %call2 = call %"class.std::basic_string"* @_ZNK5boost5arrayISsLj4EEixEj(%"class.boost::array"* %2, i32 %3)
  %call3 = call %"class.std::basic_ostream"* @_ZStlsIcSt11char_traitsIcESaIcEERSt13basic_ostreamIT_T0_ES7_RKSbIS4_S5_T1_E(%"class.std::basic_ostream"* %call1, %"class.std::basic_string"* %call2)
  br label %for.inc

for.inc:                                          ; preds = %for.body
  %4 = load i32* %i, align 4
  %inc = add i32 %4, 1
  store i32 %inc, i32* %i, align 4
  br label %for.cond

for.end:                                          ; preds = %for.cond
  %call4 = call %"class.std::basic_ostream"* @_ZNSolsEPFRSoS_E(%"class.std::basic_ostream"* @_ZSt4cout, %"class.std::basic_ostream"* (%"class.std::basic_ostream"*)* @_ZSt4endlIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_)
  ret void
}

define linkonce_odr void @_ZSt4swapIN5boost5arrayISsLj4EEEEvRT_S4_(%"class.boost::array"* %__a, %"class.boost::array"* %__b) {
entry:
  %__a.addr = alloca %"class.boost::array"*, align 4
  %__b.addr = alloca %"class.boost::array"*, align 4
  %__tmp = alloca %"class.boost::array", align 4
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  store %"class.boost::array"* %__a, %"class.boost::array"** %__a.addr, align 4
  store %"class.boost::array"* %__b, %"class.boost::array"** %__b.addr, align 4
  %0 = load %"class.boost::array"** %__a.addr, align 4
  call void @_ZN5boost5arrayISsLj4EEC1ERKS1_(%"class.boost::array"* %__tmp, %"class.boost::array"* %0)
  %1 = load %"class.boost::array"** %__a.addr, align 4
  %2 = load %"class.boost::array"** %__b.addr, align 4
  %call = invoke %"class.boost::array"* @_ZN5boost5arrayISsLj4EEaSERKS1_(%"class.boost::array"* %1, %"class.boost::array"* %2)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %entry
  %3 = load %"class.boost::array"** %__b.addr, align 4
  %call2 = invoke %"class.boost::array"* @_ZN5boost5arrayISsLj4EEaSERKS1_(%"class.boost::array"* %3, %"class.boost::array"* %__tmp)
          to label %invoke.cont1 unwind label %lpad

invoke.cont1:                                     ; preds = %invoke.cont
  call void @_ZN5boost5arrayISsLj4EED1Ev(%"class.boost::array"* %__tmp)
  ret void

lpad:                                             ; preds = %invoke.cont, %entry
  %4 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %5 = extractvalue { i8*, i32 } %4, 0
  store i8* %5, i8** %exn.slot
  %6 = extractvalue { i8*, i32 } %4, 1
  store i32 %6, i32* %ehselector.slot
  invoke void @_ZN5boost5arrayISsLj4EED1Ev(%"class.boost::array"* %__tmp)
          to label %invoke.cont3 unwind label %terminate.lpad

invoke.cont3:                                     ; preds = %lpad
  br label %eh.resume

eh.resume:                                        ; preds = %invoke.cont3
  %exn = load i8** %exn.slot
  %sel = load i32* %ehselector.slot
  %lpad.val = insertvalue { i8*, i32 } undef, i8* %exn, 0
  %lpad.val4 = insertvalue { i8*, i32 } %lpad.val, i32 %sel, 1
  resume { i8*, i32 } %lpad.val4

terminate.lpad:                                   ; preds = %lpad
  %7 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          catch i8* null
  call void @_ZSt9terminatev() noreturn nounwind
  unreachable
}

define linkonce_odr void @_ZN5boost5arrayISsLj4EE6rbeginEv(%"class.std::reverse_iterator"* noalias sret %agg.result, %"class.boost::array"* %this) align 2 {
entry:
  %this.addr = alloca %"class.boost::array"*, align 4
  store %"class.boost::array"* %this, %"class.boost::array"** %this.addr, align 4
  %this1 = load %"class.boost::array"** %this.addr
  %call = call %"class.std::basic_string"* @_ZN5boost5arrayISsLj4EE3endEv(%"class.boost::array"* %this1)
  call void @_ZNSt16reverse_iteratorIPSsEC1ES0_(%"class.std::reverse_iterator"* %agg.result, %"class.std::basic_string"* %call)
  ret void
}

define linkonce_odr zeroext i1 @_ZStltIPSsEbRKSt16reverse_iteratorIT_ES5_(%"class.std::reverse_iterator"* %__x, %"class.std::reverse_iterator"* %__y) inlinehint {
entry:
  %__x.addr = alloca %"class.std::reverse_iterator"*, align 4
  %__y.addr = alloca %"class.std::reverse_iterator"*, align 4
  store %"class.std::reverse_iterator"* %__x, %"class.std::reverse_iterator"** %__x.addr, align 4
  store %"class.std::reverse_iterator"* %__y, %"class.std::reverse_iterator"** %__y.addr, align 4
  %0 = load %"class.std::reverse_iterator"** %__y.addr, align 4
  %call = call %"class.std::basic_string"* @_ZNKSt16reverse_iteratorIPSsE4baseEv(%"class.std::reverse_iterator"* %0)
  %1 = load %"class.std::reverse_iterator"** %__x.addr, align 4
  %call1 = call %"class.std::basic_string"* @_ZNKSt16reverse_iteratorIPSsE4baseEv(%"class.std::reverse_iterator"* %1)
  %cmp = icmp ult %"class.std::basic_string"* %call, %call1
  ret i1 %cmp
}

define linkonce_odr void @_ZN5boost5arrayISsLj4EE4rendEv(%"class.std::reverse_iterator"* noalias sret %agg.result, %"class.boost::array"* %this) align 2 {
entry:
  %this.addr = alloca %"class.boost::array"*, align 4
  store %"class.boost::array"* %this, %"class.boost::array"** %this.addr, align 4
  %this1 = load %"class.boost::array"** %this.addr
  %call = call %"class.std::basic_string"* @_ZN5boost5arrayISsLj4EE5beginEv(%"class.boost::array"* %this1)
  call void @_ZNSt16reverse_iteratorIPSsEC1ES0_(%"class.std::reverse_iterator"* %agg.result, %"class.std::basic_string"* %call)
  ret void
}

declare %"class.std::basic_ostream"* @_ZStlsIcSt11char_traitsIcESaIcEERSt13basic_ostreamIT_T0_ES7_RKSbIS4_S5_T1_E(%"class.std::basic_ostream"*, %"class.std::basic_string"*)

define linkonce_odr %"class.std::basic_string"* @_ZNKSt16reverse_iteratorIPSsEdeEv(%"class.std::reverse_iterator"* %this) nounwind align 2 {
entry:
  %this.addr = alloca %"class.std::reverse_iterator"*, align 4
  %__tmp = alloca %"class.std::basic_string"*, align 4
  store %"class.std::reverse_iterator"* %this, %"class.std::reverse_iterator"** %this.addr, align 4
  %this1 = load %"class.std::reverse_iterator"** %this.addr
  %current = getelementptr inbounds %"class.std::reverse_iterator"* %this1, i32 0, i32 0
  %0 = load %"class.std::basic_string"** %current, align 4
  store %"class.std::basic_string"* %0, %"class.std::basic_string"** %__tmp, align 4
  %1 = load %"class.std::basic_string"** %__tmp, align 4
  %incdec.ptr = getelementptr inbounds %"class.std::basic_string"* %1, i32 -1
  store %"class.std::basic_string"* %incdec.ptr, %"class.std::basic_string"** %__tmp, align 4
  ret %"class.std::basic_string"* %incdec.ptr
}

define linkonce_odr %"class.std::reverse_iterator"* @_ZNSt16reverse_iteratorIPSsEppEv(%"class.std::reverse_iterator"* %this) nounwind align 2 {
entry:
  %this.addr = alloca %"class.std::reverse_iterator"*, align 4
  store %"class.std::reverse_iterator"* %this, %"class.std::reverse_iterator"** %this.addr, align 4
  %this1 = load %"class.std::reverse_iterator"** %this.addr
  %current = getelementptr inbounds %"class.std::reverse_iterator"* %this1, i32 0, i32 0
  %0 = load %"class.std::basic_string"** %current, align 4
  %incdec.ptr = getelementptr inbounds %"class.std::basic_string"* %0, i32 -1
  store %"class.std::basic_string"* %incdec.ptr, %"class.std::basic_string"** %current, align 4
  ret %"class.std::reverse_iterator"* %this1
}

define linkonce_odr void @_ZNK5boost5arrayISsLj4EE7crbeginEv(%"class.std::reverse_iterator.0"* noalias sret %agg.result, %"class.boost::array"* %this) align 2 {
entry:
  %this.addr = alloca %"class.boost::array"*, align 4
  store %"class.boost::array"* %this, %"class.boost::array"** %this.addr, align 4
  %this1 = load %"class.boost::array"** %this.addr
  %call = call %"class.std::basic_string"* @_ZNK5boost5arrayISsLj4EE3endEv(%"class.boost::array"* %this1)
  call void @_ZNSt16reverse_iteratorIPKSsEC1ES1_(%"class.std::reverse_iterator.0"* %agg.result, %"class.std::basic_string"* %call)
  ret void
}

define linkonce_odr zeroext i1 @_ZStltIPKSsEbRKSt16reverse_iteratorIT_ES6_(%"class.std::reverse_iterator.0"* %__x, %"class.std::reverse_iterator.0"* %__y) inlinehint {
entry:
  %__x.addr = alloca %"class.std::reverse_iterator.0"*, align 4
  %__y.addr = alloca %"class.std::reverse_iterator.0"*, align 4
  store %"class.std::reverse_iterator.0"* %__x, %"class.std::reverse_iterator.0"** %__x.addr, align 4
  store %"class.std::reverse_iterator.0"* %__y, %"class.std::reverse_iterator.0"** %__y.addr, align 4
  %0 = load %"class.std::reverse_iterator.0"** %__y.addr, align 4
  %call = call %"class.std::basic_string"* @_ZNKSt16reverse_iteratorIPKSsE4baseEv(%"class.std::reverse_iterator.0"* %0)
  %1 = load %"class.std::reverse_iterator.0"** %__x.addr, align 4
  %call1 = call %"class.std::basic_string"* @_ZNKSt16reverse_iteratorIPKSsE4baseEv(%"class.std::reverse_iterator.0"* %1)
  %cmp = icmp ult %"class.std::basic_string"* %call, %call1
  ret i1 %cmp
}

define linkonce_odr void @_ZNK5boost5arrayISsLj4EE5crendEv(%"class.std::reverse_iterator.0"* noalias sret %agg.result, %"class.boost::array"* %this) align 2 {
entry:
  %this.addr = alloca %"class.boost::array"*, align 4
  store %"class.boost::array"* %this, %"class.boost::array"** %this.addr, align 4
  %this1 = load %"class.boost::array"** %this.addr
  %call = call %"class.std::basic_string"* @_ZNK5boost5arrayISsLj4EE5beginEv(%"class.boost::array"* %this1)
  call void @_ZNSt16reverse_iteratorIPKSsEC1ES1_(%"class.std::reverse_iterator.0"* %agg.result, %"class.std::basic_string"* %call)
  ret void
}

define linkonce_odr %"class.std::basic_string"* @_ZNKSt16reverse_iteratorIPKSsEdeEv(%"class.std::reverse_iterator.0"* %this) nounwind align 2 {
entry:
  %this.addr = alloca %"class.std::reverse_iterator.0"*, align 4
  %__tmp = alloca %"class.std::basic_string"*, align 4
  store %"class.std::reverse_iterator.0"* %this, %"class.std::reverse_iterator.0"** %this.addr, align 4
  %this1 = load %"class.std::reverse_iterator.0"** %this.addr
  %current = getelementptr inbounds %"class.std::reverse_iterator.0"* %this1, i32 0, i32 0
  %0 = load %"class.std::basic_string"** %current, align 4
  store %"class.std::basic_string"* %0, %"class.std::basic_string"** %__tmp, align 4
  %1 = load %"class.std::basic_string"** %__tmp, align 4
  %incdec.ptr = getelementptr inbounds %"class.std::basic_string"* %1, i32 -1
  store %"class.std::basic_string"* %incdec.ptr, %"class.std::basic_string"** %__tmp, align 4
  ret %"class.std::basic_string"* %incdec.ptr
}

define linkonce_odr %"class.std::reverse_iterator.0"* @_ZNSt16reverse_iteratorIPKSsEppEv(%"class.std::reverse_iterator.0"* %this) nounwind align 2 {
entry:
  %this.addr = alloca %"class.std::reverse_iterator.0"*, align 4
  store %"class.std::reverse_iterator.0"* %this, %"class.std::reverse_iterator.0"** %this.addr, align 4
  %this1 = load %"class.std::reverse_iterator.0"** %this.addr
  %current = getelementptr inbounds %"class.std::reverse_iterator.0"* %this1, i32 0, i32 0
  %0 = load %"class.std::basic_string"** %current, align 4
  %incdec.ptr = getelementptr inbounds %"class.std::basic_string"* %0, i32 -1
  store %"class.std::basic_string"* %incdec.ptr, %"class.std::basic_string"** %current, align 4
  ret %"class.std::reverse_iterator.0"* %this1
}

declare %"class.std::basic_ostream"* @_ZNSolsEPFRSoS_E(%"class.std::basic_ostream"*, %"class.std::basic_ostream"* (%"class.std::basic_ostream"*)*)

declare %"class.std::basic_ostream"* @_ZSt4endlIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_(%"class.std::basic_ostream"*)

define linkonce_odr void @_ZN5boost5arrayISsLj4EED1Ev(%"class.boost::array"* %this) unnamed_addr inlinehint align 2 {
entry:
  %this.addr = alloca %"class.boost::array"*, align 4
  store %"class.boost::array"* %this, %"class.boost::array"** %this.addr, align 4
  %this1 = load %"class.boost::array"** %this.addr
  call void @_ZN5boost5arrayISsLj4EED2Ev(%"class.boost::array"* %this1)
  ret void
}

define linkonce_odr %"class.std::basic_string"* @_ZNKSt16reverse_iteratorIPKSsE4baseEv(%"class.std::reverse_iterator.0"* %this) nounwind align 2 {
entry:
  %this.addr = alloca %"class.std::reverse_iterator.0"*, align 4
  store %"class.std::reverse_iterator.0"* %this, %"class.std::reverse_iterator.0"** %this.addr, align 4
  %this1 = load %"class.std::reverse_iterator.0"** %this.addr
  %current = getelementptr inbounds %"class.std::reverse_iterator.0"* %this1, i32 0, i32 0
  %0 = load %"class.std::basic_string"** %current, align 4
  ret %"class.std::basic_string"* %0
}

define linkonce_odr void @_ZNSt16reverse_iteratorIPKSsEC1ES1_(%"class.std::reverse_iterator.0"* %this, %"class.std::basic_string"* %__x) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.std::reverse_iterator.0"*, align 4
  %__x.addr = alloca %"class.std::basic_string"*, align 4
  store %"class.std::reverse_iterator.0"* %this, %"class.std::reverse_iterator.0"** %this.addr, align 4
  store %"class.std::basic_string"* %__x, %"class.std::basic_string"** %__x.addr, align 4
  %this1 = load %"class.std::reverse_iterator.0"** %this.addr
  %0 = load %"class.std::basic_string"** %__x.addr, align 4
  call void @_ZNSt16reverse_iteratorIPKSsEC2ES1_(%"class.std::reverse_iterator.0"* %this1, %"class.std::basic_string"* %0)
  ret void
}

define linkonce_odr %"class.std::basic_string"* @_ZNK5boost5arrayISsLj4EE5beginEv(%"class.boost::array"* %this) nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::array"*, align 4
  store %"class.boost::array"* %this, %"class.boost::array"** %this.addr, align 4
  %this1 = load %"class.boost::array"** %this.addr
  %elems = getelementptr inbounds %"class.boost::array"* %this1, i32 0, i32 0
  %arraydecay = getelementptr inbounds [4 x %"class.std::basic_string"]* %elems, i32 0, i32 0
  ret %"class.std::basic_string"* %arraydecay
}

define linkonce_odr void @_ZNSt16reverse_iteratorIPKSsEC2ES1_(%"class.std::reverse_iterator.0"* %this, %"class.std::basic_string"* %__x) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.std::reverse_iterator.0"*, align 4
  %__x.addr = alloca %"class.std::basic_string"*, align 4
  store %"class.std::reverse_iterator.0"* %this, %"class.std::reverse_iterator.0"** %this.addr, align 4
  store %"class.std::basic_string"* %__x, %"class.std::basic_string"** %__x.addr, align 4
  %this1 = load %"class.std::reverse_iterator.0"** %this.addr
  %0 = bitcast %"class.std::reverse_iterator.0"* %this1 to %"struct.std::iterator.1"*
  %current = getelementptr inbounds %"class.std::reverse_iterator.0"* %this1, i32 0, i32 0
  %1 = load %"class.std::basic_string"** %__x.addr, align 4
  store %"class.std::basic_string"* %1, %"class.std::basic_string"** %current, align 4
  ret void
}

define linkonce_odr %"class.std::basic_string"* @_ZNK5boost5arrayISsLj4EE3endEv(%"class.boost::array"* %this) nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::array"*, align 4
  store %"class.boost::array"* %this, %"class.boost::array"** %this.addr, align 4
  %this1 = load %"class.boost::array"** %this.addr
  %elems = getelementptr inbounds %"class.boost::array"* %this1, i32 0, i32 0
  %arraydecay = getelementptr inbounds [4 x %"class.std::basic_string"]* %elems, i32 0, i32 0
  %add.ptr = getelementptr inbounds %"class.std::basic_string"* %arraydecay, i32 4
  ret %"class.std::basic_string"* %add.ptr
}

define linkonce_odr %"class.std::basic_string"* @_ZNKSt16reverse_iteratorIPSsE4baseEv(%"class.std::reverse_iterator"* %this) nounwind align 2 {
entry:
  %this.addr = alloca %"class.std::reverse_iterator"*, align 4
  store %"class.std::reverse_iterator"* %this, %"class.std::reverse_iterator"** %this.addr, align 4
  %this1 = load %"class.std::reverse_iterator"** %this.addr
  %current = getelementptr inbounds %"class.std::reverse_iterator"* %this1, i32 0, i32 0
  %0 = load %"class.std::basic_string"** %current, align 4
  ret %"class.std::basic_string"* %0
}

define linkonce_odr void @_ZNSt16reverse_iteratorIPSsEC1ES0_(%"class.std::reverse_iterator"* %this, %"class.std::basic_string"* %__x) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.std::reverse_iterator"*, align 4
  %__x.addr = alloca %"class.std::basic_string"*, align 4
  store %"class.std::reverse_iterator"* %this, %"class.std::reverse_iterator"** %this.addr, align 4
  store %"class.std::basic_string"* %__x, %"class.std::basic_string"** %__x.addr, align 4
  %this1 = load %"class.std::reverse_iterator"** %this.addr
  %0 = load %"class.std::basic_string"** %__x.addr, align 4
  call void @_ZNSt16reverse_iteratorIPSsEC2ES0_(%"class.std::reverse_iterator"* %this1, %"class.std::basic_string"* %0)
  ret void
}

define linkonce_odr %"class.std::basic_string"* @_ZN5boost5arrayISsLj4EE5beginEv(%"class.boost::array"* %this) nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::array"*, align 4
  store %"class.boost::array"* %this, %"class.boost::array"** %this.addr, align 4
  %this1 = load %"class.boost::array"** %this.addr
  %elems = getelementptr inbounds %"class.boost::array"* %this1, i32 0, i32 0
  %arraydecay = getelementptr inbounds [4 x %"class.std::basic_string"]* %elems, i32 0, i32 0
  ret %"class.std::basic_string"* %arraydecay
}

define linkonce_odr void @_ZNSt16reverse_iteratorIPSsEC2ES0_(%"class.std::reverse_iterator"* %this, %"class.std::basic_string"* %__x) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.std::reverse_iterator"*, align 4
  %__x.addr = alloca %"class.std::basic_string"*, align 4
  store %"class.std::reverse_iterator"* %this, %"class.std::reverse_iterator"** %this.addr, align 4
  store %"class.std::basic_string"* %__x, %"class.std::basic_string"** %__x.addr, align 4
  %this1 = load %"class.std::reverse_iterator"** %this.addr
  %0 = bitcast %"class.std::reverse_iterator"* %this1 to %"struct.std::iterator"*
  %current = getelementptr inbounds %"class.std::reverse_iterator"* %this1, i32 0, i32 0
  %1 = load %"class.std::basic_string"** %__x.addr, align 4
  store %"class.std::basic_string"* %1, %"class.std::basic_string"** %current, align 4
  ret void
}

define linkonce_odr %"class.std::basic_string"* @_ZN5boost5arrayISsLj4EE3endEv(%"class.boost::array"* %this) nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::array"*, align 4
  store %"class.boost::array"* %this, %"class.boost::array"** %this.addr, align 4
  %this1 = load %"class.boost::array"** %this.addr
  %elems = getelementptr inbounds %"class.boost::array"* %this1, i32 0, i32 0
  %arraydecay = getelementptr inbounds [4 x %"class.std::basic_string"]* %elems, i32 0, i32 0
  %add.ptr = getelementptr inbounds %"class.std::basic_string"* %arraydecay, i32 4
  ret %"class.std::basic_string"* %add.ptr
}

define linkonce_odr %"class.boost::array"* @_ZN5boost5arrayISsLj4EEaSERKS1_(%"class.boost::array"* %this, %"class.boost::array"*) inlinehint align 2 {
entry:
  %this.addr = alloca %"class.boost::array"*, align 4
  %.addr = alloca %"class.boost::array"*, align 4
  %__i0 = alloca i32, align 4
  store %"class.boost::array"* %this, %"class.boost::array"** %this.addr, align 4
  store %"class.boost::array"* %0, %"class.boost::array"** %.addr, align 4
  %this1 = load %"class.boost::array"** %this.addr
  store i32 0, i32* %__i0, align 4
  br label %for.cond

for.cond:                                         ; preds = %for.inc, %entry
  %1 = load i32* %__i0, align 4
  %cmp = icmp ne i32 %1, 4
  br i1 %cmp, label %for.body, label %for.end

for.body:                                         ; preds = %for.cond
  %2 = load i32* %__i0, align 4
  %elems = getelementptr inbounds %"class.boost::array"* %this1, i32 0, i32 0
  %arrayidx = getelementptr inbounds [4 x %"class.std::basic_string"]* %elems, i32 0, i32 %2
  %3 = load i32* %__i0, align 4
  %4 = load %"class.boost::array"** %.addr, align 4
  %elems2 = getelementptr inbounds %"class.boost::array"* %4, i32 0, i32 0
  %arrayidx3 = getelementptr inbounds [4 x %"class.std::basic_string"]* %elems2, i32 0, i32 %3
  %call = call %"class.std::basic_string"* @_ZNSsaSERKSs(%"class.std::basic_string"* %arrayidx, %"class.std::basic_string"* %arrayidx3)
  br label %for.inc

for.inc:                                          ; preds = %for.body
  %5 = load i32* %__i0, align 4
  %inc = add i32 %5, 1
  store i32 %inc, i32* %__i0, align 4
  br label %for.cond

for.end:                                          ; preds = %for.cond
  ret %"class.boost::array"* %this1
}

declare %"class.std::basic_string"* @_ZNSsaSERKSs(%"class.std::basic_string"*, %"class.std::basic_string"*)

define linkonce_odr %"class.std::basic_string"* @_ZNK5boost5arrayISsLj4EEixEj(%"class.boost::array"* %this, i32 %i) align 2 {
entry:
  %this.addr = alloca %"class.boost::array"*, align 4
  %i.addr = alloca i32, align 4
  store %"class.boost::array"* %this, %"class.boost::array"** %this.addr, align 4
  store i32 %i, i32* %i.addr, align 4
  %this1 = load %"class.boost::array"** %this.addr
  %0 = load i32* %i.addr, align 4
  %cmp = icmp ult i32 %0, 4
  br i1 %cmp, label %cond.true, label %cond.false

cond.true:                                        ; preds = %entry
  br label %cond.end

cond.false:                                       ; preds = %entry
  call void @_ZN5boost9assertion6detail20assertion_failed_msgEPKcS3_S3_S3_l(i8* getelementptr inbounds ([6 x i8]* @.str8, i32 0, i32 0), i8* getelementptr inbounds ([13 x i8]* @.str9, i32 0, i32 0), i8* getelementptr inbounds ([123 x i8]* @__PRETTY_FUNCTION__._ZNK5boost5arrayISsLj4EEixEj, i32 0, i32 0), i8* getelementptr inbounds ([42 x i8]* @.str10, i32 0, i32 0), i32 129)
  br label %cond.end

cond.end:                                         ; preds = %cond.false, %cond.true
  %1 = load i32* %i.addr, align 4
  %elems = getelementptr inbounds %"class.boost::array"* %this1, i32 0, i32 0
  %arrayidx = getelementptr inbounds [4 x %"class.std::basic_string"]* %elems, i32 0, i32 %1
  ret %"class.std::basic_string"* %arrayidx
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
  %call = call %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* @_ZSt4cerr, i8* getelementptr inbounds ([43 x i8]* @.str11, i32 0, i32 0))
  %0 = load i8** %expr.addr, align 4
  %call1 = call %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* %call, i8* %0)
  %call2 = call %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* %call1, i8* getelementptr inbounds ([13 x i8]* @.str12, i32 0, i32 0))
  %1 = load i8** %function.addr, align 4
  %call3 = call %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* %call2, i8* %1)
  %call4 = call %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* %call3, i8* getelementptr inbounds ([3 x i8]* @.str13, i32 0, i32 0))
  %2 = load i8** %file.addr, align 4
  %call5 = call %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* %call4, i8* %2)
  %call6 = call %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_c(%"class.std::basic_ostream"* %call5, i8 signext 40)
  %3 = load i32* %line.addr, align 4
  %call7 = call %"class.std::basic_ostream"* @_ZNSolsEl(%"class.std::basic_ostream"* %call6, i32 %3)
  %call8 = call %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* %call7, i8* getelementptr inbounds ([4 x i8]* @.str14, i32 0, i32 0))
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

declare void @_ZNSs4swapERSs(%"class.std::basic_string"*, %"class.std::basic_string"*)

define linkonce_odr void @_ZN5boost5arrayISsLj4EE10rangecheckEj(i32 %i) align 2 {
entry:
  %i.addr = alloca i32, align 4
  %e = alloca %"class.std::out_of_range", align 4
  %ref.tmp = alloca %"class.std::basic_string", align 4
  %ref.tmp1 = alloca %"class.std::allocator", align 1
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  store i32 %i, i32* %i.addr, align 4
  %0 = load i32* %i.addr, align 4
  %call = call i32 @_ZN5boost5arrayISsLj4EE4sizeEv()
  %cmp = icmp uge i32 %0, %call
  br i1 %cmp, label %if.then, label %if.end

if.then:                                          ; preds = %entry
  call void @_ZNSaIcEC1Ev(%"class.std::allocator"* %ref.tmp1) nounwind
  invoke void @_ZNSsC1EPKcRKSaIcE(%"class.std::basic_string"* %ref.tmp, i8* getelementptr inbounds ([28 x i8]* @.str15, i32 0, i32 0), %"class.std::allocator"* %ref.tmp1)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %if.then
  invoke void @_ZNSt12out_of_rangeC1ERKSs(%"class.std::out_of_range"* %e, %"class.std::basic_string"* %ref.tmp)
          to label %invoke.cont3 unwind label %lpad2

invoke.cont3:                                     ; preds = %invoke.cont
  invoke void @_ZNSsD1Ev(%"class.std::basic_string"* %ref.tmp)
          to label %invoke.cont4 unwind label %lpad

invoke.cont4:                                     ; preds = %invoke.cont3
  call void @_ZNSaIcED1Ev(%"class.std::allocator"* %ref.tmp1) nounwind
  invoke void @_ZN5boost15throw_exceptionISt12out_of_rangeEEvRKT_(%"class.std::out_of_range"* %e) noreturn
          to label %invoke.cont7 unwind label %lpad6

invoke.cont7:                                     ; preds = %invoke.cont4
  unreachable

lpad:                                             ; preds = %invoke.cont3, %if.then
  %1 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %2 = extractvalue { i8*, i32 } %1, 0
  store i8* %2, i8** %exn.slot
  %3 = extractvalue { i8*, i32 } %1, 1
  store i32 %3, i32* %ehselector.slot
  br label %ehcleanup

lpad2:                                            ; preds = %invoke.cont
  %4 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %5 = extractvalue { i8*, i32 } %4, 0
  store i8* %5, i8** %exn.slot
  %6 = extractvalue { i8*, i32 } %4, 1
  store i32 %6, i32* %ehselector.slot
  invoke void @_ZNSsD1Ev(%"class.std::basic_string"* %ref.tmp)
          to label %invoke.cont5 unwind label %terminate.lpad

invoke.cont5:                                     ; preds = %lpad2
  br label %ehcleanup

ehcleanup:                                        ; preds = %invoke.cont5, %lpad
  call void @_ZNSaIcED1Ev(%"class.std::allocator"* %ref.tmp1) nounwind
  br label %eh.resume

lpad6:                                            ; preds = %invoke.cont4
  %7 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %8 = extractvalue { i8*, i32 } %7, 0
  store i8* %8, i8** %exn.slot
  %9 = extractvalue { i8*, i32 } %7, 1
  store i32 %9, i32* %ehselector.slot
  call void @_ZNSt12out_of_rangeD1Ev(%"class.std::out_of_range"* %e) nounwind
  br label %eh.resume

if.end:                                           ; preds = %entry
  ret void

eh.resume:                                        ; preds = %lpad6, %ehcleanup
  %exn = load i8** %exn.slot
  %sel = load i32* %ehselector.slot
  %lpad.val = insertvalue { i8*, i32 } undef, i8* %exn, 0
  %lpad.val9 = insertvalue { i8*, i32 } %lpad.val, i32 %sel, 1
  resume { i8*, i32 } %lpad.val9

terminate.lpad:                                   ; preds = %lpad2
  %10 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          catch i8* null
  call void @_ZSt9terminatev() noreturn nounwind
  unreachable
}

declare void @_ZNSt12out_of_rangeC1ERKSs(%"class.std::out_of_range"*, %"class.std::basic_string"*)

define linkonce_odr void @_ZN5boost15throw_exceptionISt12out_of_rangeEEvRKT_(%"class.std::out_of_range"* %e) noreturn inlinehint {
entry:
  %e.addr = alloca %"class.std::out_of_range"*, align 4
  %ref.tmp = alloca %"struct.boost::exception_detail::error_info_injector", align 4
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  %cleanup.isactive = alloca i1
  store %"class.std::out_of_range"* %e, %"class.std::out_of_range"** %e.addr, align 4
  %0 = load %"class.std::out_of_range"** %e.addr, align 4
  %1 = bitcast %"class.std::out_of_range"* %0 to %"class.std::exception"*
  call void @_ZN5boost36throw_exception_assert_compatibilityERKSt9exception(%"class.std::exception"* %1)
  %exception = call i8* @__cxa_allocate_exception(i32 32) nounwind
  store i1 true, i1* %cleanup.isactive
  %2 = bitcast i8* %exception to %"class.boost::exception_detail::clone_impl"*
  %3 = load %"class.std::out_of_range"** %e.addr, align 4
  invoke void @_ZN5boost17enable_error_infoISt12out_of_rangeEENS_16exception_detail29enable_error_info_return_typeIT_E4typeERKS4_(%"struct.boost::exception_detail::error_info_injector"* sret %ref.tmp, %"class.std::out_of_range"* %3)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %entry
  invoke void @_ZN5boost24enable_current_exceptionINS_16exception_detail19error_info_injectorISt12out_of_rangeEEEENS1_10clone_implIT_EERKS6_(%"class.boost::exception_detail::clone_impl"* sret %2, %"struct.boost::exception_detail::error_info_injector"* %ref.tmp)
          to label %invoke.cont2 unwind label %lpad1

invoke.cont2:                                     ; preds = %invoke.cont
  store i1 false, i1* %cleanup.isactive
  invoke void @__cxa_throw(i8* %exception, i8* bitcast ({ i8*, i8*, i32, i32, i8*, i32, i8*, i32 }* @_ZTIN5boost16exception_detail10clone_implINS0_19error_info_injectorISt12out_of_rangeEEEE to i8*), i8* bitcast (void (%"class.boost::exception_detail::clone_impl"*)* @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorISt12out_of_rangeEEED1Ev to i8*)) noreturn
          to label %unreachable unwind label %lpad1

lpad:                                             ; preds = %entry
  %4 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %5 = extractvalue { i8*, i32 } %4, 0
  store i8* %5, i8** %exn.slot
  %6 = extractvalue { i8*, i32 } %4, 1
  store i32 %6, i32* %ehselector.slot
  br label %ehcleanup

lpad1:                                            ; preds = %invoke.cont2, %invoke.cont
  %7 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %8 = extractvalue { i8*, i32 } %7, 0
  store i8* %8, i8** %exn.slot
  %9 = extractvalue { i8*, i32 } %7, 1
  store i32 %9, i32* %ehselector.slot
  call void @_ZN5boost16exception_detail19error_info_injectorISt12out_of_rangeED1Ev(%"struct.boost::exception_detail::error_info_injector"* %ref.tmp) nounwind
  br label %ehcleanup

ehcleanup:                                        ; preds = %lpad1, %lpad
  %cleanup.is_active = load i1* %cleanup.isactive
  br i1 %cleanup.is_active, label %cleanup.action, label %cleanup.done

cleanup.action:                                   ; preds = %ehcleanup
  call void @__cxa_free_exception(i8* %exception) nounwind
  br label %cleanup.done

cleanup.done:                                     ; preds = %cleanup.action, %ehcleanup
  br label %eh.resume

return:                                           ; No predecessors!
  ret void

eh.resume:                                        ; preds = %cleanup.done
  %exn = load i8** %exn.slot
  %sel = load i32* %ehselector.slot
  %lpad.val = insertvalue { i8*, i32 } undef, i8* %exn, 0
  %lpad.val3 = insertvalue { i8*, i32 } %lpad.val, i32 %sel, 1
  resume { i8*, i32 } %lpad.val3

unreachable:                                      ; preds = %invoke.cont2
  unreachable
}

declare void @_ZNSt12out_of_rangeD1Ev(%"class.std::out_of_range"*) nounwind

define linkonce_odr void @_ZN5boost36throw_exception_assert_compatibilityERKSt9exception(%"class.std::exception"*) nounwind inlinehint {
entry:
  %.addr = alloca %"class.std::exception"*, align 4
  store %"class.std::exception"* %0, %"class.std::exception"** %.addr, align 4
  ret void
}

declare i8* @__cxa_allocate_exception(i32)

define linkonce_odr void @_ZN5boost24enable_current_exceptionINS_16exception_detail19error_info_injectorISt12out_of_rangeEEEENS1_10clone_implIT_EERKS6_(%"class.boost::exception_detail::clone_impl"* noalias sret %agg.result, %"struct.boost::exception_detail::error_info_injector"* %x) inlinehint {
entry:
  %x.addr = alloca %"struct.boost::exception_detail::error_info_injector"*, align 4
  store %"struct.boost::exception_detail::error_info_injector"* %x, %"struct.boost::exception_detail::error_info_injector"** %x.addr, align 4
  %0 = load %"struct.boost::exception_detail::error_info_injector"** %x.addr, align 4
  call void @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorISt12out_of_rangeEEEC1ERKS4_(%"class.boost::exception_detail::clone_impl"* %agg.result, %"struct.boost::exception_detail::error_info_injector"* %0)
  ret void
}

define linkonce_odr void @_ZN5boost17enable_error_infoISt12out_of_rangeEENS_16exception_detail29enable_error_info_return_typeIT_E4typeERKS4_(%"struct.boost::exception_detail::error_info_injector"* noalias sret %agg.result, %"class.std::out_of_range"* %x) inlinehint {
entry:
  %x.addr = alloca %"class.std::out_of_range"*, align 4
  store %"class.std::out_of_range"* %x, %"class.std::out_of_range"** %x.addr, align 4
  %0 = load %"class.std::out_of_range"** %x.addr, align 4
  call void @_ZN5boost16exception_detail19error_info_injectorISt12out_of_rangeEC1ERKS2_(%"struct.boost::exception_detail::error_info_injector"* %agg.result, %"class.std::out_of_range"* %0)
  ret void
}

define linkonce_odr void @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorISt12out_of_rangeEEED1Ev(%"class.boost::exception_detail::clone_impl"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::exception_detail::clone_impl"*, align 4
  store %"class.boost::exception_detail::clone_impl"* %this, %"class.boost::exception_detail::clone_impl"** %this.addr, align 4
  %this1 = load %"class.boost::exception_detail::clone_impl"** %this.addr
  call void @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorISt12out_of_rangeEEED2Ev(%"class.boost::exception_detail::clone_impl"* %this1, i8** getelementptr inbounds ([2 x i8*]* @_ZTTN5boost16exception_detail10clone_implINS0_19error_info_injectorISt12out_of_rangeEEEE, i64 0, i64 0)) nounwind
  %0 = bitcast %"class.boost::exception_detail::clone_impl"* %this1 to i8*
  %1 = getelementptr inbounds i8* %0, i64 28
  %2 = bitcast i8* %1 to %"class.boost::exception_detail::clone_base"*
  call void @_ZN5boost16exception_detail10clone_baseD2Ev(%"class.boost::exception_detail::clone_base"* %2) nounwind
  ret void
}

declare void @__cxa_throw(i8*, i8*, i8*)

define linkonce_odr void @_ZN5boost16exception_detail19error_info_injectorISt12out_of_rangeED1Ev(%"struct.boost::exception_detail::error_info_injector"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"struct.boost::exception_detail::error_info_injector"*, align 4
  store %"struct.boost::exception_detail::error_info_injector"* %this, %"struct.boost::exception_detail::error_info_injector"** %this.addr, align 4
  %this1 = load %"struct.boost::exception_detail::error_info_injector"** %this.addr
  call void @_ZN5boost16exception_detail19error_info_injectorISt12out_of_rangeED2Ev(%"struct.boost::exception_detail::error_info_injector"* %this1) nounwind
  ret void
}

declare void @__cxa_free_exception(i8*)

define linkonce_odr void @_ZN5boost16exception_detail19error_info_injectorISt12out_of_rangeED2Ev(%"struct.boost::exception_detail::error_info_injector"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"struct.boost::exception_detail::error_info_injector"*, align 4
  store %"struct.boost::exception_detail::error_info_injector"* %this, %"struct.boost::exception_detail::error_info_injector"** %this.addr, align 4
  %this1 = load %"struct.boost::exception_detail::error_info_injector"** %this.addr
  %0 = bitcast %"struct.boost::exception_detail::error_info_injector"* %this1 to i8*
  %1 = getelementptr inbounds i8* %0, i64 8
  %2 = bitcast i8* %1 to %"class.boost::exception"*
  call void @_ZN5boost9exceptionD2Ev(%"class.boost::exception"* %2) nounwind
  %3 = bitcast %"struct.boost::exception_detail::error_info_injector"* %this1 to %"class.std::out_of_range"*
  call void @_ZNSt12out_of_rangeD2Ev(%"class.std::out_of_range"* %3) nounwind
  ret void
}

define linkonce_odr void @_ZThn8_N5boost16exception_detail19error_info_injectorISt12out_of_rangeED1Ev(%"struct.boost::exception_detail::error_info_injector"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"struct.boost::exception_detail::error_info_injector"*, align 4
  store %"struct.boost::exception_detail::error_info_injector"* %this, %"struct.boost::exception_detail::error_info_injector"** %this.addr, align 4
  %this1 = load %"struct.boost::exception_detail::error_info_injector"** %this.addr
  %0 = bitcast %"struct.boost::exception_detail::error_info_injector"* %this1 to i8*
  %1 = getelementptr inbounds i8* %0, i64 -8
  %2 = bitcast i8* %1 to %"struct.boost::exception_detail::error_info_injector"*
  call void @_ZN5boost16exception_detail19error_info_injectorISt12out_of_rangeED1Ev(%"struct.boost::exception_detail::error_info_injector"* %2) nounwind
  ret void
}

define linkonce_odr void @_ZN5boost9exceptionD2Ev(%"class.boost::exception"* %this) unnamed_addr nounwind inlinehint align 2 {
entry:
  %this.addr = alloca %"class.boost::exception"*, align 4
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  store %"class.boost::exception"* %this, %"class.boost::exception"** %this.addr, align 4
  %this1 = load %"class.boost::exception"** %this.addr
  %0 = bitcast %"class.boost::exception"* %this1 to i8***
  store i8** getelementptr inbounds ([4 x i8*]* @_ZTVN5boost9exceptionE, i64 0, i64 2), i8*** %0
  %data_ = getelementptr inbounds %"class.boost::exception"* %this1, i32 0, i32 1
  invoke void @_ZN5boost16exception_detail12refcount_ptrINS0_20error_info_containerEED1Ev(%"class.boost::exception_detail::refcount_ptr"* %data_)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %entry
  ret void

lpad:                                             ; preds = %entry
  %1 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          filter [0 x i8*] zeroinitializer
  %2 = extractvalue { i8*, i32 } %1, 0
  store i8* %2, i8** %exn.slot
  %3 = extractvalue { i8*, i32 } %1, 1
  store i32 %3, i32* %ehselector.slot
  br label %filter.dispatch

filter.dispatch:                                  ; preds = %lpad
  %exn = load i8** %exn.slot
  call void @__cxa_call_unexpected(i8* %exn) noreturn
  unreachable
}

declare void @_ZNSt12out_of_rangeD2Ev(%"class.std::out_of_range"*) nounwind

define linkonce_odr void @_ZN5boost16exception_detail12refcount_ptrINS0_20error_info_containerEED1Ev(%"class.boost::exception_detail::refcount_ptr"* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::exception_detail::refcount_ptr"*, align 4
  store %"class.boost::exception_detail::refcount_ptr"* %this, %"class.boost::exception_detail::refcount_ptr"** %this.addr, align 4
  %this1 = load %"class.boost::exception_detail::refcount_ptr"** %this.addr
  call void @_ZN5boost16exception_detail12refcount_ptrINS0_20error_info_containerEED2Ev(%"class.boost::exception_detail::refcount_ptr"* %this1)
  ret void
}

declare void @__cxa_call_unexpected(i8*)

declare void @__cxa_pure_virtual()

define linkonce_odr void @_ZN5boost16exception_detail12refcount_ptrINS0_20error_info_containerEED2Ev(%"class.boost::exception_detail::refcount_ptr"* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::exception_detail::refcount_ptr"*, align 4
  store %"class.boost::exception_detail::refcount_ptr"* %this, %"class.boost::exception_detail::refcount_ptr"** %this.addr, align 4
  %this1 = load %"class.boost::exception_detail::refcount_ptr"** %this.addr
  call void @_ZN5boost16exception_detail12refcount_ptrINS0_20error_info_containerEE7releaseEv(%"class.boost::exception_detail::refcount_ptr"* %this1)
  ret void
}

define linkonce_odr void @_ZN5boost16exception_detail12refcount_ptrINS0_20error_info_containerEE7releaseEv(%"class.boost::exception_detail::refcount_ptr"* %this) align 2 {
entry:
  %this.addr = alloca %"class.boost::exception_detail::refcount_ptr"*, align 4
  store %"class.boost::exception_detail::refcount_ptr"* %this, %"class.boost::exception_detail::refcount_ptr"** %this.addr, align 4
  %this1 = load %"class.boost::exception_detail::refcount_ptr"** %this.addr
  %px_ = getelementptr inbounds %"class.boost::exception_detail::refcount_ptr"* %this1, i32 0, i32 0
  %0 = load %"struct.boost::exception_detail::error_info_container"** %px_, align 4
  %tobool = icmp ne %"struct.boost::exception_detail::error_info_container"* %0, null
  br i1 %tobool, label %land.lhs.true, label %if.end

land.lhs.true:                                    ; preds = %entry
  %px_2 = getelementptr inbounds %"class.boost::exception_detail::refcount_ptr"* %this1, i32 0, i32 0
  %1 = load %"struct.boost::exception_detail::error_info_container"** %px_2, align 4
  %2 = bitcast %"struct.boost::exception_detail::error_info_container"* %1 to i1 (%"struct.boost::exception_detail::error_info_container"*)***
  %vtable = load i1 (%"struct.boost::exception_detail::error_info_container"*)*** %2
  %vfn = getelementptr inbounds i1 (%"struct.boost::exception_detail::error_info_container"*)** %vtable, i64 4
  %3 = load i1 (%"struct.boost::exception_detail::error_info_container"*)** %vfn
  %call = call zeroext i1 %3(%"struct.boost::exception_detail::error_info_container"* %1)
  br i1 %call, label %if.then, label %if.end

if.then:                                          ; preds = %land.lhs.true
  %px_3 = getelementptr inbounds %"class.boost::exception_detail::refcount_ptr"* %this1, i32 0, i32 0
  store %"struct.boost::exception_detail::error_info_container"* null, %"struct.boost::exception_detail::error_info_container"** %px_3, align 4
  br label %if.end

if.end:                                           ; preds = %if.then, %land.lhs.true, %entry
  ret void
}

define linkonce_odr void @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorISt12out_of_rangeEEED2Ev(%"class.boost::exception_detail::clone_impl"* %this, i8** %vtt) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::exception_detail::clone_impl"*, align 4
  %vtt.addr = alloca i8**, align 4
  store %"class.boost::exception_detail::clone_impl"* %this, %"class.boost::exception_detail::clone_impl"** %this.addr, align 4
  store i8** %vtt, i8*** %vtt.addr, align 4
  %this1 = load %"class.boost::exception_detail::clone_impl"** %this.addr
  %vtt2 = load i8*** %vtt.addr
  %0 = bitcast %"class.boost::exception_detail::clone_impl"* %this1 to %"struct.boost::exception_detail::error_info_injector"*
  call void @_ZN5boost16exception_detail19error_info_injectorISt12out_of_rangeED2Ev(%"struct.boost::exception_detail::error_info_injector"* %0) nounwind
  ret void
}

define linkonce_odr void @_ZN5boost16exception_detail10clone_baseD2Ev(%"class.boost::exception_detail::clone_base"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::exception_detail::clone_base"*, align 4
  store %"class.boost::exception_detail::clone_base"* %this, %"class.boost::exception_detail::clone_base"** %this.addr, align 4
  %this1 = load %"class.boost::exception_detail::clone_base"** %this.addr
  ret void
}

define linkonce_odr void @_ZThn8_N5boost16exception_detail10clone_implINS0_19error_info_injectorISt12out_of_rangeEEED1Ev(%"class.boost::exception_detail::clone_impl"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::exception_detail::clone_impl"*, align 4
  store %"class.boost::exception_detail::clone_impl"* %this, %"class.boost::exception_detail::clone_impl"** %this.addr, align 4
  %this1 = load %"class.boost::exception_detail::clone_impl"** %this.addr
  %0 = bitcast %"class.boost::exception_detail::clone_impl"* %this1 to i8*
  %1 = getelementptr inbounds i8* %0, i64 -8
  %2 = bitcast i8* %1 to %"class.boost::exception_detail::clone_impl"*
  call void @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorISt12out_of_rangeEEED1Ev(%"class.boost::exception_detail::clone_impl"* %2) nounwind
  ret void
}

define linkonce_odr void @_ZTv0_n20_N5boost16exception_detail10clone_implINS0_19error_info_injectorISt12out_of_rangeEEED1Ev(%"class.boost::exception_detail::clone_impl"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::exception_detail::clone_impl"*, align 4
  store %"class.boost::exception_detail::clone_impl"* %this, %"class.boost::exception_detail::clone_impl"** %this.addr, align 4
  %this1 = load %"class.boost::exception_detail::clone_impl"** %this.addr
  %0 = bitcast %"class.boost::exception_detail::clone_impl"* %this1 to i8*
  %1 = bitcast i8* %0 to i8**
  %2 = load i8** %1
  %3 = getelementptr inbounds i8* %2, i64 -20
  %4 = bitcast i8* %3 to i32*
  %5 = load i32* %4
  %6 = getelementptr inbounds i8* %0, i32 %5
  %7 = bitcast i8* %6 to %"class.boost::exception_detail::clone_impl"*
  call void @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorISt12out_of_rangeEEED1Ev(%"class.boost::exception_detail::clone_impl"* %7) nounwind
  ret void
}

define linkonce_odr void @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorISt12out_of_rangeEEED0Ev(%"class.boost::exception_detail::clone_impl"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::exception_detail::clone_impl"*, align 4
  store %"class.boost::exception_detail::clone_impl"* %this, %"class.boost::exception_detail::clone_impl"** %this.addr, align 4
  %this1 = load %"class.boost::exception_detail::clone_impl"** %this.addr
  call void @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorISt12out_of_rangeEEED1Ev(%"class.boost::exception_detail::clone_impl"* %this1) nounwind
  %0 = bitcast %"class.boost::exception_detail::clone_impl"* %this1 to i8*
  call void @_ZdlPv(i8* %0) nounwind
  ret void
}

declare i8* @_ZNKSt11logic_error4whatEv(%"class.std::logic_error"*) nounwind

define linkonce_odr %"class.boost::exception_detail::clone_base"* @_ZNK5boost16exception_detail10clone_implINS0_19error_info_injectorISt12out_of_rangeEEE5cloneEv(%"class.boost::exception_detail::clone_impl"* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::exception_detail::clone_impl"*, align 4
  %agg.tmp = alloca %"struct.boost::exception_detail::clone_impl<boost::exception_detail::error_info_injector<std::out_of_range> >::clone_tag", align 1
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  store %"class.boost::exception_detail::clone_impl"* %this, %"class.boost::exception_detail::clone_impl"** %this.addr, align 4
  %this1 = load %"class.boost::exception_detail::clone_impl"** %this.addr
  %call = call noalias i8* @_Znwj(i32 32)
  %0 = bitcast i8* %call to %"class.boost::exception_detail::clone_impl"*
  invoke void @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorISt12out_of_rangeEEEC1ERKS5_NS5_9clone_tagE(%"class.boost::exception_detail::clone_impl"* %0, %"class.boost::exception_detail::clone_impl"* %this1)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %entry
  %1 = icmp eq %"class.boost::exception_detail::clone_impl"* %0, null
  br i1 %1, label %cast.end, label %cast.notnull

cast.notnull:                                     ; preds = %invoke.cont
  %2 = bitcast %"class.boost::exception_detail::clone_impl"* %0 to i8**
  %vtable = load i8** %2
  %vbase.offset.ptr = getelementptr i8* %vtable, i64 -12
  %3 = bitcast i8* %vbase.offset.ptr to i32*
  %vbase.offset = load i32* %3
  %4 = bitcast %"class.boost::exception_detail::clone_impl"* %0 to i8*
  %add.ptr = getelementptr inbounds i8* %4, i32 %vbase.offset
  %5 = bitcast i8* %add.ptr to %"class.boost::exception_detail::clone_base"*
  br label %cast.end

cast.end:                                         ; preds = %cast.notnull, %invoke.cont
  %cast.result = phi %"class.boost::exception_detail::clone_base"* [ %5, %cast.notnull ], [ null, %invoke.cont ]
  ret %"class.boost::exception_detail::clone_base"* %cast.result

lpad:                                             ; preds = %entry
  %6 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %7 = extractvalue { i8*, i32 } %6, 0
  store i8* %7, i8** %exn.slot
  %8 = extractvalue { i8*, i32 } %6, 1
  store i32 %8, i32* %ehselector.slot
  call void @_ZdlPv(i8* %call) nounwind
  br label %eh.resume

eh.resume:                                        ; preds = %lpad
  %exn = load i8** %exn.slot
  %sel = load i32* %ehselector.slot
  %lpad.val = insertvalue { i8*, i32 } undef, i8* %exn, 0
  %lpad.val2 = insertvalue { i8*, i32 } %lpad.val, i32 %sel, 1
  resume { i8*, i32 } %lpad.val2
}

define linkonce_odr void @_ZNK5boost16exception_detail10clone_implINS0_19error_info_injectorISt12out_of_rangeEEE7rethrowEv(%"class.boost::exception_detail::clone_impl"* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::exception_detail::clone_impl"*, align 4
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  store %"class.boost::exception_detail::clone_impl"* %this, %"class.boost::exception_detail::clone_impl"** %this.addr, align 4
  %this1 = load %"class.boost::exception_detail::clone_impl"** %this.addr
  %exception = call i8* @__cxa_allocate_exception(i32 32) nounwind
  %0 = bitcast i8* %exception to %"class.boost::exception_detail::clone_impl"*
  invoke void @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorISt12out_of_rangeEEEC1ERKS5_(%"class.boost::exception_detail::clone_impl"* %0, %"class.boost::exception_detail::clone_impl"* %this1)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %entry
  call void @__cxa_throw(i8* %exception, i8* bitcast ({ i8*, i8*, i32, i32, i8*, i32, i8*, i32 }* @_ZTIN5boost16exception_detail10clone_implINS0_19error_info_injectorISt12out_of_rangeEEEE to i8*), i8* bitcast (void (%"class.boost::exception_detail::clone_impl"*)* @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorISt12out_of_rangeEEED1Ev to i8*)) noreturn
  unreachable

lpad:                                             ; preds = %entry
  %1 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %2 = extractvalue { i8*, i32 } %1, 0
  store i8* %2, i8** %exn.slot
  %3 = extractvalue { i8*, i32 } %1, 1
  store i32 %3, i32* %ehselector.slot
  call void @__cxa_free_exception(i8* %exception) nounwind
  br label %eh.resume

return:                                           ; No predecessors!
  ret void

eh.resume:                                        ; preds = %lpad
  %exn = load i8** %exn.slot
  %sel = load i32* %ehselector.slot
  %lpad.val = insertvalue { i8*, i32 } undef, i8* %exn, 0
  %lpad.val2 = insertvalue { i8*, i32 } %lpad.val, i32 %sel, 1
  resume { i8*, i32 } %lpad.val2
}

define linkonce_odr void @_ZThn8_N5boost16exception_detail10clone_implINS0_19error_info_injectorISt12out_of_rangeEEED0Ev(%"class.boost::exception_detail::clone_impl"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::exception_detail::clone_impl"*, align 4
  store %"class.boost::exception_detail::clone_impl"* %this, %"class.boost::exception_detail::clone_impl"** %this.addr, align 4
  %this1 = load %"class.boost::exception_detail::clone_impl"** %this.addr
  %0 = bitcast %"class.boost::exception_detail::clone_impl"* %this1 to i8*
  %1 = getelementptr inbounds i8* %0, i64 -8
  %2 = bitcast i8* %1 to %"class.boost::exception_detail::clone_impl"*
  call void @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorISt12out_of_rangeEEED0Ev(%"class.boost::exception_detail::clone_impl"* %2) nounwind
  ret void
}

define linkonce_odr %"class.boost::exception_detail::clone_base"* @_ZTv0_n12_NK5boost16exception_detail10clone_implINS0_19error_info_injectorISt12out_of_rangeEEE5cloneEv(%"class.boost::exception_detail::clone_impl"* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::exception_detail::clone_impl"*, align 4
  store %"class.boost::exception_detail::clone_impl"* %this, %"class.boost::exception_detail::clone_impl"** %this.addr, align 4
  %this1 = load %"class.boost::exception_detail::clone_impl"** %this.addr
  %0 = bitcast %"class.boost::exception_detail::clone_impl"* %this1 to i8*
  %1 = bitcast i8* %0 to i8**
  %2 = load i8** %1
  %3 = getelementptr inbounds i8* %2, i64 -12
  %4 = bitcast i8* %3 to i32*
  %5 = load i32* %4
  %6 = getelementptr inbounds i8* %0, i32 %5
  %7 = bitcast i8* %6 to %"class.boost::exception_detail::clone_impl"*
  %call = call %"class.boost::exception_detail::clone_base"* @_ZNK5boost16exception_detail10clone_implINS0_19error_info_injectorISt12out_of_rangeEEE5cloneEv(%"class.boost::exception_detail::clone_impl"* %7)
  ret %"class.boost::exception_detail::clone_base"* %call
}

define linkonce_odr void @_ZTv0_n16_NK5boost16exception_detail10clone_implINS0_19error_info_injectorISt12out_of_rangeEEE7rethrowEv(%"class.boost::exception_detail::clone_impl"* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::exception_detail::clone_impl"*, align 4
  store %"class.boost::exception_detail::clone_impl"* %this, %"class.boost::exception_detail::clone_impl"** %this.addr, align 4
  %this1 = load %"class.boost::exception_detail::clone_impl"** %this.addr
  %0 = bitcast %"class.boost::exception_detail::clone_impl"* %this1 to i8*
  %1 = bitcast i8* %0 to i8**
  %2 = load i8** %1
  %3 = getelementptr inbounds i8* %2, i64 -16
  %4 = bitcast i8* %3 to i32*
  %5 = load i32* %4
  %6 = getelementptr inbounds i8* %0, i32 %5
  %7 = bitcast i8* %6 to %"class.boost::exception_detail::clone_impl"*
  call void @_ZNK5boost16exception_detail10clone_implINS0_19error_info_injectorISt12out_of_rangeEEE7rethrowEv(%"class.boost::exception_detail::clone_impl"* %7)
  ret void
}

define linkonce_odr void @_ZTv0_n20_N5boost16exception_detail10clone_implINS0_19error_info_injectorISt12out_of_rangeEEED0Ev(%"class.boost::exception_detail::clone_impl"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::exception_detail::clone_impl"*, align 4
  store %"class.boost::exception_detail::clone_impl"* %this, %"class.boost::exception_detail::clone_impl"** %this.addr, align 4
  %this1 = load %"class.boost::exception_detail::clone_impl"** %this.addr
  %0 = bitcast %"class.boost::exception_detail::clone_impl"* %this1 to i8*
  %1 = bitcast i8* %0 to i8**
  %2 = load i8** %1
  %3 = getelementptr inbounds i8* %2, i64 -20
  %4 = bitcast i8* %3 to i32*
  %5 = load i32* %4
  %6 = getelementptr inbounds i8* %0, i32 %5
  %7 = bitcast i8* %6 to %"class.boost::exception_detail::clone_impl"*
  call void @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorISt12out_of_rangeEEED0Ev(%"class.boost::exception_detail::clone_impl"* %7) nounwind
  ret void
}

declare void @_ZdlPv(i8*) nounwind

define linkonce_odr void @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorISt12out_of_rangeEEEC1ERKS5_(%"class.boost::exception_detail::clone_impl"* %this, %"class.boost::exception_detail::clone_impl"*) unnamed_addr inlinehint align 2 {
entry:
  %this.addr = alloca %"class.boost::exception_detail::clone_impl"*, align 4
  %.addr = alloca %"class.boost::exception_detail::clone_impl"*, align 4
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  store %"class.boost::exception_detail::clone_impl"* %this, %"class.boost::exception_detail::clone_impl"** %this.addr, align 4
  store %"class.boost::exception_detail::clone_impl"* %0, %"class.boost::exception_detail::clone_impl"** %.addr, align 4
  %this1 = load %"class.boost::exception_detail::clone_impl"** %this.addr
  %1 = bitcast %"class.boost::exception_detail::clone_impl"* %this1 to i8*
  %2 = getelementptr inbounds i8* %1, i64 28
  %3 = bitcast i8* %2 to %"class.boost::exception_detail::clone_base"*
  %4 = load %"class.boost::exception_detail::clone_impl"** %.addr, align 4
  %5 = bitcast %"class.boost::exception_detail::clone_impl"* %4 to i8**
  %vtable = load i8** %5
  %vbase.offset.ptr = getelementptr i8* %vtable, i64 -12
  %6 = bitcast i8* %vbase.offset.ptr to i32*
  %vbase.offset = load i32* %6
  %7 = bitcast %"class.boost::exception_detail::clone_impl"* %4 to i8*
  %add.ptr = getelementptr inbounds i8* %7, i32 %vbase.offset
  %8 = bitcast i8* %add.ptr to %"class.boost::exception_detail::clone_base"*
  call void @_ZN5boost16exception_detail10clone_baseC2ERKS1_(%"class.boost::exception_detail::clone_base"* %3, %"class.boost::exception_detail::clone_base"* %8) nounwind
  %9 = bitcast %"class.boost::exception_detail::clone_impl"* %this1 to %"struct.boost::exception_detail::error_info_injector"*
  %10 = load %"class.boost::exception_detail::clone_impl"** %.addr, align 4
  %11 = bitcast %"class.boost::exception_detail::clone_impl"* %10 to %"struct.boost::exception_detail::error_info_injector"*
  invoke void @_ZN5boost16exception_detail19error_info_injectorISt12out_of_rangeEC2ERKS3_(%"struct.boost::exception_detail::error_info_injector"* %9, %"struct.boost::exception_detail::error_info_injector"* %11)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %entry
  %12 = bitcast %"class.boost::exception_detail::clone_impl"* %this1 to i8***
  store i8** getelementptr inbounds ([21 x i8*]* @_ZTVN5boost16exception_detail10clone_implINS0_19error_info_injectorISt12out_of_rangeEEEE, i64 0, i64 3), i8*** %12
  %13 = bitcast %"class.boost::exception_detail::clone_impl"* %this1 to i8*
  %add.ptr2 = getelementptr inbounds i8* %13, i32 8
  %14 = bitcast i8* %add.ptr2 to i8***
  store i8** getelementptr inbounds ([21 x i8*]* @_ZTVN5boost16exception_detail10clone_implINS0_19error_info_injectorISt12out_of_rangeEEEE, i64 0, i64 10), i8*** %14
  %15 = bitcast %"class.boost::exception_detail::clone_impl"* %this1 to i8*
  %add.ptr3 = getelementptr inbounds i8* %15, i32 28
  %16 = bitcast i8* %add.ptr3 to i8***
  store i8** getelementptr inbounds ([21 x i8*]* @_ZTVN5boost16exception_detail10clone_implINS0_19error_info_injectorISt12out_of_rangeEEEE, i64 0, i64 17), i8*** %16
  ret void

lpad:                                             ; preds = %entry
  %17 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %18 = extractvalue { i8*, i32 } %17, 0
  store i8* %18, i8** %exn.slot
  %19 = extractvalue { i8*, i32 } %17, 1
  store i32 %19, i32* %ehselector.slot
  %20 = bitcast %"class.boost::exception_detail::clone_impl"* %this1 to i8*
  %21 = getelementptr inbounds i8* %20, i64 28
  %22 = bitcast i8* %21 to %"class.boost::exception_detail::clone_base"*
  call void @_ZN5boost16exception_detail10clone_baseD2Ev(%"class.boost::exception_detail::clone_base"* %22) nounwind
  br label %eh.resume

eh.resume:                                        ; preds = %lpad
  %exn = load i8** %exn.slot
  %sel = load i32* %ehselector.slot
  %lpad.val = insertvalue { i8*, i32 } undef, i8* %exn, 0
  %lpad.val4 = insertvalue { i8*, i32 } %lpad.val, i32 %sel, 1
  resume { i8*, i32 } %lpad.val4
}

define linkonce_odr void @_ZN5boost16exception_detail10clone_baseC2ERKS1_(%"class.boost::exception_detail::clone_base"* %this, %"class.boost::exception_detail::clone_base"*) unnamed_addr nounwind inlinehint align 2 {
entry:
  %this.addr = alloca %"class.boost::exception_detail::clone_base"*, align 4
  %.addr = alloca %"class.boost::exception_detail::clone_base"*, align 4
  store %"class.boost::exception_detail::clone_base"* %this, %"class.boost::exception_detail::clone_base"** %this.addr, align 4
  store %"class.boost::exception_detail::clone_base"* %0, %"class.boost::exception_detail::clone_base"** %.addr, align 4
  %this1 = load %"class.boost::exception_detail::clone_base"** %this.addr
  %1 = bitcast %"class.boost::exception_detail::clone_base"* %this1 to i8***
  store i8** getelementptr inbounds ([6 x i8*]* @_ZTVN5boost16exception_detail10clone_baseE, i64 0, i64 2), i8*** %1
  ret void
}

define linkonce_odr void @_ZN5boost16exception_detail19error_info_injectorISt12out_of_rangeEC2ERKS3_(%"struct.boost::exception_detail::error_info_injector"* %this, %"struct.boost::exception_detail::error_info_injector"*) unnamed_addr inlinehint align 2 {
entry:
  %this.addr = alloca %"struct.boost::exception_detail::error_info_injector"*, align 4
  %.addr = alloca %"struct.boost::exception_detail::error_info_injector"*, align 4
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  store %"struct.boost::exception_detail::error_info_injector"* %this, %"struct.boost::exception_detail::error_info_injector"** %this.addr, align 4
  store %"struct.boost::exception_detail::error_info_injector"* %0, %"struct.boost::exception_detail::error_info_injector"** %.addr, align 4
  %this1 = load %"struct.boost::exception_detail::error_info_injector"** %this.addr
  %1 = bitcast %"struct.boost::exception_detail::error_info_injector"* %this1 to %"class.std::out_of_range"*
  %2 = load %"struct.boost::exception_detail::error_info_injector"** %.addr, align 4
  %3 = bitcast %"struct.boost::exception_detail::error_info_injector"* %2 to %"class.std::out_of_range"*
  call void @_ZNSt12out_of_rangeC2ERKS_(%"class.std::out_of_range"* %1, %"class.std::out_of_range"* %3)
  %4 = bitcast %"struct.boost::exception_detail::error_info_injector"* %this1 to i8*
  %5 = getelementptr inbounds i8* %4, i64 8
  %6 = bitcast i8* %5 to %"class.boost::exception"*
  %7 = load %"struct.boost::exception_detail::error_info_injector"** %.addr, align 4
  %8 = bitcast %"struct.boost::exception_detail::error_info_injector"* %7 to i8*
  %add.ptr = getelementptr inbounds i8* %8, i32 8
  %9 = bitcast i8* %add.ptr to %"class.boost::exception"*
  invoke void @_ZN5boost9exceptionC2ERKS0_(%"class.boost::exception"* %6, %"class.boost::exception"* %9)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %entry
  %10 = bitcast %"struct.boost::exception_detail::error_info_injector"* %this1 to i8***
  store i8** getelementptr inbounds ([9 x i8*]* @_ZTVN5boost16exception_detail19error_info_injectorISt12out_of_rangeEE, i64 0, i64 2), i8*** %10
  %11 = bitcast %"struct.boost::exception_detail::error_info_injector"* %this1 to i8*
  %add.ptr2 = getelementptr inbounds i8* %11, i32 8
  %12 = bitcast i8* %add.ptr2 to i8***
  store i8** getelementptr inbounds ([9 x i8*]* @_ZTVN5boost16exception_detail19error_info_injectorISt12out_of_rangeEE, i64 0, i64 7), i8*** %12
  ret void

lpad:                                             ; preds = %entry
  %13 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %14 = extractvalue { i8*, i32 } %13, 0
  store i8* %14, i8** %exn.slot
  %15 = extractvalue { i8*, i32 } %13, 1
  store i32 %15, i32* %ehselector.slot
  %16 = bitcast %"struct.boost::exception_detail::error_info_injector"* %this1 to %"class.std::out_of_range"*
  call void @_ZNSt12out_of_rangeD2Ev(%"class.std::out_of_range"* %16) nounwind
  br label %eh.resume

eh.resume:                                        ; preds = %lpad
  %exn = load i8** %exn.slot
  %sel = load i32* %ehselector.slot
  %lpad.val = insertvalue { i8*, i32 } undef, i8* %exn, 0
  %lpad.val3 = insertvalue { i8*, i32 } %lpad.val, i32 %sel, 1
  resume { i8*, i32 } %lpad.val3
}

define linkonce_odr void @_ZNSt12out_of_rangeC2ERKS_(%"class.std::out_of_range"* %this, %"class.std::out_of_range"*) unnamed_addr inlinehint align 2 {
entry:
  %this.addr = alloca %"class.std::out_of_range"*, align 4
  %.addr = alloca %"class.std::out_of_range"*, align 4
  store %"class.std::out_of_range"* %this, %"class.std::out_of_range"** %this.addr, align 4
  store %"class.std::out_of_range"* %0, %"class.std::out_of_range"** %.addr, align 4
  %this1 = load %"class.std::out_of_range"** %this.addr
  %1 = bitcast %"class.std::out_of_range"* %this1 to %"class.std::logic_error"*
  %2 = load %"class.std::out_of_range"** %.addr, align 4
  %3 = bitcast %"class.std::out_of_range"* %2 to %"class.std::logic_error"*
  call void @_ZNSt11logic_errorC2ERKS_(%"class.std::logic_error"* %1, %"class.std::logic_error"* %3)
  %4 = bitcast %"class.std::out_of_range"* %this1 to i8***
  store i8** getelementptr inbounds ([5 x i8*]* @_ZTVSt12out_of_range, i64 0, i64 2), i8*** %4
  ret void
}

define linkonce_odr void @_ZN5boost9exceptionC2ERKS0_(%"class.boost::exception"* %this, %"class.boost::exception"*) unnamed_addr inlinehint align 2 {
entry:
  %this.addr = alloca %"class.boost::exception"*, align 4
  %.addr = alloca %"class.boost::exception"*, align 4
  store %"class.boost::exception"* %this, %"class.boost::exception"** %this.addr, align 4
  store %"class.boost::exception"* %0, %"class.boost::exception"** %.addr, align 4
  %this1 = load %"class.boost::exception"** %this.addr
  %1 = bitcast %"class.boost::exception"* %this1 to i8***
  store i8** getelementptr inbounds ([4 x i8*]* @_ZTVN5boost9exceptionE, i64 0, i64 2), i8*** %1
  %data_ = getelementptr inbounds %"class.boost::exception"* %this1, i32 0, i32 1
  %2 = load %"class.boost::exception"** %.addr, align 4
  %data_2 = getelementptr inbounds %"class.boost::exception"* %2, i32 0, i32 1
  call void @_ZN5boost16exception_detail12refcount_ptrINS0_20error_info_containerEEC1ERKS3_(%"class.boost::exception_detail::refcount_ptr"* %data_, %"class.boost::exception_detail::refcount_ptr"* %data_2)
  %throw_function_ = getelementptr inbounds %"class.boost::exception"* %this1, i32 0, i32 2
  %3 = load %"class.boost::exception"** %.addr, align 4
  %throw_function_3 = getelementptr inbounds %"class.boost::exception"* %3, i32 0, i32 2
  %4 = load i8** %throw_function_3, align 4
  store i8* %4, i8** %throw_function_, align 4
  %throw_file_ = getelementptr inbounds %"class.boost::exception"* %this1, i32 0, i32 3
  %5 = load %"class.boost::exception"** %.addr, align 4
  %throw_file_4 = getelementptr inbounds %"class.boost::exception"* %5, i32 0, i32 3
  %6 = load i8** %throw_file_4, align 4
  store i8* %6, i8** %throw_file_, align 4
  %throw_line_ = getelementptr inbounds %"class.boost::exception"* %this1, i32 0, i32 4
  %7 = load %"class.boost::exception"** %.addr, align 4
  %throw_line_5 = getelementptr inbounds %"class.boost::exception"* %7, i32 0, i32 4
  %8 = load i32* %throw_line_5, align 4
  store i32 %8, i32* %throw_line_, align 4
  ret void
}

define linkonce_odr void @_ZN5boost16exception_detail19error_info_injectorISt12out_of_rangeED0Ev(%"struct.boost::exception_detail::error_info_injector"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"struct.boost::exception_detail::error_info_injector"*, align 4
  store %"struct.boost::exception_detail::error_info_injector"* %this, %"struct.boost::exception_detail::error_info_injector"** %this.addr, align 4
  %this1 = load %"struct.boost::exception_detail::error_info_injector"** %this.addr
  call void @_ZN5boost16exception_detail19error_info_injectorISt12out_of_rangeED1Ev(%"struct.boost::exception_detail::error_info_injector"* %this1) nounwind
  %0 = bitcast %"struct.boost::exception_detail::error_info_injector"* %this1 to i8*
  call void @_ZdlPv(i8* %0) nounwind
  ret void
}

define linkonce_odr void @_ZThn8_N5boost16exception_detail19error_info_injectorISt12out_of_rangeED0Ev(%"struct.boost::exception_detail::error_info_injector"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"struct.boost::exception_detail::error_info_injector"*, align 4
  store %"struct.boost::exception_detail::error_info_injector"* %this, %"struct.boost::exception_detail::error_info_injector"** %this.addr, align 4
  %this1 = load %"struct.boost::exception_detail::error_info_injector"** %this.addr
  %0 = bitcast %"struct.boost::exception_detail::error_info_injector"* %this1 to i8*
  %1 = getelementptr inbounds i8* %0, i64 -8
  %2 = bitcast i8* %1 to %"struct.boost::exception_detail::error_info_injector"*
  call void @_ZN5boost16exception_detail19error_info_injectorISt12out_of_rangeED0Ev(%"struct.boost::exception_detail::error_info_injector"* %2) nounwind
  ret void
}

define linkonce_odr void @_ZN5boost16exception_detail12refcount_ptrINS0_20error_info_containerEEC1ERKS3_(%"class.boost::exception_detail::refcount_ptr"* %this, %"class.boost::exception_detail::refcount_ptr"* %x) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::exception_detail::refcount_ptr"*, align 4
  %x.addr = alloca %"class.boost::exception_detail::refcount_ptr"*, align 4
  store %"class.boost::exception_detail::refcount_ptr"* %this, %"class.boost::exception_detail::refcount_ptr"** %this.addr, align 4
  store %"class.boost::exception_detail::refcount_ptr"* %x, %"class.boost::exception_detail::refcount_ptr"** %x.addr, align 4
  %this1 = load %"class.boost::exception_detail::refcount_ptr"** %this.addr
  %0 = load %"class.boost::exception_detail::refcount_ptr"** %x.addr
  call void @_ZN5boost16exception_detail12refcount_ptrINS0_20error_info_containerEEC2ERKS3_(%"class.boost::exception_detail::refcount_ptr"* %this1, %"class.boost::exception_detail::refcount_ptr"* %0)
  ret void
}

define linkonce_odr void @_ZN5boost16exception_detail12refcount_ptrINS0_20error_info_containerEEC2ERKS3_(%"class.boost::exception_detail::refcount_ptr"* %this, %"class.boost::exception_detail::refcount_ptr"* %x) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::exception_detail::refcount_ptr"*, align 4
  %x.addr = alloca %"class.boost::exception_detail::refcount_ptr"*, align 4
  store %"class.boost::exception_detail::refcount_ptr"* %this, %"class.boost::exception_detail::refcount_ptr"** %this.addr, align 4
  store %"class.boost::exception_detail::refcount_ptr"* %x, %"class.boost::exception_detail::refcount_ptr"** %x.addr, align 4
  %this1 = load %"class.boost::exception_detail::refcount_ptr"** %this.addr
  %px_ = getelementptr inbounds %"class.boost::exception_detail::refcount_ptr"* %this1, i32 0, i32 0
  %0 = load %"class.boost::exception_detail::refcount_ptr"** %x.addr, align 4
  %px_2 = getelementptr inbounds %"class.boost::exception_detail::refcount_ptr"* %0, i32 0, i32 0
  %1 = load %"struct.boost::exception_detail::error_info_container"** %px_2, align 4
  store %"struct.boost::exception_detail::error_info_container"* %1, %"struct.boost::exception_detail::error_info_container"** %px_, align 4
  call void @_ZN5boost16exception_detail12refcount_ptrINS0_20error_info_containerEE7add_refEv(%"class.boost::exception_detail::refcount_ptr"* %this1)
  ret void
}

define linkonce_odr void @_ZN5boost16exception_detail12refcount_ptrINS0_20error_info_containerEE7add_refEv(%"class.boost::exception_detail::refcount_ptr"* %this) align 2 {
entry:
  %this.addr = alloca %"class.boost::exception_detail::refcount_ptr"*, align 4
  store %"class.boost::exception_detail::refcount_ptr"* %this, %"class.boost::exception_detail::refcount_ptr"** %this.addr, align 4
  %this1 = load %"class.boost::exception_detail::refcount_ptr"** %this.addr
  %px_ = getelementptr inbounds %"class.boost::exception_detail::refcount_ptr"* %this1, i32 0, i32 0
  %0 = load %"struct.boost::exception_detail::error_info_container"** %px_, align 4
  %tobool = icmp ne %"struct.boost::exception_detail::error_info_container"* %0, null
  br i1 %tobool, label %if.then, label %if.end

if.then:                                          ; preds = %entry
  %px_2 = getelementptr inbounds %"class.boost::exception_detail::refcount_ptr"* %this1, i32 0, i32 0
  %1 = load %"struct.boost::exception_detail::error_info_container"** %px_2, align 4
  %2 = bitcast %"struct.boost::exception_detail::error_info_container"* %1 to void (%"struct.boost::exception_detail::error_info_container"*)***
  %vtable = load void (%"struct.boost::exception_detail::error_info_container"*)*** %2
  %vfn = getelementptr inbounds void (%"struct.boost::exception_detail::error_info_container"*)** %vtable, i64 3
  %3 = load void (%"struct.boost::exception_detail::error_info_container"*)** %vfn
  call void %3(%"struct.boost::exception_detail::error_info_container"* %1)
  br label %if.end

if.end:                                           ; preds = %if.then, %entry
  ret void
}

define linkonce_odr void @_ZNSt11logic_errorC2ERKS_(%"class.std::logic_error"* %this, %"class.std::logic_error"*) unnamed_addr inlinehint align 2 {
entry:
  %this.addr = alloca %"class.std::logic_error"*, align 4
  %.addr = alloca %"class.std::logic_error"*, align 4
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  store %"class.std::logic_error"* %this, %"class.std::logic_error"** %this.addr, align 4
  store %"class.std::logic_error"* %0, %"class.std::logic_error"** %.addr, align 4
  %this1 = load %"class.std::logic_error"** %this.addr
  %1 = bitcast %"class.std::logic_error"* %this1 to %"class.std::exception"*
  %2 = load %"class.std::logic_error"** %.addr, align 4
  %3 = bitcast %"class.std::logic_error"* %2 to %"class.std::exception"*
  call void @_ZNSt9exceptionC2ERKS_(%"class.std::exception"* %1, %"class.std::exception"* %3) nounwind
  %4 = bitcast %"class.std::logic_error"* %this1 to i8***
  store i8** getelementptr inbounds ([5 x i8*]* @_ZTVSt11logic_error, i64 0, i64 2), i8*** %4
  %_M_msg = getelementptr inbounds %"class.std::logic_error"* %this1, i32 0, i32 1
  %5 = load %"class.std::logic_error"** %.addr, align 4
  %_M_msg2 = getelementptr inbounds %"class.std::logic_error"* %5, i32 0, i32 1
  invoke void @_ZNSsC1ERKSs(%"class.std::basic_string"* %_M_msg, %"class.std::basic_string"* %_M_msg2)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %entry
  ret void

lpad:                                             ; preds = %entry
  %6 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %7 = extractvalue { i8*, i32 } %6, 0
  store i8* %7, i8** %exn.slot
  %8 = extractvalue { i8*, i32 } %6, 1
  store i32 %8, i32* %ehselector.slot
  %9 = bitcast %"class.std::logic_error"* %this1 to %"class.std::exception"*
  call void @_ZNSt9exceptionD2Ev(%"class.std::exception"* %9) nounwind
  br label %eh.resume

eh.resume:                                        ; preds = %lpad
  %exn = load i8** %exn.slot
  %sel = load i32* %ehselector.slot
  %lpad.val = insertvalue { i8*, i32 } undef, i8* %exn, 0
  %lpad.val3 = insertvalue { i8*, i32 } %lpad.val, i32 %sel, 1
  resume { i8*, i32 } %lpad.val3
}

define linkonce_odr void @_ZNSt9exceptionC2ERKS_(%"class.std::exception"* %this, %"class.std::exception"*) unnamed_addr nounwind inlinehint align 2 {
entry:
  %this.addr = alloca %"class.std::exception"*, align 4
  %.addr = alloca %"class.std::exception"*, align 4
  store %"class.std::exception"* %this, %"class.std::exception"** %this.addr, align 4
  store %"class.std::exception"* %0, %"class.std::exception"** %.addr, align 4
  %this1 = load %"class.std::exception"** %this.addr
  %1 = bitcast %"class.std::exception"* %this1 to i8***
  store i8** getelementptr inbounds ([5 x i8*]* @_ZTVSt9exception, i64 0, i64 2), i8*** %1
  ret void
}

declare void @_ZNSsC1ERKSs(%"class.std::basic_string"*, %"class.std::basic_string"*)

declare void @_ZNSt9exceptionD2Ev(%"class.std::exception"*) nounwind

define linkonce_odr void @_ZN5boost16exception_detail10clone_baseD1Ev(%"class.boost::exception_detail::clone_base"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::exception_detail::clone_base"*, align 4
  store %"class.boost::exception_detail::clone_base"* %this, %"class.boost::exception_detail::clone_base"** %this.addr, align 4
  %this1 = load %"class.boost::exception_detail::clone_base"** %this.addr
  call void @_ZN5boost16exception_detail10clone_baseD2Ev(%"class.boost::exception_detail::clone_base"* %this1) nounwind
  ret void
}

define linkonce_odr void @_ZN5boost16exception_detail10clone_baseD0Ev(%"class.boost::exception_detail::clone_base"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::exception_detail::clone_base"*, align 4
  store %"class.boost::exception_detail::clone_base"* %this, %"class.boost::exception_detail::clone_base"** %this.addr, align 4
  %this1 = load %"class.boost::exception_detail::clone_base"** %this.addr
  call void @_ZN5boost16exception_detail10clone_baseD1Ev(%"class.boost::exception_detail::clone_base"* %this1) nounwind
  %0 = bitcast %"class.boost::exception_detail::clone_base"* %this1 to i8*
  call void @_ZdlPv(i8* %0) nounwind
  ret void
}

declare noalias i8* @_Znwj(i32)

define linkonce_odr void @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorISt12out_of_rangeEEEC1ERKS5_NS5_9clone_tagE(%"class.boost::exception_detail::clone_impl"* %this, %"class.boost::exception_detail::clone_impl"* %x) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::exception_detail::clone_impl"*, align 4
  %x.addr = alloca %"class.boost::exception_detail::clone_impl"*, align 4
  %0 = alloca %"struct.boost::exception_detail::clone_impl<boost::exception_detail::error_info_injector<std::out_of_range> >::clone_tag", align 1
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  store %"class.boost::exception_detail::clone_impl"* %this, %"class.boost::exception_detail::clone_impl"** %this.addr, align 4
  store %"class.boost::exception_detail::clone_impl"* %x, %"class.boost::exception_detail::clone_impl"** %x.addr, align 4
  %this1 = load %"class.boost::exception_detail::clone_impl"** %this.addr
  %1 = bitcast %"class.boost::exception_detail::clone_impl"* %this1 to i8*
  %2 = getelementptr inbounds i8* %1, i64 28
  %3 = bitcast i8* %2 to %"class.boost::exception_detail::clone_base"*
  call void @_ZN5boost16exception_detail10clone_baseC2Ev(%"class.boost::exception_detail::clone_base"* %3) nounwind
  %4 = bitcast %"class.boost::exception_detail::clone_impl"* %this1 to %"struct.boost::exception_detail::error_info_injector"*
  %5 = load %"class.boost::exception_detail::clone_impl"** %x.addr, align 4
  %6 = bitcast %"class.boost::exception_detail::clone_impl"* %5 to %"struct.boost::exception_detail::error_info_injector"*
  invoke void @_ZN5boost16exception_detail19error_info_injectorISt12out_of_rangeEC2ERKS3_(%"struct.boost::exception_detail::error_info_injector"* %4, %"struct.boost::exception_detail::error_info_injector"* %6)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %entry
  %7 = bitcast %"class.boost::exception_detail::clone_impl"* %this1 to i8***
  store i8** getelementptr inbounds ([21 x i8*]* @_ZTVN5boost16exception_detail10clone_implINS0_19error_info_injectorISt12out_of_rangeEEEE, i64 0, i64 3), i8*** %7
  %8 = bitcast %"class.boost::exception_detail::clone_impl"* %this1 to i8*
  %add.ptr = getelementptr inbounds i8* %8, i32 8
  %9 = bitcast i8* %add.ptr to i8***
  store i8** getelementptr inbounds ([21 x i8*]* @_ZTVN5boost16exception_detail10clone_implINS0_19error_info_injectorISt12out_of_rangeEEEE, i64 0, i64 10), i8*** %9
  %10 = bitcast %"class.boost::exception_detail::clone_impl"* %this1 to i8*
  %add.ptr2 = getelementptr inbounds i8* %10, i32 28
  %11 = bitcast i8* %add.ptr2 to i8***
  store i8** getelementptr inbounds ([21 x i8*]* @_ZTVN5boost16exception_detail10clone_implINS0_19error_info_injectorISt12out_of_rangeEEEE, i64 0, i64 17), i8*** %11
  %12 = bitcast %"class.boost::exception_detail::clone_impl"* %this1 to i8*
  %add.ptr3 = getelementptr inbounds i8* %12, i32 8
  %13 = bitcast i8* %add.ptr3 to %"class.boost::exception"*
  %14 = load %"class.boost::exception_detail::clone_impl"** %x.addr, align 4
  %15 = icmp eq %"class.boost::exception_detail::clone_impl"* %14, null
  br i1 %15, label %cast.end, label %cast.notnull

cast.notnull:                                     ; preds = %invoke.cont
  %16 = bitcast %"class.boost::exception_detail::clone_impl"* %14 to i8*
  %add.ptr4 = getelementptr inbounds i8* %16, i32 8
  %17 = bitcast i8* %add.ptr4 to %"class.boost::exception"*
  br label %cast.end

cast.end:                                         ; preds = %cast.notnull, %invoke.cont
  %cast.result = phi %"class.boost::exception"* [ %17, %cast.notnull ], [ null, %invoke.cont ]
  invoke void @_ZN5boost16exception_detail20copy_boost_exceptionEPNS_9exceptionEPKS1_(%"class.boost::exception"* %13, %"class.boost::exception"* %cast.result)
          to label %invoke.cont6 unwind label %lpad5

invoke.cont6:                                     ; preds = %cast.end
  ret void

lpad:                                             ; preds = %entry
  %18 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %19 = extractvalue { i8*, i32 } %18, 0
  store i8* %19, i8** %exn.slot
  %20 = extractvalue { i8*, i32 } %18, 1
  store i32 %20, i32* %ehselector.slot
  br label %ehcleanup

lpad5:                                            ; preds = %cast.end
  %21 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %22 = extractvalue { i8*, i32 } %21, 0
  store i8* %22, i8** %exn.slot
  %23 = extractvalue { i8*, i32 } %21, 1
  store i32 %23, i32* %ehselector.slot
  %24 = bitcast %"class.boost::exception_detail::clone_impl"* %this1 to %"struct.boost::exception_detail::error_info_injector"*
  call void @_ZN5boost16exception_detail19error_info_injectorISt12out_of_rangeED2Ev(%"struct.boost::exception_detail::error_info_injector"* %24) nounwind
  br label %ehcleanup

ehcleanup:                                        ; preds = %lpad5, %lpad
  %25 = bitcast %"class.boost::exception_detail::clone_impl"* %this1 to i8*
  %26 = getelementptr inbounds i8* %25, i64 28
  %27 = bitcast i8* %26 to %"class.boost::exception_detail::clone_base"*
  call void @_ZN5boost16exception_detail10clone_baseD2Ev(%"class.boost::exception_detail::clone_base"* %27) nounwind
  br label %eh.resume

eh.resume:                                        ; preds = %ehcleanup
  %exn = load i8** %exn.slot
  %sel = load i32* %ehselector.slot
  %lpad.val = insertvalue { i8*, i32 } undef, i8* %exn, 0
  %lpad.val7 = insertvalue { i8*, i32 } %lpad.val, i32 %sel, 1
  resume { i8*, i32 } %lpad.val7
}

define linkonce_odr void @_ZN5boost16exception_detail10clone_baseC2Ev(%"class.boost::exception_detail::clone_base"* %this) unnamed_addr nounwind inlinehint align 2 {
entry:
  %this.addr = alloca %"class.boost::exception_detail::clone_base"*, align 4
  store %"class.boost::exception_detail::clone_base"* %this, %"class.boost::exception_detail::clone_base"** %this.addr, align 4
  %this1 = load %"class.boost::exception_detail::clone_base"** %this.addr
  %0 = bitcast %"class.boost::exception_detail::clone_base"* %this1 to i8***
  store i8** getelementptr inbounds ([6 x i8*]* @_ZTVN5boost16exception_detail10clone_baseE, i64 0, i64 2), i8*** %0
  ret void
}

define linkonce_odr void @_ZN5boost16exception_detail20copy_boost_exceptionEPNS_9exceptionEPKS1_(%"class.boost::exception"* %a, %"class.boost::exception"* %b) inlinehint {
entry:
  %a.addr = alloca %"class.boost::exception"*, align 4
  %b.addr = alloca %"class.boost::exception"*, align 4
  %data = alloca %"class.boost::exception_detail::refcount_ptr", align 4
  %d = alloca %"struct.boost::exception_detail::error_info_container"*, align 4
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  %ref.tmp = alloca %"class.boost::exception_detail::refcount_ptr", align 4
  store %"class.boost::exception"* %a, %"class.boost::exception"** %a.addr, align 4
  store %"class.boost::exception"* %b, %"class.boost::exception"** %b.addr, align 4
  call void @_ZN5boost16exception_detail12refcount_ptrINS0_20error_info_containerEEC1Ev(%"class.boost::exception_detail::refcount_ptr"* %data)
  %0 = load %"class.boost::exception"** %b.addr, align 4
  %data_ = getelementptr inbounds %"class.boost::exception"* %0, i32 0, i32 1
  %call = invoke %"struct.boost::exception_detail::error_info_container"* @_ZNK5boost16exception_detail12refcount_ptrINS0_20error_info_containerEE3getEv(%"class.boost::exception_detail::refcount_ptr"* %data_)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %entry
  store %"struct.boost::exception_detail::error_info_container"* %call, %"struct.boost::exception_detail::error_info_container"** %d, align 4
  %1 = load %"struct.boost::exception_detail::error_info_container"** %d, align 4
  %tobool = icmp ne %"struct.boost::exception_detail::error_info_container"* %1, null
  br i1 %tobool, label %if.then, label %if.end

if.then:                                          ; preds = %invoke.cont
  %2 = load %"struct.boost::exception_detail::error_info_container"** %d, align 4
  %3 = bitcast %"struct.boost::exception_detail::error_info_container"* %2 to void (%"class.boost::exception_detail::refcount_ptr"*, %"struct.boost::exception_detail::error_info_container"*)***
  %vtable = load void (%"class.boost::exception_detail::refcount_ptr"*, %"struct.boost::exception_detail::error_info_container"*)*** %3
  %vfn = getelementptr inbounds void (%"class.boost::exception_detail::refcount_ptr"*, %"struct.boost::exception_detail::error_info_container"*)** %vtable, i64 5
  %4 = load void (%"class.boost::exception_detail::refcount_ptr"*, %"struct.boost::exception_detail::error_info_container"*)** %vfn
  invoke void %4(%"class.boost::exception_detail::refcount_ptr"* sret %ref.tmp, %"struct.boost::exception_detail::error_info_container"* %2)
          to label %invoke.cont1 unwind label %lpad

invoke.cont1:                                     ; preds = %if.then
  %call4 = invoke %"class.boost::exception_detail::refcount_ptr"* @_ZN5boost16exception_detail12refcount_ptrINS0_20error_info_containerEEaSERKS3_(%"class.boost::exception_detail::refcount_ptr"* %data, %"class.boost::exception_detail::refcount_ptr"* %ref.tmp)
          to label %invoke.cont3 unwind label %lpad2

invoke.cont3:                                     ; preds = %invoke.cont1
  invoke void @_ZN5boost16exception_detail12refcount_ptrINS0_20error_info_containerEED1Ev(%"class.boost::exception_detail::refcount_ptr"* %ref.tmp)
          to label %invoke.cont5 unwind label %lpad

invoke.cont5:                                     ; preds = %invoke.cont3
  br label %if.end

lpad:                                             ; preds = %if.end, %invoke.cont3, %if.then, %entry
  %5 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %6 = extractvalue { i8*, i32 } %5, 0
  store i8* %6, i8** %exn.slot
  %7 = extractvalue { i8*, i32 } %5, 1
  store i32 %7, i32* %ehselector.slot
  br label %ehcleanup

lpad2:                                            ; preds = %invoke.cont1
  %8 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %9 = extractvalue { i8*, i32 } %8, 0
  store i8* %9, i8** %exn.slot
  %10 = extractvalue { i8*, i32 } %8, 1
  store i32 %10, i32* %ehselector.slot
  invoke void @_ZN5boost16exception_detail12refcount_ptrINS0_20error_info_containerEED1Ev(%"class.boost::exception_detail::refcount_ptr"* %ref.tmp)
          to label %invoke.cont6 unwind label %terminate.lpad

invoke.cont6:                                     ; preds = %lpad2
  br label %ehcleanup

if.end:                                           ; preds = %invoke.cont5, %invoke.cont
  %11 = load %"class.boost::exception"** %b.addr, align 4
  %throw_file_ = getelementptr inbounds %"class.boost::exception"* %11, i32 0, i32 3
  %12 = load i8** %throw_file_, align 4
  %13 = load %"class.boost::exception"** %a.addr, align 4
  %throw_file_7 = getelementptr inbounds %"class.boost::exception"* %13, i32 0, i32 3
  store i8* %12, i8** %throw_file_7, align 4
  %14 = load %"class.boost::exception"** %b.addr, align 4
  %throw_line_ = getelementptr inbounds %"class.boost::exception"* %14, i32 0, i32 4
  %15 = load i32* %throw_line_, align 4
  %16 = load %"class.boost::exception"** %a.addr, align 4
  %throw_line_8 = getelementptr inbounds %"class.boost::exception"* %16, i32 0, i32 4
  store i32 %15, i32* %throw_line_8, align 4
  %17 = load %"class.boost::exception"** %b.addr, align 4
  %throw_function_ = getelementptr inbounds %"class.boost::exception"* %17, i32 0, i32 2
  %18 = load i8** %throw_function_, align 4
  %19 = load %"class.boost::exception"** %a.addr, align 4
  %throw_function_9 = getelementptr inbounds %"class.boost::exception"* %19, i32 0, i32 2
  store i8* %18, i8** %throw_function_9, align 4
  %20 = load %"class.boost::exception"** %a.addr, align 4
  %data_10 = getelementptr inbounds %"class.boost::exception"* %20, i32 0, i32 1
  %call12 = invoke %"class.boost::exception_detail::refcount_ptr"* @_ZN5boost16exception_detail12refcount_ptrINS0_20error_info_containerEEaSERKS3_(%"class.boost::exception_detail::refcount_ptr"* %data_10, %"class.boost::exception_detail::refcount_ptr"* %data)
          to label %invoke.cont11 unwind label %lpad

invoke.cont11:                                    ; preds = %if.end
  call void @_ZN5boost16exception_detail12refcount_ptrINS0_20error_info_containerEED1Ev(%"class.boost::exception_detail::refcount_ptr"* %data)
  ret void

ehcleanup:                                        ; preds = %invoke.cont6, %lpad
  invoke void @_ZN5boost16exception_detail12refcount_ptrINS0_20error_info_containerEED1Ev(%"class.boost::exception_detail::refcount_ptr"* %data)
          to label %invoke.cont13 unwind label %terminate.lpad

invoke.cont13:                                    ; preds = %ehcleanup
  br label %eh.resume

eh.resume:                                        ; preds = %invoke.cont13
  %exn = load i8** %exn.slot
  %sel = load i32* %ehselector.slot
  %lpad.val = insertvalue { i8*, i32 } undef, i8* %exn, 0
  %lpad.val14 = insertvalue { i8*, i32 } %lpad.val, i32 %sel, 1
  resume { i8*, i32 } %lpad.val14

terminate.lpad:                                   ; preds = %ehcleanup, %lpad2
  %21 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          catch i8* null
  call void @_ZSt9terminatev() noreturn nounwind
  unreachable
}

define linkonce_odr void @_ZN5boost16exception_detail12refcount_ptrINS0_20error_info_containerEEC1Ev(%"class.boost::exception_detail::refcount_ptr"* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::exception_detail::refcount_ptr"*, align 4
  store %"class.boost::exception_detail::refcount_ptr"* %this, %"class.boost::exception_detail::refcount_ptr"** %this.addr, align 4
  %this1 = load %"class.boost::exception_detail::refcount_ptr"** %this.addr
  call void @_ZN5boost16exception_detail12refcount_ptrINS0_20error_info_containerEEC2Ev(%"class.boost::exception_detail::refcount_ptr"* %this1)
  ret void
}

define linkonce_odr %"struct.boost::exception_detail::error_info_container"* @_ZNK5boost16exception_detail12refcount_ptrINS0_20error_info_containerEE3getEv(%"class.boost::exception_detail::refcount_ptr"* %this) nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::exception_detail::refcount_ptr"*, align 4
  store %"class.boost::exception_detail::refcount_ptr"* %this, %"class.boost::exception_detail::refcount_ptr"** %this.addr, align 4
  %this1 = load %"class.boost::exception_detail::refcount_ptr"** %this.addr
  %px_ = getelementptr inbounds %"class.boost::exception_detail::refcount_ptr"* %this1, i32 0, i32 0
  %0 = load %"struct.boost::exception_detail::error_info_container"** %px_, align 4
  ret %"struct.boost::exception_detail::error_info_container"* %0
}

define linkonce_odr %"class.boost::exception_detail::refcount_ptr"* @_ZN5boost16exception_detail12refcount_ptrINS0_20error_info_containerEEaSERKS3_(%"class.boost::exception_detail::refcount_ptr"* %this, %"class.boost::exception_detail::refcount_ptr"* %x) align 2 {
entry:
  %this.addr = alloca %"class.boost::exception_detail::refcount_ptr"*, align 4
  %x.addr = alloca %"class.boost::exception_detail::refcount_ptr"*, align 4
  store %"class.boost::exception_detail::refcount_ptr"* %this, %"class.boost::exception_detail::refcount_ptr"** %this.addr, align 4
  store %"class.boost::exception_detail::refcount_ptr"* %x, %"class.boost::exception_detail::refcount_ptr"** %x.addr, align 4
  %this1 = load %"class.boost::exception_detail::refcount_ptr"** %this.addr
  %0 = load %"class.boost::exception_detail::refcount_ptr"** %x.addr, align 4
  %px_ = getelementptr inbounds %"class.boost::exception_detail::refcount_ptr"* %0, i32 0, i32 0
  %1 = load %"struct.boost::exception_detail::error_info_container"** %px_, align 4
  call void @_ZN5boost16exception_detail12refcount_ptrINS0_20error_info_containerEE5adoptEPS2_(%"class.boost::exception_detail::refcount_ptr"* %this1, %"struct.boost::exception_detail::error_info_container"* %1)
  ret %"class.boost::exception_detail::refcount_ptr"* %this1
}

define linkonce_odr void @_ZN5boost16exception_detail12refcount_ptrINS0_20error_info_containerEE5adoptEPS2_(%"class.boost::exception_detail::refcount_ptr"* %this, %"struct.boost::exception_detail::error_info_container"* %px) align 2 {
entry:
  %this.addr = alloca %"class.boost::exception_detail::refcount_ptr"*, align 4
  %px.addr = alloca %"struct.boost::exception_detail::error_info_container"*, align 4
  store %"class.boost::exception_detail::refcount_ptr"* %this, %"class.boost::exception_detail::refcount_ptr"** %this.addr, align 4
  store %"struct.boost::exception_detail::error_info_container"* %px, %"struct.boost::exception_detail::error_info_container"** %px.addr, align 4
  %this1 = load %"class.boost::exception_detail::refcount_ptr"** %this.addr
  call void @_ZN5boost16exception_detail12refcount_ptrINS0_20error_info_containerEE7releaseEv(%"class.boost::exception_detail::refcount_ptr"* %this1)
  %0 = load %"struct.boost::exception_detail::error_info_container"** %px.addr, align 4
  %px_ = getelementptr inbounds %"class.boost::exception_detail::refcount_ptr"* %this1, i32 0, i32 0
  store %"struct.boost::exception_detail::error_info_container"* %0, %"struct.boost::exception_detail::error_info_container"** %px_, align 4
  call void @_ZN5boost16exception_detail12refcount_ptrINS0_20error_info_containerEE7add_refEv(%"class.boost::exception_detail::refcount_ptr"* %this1)
  ret void
}

define linkonce_odr void @_ZN5boost16exception_detail12refcount_ptrINS0_20error_info_containerEEC2Ev(%"class.boost::exception_detail::refcount_ptr"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::exception_detail::refcount_ptr"*, align 4
  store %"class.boost::exception_detail::refcount_ptr"* %this, %"class.boost::exception_detail::refcount_ptr"** %this.addr, align 4
  %this1 = load %"class.boost::exception_detail::refcount_ptr"** %this.addr
  %px_ = getelementptr inbounds %"class.boost::exception_detail::refcount_ptr"* %this1, i32 0, i32 0
  store %"struct.boost::exception_detail::error_info_container"* null, %"struct.boost::exception_detail::error_info_container"** %px_, align 4
  ret void
}

define linkonce_odr void @_ZN5boost16exception_detail19error_info_injectorISt12out_of_rangeEC1ERKS2_(%"struct.boost::exception_detail::error_info_injector"* %this, %"class.std::out_of_range"* %x) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"struct.boost::exception_detail::error_info_injector"*, align 4
  %x.addr = alloca %"class.std::out_of_range"*, align 4
  store %"struct.boost::exception_detail::error_info_injector"* %this, %"struct.boost::exception_detail::error_info_injector"** %this.addr, align 4
  store %"class.std::out_of_range"* %x, %"class.std::out_of_range"** %x.addr, align 4
  %this1 = load %"struct.boost::exception_detail::error_info_injector"** %this.addr
  %0 = load %"class.std::out_of_range"** %x.addr
  call void @_ZN5boost16exception_detail19error_info_injectorISt12out_of_rangeEC2ERKS2_(%"struct.boost::exception_detail::error_info_injector"* %this1, %"class.std::out_of_range"* %0)
  ret void
}

define linkonce_odr void @_ZN5boost16exception_detail19error_info_injectorISt12out_of_rangeEC2ERKS2_(%"struct.boost::exception_detail::error_info_injector"* %this, %"class.std::out_of_range"* %x) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"struct.boost::exception_detail::error_info_injector"*, align 4
  %x.addr = alloca %"class.std::out_of_range"*, align 4
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  store %"struct.boost::exception_detail::error_info_injector"* %this, %"struct.boost::exception_detail::error_info_injector"** %this.addr, align 4
  store %"class.std::out_of_range"* %x, %"class.std::out_of_range"** %x.addr, align 4
  %this1 = load %"struct.boost::exception_detail::error_info_injector"** %this.addr
  %0 = bitcast %"struct.boost::exception_detail::error_info_injector"* %this1 to %"class.std::out_of_range"*
  %1 = load %"class.std::out_of_range"** %x.addr, align 4
  call void @_ZNSt12out_of_rangeC2ERKS_(%"class.std::out_of_range"* %0, %"class.std::out_of_range"* %1)
  %2 = bitcast %"struct.boost::exception_detail::error_info_injector"* %this1 to i8*
  %3 = getelementptr inbounds i8* %2, i64 8
  %4 = bitcast i8* %3 to %"class.boost::exception"*
  invoke void @_ZN5boost9exceptionC2Ev(%"class.boost::exception"* %4)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %entry
  %5 = bitcast %"struct.boost::exception_detail::error_info_injector"* %this1 to i8***
  store i8** getelementptr inbounds ([9 x i8*]* @_ZTVN5boost16exception_detail19error_info_injectorISt12out_of_rangeEE, i64 0, i64 2), i8*** %5
  %6 = bitcast %"struct.boost::exception_detail::error_info_injector"* %this1 to i8*
  %add.ptr = getelementptr inbounds i8* %6, i32 8
  %7 = bitcast i8* %add.ptr to i8***
  store i8** getelementptr inbounds ([9 x i8*]* @_ZTVN5boost16exception_detail19error_info_injectorISt12out_of_rangeEE, i64 0, i64 7), i8*** %7
  ret void

lpad:                                             ; preds = %entry
  %8 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %9 = extractvalue { i8*, i32 } %8, 0
  store i8* %9, i8** %exn.slot
  %10 = extractvalue { i8*, i32 } %8, 1
  store i32 %10, i32* %ehselector.slot
  %11 = bitcast %"struct.boost::exception_detail::error_info_injector"* %this1 to %"class.std::out_of_range"*
  call void @_ZNSt12out_of_rangeD2Ev(%"class.std::out_of_range"* %11) nounwind
  br label %eh.resume

eh.resume:                                        ; preds = %lpad
  %exn = load i8** %exn.slot
  %sel = load i32* %ehselector.slot
  %lpad.val = insertvalue { i8*, i32 } undef, i8* %exn, 0
  %lpad.val2 = insertvalue { i8*, i32 } %lpad.val, i32 %sel, 1
  resume { i8*, i32 } %lpad.val2
}

define linkonce_odr void @_ZN5boost9exceptionC2Ev(%"class.boost::exception"* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::exception"*, align 4
  store %"class.boost::exception"* %this, %"class.boost::exception"** %this.addr, align 4
  %this1 = load %"class.boost::exception"** %this.addr
  %0 = bitcast %"class.boost::exception"* %this1 to i8***
  store i8** getelementptr inbounds ([4 x i8*]* @_ZTVN5boost9exceptionE, i64 0, i64 2), i8*** %0
  %data_ = getelementptr inbounds %"class.boost::exception"* %this1, i32 0, i32 1
  call void @_ZN5boost16exception_detail12refcount_ptrINS0_20error_info_containerEEC1Ev(%"class.boost::exception_detail::refcount_ptr"* %data_)
  %throw_function_ = getelementptr inbounds %"class.boost::exception"* %this1, i32 0, i32 2
  store i8* null, i8** %throw_function_, align 4
  %throw_file_ = getelementptr inbounds %"class.boost::exception"* %this1, i32 0, i32 3
  store i8* null, i8** %throw_file_, align 4
  %throw_line_ = getelementptr inbounds %"class.boost::exception"* %this1, i32 0, i32 4
  store i32 -1, i32* %throw_line_, align 4
  ret void
}

define linkonce_odr void @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorISt12out_of_rangeEEEC1ERKS4_(%"class.boost::exception_detail::clone_impl"* %this, %"struct.boost::exception_detail::error_info_injector"* %x) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::exception_detail::clone_impl"*, align 4
  %x.addr = alloca %"struct.boost::exception_detail::error_info_injector"*, align 4
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  store %"class.boost::exception_detail::clone_impl"* %this, %"class.boost::exception_detail::clone_impl"** %this.addr, align 4
  store %"struct.boost::exception_detail::error_info_injector"* %x, %"struct.boost::exception_detail::error_info_injector"** %x.addr, align 4
  %this1 = load %"class.boost::exception_detail::clone_impl"** %this.addr
  %0 = bitcast %"class.boost::exception_detail::clone_impl"* %this1 to i8*
  %1 = getelementptr inbounds i8* %0, i64 28
  %2 = bitcast i8* %1 to %"class.boost::exception_detail::clone_base"*
  call void @_ZN5boost16exception_detail10clone_baseC2Ev(%"class.boost::exception_detail::clone_base"* %2) nounwind
  %3 = bitcast %"class.boost::exception_detail::clone_impl"* %this1 to %"struct.boost::exception_detail::error_info_injector"*
  %4 = load %"struct.boost::exception_detail::error_info_injector"** %x.addr, align 4
  invoke void @_ZN5boost16exception_detail19error_info_injectorISt12out_of_rangeEC2ERKS3_(%"struct.boost::exception_detail::error_info_injector"* %3, %"struct.boost::exception_detail::error_info_injector"* %4)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %entry
  %5 = bitcast %"class.boost::exception_detail::clone_impl"* %this1 to i8***
  store i8** getelementptr inbounds ([21 x i8*]* @_ZTVN5boost16exception_detail10clone_implINS0_19error_info_injectorISt12out_of_rangeEEEE, i64 0, i64 3), i8*** %5
  %6 = bitcast %"class.boost::exception_detail::clone_impl"* %this1 to i8*
  %add.ptr = getelementptr inbounds i8* %6, i32 8
  %7 = bitcast i8* %add.ptr to i8***
  store i8** getelementptr inbounds ([21 x i8*]* @_ZTVN5boost16exception_detail10clone_implINS0_19error_info_injectorISt12out_of_rangeEEEE, i64 0, i64 10), i8*** %7
  %8 = bitcast %"class.boost::exception_detail::clone_impl"* %this1 to i8*
  %add.ptr2 = getelementptr inbounds i8* %8, i32 28
  %9 = bitcast i8* %add.ptr2 to i8***
  store i8** getelementptr inbounds ([21 x i8*]* @_ZTVN5boost16exception_detail10clone_implINS0_19error_info_injectorISt12out_of_rangeEEEE, i64 0, i64 17), i8*** %9
  %10 = bitcast %"class.boost::exception_detail::clone_impl"* %this1 to i8*
  %add.ptr3 = getelementptr inbounds i8* %10, i32 8
  %11 = bitcast i8* %add.ptr3 to %"class.boost::exception"*
  %12 = load %"struct.boost::exception_detail::error_info_injector"** %x.addr, align 4
  %13 = icmp eq %"struct.boost::exception_detail::error_info_injector"* %12, null
  br i1 %13, label %cast.end, label %cast.notnull

cast.notnull:                                     ; preds = %invoke.cont
  %14 = bitcast %"struct.boost::exception_detail::error_info_injector"* %12 to i8*
  %add.ptr4 = getelementptr inbounds i8* %14, i32 8
  %15 = bitcast i8* %add.ptr4 to %"class.boost::exception"*
  br label %cast.end

cast.end:                                         ; preds = %cast.notnull, %invoke.cont
  %cast.result = phi %"class.boost::exception"* [ %15, %cast.notnull ], [ null, %invoke.cont ]
  invoke void @_ZN5boost16exception_detail20copy_boost_exceptionEPNS_9exceptionEPKS1_(%"class.boost::exception"* %11, %"class.boost::exception"* %cast.result)
          to label %invoke.cont6 unwind label %lpad5

invoke.cont6:                                     ; preds = %cast.end
  ret void

lpad:                                             ; preds = %entry
  %16 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %17 = extractvalue { i8*, i32 } %16, 0
  store i8* %17, i8** %exn.slot
  %18 = extractvalue { i8*, i32 } %16, 1
  store i32 %18, i32* %ehselector.slot
  br label %ehcleanup

lpad5:                                            ; preds = %cast.end
  %19 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %20 = extractvalue { i8*, i32 } %19, 0
  store i8* %20, i8** %exn.slot
  %21 = extractvalue { i8*, i32 } %19, 1
  store i32 %21, i32* %ehselector.slot
  %22 = bitcast %"class.boost::exception_detail::clone_impl"* %this1 to %"struct.boost::exception_detail::error_info_injector"*
  call void @_ZN5boost16exception_detail19error_info_injectorISt12out_of_rangeED2Ev(%"struct.boost::exception_detail::error_info_injector"* %22) nounwind
  br label %ehcleanup

ehcleanup:                                        ; preds = %lpad5, %lpad
  %23 = bitcast %"class.boost::exception_detail::clone_impl"* %this1 to i8*
  %24 = getelementptr inbounds i8* %23, i64 28
  %25 = bitcast i8* %24 to %"class.boost::exception_detail::clone_base"*
  call void @_ZN5boost16exception_detail10clone_baseD2Ev(%"class.boost::exception_detail::clone_base"* %25) nounwind
  br label %eh.resume

eh.resume:                                        ; preds = %ehcleanup
  %exn = load i8** %exn.slot
  %sel = load i32* %ehselector.slot
  %lpad.val = insertvalue { i8*, i32 } undef, i8* %exn, 0
  %lpad.val7 = insertvalue { i8*, i32 } %lpad.val, i32 %sel, 1
  resume { i8*, i32 } %lpad.val7
}

define linkonce_odr void @_ZN5boost5arrayISsLj4EED2Ev(%"class.boost::array"* %this) unnamed_addr inlinehint align 2 {
entry:
  %this.addr = alloca %"class.boost::array"*, align 4
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  store %"class.boost::array"* %this, %"class.boost::array"** %this.addr, align 4
  %this1 = load %"class.boost::array"** %this.addr
  %elems = getelementptr inbounds %"class.boost::array"* %this1, i32 0, i32 0
  %array.begin = getelementptr inbounds [4 x %"class.std::basic_string"]* %elems, i32 0, i32 0
  %0 = getelementptr inbounds %"class.std::basic_string"* %array.begin, i32 4
  br label %arraydestroy.body

arraydestroy.body:                                ; preds = %invoke.cont, %entry
  %arraydestroy.elementPast = phi %"class.std::basic_string"* [ %0, %entry ], [ %arraydestroy.element, %invoke.cont ]
  %arraydestroy.element = getelementptr inbounds %"class.std::basic_string"* %arraydestroy.elementPast, i32 -1
  invoke void @_ZNSsD1Ev(%"class.std::basic_string"* %arraydestroy.element)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %arraydestroy.body
  %arraydestroy.done7 = icmp eq %"class.std::basic_string"* %arraydestroy.element, %array.begin
  br i1 %arraydestroy.done7, label %arraydestroy.done8, label %arraydestroy.body

arraydestroy.done8:                               ; preds = %invoke.cont
  ret void

lpad:                                             ; preds = %arraydestroy.body
  %1 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %2 = extractvalue { i8*, i32 } %1, 0
  store i8* %2, i8** %exn.slot
  %3 = extractvalue { i8*, i32 } %1, 1
  store i32 %3, i32* %ehselector.slot
  %arraydestroy.isempty = icmp eq %"class.std::basic_string"* %array.begin, %arraydestroy.element
  br i1 %arraydestroy.isempty, label %arraydestroy.done6, label %arraydestroy.body2

arraydestroy.body2:                               ; preds = %invoke.cont5, %lpad
  %arraydestroy.elementPast3 = phi %"class.std::basic_string"* [ %arraydestroy.element, %lpad ], [ %arraydestroy.element4, %invoke.cont5 ]
  %arraydestroy.element4 = getelementptr inbounds %"class.std::basic_string"* %arraydestroy.elementPast3, i32 -1
  invoke void @_ZNSsD1Ev(%"class.std::basic_string"* %arraydestroy.element4)
          to label %invoke.cont5 unwind label %terminate.lpad

invoke.cont5:                                     ; preds = %arraydestroy.body2
  %arraydestroy.done = icmp eq %"class.std::basic_string"* %arraydestroy.element4, %array.begin
  br i1 %arraydestroy.done, label %arraydestroy.done6, label %arraydestroy.body2

arraydestroy.done6:                               ; preds = %invoke.cont5, %lpad
  br label %eh.resume

eh.resume:                                        ; preds = %arraydestroy.done6
  %exn = load i8** %exn.slot
  %sel = load i32* %ehselector.slot
  %lpad.val = insertvalue { i8*, i32 } undef, i8* %exn, 0
  %lpad.val9 = insertvalue { i8*, i32 } %lpad.val, i32 %sel, 1
  resume { i8*, i32 } %lpad.val9

terminate.lpad:                                   ; preds = %arraydestroy.body2
  %4 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          catch i8* null
  call void @_ZSt9terminatev() noreturn nounwind
  unreachable
}

define linkonce_odr void @_ZN5boost5arrayISsLj4EEC2ERKS1_(%"class.boost::array"* %this, %"class.boost::array"*) unnamed_addr inlinehint align 2 {
entry:
  %this.addr = alloca %"class.boost::array"*, align 4
  %.addr = alloca %"class.boost::array"*, align 4
  %object.index = alloca i32
  %__i0 = alloca i32, align 4
  store %"class.boost::array"* %this, %"class.boost::array"** %this.addr, align 4
  store %"class.boost::array"* %0, %"class.boost::array"** %.addr, align 4
  %this1 = load %"class.boost::array"** %this.addr
  %elems = getelementptr inbounds %"class.boost::array"* %this1, i32 0, i32 0
  %1 = bitcast [4 x %"class.std::basic_string"]* %elems to %"class.std::basic_string"*
  store i32 0, i32* %object.index
  store i32 0, i32* %__i0
  br label %for.cond

for.cond:                                         ; preds = %for.inc, %entry
  %2 = load i32* %__i0
  %isless = icmp ult i32 %2, 4
  br i1 %isless, label %for.body, label %for.end

for.body:                                         ; preds = %for.cond
  %3 = load i32* %object.index
  %destaddress = getelementptr inbounds %"class.std::basic_string"* %1, i32 %3
  %inc = add i32 %3, 1
  store i32 %inc, i32* %object.index
  %4 = load i32* %__i0, align 4
  %5 = load %"class.boost::array"** %.addr, align 4
  %elems2 = getelementptr inbounds %"class.boost::array"* %5, i32 0, i32 0
  %arrayidx = getelementptr inbounds [4 x %"class.std::basic_string"]* %elems2, i32 0, i32 %4
  call void @_ZNSsC1ERKSs(%"class.std::basic_string"* %destaddress, %"class.std::basic_string"* %arrayidx)
  br label %for.inc

for.inc:                                          ; preds = %for.body
  %6 = load i32* %__i0
  %inc3 = add i32 %6, 1
  store i32 %inc3, i32* %__i0
  br label %for.cond

for.end:                                          ; preds = %for.cond
  ret void
}

define internal void @_GLOBAL__I_a() section ".text.startup" {
entry:
  call void @__cxx_global_var_init()
  ret void
}
