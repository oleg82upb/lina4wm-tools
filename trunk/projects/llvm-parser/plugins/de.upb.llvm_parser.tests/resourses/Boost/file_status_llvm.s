; ModuleID = 'file_status.cpp'
target datalayout = "e-p:32:32:32-i1:8:8-i8:8:8-i16:16:16-i32:32:32-i64:32:64-f32:32:32-f64:32:64-v64:64:64-v128:128:128-a0:0:64-f80:32:32-n8:16:32-S128"
target triple = "i386-pc-linux-gnu"

%"class.std::ios_base::Init" = type { i8 }
%"class.boost::system::error_category" = type { i32 (...)** }
%"class.boost::filesystem::path" = type { %"class.std::basic_string" }
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
%"class.boost::system::error_condition" = type { i32, %"class.boost::system::error_category"* }
%"class.boost::system::system_error" = type { %"class.std::runtime_error", %"class.boost::system::error_code", %"class.std::basic_string" }
%"class.std::runtime_error" = type { %"class.std::exception", %"class.std::basic_string" }
%"class.std::exception" = type { i32 (...)** }
%"class.boost::system::error_code" = type { i32, %"class.boost::system::error_category"* }
%"class.boost::filesystem::file_status" = type { i32, i32 }
%"class.std::codecvt" = type { %"class.std::__codecvt_abstract_base", %struct.__locale_struct* }
%"class.std::__codecvt_abstract_base" = type { %"class.std::locale::facet" }
%"struct.boost::io::detail::quoted_proxy" = type { %"class.std::basic_string"*, i8, i8 }
%"class.boost::filesystem::filesystem_error" = type { %"class.boost::system::system_error", %"class.boost::shared_ptr" }
%"class.boost::shared_ptr" = type { %"struct.boost::filesystem::filesystem_error::m_imp"*, %"class.boost::detail::shared_count" }
%"struct.boost::filesystem::filesystem_error::m_imp" = type { %"class.boost::filesystem::path", %"class.boost::filesystem::path", %"class.std::basic_string" }
%"class.boost::detail::shared_count" = type { %"class.boost::detail::sp_counted_base"* }
%"class.boost::detail::sp_counted_base" = type { i32 (...)**, i32, i32 }
%"class.__gnu_cxx::__normal_iterator" = type { i8* }
%"class.boost::noncopyable_::noncopyable" = type { i8 }

@_ZStL8__ioinit = internal global %"class.std::ios_base::Init" zeroinitializer, align 1
@__dso_handle = external unnamed_addr global i8
@_ZN5boost6systemL14posix_categoryE = internal global %"class.boost::system::error_category"* null, align 4
@_ZN5boost6systemL10errno_ecatE = internal global %"class.boost::system::error_category"* null, align 4
@_ZN5boost6systemL11native_ecatE = internal global %"class.boost::system::error_category"* null, align 4
@.str = private unnamed_addr constant [3 x i8] c": \00", align 1
@_ZN12_GLOBAL__N_11pE = internal global %"class.boost::filesystem::path" zeroinitializer, align 4
@_ZSt4cout = external global %"class.std::basic_ostream"
@.str5 = private unnamed_addr constant [27 x i8] c"Usage: file_status <path>\0A\00", align 1
@.str6 = private unnamed_addr constant [25 x i8] c"\0Afile_status s = status(\00", align 1
@.str7 = private unnamed_addr constant [7 x i8] c", ec) \00", align 1
@.str8 = private unnamed_addr constant [33 x i8] c"\0Afile_status s = symlink_status(\00", align 1
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
@.str9 = private unnamed_addr constant [6 x i8] c"c_str\00", align 1
@.str10 = private unnamed_addr constant [59 x i8] c"/home/thomas/boost_1_52_0/boost/filesystem/path_traits.hpp\00", align 1
@__PRETTY_FUNCTION__._ZN5boost10filesystem11path_traits8dispatchIcSsEEvRKPT_RT0_RKSt7codecvtIwc11__mbstate_tE = private unnamed_addr constant [125 x i8] c"void boost::filesystem::path_traits::dispatch(T *const &, U &, const codecvt_type &) [T = char, U = std::basic_string<char>]\00", align 1
@.str11 = private unnamed_addr constant [5 x i8] c"from\00", align 1
@__PRETTY_FUNCTION__._ZN5boost10filesystem11path_traits7convertEPKcRSsRKSt7codecvtIwc11__mbstate_tE = private unnamed_addr constant [96 x i8] c"void boost::filesystem::path_traits::convert(const char *, std::string &, const codecvt_type &)\00", align 1
@.str12 = private unnamed_addr constant [9 x i8] c"\0Aexists(\00", align 1
@.str13 = private unnamed_addr constant [3 x i8] c") \00", align 1
@_ZTSN5boost10filesystem16filesystem_errorE = linkonce_odr constant [39 x i8] c"N5boost10filesystem16filesystem_errorE\00"
@_ZTIN5boost10filesystem16filesystem_errorE = linkonce_odr unnamed_addr constant { i8*, i8*, i8* } { i8* bitcast (i8** getelementptr inbounds (i8** @_ZTVN10__cxxabiv120__si_class_type_infoE, i32 2) to i8*), i8* getelementptr inbounds ([39 x i8]* @_ZTSN5boost10filesystem16filesystem_errorE, i32 0, i32 0), i8* bitcast ({ i8*, i8*, i8* }* @_ZTIN5boost6system12system_errorE to i8*) }
@.str14 = private unnamed_addr constant [4 x i8] c"is \00", align 1
@.str15 = private unnamed_addr constant [5 x i8] c"true\00", align 1
@.str16 = private unnamed_addr constant [6 x i8] c"false\00", align 1
@.str17 = private unnamed_addr constant [2 x i8] c"\0A\00", align 1
@.str18 = private unnamed_addr constant [38 x i8] c"throws a filesystem_error exception: \00", align 1
@.str19 = private unnamed_addr constant [31 x i8] c"sets ec to indicate an error:\0A\00", align 1
@.str20 = private unnamed_addr constant [18 x i8] c"   ec.value() is \00", align 1
@.str21 = private unnamed_addr constant [21 x i8] c"   ec.message() is \22\00", align 1
@.str22 = private unnamed_addr constant [3 x i8] c"\22\0A\00", align 1
@.str23 = private unnamed_addr constant [44 x i8] c"   ec.default_error_condition().value() is \00", align 1
@.str24 = private unnamed_addr constant [47 x i8] c"   ec.default_error_condition().message() is \22\00", align 1
@.str25 = private unnamed_addr constant [12 x i8] c"clears ec.\0A\00", align 1
@.str26 = private unnamed_addr constant [13 x i8] c"s.type() is \00", align 1
@.str27 = private unnamed_addr constant [24 x i8] c", which is defined as \22\00", align 1
@.str28 = private unnamed_addr constant [14 x i8] c"exists(s) is \00", align 1
@.str29 = private unnamed_addr constant [20 x i8] c"status_known(s) is \00", align 1
@.str30 = private unnamed_addr constant [23 x i8] c"is_regular_file(s) is \00", align 1
@.str31 = private unnamed_addr constant [20 x i8] c"is_directory(s) is \00", align 1
@.str32 = private unnamed_addr constant [16 x i8] c"is_other(s) is \00", align 1
@.str33 = private unnamed_addr constant [18 x i8] c"is_symlink(s) is \00", align 1
@_ZN12_GLOBAL__N_113file_type_tabE = internal global [10 x i8*] [i8* getelementptr inbounds ([13 x i8]* @.str34, i32 0, i32 0), i8* getelementptr inbounds ([15 x i8]* @.str35, i32 0, i32 0), i8* getelementptr inbounds ([13 x i8]* @.str36, i32 0, i32 0), i8* getelementptr inbounds ([15 x i8]* @.str37, i32 0, i32 0), i8* getelementptr inbounds ([13 x i8]* @.str38, i32 0, i32 0), i8* getelementptr inbounds ([11 x i8]* @.str39, i32 0, i32 0), i8* getelementptr inbounds ([15 x i8]* @.str40, i32 0, i32 0), i8* getelementptr inbounds ([10 x i8]* @.str41, i32 0, i32 0), i8* getelementptr inbounds ([12 x i8]* @.str42, i32 0, i32 0), i8* getelementptr inbounds ([13 x i8]* @.str43, i32 0, i32 0)], align 4
@.str34 = private unnamed_addr constant [13 x i8] c"status_error\00", align 1
@.str35 = private unnamed_addr constant [15 x i8] c"file_not_found\00", align 1
@.str36 = private unnamed_addr constant [13 x i8] c"regular_file\00", align 1
@.str37 = private unnamed_addr constant [15 x i8] c"directory_file\00", align 1
@.str38 = private unnamed_addr constant [13 x i8] c"symlink_file\00", align 1
@.str39 = private unnamed_addr constant [11 x i8] c"block_file\00", align 1
@.str40 = private unnamed_addr constant [15 x i8] c"character_file\00", align 1
@.str41 = private unnamed_addr constant [10 x i8] c"fifo_file\00", align 1
@.str42 = private unnamed_addr constant [12 x i8] c"socket_file\00", align 1
@.str43 = private unnamed_addr constant [13 x i8] c"type_unknown\00", align 1
@.str44 = private unnamed_addr constant [7 x i8] c"Boost \00", align 1
@.str45 = private unnamed_addr constant [3 x i8] c", \00", align 1
@.str46 = private unnamed_addr constant [33 x i8] c"Clang version 3.3 (trunk 168850)\00", align 1
@.str47 = private unnamed_addr constant [31 x i8] c"GNU libstdc++ version 20110903\00", align 1
@.str48 = private unnamed_addr constant [6 x i8] c"linux\00", align 1
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

define internal void @__cxx_global_var_init4() section ".text.startup" {
entry:
  call void @_ZN5boost10filesystem4pathC1Ev(%"class.boost::filesystem::path"* @_ZN12_GLOBAL__N_11pE)
  %0 = call i32 @__cxa_atexit(void (i8*)* bitcast (void (%"class.boost::filesystem::path"*)* @_ZN5boost10filesystem4pathD1Ev to void (i8*)*), i8* bitcast (%"class.boost::filesystem::path"* @_ZN12_GLOBAL__N_11pE to i8*), i8* @__dso_handle) nounwind
  ret void
}

define linkonce_odr void @_ZN5boost10filesystem4pathC1Ev(%"class.boost::filesystem::path"* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::filesystem::path"*, align 4
  store %"class.boost::filesystem::path"* %this, %"class.boost::filesystem::path"** %this.addr, align 4
  %this1 = load %"class.boost::filesystem::path"** %this.addr
  call void @_ZN5boost10filesystem4pathC2Ev(%"class.boost::filesystem::path"* %this1)
  ret void
}

define linkonce_odr void @_ZN5boost10filesystem4pathD1Ev(%"class.boost::filesystem::path"* %this) unnamed_addr inlinehint align 2 {
entry:
  %this.addr = alloca %"class.boost::filesystem::path"*, align 4
  store %"class.boost::filesystem::path"* %this, %"class.boost::filesystem::path"** %this.addr, align 4
  %this1 = load %"class.boost::filesystem::path"** %this.addr
  call void @_ZN5boost10filesystem4pathD2Ev(%"class.boost::filesystem::path"* %this1)
  ret void
}

define i32 @_Z8cpp_mainiPPc(i32 %argc, i8** %argv) {
entry:
  %argc.addr = alloca i32, align 4
  %argv.addr = alloca i8**, align 4
  %ec = alloca %"class.boost::system::error_code", align 4
  %s = alloca %"class.boost::filesystem::file_status", align 4
  %agg.tmp = alloca %"class.boost::filesystem::file_status", align 4
  %agg.tmp7 = alloca %"class.boost::system::error_code", align 4
  %ref.tmp = alloca %"class.boost::filesystem::file_status", align 4
  %agg.tmp11 = alloca %"class.boost::filesystem::file_status", align 4
  %agg.tmp12 = alloca %"class.boost::system::error_code", align 4
  store i32 %argc, i32* %argc.addr, align 4
  store i8** %argv, i8*** %argv.addr, align 4
  call void @_ZN12_GLOBAL__N_118print_boost_macrosEv()
  %0 = load i32* %argc.addr, align 4
  %cmp = icmp slt i32 %0, 2
  br i1 %cmp, label %if.then, label %if.else

if.then:                                          ; preds = %entry
  %call = call %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* @_ZSt4cout, i8* getelementptr inbounds ([27 x i8]* @.str5, i32 0, i32 0))
  %1 = load i8*** %argv.addr, align 4
  %arrayidx = getelementptr inbounds i8** %1, i32 0
  %call1 = call %"class.boost::filesystem::path"* @_ZN5boost10filesystem4pathaSIPcEENS_9enable_ifINS0_11path_traits11is_pathableINS_5decayIT_E4typeEEERS1_E4typeERKS8_(%"class.boost::filesystem::path"* @_ZN12_GLOBAL__N_11pE, i8** %arrayidx)
  br label %if.end

if.else:                                          ; preds = %entry
  %2 = load i8*** %argv.addr, align 4
  %arrayidx2 = getelementptr inbounds i8** %2, i32 1
  %call3 = call %"class.boost::filesystem::path"* @_ZN5boost10filesystem4pathaSIPcEENS_9enable_ifINS0_11path_traits11is_pathableINS_5decayIT_E4typeEEERS1_E4typeERKS8_(%"class.boost::filesystem::path"* @_ZN12_GLOBAL__N_11pE, i8** %arrayidx2)
  br label %if.end

if.end:                                           ; preds = %if.else, %if.then
  call void @_ZN5boost6system10error_codeC1Ev(%"class.boost::system::error_code"* %ec)
  call void @_ZN5boost10filesystem6statusERKNS0_4pathERNS_6system10error_codeE(%"class.boost::filesystem::file_status"* sret %s, %"class.boost::filesystem::path"* @_ZN12_GLOBAL__N_11pE, %"class.boost::system::error_code"* %ec)
  %call4 = call %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* @_ZSt4cout, i8* getelementptr inbounds ([25 x i8]* @.str6, i32 0, i32 0))
  %call5 = call %"class.std::basic_ostream"* @_ZN5boost10filesystemlsIcSt11char_traitsIcEEERSt13basic_ostreamIT_T0_ES8_RKNS0_4pathE(%"class.std::basic_ostream"* %call4, %"class.boost::filesystem::path"* @_ZN12_GLOBAL__N_11pE)
  %call6 = call %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* %call5, i8* getelementptr inbounds ([7 x i8]* @.str7, i32 0, i32 0))
  %3 = bitcast %"class.boost::filesystem::file_status"* %agg.tmp to i8*
  %4 = bitcast %"class.boost::filesystem::file_status"* %s to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %3, i8* %4, i32 8, i32 4, i1 false)
  %5 = bitcast %"class.boost::system::error_code"* %agg.tmp7 to i8*
  %6 = bitcast %"class.boost::system::error_code"* %ec to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %5, i8* %6, i32 8, i32 4, i1 false)
  call void @_ZN12_GLOBAL__N_111show_statusEN5boost10filesystem11file_statusENS0_6system10error_codeE(%"class.boost::filesystem::file_status"* byval align 4 %agg.tmp, %"class.boost::system::error_code"* byval align 4 %agg.tmp7)
  call void @_ZN5boost10filesystem14symlink_statusERKNS0_4pathERNS_6system10error_codeE(%"class.boost::filesystem::file_status"* sret %ref.tmp, %"class.boost::filesystem::path"* @_ZN12_GLOBAL__N_11pE, %"class.boost::system::error_code"* %ec)
  %7 = bitcast %"class.boost::filesystem::file_status"* %s to i8*
  %8 = bitcast %"class.boost::filesystem::file_status"* %ref.tmp to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %7, i8* %8, i32 8, i32 4, i1 false)
  %call8 = call %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* @_ZSt4cout, i8* getelementptr inbounds ([33 x i8]* @.str8, i32 0, i32 0))
  %call9 = call %"class.std::basic_ostream"* @_ZN5boost10filesystemlsIcSt11char_traitsIcEEERSt13basic_ostreamIT_T0_ES8_RKNS0_4pathE(%"class.std::basic_ostream"* %call8, %"class.boost::filesystem::path"* @_ZN12_GLOBAL__N_11pE)
  %call10 = call %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* %call9, i8* getelementptr inbounds ([7 x i8]* @.str7, i32 0, i32 0))
  %9 = bitcast %"class.boost::filesystem::file_status"* %agg.tmp11 to i8*
  %10 = bitcast %"class.boost::filesystem::file_status"* %s to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %9, i8* %10, i32 8, i32 4, i1 false)
  %11 = bitcast %"class.boost::system::error_code"* %agg.tmp12 to i8*
  %12 = bitcast %"class.boost::system::error_code"* %ec to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %11, i8* %12, i32 8, i32 4, i1 false)
  call void @_ZN12_GLOBAL__N_111show_statusEN5boost10filesystem11file_statusENS0_6system10error_codeE(%"class.boost::filesystem::file_status"* byval align 4 %agg.tmp11, %"class.boost::system::error_code"* byval align 4 %agg.tmp12)
  call void @_ZN12_GLOBAL__N_110try_existsEv()
  ret i32 0
}

define internal void @_ZN12_GLOBAL__N_118print_boost_macrosEv() {
entry:
  %call = call %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* @_ZSt4cout, i8* getelementptr inbounds ([7 x i8]* @.str44, i32 0, i32 0))
  %call1 = call %"class.std::basic_ostream"* @_ZNSolsEi(%"class.std::basic_ostream"* %call, i32 1)
  %call2 = call %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_c(%"class.std::basic_ostream"* %call1, i8 signext 46)
  %call3 = call %"class.std::basic_ostream"* @_ZNSolsEi(%"class.std::basic_ostream"* %call2, i32 52)
  %call4 = call %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_c(%"class.std::basic_ostream"* %call3, i8 signext 46)
  %call5 = call %"class.std::basic_ostream"* @_ZNSolsEi(%"class.std::basic_ostream"* %call4, i32 0)
  %call6 = call %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* %call5, i8* getelementptr inbounds ([3 x i8]* @.str45, i32 0, i32 0))
  %call7 = call %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* %call6, i8* getelementptr inbounds ([33 x i8]* @.str46, i32 0, i32 0))
  %call8 = call %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* %call7, i8* getelementptr inbounds ([3 x i8]* @.str45, i32 0, i32 0))
  %call9 = call %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* %call8, i8* getelementptr inbounds ([31 x i8]* @.str47, i32 0, i32 0))
  %call10 = call %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* %call9, i8* getelementptr inbounds ([3 x i8]* @.str45, i32 0, i32 0))
  %call11 = call %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* %call10, i8* getelementptr inbounds ([6 x i8]* @.str48, i32 0, i32 0))
  %call12 = call %"class.std::basic_ostream"* @_ZNSolsEPFRSoS_E(%"class.std::basic_ostream"* %call11, %"class.std::basic_ostream"* (%"class.std::basic_ostream"*)* @_ZSt4endlIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_)
  ret void
}

declare %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"*, i8*)

define linkonce_odr %"class.boost::filesystem::path"* @_ZN5boost10filesystem4pathaSIPcEENS_9enable_ifINS0_11path_traits11is_pathableINS_5decayIT_E4typeEEERS1_E4typeERKS8_(%"class.boost::filesystem::path"* %this, i8** %source) align 2 {
entry:
  %this.addr = alloca %"class.boost::filesystem::path"*, align 4
  %source.addr = alloca i8**, align 4
  store %"class.boost::filesystem::path"* %this, %"class.boost::filesystem::path"** %this.addr, align 4
  store i8** %source, i8*** %source.addr, align 4
  %this1 = load %"class.boost::filesystem::path"** %this.addr
  %m_pathname = getelementptr inbounds %"class.boost::filesystem::path"* %this1, i32 0, i32 0
  call void @_ZNSs5clearEv(%"class.std::basic_string"* %m_pathname)
  %0 = load i8*** %source.addr, align 4
  %m_pathname2 = getelementptr inbounds %"class.boost::filesystem::path"* %this1, i32 0, i32 0
  %call = call %"class.std::codecvt"* @_ZN5boost10filesystem4path7codecvtEv()
  call void @_ZN5boost10filesystem11path_traits8dispatchIcSsEEvRKPT_RT0_RKSt7codecvtIwc11__mbstate_tE(i8** %0, %"class.std::basic_string"* %m_pathname2, %"class.std::codecvt"* %call)
  ret %"class.boost::filesystem::path"* %this1
}

define linkonce_odr void @_ZN5boost6system10error_codeC1Ev(%"class.boost::system::error_code"* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::system::error_code"*, align 4
  store %"class.boost::system::error_code"* %this, %"class.boost::system::error_code"** %this.addr, align 4
  %this1 = load %"class.boost::system::error_code"** %this.addr
  call void @_ZN5boost6system10error_codeC2Ev(%"class.boost::system::error_code"* %this1)
  ret void
}

define linkonce_odr void @_ZN5boost10filesystem6statusERKNS0_4pathERNS_6system10error_codeE(%"class.boost::filesystem::file_status"* noalias sret %agg.result, %"class.boost::filesystem::path"* %p, %"class.boost::system::error_code"* %ec) inlinehint {
entry:
  %p.addr = alloca %"class.boost::filesystem::path"*, align 4
  %ec.addr = alloca %"class.boost::system::error_code"*, align 4
  store %"class.boost::filesystem::path"* %p, %"class.boost::filesystem::path"** %p.addr, align 4
  store %"class.boost::system::error_code"* %ec, %"class.boost::system::error_code"** %ec.addr, align 4
  %0 = load %"class.boost::filesystem::path"** %p.addr, align 4
  %1 = load %"class.boost::system::error_code"** %ec.addr, align 4
  call void @_ZN5boost10filesystem6detail6statusERKNS0_4pathEPNS_6system10error_codeE(%"class.boost::filesystem::file_status"* sret %agg.result, %"class.boost::filesystem::path"* %0, %"class.boost::system::error_code"* %1)
  ret void
}

define linkonce_odr %"class.std::basic_ostream"* @_ZN5boost10filesystemlsIcSt11char_traitsIcEEERSt13basic_ostreamIT_T0_ES8_RKNS0_4pathE(%"class.std::basic_ostream"* %os, %"class.boost::filesystem::path"* %p) inlinehint {
entry:
  %os.addr = alloca %"class.std::basic_ostream"*, align 4
  %p.addr = alloca %"class.boost::filesystem::path"*, align 4
  %ref.tmp = alloca %"struct.boost::io::detail::quoted_proxy", align 4
  %ref.tmp1 = alloca %"class.std::basic_string", align 4
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  store %"class.std::basic_ostream"* %os, %"class.std::basic_ostream"** %os.addr, align 4
  store %"class.boost::filesystem::path"* %p, %"class.boost::filesystem::path"** %p.addr, align 4
  %0 = load %"class.std::basic_ostream"** %os.addr, align 4
  %1 = load %"class.boost::filesystem::path"** %p.addr, align 4
  call void @_ZNK5boost10filesystem4path6stringISsEET_v(%"class.std::basic_string"* sret %ref.tmp1, %"class.boost::filesystem::path"* %1)
  invoke void @_ZN5boost2io6quotedIcSt11char_traitsIcESaIcEEENS0_6detail12quoted_proxyIRKSbIT_T0_T1_ES7_EESC_S7_S7_(%"struct.boost::io::detail::quoted_proxy"* sret %ref.tmp, %"class.std::basic_string"* %ref.tmp1, i8 signext 38, i8 signext 34)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %entry
  %call = invoke %"class.std::basic_ostream"* @_ZN5boost2io6detaillsIcSt11char_traitsIcESaIcEEERSt13basic_ostreamIT_T0_ESA_RKNS1_12quoted_proxyIRKSbIS7_S8_T1_ES7_EE(%"class.std::basic_ostream"* %0, %"struct.boost::io::detail::quoted_proxy"* %ref.tmp)
          to label %invoke.cont2 unwind label %lpad

invoke.cont2:                                     ; preds = %invoke.cont
  call void @_ZNSsD1Ev(%"class.std::basic_string"* %ref.tmp1)
  ret %"class.std::basic_ostream"* %call

lpad:                                             ; preds = %invoke.cont, %entry
  %2 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %3 = extractvalue { i8*, i32 } %2, 0
  store i8* %3, i8** %exn.slot
  %4 = extractvalue { i8*, i32 } %2, 1
  store i32 %4, i32* %ehselector.slot
  invoke void @_ZNSsD1Ev(%"class.std::basic_string"* %ref.tmp1)
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
  %5 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          catch i8* null
  call void @_ZSt9terminatev() noreturn nounwind
  unreachable
}

define internal void @_ZN12_GLOBAL__N_111show_statusEN5boost10filesystem11file_statusENS0_6system10error_codeE(%"class.boost::filesystem::file_status"* byval align 4 %s, %"class.boost::system::error_code"* byval align 4 %ec) {
entry:
  %econd = alloca %"class.boost::system::error_condition", align 4
  %ref.tmp = alloca %"class.boost::system::error_condition", align 4
  %ref.tmp7 = alloca %"class.std::basic_string", align 4
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  %ref.tmp21 = alloca %"class.std::basic_string", align 4
  %agg.tmp = alloca %"class.boost::filesystem::file_status", align 4
  %agg.tmp45 = alloca %"class.boost::filesystem::file_status", align 4
  %agg.tmp51 = alloca %"class.boost::filesystem::file_status", align 4
  %agg.tmp57 = alloca %"class.boost::filesystem::file_status", align 4
  %agg.tmp63 = alloca %"class.boost::filesystem::file_status", align 4
  %agg.tmp69 = alloca %"class.boost::filesystem::file_status", align 4
  call void @_ZN5boost6system15error_conditionC1Ev(%"class.boost::system::error_condition"* %econd)
  %call = call void ()* (%"class.boost::system::error_code"*)* @_ZNK5boost6system10error_codecvPFvvEEv(%"class.boost::system::error_code"* %ec)
  %tobool = icmp ne void ()* %call, null
  br i1 %tobool, label %if.then, label %if.else

if.then:                                          ; preds = %entry
  call void @_ZNK5boost6system10error_code23default_error_conditionEv(%"class.boost::system::error_condition"* sret %ref.tmp, %"class.boost::system::error_code"* %ec)
  %0 = bitcast %"class.boost::system::error_condition"* %econd to i8*
  %1 = bitcast %"class.boost::system::error_condition"* %ref.tmp to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %0, i8* %1, i32 8, i32 4, i1 false)
  %call1 = call %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* @_ZSt4cout, i8* getelementptr inbounds ([31 x i8]* @.str19, i32 0, i32 0))
  %call2 = call %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* %call1, i8* getelementptr inbounds ([18 x i8]* @.str20, i32 0, i32 0))
  %call3 = call i32 @_ZNK5boost6system10error_code5valueEv(%"class.boost::system::error_code"* %ec)
  %call4 = call %"class.std::basic_ostream"* @_ZNSolsEi(%"class.std::basic_ostream"* %call2, i32 %call3)
  %call5 = call %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_c(%"class.std::basic_ostream"* %call4, i8 signext 10)
  %call6 = call %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* %call5, i8* getelementptr inbounds ([21 x i8]* @.str21, i32 0, i32 0))
  call void @_ZNK5boost6system10error_code7messageEv(%"class.std::basic_string"* sret %ref.tmp7, %"class.boost::system::error_code"* %ec)
  %call8 = invoke %"class.std::basic_ostream"* @_ZStlsIcSt11char_traitsIcESaIcEERSt13basic_ostreamIT_T0_ES7_RKSbIS4_S5_T1_E(%"class.std::basic_ostream"* %call6, %"class.std::basic_string"* %ref.tmp7)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %if.then
  %call10 = invoke %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* %call8, i8* getelementptr inbounds ([3 x i8]* @.str22, i32 0, i32 0))
          to label %invoke.cont9 unwind label %lpad

invoke.cont9:                                     ; preds = %invoke.cont
  %call12 = invoke %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* %call10, i8* getelementptr inbounds ([44 x i8]* @.str23, i32 0, i32 0))
          to label %invoke.cont11 unwind label %lpad

invoke.cont11:                                    ; preds = %invoke.cont9
  %call14 = invoke i32 @_ZNK5boost6system15error_condition5valueEv(%"class.boost::system::error_condition"* %econd)
          to label %invoke.cont13 unwind label %lpad

invoke.cont13:                                    ; preds = %invoke.cont11
  %call16 = invoke %"class.std::basic_ostream"* @_ZNSolsEi(%"class.std::basic_ostream"* %call12, i32 %call14)
          to label %invoke.cont15 unwind label %lpad

invoke.cont15:                                    ; preds = %invoke.cont13
  %call18 = invoke %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_c(%"class.std::basic_ostream"* %call16, i8 signext 10)
          to label %invoke.cont17 unwind label %lpad

invoke.cont17:                                    ; preds = %invoke.cont15
  %call20 = invoke %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* %call18, i8* getelementptr inbounds ([47 x i8]* @.str24, i32 0, i32 0))
          to label %invoke.cont19 unwind label %lpad

invoke.cont19:                                    ; preds = %invoke.cont17
  invoke void @_ZNK5boost6system15error_condition7messageEv(%"class.std::basic_string"* sret %ref.tmp21, %"class.boost::system::error_condition"* %econd)
          to label %invoke.cont22 unwind label %lpad

invoke.cont22:                                    ; preds = %invoke.cont19
  %call25 = invoke %"class.std::basic_ostream"* @_ZStlsIcSt11char_traitsIcESaIcEERSt13basic_ostreamIT_T0_ES7_RKSbIS4_S5_T1_E(%"class.std::basic_ostream"* %call20, %"class.std::basic_string"* %ref.tmp21)
          to label %invoke.cont24 unwind label %lpad23

invoke.cont24:                                    ; preds = %invoke.cont22
  %call27 = invoke %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* %call25, i8* getelementptr inbounds ([3 x i8]* @.str22, i32 0, i32 0))
          to label %invoke.cont26 unwind label %lpad23

invoke.cont26:                                    ; preds = %invoke.cont24
  invoke void @_ZNSsD1Ev(%"class.std::basic_string"* %ref.tmp21)
          to label %invoke.cont28 unwind label %lpad

invoke.cont28:                                    ; preds = %invoke.cont26
  call void @_ZNSsD1Ev(%"class.std::basic_string"* %ref.tmp7)
  br label %if.end

lpad:                                             ; preds = %invoke.cont26, %invoke.cont19, %invoke.cont17, %invoke.cont15, %invoke.cont13, %invoke.cont11, %invoke.cont9, %invoke.cont, %if.then
  %2 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %3 = extractvalue { i8*, i32 } %2, 0
  store i8* %3, i8** %exn.slot
  %4 = extractvalue { i8*, i32 } %2, 1
  store i32 %4, i32* %ehselector.slot
  br label %ehcleanup

lpad23:                                           ; preds = %invoke.cont24, %invoke.cont22
  %5 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %6 = extractvalue { i8*, i32 } %5, 0
  store i8* %6, i8** %exn.slot
  %7 = extractvalue { i8*, i32 } %5, 1
  store i32 %7, i32* %ehselector.slot
  invoke void @_ZNSsD1Ev(%"class.std::basic_string"* %ref.tmp21)
          to label %invoke.cont29 unwind label %terminate.lpad

invoke.cont29:                                    ; preds = %lpad23
  br label %ehcleanup

ehcleanup:                                        ; preds = %invoke.cont29, %lpad
  invoke void @_ZNSsD1Ev(%"class.std::basic_string"* %ref.tmp7)
          to label %invoke.cont30 unwind label %terminate.lpad

invoke.cont30:                                    ; preds = %ehcleanup
  br label %eh.resume

if.else:                                          ; preds = %entry
  %call31 = call %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* @_ZSt4cout, i8* getelementptr inbounds ([12 x i8]* @.str25, i32 0, i32 0))
  br label %if.end

if.end:                                           ; preds = %if.else, %invoke.cont28
  %call32 = call %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* @_ZSt4cout, i8* getelementptr inbounds ([13 x i8]* @.str26, i32 0, i32 0))
  %call33 = call i32 @_ZNK5boost10filesystem11file_status4typeEv(%"class.boost::filesystem::file_status"* %s)
  %call34 = call %"class.std::basic_ostream"* @_ZNSolsEi(%"class.std::basic_ostream"* %call32, i32 %call33)
  %call35 = call %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* %call34, i8* getelementptr inbounds ([24 x i8]* @.str27, i32 0, i32 0))
  %call36 = call i32 @_ZNK5boost10filesystem11file_status4typeEv(%"class.boost::filesystem::file_status"* %s)
  %call37 = call i8* @_ZN12_GLOBAL__N_115file_type_c_strEN5boost10filesystem9file_typeE(i32 %call36)
  %call38 = call %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* %call35, i8* %call37)
  %call39 = call %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* %call38, i8* getelementptr inbounds ([3 x i8]* @.str22, i32 0, i32 0))
  %call40 = call %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* @_ZSt4cout, i8* getelementptr inbounds ([14 x i8]* @.str28, i32 0, i32 0))
  %8 = bitcast %"class.boost::filesystem::file_status"* %agg.tmp to i8*
  %9 = bitcast %"class.boost::filesystem::file_status"* %s to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %8, i8* %9, i32 8, i32 4, i1 false)
  %call41 = call zeroext i1 @_ZN5boost10filesystem6existsENS0_11file_statusE(%"class.boost::filesystem::file_status"* byval align 4 %agg.tmp)
  %cond = select i1 %call41, i8* getelementptr inbounds ([5 x i8]* @.str15, i32 0, i32 0), i8* getelementptr inbounds ([6 x i8]* @.str16, i32 0, i32 0)
  %call42 = call %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* %call40, i8* %cond)
  %call43 = call %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* %call42, i8* getelementptr inbounds ([2 x i8]* @.str17, i32 0, i32 0))
  %call44 = call %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* @_ZSt4cout, i8* getelementptr inbounds ([20 x i8]* @.str29, i32 0, i32 0))
  %10 = bitcast %"class.boost::filesystem::file_status"* %agg.tmp45 to i8*
  %11 = bitcast %"class.boost::filesystem::file_status"* %s to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %10, i8* %11, i32 8, i32 4, i1 false)
  %call46 = call zeroext i1 @_ZN5boost10filesystem12status_knownENS0_11file_statusE(%"class.boost::filesystem::file_status"* byval align 4 %agg.tmp45)
  %cond47 = select i1 %call46, i8* getelementptr inbounds ([5 x i8]* @.str15, i32 0, i32 0), i8* getelementptr inbounds ([6 x i8]* @.str16, i32 0, i32 0)
  %call48 = call %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* %call44, i8* %cond47)
  %call49 = call %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* %call48, i8* getelementptr inbounds ([2 x i8]* @.str17, i32 0, i32 0))
  %call50 = call %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* @_ZSt4cout, i8* getelementptr inbounds ([23 x i8]* @.str30, i32 0, i32 0))
  %12 = bitcast %"class.boost::filesystem::file_status"* %agg.tmp51 to i8*
  %13 = bitcast %"class.boost::filesystem::file_status"* %s to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %12, i8* %13, i32 8, i32 4, i1 false)
  %call52 = call zeroext i1 @_ZN5boost10filesystem15is_regular_fileENS0_11file_statusE(%"class.boost::filesystem::file_status"* byval align 4 %agg.tmp51)
  %cond53 = select i1 %call52, i8* getelementptr inbounds ([5 x i8]* @.str15, i32 0, i32 0), i8* getelementptr inbounds ([6 x i8]* @.str16, i32 0, i32 0)
  %call54 = call %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* %call50, i8* %cond53)
  %call55 = call %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* %call54, i8* getelementptr inbounds ([2 x i8]* @.str17, i32 0, i32 0))
  %call56 = call %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* @_ZSt4cout, i8* getelementptr inbounds ([20 x i8]* @.str31, i32 0, i32 0))
  %14 = bitcast %"class.boost::filesystem::file_status"* %agg.tmp57 to i8*
  %15 = bitcast %"class.boost::filesystem::file_status"* %s to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %14, i8* %15, i32 8, i32 4, i1 false)
  %call58 = call zeroext i1 @_ZN5boost10filesystem12is_directoryENS0_11file_statusE(%"class.boost::filesystem::file_status"* byval align 4 %agg.tmp57)
  %cond59 = select i1 %call58, i8* getelementptr inbounds ([5 x i8]* @.str15, i32 0, i32 0), i8* getelementptr inbounds ([6 x i8]* @.str16, i32 0, i32 0)
  %call60 = call %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* %call56, i8* %cond59)
  %call61 = call %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* %call60, i8* getelementptr inbounds ([2 x i8]* @.str17, i32 0, i32 0))
  %call62 = call %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* @_ZSt4cout, i8* getelementptr inbounds ([16 x i8]* @.str32, i32 0, i32 0))
  %16 = bitcast %"class.boost::filesystem::file_status"* %agg.tmp63 to i8*
  %17 = bitcast %"class.boost::filesystem::file_status"* %s to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %16, i8* %17, i32 8, i32 4, i1 false)
  %call64 = call zeroext i1 @_ZN5boost10filesystem8is_otherENS0_11file_statusE(%"class.boost::filesystem::file_status"* byval align 4 %agg.tmp63)
  %cond65 = select i1 %call64, i8* getelementptr inbounds ([5 x i8]* @.str15, i32 0, i32 0), i8* getelementptr inbounds ([6 x i8]* @.str16, i32 0, i32 0)
  %call66 = call %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* %call62, i8* %cond65)
  %call67 = call %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* %call66, i8* getelementptr inbounds ([2 x i8]* @.str17, i32 0, i32 0))
  %call68 = call %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* @_ZSt4cout, i8* getelementptr inbounds ([18 x i8]* @.str33, i32 0, i32 0))
  %18 = bitcast %"class.boost::filesystem::file_status"* %agg.tmp69 to i8*
  %19 = bitcast %"class.boost::filesystem::file_status"* %s to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %18, i8* %19, i32 8, i32 4, i1 false)
  %call70 = call zeroext i1 @_ZN5boost10filesystem10is_symlinkENS0_11file_statusE(%"class.boost::filesystem::file_status"* byval align 4 %agg.tmp69)
  %cond71 = select i1 %call70, i8* getelementptr inbounds ([5 x i8]* @.str15, i32 0, i32 0), i8* getelementptr inbounds ([6 x i8]* @.str16, i32 0, i32 0)
  %call72 = call %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* %call68, i8* %cond71)
  %call73 = call %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* %call72, i8* getelementptr inbounds ([2 x i8]* @.str17, i32 0, i32 0))
  ret void

eh.resume:                                        ; preds = %invoke.cont30
  %exn = load i8** %exn.slot
  %sel = load i32* %ehselector.slot
  %lpad.val = insertvalue { i8*, i32 } undef, i8* %exn, 0
  %lpad.val74 = insertvalue { i8*, i32 } %lpad.val, i32 %sel, 1
  resume { i8*, i32 } %lpad.val74

terminate.lpad:                                   ; preds = %ehcleanup, %lpad23
  %20 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          catch i8* null
  call void @_ZSt9terminatev() noreturn nounwind
  unreachable
}

declare void @llvm.memcpy.p0i8.p0i8.i32(i8* nocapture, i8* nocapture, i32, i32, i1) nounwind

define linkonce_odr void @_ZN5boost10filesystem14symlink_statusERKNS0_4pathERNS_6system10error_codeE(%"class.boost::filesystem::file_status"* noalias sret %agg.result, %"class.boost::filesystem::path"* %p, %"class.boost::system::error_code"* %ec) inlinehint {
entry:
  %p.addr = alloca %"class.boost::filesystem::path"*, align 4
  %ec.addr = alloca %"class.boost::system::error_code"*, align 4
  store %"class.boost::filesystem::path"* %p, %"class.boost::filesystem::path"** %p.addr, align 4
  store %"class.boost::system::error_code"* %ec, %"class.boost::system::error_code"** %ec.addr, align 4
  %0 = load %"class.boost::filesystem::path"** %p.addr, align 4
  %1 = load %"class.boost::system::error_code"** %ec.addr, align 4
  call void @_ZN5boost10filesystem6detail14symlink_statusERKNS0_4pathEPNS_6system10error_codeE(%"class.boost::filesystem::file_status"* sret %agg.result, %"class.boost::filesystem::path"* %0, %"class.boost::system::error_code"* %1)
  ret void
}

define internal void @_ZN12_GLOBAL__N_110try_existsEv() {
entry:
  %result = alloca i8, align 1
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  %ex = alloca %"class.boost::filesystem::filesystem_error"*, align 4
  %call = call %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* @_ZSt4cout, i8* getelementptr inbounds ([9 x i8]* @.str12, i32 0, i32 0))
  %call1 = call %"class.std::basic_ostream"* @_ZN5boost10filesystemlsIcSt11char_traitsIcEEERSt13basic_ostreamIT_T0_ES8_RKNS0_4pathE(%"class.std::basic_ostream"* %call, %"class.boost::filesystem::path"* @_ZN12_GLOBAL__N_11pE)
  %call2 = call %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* %call1, i8* getelementptr inbounds ([3 x i8]* @.str13, i32 0, i32 0))
  %call3 = invoke zeroext i1 @_ZN5boost10filesystem6existsERKNS0_4pathE(%"class.boost::filesystem::path"* @_ZN12_GLOBAL__N_11pE)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %entry
  %frombool = zext i1 %call3 to i8
  store i8 %frombool, i8* %result, align 1
  %call5 = invoke %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* @_ZSt4cout, i8* getelementptr inbounds ([4 x i8]* @.str14, i32 0, i32 0))
          to label %invoke.cont4 unwind label %lpad

invoke.cont4:                                     ; preds = %invoke.cont
  %0 = load i8* %result, align 1
  %tobool = trunc i8 %0 to i1
  %cond = select i1 %tobool, i8* getelementptr inbounds ([5 x i8]* @.str15, i32 0, i32 0), i8* getelementptr inbounds ([6 x i8]* @.str16, i32 0, i32 0)
  %call7 = invoke %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* %call5, i8* %cond)
          to label %invoke.cont6 unwind label %lpad

invoke.cont6:                                     ; preds = %invoke.cont4
  %call9 = invoke %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* %call7, i8* getelementptr inbounds ([2 x i8]* @.str17, i32 0, i32 0))
          to label %invoke.cont8 unwind label %lpad

invoke.cont8:                                     ; preds = %invoke.cont6
  br label %try.cont

lpad:                                             ; preds = %invoke.cont6, %invoke.cont4, %invoke.cont, %entry
  %1 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          catch i8* bitcast ({ i8*, i8*, i8* }* @_ZTIN5boost10filesystem16filesystem_errorE to i8*)
  %2 = extractvalue { i8*, i32 } %1, 0
  store i8* %2, i8** %exn.slot
  %3 = extractvalue { i8*, i32 } %1, 1
  store i32 %3, i32* %ehselector.slot
  br label %catch.dispatch

catch.dispatch:                                   ; preds = %lpad
  %sel = load i32* %ehselector.slot
  %4 = call i32 @llvm.eh.typeid.for(i8* bitcast ({ i8*, i8*, i8* }* @_ZTIN5boost10filesystem16filesystem_errorE to i8*)) nounwind
  %matches = icmp eq i32 %sel, %4
  br i1 %matches, label %catch, label %eh.resume

catch:                                            ; preds = %catch.dispatch
  %exn = load i8** %exn.slot
  %5 = call i8* @__cxa_begin_catch(i8* %exn) nounwind
  %exn.byref = bitcast i8* %5 to %"class.boost::filesystem::filesystem_error"*
  store %"class.boost::filesystem::filesystem_error"* %exn.byref, %"class.boost::filesystem::filesystem_error"** %ex
  %call12 = invoke %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* @_ZSt4cout, i8* getelementptr inbounds ([38 x i8]* @.str18, i32 0, i32 0))
          to label %invoke.cont11 unwind label %lpad10

invoke.cont11:                                    ; preds = %catch
  %6 = load %"class.boost::filesystem::filesystem_error"** %ex, align 4
  %7 = bitcast %"class.boost::filesystem::filesystem_error"* %6 to i8* (%"class.boost::filesystem::filesystem_error"*)***
  %vtable = load i8* (%"class.boost::filesystem::filesystem_error"*)*** %7
  %vfn = getelementptr inbounds i8* (%"class.boost::filesystem::filesystem_error"*)** %vtable, i64 2
  %8 = load i8* (%"class.boost::filesystem::filesystem_error"*)** %vfn
  %call13 = call i8* %8(%"class.boost::filesystem::filesystem_error"* %6) nounwind
  %call15 = invoke %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* %call12, i8* %call13)
          to label %invoke.cont14 unwind label %lpad10

invoke.cont14:                                    ; preds = %invoke.cont11
  %call17 = invoke %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* %call15, i8* getelementptr inbounds ([2 x i8]* @.str17, i32 0, i32 0))
          to label %invoke.cont16 unwind label %lpad10

invoke.cont16:                                    ; preds = %invoke.cont14
  call void @__cxa_end_catch()
  br label %try.cont

try.cont:                                         ; preds = %invoke.cont16, %invoke.cont8
  ret void

lpad10:                                           ; preds = %invoke.cont14, %invoke.cont11, %catch
  %9 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %10 = extractvalue { i8*, i32 } %9, 0
  store i8* %10, i8** %exn.slot
  %11 = extractvalue { i8*, i32 } %9, 1
  store i32 %11, i32* %ehselector.slot
  invoke void @__cxa_end_catch()
          to label %invoke.cont18 unwind label %terminate.lpad

invoke.cont18:                                    ; preds = %lpad10
  br label %eh.resume

eh.resume:                                        ; preds = %invoke.cont18, %catch.dispatch
  %exn19 = load i8** %exn.slot
  %sel20 = load i32* %ehselector.slot
  %lpad.val = insertvalue { i8*, i32 } undef, i8* %exn19, 0
  %lpad.val21 = insertvalue { i8*, i32 } %lpad.val, i32 %sel20, 1
  resume { i8*, i32 } %lpad.val21

terminate.lpad:                                   ; preds = %lpad10
  %12 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          catch i8* null
  call void @_ZSt9terminatev() noreturn nounwind
  unreachable
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

declare void @_ZNSs5clearEv(%"class.std::basic_string"*)

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
  call void @__assert_fail(i8* getelementptr inbounds ([6 x i8]* @.str9, i32 0, i32 0), i8* getelementptr inbounds ([59 x i8]* @.str10, i32 0, i32 0), i32 214, i8* getelementptr inbounds ([125 x i8]* @__PRETTY_FUNCTION__._ZN5boost10filesystem11path_traits8dispatchIcSsEEvRKPT_RT0_RKSt7codecvtIwc11__mbstate_tE, i32 0, i32 0)) noreturn nounwind
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
  call void @__assert_fail(i8* getelementptr inbounds ([5 x i8]* @.str11, i32 0, i32 0), i8* getelementptr inbounds ([59 x i8]* @.str10, i32 0, i32 0), i32 143, i8* getelementptr inbounds ([96 x i8]* @__PRETTY_FUNCTION__._ZN5boost10filesystem11path_traits7convertEPKcRSsRKSt7codecvtIwc11__mbstate_tE, i32 0, i32 0)) noreturn nounwind
  unreachable
                                                  ; No predecessors!
  br label %cond.end

cond.end:                                         ; preds = %2, %cond.true
  %3 = load %"class.std::basic_string"** %to.addr, align 4
  %4 = load i8** %from.addr, align 4
  %call = call %"class.std::basic_string"* @_ZNSspLEPKc(%"class.std::basic_string"* %3, i8* %4)
  ret void
}

define linkonce_odr %"class.std::basic_ostream"* @_ZN5boost2io6detaillsIcSt11char_traitsIcESaIcEEERSt13basic_ostreamIT_T0_ESA_RKNS1_12quoted_proxyIRKSbIS7_S8_T1_ES7_EE(%"class.std::basic_ostream"* %os, %"struct.boost::io::detail::quoted_proxy"* %proxy) inlinehint {
entry:
  %os.addr = alloca %"class.std::basic_ostream"*, align 4
  %proxy.addr = alloca %"struct.boost::io::detail::quoted_proxy"*, align 4
  store %"class.std::basic_ostream"* %os, %"class.std::basic_ostream"** %os.addr, align 4
  store %"struct.boost::io::detail::quoted_proxy"* %proxy, %"struct.boost::io::detail::quoted_proxy"** %proxy.addr, align 4
  %0 = load %"class.std::basic_ostream"** %os.addr, align 4
  %1 = load %"struct.boost::io::detail::quoted_proxy"** %proxy.addr, align 4
  %string = getelementptr inbounds %"struct.boost::io::detail::quoted_proxy"* %1, i32 0, i32 0
  %ref = load %"class.std::basic_string"** %string, align 4
  %2 = load %"struct.boost::io::detail::quoted_proxy"** %proxy.addr, align 4
  %escape = getelementptr inbounds %"struct.boost::io::detail::quoted_proxy"* %2, i32 0, i32 1
  %3 = load i8* %escape, align 1
  %4 = load %"struct.boost::io::detail::quoted_proxy"** %proxy.addr, align 4
  %delim = getelementptr inbounds %"struct.boost::io::detail::quoted_proxy"* %4, i32 0, i32 2
  %5 = load i8* %delim, align 1
  %call = call %"class.std::basic_ostream"* @_ZN5boost2io6detail25basic_string_inserter_impIcSt11char_traitsIcESaIcEEERSt13basic_ostreamIT_T0_ESA_RKSbIS7_S8_T1_ES7_S7_(%"class.std::basic_ostream"* %0, %"class.std::basic_string"* %ref, i8 signext %3, i8 signext %5)
  ret %"class.std::basic_ostream"* %call
}

define linkonce_odr void @_ZN5boost2io6quotedIcSt11char_traitsIcESaIcEEENS0_6detail12quoted_proxyIRKSbIT_T0_T1_ES7_EESC_S7_S7_(%"struct.boost::io::detail::quoted_proxy"* noalias sret %agg.result, %"class.std::basic_string"* %s, i8 signext %escape, i8 signext %delim) inlinehint {
entry:
  %s.addr = alloca %"class.std::basic_string"*, align 4
  %escape.addr = alloca i8, align 1
  %delim.addr = alloca i8, align 1
  store %"class.std::basic_string"* %s, %"class.std::basic_string"** %s.addr, align 4
  store i8 %escape, i8* %escape.addr, align 1
  store i8 %delim, i8* %delim.addr, align 1
  %0 = load %"class.std::basic_string"** %s.addr, align 4
  %1 = load i8* %escape.addr, align 1
  %2 = load i8* %delim.addr, align 1
  call void @_ZN5boost2io6detail12quoted_proxyIRKSscEC1ES4_cc(%"struct.boost::io::detail::quoted_proxy"* %agg.result, %"class.std::basic_string"* %0, i8 signext %1, i8 signext %2)
  ret void
}

define linkonce_odr void @_ZNK5boost10filesystem4path6stringISsEET_v(%"class.std::basic_string"* noalias sret %agg.result, %"class.boost::filesystem::path"* %this) inlinehint align 2 {
entry:
  %this.addr = alloca %"class.boost::filesystem::path"*, align 4
  store %"class.boost::filesystem::path"* %this, %"class.boost::filesystem::path"** %this.addr, align 4
  %this1 = load %"class.boost::filesystem::path"** %this.addr
  %call = call %"class.std::basic_string"* @_ZNK5boost10filesystem4path6stringEv(%"class.boost::filesystem::path"* %this1)
  call void @_ZNSsC1ERKSs(%"class.std::basic_string"* %agg.result, %"class.std::basic_string"* %call)
  ret void
}

declare void @_ZNSsC1ERKSs(%"class.std::basic_string"*, %"class.std::basic_string"*)

define linkonce_odr %"class.std::basic_string"* @_ZNK5boost10filesystem4path6stringEv(%"class.boost::filesystem::path"* %this) nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::filesystem::path"*, align 4
  store %"class.boost::filesystem::path"* %this, %"class.boost::filesystem::path"** %this.addr, align 4
  %this1 = load %"class.boost::filesystem::path"** %this.addr
  %m_pathname = getelementptr inbounds %"class.boost::filesystem::path"* %this1, i32 0, i32 0
  ret %"class.std::basic_string"* %m_pathname
}

define linkonce_odr void @_ZN5boost2io6detail12quoted_proxyIRKSscEC1ES4_cc(%"struct.boost::io::detail::quoted_proxy"* %this, %"class.std::basic_string"* %s_, i8 signext %escape_, i8 signext %delim_) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"struct.boost::io::detail::quoted_proxy"*, align 4
  %s_.addr = alloca %"class.std::basic_string"*, align 4
  %escape_.addr = alloca i8, align 1
  %delim_.addr = alloca i8, align 1
  store %"struct.boost::io::detail::quoted_proxy"* %this, %"struct.boost::io::detail::quoted_proxy"** %this.addr, align 4
  store %"class.std::basic_string"* %s_, %"class.std::basic_string"** %s_.addr, align 4
  store i8 %escape_, i8* %escape_.addr, align 1
  store i8 %delim_, i8* %delim_.addr, align 1
  %this1 = load %"struct.boost::io::detail::quoted_proxy"** %this.addr
  %0 = load i8* %escape_.addr, align 1
  %1 = load i8* %delim_.addr, align 1
  %2 = load %"class.std::basic_string"** %s_.addr
  call void @_ZN5boost2io6detail12quoted_proxyIRKSscEC2ES4_cc(%"struct.boost::io::detail::quoted_proxy"* %this1, %"class.std::basic_string"* %2, i8 signext %0, i8 signext %1)
  ret void
}

define linkonce_odr void @_ZN5boost2io6detail12quoted_proxyIRKSscEC2ES4_cc(%"struct.boost::io::detail::quoted_proxy"* %this, %"class.std::basic_string"* %s_, i8 signext %escape_, i8 signext %delim_) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"struct.boost::io::detail::quoted_proxy"*, align 4
  %s_.addr = alloca %"class.std::basic_string"*, align 4
  %escape_.addr = alloca i8, align 1
  %delim_.addr = alloca i8, align 1
  store %"struct.boost::io::detail::quoted_proxy"* %this, %"struct.boost::io::detail::quoted_proxy"** %this.addr, align 4
  store %"class.std::basic_string"* %s_, %"class.std::basic_string"** %s_.addr, align 4
  store i8 %escape_, i8* %escape_.addr, align 1
  store i8 %delim_, i8* %delim_.addr, align 1
  %this1 = load %"struct.boost::io::detail::quoted_proxy"** %this.addr
  %0 = getelementptr inbounds %"struct.boost::io::detail::quoted_proxy"* %this1, i32 0, i32 0
  %1 = load %"class.std::basic_string"** %s_.addr, align 4
  store %"class.std::basic_string"* %1, %"class.std::basic_string"** %0, align 4
  %escape = getelementptr inbounds %"struct.boost::io::detail::quoted_proxy"* %this1, i32 0, i32 1
  %2 = load i8* %escape_.addr, align 1
  store i8 %2, i8* %escape, align 1
  %delim = getelementptr inbounds %"struct.boost::io::detail::quoted_proxy"* %this1, i32 0, i32 2
  %3 = load i8* %delim_.addr, align 1
  store i8 %3, i8* %delim, align 1
  ret void
}

define linkonce_odr %"class.std::basic_ostream"* @_ZN5boost2io6detail25basic_string_inserter_impIcSt11char_traitsIcESaIcEEERSt13basic_ostreamIT_T0_ESA_RKSbIS7_S8_T1_ES7_S7_(%"class.std::basic_ostream"* %os, %"class.std::basic_string"* %string, i8 signext %escape, i8 signext %delim) {
entry:
  %os.addr = alloca %"class.std::basic_ostream"*, align 4
  %string.addr = alloca %"class.std::basic_string"*, align 4
  %escape.addr = alloca i8, align 1
  %delim.addr = alloca i8, align 1
  %end_it = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %it = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  store %"class.std::basic_ostream"* %os, %"class.std::basic_ostream"** %os.addr, align 4
  store %"class.std::basic_string"* %string, %"class.std::basic_string"** %string.addr, align 4
  store i8 %escape, i8* %escape.addr, align 1
  store i8 %delim, i8* %delim.addr, align 1
  %0 = load %"class.std::basic_ostream"** %os.addr, align 4
  %1 = load i8* %delim.addr, align 1
  %call = call %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_c(%"class.std::basic_ostream"* %0, i8 signext %1)
  %2 = load %"class.std::basic_string"** %string.addr, align 4
  call void @_ZNKSs3endEv(%"class.__gnu_cxx::__normal_iterator"* sret %end_it, %"class.std::basic_string"* %2)
  %3 = load %"class.std::basic_string"** %string.addr, align 4
  call void @_ZNKSs5beginEv(%"class.__gnu_cxx::__normal_iterator"* sret %it, %"class.std::basic_string"* %3)
  br label %for.cond

for.cond:                                         ; preds = %for.inc, %entry
  %call1 = call zeroext i1 @_ZN9__gnu_cxxneIPKcSsEEbRKNS_17__normal_iteratorIT_T0_EES8_(%"class.__gnu_cxx::__normal_iterator"* %it, %"class.__gnu_cxx::__normal_iterator"* %end_it)
  br i1 %call1, label %for.body, label %for.end

for.body:                                         ; preds = %for.cond
  %call2 = call i8* @_ZNK9__gnu_cxx17__normal_iteratorIPKcSsEdeEv(%"class.__gnu_cxx::__normal_iterator"* %it)
  %4 = load i8* %call2
  %conv = sext i8 %4 to i32
  %5 = load i8* %delim.addr, align 1
  %conv3 = sext i8 %5 to i32
  %cmp = icmp eq i32 %conv, %conv3
  br i1 %cmp, label %if.then, label %lor.lhs.false

lor.lhs.false:                                    ; preds = %for.body
  %call4 = call i8* @_ZNK9__gnu_cxx17__normal_iteratorIPKcSsEdeEv(%"class.__gnu_cxx::__normal_iterator"* %it)
  %6 = load i8* %call4
  %conv5 = sext i8 %6 to i32
  %7 = load i8* %escape.addr, align 1
  %conv6 = sext i8 %7 to i32
  %cmp7 = icmp eq i32 %conv5, %conv6
  br i1 %cmp7, label %if.then, label %if.end

if.then:                                          ; preds = %lor.lhs.false, %for.body
  %8 = load %"class.std::basic_ostream"** %os.addr, align 4
  %9 = load i8* %escape.addr, align 1
  %call8 = call %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_c(%"class.std::basic_ostream"* %8, i8 signext %9)
  br label %if.end

if.end:                                           ; preds = %if.then, %lor.lhs.false
  %10 = load %"class.std::basic_ostream"** %os.addr, align 4
  %call9 = call i8* @_ZNK9__gnu_cxx17__normal_iteratorIPKcSsEdeEv(%"class.__gnu_cxx::__normal_iterator"* %it)
  %11 = load i8* %call9
  %call10 = call %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_c(%"class.std::basic_ostream"* %10, i8 signext %11)
  br label %for.inc

for.inc:                                          ; preds = %if.end
  %call11 = call %"class.__gnu_cxx::__normal_iterator"* @_ZN9__gnu_cxx17__normal_iteratorIPKcSsEppEv(%"class.__gnu_cxx::__normal_iterator"* %it)
  br label %for.cond

for.end:                                          ; preds = %for.cond
  %12 = load %"class.std::basic_ostream"** %os.addr, align 4
  %13 = load i8* %delim.addr, align 1
  %call12 = call %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_c(%"class.std::basic_ostream"* %12, i8 signext %13)
  %14 = load %"class.std::basic_ostream"** %os.addr, align 4
  ret %"class.std::basic_ostream"* %14
}

declare %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_c(%"class.std::basic_ostream"*, i8 signext)

declare void @_ZNKSs3endEv(%"class.__gnu_cxx::__normal_iterator"* sret, %"class.std::basic_string"*)

declare void @_ZNKSs5beginEv(%"class.__gnu_cxx::__normal_iterator"* sret, %"class.std::basic_string"*)

define linkonce_odr zeroext i1 @_ZN9__gnu_cxxneIPKcSsEEbRKNS_17__normal_iteratorIT_T0_EES8_(%"class.__gnu_cxx::__normal_iterator"* %__lhs, %"class.__gnu_cxx::__normal_iterator"* %__rhs) inlinehint {
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

define linkonce_odr i8** @_ZNK9__gnu_cxx17__normal_iteratorIPKcSsE4baseEv(%"class.__gnu_cxx::__normal_iterator"* %this) nounwind align 2 {
entry:
  %this.addr = alloca %"class.__gnu_cxx::__normal_iterator"*, align 4
  store %"class.__gnu_cxx::__normal_iterator"* %this, %"class.__gnu_cxx::__normal_iterator"** %this.addr, align 4
  %this1 = load %"class.__gnu_cxx::__normal_iterator"** %this.addr
  %_M_current = getelementptr inbounds %"class.__gnu_cxx::__normal_iterator"* %this1, i32 0, i32 0
  ret i8** %_M_current
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

declare i32 @llvm.eh.typeid.for(i8*) nounwind readnone

define linkonce_odr zeroext i1 @_ZN5boost10filesystem6existsENS0_11file_statusE(%"class.boost::filesystem::file_status"* byval align 4 %f) inlinehint {
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

declare void @_ZN5boost10filesystem6detail14symlink_statusERKNS0_4pathEPNS_6system10error_codeE(%"class.boost::filesystem::file_status"* sret, %"class.boost::filesystem::path"*, %"class.boost::system::error_code"*)

define linkonce_odr void @_ZN5boost6system15error_conditionC1Ev(%"class.boost::system::error_condition"* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::system::error_condition"*, align 4
  store %"class.boost::system::error_condition"* %this, %"class.boost::system::error_condition"** %this.addr, align 4
  %this1 = load %"class.boost::system::error_condition"** %this.addr
  call void @_ZN5boost6system15error_conditionC2Ev(%"class.boost::system::error_condition"* %this1)
  ret void
}

define linkonce_odr void ()* @_ZNK5boost6system10error_codecvPFvvEEv(%"class.boost::system::error_code"* %this) nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::system::error_code"*, align 4
  store %"class.boost::system::error_code"* %this, %"class.boost::system::error_code"** %this.addr, align 4
  %this1 = load %"class.boost::system::error_code"** %this.addr
  %m_val = getelementptr inbounds %"class.boost::system::error_code"* %this1, i32 0, i32 0
  %0 = load i32* %m_val, align 4
  %cmp = icmp eq i32 %0, 0
  %cond = select i1 %cmp, void ()* null, void ()* @_ZN5boost6system10error_code21unspecified_bool_trueEv
  ret void ()* %cond
}

define linkonce_odr void @_ZNK5boost6system10error_code23default_error_conditionEv(%"class.boost::system::error_condition"* noalias sret %agg.result, %"class.boost::system::error_code"* %this) align 2 {
entry:
  %this.addr = alloca %"class.boost::system::error_code"*, align 4
  store %"class.boost::system::error_code"* %this, %"class.boost::system::error_code"** %this.addr, align 4
  %this1 = load %"class.boost::system::error_code"** %this.addr
  %m_cat = getelementptr inbounds %"class.boost::system::error_code"* %this1, i32 0, i32 1
  %0 = load %"class.boost::system::error_category"** %m_cat, align 4
  %1 = bitcast %"class.boost::system::error_category"* %0 to void (%"class.boost::system::error_condition"*, %"class.boost::system::error_category"*, i32)***
  %vtable = load void (%"class.boost::system::error_condition"*, %"class.boost::system::error_category"*, i32)*** %1
  %vfn = getelementptr inbounds void (%"class.boost::system::error_condition"*, %"class.boost::system::error_category"*, i32)** %vtable, i64 4
  %2 = load void (%"class.boost::system::error_condition"*, %"class.boost::system::error_category"*, i32)** %vfn
  %call = call i32 @_ZNK5boost6system10error_code5valueEv(%"class.boost::system::error_code"* %this1)
  call void %2(%"class.boost::system::error_condition"* sret %agg.result, %"class.boost::system::error_category"* %0, i32 %call)
  ret void
}

declare %"class.std::basic_ostream"* @_ZStlsIcSt11char_traitsIcESaIcEERSt13basic_ostreamIT_T0_ES7_RKSbIS4_S5_T1_E(%"class.std::basic_ostream"*, %"class.std::basic_string"*)

declare %"class.std::basic_ostream"* @_ZNSolsEi(%"class.std::basic_ostream"*, i32)

define linkonce_odr i32 @_ZNK5boost6system15error_condition5valueEv(%"class.boost::system::error_condition"* %this) nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::system::error_condition"*, align 4
  store %"class.boost::system::error_condition"* %this, %"class.boost::system::error_condition"** %this.addr, align 4
  %this1 = load %"class.boost::system::error_condition"** %this.addr
  %m_val = getelementptr inbounds %"class.boost::system::error_condition"* %this1, i32 0, i32 0
  %0 = load i32* %m_val, align 4
  ret i32 %0
}

define linkonce_odr void @_ZNK5boost6system15error_condition7messageEv(%"class.std::basic_string"* noalias sret %agg.result, %"class.boost::system::error_condition"* %this) align 2 {
entry:
  %this.addr = alloca %"class.boost::system::error_condition"*, align 4
  store %"class.boost::system::error_condition"* %this, %"class.boost::system::error_condition"** %this.addr, align 4
  %this1 = load %"class.boost::system::error_condition"** %this.addr
  %m_cat = getelementptr inbounds %"class.boost::system::error_condition"* %this1, i32 0, i32 1
  %0 = load %"class.boost::system::error_category"** %m_cat, align 4
  %1 = bitcast %"class.boost::system::error_category"* %0 to void (%"class.std::basic_string"*, %"class.boost::system::error_category"*, i32)***
  %vtable = load void (%"class.std::basic_string"*, %"class.boost::system::error_category"*, i32)*** %1
  %vfn = getelementptr inbounds void (%"class.std::basic_string"*, %"class.boost::system::error_category"*, i32)** %vtable, i64 3
  %2 = load void (%"class.std::basic_string"*, %"class.boost::system::error_category"*, i32)** %vfn
  %call = call i32 @_ZNK5boost6system15error_condition5valueEv(%"class.boost::system::error_condition"* %this1)
  call void %2(%"class.std::basic_string"* sret %agg.result, %"class.boost::system::error_category"* %0, i32 %call)
  ret void
}

define internal i8* @_ZN12_GLOBAL__N_115file_type_c_strEN5boost10filesystem9file_typeE(i32 %t) nounwind {
entry:
  %t.addr = alloca i32, align 4
  store i32 %t, i32* %t.addr, align 4
  %0 = load i32* %t.addr, align 4
  %arrayidx = getelementptr inbounds [10 x i8*]* @_ZN12_GLOBAL__N_113file_type_tabE, i32 0, i32 %0
  %1 = load i8** %arrayidx, align 4
  ret i8* %1
}

define linkonce_odr zeroext i1 @_ZN5boost10filesystem12status_knownENS0_11file_statusE(%"class.boost::filesystem::file_status"* byval align 4 %f) inlinehint {
entry:
  %agg.tmp = alloca %"class.boost::filesystem::file_status", align 4
  %agg.tmp1 = alloca %"class.boost::filesystem::file_status", align 4
  %0 = bitcast %"class.boost::filesystem::file_status"* %agg.tmp to i8*
  %1 = bitcast %"class.boost::filesystem::file_status"* %f to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %0, i8* %1, i32 8, i32 4, i1 false)
  %call = call zeroext i1 @_ZN5boost10filesystem12type_presentENS0_11file_statusE(%"class.boost::filesystem::file_status"* byval align 4 %agg.tmp)
  br i1 %call, label %land.rhs, label %land.end

land.rhs:                                         ; preds = %entry
  %2 = bitcast %"class.boost::filesystem::file_status"* %agg.tmp1 to i8*
  %3 = bitcast %"class.boost::filesystem::file_status"* %f to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %2, i8* %3, i32 8, i32 4, i1 false)
  %call2 = call zeroext i1 @_ZN5boost10filesystem19permissions_presentENS0_11file_statusE(%"class.boost::filesystem::file_status"* byval align 4 %agg.tmp1)
  br label %land.end

land.end:                                         ; preds = %land.rhs, %entry
  %4 = phi i1 [ false, %entry ], [ %call2, %land.rhs ]
  ret i1 %4
}

define linkonce_odr zeroext i1 @_ZN5boost10filesystem15is_regular_fileENS0_11file_statusE(%"class.boost::filesystem::file_status"* byval align 4 %f) nounwind inlinehint {
entry:
  %call = call i32 @_ZNK5boost10filesystem11file_status4typeEv(%"class.boost::filesystem::file_status"* %f)
  %cmp = icmp eq i32 %call, 2
  ret i1 %cmp
}

define linkonce_odr zeroext i1 @_ZN5boost10filesystem12is_directoryENS0_11file_statusE(%"class.boost::filesystem::file_status"* byval align 4 %f) nounwind inlinehint {
entry:
  %call = call i32 @_ZNK5boost10filesystem11file_status4typeEv(%"class.boost::filesystem::file_status"* %f)
  %cmp = icmp eq i32 %call, 3
  ret i1 %cmp
}

define linkonce_odr zeroext i1 @_ZN5boost10filesystem8is_otherENS0_11file_statusE(%"class.boost::filesystem::file_status"* byval align 4 %f) inlinehint {
entry:
  %agg.tmp = alloca %"class.boost::filesystem::file_status", align 4
  %agg.tmp1 = alloca %"class.boost::filesystem::file_status", align 4
  %agg.tmp4 = alloca %"class.boost::filesystem::file_status", align 4
  %agg.tmp6 = alloca %"class.boost::filesystem::file_status", align 4
  %0 = bitcast %"class.boost::filesystem::file_status"* %agg.tmp to i8*
  %1 = bitcast %"class.boost::filesystem::file_status"* %f to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %0, i8* %1, i32 8, i32 4, i1 false)
  %call = call zeroext i1 @_ZN5boost10filesystem6existsENS0_11file_statusE(%"class.boost::filesystem::file_status"* byval align 4 %agg.tmp)
  br i1 %call, label %land.lhs.true, label %land.end

land.lhs.true:                                    ; preds = %entry
  %2 = bitcast %"class.boost::filesystem::file_status"* %agg.tmp1 to i8*
  %3 = bitcast %"class.boost::filesystem::file_status"* %f to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %2, i8* %3, i32 8, i32 4, i1 false)
  %call2 = call zeroext i1 @_ZN5boost10filesystem15is_regular_fileENS0_11file_statusE(%"class.boost::filesystem::file_status"* byval align 4 %agg.tmp1)
  br i1 %call2, label %land.end, label %land.lhs.true3

land.lhs.true3:                                   ; preds = %land.lhs.true
  %4 = bitcast %"class.boost::filesystem::file_status"* %agg.tmp4 to i8*
  %5 = bitcast %"class.boost::filesystem::file_status"* %f to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %4, i8* %5, i32 8, i32 4, i1 false)
  %call5 = call zeroext i1 @_ZN5boost10filesystem12is_directoryENS0_11file_statusE(%"class.boost::filesystem::file_status"* byval align 4 %agg.tmp4)
  br i1 %call5, label %land.end, label %land.rhs

land.rhs:                                         ; preds = %land.lhs.true3
  %6 = bitcast %"class.boost::filesystem::file_status"* %agg.tmp6 to i8*
  %7 = bitcast %"class.boost::filesystem::file_status"* %f to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %6, i8* %7, i32 8, i32 4, i1 false)
  %call7 = call zeroext i1 @_ZN5boost10filesystem10is_symlinkENS0_11file_statusE(%"class.boost::filesystem::file_status"* byval align 4 %agg.tmp6)
  %lnot = xor i1 %call7, true
  br label %land.end

land.end:                                         ; preds = %land.rhs, %land.lhs.true3, %land.lhs.true, %entry
  %8 = phi i1 [ false, %land.lhs.true3 ], [ false, %land.lhs.true ], [ false, %entry ], [ %lnot, %land.rhs ]
  ret i1 %8
}

define linkonce_odr zeroext i1 @_ZN5boost10filesystem10is_symlinkENS0_11file_statusE(%"class.boost::filesystem::file_status"* byval align 4 %f) nounwind inlinehint {
entry:
  %call = call i32 @_ZNK5boost10filesystem11file_status4typeEv(%"class.boost::filesystem::file_status"* %f)
  %cmp = icmp eq i32 %call, 4
  ret i1 %cmp
}

define linkonce_odr zeroext i1 @_ZN5boost10filesystem12type_presentENS0_11file_statusE(%"class.boost::filesystem::file_status"* byval align 4 %f) nounwind inlinehint {
entry:
  %call = call i32 @_ZNK5boost10filesystem11file_status4typeEv(%"class.boost::filesystem::file_status"* %f)
  %cmp = icmp ne i32 %call, 0
  ret i1 %cmp
}

define linkonce_odr zeroext i1 @_ZN5boost10filesystem19permissions_presentENS0_11file_statusE(%"class.boost::filesystem::file_status"* byval align 4 %f) inlinehint {
entry:
  %call = call i32 @_ZNK5boost10filesystem11file_status11permissionsEv(%"class.boost::filesystem::file_status"* %f)
  %cmp = icmp ne i32 %call, 65535
  ret i1 %cmp
}

define linkonce_odr i32 @_ZNK5boost10filesystem11file_status11permissionsEv(%"class.boost::filesystem::file_status"* %this) nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::filesystem::file_status"*, align 4
  store %"class.boost::filesystem::file_status"* %this, %"class.boost::filesystem::file_status"** %this.addr, align 4
  %this1 = load %"class.boost::filesystem::file_status"** %this.addr
  %m_perms = getelementptr inbounds %"class.boost::filesystem::file_status"* %this1, i32 0, i32 1
  %0 = load i32* %m_perms, align 4
  ret i32 %0
}

define linkonce_odr void @_ZN5boost6system10error_code21unspecified_bool_trueEv() nounwind align 2 {
entry:
  ret void
}

define linkonce_odr void @_ZN5boost6system15error_conditionC2Ev(%"class.boost::system::error_condition"* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::system::error_condition"*, align 4
  store %"class.boost::system::error_condition"* %this, %"class.boost::system::error_condition"** %this.addr, align 4
  %this1 = load %"class.boost::system::error_condition"** %this.addr
  %m_val = getelementptr inbounds %"class.boost::system::error_condition"* %this1, i32 0, i32 0
  store i32 0, i32* %m_val, align 4
  %m_cat = getelementptr inbounds %"class.boost::system::error_condition"* %this1, i32 0, i32 1
  %call = call %"class.boost::system::error_category"* @_ZN5boost6system16generic_categoryEv()
  store %"class.boost::system::error_category"* %call, %"class.boost::system::error_category"** %m_cat, align 4
  ret void
}

define linkonce_odr void @_ZN5boost6system10error_codeC2Ev(%"class.boost::system::error_code"* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::system::error_code"*, align 4
  store %"class.boost::system::error_code"* %this, %"class.boost::system::error_code"** %this.addr, align 4
  %this1 = load %"class.boost::system::error_code"** %this.addr
  %m_val = getelementptr inbounds %"class.boost::system::error_code"* %this1, i32 0, i32 0
  store i32 0, i32* %m_val, align 4
  %m_cat = getelementptr inbounds %"class.boost::system::error_code"* %this1, i32 0, i32 1
  %call = call %"class.boost::system::error_category"* @_ZN5boost6system15system_categoryEv()
  store %"class.boost::system::error_category"* %call, %"class.boost::system::error_category"** %m_cat, align 4
  ret void
}

declare %"class.std::basic_ostream"* @_ZNSolsEPFRSoS_E(%"class.std::basic_ostream"*, %"class.std::basic_ostream"* (%"class.std::basic_ostream"*)*)

declare %"class.std::basic_ostream"* @_ZSt4endlIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_(%"class.std::basic_ostream"*)

define linkonce_odr void @_ZN5boost10filesystem4pathD2Ev(%"class.boost::filesystem::path"* %this) unnamed_addr inlinehint align 2 {
entry:
  %this.addr = alloca %"class.boost::filesystem::path"*, align 4
  store %"class.boost::filesystem::path"* %this, %"class.boost::filesystem::path"** %this.addr, align 4
  %this1 = load %"class.boost::filesystem::path"** %this.addr
  %m_pathname = getelementptr inbounds %"class.boost::filesystem::path"* %this1, i32 0, i32 0
  call void @_ZNSsD1Ev(%"class.std::basic_string"* %m_pathname)
  ret void
}

define linkonce_odr void @_ZN5boost10filesystem4pathC2Ev(%"class.boost::filesystem::path"* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::filesystem::path"*, align 4
  store %"class.boost::filesystem::path"* %this, %"class.boost::filesystem::path"** %this.addr, align 4
  %this1 = load %"class.boost::filesystem::path"** %this.addr
  %m_pathname = getelementptr inbounds %"class.boost::filesystem::path"* %this1, i32 0, i32 0
  call void @_ZNSsC1Ev(%"class.std::basic_string"* %m_pathname)
  ret void
}

declare void @_ZNSsC1Ev(%"class.std::basic_string"*)

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
  call void @__cxx_global_var_init4()
  ret void
}
