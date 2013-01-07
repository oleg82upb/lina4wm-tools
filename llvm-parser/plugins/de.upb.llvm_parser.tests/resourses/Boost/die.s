; ModuleID = 'die.cpp'
target datalayout = "e-p:32:32:32-i1:8:8-i8:8:8-i16:16:16-i32:32:32-i64:32:64-f32:32:32-f64:32:64-v64:64:64-v128:128:128-a0:0:64-f80:32:32-n8:16:32-S128"
target triple = "i386-pc-linux-gnu"

%"class.std::ios_base::Init" = type { i8 }
%"class.boost::random::mersenne_twister_engine" = type { [624 x i32], i32 }
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
%"class.boost::random::uniform_int_distribution" = type { i32, i32 }
%"struct.mpl_::bool_" = type { i8 }
%"struct.boost::is_integral" = type { i8 }
%"struct.boost::random::detail::subtract" = type { i8 }
%"struct.boost::random::detail::subtract.0" = type { i8 }
%"struct.boost::random::detail::add" = type { i8 }
%"struct.boost::random::detail::add.1" = type { i8 }

@_ZStL8__ioinit = internal global %"class.std::ios_base::Init" zeroinitializer, align 1
@__dso_handle = external global i8
@gen = global %"class.boost::random::mersenne_twister_engine" zeroinitializer, align 4
@_ZSt4cout = external global %"class.std::basic_ostream"
@.str = private unnamed_addr constant [19 x i8] c"min_arg <= max_arg\00", align 1
@.str2 = private unnamed_addr constant [68 x i8] c"/home/thomas/boost_1_52_0/boost/random/uniform_int_distribution.hpp\00", align 1
@__PRETTY_FUNCTION__._ZN5boost6random24uniform_int_distributionIiEC2Eii = private unnamed_addr constant [105 x i8] c"boost::random::uniform_int_distribution<int>::uniform_int_distribution(IntType, IntType) [IntType = int]\00", align 1
@_ZN5boost6random23mersenne_twister_engineIjLj32ELj624ELj397ELj31ELj2567483615ELj11ELj4294967295ELj7ELj2636928640ELj15ELj4022730752ELj18ELj1812433253EE12default_seedE = weak_odr constant i32 5489, align 4
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
  call void @_ZN5boost6random23mersenne_twister_engineIjLj32ELj624ELj397ELj31ELj2567483615ELj11ELj4294967295ELj7ELj2636928640ELj15ELj4022730752ELj18ELj1812433253EEC1Ev(%"class.boost::random::mersenne_twister_engine"* @gen)
  ret void
}

define linkonce_odr void @_ZN5boost6random23mersenne_twister_engineIjLj32ELj624ELj397ELj31ELj2567483615ELj11ELj4294967295ELj7ELj2636928640ELj15ELj4022730752ELj18ELj1812433253EEC1Ev(%"class.boost::random::mersenne_twister_engine"* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::random::mersenne_twister_engine"*, align 4
  store %"class.boost::random::mersenne_twister_engine"* %this, %"class.boost::random::mersenne_twister_engine"** %this.addr, align 4
  %this1 = load %"class.boost::random::mersenne_twister_engine"** %this.addr
  call void @_ZN5boost6random23mersenne_twister_engineIjLj32ELj624ELj397ELj31ELj2567483615ELj11ELj4294967295ELj7ELj2636928640ELj15ELj4022730752ELj18ELj1812433253EEC2Ev(%"class.boost::random::mersenne_twister_engine"* %this1)
  ret void
}

define i32 @_Z8roll_diev() {
entry:
  %dist = alloca %"class.boost::random::uniform_int_distribution", align 4
  call void @_ZN5boost6random24uniform_int_distributionIiEC1Eii(%"class.boost::random::uniform_int_distribution"* %dist, i32 1, i32 6)
  %call = call i32 @_ZNK5boost6random24uniform_int_distributionIiEclINS0_23mersenne_twister_engineIjLj32ELj624ELj397ELj31ELj2567483615ELj11ELj4294967295ELj7ELj2636928640ELj15ELj4022730752ELj18ELj1812433253EEEEEiRT_(%"class.boost::random::uniform_int_distribution"* %dist, %"class.boost::random::mersenne_twister_engine"* @gen)
  ret i32 %call
}

define linkonce_odr void @_ZN5boost6random24uniform_int_distributionIiEC1Eii(%"class.boost::random::uniform_int_distribution"* %this, i32 %min_arg, i32 %max_arg) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::random::uniform_int_distribution"*, align 4
  %min_arg.addr = alloca i32, align 4
  %max_arg.addr = alloca i32, align 4
  store %"class.boost::random::uniform_int_distribution"* %this, %"class.boost::random::uniform_int_distribution"** %this.addr, align 4
  store i32 %min_arg, i32* %min_arg.addr, align 4
  store i32 %max_arg, i32* %max_arg.addr, align 4
  %this1 = load %"class.boost::random::uniform_int_distribution"** %this.addr
  %0 = load i32* %min_arg.addr, align 4
  %1 = load i32* %max_arg.addr, align 4
  call void @_ZN5boost6random24uniform_int_distributionIiEC2Eii(%"class.boost::random::uniform_int_distribution"* %this1, i32 %0, i32 %1)
  ret void
}

define linkonce_odr i32 @_ZNK5boost6random24uniform_int_distributionIiEclINS0_23mersenne_twister_engineIjLj32ELj624ELj397ELj31ELj2567483615ELj11ELj4294967295ELj7ELj2636928640ELj15ELj4022730752ELj18ELj1812433253EEEEEiRT_(%"class.boost::random::uniform_int_distribution"* %this, %"class.boost::random::mersenne_twister_engine"* %eng) align 2 {
entry:
  %this.addr = alloca %"class.boost::random::uniform_int_distribution"*, align 4
  %eng.addr = alloca %"class.boost::random::mersenne_twister_engine"*, align 4
  store %"class.boost::random::uniform_int_distribution"* %this, %"class.boost::random::uniform_int_distribution"** %this.addr, align 4
  store %"class.boost::random::mersenne_twister_engine"* %eng, %"class.boost::random::mersenne_twister_engine"** %eng.addr, align 4
  %this1 = load %"class.boost::random::uniform_int_distribution"** %this.addr
  %0 = load %"class.boost::random::mersenne_twister_engine"** %eng.addr, align 4
  %_min = getelementptr inbounds %"class.boost::random::uniform_int_distribution"* %this1, i32 0, i32 0
  %1 = load i32* %_min, align 4
  %_max = getelementptr inbounds %"class.boost::random::uniform_int_distribution"* %this1, i32 0, i32 1
  %2 = load i32* %_max, align 4
  %call = call i32 @_ZN5boost6random6detail20generate_uniform_intINS0_23mersenne_twister_engineIjLj32ELj624ELj397ELj31ELj2567483615ELj11ELj4294967295ELj7ELj2636928640ELj15ELj4022730752ELj18ELj1812433253EEEiEET0_RT_S5_S5_(%"class.boost::random::mersenne_twister_engine"* %0, i32 %1, i32 %2)
  ret i32 %call
}

define i32 @main() {
entry:
  %retval = alloca i32, align 4
  %i = alloca i32, align 4
  store i32 0, i32* %retval
  store i32 0, i32* %i, align 4
  br label %for.cond

for.cond:                                         ; preds = %for.inc, %entry
  %0 = load i32* %i, align 4
  %cmp = icmp slt i32 %0, 10
  br i1 %cmp, label %for.body, label %for.end

for.body:                                         ; preds = %for.cond
  %call = call i32 @_Z8roll_diev()
  %call1 = call %"class.std::basic_ostream"* @_ZNSolsEi(%"class.std::basic_ostream"* @_ZSt4cout, i32 %call)
  %call2 = call %"class.std::basic_ostream"* @_ZNSolsEPFRSoS_E(%"class.std::basic_ostream"* %call1, %"class.std::basic_ostream"* (%"class.std::basic_ostream"*)* @_ZSt4endlIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_)
  br label %for.inc

for.inc:                                          ; preds = %for.body
  %1 = load i32* %i, align 4
  %inc = add nsw i32 %1, 1
  store i32 %inc, i32* %i, align 4
  br label %for.cond

for.end:                                          ; preds = %for.cond
  %2 = load i32* %retval
  ret i32 %2
}

declare %"class.std::basic_ostream"* @_ZNSolsEi(%"class.std::basic_ostream"*, i32)

declare %"class.std::basic_ostream"* @_ZNSolsEPFRSoS_E(%"class.std::basic_ostream"*, %"class.std::basic_ostream"* (%"class.std::basic_ostream"*)*)

declare %"class.std::basic_ostream"* @_ZSt4endlIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_(%"class.std::basic_ostream"*)

define linkonce_odr i32 @_ZN5boost6random6detail20generate_uniform_intINS0_23mersenne_twister_engineIjLj32ELj624ELj397ELj31ELj2567483615ELj11ELj4294967295ELj7ELj2636928640ELj15ELj4022730752ELj18ELj1812433253EEEiEET0_RT_S5_S5_(%"class.boost::random::mersenne_twister_engine"* %eng, i32 %min_value, i32 %max_value) inlinehint {
entry:
  %eng.addr = alloca %"class.boost::random::mersenne_twister_engine"*, align 4
  %min_value.addr = alloca i32, align 4
  %max_value.addr = alloca i32, align 4
  %agg.tmp = alloca %"struct.mpl_::bool_", align 1
  %ref.tmp = alloca %"struct.boost::is_integral", align 1
  store %"class.boost::random::mersenne_twister_engine"* %eng, %"class.boost::random::mersenne_twister_engine"** %eng.addr, align 4
  store i32 %min_value, i32* %min_value.addr, align 4
  store i32 %max_value, i32* %max_value.addr, align 4
  %0 = load %"class.boost::random::mersenne_twister_engine"** %eng.addr, align 4
  %1 = load i32* %min_value.addr, align 4
  %2 = load i32* %max_value.addr, align 4
  %3 = bitcast %"struct.boost::is_integral"* %ref.tmp to %"struct.mpl_::bool_"*
  %call = call i32 @_ZN5boost6random6detail20generate_uniform_intINS0_23mersenne_twister_engineIjLj32ELj624ELj397ELj31ELj2567483615ELj11ELj4294967295ELj7ELj2636928640ELj15ELj4022730752ELj18ELj1812433253EEEiEET0_RT_S5_S5_N4mpl_5bool_ILb1EEE(%"class.boost::random::mersenne_twister_engine"* %0, i32 %1, i32 %2)
  ret i32 %call
}

define linkonce_odr i32 @_ZN5boost6random6detail20generate_uniform_intINS0_23mersenne_twister_engineIjLj32ELj624ELj397ELj31ELj2567483615ELj11ELj4294967295ELj7ELj2636928640ELj15ELj4022730752ELj18ELj1812433253EEEiEET0_RT_S5_S5_N4mpl_5bool_ILb1EEE(%"class.boost::random::mersenne_twister_engine"* %eng, i32 %min_value, i32 %max_value) {
entry:
  %retval = alloca i32, align 4
  %eng.addr = alloca %"class.boost::random::mersenne_twister_engine"*, align 4
  %min_value.addr = alloca i32, align 4
  %max_value.addr = alloca i32, align 4
  %0 = alloca %"struct.mpl_::bool_", align 1
  %range = alloca i32, align 4
  %tmp = alloca %"struct.boost::random::detail::subtract", align 1
  %bmin = alloca i32, align 4
  %brange = alloca i32, align 4
  %tmp4 = alloca %"struct.boost::random::detail::subtract.0", align 1
  %v = alloca i32, align 4
  %tmp11 = alloca %"struct.boost::random::detail::subtract.0", align 1
  %tmp14 = alloca %"struct.boost::random::detail::add", align 1
  %limit = alloca i32, align 4
  %result = alloca i32, align 4
  %mult = alloca i32, align 4
  %tmp34 = alloca %"struct.boost::random::detail::subtract.0", align 1
  %result_increment = alloca i32, align 4
  %agg.tmp = alloca %"struct.mpl_::bool_", align 1
  %tmp61 = alloca %"struct.boost::random::detail::add", align 1
  %bucket_size = alloca i32, align 4
  %result83 = alloca i32, align 4
  %tmp84 = alloca %"struct.boost::random::detail::subtract.0", align 1
  %tmp90 = alloca %"struct.boost::random::detail::add", align 1
  store %"class.boost::random::mersenne_twister_engine"* %eng, %"class.boost::random::mersenne_twister_engine"** %eng.addr, align 4
  store i32 %min_value, i32* %min_value.addr, align 4
  store i32 %max_value, i32* %max_value.addr, align 4
  %1 = load i32* %max_value.addr, align 4
  %2 = load i32* %min_value.addr, align 4
  %call = call i32 @_ZN5boost6random6detail8subtractIiLb1EEclEii(%"struct.boost::random::detail::subtract"* %tmp, i32 %1, i32 %2)
  store i32 %call, i32* %range, align 4
  %3 = load %"class.boost::random::mersenne_twister_engine"** %eng.addr, align 4
  %call2 = call i32 @_ZN5boost6random23mersenne_twister_engineIjLj32ELj624ELj397ELj31ELj2567483615ELj11ELj4294967295ELj7ELj2636928640ELj15ELj4022730752ELj18ELj1812433253EE3minEv()
  store i32 %call2, i32* %bmin, align 4
  %4 = load %"class.boost::random::mersenne_twister_engine"** %eng.addr, align 4
  %call5 = call i32 @_ZN5boost6random23mersenne_twister_engineIjLj32ELj624ELj397ELj31ELj2567483615ELj11ELj4294967295ELj7ELj2636928640ELj15ELj4022730752ELj18ELj1812433253EE3maxEv()
  %5 = load %"class.boost::random::mersenne_twister_engine"** %eng.addr, align 4
  %call6 = call i32 @_ZN5boost6random23mersenne_twister_engineIjLj32ELj624ELj397ELj31ELj2567483615ELj11ELj4294967295ELj7ELj2636928640ELj15ELj4022730752ELj18ELj1812433253EE3minEv()
  %call7 = call i32 @_ZN5boost6random6detail8subtractIjLb0EEclEjj(%"struct.boost::random::detail::subtract.0"* %tmp4, i32 %call5, i32 %call6)
  store i32 %call7, i32* %brange, align 4
  %6 = load i32* %range, align 4
  %cmp = icmp eq i32 %6, 0
  br i1 %cmp, label %if.then, label %if.else

if.then:                                          ; preds = %entry
  %7 = load i32* %min_value.addr, align 4
  store i32 %7, i32* %retval
  br label %return

if.else:                                          ; preds = %entry
  %8 = load i32* %brange, align 4
  %9 = load i32* %range, align 4
  %cmp8 = icmp eq i32 %8, %9
  br i1 %cmp8, label %if.then9, label %if.else16

if.then9:                                         ; preds = %if.else
  %10 = load %"class.boost::random::mersenne_twister_engine"** %eng.addr, align 4
  %call12 = call i32 @_ZN5boost6random23mersenne_twister_engineIjLj32ELj624ELj397ELj31ELj2567483615ELj11ELj4294967295ELj7ELj2636928640ELj15ELj4022730752ELj18ELj1812433253EEclEv(%"class.boost::random::mersenne_twister_engine"* %10)
  %11 = load i32* %bmin, align 4
  %call13 = call i32 @_ZN5boost6random6detail8subtractIjLb0EEclEjj(%"struct.boost::random::detail::subtract.0"* %tmp11, i32 %call12, i32 %11)
  store i32 %call13, i32* %v, align 4
  %12 = load i32* %v, align 4
  %13 = load i32* %min_value.addr, align 4
  %call15 = call i32 @_ZN5boost6random6detail3addIjiLb1EEclEji(%"struct.boost::random::detail::add"* %tmp14, i32 %12, i32 %13)
  store i32 %call15, i32* %retval
  br label %return

if.else16:                                        ; preds = %if.else
  %14 = load i32* %brange, align 4
  %15 = load i32* %range, align 4
  %cmp17 = icmp ult i32 %14, %15
  br i1 %cmp17, label %if.then18, label %if.else63

if.then18:                                        ; preds = %if.else16
  br label %for.cond

for.cond:                                         ; preds = %if.then59, %if.then56, %if.then51, %if.then18
  %16 = load i32* %range, align 4
  %call20 = call i32 @_ZNSt14numeric_limitsIjE3maxEv() nounwind
  %cmp21 = icmp eq i32 %16, %call20
  br i1 %cmp21, label %if.then22, label %if.else26

if.then22:                                        ; preds = %for.cond
  %17 = load i32* %range, align 4
  %18 = load i32* %brange, align 4
  %add = add i32 %18, 1
  %div = udiv i32 %17, %add
  store i32 %div, i32* %limit, align 4
  %19 = load i32* %range, align 4
  %20 = load i32* %brange, align 4
  %add23 = add i32 %20, 1
  %rem = urem i32 %19, %add23
  %21 = load i32* %brange, align 4
  %cmp24 = icmp eq i32 %rem, %21
  br i1 %cmp24, label %if.then25, label %if.end

if.then25:                                        ; preds = %if.then22
  %22 = load i32* %limit, align 4
  %inc = add i32 %22, 1
  store i32 %inc, i32* %limit, align 4
  br label %if.end

if.end:                                           ; preds = %if.then25, %if.then22
  br label %if.end30

if.else26:                                        ; preds = %for.cond
  %23 = load i32* %range, align 4
  %add27 = add i32 %23, 1
  %24 = load i32* %brange, align 4
  %add28 = add i32 %24, 1
  %div29 = udiv i32 %add27, %add28
  store i32 %div29, i32* %limit, align 4
  br label %if.end30

if.end30:                                         ; preds = %if.else26, %if.end
  store i32 0, i32* %result, align 4
  store i32 1, i32* %mult, align 4
  br label %while.cond

while.cond:                                       ; preds = %if.end42, %if.end30
  %25 = load i32* %mult, align 4
  %26 = load i32* %limit, align 4
  %cmp33 = icmp ule i32 %25, %26
  br i1 %cmp33, label %while.body, label %while.end

while.body:                                       ; preds = %while.cond
  %27 = load %"class.boost::random::mersenne_twister_engine"** %eng.addr, align 4
  %call35 = call i32 @_ZN5boost6random23mersenne_twister_engineIjLj32ELj624ELj397ELj31ELj2567483615ELj11ELj4294967295ELj7ELj2636928640ELj15ELj4022730752ELj18ELj1812433253EEclEv(%"class.boost::random::mersenne_twister_engine"* %27)
  %28 = load i32* %bmin, align 4
  %call36 = call i32 @_ZN5boost6random6detail8subtractIjLb0EEclEjj(%"struct.boost::random::detail::subtract.0"* %tmp34, i32 %call35, i32 %28)
  %29 = load i32* %mult, align 4
  %mul = mul i32 %call36, %29
  %30 = load i32* %result, align 4
  %add37 = add i32 %30, %mul
  store i32 %add37, i32* %result, align 4
  %31 = load i32* %mult, align 4
  %32 = load i32* %brange, align 4
  %mul38 = mul i32 %31, %32
  %33 = load i32* %range, align 4
  %34 = load i32* %mult, align 4
  %sub = sub i32 %33, %34
  %add39 = add i32 %sub, 1
  %cmp40 = icmp eq i32 %mul38, %add39
  br i1 %cmp40, label %if.then41, label %if.end42

if.then41:                                        ; preds = %while.body
  %35 = load i32* %result, align 4
  store i32 %35, i32* %retval
  br label %return

if.end42:                                         ; preds = %while.body
  %36 = load i32* %brange, align 4
  %add43 = add i32 %36, 1
  %37 = load i32* %mult, align 4
  %mul44 = mul i32 %37, %add43
  store i32 %mul44, i32* %mult, align 4
  br label %while.cond

while.end:                                        ; preds = %while.cond
  %38 = load %"class.boost::random::mersenne_twister_engine"** %eng.addr, align 4
  %39 = load i32* %range, align 4
  %40 = load i32* %mult, align 4
  %div46 = udiv i32 %39, %40
  %call47 = call i32 @_ZN5boost6random6detail20generate_uniform_intINS0_23mersenne_twister_engineIjLj32ELj624ELj397ELj31ELj2567483615ELj11ELj4294967295ELj7ELj2636928640ELj15ELj4022730752ELj18ELj1812433253EEEjEET0_RT_S5_S5_N4mpl_5bool_ILb1EEE(%"class.boost::random::mersenne_twister_engine"* %38, i32 0, i32 %div46)
  store i32 %call47, i32* %result_increment, align 4
  %call48 = call i32 @_ZNSt14numeric_limitsIjE3maxEv() nounwind
  %41 = load i32* %mult, align 4
  %div49 = udiv i32 %call48, %41
  %42 = load i32* %result_increment, align 4
  %cmp50 = icmp ult i32 %div49, %42
  br i1 %cmp50, label %if.then51, label %if.end52

if.then51:                                        ; preds = %while.end
  br label %for.cond

if.end52:                                         ; preds = %while.end
  %43 = load i32* %mult, align 4
  %44 = load i32* %result_increment, align 4
  %mul53 = mul i32 %44, %43
  store i32 %mul53, i32* %result_increment, align 4
  %45 = load i32* %result_increment, align 4
  %46 = load i32* %result, align 4
  %add54 = add i32 %46, %45
  store i32 %add54, i32* %result, align 4
  %47 = load i32* %result, align 4
  %48 = load i32* %result_increment, align 4
  %cmp55 = icmp ult i32 %47, %48
  br i1 %cmp55, label %if.then56, label %if.end57

if.then56:                                        ; preds = %if.end52
  br label %for.cond

if.end57:                                         ; preds = %if.end52
  %49 = load i32* %result, align 4
  %50 = load i32* %range, align 4
  %cmp58 = icmp ugt i32 %49, %50
  br i1 %cmp58, label %if.then59, label %if.end60

if.then59:                                        ; preds = %if.end57
  br label %for.cond

if.end60:                                         ; preds = %if.end57
  %51 = load i32* %result, align 4
  %52 = load i32* %min_value.addr, align 4
  %call62 = call i32 @_ZN5boost6random6detail3addIjiLb1EEclEji(%"struct.boost::random::detail::add"* %tmp61, i32 %51, i32 %52)
  store i32 %call62, i32* %retval
  br label %return

if.else63:                                        ; preds = %if.else16
  %53 = load i32* %brange, align 4
  %call65 = call i32 @_ZNSt14numeric_limitsIjE3maxEv() nounwind
  %cmp66 = icmp eq i32 %53, %call65
  br i1 %cmp66, label %if.then67, label %if.else76

if.then67:                                        ; preds = %if.else63
  %54 = load i32* %brange, align 4
  %55 = load i32* %range, align 4
  %add68 = add i32 %55, 1
  %div69 = udiv i32 %54, %add68
  store i32 %div69, i32* %bucket_size, align 4
  %56 = load i32* %brange, align 4
  %57 = load i32* %range, align 4
  %add70 = add i32 %57, 1
  %rem71 = urem i32 %56, %add70
  %58 = load i32* %range, align 4
  %cmp72 = icmp eq i32 %rem71, %58
  br i1 %cmp72, label %if.then73, label %if.end75

if.then73:                                        ; preds = %if.then67
  %59 = load i32* %bucket_size, align 4
  %inc74 = add i32 %59, 1
  store i32 %inc74, i32* %bucket_size, align 4
  br label %if.end75

if.end75:                                         ; preds = %if.then73, %if.then67
  br label %if.end80

if.else76:                                        ; preds = %if.else63
  %60 = load i32* %brange, align 4
  %add77 = add i32 %60, 1
  %61 = load i32* %range, align 4
  %add78 = add i32 %61, 1
  %div79 = udiv i32 %add77, %add78
  store i32 %div79, i32* %bucket_size, align 4
  br label %if.end80

if.end80:                                         ; preds = %if.else76, %if.end75
  br label %for.cond81

for.cond81:                                       ; preds = %if.end92, %if.end80
  %62 = load %"class.boost::random::mersenne_twister_engine"** %eng.addr, align 4
  %call85 = call i32 @_ZN5boost6random23mersenne_twister_engineIjLj32ELj624ELj397ELj31ELj2567483615ELj11ELj4294967295ELj7ELj2636928640ELj15ELj4022730752ELj18ELj1812433253EEclEv(%"class.boost::random::mersenne_twister_engine"* %62)
  %63 = load i32* %bmin, align 4
  %call86 = call i32 @_ZN5boost6random6detail8subtractIjLb0EEclEjj(%"struct.boost::random::detail::subtract.0"* %tmp84, i32 %call85, i32 %63)
  store i32 %call86, i32* %result83, align 4
  %64 = load i32* %bucket_size, align 4
  %65 = load i32* %result83, align 4
  %div87 = udiv i32 %65, %64
  store i32 %div87, i32* %result83, align 4
  %66 = load i32* %result83, align 4
  %67 = load i32* %range, align 4
  %cmp88 = icmp ule i32 %66, %67
  br i1 %cmp88, label %if.then89, label %if.end92

if.then89:                                        ; preds = %for.cond81
  %68 = load i32* %result83, align 4
  %69 = load i32* %min_value.addr, align 4
  %call91 = call i32 @_ZN5boost6random6detail3addIjiLb1EEclEji(%"struct.boost::random::detail::add"* %tmp90, i32 %68, i32 %69)
  store i32 %call91, i32* %retval
  br label %return

if.end92:                                         ; preds = %for.cond81
  br label %for.cond81

return:                                           ; preds = %if.then89, %if.end60, %if.then41, %if.then9, %if.then
  %70 = load i32* %retval
  ret i32 %70
}

define linkonce_odr i32 @_ZN5boost6random6detail8subtractIiLb1EEclEii(%"struct.boost::random::detail::subtract"* %this, i32 %x, i32 %y) nounwind align 2 {
entry:
  %retval = alloca i32, align 4
  %this.addr = alloca %"struct.boost::random::detail::subtract"*, align 4
  %x.addr = alloca i32, align 4
  %y.addr = alloca i32, align 4
  store %"struct.boost::random::detail::subtract"* %this, %"struct.boost::random::detail::subtract"** %this.addr, align 4
  store i32 %x, i32* %x.addr, align 4
  store i32 %y, i32* %y.addr, align 4
  %this1 = load %"struct.boost::random::detail::subtract"** %this.addr
  %0 = load i32* %y.addr, align 4
  %cmp = icmp sge i32 %0, 0
  br i1 %cmp, label %if.then, label %if.end

if.then:                                          ; preds = %entry
  %1 = load i32* %x.addr, align 4
  %2 = load i32* %y.addr, align 4
  %sub = sub i32 %1, %2
  store i32 %sub, i32* %retval
  br label %return

if.end:                                           ; preds = %entry
  %3 = load i32* %x.addr, align 4
  %cmp2 = icmp sge i32 %3, 0
  br i1 %cmp2, label %if.then3, label %if.end7

if.then3:                                         ; preds = %if.end
  %4 = load i32* %x.addr, align 4
  %5 = load i32* %y.addr, align 4
  %add = add nsw i32 %5, 1
  %sub4 = sub nsw i32 0, %add
  %add5 = add i32 %4, %sub4
  %add6 = add i32 %add5, 1
  store i32 %add6, i32* %retval
  br label %return

if.end7:                                          ; preds = %if.end
  %6 = load i32* %x.addr, align 4
  %7 = load i32* %y.addr, align 4
  %sub8 = sub nsw i32 %6, %7
  store i32 %sub8, i32* %retval
  br label %return

return:                                           ; preds = %if.end7, %if.then3, %if.then
  %8 = load i32* %retval
  ret i32 %8
}

define linkonce_odr i32 @_ZN5boost6random23mersenne_twister_engineIjLj32ELj624ELj397ELj31ELj2567483615ELj11ELj4294967295ELj7ELj2636928640ELj15ELj4022730752ELj18ELj1812433253EE3minEv() nounwind align 2 {
entry:
  ret i32 0
}

define linkonce_odr i32 @_ZN5boost6random6detail8subtractIjLb0EEclEjj(%"struct.boost::random::detail::subtract.0"* %this, i32 %x, i32 %y) nounwind align 2 {
entry:
  %this.addr = alloca %"struct.boost::random::detail::subtract.0"*, align 4
  %x.addr = alloca i32, align 4
  %y.addr = alloca i32, align 4
  store %"struct.boost::random::detail::subtract.0"* %this, %"struct.boost::random::detail::subtract.0"** %this.addr, align 4
  store i32 %x, i32* %x.addr, align 4
  store i32 %y, i32* %y.addr, align 4
  %this1 = load %"struct.boost::random::detail::subtract.0"** %this.addr
  %0 = load i32* %x.addr, align 4
  %1 = load i32* %y.addr, align 4
  %sub = sub i32 %0, %1
  ret i32 %sub
}

define linkonce_odr i32 @_ZN5boost6random23mersenne_twister_engineIjLj32ELj624ELj397ELj31ELj2567483615ELj11ELj4294967295ELj7ELj2636928640ELj15ELj4022730752ELj18ELj1812433253EE3maxEv() nounwind align 2 {
entry:
  ret i32 -1
}

define linkonce_odr i32 @_ZN5boost6random23mersenne_twister_engineIjLj32ELj624ELj397ELj31ELj2567483615ELj11ELj4294967295ELj7ELj2636928640ELj15ELj4022730752ELj18ELj1812433253EEclEv(%"class.boost::random::mersenne_twister_engine"* %this) align 2 {
entry:
  %this.addr = alloca %"class.boost::random::mersenne_twister_engine"*, align 4
  %z = alloca i32, align 4
  store %"class.boost::random::mersenne_twister_engine"* %this, %"class.boost::random::mersenne_twister_engine"** %this.addr, align 4
  %this1 = load %"class.boost::random::mersenne_twister_engine"** %this.addr
  %i = getelementptr inbounds %"class.boost::random::mersenne_twister_engine"* %this1, i32 0, i32 1
  %0 = load i32* %i, align 4
  %cmp = icmp eq i32 %0, 624
  br i1 %cmp, label %if.then, label %if.end

if.then:                                          ; preds = %entry
  call void @_ZN5boost6random23mersenne_twister_engineIjLj32ELj624ELj397ELj31ELj2567483615ELj11ELj4294967295ELj7ELj2636928640ELj15ELj4022730752ELj18ELj1812433253EE5twistEv(%"class.boost::random::mersenne_twister_engine"* %this1)
  br label %if.end

if.end:                                           ; preds = %if.then, %entry
  %i2 = getelementptr inbounds %"class.boost::random::mersenne_twister_engine"* %this1, i32 0, i32 1
  %1 = load i32* %i2, align 4
  %x = getelementptr inbounds %"class.boost::random::mersenne_twister_engine"* %this1, i32 0, i32 0
  %arrayidx = getelementptr inbounds [624 x i32]* %x, i32 0, i32 %1
  %2 = load i32* %arrayidx, align 4
  store i32 %2, i32* %z, align 4
  %i3 = getelementptr inbounds %"class.boost::random::mersenne_twister_engine"* %this1, i32 0, i32 1
  %3 = load i32* %i3, align 4
  %inc = add i32 %3, 1
  store i32 %inc, i32* %i3, align 4
  %4 = load i32* %z, align 4
  %shr = lshr i32 %4, 11
  %5 = load i32* %z, align 4
  %xor = xor i32 %5, %shr
  store i32 %xor, i32* %z, align 4
  %6 = load i32* %z, align 4
  %shl = shl i32 %6, 7
  %and = and i32 %shl, -1658038656
  %7 = load i32* %z, align 4
  %xor4 = xor i32 %7, %and
  store i32 %xor4, i32* %z, align 4
  %8 = load i32* %z, align 4
  %shl5 = shl i32 %8, 15
  %and6 = and i32 %shl5, -272236544
  %9 = load i32* %z, align 4
  %xor7 = xor i32 %9, %and6
  store i32 %xor7, i32* %z, align 4
  %10 = load i32* %z, align 4
  %shr8 = lshr i32 %10, 18
  %11 = load i32* %z, align 4
  %xor9 = xor i32 %11, %shr8
  store i32 %xor9, i32* %z, align 4
  %12 = load i32* %z, align 4
  ret i32 %12
}

define linkonce_odr i32 @_ZN5boost6random6detail3addIjiLb1EEclEji(%"struct.boost::random::detail::add"* %this, i32 %x, i32 %y) nounwind align 2 {
entry:
  %retval = alloca i32, align 4
  %this.addr = alloca %"struct.boost::random::detail::add"*, align 4
  %x.addr = alloca i32, align 4
  %y.addr = alloca i32, align 4
  store %"struct.boost::random::detail::add"* %this, %"struct.boost::random::detail::add"** %this.addr, align 4
  store i32 %x, i32* %x.addr, align 4
  store i32 %y, i32* %y.addr, align 4
  %this1 = load %"struct.boost::random::detail::add"** %this.addr
  %0 = load i32* %y.addr, align 4
  %cmp = icmp sge i32 %0, 0
  br i1 %cmp, label %if.then, label %if.end

if.then:                                          ; preds = %entry
  %1 = load i32* %x.addr, align 4
  %2 = load i32* %y.addr, align 4
  %add = add nsw i32 %1, %2
  store i32 %add, i32* %retval
  br label %return

if.end:                                           ; preds = %entry
  %3 = load i32* %x.addr, align 4
  %4 = load i32* %y.addr, align 4
  %add2 = add nsw i32 %4, 1
  %sub = sub nsw i32 0, %add2
  %cmp3 = icmp ugt i32 %3, %sub
  br i1 %cmp3, label %if.then4, label %if.end9

if.then4:                                         ; preds = %if.end
  %5 = load i32* %x.addr, align 4
  %6 = load i32* %y.addr, align 4
  %add5 = add nsw i32 %6, 1
  %sub6 = sub nsw i32 0, %add5
  %sub7 = sub i32 %5, %sub6
  %sub8 = sub i32 %sub7, 1
  store i32 %sub8, i32* %retval
  br label %return

if.end9:                                          ; preds = %if.end
  %7 = load i32* %x.addr, align 4
  %8 = load i32* %y.addr, align 4
  %add10 = add nsw i32 %7, %8
  store i32 %add10, i32* %retval
  br label %return

return:                                           ; preds = %if.end9, %if.then4, %if.then
  %9 = load i32* %retval
  ret i32 %9
}

define linkonce_odr i32 @_ZNSt14numeric_limitsIjE3maxEv() nounwind align 2 {
entry:
  ret i32 -1
}

define linkonce_odr i32 @_ZN5boost6random6detail20generate_uniform_intINS0_23mersenne_twister_engineIjLj32ELj624ELj397ELj31ELj2567483615ELj11ELj4294967295ELj7ELj2636928640ELj15ELj4022730752ELj18ELj1812433253EEEjEET0_RT_S5_S5_N4mpl_5bool_ILb1EEE(%"class.boost::random::mersenne_twister_engine"* %eng, i32 %min_value, i32 %max_value) {
entry:
  %retval = alloca i32, align 4
  %eng.addr = alloca %"class.boost::random::mersenne_twister_engine"*, align 4
  %min_value.addr = alloca i32, align 4
  %max_value.addr = alloca i32, align 4
  %0 = alloca %"struct.mpl_::bool_", align 1
  %range = alloca i32, align 4
  %tmp = alloca %"struct.boost::random::detail::subtract.0", align 1
  %bmin = alloca i32, align 4
  %brange = alloca i32, align 4
  %tmp4 = alloca %"struct.boost::random::detail::subtract.0", align 1
  %v = alloca i32, align 4
  %tmp11 = alloca %"struct.boost::random::detail::subtract.0", align 1
  %tmp14 = alloca %"struct.boost::random::detail::add.1", align 1
  %limit = alloca i32, align 4
  %result = alloca i32, align 4
  %mult = alloca i32, align 4
  %tmp34 = alloca %"struct.boost::random::detail::subtract.0", align 1
  %result_increment = alloca i32, align 4
  %agg.tmp = alloca %"struct.mpl_::bool_", align 1
  %tmp61 = alloca %"struct.boost::random::detail::add.1", align 1
  %bucket_size = alloca i32, align 4
  %result83 = alloca i32, align 4
  %tmp84 = alloca %"struct.boost::random::detail::subtract.0", align 1
  %tmp90 = alloca %"struct.boost::random::detail::add.1", align 1
  store %"class.boost::random::mersenne_twister_engine"* %eng, %"class.boost::random::mersenne_twister_engine"** %eng.addr, align 4
  store i32 %min_value, i32* %min_value.addr, align 4
  store i32 %max_value, i32* %max_value.addr, align 4
  %1 = load i32* %max_value.addr, align 4
  %2 = load i32* %min_value.addr, align 4
  %call = call i32 @_ZN5boost6random6detail8subtractIjLb0EEclEjj(%"struct.boost::random::detail::subtract.0"* %tmp, i32 %1, i32 %2)
  store i32 %call, i32* %range, align 4
  %3 = load %"class.boost::random::mersenne_twister_engine"** %eng.addr, align 4
  %call2 = call i32 @_ZN5boost6random23mersenne_twister_engineIjLj32ELj624ELj397ELj31ELj2567483615ELj11ELj4294967295ELj7ELj2636928640ELj15ELj4022730752ELj18ELj1812433253EE3minEv()
  store i32 %call2, i32* %bmin, align 4
  %4 = load %"class.boost::random::mersenne_twister_engine"** %eng.addr, align 4
  %call5 = call i32 @_ZN5boost6random23mersenne_twister_engineIjLj32ELj624ELj397ELj31ELj2567483615ELj11ELj4294967295ELj7ELj2636928640ELj15ELj4022730752ELj18ELj1812433253EE3maxEv()
  %5 = load %"class.boost::random::mersenne_twister_engine"** %eng.addr, align 4
  %call6 = call i32 @_ZN5boost6random23mersenne_twister_engineIjLj32ELj624ELj397ELj31ELj2567483615ELj11ELj4294967295ELj7ELj2636928640ELj15ELj4022730752ELj18ELj1812433253EE3minEv()
  %call7 = call i32 @_ZN5boost6random6detail8subtractIjLb0EEclEjj(%"struct.boost::random::detail::subtract.0"* %tmp4, i32 %call5, i32 %call6)
  store i32 %call7, i32* %brange, align 4
  %6 = load i32* %range, align 4
  %cmp = icmp eq i32 %6, 0
  br i1 %cmp, label %if.then, label %if.else

if.then:                                          ; preds = %entry
  %7 = load i32* %min_value.addr, align 4
  store i32 %7, i32* %retval
  br label %return

if.else:                                          ; preds = %entry
  %8 = load i32* %brange, align 4
  %9 = load i32* %range, align 4
  %cmp8 = icmp eq i32 %8, %9
  br i1 %cmp8, label %if.then9, label %if.else16

if.then9:                                         ; preds = %if.else
  %10 = load %"class.boost::random::mersenne_twister_engine"** %eng.addr, align 4
  %call12 = call i32 @_ZN5boost6random23mersenne_twister_engineIjLj32ELj624ELj397ELj31ELj2567483615ELj11ELj4294967295ELj7ELj2636928640ELj15ELj4022730752ELj18ELj1812433253EEclEv(%"class.boost::random::mersenne_twister_engine"* %10)
  %11 = load i32* %bmin, align 4
  %call13 = call i32 @_ZN5boost6random6detail8subtractIjLb0EEclEjj(%"struct.boost::random::detail::subtract.0"* %tmp11, i32 %call12, i32 %11)
  store i32 %call13, i32* %v, align 4
  %12 = load i32* %v, align 4
  %13 = load i32* %min_value.addr, align 4
  %call15 = call i32 @_ZN5boost6random6detail3addIjjLb0EEclEjj(%"struct.boost::random::detail::add.1"* %tmp14, i32 %12, i32 %13)
  store i32 %call15, i32* %retval
  br label %return

if.else16:                                        ; preds = %if.else
  %14 = load i32* %brange, align 4
  %15 = load i32* %range, align 4
  %cmp17 = icmp ult i32 %14, %15
  br i1 %cmp17, label %if.then18, label %if.else63

if.then18:                                        ; preds = %if.else16
  br label %for.cond

for.cond:                                         ; preds = %if.then59, %if.then56, %if.then51, %if.then18
  %16 = load i32* %range, align 4
  %call20 = call i32 @_ZNSt14numeric_limitsIjE3maxEv() nounwind
  %cmp21 = icmp eq i32 %16, %call20
  br i1 %cmp21, label %if.then22, label %if.else26

if.then22:                                        ; preds = %for.cond
  %17 = load i32* %range, align 4
  %18 = load i32* %brange, align 4
  %add = add i32 %18, 1
  %div = udiv i32 %17, %add
  store i32 %div, i32* %limit, align 4
  %19 = load i32* %range, align 4
  %20 = load i32* %brange, align 4
  %add23 = add i32 %20, 1
  %rem = urem i32 %19, %add23
  %21 = load i32* %brange, align 4
  %cmp24 = icmp eq i32 %rem, %21
  br i1 %cmp24, label %if.then25, label %if.end

if.then25:                                        ; preds = %if.then22
  %22 = load i32* %limit, align 4
  %inc = add i32 %22, 1
  store i32 %inc, i32* %limit, align 4
  br label %if.end

if.end:                                           ; preds = %if.then25, %if.then22
  br label %if.end30

if.else26:                                        ; preds = %for.cond
  %23 = load i32* %range, align 4
  %add27 = add i32 %23, 1
  %24 = load i32* %brange, align 4
  %add28 = add i32 %24, 1
  %div29 = udiv i32 %add27, %add28
  store i32 %div29, i32* %limit, align 4
  br label %if.end30

if.end30:                                         ; preds = %if.else26, %if.end
  store i32 0, i32* %result, align 4
  store i32 1, i32* %mult, align 4
  br label %while.cond

while.cond:                                       ; preds = %if.end42, %if.end30
  %25 = load i32* %mult, align 4
  %26 = load i32* %limit, align 4
  %cmp33 = icmp ule i32 %25, %26
  br i1 %cmp33, label %while.body, label %while.end

while.body:                                       ; preds = %while.cond
  %27 = load %"class.boost::random::mersenne_twister_engine"** %eng.addr, align 4
  %call35 = call i32 @_ZN5boost6random23mersenne_twister_engineIjLj32ELj624ELj397ELj31ELj2567483615ELj11ELj4294967295ELj7ELj2636928640ELj15ELj4022730752ELj18ELj1812433253EEclEv(%"class.boost::random::mersenne_twister_engine"* %27)
  %28 = load i32* %bmin, align 4
  %call36 = call i32 @_ZN5boost6random6detail8subtractIjLb0EEclEjj(%"struct.boost::random::detail::subtract.0"* %tmp34, i32 %call35, i32 %28)
  %29 = load i32* %mult, align 4
  %mul = mul i32 %call36, %29
  %30 = load i32* %result, align 4
  %add37 = add i32 %30, %mul
  store i32 %add37, i32* %result, align 4
  %31 = load i32* %mult, align 4
  %32 = load i32* %brange, align 4
  %mul38 = mul i32 %31, %32
  %33 = load i32* %range, align 4
  %34 = load i32* %mult, align 4
  %sub = sub i32 %33, %34
  %add39 = add i32 %sub, 1
  %cmp40 = icmp eq i32 %mul38, %add39
  br i1 %cmp40, label %if.then41, label %if.end42

if.then41:                                        ; preds = %while.body
  %35 = load i32* %result, align 4
  store i32 %35, i32* %retval
  br label %return

if.end42:                                         ; preds = %while.body
  %36 = load i32* %brange, align 4
  %add43 = add i32 %36, 1
  %37 = load i32* %mult, align 4
  %mul44 = mul i32 %37, %add43
  store i32 %mul44, i32* %mult, align 4
  br label %while.cond

while.end:                                        ; preds = %while.cond
  %38 = load %"class.boost::random::mersenne_twister_engine"** %eng.addr, align 4
  %39 = load i32* %range, align 4
  %40 = load i32* %mult, align 4
  %div46 = udiv i32 %39, %40
  %call47 = call i32 @_ZN5boost6random6detail20generate_uniform_intINS0_23mersenne_twister_engineIjLj32ELj624ELj397ELj31ELj2567483615ELj11ELj4294967295ELj7ELj2636928640ELj15ELj4022730752ELj18ELj1812433253EEEjEET0_RT_S5_S5_N4mpl_5bool_ILb1EEE(%"class.boost::random::mersenne_twister_engine"* %38, i32 0, i32 %div46)
  store i32 %call47, i32* %result_increment, align 4
  %call48 = call i32 @_ZNSt14numeric_limitsIjE3maxEv() nounwind
  %41 = load i32* %mult, align 4
  %div49 = udiv i32 %call48, %41
  %42 = load i32* %result_increment, align 4
  %cmp50 = icmp ult i32 %div49, %42
  br i1 %cmp50, label %if.then51, label %if.end52

if.then51:                                        ; preds = %while.end
  br label %for.cond

if.end52:                                         ; preds = %while.end
  %43 = load i32* %mult, align 4
  %44 = load i32* %result_increment, align 4
  %mul53 = mul i32 %44, %43
  store i32 %mul53, i32* %result_increment, align 4
  %45 = load i32* %result_increment, align 4
  %46 = load i32* %result, align 4
  %add54 = add i32 %46, %45
  store i32 %add54, i32* %result, align 4
  %47 = load i32* %result, align 4
  %48 = load i32* %result_increment, align 4
  %cmp55 = icmp ult i32 %47, %48
  br i1 %cmp55, label %if.then56, label %if.end57

if.then56:                                        ; preds = %if.end52
  br label %for.cond

if.end57:                                         ; preds = %if.end52
  %49 = load i32* %result, align 4
  %50 = load i32* %range, align 4
  %cmp58 = icmp ugt i32 %49, %50
  br i1 %cmp58, label %if.then59, label %if.end60

if.then59:                                        ; preds = %if.end57
  br label %for.cond

if.end60:                                         ; preds = %if.end57
  %51 = load i32* %result, align 4
  %52 = load i32* %min_value.addr, align 4
  %call62 = call i32 @_ZN5boost6random6detail3addIjjLb0EEclEjj(%"struct.boost::random::detail::add.1"* %tmp61, i32 %51, i32 %52)
  store i32 %call62, i32* %retval
  br label %return

if.else63:                                        ; preds = %if.else16
  %53 = load i32* %brange, align 4
  %call65 = call i32 @_ZNSt14numeric_limitsIjE3maxEv() nounwind
  %cmp66 = icmp eq i32 %53, %call65
  br i1 %cmp66, label %if.then67, label %if.else76

if.then67:                                        ; preds = %if.else63
  %54 = load i32* %brange, align 4
  %55 = load i32* %range, align 4
  %add68 = add i32 %55, 1
  %div69 = udiv i32 %54, %add68
  store i32 %div69, i32* %bucket_size, align 4
  %56 = load i32* %brange, align 4
  %57 = load i32* %range, align 4
  %add70 = add i32 %57, 1
  %rem71 = urem i32 %56, %add70
  %58 = load i32* %range, align 4
  %cmp72 = icmp eq i32 %rem71, %58
  br i1 %cmp72, label %if.then73, label %if.end75

if.then73:                                        ; preds = %if.then67
  %59 = load i32* %bucket_size, align 4
  %inc74 = add i32 %59, 1
  store i32 %inc74, i32* %bucket_size, align 4
  br label %if.end75

if.end75:                                         ; preds = %if.then73, %if.then67
  br label %if.end80

if.else76:                                        ; preds = %if.else63
  %60 = load i32* %brange, align 4
  %add77 = add i32 %60, 1
  %61 = load i32* %range, align 4
  %add78 = add i32 %61, 1
  %div79 = udiv i32 %add77, %add78
  store i32 %div79, i32* %bucket_size, align 4
  br label %if.end80

if.end80:                                         ; preds = %if.else76, %if.end75
  br label %for.cond81

for.cond81:                                       ; preds = %if.end92, %if.end80
  %62 = load %"class.boost::random::mersenne_twister_engine"** %eng.addr, align 4
  %call85 = call i32 @_ZN5boost6random23mersenne_twister_engineIjLj32ELj624ELj397ELj31ELj2567483615ELj11ELj4294967295ELj7ELj2636928640ELj15ELj4022730752ELj18ELj1812433253EEclEv(%"class.boost::random::mersenne_twister_engine"* %62)
  %63 = load i32* %bmin, align 4
  %call86 = call i32 @_ZN5boost6random6detail8subtractIjLb0EEclEjj(%"struct.boost::random::detail::subtract.0"* %tmp84, i32 %call85, i32 %63)
  store i32 %call86, i32* %result83, align 4
  %64 = load i32* %bucket_size, align 4
  %65 = load i32* %result83, align 4
  %div87 = udiv i32 %65, %64
  store i32 %div87, i32* %result83, align 4
  %66 = load i32* %result83, align 4
  %67 = load i32* %range, align 4
  %cmp88 = icmp ule i32 %66, %67
  br i1 %cmp88, label %if.then89, label %if.end92

if.then89:                                        ; preds = %for.cond81
  %68 = load i32* %result83, align 4
  %69 = load i32* %min_value.addr, align 4
  %call91 = call i32 @_ZN5boost6random6detail3addIjjLb0EEclEjj(%"struct.boost::random::detail::add.1"* %tmp90, i32 %68, i32 %69)
  store i32 %call91, i32* %retval
  br label %return

if.end92:                                         ; preds = %for.cond81
  br label %for.cond81

return:                                           ; preds = %if.then89, %if.end60, %if.then41, %if.then9, %if.then
  %70 = load i32* %retval
  ret i32 %70
}

define linkonce_odr i32 @_ZN5boost6random6detail3addIjjLb0EEclEjj(%"struct.boost::random::detail::add.1"* %this, i32 %x, i32 %y) nounwind align 2 {
entry:
  %this.addr = alloca %"struct.boost::random::detail::add.1"*, align 4
  %x.addr = alloca i32, align 4
  %y.addr = alloca i32, align 4
  store %"struct.boost::random::detail::add.1"* %this, %"struct.boost::random::detail::add.1"** %this.addr, align 4
  store i32 %x, i32* %x.addr, align 4
  store i32 %y, i32* %y.addr, align 4
  %this1 = load %"struct.boost::random::detail::add.1"** %this.addr
  %0 = load i32* %x.addr, align 4
  %1 = load i32* %y.addr, align 4
  %add = add i32 %0, %1
  ret i32 %add
}

define linkonce_odr void @_ZN5boost6random23mersenne_twister_engineIjLj32ELj624ELj397ELj31ELj2567483615ELj11ELj4294967295ELj7ELj2636928640ELj15ELj4022730752ELj18ELj1812433253EE5twistEv(%"class.boost::random::mersenne_twister_engine"* %this) nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::random::mersenne_twister_engine"*, align 4
  %upper_mask = alloca i32, align 4
  %lower_mask = alloca i32, align 4
  %unroll_factor = alloca i32, align 4
  %unroll_extra1 = alloca i32, align 4
  %unroll_extra2 = alloca i32, align 4
  %j = alloca i32, align 4
  %y = alloca i32, align 4
  %j15 = alloca i32, align 4
  %y19 = alloca i32, align 4
  %j44 = alloca i32, align 4
  %y48 = alloca i32, align 4
  %j72 = alloca i32, align 4
  %y76 = alloca i32, align 4
  %y101 = alloca i32, align 4
  store %"class.boost::random::mersenne_twister_engine"* %this, %"class.boost::random::mersenne_twister_engine"** %this.addr, align 4
  %this1 = load %"class.boost::random::mersenne_twister_engine"** %this.addr
  store i32 -2147483648, i32* %upper_mask, align 4
  store i32 2147483647, i32* %lower_mask, align 4
  store i32 6, i32* %unroll_factor, align 4
  store i32 5, i32* %unroll_extra1, align 4
  store i32 0, i32* %unroll_extra2, align 4
  store i32 0, i32* %j, align 4
  br label %for.cond

for.cond:                                         ; preds = %for.inc, %entry
  %0 = load i32* %j, align 4
  %cmp = icmp ult i32 %0, 222
  br i1 %cmp, label %for.body, label %for.end

for.body:                                         ; preds = %for.cond
  %1 = load i32* %j, align 4
  %x = getelementptr inbounds %"class.boost::random::mersenne_twister_engine"* %this1, i32 0, i32 0
  %arrayidx = getelementptr inbounds [624 x i32]* %x, i32 0, i32 %1
  %2 = load i32* %arrayidx, align 4
  %and = and i32 %2, -2147483648
  %3 = load i32* %j, align 4
  %add = add i32 %3, 1
  %x2 = getelementptr inbounds %"class.boost::random::mersenne_twister_engine"* %this1, i32 0, i32 0
  %arrayidx3 = getelementptr inbounds [624 x i32]* %x2, i32 0, i32 %add
  %4 = load i32* %arrayidx3, align 4
  %and4 = and i32 %4, 2147483647
  %or = or i32 %and, %and4
  store i32 %or, i32* %y, align 4
  %5 = load i32* %j, align 4
  %add5 = add i32 %5, 397
  %x6 = getelementptr inbounds %"class.boost::random::mersenne_twister_engine"* %this1, i32 0, i32 0
  %arrayidx7 = getelementptr inbounds [624 x i32]* %x6, i32 0, i32 %add5
  %6 = load i32* %arrayidx7, align 4
  %7 = load i32* %y, align 4
  %shr = lshr i32 %7, 1
  %xor = xor i32 %6, %shr
  %8 = load i32* %j, align 4
  %add8 = add i32 %8, 1
  %x9 = getelementptr inbounds %"class.boost::random::mersenne_twister_engine"* %this1, i32 0, i32 0
  %arrayidx10 = getelementptr inbounds [624 x i32]* %x9, i32 0, i32 %add8
  %9 = load i32* %arrayidx10, align 4
  %and11 = and i32 %9, 1
  %mul = mul i32 %and11, -1727483681
  %xor12 = xor i32 %xor, %mul
  %10 = load i32* %j, align 4
  %x13 = getelementptr inbounds %"class.boost::random::mersenne_twister_engine"* %this1, i32 0, i32 0
  %arrayidx14 = getelementptr inbounds [624 x i32]* %x13, i32 0, i32 %10
  store i32 %xor12, i32* %arrayidx14, align 4
  br label %for.inc

for.inc:                                          ; preds = %for.body
  %11 = load i32* %j, align 4
  %inc = add i32 %11, 1
  store i32 %inc, i32* %j, align 4
  br label %for.cond

for.end:                                          ; preds = %for.cond
  store i32 222, i32* %j15, align 4
  br label %for.cond16

for.cond16:                                       ; preds = %for.inc41, %for.end
  %12 = load i32* %j15, align 4
  %cmp17 = icmp ult i32 %12, 227
  br i1 %cmp17, label %for.body18, label %for.end43

for.body18:                                       ; preds = %for.cond16
  %13 = load i32* %j15, align 4
  %x20 = getelementptr inbounds %"class.boost::random::mersenne_twister_engine"* %this1, i32 0, i32 0
  %arrayidx21 = getelementptr inbounds [624 x i32]* %x20, i32 0, i32 %13
  %14 = load i32* %arrayidx21, align 4
  %and22 = and i32 %14, -2147483648
  %15 = load i32* %j15, align 4
  %add23 = add i32 %15, 1
  %x24 = getelementptr inbounds %"class.boost::random::mersenne_twister_engine"* %this1, i32 0, i32 0
  %arrayidx25 = getelementptr inbounds [624 x i32]* %x24, i32 0, i32 %add23
  %16 = load i32* %arrayidx25, align 4
  %and26 = and i32 %16, 2147483647
  %or27 = or i32 %and22, %and26
  store i32 %or27, i32* %y19, align 4
  %17 = load i32* %j15, align 4
  %add28 = add i32 %17, 397
  %x29 = getelementptr inbounds %"class.boost::random::mersenne_twister_engine"* %this1, i32 0, i32 0
  %arrayidx30 = getelementptr inbounds [624 x i32]* %x29, i32 0, i32 %add28
  %18 = load i32* %arrayidx30, align 4
  %19 = load i32* %y19, align 4
  %shr31 = lshr i32 %19, 1
  %xor32 = xor i32 %18, %shr31
  %20 = load i32* %j15, align 4
  %add33 = add i32 %20, 1
  %x34 = getelementptr inbounds %"class.boost::random::mersenne_twister_engine"* %this1, i32 0, i32 0
  %arrayidx35 = getelementptr inbounds [624 x i32]* %x34, i32 0, i32 %add33
  %21 = load i32* %arrayidx35, align 4
  %and36 = and i32 %21, 1
  %mul37 = mul i32 %and36, -1727483681
  %xor38 = xor i32 %xor32, %mul37
  %22 = load i32* %j15, align 4
  %x39 = getelementptr inbounds %"class.boost::random::mersenne_twister_engine"* %this1, i32 0, i32 0
  %arrayidx40 = getelementptr inbounds [624 x i32]* %x39, i32 0, i32 %22
  store i32 %xor38, i32* %arrayidx40, align 4
  br label %for.inc41

for.inc41:                                        ; preds = %for.body18
  %23 = load i32* %j15, align 4
  %inc42 = add i32 %23, 1
  store i32 %inc42, i32* %j15, align 4
  br label %for.cond16

for.end43:                                        ; preds = %for.cond16
  store i32 227, i32* %j44, align 4
  br label %for.cond45

for.cond45:                                       ; preds = %for.inc69, %for.end43
  %24 = load i32* %j44, align 4
  %cmp46 = icmp ult i32 %24, 623
  br i1 %cmp46, label %for.body47, label %for.end71

for.body47:                                       ; preds = %for.cond45
  %25 = load i32* %j44, align 4
  %x49 = getelementptr inbounds %"class.boost::random::mersenne_twister_engine"* %this1, i32 0, i32 0
  %arrayidx50 = getelementptr inbounds [624 x i32]* %x49, i32 0, i32 %25
  %26 = load i32* %arrayidx50, align 4
  %and51 = and i32 %26, -2147483648
  %27 = load i32* %j44, align 4
  %add52 = add i32 %27, 1
  %x53 = getelementptr inbounds %"class.boost::random::mersenne_twister_engine"* %this1, i32 0, i32 0
  %arrayidx54 = getelementptr inbounds [624 x i32]* %x53, i32 0, i32 %add52
  %28 = load i32* %arrayidx54, align 4
  %and55 = and i32 %28, 2147483647
  %or56 = or i32 %and51, %and55
  store i32 %or56, i32* %y48, align 4
  %29 = load i32* %j44, align 4
  %sub = sub i32 %29, 227
  %x57 = getelementptr inbounds %"class.boost::random::mersenne_twister_engine"* %this1, i32 0, i32 0
  %arrayidx58 = getelementptr inbounds [624 x i32]* %x57, i32 0, i32 %sub
  %30 = load i32* %arrayidx58, align 4
  %31 = load i32* %y48, align 4
  %shr59 = lshr i32 %31, 1
  %xor60 = xor i32 %30, %shr59
  %32 = load i32* %j44, align 4
  %add61 = add i32 %32, 1
  %x62 = getelementptr inbounds %"class.boost::random::mersenne_twister_engine"* %this1, i32 0, i32 0
  %arrayidx63 = getelementptr inbounds [624 x i32]* %x62, i32 0, i32 %add61
  %33 = load i32* %arrayidx63, align 4
  %and64 = and i32 %33, 1
  %mul65 = mul i32 %and64, -1727483681
  %xor66 = xor i32 %xor60, %mul65
  %34 = load i32* %j44, align 4
  %x67 = getelementptr inbounds %"class.boost::random::mersenne_twister_engine"* %this1, i32 0, i32 0
  %arrayidx68 = getelementptr inbounds [624 x i32]* %x67, i32 0, i32 %34
  store i32 %xor66, i32* %arrayidx68, align 4
  br label %for.inc69

for.inc69:                                        ; preds = %for.body47
  %35 = load i32* %j44, align 4
  %inc70 = add i32 %35, 1
  store i32 %inc70, i32* %j44, align 4
  br label %for.cond45

for.end71:                                        ; preds = %for.cond45
  store i32 623, i32* %j72, align 4
  br label %for.cond73

for.cond73:                                       ; preds = %for.inc98, %for.end71
  %36 = load i32* %j72, align 4
  %cmp74 = icmp ult i32 %36, 623
  br i1 %cmp74, label %for.body75, label %for.end100

for.body75:                                       ; preds = %for.cond73
  %37 = load i32* %j72, align 4
  %x77 = getelementptr inbounds %"class.boost::random::mersenne_twister_engine"* %this1, i32 0, i32 0
  %arrayidx78 = getelementptr inbounds [624 x i32]* %x77, i32 0, i32 %37
  %38 = load i32* %arrayidx78, align 4
  %and79 = and i32 %38, -2147483648
  %39 = load i32* %j72, align 4
  %add80 = add i32 %39, 1
  %x81 = getelementptr inbounds %"class.boost::random::mersenne_twister_engine"* %this1, i32 0, i32 0
  %arrayidx82 = getelementptr inbounds [624 x i32]* %x81, i32 0, i32 %add80
  %40 = load i32* %arrayidx82, align 4
  %and83 = and i32 %40, 2147483647
  %or84 = or i32 %and79, %and83
  store i32 %or84, i32* %y76, align 4
  %41 = load i32* %j72, align 4
  %sub85 = sub i32 %41, 227
  %x86 = getelementptr inbounds %"class.boost::random::mersenne_twister_engine"* %this1, i32 0, i32 0
  %arrayidx87 = getelementptr inbounds [624 x i32]* %x86, i32 0, i32 %sub85
  %42 = load i32* %arrayidx87, align 4
  %43 = load i32* %y76, align 4
  %shr88 = lshr i32 %43, 1
  %xor89 = xor i32 %42, %shr88
  %44 = load i32* %j72, align 4
  %add90 = add i32 %44, 1
  %x91 = getelementptr inbounds %"class.boost::random::mersenne_twister_engine"* %this1, i32 0, i32 0
  %arrayidx92 = getelementptr inbounds [624 x i32]* %x91, i32 0, i32 %add90
  %45 = load i32* %arrayidx92, align 4
  %and93 = and i32 %45, 1
  %mul94 = mul i32 %and93, -1727483681
  %xor95 = xor i32 %xor89, %mul94
  %46 = load i32* %j72, align 4
  %x96 = getelementptr inbounds %"class.boost::random::mersenne_twister_engine"* %this1, i32 0, i32 0
  %arrayidx97 = getelementptr inbounds [624 x i32]* %x96, i32 0, i32 %46
  store i32 %xor95, i32* %arrayidx97, align 4
  br label %for.inc98

for.inc98:                                        ; preds = %for.body75
  %47 = load i32* %j72, align 4
  %inc99 = add i32 %47, 1
  store i32 %inc99, i32* %j72, align 4
  br label %for.cond73

for.end100:                                       ; preds = %for.cond73
  %x102 = getelementptr inbounds %"class.boost::random::mersenne_twister_engine"* %this1, i32 0, i32 0
  %arrayidx103 = getelementptr inbounds [624 x i32]* %x102, i32 0, i32 623
  %48 = load i32* %arrayidx103, align 4
  %and104 = and i32 %48, -2147483648
  %x105 = getelementptr inbounds %"class.boost::random::mersenne_twister_engine"* %this1, i32 0, i32 0
  %arrayidx106 = getelementptr inbounds [624 x i32]* %x105, i32 0, i32 0
  %49 = load i32* %arrayidx106, align 4
  %and107 = and i32 %49, 2147483647
  %or108 = or i32 %and104, %and107
  store i32 %or108, i32* %y101, align 4
  %x109 = getelementptr inbounds %"class.boost::random::mersenne_twister_engine"* %this1, i32 0, i32 0
  %arrayidx110 = getelementptr inbounds [624 x i32]* %x109, i32 0, i32 396
  %50 = load i32* %arrayidx110, align 4
  %51 = load i32* %y101, align 4
  %shr111 = lshr i32 %51, 1
  %xor112 = xor i32 %50, %shr111
  %x113 = getelementptr inbounds %"class.boost::random::mersenne_twister_engine"* %this1, i32 0, i32 0
  %arrayidx114 = getelementptr inbounds [624 x i32]* %x113, i32 0, i32 0
  %52 = load i32* %arrayidx114, align 4
  %and115 = and i32 %52, 1
  %mul116 = mul i32 %and115, -1727483681
  %xor117 = xor i32 %xor112, %mul116
  %x118 = getelementptr inbounds %"class.boost::random::mersenne_twister_engine"* %this1, i32 0, i32 0
  %arrayidx119 = getelementptr inbounds [624 x i32]* %x118, i32 0, i32 623
  store i32 %xor117, i32* %arrayidx119, align 4
  %i = getelementptr inbounds %"class.boost::random::mersenne_twister_engine"* %this1, i32 0, i32 1
  store i32 0, i32* %i, align 4
  ret void
}

define linkonce_odr void @_ZN5boost6random24uniform_int_distributionIiEC2Eii(%"class.boost::random::uniform_int_distribution"* %this, i32 %min_arg, i32 %max_arg) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::random::uniform_int_distribution"*, align 4
  %min_arg.addr = alloca i32, align 4
  %max_arg.addr = alloca i32, align 4
  store %"class.boost::random::uniform_int_distribution"* %this, %"class.boost::random::uniform_int_distribution"** %this.addr, align 4
  store i32 %min_arg, i32* %min_arg.addr, align 4
  store i32 %max_arg, i32* %max_arg.addr, align 4
  %this1 = load %"class.boost::random::uniform_int_distribution"** %this.addr
  %_min = getelementptr inbounds %"class.boost::random::uniform_int_distribution"* %this1, i32 0, i32 0
  %0 = load i32* %min_arg.addr, align 4
  store i32 %0, i32* %_min, align 4
  %_max = getelementptr inbounds %"class.boost::random::uniform_int_distribution"* %this1, i32 0, i32 1
  %1 = load i32* %max_arg.addr, align 4
  store i32 %1, i32* %_max, align 4
  %2 = load i32* %min_arg.addr, align 4
  %3 = load i32* %max_arg.addr, align 4
  %cmp = icmp sle i32 %2, %3
  br i1 %cmp, label %cond.true, label %cond.false

cond.true:                                        ; preds = %entry
  br label %cond.end

cond.false:                                       ; preds = %entry
  call void @__assert_fail(i8* getelementptr inbounds ([19 x i8]* @.str, i32 0, i32 0), i8* getelementptr inbounds ([68 x i8]* @.str2, i32 0, i32 0), i32 318, i8* getelementptr inbounds ([105 x i8]* @__PRETTY_FUNCTION__._ZN5boost6random24uniform_int_distributionIiEC2Eii, i32 0, i32 0)) noreturn nounwind
  unreachable
                                                  ; No predecessors!
  br label %cond.end

cond.end:                                         ; preds = %4, %cond.true
  ret void
}

declare void @__assert_fail(i8*, i8*, i32, i8*) noreturn nounwind

define linkonce_odr void @_ZN5boost6random23mersenne_twister_engineIjLj32ELj624ELj397ELj31ELj2567483615ELj11ELj4294967295ELj7ELj2636928640ELj15ELj4022730752ELj18ELj1812433253EEC2Ev(%"class.boost::random::mersenne_twister_engine"* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::random::mersenne_twister_engine"*, align 4
  store %"class.boost::random::mersenne_twister_engine"* %this, %"class.boost::random::mersenne_twister_engine"** %this.addr, align 4
  %this1 = load %"class.boost::random::mersenne_twister_engine"** %this.addr
  call void @_ZN5boost6random23mersenne_twister_engineIjLj32ELj624ELj397ELj31ELj2567483615ELj11ELj4294967295ELj7ELj2636928640ELj15ELj4022730752ELj18ELj1812433253EE4seedEv(%"class.boost::random::mersenne_twister_engine"* %this1)
  ret void
}

define linkonce_odr void @_ZN5boost6random23mersenne_twister_engineIjLj32ELj624ELj397ELj31ELj2567483615ELj11ELj4294967295ELj7ELj2636928640ELj15ELj4022730752ELj18ELj1812433253EE4seedEv(%"class.boost::random::mersenne_twister_engine"* %this) align 2 {
entry:
  %this.addr = alloca %"class.boost::random::mersenne_twister_engine"*, align 4
  store %"class.boost::random::mersenne_twister_engine"* %this, %"class.boost::random::mersenne_twister_engine"** %this.addr, align 4
  %this1 = load %"class.boost::random::mersenne_twister_engine"** %this.addr
  call void @_ZN5boost6random23mersenne_twister_engineIjLj32ELj624ELj397ELj31ELj2567483615ELj11ELj4294967295ELj7ELj2636928640ELj15ELj4022730752ELj18ELj1812433253EE4seedERKj(%"class.boost::random::mersenne_twister_engine"* %this1, i32* @_ZN5boost6random23mersenne_twister_engineIjLj32ELj624ELj397ELj31ELj2567483615ELj11ELj4294967295ELj7ELj2636928640ELj15ELj4022730752ELj18ELj1812433253EE12default_seedE)
  ret void
}

define linkonce_odr void @_ZN5boost6random23mersenne_twister_engineIjLj32ELj624ELj397ELj31ELj2567483615ELj11ELj4294967295ELj7ELj2636928640ELj15ELj4022730752ELj18ELj1812433253EE4seedERKj(%"class.boost::random::mersenne_twister_engine"* %this, i32* %value) nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::random::mersenne_twister_engine"*, align 4
  %value.addr = alloca i32*, align 4
  %mask = alloca i32, align 4
  store %"class.boost::random::mersenne_twister_engine"* %this, %"class.boost::random::mersenne_twister_engine"** %this.addr, align 4
  store i32* %value, i32** %value.addr, align 4
  %this1 = load %"class.boost::random::mersenne_twister_engine"** %this.addr
  %call = call i32 @_ZN5boost6random23mersenne_twister_engineIjLj32ELj624ELj397ELj31ELj2567483615ELj11ELj4294967295ELj7ELj2636928640ELj15ELj4022730752ELj18ELj1812433253EE3maxEv()
  store i32 %call, i32* %mask, align 4
  %0 = load i32** %value.addr, align 4
  %1 = load i32* %0, align 4
  %2 = load i32* %mask, align 4
  %and = and i32 %1, %2
  %x = getelementptr inbounds %"class.boost::random::mersenne_twister_engine"* %this1, i32 0, i32 0
  %arrayidx = getelementptr inbounds [624 x i32]* %x, i32 0, i32 0
  store i32 %and, i32* %arrayidx, align 4
  %i = getelementptr inbounds %"class.boost::random::mersenne_twister_engine"* %this1, i32 0, i32 1
  store i32 1, i32* %i, align 4
  br label %for.cond

for.cond:                                         ; preds = %for.inc, %entry
  %i2 = getelementptr inbounds %"class.boost::random::mersenne_twister_engine"* %this1, i32 0, i32 1
  %3 = load i32* %i2, align 4
  %cmp = icmp ult i32 %3, 624
  br i1 %cmp, label %for.body, label %for.end

for.body:                                         ; preds = %for.cond
  %i3 = getelementptr inbounds %"class.boost::random::mersenne_twister_engine"* %this1, i32 0, i32 1
  %4 = load i32* %i3, align 4
  %sub = sub i32 %4, 1
  %x4 = getelementptr inbounds %"class.boost::random::mersenne_twister_engine"* %this1, i32 0, i32 0
  %arrayidx5 = getelementptr inbounds [624 x i32]* %x4, i32 0, i32 %sub
  %5 = load i32* %arrayidx5, align 4
  %i6 = getelementptr inbounds %"class.boost::random::mersenne_twister_engine"* %this1, i32 0, i32 1
  %6 = load i32* %i6, align 4
  %sub7 = sub i32 %6, 1
  %x8 = getelementptr inbounds %"class.boost::random::mersenne_twister_engine"* %this1, i32 0, i32 0
  %arrayidx9 = getelementptr inbounds [624 x i32]* %x8, i32 0, i32 %sub7
  %7 = load i32* %arrayidx9, align 4
  %shr = lshr i32 %7, 30
  %xor = xor i32 %5, %shr
  %mul = mul i32 1812433253, %xor
  %i10 = getelementptr inbounds %"class.boost::random::mersenne_twister_engine"* %this1, i32 0, i32 1
  %8 = load i32* %i10, align 4
  %add = add i32 %mul, %8
  %9 = load i32* %mask, align 4
  %and11 = and i32 %add, %9
  %i12 = getelementptr inbounds %"class.boost::random::mersenne_twister_engine"* %this1, i32 0, i32 1
  %10 = load i32* %i12, align 4
  %x13 = getelementptr inbounds %"class.boost::random::mersenne_twister_engine"* %this1, i32 0, i32 0
  %arrayidx14 = getelementptr inbounds [624 x i32]* %x13, i32 0, i32 %10
  store i32 %and11, i32* %arrayidx14, align 4
  br label %for.inc

for.inc:                                          ; preds = %for.body
  %i15 = getelementptr inbounds %"class.boost::random::mersenne_twister_engine"* %this1, i32 0, i32 1
  %11 = load i32* %i15, align 4
  %inc = add i32 %11, 1
  store i32 %inc, i32* %i15, align 4
  br label %for.cond

for.end:                                          ; preds = %for.cond
  ret void
}

define internal void @_GLOBAL__I_a() section ".text.startup" {
entry:
  call void @__cxx_global_var_init()
  call void @__cxx_global_var_init1()
  ret void
}
