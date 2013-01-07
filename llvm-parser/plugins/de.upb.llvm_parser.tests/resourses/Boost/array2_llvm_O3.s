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

@_ZStL8__ioinit = internal global %"class.std::ios_base::Init" zeroinitializer, align 1
@__dso_handle = external global i8
@.str = private unnamed_addr constant [1 x i8] zeroinitializer, align 1
@_ZSt4cout = external global %"class.std::basic_ostream"
@llvm.global_ctors = appending global [1 x { i32, void ()* }] [{ i32, void ()* } { i32 65535, void ()* @_GLOBAL__I_a }]

declare void @_ZNSt8ios_base4InitC1Ev(%"class.std::ios_base::Init"*)

declare void @_ZNSt8ios_base4InitD1Ev(%"class.std::ios_base::Init"*)

declare i32 @__cxa_atexit(void (i8*)*, i8*, i8*) nounwind

define i32 @main() {
entry:
  %a = alloca %"class.boost::array", align 4
  %0 = bitcast %"class.boost::array"* %a to i8*
  call void @llvm.memset.p0i8.i32(i8* %0, i8 0, i32 40, i32 4, i1 false)
  %1 = getelementptr %"class.boost::array"* %a, i32 0, i32 0, i32 0
  store i32 1, i32* %1, align 4
  %2 = getelementptr %"class.boost::array"* %a, i32 0, i32 0, i32 1
  store i32 2, i32* %2, align 4
  %3 = getelementptr %"class.boost::array"* %a, i32 0, i32 0, i32 2
  store i32 3, i32* %3, align 4
  %4 = getelementptr %"class.boost::array"* %a, i32 0, i32 0, i32 3
  store i32 4, i32* %4, align 4
  %5 = getelementptr %"class.boost::array"* %a, i32 0, i32 0, i32 4
  store i32 5, i32* %5, align 4
  call void @_Z14print_elementsIN5boost5arrayIiLj10EEEEvRKT_PKc(%"class.boost::array"* %a, i8* getelementptr inbounds ([1 x i8]* @.str, i32 0, i32 0))
  %6 = load i32* %1, align 4, !tbaa !0
  %inc = add nsw i32 %6, 1
  store i32 %inc, i32* %1, align 4, !tbaa !0
  %7 = load i32* %2, align 4, !tbaa !0
  %inc.1 = add nsw i32 %7, 1
  store i32 %inc.1, i32* %2, align 4, !tbaa !0
  %8 = load i32* %3, align 4, !tbaa !0
  %inc.2 = add nsw i32 %8, 1
  store i32 %inc.2, i32* %3, align 4, !tbaa !0
  %9 = load i32* %4, align 4, !tbaa !0
  %inc.3 = add nsw i32 %9, 1
  store i32 %inc.3, i32* %4, align 4, !tbaa !0
  %10 = load i32* %5, align 4, !tbaa !0
  %inc.4 = add nsw i32 %10, 1
  store i32 %inc.4, i32* %5, align 4, !tbaa !0
  %arrayidx.i.5 = getelementptr inbounds %"class.boost::array"* %a, i32 0, i32 0, i32 5
  %11 = load i32* %arrayidx.i.5, align 4, !tbaa !0
  %inc.5 = add nsw i32 %11, 1
  store i32 %inc.5, i32* %arrayidx.i.5, align 4, !tbaa !0
  %arrayidx.i.6 = getelementptr inbounds %"class.boost::array"* %a, i32 0, i32 0, i32 6
  %12 = load i32* %arrayidx.i.6, align 4, !tbaa !0
  %inc.6 = add nsw i32 %12, 1
  store i32 %inc.6, i32* %arrayidx.i.6, align 4, !tbaa !0
  %arrayidx.i.7 = getelementptr inbounds %"class.boost::array"* %a, i32 0, i32 0, i32 7
  %13 = load i32* %arrayidx.i.7, align 4, !tbaa !0
  %inc.7 = add nsw i32 %13, 1
  store i32 %inc.7, i32* %arrayidx.i.7, align 4, !tbaa !0
  %arrayidx.i.8 = getelementptr inbounds %"class.boost::array"* %a, i32 0, i32 0, i32 8
  %14 = load i32* %arrayidx.i.8, align 4, !tbaa !0
  %inc.8 = add nsw i32 %14, 1
  store i32 %inc.8, i32* %arrayidx.i.8, align 4, !tbaa !0
  %arrayidx.i.9 = getelementptr inbounds %"class.boost::array"* %a, i32 0, i32 0, i32 9
  %15 = load i32* %arrayidx.i.9, align 4, !tbaa !0
  %inc.9 = add nsw i32 %15, 1
  store i32 %inc.9, i32* %arrayidx.i.9, align 4, !tbaa !0
  call void @_Z14print_elementsIN5boost5arrayIiLj10EEEEvRKT_PKc(%"class.boost::array"* %a, i8* getelementptr inbounds ([1 x i8]* @.str, i32 0, i32 0))
  br label %while.body.i.i

while.body.i.i:                                   ; preds = %while.body.i.i, %entry
  %__last.addr.014.i.i = phi i32* [ %__last.addr.0.i.i, %while.body.i.i ], [ %arrayidx.i.9, %entry ]
  %__first.addr.013.i.i = phi i32* [ %incdec.ptr2.i.i, %while.body.i.i ], [ %1, %entry ]
  %16 = load i32* %__first.addr.013.i.i, align 4, !tbaa !0
  %17 = load i32* %__last.addr.014.i.i, align 4, !tbaa !0
  store i32 %17, i32* %__first.addr.013.i.i, align 4, !tbaa !0
  store i32 %16, i32* %__last.addr.014.i.i, align 4, !tbaa !0
  %incdec.ptr2.i.i = getelementptr inbounds i32* %__first.addr.013.i.i, i32 1
  %__last.addr.0.i.i = getelementptr inbounds i32* %__last.addr.014.i.i, i32 -1
  %cmp1.i.i = icmp ult i32* %incdec.ptr2.i.i, %__last.addr.0.i.i
  br i1 %cmp1.i.i, label %while.body.i.i, label %for.body.lr.ph.i

for.body.lr.ph.i:                                 ; preds = %while.body.i.i
  call void @_Z14print_elementsIN5boost5arrayIiLj10EEEEvRKT_PKc(%"class.boost::array"* %a, i8* getelementptr inbounds ([1 x i8]* @.str, i32 0, i32 0))
  %18 = load i32* %1, align 4, !tbaa !0
  %sub.i.i = sub nsw i32 0, %18
  store i32 %sub.i.i, i32* %1, align 4, !tbaa !0
  %incdec.ptr1.i = getelementptr %"class.boost::array"* %a, i32 0, i32 0, i32 1
  %19 = load i32* %incdec.ptr1.i, align 4, !tbaa !0
  %sub.i.i.1 = sub nsw i32 0, %19
  store i32 %sub.i.i.1, i32* %incdec.ptr1.i, align 4, !tbaa !0
  %incdec.ptr1.i.1 = getelementptr %"class.boost::array"* %a, i32 0, i32 0, i32 2
  %20 = load i32* %incdec.ptr1.i.1, align 4, !tbaa !0
  %sub.i.i.2 = sub nsw i32 0, %20
  store i32 %sub.i.i.2, i32* %incdec.ptr1.i.1, align 4, !tbaa !0
  %incdec.ptr1.i.2 = getelementptr %"class.boost::array"* %a, i32 0, i32 0, i32 3
  %21 = load i32* %incdec.ptr1.i.2, align 4, !tbaa !0
  %sub.i.i.3 = sub nsw i32 0, %21
  store i32 %sub.i.i.3, i32* %incdec.ptr1.i.2, align 4, !tbaa !0
  %incdec.ptr1.i.3 = getelementptr %"class.boost::array"* %a, i32 0, i32 0, i32 4
  %22 = load i32* %incdec.ptr1.i.3, align 4, !tbaa !0
  %sub.i.i.4 = sub nsw i32 0, %22
  store i32 %sub.i.i.4, i32* %incdec.ptr1.i.3, align 4, !tbaa !0
  %incdec.ptr1.i.4 = getelementptr %"class.boost::array"* %a, i32 0, i32 0, i32 5
  %23 = load i32* %incdec.ptr1.i.4, align 4, !tbaa !0
  %sub.i.i.5 = sub nsw i32 0, %23
  store i32 %sub.i.i.5, i32* %incdec.ptr1.i.4, align 4, !tbaa !0
  %incdec.ptr1.i.5 = getelementptr %"class.boost::array"* %a, i32 0, i32 0, i32 6
  %24 = load i32* %incdec.ptr1.i.5, align 4, !tbaa !0
  %sub.i.i.6 = sub nsw i32 0, %24
  store i32 %sub.i.i.6, i32* %incdec.ptr1.i.5, align 4, !tbaa !0
  %incdec.ptr1.i.6 = getelementptr %"class.boost::array"* %a, i32 0, i32 0, i32 7
  %25 = load i32* %incdec.ptr1.i.6, align 4, !tbaa !0
  %sub.i.i.7 = sub nsw i32 0, %25
  store i32 %sub.i.i.7, i32* %incdec.ptr1.i.6, align 4, !tbaa !0
  %incdec.ptr1.i.7 = getelementptr %"class.boost::array"* %a, i32 0, i32 0, i32 8
  %26 = load i32* %incdec.ptr1.i.7, align 4, !tbaa !0
  %sub.i.i.8 = sub nsw i32 0, %26
  store i32 %sub.i.i.8, i32* %incdec.ptr1.i.7, align 4, !tbaa !0
  %incdec.ptr1.i.8 = getelementptr %"class.boost::array"* %a, i32 0, i32 0, i32 9
  %27 = load i32* %incdec.ptr1.i.8, align 4, !tbaa !0
  %sub.i.i.9 = sub nsw i32 0, %27
  store i32 %sub.i.i.9, i32* %incdec.ptr1.i.8, align 4, !tbaa !0
  call void @_Z14print_elementsIN5boost5arrayIiLj10EEEEvRKT_PKc(%"class.boost::array"* %a, i8* getelementptr inbounds ([1 x i8]* @.str, i32 0, i32 0))
  ret i32 0
}

declare void @llvm.memset.p0i8.i32(i8* nocapture, i8, i32, i32, i1) nounwind

define linkonce_odr void @_Z14print_elementsIN5boost5arrayIiLj10EEEEvRKT_PKc(%"class.boost::array"* %coll, i8* %optcstr) inlinehint {
entry:
  %__c.addr.i = alloca i8, align 1
  %tobool.i = icmp eq i8* %optcstr, null
  br i1 %tobool.i, label %if.then.i, label %if.else.i

if.then.i:                                        ; preds = %entry
  %vtable.i = load i8** bitcast (%"class.std::basic_ostream"* @_ZSt4cout to i8**), align 4, !tbaa !3
  %vbase.offset.ptr.i = getelementptr i8* %vtable.i, i32 -12
  %0 = bitcast i8* %vbase.offset.ptr.i to i32*
  %vbase.offset.i = load i32* %0, align 4
  %add.ptr.i = getelementptr inbounds i8* bitcast (%"class.std::basic_ostream"* @_ZSt4cout to i8*), i32 %vbase.offset.i
  %1 = bitcast i8* %add.ptr.i to %"class.std::basic_ios"*
  %add.ptr.sum.i = add i32 %vbase.offset.i, 20
  %_M_streambuf_state.i.i.i = getelementptr inbounds i8* bitcast (%"class.std::basic_ostream"* @_ZSt4cout to i8*), i32 %add.ptr.sum.i
  %2 = bitcast i8* %_M_streambuf_state.i.i.i to i32*
  %3 = load i32* %2, align 4, !tbaa !4
  %or.i.i.i = or i32 %3, 1
  call void @_ZNSt9basic_iosIcSt11char_traitsIcEE5clearESt12_Ios_Iostate(%"class.std::basic_ios"* %1, i32 %or.i.i.i)
  br label %_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.exit

if.else.i:                                        ; preds = %entry
  %call.i.i = call i32 @strlen(i8* %optcstr) nounwind
  %call1.i = call %"class.std::basic_ostream"* @_ZSt16__ostream_insertIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_PKS3_i(%"class.std::basic_ostream"* @_ZSt4cout, i8* %optcstr, i32 %call.i.i)
  br label %_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.exit

_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.exit: ; preds = %if.then.i, %if.else.i
  %arraydecay.i = getelementptr inbounds %"class.boost::array"* %coll, i32 0, i32 0, i32 0
  %4 = load i32* %arraydecay.i, align 4, !tbaa !0
  %call3 = call %"class.std::basic_ostream"* @_ZNSolsEi(%"class.std::basic_ostream"* @_ZSt4cout, i32 %4)
  call void @llvm.lifetime.start(i64 1, i8* %__c.addr.i)
  store i8 32, i8* %__c.addr.i, align 1, !tbaa !1
  %call.i = call %"class.std::basic_ostream"* @_ZSt16__ostream_insertIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_PKS3_i(%"class.std::basic_ostream"* %call3, i8* %__c.addr.i, i32 1)
  call void @llvm.lifetime.end(i64 1, i8* %__c.addr.i)
  %incdec.ptr = getelementptr inbounds %"class.boost::array"* %coll, i32 0, i32 0, i32 1
  %5 = load i32* %incdec.ptr, align 4, !tbaa !0
  %call3.1 = call %"class.std::basic_ostream"* @_ZNSolsEi(%"class.std::basic_ostream"* @_ZSt4cout, i32 %5)
  call void @llvm.lifetime.start(i64 1, i8* %__c.addr.i)
  store i8 32, i8* %__c.addr.i, align 1, !tbaa !1
  %call.i.1 = call %"class.std::basic_ostream"* @_ZSt16__ostream_insertIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_PKS3_i(%"class.std::basic_ostream"* %call3.1, i8* %__c.addr.i, i32 1)
  call void @llvm.lifetime.end(i64 1, i8* %__c.addr.i)
  %incdec.ptr.1 = getelementptr inbounds %"class.boost::array"* %coll, i32 0, i32 0, i32 2
  %6 = load i32* %incdec.ptr.1, align 4, !tbaa !0
  %call3.2 = call %"class.std::basic_ostream"* @_ZNSolsEi(%"class.std::basic_ostream"* @_ZSt4cout, i32 %6)
  call void @llvm.lifetime.start(i64 1, i8* %__c.addr.i)
  store i8 32, i8* %__c.addr.i, align 1, !tbaa !1
  %call.i.2 = call %"class.std::basic_ostream"* @_ZSt16__ostream_insertIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_PKS3_i(%"class.std::basic_ostream"* %call3.2, i8* %__c.addr.i, i32 1)
  call void @llvm.lifetime.end(i64 1, i8* %__c.addr.i)
  %incdec.ptr.2 = getelementptr inbounds %"class.boost::array"* %coll, i32 0, i32 0, i32 3
  %7 = load i32* %incdec.ptr.2, align 4, !tbaa !0
  %call3.3 = call %"class.std::basic_ostream"* @_ZNSolsEi(%"class.std::basic_ostream"* @_ZSt4cout, i32 %7)
  call void @llvm.lifetime.start(i64 1, i8* %__c.addr.i)
  store i8 32, i8* %__c.addr.i, align 1, !tbaa !1
  %call.i.3 = call %"class.std::basic_ostream"* @_ZSt16__ostream_insertIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_PKS3_i(%"class.std::basic_ostream"* %call3.3, i8* %__c.addr.i, i32 1)
  call void @llvm.lifetime.end(i64 1, i8* %__c.addr.i)
  %incdec.ptr.3 = getelementptr inbounds %"class.boost::array"* %coll, i32 0, i32 0, i32 4
  %8 = load i32* %incdec.ptr.3, align 4, !tbaa !0
  %call3.4 = call %"class.std::basic_ostream"* @_ZNSolsEi(%"class.std::basic_ostream"* @_ZSt4cout, i32 %8)
  call void @llvm.lifetime.start(i64 1, i8* %__c.addr.i)
  store i8 32, i8* %__c.addr.i, align 1, !tbaa !1
  %call.i.4 = call %"class.std::basic_ostream"* @_ZSt16__ostream_insertIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_PKS3_i(%"class.std::basic_ostream"* %call3.4, i8* %__c.addr.i, i32 1)
  call void @llvm.lifetime.end(i64 1, i8* %__c.addr.i)
  %incdec.ptr.4 = getelementptr inbounds %"class.boost::array"* %coll, i32 0, i32 0, i32 5
  %9 = load i32* %incdec.ptr.4, align 4, !tbaa !0
  %call3.5 = call %"class.std::basic_ostream"* @_ZNSolsEi(%"class.std::basic_ostream"* @_ZSt4cout, i32 %9)
  call void @llvm.lifetime.start(i64 1, i8* %__c.addr.i)
  store i8 32, i8* %__c.addr.i, align 1, !tbaa !1
  %call.i.5 = call %"class.std::basic_ostream"* @_ZSt16__ostream_insertIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_PKS3_i(%"class.std::basic_ostream"* %call3.5, i8* %__c.addr.i, i32 1)
  call void @llvm.lifetime.end(i64 1, i8* %__c.addr.i)
  %incdec.ptr.5 = getelementptr inbounds %"class.boost::array"* %coll, i32 0, i32 0, i32 6
  %10 = load i32* %incdec.ptr.5, align 4, !tbaa !0
  %call3.6 = call %"class.std::basic_ostream"* @_ZNSolsEi(%"class.std::basic_ostream"* @_ZSt4cout, i32 %10)
  call void @llvm.lifetime.start(i64 1, i8* %__c.addr.i)
  store i8 32, i8* %__c.addr.i, align 1, !tbaa !1
  %call.i.6 = call %"class.std::basic_ostream"* @_ZSt16__ostream_insertIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_PKS3_i(%"class.std::basic_ostream"* %call3.6, i8* %__c.addr.i, i32 1)
  call void @llvm.lifetime.end(i64 1, i8* %__c.addr.i)
  %incdec.ptr.6 = getelementptr inbounds %"class.boost::array"* %coll, i32 0, i32 0, i32 7
  %11 = load i32* %incdec.ptr.6, align 4, !tbaa !0
  %call3.7 = call %"class.std::basic_ostream"* @_ZNSolsEi(%"class.std::basic_ostream"* @_ZSt4cout, i32 %11)
  call void @llvm.lifetime.start(i64 1, i8* %__c.addr.i)
  store i8 32, i8* %__c.addr.i, align 1, !tbaa !1
  %call.i.7 = call %"class.std::basic_ostream"* @_ZSt16__ostream_insertIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_PKS3_i(%"class.std::basic_ostream"* %call3.7, i8* %__c.addr.i, i32 1)
  call void @llvm.lifetime.end(i64 1, i8* %__c.addr.i)
  %incdec.ptr.7 = getelementptr inbounds %"class.boost::array"* %coll, i32 0, i32 0, i32 8
  %12 = load i32* %incdec.ptr.7, align 4, !tbaa !0
  %call3.8 = call %"class.std::basic_ostream"* @_ZNSolsEi(%"class.std::basic_ostream"* @_ZSt4cout, i32 %12)
  call void @llvm.lifetime.start(i64 1, i8* %__c.addr.i)
  store i8 32, i8* %__c.addr.i, align 1, !tbaa !1
  %call.i.8 = call %"class.std::basic_ostream"* @_ZSt16__ostream_insertIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_PKS3_i(%"class.std::basic_ostream"* %call3.8, i8* %__c.addr.i, i32 1)
  call void @llvm.lifetime.end(i64 1, i8* %__c.addr.i)
  %incdec.ptr.8 = getelementptr inbounds %"class.boost::array"* %coll, i32 0, i32 0, i32 9
  %13 = load i32* %incdec.ptr.8, align 4, !tbaa !0
  %call3.9 = call %"class.std::basic_ostream"* @_ZNSolsEi(%"class.std::basic_ostream"* @_ZSt4cout, i32 %13)
  call void @llvm.lifetime.start(i64 1, i8* %__c.addr.i)
  store i8 32, i8* %__c.addr.i, align 1, !tbaa !1
  %call.i.9 = call %"class.std::basic_ostream"* @_ZSt16__ostream_insertIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_PKS3_i(%"class.std::basic_ostream"* %call3.9, i8* %__c.addr.i, i32 1)
  call void @llvm.lifetime.end(i64 1, i8* %__c.addr.i)
  %vtable.i11 = load i8** bitcast (%"class.std::basic_ostream"* @_ZSt4cout to i8**), align 4, !tbaa !3
  %vbase.offset.ptr.i12 = getelementptr i8* %vtable.i11, i32 -12
  %14 = bitcast i8* %vbase.offset.ptr.i12 to i32*
  %vbase.offset.i13 = load i32* %14, align 4
  %add.ptr.i14.sum = add i32 %vbase.offset.i13, 124
  %_M_ctype.i = getelementptr inbounds i8* bitcast (%"class.std::basic_ostream"* @_ZSt4cout to i8*), i32 %add.ptr.i14.sum
  %15 = bitcast i8* %_M_ctype.i to %"class.std::ctype"**
  %16 = load %"class.std::ctype"** %15, align 4, !tbaa !5
  %tobool.i23 = icmp eq %"class.std::ctype"* %16, null
  br i1 %tobool.i23, label %if.then.i24, label %_ZSt13__check_facetISt5ctypeIcEERKT_PS3_.exit

if.then.i24:                                      ; preds = %_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.exit
  call void @_ZSt16__throw_bad_castv() noreturn
  unreachable

_ZSt13__check_facetISt5ctypeIcEERKT_PS3_.exit:    ; preds = %_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.exit
  %_M_widen_ok.i = getelementptr inbounds %"class.std::ctype"* %16, i32 0, i32 6
  %17 = load i8* %_M_widen_ok.i, align 1, !tbaa !1
  %tobool.i19 = icmp eq i8 %17, 0
  br i1 %tobool.i19, label %if.end.i, label %if.then.i20

if.then.i20:                                      ; preds = %_ZSt13__check_facetISt5ctypeIcEERKT_PS3_.exit
  %arrayidx.i = getelementptr inbounds %"class.std::ctype"* %16, i32 0, i32 7, i32 10
  %18 = load i8* %arrayidx.i, align 1, !tbaa !1
  br label %_ZNKSt5ctypeIcE5widenEc.exit

if.end.i:                                         ; preds = %_ZSt13__check_facetISt5ctypeIcEERKT_PS3_.exit
  call void @_ZNKSt5ctypeIcE13_M_widen_initEv(%"class.std::ctype"* %16)
  %19 = bitcast %"class.std::ctype"* %16 to i8 (%"class.std::ctype"*, i8)***
  %vtable.i21 = load i8 (%"class.std::ctype"*, i8)*** %19, align 4, !tbaa !3
  %vfn.i = getelementptr inbounds i8 (%"class.std::ctype"*, i8)** %vtable.i21, i32 6
  %20 = load i8 (%"class.std::ctype"*, i8)** %vfn.i, align 4
  %call.i22 = call signext i8 %20(%"class.std::ctype"* %16, i8 signext 10)
  br label %_ZNKSt5ctypeIcE5widenEc.exit

_ZNKSt5ctypeIcE5widenEc.exit:                     ; preds = %if.then.i20, %if.end.i
  %retval.0.i = phi i8 [ %18, %if.then.i20 ], [ %call.i22, %if.end.i ]
  %call1.i16 = call %"class.std::basic_ostream"* @_ZNSo3putEc(%"class.std::basic_ostream"* @_ZSt4cout, i8 signext %retval.0.i)
  %call.i17 = call %"class.std::basic_ostream"* @_ZNSo5flushEv(%"class.std::basic_ostream"* %call1.i16)
  ret void
}

declare %"class.std::basic_ostream"* @_ZNSo3putEc(%"class.std::basic_ostream"*, i8 signext)

declare void @_ZNKSt5ctypeIcE13_M_widen_initEv(%"class.std::ctype"*)

declare void @_ZSt16__throw_bad_castv() noreturn

declare %"class.std::basic_ostream"* @_ZNSo5flushEv(%"class.std::basic_ostream"*)

declare %"class.std::basic_ostream"* @_ZSt16__ostream_insertIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_PKS3_i(%"class.std::basic_ostream"*, i8*, i32)

declare i32 @strlen(i8* nocapture) nounwind readonly

declare void @_ZNSt9basic_iosIcSt11char_traitsIcEE5clearESt12_Ios_Iostate(%"class.std::basic_ios"*, i32)

declare %"class.std::basic_ostream"* @_ZNSolsEi(%"class.std::basic_ostream"*, i32)

define internal void @_GLOBAL__I_a() section ".text.startup" {
entry:
  tail call void @_ZNSt8ios_base4InitC1Ev(%"class.std::ios_base::Init"* @_ZStL8__ioinit)
  %0 = tail call i32 @__cxa_atexit(void (i8*)* bitcast (void (%"class.std::ios_base::Init"*)* @_ZNSt8ios_base4InitD1Ev to void (i8*)*), i8* getelementptr inbounds (%"class.std::ios_base::Init"* @_ZStL8__ioinit, i32 0, i32 0), i8* @__dso_handle) nounwind
  ret void
}

declare void @llvm.lifetime.start(i64, i8* nocapture) nounwind

declare void @llvm.lifetime.end(i64, i8* nocapture) nounwind

!0 = metadata !{metadata !"int", metadata !1}
!1 = metadata !{metadata !"omnipotent char", metadata !2}
!2 = metadata !{metadata !"Simple C/C++ TBAA"}
!3 = metadata !{metadata !"vtable pointer", metadata !2}
!4 = metadata !{metadata !"_ZTSSt12_Ios_Iostate", metadata !1}
!5 = metadata !{metadata !"any pointer", metadata !1}
