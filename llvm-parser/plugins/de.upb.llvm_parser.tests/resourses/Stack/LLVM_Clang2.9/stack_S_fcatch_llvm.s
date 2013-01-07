;Terminal-command: clang stack.cpp -S -fcatch-undefined-behavior -emit-llvm
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
          to label %8 unwind label %18

; <label>:8                                       ; preds = %0
  store %class.Node* %7, %class.Node** %n, align 4
  %9 = load i32* %2, align 4
  %10 = load %class.Node** %n, align 4
  %11 = getelementptr inbounds %class.Node* %10, i32 0, i32 0
  store i32 %9, i32* %11, align 4
  br label %12

; <label>:12                                      ; preds = %29, %8
  %13 = getelementptr inbounds %class.Stack* %5, i32 0, i32 0
  %14 = bitcast %class.Node** %13 to i8*
  %15 = call i32 @llvm.objectsize.i32(i8* %14, i1 false)
  %16 = icmp eq i32 %15, -1
  br i1 %16, label %24, label %17

; <label>:17                                      ; preds = %12
  br label %22

; <label>:18                                      ; preds = %0
  %19 = call i8* @llvm.eh.exception() nounwind
  store i8* %19, i8** %3
  %20 = call i32 (i8*, i8*, ...)* @llvm.eh.selector(i8* %19, i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*), i8* null) nounwind
  store i32 0, i32* %4
  call void @_ZdlPv(i8* %6) nounwind
  br label %41

; <label>:21                                      ; preds = %22
  call void @llvm.trap() noreturn nounwind
  unreachable

; <label>:22                                      ; preds = %17
  %23 = icmp uge i32 %15, 4
  br i1 %23, label %24, label %21

; <label>:24                                      ; preds = %22, %12
  %25 = volatile load %class.Node** %13, align 4
  store %class.Node* %25, %class.Node** %ss, align 4
  %26 = load %class.Node** %ss, align 4
  %27 = load %class.Node** %n, align 4
  %28 = getelementptr inbounds %class.Node* %27, i32 0, i32 1
  store %class.Node* %26, %class.Node** %28, align 4
  br label %29

; <label>:29                                      ; preds = %24
  %30 = getelementptr inbounds %class.Stack* %5, i32 0, i32 0
  %31 = bitcast %class.Node** %30 to i32*
  %32 = load %class.Node** %ss, align 4
  %33 = ptrtoint %class.Node* %32 to i32
  %34 = load %class.Node** %n, align 4
  %35 = ptrtoint %class.Node* %34 to i32
  call void @llvm.memory.barrier(i1 true, i1 true, i1 true, i1 true, i1 true)
  %36 = call i32 @llvm.atomic.cmp.swap.i32.p0i32(i32* %31, i32 %33, i32 %35)
  call void @llvm.memory.barrier(i1 true, i1 true, i1 true, i1 true, i1 true)
  %37 = icmp eq i32 %36, %33
  %38 = zext i1 %37 to i32
  %39 = icmp eq i32 0, %38
  br i1 %39, label %12, label %40

; <label>:40                                      ; preds = %29
  ret void

; <label>:41                                      ; preds = %18
  %42 = load i8** %3
  call void @_Unwind_Resume_or_Rethrow(i8* %42) noreturn
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

declare i32 @llvm.objectsize.i32(i8*, i1) nounwind readnone

declare void @llvm.trap() nounwind

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

; <label>:4                                       ; preds = %30, %0
  %5 = getelementptr inbounds %class.Stack* %3, i32 0, i32 0
  %6 = bitcast %class.Node** %5 to i8*
  %7 = call i32 @llvm.objectsize.i32(i8* %6, i1 false)
  %8 = icmp eq i32 %7, -1
  br i1 %8, label %13, label %9

; <label>:9                                       ; preds = %4
  br label %11

; <label>:10                                      ; preds = %11
  call void @llvm.trap() noreturn nounwind
  unreachable

; <label>:11                                      ; preds = %9
  %12 = icmp uge i32 %7, 4
  br i1 %12, label %13, label %10

; <label>:13                                      ; preds = %11, %4
  %14 = volatile load %class.Node** %5, align 4
  store %class.Node* %14, %class.Node** %ss, align 4
  %15 = load %class.Node** %ss, align 4
  %16 = icmp eq %class.Node* %15, null
  br i1 %16, label %17, label %18

; <label>:17                                      ; preds = %13
  store %class.Node* null, %class.Node** %1
  br label %43

; <label>:18                                      ; preds = %13
  %19 = load %class.Node** %ss, align 4
  %20 = getelementptr inbounds %class.Node* %19, i32 0, i32 1
  %21 = bitcast %class.Node** %20 to i8*
  %22 = call i32 @llvm.objectsize.i32(i8* %21, i1 false)
  %23 = icmp eq i32 %22, -1
  br i1 %23, label %28, label %24

; <label>:24                                      ; preds = %18
  br label %26

; <label>:25                                      ; preds = %26
  call void @llvm.trap() noreturn nounwind
  unreachable

; <label>:26                                      ; preds = %24
  %27 = icmp uge i32 %22, 4
  br i1 %27, label %28, label %25

; <label>:28                                      ; preds = %26, %18
  %29 = load %class.Node** %20, align 4
  store %class.Node* %29, %class.Node** %ssn, align 4
  br label %30

; <label>:30                                      ; preds = %28
  %31 = getelementptr inbounds %class.Stack* %3, i32 0, i32 0
  %32 = bitcast %class.Node** %31 to i32*
  %33 = load %class.Node** %ss, align 4
  %34 = ptrtoint %class.Node* %33 to i32
  %35 = load %class.Node** %ssn, align 4
  %36 = ptrtoint %class.Node* %35 to i32
  call void @llvm.memory.barrier(i1 true, i1 true, i1 true, i1 true, i1 true)
  %37 = call i32 @llvm.atomic.cmp.swap.i32.p0i32(i32* %32, i32 %34, i32 %36)
  call void @llvm.memory.barrier(i1 true, i1 true, i1 true, i1 true, i1 true)
  %38 = icmp eq i32 %37, %34
  %39 = zext i1 %38 to i32
  %40 = icmp eq i32 0, %39
  br i1 %40, label %4, label %41

; <label>:41                                      ; preds = %30
  %42 = load %class.Node** %ss, align 4
  store %class.Node* %42, %class.Node** %1
  br label %43

; <label>:43                                      ; preds = %41, %17
  %44 = load %class.Node** %1
  ret %class.Node* %44
}

define linkonce_odr void @_ZN4NodeC2Ev(%class.Node* %this) unnamed_addr nounwind align 2 {
  %1 = alloca %class.Node*, align 4
  store %class.Node* %this, %class.Node** %1, align 4
  %2 = load %class.Node** %1
  %3 = getelementptr inbounds %class.Node* %2, i32 0, i32 0
  store i32 0, i32* %3, align 4
  ret void
}
