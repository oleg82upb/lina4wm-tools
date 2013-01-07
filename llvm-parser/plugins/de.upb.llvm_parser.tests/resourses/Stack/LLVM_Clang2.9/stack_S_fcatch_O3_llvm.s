;Terminal-command: clang stack.cpp -S -fcatch-undefined-behavior -O3 -emit-llvm
; ModuleID = 'stack.cpp'
target datalayout = "e-p:32:32:32-i1:8:8-i8:8:8-i16:16:16-i32:32:32-i64:32:64-f32:32:32-f64:32:64-v64:64:64-v128:128:128-a0:0:64-f80:32:32-n8:16:32"
target triple = "i386-pc-linux-gnu"

%class.Node = type { i32, %class.Node* }
%class.Stack = type { %class.Node* }

@_ZN5StackC1Ev = alias void (%class.Stack*)* @_ZN5StackC2Ev

define void @_ZN5StackC2Ev(%class.Stack* nocapture %this) unnamed_addr nounwind align 2 {
  %1 = getelementptr inbounds %class.Stack* %this, i32 0, i32 0
  volatile store %class.Node* null, %class.Node** %1, align 4, !tbaa !0
  ret void
}

define void @_ZN5Stack4pushEi(%class.Stack* %this, i32 %v) align 2 {
  %1 = tail call noalias i8* @_Znwj(i32 8)
  %2 = bitcast i8* %1 to i32*
  store i32 %v, i32* %2, align 4, !tbaa !3
  %3 = bitcast %class.Stack* %this to i8*
  %4 = tail call i32 @llvm.objectsize.i32(i8* %3, i1 false)
  %5 = icmp ugt i32 %4, 3
  %6 = getelementptr inbounds %class.Stack* %this, i32 0, i32 0
  %7 = getelementptr inbounds i8* %1, i32 4
  %8 = bitcast i8* %7 to %class.Node**
  %9 = bitcast %class.Stack* %this to i32*
  %10 = ptrtoint i8* %1 to i32
  br i1 %5, label %..split_crit_edge, label %.split1

.split1:                                          ; preds = %0
  tail call void @llvm.trap() noreturn nounwind
  unreachable

..split_crit_edge:                                ; preds = %..split_crit_edge, %0
  %11 = volatile load %class.Node** %6, align 4, !tbaa !0
  store %class.Node* %11, %class.Node** %8, align 4, !tbaa !0
  %12 = ptrtoint %class.Node* %11 to i32
  tail call void @llvm.memory.barrier(i1 true, i1 true, i1 true, i1 true, i1 true)
  %13 = tail call i32 @llvm.atomic.cmp.swap.i32.p0i32(i32* %9, i32 %12, i32 %10)
  tail call void @llvm.memory.barrier(i1 true, i1 true, i1 true, i1 true, i1 true)
  %14 = icmp eq i32 %13, %12
  br i1 %14, label %15, label %..split_crit_edge

; <label>:15                                      ; preds = %..split_crit_edge
  ret void
}

declare noalias i8* @_Znwj(i32)

declare i32 @llvm.objectsize.i32(i8*, i1) nounwind readnone

declare void @llvm.trap() nounwind

declare i32 @llvm.atomic.cmp.swap.i32.p0i32(i32* nocapture, i32, i32) nounwind

declare void @llvm.memory.barrier(i1, i1, i1, i1, i1) nounwind

define %class.Node* @_ZN5Stack3popEv(%class.Stack* %this) nounwind align 2 {
  %1 = bitcast %class.Stack* %this to i8*
  %2 = tail call i32 @llvm.objectsize.i32(i8* %1, i1 false)
  %3 = icmp ugt i32 %2, 3
  %4 = getelementptr inbounds %class.Stack* %this, i32 0, i32 0
  %5 = bitcast %class.Stack* %this to i32*
  br i1 %3, label %..split_crit_edge, label %.split2

.split2:                                          ; preds = %8, %0
  tail call void @llvm.trap() noreturn nounwind
  unreachable

..split_crit_edge:                                ; preds = %13, %0
  %6 = volatile load %class.Node** %4, align 4, !tbaa !0
  %7 = icmp eq %class.Node* %6, null
  br i1 %7, label %19, label %8

; <label>:8                                       ; preds = %..split_crit_edge
  %9 = getelementptr inbounds %class.Node* %6, i32 0, i32 1
  %10 = bitcast %class.Node** %9 to i8*
  %11 = tail call i32 @llvm.objectsize.i32(i8* %10, i1 false)
  %12 = icmp ugt i32 %11, 3
  br i1 %12, label %13, label %.split2

; <label>:13                                      ; preds = %8
  %14 = load %class.Node** %9, align 4, !tbaa !0
  %15 = ptrtoint %class.Node* %6 to i32
  %16 = ptrtoint %class.Node* %14 to i32
  tail call void @llvm.memory.barrier(i1 true, i1 true, i1 true, i1 true, i1 true)
  %17 = tail call i32 @llvm.atomic.cmp.swap.i32.p0i32(i32* %5, i32 %15, i32 %16)
  tail call void @llvm.memory.barrier(i1 true, i1 true, i1 true, i1 true, i1 true)
  %18 = icmp eq i32 %17, %15
  br i1 %18, label %19, label %..split_crit_edge

; <label>:19                                      ; preds = %13, %..split_crit_edge
  %.0 = phi %class.Node* [ null, %..split_crit_edge ], [ %6, %13 ]
  ret %class.Node* %.0
}

!0 = metadata !{metadata !"any pointer", metadata !1}
!1 = metadata !{metadata !"omnipotent char", metadata !2}
!2 = metadata !{metadata !"Simple C/C++ TBAA", null}
!3 = metadata !{metadata !"int", metadata !1}
