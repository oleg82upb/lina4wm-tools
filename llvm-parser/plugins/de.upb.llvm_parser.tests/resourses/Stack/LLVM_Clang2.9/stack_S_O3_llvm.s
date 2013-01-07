;Terminal-command: clang stack.cpp -S -O3 -emit-llvm
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

define void @_ZN5Stack4pushEi(%class.Stack* nocapture %this, i32 %v) align 2 {
  %1 = tail call noalias i8* @_Znwj(i32 8)
  %2 = bitcast i8* %1 to i32*
  store i32 %v, i32* %2, align 4, !tbaa !3
  %3 = getelementptr inbounds %class.Stack* %this, i32 0, i32 0
  %4 = getelementptr inbounds i8* %1, i32 4
  %5 = bitcast i8* %4 to %class.Node**
  %6 = bitcast %class.Stack* %this to i32*
  %7 = ptrtoint i8* %1 to i32
  br label %8

; <label>:8                                       ; preds = %8, %0
  %9 = volatile load %class.Node** %3, align 4, !tbaa !0
  store %class.Node* %9, %class.Node** %5, align 4, !tbaa !0
  %10 = ptrtoint %class.Node* %9 to i32
  tail call void @llvm.memory.barrier(i1 true, i1 true, i1 true, i1 true, i1 true)
  %11 = tail call i32 @llvm.atomic.cmp.swap.i32.p0i32(i32* %6, i32 %10, i32 %7)
  tail call void @llvm.memory.barrier(i1 true, i1 true, i1 true, i1 true, i1 true)
  %12 = icmp eq i32 %11, %10
  br i1 %12, label %13, label %8

; <label>:13                                      ; preds = %8
  ret void
}

declare noalias i8* @_Znwj(i32)

declare i32 @llvm.atomic.cmp.swap.i32.p0i32(i32* nocapture, i32, i32) nounwind

declare void @llvm.memory.barrier(i1, i1, i1, i1, i1) nounwind

define %class.Node* @_ZN5Stack3popEv(%class.Stack* nocapture %this) nounwind align 2 {
  %1 = getelementptr inbounds %class.Stack* %this, i32 0, i32 0
  %2 = bitcast %class.Stack* %this to i32*
  br label %3

; <label>:3                                       ; preds = %6, %0
  %4 = volatile load %class.Node** %1, align 4, !tbaa !0
  %5 = icmp eq %class.Node* %4, null
  br i1 %5, label %13, label %6

; <label>:6                                       ; preds = %3
  %7 = getelementptr inbounds %class.Node* %4, i32 0, i32 1
  %8 = load %class.Node** %7, align 4, !tbaa !0
  %9 = ptrtoint %class.Node* %4 to i32
  %10 = ptrtoint %class.Node* %8 to i32
  tail call void @llvm.memory.barrier(i1 true, i1 true, i1 true, i1 true, i1 true)
  %11 = tail call i32 @llvm.atomic.cmp.swap.i32.p0i32(i32* %2, i32 %9, i32 %10)
  tail call void @llvm.memory.barrier(i1 true, i1 true, i1 true, i1 true, i1 true)
  %12 = icmp eq i32 %11, %9
  br i1 %12, label %13, label %3

; <label>:13                                      ; preds = %6, %3
  %.0 = phi %class.Node* [ null, %3 ], [ %4, %6 ]
  ret %class.Node* %.0
}

!0 = metadata !{metadata !"any pointer", metadata !1}
!1 = metadata !{metadata !"omnipotent char", metadata !2}
!2 = metadata !{metadata !"Simple C/C++ TBAA", null}
!3 = metadata !{metadata !"int", metadata !1}
