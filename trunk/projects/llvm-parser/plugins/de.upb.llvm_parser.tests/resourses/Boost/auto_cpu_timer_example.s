; ModuleID = 'auto_cpu_timer_example.cpp'
target datalayout = "e-p:32:32:32-i1:8:8-i8:8:8-i16:16:16-i32:32:32-i64:32:64-f32:32:32-f64:32:64-v64:64:64-v128:128:128-a0:0:64-f80:32:32-n8:16:32-S128"
target triple = "i386-pc-linux-gnu"

%"class.std::ios_base::Init" = type { i8 }
%"class.boost::system::error_category" = type { i32 (...)** }
%"class.boost::system::error_condition" = type { i32, %"class.boost::system::error_category"* }
%"class.boost::timer::auto_cpu_timer" = type { [25 x i8], i16, %"class.std::basic_ostream"*, %"class.std::basic_string" }
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
%"class.std::basic_string" = type { %"struct.std::basic_string<char, std::char_traits<char>, std::allocator<char> >::_Alloc_hider" }
%"struct.std::basic_string<char, std::char_traits<char>, std::allocator<char> >::_Alloc_hider" = type { i8* }
%"class.boost::system::error_code" = type { i32, %"class.boost::system::error_category"* }
%"class.boost::noncopyable_::noncopyable" = type { i8 }

@_ZStL8__ioinit = internal global %"class.std::ios_base::Init" zeroinitializer, align 1
@__dso_handle = external global i8
@_ZN5boost6systemL14posix_categoryE = internal global %"class.boost::system::error_category"* null, align 4
@_ZN5boost6systemL10errno_ecatE = internal global %"class.boost::system::error_category"* null, align 4
@_ZN5boost6systemL11native_ecatE = internal global %"class.boost::system::error_category"* null, align 4
@_ZTVN5boost6system14error_categoryE = linkonce_odr unnamed_addr constant [9 x i8*] [i8* null, i8* bitcast ({ i8*, i8*, i8* }* @_ZTIN5boost6system14error_categoryE to i8*), i8* bitcast (void (%"class.boost::system::error_category"*)* @_ZN5boost6system14error_categoryD1Ev to i8*), i8* bitcast (void (%"class.boost::system::error_category"*)* @_ZN5boost6system14error_categoryD0Ev to i8*), i8* bitcast (void ()* @__cxa_pure_virtual to i8*), i8* bitcast (void ()* @__cxa_pure_virtual to i8*), i8* bitcast (void (%"class.boost::system::error_condition"*, %"class.boost::system::error_category"*, i32)* @_ZNK5boost6system14error_category23default_error_conditionEi to i8*), i8* bitcast (i1 (%"class.boost::system::error_category"*, i32, %"class.boost::system::error_condition"*)* @_ZNK5boost6system14error_category10equivalentEiRKNS0_15error_conditionE to i8*), i8* bitcast (i1 (%"class.boost::system::error_category"*, %"class.boost::system::error_code"*, i32)* @_ZNK5boost6system14error_category10equivalentERKNS0_10error_codeEi to i8*)]
@_ZTVN10__cxxabiv120__si_class_type_infoE = external global i8*
@_ZTSN5boost6system14error_categoryE = linkonce_odr constant [32 x i8] c"N5boost6system14error_categoryE\00"
@_ZTVN10__cxxabiv117__class_type_infoE = external global i8*
@_ZTSN5boost12noncopyable_11noncopyableE = linkonce_odr constant [36 x i8] c"N5boost12noncopyable_11noncopyableE\00"
@_ZTIN5boost12noncopyable_11noncopyableE = linkonce_odr unnamed_addr constant { i8*, i8* } { i8* bitcast (i8** getelementptr inbounds (i8** @_ZTVN10__cxxabiv117__class_type_infoE, i32 2) to i8*), i8* getelementptr inbounds ([36 x i8]* @_ZTSN5boost12noncopyable_11noncopyableE, i32 0, i32 0) }
@_ZTIN5boost6system14error_categoryE = linkonce_odr unnamed_addr constant { i8*, i8*, i8* } { i8* bitcast (i8** getelementptr inbounds (i8** @_ZTVN10__cxxabiv120__si_class_type_infoE, i32 2) to i8*), i8* getelementptr inbounds ([32 x i8]* @_ZTSN5boost6system14error_categoryE, i32 0, i32 0), i8* bitcast ({ i8*, i8* }* @_ZTIN5boost12noncopyable_11noncopyableE to i8*) }
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

define internal void @__cxx_global_var_init1() section ".text.startup" {
entry:
  %call = call %"class.boost::system::error_category"* @_ZN5boost6system16generic_categoryEv()
  store %"class.boost::system::error_category"* %call, %"class.boost::system::error_category"** @_ZN5boost6systemL14posix_categoryE, align 4
  ret void
}

declare %"class.boost::system::error_category"* @_ZN5boost6system16generic_categoryEv()

define internal void @__cxx_global_var_init2() section ".text.startup" {
entry:
  %call = call %"class.boost::system::error_category"* @_ZN5boost6system16generic_categoryEv()
  store %"class.boost::system::error_category"* %call, %"class.boost::system::error_category"** @_ZN5boost6systemL10errno_ecatE, align 4
  ret void
}

define internal void @__cxx_global_var_init3() section ".text.startup" {
entry:
  %call = call %"class.boost::system::error_category"* @_ZN5boost6system15system_categoryEv()
  store %"class.boost::system::error_category"* %call, %"class.boost::system::error_category"** @_ZN5boost6systemL11native_ecatE, align 4
  ret void
}

declare %"class.boost::system::error_category"* @_ZN5boost6system15system_categoryEv()

define linkonce_odr void @_ZNK5boost6system14error_category23default_error_conditionEi(%"class.boost::system::error_condition"* noalias sret %agg.result, %"class.boost::system::error_category"* %this, i32 %ev) unnamed_addr inlinehint align 2 {
entry:
  %this.addr = alloca %"class.boost::system::error_category"*, align 4
  %ev.addr = alloca i32, align 4
  store %"class.boost::system::error_category"* %this, %"class.boost::system::error_category"** %this.addr, align 4
  store i32 %ev, i32* %ev.addr, align 4
  %this1 = load %"class.boost::system::error_category"** %this.addr
  %0 = load i32* %ev.addr, align 4
  call void @_ZN5boost6system15error_conditionC1EiRKNS0_14error_categoryE(%"class.boost::system::error_condition"* %agg.result, i32 %0, %"class.boost::system::error_category"* %this1)
  ret void
}

define linkonce_odr void @_ZN5boost6system15error_conditionC1EiRKNS0_14error_categoryE(%"class.boost::system::error_condition"* %this, i32 %val, %"class.boost::system::error_category"* %cat) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::system::error_condition"*, align 4
  %val.addr = alloca i32, align 4
  %cat.addr = alloca %"class.boost::system::error_category"*, align 4
  store %"class.boost::system::error_condition"* %this, %"class.boost::system::error_condition"** %this.addr, align 4
  store i32 %val, i32* %val.addr, align 4
  store %"class.boost::system::error_category"* %cat, %"class.boost::system::error_category"** %cat.addr, align 4
  %this1 = load %"class.boost::system::error_condition"** %this.addr
  %0 = load i32* %val.addr, align 4
  %1 = load %"class.boost::system::error_category"** %cat.addr
  call void @_ZN5boost6system15error_conditionC2EiRKNS0_14error_categoryE(%"class.boost::system::error_condition"* %this1, i32 %0, %"class.boost::system::error_category"* %1)
  ret void
}

define i32 @main() {
entry:
  %retval = alloca i32, align 4
  %t = alloca %"class.boost::timer::auto_cpu_timer", align 4
  %i = alloca i32, align 4
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  %cleanup.dest.slot = alloca i32
  store i32 0, i32* %retval
  call void @_ZN5boost5timer14auto_cpu_timerC1Es(%"class.boost::timer::auto_cpu_timer"* %t, i16 signext 6)
  store i32 0, i32* %i, align 4
  br label %for.cond

for.cond:                                         ; preds = %for.inc, %entry
  %0 = load i32* %i, align 4
  %cmp = icmp slt i32 %0, 100000000
  br i1 %cmp, label %for.body, label %for.end

for.body:                                         ; preds = %for.cond
  %call = invoke x86_fp80 @_ZSt4sqrte(x86_fp80 0xK4005F6E978D4FDF3B646)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %for.body
  br label %for.inc

for.inc:                                          ; preds = %invoke.cont
  %1 = load i32* %i, align 4
  %inc = add nsw i32 %1, 1
  store i32 %inc, i32* %i, align 4
  br label %for.cond

lpad:                                             ; preds = %for.body
  %2 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %3 = extractvalue { i8*, i32 } %2, 0
  store i8* %3, i8** %exn.slot
  %4 = extractvalue { i8*, i32 } %2, 1
  store i32 %4, i32* %ehselector.slot
  invoke void @_ZN5boost5timer14auto_cpu_timerD1Ev(%"class.boost::timer::auto_cpu_timer"* %t)
          to label %invoke.cont1 unwind label %terminate.lpad

for.end:                                          ; preds = %for.cond
  store i32 0, i32* %retval
  store i32 1, i32* %cleanup.dest.slot
  call void @_ZN5boost5timer14auto_cpu_timerD1Ev(%"class.boost::timer::auto_cpu_timer"* %t)
  %5 = load i32* %retval
  ret i32 %5

invoke.cont1:                                     ; preds = %lpad
  br label %eh.resume

eh.resume:                                        ; preds = %invoke.cont1
  %exn = load i8** %exn.slot
  %sel = load i32* %ehselector.slot
  %lpad.val = insertvalue { i8*, i32 } undef, i8* %exn, 0
  %lpad.val2 = insertvalue { i8*, i32 } %lpad.val, i32 %sel, 1
  resume { i8*, i32 } %lpad.val2

terminate.lpad:                                   ; preds = %lpad
  %6 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          catch i8* null
  call void @_ZSt9terminatev() noreturn nounwind
  unreachable
}

declare void @_ZN5boost5timer14auto_cpu_timerC1Es(%"class.boost::timer::auto_cpu_timer"*, i16 signext)

define linkonce_odr x86_fp80 @_ZSt4sqrte(x86_fp80 %__x) nounwind inlinehint {
entry:
  %__x.addr = alloca x86_fp80, align 4
  store x86_fp80 %__x, x86_fp80* %__x.addr, align 4
  %0 = load x86_fp80* %__x.addr, align 4
  %call = call x86_fp80 @sqrtl(x86_fp80 %0) nounwind readnone
  ret x86_fp80 %call
}

declare i32 @__gxx_personality_v0(...)

declare void @_ZN5boost5timer14auto_cpu_timerD1Ev(%"class.boost::timer::auto_cpu_timer"*)

declare void @_ZSt9terminatev()

define linkonce_odr void @_ZN5boost6system14error_categoryD1Ev(%"class.boost::system::error_category"* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::system::error_category"*, align 4
  store %"class.boost::system::error_category"* %this, %"class.boost::system::error_category"** %this.addr, align 4
  %this1 = load %"class.boost::system::error_category"** %this.addr
  call void @_ZN5boost6system14error_categoryD2Ev(%"class.boost::system::error_category"* %this1)
  ret void
}

define linkonce_odr void @_ZN5boost6system14error_categoryD0Ev(%"class.boost::system::error_category"* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::system::error_category"*, align 4
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  store %"class.boost::system::error_category"* %this, %"class.boost::system::error_category"** %this.addr, align 4
  %this1 = load %"class.boost::system::error_category"** %this.addr
  invoke void @_ZN5boost6system14error_categoryD1Ev(%"class.boost::system::error_category"* %this1)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %entry
  %0 = bitcast %"class.boost::system::error_category"* %this1 to i8*
  call void @_ZdlPv(i8* %0) nounwind
  ret void

lpad:                                             ; preds = %entry
  %1 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %2 = extractvalue { i8*, i32 } %1, 0
  store i8* %2, i8** %exn.slot
  %3 = extractvalue { i8*, i32 } %1, 1
  store i32 %3, i32* %ehselector.slot
  %4 = bitcast %"class.boost::system::error_category"* %this1 to i8*
  call void @_ZdlPv(i8* %4) nounwind
  br label %eh.resume

eh.resume:                                        ; preds = %lpad
  %exn = load i8** %exn.slot
  %sel = load i32* %ehselector.slot
  %lpad.val = insertvalue { i8*, i32 } undef, i8* %exn, 0
  %lpad.val2 = insertvalue { i8*, i32 } %lpad.val, i32 %sel, 1
  resume { i8*, i32 } %lpad.val2
}

declare void @__cxa_pure_virtual()

define linkonce_odr zeroext i1 @_ZNK5boost6system14error_category10equivalentEiRKNS0_15error_conditionE(%"class.boost::system::error_category"* %this, i32 %code, %"class.boost::system::error_condition"* %condition) unnamed_addr inlinehint align 2 {
entry:
  %this.addr = alloca %"class.boost::system::error_category"*, align 4
  %code.addr = alloca i32, align 4
  %condition.addr = alloca %"class.boost::system::error_condition"*, align 4
  %ref.tmp = alloca %"class.boost::system::error_condition", align 4
  store %"class.boost::system::error_category"* %this, %"class.boost::system::error_category"** %this.addr, align 4
  store i32 %code, i32* %code.addr, align 4
  store %"class.boost::system::error_condition"* %condition, %"class.boost::system::error_condition"** %condition.addr, align 4
  %this1 = load %"class.boost::system::error_category"** %this.addr
  %0 = bitcast %"class.boost::system::error_category"* %this1 to void (%"class.boost::system::error_condition"*, %"class.boost::system::error_category"*, i32)***
  %vtable = load void (%"class.boost::system::error_condition"*, %"class.boost::system::error_category"*, i32)*** %0
  %vfn = getelementptr inbounds void (%"class.boost::system::error_condition"*, %"class.boost::system::error_category"*, i32)** %vtable, i64 4
  %1 = load void (%"class.boost::system::error_condition"*, %"class.boost::system::error_category"*, i32)** %vfn
  %2 = load i32* %code.addr, align 4
  call void %1(%"class.boost::system::error_condition"* sret %ref.tmp, %"class.boost::system::error_category"* %this1, i32 %2)
  %3 = load %"class.boost::system::error_condition"** %condition.addr, align 4
  %call = call zeroext i1 @_ZN5boost6systemeqERKNS0_15error_conditionES3_(%"class.boost::system::error_condition"* %ref.tmp, %"class.boost::system::error_condition"* %3)
  ret i1 %call
}

define linkonce_odr zeroext i1 @_ZNK5boost6system14error_category10equivalentERKNS0_10error_codeEi(%"class.boost::system::error_category"* %this, %"class.boost::system::error_code"* %code, i32 %condition) unnamed_addr inlinehint align 2 {
entry:
  %this.addr = alloca %"class.boost::system::error_category"*, align 4
  %code.addr = alloca %"class.boost::system::error_code"*, align 4
  %condition.addr = alloca i32, align 4
  store %"class.boost::system::error_category"* %this, %"class.boost::system::error_category"** %this.addr, align 4
  store %"class.boost::system::error_code"* %code, %"class.boost::system::error_code"** %code.addr, align 4
  store i32 %condition, i32* %condition.addr, align 4
  %this1 = load %"class.boost::system::error_category"** %this.addr
  %0 = load %"class.boost::system::error_code"** %code.addr, align 4
  %call = call %"class.boost::system::error_category"* @_ZNK5boost6system10error_code8categoryEv(%"class.boost::system::error_code"* %0)
  %call2 = call zeroext i1 @_ZNK5boost6system14error_categoryeqERKS1_(%"class.boost::system::error_category"* %this1, %"class.boost::system::error_category"* %call)
  br i1 %call2, label %land.rhs, label %land.end

land.rhs:                                         ; preds = %entry
  %1 = load %"class.boost::system::error_code"** %code.addr, align 4
  %call3 = call i32 @_ZNK5boost6system10error_code5valueEv(%"class.boost::system::error_code"* %1)
  %2 = load i32* %condition.addr, align 4
  %cmp = icmp eq i32 %call3, %2
  br label %land.end

land.end:                                         ; preds = %land.rhs, %entry
  %3 = phi i1 [ false, %entry ], [ %cmp, %land.rhs ]
  ret i1 %3
}

define linkonce_odr zeroext i1 @_ZNK5boost6system14error_categoryeqERKS1_(%"class.boost::system::error_category"* %this, %"class.boost::system::error_category"* %rhs) nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::system::error_category"*, align 4
  %rhs.addr = alloca %"class.boost::system::error_category"*, align 4
  store %"class.boost::system::error_category"* %this, %"class.boost::system::error_category"** %this.addr, align 4
  store %"class.boost::system::error_category"* %rhs, %"class.boost::system::error_category"** %rhs.addr, align 4
  %this1 = load %"class.boost::system::error_category"** %this.addr
  %0 = load %"class.boost::system::error_category"** %rhs.addr, align 4
  %cmp = icmp eq %"class.boost::system::error_category"* %this1, %0
  ret i1 %cmp
}

define linkonce_odr %"class.boost::system::error_category"* @_ZNK5boost6system10error_code8categoryEv(%"class.boost::system::error_code"* %this) nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::system::error_code"*, align 4
  store %"class.boost::system::error_code"* %this, %"class.boost::system::error_code"** %this.addr, align 4
  %this1 = load %"class.boost::system::error_code"** %this.addr
  %m_cat = getelementptr inbounds %"class.boost::system::error_code"* %this1, i32 0, i32 1
  %0 = load %"class.boost::system::error_category"** %m_cat, align 4
  ret %"class.boost::system::error_category"* %0
}

define linkonce_odr i32 @_ZNK5boost6system10error_code5valueEv(%"class.boost::system::error_code"* %this) nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::system::error_code"*, align 4
  store %"class.boost::system::error_code"* %this, %"class.boost::system::error_code"** %this.addr, align 4
  %this1 = load %"class.boost::system::error_code"** %this.addr
  %m_val = getelementptr inbounds %"class.boost::system::error_code"* %this1, i32 0, i32 0
  %0 = load i32* %m_val, align 4
  ret i32 %0
}

define linkonce_odr zeroext i1 @_ZN5boost6systemeqERKNS0_15error_conditionES3_(%"class.boost::system::error_condition"* %lhs, %"class.boost::system::error_condition"* %rhs) nounwind inlinehint {
entry:
  %lhs.addr = alloca %"class.boost::system::error_condition"*, align 4
  %rhs.addr = alloca %"class.boost::system::error_condition"*, align 4
  store %"class.boost::system::error_condition"* %lhs, %"class.boost::system::error_condition"** %lhs.addr, align 4
  store %"class.boost::system::error_condition"* %rhs, %"class.boost::system::error_condition"** %rhs.addr, align 4
  %0 = load %"class.boost::system::error_condition"** %lhs.addr, align 4
  %m_cat = getelementptr inbounds %"class.boost::system::error_condition"* %0, i32 0, i32 1
  %1 = load %"class.boost::system::error_category"** %m_cat, align 4
  %2 = load %"class.boost::system::error_condition"** %rhs.addr, align 4
  %m_cat1 = getelementptr inbounds %"class.boost::system::error_condition"* %2, i32 0, i32 1
  %3 = load %"class.boost::system::error_category"** %m_cat1, align 4
  %cmp = icmp eq %"class.boost::system::error_category"* %1, %3
  br i1 %cmp, label %land.rhs, label %land.end

land.rhs:                                         ; preds = %entry
  %4 = load %"class.boost::system::error_condition"** %lhs.addr, align 4
  %m_val = getelementptr inbounds %"class.boost::system::error_condition"* %4, i32 0, i32 0
  %5 = load i32* %m_val, align 4
  %6 = load %"class.boost::system::error_condition"** %rhs.addr, align 4
  %m_val2 = getelementptr inbounds %"class.boost::system::error_condition"* %6, i32 0, i32 0
  %7 = load i32* %m_val2, align 4
  %cmp3 = icmp eq i32 %5, %7
  br label %land.end

land.end:                                         ; preds = %land.rhs, %entry
  %8 = phi i1 [ false, %entry ], [ %cmp3, %land.rhs ]
  ret i1 %8
}

declare void @_ZdlPv(i8*) nounwind

define linkonce_odr void @_ZN5boost6system14error_categoryD2Ev(%"class.boost::system::error_category"* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::system::error_category"*, align 4
  store %"class.boost::system::error_category"* %this, %"class.boost::system::error_category"** %this.addr, align 4
  %this1 = load %"class.boost::system::error_category"** %this.addr
  %0 = bitcast %"class.boost::system::error_category"* %this1 to %"class.boost::noncopyable_::noncopyable"*
  call void @_ZN5boost12noncopyable_11noncopyableD2Ev(%"class.boost::noncopyable_::noncopyable"* %0)
  ret void
}

define linkonce_odr void @_ZN5boost12noncopyable_11noncopyableD2Ev(%"class.boost::noncopyable_::noncopyable"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::noncopyable_::noncopyable"*, align 4
  store %"class.boost::noncopyable_::noncopyable"* %this, %"class.boost::noncopyable_::noncopyable"** %this.addr, align 4
  %this1 = load %"class.boost::noncopyable_::noncopyable"** %this.addr
  ret void
}

declare x86_fp80 @sqrtl(x86_fp80) nounwind readnone

define linkonce_odr void @_ZN5boost6system15error_conditionC2EiRKNS0_14error_categoryE(%"class.boost::system::error_condition"* %this, i32 %val, %"class.boost::system::error_category"* %cat) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::system::error_condition"*, align 4
  %val.addr = alloca i32, align 4
  %cat.addr = alloca %"class.boost::system::error_category"*, align 4
  store %"class.boost::system::error_condition"* %this, %"class.boost::system::error_condition"** %this.addr, align 4
  store i32 %val, i32* %val.addr, align 4
  store %"class.boost::system::error_category"* %cat, %"class.boost::system::error_category"** %cat.addr, align 4
  %this1 = load %"class.boost::system::error_condition"** %this.addr
  %m_val = getelementptr inbounds %"class.boost::system::error_condition"* %this1, i32 0, i32 0
  %0 = load i32* %val.addr, align 4
  store i32 %0, i32* %m_val, align 4
  %m_cat = getelementptr inbounds %"class.boost::system::error_condition"* %this1, i32 0, i32 1
  %1 = load %"class.boost::system::error_category"** %cat.addr, align 4
  store %"class.boost::system::error_category"* %1, %"class.boost::system::error_category"** %m_cat, align 4
  ret void
}

define internal void @_GLOBAL__I_a() section ".text.startup" {
entry:
  call void @__cxx_global_var_init()
  call void @__cxx_global_var_init1()
  call void @__cxx_global_var_init2()
  call void @__cxx_global_var_init3()
  ret void
}
