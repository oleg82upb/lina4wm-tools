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
%"struct.std::basic_string<char, std::char_traits<char>, std::allocator<char> >::_Rep" = type { %"struct.std::basic_string<char, std::char_traits<char>, std::allocator<char> >::_Rep_base" }
%"struct.std::basic_string<char, std::char_traits<char>, std::allocator<char> >::_Rep_base" = type { i32, i32, i32 }
%"class.boost::algorithm::boyer_moore_horspool" = type { %"class.__gnu_cxx::__normal_iterator", %"class.__gnu_cxx::__normal_iterator", i32, %"class.boost::algorithm::detail::skip_table" }
%"class.__gnu_cxx::__normal_iterator" = type { i8* }
%"class.boost::algorithm::detail::skip_table" = type { %"class.boost::array", i32 }
%"class.boost::array" = type { [256 x i32] }
%"class.boost::algorithm::boyer_moore" = type { %"class.__gnu_cxx::__normal_iterator", %"class.__gnu_cxx::__normal_iterator", i32, %"class.boost::algorithm::detail::skip_table", %"class.std::vector" }
%"class.std::vector" = type { %"struct.std::_Vector_base" }
%"struct.std::_Vector_base" = type { %"struct.std::_Vector_base<int, std::allocator<int> >::_Vector_impl" }
%"struct.std::_Vector_base<int, std::allocator<int> >::_Vector_impl" = type { i32*, i32*, i32* }
%"class.boost::algorithm::knuth_morris_pratt" = type { %"class.__gnu_cxx::__normal_iterator", %"class.__gnu_cxx::__normal_iterator", i32, %"class.std::vector" }
%"class.__gnu_cxx::__normal_iterator.5" = type { i8* }

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
@.str20 = private unnamed_addr constant [10 x i8] c"count > 0\00", align 1
@.str21 = private unnamed_addr constant [68 x i8] c"/home/thomas/boost_1_52_0/boost/algorithm/searching/boyer_moore.hpp\00", align 1
@__PRETTY_FUNCTION__._ZN5boost9algorithm11boyer_mooreIN9__gnu_cxx17__normal_iteratorIPKcSsEENS0_6detail9BM_traitsIS6_EEE17compute_bm_prefixINS3_IPcSt6vectorIcSaIcEEEESD_IiSaIiEEEEvT_SJ_RT0_ = private unnamed_addr constant [596 x i8] c"void boost::algorithm::boyer_moore<__gnu_cxx::__normal_iterator<const char *, std::basic_string<char> >, boost::algorithm::detail::BM_traits<__gnu_cxx::__normal_iterator<const char *, std::basic_string<char> > > >::compute_bm_prefix(Iter, Iter, Container &) [patIter = __gnu_cxx::__normal_iterator<const char *, std::basic_string<char> >, traits = boost::algorithm::detail::BM_traits<__gnu_cxx::__normal_iterator<const char *, std::basic_string<char> > >, Iter = __gnu_cxx::__normal_iterator<char *, std::vector<char, std::allocator<char> > >, Container = std::vector<int, std::allocator<int> >]\00", align 1
@.str22 = private unnamed_addr constant [24 x i8] c"prefix.size () == count\00", align 1
@.str23 = private unnamed_addr constant [10 x i8] c"k < count\00", align 1
@__PRETTY_FUNCTION__._ZN5boost9algorithm11boyer_mooreIN9__gnu_cxx17__normal_iteratorIPKcSsEENS0_6detail9BM_traitsIS6_EEE17compute_bm_prefixIS6_St6vectorIiSaIiEEEEvT_SF_RT0_ = private unnamed_addr constant [585 x i8] c"void boost::algorithm::boyer_moore<__gnu_cxx::__normal_iterator<const char *, std::basic_string<char> >, boost::algorithm::detail::BM_traits<__gnu_cxx::__normal_iterator<const char *, std::basic_string<char> > > >::compute_bm_prefix(Iter, Iter, Container &) [patIter = __gnu_cxx::__normal_iterator<const char *, std::basic_string<char> >, traits = boost::algorithm::detail::BM_traits<__gnu_cxx::__normal_iterator<const char *, std::basic_string<char> > >, Iter = __gnu_cxx::__normal_iterator<const char *, std::basic_string<char> >, Container = std::vector<int, std::allocator<int> >]\00", align 1
@_ZNSs4_Rep20_S_empty_rep_storageE = external global [0 x i32]
@llvm.global_ctors = appending global [1 x { i32, void ()* }] [{ i32, void ()* } { i32 65535, void ()* @_GLOBAL__I_a }]

declare void @_ZNSt8ios_base4InitC1Ev(%"class.std::ios_base::Init"*)

declare void @_ZNSt8ios_base4InitD1Ev(%"class.std::ios_base::Init"*)

declare i32 @__cxa_atexit(void (i8*)*, i8*, i8*) nounwind

declare void @_ZNSsC1EPKcRKSaIcE(%"class.std::basic_string"*, i8*, %"class.std::allocator"*)

declare i32 @__gxx_personality_v0(...)

define available_externally void @_ZNSsD1Ev(%"class.std::basic_string"* nocapture %this) unnamed_addr align 2 {
entry:
  %ref.tmp.i = alloca %"class.std::allocator", align 1
  %0 = getelementptr inbounds %"class.std::allocator"* %ref.tmp.i, i32 0, i32 0
  call void @llvm.lifetime.start(i64 1, i8* %0)
  %_M_p.i.i.i = getelementptr inbounds %"class.std::basic_string"* %this, i32 0, i32 0, i32 0
  %1 = load i8** %_M_p.i.i.i, align 4, !tbaa !0
  %arrayidx.i.i = getelementptr inbounds i8* %1, i32 -12
  %2 = bitcast i8* %arrayidx.i.i to %"struct.std::basic_string<char, std::char_traits<char>, std::allocator<char> >::_Rep"*
  %cmp.i.i = icmp eq i8* %arrayidx.i.i, bitcast ([0 x i32]* @_ZNSs4_Rep20_S_empty_rep_storageE to i8*)
  br i1 %cmp.i.i, label %_ZNSsD2Ev.exit, label %if.then.i.i, !prof !3

if.then.i.i:                                      ; preds = %entry
  %_M_refcount.i.i = getelementptr inbounds i8* %1, i32 -4
  %3 = bitcast i8* %_M_refcount.i.i to i32*
  br i1 icmp ne (i8* bitcast (i32 (i32)* @pthread_cancel to i8*), i8* null), label %if.then.i.i.i, label %if.else.i.i.i

if.then.i.i.i:                                    ; preds = %if.then.i.i
  %4 = atomicrmw add i32* %3, i32 -1 seq_cst
  br label %_ZN9__gnu_cxxL27__exchange_and_add_dispatchEPii.exit.i.i

if.else.i.i.i:                                    ; preds = %if.then.i.i
  %5 = load i32* %3, align 4, !tbaa !4
  %add.i.i.i.i = add nsw i32 %5, -1
  store i32 %add.i.i.i.i, i32* %3, align 4, !tbaa !4
  br label %_ZN9__gnu_cxxL27__exchange_and_add_dispatchEPii.exit.i.i

_ZN9__gnu_cxxL27__exchange_and_add_dispatchEPii.exit.i.i: ; preds = %if.else.i.i.i, %if.then.i.i.i
  %retval.0.i.i.i = phi i32 [ %4, %if.then.i.i.i ], [ %5, %if.else.i.i.i ]
  %cmp3.i.i = icmp slt i32 %retval.0.i.i.i, 1
  br i1 %cmp3.i.i, label %if.then4.i.i, label %_ZNSsD2Ev.exit

if.then4.i.i:                                     ; preds = %_ZN9__gnu_cxxL27__exchange_and_add_dispatchEPii.exit.i.i
  call void @_ZNSs4_Rep10_M_destroyERKSaIcE(%"struct.std::basic_string<char, std::char_traits<char>, std::allocator<char> >::_Rep"* %2, %"class.std::allocator"* %ref.tmp.i) nounwind
  br label %_ZNSsD2Ev.exit

_ZNSsD2Ev.exit:                                   ; preds = %entry, %_ZN9__gnu_cxxL27__exchange_and_add_dispatchEPii.exit.i.i, %if.then4.i.i
  call void @llvm.lifetime.end(i64 1, i8* %0)
  ret void
}

define i32 @main(i32, i8** nocapture) {
entry:
  %bmh.i = alloca %"class.boost::algorithm::boyer_moore_horspool", align 4
  %agg.tmp19248 = alloca %"class.__gnu_cxx::__normal_iterator", align 8
  %agg.tmp18245 = alloca %"class.__gnu_cxx::__normal_iterator", align 8
  %agg.tmp18.i = alloca %"class.__gnu_cxx::__normal_iterator", align 8
  %agg.tmp6.i = alloca %"class.__gnu_cxx::__normal_iterator", align 8
  %bm.i = alloca %"class.boost::algorithm::boyer_moore", align 4
  %search1 = alloca %"class.boost::algorithm::boyer_moore", align 4
  %ref.tmp97 = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %agg.tmp98 = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %agg.tmp100 = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %agg.tmp102 = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %agg.tmp104 = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %2 = load i8** getelementptr inbounds (%"class.std::basic_string"* @_ZL8haystack, i32 0, i32 0, i32 0), align 4, !tbaa !0
  %arrayidx.i.i.i = getelementptr inbounds i8* %2, i32 -12
  %_M_length.i.i = bitcast i8* %arrayidx.i.i.i to i32*
  %3 = load i32* %_M_length.i.i, align 4, !tbaa !4
  %add.ptr.i = getelementptr inbounds i8* %2, i32 %3
  %4 = load i8** getelementptr inbounds (%"class.std::basic_string"* @_ZL7needle1, i32 0, i32 0, i32 0), align 4, !tbaa !0
  %arrayidx.i.i.i149 = getelementptr inbounds i8* %4, i32 -12
  %_M_length.i.i150 = bitcast i8* %arrayidx.i.i.i149 to i32*
  %5 = load i32* %_M_length.i.i150, align 4, !tbaa !4
  %add.ptr.i151 = getelementptr inbounds i8* %4, i32 %5
  %6 = bitcast %"class.__gnu_cxx::__normal_iterator"* %agg.tmp18.i to i8*
  call void @llvm.lifetime.start(i64 4, i8* %6)
  %7 = bitcast %"class.__gnu_cxx::__normal_iterator"* %agg.tmp6.i to i8*
  call void @llvm.lifetime.start(i64 4, i8* %7)
  %8 = bitcast %"class.boost::algorithm::boyer_moore"* %bm.i to i8*
  call void @llvm.lifetime.start(i64 1052, i8* %8)
  %agg.tmp.sroa.0.0.tmp.idx.i = getelementptr inbounds %"class.__gnu_cxx::__normal_iterator"* %agg.tmp6.i, i32 0, i32 0
  store i8* %4, i8** %agg.tmp.sroa.0.0.tmp.idx.i, align 8
  %agg.tmp1.sroa.0.0.tmp9.idx.i = getelementptr inbounds %"class.__gnu_cxx::__normal_iterator"* %agg.tmp18.i, i32 0, i32 0
  store i8* %add.ptr.i151, i8** %agg.tmp1.sroa.0.0.tmp9.idx.i, align 8
  call void @_ZN5boost9algorithm11boyer_mooreIN9__gnu_cxx17__normal_iteratorIPKcSsEENS0_6detail9BM_traitsIS6_EEEC2ES6_S6_(%"class.boost::algorithm::boyer_moore"* %bm.i, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %agg.tmp6.i, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %agg.tmp18.i)
  %cmp.i.i = icmp eq i32 %3, 0
  br i1 %cmp.i.i, label %invoke.cont.i, label %if.end.i182

if.end.i182:                                      ; preds = %entry
  %_M_current.i.i18.i = getelementptr inbounds %"class.boost::algorithm::boyer_moore"* %bm.i, i32 0, i32 0, i32 0
  %9 = load i8** %_M_current.i.i18.i, align 4, !tbaa !0
  %_M_current.i2.i19.i = getelementptr inbounds %"class.boost::algorithm::boyer_moore"* %bm.i, i32 0, i32 1, i32 0
  %10 = load i8** %_M_current.i2.i19.i, align 4, !tbaa !0
  %cmp.i20.i = icmp eq i8* %9, %10
  br i1 %cmp.i20.i, label %invoke.cont.i, label %if.end4.i

if.end4.i:                                        ; preds = %if.end.i182
  %k_pattern_length.i = getelementptr inbounds %"class.boost::algorithm::boyer_moore"* %bm.i, i32 0, i32 2
  %11 = load i32* %k_pattern_length.i, align 4, !tbaa !4
  %cmp.i183 = icmp slt i32 %3, %11
  br i1 %cmp.i183, label %invoke.cont.i, label %if.end8.i

if.end8.i:                                        ; preds = %if.end4.i
  %add.ptr.i.sum = sub i32 %3, %11
  %add.ptr.i.i.i = getelementptr inbounds i8* %2, i32 %add.ptr.i.sum
  %cmp.i57.i.i = icmp slt i32 %add.ptr.i.sum, 0
  br i1 %cmp.i57.i.i, label %invoke.cont.i, label %while.body.lr.ph.i.i

while.body.lr.ph.i.i:                             ; preds = %if.end8.i
  %_M_start.i41.i.i = getelementptr inbounds %"class.boost::algorithm::boyer_moore"* %bm.i, i32 0, i32 4, i32 0, i32 0, i32 0
  %12 = load i32** %_M_start.i41.i.i, align 4, !tbaa !0
  br label %while.body.i.i

while.body.i.i:                                   ; preds = %while.end.i.i, %while.body.lr.ph.i.i
  %13 = phi i8* [ %2, %while.body.lr.ph.i.i ], [ %.be.i.i, %while.end.i.i ]
  br label %while.cond3.i.i

while.cond3.i.i:                                  ; preds = %while.body9.i.i, %while.body.i.i
  %j.0.i.i = phi i32 [ %11, %while.body.i.i ], [ %sub.i.i, %while.body9.i.i ]
  %sub.i.i = add nsw i32 %j.0.i.i, -1
  %arrayidx.i47.i.i = getelementptr inbounds i8* %9, i32 %sub.i.i
  %14 = load i8* %arrayidx.i47.i.i, align 1, !tbaa !1
  %arrayidx.i45.i.i = getelementptr inbounds i8* %13, i32 %sub.i.i
  %15 = load i8* %arrayidx.i45.i.i, align 1, !tbaa !1
  %cmp.i17.i = icmp eq i8 %14, %15
  br i1 %cmp.i17.i, label %while.body9.i.i, label %while.end.i.i

while.body9.i.i:                                  ; preds = %while.cond3.i.i
  %cmp10.i.i = icmp eq i32 %sub.i.i, 0
  br i1 %cmp10.i.i, label %invoke.cont.i, label %while.cond3.i.i

while.end.i.i:                                    ; preds = %while.cond3.i.i
  %conv.i.i.i = zext i8 %15 to i32
  %arrayidx.i.i.i.i = getelementptr inbounds %"class.boost::algorithm::boyer_moore"* %bm.i, i32 0, i32 3, i32 0, i32 0, i32 %conv.i.i.i
  %16 = load i32* %arrayidx.i.i.i.i, align 4, !tbaa !4
  %sub15.i.i = sub nsw i32 %j.0.i.i, %16
  %sub16.i.i = add nsw i32 %sub15.i.i, -1
  %cmp17.i.i = icmp slt i32 %16, %j.0.i.i
  %add.ptr.i42.i.i = getelementptr inbounds i32* %12, i32 %j.0.i.i
  %17 = load i32* %add.ptr.i42.i.i, align 4, !tbaa !4
  %cmp19.i.i = icmp sgt i32 %sub16.i.i, %17
  %or.cond.i.i = and i1 %cmp17.i.i, %cmp19.i.i
  %sub16.pn.i.i = select i1 %or.cond.i.i, i32 %sub16.i.i, i32 %17
  %.be.i.i = getelementptr inbounds i8* %13, i32 %sub16.pn.i.i
  %cmp.i.i.i = icmp ugt i8* %.be.i.i, %add.ptr.i.i.i
  br i1 %cmp.i.i.i, label %invoke.cont.i, label %while.body.i.i

invoke.cont.i:                                    ; preds = %while.end.i.i, %while.body9.i.i, %if.end8.i, %if.end4.i, %if.end.i182, %entry
  %ref.tmp.sroa.0.0.load783 = phi i8* [ %2, %entry ], [ %2, %if.end.i182 ], [ %add.ptr.i, %if.end4.i ], [ %add.ptr.i, %if.end8.i ], [ %13, %while.body9.i.i ], [ %add.ptr.i, %while.end.i.i ]
  %_M_start.i.i.i.i.i.i = getelementptr inbounds %"class.boost::algorithm::boyer_moore"* %bm.i, i32 0, i32 4, i32 0, i32 0, i32 0
  %18 = load i32** %_M_start.i.i.i.i.i.i, align 4, !tbaa !0
  %tobool.i.i.i.i.i.i.i = icmp eq i32* %18, null
  br i1 %tobool.i.i.i.i.i.i.i, label %_ZN5boost9algorithm18boyer_moore_searchIN9__gnu_cxx17__normal_iteratorIPKcSsEES6_EET0_S7_S7_T_S8_.exit, label %if.then.i.i.i.i.i.i.i

if.then.i.i.i.i.i.i.i:                            ; preds = %invoke.cont.i
  %19 = bitcast i32* %18 to i8*
  call void @_ZdlPv(i8* %19) nounwind
  br label %_ZN5boost9algorithm18boyer_moore_searchIN9__gnu_cxx17__normal_iteratorIPKcSsEES6_EET0_S7_S7_T_S8_.exit

_ZN5boost9algorithm18boyer_moore_searchIN9__gnu_cxx17__normal_iteratorIPKcSsEES6_EET0_S7_S7_T_S8_.exit: ; preds = %invoke.cont.i, %if.then.i.i.i.i.i.i.i
  call void @llvm.lifetime.end(i64 4, i8* %6)
  call void @llvm.lifetime.end(i64 4, i8* %7)
  call void @llvm.lifetime.end(i64 1052, i8* %8)
  %20 = load i8** getelementptr inbounds (%"class.std::basic_string"* @_ZL8haystack, i32 0, i32 0, i32 0), align 4, !tbaa !0
  %arrayidx.i.i.i170 = getelementptr inbounds i8* %20, i32 -12
  %_M_length.i.i171 = bitcast i8* %arrayidx.i.i.i170 to i32*
  %21 = load i32* %_M_length.i.i171, align 4, !tbaa !4
  %add.ptr.i172 = getelementptr inbounds i8* %20, i32 %21
  %cmp.i = icmp eq i8* %ref.tmp.sroa.0.0.load783, %add.ptr.i172
  br i1 %cmp.i, label %if.else, label %if.then

if.then:                                          ; preds = %_ZN5boost9algorithm18boyer_moore_searchIN9__gnu_cxx17__normal_iteratorIPKcSsEES6_EET0_S7_S7_T_S8_.exit
  %call1.i = call %"class.std::basic_ostream"* @_ZSt16__ostream_insertIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_PKS3_i(%"class.std::basic_ostream"* @_ZSt4cout, i8* getelementptr inbounds ([8 x i8]* @.str6, i32 0, i32 0), i32 7)
  %22 = load i8** getelementptr inbounds (%"class.std::basic_string"* @_ZL7needle1, i32 0, i32 0, i32 0), align 4, !tbaa !0
  %arrayidx.i.i.i185 = getelementptr inbounds i8* %22, i32 -12
  %_M_length.i.i186 = bitcast i8* %arrayidx.i.i.i185 to i32*
  %23 = load i32* %_M_length.i.i186, align 4, !tbaa !4
  %call2.i = call %"class.std::basic_ostream"* @_ZSt16__ostream_insertIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_PKS3_i(%"class.std::basic_ostream"* @_ZSt4cout, i8* %22, i32 %23)
  %call1.i188 = call %"class.std::basic_ostream"* @_ZSt16__ostream_insertIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_PKS3_i(%"class.std::basic_ostream"* %call2.i, i8* getelementptr inbounds ([8 x i8]* @.str7, i32 0, i32 0), i32 7)
  %24 = load i8** getelementptr inbounds (%"class.std::basic_string"* @_ZL8haystack, i32 0, i32 0, i32 0), align 4, !tbaa !0
  %arrayidx.i.i.i190 = getelementptr inbounds i8* %24, i32 -12
  %_M_length.i.i191 = bitcast i8* %arrayidx.i.i.i190 to i32*
  %25 = load i32* %_M_length.i.i191, align 4, !tbaa !4
  %call2.i192 = call %"class.std::basic_ostream"* @_ZSt16__ostream_insertIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_PKS3_i(%"class.std::basic_ostream"* %call2.i, i8* %24, i32 %25)
  %call1.i194 = call %"class.std::basic_ostream"* @_ZSt16__ostream_insertIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_PKS3_i(%"class.std::basic_ostream"* %call2.i192, i8* getelementptr inbounds ([18 x i8]* @.str8, i32 0, i32 0), i32 17)
  %26 = bitcast %"class.std::basic_ostream"* %call2.i192 to i8**
  %vtable.i196 = load i8** %26, align 4, !tbaa !5
  %vbase.offset.ptr.i197 = getelementptr i8* %vtable.i196, i32 -12
  %27 = bitcast i8* %vbase.offset.ptr.i197 to i32*
  %vbase.offset.i198 = load i32* %27, align 4
  %28 = bitcast %"class.std::basic_ostream"* %call2.i192 to i8*
  %add.ptr.i199.sum = add i32 %vbase.offset.i198, 124
  %_M_ctype.i691 = getelementptr inbounds i8* %28, i32 %add.ptr.i199.sum
  %29 = bitcast i8* %_M_ctype.i691 to %"class.std::ctype"**
  %30 = load %"class.std::ctype"** %29, align 4, !tbaa !0
  %tobool.i758 = icmp eq %"class.std::ctype"* %30, null
  br i1 %tobool.i758, label %if.then.i759, label %_ZSt13__check_facetISt5ctypeIcEERKT_PS3_.exit761

if.then.i759:                                     ; preds = %if.then
  call void @_ZSt16__throw_bad_castv() noreturn
  unreachable

_ZSt13__check_facetISt5ctypeIcEERKT_PS3_.exit761: ; preds = %if.then
  %_M_widen_ok.i694 = getelementptr inbounds %"class.std::ctype"* %30, i32 0, i32 6
  %31 = load i8* %_M_widen_ok.i694, align 1, !tbaa !1
  %tobool.i695 = icmp eq i8 %31, 0
  br i1 %tobool.i695, label %if.end.i701, label %if.then.i697

if.then.i697:                                     ; preds = %_ZSt13__check_facetISt5ctypeIcEERKT_PS3_.exit761
  %arrayidx.i696 = getelementptr inbounds %"class.std::ctype"* %30, i32 0, i32 7, i32 10
  %32 = load i8* %arrayidx.i696, align 1, !tbaa !1
  br label %_ZNKSt5ctypeIcE5widenEc.exit703

if.end.i701:                                      ; preds = %_ZSt13__check_facetISt5ctypeIcEERKT_PS3_.exit761
  call void @_ZNKSt5ctypeIcE13_M_widen_initEv(%"class.std::ctype"* %30)
  %33 = bitcast %"class.std::ctype"* %30 to i8 (%"class.std::ctype"*, i8)***
  %vtable.i698 = load i8 (%"class.std::ctype"*, i8)*** %33, align 4, !tbaa !5
  %vfn.i699 = getelementptr inbounds i8 (%"class.std::ctype"*, i8)** %vtable.i698, i32 6
  %34 = load i8 (%"class.std::ctype"*, i8)** %vfn.i699, align 4
  %call.i700 = call signext i8 %34(%"class.std::ctype"* %30, i8 signext 10)
  br label %_ZNKSt5ctypeIcE5widenEc.exit703

_ZNKSt5ctypeIcE5widenEc.exit703:                  ; preds = %if.then.i697, %if.end.i701
  %retval.0.i702 = phi i8 [ %32, %if.then.i697 ], [ %call.i700, %if.end.i701 ]
  %call1.i201 = call %"class.std::basic_ostream"* @_ZNSo3putEc(%"class.std::basic_ostream"* %call2.i192, i8 signext %retval.0.i702)
  %call.i = call %"class.std::basic_ostream"* @_ZNSo5flushEv(%"class.std::basic_ostream"* %call1.i201)
  br label %invoke.cont23

if.else:                                          ; preds = %_ZN5boost9algorithm18boyer_moore_searchIN9__gnu_cxx17__normal_iteratorIPKcSsEES6_EET0_S7_S7_T_S8_.exit
  %call1.i204 = call %"class.std::basic_ostream"* @_ZSt16__ostream_insertIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_PKS3_i(%"class.std::basic_ostream"* @_ZSt4cout, i8* getelementptr inbounds ([15 x i8]* @.str9, i32 0, i32 0), i32 14)
  %35 = load i8** getelementptr inbounds (%"class.std::basic_string"* @_ZL7needle1, i32 0, i32 0, i32 0), align 4, !tbaa !0
  %arrayidx.i.i.i206 = getelementptr inbounds i8* %35, i32 -12
  %_M_length.i.i207 = bitcast i8* %arrayidx.i.i.i206 to i32*
  %36 = load i32* %_M_length.i.i207, align 4, !tbaa !4
  %call2.i208 = call %"class.std::basic_ostream"* @_ZSt16__ostream_insertIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_PKS3_i(%"class.std::basic_ostream"* @_ZSt4cout, i8* %35, i32 %36)
  %call1.i210 = call %"class.std::basic_ostream"* @_ZSt16__ostream_insertIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_PKS3_i(%"class.std::basic_ostream"* %call2.i208, i8* getelementptr inbounds ([8 x i8]* @.str7, i32 0, i32 0), i32 7)
  %37 = load i8** getelementptr inbounds (%"class.std::basic_string"* @_ZL8haystack, i32 0, i32 0, i32 0), align 4, !tbaa !0
  %arrayidx.i.i.i212 = getelementptr inbounds i8* %37, i32 -12
  %_M_length.i.i213 = bitcast i8* %arrayidx.i.i.i212 to i32*
  %38 = load i32* %_M_length.i.i213, align 4, !tbaa !4
  %call2.i214 = call %"class.std::basic_ostream"* @_ZSt16__ostream_insertIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_PKS3_i(%"class.std::basic_ostream"* %call2.i208, i8* %37, i32 %38)
  %call1.i216 = call %"class.std::basic_ostream"* @_ZSt16__ostream_insertIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_PKS3_i(%"class.std::basic_ostream"* %call2.i214, i8* getelementptr inbounds ([18 x i8]* @.str8, i32 0, i32 0), i32 17)
  %39 = bitcast %"class.std::basic_ostream"* %call2.i214 to i8**
  %vtable.i219 = load i8** %39, align 4, !tbaa !5
  %vbase.offset.ptr.i220 = getelementptr i8* %vtable.i219, i32 -12
  %40 = bitcast i8* %vbase.offset.ptr.i220 to i32*
  %vbase.offset.i221 = load i32* %40, align 4
  %41 = bitcast %"class.std::basic_ostream"* %call2.i214 to i8*
  %add.ptr.i222.sum = add i32 %vbase.offset.i221, 124
  %_M_ctype.i232 = getelementptr inbounds i8* %41, i32 %add.ptr.i222.sum
  %42 = bitcast i8* %_M_ctype.i232 to %"class.std::ctype"**
  %43 = load %"class.std::ctype"** %42, align 4, !tbaa !0
  %tobool.i256 = icmp eq %"class.std::ctype"* %43, null
  br i1 %tobool.i256, label %if.then.i257, label %_ZSt13__check_facetISt5ctypeIcEERKT_PS3_.exit

if.then.i257:                                     ; preds = %if.else
  call void @_ZSt16__throw_bad_castv() noreturn
  unreachable

_ZSt13__check_facetISt5ctypeIcEERKT_PS3_.exit:    ; preds = %if.else
  %_M_widen_ok.i235 = getelementptr inbounds %"class.std::ctype"* %43, i32 0, i32 6
  %44 = load i8* %_M_widen_ok.i235, align 1, !tbaa !1
  %tobool.i236 = icmp eq i8 %44, 0
  br i1 %tobool.i236, label %if.end.i242, label %if.then.i238

if.then.i238:                                     ; preds = %_ZSt13__check_facetISt5ctypeIcEERKT_PS3_.exit
  %arrayidx.i237 = getelementptr inbounds %"class.std::ctype"* %43, i32 0, i32 7, i32 10
  %45 = load i8* %arrayidx.i237, align 1, !tbaa !1
  br label %_ZNKSt5ctypeIcE5widenEc.exit244

if.end.i242:                                      ; preds = %_ZSt13__check_facetISt5ctypeIcEERKT_PS3_.exit
  call void @_ZNKSt5ctypeIcE13_M_widen_initEv(%"class.std::ctype"* %43)
  %46 = bitcast %"class.std::ctype"* %43 to i8 (%"class.std::ctype"*, i8)***
  %vtable.i239 = load i8 (%"class.std::ctype"*, i8)*** %46, align 4, !tbaa !5
  %vfn.i240 = getelementptr inbounds i8 (%"class.std::ctype"*, i8)** %vtable.i239, i32 6
  %47 = load i8 (%"class.std::ctype"*, i8)** %vfn.i240, align 4
  %call.i241 = call signext i8 %47(%"class.std::ctype"* %43, i8 signext 10)
  br label %_ZNKSt5ctypeIcE5widenEc.exit244

_ZNKSt5ctypeIcE5widenEc.exit244:                  ; preds = %if.then.i238, %if.end.i242
  %retval.0.i243 = phi i8 [ %45, %if.then.i238 ], [ %call.i241, %if.end.i242 ]
  %call1.i224 = call %"class.std::basic_ostream"* @_ZNSo3putEc(%"class.std::basic_ostream"* %call2.i214, i8 signext %retval.0.i243)
  %call.i226 = call %"class.std::basic_ostream"* @_ZNSo5flushEv(%"class.std::basic_ostream"* %call1.i224)
  br label %invoke.cont23

invoke.cont23:                                    ; preds = %_ZNKSt5ctypeIcE5widenEc.exit244, %_ZNKSt5ctypeIcE5widenEc.exit703
  %48 = load i8** getelementptr inbounds (%"class.std::basic_string"* @_ZL7needle1, i32 0, i32 0, i32 0), align 4, !tbaa !0
  %arrayidx.i.i.i228 = getelementptr inbounds i8* %48, i32 -12
  %_M_length.i.i229 = bitcast i8* %arrayidx.i.i.i228 to i32*
  %49 = load i32* %_M_length.i.i229, align 4, !tbaa !4
  %add.ptr.i230 = getelementptr inbounds i8* %48, i32 %49
  %agg.tmp18.sroa.0.0.tmp246.idx = getelementptr inbounds %"class.__gnu_cxx::__normal_iterator"* %agg.tmp18245, i32 0, i32 0
  store i8* %48, i8** %agg.tmp18.sroa.0.0.tmp246.idx, align 8
  %agg.tmp19.sroa.0.0.tmp249.idx = getelementptr inbounds %"class.__gnu_cxx::__normal_iterator"* %agg.tmp19248, i32 0, i32 0
  store i8* %add.ptr.i230, i8** %agg.tmp19.sroa.0.0.tmp249.idx, align 8
  call void @_ZN5boost9algorithm11boyer_mooreIN9__gnu_cxx17__normal_iteratorIPKcSsEENS0_6detail9BM_traitsIS6_EEEC2ES6_S6_(%"class.boost::algorithm::boyer_moore"* %search1, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %agg.tmp18245, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %agg.tmp19248)
  %50 = load i8** getelementptr inbounds (%"class.std::basic_string"* @_ZL8haystack, i32 0, i32 0, i32 0), align 4, !tbaa !0
  %arrayidx.i.i.i252 = getelementptr inbounds i8* %50, i32 -12
  %_M_length.i.i253 = bitcast i8* %arrayidx.i.i.i252 to i32*
  %51 = load i32* %_M_length.i.i253, align 4, !tbaa !4
  %add.ptr.i254 = getelementptr inbounds i8* %50, i32 %51
  %cmp.i.i267 = icmp eq i32 %51, 0
  br i1 %cmp.i.i267, label %invoke.cont26, label %if.end.i272

if.end.i272:                                      ; preds = %invoke.cont23
  %_M_current.i.i18.i269 = getelementptr inbounds %"class.boost::algorithm::boyer_moore"* %search1, i32 0, i32 0, i32 0
  %52 = load i8** %_M_current.i.i18.i269, align 4, !tbaa !0
  %_M_current.i2.i19.i270 = getelementptr inbounds %"class.boost::algorithm::boyer_moore"* %search1, i32 0, i32 1, i32 0
  %53 = load i8** %_M_current.i2.i19.i270, align 4, !tbaa !0
  %cmp.i20.i271 = icmp eq i8* %52, %53
  br i1 %cmp.i20.i271, label %invoke.cont26, label %if.end4.i279

if.end4.i279:                                     ; preds = %if.end.i272
  %k_pattern_length.i277 = getelementptr inbounds %"class.boost::algorithm::boyer_moore"* %search1, i32 0, i32 2
  %54 = load i32* %k_pattern_length.i277, align 4, !tbaa !4
  %cmp.i278 = icmp slt i32 %51, %54
  br i1 %cmp.i278, label %if.else42, label %if.end8.i284

if.end8.i284:                                     ; preds = %if.end4.i279
  %add.ptr.i254.sum = sub i32 %51, %54
  %add.ptr.i.i.i282 = getelementptr inbounds i8* %50, i32 %add.ptr.i254.sum
  %cmp.i57.i.i283 = icmp slt i32 %add.ptr.i254.sum, 0
  br i1 %cmp.i57.i.i283, label %if.else42, label %while.body.lr.ph.i.i286

while.body.lr.ph.i.i286:                          ; preds = %if.end8.i284
  %_M_start.i41.i.i285 = getelementptr inbounds %"class.boost::algorithm::boyer_moore"* %search1, i32 0, i32 4, i32 0, i32 0, i32 0
  %55 = load i32** %_M_start.i41.i.i285, align 4, !tbaa !0
  br label %while.body.i.i287

while.body.i.i287:                                ; preds = %while.end.i.i308, %while.body.lr.ph.i.i286
  %56 = phi i8* [ %50, %while.body.lr.ph.i.i286 ], [ %.be.i.i306, %while.end.i.i308 ]
  br label %while.cond3.i.i293

while.cond3.i.i293:                               ; preds = %while.body9.i.i295, %while.body.i.i287
  %j.0.i.i288 = phi i32 [ %54, %while.body.i.i287 ], [ %sub.i.i289, %while.body9.i.i295 ]
  %sub.i.i289 = add nsw i32 %j.0.i.i288, -1
  %arrayidx.i47.i.i290 = getelementptr inbounds i8* %52, i32 %sub.i.i289
  %57 = load i8* %arrayidx.i47.i.i290, align 1, !tbaa !1
  %arrayidx.i45.i.i291 = getelementptr inbounds i8* %56, i32 %sub.i.i289
  %58 = load i8* %arrayidx.i45.i.i291, align 1, !tbaa !1
  %cmp.i17.i292 = icmp eq i8 %57, %58
  br i1 %cmp.i17.i292, label %while.body9.i.i295, label %while.end.i.i308

while.body9.i.i295:                               ; preds = %while.cond3.i.i293
  %cmp10.i.i294 = icmp eq i32 %sub.i.i289, 0
  br i1 %cmp10.i.i294, label %invoke.cont26, label %while.cond3.i.i293

while.end.i.i308:                                 ; preds = %while.cond3.i.i293
  %conv.i.i.i297 = zext i8 %58 to i32
  %arrayidx.i.i.i.i298 = getelementptr inbounds %"class.boost::algorithm::boyer_moore"* %search1, i32 0, i32 3, i32 0, i32 0, i32 %conv.i.i.i297
  %59 = load i32* %arrayidx.i.i.i.i298, align 4, !tbaa !4
  %sub15.i.i299 = sub nsw i32 %j.0.i.i288, %59
  %sub16.i.i300 = add nsw i32 %sub15.i.i299, -1
  %cmp17.i.i301 = icmp slt i32 %59, %j.0.i.i288
  %add.ptr.i42.i.i302 = getelementptr inbounds i32* %55, i32 %j.0.i.i288
  %60 = load i32* %add.ptr.i42.i.i302, align 4, !tbaa !4
  %cmp19.i.i303 = icmp sgt i32 %sub16.i.i300, %60
  %or.cond.i.i304 = and i1 %cmp17.i.i301, %cmp19.i.i303
  %sub16.pn.i.i305 = select i1 %or.cond.i.i304, i32 %sub16.i.i300, i32 %60
  %.be.i.i306 = getelementptr inbounds i8* %56, i32 %sub16.pn.i.i305
  %cmp.i.i.i307 = icmp ugt i8* %.be.i.i306, %add.ptr.i.i.i282
  br i1 %cmp.i.i.i307, label %if.else42, label %while.body.i.i287

invoke.cont26:                                    ; preds = %while.body9.i.i295, %if.end.i272, %invoke.cont23
  %agg.tmp22262.sroa.0.0.load782 = phi i8* [ %50, %invoke.cont23 ], [ %50, %if.end.i272 ], [ %56, %while.body9.i.i295 ]
  %cmp.i317 = icmp eq i8* %agg.tmp22262.sroa.0.0.load782, %add.ptr.i254
  br i1 %cmp.i317, label %if.else42, label %if.then29

if.then29:                                        ; preds = %invoke.cont26
  %call1.i319321 = invoke %"class.std::basic_ostream"* @_ZSt16__ostream_insertIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_PKS3_i(%"class.std::basic_ostream"* @_ZSt4cout, i8* getelementptr inbounds ([8 x i8]* @.str6, i32 0, i32 0), i32 7)
          to label %invoke.cont30 unwind label %lpad

invoke.cont30:                                    ; preds = %if.then29
  %61 = load i8** getelementptr inbounds (%"class.std::basic_string"* @_ZL7needle1, i32 0, i32 0, i32 0), align 4, !tbaa !0
  %arrayidx.i.i.i322 = getelementptr inbounds i8* %61, i32 -12
  %_M_length.i.i323 = bitcast i8* %arrayidx.i.i.i322 to i32*
  %62 = load i32* %_M_length.i.i323, align 4, !tbaa !4
  %call2.i324325 = invoke %"class.std::basic_ostream"* @_ZSt16__ostream_insertIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_PKS3_i(%"class.std::basic_ostream"* @_ZSt4cout, i8* %61, i32 %62)
          to label %invoke.cont32 unwind label %lpad

invoke.cont32:                                    ; preds = %invoke.cont30
  %call1.i327329 = invoke %"class.std::basic_ostream"* @_ZSt16__ostream_insertIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_PKS3_i(%"class.std::basic_ostream"* %call2.i324325, i8* getelementptr inbounds ([8 x i8]* @.str7, i32 0, i32 0), i32 7)
          to label %invoke.cont34 unwind label %lpad

invoke.cont34:                                    ; preds = %invoke.cont32
  %63 = load i8** getelementptr inbounds (%"class.std::basic_string"* @_ZL8haystack, i32 0, i32 0, i32 0), align 4, !tbaa !0
  %arrayidx.i.i.i331 = getelementptr inbounds i8* %63, i32 -12
  %_M_length.i.i332 = bitcast i8* %arrayidx.i.i.i331 to i32*
  %64 = load i32* %_M_length.i.i332, align 4, !tbaa !4
  %call2.i333334 = invoke %"class.std::basic_ostream"* @_ZSt16__ostream_insertIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_PKS3_i(%"class.std::basic_ostream"* %call2.i324325, i8* %63, i32 %64)
          to label %invoke.cont36 unwind label %lpad

invoke.cont36:                                    ; preds = %invoke.cont34
  %call1.i337339 = invoke %"class.std::basic_ostream"* @_ZSt16__ostream_insertIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_PKS3_i(%"class.std::basic_ostream"* %call2.i333334, i8* getelementptr inbounds ([18 x i8]* @.str10, i32 0, i32 0), i32 17)
          to label %invoke.cont38 unwind label %lpad

invoke.cont38:                                    ; preds = %invoke.cont36
  %65 = bitcast %"class.std::basic_ostream"* %call2.i333334 to i8**
  %vtable.i344 = load i8** %65, align 4, !tbaa !5
  %vbase.offset.ptr.i345 = getelementptr i8* %vtable.i344, i32 -12
  %66 = bitcast i8* %vbase.offset.ptr.i345 to i32*
  %vbase.offset.i346 = load i32* %66, align 4
  %67 = bitcast %"class.std::basic_ostream"* %call2.i333334 to i8*
  %add.ptr.i347.sum = add i32 %vbase.offset.i346, 124
  %_M_ctype.i704 = getelementptr inbounds i8* %67, i32 %add.ptr.i347.sum
  %68 = bitcast i8* %_M_ctype.i704 to %"class.std::ctype"**
  %69 = load %"class.std::ctype"** %68, align 4, !tbaa !0
  %tobool.i762 = icmp eq %"class.std::ctype"* %69, null
  br i1 %tobool.i762, label %if.then.i763, label %call.i705.noexc

if.then.i763:                                     ; preds = %invoke.cont38
  invoke void @_ZSt16__throw_bad_castv() noreturn
          to label %.noexc765 unwind label %lpad

.noexc765:                                        ; preds = %if.then.i763
  unreachable

call.i705.noexc:                                  ; preds = %invoke.cont38
  %_M_widen_ok.i710 = getelementptr inbounds %"class.std::ctype"* %69, i32 0, i32 6
  %70 = load i8* %_M_widen_ok.i710, align 1, !tbaa !1
  %tobool.i711 = icmp eq i8 %70, 0
  br i1 %tobool.i711, label %if.end.i717, label %if.then.i713

if.then.i713:                                     ; preds = %call.i705.noexc
  %arrayidx.i712 = getelementptr inbounds %"class.std::ctype"* %69, i32 0, i32 7, i32 10
  %71 = load i8* %arrayidx.i712, align 1, !tbaa !1
  br label %call.i348.noexc

if.end.i717:                                      ; preds = %call.i705.noexc
  invoke void @_ZNKSt5ctypeIcE13_M_widen_initEv(%"class.std::ctype"* %69)
          to label %.noexc719 unwind label %lpad

.noexc719:                                        ; preds = %if.end.i717
  %72 = bitcast %"class.std::ctype"* %69 to i8 (%"class.std::ctype"*, i8)***
  %vtable.i714 = load i8 (%"class.std::ctype"*, i8)*** %72, align 4, !tbaa !5
  %vfn.i715 = getelementptr inbounds i8 (%"class.std::ctype"*, i8)** %vtable.i714, i32 6
  %73 = load i8 (%"class.std::ctype"*, i8)** %vfn.i715, align 4
  %call.i716720 = invoke signext i8 %73(%"class.std::ctype"* %69, i8 signext 10)
          to label %call.i348.noexc unwind label %lpad

call.i348.noexc:                                  ; preds = %.noexc719, %if.then.i713
  %retval.0.i718 = phi i8 [ %71, %if.then.i713 ], [ %call.i716720, %.noexc719 ]
  %call1.i349352 = invoke %"class.std::basic_ostream"* @_ZNSo3putEc(%"class.std::basic_ostream"* %call2.i333334, i8 signext %retval.0.i718)
          to label %call1.i349.noexc unwind label %lpad

call1.i349.noexc:                                 ; preds = %call.i348.noexc
  %call.i355356 = invoke %"class.std::basic_ostream"* @_ZNSo5flushEv(%"class.std::basic_ostream"* %call1.i349352)
          to label %invoke.cont64 unwind label %lpad

lpad:                                             ; preds = %if.then.i773, %if.then.i768, %if.then.i763, %.noexc755, %if.end.i753, %.noexc737, %if.end.i735, %.noexc719, %if.end.i717, %if.then.i687, %invoke.cont131, %invoke.cont129, %invoke.cont127, %invoke.cont125, %if.else124, %call1.i652.noexc, %call.i651.noexc, %invoke.cont118, %invoke.cont116, %invoke.cont114, %invoke.cont112, %if.then111, %if.then.i608, %.noexc599, %if.end.i597, %call1.i570.noexc, %call.i569.noexc, %invoke.cont90, %invoke.cont88, %invoke.cont86, %invoke.cont84, %if.else83, %call1.i528.noexc, %call.i527.noexc, %invoke.cont77, %invoke.cont75, %invoke.cont73, %invoke.cont71, %if.then70, %if.then.i433, %.noexc424, %if.end.i422, %call1.i395.noexc, %call.i394.noexc, %invoke.cont49, %invoke.cont47, %invoke.cont45, %invoke.cont43, %if.else42, %call1.i349.noexc, %call.i348.noexc, %invoke.cont36, %invoke.cont34, %invoke.cont32, %invoke.cont30, %if.then29, %.noexc, %if.end.i, %call1.i.noexc, %call.i.noexc, %invoke.cont105
  %74 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %_M_start.i.i.i.i.i358 = getelementptr inbounds %"class.boost::algorithm::boyer_moore"* %search1, i32 0, i32 4, i32 0, i32 0, i32 0
  %75 = load i32** %_M_start.i.i.i.i.i358, align 4, !tbaa !0
  %tobool.i.i.i.i.i.i359 = icmp eq i32* %75, null
  br i1 %tobool.i.i.i.i.i.i359, label %eh.resume, label %if.then.i.i.i.i.i.i360

if.then.i.i.i.i.i.i360:                           ; preds = %lpad
  %76 = bitcast i32* %75 to i8*
  call void @_ZdlPv(i8* %76) nounwind
  br label %eh.resume

if.else42:                                        ; preds = %while.end.i.i308, %if.end8.i284, %if.end4.i279, %invoke.cont26
  %call1.i363365 = invoke %"class.std::basic_ostream"* @_ZSt16__ostream_insertIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_PKS3_i(%"class.std::basic_ostream"* @_ZSt4cout, i8* getelementptr inbounds ([15 x i8]* @.str9, i32 0, i32 0), i32 14)
          to label %invoke.cont43 unwind label %lpad

invoke.cont43:                                    ; preds = %if.else42
  %77 = load i8** getelementptr inbounds (%"class.std::basic_string"* @_ZL7needle1, i32 0, i32 0, i32 0), align 4, !tbaa !0
  %arrayidx.i.i.i367 = getelementptr inbounds i8* %77, i32 -12
  %_M_length.i.i368 = bitcast i8* %arrayidx.i.i.i367 to i32*
  %78 = load i32* %_M_length.i.i368, align 4, !tbaa !4
  %call2.i369370 = invoke %"class.std::basic_ostream"* @_ZSt16__ostream_insertIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_PKS3_i(%"class.std::basic_ostream"* @_ZSt4cout, i8* %77, i32 %78)
          to label %invoke.cont45 unwind label %lpad

invoke.cont45:                                    ; preds = %invoke.cont43
  %call1.i373375 = invoke %"class.std::basic_ostream"* @_ZSt16__ostream_insertIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_PKS3_i(%"class.std::basic_ostream"* %call2.i369370, i8* getelementptr inbounds ([8 x i8]* @.str7, i32 0, i32 0), i32 7)
          to label %invoke.cont47 unwind label %lpad

invoke.cont47:                                    ; preds = %invoke.cont45
  %79 = load i8** getelementptr inbounds (%"class.std::basic_string"* @_ZL8haystack, i32 0, i32 0, i32 0), align 4, !tbaa !0
  %arrayidx.i.i.i377 = getelementptr inbounds i8* %79, i32 -12
  %_M_length.i.i378 = bitcast i8* %arrayidx.i.i.i377 to i32*
  %80 = load i32* %_M_length.i.i378, align 4, !tbaa !4
  %call2.i379380 = invoke %"class.std::basic_ostream"* @_ZSt16__ostream_insertIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_PKS3_i(%"class.std::basic_ostream"* %call2.i369370, i8* %79, i32 %80)
          to label %invoke.cont49 unwind label %lpad

invoke.cont49:                                    ; preds = %invoke.cont47
  %call1.i383385 = invoke %"class.std::basic_ostream"* @_ZSt16__ostream_insertIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_PKS3_i(%"class.std::basic_ostream"* %call2.i379380, i8* getelementptr inbounds ([18 x i8]* @.str10, i32 0, i32 0), i32 17)
          to label %invoke.cont51 unwind label %lpad

invoke.cont51:                                    ; preds = %invoke.cont49
  %81 = bitcast %"class.std::basic_ostream"* %call2.i379380 to i8**
  %vtable.i390 = load i8** %81, align 4, !tbaa !5
  %vbase.offset.ptr.i391 = getelementptr i8* %vtable.i390, i32 -12
  %82 = bitcast i8* %vbase.offset.ptr.i391 to i32*
  %vbase.offset.i392 = load i32* %82, align 4
  %83 = bitcast %"class.std::basic_ostream"* %call2.i379380 to i8*
  %add.ptr.i393.sum = add i32 %vbase.offset.i392, 124
  %_M_ctype.i409 = getelementptr inbounds i8* %83, i32 %add.ptr.i393.sum
  %84 = bitcast i8* %_M_ctype.i409 to %"class.std::ctype"**
  %85 = load %"class.std::ctype"** %84, align 4, !tbaa !0
  %tobool.i432 = icmp eq %"class.std::ctype"* %85, null
  br i1 %tobool.i432, label %if.then.i433, label %call.i410.noexc

if.then.i433:                                     ; preds = %invoke.cont51
  invoke void @_ZSt16__throw_bad_castv() noreturn
          to label %.noexc435 unwind label %lpad

.noexc435:                                        ; preds = %if.then.i433
  unreachable

call.i410.noexc:                                  ; preds = %invoke.cont51
  %_M_widen_ok.i415 = getelementptr inbounds %"class.std::ctype"* %85, i32 0, i32 6
  %86 = load i8* %_M_widen_ok.i415, align 1, !tbaa !1
  %tobool.i416 = icmp eq i8 %86, 0
  br i1 %tobool.i416, label %if.end.i422, label %if.then.i418

if.then.i418:                                     ; preds = %call.i410.noexc
  %arrayidx.i417 = getelementptr inbounds %"class.std::ctype"* %85, i32 0, i32 7, i32 10
  %87 = load i8* %arrayidx.i417, align 1, !tbaa !1
  br label %call.i394.noexc

if.end.i422:                                      ; preds = %call.i410.noexc
  invoke void @_ZNKSt5ctypeIcE13_M_widen_initEv(%"class.std::ctype"* %85)
          to label %.noexc424 unwind label %lpad

.noexc424:                                        ; preds = %if.end.i422
  %88 = bitcast %"class.std::ctype"* %85 to i8 (%"class.std::ctype"*, i8)***
  %vtable.i419 = load i8 (%"class.std::ctype"*, i8)*** %88, align 4, !tbaa !5
  %vfn.i420 = getelementptr inbounds i8 (%"class.std::ctype"*, i8)** %vtable.i419, i32 6
  %89 = load i8 (%"class.std::ctype"*, i8)** %vfn.i420, align 4
  %call.i421425 = invoke signext i8 %89(%"class.std::ctype"* %85, i8 signext 10)
          to label %call.i394.noexc unwind label %lpad

call.i394.noexc:                                  ; preds = %.noexc424, %if.then.i418
  %retval.0.i423 = phi i8 [ %87, %if.then.i418 ], [ %call.i421425, %.noexc424 ]
  %call1.i395398 = invoke %"class.std::basic_ostream"* @_ZNSo3putEc(%"class.std::basic_ostream"* %call2.i379380, i8 signext %retval.0.i423)
          to label %call1.i395.noexc unwind label %lpad

call1.i395.noexc:                                 ; preds = %call.i394.noexc
  %call.i401402 = invoke %"class.std::basic_ostream"* @_ZNSo5flushEv(%"class.std::basic_ostream"* %call1.i395398)
          to label %invoke.cont64 unwind label %lpad

invoke.cont64:                                    ; preds = %call1.i395.noexc, %call1.i349.noexc
  %90 = load i8** getelementptr inbounds (%"class.std::basic_string"* @_ZL8haystack, i32 0, i32 0, i32 0), align 4, !tbaa !0
  %arrayidx.i.i.i405 = getelementptr inbounds i8* %90, i32 -12
  %_M_length.i.i406 = bitcast i8* %arrayidx.i.i.i405 to i32*
  %91 = load i32* %_M_length.i.i406, align 4, !tbaa !4
  %92 = load i8** getelementptr inbounds (%"class.std::basic_string"* @_ZL7needle1, i32 0, i32 0, i32 0), align 4, !tbaa !0
  %arrayidx.i.i.i428 = getelementptr inbounds i8* %92, i32 -12
  %_M_length.i.i429 = bitcast i8* %arrayidx.i.i.i428 to i32*
  %93 = load i32* %_M_length.i.i429, align 4, !tbaa !4
  %add.ptr.i430 = getelementptr inbounds i8* %92, i32 %93
  %94 = bitcast %"class.boost::algorithm::boyer_moore_horspool"* %bmh.i to i8*
  call void @llvm.lifetime.start(i64 1040, i8* %94)
  %95 = getelementptr inbounds %"class.boost::algorithm::boyer_moore_horspool"* %bmh.i, i32 0, i32 0, i32 0
  store i8* %92, i8** %95, align 4
  %96 = getelementptr inbounds %"class.boost::algorithm::boyer_moore_horspool"* %bmh.i, i32 0, i32 1, i32 0
  store i8* %add.ptr.i430, i8** %96, align 4, !tbaa !0
  %k_pattern_length.i.i.i = getelementptr inbounds %"class.boost::algorithm::boyer_moore_horspool"* %bmh.i, i32 0, i32 2
  store i32 %93, i32* %k_pattern_length.i.i.i, align 4, !tbaa !4
  %k_default_value.i.i.i.i.i = getelementptr inbounds %"class.boost::algorithm::boyer_moore_horspool"* %bmh.i, i32 0, i32 3, i32 1
  store i32 %93, i32* %k_default_value.i.i.i.i.i, align 4, !tbaa !4
  %arraydecay.i.i.i.i.i.i = getelementptr inbounds %"class.boost::algorithm::boyer_moore_horspool"* %bmh.i, i32 0, i32 3, i32 0, i32 0, i32 0
  br label %for.body.i.i.i.i.i.i.i

for.body.i.i.i.i.i.i.i:                           ; preds = %for.body.i.i.i.i.i.i.i, %invoke.cont64
  %__niter.06.i.i.i.i.i.i.i = phi i32 [ %dec.i.i.i.i.i.i.i, %for.body.i.i.i.i.i.i.i ], [ 256, %invoke.cont64 ]
  %__first.addr.05.i.i.i.i.i.i.i = phi i32* [ %incdec.ptr.i.i.i.i.i.i.i, %for.body.i.i.i.i.i.i.i ], [ %arraydecay.i.i.i.i.i.i, %invoke.cont64 ]
  store i32 %93, i32* %__first.addr.05.i.i.i.i.i.i.i, align 4, !tbaa !4
  %dec.i.i.i.i.i.i.i = add i32 %__niter.06.i.i.i.i.i.i.i, -1
  %incdec.ptr.i.i.i.i.i.i.i = getelementptr inbounds i32* %__first.addr.05.i.i.i.i.i.i.i, i32 1
  %cmp.i.i.i.i.i.i.i = icmp eq i32 %dec.i.i.i.i.i.i.i, 0
  br i1 %cmp.i.i.i.i.i.i.i, label %_ZN5boost9algorithm6detail10skip_tableIciLb1EEC1Eji.exit.i.i.i, label %for.body.i.i.i.i.i.i.i

_ZN5boost9algorithm6detail10skip_tableIciLb1EEC1Eji.exit.i.i.i: ; preds = %for.body.i.i.i.i.i.i.i
  %add.ptr.i407 = getelementptr inbounds i8* %90, i32 %91
  %cmp.i20.i.i.i = icmp eq i32 %93, 0
  br i1 %cmp.i20.i.i.i, label %_ZN5boost9algorithm20boyer_moore_horspoolIN9__gnu_cxx17__normal_iteratorIPKcSsEENS0_6detail9BM_traitsIS6_EEEC1ES6_S6_.exit.i, label %for.cond.preheader.i.i.i

for.cond.preheader.i.i.i:                         ; preds = %_ZN5boost9algorithm6detail10skip_tableIciLb1EEC1Eji.exit.i.i.i
  %add.ptr.i430.sum = add i32 %93, -1
  %add.ptr.i23.i.i.i = getelementptr inbounds i8* %92, i32 %add.ptr.i430.sum
  %cmp.i24.i.i.i = icmp eq i32 %add.ptr.i430.sum, 0
  br i1 %cmp.i24.i.i.i, label %_ZN5boost9algorithm20boyer_moore_horspoolIN9__gnu_cxx17__normal_iteratorIPKcSsEENS0_6detail9BM_traitsIS6_EEEC1ES6_S6_.exit.i, label %for.body.i.i.i

for.body.i.i.i:                                   ; preds = %for.cond.preheader.i.i.i, %for.body.i.i.i
  %i.025.i.i.i = phi i32 [ %inc.i.i.i, %for.body.i.i.i ], [ 0, %for.cond.preheader.i.i.i ]
  %97 = phi i8* [ %incdec.ptr.i.i.i.i, %for.body.i.i.i ], [ %92, %for.cond.preheader.i.i.i ]
  %98 = load i8* %97, align 1, !tbaa !1
  %99 = load i32* %k_pattern_length.i.i.i, align 4, !tbaa !4
  %sub.i.i.i = xor i32 %i.025.i.i.i, -1
  %sub13.i.i.i = add i32 %99, %sub.i.i.i
  %conv.i.i.i.i = zext i8 %98 to i32
  %arrayidx.i.i.i.i.i = getelementptr inbounds %"class.boost::algorithm::boyer_moore_horspool"* %bmh.i, i32 0, i32 3, i32 0, i32 0, i32 %conv.i.i.i.i
  store i32 %sub13.i.i.i, i32* %arrayidx.i.i.i.i.i, align 4, !tbaa !4
  %incdec.ptr.i.i.i.i = getelementptr inbounds i8* %97, i32 1
  %inc.i.i.i = add i32 %i.025.i.i.i, 1
  %cmp.i.i.i.i = icmp eq i8* %incdec.ptr.i.i.i.i, %add.ptr.i23.i.i.i
  br i1 %cmp.i.i.i.i, label %_ZN5boost9algorithm20boyer_moore_horspoolIN9__gnu_cxx17__normal_iteratorIPKcSsEENS0_6detail9BM_traitsIS6_EEEC1ES6_S6_.exit.i, label %for.body.i.i.i

_ZN5boost9algorithm20boyer_moore_horspoolIN9__gnu_cxx17__normal_iteratorIPKcSsEENS0_6detail9BM_traitsIS6_EEEC1ES6_S6_.exit.i: ; preds = %for.body.i.i.i, %for.cond.preheader.i.i.i, %_ZN5boost9algorithm6detail10skip_tableIciLb1EEC1Eji.exit.i.i.i
  %cmp.i.i460 = icmp eq i32 %91, 0
  br i1 %cmp.i.i460, label %invoke.cont67, label %if.end.i465

if.end.i465:                                      ; preds = %_ZN5boost9algorithm20boyer_moore_horspoolIN9__gnu_cxx17__normal_iteratorIPKcSsEENS0_6detail9BM_traitsIS6_EEEC1ES6_S6_.exit.i
  %100 = load i8** %95, align 4, !tbaa !0
  %101 = load i8** %96, align 4, !tbaa !0
  %cmp.i20.i464 = icmp eq i8* %100, %101
  br i1 %cmp.i20.i464, label %invoke.cont67, label %if.end4.i472

if.end4.i472:                                     ; preds = %if.end.i465
  %102 = load i32* %k_pattern_length.i.i.i, align 4, !tbaa !4
  %cmp.i471 = icmp slt i32 %91, %102
  br i1 %cmp.i471, label %invoke.cont67, label %if.end8.i476

if.end8.i476:                                     ; preds = %if.end4.i472
  %add.ptr.i407.sum = sub i32 %91, %102
  %add.ptr.i.i.i475 = getelementptr inbounds i8* %90, i32 %add.ptr.i407.sum
  %cmp.i33.i.i = icmp slt i32 %add.ptr.i407.sum, 0
  br i1 %cmp.i33.i.i, label %invoke.cont67, label %while.body.lr.ph.i.i477

while.body.lr.ph.i.i477:                          ; preds = %if.end8.i476
  %sub11.i.i = add nsw i32 %102, -1
  br label %while.body.i.i478

while.body.i.i478:                                ; preds = %while.end.i.i487, %while.body.lr.ph.i.i477
  %103 = phi i8* [ %90, %while.body.lr.ph.i.i477 ], [ %add.ptr.i22.i.i, %while.end.i.i487 ]
  br label %while.cond3.i.i481

while.cond3.i.i481:                               ; preds = %while.body8.i.i, %while.body.i.i478
  %j.0.in.i.i = phi i32 [ %102, %while.body.i.i478 ], [ %j.0.i.i479, %while.body8.i.i ]
  %j.0.i.i479 = add i32 %j.0.in.i.i, -1
  %arrayidx.i27.i.i = getelementptr inbounds i8* %100, i32 %j.0.i.i479
  %104 = load i8* %arrayidx.i27.i.i, align 1, !tbaa !1
  %arrayidx.i25.i.i = getelementptr inbounds i8* %103, i32 %j.0.i.i479
  %105 = load i8* %arrayidx.i25.i.i, align 1, !tbaa !1
  %cmp.i17.i480 = icmp eq i8 %104, %105
  br i1 %cmp.i17.i480, label %while.body8.i.i, label %while.end.i.i487

while.body8.i.i:                                  ; preds = %while.cond3.i.i481
  %cmp9.i.i = icmp eq i32 %j.0.i.i479, 0
  br i1 %cmp9.i.i, label %invoke.cont67, label %while.cond3.i.i481

while.end.i.i487:                                 ; preds = %while.cond3.i.i481
  %arrayidx.i.i.i483 = getelementptr inbounds i8* %103, i32 %sub11.i.i
  %106 = load i8* %arrayidx.i.i.i483, align 1, !tbaa !1
  %conv.i.i.i484 = zext i8 %106 to i32
  %arrayidx.i.i.i.i485 = getelementptr inbounds %"class.boost::algorithm::boyer_moore_horspool"* %bmh.i, i32 0, i32 3, i32 0, i32 0, i32 %conv.i.i.i484
  %107 = load i32* %arrayidx.i.i.i.i485, align 4, !tbaa !4
  %add.ptr.i22.i.i = getelementptr inbounds i8* %103, i32 %107
  %cmp.i.i.i486 = icmp ugt i8* %add.ptr.i22.i.i, %add.ptr.i.i.i475
  br i1 %cmp.i.i.i486, label %invoke.cont67, label %while.body.i.i478

invoke.cont67:                                    ; preds = %while.end.i.i487, %while.body8.i.i, %_ZN5boost9algorithm20boyer_moore_horspoolIN9__gnu_cxx17__normal_iteratorIPKcSsEENS0_6detail9BM_traitsIS6_EEEC1ES6_S6_.exit.i, %if.end.i465, %if.end4.i472, %if.end8.i476
  %agg.tmp3.i450455.sroa.0.0.load781 = phi i8* [ %90, %_ZN5boost9algorithm20boyer_moore_horspoolIN9__gnu_cxx17__normal_iteratorIPKcSsEENS0_6detail9BM_traitsIS6_EEEC1ES6_S6_.exit.i ], [ %90, %if.end.i465 ], [ %add.ptr.i407, %if.end4.i472 ], [ %add.ptr.i407, %if.end8.i476 ], [ %103, %while.body8.i.i ], [ %add.ptr.i407, %while.end.i.i487 ]
  call void @llvm.lifetime.end(i64 1040, i8* %94)
  %108 = load i32* %_M_length.i.i406, align 4, !tbaa !4
  %add.ptr.i490 = getelementptr inbounds i8* %90, i32 %108
  %cmp.i494 = icmp eq i8* %agg.tmp3.i450455.sroa.0.0.load781, %add.ptr.i490
  br i1 %cmp.i494, label %if.else83, label %if.then70

if.then70:                                        ; preds = %invoke.cont67
  %call1.i496498 = invoke %"class.std::basic_ostream"* @_ZSt16__ostream_insertIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_PKS3_i(%"class.std::basic_ostream"* @_ZSt4cout, i8* getelementptr inbounds ([8 x i8]* @.str6, i32 0, i32 0), i32 7)
          to label %invoke.cont71 unwind label %lpad

invoke.cont71:                                    ; preds = %if.then70
  %109 = load i8** getelementptr inbounds (%"class.std::basic_string"* @_ZL7needle1, i32 0, i32 0, i32 0), align 4, !tbaa !0
  %arrayidx.i.i.i500 = getelementptr inbounds i8* %109, i32 -12
  %_M_length.i.i501 = bitcast i8* %arrayidx.i.i.i500 to i32*
  %110 = load i32* %_M_length.i.i501, align 4, !tbaa !4
  %call2.i502503 = invoke %"class.std::basic_ostream"* @_ZSt16__ostream_insertIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_PKS3_i(%"class.std::basic_ostream"* @_ZSt4cout, i8* %109, i32 %110)
          to label %invoke.cont73 unwind label %lpad

invoke.cont73:                                    ; preds = %invoke.cont71
  %call1.i506508 = invoke %"class.std::basic_ostream"* @_ZSt16__ostream_insertIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_PKS3_i(%"class.std::basic_ostream"* %call2.i502503, i8* getelementptr inbounds ([8 x i8]* @.str7, i32 0, i32 0), i32 7)
          to label %invoke.cont75 unwind label %lpad

invoke.cont75:                                    ; preds = %invoke.cont73
  %111 = load i8** getelementptr inbounds (%"class.std::basic_string"* @_ZL8haystack, i32 0, i32 0, i32 0), align 4, !tbaa !0
  %arrayidx.i.i.i510 = getelementptr inbounds i8* %111, i32 -12
  %_M_length.i.i511 = bitcast i8* %arrayidx.i.i.i510 to i32*
  %112 = load i32* %_M_length.i.i511, align 4, !tbaa !4
  %call2.i512513 = invoke %"class.std::basic_ostream"* @_ZSt16__ostream_insertIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_PKS3_i(%"class.std::basic_ostream"* %call2.i502503, i8* %111, i32 %112)
          to label %invoke.cont77 unwind label %lpad

invoke.cont77:                                    ; preds = %invoke.cont75
  %call1.i516518 = invoke %"class.std::basic_ostream"* @_ZSt16__ostream_insertIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_PKS3_i(%"class.std::basic_ostream"* %call2.i512513, i8* getelementptr inbounds ([25 x i8]* @.str11, i32 0, i32 0), i32 24)
          to label %invoke.cont79 unwind label %lpad

invoke.cont79:                                    ; preds = %invoke.cont77
  %113 = bitcast %"class.std::basic_ostream"* %call2.i512513 to i8**
  %vtable.i523 = load i8** %113, align 4, !tbaa !5
  %vbase.offset.ptr.i524 = getelementptr i8* %vtable.i523, i32 -12
  %114 = bitcast i8* %vbase.offset.ptr.i524 to i32*
  %vbase.offset.i525 = load i32* %114, align 4
  %115 = bitcast %"class.std::basic_ostream"* %call2.i512513 to i8*
  %add.ptr.i526.sum = add i32 %vbase.offset.i525, 124
  %_M_ctype.i722 = getelementptr inbounds i8* %115, i32 %add.ptr.i526.sum
  %116 = bitcast i8* %_M_ctype.i722 to %"class.std::ctype"**
  %117 = load %"class.std::ctype"** %116, align 4, !tbaa !0
  %tobool.i767 = icmp eq %"class.std::ctype"* %117, null
  br i1 %tobool.i767, label %if.then.i768, label %call.i723.noexc

if.then.i768:                                     ; preds = %invoke.cont79
  invoke void @_ZSt16__throw_bad_castv() noreturn
          to label %.noexc770 unwind label %lpad

.noexc770:                                        ; preds = %if.then.i768
  unreachable

call.i723.noexc:                                  ; preds = %invoke.cont79
  %_M_widen_ok.i728 = getelementptr inbounds %"class.std::ctype"* %117, i32 0, i32 6
  %118 = load i8* %_M_widen_ok.i728, align 1, !tbaa !1
  %tobool.i729 = icmp eq i8 %118, 0
  br i1 %tobool.i729, label %if.end.i735, label %if.then.i731

if.then.i731:                                     ; preds = %call.i723.noexc
  %arrayidx.i730 = getelementptr inbounds %"class.std::ctype"* %117, i32 0, i32 7, i32 10
  %119 = load i8* %arrayidx.i730, align 1, !tbaa !1
  br label %call.i527.noexc

if.end.i735:                                      ; preds = %call.i723.noexc
  invoke void @_ZNKSt5ctypeIcE13_M_widen_initEv(%"class.std::ctype"* %117)
          to label %.noexc737 unwind label %lpad

.noexc737:                                        ; preds = %if.end.i735
  %120 = bitcast %"class.std::ctype"* %117 to i8 (%"class.std::ctype"*, i8)***
  %vtable.i732 = load i8 (%"class.std::ctype"*, i8)*** %120, align 4, !tbaa !5
  %vfn.i733 = getelementptr inbounds i8 (%"class.std::ctype"*, i8)** %vtable.i732, i32 6
  %121 = load i8 (%"class.std::ctype"*, i8)** %vfn.i733, align 4
  %call.i734738 = invoke signext i8 %121(%"class.std::ctype"* %117, i8 signext 10)
          to label %call.i527.noexc unwind label %lpad

call.i527.noexc:                                  ; preds = %.noexc737, %if.then.i731
  %retval.0.i736 = phi i8 [ %119, %if.then.i731 ], [ %call.i734738, %.noexc737 ]
  %call1.i528531 = invoke %"class.std::basic_ostream"* @_ZNSo3putEc(%"class.std::basic_ostream"* %call2.i512513, i8 signext %retval.0.i736)
          to label %call1.i528.noexc unwind label %lpad

call1.i528.noexc:                                 ; preds = %call.i527.noexc
  %call.i534535 = invoke %"class.std::basic_ostream"* @_ZNSo5flushEv(%"class.std::basic_ostream"* %call1.i528531)
          to label %invoke.cont105 unwind label %lpad

if.else83:                                        ; preds = %invoke.cont67
  %call1.i538540 = invoke %"class.std::basic_ostream"* @_ZSt16__ostream_insertIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_PKS3_i(%"class.std::basic_ostream"* @_ZSt4cout, i8* getelementptr inbounds ([15 x i8]* @.str9, i32 0, i32 0), i32 14)
          to label %invoke.cont84 unwind label %lpad

invoke.cont84:                                    ; preds = %if.else83
  %122 = load i8** getelementptr inbounds (%"class.std::basic_string"* @_ZL7needle1, i32 0, i32 0, i32 0), align 4, !tbaa !0
  %arrayidx.i.i.i542 = getelementptr inbounds i8* %122, i32 -12
  %_M_length.i.i543 = bitcast i8* %arrayidx.i.i.i542 to i32*
  %123 = load i32* %_M_length.i.i543, align 4, !tbaa !4
  %call2.i544545 = invoke %"class.std::basic_ostream"* @_ZSt16__ostream_insertIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_PKS3_i(%"class.std::basic_ostream"* @_ZSt4cout, i8* %122, i32 %123)
          to label %invoke.cont86 unwind label %lpad

invoke.cont86:                                    ; preds = %invoke.cont84
  %call1.i548550 = invoke %"class.std::basic_ostream"* @_ZSt16__ostream_insertIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_PKS3_i(%"class.std::basic_ostream"* %call2.i544545, i8* getelementptr inbounds ([8 x i8]* @.str7, i32 0, i32 0), i32 7)
          to label %invoke.cont88 unwind label %lpad

invoke.cont88:                                    ; preds = %invoke.cont86
  %124 = load i8** getelementptr inbounds (%"class.std::basic_string"* @_ZL8haystack, i32 0, i32 0, i32 0), align 4, !tbaa !0
  %arrayidx.i.i.i552 = getelementptr inbounds i8* %124, i32 -12
  %_M_length.i.i553 = bitcast i8* %arrayidx.i.i.i552 to i32*
  %125 = load i32* %_M_length.i.i553, align 4, !tbaa !4
  %call2.i554555 = invoke %"class.std::basic_ostream"* @_ZSt16__ostream_insertIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_PKS3_i(%"class.std::basic_ostream"* %call2.i544545, i8* %124, i32 %125)
          to label %invoke.cont90 unwind label %lpad

invoke.cont90:                                    ; preds = %invoke.cont88
  %call1.i558560 = invoke %"class.std::basic_ostream"* @_ZSt16__ostream_insertIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_PKS3_i(%"class.std::basic_ostream"* %call2.i554555, i8* getelementptr inbounds ([25 x i8]* @.str11, i32 0, i32 0), i32 24)
          to label %invoke.cont92 unwind label %lpad

invoke.cont92:                                    ; preds = %invoke.cont90
  %126 = bitcast %"class.std::basic_ostream"* %call2.i554555 to i8**
  %vtable.i565 = load i8** %126, align 4, !tbaa !5
  %vbase.offset.ptr.i566 = getelementptr i8* %vtable.i565, i32 -12
  %127 = bitcast i8* %vbase.offset.ptr.i566 to i32*
  %vbase.offset.i567 = load i32* %127, align 4
  %128 = bitcast %"class.std::basic_ostream"* %call2.i554555 to i8*
  %add.ptr.i568.sum = add i32 %vbase.offset.i567, 124
  %_M_ctype.i584 = getelementptr inbounds i8* %128, i32 %add.ptr.i568.sum
  %129 = bitcast i8* %_M_ctype.i584 to %"class.std::ctype"**
  %130 = load %"class.std::ctype"** %129, align 4, !tbaa !0
  %tobool.i607 = icmp eq %"class.std::ctype"* %130, null
  br i1 %tobool.i607, label %if.then.i608, label %call.i585.noexc

if.then.i608:                                     ; preds = %invoke.cont92
  invoke void @_ZSt16__throw_bad_castv() noreturn
          to label %.noexc610 unwind label %lpad

.noexc610:                                        ; preds = %if.then.i608
  unreachable

call.i585.noexc:                                  ; preds = %invoke.cont92
  %_M_widen_ok.i590 = getelementptr inbounds %"class.std::ctype"* %130, i32 0, i32 6
  %131 = load i8* %_M_widen_ok.i590, align 1, !tbaa !1
  %tobool.i591 = icmp eq i8 %131, 0
  br i1 %tobool.i591, label %if.end.i597, label %if.then.i593

if.then.i593:                                     ; preds = %call.i585.noexc
  %arrayidx.i592 = getelementptr inbounds %"class.std::ctype"* %130, i32 0, i32 7, i32 10
  %132 = load i8* %arrayidx.i592, align 1, !tbaa !1
  br label %call.i569.noexc

if.end.i597:                                      ; preds = %call.i585.noexc
  invoke void @_ZNKSt5ctypeIcE13_M_widen_initEv(%"class.std::ctype"* %130)
          to label %.noexc599 unwind label %lpad

.noexc599:                                        ; preds = %if.end.i597
  %133 = bitcast %"class.std::ctype"* %130 to i8 (%"class.std::ctype"*, i8)***
  %vtable.i594 = load i8 (%"class.std::ctype"*, i8)*** %133, align 4, !tbaa !5
  %vfn.i595 = getelementptr inbounds i8 (%"class.std::ctype"*, i8)** %vtable.i594, i32 6
  %134 = load i8 (%"class.std::ctype"*, i8)** %vfn.i595, align 4
  %call.i596600 = invoke signext i8 %134(%"class.std::ctype"* %130, i8 signext 10)
          to label %call.i569.noexc unwind label %lpad

call.i569.noexc:                                  ; preds = %.noexc599, %if.then.i593
  %retval.0.i598 = phi i8 [ %132, %if.then.i593 ], [ %call.i596600, %.noexc599 ]
  %call1.i570573 = invoke %"class.std::basic_ostream"* @_ZNSo3putEc(%"class.std::basic_ostream"* %call2.i554555, i8 signext %retval.0.i598)
          to label %call1.i570.noexc unwind label %lpad

call1.i570.noexc:                                 ; preds = %call.i569.noexc
  %call.i576577 = invoke %"class.std::basic_ostream"* @_ZNSo5flushEv(%"class.std::basic_ostream"* %call1.i570573)
          to label %invoke.cont105 unwind label %lpad

invoke.cont105:                                   ; preds = %call1.i570.noexc, %call1.i528.noexc
  %135 = load i8** getelementptr inbounds (%"class.std::basic_string"* @_ZL8haystack, i32 0, i32 0, i32 0), align 4, !tbaa !0
  %_M_current.i.i.i579 = getelementptr inbounds %"class.__gnu_cxx::__normal_iterator"* %agg.tmp98, i32 0, i32 0
  store i8* %135, i8** %_M_current.i.i.i579, align 4, !tbaa !0
  %arrayidx.i.i.i580 = getelementptr inbounds i8* %135, i32 -12
  %_M_length.i.i581 = bitcast i8* %arrayidx.i.i.i580 to i32*
  %136 = load i32* %_M_length.i.i581, align 4, !tbaa !4
  %add.ptr.i582 = getelementptr inbounds i8* %135, i32 %136
  %_M_current.i.i.i583 = getelementptr inbounds %"class.__gnu_cxx::__normal_iterator"* %agg.tmp100, i32 0, i32 0
  store i8* %add.ptr.i582, i8** %_M_current.i.i.i583, align 4, !tbaa !0
  %137 = load i8** getelementptr inbounds (%"class.std::basic_string"* @_ZL7needle1, i32 0, i32 0, i32 0), align 4, !tbaa !0
  %_M_current.i.i.i602 = getelementptr inbounds %"class.__gnu_cxx::__normal_iterator"* %agg.tmp102, i32 0, i32 0
  store i8* %137, i8** %_M_current.i.i.i602, align 4, !tbaa !0
  %arrayidx.i.i.i603 = getelementptr inbounds i8* %137, i32 -12
  %_M_length.i.i604 = bitcast i8* %arrayidx.i.i.i603 to i32*
  %138 = load i32* %_M_length.i.i604, align 4, !tbaa !4
  %add.ptr.i605 = getelementptr inbounds i8* %137, i32 %138
  %_M_current.i.i.i606 = getelementptr inbounds %"class.__gnu_cxx::__normal_iterator"* %agg.tmp104, i32 0, i32 0
  store i8* %add.ptr.i605, i8** %_M_current.i.i.i606, align 4, !tbaa !0
  invoke void @_ZN5boost9algorithm25knuth_morris_pratt_searchIN9__gnu_cxx17__normal_iteratorIPKcSsEES6_EET0_S7_S7_T_S8_(%"class.__gnu_cxx::__normal_iterator"* sret %ref.tmp97, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %agg.tmp98, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %agg.tmp100, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %agg.tmp102, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %agg.tmp104)
          to label %invoke.cont108 unwind label %lpad

invoke.cont108:                                   ; preds = %invoke.cont105
  %139 = load i8** getelementptr inbounds (%"class.std::basic_string"* @_ZL8haystack, i32 0, i32 0, i32 0), align 4, !tbaa !0
  %arrayidx.i.i.i612 = getelementptr inbounds i8* %139, i32 -12
  %_M_length.i.i613 = bitcast i8* %arrayidx.i.i.i612 to i32*
  %140 = load i32* %_M_length.i.i613, align 4, !tbaa !4
  %add.ptr.i614 = getelementptr inbounds i8* %139, i32 %140
  %_M_current.i.i616 = getelementptr inbounds %"class.__gnu_cxx::__normal_iterator"* %ref.tmp97, i32 0, i32 0
  %141 = load i8** %_M_current.i.i616, align 4, !tbaa !0
  %cmp.i618 = icmp eq i8* %141, %add.ptr.i614
  br i1 %cmp.i618, label %if.else124, label %if.then111

if.then111:                                       ; preds = %invoke.cont108
  %call1.i620622 = invoke %"class.std::basic_ostream"* @_ZSt16__ostream_insertIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_PKS3_i(%"class.std::basic_ostream"* @_ZSt4cout, i8* getelementptr inbounds ([8 x i8]* @.str6, i32 0, i32 0), i32 7)
          to label %invoke.cont112 unwind label %lpad

invoke.cont112:                                   ; preds = %if.then111
  %142 = load i8** getelementptr inbounds (%"class.std::basic_string"* @_ZL7needle1, i32 0, i32 0, i32 0), align 4, !tbaa !0
  %arrayidx.i.i.i624 = getelementptr inbounds i8* %142, i32 -12
  %_M_length.i.i625 = bitcast i8* %arrayidx.i.i.i624 to i32*
  %143 = load i32* %_M_length.i.i625, align 4, !tbaa !4
  %call2.i626627 = invoke %"class.std::basic_ostream"* @_ZSt16__ostream_insertIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_PKS3_i(%"class.std::basic_ostream"* @_ZSt4cout, i8* %142, i32 %143)
          to label %invoke.cont114 unwind label %lpad

invoke.cont114:                                   ; preds = %invoke.cont112
  %call1.i630632 = invoke %"class.std::basic_ostream"* @_ZSt16__ostream_insertIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_PKS3_i(%"class.std::basic_ostream"* %call2.i626627, i8* getelementptr inbounds ([8 x i8]* @.str7, i32 0, i32 0), i32 7)
          to label %invoke.cont116 unwind label %lpad

invoke.cont116:                                   ; preds = %invoke.cont114
  %144 = load i8** getelementptr inbounds (%"class.std::basic_string"* @_ZL8haystack, i32 0, i32 0, i32 0), align 4, !tbaa !0
  %arrayidx.i.i.i634 = getelementptr inbounds i8* %144, i32 -12
  %_M_length.i.i635 = bitcast i8* %arrayidx.i.i.i634 to i32*
  %145 = load i32* %_M_length.i.i635, align 4, !tbaa !4
  %call2.i636637 = invoke %"class.std::basic_ostream"* @_ZSt16__ostream_insertIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_PKS3_i(%"class.std::basic_ostream"* %call2.i626627, i8* %144, i32 %145)
          to label %invoke.cont118 unwind label %lpad

invoke.cont118:                                   ; preds = %invoke.cont116
  %call1.i640642 = invoke %"class.std::basic_ostream"* @_ZSt16__ostream_insertIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_PKS3_i(%"class.std::basic_ostream"* %call2.i636637, i8* getelementptr inbounds ([23 x i8]* @.str12, i32 0, i32 0), i32 22)
          to label %invoke.cont120 unwind label %lpad

invoke.cont120:                                   ; preds = %invoke.cont118
  %146 = bitcast %"class.std::basic_ostream"* %call2.i636637 to i8**
  %vtable.i647 = load i8** %146, align 4, !tbaa !5
  %vbase.offset.ptr.i648 = getelementptr i8* %vtable.i647, i32 -12
  %147 = bitcast i8* %vbase.offset.ptr.i648 to i32*
  %vbase.offset.i649 = load i32* %147, align 4
  %148 = bitcast %"class.std::basic_ostream"* %call2.i636637 to i8*
  %add.ptr.i650.sum = add i32 %vbase.offset.i649, 124
  %_M_ctype.i740 = getelementptr inbounds i8* %148, i32 %add.ptr.i650.sum
  %149 = bitcast i8* %_M_ctype.i740 to %"class.std::ctype"**
  %150 = load %"class.std::ctype"** %149, align 4, !tbaa !0
  %tobool.i772 = icmp eq %"class.std::ctype"* %150, null
  br i1 %tobool.i772, label %if.then.i773, label %call.i741.noexc

if.then.i773:                                     ; preds = %invoke.cont120
  invoke void @_ZSt16__throw_bad_castv() noreturn
          to label %.noexc775 unwind label %lpad

.noexc775:                                        ; preds = %if.then.i773
  unreachable

call.i741.noexc:                                  ; preds = %invoke.cont120
  %_M_widen_ok.i746 = getelementptr inbounds %"class.std::ctype"* %150, i32 0, i32 6
  %151 = load i8* %_M_widen_ok.i746, align 1, !tbaa !1
  %tobool.i747 = icmp eq i8 %151, 0
  br i1 %tobool.i747, label %if.end.i753, label %if.then.i749

if.then.i749:                                     ; preds = %call.i741.noexc
  %arrayidx.i748 = getelementptr inbounds %"class.std::ctype"* %150, i32 0, i32 7, i32 10
  %152 = load i8* %arrayidx.i748, align 1, !tbaa !1
  br label %call.i651.noexc

if.end.i753:                                      ; preds = %call.i741.noexc
  invoke void @_ZNKSt5ctypeIcE13_M_widen_initEv(%"class.std::ctype"* %150)
          to label %.noexc755 unwind label %lpad

.noexc755:                                        ; preds = %if.end.i753
  %153 = bitcast %"class.std::ctype"* %150 to i8 (%"class.std::ctype"*, i8)***
  %vtable.i750 = load i8 (%"class.std::ctype"*, i8)*** %153, align 4, !tbaa !5
  %vfn.i751 = getelementptr inbounds i8 (%"class.std::ctype"*, i8)** %vtable.i750, i32 6
  %154 = load i8 (%"class.std::ctype"*, i8)** %vfn.i751, align 4
  %call.i752756 = invoke signext i8 %154(%"class.std::ctype"* %150, i8 signext 10)
          to label %call.i651.noexc unwind label %lpad

call.i651.noexc:                                  ; preds = %.noexc755, %if.then.i749
  %retval.0.i754 = phi i8 [ %152, %if.then.i749 ], [ %call.i752756, %.noexc755 ]
  %call1.i652655 = invoke %"class.std::basic_ostream"* @_ZNSo3putEc(%"class.std::basic_ostream"* %call2.i636637, i8 signext %retval.0.i754)
          to label %call1.i652.noexc unwind label %lpad

call1.i652.noexc:                                 ; preds = %call.i651.noexc
  %call.i658659 = invoke %"class.std::basic_ostream"* @_ZNSo5flushEv(%"class.std::basic_ostream"* %call1.i652655)
          to label %if.end137 unwind label %lpad

if.else124:                                       ; preds = %invoke.cont108
  %call1.i662664 = invoke %"class.std::basic_ostream"* @_ZSt16__ostream_insertIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_PKS3_i(%"class.std::basic_ostream"* @_ZSt4cout, i8* getelementptr inbounds ([15 x i8]* @.str9, i32 0, i32 0), i32 14)
          to label %invoke.cont125 unwind label %lpad

invoke.cont125:                                   ; preds = %if.else124
  %155 = load i8** getelementptr inbounds (%"class.std::basic_string"* @_ZL7needle1, i32 0, i32 0, i32 0), align 4, !tbaa !0
  %arrayidx.i.i.i666 = getelementptr inbounds i8* %155, i32 -12
  %_M_length.i.i667 = bitcast i8* %arrayidx.i.i.i666 to i32*
  %156 = load i32* %_M_length.i.i667, align 4, !tbaa !4
  %call2.i668669 = invoke %"class.std::basic_ostream"* @_ZSt16__ostream_insertIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_PKS3_i(%"class.std::basic_ostream"* @_ZSt4cout, i8* %155, i32 %156)
          to label %invoke.cont127 unwind label %lpad

invoke.cont127:                                   ; preds = %invoke.cont125
  %call1.i672674 = invoke %"class.std::basic_ostream"* @_ZSt16__ostream_insertIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_PKS3_i(%"class.std::basic_ostream"* %call2.i668669, i8* getelementptr inbounds ([8 x i8]* @.str7, i32 0, i32 0), i32 7)
          to label %invoke.cont129 unwind label %lpad

invoke.cont129:                                   ; preds = %invoke.cont127
  %157 = load i8** getelementptr inbounds (%"class.std::basic_string"* @_ZL8haystack, i32 0, i32 0, i32 0), align 4, !tbaa !0
  %arrayidx.i.i.i676 = getelementptr inbounds i8* %157, i32 -12
  %_M_length.i.i677 = bitcast i8* %arrayidx.i.i.i676 to i32*
  %158 = load i32* %_M_length.i.i677, align 4, !tbaa !4
  %call2.i678679 = invoke %"class.std::basic_ostream"* @_ZSt16__ostream_insertIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_PKS3_i(%"class.std::basic_ostream"* %call2.i668669, i8* %157, i32 %158)
          to label %invoke.cont131 unwind label %lpad

invoke.cont131:                                   ; preds = %invoke.cont129
  %call1.i682684 = invoke %"class.std::basic_ostream"* @_ZSt16__ostream_insertIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_PKS3_i(%"class.std::basic_ostream"* %call2.i678679, i8* getelementptr inbounds ([23 x i8]* @.str12, i32 0, i32 0), i32 22)
          to label %invoke.cont133 unwind label %lpad

invoke.cont133:                                   ; preds = %invoke.cont131
  %159 = bitcast %"class.std::basic_ostream"* %call2.i678679 to i8**
  %vtable.i = load i8** %159, align 4, !tbaa !5
  %vbase.offset.ptr.i = getelementptr i8* %vtable.i, i32 -12
  %160 = bitcast i8* %vbase.offset.ptr.i to i32*
  %vbase.offset.i = load i32* %160, align 4
  %161 = bitcast %"class.std::basic_ostream"* %call2.i678679 to i8*
  %add.ptr.i142.sum = add i32 %vbase.offset.i, 124
  %_M_ctype.i = getelementptr inbounds i8* %161, i32 %add.ptr.i142.sum
  %162 = bitcast i8* %_M_ctype.i to %"class.std::ctype"**
  %163 = load %"class.std::ctype"** %162, align 4, !tbaa !0
  %tobool.i686 = icmp eq %"class.std::ctype"* %163, null
  br i1 %tobool.i686, label %if.then.i687, label %call.i.noexc153

if.then.i687:                                     ; preds = %invoke.cont133
  invoke void @_ZSt16__throw_bad_castv() noreturn
          to label %.noexc689 unwind label %lpad

.noexc689:                                        ; preds = %if.then.i687
  unreachable

call.i.noexc153:                                  ; preds = %invoke.cont133
  %_M_widen_ok.i = getelementptr inbounds %"class.std::ctype"* %163, i32 0, i32 6
  %164 = load i8* %_M_widen_ok.i, align 1, !tbaa !1
  %tobool.i = icmp eq i8 %164, 0
  br i1 %tobool.i, label %if.end.i, label %if.then.i

if.then.i:                                        ; preds = %call.i.noexc153
  %arrayidx.i = getelementptr inbounds %"class.std::ctype"* %163, i32 0, i32 7, i32 10
  %165 = load i8* %arrayidx.i, align 1, !tbaa !1
  br label %call.i.noexc

if.end.i:                                         ; preds = %call.i.noexc153
  invoke void @_ZNKSt5ctypeIcE13_M_widen_initEv(%"class.std::ctype"* %163)
          to label %.noexc unwind label %lpad

.noexc:                                           ; preds = %if.end.i
  %166 = bitcast %"class.std::ctype"* %163 to i8 (%"class.std::ctype"*, i8)***
  %vtable.i156 = load i8 (%"class.std::ctype"*, i8)*** %166, align 4, !tbaa !5
  %vfn.i = getelementptr inbounds i8 (%"class.std::ctype"*, i8)** %vtable.i156, i32 6
  %167 = load i8 (%"class.std::ctype"*, i8)** %vfn.i, align 4
  %call.i158 = invoke signext i8 %167(%"class.std::ctype"* %163, i8 signext 10)
          to label %call.i.noexc unwind label %lpad

call.i.noexc:                                     ; preds = %.noexc, %if.then.i
  %retval.0.i = phi i8 [ %165, %if.then.i ], [ %call.i158, %.noexc ]
  %call1.i144 = invoke %"class.std::basic_ostream"* @_ZNSo3putEc(%"class.std::basic_ostream"* %call2.i678679, i8 signext %retval.0.i)
          to label %call1.i.noexc unwind label %lpad

call1.i.noexc:                                    ; preds = %call.i.noexc
  %call.i147 = invoke %"class.std::basic_ostream"* @_ZNSo5flushEv(%"class.std::basic_ostream"* %call1.i144)
          to label %if.end137 unwind label %lpad

if.end137:                                        ; preds = %call1.i.noexc, %call1.i652.noexc
  %_M_start.i.i.i.i.i = getelementptr inbounds %"class.boost::algorithm::boyer_moore"* %search1, i32 0, i32 4, i32 0, i32 0, i32 0
  %168 = load i32** %_M_start.i.i.i.i.i, align 4, !tbaa !0
  %tobool.i.i.i.i.i.i = icmp eq i32* %168, null
  br i1 %tobool.i.i.i.i.i.i, label %_ZN5boost9algorithm11boyer_mooreIN9__gnu_cxx17__normal_iteratorIPKcSsEENS0_6detail9BM_traitsIS6_EEED1Ev.exit, label %if.then.i.i.i.i.i.i

if.then.i.i.i.i.i.i:                              ; preds = %if.end137
  %169 = bitcast i32* %168 to i8*
  call void @_ZdlPv(i8* %169) nounwind
  br label %_ZN5boost9algorithm11boyer_mooreIN9__gnu_cxx17__normal_iteratorIPKcSsEENS0_6detail9BM_traitsIS6_EEED1Ev.exit

_ZN5boost9algorithm11boyer_mooreIN9__gnu_cxx17__normal_iteratorIPKcSsEENS0_6detail9BM_traitsIS6_EEED1Ev.exit: ; preds = %if.end137, %if.then.i.i.i.i.i.i
  ret i32 0

eh.resume:                                        ; preds = %if.then.i.i.i.i.i.i360, %lpad
  resume { i8*, i32 } %74
}

define linkonce_odr void @_ZN5boost9algorithm25knuth_morris_pratt_searchIN9__gnu_cxx17__normal_iteratorIPKcSsEES6_EET0_S7_S7_T_S8_(%"class.__gnu_cxx::__normal_iterator"* noalias nocapture sret %agg.result, %"class.__gnu_cxx::__normal_iterator"* nocapture byval align 4 %corpus_first, %"class.__gnu_cxx::__normal_iterator"* nocapture byval align 4 %corpus_last, %"class.__gnu_cxx::__normal_iterator"* nocapture byval align 4 %pat_first, %"class.__gnu_cxx::__normal_iterator"* nocapture byval align 4 %pat_last) {
entry:
  %agg.tmp18 = alloca %"class.__gnu_cxx::__normal_iterator", align 8
  %agg.tmp6 = alloca %"class.__gnu_cxx::__normal_iterator", align 8
  %kmp = alloca %"class.boost::algorithm::knuth_morris_pratt", align 4
  %0 = getelementptr inbounds %"class.__gnu_cxx::__normal_iterator"* %pat_first, i32 0, i32 0
  %1 = load i8** %0, align 4, !tbaa !0
  %2 = getelementptr inbounds %"class.__gnu_cxx::__normal_iterator"* %pat_last, i32 0, i32 0
  %3 = load i8** %2, align 4, !tbaa !0
  %agg.tmp.sroa.0.0.tmp.idx = getelementptr inbounds %"class.__gnu_cxx::__normal_iterator"* %agg.tmp6, i32 0, i32 0
  store i8* %1, i8** %agg.tmp.sroa.0.0.tmp.idx, align 8
  %agg.tmp1.sroa.0.0.tmp9.idx = getelementptr inbounds %"class.__gnu_cxx::__normal_iterator"* %agg.tmp18, i32 0, i32 0
  store i8* %3, i8** %agg.tmp1.sroa.0.0.tmp9.idx, align 8
  call void @_ZN5boost9algorithm18knuth_morris_prattIN9__gnu_cxx17__normal_iteratorIPKcSsEEEC2ES6_S6_(%"class.boost::algorithm::knuth_morris_pratt"* %kmp, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %agg.tmp6, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %agg.tmp18)
  %4 = getelementptr inbounds %"class.__gnu_cxx::__normal_iterator"* %corpus_first, i32 0, i32 0
  %5 = load i8** %4, align 4, !tbaa !0
  %6 = getelementptr inbounds %"class.__gnu_cxx::__normal_iterator"* %corpus_last, i32 0, i32 0
  %7 = load i8** %6, align 4, !tbaa !0
  %cmp.i.i = icmp eq i8* %5, %7
  br i1 %cmp.i.i, label %if.then.i, label %if.end.i

if.then.i:                                        ; preds = %entry
  %8 = getelementptr inbounds %"class.__gnu_cxx::__normal_iterator"* %agg.result, i32 0, i32 0
  store i8* %5, i8** %8, align 4, !tbaa !0
  br label %invoke.cont

if.end.i:                                         ; preds = %entry
  %_M_current.i.i19.i = getelementptr inbounds %"class.boost::algorithm::knuth_morris_pratt"* %kmp, i32 0, i32 0, i32 0
  %9 = load i8** %_M_current.i.i19.i, align 4, !tbaa !0
  %_M_current.i2.i20.i = getelementptr inbounds %"class.boost::algorithm::knuth_morris_pratt"* %kmp, i32 0, i32 1, i32 0
  %10 = load i8** %_M_current.i2.i20.i, align 4, !tbaa !0
  %cmp.i21.i = icmp eq i8* %9, %10
  br i1 %cmp.i21.i, label %if.then3.i, label %if.end4.i

if.then3.i:                                       ; preds = %if.end.i
  %11 = getelementptr inbounds %"class.__gnu_cxx::__normal_iterator"* %agg.result, i32 0, i32 0
  store i8* %5, i8** %11, align 4, !tbaa !0
  br label %invoke.cont

if.end4.i:                                        ; preds = %if.end.i
  %sub.ptr.lhs.cast.i.i.i.i = ptrtoint i8* %7 to i32
  %sub.ptr.rhs.cast.i.i.i.i = ptrtoint i8* %5 to i32
  %sub.ptr.sub.i.i.i.i = sub i32 %sub.ptr.lhs.cast.i.i.i.i, %sub.ptr.rhs.cast.i.i.i.i
  %k_pattern_length.i = getelementptr inbounds %"class.boost::algorithm::knuth_morris_pratt"* %kmp, i32 0, i32 2
  %12 = load i32* %k_pattern_length.i, align 4, !tbaa !4
  %cmp.i = icmp slt i32 %sub.ptr.sub.i.i.i.i, %12
  br i1 %cmp.i, label %if.then7.i, label %if.end8.i

if.then7.i:                                       ; preds = %if.end4.i
  %13 = getelementptr inbounds %"class.__gnu_cxx::__normal_iterator"* %agg.result, i32 0, i32 0
  store i8* %7, i8** %13, align 4, !tbaa !0
  br label %invoke.cont

if.end8.i:                                        ; preds = %if.end4.i
  %sub.i.i = sub nsw i32 %sub.ptr.sub.i.i.i.i, %12
  %cmp37.i.i = icmp slt i32 %sub.i.i, 0
  br i1 %cmp37.i.i, label %while.end17.i.i, label %while.cond2.preheader.lr.ph.i.i

while.cond2.preheader.lr.ph.i.i:                  ; preds = %if.end8.i
  %_M_start.i20.i.i = getelementptr inbounds %"class.boost::algorithm::knuth_morris_pratt"* %kmp, i32 0, i32 3, i32 0, i32 0, i32 0
  %14 = load i32** %_M_start.i20.i.i, align 4, !tbaa !0
  br label %while.cond2.preheader.i.i

while.cond2.preheader.i.i:                        ; preds = %while.end.i.i, %while.cond2.preheader.lr.ph.i.i
  %storemerge38.i.i = phi i32 [ 0, %while.cond2.preheader.lr.ph.i.i ], [ %..i.i, %while.end.i.i ]
  %15 = phi i32 [ 0, %while.cond2.preheader.lr.ph.i.i ], [ %add11.i.i, %while.end.i.i ]
  br label %while.cond2.i.i

while.cond2.i.i:                                  ; preds = %while.body6.i.i, %while.cond2.preheader.i.i
  %idx.0.load2933.i.i = phi i32 [ %inc.i.i, %while.body6.i.i ], [ %storemerge38.i.i, %while.cond2.preheader.i.i ]
  %arrayidx.i.i.i = getelementptr inbounds i8* %9, i32 %idx.0.load2933.i.i
  %16 = load i8* %arrayidx.i.i.i, align 1, !tbaa !1
  %add.i.i = add i32 %idx.0.load2933.i.i, %15
  %arrayidx.i25.i.i = getelementptr inbounds i8* %5, i32 %add.i.i
  %17 = load i8* %arrayidx.i25.i.i, align 1, !tbaa !1
  %cmp5.i.i = icmp eq i8 %16, %17
  br i1 %cmp5.i.i, label %while.body6.i.i, label %while.end.i.i

while.body6.i.i:                                  ; preds = %while.cond2.i.i
  %inc.i.i = add nsw i32 %idx.0.load2933.i.i, 1
  %cmp8.i.i = icmp eq i32 %inc.i.i, %12
  br i1 %cmp8.i.i, label %if.then.i.i, label %while.cond2.i.i

if.then.i.i:                                      ; preds = %while.body6.i.i
  %add.ptr.i23.i.i = getelementptr inbounds i8* %5, i32 %15
  %_M_current.i.i.i.i.i = getelementptr inbounds %"class.__gnu_cxx::__normal_iterator"* %agg.result, i32 0, i32 0
  store i8* %add.ptr.i23.i.i, i8** %_M_current.i.i.i.i.i, align 4, !tbaa !0
  br label %invoke.cont

while.end.i.i:                                    ; preds = %while.cond2.i.i
  %add.ptr.i21.i.i = getelementptr inbounds i32* %14, i32 %idx.0.load2933.i.i
  %18 = load i32* %add.ptr.i21.i.i, align 4, !tbaa !4
  %add11.i.i = sub i32 %add.i.i, %18
  %cmp14.i.i = icmp slt i32 %18, 0
  %..i.i = select i1 %cmp14.i.i, i32 0, i32 %18
  %cmp.i18.i = icmp sgt i32 %add11.i.i, %sub.i.i
  br i1 %cmp.i18.i, label %while.end17.i.i, label %while.cond2.preheader.i.i

while.end17.i.i:                                  ; preds = %while.end.i.i, %if.end8.i
  %19 = getelementptr inbounds %"class.__gnu_cxx::__normal_iterator"* %agg.result, i32 0, i32 0
  store i8* %7, i8** %19, align 4, !tbaa !0
  br label %invoke.cont

invoke.cont:                                      ; preds = %while.end17.i.i, %if.then.i.i, %if.then7.i, %if.then3.i, %if.then.i
  %_M_start.i.i.i.i.i = getelementptr inbounds %"class.boost::algorithm::knuth_morris_pratt"* %kmp, i32 0, i32 3, i32 0, i32 0, i32 0
  %20 = load i32** %_M_start.i.i.i.i.i, align 4, !tbaa !0
  %tobool.i.i.i.i.i.i = icmp eq i32* %20, null
  br i1 %tobool.i.i.i.i.i.i, label %_ZN5boost9algorithm18knuth_morris_prattIN9__gnu_cxx17__normal_iteratorIPKcSsEEED1Ev.exit, label %if.then.i.i.i.i.i.i

if.then.i.i.i.i.i.i:                              ; preds = %invoke.cont
  %21 = bitcast i32* %20 to i8*
  call void @_ZdlPv(i8* %21) nounwind
  br label %_ZN5boost9algorithm18knuth_morris_prattIN9__gnu_cxx17__normal_iteratorIPKcSsEEED1Ev.exit

_ZN5boost9algorithm18knuth_morris_prattIN9__gnu_cxx17__normal_iteratorIPKcSsEEED1Ev.exit: ; preds = %invoke.cont, %if.then.i.i.i.i.i.i
  ret void
}

declare void @_ZdlPv(i8*) nounwind

define linkonce_odr void @_ZN5boost9algorithm18knuth_morris_prattIN9__gnu_cxx17__normal_iteratorIPKcSsEEEC2ES6_S6_(%"class.boost::algorithm::knuth_morris_pratt"* nocapture %this, %"class.__gnu_cxx::__normal_iterator"* nocapture byval align 4 %first, %"class.__gnu_cxx::__normal_iterator"* nocapture byval align 4 %last) unnamed_addr align 2 {
entry:
  %0 = bitcast %"class.__gnu_cxx::__normal_iterator"* %first to i32*
  %1 = load i32* %0, align 4
  %2 = getelementptr inbounds %"class.boost::algorithm::knuth_morris_pratt"* %this, i32 0, i32 0, i32 0
  %.c = inttoptr i32 %1 to i8*
  store i8* %.c, i8** %2, align 4
  %3 = getelementptr inbounds %"class.__gnu_cxx::__normal_iterator"* %last, i32 0, i32 0
  %4 = load i8** %3, align 4, !tbaa !0
  %5 = getelementptr inbounds %"class.boost::algorithm::knuth_morris_pratt"* %this, i32 0, i32 1, i32 0
  store i8* %4, i8** %5, align 4, !tbaa !0
  %k_pattern_length = getelementptr inbounds %"class.boost::algorithm::knuth_morris_pratt"* %this, i32 0, i32 2
  %sub.ptr.lhs.cast.i.i.i = ptrtoint i8* %4 to i32
  %sub.ptr.sub.i.i.i = sub i32 %sub.ptr.lhs.cast.i.i.i, %1
  store i32 %sub.ptr.sub.i.i.i, i32* %k_pattern_length, align 4, !tbaa !4
  %add = add nsw i32 %sub.ptr.sub.i.i.i, 1
  %_M_start.i.i.i.i.i = getelementptr inbounds %"class.boost::algorithm::knuth_morris_pratt"* %this, i32 0, i32 3, i32 0, i32 0, i32 0
  store i32* null, i32** %_M_start.i.i.i.i.i, align 4, !tbaa !0
  %_M_finish.i.i.i.i.i = getelementptr inbounds %"class.boost::algorithm::knuth_morris_pratt"* %this, i32 0, i32 3, i32 0, i32 0, i32 1
  store i32* null, i32** %_M_finish.i.i.i.i.i, align 4, !tbaa !0
  %_M_end_of_storage.i.i.i.i.i = getelementptr inbounds %"class.boost::algorithm::knuth_morris_pratt"* %this, i32 0, i32 3, i32 0, i32 0, i32 2
  store i32* null, i32** %_M_end_of_storage.i.i.i.i.i, align 4, !tbaa !0
  %cmp.i.i.i.i = icmp eq i32 %add, 0
  br i1 %cmp.i.i.i.i, label %_ZNSt12_Vector_baseIiSaIiEEC2EjRKS0_.exit.thread.i.i, label %cond.true.i.i.i.i

_ZNSt12_Vector_baseIiSaIiEEC2EjRKS0_.exit.thread.i.i: ; preds = %entry
  store i32* null, i32** %_M_start.i.i.i.i.i, align 4, !tbaa !0
  store i32* null, i32** %_M_finish.i.i.i.i.i, align 4, !tbaa !0
  store i32* null, i32** %_M_end_of_storage.i.i.i.i.i, align 4, !tbaa !0
  br label %invoke.cont

cond.true.i.i.i.i:                                ; preds = %entry
  %cmp.i.i.i.i.i = icmp ugt i32 %add, 1073741823
  br i1 %cmp.i.i.i.i.i, label %if.then.i.i.i.i.i, label %for.body.i.i.i.i.i.preheader.i.i.i

if.then.i.i.i.i.i:                                ; preds = %cond.true.i.i.i.i
  call void @_ZSt17__throw_bad_allocv() noreturn
  unreachable

for.body.i.i.i.i.i.preheader.i.i.i:               ; preds = %cond.true.i.i.i.i
  %mul.i.i.i.i.i = shl i32 %add, 2
  %call2.i.i11.i.i.i20 = call noalias i8* @_Znwj(i32 %mul.i.i.i.i.i)
  %6 = bitcast i8* %call2.i.i11.i.i.i20 to i32*
  store i32* %6, i32** %_M_start.i.i.i.i.i, align 4, !tbaa !0
  store i32* %6, i32** %_M_finish.i.i.i.i.i, align 4, !tbaa !0
  %add.ptr.i.i.i = getelementptr inbounds i32* %6, i32 %add
  store i32* %add.ptr.i.i.i, i32** %_M_end_of_storage.i.i.i.i.i, align 4, !tbaa !0
  %7 = add i32 %sub.ptr.lhs.cast.i.i.i, 1
  %8 = sub i32 %7, %1
  %9 = shl i32 %8, 2
  call void @llvm.memset.p0i8.i32(i8* %call2.i.i11.i.i.i20, i8 0, i32 %9, i32 4, i1 false)
  br label %invoke.cont

invoke.cont:                                      ; preds = %for.body.i.i.i.i.i.preheader.i.i.i, %_ZNSt12_Vector_baseIiSaIiEEC2EjRKS0_.exit.thread.i.i
  %10 = phi i32* [ null, %_ZNSt12_Vector_baseIiSaIiEEC2EjRKS0_.exit.thread.i.i ], [ %6, %for.body.i.i.i.i.i.preheader.i.i.i ]
  %11 = phi i32* [ null, %_ZNSt12_Vector_baseIiSaIiEEC2EjRKS0_.exit.thread.i.i ], [ %add.ptr.i.i.i, %for.body.i.i.i.i.i.preheader.i.i.i ]
  store i32* %11, i32** %_M_finish.i.i.i.i.i, align 4, !tbaa !0
  store i32 -1, i32* %10, align 4, !tbaa !4
  %cmp32.i = icmp slt i32 %sub.ptr.sub.i.i.i, 1
  br i1 %cmp32.i, label %invoke.cont12, label %for.body.lr.ph.i

for.body.lr.ph.i:                                 ; preds = %invoke.cont
  %12 = sub i32 1, %1
  %13 = add i32 %12, %sub.ptr.lhs.cast.i.i.i
  br label %for.body.i

for.body.i:                                       ; preds = %while.end.i, %for.body.lr.ph.i
  %storemerge29.i = phi i32 [ -1, %for.body.lr.ph.i ], [ %add.i, %while.end.i ]
  %i.033.i = phi i32 [ 1, %for.body.lr.ph.i ], [ %inc.i, %while.end.i ]
  %cmp630.i = icmp sgt i32 %storemerge29.i, -1
  br i1 %cmp630.i, label %while.body.lr.ph.i, label %while.end.i

while.body.lr.ph.i:                               ; preds = %for.body.i
  %sub.i = add nsw i32 %i.033.i, -1
  %arrayidx.i.i = getelementptr inbounds i8* %.c, i32 %sub.i
  %14 = load i8* %arrayidx.i.i, align 1, !tbaa !1
  br label %while.body.i

while.body.i:                                     ; preds = %if.end.i, %while.body.lr.ph.i
  %storemerge31.i = phi i32 [ %storemerge29.i, %while.body.lr.ph.i ], [ %storemerge.i, %if.end.i ]
  %arrayidx.i23.i = getelementptr inbounds i8* %.c, i32 %storemerge31.i
  %15 = load i8* %arrayidx.i23.i, align 1, !tbaa !1
  %cmp11.i = icmp eq i8 %15, %14
  br i1 %cmp11.i, label %while.end.i, label %if.end.i

if.end.i:                                         ; preds = %while.body.i
  %add.ptr.i21.i = getelementptr inbounds i32* %10, i32 %storemerge31.i
  %storemerge.i = load i32* %add.ptr.i21.i, align 4
  %cmp6.i = icmp sgt i32 %storemerge.i, -1
  br i1 %cmp6.i, label %while.body.i, label %while.end.i

while.end.i:                                      ; preds = %if.end.i, %while.body.i, %for.body.i
  %storemerge.lcssa.i = phi i32 [ %storemerge29.i, %for.body.i ], [ %storemerge.i, %if.end.i ], [ %storemerge31.i, %while.body.i ]
  %add.i = add nsw i32 %storemerge.lcssa.i, 1
  %add.ptr.i.i = getelementptr inbounds i32* %10, i32 %i.033.i
  store i32 %add.i, i32* %add.ptr.i.i, align 4, !tbaa !4
  %inc.i = add nsw i32 %i.033.i, 1
  %exitcond.i = icmp eq i32 %inc.i, %13
  br i1 %exitcond.i, label %invoke.cont12, label %for.body.i

invoke.cont12:                                    ; preds = %while.end.i, %invoke.cont
  ret void
}

declare void @_ZSt17__throw_bad_allocv() noreturn

declare noalias i8* @_Znwj(i32)

declare %"class.std::basic_ostream"* @_ZSt16__ostream_insertIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_PKS3_i(%"class.std::basic_ostream"*, i8*, i32)

define linkonce_odr void @_ZN5boost9algorithm11boyer_mooreIN9__gnu_cxx17__normal_iteratorIPKcSsEENS0_6detail9BM_traitsIS6_EEEC2ES6_S6_(%"class.boost::algorithm::boyer_moore"* nocapture %this, %"class.__gnu_cxx::__normal_iterator"* nocapture byval align 4 %first, %"class.__gnu_cxx::__normal_iterator"* nocapture byval align 4 %last) unnamed_addr align 2 {
entry:
  %agg.tmp12 = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %agg.tmp13 = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %0 = bitcast %"class.__gnu_cxx::__normal_iterator"* %first to i32*
  %1 = load i32* %0, align 4
  %2 = getelementptr inbounds %"class.boost::algorithm::boyer_moore"* %this, i32 0, i32 0, i32 0
  %.c = inttoptr i32 %1 to i8*
  store i8* %.c, i8** %2, align 4
  %3 = getelementptr inbounds %"class.__gnu_cxx::__normal_iterator"* %last, i32 0, i32 0
  %4 = load i8** %3, align 4, !tbaa !0
  %5 = getelementptr inbounds %"class.boost::algorithm::boyer_moore"* %this, i32 0, i32 1, i32 0
  store i8* %4, i8** %5, align 4, !tbaa !0
  %k_pattern_length = getelementptr inbounds %"class.boost::algorithm::boyer_moore"* %this, i32 0, i32 2
  %sub.ptr.lhs.cast.i.i.i = ptrtoint i8* %4 to i32
  %sub.ptr.sub.i.i.i = sub i32 %sub.ptr.lhs.cast.i.i.i, %1
  store i32 %sub.ptr.sub.i.i.i, i32* %k_pattern_length, align 4, !tbaa !4
  %arraydecay.i.i.i = getelementptr inbounds %"class.boost::algorithm::boyer_moore"* %this, i32 0, i32 3, i32 0, i32 0, i32 0
  %add = add nsw i32 %sub.ptr.sub.i.i.i, 1
  %_M_start.i.i.i.i.i = getelementptr inbounds %"class.boost::algorithm::boyer_moore"* %this, i32 0, i32 4, i32 0, i32 0, i32 0
  %6 = bitcast i32* %arraydecay.i.i.i to i8*
  call void @llvm.memset.p0i8.i64(i8* %6, i8 -1, i64 1028, i32 4, i1 false)
  store i32* null, i32** %_M_start.i.i.i.i.i, align 4, !tbaa !0
  %_M_finish.i.i.i.i.i = getelementptr inbounds %"class.boost::algorithm::boyer_moore"* %this, i32 0, i32 4, i32 0, i32 0, i32 1
  store i32* null, i32** %_M_finish.i.i.i.i.i, align 4, !tbaa !0
  %_M_end_of_storage.i.i.i.i.i = getelementptr inbounds %"class.boost::algorithm::boyer_moore"* %this, i32 0, i32 4, i32 0, i32 0, i32 2
  store i32* null, i32** %_M_end_of_storage.i.i.i.i.i, align 4, !tbaa !0
  %cmp.i.i.i.i22 = icmp eq i32 %add, 0
  br i1 %cmp.i.i.i.i22, label %_ZNSt12_Vector_baseIiSaIiEEC2EjRKS0_.exit.thread.i.i, label %cond.true.i.i.i.i

_ZNSt12_Vector_baseIiSaIiEEC2EjRKS0_.exit.thread.i.i: ; preds = %entry
  store i32* null, i32** %_M_start.i.i.i.i.i, align 4, !tbaa !0
  store i32* null, i32** %_M_finish.i.i.i.i.i, align 4, !tbaa !0
  store i32* null, i32** %_M_end_of_storage.i.i.i.i.i, align 4, !tbaa !0
  br label %invoke.cont

cond.true.i.i.i.i:                                ; preds = %entry
  %cmp.i.i.i.i.i = icmp ugt i32 %add, 1073741823
  br i1 %cmp.i.i.i.i.i, label %if.then.i.i.i.i.i, label %for.body.i.i.i.i.i.preheader.i.i.i

if.then.i.i.i.i.i:                                ; preds = %cond.true.i.i.i.i
  invoke void @_ZSt17__throw_bad_allocv() noreturn
          to label %.noexc unwind label %lpad

.noexc:                                           ; preds = %if.then.i.i.i.i.i
  unreachable

for.body.i.i.i.i.i.preheader.i.i.i:               ; preds = %cond.true.i.i.i.i
  %mul.i.i.i.i.i = shl i32 %add, 2
  %call2.i.i11.i.i.i23 = invoke noalias i8* @_Znwj(i32 %mul.i.i.i.i.i)
          to label %call2.i.i11.i.i.i.noexc unwind label %lpad

call2.i.i11.i.i.i.noexc:                          ; preds = %for.body.i.i.i.i.i.preheader.i.i.i
  %7 = bitcast i8* %call2.i.i11.i.i.i23 to i32*
  store i32* %7, i32** %_M_start.i.i.i.i.i, align 4, !tbaa !0
  store i32* %7, i32** %_M_finish.i.i.i.i.i, align 4, !tbaa !0
  %add.ptr.i.i.i = getelementptr inbounds i32* %7, i32 %add
  store i32* %add.ptr.i.i.i, i32** %_M_end_of_storage.i.i.i.i.i, align 4, !tbaa !0
  %8 = shl i32 %sub.ptr.sub.i.i.i, 2
  %9 = add i32 %8, 4
  call void @llvm.memset.p0i8.i32(i8* %call2.i.i11.i.i.i23, i8 0, i32 %9, i32 4, i1 false)
  br label %invoke.cont

invoke.cont:                                      ; preds = %call2.i.i11.i.i.i.noexc, %_ZNSt12_Vector_baseIiSaIiEEC2EjRKS0_.exit.thread.i.i
  %10 = phi i32* [ null, %_ZNSt12_Vector_baseIiSaIiEEC2EjRKS0_.exit.thread.i.i ], [ %add.ptr.i.i.i, %call2.i.i11.i.i.i.noexc ]
  store i32* %10, i32** %_M_finish.i.i.i.i.i, align 4, !tbaa !0
  %cmp.i6.i = icmp eq i8* %.c, %4
  br i1 %cmp.i6.i, label %invoke.cont11, label %for.body.i

for.body.i:                                       ; preds = %invoke.cont, %for.body.i
  %11 = phi i8* [ %incdec.ptr.i.i, %for.body.i ], [ %.c, %invoke.cont ]
  %i.07.i = phi i32 [ %inc.i, %for.body.i ], [ 0, %invoke.cont ]
  %12 = load i8* %11, align 1, !tbaa !1
  %conv.i.i = zext i8 %12 to i32
  %arrayidx.i.i.i = getelementptr inbounds %"class.boost::algorithm::boyer_moore"* %this, i32 0, i32 3, i32 0, i32 0, i32 %conv.i.i
  store i32 %i.07.i, i32* %arrayidx.i.i.i, align 4, !tbaa !4
  %incdec.ptr.i.i = getelementptr inbounds i8* %11, i32 1
  %inc.i = add i32 %i.07.i, 1
  %cmp.i.i = icmp eq i8* %incdec.ptr.i.i, %4
  br i1 %cmp.i.i, label %invoke.cont11, label %for.body.i

invoke.cont11:                                    ; preds = %for.body.i, %invoke.cont
  %13 = getelementptr inbounds %"class.__gnu_cxx::__normal_iterator"* %agg.tmp12, i32 0, i32 0
  store i8* %.c, i8** %13, align 4, !tbaa !0
  %14 = getelementptr inbounds %"class.__gnu_cxx::__normal_iterator"* %agg.tmp13, i32 0, i32 0
  store i8* %4, i8** %14, align 4, !tbaa !0
  invoke void @_ZN5boost9algorithm11boyer_mooreIN9__gnu_cxx17__normal_iteratorIPKcSsEENS0_6detail9BM_traitsIS6_EEE18build_suffix_tableES6_S6_(%"class.boost::algorithm::boyer_moore"* %this, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %agg.tmp12, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %agg.tmp13)
          to label %invoke.cont14 unwind label %lpad10

invoke.cont14:                                    ; preds = %invoke.cont11
  ret void

lpad:                                             ; preds = %for.body.i.i.i.i.i.preheader.i.i.i, %if.then.i.i.i.i.i
  %15 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %16 = extractvalue { i8*, i32 } %15, 0
  %17 = extractvalue { i8*, i32 } %15, 1
  br label %eh.resume

lpad10:                                           ; preds = %invoke.cont11
  %18 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %19 = extractvalue { i8*, i32 } %18, 0
  %20 = extractvalue { i8*, i32 } %18, 1
  %21 = load i32** %_M_start.i.i.i.i.i, align 4, !tbaa !0
  %tobool.i.i.i.i = icmp eq i32* %21, null
  br i1 %tobool.i.i.i.i, label %eh.resume, label %if.then.i.i.i.i

if.then.i.i.i.i:                                  ; preds = %lpad10
  %22 = bitcast i32* %21 to i8*
  call void @_ZdlPv(i8* %22) nounwind
  br label %eh.resume

eh.resume:                                        ; preds = %if.then.i.i.i.i, %lpad10, %lpad
  %exn.slot.0 = phi i8* [ %16, %lpad ], [ %19, %lpad10 ], [ %19, %if.then.i.i.i.i ]
  %ehselector.slot.0 = phi i32 [ %17, %lpad ], [ %20, %lpad10 ], [ %20, %if.then.i.i.i.i ]
  %lpad.val = insertvalue { i8*, i32 } undef, i8* %exn.slot.0, 0
  %lpad.val16 = insertvalue { i8*, i32 } %lpad.val, i32 %ehselector.slot.0, 1
  resume { i8*, i32 } %lpad.val16
}

define linkonce_odr void @_ZN5boost9algorithm11boyer_mooreIN9__gnu_cxx17__normal_iteratorIPKcSsEENS0_6detail9BM_traitsIS6_EEE18build_suffix_tableES6_S6_(%"class.boost::algorithm::boyer_moore"* nocapture %this, %"class.__gnu_cxx::__normal_iterator"* nocapture byval align 4 %pat_first, %"class.__gnu_cxx::__normal_iterator"* nocapture byval align 4 %pat_last) align 2 {
entry:
  %prefix = alloca %"class.std::vector", align 4
  %agg.tmp15 = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %agg.tmp16 = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %prefix_reversed = alloca %"class.std::vector", align 4
  %agg.tmp24 = alloca %"class.__gnu_cxx::__normal_iterator.5", align 4
  %agg.tmp27 = alloca %"class.__gnu_cxx::__normal_iterator.5", align 4
  %0 = getelementptr inbounds %"class.__gnu_cxx::__normal_iterator"* %pat_first, i32 0, i32 0
  %1 = load i8** %0, align 4, !tbaa !0
  %2 = getelementptr inbounds %"class.__gnu_cxx::__normal_iterator"* %pat_last, i32 0, i32 0
  %3 = load i8** %2, align 4, !tbaa !0
  %sub.ptr.lhs.cast.i.i.i = ptrtoint i8* %3 to i32
  %sub.ptr.rhs.cast.i.i.i = ptrtoint i8* %1 to i32
  %sub.ptr.sub.i.i.i = sub i32 %sub.ptr.lhs.cast.i.i.i, %sub.ptr.rhs.cast.i.i.i
  %cmp = icmp eq i8* %3, %1
  br i1 %cmp, label %if.end67, label %cond.true.i.i.i.i

cond.true.i.i.i.i:                                ; preds = %entry
  %call2.i.i11.i.i.i88 = invoke noalias i8* @_Znwj(i32 %sub.ptr.sub.i.i.i)
          to label %while.body.i.preheader unwind label %lpad

while.body.i.preheader:                           ; preds = %cond.true.i.i.i.i
  %add.ptr.i.i.i = getelementptr inbounds i8* %call2.i.i11.i.i.i88, i32 %sub.ptr.sub.i.i.i
  call void @llvm.memset.p0i8.i32(i8* %call2.i.i11.i.i.i88, i8 0, i32 %sub.ptr.sub.i.i.i, i32 1, i1 false) nounwind
  br label %while.body.i

while.body.i:                                     ; preds = %while.body.i.preheader, %while.body.i
  %4 = phi i8* [ %incdec.ptr.i.i, %while.body.i ], [ %call2.i.i11.i.i.i88, %while.body.i.preheader ]
  %5 = phi i8* [ %incdec.ptr.i8.i, %while.body.i ], [ %3, %while.body.i.preheader ]
  %incdec.ptr.i8.i = getelementptr inbounds i8* %5, i32 -1
  %6 = load i8* %incdec.ptr.i8.i, align 1, !tbaa !1
  store i8 %6, i8* %4, align 1, !tbaa !1
  %incdec.ptr.i.i = getelementptr inbounds i8* %4, i32 1
  %cmp.i.i = icmp eq i8* %1, %incdec.ptr.i8.i
  br i1 %cmp.i.i, label %cond.true.i.i.i.i126, label %while.body.i

cond.true.i.i.i.i126:                             ; preds = %while.body.i
  %_M_start.i.i.i.i.i122 = getelementptr inbounds %"class.std::vector"* %prefix, i32 0, i32 0, i32 0, i32 0
  store i32* null, i32** %_M_start.i.i.i.i.i122, align 4, !tbaa !0
  %_M_finish.i.i.i.i.i123 = getelementptr inbounds %"class.std::vector"* %prefix, i32 0, i32 0, i32 0, i32 1
  store i32* null, i32** %_M_finish.i.i.i.i.i123, align 4, !tbaa !0
  %_M_end_of_storage.i.i.i.i.i124 = getelementptr inbounds %"class.std::vector"* %prefix, i32 0, i32 0, i32 0, i32 2
  store i32* null, i32** %_M_end_of_storage.i.i.i.i.i124, align 4, !tbaa !0
  %cmp.i.i.i.i.i = icmp ugt i32 %sub.ptr.sub.i.i.i, 1073741823
  br i1 %cmp.i.i.i.i.i, label %if.then.i.i.i.i.i, label %for.body.i.i.i.i.i.preheader.i.i.i

if.then.i.i.i.i.i:                                ; preds = %cond.true.i.i.i.i126
  invoke void @_ZSt17__throw_bad_allocv() noreturn
          to label %.noexc unwind label %lpad13

.noexc:                                           ; preds = %if.then.i.i.i.i.i
  unreachable

for.body.i.i.i.i.i.preheader.i.i.i:               ; preds = %cond.true.i.i.i.i126
  %mul.i.i.i.i.i = shl i32 %sub.ptr.sub.i.i.i, 2
  %call2.i.i11.i.i.i129 = invoke noalias i8* @_Znwj(i32 %mul.i.i.i.i.i)
          to label %cond.true.i.i.i.i139 unwind label %lpad13

cond.true.i.i.i.i139:                             ; preds = %for.body.i.i.i.i.i.preheader.i.i.i
  %7 = bitcast i8* %call2.i.i11.i.i.i129 to i32*
  store i32* %7, i32** %_M_start.i.i.i.i.i122, align 4, !tbaa !0
  %add.ptr.i.i.i127 = getelementptr inbounds i32* %7, i32 %sub.ptr.sub.i.i.i
  store i32* %add.ptr.i.i.i127, i32** %_M_end_of_storage.i.i.i.i.i124, align 4, !tbaa !0
  %8 = shl i32 %sub.ptr.sub.i.i.i, 2
  call void @llvm.memset.p0i8.i32(i8* %call2.i.i11.i.i.i129, i8 0, i32 %8, i32 4, i1 false)
  store i32* %add.ptr.i.i.i127, i32** %_M_finish.i.i.i.i.i123, align 4, !tbaa !0
  %9 = load i8** %0, align 4, !tbaa !0
  %10 = getelementptr inbounds %"class.__gnu_cxx::__normal_iterator"* %agg.tmp15, i32 0, i32 0
  store i8* %9, i8** %10, align 4, !tbaa !0
  %11 = load i8** %2, align 4, !tbaa !0
  %12 = getelementptr inbounds %"class.__gnu_cxx::__normal_iterator"* %agg.tmp16, i32 0, i32 0
  store i8* %11, i8** %12, align 4, !tbaa !0
  call void @_ZN5boost9algorithm11boyer_mooreIN9__gnu_cxx17__normal_iteratorIPKcSsEENS0_6detail9BM_traitsIS6_EEE17compute_bm_prefixIS6_St6vectorIiSaIiEEEEvT_SF_RT0_(%"class.boost::algorithm::boyer_moore"* undef, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %agg.tmp15, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %agg.tmp16, %"class.std::vector"* %prefix)
  %_M_start.i.i.i.i.i133 = getelementptr inbounds %"class.std::vector"* %prefix_reversed, i32 0, i32 0, i32 0, i32 0
  store i32* null, i32** %_M_start.i.i.i.i.i133, align 4, !tbaa !0
  %_M_finish.i.i.i.i.i134 = getelementptr inbounds %"class.std::vector"* %prefix_reversed, i32 0, i32 0, i32 0, i32 1
  store i32* null, i32** %_M_finish.i.i.i.i.i134, align 4, !tbaa !0
  %_M_end_of_storage.i.i.i.i.i135 = getelementptr inbounds %"class.std::vector"* %prefix_reversed, i32 0, i32 0, i32 0, i32 2
  store i32* null, i32** %_M_end_of_storage.i.i.i.i.i135, align 4, !tbaa !0
  %cmp.i.i.i.i.i138 = icmp ugt i32 %sub.ptr.sub.i.i.i, 1073741823
  br i1 %cmp.i.i.i.i.i138, label %if.then.i.i.i.i.i140, label %for.body.i.i.i.i.i.preheader.i.i.i143

if.then.i.i.i.i.i140:                             ; preds = %cond.true.i.i.i.i139
  invoke void @_ZSt17__throw_bad_allocv() noreturn
          to label %.noexc150 unwind label %ehcleanup

.noexc150:                                        ; preds = %if.then.i.i.i.i.i140
  unreachable

for.body.i.i.i.i.i.preheader.i.i.i143:            ; preds = %cond.true.i.i.i.i139
  %mul.i.i.i.i.i141 = shl i32 %sub.ptr.sub.i.i.i, 2
  %call2.i.i11.i.i.i152 = invoke noalias i8* @_Znwj(i32 %mul.i.i.i.i.i141)
          to label %invoke.cont28 unwind label %ehcleanup

invoke.cont28:                                    ; preds = %for.body.i.i.i.i.i.preheader.i.i.i143
  %13 = bitcast i8* %call2.i.i11.i.i.i152 to i32*
  store i32* %13, i32** %_M_start.i.i.i.i.i133, align 4, !tbaa !0
  %add.ptr.i.i.i142 = getelementptr inbounds i32* %13, i32 %sub.ptr.sub.i.i.i
  store i32* %add.ptr.i.i.i142, i32** %_M_end_of_storage.i.i.i.i.i135, align 4, !tbaa !0
  %14 = shl i32 %sub.ptr.sub.i.i.i, 2
  call void @llvm.memset.p0i8.i32(i8* %call2.i.i11.i.i.i152, i8 0, i32 %14, i32 4, i1 false)
  store i32* %add.ptr.i.i.i142, i32** %_M_finish.i.i.i.i.i134, align 4, !tbaa !0
  %_M_current.i.i.i132 = getelementptr inbounds %"class.__gnu_cxx::__normal_iterator.5"* %agg.tmp24, i32 0, i32 0
  store i8* %call2.i.i11.i.i.i88, i8** %_M_current.i.i.i132, align 4, !tbaa !0
  %_M_current.i.i.i130 = getelementptr inbounds %"class.__gnu_cxx::__normal_iterator.5"* %agg.tmp27, i32 0, i32 0
  store i8* %add.ptr.i.i.i, i8** %_M_current.i.i.i130, align 4, !tbaa !0
  call void @_ZN5boost9algorithm11boyer_mooreIN9__gnu_cxx17__normal_iteratorIPKcSsEENS0_6detail9BM_traitsIS6_EEE17compute_bm_prefixINS3_IPcSt6vectorIcSaIcEEEESD_IiSaIiEEEEvT_SJ_RT0_(%"class.boost::algorithm::boyer_moore"* undef, %"class.__gnu_cxx::__normal_iterator.5"* byval align 4 %agg.tmp24, %"class.__gnu_cxx::__normal_iterator.5"* byval align 4 %agg.tmp27, %"class.std::vector"* %prefix_reversed)
  %sub = add i32 %sub.ptr.sub.i.i.i, -1
  %15 = load i32** %_M_start.i.i.i.i.i122, align 4, !tbaa !0
  %add.ptr.i121 = getelementptr inbounds i32* %15, i32 %sub
  %_M_start.i118 = getelementptr inbounds %"class.boost::algorithm::boyer_moore"* %this, i32 0, i32 4, i32 0, i32 0, i32 0
  %16 = load i32** %_M_start.i118, align 4, !tbaa !0
  br label %for.body

for.body41.lr.ph:                                 ; preds = %for.body
  %17 = load i32** %_M_start.i.i.i.i.i133, align 4, !tbaa !0
  br label %for.body41

for.body:                                         ; preds = %invoke.cont28, %for.body
  %i.0161 = phi i32 [ 0, %invoke.cont28 ], [ %inc, %for.body ]
  %18 = load i32* %add.ptr.i121, align 4, !tbaa !4
  %sub34 = sub i32 %sub.ptr.sub.i.i.i, %18
  %add.ptr.i119 = getelementptr inbounds i32* %16, i32 %i.0161
  store i32 %sub34, i32* %add.ptr.i119, align 4, !tbaa !4
  %inc = add i32 %i.0161, 1
  %cmp31 = icmp ugt i32 %inc, %sub.ptr.sub.i.i.i
  br i1 %cmp31, label %for.body41.lr.ph, label %for.body

lpad:                                             ; preds = %cond.true.i.i.i.i
  %19 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %20 = extractvalue { i8*, i32 } %19, 0
  %21 = extractvalue { i8*, i32 } %19, 1
  br label %eh.resume

lpad13:                                           ; preds = %for.body.i.i.i.i.i.preheader.i.i.i, %if.then.i.i.i.i.i
  %22 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %23 = extractvalue { i8*, i32 } %22, 0
  %24 = extractvalue { i8*, i32 } %22, 1
  br label %ehcleanup65

for.body41:                                       ; preds = %for.body41.lr.ph, %for.inc58
  %i38.0160 = phi i32 [ 0, %for.body41.lr.ph ], [ %inc59, %for.inc58 ]
  %add.ptr.i117 = getelementptr inbounds i32* %17, i32 %i38.0160
  %25 = load i32* %add.ptr.i117, align 4, !tbaa !4
  %sub45 = sub i32 %sub.ptr.sub.i.i.i, %25
  %sub49 = sub i32 %i38.0160, %25
  %add = add i32 %sub49, 1
  %add.ptr.i113 = getelementptr inbounds i32* %16, i32 %sub45
  %26 = load i32* %add.ptr.i113, align 4, !tbaa !4
  %cmp53 = icmp sgt i32 %26, %add
  br i1 %cmp53, label %if.then54, label %for.inc58

if.then54:                                        ; preds = %for.body41
  store i32 %add, i32* %add.ptr.i113, align 4, !tbaa !4
  br label %for.inc58

for.inc58:                                        ; preds = %for.body41, %if.then54
  %inc59 = add i32 %i38.0160, 1
  %cmp40 = icmp ult i32 %inc59, %sub.ptr.sub.i.i.i
  br i1 %cmp40, label %for.body41, label %for.end60

for.end60:                                        ; preds = %for.inc58
  %tobool.i.i.i.i108 = icmp eq i32* %17, null
  br i1 %tobool.i.i.i.i108, label %invoke.cont61, label %if.then.i.i.i.i109

if.then.i.i.i.i109:                               ; preds = %for.end60
  %27 = bitcast i32* %17 to i8*
  call void @_ZdlPv(i8* %27) nounwind
  br label %invoke.cont61

invoke.cont61:                                    ; preds = %if.then.i.i.i.i109, %for.end60
  %tobool.i.i.i.i94 = icmp eq i32* %15, null
  br i1 %tobool.i.i.i.i94, label %invoke.cont63, label %if.then.i.i.i.i95

if.then.i.i.i.i95:                                ; preds = %invoke.cont61
  %28 = bitcast i32* %15 to i8*
  call void @_ZdlPv(i8* %28) nounwind
  br label %invoke.cont63

invoke.cont63:                                    ; preds = %if.then.i.i.i.i95, %invoke.cont61
  %tobool.i.i.i.i90 = icmp eq i8* %call2.i.i11.i.i.i88, null
  br i1 %tobool.i.i.i.i90, label %if.end67, label %if.then.i.i.i.i91

if.then.i.i.i.i91:                                ; preds = %invoke.cont63
  call void @_ZdlPv(i8* %call2.i.i11.i.i.i88) nounwind
  br label %if.end67

ehcleanup:                                        ; preds = %if.then.i.i.i.i.i140, %for.body.i.i.i.i.i.preheader.i.i.i143
  %29 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %30 = extractvalue { i8*, i32 } %29, 0
  %31 = extractvalue { i8*, i32 } %29, 1
  %32 = load i32** %_M_start.i.i.i.i.i122, align 4, !tbaa !0
  %tobool.i.i.i.i86 = icmp eq i32* %32, null
  br i1 %tobool.i.i.i.i86, label %ehcleanup65, label %if.then.i.i.i.i87

if.then.i.i.i.i87:                                ; preds = %ehcleanup
  %33 = bitcast i32* %32 to i8*
  call void @_ZdlPv(i8* %33) nounwind
  br label %ehcleanup65

ehcleanup65:                                      ; preds = %if.then.i.i.i.i87, %ehcleanup, %lpad13
  %ehselector.slot.1 = phi i32 [ %24, %lpad13 ], [ %31, %ehcleanup ], [ %31, %if.then.i.i.i.i87 ]
  %exn.slot.1 = phi i8* [ %23, %lpad13 ], [ %30, %ehcleanup ], [ %30, %if.then.i.i.i.i87 ]
  %tobool.i.i.i.i = icmp eq i8* %call2.i.i11.i.i.i88, null
  br i1 %tobool.i.i.i.i, label %eh.resume, label %if.then.i.i.i.i

if.then.i.i.i.i:                                  ; preds = %ehcleanup65
  call void @_ZdlPv(i8* %call2.i.i11.i.i.i88) nounwind
  br label %eh.resume

if.end67:                                         ; preds = %if.then.i.i.i.i91, %invoke.cont63, %entry
  ret void

eh.resume:                                        ; preds = %if.then.i.i.i.i, %ehcleanup65, %lpad
  %ehselector.slot.2 = phi i32 [ %21, %lpad ], [ %ehselector.slot.1, %ehcleanup65 ], [ %ehselector.slot.1, %if.then.i.i.i.i ]
  %exn.slot.2 = phi i8* [ %20, %lpad ], [ %exn.slot.1, %ehcleanup65 ], [ %exn.slot.1, %if.then.i.i.i.i ]
  %lpad.val = insertvalue { i8*, i32 } undef, i8* %exn.slot.2, 0
  %lpad.val68 = insertvalue { i8*, i32 } %lpad.val, i32 %ehselector.slot.2, 1
  resume { i8*, i32 } %lpad.val68
}

define linkonce_odr void @_ZN5boost9algorithm11boyer_mooreIN9__gnu_cxx17__normal_iteratorIPKcSsEENS0_6detail9BM_traitsIS6_EEE17compute_bm_prefixIS6_St6vectorIiSaIiEEEEvT_SF_RT0_(%"class.boost::algorithm::boyer_moore"* nocapture %this, %"class.__gnu_cxx::__normal_iterator"* nocapture byval align 4 %pat_first, %"class.__gnu_cxx::__normal_iterator"* nocapture byval align 4 %pat_last, %"class.std::vector"* nocapture %prefix) nounwind align 2 {
entry:
  %0 = getelementptr inbounds %"class.__gnu_cxx::__normal_iterator"* %pat_first, i32 0, i32 0
  %1 = load i8** %0, align 4, !tbaa !0
  %2 = getelementptr inbounds %"class.__gnu_cxx::__normal_iterator"* %pat_last, i32 0, i32 0
  %3 = load i8** %2, align 4, !tbaa !0
  %sub.ptr.lhs.cast.i.i.i = ptrtoint i8* %3 to i32
  %sub.ptr.rhs.cast.i.i.i = ptrtoint i8* %1 to i32
  %sub.ptr.sub.i.i.i = sub i32 %sub.ptr.lhs.cast.i.i.i, %sub.ptr.rhs.cast.i.i.i
  %cmp = icmp eq i8* %3, %1
  br i1 %cmp, label %cond.false, label %cond.end

cond.false:                                       ; preds = %entry
  tail call void @__assert_fail(i8* getelementptr inbounds ([10 x i8]* @.str20, i32 0, i32 0), i8* getelementptr inbounds ([68 x i8]* @.str21, i32 0, i32 0), i32 154, i8* getelementptr inbounds ([585 x i8]* @__PRETTY_FUNCTION__._ZN5boost9algorithm11boyer_mooreIN9__gnu_cxx17__normal_iteratorIPKcSsEENS0_6detail9BM_traitsIS6_EEE17compute_bm_prefixIS6_St6vectorIiSaIiEEEEvT_SF_RT0_, i32 0, i32 0)) noreturn nounwind
  unreachable

cond.end:                                         ; preds = %entry
  %_M_finish.i = getelementptr inbounds %"class.std::vector"* %prefix, i32 0, i32 0, i32 0, i32 1
  %4 = load i32** %_M_finish.i, align 4, !tbaa !0
  %_M_start.i60 = getelementptr inbounds %"class.std::vector"* %prefix, i32 0, i32 0, i32 0, i32 0
  %5 = load i32** %_M_start.i60, align 4, !tbaa !0
  %sub.ptr.lhs.cast.i = ptrtoint i32* %4 to i32
  %sub.ptr.rhs.cast.i = ptrtoint i32* %5 to i32
  %sub.ptr.sub.i = sub i32 %sub.ptr.lhs.cast.i, %sub.ptr.rhs.cast.i
  %sub.ptr.div.i = ashr exact i32 %sub.ptr.sub.i, 2
  %cmp4 = icmp eq i32 %sub.ptr.div.i, %sub.ptr.sub.i.i.i
  br i1 %cmp4, label %cond.end7, label %cond.false6

cond.false6:                                      ; preds = %cond.end
  tail call void @__assert_fail(i8* getelementptr inbounds ([24 x i8]* @.str22, i32 0, i32 0), i8* getelementptr inbounds ([68 x i8]* @.str21, i32 0, i32 0), i32 155, i8* getelementptr inbounds ([585 x i8]* @__PRETTY_FUNCTION__._ZN5boost9algorithm11boyer_mooreIN9__gnu_cxx17__normal_iteratorIPKcSsEENS0_6detail9BM_traitsIS6_EEE17compute_bm_prefixIS6_St6vectorIiSaIiEEEEvT_SF_RT0_, i32 0, i32 0)) noreturn nounwind
  unreachable

cond.end7:                                        ; preds = %cond.end
  store i32 0, i32* %5, align 4, !tbaa !4
  %cmp964 = icmp ugt i32 %sub.ptr.sub.i.i.i, 1
  br i1 %cmp964, label %for.body, label %for.end

for.body:                                         ; preds = %cond.end7, %while.end
  %i.066 = phi i32 [ %inc33, %while.end ], [ 1, %cond.end7 ]
  %k.065 = phi i32 [ %inc.k.1, %while.end ], [ 0, %cond.end7 ]
  %cmp10 = icmp ult i32 %k.065, %sub.ptr.sub.i.i.i
  br i1 %cmp10, label %while.cond.preheader, label %cond.false12

while.cond.preheader:                             ; preds = %for.body
  %cmp1462 = icmp eq i32 %k.065, 0
  %arrayidx.i.phi.trans.insert = getelementptr inbounds i8* %1, i32 %i.066
  %.pre = load i8* %arrayidx.i.phi.trans.insert, align 1, !tbaa !1
  br i1 %cmp1462, label %while.end, label %land.rhs

cond.false12:                                     ; preds = %for.body
  tail call void @__assert_fail(i8* getelementptr inbounds ([10 x i8]* @.str23, i32 0, i32 0), i8* getelementptr inbounds ([68 x i8]* @.str21, i32 0, i32 0), i32 160, i8* getelementptr inbounds ([585 x i8]* @__PRETTY_FUNCTION__._ZN5boost9algorithm11boyer_mooreIN9__gnu_cxx17__normal_iteratorIPKcSsEENS0_6detail9BM_traitsIS6_EEE17compute_bm_prefixIS6_St6vectorIiSaIiEEEEvT_SF_RT0_, i32 0, i32 0)) noreturn nounwind
  unreachable

land.rhs:                                         ; preds = %while.cond.preheader, %cond.end23
  %k.163 = phi i32 [ %7, %cond.end23 ], [ %k.065, %while.cond.preheader ]
  %arrayidx.i58 = getelementptr inbounds i8* %1, i32 %k.163
  %6 = load i8* %arrayidx.i58, align 1, !tbaa !1
  %cmp19 = icmp eq i8 %6, %.pre
  br i1 %cmp19, label %while.end, label %while.body

while.body:                                       ; preds = %land.rhs
  %cmp20 = icmp ult i32 %k.163, %sub.ptr.sub.i.i.i
  br i1 %cmp20, label %cond.end23, label %cond.false22

cond.false22:                                     ; preds = %while.body
  tail call void @__assert_fail(i8* getelementptr inbounds ([10 x i8]* @.str23, i32 0, i32 0), i8* getelementptr inbounds ([68 x i8]* @.str21, i32 0, i32 0), i32 162, i8* getelementptr inbounds ([585 x i8]* @__PRETTY_FUNCTION__._ZN5boost9algorithm11boyer_mooreIN9__gnu_cxx17__normal_iteratorIPKcSsEENS0_6detail9BM_traitsIS6_EEE17compute_bm_prefixIS6_St6vectorIiSaIiEEEEvT_SF_RT0_, i32 0, i32 0)) noreturn nounwind
  unreachable

cond.end23:                                       ; preds = %while.body
  %sub = add i32 %k.163, -1
  %add.ptr.i54 = getelementptr inbounds i32* %5, i32 %sub
  %7 = load i32* %add.ptr.i54, align 4, !tbaa !4
  %cmp14 = icmp eq i32 %7, 0
  br i1 %cmp14, label %while.end, label %land.rhs

while.end:                                        ; preds = %while.cond.preheader, %cond.end23, %land.rhs
  %k.1.lcssa = phi i32 [ %k.163, %land.rhs ], [ 0, %cond.end23 ], [ 0, %while.cond.preheader ]
  %arrayidx.i52 = getelementptr inbounds i8* %1, i32 %k.1.lcssa
  %8 = load i8* %arrayidx.i52, align 1, !tbaa !1
  %cmp31 = icmp eq i8 %8, %.pre
  %inc = zext i1 %cmp31 to i32
  %inc.k.1 = add i32 %inc, %k.1.lcssa
  %add.ptr.i = getelementptr inbounds i32* %5, i32 %i.066
  store i32 %inc.k.1, i32* %add.ptr.i, align 4, !tbaa !4
  %inc33 = add i32 %i.066, 1
  %cmp9 = icmp ult i32 %inc33, %sub.ptr.sub.i.i.i
  br i1 %cmp9, label %for.body, label %for.end

for.end:                                          ; preds = %while.end, %cond.end7
  ret void
}

define linkonce_odr void @_ZN5boost9algorithm11boyer_mooreIN9__gnu_cxx17__normal_iteratorIPKcSsEENS0_6detail9BM_traitsIS6_EEE17compute_bm_prefixINS3_IPcSt6vectorIcSaIcEEEESD_IiSaIiEEEEvT_SJ_RT0_(%"class.boost::algorithm::boyer_moore"* nocapture %this, %"class.__gnu_cxx::__normal_iterator.5"* nocapture byval align 4 %pat_first, %"class.__gnu_cxx::__normal_iterator.5"* nocapture byval align 4 %pat_last, %"class.std::vector"* nocapture %prefix) nounwind align 2 {
entry:
  %0 = getelementptr inbounds %"class.__gnu_cxx::__normal_iterator.5"* %pat_first, i32 0, i32 0
  %1 = load i8** %0, align 4, !tbaa !0
  %2 = getelementptr inbounds %"class.__gnu_cxx::__normal_iterator.5"* %pat_last, i32 0, i32 0
  %3 = load i8** %2, align 4, !tbaa !0
  %sub.ptr.lhs.cast.i.i.i = ptrtoint i8* %3 to i32
  %sub.ptr.rhs.cast.i.i.i = ptrtoint i8* %1 to i32
  %sub.ptr.sub.i.i.i = sub i32 %sub.ptr.lhs.cast.i.i.i, %sub.ptr.rhs.cast.i.i.i
  %cmp = icmp eq i8* %3, %1
  br i1 %cmp, label %cond.false, label %cond.end

cond.false:                                       ; preds = %entry
  tail call void @__assert_fail(i8* getelementptr inbounds ([10 x i8]* @.str20, i32 0, i32 0), i8* getelementptr inbounds ([68 x i8]* @.str21, i32 0, i32 0), i32 154, i8* getelementptr inbounds ([596 x i8]* @__PRETTY_FUNCTION__._ZN5boost9algorithm11boyer_mooreIN9__gnu_cxx17__normal_iteratorIPKcSsEENS0_6detail9BM_traitsIS6_EEE17compute_bm_prefixINS3_IPcSt6vectorIcSaIcEEEESD_IiSaIiEEEEvT_SJ_RT0_, i32 0, i32 0)) noreturn nounwind
  unreachable

cond.end:                                         ; preds = %entry
  %_M_finish.i = getelementptr inbounds %"class.std::vector"* %prefix, i32 0, i32 0, i32 0, i32 1
  %4 = load i32** %_M_finish.i, align 4, !tbaa !0
  %_M_start.i60 = getelementptr inbounds %"class.std::vector"* %prefix, i32 0, i32 0, i32 0, i32 0
  %5 = load i32** %_M_start.i60, align 4, !tbaa !0
  %sub.ptr.lhs.cast.i = ptrtoint i32* %4 to i32
  %sub.ptr.rhs.cast.i = ptrtoint i32* %5 to i32
  %sub.ptr.sub.i = sub i32 %sub.ptr.lhs.cast.i, %sub.ptr.rhs.cast.i
  %sub.ptr.div.i = ashr exact i32 %sub.ptr.sub.i, 2
  %cmp4 = icmp eq i32 %sub.ptr.div.i, %sub.ptr.sub.i.i.i
  br i1 %cmp4, label %cond.end7, label %cond.false6

cond.false6:                                      ; preds = %cond.end
  tail call void @__assert_fail(i8* getelementptr inbounds ([24 x i8]* @.str22, i32 0, i32 0), i8* getelementptr inbounds ([68 x i8]* @.str21, i32 0, i32 0), i32 155, i8* getelementptr inbounds ([596 x i8]* @__PRETTY_FUNCTION__._ZN5boost9algorithm11boyer_mooreIN9__gnu_cxx17__normal_iteratorIPKcSsEENS0_6detail9BM_traitsIS6_EEE17compute_bm_prefixINS3_IPcSt6vectorIcSaIcEEEESD_IiSaIiEEEEvT_SJ_RT0_, i32 0, i32 0)) noreturn nounwind
  unreachable

cond.end7:                                        ; preds = %cond.end
  store i32 0, i32* %5, align 4, !tbaa !4
  %cmp964 = icmp ugt i32 %sub.ptr.sub.i.i.i, 1
  br i1 %cmp964, label %for.body, label %for.end

for.body:                                         ; preds = %cond.end7, %while.end
  %i.066 = phi i32 [ %inc33, %while.end ], [ 1, %cond.end7 ]
  %k.065 = phi i32 [ %inc.k.1, %while.end ], [ 0, %cond.end7 ]
  %cmp10 = icmp ult i32 %k.065, %sub.ptr.sub.i.i.i
  br i1 %cmp10, label %while.cond.preheader, label %cond.false12

while.cond.preheader:                             ; preds = %for.body
  %cmp1462 = icmp eq i32 %k.065, 0
  %arrayidx.i.phi.trans.insert = getelementptr inbounds i8* %1, i32 %i.066
  %.pre = load i8* %arrayidx.i.phi.trans.insert, align 1, !tbaa !1
  br i1 %cmp1462, label %while.end, label %land.rhs

cond.false12:                                     ; preds = %for.body
  tail call void @__assert_fail(i8* getelementptr inbounds ([10 x i8]* @.str23, i32 0, i32 0), i8* getelementptr inbounds ([68 x i8]* @.str21, i32 0, i32 0), i32 160, i8* getelementptr inbounds ([596 x i8]* @__PRETTY_FUNCTION__._ZN5boost9algorithm11boyer_mooreIN9__gnu_cxx17__normal_iteratorIPKcSsEENS0_6detail9BM_traitsIS6_EEE17compute_bm_prefixINS3_IPcSt6vectorIcSaIcEEEESD_IiSaIiEEEEvT_SJ_RT0_, i32 0, i32 0)) noreturn nounwind
  unreachable

land.rhs:                                         ; preds = %while.cond.preheader, %cond.end23
  %k.163 = phi i32 [ %7, %cond.end23 ], [ %k.065, %while.cond.preheader ]
  %arrayidx.i58 = getelementptr inbounds i8* %1, i32 %k.163
  %6 = load i8* %arrayidx.i58, align 1, !tbaa !1
  %cmp19 = icmp eq i8 %6, %.pre
  br i1 %cmp19, label %while.end, label %while.body

while.body:                                       ; preds = %land.rhs
  %cmp20 = icmp ult i32 %k.163, %sub.ptr.sub.i.i.i
  br i1 %cmp20, label %cond.end23, label %cond.false22

cond.false22:                                     ; preds = %while.body
  tail call void @__assert_fail(i8* getelementptr inbounds ([10 x i8]* @.str23, i32 0, i32 0), i8* getelementptr inbounds ([68 x i8]* @.str21, i32 0, i32 0), i32 162, i8* getelementptr inbounds ([596 x i8]* @__PRETTY_FUNCTION__._ZN5boost9algorithm11boyer_mooreIN9__gnu_cxx17__normal_iteratorIPKcSsEENS0_6detail9BM_traitsIS6_EEE17compute_bm_prefixINS3_IPcSt6vectorIcSaIcEEEESD_IiSaIiEEEEvT_SJ_RT0_, i32 0, i32 0)) noreturn nounwind
  unreachable

cond.end23:                                       ; preds = %while.body
  %sub = add i32 %k.163, -1
  %add.ptr.i54 = getelementptr inbounds i32* %5, i32 %sub
  %7 = load i32* %add.ptr.i54, align 4, !tbaa !4
  %cmp14 = icmp eq i32 %7, 0
  br i1 %cmp14, label %while.end, label %land.rhs

while.end:                                        ; preds = %while.cond.preheader, %cond.end23, %land.rhs
  %k.1.lcssa = phi i32 [ %k.163, %land.rhs ], [ 0, %cond.end23 ], [ 0, %while.cond.preheader ]
  %arrayidx.i52 = getelementptr inbounds i8* %1, i32 %k.1.lcssa
  %8 = load i8* %arrayidx.i52, align 1, !tbaa !1
  %cmp31 = icmp eq i8 %8, %.pre
  %inc = zext i1 %cmp31 to i32
  %inc.k.1 = add i32 %inc, %k.1.lcssa
  %add.ptr.i = getelementptr inbounds i32* %5, i32 %i.066
  store i32 %inc.k.1, i32* %add.ptr.i, align 4, !tbaa !4
  %inc33 = add i32 %i.066, 1
  %cmp9 = icmp ult i32 %inc33, %sub.ptr.sub.i.i.i
  br i1 %cmp9, label %for.body, label %for.end

for.end:                                          ; preds = %while.end, %cond.end7
  ret void
}

declare void @__assert_fail(i8*, i8*, i32, i8*) noreturn nounwind

declare void @llvm.memset.p0i8.i32(i8* nocapture, i8, i32, i32, i1) nounwind

declare void @_ZNSs4_Rep10_M_destroyERKSaIcE(%"struct.std::basic_string<char, std::char_traits<char>, std::allocator<char> >::_Rep"*, %"class.std::allocator"*) nounwind

declare extern_weak i32 @pthread_cancel(i32)

declare %"class.std::basic_ostream"* @_ZNSo3putEc(%"class.std::basic_ostream"*, i8 signext)

declare void @_ZNKSt5ctypeIcE13_M_widen_initEv(%"class.std::ctype"*)

declare void @_ZSt16__throw_bad_castv() noreturn

declare %"class.std::basic_ostream"* @_ZNSo5flushEv(%"class.std::basic_ostream"*)

define internal void @_GLOBAL__I_a() section ".text.startup" {
entry:
  %ref.tmp.i2 = alloca %"class.std::allocator", align 1
  %ref.tmp.i1 = alloca %"class.std::allocator", align 1
  %ref.tmp.i = alloca %"class.std::allocator", align 1
  call void @_ZNSt8ios_base4InitC1Ev(%"class.std::ios_base::Init"* @_ZStL8__ioinit)
  %0 = call i32 @__cxa_atexit(void (i8*)* bitcast (void (%"class.std::ios_base::Init"*)* @_ZNSt8ios_base4InitD1Ev to void (i8*)*), i8* getelementptr inbounds (%"class.std::ios_base::Init"* @_ZStL8__ioinit, i32 0, i32 0), i8* @__dso_handle) nounwind
  %1 = getelementptr inbounds %"class.std::allocator"* %ref.tmp.i, i32 0, i32 0
  call void @llvm.lifetime.start(i64 1, i8* %1)
  call void @_ZNSsC1EPKcRKSaIcE(%"class.std::basic_string"* @_ZL8haystack, i8* getelementptr inbounds ([25 x i8]* @.str, i32 0, i32 0), %"class.std::allocator"* %ref.tmp.i)
  %2 = call i32 @__cxa_atexit(void (i8*)* bitcast (void (%"class.std::basic_string"*)* @_ZNSsD1Ev to void (i8*)*), i8* bitcast (%"class.std::basic_string"* @_ZL8haystack to i8*), i8* @__dso_handle) nounwind
  call void @llvm.lifetime.end(i64 1, i8* %1)
  %3 = getelementptr inbounds %"class.std::allocator"* %ref.tmp.i1, i32 0, i32 0
  call void @llvm.lifetime.start(i64 1, i8* %3)
  call void @_ZNSsC1EPKcRKSaIcE(%"class.std::basic_string"* @_ZL7needle1, i8* getelementptr inbounds ([5 x i8]* @.str3, i32 0, i32 0), %"class.std::allocator"* %ref.tmp.i1)
  %4 = call i32 @__cxa_atexit(void (i8*)* bitcast (void (%"class.std::basic_string"*)* @_ZNSsD1Ev to void (i8*)*), i8* bitcast (%"class.std::basic_string"* @_ZL7needle1 to i8*), i8* @__dso_handle) nounwind
  call void @llvm.lifetime.end(i64 1, i8* %3)
  %5 = getelementptr inbounds %"class.std::allocator"* %ref.tmp.i2, i32 0, i32 0
  call void @llvm.lifetime.start(i64 1, i8* %5)
  call void @_ZNSsC1EPKcRKSaIcE(%"class.std::basic_string"* @_ZL7needle2, i8* getelementptr inbounds ([8 x i8]* @.str5, i32 0, i32 0), %"class.std::allocator"* %ref.tmp.i2)
  %6 = call i32 @__cxa_atexit(void (i8*)* bitcast (void (%"class.std::basic_string"*)* @_ZNSsD1Ev to void (i8*)*), i8* bitcast (%"class.std::basic_string"* @_ZL7needle2 to i8*), i8* @__dso_handle) nounwind
  call void @llvm.lifetime.end(i64 1, i8* %5)
  ret void
}

declare void @llvm.lifetime.start(i64, i8* nocapture) nounwind

declare void @llvm.lifetime.end(i64, i8* nocapture) nounwind

declare void @llvm.memset.p0i8.i64(i8* nocapture, i8, i64, i32, i1) nounwind

!0 = metadata !{metadata !"any pointer", metadata !1}
!1 = metadata !{metadata !"omnipotent char", metadata !2}
!2 = metadata !{metadata !"Simple C/C++ TBAA"}
!3 = metadata !{metadata !"branch_weights", i32 64, i32 4}
!4 = metadata !{metadata !"int", metadata !1}
!5 = metadata !{metadata !"vtable pointer", metadata !2}
