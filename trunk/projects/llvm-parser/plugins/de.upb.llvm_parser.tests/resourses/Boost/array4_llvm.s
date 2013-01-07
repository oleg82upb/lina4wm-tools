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
%"class.boost::array" = type { [2 x %"class.boost::array.0"] }
%"class.boost::array.0" = type { [4 x %"class.std::basic_string"] }
%"class.std::basic_string" = type { %"struct.std::basic_string<char, std::char_traits<char>, std::allocator<char> >::_Alloc_hider" }
%"struct.std::basic_string<char, std::char_traits<char>, std::allocator<char> >::_Alloc_hider" = type { i8* }
%"class.std::allocator" = type { i8 }

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
@.str11 = private unnamed_addr constant [6 x i8] c"i < N\00", align 1
@.str12 = private unnamed_addr constant [13 x i8] c"out of range\00", align 1
@__PRETTY_FUNCTION__._ZN5boost5arrayISsLj4EEixEj = private unnamed_addr constant [111 x i8] c"reference boost::array<std::basic_string<char>, 4>::operator[](size_type) [T = std::basic_string<char>, N = 4]\00", align 1
@.str13 = private unnamed_addr constant [42 x i8] c"/home/thomas/boost_1_52_0/boost/array.hpp\00", align 1
@_ZSt4cerr = external global %"class.std::basic_ostream"
@.str14 = private unnamed_addr constant [43 x i8] c"***** Internal Program Error - assertion (\00", align 1
@.str15 = private unnamed_addr constant [13 x i8] c") failed in \00", align 1
@.str16 = private unnamed_addr constant [3 x i8] c":\0A\00", align 1
@.str17 = private unnamed_addr constant [4 x i8] c"): \00", align 1
@__PRETTY_FUNCTION__._ZN5boost5arrayINS0_ISsLj4EEELj2EEixEj = private unnamed_addr constant [145 x i8] c"reference boost::array<boost::array<std::basic_string<char>, 4>, 2>::operator[](size_type) [T = boost::array<std::basic_string<char>, 4>, N = 2]\00", align 1
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
  %seasons_i18n = alloca %"class.boost::array", align 4
  %arrayinit.endOfInit = alloca %"class.boost::array.0"*
  %arrayinit.endOfInit3 = alloca %"class.std::basic_string"*
  %ref.tmp = alloca %"class.std::allocator", align 1
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  %ref.tmp4 = alloca %"class.std::allocator", align 1
  %ref.tmp8 = alloca %"class.std::allocator", align 1
  %ref.tmp12 = alloca %"class.std::allocator", align 1
  %cleanup.isactive = alloca i1
  %arrayinit.endOfInit18 = alloca %"class.std::basic_string"*
  %ref.tmp19 = alloca %"class.std::allocator", align 1
  %ref.tmp23 = alloca %"class.std::allocator", align 1
  %ref.tmp27 = alloca %"class.std::allocator", align 1
  %ref.tmp31 = alloca %"class.std::allocator", align 1
  %cleanup.isactive34 = alloca i1
  %cleanup.isactive35 = alloca i1
  %i = alloca i32, align 4
  %seasons = alloca %"class.boost::array.0", align 4
  %j = alloca i32, align 4
  %cleanup.dest.slot = alloca i32
  store i32 0, i32* %retval
  %elems = getelementptr inbounds %"class.boost::array"* %seasons_i18n, i32 0, i32 0
  %arrayinit.begin = getelementptr inbounds [2 x %"class.boost::array.0"]* %elems, i32 0, i32 0
  store i1 true, i1* %cleanup.isactive35
  store %"class.boost::array.0"* %arrayinit.begin, %"class.boost::array.0"** %arrayinit.endOfInit
  %elems1 = getelementptr inbounds %"class.boost::array.0"* %arrayinit.begin, i32 0, i32 0
  %arrayinit.begin2 = getelementptr inbounds [4 x %"class.std::basic_string"]* %elems1, i32 0, i32 0
  store i1 true, i1* %cleanup.isactive
  store %"class.std::basic_string"* %arrayinit.begin2, %"class.std::basic_string"** %arrayinit.endOfInit3
  call void @_ZNSaIcEC1Ev(%"class.std::allocator"* %ref.tmp) nounwind
  invoke void @_ZNSsC1EPKcRKSaIcE(%"class.std::basic_string"* %arrayinit.begin2, i8* getelementptr inbounds ([7 x i8]* @.str, i32 0, i32 0), %"class.std::allocator"* %ref.tmp)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %entry
  %arrayinit.element = getelementptr inbounds %"class.std::basic_string"* %arrayinit.begin2, i32 1
  store %"class.std::basic_string"* %arrayinit.element, %"class.std::basic_string"** %arrayinit.endOfInit3
  call void @_ZNSaIcEC1Ev(%"class.std::allocator"* %ref.tmp4) nounwind
  invoke void @_ZNSsC1EPKcRKSaIcE(%"class.std::basic_string"* %arrayinit.element, i8* getelementptr inbounds ([7 x i8]* @.str1, i32 0, i32 0), %"class.std::allocator"* %ref.tmp4)
          to label %invoke.cont6 unwind label %lpad5

invoke.cont6:                                     ; preds = %invoke.cont
  %arrayinit.element7 = getelementptr inbounds %"class.std::basic_string"* %arrayinit.element, i32 1
  store %"class.std::basic_string"* %arrayinit.element7, %"class.std::basic_string"** %arrayinit.endOfInit3
  call void @_ZNSaIcEC1Ev(%"class.std::allocator"* %ref.tmp8) nounwind
  invoke void @_ZNSsC1EPKcRKSaIcE(%"class.std::basic_string"* %arrayinit.element7, i8* getelementptr inbounds ([7 x i8]* @.str2, i32 0, i32 0), %"class.std::allocator"* %ref.tmp8)
          to label %invoke.cont10 unwind label %lpad9

invoke.cont10:                                    ; preds = %invoke.cont6
  %arrayinit.element11 = getelementptr inbounds %"class.std::basic_string"* %arrayinit.element7, i32 1
  store %"class.std::basic_string"* %arrayinit.element11, %"class.std::basic_string"** %arrayinit.endOfInit3
  call void @_ZNSaIcEC1Ev(%"class.std::allocator"* %ref.tmp12) nounwind
  invoke void @_ZNSsC1EPKcRKSaIcE(%"class.std::basic_string"* %arrayinit.element11, i8* getelementptr inbounds ([7 x i8]* @.str3, i32 0, i32 0), %"class.std::allocator"* %ref.tmp12)
          to label %invoke.cont14 unwind label %lpad13

invoke.cont14:                                    ; preds = %invoke.cont10
  store i1 false, i1* %cleanup.isactive
  %arrayinit.element15 = getelementptr inbounds %"class.boost::array.0"* %arrayinit.begin, i32 1
  store %"class.boost::array.0"* %arrayinit.element15, %"class.boost::array.0"** %arrayinit.endOfInit
  %elems16 = getelementptr inbounds %"class.boost::array.0"* %arrayinit.element15, i32 0, i32 0
  %arrayinit.begin17 = getelementptr inbounds [4 x %"class.std::basic_string"]* %elems16, i32 0, i32 0
  store i1 true, i1* %cleanup.isactive34
  store %"class.std::basic_string"* %arrayinit.begin17, %"class.std::basic_string"** %arrayinit.endOfInit18
  call void @_ZNSaIcEC1Ev(%"class.std::allocator"* %ref.tmp19) nounwind
  invoke void @_ZNSsC1EPKcRKSaIcE(%"class.std::basic_string"* %arrayinit.begin17, i8* getelementptr inbounds ([10 x i8]* @.str4, i32 0, i32 0), %"class.std::allocator"* %ref.tmp19)
          to label %invoke.cont21 unwind label %lpad20

invoke.cont21:                                    ; preds = %invoke.cont14
  %arrayinit.element22 = getelementptr inbounds %"class.std::basic_string"* %arrayinit.begin17, i32 1
  store %"class.std::basic_string"* %arrayinit.element22, %"class.std::basic_string"** %arrayinit.endOfInit18
  call void @_ZNSaIcEC1Ev(%"class.std::allocator"* %ref.tmp23) nounwind
  invoke void @_ZNSsC1EPKcRKSaIcE(%"class.std::basic_string"* %arrayinit.element22, i8* getelementptr inbounds ([7 x i8]* @.str5, i32 0, i32 0), %"class.std::allocator"* %ref.tmp23)
          to label %invoke.cont25 unwind label %lpad24

invoke.cont25:                                    ; preds = %invoke.cont21
  %arrayinit.element26 = getelementptr inbounds %"class.std::basic_string"* %arrayinit.element22, i32 1
  store %"class.std::basic_string"* %arrayinit.element26, %"class.std::basic_string"** %arrayinit.endOfInit18
  call void @_ZNSaIcEC1Ev(%"class.std::allocator"* %ref.tmp27) nounwind
  invoke void @_ZNSsC1EPKcRKSaIcE(%"class.std::basic_string"* %arrayinit.element26, i8* getelementptr inbounds ([7 x i8]* @.str6, i32 0, i32 0), %"class.std::allocator"* %ref.tmp27)
          to label %invoke.cont29 unwind label %lpad28

invoke.cont29:                                    ; preds = %invoke.cont25
  %arrayinit.element30 = getelementptr inbounds %"class.std::basic_string"* %arrayinit.element26, i32 1
  store %"class.std::basic_string"* %arrayinit.element30, %"class.std::basic_string"** %arrayinit.endOfInit18
  call void @_ZNSaIcEC1Ev(%"class.std::allocator"* %ref.tmp31) nounwind
  invoke void @_ZNSsC1EPKcRKSaIcE(%"class.std::basic_string"* %arrayinit.element30, i8* getelementptr inbounds ([7 x i8]* @.str7, i32 0, i32 0), %"class.std::allocator"* %ref.tmp31)
          to label %invoke.cont33 unwind label %lpad32

invoke.cont33:                                    ; preds = %invoke.cont29
  store i1 false, i1* %cleanup.isactive34
  store i1 false, i1* %cleanup.isactive35
  call void @_ZNSaIcED1Ev(%"class.std::allocator"* %ref.tmp31) nounwind
  call void @_ZNSaIcED1Ev(%"class.std::allocator"* %ref.tmp27) nounwind
  call void @_ZNSaIcED1Ev(%"class.std::allocator"* %ref.tmp23) nounwind
  call void @_ZNSaIcED1Ev(%"class.std::allocator"* %ref.tmp19) nounwind
  call void @_ZNSaIcED1Ev(%"class.std::allocator"* %ref.tmp12) nounwind
  call void @_ZNSaIcED1Ev(%"class.std::allocator"* %ref.tmp8) nounwind
  call void @_ZNSaIcED1Ev(%"class.std::allocator"* %ref.tmp4) nounwind
  call void @_ZNSaIcED1Ev(%"class.std::allocator"* %ref.tmp) nounwind
  store i32 0, i32* %i, align 4
  br label %for.cond

for.cond:                                         ; preds = %for.inc89, %invoke.cont33
  %0 = load i32* %i, align 4
  %call = invoke i32 @_ZN5boost5arrayINS0_ISsLj4EEELj2EE4sizeEv()
          to label %invoke.cont68 unwind label %lpad67

invoke.cont68:                                    ; preds = %for.cond
  %cmp = icmp ult i32 %0, %call
  br i1 %cmp, label %for.body, label %for.end91

for.body:                                         ; preds = %invoke.cont68
  %1 = load i32* %i, align 4
  %call70 = invoke %"class.boost::array.0"* @_ZN5boost5arrayINS0_ISsLj4EEELj2EEixEj(%"class.boost::array"* %seasons_i18n, i32 %1)
          to label %invoke.cont69 unwind label %lpad67

invoke.cont69:                                    ; preds = %for.body
  invoke void @_ZN5boost5arrayISsLj4EEC1ERKS1_(%"class.boost::array.0"* %seasons, %"class.boost::array.0"* %call70)
          to label %invoke.cont71 unwind label %lpad67

invoke.cont71:                                    ; preds = %invoke.cont69
  store i32 0, i32* %j, align 4
  br label %for.cond72

for.cond72:                                       ; preds = %for.inc, %invoke.cont71
  %2 = load i32* %j, align 4
  %call75 = invoke i32 @_ZN5boost5arrayISsLj4EE4sizeEv()
          to label %invoke.cont74 unwind label %lpad73

invoke.cont74:                                    ; preds = %for.cond72
  %cmp76 = icmp ult i32 %2, %call75
  br i1 %cmp76, label %for.body77, label %for.end

for.body77:                                       ; preds = %invoke.cont74
  %3 = load i32* %j, align 4
  %call79 = invoke %"class.std::basic_string"* @_ZN5boost5arrayISsLj4EEixEj(%"class.boost::array.0"* %seasons, i32 %3)
          to label %invoke.cont78 unwind label %lpad73

invoke.cont78:                                    ; preds = %for.body77
  %call81 = invoke %"class.std::basic_ostream"* @_ZStlsIcSt11char_traitsIcESaIcEERSt13basic_ostreamIT_T0_ES7_RKSbIS4_S5_T1_E(%"class.std::basic_ostream"* @_ZSt4cout, %"class.std::basic_string"* %call79)
          to label %invoke.cont80 unwind label %lpad73

invoke.cont80:                                    ; preds = %invoke.cont78
  %call83 = invoke %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* %call81, i8* getelementptr inbounds ([2 x i8]* @.str8, i32 0, i32 0))
          to label %invoke.cont82 unwind label %lpad73

invoke.cont82:                                    ; preds = %invoke.cont80
  br label %for.inc

for.inc:                                          ; preds = %invoke.cont82
  %4 = load i32* %j, align 4
  %inc = add i32 %4, 1
  store i32 %inc, i32* %j, align 4
  br label %for.cond72

lpad:                                             ; preds = %entry
  %5 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %6 = extractvalue { i8*, i32 } %5, 0
  store i8* %6, i8** %exn.slot
  %7 = extractvalue { i8*, i32 } %5, 1
  store i32 %7, i32* %ehselector.slot
  br label %ehcleanup44

lpad5:                                            ; preds = %invoke.cont
  %8 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %9 = extractvalue { i8*, i32 } %8, 0
  store i8* %9, i8** %exn.slot
  %10 = extractvalue { i8*, i32 } %8, 1
  store i32 %10, i32* %ehselector.slot
  br label %ehcleanup43

lpad9:                                            ; preds = %invoke.cont6
  %11 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %12 = extractvalue { i8*, i32 } %11, 0
  store i8* %12, i8** %exn.slot
  %13 = extractvalue { i8*, i32 } %11, 1
  store i32 %13, i32* %ehselector.slot
  br label %ehcleanup42

lpad13:                                           ; preds = %invoke.cont10
  %14 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %15 = extractvalue { i8*, i32 } %14, 0
  store i8* %15, i8** %exn.slot
  %16 = extractvalue { i8*, i32 } %14, 1
  store i32 %16, i32* %ehselector.slot
  br label %ehcleanup41

lpad20:                                           ; preds = %invoke.cont14
  %17 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %18 = extractvalue { i8*, i32 } %17, 0
  store i8* %18, i8** %exn.slot
  %19 = extractvalue { i8*, i32 } %17, 1
  store i32 %19, i32* %ehselector.slot
  br label %ehcleanup37

lpad24:                                           ; preds = %invoke.cont21
  %20 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %21 = extractvalue { i8*, i32 } %20, 0
  store i8* %21, i8** %exn.slot
  %22 = extractvalue { i8*, i32 } %20, 1
  store i32 %22, i32* %ehselector.slot
  br label %ehcleanup36

lpad28:                                           ; preds = %invoke.cont25
  %23 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %24 = extractvalue { i8*, i32 } %23, 0
  store i8* %24, i8** %exn.slot
  %25 = extractvalue { i8*, i32 } %23, 1
  store i32 %25, i32* %ehselector.slot
  br label %ehcleanup

lpad32:                                           ; preds = %invoke.cont29
  %26 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %27 = extractvalue { i8*, i32 } %26, 0
  store i8* %27, i8** %exn.slot
  %28 = extractvalue { i8*, i32 } %26, 1
  store i32 %28, i32* %ehselector.slot
  call void @_ZNSaIcED1Ev(%"class.std::allocator"* %ref.tmp31) nounwind
  br label %ehcleanup

ehcleanup:                                        ; preds = %lpad32, %lpad28
  call void @_ZNSaIcED1Ev(%"class.std::allocator"* %ref.tmp27) nounwind
  br label %ehcleanup36

ehcleanup36:                                      ; preds = %ehcleanup, %lpad24
  call void @_ZNSaIcED1Ev(%"class.std::allocator"* %ref.tmp23) nounwind
  br label %ehcleanup37

ehcleanup37:                                      ; preds = %ehcleanup36, %lpad20
  call void @_ZNSaIcED1Ev(%"class.std::allocator"* %ref.tmp19) nounwind
  %cleanup.is_active = load i1* %cleanup.isactive34
  br i1 %cleanup.is_active, label %cleanup.action, label %cleanup.done

cleanup.action:                                   ; preds = %ehcleanup37
  %29 = load %"class.std::basic_string"** %arrayinit.endOfInit18
  %arraydestroy.isempty = icmp eq %"class.std::basic_string"* %arrayinit.begin17, %29
  br i1 %arraydestroy.isempty, label %arraydestroy.done40, label %arraydestroy.body

arraydestroy.body:                                ; preds = %invoke.cont39, %cleanup.action
  %arraydestroy.elementPast = phi %"class.std::basic_string"* [ %29, %cleanup.action ], [ %arraydestroy.element, %invoke.cont39 ]
  %arraydestroy.element = getelementptr inbounds %"class.std::basic_string"* %arraydestroy.elementPast, i32 -1
  invoke void @_ZNSsD1Ev(%"class.std::basic_string"* %arraydestroy.element)
          to label %invoke.cont39 unwind label %terminate.lpad

invoke.cont39:                                    ; preds = %arraydestroy.body
  %arraydestroy.done = icmp eq %"class.std::basic_string"* %arraydestroy.element, %arrayinit.begin17
  br i1 %arraydestroy.done, label %arraydestroy.done40, label %arraydestroy.body

arraydestroy.done40:                              ; preds = %invoke.cont39, %cleanup.action
  br label %cleanup.done

cleanup.done:                                     ; preds = %arraydestroy.done40, %ehcleanup37
  br label %ehcleanup41

ehcleanup41:                                      ; preds = %cleanup.done, %lpad13
  call void @_ZNSaIcED1Ev(%"class.std::allocator"* %ref.tmp12) nounwind
  br label %ehcleanup42

ehcleanup42:                                      ; preds = %ehcleanup41, %lpad9
  call void @_ZNSaIcED1Ev(%"class.std::allocator"* %ref.tmp8) nounwind
  br label %ehcleanup43

ehcleanup43:                                      ; preds = %ehcleanup42, %lpad5
  call void @_ZNSaIcED1Ev(%"class.std::allocator"* %ref.tmp4) nounwind
  br label %ehcleanup44

ehcleanup44:                                      ; preds = %ehcleanup43, %lpad
  call void @_ZNSaIcED1Ev(%"class.std::allocator"* %ref.tmp) nounwind
  %cleanup.is_active46 = load i1* %cleanup.isactive
  br i1 %cleanup.is_active46, label %cleanup.action47, label %cleanup.done55

cleanup.action47:                                 ; preds = %ehcleanup44
  %30 = load %"class.std::basic_string"** %arrayinit.endOfInit3
  %arraydestroy.isempty48 = icmp eq %"class.std::basic_string"* %arrayinit.begin2, %30
  br i1 %arraydestroy.isempty48, label %arraydestroy.done54, label %arraydestroy.body49

arraydestroy.body49:                              ; preds = %invoke.cont52, %cleanup.action47
  %arraydestroy.elementPast50 = phi %"class.std::basic_string"* [ %30, %cleanup.action47 ], [ %arraydestroy.element51, %invoke.cont52 ]
  %arraydestroy.element51 = getelementptr inbounds %"class.std::basic_string"* %arraydestroy.elementPast50, i32 -1
  invoke void @_ZNSsD1Ev(%"class.std::basic_string"* %arraydestroy.element51)
          to label %invoke.cont52 unwind label %terminate.lpad

invoke.cont52:                                    ; preds = %arraydestroy.body49
  %arraydestroy.done53 = icmp eq %"class.std::basic_string"* %arraydestroy.element51, %arrayinit.begin2
  br i1 %arraydestroy.done53, label %arraydestroy.done54, label %arraydestroy.body49

arraydestroy.done54:                              ; preds = %invoke.cont52, %cleanup.action47
  br label %cleanup.done55

cleanup.done55:                                   ; preds = %arraydestroy.done54, %ehcleanup44
  %cleanup.is_active57 = load i1* %cleanup.isactive35
  br i1 %cleanup.is_active57, label %cleanup.action58, label %cleanup.done66

cleanup.action58:                                 ; preds = %cleanup.done55
  %31 = load %"class.boost::array.0"** %arrayinit.endOfInit
  %arraydestroy.isempty59 = icmp eq %"class.boost::array.0"* %arrayinit.begin, %31
  br i1 %arraydestroy.isempty59, label %arraydestroy.done65, label %arraydestroy.body60

arraydestroy.body60:                              ; preds = %invoke.cont63, %cleanup.action58
  %arraydestroy.elementPast61 = phi %"class.boost::array.0"* [ %31, %cleanup.action58 ], [ %arraydestroy.element62, %invoke.cont63 ]
  %arraydestroy.element62 = getelementptr inbounds %"class.boost::array.0"* %arraydestroy.elementPast61, i32 -1
  invoke void @_ZN5boost5arrayISsLj4EED1Ev(%"class.boost::array.0"* %arraydestroy.element62)
          to label %invoke.cont63 unwind label %terminate.lpad

invoke.cont63:                                    ; preds = %arraydestroy.body60
  %arraydestroy.done64 = icmp eq %"class.boost::array.0"* %arraydestroy.element62, %arrayinit.begin
  br i1 %arraydestroy.done64, label %arraydestroy.done65, label %arraydestroy.body60

arraydestroy.done65:                              ; preds = %invoke.cont63, %cleanup.action58
  br label %cleanup.done66

cleanup.done66:                                   ; preds = %arraydestroy.done65, %cleanup.done55
  br label %eh.resume

lpad67:                                           ; preds = %invoke.cont115, %invoke.cont113, %invoke.cont110, %invoke.cont108, %invoke.cont106, %invoke.cont104, %invoke.cont102, %invoke.cont100, %invoke.cont98, %invoke.cont96, %invoke.cont94, %invoke.cont92, %for.end91, %invoke.cont84, %invoke.cont69, %for.body, %for.cond
  %32 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %33 = extractvalue { i8*, i32 } %32, 0
  store i8* %33, i8** %exn.slot
  %34 = extractvalue { i8*, i32 } %32, 1
  store i32 %34, i32* %ehselector.slot
  br label %ehcleanup119

lpad73:                                           ; preds = %for.end, %invoke.cont80, %invoke.cont78, %for.body77, %for.cond72
  %35 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %36 = extractvalue { i8*, i32 } %35, 0
  store i8* %36, i8** %exn.slot
  %37 = extractvalue { i8*, i32 } %35, 1
  store i32 %37, i32* %ehselector.slot
  invoke void @_ZN5boost5arrayISsLj4EED1Ev(%"class.boost::array.0"* %seasons)
          to label %invoke.cont88 unwind label %terminate.lpad

for.end:                                          ; preds = %invoke.cont74
  %call85 = invoke %"class.std::basic_ostream"* @_ZNSolsEPFRSoS_E(%"class.std::basic_ostream"* @_ZSt4cout, %"class.std::basic_ostream"* (%"class.std::basic_ostream"*)* @_ZSt4endlIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_)
          to label %invoke.cont84 unwind label %lpad73

invoke.cont84:                                    ; preds = %for.end
  invoke void @_ZN5boost5arrayISsLj4EED1Ev(%"class.boost::array.0"* %seasons)
          to label %invoke.cont86 unwind label %lpad67

invoke.cont86:                                    ; preds = %invoke.cont84
  br label %for.inc89

for.inc89:                                        ; preds = %invoke.cont86
  %38 = load i32* %i, align 4
  %inc90 = add i32 %38, 1
  store i32 %inc90, i32* %i, align 4
  br label %for.cond

invoke.cont88:                                    ; preds = %lpad73
  br label %ehcleanup119

for.end91:                                        ; preds = %invoke.cont68
  %call93 = invoke %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* @_ZSt4cout, i8* getelementptr inbounds ([31 x i8]* @.str9, i32 0, i32 0))
          to label %invoke.cont92 unwind label %lpad67

invoke.cont92:                                    ; preds = %for.end91
  %call95 = invoke %"class.boost::array.0"* @_ZN5boost5arrayINS0_ISsLj4EEELj2EEixEj(%"class.boost::array"* %seasons_i18n, i32 0)
          to label %invoke.cont94 unwind label %lpad67

invoke.cont94:                                    ; preds = %invoke.cont92
  %call97 = invoke %"class.std::basic_string"* @_ZN5boost5arrayISsLj4EEixEj(%"class.boost::array.0"* %call95, i32 0)
          to label %invoke.cont96 unwind label %lpad67

invoke.cont96:                                    ; preds = %invoke.cont94
  %call99 = invoke %"class.std::basic_ostream"* @_ZStlsIcSt11char_traitsIcESaIcEERSt13basic_ostreamIT_T0_ES7_RKSbIS4_S5_T1_E(%"class.std::basic_ostream"* %call93, %"class.std::basic_string"* %call97)
          to label %invoke.cont98 unwind label %lpad67

invoke.cont98:                                    ; preds = %invoke.cont96
  %call101 = invoke %"class.std::basic_ostream"* @_ZNSolsEPFRSoS_E(%"class.std::basic_ostream"* %call99, %"class.std::basic_ostream"* (%"class.std::basic_ostream"*)* @_ZSt4endlIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_)
          to label %invoke.cont100 unwind label %lpad67

invoke.cont100:                                   ; preds = %invoke.cont98
  %call103 = invoke %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* @_ZSt4cout, i8* getelementptr inbounds ([29 x i8]* @.str10, i32 0, i32 0))
          to label %invoke.cont102 unwind label %lpad67

invoke.cont102:                                   ; preds = %invoke.cont100
  %call105 = invoke i32 @_ZN5boost5arrayINS0_ISsLj4EEELj2EE4sizeEv()
          to label %invoke.cont104 unwind label %lpad67

invoke.cont104:                                   ; preds = %invoke.cont102
  %sub = sub i32 %call105, 1
  %call107 = invoke %"class.boost::array.0"* @_ZN5boost5arrayINS0_ISsLj4EEELj2EEixEj(%"class.boost::array"* %seasons_i18n, i32 %sub)
          to label %invoke.cont106 unwind label %lpad67

invoke.cont106:                                   ; preds = %invoke.cont104
  %call109 = invoke %"class.boost::array.0"* @_ZN5boost5arrayINS0_ISsLj4EEELj2EEixEj(%"class.boost::array"* %seasons_i18n, i32 0)
          to label %invoke.cont108 unwind label %lpad67

invoke.cont108:                                   ; preds = %invoke.cont106
  %call111 = invoke i32 @_ZN5boost5arrayISsLj4EE4sizeEv()
          to label %invoke.cont110 unwind label %lpad67

invoke.cont110:                                   ; preds = %invoke.cont108
  %sub112 = sub i32 %call111, 1
  %call114 = invoke %"class.std::basic_string"* @_ZN5boost5arrayISsLj4EEixEj(%"class.boost::array.0"* %call107, i32 %sub112)
          to label %invoke.cont113 unwind label %lpad67

invoke.cont113:                                   ; preds = %invoke.cont110
  %call116 = invoke %"class.std::basic_ostream"* @_ZStlsIcSt11char_traitsIcESaIcEERSt13basic_ostreamIT_T0_ES7_RKSbIS4_S5_T1_E(%"class.std::basic_ostream"* %call103, %"class.std::basic_string"* %call114)
          to label %invoke.cont115 unwind label %lpad67

invoke.cont115:                                   ; preds = %invoke.cont113
  %call118 = invoke %"class.std::basic_ostream"* @_ZNSolsEPFRSoS_E(%"class.std::basic_ostream"* %call116, %"class.std::basic_ostream"* (%"class.std::basic_ostream"*)* @_ZSt4endlIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_)
          to label %invoke.cont117 unwind label %lpad67

invoke.cont117:                                   ; preds = %invoke.cont115
  store i32 0, i32* %retval
  store i32 1, i32* %cleanup.dest.slot
  call void @_ZN5boost5arrayINS0_ISsLj4EEELj2EED1Ev(%"class.boost::array"* %seasons_i18n)
  %39 = load i32* %retval
  ret i32 %39

ehcleanup119:                                     ; preds = %invoke.cont88, %lpad67
  invoke void @_ZN5boost5arrayINS0_ISsLj4EEELj2EED1Ev(%"class.boost::array"* %seasons_i18n)
          to label %invoke.cont120 unwind label %terminate.lpad

invoke.cont120:                                   ; preds = %ehcleanup119
  br label %eh.resume

eh.resume:                                        ; preds = %invoke.cont120, %cleanup.done66
  %exn = load i8** %exn.slot
  %sel = load i32* %ehselector.slot
  %lpad.val = insertvalue { i8*, i32 } undef, i8* %exn, 0
  %lpad.val121 = insertvalue { i8*, i32 } %lpad.val, i32 %sel, 1
  resume { i8*, i32 } %lpad.val121

terminate.lpad:                                   ; preds = %ehcleanup119, %lpad73, %arraydestroy.body60, %arraydestroy.body49, %arraydestroy.body
  %40 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          catch i8* null
  call void @_ZSt9terminatev() noreturn nounwind
  unreachable
}

declare void @_ZNSsC1EPKcRKSaIcE(%"class.std::basic_string"*, i8*, %"class.std::allocator"*)

declare void @_ZNSaIcEC1Ev(%"class.std::allocator"*) nounwind

declare i32 @__gxx_personality_v0(...)

declare void @_ZNSaIcED1Ev(%"class.std::allocator"*) nounwind

declare void @_ZNSsD1Ev(%"class.std::basic_string"*)

declare void @_ZSt9terminatev()

define linkonce_odr void @_ZN5boost5arrayISsLj4EED1Ev(%"class.boost::array.0"* %this) unnamed_addr inlinehint align 2 {
entry:
  %this.addr = alloca %"class.boost::array.0"*, align 4
  store %"class.boost::array.0"* %this, %"class.boost::array.0"** %this.addr, align 4
  %this1 = load %"class.boost::array.0"** %this.addr
  call void @_ZN5boost5arrayISsLj4EED2Ev(%"class.boost::array.0"* %this1)
  ret void
}

define linkonce_odr i32 @_ZN5boost5arrayINS0_ISsLj4EEELj2EE4sizeEv() nounwind align 2 {
entry:
  ret i32 2
}

define linkonce_odr void @_ZN5boost5arrayISsLj4EEC1ERKS1_(%"class.boost::array.0"* %this, %"class.boost::array.0"*) unnamed_addr inlinehint align 2 {
entry:
  %this.addr = alloca %"class.boost::array.0"*, align 4
  %.addr = alloca %"class.boost::array.0"*, align 4
  store %"class.boost::array.0"* %this, %"class.boost::array.0"** %this.addr, align 4
  store %"class.boost::array.0"* %0, %"class.boost::array.0"** %.addr, align 4
  %this1 = load %"class.boost::array.0"** %this.addr
  %1 = load %"class.boost::array.0"** %.addr
  call void @_ZN5boost5arrayISsLj4EEC2ERKS1_(%"class.boost::array.0"* %this1, %"class.boost::array.0"* %1)
  ret void
}

define linkonce_odr %"class.boost::array.0"* @_ZN5boost5arrayINS0_ISsLj4EEELj2EEixEj(%"class.boost::array"* %this, i32 %i) align 2 {
entry:
  %this.addr = alloca %"class.boost::array"*, align 4
  %i.addr = alloca i32, align 4
  store %"class.boost::array"* %this, %"class.boost::array"** %this.addr, align 4
  store i32 %i, i32* %i.addr, align 4
  %this1 = load %"class.boost::array"** %this.addr
  %0 = load i32* %i.addr, align 4
  %cmp = icmp ult i32 %0, 2
  br i1 %cmp, label %cond.true, label %cond.false

cond.true:                                        ; preds = %entry
  br label %cond.end

cond.false:                                       ; preds = %entry
  call void @_ZN5boost9assertion6detail20assertion_failed_msgEPKcS3_S3_S3_l(i8* getelementptr inbounds ([6 x i8]* @.str11, i32 0, i32 0), i8* getelementptr inbounds ([13 x i8]* @.str12, i32 0, i32 0), i8* getelementptr inbounds ([145 x i8]* @__PRETTY_FUNCTION__._ZN5boost5arrayINS0_ISsLj4EEELj2EEixEj, i32 0, i32 0), i8* getelementptr inbounds ([42 x i8]* @.str13, i32 0, i32 0), i32 123)
  br label %cond.end

cond.end:                                         ; preds = %cond.false, %cond.true
  %1 = load i32* %i.addr, align 4
  %elems = getelementptr inbounds %"class.boost::array"* %this1, i32 0, i32 0
  %arrayidx = getelementptr inbounds [2 x %"class.boost::array.0"]* %elems, i32 0, i32 %1
  ret %"class.boost::array.0"* %arrayidx
}

define linkonce_odr i32 @_ZN5boost5arrayISsLj4EE4sizeEv() nounwind align 2 {
entry:
  ret i32 4
}

declare %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"*, i8*)

declare %"class.std::basic_ostream"* @_ZStlsIcSt11char_traitsIcESaIcEERSt13basic_ostreamIT_T0_ES7_RKSbIS4_S5_T1_E(%"class.std::basic_ostream"*, %"class.std::basic_string"*)

define linkonce_odr %"class.std::basic_string"* @_ZN5boost5arrayISsLj4EEixEj(%"class.boost::array.0"* %this, i32 %i) align 2 {
entry:
  %this.addr = alloca %"class.boost::array.0"*, align 4
  %i.addr = alloca i32, align 4
  store %"class.boost::array.0"* %this, %"class.boost::array.0"** %this.addr, align 4
  store i32 %i, i32* %i.addr, align 4
  %this1 = load %"class.boost::array.0"** %this.addr
  %0 = load i32* %i.addr, align 4
  %cmp = icmp ult i32 %0, 4
  br i1 %cmp, label %cond.true, label %cond.false

cond.true:                                        ; preds = %entry
  br label %cond.end

cond.false:                                       ; preds = %entry
  call void @_ZN5boost9assertion6detail20assertion_failed_msgEPKcS3_S3_S3_l(i8* getelementptr inbounds ([6 x i8]* @.str11, i32 0, i32 0), i8* getelementptr inbounds ([13 x i8]* @.str12, i32 0, i32 0), i8* getelementptr inbounds ([111 x i8]* @__PRETTY_FUNCTION__._ZN5boost5arrayISsLj4EEixEj, i32 0, i32 0), i8* getelementptr inbounds ([42 x i8]* @.str13, i32 0, i32 0), i32 123)
  br label %cond.end

cond.end:                                         ; preds = %cond.false, %cond.true
  %1 = load i32* %i.addr, align 4
  %elems = getelementptr inbounds %"class.boost::array.0"* %this1, i32 0, i32 0
  %arrayidx = getelementptr inbounds [4 x %"class.std::basic_string"]* %elems, i32 0, i32 %1
  ret %"class.std::basic_string"* %arrayidx
}

declare %"class.std::basic_ostream"* @_ZNSolsEPFRSoS_E(%"class.std::basic_ostream"*, %"class.std::basic_ostream"* (%"class.std::basic_ostream"*)*)

declare %"class.std::basic_ostream"* @_ZSt4endlIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_(%"class.std::basic_ostream"*)

define linkonce_odr void @_ZN5boost5arrayINS0_ISsLj4EEELj2EED1Ev(%"class.boost::array"* %this) unnamed_addr inlinehint align 2 {
entry:
  %this.addr = alloca %"class.boost::array"*, align 4
  store %"class.boost::array"* %this, %"class.boost::array"** %this.addr, align 4
  %this1 = load %"class.boost::array"** %this.addr
  call void @_ZN5boost5arrayINS0_ISsLj4EEELj2EED2Ev(%"class.boost::array"* %this1)
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
  %call = call %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* @_ZSt4cerr, i8* getelementptr inbounds ([43 x i8]* @.str14, i32 0, i32 0))
  %0 = load i8** %expr.addr, align 4
  %call1 = call %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* %call, i8* %0)
  %call2 = call %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* %call1, i8* getelementptr inbounds ([13 x i8]* @.str15, i32 0, i32 0))
  %1 = load i8** %function.addr, align 4
  %call3 = call %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* %call2, i8* %1)
  %call4 = call %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* %call3, i8* getelementptr inbounds ([3 x i8]* @.str16, i32 0, i32 0))
  %2 = load i8** %file.addr, align 4
  %call5 = call %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* %call4, i8* %2)
  %call6 = call %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_c(%"class.std::basic_ostream"* %call5, i8 signext 40)
  %3 = load i32* %line.addr, align 4
  %call7 = call %"class.std::basic_ostream"* @_ZNSolsEl(%"class.std::basic_ostream"* %call6, i32 %3)
  %call8 = call %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* %call7, i8* getelementptr inbounds ([4 x i8]* @.str17, i32 0, i32 0))
  %4 = load i8** %msg.addr, align 4
  %call9 = call %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* %call8, i8* %4)
  %call10 = call %"class.std::basic_ostream"* @_ZNSolsEPFRSoS_E(%"class.std::basic_ostream"* %call9, %"class.std::basic_ostream"* (%"class.std::basic_ostream"*)* @_ZSt4endlIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_)
  call void @abort() noreturn nounwind
  unreachable

return:                                           ; No predecessors!
  ret void
}

declare %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_c(%"class.std::basic_ostream"*, i8 signext)

declare %"class.std::basic_ostream"* @_ZNSolsEl(%"class.std::basic_ostream"*, i32)

declare void @abort() noreturn nounwind

define linkonce_odr void @_ZN5boost5arrayINS0_ISsLj4EEELj2EED2Ev(%"class.boost::array"* %this) unnamed_addr inlinehint align 2 {
entry:
  %this.addr = alloca %"class.boost::array"*, align 4
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  store %"class.boost::array"* %this, %"class.boost::array"** %this.addr, align 4
  %this1 = load %"class.boost::array"** %this.addr
  %elems = getelementptr inbounds %"class.boost::array"* %this1, i32 0, i32 0
  %array.begin = getelementptr inbounds [2 x %"class.boost::array.0"]* %elems, i32 0, i32 0
  %0 = getelementptr inbounds %"class.boost::array.0"* %array.begin, i32 2
  br label %arraydestroy.body

arraydestroy.body:                                ; preds = %invoke.cont, %entry
  %arraydestroy.elementPast = phi %"class.boost::array.0"* [ %0, %entry ], [ %arraydestroy.element, %invoke.cont ]
  %arraydestroy.element = getelementptr inbounds %"class.boost::array.0"* %arraydestroy.elementPast, i32 -1
  invoke void @_ZN5boost5arrayISsLj4EED1Ev(%"class.boost::array.0"* %arraydestroy.element)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %arraydestroy.body
  %arraydestroy.done7 = icmp eq %"class.boost::array.0"* %arraydestroy.element, %array.begin
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
  %arraydestroy.isempty = icmp eq %"class.boost::array.0"* %array.begin, %arraydestroy.element
  br i1 %arraydestroy.isempty, label %arraydestroy.done6, label %arraydestroy.body2

arraydestroy.body2:                               ; preds = %invoke.cont5, %lpad
  %arraydestroy.elementPast3 = phi %"class.boost::array.0"* [ %arraydestroy.element, %lpad ], [ %arraydestroy.element4, %invoke.cont5 ]
  %arraydestroy.element4 = getelementptr inbounds %"class.boost::array.0"* %arraydestroy.elementPast3, i32 -1
  invoke void @_ZN5boost5arrayISsLj4EED1Ev(%"class.boost::array.0"* %arraydestroy.element4)
          to label %invoke.cont5 unwind label %terminate.lpad

invoke.cont5:                                     ; preds = %arraydestroy.body2
  %arraydestroy.done = icmp eq %"class.boost::array.0"* %arraydestroy.element4, %array.begin
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

define linkonce_odr void @_ZN5boost5arrayISsLj4EEC2ERKS1_(%"class.boost::array.0"* %this, %"class.boost::array.0"*) unnamed_addr inlinehint align 2 {
entry:
  %this.addr = alloca %"class.boost::array.0"*, align 4
  %.addr = alloca %"class.boost::array.0"*, align 4
  %object.index = alloca i32
  %__i0 = alloca i32, align 4
  store %"class.boost::array.0"* %this, %"class.boost::array.0"** %this.addr, align 4
  store %"class.boost::array.0"* %0, %"class.boost::array.0"** %.addr, align 4
  %this1 = load %"class.boost::array.0"** %this.addr
  %elems = getelementptr inbounds %"class.boost::array.0"* %this1, i32 0, i32 0
  %1 = bitcast [4 x %"class.std::basic_string"]* %elems to %"class.std::basic_string"*
  store i32 0, i32* %object.index
  store i32 0, i32* %__i0
  br label %for.cond

for.cond:                                         ; preds = %for.inc, %entry
  %2 = load i32* %__i0
  %isless = icmp ult i32 %2, 4
  br i1 %isless, label %for.body, label %for.end

for.body:                                         ; preds = %for.cond
  %3 = load i32* %object.index
  %destaddress = getelementptr inbounds %"class.std::basic_string"* %1, i32 %3
  %inc = add i32 %3, 1
  store i32 %inc, i32* %object.index
  %4 = load i32* %__i0, align 4
  %5 = load %"class.boost::array.0"** %.addr, align 4
  %elems2 = getelementptr inbounds %"class.boost::array.0"* %5, i32 0, i32 0
  %arrayidx = getelementptr inbounds [4 x %"class.std::basic_string"]* %elems2, i32 0, i32 %4
  call void @_ZNSsC1ERKSs(%"class.std::basic_string"* %destaddress, %"class.std::basic_string"* %arrayidx)
  br label %for.inc

for.inc:                                          ; preds = %for.body
  %6 = load i32* %__i0
  %inc3 = add i32 %6, 1
  store i32 %inc3, i32* %__i0
  br label %for.cond

for.end:                                          ; preds = %for.cond
  ret void
}

declare void @_ZNSsC1ERKSs(%"class.std::basic_string"*, %"class.std::basic_string"*)

define linkonce_odr void @_ZN5boost5arrayISsLj4EED2Ev(%"class.boost::array.0"* %this) unnamed_addr inlinehint align 2 {
entry:
  %this.addr = alloca %"class.boost::array.0"*, align 4
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  store %"class.boost::array.0"* %this, %"class.boost::array.0"** %this.addr, align 4
  %this1 = load %"class.boost::array.0"** %this.addr
  %elems = getelementptr inbounds %"class.boost::array.0"* %this1, i32 0, i32 0
  %array.begin = getelementptr inbounds [4 x %"class.std::basic_string"]* %elems, i32 0, i32 0
  %0 = getelementptr inbounds %"class.std::basic_string"* %array.begin, i32 4
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

define internal void @_GLOBAL__I_a() section ".text.startup" {
entry:
  call void @__cxx_global_var_init()
  ret void
}
