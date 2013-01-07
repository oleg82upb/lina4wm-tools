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

@_ZStL8__ioinit = internal global %"class.std::ios_base::Init" zeroinitializer, align 1
@__dso_handle = external global i8
@_ZZ4mainE1a = internal constant %"class.boost::array" { [6 x float] [float 0x404535C280000000, float 0.000000e+00, float 0.000000e+00, float 0.000000e+00, float 0.000000e+00, float 0.000000e+00] }, align 4
@_ZSt4cout = external global %"class.std::basic_ostream"
@.str = private unnamed_addr constant [14 x i8] c"static_size: \00", align 1
@.str1 = private unnamed_addr constant [14 x i8] c"size:        \00", align 1
@.str2 = private unnamed_addr constant [14 x i8] c"empty:       \00", align 1
@.str4 = private unnamed_addr constant [6 x i8] c"false\00", align 1
@.str5 = private unnamed_addr constant [14 x i8] c"max_size:    \00", align 1
@.str6 = private unnamed_addr constant [14 x i8] c"front:       \00", align 1
@.str7 = private unnamed_addr constant [14 x i8] c"back:        \00", align 1
@.str8 = private unnamed_addr constant [14 x i8] c"[0]:         \00", align 1
@.str9 = private unnamed_addr constant [14 x i8] c"elems:       \00", align 1
@.str10 = private unnamed_addr constant [45 x i8] c"copy construction and copy assignment are OK\00", align 1
@llvm.global_ctors = appending global [1 x { i32, void ()* }] [{ i32, void ()* } { i32 65535, void ()* @_GLOBAL__I_a }]

declare void @_ZNSt8ios_base4InitC1Ev(%"class.std::ios_base::Init"*)

declare void @_ZNSt8ios_base4InitD1Ev(%"class.std::ios_base::Init"*)

declare i32 @__cxa_atexit(void (i8*)*, i8*, i8*) nounwind

define i32 @main() {
entry:
  %__c.addr.i = alloca i8, align 1
  %call1.i = call %"class.std::basic_ostream"* @_ZSt16__ostream_insertIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_PKS3_i(%"class.std::basic_ostream"* @_ZSt4cout, i8* getelementptr inbounds ([14 x i8]* @.str, i32 0, i32 0), i32 13)
  %call.i = call %"class.std::basic_ostream"* @_ZNSo9_M_insertImEERSoT_(%"class.std::basic_ostream"* @_ZSt4cout, i32 6)
  %0 = bitcast %"class.std::basic_ostream"* %call.i to i8**
  %vtable.i = load i8** %0, align 4, !tbaa !0
  %vbase.offset.ptr.i = getelementptr i8* %vtable.i, i32 -12
  %1 = bitcast i8* %vbase.offset.ptr.i to i32*
  %vbase.offset.i = load i32* %1, align 4
  %2 = bitcast %"class.std::basic_ostream"* %call.i to i8*
  %add.ptr.i.sum = add i32 %vbase.offset.i, 124
  %_M_ctype.i186 = getelementptr inbounds i8* %2, i32 %add.ptr.i.sum
  %3 = bitcast i8* %_M_ctype.i186 to %"class.std::ctype"**
  %4 = load %"class.std::ctype"** %3, align 4, !tbaa !2
  %tobool.i289 = icmp eq %"class.std::ctype"* %4, null
  br i1 %tobool.i289, label %if.then.i290, label %_ZSt13__check_facetISt5ctypeIcEERKT_PS3_.exit292

if.then.i290:                                     ; preds = %entry
  call void @_ZSt16__throw_bad_castv() noreturn
  unreachable

_ZSt13__check_facetISt5ctypeIcEERKT_PS3_.exit292: ; preds = %entry
  %_M_widen_ok.i188 = getelementptr inbounds %"class.std::ctype"* %4, i32 0, i32 6
  %5 = load i8* %_M_widen_ok.i188, align 1, !tbaa !3
  %tobool.i189 = icmp eq i8 %5, 0
  br i1 %tobool.i189, label %if.end.i195, label %if.then.i191

if.then.i191:                                     ; preds = %_ZSt13__check_facetISt5ctypeIcEERKT_PS3_.exit292
  %arrayidx.i190 = getelementptr inbounds %"class.std::ctype"* %4, i32 0, i32 7, i32 10
  %6 = load i8* %arrayidx.i190, align 1, !tbaa !3
  br label %_ZNKSt5ctypeIcE5widenEc.exit197

if.end.i195:                                      ; preds = %_ZSt13__check_facetISt5ctypeIcEERKT_PS3_.exit292
  call void @_ZNKSt5ctypeIcE13_M_widen_initEv(%"class.std::ctype"* %4)
  %7 = bitcast %"class.std::ctype"* %4 to i8 (%"class.std::ctype"*, i8)***
  %vtable.i192 = load i8 (%"class.std::ctype"*, i8)*** %7, align 4, !tbaa !0
  %vfn.i193 = getelementptr inbounds i8 (%"class.std::ctype"*, i8)** %vtable.i192, i32 6
  %8 = load i8 (%"class.std::ctype"*, i8)** %vfn.i193, align 4
  %call.i194 = call signext i8 %8(%"class.std::ctype"* %4, i8 signext 10)
  br label %_ZNKSt5ctypeIcE5widenEc.exit197

_ZNKSt5ctypeIcE5widenEc.exit197:                  ; preds = %if.then.i191, %if.end.i195
  %retval.0.i196 = phi i8 [ %6, %if.then.i191 ], [ %call.i194, %if.end.i195 ]
  %call1.i45 = call %"class.std::basic_ostream"* @_ZNSo3putEc(%"class.std::basic_ostream"* %call.i, i8 signext %retval.0.i196)
  %call.i46 = call %"class.std::basic_ostream"* @_ZNSo5flushEv(%"class.std::basic_ostream"* %call1.i45)
  %call1.i48 = call %"class.std::basic_ostream"* @_ZSt16__ostream_insertIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_PKS3_i(%"class.std::basic_ostream"* @_ZSt4cout, i8* getelementptr inbounds ([14 x i8]* @.str1, i32 0, i32 0), i32 13)
  %call.i49 = call %"class.std::basic_ostream"* @_ZNSo9_M_insertImEERSoT_(%"class.std::basic_ostream"* @_ZSt4cout, i32 6)
  %9 = bitcast %"class.std::basic_ostream"* %call.i49 to i8**
  %vtable.i51 = load i8** %9, align 4, !tbaa !0
  %vbase.offset.ptr.i52 = getelementptr i8* %vtable.i51, i32 -12
  %10 = bitcast i8* %vbase.offset.ptr.i52 to i32*
  %vbase.offset.i53 = load i32* %10, align 4
  %11 = bitcast %"class.std::basic_ostream"* %call.i49 to i8*
  %add.ptr.i54.sum = add i32 %vbase.offset.i53, 124
  %_M_ctype.i198 = getelementptr inbounds i8* %11, i32 %add.ptr.i54.sum
  %12 = bitcast i8* %_M_ctype.i198 to %"class.std::ctype"**
  %13 = load %"class.std::ctype"** %12, align 4, !tbaa !2
  %tobool.i293 = icmp eq %"class.std::ctype"* %13, null
  br i1 %tobool.i293, label %if.then.i294, label %_ZSt13__check_facetISt5ctypeIcEERKT_PS3_.exit296

if.then.i294:                                     ; preds = %_ZNKSt5ctypeIcE5widenEc.exit197
  call void @_ZSt16__throw_bad_castv() noreturn
  unreachable

_ZSt13__check_facetISt5ctypeIcEERKT_PS3_.exit296: ; preds = %_ZNKSt5ctypeIcE5widenEc.exit197
  %_M_widen_ok.i200 = getelementptr inbounds %"class.std::ctype"* %13, i32 0, i32 6
  %14 = load i8* %_M_widen_ok.i200, align 1, !tbaa !3
  %tobool.i201 = icmp eq i8 %14, 0
  br i1 %tobool.i201, label %if.end.i207, label %if.then.i203

if.then.i203:                                     ; preds = %_ZSt13__check_facetISt5ctypeIcEERKT_PS3_.exit296
  %arrayidx.i202 = getelementptr inbounds %"class.std::ctype"* %13, i32 0, i32 7, i32 10
  %15 = load i8* %arrayidx.i202, align 1, !tbaa !3
  br label %_ZNKSt5ctypeIcE5widenEc.exit209

if.end.i207:                                      ; preds = %_ZSt13__check_facetISt5ctypeIcEERKT_PS3_.exit296
  call void @_ZNKSt5ctypeIcE13_M_widen_initEv(%"class.std::ctype"* %13)
  %16 = bitcast %"class.std::ctype"* %13 to i8 (%"class.std::ctype"*, i8)***
  %vtable.i204 = load i8 (%"class.std::ctype"*, i8)*** %16, align 4, !tbaa !0
  %vfn.i205 = getelementptr inbounds i8 (%"class.std::ctype"*, i8)** %vtable.i204, i32 6
  %17 = load i8 (%"class.std::ctype"*, i8)** %vfn.i205, align 4
  %call.i206 = call signext i8 %17(%"class.std::ctype"* %13, i8 signext 10)
  br label %_ZNKSt5ctypeIcE5widenEc.exit209

_ZNKSt5ctypeIcE5widenEc.exit209:                  ; preds = %if.then.i203, %if.end.i207
  %retval.0.i208 = phi i8 [ %15, %if.then.i203 ], [ %call.i206, %if.end.i207 ]
  %call1.i56 = call %"class.std::basic_ostream"* @_ZNSo3putEc(%"class.std::basic_ostream"* %call.i49, i8 signext %retval.0.i208)
  %call.i57 = call %"class.std::basic_ostream"* @_ZNSo5flushEv(%"class.std::basic_ostream"* %call1.i56)
  %call1.i59 = call %"class.std::basic_ostream"* @_ZSt16__ostream_insertIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_PKS3_i(%"class.std::basic_ostream"* @_ZSt4cout, i8* getelementptr inbounds ([14 x i8]* @.str2, i32 0, i32 0), i32 13)
  %call1.i61 = call %"class.std::basic_ostream"* @_ZSt16__ostream_insertIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_PKS3_i(%"class.std::basic_ostream"* @_ZSt4cout, i8* getelementptr inbounds ([6 x i8]* @.str4, i32 0, i32 0), i32 5)
  %vtable.i63 = load i8** bitcast (%"class.std::basic_ostream"* @_ZSt4cout to i8**), align 4, !tbaa !0
  %vbase.offset.ptr.i64 = getelementptr i8* %vtable.i63, i32 -12
  %18 = bitcast i8* %vbase.offset.ptr.i64 to i32*
  %vbase.offset.i65 = load i32* %18, align 4
  %add.ptr.i66.sum = add i32 %vbase.offset.i65, 124
  %_M_ctype.i210 = getelementptr inbounds i8* bitcast (%"class.std::basic_ostream"* @_ZSt4cout to i8*), i32 %add.ptr.i66.sum
  %19 = bitcast i8* %_M_ctype.i210 to %"class.std::ctype"**
  %20 = load %"class.std::ctype"** %19, align 4, !tbaa !2
  %tobool.i297 = icmp eq %"class.std::ctype"* %20, null
  br i1 %tobool.i297, label %if.then.i298, label %_ZSt13__check_facetISt5ctypeIcEERKT_PS3_.exit300

if.then.i298:                                     ; preds = %_ZNKSt5ctypeIcE5widenEc.exit209
  call void @_ZSt16__throw_bad_castv() noreturn
  unreachable

_ZSt13__check_facetISt5ctypeIcEERKT_PS3_.exit300: ; preds = %_ZNKSt5ctypeIcE5widenEc.exit209
  %_M_widen_ok.i212 = getelementptr inbounds %"class.std::ctype"* %20, i32 0, i32 6
  %21 = load i8* %_M_widen_ok.i212, align 1, !tbaa !3
  %tobool.i213 = icmp eq i8 %21, 0
  br i1 %tobool.i213, label %if.end.i219, label %if.then.i215

if.then.i215:                                     ; preds = %_ZSt13__check_facetISt5ctypeIcEERKT_PS3_.exit300
  %arrayidx.i214 = getelementptr inbounds %"class.std::ctype"* %20, i32 0, i32 7, i32 10
  %22 = load i8* %arrayidx.i214, align 1, !tbaa !3
  br label %_ZNKSt5ctypeIcE5widenEc.exit221

if.end.i219:                                      ; preds = %_ZSt13__check_facetISt5ctypeIcEERKT_PS3_.exit300
  call void @_ZNKSt5ctypeIcE13_M_widen_initEv(%"class.std::ctype"* %20)
  %23 = bitcast %"class.std::ctype"* %20 to i8 (%"class.std::ctype"*, i8)***
  %vtable.i216 = load i8 (%"class.std::ctype"*, i8)*** %23, align 4, !tbaa !0
  %vfn.i217 = getelementptr inbounds i8 (%"class.std::ctype"*, i8)** %vtable.i216, i32 6
  %24 = load i8 (%"class.std::ctype"*, i8)** %vfn.i217, align 4
  %call.i218 = call signext i8 %24(%"class.std::ctype"* %20, i8 signext 10)
  br label %_ZNKSt5ctypeIcE5widenEc.exit221

_ZNKSt5ctypeIcE5widenEc.exit221:                  ; preds = %if.then.i215, %if.end.i219
  %retval.0.i220 = phi i8 [ %22, %if.then.i215 ], [ %call.i218, %if.end.i219 ]
  %call1.i68 = call %"class.std::basic_ostream"* @_ZNSo3putEc(%"class.std::basic_ostream"* @_ZSt4cout, i8 signext %retval.0.i220)
  %call.i69 = call %"class.std::basic_ostream"* @_ZNSo5flushEv(%"class.std::basic_ostream"* %call1.i68)
  %call1.i71 = call %"class.std::basic_ostream"* @_ZSt16__ostream_insertIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_PKS3_i(%"class.std::basic_ostream"* @_ZSt4cout, i8* getelementptr inbounds ([14 x i8]* @.str5, i32 0, i32 0), i32 13)
  %call.i72 = call %"class.std::basic_ostream"* @_ZNSo9_M_insertImEERSoT_(%"class.std::basic_ostream"* @_ZSt4cout, i32 6)
  %25 = bitcast %"class.std::basic_ostream"* %call.i72 to i8**
  %vtable.i74 = load i8** %25, align 4, !tbaa !0
  %vbase.offset.ptr.i75 = getelementptr i8* %vtable.i74, i32 -12
  %26 = bitcast i8* %vbase.offset.ptr.i75 to i32*
  %vbase.offset.i76 = load i32* %26, align 4
  %27 = bitcast %"class.std::basic_ostream"* %call.i72 to i8*
  %add.ptr.i77.sum = add i32 %vbase.offset.i76, 124
  %_M_ctype.i222 = getelementptr inbounds i8* %27, i32 %add.ptr.i77.sum
  %28 = bitcast i8* %_M_ctype.i222 to %"class.std::ctype"**
  %29 = load %"class.std::ctype"** %28, align 4, !tbaa !2
  %tobool.i301 = icmp eq %"class.std::ctype"* %29, null
  br i1 %tobool.i301, label %if.then.i302, label %_ZSt13__check_facetISt5ctypeIcEERKT_PS3_.exit304

if.then.i302:                                     ; preds = %_ZNKSt5ctypeIcE5widenEc.exit221
  call void @_ZSt16__throw_bad_castv() noreturn
  unreachable

_ZSt13__check_facetISt5ctypeIcEERKT_PS3_.exit304: ; preds = %_ZNKSt5ctypeIcE5widenEc.exit221
  %_M_widen_ok.i224 = getelementptr inbounds %"class.std::ctype"* %29, i32 0, i32 6
  %30 = load i8* %_M_widen_ok.i224, align 1, !tbaa !3
  %tobool.i225 = icmp eq i8 %30, 0
  br i1 %tobool.i225, label %if.end.i231, label %if.then.i227

if.then.i227:                                     ; preds = %_ZSt13__check_facetISt5ctypeIcEERKT_PS3_.exit304
  %arrayidx.i226 = getelementptr inbounds %"class.std::ctype"* %29, i32 0, i32 7, i32 10
  %31 = load i8* %arrayidx.i226, align 1, !tbaa !3
  br label %_ZNKSt5ctypeIcE5widenEc.exit233

if.end.i231:                                      ; preds = %_ZSt13__check_facetISt5ctypeIcEERKT_PS3_.exit304
  call void @_ZNKSt5ctypeIcE13_M_widen_initEv(%"class.std::ctype"* %29)
  %32 = bitcast %"class.std::ctype"* %29 to i8 (%"class.std::ctype"*, i8)***
  %vtable.i228 = load i8 (%"class.std::ctype"*, i8)*** %32, align 4, !tbaa !0
  %vfn.i229 = getelementptr inbounds i8 (%"class.std::ctype"*, i8)** %vtable.i228, i32 6
  %33 = load i8 (%"class.std::ctype"*, i8)** %vfn.i229, align 4
  %call.i230 = call signext i8 %33(%"class.std::ctype"* %29, i8 signext 10)
  br label %_ZNKSt5ctypeIcE5widenEc.exit233

_ZNKSt5ctypeIcE5widenEc.exit233:                  ; preds = %if.then.i227, %if.end.i231
  %retval.0.i232 = phi i8 [ %31, %if.then.i227 ], [ %call.i230, %if.end.i231 ]
  %call1.i79 = call %"class.std::basic_ostream"* @_ZNSo3putEc(%"class.std::basic_ostream"* %call.i72, i8 signext %retval.0.i232)
  %call.i80 = call %"class.std::basic_ostream"* @_ZNSo5flushEv(%"class.std::basic_ostream"* %call1.i79)
  %call1.i82 = call %"class.std::basic_ostream"* @_ZSt16__ostream_insertIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_PKS3_i(%"class.std::basic_ostream"* @_ZSt4cout, i8* getelementptr inbounds ([14 x i8]* @.str6, i32 0, i32 0), i32 13)
  %call.i83 = call %"class.std::basic_ostream"* @_ZNSo9_M_insertIdEERSoT_(%"class.std::basic_ostream"* @_ZSt4cout, double 0x404535C280000000)
  %34 = bitcast %"class.std::basic_ostream"* %call.i83 to i8**
  %vtable.i85 = load i8** %34, align 4, !tbaa !0
  %vbase.offset.ptr.i86 = getelementptr i8* %vtable.i85, i32 -12
  %35 = bitcast i8* %vbase.offset.ptr.i86 to i32*
  %vbase.offset.i87 = load i32* %35, align 4
  %36 = bitcast %"class.std::basic_ostream"* %call.i83 to i8*
  %add.ptr.i88.sum = add i32 %vbase.offset.i87, 124
  %_M_ctype.i234 = getelementptr inbounds i8* %36, i32 %add.ptr.i88.sum
  %37 = bitcast i8* %_M_ctype.i234 to %"class.std::ctype"**
  %38 = load %"class.std::ctype"** %37, align 4, !tbaa !2
  %tobool.i305 = icmp eq %"class.std::ctype"* %38, null
  br i1 %tobool.i305, label %if.then.i306, label %_ZSt13__check_facetISt5ctypeIcEERKT_PS3_.exit308

if.then.i306:                                     ; preds = %_ZNKSt5ctypeIcE5widenEc.exit233
  call void @_ZSt16__throw_bad_castv() noreturn
  unreachable

_ZSt13__check_facetISt5ctypeIcEERKT_PS3_.exit308: ; preds = %_ZNKSt5ctypeIcE5widenEc.exit233
  %_M_widen_ok.i236 = getelementptr inbounds %"class.std::ctype"* %38, i32 0, i32 6
  %39 = load i8* %_M_widen_ok.i236, align 1, !tbaa !3
  %tobool.i237 = icmp eq i8 %39, 0
  br i1 %tobool.i237, label %if.end.i243, label %if.then.i239

if.then.i239:                                     ; preds = %_ZSt13__check_facetISt5ctypeIcEERKT_PS3_.exit308
  %arrayidx.i238 = getelementptr inbounds %"class.std::ctype"* %38, i32 0, i32 7, i32 10
  %40 = load i8* %arrayidx.i238, align 1, !tbaa !3
  br label %_ZNKSt5ctypeIcE5widenEc.exit245

if.end.i243:                                      ; preds = %_ZSt13__check_facetISt5ctypeIcEERKT_PS3_.exit308
  call void @_ZNKSt5ctypeIcE13_M_widen_initEv(%"class.std::ctype"* %38)
  %41 = bitcast %"class.std::ctype"* %38 to i8 (%"class.std::ctype"*, i8)***
  %vtable.i240 = load i8 (%"class.std::ctype"*, i8)*** %41, align 4, !tbaa !0
  %vfn.i241 = getelementptr inbounds i8 (%"class.std::ctype"*, i8)** %vtable.i240, i32 6
  %42 = load i8 (%"class.std::ctype"*, i8)** %vfn.i241, align 4
  %call.i242 = call signext i8 %42(%"class.std::ctype"* %38, i8 signext 10)
  br label %_ZNKSt5ctypeIcE5widenEc.exit245

_ZNKSt5ctypeIcE5widenEc.exit245:                  ; preds = %if.then.i239, %if.end.i243
  %retval.0.i244 = phi i8 [ %40, %if.then.i239 ], [ %call.i242, %if.end.i243 ]
  %call1.i90 = call %"class.std::basic_ostream"* @_ZNSo3putEc(%"class.std::basic_ostream"* %call.i83, i8 signext %retval.0.i244)
  %call.i91 = call %"class.std::basic_ostream"* @_ZNSo5flushEv(%"class.std::basic_ostream"* %call1.i90)
  %call1.i93 = call %"class.std::basic_ostream"* @_ZSt16__ostream_insertIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_PKS3_i(%"class.std::basic_ostream"* @_ZSt4cout, i8* getelementptr inbounds ([14 x i8]* @.str7, i32 0, i32 0), i32 13)
  %call.i95 = call %"class.std::basic_ostream"* @_ZNSo9_M_insertIdEERSoT_(%"class.std::basic_ostream"* @_ZSt4cout, double 0.000000e+00)
  %43 = bitcast %"class.std::basic_ostream"* %call.i95 to i8**
  %vtable.i97 = load i8** %43, align 4, !tbaa !0
  %vbase.offset.ptr.i98 = getelementptr i8* %vtable.i97, i32 -12
  %44 = bitcast i8* %vbase.offset.ptr.i98 to i32*
  %vbase.offset.i99 = load i32* %44, align 4
  %45 = bitcast %"class.std::basic_ostream"* %call.i95 to i8*
  %add.ptr.i100.sum = add i32 %vbase.offset.i99, 124
  %_M_ctype.i246 = getelementptr inbounds i8* %45, i32 %add.ptr.i100.sum
  %46 = bitcast i8* %_M_ctype.i246 to %"class.std::ctype"**
  %47 = load %"class.std::ctype"** %46, align 4, !tbaa !2
  %tobool.i309 = icmp eq %"class.std::ctype"* %47, null
  br i1 %tobool.i309, label %if.then.i310, label %_ZSt13__check_facetISt5ctypeIcEERKT_PS3_.exit312

if.then.i310:                                     ; preds = %_ZNKSt5ctypeIcE5widenEc.exit245
  call void @_ZSt16__throw_bad_castv() noreturn
  unreachable

_ZSt13__check_facetISt5ctypeIcEERKT_PS3_.exit312: ; preds = %_ZNKSt5ctypeIcE5widenEc.exit245
  %_M_widen_ok.i248 = getelementptr inbounds %"class.std::ctype"* %47, i32 0, i32 6
  %48 = load i8* %_M_widen_ok.i248, align 1, !tbaa !3
  %tobool.i249 = icmp eq i8 %48, 0
  br i1 %tobool.i249, label %if.end.i255, label %if.then.i251

if.then.i251:                                     ; preds = %_ZSt13__check_facetISt5ctypeIcEERKT_PS3_.exit312
  %arrayidx.i250 = getelementptr inbounds %"class.std::ctype"* %47, i32 0, i32 7, i32 10
  %49 = load i8* %arrayidx.i250, align 1, !tbaa !3
  br label %_ZNKSt5ctypeIcE5widenEc.exit257

if.end.i255:                                      ; preds = %_ZSt13__check_facetISt5ctypeIcEERKT_PS3_.exit312
  call void @_ZNKSt5ctypeIcE13_M_widen_initEv(%"class.std::ctype"* %47)
  %50 = bitcast %"class.std::ctype"* %47 to i8 (%"class.std::ctype"*, i8)***
  %vtable.i252 = load i8 (%"class.std::ctype"*, i8)*** %50, align 4, !tbaa !0
  %vfn.i253 = getelementptr inbounds i8 (%"class.std::ctype"*, i8)** %vtable.i252, i32 6
  %51 = load i8 (%"class.std::ctype"*, i8)** %vfn.i253, align 4
  %call.i254 = call signext i8 %51(%"class.std::ctype"* %47, i8 signext 10)
  br label %_ZNKSt5ctypeIcE5widenEc.exit257

_ZNKSt5ctypeIcE5widenEc.exit257:                  ; preds = %if.then.i251, %if.end.i255
  %retval.0.i256 = phi i8 [ %49, %if.then.i251 ], [ %call.i254, %if.end.i255 ]
  %call1.i102 = call %"class.std::basic_ostream"* @_ZNSo3putEc(%"class.std::basic_ostream"* %call.i95, i8 signext %retval.0.i256)
  %call.i103 = call %"class.std::basic_ostream"* @_ZNSo5flushEv(%"class.std::basic_ostream"* %call1.i102)
  %call1.i105 = call %"class.std::basic_ostream"* @_ZSt16__ostream_insertIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_PKS3_i(%"class.std::basic_ostream"* @_ZSt4cout, i8* getelementptr inbounds ([14 x i8]* @.str8, i32 0, i32 0), i32 13)
  %call.i107 = call %"class.std::basic_ostream"* @_ZNSo9_M_insertIdEERSoT_(%"class.std::basic_ostream"* @_ZSt4cout, double 0x404535C280000000)
  %52 = bitcast %"class.std::basic_ostream"* %call.i107 to i8**
  %vtable.i109 = load i8** %52, align 4, !tbaa !0
  %vbase.offset.ptr.i110 = getelementptr i8* %vtable.i109, i32 -12
  %53 = bitcast i8* %vbase.offset.ptr.i110 to i32*
  %vbase.offset.i111 = load i32* %53, align 4
  %54 = bitcast %"class.std::basic_ostream"* %call.i107 to i8*
  %add.ptr.i112.sum = add i32 %vbase.offset.i111, 124
  %_M_ctype.i258 = getelementptr inbounds i8* %54, i32 %add.ptr.i112.sum
  %55 = bitcast i8* %_M_ctype.i258 to %"class.std::ctype"**
  %56 = load %"class.std::ctype"** %55, align 4, !tbaa !2
  %tobool.i313 = icmp eq %"class.std::ctype"* %56, null
  br i1 %tobool.i313, label %if.then.i314, label %_ZSt13__check_facetISt5ctypeIcEERKT_PS3_.exit316

if.then.i314:                                     ; preds = %_ZNKSt5ctypeIcE5widenEc.exit257
  call void @_ZSt16__throw_bad_castv() noreturn
  unreachable

_ZSt13__check_facetISt5ctypeIcEERKT_PS3_.exit316: ; preds = %_ZNKSt5ctypeIcE5widenEc.exit257
  %_M_widen_ok.i260 = getelementptr inbounds %"class.std::ctype"* %56, i32 0, i32 6
  %57 = load i8* %_M_widen_ok.i260, align 1, !tbaa !3
  %tobool.i261 = icmp eq i8 %57, 0
  br i1 %tobool.i261, label %if.end.i267, label %if.then.i263

if.then.i263:                                     ; preds = %_ZSt13__check_facetISt5ctypeIcEERKT_PS3_.exit316
  %arrayidx.i262 = getelementptr inbounds %"class.std::ctype"* %56, i32 0, i32 7, i32 10
  %58 = load i8* %arrayidx.i262, align 1, !tbaa !3
  br label %_ZNKSt5ctypeIcE5widenEc.exit269

if.end.i267:                                      ; preds = %_ZSt13__check_facetISt5ctypeIcEERKT_PS3_.exit316
  call void @_ZNKSt5ctypeIcE13_M_widen_initEv(%"class.std::ctype"* %56)
  %59 = bitcast %"class.std::ctype"* %56 to i8 (%"class.std::ctype"*, i8)***
  %vtable.i264 = load i8 (%"class.std::ctype"*, i8)*** %59, align 4, !tbaa !0
  %vfn.i265 = getelementptr inbounds i8 (%"class.std::ctype"*, i8)** %vtable.i264, i32 6
  %60 = load i8 (%"class.std::ctype"*, i8)** %vfn.i265, align 4
  %call.i266 = call signext i8 %60(%"class.std::ctype"* %56, i8 signext 10)
  br label %_ZNKSt5ctypeIcE5widenEc.exit269

_ZNKSt5ctypeIcE5widenEc.exit269:                  ; preds = %if.then.i263, %if.end.i267
  %retval.0.i268 = phi i8 [ %58, %if.then.i263 ], [ %call.i266, %if.end.i267 ]
  %call1.i114 = call %"class.std::basic_ostream"* @_ZNSo3putEc(%"class.std::basic_ostream"* %call.i107, i8 signext %retval.0.i268)
  %call.i115 = call %"class.std::basic_ostream"* @_ZNSo5flushEv(%"class.std::basic_ostream"* %call1.i114)
  %call1.i117 = call %"class.std::basic_ostream"* @_ZSt16__ostream_insertIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_PKS3_i(%"class.std::basic_ostream"* @_ZSt4cout, i8* getelementptr inbounds ([14 x i8]* @.str9, i32 0, i32 0), i32 13)
  br label %for.body

for.body:                                         ; preds = %_ZNKSt5ctypeIcE5widenEc.exit269, %for.body
  %pos.0321 = phi float* [ getelementptr inbounds (%"class.boost::array"* @_ZZ4mainE1a, i32 0, i32 0, i32 0), %_ZNKSt5ctypeIcE5widenEc.exit269 ], [ %incdec.ptr, %for.body ]
  %61 = load float* %pos.0321, align 4, !tbaa !4
  %conv.i118 = fpext float %61 to double
  %call.i119 = call %"class.std::basic_ostream"* @_ZNSo9_M_insertIdEERSoT_(%"class.std::basic_ostream"* @_ZSt4cout, double %conv.i118)
  call void @llvm.lifetime.start(i64 1, i8* %__c.addr.i)
  store i8 32, i8* %__c.addr.i, align 1, !tbaa !3
  %call.i120 = call %"class.std::basic_ostream"* @_ZSt16__ostream_insertIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_PKS3_i(%"class.std::basic_ostream"* %call.i119, i8* %__c.addr.i, i32 1)
  call void @llvm.lifetime.end(i64 1, i8* %__c.addr.i)
  %incdec.ptr = getelementptr inbounds float* %pos.0321, i32 1
  %cmp = icmp ult float* %incdec.ptr, getelementptr inbounds (%"class.boost::array"* @_ZZ4mainE1a, i32 1, i32 0, i32 0)
  br i1 %cmp, label %for.body, label %for.end

for.end:                                          ; preds = %for.body
  %vtable.i122 = load i8** bitcast (%"class.std::basic_ostream"* @_ZSt4cout to i8**), align 4, !tbaa !0
  %vbase.offset.ptr.i123 = getelementptr i8* %vtable.i122, i32 -12
  %62 = bitcast i8* %vbase.offset.ptr.i123 to i32*
  %vbase.offset.i124 = load i32* %62, align 4
  %add.ptr.i125.sum = add i32 %vbase.offset.i124, 124
  %_M_ctype.i = getelementptr inbounds i8* bitcast (%"class.std::basic_ostream"* @_ZSt4cout to i8*), i32 %add.ptr.i125.sum
  %63 = bitcast i8* %_M_ctype.i to %"class.std::ctype"**
  %64 = load %"class.std::ctype"** %63, align 4, !tbaa !2
  %tobool.i270 = icmp eq %"class.std::ctype"* %64, null
  br i1 %tobool.i270, label %if.then.i271, label %_ZSt13__check_facetISt5ctypeIcEERKT_PS3_.exit

if.then.i271:                                     ; preds = %for.end
  call void @_ZSt16__throw_bad_castv() noreturn
  unreachable

_ZSt13__check_facetISt5ctypeIcEERKT_PS3_.exit:    ; preds = %for.end
  %_M_widen_ok.i = getelementptr inbounds %"class.std::ctype"* %64, i32 0, i32 6
  %65 = load i8* %_M_widen_ok.i, align 1, !tbaa !3
  %tobool.i = icmp eq i8 %65, 0
  br i1 %tobool.i, label %if.end.i, label %if.then.i

if.then.i:                                        ; preds = %_ZSt13__check_facetISt5ctypeIcEERKT_PS3_.exit
  %arrayidx.i = getelementptr inbounds %"class.std::ctype"* %64, i32 0, i32 7, i32 10
  %66 = load i8* %arrayidx.i, align 1, !tbaa !3
  br label %if.then

if.end.i:                                         ; preds = %_ZSt13__check_facetISt5ctypeIcEERKT_PS3_.exit
  call void @_ZNKSt5ctypeIcE13_M_widen_initEv(%"class.std::ctype"* %64)
  %67 = bitcast %"class.std::ctype"* %64 to i8 (%"class.std::ctype"*, i8)***
  %vtable.i150 = load i8 (%"class.std::ctype"*, i8)*** %67, align 4, !tbaa !0
  %vfn.i = getelementptr inbounds i8 (%"class.std::ctype"*, i8)** %vtable.i150, i32 6
  %68 = load i8 (%"class.std::ctype"*, i8)** %vfn.i, align 4
  %call.i151 = call signext i8 %68(%"class.std::ctype"* %64, i8 signext 10)
  br label %if.then

if.then:                                          ; preds = %if.then.i, %if.end.i
  %retval.0.i = phi i8 [ %66, %if.then.i ], [ %call.i151, %if.end.i ]
  %call1.i127 = call %"class.std::basic_ostream"* @_ZNSo3putEc(%"class.std::basic_ostream"* @_ZSt4cout, i8 signext %retval.0.i)
  %call.i128 = call %"class.std::basic_ostream"* @_ZNSo5flushEv(%"class.std::basic_ostream"* %call1.i127)
  call void @_Z16test_static_sizeIN5boost5arrayIfLj6EEEEvRKT_(%"class.boost::array"* @_ZZ4mainE1a)
  %call1.i153 = call %"class.std::basic_ostream"* @_ZSt16__ostream_insertIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_PKS3_i(%"class.std::basic_ostream"* @_ZSt4cout, i8* getelementptr inbounds ([45 x i8]* @.str10, i32 0, i32 0), i32 44)
  %vtable.i156 = load i8** bitcast (%"class.std::basic_ostream"* @_ZSt4cout to i8**), align 4, !tbaa !0
  %vbase.offset.ptr.i157 = getelementptr i8* %vtable.i156, i32 -12
  %69 = bitcast i8* %vbase.offset.ptr.i157 to i32*
  %vbase.offset.i158 = load i32* %69, align 4
  %add.ptr.i159.sum = add i32 %vbase.offset.i158, 124
  %_M_ctype.i273 = getelementptr inbounds i8* bitcast (%"class.std::basic_ostream"* @_ZSt4cout to i8*), i32 %add.ptr.i159.sum
  %70 = bitcast i8* %_M_ctype.i273 to %"class.std::ctype"**
  %71 = load %"class.std::ctype"** %70, align 4, !tbaa !2
  %tobool.i317 = icmp eq %"class.std::ctype"* %71, null
  br i1 %tobool.i317, label %if.then.i318, label %_ZSt13__check_facetISt5ctypeIcEERKT_PS3_.exit320

if.then.i318:                                     ; preds = %if.then
  call void @_ZSt16__throw_bad_castv() noreturn
  unreachable

_ZSt13__check_facetISt5ctypeIcEERKT_PS3_.exit320: ; preds = %if.then
  %_M_widen_ok.i275 = getelementptr inbounds %"class.std::ctype"* %71, i32 0, i32 6
  %72 = load i8* %_M_widen_ok.i275, align 1, !tbaa !3
  %tobool.i276 = icmp eq i8 %72, 0
  br i1 %tobool.i276, label %if.end.i282, label %if.then.i278

if.then.i278:                                     ; preds = %_ZSt13__check_facetISt5ctypeIcEERKT_PS3_.exit320
  %arrayidx.i277 = getelementptr inbounds %"class.std::ctype"* %71, i32 0, i32 7, i32 10
  %73 = load i8* %arrayidx.i277, align 1, !tbaa !3
  br label %if.end

if.end.i282:                                      ; preds = %_ZSt13__check_facetISt5ctypeIcEERKT_PS3_.exit320
  call void @_ZNKSt5ctypeIcE13_M_widen_initEv(%"class.std::ctype"* %71)
  %74 = bitcast %"class.std::ctype"* %71 to i8 (%"class.std::ctype"*, i8)***
  %vtable.i279 = load i8 (%"class.std::ctype"*, i8)*** %74, align 4, !tbaa !0
  %vfn.i280 = getelementptr inbounds i8 (%"class.std::ctype"*, i8)** %vtable.i279, i32 6
  %75 = load i8 (%"class.std::ctype"*, i8)** %vfn.i280, align 4
  %call.i281 = call signext i8 %75(%"class.std::ctype"* %71, i8 signext 10)
  br label %if.end

if.end:                                           ; preds = %if.end.i282, %if.then.i278
  %retval.0.i283 = phi i8 [ %73, %if.then.i278 ], [ %call.i281, %if.end.i282 ]
  %call1.i161 = call %"class.std::basic_ostream"* @_ZNSo3putEc(%"class.std::basic_ostream"* @_ZSt4cout, i8 signext %retval.0.i283)
  %call.i162 = call %"class.std::basic_ostream"* @_ZNSo5flushEv(%"class.std::basic_ostream"* %call1.i161)
  ret i32 0
}

define linkonce_odr void @_Z16test_static_sizeIN5boost5arrayIfLj6EEEEvRKT_(%"class.boost::array"* nocapture %cont) {
entry:
  %__c.addr.i = alloca i8, align 1
  %arrayidx.i = getelementptr inbounds %"class.boost::array"* %cont, i32 0, i32 0, i32 0
  %0 = load float* %arrayidx.i, align 4, !tbaa !4
  %conv = fptosi float %0 to i32
  %arrayidx.i.1 = getelementptr inbounds %"class.boost::array"* %cont, i32 0, i32 0, i32 1
  %1 = load float* %arrayidx.i.1, align 4, !tbaa !4
  %conv.1 = fptosi float %1 to i32
  %arrayidx.i.2 = getelementptr inbounds %"class.boost::array"* %cont, i32 0, i32 0, i32 2
  %2 = load float* %arrayidx.i.2, align 4, !tbaa !4
  %conv.2 = fptosi float %2 to i32
  %arrayidx.i.3 = getelementptr inbounds %"class.boost::array"* %cont, i32 0, i32 0, i32 3
  %3 = load float* %arrayidx.i.3, align 4, !tbaa !4
  %conv.3 = fptosi float %3 to i32
  %arrayidx.i.4 = getelementptr inbounds %"class.boost::array"* %cont, i32 0, i32 0, i32 4
  %4 = load float* %arrayidx.i.4, align 4, !tbaa !4
  %conv.4 = fptosi float %4 to i32
  %arrayidx.i.5 = getelementptr inbounds %"class.boost::array"* %cont, i32 0, i32 0, i32 5
  %5 = load float* %arrayidx.i.5, align 4, !tbaa !4
  %conv.5 = fptosi float %5 to i32
  %call7 = call %"class.std::basic_ostream"* @_ZNSolsEi(%"class.std::basic_ostream"* @_ZSt4cout, i32 %conv)
  call void @llvm.lifetime.start(i64 1, i8* %__c.addr.i)
  store i8 32, i8* %__c.addr.i, align 1, !tbaa !3
  %call.i = call %"class.std::basic_ostream"* @_ZSt16__ostream_insertIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_PKS3_i(%"class.std::basic_ostream"* %call7, i8* %__c.addr.i, i32 1)
  call void @llvm.lifetime.end(i64 1, i8* %__c.addr.i)
  %call7.1 = call %"class.std::basic_ostream"* @_ZNSolsEi(%"class.std::basic_ostream"* @_ZSt4cout, i32 %conv.1)
  call void @llvm.lifetime.start(i64 1, i8* %__c.addr.i)
  store i8 32, i8* %__c.addr.i, align 1, !tbaa !3
  %call.i.1 = call %"class.std::basic_ostream"* @_ZSt16__ostream_insertIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_PKS3_i(%"class.std::basic_ostream"* %call7.1, i8* %__c.addr.i, i32 1)
  call void @llvm.lifetime.end(i64 1, i8* %__c.addr.i)
  %call7.2 = call %"class.std::basic_ostream"* @_ZNSolsEi(%"class.std::basic_ostream"* @_ZSt4cout, i32 %conv.2)
  call void @llvm.lifetime.start(i64 1, i8* %__c.addr.i)
  store i8 32, i8* %__c.addr.i, align 1, !tbaa !3
  %call.i.2 = call %"class.std::basic_ostream"* @_ZSt16__ostream_insertIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_PKS3_i(%"class.std::basic_ostream"* %call7.2, i8* %__c.addr.i, i32 1)
  call void @llvm.lifetime.end(i64 1, i8* %__c.addr.i)
  %call7.3 = call %"class.std::basic_ostream"* @_ZNSolsEi(%"class.std::basic_ostream"* @_ZSt4cout, i32 %conv.3)
  call void @llvm.lifetime.start(i64 1, i8* %__c.addr.i)
  store i8 32, i8* %__c.addr.i, align 1, !tbaa !3
  %call.i.3 = call %"class.std::basic_ostream"* @_ZSt16__ostream_insertIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_PKS3_i(%"class.std::basic_ostream"* %call7.3, i8* %__c.addr.i, i32 1)
  call void @llvm.lifetime.end(i64 1, i8* %__c.addr.i)
  %call7.4 = call %"class.std::basic_ostream"* @_ZNSolsEi(%"class.std::basic_ostream"* @_ZSt4cout, i32 %conv.4)
  call void @llvm.lifetime.start(i64 1, i8* %__c.addr.i)
  store i8 32, i8* %__c.addr.i, align 1, !tbaa !3
  %call.i.4 = call %"class.std::basic_ostream"* @_ZSt16__ostream_insertIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_PKS3_i(%"class.std::basic_ostream"* %call7.4, i8* %__c.addr.i, i32 1)
  call void @llvm.lifetime.end(i64 1, i8* %__c.addr.i)
  %call7.5 = call %"class.std::basic_ostream"* @_ZNSolsEi(%"class.std::basic_ostream"* @_ZSt4cout, i32 %conv.5)
  call void @llvm.lifetime.start(i64 1, i8* %__c.addr.i)
  store i8 32, i8* %__c.addr.i, align 1, !tbaa !3
  %call.i.5 = call %"class.std::basic_ostream"* @_ZSt16__ostream_insertIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_PKS3_i(%"class.std::basic_ostream"* %call7.5, i8* %__c.addr.i, i32 1)
  call void @llvm.lifetime.end(i64 1, i8* %__c.addr.i)
  %vtable.i = load i8** bitcast (%"class.std::basic_ostream"* @_ZSt4cout to i8**), align 4, !tbaa !0
  %vbase.offset.ptr.i = getelementptr i8* %vtable.i, i32 -12
  %6 = bitcast i8* %vbase.offset.ptr.i to i32*
  %vbase.offset.i = load i32* %6, align 4
  %add.ptr.i.sum = add i32 %vbase.offset.i, 124
  %_M_ctype.i = getelementptr inbounds i8* bitcast (%"class.std::basic_ostream"* @_ZSt4cout to i8*), i32 %add.ptr.i.sum
  %7 = bitcast i8* %_M_ctype.i to %"class.std::ctype"**
  %8 = load %"class.std::ctype"** %7, align 4, !tbaa !2
  %tobool.i25 = icmp eq %"class.std::ctype"* %8, null
  br i1 %tobool.i25, label %if.then.i26, label %_ZSt13__check_facetISt5ctypeIcEERKT_PS3_.exit

if.then.i26:                                      ; preds = %entry
  call void @_ZSt16__throw_bad_castv() noreturn
  unreachable

_ZSt13__check_facetISt5ctypeIcEERKT_PS3_.exit:    ; preds = %entry
  %_M_widen_ok.i = getelementptr inbounds %"class.std::ctype"* %8, i32 0, i32 6
  %9 = load i8* %_M_widen_ok.i, align 1, !tbaa !3
  %tobool.i = icmp eq i8 %9, 0
  br i1 %tobool.i, label %if.end.i, label %if.then.i

if.then.i:                                        ; preds = %_ZSt13__check_facetISt5ctypeIcEERKT_PS3_.exit
  %arrayidx.i22 = getelementptr inbounds %"class.std::ctype"* %8, i32 0, i32 7, i32 10
  %10 = load i8* %arrayidx.i22, align 1, !tbaa !3
  br label %_ZNKSt5ctypeIcE5widenEc.exit

if.end.i:                                         ; preds = %_ZSt13__check_facetISt5ctypeIcEERKT_PS3_.exit
  call void @_ZNKSt5ctypeIcE13_M_widen_initEv(%"class.std::ctype"* %8)
  %11 = bitcast %"class.std::ctype"* %8 to i8 (%"class.std::ctype"*, i8)***
  %vtable.i23 = load i8 (%"class.std::ctype"*, i8)*** %11, align 4, !tbaa !0
  %vfn.i = getelementptr inbounds i8 (%"class.std::ctype"*, i8)** %vtable.i23, i32 6
  %12 = load i8 (%"class.std::ctype"*, i8)** %vfn.i, align 4
  %call.i24 = call signext i8 %12(%"class.std::ctype"* %8, i8 signext 10)
  br label %_ZNKSt5ctypeIcE5widenEc.exit

_ZNKSt5ctypeIcE5widenEc.exit:                     ; preds = %if.then.i, %if.end.i
  %retval.0.i = phi i8 [ %10, %if.then.i ], [ %call.i24, %if.end.i ]
  %call1.i = call %"class.std::basic_ostream"* @_ZNSo3putEc(%"class.std::basic_ostream"* @_ZSt4cout, i8 signext %retval.0.i)
  %call.i20 = call %"class.std::basic_ostream"* @_ZNSo5flushEv(%"class.std::basic_ostream"* %call1.i)
  ret void
}

declare %"class.std::basic_ostream"* @_ZNSolsEi(%"class.std::basic_ostream"*, i32)

declare %"class.std::basic_ostream"* @_ZNSo9_M_insertIdEERSoT_(%"class.std::basic_ostream"*, double)

declare %"class.std::basic_ostream"* @_ZNSo9_M_insertImEERSoT_(%"class.std::basic_ostream"*, i32)

declare %"class.std::basic_ostream"* @_ZNSo3putEc(%"class.std::basic_ostream"*, i8 signext)

declare void @_ZNKSt5ctypeIcE13_M_widen_initEv(%"class.std::ctype"*)

declare void @_ZSt16__throw_bad_castv() noreturn

declare %"class.std::basic_ostream"* @_ZNSo5flushEv(%"class.std::basic_ostream"*)

declare %"class.std::basic_ostream"* @_ZSt16__ostream_insertIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_PKS3_i(%"class.std::basic_ostream"*, i8*, i32)

define internal void @_GLOBAL__I_a() section ".text.startup" {
entry:
  tail call void @_ZNSt8ios_base4InitC1Ev(%"class.std::ios_base::Init"* @_ZStL8__ioinit)
  %0 = tail call i32 @__cxa_atexit(void (i8*)* bitcast (void (%"class.std::ios_base::Init"*)* @_ZNSt8ios_base4InitD1Ev to void (i8*)*), i8* getelementptr inbounds (%"class.std::ios_base::Init"* @_ZStL8__ioinit, i32 0, i32 0), i8* @__dso_handle) nounwind
  ret void
}

declare void @llvm.lifetime.start(i64, i8* nocapture) nounwind

declare void @llvm.lifetime.end(i64, i8* nocapture) nounwind

!0 = metadata !{metadata !"vtable pointer", metadata !1}
!1 = metadata !{metadata !"Simple C/C++ TBAA"}
!2 = metadata !{metadata !"any pointer", metadata !3}
!3 = metadata !{metadata !"omnipotent char", metadata !1}
!4 = metadata !{metadata !"float", metadata !3}
