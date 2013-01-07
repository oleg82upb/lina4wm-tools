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
%"class.std::allocator" = type { i8 }
%"struct.std::basic_string<char, std::char_traits<char>, std::allocator<char> >::_Rep" = type { %"struct.std::basic_string<char, std::char_traits<char>, std::allocator<char> >::_Rep_base" }
%"struct.std::basic_string<char, std::char_traits<char>, std::allocator<char> >::_Rep_base" = type { i32, i32, i32 }
%"class.boost::filesystem::file_status" = type { i32, i32 }
%"class.boost::system::error_code" = type { i32, %"class.boost::system::error_category"* }
%"class.std::codecvt" = type { %"class.std::__codecvt_abstract_base", %struct.__locale_struct* }
%"class.std::__codecvt_abstract_base" = type { %"class.std::locale::facet" }
%"class.boost::filesystem::filesystem_error" = type { %"class.boost::system::system_error", %"class.boost::shared_ptr" }
%"class.boost::system::system_error" = type { %"class.std::runtime_error", %"class.boost::system::error_code", %"class.std::basic_string" }
%"class.std::runtime_error" = type { %"class.std::exception", %"class.std::basic_string" }
%"class.std::exception" = type { i32 (...)** }
%"class.boost::shared_ptr" = type { %"struct.boost::filesystem::filesystem_error::m_imp"*, %"class.boost::detail::shared_count" }
%"struct.boost::filesystem::filesystem_error::m_imp" = type { %"class.boost::filesystem::path", %"class.boost::filesystem::path", %"class.std::basic_string" }
%"class.boost::detail::shared_count" = type { %"class.boost::detail::sp_counted_base"* }
%"class.boost::detail::sp_counted_base" = type { i32 (...)**, i32, i32 }
%"class.boost::system::error_condition" = type { i32, %"class.boost::system::error_category"* }

@_ZStL8__ioinit = internal global %"class.std::ios_base::Init" zeroinitializer, align 1
@__dso_handle = external unnamed_addr global i8
@_ZN5boost6systemL14posix_categoryE = internal unnamed_addr global %"class.boost::system::error_category"* null, align 4
@_ZN5boost6systemL10errno_ecatE = internal unnamed_addr global %"class.boost::system::error_category"* null, align 4
@_ZN5boost6systemL11native_ecatE = internal unnamed_addr global %"class.boost::system::error_category"* null, align 4
@_ZN12_GLOBAL__N_11pE = internal global %"class.boost::filesystem::path" zeroinitializer, align 4
@_ZSt4cout = external global %"class.std::basic_ostream"
@.str5 = private unnamed_addr constant [27 x i8] c"Usage: file_status <path>\0A\00", align 1
@.str6 = private unnamed_addr constant [25 x i8] c"\0Afile_status s = status(\00", align 1
@.str7 = private unnamed_addr constant [7 x i8] c", ec) \00", align 1
@.str8 = private unnamed_addr constant [33 x i8] c"\0Afile_status s = symlink_status(\00", align 1
@_ZTVN10__cxxabiv120__si_class_type_infoE = external global i8*
@_ZTVN10__cxxabiv117__class_type_infoE = external global i8*
@_ZTSN5boost6system12system_errorE = linkonce_odr constant [30 x i8] c"N5boost6system12system_errorE\00"
@_ZTSSt13runtime_error = available_externally constant [18 x i8] c"St13runtime_error\00"
@_ZTSSt9exception = available_externally constant [13 x i8] c"St9exception\00"
@_ZTISt9exception = available_externally unnamed_addr constant { i8*, i8* } { i8* bitcast (i8** getelementptr inbounds (i8** @_ZTVN10__cxxabiv117__class_type_infoE, i32 2) to i8*), i8* getelementptr inbounds ([13 x i8]* @_ZTSSt9exception, i32 0, i32 0) }
@_ZTISt13runtime_error = available_externally unnamed_addr constant { i8*, i8*, i8* } { i8* bitcast (i8** getelementptr inbounds (i8** @_ZTVN10__cxxabiv120__si_class_type_infoE, i32 2) to i8*), i8* getelementptr inbounds ([18 x i8]* @_ZTSSt13runtime_error, i32 0, i32 0), i8* bitcast ({ i8*, i8* }* @_ZTISt9exception to i8*) }
@_ZTIN5boost6system12system_errorE = linkonce_odr unnamed_addr constant { i8*, i8*, i8* } { i8* bitcast (i8** getelementptr inbounds (i8** @_ZTVN10__cxxabiv120__si_class_type_infoE, i32 2) to i8*), i8* getelementptr inbounds ([30 x i8]* @_ZTSN5boost6system12system_errorE, i32 0, i32 0), i8* bitcast ({ i8*, i8*, i8* }* @_ZTISt13runtime_error to i8*) }
@.str9 = private unnamed_addr constant [6 x i8] c"c_str\00", align 1
@.str10 = private unnamed_addr constant [59 x i8] c"/home/thomas/boost_1_52_0/boost/filesystem/path_traits.hpp\00", align 1
@__PRETTY_FUNCTION__._ZN5boost10filesystem11path_traits8dispatchIcSsEEvRKPT_RT0_RKSt7codecvtIwc11__mbstate_tE = private unnamed_addr constant [125 x i8] c"void boost::filesystem::path_traits::dispatch(T *const &, U &, const codecvt_type &) [T = char, U = std::basic_string<char>]\00", align 1
@_ZNSs4_Rep20_S_empty_rep_storageE = external global [0 x i32]
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
@_ZN12_GLOBAL__N_113file_type_tabE = internal unnamed_addr constant [10 x i8*] [i8* getelementptr inbounds ([13 x i8]* @.str34, i32 0, i32 0), i8* getelementptr inbounds ([15 x i8]* @.str35, i32 0, i32 0), i8* getelementptr inbounds ([13 x i8]* @.str36, i32 0, i32 0), i8* getelementptr inbounds ([15 x i8]* @.str37, i32 0, i32 0), i8* getelementptr inbounds ([13 x i8]* @.str38, i32 0, i32 0), i8* getelementptr inbounds ([11 x i8]* @.str39, i32 0, i32 0), i8* getelementptr inbounds ([15 x i8]* @.str40, i32 0, i32 0), i8* getelementptr inbounds ([10 x i8]* @.str41, i32 0, i32 0), i8* getelementptr inbounds ([12 x i8]* @.str42, i32 0, i32 0), i8* getelementptr inbounds ([13 x i8]* @.str43, i32 0, i32 0)], align 4
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

declare void @_ZNSt8ios_base4InitC1Ev(%"class.std::ios_base::Init"*)

declare void @_ZNSt8ios_base4InitD1Ev(%"class.std::ios_base::Init"*)

declare i32 @__cxa_atexit(void (i8*)*, i8*, i8*) nounwind

declare %"class.boost::system::error_category"* @_ZN5boost6system16generic_categoryEv()

declare %"class.boost::system::error_category"* @_ZN5boost6system15system_categoryEv()

declare i32 @__gxx_personality_v0(...)

declare void @_ZSt9terminatev()

declare i8* @__cxa_begin_catch(i8*)

declare void @__cxa_end_catch()

define linkonce_odr void @_ZN5boost10filesystem4pathD1Ev(%"class.boost::filesystem::path"* nocapture %this) unnamed_addr inlinehint align 2 {
entry:
  %ref.tmp.i.i.i = alloca %"class.std::allocator", align 1
  %0 = getelementptr inbounds %"class.std::allocator"* %ref.tmp.i.i.i, i32 0, i32 0
  call void @llvm.lifetime.start(i64 1, i8* %0)
  %_M_p.i.i.i.i.i = getelementptr inbounds %"class.boost::filesystem::path"* %this, i32 0, i32 0, i32 0, i32 0
  %1 = load i8** %_M_p.i.i.i.i.i, align 4, !tbaa !0
  %arrayidx.i.i.i.i = getelementptr inbounds i8* %1, i32 -12
  %2 = bitcast i8* %arrayidx.i.i.i.i to %"struct.std::basic_string<char, std::char_traits<char>, std::allocator<char> >::_Rep"*
  %cmp.i.i.i.i = icmp eq i8* %arrayidx.i.i.i.i, bitcast ([0 x i32]* @_ZNSs4_Rep20_S_empty_rep_storageE to i8*)
  br i1 %cmp.i.i.i.i, label %_ZN5boost10filesystem4pathD2Ev.exit, label %if.then.i.i.i.i, !prof !3

if.then.i.i.i.i:                                  ; preds = %entry
  %_M_refcount.i.i.i.i = getelementptr inbounds i8* %1, i32 -4
  %3 = bitcast i8* %_M_refcount.i.i.i.i to i32*
  br i1 icmp ne (i8* bitcast (i32 (i32)* @pthread_cancel to i8*), i8* null), label %if.then.i.i.i.i.i, label %if.else.i.i.i.i.i

if.then.i.i.i.i.i:                                ; preds = %if.then.i.i.i.i
  %4 = atomicrmw add i32* %3, i32 -1 seq_cst
  br label %_ZN9__gnu_cxxL27__exchange_and_add_dispatchEPii.exit.i.i.i.i

if.else.i.i.i.i.i:                                ; preds = %if.then.i.i.i.i
  %5 = load i32* %3, align 4, !tbaa !4
  %add.i.i.i.i.i.i = add nsw i32 %5, -1
  store i32 %add.i.i.i.i.i.i, i32* %3, align 4, !tbaa !4
  br label %_ZN9__gnu_cxxL27__exchange_and_add_dispatchEPii.exit.i.i.i.i

_ZN9__gnu_cxxL27__exchange_and_add_dispatchEPii.exit.i.i.i.i: ; preds = %if.else.i.i.i.i.i, %if.then.i.i.i.i.i
  %retval.0.i.i.i.i.i = phi i32 [ %4, %if.then.i.i.i.i.i ], [ %5, %if.else.i.i.i.i.i ]
  %cmp3.i.i.i.i = icmp slt i32 %retval.0.i.i.i.i.i, 1
  br i1 %cmp3.i.i.i.i, label %if.then4.i.i.i.i, label %_ZN5boost10filesystem4pathD2Ev.exit

if.then4.i.i.i.i:                                 ; preds = %_ZN9__gnu_cxxL27__exchange_and_add_dispatchEPii.exit.i.i.i.i
  call void @_ZNSs4_Rep10_M_destroyERKSaIcE(%"struct.std::basic_string<char, std::char_traits<char>, std::allocator<char> >::_Rep"* %2, %"class.std::allocator"* %ref.tmp.i.i.i) nounwind
  br label %_ZN5boost10filesystem4pathD2Ev.exit

_ZN5boost10filesystem4pathD2Ev.exit:              ; preds = %entry, %_ZN9__gnu_cxxL27__exchange_and_add_dispatchEPii.exit.i.i.i.i, %if.then4.i.i.i.i
  call void @llvm.lifetime.end(i64 1, i8* %0)
  ret void
}

define i32 @_Z8cpp_mainiPPc(i32 %argc, i8** nocapture %argv) {
entry:
  %agg.tmp.i.i = alloca %"class.boost::filesystem::file_status", align 4
  %__c.addr.i13.i = alloca i8, align 1
  %__c.addr.i.i = alloca i8, align 1
  %ec = alloca %"class.boost::system::error_code", align 8
  %s = alloca %"class.boost::filesystem::file_status", align 8
  %ref.tmp = alloca %"class.boost::filesystem::file_status", align 8
  %call1.i.i = call %"class.std::basic_ostream"* @_ZSt16__ostream_insertIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_PKS3_i(%"class.std::basic_ostream"* @_ZSt4cout, i8* getelementptr inbounds ([7 x i8]* @.str44, i32 0, i32 0), i32 6)
  %call1.i = call %"class.std::basic_ostream"* @_ZNSolsEi(%"class.std::basic_ostream"* @_ZSt4cout, i32 1)
  call void @llvm.lifetime.start(i64 1, i8* %__c.addr.i.i)
  store i8 46, i8* %__c.addr.i.i, align 1, !tbaa !1
  %call.i.i = call %"class.std::basic_ostream"* @_ZSt16__ostream_insertIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_PKS3_i(%"class.std::basic_ostream"* %call1.i, i8* %__c.addr.i.i, i32 1)
  call void @llvm.lifetime.end(i64 1, i8* %__c.addr.i.i)
  %call3.i = call %"class.std::basic_ostream"* @_ZNSolsEi(%"class.std::basic_ostream"* %call.i.i, i32 52)
  call void @llvm.lifetime.start(i64 1, i8* %__c.addr.i13.i)
  store i8 46, i8* %__c.addr.i13.i, align 1, !tbaa !1
  %call.i14.i = call %"class.std::basic_ostream"* @_ZSt16__ostream_insertIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_PKS3_i(%"class.std::basic_ostream"* %call3.i, i8* %__c.addr.i13.i, i32 1)
  call void @llvm.lifetime.end(i64 1, i8* %__c.addr.i13.i)
  %call5.i = call %"class.std::basic_ostream"* @_ZNSolsEi(%"class.std::basic_ostream"* %call.i14.i, i32 0)
  %call1.i16.i = call %"class.std::basic_ostream"* @_ZSt16__ostream_insertIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_PKS3_i(%"class.std::basic_ostream"* %call5.i, i8* getelementptr inbounds ([3 x i8]* @.str45, i32 0, i32 0), i32 2)
  %call1.i18.i = call %"class.std::basic_ostream"* @_ZSt16__ostream_insertIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_PKS3_i(%"class.std::basic_ostream"* %call5.i, i8* getelementptr inbounds ([33 x i8]* @.str46, i32 0, i32 0), i32 32)
  %call1.i20.i = call %"class.std::basic_ostream"* @_ZSt16__ostream_insertIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_PKS3_i(%"class.std::basic_ostream"* %call5.i, i8* getelementptr inbounds ([3 x i8]* @.str45, i32 0, i32 0), i32 2)
  %call1.i22.i = call %"class.std::basic_ostream"* @_ZSt16__ostream_insertIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_PKS3_i(%"class.std::basic_ostream"* %call5.i, i8* getelementptr inbounds ([31 x i8]* @.str47, i32 0, i32 0), i32 30)
  %call1.i24.i = call %"class.std::basic_ostream"* @_ZSt16__ostream_insertIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_PKS3_i(%"class.std::basic_ostream"* %call5.i, i8* getelementptr inbounds ([3 x i8]* @.str45, i32 0, i32 0), i32 2)
  %call1.i26.i = call %"class.std::basic_ostream"* @_ZSt16__ostream_insertIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_PKS3_i(%"class.std::basic_ostream"* %call5.i, i8* getelementptr inbounds ([6 x i8]* @.str48, i32 0, i32 0), i32 5)
  %0 = bitcast %"class.std::basic_ostream"* %call5.i to i8**
  %vtable.i.i = load i8** %0, align 4, !tbaa !5
  %vbase.offset.ptr.i.i = getelementptr i8* %vtable.i.i, i32 -12
  %1 = bitcast i8* %vbase.offset.ptr.i.i to i32*
  %vbase.offset.i.i = load i32* %1, align 4
  %2 = bitcast %"class.std::basic_ostream"* %call5.i to i8*
  %add.ptr.i.sum.i = add i32 %vbase.offset.i.i, 124
  %_M_ctype.i.i = getelementptr inbounds i8* %2, i32 %add.ptr.i.sum.i
  %3 = bitcast i8* %_M_ctype.i.i to %"class.std::ctype"**
  %4 = load %"class.std::ctype"** %3, align 4, !tbaa !0
  %tobool.i34.i = icmp eq %"class.std::ctype"* %4, null
  br i1 %tobool.i34.i, label %if.then.i35.i, label %_ZSt13__check_facetISt5ctypeIcEERKT_PS3_.exit.i

if.then.i35.i:                                    ; preds = %entry
  call void @_ZSt16__throw_bad_castv() noreturn
  unreachable

_ZSt13__check_facetISt5ctypeIcEERKT_PS3_.exit.i:  ; preds = %entry
  %_M_widen_ok.i.i = getelementptr inbounds %"class.std::ctype"* %4, i32 0, i32 6
  %5 = load i8* %_M_widen_ok.i.i, align 1, !tbaa !1
  %tobool.i.i = icmp eq i8 %5, 0
  br i1 %tobool.i.i, label %if.end.i.i, label %if.then.i.i

if.then.i.i:                                      ; preds = %_ZSt13__check_facetISt5ctypeIcEERKT_PS3_.exit.i
  %arrayidx.i.i = getelementptr inbounds %"class.std::ctype"* %4, i32 0, i32 7, i32 10
  %6 = load i8* %arrayidx.i.i, align 1, !tbaa !1
  br label %_ZN12_GLOBAL__N_118print_boost_macrosEv.exit

if.end.i.i:                                       ; preds = %_ZSt13__check_facetISt5ctypeIcEERKT_PS3_.exit.i
  call void @_ZNKSt5ctypeIcE13_M_widen_initEv(%"class.std::ctype"* %4)
  %7 = bitcast %"class.std::ctype"* %4 to i8 (%"class.std::ctype"*, i8)***
  %vtable.i32.i = load i8 (%"class.std::ctype"*, i8)*** %7, align 4, !tbaa !5
  %vfn.i.i = getelementptr inbounds i8 (%"class.std::ctype"*, i8)** %vtable.i32.i, i32 6
  %8 = load i8 (%"class.std::ctype"*, i8)** %vfn.i.i, align 4
  %call.i33.i = call signext i8 %8(%"class.std::ctype"* %4, i8 signext 10)
  br label %_ZN12_GLOBAL__N_118print_boost_macrosEv.exit

_ZN12_GLOBAL__N_118print_boost_macrosEv.exit:     ; preds = %if.then.i.i, %if.end.i.i
  %retval.0.i.i = phi i8 [ %6, %if.then.i.i ], [ %call.i33.i, %if.end.i.i ]
  %call1.i29.i = call %"class.std::basic_ostream"* @_ZNSo3putEc(%"class.std::basic_ostream"* %call5.i, i8 signext %retval.0.i.i)
  %call.i30.i = call %"class.std::basic_ostream"* @_ZNSo5flushEv(%"class.std::basic_ostream"* %call1.i29.i)
  %cmp = icmp slt i32 %argc, 2
  br i1 %cmp, label %if.then, label %if.else

if.then:                                          ; preds = %_ZN12_GLOBAL__N_118print_boost_macrosEv.exit
  %call1.i15 = call %"class.std::basic_ostream"* @_ZSt16__ostream_insertIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_PKS3_i(%"class.std::basic_ostream"* @_ZSt4cout, i8* getelementptr inbounds ([27 x i8]* @.str5, i32 0, i32 0), i32 26)
  %9 = load i8** getelementptr inbounds (%"class.boost::filesystem::path"* @_ZN12_GLOBAL__N_11pE, i32 0, i32 0, i32 0, i32 0), align 4, !tbaa !0
  %arrayidx.i.i.i.i = getelementptr inbounds i8* %9, i32 -12
  %_M_length.i.i.i = bitcast i8* %arrayidx.i.i.i.i to i32*
  %10 = load i32* %_M_length.i.i.i, align 4, !tbaa !4
  call void @_ZNSs9_M_mutateEjjj(%"class.std::basic_string"* getelementptr inbounds (%"class.boost::filesystem::path"* @_ZN12_GLOBAL__N_11pE, i32 0, i32 0), i32 0, i32 %10, i32 0)
  %call.i = call %"class.std::codecvt"* @_ZN5boost10filesystem4path7codecvtEv()
  %11 = load i8** %argv, align 4, !tbaa !0
  %tobool.i.i16 = icmp eq i8* %11, null
  br i1 %tobool.i.i16, label %cond.false.i.i, label %_ZN5boost10filesystem4pathaSIPcEENS_9enable_ifINS0_11path_traits11is_pathableINS_5decayIT_E4typeEEERS1_E4typeERKS8_.exit

cond.false.i.i:                                   ; preds = %if.then
  call void @__assert_fail(i8* getelementptr inbounds ([6 x i8]* @.str9, i32 0, i32 0), i8* getelementptr inbounds ([59 x i8]* @.str10, i32 0, i32 0), i32 214, i8* getelementptr inbounds ([125 x i8]* @__PRETTY_FUNCTION__._ZN5boost10filesystem11path_traits8dispatchIcSsEEvRKPT_RT0_RKSt7codecvtIwc11__mbstate_tE, i32 0, i32 0)) noreturn nounwind
  unreachable

_ZN5boost10filesystem4pathaSIPcEENS_9enable_ifINS0_11path_traits11is_pathableINS_5decayIT_E4typeEEERS1_E4typeERKS8_.exit: ; preds = %if.then
  %call.i.i.i.i.i.i = call i32 @strlen(i8* %11) nounwind
  %call2.i.i.i.i.i = call %"class.std::basic_string"* @_ZNSs6appendEPKcj(%"class.std::basic_string"* getelementptr inbounds (%"class.boost::filesystem::path"* @_ZN12_GLOBAL__N_11pE, i32 0, i32 0), i8* %11, i32 %call.i.i.i.i.i.i)
  br label %if.end

if.else:                                          ; preds = %_ZN12_GLOBAL__N_118print_boost_macrosEv.exit
  %arrayidx2 = getelementptr inbounds i8** %argv, i32 1
  %12 = load i8** getelementptr inbounds (%"class.boost::filesystem::path"* @_ZN12_GLOBAL__N_11pE, i32 0, i32 0, i32 0, i32 0), align 4, !tbaa !0
  %arrayidx.i.i.i.i17 = getelementptr inbounds i8* %12, i32 -12
  %_M_length.i.i.i18 = bitcast i8* %arrayidx.i.i.i.i17 to i32*
  %13 = load i32* %_M_length.i.i.i18, align 4, !tbaa !4
  call void @_ZNSs9_M_mutateEjjj(%"class.std::basic_string"* getelementptr inbounds (%"class.boost::filesystem::path"* @_ZN12_GLOBAL__N_11pE, i32 0, i32 0), i32 0, i32 %13, i32 0)
  %call.i19 = call %"class.std::codecvt"* @_ZN5boost10filesystem4path7codecvtEv()
  %14 = load i8** %arrayidx2, align 4, !tbaa !0
  %tobool.i.i20 = icmp eq i8* %14, null
  br i1 %tobool.i.i20, label %cond.false.i.i21, label %_ZN5boost10filesystem4pathaSIPcEENS_9enable_ifINS0_11path_traits11is_pathableINS_5decayIT_E4typeEEERS1_E4typeERKS8_.exit24

cond.false.i.i21:                                 ; preds = %if.else
  call void @__assert_fail(i8* getelementptr inbounds ([6 x i8]* @.str9, i32 0, i32 0), i8* getelementptr inbounds ([59 x i8]* @.str10, i32 0, i32 0), i32 214, i8* getelementptr inbounds ([125 x i8]* @__PRETTY_FUNCTION__._ZN5boost10filesystem11path_traits8dispatchIcSsEEvRKPT_RT0_RKSt7codecvtIwc11__mbstate_tE, i32 0, i32 0)) noreturn nounwind
  unreachable

_ZN5boost10filesystem4pathaSIPcEENS_9enable_ifINS0_11path_traits11is_pathableINS_5decayIT_E4typeEEERS1_E4typeERKS8_.exit24: ; preds = %if.else
  %call.i.i.i.i.i.i22 = call i32 @strlen(i8* %14) nounwind
  %call2.i.i.i.i.i23 = call %"class.std::basic_string"* @_ZNSs6appendEPKcj(%"class.std::basic_string"* getelementptr inbounds (%"class.boost::filesystem::path"* @_ZN12_GLOBAL__N_11pE, i32 0, i32 0), i8* %14, i32 %call.i.i.i.i.i.i22)
  br label %if.end

if.end:                                           ; preds = %_ZN5boost10filesystem4pathaSIPcEENS_9enable_ifINS0_11path_traits11is_pathableINS_5decayIT_E4typeEEERS1_E4typeERKS8_.exit24, %_ZN5boost10filesystem4pathaSIPcEENS_9enable_ifINS0_11path_traits11is_pathableINS_5decayIT_E4typeEEERS1_E4typeERKS8_.exit
  %m_val.i.i = getelementptr inbounds %"class.boost::system::error_code"* %ec, i32 0, i32 0
  store i32 0, i32* %m_val.i.i, align 8, !tbaa !4
  %m_cat.i.i = getelementptr inbounds %"class.boost::system::error_code"* %ec, i32 0, i32 1
  %call.i.i25 = call %"class.boost::system::error_category"* @_ZN5boost6system15system_categoryEv()
  store %"class.boost::system::error_category"* %call.i.i25, %"class.boost::system::error_category"** %m_cat.i.i, align 4, !tbaa !0
  call void @_ZN5boost10filesystem6detail6statusERKNS0_4pathEPNS_6system10error_codeE(%"class.boost::filesystem::file_status"* sret %s, %"class.boost::filesystem::path"* @_ZN12_GLOBAL__N_11pE, %"class.boost::system::error_code"* %ec)
  %call1.i27 = call %"class.std::basic_ostream"* @_ZSt16__ostream_insertIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_PKS3_i(%"class.std::basic_ostream"* @_ZSt4cout, i8* getelementptr inbounds ([25 x i8]* @.str6, i32 0, i32 0), i32 24)
  %call5 = call %"class.std::basic_ostream"* @_ZN5boost10filesystemlsIcSt11char_traitsIcEEERSt13basic_ostreamIT_T0_ES8_RKNS0_4pathE(%"class.std::basic_ostream"* @_ZSt4cout, %"class.boost::filesystem::path"* @_ZN12_GLOBAL__N_11pE)
  %call1.i29 = call %"class.std::basic_ostream"* @_ZSt16__ostream_insertIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_PKS3_i(%"class.std::basic_ostream"* %call5, i8* getelementptr inbounds ([7 x i8]* @.str7, i32 0, i32 0), i32 6)
  %15 = bitcast %"class.boost::filesystem::file_status"* %s to i64*
  %16 = load i64* %15, align 8
  %agg.tmp.sroa.0.0.extract.trunc = trunc i64 %16 to i32
  %agg.tmp.sroa.1.4.extract.shift = lshr i64 %16, 32
  %agg.tmp.sroa.1.4.extract.trunc = trunc i64 %agg.tmp.sroa.1.4.extract.shift to i32
  %17 = bitcast %"class.boost::system::error_code"* %ec to i64*
  %18 = load i64* %17, align 8
  %agg.tmp7.sroa.0.0.extract.trunc = trunc i64 %18 to i32
  %agg.tmp7.sroa.1.4.extract.shift = lshr i64 %18, 32
  %agg.tmp7.sroa.1.4.extract.trunc = trunc i64 %agg.tmp7.sroa.1.4.extract.shift to i32
  %19 = inttoptr i32 %agg.tmp7.sroa.1.4.extract.trunc to %"class.boost::system::error_category"*
  call fastcc void @_ZN12_GLOBAL__N_111show_statusEN5boost10filesystem11file_statusENS0_6system10error_codeE(i32 %agg.tmp.sroa.0.0.extract.trunc, i32 %agg.tmp.sroa.1.4.extract.trunc, i32 %agg.tmp7.sroa.0.0.extract.trunc, %"class.boost::system::error_category"* %19)
  call void @_ZN5boost10filesystem6detail14symlink_statusERKNS0_4pathEPNS_6system10error_codeE(%"class.boost::filesystem::file_status"* sret %ref.tmp, %"class.boost::filesystem::path"* @_ZN12_GLOBAL__N_11pE, %"class.boost::system::error_code"* %ec)
  %20 = bitcast %"class.boost::filesystem::file_status"* %ref.tmp to i64*
  %21 = load i64* %20, align 8
  store i64 %21, i64* %15, align 8
  %call1.i31 = call %"class.std::basic_ostream"* @_ZSt16__ostream_insertIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_PKS3_i(%"class.std::basic_ostream"* @_ZSt4cout, i8* getelementptr inbounds ([33 x i8]* @.str8, i32 0, i32 0), i32 32)
  %call9 = call %"class.std::basic_ostream"* @_ZN5boost10filesystemlsIcSt11char_traitsIcEEERSt13basic_ostreamIT_T0_ES8_RKNS0_4pathE(%"class.std::basic_ostream"* @_ZSt4cout, %"class.boost::filesystem::path"* @_ZN12_GLOBAL__N_11pE)
  %call1.i33 = call %"class.std::basic_ostream"* @_ZSt16__ostream_insertIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_PKS3_i(%"class.std::basic_ostream"* %call9, i8* getelementptr inbounds ([7 x i8]* @.str7, i32 0, i32 0), i32 6)
  %22 = load i64* %15, align 8
  %agg.tmp11.sroa.0.0.extract.trunc = trunc i64 %22 to i32
  %agg.tmp11.sroa.1.4.extract.shift = lshr i64 %22, 32
  %agg.tmp11.sroa.1.4.extract.trunc = trunc i64 %agg.tmp11.sroa.1.4.extract.shift to i32
  %23 = load i64* %17, align 8
  %agg.tmp12.sroa.0.0.extract.trunc = trunc i64 %23 to i32
  %agg.tmp12.sroa.1.4.extract.shift = lshr i64 %23, 32
  %agg.tmp12.sroa.1.4.extract.trunc = trunc i64 %agg.tmp12.sroa.1.4.extract.shift to i32
  %24 = inttoptr i32 %agg.tmp12.sroa.1.4.extract.trunc to %"class.boost::system::error_category"*
  call fastcc void @_ZN12_GLOBAL__N_111show_statusEN5boost10filesystem11file_statusENS0_6system10error_codeE(i32 %agg.tmp11.sroa.0.0.extract.trunc, i32 %agg.tmp11.sroa.1.4.extract.trunc, i32 %agg.tmp12.sroa.0.0.extract.trunc, %"class.boost::system::error_category"* %24)
  %call1.i.i34 = call %"class.std::basic_ostream"* @_ZSt16__ostream_insertIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_PKS3_i(%"class.std::basic_ostream"* @_ZSt4cout, i8* getelementptr inbounds ([9 x i8]* @.str12, i32 0, i32 0), i32 8)
  %call1.i35 = call %"class.std::basic_ostream"* @_ZN5boost10filesystemlsIcSt11char_traitsIcEEERSt13basic_ostreamIT_T0_ES8_RKNS0_4pathE(%"class.std::basic_ostream"* @_ZSt4cout, %"class.boost::filesystem::path"* @_ZN12_GLOBAL__N_11pE)
  %call1.i25.i = call %"class.std::basic_ostream"* @_ZSt16__ostream_insertIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_PKS3_i(%"class.std::basic_ostream"* %call1.i35, i8* getelementptr inbounds ([3 x i8]* @.str13, i32 0, i32 0), i32 2)
  %25 = bitcast %"class.boost::filesystem::file_status"* %agg.tmp.i.i to i8*
  call void @llvm.lifetime.start(i64 8, i8* %25)
  invoke void @_ZN5boost10filesystem6detail6statusERKNS0_4pathEPNS_6system10error_codeE(%"class.boost::filesystem::file_status"* sret %agg.tmp.i.i, %"class.boost::filesystem::path"* @_ZN12_GLOBAL__N_11pE, %"class.boost::system::error_code"* null)
          to label %invoke.cont.i unwind label %lpad.i

invoke.cont.i:                                    ; preds = %if.end
  %m_value.i.i.i.i = getelementptr inbounds %"class.boost::filesystem::file_status"* %agg.tmp.i.i, i32 0, i32 0
  %26 = load i32* %m_value.i.i.i.i, align 4, !tbaa !6
  call void @llvm.lifetime.end(i64 8, i8* %25)
  %call1.i2728.i = invoke %"class.std::basic_ostream"* @_ZSt16__ostream_insertIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_PKS3_i(%"class.std::basic_ostream"* @_ZSt4cout, i8* getelementptr inbounds ([4 x i8]* @.str14, i32 0, i32 0), i32 3)
          to label %invoke.cont4.i unwind label %lpad.i

invoke.cont4.i:                                   ; preds = %invoke.cont.i
  %27 = icmp ugt i32 %26, 1
  %cond.i = select i1 %27, i8* getelementptr inbounds ([5 x i8]* @.str15, i32 0, i32 0), i8* getelementptr inbounds ([6 x i8]* @.str16, i32 0, i32 0)
  %call.i.i29.i = call i32 @strlen(i8* %cond.i) nounwind
  %call1.i3031.i = invoke %"class.std::basic_ostream"* @_ZSt16__ostream_insertIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_PKS3_i(%"class.std::basic_ostream"* @_ZSt4cout, i8* %cond.i, i32 %call.i.i29.i)
          to label %invoke.cont6.i unwind label %lpad.i

invoke.cont6.i:                                   ; preds = %invoke.cont4.i
  %call1.i3435.i = invoke %"class.std::basic_ostream"* @_ZSt16__ostream_insertIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_PKS3_i(%"class.std::basic_ostream"* @_ZSt4cout, i8* getelementptr inbounds ([2 x i8]* @.str17, i32 0, i32 0), i32 1)
          to label %_ZN12_GLOBAL__N_110try_existsEv.exit unwind label %lpad.i

lpad.i:                                           ; preds = %invoke.cont6.i, %invoke.cont4.i, %invoke.cont.i, %if.end
  %28 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          catch i8* bitcast ({ i8*, i8*, i8* }* @_ZTIN5boost10filesystem16filesystem_errorE to i8*)
  %29 = extractvalue { i8*, i32 } %28, 0
  %30 = extractvalue { i8*, i32 } %28, 1
  %31 = call i32 @llvm.eh.typeid.for(i8* bitcast ({ i8*, i8*, i8* }* @_ZTIN5boost10filesystem16filesystem_errorE to i8*)) nounwind
  %matches.i = icmp eq i32 %30, %31
  br i1 %matches.i, label %catch.i, label %eh.resume.i

catch.i:                                          ; preds = %lpad.i
  %32 = call i8* @__cxa_begin_catch(i8* %29) nounwind
  %call1.i3839.i = invoke %"class.std::basic_ostream"* @_ZSt16__ostream_insertIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_PKS3_i(%"class.std::basic_ostream"* @_ZSt4cout, i8* getelementptr inbounds ([38 x i8]* @.str18, i32 0, i32 0), i32 37)
          to label %invoke.cont11.i unwind label %lpad10.i

invoke.cont11.i:                                  ; preds = %catch.i
  %exn.byref.i = bitcast i8* %32 to %"class.boost::filesystem::filesystem_error"*
  %33 = bitcast i8* %32 to i8* (%"class.boost::filesystem::filesystem_error"*)***
  %vtable.i = load i8* (%"class.boost::filesystem::filesystem_error"*)*** %33, align 4, !tbaa !5
  %vfn.i = getelementptr inbounds i8* (%"class.boost::filesystem::filesystem_error"*)** %vtable.i, i32 2
  %34 = load i8* (%"class.boost::filesystem::filesystem_error"*)** %vfn.i, align 4
  %call13.i = call i8* %34(%"class.boost::filesystem::filesystem_error"* %exn.byref.i) nounwind
  %tobool.i.i36 = icmp eq i8* %call13.i, null
  br i1 %tobool.i.i36, label %if.then.i.i40, label %if.else.i.i

if.then.i.i40:                                    ; preds = %invoke.cont11.i
  %vtable.i.i37 = load i8** bitcast (%"class.std::basic_ostream"* @_ZSt4cout to i8**), align 4, !tbaa !5
  %vbase.offset.ptr.i.i38 = getelementptr i8* %vtable.i.i37, i32 -12
  %35 = bitcast i8* %vbase.offset.ptr.i.i38 to i32*
  %vbase.offset.i.i39 = load i32* %35, align 4
  %add.ptr.i.i = getelementptr inbounds i8* bitcast (%"class.std::basic_ostream"* @_ZSt4cout to i8*), i32 %vbase.offset.i.i39
  %36 = bitcast i8* %add.ptr.i.i to %"class.std::basic_ios"*
  %add.ptr.sum.i.i = add i32 %vbase.offset.i.i39, 20
  %_M_streambuf_state.i.i.i.i = getelementptr inbounds i8* bitcast (%"class.std::basic_ostream"* @_ZSt4cout to i8*), i32 %add.ptr.sum.i.i
  %37 = bitcast i8* %_M_streambuf_state.i.i.i.i to i32*
  %38 = load i32* %37, align 4, !tbaa !7
  %or.i.i.i.i = or i32 %38, 1
  invoke void @_ZNSt9basic_iosIcSt11char_traitsIcEE5clearESt12_Ios_Iostate(%"class.std::basic_ios"* %36, i32 %or.i.i.i.i)
          to label %invoke.cont14.i unwind label %lpad10.i

if.else.i.i:                                      ; preds = %invoke.cont11.i
  %call.i.i41.i = call i32 @strlen(i8* %call13.i) nounwind
  %call1.i4243.i = invoke %"class.std::basic_ostream"* @_ZSt16__ostream_insertIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_PKS3_i(%"class.std::basic_ostream"* @_ZSt4cout, i8* %call13.i, i32 %call.i.i41.i)
          to label %invoke.cont14.i unwind label %lpad10.i

invoke.cont14.i:                                  ; preds = %if.else.i.i, %if.then.i.i40
  %call1.i4648.i = invoke %"class.std::basic_ostream"* @_ZSt16__ostream_insertIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_PKS3_i(%"class.std::basic_ostream"* @_ZSt4cout, i8* getelementptr inbounds ([2 x i8]* @.str17, i32 0, i32 0), i32 1)
          to label %invoke.cont16.i unwind label %lpad10.i

invoke.cont16.i:                                  ; preds = %invoke.cont14.i
  call void @__cxa_end_catch()
  br label %_ZN12_GLOBAL__N_110try_existsEv.exit

lpad10.i:                                         ; preds = %invoke.cont14.i, %if.else.i.i, %if.then.i.i40, %catch.i
  %39 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %40 = extractvalue { i8*, i32 } %39, 0
  %41 = extractvalue { i8*, i32 } %39, 1
  invoke void @__cxa_end_catch()
          to label %eh.resume.i unwind label %terminate.lpad.i

eh.resume.i:                                      ; preds = %lpad10.i, %lpad.i
  %ehselector.slot.0.i = phi i32 [ %41, %lpad10.i ], [ %30, %lpad.i ]
  %exn.slot.0.i = phi i8* [ %40, %lpad10.i ], [ %29, %lpad.i ]
  %lpad.val.i = insertvalue { i8*, i32 } undef, i8* %exn.slot.0.i, 0
  %lpad.val21.i = insertvalue { i8*, i32 } %lpad.val.i, i32 %ehselector.slot.0.i, 1
  resume { i8*, i32 } %lpad.val21.i

terminate.lpad.i:                                 ; preds = %lpad10.i
  %42 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          catch i8* null
  call void @_ZSt9terminatev() noreturn nounwind
  unreachable

_ZN12_GLOBAL__N_110try_existsEv.exit:             ; preds = %invoke.cont6.i, %invoke.cont16.i
  ret i32 0
}

define linkonce_odr %"class.std::basic_ostream"* @_ZN5boost10filesystemlsIcSt11char_traitsIcEEERSt13basic_ostreamIT_T0_ES8_RKNS0_4pathE(%"class.std::basic_ostream"* %os, %"class.boost::filesystem::path"* %p) inlinehint {
invoke.cont:
  %ref.tmp.i.i11 = alloca %"class.std::allocator", align 1
  %__c.addr.i28.i.i = alloca i8, align 1
  %__c.addr.i25.i.i = alloca i8, align 1
  %__c.addr.i21.i.i = alloca i8, align 1
  %__c.addr.i.i.i = alloca i8, align 1
  %ref.tmp.i.i = alloca %"class.std::allocator", align 1
  %ref.tmp1 = alloca %"class.std::basic_string", align 4
  %m_pathname.i.i = getelementptr inbounds %"class.boost::filesystem::path"* %p, i32 0, i32 0
  call void @_ZNSsC1ERKSs(%"class.std::basic_string"* %ref.tmp1, %"class.std::basic_string"* %m_pathname.i.i)
  call void @llvm.lifetime.start(i64 1, i8* %__c.addr.i.i.i)
  store i8 34, i8* %__c.addr.i.i.i, align 1, !tbaa !1
  %call.i.i.i7 = invoke %"class.std::basic_ostream"* @_ZSt16__ostream_insertIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_PKS3_i(%"class.std::basic_ostream"* %os, i8* %__c.addr.i.i.i, i32 1)
          to label %call.i.i.i.noexc unwind label %lpad.nonloopexit

call.i.i.i.noexc:                                 ; preds = %invoke.cont
  call void @llvm.lifetime.end(i64 1, i8* %__c.addr.i.i.i)
  %_M_p.i.i.i.i5 = getelementptr inbounds %"class.std::basic_string"* %ref.tmp1, i32 0, i32 0, i32 0
  %0 = load i8** %_M_p.i.i.i.i5, align 4, !tbaa !0
  %arrayidx.i.i.i.i.i = getelementptr inbounds i8* %0, i32 -12
  %_M_length.i.i.i.i = bitcast i8* %arrayidx.i.i.i.i.i to i32*
  %1 = load i32* %_M_length.i.i.i.i, align 4, !tbaa !4
  %add.ptr.i.i.i = getelementptr inbounds i8* %0, i32 %1
  %cmp.i36.i.i = icmp eq i32 %1, 0
  br i1 %cmp.i36.i.i, label %_ZN5boost2io6detail25basic_string_inserter_impIcSt11char_traitsIcESaIcEEERSt13basic_ostreamIT_T0_ESA_RKSbIS7_S8_T1_ES7_S7_.exit.i, label %for.body.i.i

for.body.i.i:                                     ; preds = %call.i.i.i.noexc, %call.i26.i.i.noexc
  %2 = phi i8* [ %incdec.ptr.i.i.i, %call.i26.i.i.noexc ], [ %0, %call.i.i.i.noexc ]
  %3 = load i8* %2, align 1, !tbaa !1
  switch i8 %3, label %if.end.i.i [
    i8 38, label %if.then.i.i
    i8 34, label %if.then.i.i
  ]

if.then.i.i:                                      ; preds = %for.body.i.i, %for.body.i.i
  call void @llvm.lifetime.start(i64 1, i8* %__c.addr.i28.i.i)
  store i8 38, i8* %__c.addr.i28.i.i, align 1, !tbaa !1
  %call.i29.i.i8 = invoke %"class.std::basic_ostream"* @_ZSt16__ostream_insertIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_PKS3_i(%"class.std::basic_ostream"* %os, i8* %__c.addr.i28.i.i, i32 1)
          to label %call.i29.i.i.noexc unwind label %lpad.loopexit

call.i29.i.i.noexc:                               ; preds = %if.then.i.i
  call void @llvm.lifetime.end(i64 1, i8* %__c.addr.i28.i.i)
  %.pre.i.i = load i8* %2, align 1, !tbaa !1
  br label %if.end.i.i

if.end.i.i:                                       ; preds = %for.body.i.i, %call.i29.i.i.noexc
  %4 = phi i8 [ %3, %for.body.i.i ], [ %.pre.i.i, %call.i29.i.i.noexc ]
  call void @llvm.lifetime.start(i64 1, i8* %__c.addr.i25.i.i)
  store i8 %4, i8* %__c.addr.i25.i.i, align 1, !tbaa !1
  %call.i26.i.i9 = invoke %"class.std::basic_ostream"* @_ZSt16__ostream_insertIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_PKS3_i(%"class.std::basic_ostream"* %os, i8* %__c.addr.i25.i.i, i32 1)
          to label %call.i26.i.i.noexc unwind label %lpad.loopexit

call.i26.i.i.noexc:                               ; preds = %if.end.i.i
  call void @llvm.lifetime.end(i64 1, i8* %__c.addr.i25.i.i)
  %incdec.ptr.i.i.i = getelementptr inbounds i8* %2, i32 1
  %cmp.i.i.i6 = icmp eq i8* %incdec.ptr.i.i.i, %add.ptr.i.i.i
  br i1 %cmp.i.i.i6, label %_ZN5boost2io6detail25basic_string_inserter_impIcSt11char_traitsIcESaIcEEERSt13basic_ostreamIT_T0_ESA_RKSbIS7_S8_T1_ES7_S7_.exit.i, label %for.body.i.i

_ZN5boost2io6detail25basic_string_inserter_impIcSt11char_traitsIcESaIcEEERSt13basic_ostreamIT_T0_ESA_RKSbIS7_S8_T1_ES7_S7_.exit.i: ; preds = %call.i26.i.i.noexc, %call.i.i.i.noexc
  call void @llvm.lifetime.start(i64 1, i8* %__c.addr.i21.i.i)
  store i8 34, i8* %__c.addr.i21.i.i, align 1, !tbaa !1
  %call.i22.i.i10 = invoke %"class.std::basic_ostream"* @_ZSt16__ostream_insertIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_PKS3_i(%"class.std::basic_ostream"* %os, i8* %__c.addr.i21.i.i, i32 1)
          to label %invoke.cont2 unwind label %lpad.nonloopexit

invoke.cont2:                                     ; preds = %_ZN5boost2io6detail25basic_string_inserter_impIcSt11char_traitsIcESaIcEEERSt13basic_ostreamIT_T0_ESA_RKSbIS7_S8_T1_ES7_S7_.exit.i
  call void @llvm.lifetime.end(i64 1, i8* %__c.addr.i21.i.i)
  %5 = getelementptr inbounds %"class.std::allocator"* %ref.tmp.i.i11, i32 0, i32 0
  call void @llvm.lifetime.start(i64 1, i8* %5)
  %6 = load i8** %_M_p.i.i.i.i5, align 4, !tbaa !0
  %arrayidx.i.i.i13 = getelementptr inbounds i8* %6, i32 -12
  %7 = bitcast i8* %arrayidx.i.i.i13 to %"struct.std::basic_string<char, std::char_traits<char>, std::allocator<char> >::_Rep"*
  %cmp.i.i.i14 = icmp eq i8* %arrayidx.i.i.i13, bitcast ([0 x i32]* @_ZNSs4_Rep20_S_empty_rep_storageE to i8*)
  br i1 %cmp.i.i.i14, label %_ZNSsD1Ev.exit24, label %if.then.i.i.i16, !prof !3

if.then.i.i.i16:                                  ; preds = %invoke.cont2
  %_M_refcount.i.i.i15 = getelementptr inbounds i8* %6, i32 -4
  %8 = bitcast i8* %_M_refcount.i.i.i15 to i32*
  br i1 icmp ne (i8* bitcast (i32 (i32)* @pthread_cancel to i8*), i8* null), label %if.then.i.i.i.i17, label %if.else.i.i.i.i19

if.then.i.i.i.i17:                                ; preds = %if.then.i.i.i16
  %9 = atomicrmw add i32* %8, i32 -1 seq_cst
  br label %_ZN9__gnu_cxxL27__exchange_and_add_dispatchEPii.exit.i.i.i22

if.else.i.i.i.i19:                                ; preds = %if.then.i.i.i16
  %10 = load i32* %8, align 4, !tbaa !4
  %add.i.i.i.i.i18 = add nsw i32 %10, -1
  store i32 %add.i.i.i.i.i18, i32* %8, align 4, !tbaa !4
  br label %_ZN9__gnu_cxxL27__exchange_and_add_dispatchEPii.exit.i.i.i22

_ZN9__gnu_cxxL27__exchange_and_add_dispatchEPii.exit.i.i.i22: ; preds = %if.else.i.i.i.i19, %if.then.i.i.i.i17
  %retval.0.i.i.i.i20 = phi i32 [ %9, %if.then.i.i.i.i17 ], [ %10, %if.else.i.i.i.i19 ]
  %cmp3.i.i.i21 = icmp slt i32 %retval.0.i.i.i.i20, 1
  br i1 %cmp3.i.i.i21, label %if.then4.i.i.i23, label %_ZNSsD1Ev.exit24

if.then4.i.i.i23:                                 ; preds = %_ZN9__gnu_cxxL27__exchange_and_add_dispatchEPii.exit.i.i.i22
  call void @_ZNSs4_Rep10_M_destroyERKSaIcE(%"struct.std::basic_string<char, std::char_traits<char>, std::allocator<char> >::_Rep"* %7, %"class.std::allocator"* %ref.tmp.i.i11) nounwind
  br label %_ZNSsD1Ev.exit24

_ZNSsD1Ev.exit24:                                 ; preds = %invoke.cont2, %_ZN9__gnu_cxxL27__exchange_and_add_dispatchEPii.exit.i.i.i22, %if.then4.i.i.i23
  call void @llvm.lifetime.end(i64 1, i8* %5)
  ret %"class.std::basic_ostream"* %os

lpad.loopexit:                                    ; preds = %if.then.i.i, %if.end.i.i
  %lpad.loopexit25 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  br label %lpad

lpad.nonloopexit:                                 ; preds = %invoke.cont, %_ZN5boost2io6detail25basic_string_inserter_impIcSt11char_traitsIcESaIcEEERSt13basic_ostreamIT_T0_ESA_RKSbIS7_S8_T1_ES7_S7_.exit.i
  %lpad.nonloopexit26 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %_M_p.i.i.i.i.pre = getelementptr inbounds %"class.std::basic_string"* %ref.tmp1, i32 0, i32 0, i32 0
  br label %lpad

lpad:                                             ; preds = %lpad.nonloopexit, %lpad.loopexit
  %_M_p.i.i.i.i.pre-phi = phi i8** [ %_M_p.i.i.i.i.pre, %lpad.nonloopexit ], [ %_M_p.i.i.i.i5, %lpad.loopexit ]
  %lpad.phi = phi { i8*, i32 } [ %lpad.nonloopexit26, %lpad.nonloopexit ], [ %lpad.loopexit25, %lpad.loopexit ]
  %11 = getelementptr inbounds %"class.std::allocator"* %ref.tmp.i.i, i32 0, i32 0
  call void @llvm.lifetime.start(i64 1, i8* %11)
  %12 = load i8** %_M_p.i.i.i.i.pre-phi, align 4, !tbaa !0
  %arrayidx.i.i.i = getelementptr inbounds i8* %12, i32 -12
  %13 = bitcast i8* %arrayidx.i.i.i to %"struct.std::basic_string<char, std::char_traits<char>, std::allocator<char> >::_Rep"*
  %cmp.i.i.i = icmp eq i8* %arrayidx.i.i.i, bitcast ([0 x i32]* @_ZNSs4_Rep20_S_empty_rep_storageE to i8*)
  br i1 %cmp.i.i.i, label %eh.resume, label %if.then.i.i.i, !prof !3

if.then.i.i.i:                                    ; preds = %lpad
  %_M_refcount.i.i.i = getelementptr inbounds i8* %12, i32 -4
  %14 = bitcast i8* %_M_refcount.i.i.i to i32*
  br i1 icmp ne (i8* bitcast (i32 (i32)* @pthread_cancel to i8*), i8* null), label %if.then.i.i.i.i, label %if.else.i.i.i.i

if.then.i.i.i.i:                                  ; preds = %if.then.i.i.i
  %15 = atomicrmw add i32* %14, i32 -1 seq_cst
  br label %_ZN9__gnu_cxxL27__exchange_and_add_dispatchEPii.exit.i.i.i

if.else.i.i.i.i:                                  ; preds = %if.then.i.i.i
  %16 = load i32* %14, align 4, !tbaa !4
  %add.i.i.i.i.i = add nsw i32 %16, -1
  store i32 %add.i.i.i.i.i, i32* %14, align 4, !tbaa !4
  br label %_ZN9__gnu_cxxL27__exchange_and_add_dispatchEPii.exit.i.i.i

_ZN9__gnu_cxxL27__exchange_and_add_dispatchEPii.exit.i.i.i: ; preds = %if.else.i.i.i.i, %if.then.i.i.i.i
  %retval.0.i.i.i.i = phi i32 [ %15, %if.then.i.i.i.i ], [ %16, %if.else.i.i.i.i ]
  %cmp3.i.i.i = icmp slt i32 %retval.0.i.i.i.i, 1
  br i1 %cmp3.i.i.i, label %if.then4.i.i.i, label %eh.resume

if.then4.i.i.i:                                   ; preds = %_ZN9__gnu_cxxL27__exchange_and_add_dispatchEPii.exit.i.i.i
  call void @_ZNSs4_Rep10_M_destroyERKSaIcE(%"struct.std::basic_string<char, std::char_traits<char>, std::allocator<char> >::_Rep"* %13, %"class.std::allocator"* %ref.tmp.i.i) nounwind
  br label %eh.resume

eh.resume:                                        ; preds = %if.then4.i.i.i, %_ZN9__gnu_cxxL27__exchange_and_add_dispatchEPii.exit.i.i.i, %lpad
  call void @llvm.lifetime.end(i64 1, i8* %11)
  resume { i8*, i32 } %lpad.phi
}

define internal fastcc void @_ZN12_GLOBAL__N_111show_statusEN5boost10filesystem11file_statusENS0_6system10error_codeE(i32 %s.0, i32 %s.1, i32 %ec.0, %"class.boost::system::error_category"* %ec.1) {
entry:
  %ref.tmp.i.i146 = alloca %"class.std::allocator", align 1
  %ref.tmp.i.i132 = alloca %"class.std::allocator", align 1
  %ref.tmp.i.i118 = alloca %"class.std::allocator", align 1
  %ref.tmp.i.i = alloca %"class.std::allocator", align 1
  %__c.addr.i97 = alloca i8, align 1
  %__c.addr.i = alloca i8, align 1
  %ref.tmp = alloca %"class.boost::system::error_condition", align 8
  %ref.tmp7 = alloca %"class.std::basic_string", align 4
  %ref.tmp21 = alloca %"class.std::basic_string", align 4
  %call.i.i = call %"class.boost::system::error_category"* @_ZN5boost6system16generic_categoryEv()
  %cmp.i = icmp eq i32 %ec.0, 0
  br i1 %cmp.i, label %if.else, label %if.then

if.then:                                          ; preds = %entry
  %0 = bitcast %"class.boost::system::error_category"* %ec.1 to void (%"class.boost::system::error_condition"*, %"class.boost::system::error_category"*, i32)***
  %vtable.i = load void (%"class.boost::system::error_condition"*, %"class.boost::system::error_category"*, i32)*** %0, align 4, !tbaa !5
  %vfn.i = getelementptr inbounds void (%"class.boost::system::error_condition"*, %"class.boost::system::error_category"*, i32)** %vtable.i, i32 4
  %1 = load void (%"class.boost::system::error_condition"*, %"class.boost::system::error_category"*, i32)** %vfn.i, align 4
  call void %1(%"class.boost::system::error_condition"* sret %ref.tmp, %"class.boost::system::error_category"* %ec.1, i32 %ec.0)
  %2 = bitcast %"class.boost::system::error_condition"* %ref.tmp to i64*
  %3 = load i64* %2, align 8
  %econd.sroa.0.0.extract.trunc = trunc i64 %3 to i32
  %econd.sroa.1.4.extract.shift = lshr i64 %3, 32
  %econd.sroa.1.4.extract.trunc = trunc i64 %econd.sroa.1.4.extract.shift to i32
  %4 = inttoptr i32 %econd.sroa.1.4.extract.trunc to %"class.boost::system::error_category"*
  %call1.i78 = call %"class.std::basic_ostream"* @_ZSt16__ostream_insertIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_PKS3_i(%"class.std::basic_ostream"* @_ZSt4cout, i8* getelementptr inbounds ([31 x i8]* @.str19, i32 0, i32 0), i32 30)
  %call1.i80 = call %"class.std::basic_ostream"* @_ZSt16__ostream_insertIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_PKS3_i(%"class.std::basic_ostream"* @_ZSt4cout, i8* getelementptr inbounds ([18 x i8]* @.str20, i32 0, i32 0), i32 17)
  %call4 = call %"class.std::basic_ostream"* @_ZNSolsEi(%"class.std::basic_ostream"* @_ZSt4cout, i32 %ec.0)
  call void @llvm.lifetime.start(i64 1, i8* %__c.addr.i)
  store i8 10, i8* %__c.addr.i, align 1, !tbaa !1
  %call.i = call %"class.std::basic_ostream"* @_ZSt16__ostream_insertIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_PKS3_i(%"class.std::basic_ostream"* %call4, i8* %__c.addr.i, i32 1)
  call void @llvm.lifetime.end(i64 1, i8* %__c.addr.i)
  %call1.i83 = call %"class.std::basic_ostream"* @_ZSt16__ostream_insertIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_PKS3_i(%"class.std::basic_ostream"* %call.i, i8* getelementptr inbounds ([21 x i8]* @.str21, i32 0, i32 0), i32 20)
  %5 = bitcast %"class.boost::system::error_category"* %ec.1 to void (%"class.std::basic_string"*, %"class.boost::system::error_category"*, i32)***
  %vtable.i85 = load void (%"class.std::basic_string"*, %"class.boost::system::error_category"*, i32)*** %5, align 4, !tbaa !5
  %vfn.i86 = getelementptr inbounds void (%"class.std::basic_string"*, %"class.boost::system::error_category"*, i32)** %vtable.i85, i32 3
  %6 = load void (%"class.std::basic_string"*, %"class.boost::system::error_category"*, i32)** %vfn.i86, align 4
  call void %6(%"class.std::basic_string"* sret %ref.tmp7, %"class.boost::system::error_category"* %ec.1, i32 %ec.0)
  %_M_p.i.i.i = getelementptr inbounds %"class.std::basic_string"* %ref.tmp7, i32 0, i32 0, i32 0
  %7 = load i8** %_M_p.i.i.i, align 4, !tbaa !0
  %arrayidx.i.i.i = getelementptr inbounds i8* %7, i32 -12
  %_M_length.i.i = bitcast i8* %arrayidx.i.i.i to i32*
  %8 = load i32* %_M_length.i.i, align 4, !tbaa !4
  %call2.i88 = invoke %"class.std::basic_ostream"* @_ZSt16__ostream_insertIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_PKS3_i(%"class.std::basic_ostream"* %call.i, i8* %7, i32 %8)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %if.then
  %call1.i9091 = invoke %"class.std::basic_ostream"* @_ZSt16__ostream_insertIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_PKS3_i(%"class.std::basic_ostream"* %call2.i88, i8* getelementptr inbounds ([3 x i8]* @.str22, i32 0, i32 0), i32 2)
          to label %invoke.cont9 unwind label %lpad

invoke.cont9:                                     ; preds = %invoke.cont
  %call1.i9394 = invoke %"class.std::basic_ostream"* @_ZSt16__ostream_insertIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_PKS3_i(%"class.std::basic_ostream"* %call2.i88, i8* getelementptr inbounds ([44 x i8]* @.str23, i32 0, i32 0), i32 43)
          to label %invoke.cont11 unwind label %lpad

invoke.cont11:                                    ; preds = %invoke.cont9
  %call16 = invoke %"class.std::basic_ostream"* @_ZNSolsEi(%"class.std::basic_ostream"* %call2.i88, i32 %econd.sroa.0.0.extract.trunc)
          to label %invoke.cont15 unwind label %lpad

invoke.cont15:                                    ; preds = %invoke.cont11
  call void @llvm.lifetime.start(i64 1, i8* %__c.addr.i97)
  store i8 10, i8* %__c.addr.i97, align 1, !tbaa !1
  %call.i9899 = invoke %"class.std::basic_ostream"* @_ZSt16__ostream_insertIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_PKS3_i(%"class.std::basic_ostream"* %call16, i8* %__c.addr.i97, i32 1)
          to label %invoke.cont17 unwind label %lpad

invoke.cont17:                                    ; preds = %invoke.cont15
  call void @llvm.lifetime.end(i64 1, i8* %__c.addr.i97)
  %call1.i101102 = invoke %"class.std::basic_ostream"* @_ZSt16__ostream_insertIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_PKS3_i(%"class.std::basic_ostream"* %call.i9899, i8* getelementptr inbounds ([47 x i8]* @.str24, i32 0, i32 0), i32 46)
          to label %invoke.cont19 unwind label %lpad

invoke.cont19:                                    ; preds = %invoke.cont17
  %9 = inttoptr i32 %econd.sroa.1.4.extract.trunc to void (%"class.std::basic_string"*, %"class.boost::system::error_category"*, i32)***
  %vtable.i105 = load void (%"class.std::basic_string"*, %"class.boost::system::error_category"*, i32)*** %9, align 4, !tbaa !5
  %vfn.i106 = getelementptr inbounds void (%"class.std::basic_string"*, %"class.boost::system::error_category"*, i32)** %vtable.i105, i32 3
  %10 = load void (%"class.std::basic_string"*, %"class.boost::system::error_category"*, i32)** %vfn.i106, align 4
  invoke void %10(%"class.std::basic_string"* sret %ref.tmp21, %"class.boost::system::error_category"* %4, i32 %econd.sroa.0.0.extract.trunc)
          to label %invoke.cont22 unwind label %lpad

invoke.cont22:                                    ; preds = %invoke.cont19
  %_M_p.i.i.i108 = getelementptr inbounds %"class.std::basic_string"* %ref.tmp21, i32 0, i32 0, i32 0
  %11 = load i8** %_M_p.i.i.i108, align 4, !tbaa !0
  %arrayidx.i.i.i109 = getelementptr inbounds i8* %11, i32 -12
  %_M_length.i.i110 = bitcast i8* %arrayidx.i.i.i109 to i32*
  %12 = load i32* %_M_length.i.i110, align 4, !tbaa !4
  %call2.i111 = invoke %"class.std::basic_ostream"* @_ZSt16__ostream_insertIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_PKS3_i(%"class.std::basic_ostream"* %call.i9899, i8* %11, i32 %12)
          to label %invoke.cont24 unwind label %lpad23

invoke.cont24:                                    ; preds = %invoke.cont22
  %call1.i114115 = invoke %"class.std::basic_ostream"* @_ZSt16__ostream_insertIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_PKS3_i(%"class.std::basic_ostream"* %call2.i111, i8* getelementptr inbounds ([3 x i8]* @.str22, i32 0, i32 0), i32 2)
          to label %invoke.cont26 unwind label %lpad23

invoke.cont26:                                    ; preds = %invoke.cont24
  %13 = getelementptr inbounds %"class.std::allocator"* %ref.tmp.i.i, i32 0, i32 0
  call void @llvm.lifetime.start(i64 1, i8* %13)
  %14 = load i8** %_M_p.i.i.i108, align 4, !tbaa !0
  %arrayidx.i.i.i117 = getelementptr inbounds i8* %14, i32 -12
  %15 = bitcast i8* %arrayidx.i.i.i117 to %"struct.std::basic_string<char, std::char_traits<char>, std::allocator<char> >::_Rep"*
  %cmp.i.i.i = icmp eq i8* %arrayidx.i.i.i117, bitcast ([0 x i32]* @_ZNSs4_Rep20_S_empty_rep_storageE to i8*)
  br i1 %cmp.i.i.i, label %invoke.cont28, label %if.then.i.i.i, !prof !3

if.then.i.i.i:                                    ; preds = %invoke.cont26
  %_M_refcount.i.i.i = getelementptr inbounds i8* %14, i32 -4
  %16 = bitcast i8* %_M_refcount.i.i.i to i32*
  br i1 icmp ne (i8* bitcast (i32 (i32)* @pthread_cancel to i8*), i8* null), label %if.then.i.i.i.i, label %if.else.i.i.i.i

if.then.i.i.i.i:                                  ; preds = %if.then.i.i.i
  %17 = atomicrmw add i32* %16, i32 -1 seq_cst
  br label %_ZN9__gnu_cxxL27__exchange_and_add_dispatchEPii.exit.i.i.i

if.else.i.i.i.i:                                  ; preds = %if.then.i.i.i
  %18 = load i32* %16, align 4, !tbaa !4
  %add.i.i.i.i.i = add nsw i32 %18, -1
  store i32 %add.i.i.i.i.i, i32* %16, align 4, !tbaa !4
  br label %_ZN9__gnu_cxxL27__exchange_and_add_dispatchEPii.exit.i.i.i

_ZN9__gnu_cxxL27__exchange_and_add_dispatchEPii.exit.i.i.i: ; preds = %if.else.i.i.i.i, %if.then.i.i.i.i
  %retval.0.i.i.i.i = phi i32 [ %17, %if.then.i.i.i.i ], [ %18, %if.else.i.i.i.i ]
  %cmp3.i.i.i = icmp slt i32 %retval.0.i.i.i.i, 1
  br i1 %cmp3.i.i.i, label %if.then4.i.i.i, label %invoke.cont28

if.then4.i.i.i:                                   ; preds = %_ZN9__gnu_cxxL27__exchange_and_add_dispatchEPii.exit.i.i.i
  call void @_ZNSs4_Rep10_M_destroyERKSaIcE(%"struct.std::basic_string<char, std::char_traits<char>, std::allocator<char> >::_Rep"* %15, %"class.std::allocator"* %ref.tmp.i.i) nounwind
  br label %invoke.cont28

invoke.cont28:                                    ; preds = %if.then4.i.i.i, %_ZN9__gnu_cxxL27__exchange_and_add_dispatchEPii.exit.i.i.i, %invoke.cont26
  call void @llvm.lifetime.end(i64 1, i8* %13)
  %19 = getelementptr inbounds %"class.std::allocator"* %ref.tmp.i.i118, i32 0, i32 0
  call void @llvm.lifetime.start(i64 1, i8* %19)
  %20 = load i8** %_M_p.i.i.i, align 4, !tbaa !0
  %arrayidx.i.i.i120 = getelementptr inbounds i8* %20, i32 -12
  %21 = bitcast i8* %arrayidx.i.i.i120 to %"struct.std::basic_string<char, std::char_traits<char>, std::allocator<char> >::_Rep"*
  %cmp.i.i.i121 = icmp eq i8* %arrayidx.i.i.i120, bitcast ([0 x i32]* @_ZNSs4_Rep20_S_empty_rep_storageE to i8*)
  br i1 %cmp.i.i.i121, label %if.end, label %if.then.i.i.i123, !prof !3

if.then.i.i.i123:                                 ; preds = %invoke.cont28
  %_M_refcount.i.i.i122 = getelementptr inbounds i8* %20, i32 -4
  %22 = bitcast i8* %_M_refcount.i.i.i122 to i32*
  br i1 icmp ne (i8* bitcast (i32 (i32)* @pthread_cancel to i8*), i8* null), label %if.then.i.i.i.i124, label %if.else.i.i.i.i126

if.then.i.i.i.i124:                               ; preds = %if.then.i.i.i123
  %23 = atomicrmw add i32* %22, i32 -1 seq_cst
  br label %_ZN9__gnu_cxxL27__exchange_and_add_dispatchEPii.exit.i.i.i129

if.else.i.i.i.i126:                               ; preds = %if.then.i.i.i123
  %24 = load i32* %22, align 4, !tbaa !4
  %add.i.i.i.i.i125 = add nsw i32 %24, -1
  store i32 %add.i.i.i.i.i125, i32* %22, align 4, !tbaa !4
  br label %_ZN9__gnu_cxxL27__exchange_and_add_dispatchEPii.exit.i.i.i129

_ZN9__gnu_cxxL27__exchange_and_add_dispatchEPii.exit.i.i.i129: ; preds = %if.else.i.i.i.i126, %if.then.i.i.i.i124
  %retval.0.i.i.i.i127 = phi i32 [ %23, %if.then.i.i.i.i124 ], [ %24, %if.else.i.i.i.i126 ]
  %cmp3.i.i.i128 = icmp slt i32 %retval.0.i.i.i.i127, 1
  br i1 %cmp3.i.i.i128, label %if.then4.i.i.i130, label %if.end

if.then4.i.i.i130:                                ; preds = %_ZN9__gnu_cxxL27__exchange_and_add_dispatchEPii.exit.i.i.i129
  call void @_ZNSs4_Rep10_M_destroyERKSaIcE(%"struct.std::basic_string<char, std::char_traits<char>, std::allocator<char> >::_Rep"* %21, %"class.std::allocator"* %ref.tmp.i.i118) nounwind
  br label %if.end

lpad:                                             ; preds = %invoke.cont19, %invoke.cont17, %invoke.cont15, %invoke.cont9, %invoke.cont, %if.then, %invoke.cont11
  %25 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %26 = extractvalue { i8*, i32 } %25, 0
  %27 = extractvalue { i8*, i32 } %25, 1
  br label %ehcleanup

lpad23:                                           ; preds = %invoke.cont24, %invoke.cont22
  %28 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %29 = extractvalue { i8*, i32 } %28, 0
  %30 = extractvalue { i8*, i32 } %28, 1
  %31 = getelementptr inbounds %"class.std::allocator"* %ref.tmp.i.i132, i32 0, i32 0
  call void @llvm.lifetime.start(i64 1, i8* %31)
  %32 = load i8** %_M_p.i.i.i108, align 4, !tbaa !0
  %arrayidx.i.i.i134 = getelementptr inbounds i8* %32, i32 -12
  %33 = bitcast i8* %arrayidx.i.i.i134 to %"struct.std::basic_string<char, std::char_traits<char>, std::allocator<char> >::_Rep"*
  %cmp.i.i.i135 = icmp eq i8* %arrayidx.i.i.i134, bitcast ([0 x i32]* @_ZNSs4_Rep20_S_empty_rep_storageE to i8*)
  br i1 %cmp.i.i.i135, label %ehcleanup, label %if.then.i.i.i137, !prof !3

if.then.i.i.i137:                                 ; preds = %lpad23
  %_M_refcount.i.i.i136 = getelementptr inbounds i8* %32, i32 -4
  %34 = bitcast i8* %_M_refcount.i.i.i136 to i32*
  br i1 icmp ne (i8* bitcast (i32 (i32)* @pthread_cancel to i8*), i8* null), label %if.then.i.i.i.i138, label %if.else.i.i.i.i140

if.then.i.i.i.i138:                               ; preds = %if.then.i.i.i137
  %35 = atomicrmw add i32* %34, i32 -1 seq_cst
  br label %_ZN9__gnu_cxxL27__exchange_and_add_dispatchEPii.exit.i.i.i143

if.else.i.i.i.i140:                               ; preds = %if.then.i.i.i137
  %36 = load i32* %34, align 4, !tbaa !4
  %add.i.i.i.i.i139 = add nsw i32 %36, -1
  store i32 %add.i.i.i.i.i139, i32* %34, align 4, !tbaa !4
  br label %_ZN9__gnu_cxxL27__exchange_and_add_dispatchEPii.exit.i.i.i143

_ZN9__gnu_cxxL27__exchange_and_add_dispatchEPii.exit.i.i.i143: ; preds = %if.else.i.i.i.i140, %if.then.i.i.i.i138
  %retval.0.i.i.i.i141 = phi i32 [ %35, %if.then.i.i.i.i138 ], [ %36, %if.else.i.i.i.i140 ]
  %cmp3.i.i.i142 = icmp slt i32 %retval.0.i.i.i.i141, 1
  br i1 %cmp3.i.i.i142, label %if.then4.i.i.i144, label %ehcleanup

if.then4.i.i.i144:                                ; preds = %_ZN9__gnu_cxxL27__exchange_and_add_dispatchEPii.exit.i.i.i143
  call void @_ZNSs4_Rep10_M_destroyERKSaIcE(%"struct.std::basic_string<char, std::char_traits<char>, std::allocator<char> >::_Rep"* %33, %"class.std::allocator"* %ref.tmp.i.i132) nounwind
  br label %ehcleanup

ehcleanup:                                        ; preds = %if.then4.i.i.i144, %_ZN9__gnu_cxxL27__exchange_and_add_dispatchEPii.exit.i.i.i143, %lpad23, %lpad
  %exn.slot.0 = phi i8* [ %26, %lpad ], [ %29, %lpad23 ], [ %29, %_ZN9__gnu_cxxL27__exchange_and_add_dispatchEPii.exit.i.i.i143 ], [ %29, %if.then4.i.i.i144 ]
  %ehselector.slot.0 = phi i32 [ %27, %lpad ], [ %30, %lpad23 ], [ %30, %_ZN9__gnu_cxxL27__exchange_and_add_dispatchEPii.exit.i.i.i143 ], [ %30, %if.then4.i.i.i144 ]
  %37 = getelementptr inbounds %"class.std::allocator"* %ref.tmp.i.i146, i32 0, i32 0
  call void @llvm.lifetime.start(i64 1, i8* %37)
  %38 = load i8** %_M_p.i.i.i, align 4, !tbaa !0
  %arrayidx.i.i.i148 = getelementptr inbounds i8* %38, i32 -12
  %39 = bitcast i8* %arrayidx.i.i.i148 to %"struct.std::basic_string<char, std::char_traits<char>, std::allocator<char> >::_Rep"*
  %cmp.i.i.i149 = icmp eq i8* %arrayidx.i.i.i148, bitcast ([0 x i32]* @_ZNSs4_Rep20_S_empty_rep_storageE to i8*)
  br i1 %cmp.i.i.i149, label %eh.resume, label %if.then.i.i.i151, !prof !3

if.then.i.i.i151:                                 ; preds = %ehcleanup
  %_M_refcount.i.i.i150 = getelementptr inbounds i8* %38, i32 -4
  %40 = bitcast i8* %_M_refcount.i.i.i150 to i32*
  br i1 icmp ne (i8* bitcast (i32 (i32)* @pthread_cancel to i8*), i8* null), label %if.then.i.i.i.i152, label %if.else.i.i.i.i154

if.then.i.i.i.i152:                               ; preds = %if.then.i.i.i151
  %41 = atomicrmw add i32* %40, i32 -1 seq_cst
  br label %_ZN9__gnu_cxxL27__exchange_and_add_dispatchEPii.exit.i.i.i157

if.else.i.i.i.i154:                               ; preds = %if.then.i.i.i151
  %42 = load i32* %40, align 4, !tbaa !4
  %add.i.i.i.i.i153 = add nsw i32 %42, -1
  store i32 %add.i.i.i.i.i153, i32* %40, align 4, !tbaa !4
  br label %_ZN9__gnu_cxxL27__exchange_and_add_dispatchEPii.exit.i.i.i157

_ZN9__gnu_cxxL27__exchange_and_add_dispatchEPii.exit.i.i.i157: ; preds = %if.else.i.i.i.i154, %if.then.i.i.i.i152
  %retval.0.i.i.i.i155 = phi i32 [ %41, %if.then.i.i.i.i152 ], [ %42, %if.else.i.i.i.i154 ]
  %cmp3.i.i.i156 = icmp slt i32 %retval.0.i.i.i.i155, 1
  br i1 %cmp3.i.i.i156, label %if.then4.i.i.i158, label %eh.resume

if.then4.i.i.i158:                                ; preds = %_ZN9__gnu_cxxL27__exchange_and_add_dispatchEPii.exit.i.i.i157
  call void @_ZNSs4_Rep10_M_destroyERKSaIcE(%"struct.std::basic_string<char, std::char_traits<char>, std::allocator<char> >::_Rep"* %39, %"class.std::allocator"* %ref.tmp.i.i146) nounwind
  br label %eh.resume

if.else:                                          ; preds = %entry
  %call1.i161 = call %"class.std::basic_ostream"* @_ZSt16__ostream_insertIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_PKS3_i(%"class.std::basic_ostream"* @_ZSt4cout, i8* getelementptr inbounds ([12 x i8]* @.str25, i32 0, i32 0), i32 11)
  br label %if.end

if.end:                                           ; preds = %if.then4.i.i.i130, %_ZN9__gnu_cxxL27__exchange_and_add_dispatchEPii.exit.i.i.i129, %invoke.cont28, %if.else
  %call1.i163 = call %"class.std::basic_ostream"* @_ZSt16__ostream_insertIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_PKS3_i(%"class.std::basic_ostream"* @_ZSt4cout, i8* getelementptr inbounds ([13 x i8]* @.str26, i32 0, i32 0), i32 12)
  %call34 = call %"class.std::basic_ostream"* @_ZNSolsEi(%"class.std::basic_ostream"* @_ZSt4cout, i32 %s.0)
  %call1.i165 = call %"class.std::basic_ostream"* @_ZSt16__ostream_insertIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_PKS3_i(%"class.std::basic_ostream"* %call34, i8* getelementptr inbounds ([24 x i8]* @.str27, i32 0, i32 0), i32 23)
  %arrayidx.i = getelementptr inbounds [10 x i8*]* @_ZN12_GLOBAL__N_113file_type_tabE, i32 0, i32 %s.0
  %43 = load i8** %arrayidx.i, align 4, !tbaa !0
  %call.i.i168 = call i32 @strlen(i8* %43) nounwind
  %call1.i169 = call %"class.std::basic_ostream"* @_ZSt16__ostream_insertIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_PKS3_i(%"class.std::basic_ostream"* %call34, i8* %43, i32 %call.i.i168)
  %call1.i172 = call %"class.std::basic_ostream"* @_ZSt16__ostream_insertIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_PKS3_i(%"class.std::basic_ostream"* %call34, i8* getelementptr inbounds ([3 x i8]* @.str22, i32 0, i32 0), i32 2)
  %call1.i175 = call %"class.std::basic_ostream"* @_ZSt16__ostream_insertIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_PKS3_i(%"class.std::basic_ostream"* @_ZSt4cout, i8* getelementptr inbounds ([14 x i8]* @.str28, i32 0, i32 0), i32 13)
  %44 = icmp ugt i32 %s.0, 1
  %cond = select i1 %44, i8* getelementptr inbounds ([5 x i8]* @.str15, i32 0, i32 0), i8* getelementptr inbounds ([6 x i8]* @.str16, i32 0, i32 0)
  %call.i.i177 = call i32 @strlen(i8* %cond) nounwind
  %call1.i178 = call %"class.std::basic_ostream"* @_ZSt16__ostream_insertIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_PKS3_i(%"class.std::basic_ostream"* @_ZSt4cout, i8* %cond, i32 %call.i.i177)
  %call1.i181 = call %"class.std::basic_ostream"* @_ZSt16__ostream_insertIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_PKS3_i(%"class.std::basic_ostream"* @_ZSt4cout, i8* getelementptr inbounds ([2 x i8]* @.str17, i32 0, i32 0), i32 1)
  %call1.i184 = call %"class.std::basic_ostream"* @_ZSt16__ostream_insertIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_PKS3_i(%"class.std::basic_ostream"* @_ZSt4cout, i8* getelementptr inbounds ([20 x i8]* @.str29, i32 0, i32 0), i32 19)
  %cmp.i.i = icmp eq i32 %s.0, 0
  br i1 %cmp.i.i, label %_ZN5boost10filesystem12status_knownENS0_11file_statusE.exit, label %land.rhs.i

land.rhs.i:                                       ; preds = %if.end
  %cmp.i3.i = icmp ne i32 %s.1, 65535
  %phitmp = select i1 %cmp.i3.i, i8* getelementptr inbounds ([5 x i8]* @.str15, i32 0, i32 0), i8* getelementptr inbounds ([6 x i8]* @.str16, i32 0, i32 0)
  br label %_ZN5boost10filesystem12status_knownENS0_11file_statusE.exit

_ZN5boost10filesystem12status_knownENS0_11file_statusE.exit: ; preds = %if.end, %land.rhs.i
  %45 = phi i8* [ getelementptr inbounds ([6 x i8]* @.str16, i32 0, i32 0), %if.end ], [ %phitmp, %land.rhs.i ]
  %call.i.i186 = call i32 @strlen(i8* %45) nounwind
  %call1.i187 = call %"class.std::basic_ostream"* @_ZSt16__ostream_insertIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_PKS3_i(%"class.std::basic_ostream"* @_ZSt4cout, i8* %45, i32 %call.i.i186)
  %call1.i190 = call %"class.std::basic_ostream"* @_ZSt16__ostream_insertIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_PKS3_i(%"class.std::basic_ostream"* @_ZSt4cout, i8* getelementptr inbounds ([2 x i8]* @.str17, i32 0, i32 0), i32 1)
  %call1.i193 = call %"class.std::basic_ostream"* @_ZSt16__ostream_insertIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_PKS3_i(%"class.std::basic_ostream"* @_ZSt4cout, i8* getelementptr inbounds ([23 x i8]* @.str30, i32 0, i32 0), i32 22)
  %cmp.i196 = icmp eq i32 %s.0, 2
  %cond53 = select i1 %cmp.i196, i8* getelementptr inbounds ([5 x i8]* @.str15, i32 0, i32 0), i8* getelementptr inbounds ([6 x i8]* @.str16, i32 0, i32 0)
  %call.i.i197 = call i32 @strlen(i8* %cond53) nounwind
  %call1.i198 = call %"class.std::basic_ostream"* @_ZSt16__ostream_insertIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_PKS3_i(%"class.std::basic_ostream"* @_ZSt4cout, i8* %cond53, i32 %call.i.i197)
  %call1.i201 = call %"class.std::basic_ostream"* @_ZSt16__ostream_insertIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_PKS3_i(%"class.std::basic_ostream"* @_ZSt4cout, i8* getelementptr inbounds ([2 x i8]* @.str17, i32 0, i32 0), i32 1)
  %call1.i204 = call %"class.std::basic_ostream"* @_ZSt16__ostream_insertIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_PKS3_i(%"class.std::basic_ostream"* @_ZSt4cout, i8* getelementptr inbounds ([20 x i8]* @.str31, i32 0, i32 0), i32 19)
  %cmp.i207 = icmp eq i32 %s.0, 3
  %cond59 = select i1 %cmp.i207, i8* getelementptr inbounds ([5 x i8]* @.str15, i32 0, i32 0), i8* getelementptr inbounds ([6 x i8]* @.str16, i32 0, i32 0)
  %call.i.i208 = call i32 @strlen(i8* %cond59) nounwind
  %call1.i209 = call %"class.std::basic_ostream"* @_ZSt16__ostream_insertIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_PKS3_i(%"class.std::basic_ostream"* @_ZSt4cout, i8* %cond59, i32 %call.i.i208)
  %call1.i212 = call %"class.std::basic_ostream"* @_ZSt16__ostream_insertIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_PKS3_i(%"class.std::basic_ostream"* @_ZSt4cout, i8* getelementptr inbounds ([2 x i8]* @.str17, i32 0, i32 0), i32 1)
  %call1.i215 = call %"class.std::basic_ostream"* @_ZSt16__ostream_insertIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_PKS3_i(%"class.std::basic_ostream"* @_ZSt4cout, i8* getelementptr inbounds ([16 x i8]* @.str32, i32 0, i32 0), i32 15)
  %46 = icmp ugt i32 %s.0, 4
  %cond65 = select i1 %46, i8* getelementptr inbounds ([5 x i8]* @.str15, i32 0, i32 0), i8* getelementptr inbounds ([6 x i8]* @.str16, i32 0, i32 0)
  %call.i.i218 = call i32 @strlen(i8* %cond65) nounwind
  %call1.i219 = call %"class.std::basic_ostream"* @_ZSt16__ostream_insertIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_PKS3_i(%"class.std::basic_ostream"* @_ZSt4cout, i8* %cond65, i32 %call.i.i218)
  %call1.i222 = call %"class.std::basic_ostream"* @_ZSt16__ostream_insertIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_PKS3_i(%"class.std::basic_ostream"* @_ZSt4cout, i8* getelementptr inbounds ([2 x i8]* @.str17, i32 0, i32 0), i32 1)
  %call1.i225 = call %"class.std::basic_ostream"* @_ZSt16__ostream_insertIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_PKS3_i(%"class.std::basic_ostream"* @_ZSt4cout, i8* getelementptr inbounds ([18 x i8]* @.str33, i32 0, i32 0), i32 17)
  %cmp.i228 = icmp eq i32 %s.0, 4
  %cond71 = select i1 %cmp.i228, i8* getelementptr inbounds ([5 x i8]* @.str15, i32 0, i32 0), i8* getelementptr inbounds ([6 x i8]* @.str16, i32 0, i32 0)
  %call.i.i229 = call i32 @strlen(i8* %cond71) nounwind
  %call1.i230 = call %"class.std::basic_ostream"* @_ZSt16__ostream_insertIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_PKS3_i(%"class.std::basic_ostream"* @_ZSt4cout, i8* %cond71, i32 %call.i.i229)
  %call1.i = call %"class.std::basic_ostream"* @_ZSt16__ostream_insertIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_PKS3_i(%"class.std::basic_ostream"* @_ZSt4cout, i8* getelementptr inbounds ([2 x i8]* @.str17, i32 0, i32 0), i32 1)
  ret void

eh.resume:                                        ; preds = %if.then4.i.i.i158, %_ZN9__gnu_cxxL27__exchange_and_add_dispatchEPii.exit.i.i.i157, %ehcleanup
  call void @llvm.lifetime.end(i64 1, i8* %37)
  %lpad.val = insertvalue { i8*, i32 } undef, i8* %exn.slot.0, 0
  %lpad.val74 = insertvalue { i8*, i32 } %lpad.val, i32 %ehselector.slot.0, 1
  resume { i8*, i32 } %lpad.val74
}

declare %"class.std::codecvt"* @_ZN5boost10filesystem4path7codecvtEv()

declare void @__assert_fail(i8*, i8*, i32, i8*) noreturn nounwind

declare void @_ZNSs9_M_mutateEjjj(%"class.std::basic_string"*, i32, i32, i32)

declare void @_ZNSsC1ERKSs(%"class.std::basic_string"*, %"class.std::basic_string"*)

declare %"class.std::basic_ostream"* @_ZSt16__ostream_insertIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_PKS3_i(%"class.std::basic_ostream"*, i8*, i32)

declare i32 @strlen(i8* nocapture) nounwind readonly

declare %"class.std::basic_string"* @_ZNSs6appendEPKcj(%"class.std::basic_string"*, i8*, i32)

declare void @_ZNSs4_Rep10_M_destroyERKSaIcE(%"struct.std::basic_string<char, std::char_traits<char>, std::allocator<char> >::_Rep"*, %"class.std::allocator"*) nounwind

declare extern_weak i32 @pthread_cancel(i32)

declare void @_ZNSt9basic_iosIcSt11char_traitsIcEE5clearESt12_Ios_Iostate(%"class.std::basic_ios"*, i32)

declare i32 @llvm.eh.typeid.for(i8*) nounwind readnone

declare void @_ZN5boost10filesystem6detail6statusERKNS0_4pathEPNS_6system10error_codeE(%"class.boost::filesystem::file_status"* sret, %"class.boost::filesystem::path"*, %"class.boost::system::error_code"*)

declare void @_ZN5boost10filesystem6detail14symlink_statusERKNS0_4pathEPNS_6system10error_codeE(%"class.boost::filesystem::file_status"* sret, %"class.boost::filesystem::path"*, %"class.boost::system::error_code"*)

declare %"class.std::basic_ostream"* @_ZNSolsEi(%"class.std::basic_ostream"*, i32)

declare %"class.std::basic_ostream"* @_ZNSo3putEc(%"class.std::basic_ostream"*, i8 signext)

declare void @_ZNKSt5ctypeIcE13_M_widen_initEv(%"class.std::ctype"*)

declare void @_ZSt16__throw_bad_castv() noreturn

declare %"class.std::basic_ostream"* @_ZNSo5flushEv(%"class.std::basic_ostream"*)

define internal void @_GLOBAL__I_a() section ".text.startup" {
entry:
  tail call void @_ZNSt8ios_base4InitC1Ev(%"class.std::ios_base::Init"* @_ZStL8__ioinit)
  %0 = tail call i32 @__cxa_atexit(void (i8*)* bitcast (void (%"class.std::ios_base::Init"*)* @_ZNSt8ios_base4InitD1Ev to void (i8*)*), i8* getelementptr inbounds (%"class.std::ios_base::Init"* @_ZStL8__ioinit, i32 0, i32 0), i8* @__dso_handle) nounwind
  %call.i = tail call %"class.boost::system::error_category"* @_ZN5boost6system16generic_categoryEv()
  store %"class.boost::system::error_category"* %call.i, %"class.boost::system::error_category"** @_ZN5boost6systemL14posix_categoryE, align 4
  %call.i1 = tail call %"class.boost::system::error_category"* @_ZN5boost6system16generic_categoryEv()
  store %"class.boost::system::error_category"* %call.i1, %"class.boost::system::error_category"** @_ZN5boost6systemL10errno_ecatE, align 4
  %call.i2 = tail call %"class.boost::system::error_category"* @_ZN5boost6system15system_categoryEv()
  store %"class.boost::system::error_category"* %call.i2, %"class.boost::system::error_category"** @_ZN5boost6systemL11native_ecatE, align 4
  store i8* bitcast (i32* getelementptr inbounds ([0 x i32]* @_ZNSs4_Rep20_S_empty_rep_storageE, i32 0, i32 3) to i8*), i8** getelementptr inbounds (%"class.boost::filesystem::path"* @_ZN12_GLOBAL__N_11pE, i32 0, i32 0, i32 0, i32 0), align 4, !tbaa !0
  %1 = tail call i32 @__cxa_atexit(void (i8*)* bitcast (void (%"class.boost::filesystem::path"*)* @_ZN5boost10filesystem4pathD1Ev to void (i8*)*), i8* bitcast (%"class.boost::filesystem::path"* @_ZN12_GLOBAL__N_11pE to i8*), i8* @__dso_handle) nounwind
  ret void
}

declare void @llvm.lifetime.start(i64, i8* nocapture) nounwind

declare void @llvm.lifetime.end(i64, i8* nocapture) nounwind

!0 = metadata !{metadata !"any pointer", metadata !1}
!1 = metadata !{metadata !"omnipotent char", metadata !2}
!2 = metadata !{metadata !"Simple C/C++ TBAA"}
!3 = metadata !{metadata !"branch_weights", i32 64, i32 4}
!4 = metadata !{metadata !"int", metadata !1}
!5 = metadata !{metadata !"vtable pointer", metadata !2}
!6 = metadata !{metadata !"_ZTSN5boost10filesystem9file_typeE", metadata !1}
!7 = metadata !{metadata !"_ZTSSt12_Ios_Iostate", metadata !1}
