; ModuleID = 'array5.cpp'
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
%"class.boost::array.0" = type { [6 x i32] }
%"class.boost::array.1" = type { [6 x double] }

@_ZStL8__ioinit = internal global %"class.std::ios_base::Init" zeroinitializer, align 1
@__dso_handle = external global i8
@_ZZ4mainE1a = internal constant %"class.boost::array" { [6 x float] [float 0x404535C280000000, float 0.000000e+00, float 0.000000e+00, float 0.000000e+00, float 0.000000e+00, float 0.000000e+00] }, align 4
@_ZSt4cout = external global %"class.std::basic_ostream"
@.str = private unnamed_addr constant [14 x i8] c"static_size: \00", align 1
@.str1 = private unnamed_addr constant [14 x i8] c"size:        \00", align 1
@.str2 = private unnamed_addr constant [14 x i8] c"empty:       \00", align 1
@.str3 = private unnamed_addr constant [5 x i8] c"true\00", align 1
@.str4 = private unnamed_addr constant [6 x i8] c"false\00", align 1
@.str5 = private unnamed_addr constant [14 x i8] c"max_size:    \00", align 1
@.str6 = private unnamed_addr constant [14 x i8] c"front:       \00", align 1
@.str7 = private unnamed_addr constant [14 x i8] c"back:        \00", align 1
@.str8 = private unnamed_addr constant [14 x i8] c"[0]:         \00", align 1
@.str9 = private unnamed_addr constant [14 x i8] c"elems:       \00", align 1
@.str10 = private unnamed_addr constant [45 x i8] c"copy construction and copy assignment are OK\00", align 1
@.str11 = private unnamed_addr constant [49 x i8] c"copy construction and copy assignment are BROKEN\00", align 1
@_ZZ4mainE2ia = private unnamed_addr constant %"class.boost::array.0" { [6 x i32] [i32 1, i32 2, i32 3, i32 4, i32 5, i32 6] }, align 4
@.str12 = private unnamed_addr constant [6 x i8] c"i < N\00", align 1
@.str13 = private unnamed_addr constant [13 x i8] c"out of range\00", align 1
@__PRETTY_FUNCTION__._ZNK5boost5arrayIfLj6EEixEj = private unnamed_addr constant [87 x i8] c"const_reference boost::array<float, 6>::operator[](size_type) const [T = float, N = 6]\00", align 1
@.str14 = private unnamed_addr constant [42 x i8] c"/home/thomas/boost_1_52_0/boost/array.hpp\00", align 1
@_ZSt4cerr = external global %"class.std::basic_ostream"
@.str15 = private unnamed_addr constant [43 x i8] c"***** Internal Program Error - assertion (\00", align 1
@.str16 = private unnamed_addr constant [13 x i8] c") failed in \00", align 1
@.str17 = private unnamed_addr constant [3 x i8] c":\0A\00", align 1
@.str18 = private unnamed_addr constant [4 x i8] c"): \00", align 1
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
  %pos = alloca float*, align 4
  %b = alloca %"class.boost::array", align 4
  %c = alloca %"class.boost::array", align 4
  %ia = alloca %"class.boost::array.0", align 4
  %da = alloca %"class.boost::array.1", align 4
  %ref.tmp = alloca double, align 4
  store i32 0, i32* %retval
  %call = call %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* @_ZSt4cout, i8* getelementptr inbounds ([14 x i8]* @.str, i32 0, i32 0))
  %call1 = call i32 @_ZN5boost5arrayIfLj6EE4sizeEv()
  %call2 = call %"class.std::basic_ostream"* @_ZNSolsEj(%"class.std::basic_ostream"* %call, i32 %call1)
  %call3 = call %"class.std::basic_ostream"* @_ZNSolsEPFRSoS_E(%"class.std::basic_ostream"* %call2, %"class.std::basic_ostream"* (%"class.std::basic_ostream"*)* @_ZSt4endlIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_)
  %call4 = call %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* @_ZSt4cout, i8* getelementptr inbounds ([14 x i8]* @.str1, i32 0, i32 0))
  %call5 = call i32 @_ZN5boost5arrayIfLj6EE4sizeEv()
  %call6 = call %"class.std::basic_ostream"* @_ZNSolsEj(%"class.std::basic_ostream"* %call4, i32 %call5)
  %call7 = call %"class.std::basic_ostream"* @_ZNSolsEPFRSoS_E(%"class.std::basic_ostream"* %call6, %"class.std::basic_ostream"* (%"class.std::basic_ostream"*)* @_ZSt4endlIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_)
  %call8 = call %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* @_ZSt4cout, i8* getelementptr inbounds ([14 x i8]* @.str2, i32 0, i32 0))
  %call9 = call zeroext i1 @_ZN5boost5arrayIfLj6EE5emptyEv()
  %cond = select i1 %call9, i8* getelementptr inbounds ([5 x i8]* @.str3, i32 0, i32 0), i8* getelementptr inbounds ([6 x i8]* @.str4, i32 0, i32 0)
  %call10 = call %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* %call8, i8* %cond)
  %call11 = call %"class.std::basic_ostream"* @_ZNSolsEPFRSoS_E(%"class.std::basic_ostream"* %call10, %"class.std::basic_ostream"* (%"class.std::basic_ostream"*)* @_ZSt4endlIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_)
  %call12 = call %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* @_ZSt4cout, i8* getelementptr inbounds ([14 x i8]* @.str5, i32 0, i32 0))
  %call13 = call i32 @_ZN5boost5arrayIfLj6EE8max_sizeEv()
  %call14 = call %"class.std::basic_ostream"* @_ZNSolsEj(%"class.std::basic_ostream"* %call12, i32 %call13)
  %call15 = call %"class.std::basic_ostream"* @_ZNSolsEPFRSoS_E(%"class.std::basic_ostream"* %call14, %"class.std::basic_ostream"* (%"class.std::basic_ostream"*)* @_ZSt4endlIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_)
  %call16 = call %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* @_ZSt4cout, i8* getelementptr inbounds ([14 x i8]* @.str6, i32 0, i32 0))
  %call17 = call float* @_ZNK5boost5arrayIfLj6EE5frontEv(%"class.boost::array"* @_ZZ4mainE1a)
  %0 = load float* %call17
  %call18 = call %"class.std::basic_ostream"* @_ZNSolsEf(%"class.std::basic_ostream"* %call16, float %0)
  %call19 = call %"class.std::basic_ostream"* @_ZNSolsEPFRSoS_E(%"class.std::basic_ostream"* %call18, %"class.std::basic_ostream"* (%"class.std::basic_ostream"*)* @_ZSt4endlIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_)
  %call20 = call %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* @_ZSt4cout, i8* getelementptr inbounds ([14 x i8]* @.str7, i32 0, i32 0))
  %call21 = call float* @_ZNK5boost5arrayIfLj6EE4backEv(%"class.boost::array"* @_ZZ4mainE1a)
  %1 = load float* %call21
  %call22 = call %"class.std::basic_ostream"* @_ZNSolsEf(%"class.std::basic_ostream"* %call20, float %1)
  %call23 = call %"class.std::basic_ostream"* @_ZNSolsEPFRSoS_E(%"class.std::basic_ostream"* %call22, %"class.std::basic_ostream"* (%"class.std::basic_ostream"*)* @_ZSt4endlIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_)
  %call24 = call %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* @_ZSt4cout, i8* getelementptr inbounds ([14 x i8]* @.str8, i32 0, i32 0))
  %call25 = call float* @_ZNK5boost5arrayIfLj6EEixEj(%"class.boost::array"* @_ZZ4mainE1a, i32 0)
  %2 = load float* %call25
  %call26 = call %"class.std::basic_ostream"* @_ZNSolsEf(%"class.std::basic_ostream"* %call24, float %2)
  %call27 = call %"class.std::basic_ostream"* @_ZNSolsEPFRSoS_E(%"class.std::basic_ostream"* %call26, %"class.std::basic_ostream"* (%"class.std::basic_ostream"*)* @_ZSt4endlIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_)
  %call28 = call %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* @_ZSt4cout, i8* getelementptr inbounds ([14 x i8]* @.str9, i32 0, i32 0))
  %call29 = call float* @_ZNK5boost5arrayIfLj6EE5beginEv(%"class.boost::array"* @_ZZ4mainE1a)
  store float* %call29, float** %pos, align 4
  br label %for.cond

for.cond:                                         ; preds = %for.inc, %entry
  %3 = load float** %pos, align 4
  %call30 = call float* @_ZNK5boost5arrayIfLj6EE3endEv(%"class.boost::array"* @_ZZ4mainE1a)
  %cmp = icmp ult float* %3, %call30
  br i1 %cmp, label %for.body, label %for.end

for.body:                                         ; preds = %for.cond
  %4 = load float** %pos, align 4
  %5 = load float* %4, align 4
  %call31 = call %"class.std::basic_ostream"* @_ZNSolsEf(%"class.std::basic_ostream"* @_ZSt4cout, float %5)
  %call32 = call %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_c(%"class.std::basic_ostream"* %call31, i8 signext 32)
  br label %for.inc

for.inc:                                          ; preds = %for.body
  %6 = load float** %pos, align 4
  %incdec.ptr = getelementptr inbounds float* %6, i32 1
  store float* %incdec.ptr, float** %pos, align 4
  br label %for.cond

for.end:                                          ; preds = %for.cond
  %call33 = call %"class.std::basic_ostream"* @_ZNSolsEPFRSoS_E(%"class.std::basic_ostream"* @_ZSt4cout, %"class.std::basic_ostream"* (%"class.std::basic_ostream"*)* @_ZSt4endlIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_)
  call void @_Z16test_static_sizeIN5boost5arrayIfLj6EEEEvRKT_(%"class.boost::array"* @_ZZ4mainE1a)
  %7 = bitcast %"class.boost::array"* %b to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %7, i8* bitcast (%"class.boost::array"* @_ZZ4mainE1a to i8*), i32 24, i32 4, i1 false)
  %8 = bitcast %"class.boost::array"* %c to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %8, i8* bitcast (%"class.boost::array"* @_ZZ4mainE1a to i8*), i32 24, i32 4, i1 false)
  %call34 = call zeroext i1 @_ZN5boosteqIfLj6EEEbRKNS_5arrayIT_XT0_EEES5_(%"class.boost::array"* @_ZZ4mainE1a, %"class.boost::array"* %b)
  br i1 %call34, label %land.lhs.true, label %if.else

land.lhs.true:                                    ; preds = %for.end
  %call35 = call zeroext i1 @_ZN5boosteqIfLj6EEEbRKNS_5arrayIT_XT0_EEES5_(%"class.boost::array"* @_ZZ4mainE1a, %"class.boost::array"* %c)
  br i1 %call35, label %if.then, label %if.else

if.then:                                          ; preds = %land.lhs.true
  %call36 = call %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* @_ZSt4cout, i8* getelementptr inbounds ([45 x i8]* @.str10, i32 0, i32 0))
  %call37 = call %"class.std::basic_ostream"* @_ZNSolsEPFRSoS_E(%"class.std::basic_ostream"* %call36, %"class.std::basic_ostream"* (%"class.std::basic_ostream"*)* @_ZSt4endlIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_)
  br label %if.end

if.else:                                          ; preds = %land.lhs.true, %for.end
  %call38 = call %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* @_ZSt4cout, i8* getelementptr inbounds ([49 x i8]* @.str11, i32 0, i32 0))
  %call39 = call %"class.std::basic_ostream"* @_ZNSolsEPFRSoS_E(%"class.std::basic_ostream"* %call38, %"class.std::basic_ostream"* (%"class.std::basic_ostream"*)* @_ZSt4endlIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_)
  br label %if.end

if.end:                                           ; preds = %if.else, %if.then
  %9 = bitcast %"class.boost::array.0"* %ia to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %9, i8* bitcast (%"class.boost::array.0"* @_ZZ4mainE2ia to i8*), i32 24, i32 4, i1 false)
  %call40 = call %"class.boost::array.1"* @_ZN5boost5arrayIdLj6EEaSIiEERS1_RKNS0_IT_Lj6EEE(%"class.boost::array.1"* %da, %"class.boost::array.0"* %ia)
  store double 4.200000e+01, double* %ref.tmp, align 4
  call void @_ZN5boost5arrayIdLj6EE6assignERKd(%"class.boost::array.1"* %da, double* %ref.tmp)
  ret i32 0
}

declare %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"*, i8*)

declare %"class.std::basic_ostream"* @_ZNSolsEj(%"class.std::basic_ostream"*, i32)

define linkonce_odr i32 @_ZN5boost5arrayIfLj6EE4sizeEv() nounwind align 2 {
entry:
  ret i32 6
}

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

define linkonce_odr float* @_ZNK5boost5arrayIfLj6EE5frontEv(%"class.boost::array"* %this) nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::array"*, align 4
  store %"class.boost::array"* %this, %"class.boost::array"** %this.addr, align 4
  %this1 = load %"class.boost::array"** %this.addr
  %elems = getelementptr inbounds %"class.boost::array"* %this1, i32 0, i32 0
  %arrayidx = getelementptr inbounds [6 x float]* %elems, i32 0, i32 0
  ret float* %arrayidx
}

define linkonce_odr float* @_ZNK5boost5arrayIfLj6EE4backEv(%"class.boost::array"* %this) nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::array"*, align 4
  store %"class.boost::array"* %this, %"class.boost::array"** %this.addr, align 4
  %this1 = load %"class.boost::array"** %this.addr
  %elems = getelementptr inbounds %"class.boost::array"* %this1, i32 0, i32 0
  %arrayidx = getelementptr inbounds [6 x float]* %elems, i32 0, i32 5
  ret float* %arrayidx
}

define linkonce_odr float* @_ZNK5boost5arrayIfLj6EEixEj(%"class.boost::array"* %this, i32 %i) align 2 {
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
  call void @_ZN5boost9assertion6detail20assertion_failed_msgEPKcS3_S3_S3_l(i8* getelementptr inbounds ([6 x i8]* @.str12, i32 0, i32 0), i8* getelementptr inbounds ([13 x i8]* @.str13, i32 0, i32 0), i8* getelementptr inbounds ([87 x i8]* @__PRETTY_FUNCTION__._ZNK5boost5arrayIfLj6EEixEj, i32 0, i32 0), i8* getelementptr inbounds ([42 x i8]* @.str14, i32 0, i32 0), i32 129)
  br label %cond.end

cond.end:                                         ; preds = %cond.false, %cond.true
  %1 = load i32* %i.addr, align 4
  %elems = getelementptr inbounds %"class.boost::array"* %this1, i32 0, i32 0
  %arrayidx = getelementptr inbounds [6 x float]* %elems, i32 0, i32 %1
  ret float* %arrayidx
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

declare %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_c(%"class.std::basic_ostream"*, i8 signext)

define linkonce_odr void @_Z16test_static_sizeIN5boost5arrayIfLj6EEEEvRKT_(%"class.boost::array"* %cont) {
entry:
  %cont.addr = alloca %"class.boost::array"*, align 4
  %tmp = alloca [6 x i32], align 4
  %i = alloca i32, align 4
  %j = alloca i32, align 4
  store %"class.boost::array"* %cont, %"class.boost::array"** %cont.addr, align 4
  store i32 0, i32* %i, align 4
  br label %for.cond

for.cond:                                         ; preds = %for.inc, %entry
  %0 = load i32* %i, align 4
  %cmp = icmp ult i32 %0, 6
  br i1 %cmp, label %for.body, label %for.end

for.body:                                         ; preds = %for.cond
  %1 = load %"class.boost::array"** %cont.addr, align 4
  %2 = load i32* %i, align 4
  %call = call float* @_ZNK5boost5arrayIfLj6EEixEj(%"class.boost::array"* %1, i32 %2)
  %3 = load float* %call
  %conv = fptosi float %3 to i32
  %4 = load i32* %i, align 4
  %arrayidx = getelementptr inbounds [6 x i32]* %tmp, i32 0, i32 %4
  store i32 %conv, i32* %arrayidx, align 4
  br label %for.inc

for.inc:                                          ; preds = %for.body
  %5 = load i32* %i, align 4
  %inc = add i32 %5, 1
  store i32 %inc, i32* %i, align 4
  br label %for.cond

for.end:                                          ; preds = %for.cond
  store i32 0, i32* %j, align 4
  br label %for.cond3

for.cond3:                                        ; preds = %for.inc9, %for.end
  %6 = load i32* %j, align 4
  %cmp4 = icmp ult i32 %6, 6
  br i1 %cmp4, label %for.body5, label %for.end11

for.body5:                                        ; preds = %for.cond3
  %7 = load i32* %j, align 4
  %arrayidx6 = getelementptr inbounds [6 x i32]* %tmp, i32 0, i32 %7
  %8 = load i32* %arrayidx6, align 4
  %call7 = call %"class.std::basic_ostream"* @_ZNSolsEi(%"class.std::basic_ostream"* @_ZSt4cout, i32 %8)
  %call8 = call %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_c(%"class.std::basic_ostream"* %call7, i8 signext 32)
  br label %for.inc9

for.inc9:                                         ; preds = %for.body5
  %9 = load i32* %j, align 4
  %inc10 = add i32 %9, 1
  store i32 %inc10, i32* %j, align 4
  br label %for.cond3

for.end11:                                        ; preds = %for.cond3
  %call12 = call %"class.std::basic_ostream"* @_ZNSolsEPFRSoS_E(%"class.std::basic_ostream"* @_ZSt4cout, %"class.std::basic_ostream"* (%"class.std::basic_ostream"*)* @_ZSt4endlIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_)
  ret void
}

declare void @llvm.memcpy.p0i8.p0i8.i32(i8* nocapture, i8* nocapture, i32, i32, i1) nounwind

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

define linkonce_odr %"class.boost::array.1"* @_ZN5boost5arrayIdLj6EEaSIiEERS1_RKNS0_IT_Lj6EEE(%"class.boost::array.1"* %this, %"class.boost::array.0"* %rhs) align 2 {
entry:
  %this.addr = alloca %"class.boost::array.1"*, align 4
  %rhs.addr = alloca %"class.boost::array.0"*, align 4
  store %"class.boost::array.1"* %this, %"class.boost::array.1"** %this.addr, align 4
  store %"class.boost::array.0"* %rhs, %"class.boost::array.0"** %rhs.addr, align 4
  %this1 = load %"class.boost::array.1"** %this.addr
  %0 = load %"class.boost::array.0"** %rhs.addr, align 4
  %call = call i32* @_ZNK5boost5arrayIiLj6EE5beginEv(%"class.boost::array.0"* %0)
  %1 = load %"class.boost::array.0"** %rhs.addr, align 4
  %call2 = call i32* @_ZNK5boost5arrayIiLj6EE3endEv(%"class.boost::array.0"* %1)
  %call3 = call double* @_ZN5boost5arrayIdLj6EE5beginEv(%"class.boost::array.1"* %this1)
  %call4 = call double* @_ZSt4copyIPKiPdET0_T_S4_S3_(i32* %call, i32* %call2, double* %call3)
  ret %"class.boost::array.1"* %this1
}

define linkonce_odr void @_ZN5boost5arrayIdLj6EE6assignERKd(%"class.boost::array.1"* %this, double* %value) align 2 {
entry:
  %this.addr = alloca %"class.boost::array.1"*, align 4
  %value.addr = alloca double*, align 4
  store %"class.boost::array.1"* %this, %"class.boost::array.1"** %this.addr, align 4
  store double* %value, double** %value.addr, align 4
  %this1 = load %"class.boost::array.1"** %this.addr
  %0 = load double** %value.addr, align 4
  call void @_ZN5boost5arrayIdLj6EE4fillERKd(%"class.boost::array.1"* %this1, double* %0)
  ret void
}

define linkonce_odr void @_ZN5boost5arrayIdLj6EE4fillERKd(%"class.boost::array.1"* %this, double* %value) align 2 {
entry:
  %this.addr = alloca %"class.boost::array.1"*, align 4
  %value.addr = alloca double*, align 4
  store %"class.boost::array.1"* %this, %"class.boost::array.1"** %this.addr, align 4
  store double* %value, double** %value.addr, align 4
  %this1 = load %"class.boost::array.1"** %this.addr
  %call = call double* @_ZN5boost5arrayIdLj6EE5beginEv(%"class.boost::array.1"* %this1)
  %call2 = call i32 @_ZN5boost5arrayIdLj6EE4sizeEv()
  %0 = load double** %value.addr, align 4
  %call3 = call double* @_ZSt6fill_nIPdjdET_S1_T0_RKT1_(double* %call, i32 %call2, double* %0)
  ret void
}

define linkonce_odr double* @_ZSt6fill_nIPdjdET_S1_T0_RKT1_(double* %__first, i32 %__n, double* %__value) {
entry:
  %__first.addr = alloca double*, align 4
  %__n.addr = alloca i32, align 4
  %__value.addr = alloca double*, align 4
  store double* %__first, double** %__first.addr, align 4
  store i32 %__n, i32* %__n.addr, align 4
  store double* %__value, double** %__value.addr, align 4
  %0 = load double** %__first.addr, align 4
  %call = call double* @_ZSt12__niter_baseIPdENSt11_Niter_baseIT_E13iterator_typeES2_(double* %0)
  %1 = load i32* %__n.addr, align 4
  %2 = load double** %__value.addr, align 4
  %call1 = call double* @_ZSt10__fill_n_aIPdjdEN9__gnu_cxx11__enable_ifIXsr11__is_scalarIT1_EE7__valueET_E6__typeES4_T0_RKS3_(double* %call, i32 %1, double* %2)
  ret double* %call1
}

define linkonce_odr double* @_ZN5boost5arrayIdLj6EE5beginEv(%"class.boost::array.1"* %this) nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::array.1"*, align 4
  store %"class.boost::array.1"* %this, %"class.boost::array.1"** %this.addr, align 4
  %this1 = load %"class.boost::array.1"** %this.addr
  %elems = getelementptr inbounds %"class.boost::array.1"* %this1, i32 0, i32 0
  %arraydecay = getelementptr inbounds [6 x double]* %elems, i32 0, i32 0
  ret double* %arraydecay
}

define linkonce_odr i32 @_ZN5boost5arrayIdLj6EE4sizeEv() nounwind align 2 {
entry:
  ret i32 6
}

define linkonce_odr double* @_ZSt10__fill_n_aIPdjdEN9__gnu_cxx11__enable_ifIXsr11__is_scalarIT1_EE7__valueET_E6__typeES4_T0_RKS3_(double* %__first, i32 %__n, double* %__value) nounwind inlinehint {
entry:
  %__first.addr = alloca double*, align 4
  %__n.addr = alloca i32, align 4
  %__value.addr = alloca double*, align 4
  %__tmp = alloca double, align 8
  %__niter = alloca i32, align 4
  store double* %__first, double** %__first.addr, align 4
  store i32 %__n, i32* %__n.addr, align 4
  store double* %__value, double** %__value.addr, align 4
  %0 = load double** %__value.addr, align 4
  %1 = load double* %0, align 4
  store double %1, double* %__tmp, align 8
  %2 = load i32* %__n.addr, align 4
  store i32 %2, i32* %__niter, align 4
  br label %for.cond

for.cond:                                         ; preds = %for.inc, %entry
  %3 = load i32* %__niter, align 4
  %cmp = icmp ugt i32 %3, 0
  br i1 %cmp, label %for.body, label %for.end

for.body:                                         ; preds = %for.cond
  %4 = load double* %__tmp, align 8
  %5 = load double** %__first.addr, align 4
  store double %4, double* %5, align 4
  br label %for.inc

for.inc:                                          ; preds = %for.body
  %6 = load i32* %__niter, align 4
  %dec = add i32 %6, -1
  store i32 %dec, i32* %__niter, align 4
  %7 = load double** %__first.addr, align 4
  %incdec.ptr = getelementptr inbounds double* %7, i32 1
  store double* %incdec.ptr, double** %__first.addr, align 4
  br label %for.cond

for.end:                                          ; preds = %for.cond
  %8 = load double** %__first.addr, align 4
  ret double* %8
}

define linkonce_odr double* @_ZSt12__niter_baseIPdENSt11_Niter_baseIT_E13iterator_typeES2_(double* %__it) inlinehint {
entry:
  %__it.addr = alloca double*, align 4
  store double* %__it, double** %__it.addr, align 4
  %0 = load double** %__it.addr, align 4
  %call = call double* @_ZNSt10_Iter_baseIPdLb0EE7_S_baseES0_(double* %0)
  ret double* %call
}

define linkonce_odr double* @_ZNSt10_Iter_baseIPdLb0EE7_S_baseES0_(double* %__it) nounwind align 2 {
entry:
  %__it.addr = alloca double*, align 4
  store double* %__it, double** %__it.addr, align 4
  %0 = load double** %__it.addr, align 4
  ret double* %0
}

define linkonce_odr double* @_ZSt4copyIPKiPdET0_T_S4_S3_(i32* %__first, i32* %__last, double* %__result) {
entry:
  %__first.addr = alloca i32*, align 4
  %__last.addr = alloca i32*, align 4
  %__result.addr = alloca double*, align 4
  store i32* %__first, i32** %__first.addr, align 4
  store i32* %__last, i32** %__last.addr, align 4
  store double* %__result, double** %__result.addr, align 4
  %0 = load i32** %__first.addr, align 4
  %call = call i32* @_ZSt12__miter_baseIPKiENSt11_Miter_baseIT_E13iterator_typeES3_(i32* %0)
  %1 = load i32** %__last.addr, align 4
  %call1 = call i32* @_ZSt12__miter_baseIPKiENSt11_Miter_baseIT_E13iterator_typeES3_(i32* %1)
  %2 = load double** %__result.addr, align 4
  %call2 = call double* @_ZSt14__copy_move_a2ILb0EPKiPdET1_T0_S4_S3_(i32* %call, i32* %call1, double* %2)
  ret double* %call2
}

define linkonce_odr i32* @_ZNK5boost5arrayIiLj6EE5beginEv(%"class.boost::array.0"* %this) nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::array.0"*, align 4
  store %"class.boost::array.0"* %this, %"class.boost::array.0"** %this.addr, align 4
  %this1 = load %"class.boost::array.0"** %this.addr
  %elems = getelementptr inbounds %"class.boost::array.0"* %this1, i32 0, i32 0
  %arraydecay = getelementptr inbounds [6 x i32]* %elems, i32 0, i32 0
  ret i32* %arraydecay
}

define linkonce_odr i32* @_ZNK5boost5arrayIiLj6EE3endEv(%"class.boost::array.0"* %this) nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::array.0"*, align 4
  store %"class.boost::array.0"* %this, %"class.boost::array.0"** %this.addr, align 4
  %this1 = load %"class.boost::array.0"** %this.addr
  %elems = getelementptr inbounds %"class.boost::array.0"* %this1, i32 0, i32 0
  %arraydecay = getelementptr inbounds [6 x i32]* %elems, i32 0, i32 0
  %add.ptr = getelementptr inbounds i32* %arraydecay, i32 6
  ret i32* %add.ptr
}

define linkonce_odr double* @_ZSt14__copy_move_a2ILb0EPKiPdET1_T0_S4_S3_(i32* %__first, i32* %__last, double* %__result) inlinehint {
entry:
  %__first.addr = alloca i32*, align 4
  %__last.addr = alloca i32*, align 4
  %__result.addr = alloca double*, align 4
  store i32* %__first, i32** %__first.addr, align 4
  store i32* %__last, i32** %__last.addr, align 4
  store double* %__result, double** %__result.addr, align 4
  %0 = load i32** %__first.addr, align 4
  %call = call i32* @_ZSt12__niter_baseIPKiENSt11_Niter_baseIT_E13iterator_typeES3_(i32* %0)
  %1 = load i32** %__last.addr, align 4
  %call1 = call i32* @_ZSt12__niter_baseIPKiENSt11_Niter_baseIT_E13iterator_typeES3_(i32* %1)
  %2 = load double** %__result.addr, align 4
  %call2 = call double* @_ZSt12__niter_baseIPdENSt11_Niter_baseIT_E13iterator_typeES2_(double* %2)
  %call3 = call double* @_ZSt13__copy_move_aILb0EPKiPdET1_T0_S4_S3_(i32* %call, i32* %call1, double* %call2)
  ret double* %call3
}

define linkonce_odr i32* @_ZSt12__miter_baseIPKiENSt11_Miter_baseIT_E13iterator_typeES3_(i32* %__it) inlinehint {
entry:
  %__it.addr = alloca i32*, align 4
  store i32* %__it, i32** %__it.addr, align 4
  %0 = load i32** %__it.addr, align 4
  %call = call i32* @_ZNSt10_Iter_baseIPKiLb0EE7_S_baseES1_(i32* %0)
  ret i32* %call
}

define linkonce_odr i32* @_ZNSt10_Iter_baseIPKiLb0EE7_S_baseES1_(i32* %__it) nounwind align 2 {
entry:
  %__it.addr = alloca i32*, align 4
  store i32* %__it, i32** %__it.addr, align 4
  %0 = load i32** %__it.addr, align 4
  ret i32* %0
}

define linkonce_odr double* @_ZSt13__copy_move_aILb0EPKiPdET1_T0_S4_S3_(i32* %__first, i32* %__last, double* %__result) inlinehint {
entry:
  %__first.addr = alloca i32*, align 4
  %__last.addr = alloca i32*, align 4
  %__result.addr = alloca double*, align 4
  %__simple = alloca i8, align 1
  store i32* %__first, i32** %__first.addr, align 4
  store i32* %__last, i32** %__last.addr, align 4
  store double* %__result, double** %__result.addr, align 4
  store i8 0, i8* %__simple, align 1
  %0 = load i32** %__first.addr, align 4
  %1 = load i32** %__last.addr, align 4
  %2 = load double** %__result.addr, align 4
  %call = call double* @_ZNSt11__copy_moveILb0ELb0ESt26random_access_iterator_tagE8__copy_mIPKiPdEET0_T_S7_S6_(i32* %0, i32* %1, double* %2)
  ret double* %call
}

define linkonce_odr i32* @_ZSt12__niter_baseIPKiENSt11_Niter_baseIT_E13iterator_typeES3_(i32* %__it) nounwind inlinehint {
entry:
  %__it.addr = alloca i32*, align 4
  store i32* %__it, i32** %__it.addr, align 4
  %0 = load i32** %__it.addr, align 4
  %call = call i32* @_ZNSt10_Iter_baseIPKiLb0EE7_S_baseES1_(i32* %0)
  ret i32* %call
}

define linkonce_odr double* @_ZNSt11__copy_moveILb0ELb0ESt26random_access_iterator_tagE8__copy_mIPKiPdEET0_T_S7_S6_(i32* %__first, i32* %__last, double* %__result) nounwind align 2 {
entry:
  %__first.addr = alloca i32*, align 4
  %__last.addr = alloca i32*, align 4
  %__result.addr = alloca double*, align 4
  %__n = alloca i32, align 4
  store i32* %__first, i32** %__first.addr, align 4
  store i32* %__last, i32** %__last.addr, align 4
  store double* %__result, double** %__result.addr, align 4
  %0 = load i32** %__last.addr, align 4
  %1 = load i32** %__first.addr, align 4
  %sub.ptr.lhs.cast = ptrtoint i32* %0 to i32
  %sub.ptr.rhs.cast = ptrtoint i32* %1 to i32
  %sub.ptr.sub = sub i32 %sub.ptr.lhs.cast, %sub.ptr.rhs.cast
  %sub.ptr.div = sdiv exact i32 %sub.ptr.sub, 4
  store i32 %sub.ptr.div, i32* %__n, align 4
  br label %for.cond

for.cond:                                         ; preds = %for.inc, %entry
  %2 = load i32* %__n, align 4
  %cmp = icmp sgt i32 %2, 0
  br i1 %cmp, label %for.body, label %for.end

for.body:                                         ; preds = %for.cond
  %3 = load i32** %__first.addr, align 4
  %4 = load i32* %3, align 4
  %conv = sitofp i32 %4 to double
  %5 = load double** %__result.addr, align 4
  store double %conv, double* %5, align 4
  %6 = load i32** %__first.addr, align 4
  %incdec.ptr = getelementptr inbounds i32* %6, i32 1
  store i32* %incdec.ptr, i32** %__first.addr, align 4
  %7 = load double** %__result.addr, align 4
  %incdec.ptr1 = getelementptr inbounds double* %7, i32 1
  store double* %incdec.ptr1, double** %__result.addr, align 4
  br label %for.inc

for.inc:                                          ; preds = %for.body
  %8 = load i32* %__n, align 4
  %dec = add nsw i32 %8, -1
  store i32 %dec, i32* %__n, align 4
  br label %for.cond

for.end:                                          ; preds = %for.cond
  %9 = load double** %__result.addr, align 4
  ret double* %9
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

declare %"class.std::basic_ostream"* @_ZNSolsEi(%"class.std::basic_ostream"*, i32)

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
  %call = call %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* @_ZSt4cerr, i8* getelementptr inbounds ([43 x i8]* @.str15, i32 0, i32 0))
  %0 = load i8** %expr.addr, align 4
  %call1 = call %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* %call, i8* %0)
  %call2 = call %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* %call1, i8* getelementptr inbounds ([13 x i8]* @.str16, i32 0, i32 0))
  %1 = load i8** %function.addr, align 4
  %call3 = call %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* %call2, i8* %1)
  %call4 = call %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* %call3, i8* getelementptr inbounds ([3 x i8]* @.str17, i32 0, i32 0))
  %2 = load i8** %file.addr, align 4
  %call5 = call %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* %call4, i8* %2)
  %call6 = call %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_c(%"class.std::basic_ostream"* %call5, i8 signext 40)
  %3 = load i32* %line.addr, align 4
  %call7 = call %"class.std::basic_ostream"* @_ZNSolsEl(%"class.std::basic_ostream"* %call6, i32 %3)
  %call8 = call %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* %call7, i8* getelementptr inbounds ([4 x i8]* @.str18, i32 0, i32 0))
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
