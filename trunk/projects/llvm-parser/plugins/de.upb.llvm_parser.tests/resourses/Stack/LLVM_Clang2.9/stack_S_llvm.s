;Terminal-command: clang stack.cpp -S -emit-llvm
; ModuleID = 'stack.cpp'
target datalayout = "e-p:32:32:32-i1:8:8-i8:8:8-i16:16:16-i32:32:32-i64:32:64-f32:32:32-f64:32:64-v64:64:64-v128:128:128-a0:0:64-f80:32:32-n8:16:32"
target triple = "i386-pc-linux-gnu"

%class.Node = type { i32, %class.Node* }
%class.Stack = type { %class.Node* }

@_ZN5StackC1Ev = alias void (%class.Stack*)* @_ZN5StackC2Ev

define void @_ZN5StackC2Ev(%class.Stack* %this) unnamed_addr nounwind align 2 {
  %1 = alloca %class.Stack*, align 4
  store %class.Stack* %this, %class.Stack** %1, align 4
  %2 = load %class.Stack** %1
  %3 = getelementptr inbounds %class.Stack* %2, i32 0, i32 0
  volatile store %class.Node* null, %class.Node** %3, align 4
  ret void
}

define void @_ZN5Stack4pushEi(%class.Stack* %this, i32 %v) align 2 {
  %1 = alloca %class.Stack*, align 4
  %2 = alloca i32, align 4
  %n = alloca %class.Node*, align 4
  %ss = alloca %class.Node*, align 4
  %3 = alloca i8*
  %4 = alloca i32
  store %class.Stack* %this, %class.Stack** %1, align 4
  store i32 %v, i32* %2, align 4
  %5 = load %class.Stack** %1
  %6 = call noalias i8* @_Znwj(i32 8)
  %7 = bitcast i8* %6 to %class.Node*
  invoke void @_ZN4NodeC1Ev(%class.Node* %7)
          to label %8 unwind label %30

; <label>:8                                       ; preds = %0
  store %class.Node* %7, %class.Node** %n, align 4
  %9 = load i32* %2, align 4
  %10 = load %class.Node** %n, align 4
  %11 = getelementptr inbounds %class.Node* %10, i32 0, i32 0
  store i32 %9, i32* %11, align 4
  br label %12

; <label>:12                                      ; preds = %18, %8
  %13 = getelementptr inbounds %class.Stack* %5, i32 0, i32 0
  %14 = volatile load %class.Node** %13, align 4
  store %class.Node* %14, %class.Node** %ss, align 4
  %15 = load %class.Node** %ss, align 4
  %16 = load %class.Node** %n, align 4
  %17 = getelementptr inbounds %class.Node* %16, i32 0, i32 1
  store %class.Node* %15, %class.Node** %17, align 4
  br label %18

; <label>:18                                      ; preds = %12
  %19 = getelementptr inbounds %class.Stack* %5, i32 0, i32 0
  %20 = bitcast %class.Node** %19 to i32*
  %21 = load %class.Node** %ss, align 4
  %22 = ptrtoint %class.Node* %21 to i32
  %23 = load %class.Node** %n, align 4
  %24 = ptrtoint %class.Node* %23 to i32
  call void @llvm.memory.barrier(i1 true, i1 true, i1 true, i1 true, i1 true)
  %25 = call i32 @llvm.atomic.cmp.swap.i32.p0i32(i32* %20, i32 %22, i32 %24)
  call void @llvm.memory.barrier(i1 true, i1 true, i1 true, i1 true, i1 true)
  %26 = icmp eq i32 %25, %22
  %27 = zext i1 %26 to i32
  %28 = icmp eq i32 0, %27
  br i1 %28, label %12, label %29

; <label>:29                                      ; preds = %18
  ret void

; <label>:30                                      ; preds = %0
  %31 = call i8* @llvm.eh.exception() nounwind
  store i8* %31, i8** %3
  %32 = call i32 (i8*, i8*, ...)* @llvm.eh.selector(i8* %31, i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*), i8* null) nounwind
  store i32 0, i32* %4
  call void @_ZdlPv(i8* %6) nounwind
  br label %33

; <label>:33                                      ; preds = %30
  %34 = load i8** %3
  call void @_Unwind_Resume_or_Rethrow(i8* %34) noreturn
  unreachable
}

declare noalias i8* @_Znwj(i32)

define linkonce_odr void @_ZN4NodeC1Ev(%class.Node* %this) unnamed_addr align 2 {
  %1 = alloca %class.Node*, align 4
  store %class.Node* %this, %class.Node** %1, align 4
  %2 = load %class.Node** %1
  call void @_ZN4NodeC2Ev(%class.Node* %2)
  ret void
}

declare i8* @llvm.eh.exception() nounwind readonly

declare i32 @__gxx_personality_v0(...)

declare i32 @llvm.eh.selector(i8*, i8*, ...) nounwind

declare i32 @llvm.eh.typeid.for(i8*) nounwind

declare void @_Unwind_Resume_or_Rethrow(i8*)

declare void @_ZdlPv(i8*) nounwind

declare i32 @llvm.atomic.cmp.swap.i32.p0i32(i32* nocapture, i32, i32) nounwind

declare void @llvm.memory.barrier(i1, i1, i1, i1, i1) nounwind

define %class.Node* @_ZN5Stack3popEv(%class.Stack* %this) nounwind align 2 {
  %1 = alloca %class.Node*, align 4
  %2 = alloca %class.Stack*, align 4
  %ss = alloca %class.Node*, align 4
  %ssn = alloca %class.Node*, align 4
  store %class.Stack* %this, %class.Stack** %2, align 4
  %3 = load %class.Stack** %2
  br label %4

; <label>:4                                       ; preds = %14, %0
  %5 = getelementptr inbounds %class.Stack* %3, i32 0, i32 0
  %6 = volatile load %class.Node** %5, align 4
  store %class.Node* %6, %class.Node** %ss, align 4
  %7 = load %class.Node** %ss, align 4
  %8 = icmp eq %class.Node* %7, null
  br i1 %8, label %9, label %10

; <label>:9                                       ; preds = %4
  store %class.Node* null, %class.Node** %1
  br label %27

; <label>:10                                      ; preds = %4
  %11 = load %class.Node** %ss, align 4
  %12 = getelementptr inbounds %class.Node* %11, i32 0, i32 1
  %13 = load %class.Node** %12, align 4
  store %class.Node* %13, %class.Node** %ssn, align 4
  br label %14

; <label>:14                                      ; preds = %10
  %15 = getelementptr inbounds %class.Stack* %3, i32 0, i32 0
  %16 = bitcast %class.Node** %15 to i32*
  %17 = load %class.Node** %ss, align 4
  %18 = ptrtoint %class.Node* %17 to i32
  %19 = load %class.Node** %ssn, align 4
  %20 = ptrtoint %class.Node* %19 to i32
  call void @llvm.memory.barrier(i1 true, i1 true, i1 true, i1 true, i1 true)
  %21 = call i32 @llvm.atomic.cmp.swap.i32.p0i32(i32* %16, i32 %18, i32 %20)
  call void @llvm.memory.barrier(i1 true, i1 true, i1 true, i1 true, i1 true)
  %22 = icmp eq i32 %21, %18
  %23 = zext i1 %22 to i32
  %24 = icmp eq i32 0, %23
  br i1 %24, label %4, label %25

; <label>:25                                      ; preds = %14
  %26 = load %class.Node** %ss, align 4
  store %class.Node* %26, %class.Node** %1
  br label %27

; <label>:27                                      ; preds = %25, %9
  %28 = load %class.Node** %1
  ret %class.Node* %28
}

define linkonce_odr void @_ZN4NodeC2Ev(%class.Node* %this) unnamed_addr nounwind align 2 {
  %1 = alloca %class.Node*, align 4
  store %class.Node* %this, %class.Node** %1, align 4
  %2 = load %class.Node** %1
  %3 = getelementptr inbounds %class.Node* %2, i32 0, i32 0
  store i32 0, i32* %3, align 4
  ret void
}
