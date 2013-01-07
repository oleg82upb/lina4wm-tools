; ModuleID = 'array1.cpp'
target datalayout = "e-p:32:32:32-i1:8:8-i8:8:8-i16:16:16-i32:32:32-i64:32:64-f32:32:32-f64:32:64-v64:64:64-v128:128:128-a0:0:64-f80:32:32-n8:16:32-S128"
target triple = "i386-pc-linux-gnu"

%"class.std::ios_base::Init" = type { i8 }
%"class.boost::array" = type { [6 x float] }
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

@_ZStL8__ioinit = internal global %"class.std::ios_base::Init" zeroinitializer, align 1
@__dso_handle = external global i8
@_ZZ4mainE1a = private unnamed_addr constant %"class.boost::array" { [6 x float] [float 4.200000e+01, float 0.000000e+00, float 0.000000e+00, float 0.000000e+00, float 0.000000e+00, float 0.000000e+00] }, align 4
@_ZSt4cout = external global %"class.std::basic_ostream"
@.str = private unnamed_addr constant [11 x i8] c"size:     \00", align 1
@.str1 = private unnamed_addr constant [11 x i8] c"empty:    \00", align 1
@.str2 = private unnamed_addr constant [5 x i8] c"true\00", align 1
@.str3 = private unnamed_addr constant [6 x i8] c"false\00", align 1
@.str4 = private unnamed_addr constant [11 x i8] c"max_size: \00", align 1
@.str5 = private unnamed_addr constant [11 x i8] c"front:    \00", align 1
@.str6 = private unnamed_addr constant [11 x i8] c"back:     \00", align 1
@.str7 = private unnamed_addr constant [11 x i8] c"elems:    \00", align 1
@.str8 = private unnamed_addr constant [45 x i8] c"copy construction and copy assignment are OK\00", align 1
@.str9 = private unnamed_addr constant [45 x i8] c"copy construction and copy assignment FAILED\00", align 1
@.str10 = private unnamed_addr constant [6 x i8] c"i < N\00", align 1
@.str11 = private unnamed_addr constant [13 x i8] c"out of range\00", align 1
@__PRETTY_FUNCTION__._ZN5boost5arrayIfLj6EEixEj = private unnamed_addr constant [75 x i8] c"reference boost::array<float, 6>::operator[](size_type) [T = float, N = 6]\00", align 1
@.str12 = private unnamed_addr constant [42 x i8] c"/home/thomas/boost_1_52_0/boost/array.hpp\00", align 1
@_ZSt4cerr = external global %"class.std::basic_ostream"
@.str13 = private unnamed_addr constant [43 x i8] c"***** Internal Program Error - assertion (\00", align 1
@.str14 = private unnamed_addr constant [13 x i8] c") failed in \00", align 1
@.str15 = private unnamed_addr constant [3 x i8] c":\0A\00", align 1
@.str16 = private unnamed_addr constant [4 x i8] c"): \00", align 1
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
  %a = alloca %"class.boost::array", align 4
  %i = alloca i32, align 4
  %pos = alloca float*, align 4
  %b = alloca %"class.boost::array", align 4
  %c = alloca %"class.boost::array", align 4
  store i32 0, i32* %retval
  %0 = bitcast %"class.boost::array"* %a to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %0, i8* bitcast (%"class.boost::array"* @_ZZ4mainE1a to i8*), i32 24, i32 4, i1 false)
  store i32 1, i32* %i, align 4
  br label %for.cond

for.cond:                                         ; preds = %for.inc, %entry
  %1 = load i32* %i, align 4
  %call = call i32 @_ZN5boost5arrayIfLj6EE4sizeEv()
  %cmp = icmp ult i32 %1, %call
  br i1 %cmp, label %for.body, label %for.end

for.body:                                         ; preds = %for.cond
  %2 = load i32* %i, align 4
  %sub = sub i32 %2, 1
  %call1 = call float* @_ZN5boost5arrayIfLj6EEixEj(%"class.boost::array"* %a, i32 %sub)
  %3 = load float* %call1
  %add = fadd float %3, 1.000000e+00
  %4 = load i32* %i, align 4
  %call2 = call float* @_ZN5boost5arrayIfLj6EEixEj(%"class.boost::array"* %a, i32 %4)
  store float %add, float* %call2
  br label %for.inc

for.inc:                                          ; preds = %for.body
  %5 = load i32* %i, align 4
  %inc = add i32 %5, 1
  store i32 %inc, i32* %i, align 4
  br label %for.cond

for.end:                                          ; preds = %for.cond
  %call3 = call %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* @_ZSt4cout, i8* getelementptr inbounds ([11 x i8]* @.str, i32 0, i32 0))
  %call4 = call i32 @_ZN5boost5arrayIfLj6EE4sizeEv()
  %call5 = call %"class.std::basic_ostream"* @_ZNSolsEj(%"class.std::basic_ostream"* %call3, i32 %call4)
  %call6 = call %"class.std::basic_ostream"* @_ZNSolsEPFRSoS_E(%"class.std::basic_ostream"* %call5, %"class.std::basic_ostream"* (%"class.std::basic_ostream"*)* @_ZSt4endlIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_)
  %call7 = call %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* @_ZSt4cout, i8* getelementptr inbounds ([11 x i8]* @.str1, i32 0, i32 0))
  %call8 = call zeroext i1 @_ZN5boost5arrayIfLj6EE5emptyEv()
  %cond = select i1 %call8, i8* getelementptr inbounds ([5 x i8]* @.str2, i32 0, i32 0), i8* getelementptr inbounds ([6 x i8]* @.str3, i32 0, i32 0)
  %call9 = call %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* %call7, i8* %cond)
  %call10 = call %"class.std::basic_ostream"* @_ZNSolsEPFRSoS_E(%"class.std::basic_ostream"* %call9, %"class.std::basic_ostream"* (%"class.std::basic_ostream"*)* @_ZSt4endlIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_)
  %call11 = call %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* @_ZSt4cout, i8* getelementptr inbounds ([11 x i8]* @.str4, i32 0, i32 0))
  %call12 = call i32 @_ZN5boost5arrayIfLj6EE8max_sizeEv()
  %call13 = call %"class.std::basic_ostream"* @_ZNSolsEj(%"class.std::basic_ostream"* %call11, i32 %call12)
  %call14 = call %"class.std::basic_ostream"* @_ZNSolsEPFRSoS_E(%"class.std::basic_ostream"* %call13, %"class.std::basic_ostream"* (%"class.std::basic_ostream"*)* @_ZSt4endlIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_)
  %call15 = call %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* @_ZSt4cout, i8* getelementptr inbounds ([11 x i8]* @.str5, i32 0, i32 0))
  %call16 = call float* @_ZN5boost5arrayIfLj6EE5frontEv(%"class.boost::array"* %a)
  %6 = load float* %call16
  %call17 = call %"class.std::basic_ostream"* @_ZNSolsEf(%"class.std::basic_ostream"* %call15, float %6)
  %call18 = call %"class.std::basic_ostream"* @_ZNSolsEPFRSoS_E(%"class.std::basic_ostream"* %call17, %"class.std::basic_ostream"* (%"class.std::basic_ostream"*)* @_ZSt4endlIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_)
  %call19 = call %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* @_ZSt4cout, i8* getelementptr inbounds ([11 x i8]* @.str6, i32 0, i32 0))
  %call20 = call float* @_ZN5boost5arrayIfLj6EE4backEv(%"class.boost::array"* %a)
  %7 = load float* %call20
  %call21 = call %"class.std::basic_ostream"* @_ZNSolsEf(%"class.std::basic_ostream"* %call19, float %7)
  %call22 = call %"class.std::basic_ostream"* @_ZNSolsEPFRSoS_E(%"class.std::basic_ostream"* %call21, %"class.std::basic_ostream"* (%"class.std::basic_ostream"*)* @_ZSt4endlIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_)
  %call23 = call %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* @_ZSt4cout, i8* getelementptr inbounds ([11 x i8]* @.str7, i32 0, i32 0))
  %call24 = call float* @_ZN5boost5arrayIfLj6EE5beginEv(%"class.boost::array"* %a)
  store float* %call24, float** %pos, align 4
  br label %for.cond25

for.cond25:                                       ; preds = %for.inc31, %for.end
  %8 = load float** %pos, align 4
  %call26 = call float* @_ZN5boost5arrayIfLj6EE3endEv(%"class.boost::array"* %a)
  %cmp27 = icmp ult float* %8, %call26
  br i1 %cmp27, label %for.body28, label %for.end32

for.body28:                                       ; preds = %for.cond25
  %9 = load float** %pos, align 4
  %10 = load float* %9, align 4
  %call29 = call %"class.std::basic_ostream"* @_ZNSolsEf(%"class.std::basic_ostream"* @_ZSt4cout, float %10)
  %call30 = call %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_c(%"class.std::basic_ostream"* %call29, i8 signext 32)
  br label %for.inc31

for.inc31:                                        ; preds = %for.body28
  %11 = load float** %pos, align 4
  %incdec.ptr = getelementptr inbounds float* %11, i32 1
  store float* %incdec.ptr, float** %pos, align 4
  br label %for.cond25

for.end32:                                        ; preds = %for.cond25
  %call33 = call %"class.std::basic_ostream"* @_ZNSolsEPFRSoS_E(%"class.std::basic_ostream"* @_ZSt4cout, %"class.std::basic_ostream"* (%"class.std::basic_ostream"*)* @_ZSt4endlIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_)
  %12 = bitcast %"class.boost::array"* %b to i8*
  %13 = bitcast %"class.boost::array"* %a to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %12, i8* %13, i32 24, i32 4, i1 false)
  %14 = bitcast %"class.boost::array"* %c to i8*
  %15 = bitcast %"class.boost::array"* %a to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %14, i8* %15, i32 24, i32 4, i1 false)
  %call34 = call zeroext i1 @_ZN5boosteqIfLj6EEEbRKNS_5arrayIT_XT0_EEES5_(%"class.boost::array"* %a, %"class.boost::array"* %b)
  br i1 %call34, label %land.lhs.true, label %if.else

land.lhs.true:                                    ; preds = %for.end32
  %call35 = call zeroext i1 @_ZN5boosteqIfLj6EEEbRKNS_5arrayIT_XT0_EEES5_(%"class.boost::array"* %a, %"class.boost::array"* %c)
  br i1 %call35, label %if.then, label %if.else

if.then:                                          ; preds = %land.lhs.true
  %call36 = call %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* @_ZSt4cout, i8* getelementptr inbounds ([45 x i8]* @.str8, i32 0, i32 0))
  %call37 = call %"class.std::basic_ostream"* @_ZNSolsEPFRSoS_E(%"class.std::basic_ostream"* %call36, %"class.std::basic_ostream"* (%"class.std::basic_ostream"*)* @_ZSt4endlIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_)
  br label %if.end

if.else:                                          ; preds = %land.lhs.true, %for.end32
  %call38 = call %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* @_ZSt4cout, i8* getelementptr inbounds ([45 x i8]* @.str9, i32 0, i32 0))
  %call39 = call %"class.std::basic_ostream"* @_ZNSolsEPFRSoS_E(%"class.std::basic_ostream"* %call38, %"class.std::basic_ostream"* (%"class.std::basic_ostream"*)* @_ZSt4endlIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_)
  br label %if.end

if.end:                                           ; preds = %if.else, %if.then
  ret i32 0
}

declare void @llvm.memcpy.p0i8.p0i8.i32(i8* nocapture, i8* nocapture, i32, i32, i1) nounwind

define linkonce_odr i32 @_ZN5boost5arrayIfLj6EE4sizeEv() nounwind align 2 {
entry:
  ret i32 6
}

define linkonce_odr float* @_ZN5boost5arrayIfLj6EEixEj(%"class.boost::array"* %this, i32 %i) align 2 {
entry:
  %this.addr = alloca %"class.boost::array"*, align 4
  %i.addr = alloca i32, align 4
  store %"class.boost::array"* %this, %"class.boost::array"** %this.addr, align 4
  store i32 %i, i32* %i.addr, align 4
  %this1 = load %"class.boost::array"** %this.addr
  %0 = load i32* %i.addr, align 4
  %cmp = icmp ult i32 %0, 6
  br i1 %cmp, label %cond.true, label %cond.false

cond.true:                                        ; preds = %entry
  br label %cond.end

cond.false:                                       ; preds = %entry
  call void @_ZN5boost9assertion6detail20assertion_failed_msgEPKcS3_S3_S3_l(i8* getelementptr inbounds ([6 x i8]* @.str10, i32 0, i32 0), i8* getelementptr inbounds ([13 x i8]* @.str11, i32 0, i32 0), i8* getelementptr inbounds ([75 x i8]* @__PRETTY_FUNCTION__._ZN5boost5arrayIfLj6EEixEj, i32 0, i32 0), i8* getelementptr inbounds ([42 x i8]* @.str12, i32 0, i32 0), i32 123)
  br label %cond.end

cond.end:                                         ; preds = %cond.false, %cond.true
  %1 = load i32* %i.addr, align 4
  %elems = getelementptr inbounds %"class.boost::array"* %this1, i32 0, i32 0
  %arrayidx = getelementptr inbounds [6 x float]* %elems, i32 0, i32 %1
  ret float* %arrayidx
}

declare %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"*, i8*)

declare %"class.std::basic_ostream"* @_ZNSolsEj(%"class.std::basic_ostream"*, i32)

declare %"class.std::basic_ostream"* @_ZNSolsEPFRSoS_E(%"class.std::basic_ostream"*, %"class.std::basic_ostream"* (%"class.std::basic_ostream"*)*)

declare %"class.std::basic_ostream"* @_ZSt4endlIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_(%"class.std::basic_ostream"*)

define linkonce_odr zeroext i1 @_ZN5boost5arrayIfLj6EE5emptyEv() nounwind align 2 {
entry:
  ret i1 false
}

define linkonce_odr i32 @_ZN5boost5arrayIfLj6EE8max_sizeEv() nounwind align 2 {
entry:
  ret i32 6
}

declare %"class.std::basic_ostream"* @_ZNSolsEf(%"class.std::basic_ostream"*, float)

define linkonce_odr float* @_ZN5boost5arrayIfLj6EE5frontEv(%"class.boost::array"* %this) nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::array"*, align 4
  store %"class.boost::array"* %this, %"class.boost::array"** %this.addr, align 4
  %this1 = load %"class.boost::array"** %this.addr
  %elems = getelementptr inbounds %"class.boost::array"* %this1, i32 0, i32 0
  %arrayidx = getelementptr inbounds [6 x float]* %elems, i32 0, i32 0
  ret float* %arrayidx
}

define linkonce_odr float* @_ZN5boost5arrayIfLj6EE4backEv(%"class.boost::array"* %this) nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::array"*, align 4
  store %"class.boost::array"* %this, %"class.boost::array"** %this.addr, align 4
  %this1 = load %"class.boost::array"** %this.addr
  %elems = getelementptr inbounds %"class.boost::array"* %this1, i32 0, i32 0
  %arrayidx = getelementptr inbounds [6 x float]* %elems, i32 0, i32 5
  ret float* %arrayidx
}

define linkonce_odr float* @_ZN5boost5arrayIfLj6EE5beginEv(%"class.boost::array"* %this) nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::array"*, align 4
  store %"class.boost::array"* %this, %"class.boost::array"** %this.addr, align 4
  %this1 = load %"class.boost::array"** %this.addr
  %elems = getelementptr inbounds %"class.boost::array"* %this1, i32 0, i32 0
  %arraydecay = getelementptr inbounds [6 x float]* %elems, i32 0, i32 0
  ret float* %arraydecay
}

define linkonce_odr float* @_ZN5boost5arrayIfLj6EE3endEv(%"class.boost::array"* %this) nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::array"*, align 4
  store %"class.boost::array"* %this, %"class.boost::array"** %this.addr, align 4
  %this1 = load %"class.boost::array"** %this.addr
  %elems = getelementptr inbounds %"class.boost::array"* %this1, i32 0, i32 0
  %arraydecay = getelementptr inbounds [6 x float]* %elems, i32 0, i32 0
  %add.ptr = getelementptr inbounds float* %arraydecay, i32 6
  ret float* %add.ptr
}

declare %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_c(%"class.std::basic_ostream"*, i8 signext)

define linkonce_odr zeroext i1 @_ZN5boosteqIfLj6EEEbRKNS_5arrayIT_XT0_EEES5_(%"class.boost::array"* %x, %"class.boost::array"* %y) {
entry:
  %x.addr = alloca %"class.boost::array"*, align 4
  %y.addr = alloca %"class.boost::array"*, align 4
  store %"class.boost::array"* %x, %"class.boost::array"** %x.addr, align 4
  store %"class.boost::array"* %y, %"class.boost::array"** %y.addr, align 4
  %0 = load %"class.boost::array"** %x.addr, align 4
  %call = call float* @_ZNK5boost5arrayIfLj6EE5beginEv(%"class.boost::array"* %0)
  %1 = load %"class.boost::array"** %x.addr, align 4
  %call1 = call float* @_ZNK5boost5arrayIfLj6EE3endEv(%"class.boost::array"* %1)
  %2 = load %"class.boost::array"** %y.addr, align 4
  %call2 = call float* @_ZNK5boost5arrayIfLj6EE5beginEv(%"class.boost::array"* %2)
  %call3 = call zeroext i1 @_ZSt5equalIPKfS1_EbT_S2_T0_(float* %call, float* %call1, float* %call2)
  ret i1 %call3
}

define linkonce_odr zeroext i1 @_ZSt5equalIPKfS1_EbT_S2_T0_(float* %__first1, float* %__last1, float* %__first2) {
entry:
  %__first1.addr = alloca float*, align 4
  %__last1.addr = alloca float*, align 4
  %__first2.addr = alloca float*, align 4
  store float* %__first1, float** %__first1.addr, align 4
  store float* %__last1, float** %__last1.addr, align 4
  store float* %__first2, float** %__first2.addr, align 4
  %0 = load float** %__first1.addr, align 4
  %call = call float* @_ZSt12__niter_baseIPKfENSt11_Niter_baseIT_E13iterator_typeES3_(float* %0)
  %1 = load float** %__last1.addr, align 4
  %call1 = call float* @_ZSt12__niter_baseIPKfENSt11_Niter_baseIT_E13iterator_typeES3_(float* %1)
  %2 = load float** %__first2.addr, align 4
  %call2 = call float* @_ZSt12__niter_baseIPKfENSt11_Niter_baseIT_E13iterator_typeES3_(float* %2)
  %call3 = call zeroext i1 @_ZSt11__equal_auxIPKfS1_EbT_S2_T0_(float* %call, float* %call1, float* %call2)
  ret i1 %call3
}

define linkonce_odr float* @_ZNK5boost5arrayIfLj6EE5beginEv(%"class.boost::array"* %this) nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::array"*, align 4
  store %"class.boost::array"* %this, %"class.boost::array"** %this.addr, align 4
  %this1 = load %"class.boost::array"** %this.addr
  %elems = getelementptr inbounds %"class.boost::array"* %this1, i32 0, i32 0
  %arraydecay = getelementptr inbounds [6 x float]* %elems, i32 0, i32 0
  ret float* %arraydecay
}

define linkonce_odr float* @_ZNK5boost5arrayIfLj6EE3endEv(%"class.boost::array"* %this) nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::array"*, align 4
  store %"class.boost::array"* %this, %"class.boost::array"** %this.addr, align 4
  %this1 = load %"class.boost::array"** %this.addr
  %elems = getelementptr inbounds %"class.boost::array"* %this1, i32 0, i32 0
  %arraydecay = getelementptr inbounds [6 x float]* %elems, i32 0, i32 0
  %add.ptr = getelementptr inbounds float* %arraydecay, i32 6
  ret float* %add.ptr
}

define linkonce_odr zeroext i1 @_ZSt11__equal_auxIPKfS1_EbT_S2_T0_(float* %__first1, float* %__last1, float* %__first2) inlinehint {
entry:
  %__first1.addr = alloca float*, align 4
  %__last1.addr = alloca float*, align 4
  %__first2.addr = alloca float*, align 4
  %__simple = alloca i8, align 1
  store float* %__first1, float** %__first1.addr, align 4
  store float* %__last1, float** %__last1.addr, align 4
  store float* %__first2, float** %__first2.addr, align 4
  store i8 0, i8* %__simple, align 1
  %0 = load float** %__first1.addr, align 4
  %1 = load float** %__last1.addr, align 4
  %2 = load float** %__first2.addr, align 4
  %call = call zeroext i1 @_ZNSt7__equalILb0EE5equalIPKfS3_EEbT_S4_T0_(float* %0, float* %1, float* %2)
  ret i1 %call
}

define linkonce_odr float* @_ZSt12__niter_baseIPKfENSt11_Niter_baseIT_E13iterator_typeES3_(float* %__it) inlinehint {
entry:
  %__it.addr = alloca float*, align 4
  store float* %__it, float** %__it.addr, align 4
  %0 = load float** %__it.addr, align 4
  %call = call float* @_ZNSt10_Iter_baseIPKfLb0EE7_S_baseES1_(float* %0)
  ret float* %call
}

define linkonce_odr float* @_ZNSt10_Iter_baseIPKfLb0EE7_S_baseES1_(float* %__it) nounwind align 2 {
entry:
  %__it.addr = alloca float*, align 4
  store float* %__it, float** %__it.addr, align 4
  %0 = load float** %__it.addr, align 4
  ret float* %0
}

define linkonce_odr zeroext i1 @_ZNSt7__equalILb0EE5equalIPKfS3_EEbT_S4_T0_(float* %__first1, float* %__last1, float* %__first2) nounwind align 2 {
entry:
  %retval = alloca i1, align 1
  %__first1.addr = alloca float*, align 4
  %__last1.addr = alloca float*, align 4
  %__first2.addr = alloca float*, align 4
  store float* %__first1, float** %__first1.addr, align 4
  store float* %__last1, float** %__last1.addr, align 4
  store float* %__first2, float** %__first2.addr, align 4
  br label %for.cond

for.cond:                                         ; preds = %for.inc, %entry
  %0 = load float** %__first1.addr, align 4
  %1 = load float** %__last1.addr, align 4
  %cmp = icmp ne float* %0, %1
  br i1 %cmp, label %for.body, label %for.end

for.body:                                         ; preds = %for.cond
  %2 = load float** %__first1.addr, align 4
  %3 = load float* %2, align 4
  %4 = load float** %__first2.addr, align 4
  %5 = load float* %4, align 4
  %cmp1 = fcmp oeq float %3, %5
  br i1 %cmp1, label %if.end, label %if.then

if.then:                                          ; preds = %for.body
  store i1 false, i1* %retval
  br label %return

if.end:                                           ; preds = %for.body
  br label %for.inc

for.inc:                                          ; preds = %if.end
  %6 = load float** %__first1.addr, align 4
  %incdec.ptr = getelementptr inbounds float* %6, i32 1
  store float* %incdec.ptr, float** %__first1.addr, align 4
  %7 = load float** %__first2.addr, align 4
  %incdec.ptr2 = getelementptr inbounds float* %7, i32 1
  store float* %incdec.ptr2, float** %__first2.addr, align 4
  br label %for.cond

for.end:                                          ; preds = %for.cond
  store i1 true, i1* %retval
  br label %return

return:                                           ; preds = %for.end, %if.then
  %8 = load i1* %retval
  ret i1 %8
}

define linkonce_odr void @_ZN5boost9assertion6detail20assertion_failed_msgEPKcS3_S3_S3_l(i8* %expr, i8* %msg, i8* %function, i8* %file, i32 %line) inlinehint {
entry:
  %expr.addr = alloca i8*, align 4
  %msg.addr = alloca i8*, align 4
  %function.addr = alloca i8*, align 4
  %file.addr = alloca i8*, align 4
  %line.addr = alloca i32, align 4
  store i8* %expr, i8** %expr.addr, align 4
  store i8* %msg, i8** %msg.addr, align 4
  store i8* %function, i8** %function.addr, align 4
  store i8* %file, i8** %file.addr, align 4
  store i32 %line, i32* %line.addr, align 4
  %call = call %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* @_ZSt4cerr, i8* getelementptr inbounds ([43 x i8]* @.str13, i32 0, i32 0))
  %0 = load i8** %expr.addr, align 4
  %call1 = call %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* %call, i8* %0)
  %call2 = call %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* %call1, i8* getelementptr inbounds ([13 x i8]* @.str14, i32 0, i32 0))
  %1 = load i8** %function.addr, align 4
  %call3 = call %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* %call2, i8* %1)
  %call4 = call %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* %call3, i8* getelementptr inbounds ([3 x i8]* @.str15, i32 0, i32 0))
  %2 = load i8** %file.addr, align 4
  %call5 = call %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* %call4, i8* %2)
  %call6 = call %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_c(%"class.std::basic_ostream"* %call5, i8 signext 40)
  %3 = load i32* %line.addr, align 4
  %call7 = call %"class.std::basic_ostream"* @_ZNSolsEl(%"class.std::basic_ostream"* %call6, i32 %3)
  %call8 = call %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* %call7, i8* getelementptr inbounds ([4 x i8]* @.str16, i32 0, i32 0))
  %4 = load i8** %msg.addr, align 4
  %call9 = call %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* %call8, i8* %4)
  %call10 = call %"class.std::basic_ostream"* @_ZNSolsEPFRSoS_E(%"class.std::basic_ostream"* %call9, %"class.std::basic_ostream"* (%"class.std::basic_ostream"*)* @_ZSt4endlIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_)
  call void @abort() noreturn nounwind
  unreachable

return:                                           ; No predecessors!
  ret void
}

declare %"class.std::basic_ostream"* @_ZNSolsEl(%"class.std::basic_ostream"*, i32)

declare void @abort() noreturn nounwind

define internal void @_GLOBAL__I_a() section ".text.startup" {
entry:
  call void @__cxx_global_var_init()
  ret void
}
