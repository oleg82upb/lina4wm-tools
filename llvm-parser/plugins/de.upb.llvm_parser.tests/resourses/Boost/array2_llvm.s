; ModuleID = 'array2.cpp'
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
%"class.boost::array" = type { [10 x i32] }
%"struct.std::negate" = type { i8 }
%"struct.std::random_access_iterator_tag" = type { i8 }

@_ZStL8__ioinit = internal global %"class.std::ios_base::Init" zeroinitializer, align 1
@__dso_handle = external global i8
@.str = private unnamed_addr constant [1 x i8] zeroinitializer, align 1
@.str1 = private unnamed_addr constant [6 x i8] c"i < N\00", align 1
@.str2 = private unnamed_addr constant [13 x i8] c"out of range\00", align 1
@__PRETTY_FUNCTION__._ZN5boost5arrayIiLj10EEixEj = private unnamed_addr constant [73 x i8] c"reference boost::array<int, 10>::operator[](size_type) [T = int, N = 10]\00", align 1
@.str3 = private unnamed_addr constant [42 x i8] c"/home/thomas/boost_1_52_0/boost/array.hpp\00", align 1
@_ZSt4cerr = external global %"class.std::basic_ostream"
@.str4 = private unnamed_addr constant [43 x i8] c"***** Internal Program Error - assertion (\00", align 1
@.str5 = private unnamed_addr constant [13 x i8] c") failed in \00", align 1
@.str6 = private unnamed_addr constant [3 x i8] c":\0A\00", align 1
@.str7 = private unnamed_addr constant [4 x i8] c"): \00", align 1
@_ZSt4cout = external global %"class.std::basic_ostream"
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
  %agg.tmp = alloca %"struct.std::negate", align 1
  store i32 0, i32* %retval
  %0 = bitcast %"class.boost::array"* %a to i8*
  call void @llvm.memset.p0i8.i32(i8* %0, i8 0, i32 40, i32 4, i1 false)
  %1 = bitcast i8* %0 to %"class.boost::array"*
  %2 = getelementptr %"class.boost::array"* %1, i32 0, i32 0
  %3 = getelementptr [10 x i32]* %2, i32 0, i32 0
  store i32 1, i32* %3
  %4 = getelementptr [10 x i32]* %2, i32 0, i32 1
  store i32 2, i32* %4
  %5 = getelementptr [10 x i32]* %2, i32 0, i32 2
  store i32 3, i32* %5
  %6 = getelementptr [10 x i32]* %2, i32 0, i32 3
  store i32 4, i32* %6
  %7 = getelementptr [10 x i32]* %2, i32 0, i32 4
  store i32 5, i32* %7
  call void @_Z14print_elementsIN5boost5arrayIiLj10EEEEvRKT_PKc(%"class.boost::array"* %a, i8* getelementptr inbounds ([1 x i8]* @.str, i32 0, i32 0))
  store i32 0, i32* %i, align 4
  br label %for.cond

for.cond:                                         ; preds = %for.inc, %entry
  %8 = load i32* %i, align 4
  %call = call i32 @_ZN5boost5arrayIiLj10EE4sizeEv()
  %cmp = icmp ult i32 %8, %call
  br i1 %cmp, label %for.body, label %for.end

for.body:                                         ; preds = %for.cond
  %9 = load i32* %i, align 4
  %call1 = call i32* @_ZN5boost5arrayIiLj10EEixEj(%"class.boost::array"* %a, i32 %9)
  %10 = load i32* %call1
  %inc = add nsw i32 %10, 1
  store i32 %inc, i32* %call1
  br label %for.inc

for.inc:                                          ; preds = %for.body
  %11 = load i32* %i, align 4
  %inc2 = add i32 %11, 1
  store i32 %inc2, i32* %i, align 4
  br label %for.cond

for.end:                                          ; preds = %for.cond
  call void @_Z14print_elementsIN5boost5arrayIiLj10EEEEvRKT_PKc(%"class.boost::array"* %a, i8* getelementptr inbounds ([1 x i8]* @.str, i32 0, i32 0))
  %call3 = call i32* @_ZN5boost5arrayIiLj10EE5beginEv(%"class.boost::array"* %a)
  %call4 = call i32* @_ZN5boost5arrayIiLj10EE3endEv(%"class.boost::array"* %a)
  call void @_ZSt7reverseIPiEvT_S1_(i32* %call3, i32* %call4)
  call void @_Z14print_elementsIN5boost5arrayIiLj10EEEEvRKT_PKc(%"class.boost::array"* %a, i8* getelementptr inbounds ([1 x i8]* @.str, i32 0, i32 0))
  %call5 = call i32* @_ZN5boost5arrayIiLj10EE5beginEv(%"class.boost::array"* %a)
  %call6 = call i32* @_ZN5boost5arrayIiLj10EE3endEv(%"class.boost::array"* %a)
  %call7 = call i32* @_ZN5boost5arrayIiLj10EE5beginEv(%"class.boost::array"* %a)
  %call8 = call i32* @_ZSt9transformIPiS0_St6negateIiEET0_T_S4_S3_T1_(i32* %call5, i32* %call6, i32* %call7)
  call void @_Z14print_elementsIN5boost5arrayIiLj10EEEEvRKT_PKc(%"class.boost::array"* %a, i8* getelementptr inbounds ([1 x i8]* @.str, i32 0, i32 0))
  ret i32 0
}

declare void @llvm.memset.p0i8.i32(i8* nocapture, i8, i32, i32, i1) nounwind

define linkonce_odr void @_Z14print_elementsIN5boost5arrayIiLj10EEEEvRKT_PKc(%"class.boost::array"* %coll, i8* %optcstr) inlinehint {
entry:
  %coll.addr = alloca %"class.boost::array"*, align 4
  %optcstr.addr = alloca i8*, align 4
  %pos = alloca i32*, align 4
  store %"class.boost::array"* %coll, %"class.boost::array"** %coll.addr, align 4
  store i8* %optcstr, i8** %optcstr.addr, align 4
  %0 = load i8** %optcstr.addr, align 4
  %call = call %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* @_ZSt4cout, i8* %0)
  %1 = load %"class.boost::array"** %coll.addr, align 4
  %call1 = call i32* @_ZNK5boost5arrayIiLj10EE5beginEv(%"class.boost::array"* %1)
  store i32* %call1, i32** %pos, align 4
  br label %for.cond

for.cond:                                         ; preds = %for.inc, %entry
  %2 = load i32** %pos, align 4
  %3 = load %"class.boost::array"** %coll.addr, align 4
  %call2 = call i32* @_ZNK5boost5arrayIiLj10EE3endEv(%"class.boost::array"* %3)
  %cmp = icmp ne i32* %2, %call2
  br i1 %cmp, label %for.body, label %for.end

for.body:                                         ; preds = %for.cond
  %4 = load i32** %pos, align 4
  %5 = load i32* %4, align 4
  %call3 = call %"class.std::basic_ostream"* @_ZNSolsEi(%"class.std::basic_ostream"* @_ZSt4cout, i32 %5)
  %call4 = call %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_c(%"class.std::basic_ostream"* %call3, i8 signext 32)
  br label %for.inc

for.inc:                                          ; preds = %for.body
  %6 = load i32** %pos, align 4
  %incdec.ptr = getelementptr inbounds i32* %6, i32 1
  store i32* %incdec.ptr, i32** %pos, align 4
  br label %for.cond

for.end:                                          ; preds = %for.cond
  %call5 = call %"class.std::basic_ostream"* @_ZNSolsEPFRSoS_E(%"class.std::basic_ostream"* @_ZSt4cout, %"class.std::basic_ostream"* (%"class.std::basic_ostream"*)* @_ZSt4endlIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_)
  ret void
}

define linkonce_odr i32 @_ZN5boost5arrayIiLj10EE4sizeEv() nounwind align 2 {
entry:
  ret i32 10
}

define linkonce_odr i32* @_ZN5boost5arrayIiLj10EEixEj(%"class.boost::array"* %this, i32 %i) align 2 {
entry:
  %this.addr = alloca %"class.boost::array"*, align 4
  %i.addr = alloca i32, align 4
  store %"class.boost::array"* %this, %"class.boost::array"** %this.addr, align 4
  store i32 %i, i32* %i.addr, align 4
  %this1 = load %"class.boost::array"** %this.addr
  %0 = load i32* %i.addr, align 4
  %cmp = icmp ult i32 %0, 10
  br i1 %cmp, label %cond.true, label %cond.false

cond.true:                                        ; preds = %entry
  br label %cond.end

cond.false:                                       ; preds = %entry
  call void @_ZN5boost9assertion6detail20assertion_failed_msgEPKcS3_S3_S3_l(i8* getelementptr inbounds ([6 x i8]* @.str1, i32 0, i32 0), i8* getelementptr inbounds ([13 x i8]* @.str2, i32 0, i32 0), i8* getelementptr inbounds ([73 x i8]* @__PRETTY_FUNCTION__._ZN5boost5arrayIiLj10EEixEj, i32 0, i32 0), i8* getelementptr inbounds ([42 x i8]* @.str3, i32 0, i32 0), i32 123)
  br label %cond.end

cond.end:                                         ; preds = %cond.false, %cond.true
  %1 = load i32* %i.addr, align 4
  %elems = getelementptr inbounds %"class.boost::array"* %this1, i32 0, i32 0
  %arrayidx = getelementptr inbounds [10 x i32]* %elems, i32 0, i32 %1
  ret i32* %arrayidx
}

define linkonce_odr void @_ZSt7reverseIPiEvT_S1_(i32* %__first, i32* %__last) inlinehint {
entry:
  %__first.addr = alloca i32*, align 4
  %__last.addr = alloca i32*, align 4
  %agg.tmp = alloca %"struct.std::random_access_iterator_tag", align 1
  store i32* %__first, i32** %__first.addr, align 4
  store i32* %__last, i32** %__last.addr, align 4
  %0 = load i32** %__first.addr, align 4
  %1 = load i32** %__last.addr, align 4
  call void @_ZSt19__iterator_categoryIPiENSt15iterator_traitsIT_E17iterator_categoryERKS2_(%"struct.std::random_access_iterator_tag"* sret %agg.tmp, i32** %__first.addr)
  call void @_ZSt9__reverseIPiEvT_S1_St26random_access_iterator_tag(i32* %0, i32* %1)
  ret void
}

define linkonce_odr i32* @_ZN5boost5arrayIiLj10EE5beginEv(%"class.boost::array"* %this) nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::array"*, align 4
  store %"class.boost::array"* %this, %"class.boost::array"** %this.addr, align 4
  %this1 = load %"class.boost::array"** %this.addr
  %elems = getelementptr inbounds %"class.boost::array"* %this1, i32 0, i32 0
  %arraydecay = getelementptr inbounds [10 x i32]* %elems, i32 0, i32 0
  ret i32* %arraydecay
}

define linkonce_odr i32* @_ZN5boost5arrayIiLj10EE3endEv(%"class.boost::array"* %this) nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::array"*, align 4
  store %"class.boost::array"* %this, %"class.boost::array"** %this.addr, align 4
  %this1 = load %"class.boost::array"** %this.addr
  %elems = getelementptr inbounds %"class.boost::array"* %this1, i32 0, i32 0
  %arraydecay = getelementptr inbounds [10 x i32]* %elems, i32 0, i32 0
  %add.ptr = getelementptr inbounds i32* %arraydecay, i32 10
  ret i32* %add.ptr
}

define linkonce_odr i32* @_ZSt9transformIPiS0_St6negateIiEET0_T_S4_S3_T1_(i32* %__first, i32* %__last, i32* %__result) {
entry:
  %__first.addr = alloca i32*, align 4
  %__last.addr = alloca i32*, align 4
  %__result.addr = alloca i32*, align 4
  %__unary_op = alloca %"struct.std::negate", align 1
  store i32* %__first, i32** %__first.addr, align 4
  store i32* %__last, i32** %__last.addr, align 4
  store i32* %__result, i32** %__result.addr, align 4
  br label %for.cond

for.cond:                                         ; preds = %for.inc, %entry
  %0 = load i32** %__first.addr, align 4
  %1 = load i32** %__last.addr, align 4
  %cmp = icmp ne i32* %0, %1
  br i1 %cmp, label %for.body, label %for.end

for.body:                                         ; preds = %for.cond
  %2 = load i32** %__first.addr, align 4
  %call = call i32 @_ZNKSt6negateIiEclERKi(%"struct.std::negate"* %__unary_op, i32* %2)
  %3 = load i32** %__result.addr, align 4
  store i32 %call, i32* %3, align 4
  br label %for.inc

for.inc:                                          ; preds = %for.body
  %4 = load i32** %__first.addr, align 4
  %incdec.ptr = getelementptr inbounds i32* %4, i32 1
  store i32* %incdec.ptr, i32** %__first.addr, align 4
  %5 = load i32** %__result.addr, align 4
  %incdec.ptr1 = getelementptr inbounds i32* %5, i32 1
  store i32* %incdec.ptr1, i32** %__result.addr, align 4
  br label %for.cond

for.end:                                          ; preds = %for.cond
  %6 = load i32** %__result.addr, align 4
  ret i32* %6
}

define linkonce_odr i32 @_ZNKSt6negateIiEclERKi(%"struct.std::negate"* %this, i32* %__x) nounwind align 2 {
entry:
  %this.addr = alloca %"struct.std::negate"*, align 4
  %__x.addr = alloca i32*, align 4
  store %"struct.std::negate"* %this, %"struct.std::negate"** %this.addr, align 4
  store i32* %__x, i32** %__x.addr, align 4
  %this1 = load %"struct.std::negate"** %this.addr
  %0 = load i32** %__x.addr, align 4
  %1 = load i32* %0, align 4
  %sub = sub nsw i32 0, %1
  ret i32 %sub
}

define linkonce_odr void @_ZSt9__reverseIPiEvT_S1_St26random_access_iterator_tag(i32* %__first, i32* %__last) {
entry:
  %__first.addr = alloca i32*, align 4
  %__last.addr = alloca i32*, align 4
  %0 = alloca %"struct.std::random_access_iterator_tag", align 1
  store i32* %__first, i32** %__first.addr, align 4
  store i32* %__last, i32** %__last.addr, align 4
  %1 = load i32** %__first.addr, align 4
  %2 = load i32** %__last.addr, align 4
  %cmp = icmp eq i32* %1, %2
  br i1 %cmp, label %if.then, label %if.end

if.then:                                          ; preds = %entry
  br label %while.end

if.end:                                           ; preds = %entry
  %3 = load i32** %__last.addr, align 4
  %incdec.ptr = getelementptr inbounds i32* %3, i32 -1
  store i32* %incdec.ptr, i32** %__last.addr, align 4
  br label %while.cond

while.cond:                                       ; preds = %while.body, %if.end
  %4 = load i32** %__first.addr, align 4
  %5 = load i32** %__last.addr, align 4
  %cmp1 = icmp ult i32* %4, %5
  br i1 %cmp1, label %while.body, label %while.end

while.body:                                       ; preds = %while.cond
  %6 = load i32** %__first.addr, align 4
  %7 = load i32** %__last.addr, align 4
  call void @_ZSt9iter_swapIPiS0_EvT_T0_(i32* %6, i32* %7)
  %8 = load i32** %__first.addr, align 4
  %incdec.ptr2 = getelementptr inbounds i32* %8, i32 1
  store i32* %incdec.ptr2, i32** %__first.addr, align 4
  %9 = load i32** %__last.addr, align 4
  %incdec.ptr3 = getelementptr inbounds i32* %9, i32 -1
  store i32* %incdec.ptr3, i32** %__last.addr, align 4
  br label %while.cond

while.end:                                        ; preds = %if.then, %while.cond
  ret void
}

define linkonce_odr void @_ZSt19__iterator_categoryIPiENSt15iterator_traitsIT_E17iterator_categoryERKS2_(%"struct.std::random_access_iterator_tag"* noalias sret %agg.result, i32**) nounwind inlinehint {
entry:
  %.addr = alloca i32**, align 4
  store i32** %0, i32*** %.addr, align 4
  ret void
}

define linkonce_odr void @_ZSt9iter_swapIPiS0_EvT_T0_(i32* %__a, i32* %__b) {
entry:
  %__a.addr = alloca i32*, align 4
  %__b.addr = alloca i32*, align 4
  store i32* %__a, i32** %__a.addr, align 4
  store i32* %__b, i32** %__b.addr, align 4
  %0 = load i32** %__a.addr, align 4
  %1 = load i32** %__b.addr, align 4
  call void @_ZNSt11__iter_swapILb1EE9iter_swapIPiS2_EEvT_T0_(i32* %0, i32* %1)
  ret void
}

define linkonce_odr void @_ZNSt11__iter_swapILb1EE9iter_swapIPiS2_EEvT_T0_(i32* %__a, i32* %__b) align 2 {
entry:
  %__a.addr = alloca i32*, align 4
  %__b.addr = alloca i32*, align 4
  store i32* %__a, i32** %__a.addr, align 4
  store i32* %__b, i32** %__b.addr, align 4
  %0 = load i32** %__a.addr, align 4
  %1 = load i32** %__b.addr, align 4
  call void @_ZSt4swapIiEvRT_S1_(i32* %0, i32* %1)
  ret void
}

define linkonce_odr void @_ZSt4swapIiEvRT_S1_(i32* %__a, i32* %__b) nounwind inlinehint {
entry:
  %__a.addr = alloca i32*, align 4
  %__b.addr = alloca i32*, align 4
  %__tmp = alloca i32, align 4
  store i32* %__a, i32** %__a.addr, align 4
  store i32* %__b, i32** %__b.addr, align 4
  %0 = load i32** %__a.addr, align 4
  %1 = load i32* %0, align 4
  store i32 %1, i32* %__tmp, align 4
  %2 = load i32** %__b.addr, align 4
  %3 = load i32* %2, align 4
  %4 = load i32** %__a.addr, align 4
  store i32 %3, i32* %4, align 4
  %5 = load i32* %__tmp, align 4
  %6 = load i32** %__b.addr, align 4
  store i32 %5, i32* %6, align 4
  ret void
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
  %call = call %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* @_ZSt4cerr, i8* getelementptr inbounds ([43 x i8]* @.str4, i32 0, i32 0))
  %0 = load i8** %expr.addr, align 4
  %call1 = call %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* %call, i8* %0)
  %call2 = call %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* %call1, i8* getelementptr inbounds ([13 x i8]* @.str5, i32 0, i32 0))
  %1 = load i8** %function.addr, align 4
  %call3 = call %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* %call2, i8* %1)
  %call4 = call %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* %call3, i8* getelementptr inbounds ([3 x i8]* @.str6, i32 0, i32 0))
  %2 = load i8** %file.addr, align 4
  %call5 = call %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* %call4, i8* %2)
  %call6 = call %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_c(%"class.std::basic_ostream"* %call5, i8 signext 40)
  %3 = load i32* %line.addr, align 4
  %call7 = call %"class.std::basic_ostream"* @_ZNSolsEl(%"class.std::basic_ostream"* %call6, i32 %3)
  %call8 = call %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* %call7, i8* getelementptr inbounds ([4 x i8]* @.str7, i32 0, i32 0))
  %4 = load i8** %msg.addr, align 4
  %call9 = call %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* %call8, i8* %4)
  %call10 = call %"class.std::basic_ostream"* @_ZNSolsEPFRSoS_E(%"class.std::basic_ostream"* %call9, %"class.std::basic_ostream"* (%"class.std::basic_ostream"*)* @_ZSt4endlIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_)
  call void @abort() noreturn nounwind
  unreachable

return:                                           ; No predecessors!
  ret void
}

declare %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"*, i8*)

declare %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_c(%"class.std::basic_ostream"*, i8 signext)

declare %"class.std::basic_ostream"* @_ZNSolsEl(%"class.std::basic_ostream"*, i32)

declare %"class.std::basic_ostream"* @_ZNSolsEPFRSoS_E(%"class.std::basic_ostream"*, %"class.std::basic_ostream"* (%"class.std::basic_ostream"*)*)

declare %"class.std::basic_ostream"* @_ZSt4endlIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_(%"class.std::basic_ostream"*)

declare void @abort() noreturn nounwind

define linkonce_odr i32* @_ZNK5boost5arrayIiLj10EE5beginEv(%"class.boost::array"* %this) nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::array"*, align 4
  store %"class.boost::array"* %this, %"class.boost::array"** %this.addr, align 4
  %this1 = load %"class.boost::array"** %this.addr
  %elems = getelementptr inbounds %"class.boost::array"* %this1, i32 0, i32 0
  %arraydecay = getelementptr inbounds [10 x i32]* %elems, i32 0, i32 0
  ret i32* %arraydecay
}

define linkonce_odr i32* @_ZNK5boost5arrayIiLj10EE3endEv(%"class.boost::array"* %this) nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::array"*, align 4
  store %"class.boost::array"* %this, %"class.boost::array"** %this.addr, align 4
  %this1 = load %"class.boost::array"** %this.addr
  %elems = getelementptr inbounds %"class.boost::array"* %this1, i32 0, i32 0
  %arraydecay = getelementptr inbounds [10 x i32]* %elems, i32 0, i32 0
  %add.ptr = getelementptr inbounds i32* %arraydecay, i32 10
  ret i32* %add.ptr
}

declare %"class.std::basic_ostream"* @_ZNSolsEi(%"class.std::basic_ostream"*, i32)

define internal void @_GLOBAL__I_a() section ".text.startup" {
entry:
  call void @__cxx_global_var_init()
  ret void
}
