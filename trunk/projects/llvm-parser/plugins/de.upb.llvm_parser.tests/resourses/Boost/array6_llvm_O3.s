; ModuleID = 'array6.cpp'
target datalayout = "e-p:32:32:32-i1:8:8-i8:8:8-i16:16:16-i32:32:32-i64:32:64-f32:32:32-f64:32:64-v64:64:64-v128:128:128-a0:0:64-f80:32:32-n8:16:32-S128"
target triple = "i386-pc-linux-gnu"

%"class.std::ios_base::Init" = type { i8 }
%"class.boost::array" = type { [5 x %"class.std::basic_string"] }
%"class.std::basic_string" = type { %"struct.std::basic_string<char, std::char_traits<char>, std::allocator<char> >::_Alloc_hider" }
%"struct.std::basic_string<char, std::char_traits<char>, std::allocator<char> >::_Alloc_hider" = type { i8* }
%"class.std::allocator" = type { i8 }
%"struct.std::basic_string<char, std::char_traits<char>, std::allocator<char> >::_Rep" = type { %"struct.std::basic_string<char, std::char_traits<char>, std::allocator<char> >::_Rep_base" }
%"struct.std::basic_string<char, std::char_traits<char>, std::allocator<char> >::_Rep_base" = type { i32, i32, i32 }

@_ZStL8__ioinit = internal global %"class.std::ios_base::Init" zeroinitializer, align 1
@__dso_handle = external global i8
@_ZN12_GLOBAL__N_112failed_testsE = internal unnamed_addr global i32 0, align 4
@_ZNSs4_Rep20_S_empty_rep_storageE = external global [0 x i32]
@llvm.global_ctors = appending global [1 x { i32, void ()* }] [{ i32, void ()* } { i32 65535, void ()* @_GLOBAL__I_a }]

declare void @_ZNSt8ios_base4InitC1Ev(%"class.std::ios_base::Init"*)

declare void @_ZNSt8ios_base4InitD1Ev(%"class.std::ios_base::Init"*)

declare i32 @__cxa_atexit(void (i8*)*, i8*, i8*) nounwind

define i32 @main() {
entry:
  %test_case.i = alloca %"class.boost::array", align 4
  %0 = bitcast %"class.boost::array"* %test_case.i to i8*
  call void @llvm.lifetime.start(i64 20, i8* %0)
  %_M_p.i.i.i.i.i.i.i = getelementptr inbounds %"class.boost::array"* %test_case.i, i32 0, i32 0, i32 0, i32 0, i32 0
  store i8* bitcast (i32* getelementptr inbounds ([0 x i32]* @_ZNSs4_Rep20_S_empty_rep_storageE, i32 0, i32 3) to i8*), i8** %_M_p.i.i.i.i.i.i.i, align 4, !tbaa !0
  %_M_p.i.i.i.i.1.i.i.i = getelementptr inbounds %"class.boost::array"* %test_case.i, i32 0, i32 0, i32 1, i32 0, i32 0
  store i8* bitcast (i32* getelementptr inbounds ([0 x i32]* @_ZNSs4_Rep20_S_empty_rep_storageE, i32 0, i32 3) to i8*), i8** %_M_p.i.i.i.i.1.i.i.i, align 4, !tbaa !0
  %_M_p.i.i.i.i.2.i.i.i = getelementptr inbounds %"class.boost::array"* %test_case.i, i32 0, i32 0, i32 2, i32 0, i32 0
  store i8* bitcast (i32* getelementptr inbounds ([0 x i32]* @_ZNSs4_Rep20_S_empty_rep_storageE, i32 0, i32 3) to i8*), i8** %_M_p.i.i.i.i.2.i.i.i, align 4, !tbaa !0
  %_M_p.i.i.i.i.3.i.i.i = getelementptr inbounds %"class.boost::array"* %test_case.i, i32 0, i32 0, i32 3, i32 0, i32 0
  store i8* bitcast (i32* getelementptr inbounds ([0 x i32]* @_ZNSs4_Rep20_S_empty_rep_storageE, i32 0, i32 3) to i8*), i8** %_M_p.i.i.i.i.3.i.i.i, align 4, !tbaa !0
  %_M_p.i.i.i.i.4.i.i.i = getelementptr inbounds %"class.boost::array"* %test_case.i, i32 0, i32 0, i32 4, i32 0, i32 0
  store i8* bitcast (i32* getelementptr inbounds ([0 x i32]* @_ZNSs4_Rep20_S_empty_rep_storageE, i32 0, i32 3) to i8*), i8** %_M_p.i.i.i.i.4.i.i.i, align 4, !tbaa !0
  call void @_ZN5boost5arrayISsLj5EED2Ev(%"class.boost::array"* %test_case.i)
  call void @llvm.lifetime.end(i64 20, i8* %0)
  %1 = load i32* @_ZN12_GLOBAL__N_112failed_testsE, align 4, !tbaa !3
  ret i32 %1
}

define linkonce_odr void @_ZN5boost5arrayISsLj5EED2Ev(%"class.boost::array"* %this) unnamed_addr inlinehint align 2 {
entry:
  %ref.tmp.i.i = alloca %"class.std::allocator", align 1
  %0 = getelementptr inbounds %"class.std::allocator"* %ref.tmp.i.i, i32 0, i32 0
  call void @llvm.lifetime.start(i64 1, i8* %0)
  %_M_p.i.i.i.i = getelementptr inbounds %"class.boost::array"* %this, i32 0, i32 0, i32 4, i32 0, i32 0
  %1 = load i8** %_M_p.i.i.i.i, align 4, !tbaa !0
  %arrayidx.i.i.i = getelementptr inbounds i8* %1, i32 -12
  %2 = bitcast i8* %arrayidx.i.i.i to %"struct.std::basic_string<char, std::char_traits<char>, std::allocator<char> >::_Rep"*
  %cmp.i.i.i = icmp eq i8* %arrayidx.i.i.i, bitcast ([0 x i32]* @_ZNSs4_Rep20_S_empty_rep_storageE to i8*)
  br i1 %cmp.i.i.i, label %invoke.cont, label %if.then.i.i.i, !prof !4

if.then.i.i.i:                                    ; preds = %entry
  %_M_refcount.i.i.i = getelementptr inbounds i8* %1, i32 -4
  %3 = bitcast i8* %_M_refcount.i.i.i to i32*
  br i1 icmp ne (i8* bitcast (i32 (i32)* @pthread_cancel to i8*), i8* null), label %if.then.i.i.i.i, label %if.else.i.i.i.i

if.then.i.i.i.i:                                  ; preds = %if.then.i.i.i
  %4 = atomicrmw add i32* %3, i32 -1 seq_cst
  br label %_ZN9__gnu_cxxL27__exchange_and_add_dispatchEPii.exit.i.i.i

if.else.i.i.i.i:                                  ; preds = %if.then.i.i.i
  %5 = load i32* %3, align 4, !tbaa !3
  %add.i.i.i.i.i = add nsw i32 %5, -1
  store i32 %add.i.i.i.i.i, i32* %3, align 4, !tbaa !3
  br label %_ZN9__gnu_cxxL27__exchange_and_add_dispatchEPii.exit.i.i.i

_ZN9__gnu_cxxL27__exchange_and_add_dispatchEPii.exit.i.i.i: ; preds = %if.else.i.i.i.i, %if.then.i.i.i.i
  %retval.0.i.i.i.i = phi i32 [ %4, %if.then.i.i.i.i ], [ %5, %if.else.i.i.i.i ]
  %cmp3.i.i.i = icmp slt i32 %retval.0.i.i.i.i, 1
  br i1 %cmp3.i.i.i, label %if.then4.i.i.i, label %invoke.cont

if.then4.i.i.i:                                   ; preds = %_ZN9__gnu_cxxL27__exchange_and_add_dispatchEPii.exit.i.i.i
  call void @_ZNSs4_Rep10_M_destroyERKSaIcE(%"struct.std::basic_string<char, std::char_traits<char>, std::allocator<char> >::_Rep"* %2, %"class.std::allocator"* %ref.tmp.i.i) nounwind
  br label %invoke.cont

invoke.cont:                                      ; preds = %if.then4.i.i.i, %_ZN9__gnu_cxxL27__exchange_and_add_dispatchEPii.exit.i.i.i, %entry
  call void @llvm.lifetime.end(i64 1, i8* %0)
  call void @llvm.lifetime.start(i64 1, i8* %0)
  %_M_p.i.i.i.i.1 = getelementptr inbounds %"class.boost::array"* %this, i32 0, i32 0, i32 3, i32 0, i32 0
  %6 = load i8** %_M_p.i.i.i.i.1, align 4, !tbaa !0
  %arrayidx.i.i.i.1 = getelementptr inbounds i8* %6, i32 -12
  %7 = bitcast i8* %arrayidx.i.i.i.1 to %"struct.std::basic_string<char, std::char_traits<char>, std::allocator<char> >::_Rep"*
  %cmp.i.i.i.1 = icmp eq i8* %arrayidx.i.i.i.1, bitcast ([0 x i32]* @_ZNSs4_Rep20_S_empty_rep_storageE to i8*)
  br i1 %cmp.i.i.i.1, label %invoke.cont.1, label %if.then.i.i.i.1, !prof !4

if.then.i.i.i.1:                                  ; preds = %invoke.cont
  %_M_refcount.i.i.i.1 = getelementptr inbounds i8* %6, i32 -4
  %8 = bitcast i8* %_M_refcount.i.i.i.1 to i32*
  br i1 icmp ne (i8* bitcast (i32 (i32)* @pthread_cancel to i8*), i8* null), label %if.then.i.i.i.i.1, label %if.else.i.i.i.i.1

if.else.i.i.i.i.1:                                ; preds = %if.then.i.i.i.1
  %9 = load i32* %8, align 4, !tbaa !3
  %add.i.i.i.i.i.1 = add nsw i32 %9, -1
  store i32 %add.i.i.i.i.i.1, i32* %8, align 4, !tbaa !3
  br label %_ZN9__gnu_cxxL27__exchange_and_add_dispatchEPii.exit.i.i.i.1

if.then.i.i.i.i.1:                                ; preds = %if.then.i.i.i.1
  %10 = atomicrmw add i32* %8, i32 -1 seq_cst
  br label %_ZN9__gnu_cxxL27__exchange_and_add_dispatchEPii.exit.i.i.i.1

_ZN9__gnu_cxxL27__exchange_and_add_dispatchEPii.exit.i.i.i.1: ; preds = %if.then.i.i.i.i.1, %if.else.i.i.i.i.1
  %retval.0.i.i.i.i.1 = phi i32 [ %10, %if.then.i.i.i.i.1 ], [ %9, %if.else.i.i.i.i.1 ]
  %cmp3.i.i.i.1 = icmp slt i32 %retval.0.i.i.i.i.1, 1
  br i1 %cmp3.i.i.i.1, label %if.then4.i.i.i.1, label %invoke.cont.1

if.then4.i.i.i.1:                                 ; preds = %_ZN9__gnu_cxxL27__exchange_and_add_dispatchEPii.exit.i.i.i.1
  call void @_ZNSs4_Rep10_M_destroyERKSaIcE(%"struct.std::basic_string<char, std::char_traits<char>, std::allocator<char> >::_Rep"* %7, %"class.std::allocator"* %ref.tmp.i.i) nounwind
  br label %invoke.cont.1

invoke.cont.1:                                    ; preds = %if.then4.i.i.i.1, %_ZN9__gnu_cxxL27__exchange_and_add_dispatchEPii.exit.i.i.i.1, %invoke.cont
  call void @llvm.lifetime.end(i64 1, i8* %0)
  call void @llvm.lifetime.start(i64 1, i8* %0)
  %_M_p.i.i.i.i.2 = getelementptr inbounds %"class.boost::array"* %this, i32 0, i32 0, i32 2, i32 0, i32 0
  %11 = load i8** %_M_p.i.i.i.i.2, align 4, !tbaa !0
  %arrayidx.i.i.i.2 = getelementptr inbounds i8* %11, i32 -12
  %12 = bitcast i8* %arrayidx.i.i.i.2 to %"struct.std::basic_string<char, std::char_traits<char>, std::allocator<char> >::_Rep"*
  %cmp.i.i.i.2 = icmp eq i8* %arrayidx.i.i.i.2, bitcast ([0 x i32]* @_ZNSs4_Rep20_S_empty_rep_storageE to i8*)
  br i1 %cmp.i.i.i.2, label %invoke.cont.2, label %if.then.i.i.i.2, !prof !4

if.then.i.i.i.2:                                  ; preds = %invoke.cont.1
  %_M_refcount.i.i.i.2 = getelementptr inbounds i8* %11, i32 -4
  %13 = bitcast i8* %_M_refcount.i.i.i.2 to i32*
  br i1 icmp ne (i8* bitcast (i32 (i32)* @pthread_cancel to i8*), i8* null), label %if.then.i.i.i.i.2, label %if.else.i.i.i.i.2

if.else.i.i.i.i.2:                                ; preds = %if.then.i.i.i.2
  %14 = load i32* %13, align 4, !tbaa !3
  %add.i.i.i.i.i.2 = add nsw i32 %14, -1
  store i32 %add.i.i.i.i.i.2, i32* %13, align 4, !tbaa !3
  br label %_ZN9__gnu_cxxL27__exchange_and_add_dispatchEPii.exit.i.i.i.2

if.then.i.i.i.i.2:                                ; preds = %if.then.i.i.i.2
  %15 = atomicrmw add i32* %13, i32 -1 seq_cst
  br label %_ZN9__gnu_cxxL27__exchange_and_add_dispatchEPii.exit.i.i.i.2

_ZN9__gnu_cxxL27__exchange_and_add_dispatchEPii.exit.i.i.i.2: ; preds = %if.then.i.i.i.i.2, %if.else.i.i.i.i.2
  %retval.0.i.i.i.i.2 = phi i32 [ %15, %if.then.i.i.i.i.2 ], [ %14, %if.else.i.i.i.i.2 ]
  %cmp3.i.i.i.2 = icmp slt i32 %retval.0.i.i.i.i.2, 1
  br i1 %cmp3.i.i.i.2, label %if.then4.i.i.i.2, label %invoke.cont.2

if.then4.i.i.i.2:                                 ; preds = %_ZN9__gnu_cxxL27__exchange_and_add_dispatchEPii.exit.i.i.i.2
  call void @_ZNSs4_Rep10_M_destroyERKSaIcE(%"struct.std::basic_string<char, std::char_traits<char>, std::allocator<char> >::_Rep"* %12, %"class.std::allocator"* %ref.tmp.i.i) nounwind
  br label %invoke.cont.2

invoke.cont.2:                                    ; preds = %if.then4.i.i.i.2, %_ZN9__gnu_cxxL27__exchange_and_add_dispatchEPii.exit.i.i.i.2, %invoke.cont.1
  call void @llvm.lifetime.end(i64 1, i8* %0)
  call void @llvm.lifetime.start(i64 1, i8* %0)
  %_M_p.i.i.i.i.3 = getelementptr inbounds %"class.boost::array"* %this, i32 0, i32 0, i32 1, i32 0, i32 0
  %16 = load i8** %_M_p.i.i.i.i.3, align 4, !tbaa !0
  %arrayidx.i.i.i.3 = getelementptr inbounds i8* %16, i32 -12
  %17 = bitcast i8* %arrayidx.i.i.i.3 to %"struct.std::basic_string<char, std::char_traits<char>, std::allocator<char> >::_Rep"*
  %cmp.i.i.i.3 = icmp eq i8* %arrayidx.i.i.i.3, bitcast ([0 x i32]* @_ZNSs4_Rep20_S_empty_rep_storageE to i8*)
  br i1 %cmp.i.i.i.3, label %invoke.cont.3, label %if.then.i.i.i.3, !prof !4

if.then.i.i.i.3:                                  ; preds = %invoke.cont.2
  %_M_refcount.i.i.i.3 = getelementptr inbounds i8* %16, i32 -4
  %18 = bitcast i8* %_M_refcount.i.i.i.3 to i32*
  br i1 icmp ne (i8* bitcast (i32 (i32)* @pthread_cancel to i8*), i8* null), label %if.then.i.i.i.i.3, label %if.else.i.i.i.i.3

if.else.i.i.i.i.3:                                ; preds = %if.then.i.i.i.3
  %19 = load i32* %18, align 4, !tbaa !3
  %add.i.i.i.i.i.3 = add nsw i32 %19, -1
  store i32 %add.i.i.i.i.i.3, i32* %18, align 4, !tbaa !3
  br label %_ZN9__gnu_cxxL27__exchange_and_add_dispatchEPii.exit.i.i.i.3

if.then.i.i.i.i.3:                                ; preds = %if.then.i.i.i.3
  %20 = atomicrmw add i32* %18, i32 -1 seq_cst
  br label %_ZN9__gnu_cxxL27__exchange_and_add_dispatchEPii.exit.i.i.i.3

_ZN9__gnu_cxxL27__exchange_and_add_dispatchEPii.exit.i.i.i.3: ; preds = %if.then.i.i.i.i.3, %if.else.i.i.i.i.3
  %retval.0.i.i.i.i.3 = phi i32 [ %20, %if.then.i.i.i.i.3 ], [ %19, %if.else.i.i.i.i.3 ]
  %cmp3.i.i.i.3 = icmp slt i32 %retval.0.i.i.i.i.3, 1
  br i1 %cmp3.i.i.i.3, label %if.then4.i.i.i.3, label %invoke.cont.3

if.then4.i.i.i.3:                                 ; preds = %_ZN9__gnu_cxxL27__exchange_and_add_dispatchEPii.exit.i.i.i.3
  call void @_ZNSs4_Rep10_M_destroyERKSaIcE(%"struct.std::basic_string<char, std::char_traits<char>, std::allocator<char> >::_Rep"* %17, %"class.std::allocator"* %ref.tmp.i.i) nounwind
  br label %invoke.cont.3

invoke.cont.3:                                    ; preds = %if.then4.i.i.i.3, %_ZN9__gnu_cxxL27__exchange_and_add_dispatchEPii.exit.i.i.i.3, %invoke.cont.2
  call void @llvm.lifetime.end(i64 1, i8* %0)
  call void @llvm.lifetime.start(i64 1, i8* %0)
  %_M_p.i.i.i.i.4 = getelementptr inbounds %"class.boost::array"* %this, i32 0, i32 0, i32 0, i32 0, i32 0
  %21 = load i8** %_M_p.i.i.i.i.4, align 4, !tbaa !0
  %arrayidx.i.i.i.4 = getelementptr inbounds i8* %21, i32 -12
  %22 = bitcast i8* %arrayidx.i.i.i.4 to %"struct.std::basic_string<char, std::char_traits<char>, std::allocator<char> >::_Rep"*
  %cmp.i.i.i.4 = icmp eq i8* %arrayidx.i.i.i.4, bitcast ([0 x i32]* @_ZNSs4_Rep20_S_empty_rep_storageE to i8*)
  br i1 %cmp.i.i.i.4, label %invoke.cont.4, label %if.then.i.i.i.4, !prof !4

if.then.i.i.i.4:                                  ; preds = %invoke.cont.3
  %_M_refcount.i.i.i.4 = getelementptr inbounds i8* %21, i32 -4
  %23 = bitcast i8* %_M_refcount.i.i.i.4 to i32*
  br i1 icmp ne (i8* bitcast (i32 (i32)* @pthread_cancel to i8*), i8* null), label %if.then.i.i.i.i.4, label %if.else.i.i.i.i.4

if.else.i.i.i.i.4:                                ; preds = %if.then.i.i.i.4
  %24 = load i32* %23, align 4, !tbaa !3
  %add.i.i.i.i.i.4 = add nsw i32 %24, -1
  store i32 %add.i.i.i.i.i.4, i32* %23, align 4, !tbaa !3
  br label %_ZN9__gnu_cxxL27__exchange_and_add_dispatchEPii.exit.i.i.i.4

if.then.i.i.i.i.4:                                ; preds = %if.then.i.i.i.4
  %25 = atomicrmw add i32* %23, i32 -1 seq_cst
  br label %_ZN9__gnu_cxxL27__exchange_and_add_dispatchEPii.exit.i.i.i.4

_ZN9__gnu_cxxL27__exchange_and_add_dispatchEPii.exit.i.i.i.4: ; preds = %if.then.i.i.i.i.4, %if.else.i.i.i.i.4
  %retval.0.i.i.i.i.4 = phi i32 [ %25, %if.then.i.i.i.i.4 ], [ %24, %if.else.i.i.i.i.4 ]
  %cmp3.i.i.i.4 = icmp slt i32 %retval.0.i.i.i.i.4, 1
  br i1 %cmp3.i.i.i.4, label %if.then4.i.i.i.4, label %invoke.cont.4

if.then4.i.i.i.4:                                 ; preds = %_ZN9__gnu_cxxL27__exchange_and_add_dispatchEPii.exit.i.i.i.4
  call void @_ZNSs4_Rep10_M_destroyERKSaIcE(%"struct.std::basic_string<char, std::char_traits<char>, std::allocator<char> >::_Rep"* %22, %"class.std::allocator"* %ref.tmp.i.i) nounwind
  br label %invoke.cont.4

invoke.cont.4:                                    ; preds = %if.then4.i.i.i.4, %_ZN9__gnu_cxxL27__exchange_and_add_dispatchEPii.exit.i.i.i.4, %invoke.cont.3
  call void @llvm.lifetime.end(i64 1, i8* %0)
  ret void
}

declare void @_ZNSs4_Rep10_M_destroyERKSaIcE(%"struct.std::basic_string<char, std::char_traits<char>, std::allocator<char> >::_Rep"*, %"class.std::allocator"*) nounwind

declare extern_weak i32 @pthread_cancel(i32)

define internal void @_GLOBAL__I_a() section ".text.startup" {
entry:
  tail call void @_ZNSt8ios_base4InitC1Ev(%"class.std::ios_base::Init"* @_ZStL8__ioinit)
  %0 = tail call i32 @__cxa_atexit(void (i8*)* bitcast (void (%"class.std::ios_base::Init"*)* @_ZNSt8ios_base4InitD1Ev to void (i8*)*), i8* getelementptr inbounds (%"class.std::ios_base::Init"* @_ZStL8__ioinit, i32 0, i32 0), i8* @__dso_handle) nounwind
  ret void
}

declare void @llvm.lifetime.start(i64, i8* nocapture) nounwind

declare void @llvm.lifetime.end(i64, i8* nocapture) nounwind

!0 = metadata !{metadata !"any pointer", metadata !1}
!1 = metadata !{metadata !"omnipotent char", metadata !2}
!2 = metadata !{metadata !"Simple C/C++ TBAA"}
!3 = metadata !{metadata !"int", metadata !1}
!4 = metadata !{metadata !"branch_weights", i32 64, i32 4}
