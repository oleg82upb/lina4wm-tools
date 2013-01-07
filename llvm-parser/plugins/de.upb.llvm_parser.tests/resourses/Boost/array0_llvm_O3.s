; ModuleID = 'array0.cpp'
target datalayout = "e-p:32:32:32-i1:8:8-i8:8:8-i16:16:16-i32:32:32-i64:32:64-f32:32:32-f64:32:64-v64:64:64-v128:128:128-a0:0:64-f80:32:32-n8:16:32-S128"
target triple = "i386-pc-linux-gnu"

%"class.std::ios_base::Init" = type { i8 }
%"class.std::basic_string" = type { %"struct.std::basic_string<char, std::char_traits<char>, std::allocator<char> >::_Alloc_hider" }
%"struct.std::basic_string<char, std::char_traits<char>, std::allocator<char> >::_Alloc_hider" = type { i8* }
%"class.std::allocator" = type { i8 }
%"class.std::out_of_range" = type { %"class.std::logic_error" }
%"class.std::logic_error" = type { %"class.std::exception", %"class.std::basic_string" }
%"class.std::exception" = type { i32 (...)** }
%"struct.std::basic_string<char, std::char_traits<char>, std::allocator<char> >::_Rep" = type { %"struct.std::basic_string<char, std::char_traits<char>, std::allocator<char> >::_Rep_base" }
%"struct.std::basic_string<char, std::char_traits<char>, std::allocator<char> >::_Rep_base" = type { i32, i32, i32 }
%"struct.boost::exception_detail::error_info_injector" = type { %"class.std::out_of_range", %"class.boost::exception" }
%"class.boost::exception" = type { i32 (...)**, %"class.boost::exception_detail::refcount_ptr", i8*, i8*, i32 }
%"class.boost::exception_detail::refcount_ptr" = type { %"struct.boost::exception_detail::error_info_container"* }
%"struct.boost::exception_detail::error_info_container" = type { i32 (...)** }
%"class.boost::exception_detail::clone_impl" = type { %"struct.boost::exception_detail::error_info_injector", %"class.boost::exception_detail::clone_base" }
%"class.boost::exception_detail::clone_base" = type { i32 (...)** }

@_ZStL8__ioinit = internal global %"class.std::ios_base::Init" zeroinitializer, align 1
@__dso_handle = external global i8
@_ZN12_GLOBAL__N_112failed_testsE = internal unnamed_addr global i32 0, align 4
@_ZTVN10__cxxabiv120__si_class_type_infoE = external global i8*
@_ZTSSt12out_of_range = available_externally constant [17 x i8] c"St12out_of_range\00"
@_ZTSSt11logic_error = available_externally constant [16 x i8] c"St11logic_error\00"
@_ZTVN10__cxxabiv117__class_type_infoE = external global i8*
@_ZTSSt9exception = available_externally constant [13 x i8] c"St9exception\00"
@_ZTISt9exception = available_externally unnamed_addr constant { i8*, i8* } { i8* bitcast (i8** getelementptr inbounds (i8** @_ZTVN10__cxxabiv117__class_type_infoE, i32 2) to i8*), i8* getelementptr inbounds ([13 x i8]* @_ZTSSt9exception, i32 0, i32 0) }
@_ZTISt11logic_error = available_externally unnamed_addr constant { i8*, i8*, i8* } { i8* bitcast (i8** getelementptr inbounds (i8** @_ZTVN10__cxxabiv120__si_class_type_infoE, i32 2) to i8*), i8* getelementptr inbounds ([16 x i8]* @_ZTSSt11logic_error, i32 0, i32 0), i8* bitcast ({ i8*, i8* }* @_ZTISt9exception to i8*) }
@_ZTISt12out_of_range = available_externally unnamed_addr constant { i8*, i8*, i8* } { i8* bitcast (i8** getelementptr inbounds (i8** @_ZTVN10__cxxabiv120__si_class_type_infoE, i32 2) to i8*), i8* getelementptr inbounds ([17 x i8]* @_ZTSSt12out_of_range, i32 0, i32 0), i8* bitcast ({ i8*, i8*, i8* }* @_ZTISt11logic_error to i8*) }
@.str2 = private unnamed_addr constant [44 x i8] c"attempt to access element of an empty array\00", align 1
@_ZTVN10__cxxabiv121__vmi_class_type_infoE = external global i8*
@_ZTSN5boost16exception_detail10clone_implINS0_19error_info_injectorISt12out_of_rangeEEEE = linkonce_odr constant [85 x i8] c"N5boost16exception_detail10clone_implINS0_19error_info_injectorISt12out_of_rangeEEEE\00"
@_ZTSN5boost16exception_detail19error_info_injectorISt12out_of_rangeEE = linkonce_odr constant [66 x i8] c"N5boost16exception_detail19error_info_injectorISt12out_of_rangeEE\00"
@_ZTSN5boost9exceptionE = linkonce_odr constant [19 x i8] c"N5boost9exceptionE\00"
@_ZTIN5boost9exceptionE = linkonce_odr unnamed_addr constant { i8*, i8* } { i8* bitcast (i8** getelementptr inbounds (i8** @_ZTVN10__cxxabiv117__class_type_infoE, i32 2) to i8*), i8* getelementptr inbounds ([19 x i8]* @_ZTSN5boost9exceptionE, i32 0, i32 0) }
@_ZTIN5boost16exception_detail19error_info_injectorISt12out_of_rangeEE = linkonce_odr unnamed_addr constant { i8*, i8*, i32, i32, i8*, i32, i8*, i32 } { i8* bitcast (i8** getelementptr inbounds (i8** @_ZTVN10__cxxabiv121__vmi_class_type_infoE, i32 2) to i8*), i8* getelementptr inbounds ([66 x i8]* @_ZTSN5boost16exception_detail19error_info_injectorISt12out_of_rangeEE, i32 0, i32 0), i32 0, i32 2, i8* bitcast ({ i8*, i8*, i8* }* @_ZTISt12out_of_range to i8*), i32 2, i8* bitcast ({ i8*, i8* }* @_ZTIN5boost9exceptionE to i8*), i32 2050 }
@_ZTSN5boost16exception_detail10clone_baseE = linkonce_odr constant [39 x i8] c"N5boost16exception_detail10clone_baseE\00"
@_ZTIN5boost16exception_detail10clone_baseE = linkonce_odr unnamed_addr constant { i8*, i8* } { i8* bitcast (i8** getelementptr inbounds (i8** @_ZTVN10__cxxabiv117__class_type_infoE, i32 2) to i8*), i8* getelementptr inbounds ([39 x i8]* @_ZTSN5boost16exception_detail10clone_baseE, i32 0, i32 0) }
@_ZTIN5boost16exception_detail10clone_implINS0_19error_info_injectorISt12out_of_rangeEEEE = linkonce_odr unnamed_addr constant { i8*, i8*, i32, i32, i8*, i32, i8*, i32 } { i8* bitcast (i8** getelementptr inbounds (i8** @_ZTVN10__cxxabiv121__vmi_class_type_infoE, i32 2) to i8*), i8* getelementptr inbounds ([85 x i8]* @_ZTSN5boost16exception_detail10clone_implINS0_19error_info_injectorISt12out_of_rangeEEEE, i32 0, i32 0), i32 0, i32 2, i8* bitcast ({ i8*, i8*, i32, i32, i8*, i32, i8*, i32 }* @_ZTIN5boost16exception_detail19error_info_injectorISt12out_of_rangeEE to i8*), i32 2, i8* bitcast ({ i8*, i8* }* @_ZTIN5boost16exception_detail10clone_baseE to i8*), i32 -3069 }
@_ZTVN5boost9exceptionE = linkonce_odr unnamed_addr constant [4 x i8*] [i8* null, i8* bitcast ({ i8*, i8* }* @_ZTIN5boost9exceptionE to i8*), i8* bitcast (void ()* @__cxa_pure_virtual to i8*), i8* bitcast (void ()* @__cxa_pure_virtual to i8*)]
@_ZTVN5boost16exception_detail10clone_implINS0_19error_info_injectorISt12out_of_rangeEEEE = linkonce_odr unnamed_addr constant [21 x i8*] [i8* inttoptr (i32 28 to i8*), i8* null, i8* bitcast ({ i8*, i8*, i32, i32, i8*, i32, i8*, i32 }* @_ZTIN5boost16exception_detail10clone_implINS0_19error_info_injectorISt12out_of_rangeEEEE to i8*), i8* bitcast (void (%"class.boost::exception_detail::clone_impl"*)* @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorISt12out_of_rangeEEED1Ev to i8*), i8* bitcast (void (%"class.boost::exception_detail::clone_impl"*)* @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorISt12out_of_rangeEEED0Ev to i8*), i8* bitcast (i8* (%"class.std::logic_error"*)* @_ZNKSt11logic_error4whatEv to i8*), i8* bitcast (%"class.boost::exception_detail::clone_base"* (%"class.boost::exception_detail::clone_impl"*)* @_ZNK5boost16exception_detail10clone_implINS0_19error_info_injectorISt12out_of_rangeEEE5cloneEv to i8*), i8* bitcast (void (%"class.boost::exception_detail::clone_impl"*)* @_ZNK5boost16exception_detail10clone_implINS0_19error_info_injectorISt12out_of_rangeEEE7rethrowEv to i8*), i8* inttoptr (i32 -8 to i8*), i8* bitcast ({ i8*, i8*, i32, i32, i8*, i32, i8*, i32 }* @_ZTIN5boost16exception_detail10clone_implINS0_19error_info_injectorISt12out_of_rangeEEEE to i8*), i8* bitcast (void (%"class.boost::exception_detail::clone_impl"*)* @_ZThn8_N5boost16exception_detail10clone_implINS0_19error_info_injectorISt12out_of_rangeEEED1Ev to i8*), i8* bitcast (void (%"class.boost::exception_detail::clone_impl"*)* @_ZThn8_N5boost16exception_detail10clone_implINS0_19error_info_injectorISt12out_of_rangeEEED0Ev to i8*), i8* inttoptr (i32 -28 to i8*), i8* inttoptr (i32 -28 to i8*), i8* inttoptr (i32 -28 to i8*), i8* inttoptr (i32 -28 to i8*), i8* bitcast ({ i8*, i8*, i32, i32, i8*, i32, i8*, i32 }* @_ZTIN5boost16exception_detail10clone_implINS0_19error_info_injectorISt12out_of_rangeEEEE to i8*), i8* bitcast (%"class.boost::exception_detail::clone_base"* (%"class.boost::exception_detail::clone_impl"*)* @_ZTv0_n12_NK5boost16exception_detail10clone_implINS0_19error_info_injectorISt12out_of_rangeEEE5cloneEv to i8*), i8* bitcast (void (%"class.boost::exception_detail::clone_impl"*)* @_ZTv0_n16_NK5boost16exception_detail10clone_implINS0_19error_info_injectorISt12out_of_rangeEEE7rethrowEv to i8*), i8* bitcast (void (%"class.boost::exception_detail::clone_impl"*)* @_ZTv0_n20_N5boost16exception_detail10clone_implINS0_19error_info_injectorISt12out_of_rangeEEED1Ev to i8*), i8* bitcast (void (%"class.boost::exception_detail::clone_impl"*)* @_ZTv0_n20_N5boost16exception_detail10clone_implINS0_19error_info_injectorISt12out_of_rangeEEED0Ev to i8*)]
@_ZTVN5boost16exception_detail19error_info_injectorISt12out_of_rangeEE = linkonce_odr unnamed_addr constant [9 x i8*] [i8* null, i8* bitcast ({ i8*, i8*, i32, i32, i8*, i32, i8*, i32 }* @_ZTIN5boost16exception_detail19error_info_injectorISt12out_of_rangeEE to i8*), i8* bitcast (void (%"struct.boost::exception_detail::error_info_injector"*)* @_ZN5boost16exception_detail19error_info_injectorISt12out_of_rangeED1Ev to i8*), i8* bitcast (void (%"struct.boost::exception_detail::error_info_injector"*)* @_ZN5boost16exception_detail19error_info_injectorISt12out_of_rangeED0Ev to i8*), i8* bitcast (i8* (%"class.std::logic_error"*)* @_ZNKSt11logic_error4whatEv to i8*), i8* inttoptr (i32 -8 to i8*), i8* bitcast ({ i8*, i8*, i32, i32, i8*, i32, i8*, i32 }* @_ZTIN5boost16exception_detail19error_info_injectorISt12out_of_rangeEE to i8*), i8* bitcast (void (%"struct.boost::exception_detail::error_info_injector"*)* @_ZThn8_N5boost16exception_detail19error_info_injectorISt12out_of_rangeED1Ev to i8*), i8* bitcast (void (%"struct.boost::exception_detail::error_info_injector"*)* @_ZThn8_N5boost16exception_detail19error_info_injectorISt12out_of_rangeED0Ev to i8*)]
@_ZTVSt12out_of_range = available_externally unnamed_addr constant [5 x i8*] [i8* null, i8* bitcast ({ i8*, i8*, i8* }* @_ZTISt12out_of_range to i8*), i8* bitcast (void (%"class.std::out_of_range"*)* @_ZNSt12out_of_rangeD1Ev to i8*), i8* bitcast (void (%"class.std::out_of_range"*)* @_ZNSt12out_of_rangeD0Ev to i8*), i8* bitcast (i8* (%"class.std::logic_error"*)* @_ZNKSt11logic_error4whatEv to i8*)]
@_ZTVSt11logic_error = available_externally unnamed_addr constant [5 x i8*] [i8* null, i8* bitcast ({ i8*, i8*, i8* }* @_ZTISt11logic_error to i8*), i8* bitcast (void (%"class.std::logic_error"*)* @_ZNSt11logic_errorD1Ev to i8*), i8* bitcast (void (%"class.std::logic_error"*)* @_ZNSt11logic_errorD0Ev to i8*), i8* bitcast (i8* (%"class.std::logic_error"*)* @_ZNKSt11logic_error4whatEv to i8*)]
@_ZTVN5boost16exception_detail10clone_baseE = linkonce_odr unnamed_addr constant [6 x i8*] [i8* null, i8* bitcast ({ i8*, i8* }* @_ZTIN5boost16exception_detail10clone_baseE to i8*), i8* bitcast (void ()* @__cxa_pure_virtual to i8*), i8* bitcast (void ()* @__cxa_pure_virtual to i8*), i8* bitcast (void (%"class.boost::exception_detail::clone_base"*)* @_ZN5boost16exception_detail10clone_baseD1Ev to i8*), i8* bitcast (void (%"class.boost::exception_detail::clone_base"*)* @_ZN5boost16exception_detail10clone_baseD0Ev to i8*)]
@_ZNSs4_Rep20_S_empty_rep_storageE = external global [0 x i32]
@llvm.global_ctors = appending global [1 x { i32, void ()* }] [{ i32, void ()* } { i32 65535, void ()* @_GLOBAL__I_a }]

declare void @_ZNSt8ios_base4InitC1Ev(%"class.std::ios_base::Init"*)

declare void @_ZNSt8ios_base4InitD1Ev(%"class.std::ios_base::Init"*)

declare i32 @__cxa_atexit(void (i8*)*, i8*, i8*) nounwind

define i32 @main() {
entry:
  %call.i84.i = invoke i8* @_ZN5boost5arrayIbLj0EE17failed_rangecheckEv()
          to label %call.i.noexc83.i unwind label %lpad.i

call.i.noexc83.i:                                 ; preds = %entry
  unreachable

lpad.i:                                           ; preds = %entry
  %0 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          catch i8* bitcast ({ i8*, i8*, i8* }* @_ZTISt12out_of_range to i8*)
  %1 = extractvalue { i8*, i32 } %0, 0
  %2 = extractvalue { i8*, i32 } %0, 1
  %3 = tail call i32 @llvm.eh.typeid.for(i8* bitcast ({ i8*, i8*, i8* }* @_ZTISt12out_of_range to i8*)) nounwind
  %matches.i = icmp eq i32 %2, %3
  br i1 %matches.i, label %try.cont.i, label %eh.resume.i

try.cont.i:                                       ; preds = %lpad.i
  %4 = tail call i8* @__cxa_begin_catch(i8* %1) nounwind
  tail call void @__cxa_end_catch()
  %call.i82.i = invoke i8* @_ZN5boost5arrayIbLj0EE17failed_rangecheckEv()
          to label %call.i.noexc.i unwind label %lpad64.i

call.i.noexc.i:                                   ; preds = %try.cont.i
  unreachable

lpad64.i:                                         ; preds = %try.cont.i
  %5 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          catch i8* bitcast ({ i8*, i8*, i8* }* @_ZTISt12out_of_range to i8*)
  %6 = extractvalue { i8*, i32 } %5, 0
  %7 = extractvalue { i8*, i32 } %5, 1
  %matches70.i = icmp eq i32 %7, %2
  br i1 %matches70.i, label %_ZN12_GLOBAL__N_18RunTestsIbEEvv.exit, label %eh.resume.i

eh.resume.i:                                      ; preds = %lpad64.i, %lpad.i
  %ehselector.slot.0.i = phi i32 [ %7, %lpad64.i ], [ %2, %lpad.i ]
  %exn.slot.0.i = phi i8* [ %6, %lpad64.i ], [ %1, %lpad.i ]
  %lpad.val.i = insertvalue { i8*, i32 } undef, i8* %exn.slot.0.i, 0
  %lpad.val77.i = insertvalue { i8*, i32 } %lpad.val.i, i32 %ehselector.slot.0.i, 1
  resume { i8*, i32 } %lpad.val77.i

_ZN12_GLOBAL__N_18RunTestsIbEEvv.exit:            ; preds = %lpad64.i
  %8 = tail call i8* @__cxa_begin_catch(i8* %6) nounwind
  tail call void @__cxa_end_catch()
  %call.i84.i1 = invoke i8** @_ZN5boost5arrayIPvLj0EE17failed_rangecheckEv()
          to label %call.i.noexc83.i2 unwind label %lpad.i4

call.i.noexc83.i2:                                ; preds = %_ZN12_GLOBAL__N_18RunTestsIbEEvv.exit
  unreachable

lpad.i4:                                          ; preds = %_ZN12_GLOBAL__N_18RunTestsIbEEvv.exit
  %9 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          catch i8* bitcast ({ i8*, i8*, i8* }* @_ZTISt12out_of_range to i8*)
  %10 = extractvalue { i8*, i32 } %9, 0
  %11 = extractvalue { i8*, i32 } %9, 1
  %matches.i3 = icmp eq i32 %11, %2
  br i1 %matches.i3, label %try.cont.i6, label %eh.resume.i14

try.cont.i6:                                      ; preds = %lpad.i4
  %12 = tail call i8* @__cxa_begin_catch(i8* %10) nounwind
  tail call void @__cxa_end_catch()
  %call.i82.i5 = invoke i8** @_ZN5boost5arrayIPvLj0EE17failed_rangecheckEv()
          to label %call.i.noexc.i7 unwind label %lpad64.i9

call.i.noexc.i7:                                  ; preds = %try.cont.i6
  unreachable

lpad64.i9:                                        ; preds = %try.cont.i6
  %13 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          catch i8* bitcast ({ i8*, i8*, i8* }* @_ZTISt12out_of_range to i8*)
  %14 = extractvalue { i8*, i32 } %13, 0
  %15 = extractvalue { i8*, i32 } %13, 1
  %matches70.i8 = icmp eq i32 %15, %2
  br i1 %matches70.i8, label %_ZN12_GLOBAL__N_18RunTestsIPvEEvv.exit, label %eh.resume.i14

eh.resume.i14:                                    ; preds = %lpad64.i9, %lpad.i4
  %ehselector.slot.0.i10 = phi i32 [ %15, %lpad64.i9 ], [ %11, %lpad.i4 ]
  %exn.slot.0.i11 = phi i8* [ %14, %lpad64.i9 ], [ %10, %lpad.i4 ]
  %lpad.val.i12 = insertvalue { i8*, i32 } undef, i8* %exn.slot.0.i11, 0
  %lpad.val77.i13 = insertvalue { i8*, i32 } %lpad.val.i12, i32 %ehselector.slot.0.i10, 1
  resume { i8*, i32 } %lpad.val77.i13

_ZN12_GLOBAL__N_18RunTestsIPvEEvv.exit:           ; preds = %lpad64.i9
  %16 = tail call i8* @__cxa_begin_catch(i8* %14) nounwind
  tail call void @__cxa_end_catch()
  %call.i84.i15 = invoke x86_fp80* @_ZN5boost5arrayIeLj0EE17failed_rangecheckEv()
          to label %call.i.noexc83.i16 unwind label %lpad.i18

call.i.noexc83.i16:                               ; preds = %_ZN12_GLOBAL__N_18RunTestsIPvEEvv.exit
  unreachable

lpad.i18:                                         ; preds = %_ZN12_GLOBAL__N_18RunTestsIPvEEvv.exit
  %17 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          catch i8* bitcast ({ i8*, i8*, i8* }* @_ZTISt12out_of_range to i8*)
  %18 = extractvalue { i8*, i32 } %17, 0
  %19 = extractvalue { i8*, i32 } %17, 1
  %matches.i17 = icmp eq i32 %19, %2
  br i1 %matches.i17, label %try.cont.i20, label %eh.resume.i28

try.cont.i20:                                     ; preds = %lpad.i18
  %20 = tail call i8* @__cxa_begin_catch(i8* %18) nounwind
  tail call void @__cxa_end_catch()
  %call.i82.i19 = invoke x86_fp80* @_ZN5boost5arrayIeLj0EE17failed_rangecheckEv()
          to label %call.i.noexc.i21 unwind label %lpad64.i23

call.i.noexc.i21:                                 ; preds = %try.cont.i20
  unreachable

lpad64.i23:                                       ; preds = %try.cont.i20
  %21 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          catch i8* bitcast ({ i8*, i8*, i8* }* @_ZTISt12out_of_range to i8*)
  %22 = extractvalue { i8*, i32 } %21, 0
  %23 = extractvalue { i8*, i32 } %21, 1
  %matches70.i22 = icmp eq i32 %23, %2
  br i1 %matches70.i22, label %_ZN12_GLOBAL__N_18RunTestsIeEEvv.exit, label %eh.resume.i28

eh.resume.i28:                                    ; preds = %lpad64.i23, %lpad.i18
  %ehselector.slot.0.i24 = phi i32 [ %23, %lpad64.i23 ], [ %19, %lpad.i18 ]
  %exn.slot.0.i25 = phi i8* [ %22, %lpad64.i23 ], [ %18, %lpad.i18 ]
  %lpad.val.i26 = insertvalue { i8*, i32 } undef, i8* %exn.slot.0.i25, 0
  %lpad.val77.i27 = insertvalue { i8*, i32 } %lpad.val.i26, i32 %ehselector.slot.0.i24, 1
  resume { i8*, i32 } %lpad.val77.i27

_ZN12_GLOBAL__N_18RunTestsIeEEvv.exit:            ; preds = %lpad64.i23
  %24 = tail call i8* @__cxa_begin_catch(i8* %22) nounwind
  tail call void @__cxa_end_catch()
  %call.i88.i = invoke %"class.std::basic_string"* @_ZN5boost5arrayISsLj0EE17failed_rangecheckEv()
          to label %call.i.noexc87.i unwind label %lpad63.i

call.i.noexc87.i:                                 ; preds = %_ZN12_GLOBAL__N_18RunTestsIeEEvv.exit
  unreachable

lpad63.i:                                         ; preds = %_ZN12_GLOBAL__N_18RunTestsIeEEvv.exit
  %25 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          catch i8* bitcast ({ i8*, i8*, i8* }* @_ZTISt12out_of_range to i8*)
  %26 = extractvalue { i8*, i32 } %25, 0
  %27 = extractvalue { i8*, i32 } %25, 1
  %matches.i29 = icmp eq i32 %27, %2
  br i1 %matches.i29, label %try.cont.i30, label %eh.resume.i35

try.cont.i30:                                     ; preds = %lpad63.i
  %28 = tail call i8* @__cxa_begin_catch(i8* %26) nounwind
  tail call void @__cxa_end_catch()
  %call.i85.i = invoke %"class.std::basic_string"* @_ZN5boost5arrayISsLj0EE17failed_rangecheckEv()
          to label %call.i.noexc.i31 unwind label %lpad67.i

call.i.noexc.i31:                                 ; preds = %try.cont.i30
  unreachable

lpad67.i:                                         ; preds = %try.cont.i30
  %29 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          catch i8* bitcast ({ i8*, i8*, i8* }* @_ZTISt12out_of_range to i8*)
  %30 = extractvalue { i8*, i32 } %29, 0
  %31 = extractvalue { i8*, i32 } %29, 1
  %matches73.i = icmp eq i32 %31, %2
  br i1 %matches73.i, label %_ZN12_GLOBAL__N_18RunTestsISsEEvv.exit, label %eh.resume.i35

eh.resume.i35:                                    ; preds = %lpad67.i, %lpad63.i
  %ehselector.slot.0.i32 = phi i32 [ %31, %lpad67.i ], [ %27, %lpad63.i ]
  %exn.slot.0.i33 = phi i8* [ %30, %lpad67.i ], [ %26, %lpad63.i ]
  %lpad.val.i34 = insertvalue { i8*, i32 } undef, i8* %exn.slot.0.i33, 0
  %lpad.val80.i = insertvalue { i8*, i32 } %lpad.val.i34, i32 %ehselector.slot.0.i32, 1
  resume { i8*, i32 } %lpad.val80.i

_ZN12_GLOBAL__N_18RunTestsISsEEvv.exit:           ; preds = %lpad67.i
  %32 = tail call i8* @__cxa_begin_catch(i8* %30) nounwind
  tail call void @__cxa_end_catch()
  %33 = load i32* @_ZN12_GLOBAL__N_112failed_testsE, align 4, !tbaa !0
  ret i32 %33
}

declare i32 @__gxx_personality_v0(...)

declare void @_ZSt9terminatev()

declare i32 @llvm.eh.typeid.for(i8*) nounwind readnone

declare i8* @__cxa_begin_catch(i8*)

declare void @__cxa_end_catch()

define linkonce_odr noalias %"class.std::basic_string"* @_ZN5boost5arrayISsLj0EE17failed_rangecheckEv() noreturn align 2 {
entry:
  %ref.tmp.i.i10 = alloca %"class.std::allocator", align 1
  %ref.tmp.i.i = alloca %"class.std::allocator", align 1
  %e = alloca %"class.std::out_of_range", align 4
  %ref.tmp = alloca %"class.std::basic_string", align 4
  %ref.tmp1 = alloca %"class.std::allocator", align 1
  invoke void @_ZNSsC1EPKcRKSaIcE(%"class.std::basic_string"* %ref.tmp, i8* getelementptr inbounds ([44 x i8]* @.str2, i32 0, i32 0), %"class.std::allocator"* %ref.tmp1)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %entry
  invoke void @_ZNSt12out_of_rangeC1ERKSs(%"class.std::out_of_range"* %e, %"class.std::basic_string"* %ref.tmp)
          to label %invoke.cont3 unwind label %lpad2

invoke.cont3:                                     ; preds = %invoke.cont
  %0 = getelementptr inbounds %"class.std::allocator"* %ref.tmp.i.i10, i32 0, i32 0
  call void @llvm.lifetime.start(i64 1, i8* %0)
  %_M_p.i.i.i.i11 = getelementptr inbounds %"class.std::basic_string"* %ref.tmp, i32 0, i32 0, i32 0
  %1 = load i8** %_M_p.i.i.i.i11, align 4, !tbaa !3
  %arrayidx.i.i.i12 = getelementptr inbounds i8* %1, i32 -12
  %2 = bitcast i8* %arrayidx.i.i.i12 to %"struct.std::basic_string<char, std::char_traits<char>, std::allocator<char> >::_Rep"*
  %cmp.i.i.i13 = icmp eq i8* %arrayidx.i.i.i12, bitcast ([0 x i32]* @_ZNSs4_Rep20_S_empty_rep_storageE to i8*)
  br i1 %cmp.i.i.i13, label %invoke.cont4, label %if.then.i.i.i15, !prof !4

if.then.i.i.i15:                                  ; preds = %invoke.cont3
  %_M_refcount.i.i.i14 = getelementptr inbounds i8* %1, i32 -4
  %3 = bitcast i8* %_M_refcount.i.i.i14 to i32*
  br i1 icmp ne (i8* bitcast (i32 (i32)* @pthread_cancel to i8*), i8* null), label %if.then.i.i.i.i16, label %if.else.i.i.i.i18

if.then.i.i.i.i16:                                ; preds = %if.then.i.i.i15
  %4 = atomicrmw add i32* %3, i32 -1 seq_cst
  br label %_ZN9__gnu_cxxL27__exchange_and_add_dispatchEPii.exit.i.i.i21

if.else.i.i.i.i18:                                ; preds = %if.then.i.i.i15
  %5 = load i32* %3, align 4, !tbaa !0
  %add.i.i.i.i.i17 = add nsw i32 %5, -1
  store i32 %add.i.i.i.i.i17, i32* %3, align 4, !tbaa !0
  br label %_ZN9__gnu_cxxL27__exchange_and_add_dispatchEPii.exit.i.i.i21

_ZN9__gnu_cxxL27__exchange_and_add_dispatchEPii.exit.i.i.i21: ; preds = %if.else.i.i.i.i18, %if.then.i.i.i.i16
  %retval.0.i.i.i.i19 = phi i32 [ %4, %if.then.i.i.i.i16 ], [ %5, %if.else.i.i.i.i18 ]
  %cmp3.i.i.i20 = icmp slt i32 %retval.0.i.i.i.i19, 1
  br i1 %cmp3.i.i.i20, label %if.then4.i.i.i22, label %invoke.cont4

if.then4.i.i.i22:                                 ; preds = %_ZN9__gnu_cxxL27__exchange_and_add_dispatchEPii.exit.i.i.i21
  call void @_ZNSs4_Rep10_M_destroyERKSaIcE(%"struct.std::basic_string<char, std::char_traits<char>, std::allocator<char> >::_Rep"* %2, %"class.std::allocator"* %ref.tmp.i.i10) nounwind
  br label %invoke.cont4

invoke.cont4:                                     ; preds = %if.then4.i.i.i22, %_ZN9__gnu_cxxL27__exchange_and_add_dispatchEPii.exit.i.i.i21, %invoke.cont3
  call void @llvm.lifetime.end(i64 1, i8* %0)
  invoke void @_ZN5boost15throw_exceptionISt12out_of_rangeEEvRKT_(%"class.std::out_of_range"* %e) noreturn
          to label %invoke.cont7 unwind label %lpad6

invoke.cont7:                                     ; preds = %invoke.cont4
  unreachable

lpad:                                             ; preds = %entry
  %6 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %7 = extractvalue { i8*, i32 } %6, 0
  %8 = extractvalue { i8*, i32 } %6, 1
  br label %eh.resume

lpad2:                                            ; preds = %invoke.cont
  %9 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %10 = extractvalue { i8*, i32 } %9, 0
  %11 = extractvalue { i8*, i32 } %9, 1
  %12 = getelementptr inbounds %"class.std::allocator"* %ref.tmp.i.i, i32 0, i32 0
  call void @llvm.lifetime.start(i64 1, i8* %12)
  %_M_p.i.i.i.i = getelementptr inbounds %"class.std::basic_string"* %ref.tmp, i32 0, i32 0, i32 0
  %13 = load i8** %_M_p.i.i.i.i, align 4, !tbaa !3
  %arrayidx.i.i.i = getelementptr inbounds i8* %13, i32 -12
  %14 = bitcast i8* %arrayidx.i.i.i to %"struct.std::basic_string<char, std::char_traits<char>, std::allocator<char> >::_Rep"*
  %cmp.i.i.i = icmp eq i8* %arrayidx.i.i.i, bitcast ([0 x i32]* @_ZNSs4_Rep20_S_empty_rep_storageE to i8*)
  br i1 %cmp.i.i.i, label %eh.resume, label %if.then.i.i.i, !prof !4

if.then.i.i.i:                                    ; preds = %lpad2
  %_M_refcount.i.i.i = getelementptr inbounds i8* %13, i32 -4
  %15 = bitcast i8* %_M_refcount.i.i.i to i32*
  br i1 icmp ne (i8* bitcast (i32 (i32)* @pthread_cancel to i8*), i8* null), label %if.then.i.i.i.i, label %if.else.i.i.i.i

if.then.i.i.i.i:                                  ; preds = %if.then.i.i.i
  %16 = atomicrmw add i32* %15, i32 -1 seq_cst
  br label %_ZN9__gnu_cxxL27__exchange_and_add_dispatchEPii.exit.i.i.i

if.else.i.i.i.i:                                  ; preds = %if.then.i.i.i
  %17 = load i32* %15, align 4, !tbaa !0
  %add.i.i.i.i.i = add nsw i32 %17, -1
  store i32 %add.i.i.i.i.i, i32* %15, align 4, !tbaa !0
  br label %_ZN9__gnu_cxxL27__exchange_and_add_dispatchEPii.exit.i.i.i

_ZN9__gnu_cxxL27__exchange_and_add_dispatchEPii.exit.i.i.i: ; preds = %if.else.i.i.i.i, %if.then.i.i.i.i
  %retval.0.i.i.i.i = phi i32 [ %16, %if.then.i.i.i.i ], [ %17, %if.else.i.i.i.i ]
  %cmp3.i.i.i = icmp slt i32 %retval.0.i.i.i.i, 1
  br i1 %cmp3.i.i.i, label %if.then4.i.i.i, label %eh.resume

if.then4.i.i.i:                                   ; preds = %_ZN9__gnu_cxxL27__exchange_and_add_dispatchEPii.exit.i.i.i
  call void @_ZNSs4_Rep10_M_destroyERKSaIcE(%"struct.std::basic_string<char, std::char_traits<char>, std::allocator<char> >::_Rep"* %14, %"class.std::allocator"* %ref.tmp.i.i) nounwind
  br label %eh.resume

lpad6:                                            ; preds = %invoke.cont4
  %18 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %19 = extractvalue { i8*, i32 } %18, 0
  %20 = extractvalue { i8*, i32 } %18, 1
  call void @_ZNSt12out_of_rangeD1Ev(%"class.std::out_of_range"* %e) nounwind
  br label %eh.resume

eh.resume:                                        ; preds = %if.then4.i.i.i, %_ZN9__gnu_cxxL27__exchange_and_add_dispatchEPii.exit.i.i.i, %lpad2, %lpad, %lpad6
  %exn.slot.1 = phi i8* [ %19, %lpad6 ], [ %7, %lpad ], [ %10, %lpad2 ], [ %10, %_ZN9__gnu_cxxL27__exchange_and_add_dispatchEPii.exit.i.i.i ], [ %10, %if.then4.i.i.i ]
  %ehselector.slot.1 = phi i32 [ %20, %lpad6 ], [ %8, %lpad ], [ %11, %lpad2 ], [ %11, %_ZN9__gnu_cxxL27__exchange_and_add_dispatchEPii.exit.i.i.i ], [ %11, %if.then4.i.i.i ]
  %lpad.val = insertvalue { i8*, i32 } undef, i8* %exn.slot.1, 0
  %lpad.val9 = insertvalue { i8*, i32 } %lpad.val, i32 %ehselector.slot.1, 1
  resume { i8*, i32 } %lpad.val9
}

declare void @_ZNSt12out_of_rangeC1ERKSs(%"class.std::out_of_range"*, %"class.std::basic_string"*)

declare void @_ZNSsC1EPKcRKSaIcE(%"class.std::basic_string"*, i8*, %"class.std::allocator"*)

define linkonce_odr void @_ZN5boost15throw_exceptionISt12out_of_rangeEEvRKT_(%"class.std::out_of_range"* %e) noreturn inlinehint {
entry:
  %ref.tmp = alloca %"struct.boost::exception_detail::error_info_injector", align 4
  %exception = call i8* @__cxa_allocate_exception(i32 32) nounwind
  %0 = getelementptr inbounds %"struct.boost::exception_detail::error_info_injector"* %ref.tmp, i32 0, i32 0, i32 0, i32 0, i32 0
  store i32 (...)** bitcast (i8** getelementptr inbounds ([5 x i8*]* @_ZTVSt11logic_error, i32 0, i32 2) to i32 (...)**), i32 (...)*** %0, align 4, !tbaa !5
  %_M_msg.i.i.i.i.i = getelementptr inbounds %"struct.boost::exception_detail::error_info_injector"* %ref.tmp, i32 0, i32 0, i32 0, i32 1
  %_M_msg2.i.i.i.i.i = getelementptr inbounds %"class.std::out_of_range"* %e, i32 0, i32 0, i32 1
  invoke void @_ZNSsC1ERKSs(%"class.std::basic_string"* %_M_msg.i.i.i.i.i, %"class.std::basic_string"* %_M_msg2.i.i.i.i.i)
          to label %invoke.cont unwind label %ehcleanup.thread

invoke.cont:                                      ; preds = %entry
  %1 = getelementptr inbounds %"struct.boost::exception_detail::error_info_injector"* %ref.tmp, i32 0, i32 1, i32 0
  %px_.i.i.i.i.i.i5 = getelementptr inbounds %"struct.boost::exception_detail::error_info_injector"* %ref.tmp, i32 0, i32 1, i32 1, i32 0
  store %"struct.boost::exception_detail::error_info_container"* null, %"struct.boost::exception_detail::error_info_container"** %px_.i.i.i.i.i.i5, align 4, !tbaa !3
  %throw_function_.i.i.i.i = getelementptr inbounds %"struct.boost::exception_detail::error_info_injector"* %ref.tmp, i32 0, i32 1, i32 2
  store i8* null, i8** %throw_function_.i.i.i.i, align 4, !tbaa !3
  %throw_file_.i.i.i.i = getelementptr inbounds %"struct.boost::exception_detail::error_info_injector"* %ref.tmp, i32 0, i32 1, i32 3
  store i8* null, i8** %throw_file_.i.i.i.i, align 4, !tbaa !3
  %throw_line_.i.i.i.i = getelementptr inbounds %"struct.boost::exception_detail::error_info_injector"* %ref.tmp, i32 0, i32 1, i32 4
  store i32 -1, i32* %throw_line_.i.i.i.i, align 4, !tbaa !0
  store i32 (...)** bitcast (i8** getelementptr inbounds ([9 x i8*]* @_ZTVN5boost16exception_detail19error_info_injectorISt12out_of_rangeEE, i32 0, i32 2) to i32 (...)**), i32 (...)*** %0, align 4, !tbaa !5
  store i32 (...)** bitcast (i8** getelementptr inbounds ([9 x i8*]* @_ZTVN5boost16exception_detail19error_info_injectorISt12out_of_rangeEE, i32 0, i32 7) to i32 (...)**), i32 (...)*** %1, align 4, !tbaa !5
  %2 = bitcast i8* %exception to %"class.boost::exception_detail::clone_impl"*
  invoke void @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorISt12out_of_rangeEEEC1ERKS4_(%"class.boost::exception_detail::clone_impl"* %2, %"struct.boost::exception_detail::error_info_injector"* %ref.tmp)
          to label %invoke.cont2 unwind label %lpad1

invoke.cont2:                                     ; preds = %invoke.cont
  invoke void @__cxa_throw(i8* %exception, i8* bitcast ({ i8*, i8*, i32, i32, i8*, i32, i8*, i32 }* @_ZTIN5boost16exception_detail10clone_implINS0_19error_info_injectorISt12out_of_rangeEEEE to i8*), i8* bitcast (void (%"class.boost::exception_detail::clone_impl"*)* @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorISt12out_of_rangeEEED1Ev to i8*)) noreturn
          to label %unreachable unwind label %lpad1

ehcleanup.thread:                                 ; preds = %entry
  %3 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %4 = getelementptr inbounds %"struct.boost::exception_detail::error_info_injector"* %ref.tmp, i32 0, i32 0, i32 0, i32 0
  call void @_ZNSt9exceptionD2Ev(%"class.std::exception"* %4) nounwind
  %5 = extractvalue { i8*, i32 } %3, 0
  %6 = extractvalue { i8*, i32 } %3, 1
  br label %cleanup.action

lpad1:                                            ; preds = %invoke.cont, %invoke.cont2
  %cleanup.isactive.0 = phi i1 [ false, %invoke.cont2 ], [ true, %invoke.cont ]
  %7 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %8 = extractvalue { i8*, i32 } %7, 0
  %9 = extractvalue { i8*, i32 } %7, 1
  store i32 (...)** bitcast (i8** getelementptr inbounds ([4 x i8*]* @_ZTVN5boost9exceptionE, i32 0, i32 2) to i32 (...)**), i32 (...)*** %1, align 4, !tbaa !5
  %10 = load %"struct.boost::exception_detail::error_info_container"** %px_.i.i.i.i.i.i5, align 4, !tbaa !3
  %tobool.i.i.i.i.i.i = icmp eq %"struct.boost::exception_detail::error_info_container"* %10, null
  br i1 %tobool.i.i.i.i.i.i, label %ehcleanup, label %land.lhs.true.i.i.i.i.i.i

land.lhs.true.i.i.i.i.i.i:                        ; preds = %lpad1
  %11 = bitcast %"struct.boost::exception_detail::error_info_container"* %10 to i1 (%"struct.boost::exception_detail::error_info_container"*)***
  %vtable.i.i.i.i.i.i = load i1 (%"struct.boost::exception_detail::error_info_container"*)*** %11, align 4, !tbaa !5
  %vfn.i.i.i.i.i.i = getelementptr inbounds i1 (%"struct.boost::exception_detail::error_info_container"*)** %vtable.i.i.i.i.i.i, i32 4
  %12 = load i1 (%"struct.boost::exception_detail::error_info_container"*)** %vfn.i.i.i.i.i.i, align 4
  %call.i.i.i2.i.i.i = invoke zeroext i1 %12(%"struct.boost::exception_detail::error_info_container"* %10)
          to label %call.i.i.i.noexc.i.i.i unwind label %lpad.i.i.i

call.i.i.i.noexc.i.i.i:                           ; preds = %land.lhs.true.i.i.i.i.i.i
  br i1 %call.i.i.i2.i.i.i, label %if.then.i.i.i.i.i.i, label %ehcleanup

if.then.i.i.i.i.i.i:                              ; preds = %call.i.i.i.noexc.i.i.i
  store %"struct.boost::exception_detail::error_info_container"* null, %"struct.boost::exception_detail::error_info_container"** %px_.i.i.i.i.i.i5, align 4, !tbaa !3
  br label %ehcleanup

lpad.i.i.i:                                       ; preds = %land.lhs.true.i.i.i.i.i.i
  %13 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          filter [0 x i8*] zeroinitializer
  %14 = extractvalue { i8*, i32 } %13, 0
  call void @__cxa_call_unexpected(i8* %14) noreturn nounwind
  unreachable

ehcleanup:                                        ; preds = %if.then.i.i.i.i.i.i, %call.i.i.i.noexc.i.i.i, %lpad1
  %15 = getelementptr inbounds %"struct.boost::exception_detail::error_info_injector"* %ref.tmp, i32 0, i32 0
  call void @_ZNSt12out_of_rangeD2Ev(%"class.std::out_of_range"* %15) nounwind
  br i1 %cleanup.isactive.0, label %cleanup.action, label %eh.resume

cleanup.action:                                   ; preds = %ehcleanup.thread, %ehcleanup
  %ehselector.slot.09 = phi i32 [ %6, %ehcleanup.thread ], [ %9, %ehcleanup ]
  %exn.slot.07 = phi i8* [ %5, %ehcleanup.thread ], [ %8, %ehcleanup ]
  call void @__cxa_free_exception(i8* %exception) nounwind
  br label %eh.resume

eh.resume:                                        ; preds = %ehcleanup, %cleanup.action
  %ehselector.slot.08 = phi i32 [ %9, %ehcleanup ], [ %ehselector.slot.09, %cleanup.action ]
  %exn.slot.06 = phi i8* [ %8, %ehcleanup ], [ %exn.slot.07, %cleanup.action ]
  %lpad.val = insertvalue { i8*, i32 } undef, i8* %exn.slot.06, 0
  %lpad.val3 = insertvalue { i8*, i32 } %lpad.val, i32 %ehselector.slot.08, 1
  resume { i8*, i32 } %lpad.val3

unreachable:                                      ; preds = %invoke.cont2
  unreachable
}

declare void @_ZNSt12out_of_rangeD1Ev(%"class.std::out_of_range"*) nounwind

declare i8* @__cxa_allocate_exception(i32)

define linkonce_odr void @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorISt12out_of_rangeEEED1Ev(%"class.boost::exception_detail::clone_impl"* %this) unnamed_addr nounwind align 2 {
entry:
  %0 = getelementptr inbounds %"class.boost::exception_detail::clone_impl"* %this, i32 0, i32 0, i32 1, i32 0
  store i32 (...)** bitcast (i8** getelementptr inbounds ([4 x i8*]* @_ZTVN5boost9exceptionE, i32 0, i32 2) to i32 (...)**), i32 (...)*** %0, align 4, !tbaa !5
  %px_.i.i.i.i.i.i = getelementptr inbounds %"class.boost::exception_detail::clone_impl"* %this, i32 0, i32 0, i32 1, i32 1, i32 0
  %1 = load %"struct.boost::exception_detail::error_info_container"** %px_.i.i.i.i.i.i, align 4, !tbaa !3
  %tobool.i.i.i.i.i.i = icmp eq %"struct.boost::exception_detail::error_info_container"* %1, null
  br i1 %tobool.i.i.i.i.i.i, label %_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorISt12out_of_rangeEEED2Ev.exit, label %land.lhs.true.i.i.i.i.i.i

land.lhs.true.i.i.i.i.i.i:                        ; preds = %entry
  %2 = bitcast %"struct.boost::exception_detail::error_info_container"* %1 to i1 (%"struct.boost::exception_detail::error_info_container"*)***
  %vtable.i.i.i.i.i.i = load i1 (%"struct.boost::exception_detail::error_info_container"*)*** %2, align 4, !tbaa !5
  %vfn.i.i.i.i.i.i = getelementptr inbounds i1 (%"struct.boost::exception_detail::error_info_container"*)** %vtable.i.i.i.i.i.i, i32 4
  %3 = load i1 (%"struct.boost::exception_detail::error_info_container"*)** %vfn.i.i.i.i.i.i, align 4
  %call.i.i.i2.i.i.i = invoke zeroext i1 %3(%"struct.boost::exception_detail::error_info_container"* %1)
          to label %call.i.i.i.noexc.i.i.i unwind label %lpad.i.i.i

call.i.i.i.noexc.i.i.i:                           ; preds = %land.lhs.true.i.i.i.i.i.i
  br i1 %call.i.i.i2.i.i.i, label %if.then.i.i.i.i.i.i, label %_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorISt12out_of_rangeEEED2Ev.exit

if.then.i.i.i.i.i.i:                              ; preds = %call.i.i.i.noexc.i.i.i
  store %"struct.boost::exception_detail::error_info_container"* null, %"struct.boost::exception_detail::error_info_container"** %px_.i.i.i.i.i.i, align 4, !tbaa !3
  br label %_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorISt12out_of_rangeEEED2Ev.exit

lpad.i.i.i:                                       ; preds = %land.lhs.true.i.i.i.i.i.i
  %4 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          filter [0 x i8*] zeroinitializer
  %5 = extractvalue { i8*, i32 } %4, 0
  tail call void @__cxa_call_unexpected(i8* %5) noreturn nounwind
  unreachable

_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorISt12out_of_rangeEEED2Ev.exit: ; preds = %entry, %call.i.i.i.noexc.i.i.i, %if.then.i.i.i.i.i.i
  %6 = getelementptr inbounds %"class.boost::exception_detail::clone_impl"* %this, i32 0, i32 0, i32 0
  tail call void @_ZNSt12out_of_rangeD2Ev(%"class.std::out_of_range"* %6) nounwind
  ret void
}

declare void @__cxa_throw(i8*, i8*, i8*)

define linkonce_odr void @_ZN5boost16exception_detail19error_info_injectorISt12out_of_rangeED1Ev(%"struct.boost::exception_detail::error_info_injector"* %this) unnamed_addr nounwind align 2 {
entry:
  %0 = getelementptr inbounds %"struct.boost::exception_detail::error_info_injector"* %this, i32 0, i32 1, i32 0
  store i32 (...)** bitcast (i8** getelementptr inbounds ([4 x i8*]* @_ZTVN5boost9exceptionE, i32 0, i32 2) to i32 (...)**), i32 (...)*** %0, align 4, !tbaa !5
  %px_.i.i.i.i.i = getelementptr inbounds %"struct.boost::exception_detail::error_info_injector"* %this, i32 0, i32 1, i32 1, i32 0
  %1 = load %"struct.boost::exception_detail::error_info_container"** %px_.i.i.i.i.i, align 4, !tbaa !3
  %tobool.i.i.i.i.i = icmp eq %"struct.boost::exception_detail::error_info_container"* %1, null
  br i1 %tobool.i.i.i.i.i, label %_ZN5boost16exception_detail19error_info_injectorISt12out_of_rangeED2Ev.exit, label %land.lhs.true.i.i.i.i.i

land.lhs.true.i.i.i.i.i:                          ; preds = %entry
  %2 = bitcast %"struct.boost::exception_detail::error_info_container"* %1 to i1 (%"struct.boost::exception_detail::error_info_container"*)***
  %vtable.i.i.i.i.i = load i1 (%"struct.boost::exception_detail::error_info_container"*)*** %2, align 4, !tbaa !5
  %vfn.i.i.i.i.i = getelementptr inbounds i1 (%"struct.boost::exception_detail::error_info_container"*)** %vtable.i.i.i.i.i, i32 4
  %3 = load i1 (%"struct.boost::exception_detail::error_info_container"*)** %vfn.i.i.i.i.i, align 4
  %call.i.i.i2.i.i = invoke zeroext i1 %3(%"struct.boost::exception_detail::error_info_container"* %1)
          to label %call.i.i.i.noexc.i.i unwind label %lpad.i.i

call.i.i.i.noexc.i.i:                             ; preds = %land.lhs.true.i.i.i.i.i
  br i1 %call.i.i.i2.i.i, label %if.then.i.i.i.i.i, label %_ZN5boost16exception_detail19error_info_injectorISt12out_of_rangeED2Ev.exit

if.then.i.i.i.i.i:                                ; preds = %call.i.i.i.noexc.i.i
  store %"struct.boost::exception_detail::error_info_container"* null, %"struct.boost::exception_detail::error_info_container"** %px_.i.i.i.i.i, align 4, !tbaa !3
  br label %_ZN5boost16exception_detail19error_info_injectorISt12out_of_rangeED2Ev.exit

lpad.i.i:                                         ; preds = %land.lhs.true.i.i.i.i.i
  %4 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          filter [0 x i8*] zeroinitializer
  %5 = extractvalue { i8*, i32 } %4, 0
  tail call void @__cxa_call_unexpected(i8* %5) noreturn nounwind
  unreachable

_ZN5boost16exception_detail19error_info_injectorISt12out_of_rangeED2Ev.exit: ; preds = %entry, %call.i.i.i.noexc.i.i, %if.then.i.i.i.i.i
  %6 = getelementptr inbounds %"struct.boost::exception_detail::error_info_injector"* %this, i32 0, i32 0
  tail call void @_ZNSt12out_of_rangeD2Ev(%"class.std::out_of_range"* %6) nounwind
  ret void
}

declare void @__cxa_free_exception(i8*)

define linkonce_odr void @_ZThn8_N5boost16exception_detail19error_info_injectorISt12out_of_rangeED1Ev(%"struct.boost::exception_detail::error_info_injector"* %this) unnamed_addr nounwind align 2 {
entry:
  %0 = getelementptr inbounds %"struct.boost::exception_detail::error_info_injector"* %this, i32 -1, i32 1, i32 3
  %1 = getelementptr inbounds i8** %0, i32 2
  store i8* bitcast (i8** getelementptr inbounds ([4 x i8*]* @_ZTVN5boost9exceptionE, i32 0, i32 2) to i8*), i8** %1, align 4, !tbaa !5
  %px_.i.i.i.i.i.i = getelementptr inbounds i8** %0, i32 3
  %2 = load i8** %px_.i.i.i.i.i.i, align 4
  %tobool.i.i.i.i.i.i = icmp eq i8* %2, null
  br i1 %tobool.i.i.i.i.i.i, label %_ZN5boost16exception_detail19error_info_injectorISt12out_of_rangeED1Ev.exit, label %land.lhs.true.i.i.i.i.i.i

land.lhs.true.i.i.i.i.i.i:                        ; preds = %entry
  %3 = bitcast i8* %2 to %"struct.boost::exception_detail::error_info_container"*
  %4 = bitcast i8* %2 to i1 (%"struct.boost::exception_detail::error_info_container"*)***
  %vtable.i.i.i.i.i.i = load i1 (%"struct.boost::exception_detail::error_info_container"*)*** %4, align 4, !tbaa !5
  %vfn.i.i.i.i.i.i = getelementptr inbounds i1 (%"struct.boost::exception_detail::error_info_container"*)** %vtable.i.i.i.i.i.i, i32 4
  %5 = load i1 (%"struct.boost::exception_detail::error_info_container"*)** %vfn.i.i.i.i.i.i, align 4
  %call.i.i.i2.i.i.i = invoke zeroext i1 %5(%"struct.boost::exception_detail::error_info_container"* %3)
          to label %call.i.i.i.noexc.i.i.i unwind label %lpad.i.i.i

call.i.i.i.noexc.i.i.i:                           ; preds = %land.lhs.true.i.i.i.i.i.i
  br i1 %call.i.i.i2.i.i.i, label %if.then.i.i.i.i.i.i, label %_ZN5boost16exception_detail19error_info_injectorISt12out_of_rangeED1Ev.exit

if.then.i.i.i.i.i.i:                              ; preds = %call.i.i.i.noexc.i.i.i
  store i8* null, i8** %px_.i.i.i.i.i.i, align 4, !tbaa !3
  br label %_ZN5boost16exception_detail19error_info_injectorISt12out_of_rangeED1Ev.exit

lpad.i.i.i:                                       ; preds = %land.lhs.true.i.i.i.i.i.i
  %6 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          filter [0 x i8*] zeroinitializer
  %7 = extractvalue { i8*, i32 } %6, 0
  tail call void @__cxa_call_unexpected(i8* %7) noreturn nounwind
  unreachable

_ZN5boost16exception_detail19error_info_injectorISt12out_of_rangeED1Ev.exit: ; preds = %entry, %call.i.i.i.noexc.i.i.i, %if.then.i.i.i.i.i.i
  %8 = bitcast i8** %0 to %"class.std::out_of_range"*
  tail call void @_ZNSt12out_of_rangeD2Ev(%"class.std::out_of_range"* %8) nounwind
  ret void
}

declare void @_ZNSt12out_of_rangeD2Ev(%"class.std::out_of_range"*) nounwind

declare void @__cxa_call_unexpected(i8*)

declare void @__cxa_pure_virtual()

define linkonce_odr void @_ZThn8_N5boost16exception_detail10clone_implINS0_19error_info_injectorISt12out_of_rangeEEED1Ev(%"class.boost::exception_detail::clone_impl"* %this) unnamed_addr nounwind align 2 {
entry:
  %0 = getelementptr inbounds %"class.boost::exception_detail::clone_impl"* %this, i32 -1, i32 0, i32 1, i32 4
  %1 = getelementptr inbounds i32* %0, i32 2
  store i32 ptrtoint (i8** getelementptr inbounds ([4 x i8*]* @_ZTVN5boost9exceptionE, i32 0, i32 2) to i32), i32* %1, align 4, !tbaa !5
  %px_.i.i.i.i.i.i.i = getelementptr inbounds i32* %0, i32 3
  %2 = bitcast i32* %px_.i.i.i.i.i.i.i to %"struct.boost::exception_detail::error_info_container"**
  %3 = load %"struct.boost::exception_detail::error_info_container"** %2, align 4, !tbaa !3
  %tobool.i.i.i.i.i.i.i = icmp eq %"struct.boost::exception_detail::error_info_container"* %3, null
  br i1 %tobool.i.i.i.i.i.i.i, label %_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorISt12out_of_rangeEEED1Ev.exit, label %land.lhs.true.i.i.i.i.i.i.i

land.lhs.true.i.i.i.i.i.i.i:                      ; preds = %entry
  %4 = bitcast %"struct.boost::exception_detail::error_info_container"* %3 to i1 (%"struct.boost::exception_detail::error_info_container"*)***
  %vtable.i.i.i.i.i.i.i = load i1 (%"struct.boost::exception_detail::error_info_container"*)*** %4, align 4, !tbaa !5
  %vfn.i.i.i.i.i.i.i = getelementptr inbounds i1 (%"struct.boost::exception_detail::error_info_container"*)** %vtable.i.i.i.i.i.i.i, i32 4
  %5 = load i1 (%"struct.boost::exception_detail::error_info_container"*)** %vfn.i.i.i.i.i.i.i, align 4
  %call.i.i.i2.i.i.i.i = invoke zeroext i1 %5(%"struct.boost::exception_detail::error_info_container"* %3)
          to label %call.i.i.i.noexc.i.i.i.i unwind label %lpad.i.i.i.i

call.i.i.i.noexc.i.i.i.i:                         ; preds = %land.lhs.true.i.i.i.i.i.i.i
  br i1 %call.i.i.i2.i.i.i.i, label %if.then.i.i.i.i.i.i.i, label %_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorISt12out_of_rangeEEED1Ev.exit

if.then.i.i.i.i.i.i.i:                            ; preds = %call.i.i.i.noexc.i.i.i.i
  store i32 0, i32* %px_.i.i.i.i.i.i.i, align 4, !tbaa !3
  br label %_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorISt12out_of_rangeEEED1Ev.exit

lpad.i.i.i.i:                                     ; preds = %land.lhs.true.i.i.i.i.i.i.i
  %6 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          filter [0 x i8*] zeroinitializer
  %7 = extractvalue { i8*, i32 } %6, 0
  tail call void @__cxa_call_unexpected(i8* %7) noreturn nounwind
  unreachable

_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorISt12out_of_rangeEEED1Ev.exit: ; preds = %entry, %call.i.i.i.noexc.i.i.i.i, %if.then.i.i.i.i.i.i.i
  %8 = bitcast i32* %0 to %"class.std::out_of_range"*
  tail call void @_ZNSt12out_of_rangeD2Ev(%"class.std::out_of_range"* %8) nounwind
  ret void
}

define linkonce_odr void @_ZTv0_n20_N5boost16exception_detail10clone_implINS0_19error_info_injectorISt12out_of_rangeEEED1Ev(%"class.boost::exception_detail::clone_impl"* %this) unnamed_addr nounwind align 2 {
entry:
  %0 = bitcast %"class.boost::exception_detail::clone_impl"* %this to i8*
  %1 = bitcast %"class.boost::exception_detail::clone_impl"* %this to i8**
  %2 = load i8** %1, align 4
  %3 = getelementptr inbounds i8* %2, i32 -20
  %4 = bitcast i8* %3 to i32*
  %5 = load i32* %4, align 4
  %6 = getelementptr inbounds i8* %0, i32 %5
  %.sum = add i32 %5, 8
  %7 = getelementptr inbounds i8* %0, i32 %.sum
  %8 = bitcast i8* %7 to i32 (...)***
  store i32 (...)** bitcast (i8** getelementptr inbounds ([4 x i8*]* @_ZTVN5boost9exceptionE, i32 0, i32 2) to i32 (...)**), i32 (...)*** %8, align 4, !tbaa !5
  %.sum2 = add i32 %5, 12
  %px_.i.i.i.i.i.i.i = getelementptr inbounds i8* %0, i32 %.sum2
  %9 = bitcast i8* %px_.i.i.i.i.i.i.i to %"struct.boost::exception_detail::error_info_container"**
  %10 = load %"struct.boost::exception_detail::error_info_container"** %9, align 4, !tbaa !3
  %tobool.i.i.i.i.i.i.i = icmp eq %"struct.boost::exception_detail::error_info_container"* %10, null
  br i1 %tobool.i.i.i.i.i.i.i, label %_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorISt12out_of_rangeEEED1Ev.exit, label %land.lhs.true.i.i.i.i.i.i.i

land.lhs.true.i.i.i.i.i.i.i:                      ; preds = %entry
  %11 = bitcast %"struct.boost::exception_detail::error_info_container"* %10 to i1 (%"struct.boost::exception_detail::error_info_container"*)***
  %vtable.i.i.i.i.i.i.i = load i1 (%"struct.boost::exception_detail::error_info_container"*)*** %11, align 4, !tbaa !5
  %vfn.i.i.i.i.i.i.i = getelementptr inbounds i1 (%"struct.boost::exception_detail::error_info_container"*)** %vtable.i.i.i.i.i.i.i, i32 4
  %12 = load i1 (%"struct.boost::exception_detail::error_info_container"*)** %vfn.i.i.i.i.i.i.i, align 4
  %call.i.i.i2.i.i.i.i = invoke zeroext i1 %12(%"struct.boost::exception_detail::error_info_container"* %10)
          to label %call.i.i.i.noexc.i.i.i.i unwind label %lpad.i.i.i.i

call.i.i.i.noexc.i.i.i.i:                         ; preds = %land.lhs.true.i.i.i.i.i.i.i
  br i1 %call.i.i.i2.i.i.i.i, label %if.then.i.i.i.i.i.i.i, label %_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorISt12out_of_rangeEEED1Ev.exit

if.then.i.i.i.i.i.i.i:                            ; preds = %call.i.i.i.noexc.i.i.i.i
  store %"struct.boost::exception_detail::error_info_container"* null, %"struct.boost::exception_detail::error_info_container"** %9, align 4, !tbaa !3
  br label %_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorISt12out_of_rangeEEED1Ev.exit

lpad.i.i.i.i:                                     ; preds = %land.lhs.true.i.i.i.i.i.i.i
  %13 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          filter [0 x i8*] zeroinitializer
  %14 = extractvalue { i8*, i32 } %13, 0
  tail call void @__cxa_call_unexpected(i8* %14) noreturn nounwind
  unreachable

_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorISt12out_of_rangeEEED1Ev.exit: ; preds = %entry, %call.i.i.i.noexc.i.i.i.i, %if.then.i.i.i.i.i.i.i
  %15 = bitcast i8* %6 to %"class.std::out_of_range"*
  tail call void @_ZNSt12out_of_rangeD2Ev(%"class.std::out_of_range"* %15) nounwind
  ret void
}

define linkonce_odr void @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorISt12out_of_rangeEEED0Ev(%"class.boost::exception_detail::clone_impl"* %this) unnamed_addr nounwind align 2 {
entry:
  %0 = getelementptr inbounds %"class.boost::exception_detail::clone_impl"* %this, i32 0, i32 0, i32 1, i32 0
  store i32 (...)** bitcast (i8** getelementptr inbounds ([4 x i8*]* @_ZTVN5boost9exceptionE, i32 0, i32 2) to i32 (...)**), i32 (...)*** %0, align 4, !tbaa !5
  %px_.i.i.i.i.i.i.i = getelementptr inbounds %"class.boost::exception_detail::clone_impl"* %this, i32 0, i32 0, i32 1, i32 1, i32 0
  %1 = load %"struct.boost::exception_detail::error_info_container"** %px_.i.i.i.i.i.i.i, align 4, !tbaa !3
  %tobool.i.i.i.i.i.i.i = icmp eq %"struct.boost::exception_detail::error_info_container"* %1, null
  br i1 %tobool.i.i.i.i.i.i.i, label %_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorISt12out_of_rangeEEED1Ev.exit, label %land.lhs.true.i.i.i.i.i.i.i

land.lhs.true.i.i.i.i.i.i.i:                      ; preds = %entry
  %2 = bitcast %"struct.boost::exception_detail::error_info_container"* %1 to i1 (%"struct.boost::exception_detail::error_info_container"*)***
  %vtable.i.i.i.i.i.i.i = load i1 (%"struct.boost::exception_detail::error_info_container"*)*** %2, align 4, !tbaa !5
  %vfn.i.i.i.i.i.i.i = getelementptr inbounds i1 (%"struct.boost::exception_detail::error_info_container"*)** %vtable.i.i.i.i.i.i.i, i32 4
  %3 = load i1 (%"struct.boost::exception_detail::error_info_container"*)** %vfn.i.i.i.i.i.i.i, align 4
  %call.i.i.i2.i.i.i.i = invoke zeroext i1 %3(%"struct.boost::exception_detail::error_info_container"* %1)
          to label %call.i.i.i.noexc.i.i.i.i unwind label %lpad.i.i.i.i

call.i.i.i.noexc.i.i.i.i:                         ; preds = %land.lhs.true.i.i.i.i.i.i.i
  br i1 %call.i.i.i2.i.i.i.i, label %if.then.i.i.i.i.i.i.i, label %_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorISt12out_of_rangeEEED1Ev.exit

if.then.i.i.i.i.i.i.i:                            ; preds = %call.i.i.i.noexc.i.i.i.i
  store %"struct.boost::exception_detail::error_info_container"* null, %"struct.boost::exception_detail::error_info_container"** %px_.i.i.i.i.i.i.i, align 4, !tbaa !3
  br label %_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorISt12out_of_rangeEEED1Ev.exit

lpad.i.i.i.i:                                     ; preds = %land.lhs.true.i.i.i.i.i.i.i
  %4 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          filter [0 x i8*] zeroinitializer
  %5 = extractvalue { i8*, i32 } %4, 0
  tail call void @__cxa_call_unexpected(i8* %5) noreturn nounwind
  unreachable

_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorISt12out_of_rangeEEED1Ev.exit: ; preds = %entry, %call.i.i.i.noexc.i.i.i.i, %if.then.i.i.i.i.i.i.i
  %6 = getelementptr inbounds %"class.boost::exception_detail::clone_impl"* %this, i32 0, i32 0, i32 0
  tail call void @_ZNSt12out_of_rangeD2Ev(%"class.std::out_of_range"* %6) nounwind
  %7 = bitcast %"class.boost::exception_detail::clone_impl"* %this to i8*
  tail call void @_ZdlPv(i8* %7) nounwind
  ret void
}

declare i8* @_ZNKSt11logic_error4whatEv(%"class.std::logic_error"*) nounwind

define linkonce_odr %"class.boost::exception_detail::clone_base"* @_ZNK5boost16exception_detail10clone_implINS0_19error_info_injectorISt12out_of_rangeEEE5cloneEv(%"class.boost::exception_detail::clone_impl"* %this) unnamed_addr align 2 {
entry:
  %call = tail call noalias i8* @_Znwj(i32 32)
  %0 = bitcast i8* %call to %"class.boost::exception_detail::clone_impl"*
  invoke void @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorISt12out_of_rangeEEEC1ERKS5_NS5_9clone_tagE(%"class.boost::exception_detail::clone_impl"* %0, %"class.boost::exception_detail::clone_impl"* %this)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %entry
  %1 = icmp eq i8* %call, null
  br i1 %1, label %cast.end, label %cast.notnull

cast.notnull:                                     ; preds = %invoke.cont
  %2 = bitcast i8* %call to i8**
  %vtable = load i8** %2, align 4, !tbaa !5
  %vbase.offset.ptr = getelementptr i8* %vtable, i32 -12
  %3 = bitcast i8* %vbase.offset.ptr to i32*
  %vbase.offset = load i32* %3, align 4
  %add.ptr = getelementptr inbounds i8* %call, i32 %vbase.offset
  %4 = bitcast i8* %add.ptr to %"class.boost::exception_detail::clone_base"*
  br label %cast.end

cast.end:                                         ; preds = %cast.notnull, %invoke.cont
  %cast.result = phi %"class.boost::exception_detail::clone_base"* [ %4, %cast.notnull ], [ null, %invoke.cont ]
  ret %"class.boost::exception_detail::clone_base"* %cast.result

lpad:                                             ; preds = %entry
  %5 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  tail call void @_ZdlPv(i8* %call) nounwind
  resume { i8*, i32 } %5
}

define linkonce_odr void @_ZNK5boost16exception_detail10clone_implINS0_19error_info_injectorISt12out_of_rangeEEE7rethrowEv(%"class.boost::exception_detail::clone_impl"* %this) unnamed_addr noreturn align 2 {
entry:
  %exception = tail call i8* @__cxa_allocate_exception(i32 32) nounwind
  %0 = bitcast i8* %exception to %"class.boost::exception_detail::clone_impl"*
  invoke void @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorISt12out_of_rangeEEEC1ERKS5_(%"class.boost::exception_detail::clone_impl"* %0, %"class.boost::exception_detail::clone_impl"* %this)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %entry
  tail call void @__cxa_throw(i8* %exception, i8* bitcast ({ i8*, i8*, i32, i32, i8*, i32, i8*, i32 }* @_ZTIN5boost16exception_detail10clone_implINS0_19error_info_injectorISt12out_of_rangeEEEE to i8*), i8* bitcast (void (%"class.boost::exception_detail::clone_impl"*)* @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorISt12out_of_rangeEEED1Ev to i8*)) noreturn
  unreachable

lpad:                                             ; preds = %entry
  %1 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  tail call void @__cxa_free_exception(i8* %exception) nounwind
  resume { i8*, i32 } %1
}

define linkonce_odr void @_ZThn8_N5boost16exception_detail10clone_implINS0_19error_info_injectorISt12out_of_rangeEEED0Ev(%"class.boost::exception_detail::clone_impl"* %this) unnamed_addr nounwind align 2 {
entry:
  %0 = getelementptr inbounds %"class.boost::exception_detail::clone_impl"* %this, i32 -1, i32 0, i32 1, i32 4
  %1 = getelementptr inbounds i32* %0, i32 2
  store i32 ptrtoint (i8** getelementptr inbounds ([4 x i8*]* @_ZTVN5boost9exceptionE, i32 0, i32 2) to i32), i32* %1, align 4, !tbaa !5
  %px_.i.i.i.i.i.i.i.i = getelementptr inbounds i32* %0, i32 3
  %2 = bitcast i32* %px_.i.i.i.i.i.i.i.i to %"struct.boost::exception_detail::error_info_container"**
  %3 = load %"struct.boost::exception_detail::error_info_container"** %2, align 4, !tbaa !3
  %tobool.i.i.i.i.i.i.i.i = icmp eq %"struct.boost::exception_detail::error_info_container"* %3, null
  br i1 %tobool.i.i.i.i.i.i.i.i, label %_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorISt12out_of_rangeEEED0Ev.exit, label %land.lhs.true.i.i.i.i.i.i.i.i

land.lhs.true.i.i.i.i.i.i.i.i:                    ; preds = %entry
  %4 = bitcast %"struct.boost::exception_detail::error_info_container"* %3 to i1 (%"struct.boost::exception_detail::error_info_container"*)***
  %vtable.i.i.i.i.i.i.i.i = load i1 (%"struct.boost::exception_detail::error_info_container"*)*** %4, align 4, !tbaa !5
  %vfn.i.i.i.i.i.i.i.i = getelementptr inbounds i1 (%"struct.boost::exception_detail::error_info_container"*)** %vtable.i.i.i.i.i.i.i.i, i32 4
  %5 = load i1 (%"struct.boost::exception_detail::error_info_container"*)** %vfn.i.i.i.i.i.i.i.i, align 4
  %call.i.i.i2.i.i.i.i.i = invoke zeroext i1 %5(%"struct.boost::exception_detail::error_info_container"* %3)
          to label %call.i.i.i.noexc.i.i.i.i.i unwind label %lpad.i.i.i.i.i

call.i.i.i.noexc.i.i.i.i.i:                       ; preds = %land.lhs.true.i.i.i.i.i.i.i.i
  br i1 %call.i.i.i2.i.i.i.i.i, label %if.then.i.i.i.i.i.i.i.i, label %_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorISt12out_of_rangeEEED0Ev.exit

if.then.i.i.i.i.i.i.i.i:                          ; preds = %call.i.i.i.noexc.i.i.i.i.i
  store i32 0, i32* %px_.i.i.i.i.i.i.i.i, align 4, !tbaa !3
  br label %_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorISt12out_of_rangeEEED0Ev.exit

lpad.i.i.i.i.i:                                   ; preds = %land.lhs.true.i.i.i.i.i.i.i.i
  %6 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          filter [0 x i8*] zeroinitializer
  %7 = extractvalue { i8*, i32 } %6, 0
  tail call void @__cxa_call_unexpected(i8* %7) noreturn nounwind
  unreachable

_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorISt12out_of_rangeEEED0Ev.exit: ; preds = %entry, %call.i.i.i.noexc.i.i.i.i.i, %if.then.i.i.i.i.i.i.i.i
  %8 = bitcast i32* %0 to %"class.std::out_of_range"*
  tail call void @_ZNSt12out_of_rangeD2Ev(%"class.std::out_of_range"* %8) nounwind
  %9 = bitcast i32* %0 to i8*
  tail call void @_ZdlPv(i8* %9) nounwind
  ret void
}

define linkonce_odr %"class.boost::exception_detail::clone_base"* @_ZTv0_n12_NK5boost16exception_detail10clone_implINS0_19error_info_injectorISt12out_of_rangeEEE5cloneEv(%"class.boost::exception_detail::clone_impl"* %this) unnamed_addr align 2 {
entry:
  %0 = bitcast %"class.boost::exception_detail::clone_impl"* %this to i8*
  %1 = bitcast %"class.boost::exception_detail::clone_impl"* %this to i8**
  %2 = load i8** %1, align 4
  %3 = getelementptr inbounds i8* %2, i32 -12
  %4 = bitcast i8* %3 to i32*
  %5 = load i32* %4, align 4
  %6 = getelementptr inbounds i8* %0, i32 %5
  %7 = bitcast i8* %6 to %"class.boost::exception_detail::clone_impl"*
  %call.i = tail call noalias i8* @_Znwj(i32 32)
  %8 = bitcast i8* %call.i to %"class.boost::exception_detail::clone_impl"*
  invoke void @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorISt12out_of_rangeEEEC1ERKS5_NS5_9clone_tagE(%"class.boost::exception_detail::clone_impl"* %8, %"class.boost::exception_detail::clone_impl"* %7)
          to label %invoke.cont.i unwind label %lpad.i

invoke.cont.i:                                    ; preds = %entry
  %9 = icmp eq i8* %call.i, null
  br i1 %9, label %_ZNK5boost16exception_detail10clone_implINS0_19error_info_injectorISt12out_of_rangeEEE5cloneEv.exit, label %cast.notnull.i

cast.notnull.i:                                   ; preds = %invoke.cont.i
  %10 = bitcast i8* %call.i to i8**
  %vtable.i = load i8** %10, align 4, !tbaa !5
  %vbase.offset.ptr.i = getelementptr i8* %vtable.i, i32 -12
  %11 = bitcast i8* %vbase.offset.ptr.i to i32*
  %vbase.offset.i = load i32* %11, align 4
  %add.ptr.i = getelementptr inbounds i8* %call.i, i32 %vbase.offset.i
  %12 = bitcast i8* %add.ptr.i to %"class.boost::exception_detail::clone_base"*
  br label %_ZNK5boost16exception_detail10clone_implINS0_19error_info_injectorISt12out_of_rangeEEE5cloneEv.exit

lpad.i:                                           ; preds = %entry
  %13 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  tail call void @_ZdlPv(i8* %call.i) nounwind
  resume { i8*, i32 } %13

_ZNK5boost16exception_detail10clone_implINS0_19error_info_injectorISt12out_of_rangeEEE5cloneEv.exit: ; preds = %invoke.cont.i, %cast.notnull.i
  %cast.result.i = phi %"class.boost::exception_detail::clone_base"* [ %12, %cast.notnull.i ], [ null, %invoke.cont.i ]
  ret %"class.boost::exception_detail::clone_base"* %cast.result.i
}

define linkonce_odr void @_ZTv0_n16_NK5boost16exception_detail10clone_implINS0_19error_info_injectorISt12out_of_rangeEEE7rethrowEv(%"class.boost::exception_detail::clone_impl"* %this) unnamed_addr noreturn align 2 {
entry:
  %0 = bitcast %"class.boost::exception_detail::clone_impl"* %this to i8*
  %1 = bitcast %"class.boost::exception_detail::clone_impl"* %this to i8**
  %2 = load i8** %1, align 4
  %3 = getelementptr inbounds i8* %2, i32 -16
  %4 = bitcast i8* %3 to i32*
  %5 = load i32* %4, align 4
  %6 = getelementptr inbounds i8* %0, i32 %5
  %7 = bitcast i8* %6 to %"class.boost::exception_detail::clone_impl"*
  tail call void @_ZNK5boost16exception_detail10clone_implINS0_19error_info_injectorISt12out_of_rangeEEE7rethrowEv(%"class.boost::exception_detail::clone_impl"* %7)
  unreachable
}

define linkonce_odr void @_ZTv0_n20_N5boost16exception_detail10clone_implINS0_19error_info_injectorISt12out_of_rangeEEED0Ev(%"class.boost::exception_detail::clone_impl"* %this) unnamed_addr nounwind align 2 {
entry:
  %0 = bitcast %"class.boost::exception_detail::clone_impl"* %this to i8*
  %1 = bitcast %"class.boost::exception_detail::clone_impl"* %this to i8**
  %2 = load i8** %1, align 4
  %3 = getelementptr inbounds i8* %2, i32 -20
  %4 = bitcast i8* %3 to i32*
  %5 = load i32* %4, align 4
  %6 = getelementptr inbounds i8* %0, i32 %5
  %.sum = add i32 %5, 8
  %7 = getelementptr inbounds i8* %0, i32 %.sum
  %8 = bitcast i8* %7 to i32 (...)***
  store i32 (...)** bitcast (i8** getelementptr inbounds ([4 x i8*]* @_ZTVN5boost9exceptionE, i32 0, i32 2) to i32 (...)**), i32 (...)*** %8, align 4, !tbaa !5
  %.sum2 = add i32 %5, 12
  %px_.i.i.i.i.i.i.i.i = getelementptr inbounds i8* %0, i32 %.sum2
  %9 = bitcast i8* %px_.i.i.i.i.i.i.i.i to %"struct.boost::exception_detail::error_info_container"**
  %10 = load %"struct.boost::exception_detail::error_info_container"** %9, align 4, !tbaa !3
  %tobool.i.i.i.i.i.i.i.i = icmp eq %"struct.boost::exception_detail::error_info_container"* %10, null
  br i1 %tobool.i.i.i.i.i.i.i.i, label %_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorISt12out_of_rangeEEED0Ev.exit, label %land.lhs.true.i.i.i.i.i.i.i.i

land.lhs.true.i.i.i.i.i.i.i.i:                    ; preds = %entry
  %11 = bitcast %"struct.boost::exception_detail::error_info_container"* %10 to i1 (%"struct.boost::exception_detail::error_info_container"*)***
  %vtable.i.i.i.i.i.i.i.i = load i1 (%"struct.boost::exception_detail::error_info_container"*)*** %11, align 4, !tbaa !5
  %vfn.i.i.i.i.i.i.i.i = getelementptr inbounds i1 (%"struct.boost::exception_detail::error_info_container"*)** %vtable.i.i.i.i.i.i.i.i, i32 4
  %12 = load i1 (%"struct.boost::exception_detail::error_info_container"*)** %vfn.i.i.i.i.i.i.i.i, align 4
  %call.i.i.i2.i.i.i.i.i = invoke zeroext i1 %12(%"struct.boost::exception_detail::error_info_container"* %10)
          to label %call.i.i.i.noexc.i.i.i.i.i unwind label %lpad.i.i.i.i.i

call.i.i.i.noexc.i.i.i.i.i:                       ; preds = %land.lhs.true.i.i.i.i.i.i.i.i
  br i1 %call.i.i.i2.i.i.i.i.i, label %if.then.i.i.i.i.i.i.i.i, label %_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorISt12out_of_rangeEEED0Ev.exit

if.then.i.i.i.i.i.i.i.i:                          ; preds = %call.i.i.i.noexc.i.i.i.i.i
  store %"struct.boost::exception_detail::error_info_container"* null, %"struct.boost::exception_detail::error_info_container"** %9, align 4, !tbaa !3
  br label %_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorISt12out_of_rangeEEED0Ev.exit

lpad.i.i.i.i.i:                                   ; preds = %land.lhs.true.i.i.i.i.i.i.i.i
  %13 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          filter [0 x i8*] zeroinitializer
  %14 = extractvalue { i8*, i32 } %13, 0
  tail call void @__cxa_call_unexpected(i8* %14) noreturn nounwind
  unreachable

_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorISt12out_of_rangeEEED0Ev.exit: ; preds = %entry, %call.i.i.i.noexc.i.i.i.i.i, %if.then.i.i.i.i.i.i.i.i
  %15 = bitcast i8* %6 to %"class.std::out_of_range"*
  tail call void @_ZNSt12out_of_rangeD2Ev(%"class.std::out_of_range"* %15) nounwind
  tail call void @_ZdlPv(i8* %6) nounwind
  ret void
}

declare void @_ZdlPv(i8*) nounwind

define linkonce_odr void @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorISt12out_of_rangeEEEC1ERKS5_(%"class.boost::exception_detail::clone_impl"* %this, %"class.boost::exception_detail::clone_impl"*) unnamed_addr inlinehint align 2 {
entry:
  %1 = getelementptr inbounds %"class.boost::exception_detail::clone_impl"* %this, i32 0, i32 1, i32 0
  store i32 (...)** bitcast (i8** getelementptr inbounds ([6 x i8*]* @_ZTVN5boost16exception_detail10clone_baseE, i32 0, i32 2) to i32 (...)**), i32 (...)*** %1, align 4, !tbaa !5
  %2 = getelementptr inbounds %"class.boost::exception_detail::clone_impl"* %this, i32 0, i32 0, i32 0
  %3 = getelementptr inbounds %"class.boost::exception_detail::clone_impl"* %this, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0
  store i32 (...)** bitcast (i8** getelementptr inbounds ([5 x i8*]* @_ZTVSt11logic_error, i32 0, i32 2) to i32 (...)**), i32 (...)*** %3, align 4, !tbaa !5
  %_M_msg.i.i.i = getelementptr inbounds %"class.boost::exception_detail::clone_impl"* %this, i32 0, i32 0, i32 0, i32 0, i32 1
  %_M_msg2.i.i.i = getelementptr inbounds %"class.boost::exception_detail::clone_impl"* %0, i32 0, i32 0, i32 0, i32 0, i32 1
  invoke void @_ZNSsC1ERKSs(%"class.std::basic_string"* %_M_msg.i.i.i, %"class.std::basic_string"* %_M_msg2.i.i.i)
          to label %_ZNSt12out_of_rangeC2ERKS_.exit.i unwind label %lpad.i.i.i

lpad.i.i.i:                                       ; preds = %entry
  %4 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %5 = getelementptr inbounds %"class.boost::exception_detail::clone_impl"* %this, i32 0, i32 0, i32 0, i32 0, i32 0
  tail call void @_ZNSt9exceptionD2Ev(%"class.std::exception"* %5) nounwind
  br label %lpad.body

_ZNSt12out_of_rangeC2ERKS_.exit.i:                ; preds = %entry
  store i32 (...)** bitcast (i8** getelementptr inbounds ([5 x i8*]* @_ZTVSt12out_of_range, i32 0, i32 2) to i32 (...)**), i32 (...)*** %3, align 4, !tbaa !5
  %6 = getelementptr inbounds %"class.boost::exception_detail::clone_impl"* %this, i32 0, i32 0, i32 1, i32 0
  store i32 (...)** bitcast (i8** getelementptr inbounds ([4 x i8*]* @_ZTVN5boost9exceptionE, i32 0, i32 2) to i32 (...)**), i32 (...)*** %6, align 4, !tbaa !5
  %px_.i.i.i.i = getelementptr inbounds %"class.boost::exception_detail::clone_impl"* %this, i32 0, i32 0, i32 1, i32 1, i32 0
  %px_2.i.i.i.i = getelementptr inbounds %"class.boost::exception_detail::clone_impl"* %0, i32 0, i32 0, i32 1, i32 1, i32 0
  %7 = load %"struct.boost::exception_detail::error_info_container"** %px_2.i.i.i.i, align 4, !tbaa !3
  store %"struct.boost::exception_detail::error_info_container"* %7, %"struct.boost::exception_detail::error_info_container"** %px_.i.i.i.i, align 4, !tbaa !3
  %tobool.i.i.i.i.i = icmp eq %"struct.boost::exception_detail::error_info_container"* %7, null
  br i1 %tobool.i.i.i.i.i, label %invoke.cont, label %if.then.i.i.i.i.i

if.then.i.i.i.i.i:                                ; preds = %_ZNSt12out_of_rangeC2ERKS_.exit.i
  %8 = bitcast %"struct.boost::exception_detail::error_info_container"* %7 to void (%"struct.boost::exception_detail::error_info_container"*)***
  %vtable.i.i.i.i.i = load void (%"struct.boost::exception_detail::error_info_container"*)*** %8, align 4, !tbaa !5
  %vfn.i.i.i.i.i = getelementptr inbounds void (%"struct.boost::exception_detail::error_info_container"*)** %vtable.i.i.i.i.i, i32 3
  %9 = load void (%"struct.boost::exception_detail::error_info_container"*)** %vfn.i.i.i.i.i, align 4
  invoke void %9(%"struct.boost::exception_detail::error_info_container"* %7)
          to label %invoke.cont unwind label %lpad.i

lpad.i:                                           ; preds = %if.then.i.i.i.i.i
  %10 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  tail call void @_ZNSt12out_of_rangeD2Ev(%"class.std::out_of_range"* %2) nounwind
  br label %lpad.body

invoke.cont:                                      ; preds = %if.then.i.i.i.i.i, %_ZNSt12out_of_rangeC2ERKS_.exit.i
  %throw_function_.i.i = getelementptr inbounds %"class.boost::exception_detail::clone_impl"* %this, i32 0, i32 0, i32 1, i32 2
  %throw_function_3.i.i = getelementptr inbounds %"class.boost::exception_detail::clone_impl"* %0, i32 0, i32 0, i32 1, i32 2
  %11 = load i8** %throw_function_3.i.i, align 4, !tbaa !3
  store i8* %11, i8** %throw_function_.i.i, align 4, !tbaa !3
  %throw_file_.i.i = getelementptr inbounds %"class.boost::exception_detail::clone_impl"* %this, i32 0, i32 0, i32 1, i32 3
  %throw_file_4.i.i = getelementptr inbounds %"class.boost::exception_detail::clone_impl"* %0, i32 0, i32 0, i32 1, i32 3
  %12 = load i8** %throw_file_4.i.i, align 4, !tbaa !3
  store i8* %12, i8** %throw_file_.i.i, align 4, !tbaa !3
  %throw_line_.i.i = getelementptr inbounds %"class.boost::exception_detail::clone_impl"* %this, i32 0, i32 0, i32 1, i32 4
  %throw_line_5.i.i = getelementptr inbounds %"class.boost::exception_detail::clone_impl"* %0, i32 0, i32 0, i32 1, i32 4
  %13 = load i32* %throw_line_5.i.i, align 4, !tbaa !0
  store i32 %13, i32* %throw_line_.i.i, align 4, !tbaa !0
  store i32 (...)** bitcast (i8** getelementptr inbounds ([21 x i8*]* @_ZTVN5boost16exception_detail10clone_implINS0_19error_info_injectorISt12out_of_rangeEEEE, i32 0, i32 3) to i32 (...)**), i32 (...)*** %3, align 4, !tbaa !5
  store i32 (...)** bitcast (i8** getelementptr inbounds ([21 x i8*]* @_ZTVN5boost16exception_detail10clone_implINS0_19error_info_injectorISt12out_of_rangeEEEE, i32 0, i32 10) to i32 (...)**), i32 (...)*** %6, align 4, !tbaa !5
  store i32 (...)** bitcast (i8** getelementptr inbounds ([21 x i8*]* @_ZTVN5boost16exception_detail10clone_implINS0_19error_info_injectorISt12out_of_rangeEEEE, i32 0, i32 17) to i32 (...)**), i32 (...)*** %1, align 4, !tbaa !5
  ret void

lpad.body:                                        ; preds = %lpad.i, %lpad.i.i.i
  %eh.lpad-body = phi { i8*, i32 } [ %4, %lpad.i.i.i ], [ %10, %lpad.i ]
  resume { i8*, i32 } %eh.lpad-body
}

define linkonce_odr void @_ZN5boost16exception_detail19error_info_injectorISt12out_of_rangeED0Ev(%"struct.boost::exception_detail::error_info_injector"* %this) unnamed_addr nounwind align 2 {
entry:
  %0 = getelementptr inbounds %"struct.boost::exception_detail::error_info_injector"* %this, i32 0, i32 1, i32 0
  store i32 (...)** bitcast (i8** getelementptr inbounds ([4 x i8*]* @_ZTVN5boost9exceptionE, i32 0, i32 2) to i32 (...)**), i32 (...)*** %0, align 4, !tbaa !5
  %px_.i.i.i.i.i.i = getelementptr inbounds %"struct.boost::exception_detail::error_info_injector"* %this, i32 0, i32 1, i32 1, i32 0
  %1 = load %"struct.boost::exception_detail::error_info_container"** %px_.i.i.i.i.i.i, align 4, !tbaa !3
  %tobool.i.i.i.i.i.i = icmp eq %"struct.boost::exception_detail::error_info_container"* %1, null
  br i1 %tobool.i.i.i.i.i.i, label %_ZN5boost16exception_detail19error_info_injectorISt12out_of_rangeED1Ev.exit, label %land.lhs.true.i.i.i.i.i.i

land.lhs.true.i.i.i.i.i.i:                        ; preds = %entry
  %2 = bitcast %"struct.boost::exception_detail::error_info_container"* %1 to i1 (%"struct.boost::exception_detail::error_info_container"*)***
  %vtable.i.i.i.i.i.i = load i1 (%"struct.boost::exception_detail::error_info_container"*)*** %2, align 4, !tbaa !5
  %vfn.i.i.i.i.i.i = getelementptr inbounds i1 (%"struct.boost::exception_detail::error_info_container"*)** %vtable.i.i.i.i.i.i, i32 4
  %3 = load i1 (%"struct.boost::exception_detail::error_info_container"*)** %vfn.i.i.i.i.i.i, align 4
  %call.i.i.i2.i.i.i = invoke zeroext i1 %3(%"struct.boost::exception_detail::error_info_container"* %1)
          to label %call.i.i.i.noexc.i.i.i unwind label %lpad.i.i.i

call.i.i.i.noexc.i.i.i:                           ; preds = %land.lhs.true.i.i.i.i.i.i
  br i1 %call.i.i.i2.i.i.i, label %if.then.i.i.i.i.i.i, label %_ZN5boost16exception_detail19error_info_injectorISt12out_of_rangeED1Ev.exit

if.then.i.i.i.i.i.i:                              ; preds = %call.i.i.i.noexc.i.i.i
  store %"struct.boost::exception_detail::error_info_container"* null, %"struct.boost::exception_detail::error_info_container"** %px_.i.i.i.i.i.i, align 4, !tbaa !3
  br label %_ZN5boost16exception_detail19error_info_injectorISt12out_of_rangeED1Ev.exit

lpad.i.i.i:                                       ; preds = %land.lhs.true.i.i.i.i.i.i
  %4 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          filter [0 x i8*] zeroinitializer
  %5 = extractvalue { i8*, i32 } %4, 0
  tail call void @__cxa_call_unexpected(i8* %5) noreturn nounwind
  unreachable

_ZN5boost16exception_detail19error_info_injectorISt12out_of_rangeED1Ev.exit: ; preds = %entry, %call.i.i.i.noexc.i.i.i, %if.then.i.i.i.i.i.i
  %6 = getelementptr inbounds %"struct.boost::exception_detail::error_info_injector"* %this, i32 0, i32 0
  tail call void @_ZNSt12out_of_rangeD2Ev(%"class.std::out_of_range"* %6) nounwind
  %7 = bitcast %"struct.boost::exception_detail::error_info_injector"* %this to i8*
  tail call void @_ZdlPv(i8* %7) nounwind
  ret void
}

define linkonce_odr void @_ZThn8_N5boost16exception_detail19error_info_injectorISt12out_of_rangeED0Ev(%"struct.boost::exception_detail::error_info_injector"* %this) unnamed_addr nounwind align 2 {
entry:
  %0 = getelementptr inbounds %"struct.boost::exception_detail::error_info_injector"* %this, i32 -1, i32 1, i32 3
  %1 = getelementptr inbounds i8** %0, i32 2
  store i8* bitcast (i8** getelementptr inbounds ([4 x i8*]* @_ZTVN5boost9exceptionE, i32 0, i32 2) to i8*), i8** %1, align 4, !tbaa !5
  %px_.i.i.i.i.i.i.i = getelementptr inbounds i8** %0, i32 3
  %2 = load i8** %px_.i.i.i.i.i.i.i, align 4
  %tobool.i.i.i.i.i.i.i = icmp eq i8* %2, null
  br i1 %tobool.i.i.i.i.i.i.i, label %_ZN5boost16exception_detail19error_info_injectorISt12out_of_rangeED0Ev.exit, label %land.lhs.true.i.i.i.i.i.i.i

land.lhs.true.i.i.i.i.i.i.i:                      ; preds = %entry
  %3 = bitcast i8* %2 to %"struct.boost::exception_detail::error_info_container"*
  %4 = bitcast i8* %2 to i1 (%"struct.boost::exception_detail::error_info_container"*)***
  %vtable.i.i.i.i.i.i.i = load i1 (%"struct.boost::exception_detail::error_info_container"*)*** %4, align 4, !tbaa !5
  %vfn.i.i.i.i.i.i.i = getelementptr inbounds i1 (%"struct.boost::exception_detail::error_info_container"*)** %vtable.i.i.i.i.i.i.i, i32 4
  %5 = load i1 (%"struct.boost::exception_detail::error_info_container"*)** %vfn.i.i.i.i.i.i.i, align 4
  %call.i.i.i2.i.i.i.i = invoke zeroext i1 %5(%"struct.boost::exception_detail::error_info_container"* %3)
          to label %call.i.i.i.noexc.i.i.i.i unwind label %lpad.i.i.i.i

call.i.i.i.noexc.i.i.i.i:                         ; preds = %land.lhs.true.i.i.i.i.i.i.i
  br i1 %call.i.i.i2.i.i.i.i, label %if.then.i.i.i.i.i.i.i, label %_ZN5boost16exception_detail19error_info_injectorISt12out_of_rangeED0Ev.exit

if.then.i.i.i.i.i.i.i:                            ; preds = %call.i.i.i.noexc.i.i.i.i
  store i8* null, i8** %px_.i.i.i.i.i.i.i, align 4, !tbaa !3
  br label %_ZN5boost16exception_detail19error_info_injectorISt12out_of_rangeED0Ev.exit

lpad.i.i.i.i:                                     ; preds = %land.lhs.true.i.i.i.i.i.i.i
  %6 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          filter [0 x i8*] zeroinitializer
  %7 = extractvalue { i8*, i32 } %6, 0
  tail call void @__cxa_call_unexpected(i8* %7) noreturn nounwind
  unreachable

_ZN5boost16exception_detail19error_info_injectorISt12out_of_rangeED0Ev.exit: ; preds = %entry, %call.i.i.i.noexc.i.i.i.i, %if.then.i.i.i.i.i.i.i
  %8 = bitcast i8** %0 to %"class.std::out_of_range"*
  tail call void @_ZNSt12out_of_rangeD2Ev(%"class.std::out_of_range"* %8) nounwind
  %9 = bitcast i8** %0 to i8*
  tail call void @_ZdlPv(i8* %9) nounwind
  ret void
}

declare void @_ZNSt12out_of_rangeD0Ev(%"class.std::out_of_range"*) nounwind

declare void @_ZNSsC1ERKSs(%"class.std::basic_string"*, %"class.std::basic_string"*)

declare void @_ZNSt9exceptionD2Ev(%"class.std::exception"*) nounwind

declare void @_ZNSt11logic_errorD1Ev(%"class.std::logic_error"*) nounwind

declare void @_ZNSt11logic_errorD0Ev(%"class.std::logic_error"*) nounwind

define linkonce_odr void @_ZN5boost16exception_detail10clone_baseD1Ev(%"class.boost::exception_detail::clone_base"* nocapture %this) unnamed_addr nounwind readnone align 2 {
entry:
  ret void
}

define linkonce_odr void @_ZN5boost16exception_detail10clone_baseD0Ev(%"class.boost::exception_detail::clone_base"* %this) unnamed_addr nounwind align 2 {
entry:
  %0 = bitcast %"class.boost::exception_detail::clone_base"* %this to i8*
  tail call void @_ZdlPv(i8* %0) nounwind
  ret void
}

declare noalias i8* @_Znwj(i32)

define linkonce_odr void @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorISt12out_of_rangeEEEC1ERKS5_NS5_9clone_tagE(%"class.boost::exception_detail::clone_impl"* %this, %"class.boost::exception_detail::clone_impl"* %x) unnamed_addr align 2 {
entry:
  %0 = getelementptr inbounds %"class.boost::exception_detail::clone_impl"* %this, i32 0, i32 1, i32 0
  store i32 (...)** bitcast (i8** getelementptr inbounds ([6 x i8*]* @_ZTVN5boost16exception_detail10clone_baseE, i32 0, i32 2) to i32 (...)**), i32 (...)*** %0, align 4, !tbaa !5
  %1 = getelementptr inbounds %"class.boost::exception_detail::clone_impl"* %this, i32 0, i32 0, i32 0
  %2 = getelementptr inbounds %"class.boost::exception_detail::clone_impl"* %this, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0
  store i32 (...)** bitcast (i8** getelementptr inbounds ([5 x i8*]* @_ZTVSt11logic_error, i32 0, i32 2) to i32 (...)**), i32 (...)*** %2, align 4, !tbaa !5
  %_M_msg.i.i.i = getelementptr inbounds %"class.boost::exception_detail::clone_impl"* %this, i32 0, i32 0, i32 0, i32 0, i32 1
  %_M_msg2.i.i.i = getelementptr inbounds %"class.boost::exception_detail::clone_impl"* %x, i32 0, i32 0, i32 0, i32 0, i32 1
  invoke void @_ZNSsC1ERKSs(%"class.std::basic_string"* %_M_msg.i.i.i, %"class.std::basic_string"* %_M_msg2.i.i.i)
          to label %_ZNSt12out_of_rangeC2ERKS_.exit.i unwind label %lpad.i.i.i

lpad.i.i.i:                                       ; preds = %entry
  %3 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %4 = getelementptr inbounds %"class.boost::exception_detail::clone_impl"* %this, i32 0, i32 0, i32 0, i32 0, i32 0
  tail call void @_ZNSt9exceptionD2Ev(%"class.std::exception"* %4) nounwind
  br label %lpad.body

_ZNSt12out_of_rangeC2ERKS_.exit.i:                ; preds = %entry
  store i32 (...)** bitcast (i8** getelementptr inbounds ([5 x i8*]* @_ZTVSt12out_of_range, i32 0, i32 2) to i32 (...)**), i32 (...)*** %2, align 4, !tbaa !5
  %5 = getelementptr inbounds %"class.boost::exception_detail::clone_impl"* %this, i32 0, i32 0, i32 1, i32 0
  store i32 (...)** bitcast (i8** getelementptr inbounds ([4 x i8*]* @_ZTVN5boost9exceptionE, i32 0, i32 2) to i32 (...)**), i32 (...)*** %5, align 4, !tbaa !5
  %px_.i.i.i.i = getelementptr inbounds %"class.boost::exception_detail::clone_impl"* %this, i32 0, i32 0, i32 1, i32 1, i32 0
  %px_2.i.i.i.i = getelementptr inbounds %"class.boost::exception_detail::clone_impl"* %x, i32 0, i32 0, i32 1, i32 1, i32 0
  %6 = load %"struct.boost::exception_detail::error_info_container"** %px_2.i.i.i.i, align 4, !tbaa !3
  store %"struct.boost::exception_detail::error_info_container"* %6, %"struct.boost::exception_detail::error_info_container"** %px_.i.i.i.i, align 4, !tbaa !3
  %tobool.i.i.i.i.i9 = icmp eq %"struct.boost::exception_detail::error_info_container"* %6, null
  br i1 %tobool.i.i.i.i.i9, label %invoke.cont, label %if.then.i.i.i.i.i12

if.then.i.i.i.i.i12:                              ; preds = %_ZNSt12out_of_rangeC2ERKS_.exit.i
  %7 = bitcast %"struct.boost::exception_detail::error_info_container"* %6 to void (%"struct.boost::exception_detail::error_info_container"*)***
  %vtable.i.i.i.i.i10 = load void (%"struct.boost::exception_detail::error_info_container"*)*** %7, align 4, !tbaa !5
  %vfn.i.i.i.i.i11 = getelementptr inbounds void (%"struct.boost::exception_detail::error_info_container"*)** %vtable.i.i.i.i.i10, i32 3
  %8 = load void (%"struct.boost::exception_detail::error_info_container"*)** %vfn.i.i.i.i.i11, align 4
  invoke void %8(%"struct.boost::exception_detail::error_info_container"* %6)
          to label %invoke.cont unwind label %lpad.i

lpad.i:                                           ; preds = %if.then.i.i.i.i.i12
  %9 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  tail call void @_ZNSt12out_of_rangeD2Ev(%"class.std::out_of_range"* %1) nounwind
  br label %lpad.body

invoke.cont:                                      ; preds = %if.then.i.i.i.i.i12, %_ZNSt12out_of_rangeC2ERKS_.exit.i
  %throw_function_.i.i = getelementptr inbounds %"class.boost::exception_detail::clone_impl"* %this, i32 0, i32 0, i32 1, i32 2
  %throw_function_3.i.i = getelementptr inbounds %"class.boost::exception_detail::clone_impl"* %x, i32 0, i32 0, i32 1, i32 2
  %10 = load i8** %throw_function_3.i.i, align 4, !tbaa !3
  store i8* %10, i8** %throw_function_.i.i, align 4, !tbaa !3
  %throw_file_.i.i = getelementptr inbounds %"class.boost::exception_detail::clone_impl"* %this, i32 0, i32 0, i32 1, i32 3
  %throw_file_4.i.i = getelementptr inbounds %"class.boost::exception_detail::clone_impl"* %x, i32 0, i32 0, i32 1, i32 3
  %11 = load i8** %throw_file_4.i.i, align 4, !tbaa !3
  store i8* %11, i8** %throw_file_.i.i, align 4, !tbaa !3
  %throw_line_.i.i = getelementptr inbounds %"class.boost::exception_detail::clone_impl"* %this, i32 0, i32 0, i32 1, i32 4
  %throw_line_5.i.i = getelementptr inbounds %"class.boost::exception_detail::clone_impl"* %x, i32 0, i32 0, i32 1, i32 4
  %12 = load i32* %throw_line_5.i.i, align 4, !tbaa !0
  store i32 %12, i32* %throw_line_.i.i, align 4, !tbaa !0
  store i32 (...)** bitcast (i8** getelementptr inbounds ([21 x i8*]* @_ZTVN5boost16exception_detail10clone_implINS0_19error_info_injectorISt12out_of_rangeEEEE, i32 0, i32 3) to i32 (...)**), i32 (...)*** %2, align 4, !tbaa !5
  %add.ptr = getelementptr inbounds %"class.boost::exception_detail::clone_impl"* %this, i32 0, i32 0, i32 1
  %13 = getelementptr inbounds %"class.boost::exception"* %add.ptr, i32 0, i32 0
  store i32 (...)** bitcast (i8** getelementptr inbounds ([21 x i8*]* @_ZTVN5boost16exception_detail10clone_implINS0_19error_info_injectorISt12out_of_rangeEEEE, i32 0, i32 10) to i32 (...)**), i32 (...)*** %13, align 4, !tbaa !5
  store i32 (...)** bitcast (i8** getelementptr inbounds ([21 x i8*]* @_ZTVN5boost16exception_detail10clone_implINS0_19error_info_injectorISt12out_of_rangeEEEE, i32 0, i32 17) to i32 (...)**), i32 (...)*** %0, align 4, !tbaa !5
  %14 = icmp eq %"class.boost::exception_detail::clone_impl"* %x, null
  %add.ptr4 = getelementptr inbounds %"class.boost::exception_detail::clone_impl"* %x, i32 0, i32 0, i32 1
  %.add.ptr4 = select i1 %14, %"class.boost::exception"* null, %"class.boost::exception"* %add.ptr4
  invoke void @_ZN5boost16exception_detail20copy_boost_exceptionEPNS_9exceptionEPKS1_(%"class.boost::exception"* %add.ptr, %"class.boost::exception"* %.add.ptr4)
          to label %invoke.cont6 unwind label %lpad5

invoke.cont6:                                     ; preds = %invoke.cont
  ret void

lpad.body:                                        ; preds = %lpad.i, %lpad.i.i.i
  %eh.lpad-body = phi { i8*, i32 } [ %3, %lpad.i.i.i ], [ %9, %lpad.i ]
  %15 = extractvalue { i8*, i32 } %eh.lpad-body, 0
  %16 = extractvalue { i8*, i32 } %eh.lpad-body, 1
  br label %ehcleanup

lpad5:                                            ; preds = %invoke.cont
  %17 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %18 = extractvalue { i8*, i32 } %17, 0
  %19 = extractvalue { i8*, i32 } %17, 1
  store i32 (...)** bitcast (i8** getelementptr inbounds ([4 x i8*]* @_ZTVN5boost9exceptionE, i32 0, i32 2) to i32 (...)**), i32 (...)*** %5, align 4, !tbaa !5
  %20 = load %"struct.boost::exception_detail::error_info_container"** %px_.i.i.i.i, align 4, !tbaa !3
  %tobool.i.i.i.i.i = icmp eq %"struct.boost::exception_detail::error_info_container"* %20, null
  br i1 %tobool.i.i.i.i.i, label %_ZN5boost16exception_detail19error_info_injectorISt12out_of_rangeED2Ev.exit, label %land.lhs.true.i.i.i.i.i

land.lhs.true.i.i.i.i.i:                          ; preds = %lpad5
  %21 = bitcast %"struct.boost::exception_detail::error_info_container"* %20 to i1 (%"struct.boost::exception_detail::error_info_container"*)***
  %vtable.i.i.i.i.i = load i1 (%"struct.boost::exception_detail::error_info_container"*)*** %21, align 4, !tbaa !5
  %vfn.i.i.i.i.i = getelementptr inbounds i1 (%"struct.boost::exception_detail::error_info_container"*)** %vtable.i.i.i.i.i, i32 4
  %22 = load i1 (%"struct.boost::exception_detail::error_info_container"*)** %vfn.i.i.i.i.i, align 4
  %call.i.i.i2.i.i = invoke zeroext i1 %22(%"struct.boost::exception_detail::error_info_container"* %20)
          to label %call.i.i.i.noexc.i.i unwind label %lpad.i.i

call.i.i.i.noexc.i.i:                             ; preds = %land.lhs.true.i.i.i.i.i
  br i1 %call.i.i.i2.i.i, label %if.then.i.i.i.i.i, label %_ZN5boost16exception_detail19error_info_injectorISt12out_of_rangeED2Ev.exit

if.then.i.i.i.i.i:                                ; preds = %call.i.i.i.noexc.i.i
  store %"struct.boost::exception_detail::error_info_container"* null, %"struct.boost::exception_detail::error_info_container"** %px_.i.i.i.i, align 4, !tbaa !3
  br label %_ZN5boost16exception_detail19error_info_injectorISt12out_of_rangeED2Ev.exit

lpad.i.i:                                         ; preds = %land.lhs.true.i.i.i.i.i
  %23 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          filter [0 x i8*] zeroinitializer
  %24 = extractvalue { i8*, i32 } %23, 0
  tail call void @__cxa_call_unexpected(i8* %24) noreturn nounwind
  unreachable

_ZN5boost16exception_detail19error_info_injectorISt12out_of_rangeED2Ev.exit: ; preds = %lpad5, %call.i.i.i.noexc.i.i, %if.then.i.i.i.i.i
  tail call void @_ZNSt12out_of_rangeD2Ev(%"class.std::out_of_range"* %1) nounwind
  br label %ehcleanup

ehcleanup:                                        ; preds = %_ZN5boost16exception_detail19error_info_injectorISt12out_of_rangeED2Ev.exit, %lpad.body
  %exn.slot.0 = phi i8* [ %18, %_ZN5boost16exception_detail19error_info_injectorISt12out_of_rangeED2Ev.exit ], [ %15, %lpad.body ]
  %ehselector.slot.0 = phi i32 [ %19, %_ZN5boost16exception_detail19error_info_injectorISt12out_of_rangeED2Ev.exit ], [ %16, %lpad.body ]
  %lpad.val = insertvalue { i8*, i32 } undef, i8* %exn.slot.0, 0
  %lpad.val7 = insertvalue { i8*, i32 } %lpad.val, i32 %ehselector.slot.0, 1
  resume { i8*, i32 } %lpad.val7
}

define linkonce_odr void @_ZN5boost16exception_detail20copy_boost_exceptionEPNS_9exceptionEPKS1_(%"class.boost::exception"* nocapture %a, %"class.boost::exception"* nocapture %b) inlinehint {
entry:
  %ref.tmp = alloca %"class.boost::exception_detail::refcount_ptr", align 4
  %px_.i = getelementptr inbounds %"class.boost::exception"* %b, i32 0, i32 1, i32 0
  %0 = load %"struct.boost::exception_detail::error_info_container"** %px_.i, align 4, !tbaa !3
  %tobool = icmp eq %"struct.boost::exception_detail::error_info_container"* %0, null
  br i1 %tobool, label %if.end, label %if.then

if.then:                                          ; preds = %entry
  %1 = bitcast %"struct.boost::exception_detail::error_info_container"* %0 to void (%"class.boost::exception_detail::refcount_ptr"*, %"struct.boost::exception_detail::error_info_container"*)***
  %vtable = load void (%"class.boost::exception_detail::refcount_ptr"*, %"struct.boost::exception_detail::error_info_container"*)*** %1, align 4, !tbaa !5
  %vfn = getelementptr inbounds void (%"class.boost::exception_detail::refcount_ptr"*, %"struct.boost::exception_detail::error_info_container"*)** %vtable, i32 5
  %2 = load void (%"class.boost::exception_detail::refcount_ptr"*, %"struct.boost::exception_detail::error_info_container"*)** %vfn, align 4
  invoke void %2(%"class.boost::exception_detail::refcount_ptr"* sret %ref.tmp, %"struct.boost::exception_detail::error_info_container"* %0)
          to label %_ZN5boost16exception_detail12refcount_ptrINS0_20error_info_containerEE7releaseEv.exit.i.i unwind label %lpad

_ZN5boost16exception_detail12refcount_ptrINS0_20error_info_containerEE7releaseEv.exit.i.i: ; preds = %if.then
  %px_.i30 = getelementptr inbounds %"class.boost::exception_detail::refcount_ptr"* %ref.tmp, i32 0, i32 0
  %3 = load %"struct.boost::exception_detail::error_info_container"** %px_.i30, align 4, !tbaa !3
  %tobool.i3.i.i = icmp eq %"struct.boost::exception_detail::error_info_container"* %3, null
  br i1 %tobool.i3.i.i, label %if.end, label %if.then.i6.i.i

if.then.i6.i.i:                                   ; preds = %_ZN5boost16exception_detail12refcount_ptrINS0_20error_info_containerEE7releaseEv.exit.i.i
  %4 = bitcast %"struct.boost::exception_detail::error_info_container"* %3 to void (%"struct.boost::exception_detail::error_info_container"*)***
  %vtable.i4.i.i = load void (%"struct.boost::exception_detail::error_info_container"*)*** %4, align 4, !tbaa !5
  %vfn.i5.i.i = getelementptr inbounds void (%"struct.boost::exception_detail::error_info_container"*)** %vtable.i4.i.i, i32 3
  %5 = load void (%"struct.boost::exception_detail::error_info_container"*)** %vfn.i5.i.i, align 4
  invoke void %5(%"struct.boost::exception_detail::error_info_container"* %3)
          to label %invoke.cont3 unwind label %lpad2

invoke.cont3:                                     ; preds = %if.then.i6.i.i
  %.pr = load %"struct.boost::exception_detail::error_info_container"** %px_.i30, align 4, !tbaa !3
  %tobool.i.i.i40 = icmp eq %"struct.boost::exception_detail::error_info_container"* %.pr, null
  br i1 %tobool.i.i.i40, label %if.end, label %land.lhs.true.i.i.i44

land.lhs.true.i.i.i44:                            ; preds = %invoke.cont3
  %6 = bitcast %"struct.boost::exception_detail::error_info_container"* %.pr to i1 (%"struct.boost::exception_detail::error_info_container"*)***
  %vtable.i.i.i41 = load i1 (%"struct.boost::exception_detail::error_info_container"*)*** %6, align 4, !tbaa !5
  %vfn.i.i.i42 = getelementptr inbounds i1 (%"struct.boost::exception_detail::error_info_container"*)** %vtable.i.i.i41, i32 4
  %7 = load i1 (%"struct.boost::exception_detail::error_info_container"*)** %vfn.i.i.i42, align 4
  %call.i.i.i4346 = invoke zeroext i1 %7(%"struct.boost::exception_detail::error_info_container"* %.pr)
          to label %call.i.i.i43.noexc unwind label %lpad

call.i.i.i43.noexc:                               ; preds = %land.lhs.true.i.i.i44
  br i1 %call.i.i.i4346, label %if.then.i.i.i45, label %if.end

if.then.i.i.i45:                                  ; preds = %call.i.i.i43.noexc
  store %"struct.boost::exception_detail::error_info_container"* null, %"struct.boost::exception_detail::error_info_container"** %px_.i30, align 4, !tbaa !3
  br label %if.end

lpad:                                             ; preds = %if.then.i6.i.i69, %land.lhs.true.i.i.i63, %land.lhs.true.i.i.i44, %if.then
  %8 = phi %"struct.boost::exception_detail::error_info_container"* [ %18, %if.then.i6.i.i69 ], [ %18, %land.lhs.true.i.i.i63 ], [ %3, %land.lhs.true.i.i.i44 ], [ null, %if.then ]
  %9 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %10 = extractvalue { i8*, i32 } %9, 0
  %11 = extractvalue { i8*, i32 } %9, 1
  br label %ehcleanup

lpad2:                                            ; preds = %if.then.i6.i.i
  %12 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %13 = extractvalue { i8*, i32 } %12, 0
  %14 = extractvalue { i8*, i32 } %12, 1
  %15 = load %"struct.boost::exception_detail::error_info_container"** %px_.i30, align 4, !tbaa !3
  %tobool.i.i.i49 = icmp eq %"struct.boost::exception_detail::error_info_container"* %15, null
  br i1 %tobool.i.i.i49, label %land.lhs.true.i.i.i, label %land.lhs.true.i.i.i53

land.lhs.true.i.i.i53:                            ; preds = %lpad2
  %16 = bitcast %"struct.boost::exception_detail::error_info_container"* %15 to i1 (%"struct.boost::exception_detail::error_info_container"*)***
  %vtable.i.i.i50 = load i1 (%"struct.boost::exception_detail::error_info_container"*)*** %16, align 4, !tbaa !5
  %vfn.i.i.i51 = getelementptr inbounds i1 (%"struct.boost::exception_detail::error_info_container"*)** %vtable.i.i.i50, i32 4
  %17 = load i1 (%"struct.boost::exception_detail::error_info_container"*)** %vfn.i.i.i51, align 4
  %call.i.i.i5255 = invoke zeroext i1 %17(%"struct.boost::exception_detail::error_info_container"* %15)
          to label %call.i.i.i52.noexc unwind label %terminate.lpad

call.i.i.i52.noexc:                               ; preds = %land.lhs.true.i.i.i53
  br i1 %call.i.i.i5255, label %if.then.i.i.i54, label %ehcleanup

if.then.i.i.i54:                                  ; preds = %call.i.i.i52.noexc
  store %"struct.boost::exception_detail::error_info_container"* null, %"struct.boost::exception_detail::error_info_container"** %px_.i30, align 4, !tbaa !3
  br label %ehcleanup

if.end:                                           ; preds = %_ZN5boost16exception_detail12refcount_ptrINS0_20error_info_containerEE7releaseEv.exit.i.i, %if.then.i.i.i45, %call.i.i.i43.noexc, %invoke.cont3, %entry
  %18 = phi %"struct.boost::exception_detail::error_info_container"* [ null, %entry ], [ %3, %invoke.cont3 ], [ %3, %call.i.i.i43.noexc ], [ %3, %if.then.i.i.i45 ], [ null, %_ZN5boost16exception_detail12refcount_ptrINS0_20error_info_containerEE7releaseEv.exit.i.i ]
  %throw_file_ = getelementptr inbounds %"class.boost::exception"* %b, i32 0, i32 3
  %19 = load i8** %throw_file_, align 4, !tbaa !3
  %throw_file_7 = getelementptr inbounds %"class.boost::exception"* %a, i32 0, i32 3
  store i8* %19, i8** %throw_file_7, align 4, !tbaa !3
  %throw_line_ = getelementptr inbounds %"class.boost::exception"* %b, i32 0, i32 4
  %20 = load i32* %throw_line_, align 4, !tbaa !0
  %throw_line_8 = getelementptr inbounds %"class.boost::exception"* %a, i32 0, i32 4
  store i32 %20, i32* %throw_line_8, align 4, !tbaa !0
  %throw_function_ = getelementptr inbounds %"class.boost::exception"* %b, i32 0, i32 2
  %21 = load i8** %throw_function_, align 4, !tbaa !3
  %throw_function_9 = getelementptr inbounds %"class.boost::exception"* %a, i32 0, i32 2
  store i8* %21, i8** %throw_function_9, align 4, !tbaa !3
  %px_.i.i.i58 = getelementptr inbounds %"class.boost::exception"* %a, i32 0, i32 1, i32 0
  %22 = load %"struct.boost::exception_detail::error_info_container"** %px_.i.i.i58, align 4, !tbaa !3
  %tobool.i.i.i59 = icmp eq %"struct.boost::exception_detail::error_info_container"* %22, null
  br i1 %tobool.i.i.i59, label %_ZN5boost16exception_detail12refcount_ptrINS0_20error_info_containerEE7releaseEv.exit.i.i66, label %land.lhs.true.i.i.i63

land.lhs.true.i.i.i63:                            ; preds = %if.end
  %23 = bitcast %"struct.boost::exception_detail::error_info_container"* %22 to i1 (%"struct.boost::exception_detail::error_info_container"*)***
  %vtable.i.i.i60 = load i1 (%"struct.boost::exception_detail::error_info_container"*)*** %23, align 4, !tbaa !5
  %vfn.i.i.i61 = getelementptr inbounds i1 (%"struct.boost::exception_detail::error_info_container"*)** %vtable.i.i.i60, i32 4
  %24 = load i1 (%"struct.boost::exception_detail::error_info_container"*)** %vfn.i.i.i61, align 4
  %call.i.i.i6270 = invoke zeroext i1 %24(%"struct.boost::exception_detail::error_info_container"* %22)
          to label %call.i.i.i62.noexc unwind label %lpad

call.i.i.i62.noexc:                               ; preds = %land.lhs.true.i.i.i63
  br i1 %call.i.i.i6270, label %if.then.i.i.i64, label %_ZN5boost16exception_detail12refcount_ptrINS0_20error_info_containerEE7releaseEv.exit.i.i66

if.then.i.i.i64:                                  ; preds = %call.i.i.i62.noexc
  store %"struct.boost::exception_detail::error_info_container"* null, %"struct.boost::exception_detail::error_info_container"** %px_.i.i.i58, align 4, !tbaa !3
  br label %_ZN5boost16exception_detail12refcount_ptrINS0_20error_info_containerEE7releaseEv.exit.i.i66

_ZN5boost16exception_detail12refcount_ptrINS0_20error_info_containerEE7releaseEv.exit.i.i66: ; preds = %if.then.i.i.i64, %call.i.i.i62.noexc, %if.end
  store %"struct.boost::exception_detail::error_info_container"* %18, %"struct.boost::exception_detail::error_info_container"** %px_.i.i.i58, align 4, !tbaa !3
  %tobool.i3.i.i65 = icmp eq %"struct.boost::exception_detail::error_info_container"* %18, null
  br i1 %tobool.i3.i.i65, label %_ZN5boost16exception_detail12refcount_ptrINS0_20error_info_containerEED1Ev.exit29, label %if.then.i6.i.i69

if.then.i6.i.i69:                                 ; preds = %_ZN5boost16exception_detail12refcount_ptrINS0_20error_info_containerEE7releaseEv.exit.i.i66
  %25 = bitcast %"struct.boost::exception_detail::error_info_container"* %18 to void (%"struct.boost::exception_detail::error_info_container"*)***
  %vtable.i4.i.i67 = load void (%"struct.boost::exception_detail::error_info_container"*)*** %25, align 4, !tbaa !5
  %vfn.i5.i.i68 = getelementptr inbounds void (%"struct.boost::exception_detail::error_info_container"*)** %vtable.i4.i.i67, i32 3
  %26 = load void (%"struct.boost::exception_detail::error_info_container"*)** %vfn.i5.i.i68, align 4
  invoke void %26(%"struct.boost::exception_detail::error_info_container"* %18)
          to label %land.lhs.true.i.i.i27 unwind label %lpad

land.lhs.true.i.i.i27:                            ; preds = %if.then.i6.i.i69
  %27 = bitcast %"struct.boost::exception_detail::error_info_container"* %18 to i1 (%"struct.boost::exception_detail::error_info_container"*)***
  %vtable.i.i.i25 = load i1 (%"struct.boost::exception_detail::error_info_container"*)*** %27, align 4, !tbaa !5
  %vfn.i.i.i26 = getelementptr inbounds i1 (%"struct.boost::exception_detail::error_info_container"*)** %vtable.i.i.i25, i32 4
  %28 = load i1 (%"struct.boost::exception_detail::error_info_container"*)** %vfn.i.i.i26, align 4
  %call.i.i.i = call zeroext i1 %28(%"struct.boost::exception_detail::error_info_container"* %18)
  br label %_ZN5boost16exception_detail12refcount_ptrINS0_20error_info_containerEED1Ev.exit29

_ZN5boost16exception_detail12refcount_ptrINS0_20error_info_containerEED1Ev.exit29: ; preds = %land.lhs.true.i.i.i27, %_ZN5boost16exception_detail12refcount_ptrINS0_20error_info_containerEE7releaseEv.exit.i.i66
  ret void

ehcleanup:                                        ; preds = %if.then.i.i.i54, %call.i.i.i52.noexc, %lpad
  %29 = phi %"struct.boost::exception_detail::error_info_container"* [ %8, %lpad ], [ %3, %call.i.i.i52.noexc ], [ %3, %if.then.i.i.i54 ]
  %exn.slot.0 = phi i8* [ %10, %lpad ], [ %13, %call.i.i.i52.noexc ], [ %13, %if.then.i.i.i54 ]
  %ehselector.slot.0 = phi i32 [ %11, %lpad ], [ %14, %call.i.i.i52.noexc ], [ %14, %if.then.i.i.i54 ]
  %tobool.i.i.i = icmp eq %"struct.boost::exception_detail::error_info_container"* %29, null
  br i1 %tobool.i.i.i, label %eh.resume, label %land.lhs.true.i.i.i

land.lhs.true.i.i.i:                              ; preds = %lpad2, %ehcleanup
  %ehselector.slot.080 = phi i32 [ %ehselector.slot.0, %ehcleanup ], [ %14, %lpad2 ]
  %exn.slot.078 = phi i8* [ %exn.slot.0, %ehcleanup ], [ %13, %lpad2 ]
  %30 = phi %"struct.boost::exception_detail::error_info_container"* [ %29, %ehcleanup ], [ %3, %lpad2 ]
  %31 = bitcast %"struct.boost::exception_detail::error_info_container"* %30 to i1 (%"struct.boost::exception_detail::error_info_container"*)***
  %vtable.i.i.i = load i1 (%"struct.boost::exception_detail::error_info_container"*)*** %31, align 4, !tbaa !5
  %vfn.i.i.i = getelementptr inbounds i1 (%"struct.boost::exception_detail::error_info_container"*)** %vtable.i.i.i, i32 4
  %32 = load i1 (%"struct.boost::exception_detail::error_info_container"*)** %vfn.i.i.i, align 4
  %call.i.i.i22 = invoke zeroext i1 %32(%"struct.boost::exception_detail::error_info_container"* %30)
          to label %eh.resume unwind label %terminate.lpad

eh.resume:                                        ; preds = %land.lhs.true.i.i.i, %ehcleanup
  %ehselector.slot.081 = phi i32 [ %ehselector.slot.0, %ehcleanup ], [ %ehselector.slot.080, %land.lhs.true.i.i.i ]
  %exn.slot.079 = phi i8* [ %exn.slot.0, %ehcleanup ], [ %exn.slot.078, %land.lhs.true.i.i.i ]
  %lpad.val = insertvalue { i8*, i32 } undef, i8* %exn.slot.079, 0
  %lpad.val14 = insertvalue { i8*, i32 } %lpad.val, i32 %ehselector.slot.081, 1
  resume { i8*, i32 } %lpad.val14

terminate.lpad:                                   ; preds = %land.lhs.true.i.i.i53, %land.lhs.true.i.i.i
  %33 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          catch i8* null
  call void @_ZSt9terminatev() noreturn nounwind
  unreachable
}

define linkonce_odr void @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorISt12out_of_rangeEEEC1ERKS4_(%"class.boost::exception_detail::clone_impl"* %this, %"struct.boost::exception_detail::error_info_injector"* %x) unnamed_addr align 2 {
entry:
  %0 = getelementptr inbounds %"class.boost::exception_detail::clone_impl"* %this, i32 0, i32 1, i32 0
  store i32 (...)** bitcast (i8** getelementptr inbounds ([6 x i8*]* @_ZTVN5boost16exception_detail10clone_baseE, i32 0, i32 2) to i32 (...)**), i32 (...)*** %0, align 4, !tbaa !5
  %1 = getelementptr inbounds %"class.boost::exception_detail::clone_impl"* %this, i32 0, i32 0, i32 0
  %2 = getelementptr inbounds %"class.boost::exception_detail::clone_impl"* %this, i32 0, i32 0, i32 0, i32 0, i32 0, i32 0
  store i32 (...)** bitcast (i8** getelementptr inbounds ([5 x i8*]* @_ZTVSt11logic_error, i32 0, i32 2) to i32 (...)**), i32 (...)*** %2, align 4, !tbaa !5
  %_M_msg.i.i.i = getelementptr inbounds %"class.boost::exception_detail::clone_impl"* %this, i32 0, i32 0, i32 0, i32 0, i32 1
  %_M_msg2.i.i.i = getelementptr inbounds %"struct.boost::exception_detail::error_info_injector"* %x, i32 0, i32 0, i32 0, i32 1
  invoke void @_ZNSsC1ERKSs(%"class.std::basic_string"* %_M_msg.i.i.i, %"class.std::basic_string"* %_M_msg2.i.i.i)
          to label %_ZNSt12out_of_rangeC2ERKS_.exit.i unwind label %lpad.i.i.i

lpad.i.i.i:                                       ; preds = %entry
  %3 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %4 = getelementptr inbounds %"class.boost::exception_detail::clone_impl"* %this, i32 0, i32 0, i32 0, i32 0, i32 0
  tail call void @_ZNSt9exceptionD2Ev(%"class.std::exception"* %4) nounwind
  br label %lpad.body

_ZNSt12out_of_rangeC2ERKS_.exit.i:                ; preds = %entry
  store i32 (...)** bitcast (i8** getelementptr inbounds ([5 x i8*]* @_ZTVSt12out_of_range, i32 0, i32 2) to i32 (...)**), i32 (...)*** %2, align 4, !tbaa !5
  %5 = getelementptr inbounds %"class.boost::exception_detail::clone_impl"* %this, i32 0, i32 0, i32 1, i32 0
  store i32 (...)** bitcast (i8** getelementptr inbounds ([4 x i8*]* @_ZTVN5boost9exceptionE, i32 0, i32 2) to i32 (...)**), i32 (...)*** %5, align 4, !tbaa !5
  %px_.i.i.i.i = getelementptr inbounds %"class.boost::exception_detail::clone_impl"* %this, i32 0, i32 0, i32 1, i32 1, i32 0
  %px_2.i.i.i.i = getelementptr inbounds %"struct.boost::exception_detail::error_info_injector"* %x, i32 0, i32 1, i32 1, i32 0
  %6 = load %"struct.boost::exception_detail::error_info_container"** %px_2.i.i.i.i, align 4, !tbaa !3
  store %"struct.boost::exception_detail::error_info_container"* %6, %"struct.boost::exception_detail::error_info_container"** %px_.i.i.i.i, align 4, !tbaa !3
  %tobool.i.i.i.i.i9 = icmp eq %"struct.boost::exception_detail::error_info_container"* %6, null
  br i1 %tobool.i.i.i.i.i9, label %invoke.cont, label %if.then.i.i.i.i.i12

if.then.i.i.i.i.i12:                              ; preds = %_ZNSt12out_of_rangeC2ERKS_.exit.i
  %7 = bitcast %"struct.boost::exception_detail::error_info_container"* %6 to void (%"struct.boost::exception_detail::error_info_container"*)***
  %vtable.i.i.i.i.i10 = load void (%"struct.boost::exception_detail::error_info_container"*)*** %7, align 4, !tbaa !5
  %vfn.i.i.i.i.i11 = getelementptr inbounds void (%"struct.boost::exception_detail::error_info_container"*)** %vtable.i.i.i.i.i10, i32 3
  %8 = load void (%"struct.boost::exception_detail::error_info_container"*)** %vfn.i.i.i.i.i11, align 4
  invoke void %8(%"struct.boost::exception_detail::error_info_container"* %6)
          to label %invoke.cont unwind label %lpad.i

lpad.i:                                           ; preds = %if.then.i.i.i.i.i12
  %9 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  tail call void @_ZNSt12out_of_rangeD2Ev(%"class.std::out_of_range"* %1) nounwind
  br label %lpad.body

invoke.cont:                                      ; preds = %if.then.i.i.i.i.i12, %_ZNSt12out_of_rangeC2ERKS_.exit.i
  %throw_function_.i.i = getelementptr inbounds %"class.boost::exception_detail::clone_impl"* %this, i32 0, i32 0, i32 1, i32 2
  %throw_function_3.i.i = getelementptr inbounds %"struct.boost::exception_detail::error_info_injector"* %x, i32 0, i32 1, i32 2
  %10 = load i8** %throw_function_3.i.i, align 4, !tbaa !3
  store i8* %10, i8** %throw_function_.i.i, align 4, !tbaa !3
  %throw_file_.i.i = getelementptr inbounds %"class.boost::exception_detail::clone_impl"* %this, i32 0, i32 0, i32 1, i32 3
  %throw_file_4.i.i = getelementptr inbounds %"struct.boost::exception_detail::error_info_injector"* %x, i32 0, i32 1, i32 3
  %11 = load i8** %throw_file_4.i.i, align 4, !tbaa !3
  store i8* %11, i8** %throw_file_.i.i, align 4, !tbaa !3
  %throw_line_.i.i = getelementptr inbounds %"class.boost::exception_detail::clone_impl"* %this, i32 0, i32 0, i32 1, i32 4
  %throw_line_5.i.i = getelementptr inbounds %"struct.boost::exception_detail::error_info_injector"* %x, i32 0, i32 1, i32 4
  %12 = load i32* %throw_line_5.i.i, align 4, !tbaa !0
  store i32 %12, i32* %throw_line_.i.i, align 4, !tbaa !0
  store i32 (...)** bitcast (i8** getelementptr inbounds ([21 x i8*]* @_ZTVN5boost16exception_detail10clone_implINS0_19error_info_injectorISt12out_of_rangeEEEE, i32 0, i32 3) to i32 (...)**), i32 (...)*** %2, align 4, !tbaa !5
  %add.ptr = getelementptr inbounds %"class.boost::exception_detail::clone_impl"* %this, i32 0, i32 0, i32 1
  %13 = getelementptr inbounds %"class.boost::exception"* %add.ptr, i32 0, i32 0
  store i32 (...)** bitcast (i8** getelementptr inbounds ([21 x i8*]* @_ZTVN5boost16exception_detail10clone_implINS0_19error_info_injectorISt12out_of_rangeEEEE, i32 0, i32 10) to i32 (...)**), i32 (...)*** %13, align 4, !tbaa !5
  store i32 (...)** bitcast (i8** getelementptr inbounds ([21 x i8*]* @_ZTVN5boost16exception_detail10clone_implINS0_19error_info_injectorISt12out_of_rangeEEEE, i32 0, i32 17) to i32 (...)**), i32 (...)*** %0, align 4, !tbaa !5
  %14 = icmp eq %"struct.boost::exception_detail::error_info_injector"* %x, null
  %add.ptr4 = getelementptr inbounds %"struct.boost::exception_detail::error_info_injector"* %x, i32 0, i32 1
  %.add.ptr4 = select i1 %14, %"class.boost::exception"* null, %"class.boost::exception"* %add.ptr4
  invoke void @_ZN5boost16exception_detail20copy_boost_exceptionEPNS_9exceptionEPKS1_(%"class.boost::exception"* %add.ptr, %"class.boost::exception"* %.add.ptr4)
          to label %invoke.cont6 unwind label %lpad5

invoke.cont6:                                     ; preds = %invoke.cont
  ret void

lpad.body:                                        ; preds = %lpad.i, %lpad.i.i.i
  %eh.lpad-body = phi { i8*, i32 } [ %3, %lpad.i.i.i ], [ %9, %lpad.i ]
  %15 = extractvalue { i8*, i32 } %eh.lpad-body, 0
  %16 = extractvalue { i8*, i32 } %eh.lpad-body, 1
  br label %ehcleanup

lpad5:                                            ; preds = %invoke.cont
  %17 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %18 = extractvalue { i8*, i32 } %17, 0
  %19 = extractvalue { i8*, i32 } %17, 1
  store i32 (...)** bitcast (i8** getelementptr inbounds ([4 x i8*]* @_ZTVN5boost9exceptionE, i32 0, i32 2) to i32 (...)**), i32 (...)*** %5, align 4, !tbaa !5
  %20 = load %"struct.boost::exception_detail::error_info_container"** %px_.i.i.i.i, align 4, !tbaa !3
  %tobool.i.i.i.i.i = icmp eq %"struct.boost::exception_detail::error_info_container"* %20, null
  br i1 %tobool.i.i.i.i.i, label %_ZN5boost16exception_detail19error_info_injectorISt12out_of_rangeED2Ev.exit, label %land.lhs.true.i.i.i.i.i

land.lhs.true.i.i.i.i.i:                          ; preds = %lpad5
  %21 = bitcast %"struct.boost::exception_detail::error_info_container"* %20 to i1 (%"struct.boost::exception_detail::error_info_container"*)***
  %vtable.i.i.i.i.i = load i1 (%"struct.boost::exception_detail::error_info_container"*)*** %21, align 4, !tbaa !5
  %vfn.i.i.i.i.i = getelementptr inbounds i1 (%"struct.boost::exception_detail::error_info_container"*)** %vtable.i.i.i.i.i, i32 4
  %22 = load i1 (%"struct.boost::exception_detail::error_info_container"*)** %vfn.i.i.i.i.i, align 4
  %call.i.i.i2.i.i = invoke zeroext i1 %22(%"struct.boost::exception_detail::error_info_container"* %20)
          to label %call.i.i.i.noexc.i.i unwind label %lpad.i.i

call.i.i.i.noexc.i.i:                             ; preds = %land.lhs.true.i.i.i.i.i
  br i1 %call.i.i.i2.i.i, label %if.then.i.i.i.i.i, label %_ZN5boost16exception_detail19error_info_injectorISt12out_of_rangeED2Ev.exit

if.then.i.i.i.i.i:                                ; preds = %call.i.i.i.noexc.i.i
  store %"struct.boost::exception_detail::error_info_container"* null, %"struct.boost::exception_detail::error_info_container"** %px_.i.i.i.i, align 4, !tbaa !3
  br label %_ZN5boost16exception_detail19error_info_injectorISt12out_of_rangeED2Ev.exit

lpad.i.i:                                         ; preds = %land.lhs.true.i.i.i.i.i
  %23 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          filter [0 x i8*] zeroinitializer
  %24 = extractvalue { i8*, i32 } %23, 0
  tail call void @__cxa_call_unexpected(i8* %24) noreturn nounwind
  unreachable

_ZN5boost16exception_detail19error_info_injectorISt12out_of_rangeED2Ev.exit: ; preds = %lpad5, %call.i.i.i.noexc.i.i, %if.then.i.i.i.i.i
  tail call void @_ZNSt12out_of_rangeD2Ev(%"class.std::out_of_range"* %1) nounwind
  br label %ehcleanup

ehcleanup:                                        ; preds = %_ZN5boost16exception_detail19error_info_injectorISt12out_of_rangeED2Ev.exit, %lpad.body
  %exn.slot.0 = phi i8* [ %18, %_ZN5boost16exception_detail19error_info_injectorISt12out_of_rangeED2Ev.exit ], [ %15, %lpad.body ]
  %ehselector.slot.0 = phi i32 [ %19, %_ZN5boost16exception_detail19error_info_injectorISt12out_of_rangeED2Ev.exit ], [ %16, %lpad.body ]
  %lpad.val = insertvalue { i8*, i32 } undef, i8* %exn.slot.0, 0
  %lpad.val7 = insertvalue { i8*, i32 } %lpad.val, i32 %ehselector.slot.0, 1
  resume { i8*, i32 } %lpad.val7
}

declare void @_ZNSs4_Rep10_M_destroyERKSaIcE(%"struct.std::basic_string<char, std::char_traits<char>, std::allocator<char> >::_Rep"*, %"class.std::allocator"*) nounwind

declare extern_weak i32 @pthread_cancel(i32)

define linkonce_odr noalias x86_fp80* @_ZN5boost5arrayIeLj0EE17failed_rangecheckEv() noreturn align 2 {
entry:
  %ref.tmp.i.i10 = alloca %"class.std::allocator", align 1
  %ref.tmp.i.i = alloca %"class.std::allocator", align 1
  %e = alloca %"class.std::out_of_range", align 4
  %ref.tmp = alloca %"class.std::basic_string", align 4
  %ref.tmp1 = alloca %"class.std::allocator", align 1
  invoke void @_ZNSsC1EPKcRKSaIcE(%"class.std::basic_string"* %ref.tmp, i8* getelementptr inbounds ([44 x i8]* @.str2, i32 0, i32 0), %"class.std::allocator"* %ref.tmp1)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %entry
  invoke void @_ZNSt12out_of_rangeC1ERKSs(%"class.std::out_of_range"* %e, %"class.std::basic_string"* %ref.tmp)
          to label %invoke.cont3 unwind label %lpad2

invoke.cont3:                                     ; preds = %invoke.cont
  %0 = getelementptr inbounds %"class.std::allocator"* %ref.tmp.i.i10, i32 0, i32 0
  call void @llvm.lifetime.start(i64 1, i8* %0)
  %_M_p.i.i.i.i11 = getelementptr inbounds %"class.std::basic_string"* %ref.tmp, i32 0, i32 0, i32 0
  %1 = load i8** %_M_p.i.i.i.i11, align 4, !tbaa !3
  %arrayidx.i.i.i12 = getelementptr inbounds i8* %1, i32 -12
  %2 = bitcast i8* %arrayidx.i.i.i12 to %"struct.std::basic_string<char, std::char_traits<char>, std::allocator<char> >::_Rep"*
  %cmp.i.i.i13 = icmp eq i8* %arrayidx.i.i.i12, bitcast ([0 x i32]* @_ZNSs4_Rep20_S_empty_rep_storageE to i8*)
  br i1 %cmp.i.i.i13, label %invoke.cont4, label %if.then.i.i.i15, !prof !4

if.then.i.i.i15:                                  ; preds = %invoke.cont3
  %_M_refcount.i.i.i14 = getelementptr inbounds i8* %1, i32 -4
  %3 = bitcast i8* %_M_refcount.i.i.i14 to i32*
  br i1 icmp ne (i8* bitcast (i32 (i32)* @pthread_cancel to i8*), i8* null), label %if.then.i.i.i.i16, label %if.else.i.i.i.i18

if.then.i.i.i.i16:                                ; preds = %if.then.i.i.i15
  %4 = atomicrmw add i32* %3, i32 -1 seq_cst
  br label %_ZN9__gnu_cxxL27__exchange_and_add_dispatchEPii.exit.i.i.i21

if.else.i.i.i.i18:                                ; preds = %if.then.i.i.i15
  %5 = load i32* %3, align 4, !tbaa !0
  %add.i.i.i.i.i17 = add nsw i32 %5, -1
  store i32 %add.i.i.i.i.i17, i32* %3, align 4, !tbaa !0
  br label %_ZN9__gnu_cxxL27__exchange_and_add_dispatchEPii.exit.i.i.i21

_ZN9__gnu_cxxL27__exchange_and_add_dispatchEPii.exit.i.i.i21: ; preds = %if.else.i.i.i.i18, %if.then.i.i.i.i16
  %retval.0.i.i.i.i19 = phi i32 [ %4, %if.then.i.i.i.i16 ], [ %5, %if.else.i.i.i.i18 ]
  %cmp3.i.i.i20 = icmp slt i32 %retval.0.i.i.i.i19, 1
  br i1 %cmp3.i.i.i20, label %if.then4.i.i.i22, label %invoke.cont4

if.then4.i.i.i22:                                 ; preds = %_ZN9__gnu_cxxL27__exchange_and_add_dispatchEPii.exit.i.i.i21
  call void @_ZNSs4_Rep10_M_destroyERKSaIcE(%"struct.std::basic_string<char, std::char_traits<char>, std::allocator<char> >::_Rep"* %2, %"class.std::allocator"* %ref.tmp.i.i10) nounwind
  br label %invoke.cont4

invoke.cont4:                                     ; preds = %if.then4.i.i.i22, %_ZN9__gnu_cxxL27__exchange_and_add_dispatchEPii.exit.i.i.i21, %invoke.cont3
  call void @llvm.lifetime.end(i64 1, i8* %0)
  invoke void @_ZN5boost15throw_exceptionISt12out_of_rangeEEvRKT_(%"class.std::out_of_range"* %e) noreturn
          to label %invoke.cont7 unwind label %lpad6

invoke.cont7:                                     ; preds = %invoke.cont4
  unreachable

lpad:                                             ; preds = %entry
  %6 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %7 = extractvalue { i8*, i32 } %6, 0
  %8 = extractvalue { i8*, i32 } %6, 1
  br label %eh.resume

lpad2:                                            ; preds = %invoke.cont
  %9 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %10 = extractvalue { i8*, i32 } %9, 0
  %11 = extractvalue { i8*, i32 } %9, 1
  %12 = getelementptr inbounds %"class.std::allocator"* %ref.tmp.i.i, i32 0, i32 0
  call void @llvm.lifetime.start(i64 1, i8* %12)
  %_M_p.i.i.i.i = getelementptr inbounds %"class.std::basic_string"* %ref.tmp, i32 0, i32 0, i32 0
  %13 = load i8** %_M_p.i.i.i.i, align 4, !tbaa !3
  %arrayidx.i.i.i = getelementptr inbounds i8* %13, i32 -12
  %14 = bitcast i8* %arrayidx.i.i.i to %"struct.std::basic_string<char, std::char_traits<char>, std::allocator<char> >::_Rep"*
  %cmp.i.i.i = icmp eq i8* %arrayidx.i.i.i, bitcast ([0 x i32]* @_ZNSs4_Rep20_S_empty_rep_storageE to i8*)
  br i1 %cmp.i.i.i, label %eh.resume, label %if.then.i.i.i, !prof !4

if.then.i.i.i:                                    ; preds = %lpad2
  %_M_refcount.i.i.i = getelementptr inbounds i8* %13, i32 -4
  %15 = bitcast i8* %_M_refcount.i.i.i to i32*
  br i1 icmp ne (i8* bitcast (i32 (i32)* @pthread_cancel to i8*), i8* null), label %if.then.i.i.i.i, label %if.else.i.i.i.i

if.then.i.i.i.i:                                  ; preds = %if.then.i.i.i
  %16 = atomicrmw add i32* %15, i32 -1 seq_cst
  br label %_ZN9__gnu_cxxL27__exchange_and_add_dispatchEPii.exit.i.i.i

if.else.i.i.i.i:                                  ; preds = %if.then.i.i.i
  %17 = load i32* %15, align 4, !tbaa !0
  %add.i.i.i.i.i = add nsw i32 %17, -1
  store i32 %add.i.i.i.i.i, i32* %15, align 4, !tbaa !0
  br label %_ZN9__gnu_cxxL27__exchange_and_add_dispatchEPii.exit.i.i.i

_ZN9__gnu_cxxL27__exchange_and_add_dispatchEPii.exit.i.i.i: ; preds = %if.else.i.i.i.i, %if.then.i.i.i.i
  %retval.0.i.i.i.i = phi i32 [ %16, %if.then.i.i.i.i ], [ %17, %if.else.i.i.i.i ]
  %cmp3.i.i.i = icmp slt i32 %retval.0.i.i.i.i, 1
  br i1 %cmp3.i.i.i, label %if.then4.i.i.i, label %eh.resume

if.then4.i.i.i:                                   ; preds = %_ZN9__gnu_cxxL27__exchange_and_add_dispatchEPii.exit.i.i.i
  call void @_ZNSs4_Rep10_M_destroyERKSaIcE(%"struct.std::basic_string<char, std::char_traits<char>, std::allocator<char> >::_Rep"* %14, %"class.std::allocator"* %ref.tmp.i.i) nounwind
  br label %eh.resume

lpad6:                                            ; preds = %invoke.cont4
  %18 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %19 = extractvalue { i8*, i32 } %18, 0
  %20 = extractvalue { i8*, i32 } %18, 1
  call void @_ZNSt12out_of_rangeD1Ev(%"class.std::out_of_range"* %e) nounwind
  br label %eh.resume

eh.resume:                                        ; preds = %if.then4.i.i.i, %_ZN9__gnu_cxxL27__exchange_and_add_dispatchEPii.exit.i.i.i, %lpad2, %lpad, %lpad6
  %exn.slot.1 = phi i8* [ %19, %lpad6 ], [ %7, %lpad ], [ %10, %lpad2 ], [ %10, %_ZN9__gnu_cxxL27__exchange_and_add_dispatchEPii.exit.i.i.i ], [ %10, %if.then4.i.i.i ]
  %ehselector.slot.1 = phi i32 [ %20, %lpad6 ], [ %8, %lpad ], [ %11, %lpad2 ], [ %11, %_ZN9__gnu_cxxL27__exchange_and_add_dispatchEPii.exit.i.i.i ], [ %11, %if.then4.i.i.i ]
  %lpad.val = insertvalue { i8*, i32 } undef, i8* %exn.slot.1, 0
  %lpad.val9 = insertvalue { i8*, i32 } %lpad.val, i32 %ehselector.slot.1, 1
  resume { i8*, i32 } %lpad.val9
}

define linkonce_odr noalias i8** @_ZN5boost5arrayIPvLj0EE17failed_rangecheckEv() noreturn align 2 {
entry:
  %ref.tmp.i.i10 = alloca %"class.std::allocator", align 1
  %ref.tmp.i.i = alloca %"class.std::allocator", align 1
  %e = alloca %"class.std::out_of_range", align 4
  %ref.tmp = alloca %"class.std::basic_string", align 4
  %ref.tmp1 = alloca %"class.std::allocator", align 1
  invoke void @_ZNSsC1EPKcRKSaIcE(%"class.std::basic_string"* %ref.tmp, i8* getelementptr inbounds ([44 x i8]* @.str2, i32 0, i32 0), %"class.std::allocator"* %ref.tmp1)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %entry
  invoke void @_ZNSt12out_of_rangeC1ERKSs(%"class.std::out_of_range"* %e, %"class.std::basic_string"* %ref.tmp)
          to label %invoke.cont3 unwind label %lpad2

invoke.cont3:                                     ; preds = %invoke.cont
  %0 = getelementptr inbounds %"class.std::allocator"* %ref.tmp.i.i10, i32 0, i32 0
  call void @llvm.lifetime.start(i64 1, i8* %0)
  %_M_p.i.i.i.i11 = getelementptr inbounds %"class.std::basic_string"* %ref.tmp, i32 0, i32 0, i32 0
  %1 = load i8** %_M_p.i.i.i.i11, align 4, !tbaa !3
  %arrayidx.i.i.i12 = getelementptr inbounds i8* %1, i32 -12
  %2 = bitcast i8* %arrayidx.i.i.i12 to %"struct.std::basic_string<char, std::char_traits<char>, std::allocator<char> >::_Rep"*
  %cmp.i.i.i13 = icmp eq i8* %arrayidx.i.i.i12, bitcast ([0 x i32]* @_ZNSs4_Rep20_S_empty_rep_storageE to i8*)
  br i1 %cmp.i.i.i13, label %invoke.cont4, label %if.then.i.i.i15, !prof !4

if.then.i.i.i15:                                  ; preds = %invoke.cont3
  %_M_refcount.i.i.i14 = getelementptr inbounds i8* %1, i32 -4
  %3 = bitcast i8* %_M_refcount.i.i.i14 to i32*
  br i1 icmp ne (i8* bitcast (i32 (i32)* @pthread_cancel to i8*), i8* null), label %if.then.i.i.i.i16, label %if.else.i.i.i.i18

if.then.i.i.i.i16:                                ; preds = %if.then.i.i.i15
  %4 = atomicrmw add i32* %3, i32 -1 seq_cst
  br label %_ZN9__gnu_cxxL27__exchange_and_add_dispatchEPii.exit.i.i.i21

if.else.i.i.i.i18:                                ; preds = %if.then.i.i.i15
  %5 = load i32* %3, align 4, !tbaa !0
  %add.i.i.i.i.i17 = add nsw i32 %5, -1
  store i32 %add.i.i.i.i.i17, i32* %3, align 4, !tbaa !0
  br label %_ZN9__gnu_cxxL27__exchange_and_add_dispatchEPii.exit.i.i.i21

_ZN9__gnu_cxxL27__exchange_and_add_dispatchEPii.exit.i.i.i21: ; preds = %if.else.i.i.i.i18, %if.then.i.i.i.i16
  %retval.0.i.i.i.i19 = phi i32 [ %4, %if.then.i.i.i.i16 ], [ %5, %if.else.i.i.i.i18 ]
  %cmp3.i.i.i20 = icmp slt i32 %retval.0.i.i.i.i19, 1
  br i1 %cmp3.i.i.i20, label %if.then4.i.i.i22, label %invoke.cont4

if.then4.i.i.i22:                                 ; preds = %_ZN9__gnu_cxxL27__exchange_and_add_dispatchEPii.exit.i.i.i21
  call void @_ZNSs4_Rep10_M_destroyERKSaIcE(%"struct.std::basic_string<char, std::char_traits<char>, std::allocator<char> >::_Rep"* %2, %"class.std::allocator"* %ref.tmp.i.i10) nounwind
  br label %invoke.cont4

invoke.cont4:                                     ; preds = %if.then4.i.i.i22, %_ZN9__gnu_cxxL27__exchange_and_add_dispatchEPii.exit.i.i.i21, %invoke.cont3
  call void @llvm.lifetime.end(i64 1, i8* %0)
  invoke void @_ZN5boost15throw_exceptionISt12out_of_rangeEEvRKT_(%"class.std::out_of_range"* %e) noreturn
          to label %invoke.cont7 unwind label %lpad6

invoke.cont7:                                     ; preds = %invoke.cont4
  unreachable

lpad:                                             ; preds = %entry
  %6 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %7 = extractvalue { i8*, i32 } %6, 0
  %8 = extractvalue { i8*, i32 } %6, 1
  br label %eh.resume

lpad2:                                            ; preds = %invoke.cont
  %9 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %10 = extractvalue { i8*, i32 } %9, 0
  %11 = extractvalue { i8*, i32 } %9, 1
  %12 = getelementptr inbounds %"class.std::allocator"* %ref.tmp.i.i, i32 0, i32 0
  call void @llvm.lifetime.start(i64 1, i8* %12)
  %_M_p.i.i.i.i = getelementptr inbounds %"class.std::basic_string"* %ref.tmp, i32 0, i32 0, i32 0
  %13 = load i8** %_M_p.i.i.i.i, align 4, !tbaa !3
  %arrayidx.i.i.i = getelementptr inbounds i8* %13, i32 -12
  %14 = bitcast i8* %arrayidx.i.i.i to %"struct.std::basic_string<char, std::char_traits<char>, std::allocator<char> >::_Rep"*
  %cmp.i.i.i = icmp eq i8* %arrayidx.i.i.i, bitcast ([0 x i32]* @_ZNSs4_Rep20_S_empty_rep_storageE to i8*)
  br i1 %cmp.i.i.i, label %eh.resume, label %if.then.i.i.i, !prof !4

if.then.i.i.i:                                    ; preds = %lpad2
  %_M_refcount.i.i.i = getelementptr inbounds i8* %13, i32 -4
  %15 = bitcast i8* %_M_refcount.i.i.i to i32*
  br i1 icmp ne (i8* bitcast (i32 (i32)* @pthread_cancel to i8*), i8* null), label %if.then.i.i.i.i, label %if.else.i.i.i.i

if.then.i.i.i.i:                                  ; preds = %if.then.i.i.i
  %16 = atomicrmw add i32* %15, i32 -1 seq_cst
  br label %_ZN9__gnu_cxxL27__exchange_and_add_dispatchEPii.exit.i.i.i

if.else.i.i.i.i:                                  ; preds = %if.then.i.i.i
  %17 = load i32* %15, align 4, !tbaa !0
  %add.i.i.i.i.i = add nsw i32 %17, -1
  store i32 %add.i.i.i.i.i, i32* %15, align 4, !tbaa !0
  br label %_ZN9__gnu_cxxL27__exchange_and_add_dispatchEPii.exit.i.i.i

_ZN9__gnu_cxxL27__exchange_and_add_dispatchEPii.exit.i.i.i: ; preds = %if.else.i.i.i.i, %if.then.i.i.i.i
  %retval.0.i.i.i.i = phi i32 [ %16, %if.then.i.i.i.i ], [ %17, %if.else.i.i.i.i ]
  %cmp3.i.i.i = icmp slt i32 %retval.0.i.i.i.i, 1
  br i1 %cmp3.i.i.i, label %if.then4.i.i.i, label %eh.resume

if.then4.i.i.i:                                   ; preds = %_ZN9__gnu_cxxL27__exchange_and_add_dispatchEPii.exit.i.i.i
  call void @_ZNSs4_Rep10_M_destroyERKSaIcE(%"struct.std::basic_string<char, std::char_traits<char>, std::allocator<char> >::_Rep"* %14, %"class.std::allocator"* %ref.tmp.i.i) nounwind
  br label %eh.resume

lpad6:                                            ; preds = %invoke.cont4
  %18 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %19 = extractvalue { i8*, i32 } %18, 0
  %20 = extractvalue { i8*, i32 } %18, 1
  call void @_ZNSt12out_of_rangeD1Ev(%"class.std::out_of_range"* %e) nounwind
  br label %eh.resume

eh.resume:                                        ; preds = %if.then4.i.i.i, %_ZN9__gnu_cxxL27__exchange_and_add_dispatchEPii.exit.i.i.i, %lpad2, %lpad, %lpad6
  %exn.slot.1 = phi i8* [ %19, %lpad6 ], [ %7, %lpad ], [ %10, %lpad2 ], [ %10, %_ZN9__gnu_cxxL27__exchange_and_add_dispatchEPii.exit.i.i.i ], [ %10, %if.then4.i.i.i ]
  %ehselector.slot.1 = phi i32 [ %20, %lpad6 ], [ %8, %lpad ], [ %11, %lpad2 ], [ %11, %_ZN9__gnu_cxxL27__exchange_and_add_dispatchEPii.exit.i.i.i ], [ %11, %if.then4.i.i.i ]
  %lpad.val = insertvalue { i8*, i32 } undef, i8* %exn.slot.1, 0
  %lpad.val9 = insertvalue { i8*, i32 } %lpad.val, i32 %ehselector.slot.1, 1
  resume { i8*, i32 } %lpad.val9
}

define linkonce_odr noalias i8* @_ZN5boost5arrayIbLj0EE17failed_rangecheckEv() noreturn align 2 {
entry:
  %ref.tmp.i.i10 = alloca %"class.std::allocator", align 1
  %ref.tmp.i.i = alloca %"class.std::allocator", align 1
  %e = alloca %"class.std::out_of_range", align 4
  %ref.tmp = alloca %"class.std::basic_string", align 4
  %ref.tmp1 = alloca %"class.std::allocator", align 1
  invoke void @_ZNSsC1EPKcRKSaIcE(%"class.std::basic_string"* %ref.tmp, i8* getelementptr inbounds ([44 x i8]* @.str2, i32 0, i32 0), %"class.std::allocator"* %ref.tmp1)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %entry
  invoke void @_ZNSt12out_of_rangeC1ERKSs(%"class.std::out_of_range"* %e, %"class.std::basic_string"* %ref.tmp)
          to label %invoke.cont3 unwind label %lpad2

invoke.cont3:                                     ; preds = %invoke.cont
  %0 = getelementptr inbounds %"class.std::allocator"* %ref.tmp.i.i10, i32 0, i32 0
  call void @llvm.lifetime.start(i64 1, i8* %0)
  %_M_p.i.i.i.i11 = getelementptr inbounds %"class.std::basic_string"* %ref.tmp, i32 0, i32 0, i32 0
  %1 = load i8** %_M_p.i.i.i.i11, align 4, !tbaa !3
  %arrayidx.i.i.i12 = getelementptr inbounds i8* %1, i32 -12
  %2 = bitcast i8* %arrayidx.i.i.i12 to %"struct.std::basic_string<char, std::char_traits<char>, std::allocator<char> >::_Rep"*
  %cmp.i.i.i13 = icmp eq i8* %arrayidx.i.i.i12, bitcast ([0 x i32]* @_ZNSs4_Rep20_S_empty_rep_storageE to i8*)
  br i1 %cmp.i.i.i13, label %invoke.cont4, label %if.then.i.i.i15, !prof !4

if.then.i.i.i15:                                  ; preds = %invoke.cont3
  %_M_refcount.i.i.i14 = getelementptr inbounds i8* %1, i32 -4
  %3 = bitcast i8* %_M_refcount.i.i.i14 to i32*
  br i1 icmp ne (i8* bitcast (i32 (i32)* @pthread_cancel to i8*), i8* null), label %if.then.i.i.i.i16, label %if.else.i.i.i.i18

if.then.i.i.i.i16:                                ; preds = %if.then.i.i.i15
  %4 = atomicrmw add i32* %3, i32 -1 seq_cst
  br label %_ZN9__gnu_cxxL27__exchange_and_add_dispatchEPii.exit.i.i.i21

if.else.i.i.i.i18:                                ; preds = %if.then.i.i.i15
  %5 = load i32* %3, align 4, !tbaa !0
  %add.i.i.i.i.i17 = add nsw i32 %5, -1
  store i32 %add.i.i.i.i.i17, i32* %3, align 4, !tbaa !0
  br label %_ZN9__gnu_cxxL27__exchange_and_add_dispatchEPii.exit.i.i.i21

_ZN9__gnu_cxxL27__exchange_and_add_dispatchEPii.exit.i.i.i21: ; preds = %if.else.i.i.i.i18, %if.then.i.i.i.i16
  %retval.0.i.i.i.i19 = phi i32 [ %4, %if.then.i.i.i.i16 ], [ %5, %if.else.i.i.i.i18 ]
  %cmp3.i.i.i20 = icmp slt i32 %retval.0.i.i.i.i19, 1
  br i1 %cmp3.i.i.i20, label %if.then4.i.i.i22, label %invoke.cont4

if.then4.i.i.i22:                                 ; preds = %_ZN9__gnu_cxxL27__exchange_and_add_dispatchEPii.exit.i.i.i21
  call void @_ZNSs4_Rep10_M_destroyERKSaIcE(%"struct.std::basic_string<char, std::char_traits<char>, std::allocator<char> >::_Rep"* %2, %"class.std::allocator"* %ref.tmp.i.i10) nounwind
  br label %invoke.cont4

invoke.cont4:                                     ; preds = %if.then4.i.i.i22, %_ZN9__gnu_cxxL27__exchange_and_add_dispatchEPii.exit.i.i.i21, %invoke.cont3
  call void @llvm.lifetime.end(i64 1, i8* %0)
  invoke void @_ZN5boost15throw_exceptionISt12out_of_rangeEEvRKT_(%"class.std::out_of_range"* %e) noreturn
          to label %invoke.cont7 unwind label %lpad6

invoke.cont7:                                     ; preds = %invoke.cont4
  unreachable

lpad:                                             ; preds = %entry
  %6 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %7 = extractvalue { i8*, i32 } %6, 0
  %8 = extractvalue { i8*, i32 } %6, 1
  br label %eh.resume

lpad2:                                            ; preds = %invoke.cont
  %9 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %10 = extractvalue { i8*, i32 } %9, 0
  %11 = extractvalue { i8*, i32 } %9, 1
  %12 = getelementptr inbounds %"class.std::allocator"* %ref.tmp.i.i, i32 0, i32 0
  call void @llvm.lifetime.start(i64 1, i8* %12)
  %_M_p.i.i.i.i = getelementptr inbounds %"class.std::basic_string"* %ref.tmp, i32 0, i32 0, i32 0
  %13 = load i8** %_M_p.i.i.i.i, align 4, !tbaa !3
  %arrayidx.i.i.i = getelementptr inbounds i8* %13, i32 -12
  %14 = bitcast i8* %arrayidx.i.i.i to %"struct.std::basic_string<char, std::char_traits<char>, std::allocator<char> >::_Rep"*
  %cmp.i.i.i = icmp eq i8* %arrayidx.i.i.i, bitcast ([0 x i32]* @_ZNSs4_Rep20_S_empty_rep_storageE to i8*)
  br i1 %cmp.i.i.i, label %eh.resume, label %if.then.i.i.i, !prof !4

if.then.i.i.i:                                    ; preds = %lpad2
  %_M_refcount.i.i.i = getelementptr inbounds i8* %13, i32 -4
  %15 = bitcast i8* %_M_refcount.i.i.i to i32*
  br i1 icmp ne (i8* bitcast (i32 (i32)* @pthread_cancel to i8*), i8* null), label %if.then.i.i.i.i, label %if.else.i.i.i.i

if.then.i.i.i.i:                                  ; preds = %if.then.i.i.i
  %16 = atomicrmw add i32* %15, i32 -1 seq_cst
  br label %_ZN9__gnu_cxxL27__exchange_and_add_dispatchEPii.exit.i.i.i

if.else.i.i.i.i:                                  ; preds = %if.then.i.i.i
  %17 = load i32* %15, align 4, !tbaa !0
  %add.i.i.i.i.i = add nsw i32 %17, -1
  store i32 %add.i.i.i.i.i, i32* %15, align 4, !tbaa !0
  br label %_ZN9__gnu_cxxL27__exchange_and_add_dispatchEPii.exit.i.i.i

_ZN9__gnu_cxxL27__exchange_and_add_dispatchEPii.exit.i.i.i: ; preds = %if.else.i.i.i.i, %if.then.i.i.i.i
  %retval.0.i.i.i.i = phi i32 [ %16, %if.then.i.i.i.i ], [ %17, %if.else.i.i.i.i ]
  %cmp3.i.i.i = icmp slt i32 %retval.0.i.i.i.i, 1
  br i1 %cmp3.i.i.i, label %if.then4.i.i.i, label %eh.resume

if.then4.i.i.i:                                   ; preds = %_ZN9__gnu_cxxL27__exchange_and_add_dispatchEPii.exit.i.i.i
  call void @_ZNSs4_Rep10_M_destroyERKSaIcE(%"struct.std::basic_string<char, std::char_traits<char>, std::allocator<char> >::_Rep"* %14, %"class.std::allocator"* %ref.tmp.i.i) nounwind
  br label %eh.resume

lpad6:                                            ; preds = %invoke.cont4
  %18 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %19 = extractvalue { i8*, i32 } %18, 0
  %20 = extractvalue { i8*, i32 } %18, 1
  call void @_ZNSt12out_of_rangeD1Ev(%"class.std::out_of_range"* %e) nounwind
  br label %eh.resume

eh.resume:                                        ; preds = %if.then4.i.i.i, %_ZN9__gnu_cxxL27__exchange_and_add_dispatchEPii.exit.i.i.i, %lpad2, %lpad, %lpad6
  %exn.slot.1 = phi i8* [ %19, %lpad6 ], [ %7, %lpad ], [ %10, %lpad2 ], [ %10, %_ZN9__gnu_cxxL27__exchange_and_add_dispatchEPii.exit.i.i.i ], [ %10, %if.then4.i.i.i ]
  %ehselector.slot.1 = phi i32 [ %20, %lpad6 ], [ %8, %lpad ], [ %11, %lpad2 ], [ %11, %_ZN9__gnu_cxxL27__exchange_and_add_dispatchEPii.exit.i.i.i ], [ %11, %if.then4.i.i.i ]
  %lpad.val = insertvalue { i8*, i32 } undef, i8* %exn.slot.1, 0
  %lpad.val9 = insertvalue { i8*, i32 } %lpad.val, i32 %ehselector.slot.1, 1
  resume { i8*, i32 } %lpad.val9
}

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
!3 = metadata !{metadata !"any pointer", metadata !1}
!4 = metadata !{metadata !"branch_weights", i32 64, i32 4}
!5 = metadata !{metadata !"vtable pointer", metadata !2}
