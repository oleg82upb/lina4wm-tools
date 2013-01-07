; ModuleID = 'array4.cpp'
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
%"class.std::allocator" = type { i8 }
%"class.boost::array" = type { [2 x %"class.boost::array.0"] }
%"class.boost::array.0" = type { [4 x %"class.std::basic_string"] }
%"class.std::basic_string" = type { %"struct.std::basic_string<char, std::char_traits<char>, std::allocator<char> >::_Alloc_hider" }
%"struct.std::basic_string<char, std::char_traits<char>, std::allocator<char> >::_Alloc_hider" = type { i8* }
%"struct.std::basic_string<char, std::char_traits<char>, std::allocator<char> >::_Rep" = type { %"struct.std::basic_string<char, std::char_traits<char>, std::allocator<char> >::_Rep_base" }
%"struct.std::basic_string<char, std::char_traits<char>, std::allocator<char> >::_Rep_base" = type { i32, i32, i32 }

@_ZStL8__ioinit = internal global %"class.std::ios_base::Init" zeroinitializer, align 1
@__dso_handle = external global i8
@.str = private unnamed_addr constant [7 x i8] c"spring\00", align 1
@.str1 = private unnamed_addr constant [7 x i8] c"summer\00", align 1
@.str2 = private unnamed_addr constant [7 x i8] c"autumn\00", align 1
@.str3 = private unnamed_addr constant [7 x i8] c"winter\00", align 1
@.str4 = private unnamed_addr constant [10 x i8] c"Fruehling\00", align 1
@.str5 = private unnamed_addr constant [7 x i8] c"Sommer\00", align 1
@.str6 = private unnamed_addr constant [7 x i8] c"Herbst\00", align 1
@.str7 = private unnamed_addr constant [7 x i8] c"Winter\00", align 1
@_ZSt4cout = external global %"class.std::basic_ostream"
@.str8 = private unnamed_addr constant [2 x i8] c" \00", align 1
@.str9 = private unnamed_addr constant [31 x i8] c"first element of first array: \00", align 1
@.str10 = private unnamed_addr constant [29 x i8] c"last element of last array: \00", align 1
@_ZNSs4_Rep20_S_empty_rep_storageE = external global [0 x i32]
@llvm.global_ctors = appending global [1 x { i32, void ()* }] [{ i32, void ()* } { i32 65535, void ()* @_GLOBAL__I_a }]

declare void @_ZNSt8ios_base4InitC1Ev(%"class.std::ios_base::Init"*)

declare void @_ZNSt8ios_base4InitD1Ev(%"class.std::ios_base::Init"*)

declare i32 @__cxa_atexit(void (i8*)*, i8*, i8*) nounwind

define i32 @main() {
entry:
  %ref.tmp.i.i227 = alloca %"class.std::allocator", align 1
  %ref.tmp.i.i = alloca %"class.std::allocator", align 1
  %seasons_i18n = alloca %"class.boost::array", align 4
  %ref.tmp = alloca %"class.std::allocator", align 1
  %ref.tmp4 = alloca %"class.std::allocator", align 1
  %ref.tmp8 = alloca %"class.std::allocator", align 1
  %ref.tmp12 = alloca %"class.std::allocator", align 1
  %ref.tmp19 = alloca %"class.std::allocator", align 1
  %ref.tmp23 = alloca %"class.std::allocator", align 1
  %ref.tmp27 = alloca %"class.std::allocator", align 1
  %ref.tmp31 = alloca %"class.std::allocator", align 1
  %seasons = alloca %"class.boost::array.0", align 4
  %arrayinit.begin = getelementptr inbounds %"class.boost::array"* %seasons_i18n, i32 0, i32 0, i32 0
  %arrayinit.begin2 = getelementptr inbounds %"class.boost::array"* %seasons_i18n, i32 0, i32 0, i32 0, i32 0, i32 0
  invoke void @_ZNSsC1EPKcRKSaIcE(%"class.std::basic_string"* %arrayinit.begin2, i8* getelementptr inbounds ([7 x i8]* @.str, i32 0, i32 0), %"class.std::allocator"* %ref.tmp)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %entry
  %arrayinit.element = getelementptr inbounds %"class.boost::array"* %seasons_i18n, i32 0, i32 0, i32 0, i32 0, i32 1
  invoke void @_ZNSsC1EPKcRKSaIcE(%"class.std::basic_string"* %arrayinit.element, i8* getelementptr inbounds ([7 x i8]* @.str1, i32 0, i32 0), %"class.std::allocator"* %ref.tmp4)
          to label %invoke.cont6 unwind label %lpad5

invoke.cont6:                                     ; preds = %invoke.cont
  %arrayinit.element7 = getelementptr inbounds %"class.boost::array"* %seasons_i18n, i32 0, i32 0, i32 0, i32 0, i32 2
  invoke void @_ZNSsC1EPKcRKSaIcE(%"class.std::basic_string"* %arrayinit.element7, i8* getelementptr inbounds ([7 x i8]* @.str2, i32 0, i32 0), %"class.std::allocator"* %ref.tmp8)
          to label %invoke.cont10 unwind label %lpad9

invoke.cont10:                                    ; preds = %invoke.cont6
  %arrayinit.element11 = getelementptr inbounds %"class.boost::array"* %seasons_i18n, i32 0, i32 0, i32 0, i32 0, i32 3
  invoke void @_ZNSsC1EPKcRKSaIcE(%"class.std::basic_string"* %arrayinit.element11, i8* getelementptr inbounds ([7 x i8]* @.str3, i32 0, i32 0), %"class.std::allocator"* %ref.tmp12)
          to label %invoke.cont14 unwind label %lpad13

invoke.cont14:                                    ; preds = %invoke.cont10
  %arrayinit.element15 = getelementptr inbounds %"class.boost::array"* %seasons_i18n, i32 0, i32 0, i32 1
  %arrayinit.begin17 = getelementptr inbounds %"class.boost::array.0"* %arrayinit.element15, i32 0, i32 0, i32 0
  invoke void @_ZNSsC1EPKcRKSaIcE(%"class.std::basic_string"* %arrayinit.begin17, i8* getelementptr inbounds ([10 x i8]* @.str4, i32 0, i32 0), %"class.std::allocator"* %ref.tmp19)
          to label %invoke.cont21 unwind label %lpad20

invoke.cont21:                                    ; preds = %invoke.cont14
  %arrayinit.element22 = getelementptr inbounds %"class.boost::array"* %seasons_i18n, i32 0, i32 0, i32 1, i32 0, i32 1
  invoke void @_ZNSsC1EPKcRKSaIcE(%"class.std::basic_string"* %arrayinit.element22, i8* getelementptr inbounds ([7 x i8]* @.str5, i32 0, i32 0), %"class.std::allocator"* %ref.tmp23)
          to label %invoke.cont25 unwind label %lpad24

invoke.cont25:                                    ; preds = %invoke.cont21
  %arrayinit.element26 = getelementptr inbounds %"class.boost::array"* %seasons_i18n, i32 0, i32 0, i32 1, i32 0, i32 2
  invoke void @_ZNSsC1EPKcRKSaIcE(%"class.std::basic_string"* %arrayinit.element26, i8* getelementptr inbounds ([7 x i8]* @.str6, i32 0, i32 0), %"class.std::allocator"* %ref.tmp27)
          to label %invoke.cont29 unwind label %lpad28

invoke.cont29:                                    ; preds = %invoke.cont25
  %arrayinit.element30 = getelementptr inbounds %"class.boost::array"* %seasons_i18n, i32 0, i32 0, i32 1, i32 0, i32 3
  invoke void @_ZNSsC1EPKcRKSaIcE(%"class.std::basic_string"* %arrayinit.element30, i8* getelementptr inbounds ([7 x i8]* @.str7, i32 0, i32 0), %"class.std::allocator"* %ref.tmp31)
          to label %for.cond.preheader unwind label %lpad32

for.cond.preheader:                               ; preds = %invoke.cont29
  %destaddress.i.i = getelementptr inbounds %"class.boost::array.0"* %seasons, i32 0, i32 0, i32 0
  %destaddress.1.i.i = getelementptr inbounds %"class.boost::array.0"* %seasons, i32 0, i32 0, i32 1
  %destaddress.2.i.i = getelementptr inbounds %"class.boost::array.0"* %seasons, i32 0, i32 0, i32 2
  %destaddress.3.i.i = getelementptr inbounds %"class.boost::array.0"* %seasons, i32 0, i32 0, i32 3
  br label %invoke.cont69

invoke.cont69:                                    ; preds = %for.cond.preheader, %for.inc89
  %i.0304 = phi i32 [ 0, %for.cond.preheader ], [ %inc90, %for.inc89 ]
  %arrayidx.i.i = getelementptr inbounds %"class.boost::array"* %seasons_i18n, i32 0, i32 0, i32 %i.0304, i32 0, i32 0
  invoke void @_ZNSsC1ERKSs(%"class.std::basic_string"* %destaddress.i.i, %"class.std::basic_string"* %arrayidx.i.i)
          to label %.noexc181 unwind label %lpad67.loopexit

.noexc181:                                        ; preds = %invoke.cont69
  %arrayidx.1.i.i = getelementptr inbounds %"class.boost::array"* %seasons_i18n, i32 0, i32 0, i32 %i.0304, i32 0, i32 1
  invoke void @_ZNSsC1ERKSs(%"class.std::basic_string"* %destaddress.1.i.i, %"class.std::basic_string"* %arrayidx.1.i.i)
          to label %.noexc182 unwind label %lpad67.loopexit

.noexc182:                                        ; preds = %.noexc181
  %arrayidx.2.i.i = getelementptr inbounds %"class.boost::array"* %seasons_i18n, i32 0, i32 0, i32 %i.0304, i32 0, i32 2
  invoke void @_ZNSsC1ERKSs(%"class.std::basic_string"* %destaddress.2.i.i, %"class.std::basic_string"* %arrayidx.2.i.i)
          to label %.noexc183 unwind label %lpad67.loopexit

.noexc183:                                        ; preds = %.noexc182
  %arrayidx.3.i.i = getelementptr inbounds %"class.boost::array"* %seasons_i18n, i32 0, i32 0, i32 %i.0304, i32 0, i32 3
  invoke void @_ZNSsC1ERKSs(%"class.std::basic_string"* %destaddress.3.i.i, %"class.std::basic_string"* %arrayidx.3.i.i)
          to label %for.cond72.preheader unwind label %lpad67.loopexit

for.cond72.preheader:                             ; preds = %.noexc183
  %_M_p.i.i.i189 = getelementptr inbounds %"class.boost::array.0"* %seasons, i32 0, i32 0, i32 0, i32 0, i32 0
  %0 = load i8** %_M_p.i.i.i189, align 4, !tbaa !0
  %arrayidx.i.i.i190 = getelementptr inbounds i8* %0, i32 -12
  %_M_length.i.i191 = bitcast i8* %arrayidx.i.i.i190 to i32*
  %1 = load i32* %_M_length.i.i191, align 4, !tbaa !3
  %call2.i192 = invoke %"class.std::basic_ostream"* @_ZSt16__ostream_insertIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_PKS3_i(%"class.std::basic_ostream"* @_ZSt4cout, i8* %0, i32 %1)
          to label %invoke.cont80 unwind label %lpad73.loopexit

invoke.cont80:                                    ; preds = %for.cond72.preheader
  %call1.i197 = invoke %"class.std::basic_ostream"* @_ZSt16__ostream_insertIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_PKS3_i(%"class.std::basic_ostream"* %call2.i192, i8* getelementptr inbounds ([2 x i8]* @.str8, i32 0, i32 0), i32 1)
          to label %for.inc unwind label %lpad73.loopexit

for.inc:                                          ; preds = %invoke.cont80
  %_M_p.i.i.i189.1 = getelementptr inbounds %"class.boost::array.0"* %seasons, i32 0, i32 0, i32 1, i32 0, i32 0
  %2 = load i8** %_M_p.i.i.i189.1, align 4, !tbaa !0
  %arrayidx.i.i.i190.1 = getelementptr inbounds i8* %2, i32 -12
  %_M_length.i.i191.1 = bitcast i8* %arrayidx.i.i.i190.1 to i32*
  %3 = load i32* %_M_length.i.i191.1, align 4, !tbaa !3
  %call2.i192.1 = invoke %"class.std::basic_ostream"* @_ZSt16__ostream_insertIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_PKS3_i(%"class.std::basic_ostream"* @_ZSt4cout, i8* %2, i32 %3)
          to label %invoke.cont80.1 unwind label %lpad73.loopexit

lpad:                                             ; preds = %entry
  %4 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %5 = extractvalue { i8*, i32 } %4, 0
  %6 = extractvalue { i8*, i32 } %4, 1
  br label %ehcleanup44

lpad5:                                            ; preds = %invoke.cont
  %7 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %8 = extractvalue { i8*, i32 } %7, 0
  %9 = extractvalue { i8*, i32 } %7, 1
  br label %ehcleanup44

lpad9:                                            ; preds = %invoke.cont6
  %10 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %11 = extractvalue { i8*, i32 } %10, 0
  %12 = extractvalue { i8*, i32 } %10, 1
  br label %ehcleanup44

lpad13:                                           ; preds = %invoke.cont10
  %13 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %14 = extractvalue { i8*, i32 } %13, 0
  %15 = extractvalue { i8*, i32 } %13, 1
  br label %ehcleanup44

lpad20:                                           ; preds = %invoke.cont14
  %16 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %17 = extractvalue { i8*, i32 } %16, 0
  %18 = extractvalue { i8*, i32 } %16, 1
  br label %ehcleanup37

lpad24:                                           ; preds = %invoke.cont21
  %19 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %20 = extractvalue { i8*, i32 } %19, 0
  %21 = extractvalue { i8*, i32 } %19, 1
  br label %ehcleanup37

lpad28:                                           ; preds = %invoke.cont25
  %22 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %23 = extractvalue { i8*, i32 } %22, 0
  %24 = extractvalue { i8*, i32 } %22, 1
  br label %ehcleanup37

lpad32:                                           ; preds = %invoke.cont29
  %25 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %26 = extractvalue { i8*, i32 } %25, 0
  %27 = extractvalue { i8*, i32 } %25, 1
  br label %ehcleanup37

ehcleanup37:                                      ; preds = %lpad24, %lpad32, %lpad28, %lpad20
  %exn.slot.2 = phi i8* [ %17, %lpad20 ], [ %20, %lpad24 ], [ %26, %lpad32 ], [ %23, %lpad28 ]
  %ehselector.slot.2 = phi i32 [ %18, %lpad20 ], [ %21, %lpad24 ], [ %27, %lpad32 ], [ %24, %lpad28 ]
  %arrayinit.endOfInit18.2 = phi %"class.std::basic_string"* [ %arrayinit.begin17, %lpad20 ], [ %arrayinit.element22, %lpad24 ], [ %arrayinit.element30, %lpad32 ], [ %arrayinit.element26, %lpad28 ]
  %arraydestroy.isempty = icmp eq %"class.std::basic_string"* %arrayinit.begin17, %arrayinit.endOfInit18.2
  br i1 %arraydestroy.isempty, label %cleanup.action58, label %arraydestroy.body.preheader

arraydestroy.body.preheader:                      ; preds = %ehcleanup37
  %28 = getelementptr inbounds %"class.std::allocator"* %ref.tmp.i.i, i32 0, i32 0
  br label %arraydestroy.body

arraydestroy.body:                                ; preds = %arraydestroy.body.preheader, %invoke.cont39
  %arraydestroy.elementPast = phi %"class.std::basic_string"* [ %arraydestroy.element, %invoke.cont39 ], [ %arrayinit.endOfInit18.2, %arraydestroy.body.preheader ]
  %arraydestroy.element = getelementptr inbounds %"class.std::basic_string"* %arraydestroy.elementPast, i32 -1
  call void @llvm.lifetime.start(i64 1, i8* %28)
  %_M_p.i.i.i.i = getelementptr inbounds %"class.std::basic_string"* %arraydestroy.element, i32 0, i32 0, i32 0
  %29 = load i8** %_M_p.i.i.i.i, align 4, !tbaa !0
  %arrayidx.i.i.i199 = getelementptr inbounds i8* %29, i32 -12
  %30 = bitcast i8* %arrayidx.i.i.i199 to %"struct.std::basic_string<char, std::char_traits<char>, std::allocator<char> >::_Rep"*
  %cmp.i.i.i = icmp eq i8* %arrayidx.i.i.i199, bitcast ([0 x i32]* @_ZNSs4_Rep20_S_empty_rep_storageE to i8*)
  br i1 %cmp.i.i.i, label %invoke.cont39, label %if.then.i.i.i, !prof !4

if.then.i.i.i:                                    ; preds = %arraydestroy.body
  %_M_refcount.i.i.i = getelementptr inbounds i8* %29, i32 -4
  %31 = bitcast i8* %_M_refcount.i.i.i to i32*
  br i1 icmp ne (i8* bitcast (i32 (i32)* @pthread_cancel to i8*), i8* null), label %if.then.i.i.i.i, label %if.else.i.i.i.i

if.then.i.i.i.i:                                  ; preds = %if.then.i.i.i
  %32 = atomicrmw add i32* %31, i32 -1 seq_cst
  br label %_ZN9__gnu_cxxL27__exchange_and_add_dispatchEPii.exit.i.i.i

if.else.i.i.i.i:                                  ; preds = %if.then.i.i.i
  %33 = load i32* %31, align 4, !tbaa !3
  %add.i.i.i.i.i = add nsw i32 %33, -1
  store i32 %add.i.i.i.i.i, i32* %31, align 4, !tbaa !3
  br label %_ZN9__gnu_cxxL27__exchange_and_add_dispatchEPii.exit.i.i.i

_ZN9__gnu_cxxL27__exchange_and_add_dispatchEPii.exit.i.i.i: ; preds = %if.else.i.i.i.i, %if.then.i.i.i.i
  %retval.0.i.i.i.i = phi i32 [ %32, %if.then.i.i.i.i ], [ %33, %if.else.i.i.i.i ]
  %cmp3.i.i.i = icmp slt i32 %retval.0.i.i.i.i, 1
  br i1 %cmp3.i.i.i, label %if.then4.i.i.i, label %invoke.cont39

if.then4.i.i.i:                                   ; preds = %_ZN9__gnu_cxxL27__exchange_and_add_dispatchEPii.exit.i.i.i
  call void @_ZNSs4_Rep10_M_destroyERKSaIcE(%"struct.std::basic_string<char, std::char_traits<char>, std::allocator<char> >::_Rep"* %30, %"class.std::allocator"* %ref.tmp.i.i) nounwind
  br label %invoke.cont39

invoke.cont39:                                    ; preds = %if.then4.i.i.i, %_ZN9__gnu_cxxL27__exchange_and_add_dispatchEPii.exit.i.i.i, %arraydestroy.body
  call void @llvm.lifetime.end(i64 1, i8* %28)
  %arraydestroy.done = icmp eq %"class.std::basic_string"* %arraydestroy.element, %arrayinit.begin17
  br i1 %arraydestroy.done, label %cleanup.action58, label %arraydestroy.body

ehcleanup44:                                      ; preds = %lpad5, %lpad13, %lpad9, %lpad
  %arrayinit.endOfInit3.2 = phi %"class.std::basic_string"* [ %arrayinit.begin2, %lpad ], [ %arrayinit.element, %lpad5 ], [ %arrayinit.element7, %lpad9 ], [ %arrayinit.element11, %lpad13 ]
  %exn.slot.6 = phi i8* [ %5, %lpad ], [ %8, %lpad5 ], [ %11, %lpad9 ], [ %14, %lpad13 ]
  %ehselector.slot.6 = phi i32 [ %6, %lpad ], [ %9, %lpad5 ], [ %12, %lpad9 ], [ %15, %lpad13 ]
  %arraydestroy.isempty48 = icmp eq %"class.std::basic_string"* %arrayinit.begin2, %arrayinit.endOfInit3.2
  br i1 %arraydestroy.isempty48, label %cleanup.action58, label %arraydestroy.body49.preheader

arraydestroy.body49.preheader:                    ; preds = %ehcleanup44
  %34 = getelementptr inbounds %"class.std::allocator"* %ref.tmp.i.i227, i32 0, i32 0
  br label %arraydestroy.body49

arraydestroy.body49:                              ; preds = %arraydestroy.body49.preheader, %invoke.cont52
  %arraydestroy.elementPast50 = phi %"class.std::basic_string"* [ %arraydestroy.element51, %invoke.cont52 ], [ %arrayinit.endOfInit3.2, %arraydestroy.body49.preheader ]
  %arraydestroy.element51 = getelementptr inbounds %"class.std::basic_string"* %arraydestroy.elementPast50, i32 -1
  call void @llvm.lifetime.start(i64 1, i8* %34)
  %_M_p.i.i.i.i228 = getelementptr inbounds %"class.std::basic_string"* %arraydestroy.element51, i32 0, i32 0, i32 0
  %35 = load i8** %_M_p.i.i.i.i228, align 4, !tbaa !0
  %arrayidx.i.i.i229 = getelementptr inbounds i8* %35, i32 -12
  %36 = bitcast i8* %arrayidx.i.i.i229 to %"struct.std::basic_string<char, std::char_traits<char>, std::allocator<char> >::_Rep"*
  %cmp.i.i.i230 = icmp eq i8* %arrayidx.i.i.i229, bitcast ([0 x i32]* @_ZNSs4_Rep20_S_empty_rep_storageE to i8*)
  br i1 %cmp.i.i.i230, label %invoke.cont52, label %if.then.i.i.i232, !prof !4

if.then.i.i.i232:                                 ; preds = %arraydestroy.body49
  %_M_refcount.i.i.i231 = getelementptr inbounds i8* %35, i32 -4
  %37 = bitcast i8* %_M_refcount.i.i.i231 to i32*
  br i1 icmp ne (i8* bitcast (i32 (i32)* @pthread_cancel to i8*), i8* null), label %if.then.i.i.i.i233, label %if.else.i.i.i.i235

if.then.i.i.i.i233:                               ; preds = %if.then.i.i.i232
  %38 = atomicrmw add i32* %37, i32 -1 seq_cst
  br label %_ZN9__gnu_cxxL27__exchange_and_add_dispatchEPii.exit.i.i.i238

if.else.i.i.i.i235:                               ; preds = %if.then.i.i.i232
  %39 = load i32* %37, align 4, !tbaa !3
  %add.i.i.i.i.i234 = add nsw i32 %39, -1
  store i32 %add.i.i.i.i.i234, i32* %37, align 4, !tbaa !3
  br label %_ZN9__gnu_cxxL27__exchange_and_add_dispatchEPii.exit.i.i.i238

_ZN9__gnu_cxxL27__exchange_and_add_dispatchEPii.exit.i.i.i238: ; preds = %if.else.i.i.i.i235, %if.then.i.i.i.i233
  %retval.0.i.i.i.i236 = phi i32 [ %38, %if.then.i.i.i.i233 ], [ %39, %if.else.i.i.i.i235 ]
  %cmp3.i.i.i237 = icmp slt i32 %retval.0.i.i.i.i236, 1
  br i1 %cmp3.i.i.i237, label %if.then4.i.i.i239, label %invoke.cont52

if.then4.i.i.i239:                                ; preds = %_ZN9__gnu_cxxL27__exchange_and_add_dispatchEPii.exit.i.i.i238
  call void @_ZNSs4_Rep10_M_destroyERKSaIcE(%"struct.std::basic_string<char, std::char_traits<char>, std::allocator<char> >::_Rep"* %36, %"class.std::allocator"* %ref.tmp.i.i227) nounwind
  br label %invoke.cont52

invoke.cont52:                                    ; preds = %if.then4.i.i.i239, %_ZN9__gnu_cxxL27__exchange_and_add_dispatchEPii.exit.i.i.i238, %arraydestroy.body49
  call void @llvm.lifetime.end(i64 1, i8* %34)
  %arraydestroy.done53 = icmp eq %"class.std::basic_string"* %arraydestroy.element51, %arrayinit.begin2
  br i1 %arraydestroy.done53, label %cleanup.action58, label %arraydestroy.body49

cleanup.action58:                                 ; preds = %invoke.cont52, %invoke.cont39, %ehcleanup37, %ehcleanup44
  %ehselector.slot.6296 = phi i32 [ %ehselector.slot.6, %ehcleanup44 ], [ %ehselector.slot.2, %ehcleanup37 ], [ %ehselector.slot.2, %invoke.cont39 ], [ %ehselector.slot.6, %invoke.cont52 ]
  %exn.slot.6295 = phi i8* [ %exn.slot.6, %ehcleanup44 ], [ %exn.slot.2, %ehcleanup37 ], [ %exn.slot.2, %invoke.cont39 ], [ %exn.slot.6, %invoke.cont52 ]
  %arrayinit.endOfInit.3294 = phi %"class.boost::array.0"* [ %arrayinit.begin, %ehcleanup44 ], [ %arrayinit.element15, %ehcleanup37 ], [ %arrayinit.element15, %invoke.cont39 ], [ %arrayinit.begin, %invoke.cont52 ]
  %arraydestroy.isempty59 = icmp eq %"class.boost::array.0"* %arrayinit.begin, %arrayinit.endOfInit.3294
  br i1 %arraydestroy.isempty59, label %eh.resume, label %arraydestroy.body60

arraydestroy.body60:                              ; preds = %cleanup.action58, %invoke.cont63
  %arraydestroy.elementPast61 = phi %"class.boost::array.0"* [ %arraydestroy.element62, %invoke.cont63 ], [ %arrayinit.endOfInit.3294, %cleanup.action58 ]
  %arraydestroy.element62 = getelementptr inbounds %"class.boost::array.0"* %arraydestroy.elementPast61, i32 -1
  invoke void @_ZN5boost5arrayISsLj4EED2Ev(%"class.boost::array.0"* %arraydestroy.element62)
          to label %invoke.cont63 unwind label %terminate.lpad.loopexit

invoke.cont63:                                    ; preds = %arraydestroy.body60
  %arraydestroy.done64 = icmp eq %"class.boost::array.0"* %arraydestroy.element62, %arrayinit.begin
  br i1 %arraydestroy.done64, label %eh.resume, label %arraydestroy.body60

lpad67.loopexit:                                  ; preds = %invoke.cont69, %.noexc181, %.noexc182, %.noexc183, %invoke.cont84
  %lpad.loopexit298 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  br label %lpad67

lpad67.nonloopexit:                               ; preds = %call.i.noexc, %call1.i.noexc, %if.end.i, %.noexc, %if.then.i153, %invoke.cont113, %invoke.cont100, %call.i.noexc170, %call1.i.noexc172, %if.end.i211, %.noexc213, %if.then.i218, %invoke.cont96, %for.end91
  %lpad.nonloopexit299 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  br label %lpad67

lpad67:                                           ; preds = %lpad67.nonloopexit, %lpad67.loopexit
  %lpad.phi300 = phi { i8*, i32 } [ %lpad.loopexit298, %lpad67.loopexit ], [ %lpad.nonloopexit299, %lpad67.nonloopexit ]
  %40 = extractvalue { i8*, i32 } %lpad.phi300, 0
  %41 = extractvalue { i8*, i32 } %lpad.phi300, 1
  br label %ehcleanup119

lpad73.loopexit:                                  ; preds = %invoke.cont80.3, %for.inc.2, %invoke.cont80.2, %for.inc.1, %invoke.cont80.1, %for.inc, %for.cond72.preheader, %invoke.cont80
  %lpad.loopexit = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  br label %lpad73

lpad73.nonloopexit.loopexit:                      ; preds = %.noexc282, %if.end.i280, %call1.i.noexc253, %call.i.noexc251
  %lpad.loopexit301 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  br label %lpad73

lpad73.nonloopexit.nonloopexit:                   ; preds = %if.then.i287
  %lpad.nonloopexit302 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  br label %lpad73

lpad73:                                           ; preds = %lpad73.nonloopexit.loopexit, %lpad73.nonloopexit.nonloopexit, %lpad73.loopexit
  %lpad.phi = phi { i8*, i32 } [ %lpad.loopexit, %lpad73.loopexit ], [ %lpad.loopexit301, %lpad73.nonloopexit.loopexit ], [ %lpad.nonloopexit302, %lpad73.nonloopexit.nonloopexit ]
  %42 = extractvalue { i8*, i32 } %lpad.phi, 0
  %43 = extractvalue { i8*, i32 } %lpad.phi, 1
  invoke void @_ZN5boost5arrayISsLj4EED2Ev(%"class.boost::array.0"* %seasons)
          to label %ehcleanup119 unwind label %terminate.lpad.nonloopexit

if.then.i287:                                     ; preds = %for.inc.3
  invoke void @_ZSt16__throw_bad_castv() noreturn
          to label %.noexc289 unwind label %lpad73.nonloopexit.nonloopexit

.noexc289:                                        ; preds = %if.then.i287
  unreachable

call.i.noexc270:                                  ; preds = %for.inc.3
  %_M_widen_ok.i274 = getelementptr inbounds %"class.std::ctype"* %80, i32 0, i32 6
  %44 = load i8* %_M_widen_ok.i274, align 1, !tbaa !1
  %tobool.i275 = icmp eq i8 %44, 0
  br i1 %tobool.i275, label %if.end.i280, label %if.then.i277

if.then.i277:                                     ; preds = %call.i.noexc270
  %arrayidx.i276 = getelementptr inbounds %"class.std::ctype"* %80, i32 0, i32 7, i32 10
  %45 = load i8* %arrayidx.i276, align 1, !tbaa !1
  br label %call.i.noexc251

if.end.i280:                                      ; preds = %call.i.noexc270
  invoke void @_ZNKSt5ctypeIcE13_M_widen_initEv(%"class.std::ctype"* %80)
          to label %.noexc282 unwind label %lpad73.nonloopexit.loopexit

.noexc282:                                        ; preds = %if.end.i280
  %46 = bitcast %"class.std::ctype"* %80 to i8 (%"class.std::ctype"*, i8)***
  %vtable.i278 = load i8 (%"class.std::ctype"*, i8)*** %46, align 4, !tbaa !5
  %vfn.i279 = getelementptr inbounds i8 (%"class.std::ctype"*, i8)** %vtable.i278, i32 6
  %47 = load i8 (%"class.std::ctype"*, i8)** %vfn.i279, align 4
  %call.i284 = invoke signext i8 %47(%"class.std::ctype"* %80, i8 signext 10)
          to label %call.i.noexc251 unwind label %lpad73.nonloopexit.loopexit

call.i.noexc251:                                  ; preds = %.noexc282, %if.then.i277
  %retval.0.i281 = phi i8 [ %45, %if.then.i277 ], [ %call.i284, %.noexc282 ]
  %call1.i254 = invoke %"class.std::basic_ostream"* @_ZNSo3putEc(%"class.std::basic_ostream"* @_ZSt4cout, i8 signext %retval.0.i281)
          to label %call1.i.noexc253 unwind label %lpad73.nonloopexit.loopexit

call1.i.noexc253:                                 ; preds = %call.i.noexc251
  %call.i258 = invoke %"class.std::basic_ostream"* @_ZNSo5flushEv(%"class.std::basic_ostream"* %call1.i254)
          to label %invoke.cont84 unwind label %lpad73.nonloopexit.loopexit

invoke.cont84:                                    ; preds = %call1.i.noexc253
  invoke void @_ZN5boost5arrayISsLj4EED2Ev(%"class.boost::array.0"* %seasons)
          to label %for.inc89 unwind label %lpad67.loopexit

for.inc89:                                        ; preds = %invoke.cont84
  %inc90 = add i32 %i.0304, 1
  %cmp = icmp ult i32 %inc90, 2
  br i1 %cmp, label %invoke.cont69, label %for.end91

for.end91:                                        ; preds = %for.inc89
  %call1.i265 = invoke %"class.std::basic_ostream"* @_ZSt16__ostream_insertIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_PKS3_i(%"class.std::basic_ostream"* @_ZSt4cout, i8* getelementptr inbounds ([31 x i8]* @.str9, i32 0, i32 0), i32 30)
          to label %invoke.cont96 unwind label %lpad67.nonloopexit

invoke.cont96:                                    ; preds = %for.end91
  %_M_p.i.i.i222 = getelementptr inbounds %"class.boost::array"* %seasons_i18n, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0
  %48 = load i8** %_M_p.i.i.i222, align 4, !tbaa !0
  %arrayidx.i.i.i223 = getelementptr inbounds i8* %48, i32 -12
  %_M_length.i.i224 = bitcast i8* %arrayidx.i.i.i223 to i32*
  %49 = load i32* %_M_length.i.i224, align 4, !tbaa !3
  %call2.i225 = invoke %"class.std::basic_ostream"* @_ZSt16__ostream_insertIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_PKS3_i(%"class.std::basic_ostream"* @_ZSt4cout, i8* %48, i32 %49)
          to label %invoke.cont98 unwind label %lpad67.nonloopexit

invoke.cont98:                                    ; preds = %invoke.cont96
  %50 = bitcast %"class.std::basic_ostream"* %call2.i225 to i8**
  %vtable.i166 = load i8** %50, align 4, !tbaa !5
  %vbase.offset.ptr.i167 = getelementptr i8* %vtable.i166, i32 -12
  %51 = bitcast i8* %vbase.offset.ptr.i167 to i32*
  %vbase.offset.i168 = load i32* %51, align 4
  %52 = bitcast %"class.std::basic_ostream"* %call2.i225 to i8*
  %add.ptr.i169.sum = add i32 %vbase.offset.i168, 124
  %_M_ctype.i200 = getelementptr inbounds i8* %52, i32 %add.ptr.i169.sum
  %53 = bitcast i8* %_M_ctype.i200 to %"class.std::ctype"**
  %54 = load %"class.std::ctype"** %53, align 4, !tbaa !0
  %tobool.i217 = icmp eq %"class.std::ctype"* %54, null
  br i1 %tobool.i217, label %if.then.i218, label %call.i.noexc201

if.then.i218:                                     ; preds = %invoke.cont98
  invoke void @_ZSt16__throw_bad_castv() noreturn
          to label %.noexc220 unwind label %lpad67.nonloopexit

.noexc220:                                        ; preds = %if.then.i218
  unreachable

call.i.noexc201:                                  ; preds = %invoke.cont98
  %_M_widen_ok.i205 = getelementptr inbounds %"class.std::ctype"* %54, i32 0, i32 6
  %55 = load i8* %_M_widen_ok.i205, align 1, !tbaa !1
  %tobool.i206 = icmp eq i8 %55, 0
  br i1 %tobool.i206, label %if.end.i211, label %if.then.i208

if.then.i208:                                     ; preds = %call.i.noexc201
  %arrayidx.i207 = getelementptr inbounds %"class.std::ctype"* %54, i32 0, i32 7, i32 10
  %56 = load i8* %arrayidx.i207, align 1, !tbaa !1
  br label %call.i.noexc170

if.end.i211:                                      ; preds = %call.i.noexc201
  invoke void @_ZNKSt5ctypeIcE13_M_widen_initEv(%"class.std::ctype"* %54)
          to label %.noexc213 unwind label %lpad67.nonloopexit

.noexc213:                                        ; preds = %if.end.i211
  %57 = bitcast %"class.std::ctype"* %54 to i8 (%"class.std::ctype"*, i8)***
  %vtable.i209 = load i8 (%"class.std::ctype"*, i8)*** %57, align 4, !tbaa !5
  %vfn.i210 = getelementptr inbounds i8 (%"class.std::ctype"*, i8)** %vtable.i209, i32 6
  %58 = load i8 (%"class.std::ctype"*, i8)** %vfn.i210, align 4
  %call.i215 = invoke signext i8 %58(%"class.std::ctype"* %54, i8 signext 10)
          to label %call.i.noexc170 unwind label %lpad67.nonloopexit

call.i.noexc170:                                  ; preds = %.noexc213, %if.then.i208
  %retval.0.i212 = phi i8 [ %56, %if.then.i208 ], [ %call.i215, %.noexc213 ]
  %call1.i173 = invoke %"class.std::basic_ostream"* @_ZNSo3putEc(%"class.std::basic_ostream"* %call2.i225, i8 signext %retval.0.i212)
          to label %call1.i.noexc172 unwind label %lpad67.nonloopexit

call1.i.noexc172:                                 ; preds = %call.i.noexc170
  %call.i177 = invoke %"class.std::basic_ostream"* @_ZNSo5flushEv(%"class.std::basic_ostream"* %call1.i173)
          to label %invoke.cont100 unwind label %lpad67.nonloopexit

invoke.cont100:                                   ; preds = %call1.i.noexc172
  %call1.i162 = invoke %"class.std::basic_ostream"* @_ZSt16__ostream_insertIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_PKS3_i(%"class.std::basic_ostream"* @_ZSt4cout, i8* getelementptr inbounds ([29 x i8]* @.str10, i32 0, i32 0), i32 28)
          to label %invoke.cont113 unwind label %lpad67.nonloopexit

invoke.cont113:                                   ; preds = %invoke.cont100
  %_M_p.i.i.i = getelementptr inbounds %"class.boost::array"* %seasons_i18n, i32 0, i32 0, i32 1, i32 0, i32 3, i32 0, i32 0
  %59 = load i8** %_M_p.i.i.i, align 4, !tbaa !0
  %arrayidx.i.i.i = getelementptr inbounds i8* %59, i32 -12
  %_M_length.i.i = bitcast i8* %arrayidx.i.i.i to i32*
  %60 = load i32* %_M_length.i.i, align 4, !tbaa !3
  %call2.i156 = invoke %"class.std::basic_ostream"* @_ZSt16__ostream_insertIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_PKS3_i(%"class.std::basic_ostream"* @_ZSt4cout, i8* %59, i32 %60)
          to label %invoke.cont115 unwind label %lpad67.nonloopexit

invoke.cont115:                                   ; preds = %invoke.cont113
  %61 = bitcast %"class.std::basic_ostream"* %call2.i156 to i8**
  %vtable.i = load i8** %61, align 4, !tbaa !5
  %vbase.offset.ptr.i = getelementptr i8* %vtable.i, i32 -12
  %62 = bitcast i8* %vbase.offset.ptr.i to i32*
  %vbase.offset.i = load i32* %62, align 4
  %63 = bitcast %"class.std::basic_ostream"* %call2.i156 to i8*
  %add.ptr.i.sum = add i32 %vbase.offset.i, 124
  %_M_ctype.i = getelementptr inbounds i8* %63, i32 %add.ptr.i.sum
  %64 = bitcast i8* %_M_ctype.i to %"class.std::ctype"**
  %65 = load %"class.std::ctype"** %64, align 4, !tbaa !0
  %tobool.i152 = icmp eq %"class.std::ctype"* %65, null
  br i1 %tobool.i152, label %if.then.i153, label %call.i.noexc146

if.then.i153:                                     ; preds = %invoke.cont115
  invoke void @_ZSt16__throw_bad_castv() noreturn
          to label %.noexc155 unwind label %lpad67.nonloopexit

.noexc155:                                        ; preds = %if.then.i153
  unreachable

call.i.noexc146:                                  ; preds = %invoke.cont115
  %_M_widen_ok.i = getelementptr inbounds %"class.std::ctype"* %65, i32 0, i32 6
  %66 = load i8* %_M_widen_ok.i, align 1, !tbaa !1
  %tobool.i = icmp eq i8 %66, 0
  br i1 %tobool.i, label %if.end.i, label %if.then.i

if.then.i:                                        ; preds = %call.i.noexc146
  %arrayidx.i = getelementptr inbounds %"class.std::ctype"* %65, i32 0, i32 7, i32 10
  %67 = load i8* %arrayidx.i, align 1, !tbaa !1
  br label %call.i.noexc

if.end.i:                                         ; preds = %call.i.noexc146
  invoke void @_ZNKSt5ctypeIcE13_M_widen_initEv(%"class.std::ctype"* %65)
          to label %.noexc unwind label %lpad67.nonloopexit

.noexc:                                           ; preds = %if.end.i
  %68 = bitcast %"class.std::ctype"* %65 to i8 (%"class.std::ctype"*, i8)***
  %vtable.i149 = load i8 (%"class.std::ctype"*, i8)*** %68, align 4, !tbaa !5
  %vfn.i = getelementptr inbounds i8 (%"class.std::ctype"*, i8)** %vtable.i149, i32 6
  %69 = load i8 (%"class.std::ctype"*, i8)** %vfn.i, align 4
  %call.i151 = invoke signext i8 %69(%"class.std::ctype"* %65, i8 signext 10)
          to label %call.i.noexc unwind label %lpad67.nonloopexit

call.i.noexc:                                     ; preds = %.noexc, %if.then.i
  %retval.0.i = phi i8 [ %67, %if.then.i ], [ %call.i151, %.noexc ]
  %call1.i142 = invoke %"class.std::basic_ostream"* @_ZNSo3putEc(%"class.std::basic_ostream"* %call2.i156, i8 signext %retval.0.i)
          to label %call1.i.noexc unwind label %lpad67.nonloopexit

call1.i.noexc:                                    ; preds = %call.i.noexc
  %call.i145 = invoke %"class.std::basic_ostream"* @_ZNSo5flushEv(%"class.std::basic_ostream"* %call1.i142)
          to label %invoke.cont117 unwind label %lpad67.nonloopexit

invoke.cont117:                                   ; preds = %call1.i.noexc
  invoke void @_ZN5boost5arrayISsLj4EED2Ev(%"class.boost::array.0"* %arrayinit.element15)
          to label %invoke.cont.i.i128 unwind label %lpad.i.i131

invoke.cont.i.i128:                               ; preds = %invoke.cont117
  invoke void @_ZN5boost5arrayISsLj4EED2Ev(%"class.boost::array.0"* %arrayinit.begin)
          to label %_ZN5boost5arrayINS0_ISsLj4EEELj2EED1Ev.exit139 unwind label %lpad.i.i131

lpad.i.i131:                                      ; preds = %invoke.cont.i.i128, %invoke.cont117
  %arraydestroy.element.lcssa.i.i129 = phi %"class.boost::array.0"* [ %arrayinit.element15, %invoke.cont117 ], [ %arrayinit.begin, %invoke.cont.i.i128 ]
  %70 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %arraydestroy.isempty.i.i130 = icmp eq %"class.boost::array.0"* %arrayinit.begin, %arraydestroy.element.lcssa.i.i129
  br i1 %arraydestroy.isempty.i.i130, label %eh.resume.i.i137, label %arraydestroy.body2.i.i134

arraydestroy.body2.i.i134:                        ; preds = %lpad.i.i131, %invoke.cont5.i.i136
  %arraydestroy.elementPast3.i.i132 = phi %"class.boost::array.0"* [ %arraydestroy.element4.i.i133, %invoke.cont5.i.i136 ], [ %arraydestroy.element.lcssa.i.i129, %lpad.i.i131 ]
  %arraydestroy.element4.i.i133 = getelementptr inbounds %"class.boost::array.0"* %arraydestroy.elementPast3.i.i132, i32 -1
  invoke void @_ZN5boost5arrayISsLj4EED2Ev(%"class.boost::array.0"* %arraydestroy.element4.i.i133)
          to label %invoke.cont5.i.i136 unwind label %terminate.lpad.i.i138

invoke.cont5.i.i136:                              ; preds = %arraydestroy.body2.i.i134
  %arraydestroy.done.i.i135 = icmp eq %"class.boost::array.0"* %arraydestroy.element4.i.i133, %arrayinit.begin
  br i1 %arraydestroy.done.i.i135, label %eh.resume.i.i137, label %arraydestroy.body2.i.i134

eh.resume.i.i137:                                 ; preds = %invoke.cont5.i.i136, %lpad.i.i131
  resume { i8*, i32 } %70

terminate.lpad.i.i138:                            ; preds = %arraydestroy.body2.i.i134
  %71 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          catch i8* null
  call void @_ZSt9terminatev() noreturn nounwind
  unreachable

_ZN5boost5arrayINS0_ISsLj4EEELj2EED1Ev.exit139:   ; preds = %invoke.cont.i.i128
  ret i32 0

ehcleanup119:                                     ; preds = %lpad73, %lpad67
  %exn.slot.7 = phi i8* [ %40, %lpad67 ], [ %42, %lpad73 ]
  %ehselector.slot.7 = phi i32 [ %41, %lpad67 ], [ %43, %lpad73 ]
  invoke void @_ZN5boost5arrayISsLj4EED2Ev(%"class.boost::array.0"* %arrayinit.element15)
          to label %invoke.cont.i.i unwind label %lpad.i.i

invoke.cont.i.i:                                  ; preds = %ehcleanup119
  invoke void @_ZN5boost5arrayISsLj4EED2Ev(%"class.boost::array.0"* %arrayinit.begin)
          to label %eh.resume unwind label %lpad.i.i

lpad.i.i:                                         ; preds = %invoke.cont.i.i, %ehcleanup119
  %arraydestroy.element.lcssa.i.i = phi %"class.boost::array.0"* [ %arrayinit.element15, %ehcleanup119 ], [ %arrayinit.begin, %invoke.cont.i.i ]
  %72 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          catch i8* null
  %arraydestroy.isempty.i.i = icmp eq %"class.boost::array.0"* %arrayinit.begin, %arraydestroy.element.lcssa.i.i
  br i1 %arraydestroy.isempty.i.i, label %terminate.lpad.body, label %arraydestroy.body2.i.i

arraydestroy.body2.i.i:                           ; preds = %lpad.i.i, %invoke.cont5.i.i
  %arraydestroy.elementPast3.i.i = phi %"class.boost::array.0"* [ %arraydestroy.element4.i.i, %invoke.cont5.i.i ], [ %arraydestroy.element.lcssa.i.i, %lpad.i.i ]
  %arraydestroy.element4.i.i = getelementptr inbounds %"class.boost::array.0"* %arraydestroy.elementPast3.i.i, i32 -1
  invoke void @_ZN5boost5arrayISsLj4EED2Ev(%"class.boost::array.0"* %arraydestroy.element4.i.i)
          to label %invoke.cont5.i.i unwind label %terminate.lpad.i.i

invoke.cont5.i.i:                                 ; preds = %arraydestroy.body2.i.i
  %arraydestroy.done.i.i = icmp eq %"class.boost::array.0"* %arraydestroy.element4.i.i, %arrayinit.begin
  br i1 %arraydestroy.done.i.i, label %terminate.lpad.body, label %arraydestroy.body2.i.i

terminate.lpad.i.i:                               ; preds = %arraydestroy.body2.i.i
  %73 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          catch i8* null
  call void @_ZSt9terminatev() noreturn nounwind
  unreachable

eh.resume:                                        ; preds = %invoke.cont63, %invoke.cont.i.i, %cleanup.action58
  %exn.slot.8 = phi i8* [ %exn.slot.6295, %cleanup.action58 ], [ %exn.slot.7, %invoke.cont.i.i ], [ %exn.slot.6295, %invoke.cont63 ]
  %ehselector.slot.8 = phi i32 [ %ehselector.slot.6296, %cleanup.action58 ], [ %ehselector.slot.7, %invoke.cont.i.i ], [ %ehselector.slot.6296, %invoke.cont63 ]
  %lpad.val = insertvalue { i8*, i32 } undef, i8* %exn.slot.8, 0
  %lpad.val121 = insertvalue { i8*, i32 } %lpad.val, i32 %ehselector.slot.8, 1
  resume { i8*, i32 } %lpad.val121

terminate.lpad.loopexit:                          ; preds = %arraydestroy.body60
  %lpad.loopexit305 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          catch i8* null
  br label %terminate.lpad.body

terminate.lpad.nonloopexit:                       ; preds = %lpad73
  %lpad.nonloopexit = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          catch i8* null
  br label %terminate.lpad.body

terminate.lpad.body:                              ; preds = %invoke.cont5.i.i, %terminate.lpad.loopexit, %terminate.lpad.nonloopexit, %lpad.i.i
  call void @_ZSt9terminatev() noreturn nounwind
  unreachable

invoke.cont80.1:                                  ; preds = %for.inc
  %call1.i197.1 = invoke %"class.std::basic_ostream"* @_ZSt16__ostream_insertIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_PKS3_i(%"class.std::basic_ostream"* %call2.i192.1, i8* getelementptr inbounds ([2 x i8]* @.str8, i32 0, i32 0), i32 1)
          to label %for.inc.1 unwind label %lpad73.loopexit

for.inc.1:                                        ; preds = %invoke.cont80.1
  %_M_p.i.i.i189.2 = getelementptr inbounds %"class.boost::array.0"* %seasons, i32 0, i32 0, i32 2, i32 0, i32 0
  %74 = load i8** %_M_p.i.i.i189.2, align 4, !tbaa !0
  %arrayidx.i.i.i190.2 = getelementptr inbounds i8* %74, i32 -12
  %_M_length.i.i191.2 = bitcast i8* %arrayidx.i.i.i190.2 to i32*
  %75 = load i32* %_M_length.i.i191.2, align 4, !tbaa !3
  %call2.i192.2 = invoke %"class.std::basic_ostream"* @_ZSt16__ostream_insertIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_PKS3_i(%"class.std::basic_ostream"* @_ZSt4cout, i8* %74, i32 %75)
          to label %invoke.cont80.2 unwind label %lpad73.loopexit

invoke.cont80.2:                                  ; preds = %for.inc.1
  %call1.i197.2 = invoke %"class.std::basic_ostream"* @_ZSt16__ostream_insertIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_PKS3_i(%"class.std::basic_ostream"* %call2.i192.2, i8* getelementptr inbounds ([2 x i8]* @.str8, i32 0, i32 0), i32 1)
          to label %for.inc.2 unwind label %lpad73.loopexit

for.inc.2:                                        ; preds = %invoke.cont80.2
  %_M_p.i.i.i189.3 = getelementptr inbounds %"class.boost::array.0"* %seasons, i32 0, i32 0, i32 3, i32 0, i32 0
  %76 = load i8** %_M_p.i.i.i189.3, align 4, !tbaa !0
  %arrayidx.i.i.i190.3 = getelementptr inbounds i8* %76, i32 -12
  %_M_length.i.i191.3 = bitcast i8* %arrayidx.i.i.i190.3 to i32*
  %77 = load i32* %_M_length.i.i191.3, align 4, !tbaa !3
  %call2.i192.3 = invoke %"class.std::basic_ostream"* @_ZSt16__ostream_insertIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_PKS3_i(%"class.std::basic_ostream"* @_ZSt4cout, i8* %76, i32 %77)
          to label %invoke.cont80.3 unwind label %lpad73.loopexit

invoke.cont80.3:                                  ; preds = %for.inc.2
  %call1.i197.3 = invoke %"class.std::basic_ostream"* @_ZSt16__ostream_insertIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_PKS3_i(%"class.std::basic_ostream"* %call2.i192.3, i8* getelementptr inbounds ([2 x i8]* @.str8, i32 0, i32 0), i32 1)
          to label %for.inc.3 unwind label %lpad73.loopexit

for.inc.3:                                        ; preds = %invoke.cont80.3
  %vtable.i247 = load i8** bitcast (%"class.std::basic_ostream"* @_ZSt4cout to i8**), align 4, !tbaa !5
  %vbase.offset.ptr.i248 = getelementptr i8* %vtable.i247, i32 -12
  %78 = bitcast i8* %vbase.offset.ptr.i248 to i32*
  %vbase.offset.i249 = load i32* %78, align 4
  %add.ptr.i250.sum = add i32 %vbase.offset.i249, 124
  %_M_ctype.i269 = getelementptr inbounds i8* bitcast (%"class.std::basic_ostream"* @_ZSt4cout to i8*), i32 %add.ptr.i250.sum
  %79 = bitcast i8* %_M_ctype.i269 to %"class.std::ctype"**
  %80 = load %"class.std::ctype"** %79, align 4, !tbaa !0
  %tobool.i286 = icmp eq %"class.std::ctype"* %80, null
  br i1 %tobool.i286, label %if.then.i287, label %call.i.noexc270
}

declare void @_ZNSsC1EPKcRKSaIcE(%"class.std::basic_string"*, i8*, %"class.std::allocator"*)

declare i32 @__gxx_personality_v0(...)

declare void @_ZSt9terminatev()

declare %"class.std::basic_ostream"* @_ZSt16__ostream_insertIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_PKS3_i(%"class.std::basic_ostream"*, i8*, i32)

declare void @_ZNSs4_Rep10_M_destroyERKSaIcE(%"struct.std::basic_string<char, std::char_traits<char>, std::allocator<char> >::_Rep"*, %"class.std::allocator"*) nounwind

declare extern_weak i32 @pthread_cancel(i32)

declare %"class.std::basic_ostream"* @_ZNSo3putEc(%"class.std::basic_ostream"*, i8 signext)

declare void @_ZNKSt5ctypeIcE13_M_widen_initEv(%"class.std::ctype"*)

declare void @_ZSt16__throw_bad_castv() noreturn

declare %"class.std::basic_ostream"* @_ZNSo5flushEv(%"class.std::basic_ostream"*)

declare void @_ZNSsC1ERKSs(%"class.std::basic_string"*, %"class.std::basic_string"*)

define linkonce_odr void @_ZN5boost5arrayISsLj4EED2Ev(%"class.boost::array.0"* %this) unnamed_addr inlinehint align 2 {
entry:
  %ref.tmp.i.i = alloca %"class.std::allocator", align 1
  %0 = getelementptr inbounds %"class.std::allocator"* %ref.tmp.i.i, i32 0, i32 0
  call void @llvm.lifetime.start(i64 1, i8* %0)
  %_M_p.i.i.i.i = getelementptr inbounds %"class.boost::array.0"* %this, i32 0, i32 0, i32 3, i32 0, i32 0
  %1 = load i8** %_M_p.i.i.i.i, align 4, !tbaa !0
  %arrayidx.i.i.i = getelementptr inbounds i8* %1, i32 -12
  %2 = bitcast i8* %arrayidx.i.i.i to %"struct.std::basic_string<char, std::char_traits<char>, std::allocator<char> >::_Rep"*
  %cmp.i.i.i = icmp eq i8* %arrayidx.i.i.i, bitcast ([0 x i32]* @_ZNSs4_Rep20_S_empty_rep_storageE to i8*)
  br i1 %cmp.i.i.i, label %invoke.cont, label %if.then.i.i.i, !prof !4

if.then.i.i.i:                                    ; preds = %entry
  %_M_refcount.i.i.i = getelementptr inbounds i8* %1, i32 -4
  %3 = bitcast i8* %_M_refcount.i.i.i to i32*
  br i1 icmp ne (i8* bitcast (i32 (i32)* @pthread_cancel to i8*), i8* null), label %if.then.i.i.i.i, label %if.else.i.i.i.i

if.then.i.i.i.i:                                  ; preds = %if.then.i.i.i
  %4 = atomicrmw add i32* %3, i32 -1 seq_cst
  br label %_ZN9__gnu_cxxL27__exchange_and_add_dispatchEPii.exit.i.i.i

if.else.i.i.i.i:                                  ; preds = %if.then.i.i.i
  %5 = load i32* %3, align 4, !tbaa !3
  %add.i.i.i.i.i = add nsw i32 %5, -1
  store i32 %add.i.i.i.i.i, i32* %3, align 4, !tbaa !3
  br label %_ZN9__gnu_cxxL27__exchange_and_add_dispatchEPii.exit.i.i.i

_ZN9__gnu_cxxL27__exchange_and_add_dispatchEPii.exit.i.i.i: ; preds = %if.else.i.i.i.i, %if.then.i.i.i.i
  %retval.0.i.i.i.i = phi i32 [ %4, %if.then.i.i.i.i ], [ %5, %if.else.i.i.i.i ]
  %cmp3.i.i.i = icmp slt i32 %retval.0.i.i.i.i, 1
  br i1 %cmp3.i.i.i, label %if.then4.i.i.i, label %invoke.cont

if.then4.i.i.i:                                   ; preds = %_ZN9__gnu_cxxL27__exchange_and_add_dispatchEPii.exit.i.i.i
  call void @_ZNSs4_Rep10_M_destroyERKSaIcE(%"struct.std::basic_string<char, std::char_traits<char>, std::allocator<char> >::_Rep"* %2, %"class.std::allocator"* %ref.tmp.i.i) nounwind
  br label %invoke.cont

invoke.cont:                                      ; preds = %if.then4.i.i.i, %_ZN9__gnu_cxxL27__exchange_and_add_dispatchEPii.exit.i.i.i, %entry
  call void @llvm.lifetime.end(i64 1, i8* %0)
  call void @llvm.lifetime.start(i64 1, i8* %0)
  %_M_p.i.i.i.i.1 = getelementptr inbounds %"class.boost::array.0"* %this, i32 0, i32 0, i32 2, i32 0, i32 0
  %6 = load i8** %_M_p.i.i.i.i.1, align 4, !tbaa !0
  %arrayidx.i.i.i.1 = getelementptr inbounds i8* %6, i32 -12
  %7 = bitcast i8* %arrayidx.i.i.i.1 to %"struct.std::basic_string<char, std::char_traits<char>, std::allocator<char> >::_Rep"*
  %cmp.i.i.i.1 = icmp eq i8* %arrayidx.i.i.i.1, bitcast ([0 x i32]* @_ZNSs4_Rep20_S_empty_rep_storageE to i8*)
  br i1 %cmp.i.i.i.1, label %invoke.cont.1, label %if.then.i.i.i.1, !prof !4

if.then.i.i.i.1:                                  ; preds = %invoke.cont
  %_M_refcount.i.i.i.1 = getelementptr inbounds i8* %6, i32 -4
  %8 = bitcast i8* %_M_refcount.i.i.i.1 to i32*
  br i1 icmp ne (i8* bitcast (i32 (i32)* @pthread_cancel to i8*), i8* null), label %if.then.i.i.i.i.1, label %if.else.i.i.i.i.1

if.else.i.i.i.i.1:                                ; preds = %if.then.i.i.i.1
  %9 = load i32* %8, align 4, !tbaa !3
  %add.i.i.i.i.i.1 = add nsw i32 %9, -1
  store i32 %add.i.i.i.i.i.1, i32* %8, align 4, !tbaa !3
  br label %_ZN9__gnu_cxxL27__exchange_and_add_dispatchEPii.exit.i.i.i.1

if.then.i.i.i.i.1:                                ; preds = %if.then.i.i.i.1
  %10 = atomicrmw add i32* %8, i32 -1 seq_cst
  br label %_ZN9__gnu_cxxL27__exchange_and_add_dispatchEPii.exit.i.i.i.1

_ZN9__gnu_cxxL27__exchange_and_add_dispatchEPii.exit.i.i.i.1: ; preds = %if.then.i.i.i.i.1, %if.else.i.i.i.i.1
  %retval.0.i.i.i.i.1 = phi i32 [ %10, %if.then.i.i.i.i.1 ], [ %9, %if.else.i.i.i.i.1 ]
  %cmp3.i.i.i.1 = icmp slt i32 %retval.0.i.i.i.i.1, 1
  br i1 %cmp3.i.i.i.1, label %if.then4.i.i.i.1, label %invoke.cont.1

if.then4.i.i.i.1:                                 ; preds = %_ZN9__gnu_cxxL27__exchange_and_add_dispatchEPii.exit.i.i.i.1
  call void @_ZNSs4_Rep10_M_destroyERKSaIcE(%"struct.std::basic_string<char, std::char_traits<char>, std::allocator<char> >::_Rep"* %7, %"class.std::allocator"* %ref.tmp.i.i) nounwind
  br label %invoke.cont.1

invoke.cont.1:                                    ; preds = %if.then4.i.i.i.1, %_ZN9__gnu_cxxL27__exchange_and_add_dispatchEPii.exit.i.i.i.1, %invoke.cont
  call void @llvm.lifetime.end(i64 1, i8* %0)
  call void @llvm.lifetime.start(i64 1, i8* %0)
  %_M_p.i.i.i.i.2 = getelementptr inbounds %"class.boost::array.0"* %this, i32 0, i32 0, i32 1, i32 0, i32 0
  %11 = load i8** %_M_p.i.i.i.i.2, align 4, !tbaa !0
  %arrayidx.i.i.i.2 = getelementptr inbounds i8* %11, i32 -12
  %12 = bitcast i8* %arrayidx.i.i.i.2 to %"struct.std::basic_string<char, std::char_traits<char>, std::allocator<char> >::_Rep"*
  %cmp.i.i.i.2 = icmp eq i8* %arrayidx.i.i.i.2, bitcast ([0 x i32]* @_ZNSs4_Rep20_S_empty_rep_storageE to i8*)
  br i1 %cmp.i.i.i.2, label %invoke.cont.2, label %if.then.i.i.i.2, !prof !4

if.then.i.i.i.2:                                  ; preds = %invoke.cont.1
  %_M_refcount.i.i.i.2 = getelementptr inbounds i8* %11, i32 -4
  %13 = bitcast i8* %_M_refcount.i.i.i.2 to i32*
  br i1 icmp ne (i8* bitcast (i32 (i32)* @pthread_cancel to i8*), i8* null), label %if.then.i.i.i.i.2, label %if.else.i.i.i.i.2

if.else.i.i.i.i.2:                                ; preds = %if.then.i.i.i.2
  %14 = load i32* %13, align 4, !tbaa !3
  %add.i.i.i.i.i.2 = add nsw i32 %14, -1
  store i32 %add.i.i.i.i.i.2, i32* %13, align 4, !tbaa !3
  br label %_ZN9__gnu_cxxL27__exchange_and_add_dispatchEPii.exit.i.i.i.2

if.then.i.i.i.i.2:                                ; preds = %if.then.i.i.i.2
  %15 = atomicrmw add i32* %13, i32 -1 seq_cst
  br label %_ZN9__gnu_cxxL27__exchange_and_add_dispatchEPii.exit.i.i.i.2

_ZN9__gnu_cxxL27__exchange_and_add_dispatchEPii.exit.i.i.i.2: ; preds = %if.then.i.i.i.i.2, %if.else.i.i.i.i.2
  %retval.0.i.i.i.i.2 = phi i32 [ %15, %if.then.i.i.i.i.2 ], [ %14, %if.else.i.i.i.i.2 ]
  %cmp3.i.i.i.2 = icmp slt i32 %retval.0.i.i.i.i.2, 1
  br i1 %cmp3.i.i.i.2, label %if.then4.i.i.i.2, label %invoke.cont.2

if.then4.i.i.i.2:                                 ; preds = %_ZN9__gnu_cxxL27__exchange_and_add_dispatchEPii.exit.i.i.i.2
  call void @_ZNSs4_Rep10_M_destroyERKSaIcE(%"struct.std::basic_string<char, std::char_traits<char>, std::allocator<char> >::_Rep"* %12, %"class.std::allocator"* %ref.tmp.i.i) nounwind
  br label %invoke.cont.2

invoke.cont.2:                                    ; preds = %if.then4.i.i.i.2, %_ZN9__gnu_cxxL27__exchange_and_add_dispatchEPii.exit.i.i.i.2, %invoke.cont.1
  call void @llvm.lifetime.end(i64 1, i8* %0)
  call void @llvm.lifetime.start(i64 1, i8* %0)
  %_M_p.i.i.i.i.3 = getelementptr inbounds %"class.boost::array.0"* %this, i32 0, i32 0, i32 0, i32 0, i32 0
  %16 = load i8** %_M_p.i.i.i.i.3, align 4, !tbaa !0
  %arrayidx.i.i.i.3 = getelementptr inbounds i8* %16, i32 -12
  %17 = bitcast i8* %arrayidx.i.i.i.3 to %"struct.std::basic_string<char, std::char_traits<char>, std::allocator<char> >::_Rep"*
  %cmp.i.i.i.3 = icmp eq i8* %arrayidx.i.i.i.3, bitcast ([0 x i32]* @_ZNSs4_Rep20_S_empty_rep_storageE to i8*)
  br i1 %cmp.i.i.i.3, label %invoke.cont.3, label %if.then.i.i.i.3, !prof !4

if.then.i.i.i.3:                                  ; preds = %invoke.cont.2
  %_M_refcount.i.i.i.3 = getelementptr inbounds i8* %16, i32 -4
  %18 = bitcast i8* %_M_refcount.i.i.i.3 to i32*
  br i1 icmp ne (i8* bitcast (i32 (i32)* @pthread_cancel to i8*), i8* null), label %if.then.i.i.i.i.3, label %if.else.i.i.i.i.3

if.else.i.i.i.i.3:                                ; preds = %if.then.i.i.i.3
  %19 = load i32* %18, align 4, !tbaa !3
  %add.i.i.i.i.i.3 = add nsw i32 %19, -1
  store i32 %add.i.i.i.i.i.3, i32* %18, align 4, !tbaa !3
  br label %_ZN9__gnu_cxxL27__exchange_and_add_dispatchEPii.exit.i.i.i.3

if.then.i.i.i.i.3:                                ; preds = %if.then.i.i.i.3
  %20 = atomicrmw add i32* %18, i32 -1 seq_cst
  br label %_ZN9__gnu_cxxL27__exchange_and_add_dispatchEPii.exit.i.i.i.3

_ZN9__gnu_cxxL27__exchange_and_add_dispatchEPii.exit.i.i.i.3: ; preds = %if.then.i.i.i.i.3, %if.else.i.i.i.i.3
  %retval.0.i.i.i.i.3 = phi i32 [ %20, %if.then.i.i.i.i.3 ], [ %19, %if.else.i.i.i.i.3 ]
  %cmp3.i.i.i.3 = icmp slt i32 %retval.0.i.i.i.i.3, 1
  br i1 %cmp3.i.i.i.3, label %if.then4.i.i.i.3, label %invoke.cont.3

if.then4.i.i.i.3:                                 ; preds = %_ZN9__gnu_cxxL27__exchange_and_add_dispatchEPii.exit.i.i.i.3
  call void @_ZNSs4_Rep10_M_destroyERKSaIcE(%"struct.std::basic_string<char, std::char_traits<char>, std::allocator<char> >::_Rep"* %17, %"class.std::allocator"* %ref.tmp.i.i) nounwind
  br label %invoke.cont.3

invoke.cont.3:                                    ; preds = %if.then4.i.i.i.3, %_ZN9__gnu_cxxL27__exchange_and_add_dispatchEPii.exit.i.i.i.3, %invoke.cont.2
  call void @llvm.lifetime.end(i64 1, i8* %0)
  ret void
}

define internal void @_GLOBAL__I_a() section ".text.startup" {
entry:
  tail call void @_ZNSt8ios_base4InitC1Ev(%"class.std::ios_base::Init"* @_ZStL8__ioinit)
  %0 = tail call i32 @__cxa_atexit(void (i8*)* bitcast (void (%"class.std::ios_base::Init"*)* @_ZNSt8ios_base4InitD1Ev to void (i8*)*), i8* getelementptr inbounds (%"class.std::ios_base::Init"* @_ZStL8__ioinit, i32 0, i32 0), i8* @__dso_handle) nounwind
  ret void
}

declare void @llvm.lifetime.start(i64, i8* nocapture) nounwind

declare void @llvm.lifetime.end(i64, i8* nocapture) nounwind

!0 = metadata !{metadata !"any pointer", metadata !1}
!1 = metadata !{metadata !"omnipotent char", metadata !2}
!2 = metadata !{metadata !"Simple C/C++ TBAA"}
!3 = metadata !{metadata !"int", metadata !1}
!4 = metadata !{metadata !"branch_weights", i32 64, i32 4}
!5 = metadata !{metadata !"vtable pointer", metadata !2}
