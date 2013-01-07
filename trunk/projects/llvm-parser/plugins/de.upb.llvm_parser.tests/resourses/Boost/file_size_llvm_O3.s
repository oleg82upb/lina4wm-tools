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
%"class.std::allocator" = type { i8 }
%"class.boost::filesystem::file_status" = type { i32, i32 }
%"class.boost::filesystem::path" = type { %"class.std::basic_string" }
%"class.std::basic_string" = type { %"struct.std::basic_string<char, std::char_traits<char>, std::allocator<char> >::_Alloc_hider" }
%"struct.std::basic_string<char, std::char_traits<char>, std::allocator<char> >::_Alloc_hider" = type { i8* }
%"class.std::codecvt" = type { %"class.std::__codecvt_abstract_base", %struct.__locale_struct* }
%"class.std::__codecvt_abstract_base" = type { %"class.std::locale::facet" }
%"struct.std::basic_string<char, std::char_traits<char>, std::allocator<char> >::_Rep" = type { %"struct.std::basic_string<char, std::char_traits<char>, std::allocator<char> >::_Rep_base" }
%"struct.std::basic_string<char, std::char_traits<char>, std::allocator<char> >::_Rep_base" = type { i32, i32, i32 }
%"class.boost::system::error_code" = type { i32, %"class.boost::system::error_category"* }

@_ZStL8__ioinit = internal global %"class.std::ios_base::Init" zeroinitializer, align 1
@__dso_handle = external global i8
@_ZN5boost6systemL14posix_categoryE = internal unnamed_addr global %"class.boost::system::error_category"* null, align 4
@_ZN5boost6systemL10errno_ecatE = internal unnamed_addr global %"class.boost::system::error_category"* null, align 4
@_ZN5boost6systemL11native_ecatE = internal unnamed_addr global %"class.boost::system::error_category"* null, align 4
@_ZSt4cout = external global %"class.std::basic_ostream"
@.str4 = private unnamed_addr constant [23 x i8] c"Usage: file_size path\0A\00", align 1
@.str5 = private unnamed_addr constant [21 x i8] c"sizeof(intmax_t) is \00", align 1
@.str6 = private unnamed_addr constant [12 x i8] c"not found: \00", align 1
@.str7 = private unnamed_addr constant [21 x i8] c"not a regular file: \00", align 1
@.str8 = private unnamed_addr constant [9 x i8] c"size of \00", align 1
@.str9 = private unnamed_addr constant [5 x i8] c" is \00", align 1
@.str10 = private unnamed_addr constant [6 x i8] c"c_str\00", align 1
@.str11 = private unnamed_addr constant [59 x i8] c"/home/thomas/boost_1_52_0/boost/filesystem/path_traits.hpp\00", align 1
@__PRETTY_FUNCTION__._ZN5boost10filesystem11path_traits8dispatchIcSsEEvRKPT_RT0_RKSt7codecvtIwc11__mbstate_tE = private unnamed_addr constant [125 x i8] c"void boost::filesystem::path_traits::dispatch(T *const &, U &, const codecvt_type &) [T = char, U = std::basic_string<char>]\00", align 1
@_ZNSs4_Rep20_S_empty_rep_storageE = external global [0 x i32]
@llvm.global_ctors = appending global [1 x { i32, void ()* }] [{ i32, void ()* } { i32 65535, void ()* @_GLOBAL__I_a }]

declare void @_ZNSt8ios_base4InitC1Ev(%"class.std::ios_base::Init"*)

declare void @_ZNSt8ios_base4InitD1Ev(%"class.std::ios_base::Init"*)

declare i32 @__cxa_atexit(void (i8*)*, i8*, i8*) nounwind

declare %"class.boost::system::error_category"* @_ZN5boost6system16generic_categoryEv()

declare %"class.boost::system::error_category"* @_ZN5boost6system15system_categoryEv()

declare i32 @__gxx_personality_v0(...)

define i32 @main(i32 %argc, i8** nocapture %argv) {
entry:
  %ref.tmp.i.i.i.i164 = alloca %"class.std::allocator", align 1
  %agg.tmp.i80 = alloca %"class.boost::filesystem::file_status", align 4
  %ref.tmp.i.i.i.i67 = alloca %"class.std::allocator", align 1
  %agg.tmp.i = alloca %"class.boost::filesystem::file_status", align 4
  %ref.tmp.i.i.i.i = alloca %"class.std::allocator", align 1
  %__c.addr.i = alloca i8, align 1
  %p = alloca %"class.boost::filesystem::path", align 4
  %cmp = icmp eq i32 %argc, 2
  br i1 %cmp, label %if.end, label %if.then

if.then:                                          ; preds = %entry
  %call1.i = call %"class.std::basic_ostream"* @_ZSt16__ostream_insertIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_PKS3_i(%"class.std::basic_ostream"* @_ZSt4cout, i8* getelementptr inbounds ([23 x i8]* @.str4, i32 0, i32 0), i32 22)
  br label %return

if.end:                                           ; preds = %entry
  %call1.i44 = call %"class.std::basic_ostream"* @_ZSt16__ostream_insertIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_PKS3_i(%"class.std::basic_ostream"* @_ZSt4cout, i8* getelementptr inbounds ([21 x i8]* @.str5, i32 0, i32 0), i32 20)
  %call.i = call %"class.std::basic_ostream"* @_ZNSo9_M_insertImEERSoT_(%"class.std::basic_ostream"* @_ZSt4cout, i32 8)
  call void @llvm.lifetime.start(i64 1, i8* %__c.addr.i)
  store i8 10, i8* %__c.addr.i, align 1, !tbaa !0
  %call.i45 = call %"class.std::basic_ostream"* @_ZSt16__ostream_insertIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_PKS3_i(%"class.std::basic_ostream"* %call.i, i8* %__c.addr.i, i32 1)
  call void @llvm.lifetime.end(i64 1, i8* %__c.addr.i)
  %arrayidx = getelementptr inbounds i8** %argv, i32 1
  %m_pathname.i.i = getelementptr inbounds %"class.boost::filesystem::path"* %p, i32 0, i32 0
  %_M_p.i.i.i.i.i.i = getelementptr inbounds %"class.boost::filesystem::path"* %p, i32 0, i32 0, i32 0, i32 0
  store i8* bitcast (i32* getelementptr inbounds ([0 x i32]* @_ZNSs4_Rep20_S_empty_rep_storageE, i32 0, i32 3) to i8*), i8** %_M_p.i.i.i.i.i.i, align 4, !tbaa !2
  %call.i.i46 = invoke %"class.std::codecvt"* @_ZN5boost10filesystem4path7codecvtEv()
          to label %invoke.cont.i.i unwind label %lpad.i.i

invoke.cont.i.i:                                  ; preds = %if.end
  %0 = load i8** %arrayidx, align 4, !tbaa !2
  %tobool.i.i.i = icmp eq i8* %0, null
  br i1 %tobool.i.i.i, label %cond.false.i.i.i, label %_ZN5boost10filesystem11path_traits7convertEPKcRSsRKSt7codecvtIwc11__mbstate_tE.exit.i.i.i

cond.false.i.i.i:                                 ; preds = %invoke.cont.i.i
  call void @__assert_fail(i8* getelementptr inbounds ([6 x i8]* @.str10, i32 0, i32 0), i8* getelementptr inbounds ([59 x i8]* @.str11, i32 0, i32 0), i32 214, i8* getelementptr inbounds ([125 x i8]* @__PRETTY_FUNCTION__._ZN5boost10filesystem11path_traits8dispatchIcSsEEvRKPT_RT0_RKSt7codecvtIwc11__mbstate_tE, i32 0, i32 0)) noreturn nounwind
  unreachable

_ZN5boost10filesystem11path_traits7convertEPKcRSsRKSt7codecvtIwc11__mbstate_tE.exit.i.i.i: ; preds = %invoke.cont.i.i
  %call.i.i.i.i.i.i.i = call i32 @strlen(i8* %0) nounwind
  %call2.i.i.i.i7.i.i = invoke %"class.std::basic_string"* @_ZNSs6appendEPKcj(%"class.std::basic_string"* %m_pathname.i.i, i8* %0, i32 %call.i.i.i.i.i.i.i)
          to label %_ZN5boost10filesystem4pathC1IPcEERKT_PNS_9enable_ifINS0_11path_traits11is_pathableINS_5decayIS4_E4typeEEEvE4typeE.exit unwind label %lpad.i.i

lpad.i.i:                                         ; preds = %_ZN5boost10filesystem11path_traits7convertEPKcRSsRKSt7codecvtIwc11__mbstate_tE.exit.i.i.i, %if.end
  %1 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %2 = getelementptr inbounds %"class.std::allocator"* %ref.tmp.i.i.i.i, i32 0, i32 0
  call void @llvm.lifetime.start(i64 1, i8* %2) nounwind
  %3 = load i8** %_M_p.i.i.i.i.i.i, align 4, !tbaa !2
  %arrayidx.i.i.i.i.i = getelementptr inbounds i8* %3, i32 -12
  %4 = bitcast i8* %arrayidx.i.i.i.i.i to %"struct.std::basic_string<char, std::char_traits<char>, std::allocator<char> >::_Rep"*
  %cmp.i.i.i.i.i = icmp eq i8* %arrayidx.i.i.i.i.i, bitcast ([0 x i32]* @_ZNSs4_Rep20_S_empty_rep_storageE to i8*)
  br i1 %cmp.i.i.i.i.i, label %eh.resume.i.i, label %if.then.i.i.i.i.i, !prof !3

if.then.i.i.i.i.i:                                ; preds = %lpad.i.i
  %_M_refcount.i.i.i.i.i = getelementptr inbounds i8* %3, i32 -4
  %5 = bitcast i8* %_M_refcount.i.i.i.i.i to i32*
  br i1 icmp ne (i8* bitcast (i32 (i32)* @pthread_cancel to i8*), i8* null), label %if.then.i.i.i.i.i.i, label %if.else.i.i.i.i.i.i

if.then.i.i.i.i.i.i:                              ; preds = %if.then.i.i.i.i.i
  %6 = atomicrmw add i32* %5, i32 -1 seq_cst
  br label %_ZN9__gnu_cxxL27__exchange_and_add_dispatchEPii.exit.i.i.i.i.i

if.else.i.i.i.i.i.i:                              ; preds = %if.then.i.i.i.i.i
  %7 = load i32* %5, align 4, !tbaa !4
  %add.i.i.i.i.i.i.i = add nsw i32 %7, -1
  store i32 %add.i.i.i.i.i.i.i, i32* %5, align 4, !tbaa !4
  br label %_ZN9__gnu_cxxL27__exchange_and_add_dispatchEPii.exit.i.i.i.i.i

_ZN9__gnu_cxxL27__exchange_and_add_dispatchEPii.exit.i.i.i.i.i: ; preds = %if.else.i.i.i.i.i.i, %if.then.i.i.i.i.i.i
  %retval.0.i.i.i.i.i.i = phi i32 [ %6, %if.then.i.i.i.i.i.i ], [ %7, %if.else.i.i.i.i.i.i ]
  %cmp3.i.i.i.i.i = icmp slt i32 %retval.0.i.i.i.i.i.i, 1
  br i1 %cmp3.i.i.i.i.i, label %if.then4.i.i.i.i.i, label %eh.resume.i.i

if.then4.i.i.i.i.i:                               ; preds = %_ZN9__gnu_cxxL27__exchange_and_add_dispatchEPii.exit.i.i.i.i.i
  call void @_ZNSs4_Rep10_M_destroyERKSaIcE(%"struct.std::basic_string<char, std::char_traits<char>, std::allocator<char> >::_Rep"* %4, %"class.std::allocator"* %ref.tmp.i.i.i.i) nounwind
  br label %eh.resume.i.i

eh.resume.i.i:                                    ; preds = %if.then4.i.i.i.i.i, %_ZN9__gnu_cxxL27__exchange_and_add_dispatchEPii.exit.i.i.i.i.i, %lpad.i.i
  call void @llvm.lifetime.end(i64 1, i8* %2) nounwind
  resume { i8*, i32 } %1

_ZN5boost10filesystem4pathC1IPcEERKT_PNS_9enable_ifINS0_11path_traits11is_pathableINS_5decayIS4_E4typeEEEvE4typeE.exit: ; preds = %_ZN5boost10filesystem11path_traits7convertEPKcRSsRKSt7codecvtIwc11__mbstate_tE.exit.i.i.i
  %8 = bitcast %"class.boost::filesystem::file_status"* %agg.tmp.i to i8*
  call void @llvm.lifetime.start(i64 8, i8* %8)
  invoke void @_ZN5boost10filesystem6detail6statusERKNS0_4pathEPNS_6system10error_codeE(%"class.boost::filesystem::file_status"* sret %agg.tmp.i, %"class.boost::filesystem::path"* %p, %"class.boost::system::error_code"* null)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %_ZN5boost10filesystem4pathC1IPcEERKT_PNS_9enable_ifINS0_11path_traits11is_pathableINS_5decayIS4_E4typeEEEvE4typeE.exit
  %m_value.i.i.i = getelementptr inbounds %"class.boost::filesystem::file_status"* %agg.tmp.i, i32 0, i32 0
  %9 = load i32* %m_value.i.i.i, align 4, !tbaa !5
  %10 = icmp ugt i32 %9, 1
  call void @llvm.lifetime.end(i64 8, i8* %8)
  br i1 %10, label %if.end13, label %if.then5

if.then5:                                         ; preds = %invoke.cont
  %call1.i4849 = invoke %"class.std::basic_ostream"* @_ZSt16__ostream_insertIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_PKS3_i(%"class.std::basic_ostream"* @_ZSt4cout, i8* getelementptr inbounds ([12 x i8]* @.str6, i32 0, i32 0), i32 11)
          to label %invoke.cont6 unwind label %lpad

invoke.cont6:                                     ; preds = %if.then5
  %11 = load i8** %arrayidx, align 4, !tbaa !2
  %tobool.i = icmp eq i8* %11, null
  br i1 %tobool.i, label %if.then.i, label %if.else.i

if.then.i:                                        ; preds = %invoke.cont6
  %vtable.i = load i8** bitcast (%"class.std::basic_ostream"* @_ZSt4cout to i8**), align 4, !tbaa !6
  %vbase.offset.ptr.i = getelementptr i8* %vtable.i, i32 -12
  %12 = bitcast i8* %vbase.offset.ptr.i to i32*
  %vbase.offset.i = load i32* %12, align 4
  %add.ptr.i = getelementptr inbounds i8* bitcast (%"class.std::basic_ostream"* @_ZSt4cout to i8*), i32 %vbase.offset.i
  %13 = bitcast i8* %add.ptr.i to %"class.std::basic_ios"*
  %add.ptr.sum.i = add i32 %vbase.offset.i, 20
  %_M_streambuf_state.i.i.i = getelementptr inbounds i8* bitcast (%"class.std::basic_ostream"* @_ZSt4cout to i8*), i32 %add.ptr.sum.i
  %14 = bitcast i8* %_M_streambuf_state.i.i.i to i32*
  %15 = load i32* %14, align 4, !tbaa !7
  %or.i.i.i = or i32 %15, 1
  invoke void @_ZNSt9basic_iosIcSt11char_traitsIcEE5clearESt12_Ios_Iostate(%"class.std::basic_ios"* %13, i32 %or.i.i.i)
          to label %invoke.cont9 unwind label %lpad

if.else.i:                                        ; preds = %invoke.cont6
  %call.i.i50 = call i32 @strlen(i8* %11) nounwind
  %call1.i5152 = invoke %"class.std::basic_ostream"* @_ZSt16__ostream_insertIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_PKS3_i(%"class.std::basic_ostream"* @_ZSt4cout, i8* %11, i32 %call.i.i50)
          to label %invoke.cont9 unwind label %lpad

invoke.cont9:                                     ; preds = %if.then.i, %if.else.i
  %vtable.i56 = load i8** bitcast (%"class.std::basic_ostream"* @_ZSt4cout to i8**), align 4, !tbaa !6
  %vbase.offset.ptr.i57 = getelementptr i8* %vtable.i56, i32 -12
  %16 = bitcast i8* %vbase.offset.ptr.i57 to i32*
  %vbase.offset.i58 = load i32* %16, align 4
  %add.ptr.i59.sum = add i32 %vbase.offset.i58, 124
  %_M_ctype.i = getelementptr inbounds i8* bitcast (%"class.std::basic_ostream"* @_ZSt4cout to i8*), i32 %add.ptr.i59.sum
  %17 = bitcast i8* %_M_ctype.i to %"class.std::ctype"**
  %18 = load %"class.std::ctype"** %17, align 4, !tbaa !2
  %tobool.i221 = icmp eq %"class.std::ctype"* %18, null
  br i1 %tobool.i221, label %if.then.i222, label %call.i178.noexc

if.then.i222:                                     ; preds = %invoke.cont9
  invoke void @_ZSt16__throw_bad_castv() noreturn
          to label %.noexc224 unwind label %lpad

.noexc224:                                        ; preds = %if.then.i222
  unreachable

call.i178.noexc:                                  ; preds = %invoke.cont9
  %_M_widen_ok.i = getelementptr inbounds %"class.std::ctype"* %18, i32 0, i32 6
  %19 = load i8* %_M_widen_ok.i, align 1, !tbaa !0
  %tobool.i181 = icmp eq i8 %19, 0
  br i1 %tobool.i181, label %if.end.i, label %if.then.i182

if.then.i182:                                     ; preds = %call.i178.noexc
  %arrayidx.i = getelementptr inbounds %"class.std::ctype"* %18, i32 0, i32 7, i32 10
  %20 = load i8* %arrayidx.i, align 1, !tbaa !0
  br label %call.i60.noexc

if.end.i:                                         ; preds = %call.i178.noexc
  invoke void @_ZNKSt5ctypeIcE13_M_widen_initEv(%"class.std::ctype"* %18)
          to label %.noexc185 unwind label %lpad

.noexc185:                                        ; preds = %if.end.i
  %21 = bitcast %"class.std::ctype"* %18 to i8 (%"class.std::ctype"*, i8)***
  %vtable.i183 = load i8 (%"class.std::ctype"*, i8)*** %21, align 4, !tbaa !6
  %vfn.i = getelementptr inbounds i8 (%"class.std::ctype"*, i8)** %vtable.i183, i32 6
  %22 = load i8 (%"class.std::ctype"*, i8)** %vfn.i, align 4
  %call.i184186 = invoke signext i8 %22(%"class.std::ctype"* %18, i8 signext 10)
          to label %call.i60.noexc unwind label %lpad

call.i60.noexc:                                   ; preds = %.noexc185, %if.then.i182
  %retval.0.i = phi i8 [ %20, %if.then.i182 ], [ %call.i184186, %.noexc185 ]
  %call1.i6163 = invoke %"class.std::basic_ostream"* @_ZNSo3putEc(%"class.std::basic_ostream"* @_ZSt4cout, i8 signext %retval.0.i)
          to label %call1.i61.noexc unwind label %lpad

call1.i61.noexc:                                  ; preds = %call.i60.noexc
  %call.i6566 = invoke %"class.std::basic_ostream"* @_ZNSo5flushEv(%"class.std::basic_ostream"* %call1.i6163)
          to label %cleanup unwind label %lpad

lpad:                                             ; preds = %if.then.i231, %if.then.i226, %if.then.i222, %.noexc218, %if.end.i216, %.noexc201, %if.end.i199, %.noexc185, %if.end.i, %call1.i156.noexc, %call.i155.noexc, %invoke.cont32, %invoke.cont30, %invoke.cont28, %if.else.i135, %if.then.i132, %if.end24, %call1.i111.noexc, %call.i110.noexc, %if.else.i99, %if.then.i96, %if.then16, %if.end13, %call1.i61.noexc, %call.i60.noexc, %if.else.i, %if.then.i, %if.then5, %_ZN5boost10filesystem4pathC1IPcEERKT_PNS_9enable_ifINS0_11path_traits11is_pathableINS_5decayIS4_E4typeEEEvE4typeE.exit
  %23 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %24 = getelementptr inbounds %"class.std::allocator"* %ref.tmp.i.i.i.i67, i32 0, i32 0
  call void @llvm.lifetime.start(i64 1, i8* %24) nounwind
  %25 = load i8** %_M_p.i.i.i.i.i.i, align 4, !tbaa !2
  %arrayidx.i.i.i.i.i69 = getelementptr inbounds i8* %25, i32 -12
  %26 = bitcast i8* %arrayidx.i.i.i.i.i69 to %"struct.std::basic_string<char, std::char_traits<char>, std::allocator<char> >::_Rep"*
  %cmp.i.i.i.i.i70 = icmp eq i8* %arrayidx.i.i.i.i.i69, bitcast ([0 x i32]* @_ZNSs4_Rep20_S_empty_rep_storageE to i8*)
  br i1 %cmp.i.i.i.i.i70, label %eh.resume, label %if.then.i.i.i.i.i72, !prof !3

if.then.i.i.i.i.i72:                              ; preds = %lpad
  %_M_refcount.i.i.i.i.i71 = getelementptr inbounds i8* %25, i32 -4
  %27 = bitcast i8* %_M_refcount.i.i.i.i.i71 to i32*
  br i1 icmp ne (i8* bitcast (i32 (i32)* @pthread_cancel to i8*), i8* null), label %if.then.i.i.i.i.i.i73, label %if.else.i.i.i.i.i.i75

if.then.i.i.i.i.i.i73:                            ; preds = %if.then.i.i.i.i.i72
  %28 = atomicrmw add i32* %27, i32 -1 seq_cst
  br label %_ZN9__gnu_cxxL27__exchange_and_add_dispatchEPii.exit.i.i.i.i.i78

if.else.i.i.i.i.i.i75:                            ; preds = %if.then.i.i.i.i.i72
  %29 = load i32* %27, align 4, !tbaa !4
  %add.i.i.i.i.i.i.i74 = add nsw i32 %29, -1
  store i32 %add.i.i.i.i.i.i.i74, i32* %27, align 4, !tbaa !4
  br label %_ZN9__gnu_cxxL27__exchange_and_add_dispatchEPii.exit.i.i.i.i.i78

_ZN9__gnu_cxxL27__exchange_and_add_dispatchEPii.exit.i.i.i.i.i78: ; preds = %if.else.i.i.i.i.i.i75, %if.then.i.i.i.i.i.i73
  %retval.0.i.i.i.i.i.i76 = phi i32 [ %28, %if.then.i.i.i.i.i.i73 ], [ %29, %if.else.i.i.i.i.i.i75 ]
  %cmp3.i.i.i.i.i77 = icmp slt i32 %retval.0.i.i.i.i.i.i76, 1
  br i1 %cmp3.i.i.i.i.i77, label %if.then4.i.i.i.i.i79, label %eh.resume

if.then4.i.i.i.i.i79:                             ; preds = %_ZN9__gnu_cxxL27__exchange_and_add_dispatchEPii.exit.i.i.i.i.i78
  call void @_ZNSs4_Rep10_M_destroyERKSaIcE(%"struct.std::basic_string<char, std::char_traits<char>, std::allocator<char> >::_Rep"* %26, %"class.std::allocator"* %ref.tmp.i.i.i.i67) nounwind
  br label %eh.resume

if.end13:                                         ; preds = %invoke.cont
  %30 = bitcast %"class.boost::filesystem::file_status"* %agg.tmp.i80 to i8*
  call void @llvm.lifetime.start(i64 8, i8* %30)
  invoke void @_ZN5boost10filesystem6detail6statusERKNS0_4pathEPNS_6system10error_codeE(%"class.boost::filesystem::file_status"* sret %agg.tmp.i80, %"class.boost::filesystem::path"* %p, %"class.boost::system::error_code"* null)
          to label %invoke.cont14 unwind label %lpad

invoke.cont14:                                    ; preds = %if.end13
  %m_value.i.i.i81 = getelementptr inbounds %"class.boost::filesystem::file_status"* %agg.tmp.i80, i32 0, i32 0
  %31 = load i32* %m_value.i.i.i81, align 4, !tbaa !5
  %cmp.i.i = icmp eq i32 %31, 2
  call void @llvm.lifetime.end(i64 8, i8* %30)
  br i1 %cmp.i.i, label %if.end24, label %if.then16

if.then16:                                        ; preds = %invoke.cont14
  %call1.i8486 = invoke %"class.std::basic_ostream"* @_ZSt16__ostream_insertIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_PKS3_i(%"class.std::basic_ostream"* @_ZSt4cout, i8* getelementptr inbounds ([21 x i8]* @.str7, i32 0, i32 0), i32 20)
          to label %invoke.cont17 unwind label %lpad

invoke.cont17:                                    ; preds = %if.then16
  %32 = load i8** %arrayidx, align 4, !tbaa !2
  %tobool.i88 = icmp eq i8* %32, null
  br i1 %tobool.i88, label %if.then.i96, label %if.else.i99

if.then.i96:                                      ; preds = %invoke.cont17
  %vtable.i89 = load i8** bitcast (%"class.std::basic_ostream"* @_ZSt4cout to i8**), align 4, !tbaa !6
  %vbase.offset.ptr.i90 = getelementptr i8* %vtable.i89, i32 -12
  %33 = bitcast i8* %vbase.offset.ptr.i90 to i32*
  %vbase.offset.i91 = load i32* %33, align 4
  %add.ptr.i92 = getelementptr inbounds i8* bitcast (%"class.std::basic_ostream"* @_ZSt4cout to i8*), i32 %vbase.offset.i91
  %34 = bitcast i8* %add.ptr.i92 to %"class.std::basic_ios"*
  %add.ptr.sum.i93 = add i32 %vbase.offset.i91, 20
  %_M_streambuf_state.i.i.i94 = getelementptr inbounds i8* bitcast (%"class.std::basic_ostream"* @_ZSt4cout to i8*), i32 %add.ptr.sum.i93
  %35 = bitcast i8* %_M_streambuf_state.i.i.i94 to i32*
  %36 = load i32* %35, align 4, !tbaa !7
  %or.i.i.i95 = or i32 %36, 1
  invoke void @_ZNSt9basic_iosIcSt11char_traitsIcEE5clearESt12_Ios_Iostate(%"class.std::basic_ios"* %34, i32 %or.i.i.i95)
          to label %invoke.cont20 unwind label %lpad

if.else.i99:                                      ; preds = %invoke.cont17
  %call.i.i97 = call i32 @strlen(i8* %32) nounwind
  %call1.i98101 = invoke %"class.std::basic_ostream"* @_ZSt16__ostream_insertIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_PKS3_i(%"class.std::basic_ostream"* @_ZSt4cout, i8* %32, i32 %call.i.i97)
          to label %invoke.cont20 unwind label %lpad

invoke.cont20:                                    ; preds = %if.then.i96, %if.else.i99
  %vtable.i106 = load i8** bitcast (%"class.std::basic_ostream"* @_ZSt4cout to i8**), align 4, !tbaa !6
  %vbase.offset.ptr.i107 = getelementptr i8* %vtable.i106, i32 -12
  %37 = bitcast i8* %vbase.offset.ptr.i107 to i32*
  %vbase.offset.i108 = load i32* %37, align 4
  %add.ptr.i109.sum = add i32 %vbase.offset.i108, 124
  %_M_ctype.i187 = getelementptr inbounds i8* bitcast (%"class.std::basic_ostream"* @_ZSt4cout to i8*), i32 %add.ptr.i109.sum
  %38 = bitcast i8* %_M_ctype.i187 to %"class.std::ctype"**
  %39 = load %"class.std::ctype"** %38, align 4, !tbaa !2
  %tobool.i225 = icmp eq %"class.std::ctype"* %39, null
  br i1 %tobool.i225, label %if.then.i226, label %call.i188.noexc

if.then.i226:                                     ; preds = %invoke.cont20
  invoke void @_ZSt16__throw_bad_castv() noreturn
          to label %.noexc228 unwind label %lpad

.noexc228:                                        ; preds = %if.then.i226
  unreachable

call.i188.noexc:                                  ; preds = %invoke.cont20
  %_M_widen_ok.i192 = getelementptr inbounds %"class.std::ctype"* %39, i32 0, i32 6
  %40 = load i8* %_M_widen_ok.i192, align 1, !tbaa !0
  %tobool.i193 = icmp eq i8 %40, 0
  br i1 %tobool.i193, label %if.end.i199, label %if.then.i195

if.then.i195:                                     ; preds = %call.i188.noexc
  %arrayidx.i194 = getelementptr inbounds %"class.std::ctype"* %39, i32 0, i32 7, i32 10
  %41 = load i8* %arrayidx.i194, align 1, !tbaa !0
  br label %call.i110.noexc

if.end.i199:                                      ; preds = %call.i188.noexc
  invoke void @_ZNKSt5ctypeIcE13_M_widen_initEv(%"class.std::ctype"* %39)
          to label %.noexc201 unwind label %lpad

.noexc201:                                        ; preds = %if.end.i199
  %42 = bitcast %"class.std::ctype"* %39 to i8 (%"class.std::ctype"*, i8)***
  %vtable.i196 = load i8 (%"class.std::ctype"*, i8)*** %42, align 4, !tbaa !6
  %vfn.i197 = getelementptr inbounds i8 (%"class.std::ctype"*, i8)** %vtable.i196, i32 6
  %43 = load i8 (%"class.std::ctype"*, i8)** %vfn.i197, align 4
  %call.i198202 = invoke signext i8 %43(%"class.std::ctype"* %39, i8 signext 10)
          to label %call.i110.noexc unwind label %lpad

call.i110.noexc:                                  ; preds = %.noexc201, %if.then.i195
  %retval.0.i200 = phi i8 [ %41, %if.then.i195 ], [ %call.i198202, %.noexc201 ]
  %call1.i111113 = invoke %"class.std::basic_ostream"* @_ZNSo3putEc(%"class.std::basic_ostream"* @_ZSt4cout, i8 signext %retval.0.i200)
          to label %call1.i111.noexc unwind label %lpad

call1.i111.noexc:                                 ; preds = %call.i110.noexc
  %call.i116117 = invoke %"class.std::basic_ostream"* @_ZNSo5flushEv(%"class.std::basic_ostream"* %call1.i111113)
          to label %cleanup unwind label %lpad

if.end24:                                         ; preds = %invoke.cont14
  %call1.i120122 = invoke %"class.std::basic_ostream"* @_ZSt16__ostream_insertIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_PKS3_i(%"class.std::basic_ostream"* @_ZSt4cout, i8* getelementptr inbounds ([9 x i8]* @.str8, i32 0, i32 0), i32 8)
          to label %invoke.cont25 unwind label %lpad

invoke.cont25:                                    ; preds = %if.end24
  %44 = load i8** %arrayidx, align 4, !tbaa !2
  %tobool.i124 = icmp eq i8* %44, null
  br i1 %tobool.i124, label %if.then.i132, label %if.else.i135

if.then.i132:                                     ; preds = %invoke.cont25
  %vtable.i125 = load i8** bitcast (%"class.std::basic_ostream"* @_ZSt4cout to i8**), align 4, !tbaa !6
  %vbase.offset.ptr.i126 = getelementptr i8* %vtable.i125, i32 -12
  %45 = bitcast i8* %vbase.offset.ptr.i126 to i32*
  %vbase.offset.i127 = load i32* %45, align 4
  %add.ptr.i128 = getelementptr inbounds i8* bitcast (%"class.std::basic_ostream"* @_ZSt4cout to i8*), i32 %vbase.offset.i127
  %46 = bitcast i8* %add.ptr.i128 to %"class.std::basic_ios"*
  %add.ptr.sum.i129 = add i32 %vbase.offset.i127, 20
  %_M_streambuf_state.i.i.i130 = getelementptr inbounds i8* bitcast (%"class.std::basic_ostream"* @_ZSt4cout to i8*), i32 %add.ptr.sum.i129
  %47 = bitcast i8* %_M_streambuf_state.i.i.i130 to i32*
  %48 = load i32* %47, align 4, !tbaa !7
  %or.i.i.i131 = or i32 %48, 1
  invoke void @_ZNSt9basic_iosIcSt11char_traitsIcEE5clearESt12_Ios_Iostate(%"class.std::basic_ios"* %46, i32 %or.i.i.i131)
          to label %invoke.cont28 unwind label %lpad

if.else.i135:                                     ; preds = %invoke.cont25
  %call.i.i133 = call i32 @strlen(i8* %44) nounwind
  %call1.i134137 = invoke %"class.std::basic_ostream"* @_ZSt16__ostream_insertIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_PKS3_i(%"class.std::basic_ostream"* @_ZSt4cout, i8* %44, i32 %call.i.i133)
          to label %invoke.cont28 unwind label %lpad

invoke.cont28:                                    ; preds = %if.then.i132, %if.else.i135
  %call1.i140142 = invoke %"class.std::basic_ostream"* @_ZSt16__ostream_insertIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_PKS3_i(%"class.std::basic_ostream"* @_ZSt4cout, i8* getelementptr inbounds ([5 x i8]* @.str9, i32 0, i32 0), i32 4)
          to label %invoke.cont30 unwind label %lpad

invoke.cont30:                                    ; preds = %invoke.cont28
  %call.i144145 = invoke i64 @_ZN5boost10filesystem6detail9file_sizeERKNS0_4pathEPNS_6system10error_codeE(%"class.boost::filesystem::path"* %p, %"class.boost::system::error_code"* null)
          to label %invoke.cont32 unwind label %lpad

invoke.cont32:                                    ; preds = %invoke.cont30
  %call.i146147 = invoke %"class.std::basic_ostream"* @_ZNSo9_M_insertIyEERSoT_(%"class.std::basic_ostream"* @_ZSt4cout, i64 %call.i144145)
          to label %invoke.cont34 unwind label %lpad

invoke.cont34:                                    ; preds = %invoke.cont32
  %49 = bitcast %"class.std::basic_ostream"* %call.i146147 to i8**
  %vtable.i151 = load i8** %49, align 4, !tbaa !6
  %vbase.offset.ptr.i152 = getelementptr i8* %vtable.i151, i32 -12
  %50 = bitcast i8* %vbase.offset.ptr.i152 to i32*
  %vbase.offset.i153 = load i32* %50, align 4
  %51 = bitcast %"class.std::basic_ostream"* %call.i146147 to i8*
  %add.ptr.i154.sum = add i32 %vbase.offset.i153, 124
  %_M_ctype.i204 = getelementptr inbounds i8* %51, i32 %add.ptr.i154.sum
  %52 = bitcast i8* %_M_ctype.i204 to %"class.std::ctype"**
  %53 = load %"class.std::ctype"** %52, align 4, !tbaa !2
  %tobool.i230 = icmp eq %"class.std::ctype"* %53, null
  br i1 %tobool.i230, label %if.then.i231, label %call.i205.noexc

if.then.i231:                                     ; preds = %invoke.cont34
  invoke void @_ZSt16__throw_bad_castv() noreturn
          to label %.noexc233 unwind label %lpad

.noexc233:                                        ; preds = %if.then.i231
  unreachable

call.i205.noexc:                                  ; preds = %invoke.cont34
  %_M_widen_ok.i209 = getelementptr inbounds %"class.std::ctype"* %53, i32 0, i32 6
  %54 = load i8* %_M_widen_ok.i209, align 1, !tbaa !0
  %tobool.i210 = icmp eq i8 %54, 0
  br i1 %tobool.i210, label %if.end.i216, label %if.then.i212

if.then.i212:                                     ; preds = %call.i205.noexc
  %arrayidx.i211 = getelementptr inbounds %"class.std::ctype"* %53, i32 0, i32 7, i32 10
  %55 = load i8* %arrayidx.i211, align 1, !tbaa !0
  br label %call.i155.noexc

if.end.i216:                                      ; preds = %call.i205.noexc
  invoke void @_ZNKSt5ctypeIcE13_M_widen_initEv(%"class.std::ctype"* %53)
          to label %.noexc218 unwind label %lpad

.noexc218:                                        ; preds = %if.end.i216
  %56 = bitcast %"class.std::ctype"* %53 to i8 (%"class.std::ctype"*, i8)***
  %vtable.i213 = load i8 (%"class.std::ctype"*, i8)*** %56, align 4, !tbaa !6
  %vfn.i214 = getelementptr inbounds i8 (%"class.std::ctype"*, i8)** %vtable.i213, i32 6
  %57 = load i8 (%"class.std::ctype"*, i8)** %vfn.i214, align 4
  %call.i215219 = invoke signext i8 %57(%"class.std::ctype"* %53, i8 signext 10)
          to label %call.i155.noexc unwind label %lpad

call.i155.noexc:                                  ; preds = %.noexc218, %if.then.i212
  %retval.0.i217 = phi i8 [ %55, %if.then.i212 ], [ %call.i215219, %.noexc218 ]
  %call1.i156158 = invoke %"class.std::basic_ostream"* @_ZNSo3putEc(%"class.std::basic_ostream"* %call.i146147, i8 signext %retval.0.i217)
          to label %call1.i156.noexc unwind label %lpad

call1.i156.noexc:                                 ; preds = %call.i155.noexc
  %call.i161162 = invoke %"class.std::basic_ostream"* @_ZNSo5flushEv(%"class.std::basic_ostream"* %call1.i156158)
          to label %cleanup unwind label %lpad

cleanup:                                          ; preds = %call1.i156.noexc, %call1.i111.noexc, %call1.i61.noexc
  %retval.0 = phi i32 [ 1, %call1.i61.noexc ], [ 1, %call1.i111.noexc ], [ 0, %call1.i156.noexc ]
  %58 = getelementptr inbounds %"class.std::allocator"* %ref.tmp.i.i.i.i164, i32 0, i32 0
  call void @llvm.lifetime.start(i64 1, i8* %58) nounwind
  %59 = load i8** %_M_p.i.i.i.i.i.i, align 4, !tbaa !2
  %arrayidx.i.i.i.i.i166 = getelementptr inbounds i8* %59, i32 -12
  %60 = bitcast i8* %arrayidx.i.i.i.i.i166 to %"struct.std::basic_string<char, std::char_traits<char>, std::allocator<char> >::_Rep"*
  %cmp.i.i.i.i.i167 = icmp eq i8* %arrayidx.i.i.i.i.i166, bitcast ([0 x i32]* @_ZNSs4_Rep20_S_empty_rep_storageE to i8*)
  br i1 %cmp.i.i.i.i.i167, label %return, label %if.then.i.i.i.i.i169, !prof !3

if.then.i.i.i.i.i169:                             ; preds = %cleanup
  %_M_refcount.i.i.i.i.i168 = getelementptr inbounds i8* %59, i32 -4
  %61 = bitcast i8* %_M_refcount.i.i.i.i.i168 to i32*
  br i1 icmp ne (i8* bitcast (i32 (i32)* @pthread_cancel to i8*), i8* null), label %if.then.i.i.i.i.i.i170, label %if.else.i.i.i.i.i.i172

if.then.i.i.i.i.i.i170:                           ; preds = %if.then.i.i.i.i.i169
  %62 = atomicrmw add i32* %61, i32 -1 seq_cst
  br label %_ZN9__gnu_cxxL27__exchange_and_add_dispatchEPii.exit.i.i.i.i.i175

if.else.i.i.i.i.i.i172:                           ; preds = %if.then.i.i.i.i.i169
  %63 = load i32* %61, align 4, !tbaa !4
  %add.i.i.i.i.i.i.i171 = add nsw i32 %63, -1
  store i32 %add.i.i.i.i.i.i.i171, i32* %61, align 4, !tbaa !4
  br label %_ZN9__gnu_cxxL27__exchange_and_add_dispatchEPii.exit.i.i.i.i.i175

_ZN9__gnu_cxxL27__exchange_and_add_dispatchEPii.exit.i.i.i.i.i175: ; preds = %if.else.i.i.i.i.i.i172, %if.then.i.i.i.i.i.i170
  %retval.0.i.i.i.i.i.i173 = phi i32 [ %62, %if.then.i.i.i.i.i.i170 ], [ %63, %if.else.i.i.i.i.i.i172 ]
  %cmp3.i.i.i.i.i174 = icmp slt i32 %retval.0.i.i.i.i.i.i173, 1
  br i1 %cmp3.i.i.i.i.i174, label %if.then4.i.i.i.i.i176, label %return

if.then4.i.i.i.i.i176:                            ; preds = %_ZN9__gnu_cxxL27__exchange_and_add_dispatchEPii.exit.i.i.i.i.i175
  call void @_ZNSs4_Rep10_M_destroyERKSaIcE(%"struct.std::basic_string<char, std::char_traits<char>, std::allocator<char> >::_Rep"* %60, %"class.std::allocator"* %ref.tmp.i.i.i.i164) nounwind
  br label %return

return:                                           ; preds = %if.then4.i.i.i.i.i176, %_ZN9__gnu_cxxL27__exchange_and_add_dispatchEPii.exit.i.i.i.i.i175, %cleanup, %if.then
  %retval.1 = phi i32 [ 1, %if.then ], [ %retval.0, %cleanup ], [ %retval.0, %_ZN9__gnu_cxxL27__exchange_and_add_dispatchEPii.exit.i.i.i.i.i175 ], [ %retval.0, %if.then4.i.i.i.i.i176 ]
  ret i32 %retval.1

eh.resume:                                        ; preds = %if.then4.i.i.i.i.i79, %_ZN9__gnu_cxxL27__exchange_and_add_dispatchEPii.exit.i.i.i.i.i78, %lpad
  call void @llvm.lifetime.end(i64 1, i8* %24) nounwind
  resume { i8*, i32 } %23
}

declare %"class.std::basic_ostream"* @_ZNSo9_M_insertIyEERSoT_(%"class.std::basic_ostream"*, i64)

declare %"class.std::codecvt"* @_ZN5boost10filesystem4path7codecvtEv()

declare void @__assert_fail(i8*, i8*, i32, i8*) noreturn nounwind

declare %"class.std::basic_ostream"* @_ZNSo9_M_insertImEERSoT_(%"class.std::basic_ostream"*, i32)

declare i32 @strlen(i8* nocapture) nounwind readonly

declare %"class.std::basic_string"* @_ZNSs6appendEPKcj(%"class.std::basic_string"*, i8*, i32)

declare void @_ZNSs4_Rep10_M_destroyERKSaIcE(%"struct.std::basic_string<char, std::char_traits<char>, std::allocator<char> >::_Rep"*, %"class.std::allocator"*) nounwind

declare extern_weak i32 @pthread_cancel(i32)

declare %"class.std::basic_ostream"* @_ZNSo3putEc(%"class.std::basic_ostream"*, i8 signext)

declare void @_ZNKSt5ctypeIcE13_M_widen_initEv(%"class.std::ctype"*)

declare void @_ZSt16__throw_bad_castv() noreturn

declare %"class.std::basic_ostream"* @_ZNSo5flushEv(%"class.std::basic_ostream"*)

declare %"class.std::basic_ostream"* @_ZSt16__ostream_insertIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_PKS3_i(%"class.std::basic_ostream"*, i8*, i32)

declare void @_ZNSt9basic_iosIcSt11char_traitsIcEE5clearESt12_Ios_Iostate(%"class.std::basic_ios"*, i32)

declare i64 @_ZN5boost10filesystem6detail9file_sizeERKNS0_4pathEPNS_6system10error_codeE(%"class.boost::filesystem::path"*, %"class.boost::system::error_code"*)

declare void @_ZN5boost10filesystem6detail6statusERKNS0_4pathEPNS_6system10error_codeE(%"class.boost::filesystem::file_status"* sret, %"class.boost::filesystem::path"*, %"class.boost::system::error_code"*)

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
  ret void
}

declare void @llvm.lifetime.start(i64, i8* nocapture) nounwind

declare void @llvm.lifetime.end(i64, i8* nocapture) nounwind

!0 = metadata !{metadata !"omnipotent char", metadata !1}
!1 = metadata !{metadata !"Simple C/C++ TBAA"}
!2 = metadata !{metadata !"any pointer", metadata !0}
!3 = metadata !{metadata !"branch_weights", i32 64, i32 4}
!4 = metadata !{metadata !"int", metadata !0}
!5 = metadata !{metadata !"_ZTSN5boost10filesystem9file_typeE", metadata !0}
!6 = metadata !{metadata !"vtable pointer", metadata !1}
!7 = metadata !{metadata !"_ZTSSt12_Ios_Iostate", metadata !0}
