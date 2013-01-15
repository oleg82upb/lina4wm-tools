;clang stack.cpp -S -emit-llvm
; ModuleID = 'stack.cpp'
target datalayout = "e-p:32:32:32-i1:8:8-i8:8:8-i16:16:16-i32:32:32-i64:32:64-f32:32:32-f64:32:64-v64:64:64-v128:128:128-a0:0:64-f80:32:32-n8:16:32-S128"
target triple = "i386-pc-linux-gnu"

%class.Stack = type { %class.Node* }
%class.Node = type { i32, %class.Node* }

@_ZN5StackC1Ev = alias void (%class.Stack*)* @_ZN5StackC2Ev

define void @_ZN5StackC2Ev(%class.Stack* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %class.Stack*, align 4
  store %class.Stack* %this, %class.Stack** %this.addr, align 4
  %this1 = load %class.Stack** %this.addr
  %head = getelementptr inbounds %class.Stack* %this1, i32 0, i32 0
  store volatile %class.Node* null, %class.Node** %head, align 4
  ret void
}

define void @_ZN5Stack4pushEi(%class.Stack* %this, i32 %v) align 2 {
entry:
  %this.addr = alloca %class.Stack*, align 4
  %v.addr = alloca i32, align 4
  %n = alloca %class.Node*, align 4
  %ss = alloca %class.Node*, align 4
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  store %class.Stack* %this, %class.Stack** %this.addr, align 4
  store i32 %v, i32* %v.addr, align 4
  %this1 = load %class.Stack** %this.addr
  %call = call noalias i8* @_Znwj(i32 8)
  %0 = bitcast i8* %call to %class.Node*
  invoke void @_ZN4NodeC1Ev(%class.Node* %0)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %entry
  store %class.Node* %0, %class.Node** %n, align 4
  %1 = load i32* %v.addr, align 4
  %2 = load %class.Node** %n, align 4
  %val = getelementptr inbounds %class.Node* %2, i32 0, i32 0
  store i32 %1, i32* %val, align 4
  br label %do.body

do.body:                                          ; preds = %do.cond, %invoke.cont
  %head = getelementptr inbounds %class.Stack* %this1, i32 0, i32 0
  %3 = load volatile %class.Node** %head, align 4
  store %class.Node* %3, %class.Node** %ss, align 4
  %4 = load %class.Node** %ss, align 4
  %5 = load %class.Node** %n, align 4
  %next = getelementptr inbounds %class.Node* %5, i32 0, i32 1
  store %class.Node* %4, %class.Node** %next, align 4
  br label %do.cond

do.cond:                                          ; preds = %do.body
  %head2 = getelementptr inbounds %class.Stack* %this1, i32 0, i32 0
  %6 = bitcast %class.Node** %head2 to i32*
  %7 = load %class.Node** %ss, align 4
  %8 = ptrtoint %class.Node* %7 to i32
  %9 = load %class.Node** %n, align 4
  %10 = ptrtoint %class.Node* %9 to i32
  %11 = cmpxchg i32* %6, i32 %8, i32 %10 seq_cst
  %12 = icmp eq i32 %11, %8
  %conv = zext i1 %12 to i32
  %cmp = icmp eq i32 0, %conv
  br i1 %cmp, label %do.body, label %do.end

do.end:                                           ; preds = %do.cond
  ret void

lpad:                                             ; preds = %entry
  %13 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %14 = extractvalue { i8*, i32 } %13, 0
  store i8* %14, i8** %exn.slot
  %15 = extractvalue { i8*, i32 } %13, 1
  store i32 %15, i32* %ehselector.slot
  call void @_ZdlPv(i8* %call) nounwind
  br label %eh.resume

eh.resume:                                        ; preds = %lpad
  %exn = load i8** %exn.slot
  %sel = load i32* %ehselector.slot
  %lpad.val = insertvalue { i8*, i32 } undef, i8* %exn, 0
  %lpad.val3 = insertvalue { i8*, i32 } %lpad.val, i32 %sel, 1
  resume { i8*, i32 } %lpad.val3
}

declare noalias i8* @_Znwj(i32)

define linkonce_odr void @_ZN4NodeC1Ev(%class.Node* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %class.Node*, align 4
  store %class.Node* %this, %class.Node** %this.addr, align 4
  %this1 = load %class.Node** %this.addr
  call void @_ZN4NodeC2Ev(%class.Node* %this1)
  ret void
}

declare i32 @__gxx_personality_v0(...)

declare void @_ZdlPv(i8*) nounwind

define %class.Node* @_ZN5Stack3popEv(%class.Stack* %this) nounwind align 2 {
entry:
  %retval = alloca %class.Node*, align 4
  %this.addr = alloca %class.Stack*, align 4
  %ss = alloca %class.Node*, align 4
  %ssn = alloca %class.Node*, align 4
  store %class.Stack* %this, %class.Stack** %this.addr, align 4
  %this1 = load %class.Stack** %this.addr
  br label %do.body

do.body:                                          ; preds = %do.cond, %entry
  %head = getelementptr inbounds %class.Stack* %this1, i32 0, i32 0
  %0 = load volatile %class.Node** %head, align 4
  store %class.Node* %0, %class.Node** %ss, align 4
  %1 = load %class.Node** %ss, align 4
  %cmp = icmp eq %class.Node* %1, null
  br i1 %cmp, label %if.then, label %if.end

if.then:                                          ; preds = %do.body
  store %class.Node* null, %class.Node** %retval
  br label %return

if.end:                                           ; preds = %do.body
  %2 = load %class.Node** %ss, align 4
  %next = getelementptr inbounds %class.Node* %2, i32 0, i32 1
  %3 = load %class.Node** %next, align 4
  store %class.Node* %3, %class.Node** %ssn, align 4
  br label %do.cond

do.cond:                                          ; preds = %if.end
  %head2 = getelementptr inbounds %class.Stack* %this1, i32 0, i32 0
  %4 = bitcast %class.Node** %head2 to i32*
  %5 = load %class.Node** %ss, align 4
  %6 = ptrtoint %class.Node* %5 to i32
  %7 = load %class.Node** %ssn, align 4
  %8 = ptrtoint %class.Node* %7 to i32
  %9 = cmpxchg i32* %4, i32 %6, i32 %8 seq_cst
  %10 = icmp eq i32 %9, %6
  %conv = zext i1 %10 to i32
  %cmp3 = icmp eq i32 0, %conv
  br i1 %cmp3, label %do.body, label %do.end

do.end:                                           ; preds = %do.cond
  %11 = load %class.Node** %ss, align 4
  store %class.Node* %11, %class.Node** %retval
  br label %return

return:                                           ; preds = %do.end, %if.then
  %12 = load %class.Node** %retval
  ret %class.Node* %12
}

define linkonce_odr void @_ZN4NodeC2Ev(%class.Node* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %class.Node*, align 4
  store %class.Node* %this, %class.Node** %this.addr, align 4
  %this1 = load %class.Node** %this.addr
  %val = getelementptr inbounds %class.Node* %this1, i32 0, i32 0
  store i32 0, i32* %val, align 4
  ret void
}