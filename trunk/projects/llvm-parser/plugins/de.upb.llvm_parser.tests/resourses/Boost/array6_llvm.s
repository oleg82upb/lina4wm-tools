; ModuleID = 'array6.cpp'
target datalayout = "e-p:32:32:32-i1:8:8-i8:8:8-i16:16:16-i32:32:32-i64:32:64-f32:32:32-f64:32:64-v64:64:64-v128:128:128-a0:0:64-f80:32:32-n8:16:32-S128"
target triple = "i386-pc-linux-gnu"

%"class.std::ios_base::Init" = type { i8 }
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
%"class.boost::array.2" = type { [5 x i8] }
%"class.boost::array.1" = type { [5 x i8*] }
%"class.boost::array.0" = type { [5 x x86_fp80] }
%"class.boost::array" = type { [5 x %"class.std::basic_string"] }
%"class.std::basic_string" = type { %"struct.std::basic_string<char, std::char_traits<char>, std::allocator<char> >::_Alloc_hider" }
%"struct.std::basic_string<char, std::char_traits<char>, std::allocator<char> >::_Alloc_hider" = type { i8* }

@_ZStL8__ioinit = internal global %"class.std::ios_base::Init" zeroinitializer, align 1
@__dso_handle = external global i8
@_ZN12_GLOBAL__N_112failed_testsE = internal global i32 0, align 4
@.str = private unnamed_addr constant [33 x i8] c"Array6: Same thing not equal?(1)\00", align 1
@.str1 = private unnamed_addr constant [33 x i8] c"Array6: Same thing not equal?(2)\00", align 1
@_ZSt4cerr = external global %"class.std::basic_ostream"
@.str2 = private unnamed_addr constant [14 x i8] c"Test failure \00", align 1
@.str3 = private unnamed_addr constant [3 x i8] c": \00", align 1
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

define i32 @main() {
entry:
  %retval = alloca i32, align 4
  store i32 0, i32* %retval
  call void @_ZN12_GLOBAL__N_18RunTestsIbEEvv()
  call void @_ZN12_GLOBAL__N_18RunTestsIPvEEvv()
  call void @_ZN12_GLOBAL__N_18RunTestsIeEEvv()
  call void @_ZN12_GLOBAL__N_18RunTestsISsEEvv()
  %0 = load i32* @_ZN12_GLOBAL__N_112failed_testsE, align 4
  ret i32 %0
}

define internal void @_ZN12_GLOBAL__N_18RunTestsIbEEvv() {
entry:
  %test_case = alloca %"class.boost::array.2", align 1
  %aRef = alloca [5 x i8]*, align 4
  %caRef = alloca [5 x i8]*, align 4
  %iter = alloca i8*, align 4
  %call = call [5 x i8]* @_ZN5boost11get_c_arrayIbLj5EEERAT0__T_RNS_5arrayIS1_XT0_EEE(%"class.boost::array.2"* %test_case)
  store [5 x i8]* %call, [5 x i8]** %aRef, align 4
  %call1 = call i8* @_ZN5boost5arrayIbLj5EE5beginEv(%"class.boost::array.2"* %test_case)
  %0 = load [5 x i8]** %aRef, align 4
  %arrayidx = getelementptr inbounds [5 x i8]* %0, i32 0, i32 0
  %cmp = icmp ne i8* %call1, %arrayidx
  br i1 %cmp, label %if.then, label %if.end

if.then:                                          ; preds = %entry
  call void @_ZN12_GLOBAL__N_19fail_testEPKc(i8* getelementptr inbounds ([33 x i8]* @.str, i32 0, i32 0))
  br label %if.end

if.end:                                           ; preds = %if.then, %entry
  %call2 = call [5 x i8]* @_ZN5boost11get_c_arrayIbLj5EEERAT0__T_RNS_5arrayIS1_XT0_EEE(%"class.boost::array.2"* %test_case)
  store [5 x i8]* %call2, [5 x i8]** %caRef, align 4
  %call3 = call i8* @_ZN5boost5arrayIbLj5EE5beginEv(%"class.boost::array.2"* %test_case)
  store i8* %call3, i8** %iter, align 4
  %1 = load i8** %iter, align 4
  %2 = load [5 x i8]** %caRef, align 4
  %arrayidx4 = getelementptr inbounds [5 x i8]* %2, i32 0, i32 0
  %cmp5 = icmp ne i8* %1, %arrayidx4
  br i1 %cmp5, label %if.then6, label %if.end7

if.then6:                                         ; preds = %if.end
  call void @_ZN12_GLOBAL__N_19fail_testEPKc(i8* getelementptr inbounds ([33 x i8]* @.str1, i32 0, i32 0))
  br label %if.end7

if.end7:                                          ; preds = %if.then6, %if.end
  ret void
}

define internal void @_ZN12_GLOBAL__N_18RunTestsIPvEEvv() {
entry:
  %test_case = alloca %"class.boost::array.1", align 4
  %aRef = alloca [5 x i8*]*, align 4
  %caRef = alloca [5 x i8*]*, align 4
  %iter = alloca i8**, align 4
  %call = call [5 x i8*]* @_ZN5boost11get_c_arrayIPvLj5EEERAT0__T_RNS_5arrayIS2_XT0_EEE(%"class.boost::array.1"* %test_case)
  store [5 x i8*]* %call, [5 x i8*]** %aRef, align 4
  %call1 = call i8** @_ZN5boost5arrayIPvLj5EE5beginEv(%"class.boost::array.1"* %test_case)
  %0 = load [5 x i8*]** %aRef, align 4
  %arrayidx = getelementptr inbounds [5 x i8*]* %0, i32 0, i32 0
  %cmp = icmp ne i8** %call1, %arrayidx
  br i1 %cmp, label %if.then, label %if.end

if.then:                                          ; preds = %entry
  call void @_ZN12_GLOBAL__N_19fail_testEPKc(i8* getelementptr inbounds ([33 x i8]* @.str, i32 0, i32 0))
  br label %if.end

if.end:                                           ; preds = %if.then, %entry
  %call2 = call [5 x i8*]* @_ZN5boost11get_c_arrayIPvLj5EEERAT0__T_RNS_5arrayIS2_XT0_EEE(%"class.boost::array.1"* %test_case)
  store [5 x i8*]* %call2, [5 x i8*]** %caRef, align 4
  %call3 = call i8** @_ZN5boost5arrayIPvLj5EE5beginEv(%"class.boost::array.1"* %test_case)
  store i8** %call3, i8*** %iter, align 4
  %1 = load i8*** %iter, align 4
  %2 = load [5 x i8*]** %caRef, align 4
  %arrayidx4 = getelementptr inbounds [5 x i8*]* %2, i32 0, i32 0
  %cmp5 = icmp ne i8** %1, %arrayidx4
  br i1 %cmp5, label %if.then6, label %if.end7

if.then6:                                         ; preds = %if.end
  call void @_ZN12_GLOBAL__N_19fail_testEPKc(i8* getelementptr inbounds ([33 x i8]* @.str1, i32 0, i32 0))
  br label %if.end7

if.end7:                                          ; preds = %if.then6, %if.end
  ret void
}

define internal void @_ZN12_GLOBAL__N_18RunTestsIeEEvv() {
entry:
  %test_case = alloca %"class.boost::array.0", align 4
  %aRef = alloca [5 x x86_fp80]*, align 4
  %caRef = alloca [5 x x86_fp80]*, align 4
  %iter = alloca x86_fp80*, align 4
  %call = call [5 x x86_fp80]* @_ZN5boost11get_c_arrayIeLj5EEERAT0__T_RNS_5arrayIS1_XT0_EEE(%"class.boost::array.0"* %test_case)
  store [5 x x86_fp80]* %call, [5 x x86_fp80]** %aRef, align 4
  %call1 = call x86_fp80* @_ZN5boost5arrayIeLj5EE5beginEv(%"class.boost::array.0"* %test_case)
  %0 = load [5 x x86_fp80]** %aRef, align 4
  %arrayidx = getelementptr inbounds [5 x x86_fp80]* %0, i32 0, i32 0
  %cmp = icmp ne x86_fp80* %call1, %arrayidx
  br i1 %cmp, label %if.then, label %if.end

if.then:                                          ; preds = %entry
  call void @_ZN12_GLOBAL__N_19fail_testEPKc(i8* getelementptr inbounds ([33 x i8]* @.str, i32 0, i32 0))
  br label %if.end

if.end:                                           ; preds = %if.then, %entry
  %call2 = call [5 x x86_fp80]* @_ZN5boost11get_c_arrayIeLj5EEERAT0__T_RNS_5arrayIS1_XT0_EEE(%"class.boost::array.0"* %test_case)
  store [5 x x86_fp80]* %call2, [5 x x86_fp80]** %caRef, align 4
  %call3 = call x86_fp80* @_ZN5boost5arrayIeLj5EE5beginEv(%"class.boost::array.0"* %test_case)
  store x86_fp80* %call3, x86_fp80** %iter, align 4
  %1 = load x86_fp80** %iter, align 4
  %2 = load [5 x x86_fp80]** %caRef, align 4
  %arrayidx4 = getelementptr inbounds [5 x x86_fp80]* %2, i32 0, i32 0
  %cmp5 = icmp ne x86_fp80* %1, %arrayidx4
  br i1 %cmp5, label %if.then6, label %if.end7

if.then6:                                         ; preds = %if.end
  call void @_ZN12_GLOBAL__N_19fail_testEPKc(i8* getelementptr inbounds ([33 x i8]* @.str1, i32 0, i32 0))
  br label %if.end7

if.end7:                                          ; preds = %if.then6, %if.end
  ret void
}

define internal void @_ZN12_GLOBAL__N_18RunTestsISsEEvv() {
entry:
  %test_case = alloca %"class.boost::array", align 4
  %aRef = alloca [5 x %"class.std::basic_string"]*, align 4
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  %caRef = alloca [5 x %"class.std::basic_string"]*, align 4
  %iter = alloca %"class.std::basic_string"*, align 4
  call void @_ZN5boost5arrayISsLj5EEC1Ev(%"class.boost::array"* %test_case)
  %call = invoke [5 x %"class.std::basic_string"]* @_ZN5boost11get_c_arrayISsLj5EEERAT0__T_RNS_5arrayIS1_XT0_EEE(%"class.boost::array"* %test_case)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %entry
  store [5 x %"class.std::basic_string"]* %call, [5 x %"class.std::basic_string"]** %aRef, align 4
  %call2 = invoke %"class.std::basic_string"* @_ZN5boost5arrayISsLj5EE5beginEv(%"class.boost::array"* %test_case)
          to label %invoke.cont1 unwind label %lpad

invoke.cont1:                                     ; preds = %invoke.cont
  %0 = load [5 x %"class.std::basic_string"]** %aRef, align 4
  %arrayidx = getelementptr inbounds [5 x %"class.std::basic_string"]* %0, i32 0, i32 0
  %cmp = icmp ne %"class.std::basic_string"* %call2, %arrayidx
  br i1 %cmp, label %if.then, label %if.end

if.then:                                          ; preds = %invoke.cont1
  invoke void @_ZN12_GLOBAL__N_19fail_testEPKc(i8* getelementptr inbounds ([33 x i8]* @.str, i32 0, i32 0))
          to label %invoke.cont3 unwind label %lpad

invoke.cont3:                                     ; preds = %if.then
  br label %if.end

lpad:                                             ; preds = %if.then10, %invoke.cont4, %if.end, %if.then, %invoke.cont, %entry
  %1 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %2 = extractvalue { i8*, i32 } %1, 0
  store i8* %2, i8** %exn.slot
  %3 = extractvalue { i8*, i32 } %1, 1
  store i32 %3, i32* %ehselector.slot
  invoke void @_ZN5boost5arrayISsLj5EED1Ev(%"class.boost::array"* %test_case)
          to label %invoke.cont13 unwind label %terminate.lpad

if.end:                                           ; preds = %invoke.cont3, %invoke.cont1
  %call5 = invoke [5 x %"class.std::basic_string"]* @_ZN5boost11get_c_arrayISsLj5EEERAT0__T_RNS_5arrayIS1_XT0_EEE(%"class.boost::array"* %test_case)
          to label %invoke.cont4 unwind label %lpad

invoke.cont4:                                     ; preds = %if.end
  store [5 x %"class.std::basic_string"]* %call5, [5 x %"class.std::basic_string"]** %caRef, align 4
  %call7 = invoke %"class.std::basic_string"* @_ZN5boost5arrayISsLj5EE5beginEv(%"class.boost::array"* %test_case)
          to label %invoke.cont6 unwind label %lpad

invoke.cont6:                                     ; preds = %invoke.cont4
  store %"class.std::basic_string"* %call7, %"class.std::basic_string"** %iter, align 4
  %4 = load %"class.std::basic_string"** %iter, align 4
  %5 = load [5 x %"class.std::basic_string"]** %caRef, align 4
  %arrayidx8 = getelementptr inbounds [5 x %"class.std::basic_string"]* %5, i32 0, i32 0
  %cmp9 = icmp ne %"class.std::basic_string"* %4, %arrayidx8
  br i1 %cmp9, label %if.then10, label %if.end12

if.then10:                                        ; preds = %invoke.cont6
  invoke void @_ZN12_GLOBAL__N_19fail_testEPKc(i8* getelementptr inbounds ([33 x i8]* @.str1, i32 0, i32 0))
          to label %invoke.cont11 unwind label %lpad

invoke.cont11:                                    ; preds = %if.then10
  br label %if.end12

if.end12:                                         ; preds = %invoke.cont11, %invoke.cont6
  call void @_ZN5boost5arrayISsLj5EED1Ev(%"class.boost::array"* %test_case)
  ret void

invoke.cont13:                                    ; preds = %lpad
  br label %eh.resume

eh.resume:                                        ; preds = %invoke.cont13
  %exn = load i8** %exn.slot
  %sel = load i32* %ehselector.slot
  %lpad.val = insertvalue { i8*, i32 } undef, i8* %exn, 0
  %lpad.val14 = insertvalue { i8*, i32 } %lpad.val, i32 %sel, 1
  resume { i8*, i32 } %lpad.val14

terminate.lpad:                                   ; preds = %lpad
  %6 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          catch i8* null
  call void @_ZSt9terminatev() noreturn nounwind
  unreachable
}

define linkonce_odr void @_ZN5boost5arrayISsLj5EEC1Ev(%"class.boost::array"* %this) unnamed_addr inlinehint align 2 {
entry:
  %this.addr = alloca %"class.boost::array"*, align 4
  store %"class.boost::array"* %this, %"class.boost::array"** %this.addr, align 4
  %this1 = load %"class.boost::array"** %this.addr
  call void @_ZN5boost5arrayISsLj5EEC2Ev(%"class.boost::array"* %this1)
  ret void
}

define linkonce_odr [5 x %"class.std::basic_string"]* @_ZN5boost11get_c_arrayISsLj5EEERAT0__T_RNS_5arrayIS1_XT0_EEE(%"class.boost::array"* %arg) nounwind {
entry:
  %arg.addr = alloca %"class.boost::array"*, align 4
  store %"class.boost::array"* %arg, %"class.boost::array"** %arg.addr, align 4
  %0 = load %"class.boost::array"** %arg.addr, align 4
  %elems = getelementptr inbounds %"class.boost::array"* %0, i32 0, i32 0
  ret [5 x %"class.std::basic_string"]* %elems
}

declare i32 @__gxx_personality_v0(...)

define linkonce_odr %"class.std::basic_string"* @_ZN5boost5arrayISsLj5EE5beginEv(%"class.boost::array"* %this) nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::array"*, align 4
  store %"class.boost::array"* %this, %"class.boost::array"** %this.addr, align 4
  %this1 = load %"class.boost::array"** %this.addr
  %elems = getelementptr inbounds %"class.boost::array"* %this1, i32 0, i32 0
  %arraydecay = getelementptr inbounds [5 x %"class.std::basic_string"]* %elems, i32 0, i32 0
  ret %"class.std::basic_string"* %arraydecay
}

define internal void @_ZN12_GLOBAL__N_19fail_testEPKc(i8* %reason) {
entry:
  %reason.addr = alloca i8*, align 4
  store i8* %reason, i8** %reason.addr, align 4
  %0 = load i32* @_ZN12_GLOBAL__N_112failed_testsE, align 4
  %inc = add i32 %0, 1
  store i32 %inc, i32* @_ZN12_GLOBAL__N_112failed_testsE, align 4
  %call = call %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* @_ZSt4cerr, i8* getelementptr inbounds ([14 x i8]* @.str2, i32 0, i32 0))
  %1 = load i32* @_ZN12_GLOBAL__N_112failed_testsE, align 4
  %call1 = call %"class.std::basic_ostream"* @_ZNSolsEj(%"class.std::basic_ostream"* %call, i32 %1)
  %call2 = call %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* %call1, i8* getelementptr inbounds ([3 x i8]* @.str3, i32 0, i32 0))
  %2 = load i8** %reason.addr, align 4
  %call3 = call %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* %call2, i8* %2)
  %call4 = call %"class.std::basic_ostream"* @_ZNSolsEPFRSoS_E(%"class.std::basic_ostream"* %call3, %"class.std::basic_ostream"* (%"class.std::basic_ostream"*)* @_ZSt4endlIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_)
  ret void
}

define linkonce_odr void @_ZN5boost5arrayISsLj5EED1Ev(%"class.boost::array"* %this) unnamed_addr inlinehint align 2 {
entry:
  %this.addr = alloca %"class.boost::array"*, align 4
  store %"class.boost::array"* %this, %"class.boost::array"** %this.addr, align 4
  %this1 = load %"class.boost::array"** %this.addr
  call void @_ZN5boost5arrayISsLj5EED2Ev(%"class.boost::array"* %this1)
  ret void
}

declare void @_ZSt9terminatev()

define linkonce_odr void @_ZN5boost5arrayISsLj5EED2Ev(%"class.boost::array"* %this) unnamed_addr inlinehint align 2 {
entry:
  %this.addr = alloca %"class.boost::array"*, align 4
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  store %"class.boost::array"* %this, %"class.boost::array"** %this.addr, align 4
  %this1 = load %"class.boost::array"** %this.addr
  %elems = getelementptr inbounds %"class.boost::array"* %this1, i32 0, i32 0
  %array.begin = getelementptr inbounds [5 x %"class.std::basic_string"]* %elems, i32 0, i32 0
  %0 = getelementptr inbounds %"class.std::basic_string"* %array.begin, i32 5
  br label %arraydestroy.body

arraydestroy.body:                                ; preds = %invoke.cont, %entry
  %arraydestroy.elementPast = phi %"class.std::basic_string"* [ %0, %entry ], [ %arraydestroy.element, %invoke.cont ]
  %arraydestroy.element = getelementptr inbounds %"class.std::basic_string"* %arraydestroy.elementPast, i32 -1
  invoke void @_ZNSsD1Ev(%"class.std::basic_string"* %arraydestroy.element)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %arraydestroy.body
  %arraydestroy.done7 = icmp eq %"class.std::basic_string"* %arraydestroy.element, %array.begin
  br i1 %arraydestroy.done7, label %arraydestroy.done8, label %arraydestroy.body

arraydestroy.done8:                               ; preds = %invoke.cont
  ret void

lpad:                                             ; preds = %arraydestroy.body
  %1 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %2 = extractvalue { i8*, i32 } %1, 0
  store i8* %2, i8** %exn.slot
  %3 = extractvalue { i8*, i32 } %1, 1
  store i32 %3, i32* %ehselector.slot
  %arraydestroy.isempty = icmp eq %"class.std::basic_string"* %array.begin, %arraydestroy.element
  br i1 %arraydestroy.isempty, label %arraydestroy.done6, label %arraydestroy.body2

arraydestroy.body2:                               ; preds = %invoke.cont5, %lpad
  %arraydestroy.elementPast3 = phi %"class.std::basic_string"* [ %arraydestroy.element, %lpad ], [ %arraydestroy.element4, %invoke.cont5 ]
  %arraydestroy.element4 = getelementptr inbounds %"class.std::basic_string"* %arraydestroy.elementPast3, i32 -1
  invoke void @_ZNSsD1Ev(%"class.std::basic_string"* %arraydestroy.element4)
          to label %invoke.cont5 unwind label %terminate.lpad

invoke.cont5:                                     ; preds = %arraydestroy.body2
  %arraydestroy.done = icmp eq %"class.std::basic_string"* %arraydestroy.element4, %array.begin
  br i1 %arraydestroy.done, label %arraydestroy.done6, label %arraydestroy.body2

arraydestroy.done6:                               ; preds = %invoke.cont5, %lpad
  br label %eh.resume

eh.resume:                                        ; preds = %arraydestroy.done6
  %exn = load i8** %exn.slot
  %sel = load i32* %ehselector.slot
  %lpad.val = insertvalue { i8*, i32 } undef, i8* %exn, 0
  %lpad.val9 = insertvalue { i8*, i32 } %lpad.val, i32 %sel, 1
  resume { i8*, i32 } %lpad.val9

terminate.lpad:                                   ; preds = %arraydestroy.body2
  %4 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          catch i8* null
  call void @_ZSt9terminatev() noreturn nounwind
  unreachable
}

declare void @_ZNSsD1Ev(%"class.std::basic_string"*)

declare %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"*, i8*)

declare %"class.std::basic_ostream"* @_ZNSolsEj(%"class.std::basic_ostream"*, i32)

declare %"class.std::basic_ostream"* @_ZNSolsEPFRSoS_E(%"class.std::basic_ostream"*, %"class.std::basic_ostream"* (%"class.std::basic_ostream"*)*)

declare %"class.std::basic_ostream"* @_ZSt4endlIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_(%"class.std::basic_ostream"*)

define linkonce_odr void @_ZN5boost5arrayISsLj5EEC2Ev(%"class.boost::array"* %this) unnamed_addr inlinehint align 2 {
entry:
  %this.addr = alloca %"class.boost::array"*, align 4
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  store %"class.boost::array"* %this, %"class.boost::array"** %this.addr, align 4
  %this1 = load %"class.boost::array"** %this.addr
  %elems = getelementptr inbounds %"class.boost::array"* %this1, i32 0, i32 0
  %array.begin = getelementptr inbounds [5 x %"class.std::basic_string"]* %elems, i32 0, i32 0
  %arrayctor.end = getelementptr inbounds %"class.std::basic_string"* %array.begin, i32 5
  br label %arrayctor.loop

arrayctor.loop:                                   ; preds = %invoke.cont, %entry
  %arrayctor.cur = phi %"class.std::basic_string"* [ %array.begin, %entry ], [ %arrayctor.next, %invoke.cont ]
  invoke void @_ZNSsC1Ev(%"class.std::basic_string"* %arrayctor.cur)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %arrayctor.loop
  %arrayctor.next = getelementptr inbounds %"class.std::basic_string"* %arrayctor.cur, i32 1
  %arrayctor.done = icmp eq %"class.std::basic_string"* %arrayctor.next, %arrayctor.end
  br i1 %arrayctor.done, label %arrayctor.cont, label %arrayctor.loop

arrayctor.cont:                                   ; preds = %invoke.cont
  ret void

lpad:                                             ; preds = %arrayctor.loop
  %0 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %1 = extractvalue { i8*, i32 } %0, 0
  store i8* %1, i8** %exn.slot
  %2 = extractvalue { i8*, i32 } %0, 1
  store i32 %2, i32* %ehselector.slot
  %arraydestroy.isempty = icmp eq %"class.std::basic_string"* %array.begin, %arrayctor.cur
  br i1 %arraydestroy.isempty, label %arraydestroy.done3, label %arraydestroy.body

arraydestroy.body:                                ; preds = %invoke.cont2, %lpad
  %arraydestroy.elementPast = phi %"class.std::basic_string"* [ %arrayctor.cur, %lpad ], [ %arraydestroy.element, %invoke.cont2 ]
  %arraydestroy.element = getelementptr inbounds %"class.std::basic_string"* %arraydestroy.elementPast, i32 -1
  invoke void @_ZNSsD1Ev(%"class.std::basic_string"* %arraydestroy.element)
          to label %invoke.cont2 unwind label %terminate.lpad

invoke.cont2:                                     ; preds = %arraydestroy.body
  %arraydestroy.done = icmp eq %"class.std::basic_string"* %arraydestroy.element, %array.begin
  br i1 %arraydestroy.done, label %arraydestroy.done3, label %arraydestroy.body

arraydestroy.done3:                               ; preds = %invoke.cont2, %lpad
  br label %eh.resume

eh.resume:                                        ; preds = %arraydestroy.done3
  %exn = load i8** %exn.slot
  %sel = load i32* %ehselector.slot
  %lpad.val = insertvalue { i8*, i32 } undef, i8* %exn, 0
  %lpad.val4 = insertvalue { i8*, i32 } %lpad.val, i32 %sel, 1
  resume { i8*, i32 } %lpad.val4

terminate.lpad:                                   ; preds = %arraydestroy.body
  %3 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          catch i8* null
  call void @_ZSt9terminatev() noreturn nounwind
  unreachable
}

declare void @_ZNSsC1Ev(%"class.std::basic_string"*)

define linkonce_odr [5 x x86_fp80]* @_ZN5boost11get_c_arrayIeLj5EEERAT0__T_RNS_5arrayIS1_XT0_EEE(%"class.boost::array.0"* %arg) nounwind {
entry:
  %arg.addr = alloca %"class.boost::array.0"*, align 4
  store %"class.boost::array.0"* %arg, %"class.boost::array.0"** %arg.addr, align 4
  %0 = load %"class.boost::array.0"** %arg.addr, align 4
  %elems = getelementptr inbounds %"class.boost::array.0"* %0, i32 0, i32 0
  ret [5 x x86_fp80]* %elems
}

define linkonce_odr x86_fp80* @_ZN5boost5arrayIeLj5EE5beginEv(%"class.boost::array.0"* %this) nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::array.0"*, align 4
  store %"class.boost::array.0"* %this, %"class.boost::array.0"** %this.addr, align 4
  %this1 = load %"class.boost::array.0"** %this.addr
  %elems = getelementptr inbounds %"class.boost::array.0"* %this1, i32 0, i32 0
  %arraydecay = getelementptr inbounds [5 x x86_fp80]* %elems, i32 0, i32 0
  ret x86_fp80* %arraydecay
}

define linkonce_odr [5 x i8*]* @_ZN5boost11get_c_arrayIPvLj5EEERAT0__T_RNS_5arrayIS2_XT0_EEE(%"class.boost::array.1"* %arg) nounwind {
entry:
  %arg.addr = alloca %"class.boost::array.1"*, align 4
  store %"class.boost::array.1"* %arg, %"class.boost::array.1"** %arg.addr, align 4
  %0 = load %"class.boost::array.1"** %arg.addr, align 4
  %elems = getelementptr inbounds %"class.boost::array.1"* %0, i32 0, i32 0
  ret [5 x i8*]* %elems
}

define linkonce_odr i8** @_ZN5boost5arrayIPvLj5EE5beginEv(%"class.boost::array.1"* %this) nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::array.1"*, align 4
  store %"class.boost::array.1"* %this, %"class.boost::array.1"** %this.addr, align 4
  %this1 = load %"class.boost::array.1"** %this.addr
  %elems = getelementptr inbounds %"class.boost::array.1"* %this1, i32 0, i32 0
  %arraydecay = getelementptr inbounds [5 x i8*]* %elems, i32 0, i32 0
  ret i8** %arraydecay
}

define linkonce_odr [5 x i8]* @_ZN5boost11get_c_arrayIbLj5EEERAT0__T_RNS_5arrayIS1_XT0_EEE(%"class.boost::array.2"* %arg) nounwind {
entry:
  %arg.addr = alloca %"class.boost::array.2"*, align 4
  store %"class.boost::array.2"* %arg, %"class.boost::array.2"** %arg.addr, align 4
  %0 = load %"class.boost::array.2"** %arg.addr, align 4
  %elems = getelementptr inbounds %"class.boost::array.2"* %0, i32 0, i32 0
  ret [5 x i8]* %elems
}

define linkonce_odr i8* @_ZN5boost5arrayIbLj5EE5beginEv(%"class.boost::array.2"* %this) nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::array.2"*, align 4
  store %"class.boost::array.2"* %this, %"class.boost::array.2"** %this.addr, align 4
  %this1 = load %"class.boost::array.2"** %this.addr
  %elems = getelementptr inbounds %"class.boost::array.2"* %this1, i32 0, i32 0
  %arraydecay = getelementptr inbounds [5 x i8]* %elems, i32 0, i32 0
  ret i8* %arraydecay
}

define internal void @_GLOBAL__I_a() section ".text.startup" {
entry:
  call void @__cxx_global_var_init()
  ret void
}
