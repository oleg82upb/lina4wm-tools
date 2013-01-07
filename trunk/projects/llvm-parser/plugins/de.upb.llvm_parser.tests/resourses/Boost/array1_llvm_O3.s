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
@.str3 = private unnamed_addr constant [6 x i8] c"false\00", align 1
@.str4 = private unnamed_addr constant [11 x i8] c"max_size: \00", align 1
@.str5 = private unnamed_addr constant [11 x i8] c"front:    \00", align 1
@.str6 = private unnamed_addr constant [11 x i8] c"back:     \00", align 1
@.str7 = private unnamed_addr constant [11 x i8] c"elems:    \00", align 1
@.str8 = private unnamed_addr constant [45 x i8] c"copy construction and copy assignment are OK\00", align 1
@.str9 = private unnamed_addr constant [45 x i8] c"copy construction and copy assignment FAILED\00", align 1
@llvm.global_ctors = appending global [1 x { i32, void ()* }] [{ i32, void ()* } { i32 65535, void ()* @_GLOBAL__I_a }]

declare void @_ZNSt8ios_base4InitC1Ev(%"class.std::ios_base::Init"*)

declare void @_ZNSt8ios_base4InitD1Ev(%"class.std::ios_base::Init"*)

declare i32 @__cxa_atexit(void (i8*)*, i8*, i8*) nounwind

define i32 @main() {
_ZN5boost5arrayIfLj6EEixEj.exit49.4:
  %__c.addr.i = alloca i8, align 1
  %a = alloca %"class.boost::array", align 4
  %0 = bitcast %"class.boost::array"* %a to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %0, i8* bitcast (%"class.boost::array"* @_ZZ4mainE1a to i8*), i32 20, i32 4, i1 false)
  %arrayidx.i = getelementptr inbounds %"class.boost::array"* %a, i32 0, i32 0, i32 0
  %arrayidx.i48 = getelementptr inbounds %"class.boost::array"* %a, i32 0, i32 0, i32 1
  store float 4.300000e+01, float* %arrayidx.i48, align 4, !tbaa !0
  %arrayidx.i48.1 = getelementptr inbounds %"class.boost::array"* %a, i32 0, i32 0, i32 2
  store float 4.400000e+01, float* %arrayidx.i48.1, align 4, !tbaa !0
  %arrayidx.i48.2 = getelementptr inbounds %"class.boost::array"* %a, i32 0, i32 0, i32 3
  store float 4.500000e+01, float* %arrayidx.i48.2, align 4, !tbaa !0
  %arrayidx.i48.3 = getelementptr inbounds %"class.boost::array"* %a, i32 0, i32 0, i32 4
  store float 4.600000e+01, float* %arrayidx.i48.3, align 4, !tbaa !0
  %arrayidx.i48.4 = getelementptr inbounds %"class.boost::array"* %a, i32 0, i32 0, i32 5
  store float 4.700000e+01, float* %arrayidx.i48.4, align 4, !tbaa !0
  %call1.i50 = call %"class.std::basic_ostream"* @_ZSt16__ostream_insertIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_PKS3_i(%"class.std::basic_ostream"* @_ZSt4cout, i8* getelementptr inbounds ([11 x i8]* @.str, i32 0, i32 0), i32 10)
  %call.i51 = call %"class.std::basic_ostream"* @_ZNSo9_M_insertImEERSoT_(%"class.std::basic_ostream"* @_ZSt4cout, i32 6)
  %1 = bitcast %"class.std::basic_ostream"* %call.i51 to i8**
  %vtable.i53 = load i8** %1, align 4, !tbaa !3
  %vbase.offset.ptr.i54 = getelementptr i8* %vtable.i53, i32 -12
  %2 = bitcast i8* %vbase.offset.ptr.i54 to i32*
  %vbase.offset.i55 = load i32* %2, align 4
  %3 = bitcast %"class.std::basic_ostream"* %call.i51 to i8*
  %add.ptr.i56.sum = add i32 %vbase.offset.i55, 124
  %_M_ctype.i178 = getelementptr inbounds i8* %3, i32 %add.ptr.i56.sum
  %4 = bitcast i8* %_M_ctype.i178 to %"class.std::ctype"**
  %5 = load %"class.std::ctype"** %4, align 4, !tbaa !4
  %tobool.i257 = icmp eq %"class.std::ctype"* %5, null
  br i1 %tobool.i257, label %if.then.i258, label %_ZSt13__check_facetISt5ctypeIcEERKT_PS3_.exit260

if.then.i258:                                     ; preds = %_ZN5boost5arrayIfLj6EEixEj.exit49.4
  call void @_ZSt16__throw_bad_castv() noreturn
  unreachable

_ZSt13__check_facetISt5ctypeIcEERKT_PS3_.exit260: ; preds = %_ZN5boost5arrayIfLj6EEixEj.exit49.4
  %_M_widen_ok.i180 = getelementptr inbounds %"class.std::ctype"* %5, i32 0, i32 6
  %6 = load i8* %_M_widen_ok.i180, align 1, !tbaa !1
  %tobool.i181 = icmp eq i8 %6, 0
  br i1 %tobool.i181, label %if.end.i187, label %if.then.i183

if.then.i183:                                     ; preds = %_ZSt13__check_facetISt5ctypeIcEERKT_PS3_.exit260
  %arrayidx.i182 = getelementptr inbounds %"class.std::ctype"* %5, i32 0, i32 7, i32 10
  %7 = load i8* %arrayidx.i182, align 1, !tbaa !1
  br label %_ZNKSt5ctypeIcE5widenEc.exit189

if.end.i187:                                      ; preds = %_ZSt13__check_facetISt5ctypeIcEERKT_PS3_.exit260
  call void @_ZNKSt5ctypeIcE13_M_widen_initEv(%"class.std::ctype"* %5)
  %8 = bitcast %"class.std::ctype"* %5 to i8 (%"class.std::ctype"*, i8)***
  %vtable.i184 = load i8 (%"class.std::ctype"*, i8)*** %8, align 4, !tbaa !3
  %vfn.i185 = getelementptr inbounds i8 (%"class.std::ctype"*, i8)** %vtable.i184, i32 6
  %9 = load i8 (%"class.std::ctype"*, i8)** %vfn.i185, align 4
  %call.i186 = call signext i8 %9(%"class.std::ctype"* %5, i8 signext 10)
  br label %_ZNKSt5ctypeIcE5widenEc.exit189

_ZNKSt5ctypeIcE5widenEc.exit189:                  ; preds = %if.then.i183, %if.end.i187
  %retval.0.i188 = phi i8 [ %7, %if.then.i183 ], [ %call.i186, %if.end.i187 ]
  %call1.i58 = call %"class.std::basic_ostream"* @_ZNSo3putEc(%"class.std::basic_ostream"* %call.i51, i8 signext %retval.0.i188)
  %call.i59 = call %"class.std::basic_ostream"* @_ZNSo5flushEv(%"class.std::basic_ostream"* %call1.i58)
  %call1.i61 = call %"class.std::basic_ostream"* @_ZSt16__ostream_insertIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_PKS3_i(%"class.std::basic_ostream"* @_ZSt4cout, i8* getelementptr inbounds ([11 x i8]* @.str1, i32 0, i32 0), i32 10)
  %call1.i63 = call %"class.std::basic_ostream"* @_ZSt16__ostream_insertIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_PKS3_i(%"class.std::basic_ostream"* @_ZSt4cout, i8* getelementptr inbounds ([6 x i8]* @.str3, i32 0, i32 0), i32 5)
  %vtable.i65 = load i8** bitcast (%"class.std::basic_ostream"* @_ZSt4cout to i8**), align 4, !tbaa !3
  %vbase.offset.ptr.i66 = getelementptr i8* %vtable.i65, i32 -12
  %10 = bitcast i8* %vbase.offset.ptr.i66 to i32*
  %vbase.offset.i67 = load i32* %10, align 4
  %add.ptr.i68.sum = add i32 %vbase.offset.i67, 124
  %_M_ctype.i190 = getelementptr inbounds i8* bitcast (%"class.std::basic_ostream"* @_ZSt4cout to i8*), i32 %add.ptr.i68.sum
  %11 = bitcast i8* %_M_ctype.i190 to %"class.std::ctype"**
  %12 = load %"class.std::ctype"** %11, align 4, !tbaa !4
  %tobool.i261 = icmp eq %"class.std::ctype"* %12, null
  br i1 %tobool.i261, label %if.then.i262, label %_ZSt13__check_facetISt5ctypeIcEERKT_PS3_.exit264

if.then.i262:                                     ; preds = %_ZNKSt5ctypeIcE5widenEc.exit189
  call void @_ZSt16__throw_bad_castv() noreturn
  unreachable

_ZSt13__check_facetISt5ctypeIcEERKT_PS3_.exit264: ; preds = %_ZNKSt5ctypeIcE5widenEc.exit189
  %_M_widen_ok.i192 = getelementptr inbounds %"class.std::ctype"* %12, i32 0, i32 6
  %13 = load i8* %_M_widen_ok.i192, align 1, !tbaa !1
  %tobool.i193 = icmp eq i8 %13, 0
  br i1 %tobool.i193, label %if.end.i199, label %if.then.i195

if.then.i195:                                     ; preds = %_ZSt13__check_facetISt5ctypeIcEERKT_PS3_.exit264
  %arrayidx.i194 = getelementptr inbounds %"class.std::ctype"* %12, i32 0, i32 7, i32 10
  %14 = load i8* %arrayidx.i194, align 1, !tbaa !1
  br label %_ZNKSt5ctypeIcE5widenEc.exit201

if.end.i199:                                      ; preds = %_ZSt13__check_facetISt5ctypeIcEERKT_PS3_.exit264
  call void @_ZNKSt5ctypeIcE13_M_widen_initEv(%"class.std::ctype"* %12)
  %15 = bitcast %"class.std::ctype"* %12 to i8 (%"class.std::ctype"*, i8)***
  %vtable.i196 = load i8 (%"class.std::ctype"*, i8)*** %15, align 4, !tbaa !3
  %vfn.i197 = getelementptr inbounds i8 (%"class.std::ctype"*, i8)** %vtable.i196, i32 6
  %16 = load i8 (%"class.std::ctype"*, i8)** %vfn.i197, align 4
  %call.i198 = call signext i8 %16(%"class.std::ctype"* %12, i8 signext 10)
  br label %_ZNKSt5ctypeIcE5widenEc.exit201

_ZNKSt5ctypeIcE5widenEc.exit201:                  ; preds = %if.then.i195, %if.end.i199
  %retval.0.i200 = phi i8 [ %14, %if.then.i195 ], [ %call.i198, %if.end.i199 ]
  %call1.i70 = call %"class.std::basic_ostream"* @_ZNSo3putEc(%"class.std::basic_ostream"* @_ZSt4cout, i8 signext %retval.0.i200)
  %call.i71 = call %"class.std::basic_ostream"* @_ZNSo5flushEv(%"class.std::basic_ostream"* %call1.i70)
  %call1.i73 = call %"class.std::basic_ostream"* @_ZSt16__ostream_insertIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_PKS3_i(%"class.std::basic_ostream"* @_ZSt4cout, i8* getelementptr inbounds ([11 x i8]* @.str4, i32 0, i32 0), i32 10)
  %call.i74 = call %"class.std::basic_ostream"* @_ZNSo9_M_insertImEERSoT_(%"class.std::basic_ostream"* @_ZSt4cout, i32 6)
  %17 = bitcast %"class.std::basic_ostream"* %call.i74 to i8**
  %vtable.i76 = load i8** %17, align 4, !tbaa !3
  %vbase.offset.ptr.i77 = getelementptr i8* %vtable.i76, i32 -12
  %18 = bitcast i8* %vbase.offset.ptr.i77 to i32*
  %vbase.offset.i78 = load i32* %18, align 4
  %19 = bitcast %"class.std::basic_ostream"* %call.i74 to i8*
  %add.ptr.i79.sum = add i32 %vbase.offset.i78, 124
  %_M_ctype.i202 = getelementptr inbounds i8* %19, i32 %add.ptr.i79.sum
  %20 = bitcast i8* %_M_ctype.i202 to %"class.std::ctype"**
  %21 = load %"class.std::ctype"** %20, align 4, !tbaa !4
  %tobool.i265 = icmp eq %"class.std::ctype"* %21, null
  br i1 %tobool.i265, label %if.then.i266, label %_ZSt13__check_facetISt5ctypeIcEERKT_PS3_.exit268

if.then.i266:                                     ; preds = %_ZNKSt5ctypeIcE5widenEc.exit201
  call void @_ZSt16__throw_bad_castv() noreturn
  unreachable

_ZSt13__check_facetISt5ctypeIcEERKT_PS3_.exit268: ; preds = %_ZNKSt5ctypeIcE5widenEc.exit201
  %_M_widen_ok.i204 = getelementptr inbounds %"class.std::ctype"* %21, i32 0, i32 6
  %22 = load i8* %_M_widen_ok.i204, align 1, !tbaa !1
  %tobool.i205 = icmp eq i8 %22, 0
  br i1 %tobool.i205, label %if.end.i211, label %if.then.i207

if.then.i207:                                     ; preds = %_ZSt13__check_facetISt5ctypeIcEERKT_PS3_.exit268
  %arrayidx.i206 = getelementptr inbounds %"class.std::ctype"* %21, i32 0, i32 7, i32 10
  %23 = load i8* %arrayidx.i206, align 1, !tbaa !1
  br label %_ZNKSt5ctypeIcE5widenEc.exit213

if.end.i211:                                      ; preds = %_ZSt13__check_facetISt5ctypeIcEERKT_PS3_.exit268
  call void @_ZNKSt5ctypeIcE13_M_widen_initEv(%"class.std::ctype"* %21)
  %24 = bitcast %"class.std::ctype"* %21 to i8 (%"class.std::ctype"*, i8)***
  %vtable.i208 = load i8 (%"class.std::ctype"*, i8)*** %24, align 4, !tbaa !3
  %vfn.i209 = getelementptr inbounds i8 (%"class.std::ctype"*, i8)** %vtable.i208, i32 6
  %25 = load i8 (%"class.std::ctype"*, i8)** %vfn.i209, align 4
  %call.i210 = call signext i8 %25(%"class.std::ctype"* %21, i8 signext 10)
  br label %_ZNKSt5ctypeIcE5widenEc.exit213

_ZNKSt5ctypeIcE5widenEc.exit213:                  ; preds = %if.then.i207, %if.end.i211
  %retval.0.i212 = phi i8 [ %23, %if.then.i207 ], [ %call.i210, %if.end.i211 ]
  %call1.i81 = call %"class.std::basic_ostream"* @_ZNSo3putEc(%"class.std::basic_ostream"* %call.i74, i8 signext %retval.0.i212)
  %call.i82 = call %"class.std::basic_ostream"* @_ZNSo5flushEv(%"class.std::basic_ostream"* %call1.i81)
  %call1.i84 = call %"class.std::basic_ostream"* @_ZSt16__ostream_insertIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_PKS3_i(%"class.std::basic_ostream"* @_ZSt4cout, i8* getelementptr inbounds ([11 x i8]* @.str5, i32 0, i32 0), i32 10)
  %26 = load float* %arrayidx.i, align 4, !tbaa !0
  %conv.i = fpext float %26 to double
  %call.i86 = call %"class.std::basic_ostream"* @_ZNSo9_M_insertIdEERSoT_(%"class.std::basic_ostream"* @_ZSt4cout, double %conv.i)
  %27 = bitcast %"class.std::basic_ostream"* %call.i86 to i8**
  %vtable.i88 = load i8** %27, align 4, !tbaa !3
  %vbase.offset.ptr.i89 = getelementptr i8* %vtable.i88, i32 -12
  %28 = bitcast i8* %vbase.offset.ptr.i89 to i32*
  %vbase.offset.i90 = load i32* %28, align 4
  %29 = bitcast %"class.std::basic_ostream"* %call.i86 to i8*
  %add.ptr.i91.sum = add i32 %vbase.offset.i90, 124
  %_M_ctype.i214 = getelementptr inbounds i8* %29, i32 %add.ptr.i91.sum
  %30 = bitcast i8* %_M_ctype.i214 to %"class.std::ctype"**
  %31 = load %"class.std::ctype"** %30, align 4, !tbaa !4
  %tobool.i269 = icmp eq %"class.std::ctype"* %31, null
  br i1 %tobool.i269, label %if.then.i270, label %_ZSt13__check_facetISt5ctypeIcEERKT_PS3_.exit272

if.then.i270:                                     ; preds = %_ZNKSt5ctypeIcE5widenEc.exit213
  call void @_ZSt16__throw_bad_castv() noreturn
  unreachable

_ZSt13__check_facetISt5ctypeIcEERKT_PS3_.exit272: ; preds = %_ZNKSt5ctypeIcE5widenEc.exit213
  %_M_widen_ok.i216 = getelementptr inbounds %"class.std::ctype"* %31, i32 0, i32 6
  %32 = load i8* %_M_widen_ok.i216, align 1, !tbaa !1
  %tobool.i217 = icmp eq i8 %32, 0
  br i1 %tobool.i217, label %if.end.i223, label %if.then.i219

if.then.i219:                                     ; preds = %_ZSt13__check_facetISt5ctypeIcEERKT_PS3_.exit272
  %arrayidx.i218 = getelementptr inbounds %"class.std::ctype"* %31, i32 0, i32 7, i32 10
  %33 = load i8* %arrayidx.i218, align 1, !tbaa !1
  br label %_ZNKSt5ctypeIcE5widenEc.exit225

if.end.i223:                                      ; preds = %_ZSt13__check_facetISt5ctypeIcEERKT_PS3_.exit272
  call void @_ZNKSt5ctypeIcE13_M_widen_initEv(%"class.std::ctype"* %31)
  %34 = bitcast %"class.std::ctype"* %31 to i8 (%"class.std::ctype"*, i8)***
  %vtable.i220 = load i8 (%"class.std::ctype"*, i8)*** %34, align 4, !tbaa !3
  %vfn.i221 = getelementptr inbounds i8 (%"class.std::ctype"*, i8)** %vtable.i220, i32 6
  %35 = load i8 (%"class.std::ctype"*, i8)** %vfn.i221, align 4
  %call.i222 = call signext i8 %35(%"class.std::ctype"* %31, i8 signext 10)
  br label %_ZNKSt5ctypeIcE5widenEc.exit225

_ZNKSt5ctypeIcE5widenEc.exit225:                  ; preds = %if.then.i219, %if.end.i223
  %retval.0.i224 = phi i8 [ %33, %if.then.i219 ], [ %call.i222, %if.end.i223 ]
  %call1.i93 = call %"class.std::basic_ostream"* @_ZNSo3putEc(%"class.std::basic_ostream"* %call.i86, i8 signext %retval.0.i224)
  %call.i94 = call %"class.std::basic_ostream"* @_ZNSo5flushEv(%"class.std::basic_ostream"* %call1.i93)
  %call1.i96 = call %"class.std::basic_ostream"* @_ZSt16__ostream_insertIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_PKS3_i(%"class.std::basic_ostream"* @_ZSt4cout, i8* getelementptr inbounds ([11 x i8]* @.str6, i32 0, i32 0), i32 10)
  %36 = load float* %arrayidx.i48.4, align 4, !tbaa !0
  %conv.i98 = fpext float %36 to double
  %call.i99 = call %"class.std::basic_ostream"* @_ZNSo9_M_insertIdEERSoT_(%"class.std::basic_ostream"* @_ZSt4cout, double %conv.i98)
  %37 = bitcast %"class.std::basic_ostream"* %call.i99 to i8**
  %vtable.i101 = load i8** %37, align 4, !tbaa !3
  %vbase.offset.ptr.i102 = getelementptr i8* %vtable.i101, i32 -12
  %38 = bitcast i8* %vbase.offset.ptr.i102 to i32*
  %vbase.offset.i103 = load i32* %38, align 4
  %39 = bitcast %"class.std::basic_ostream"* %call.i99 to i8*
  %add.ptr.i104.sum = add i32 %vbase.offset.i103, 124
  %_M_ctype.i226 = getelementptr inbounds i8* %39, i32 %add.ptr.i104.sum
  %40 = bitcast i8* %_M_ctype.i226 to %"class.std::ctype"**
  %41 = load %"class.std::ctype"** %40, align 4, !tbaa !4
  %tobool.i273 = icmp eq %"class.std::ctype"* %41, null
  br i1 %tobool.i273, label %if.then.i274, label %_ZSt13__check_facetISt5ctypeIcEERKT_PS3_.exit276

if.then.i274:                                     ; preds = %_ZNKSt5ctypeIcE5widenEc.exit225
  call void @_ZSt16__throw_bad_castv() noreturn
  unreachable

_ZSt13__check_facetISt5ctypeIcEERKT_PS3_.exit276: ; preds = %_ZNKSt5ctypeIcE5widenEc.exit225
  %_M_widen_ok.i228 = getelementptr inbounds %"class.std::ctype"* %41, i32 0, i32 6
  %42 = load i8* %_M_widen_ok.i228, align 1, !tbaa !1
  %tobool.i229 = icmp eq i8 %42, 0
  br i1 %tobool.i229, label %if.end.i235, label %if.then.i231

if.then.i231:                                     ; preds = %_ZSt13__check_facetISt5ctypeIcEERKT_PS3_.exit276
  %arrayidx.i230 = getelementptr inbounds %"class.std::ctype"* %41, i32 0, i32 7, i32 10
  %43 = load i8* %arrayidx.i230, align 1, !tbaa !1
  br label %for.body28.lr.ph

if.end.i235:                                      ; preds = %_ZSt13__check_facetISt5ctypeIcEERKT_PS3_.exit276
  call void @_ZNKSt5ctypeIcE13_M_widen_initEv(%"class.std::ctype"* %41)
  %44 = bitcast %"class.std::ctype"* %41 to i8 (%"class.std::ctype"*, i8)***
  %vtable.i232 = load i8 (%"class.std::ctype"*, i8)*** %44, align 4, !tbaa !3
  %vfn.i233 = getelementptr inbounds i8 (%"class.std::ctype"*, i8)** %vtable.i232, i32 6
  %45 = load i8 (%"class.std::ctype"*, i8)** %vfn.i233, align 4
  %call.i234 = call signext i8 %45(%"class.std::ctype"* %41, i8 signext 10)
  br label %for.body28.lr.ph

for.body28.lr.ph:                                 ; preds = %if.end.i235, %if.then.i231
  %retval.0.i236 = phi i8 [ %43, %if.then.i231 ], [ %call.i234, %if.end.i235 ]
  %call1.i106 = call %"class.std::basic_ostream"* @_ZNSo3putEc(%"class.std::basic_ostream"* %call.i99, i8 signext %retval.0.i236)
  %call.i107 = call %"class.std::basic_ostream"* @_ZNSo5flushEv(%"class.std::basic_ostream"* %call1.i106)
  %call1.i109 = call %"class.std::basic_ostream"* @_ZSt16__ostream_insertIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_PKS3_i(%"class.std::basic_ostream"* @_ZSt4cout, i8* getelementptr inbounds ([11 x i8]* @.str7, i32 0, i32 0), i32 10)
  %add.ptr.i110 = getelementptr inbounds %"class.boost::array"* %a, i32 0, i32 0, i32 6
  br label %for.body28

for.body28:                                       ; preds = %for.body28, %for.body28.lr.ph
  %pos.0296 = phi float* [ %arrayidx.i, %for.body28.lr.ph ], [ %incdec.ptr, %for.body28 ]
  %46 = load float* %pos.0296, align 4, !tbaa !0
  %conv.i111 = fpext float %46 to double
  %call.i112 = call %"class.std::basic_ostream"* @_ZNSo9_M_insertIdEERSoT_(%"class.std::basic_ostream"* @_ZSt4cout, double %conv.i111)
  call void @llvm.lifetime.start(i64 1, i8* %__c.addr.i)
  store i8 32, i8* %__c.addr.i, align 1, !tbaa !1
  %call.i113 = call %"class.std::basic_ostream"* @_ZSt16__ostream_insertIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_PKS3_i(%"class.std::basic_ostream"* %call.i112, i8* %__c.addr.i, i32 1)
  call void @llvm.lifetime.end(i64 1, i8* %__c.addr.i)
  %incdec.ptr = getelementptr inbounds float* %pos.0296, i32 1
  %cmp27 = icmp ult float* %incdec.ptr, %add.ptr.i110
  br i1 %cmp27, label %for.body28, label %for.end32

for.end32:                                        ; preds = %for.body28
  %vtable.i115 = load i8** bitcast (%"class.std::basic_ostream"* @_ZSt4cout to i8**), align 4, !tbaa !3
  %vbase.offset.ptr.i116 = getelementptr i8* %vtable.i115, i32 -12
  %47 = bitcast i8* %vbase.offset.ptr.i116 to i32*
  %vbase.offset.i117 = load i32* %47, align 4
  %add.ptr.i118.sum = add i32 %vbase.offset.i117, 124
  %_M_ctype.i = getelementptr inbounds i8* bitcast (%"class.std::basic_ostream"* @_ZSt4cout to i8*), i32 %add.ptr.i118.sum
  %48 = bitcast i8* %_M_ctype.i to %"class.std::ctype"**
  %49 = load %"class.std::ctype"** %48, align 4, !tbaa !4
  %tobool.i238 = icmp eq %"class.std::ctype"* %49, null
  br i1 %tobool.i238, label %if.then.i239, label %_ZSt13__check_facetISt5ctypeIcEERKT_PS3_.exit

if.then.i239:                                     ; preds = %for.end32
  call void @_ZSt16__throw_bad_castv() noreturn
  unreachable

_ZSt13__check_facetISt5ctypeIcEERKT_PS3_.exit:    ; preds = %for.end32
  %_M_widen_ok.i = getelementptr inbounds %"class.std::ctype"* %49, i32 0, i32 6
  %50 = load i8* %_M_widen_ok.i, align 1, !tbaa !1
  %tobool.i = icmp eq i8 %50, 0
  br i1 %tobool.i, label %if.end.i, label %if.then.i

if.then.i:                                        ; preds = %_ZSt13__check_facetISt5ctypeIcEERKT_PS3_.exit
  %arrayidx.i149 = getelementptr inbounds %"class.std::ctype"* %49, i32 0, i32 7, i32 10
  %51 = load i8* %arrayidx.i149, align 1, !tbaa !1
  br label %_ZNKSt5ctypeIcE5widenEc.exit

if.end.i:                                         ; preds = %_ZSt13__check_facetISt5ctypeIcEERKT_PS3_.exit
  call void @_ZNKSt5ctypeIcE13_M_widen_initEv(%"class.std::ctype"* %49)
  %52 = bitcast %"class.std::ctype"* %49 to i8 (%"class.std::ctype"*, i8)***
  %vtable.i150 = load i8 (%"class.std::ctype"*, i8)*** %52, align 4, !tbaa !3
  %vfn.i = getelementptr inbounds i8 (%"class.std::ctype"*, i8)** %vtable.i150, i32 6
  %53 = load i8 (%"class.std::ctype"*, i8)** %vfn.i, align 4
  %call.i151 = call signext i8 %53(%"class.std::ctype"* %49, i8 signext 10)
  br label %_ZNKSt5ctypeIcE5widenEc.exit

_ZNKSt5ctypeIcE5widenEc.exit:                     ; preds = %if.then.i, %if.end.i
  %retval.0.i = phi i8 [ %51, %if.then.i ], [ %call.i151, %if.end.i ]
  %call1.i120 = call %"class.std::basic_ostream"* @_ZNSo3putEc(%"class.std::basic_ostream"* @_ZSt4cout, i8 signext %retval.0.i)
  %call.i121 = call %"class.std::basic_ostream"* @_ZNSo5flushEv(%"class.std::basic_ostream"* %call1.i120)
  %b.sroa.0.0.copyload = load float* %arrayidx.i, align 4
  %b.sroa.1.4.copyload = load float* %arrayidx.i48, align 4
  %b.sroa.2.8.copyload = load float* %arrayidx.i48.1, align 4
  %b.sroa.3.12.copyload = load float* %arrayidx.i48.2, align 4
  %b.sroa.4.16.copyload = load float* %arrayidx.i48.3, align 4
  %b.sroa.5.20.copyload = load float* %arrayidx.i48.4, align 4
  %54 = fcmp ord float %b.sroa.0.0.copyload, %b.sroa.1.4.copyload
  %cmp1.i.i.i.2.i = fcmp ord float %b.sroa.2.8.copyload, 0.000000e+00
  %or.cond291 = and i1 %54, %cmp1.i.i.i.2.i
  %cmp1.i.i.i.3.i = fcmp ord float %b.sroa.3.12.copyload, 0.000000e+00
  %or.cond292 = and i1 %or.cond291, %cmp1.i.i.i.3.i
  %cmp1.i.i.i.4.i = fcmp ord float %b.sroa.4.16.copyload, 0.000000e+00
  %or.cond293 = and i1 %or.cond292, %cmp1.i.i.i.4.i
  %cmp1.i.i.i.5.i = fcmp ord float %b.sroa.5.20.copyload, 0.000000e+00
  %or.cond294 = and i1 %or.cond293, %cmp1.i.i.i.5.i
  %cmp1.i.i.i.i124 = fcmp ord float %b.sroa.0.0.copyload, 0.000000e+00
  %or.cond = and i1 %or.cond294, %cmp1.i.i.i.i124
  %cmp1.i.i.i.1.i127 = fcmp ord float %b.sroa.1.4.copyload, 0.000000e+00
  %or.cond298 = and i1 %or.cond, %cmp1.i.i.i.1.i127
  %cmp1.i.i.i.2.i132 = fcmp ord float %b.sroa.2.8.copyload, 0.000000e+00
  %or.cond299 = and i1 %or.cond298, %cmp1.i.i.i.2.i132
  %cmp1.i.i.i.3.i136 = fcmp ord float %b.sroa.3.12.copyload, 0.000000e+00
  %or.cond300 = and i1 %or.cond299, %cmp1.i.i.i.3.i136
  %cmp1.i.i.i.4.i140 = fcmp ord float %b.sroa.4.16.copyload, 0.000000e+00
  %or.cond301 = and i1 %or.cond300, %cmp1.i.i.i.4.i140
  %cmp1.i.i.i.5.i144 = fcmp ord float %b.sroa.5.20.copyload, 0.000000e+00
  %or.cond302 = and i1 %or.cond301, %cmp1.i.i.i.5.i144
  br i1 %or.cond302, label %if.then, label %if.else

if.then:                                          ; preds = %_ZNKSt5ctypeIcE5widenEc.exit
  %call1.i153 = call %"class.std::basic_ostream"* @_ZSt16__ostream_insertIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_PKS3_i(%"class.std::basic_ostream"* @_ZSt4cout, i8* getelementptr inbounds ([45 x i8]* @.str8, i32 0, i32 0), i32 44)
  %vtable.i156 = load i8** bitcast (%"class.std::basic_ostream"* @_ZSt4cout to i8**), align 4, !tbaa !3
  %vbase.offset.ptr.i157 = getelementptr i8* %vtable.i156, i32 -12
  %55 = bitcast i8* %vbase.offset.ptr.i157 to i32*
  %vbase.offset.i158 = load i32* %55, align 4
  %add.ptr.i159.sum = add i32 %vbase.offset.i158, 124
  %_M_ctype.i241 = getelementptr inbounds i8* bitcast (%"class.std::basic_ostream"* @_ZSt4cout to i8*), i32 %add.ptr.i159.sum
  %56 = bitcast i8* %_M_ctype.i241 to %"class.std::ctype"**
  %57 = load %"class.std::ctype"** %56, align 4, !tbaa !4
  %tobool.i277 = icmp eq %"class.std::ctype"* %57, null
  br i1 %tobool.i277, label %if.then.i278, label %_ZSt13__check_facetISt5ctypeIcEERKT_PS3_.exit280

if.then.i278:                                     ; preds = %if.then
  call void @_ZSt16__throw_bad_castv() noreturn
  unreachable

_ZSt13__check_facetISt5ctypeIcEERKT_PS3_.exit280: ; preds = %if.then
  %_M_widen_ok.i243 = getelementptr inbounds %"class.std::ctype"* %57, i32 0, i32 6
  %58 = load i8* %_M_widen_ok.i243, align 1, !tbaa !1
  %tobool.i244 = icmp eq i8 %58, 0
  br i1 %tobool.i244, label %if.end.i250, label %if.then.i246

if.then.i246:                                     ; preds = %_ZSt13__check_facetISt5ctypeIcEERKT_PS3_.exit280
  %arrayidx.i245 = getelementptr inbounds %"class.std::ctype"* %57, i32 0, i32 7, i32 10
  %59 = load i8* %arrayidx.i245, align 1, !tbaa !1
  br label %_ZNKSt5ctypeIcE5widenEc.exit252

if.end.i250:                                      ; preds = %_ZSt13__check_facetISt5ctypeIcEERKT_PS3_.exit280
  call void @_ZNKSt5ctypeIcE13_M_widen_initEv(%"class.std::ctype"* %57)
  %60 = bitcast %"class.std::ctype"* %57 to i8 (%"class.std::ctype"*, i8)***
  %vtable.i247 = load i8 (%"class.std::ctype"*, i8)*** %60, align 4, !tbaa !3
  %vfn.i248 = getelementptr inbounds i8 (%"class.std::ctype"*, i8)** %vtable.i247, i32 6
  %61 = load i8 (%"class.std::ctype"*, i8)** %vfn.i248, align 4
  %call.i249 = call signext i8 %61(%"class.std::ctype"* %57, i8 signext 10)
  br label %_ZNKSt5ctypeIcE5widenEc.exit252

_ZNKSt5ctypeIcE5widenEc.exit252:                  ; preds = %if.then.i246, %if.end.i250
  %retval.0.i251 = phi i8 [ %59, %if.then.i246 ], [ %call.i249, %if.end.i250 ]
  %call1.i161 = call %"class.std::basic_ostream"* @_ZNSo3putEc(%"class.std::basic_ostream"* @_ZSt4cout, i8 signext %retval.0.i251)
  %call.i162 = call %"class.std::basic_ostream"* @_ZNSo5flushEv(%"class.std::basic_ostream"* %call1.i161)
  br label %if.end

if.else:                                          ; preds = %_ZNKSt5ctypeIcE5widenEc.exit
  %call1.i164 = call %"class.std::basic_ostream"* @_ZSt16__ostream_insertIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_PKS3_i(%"class.std::basic_ostream"* @_ZSt4cout, i8* getelementptr inbounds ([45 x i8]* @.str9, i32 0, i32 0), i32 44)
  %vtable.i = load i8** bitcast (%"class.std::basic_ostream"* @_ZSt4cout to i8**), align 4, !tbaa !3
  %vbase.offset.ptr.i = getelementptr i8* %vtable.i, i32 -12
  %62 = bitcast i8* %vbase.offset.ptr.i to i32*
  %vbase.offset.i = load i32* %62, align 4
  %add.ptr.i.sum = add i32 %vbase.offset.i, 124
  %_M_ctype.i166 = getelementptr inbounds i8* bitcast (%"class.std::basic_ostream"* @_ZSt4cout to i8*), i32 %add.ptr.i.sum
  %63 = bitcast i8* %_M_ctype.i166 to %"class.std::ctype"**
  %64 = load %"class.std::ctype"** %63, align 4, !tbaa !4
  %tobool.i253 = icmp eq %"class.std::ctype"* %64, null
  br i1 %tobool.i253, label %if.then.i254, label %_ZSt13__check_facetISt5ctypeIcEERKT_PS3_.exit256

if.then.i254:                                     ; preds = %if.else
  call void @_ZSt16__throw_bad_castv() noreturn
  unreachable

_ZSt13__check_facetISt5ctypeIcEERKT_PS3_.exit256: ; preds = %if.else
  %_M_widen_ok.i168 = getelementptr inbounds %"class.std::ctype"* %64, i32 0, i32 6
  %65 = load i8* %_M_widen_ok.i168, align 1, !tbaa !1
  %tobool.i169 = icmp eq i8 %65, 0
  br i1 %tobool.i169, label %if.end.i175, label %if.then.i171

if.then.i171:                                     ; preds = %_ZSt13__check_facetISt5ctypeIcEERKT_PS3_.exit256
  %arrayidx.i170 = getelementptr inbounds %"class.std::ctype"* %64, i32 0, i32 7, i32 10
  %66 = load i8* %arrayidx.i170, align 1, !tbaa !1
  br label %_ZNKSt5ctypeIcE5widenEc.exit177

if.end.i175:                                      ; preds = %_ZSt13__check_facetISt5ctypeIcEERKT_PS3_.exit256
  call void @_ZNKSt5ctypeIcE13_M_widen_initEv(%"class.std::ctype"* %64)
  %67 = bitcast %"class.std::ctype"* %64 to i8 (%"class.std::ctype"*, i8)***
  %vtable.i172 = load i8 (%"class.std::ctype"*, i8)*** %67, align 4, !tbaa !3
  %vfn.i173 = getelementptr inbounds i8 (%"class.std::ctype"*, i8)** %vtable.i172, i32 6
  %68 = load i8 (%"class.std::ctype"*, i8)** %vfn.i173, align 4
  %call.i174 = call signext i8 %68(%"class.std::ctype"* %64, i8 signext 10)
  br label %_ZNKSt5ctypeIcE5widenEc.exit177

_ZNKSt5ctypeIcE5widenEc.exit177:                  ; preds = %if.then.i171, %if.end.i175
  %retval.0.i176 = phi i8 [ %66, %if.then.i171 ], [ %call.i174, %if.end.i175 ]
  %call1.i = call %"class.std::basic_ostream"* @_ZNSo3putEc(%"class.std::basic_ostream"* @_ZSt4cout, i8 signext %retval.0.i176)
  %call.i = call %"class.std::basic_ostream"* @_ZNSo5flushEv(%"class.std::basic_ostream"* %call1.i)
  br label %if.end

if.end:                                           ; preds = %_ZNKSt5ctypeIcE5widenEc.exit177, %_ZNKSt5ctypeIcE5widenEc.exit252
  ret i32 0
}

declare void @llvm.memcpy.p0i8.p0i8.i32(i8* nocapture, i8* nocapture, i32, i32, i1) nounwind

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

!0 = metadata !{metadata !"float", metadata !1}
!1 = metadata !{metadata !"omnipotent char", metadata !2}
!2 = metadata !{metadata !"Simple C/C++ TBAA"}
!3 = metadata !{metadata !"vtable pointer", metadata !2}
!4 = metadata !{metadata !"any pointer", metadata !1}
