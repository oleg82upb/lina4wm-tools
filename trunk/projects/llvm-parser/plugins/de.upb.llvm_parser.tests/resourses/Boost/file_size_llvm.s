; ModuleID = 'file_size.cpp'
target datalayout = "e-p:32:32:32-i1:8:8-i8:8:8-i16:16:16-i32:32:32-i64:32:64-f32:32:32-f64:32:64-v64:64:64-v128:128:128-a0:0:64-f80:32:32-n8:16:32-S128"
target triple = "i386-pc-linux-gnu"

%"class.std::ios_base::Init" = type { i8 }
%"class.boost::system::error_category" = type { i32 (...)** }
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
%"class.boost::system::error_condition" = type { i32, %"class.boost::system::error_category"* }
%"class.boost::system::system_error" = type { %"class.std::runtime_error", %"class.boost::system::error_code", %"class.std::basic_string" }
%"class.std::runtime_error" = type { %"class.std::exception", %"class.std::basic_string" }
%"class.std::exception" = type { i32 (...)** }
%"class.std::basic_string" = type { %"struct.std::basic_string<char, std::char_traits<char>, std::allocator<char> >::_Alloc_hider" }
%"struct.std::basic_string<char, std::char_traits<char>, std::allocator<char> >::_Alloc_hider" = type { i8* }
%"class.boost::system::error_code" = type { i32, %"class.boost::system::error_category"* }
%"class.boost::filesystem::path" = type { %"class.std::basic_string" }
%"class.boost::filesystem::file_status" = type { i32, i32 }
%"class.std::codecvt" = type { %"class.std::__codecvt_abstract_base", %struct.__locale_struct* }
%"class.std::__codecvt_abstract_base" = type { %"class.std::locale::facet" }
%"class.boost::noncopyable_::noncopyable" = type { i8 }

@_ZStL8__ioinit = internal global %"class.std::ios_base::Init" zeroinitializer, align 1
@__dso_handle = external global i8
@_ZN5boost6systemL14posix_categoryE = internal global %"class.boost::system::error_category"* null, align 4
@_ZN5boost6systemL10errno_ecatE = internal global %"class.boost::system::error_category"* null, align 4
@_ZN5boost6systemL11native_ecatE = internal global %"class.boost::system::error_category"* null, align 4
@.str = private unnamed_addr constant [3 x i8] c": \00", align 1
@_ZSt4cout = external global %"class.std::basic_ostream"
@.str4 = private unnamed_addr constant [23 x i8] c"Usage: file_size path\0A\00", align 1
@.str5 = private unnamed_addr constant [21 x i8] c"sizeof(intmax_t) is \00", align 1
@.str6 = private unnamed_addr constant [12 x i8] c"not found: \00", align 1
@.str7 = private unnamed_addr constant [21 x i8] c"not a regular file: \00", align 1
@.str8 = private unnamed_addr constant [9 x i8] c"size of \00", align 1
@.str9 = private unnamed_addr constant [5 x i8] c" is \00", align 1
@_ZTVN5boost6system14error_categoryE = linkonce_odr unnamed_addr constant [9 x i8*] [i8* null, i8* bitcast ({ i8*, i8*, i8* }* @_ZTIN5boost6system14error_categoryE to i8*), i8* bitcast (void (%"class.boost::system::error_category"*)* @_ZN5boost6system14error_categoryD1Ev to i8*), i8* bitcast (void (%"class.boost::system::error_category"*)* @_ZN5boost6system14error_categoryD0Ev to i8*), i8* bitcast (void ()* @__cxa_pure_virtual to i8*), i8* bitcast (void ()* @__cxa_pure_virtual to i8*), i8* bitcast (void (%"class.boost::system::error_condition"*, %"class.boost::system::error_category"*, i32)* @_ZNK5boost6system14error_category23default_error_conditionEi to i8*), i8* bitcast (i1 (%"class.boost::system::error_category"*, i32, %"class.boost::system::error_condition"*)* @_ZNK5boost6system14error_category10equivalentEiRKNS0_15error_conditionE to i8*), i8* bitcast (i1 (%"class.boost::system::error_category"*, %"class.boost::system::error_code"*, i32)* @_ZNK5boost6system14error_category10equivalentERKNS0_10error_codeEi to i8*)]
@_ZTVN10__cxxabiv120__si_class_type_infoE = external global i8*
@_ZTSN5boost6system14error_categoryE = linkonce_odr constant [32 x i8] c"N5boost6system14error_categoryE\00"
@_ZTVN10__cxxabiv117__class_type_infoE = external global i8*
@_ZTSN5boost12noncopyable_11noncopyableE = linkonce_odr constant [36 x i8] c"N5boost12noncopyable_11noncopyableE\00"
@_ZTIN5boost12noncopyable_11noncopyableE = linkonce_odr unnamed_addr constant { i8*, i8* } { i8* bitcast (i8** getelementptr inbounds (i8** @_ZTVN10__cxxabiv117__class_type_infoE, i32 2) to i8*), i8* getelementptr inbounds ([36 x i8]* @_ZTSN5boost12noncopyable_11noncopyableE, i32 0, i32 0) }
@_ZTIN5boost6system14error_categoryE = linkonce_odr unnamed_addr constant { i8*, i8*, i8* } { i8* bitcast (i8** getelementptr inbounds (i8** @_ZTVN10__cxxabiv120__si_class_type_infoE, i32 2) to i8*), i8* getelementptr inbounds ([32 x i8]* @_ZTSN5boost6system14error_categoryE, i32 0, i32 0), i8* bitcast ({ i8*, i8* }* @_ZTIN5boost12noncopyable_11noncopyableE to i8*) }
@_ZTVN5boost6system12system_errorE = linkonce_odr unnamed_addr constant [5 x i8*] [i8* null, i8* bitcast ({ i8*, i8*, i8* }* @_ZTIN5boost6system12system_errorE to i8*), i8* bitcast (void (%"class.boost::system::system_error"*)* @_ZN5boost6system12system_errorD1Ev to i8*), i8* bitcast (void (%"class.boost::system::system_error"*)* @_ZN5boost6system12system_errorD0Ev to i8*), i8* bitcast (i8* (%"class.boost::system::system_error"*)* @_ZNK5boost6system12system_error4whatEv to i8*)]
@_ZTSN5boost6system12system_errorE = linkonce_odr constant [30 x i8] c"N5boost6system12system_errorE\00"
@_ZTISt13runtime_error = external constant i8*
@_ZTIN5boost6system12system_errorE = linkonce_odr unnamed_addr constant { i8*, i8*, i8* } { i8* bitcast (i8** getelementptr inbounds (i8** @_ZTVN10__cxxabiv120__si_class_type_infoE, i32 2) to i8*), i8* getelementptr inbounds ([30 x i8]* @_ZTSN5boost6system12system_errorE, i32 0, i32 0), i8* bitcast (i8** @_ZTISt13runtime_error to i8*) }
@.str10 = private unnamed_addr constant [6 x i8] c"c_str\00", align 1
@.str11 = private unnamed_addr constant [59 x i8] c"/home/thomas/boost_1_52_0/boost/filesystem/path_traits.hpp\00", align 1
@__PRETTY_FUNCTION__._ZN5boost10filesystem11path_traits8dispatchIcSsEEvRKPT_RT0_RKSt7codecvtIwc11__mbstate_tE = private unnamed_addr constant [125 x i8] c"void boost::filesystem::path_traits::dispatch(T *const &, U &, const codecvt_type &) [T = char, U = std::basic_string<char>]\00", align 1
@.str12 = private unnamed_addr constant [5 x i8] c"from\00", align 1
@__PRETTY_FUNCTION__._ZN5boost10filesystem11path_traits7convertEPKcRSsRKSt7codecvtIwc11__mbstate_tE = private unnamed_addr constant [96 x i8] c"void boost::filesystem::path_traits::convert(const char *, std::string &, const codecvt_type &)\00", align 1
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
  %call = call %"class.boost::system::error_category"* @_ZN5boost6system16generic_categoryEv()
  store %"class.boost::system::error_category"* %call, %"class.boost::system::error_category"** @_ZN5boost6systemL14posix_categoryE, align 4
  ret void
}

declare %"class.boost::system::error_category"* @_ZN5boost6system16generic_categoryEv()

define internal void @__cxx_global_var_init2() section ".text.startup" {
entry:
  %call = call %"class.boost::system::error_category"* @_ZN5boost6system16generic_categoryEv()
  store %"class.boost::system::error_category"* %call, %"class.boost::system::error_category"** @_ZN5boost6systemL10errno_ecatE, align 4
  ret void
}

define internal void @__cxx_global_var_init3() section ".text.startup" {
entry:
  %call = call %"class.boost::system::error_category"* @_ZN5boost6system15system_categoryEv()
  store %"class.boost::system::error_category"* %call, %"class.boost::system::error_category"** @_ZN5boost6systemL11native_ecatE, align 4
  ret void
}

declare %"class.boost::system::error_category"* @_ZN5boost6system15system_categoryEv()

define linkonce_odr void @_ZNK5boost6system14error_category23default_error_conditionEi(%"class.boost::system::error_condition"* noalias sret %agg.result, %"class.boost::system::error_category"* %this, i32 %ev) unnamed_addr inlinehint align 2 {
entry:
  %this.addr = alloca %"class.boost::system::error_category"*, align 4
  %ev.addr = alloca i32, align 4
  store %"class.boost::system::error_category"* %this, %"class.boost::system::error_category"** %this.addr, align 4
  store i32 %ev, i32* %ev.addr, align 4
  %this1 = load %"class.boost::system::error_category"** %this.addr
  %0 = load i32* %ev.addr, align 4
  call void @_ZN5boost6system15error_conditionC1EiRKNS0_14error_categoryE(%"class.boost::system::error_condition"* %agg.result, i32 %0, %"class.boost::system::error_category"* %this1)
  ret void
}

define linkonce_odr void @_ZN5boost6system15error_conditionC1EiRKNS0_14error_categoryE(%"class.boost::system::error_condition"* %this, i32 %val, %"class.boost::system::error_category"* %cat) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::system::error_condition"*, align 4
  %val.addr = alloca i32, align 4
  %cat.addr = alloca %"class.boost::system::error_category"*, align 4
  store %"class.boost::system::error_condition"* %this, %"class.boost::system::error_condition"** %this.addr, align 4
  store i32 %val, i32* %val.addr, align 4
  store %"class.boost::system::error_category"* %cat, %"class.boost::system::error_category"** %cat.addr, align 4
  %this1 = load %"class.boost::system::error_condition"** %this.addr
  %0 = load i32* %val.addr, align 4
  %1 = load %"class.boost::system::error_category"** %cat.addr
  call void @_ZN5boost6system15error_conditionC2EiRKNS0_14error_categoryE(%"class.boost::system::error_condition"* %this1, i32 %0, %"class.boost::system::error_category"* %1)
  ret void
}

define linkonce_odr i8* @_ZNK5boost6system12system_error4whatEv(%"class.boost::system::system_error"* %this) unnamed_addr nounwind inlinehint align 2 {
entry:
  %retval = alloca i8*, align 4
  %this.addr = alloca %"class.boost::system::system_error"*, align 4
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  %ref.tmp = alloca %"class.std::basic_string", align 4
  %cleanup.dest.slot = alloca i32
  store %"class.boost::system::system_error"* %this, %"class.boost::system::system_error"** %this.addr, align 4
  %this1 = load %"class.boost::system::system_error"** %this.addr
  %m_what = getelementptr inbounds %"class.boost::system::system_error"* %this1, i32 0, i32 2
  %call = invoke zeroext i1 @_ZNKSs5emptyEv(%"class.std::basic_string"* %m_what)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %entry
  br i1 %call, label %if.then, label %if.end23

if.then:                                          ; preds = %invoke.cont
  %m_what2 = getelementptr inbounds %"class.boost::system::system_error"* %this1, i32 0, i32 2
  %0 = bitcast %"class.boost::system::system_error"* %this1 to %"class.std::runtime_error"*
  %call3 = call i8* @_ZNKSt13runtime_error4whatEv(%"class.std::runtime_error"* %0) nounwind
  %call6 = invoke %"class.std::basic_string"* @_ZNSsaSEPKc(%"class.std::basic_string"* %m_what2, i8* %call3)
          to label %invoke.cont5 unwind label %lpad4

invoke.cont5:                                     ; preds = %if.then
  %m_what7 = getelementptr inbounds %"class.boost::system::system_error"* %this1, i32 0, i32 2
  %call9 = invoke zeroext i1 @_ZNKSs5emptyEv(%"class.std::basic_string"* %m_what7)
          to label %invoke.cont8 unwind label %lpad4

invoke.cont8:                                     ; preds = %invoke.cont5
  br i1 %call9, label %if.end, label %if.then10

if.then10:                                        ; preds = %invoke.cont8
  %m_what11 = getelementptr inbounds %"class.boost::system::system_error"* %this1, i32 0, i32 2
  %call13 = invoke %"class.std::basic_string"* @_ZNSspLEPKc(%"class.std::basic_string"* %m_what11, i8* getelementptr inbounds ([3 x i8]* @.str, i32 0, i32 0))
          to label %invoke.cont12 unwind label %lpad4

invoke.cont12:                                    ; preds = %if.then10
  br label %if.end

lpad:                                             ; preds = %if.end23, %catch, %entry
  %1 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          filter [0 x i8*] zeroinitializer
  %2 = extractvalue { i8*, i32 } %1, 0
  store i8* %2, i8** %exn.slot
  %3 = extractvalue { i8*, i32 } %1, 1
  store i32 %3, i32* %ehselector.slot
  br label %filter.dispatch

filter.dispatch:                                  ; preds = %lpad
  %exn27 = load i8** %exn.slot
  call void @__cxa_call_unexpected(i8* %exn27) noreturn
  unreachable

lpad4:                                            ; preds = %invoke.cont17, %if.end, %if.then10, %invoke.cont5, %if.then
  %4 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          catch i8* null
  %5 = extractvalue { i8*, i32 } %4, 0
  store i8* %5, i8** %exn.slot
  %6 = extractvalue { i8*, i32 } %4, 1
  store i32 %6, i32* %ehselector.slot
  br label %catch

if.end:                                           ; preds = %invoke.cont12, %invoke.cont8
  %m_what14 = getelementptr inbounds %"class.boost::system::system_error"* %this1, i32 0, i32 2
  %m_error_code = getelementptr inbounds %"class.boost::system::system_error"* %this1, i32 0, i32 1
  invoke void @_ZNK5boost6system10error_code7messageEv(%"class.std::basic_string"* sret %ref.tmp, %"class.boost::system::error_code"* %m_error_code)
          to label %invoke.cont15 unwind label %lpad4

invoke.cont15:                                    ; preds = %if.end
  %call18 = invoke %"class.std::basic_string"* @_ZNSspLERKSs(%"class.std::basic_string"* %m_what14, %"class.std::basic_string"* %ref.tmp)
          to label %invoke.cont17 unwind label %lpad16

invoke.cont17:                                    ; preds = %invoke.cont15
  invoke void @_ZNSsD1Ev(%"class.std::basic_string"* %ref.tmp)
          to label %invoke.cont19 unwind label %lpad4

invoke.cont19:                                    ; preds = %invoke.cont17
  br label %try.cont

lpad16:                                           ; preds = %invoke.cont15
  %7 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          catch i8* null
  %8 = extractvalue { i8*, i32 } %7, 0
  store i8* %8, i8** %exn.slot
  %9 = extractvalue { i8*, i32 } %7, 1
  store i32 %9, i32* %ehselector.slot
  invoke void @_ZNSsD1Ev(%"class.std::basic_string"* %ref.tmp)
          to label %invoke.cont20 unwind label %terminate.lpad

invoke.cont20:                                    ; preds = %lpad16
  br label %catch

catch:                                            ; preds = %invoke.cont20, %lpad4
  %exn = load i8** %exn.slot
  %10 = call i8* @__cxa_begin_catch(i8* %exn) nounwind
  %11 = bitcast %"class.boost::system::system_error"* %this1 to %"class.std::runtime_error"*
  %call21 = call i8* @_ZNKSt13runtime_error4whatEv(%"class.std::runtime_error"* %11) nounwind
  store i8* %call21, i8** %retval
  store i32 1, i32* %cleanup.dest.slot
  invoke void @__cxa_end_catch()
          to label %invoke.cont22 unwind label %lpad

invoke.cont22:                                    ; preds = %catch
  br label %return

try.cont:                                         ; preds = %invoke.cont19
  br label %if.end23

if.end23:                                         ; preds = %try.cont, %invoke.cont
  %m_what24 = getelementptr inbounds %"class.boost::system::system_error"* %this1, i32 0, i32 2
  %call26 = invoke i8* @_ZNKSs5c_strEv(%"class.std::basic_string"* %m_what24)
          to label %invoke.cont25 unwind label %lpad

invoke.cont25:                                    ; preds = %if.end23
  store i8* %call26, i8** %retval
  br label %return

return:                                           ; preds = %invoke.cont25, %invoke.cont22
  %12 = load i8** %retval
  ret i8* %12

terminate.lpad:                                   ; preds = %lpad16
  %13 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          catch i8* null
  call void @_ZSt9terminatev() noreturn nounwind
  unreachable
}

declare zeroext i1 @_ZNKSs5emptyEv(%"class.std::basic_string"*)

declare i32 @__gxx_personality_v0(...)

declare %"class.std::basic_string"* @_ZNSsaSEPKc(%"class.std::basic_string"*, i8*)

declare i8* @_ZNKSt13runtime_error4whatEv(%"class.std::runtime_error"*) nounwind

declare %"class.std::basic_string"* @_ZNSspLEPKc(%"class.std::basic_string"*, i8*)

declare %"class.std::basic_string"* @_ZNSspLERKSs(%"class.std::basic_string"*, %"class.std::basic_string"*)

define linkonce_odr void @_ZNK5boost6system10error_code7messageEv(%"class.std::basic_string"* noalias sret %agg.result, %"class.boost::system::error_code"* %this) align 2 {
entry:
  %this.addr = alloca %"class.boost::system::error_code"*, align 4
  store %"class.boost::system::error_code"* %this, %"class.boost::system::error_code"** %this.addr, align 4
  %this1 = load %"class.boost::system::error_code"** %this.addr
  %m_cat = getelementptr inbounds %"class.boost::system::error_code"* %this1, i32 0, i32 1
  %0 = load %"class.boost::system::error_category"** %m_cat, align 4
  %1 = bitcast %"class.boost::system::error_category"* %0 to void (%"class.std::basic_string"*, %"class.boost::system::error_category"*, i32)***
  %vtable = load void (%"class.std::basic_string"*, %"class.boost::system::error_category"*, i32)*** %1
  %vfn = getelementptr inbounds void (%"class.std::basic_string"*, %"class.boost::system::error_category"*, i32)** %vtable, i64 3
  %2 = load void (%"class.std::basic_string"*, %"class.boost::system::error_category"*, i32)** %vfn
  %call = call i32 @_ZNK5boost6system10error_code5valueEv(%"class.boost::system::error_code"* %this1)
  call void %2(%"class.std::basic_string"* sret %agg.result, %"class.boost::system::error_category"* %0, i32 %call)
  ret void
}

declare void @_ZNSsD1Ev(%"class.std::basic_string"*)

declare void @_ZSt9terminatev()

declare i8* @__cxa_begin_catch(i8*)

declare void @__cxa_end_catch()

declare i8* @_ZNKSs5c_strEv(%"class.std::basic_string"*)

declare void @__cxa_call_unexpected(i8*)

define i32 @main(i32 %argc, i8** %argv) {
entry:
  %retval = alloca i32, align 4
  %argc.addr = alloca i32, align 4
  %argv.addr = alloca i8**, align 4
  %p = alloca %"class.boost::filesystem::path", align 4
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  %cleanup.dest.slot = alloca i32
  store i32 0, i32* %retval
  store i32 %argc, i32* %argc.addr, align 4
  store i8** %argv, i8*** %argv.addr, align 4
  %0 = load i32* %argc.addr, align 4
  %cmp = icmp ne i32 %0, 2
  br i1 %cmp, label %if.then, label %if.end

if.then:                                          ; preds = %entry
  %call = call %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* @_ZSt4cout, i8* getelementptr inbounds ([23 x i8]* @.str4, i32 0, i32 0))
  store i32 1, i32* %retval
  br label %return

if.end:                                           ; preds = %entry
  %call1 = call %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* @_ZSt4cout, i8* getelementptr inbounds ([21 x i8]* @.str5, i32 0, i32 0))
  %call2 = call %"class.std::basic_ostream"* @_ZNSolsEj(%"class.std::basic_ostream"* %call1, i32 8)
  %call3 = call %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_c(%"class.std::basic_ostream"* %call2, i8 signext 10)
  %1 = load i8*** %argv.addr, align 4
  %arrayidx = getelementptr inbounds i8** %1, i32 1
  call void @_ZN5boost10filesystem4pathC1IPcEERKT_PNS_9enable_ifINS0_11path_traits11is_pathableINS_5decayIS4_E4typeEEEvE4typeE(%"class.boost::filesystem::path"* %p, i8** %arrayidx, i8* null)
  %call4 = invoke zeroext i1 @_ZN5boost10filesystem6existsERKNS0_4pathE(%"class.boost::filesystem::path"* %p)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %if.end
  br i1 %call4, label %if.end13, label %if.then5

if.then5:                                         ; preds = %invoke.cont
  %call7 = invoke %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* @_ZSt4cout, i8* getelementptr inbounds ([12 x i8]* @.str6, i32 0, i32 0))
          to label %invoke.cont6 unwind label %lpad

invoke.cont6:                                     ; preds = %if.then5
  %2 = load i8*** %argv.addr, align 4
  %arrayidx8 = getelementptr inbounds i8** %2, i32 1
  %3 = load i8** %arrayidx8, align 4
  %call10 = invoke %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* %call7, i8* %3)
          to label %invoke.cont9 unwind label %lpad

invoke.cont9:                                     ; preds = %invoke.cont6
  %call12 = invoke %"class.std::basic_ostream"* @_ZNSolsEPFRSoS_E(%"class.std::basic_ostream"* %call10, %"class.std::basic_ostream"* (%"class.std::basic_ostream"*)* @_ZSt4endlIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_)
          to label %invoke.cont11 unwind label %lpad

invoke.cont11:                                    ; preds = %invoke.cont9
  store i32 1, i32* %retval
  store i32 1, i32* %cleanup.dest.slot
  br label %cleanup

lpad:                                             ; preds = %invoke.cont34, %invoke.cont32, %invoke.cont30, %invoke.cont28, %invoke.cont25, %if.end24, %invoke.cont20, %invoke.cont17, %if.then16, %if.end13, %invoke.cont9, %invoke.cont6, %if.then5, %if.end
  %4 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %5 = extractvalue { i8*, i32 } %4, 0
  store i8* %5, i8** %exn.slot
  %6 = extractvalue { i8*, i32 } %4, 1
  store i32 %6, i32* %ehselector.slot
  invoke void @_ZN5boost10filesystem4pathD1Ev(%"class.boost::filesystem::path"* %p)
          to label %invoke.cont38 unwind label %terminate.lpad

if.end13:                                         ; preds = %invoke.cont
  %call15 = invoke zeroext i1 @_ZN5boost10filesystem10is_regularERKNS0_4pathE(%"class.boost::filesystem::path"* %p)
          to label %invoke.cont14 unwind label %lpad

invoke.cont14:                                    ; preds = %if.end13
  br i1 %call15, label %if.end24, label %if.then16

if.then16:                                        ; preds = %invoke.cont14
  %call18 = invoke %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* @_ZSt4cout, i8* getelementptr inbounds ([21 x i8]* @.str7, i32 0, i32 0))
          to label %invoke.cont17 unwind label %lpad

invoke.cont17:                                    ; preds = %if.then16
  %7 = load i8*** %argv.addr, align 4
  %arrayidx19 = getelementptr inbounds i8** %7, i32 1
  %8 = load i8** %arrayidx19, align 4
  %call21 = invoke %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* %call18, i8* %8)
          to label %invoke.cont20 unwind label %lpad

invoke.cont20:                                    ; preds = %invoke.cont17
  %call23 = invoke %"class.std::basic_ostream"* @_ZNSolsEPFRSoS_E(%"class.std::basic_ostream"* %call21, %"class.std::basic_ostream"* (%"class.std::basic_ostream"*)* @_ZSt4endlIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_)
          to label %invoke.cont22 unwind label %lpad

invoke.cont22:                                    ; preds = %invoke.cont20
  store i32 1, i32* %retval
  store i32 1, i32* %cleanup.dest.slot
  br label %cleanup

if.end24:                                         ; preds = %invoke.cont14
  %call26 = invoke %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* @_ZSt4cout, i8* getelementptr inbounds ([9 x i8]* @.str8, i32 0, i32 0))
          to label %invoke.cont25 unwind label %lpad

invoke.cont25:                                    ; preds = %if.end24
  %9 = load i8*** %argv.addr, align 4
  %arrayidx27 = getelementptr inbounds i8** %9, i32 1
  %10 = load i8** %arrayidx27, align 4
  %call29 = invoke %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* %call26, i8* %10)
          to label %invoke.cont28 unwind label %lpad

invoke.cont28:                                    ; preds = %invoke.cont25
  %call31 = invoke %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* %call29, i8* getelementptr inbounds ([5 x i8]* @.str9, i32 0, i32 0))
          to label %invoke.cont30 unwind label %lpad

invoke.cont30:                                    ; preds = %invoke.cont28
  %call33 = invoke i64 @_ZN5boost10filesystem9file_sizeERKNS0_4pathE(%"class.boost::filesystem::path"* %p)
          to label %invoke.cont32 unwind label %lpad

invoke.cont32:                                    ; preds = %invoke.cont30
  %call35 = invoke %"class.std::basic_ostream"* @_ZNSolsEy(%"class.std::basic_ostream"* %call31, i64 %call33)
          to label %invoke.cont34 unwind label %lpad

invoke.cont34:                                    ; preds = %invoke.cont32
  %call37 = invoke %"class.std::basic_ostream"* @_ZNSolsEPFRSoS_E(%"class.std::basic_ostream"* %call35, %"class.std::basic_ostream"* (%"class.std::basic_ostream"*)* @_ZSt4endlIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_)
          to label %invoke.cont36 unwind label %lpad

invoke.cont36:                                    ; preds = %invoke.cont34
  store i32 0, i32* %retval
  store i32 1, i32* %cleanup.dest.slot
  br label %cleanup

cleanup:                                          ; preds = %invoke.cont36, %invoke.cont22, %invoke.cont11
  call void @_ZN5boost10filesystem4pathD1Ev(%"class.boost::filesystem::path"* %p)
  br label %return

invoke.cont38:                                    ; preds = %lpad
  br label %eh.resume

return:                                           ; preds = %cleanup, %if.then
  %11 = load i32* %retval
  ret i32 %11

eh.resume:                                        ; preds = %invoke.cont38
  %exn = load i8** %exn.slot
  %sel = load i32* %ehselector.slot
  %lpad.val = insertvalue { i8*, i32 } undef, i8* %exn, 0
  %lpad.val39 = insertvalue { i8*, i32 } %lpad.val, i32 %sel, 1
  resume { i8*, i32 } %lpad.val39

terminate.lpad:                                   ; preds = %lpad
  %12 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          catch i8* null
  call void @_ZSt9terminatev() noreturn nounwind
  unreachable
}

declare %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"*, i8*)

declare %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_c(%"class.std::basic_ostream"*, i8 signext)

declare %"class.std::basic_ostream"* @_ZNSolsEj(%"class.std::basic_ostream"*, i32)

define linkonce_odr void @_ZN5boost10filesystem4pathC1IPcEERKT_PNS_9enable_ifINS0_11path_traits11is_pathableINS_5decayIS4_E4typeEEEvE4typeE(%"class.boost::filesystem::path"* %this, i8** %source, i8*) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::filesystem::path"*, align 4
  %source.addr = alloca i8**, align 4
  %.addr = alloca i8*, align 4
  store %"class.boost::filesystem::path"* %this, %"class.boost::filesystem::path"** %this.addr, align 4
  store i8** %source, i8*** %source.addr, align 4
  store i8* %0, i8** %.addr, align 4
  %this1 = load %"class.boost::filesystem::path"** %this.addr
  %1 = load i8*** %source.addr
  %2 = load i8** %.addr, align 4
  call void @_ZN5boost10filesystem4pathC2IPcEERKT_PNS_9enable_ifINS0_11path_traits11is_pathableINS_5decayIS4_E4typeEEEvE4typeE(%"class.boost::filesystem::path"* %this1, i8** %1, i8* %2)
  ret void
}

define linkonce_odr zeroext i1 @_ZN5boost10filesystem6existsERKNS0_4pathE(%"class.boost::filesystem::path"* %p) inlinehint {
entry:
  %p.addr = alloca %"class.boost::filesystem::path"*, align 4
  %agg.tmp = alloca %"class.boost::filesystem::file_status", align 4
  store %"class.boost::filesystem::path"* %p, %"class.boost::filesystem::path"** %p.addr, align 4
  %0 = load %"class.boost::filesystem::path"** %p.addr, align 4
  call void @_ZN5boost10filesystem6detail6statusERKNS0_4pathEPNS_6system10error_codeE(%"class.boost::filesystem::file_status"* sret %agg.tmp, %"class.boost::filesystem::path"* %0, %"class.boost::system::error_code"* null)
  %call = call zeroext i1 @_ZN5boost10filesystem6existsENS0_11file_statusE(%"class.boost::filesystem::file_status"* byval align 4 %agg.tmp)
  ret i1 %call
}

declare %"class.std::basic_ostream"* @_ZNSolsEPFRSoS_E(%"class.std::basic_ostream"*, %"class.std::basic_ostream"* (%"class.std::basic_ostream"*)*)

declare %"class.std::basic_ostream"* @_ZSt4endlIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_(%"class.std::basic_ostream"*)

define linkonce_odr zeroext i1 @_ZN5boost10filesystem10is_regularERKNS0_4pathE(%"class.boost::filesystem::path"* %p) inlinehint {
entry:
  %p.addr = alloca %"class.boost::filesystem::path"*, align 4
  %agg.tmp = alloca %"class.boost::filesystem::file_status", align 4
  store %"class.boost::filesystem::path"* %p, %"class.boost::filesystem::path"** %p.addr, align 4
  %0 = load %"class.boost::filesystem::path"** %p.addr, align 4
  call void @_ZN5boost10filesystem6detail6statusERKNS0_4pathEPNS_6system10error_codeE(%"class.boost::filesystem::file_status"* sret %agg.tmp, %"class.boost::filesystem::path"* %0, %"class.boost::system::error_code"* null)
  %call = call zeroext i1 @_ZN5boost10filesystem10is_regularENS0_11file_statusE(%"class.boost::filesystem::file_status"* byval align 4 %agg.tmp)
  ret i1 %call
}

declare %"class.std::basic_ostream"* @_ZNSolsEy(%"class.std::basic_ostream"*, i64)

define linkonce_odr i64 @_ZN5boost10filesystem9file_sizeERKNS0_4pathE(%"class.boost::filesystem::path"* %p) inlinehint {
entry:
  %p.addr = alloca %"class.boost::filesystem::path"*, align 4
  store %"class.boost::filesystem::path"* %p, %"class.boost::filesystem::path"** %p.addr, align 4
  %0 = load %"class.boost::filesystem::path"** %p.addr, align 4
  %call = call i64 @_ZN5boost10filesystem6detail9file_sizeERKNS0_4pathEPNS_6system10error_codeE(%"class.boost::filesystem::path"* %0, %"class.boost::system::error_code"* null)
  ret i64 %call
}

define linkonce_odr void @_ZN5boost10filesystem4pathD1Ev(%"class.boost::filesystem::path"* %this) unnamed_addr inlinehint align 2 {
entry:
  %this.addr = alloca %"class.boost::filesystem::path"*, align 4
  store %"class.boost::filesystem::path"* %this, %"class.boost::filesystem::path"** %this.addr, align 4
  %this1 = load %"class.boost::filesystem::path"** %this.addr
  call void @_ZN5boost10filesystem4pathD2Ev(%"class.boost::filesystem::path"* %this1)
  ret void
}

define linkonce_odr void @_ZN5boost6system14error_categoryD1Ev(%"class.boost::system::error_category"* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::system::error_category"*, align 4
  store %"class.boost::system::error_category"* %this, %"class.boost::system::error_category"** %this.addr, align 4
  %this1 = load %"class.boost::system::error_category"** %this.addr
  call void @_ZN5boost6system14error_categoryD2Ev(%"class.boost::system::error_category"* %this1)
  ret void
}

define linkonce_odr void @_ZN5boost6system14error_categoryD0Ev(%"class.boost::system::error_category"* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::system::error_category"*, align 4
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  store %"class.boost::system::error_category"* %this, %"class.boost::system::error_category"** %this.addr, align 4
  %this1 = load %"class.boost::system::error_category"** %this.addr
  invoke void @_ZN5boost6system14error_categoryD1Ev(%"class.boost::system::error_category"* %this1)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %entry
  %0 = bitcast %"class.boost::system::error_category"* %this1 to i8*
  call void @_ZdlPv(i8* %0) nounwind
  ret void

lpad:                                             ; preds = %entry
  %1 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %2 = extractvalue { i8*, i32 } %1, 0
  store i8* %2, i8** %exn.slot
  %3 = extractvalue { i8*, i32 } %1, 1
  store i32 %3, i32* %ehselector.slot
  %4 = bitcast %"class.boost::system::error_category"* %this1 to i8*
  call void @_ZdlPv(i8* %4) nounwind
  br label %eh.resume

eh.resume:                                        ; preds = %lpad
  %exn = load i8** %exn.slot
  %sel = load i32* %ehselector.slot
  %lpad.val = insertvalue { i8*, i32 } undef, i8* %exn, 0
  %lpad.val2 = insertvalue { i8*, i32 } %lpad.val, i32 %sel, 1
  resume { i8*, i32 } %lpad.val2
}

declare void @__cxa_pure_virtual()

define linkonce_odr zeroext i1 @_ZNK5boost6system14error_category10equivalentEiRKNS0_15error_conditionE(%"class.boost::system::error_category"* %this, i32 %code, %"class.boost::system::error_condition"* %condition) unnamed_addr inlinehint align 2 {
entry:
  %this.addr = alloca %"class.boost::system::error_category"*, align 4
  %code.addr = alloca i32, align 4
  %condition.addr = alloca %"class.boost::system::error_condition"*, align 4
  %ref.tmp = alloca %"class.boost::system::error_condition", align 4
  store %"class.boost::system::error_category"* %this, %"class.boost::system::error_category"** %this.addr, align 4
  store i32 %code, i32* %code.addr, align 4
  store %"class.boost::system::error_condition"* %condition, %"class.boost::system::error_condition"** %condition.addr, align 4
  %this1 = load %"class.boost::system::error_category"** %this.addr
  %0 = bitcast %"class.boost::system::error_category"* %this1 to void (%"class.boost::system::error_condition"*, %"class.boost::system::error_category"*, i32)***
  %vtable = load void (%"class.boost::system::error_condition"*, %"class.boost::system::error_category"*, i32)*** %0
  %vfn = getelementptr inbounds void (%"class.boost::system::error_condition"*, %"class.boost::system::error_category"*, i32)** %vtable, i64 4
  %1 = load void (%"class.boost::system::error_condition"*, %"class.boost::system::error_category"*, i32)** %vfn
  %2 = load i32* %code.addr, align 4
  call void %1(%"class.boost::system::error_condition"* sret %ref.tmp, %"class.boost::system::error_category"* %this1, i32 %2)
  %3 = load %"class.boost::system::error_condition"** %condition.addr, align 4
  %call = call zeroext i1 @_ZN5boost6systemeqERKNS0_15error_conditionES3_(%"class.boost::system::error_condition"* %ref.tmp, %"class.boost::system::error_condition"* %3)
  ret i1 %call
}

define linkonce_odr zeroext i1 @_ZNK5boost6system14error_category10equivalentERKNS0_10error_codeEi(%"class.boost::system::error_category"* %this, %"class.boost::system::error_code"* %code, i32 %condition) unnamed_addr inlinehint align 2 {
entry:
  %this.addr = alloca %"class.boost::system::error_category"*, align 4
  %code.addr = alloca %"class.boost::system::error_code"*, align 4
  %condition.addr = alloca i32, align 4
  store %"class.boost::system::error_category"* %this, %"class.boost::system::error_category"** %this.addr, align 4
  store %"class.boost::system::error_code"* %code, %"class.boost::system::error_code"** %code.addr, align 4
  store i32 %condition, i32* %condition.addr, align 4
  %this1 = load %"class.boost::system::error_category"** %this.addr
  %0 = load %"class.boost::system::error_code"** %code.addr, align 4
  %call = call %"class.boost::system::error_category"* @_ZNK5boost6system10error_code8categoryEv(%"class.boost::system::error_code"* %0)
  %call2 = call zeroext i1 @_ZNK5boost6system14error_categoryeqERKS1_(%"class.boost::system::error_category"* %this1, %"class.boost::system::error_category"* %call)
  br i1 %call2, label %land.rhs, label %land.end

land.rhs:                                         ; preds = %entry
  %1 = load %"class.boost::system::error_code"** %code.addr, align 4
  %call3 = call i32 @_ZNK5boost6system10error_code5valueEv(%"class.boost::system::error_code"* %1)
  %2 = load i32* %condition.addr, align 4
  %cmp = icmp eq i32 %call3, %2
  br label %land.end

land.end:                                         ; preds = %land.rhs, %entry
  %3 = phi i1 [ false, %entry ], [ %cmp, %land.rhs ]
  ret i1 %3
}

define linkonce_odr void @_ZN5boost6system12system_errorD1Ev(%"class.boost::system::system_error"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::system::system_error"*, align 4
  store %"class.boost::system::system_error"* %this, %"class.boost::system::system_error"** %this.addr, align 4
  %this1 = load %"class.boost::system::system_error"** %this.addr
  call void @_ZN5boost6system12system_errorD2Ev(%"class.boost::system::system_error"* %this1) nounwind
  ret void
}

define linkonce_odr void @_ZN5boost6system12system_errorD0Ev(%"class.boost::system::system_error"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::system::system_error"*, align 4
  store %"class.boost::system::system_error"* %this, %"class.boost::system::system_error"** %this.addr, align 4
  %this1 = load %"class.boost::system::system_error"** %this.addr
  call void @_ZN5boost6system12system_errorD1Ev(%"class.boost::system::system_error"* %this1) nounwind
  %0 = bitcast %"class.boost::system::system_error"* %this1 to i8*
  call void @_ZdlPv(i8* %0) nounwind
  ret void
}

define linkonce_odr void @_ZN5boost10filesystem4pathC2IPcEERKT_PNS_9enable_ifINS0_11path_traits11is_pathableINS_5decayIS4_E4typeEEEvE4typeE(%"class.boost::filesystem::path"* %this, i8** %source, i8*) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::filesystem::path"*, align 4
  %source.addr = alloca i8**, align 4
  %.addr = alloca i8*, align 4
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  store %"class.boost::filesystem::path"* %this, %"class.boost::filesystem::path"** %this.addr, align 4
  store i8** %source, i8*** %source.addr, align 4
  store i8* %0, i8** %.addr, align 4
  %this1 = load %"class.boost::filesystem::path"** %this.addr
  %m_pathname = getelementptr inbounds %"class.boost::filesystem::path"* %this1, i32 0, i32 0
  call void @_ZNSsC1Ev(%"class.std::basic_string"* %m_pathname)
  %1 = load i8*** %source.addr, align 4
  %m_pathname2 = getelementptr inbounds %"class.boost::filesystem::path"* %this1, i32 0, i32 0
  %call = invoke %"class.std::codecvt"* @_ZN5boost10filesystem4path7codecvtEv()
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %entry
  invoke void @_ZN5boost10filesystem11path_traits8dispatchIcSsEEvRKPT_RT0_RKSt7codecvtIwc11__mbstate_tE(i8** %1, %"class.std::basic_string"* %m_pathname2, %"class.std::codecvt"* %call)
          to label %invoke.cont3 unwind label %lpad

invoke.cont3:                                     ; preds = %invoke.cont
  ret void

lpad:                                             ; preds = %invoke.cont, %entry
  %2 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %3 = extractvalue { i8*, i32 } %2, 0
  store i8* %3, i8** %exn.slot
  %4 = extractvalue { i8*, i32 } %2, 1
  store i32 %4, i32* %ehselector.slot
  invoke void @_ZNSsD1Ev(%"class.std::basic_string"* %m_pathname)
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
  %5 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          catch i8* null
  call void @_ZSt9terminatev() noreturn nounwind
  unreachable
}

declare void @_ZNSsC1Ev(%"class.std::basic_string"*)

define linkonce_odr void @_ZN5boost10filesystem11path_traits8dispatchIcSsEEvRKPT_RT0_RKSt7codecvtIwc11__mbstate_tE(i8** %c_str, %"class.std::basic_string"* %to, %"class.std::codecvt"* %cvt) inlinehint {
entry:
  %c_str.addr = alloca i8**, align 4
  %to.addr = alloca %"class.std::basic_string"*, align 4
  %cvt.addr = alloca %"class.std::codecvt"*, align 4
  store i8** %c_str, i8*** %c_str.addr, align 4
  store %"class.std::basic_string"* %to, %"class.std::basic_string"** %to.addr, align 4
  store %"class.std::codecvt"* %cvt, %"class.std::codecvt"** %cvt.addr, align 4
  %0 = load i8*** %c_str.addr, align 4
  %1 = load i8** %0, align 4
  %tobool = icmp ne i8* %1, null
  br i1 %tobool, label %cond.true, label %cond.false

cond.true:                                        ; preds = %entry
  br label %cond.end

cond.false:                                       ; preds = %entry
  call void @__assert_fail(i8* getelementptr inbounds ([6 x i8]* @.str10, i32 0, i32 0), i8* getelementptr inbounds ([59 x i8]* @.str11, i32 0, i32 0), i32 214, i8* getelementptr inbounds ([125 x i8]* @__PRETTY_FUNCTION__._ZN5boost10filesystem11path_traits8dispatchIcSsEEvRKPT_RT0_RKSt7codecvtIwc11__mbstate_tE, i32 0, i32 0)) noreturn nounwind
  unreachable
                                                  ; No predecessors!
  br label %cond.end

cond.end:                                         ; preds = %2, %cond.true
  %3 = load i8*** %c_str.addr, align 4
  %4 = load i8** %3, align 4
  %5 = load %"class.std::basic_string"** %to.addr, align 4
  %6 = load %"class.std::codecvt"** %cvt.addr, align 4
  call void @_ZN5boost10filesystem11path_traits7convertEPKcRSsRKSt7codecvtIwc11__mbstate_tE(i8* %4, %"class.std::basic_string"* %5, %"class.std::codecvt"* %6)
  ret void
}

declare %"class.std::codecvt"* @_ZN5boost10filesystem4path7codecvtEv()

declare void @__assert_fail(i8*, i8*, i32, i8*) noreturn nounwind

define linkonce_odr void @_ZN5boost10filesystem11path_traits7convertEPKcRSsRKSt7codecvtIwc11__mbstate_tE(i8* %from, %"class.std::basic_string"* %to, %"class.std::codecvt"*) inlinehint {
entry:
  %from.addr = alloca i8*, align 4
  %to.addr = alloca %"class.std::basic_string"*, align 4
  %.addr = alloca %"class.std::codecvt"*, align 4
  store i8* %from, i8** %from.addr, align 4
  store %"class.std::basic_string"* %to, %"class.std::basic_string"** %to.addr, align 4
  store %"class.std::codecvt"* %0, %"class.std::codecvt"** %.addr, align 4
  %1 = load i8** %from.addr, align 4
  %tobool = icmp ne i8* %1, null
  br i1 %tobool, label %cond.true, label %cond.false

cond.true:                                        ; preds = %entry
  br label %cond.end

cond.false:                                       ; preds = %entry
  call void @__assert_fail(i8* getelementptr inbounds ([5 x i8]* @.str12, i32 0, i32 0), i8* getelementptr inbounds ([59 x i8]* @.str11, i32 0, i32 0), i32 143, i8* getelementptr inbounds ([96 x i8]* @__PRETTY_FUNCTION__._ZN5boost10filesystem11path_traits7convertEPKcRSsRKSt7codecvtIwc11__mbstate_tE, i32 0, i32 0)) noreturn nounwind
  unreachable
                                                  ; No predecessors!
  br label %cond.end

cond.end:                                         ; preds = %2, %cond.true
  %3 = load %"class.std::basic_string"** %to.addr, align 4
  %4 = load i8** %from.addr, align 4
  %call = call %"class.std::basic_string"* @_ZNSspLEPKc(%"class.std::basic_string"* %3, i8* %4)
  ret void
}

declare void @_ZdlPv(i8*) nounwind

define linkonce_odr void @_ZN5boost6system12system_errorD2Ev(%"class.boost::system::system_error"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::system::system_error"*, align 4
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  store %"class.boost::system::system_error"* %this, %"class.boost::system::system_error"** %this.addr, align 4
  %this1 = load %"class.boost::system::system_error"** %this.addr
  %0 = bitcast %"class.boost::system::system_error"* %this1 to i8***
  store i8** getelementptr inbounds ([5 x i8*]* @_ZTVN5boost6system12system_errorE, i64 0, i64 2), i8*** %0
  %m_what = getelementptr inbounds %"class.boost::system::system_error"* %this1, i32 0, i32 2
  invoke void @_ZNSsD1Ev(%"class.std::basic_string"* %m_what)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %entry
  %1 = bitcast %"class.boost::system::system_error"* %this1 to %"class.std::runtime_error"*
  call void @_ZNSt13runtime_errorD2Ev(%"class.std::runtime_error"* %1) nounwind
  ret void

lpad:                                             ; preds = %entry
  %2 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
          filter [0 x i8*] zeroinitializer
  %3 = extractvalue { i8*, i32 } %2, 0
  store i8* %3, i8** %exn.slot
  %4 = extractvalue { i8*, i32 } %2, 1
  store i32 %4, i32* %ehselector.slot
  %5 = bitcast %"class.boost::system::system_error"* %this1 to %"class.std::runtime_error"*
  call void @_ZNSt13runtime_errorD2Ev(%"class.std::runtime_error"* %5) nounwind
  br label %filter.dispatch

filter.dispatch:                                  ; preds = %lpad
  %exn = load i8** %exn.slot
  call void @__cxa_call_unexpected(i8* %exn) noreturn
  unreachable
}

declare void @_ZNSt13runtime_errorD2Ev(%"class.std::runtime_error"*) nounwind

define linkonce_odr zeroext i1 @_ZNK5boost6system14error_categoryeqERKS1_(%"class.boost::system::error_category"* %this, %"class.boost::system::error_category"* %rhs) nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::system::error_category"*, align 4
  %rhs.addr = alloca %"class.boost::system::error_category"*, align 4
  store %"class.boost::system::error_category"* %this, %"class.boost::system::error_category"** %this.addr, align 4
  store %"class.boost::system::error_category"* %rhs, %"class.boost::system::error_category"** %rhs.addr, align 4
  %this1 = load %"class.boost::system::error_category"** %this.addr
  %0 = load %"class.boost::system::error_category"** %rhs.addr, align 4
  %cmp = icmp eq %"class.boost::system::error_category"* %this1, %0
  ret i1 %cmp
}

define linkonce_odr %"class.boost::system::error_category"* @_ZNK5boost6system10error_code8categoryEv(%"class.boost::system::error_code"* %this) nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::system::error_code"*, align 4
  store %"class.boost::system::error_code"* %this, %"class.boost::system::error_code"** %this.addr, align 4
  %this1 = load %"class.boost::system::error_code"** %this.addr
  %m_cat = getelementptr inbounds %"class.boost::system::error_code"* %this1, i32 0, i32 1
  %0 = load %"class.boost::system::error_category"** %m_cat, align 4
  ret %"class.boost::system::error_category"* %0
}

define linkonce_odr i32 @_ZNK5boost6system10error_code5valueEv(%"class.boost::system::error_code"* %this) nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::system::error_code"*, align 4
  store %"class.boost::system::error_code"* %this, %"class.boost::system::error_code"** %this.addr, align 4
  %this1 = load %"class.boost::system::error_code"** %this.addr
  %m_val = getelementptr inbounds %"class.boost::system::error_code"* %this1, i32 0, i32 0
  %0 = load i32* %m_val, align 4
  ret i32 %0
}

define linkonce_odr zeroext i1 @_ZN5boost6systemeqERKNS0_15error_conditionES3_(%"class.boost::system::error_condition"* %lhs, %"class.boost::system::error_condition"* %rhs) nounwind inlinehint {
entry:
  %lhs.addr = alloca %"class.boost::system::error_condition"*, align 4
  %rhs.addr = alloca %"class.boost::system::error_condition"*, align 4
  store %"class.boost::system::error_condition"* %lhs, %"class.boost::system::error_condition"** %lhs.addr, align 4
  store %"class.boost::system::error_condition"* %rhs, %"class.boost::system::error_condition"** %rhs.addr, align 4
  %0 = load %"class.boost::system::error_condition"** %lhs.addr, align 4
  %m_cat = getelementptr inbounds %"class.boost::system::error_condition"* %0, i32 0, i32 1
  %1 = load %"class.boost::system::error_category"** %m_cat, align 4
  %2 = load %"class.boost::system::error_condition"** %rhs.addr, align 4
  %m_cat1 = getelementptr inbounds %"class.boost::system::error_condition"* %2, i32 0, i32 1
  %3 = load %"class.boost::system::error_category"** %m_cat1, align 4
  %cmp = icmp eq %"class.boost::system::error_category"* %1, %3
  br i1 %cmp, label %land.rhs, label %land.end

land.rhs:                                         ; preds = %entry
  %4 = load %"class.boost::system::error_condition"** %lhs.addr, align 4
  %m_val = getelementptr inbounds %"class.boost::system::error_condition"* %4, i32 0, i32 0
  %5 = load i32* %m_val, align 4
  %6 = load %"class.boost::system::error_condition"** %rhs.addr, align 4
  %m_val2 = getelementptr inbounds %"class.boost::system::error_condition"* %6, i32 0, i32 0
  %7 = load i32* %m_val2, align 4
  %cmp3 = icmp eq i32 %5, %7
  br label %land.end

land.end:                                         ; preds = %land.rhs, %entry
  %8 = phi i1 [ false, %entry ], [ %cmp3, %land.rhs ]
  ret i1 %8
}

define linkonce_odr void @_ZN5boost6system14error_categoryD2Ev(%"class.boost::system::error_category"* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::system::error_category"*, align 4
  store %"class.boost::system::error_category"* %this, %"class.boost::system::error_category"** %this.addr, align 4
  %this1 = load %"class.boost::system::error_category"** %this.addr
  %0 = bitcast %"class.boost::system::error_category"* %this1 to %"class.boost::noncopyable_::noncopyable"*
  call void @_ZN5boost12noncopyable_11noncopyableD2Ev(%"class.boost::noncopyable_::noncopyable"* %0)
  ret void
}

define linkonce_odr void @_ZN5boost12noncopyable_11noncopyableD2Ev(%"class.boost::noncopyable_::noncopyable"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::noncopyable_::noncopyable"*, align 4
  store %"class.boost::noncopyable_::noncopyable"* %this, %"class.boost::noncopyable_::noncopyable"** %this.addr, align 4
  %this1 = load %"class.boost::noncopyable_::noncopyable"** %this.addr
  ret void
}

define linkonce_odr void @_ZN5boost10filesystem4pathD2Ev(%"class.boost::filesystem::path"* %this) unnamed_addr inlinehint align 2 {
entry:
  %this.addr = alloca %"class.boost::filesystem::path"*, align 4
  store %"class.boost::filesystem::path"* %this, %"class.boost::filesystem::path"** %this.addr, align 4
  %this1 = load %"class.boost::filesystem::path"** %this.addr
  %m_pathname = getelementptr inbounds %"class.boost::filesystem::path"* %this1, i32 0, i32 0
  call void @_ZNSsD1Ev(%"class.std::basic_string"* %m_pathname)
  ret void
}

declare i64 @_ZN5boost10filesystem6detail9file_sizeERKNS0_4pathEPNS_6system10error_codeE(%"class.boost::filesystem::path"*, %"class.boost::system::error_code"*)

define linkonce_odr zeroext i1 @_ZN5boost10filesystem10is_regularENS0_11file_statusE(%"class.boost::filesystem::file_status"* byval align 4 %f) inlinehint {
entry:
  %call = call i32 @_ZNK5boost10filesystem11file_status4typeEv(%"class.boost::filesystem::file_status"* %f)
  %cmp = icmp eq i32 %call, 2
  ret i1 %cmp
}

declare void @_ZN5boost10filesystem6detail6statusERKNS0_4pathEPNS_6system10error_codeE(%"class.boost::filesystem::file_status"* sret, %"class.boost::filesystem::path"*, %"class.boost::system::error_code"*)

define linkonce_odr i32 @_ZNK5boost10filesystem11file_status4typeEv(%"class.boost::filesystem::file_status"* %this) nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::filesystem::file_status"*, align 4
  store %"class.boost::filesystem::file_status"* %this, %"class.boost::filesystem::file_status"** %this.addr, align 4
  %this1 = load %"class.boost::filesystem::file_status"** %this.addr
  %m_value = getelementptr inbounds %"class.boost::filesystem::file_status"* %this1, i32 0, i32 0
  %0 = load i32* %m_value, align 4
  ret i32 %0
}

define linkonce_odr zeroext i1 @_ZN5boost10filesystem6existsENS0_11file_statusE(%"class.boost::filesystem::file_status"* byval align 4 %f) nounwind inlinehint {
entry:
  %call = call i32 @_ZNK5boost10filesystem11file_status4typeEv(%"class.boost::filesystem::file_status"* %f)
  %cmp = icmp ne i32 %call, 0
  br i1 %cmp, label %land.rhs, label %land.end

land.rhs:                                         ; preds = %entry
  %call1 = call i32 @_ZNK5boost10filesystem11file_status4typeEv(%"class.boost::filesystem::file_status"* %f)
  %cmp2 = icmp ne i32 %call1, 1
  br label %land.end

land.end:                                         ; preds = %land.rhs, %entry
  %0 = phi i1 [ false, %entry ], [ %cmp2, %land.rhs ]
  ret i1 %0
}

define linkonce_odr void @_ZN5boost6system15error_conditionC2EiRKNS0_14error_categoryE(%"class.boost::system::error_condition"* %this, i32 %val, %"class.boost::system::error_category"* %cat) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::system::error_condition"*, align 4
  %val.addr = alloca i32, align 4
  %cat.addr = alloca %"class.boost::system::error_category"*, align 4
  store %"class.boost::system::error_condition"* %this, %"class.boost::system::error_condition"** %this.addr, align 4
  store i32 %val, i32* %val.addr, align 4
  store %"class.boost::system::error_category"* %cat, %"class.boost::system::error_category"** %cat.addr, align 4
  %this1 = load %"class.boost::system::error_condition"** %this.addr
  %m_val = getelementptr inbounds %"class.boost::system::error_condition"* %this1, i32 0, i32 0
  %0 = load i32* %val.addr, align 4
  store i32 %0, i32* %m_val, align 4
  %m_cat = getelementptr inbounds %"class.boost::system::error_condition"* %this1, i32 0, i32 1
  %1 = load %"class.boost::system::error_category"** %cat.addr, align 4
  store %"class.boost::system::error_category"* %1, %"class.boost::system::error_category"** %m_cat, align 4
  ret void
}

define internal void @_GLOBAL__I_a() section ".text.startup" {
entry:
  call void @__cxx_global_var_init()
  call void @__cxx_global_var_init1()
  call void @__cxx_global_var_init2()
  call void @__cxx_global_var_init3()
  ret void
}
