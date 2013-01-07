; ModuleID = 'condition.cpp'
target datalayout = "e-p:32:32:32-i1:8:8-i8:8:8-i16:16:16-i32:32:32-i64:32:64-f32:32:32-f64:32:64-v64:64:64-v128:128:128-a0:0:64-f80:32:32-n8:16:32-S128"
target triple = "i386-pc-linux-gnu"

%"class.std::ios_base::Init" = type { i8 }
%"class.boost::system::error_category" = type { i32 (...)** }
%"struct.boost::arg" = type { i8 }
%"struct.boost::arg.0" = type { i8 }
%"struct.boost::arg.2" = type { i8 }
%"struct.boost::arg.4" = type { i8 }
%"struct.boost::arg.6" = type { i8 }
%"struct.boost::arg.8" = type { i8 }
%"struct.boost::arg.10" = type { i8 }
%"struct.boost::arg.12" = type { i8 }
%"struct.boost::arg.14" = type { i8 }
%class.bounded_buffer = type { i32, i32, i32, %"class.std::vector", %"class.boost::condition_variable_any", %"class.boost::condition_variable_any", %"class.boost::mutex" }
%"class.std::vector" = type { %"struct.std::_Vector_base" }
%"struct.std::_Vector_base" = type { %"struct.std::_Vector_base<int, std::allocator<int> >::_Vector_impl" }
%"struct.std::_Vector_base<int, std::allocator<int> >::_Vector_impl" = type { i32*, i32*, i32* }
%"class.boost::condition_variable_any" = type { %union.pthread_mutex_t, %union.pthread_cond_t }
%union.pthread_mutex_t = type { %"struct.<anonymous union>::__pthread_mutex_s" }
%"struct.<anonymous union>::__pthread_mutex_s" = type { i32, i32, i32, i32, i32, %union.anon }
%union.anon = type { i32 }
%union.pthread_cond_t = type { %struct.anon, [4 x i8] }
%struct.anon = type { i32, i32, i64, i64, i64, i8*, i32, i32 }
%"class.boost::mutex" = type { %union.pthread_mutex_t }
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
%"class.boost::system::error_condition" = type { i32, %"class.boost::system::error_category"* }
%"class.boost::system::system_error" = type { %"class.std::runtime_error", %"class.boost::system::error_code", %"class.std::basic_string" }
%"class.std::runtime_error" = type { %"class.std::exception", %"class.std::basic_string" }
%"class.std::exception" = type { i32 (...)** }
%"class.std::basic_string" = type { %"struct.std::basic_string<char, std::char_traits<char>, std::allocator<char> >::_Alloc_hider" }
%"struct.std::basic_string<char, std::char_traits<char>, std::allocator<char> >::_Alloc_hider" = type { i8* }
%"class.boost::system::error_code" = type { i32, %"class.boost::system::error_category"* }
%"class.boost::unique_lock" = type { %"class.boost::mutex"*, i8 }
%"class.boost::thread" = type { %"class.boost::shared_ptr" }
%"class.boost::shared_ptr" = type { %"struct.boost::detail::thread_data_base"*, %"class.boost::detail::shared_count" }
%"struct.boost::detail::thread_data_base" = type { i32 (...)**, %"class.boost::enable_shared_from_this", %"class.boost::shared_ptr", i32, %"class.boost::mutex", %"class.boost::condition_variable", %"class.boost::mutex", %"class.boost::condition_variable", i8, i8, i8, %"struct.boost::detail::thread_exit_callback_node"*, %"class.std::map", i8, i8, %union.pthread_mutex_t*, %union.pthread_cond_t*, %"class.std::vector.22" }
%"class.boost::enable_shared_from_this" = type { %"class.boost::weak_ptr" }
%"class.boost::weak_ptr" = type { %"struct.boost::detail::thread_data_base"*, %"class.boost::detail::weak_count" }
%"class.boost::detail::weak_count" = type { %"class.boost::detail::sp_counted_base"* }
%"class.boost::detail::sp_counted_base" = type { i32 (...)**, i32, i32 }
%"class.boost::condition_variable" = type { %union.pthread_mutex_t, %union.pthread_cond_t }
%"struct.boost::detail::thread_exit_callback_node" = type opaque
%"class.std::map" = type { %"class.std::_Rb_tree" }
%"class.std::_Rb_tree" = type { %"struct.std::_Rb_tree<const void *, std::pair<const void *const, boost::detail::tss_data_node>, std::_Select1st<std::pair<const void *const, boost::detail::tss_data_node> >, std::less<const void *>, std::allocator<std::pair<const void *const, boost::detail::tss_data_node> > >::_Rb_tree_impl" }
%"struct.std::_Rb_tree<const void *, std::pair<const void *const, boost::detail::tss_data_node>, std::_Select1st<std::pair<const void *const, boost::detail::tss_data_node> >, std::less<const void *>, std::allocator<std::pair<const void *const, boost::detail::tss_data_node> > >::_Rb_tree_impl" = type { %"struct.std::less", %"struct.std::_Rb_tree_node_base", i32 }
%"struct.std::less" = type { i8 }
%"struct.std::_Rb_tree_node_base" = type { i32, %"struct.std::_Rb_tree_node_base"*, %"struct.std::_Rb_tree_node_base"*, %"struct.std::_Rb_tree_node_base"* }
%"class.std::vector.22" = type { %"struct.std::_Vector_base.23" }
%"struct.std::_Vector_base.23" = type { %"struct.std::_Vector_base<std::pair<boost::condition_variable *, boost::mutex *>, std::allocator<std::pair<boost::condition_variable *, boost::mutex *> > >::_Vector_impl" }
%"struct.std::_Vector_base<std::pair<boost::condition_variable *, boost::mutex *>, std::allocator<std::pair<boost::condition_variable *, boost::mutex *> > >::_Vector_impl" = type { %"struct.std::pair"*, %"struct.std::pair"*, %"struct.std::pair"* }
%"struct.std::pair" = type { %"class.boost::condition_variable"*, %"class.boost::mutex"* }
%"class.boost::detail::shared_count" = type { %"class.boost::detail::sp_counted_base"* }
%"struct.boost::thread::dummy" = type opaque
%"class.boost::detail::thread_data" = type { %"struct.boost::detail::thread_data_base", void ()* }
%"struct.std::_Rb_tree_node" = type { %"struct.std::_Rb_tree_node_base", %"struct.std::pair.27" }
%"struct.std::pair.27" = type { i8*, %"struct.boost::detail::tss_data_node" }
%"struct.boost::detail::tss_data_node" = type { %"class.boost::shared_ptr.28", i8* }
%"class.boost::shared_ptr.28" = type { %"struct.boost::detail::tss_cleanup_function"*, %"class.boost::detail::shared_count" }
%"struct.boost::detail::tss_cleanup_function" = type opaque
%"class.std::allocator.19" = type { i8 }
%"class.__gnu_cxx::new_allocator.20" = type { i8 }
%"class.std::allocator.29" = type { i8 }
%"class.__gnu_cxx::new_allocator.30" = type { i8 }
%"class.std::allocator.24" = type { i8 }
%"class.__gnu_cxx::new_allocator.25" = type { i8 }
%"class.boost::thread_resource_error" = type { %"class.boost::thread_exception" }
%"class.boost::thread_exception" = type { %"class.boost::system::system_error" }
%union.pthread_mutexattr_t = type { i32 }
%union.pthread_condattr_t = type { i32 }
%"struct.boost::exception_detail::error_info_injector" = type { %"class.boost::thread_resource_error", %"class.boost::exception" }
%"class.boost::exception" = type { i32 (...)**, %"class.boost::exception_detail::refcount_ptr", i8*, i8*, i32 }
%"class.boost::exception_detail::refcount_ptr" = type { %"struct.boost::exception_detail::error_info_container"* }
%"struct.boost::exception_detail::error_info_container" = type { i32 (...)** }
%"class.boost::exception_detail::clone_impl" = type { %"struct.boost::exception_detail::error_info_injector", %"class.boost::exception_detail::clone_base" }
%"class.boost::exception_detail::clone_base" = type { i32 (...)** }
%"class.std::allocator" = type { i8 }
%"struct.boost::exception_detail::clone_impl<boost::exception_detail::error_info_injector<boost::thread_resource_error> >::clone_tag" = type { i8 }
%"class.boost::detail::sp_counted_impl_p" = type { %"class.boost::detail::sp_counted_base", %"class.boost::detail::thread_data"* }
%"class.std::type_info" = type { i32 (...)**, i8* }
%"class.boost::lock_error" = type { %"class.boost::thread_exception" }
%"struct.boost::exception_detail::error_info_injector.33" = type { %"class.boost::lock_error", %"class.boost::exception" }
%"class.boost::exception_detail::clone_impl.32" = type { %"struct.boost::exception_detail::error_info_injector.33", %"class.boost::exception_detail::clone_base" }
%"struct.boost::exception_detail::clone_impl<boost::exception_detail::error_info_injector<boost::lock_error> >::clone_tag" = type { i8 }
%"class.boost::noncopyable_::noncopyable" = type { i8 }
%"struct.boost::thread_cv_detail::lock_on_exit" = type { %"class.boost::unique_lock"* }
%"class.boost::detail::interruption_checker" = type { %"struct.boost::detail::thread_data_base"*, %union.pthread_mutex_t*, i8 }
%"class.boost::condition_error" = type { %"class.boost::system::system_error" }
%"class.boost::pthread::pthread_mutex_scoped_lock" = type { %union.pthread_mutex_t*, i8 }
%"struct.boost::exception_detail::error_info_injector.36" = type { %"class.boost::condition_error", %"class.boost::exception" }
%"class.boost::exception_detail::clone_impl.35" = type { %"struct.boost::exception_detail::error_info_injector.36", %"class.boost::exception_detail::clone_base" }
%"struct.boost::exception_detail::clone_impl<boost::exception_detail::error_info_injector<boost::condition_error> >::clone_tag" = type { i8 }
%"class.boost::lock_guard" = type { %"class.boost::mutex"* }
%"class.boost::thread_interrupted" = type { i8 }
%"class.std::allocator.16" = type { i8 }
%"class.__gnu_cxx::new_allocator.17" = type { i8 }

@_ZStL8__ioinit = internal global %"class.std::ios_base::Init" zeroinitializer, align 1
@__dso_handle = external unnamed_addr global i8
@_ZN5boost6systemL14posix_categoryE = internal global %"class.boost::system::error_category"* null, align 4
@_ZN5boost6systemL10errno_ecatE = internal global %"class.boost::system::error_category"* null, align 4
@_ZN5boost6systemL11native_ecatE = internal global %"class.boost::system::error_category"* null, align 4
@.str = private unnamed_addr constant [3 x i8] c": \00", align 1
@_ZN12_GLOBAL__N_12_1E = internal global %"struct.boost::arg" zeroinitializer, align 1
@_ZN12_GLOBAL__N_12_2E = internal global %"struct.boost::arg.0" zeroinitializer, align 1
@_ZN12_GLOBAL__N_12_3E = internal global %"struct.boost::arg.2" zeroinitializer, align 1
@_ZN12_GLOBAL__N_12_4E = internal global %"struct.boost::arg.4" zeroinitializer, align 1
@_ZN12_GLOBAL__N_12_5E = internal global %"struct.boost::arg.6" zeroinitializer, align 1
@_ZN12_GLOBAL__N_12_6E = internal global %"struct.boost::arg.8" zeroinitializer, align 1
@_ZN12_GLOBAL__N_12_7E = internal global %"struct.boost::arg.10" zeroinitializer, align 1
@_ZN12_GLOBAL__N_12_8E = internal global %"struct.boost::arg.12" zeroinitializer, align 1
@_ZN12_GLOBAL__N_12_9E = internal global %"struct.boost::arg.14" zeroinitializer, align 1
@buf = global %class.bounded_buffer zeroinitializer, align 4
@io_mutex = global %"class.boost::mutex" zeroinitializer, align 4
@_ZSt4cout = external global %"class.std::basic_ostream"
@.str15 = private unnamed_addr constant [7 x i8] c"sent: \00", align 1
@.str16 = private unnamed_addr constant [11 x i8] c"received: \00", align 1
@_ZTVN5boost6system14error_categoryE = linkonce_odr unnamed_addr constant [9 x i8*] [i8* null, i8* bitcast ({ i8*, i8*, i8* }* @_ZTIN5boost6system14error_categoryE to i8*), i8* bitcast (void (%"class.boost::system::error_category"*)* @_ZN5boost6system14error_categoryD1Ev to i8*), i8* bitcast (void (%"class.boost::system::error_category"*)* @_ZN5boost6system14error_categoryD0Ev to i8*), i8* bitcast (void ()* @__cxa_pure_virtual to i8*), i8* bitcast (void ()* @__cxa_pure_virtual to i8*), i8* bitcast (void (%"class.boost::system::error_condition"*, %"class.boost::system::error_category"*, i32)* @_ZNK5boost6system14error_category23default_error_conditionEi to i8*), i8* bitcast (i1 (%"class.boost::system::error_category"*, i32, %"class.boost::system::error_condition"*)* @_ZNK5boost6system14error_category10equivalentEiRKNS0_15error_conditionE to i8*), i8* bitcast (i1 (%"class.boost::system::error_category"*, %"class.boost::system::error_code"*, i32)* @_ZNK5boost6system14error_category10equivalentERKNS0_10error_codeEi to i8*)]
@_ZTVN10__cxxabiv120__si_class_type_infoE = external global i8*
@_ZTSN5boost6system14error_categoryE = linkonce_odr constant [32 x i8] c"N5boost6system14error_categoryE\00"
@_ZTVN10__cxxabiv117__class_type_infoE = external global i8*
@_ZTSN5boost12noncopyable_11noncopyableE = linkonce_odr constant [36 x i8] c"N5boost12noncopyable_11noncopyableE\00"
@_ZTIN5boost12noncopyable_11noncopyableE = linkonce_odr unnamed_addr constant { i8*, i8* } { i8* bitcast (i8** getelementptr inbounds (i8** @_ZTVN10__cxxabiv117__class_type_infoE, i32 2) to i8*), i8* getelementptr inbounds ([36 x i8]* @_ZTSN5boost12noncopyable_11noncopyableE, i32 0, i32 0) }
@_ZTIN5boost6system14error_categoryE = linkonce_odr unnamed_addr constant { i8*, i8*, i8* } { i8* bitcast (i8** getelementptr inbounds (i8** @_ZTVN10__cxxabiv120__si_class_type_infoE, i32 2) to i8*), i8* getelementptr inbounds ([32 x i8]* @_ZTSN5boost6system14error_categoryE, i32 0, i32 0), i8* bitcast ({ i8*, i8* }* @_ZTIN5boost12noncopyable_11noncopyableE to i8*) }
@_ZTVN5boost6system12system_errorE = linkonce_odr unnamed_addr constant [5 x i8*] [i8* null, i8* bitcast ({ i8*, i8*, i8* }* @_ZTIN5boost6system12system_errorE to i8*), i8* bitcast (void (%"class.boost::system::system_error"*)* @_ZN5boost6system12system_errorD1Ev to i8*), i8* bitcast (void (%"class.boost::system::system_error"*)* @_ZN5boost6system12system_errorD0Ev to i8*), i8* bitcast (i8* (%"class.boost::system::system_error"*)* @_ZNK5boost6system12system_error4whatEv to i8*)]
@_ZTSN5boost6system12system_errorE = linkonce_odr constant [30 x i8] c"N5boost6system12system_errorE\00"
@_ZTISt13runtime_error = external constant i8*
@_ZTIN5boost6system12system_errorE = linkonce_odr unnamed_addr constant { i8*, i8*, i8* } { i8* bitcast (i8** getelementptr inbounds (i8** @_ZTVN10__cxxabiv120__si_class_type_infoE, i32 2) to i8*), i8* getelementptr inbounds ([30 x i8]* @_ZTSN5boost6system12system_errorE, i32 0, i32 0), i8* bitcast (i8** @_ZTISt13runtime_error to i8*) }
@_ZTVN5boost6detail11thread_dataIPFvvEEE = linkonce_odr unnamed_addr constant [5 x i8*] [i8* null, i8* bitcast ({ i8*, i8*, i8* }* @_ZTIN5boost6detail11thread_dataIPFvvEEE to i8*), i8* bitcast (void (%"class.boost::detail::thread_data"*)* @_ZN5boost6detail11thread_dataIPFvvEED1Ev to i8*), i8* bitcast (void (%"class.boost::detail::thread_data"*)* @_ZN5boost6detail11thread_dataIPFvvEED0Ev to i8*), i8* bitcast (void (%"class.boost::detail::thread_data"*)* @_ZN5boost6detail11thread_dataIPFvvEE3runEv to i8*)]
@_ZTSN5boost6detail11thread_dataIPFvvEEE = linkonce_odr constant [36 x i8] c"N5boost6detail11thread_dataIPFvvEEE\00"
@_ZTIN5boost6detail16thread_data_baseE = external constant i8*
@_ZTIN5boost6detail11thread_dataIPFvvEEE = linkonce_odr unnamed_addr constant { i8*, i8*, i8* } { i8* bitcast (i8** getelementptr inbounds (i8** @_ZTVN10__cxxabiv120__si_class_type_infoE, i32 2) to i8*), i8* getelementptr inbounds ([36 x i8]* @_ZTSN5boost6detail11thread_dataIPFvvEEE, i32 0, i32 0), i8* bitcast (i8** @_ZTIN5boost6detail16thread_data_baseE to i8*) }
@_ZTVN5boost6detail16thread_data_baseE = external unnamed_addr constant [5 x i8*]
@.str17 = private unnamed_addr constant [40 x i8] c"!pthread_mutex_destroy(&internal_mutex)\00", align 1
@.str18 = private unnamed_addr constant [74 x i8] c"/home/thomas/boost_1_52_0/boost/thread/pthread/condition_variable_fwd.hpp\00", align 1
@__PRETTY_FUNCTION__._ZN5boost18condition_variableD2Ev = private unnamed_addr constant [49 x i8] c"boost::condition_variable::~condition_variable()\00", align 1
@.str19 = private unnamed_addr constant [5 x i8] c"!ret\00", align 1
@.str20 = private unnamed_addr constant [68 x i8] c"boost:: condition_variable constructor failed in pthread_mutex_init\00", align 1
@__PRETTY_FUNCTION__._ZN5boost18condition_variableC2Ev = private unnamed_addr constant [48 x i8] c"boost::condition_variable::condition_variable()\00", align 1
@.str21 = private unnamed_addr constant [67 x i8] c"boost:: condition_variable constructor failed in pthread_cond_init\00", align 1
@_ZTVN5boost21thread_resource_errorE = linkonce_odr unnamed_addr constant [5 x i8*] [i8* null, i8* bitcast ({ i8*, i8*, i8* }* @_ZTIN5boost21thread_resource_errorE to i8*), i8* bitcast (void (%"class.boost::thread_resource_error"*)* @_ZN5boost21thread_resource_errorD1Ev to i8*), i8* bitcast (void (%"class.boost::thread_resource_error"*)* @_ZN5boost21thread_resource_errorD0Ev to i8*), i8* bitcast (i8* (%"class.boost::system::system_error"*)* @_ZNK5boost6system12system_error4whatEv to i8*)]
@_ZTSN5boost21thread_resource_errorE = linkonce_odr constant [32 x i8] c"N5boost21thread_resource_errorE\00"
@_ZTSN5boost16thread_exceptionE = linkonce_odr constant [27 x i8] c"N5boost16thread_exceptionE\00"
@_ZTIN5boost16thread_exceptionE = linkonce_odr unnamed_addr constant { i8*, i8*, i8* } { i8* bitcast (i8** getelementptr inbounds (i8** @_ZTVN10__cxxabiv120__si_class_type_infoE, i32 2) to i8*), i8* getelementptr inbounds ([27 x i8]* @_ZTSN5boost16thread_exceptionE, i32 0, i32 0), i8* bitcast ({ i8*, i8*, i8* }* @_ZTIN5boost6system12system_errorE to i8*) }
@_ZTIN5boost21thread_resource_errorE = linkonce_odr unnamed_addr constant { i8*, i8*, i8* } { i8* bitcast (i8** getelementptr inbounds (i8** @_ZTVN10__cxxabiv120__si_class_type_infoE, i32 2) to i8*), i8* getelementptr inbounds ([32 x i8]* @_ZTSN5boost21thread_resource_errorE, i32 0, i32 0), i8* bitcast ({ i8*, i8*, i8* }* @_ZTIN5boost16thread_exceptionE to i8*) }
@_ZTVN5boost16thread_exceptionE = linkonce_odr unnamed_addr constant [5 x i8*] [i8* null, i8* bitcast ({ i8*, i8*, i8* }* @_ZTIN5boost16thread_exceptionE to i8*), i8* bitcast (void (%"class.boost::thread_exception"*)* @_ZN5boost16thread_exceptionD1Ev to i8*), i8* bitcast (void (%"class.boost::thread_exception"*)* @_ZN5boost16thread_exceptionD0Ev to i8*), i8* bitcast (i8* (%"class.boost::system::system_error"*)* @_ZNK5boost6system12system_error4whatEv to i8*)]
@_ZTVN10__cxxabiv121__vmi_class_type_infoE = external global i8*
@_ZTSN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_21thread_resource_errorEEEEE = linkonce_odr constant [96 x i8] c"N5boost16exception_detail10clone_implINS0_19error_info_injectorINS_21thread_resource_errorEEEEE\00"
@_ZTSN5boost16exception_detail19error_info_injectorINS_21thread_resource_errorEEE = linkonce_odr constant [77 x i8] c"N5boost16exception_detail19error_info_injectorINS_21thread_resource_errorEEE\00"
@_ZTSN5boost9exceptionE = linkonce_odr constant [19 x i8] c"N5boost9exceptionE\00"
@_ZTIN5boost9exceptionE = linkonce_odr unnamed_addr constant { i8*, i8* } { i8* bitcast (i8** getelementptr inbounds (i8** @_ZTVN10__cxxabiv117__class_type_infoE, i32 2) to i8*), i8* getelementptr inbounds ([19 x i8]* @_ZTSN5boost9exceptionE, i32 0, i32 0) }
@_ZTIN5boost16exception_detail19error_info_injectorINS_21thread_resource_errorEEE = linkonce_odr unnamed_addr constant { i8*, i8*, i32, i32, i8*, i32, i8*, i32 } { i8* bitcast (i8** getelementptr inbounds (i8** @_ZTVN10__cxxabiv121__vmi_class_type_infoE, i32 2) to i8*), i8* getelementptr inbounds ([77 x i8]* @_ZTSN5boost16exception_detail19error_info_injectorINS_21thread_resource_errorEEE, i32 0, i32 0), i32 0, i32 2, i8* bitcast ({ i8*, i8*, i8* }* @_ZTIN5boost21thread_resource_errorE to i8*), i32 2, i8* bitcast ({ i8*, i8* }* @_ZTIN5boost9exceptionE to i8*), i32 5122 }
@_ZTSN5boost16exception_detail10clone_baseE = linkonce_odr constant [39 x i8] c"N5boost16exception_detail10clone_baseE\00"
@_ZTIN5boost16exception_detail10clone_baseE = linkonce_odr unnamed_addr constant { i8*, i8* } { i8* bitcast (i8** getelementptr inbounds (i8** @_ZTVN10__cxxabiv117__class_type_infoE, i32 2) to i8*), i8* getelementptr inbounds ([39 x i8]* @_ZTSN5boost16exception_detail10clone_baseE, i32 0, i32 0) }
@_ZTIN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_21thread_resource_errorEEEEE = linkonce_odr unnamed_addr constant { i8*, i8*, i32, i32, i8*, i32, i8*, i32 } { i8* bitcast (i8** getelementptr inbounds (i8** @_ZTVN10__cxxabiv121__vmi_class_type_infoE, i32 2) to i8*), i8* getelementptr inbounds ([96 x i8]* @_ZTSN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_21thread_resource_errorEEEEE, i32 0, i32 0), i32 0, i32 2, i8* bitcast ({ i8*, i8*, i32, i32, i8*, i32, i8*, i32 }* @_ZTIN5boost16exception_detail19error_info_injectorINS_21thread_resource_errorEEE to i8*), i32 2, i8* bitcast ({ i8*, i8* }* @_ZTIN5boost16exception_detail10clone_baseE to i8*), i32 -3069 }
@_ZTVN5boost9exceptionE = linkonce_odr unnamed_addr constant [4 x i8*] [i8* null, i8* bitcast ({ i8*, i8* }* @_ZTIN5boost9exceptionE to i8*), i8* bitcast (void ()* @__cxa_pure_virtual to i8*), i8* bitcast (void ()* @__cxa_pure_virtual to i8*)]
@_ZTVN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_21thread_resource_errorEEEEE = linkonce_odr unnamed_addr constant [21 x i8*] [i8* inttoptr (i32 40 to i8*), i8* null, i8* bitcast ({ i8*, i8*, i32, i32, i8*, i32, i8*, i32 }* @_ZTIN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_21thread_resource_errorEEEEE to i8*), i8* bitcast (void (%"class.boost::exception_detail::clone_impl"*)* @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_21thread_resource_errorEEEED1Ev to i8*), i8* bitcast (void (%"class.boost::exception_detail::clone_impl"*)* @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_21thread_resource_errorEEEED0Ev to i8*), i8* bitcast (i8* (%"class.boost::system::system_error"*)* @_ZNK5boost6system12system_error4whatEv to i8*), i8* bitcast (%"class.boost::exception_detail::clone_base"* (%"class.boost::exception_detail::clone_impl"*)* @_ZNK5boost16exception_detail10clone_implINS0_19error_info_injectorINS_21thread_resource_errorEEEE5cloneEv to i8*), i8* bitcast (void (%"class.boost::exception_detail::clone_impl"*)* @_ZNK5boost16exception_detail10clone_implINS0_19error_info_injectorINS_21thread_resource_errorEEEE7rethrowEv to i8*), i8* inttoptr (i32 -20 to i8*), i8* bitcast ({ i8*, i8*, i32, i32, i8*, i32, i8*, i32 }* @_ZTIN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_21thread_resource_errorEEEEE to i8*), i8* bitcast (void (%"class.boost::exception_detail::clone_impl"*)* @_ZThn20_N5boost16exception_detail10clone_implINS0_19error_info_injectorINS_21thread_resource_errorEEEED1Ev to i8*), i8* bitcast (void (%"class.boost::exception_detail::clone_impl"*)* @_ZThn20_N5boost16exception_detail10clone_implINS0_19error_info_injectorINS_21thread_resource_errorEEEED0Ev to i8*), i8* inttoptr (i32 -40 to i8*), i8* inttoptr (i32 -40 to i8*), i8* inttoptr (i32 -40 to i8*), i8* inttoptr (i32 -40 to i8*), i8* bitcast ({ i8*, i8*, i32, i32, i8*, i32, i8*, i32 }* @_ZTIN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_21thread_resource_errorEEEEE to i8*), i8* bitcast (%"class.boost::exception_detail::clone_base"* (%"class.boost::exception_detail::clone_impl"*)* @_ZTv0_n12_NK5boost16exception_detail10clone_implINS0_19error_info_injectorINS_21thread_resource_errorEEEE5cloneEv to i8*), i8* bitcast (void (%"class.boost::exception_detail::clone_impl"*)* @_ZTv0_n16_NK5boost16exception_detail10clone_implINS0_19error_info_injectorINS_21thread_resource_errorEEEE7rethrowEv to i8*), i8* bitcast (void (%"class.boost::exception_detail::clone_impl"*)* @_ZTv0_n20_N5boost16exception_detail10clone_implINS0_19error_info_injectorINS_21thread_resource_errorEEEED1Ev to i8*), i8* bitcast (void (%"class.boost::exception_detail::clone_impl"*)* @_ZTv0_n20_N5boost16exception_detail10clone_implINS0_19error_info_injectorINS_21thread_resource_errorEEEED0Ev to i8*)]
@_ZTTN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_21thread_resource_errorEEEEE = linkonce_odr unnamed_addr constant [2 x i8*] [i8* bitcast (i8** getelementptr inbounds ([21 x i8*]* @_ZTVN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_21thread_resource_errorEEEEE, i64 0, i64 3) to i8*), i8* bitcast (i8** getelementptr inbounds ([21 x i8*]* @_ZTVN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_21thread_resource_errorEEEEE, i64 0, i64 17) to i8*)]
@_ZTVN5boost16exception_detail19error_info_injectorINS_21thread_resource_errorEEE = linkonce_odr unnamed_addr constant [9 x i8*] [i8* null, i8* bitcast ({ i8*, i8*, i32, i32, i8*, i32, i8*, i32 }* @_ZTIN5boost16exception_detail19error_info_injectorINS_21thread_resource_errorEEE to i8*), i8* bitcast (void (%"struct.boost::exception_detail::error_info_injector"*)* @_ZN5boost16exception_detail19error_info_injectorINS_21thread_resource_errorEED1Ev to i8*), i8* bitcast (void (%"struct.boost::exception_detail::error_info_injector"*)* @_ZN5boost16exception_detail19error_info_injectorINS_21thread_resource_errorEED0Ev to i8*), i8* bitcast (i8* (%"class.boost::system::system_error"*)* @_ZNK5boost6system12system_error4whatEv to i8*), i8* inttoptr (i32 -20 to i8*), i8* bitcast ({ i8*, i8*, i32, i32, i8*, i32, i8*, i32 }* @_ZTIN5boost16exception_detail19error_info_injectorINS_21thread_resource_errorEEE to i8*), i8* bitcast (void (%"struct.boost::exception_detail::error_info_injector"*)* @_ZThn20_N5boost16exception_detail19error_info_injectorINS_21thread_resource_errorEED1Ev to i8*), i8* bitcast (void (%"struct.boost::exception_detail::error_info_injector"*)* @_ZThn20_N5boost16exception_detail19error_info_injectorINS_21thread_resource_errorEED0Ev to i8*)]
@_ZTVSt13runtime_error = external unnamed_addr constant [5 x i8*]
@_ZTVSt9exception = external unnamed_addr constant [5 x i8*]
@_ZTVN5boost16exception_detail10clone_baseE = linkonce_odr unnamed_addr constant [6 x i8*] [i8* null, i8* bitcast ({ i8*, i8* }* @_ZTIN5boost16exception_detail10clone_baseE to i8*), i8* bitcast (void ()* @__cxa_pure_virtual to i8*), i8* bitcast (void ()* @__cxa_pure_virtual to i8*), i8* bitcast (void (%"class.boost::exception_detail::clone_base"*)* @_ZN5boost16exception_detail10clone_baseD1Ev to i8*), i8* bitcast (void (%"class.boost::exception_detail::clone_base"*)* @_ZN5boost16exception_detail10clone_baseD0Ev to i8*)]
@_ZTVN5boost6detail17sp_counted_impl_pINS0_11thread_dataIPFvvEEEEE = linkonce_odr unnamed_addr constant [7 x i8*] [i8* null, i8* bitcast ({ i8*, i8*, i8* }* @_ZTIN5boost6detail17sp_counted_impl_pINS0_11thread_dataIPFvvEEEEE to i8*), i8* bitcast (void (%"class.boost::detail::sp_counted_impl_p"*)* @_ZN5boost6detail17sp_counted_impl_pINS0_11thread_dataIPFvvEEEED1Ev to i8*), i8* bitcast (void (%"class.boost::detail::sp_counted_impl_p"*)* @_ZN5boost6detail17sp_counted_impl_pINS0_11thread_dataIPFvvEEEED0Ev to i8*), i8* bitcast (void (%"class.boost::detail::sp_counted_impl_p"*)* @_ZN5boost6detail17sp_counted_impl_pINS0_11thread_dataIPFvvEEEE7disposeEv to i8*), i8* bitcast (void (%"class.boost::detail::sp_counted_base"*)* @_ZN5boost6detail15sp_counted_base7destroyEv to i8*), i8* bitcast (i8* (%"class.boost::detail::sp_counted_impl_p"*, %"class.std::type_info"*)* @_ZN5boost6detail17sp_counted_impl_pINS0_11thread_dataIPFvvEEEE11get_deleterERKSt9type_info to i8*)]
@_ZTSN5boost6detail17sp_counted_impl_pINS0_11thread_dataIPFvvEEEEE = linkonce_odr constant [62 x i8] c"N5boost6detail17sp_counted_impl_pINS0_11thread_dataIPFvvEEEEE\00"
@_ZTSN5boost6detail15sp_counted_baseE = linkonce_odr constant [33 x i8] c"N5boost6detail15sp_counted_baseE\00"
@_ZTIN5boost6detail15sp_counted_baseE = linkonce_odr unnamed_addr constant { i8*, i8* } { i8* bitcast (i8** getelementptr inbounds (i8** @_ZTVN10__cxxabiv117__class_type_infoE, i32 2) to i8*), i8* getelementptr inbounds ([33 x i8]* @_ZTSN5boost6detail15sp_counted_baseE, i32 0, i32 0) }
@_ZTIN5boost6detail17sp_counted_impl_pINS0_11thread_dataIPFvvEEEEE = linkonce_odr unnamed_addr constant { i8*, i8*, i8* } { i8* bitcast (i8** getelementptr inbounds (i8** @_ZTVN10__cxxabiv120__si_class_type_infoE, i32 2) to i8*), i8* getelementptr inbounds ([62 x i8]* @_ZTSN5boost6detail17sp_counted_impl_pINS0_11thread_dataIPFvvEEEEE, i32 0, i32 0), i8* bitcast ({ i8*, i8* }* @_ZTIN5boost6detail15sp_counted_baseE to i8*) }
@_ZTVN5boost6detail15sp_counted_baseE = linkonce_odr unnamed_addr constant [7 x i8*] [i8* null, i8* bitcast ({ i8*, i8* }* @_ZTIN5boost6detail15sp_counted_baseE to i8*), i8* bitcast (void (%"class.boost::detail::sp_counted_base"*)* @_ZN5boost6detail15sp_counted_baseD1Ev to i8*), i8* bitcast (void (%"class.boost::detail::sp_counted_base"*)* @_ZN5boost6detail15sp_counted_baseD0Ev to i8*), i8* bitcast (void ()* @__cxa_pure_virtual to i8*), i8* bitcast (void (%"class.boost::detail::sp_counted_base"*)* @_ZN5boost6detail15sp_counted_base7destroyEv to i8*), i8* bitcast (void ()* @__cxa_pure_virtual to i8*)]
@.str22 = private unnamed_addr constant [57 x i8] c"/home/thomas/boost_1_52_0/boost/thread/pthread/mutex.hpp\00", align 1
@__PRETTY_FUNCTION__._ZN5boost5mutex6unlockEv = private unnamed_addr constant [28 x i8] c"void boost::mutex::unlock()\00", align 1
@.str23 = private unnamed_addr constant [31 x i8] c"boost unique_lock has no mutex\00", align 1
@.str24 = private unnamed_addr constant [41 x i8] c"boost unique_lock owns already the mutex\00", align 1
@.str25 = private unnamed_addr constant [47 x i8] c"boost: mutex lock failed in pthread_mutex_lock\00", align 1
@_ZTVN5boost10lock_errorE = linkonce_odr unnamed_addr constant [5 x i8*] [i8* null, i8* bitcast ({ i8*, i8*, i8* }* @_ZTIN5boost10lock_errorE to i8*), i8* bitcast (void (%"class.boost::lock_error"*)* @_ZN5boost10lock_errorD1Ev to i8*), i8* bitcast (void (%"class.boost::lock_error"*)* @_ZN5boost10lock_errorD0Ev to i8*), i8* bitcast (i8* (%"class.boost::system::system_error"*)* @_ZNK5boost6system12system_error4whatEv to i8*)]
@_ZTSN5boost10lock_errorE = linkonce_odr constant [21 x i8] c"N5boost10lock_errorE\00"
@_ZTIN5boost10lock_errorE = linkonce_odr unnamed_addr constant { i8*, i8*, i8* } { i8* bitcast (i8** getelementptr inbounds (i8** @_ZTVN10__cxxabiv120__si_class_type_infoE, i32 2) to i8*), i8* getelementptr inbounds ([21 x i8]* @_ZTSN5boost10lock_errorE, i32 0, i32 0), i8* bitcast ({ i8*, i8*, i8* }* @_ZTIN5boost16thread_exceptionE to i8*) }
@_ZTSN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_10lock_errorEEEEE = linkonce_odr constant [85 x i8] c"N5boost16exception_detail10clone_implINS0_19error_info_injectorINS_10lock_errorEEEEE\00"
@_ZTSN5boost16exception_detail19error_info_injectorINS_10lock_errorEEE = linkonce_odr constant [66 x i8] c"N5boost16exception_detail19error_info_injectorINS_10lock_errorEEE\00"
@_ZTIN5boost16exception_detail19error_info_injectorINS_10lock_errorEEE = linkonce_odr unnamed_addr constant { i8*, i8*, i32, i32, i8*, i32, i8*, i32 } { i8* bitcast (i8** getelementptr inbounds (i8** @_ZTVN10__cxxabiv121__vmi_class_type_infoE, i32 2) to i8*), i8* getelementptr inbounds ([66 x i8]* @_ZTSN5boost16exception_detail19error_info_injectorINS_10lock_errorEEE, i32 0, i32 0), i32 0, i32 2, i8* bitcast ({ i8*, i8*, i8* }* @_ZTIN5boost10lock_errorE to i8*), i32 2, i8* bitcast ({ i8*, i8* }* @_ZTIN5boost9exceptionE to i8*), i32 5122 }
@_ZTIN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_10lock_errorEEEEE = linkonce_odr unnamed_addr constant { i8*, i8*, i32, i32, i8*, i32, i8*, i32 } { i8* bitcast (i8** getelementptr inbounds (i8** @_ZTVN10__cxxabiv121__vmi_class_type_infoE, i32 2) to i8*), i8* getelementptr inbounds ([85 x i8]* @_ZTSN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_10lock_errorEEEEE, i32 0, i32 0), i32 0, i32 2, i8* bitcast ({ i8*, i8*, i32, i32, i8*, i32, i8*, i32 }* @_ZTIN5boost16exception_detail19error_info_injectorINS_10lock_errorEEE to i8*), i32 2, i8* bitcast ({ i8*, i8* }* @_ZTIN5boost16exception_detail10clone_baseE to i8*), i32 -3069 }
@_ZTVN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_10lock_errorEEEEE = linkonce_odr unnamed_addr constant [21 x i8*] [i8* inttoptr (i32 40 to i8*), i8* null, i8* bitcast ({ i8*, i8*, i32, i32, i8*, i32, i8*, i32 }* @_ZTIN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_10lock_errorEEEEE to i8*), i8* bitcast (void (%"class.boost::exception_detail::clone_impl.32"*)* @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_10lock_errorEEEED1Ev to i8*), i8* bitcast (void (%"class.boost::exception_detail::clone_impl.32"*)* @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_10lock_errorEEEED0Ev to i8*), i8* bitcast (i8* (%"class.boost::system::system_error"*)* @_ZNK5boost6system12system_error4whatEv to i8*), i8* bitcast (%"class.boost::exception_detail::clone_base"* (%"class.boost::exception_detail::clone_impl.32"*)* @_ZNK5boost16exception_detail10clone_implINS0_19error_info_injectorINS_10lock_errorEEEE5cloneEv to i8*), i8* bitcast (void (%"class.boost::exception_detail::clone_impl.32"*)* @_ZNK5boost16exception_detail10clone_implINS0_19error_info_injectorINS_10lock_errorEEEE7rethrowEv to i8*), i8* inttoptr (i32 -20 to i8*), i8* bitcast ({ i8*, i8*, i32, i32, i8*, i32, i8*, i32 }* @_ZTIN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_10lock_errorEEEEE to i8*), i8* bitcast (void (%"class.boost::exception_detail::clone_impl.32"*)* @_ZThn20_N5boost16exception_detail10clone_implINS0_19error_info_injectorINS_10lock_errorEEEED1Ev to i8*), i8* bitcast (void (%"class.boost::exception_detail::clone_impl.32"*)* @_ZThn20_N5boost16exception_detail10clone_implINS0_19error_info_injectorINS_10lock_errorEEEED0Ev to i8*), i8* inttoptr (i32 -40 to i8*), i8* inttoptr (i32 -40 to i8*), i8* inttoptr (i32 -40 to i8*), i8* inttoptr (i32 -40 to i8*), i8* bitcast ({ i8*, i8*, i32, i32, i8*, i32, i8*, i32 }* @_ZTIN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_10lock_errorEEEEE to i8*), i8* bitcast (%"class.boost::exception_detail::clone_base"* (%"class.boost::exception_detail::clone_impl.32"*)* @_ZTv0_n12_NK5boost16exception_detail10clone_implINS0_19error_info_injectorINS_10lock_errorEEEE5cloneEv to i8*), i8* bitcast (void (%"class.boost::exception_detail::clone_impl.32"*)* @_ZTv0_n16_NK5boost16exception_detail10clone_implINS0_19error_info_injectorINS_10lock_errorEEEE7rethrowEv to i8*), i8* bitcast (void (%"class.boost::exception_detail::clone_impl.32"*)* @_ZTv0_n20_N5boost16exception_detail10clone_implINS0_19error_info_injectorINS_10lock_errorEEEED1Ev to i8*), i8* bitcast (void (%"class.boost::exception_detail::clone_impl.32"*)* @_ZTv0_n20_N5boost16exception_detail10clone_implINS0_19error_info_injectorINS_10lock_errorEEEED0Ev to i8*)]
@_ZTTN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_10lock_errorEEEEE = linkonce_odr unnamed_addr constant [2 x i8*] [i8* bitcast (i8** getelementptr inbounds ([21 x i8*]* @_ZTVN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_10lock_errorEEEEE, i64 0, i64 3) to i8*), i8* bitcast (i8** getelementptr inbounds ([21 x i8*]* @_ZTVN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_10lock_errorEEEEE, i64 0, i64 17) to i8*)]
@_ZTVN5boost16exception_detail19error_info_injectorINS_10lock_errorEEE = linkonce_odr unnamed_addr constant [9 x i8*] [i8* null, i8* bitcast ({ i8*, i8*, i32, i32, i8*, i32, i8*, i32 }* @_ZTIN5boost16exception_detail19error_info_injectorINS_10lock_errorEEE to i8*), i8* bitcast (void (%"struct.boost::exception_detail::error_info_injector.33"*)* @_ZN5boost16exception_detail19error_info_injectorINS_10lock_errorEED1Ev to i8*), i8* bitcast (void (%"struct.boost::exception_detail::error_info_injector.33"*)* @_ZN5boost16exception_detail19error_info_injectorINS_10lock_errorEED0Ev to i8*), i8* bitcast (i8* (%"class.boost::system::system_error"*)* @_ZNK5boost6system12system_error4whatEv to i8*), i8* inttoptr (i32 -20 to i8*), i8* bitcast ({ i8*, i8*, i32, i32, i8*, i32, i8*, i32 }* @_ZTIN5boost16exception_detail19error_info_injectorINS_10lock_errorEEE to i8*), i8* bitcast (void (%"struct.boost::exception_detail::error_info_injector.33"*)* @_ZThn20_N5boost16exception_detail19error_info_injectorINS_10lock_errorEED1Ev to i8*), i8* bitcast (void (%"struct.boost::exception_detail::error_info_injector.33"*)* @_ZThn20_N5boost16exception_detail19error_info_injectorINS_10lock_errorEED0Ev to i8*)]
@.str26 = private unnamed_addr constant [28 x i8] c"!pthread_cond_signal(&cond)\00", align 1
@.str27 = private unnamed_addr constant [70 x i8] c"/home/thomas/boost_1_52_0/boost/thread/pthread/condition_variable.hpp\00", align 1
@__PRETTY_FUNCTION__._ZN5boost22condition_variable_any10notify_oneEv = private unnamed_addr constant [49 x i8] c"void boost::condition_variable_any::notify_one()\00", align 1
@.str28 = private unnamed_addr constant [25 x i8] c"!pthread_mutex_unlock(m)\00", align 1
@.str29 = private unnamed_addr constant [77 x i8] c"/home/thomas/boost_1_52_0/boost/thread/pthread/pthread_mutex_scoped_lock.hpp\00", align 1
@__PRETTY_FUNCTION__._ZN5boost7pthread25pthread_mutex_scoped_lock6unlockEv = private unnamed_addr constant [57 x i8] c"void boost::pthread::pthread_mutex_scoped_lock::unlock()\00", align 1
@.str30 = private unnamed_addr constant [23 x i8] c"!pthread_mutex_lock(m)\00", align 1
@__PRETTY_FUNCTION__._ZN5boost7pthread25pthread_mutex_scoped_lockC2EP15pthread_mutex_t = private unnamed_addr constant [88 x i8] c"boost::pthread::pthread_mutex_scoped_lock::pthread_mutex_scoped_lock(pthread_mutex_t *)\00", align 1
@.str31 = private unnamed_addr constant [51 x i8] c"condition_variable_any failed in pthread_cond_wait\00", align 1
@_ZTVN5boost15condition_errorE = linkonce_odr unnamed_addr constant [5 x i8*] [i8* null, i8* bitcast ({ i8*, i8*, i8* }* @_ZTIN5boost15condition_errorE to i8*), i8* bitcast (void (%"class.boost::condition_error"*)* @_ZN5boost15condition_errorD1Ev to i8*), i8* bitcast (void (%"class.boost::condition_error"*)* @_ZN5boost15condition_errorD0Ev to i8*), i8* bitcast (i8* (%"class.boost::system::system_error"*)* @_ZNK5boost6system12system_error4whatEv to i8*)]
@_ZTSN5boost15condition_errorE = linkonce_odr constant [26 x i8] c"N5boost15condition_errorE\00"
@_ZTIN5boost15condition_errorE = linkonce_odr unnamed_addr constant { i8*, i8*, i8* } { i8* bitcast (i8** getelementptr inbounds (i8** @_ZTVN10__cxxabiv120__si_class_type_infoE, i32 2) to i8*), i8* getelementptr inbounds ([26 x i8]* @_ZTSN5boost15condition_errorE, i32 0, i32 0), i8* bitcast ({ i8*, i8*, i8* }* @_ZTIN5boost6system12system_errorE to i8*) }
@_ZTSN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_15condition_errorEEEEE = linkonce_odr constant [90 x i8] c"N5boost16exception_detail10clone_implINS0_19error_info_injectorINS_15condition_errorEEEEE\00"
@_ZTSN5boost16exception_detail19error_info_injectorINS_15condition_errorEEE = linkonce_odr constant [71 x i8] c"N5boost16exception_detail19error_info_injectorINS_15condition_errorEEE\00"
@_ZTIN5boost16exception_detail19error_info_injectorINS_15condition_errorEEE = linkonce_odr unnamed_addr constant { i8*, i8*, i32, i32, i8*, i32, i8*, i32 } { i8* bitcast (i8** getelementptr inbounds (i8** @_ZTVN10__cxxabiv121__vmi_class_type_infoE, i32 2) to i8*), i8* getelementptr inbounds ([71 x i8]* @_ZTSN5boost16exception_detail19error_info_injectorINS_15condition_errorEEE, i32 0, i32 0), i32 0, i32 2, i8* bitcast ({ i8*, i8*, i8* }* @_ZTIN5boost15condition_errorE to i8*), i32 2, i8* bitcast ({ i8*, i8* }* @_ZTIN5boost9exceptionE to i8*), i32 5122 }
@_ZTIN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_15condition_errorEEEEE = linkonce_odr unnamed_addr constant { i8*, i8*, i32, i32, i8*, i32, i8*, i32 } { i8* bitcast (i8** getelementptr inbounds (i8** @_ZTVN10__cxxabiv121__vmi_class_type_infoE, i32 2) to i8*), i8* getelementptr inbounds ([90 x i8]* @_ZTSN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_15condition_errorEEEEE, i32 0, i32 0), i32 0, i32 2, i8* bitcast ({ i8*, i8*, i32, i32, i8*, i32, i8*, i32 }* @_ZTIN5boost16exception_detail19error_info_injectorINS_15condition_errorEEE to i8*), i32 2, i8* bitcast ({ i8*, i8* }* @_ZTIN5boost16exception_detail10clone_baseE to i8*), i32 -3069 }
@_ZTVN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_15condition_errorEEEEE = linkonce_odr unnamed_addr constant [21 x i8*] [i8* inttoptr (i32 40 to i8*), i8* null, i8* bitcast ({ i8*, i8*, i32, i32, i8*, i32, i8*, i32 }* @_ZTIN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_15condition_errorEEEEE to i8*), i8* bitcast (void (%"class.boost::exception_detail::clone_impl.35"*)* @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_15condition_errorEEEED1Ev to i8*), i8* bitcast (void (%"class.boost::exception_detail::clone_impl.35"*)* @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_15condition_errorEEEED0Ev to i8*), i8* bitcast (i8* (%"class.boost::system::system_error"*)* @_ZNK5boost6system12system_error4whatEv to i8*), i8* bitcast (%"class.boost::exception_detail::clone_base"* (%"class.boost::exception_detail::clone_impl.35"*)* @_ZNK5boost16exception_detail10clone_implINS0_19error_info_injectorINS_15condition_errorEEEE5cloneEv to i8*), i8* bitcast (void (%"class.boost::exception_detail::clone_impl.35"*)* @_ZNK5boost16exception_detail10clone_implINS0_19error_info_injectorINS_15condition_errorEEEE7rethrowEv to i8*), i8* inttoptr (i32 -20 to i8*), i8* bitcast ({ i8*, i8*, i32, i32, i8*, i32, i8*, i32 }* @_ZTIN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_15condition_errorEEEEE to i8*), i8* bitcast (void (%"class.boost::exception_detail::clone_impl.35"*)* @_ZThn20_N5boost16exception_detail10clone_implINS0_19error_info_injectorINS_15condition_errorEEEED1Ev to i8*), i8* bitcast (void (%"class.boost::exception_detail::clone_impl.35"*)* @_ZThn20_N5boost16exception_detail10clone_implINS0_19error_info_injectorINS_15condition_errorEEEED0Ev to i8*), i8* inttoptr (i32 -40 to i8*), i8* inttoptr (i32 -40 to i8*), i8* inttoptr (i32 -40 to i8*), i8* inttoptr (i32 -40 to i8*), i8* bitcast ({ i8*, i8*, i32, i32, i8*, i32, i8*, i32 }* @_ZTIN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_15condition_errorEEEEE to i8*), i8* bitcast (%"class.boost::exception_detail::clone_base"* (%"class.boost::exception_detail::clone_impl.35"*)* @_ZTv0_n12_NK5boost16exception_detail10clone_implINS0_19error_info_injectorINS_15condition_errorEEEE5cloneEv to i8*), i8* bitcast (void (%"class.boost::exception_detail::clone_impl.35"*)* @_ZTv0_n16_NK5boost16exception_detail10clone_implINS0_19error_info_injectorINS_15condition_errorEEEE7rethrowEv to i8*), i8* bitcast (void (%"class.boost::exception_detail::clone_impl.35"*)* @_ZTv0_n20_N5boost16exception_detail10clone_implINS0_19error_info_injectorINS_15condition_errorEEEED1Ev to i8*), i8* bitcast (void (%"class.boost::exception_detail::clone_impl.35"*)* @_ZTv0_n20_N5boost16exception_detail10clone_implINS0_19error_info_injectorINS_15condition_errorEEEED0Ev to i8*)]
@_ZTTN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_15condition_errorEEEEE = linkonce_odr unnamed_addr constant [2 x i8*] [i8* bitcast (i8** getelementptr inbounds ([21 x i8*]* @_ZTVN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_15condition_errorEEEEE, i64 0, i64 3) to i8*), i8* bitcast (i8** getelementptr inbounds ([21 x i8*]* @_ZTVN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_15condition_errorEEEEE, i64 0, i64 17) to i8*)]
@_ZTVN5boost16exception_detail19error_info_injectorINS_15condition_errorEEE = linkonce_odr unnamed_addr constant [9 x i8*] [i8* null, i8* bitcast ({ i8*, i8*, i32, i32, i8*, i32, i8*, i32 }* @_ZTIN5boost16exception_detail19error_info_injectorINS_15condition_errorEEE to i8*), i8* bitcast (void (%"struct.boost::exception_detail::error_info_injector.36"*)* @_ZN5boost16exception_detail19error_info_injectorINS_15condition_errorEED1Ev to i8*), i8* bitcast (void (%"struct.boost::exception_detail::error_info_injector.36"*)* @_ZN5boost16exception_detail19error_info_injectorINS_15condition_errorEED0Ev to i8*), i8* bitcast (i8* (%"class.boost::system::system_error"*)* @_ZNK5boost6system12system_error4whatEv to i8*), i8* inttoptr (i32 -20 to i8*), i8* bitcast ({ i8*, i8*, i32, i32, i8*, i32, i8*, i32 }* @_ZTIN5boost16exception_detail19error_info_injectorINS_15condition_errorEEE to i8*), i8* bitcast (void (%"struct.boost::exception_detail::error_info_injector.36"*)* @_ZThn20_N5boost16exception_detail19error_info_injectorINS_15condition_errorEED1Ev to i8*), i8* bitcast (void (%"struct.boost::exception_detail::error_info_injector.36"*)* @_ZThn20_N5boost16exception_detail19error_info_injectorINS_15condition_errorEED0Ev to i8*)]
@.str32 = private unnamed_addr constant [63 x i8] c"/home/thomas/boost_1_52_0/boost/thread/pthread/thread_data.hpp\00", align 1
@__PRETTY_FUNCTION__._ZN5boost6detail20interruption_checkerD2Ev = private unnamed_addr constant [61 x i8] c"boost::detail::interruption_checker::~interruption_checker()\00", align 1
@.str33 = private unnamed_addr constant [40 x i8] c"boost unique_lock doesn't own the mutex\00", align 1
@__PRETTY_FUNCTION__._ZN5boost6detail20interruption_checkerC2EP15pthread_mutex_tP14pthread_cond_t = private unnamed_addr constant [95 x i8] c"boost::detail::interruption_checker::interruption_checker(pthread_mutex_t *, pthread_cond_t *)\00", align 1
@_ZTSN5boost18thread_interruptedE = linkonce_odr constant [29 x i8] c"N5boost18thread_interruptedE\00"
@_ZTIN5boost18thread_interruptedE = linkonce_odr unnamed_addr constant { i8*, i8* } { i8* bitcast (i8** getelementptr inbounds (i8** @_ZTVN10__cxxabiv117__class_type_infoE, i32 2) to i8*), i8* getelementptr inbounds ([29 x i8]* @_ZTSN5boost18thread_interruptedE, i32 0, i32 0) }
@.str34 = private unnamed_addr constant [55 x i8] c"boost:: mutex constructor failed in pthread_mutex_init\00", align 1
@__PRETTY_FUNCTION__._ZN5boost22condition_variable_anyD2Ev = private unnamed_addr constant [57 x i8] c"boost::condition_variable_any::~condition_variable_any()\00", align 1
@.str35 = private unnamed_addr constant [29 x i8] c"!pthread_cond_destroy(&cond)\00", align 1
@.str36 = private unnamed_addr constant [52 x i8] c"condition_variable_any failed in pthread_mutex_init\00", align 1
@__PRETTY_FUNCTION__._ZN5boost22condition_variable_anyC2Ev = private unnamed_addr constant [56 x i8] c"boost::condition_variable_any::condition_variable_any()\00", align 1
@.str37 = private unnamed_addr constant [51 x i8] c"condition_variable_any failed in pthread_cond_init\00", align 1
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
  %call = call %"class.boost::system::error_category"* @_ZN5boost6system16generic_categoryEv()
  store %"class.boost::system::error_category"* %call, %"class.boost::system::error_category"** @_ZN5boost6systemL14posix_categoryE, align 4
  ret void
}

declare %"class.boost::system::error_category"* @_ZN5boost6system16generic_categoryEv()

define internal void @__cxx_global_var_init2() section ".text.startup" {
entry:
  %call = call %"class.boost::system::error_category"* @_ZN5boost6system16generic_categoryEv()
  store %"class.boost::system::error_category"* %call, %"class.boost::system::error_category"** @_ZN5boost6systemL10errno_ecatE, align 4
  ret void
}

define internal void @__cxx_global_var_init3() section ".text.startup" {
entry:
  %call = call %"class.boost::system::error_category"* @_ZN5boost6system15system_categoryEv()
  store %"class.boost::system::error_category"* %call, %"class.boost::system::error_category"** @_ZN5boost6systemL11native_ecatE, align 4
  ret void
}

declare %"class.boost::system::error_category"* @_ZN5boost6system15system_categoryEv()

define linkonce_odr void @_ZNK5boost6system14error_category23default_error_conditionEi(%"class.boost::system::error_condition"* noalias sret %agg.result, %"class.boost::system::error_category"* %this, i32 %ev) unnamed_addr inlinehint align 2 {
entry:
  %this.addr = alloca %"class.boost::system::error_category"*, align 4
  %ev.addr = alloca i32, align 4
  store %"class.boost::system::error_category"* %this, %"class.boost::system::error_category"** %this.addr, align 4
  store i32 %ev, i32* %ev.addr, align 4
  %this1 = load %"class.boost::system::error_category"** %this.addr
  %0 = load i32* %ev.addr, align 4
  call void @_ZN5boost6system15error_conditionC1EiRKNS0_14error_categoryE(%"class.boost::system::error_condition"* %agg.result, i32 %0, %"class.boost::system::error_category"* %this1)
  ret void
}

define linkonce_odr void @_ZN5boost6system15error_conditionC1EiRKNS0_14error_categoryE(%"class.boost::system::error_condition"* %this, i32 %val, %"class.boost::system::error_category"* %cat) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::system::error_condition"*, align 4
  %val.addr = alloca i32, align 4
  %cat.addr = alloca %"class.boost::system::error_category"*, align 4
  store %"class.boost::system::error_condition"* %this, %"class.boost::system::error_condition"** %this.addr, align 4
  store i32 %val, i32* %val.addr, align 4
  store %"class.boost::system::error_category"* %cat, %"class.boost::system::error_category"** %cat.addr, align 4
  %this1 = load %"class.boost::system::error_condition"** %this.addr
  %0 = load i32* %val.addr, align 4
  %1 = load %"class.boost::system::error_category"** %cat.addr
  call void @_ZN5boost6system15error_conditionC2EiRKNS0_14error_categoryE(%"class.boost::system::error_condition"* %this1, i32 %0, %"class.boost::system::error_category"* %1)
  ret void
}

define linkonce_odr i8* @_ZNK5boost6system12system_error4whatEv(%"class.boost::system::system_error"* %this) unnamed_addr nounwind inlinehint align 2 {
entry:
  %retval = alloca i8*, align 4
  %this.addr = alloca %"class.boost::system::system_error"*, align 4
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  %ref.tmp = alloca %"class.std::basic_string", align 4
  %cleanup.dest.slot = alloca i32
  store %"class.boost::system::system_error"* %this, %"class.boost::system::system_error"** %this.addr, align 4
  %this1 = load %"class.boost::system::system_error"** %this.addr
  %m_what = getelementptr inbounds %"class.boost::system::system_error"* %this1, i32 0, i32 2
  %call = invoke zeroext i1 @_ZNKSs5emptyEv(%"class.std::basic_string"* %m_what)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %entry
  br i1 %call, label %if.then, label %if.end23

if.then:                                          ; preds = %invoke.cont
  %m_what2 = getelementptr inbounds %"class.boost::system::system_error"* %this1, i32 0, i32 2
  %0 = bitcast %"class.boost::system::system_error"* %this1 to %"class.std::runtime_error"*
  %call3 = call i8* @_ZNKSt13runtime_error4whatEv(%"class.std::runtime_error"* %0) nounwind
  %call6 = invoke %"class.std::basic_string"* @_ZNSsaSEPKc(%"class.std::basic_string"* %m_what2, i8* %call3)
          to label %invoke.cont5 unwind label %lpad4

invoke.cont5:                                     ; preds = %if.then
  %m_what7 = getelementptr inbounds %"class.boost::system::system_error"* %this1, i32 0, i32 2
  %call9 = invoke zeroext i1 @_ZNKSs5emptyEv(%"class.std::basic_string"* %m_what7)
          to label %invoke.cont8 unwind label %lpad4

invoke.cont8:                                     ; preds = %invoke.cont5
  br i1 %call9, label %if.end, label %if.then10

if.then10:                                        ; preds = %invoke.cont8
  %m_what11 = getelementptr inbounds %"class.boost::system::system_error"* %this1, i32 0, i32 2
  %call13 = invoke %"class.std::basic_string"* @_ZNSspLEPKc(%"class.std::basic_string"* %m_what11, i8* getelementptr inbounds ([3 x i8]* @.str, i32 0, i32 0))
          to label %invoke.cont12 unwind label %lpad4

invoke.cont12:                                    ; preds = %if.then10
  br label %if.end

lpad:                                             ; preds = %if.end23, %catch, %entry
  %1 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          filter [0 x i8*] zeroinitializer
  %2 = extractvalue { i8*, i32 } %1, 0
  store i8* %2, i8** %exn.slot
  %3 = extractvalue { i8*, i32 } %1, 1
  store i32 %3, i32* %ehselector.slot
  br label %filter.dispatch

filter.dispatch:                                  ; preds = %lpad
  %exn27 = load i8** %exn.slot
  call void @__cxa_call_unexpected(i8* %exn27) noreturn
  unreachable

lpad4:                                            ; preds = %invoke.cont17, %if.end, %if.then10, %invoke.cont5, %if.then
  %4 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          catch i8* null
  %5 = extractvalue { i8*, i32 } %4, 0
  store i8* %5, i8** %exn.slot
  %6 = extractvalue { i8*, i32 } %4, 1
  store i32 %6, i32* %ehselector.slot
  br label %catch

if.end:                                           ; preds = %invoke.cont12, %invoke.cont8
  %m_what14 = getelementptr inbounds %"class.boost::system::system_error"* %this1, i32 0, i32 2
  %m_error_code = getelementptr inbounds %"class.boost::system::system_error"* %this1, i32 0, i32 1
  invoke void @_ZNK5boost6system10error_code7messageEv(%"class.std::basic_string"* sret %ref.tmp, %"class.boost::system::error_code"* %m_error_code)
          to label %invoke.cont15 unwind label %lpad4

invoke.cont15:                                    ; preds = %if.end
  %call18 = invoke %"class.std::basic_string"* @_ZNSspLERKSs(%"class.std::basic_string"* %m_what14, %"class.std::basic_string"* %ref.tmp)
          to label %invoke.cont17 unwind label %lpad16

invoke.cont17:                                    ; preds = %invoke.cont15
  invoke void @_ZNSsD1Ev(%"class.std::basic_string"* %ref.tmp)
          to label %invoke.cont19 unwind label %lpad4

invoke.cont19:                                    ; preds = %invoke.cont17
  br label %try.cont

lpad16:                                           ; preds = %invoke.cont15
  %7 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          catch i8* null
  %8 = extractvalue { i8*, i32 } %7, 0
  store i8* %8, i8** %exn.slot
  %9 = extractvalue { i8*, i32 } %7, 1
  store i32 %9, i32* %ehselector.slot
  invoke void @_ZNSsD1Ev(%"class.std::basic_string"* %ref.tmp)
          to label %invoke.cont20 unwind label %terminate.lpad

invoke.cont20:                                    ; preds = %lpad16
  br label %catch

catch:                                            ; preds = %invoke.cont20, %lpad4
  %exn = load i8** %exn.slot
  %10 = call i8* @__cxa_begin_catch(i8* %exn) nounwind
  %11 = bitcast %"class.boost::system::system_error"* %this1 to %"class.std::runtime_error"*
  %call21 = call i8* @_ZNKSt13runtime_error4whatEv(%"class.std::runtime_error"* %11) nounwind
  store i8* %call21, i8** %retval
  store i32 1, i32* %cleanup.dest.slot
  invoke void @__cxa_end_catch()
          to label %invoke.cont22 unwind label %lpad

invoke.cont22:                                    ; preds = %catch
  br label %return

try.cont:                                         ; preds = %invoke.cont19
  br label %if.end23

if.end23:                                         ; preds = %try.cont, %invoke.cont
  %m_what24 = getelementptr inbounds %"class.boost::system::system_error"* %this1, i32 0, i32 2
  %call26 = invoke i8* @_ZNKSs5c_strEv(%"class.std::basic_string"* %m_what24)
          to label %invoke.cont25 unwind label %lpad

invoke.cont25:                                    ; preds = %if.end23
  store i8* %call26, i8** %retval
  br label %return

return:                                           ; preds = %invoke.cont25, %invoke.cont22
  %12 = load i8** %retval
  ret i8* %12

terminate.lpad:                                   ; preds = %lpad16
  %13 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          catch i8* null
  call void @_ZSt9terminatev() noreturn nounwind
  unreachable
}

declare zeroext i1 @_ZNKSs5emptyEv(%"class.std::basic_string"*)

declare i32 @__gxx_personality_v0(...)

declare %"class.std::basic_string"* @_ZNSsaSEPKc(%"class.std::basic_string"*, i8*)

declare i8* @_ZNKSt13runtime_error4whatEv(%"class.std::runtime_error"*) nounwind

declare %"class.std::basic_string"* @_ZNSspLEPKc(%"class.std::basic_string"*, i8*)

declare %"class.std::basic_string"* @_ZNSspLERKSs(%"class.std::basic_string"*, %"class.std::basic_string"*)

define linkonce_odr void @_ZNK5boost6system10error_code7messageEv(%"class.std::basic_string"* noalias sret %agg.result, %"class.boost::system::error_code"* %this) align 2 {
entry:
  %this.addr = alloca %"class.boost::system::error_code"*, align 4
  store %"class.boost::system::error_code"* %this, %"class.boost::system::error_code"** %this.addr, align 4
  %this1 = load %"class.boost::system::error_code"** %this.addr
  %m_cat = getelementptr inbounds %"class.boost::system::error_code"* %this1, i32 0, i32 1
  %0 = load %"class.boost::system::error_category"** %m_cat, align 4
  %1 = bitcast %"class.boost::system::error_category"* %0 to void (%"class.std::basic_string"*, %"class.boost::system::error_category"*, i32)***
  %vtable = load void (%"class.std::basic_string"*, %"class.boost::system::error_category"*, i32)*** %1
  %vfn = getelementptr inbounds void (%"class.std::basic_string"*, %"class.boost::system::error_category"*, i32)** %vtable, i64 3
  %2 = load void (%"class.std::basic_string"*, %"class.boost::system::error_category"*, i32)** %vfn
  %call = call i32 @_ZNK5boost6system10error_code5valueEv(%"class.boost::system::error_code"* %this1)
  call void %2(%"class.std::basic_string"* sret %agg.result, %"class.boost::system::error_category"* %0, i32 %call)
  ret void
}

declare void @_ZNSsD1Ev(%"class.std::basic_string"*)

declare void @_ZSt9terminatev()

declare i8* @__cxa_begin_catch(i8*)

declare void @__cxa_end_catch()

declare i8* @_ZNKSs5c_strEv(%"class.std::basic_string"*)

declare void @__cxa_call_unexpected(i8*)

define internal void @__cxx_global_var_init4() section ".text.startup" {
entry:
  call void @_ZN5boost3argILi1EEC1Ev(%"struct.boost::arg"* @_ZN12_GLOBAL__N_12_1E)
  ret void
}

define linkonce_odr void @_ZN5boost3argILi1EEC1Ev(%"struct.boost::arg"* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"struct.boost::arg"*, align 4
  store %"struct.boost::arg"* %this, %"struct.boost::arg"** %this.addr, align 4
  %this1 = load %"struct.boost::arg"** %this.addr
  call void @_ZN5boost3argILi1EEC2Ev(%"struct.boost::arg"* %this1)
  ret void
}

define internal void @__cxx_global_var_init5() section ".text.startup" {
entry:
  call void @_ZN5boost3argILi2EEC1Ev(%"struct.boost::arg.0"* @_ZN12_GLOBAL__N_12_2E)
  ret void
}

define linkonce_odr void @_ZN5boost3argILi2EEC1Ev(%"struct.boost::arg.0"* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"struct.boost::arg.0"*, align 4
  store %"struct.boost::arg.0"* %this, %"struct.boost::arg.0"** %this.addr, align 4
  %this1 = load %"struct.boost::arg.0"** %this.addr
  call void @_ZN5boost3argILi2EEC2Ev(%"struct.boost::arg.0"* %this1)
  ret void
}

define internal void @__cxx_global_var_init6() section ".text.startup" {
entry:
  call void @_ZN5boost3argILi3EEC1Ev(%"struct.boost::arg.2"* @_ZN12_GLOBAL__N_12_3E)
  ret void
}

define linkonce_odr void @_ZN5boost3argILi3EEC1Ev(%"struct.boost::arg.2"* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"struct.boost::arg.2"*, align 4
  store %"struct.boost::arg.2"* %this, %"struct.boost::arg.2"** %this.addr, align 4
  %this1 = load %"struct.boost::arg.2"** %this.addr
  call void @_ZN5boost3argILi3EEC2Ev(%"struct.boost::arg.2"* %this1)
  ret void
}

define internal void @__cxx_global_var_init7() section ".text.startup" {
entry:
  call void @_ZN5boost3argILi4EEC1Ev(%"struct.boost::arg.4"* @_ZN12_GLOBAL__N_12_4E)
  ret void
}

define linkonce_odr void @_ZN5boost3argILi4EEC1Ev(%"struct.boost::arg.4"* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"struct.boost::arg.4"*, align 4
  store %"struct.boost::arg.4"* %this, %"struct.boost::arg.4"** %this.addr, align 4
  %this1 = load %"struct.boost::arg.4"** %this.addr
  call void @_ZN5boost3argILi4EEC2Ev(%"struct.boost::arg.4"* %this1)
  ret void
}

define internal void @__cxx_global_var_init8() section ".text.startup" {
entry:
  call void @_ZN5boost3argILi5EEC1Ev(%"struct.boost::arg.6"* @_ZN12_GLOBAL__N_12_5E)
  ret void
}

define linkonce_odr void @_ZN5boost3argILi5EEC1Ev(%"struct.boost::arg.6"* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"struct.boost::arg.6"*, align 4
  store %"struct.boost::arg.6"* %this, %"struct.boost::arg.6"** %this.addr, align 4
  %this1 = load %"struct.boost::arg.6"** %this.addr
  call void @_ZN5boost3argILi5EEC2Ev(%"struct.boost::arg.6"* %this1)
  ret void
}

define internal void @__cxx_global_var_init9() section ".text.startup" {
entry:
  call void @_ZN5boost3argILi6EEC1Ev(%"struct.boost::arg.8"* @_ZN12_GLOBAL__N_12_6E)
  ret void
}

define linkonce_odr void @_ZN5boost3argILi6EEC1Ev(%"struct.boost::arg.8"* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"struct.boost::arg.8"*, align 4
  store %"struct.boost::arg.8"* %this, %"struct.boost::arg.8"** %this.addr, align 4
  %this1 = load %"struct.boost::arg.8"** %this.addr
  call void @_ZN5boost3argILi6EEC2Ev(%"struct.boost::arg.8"* %this1)
  ret void
}

define internal void @__cxx_global_var_init10() section ".text.startup" {
entry:
  call void @_ZN5boost3argILi7EEC1Ev(%"struct.boost::arg.10"* @_ZN12_GLOBAL__N_12_7E)
  ret void
}

define linkonce_odr void @_ZN5boost3argILi7EEC1Ev(%"struct.boost::arg.10"* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"struct.boost::arg.10"*, align 4
  store %"struct.boost::arg.10"* %this, %"struct.boost::arg.10"** %this.addr, align 4
  %this1 = load %"struct.boost::arg.10"** %this.addr
  call void @_ZN5boost3argILi7EEC2Ev(%"struct.boost::arg.10"* %this1)
  ret void
}

define internal void @__cxx_global_var_init11() section ".text.startup" {
entry:
  call void @_ZN5boost3argILi8EEC1Ev(%"struct.boost::arg.12"* @_ZN12_GLOBAL__N_12_8E)
  ret void
}

define linkonce_odr void @_ZN5boost3argILi8EEC1Ev(%"struct.boost::arg.12"* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"struct.boost::arg.12"*, align 4
  store %"struct.boost::arg.12"* %this, %"struct.boost::arg.12"** %this.addr, align 4
  %this1 = load %"struct.boost::arg.12"** %this.addr
  call void @_ZN5boost3argILi8EEC2Ev(%"struct.boost::arg.12"* %this1)
  ret void
}

define internal void @__cxx_global_var_init12() section ".text.startup" {
entry:
  call void @_ZN5boost3argILi9EEC1Ev(%"struct.boost::arg.14"* @_ZN12_GLOBAL__N_12_9E)
  ret void
}

define linkonce_odr void @_ZN5boost3argILi9EEC1Ev(%"struct.boost::arg.14"* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"struct.boost::arg.14"*, align 4
  store %"struct.boost::arg.14"* %this, %"struct.boost::arg.14"** %this.addr, align 4
  %this1 = load %"struct.boost::arg.14"** %this.addr
  call void @_ZN5boost3argILi9EEC2Ev(%"struct.boost::arg.14"* %this1)
  ret void
}

define internal void @__cxx_global_var_init13() section ".text.startup" {
entry:
  call void @_ZN14bounded_bufferC1Ei(%class.bounded_buffer* @buf, i32 2)
  %0 = call i32 @__cxa_atexit(void (i8*)* bitcast (void (%class.bounded_buffer*)* @_ZN14bounded_bufferD1Ev to void (i8*)*), i8* bitcast (%class.bounded_buffer* @buf to i8*), i8* @__dso_handle) nounwind
  ret void
}

define linkonce_odr void @_ZN14bounded_bufferC1Ei(%class.bounded_buffer* %this, i32 %n) unnamed_addr align 2 {
entry:
  %this.addr = alloca %class.bounded_buffer*, align 4
  %n.addr = alloca i32, align 4
  store %class.bounded_buffer* %this, %class.bounded_buffer** %this.addr, align 4
  store i32 %n, i32* %n.addr, align 4
  %this1 = load %class.bounded_buffer** %this.addr
  %0 = load i32* %n.addr, align 4
  call void @_ZN14bounded_bufferC2Ei(%class.bounded_buffer* %this1, i32 %0)
  ret void
}

define linkonce_odr void @_ZN14bounded_bufferD1Ev(%class.bounded_buffer* %this) unnamed_addr inlinehint align 2 {
entry:
  %this.addr = alloca %class.bounded_buffer*, align 4
  store %class.bounded_buffer* %this, %class.bounded_buffer** %this.addr, align 4
  %this1 = load %class.bounded_buffer** %this.addr
  call void @_ZN14bounded_bufferD2Ev(%class.bounded_buffer* %this1)
  ret void
}

define internal void @__cxx_global_var_init14() section ".text.startup" {
entry:
  call void @_ZN5boost5mutexC1Ev(%"class.boost::mutex"* @io_mutex)
  %0 = call i32 @__cxa_atexit(void (i8*)* bitcast (void (%"class.boost::mutex"*)* @_ZN5boost5mutexD1Ev to void (i8*)*), i8* bitcast (%"class.boost::mutex"* @io_mutex to i8*), i8* @__dso_handle) nounwind
  ret void
}

define linkonce_odr void @_ZN5boost5mutexC1Ev(%"class.boost::mutex"* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::mutex"*, align 4
  store %"class.boost::mutex"* %this, %"class.boost::mutex"** %this.addr, align 4
  %this1 = load %"class.boost::mutex"** %this.addr
  call void @_ZN5boost5mutexC2Ev(%"class.boost::mutex"* %this1)
  ret void
}

define linkonce_odr void @_ZN5boost5mutexD1Ev(%"class.boost::mutex"* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::mutex"*, align 4
  store %"class.boost::mutex"* %this, %"class.boost::mutex"** %this.addr, align 4
  %this1 = load %"class.boost::mutex"** %this.addr
  call void @_ZN5boost5mutexD2Ev(%"class.boost::mutex"* %this1)
  ret void
}

define void @_Z6senderv() {
entry:
  %n = alloca i32, align 4
  %io_lock = alloca %"class.boost::unique_lock", align 4
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  store i32 0, i32* %n, align 4
  br label %while.cond

while.cond:                                       ; preds = %if.end, %entry
  %0 = load i32* %n, align 4
  %cmp = icmp slt i32 %0, 1000000
  br i1 %cmp, label %while.body, label %while.end

while.body:                                       ; preds = %while.cond
  %1 = load i32* %n, align 4
  call void @_ZN14bounded_buffer4sendEi(%class.bounded_buffer* @buf, i32 %1)
  %2 = load i32* %n, align 4
  %rem = srem i32 %2, 10000
  %tobool = icmp ne i32 %rem, 0
  br i1 %tobool, label %if.end, label %if.then

if.then:                                          ; preds = %while.body
  call void @_ZN5boost11unique_lockINS_5mutexEEC1ERS1_(%"class.boost::unique_lock"* %io_lock, %"class.boost::mutex"* @io_mutex)
  %call = invoke %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* @_ZSt4cout, i8* getelementptr inbounds ([7 x i8]* @.str15, i32 0, i32 0))
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %if.then
  %3 = load i32* %n, align 4
  %call2 = invoke %"class.std::basic_ostream"* @_ZNSolsEi(%"class.std::basic_ostream"* %call, i32 %3)
          to label %invoke.cont1 unwind label %lpad

invoke.cont1:                                     ; preds = %invoke.cont
  %call4 = invoke %"class.std::basic_ostream"* @_ZNSolsEPFRSoS_E(%"class.std::basic_ostream"* %call2, %"class.std::basic_ostream"* (%"class.std::basic_ostream"*)* @_ZSt4endlIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_)
          to label %invoke.cont3 unwind label %lpad

invoke.cont3:                                     ; preds = %invoke.cont1
  call void @_ZN5boost11unique_lockINS_5mutexEED1Ev(%"class.boost::unique_lock"* %io_lock)
  br label %if.end

lpad:                                             ; preds = %invoke.cont1, %invoke.cont, %if.then
  %4 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %5 = extractvalue { i8*, i32 } %4, 0
  store i8* %5, i8** %exn.slot
  %6 = extractvalue { i8*, i32 } %4, 1
  store i32 %6, i32* %ehselector.slot
  invoke void @_ZN5boost11unique_lockINS_5mutexEED1Ev(%"class.boost::unique_lock"* %io_lock)
          to label %invoke.cont5 unwind label %terminate.lpad

invoke.cont5:                                     ; preds = %lpad
  br label %eh.resume

if.end:                                           ; preds = %invoke.cont3, %while.body
  %7 = load i32* %n, align 4
  %inc = add nsw i32 %7, 1
  store i32 %inc, i32* %n, align 4
  br label %while.cond

while.end:                                        ; preds = %while.cond
  call void @_ZN14bounded_buffer4sendEi(%class.bounded_buffer* @buf, i32 -1)
  ret void

eh.resume:                                        ; preds = %invoke.cont5
  %exn = load i8** %exn.slot
  %sel = load i32* %ehselector.slot
  %lpad.val = insertvalue { i8*, i32 } undef, i8* %exn, 0
  %lpad.val6 = insertvalue { i8*, i32 } %lpad.val, i32 %sel, 1
  resume { i8*, i32 } %lpad.val6

terminate.lpad:                                   ; preds = %lpad
  %8 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          catch i8* null
  call void @_ZSt9terminatev() noreturn nounwind
  unreachable
}

define linkonce_odr void @_ZN14bounded_buffer4sendEi(%class.bounded_buffer* %this, i32 %m) align 2 {
entry:
  %this.addr = alloca %class.bounded_buffer*, align 4
  %m.addr = alloca i32, align 4
  %lk = alloca %"class.boost::unique_lock", align 4
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  store %class.bounded_buffer* %this, %class.bounded_buffer** %this.addr, align 4
  store i32 %m, i32* %m.addr, align 4
  %this1 = load %class.bounded_buffer** %this.addr
  %monitor = getelementptr inbounds %class.bounded_buffer* %this1, i32 0, i32 6
  call void @_ZN5boost11unique_lockINS_5mutexEEC1ERS1_(%"class.boost::unique_lock"* %lk, %"class.boost::mutex"* %monitor)
  br label %while.cond

while.cond:                                       ; preds = %invoke.cont2, %entry
  %buffered = getelementptr inbounds %class.bounded_buffer* %this1, i32 0, i32 2
  %0 = load i32* %buffered, align 4
  %circular_buf = getelementptr inbounds %class.bounded_buffer* %this1, i32 0, i32 3
  %call = invoke i32 @_ZNKSt6vectorIiSaIiEE4sizeEv(%"class.std::vector"* %circular_buf)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %while.cond
  %cmp = icmp eq i32 %0, %call
  br i1 %cmp, label %while.body, label %while.end

while.body:                                       ; preds = %invoke.cont
  %buffer_not_full = getelementptr inbounds %class.bounded_buffer* %this1, i32 0, i32 4
  invoke void @_ZN5boost22condition_variable_any4waitINS_11unique_lockINS_5mutexEEEEEvRT_(%"class.boost::condition_variable_any"* %buffer_not_full, %"class.boost::unique_lock"* %lk)
          to label %invoke.cont2 unwind label %lpad

invoke.cont2:                                     ; preds = %while.body
  br label %while.cond

lpad:                                             ; preds = %invoke.cont8, %invoke.cont4, %while.end, %while.body, %while.cond
  %1 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %2 = extractvalue { i8*, i32 } %1, 0
  store i8* %2, i8** %exn.slot
  %3 = extractvalue { i8*, i32 } %1, 1
  store i32 %3, i32* %ehselector.slot
  invoke void @_ZN5boost11unique_lockINS_5mutexEED1Ev(%"class.boost::unique_lock"* %lk)
          to label %invoke.cont13 unwind label %terminate.lpad

while.end:                                        ; preds = %invoke.cont
  %4 = load i32* %m.addr, align 4
  %circular_buf3 = getelementptr inbounds %class.bounded_buffer* %this1, i32 0, i32 3
  %end = getelementptr inbounds %class.bounded_buffer* %this1, i32 0, i32 1
  %5 = load i32* %end, align 4
  %call5 = invoke i32* @_ZNSt6vectorIiSaIiEEixEj(%"class.std::vector"* %circular_buf3, i32 %5)
          to label %invoke.cont4 unwind label %lpad

invoke.cont4:                                     ; preds = %while.end
  store i32 %4, i32* %call5
  %end6 = getelementptr inbounds %class.bounded_buffer* %this1, i32 0, i32 1
  %6 = load i32* %end6, align 4
  %add = add nsw i32 %6, 1
  %circular_buf7 = getelementptr inbounds %class.bounded_buffer* %this1, i32 0, i32 3
  %call9 = invoke i32 @_ZNKSt6vectorIiSaIiEE4sizeEv(%"class.std::vector"* %circular_buf7)
          to label %invoke.cont8 unwind label %lpad

invoke.cont8:                                     ; preds = %invoke.cont4
  %rem = urem i32 %add, %call9
  %end10 = getelementptr inbounds %class.bounded_buffer* %this1, i32 0, i32 1
  store i32 %rem, i32* %end10, align 4
  %buffered11 = getelementptr inbounds %class.bounded_buffer* %this1, i32 0, i32 2
  %7 = load i32* %buffered11, align 4
  %inc = add nsw i32 %7, 1
  store i32 %inc, i32* %buffered11, align 4
  %buffer_not_empty = getelementptr inbounds %class.bounded_buffer* %this1, i32 0, i32 5
  invoke void @_ZN5boost22condition_variable_any10notify_oneEv(%"class.boost::condition_variable_any"* %buffer_not_empty)
          to label %invoke.cont12 unwind label %lpad

invoke.cont12:                                    ; preds = %invoke.cont8
  call void @_ZN5boost11unique_lockINS_5mutexEED1Ev(%"class.boost::unique_lock"* %lk)
  ret void

invoke.cont13:                                    ; preds = %lpad
  br label %eh.resume

eh.resume:                                        ; preds = %invoke.cont13
  %exn = load i8** %exn.slot
  %sel = load i32* %ehselector.slot
  %lpad.val = insertvalue { i8*, i32 } undef, i8* %exn, 0
  %lpad.val14 = insertvalue { i8*, i32 } %lpad.val, i32 %sel, 1
  resume { i8*, i32 } %lpad.val14

terminate.lpad:                                   ; preds = %lpad
  %8 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          catch i8* null
  call void @_ZSt9terminatev() noreturn nounwind
  unreachable
}

define linkonce_odr void @_ZN5boost11unique_lockINS_5mutexEEC1ERS1_(%"class.boost::unique_lock"* %this, %"class.boost::mutex"* %m_) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::unique_lock"*, align 4
  %m_.addr = alloca %"class.boost::mutex"*, align 4
  store %"class.boost::unique_lock"* %this, %"class.boost::unique_lock"** %this.addr, align 4
  store %"class.boost::mutex"* %m_, %"class.boost::mutex"** %m_.addr, align 4
  %this1 = load %"class.boost::unique_lock"** %this.addr
  %0 = load %"class.boost::mutex"** %m_.addr
  call void @_ZN5boost11unique_lockINS_5mutexEEC2ERS1_(%"class.boost::unique_lock"* %this1, %"class.boost::mutex"* %0)
  ret void
}

declare %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"*, i8*)

declare %"class.std::basic_ostream"* @_ZNSolsEi(%"class.std::basic_ostream"*, i32)

declare %"class.std::basic_ostream"* @_ZNSolsEPFRSoS_E(%"class.std::basic_ostream"*, %"class.std::basic_ostream"* (%"class.std::basic_ostream"*)*)

declare %"class.std::basic_ostream"* @_ZSt4endlIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_(%"class.std::basic_ostream"*)

define linkonce_odr void @_ZN5boost11unique_lockINS_5mutexEED1Ev(%"class.boost::unique_lock"* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::unique_lock"*, align 4
  store %"class.boost::unique_lock"* %this, %"class.boost::unique_lock"** %this.addr, align 4
  %this1 = load %"class.boost::unique_lock"** %this.addr
  call void @_ZN5boost11unique_lockINS_5mutexEED2Ev(%"class.boost::unique_lock"* %this1)
  ret void
}

define void @_Z8receiverv() {
entry:
  %n = alloca i32, align 4
  %io_lock = alloca %"class.boost::unique_lock", align 4
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  br label %do.body

do.body:                                          ; preds = %do.cond, %entry
  %call = call i32 @_ZN14bounded_buffer7receiveEv(%class.bounded_buffer* @buf)
  store i32 %call, i32* %n, align 4
  %0 = load i32* %n, align 4
  %rem = srem i32 %0, 10000
  %tobool = icmp ne i32 %rem, 0
  br i1 %tobool, label %if.end, label %if.then

if.then:                                          ; preds = %do.body
  call void @_ZN5boost11unique_lockINS_5mutexEEC1ERS1_(%"class.boost::unique_lock"* %io_lock, %"class.boost::mutex"* @io_mutex)
  %call1 = invoke %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* @_ZSt4cout, i8* getelementptr inbounds ([11 x i8]* @.str16, i32 0, i32 0))
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %if.then
  %1 = load i32* %n, align 4
  %call3 = invoke %"class.std::basic_ostream"* @_ZNSolsEi(%"class.std::basic_ostream"* %call1, i32 %1)
          to label %invoke.cont2 unwind label %lpad

invoke.cont2:                                     ; preds = %invoke.cont
  %call5 = invoke %"class.std::basic_ostream"* @_ZNSolsEPFRSoS_E(%"class.std::basic_ostream"* %call3, %"class.std::basic_ostream"* (%"class.std::basic_ostream"*)* @_ZSt4endlIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_)
          to label %invoke.cont4 unwind label %lpad

invoke.cont4:                                     ; preds = %invoke.cont2
  call void @_ZN5boost11unique_lockINS_5mutexEED1Ev(%"class.boost::unique_lock"* %io_lock)
  br label %if.end

lpad:                                             ; preds = %invoke.cont2, %invoke.cont, %if.then
  %2 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %3 = extractvalue { i8*, i32 } %2, 0
  store i8* %3, i8** %exn.slot
  %4 = extractvalue { i8*, i32 } %2, 1
  store i32 %4, i32* %ehselector.slot
  invoke void @_ZN5boost11unique_lockINS_5mutexEED1Ev(%"class.boost::unique_lock"* %io_lock)
          to label %invoke.cont6 unwind label %terminate.lpad

invoke.cont6:                                     ; preds = %lpad
  br label %eh.resume

if.end:                                           ; preds = %invoke.cont4, %do.body
  br label %do.cond

do.cond:                                          ; preds = %if.end
  %5 = load i32* %n, align 4
  %cmp = icmp ne i32 %5, -1
  br i1 %cmp, label %do.body, label %do.end

do.end:                                           ; preds = %do.cond
  call void @_ZN14bounded_buffer4sendEi(%class.bounded_buffer* @buf, i32 -1)
  ret void

eh.resume:                                        ; preds = %invoke.cont6
  %exn = load i8** %exn.slot
  %sel = load i32* %ehselector.slot
  %lpad.val = insertvalue { i8*, i32 } undef, i8* %exn, 0
  %lpad.val7 = insertvalue { i8*, i32 } %lpad.val, i32 %sel, 1
  resume { i8*, i32 } %lpad.val7

terminate.lpad:                                   ; preds = %lpad
  %6 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          catch i8* null
  call void @_ZSt9terminatev() noreturn nounwind
  unreachable
}

define linkonce_odr i32 @_ZN14bounded_buffer7receiveEv(%class.bounded_buffer* %this) align 2 {
entry:
  %this.addr = alloca %class.bounded_buffer*, align 4
  %lk = alloca %"class.boost::unique_lock", align 4
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  %i = alloca i32, align 4
  %cleanup.dest.slot = alloca i32
  store %class.bounded_buffer* %this, %class.bounded_buffer** %this.addr, align 4
  %this1 = load %class.bounded_buffer** %this.addr
  %monitor = getelementptr inbounds %class.bounded_buffer* %this1, i32 0, i32 6
  call void @_ZN5boost11unique_lockINS_5mutexEEC1ERS1_(%"class.boost::unique_lock"* %lk, %"class.boost::mutex"* %monitor)
  br label %while.cond

while.cond:                                       ; preds = %invoke.cont, %entry
  %buffered = getelementptr inbounds %class.bounded_buffer* %this1, i32 0, i32 2
  %0 = load i32* %buffered, align 4
  %cmp = icmp eq i32 %0, 0
  br i1 %cmp, label %while.body, label %while.end

while.body:                                       ; preds = %while.cond
  %buffer_not_empty = getelementptr inbounds %class.bounded_buffer* %this1, i32 0, i32 5
  invoke void @_ZN5boost22condition_variable_any4waitINS_11unique_lockINS_5mutexEEEEEvRT_(%"class.boost::condition_variable_any"* %buffer_not_empty, %"class.boost::unique_lock"* %lk)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %while.body
  br label %while.cond

lpad:                                             ; preds = %invoke.cont5, %invoke.cont2, %while.end, %while.body
  %1 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %2 = extractvalue { i8*, i32 } %1, 0
  store i8* %2, i8** %exn.slot
  %3 = extractvalue { i8*, i32 } %1, 1
  store i32 %3, i32* %ehselector.slot
  invoke void @_ZN5boost11unique_lockINS_5mutexEED1Ev(%"class.boost::unique_lock"* %lk)
          to label %invoke.cont10 unwind label %terminate.lpad

while.end:                                        ; preds = %while.cond
  %circular_buf = getelementptr inbounds %class.bounded_buffer* %this1, i32 0, i32 3
  %begin = getelementptr inbounds %class.bounded_buffer* %this1, i32 0, i32 0
  %4 = load i32* %begin, align 4
  %call = invoke i32* @_ZNSt6vectorIiSaIiEEixEj(%"class.std::vector"* %circular_buf, i32 %4)
          to label %invoke.cont2 unwind label %lpad

invoke.cont2:                                     ; preds = %while.end
  %5 = load i32* %call
  store i32 %5, i32* %i, align 4
  %begin3 = getelementptr inbounds %class.bounded_buffer* %this1, i32 0, i32 0
  %6 = load i32* %begin3, align 4
  %add = add nsw i32 %6, 1
  %circular_buf4 = getelementptr inbounds %class.bounded_buffer* %this1, i32 0, i32 3
  %call6 = invoke i32 @_ZNKSt6vectorIiSaIiEE4sizeEv(%"class.std::vector"* %circular_buf4)
          to label %invoke.cont5 unwind label %lpad

invoke.cont5:                                     ; preds = %invoke.cont2
  %rem = urem i32 %add, %call6
  %begin7 = getelementptr inbounds %class.bounded_buffer* %this1, i32 0, i32 0
  store i32 %rem, i32* %begin7, align 4
  %buffered8 = getelementptr inbounds %class.bounded_buffer* %this1, i32 0, i32 2
  %7 = load i32* %buffered8, align 4
  %dec = add nsw i32 %7, -1
  store i32 %dec, i32* %buffered8, align 4
  %buffer_not_full = getelementptr inbounds %class.bounded_buffer* %this1, i32 0, i32 4
  invoke void @_ZN5boost22condition_variable_any10notify_oneEv(%"class.boost::condition_variable_any"* %buffer_not_full)
          to label %invoke.cont9 unwind label %lpad

invoke.cont9:                                     ; preds = %invoke.cont5
  %8 = load i32* %i, align 4
  store i32 1, i32* %cleanup.dest.slot
  call void @_ZN5boost11unique_lockINS_5mutexEED1Ev(%"class.boost::unique_lock"* %lk)
  ret i32 %8

invoke.cont10:                                    ; preds = %lpad
  br label %eh.resume

eh.resume:                                        ; preds = %invoke.cont10
  %exn = load i8** %exn.slot
  %sel = load i32* %ehselector.slot
  %lpad.val = insertvalue { i8*, i32 } undef, i8* %exn, 0
  %lpad.val11 = insertvalue { i8*, i32 } %lpad.val, i32 %sel, 1
  resume { i8*, i32 } %lpad.val11

terminate.lpad:                                   ; preds = %lpad
  %9 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          catch i8* null
  call void @_ZSt9terminatev() noreturn nounwind
  unreachable
}

define i32 @main(i32, i8**) {
entry:
  %retval = alloca i32, align 4
  %.addr = alloca i32, align 4
  %.addr1 = alloca i8**, align 4
  %thrd1 = alloca %"class.boost::thread", align 4
  %thrd2 = alloca %"class.boost::thread", align 4
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  %thrd3 = alloca %"class.boost::thread", align 4
  %thrd4 = alloca %"class.boost::thread", align 4
  %cleanup.dest.slot = alloca i32
  store i32 0, i32* %retval
  store i32 %0, i32* %.addr, align 4
  store i8** %1, i8*** %.addr1, align 4
  call void @_ZN5boost6threadC1IPFvvEEET_NS_10disable_ifINS_14is_convertibleIRS4_NS_6detail13thread_move_tIS4_EEEEPNS0_5dummyEE4typeE(%"class.boost::thread"* %thrd1, void ()* @_Z6senderv, %"struct.boost::thread::dummy"* null)
  invoke void @_ZN5boost6threadC1IPFvvEEET_NS_10disable_ifINS_14is_convertibleIRS4_NS_6detail13thread_move_tIS4_EEEEPNS0_5dummyEE4typeE(%"class.boost::thread"* %thrd2, void ()* @_Z8receiverv, %"struct.boost::thread::dummy"* null)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %entry
  invoke void @_ZN5boost6threadC1IPFvvEEET_NS_10disable_ifINS_14is_convertibleIRS4_NS_6detail13thread_move_tIS4_EEEEPNS0_5dummyEE4typeE(%"class.boost::thread"* %thrd3, void ()* @_Z8receiverv, %"struct.boost::thread::dummy"* null)
          to label %invoke.cont3 unwind label %lpad2

invoke.cont3:                                     ; preds = %invoke.cont
  invoke void @_ZN5boost6threadC1IPFvvEEET_NS_10disable_ifINS_14is_convertibleIRS4_NS_6detail13thread_move_tIS4_EEEEPNS0_5dummyEE4typeE(%"class.boost::thread"* %thrd4, void ()* @_Z8receiverv, %"struct.boost::thread::dummy"* null)
          to label %invoke.cont5 unwind label %lpad4

invoke.cont5:                                     ; preds = %invoke.cont3
  invoke void @_ZN5boost6thread4joinEv(%"class.boost::thread"* %thrd1)
          to label %invoke.cont7 unwind label %lpad6

invoke.cont7:                                     ; preds = %invoke.cont5
  invoke void @_ZN5boost6thread4joinEv(%"class.boost::thread"* %thrd2)
          to label %invoke.cont8 unwind label %lpad6

invoke.cont8:                                     ; preds = %invoke.cont7
  invoke void @_ZN5boost6thread4joinEv(%"class.boost::thread"* %thrd3)
          to label %invoke.cont9 unwind label %lpad6

invoke.cont9:                                     ; preds = %invoke.cont8
  invoke void @_ZN5boost6thread4joinEv(%"class.boost::thread"* %thrd4)
          to label %invoke.cont10 unwind label %lpad6

invoke.cont10:                                    ; preds = %invoke.cont9
  store i32 0, i32* %retval
  store i32 1, i32* %cleanup.dest.slot
  invoke void @_ZN5boost6threadD1Ev(%"class.boost::thread"* %thrd4)
          to label %invoke.cont11 unwind label %lpad4

lpad:                                             ; preds = %invoke.cont13, %entry
  %2 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %3 = extractvalue { i8*, i32 } %2, 0
  store i8* %3, i8** %exn.slot
  %4 = extractvalue { i8*, i32 } %2, 1
  store i32 %4, i32* %ehselector.slot
  br label %ehcleanup18

lpad2:                                            ; preds = %invoke.cont11, %invoke.cont
  %5 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %6 = extractvalue { i8*, i32 } %5, 0
  store i8* %6, i8** %exn.slot
  %7 = extractvalue { i8*, i32 } %5, 1
  store i32 %7, i32* %ehselector.slot
  br label %ehcleanup16

lpad4:                                            ; preds = %invoke.cont10, %invoke.cont3
  %8 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %9 = extractvalue { i8*, i32 } %8, 0
  store i8* %9, i8** %exn.slot
  %10 = extractvalue { i8*, i32 } %8, 1
  store i32 %10, i32* %ehselector.slot
  br label %ehcleanup

lpad6:                                            ; preds = %invoke.cont9, %invoke.cont8, %invoke.cont7, %invoke.cont5
  %11 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %12 = extractvalue { i8*, i32 } %11, 0
  store i8* %12, i8** %exn.slot
  %13 = extractvalue { i8*, i32 } %11, 1
  store i32 %13, i32* %ehselector.slot
  invoke void @_ZN5boost6threadD1Ev(%"class.boost::thread"* %thrd4)
          to label %invoke.cont12 unwind label %terminate.lpad

invoke.cont11:                                    ; preds = %invoke.cont10
  invoke void @_ZN5boost6threadD1Ev(%"class.boost::thread"* %thrd3)
          to label %invoke.cont13 unwind label %lpad2

invoke.cont12:                                    ; preds = %lpad6
  br label %ehcleanup

invoke.cont13:                                    ; preds = %invoke.cont11
  invoke void @_ZN5boost6threadD1Ev(%"class.boost::thread"* %thrd2)
          to label %invoke.cont15 unwind label %lpad

ehcleanup:                                        ; preds = %invoke.cont12, %lpad4
  invoke void @_ZN5boost6threadD1Ev(%"class.boost::thread"* %thrd3)
          to label %invoke.cont14 unwind label %terminate.lpad

invoke.cont14:                                    ; preds = %ehcleanup
  br label %ehcleanup16

invoke.cont15:                                    ; preds = %invoke.cont13
  call void @_ZN5boost6threadD1Ev(%"class.boost::thread"* %thrd1)
  %14 = load i32* %retval
  ret i32 %14

ehcleanup16:                                      ; preds = %invoke.cont14, %lpad2
  invoke void @_ZN5boost6threadD1Ev(%"class.boost::thread"* %thrd2)
          to label %invoke.cont17 unwind label %terminate.lpad

invoke.cont17:                                    ; preds = %ehcleanup16
  br label %ehcleanup18

ehcleanup18:                                      ; preds = %invoke.cont17, %lpad
  invoke void @_ZN5boost6threadD1Ev(%"class.boost::thread"* %thrd1)
          to label %invoke.cont19 unwind label %terminate.lpad

invoke.cont19:                                    ; preds = %ehcleanup18
  br label %eh.resume

eh.resume:                                        ; preds = %invoke.cont19
  %exn = load i8** %exn.slot
  %sel = load i32* %ehselector.slot
  %lpad.val = insertvalue { i8*, i32 } undef, i8* %exn, 0
  %lpad.val20 = insertvalue { i8*, i32 } %lpad.val, i32 %sel, 1
  resume { i8*, i32 } %lpad.val20

terminate.lpad:                                   ; preds = %ehcleanup18, %ehcleanup16, %ehcleanup, %lpad6
  %15 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          catch i8* null
  call void @_ZSt9terminatev() noreturn nounwind
  unreachable
}

define linkonce_odr void @_ZN5boost6threadC1IPFvvEEET_NS_10disable_ifINS_14is_convertibleIRS4_NS_6detail13thread_move_tIS4_EEEEPNS0_5dummyEE4typeE(%"class.boost::thread"* %this, void ()* %f, %"struct.boost::thread::dummy"*) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::thread"*, align 4
  %f.addr = alloca void ()*, align 4
  %.addr = alloca %"struct.boost::thread::dummy"*, align 4
  store %"class.boost::thread"* %this, %"class.boost::thread"** %this.addr, align 4
  store void ()* %f, void ()** %f.addr, align 4
  store %"struct.boost::thread::dummy"* %0, %"struct.boost::thread::dummy"** %.addr, align 4
  %this1 = load %"class.boost::thread"** %this.addr
  %1 = load void ()** %f.addr, align 4
  %2 = load %"struct.boost::thread::dummy"** %.addr, align 4
  call void @_ZN5boost6threadC2IPFvvEEET_NS_10disable_ifINS_14is_convertibleIRS4_NS_6detail13thread_move_tIS4_EEEEPNS0_5dummyEE4typeE(%"class.boost::thread"* %this1, void ()* %1, %"struct.boost::thread::dummy"* %2)
  ret void
}

declare void @_ZN5boost6thread4joinEv(%"class.boost::thread"*)

define linkonce_odr void @_ZN5boost6threadD1Ev(%"class.boost::thread"* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::thread"*, align 4
  store %"class.boost::thread"* %this, %"class.boost::thread"** %this.addr, align 4
  %this1 = load %"class.boost::thread"** %this.addr
  call void @_ZN5boost6threadD2Ev(%"class.boost::thread"* %this1)
  ret void
}

define linkonce_odr void @_ZN5boost6system14error_categoryD1Ev(%"class.boost::system::error_category"* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::system::error_category"*, align 4
  store %"class.boost::system::error_category"* %this, %"class.boost::system::error_category"** %this.addr, align 4
  %this1 = load %"class.boost::system::error_category"** %this.addr
  call void @_ZN5boost6system14error_categoryD2Ev(%"class.boost::system::error_category"* %this1)
  ret void
}

define linkonce_odr void @_ZN5boost6system14error_categoryD0Ev(%"class.boost::system::error_category"* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::system::error_category"*, align 4
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  store %"class.boost::system::error_category"* %this, %"class.boost::system::error_category"** %this.addr, align 4
  %this1 = load %"class.boost::system::error_category"** %this.addr
  invoke void @_ZN5boost6system14error_categoryD1Ev(%"class.boost::system::error_category"* %this1)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %entry
  %0 = bitcast %"class.boost::system::error_category"* %this1 to i8*
  call void @_ZdlPv(i8* %0) nounwind
  ret void

lpad:                                             ; preds = %entry
  %1 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %2 = extractvalue { i8*, i32 } %1, 0
  store i8* %2, i8** %exn.slot
  %3 = extractvalue { i8*, i32 } %1, 1
  store i32 %3, i32* %ehselector.slot
  %4 = bitcast %"class.boost::system::error_category"* %this1 to i8*
  call void @_ZdlPv(i8* %4) nounwind
  br label %eh.resume

eh.resume:                                        ; preds = %lpad
  %exn = load i8** %exn.slot
  %sel = load i32* %ehselector.slot
  %lpad.val = insertvalue { i8*, i32 } undef, i8* %exn, 0
  %lpad.val2 = insertvalue { i8*, i32 } %lpad.val, i32 %sel, 1
  resume { i8*, i32 } %lpad.val2
}

declare void @__cxa_pure_virtual()

define linkonce_odr zeroext i1 @_ZNK5boost6system14error_category10equivalentEiRKNS0_15error_conditionE(%"class.boost::system::error_category"* %this, i32 %code, %"class.boost::system::error_condition"* %condition) unnamed_addr inlinehint align 2 {
entry:
  %this.addr = alloca %"class.boost::system::error_category"*, align 4
  %code.addr = alloca i32, align 4
  %condition.addr = alloca %"class.boost::system::error_condition"*, align 4
  %ref.tmp = alloca %"class.boost::system::error_condition", align 4
  store %"class.boost::system::error_category"* %this, %"class.boost::system::error_category"** %this.addr, align 4
  store i32 %code, i32* %code.addr, align 4
  store %"class.boost::system::error_condition"* %condition, %"class.boost::system::error_condition"** %condition.addr, align 4
  %this1 = load %"class.boost::system::error_category"** %this.addr
  %0 = bitcast %"class.boost::system::error_category"* %this1 to void (%"class.boost::system::error_condition"*, %"class.boost::system::error_category"*, i32)***
  %vtable = load void (%"class.boost::system::error_condition"*, %"class.boost::system::error_category"*, i32)*** %0
  %vfn = getelementptr inbounds void (%"class.boost::system::error_condition"*, %"class.boost::system::error_category"*, i32)** %vtable, i64 4
  %1 = load void (%"class.boost::system::error_condition"*, %"class.boost::system::error_category"*, i32)** %vfn
  %2 = load i32* %code.addr, align 4
  call void %1(%"class.boost::system::error_condition"* sret %ref.tmp, %"class.boost::system::error_category"* %this1, i32 %2)
  %3 = load %"class.boost::system::error_condition"** %condition.addr, align 4
  %call = call zeroext i1 @_ZN5boost6systemeqERKNS0_15error_conditionES3_(%"class.boost::system::error_condition"* %ref.tmp, %"class.boost::system::error_condition"* %3)
  ret i1 %call
}

define linkonce_odr zeroext i1 @_ZNK5boost6system14error_category10equivalentERKNS0_10error_codeEi(%"class.boost::system::error_category"* %this, %"class.boost::system::error_code"* %code, i32 %condition) unnamed_addr inlinehint align 2 {
entry:
  %this.addr = alloca %"class.boost::system::error_category"*, align 4
  %code.addr = alloca %"class.boost::system::error_code"*, align 4
  %condition.addr = alloca i32, align 4
  store %"class.boost::system::error_category"* %this, %"class.boost::system::error_category"** %this.addr, align 4
  store %"class.boost::system::error_code"* %code, %"class.boost::system::error_code"** %code.addr, align 4
  store i32 %condition, i32* %condition.addr, align 4
  %this1 = load %"class.boost::system::error_category"** %this.addr
  %0 = load %"class.boost::system::error_code"** %code.addr, align 4
  %call = call %"class.boost::system::error_category"* @_ZNK5boost6system10error_code8categoryEv(%"class.boost::system::error_code"* %0)
  %call2 = call zeroext i1 @_ZNK5boost6system14error_categoryeqERKS1_(%"class.boost::system::error_category"* %this1, %"class.boost::system::error_category"* %call)
  br i1 %call2, label %land.rhs, label %land.end

land.rhs:                                         ; preds = %entry
  %1 = load %"class.boost::system::error_code"** %code.addr, align 4
  %call3 = call i32 @_ZNK5boost6system10error_code5valueEv(%"class.boost::system::error_code"* %1)
  %2 = load i32* %condition.addr, align 4
  %cmp = icmp eq i32 %call3, %2
  br label %land.end

land.end:                                         ; preds = %land.rhs, %entry
  %3 = phi i1 [ false, %entry ], [ %cmp, %land.rhs ]
  ret i1 %3
}

define linkonce_odr void @_ZN5boost6system12system_errorD1Ev(%"class.boost::system::system_error"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::system::system_error"*, align 4
  store %"class.boost::system::system_error"* %this, %"class.boost::system::system_error"** %this.addr, align 4
  %this1 = load %"class.boost::system::system_error"** %this.addr
  call void @_ZN5boost6system12system_errorD2Ev(%"class.boost::system::system_error"* %this1) nounwind
  ret void
}

define linkonce_odr void @_ZN5boost6system12system_errorD0Ev(%"class.boost::system::system_error"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::system::system_error"*, align 4
  store %"class.boost::system::system_error"* %this, %"class.boost::system::system_error"** %this.addr, align 4
  %this1 = load %"class.boost::system::system_error"** %this.addr
  call void @_ZN5boost6system12system_errorD1Ev(%"class.boost::system::system_error"* %this1) nounwind
  %0 = bitcast %"class.boost::system::system_error"* %this1 to i8*
  call void @_ZdlPv(i8* %0) nounwind
  ret void
}

define linkonce_odr void @_ZN5boost6threadC2IPFvvEEET_NS_10disable_ifINS_14is_convertibleIRS4_NS_6detail13thread_move_tIS4_EEEEPNS0_5dummyEE4typeE(%"class.boost::thread"* %this, void ()* %f, %"struct.boost::thread::dummy"*) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::thread"*, align 4
  %f.addr = alloca void ()*, align 4
  %.addr = alloca %"struct.boost::thread::dummy"*, align 4
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  store %"class.boost::thread"* %this, %"class.boost::thread"** %this.addr, align 4
  store void ()* %f, void ()** %f.addr, align 4
  store %"struct.boost::thread::dummy"* %0, %"struct.boost::thread::dummy"** %.addr, align 4
  %this1 = load %"class.boost::thread"** %this.addr
  %thread_info = getelementptr inbounds %"class.boost::thread"* %this1, i32 0, i32 0
  %1 = load void ()** %f.addr, align 4
  call void @_ZN5boost6thread16make_thread_infoIPFvvEEENS_10shared_ptrINS_6detail16thread_data_baseEEET_(%"class.boost::shared_ptr"* sret %thread_info, void ()* %1)
  invoke void @_ZN5boost6thread12start_threadEv(%"class.boost::thread"* %this1)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %entry
  ret void

lpad:                                             ; preds = %entry
  %2 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %3 = extractvalue { i8*, i32 } %2, 0
  store i8* %3, i8** %exn.slot
  %4 = extractvalue { i8*, i32 } %2, 1
  store i32 %4, i32* %ehselector.slot
  invoke void @_ZN5boost10shared_ptrINS_6detail16thread_data_baseEED1Ev(%"class.boost::shared_ptr"* %thread_info)
          to label %invoke.cont2 unwind label %terminate.lpad

invoke.cont2:                                     ; preds = %lpad
  br label %eh.resume

eh.resume:                                        ; preds = %invoke.cont2
  %exn = load i8** %exn.slot
  %sel = load i32* %ehselector.slot
  %lpad.val = insertvalue { i8*, i32 } undef, i8* %exn, 0
  %lpad.val3 = insertvalue { i8*, i32 } %lpad.val, i32 %sel, 1
  resume { i8*, i32 } %lpad.val3

terminate.lpad:                                   ; preds = %lpad
  %5 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          catch i8* null
  call void @_ZSt9terminatev() noreturn nounwind
  unreachable
}

define linkonce_odr void @_ZN5boost6thread16make_thread_infoIPFvvEEENS_10shared_ptrINS_6detail16thread_data_baseEEET_(%"class.boost::shared_ptr"* noalias sret %agg.result, void ()* %f) inlinehint align 2 {
entry:
  %f.addr = alloca void ()*, align 4
  store void ()* %f, void ()** %f.addr, align 4
  %call = call %"class.boost::detail::thread_data"* @_ZN5boost6detail8heap_newINS0_11thread_dataIPFvvEEES4_EEPT_RT0_(void ()** %f.addr)
  call void @_ZN5boost10shared_ptrINS_6detail16thread_data_baseEEC1INS1_11thread_dataIPFvvEEEEEPT_(%"class.boost::shared_ptr"* %agg.result, %"class.boost::detail::thread_data"* %call)
  ret void
}

declare void @_ZN5boost6thread12start_threadEv(%"class.boost::thread"*)

define linkonce_odr void @_ZN5boost10shared_ptrINS_6detail16thread_data_baseEED1Ev(%"class.boost::shared_ptr"* %this) unnamed_addr inlinehint align 2 {
entry:
  %this.addr = alloca %"class.boost::shared_ptr"*, align 4
  store %"class.boost::shared_ptr"* %this, %"class.boost::shared_ptr"** %this.addr, align 4
  %this1 = load %"class.boost::shared_ptr"** %this.addr
  call void @_ZN5boost10shared_ptrINS_6detail16thread_data_baseEED2Ev(%"class.boost::shared_ptr"* %this1)
  ret void
}

define linkonce_odr void @_ZN5boost10shared_ptrINS_6detail16thread_data_baseEED2Ev(%"class.boost::shared_ptr"* %this) unnamed_addr inlinehint align 2 {
entry:
  %this.addr = alloca %"class.boost::shared_ptr"*, align 4
  store %"class.boost::shared_ptr"* %this, %"class.boost::shared_ptr"** %this.addr, align 4
  %this1 = load %"class.boost::shared_ptr"** %this.addr
  %pn = getelementptr inbounds %"class.boost::shared_ptr"* %this1, i32 0, i32 1
  call void @_ZN5boost6detail12shared_countD1Ev(%"class.boost::detail::shared_count"* %pn)
  ret void
}

define linkonce_odr void @_ZN5boost6detail12shared_countD1Ev(%"class.boost::detail::shared_count"* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::detail::shared_count"*, align 4
  store %"class.boost::detail::shared_count"* %this, %"class.boost::detail::shared_count"** %this.addr, align 4
  %this1 = load %"class.boost::detail::shared_count"** %this.addr
  call void @_ZN5boost6detail12shared_countD2Ev(%"class.boost::detail::shared_count"* %this1)
  ret void
}

define linkonce_odr void @_ZN5boost6detail12shared_countD2Ev(%"class.boost::detail::shared_count"* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::detail::shared_count"*, align 4
  store %"class.boost::detail::shared_count"* %this, %"class.boost::detail::shared_count"** %this.addr, align 4
  %this1 = load %"class.boost::detail::shared_count"** %this.addr
  %pi_ = getelementptr inbounds %"class.boost::detail::shared_count"* %this1, i32 0, i32 0
  %0 = load %"class.boost::detail::sp_counted_base"** %pi_, align 4
  %cmp = icmp ne %"class.boost::detail::sp_counted_base"* %0, null
  br i1 %cmp, label %if.then, label %if.end

if.then:                                          ; preds = %entry
  %pi_2 = getelementptr inbounds %"class.boost::detail::shared_count"* %this1, i32 0, i32 0
  %1 = load %"class.boost::detail::sp_counted_base"** %pi_2, align 4
  call void @_ZN5boost6detail15sp_counted_base7releaseEv(%"class.boost::detail::sp_counted_base"* %1)
  br label %if.end

if.end:                                           ; preds = %if.then, %entry
  ret void
}

define linkonce_odr void @_ZN5boost6detail15sp_counted_base7releaseEv(%"class.boost::detail::sp_counted_base"* %this) align 2 {
entry:
  %this.addr = alloca %"class.boost::detail::sp_counted_base"*, align 4
  store %"class.boost::detail::sp_counted_base"* %this, %"class.boost::detail::sp_counted_base"** %this.addr, align 4
  %this1 = load %"class.boost::detail::sp_counted_base"** %this.addr
  %use_count_ = getelementptr inbounds %"class.boost::detail::sp_counted_base"* %this1, i32 0, i32 1
  %call = call i32 @_ZN5boost6detail23atomic_exchange_and_addEPii(i32* %use_count_, i32 -1)
  %cmp = icmp eq i32 %call, 1
  br i1 %cmp, label %if.then, label %if.end

if.then:                                          ; preds = %entry
  %0 = bitcast %"class.boost::detail::sp_counted_base"* %this1 to void (%"class.boost::detail::sp_counted_base"*)***
  %vtable = load void (%"class.boost::detail::sp_counted_base"*)*** %0
  %vfn = getelementptr inbounds void (%"class.boost::detail::sp_counted_base"*)** %vtable, i64 2
  %1 = load void (%"class.boost::detail::sp_counted_base"*)** %vfn
  call void %1(%"class.boost::detail::sp_counted_base"* %this1)
  call void @_ZN5boost6detail15sp_counted_base12weak_releaseEv(%"class.boost::detail::sp_counted_base"* %this1)
  br label %if.end

if.end:                                           ; preds = %if.then, %entry
  ret void
}

define linkonce_odr i32 @_ZN5boost6detail23atomic_exchange_and_addEPii(i32* %pw, i32 %dv) nounwind inlinehint {
entry:
  %pw.addr = alloca i32*, align 4
  %dv.addr = alloca i32, align 4
  %r = alloca i32, align 4
  store i32* %pw, i32** %pw.addr, align 4
  store i32 %dv, i32* %dv.addr, align 4
  %0 = load i32** %pw.addr, align 4
  %1 = load i32** %pw.addr, align 4
  %2 = load i32* %dv.addr, align 4
  %3 = call i32 asm sideeffect "lock\0A\09xadd $1, $0", "=*m,=r,*m,1,~{memory},~{cc},~{dirflag},~{fpsr},~{flags}"(i32* %0, i32* %1, i32 %2) nounwind, !srcloc !0
  store i32 %3, i32* %r, align 4
  %4 = load i32* %r, align 4
  ret i32 %4
}

define linkonce_odr void @_ZN5boost6detail15sp_counted_base12weak_releaseEv(%"class.boost::detail::sp_counted_base"* %this) align 2 {
entry:
  %this.addr = alloca %"class.boost::detail::sp_counted_base"*, align 4
  store %"class.boost::detail::sp_counted_base"* %this, %"class.boost::detail::sp_counted_base"** %this.addr, align 4
  %this1 = load %"class.boost::detail::sp_counted_base"** %this.addr
  %weak_count_ = getelementptr inbounds %"class.boost::detail::sp_counted_base"* %this1, i32 0, i32 2
  %call = call i32 @_ZN5boost6detail23atomic_exchange_and_addEPii(i32* %weak_count_, i32 -1)
  %cmp = icmp eq i32 %call, 1
  br i1 %cmp, label %if.then, label %if.end

if.then:                                          ; preds = %entry
  %0 = bitcast %"class.boost::detail::sp_counted_base"* %this1 to void (%"class.boost::detail::sp_counted_base"*)***
  %vtable = load void (%"class.boost::detail::sp_counted_base"*)*** %0
  %vfn = getelementptr inbounds void (%"class.boost::detail::sp_counted_base"*)** %vtable, i64 3
  %1 = load void (%"class.boost::detail::sp_counted_base"*)** %vfn
  call void %1(%"class.boost::detail::sp_counted_base"* %this1)
  br label %if.end

if.end:                                           ; preds = %if.then, %entry
  ret void
}

define linkonce_odr void @_ZN5boost10shared_ptrINS_6detail16thread_data_baseEEC1INS1_11thread_dataIPFvvEEEEEPT_(%"class.boost::shared_ptr"* %this, %"class.boost::detail::thread_data"* %p) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::shared_ptr"*, align 4
  %p.addr = alloca %"class.boost::detail::thread_data"*, align 4
  store %"class.boost::shared_ptr"* %this, %"class.boost::shared_ptr"** %this.addr, align 4
  store %"class.boost::detail::thread_data"* %p, %"class.boost::detail::thread_data"** %p.addr, align 4
  %this1 = load %"class.boost::shared_ptr"** %this.addr
  %0 = load %"class.boost::detail::thread_data"** %p.addr, align 4
  call void @_ZN5boost10shared_ptrINS_6detail16thread_data_baseEEC2INS1_11thread_dataIPFvvEEEEEPT_(%"class.boost::shared_ptr"* %this1, %"class.boost::detail::thread_data"* %0)
  ret void
}

define linkonce_odr %"class.boost::detail::thread_data"* @_ZN5boost6detail8heap_newINS0_11thread_dataIPFvvEEES4_EEPT_RT0_(void ()** %a1) inlinehint {
entry:
  %a1.addr = alloca void ()**, align 4
  store void ()** %a1, void ()*** %a1.addr, align 4
  %0 = load void ()*** %a1.addr, align 4
  %call = call %"class.boost::detail::thread_data"* @_ZN5boost6detail13heap_new_implINS0_11thread_dataIPFvvEEERS4_EEPT_T0_(void ()** %0)
  ret %"class.boost::detail::thread_data"* %call
}

define linkonce_odr %"class.boost::detail::thread_data"* @_ZN5boost6detail13heap_new_implINS0_11thread_dataIPFvvEEERS4_EEPT_T0_(void ()** %a1) inlinehint {
entry:
  %a1.addr = alloca void ()**, align 4
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  store void ()** %a1, void ()*** %a1.addr, align 4
  %call = call noalias i8* @_Znwj(i32 276)
  %0 = bitcast i8* %call to %"class.boost::detail::thread_data"*
  %1 = load void ()*** %a1.addr, align 4
  %2 = load void ()** %1, align 4
  invoke void @_ZN5boost6detail11thread_dataIPFvvEEC1ES3_(%"class.boost::detail::thread_data"* %0, void ()* %2)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %entry
  ret %"class.boost::detail::thread_data"* %0

lpad:                                             ; preds = %entry
  %3 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %4 = extractvalue { i8*, i32 } %3, 0
  store i8* %4, i8** %exn.slot
  %5 = extractvalue { i8*, i32 } %3, 1
  store i32 %5, i32* %ehselector.slot
  call void @_ZdlPv(i8* %call) nounwind
  br label %eh.resume

eh.resume:                                        ; preds = %lpad
  %exn = load i8** %exn.slot
  %sel = load i32* %ehselector.slot
  %lpad.val = insertvalue { i8*, i32 } undef, i8* %exn, 0
  %lpad.val1 = insertvalue { i8*, i32 } %lpad.val, i32 %sel, 1
  resume { i8*, i32 } %lpad.val1
}

declare noalias i8* @_Znwj(i32)

define linkonce_odr void @_ZN5boost6detail11thread_dataIPFvvEEC1ES3_(%"class.boost::detail::thread_data"* %this, void ()* %f_) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::detail::thread_data"*, align 4
  %f_.addr = alloca void ()*, align 4
  store %"class.boost::detail::thread_data"* %this, %"class.boost::detail::thread_data"** %this.addr, align 4
  store void ()* %f_, void ()** %f_.addr, align 4
  %this1 = load %"class.boost::detail::thread_data"** %this.addr
  %0 = load void ()** %f_.addr, align 4
  call void @_ZN5boost6detail11thread_dataIPFvvEEC2ES3_(%"class.boost::detail::thread_data"* %this1, void ()* %0)
  ret void
}

declare void @_ZdlPv(i8*) nounwind

define linkonce_odr void @_ZN5boost6detail11thread_dataIPFvvEEC2ES3_(%"class.boost::detail::thread_data"* %this, void ()* %f_) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::detail::thread_data"*, align 4
  %f_.addr = alloca void ()*, align 4
  store %"class.boost::detail::thread_data"* %this, %"class.boost::detail::thread_data"** %this.addr, align 4
  store void ()* %f_, void ()** %f_.addr, align 4
  %this1 = load %"class.boost::detail::thread_data"** %this.addr
  %0 = bitcast %"class.boost::detail::thread_data"* %this1 to %"struct.boost::detail::thread_data_base"*
  call void @_ZN5boost6detail16thread_data_baseC2Ev(%"struct.boost::detail::thread_data_base"* %0)
  %1 = bitcast %"class.boost::detail::thread_data"* %this1 to i8***
  store i8** getelementptr inbounds ([5 x i8*]* @_ZTVN5boost6detail11thread_dataIPFvvEEE, i64 0, i64 2), i8*** %1
  %f = getelementptr inbounds %"class.boost::detail::thread_data"* %this1, i32 0, i32 1
  %2 = load void ()** %f_.addr, align 4
  store void ()* %2, void ()** %f, align 4
  ret void
}

define linkonce_odr void @_ZN5boost6detail16thread_data_baseC2Ev(%"struct.boost::detail::thread_data_base"* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"struct.boost::detail::thread_data_base"*, align 4
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  store %"struct.boost::detail::thread_data_base"* %this, %"struct.boost::detail::thread_data_base"** %this.addr, align 4
  %this1 = load %"struct.boost::detail::thread_data_base"** %this.addr
  %0 = bitcast %"struct.boost::detail::thread_data_base"* %this1 to i8*
  %1 = getelementptr inbounds i8* %0, i64 4
  %2 = bitcast i8* %1 to %"class.boost::enable_shared_from_this"*
  call void @_ZN5boost23enable_shared_from_thisINS_6detail16thread_data_baseEEC2Ev(%"class.boost::enable_shared_from_this"* %2)
  %3 = bitcast %"struct.boost::detail::thread_data_base"* %this1 to i8***
  store i8** getelementptr inbounds ([5 x i8*]* @_ZTVN5boost6detail16thread_data_baseE, i64 0, i64 2), i8*** %3
  %self = getelementptr inbounds %"struct.boost::detail::thread_data_base"* %this1, i32 0, i32 2
  invoke void @_ZN5boost10shared_ptrINS_6detail16thread_data_baseEEC1Ev(%"class.boost::shared_ptr"* %self)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %entry
  %data_mutex = getelementptr inbounds %"struct.boost::detail::thread_data_base"* %this1, i32 0, i32 4
  invoke void @_ZN5boost5mutexC1Ev(%"class.boost::mutex"* %data_mutex)
          to label %invoke.cont3 unwind label %lpad2

invoke.cont3:                                     ; preds = %invoke.cont
  %done_condition = getelementptr inbounds %"struct.boost::detail::thread_data_base"* %this1, i32 0, i32 5
  invoke void @_ZN5boost18condition_variableC1Ev(%"class.boost::condition_variable"* %done_condition)
          to label %invoke.cont5 unwind label %lpad4

invoke.cont5:                                     ; preds = %invoke.cont3
  %sleep_mutex = getelementptr inbounds %"struct.boost::detail::thread_data_base"* %this1, i32 0, i32 6
  invoke void @_ZN5boost5mutexC1Ev(%"class.boost::mutex"* %sleep_mutex)
          to label %invoke.cont7 unwind label %lpad6

invoke.cont7:                                     ; preds = %invoke.cont5
  %sleep_condition = getelementptr inbounds %"struct.boost::detail::thread_data_base"* %this1, i32 0, i32 7
  invoke void @_ZN5boost18condition_variableC1Ev(%"class.boost::condition_variable"* %sleep_condition)
          to label %invoke.cont9 unwind label %lpad8

invoke.cont9:                                     ; preds = %invoke.cont7
  %done = getelementptr inbounds %"struct.boost::detail::thread_data_base"* %this1, i32 0, i32 8
  store i8 0, i8* %done, align 1
  %join_started = getelementptr inbounds %"struct.boost::detail::thread_data_base"* %this1, i32 0, i32 9
  store i8 0, i8* %join_started, align 1
  %joined = getelementptr inbounds %"struct.boost::detail::thread_data_base"* %this1, i32 0, i32 10
  store i8 0, i8* %joined, align 1
  %thread_exit_callbacks = getelementptr inbounds %"struct.boost::detail::thread_data_base"* %this1, i32 0, i32 11
  store %"struct.boost::detail::thread_exit_callback_node"* null, %"struct.boost::detail::thread_exit_callback_node"** %thread_exit_callbacks, align 4
  %tss_data = getelementptr inbounds %"struct.boost::detail::thread_data_base"* %this1, i32 0, i32 12
  invoke void @_ZNSt3mapIPKvN5boost6detail13tss_data_nodeESt4lessIS1_ESaISt4pairIKS1_S4_EEEC1Ev(%"class.std::map"* %tss_data)
          to label %invoke.cont11 unwind label %lpad10

invoke.cont11:                                    ; preds = %invoke.cont9
  %interrupt_enabled = getelementptr inbounds %"struct.boost::detail::thread_data_base"* %this1, i32 0, i32 13
  store i8 1, i8* %interrupt_enabled, align 1
  %interrupt_requested = getelementptr inbounds %"struct.boost::detail::thread_data_base"* %this1, i32 0, i32 14
  store i8 0, i8* %interrupt_requested, align 1
  %current_cond = getelementptr inbounds %"struct.boost::detail::thread_data_base"* %this1, i32 0, i32 16
  store %union.pthread_cond_t* null, %union.pthread_cond_t** %current_cond, align 4
  %notify = getelementptr inbounds %"struct.boost::detail::thread_data_base"* %this1, i32 0, i32 17
  invoke void @_ZNSt6vectorISt4pairIPN5boost18condition_variableEPNS1_5mutexEESaIS6_EEC1Ev(%"class.std::vector.22"* %notify)
          to label %invoke.cont13 unwind label %lpad12

invoke.cont13:                                    ; preds = %invoke.cont11
  ret void

lpad:                                             ; preds = %entry
  %4 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %5 = extractvalue { i8*, i32 } %4, 0
  store i8* %5, i8** %exn.slot
  %6 = extractvalue { i8*, i32 } %4, 1
  store i32 %6, i32* %ehselector.slot
  br label %ehcleanup24

lpad2:                                            ; preds = %invoke.cont
  %7 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %8 = extractvalue { i8*, i32 } %7, 0
  store i8* %8, i8** %exn.slot
  %9 = extractvalue { i8*, i32 } %7, 1
  store i32 %9, i32* %ehselector.slot
  br label %ehcleanup22

lpad4:                                            ; preds = %invoke.cont3
  %10 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %11 = extractvalue { i8*, i32 } %10, 0
  store i8* %11, i8** %exn.slot
  %12 = extractvalue { i8*, i32 } %10, 1
  store i32 %12, i32* %ehselector.slot
  br label %ehcleanup20

lpad6:                                            ; preds = %invoke.cont5
  %13 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %14 = extractvalue { i8*, i32 } %13, 0
  store i8* %14, i8** %exn.slot
  %15 = extractvalue { i8*, i32 } %13, 1
  store i32 %15, i32* %ehselector.slot
  br label %ehcleanup18

lpad8:                                            ; preds = %invoke.cont7
  %16 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %17 = extractvalue { i8*, i32 } %16, 0
  store i8* %17, i8** %exn.slot
  %18 = extractvalue { i8*, i32 } %16, 1
  store i32 %18, i32* %ehselector.slot
  br label %ehcleanup16

lpad10:                                           ; preds = %invoke.cont9
  %19 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %20 = extractvalue { i8*, i32 } %19, 0
  store i8* %20, i8** %exn.slot
  %21 = extractvalue { i8*, i32 } %19, 1
  store i32 %21, i32* %ehselector.slot
  br label %ehcleanup

lpad12:                                           ; preds = %invoke.cont11
  %22 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %23 = extractvalue { i8*, i32 } %22, 0
  store i8* %23, i8** %exn.slot
  %24 = extractvalue { i8*, i32 } %22, 1
  store i32 %24, i32* %ehselector.slot
  invoke void @_ZNSt3mapIPKvN5boost6detail13tss_data_nodeESt4lessIS1_ESaISt4pairIKS1_S4_EEED1Ev(%"class.std::map"* %tss_data)
          to label %invoke.cont14 unwind label %terminate.lpad

invoke.cont14:                                    ; preds = %lpad12
  br label %ehcleanup

ehcleanup:                                        ; preds = %invoke.cont14, %lpad10
  invoke void @_ZN5boost18condition_variableD1Ev(%"class.boost::condition_variable"* %sleep_condition)
          to label %invoke.cont15 unwind label %terminate.lpad

invoke.cont15:                                    ; preds = %ehcleanup
  br label %ehcleanup16

ehcleanup16:                                      ; preds = %invoke.cont15, %lpad8
  invoke void @_ZN5boost5mutexD1Ev(%"class.boost::mutex"* %sleep_mutex)
          to label %invoke.cont17 unwind label %terminate.lpad

invoke.cont17:                                    ; preds = %ehcleanup16
  br label %ehcleanup18

ehcleanup18:                                      ; preds = %invoke.cont17, %lpad6
  invoke void @_ZN5boost18condition_variableD1Ev(%"class.boost::condition_variable"* %done_condition)
          to label %invoke.cont19 unwind label %terminate.lpad

invoke.cont19:                                    ; preds = %ehcleanup18
  br label %ehcleanup20

ehcleanup20:                                      ; preds = %invoke.cont19, %lpad4
  invoke void @_ZN5boost5mutexD1Ev(%"class.boost::mutex"* %data_mutex)
          to label %invoke.cont21 unwind label %terminate.lpad

invoke.cont21:                                    ; preds = %ehcleanup20
  br label %ehcleanup22

ehcleanup22:                                      ; preds = %invoke.cont21, %lpad2
  invoke void @_ZN5boost10shared_ptrINS_6detail16thread_data_baseEED1Ev(%"class.boost::shared_ptr"* %self)
          to label %invoke.cont23 unwind label %terminate.lpad

invoke.cont23:                                    ; preds = %ehcleanup22
  br label %ehcleanup24

ehcleanup24:                                      ; preds = %invoke.cont23, %lpad
  %25 = bitcast %"struct.boost::detail::thread_data_base"* %this1 to i8*
  %26 = getelementptr inbounds i8* %25, i64 4
  %27 = bitcast i8* %26 to %"class.boost::enable_shared_from_this"*
  invoke void @_ZN5boost23enable_shared_from_thisINS_6detail16thread_data_baseEED2Ev(%"class.boost::enable_shared_from_this"* %27)
          to label %invoke.cont25 unwind label %terminate.lpad

invoke.cont25:                                    ; preds = %ehcleanup24
  br label %eh.resume

eh.resume:                                        ; preds = %invoke.cont25
  %exn = load i8** %exn.slot
  %sel = load i32* %ehselector.slot
  %lpad.val = insertvalue { i8*, i32 } undef, i8* %exn, 0
  %lpad.val26 = insertvalue { i8*, i32 } %lpad.val, i32 %sel, 1
  resume { i8*, i32 } %lpad.val26

terminate.lpad:                                   ; preds = %ehcleanup24, %ehcleanup22, %ehcleanup20, %ehcleanup18, %ehcleanup16, %ehcleanup, %lpad12
  %28 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          catch i8* null
  call void @_ZSt9terminatev() noreturn nounwind
  unreachable
}

define linkonce_odr void @_ZN5boost6detail11thread_dataIPFvvEED1Ev(%"class.boost::detail::thread_data"* %this) unnamed_addr inlinehint align 2 {
entry:
  %this.addr = alloca %"class.boost::detail::thread_data"*, align 4
  store %"class.boost::detail::thread_data"* %this, %"class.boost::detail::thread_data"** %this.addr, align 4
  %this1 = load %"class.boost::detail::thread_data"** %this.addr
  call void @_ZN5boost6detail11thread_dataIPFvvEED2Ev(%"class.boost::detail::thread_data"* %this1)
  ret void
}

define linkonce_odr void @_ZN5boost6detail11thread_dataIPFvvEED0Ev(%"class.boost::detail::thread_data"* %this) unnamed_addr inlinehint align 2 {
entry:
  %this.addr = alloca %"class.boost::detail::thread_data"*, align 4
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  store %"class.boost::detail::thread_data"* %this, %"class.boost::detail::thread_data"** %this.addr, align 4
  %this1 = load %"class.boost::detail::thread_data"** %this.addr
  invoke void @_ZN5boost6detail11thread_dataIPFvvEED1Ev(%"class.boost::detail::thread_data"* %this1)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %entry
  %0 = bitcast %"class.boost::detail::thread_data"* %this1 to i8*
  call void @_ZdlPv(i8* %0) nounwind
  ret void

lpad:                                             ; preds = %entry
  %1 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %2 = extractvalue { i8*, i32 } %1, 0
  store i8* %2, i8** %exn.slot
  %3 = extractvalue { i8*, i32 } %1, 1
  store i32 %3, i32* %ehselector.slot
  %4 = bitcast %"class.boost::detail::thread_data"* %this1 to i8*
  call void @_ZdlPv(i8* %4) nounwind
  br label %eh.resume

eh.resume:                                        ; preds = %lpad
  %exn = load i8** %exn.slot
  %sel = load i32* %ehselector.slot
  %lpad.val = insertvalue { i8*, i32 } undef, i8* %exn, 0
  %lpad.val2 = insertvalue { i8*, i32 } %lpad.val, i32 %sel, 1
  resume { i8*, i32 } %lpad.val2
}

define linkonce_odr void @_ZN5boost6detail11thread_dataIPFvvEE3runEv(%"class.boost::detail::thread_data"* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::detail::thread_data"*, align 4
  store %"class.boost::detail::thread_data"* %this, %"class.boost::detail::thread_data"** %this.addr, align 4
  %this1 = load %"class.boost::detail::thread_data"** %this.addr
  %f = getelementptr inbounds %"class.boost::detail::thread_data"* %this1, i32 0, i32 1
  %0 = load void ()** %f, align 4
  call void %0()
  ret void
}

define linkonce_odr void @_ZN5boost6detail11thread_dataIPFvvEED2Ev(%"class.boost::detail::thread_data"* %this) unnamed_addr inlinehint align 2 {
entry:
  %this.addr = alloca %"class.boost::detail::thread_data"*, align 4
  store %"class.boost::detail::thread_data"* %this, %"class.boost::detail::thread_data"** %this.addr, align 4
  %this1 = load %"class.boost::detail::thread_data"** %this.addr
  %0 = bitcast %"class.boost::detail::thread_data"* %this1 to %"struct.boost::detail::thread_data_base"*
  call void @_ZN5boost6detail16thread_data_baseD2Ev(%"struct.boost::detail::thread_data_base"* %0)
  ret void
}

declare void @_ZN5boost6detail16thread_data_baseD2Ev(%"struct.boost::detail::thread_data_base"*)

define linkonce_odr void @_ZN5boost23enable_shared_from_thisINS_6detail16thread_data_baseEEC2Ev(%"class.boost::enable_shared_from_this"* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::enable_shared_from_this"*, align 4
  store %"class.boost::enable_shared_from_this"* %this, %"class.boost::enable_shared_from_this"** %this.addr, align 4
  %this1 = load %"class.boost::enable_shared_from_this"** %this.addr
  %weak_this_ = getelementptr inbounds %"class.boost::enable_shared_from_this"* %this1, i32 0, i32 0
  call void @_ZN5boost8weak_ptrINS_6detail16thread_data_baseEEC1Ev(%"class.boost::weak_ptr"* %weak_this_)
  ret void
}

define linkonce_odr void @_ZN5boost10shared_ptrINS_6detail16thread_data_baseEEC1Ev(%"class.boost::shared_ptr"* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::shared_ptr"*, align 4
  store %"class.boost::shared_ptr"* %this, %"class.boost::shared_ptr"** %this.addr, align 4
  %this1 = load %"class.boost::shared_ptr"** %this.addr
  call void @_ZN5boost10shared_ptrINS_6detail16thread_data_baseEEC2Ev(%"class.boost::shared_ptr"* %this1)
  ret void
}

define linkonce_odr void @_ZN5boost18condition_variableC1Ev(%"class.boost::condition_variable"* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::condition_variable"*, align 4
  store %"class.boost::condition_variable"* %this, %"class.boost::condition_variable"** %this.addr, align 4
  %this1 = load %"class.boost::condition_variable"** %this.addr
  call void @_ZN5boost18condition_variableC2Ev(%"class.boost::condition_variable"* %this1)
  ret void
}

define linkonce_odr void @_ZNSt3mapIPKvN5boost6detail13tss_data_nodeESt4lessIS1_ESaISt4pairIKS1_S4_EEEC1Ev(%"class.std::map"* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.std::map"*, align 4
  store %"class.std::map"* %this, %"class.std::map"** %this.addr, align 4
  %this1 = load %"class.std::map"** %this.addr
  call void @_ZNSt3mapIPKvN5boost6detail13tss_data_nodeESt4lessIS1_ESaISt4pairIKS1_S4_EEEC2Ev(%"class.std::map"* %this1)
  ret void
}

define linkonce_odr void @_ZNSt6vectorISt4pairIPN5boost18condition_variableEPNS1_5mutexEESaIS6_EEC1Ev(%"class.std::vector.22"* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.std::vector.22"*, align 4
  store %"class.std::vector.22"* %this, %"class.std::vector.22"** %this.addr, align 4
  %this1 = load %"class.std::vector.22"** %this.addr
  call void @_ZNSt6vectorISt4pairIPN5boost18condition_variableEPNS1_5mutexEESaIS6_EEC2Ev(%"class.std::vector.22"* %this1)
  ret void
}

define linkonce_odr void @_ZNSt3mapIPKvN5boost6detail13tss_data_nodeESt4lessIS1_ESaISt4pairIKS1_S4_EEED1Ev(%"class.std::map"* %this) unnamed_addr inlinehint align 2 {
entry:
  %this.addr = alloca %"class.std::map"*, align 4
  store %"class.std::map"* %this, %"class.std::map"** %this.addr, align 4
  %this1 = load %"class.std::map"** %this.addr
  call void @_ZNSt3mapIPKvN5boost6detail13tss_data_nodeESt4lessIS1_ESaISt4pairIKS1_S4_EEED2Ev(%"class.std::map"* %this1)
  ret void
}

define linkonce_odr void @_ZN5boost18condition_variableD1Ev(%"class.boost::condition_variable"* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::condition_variable"*, align 4
  store %"class.boost::condition_variable"* %this, %"class.boost::condition_variable"** %this.addr, align 4
  %this1 = load %"class.boost::condition_variable"** %this.addr
  call void @_ZN5boost18condition_variableD2Ev(%"class.boost::condition_variable"* %this1)
  ret void
}

define linkonce_odr void @_ZN5boost23enable_shared_from_thisINS_6detail16thread_data_baseEED2Ev(%"class.boost::enable_shared_from_this"* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::enable_shared_from_this"*, align 4
  store %"class.boost::enable_shared_from_this"* %this, %"class.boost::enable_shared_from_this"** %this.addr, align 4
  %this1 = load %"class.boost::enable_shared_from_this"** %this.addr
  %weak_this_ = getelementptr inbounds %"class.boost::enable_shared_from_this"* %this1, i32 0, i32 0
  call void @_ZN5boost8weak_ptrINS_6detail16thread_data_baseEED1Ev(%"class.boost::weak_ptr"* %weak_this_)
  ret void
}

define linkonce_odr void @_ZN5boost8weak_ptrINS_6detail16thread_data_baseEED1Ev(%"class.boost::weak_ptr"* %this) unnamed_addr inlinehint align 2 {
entry:
  %this.addr = alloca %"class.boost::weak_ptr"*, align 4
  store %"class.boost::weak_ptr"* %this, %"class.boost::weak_ptr"** %this.addr, align 4
  %this1 = load %"class.boost::weak_ptr"** %this.addr
  call void @_ZN5boost8weak_ptrINS_6detail16thread_data_baseEED2Ev(%"class.boost::weak_ptr"* %this1)
  ret void
}

define linkonce_odr void @_ZN5boost8weak_ptrINS_6detail16thread_data_baseEED2Ev(%"class.boost::weak_ptr"* %this) unnamed_addr inlinehint align 2 {
entry:
  %this.addr = alloca %"class.boost::weak_ptr"*, align 4
  store %"class.boost::weak_ptr"* %this, %"class.boost::weak_ptr"** %this.addr, align 4
  %this1 = load %"class.boost::weak_ptr"** %this.addr
  %pn = getelementptr inbounds %"class.boost::weak_ptr"* %this1, i32 0, i32 1
  call void @_ZN5boost6detail10weak_countD1Ev(%"class.boost::detail::weak_count"* %pn)
  ret void
}

define linkonce_odr void @_ZN5boost6detail10weak_countD1Ev(%"class.boost::detail::weak_count"* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::detail::weak_count"*, align 4
  store %"class.boost::detail::weak_count"* %this, %"class.boost::detail::weak_count"** %this.addr, align 4
  %this1 = load %"class.boost::detail::weak_count"** %this.addr
  call void @_ZN5boost6detail10weak_countD2Ev(%"class.boost::detail::weak_count"* %this1)
  ret void
}

define linkonce_odr void @_ZN5boost6detail10weak_countD2Ev(%"class.boost::detail::weak_count"* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::detail::weak_count"*, align 4
  store %"class.boost::detail::weak_count"* %this, %"class.boost::detail::weak_count"** %this.addr, align 4
  %this1 = load %"class.boost::detail::weak_count"** %this.addr
  %pi_ = getelementptr inbounds %"class.boost::detail::weak_count"* %this1, i32 0, i32 0
  %0 = load %"class.boost::detail::sp_counted_base"** %pi_, align 4
  %cmp = icmp ne %"class.boost::detail::sp_counted_base"* %0, null
  br i1 %cmp, label %if.then, label %if.end

if.then:                                          ; preds = %entry
  %pi_2 = getelementptr inbounds %"class.boost::detail::weak_count"* %this1, i32 0, i32 0
  %1 = load %"class.boost::detail::sp_counted_base"** %pi_2, align 4
  call void @_ZN5boost6detail15sp_counted_base12weak_releaseEv(%"class.boost::detail::sp_counted_base"* %1)
  br label %if.end

if.end:                                           ; preds = %if.then, %entry
  ret void
}

define linkonce_odr void @_ZN5boost18condition_variableD2Ev(%"class.boost::condition_variable"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::condition_variable"*, align 4
  %ret = alloca i32, align 4
  store %"class.boost::condition_variable"* %this, %"class.boost::condition_variable"** %this.addr, align 4
  %this1 = load %"class.boost::condition_variable"** %this.addr
  %internal_mutex = getelementptr inbounds %"class.boost::condition_variable"* %this1, i32 0, i32 0
  %call = call i32 @pthread_mutex_destroy(%union.pthread_mutex_t* %internal_mutex) nounwind
  %tobool = icmp ne i32 %call, 0
  br i1 %tobool, label %cond.false, label %cond.true

cond.true:                                        ; preds = %entry
  br label %cond.end

cond.false:                                       ; preds = %entry
  call void @__assert_fail(i8* getelementptr inbounds ([40 x i8]* @.str17, i32 0, i32 0), i8* getelementptr inbounds ([74 x i8]* @.str18, i32 0, i32 0), i32 52, i8* getelementptr inbounds ([49 x i8]* @__PRETTY_FUNCTION__._ZN5boost18condition_variableD2Ev, i32 0, i32 0)) noreturn nounwind
  unreachable
                                                  ; No predecessors!
  br label %cond.end

cond.end:                                         ; preds = %0, %cond.true
  br label %do.body

do.body:                                          ; preds = %do.cond, %cond.end
  %cond = getelementptr inbounds %"class.boost::condition_variable"* %this1, i32 0, i32 1
  %call2 = call i32 @pthread_cond_destroy(%union.pthread_cond_t* %cond) nounwind
  store i32 %call2, i32* %ret, align 4
  br label %do.cond

do.cond:                                          ; preds = %do.body
  %1 = load i32* %ret, align 4
  %cmp = icmp eq i32 %1, 4
  br i1 %cmp, label %do.body, label %do.end

do.end:                                           ; preds = %do.cond
  %2 = load i32* %ret, align 4
  %tobool3 = icmp ne i32 %2, 0
  br i1 %tobool3, label %cond.false5, label %cond.true4

cond.true4:                                       ; preds = %do.end
  br label %cond.end6

cond.false5:                                      ; preds = %do.end
  call void @__assert_fail(i8* getelementptr inbounds ([5 x i8]* @.str19, i32 0, i32 0), i8* getelementptr inbounds ([74 x i8]* @.str18, i32 0, i32 0), i32 57, i8* getelementptr inbounds ([49 x i8]* @__PRETTY_FUNCTION__._ZN5boost18condition_variableD2Ev, i32 0, i32 0)) noreturn nounwind
  unreachable
                                                  ; No predecessors!
  br label %cond.end6

cond.end6:                                        ; preds = %3, %cond.true4
  ret void
}

declare i32 @pthread_mutex_destroy(%union.pthread_mutex_t*) nounwind

declare void @__assert_fail(i8*, i8*, i32, i8*) noreturn nounwind

declare i32 @pthread_cond_destroy(%union.pthread_cond_t*) nounwind

define linkonce_odr void @_ZNSt3mapIPKvN5boost6detail13tss_data_nodeESt4lessIS1_ESaISt4pairIKS1_S4_EEED2Ev(%"class.std::map"* %this) unnamed_addr inlinehint align 2 {
entry:
  %this.addr = alloca %"class.std::map"*, align 4
  store %"class.std::map"* %this, %"class.std::map"** %this.addr, align 4
  %this1 = load %"class.std::map"** %this.addr
  %_M_t = getelementptr inbounds %"class.std::map"* %this1, i32 0, i32 0
  call void @_ZNSt8_Rb_treeIPKvSt4pairIKS1_N5boost6detail13tss_data_nodeEESt10_Select1stIS7_ESt4lessIS1_ESaIS7_EED1Ev(%"class.std::_Rb_tree"* %_M_t)
  ret void
}

define linkonce_odr void @_ZNSt8_Rb_treeIPKvSt4pairIKS1_N5boost6detail13tss_data_nodeEESt10_Select1stIS7_ESt4lessIS1_ESaIS7_EED1Ev(%"class.std::_Rb_tree"* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.std::_Rb_tree"*, align 4
  store %"class.std::_Rb_tree"* %this, %"class.std::_Rb_tree"** %this.addr, align 4
  %this1 = load %"class.std::_Rb_tree"** %this.addr
  call void @_ZNSt8_Rb_treeIPKvSt4pairIKS1_N5boost6detail13tss_data_nodeEESt10_Select1stIS7_ESt4lessIS1_ESaIS7_EED2Ev(%"class.std::_Rb_tree"* %this1)
  ret void
}

define linkonce_odr void @_ZNSt8_Rb_treeIPKvSt4pairIKS1_N5boost6detail13tss_data_nodeEESt10_Select1stIS7_ESt4lessIS1_ESaIS7_EED2Ev(%"class.std::_Rb_tree"* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.std::_Rb_tree"*, align 4
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  store %"class.std::_Rb_tree"* %this, %"class.std::_Rb_tree"** %this.addr, align 4
  %this1 = load %"class.std::_Rb_tree"** %this.addr
  %call = invoke %"struct.std::_Rb_tree_node"* @_ZNSt8_Rb_treeIPKvSt4pairIKS1_N5boost6detail13tss_data_nodeEESt10_Select1stIS7_ESt4lessIS1_ESaIS7_EE8_M_beginEv(%"class.std::_Rb_tree"* %this1)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %entry
  invoke void @_ZNSt8_Rb_treeIPKvSt4pairIKS1_N5boost6detail13tss_data_nodeEESt10_Select1stIS7_ESt4lessIS1_ESaIS7_EE8_M_eraseEPSt13_Rb_tree_nodeIS7_E(%"class.std::_Rb_tree"* %this1, %"struct.std::_Rb_tree_node"* %call)
          to label %invoke.cont2 unwind label %lpad

invoke.cont2:                                     ; preds = %invoke.cont
  %_M_impl = getelementptr inbounds %"class.std::_Rb_tree"* %this1, i32 0, i32 0
  call void @_ZNSt8_Rb_treeIPKvSt4pairIKS1_N5boost6detail13tss_data_nodeEESt10_Select1stIS7_ESt4lessIS1_ESaIS7_EE13_Rb_tree_implISB_Lb0EED1Ev(%"struct.std::_Rb_tree<const void *, std::pair<const void *const, boost::detail::tss_data_node>, std::_Select1st<std::pair<const void *const, boost::detail::tss_data_node> >, std::less<const void *>, std::allocator<std::pair<const void *const, boost::detail::tss_data_node> > >::_Rb_tree_impl"* %_M_impl) nounwind
  ret void

lpad:                                             ; preds = %invoke.cont, %entry
  %0 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %1 = extractvalue { i8*, i32 } %0, 0
  store i8* %1, i8** %exn.slot
  %2 = extractvalue { i8*, i32 } %0, 1
  store i32 %2, i32* %ehselector.slot
  %_M_impl3 = getelementptr inbounds %"class.std::_Rb_tree"* %this1, i32 0, i32 0
  call void @_ZNSt8_Rb_treeIPKvSt4pairIKS1_N5boost6detail13tss_data_nodeEESt10_Select1stIS7_ESt4lessIS1_ESaIS7_EE13_Rb_tree_implISB_Lb0EED1Ev(%"struct.std::_Rb_tree<const void *, std::pair<const void *const, boost::detail::tss_data_node>, std::_Select1st<std::pair<const void *const, boost::detail::tss_data_node> >, std::less<const void *>, std::allocator<std::pair<const void *const, boost::detail::tss_data_node> > >::_Rb_tree_impl"* %_M_impl3) nounwind
  br label %eh.resume

eh.resume:                                        ; preds = %lpad
  %exn = load i8** %exn.slot
  %sel = load i32* %ehselector.slot
  %lpad.val = insertvalue { i8*, i32 } undef, i8* %exn, 0
  %lpad.val4 = insertvalue { i8*, i32 } %lpad.val, i32 %sel, 1
  resume { i8*, i32 } %lpad.val4
}

define linkonce_odr void @_ZNSt8_Rb_treeIPKvSt4pairIKS1_N5boost6detail13tss_data_nodeEESt10_Select1stIS7_ESt4lessIS1_ESaIS7_EE8_M_eraseEPSt13_Rb_tree_nodeIS7_E(%"class.std::_Rb_tree"* %this, %"struct.std::_Rb_tree_node"* %__x) align 2 {
entry:
  %this.addr = alloca %"class.std::_Rb_tree"*, align 4
  %__x.addr = alloca %"struct.std::_Rb_tree_node"*, align 4
  %__y = alloca %"struct.std::_Rb_tree_node"*, align 4
  store %"class.std::_Rb_tree"* %this, %"class.std::_Rb_tree"** %this.addr, align 4
  store %"struct.std::_Rb_tree_node"* %__x, %"struct.std::_Rb_tree_node"** %__x.addr, align 4
  %this1 = load %"class.std::_Rb_tree"** %this.addr
  br label %while.cond

while.cond:                                       ; preds = %while.body, %entry
  %0 = load %"struct.std::_Rb_tree_node"** %__x.addr, align 4
  %cmp = icmp ne %"struct.std::_Rb_tree_node"* %0, null
  br i1 %cmp, label %while.body, label %while.end

while.body:                                       ; preds = %while.cond
  %1 = load %"struct.std::_Rb_tree_node"** %__x.addr, align 4
  %2 = bitcast %"struct.std::_Rb_tree_node"* %1 to %"struct.std::_Rb_tree_node_base"*
  %call = call %"struct.std::_Rb_tree_node"* @_ZNSt8_Rb_treeIPKvSt4pairIKS1_N5boost6detail13tss_data_nodeEESt10_Select1stIS7_ESt4lessIS1_ESaIS7_EE8_S_rightEPSt18_Rb_tree_node_base(%"struct.std::_Rb_tree_node_base"* %2)
  call void @_ZNSt8_Rb_treeIPKvSt4pairIKS1_N5boost6detail13tss_data_nodeEESt10_Select1stIS7_ESt4lessIS1_ESaIS7_EE8_M_eraseEPSt13_Rb_tree_nodeIS7_E(%"class.std::_Rb_tree"* %this1, %"struct.std::_Rb_tree_node"* %call)
  %3 = load %"struct.std::_Rb_tree_node"** %__x.addr, align 4
  %4 = bitcast %"struct.std::_Rb_tree_node"* %3 to %"struct.std::_Rb_tree_node_base"*
  %call2 = call %"struct.std::_Rb_tree_node"* @_ZNSt8_Rb_treeIPKvSt4pairIKS1_N5boost6detail13tss_data_nodeEESt10_Select1stIS7_ESt4lessIS1_ESaIS7_EE7_S_leftEPSt18_Rb_tree_node_base(%"struct.std::_Rb_tree_node_base"* %4)
  store %"struct.std::_Rb_tree_node"* %call2, %"struct.std::_Rb_tree_node"** %__y, align 4
  %5 = load %"struct.std::_Rb_tree_node"** %__x.addr, align 4
  call void @_ZNSt8_Rb_treeIPKvSt4pairIKS1_N5boost6detail13tss_data_nodeEESt10_Select1stIS7_ESt4lessIS1_ESaIS7_EE15_M_destroy_nodeEPSt13_Rb_tree_nodeIS7_E(%"class.std::_Rb_tree"* %this1, %"struct.std::_Rb_tree_node"* %5)
  %6 = load %"struct.std::_Rb_tree_node"** %__y, align 4
  store %"struct.std::_Rb_tree_node"* %6, %"struct.std::_Rb_tree_node"** %__x.addr, align 4
  br label %while.cond

while.end:                                        ; preds = %while.cond
  ret void
}

define linkonce_odr %"struct.std::_Rb_tree_node"* @_ZNSt8_Rb_treeIPKvSt4pairIKS1_N5boost6detail13tss_data_nodeEESt10_Select1stIS7_ESt4lessIS1_ESaIS7_EE8_M_beginEv(%"class.std::_Rb_tree"* %this) nounwind align 2 {
entry:
  %this.addr = alloca %"class.std::_Rb_tree"*, align 4
  store %"class.std::_Rb_tree"* %this, %"class.std::_Rb_tree"** %this.addr, align 4
  %this1 = load %"class.std::_Rb_tree"** %this.addr
  %_M_impl = getelementptr inbounds %"class.std::_Rb_tree"* %this1, i32 0, i32 0
  %_M_header = getelementptr inbounds %"struct.std::_Rb_tree<const void *, std::pair<const void *const, boost::detail::tss_data_node>, std::_Select1st<std::pair<const void *const, boost::detail::tss_data_node> >, std::less<const void *>, std::allocator<std::pair<const void *const, boost::detail::tss_data_node> > >::_Rb_tree_impl"* %_M_impl, i32 0, i32 1
  %_M_parent = getelementptr inbounds %"struct.std::_Rb_tree_node_base"* %_M_header, i32 0, i32 1
  %0 = load %"struct.std::_Rb_tree_node_base"** %_M_parent, align 4
  %1 = bitcast %"struct.std::_Rb_tree_node_base"* %0 to %"struct.std::_Rb_tree_node"*
  ret %"struct.std::_Rb_tree_node"* %1
}

define linkonce_odr void @_ZNSt8_Rb_treeIPKvSt4pairIKS1_N5boost6detail13tss_data_nodeEESt10_Select1stIS7_ESt4lessIS1_ESaIS7_EE13_Rb_tree_implISB_Lb0EED1Ev(%"struct.std::_Rb_tree<const void *, std::pair<const void *const, boost::detail::tss_data_node>, std::_Select1st<std::pair<const void *const, boost::detail::tss_data_node> >, std::less<const void *>, std::allocator<std::pair<const void *const, boost::detail::tss_data_node> > >::_Rb_tree_impl"* %this) unnamed_addr nounwind inlinehint align 2 {
entry:
  %this.addr = alloca %"struct.std::_Rb_tree<const void *, std::pair<const void *const, boost::detail::tss_data_node>, std::_Select1st<std::pair<const void *const, boost::detail::tss_data_node> >, std::less<const void *>, std::allocator<std::pair<const void *const, boost::detail::tss_data_node> > >::_Rb_tree_impl"*, align 4
  store %"struct.std::_Rb_tree<const void *, std::pair<const void *const, boost::detail::tss_data_node>, std::_Select1st<std::pair<const void *const, boost::detail::tss_data_node> >, std::less<const void *>, std::allocator<std::pair<const void *const, boost::detail::tss_data_node> > >::_Rb_tree_impl"* %this, %"struct.std::_Rb_tree<const void *, std::pair<const void *const, boost::detail::tss_data_node>, std::_Select1st<std::pair<const void *const, boost::detail::tss_data_node> >, std::less<const void *>, std::allocator<std::pair<const void *const, boost::detail::tss_data_node> > >::_Rb_tree_impl"** %this.addr, align 4
  %this1 = load %"struct.std::_Rb_tree<const void *, std::pair<const void *const, boost::detail::tss_data_node>, std::_Select1st<std::pair<const void *const, boost::detail::tss_data_node> >, std::less<const void *>, std::allocator<std::pair<const void *const, boost::detail::tss_data_node> > >::_Rb_tree_impl"** %this.addr
  call void @_ZNSt8_Rb_treeIPKvSt4pairIKS1_N5boost6detail13tss_data_nodeEESt10_Select1stIS7_ESt4lessIS1_ESaIS7_EE13_Rb_tree_implISB_Lb0EED2Ev(%"struct.std::_Rb_tree<const void *, std::pair<const void *const, boost::detail::tss_data_node>, std::_Select1st<std::pair<const void *const, boost::detail::tss_data_node> >, std::less<const void *>, std::allocator<std::pair<const void *const, boost::detail::tss_data_node> > >::_Rb_tree_impl"* %this1) nounwind
  ret void
}

define linkonce_odr void @_ZNSt8_Rb_treeIPKvSt4pairIKS1_N5boost6detail13tss_data_nodeEESt10_Select1stIS7_ESt4lessIS1_ESaIS7_EE13_Rb_tree_implISB_Lb0EED2Ev(%"struct.std::_Rb_tree<const void *, std::pair<const void *const, boost::detail::tss_data_node>, std::_Select1st<std::pair<const void *const, boost::detail::tss_data_node> >, std::less<const void *>, std::allocator<std::pair<const void *const, boost::detail::tss_data_node> > >::_Rb_tree_impl"* %this) unnamed_addr nounwind inlinehint align 2 {
entry:
  %this.addr = alloca %"struct.std::_Rb_tree<const void *, std::pair<const void *const, boost::detail::tss_data_node>, std::_Select1st<std::pair<const void *const, boost::detail::tss_data_node> >, std::less<const void *>, std::allocator<std::pair<const void *const, boost::detail::tss_data_node> > >::_Rb_tree_impl"*, align 4
  store %"struct.std::_Rb_tree<const void *, std::pair<const void *const, boost::detail::tss_data_node>, std::_Select1st<std::pair<const void *const, boost::detail::tss_data_node> >, std::less<const void *>, std::allocator<std::pair<const void *const, boost::detail::tss_data_node> > >::_Rb_tree_impl"* %this, %"struct.std::_Rb_tree<const void *, std::pair<const void *const, boost::detail::tss_data_node>, std::_Select1st<std::pair<const void *const, boost::detail::tss_data_node> >, std::less<const void *>, std::allocator<std::pair<const void *const, boost::detail::tss_data_node> > >::_Rb_tree_impl"** %this.addr, align 4
  %this1 = load %"struct.std::_Rb_tree<const void *, std::pair<const void *const, boost::detail::tss_data_node>, std::_Select1st<std::pair<const void *const, boost::detail::tss_data_node> >, std::less<const void *>, std::allocator<std::pair<const void *const, boost::detail::tss_data_node> > >::_Rb_tree_impl"** %this.addr
  %0 = bitcast %"struct.std::_Rb_tree<const void *, std::pair<const void *const, boost::detail::tss_data_node>, std::_Select1st<std::pair<const void *const, boost::detail::tss_data_node> >, std::less<const void *>, std::allocator<std::pair<const void *const, boost::detail::tss_data_node> > >::_Rb_tree_impl"* %this1 to %"class.std::allocator.19"*
  call void @_ZNSaISt13_Rb_tree_nodeISt4pairIKPKvN5boost6detail13tss_data_nodeEEEED2Ev(%"class.std::allocator.19"* %0) nounwind
  ret void
}

define linkonce_odr void @_ZNSaISt13_Rb_tree_nodeISt4pairIKPKvN5boost6detail13tss_data_nodeEEEED2Ev(%"class.std::allocator.19"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.std::allocator.19"*, align 4
  store %"class.std::allocator.19"* %this, %"class.std::allocator.19"** %this.addr, align 4
  %this1 = load %"class.std::allocator.19"** %this.addr
  %0 = bitcast %"class.std::allocator.19"* %this1 to %"class.__gnu_cxx::new_allocator.20"*
  call void @_ZN9__gnu_cxx13new_allocatorISt13_Rb_tree_nodeISt4pairIKPKvN5boost6detail13tss_data_nodeEEEED2Ev(%"class.__gnu_cxx::new_allocator.20"* %0) nounwind
  ret void
}

define linkonce_odr void @_ZN9__gnu_cxx13new_allocatorISt13_Rb_tree_nodeISt4pairIKPKvN5boost6detail13tss_data_nodeEEEED2Ev(%"class.__gnu_cxx::new_allocator.20"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.__gnu_cxx::new_allocator.20"*, align 4
  store %"class.__gnu_cxx::new_allocator.20"* %this, %"class.__gnu_cxx::new_allocator.20"** %this.addr, align 4
  %this1 = load %"class.__gnu_cxx::new_allocator.20"** %this.addr
  ret void
}

define linkonce_odr %"struct.std::_Rb_tree_node"* @_ZNSt8_Rb_treeIPKvSt4pairIKS1_N5boost6detail13tss_data_nodeEESt10_Select1stIS7_ESt4lessIS1_ESaIS7_EE8_S_rightEPSt18_Rb_tree_node_base(%"struct.std::_Rb_tree_node_base"* %__x) nounwind align 2 {
entry:
  %__x.addr = alloca %"struct.std::_Rb_tree_node_base"*, align 4
  store %"struct.std::_Rb_tree_node_base"* %__x, %"struct.std::_Rb_tree_node_base"** %__x.addr, align 4
  %0 = load %"struct.std::_Rb_tree_node_base"** %__x.addr, align 4
  %_M_right = getelementptr inbounds %"struct.std::_Rb_tree_node_base"* %0, i32 0, i32 3
  %1 = load %"struct.std::_Rb_tree_node_base"** %_M_right, align 4
  %2 = bitcast %"struct.std::_Rb_tree_node_base"* %1 to %"struct.std::_Rb_tree_node"*
  ret %"struct.std::_Rb_tree_node"* %2
}

define linkonce_odr %"struct.std::_Rb_tree_node"* @_ZNSt8_Rb_treeIPKvSt4pairIKS1_N5boost6detail13tss_data_nodeEESt10_Select1stIS7_ESt4lessIS1_ESaIS7_EE7_S_leftEPSt18_Rb_tree_node_base(%"struct.std::_Rb_tree_node_base"* %__x) nounwind align 2 {
entry:
  %__x.addr = alloca %"struct.std::_Rb_tree_node_base"*, align 4
  store %"struct.std::_Rb_tree_node_base"* %__x, %"struct.std::_Rb_tree_node_base"** %__x.addr, align 4
  %0 = load %"struct.std::_Rb_tree_node_base"** %__x.addr, align 4
  %_M_left = getelementptr inbounds %"struct.std::_Rb_tree_node_base"* %0, i32 0, i32 2
  %1 = load %"struct.std::_Rb_tree_node_base"** %_M_left, align 4
  %2 = bitcast %"struct.std::_Rb_tree_node_base"* %1 to %"struct.std::_Rb_tree_node"*
  ret %"struct.std::_Rb_tree_node"* %2
}

define linkonce_odr void @_ZNSt8_Rb_treeIPKvSt4pairIKS1_N5boost6detail13tss_data_nodeEESt10_Select1stIS7_ESt4lessIS1_ESaIS7_EE15_M_destroy_nodeEPSt13_Rb_tree_nodeIS7_E(%"class.std::_Rb_tree"* %this, %"struct.std::_Rb_tree_node"* %__p) align 2 {
entry:
  %this.addr = alloca %"class.std::_Rb_tree"*, align 4
  %__p.addr = alloca %"struct.std::_Rb_tree_node"*, align 4
  %temp.lvalue = alloca %"class.std::allocator.29", align 1
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  store %"class.std::_Rb_tree"* %this, %"class.std::_Rb_tree"** %this.addr, align 4
  store %"struct.std::_Rb_tree_node"* %__p, %"struct.std::_Rb_tree_node"** %__p.addr, align 4
  %this1 = load %"class.std::_Rb_tree"** %this.addr
  call void @_ZNKSt8_Rb_treeIPKvSt4pairIKS1_N5boost6detail13tss_data_nodeEESt10_Select1stIS7_ESt4lessIS1_ESaIS7_EE13get_allocatorEv(%"class.std::allocator.29"* sret %temp.lvalue, %"class.std::_Rb_tree"* %this1)
  %0 = bitcast %"class.std::allocator.29"* %temp.lvalue to %"class.__gnu_cxx::new_allocator.30"*
  %1 = load %"struct.std::_Rb_tree_node"** %__p.addr, align 4
  %_M_value_field = getelementptr inbounds %"struct.std::_Rb_tree_node"* %1, i32 0, i32 1
  %call = invoke %"struct.std::pair.27"* @_ZSt11__addressofISt4pairIKPKvN5boost6detail13tss_data_nodeEEEPT_RS8_(%"struct.std::pair.27"* %_M_value_field)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %entry
  invoke void @_ZN9__gnu_cxx13new_allocatorISt4pairIKPKvN5boost6detail13tss_data_nodeEEE7destroyEPS8_(%"class.__gnu_cxx::new_allocator.30"* %0, %"struct.std::pair.27"* %call)
          to label %invoke.cont2 unwind label %lpad

invoke.cont2:                                     ; preds = %invoke.cont
  call void @_ZNSaISt4pairIKPKvN5boost6detail13tss_data_nodeEEED1Ev(%"class.std::allocator.29"* %temp.lvalue) nounwind
  %2 = load %"struct.std::_Rb_tree_node"** %__p.addr, align 4
  call void @_ZNSt8_Rb_treeIPKvSt4pairIKS1_N5boost6detail13tss_data_nodeEESt10_Select1stIS7_ESt4lessIS1_ESaIS7_EE11_M_put_nodeEPSt13_Rb_tree_nodeIS7_E(%"class.std::_Rb_tree"* %this1, %"struct.std::_Rb_tree_node"* %2)
  ret void

lpad:                                             ; preds = %invoke.cont, %entry
  %3 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %4 = extractvalue { i8*, i32 } %3, 0
  store i8* %4, i8** %exn.slot
  %5 = extractvalue { i8*, i32 } %3, 1
  store i32 %5, i32* %ehselector.slot
  call void @_ZNSaISt4pairIKPKvN5boost6detail13tss_data_nodeEEED1Ev(%"class.std::allocator.29"* %temp.lvalue) nounwind
  br label %eh.resume

eh.resume:                                        ; preds = %lpad
  %exn = load i8** %exn.slot
  %sel = load i32* %ehselector.slot
  %lpad.val = insertvalue { i8*, i32 } undef, i8* %exn, 0
  %lpad.val3 = insertvalue { i8*, i32 } %lpad.val, i32 %sel, 1
  resume { i8*, i32 } %lpad.val3
}

define linkonce_odr void @_ZNKSt8_Rb_treeIPKvSt4pairIKS1_N5boost6detail13tss_data_nodeEESt10_Select1stIS7_ESt4lessIS1_ESaIS7_EE13get_allocatorEv(%"class.std::allocator.29"* noalias sret %agg.result, %"class.std::_Rb_tree"* %this) align 2 {
entry:
  %this.addr = alloca %"class.std::_Rb_tree"*, align 4
  store %"class.std::_Rb_tree"* %this, %"class.std::_Rb_tree"** %this.addr, align 4
  %this1 = load %"class.std::_Rb_tree"** %this.addr
  %call = call %"class.std::allocator.19"* @_ZNKSt8_Rb_treeIPKvSt4pairIKS1_N5boost6detail13tss_data_nodeEESt10_Select1stIS7_ESt4lessIS1_ESaIS7_EE21_M_get_Node_allocatorEv(%"class.std::_Rb_tree"* %this1)
  call void @_ZNSaISt4pairIKPKvN5boost6detail13tss_data_nodeEEEC1ISt13_Rb_tree_nodeIS6_EEERKSaIT_E(%"class.std::allocator.29"* %agg.result, %"class.std::allocator.19"* %call) nounwind
  ret void
}

define linkonce_odr void @_ZN9__gnu_cxx13new_allocatorISt4pairIKPKvN5boost6detail13tss_data_nodeEEE7destroyEPS8_(%"class.__gnu_cxx::new_allocator.30"* %this, %"struct.std::pair.27"* %__p) align 2 {
entry:
  %this.addr = alloca %"class.__gnu_cxx::new_allocator.30"*, align 4
  %__p.addr = alloca %"struct.std::pair.27"*, align 4
  store %"class.__gnu_cxx::new_allocator.30"* %this, %"class.__gnu_cxx::new_allocator.30"** %this.addr, align 4
  store %"struct.std::pair.27"* %__p, %"struct.std::pair.27"** %__p.addr, align 4
  %this1 = load %"class.__gnu_cxx::new_allocator.30"** %this.addr
  %0 = load %"struct.std::pair.27"** %__p.addr, align 4
  call void @_ZNSt4pairIKPKvN5boost6detail13tss_data_nodeEED1Ev(%"struct.std::pair.27"* %0)
  ret void
}

define linkonce_odr %"struct.std::pair.27"* @_ZSt11__addressofISt4pairIKPKvN5boost6detail13tss_data_nodeEEEPT_RS8_(%"struct.std::pair.27"* %__r) nounwind inlinehint {
entry:
  %__r.addr = alloca %"struct.std::pair.27"*, align 4
  store %"struct.std::pair.27"* %__r, %"struct.std::pair.27"** %__r.addr, align 4
  %0 = load %"struct.std::pair.27"** %__r.addr, align 4
  %1 = bitcast %"struct.std::pair.27"* %0 to i8*
  %2 = bitcast i8* %1 to %"struct.std::pair.27"*
  ret %"struct.std::pair.27"* %2
}

define linkonce_odr void @_ZNSaISt4pairIKPKvN5boost6detail13tss_data_nodeEEED1Ev(%"class.std::allocator.29"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.std::allocator.29"*, align 4
  store %"class.std::allocator.29"* %this, %"class.std::allocator.29"** %this.addr, align 4
  %this1 = load %"class.std::allocator.29"** %this.addr
  call void @_ZNSaISt4pairIKPKvN5boost6detail13tss_data_nodeEEED2Ev(%"class.std::allocator.29"* %this1) nounwind
  ret void
}

define linkonce_odr void @_ZNSt8_Rb_treeIPKvSt4pairIKS1_N5boost6detail13tss_data_nodeEESt10_Select1stIS7_ESt4lessIS1_ESaIS7_EE11_M_put_nodeEPSt13_Rb_tree_nodeIS7_E(%"class.std::_Rb_tree"* %this, %"struct.std::_Rb_tree_node"* %__p) align 2 {
entry:
  %this.addr = alloca %"class.std::_Rb_tree"*, align 4
  %__p.addr = alloca %"struct.std::_Rb_tree_node"*, align 4
  store %"class.std::_Rb_tree"* %this, %"class.std::_Rb_tree"** %this.addr, align 4
  store %"struct.std::_Rb_tree_node"* %__p, %"struct.std::_Rb_tree_node"** %__p.addr, align 4
  %this1 = load %"class.std::_Rb_tree"** %this.addr
  %_M_impl = getelementptr inbounds %"class.std::_Rb_tree"* %this1, i32 0, i32 0
  %0 = bitcast %"struct.std::_Rb_tree<const void *, std::pair<const void *const, boost::detail::tss_data_node>, std::_Select1st<std::pair<const void *const, boost::detail::tss_data_node> >, std::less<const void *>, std::allocator<std::pair<const void *const, boost::detail::tss_data_node> > >::_Rb_tree_impl"* %_M_impl to %"class.std::allocator.19"*
  %1 = bitcast %"class.std::allocator.19"* %0 to %"class.__gnu_cxx::new_allocator.20"*
  %2 = load %"struct.std::_Rb_tree_node"** %__p.addr, align 4
  call void @_ZN9__gnu_cxx13new_allocatorISt13_Rb_tree_nodeISt4pairIKPKvN5boost6detail13tss_data_nodeEEEE10deallocateEPSA_j(%"class.__gnu_cxx::new_allocator.20"* %1, %"struct.std::_Rb_tree_node"* %2, i32 1)
  ret void
}

define linkonce_odr void @_ZN9__gnu_cxx13new_allocatorISt13_Rb_tree_nodeISt4pairIKPKvN5boost6detail13tss_data_nodeEEEE10deallocateEPSA_j(%"class.__gnu_cxx::new_allocator.20"* %this, %"struct.std::_Rb_tree_node"* %__p, i32) nounwind align 2 {
entry:
  %this.addr = alloca %"class.__gnu_cxx::new_allocator.20"*, align 4
  %__p.addr = alloca %"struct.std::_Rb_tree_node"*, align 4
  %.addr = alloca i32, align 4
  store %"class.__gnu_cxx::new_allocator.20"* %this, %"class.__gnu_cxx::new_allocator.20"** %this.addr, align 4
  store %"struct.std::_Rb_tree_node"* %__p, %"struct.std::_Rb_tree_node"** %__p.addr, align 4
  store i32 %0, i32* %.addr, align 4
  %this1 = load %"class.__gnu_cxx::new_allocator.20"** %this.addr
  %1 = load %"struct.std::_Rb_tree_node"** %__p.addr, align 4
  %2 = bitcast %"struct.std::_Rb_tree_node"* %1 to i8*
  call void @_ZdlPv(i8* %2) nounwind
  ret void
}

define linkonce_odr void @_ZNSaISt4pairIKPKvN5boost6detail13tss_data_nodeEEED2Ev(%"class.std::allocator.29"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.std::allocator.29"*, align 4
  store %"class.std::allocator.29"* %this, %"class.std::allocator.29"** %this.addr, align 4
  %this1 = load %"class.std::allocator.29"** %this.addr
  %0 = bitcast %"class.std::allocator.29"* %this1 to %"class.__gnu_cxx::new_allocator.30"*
  call void @_ZN9__gnu_cxx13new_allocatorISt4pairIKPKvN5boost6detail13tss_data_nodeEEED2Ev(%"class.__gnu_cxx::new_allocator.30"* %0) nounwind
  ret void
}

define linkonce_odr void @_ZN9__gnu_cxx13new_allocatorISt4pairIKPKvN5boost6detail13tss_data_nodeEEED2Ev(%"class.__gnu_cxx::new_allocator.30"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.__gnu_cxx::new_allocator.30"*, align 4
  store %"class.__gnu_cxx::new_allocator.30"* %this, %"class.__gnu_cxx::new_allocator.30"** %this.addr, align 4
  %this1 = load %"class.__gnu_cxx::new_allocator.30"** %this.addr
  ret void
}

define linkonce_odr void @_ZNSt4pairIKPKvN5boost6detail13tss_data_nodeEED1Ev(%"struct.std::pair.27"* %this) unnamed_addr inlinehint align 2 {
entry:
  %this.addr = alloca %"struct.std::pair.27"*, align 4
  store %"struct.std::pair.27"* %this, %"struct.std::pair.27"** %this.addr, align 4
  %this1 = load %"struct.std::pair.27"** %this.addr
  call void @_ZNSt4pairIKPKvN5boost6detail13tss_data_nodeEED2Ev(%"struct.std::pair.27"* %this1)
  ret void
}

define linkonce_odr void @_ZNSt4pairIKPKvN5boost6detail13tss_data_nodeEED2Ev(%"struct.std::pair.27"* %this) unnamed_addr inlinehint align 2 {
entry:
  %this.addr = alloca %"struct.std::pair.27"*, align 4
  store %"struct.std::pair.27"* %this, %"struct.std::pair.27"** %this.addr, align 4
  %this1 = load %"struct.std::pair.27"** %this.addr
  %second = getelementptr inbounds %"struct.std::pair.27"* %this1, i32 0, i32 1
  call void @_ZN5boost6detail13tss_data_nodeD1Ev(%"struct.boost::detail::tss_data_node"* %second)
  ret void
}

define linkonce_odr void @_ZN5boost6detail13tss_data_nodeD1Ev(%"struct.boost::detail::tss_data_node"* %this) unnamed_addr inlinehint align 2 {
entry:
  %this.addr = alloca %"struct.boost::detail::tss_data_node"*, align 4
  store %"struct.boost::detail::tss_data_node"* %this, %"struct.boost::detail::tss_data_node"** %this.addr, align 4
  %this1 = load %"struct.boost::detail::tss_data_node"** %this.addr
  call void @_ZN5boost6detail13tss_data_nodeD2Ev(%"struct.boost::detail::tss_data_node"* %this1)
  ret void
}

define linkonce_odr void @_ZN5boost6detail13tss_data_nodeD2Ev(%"struct.boost::detail::tss_data_node"* %this) unnamed_addr inlinehint align 2 {
entry:
  %this.addr = alloca %"struct.boost::detail::tss_data_node"*, align 4
  store %"struct.boost::detail::tss_data_node"* %this, %"struct.boost::detail::tss_data_node"** %this.addr, align 4
  %this1 = load %"struct.boost::detail::tss_data_node"** %this.addr
  %func = getelementptr inbounds %"struct.boost::detail::tss_data_node"* %this1, i32 0, i32 0
  call void @_ZN5boost10shared_ptrINS_6detail20tss_cleanup_functionEED1Ev(%"class.boost::shared_ptr.28"* %func)
  ret void
}

define linkonce_odr void @_ZN5boost10shared_ptrINS_6detail20tss_cleanup_functionEED1Ev(%"class.boost::shared_ptr.28"* %this) unnamed_addr inlinehint align 2 {
entry:
  %this.addr = alloca %"class.boost::shared_ptr.28"*, align 4
  store %"class.boost::shared_ptr.28"* %this, %"class.boost::shared_ptr.28"** %this.addr, align 4
  %this1 = load %"class.boost::shared_ptr.28"** %this.addr
  call void @_ZN5boost10shared_ptrINS_6detail20tss_cleanup_functionEED2Ev(%"class.boost::shared_ptr.28"* %this1)
  ret void
}

define linkonce_odr void @_ZN5boost10shared_ptrINS_6detail20tss_cleanup_functionEED2Ev(%"class.boost::shared_ptr.28"* %this) unnamed_addr inlinehint align 2 {
entry:
  %this.addr = alloca %"class.boost::shared_ptr.28"*, align 4
  store %"class.boost::shared_ptr.28"* %this, %"class.boost::shared_ptr.28"** %this.addr, align 4
  %this1 = load %"class.boost::shared_ptr.28"** %this.addr
  %pn = getelementptr inbounds %"class.boost::shared_ptr.28"* %this1, i32 0, i32 1
  call void @_ZN5boost6detail12shared_countD1Ev(%"class.boost::detail::shared_count"* %pn)
  ret void
}

define linkonce_odr void @_ZNSaISt4pairIKPKvN5boost6detail13tss_data_nodeEEEC1ISt13_Rb_tree_nodeIS6_EEERKSaIT_E(%"class.std::allocator.29"* %this, %"class.std::allocator.19"*) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.std::allocator.29"*, align 4
  %.addr = alloca %"class.std::allocator.19"*, align 4
  store %"class.std::allocator.29"* %this, %"class.std::allocator.29"** %this.addr, align 4
  store %"class.std::allocator.19"* %0, %"class.std::allocator.19"** %.addr, align 4
  %this1 = load %"class.std::allocator.29"** %this.addr
  %1 = load %"class.std::allocator.19"** %.addr
  call void @_ZNSaISt4pairIKPKvN5boost6detail13tss_data_nodeEEEC2ISt13_Rb_tree_nodeIS6_EEERKSaIT_E(%"class.std::allocator.29"* %this1, %"class.std::allocator.19"* %1) nounwind
  ret void
}

define linkonce_odr %"class.std::allocator.19"* @_ZNKSt8_Rb_treeIPKvSt4pairIKS1_N5boost6detail13tss_data_nodeEESt10_Select1stIS7_ESt4lessIS1_ESaIS7_EE21_M_get_Node_allocatorEv(%"class.std::_Rb_tree"* %this) nounwind align 2 {
entry:
  %this.addr = alloca %"class.std::_Rb_tree"*, align 4
  store %"class.std::_Rb_tree"* %this, %"class.std::_Rb_tree"** %this.addr, align 4
  %this1 = load %"class.std::_Rb_tree"** %this.addr
  %_M_impl = getelementptr inbounds %"class.std::_Rb_tree"* %this1, i32 0, i32 0
  %0 = bitcast %"struct.std::_Rb_tree<const void *, std::pair<const void *const, boost::detail::tss_data_node>, std::_Select1st<std::pair<const void *const, boost::detail::tss_data_node> >, std::less<const void *>, std::allocator<std::pair<const void *const, boost::detail::tss_data_node> > >::_Rb_tree_impl"* %_M_impl to %"class.std::allocator.19"*
  ret %"class.std::allocator.19"* %0
}

define linkonce_odr void @_ZNSaISt4pairIKPKvN5boost6detail13tss_data_nodeEEEC2ISt13_Rb_tree_nodeIS6_EEERKSaIT_E(%"class.std::allocator.29"* %this, %"class.std::allocator.19"*) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.std::allocator.29"*, align 4
  %.addr = alloca %"class.std::allocator.19"*, align 4
  store %"class.std::allocator.29"* %this, %"class.std::allocator.29"** %this.addr, align 4
  store %"class.std::allocator.19"* %0, %"class.std::allocator.19"** %.addr, align 4
  %this1 = load %"class.std::allocator.29"** %this.addr
  %1 = bitcast %"class.std::allocator.29"* %this1 to %"class.__gnu_cxx::new_allocator.30"*
  call void @_ZN9__gnu_cxx13new_allocatorISt4pairIKPKvN5boost6detail13tss_data_nodeEEEC2Ev(%"class.__gnu_cxx::new_allocator.30"* %1) nounwind
  ret void
}

define linkonce_odr void @_ZN9__gnu_cxx13new_allocatorISt4pairIKPKvN5boost6detail13tss_data_nodeEEEC2Ev(%"class.__gnu_cxx::new_allocator.30"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.__gnu_cxx::new_allocator.30"*, align 4
  store %"class.__gnu_cxx::new_allocator.30"* %this, %"class.__gnu_cxx::new_allocator.30"** %this.addr, align 4
  %this1 = load %"class.__gnu_cxx::new_allocator.30"** %this.addr
  ret void
}

define linkonce_odr void @_ZNSt6vectorISt4pairIPN5boost18condition_variableEPNS1_5mutexEESaIS6_EEC2Ev(%"class.std::vector.22"* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.std::vector.22"*, align 4
  store %"class.std::vector.22"* %this, %"class.std::vector.22"** %this.addr, align 4
  %this1 = load %"class.std::vector.22"** %this.addr
  %0 = bitcast %"class.std::vector.22"* %this1 to %"struct.std::_Vector_base.23"*
  call void @_ZNSt12_Vector_baseISt4pairIPN5boost18condition_variableEPNS1_5mutexEESaIS6_EEC2Ev(%"struct.std::_Vector_base.23"* %0)
  ret void
}

define linkonce_odr void @_ZNSt12_Vector_baseISt4pairIPN5boost18condition_variableEPNS1_5mutexEESaIS6_EEC2Ev(%"struct.std::_Vector_base.23"* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"struct.std::_Vector_base.23"*, align 4
  store %"struct.std::_Vector_base.23"* %this, %"struct.std::_Vector_base.23"** %this.addr, align 4
  %this1 = load %"struct.std::_Vector_base.23"** %this.addr
  %_M_impl = getelementptr inbounds %"struct.std::_Vector_base.23"* %this1, i32 0, i32 0
  call void @_ZNSt12_Vector_baseISt4pairIPN5boost18condition_variableEPNS1_5mutexEESaIS6_EE12_Vector_implC1Ev(%"struct.std::_Vector_base<std::pair<boost::condition_variable *, boost::mutex *>, std::allocator<std::pair<boost::condition_variable *, boost::mutex *> > >::_Vector_impl"* %_M_impl)
  ret void
}

define linkonce_odr void @_ZNSt12_Vector_baseISt4pairIPN5boost18condition_variableEPNS1_5mutexEESaIS6_EE12_Vector_implC1Ev(%"struct.std::_Vector_base<std::pair<boost::condition_variable *, boost::mutex *>, std::allocator<std::pair<boost::condition_variable *, boost::mutex *> > >::_Vector_impl"* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"struct.std::_Vector_base<std::pair<boost::condition_variable *, boost::mutex *>, std::allocator<std::pair<boost::condition_variable *, boost::mutex *> > >::_Vector_impl"*, align 4
  store %"struct.std::_Vector_base<std::pair<boost::condition_variable *, boost::mutex *>, std::allocator<std::pair<boost::condition_variable *, boost::mutex *> > >::_Vector_impl"* %this, %"struct.std::_Vector_base<std::pair<boost::condition_variable *, boost::mutex *>, std::allocator<std::pair<boost::condition_variable *, boost::mutex *> > >::_Vector_impl"** %this.addr, align 4
  %this1 = load %"struct.std::_Vector_base<std::pair<boost::condition_variable *, boost::mutex *>, std::allocator<std::pair<boost::condition_variable *, boost::mutex *> > >::_Vector_impl"** %this.addr
  call void @_ZNSt12_Vector_baseISt4pairIPN5boost18condition_variableEPNS1_5mutexEESaIS6_EE12_Vector_implC2Ev(%"struct.std::_Vector_base<std::pair<boost::condition_variable *, boost::mutex *>, std::allocator<std::pair<boost::condition_variable *, boost::mutex *> > >::_Vector_impl"* %this1)
  ret void
}

define linkonce_odr void @_ZNSt12_Vector_baseISt4pairIPN5boost18condition_variableEPNS1_5mutexEESaIS6_EE12_Vector_implC2Ev(%"struct.std::_Vector_base<std::pair<boost::condition_variable *, boost::mutex *>, std::allocator<std::pair<boost::condition_variable *, boost::mutex *> > >::_Vector_impl"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"struct.std::_Vector_base<std::pair<boost::condition_variable *, boost::mutex *>, std::allocator<std::pair<boost::condition_variable *, boost::mutex *> > >::_Vector_impl"*, align 4
  store %"struct.std::_Vector_base<std::pair<boost::condition_variable *, boost::mutex *>, std::allocator<std::pair<boost::condition_variable *, boost::mutex *> > >::_Vector_impl"* %this, %"struct.std::_Vector_base<std::pair<boost::condition_variable *, boost::mutex *>, std::allocator<std::pair<boost::condition_variable *, boost::mutex *> > >::_Vector_impl"** %this.addr, align 4
  %this1 = load %"struct.std::_Vector_base<std::pair<boost::condition_variable *, boost::mutex *>, std::allocator<std::pair<boost::condition_variable *, boost::mutex *> > >::_Vector_impl"** %this.addr
  %0 = bitcast %"struct.std::_Vector_base<std::pair<boost::condition_variable *, boost::mutex *>, std::allocator<std::pair<boost::condition_variable *, boost::mutex *> > >::_Vector_impl"* %this1 to %"class.std::allocator.24"*
  call void @_ZNSaISt4pairIPN5boost18condition_variableEPNS0_5mutexEEEC2Ev(%"class.std::allocator.24"* %0) nounwind
  %_M_start = getelementptr inbounds %"struct.std::_Vector_base<std::pair<boost::condition_variable *, boost::mutex *>, std::allocator<std::pair<boost::condition_variable *, boost::mutex *> > >::_Vector_impl"* %this1, i32 0, i32 0
  store %"struct.std::pair"* null, %"struct.std::pair"** %_M_start, align 4
  %_M_finish = getelementptr inbounds %"struct.std::_Vector_base<std::pair<boost::condition_variable *, boost::mutex *>, std::allocator<std::pair<boost::condition_variable *, boost::mutex *> > >::_Vector_impl"* %this1, i32 0, i32 1
  store %"struct.std::pair"* null, %"struct.std::pair"** %_M_finish, align 4
  %_M_end_of_storage = getelementptr inbounds %"struct.std::_Vector_base<std::pair<boost::condition_variable *, boost::mutex *>, std::allocator<std::pair<boost::condition_variable *, boost::mutex *> > >::_Vector_impl"* %this1, i32 0, i32 2
  store %"struct.std::pair"* null, %"struct.std::pair"** %_M_end_of_storage, align 4
  ret void
}

define linkonce_odr void @_ZNSaISt4pairIPN5boost18condition_variableEPNS0_5mutexEEEC2Ev(%"class.std::allocator.24"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.std::allocator.24"*, align 4
  store %"class.std::allocator.24"* %this, %"class.std::allocator.24"** %this.addr, align 4
  %this1 = load %"class.std::allocator.24"** %this.addr
  %0 = bitcast %"class.std::allocator.24"* %this1 to %"class.__gnu_cxx::new_allocator.25"*
  call void @_ZN9__gnu_cxx13new_allocatorISt4pairIPN5boost18condition_variableEPNS2_5mutexEEEC2Ev(%"class.__gnu_cxx::new_allocator.25"* %0) nounwind
  ret void
}

define linkonce_odr void @_ZN9__gnu_cxx13new_allocatorISt4pairIPN5boost18condition_variableEPNS2_5mutexEEEC2Ev(%"class.__gnu_cxx::new_allocator.25"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.__gnu_cxx::new_allocator.25"*, align 4
  store %"class.__gnu_cxx::new_allocator.25"* %this, %"class.__gnu_cxx::new_allocator.25"** %this.addr, align 4
  %this1 = load %"class.__gnu_cxx::new_allocator.25"** %this.addr
  ret void
}

define linkonce_odr void @_ZNSt3mapIPKvN5boost6detail13tss_data_nodeESt4lessIS1_ESaISt4pairIKS1_S4_EEEC2Ev(%"class.std::map"* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.std::map"*, align 4
  store %"class.std::map"* %this, %"class.std::map"** %this.addr, align 4
  %this1 = load %"class.std::map"** %this.addr
  %_M_t = getelementptr inbounds %"class.std::map"* %this1, i32 0, i32 0
  call void @_ZNSt8_Rb_treeIPKvSt4pairIKS1_N5boost6detail13tss_data_nodeEESt10_Select1stIS7_ESt4lessIS1_ESaIS7_EEC1Ev(%"class.std::_Rb_tree"* %_M_t)
  ret void
}

define linkonce_odr void @_ZNSt8_Rb_treeIPKvSt4pairIKS1_N5boost6detail13tss_data_nodeEESt10_Select1stIS7_ESt4lessIS1_ESaIS7_EEC1Ev(%"class.std::_Rb_tree"* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.std::_Rb_tree"*, align 4
  store %"class.std::_Rb_tree"* %this, %"class.std::_Rb_tree"** %this.addr, align 4
  %this1 = load %"class.std::_Rb_tree"** %this.addr
  call void @_ZNSt8_Rb_treeIPKvSt4pairIKS1_N5boost6detail13tss_data_nodeEESt10_Select1stIS7_ESt4lessIS1_ESaIS7_EEC2Ev(%"class.std::_Rb_tree"* %this1)
  ret void
}

define linkonce_odr void @_ZNSt8_Rb_treeIPKvSt4pairIKS1_N5boost6detail13tss_data_nodeEESt10_Select1stIS7_ESt4lessIS1_ESaIS7_EEC2Ev(%"class.std::_Rb_tree"* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.std::_Rb_tree"*, align 4
  store %"class.std::_Rb_tree"* %this, %"class.std::_Rb_tree"** %this.addr, align 4
  %this1 = load %"class.std::_Rb_tree"** %this.addr
  %_M_impl = getelementptr inbounds %"class.std::_Rb_tree"* %this1, i32 0, i32 0
  call void @_ZNSt8_Rb_treeIPKvSt4pairIKS1_N5boost6detail13tss_data_nodeEESt10_Select1stIS7_ESt4lessIS1_ESaIS7_EE13_Rb_tree_implISB_Lb0EEC1Ev(%"struct.std::_Rb_tree<const void *, std::pair<const void *const, boost::detail::tss_data_node>, std::_Select1st<std::pair<const void *const, boost::detail::tss_data_node> >, std::less<const void *>, std::allocator<std::pair<const void *const, boost::detail::tss_data_node> > >::_Rb_tree_impl"* %_M_impl)
  ret void
}

define linkonce_odr void @_ZNSt8_Rb_treeIPKvSt4pairIKS1_N5boost6detail13tss_data_nodeEESt10_Select1stIS7_ESt4lessIS1_ESaIS7_EE13_Rb_tree_implISB_Lb0EEC1Ev(%"struct.std::_Rb_tree<const void *, std::pair<const void *const, boost::detail::tss_data_node>, std::_Select1st<std::pair<const void *const, boost::detail::tss_data_node> >, std::less<const void *>, std::allocator<std::pair<const void *const, boost::detail::tss_data_node> > >::_Rb_tree_impl"* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"struct.std::_Rb_tree<const void *, std::pair<const void *const, boost::detail::tss_data_node>, std::_Select1st<std::pair<const void *const, boost::detail::tss_data_node> >, std::less<const void *>, std::allocator<std::pair<const void *const, boost::detail::tss_data_node> > >::_Rb_tree_impl"*, align 4
  store %"struct.std::_Rb_tree<const void *, std::pair<const void *const, boost::detail::tss_data_node>, std::_Select1st<std::pair<const void *const, boost::detail::tss_data_node> >, std::less<const void *>, std::allocator<std::pair<const void *const, boost::detail::tss_data_node> > >::_Rb_tree_impl"* %this, %"struct.std::_Rb_tree<const void *, std::pair<const void *const, boost::detail::tss_data_node>, std::_Select1st<std::pair<const void *const, boost::detail::tss_data_node> >, std::less<const void *>, std::allocator<std::pair<const void *const, boost::detail::tss_data_node> > >::_Rb_tree_impl"** %this.addr, align 4
  %this1 = load %"struct.std::_Rb_tree<const void *, std::pair<const void *const, boost::detail::tss_data_node>, std::_Select1st<std::pair<const void *const, boost::detail::tss_data_node> >, std::less<const void *>, std::allocator<std::pair<const void *const, boost::detail::tss_data_node> > >::_Rb_tree_impl"** %this.addr
  call void @_ZNSt8_Rb_treeIPKvSt4pairIKS1_N5boost6detail13tss_data_nodeEESt10_Select1stIS7_ESt4lessIS1_ESaIS7_EE13_Rb_tree_implISB_Lb0EEC2Ev(%"struct.std::_Rb_tree<const void *, std::pair<const void *const, boost::detail::tss_data_node>, std::_Select1st<std::pair<const void *const, boost::detail::tss_data_node> >, std::less<const void *>, std::allocator<std::pair<const void *const, boost::detail::tss_data_node> > >::_Rb_tree_impl"* %this1)
  ret void
}

define linkonce_odr void @_ZNSt8_Rb_treeIPKvSt4pairIKS1_N5boost6detail13tss_data_nodeEESt10_Select1stIS7_ESt4lessIS1_ESaIS7_EE13_Rb_tree_implISB_Lb0EEC2Ev(%"struct.std::_Rb_tree<const void *, std::pair<const void *const, boost::detail::tss_data_node>, std::_Select1st<std::pair<const void *const, boost::detail::tss_data_node> >, std::less<const void *>, std::allocator<std::pair<const void *const, boost::detail::tss_data_node> > >::_Rb_tree_impl"* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"struct.std::_Rb_tree<const void *, std::pair<const void *const, boost::detail::tss_data_node>, std::_Select1st<std::pair<const void *const, boost::detail::tss_data_node> >, std::less<const void *>, std::allocator<std::pair<const void *const, boost::detail::tss_data_node> > >::_Rb_tree_impl"*, align 4
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  store %"struct.std::_Rb_tree<const void *, std::pair<const void *const, boost::detail::tss_data_node>, std::_Select1st<std::pair<const void *const, boost::detail::tss_data_node> >, std::less<const void *>, std::allocator<std::pair<const void *const, boost::detail::tss_data_node> > >::_Rb_tree_impl"* %this, %"struct.std::_Rb_tree<const void *, std::pair<const void *const, boost::detail::tss_data_node>, std::_Select1st<std::pair<const void *const, boost::detail::tss_data_node> >, std::less<const void *>, std::allocator<std::pair<const void *const, boost::detail::tss_data_node> > >::_Rb_tree_impl"** %this.addr, align 4
  %this1 = load %"struct.std::_Rb_tree<const void *, std::pair<const void *const, boost::detail::tss_data_node>, std::_Select1st<std::pair<const void *const, boost::detail::tss_data_node> >, std::less<const void *>, std::allocator<std::pair<const void *const, boost::detail::tss_data_node> > >::_Rb_tree_impl"** %this.addr
  %0 = bitcast %"struct.std::_Rb_tree<const void *, std::pair<const void *const, boost::detail::tss_data_node>, std::_Select1st<std::pair<const void *const, boost::detail::tss_data_node> >, std::less<const void *>, std::allocator<std::pair<const void *const, boost::detail::tss_data_node> > >::_Rb_tree_impl"* %this1 to %"class.std::allocator.19"*
  call void @_ZNSaISt13_Rb_tree_nodeISt4pairIKPKvN5boost6detail13tss_data_nodeEEEEC2Ev(%"class.std::allocator.19"* %0) nounwind
  %_M_key_compare = getelementptr inbounds %"struct.std::_Rb_tree<const void *, std::pair<const void *const, boost::detail::tss_data_node>, std::_Select1st<std::pair<const void *const, boost::detail::tss_data_node> >, std::less<const void *>, std::allocator<std::pair<const void *const, boost::detail::tss_data_node> > >::_Rb_tree_impl"* %this1, i32 0, i32 0
  %_M_header = getelementptr inbounds %"struct.std::_Rb_tree<const void *, std::pair<const void *const, boost::detail::tss_data_node>, std::_Select1st<std::pair<const void *const, boost::detail::tss_data_node> >, std::less<const void *>, std::allocator<std::pair<const void *const, boost::detail::tss_data_node> > >::_Rb_tree_impl"* %this1, i32 0, i32 1
  %1 = bitcast %"struct.std::_Rb_tree_node_base"* %_M_header to i8*
  call void @llvm.memset.p0i8.i32(i8* %1, i8 0, i32 16, i32 4, i1 false)
  %_M_node_count = getelementptr inbounds %"struct.std::_Rb_tree<const void *, std::pair<const void *const, boost::detail::tss_data_node>, std::_Select1st<std::pair<const void *const, boost::detail::tss_data_node> >, std::less<const void *>, std::allocator<std::pair<const void *const, boost::detail::tss_data_node> > >::_Rb_tree_impl"* %this1, i32 0, i32 2
  store i32 0, i32* %_M_node_count, align 4
  invoke void @_ZNSt8_Rb_treeIPKvSt4pairIKS1_N5boost6detail13tss_data_nodeEESt10_Select1stIS7_ESt4lessIS1_ESaIS7_EE13_Rb_tree_implISB_Lb0EE13_M_initializeEv(%"struct.std::_Rb_tree<const void *, std::pair<const void *const, boost::detail::tss_data_node>, std::_Select1st<std::pair<const void *const, boost::detail::tss_data_node> >, std::less<const void *>, std::allocator<std::pair<const void *const, boost::detail::tss_data_node> > >::_Rb_tree_impl"* %this1)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %entry
  ret void

lpad:                                             ; preds = %entry
  %2 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %3 = extractvalue { i8*, i32 } %2, 0
  store i8* %3, i8** %exn.slot
  %4 = extractvalue { i8*, i32 } %2, 1
  store i32 %4, i32* %ehselector.slot
  %5 = bitcast %"struct.std::_Rb_tree<const void *, std::pair<const void *const, boost::detail::tss_data_node>, std::_Select1st<std::pair<const void *const, boost::detail::tss_data_node> >, std::less<const void *>, std::allocator<std::pair<const void *const, boost::detail::tss_data_node> > >::_Rb_tree_impl"* %this1 to %"class.std::allocator.19"*
  call void @_ZNSaISt13_Rb_tree_nodeISt4pairIKPKvN5boost6detail13tss_data_nodeEEEED2Ev(%"class.std::allocator.19"* %5) nounwind
  br label %eh.resume

eh.resume:                                        ; preds = %lpad
  %exn = load i8** %exn.slot
  %sel = load i32* %ehselector.slot
  %lpad.val = insertvalue { i8*, i32 } undef, i8* %exn, 0
  %lpad.val2 = insertvalue { i8*, i32 } %lpad.val, i32 %sel, 1
  resume { i8*, i32 } %lpad.val2
}

define linkonce_odr void @_ZNSaISt13_Rb_tree_nodeISt4pairIKPKvN5boost6detail13tss_data_nodeEEEEC2Ev(%"class.std::allocator.19"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.std::allocator.19"*, align 4
  store %"class.std::allocator.19"* %this, %"class.std::allocator.19"** %this.addr, align 4
  %this1 = load %"class.std::allocator.19"** %this.addr
  %0 = bitcast %"class.std::allocator.19"* %this1 to %"class.__gnu_cxx::new_allocator.20"*
  call void @_ZN9__gnu_cxx13new_allocatorISt13_Rb_tree_nodeISt4pairIKPKvN5boost6detail13tss_data_nodeEEEEC2Ev(%"class.__gnu_cxx::new_allocator.20"* %0) nounwind
  ret void
}

declare void @llvm.memset.p0i8.i32(i8* nocapture, i8, i32, i32, i1) nounwind

define linkonce_odr void @_ZNSt8_Rb_treeIPKvSt4pairIKS1_N5boost6detail13tss_data_nodeEESt10_Select1stIS7_ESt4lessIS1_ESaIS7_EE13_Rb_tree_implISB_Lb0EE13_M_initializeEv(%"struct.std::_Rb_tree<const void *, std::pair<const void *const, boost::detail::tss_data_node>, std::_Select1st<std::pair<const void *const, boost::detail::tss_data_node> >, std::less<const void *>, std::allocator<std::pair<const void *const, boost::detail::tss_data_node> > >::_Rb_tree_impl"* %this) nounwind align 2 {
entry:
  %this.addr = alloca %"struct.std::_Rb_tree<const void *, std::pair<const void *const, boost::detail::tss_data_node>, std::_Select1st<std::pair<const void *const, boost::detail::tss_data_node> >, std::less<const void *>, std::allocator<std::pair<const void *const, boost::detail::tss_data_node> > >::_Rb_tree_impl"*, align 4
  store %"struct.std::_Rb_tree<const void *, std::pair<const void *const, boost::detail::tss_data_node>, std::_Select1st<std::pair<const void *const, boost::detail::tss_data_node> >, std::less<const void *>, std::allocator<std::pair<const void *const, boost::detail::tss_data_node> > >::_Rb_tree_impl"* %this, %"struct.std::_Rb_tree<const void *, std::pair<const void *const, boost::detail::tss_data_node>, std::_Select1st<std::pair<const void *const, boost::detail::tss_data_node> >, std::less<const void *>, std::allocator<std::pair<const void *const, boost::detail::tss_data_node> > >::_Rb_tree_impl"** %this.addr, align 4
  %this1 = load %"struct.std::_Rb_tree<const void *, std::pair<const void *const, boost::detail::tss_data_node>, std::_Select1st<std::pair<const void *const, boost::detail::tss_data_node> >, std::less<const void *>, std::allocator<std::pair<const void *const, boost::detail::tss_data_node> > >::_Rb_tree_impl"** %this.addr
  %_M_header = getelementptr inbounds %"struct.std::_Rb_tree<const void *, std::pair<const void *const, boost::detail::tss_data_node>, std::_Select1st<std::pair<const void *const, boost::detail::tss_data_node> >, std::less<const void *>, std::allocator<std::pair<const void *const, boost::detail::tss_data_node> > >::_Rb_tree_impl"* %this1, i32 0, i32 1
  %_M_color = getelementptr inbounds %"struct.std::_Rb_tree_node_base"* %_M_header, i32 0, i32 0
  store i32 0, i32* %_M_color, align 4
  %_M_header2 = getelementptr inbounds %"struct.std::_Rb_tree<const void *, std::pair<const void *const, boost::detail::tss_data_node>, std::_Select1st<std::pair<const void *const, boost::detail::tss_data_node> >, std::less<const void *>, std::allocator<std::pair<const void *const, boost::detail::tss_data_node> > >::_Rb_tree_impl"* %this1, i32 0, i32 1
  %_M_parent = getelementptr inbounds %"struct.std::_Rb_tree_node_base"* %_M_header2, i32 0, i32 1
  store %"struct.std::_Rb_tree_node_base"* null, %"struct.std::_Rb_tree_node_base"** %_M_parent, align 4
  %_M_header3 = getelementptr inbounds %"struct.std::_Rb_tree<const void *, std::pair<const void *const, boost::detail::tss_data_node>, std::_Select1st<std::pair<const void *const, boost::detail::tss_data_node> >, std::less<const void *>, std::allocator<std::pair<const void *const, boost::detail::tss_data_node> > >::_Rb_tree_impl"* %this1, i32 0, i32 1
  %_M_header4 = getelementptr inbounds %"struct.std::_Rb_tree<const void *, std::pair<const void *const, boost::detail::tss_data_node>, std::_Select1st<std::pair<const void *const, boost::detail::tss_data_node> >, std::less<const void *>, std::allocator<std::pair<const void *const, boost::detail::tss_data_node> > >::_Rb_tree_impl"* %this1, i32 0, i32 1
  %_M_left = getelementptr inbounds %"struct.std::_Rb_tree_node_base"* %_M_header4, i32 0, i32 2
  store %"struct.std::_Rb_tree_node_base"* %_M_header3, %"struct.std::_Rb_tree_node_base"** %_M_left, align 4
  %_M_header5 = getelementptr inbounds %"struct.std::_Rb_tree<const void *, std::pair<const void *const, boost::detail::tss_data_node>, std::_Select1st<std::pair<const void *const, boost::detail::tss_data_node> >, std::less<const void *>, std::allocator<std::pair<const void *const, boost::detail::tss_data_node> > >::_Rb_tree_impl"* %this1, i32 0, i32 1
  %_M_header6 = getelementptr inbounds %"struct.std::_Rb_tree<const void *, std::pair<const void *const, boost::detail::tss_data_node>, std::_Select1st<std::pair<const void *const, boost::detail::tss_data_node> >, std::less<const void *>, std::allocator<std::pair<const void *const, boost::detail::tss_data_node> > >::_Rb_tree_impl"* %this1, i32 0, i32 1
  %_M_right = getelementptr inbounds %"struct.std::_Rb_tree_node_base"* %_M_header6, i32 0, i32 3
  store %"struct.std::_Rb_tree_node_base"* %_M_header5, %"struct.std::_Rb_tree_node_base"** %_M_right, align 4
  ret void
}

define linkonce_odr void @_ZN9__gnu_cxx13new_allocatorISt13_Rb_tree_nodeISt4pairIKPKvN5boost6detail13tss_data_nodeEEEEC2Ev(%"class.__gnu_cxx::new_allocator.20"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.__gnu_cxx::new_allocator.20"*, align 4
  store %"class.__gnu_cxx::new_allocator.20"* %this, %"class.__gnu_cxx::new_allocator.20"** %this.addr, align 4
  %this1 = load %"class.__gnu_cxx::new_allocator.20"** %this.addr
  ret void
}

define linkonce_odr void @_ZN5boost18condition_variableC2Ev(%"class.boost::condition_variable"* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::condition_variable"*, align 4
  %res = alloca i32, align 4
  %ref.tmp = alloca %"class.boost::thread_resource_error", align 4
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  %res2 = alloca i32, align 4
  %ref.tmp10 = alloca %"class.boost::thread_resource_error", align 4
  store %"class.boost::condition_variable"* %this, %"class.boost::condition_variable"** %this.addr, align 4
  %this1 = load %"class.boost::condition_variable"** %this.addr
  %internal_mutex = getelementptr inbounds %"class.boost::condition_variable"* %this1, i32 0, i32 0
  %cond = getelementptr inbounds %"class.boost::condition_variable"* %this1, i32 0, i32 1
  %internal_mutex2 = getelementptr inbounds %"class.boost::condition_variable"* %this1, i32 0, i32 0
  %call = call i32 @pthread_mutex_init(%union.pthread_mutex_t* %internal_mutex2, %union.pthread_mutexattr_t* null) nounwind
  store i32 %call, i32* %res, align 4
  %0 = load i32* %res, align 4
  %tobool = icmp ne i32 %0, 0
  br i1 %tobool, label %if.then, label %if.end

if.then:                                          ; preds = %entry
  %1 = load i32* %res, align 4
  call void @_ZN5boost21thread_resource_errorC1EiPKc(%"class.boost::thread_resource_error"* %ref.tmp, i32 %1, i8* getelementptr inbounds ([68 x i8]* @.str20, i32 0, i32 0))
  invoke void @_ZN5boost15throw_exceptionINS_21thread_resource_errorEEEvRKT_(%"class.boost::thread_resource_error"* %ref.tmp) noreturn
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %if.then
  unreachable

lpad:                                             ; preds = %if.then
  %2 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %3 = extractvalue { i8*, i32 } %2, 0
  store i8* %3, i8** %exn.slot
  %4 = extractvalue { i8*, i32 } %2, 1
  store i32 %4, i32* %ehselector.slot
  call void @_ZN5boost21thread_resource_errorD1Ev(%"class.boost::thread_resource_error"* %ref.tmp) nounwind
  br label %eh.resume

if.end:                                           ; preds = %entry
  %cond3 = getelementptr inbounds %"class.boost::condition_variable"* %this1, i32 0, i32 1
  %call4 = call i32 @pthread_cond_init(%union.pthread_cond_t* %cond3, %union.pthread_condattr_t* null) nounwind
  store i32 %call4, i32* %res2, align 4
  %5 = load i32* %res2, align 4
  %tobool5 = icmp ne i32 %5, 0
  br i1 %tobool5, label %if.then6, label %if.end13

if.then6:                                         ; preds = %if.end
  %internal_mutex7 = getelementptr inbounds %"class.boost::condition_variable"* %this1, i32 0, i32 0
  %call8 = call i32 @pthread_mutex_destroy(%union.pthread_mutex_t* %internal_mutex7) nounwind
  %tobool9 = icmp ne i32 %call8, 0
  br i1 %tobool9, label %cond.false, label %cond.true

cond.true:                                        ; preds = %if.then6
  br label %cond.end

cond.false:                                       ; preds = %if.then6
  call void @__assert_fail(i8* getelementptr inbounds ([40 x i8]* @.str17, i32 0, i32 0), i8* getelementptr inbounds ([74 x i8]* @.str18, i32 0, i32 0), i32 46, i8* getelementptr inbounds ([48 x i8]* @__PRETTY_FUNCTION__._ZN5boost18condition_variableC2Ev, i32 0, i32 0)) noreturn nounwind
  unreachable
                                                  ; No predecessors!
  br label %cond.end

cond.end:                                         ; preds = %6, %cond.true
  %7 = load i32* %res2, align 4
  call void @_ZN5boost21thread_resource_errorC1EiPKc(%"class.boost::thread_resource_error"* %ref.tmp10, i32 %7, i8* getelementptr inbounds ([67 x i8]* @.str21, i32 0, i32 0))
  invoke void @_ZN5boost15throw_exceptionINS_21thread_resource_errorEEEvRKT_(%"class.boost::thread_resource_error"* %ref.tmp10) noreturn
          to label %invoke.cont12 unwind label %lpad11

invoke.cont12:                                    ; preds = %cond.end
  unreachable

lpad11:                                           ; preds = %cond.end
  %8 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %9 = extractvalue { i8*, i32 } %8, 0
  store i8* %9, i8** %exn.slot
  %10 = extractvalue { i8*, i32 } %8, 1
  store i32 %10, i32* %ehselector.slot
  call void @_ZN5boost21thread_resource_errorD1Ev(%"class.boost::thread_resource_error"* %ref.tmp10) nounwind
  br label %eh.resume

if.end13:                                         ; preds = %if.end
  ret void

eh.resume:                                        ; preds = %lpad11, %lpad
  %exn = load i8** %exn.slot
  %sel = load i32* %ehselector.slot
  %lpad.val = insertvalue { i8*, i32 } undef, i8* %exn, 0
  %lpad.val14 = insertvalue { i8*, i32 } %lpad.val, i32 %sel, 1
  resume { i8*, i32 } %lpad.val14
}

declare i32 @pthread_mutex_init(%union.pthread_mutex_t*, %union.pthread_mutexattr_t*) nounwind

define linkonce_odr void @_ZN5boost15throw_exceptionINS_21thread_resource_errorEEEvRKT_(%"class.boost::thread_resource_error"* %e) noreturn inlinehint {
entry:
  %e.addr = alloca %"class.boost::thread_resource_error"*, align 4
  %ref.tmp = alloca %"struct.boost::exception_detail::error_info_injector", align 4
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  %cleanup.isactive = alloca i1
  store %"class.boost::thread_resource_error"* %e, %"class.boost::thread_resource_error"** %e.addr, align 4
  %0 = load %"class.boost::thread_resource_error"** %e.addr, align 4
  %1 = bitcast %"class.boost::thread_resource_error"* %0 to %"class.std::exception"*
  call void @_ZN5boost36throw_exception_assert_compatibilityERKSt9exception(%"class.std::exception"* %1)
  %exception = call i8* @__cxa_allocate_exception(i32 44) nounwind
  store i1 true, i1* %cleanup.isactive
  %2 = bitcast i8* %exception to %"class.boost::exception_detail::clone_impl"*
  %3 = load %"class.boost::thread_resource_error"** %e.addr, align 4
  invoke void @_ZN5boost17enable_error_infoINS_21thread_resource_errorEEENS_16exception_detail29enable_error_info_return_typeIT_E4typeERKS4_(%"struct.boost::exception_detail::error_info_injector"* sret %ref.tmp, %"class.boost::thread_resource_error"* %3)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %entry
  invoke void @_ZN5boost24enable_current_exceptionINS_16exception_detail19error_info_injectorINS_21thread_resource_errorEEEEENS1_10clone_implIT_EERKS6_(%"class.boost::exception_detail::clone_impl"* sret %2, %"struct.boost::exception_detail::error_info_injector"* %ref.tmp)
          to label %invoke.cont2 unwind label %lpad1

invoke.cont2:                                     ; preds = %invoke.cont
  store i1 false, i1* %cleanup.isactive
  invoke void @__cxa_throw(i8* %exception, i8* bitcast ({ i8*, i8*, i32, i32, i8*, i32, i8*, i32 }* @_ZTIN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_21thread_resource_errorEEEEE to i8*), i8* bitcast (void (%"class.boost::exception_detail::clone_impl"*)* @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_21thread_resource_errorEEEED1Ev to i8*)) noreturn
          to label %unreachable unwind label %lpad1

lpad:                                             ; preds = %entry
  %4 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %5 = extractvalue { i8*, i32 } %4, 0
  store i8* %5, i8** %exn.slot
  %6 = extractvalue { i8*, i32 } %4, 1
  store i32 %6, i32* %ehselector.slot
  br label %ehcleanup

lpad1:                                            ; preds = %invoke.cont2, %invoke.cont
  %7 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %8 = extractvalue { i8*, i32 } %7, 0
  store i8* %8, i8** %exn.slot
  %9 = extractvalue { i8*, i32 } %7, 1
  store i32 %9, i32* %ehselector.slot
  call void @_ZN5boost16exception_detail19error_info_injectorINS_21thread_resource_errorEED1Ev(%"struct.boost::exception_detail::error_info_injector"* %ref.tmp) nounwind
  br label %ehcleanup

ehcleanup:                                        ; preds = %lpad1, %lpad
  %cleanup.is_active = load i1* %cleanup.isactive
  br i1 %cleanup.is_active, label %cleanup.action, label %cleanup.done

cleanup.action:                                   ; preds = %ehcleanup
  call void @__cxa_free_exception(i8* %exception) nounwind
  br label %cleanup.done

cleanup.done:                                     ; preds = %cleanup.action, %ehcleanup
  br label %eh.resume

return:                                           ; No predecessors!
  ret void

eh.resume:                                        ; preds = %cleanup.done
  %exn = load i8** %exn.slot
  %sel = load i32* %ehselector.slot
  %lpad.val = insertvalue { i8*, i32 } undef, i8* %exn, 0
  %lpad.val3 = insertvalue { i8*, i32 } %lpad.val, i32 %sel, 1
  resume { i8*, i32 } %lpad.val3

unreachable:                                      ; preds = %invoke.cont2
  unreachable
}

define linkonce_odr void @_ZN5boost21thread_resource_errorC1EiPKc(%"class.boost::thread_resource_error"* %this, i32 %ev, i8* %what_arg) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::thread_resource_error"*, align 4
  %ev.addr = alloca i32, align 4
  %what_arg.addr = alloca i8*, align 4
  store %"class.boost::thread_resource_error"* %this, %"class.boost::thread_resource_error"** %this.addr, align 4
  store i32 %ev, i32* %ev.addr, align 4
  store i8* %what_arg, i8** %what_arg.addr, align 4
  %this1 = load %"class.boost::thread_resource_error"** %this.addr
  %0 = load i32* %ev.addr, align 4
  %1 = load i8** %what_arg.addr, align 4
  call void @_ZN5boost21thread_resource_errorC2EiPKc(%"class.boost::thread_resource_error"* %this1, i32 %0, i8* %1)
  ret void
}

define linkonce_odr void @_ZN5boost21thread_resource_errorD1Ev(%"class.boost::thread_resource_error"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::thread_resource_error"*, align 4
  store %"class.boost::thread_resource_error"* %this, %"class.boost::thread_resource_error"** %this.addr, align 4
  %this1 = load %"class.boost::thread_resource_error"** %this.addr
  call void @_ZN5boost21thread_resource_errorD2Ev(%"class.boost::thread_resource_error"* %this1) nounwind
  ret void
}

declare i32 @pthread_cond_init(%union.pthread_cond_t*, %union.pthread_condattr_t*) nounwind

define linkonce_odr void @_ZN5boost21thread_resource_errorD2Ev(%"class.boost::thread_resource_error"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::thread_resource_error"*, align 4
  store %"class.boost::thread_resource_error"* %this, %"class.boost::thread_resource_error"** %this.addr, align 4
  %this1 = load %"class.boost::thread_resource_error"** %this.addr
  %0 = bitcast %"class.boost::thread_resource_error"* %this1 to %"class.boost::thread_exception"*
  call void @_ZN5boost16thread_exceptionD2Ev(%"class.boost::thread_exception"* %0) nounwind
  ret void
}

define linkonce_odr void @_ZN5boost16thread_exceptionD2Ev(%"class.boost::thread_exception"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::thread_exception"*, align 4
  store %"class.boost::thread_exception"* %this, %"class.boost::thread_exception"** %this.addr, align 4
  %this1 = load %"class.boost::thread_exception"** %this.addr
  %0 = bitcast %"class.boost::thread_exception"* %this1 to %"class.boost::system::system_error"*
  call void @_ZN5boost6system12system_errorD2Ev(%"class.boost::system::system_error"* %0) nounwind
  ret void
}

define linkonce_odr void @_ZN5boost6system12system_errorD2Ev(%"class.boost::system::system_error"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::system::system_error"*, align 4
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  store %"class.boost::system::system_error"* %this, %"class.boost::system::system_error"** %this.addr, align 4
  %this1 = load %"class.boost::system::system_error"** %this.addr
  %0 = bitcast %"class.boost::system::system_error"* %this1 to i8***
  store i8** getelementptr inbounds ([5 x i8*]* @_ZTVN5boost6system12system_errorE, i64 0, i64 2), i8*** %0
  %m_what = getelementptr inbounds %"class.boost::system::system_error"* %this1, i32 0, i32 2
  invoke void @_ZNSsD1Ev(%"class.std::basic_string"* %m_what)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %entry
  %1 = bitcast %"class.boost::system::system_error"* %this1 to %"class.std::runtime_error"*
  call void @_ZNSt13runtime_errorD2Ev(%"class.std::runtime_error"* %1) nounwind
  ret void

lpad:                                             ; preds = %entry
  %2 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
          filter [0 x i8*] zeroinitializer
  %3 = extractvalue { i8*, i32 } %2, 0
  store i8* %3, i8** %exn.slot
  %4 = extractvalue { i8*, i32 } %2, 1
  store i32 %4, i32* %ehselector.slot
  %5 = bitcast %"class.boost::system::system_error"* %this1 to %"class.std::runtime_error"*
  call void @_ZNSt13runtime_errorD2Ev(%"class.std::runtime_error"* %5) nounwind
  br label %filter.dispatch

filter.dispatch:                                  ; preds = %lpad
  %exn = load i8** %exn.slot
  call void @__cxa_call_unexpected(i8* %exn) noreturn
  unreachable
}

declare void @_ZNSt13runtime_errorD2Ev(%"class.std::runtime_error"*) nounwind

define linkonce_odr void @_ZN5boost21thread_resource_errorC2EiPKc(%"class.boost::thread_resource_error"* %this, i32 %ev, i8* %what_arg) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::thread_resource_error"*, align 4
  %ev.addr = alloca i32, align 4
  %what_arg.addr = alloca i8*, align 4
  store %"class.boost::thread_resource_error"* %this, %"class.boost::thread_resource_error"** %this.addr, align 4
  store i32 %ev, i32* %ev.addr, align 4
  store i8* %what_arg, i8** %what_arg.addr, align 4
  %this1 = load %"class.boost::thread_resource_error"** %this.addr
  %0 = bitcast %"class.boost::thread_resource_error"* %this1 to %"class.boost::thread_exception"*
  %1 = load i32* %ev.addr, align 4
  %2 = load i8** %what_arg.addr, align 4
  call void @_ZN5boost16thread_exceptionC2EiPKc(%"class.boost::thread_exception"* %0, i32 %1, i8* %2)
  %3 = bitcast %"class.boost::thread_resource_error"* %this1 to i8***
  store i8** getelementptr inbounds ([5 x i8*]* @_ZTVN5boost21thread_resource_errorE, i64 0, i64 2), i8*** %3
  ret void
}

define linkonce_odr void @_ZN5boost16thread_exceptionC2EiPKc(%"class.boost::thread_exception"* %this, i32 %ev, i8* %what_arg) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::thread_exception"*, align 4
  %ev.addr = alloca i32, align 4
  %what_arg.addr = alloca i8*, align 4
  %agg.tmp = alloca %"class.boost::system::error_code", align 4
  store %"class.boost::thread_exception"* %this, %"class.boost::thread_exception"** %this.addr, align 4
  store i32 %ev, i32* %ev.addr, align 4
  store i8* %what_arg, i8** %what_arg.addr, align 4
  %this1 = load %"class.boost::thread_exception"** %this.addr
  %0 = bitcast %"class.boost::thread_exception"* %this1 to %"class.boost::system::system_error"*
  %1 = load i32* %ev.addr, align 4
  %call = call %"class.boost::system::error_category"* @_ZN5boost6system15system_categoryEv()
  call void @_ZN5boost6system10error_codeC1EiRKNS0_14error_categoryE(%"class.boost::system::error_code"* %agg.tmp, i32 %1, %"class.boost::system::error_category"* %call)
  %2 = load i8** %what_arg.addr, align 4
  call void @_ZN5boost6system12system_errorC2ENS0_10error_codeEPKc(%"class.boost::system::system_error"* %0, %"class.boost::system::error_code"* byval align 4 %agg.tmp, i8* %2)
  %3 = bitcast %"class.boost::thread_exception"* %this1 to i8***
  store i8** getelementptr inbounds ([5 x i8*]* @_ZTVN5boost16thread_exceptionE, i64 0, i64 2), i8*** %3
  ret void
}

define linkonce_odr void @_ZN5boost21thread_resource_errorD0Ev(%"class.boost::thread_resource_error"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::thread_resource_error"*, align 4
  store %"class.boost::thread_resource_error"* %this, %"class.boost::thread_resource_error"** %this.addr, align 4
  %this1 = load %"class.boost::thread_resource_error"** %this.addr
  call void @_ZN5boost21thread_resource_errorD1Ev(%"class.boost::thread_resource_error"* %this1) nounwind
  %0 = bitcast %"class.boost::thread_resource_error"* %this1 to i8*
  call void @_ZdlPv(i8* %0) nounwind
  ret void
}

define linkonce_odr void @_ZN5boost6system12system_errorC2ENS0_10error_codeEPKc(%"class.boost::system::system_error"* %this, %"class.boost::system::error_code"* byval align 4 %ec, i8* %what_arg) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::system::system_error"*, align 4
  %what_arg.addr = alloca i8*, align 4
  %ref.tmp = alloca %"class.std::basic_string", align 4
  %ref.tmp2 = alloca %"class.std::allocator", align 1
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  store %"class.boost::system::system_error"* %this, %"class.boost::system::system_error"** %this.addr, align 4
  store i8* %what_arg, i8** %what_arg.addr, align 4
  %this1 = load %"class.boost::system::system_error"** %this.addr
  %0 = bitcast %"class.boost::system::system_error"* %this1 to %"class.std::runtime_error"*
  %1 = load i8** %what_arg.addr, align 4
  call void @_ZNSaIcEC1Ev(%"class.std::allocator"* %ref.tmp2) nounwind
  invoke void @_ZNSsC1EPKcRKSaIcE(%"class.std::basic_string"* %ref.tmp, i8* %1, %"class.std::allocator"* %ref.tmp2)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %entry
  invoke void @_ZNSt13runtime_errorC2ERKSs(%"class.std::runtime_error"* %0, %"class.std::basic_string"* %ref.tmp)
          to label %invoke.cont4 unwind label %lpad3

invoke.cont4:                                     ; preds = %invoke.cont
  invoke void @_ZNSsD1Ev(%"class.std::basic_string"* %ref.tmp)
          to label %invoke.cont5 unwind label %lpad

invoke.cont5:                                     ; preds = %invoke.cont4
  call void @_ZNSaIcED1Ev(%"class.std::allocator"* %ref.tmp2) nounwind
  %2 = bitcast %"class.boost::system::system_error"* %this1 to i8***
  store i8** getelementptr inbounds ([5 x i8*]* @_ZTVN5boost6system12system_errorE, i64 0, i64 2), i8*** %2
  %m_error_code = getelementptr inbounds %"class.boost::system::system_error"* %this1, i32 0, i32 1
  %3 = bitcast %"class.boost::system::error_code"* %m_error_code to i8*
  %4 = bitcast %"class.boost::system::error_code"* %ec to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %3, i8* %4, i32 8, i32 4, i1 false)
  %m_what = getelementptr inbounds %"class.boost::system::system_error"* %this1, i32 0, i32 2
  invoke void @_ZNSsC1Ev(%"class.std::basic_string"* %m_what)
          to label %invoke.cont8 unwind label %lpad7

invoke.cont8:                                     ; preds = %invoke.cont5
  ret void

lpad:                                             ; preds = %invoke.cont4, %entry
  %5 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %6 = extractvalue { i8*, i32 } %5, 0
  store i8* %6, i8** %exn.slot
  %7 = extractvalue { i8*, i32 } %5, 1
  store i32 %7, i32* %ehselector.slot
  br label %ehcleanup

lpad3:                                            ; preds = %invoke.cont
  %8 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %9 = extractvalue { i8*, i32 } %8, 0
  store i8* %9, i8** %exn.slot
  %10 = extractvalue { i8*, i32 } %8, 1
  store i32 %10, i32* %ehselector.slot
  invoke void @_ZNSsD1Ev(%"class.std::basic_string"* %ref.tmp)
          to label %invoke.cont6 unwind label %terminate.lpad

invoke.cont6:                                     ; preds = %lpad3
  br label %ehcleanup

ehcleanup:                                        ; preds = %invoke.cont6, %lpad
  call void @_ZNSaIcED1Ev(%"class.std::allocator"* %ref.tmp2) nounwind
  br label %eh.resume

lpad7:                                            ; preds = %invoke.cont5
  %11 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %12 = extractvalue { i8*, i32 } %11, 0
  store i8* %12, i8** %exn.slot
  %13 = extractvalue { i8*, i32 } %11, 1
  store i32 %13, i32* %ehselector.slot
  %14 = bitcast %"class.boost::system::system_error"* %this1 to %"class.std::runtime_error"*
  call void @_ZNSt13runtime_errorD2Ev(%"class.std::runtime_error"* %14) nounwind
  br label %eh.resume

eh.resume:                                        ; preds = %lpad7, %ehcleanup
  %exn = load i8** %exn.slot
  %sel = load i32* %ehselector.slot
  %lpad.val = insertvalue { i8*, i32 } undef, i8* %exn, 0
  %lpad.val10 = insertvalue { i8*, i32 } %lpad.val, i32 %sel, 1
  resume { i8*, i32 } %lpad.val10

terminate.lpad:                                   ; preds = %lpad3
  %15 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          catch i8* null
  call void @_ZSt9terminatev() noreturn nounwind
  unreachable
}

define linkonce_odr void @_ZN5boost6system10error_codeC1EiRKNS0_14error_categoryE(%"class.boost::system::error_code"* %this, i32 %val, %"class.boost::system::error_category"* %cat) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::system::error_code"*, align 4
  %val.addr = alloca i32, align 4
  %cat.addr = alloca %"class.boost::system::error_category"*, align 4
  store %"class.boost::system::error_code"* %this, %"class.boost::system::error_code"** %this.addr, align 4
  store i32 %val, i32* %val.addr, align 4
  store %"class.boost::system::error_category"* %cat, %"class.boost::system::error_category"** %cat.addr, align 4
  %this1 = load %"class.boost::system::error_code"** %this.addr
  %0 = load i32* %val.addr, align 4
  %1 = load %"class.boost::system::error_category"** %cat.addr
  call void @_ZN5boost6system10error_codeC2EiRKNS0_14error_categoryE(%"class.boost::system::error_code"* %this1, i32 %0, %"class.boost::system::error_category"* %1)
  ret void
}

define linkonce_odr void @_ZN5boost16thread_exceptionD1Ev(%"class.boost::thread_exception"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::thread_exception"*, align 4
  store %"class.boost::thread_exception"* %this, %"class.boost::thread_exception"** %this.addr, align 4
  %this1 = load %"class.boost::thread_exception"** %this.addr
  call void @_ZN5boost16thread_exceptionD2Ev(%"class.boost::thread_exception"* %this1) nounwind
  ret void
}

define linkonce_odr void @_ZN5boost16thread_exceptionD0Ev(%"class.boost::thread_exception"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::thread_exception"*, align 4
  store %"class.boost::thread_exception"* %this, %"class.boost::thread_exception"** %this.addr, align 4
  %this1 = load %"class.boost::thread_exception"** %this.addr
  call void @_ZN5boost16thread_exceptionD1Ev(%"class.boost::thread_exception"* %this1) nounwind
  %0 = bitcast %"class.boost::thread_exception"* %this1 to i8*
  call void @_ZdlPv(i8* %0) nounwind
  ret void
}

define linkonce_odr void @_ZN5boost6system10error_codeC2EiRKNS0_14error_categoryE(%"class.boost::system::error_code"* %this, i32 %val, %"class.boost::system::error_category"* %cat) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::system::error_code"*, align 4
  %val.addr = alloca i32, align 4
  %cat.addr = alloca %"class.boost::system::error_category"*, align 4
  store %"class.boost::system::error_code"* %this, %"class.boost::system::error_code"** %this.addr, align 4
  store i32 %val, i32* %val.addr, align 4
  store %"class.boost::system::error_category"* %cat, %"class.boost::system::error_category"** %cat.addr, align 4
  %this1 = load %"class.boost::system::error_code"** %this.addr
  %m_val = getelementptr inbounds %"class.boost::system::error_code"* %this1, i32 0, i32 0
  %0 = load i32* %val.addr, align 4
  store i32 %0, i32* %m_val, align 4
  %m_cat = getelementptr inbounds %"class.boost::system::error_code"* %this1, i32 0, i32 1
  %1 = load %"class.boost::system::error_category"** %cat.addr, align 4
  store %"class.boost::system::error_category"* %1, %"class.boost::system::error_category"** %m_cat, align 4
  ret void
}

declare void @_ZNSt13runtime_errorC2ERKSs(%"class.std::runtime_error"*, %"class.std::basic_string"*)

declare void @_ZNSsC1EPKcRKSaIcE(%"class.std::basic_string"*, i8*, %"class.std::allocator"*)

declare void @_ZNSaIcEC1Ev(%"class.std::allocator"*) nounwind

declare void @_ZNSaIcED1Ev(%"class.std::allocator"*) nounwind

declare void @llvm.memcpy.p0i8.p0i8.i32(i8* nocapture, i8* nocapture, i32, i32, i1) nounwind

declare void @_ZNSsC1Ev(%"class.std::basic_string"*)

define linkonce_odr void @_ZN5boost36throw_exception_assert_compatibilityERKSt9exception(%"class.std::exception"*) nounwind inlinehint {
entry:
  %.addr = alloca %"class.std::exception"*, align 4
  store %"class.std::exception"* %0, %"class.std::exception"** %.addr, align 4
  ret void
}

declare i8* @__cxa_allocate_exception(i32)

define linkonce_odr void @_ZN5boost24enable_current_exceptionINS_16exception_detail19error_info_injectorINS_21thread_resource_errorEEEEENS1_10clone_implIT_EERKS6_(%"class.boost::exception_detail::clone_impl"* noalias sret %agg.result, %"struct.boost::exception_detail::error_info_injector"* %x) inlinehint {
entry:
  %x.addr = alloca %"struct.boost::exception_detail::error_info_injector"*, align 4
  store %"struct.boost::exception_detail::error_info_injector"* %x, %"struct.boost::exception_detail::error_info_injector"** %x.addr, align 4
  %0 = load %"struct.boost::exception_detail::error_info_injector"** %x.addr, align 4
  call void @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_21thread_resource_errorEEEEC1ERKS4_(%"class.boost::exception_detail::clone_impl"* %agg.result, %"struct.boost::exception_detail::error_info_injector"* %0)
  ret void
}

define linkonce_odr void @_ZN5boost17enable_error_infoINS_21thread_resource_errorEEENS_16exception_detail29enable_error_info_return_typeIT_E4typeERKS4_(%"struct.boost::exception_detail::error_info_injector"* noalias sret %agg.result, %"class.boost::thread_resource_error"* %x) inlinehint {
entry:
  %x.addr = alloca %"class.boost::thread_resource_error"*, align 4
  store %"class.boost::thread_resource_error"* %x, %"class.boost::thread_resource_error"** %x.addr, align 4
  %0 = load %"class.boost::thread_resource_error"** %x.addr, align 4
  call void @_ZN5boost16exception_detail19error_info_injectorINS_21thread_resource_errorEEC1ERKS2_(%"struct.boost::exception_detail::error_info_injector"* %agg.result, %"class.boost::thread_resource_error"* %0)
  ret void
}

define linkonce_odr void @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_21thread_resource_errorEEEED1Ev(%"class.boost::exception_detail::clone_impl"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::exception_detail::clone_impl"*, align 4
  store %"class.boost::exception_detail::clone_impl"* %this, %"class.boost::exception_detail::clone_impl"** %this.addr, align 4
  %this1 = load %"class.boost::exception_detail::clone_impl"** %this.addr
  call void @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_21thread_resource_errorEEEED2Ev(%"class.boost::exception_detail::clone_impl"* %this1, i8** getelementptr inbounds ([2 x i8*]* @_ZTTN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_21thread_resource_errorEEEEE, i64 0, i64 0)) nounwind
  %0 = bitcast %"class.boost::exception_detail::clone_impl"* %this1 to i8*
  %1 = getelementptr inbounds i8* %0, i64 40
  %2 = bitcast i8* %1 to %"class.boost::exception_detail::clone_base"*
  call void @_ZN5boost16exception_detail10clone_baseD2Ev(%"class.boost::exception_detail::clone_base"* %2) nounwind
  ret void
}

declare void @__cxa_throw(i8*, i8*, i8*)

define linkonce_odr void @_ZN5boost16exception_detail19error_info_injectorINS_21thread_resource_errorEED1Ev(%"struct.boost::exception_detail::error_info_injector"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"struct.boost::exception_detail::error_info_injector"*, align 4
  store %"struct.boost::exception_detail::error_info_injector"* %this, %"struct.boost::exception_detail::error_info_injector"** %this.addr, align 4
  %this1 = load %"struct.boost::exception_detail::error_info_injector"** %this.addr
  call void @_ZN5boost16exception_detail19error_info_injectorINS_21thread_resource_errorEED2Ev(%"struct.boost::exception_detail::error_info_injector"* %this1) nounwind
  ret void
}

declare void @__cxa_free_exception(i8*)

define linkonce_odr void @_ZN5boost16exception_detail19error_info_injectorINS_21thread_resource_errorEED2Ev(%"struct.boost::exception_detail::error_info_injector"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"struct.boost::exception_detail::error_info_injector"*, align 4
  store %"struct.boost::exception_detail::error_info_injector"* %this, %"struct.boost::exception_detail::error_info_injector"** %this.addr, align 4
  %this1 = load %"struct.boost::exception_detail::error_info_injector"** %this.addr
  %0 = bitcast %"struct.boost::exception_detail::error_info_injector"* %this1 to i8*
  %1 = getelementptr inbounds i8* %0, i64 20
  %2 = bitcast i8* %1 to %"class.boost::exception"*
  call void @_ZN5boost9exceptionD2Ev(%"class.boost::exception"* %2) nounwind
  %3 = bitcast %"struct.boost::exception_detail::error_info_injector"* %this1 to %"class.boost::thread_resource_error"*
  call void @_ZN5boost21thread_resource_errorD2Ev(%"class.boost::thread_resource_error"* %3) nounwind
  ret void
}

define linkonce_odr void @_ZThn20_N5boost16exception_detail19error_info_injectorINS_21thread_resource_errorEED1Ev(%"struct.boost::exception_detail::error_info_injector"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"struct.boost::exception_detail::error_info_injector"*, align 4
  store %"struct.boost::exception_detail::error_info_injector"* %this, %"struct.boost::exception_detail::error_info_injector"** %this.addr, align 4
  %this1 = load %"struct.boost::exception_detail::error_info_injector"** %this.addr
  %0 = bitcast %"struct.boost::exception_detail::error_info_injector"* %this1 to i8*
  %1 = getelementptr inbounds i8* %0, i64 -20
  %2 = bitcast i8* %1 to %"struct.boost::exception_detail::error_info_injector"*
  call void @_ZN5boost16exception_detail19error_info_injectorINS_21thread_resource_errorEED1Ev(%"struct.boost::exception_detail::error_info_injector"* %2) nounwind
  ret void
}

define linkonce_odr void @_ZN5boost9exceptionD2Ev(%"class.boost::exception"* %this) unnamed_addr nounwind inlinehint align 2 {
entry:
  %this.addr = alloca %"class.boost::exception"*, align 4
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  store %"class.boost::exception"* %this, %"class.boost::exception"** %this.addr, align 4
  %this1 = load %"class.boost::exception"** %this.addr
  %0 = bitcast %"class.boost::exception"* %this1 to i8***
  store i8** getelementptr inbounds ([4 x i8*]* @_ZTVN5boost9exceptionE, i64 0, i64 2), i8*** %0
  %data_ = getelementptr inbounds %"class.boost::exception"* %this1, i32 0, i32 1
  invoke void @_ZN5boost16exception_detail12refcount_ptrINS0_20error_info_containerEED1Ev(%"class.boost::exception_detail::refcount_ptr"* %data_)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %entry
  ret void

lpad:                                             ; preds = %entry
  %1 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          filter [0 x i8*] zeroinitializer
  %2 = extractvalue { i8*, i32 } %1, 0
  store i8* %2, i8** %exn.slot
  %3 = extractvalue { i8*, i32 } %1, 1
  store i32 %3, i32* %ehselector.slot
  br label %filter.dispatch

filter.dispatch:                                  ; preds = %lpad
  %exn = load i8** %exn.slot
  call void @__cxa_call_unexpected(i8* %exn) noreturn
  unreachable
}

define linkonce_odr void @_ZN5boost16exception_detail12refcount_ptrINS0_20error_info_containerEED1Ev(%"class.boost::exception_detail::refcount_ptr"* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::exception_detail::refcount_ptr"*, align 4
  store %"class.boost::exception_detail::refcount_ptr"* %this, %"class.boost::exception_detail::refcount_ptr"** %this.addr, align 4
  %this1 = load %"class.boost::exception_detail::refcount_ptr"** %this.addr
  call void @_ZN5boost16exception_detail12refcount_ptrINS0_20error_info_containerEED2Ev(%"class.boost::exception_detail::refcount_ptr"* %this1)
  ret void
}

define linkonce_odr void @_ZN5boost16exception_detail12refcount_ptrINS0_20error_info_containerEED2Ev(%"class.boost::exception_detail::refcount_ptr"* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::exception_detail::refcount_ptr"*, align 4
  store %"class.boost::exception_detail::refcount_ptr"* %this, %"class.boost::exception_detail::refcount_ptr"** %this.addr, align 4
  %this1 = load %"class.boost::exception_detail::refcount_ptr"** %this.addr
  call void @_ZN5boost16exception_detail12refcount_ptrINS0_20error_info_containerEE7releaseEv(%"class.boost::exception_detail::refcount_ptr"* %this1)
  ret void
}

define linkonce_odr void @_ZN5boost16exception_detail12refcount_ptrINS0_20error_info_containerEE7releaseEv(%"class.boost::exception_detail::refcount_ptr"* %this) align 2 {
entry:
  %this.addr = alloca %"class.boost::exception_detail::refcount_ptr"*, align 4
  store %"class.boost::exception_detail::refcount_ptr"* %this, %"class.boost::exception_detail::refcount_ptr"** %this.addr, align 4
  %this1 = load %"class.boost::exception_detail::refcount_ptr"** %this.addr
  %px_ = getelementptr inbounds %"class.boost::exception_detail::refcount_ptr"* %this1, i32 0, i32 0
  %0 = load %"struct.boost::exception_detail::error_info_container"** %px_, align 4
  %tobool = icmp ne %"struct.boost::exception_detail::error_info_container"* %0, null
  br i1 %tobool, label %land.lhs.true, label %if.end

land.lhs.true:                                    ; preds = %entry
  %px_2 = getelementptr inbounds %"class.boost::exception_detail::refcount_ptr"* %this1, i32 0, i32 0
  %1 = load %"struct.boost::exception_detail::error_info_container"** %px_2, align 4
  %2 = bitcast %"struct.boost::exception_detail::error_info_container"* %1 to i1 (%"struct.boost::exception_detail::error_info_container"*)***
  %vtable = load i1 (%"struct.boost::exception_detail::error_info_container"*)*** %2
  %vfn = getelementptr inbounds i1 (%"struct.boost::exception_detail::error_info_container"*)** %vtable, i64 4
  %3 = load i1 (%"struct.boost::exception_detail::error_info_container"*)** %vfn
  %call = call zeroext i1 %3(%"struct.boost::exception_detail::error_info_container"* %1)
  br i1 %call, label %if.then, label %if.end

if.then:                                          ; preds = %land.lhs.true
  %px_3 = getelementptr inbounds %"class.boost::exception_detail::refcount_ptr"* %this1, i32 0, i32 0
  store %"struct.boost::exception_detail::error_info_container"* null, %"struct.boost::exception_detail::error_info_container"** %px_3, align 4
  br label %if.end

if.end:                                           ; preds = %if.then, %land.lhs.true, %entry
  ret void
}

define linkonce_odr void @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_21thread_resource_errorEEEED2Ev(%"class.boost::exception_detail::clone_impl"* %this, i8** %vtt) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::exception_detail::clone_impl"*, align 4
  %vtt.addr = alloca i8**, align 4
  store %"class.boost::exception_detail::clone_impl"* %this, %"class.boost::exception_detail::clone_impl"** %this.addr, align 4
  store i8** %vtt, i8*** %vtt.addr, align 4
  %this1 = load %"class.boost::exception_detail::clone_impl"** %this.addr
  %vtt2 = load i8*** %vtt.addr
  %0 = bitcast %"class.boost::exception_detail::clone_impl"* %this1 to %"struct.boost::exception_detail::error_info_injector"*
  call void @_ZN5boost16exception_detail19error_info_injectorINS_21thread_resource_errorEED2Ev(%"struct.boost::exception_detail::error_info_injector"* %0) nounwind
  ret void
}

define linkonce_odr void @_ZN5boost16exception_detail10clone_baseD2Ev(%"class.boost::exception_detail::clone_base"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::exception_detail::clone_base"*, align 4
  store %"class.boost::exception_detail::clone_base"* %this, %"class.boost::exception_detail::clone_base"** %this.addr, align 4
  %this1 = load %"class.boost::exception_detail::clone_base"** %this.addr
  ret void
}

define linkonce_odr void @_ZThn20_N5boost16exception_detail10clone_implINS0_19error_info_injectorINS_21thread_resource_errorEEEED1Ev(%"class.boost::exception_detail::clone_impl"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::exception_detail::clone_impl"*, align 4
  store %"class.boost::exception_detail::clone_impl"* %this, %"class.boost::exception_detail::clone_impl"** %this.addr, align 4
  %this1 = load %"class.boost::exception_detail::clone_impl"** %this.addr
  %0 = bitcast %"class.boost::exception_detail::clone_impl"* %this1 to i8*
  %1 = getelementptr inbounds i8* %0, i64 -20
  %2 = bitcast i8* %1 to %"class.boost::exception_detail::clone_impl"*
  call void @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_21thread_resource_errorEEEED1Ev(%"class.boost::exception_detail::clone_impl"* %2) nounwind
  ret void
}

define linkonce_odr void @_ZTv0_n20_N5boost16exception_detail10clone_implINS0_19error_info_injectorINS_21thread_resource_errorEEEED1Ev(%"class.boost::exception_detail::clone_impl"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::exception_detail::clone_impl"*, align 4
  store %"class.boost::exception_detail::clone_impl"* %this, %"class.boost::exception_detail::clone_impl"** %this.addr, align 4
  %this1 = load %"class.boost::exception_detail::clone_impl"** %this.addr
  %0 = bitcast %"class.boost::exception_detail::clone_impl"* %this1 to i8*
  %1 = bitcast i8* %0 to i8**
  %2 = load i8** %1
  %3 = getelementptr inbounds i8* %2, i64 -20
  %4 = bitcast i8* %3 to i32*
  %5 = load i32* %4
  %6 = getelementptr inbounds i8* %0, i32 %5
  %7 = bitcast i8* %6 to %"class.boost::exception_detail::clone_impl"*
  call void @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_21thread_resource_errorEEEED1Ev(%"class.boost::exception_detail::clone_impl"* %7) nounwind
  ret void
}

define linkonce_odr void @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_21thread_resource_errorEEEED0Ev(%"class.boost::exception_detail::clone_impl"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::exception_detail::clone_impl"*, align 4
  store %"class.boost::exception_detail::clone_impl"* %this, %"class.boost::exception_detail::clone_impl"** %this.addr, align 4
  %this1 = load %"class.boost::exception_detail::clone_impl"** %this.addr
  call void @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_21thread_resource_errorEEEED1Ev(%"class.boost::exception_detail::clone_impl"* %this1) nounwind
  %0 = bitcast %"class.boost::exception_detail::clone_impl"* %this1 to i8*
  call void @_ZdlPv(i8* %0) nounwind
  ret void
}

define linkonce_odr %"class.boost::exception_detail::clone_base"* @_ZNK5boost16exception_detail10clone_implINS0_19error_info_injectorINS_21thread_resource_errorEEEE5cloneEv(%"class.boost::exception_detail::clone_impl"* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::exception_detail::clone_impl"*, align 4
  %agg.tmp = alloca %"struct.boost::exception_detail::clone_impl<boost::exception_detail::error_info_injector<boost::thread_resource_error> >::clone_tag", align 1
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  store %"class.boost::exception_detail::clone_impl"* %this, %"class.boost::exception_detail::clone_impl"** %this.addr, align 4
  %this1 = load %"class.boost::exception_detail::clone_impl"** %this.addr
  %call = call noalias i8* @_Znwj(i32 44)
  %0 = bitcast i8* %call to %"class.boost::exception_detail::clone_impl"*
  invoke void @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_21thread_resource_errorEEEEC1ERKS5_NS5_9clone_tagE(%"class.boost::exception_detail::clone_impl"* %0, %"class.boost::exception_detail::clone_impl"* %this1)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %entry
  %1 = icmp eq %"class.boost::exception_detail::clone_impl"* %0, null
  br i1 %1, label %cast.end, label %cast.notnull

cast.notnull:                                     ; preds = %invoke.cont
  %2 = bitcast %"class.boost::exception_detail::clone_impl"* %0 to i8**
  %vtable = load i8** %2
  %vbase.offset.ptr = getelementptr i8* %vtable, i64 -12
  %3 = bitcast i8* %vbase.offset.ptr to i32*
  %vbase.offset = load i32* %3
  %4 = bitcast %"class.boost::exception_detail::clone_impl"* %0 to i8*
  %add.ptr = getelementptr inbounds i8* %4, i32 %vbase.offset
  %5 = bitcast i8* %add.ptr to %"class.boost::exception_detail::clone_base"*
  br label %cast.end

cast.end:                                         ; preds = %cast.notnull, %invoke.cont
  %cast.result = phi %"class.boost::exception_detail::clone_base"* [ %5, %cast.notnull ], [ null, %invoke.cont ]
  ret %"class.boost::exception_detail::clone_base"* %cast.result

lpad:                                             ; preds = %entry
  %6 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %7 = extractvalue { i8*, i32 } %6, 0
  store i8* %7, i8** %exn.slot
  %8 = extractvalue { i8*, i32 } %6, 1
  store i32 %8, i32* %ehselector.slot
  call void @_ZdlPv(i8* %call) nounwind
  br label %eh.resume

eh.resume:                                        ; preds = %lpad
  %exn = load i8** %exn.slot
  %sel = load i32* %ehselector.slot
  %lpad.val = insertvalue { i8*, i32 } undef, i8* %exn, 0
  %lpad.val2 = insertvalue { i8*, i32 } %lpad.val, i32 %sel, 1
  resume { i8*, i32 } %lpad.val2
}

define linkonce_odr void @_ZNK5boost16exception_detail10clone_implINS0_19error_info_injectorINS_21thread_resource_errorEEEE7rethrowEv(%"class.boost::exception_detail::clone_impl"* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::exception_detail::clone_impl"*, align 4
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  store %"class.boost::exception_detail::clone_impl"* %this, %"class.boost::exception_detail::clone_impl"** %this.addr, align 4
  %this1 = load %"class.boost::exception_detail::clone_impl"** %this.addr
  %exception = call i8* @__cxa_allocate_exception(i32 44) nounwind
  %0 = bitcast i8* %exception to %"class.boost::exception_detail::clone_impl"*
  invoke void @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_21thread_resource_errorEEEEC1ERKS5_(%"class.boost::exception_detail::clone_impl"* %0, %"class.boost::exception_detail::clone_impl"* %this1)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %entry
  call void @__cxa_throw(i8* %exception, i8* bitcast ({ i8*, i8*, i32, i32, i8*, i32, i8*, i32 }* @_ZTIN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_21thread_resource_errorEEEEE to i8*), i8* bitcast (void (%"class.boost::exception_detail::clone_impl"*)* @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_21thread_resource_errorEEEED1Ev to i8*)) noreturn
  unreachable

lpad:                                             ; preds = %entry
  %1 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %2 = extractvalue { i8*, i32 } %1, 0
  store i8* %2, i8** %exn.slot
  %3 = extractvalue { i8*, i32 } %1, 1
  store i32 %3, i32* %ehselector.slot
  call void @__cxa_free_exception(i8* %exception) nounwind
  br label %eh.resume

return:                                           ; No predecessors!
  ret void

eh.resume:                                        ; preds = %lpad
  %exn = load i8** %exn.slot
  %sel = load i32* %ehselector.slot
  %lpad.val = insertvalue { i8*, i32 } undef, i8* %exn, 0
  %lpad.val2 = insertvalue { i8*, i32 } %lpad.val, i32 %sel, 1
  resume { i8*, i32 } %lpad.val2
}

define linkonce_odr void @_ZThn20_N5boost16exception_detail10clone_implINS0_19error_info_injectorINS_21thread_resource_errorEEEED0Ev(%"class.boost::exception_detail::clone_impl"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::exception_detail::clone_impl"*, align 4
  store %"class.boost::exception_detail::clone_impl"* %this, %"class.boost::exception_detail::clone_impl"** %this.addr, align 4
  %this1 = load %"class.boost::exception_detail::clone_impl"** %this.addr
  %0 = bitcast %"class.boost::exception_detail::clone_impl"* %this1 to i8*
  %1 = getelementptr inbounds i8* %0, i64 -20
  %2 = bitcast i8* %1 to %"class.boost::exception_detail::clone_impl"*
  call void @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_21thread_resource_errorEEEED0Ev(%"class.boost::exception_detail::clone_impl"* %2) nounwind
  ret void
}

define linkonce_odr %"class.boost::exception_detail::clone_base"* @_ZTv0_n12_NK5boost16exception_detail10clone_implINS0_19error_info_injectorINS_21thread_resource_errorEEEE5cloneEv(%"class.boost::exception_detail::clone_impl"* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::exception_detail::clone_impl"*, align 4
  store %"class.boost::exception_detail::clone_impl"* %this, %"class.boost::exception_detail::clone_impl"** %this.addr, align 4
  %this1 = load %"class.boost::exception_detail::clone_impl"** %this.addr
  %0 = bitcast %"class.boost::exception_detail::clone_impl"* %this1 to i8*
  %1 = bitcast i8* %0 to i8**
  %2 = load i8** %1
  %3 = getelementptr inbounds i8* %2, i64 -12
  %4 = bitcast i8* %3 to i32*
  %5 = load i32* %4
  %6 = getelementptr inbounds i8* %0, i32 %5
  %7 = bitcast i8* %6 to %"class.boost::exception_detail::clone_impl"*
  %call = call %"class.boost::exception_detail::clone_base"* @_ZNK5boost16exception_detail10clone_implINS0_19error_info_injectorINS_21thread_resource_errorEEEE5cloneEv(%"class.boost::exception_detail::clone_impl"* %7)
  ret %"class.boost::exception_detail::clone_base"* %call
}

define linkonce_odr void @_ZTv0_n16_NK5boost16exception_detail10clone_implINS0_19error_info_injectorINS_21thread_resource_errorEEEE7rethrowEv(%"class.boost::exception_detail::clone_impl"* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::exception_detail::clone_impl"*, align 4
  store %"class.boost::exception_detail::clone_impl"* %this, %"class.boost::exception_detail::clone_impl"** %this.addr, align 4
  %this1 = load %"class.boost::exception_detail::clone_impl"** %this.addr
  %0 = bitcast %"class.boost::exception_detail::clone_impl"* %this1 to i8*
  %1 = bitcast i8* %0 to i8**
  %2 = load i8** %1
  %3 = getelementptr inbounds i8* %2, i64 -16
  %4 = bitcast i8* %3 to i32*
  %5 = load i32* %4
  %6 = getelementptr inbounds i8* %0, i32 %5
  %7 = bitcast i8* %6 to %"class.boost::exception_detail::clone_impl"*
  call void @_ZNK5boost16exception_detail10clone_implINS0_19error_info_injectorINS_21thread_resource_errorEEEE7rethrowEv(%"class.boost::exception_detail::clone_impl"* %7)
  ret void
}

define linkonce_odr void @_ZTv0_n20_N5boost16exception_detail10clone_implINS0_19error_info_injectorINS_21thread_resource_errorEEEED0Ev(%"class.boost::exception_detail::clone_impl"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::exception_detail::clone_impl"*, align 4
  store %"class.boost::exception_detail::clone_impl"* %this, %"class.boost::exception_detail::clone_impl"** %this.addr, align 4
  %this1 = load %"class.boost::exception_detail::clone_impl"** %this.addr
  %0 = bitcast %"class.boost::exception_detail::clone_impl"* %this1 to i8*
  %1 = bitcast i8* %0 to i8**
  %2 = load i8** %1
  %3 = getelementptr inbounds i8* %2, i64 -20
  %4 = bitcast i8* %3 to i32*
  %5 = load i32* %4
  %6 = getelementptr inbounds i8* %0, i32 %5
  %7 = bitcast i8* %6 to %"class.boost::exception_detail::clone_impl"*
  call void @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_21thread_resource_errorEEEED0Ev(%"class.boost::exception_detail::clone_impl"* %7) nounwind
  ret void
}

define linkonce_odr void @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_21thread_resource_errorEEEEC1ERKS5_(%"class.boost::exception_detail::clone_impl"* %this, %"class.boost::exception_detail::clone_impl"*) unnamed_addr inlinehint align 2 {
entry:
  %this.addr = alloca %"class.boost::exception_detail::clone_impl"*, align 4
  %.addr = alloca %"class.boost::exception_detail::clone_impl"*, align 4
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  store %"class.boost::exception_detail::clone_impl"* %this, %"class.boost::exception_detail::clone_impl"** %this.addr, align 4
  store %"class.boost::exception_detail::clone_impl"* %0, %"class.boost::exception_detail::clone_impl"** %.addr, align 4
  %this1 = load %"class.boost::exception_detail::clone_impl"** %this.addr
  %1 = bitcast %"class.boost::exception_detail::clone_impl"* %this1 to i8*
  %2 = getelementptr inbounds i8* %1, i64 40
  %3 = bitcast i8* %2 to %"class.boost::exception_detail::clone_base"*
  %4 = load %"class.boost::exception_detail::clone_impl"** %.addr, align 4
  %5 = bitcast %"class.boost::exception_detail::clone_impl"* %4 to i8**
  %vtable = load i8** %5
  %vbase.offset.ptr = getelementptr i8* %vtable, i64 -12
  %6 = bitcast i8* %vbase.offset.ptr to i32*
  %vbase.offset = load i32* %6
  %7 = bitcast %"class.boost::exception_detail::clone_impl"* %4 to i8*
  %add.ptr = getelementptr inbounds i8* %7, i32 %vbase.offset
  %8 = bitcast i8* %add.ptr to %"class.boost::exception_detail::clone_base"*
  call void @_ZN5boost16exception_detail10clone_baseC2ERKS1_(%"class.boost::exception_detail::clone_base"* %3, %"class.boost::exception_detail::clone_base"* %8) nounwind
  %9 = bitcast %"class.boost::exception_detail::clone_impl"* %this1 to %"struct.boost::exception_detail::error_info_injector"*
  %10 = load %"class.boost::exception_detail::clone_impl"** %.addr, align 4
  %11 = bitcast %"class.boost::exception_detail::clone_impl"* %10 to %"struct.boost::exception_detail::error_info_injector"*
  invoke void @_ZN5boost16exception_detail19error_info_injectorINS_21thread_resource_errorEEC2ERKS3_(%"struct.boost::exception_detail::error_info_injector"* %9, %"struct.boost::exception_detail::error_info_injector"* %11)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %entry
  %12 = bitcast %"class.boost::exception_detail::clone_impl"* %this1 to i8***
  store i8** getelementptr inbounds ([21 x i8*]* @_ZTVN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_21thread_resource_errorEEEEE, i64 0, i64 3), i8*** %12
  %13 = bitcast %"class.boost::exception_detail::clone_impl"* %this1 to i8*
  %add.ptr2 = getelementptr inbounds i8* %13, i32 20
  %14 = bitcast i8* %add.ptr2 to i8***
  store i8** getelementptr inbounds ([21 x i8*]* @_ZTVN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_21thread_resource_errorEEEEE, i64 0, i64 10), i8*** %14
  %15 = bitcast %"class.boost::exception_detail::clone_impl"* %this1 to i8*
  %add.ptr3 = getelementptr inbounds i8* %15, i32 40
  %16 = bitcast i8* %add.ptr3 to i8***
  store i8** getelementptr inbounds ([21 x i8*]* @_ZTVN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_21thread_resource_errorEEEEE, i64 0, i64 17), i8*** %16
  ret void

lpad:                                             ; preds = %entry
  %17 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %18 = extractvalue { i8*, i32 } %17, 0
  store i8* %18, i8** %exn.slot
  %19 = extractvalue { i8*, i32 } %17, 1
  store i32 %19, i32* %ehselector.slot
  %20 = bitcast %"class.boost::exception_detail::clone_impl"* %this1 to i8*
  %21 = getelementptr inbounds i8* %20, i64 40
  %22 = bitcast i8* %21 to %"class.boost::exception_detail::clone_base"*
  call void @_ZN5boost16exception_detail10clone_baseD2Ev(%"class.boost::exception_detail::clone_base"* %22) nounwind
  br label %eh.resume

eh.resume:                                        ; preds = %lpad
  %exn = load i8** %exn.slot
  %sel = load i32* %ehselector.slot
  %lpad.val = insertvalue { i8*, i32 } undef, i8* %exn, 0
  %lpad.val4 = insertvalue { i8*, i32 } %lpad.val, i32 %sel, 1
  resume { i8*, i32 } %lpad.val4
}

define linkonce_odr void @_ZN5boost16exception_detail10clone_baseC2ERKS1_(%"class.boost::exception_detail::clone_base"* %this, %"class.boost::exception_detail::clone_base"*) unnamed_addr nounwind inlinehint align 2 {
entry:
  %this.addr = alloca %"class.boost::exception_detail::clone_base"*, align 4
  %.addr = alloca %"class.boost::exception_detail::clone_base"*, align 4
  store %"class.boost::exception_detail::clone_base"* %this, %"class.boost::exception_detail::clone_base"** %this.addr, align 4
  store %"class.boost::exception_detail::clone_base"* %0, %"class.boost::exception_detail::clone_base"** %.addr, align 4
  %this1 = load %"class.boost::exception_detail::clone_base"** %this.addr
  %1 = bitcast %"class.boost::exception_detail::clone_base"* %this1 to i8***
  store i8** getelementptr inbounds ([6 x i8*]* @_ZTVN5boost16exception_detail10clone_baseE, i64 0, i64 2), i8*** %1
  ret void
}

define linkonce_odr void @_ZN5boost16exception_detail19error_info_injectorINS_21thread_resource_errorEEC2ERKS3_(%"struct.boost::exception_detail::error_info_injector"* %this, %"struct.boost::exception_detail::error_info_injector"*) unnamed_addr inlinehint align 2 {
entry:
  %this.addr = alloca %"struct.boost::exception_detail::error_info_injector"*, align 4
  %.addr = alloca %"struct.boost::exception_detail::error_info_injector"*, align 4
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  store %"struct.boost::exception_detail::error_info_injector"* %this, %"struct.boost::exception_detail::error_info_injector"** %this.addr, align 4
  store %"struct.boost::exception_detail::error_info_injector"* %0, %"struct.boost::exception_detail::error_info_injector"** %.addr, align 4
  %this1 = load %"struct.boost::exception_detail::error_info_injector"** %this.addr
  %1 = bitcast %"struct.boost::exception_detail::error_info_injector"* %this1 to %"class.boost::thread_resource_error"*
  %2 = load %"struct.boost::exception_detail::error_info_injector"** %.addr, align 4
  %3 = bitcast %"struct.boost::exception_detail::error_info_injector"* %2 to %"class.boost::thread_resource_error"*
  call void @_ZN5boost21thread_resource_errorC2ERKS0_(%"class.boost::thread_resource_error"* %1, %"class.boost::thread_resource_error"* %3)
  %4 = bitcast %"struct.boost::exception_detail::error_info_injector"* %this1 to i8*
  %5 = getelementptr inbounds i8* %4, i64 20
  %6 = bitcast i8* %5 to %"class.boost::exception"*
  %7 = load %"struct.boost::exception_detail::error_info_injector"** %.addr, align 4
  %8 = bitcast %"struct.boost::exception_detail::error_info_injector"* %7 to i8*
  %add.ptr = getelementptr inbounds i8* %8, i32 20
  %9 = bitcast i8* %add.ptr to %"class.boost::exception"*
  invoke void @_ZN5boost9exceptionC2ERKS0_(%"class.boost::exception"* %6, %"class.boost::exception"* %9)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %entry
  %10 = bitcast %"struct.boost::exception_detail::error_info_injector"* %this1 to i8***
  store i8** getelementptr inbounds ([9 x i8*]* @_ZTVN5boost16exception_detail19error_info_injectorINS_21thread_resource_errorEEE, i64 0, i64 2), i8*** %10
  %11 = bitcast %"struct.boost::exception_detail::error_info_injector"* %this1 to i8*
  %add.ptr2 = getelementptr inbounds i8* %11, i32 20
  %12 = bitcast i8* %add.ptr2 to i8***
  store i8** getelementptr inbounds ([9 x i8*]* @_ZTVN5boost16exception_detail19error_info_injectorINS_21thread_resource_errorEEE, i64 0, i64 7), i8*** %12
  ret void

lpad:                                             ; preds = %entry
  %13 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %14 = extractvalue { i8*, i32 } %13, 0
  store i8* %14, i8** %exn.slot
  %15 = extractvalue { i8*, i32 } %13, 1
  store i32 %15, i32* %ehselector.slot
  %16 = bitcast %"struct.boost::exception_detail::error_info_injector"* %this1 to %"class.boost::thread_resource_error"*
  call void @_ZN5boost21thread_resource_errorD2Ev(%"class.boost::thread_resource_error"* %16) nounwind
  br label %eh.resume

eh.resume:                                        ; preds = %lpad
  %exn = load i8** %exn.slot
  %sel = load i32* %ehselector.slot
  %lpad.val = insertvalue { i8*, i32 } undef, i8* %exn, 0
  %lpad.val3 = insertvalue { i8*, i32 } %lpad.val, i32 %sel, 1
  resume { i8*, i32 } %lpad.val3
}

define linkonce_odr void @_ZN5boost21thread_resource_errorC2ERKS0_(%"class.boost::thread_resource_error"* %this, %"class.boost::thread_resource_error"*) unnamed_addr inlinehint align 2 {
entry:
  %this.addr = alloca %"class.boost::thread_resource_error"*, align 4
  %.addr = alloca %"class.boost::thread_resource_error"*, align 4
  store %"class.boost::thread_resource_error"* %this, %"class.boost::thread_resource_error"** %this.addr, align 4
  store %"class.boost::thread_resource_error"* %0, %"class.boost::thread_resource_error"** %.addr, align 4
  %this1 = load %"class.boost::thread_resource_error"** %this.addr
  %1 = bitcast %"class.boost::thread_resource_error"* %this1 to %"class.boost::thread_exception"*
  %2 = load %"class.boost::thread_resource_error"** %.addr, align 4
  %3 = bitcast %"class.boost::thread_resource_error"* %2 to %"class.boost::thread_exception"*
  call void @_ZN5boost16thread_exceptionC2ERKS0_(%"class.boost::thread_exception"* %1, %"class.boost::thread_exception"* %3)
  %4 = bitcast %"class.boost::thread_resource_error"* %this1 to i8***
  store i8** getelementptr inbounds ([5 x i8*]* @_ZTVN5boost21thread_resource_errorE, i64 0, i64 2), i8*** %4
  ret void
}

define linkonce_odr void @_ZN5boost9exceptionC2ERKS0_(%"class.boost::exception"* %this, %"class.boost::exception"*) unnamed_addr inlinehint align 2 {
entry:
  %this.addr = alloca %"class.boost::exception"*, align 4
  %.addr = alloca %"class.boost::exception"*, align 4
  store %"class.boost::exception"* %this, %"class.boost::exception"** %this.addr, align 4
  store %"class.boost::exception"* %0, %"class.boost::exception"** %.addr, align 4
  %this1 = load %"class.boost::exception"** %this.addr
  %1 = bitcast %"class.boost::exception"* %this1 to i8***
  store i8** getelementptr inbounds ([4 x i8*]* @_ZTVN5boost9exceptionE, i64 0, i64 2), i8*** %1
  %data_ = getelementptr inbounds %"class.boost::exception"* %this1, i32 0, i32 1
  %2 = load %"class.boost::exception"** %.addr, align 4
  %data_2 = getelementptr inbounds %"class.boost::exception"* %2, i32 0, i32 1
  call void @_ZN5boost16exception_detail12refcount_ptrINS0_20error_info_containerEEC1ERKS3_(%"class.boost::exception_detail::refcount_ptr"* %data_, %"class.boost::exception_detail::refcount_ptr"* %data_2)
  %throw_function_ = getelementptr inbounds %"class.boost::exception"* %this1, i32 0, i32 2
  %3 = load %"class.boost::exception"** %.addr, align 4
  %throw_function_3 = getelementptr inbounds %"class.boost::exception"* %3, i32 0, i32 2
  %4 = load i8** %throw_function_3, align 4
  store i8* %4, i8** %throw_function_, align 4
  %throw_file_ = getelementptr inbounds %"class.boost::exception"* %this1, i32 0, i32 3
  %5 = load %"class.boost::exception"** %.addr, align 4
  %throw_file_4 = getelementptr inbounds %"class.boost::exception"* %5, i32 0, i32 3
  %6 = load i8** %throw_file_4, align 4
  store i8* %6, i8** %throw_file_, align 4
  %throw_line_ = getelementptr inbounds %"class.boost::exception"* %this1, i32 0, i32 4
  %7 = load %"class.boost::exception"** %.addr, align 4
  %throw_line_5 = getelementptr inbounds %"class.boost::exception"* %7, i32 0, i32 4
  %8 = load i32* %throw_line_5, align 4
  store i32 %8, i32* %throw_line_, align 4
  ret void
}

define linkonce_odr void @_ZN5boost16exception_detail19error_info_injectorINS_21thread_resource_errorEED0Ev(%"struct.boost::exception_detail::error_info_injector"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"struct.boost::exception_detail::error_info_injector"*, align 4
  store %"struct.boost::exception_detail::error_info_injector"* %this, %"struct.boost::exception_detail::error_info_injector"** %this.addr, align 4
  %this1 = load %"struct.boost::exception_detail::error_info_injector"** %this.addr
  call void @_ZN5boost16exception_detail19error_info_injectorINS_21thread_resource_errorEED1Ev(%"struct.boost::exception_detail::error_info_injector"* %this1) nounwind
  %0 = bitcast %"struct.boost::exception_detail::error_info_injector"* %this1 to i8*
  call void @_ZdlPv(i8* %0) nounwind
  ret void
}

define linkonce_odr void @_ZThn20_N5boost16exception_detail19error_info_injectorINS_21thread_resource_errorEED0Ev(%"struct.boost::exception_detail::error_info_injector"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"struct.boost::exception_detail::error_info_injector"*, align 4
  store %"struct.boost::exception_detail::error_info_injector"* %this, %"struct.boost::exception_detail::error_info_injector"** %this.addr, align 4
  %this1 = load %"struct.boost::exception_detail::error_info_injector"** %this.addr
  %0 = bitcast %"struct.boost::exception_detail::error_info_injector"* %this1 to i8*
  %1 = getelementptr inbounds i8* %0, i64 -20
  %2 = bitcast i8* %1 to %"struct.boost::exception_detail::error_info_injector"*
  call void @_ZN5boost16exception_detail19error_info_injectorINS_21thread_resource_errorEED0Ev(%"struct.boost::exception_detail::error_info_injector"* %2) nounwind
  ret void
}

define linkonce_odr void @_ZN5boost16exception_detail12refcount_ptrINS0_20error_info_containerEEC1ERKS3_(%"class.boost::exception_detail::refcount_ptr"* %this, %"class.boost::exception_detail::refcount_ptr"* %x) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::exception_detail::refcount_ptr"*, align 4
  %x.addr = alloca %"class.boost::exception_detail::refcount_ptr"*, align 4
  store %"class.boost::exception_detail::refcount_ptr"* %this, %"class.boost::exception_detail::refcount_ptr"** %this.addr, align 4
  store %"class.boost::exception_detail::refcount_ptr"* %x, %"class.boost::exception_detail::refcount_ptr"** %x.addr, align 4
  %this1 = load %"class.boost::exception_detail::refcount_ptr"** %this.addr
  %0 = load %"class.boost::exception_detail::refcount_ptr"** %x.addr
  call void @_ZN5boost16exception_detail12refcount_ptrINS0_20error_info_containerEEC2ERKS3_(%"class.boost::exception_detail::refcount_ptr"* %this1, %"class.boost::exception_detail::refcount_ptr"* %0)
  ret void
}

define linkonce_odr void @_ZN5boost16exception_detail12refcount_ptrINS0_20error_info_containerEEC2ERKS3_(%"class.boost::exception_detail::refcount_ptr"* %this, %"class.boost::exception_detail::refcount_ptr"* %x) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::exception_detail::refcount_ptr"*, align 4
  %x.addr = alloca %"class.boost::exception_detail::refcount_ptr"*, align 4
  store %"class.boost::exception_detail::refcount_ptr"* %this, %"class.boost::exception_detail::refcount_ptr"** %this.addr, align 4
  store %"class.boost::exception_detail::refcount_ptr"* %x, %"class.boost::exception_detail::refcount_ptr"** %x.addr, align 4
  %this1 = load %"class.boost::exception_detail::refcount_ptr"** %this.addr
  %px_ = getelementptr inbounds %"class.boost::exception_detail::refcount_ptr"* %this1, i32 0, i32 0
  %0 = load %"class.boost::exception_detail::refcount_ptr"** %x.addr, align 4
  %px_2 = getelementptr inbounds %"class.boost::exception_detail::refcount_ptr"* %0, i32 0, i32 0
  %1 = load %"struct.boost::exception_detail::error_info_container"** %px_2, align 4
  store %"struct.boost::exception_detail::error_info_container"* %1, %"struct.boost::exception_detail::error_info_container"** %px_, align 4
  call void @_ZN5boost16exception_detail12refcount_ptrINS0_20error_info_containerEE7add_refEv(%"class.boost::exception_detail::refcount_ptr"* %this1)
  ret void
}

define linkonce_odr void @_ZN5boost16exception_detail12refcount_ptrINS0_20error_info_containerEE7add_refEv(%"class.boost::exception_detail::refcount_ptr"* %this) align 2 {
entry:
  %this.addr = alloca %"class.boost::exception_detail::refcount_ptr"*, align 4
  store %"class.boost::exception_detail::refcount_ptr"* %this, %"class.boost::exception_detail::refcount_ptr"** %this.addr, align 4
  %this1 = load %"class.boost::exception_detail::refcount_ptr"** %this.addr
  %px_ = getelementptr inbounds %"class.boost::exception_detail::refcount_ptr"* %this1, i32 0, i32 0
  %0 = load %"struct.boost::exception_detail::error_info_container"** %px_, align 4
  %tobool = icmp ne %"struct.boost::exception_detail::error_info_container"* %0, null
  br i1 %tobool, label %if.then, label %if.end

if.then:                                          ; preds = %entry
  %px_2 = getelementptr inbounds %"class.boost::exception_detail::refcount_ptr"* %this1, i32 0, i32 0
  %1 = load %"struct.boost::exception_detail::error_info_container"** %px_2, align 4
  %2 = bitcast %"struct.boost::exception_detail::error_info_container"* %1 to void (%"struct.boost::exception_detail::error_info_container"*)***
  %vtable = load void (%"struct.boost::exception_detail::error_info_container"*)*** %2
  %vfn = getelementptr inbounds void (%"struct.boost::exception_detail::error_info_container"*)** %vtable, i64 3
  %3 = load void (%"struct.boost::exception_detail::error_info_container"*)** %vfn
  call void %3(%"struct.boost::exception_detail::error_info_container"* %1)
  br label %if.end

if.end:                                           ; preds = %if.then, %entry
  ret void
}

define linkonce_odr void @_ZN5boost16thread_exceptionC2ERKS0_(%"class.boost::thread_exception"* %this, %"class.boost::thread_exception"*) unnamed_addr inlinehint align 2 {
entry:
  %this.addr = alloca %"class.boost::thread_exception"*, align 4
  %.addr = alloca %"class.boost::thread_exception"*, align 4
  store %"class.boost::thread_exception"* %this, %"class.boost::thread_exception"** %this.addr, align 4
  store %"class.boost::thread_exception"* %0, %"class.boost::thread_exception"** %.addr, align 4
  %this1 = load %"class.boost::thread_exception"** %this.addr
  %1 = bitcast %"class.boost::thread_exception"* %this1 to %"class.boost::system::system_error"*
  %2 = load %"class.boost::thread_exception"** %.addr, align 4
  %3 = bitcast %"class.boost::thread_exception"* %2 to %"class.boost::system::system_error"*
  call void @_ZN5boost6system12system_errorC2ERKS1_(%"class.boost::system::system_error"* %1, %"class.boost::system::system_error"* %3)
  %4 = bitcast %"class.boost::thread_exception"* %this1 to i8***
  store i8** getelementptr inbounds ([5 x i8*]* @_ZTVN5boost16thread_exceptionE, i64 0, i64 2), i8*** %4
  ret void
}

define linkonce_odr void @_ZN5boost6system12system_errorC2ERKS1_(%"class.boost::system::system_error"* %this, %"class.boost::system::system_error"*) unnamed_addr inlinehint align 2 {
entry:
  %this.addr = alloca %"class.boost::system::system_error"*, align 4
  %.addr = alloca %"class.boost::system::system_error"*, align 4
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  store %"class.boost::system::system_error"* %this, %"class.boost::system::system_error"** %this.addr, align 4
  store %"class.boost::system::system_error"* %0, %"class.boost::system::system_error"** %.addr, align 4
  %this1 = load %"class.boost::system::system_error"** %this.addr
  %1 = bitcast %"class.boost::system::system_error"* %this1 to %"class.std::runtime_error"*
  %2 = load %"class.boost::system::system_error"** %.addr, align 4
  %3 = bitcast %"class.boost::system::system_error"* %2 to %"class.std::runtime_error"*
  call void @_ZNSt13runtime_errorC2ERKS_(%"class.std::runtime_error"* %1, %"class.std::runtime_error"* %3)
  %4 = bitcast %"class.boost::system::system_error"* %this1 to i8***
  store i8** getelementptr inbounds ([5 x i8*]* @_ZTVN5boost6system12system_errorE, i64 0, i64 2), i8*** %4
  %m_error_code = getelementptr inbounds %"class.boost::system::system_error"* %this1, i32 0, i32 1
  %5 = load %"class.boost::system::system_error"** %.addr, align 4
  %m_error_code2 = getelementptr inbounds %"class.boost::system::system_error"* %5, i32 0, i32 1
  %6 = bitcast %"class.boost::system::error_code"* %m_error_code to i8*
  %7 = bitcast %"class.boost::system::error_code"* %m_error_code2 to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %6, i8* %7, i32 8, i32 4, i1 false)
  %m_what = getelementptr inbounds %"class.boost::system::system_error"* %this1, i32 0, i32 2
  %8 = load %"class.boost::system::system_error"** %.addr, align 4
  %m_what3 = getelementptr inbounds %"class.boost::system::system_error"* %8, i32 0, i32 2
  invoke void @_ZNSsC1ERKSs(%"class.std::basic_string"* %m_what, %"class.std::basic_string"* %m_what3)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %entry
  ret void

lpad:                                             ; preds = %entry
  %9 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %10 = extractvalue { i8*, i32 } %9, 0
  store i8* %10, i8** %exn.slot
  %11 = extractvalue { i8*, i32 } %9, 1
  store i32 %11, i32* %ehselector.slot
  %12 = bitcast %"class.boost::system::system_error"* %this1 to %"class.std::runtime_error"*
  call void @_ZNSt13runtime_errorD2Ev(%"class.std::runtime_error"* %12) nounwind
  br label %eh.resume

eh.resume:                                        ; preds = %lpad
  %exn = load i8** %exn.slot
  %sel = load i32* %ehselector.slot
  %lpad.val = insertvalue { i8*, i32 } undef, i8* %exn, 0
  %lpad.val4 = insertvalue { i8*, i32 } %lpad.val, i32 %sel, 1
  resume { i8*, i32 } %lpad.val4
}

define linkonce_odr void @_ZNSt13runtime_errorC2ERKS_(%"class.std::runtime_error"* %this, %"class.std::runtime_error"*) unnamed_addr inlinehint align 2 {
entry:
  %this.addr = alloca %"class.std::runtime_error"*, align 4
  %.addr = alloca %"class.std::runtime_error"*, align 4
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  store %"class.std::runtime_error"* %this, %"class.std::runtime_error"** %this.addr, align 4
  store %"class.std::runtime_error"* %0, %"class.std::runtime_error"** %.addr, align 4
  %this1 = load %"class.std::runtime_error"** %this.addr
  %1 = bitcast %"class.std::runtime_error"* %this1 to %"class.std::exception"*
  %2 = load %"class.std::runtime_error"** %.addr, align 4
  %3 = bitcast %"class.std::runtime_error"* %2 to %"class.std::exception"*
  call void @_ZNSt9exceptionC2ERKS_(%"class.std::exception"* %1, %"class.std::exception"* %3) nounwind
  %4 = bitcast %"class.std::runtime_error"* %this1 to i8***
  store i8** getelementptr inbounds ([5 x i8*]* @_ZTVSt13runtime_error, i64 0, i64 2), i8*** %4
  %_M_msg = getelementptr inbounds %"class.std::runtime_error"* %this1, i32 0, i32 1
  %5 = load %"class.std::runtime_error"** %.addr, align 4
  %_M_msg2 = getelementptr inbounds %"class.std::runtime_error"* %5, i32 0, i32 1
  invoke void @_ZNSsC1ERKSs(%"class.std::basic_string"* %_M_msg, %"class.std::basic_string"* %_M_msg2)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %entry
  ret void

lpad:                                             ; preds = %entry
  %6 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %7 = extractvalue { i8*, i32 } %6, 0
  store i8* %7, i8** %exn.slot
  %8 = extractvalue { i8*, i32 } %6, 1
  store i32 %8, i32* %ehselector.slot
  %9 = bitcast %"class.std::runtime_error"* %this1 to %"class.std::exception"*
  call void @_ZNSt9exceptionD2Ev(%"class.std::exception"* %9) nounwind
  br label %eh.resume

eh.resume:                                        ; preds = %lpad
  %exn = load i8** %exn.slot
  %sel = load i32* %ehselector.slot
  %lpad.val = insertvalue { i8*, i32 } undef, i8* %exn, 0
  %lpad.val3 = insertvalue { i8*, i32 } %lpad.val, i32 %sel, 1
  resume { i8*, i32 } %lpad.val3
}

declare void @_ZNSsC1ERKSs(%"class.std::basic_string"*, %"class.std::basic_string"*)

define linkonce_odr void @_ZNSt9exceptionC2ERKS_(%"class.std::exception"* %this, %"class.std::exception"*) unnamed_addr nounwind inlinehint align 2 {
entry:
  %this.addr = alloca %"class.std::exception"*, align 4
  %.addr = alloca %"class.std::exception"*, align 4
  store %"class.std::exception"* %this, %"class.std::exception"** %this.addr, align 4
  store %"class.std::exception"* %0, %"class.std::exception"** %.addr, align 4
  %this1 = load %"class.std::exception"** %this.addr
  %1 = bitcast %"class.std::exception"* %this1 to i8***
  store i8** getelementptr inbounds ([5 x i8*]* @_ZTVSt9exception, i64 0, i64 2), i8*** %1
  ret void
}

declare void @_ZNSt9exceptionD2Ev(%"class.std::exception"*) nounwind

define linkonce_odr void @_ZN5boost16exception_detail10clone_baseD1Ev(%"class.boost::exception_detail::clone_base"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::exception_detail::clone_base"*, align 4
  store %"class.boost::exception_detail::clone_base"* %this, %"class.boost::exception_detail::clone_base"** %this.addr, align 4
  %this1 = load %"class.boost::exception_detail::clone_base"** %this.addr
  call void @_ZN5boost16exception_detail10clone_baseD2Ev(%"class.boost::exception_detail::clone_base"* %this1) nounwind
  ret void
}

define linkonce_odr void @_ZN5boost16exception_detail10clone_baseD0Ev(%"class.boost::exception_detail::clone_base"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::exception_detail::clone_base"*, align 4
  store %"class.boost::exception_detail::clone_base"* %this, %"class.boost::exception_detail::clone_base"** %this.addr, align 4
  %this1 = load %"class.boost::exception_detail::clone_base"** %this.addr
  call void @_ZN5boost16exception_detail10clone_baseD1Ev(%"class.boost::exception_detail::clone_base"* %this1) nounwind
  %0 = bitcast %"class.boost::exception_detail::clone_base"* %this1 to i8*
  call void @_ZdlPv(i8* %0) nounwind
  ret void
}

define linkonce_odr void @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_21thread_resource_errorEEEEC1ERKS5_NS5_9clone_tagE(%"class.boost::exception_detail::clone_impl"* %this, %"class.boost::exception_detail::clone_impl"* %x) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::exception_detail::clone_impl"*, align 4
  %x.addr = alloca %"class.boost::exception_detail::clone_impl"*, align 4
  %0 = alloca %"struct.boost::exception_detail::clone_impl<boost::exception_detail::error_info_injector<boost::thread_resource_error> >::clone_tag", align 1
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  store %"class.boost::exception_detail::clone_impl"* %this, %"class.boost::exception_detail::clone_impl"** %this.addr, align 4
  store %"class.boost::exception_detail::clone_impl"* %x, %"class.boost::exception_detail::clone_impl"** %x.addr, align 4
  %this1 = load %"class.boost::exception_detail::clone_impl"** %this.addr
  %1 = bitcast %"class.boost::exception_detail::clone_impl"* %this1 to i8*
  %2 = getelementptr inbounds i8* %1, i64 40
  %3 = bitcast i8* %2 to %"class.boost::exception_detail::clone_base"*
  call void @_ZN5boost16exception_detail10clone_baseC2Ev(%"class.boost::exception_detail::clone_base"* %3) nounwind
  %4 = bitcast %"class.boost::exception_detail::clone_impl"* %this1 to %"struct.boost::exception_detail::error_info_injector"*
  %5 = load %"class.boost::exception_detail::clone_impl"** %x.addr, align 4
  %6 = bitcast %"class.boost::exception_detail::clone_impl"* %5 to %"struct.boost::exception_detail::error_info_injector"*
  invoke void @_ZN5boost16exception_detail19error_info_injectorINS_21thread_resource_errorEEC2ERKS3_(%"struct.boost::exception_detail::error_info_injector"* %4, %"struct.boost::exception_detail::error_info_injector"* %6)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %entry
  %7 = bitcast %"class.boost::exception_detail::clone_impl"* %this1 to i8***
  store i8** getelementptr inbounds ([21 x i8*]* @_ZTVN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_21thread_resource_errorEEEEE, i64 0, i64 3), i8*** %7
  %8 = bitcast %"class.boost::exception_detail::clone_impl"* %this1 to i8*
  %add.ptr = getelementptr inbounds i8* %8, i32 20
  %9 = bitcast i8* %add.ptr to i8***
  store i8** getelementptr inbounds ([21 x i8*]* @_ZTVN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_21thread_resource_errorEEEEE, i64 0, i64 10), i8*** %9
  %10 = bitcast %"class.boost::exception_detail::clone_impl"* %this1 to i8*
  %add.ptr2 = getelementptr inbounds i8* %10, i32 40
  %11 = bitcast i8* %add.ptr2 to i8***
  store i8** getelementptr inbounds ([21 x i8*]* @_ZTVN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_21thread_resource_errorEEEEE, i64 0, i64 17), i8*** %11
  %12 = bitcast %"class.boost::exception_detail::clone_impl"* %this1 to i8*
  %add.ptr3 = getelementptr inbounds i8* %12, i32 20
  %13 = bitcast i8* %add.ptr3 to %"class.boost::exception"*
  %14 = load %"class.boost::exception_detail::clone_impl"** %x.addr, align 4
  %15 = icmp eq %"class.boost::exception_detail::clone_impl"* %14, null
  br i1 %15, label %cast.end, label %cast.notnull

cast.notnull:                                     ; preds = %invoke.cont
  %16 = bitcast %"class.boost::exception_detail::clone_impl"* %14 to i8*
  %add.ptr4 = getelementptr inbounds i8* %16, i32 20
  %17 = bitcast i8* %add.ptr4 to %"class.boost::exception"*
  br label %cast.end

cast.end:                                         ; preds = %cast.notnull, %invoke.cont
  %cast.result = phi %"class.boost::exception"* [ %17, %cast.notnull ], [ null, %invoke.cont ]
  invoke void @_ZN5boost16exception_detail20copy_boost_exceptionEPNS_9exceptionEPKS1_(%"class.boost::exception"* %13, %"class.boost::exception"* %cast.result)
          to label %invoke.cont6 unwind label %lpad5

invoke.cont6:                                     ; preds = %cast.end
  ret void

lpad:                                             ; preds = %entry
  %18 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %19 = extractvalue { i8*, i32 } %18, 0
  store i8* %19, i8** %exn.slot
  %20 = extractvalue { i8*, i32 } %18, 1
  store i32 %20, i32* %ehselector.slot
  br label %ehcleanup

lpad5:                                            ; preds = %cast.end
  %21 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %22 = extractvalue { i8*, i32 } %21, 0
  store i8* %22, i8** %exn.slot
  %23 = extractvalue { i8*, i32 } %21, 1
  store i32 %23, i32* %ehselector.slot
  %24 = bitcast %"class.boost::exception_detail::clone_impl"* %this1 to %"struct.boost::exception_detail::error_info_injector"*
  call void @_ZN5boost16exception_detail19error_info_injectorINS_21thread_resource_errorEED2Ev(%"struct.boost::exception_detail::error_info_injector"* %24) nounwind
  br label %ehcleanup

ehcleanup:                                        ; preds = %lpad5, %lpad
  %25 = bitcast %"class.boost::exception_detail::clone_impl"* %this1 to i8*
  %26 = getelementptr inbounds i8* %25, i64 40
  %27 = bitcast i8* %26 to %"class.boost::exception_detail::clone_base"*
  call void @_ZN5boost16exception_detail10clone_baseD2Ev(%"class.boost::exception_detail::clone_base"* %27) nounwind
  br label %eh.resume

eh.resume:                                        ; preds = %ehcleanup
  %exn = load i8** %exn.slot
  %sel = load i32* %ehselector.slot
  %lpad.val = insertvalue { i8*, i32 } undef, i8* %exn, 0
  %lpad.val7 = insertvalue { i8*, i32 } %lpad.val, i32 %sel, 1
  resume { i8*, i32 } %lpad.val7
}

define linkonce_odr void @_ZN5boost16exception_detail10clone_baseC2Ev(%"class.boost::exception_detail::clone_base"* %this) unnamed_addr nounwind inlinehint align 2 {
entry:
  %this.addr = alloca %"class.boost::exception_detail::clone_base"*, align 4
  store %"class.boost::exception_detail::clone_base"* %this, %"class.boost::exception_detail::clone_base"** %this.addr, align 4
  %this1 = load %"class.boost::exception_detail::clone_base"** %this.addr
  %0 = bitcast %"class.boost::exception_detail::clone_base"* %this1 to i8***
  store i8** getelementptr inbounds ([6 x i8*]* @_ZTVN5boost16exception_detail10clone_baseE, i64 0, i64 2), i8*** %0
  ret void
}

define linkonce_odr void @_ZN5boost16exception_detail20copy_boost_exceptionEPNS_9exceptionEPKS1_(%"class.boost::exception"* %a, %"class.boost::exception"* %b) inlinehint {
entry:
  %a.addr = alloca %"class.boost::exception"*, align 4
  %b.addr = alloca %"class.boost::exception"*, align 4
  %data = alloca %"class.boost::exception_detail::refcount_ptr", align 4
  %d = alloca %"struct.boost::exception_detail::error_info_container"*, align 4
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  %ref.tmp = alloca %"class.boost::exception_detail::refcount_ptr", align 4
  store %"class.boost::exception"* %a, %"class.boost::exception"** %a.addr, align 4
  store %"class.boost::exception"* %b, %"class.boost::exception"** %b.addr, align 4
  call void @_ZN5boost16exception_detail12refcount_ptrINS0_20error_info_containerEEC1Ev(%"class.boost::exception_detail::refcount_ptr"* %data)
  %0 = load %"class.boost::exception"** %b.addr, align 4
  %data_ = getelementptr inbounds %"class.boost::exception"* %0, i32 0, i32 1
  %call = invoke %"struct.boost::exception_detail::error_info_container"* @_ZNK5boost16exception_detail12refcount_ptrINS0_20error_info_containerEE3getEv(%"class.boost::exception_detail::refcount_ptr"* %data_)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %entry
  store %"struct.boost::exception_detail::error_info_container"* %call, %"struct.boost::exception_detail::error_info_container"** %d, align 4
  %1 = load %"struct.boost::exception_detail::error_info_container"** %d, align 4
  %tobool = icmp ne %"struct.boost::exception_detail::error_info_container"* %1, null
  br i1 %tobool, label %if.then, label %if.end

if.then:                                          ; preds = %invoke.cont
  %2 = load %"struct.boost::exception_detail::error_info_container"** %d, align 4
  %3 = bitcast %"struct.boost::exception_detail::error_info_container"* %2 to void (%"class.boost::exception_detail::refcount_ptr"*, %"struct.boost::exception_detail::error_info_container"*)***
  %vtable = load void (%"class.boost::exception_detail::refcount_ptr"*, %"struct.boost::exception_detail::error_info_container"*)*** %3
  %vfn = getelementptr inbounds void (%"class.boost::exception_detail::refcount_ptr"*, %"struct.boost::exception_detail::error_info_container"*)** %vtable, i64 5
  %4 = load void (%"class.boost::exception_detail::refcount_ptr"*, %"struct.boost::exception_detail::error_info_container"*)** %vfn
  invoke void %4(%"class.boost::exception_detail::refcount_ptr"* sret %ref.tmp, %"struct.boost::exception_detail::error_info_container"* %2)
          to label %invoke.cont1 unwind label %lpad

invoke.cont1:                                     ; preds = %if.then
  %call4 = invoke %"class.boost::exception_detail::refcount_ptr"* @_ZN5boost16exception_detail12refcount_ptrINS0_20error_info_containerEEaSERKS3_(%"class.boost::exception_detail::refcount_ptr"* %data, %"class.boost::exception_detail::refcount_ptr"* %ref.tmp)
          to label %invoke.cont3 unwind label %lpad2

invoke.cont3:                                     ; preds = %invoke.cont1
  invoke void @_ZN5boost16exception_detail12refcount_ptrINS0_20error_info_containerEED1Ev(%"class.boost::exception_detail::refcount_ptr"* %ref.tmp)
          to label %invoke.cont5 unwind label %lpad

invoke.cont5:                                     ; preds = %invoke.cont3
  br label %if.end

lpad:                                             ; preds = %if.end, %invoke.cont3, %if.then, %entry
  %5 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %6 = extractvalue { i8*, i32 } %5, 0
  store i8* %6, i8** %exn.slot
  %7 = extractvalue { i8*, i32 } %5, 1
  store i32 %7, i32* %ehselector.slot
  br label %ehcleanup

lpad2:                                            ; preds = %invoke.cont1
  %8 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %9 = extractvalue { i8*, i32 } %8, 0
  store i8* %9, i8** %exn.slot
  %10 = extractvalue { i8*, i32 } %8, 1
  store i32 %10, i32* %ehselector.slot
  invoke void @_ZN5boost16exception_detail12refcount_ptrINS0_20error_info_containerEED1Ev(%"class.boost::exception_detail::refcount_ptr"* %ref.tmp)
          to label %invoke.cont6 unwind label %terminate.lpad

invoke.cont6:                                     ; preds = %lpad2
  br label %ehcleanup

if.end:                                           ; preds = %invoke.cont5, %invoke.cont
  %11 = load %"class.boost::exception"** %b.addr, align 4
  %throw_file_ = getelementptr inbounds %"class.boost::exception"* %11, i32 0, i32 3
  %12 = load i8** %throw_file_, align 4
  %13 = load %"class.boost::exception"** %a.addr, align 4
  %throw_file_7 = getelementptr inbounds %"class.boost::exception"* %13, i32 0, i32 3
  store i8* %12, i8** %throw_file_7, align 4
  %14 = load %"class.boost::exception"** %b.addr, align 4
  %throw_line_ = getelementptr inbounds %"class.boost::exception"* %14, i32 0, i32 4
  %15 = load i32* %throw_line_, align 4
  %16 = load %"class.boost::exception"** %a.addr, align 4
  %throw_line_8 = getelementptr inbounds %"class.boost::exception"* %16, i32 0, i32 4
  store i32 %15, i32* %throw_line_8, align 4
  %17 = load %"class.boost::exception"** %b.addr, align 4
  %throw_function_ = getelementptr inbounds %"class.boost::exception"* %17, i32 0, i32 2
  %18 = load i8** %throw_function_, align 4
  %19 = load %"class.boost::exception"** %a.addr, align 4
  %throw_function_9 = getelementptr inbounds %"class.boost::exception"* %19, i32 0, i32 2
  store i8* %18, i8** %throw_function_9, align 4
  %20 = load %"class.boost::exception"** %a.addr, align 4
  %data_10 = getelementptr inbounds %"class.boost::exception"* %20, i32 0, i32 1
  %call12 = invoke %"class.boost::exception_detail::refcount_ptr"* @_ZN5boost16exception_detail12refcount_ptrINS0_20error_info_containerEEaSERKS3_(%"class.boost::exception_detail::refcount_ptr"* %data_10, %"class.boost::exception_detail::refcount_ptr"* %data)
          to label %invoke.cont11 unwind label %lpad

invoke.cont11:                                    ; preds = %if.end
  call void @_ZN5boost16exception_detail12refcount_ptrINS0_20error_info_containerEED1Ev(%"class.boost::exception_detail::refcount_ptr"* %data)
  ret void

ehcleanup:                                        ; preds = %invoke.cont6, %lpad
  invoke void @_ZN5boost16exception_detail12refcount_ptrINS0_20error_info_containerEED1Ev(%"class.boost::exception_detail::refcount_ptr"* %data)
          to label %invoke.cont13 unwind label %terminate.lpad

invoke.cont13:                                    ; preds = %ehcleanup
  br label %eh.resume

eh.resume:                                        ; preds = %invoke.cont13
  %exn = load i8** %exn.slot
  %sel = load i32* %ehselector.slot
  %lpad.val = insertvalue { i8*, i32 } undef, i8* %exn, 0
  %lpad.val14 = insertvalue { i8*, i32 } %lpad.val, i32 %sel, 1
  resume { i8*, i32 } %lpad.val14

terminate.lpad:                                   ; preds = %ehcleanup, %lpad2
  %21 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          catch i8* null
  call void @_ZSt9terminatev() noreturn nounwind
  unreachable
}

define linkonce_odr void @_ZN5boost16exception_detail12refcount_ptrINS0_20error_info_containerEEC1Ev(%"class.boost::exception_detail::refcount_ptr"* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::exception_detail::refcount_ptr"*, align 4
  store %"class.boost::exception_detail::refcount_ptr"* %this, %"class.boost::exception_detail::refcount_ptr"** %this.addr, align 4
  %this1 = load %"class.boost::exception_detail::refcount_ptr"** %this.addr
  call void @_ZN5boost16exception_detail12refcount_ptrINS0_20error_info_containerEEC2Ev(%"class.boost::exception_detail::refcount_ptr"* %this1)
  ret void
}

define linkonce_odr %"struct.boost::exception_detail::error_info_container"* @_ZNK5boost16exception_detail12refcount_ptrINS0_20error_info_containerEE3getEv(%"class.boost::exception_detail::refcount_ptr"* %this) nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::exception_detail::refcount_ptr"*, align 4
  store %"class.boost::exception_detail::refcount_ptr"* %this, %"class.boost::exception_detail::refcount_ptr"** %this.addr, align 4
  %this1 = load %"class.boost::exception_detail::refcount_ptr"** %this.addr
  %px_ = getelementptr inbounds %"class.boost::exception_detail::refcount_ptr"* %this1, i32 0, i32 0
  %0 = load %"struct.boost::exception_detail::error_info_container"** %px_, align 4
  ret %"struct.boost::exception_detail::error_info_container"* %0
}

define linkonce_odr %"class.boost::exception_detail::refcount_ptr"* @_ZN5boost16exception_detail12refcount_ptrINS0_20error_info_containerEEaSERKS3_(%"class.boost::exception_detail::refcount_ptr"* %this, %"class.boost::exception_detail::refcount_ptr"* %x) align 2 {
entry:
  %this.addr = alloca %"class.boost::exception_detail::refcount_ptr"*, align 4
  %x.addr = alloca %"class.boost::exception_detail::refcount_ptr"*, align 4
  store %"class.boost::exception_detail::refcount_ptr"* %this, %"class.boost::exception_detail::refcount_ptr"** %this.addr, align 4
  store %"class.boost::exception_detail::refcount_ptr"* %x, %"class.boost::exception_detail::refcount_ptr"** %x.addr, align 4
  %this1 = load %"class.boost::exception_detail::refcount_ptr"** %this.addr
  %0 = load %"class.boost::exception_detail::refcount_ptr"** %x.addr, align 4
  %px_ = getelementptr inbounds %"class.boost::exception_detail::refcount_ptr"* %0, i32 0, i32 0
  %1 = load %"struct.boost::exception_detail::error_info_container"** %px_, align 4
  call void @_ZN5boost16exception_detail12refcount_ptrINS0_20error_info_containerEE5adoptEPS2_(%"class.boost::exception_detail::refcount_ptr"* %this1, %"struct.boost::exception_detail::error_info_container"* %1)
  ret %"class.boost::exception_detail::refcount_ptr"* %this1
}

define linkonce_odr void @_ZN5boost16exception_detail12refcount_ptrINS0_20error_info_containerEE5adoptEPS2_(%"class.boost::exception_detail::refcount_ptr"* %this, %"struct.boost::exception_detail::error_info_container"* %px) align 2 {
entry:
  %this.addr = alloca %"class.boost::exception_detail::refcount_ptr"*, align 4
  %px.addr = alloca %"struct.boost::exception_detail::error_info_container"*, align 4
  store %"class.boost::exception_detail::refcount_ptr"* %this, %"class.boost::exception_detail::refcount_ptr"** %this.addr, align 4
  store %"struct.boost::exception_detail::error_info_container"* %px, %"struct.boost::exception_detail::error_info_container"** %px.addr, align 4
  %this1 = load %"class.boost::exception_detail::refcount_ptr"** %this.addr
  call void @_ZN5boost16exception_detail12refcount_ptrINS0_20error_info_containerEE7releaseEv(%"class.boost::exception_detail::refcount_ptr"* %this1)
  %0 = load %"struct.boost::exception_detail::error_info_container"** %px.addr, align 4
  %px_ = getelementptr inbounds %"class.boost::exception_detail::refcount_ptr"* %this1, i32 0, i32 0
  store %"struct.boost::exception_detail::error_info_container"* %0, %"struct.boost::exception_detail::error_info_container"** %px_, align 4
  call void @_ZN5boost16exception_detail12refcount_ptrINS0_20error_info_containerEE7add_refEv(%"class.boost::exception_detail::refcount_ptr"* %this1)
  ret void
}

define linkonce_odr void @_ZN5boost16exception_detail12refcount_ptrINS0_20error_info_containerEEC2Ev(%"class.boost::exception_detail::refcount_ptr"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::exception_detail::refcount_ptr"*, align 4
  store %"class.boost::exception_detail::refcount_ptr"* %this, %"class.boost::exception_detail::refcount_ptr"** %this.addr, align 4
  %this1 = load %"class.boost::exception_detail::refcount_ptr"** %this.addr
  %px_ = getelementptr inbounds %"class.boost::exception_detail::refcount_ptr"* %this1, i32 0, i32 0
  store %"struct.boost::exception_detail::error_info_container"* null, %"struct.boost::exception_detail::error_info_container"** %px_, align 4
  ret void
}

define linkonce_odr void @_ZN5boost16exception_detail19error_info_injectorINS_21thread_resource_errorEEC1ERKS2_(%"struct.boost::exception_detail::error_info_injector"* %this, %"class.boost::thread_resource_error"* %x) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"struct.boost::exception_detail::error_info_injector"*, align 4
  %x.addr = alloca %"class.boost::thread_resource_error"*, align 4
  store %"struct.boost::exception_detail::error_info_injector"* %this, %"struct.boost::exception_detail::error_info_injector"** %this.addr, align 4
  store %"class.boost::thread_resource_error"* %x, %"class.boost::thread_resource_error"** %x.addr, align 4
  %this1 = load %"struct.boost::exception_detail::error_info_injector"** %this.addr
  %0 = load %"class.boost::thread_resource_error"** %x.addr
  call void @_ZN5boost16exception_detail19error_info_injectorINS_21thread_resource_errorEEC2ERKS2_(%"struct.boost::exception_detail::error_info_injector"* %this1, %"class.boost::thread_resource_error"* %0)
  ret void
}

define linkonce_odr void @_ZN5boost16exception_detail19error_info_injectorINS_21thread_resource_errorEEC2ERKS2_(%"struct.boost::exception_detail::error_info_injector"* %this, %"class.boost::thread_resource_error"* %x) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"struct.boost::exception_detail::error_info_injector"*, align 4
  %x.addr = alloca %"class.boost::thread_resource_error"*, align 4
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  store %"struct.boost::exception_detail::error_info_injector"* %this, %"struct.boost::exception_detail::error_info_injector"** %this.addr, align 4
  store %"class.boost::thread_resource_error"* %x, %"class.boost::thread_resource_error"** %x.addr, align 4
  %this1 = load %"struct.boost::exception_detail::error_info_injector"** %this.addr
  %0 = bitcast %"struct.boost::exception_detail::error_info_injector"* %this1 to %"class.boost::thread_resource_error"*
  %1 = load %"class.boost::thread_resource_error"** %x.addr, align 4
  call void @_ZN5boost21thread_resource_errorC2ERKS0_(%"class.boost::thread_resource_error"* %0, %"class.boost::thread_resource_error"* %1)
  %2 = bitcast %"struct.boost::exception_detail::error_info_injector"* %this1 to i8*
  %3 = getelementptr inbounds i8* %2, i64 20
  %4 = bitcast i8* %3 to %"class.boost::exception"*
  invoke void @_ZN5boost9exceptionC2Ev(%"class.boost::exception"* %4)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %entry
  %5 = bitcast %"struct.boost::exception_detail::error_info_injector"* %this1 to i8***
  store i8** getelementptr inbounds ([9 x i8*]* @_ZTVN5boost16exception_detail19error_info_injectorINS_21thread_resource_errorEEE, i64 0, i64 2), i8*** %5
  %6 = bitcast %"struct.boost::exception_detail::error_info_injector"* %this1 to i8*
  %add.ptr = getelementptr inbounds i8* %6, i32 20
  %7 = bitcast i8* %add.ptr to i8***
  store i8** getelementptr inbounds ([9 x i8*]* @_ZTVN5boost16exception_detail19error_info_injectorINS_21thread_resource_errorEEE, i64 0, i64 7), i8*** %7
  ret void

lpad:                                             ; preds = %entry
  %8 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %9 = extractvalue { i8*, i32 } %8, 0
  store i8* %9, i8** %exn.slot
  %10 = extractvalue { i8*, i32 } %8, 1
  store i32 %10, i32* %ehselector.slot
  %11 = bitcast %"struct.boost::exception_detail::error_info_injector"* %this1 to %"class.boost::thread_resource_error"*
  call void @_ZN5boost21thread_resource_errorD2Ev(%"class.boost::thread_resource_error"* %11) nounwind
  br label %eh.resume

eh.resume:                                        ; preds = %lpad
  %exn = load i8** %exn.slot
  %sel = load i32* %ehselector.slot
  %lpad.val = insertvalue { i8*, i32 } undef, i8* %exn, 0
  %lpad.val2 = insertvalue { i8*, i32 } %lpad.val, i32 %sel, 1
  resume { i8*, i32 } %lpad.val2
}

define linkonce_odr void @_ZN5boost9exceptionC2Ev(%"class.boost::exception"* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::exception"*, align 4
  store %"class.boost::exception"* %this, %"class.boost::exception"** %this.addr, align 4
  %this1 = load %"class.boost::exception"** %this.addr
  %0 = bitcast %"class.boost::exception"* %this1 to i8***
  store i8** getelementptr inbounds ([4 x i8*]* @_ZTVN5boost9exceptionE, i64 0, i64 2), i8*** %0
  %data_ = getelementptr inbounds %"class.boost::exception"* %this1, i32 0, i32 1
  call void @_ZN5boost16exception_detail12refcount_ptrINS0_20error_info_containerEEC1Ev(%"class.boost::exception_detail::refcount_ptr"* %data_)
  %throw_function_ = getelementptr inbounds %"class.boost::exception"* %this1, i32 0, i32 2
  store i8* null, i8** %throw_function_, align 4
  %throw_file_ = getelementptr inbounds %"class.boost::exception"* %this1, i32 0, i32 3
  store i8* null, i8** %throw_file_, align 4
  %throw_line_ = getelementptr inbounds %"class.boost::exception"* %this1, i32 0, i32 4
  store i32 -1, i32* %throw_line_, align 4
  ret void
}

define linkonce_odr void @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_21thread_resource_errorEEEEC1ERKS4_(%"class.boost::exception_detail::clone_impl"* %this, %"struct.boost::exception_detail::error_info_injector"* %x) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::exception_detail::clone_impl"*, align 4
  %x.addr = alloca %"struct.boost::exception_detail::error_info_injector"*, align 4
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  store %"class.boost::exception_detail::clone_impl"* %this, %"class.boost::exception_detail::clone_impl"** %this.addr, align 4
  store %"struct.boost::exception_detail::error_info_injector"* %x, %"struct.boost::exception_detail::error_info_injector"** %x.addr, align 4
  %this1 = load %"class.boost::exception_detail::clone_impl"** %this.addr
  %0 = bitcast %"class.boost::exception_detail::clone_impl"* %this1 to i8*
  %1 = getelementptr inbounds i8* %0, i64 40
  %2 = bitcast i8* %1 to %"class.boost::exception_detail::clone_base"*
  call void @_ZN5boost16exception_detail10clone_baseC2Ev(%"class.boost::exception_detail::clone_base"* %2) nounwind
  %3 = bitcast %"class.boost::exception_detail::clone_impl"* %this1 to %"struct.boost::exception_detail::error_info_injector"*
  %4 = load %"struct.boost::exception_detail::error_info_injector"** %x.addr, align 4
  invoke void @_ZN5boost16exception_detail19error_info_injectorINS_21thread_resource_errorEEC2ERKS3_(%"struct.boost::exception_detail::error_info_injector"* %3, %"struct.boost::exception_detail::error_info_injector"* %4)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %entry
  %5 = bitcast %"class.boost::exception_detail::clone_impl"* %this1 to i8***
  store i8** getelementptr inbounds ([21 x i8*]* @_ZTVN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_21thread_resource_errorEEEEE, i64 0, i64 3), i8*** %5
  %6 = bitcast %"class.boost::exception_detail::clone_impl"* %this1 to i8*
  %add.ptr = getelementptr inbounds i8* %6, i32 20
  %7 = bitcast i8* %add.ptr to i8***
  store i8** getelementptr inbounds ([21 x i8*]* @_ZTVN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_21thread_resource_errorEEEEE, i64 0, i64 10), i8*** %7
  %8 = bitcast %"class.boost::exception_detail::clone_impl"* %this1 to i8*
  %add.ptr2 = getelementptr inbounds i8* %8, i32 40
  %9 = bitcast i8* %add.ptr2 to i8***
  store i8** getelementptr inbounds ([21 x i8*]* @_ZTVN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_21thread_resource_errorEEEEE, i64 0, i64 17), i8*** %9
  %10 = bitcast %"class.boost::exception_detail::clone_impl"* %this1 to i8*
  %add.ptr3 = getelementptr inbounds i8* %10, i32 20
  %11 = bitcast i8* %add.ptr3 to %"class.boost::exception"*
  %12 = load %"struct.boost::exception_detail::error_info_injector"** %x.addr, align 4
  %13 = icmp eq %"struct.boost::exception_detail::error_info_injector"* %12, null
  br i1 %13, label %cast.end, label %cast.notnull

cast.notnull:                                     ; preds = %invoke.cont
  %14 = bitcast %"struct.boost::exception_detail::error_info_injector"* %12 to i8*
  %add.ptr4 = getelementptr inbounds i8* %14, i32 20
  %15 = bitcast i8* %add.ptr4 to %"class.boost::exception"*
  br label %cast.end

cast.end:                                         ; preds = %cast.notnull, %invoke.cont
  %cast.result = phi %"class.boost::exception"* [ %15, %cast.notnull ], [ null, %invoke.cont ]
  invoke void @_ZN5boost16exception_detail20copy_boost_exceptionEPNS_9exceptionEPKS1_(%"class.boost::exception"* %11, %"class.boost::exception"* %cast.result)
          to label %invoke.cont6 unwind label %lpad5

invoke.cont6:                                     ; preds = %cast.end
  ret void

lpad:                                             ; preds = %entry
  %16 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %17 = extractvalue { i8*, i32 } %16, 0
  store i8* %17, i8** %exn.slot
  %18 = extractvalue { i8*, i32 } %16, 1
  store i32 %18, i32* %ehselector.slot
  br label %ehcleanup

lpad5:                                            ; preds = %cast.end
  %19 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %20 = extractvalue { i8*, i32 } %19, 0
  store i8* %20, i8** %exn.slot
  %21 = extractvalue { i8*, i32 } %19, 1
  store i32 %21, i32* %ehselector.slot
  %22 = bitcast %"class.boost::exception_detail::clone_impl"* %this1 to %"struct.boost::exception_detail::error_info_injector"*
  call void @_ZN5boost16exception_detail19error_info_injectorINS_21thread_resource_errorEED2Ev(%"struct.boost::exception_detail::error_info_injector"* %22) nounwind
  br label %ehcleanup

ehcleanup:                                        ; preds = %lpad5, %lpad
  %23 = bitcast %"class.boost::exception_detail::clone_impl"* %this1 to i8*
  %24 = getelementptr inbounds i8* %23, i64 40
  %25 = bitcast i8* %24 to %"class.boost::exception_detail::clone_base"*
  call void @_ZN5boost16exception_detail10clone_baseD2Ev(%"class.boost::exception_detail::clone_base"* %25) nounwind
  br label %eh.resume

eh.resume:                                        ; preds = %ehcleanup
  %exn = load i8** %exn.slot
  %sel = load i32* %ehselector.slot
  %lpad.val = insertvalue { i8*, i32 } undef, i8* %exn, 0
  %lpad.val7 = insertvalue { i8*, i32 } %lpad.val, i32 %sel, 1
  resume { i8*, i32 } %lpad.val7
}

define linkonce_odr void @_ZN5boost10shared_ptrINS_6detail16thread_data_baseEEC2Ev(%"class.boost::shared_ptr"* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::shared_ptr"*, align 4
  store %"class.boost::shared_ptr"* %this, %"class.boost::shared_ptr"** %this.addr, align 4
  %this1 = load %"class.boost::shared_ptr"** %this.addr
  %px = getelementptr inbounds %"class.boost::shared_ptr"* %this1, i32 0, i32 0
  store %"struct.boost::detail::thread_data_base"* null, %"struct.boost::detail::thread_data_base"** %px, align 4
  %pn = getelementptr inbounds %"class.boost::shared_ptr"* %this1, i32 0, i32 1
  call void @_ZN5boost6detail12shared_countC1Ev(%"class.boost::detail::shared_count"* %pn)
  ret void
}

define linkonce_odr void @_ZN5boost6detail12shared_countC1Ev(%"class.boost::detail::shared_count"* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::detail::shared_count"*, align 4
  store %"class.boost::detail::shared_count"* %this, %"class.boost::detail::shared_count"** %this.addr, align 4
  %this1 = load %"class.boost::detail::shared_count"** %this.addr
  call void @_ZN5boost6detail12shared_countC2Ev(%"class.boost::detail::shared_count"* %this1)
  ret void
}

define linkonce_odr void @_ZN5boost6detail12shared_countC2Ev(%"class.boost::detail::shared_count"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::detail::shared_count"*, align 4
  store %"class.boost::detail::shared_count"* %this, %"class.boost::detail::shared_count"** %this.addr, align 4
  %this1 = load %"class.boost::detail::shared_count"** %this.addr
  %pi_ = getelementptr inbounds %"class.boost::detail::shared_count"* %this1, i32 0, i32 0
  store %"class.boost::detail::sp_counted_base"* null, %"class.boost::detail::sp_counted_base"** %pi_, align 4
  ret void
}

define linkonce_odr void @_ZN5boost8weak_ptrINS_6detail16thread_data_baseEEC1Ev(%"class.boost::weak_ptr"* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::weak_ptr"*, align 4
  store %"class.boost::weak_ptr"* %this, %"class.boost::weak_ptr"** %this.addr, align 4
  %this1 = load %"class.boost::weak_ptr"** %this.addr
  call void @_ZN5boost8weak_ptrINS_6detail16thread_data_baseEEC2Ev(%"class.boost::weak_ptr"* %this1)
  ret void
}

define linkonce_odr void @_ZN5boost8weak_ptrINS_6detail16thread_data_baseEEC2Ev(%"class.boost::weak_ptr"* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::weak_ptr"*, align 4
  store %"class.boost::weak_ptr"* %this, %"class.boost::weak_ptr"** %this.addr, align 4
  %this1 = load %"class.boost::weak_ptr"** %this.addr
  %px = getelementptr inbounds %"class.boost::weak_ptr"* %this1, i32 0, i32 0
  store %"struct.boost::detail::thread_data_base"* null, %"struct.boost::detail::thread_data_base"** %px, align 4
  %pn = getelementptr inbounds %"class.boost::weak_ptr"* %this1, i32 0, i32 1
  call void @_ZN5boost6detail10weak_countC1Ev(%"class.boost::detail::weak_count"* %pn)
  ret void
}

define linkonce_odr void @_ZN5boost6detail10weak_countC1Ev(%"class.boost::detail::weak_count"* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::detail::weak_count"*, align 4
  store %"class.boost::detail::weak_count"* %this, %"class.boost::detail::weak_count"** %this.addr, align 4
  %this1 = load %"class.boost::detail::weak_count"** %this.addr
  call void @_ZN5boost6detail10weak_countC2Ev(%"class.boost::detail::weak_count"* %this1)
  ret void
}

define linkonce_odr void @_ZN5boost6detail10weak_countC2Ev(%"class.boost::detail::weak_count"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::detail::weak_count"*, align 4
  store %"class.boost::detail::weak_count"* %this, %"class.boost::detail::weak_count"** %this.addr, align 4
  %this1 = load %"class.boost::detail::weak_count"** %this.addr
  %pi_ = getelementptr inbounds %"class.boost::detail::weak_count"* %this1, i32 0, i32 0
  store %"class.boost::detail::sp_counted_base"* null, %"class.boost::detail::sp_counted_base"** %pi_, align 4
  ret void
}

define linkonce_odr void @_ZN5boost10shared_ptrINS_6detail16thread_data_baseEEC2INS1_11thread_dataIPFvvEEEEEPT_(%"class.boost::shared_ptr"* %this, %"class.boost::detail::thread_data"* %p) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::shared_ptr"*, align 4
  %p.addr = alloca %"class.boost::detail::thread_data"*, align 4
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  store %"class.boost::shared_ptr"* %this, %"class.boost::shared_ptr"** %this.addr, align 4
  store %"class.boost::detail::thread_data"* %p, %"class.boost::detail::thread_data"** %p.addr, align 4
  %this1 = load %"class.boost::shared_ptr"** %this.addr
  %px = getelementptr inbounds %"class.boost::shared_ptr"* %this1, i32 0, i32 0
  %0 = load %"class.boost::detail::thread_data"** %p.addr, align 4
  %1 = bitcast %"class.boost::detail::thread_data"* %0 to %"struct.boost::detail::thread_data_base"*
  store %"struct.boost::detail::thread_data_base"* %1, %"struct.boost::detail::thread_data_base"** %px, align 4
  %pn = getelementptr inbounds %"class.boost::shared_ptr"* %this1, i32 0, i32 1
  %2 = load %"class.boost::detail::thread_data"** %p.addr, align 4
  call void @_ZN5boost6detail12shared_countC1INS0_11thread_dataIPFvvEEEEEPT_(%"class.boost::detail::shared_count"* %pn, %"class.boost::detail::thread_data"* %2)
  %3 = load %"class.boost::detail::thread_data"** %p.addr, align 4
  %4 = load %"class.boost::detail::thread_data"** %p.addr, align 4
  %5 = icmp eq %"class.boost::detail::thread_data"* %4, null
  br i1 %5, label %cast.end, label %cast.notnull

cast.notnull:                                     ; preds = %entry
  %6 = bitcast %"class.boost::detail::thread_data"* %4 to i8*
  %add.ptr = getelementptr inbounds i8* %6, i32 4
  %7 = bitcast i8* %add.ptr to %"class.boost::enable_shared_from_this"*
  br label %cast.end

cast.end:                                         ; preds = %cast.notnull, %entry
  %cast.result = phi %"class.boost::enable_shared_from_this"* [ %7, %cast.notnull ], [ null, %entry ]
  invoke void @_ZN5boost6detail26sp_enable_shared_from_thisINS0_16thread_data_baseENS0_11thread_dataIPFvvEEES2_EEvPKNS_10shared_ptrIT_EEPKT0_PKNS_23enable_shared_from_thisIT1_EE(%"class.boost::shared_ptr"* %this1, %"class.boost::detail::thread_data"* %3, %"class.boost::enable_shared_from_this"* %cast.result)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %cast.end
  ret void

lpad:                                             ; preds = %cast.end
  %8 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %9 = extractvalue { i8*, i32 } %8, 0
  store i8* %9, i8** %exn.slot
  %10 = extractvalue { i8*, i32 } %8, 1
  store i32 %10, i32* %ehselector.slot
  invoke void @_ZN5boost6detail12shared_countD1Ev(%"class.boost::detail::shared_count"* %pn)
          to label %invoke.cont2 unwind label %terminate.lpad

invoke.cont2:                                     ; preds = %lpad
  br label %eh.resume

eh.resume:                                        ; preds = %invoke.cont2
  %exn = load i8** %exn.slot
  %sel = load i32* %ehselector.slot
  %lpad.val = insertvalue { i8*, i32 } undef, i8* %exn, 0
  %lpad.val3 = insertvalue { i8*, i32 } %lpad.val, i32 %sel, 1
  resume { i8*, i32 } %lpad.val3

terminate.lpad:                                   ; preds = %lpad
  %11 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          catch i8* null
  call void @_ZSt9terminatev() noreturn nounwind
  unreachable
}

define linkonce_odr void @_ZN5boost6detail12shared_countC1INS0_11thread_dataIPFvvEEEEEPT_(%"class.boost::detail::shared_count"* %this, %"class.boost::detail::thread_data"* %p) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::detail::shared_count"*, align 4
  %p.addr = alloca %"class.boost::detail::thread_data"*, align 4
  store %"class.boost::detail::shared_count"* %this, %"class.boost::detail::shared_count"** %this.addr, align 4
  store %"class.boost::detail::thread_data"* %p, %"class.boost::detail::thread_data"** %p.addr, align 4
  %this1 = load %"class.boost::detail::shared_count"** %this.addr
  %0 = load %"class.boost::detail::thread_data"** %p.addr, align 4
  call void @_ZN5boost6detail12shared_countC2INS0_11thread_dataIPFvvEEEEEPT_(%"class.boost::detail::shared_count"* %this1, %"class.boost::detail::thread_data"* %0)
  ret void
}

define linkonce_odr void @_ZN5boost6detail26sp_enable_shared_from_thisINS0_16thread_data_baseENS0_11thread_dataIPFvvEEES2_EEvPKNS_10shared_ptrIT_EEPKT0_PKNS_23enable_shared_from_thisIT1_EE(%"class.boost::shared_ptr"* %ppx, %"class.boost::detail::thread_data"* %py, %"class.boost::enable_shared_from_this"* %pe) inlinehint {
entry:
  %ppx.addr = alloca %"class.boost::shared_ptr"*, align 4
  %py.addr = alloca %"class.boost::detail::thread_data"*, align 4
  %pe.addr = alloca %"class.boost::enable_shared_from_this"*, align 4
  store %"class.boost::shared_ptr"* %ppx, %"class.boost::shared_ptr"** %ppx.addr, align 4
  store %"class.boost::detail::thread_data"* %py, %"class.boost::detail::thread_data"** %py.addr, align 4
  store %"class.boost::enable_shared_from_this"* %pe, %"class.boost::enable_shared_from_this"** %pe.addr, align 4
  %0 = load %"class.boost::enable_shared_from_this"** %pe.addr, align 4
  %cmp = icmp ne %"class.boost::enable_shared_from_this"* %0, null
  br i1 %cmp, label %if.then, label %if.end

if.then:                                          ; preds = %entry
  %1 = load %"class.boost::enable_shared_from_this"** %pe.addr, align 4
  %2 = load %"class.boost::shared_ptr"** %ppx.addr, align 4
  %3 = load %"class.boost::detail::thread_data"** %py.addr, align 4
  call void @_ZNK5boost23enable_shared_from_thisINS_6detail16thread_data_baseEE22_internal_accept_ownerIS2_NS1_11thread_dataIPFvvEEEEEvPKNS_10shared_ptrIT_EEPT0_(%"class.boost::enable_shared_from_this"* %1, %"class.boost::shared_ptr"* %2, %"class.boost::detail::thread_data"* %3)
  br label %if.end

if.end:                                           ; preds = %if.then, %entry
  ret void
}

define linkonce_odr void @_ZNK5boost23enable_shared_from_thisINS_6detail16thread_data_baseEE22_internal_accept_ownerIS2_NS1_11thread_dataIPFvvEEEEEvPKNS_10shared_ptrIT_EEPT0_(%"class.boost::enable_shared_from_this"* %this, %"class.boost::shared_ptr"* %ppx, %"class.boost::detail::thread_data"* %py) align 2 {
entry:
  %this.addr = alloca %"class.boost::enable_shared_from_this"*, align 4
  %ppx.addr = alloca %"class.boost::shared_ptr"*, align 4
  %py.addr = alloca %"class.boost::detail::thread_data"*, align 4
  %ref.tmp = alloca %"class.boost::shared_ptr", align 4
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  store %"class.boost::enable_shared_from_this"* %this, %"class.boost::enable_shared_from_this"** %this.addr, align 4
  store %"class.boost::shared_ptr"* %ppx, %"class.boost::shared_ptr"** %ppx.addr, align 4
  store %"class.boost::detail::thread_data"* %py, %"class.boost::detail::thread_data"** %py.addr, align 4
  %this1 = load %"class.boost::enable_shared_from_this"** %this.addr
  %weak_this_ = getelementptr inbounds %"class.boost::enable_shared_from_this"* %this1, i32 0, i32 0
  %call = call zeroext i1 @_ZNK5boost8weak_ptrINS_6detail16thread_data_baseEE7expiredEv(%"class.boost::weak_ptr"* %weak_this_)
  br i1 %call, label %if.then, label %if.end

if.then:                                          ; preds = %entry
  %weak_this_2 = getelementptr inbounds %"class.boost::enable_shared_from_this"* %this1, i32 0, i32 0
  %0 = load %"class.boost::shared_ptr"** %ppx.addr, align 4
  %1 = load %"class.boost::detail::thread_data"** %py.addr, align 4
  %2 = bitcast %"class.boost::detail::thread_data"* %1 to %"struct.boost::detail::thread_data_base"*
  call void @_ZN5boost10shared_ptrINS_6detail16thread_data_baseEEC1IS2_EERKNS0_IT_EEPS2_(%"class.boost::shared_ptr"* %ref.tmp, %"class.boost::shared_ptr"* %0, %"struct.boost::detail::thread_data_base"* %2)
  %call3 = invoke %"class.boost::weak_ptr"* @_ZN5boost8weak_ptrINS_6detail16thread_data_baseEEaSIS2_EERS3_RKNS_10shared_ptrIT_EE(%"class.boost::weak_ptr"* %weak_this_2, %"class.boost::shared_ptr"* %ref.tmp)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %if.then
  call void @_ZN5boost10shared_ptrINS_6detail16thread_data_baseEED1Ev(%"class.boost::shared_ptr"* %ref.tmp)
  br label %if.end

lpad:                                             ; preds = %if.then
  %3 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %4 = extractvalue { i8*, i32 } %3, 0
  store i8* %4, i8** %exn.slot
  %5 = extractvalue { i8*, i32 } %3, 1
  store i32 %5, i32* %ehselector.slot
  invoke void @_ZN5boost10shared_ptrINS_6detail16thread_data_baseEED1Ev(%"class.boost::shared_ptr"* %ref.tmp)
          to label %invoke.cont4 unwind label %terminate.lpad

invoke.cont4:                                     ; preds = %lpad
  br label %eh.resume

if.end:                                           ; preds = %invoke.cont, %entry
  ret void

eh.resume:                                        ; preds = %invoke.cont4
  %exn = load i8** %exn.slot
  %sel = load i32* %ehselector.slot
  %lpad.val = insertvalue { i8*, i32 } undef, i8* %exn, 0
  %lpad.val5 = insertvalue { i8*, i32 } %lpad.val, i32 %sel, 1
  resume { i8*, i32 } %lpad.val5

terminate.lpad:                                   ; preds = %lpad
  %6 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          catch i8* null
  call void @_ZSt9terminatev() noreturn nounwind
  unreachable
}

define linkonce_odr zeroext i1 @_ZNK5boost8weak_ptrINS_6detail16thread_data_baseEE7expiredEv(%"class.boost::weak_ptr"* %this) align 2 {
entry:
  %this.addr = alloca %"class.boost::weak_ptr"*, align 4
  store %"class.boost::weak_ptr"* %this, %"class.boost::weak_ptr"** %this.addr, align 4
  %this1 = load %"class.boost::weak_ptr"** %this.addr
  %pn = getelementptr inbounds %"class.boost::weak_ptr"* %this1, i32 0, i32 1
  %call = call i32 @_ZNK5boost6detail10weak_count9use_countEv(%"class.boost::detail::weak_count"* %pn)
  %cmp = icmp eq i32 %call, 0
  ret i1 %cmp
}

define linkonce_odr %"class.boost::weak_ptr"* @_ZN5boost8weak_ptrINS_6detail16thread_data_baseEEaSIS2_EERS3_RKNS_10shared_ptrIT_EE(%"class.boost::weak_ptr"* %this, %"class.boost::shared_ptr"* %r) align 2 {
entry:
  %this.addr = alloca %"class.boost::weak_ptr"*, align 4
  %r.addr = alloca %"class.boost::shared_ptr"*, align 4
  store %"class.boost::weak_ptr"* %this, %"class.boost::weak_ptr"** %this.addr, align 4
  store %"class.boost::shared_ptr"* %r, %"class.boost::shared_ptr"** %r.addr, align 4
  %this1 = load %"class.boost::weak_ptr"** %this.addr
  %0 = load %"class.boost::shared_ptr"** %r.addr, align 4
  %px = getelementptr inbounds %"class.boost::shared_ptr"* %0, i32 0, i32 0
  %1 = load %"struct.boost::detail::thread_data_base"** %px, align 4
  %px2 = getelementptr inbounds %"class.boost::weak_ptr"* %this1, i32 0, i32 0
  store %"struct.boost::detail::thread_data_base"* %1, %"struct.boost::detail::thread_data_base"** %px2, align 4
  %pn = getelementptr inbounds %"class.boost::weak_ptr"* %this1, i32 0, i32 1
  %2 = load %"class.boost::shared_ptr"** %r.addr, align 4
  %pn3 = getelementptr inbounds %"class.boost::shared_ptr"* %2, i32 0, i32 1
  %call = call %"class.boost::detail::weak_count"* @_ZN5boost6detail10weak_countaSERKNS0_12shared_countE(%"class.boost::detail::weak_count"* %pn, %"class.boost::detail::shared_count"* %pn3)
  ret %"class.boost::weak_ptr"* %this1
}

define linkonce_odr void @_ZN5boost10shared_ptrINS_6detail16thread_data_baseEEC1IS2_EERKNS0_IT_EEPS2_(%"class.boost::shared_ptr"* %this, %"class.boost::shared_ptr"* %r, %"struct.boost::detail::thread_data_base"* %p) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::shared_ptr"*, align 4
  %r.addr = alloca %"class.boost::shared_ptr"*, align 4
  %p.addr = alloca %"struct.boost::detail::thread_data_base"*, align 4
  store %"class.boost::shared_ptr"* %this, %"class.boost::shared_ptr"** %this.addr, align 4
  store %"class.boost::shared_ptr"* %r, %"class.boost::shared_ptr"** %r.addr, align 4
  store %"struct.boost::detail::thread_data_base"* %p, %"struct.boost::detail::thread_data_base"** %p.addr, align 4
  %this1 = load %"class.boost::shared_ptr"** %this.addr
  %0 = load %"struct.boost::detail::thread_data_base"** %p.addr, align 4
  %1 = load %"class.boost::shared_ptr"** %r.addr
  call void @_ZN5boost10shared_ptrINS_6detail16thread_data_baseEEC2IS2_EERKNS0_IT_EEPS2_(%"class.boost::shared_ptr"* %this1, %"class.boost::shared_ptr"* %1, %"struct.boost::detail::thread_data_base"* %0)
  ret void
}

define linkonce_odr void @_ZN5boost10shared_ptrINS_6detail16thread_data_baseEEC2IS2_EERKNS0_IT_EEPS2_(%"class.boost::shared_ptr"* %this, %"class.boost::shared_ptr"* %r, %"struct.boost::detail::thread_data_base"* %p) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::shared_ptr"*, align 4
  %r.addr = alloca %"class.boost::shared_ptr"*, align 4
  %p.addr = alloca %"struct.boost::detail::thread_data_base"*, align 4
  store %"class.boost::shared_ptr"* %this, %"class.boost::shared_ptr"** %this.addr, align 4
  store %"class.boost::shared_ptr"* %r, %"class.boost::shared_ptr"** %r.addr, align 4
  store %"struct.boost::detail::thread_data_base"* %p, %"struct.boost::detail::thread_data_base"** %p.addr, align 4
  %this1 = load %"class.boost::shared_ptr"** %this.addr
  %px = getelementptr inbounds %"class.boost::shared_ptr"* %this1, i32 0, i32 0
  %0 = load %"struct.boost::detail::thread_data_base"** %p.addr, align 4
  store %"struct.boost::detail::thread_data_base"* %0, %"struct.boost::detail::thread_data_base"** %px, align 4
  %pn = getelementptr inbounds %"class.boost::shared_ptr"* %this1, i32 0, i32 1
  %1 = load %"class.boost::shared_ptr"** %r.addr, align 4
  %pn2 = getelementptr inbounds %"class.boost::shared_ptr"* %1, i32 0, i32 1
  call void @_ZN5boost6detail12shared_countC1ERKS1_(%"class.boost::detail::shared_count"* %pn, %"class.boost::detail::shared_count"* %pn2)
  ret void
}

define linkonce_odr void @_ZN5boost6detail12shared_countC1ERKS1_(%"class.boost::detail::shared_count"* %this, %"class.boost::detail::shared_count"* %r) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::detail::shared_count"*, align 4
  %r.addr = alloca %"class.boost::detail::shared_count"*, align 4
  store %"class.boost::detail::shared_count"* %this, %"class.boost::detail::shared_count"** %this.addr, align 4
  store %"class.boost::detail::shared_count"* %r, %"class.boost::detail::shared_count"** %r.addr, align 4
  %this1 = load %"class.boost::detail::shared_count"** %this.addr
  %0 = load %"class.boost::detail::shared_count"** %r.addr
  call void @_ZN5boost6detail12shared_countC2ERKS1_(%"class.boost::detail::shared_count"* %this1, %"class.boost::detail::shared_count"* %0)
  ret void
}

define linkonce_odr void @_ZN5boost6detail12shared_countC2ERKS1_(%"class.boost::detail::shared_count"* %this, %"class.boost::detail::shared_count"* %r) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::detail::shared_count"*, align 4
  %r.addr = alloca %"class.boost::detail::shared_count"*, align 4
  store %"class.boost::detail::shared_count"* %this, %"class.boost::detail::shared_count"** %this.addr, align 4
  store %"class.boost::detail::shared_count"* %r, %"class.boost::detail::shared_count"** %r.addr, align 4
  %this1 = load %"class.boost::detail::shared_count"** %this.addr
  %pi_ = getelementptr inbounds %"class.boost::detail::shared_count"* %this1, i32 0, i32 0
  %0 = load %"class.boost::detail::shared_count"** %r.addr, align 4
  %pi_2 = getelementptr inbounds %"class.boost::detail::shared_count"* %0, i32 0, i32 0
  %1 = load %"class.boost::detail::sp_counted_base"** %pi_2, align 4
  store %"class.boost::detail::sp_counted_base"* %1, %"class.boost::detail::sp_counted_base"** %pi_, align 4
  %pi_3 = getelementptr inbounds %"class.boost::detail::shared_count"* %this1, i32 0, i32 0
  %2 = load %"class.boost::detail::sp_counted_base"** %pi_3, align 4
  %cmp = icmp ne %"class.boost::detail::sp_counted_base"* %2, null
  br i1 %cmp, label %if.then, label %if.end

if.then:                                          ; preds = %entry
  %pi_4 = getelementptr inbounds %"class.boost::detail::shared_count"* %this1, i32 0, i32 0
  %3 = load %"class.boost::detail::sp_counted_base"** %pi_4, align 4
  call void @_ZN5boost6detail15sp_counted_base12add_ref_copyEv(%"class.boost::detail::sp_counted_base"* %3)
  br label %if.end

if.end:                                           ; preds = %if.then, %entry
  ret void
}

define linkonce_odr void @_ZN5boost6detail15sp_counted_base12add_ref_copyEv(%"class.boost::detail::sp_counted_base"* %this) align 2 {
entry:
  %this.addr = alloca %"class.boost::detail::sp_counted_base"*, align 4
  store %"class.boost::detail::sp_counted_base"* %this, %"class.boost::detail::sp_counted_base"** %this.addr, align 4
  %this1 = load %"class.boost::detail::sp_counted_base"** %this.addr
  %use_count_ = getelementptr inbounds %"class.boost::detail::sp_counted_base"* %this1, i32 0, i32 1
  call void @_ZN5boost6detail16atomic_incrementEPi(i32* %use_count_)
  ret void
}

define linkonce_odr void @_ZN5boost6detail16atomic_incrementEPi(i32* %pw) nounwind inlinehint {
entry:
  %pw.addr = alloca i32*, align 4
  store i32* %pw, i32** %pw.addr, align 4
  %0 = load i32** %pw.addr, align 4
  %1 = load i32** %pw.addr, align 4
  call void asm "lock\0A\09incl $0", "=*m,*m,~{cc},~{dirflag},~{fpsr},~{flags}"(i32* %0, i32* %1) nounwind, !srcloc !1
  ret void
}

define linkonce_odr %"class.boost::detail::weak_count"* @_ZN5boost6detail10weak_countaSERKNS0_12shared_countE(%"class.boost::detail::weak_count"* %this, %"class.boost::detail::shared_count"* %r) align 2 {
entry:
  %this.addr = alloca %"class.boost::detail::weak_count"*, align 4
  %r.addr = alloca %"class.boost::detail::shared_count"*, align 4
  %tmp = alloca %"class.boost::detail::sp_counted_base"*, align 4
  store %"class.boost::detail::weak_count"* %this, %"class.boost::detail::weak_count"** %this.addr, align 4
  store %"class.boost::detail::shared_count"* %r, %"class.boost::detail::shared_count"** %r.addr, align 4
  %this1 = load %"class.boost::detail::weak_count"** %this.addr
  %0 = load %"class.boost::detail::shared_count"** %r.addr, align 4
  %pi_ = getelementptr inbounds %"class.boost::detail::shared_count"* %0, i32 0, i32 0
  %1 = load %"class.boost::detail::sp_counted_base"** %pi_, align 4
  store %"class.boost::detail::sp_counted_base"* %1, %"class.boost::detail::sp_counted_base"** %tmp, align 4
  %2 = load %"class.boost::detail::sp_counted_base"** %tmp, align 4
  %pi_2 = getelementptr inbounds %"class.boost::detail::weak_count"* %this1, i32 0, i32 0
  %3 = load %"class.boost::detail::sp_counted_base"** %pi_2, align 4
  %cmp = icmp ne %"class.boost::detail::sp_counted_base"* %2, %3
  br i1 %cmp, label %if.then, label %if.end11

if.then:                                          ; preds = %entry
  %4 = load %"class.boost::detail::sp_counted_base"** %tmp, align 4
  %cmp3 = icmp ne %"class.boost::detail::sp_counted_base"* %4, null
  br i1 %cmp3, label %if.then4, label %if.end

if.then4:                                         ; preds = %if.then
  %5 = load %"class.boost::detail::sp_counted_base"** %tmp, align 4
  call void @_ZN5boost6detail15sp_counted_base12weak_add_refEv(%"class.boost::detail::sp_counted_base"* %5)
  br label %if.end

if.end:                                           ; preds = %if.then4, %if.then
  %pi_5 = getelementptr inbounds %"class.boost::detail::weak_count"* %this1, i32 0, i32 0
  %6 = load %"class.boost::detail::sp_counted_base"** %pi_5, align 4
  %cmp6 = icmp ne %"class.boost::detail::sp_counted_base"* %6, null
  br i1 %cmp6, label %if.then7, label %if.end9

if.then7:                                         ; preds = %if.end
  %pi_8 = getelementptr inbounds %"class.boost::detail::weak_count"* %this1, i32 0, i32 0
  %7 = load %"class.boost::detail::sp_counted_base"** %pi_8, align 4
  call void @_ZN5boost6detail15sp_counted_base12weak_releaseEv(%"class.boost::detail::sp_counted_base"* %7)
  br label %if.end9

if.end9:                                          ; preds = %if.then7, %if.end
  %8 = load %"class.boost::detail::sp_counted_base"** %tmp, align 4
  %pi_10 = getelementptr inbounds %"class.boost::detail::weak_count"* %this1, i32 0, i32 0
  store %"class.boost::detail::sp_counted_base"* %8, %"class.boost::detail::sp_counted_base"** %pi_10, align 4
  br label %if.end11

if.end11:                                         ; preds = %if.end9, %entry
  ret %"class.boost::detail::weak_count"* %this1
}

define linkonce_odr void @_ZN5boost6detail15sp_counted_base12weak_add_refEv(%"class.boost::detail::sp_counted_base"* %this) nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::detail::sp_counted_base"*, align 4
  store %"class.boost::detail::sp_counted_base"* %this, %"class.boost::detail::sp_counted_base"** %this.addr, align 4
  %this1 = load %"class.boost::detail::sp_counted_base"** %this.addr
  %weak_count_ = getelementptr inbounds %"class.boost::detail::sp_counted_base"* %this1, i32 0, i32 2
  call void @_ZN5boost6detail16atomic_incrementEPi(i32* %weak_count_)
  ret void
}

define linkonce_odr i32 @_ZNK5boost6detail10weak_count9use_countEv(%"class.boost::detail::weak_count"* %this) align 2 {
entry:
  %this.addr = alloca %"class.boost::detail::weak_count"*, align 4
  store %"class.boost::detail::weak_count"* %this, %"class.boost::detail::weak_count"** %this.addr, align 4
  %this1 = load %"class.boost::detail::weak_count"** %this.addr
  %pi_ = getelementptr inbounds %"class.boost::detail::weak_count"* %this1, i32 0, i32 0
  %0 = load %"class.boost::detail::sp_counted_base"** %pi_, align 4
  %cmp = icmp ne %"class.boost::detail::sp_counted_base"* %0, null
  br i1 %cmp, label %cond.true, label %cond.false

cond.true:                                        ; preds = %entry
  %pi_2 = getelementptr inbounds %"class.boost::detail::weak_count"* %this1, i32 0, i32 0
  %1 = load %"class.boost::detail::sp_counted_base"** %pi_2, align 4
  %call = call i32 @_ZNK5boost6detail15sp_counted_base9use_countEv(%"class.boost::detail::sp_counted_base"* %1)
  br label %cond.end

cond.false:                                       ; preds = %entry
  br label %cond.end

cond.end:                                         ; preds = %cond.false, %cond.true
  %cond = phi i32 [ %call, %cond.true ], [ 0, %cond.false ]
  ret i32 %cond
}

define linkonce_odr i32 @_ZNK5boost6detail15sp_counted_base9use_countEv(%"class.boost::detail::sp_counted_base"* %this) nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::detail::sp_counted_base"*, align 4
  store %"class.boost::detail::sp_counted_base"* %this, %"class.boost::detail::sp_counted_base"** %this.addr, align 4
  %this1 = load %"class.boost::detail::sp_counted_base"** %this.addr
  %use_count_ = getelementptr inbounds %"class.boost::detail::sp_counted_base"* %this1, i32 0, i32 1
  %0 = load i32* %use_count_, align 4
  ret i32 %0
}

define linkonce_odr void @_ZN5boost6detail12shared_countC2INS0_11thread_dataIPFvvEEEEEPT_(%"class.boost::detail::shared_count"* %this, %"class.boost::detail::thread_data"* %p) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::detail::shared_count"*, align 4
  %p.addr = alloca %"class.boost::detail::thread_data"*, align 4
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  store %"class.boost::detail::shared_count"* %this, %"class.boost::detail::shared_count"** %this.addr, align 4
  store %"class.boost::detail::thread_data"* %p, %"class.boost::detail::thread_data"** %p.addr, align 4
  %this1 = load %"class.boost::detail::shared_count"** %this.addr
  %pi_ = getelementptr inbounds %"class.boost::detail::shared_count"* %this1, i32 0, i32 0
  store %"class.boost::detail::sp_counted_base"* null, %"class.boost::detail::sp_counted_base"** %pi_, align 4
  %call = invoke noalias i8* @_Znwj(i32 16)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %entry
  %0 = bitcast i8* %call to %"class.boost::detail::sp_counted_impl_p"*
  %1 = load %"class.boost::detail::thread_data"** %p.addr, align 4
  invoke void @_ZN5boost6detail17sp_counted_impl_pINS0_11thread_dataIPFvvEEEEC1EPS5_(%"class.boost::detail::sp_counted_impl_p"* %0, %"class.boost::detail::thread_data"* %1)
          to label %invoke.cont3 unwind label %lpad2

invoke.cont3:                                     ; preds = %invoke.cont
  %2 = bitcast %"class.boost::detail::sp_counted_impl_p"* %0 to %"class.boost::detail::sp_counted_base"*
  %pi_4 = getelementptr inbounds %"class.boost::detail::shared_count"* %this1, i32 0, i32 0
  store %"class.boost::detail::sp_counted_base"* %2, %"class.boost::detail::sp_counted_base"** %pi_4, align 4
  br label %try.cont

lpad:                                             ; preds = %entry
  %3 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          catch i8* null
  %4 = extractvalue { i8*, i32 } %3, 0
  store i8* %4, i8** %exn.slot
  %5 = extractvalue { i8*, i32 } %3, 1
  store i32 %5, i32* %ehselector.slot
  br label %catch

lpad2:                                            ; preds = %invoke.cont
  %6 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          catch i8* null
  %7 = extractvalue { i8*, i32 } %6, 0
  store i8* %7, i8** %exn.slot
  %8 = extractvalue { i8*, i32 } %6, 1
  store i32 %8, i32* %ehselector.slot
  call void @_ZdlPv(i8* %call) nounwind
  br label %catch

catch:                                            ; preds = %lpad2, %lpad
  %exn = load i8** %exn.slot
  %9 = call i8* @__cxa_begin_catch(i8* %exn) nounwind
  %10 = load %"class.boost::detail::thread_data"** %p.addr, align 4
  invoke void @_ZN5boost14checked_deleteINS_6detail11thread_dataIPFvvEEEEEvPT_(%"class.boost::detail::thread_data"* %10)
          to label %invoke.cont6 unwind label %lpad5

invoke.cont6:                                     ; preds = %catch
  invoke void @__cxa_rethrow() noreturn
          to label %unreachable unwind label %lpad5

lpad5:                                            ; preds = %invoke.cont6, %catch
  %11 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %12 = extractvalue { i8*, i32 } %11, 0
  store i8* %12, i8** %exn.slot
  %13 = extractvalue { i8*, i32 } %11, 1
  store i32 %13, i32* %ehselector.slot
  invoke void @__cxa_end_catch()
          to label %invoke.cont7 unwind label %terminate.lpad

invoke.cont7:                                     ; preds = %lpad5
  br label %eh.resume

try.cont:                                         ; preds = %invoke.cont3
  ret void

eh.resume:                                        ; preds = %invoke.cont7
  %exn8 = load i8** %exn.slot
  %sel = load i32* %ehselector.slot
  %lpad.val = insertvalue { i8*, i32 } undef, i8* %exn8, 0
  %lpad.val9 = insertvalue { i8*, i32 } %lpad.val, i32 %sel, 1
  resume { i8*, i32 } %lpad.val9

terminate.lpad:                                   ; preds = %lpad5
  %14 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          catch i8* null
  call void @_ZSt9terminatev() noreturn nounwind
  unreachable

unreachable:                                      ; preds = %invoke.cont6
  unreachable
}

define linkonce_odr void @_ZN5boost6detail17sp_counted_impl_pINS0_11thread_dataIPFvvEEEEC1EPS5_(%"class.boost::detail::sp_counted_impl_p"* %this, %"class.boost::detail::thread_data"* %px) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::detail::sp_counted_impl_p"*, align 4
  %px.addr = alloca %"class.boost::detail::thread_data"*, align 4
  store %"class.boost::detail::sp_counted_impl_p"* %this, %"class.boost::detail::sp_counted_impl_p"** %this.addr, align 4
  store %"class.boost::detail::thread_data"* %px, %"class.boost::detail::thread_data"** %px.addr, align 4
  %this1 = load %"class.boost::detail::sp_counted_impl_p"** %this.addr
  %0 = load %"class.boost::detail::thread_data"** %px.addr, align 4
  call void @_ZN5boost6detail17sp_counted_impl_pINS0_11thread_dataIPFvvEEEEC2EPS5_(%"class.boost::detail::sp_counted_impl_p"* %this1, %"class.boost::detail::thread_data"* %0)
  ret void
}

define linkonce_odr void @_ZN5boost14checked_deleteINS_6detail11thread_dataIPFvvEEEEEvPT_(%"class.boost::detail::thread_data"* %x) inlinehint {
entry:
  %x.addr = alloca %"class.boost::detail::thread_data"*, align 4
  store %"class.boost::detail::thread_data"* %x, %"class.boost::detail::thread_data"** %x.addr, align 4
  %0 = load %"class.boost::detail::thread_data"** %x.addr, align 4
  %isnull = icmp eq %"class.boost::detail::thread_data"* %0, null
  br i1 %isnull, label %delete.end, label %delete.notnull

delete.notnull:                                   ; preds = %entry
  %1 = bitcast %"class.boost::detail::thread_data"* %0 to void (%"class.boost::detail::thread_data"*)***
  %vtable = load void (%"class.boost::detail::thread_data"*)*** %1
  %vfn = getelementptr inbounds void (%"class.boost::detail::thread_data"*)** %vtable, i64 1
  %2 = load void (%"class.boost::detail::thread_data"*)** %vfn
  call void %2(%"class.boost::detail::thread_data"* %0)
  br label %delete.end

delete.end:                                       ; preds = %delete.notnull, %entry
  ret void
}

declare void @__cxa_rethrow()

define linkonce_odr void @_ZN5boost6detail17sp_counted_impl_pINS0_11thread_dataIPFvvEEEEC2EPS5_(%"class.boost::detail::sp_counted_impl_p"* %this, %"class.boost::detail::thread_data"* %px) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::detail::sp_counted_impl_p"*, align 4
  %px.addr = alloca %"class.boost::detail::thread_data"*, align 4
  store %"class.boost::detail::sp_counted_impl_p"* %this, %"class.boost::detail::sp_counted_impl_p"** %this.addr, align 4
  store %"class.boost::detail::thread_data"* %px, %"class.boost::detail::thread_data"** %px.addr, align 4
  %this1 = load %"class.boost::detail::sp_counted_impl_p"** %this.addr
  %0 = bitcast %"class.boost::detail::sp_counted_impl_p"* %this1 to %"class.boost::detail::sp_counted_base"*
  call void @_ZN5boost6detail15sp_counted_baseC2Ev(%"class.boost::detail::sp_counted_base"* %0)
  %1 = bitcast %"class.boost::detail::sp_counted_impl_p"* %this1 to i8***
  store i8** getelementptr inbounds ([7 x i8*]* @_ZTVN5boost6detail17sp_counted_impl_pINS0_11thread_dataIPFvvEEEEE, i64 0, i64 2), i8*** %1
  %px_ = getelementptr inbounds %"class.boost::detail::sp_counted_impl_p"* %this1, i32 0, i32 1
  %2 = load %"class.boost::detail::thread_data"** %px.addr, align 4
  store %"class.boost::detail::thread_data"* %2, %"class.boost::detail::thread_data"** %px_, align 4
  ret void
}

define linkonce_odr void @_ZN5boost6detail15sp_counted_baseC2Ev(%"class.boost::detail::sp_counted_base"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::detail::sp_counted_base"*, align 4
  store %"class.boost::detail::sp_counted_base"* %this, %"class.boost::detail::sp_counted_base"** %this.addr, align 4
  %this1 = load %"class.boost::detail::sp_counted_base"** %this.addr
  %0 = bitcast %"class.boost::detail::sp_counted_base"* %this1 to i8***
  store i8** getelementptr inbounds ([7 x i8*]* @_ZTVN5boost6detail15sp_counted_baseE, i64 0, i64 2), i8*** %0
  %use_count_ = getelementptr inbounds %"class.boost::detail::sp_counted_base"* %this1, i32 0, i32 1
  store i32 1, i32* %use_count_, align 4
  %weak_count_ = getelementptr inbounds %"class.boost::detail::sp_counted_base"* %this1, i32 0, i32 2
  store i32 1, i32* %weak_count_, align 4
  ret void
}

define linkonce_odr void @_ZN5boost6detail17sp_counted_impl_pINS0_11thread_dataIPFvvEEEED1Ev(%"class.boost::detail::sp_counted_impl_p"* %this) unnamed_addr inlinehint align 2 {
entry:
  %this.addr = alloca %"class.boost::detail::sp_counted_impl_p"*, align 4
  store %"class.boost::detail::sp_counted_impl_p"* %this, %"class.boost::detail::sp_counted_impl_p"** %this.addr, align 4
  %this1 = load %"class.boost::detail::sp_counted_impl_p"** %this.addr
  call void @_ZN5boost6detail17sp_counted_impl_pINS0_11thread_dataIPFvvEEEED2Ev(%"class.boost::detail::sp_counted_impl_p"* %this1)
  ret void
}

define linkonce_odr void @_ZN5boost6detail17sp_counted_impl_pINS0_11thread_dataIPFvvEEEED0Ev(%"class.boost::detail::sp_counted_impl_p"* %this) unnamed_addr inlinehint align 2 {
entry:
  %this.addr = alloca %"class.boost::detail::sp_counted_impl_p"*, align 4
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  store %"class.boost::detail::sp_counted_impl_p"* %this, %"class.boost::detail::sp_counted_impl_p"** %this.addr, align 4
  %this1 = load %"class.boost::detail::sp_counted_impl_p"** %this.addr
  invoke void @_ZN5boost6detail17sp_counted_impl_pINS0_11thread_dataIPFvvEEEED1Ev(%"class.boost::detail::sp_counted_impl_p"* %this1)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %entry
  %0 = bitcast %"class.boost::detail::sp_counted_impl_p"* %this1 to i8*
  call void @_ZdlPv(i8* %0) nounwind
  ret void

lpad:                                             ; preds = %entry
  %1 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %2 = extractvalue { i8*, i32 } %1, 0
  store i8* %2, i8** %exn.slot
  %3 = extractvalue { i8*, i32 } %1, 1
  store i32 %3, i32* %ehselector.slot
  %4 = bitcast %"class.boost::detail::sp_counted_impl_p"* %this1 to i8*
  call void @_ZdlPv(i8* %4) nounwind
  br label %eh.resume

eh.resume:                                        ; preds = %lpad
  %exn = load i8** %exn.slot
  %sel = load i32* %ehselector.slot
  %lpad.val = insertvalue { i8*, i32 } undef, i8* %exn, 0
  %lpad.val2 = insertvalue { i8*, i32 } %lpad.val, i32 %sel, 1
  resume { i8*, i32 } %lpad.val2
}

define linkonce_odr void @_ZN5boost6detail17sp_counted_impl_pINS0_11thread_dataIPFvvEEEE7disposeEv(%"class.boost::detail::sp_counted_impl_p"* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::detail::sp_counted_impl_p"*, align 4
  store %"class.boost::detail::sp_counted_impl_p"* %this, %"class.boost::detail::sp_counted_impl_p"** %this.addr, align 4
  %this1 = load %"class.boost::detail::sp_counted_impl_p"** %this.addr
  %px_ = getelementptr inbounds %"class.boost::detail::sp_counted_impl_p"* %this1, i32 0, i32 1
  %0 = load %"class.boost::detail::thread_data"** %px_, align 4
  call void @_ZN5boost14checked_deleteINS_6detail11thread_dataIPFvvEEEEEvPT_(%"class.boost::detail::thread_data"* %0)
  ret void
}

define linkonce_odr void @_ZN5boost6detail15sp_counted_base7destroyEv(%"class.boost::detail::sp_counted_base"* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::detail::sp_counted_base"*, align 4
  store %"class.boost::detail::sp_counted_base"* %this, %"class.boost::detail::sp_counted_base"** %this.addr, align 4
  %this1 = load %"class.boost::detail::sp_counted_base"** %this.addr
  %isnull = icmp eq %"class.boost::detail::sp_counted_base"* %this1, null
  br i1 %isnull, label %delete.end, label %delete.notnull

delete.notnull:                                   ; preds = %entry
  %0 = bitcast %"class.boost::detail::sp_counted_base"* %this1 to void (%"class.boost::detail::sp_counted_base"*)***
  %vtable = load void (%"class.boost::detail::sp_counted_base"*)*** %0
  %vfn = getelementptr inbounds void (%"class.boost::detail::sp_counted_base"*)** %vtable, i64 1
  %1 = load void (%"class.boost::detail::sp_counted_base"*)** %vfn
  call void %1(%"class.boost::detail::sp_counted_base"* %this1)
  br label %delete.end

delete.end:                                       ; preds = %delete.notnull, %entry
  ret void
}

define linkonce_odr i8* @_ZN5boost6detail17sp_counted_impl_pINS0_11thread_dataIPFvvEEEE11get_deleterERKSt9type_info(%"class.boost::detail::sp_counted_impl_p"* %this, %"class.std::type_info"*) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::detail::sp_counted_impl_p"*, align 4
  %.addr = alloca %"class.std::type_info"*, align 4
  store %"class.boost::detail::sp_counted_impl_p"* %this, %"class.boost::detail::sp_counted_impl_p"** %this.addr, align 4
  store %"class.std::type_info"* %0, %"class.std::type_info"** %.addr, align 4
  %this1 = load %"class.boost::detail::sp_counted_impl_p"** %this.addr
  ret i8* null
}

define linkonce_odr void @_ZN5boost6detail17sp_counted_impl_pINS0_11thread_dataIPFvvEEEED2Ev(%"class.boost::detail::sp_counted_impl_p"* %this) unnamed_addr inlinehint align 2 {
entry:
  %this.addr = alloca %"class.boost::detail::sp_counted_impl_p"*, align 4
  store %"class.boost::detail::sp_counted_impl_p"* %this, %"class.boost::detail::sp_counted_impl_p"** %this.addr, align 4
  %this1 = load %"class.boost::detail::sp_counted_impl_p"** %this.addr
  %0 = bitcast %"class.boost::detail::sp_counted_impl_p"* %this1 to %"class.boost::detail::sp_counted_base"*
  call void @_ZN5boost6detail15sp_counted_baseD2Ev(%"class.boost::detail::sp_counted_base"* %0)
  ret void
}

define linkonce_odr void @_ZN5boost6detail15sp_counted_baseD2Ev(%"class.boost::detail::sp_counted_base"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::detail::sp_counted_base"*, align 4
  store %"class.boost::detail::sp_counted_base"* %this, %"class.boost::detail::sp_counted_base"** %this.addr, align 4
  %this1 = load %"class.boost::detail::sp_counted_base"** %this.addr
  ret void
}

define linkonce_odr void @_ZN5boost6detail15sp_counted_baseD1Ev(%"class.boost::detail::sp_counted_base"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::detail::sp_counted_base"*, align 4
  store %"class.boost::detail::sp_counted_base"* %this, %"class.boost::detail::sp_counted_base"** %this.addr, align 4
  %this1 = load %"class.boost::detail::sp_counted_base"** %this.addr
  call void @_ZN5boost6detail15sp_counted_baseD2Ev(%"class.boost::detail::sp_counted_base"* %this1)
  ret void
}

define linkonce_odr void @_ZN5boost6detail15sp_counted_baseD0Ev(%"class.boost::detail::sp_counted_base"* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::detail::sp_counted_base"*, align 4
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  store %"class.boost::detail::sp_counted_base"* %this, %"class.boost::detail::sp_counted_base"** %this.addr, align 4
  %this1 = load %"class.boost::detail::sp_counted_base"** %this.addr
  invoke void @_ZN5boost6detail15sp_counted_baseD1Ev(%"class.boost::detail::sp_counted_base"* %this1)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %entry
  %0 = bitcast %"class.boost::detail::sp_counted_base"* %this1 to i8*
  call void @_ZdlPv(i8* %0) nounwind
  ret void

lpad:                                             ; preds = %entry
  %1 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %2 = extractvalue { i8*, i32 } %1, 0
  store i8* %2, i8** %exn.slot
  %3 = extractvalue { i8*, i32 } %1, 1
  store i32 %3, i32* %ehselector.slot
  %4 = bitcast %"class.boost::detail::sp_counted_base"* %this1 to i8*
  call void @_ZdlPv(i8* %4) nounwind
  br label %eh.resume

eh.resume:                                        ; preds = %lpad
  %exn = load i8** %exn.slot
  %sel = load i32* %ehselector.slot
  %lpad.val = insertvalue { i8*, i32 } undef, i8* %exn, 0
  %lpad.val2 = insertvalue { i8*, i32 } %lpad.val, i32 %sel, 1
  resume { i8*, i32 } %lpad.val2
}

define linkonce_odr void @_ZN5boost3argILi9EEC2Ev(%"struct.boost::arg.14"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"struct.boost::arg.14"*, align 4
  store %"struct.boost::arg.14"* %this, %"struct.boost::arg.14"** %this.addr, align 4
  %this1 = load %"struct.boost::arg.14"** %this.addr
  ret void
}

define linkonce_odr void @_ZN5boost3argILi8EEC2Ev(%"struct.boost::arg.12"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"struct.boost::arg.12"*, align 4
  store %"struct.boost::arg.12"* %this, %"struct.boost::arg.12"** %this.addr, align 4
  %this1 = load %"struct.boost::arg.12"** %this.addr
  ret void
}

define linkonce_odr void @_ZN5boost3argILi7EEC2Ev(%"struct.boost::arg.10"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"struct.boost::arg.10"*, align 4
  store %"struct.boost::arg.10"* %this, %"struct.boost::arg.10"** %this.addr, align 4
  %this1 = load %"struct.boost::arg.10"** %this.addr
  ret void
}

define linkonce_odr void @_ZN5boost3argILi6EEC2Ev(%"struct.boost::arg.8"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"struct.boost::arg.8"*, align 4
  store %"struct.boost::arg.8"* %this, %"struct.boost::arg.8"** %this.addr, align 4
  %this1 = load %"struct.boost::arg.8"** %this.addr
  ret void
}

define linkonce_odr void @_ZN5boost3argILi5EEC2Ev(%"struct.boost::arg.6"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"struct.boost::arg.6"*, align 4
  store %"struct.boost::arg.6"* %this, %"struct.boost::arg.6"** %this.addr, align 4
  %this1 = load %"struct.boost::arg.6"** %this.addr
  ret void
}

define linkonce_odr void @_ZN5boost3argILi4EEC2Ev(%"struct.boost::arg.4"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"struct.boost::arg.4"*, align 4
  store %"struct.boost::arg.4"* %this, %"struct.boost::arg.4"** %this.addr, align 4
  %this1 = load %"struct.boost::arg.4"** %this.addr
  ret void
}

define linkonce_odr void @_ZN5boost3argILi3EEC2Ev(%"struct.boost::arg.2"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"struct.boost::arg.2"*, align 4
  store %"struct.boost::arg.2"* %this, %"struct.boost::arg.2"** %this.addr, align 4
  %this1 = load %"struct.boost::arg.2"** %this.addr
  ret void
}

define linkonce_odr void @_ZN5boost3argILi2EEC2Ev(%"struct.boost::arg.0"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"struct.boost::arg.0"*, align 4
  store %"struct.boost::arg.0"* %this, %"struct.boost::arg.0"** %this.addr, align 4
  %this1 = load %"struct.boost::arg.0"** %this.addr
  ret void
}

define linkonce_odr void @_ZN5boost3argILi1EEC2Ev(%"struct.boost::arg"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"struct.boost::arg"*, align 4
  store %"struct.boost::arg"* %this, %"struct.boost::arg"** %this.addr, align 4
  %this1 = load %"struct.boost::arg"** %this.addr
  ret void
}

define linkonce_odr void @_ZN5boost11unique_lockINS_5mutexEED2Ev(%"class.boost::unique_lock"* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::unique_lock"*, align 4
  store %"class.boost::unique_lock"* %this, %"class.boost::unique_lock"** %this.addr, align 4
  %this1 = load %"class.boost::unique_lock"** %this.addr
  %call = call zeroext i1 @_ZNK5boost11unique_lockINS_5mutexEE9owns_lockEv(%"class.boost::unique_lock"* %this1)
  br i1 %call, label %if.then, label %if.end

if.then:                                          ; preds = %entry
  %m = getelementptr inbounds %"class.boost::unique_lock"* %this1, i32 0, i32 0
  %0 = load %"class.boost::mutex"** %m, align 4
  call void @_ZN5boost5mutex6unlockEv(%"class.boost::mutex"* %0)
  br label %if.end

if.end:                                           ; preds = %if.then, %entry
  ret void
}

define linkonce_odr zeroext i1 @_ZNK5boost11unique_lockINS_5mutexEE9owns_lockEv(%"class.boost::unique_lock"* %this) nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::unique_lock"*, align 4
  store %"class.boost::unique_lock"* %this, %"class.boost::unique_lock"** %this.addr, align 4
  %this1 = load %"class.boost::unique_lock"** %this.addr
  %is_locked = getelementptr inbounds %"class.boost::unique_lock"* %this1, i32 0, i32 1
  %0 = load i8* %is_locked, align 1
  %tobool = trunc i8 %0 to i1
  ret i1 %tobool
}

define linkonce_odr void @_ZN5boost5mutex6unlockEv(%"class.boost::mutex"* %this) nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::mutex"*, align 4
  %ret = alloca i32, align 4
  store %"class.boost::mutex"* %this, %"class.boost::mutex"** %this.addr, align 4
  %this1 = load %"class.boost::mutex"** %this.addr
  br label %do.body

do.body:                                          ; preds = %do.cond, %entry
  %m = getelementptr inbounds %"class.boost::mutex"* %this1, i32 0, i32 0
  %call = call i32 @pthread_mutex_unlock(%union.pthread_mutex_t* %m) nounwind
  store i32 %call, i32* %ret, align 4
  br label %do.cond

do.cond:                                          ; preds = %do.body
  %0 = load i32* %ret, align 4
  %cmp = icmp eq i32 %0, 4
  br i1 %cmp, label %do.body, label %do.end

do.end:                                           ; preds = %do.cond
  %1 = load i32* %ret, align 4
  %tobool = icmp ne i32 %1, 0
  br i1 %tobool, label %cond.false, label %cond.true

cond.true:                                        ; preds = %do.end
  br label %cond.end

cond.false:                                       ; preds = %do.end
  call void @__assert_fail(i8* getelementptr inbounds ([5 x i8]* @.str19, i32 0, i32 0), i8* getelementptr inbounds ([57 x i8]* @.str22, i32 0, i32 0), i32 79, i8* getelementptr inbounds ([28 x i8]* @__PRETTY_FUNCTION__._ZN5boost5mutex6unlockEv, i32 0, i32 0)) noreturn nounwind
  unreachable
                                                  ; No predecessors!
  br label %cond.end

cond.end:                                         ; preds = %2, %cond.true
  ret void
}

declare i32 @pthread_mutex_unlock(%union.pthread_mutex_t*) nounwind

define linkonce_odr void @_ZN5boost11unique_lockINS_5mutexEEC2ERS1_(%"class.boost::unique_lock"* %this, %"class.boost::mutex"* %m_) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::unique_lock"*, align 4
  %m_.addr = alloca %"class.boost::mutex"*, align 4
  store %"class.boost::unique_lock"* %this, %"class.boost::unique_lock"** %this.addr, align 4
  store %"class.boost::mutex"* %m_, %"class.boost::mutex"** %m_.addr, align 4
  %this1 = load %"class.boost::unique_lock"** %this.addr
  %m = getelementptr inbounds %"class.boost::unique_lock"* %this1, i32 0, i32 0
  %0 = load %"class.boost::mutex"** %m_.addr, align 4
  store %"class.boost::mutex"* %0, %"class.boost::mutex"** %m, align 4
  %is_locked = getelementptr inbounds %"class.boost::unique_lock"* %this1, i32 0, i32 1
  store i8 0, i8* %is_locked, align 1
  call void @_ZN5boost11unique_lockINS_5mutexEE4lockEv(%"class.boost::unique_lock"* %this1)
  ret void
}

define linkonce_odr void @_ZN5boost11unique_lockINS_5mutexEE4lockEv(%"class.boost::unique_lock"* %this) align 2 {
entry:
  %this.addr = alloca %"class.boost::unique_lock"*, align 4
  %ref.tmp = alloca %"class.boost::lock_error", align 4
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  %ref.tmp3 = alloca %"class.boost::lock_error", align 4
  store %"class.boost::unique_lock"* %this, %"class.boost::unique_lock"** %this.addr, align 4
  %this1 = load %"class.boost::unique_lock"** %this.addr
  %m = getelementptr inbounds %"class.boost::unique_lock"* %this1, i32 0, i32 0
  %0 = load %"class.boost::mutex"** %m, align 4
  %cmp = icmp eq %"class.boost::mutex"* %0, null
  br i1 %cmp, label %if.then, label %if.end

if.then:                                          ; preds = %entry
  call void @_ZN5boost10lock_errorC1EiPKc(%"class.boost::lock_error"* %ref.tmp, i32 1, i8* getelementptr inbounds ([31 x i8]* @.str23, i32 0, i32 0))
  invoke void @_ZN5boost15throw_exceptionINS_10lock_errorEEEvRKT_(%"class.boost::lock_error"* %ref.tmp) noreturn
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %if.then
  unreachable

lpad:                                             ; preds = %if.then
  %1 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %2 = extractvalue { i8*, i32 } %1, 0
  store i8* %2, i8** %exn.slot
  %3 = extractvalue { i8*, i32 } %1, 1
  store i32 %3, i32* %ehselector.slot
  call void @_ZN5boost10lock_errorD1Ev(%"class.boost::lock_error"* %ref.tmp) nounwind
  br label %eh.resume

if.end:                                           ; preds = %entry
  %call = call zeroext i1 @_ZNK5boost11unique_lockINS_5mutexEE9owns_lockEv(%"class.boost::unique_lock"* %this1)
  br i1 %call, label %if.then2, label %if.end6

if.then2:                                         ; preds = %if.end
  call void @_ZN5boost10lock_errorC1EiPKc(%"class.boost::lock_error"* %ref.tmp3, i32 35, i8* getelementptr inbounds ([41 x i8]* @.str24, i32 0, i32 0))
  invoke void @_ZN5boost15throw_exceptionINS_10lock_errorEEEvRKT_(%"class.boost::lock_error"* %ref.tmp3) noreturn
          to label %invoke.cont5 unwind label %lpad4

invoke.cont5:                                     ; preds = %if.then2
  unreachable

lpad4:                                            ; preds = %if.then2
  %4 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %5 = extractvalue { i8*, i32 } %4, 0
  store i8* %5, i8** %exn.slot
  %6 = extractvalue { i8*, i32 } %4, 1
  store i32 %6, i32* %ehselector.slot
  call void @_ZN5boost10lock_errorD1Ev(%"class.boost::lock_error"* %ref.tmp3) nounwind
  br label %eh.resume

if.end6:                                          ; preds = %if.end
  %m7 = getelementptr inbounds %"class.boost::unique_lock"* %this1, i32 0, i32 0
  %7 = load %"class.boost::mutex"** %m7, align 4
  call void @_ZN5boost5mutex4lockEv(%"class.boost::mutex"* %7)
  %is_locked = getelementptr inbounds %"class.boost::unique_lock"* %this1, i32 0, i32 1
  store i8 1, i8* %is_locked, align 1
  ret void

eh.resume:                                        ; preds = %lpad4, %lpad
  %exn = load i8** %exn.slot
  %sel = load i32* %ehselector.slot
  %lpad.val = insertvalue { i8*, i32 } undef, i8* %exn, 0
  %lpad.val8 = insertvalue { i8*, i32 } %lpad.val, i32 %sel, 1
  resume { i8*, i32 } %lpad.val8
}

define linkonce_odr void @_ZN5boost15throw_exceptionINS_10lock_errorEEEvRKT_(%"class.boost::lock_error"* %e) noreturn inlinehint {
entry:
  %e.addr = alloca %"class.boost::lock_error"*, align 4
  %ref.tmp = alloca %"struct.boost::exception_detail::error_info_injector.33", align 4
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  %cleanup.isactive = alloca i1
  store %"class.boost::lock_error"* %e, %"class.boost::lock_error"** %e.addr, align 4
  %0 = load %"class.boost::lock_error"** %e.addr, align 4
  %1 = bitcast %"class.boost::lock_error"* %0 to %"class.std::exception"*
  call void @_ZN5boost36throw_exception_assert_compatibilityERKSt9exception(%"class.std::exception"* %1)
  %exception = call i8* @__cxa_allocate_exception(i32 44) nounwind
  store i1 true, i1* %cleanup.isactive
  %2 = bitcast i8* %exception to %"class.boost::exception_detail::clone_impl.32"*
  %3 = load %"class.boost::lock_error"** %e.addr, align 4
  invoke void @_ZN5boost17enable_error_infoINS_10lock_errorEEENS_16exception_detail29enable_error_info_return_typeIT_E4typeERKS4_(%"struct.boost::exception_detail::error_info_injector.33"* sret %ref.tmp, %"class.boost::lock_error"* %3)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %entry
  invoke void @_ZN5boost24enable_current_exceptionINS_16exception_detail19error_info_injectorINS_10lock_errorEEEEENS1_10clone_implIT_EERKS6_(%"class.boost::exception_detail::clone_impl.32"* sret %2, %"struct.boost::exception_detail::error_info_injector.33"* %ref.tmp)
          to label %invoke.cont2 unwind label %lpad1

invoke.cont2:                                     ; preds = %invoke.cont
  store i1 false, i1* %cleanup.isactive
  invoke void @__cxa_throw(i8* %exception, i8* bitcast ({ i8*, i8*, i32, i32, i8*, i32, i8*, i32 }* @_ZTIN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_10lock_errorEEEEE to i8*), i8* bitcast (void (%"class.boost::exception_detail::clone_impl.32"*)* @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_10lock_errorEEEED1Ev to i8*)) noreturn
          to label %unreachable unwind label %lpad1

lpad:                                             ; preds = %entry
  %4 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %5 = extractvalue { i8*, i32 } %4, 0
  store i8* %5, i8** %exn.slot
  %6 = extractvalue { i8*, i32 } %4, 1
  store i32 %6, i32* %ehselector.slot
  br label %ehcleanup

lpad1:                                            ; preds = %invoke.cont2, %invoke.cont
  %7 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %8 = extractvalue { i8*, i32 } %7, 0
  store i8* %8, i8** %exn.slot
  %9 = extractvalue { i8*, i32 } %7, 1
  store i32 %9, i32* %ehselector.slot
  call void @_ZN5boost16exception_detail19error_info_injectorINS_10lock_errorEED1Ev(%"struct.boost::exception_detail::error_info_injector.33"* %ref.tmp) nounwind
  br label %ehcleanup

ehcleanup:                                        ; preds = %lpad1, %lpad
  %cleanup.is_active = load i1* %cleanup.isactive
  br i1 %cleanup.is_active, label %cleanup.action, label %cleanup.done

cleanup.action:                                   ; preds = %ehcleanup
  call void @__cxa_free_exception(i8* %exception) nounwind
  br label %cleanup.done

cleanup.done:                                     ; preds = %cleanup.action, %ehcleanup
  br label %eh.resume

return:                                           ; No predecessors!
  ret void

eh.resume:                                        ; preds = %cleanup.done
  %exn = load i8** %exn.slot
  %sel = load i32* %ehselector.slot
  %lpad.val = insertvalue { i8*, i32 } undef, i8* %exn, 0
  %lpad.val3 = insertvalue { i8*, i32 } %lpad.val, i32 %sel, 1
  resume { i8*, i32 } %lpad.val3

unreachable:                                      ; preds = %invoke.cont2
  unreachable
}

define linkonce_odr void @_ZN5boost10lock_errorC1EiPKc(%"class.boost::lock_error"* %this, i32 %ev, i8* %what_arg) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::lock_error"*, align 4
  %ev.addr = alloca i32, align 4
  %what_arg.addr = alloca i8*, align 4
  store %"class.boost::lock_error"* %this, %"class.boost::lock_error"** %this.addr, align 4
  store i32 %ev, i32* %ev.addr, align 4
  store i8* %what_arg, i8** %what_arg.addr, align 4
  %this1 = load %"class.boost::lock_error"** %this.addr
  %0 = load i32* %ev.addr, align 4
  %1 = load i8** %what_arg.addr, align 4
  call void @_ZN5boost10lock_errorC2EiPKc(%"class.boost::lock_error"* %this1, i32 %0, i8* %1)
  ret void
}

define linkonce_odr void @_ZN5boost10lock_errorD1Ev(%"class.boost::lock_error"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::lock_error"*, align 4
  store %"class.boost::lock_error"* %this, %"class.boost::lock_error"** %this.addr, align 4
  %this1 = load %"class.boost::lock_error"** %this.addr
  call void @_ZN5boost10lock_errorD2Ev(%"class.boost::lock_error"* %this1) nounwind
  ret void
}

define linkonce_odr void @_ZN5boost5mutex4lockEv(%"class.boost::mutex"* %this) align 2 {
entry:
  %this.addr = alloca %"class.boost::mutex"*, align 4
  %res = alloca i32, align 4
  %ref.tmp = alloca %"class.boost::lock_error", align 4
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  store %"class.boost::mutex"* %this, %"class.boost::mutex"** %this.addr, align 4
  %this1 = load %"class.boost::mutex"** %this.addr
  br label %do.body

do.body:                                          ; preds = %do.cond, %entry
  %m = getelementptr inbounds %"class.boost::mutex"* %this1, i32 0, i32 0
  %call = call i32 @pthread_mutex_lock(%union.pthread_mutex_t* %m) nounwind
  store i32 %call, i32* %res, align 4
  br label %do.cond

do.cond:                                          ; preds = %do.body
  %0 = load i32* %res, align 4
  %cmp = icmp eq i32 %0, 4
  br i1 %cmp, label %do.body, label %do.end

do.end:                                           ; preds = %do.cond
  %1 = load i32* %res, align 4
  %tobool = icmp ne i32 %1, 0
  br i1 %tobool, label %if.then, label %if.end

if.then:                                          ; preds = %do.end
  %2 = load i32* %res, align 4
  call void @_ZN5boost10lock_errorC1EiPKc(%"class.boost::lock_error"* %ref.tmp, i32 %2, i8* getelementptr inbounds ([47 x i8]* @.str25, i32 0, i32 0))
  invoke void @_ZN5boost15throw_exceptionINS_10lock_errorEEEvRKT_(%"class.boost::lock_error"* %ref.tmp) noreturn
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %if.then
  unreachable

lpad:                                             ; preds = %if.then
  %3 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %4 = extractvalue { i8*, i32 } %3, 0
  store i8* %4, i8** %exn.slot
  %5 = extractvalue { i8*, i32 } %3, 1
  store i32 %5, i32* %ehselector.slot
  call void @_ZN5boost10lock_errorD1Ev(%"class.boost::lock_error"* %ref.tmp) nounwind
  br label %eh.resume

if.end:                                           ; preds = %do.end
  ret void

eh.resume:                                        ; preds = %lpad
  %exn = load i8** %exn.slot
  %sel = load i32* %ehselector.slot
  %lpad.val = insertvalue { i8*, i32 } undef, i8* %exn, 0
  %lpad.val2 = insertvalue { i8*, i32 } %lpad.val, i32 %sel, 1
  resume { i8*, i32 } %lpad.val2
}

declare i32 @pthread_mutex_lock(%union.pthread_mutex_t*) nounwind

define linkonce_odr void @_ZN5boost10lock_errorD2Ev(%"class.boost::lock_error"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::lock_error"*, align 4
  store %"class.boost::lock_error"* %this, %"class.boost::lock_error"** %this.addr, align 4
  %this1 = load %"class.boost::lock_error"** %this.addr
  %0 = bitcast %"class.boost::lock_error"* %this1 to %"class.boost::thread_exception"*
  call void @_ZN5boost16thread_exceptionD2Ev(%"class.boost::thread_exception"* %0) nounwind
  ret void
}

define linkonce_odr void @_ZN5boost10lock_errorC2EiPKc(%"class.boost::lock_error"* %this, i32 %ev, i8* %what_arg) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::lock_error"*, align 4
  %ev.addr = alloca i32, align 4
  %what_arg.addr = alloca i8*, align 4
  store %"class.boost::lock_error"* %this, %"class.boost::lock_error"** %this.addr, align 4
  store i32 %ev, i32* %ev.addr, align 4
  store i8* %what_arg, i8** %what_arg.addr, align 4
  %this1 = load %"class.boost::lock_error"** %this.addr
  %0 = bitcast %"class.boost::lock_error"* %this1 to %"class.boost::thread_exception"*
  %1 = load i32* %ev.addr, align 4
  %2 = load i8** %what_arg.addr, align 4
  call void @_ZN5boost16thread_exceptionC2EiPKc(%"class.boost::thread_exception"* %0, i32 %1, i8* %2)
  %3 = bitcast %"class.boost::lock_error"* %this1 to i8***
  store i8** getelementptr inbounds ([5 x i8*]* @_ZTVN5boost10lock_errorE, i64 0, i64 2), i8*** %3
  ret void
}

define linkonce_odr void @_ZN5boost10lock_errorD0Ev(%"class.boost::lock_error"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::lock_error"*, align 4
  store %"class.boost::lock_error"* %this, %"class.boost::lock_error"** %this.addr, align 4
  %this1 = load %"class.boost::lock_error"** %this.addr
  call void @_ZN5boost10lock_errorD1Ev(%"class.boost::lock_error"* %this1) nounwind
  %0 = bitcast %"class.boost::lock_error"* %this1 to i8*
  call void @_ZdlPv(i8* %0) nounwind
  ret void
}

define linkonce_odr void @_ZN5boost24enable_current_exceptionINS_16exception_detail19error_info_injectorINS_10lock_errorEEEEENS1_10clone_implIT_EERKS6_(%"class.boost::exception_detail::clone_impl.32"* noalias sret %agg.result, %"struct.boost::exception_detail::error_info_injector.33"* %x) inlinehint {
entry:
  %x.addr = alloca %"struct.boost::exception_detail::error_info_injector.33"*, align 4
  store %"struct.boost::exception_detail::error_info_injector.33"* %x, %"struct.boost::exception_detail::error_info_injector.33"** %x.addr, align 4
  %0 = load %"struct.boost::exception_detail::error_info_injector.33"** %x.addr, align 4
  call void @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_10lock_errorEEEEC1ERKS4_(%"class.boost::exception_detail::clone_impl.32"* %agg.result, %"struct.boost::exception_detail::error_info_injector.33"* %0)
  ret void
}

define linkonce_odr void @_ZN5boost17enable_error_infoINS_10lock_errorEEENS_16exception_detail29enable_error_info_return_typeIT_E4typeERKS4_(%"struct.boost::exception_detail::error_info_injector.33"* noalias sret %agg.result, %"class.boost::lock_error"* %x) inlinehint {
entry:
  %x.addr = alloca %"class.boost::lock_error"*, align 4
  store %"class.boost::lock_error"* %x, %"class.boost::lock_error"** %x.addr, align 4
  %0 = load %"class.boost::lock_error"** %x.addr, align 4
  call void @_ZN5boost16exception_detail19error_info_injectorINS_10lock_errorEEC1ERKS2_(%"struct.boost::exception_detail::error_info_injector.33"* %agg.result, %"class.boost::lock_error"* %0)
  ret void
}

define linkonce_odr void @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_10lock_errorEEEED1Ev(%"class.boost::exception_detail::clone_impl.32"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::exception_detail::clone_impl.32"*, align 4
  store %"class.boost::exception_detail::clone_impl.32"* %this, %"class.boost::exception_detail::clone_impl.32"** %this.addr, align 4
  %this1 = load %"class.boost::exception_detail::clone_impl.32"** %this.addr
  call void @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_10lock_errorEEEED2Ev(%"class.boost::exception_detail::clone_impl.32"* %this1, i8** getelementptr inbounds ([2 x i8*]* @_ZTTN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_10lock_errorEEEEE, i64 0, i64 0)) nounwind
  %0 = bitcast %"class.boost::exception_detail::clone_impl.32"* %this1 to i8*
  %1 = getelementptr inbounds i8* %0, i64 40
  %2 = bitcast i8* %1 to %"class.boost::exception_detail::clone_base"*
  call void @_ZN5boost16exception_detail10clone_baseD2Ev(%"class.boost::exception_detail::clone_base"* %2) nounwind
  ret void
}

define linkonce_odr void @_ZN5boost16exception_detail19error_info_injectorINS_10lock_errorEED1Ev(%"struct.boost::exception_detail::error_info_injector.33"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"struct.boost::exception_detail::error_info_injector.33"*, align 4
  store %"struct.boost::exception_detail::error_info_injector.33"* %this, %"struct.boost::exception_detail::error_info_injector.33"** %this.addr, align 4
  %this1 = load %"struct.boost::exception_detail::error_info_injector.33"** %this.addr
  call void @_ZN5boost16exception_detail19error_info_injectorINS_10lock_errorEED2Ev(%"struct.boost::exception_detail::error_info_injector.33"* %this1) nounwind
  ret void
}

define linkonce_odr void @_ZN5boost16exception_detail19error_info_injectorINS_10lock_errorEED2Ev(%"struct.boost::exception_detail::error_info_injector.33"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"struct.boost::exception_detail::error_info_injector.33"*, align 4
  store %"struct.boost::exception_detail::error_info_injector.33"* %this, %"struct.boost::exception_detail::error_info_injector.33"** %this.addr, align 4
  %this1 = load %"struct.boost::exception_detail::error_info_injector.33"** %this.addr
  %0 = bitcast %"struct.boost::exception_detail::error_info_injector.33"* %this1 to i8*
  %1 = getelementptr inbounds i8* %0, i64 20
  %2 = bitcast i8* %1 to %"class.boost::exception"*
  call void @_ZN5boost9exceptionD2Ev(%"class.boost::exception"* %2) nounwind
  %3 = bitcast %"struct.boost::exception_detail::error_info_injector.33"* %this1 to %"class.boost::lock_error"*
  call void @_ZN5boost10lock_errorD2Ev(%"class.boost::lock_error"* %3) nounwind
  ret void
}

define linkonce_odr void @_ZThn20_N5boost16exception_detail19error_info_injectorINS_10lock_errorEED1Ev(%"struct.boost::exception_detail::error_info_injector.33"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"struct.boost::exception_detail::error_info_injector.33"*, align 4
  store %"struct.boost::exception_detail::error_info_injector.33"* %this, %"struct.boost::exception_detail::error_info_injector.33"** %this.addr, align 4
  %this1 = load %"struct.boost::exception_detail::error_info_injector.33"** %this.addr
  %0 = bitcast %"struct.boost::exception_detail::error_info_injector.33"* %this1 to i8*
  %1 = getelementptr inbounds i8* %0, i64 -20
  %2 = bitcast i8* %1 to %"struct.boost::exception_detail::error_info_injector.33"*
  call void @_ZN5boost16exception_detail19error_info_injectorINS_10lock_errorEED1Ev(%"struct.boost::exception_detail::error_info_injector.33"* %2) nounwind
  ret void
}

define linkonce_odr void @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_10lock_errorEEEED2Ev(%"class.boost::exception_detail::clone_impl.32"* %this, i8** %vtt) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::exception_detail::clone_impl.32"*, align 4
  %vtt.addr = alloca i8**, align 4
  store %"class.boost::exception_detail::clone_impl.32"* %this, %"class.boost::exception_detail::clone_impl.32"** %this.addr, align 4
  store i8** %vtt, i8*** %vtt.addr, align 4
  %this1 = load %"class.boost::exception_detail::clone_impl.32"** %this.addr
  %vtt2 = load i8*** %vtt.addr
  %0 = bitcast %"class.boost::exception_detail::clone_impl.32"* %this1 to %"struct.boost::exception_detail::error_info_injector.33"*
  call void @_ZN5boost16exception_detail19error_info_injectorINS_10lock_errorEED2Ev(%"struct.boost::exception_detail::error_info_injector.33"* %0) nounwind
  ret void
}

define linkonce_odr void @_ZThn20_N5boost16exception_detail10clone_implINS0_19error_info_injectorINS_10lock_errorEEEED1Ev(%"class.boost::exception_detail::clone_impl.32"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::exception_detail::clone_impl.32"*, align 4
  store %"class.boost::exception_detail::clone_impl.32"* %this, %"class.boost::exception_detail::clone_impl.32"** %this.addr, align 4
  %this1 = load %"class.boost::exception_detail::clone_impl.32"** %this.addr
  %0 = bitcast %"class.boost::exception_detail::clone_impl.32"* %this1 to i8*
  %1 = getelementptr inbounds i8* %0, i64 -20
  %2 = bitcast i8* %1 to %"class.boost::exception_detail::clone_impl.32"*
  call void @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_10lock_errorEEEED1Ev(%"class.boost::exception_detail::clone_impl.32"* %2) nounwind
  ret void
}

define linkonce_odr void @_ZTv0_n20_N5boost16exception_detail10clone_implINS0_19error_info_injectorINS_10lock_errorEEEED1Ev(%"class.boost::exception_detail::clone_impl.32"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::exception_detail::clone_impl.32"*, align 4
  store %"class.boost::exception_detail::clone_impl.32"* %this, %"class.boost::exception_detail::clone_impl.32"** %this.addr, align 4
  %this1 = load %"class.boost::exception_detail::clone_impl.32"** %this.addr
  %0 = bitcast %"class.boost::exception_detail::clone_impl.32"* %this1 to i8*
  %1 = bitcast i8* %0 to i8**
  %2 = load i8** %1
  %3 = getelementptr inbounds i8* %2, i64 -20
  %4 = bitcast i8* %3 to i32*
  %5 = load i32* %4
  %6 = getelementptr inbounds i8* %0, i32 %5
  %7 = bitcast i8* %6 to %"class.boost::exception_detail::clone_impl.32"*
  call void @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_10lock_errorEEEED1Ev(%"class.boost::exception_detail::clone_impl.32"* %7) nounwind
  ret void
}

define linkonce_odr void @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_10lock_errorEEEED0Ev(%"class.boost::exception_detail::clone_impl.32"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::exception_detail::clone_impl.32"*, align 4
  store %"class.boost::exception_detail::clone_impl.32"* %this, %"class.boost::exception_detail::clone_impl.32"** %this.addr, align 4
  %this1 = load %"class.boost::exception_detail::clone_impl.32"** %this.addr
  call void @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_10lock_errorEEEED1Ev(%"class.boost::exception_detail::clone_impl.32"* %this1) nounwind
  %0 = bitcast %"class.boost::exception_detail::clone_impl.32"* %this1 to i8*
  call void @_ZdlPv(i8* %0) nounwind
  ret void
}

define linkonce_odr %"class.boost::exception_detail::clone_base"* @_ZNK5boost16exception_detail10clone_implINS0_19error_info_injectorINS_10lock_errorEEEE5cloneEv(%"class.boost::exception_detail::clone_impl.32"* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::exception_detail::clone_impl.32"*, align 4
  %agg.tmp = alloca %"struct.boost::exception_detail::clone_impl<boost::exception_detail::error_info_injector<boost::lock_error> >::clone_tag", align 1
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  store %"class.boost::exception_detail::clone_impl.32"* %this, %"class.boost::exception_detail::clone_impl.32"** %this.addr, align 4
  %this1 = load %"class.boost::exception_detail::clone_impl.32"** %this.addr
  %call = call noalias i8* @_Znwj(i32 44)
  %0 = bitcast i8* %call to %"class.boost::exception_detail::clone_impl.32"*
  invoke void @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_10lock_errorEEEEC1ERKS5_NS5_9clone_tagE(%"class.boost::exception_detail::clone_impl.32"* %0, %"class.boost::exception_detail::clone_impl.32"* %this1)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %entry
  %1 = icmp eq %"class.boost::exception_detail::clone_impl.32"* %0, null
  br i1 %1, label %cast.end, label %cast.notnull

cast.notnull:                                     ; preds = %invoke.cont
  %2 = bitcast %"class.boost::exception_detail::clone_impl.32"* %0 to i8**
  %vtable = load i8** %2
  %vbase.offset.ptr = getelementptr i8* %vtable, i64 -12
  %3 = bitcast i8* %vbase.offset.ptr to i32*
  %vbase.offset = load i32* %3
  %4 = bitcast %"class.boost::exception_detail::clone_impl.32"* %0 to i8*
  %add.ptr = getelementptr inbounds i8* %4, i32 %vbase.offset
  %5 = bitcast i8* %add.ptr to %"class.boost::exception_detail::clone_base"*
  br label %cast.end

cast.end:                                         ; preds = %cast.notnull, %invoke.cont
  %cast.result = phi %"class.boost::exception_detail::clone_base"* [ %5, %cast.notnull ], [ null, %invoke.cont ]
  ret %"class.boost::exception_detail::clone_base"* %cast.result

lpad:                                             ; preds = %entry
  %6 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %7 = extractvalue { i8*, i32 } %6, 0
  store i8* %7, i8** %exn.slot
  %8 = extractvalue { i8*, i32 } %6, 1
  store i32 %8, i32* %ehselector.slot
  call void @_ZdlPv(i8* %call) nounwind
  br label %eh.resume

eh.resume:                                        ; preds = %lpad
  %exn = load i8** %exn.slot
  %sel = load i32* %ehselector.slot
  %lpad.val = insertvalue { i8*, i32 } undef, i8* %exn, 0
  %lpad.val2 = insertvalue { i8*, i32 } %lpad.val, i32 %sel, 1
  resume { i8*, i32 } %lpad.val2
}

define linkonce_odr void @_ZNK5boost16exception_detail10clone_implINS0_19error_info_injectorINS_10lock_errorEEEE7rethrowEv(%"class.boost::exception_detail::clone_impl.32"* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::exception_detail::clone_impl.32"*, align 4
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  store %"class.boost::exception_detail::clone_impl.32"* %this, %"class.boost::exception_detail::clone_impl.32"** %this.addr, align 4
  %this1 = load %"class.boost::exception_detail::clone_impl.32"** %this.addr
  %exception = call i8* @__cxa_allocate_exception(i32 44) nounwind
  %0 = bitcast i8* %exception to %"class.boost::exception_detail::clone_impl.32"*
  invoke void @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_10lock_errorEEEEC1ERKS5_(%"class.boost::exception_detail::clone_impl.32"* %0, %"class.boost::exception_detail::clone_impl.32"* %this1)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %entry
  call void @__cxa_throw(i8* %exception, i8* bitcast ({ i8*, i8*, i32, i32, i8*, i32, i8*, i32 }* @_ZTIN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_10lock_errorEEEEE to i8*), i8* bitcast (void (%"class.boost::exception_detail::clone_impl.32"*)* @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_10lock_errorEEEED1Ev to i8*)) noreturn
  unreachable

lpad:                                             ; preds = %entry
  %1 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %2 = extractvalue { i8*, i32 } %1, 0
  store i8* %2, i8** %exn.slot
  %3 = extractvalue { i8*, i32 } %1, 1
  store i32 %3, i32* %ehselector.slot
  call void @__cxa_free_exception(i8* %exception) nounwind
  br label %eh.resume

return:                                           ; No predecessors!
  ret void

eh.resume:                                        ; preds = %lpad
  %exn = load i8** %exn.slot
  %sel = load i32* %ehselector.slot
  %lpad.val = insertvalue { i8*, i32 } undef, i8* %exn, 0
  %lpad.val2 = insertvalue { i8*, i32 } %lpad.val, i32 %sel, 1
  resume { i8*, i32 } %lpad.val2
}

define linkonce_odr void @_ZThn20_N5boost16exception_detail10clone_implINS0_19error_info_injectorINS_10lock_errorEEEED0Ev(%"class.boost::exception_detail::clone_impl.32"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::exception_detail::clone_impl.32"*, align 4
  store %"class.boost::exception_detail::clone_impl.32"* %this, %"class.boost::exception_detail::clone_impl.32"** %this.addr, align 4
  %this1 = load %"class.boost::exception_detail::clone_impl.32"** %this.addr
  %0 = bitcast %"class.boost::exception_detail::clone_impl.32"* %this1 to i8*
  %1 = getelementptr inbounds i8* %0, i64 -20
  %2 = bitcast i8* %1 to %"class.boost::exception_detail::clone_impl.32"*
  call void @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_10lock_errorEEEED0Ev(%"class.boost::exception_detail::clone_impl.32"* %2) nounwind
  ret void
}

define linkonce_odr %"class.boost::exception_detail::clone_base"* @_ZTv0_n12_NK5boost16exception_detail10clone_implINS0_19error_info_injectorINS_10lock_errorEEEE5cloneEv(%"class.boost::exception_detail::clone_impl.32"* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::exception_detail::clone_impl.32"*, align 4
  store %"class.boost::exception_detail::clone_impl.32"* %this, %"class.boost::exception_detail::clone_impl.32"** %this.addr, align 4
  %this1 = load %"class.boost::exception_detail::clone_impl.32"** %this.addr
  %0 = bitcast %"class.boost::exception_detail::clone_impl.32"* %this1 to i8*
  %1 = bitcast i8* %0 to i8**
  %2 = load i8** %1
  %3 = getelementptr inbounds i8* %2, i64 -12
  %4 = bitcast i8* %3 to i32*
  %5 = load i32* %4
  %6 = getelementptr inbounds i8* %0, i32 %5
  %7 = bitcast i8* %6 to %"class.boost::exception_detail::clone_impl.32"*
  %call = call %"class.boost::exception_detail::clone_base"* @_ZNK5boost16exception_detail10clone_implINS0_19error_info_injectorINS_10lock_errorEEEE5cloneEv(%"class.boost::exception_detail::clone_impl.32"* %7)
  ret %"class.boost::exception_detail::clone_base"* %call
}

define linkonce_odr void @_ZTv0_n16_NK5boost16exception_detail10clone_implINS0_19error_info_injectorINS_10lock_errorEEEE7rethrowEv(%"class.boost::exception_detail::clone_impl.32"* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::exception_detail::clone_impl.32"*, align 4
  store %"class.boost::exception_detail::clone_impl.32"* %this, %"class.boost::exception_detail::clone_impl.32"** %this.addr, align 4
  %this1 = load %"class.boost::exception_detail::clone_impl.32"** %this.addr
  %0 = bitcast %"class.boost::exception_detail::clone_impl.32"* %this1 to i8*
  %1 = bitcast i8* %0 to i8**
  %2 = load i8** %1
  %3 = getelementptr inbounds i8* %2, i64 -16
  %4 = bitcast i8* %3 to i32*
  %5 = load i32* %4
  %6 = getelementptr inbounds i8* %0, i32 %5
  %7 = bitcast i8* %6 to %"class.boost::exception_detail::clone_impl.32"*
  call void @_ZNK5boost16exception_detail10clone_implINS0_19error_info_injectorINS_10lock_errorEEEE7rethrowEv(%"class.boost::exception_detail::clone_impl.32"* %7)
  ret void
}

define linkonce_odr void @_ZTv0_n20_N5boost16exception_detail10clone_implINS0_19error_info_injectorINS_10lock_errorEEEED0Ev(%"class.boost::exception_detail::clone_impl.32"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::exception_detail::clone_impl.32"*, align 4
  store %"class.boost::exception_detail::clone_impl.32"* %this, %"class.boost::exception_detail::clone_impl.32"** %this.addr, align 4
  %this1 = load %"class.boost::exception_detail::clone_impl.32"** %this.addr
  %0 = bitcast %"class.boost::exception_detail::clone_impl.32"* %this1 to i8*
  %1 = bitcast i8* %0 to i8**
  %2 = load i8** %1
  %3 = getelementptr inbounds i8* %2, i64 -20
  %4 = bitcast i8* %3 to i32*
  %5 = load i32* %4
  %6 = getelementptr inbounds i8* %0, i32 %5
  %7 = bitcast i8* %6 to %"class.boost::exception_detail::clone_impl.32"*
  call void @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_10lock_errorEEEED0Ev(%"class.boost::exception_detail::clone_impl.32"* %7) nounwind
  ret void
}

define linkonce_odr void @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_10lock_errorEEEEC1ERKS5_(%"class.boost::exception_detail::clone_impl.32"* %this, %"class.boost::exception_detail::clone_impl.32"*) unnamed_addr inlinehint align 2 {
entry:
  %this.addr = alloca %"class.boost::exception_detail::clone_impl.32"*, align 4
  %.addr = alloca %"class.boost::exception_detail::clone_impl.32"*, align 4
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  store %"class.boost::exception_detail::clone_impl.32"* %this, %"class.boost::exception_detail::clone_impl.32"** %this.addr, align 4
  store %"class.boost::exception_detail::clone_impl.32"* %0, %"class.boost::exception_detail::clone_impl.32"** %.addr, align 4
  %this1 = load %"class.boost::exception_detail::clone_impl.32"** %this.addr
  %1 = bitcast %"class.boost::exception_detail::clone_impl.32"* %this1 to i8*
  %2 = getelementptr inbounds i8* %1, i64 40
  %3 = bitcast i8* %2 to %"class.boost::exception_detail::clone_base"*
  %4 = load %"class.boost::exception_detail::clone_impl.32"** %.addr, align 4
  %5 = bitcast %"class.boost::exception_detail::clone_impl.32"* %4 to i8**
  %vtable = load i8** %5
  %vbase.offset.ptr = getelementptr i8* %vtable, i64 -12
  %6 = bitcast i8* %vbase.offset.ptr to i32*
  %vbase.offset = load i32* %6
  %7 = bitcast %"class.boost::exception_detail::clone_impl.32"* %4 to i8*
  %add.ptr = getelementptr inbounds i8* %7, i32 %vbase.offset
  %8 = bitcast i8* %add.ptr to %"class.boost::exception_detail::clone_base"*
  call void @_ZN5boost16exception_detail10clone_baseC2ERKS1_(%"class.boost::exception_detail::clone_base"* %3, %"class.boost::exception_detail::clone_base"* %8) nounwind
  %9 = bitcast %"class.boost::exception_detail::clone_impl.32"* %this1 to %"struct.boost::exception_detail::error_info_injector.33"*
  %10 = load %"class.boost::exception_detail::clone_impl.32"** %.addr, align 4
  %11 = bitcast %"class.boost::exception_detail::clone_impl.32"* %10 to %"struct.boost::exception_detail::error_info_injector.33"*
  invoke void @_ZN5boost16exception_detail19error_info_injectorINS_10lock_errorEEC2ERKS3_(%"struct.boost::exception_detail::error_info_injector.33"* %9, %"struct.boost::exception_detail::error_info_injector.33"* %11)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %entry
  %12 = bitcast %"class.boost::exception_detail::clone_impl.32"* %this1 to i8***
  store i8** getelementptr inbounds ([21 x i8*]* @_ZTVN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_10lock_errorEEEEE, i64 0, i64 3), i8*** %12
  %13 = bitcast %"class.boost::exception_detail::clone_impl.32"* %this1 to i8*
  %add.ptr2 = getelementptr inbounds i8* %13, i32 20
  %14 = bitcast i8* %add.ptr2 to i8***
  store i8** getelementptr inbounds ([21 x i8*]* @_ZTVN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_10lock_errorEEEEE, i64 0, i64 10), i8*** %14
  %15 = bitcast %"class.boost::exception_detail::clone_impl.32"* %this1 to i8*
  %add.ptr3 = getelementptr inbounds i8* %15, i32 40
  %16 = bitcast i8* %add.ptr3 to i8***
  store i8** getelementptr inbounds ([21 x i8*]* @_ZTVN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_10lock_errorEEEEE, i64 0, i64 17), i8*** %16
  ret void

lpad:                                             ; preds = %entry
  %17 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %18 = extractvalue { i8*, i32 } %17, 0
  store i8* %18, i8** %exn.slot
  %19 = extractvalue { i8*, i32 } %17, 1
  store i32 %19, i32* %ehselector.slot
  %20 = bitcast %"class.boost::exception_detail::clone_impl.32"* %this1 to i8*
  %21 = getelementptr inbounds i8* %20, i64 40
  %22 = bitcast i8* %21 to %"class.boost::exception_detail::clone_base"*
  call void @_ZN5boost16exception_detail10clone_baseD2Ev(%"class.boost::exception_detail::clone_base"* %22) nounwind
  br label %eh.resume

eh.resume:                                        ; preds = %lpad
  %exn = load i8** %exn.slot
  %sel = load i32* %ehselector.slot
  %lpad.val = insertvalue { i8*, i32 } undef, i8* %exn, 0
  %lpad.val4 = insertvalue { i8*, i32 } %lpad.val, i32 %sel, 1
  resume { i8*, i32 } %lpad.val4
}

define linkonce_odr void @_ZN5boost16exception_detail19error_info_injectorINS_10lock_errorEEC2ERKS3_(%"struct.boost::exception_detail::error_info_injector.33"* %this, %"struct.boost::exception_detail::error_info_injector.33"*) unnamed_addr inlinehint align 2 {
entry:
  %this.addr = alloca %"struct.boost::exception_detail::error_info_injector.33"*, align 4
  %.addr = alloca %"struct.boost::exception_detail::error_info_injector.33"*, align 4
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  store %"struct.boost::exception_detail::error_info_injector.33"* %this, %"struct.boost::exception_detail::error_info_injector.33"** %this.addr, align 4
  store %"struct.boost::exception_detail::error_info_injector.33"* %0, %"struct.boost::exception_detail::error_info_injector.33"** %.addr, align 4
  %this1 = load %"struct.boost::exception_detail::error_info_injector.33"** %this.addr
  %1 = bitcast %"struct.boost::exception_detail::error_info_injector.33"* %this1 to %"class.boost::lock_error"*
  %2 = load %"struct.boost::exception_detail::error_info_injector.33"** %.addr, align 4
  %3 = bitcast %"struct.boost::exception_detail::error_info_injector.33"* %2 to %"class.boost::lock_error"*
  call void @_ZN5boost10lock_errorC2ERKS0_(%"class.boost::lock_error"* %1, %"class.boost::lock_error"* %3)
  %4 = bitcast %"struct.boost::exception_detail::error_info_injector.33"* %this1 to i8*
  %5 = getelementptr inbounds i8* %4, i64 20
  %6 = bitcast i8* %5 to %"class.boost::exception"*
  %7 = load %"struct.boost::exception_detail::error_info_injector.33"** %.addr, align 4
  %8 = bitcast %"struct.boost::exception_detail::error_info_injector.33"* %7 to i8*
  %add.ptr = getelementptr inbounds i8* %8, i32 20
  %9 = bitcast i8* %add.ptr to %"class.boost::exception"*
  invoke void @_ZN5boost9exceptionC2ERKS0_(%"class.boost::exception"* %6, %"class.boost::exception"* %9)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %entry
  %10 = bitcast %"struct.boost::exception_detail::error_info_injector.33"* %this1 to i8***
  store i8** getelementptr inbounds ([9 x i8*]* @_ZTVN5boost16exception_detail19error_info_injectorINS_10lock_errorEEE, i64 0, i64 2), i8*** %10
  %11 = bitcast %"struct.boost::exception_detail::error_info_injector.33"* %this1 to i8*
  %add.ptr2 = getelementptr inbounds i8* %11, i32 20
  %12 = bitcast i8* %add.ptr2 to i8***
  store i8** getelementptr inbounds ([9 x i8*]* @_ZTVN5boost16exception_detail19error_info_injectorINS_10lock_errorEEE, i64 0, i64 7), i8*** %12
  ret void

lpad:                                             ; preds = %entry
  %13 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %14 = extractvalue { i8*, i32 } %13, 0
  store i8* %14, i8** %exn.slot
  %15 = extractvalue { i8*, i32 } %13, 1
  store i32 %15, i32* %ehselector.slot
  %16 = bitcast %"struct.boost::exception_detail::error_info_injector.33"* %this1 to %"class.boost::lock_error"*
  call void @_ZN5boost10lock_errorD2Ev(%"class.boost::lock_error"* %16) nounwind
  br label %eh.resume

eh.resume:                                        ; preds = %lpad
  %exn = load i8** %exn.slot
  %sel = load i32* %ehselector.slot
  %lpad.val = insertvalue { i8*, i32 } undef, i8* %exn, 0
  %lpad.val3 = insertvalue { i8*, i32 } %lpad.val, i32 %sel, 1
  resume { i8*, i32 } %lpad.val3
}

define linkonce_odr void @_ZN5boost10lock_errorC2ERKS0_(%"class.boost::lock_error"* %this, %"class.boost::lock_error"*) unnamed_addr inlinehint align 2 {
entry:
  %this.addr = alloca %"class.boost::lock_error"*, align 4
  %.addr = alloca %"class.boost::lock_error"*, align 4
  store %"class.boost::lock_error"* %this, %"class.boost::lock_error"** %this.addr, align 4
  store %"class.boost::lock_error"* %0, %"class.boost::lock_error"** %.addr, align 4
  %this1 = load %"class.boost::lock_error"** %this.addr
  %1 = bitcast %"class.boost::lock_error"* %this1 to %"class.boost::thread_exception"*
  %2 = load %"class.boost::lock_error"** %.addr, align 4
  %3 = bitcast %"class.boost::lock_error"* %2 to %"class.boost::thread_exception"*
  call void @_ZN5boost16thread_exceptionC2ERKS0_(%"class.boost::thread_exception"* %1, %"class.boost::thread_exception"* %3)
  %4 = bitcast %"class.boost::lock_error"* %this1 to i8***
  store i8** getelementptr inbounds ([5 x i8*]* @_ZTVN5boost10lock_errorE, i64 0, i64 2), i8*** %4
  ret void
}

define linkonce_odr void @_ZN5boost16exception_detail19error_info_injectorINS_10lock_errorEED0Ev(%"struct.boost::exception_detail::error_info_injector.33"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"struct.boost::exception_detail::error_info_injector.33"*, align 4
  store %"struct.boost::exception_detail::error_info_injector.33"* %this, %"struct.boost::exception_detail::error_info_injector.33"** %this.addr, align 4
  %this1 = load %"struct.boost::exception_detail::error_info_injector.33"** %this.addr
  call void @_ZN5boost16exception_detail19error_info_injectorINS_10lock_errorEED1Ev(%"struct.boost::exception_detail::error_info_injector.33"* %this1) nounwind
  %0 = bitcast %"struct.boost::exception_detail::error_info_injector.33"* %this1 to i8*
  call void @_ZdlPv(i8* %0) nounwind
  ret void
}

define linkonce_odr void @_ZThn20_N5boost16exception_detail19error_info_injectorINS_10lock_errorEED0Ev(%"struct.boost::exception_detail::error_info_injector.33"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"struct.boost::exception_detail::error_info_injector.33"*, align 4
  store %"struct.boost::exception_detail::error_info_injector.33"* %this, %"struct.boost::exception_detail::error_info_injector.33"** %this.addr, align 4
  %this1 = load %"struct.boost::exception_detail::error_info_injector.33"** %this.addr
  %0 = bitcast %"struct.boost::exception_detail::error_info_injector.33"* %this1 to i8*
  %1 = getelementptr inbounds i8* %0, i64 -20
  %2 = bitcast i8* %1 to %"struct.boost::exception_detail::error_info_injector.33"*
  call void @_ZN5boost16exception_detail19error_info_injectorINS_10lock_errorEED0Ev(%"struct.boost::exception_detail::error_info_injector.33"* %2) nounwind
  ret void
}

define linkonce_odr void @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_10lock_errorEEEEC1ERKS5_NS5_9clone_tagE(%"class.boost::exception_detail::clone_impl.32"* %this, %"class.boost::exception_detail::clone_impl.32"* %x) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::exception_detail::clone_impl.32"*, align 4
  %x.addr = alloca %"class.boost::exception_detail::clone_impl.32"*, align 4
  %0 = alloca %"struct.boost::exception_detail::clone_impl<boost::exception_detail::error_info_injector<boost::lock_error> >::clone_tag", align 1
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  store %"class.boost::exception_detail::clone_impl.32"* %this, %"class.boost::exception_detail::clone_impl.32"** %this.addr, align 4
  store %"class.boost::exception_detail::clone_impl.32"* %x, %"class.boost::exception_detail::clone_impl.32"** %x.addr, align 4
  %this1 = load %"class.boost::exception_detail::clone_impl.32"** %this.addr
  %1 = bitcast %"class.boost::exception_detail::clone_impl.32"* %this1 to i8*
  %2 = getelementptr inbounds i8* %1, i64 40
  %3 = bitcast i8* %2 to %"class.boost::exception_detail::clone_base"*
  call void @_ZN5boost16exception_detail10clone_baseC2Ev(%"class.boost::exception_detail::clone_base"* %3) nounwind
  %4 = bitcast %"class.boost::exception_detail::clone_impl.32"* %this1 to %"struct.boost::exception_detail::error_info_injector.33"*
  %5 = load %"class.boost::exception_detail::clone_impl.32"** %x.addr, align 4
  %6 = bitcast %"class.boost::exception_detail::clone_impl.32"* %5 to %"struct.boost::exception_detail::error_info_injector.33"*
  invoke void @_ZN5boost16exception_detail19error_info_injectorINS_10lock_errorEEC2ERKS3_(%"struct.boost::exception_detail::error_info_injector.33"* %4, %"struct.boost::exception_detail::error_info_injector.33"* %6)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %entry
  %7 = bitcast %"class.boost::exception_detail::clone_impl.32"* %this1 to i8***
  store i8** getelementptr inbounds ([21 x i8*]* @_ZTVN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_10lock_errorEEEEE, i64 0, i64 3), i8*** %7
  %8 = bitcast %"class.boost::exception_detail::clone_impl.32"* %this1 to i8*
  %add.ptr = getelementptr inbounds i8* %8, i32 20
  %9 = bitcast i8* %add.ptr to i8***
  store i8** getelementptr inbounds ([21 x i8*]* @_ZTVN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_10lock_errorEEEEE, i64 0, i64 10), i8*** %9
  %10 = bitcast %"class.boost::exception_detail::clone_impl.32"* %this1 to i8*
  %add.ptr2 = getelementptr inbounds i8* %10, i32 40
  %11 = bitcast i8* %add.ptr2 to i8***
  store i8** getelementptr inbounds ([21 x i8*]* @_ZTVN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_10lock_errorEEEEE, i64 0, i64 17), i8*** %11
  %12 = bitcast %"class.boost::exception_detail::clone_impl.32"* %this1 to i8*
  %add.ptr3 = getelementptr inbounds i8* %12, i32 20
  %13 = bitcast i8* %add.ptr3 to %"class.boost::exception"*
  %14 = load %"class.boost::exception_detail::clone_impl.32"** %x.addr, align 4
  %15 = icmp eq %"class.boost::exception_detail::clone_impl.32"* %14, null
  br i1 %15, label %cast.end, label %cast.notnull

cast.notnull:                                     ; preds = %invoke.cont
  %16 = bitcast %"class.boost::exception_detail::clone_impl.32"* %14 to i8*
  %add.ptr4 = getelementptr inbounds i8* %16, i32 20
  %17 = bitcast i8* %add.ptr4 to %"class.boost::exception"*
  br label %cast.end

cast.end:                                         ; preds = %cast.notnull, %invoke.cont
  %cast.result = phi %"class.boost::exception"* [ %17, %cast.notnull ], [ null, %invoke.cont ]
  invoke void @_ZN5boost16exception_detail20copy_boost_exceptionEPNS_9exceptionEPKS1_(%"class.boost::exception"* %13, %"class.boost::exception"* %cast.result)
          to label %invoke.cont6 unwind label %lpad5

invoke.cont6:                                     ; preds = %cast.end
  ret void

lpad:                                             ; preds = %entry
  %18 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %19 = extractvalue { i8*, i32 } %18, 0
  store i8* %19, i8** %exn.slot
  %20 = extractvalue { i8*, i32 } %18, 1
  store i32 %20, i32* %ehselector.slot
  br label %ehcleanup

lpad5:                                            ; preds = %cast.end
  %21 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %22 = extractvalue { i8*, i32 } %21, 0
  store i8* %22, i8** %exn.slot
  %23 = extractvalue { i8*, i32 } %21, 1
  store i32 %23, i32* %ehselector.slot
  %24 = bitcast %"class.boost::exception_detail::clone_impl.32"* %this1 to %"struct.boost::exception_detail::error_info_injector.33"*
  call void @_ZN5boost16exception_detail19error_info_injectorINS_10lock_errorEED2Ev(%"struct.boost::exception_detail::error_info_injector.33"* %24) nounwind
  br label %ehcleanup

ehcleanup:                                        ; preds = %lpad5, %lpad
  %25 = bitcast %"class.boost::exception_detail::clone_impl.32"* %this1 to i8*
  %26 = getelementptr inbounds i8* %25, i64 40
  %27 = bitcast i8* %26 to %"class.boost::exception_detail::clone_base"*
  call void @_ZN5boost16exception_detail10clone_baseD2Ev(%"class.boost::exception_detail::clone_base"* %27) nounwind
  br label %eh.resume

eh.resume:                                        ; preds = %ehcleanup
  %exn = load i8** %exn.slot
  %sel = load i32* %ehselector.slot
  %lpad.val = insertvalue { i8*, i32 } undef, i8* %exn, 0
  %lpad.val7 = insertvalue { i8*, i32 } %lpad.val, i32 %sel, 1
  resume { i8*, i32 } %lpad.val7
}

define linkonce_odr void @_ZN5boost16exception_detail19error_info_injectorINS_10lock_errorEEC1ERKS2_(%"struct.boost::exception_detail::error_info_injector.33"* %this, %"class.boost::lock_error"* %x) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"struct.boost::exception_detail::error_info_injector.33"*, align 4
  %x.addr = alloca %"class.boost::lock_error"*, align 4
  store %"struct.boost::exception_detail::error_info_injector.33"* %this, %"struct.boost::exception_detail::error_info_injector.33"** %this.addr, align 4
  store %"class.boost::lock_error"* %x, %"class.boost::lock_error"** %x.addr, align 4
  %this1 = load %"struct.boost::exception_detail::error_info_injector.33"** %this.addr
  %0 = load %"class.boost::lock_error"** %x.addr
  call void @_ZN5boost16exception_detail19error_info_injectorINS_10lock_errorEEC2ERKS2_(%"struct.boost::exception_detail::error_info_injector.33"* %this1, %"class.boost::lock_error"* %0)
  ret void
}

define linkonce_odr void @_ZN5boost16exception_detail19error_info_injectorINS_10lock_errorEEC2ERKS2_(%"struct.boost::exception_detail::error_info_injector.33"* %this, %"class.boost::lock_error"* %x) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"struct.boost::exception_detail::error_info_injector.33"*, align 4
  %x.addr = alloca %"class.boost::lock_error"*, align 4
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  store %"struct.boost::exception_detail::error_info_injector.33"* %this, %"struct.boost::exception_detail::error_info_injector.33"** %this.addr, align 4
  store %"class.boost::lock_error"* %x, %"class.boost::lock_error"** %x.addr, align 4
  %this1 = load %"struct.boost::exception_detail::error_info_injector.33"** %this.addr
  %0 = bitcast %"struct.boost::exception_detail::error_info_injector.33"* %this1 to %"class.boost::lock_error"*
  %1 = load %"class.boost::lock_error"** %x.addr, align 4
  call void @_ZN5boost10lock_errorC2ERKS0_(%"class.boost::lock_error"* %0, %"class.boost::lock_error"* %1)
  %2 = bitcast %"struct.boost::exception_detail::error_info_injector.33"* %this1 to i8*
  %3 = getelementptr inbounds i8* %2, i64 20
  %4 = bitcast i8* %3 to %"class.boost::exception"*
  invoke void @_ZN5boost9exceptionC2Ev(%"class.boost::exception"* %4)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %entry
  %5 = bitcast %"struct.boost::exception_detail::error_info_injector.33"* %this1 to i8***
  store i8** getelementptr inbounds ([9 x i8*]* @_ZTVN5boost16exception_detail19error_info_injectorINS_10lock_errorEEE, i64 0, i64 2), i8*** %5
  %6 = bitcast %"struct.boost::exception_detail::error_info_injector.33"* %this1 to i8*
  %add.ptr = getelementptr inbounds i8* %6, i32 20
  %7 = bitcast i8* %add.ptr to i8***
  store i8** getelementptr inbounds ([9 x i8*]* @_ZTVN5boost16exception_detail19error_info_injectorINS_10lock_errorEEE, i64 0, i64 7), i8*** %7
  ret void

lpad:                                             ; preds = %entry
  %8 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %9 = extractvalue { i8*, i32 } %8, 0
  store i8* %9, i8** %exn.slot
  %10 = extractvalue { i8*, i32 } %8, 1
  store i32 %10, i32* %ehselector.slot
  %11 = bitcast %"struct.boost::exception_detail::error_info_injector.33"* %this1 to %"class.boost::lock_error"*
  call void @_ZN5boost10lock_errorD2Ev(%"class.boost::lock_error"* %11) nounwind
  br label %eh.resume

eh.resume:                                        ; preds = %lpad
  %exn = load i8** %exn.slot
  %sel = load i32* %ehselector.slot
  %lpad.val = insertvalue { i8*, i32 } undef, i8* %exn, 0
  %lpad.val2 = insertvalue { i8*, i32 } %lpad.val, i32 %sel, 1
  resume { i8*, i32 } %lpad.val2
}

define linkonce_odr void @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_10lock_errorEEEEC1ERKS4_(%"class.boost::exception_detail::clone_impl.32"* %this, %"struct.boost::exception_detail::error_info_injector.33"* %x) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::exception_detail::clone_impl.32"*, align 4
  %x.addr = alloca %"struct.boost::exception_detail::error_info_injector.33"*, align 4
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  store %"class.boost::exception_detail::clone_impl.32"* %this, %"class.boost::exception_detail::clone_impl.32"** %this.addr, align 4
  store %"struct.boost::exception_detail::error_info_injector.33"* %x, %"struct.boost::exception_detail::error_info_injector.33"** %x.addr, align 4
  %this1 = load %"class.boost::exception_detail::clone_impl.32"** %this.addr
  %0 = bitcast %"class.boost::exception_detail::clone_impl.32"* %this1 to i8*
  %1 = getelementptr inbounds i8* %0, i64 40
  %2 = bitcast i8* %1 to %"class.boost::exception_detail::clone_base"*
  call void @_ZN5boost16exception_detail10clone_baseC2Ev(%"class.boost::exception_detail::clone_base"* %2) nounwind
  %3 = bitcast %"class.boost::exception_detail::clone_impl.32"* %this1 to %"struct.boost::exception_detail::error_info_injector.33"*
  %4 = load %"struct.boost::exception_detail::error_info_injector.33"** %x.addr, align 4
  invoke void @_ZN5boost16exception_detail19error_info_injectorINS_10lock_errorEEC2ERKS3_(%"struct.boost::exception_detail::error_info_injector.33"* %3, %"struct.boost::exception_detail::error_info_injector.33"* %4)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %entry
  %5 = bitcast %"class.boost::exception_detail::clone_impl.32"* %this1 to i8***
  store i8** getelementptr inbounds ([21 x i8*]* @_ZTVN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_10lock_errorEEEEE, i64 0, i64 3), i8*** %5
  %6 = bitcast %"class.boost::exception_detail::clone_impl.32"* %this1 to i8*
  %add.ptr = getelementptr inbounds i8* %6, i32 20
  %7 = bitcast i8* %add.ptr to i8***
  store i8** getelementptr inbounds ([21 x i8*]* @_ZTVN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_10lock_errorEEEEE, i64 0, i64 10), i8*** %7
  %8 = bitcast %"class.boost::exception_detail::clone_impl.32"* %this1 to i8*
  %add.ptr2 = getelementptr inbounds i8* %8, i32 40
  %9 = bitcast i8* %add.ptr2 to i8***
  store i8** getelementptr inbounds ([21 x i8*]* @_ZTVN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_10lock_errorEEEEE, i64 0, i64 17), i8*** %9
  %10 = bitcast %"class.boost::exception_detail::clone_impl.32"* %this1 to i8*
  %add.ptr3 = getelementptr inbounds i8* %10, i32 20
  %11 = bitcast i8* %add.ptr3 to %"class.boost::exception"*
  %12 = load %"struct.boost::exception_detail::error_info_injector.33"** %x.addr, align 4
  %13 = icmp eq %"struct.boost::exception_detail::error_info_injector.33"* %12, null
  br i1 %13, label %cast.end, label %cast.notnull

cast.notnull:                                     ; preds = %invoke.cont
  %14 = bitcast %"struct.boost::exception_detail::error_info_injector.33"* %12 to i8*
  %add.ptr4 = getelementptr inbounds i8* %14, i32 20
  %15 = bitcast i8* %add.ptr4 to %"class.boost::exception"*
  br label %cast.end

cast.end:                                         ; preds = %cast.notnull, %invoke.cont
  %cast.result = phi %"class.boost::exception"* [ %15, %cast.notnull ], [ null, %invoke.cont ]
  invoke void @_ZN5boost16exception_detail20copy_boost_exceptionEPNS_9exceptionEPKS1_(%"class.boost::exception"* %11, %"class.boost::exception"* %cast.result)
          to label %invoke.cont6 unwind label %lpad5

invoke.cont6:                                     ; preds = %cast.end
  ret void

lpad:                                             ; preds = %entry
  %16 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %17 = extractvalue { i8*, i32 } %16, 0
  store i8* %17, i8** %exn.slot
  %18 = extractvalue { i8*, i32 } %16, 1
  store i32 %18, i32* %ehselector.slot
  br label %ehcleanup

lpad5:                                            ; preds = %cast.end
  %19 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %20 = extractvalue { i8*, i32 } %19, 0
  store i8* %20, i8** %exn.slot
  %21 = extractvalue { i8*, i32 } %19, 1
  store i32 %21, i32* %ehselector.slot
  %22 = bitcast %"class.boost::exception_detail::clone_impl.32"* %this1 to %"struct.boost::exception_detail::error_info_injector.33"*
  call void @_ZN5boost16exception_detail19error_info_injectorINS_10lock_errorEED2Ev(%"struct.boost::exception_detail::error_info_injector.33"* %22) nounwind
  br label %ehcleanup

ehcleanup:                                        ; preds = %lpad5, %lpad
  %23 = bitcast %"class.boost::exception_detail::clone_impl.32"* %this1 to i8*
  %24 = getelementptr inbounds i8* %23, i64 40
  %25 = bitcast i8* %24 to %"class.boost::exception_detail::clone_base"*
  call void @_ZN5boost16exception_detail10clone_baseD2Ev(%"class.boost::exception_detail::clone_base"* %25) nounwind
  br label %eh.resume

eh.resume:                                        ; preds = %ehcleanup
  %exn = load i8** %exn.slot
  %sel = load i32* %ehselector.slot
  %lpad.val = insertvalue { i8*, i32 } undef, i8* %exn, 0
  %lpad.val7 = insertvalue { i8*, i32 } %lpad.val, i32 %sel, 1
  resume { i8*, i32 } %lpad.val7
}

define linkonce_odr zeroext i1 @_ZNK5boost6system14error_categoryeqERKS1_(%"class.boost::system::error_category"* %this, %"class.boost::system::error_category"* %rhs) nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::system::error_category"*, align 4
  %rhs.addr = alloca %"class.boost::system::error_category"*, align 4
  store %"class.boost::system::error_category"* %this, %"class.boost::system::error_category"** %this.addr, align 4
  store %"class.boost::system::error_category"* %rhs, %"class.boost::system::error_category"** %rhs.addr, align 4
  %this1 = load %"class.boost::system::error_category"** %this.addr
  %0 = load %"class.boost::system::error_category"** %rhs.addr, align 4
  %cmp = icmp eq %"class.boost::system::error_category"* %this1, %0
  ret i1 %cmp
}

define linkonce_odr %"class.boost::system::error_category"* @_ZNK5boost6system10error_code8categoryEv(%"class.boost::system::error_code"* %this) nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::system::error_code"*, align 4
  store %"class.boost::system::error_code"* %this, %"class.boost::system::error_code"** %this.addr, align 4
  %this1 = load %"class.boost::system::error_code"** %this.addr
  %m_cat = getelementptr inbounds %"class.boost::system::error_code"* %this1, i32 0, i32 1
  %0 = load %"class.boost::system::error_category"** %m_cat, align 4
  ret %"class.boost::system::error_category"* %0
}

define linkonce_odr i32 @_ZNK5boost6system10error_code5valueEv(%"class.boost::system::error_code"* %this) nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::system::error_code"*, align 4
  store %"class.boost::system::error_code"* %this, %"class.boost::system::error_code"** %this.addr, align 4
  %this1 = load %"class.boost::system::error_code"** %this.addr
  %m_val = getelementptr inbounds %"class.boost::system::error_code"* %this1, i32 0, i32 0
  %0 = load i32* %m_val, align 4
  ret i32 %0
}

define linkonce_odr zeroext i1 @_ZN5boost6systemeqERKNS0_15error_conditionES3_(%"class.boost::system::error_condition"* %lhs, %"class.boost::system::error_condition"* %rhs) nounwind inlinehint {
entry:
  %lhs.addr = alloca %"class.boost::system::error_condition"*, align 4
  %rhs.addr = alloca %"class.boost::system::error_condition"*, align 4
  store %"class.boost::system::error_condition"* %lhs, %"class.boost::system::error_condition"** %lhs.addr, align 4
  store %"class.boost::system::error_condition"* %rhs, %"class.boost::system::error_condition"** %rhs.addr, align 4
  %0 = load %"class.boost::system::error_condition"** %lhs.addr, align 4
  %m_cat = getelementptr inbounds %"class.boost::system::error_condition"* %0, i32 0, i32 1
  %1 = load %"class.boost::system::error_category"** %m_cat, align 4
  %2 = load %"class.boost::system::error_condition"** %rhs.addr, align 4
  %m_cat1 = getelementptr inbounds %"class.boost::system::error_condition"* %2, i32 0, i32 1
  %3 = load %"class.boost::system::error_category"** %m_cat1, align 4
  %cmp = icmp eq %"class.boost::system::error_category"* %1, %3
  br i1 %cmp, label %land.rhs, label %land.end

land.rhs:                                         ; preds = %entry
  %4 = load %"class.boost::system::error_condition"** %lhs.addr, align 4
  %m_val = getelementptr inbounds %"class.boost::system::error_condition"* %4, i32 0, i32 0
  %5 = load i32* %m_val, align 4
  %6 = load %"class.boost::system::error_condition"** %rhs.addr, align 4
  %m_val2 = getelementptr inbounds %"class.boost::system::error_condition"* %6, i32 0, i32 0
  %7 = load i32* %m_val2, align 4
  %cmp3 = icmp eq i32 %5, %7
  br label %land.end

land.end:                                         ; preds = %land.rhs, %entry
  %8 = phi i1 [ false, %entry ], [ %cmp3, %land.rhs ]
  ret i1 %8
}

define linkonce_odr void @_ZN5boost6system14error_categoryD2Ev(%"class.boost::system::error_category"* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::system::error_category"*, align 4
  store %"class.boost::system::error_category"* %this, %"class.boost::system::error_category"** %this.addr, align 4
  %this1 = load %"class.boost::system::error_category"** %this.addr
  %0 = bitcast %"class.boost::system::error_category"* %this1 to %"class.boost::noncopyable_::noncopyable"*
  call void @_ZN5boost12noncopyable_11noncopyableD2Ev(%"class.boost::noncopyable_::noncopyable"* %0)
  ret void
}

define linkonce_odr void @_ZN5boost12noncopyable_11noncopyableD2Ev(%"class.boost::noncopyable_::noncopyable"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::noncopyable_::noncopyable"*, align 4
  store %"class.boost::noncopyable_::noncopyable"* %this, %"class.boost::noncopyable_::noncopyable"** %this.addr, align 4
  %this1 = load %"class.boost::noncopyable_::noncopyable"** %this.addr
  ret void
}

define linkonce_odr void @_ZN5boost6threadD2Ev(%"class.boost::thread"* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::thread"*, align 4
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  store %"class.boost::thread"* %this, %"class.boost::thread"** %this.addr, align 4
  %this1 = load %"class.boost::thread"** %this.addr
  invoke void @_ZN5boost6thread6detachEv(%"class.boost::thread"* %this1)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %entry
  %thread_info = getelementptr inbounds %"class.boost::thread"* %this1, i32 0, i32 0
  call void @_ZN5boost10shared_ptrINS_6detail16thread_data_baseEED1Ev(%"class.boost::shared_ptr"* %thread_info)
  ret void

lpad:                                             ; preds = %entry
  %0 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %1 = extractvalue { i8*, i32 } %0, 0
  store i8* %1, i8** %exn.slot
  %2 = extractvalue { i8*, i32 } %0, 1
  store i32 %2, i32* %ehselector.slot
  %thread_info2 = getelementptr inbounds %"class.boost::thread"* %this1, i32 0, i32 0
  invoke void @_ZN5boost10shared_ptrINS_6detail16thread_data_baseEED1Ev(%"class.boost::shared_ptr"* %thread_info2)
          to label %invoke.cont3 unwind label %terminate.lpad

invoke.cont3:                                     ; preds = %lpad
  br label %eh.resume

eh.resume:                                        ; preds = %invoke.cont3
  %exn = load i8** %exn.slot
  %sel = load i32* %ehselector.slot
  %lpad.val = insertvalue { i8*, i32 } undef, i8* %exn, 0
  %lpad.val4 = insertvalue { i8*, i32 } %lpad.val, i32 %sel, 1
  resume { i8*, i32 } %lpad.val4

terminate.lpad:                                   ; preds = %lpad
  %3 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          catch i8* null
  call void @_ZSt9terminatev() noreturn nounwind
  unreachable
}

declare void @_ZN5boost6thread6detachEv(%"class.boost::thread"*)

define linkonce_odr void @_ZN5boost22condition_variable_any4waitINS_11unique_lockINS_5mutexEEEEEvRT_(%"class.boost::condition_variable_any"* %this, %"class.boost::unique_lock"* %m) align 2 {
entry:
  %this.addr = alloca %"class.boost::condition_variable_any"*, align 4
  %m.addr = alloca %"class.boost::unique_lock"*, align 4
  %res = alloca i32, align 4
  %guard = alloca %"struct.boost::thread_cv_detail::lock_on_exit", align 4
  %check_for_interruption = alloca %"class.boost::detail::interruption_checker", align 4
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  %ref.tmp = alloca %"class.boost::condition_error", align 4
  store %"class.boost::condition_variable_any"* %this, %"class.boost::condition_variable_any"** %this.addr, align 4
  store %"class.boost::unique_lock"* %m, %"class.boost::unique_lock"** %m.addr, align 4
  %this1 = load %"class.boost::condition_variable_any"** %this.addr
  store i32 0, i32* %res, align 4
  call void @_ZN5boost16thread_cv_detail12lock_on_exitINS_11unique_lockINS_5mutexEEEEC1Ev(%"struct.boost::thread_cv_detail::lock_on_exit"* %guard)
  %internal_mutex = getelementptr inbounds %"class.boost::condition_variable_any"* %this1, i32 0, i32 0
  %cond = getelementptr inbounds %"class.boost::condition_variable_any"* %this1, i32 0, i32 1
  invoke void @_ZN5boost6detail20interruption_checkerC1EP15pthread_mutex_tP14pthread_cond_t(%"class.boost::detail::interruption_checker"* %check_for_interruption, %union.pthread_mutex_t* %internal_mutex, %union.pthread_cond_t* %cond)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %entry
  %0 = load %"class.boost::unique_lock"** %m.addr, align 4
  invoke void @_ZN5boost16thread_cv_detail12lock_on_exitINS_11unique_lockINS_5mutexEEEE8activateERS4_(%"struct.boost::thread_cv_detail::lock_on_exit"* %guard, %"class.boost::unique_lock"* %0)
          to label %invoke.cont3 unwind label %lpad2

invoke.cont3:                                     ; preds = %invoke.cont
  %cond4 = getelementptr inbounds %"class.boost::condition_variable_any"* %this1, i32 0, i32 1
  %internal_mutex5 = getelementptr inbounds %"class.boost::condition_variable_any"* %this1, i32 0, i32 0
  %call = invoke i32 @pthread_cond_wait(%union.pthread_cond_t* %cond4, %union.pthread_mutex_t* %internal_mutex5)
          to label %invoke.cont6 unwind label %lpad2

invoke.cont6:                                     ; preds = %invoke.cont3
  store i32 %call, i32* %res, align 4
  invoke void @_ZN5boost6detail20interruption_checkerD1Ev(%"class.boost::detail::interruption_checker"* %check_for_interruption)
          to label %invoke.cont7 unwind label %lpad

invoke.cont7:                                     ; preds = %invoke.cont6
  call void @_ZN5boost16thread_cv_detail12lock_on_exitINS_11unique_lockINS_5mutexEEEED1Ev(%"struct.boost::thread_cv_detail::lock_on_exit"* %guard)
  call void @_ZN5boost11this_thread18interruption_pointEv()
  %1 = load i32* %res, align 4
  %tobool = icmp ne i32 %1, 0
  br i1 %tobool, label %if.then, label %if.end

if.then:                                          ; preds = %invoke.cont7
  %2 = load i32* %res, align 4
  call void @_ZN5boost15condition_errorC1EiPKc(%"class.boost::condition_error"* %ref.tmp, i32 %2, i8* getelementptr inbounds ([51 x i8]* @.str31, i32 0, i32 0))
  invoke void @_ZN5boost15throw_exceptionINS_15condition_errorEEEvRKT_(%"class.boost::condition_error"* %ref.tmp) noreturn
          to label %invoke.cont11 unwind label %lpad10

invoke.cont11:                                    ; preds = %if.then
  unreachable

lpad:                                             ; preds = %invoke.cont6, %entry
  %3 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %4 = extractvalue { i8*, i32 } %3, 0
  store i8* %4, i8** %exn.slot
  %5 = extractvalue { i8*, i32 } %3, 1
  store i32 %5, i32* %ehselector.slot
  br label %ehcleanup

lpad2:                                            ; preds = %invoke.cont3, %invoke.cont
  %6 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %7 = extractvalue { i8*, i32 } %6, 0
  store i8* %7, i8** %exn.slot
  %8 = extractvalue { i8*, i32 } %6, 1
  store i32 %8, i32* %ehselector.slot
  invoke void @_ZN5boost6detail20interruption_checkerD1Ev(%"class.boost::detail::interruption_checker"* %check_for_interruption)
          to label %invoke.cont8 unwind label %terminate.lpad

invoke.cont8:                                     ; preds = %lpad2
  br label %ehcleanup

ehcleanup:                                        ; preds = %invoke.cont8, %lpad
  invoke void @_ZN5boost16thread_cv_detail12lock_on_exitINS_11unique_lockINS_5mutexEEEED1Ev(%"struct.boost::thread_cv_detail::lock_on_exit"* %guard)
          to label %invoke.cont9 unwind label %terminate.lpad

invoke.cont9:                                     ; preds = %ehcleanup
  br label %eh.resume

lpad10:                                           ; preds = %if.then
  %9 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %10 = extractvalue { i8*, i32 } %9, 0
  store i8* %10, i8** %exn.slot
  %11 = extractvalue { i8*, i32 } %9, 1
  store i32 %11, i32* %ehselector.slot
  call void @_ZN5boost15condition_errorD1Ev(%"class.boost::condition_error"* %ref.tmp) nounwind
  br label %eh.resume

if.end:                                           ; preds = %invoke.cont7
  ret void

eh.resume:                                        ; preds = %lpad10, %invoke.cont9
  %exn = load i8** %exn.slot
  %sel = load i32* %ehselector.slot
  %lpad.val = insertvalue { i8*, i32 } undef, i8* %exn, 0
  %lpad.val13 = insertvalue { i8*, i32 } %lpad.val, i32 %sel, 1
  resume { i8*, i32 } %lpad.val13

terminate.lpad:                                   ; preds = %ehcleanup, %lpad2
  %12 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          catch i8* null
  call void @_ZSt9terminatev() noreturn nounwind
  unreachable
}

define linkonce_odr i32* @_ZNSt6vectorIiSaIiEEixEj(%"class.std::vector"* %this, i32 %__n) nounwind align 2 {
entry:
  %this.addr = alloca %"class.std::vector"*, align 4
  %__n.addr = alloca i32, align 4
  store %"class.std::vector"* %this, %"class.std::vector"** %this.addr, align 4
  store i32 %__n, i32* %__n.addr, align 4
  %this1 = load %"class.std::vector"** %this.addr
  %0 = bitcast %"class.std::vector"* %this1 to %"struct.std::_Vector_base"*
  %_M_impl = getelementptr inbounds %"struct.std::_Vector_base"* %0, i32 0, i32 0
  %_M_start = getelementptr inbounds %"struct.std::_Vector_base<int, std::allocator<int> >::_Vector_impl"* %_M_impl, i32 0, i32 0
  %1 = load i32** %_M_start, align 4
  %2 = load i32* %__n.addr, align 4
  %add.ptr = getelementptr inbounds i32* %1, i32 %2
  ret i32* %add.ptr
}

define linkonce_odr i32 @_ZNKSt6vectorIiSaIiEE4sizeEv(%"class.std::vector"* %this) nounwind align 2 {
entry:
  %this.addr = alloca %"class.std::vector"*, align 4
  store %"class.std::vector"* %this, %"class.std::vector"** %this.addr, align 4
  %this1 = load %"class.std::vector"** %this.addr
  %0 = bitcast %"class.std::vector"* %this1 to %"struct.std::_Vector_base"*
  %_M_impl = getelementptr inbounds %"struct.std::_Vector_base"* %0, i32 0, i32 0
  %_M_finish = getelementptr inbounds %"struct.std::_Vector_base<int, std::allocator<int> >::_Vector_impl"* %_M_impl, i32 0, i32 1
  %1 = load i32** %_M_finish, align 4
  %2 = bitcast %"class.std::vector"* %this1 to %"struct.std::_Vector_base"*
  %_M_impl2 = getelementptr inbounds %"struct.std::_Vector_base"* %2, i32 0, i32 0
  %_M_start = getelementptr inbounds %"struct.std::_Vector_base<int, std::allocator<int> >::_Vector_impl"* %_M_impl2, i32 0, i32 0
  %3 = load i32** %_M_start, align 4
  %sub.ptr.lhs.cast = ptrtoint i32* %1 to i32
  %sub.ptr.rhs.cast = ptrtoint i32* %3 to i32
  %sub.ptr.sub = sub i32 %sub.ptr.lhs.cast, %sub.ptr.rhs.cast
  %sub.ptr.div = sdiv exact i32 %sub.ptr.sub, 4
  ret i32 %sub.ptr.div
}

define linkonce_odr void @_ZN5boost22condition_variable_any10notify_oneEv(%"class.boost::condition_variable_any"* %this) align 2 {
entry:
  %this.addr = alloca %"class.boost::condition_variable_any"*, align 4
  %internal_lock = alloca %"class.boost::pthread::pthread_mutex_scoped_lock", align 4
  store %"class.boost::condition_variable_any"* %this, %"class.boost::condition_variable_any"** %this.addr, align 4
  %this1 = load %"class.boost::condition_variable_any"** %this.addr
  %internal_mutex = getelementptr inbounds %"class.boost::condition_variable_any"* %this1, i32 0, i32 0
  call void @_ZN5boost7pthread25pthread_mutex_scoped_lockC1EP15pthread_mutex_t(%"class.boost::pthread::pthread_mutex_scoped_lock"* %internal_lock, %union.pthread_mutex_t* %internal_mutex)
  %cond = getelementptr inbounds %"class.boost::condition_variable_any"* %this1, i32 0, i32 1
  %call = call i32 @pthread_cond_signal(%union.pthread_cond_t* %cond) nounwind
  %tobool = icmp ne i32 %call, 0
  br i1 %tobool, label %cond.false, label %cond.true

cond.true:                                        ; preds = %entry
  br label %cond.end

cond.false:                                       ; preds = %entry
  call void @__assert_fail(i8* getelementptr inbounds ([28 x i8]* @.str26, i32 0, i32 0), i8* getelementptr inbounds ([70 x i8]* @.str27, i32 0, i32 0), i32 294, i8* getelementptr inbounds ([49 x i8]* @__PRETTY_FUNCTION__._ZN5boost22condition_variable_any10notify_oneEv, i32 0, i32 0)) noreturn nounwind
  unreachable
                                                  ; No predecessors!
  br label %cond.end

cond.end:                                         ; preds = %0, %cond.true
  call void @_ZN5boost7pthread25pthread_mutex_scoped_lockD1Ev(%"class.boost::pthread::pthread_mutex_scoped_lock"* %internal_lock)
  ret void
}

define linkonce_odr void @_ZN5boost7pthread25pthread_mutex_scoped_lockC1EP15pthread_mutex_t(%"class.boost::pthread::pthread_mutex_scoped_lock"* %this, %union.pthread_mutex_t* %m_) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::pthread::pthread_mutex_scoped_lock"*, align 4
  %m_.addr = alloca %union.pthread_mutex_t*, align 4
  store %"class.boost::pthread::pthread_mutex_scoped_lock"* %this, %"class.boost::pthread::pthread_mutex_scoped_lock"** %this.addr, align 4
  store %union.pthread_mutex_t* %m_, %union.pthread_mutex_t** %m_.addr, align 4
  %this1 = load %"class.boost::pthread::pthread_mutex_scoped_lock"** %this.addr
  %0 = load %union.pthread_mutex_t** %m_.addr, align 4
  call void @_ZN5boost7pthread25pthread_mutex_scoped_lockC2EP15pthread_mutex_t(%"class.boost::pthread::pthread_mutex_scoped_lock"* %this1, %union.pthread_mutex_t* %0)
  ret void
}

declare i32 @pthread_cond_signal(%union.pthread_cond_t*) nounwind

define linkonce_odr void @_ZN5boost7pthread25pthread_mutex_scoped_lockD1Ev(%"class.boost::pthread::pthread_mutex_scoped_lock"* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::pthread::pthread_mutex_scoped_lock"*, align 4
  store %"class.boost::pthread::pthread_mutex_scoped_lock"* %this, %"class.boost::pthread::pthread_mutex_scoped_lock"** %this.addr, align 4
  %this1 = load %"class.boost::pthread::pthread_mutex_scoped_lock"** %this.addr
  call void @_ZN5boost7pthread25pthread_mutex_scoped_lockD2Ev(%"class.boost::pthread::pthread_mutex_scoped_lock"* %this1)
  ret void
}

define linkonce_odr void @_ZN5boost7pthread25pthread_mutex_scoped_lockD2Ev(%"class.boost::pthread::pthread_mutex_scoped_lock"* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::pthread::pthread_mutex_scoped_lock"*, align 4
  store %"class.boost::pthread::pthread_mutex_scoped_lock"* %this, %"class.boost::pthread::pthread_mutex_scoped_lock"** %this.addr, align 4
  %this1 = load %"class.boost::pthread::pthread_mutex_scoped_lock"** %this.addr
  %locked = getelementptr inbounds %"class.boost::pthread::pthread_mutex_scoped_lock"* %this1, i32 0, i32 1
  %0 = load i8* %locked, align 1
  %tobool = trunc i8 %0 to i1
  br i1 %tobool, label %if.then, label %if.end

if.then:                                          ; preds = %entry
  call void @_ZN5boost7pthread25pthread_mutex_scoped_lock6unlockEv(%"class.boost::pthread::pthread_mutex_scoped_lock"* %this1)
  br label %if.end

if.end:                                           ; preds = %if.then, %entry
  ret void
}

define linkonce_odr void @_ZN5boost7pthread25pthread_mutex_scoped_lock6unlockEv(%"class.boost::pthread::pthread_mutex_scoped_lock"* %this) nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::pthread::pthread_mutex_scoped_lock"*, align 4
  store %"class.boost::pthread::pthread_mutex_scoped_lock"* %this, %"class.boost::pthread::pthread_mutex_scoped_lock"** %this.addr, align 4
  %this1 = load %"class.boost::pthread::pthread_mutex_scoped_lock"** %this.addr
  %m = getelementptr inbounds %"class.boost::pthread::pthread_mutex_scoped_lock"* %this1, i32 0, i32 0
  %0 = load %union.pthread_mutex_t** %m, align 4
  %call = call i32 @pthread_mutex_unlock(%union.pthread_mutex_t* %0) nounwind
  %tobool = icmp ne i32 %call, 0
  br i1 %tobool, label %cond.false, label %cond.true

cond.true:                                        ; preds = %entry
  br label %cond.end

cond.false:                                       ; preds = %entry
  call void @__assert_fail(i8* getelementptr inbounds ([25 x i8]* @.str28, i32 0, i32 0), i8* getelementptr inbounds ([77 x i8]* @.str29, i32 0, i32 0), i32 30, i8* getelementptr inbounds ([57 x i8]* @__PRETTY_FUNCTION__._ZN5boost7pthread25pthread_mutex_scoped_lock6unlockEv, i32 0, i32 0)) noreturn nounwind
  unreachable
                                                  ; No predecessors!
  br label %cond.end

cond.end:                                         ; preds = %1, %cond.true
  %locked = getelementptr inbounds %"class.boost::pthread::pthread_mutex_scoped_lock"* %this1, i32 0, i32 1
  store i8 0, i8* %locked, align 1
  ret void
}

define linkonce_odr void @_ZN5boost7pthread25pthread_mutex_scoped_lockC2EP15pthread_mutex_t(%"class.boost::pthread::pthread_mutex_scoped_lock"* %this, %union.pthread_mutex_t* %m_) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::pthread::pthread_mutex_scoped_lock"*, align 4
  %m_.addr = alloca %union.pthread_mutex_t*, align 4
  store %"class.boost::pthread::pthread_mutex_scoped_lock"* %this, %"class.boost::pthread::pthread_mutex_scoped_lock"** %this.addr, align 4
  store %union.pthread_mutex_t* %m_, %union.pthread_mutex_t** %m_.addr, align 4
  %this1 = load %"class.boost::pthread::pthread_mutex_scoped_lock"** %this.addr
  %m = getelementptr inbounds %"class.boost::pthread::pthread_mutex_scoped_lock"* %this1, i32 0, i32 0
  %0 = load %union.pthread_mutex_t** %m_.addr, align 4
  store %union.pthread_mutex_t* %0, %union.pthread_mutex_t** %m, align 4
  %locked = getelementptr inbounds %"class.boost::pthread::pthread_mutex_scoped_lock"* %this1, i32 0, i32 1
  store i8 1, i8* %locked, align 1
  %m2 = getelementptr inbounds %"class.boost::pthread::pthread_mutex_scoped_lock"* %this1, i32 0, i32 0
  %1 = load %union.pthread_mutex_t** %m2, align 4
  %call = call i32 @pthread_mutex_lock(%union.pthread_mutex_t* %1) nounwind
  %tobool = icmp ne i32 %call, 0
  br i1 %tobool, label %cond.false, label %cond.true

cond.true:                                        ; preds = %entry
  br label %cond.end

cond.false:                                       ; preds = %entry
  call void @__assert_fail(i8* getelementptr inbounds ([23 x i8]* @.str30, i32 0, i32 0), i8* getelementptr inbounds ([77 x i8]* @.str29, i32 0, i32 0), i32 26, i8* getelementptr inbounds ([88 x i8]* @__PRETTY_FUNCTION__._ZN5boost7pthread25pthread_mutex_scoped_lockC2EP15pthread_mutex_t, i32 0, i32 0)) noreturn nounwind
  unreachable
                                                  ; No predecessors!
  br label %cond.end

cond.end:                                         ; preds = %2, %cond.true
  ret void
}

define linkonce_odr void @_ZN5boost16thread_cv_detail12lock_on_exitINS_11unique_lockINS_5mutexEEEEC1Ev(%"struct.boost::thread_cv_detail::lock_on_exit"* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"struct.boost::thread_cv_detail::lock_on_exit"*, align 4
  store %"struct.boost::thread_cv_detail::lock_on_exit"* %this, %"struct.boost::thread_cv_detail::lock_on_exit"** %this.addr, align 4
  %this1 = load %"struct.boost::thread_cv_detail::lock_on_exit"** %this.addr
  call void @_ZN5boost16thread_cv_detail12lock_on_exitINS_11unique_lockINS_5mutexEEEEC2Ev(%"struct.boost::thread_cv_detail::lock_on_exit"* %this1)
  ret void
}

define linkonce_odr void @_ZN5boost6detail20interruption_checkerC1EP15pthread_mutex_tP14pthread_cond_t(%"class.boost::detail::interruption_checker"* %this, %union.pthread_mutex_t* %cond_mutex, %union.pthread_cond_t* %cond) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::detail::interruption_checker"*, align 4
  %cond_mutex.addr = alloca %union.pthread_mutex_t*, align 4
  %cond.addr = alloca %union.pthread_cond_t*, align 4
  store %"class.boost::detail::interruption_checker"* %this, %"class.boost::detail::interruption_checker"** %this.addr, align 4
  store %union.pthread_mutex_t* %cond_mutex, %union.pthread_mutex_t** %cond_mutex.addr, align 4
  store %union.pthread_cond_t* %cond, %union.pthread_cond_t** %cond.addr, align 4
  %this1 = load %"class.boost::detail::interruption_checker"** %this.addr
  %0 = load %union.pthread_mutex_t** %cond_mutex.addr, align 4
  %1 = load %union.pthread_cond_t** %cond.addr, align 4
  call void @_ZN5boost6detail20interruption_checkerC2EP15pthread_mutex_tP14pthread_cond_t(%"class.boost::detail::interruption_checker"* %this1, %union.pthread_mutex_t* %0, %union.pthread_cond_t* %1)
  ret void
}

define linkonce_odr void @_ZN5boost16thread_cv_detail12lock_on_exitINS_11unique_lockINS_5mutexEEEE8activateERS4_(%"struct.boost::thread_cv_detail::lock_on_exit"* %this, %"class.boost::unique_lock"* %m_) align 2 {
entry:
  %this.addr = alloca %"struct.boost::thread_cv_detail::lock_on_exit"*, align 4
  %m_.addr = alloca %"class.boost::unique_lock"*, align 4
  store %"struct.boost::thread_cv_detail::lock_on_exit"* %this, %"struct.boost::thread_cv_detail::lock_on_exit"** %this.addr, align 4
  store %"class.boost::unique_lock"* %m_, %"class.boost::unique_lock"** %m_.addr, align 4
  %this1 = load %"struct.boost::thread_cv_detail::lock_on_exit"** %this.addr
  %0 = load %"class.boost::unique_lock"** %m_.addr, align 4
  call void @_ZN5boost11unique_lockINS_5mutexEE6unlockEv(%"class.boost::unique_lock"* %0)
  %1 = load %"class.boost::unique_lock"** %m_.addr, align 4
  %m = getelementptr inbounds %"struct.boost::thread_cv_detail::lock_on_exit"* %this1, i32 0, i32 0
  store %"class.boost::unique_lock"* %1, %"class.boost::unique_lock"** %m, align 4
  ret void
}

declare i32 @pthread_cond_wait(%union.pthread_cond_t*, %union.pthread_mutex_t*)

define linkonce_odr void @_ZN5boost6detail20interruption_checkerD1Ev(%"class.boost::detail::interruption_checker"* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::detail::interruption_checker"*, align 4
  store %"class.boost::detail::interruption_checker"* %this, %"class.boost::detail::interruption_checker"** %this.addr, align 4
  %this1 = load %"class.boost::detail::interruption_checker"** %this.addr
  call void @_ZN5boost6detail20interruption_checkerD2Ev(%"class.boost::detail::interruption_checker"* %this1)
  ret void
}

define linkonce_odr void @_ZN5boost16thread_cv_detail12lock_on_exitINS_11unique_lockINS_5mutexEEEED1Ev(%"struct.boost::thread_cv_detail::lock_on_exit"* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"struct.boost::thread_cv_detail::lock_on_exit"*, align 4
  store %"struct.boost::thread_cv_detail::lock_on_exit"* %this, %"struct.boost::thread_cv_detail::lock_on_exit"** %this.addr, align 4
  %this1 = load %"struct.boost::thread_cv_detail::lock_on_exit"** %this.addr
  call void @_ZN5boost16thread_cv_detail12lock_on_exitINS_11unique_lockINS_5mutexEEEED2Ev(%"struct.boost::thread_cv_detail::lock_on_exit"* %this1)
  ret void
}

declare void @_ZN5boost11this_thread18interruption_pointEv()

define linkonce_odr void @_ZN5boost15throw_exceptionINS_15condition_errorEEEvRKT_(%"class.boost::condition_error"* %e) noreturn inlinehint {
entry:
  %e.addr = alloca %"class.boost::condition_error"*, align 4
  %ref.tmp = alloca %"struct.boost::exception_detail::error_info_injector.36", align 4
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  %cleanup.isactive = alloca i1
  store %"class.boost::condition_error"* %e, %"class.boost::condition_error"** %e.addr, align 4
  %0 = load %"class.boost::condition_error"** %e.addr, align 4
  %1 = bitcast %"class.boost::condition_error"* %0 to %"class.std::exception"*
  call void @_ZN5boost36throw_exception_assert_compatibilityERKSt9exception(%"class.std::exception"* %1)
  %exception = call i8* @__cxa_allocate_exception(i32 44) nounwind
  store i1 true, i1* %cleanup.isactive
  %2 = bitcast i8* %exception to %"class.boost::exception_detail::clone_impl.35"*
  %3 = load %"class.boost::condition_error"** %e.addr, align 4
  invoke void @_ZN5boost17enable_error_infoINS_15condition_errorEEENS_16exception_detail29enable_error_info_return_typeIT_E4typeERKS4_(%"struct.boost::exception_detail::error_info_injector.36"* sret %ref.tmp, %"class.boost::condition_error"* %3)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %entry
  invoke void @_ZN5boost24enable_current_exceptionINS_16exception_detail19error_info_injectorINS_15condition_errorEEEEENS1_10clone_implIT_EERKS6_(%"class.boost::exception_detail::clone_impl.35"* sret %2, %"struct.boost::exception_detail::error_info_injector.36"* %ref.tmp)
          to label %invoke.cont2 unwind label %lpad1

invoke.cont2:                                     ; preds = %invoke.cont
  store i1 false, i1* %cleanup.isactive
  invoke void @__cxa_throw(i8* %exception, i8* bitcast ({ i8*, i8*, i32, i32, i8*, i32, i8*, i32 }* @_ZTIN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_15condition_errorEEEEE to i8*), i8* bitcast (void (%"class.boost::exception_detail::clone_impl.35"*)* @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_15condition_errorEEEED1Ev to i8*)) noreturn
          to label %unreachable unwind label %lpad1

lpad:                                             ; preds = %entry
  %4 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %5 = extractvalue { i8*, i32 } %4, 0
  store i8* %5, i8** %exn.slot
  %6 = extractvalue { i8*, i32 } %4, 1
  store i32 %6, i32* %ehselector.slot
  br label %ehcleanup

lpad1:                                            ; preds = %invoke.cont2, %invoke.cont
  %7 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %8 = extractvalue { i8*, i32 } %7, 0
  store i8* %8, i8** %exn.slot
  %9 = extractvalue { i8*, i32 } %7, 1
  store i32 %9, i32* %ehselector.slot
  call void @_ZN5boost16exception_detail19error_info_injectorINS_15condition_errorEED1Ev(%"struct.boost::exception_detail::error_info_injector.36"* %ref.tmp) nounwind
  br label %ehcleanup

ehcleanup:                                        ; preds = %lpad1, %lpad
  %cleanup.is_active = load i1* %cleanup.isactive
  br i1 %cleanup.is_active, label %cleanup.action, label %cleanup.done

cleanup.action:                                   ; preds = %ehcleanup
  call void @__cxa_free_exception(i8* %exception) nounwind
  br label %cleanup.done

cleanup.done:                                     ; preds = %cleanup.action, %ehcleanup
  br label %eh.resume

return:                                           ; No predecessors!
  ret void

eh.resume:                                        ; preds = %cleanup.done
  %exn = load i8** %exn.slot
  %sel = load i32* %ehselector.slot
  %lpad.val = insertvalue { i8*, i32 } undef, i8* %exn, 0
  %lpad.val3 = insertvalue { i8*, i32 } %lpad.val, i32 %sel, 1
  resume { i8*, i32 } %lpad.val3

unreachable:                                      ; preds = %invoke.cont2
  unreachable
}

define linkonce_odr void @_ZN5boost15condition_errorC1EiPKc(%"class.boost::condition_error"* %this, i32 %ev, i8* %what_arg) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::condition_error"*, align 4
  %ev.addr = alloca i32, align 4
  %what_arg.addr = alloca i8*, align 4
  store %"class.boost::condition_error"* %this, %"class.boost::condition_error"** %this.addr, align 4
  store i32 %ev, i32* %ev.addr, align 4
  store i8* %what_arg, i8** %what_arg.addr, align 4
  %this1 = load %"class.boost::condition_error"** %this.addr
  %0 = load i32* %ev.addr, align 4
  %1 = load i8** %what_arg.addr, align 4
  call void @_ZN5boost15condition_errorC2EiPKc(%"class.boost::condition_error"* %this1, i32 %0, i8* %1)
  ret void
}

define linkonce_odr void @_ZN5boost15condition_errorD1Ev(%"class.boost::condition_error"* %this) unnamed_addr nounwind inlinehint align 2 {
entry:
  %this.addr = alloca %"class.boost::condition_error"*, align 4
  store %"class.boost::condition_error"* %this, %"class.boost::condition_error"** %this.addr, align 4
  %this1 = load %"class.boost::condition_error"** %this.addr
  call void @_ZN5boost15condition_errorD2Ev(%"class.boost::condition_error"* %this1) nounwind
  ret void
}

define linkonce_odr void @_ZN5boost15condition_errorD2Ev(%"class.boost::condition_error"* %this) unnamed_addr nounwind inlinehint align 2 {
entry:
  %this.addr = alloca %"class.boost::condition_error"*, align 4
  store %"class.boost::condition_error"* %this, %"class.boost::condition_error"** %this.addr, align 4
  %this1 = load %"class.boost::condition_error"** %this.addr
  %0 = bitcast %"class.boost::condition_error"* %this1 to %"class.boost::system::system_error"*
  call void @_ZN5boost6system12system_errorD2Ev(%"class.boost::system::system_error"* %0) nounwind
  ret void
}

define linkonce_odr void @_ZN5boost15condition_errorC2EiPKc(%"class.boost::condition_error"* %this, i32 %ev, i8* %what_arg) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::condition_error"*, align 4
  %ev.addr = alloca i32, align 4
  %what_arg.addr = alloca i8*, align 4
  %agg.tmp = alloca %"class.boost::system::error_code", align 4
  store %"class.boost::condition_error"* %this, %"class.boost::condition_error"** %this.addr, align 4
  store i32 %ev, i32* %ev.addr, align 4
  store i8* %what_arg, i8** %what_arg.addr, align 4
  %this1 = load %"class.boost::condition_error"** %this.addr
  %0 = bitcast %"class.boost::condition_error"* %this1 to %"class.boost::system::system_error"*
  %1 = load i32* %ev.addr, align 4
  %call = call %"class.boost::system::error_category"* @_ZN5boost6system15system_categoryEv()
  call void @_ZN5boost6system10error_codeC1EiRKNS0_14error_categoryE(%"class.boost::system::error_code"* %agg.tmp, i32 %1, %"class.boost::system::error_category"* %call)
  %2 = load i8** %what_arg.addr, align 4
  call void @_ZN5boost6system12system_errorC2ENS0_10error_codeEPKc(%"class.boost::system::system_error"* %0, %"class.boost::system::error_code"* byval align 4 %agg.tmp, i8* %2)
  %3 = bitcast %"class.boost::condition_error"* %this1 to i8***
  store i8** getelementptr inbounds ([5 x i8*]* @_ZTVN5boost15condition_errorE, i64 0, i64 2), i8*** %3
  ret void
}

define linkonce_odr void @_ZN5boost15condition_errorD0Ev(%"class.boost::condition_error"* %this) unnamed_addr nounwind inlinehint align 2 {
entry:
  %this.addr = alloca %"class.boost::condition_error"*, align 4
  store %"class.boost::condition_error"* %this, %"class.boost::condition_error"** %this.addr, align 4
  %this1 = load %"class.boost::condition_error"** %this.addr
  call void @_ZN5boost15condition_errorD1Ev(%"class.boost::condition_error"* %this1) nounwind
  %0 = bitcast %"class.boost::condition_error"* %this1 to i8*
  call void @_ZdlPv(i8* %0) nounwind
  ret void
}

define linkonce_odr void @_ZN5boost24enable_current_exceptionINS_16exception_detail19error_info_injectorINS_15condition_errorEEEEENS1_10clone_implIT_EERKS6_(%"class.boost::exception_detail::clone_impl.35"* noalias sret %agg.result, %"struct.boost::exception_detail::error_info_injector.36"* %x) inlinehint {
entry:
  %x.addr = alloca %"struct.boost::exception_detail::error_info_injector.36"*, align 4
  store %"struct.boost::exception_detail::error_info_injector.36"* %x, %"struct.boost::exception_detail::error_info_injector.36"** %x.addr, align 4
  %0 = load %"struct.boost::exception_detail::error_info_injector.36"** %x.addr, align 4
  call void @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_15condition_errorEEEEC1ERKS4_(%"class.boost::exception_detail::clone_impl.35"* %agg.result, %"struct.boost::exception_detail::error_info_injector.36"* %0)
  ret void
}

define linkonce_odr void @_ZN5boost17enable_error_infoINS_15condition_errorEEENS_16exception_detail29enable_error_info_return_typeIT_E4typeERKS4_(%"struct.boost::exception_detail::error_info_injector.36"* noalias sret %agg.result, %"class.boost::condition_error"* %x) inlinehint {
entry:
  %x.addr = alloca %"class.boost::condition_error"*, align 4
  store %"class.boost::condition_error"* %x, %"class.boost::condition_error"** %x.addr, align 4
  %0 = load %"class.boost::condition_error"** %x.addr, align 4
  call void @_ZN5boost16exception_detail19error_info_injectorINS_15condition_errorEEC1ERKS2_(%"struct.boost::exception_detail::error_info_injector.36"* %agg.result, %"class.boost::condition_error"* %0)
  ret void
}

define linkonce_odr void @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_15condition_errorEEEED1Ev(%"class.boost::exception_detail::clone_impl.35"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::exception_detail::clone_impl.35"*, align 4
  store %"class.boost::exception_detail::clone_impl.35"* %this, %"class.boost::exception_detail::clone_impl.35"** %this.addr, align 4
  %this1 = load %"class.boost::exception_detail::clone_impl.35"** %this.addr
  call void @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_15condition_errorEEEED2Ev(%"class.boost::exception_detail::clone_impl.35"* %this1, i8** getelementptr inbounds ([2 x i8*]* @_ZTTN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_15condition_errorEEEEE, i64 0, i64 0)) nounwind
  %0 = bitcast %"class.boost::exception_detail::clone_impl.35"* %this1 to i8*
  %1 = getelementptr inbounds i8* %0, i64 40
  %2 = bitcast i8* %1 to %"class.boost::exception_detail::clone_base"*
  call void @_ZN5boost16exception_detail10clone_baseD2Ev(%"class.boost::exception_detail::clone_base"* %2) nounwind
  ret void
}

define linkonce_odr void @_ZN5boost16exception_detail19error_info_injectorINS_15condition_errorEED1Ev(%"struct.boost::exception_detail::error_info_injector.36"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"struct.boost::exception_detail::error_info_injector.36"*, align 4
  store %"struct.boost::exception_detail::error_info_injector.36"* %this, %"struct.boost::exception_detail::error_info_injector.36"** %this.addr, align 4
  %this1 = load %"struct.boost::exception_detail::error_info_injector.36"** %this.addr
  call void @_ZN5boost16exception_detail19error_info_injectorINS_15condition_errorEED2Ev(%"struct.boost::exception_detail::error_info_injector.36"* %this1) nounwind
  ret void
}

define linkonce_odr void @_ZN5boost16exception_detail19error_info_injectorINS_15condition_errorEED2Ev(%"struct.boost::exception_detail::error_info_injector.36"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"struct.boost::exception_detail::error_info_injector.36"*, align 4
  store %"struct.boost::exception_detail::error_info_injector.36"* %this, %"struct.boost::exception_detail::error_info_injector.36"** %this.addr, align 4
  %this1 = load %"struct.boost::exception_detail::error_info_injector.36"** %this.addr
  %0 = bitcast %"struct.boost::exception_detail::error_info_injector.36"* %this1 to i8*
  %1 = getelementptr inbounds i8* %0, i64 20
  %2 = bitcast i8* %1 to %"class.boost::exception"*
  call void @_ZN5boost9exceptionD2Ev(%"class.boost::exception"* %2) nounwind
  %3 = bitcast %"struct.boost::exception_detail::error_info_injector.36"* %this1 to %"class.boost::condition_error"*
  call void @_ZN5boost15condition_errorD2Ev(%"class.boost::condition_error"* %3) nounwind
  ret void
}

define linkonce_odr void @_ZThn20_N5boost16exception_detail19error_info_injectorINS_15condition_errorEED1Ev(%"struct.boost::exception_detail::error_info_injector.36"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"struct.boost::exception_detail::error_info_injector.36"*, align 4
  store %"struct.boost::exception_detail::error_info_injector.36"* %this, %"struct.boost::exception_detail::error_info_injector.36"** %this.addr, align 4
  %this1 = load %"struct.boost::exception_detail::error_info_injector.36"** %this.addr
  %0 = bitcast %"struct.boost::exception_detail::error_info_injector.36"* %this1 to i8*
  %1 = getelementptr inbounds i8* %0, i64 -20
  %2 = bitcast i8* %1 to %"struct.boost::exception_detail::error_info_injector.36"*
  call void @_ZN5boost16exception_detail19error_info_injectorINS_15condition_errorEED1Ev(%"struct.boost::exception_detail::error_info_injector.36"* %2) nounwind
  ret void
}

define linkonce_odr void @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_15condition_errorEEEED2Ev(%"class.boost::exception_detail::clone_impl.35"* %this, i8** %vtt) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::exception_detail::clone_impl.35"*, align 4
  %vtt.addr = alloca i8**, align 4
  store %"class.boost::exception_detail::clone_impl.35"* %this, %"class.boost::exception_detail::clone_impl.35"** %this.addr, align 4
  store i8** %vtt, i8*** %vtt.addr, align 4
  %this1 = load %"class.boost::exception_detail::clone_impl.35"** %this.addr
  %vtt2 = load i8*** %vtt.addr
  %0 = bitcast %"class.boost::exception_detail::clone_impl.35"* %this1 to %"struct.boost::exception_detail::error_info_injector.36"*
  call void @_ZN5boost16exception_detail19error_info_injectorINS_15condition_errorEED2Ev(%"struct.boost::exception_detail::error_info_injector.36"* %0) nounwind
  ret void
}

define linkonce_odr void @_ZThn20_N5boost16exception_detail10clone_implINS0_19error_info_injectorINS_15condition_errorEEEED1Ev(%"class.boost::exception_detail::clone_impl.35"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::exception_detail::clone_impl.35"*, align 4
  store %"class.boost::exception_detail::clone_impl.35"* %this, %"class.boost::exception_detail::clone_impl.35"** %this.addr, align 4
  %this1 = load %"class.boost::exception_detail::clone_impl.35"** %this.addr
  %0 = bitcast %"class.boost::exception_detail::clone_impl.35"* %this1 to i8*
  %1 = getelementptr inbounds i8* %0, i64 -20
  %2 = bitcast i8* %1 to %"class.boost::exception_detail::clone_impl.35"*
  call void @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_15condition_errorEEEED1Ev(%"class.boost::exception_detail::clone_impl.35"* %2) nounwind
  ret void
}

define linkonce_odr void @_ZTv0_n20_N5boost16exception_detail10clone_implINS0_19error_info_injectorINS_15condition_errorEEEED1Ev(%"class.boost::exception_detail::clone_impl.35"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::exception_detail::clone_impl.35"*, align 4
  store %"class.boost::exception_detail::clone_impl.35"* %this, %"class.boost::exception_detail::clone_impl.35"** %this.addr, align 4
  %this1 = load %"class.boost::exception_detail::clone_impl.35"** %this.addr
  %0 = bitcast %"class.boost::exception_detail::clone_impl.35"* %this1 to i8*
  %1 = bitcast i8* %0 to i8**
  %2 = load i8** %1
  %3 = getelementptr inbounds i8* %2, i64 -20
  %4 = bitcast i8* %3 to i32*
  %5 = load i32* %4
  %6 = getelementptr inbounds i8* %0, i32 %5
  %7 = bitcast i8* %6 to %"class.boost::exception_detail::clone_impl.35"*
  call void @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_15condition_errorEEEED1Ev(%"class.boost::exception_detail::clone_impl.35"* %7) nounwind
  ret void
}

define linkonce_odr void @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_15condition_errorEEEED0Ev(%"class.boost::exception_detail::clone_impl.35"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::exception_detail::clone_impl.35"*, align 4
  store %"class.boost::exception_detail::clone_impl.35"* %this, %"class.boost::exception_detail::clone_impl.35"** %this.addr, align 4
  %this1 = load %"class.boost::exception_detail::clone_impl.35"** %this.addr
  call void @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_15condition_errorEEEED1Ev(%"class.boost::exception_detail::clone_impl.35"* %this1) nounwind
  %0 = bitcast %"class.boost::exception_detail::clone_impl.35"* %this1 to i8*
  call void @_ZdlPv(i8* %0) nounwind
  ret void
}

define linkonce_odr %"class.boost::exception_detail::clone_base"* @_ZNK5boost16exception_detail10clone_implINS0_19error_info_injectorINS_15condition_errorEEEE5cloneEv(%"class.boost::exception_detail::clone_impl.35"* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::exception_detail::clone_impl.35"*, align 4
  %agg.tmp = alloca %"struct.boost::exception_detail::clone_impl<boost::exception_detail::error_info_injector<boost::condition_error> >::clone_tag", align 1
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  store %"class.boost::exception_detail::clone_impl.35"* %this, %"class.boost::exception_detail::clone_impl.35"** %this.addr, align 4
  %this1 = load %"class.boost::exception_detail::clone_impl.35"** %this.addr
  %call = call noalias i8* @_Znwj(i32 44)
  %0 = bitcast i8* %call to %"class.boost::exception_detail::clone_impl.35"*
  invoke void @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_15condition_errorEEEEC1ERKS5_NS5_9clone_tagE(%"class.boost::exception_detail::clone_impl.35"* %0, %"class.boost::exception_detail::clone_impl.35"* %this1)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %entry
  %1 = icmp eq %"class.boost::exception_detail::clone_impl.35"* %0, null
  br i1 %1, label %cast.end, label %cast.notnull

cast.notnull:                                     ; preds = %invoke.cont
  %2 = bitcast %"class.boost::exception_detail::clone_impl.35"* %0 to i8**
  %vtable = load i8** %2
  %vbase.offset.ptr = getelementptr i8* %vtable, i64 -12
  %3 = bitcast i8* %vbase.offset.ptr to i32*
  %vbase.offset = load i32* %3
  %4 = bitcast %"class.boost::exception_detail::clone_impl.35"* %0 to i8*
  %add.ptr = getelementptr inbounds i8* %4, i32 %vbase.offset
  %5 = bitcast i8* %add.ptr to %"class.boost::exception_detail::clone_base"*
  br label %cast.end

cast.end:                                         ; preds = %cast.notnull, %invoke.cont
  %cast.result = phi %"class.boost::exception_detail::clone_base"* [ %5, %cast.notnull ], [ null, %invoke.cont ]
  ret %"class.boost::exception_detail::clone_base"* %cast.result

lpad:                                             ; preds = %entry
  %6 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %7 = extractvalue { i8*, i32 } %6, 0
  store i8* %7, i8** %exn.slot
  %8 = extractvalue { i8*, i32 } %6, 1
  store i32 %8, i32* %ehselector.slot
  call void @_ZdlPv(i8* %call) nounwind
  br label %eh.resume

eh.resume:                                        ; preds = %lpad
  %exn = load i8** %exn.slot
  %sel = load i32* %ehselector.slot
  %lpad.val = insertvalue { i8*, i32 } undef, i8* %exn, 0
  %lpad.val2 = insertvalue { i8*, i32 } %lpad.val, i32 %sel, 1
  resume { i8*, i32 } %lpad.val2
}

define linkonce_odr void @_ZNK5boost16exception_detail10clone_implINS0_19error_info_injectorINS_15condition_errorEEEE7rethrowEv(%"class.boost::exception_detail::clone_impl.35"* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::exception_detail::clone_impl.35"*, align 4
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  store %"class.boost::exception_detail::clone_impl.35"* %this, %"class.boost::exception_detail::clone_impl.35"** %this.addr, align 4
  %this1 = load %"class.boost::exception_detail::clone_impl.35"** %this.addr
  %exception = call i8* @__cxa_allocate_exception(i32 44) nounwind
  %0 = bitcast i8* %exception to %"class.boost::exception_detail::clone_impl.35"*
  invoke void @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_15condition_errorEEEEC1ERKS5_(%"class.boost::exception_detail::clone_impl.35"* %0, %"class.boost::exception_detail::clone_impl.35"* %this1)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %entry
  call void @__cxa_throw(i8* %exception, i8* bitcast ({ i8*, i8*, i32, i32, i8*, i32, i8*, i32 }* @_ZTIN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_15condition_errorEEEEE to i8*), i8* bitcast (void (%"class.boost::exception_detail::clone_impl.35"*)* @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_15condition_errorEEEED1Ev to i8*)) noreturn
  unreachable

lpad:                                             ; preds = %entry
  %1 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %2 = extractvalue { i8*, i32 } %1, 0
  store i8* %2, i8** %exn.slot
  %3 = extractvalue { i8*, i32 } %1, 1
  store i32 %3, i32* %ehselector.slot
  call void @__cxa_free_exception(i8* %exception) nounwind
  br label %eh.resume

return:                                           ; No predecessors!
  ret void

eh.resume:                                        ; preds = %lpad
  %exn = load i8** %exn.slot
  %sel = load i32* %ehselector.slot
  %lpad.val = insertvalue { i8*, i32 } undef, i8* %exn, 0
  %lpad.val2 = insertvalue { i8*, i32 } %lpad.val, i32 %sel, 1
  resume { i8*, i32 } %lpad.val2
}

define linkonce_odr void @_ZThn20_N5boost16exception_detail10clone_implINS0_19error_info_injectorINS_15condition_errorEEEED0Ev(%"class.boost::exception_detail::clone_impl.35"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::exception_detail::clone_impl.35"*, align 4
  store %"class.boost::exception_detail::clone_impl.35"* %this, %"class.boost::exception_detail::clone_impl.35"** %this.addr, align 4
  %this1 = load %"class.boost::exception_detail::clone_impl.35"** %this.addr
  %0 = bitcast %"class.boost::exception_detail::clone_impl.35"* %this1 to i8*
  %1 = getelementptr inbounds i8* %0, i64 -20
  %2 = bitcast i8* %1 to %"class.boost::exception_detail::clone_impl.35"*
  call void @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_15condition_errorEEEED0Ev(%"class.boost::exception_detail::clone_impl.35"* %2) nounwind
  ret void
}

define linkonce_odr %"class.boost::exception_detail::clone_base"* @_ZTv0_n12_NK5boost16exception_detail10clone_implINS0_19error_info_injectorINS_15condition_errorEEEE5cloneEv(%"class.boost::exception_detail::clone_impl.35"* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::exception_detail::clone_impl.35"*, align 4
  store %"class.boost::exception_detail::clone_impl.35"* %this, %"class.boost::exception_detail::clone_impl.35"** %this.addr, align 4
  %this1 = load %"class.boost::exception_detail::clone_impl.35"** %this.addr
  %0 = bitcast %"class.boost::exception_detail::clone_impl.35"* %this1 to i8*
  %1 = bitcast i8* %0 to i8**
  %2 = load i8** %1
  %3 = getelementptr inbounds i8* %2, i64 -12
  %4 = bitcast i8* %3 to i32*
  %5 = load i32* %4
  %6 = getelementptr inbounds i8* %0, i32 %5
  %7 = bitcast i8* %6 to %"class.boost::exception_detail::clone_impl.35"*
  %call = call %"class.boost::exception_detail::clone_base"* @_ZNK5boost16exception_detail10clone_implINS0_19error_info_injectorINS_15condition_errorEEEE5cloneEv(%"class.boost::exception_detail::clone_impl.35"* %7)
  ret %"class.boost::exception_detail::clone_base"* %call
}

define linkonce_odr void @_ZTv0_n16_NK5boost16exception_detail10clone_implINS0_19error_info_injectorINS_15condition_errorEEEE7rethrowEv(%"class.boost::exception_detail::clone_impl.35"* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::exception_detail::clone_impl.35"*, align 4
  store %"class.boost::exception_detail::clone_impl.35"* %this, %"class.boost::exception_detail::clone_impl.35"** %this.addr, align 4
  %this1 = load %"class.boost::exception_detail::clone_impl.35"** %this.addr
  %0 = bitcast %"class.boost::exception_detail::clone_impl.35"* %this1 to i8*
  %1 = bitcast i8* %0 to i8**
  %2 = load i8** %1
  %3 = getelementptr inbounds i8* %2, i64 -16
  %4 = bitcast i8* %3 to i32*
  %5 = load i32* %4
  %6 = getelementptr inbounds i8* %0, i32 %5
  %7 = bitcast i8* %6 to %"class.boost::exception_detail::clone_impl.35"*
  call void @_ZNK5boost16exception_detail10clone_implINS0_19error_info_injectorINS_15condition_errorEEEE7rethrowEv(%"class.boost::exception_detail::clone_impl.35"* %7)
  ret void
}

define linkonce_odr void @_ZTv0_n20_N5boost16exception_detail10clone_implINS0_19error_info_injectorINS_15condition_errorEEEED0Ev(%"class.boost::exception_detail::clone_impl.35"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::exception_detail::clone_impl.35"*, align 4
  store %"class.boost::exception_detail::clone_impl.35"* %this, %"class.boost::exception_detail::clone_impl.35"** %this.addr, align 4
  %this1 = load %"class.boost::exception_detail::clone_impl.35"** %this.addr
  %0 = bitcast %"class.boost::exception_detail::clone_impl.35"* %this1 to i8*
  %1 = bitcast i8* %0 to i8**
  %2 = load i8** %1
  %3 = getelementptr inbounds i8* %2, i64 -20
  %4 = bitcast i8* %3 to i32*
  %5 = load i32* %4
  %6 = getelementptr inbounds i8* %0, i32 %5
  %7 = bitcast i8* %6 to %"class.boost::exception_detail::clone_impl.35"*
  call void @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_15condition_errorEEEED0Ev(%"class.boost::exception_detail::clone_impl.35"* %7) nounwind
  ret void
}

define linkonce_odr void @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_15condition_errorEEEEC1ERKS5_(%"class.boost::exception_detail::clone_impl.35"* %this, %"class.boost::exception_detail::clone_impl.35"*) unnamed_addr inlinehint align 2 {
entry:
  %this.addr = alloca %"class.boost::exception_detail::clone_impl.35"*, align 4
  %.addr = alloca %"class.boost::exception_detail::clone_impl.35"*, align 4
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  store %"class.boost::exception_detail::clone_impl.35"* %this, %"class.boost::exception_detail::clone_impl.35"** %this.addr, align 4
  store %"class.boost::exception_detail::clone_impl.35"* %0, %"class.boost::exception_detail::clone_impl.35"** %.addr, align 4
  %this1 = load %"class.boost::exception_detail::clone_impl.35"** %this.addr
  %1 = bitcast %"class.boost::exception_detail::clone_impl.35"* %this1 to i8*
  %2 = getelementptr inbounds i8* %1, i64 40
  %3 = bitcast i8* %2 to %"class.boost::exception_detail::clone_base"*
  %4 = load %"class.boost::exception_detail::clone_impl.35"** %.addr, align 4
  %5 = bitcast %"class.boost::exception_detail::clone_impl.35"* %4 to i8**
  %vtable = load i8** %5
  %vbase.offset.ptr = getelementptr i8* %vtable, i64 -12
  %6 = bitcast i8* %vbase.offset.ptr to i32*
  %vbase.offset = load i32* %6
  %7 = bitcast %"class.boost::exception_detail::clone_impl.35"* %4 to i8*
  %add.ptr = getelementptr inbounds i8* %7, i32 %vbase.offset
  %8 = bitcast i8* %add.ptr to %"class.boost::exception_detail::clone_base"*
  call void @_ZN5boost16exception_detail10clone_baseC2ERKS1_(%"class.boost::exception_detail::clone_base"* %3, %"class.boost::exception_detail::clone_base"* %8) nounwind
  %9 = bitcast %"class.boost::exception_detail::clone_impl.35"* %this1 to %"struct.boost::exception_detail::error_info_injector.36"*
  %10 = load %"class.boost::exception_detail::clone_impl.35"** %.addr, align 4
  %11 = bitcast %"class.boost::exception_detail::clone_impl.35"* %10 to %"struct.boost::exception_detail::error_info_injector.36"*
  invoke void @_ZN5boost16exception_detail19error_info_injectorINS_15condition_errorEEC2ERKS3_(%"struct.boost::exception_detail::error_info_injector.36"* %9, %"struct.boost::exception_detail::error_info_injector.36"* %11)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %entry
  %12 = bitcast %"class.boost::exception_detail::clone_impl.35"* %this1 to i8***
  store i8** getelementptr inbounds ([21 x i8*]* @_ZTVN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_15condition_errorEEEEE, i64 0, i64 3), i8*** %12
  %13 = bitcast %"class.boost::exception_detail::clone_impl.35"* %this1 to i8*
  %add.ptr2 = getelementptr inbounds i8* %13, i32 20
  %14 = bitcast i8* %add.ptr2 to i8***
  store i8** getelementptr inbounds ([21 x i8*]* @_ZTVN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_15condition_errorEEEEE, i64 0, i64 10), i8*** %14
  %15 = bitcast %"class.boost::exception_detail::clone_impl.35"* %this1 to i8*
  %add.ptr3 = getelementptr inbounds i8* %15, i32 40
  %16 = bitcast i8* %add.ptr3 to i8***
  store i8** getelementptr inbounds ([21 x i8*]* @_ZTVN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_15condition_errorEEEEE, i64 0, i64 17), i8*** %16
  ret void

lpad:                                             ; preds = %entry
  %17 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %18 = extractvalue { i8*, i32 } %17, 0
  store i8* %18, i8** %exn.slot
  %19 = extractvalue { i8*, i32 } %17, 1
  store i32 %19, i32* %ehselector.slot
  %20 = bitcast %"class.boost::exception_detail::clone_impl.35"* %this1 to i8*
  %21 = getelementptr inbounds i8* %20, i64 40
  %22 = bitcast i8* %21 to %"class.boost::exception_detail::clone_base"*
  call void @_ZN5boost16exception_detail10clone_baseD2Ev(%"class.boost::exception_detail::clone_base"* %22) nounwind
  br label %eh.resume

eh.resume:                                        ; preds = %lpad
  %exn = load i8** %exn.slot
  %sel = load i32* %ehselector.slot
  %lpad.val = insertvalue { i8*, i32 } undef, i8* %exn, 0
  %lpad.val4 = insertvalue { i8*, i32 } %lpad.val, i32 %sel, 1
  resume { i8*, i32 } %lpad.val4
}

define linkonce_odr void @_ZN5boost16exception_detail19error_info_injectorINS_15condition_errorEEC2ERKS3_(%"struct.boost::exception_detail::error_info_injector.36"* %this, %"struct.boost::exception_detail::error_info_injector.36"*) unnamed_addr inlinehint align 2 {
entry:
  %this.addr = alloca %"struct.boost::exception_detail::error_info_injector.36"*, align 4
  %.addr = alloca %"struct.boost::exception_detail::error_info_injector.36"*, align 4
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  store %"struct.boost::exception_detail::error_info_injector.36"* %this, %"struct.boost::exception_detail::error_info_injector.36"** %this.addr, align 4
  store %"struct.boost::exception_detail::error_info_injector.36"* %0, %"struct.boost::exception_detail::error_info_injector.36"** %.addr, align 4
  %this1 = load %"struct.boost::exception_detail::error_info_injector.36"** %this.addr
  %1 = bitcast %"struct.boost::exception_detail::error_info_injector.36"* %this1 to %"class.boost::condition_error"*
  %2 = load %"struct.boost::exception_detail::error_info_injector.36"** %.addr, align 4
  %3 = bitcast %"struct.boost::exception_detail::error_info_injector.36"* %2 to %"class.boost::condition_error"*
  call void @_ZN5boost15condition_errorC2ERKS0_(%"class.boost::condition_error"* %1, %"class.boost::condition_error"* %3)
  %4 = bitcast %"struct.boost::exception_detail::error_info_injector.36"* %this1 to i8*
  %5 = getelementptr inbounds i8* %4, i64 20
  %6 = bitcast i8* %5 to %"class.boost::exception"*
  %7 = load %"struct.boost::exception_detail::error_info_injector.36"** %.addr, align 4
  %8 = bitcast %"struct.boost::exception_detail::error_info_injector.36"* %7 to i8*
  %add.ptr = getelementptr inbounds i8* %8, i32 20
  %9 = bitcast i8* %add.ptr to %"class.boost::exception"*
  invoke void @_ZN5boost9exceptionC2ERKS0_(%"class.boost::exception"* %6, %"class.boost::exception"* %9)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %entry
  %10 = bitcast %"struct.boost::exception_detail::error_info_injector.36"* %this1 to i8***
  store i8** getelementptr inbounds ([9 x i8*]* @_ZTVN5boost16exception_detail19error_info_injectorINS_15condition_errorEEE, i64 0, i64 2), i8*** %10
  %11 = bitcast %"struct.boost::exception_detail::error_info_injector.36"* %this1 to i8*
  %add.ptr2 = getelementptr inbounds i8* %11, i32 20
  %12 = bitcast i8* %add.ptr2 to i8***
  store i8** getelementptr inbounds ([9 x i8*]* @_ZTVN5boost16exception_detail19error_info_injectorINS_15condition_errorEEE, i64 0, i64 7), i8*** %12
  ret void

lpad:                                             ; preds = %entry
  %13 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %14 = extractvalue { i8*, i32 } %13, 0
  store i8* %14, i8** %exn.slot
  %15 = extractvalue { i8*, i32 } %13, 1
  store i32 %15, i32* %ehselector.slot
  %16 = bitcast %"struct.boost::exception_detail::error_info_injector.36"* %this1 to %"class.boost::condition_error"*
  call void @_ZN5boost15condition_errorD2Ev(%"class.boost::condition_error"* %16) nounwind
  br label %eh.resume

eh.resume:                                        ; preds = %lpad
  %exn = load i8** %exn.slot
  %sel = load i32* %ehselector.slot
  %lpad.val = insertvalue { i8*, i32 } undef, i8* %exn, 0
  %lpad.val3 = insertvalue { i8*, i32 } %lpad.val, i32 %sel, 1
  resume { i8*, i32 } %lpad.val3
}

define linkonce_odr void @_ZN5boost15condition_errorC2ERKS0_(%"class.boost::condition_error"* %this, %"class.boost::condition_error"*) unnamed_addr inlinehint align 2 {
entry:
  %this.addr = alloca %"class.boost::condition_error"*, align 4
  %.addr = alloca %"class.boost::condition_error"*, align 4
  store %"class.boost::condition_error"* %this, %"class.boost::condition_error"** %this.addr, align 4
  store %"class.boost::condition_error"* %0, %"class.boost::condition_error"** %.addr, align 4
  %this1 = load %"class.boost::condition_error"** %this.addr
  %1 = bitcast %"class.boost::condition_error"* %this1 to %"class.boost::system::system_error"*
  %2 = load %"class.boost::condition_error"** %.addr, align 4
  %3 = bitcast %"class.boost::condition_error"* %2 to %"class.boost::system::system_error"*
  call void @_ZN5boost6system12system_errorC2ERKS1_(%"class.boost::system::system_error"* %1, %"class.boost::system::system_error"* %3)
  %4 = bitcast %"class.boost::condition_error"* %this1 to i8***
  store i8** getelementptr inbounds ([5 x i8*]* @_ZTVN5boost15condition_errorE, i64 0, i64 2), i8*** %4
  ret void
}

define linkonce_odr void @_ZN5boost16exception_detail19error_info_injectorINS_15condition_errorEED0Ev(%"struct.boost::exception_detail::error_info_injector.36"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"struct.boost::exception_detail::error_info_injector.36"*, align 4
  store %"struct.boost::exception_detail::error_info_injector.36"* %this, %"struct.boost::exception_detail::error_info_injector.36"** %this.addr, align 4
  %this1 = load %"struct.boost::exception_detail::error_info_injector.36"** %this.addr
  call void @_ZN5boost16exception_detail19error_info_injectorINS_15condition_errorEED1Ev(%"struct.boost::exception_detail::error_info_injector.36"* %this1) nounwind
  %0 = bitcast %"struct.boost::exception_detail::error_info_injector.36"* %this1 to i8*
  call void @_ZdlPv(i8* %0) nounwind
  ret void
}

define linkonce_odr void @_ZThn20_N5boost16exception_detail19error_info_injectorINS_15condition_errorEED0Ev(%"struct.boost::exception_detail::error_info_injector.36"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"struct.boost::exception_detail::error_info_injector.36"*, align 4
  store %"struct.boost::exception_detail::error_info_injector.36"* %this, %"struct.boost::exception_detail::error_info_injector.36"** %this.addr, align 4
  %this1 = load %"struct.boost::exception_detail::error_info_injector.36"** %this.addr
  %0 = bitcast %"struct.boost::exception_detail::error_info_injector.36"* %this1 to i8*
  %1 = getelementptr inbounds i8* %0, i64 -20
  %2 = bitcast i8* %1 to %"struct.boost::exception_detail::error_info_injector.36"*
  call void @_ZN5boost16exception_detail19error_info_injectorINS_15condition_errorEED0Ev(%"struct.boost::exception_detail::error_info_injector.36"* %2) nounwind
  ret void
}

define linkonce_odr void @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_15condition_errorEEEEC1ERKS5_NS5_9clone_tagE(%"class.boost::exception_detail::clone_impl.35"* %this, %"class.boost::exception_detail::clone_impl.35"* %x) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::exception_detail::clone_impl.35"*, align 4
  %x.addr = alloca %"class.boost::exception_detail::clone_impl.35"*, align 4
  %0 = alloca %"struct.boost::exception_detail::clone_impl<boost::exception_detail::error_info_injector<boost::condition_error> >::clone_tag", align 1
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  store %"class.boost::exception_detail::clone_impl.35"* %this, %"class.boost::exception_detail::clone_impl.35"** %this.addr, align 4
  store %"class.boost::exception_detail::clone_impl.35"* %x, %"class.boost::exception_detail::clone_impl.35"** %x.addr, align 4
  %this1 = load %"class.boost::exception_detail::clone_impl.35"** %this.addr
  %1 = bitcast %"class.boost::exception_detail::clone_impl.35"* %this1 to i8*
  %2 = getelementptr inbounds i8* %1, i64 40
  %3 = bitcast i8* %2 to %"class.boost::exception_detail::clone_base"*
  call void @_ZN5boost16exception_detail10clone_baseC2Ev(%"class.boost::exception_detail::clone_base"* %3) nounwind
  %4 = bitcast %"class.boost::exception_detail::clone_impl.35"* %this1 to %"struct.boost::exception_detail::error_info_injector.36"*
  %5 = load %"class.boost::exception_detail::clone_impl.35"** %x.addr, align 4
  %6 = bitcast %"class.boost::exception_detail::clone_impl.35"* %5 to %"struct.boost::exception_detail::error_info_injector.36"*
  invoke void @_ZN5boost16exception_detail19error_info_injectorINS_15condition_errorEEC2ERKS3_(%"struct.boost::exception_detail::error_info_injector.36"* %4, %"struct.boost::exception_detail::error_info_injector.36"* %6)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %entry
  %7 = bitcast %"class.boost::exception_detail::clone_impl.35"* %this1 to i8***
  store i8** getelementptr inbounds ([21 x i8*]* @_ZTVN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_15condition_errorEEEEE, i64 0, i64 3), i8*** %7
  %8 = bitcast %"class.boost::exception_detail::clone_impl.35"* %this1 to i8*
  %add.ptr = getelementptr inbounds i8* %8, i32 20
  %9 = bitcast i8* %add.ptr to i8***
  store i8** getelementptr inbounds ([21 x i8*]* @_ZTVN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_15condition_errorEEEEE, i64 0, i64 10), i8*** %9
  %10 = bitcast %"class.boost::exception_detail::clone_impl.35"* %this1 to i8*
  %add.ptr2 = getelementptr inbounds i8* %10, i32 40
  %11 = bitcast i8* %add.ptr2 to i8***
  store i8** getelementptr inbounds ([21 x i8*]* @_ZTVN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_15condition_errorEEEEE, i64 0, i64 17), i8*** %11
  %12 = bitcast %"class.boost::exception_detail::clone_impl.35"* %this1 to i8*
  %add.ptr3 = getelementptr inbounds i8* %12, i32 20
  %13 = bitcast i8* %add.ptr3 to %"class.boost::exception"*
  %14 = load %"class.boost::exception_detail::clone_impl.35"** %x.addr, align 4
  %15 = icmp eq %"class.boost::exception_detail::clone_impl.35"* %14, null
  br i1 %15, label %cast.end, label %cast.notnull

cast.notnull:                                     ; preds = %invoke.cont
  %16 = bitcast %"class.boost::exception_detail::clone_impl.35"* %14 to i8*
  %add.ptr4 = getelementptr inbounds i8* %16, i32 20
  %17 = bitcast i8* %add.ptr4 to %"class.boost::exception"*
  br label %cast.end

cast.end:                                         ; preds = %cast.notnull, %invoke.cont
  %cast.result = phi %"class.boost::exception"* [ %17, %cast.notnull ], [ null, %invoke.cont ]
  invoke void @_ZN5boost16exception_detail20copy_boost_exceptionEPNS_9exceptionEPKS1_(%"class.boost::exception"* %13, %"class.boost::exception"* %cast.result)
          to label %invoke.cont6 unwind label %lpad5

invoke.cont6:                                     ; preds = %cast.end
  ret void

lpad:                                             ; preds = %entry
  %18 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %19 = extractvalue { i8*, i32 } %18, 0
  store i8* %19, i8** %exn.slot
  %20 = extractvalue { i8*, i32 } %18, 1
  store i32 %20, i32* %ehselector.slot
  br label %ehcleanup

lpad5:                                            ; preds = %cast.end
  %21 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %22 = extractvalue { i8*, i32 } %21, 0
  store i8* %22, i8** %exn.slot
  %23 = extractvalue { i8*, i32 } %21, 1
  store i32 %23, i32* %ehselector.slot
  %24 = bitcast %"class.boost::exception_detail::clone_impl.35"* %this1 to %"struct.boost::exception_detail::error_info_injector.36"*
  call void @_ZN5boost16exception_detail19error_info_injectorINS_15condition_errorEED2Ev(%"struct.boost::exception_detail::error_info_injector.36"* %24) nounwind
  br label %ehcleanup

ehcleanup:                                        ; preds = %lpad5, %lpad
  %25 = bitcast %"class.boost::exception_detail::clone_impl.35"* %this1 to i8*
  %26 = getelementptr inbounds i8* %25, i64 40
  %27 = bitcast i8* %26 to %"class.boost::exception_detail::clone_base"*
  call void @_ZN5boost16exception_detail10clone_baseD2Ev(%"class.boost::exception_detail::clone_base"* %27) nounwind
  br label %eh.resume

eh.resume:                                        ; preds = %ehcleanup
  %exn = load i8** %exn.slot
  %sel = load i32* %ehselector.slot
  %lpad.val = insertvalue { i8*, i32 } undef, i8* %exn, 0
  %lpad.val7 = insertvalue { i8*, i32 } %lpad.val, i32 %sel, 1
  resume { i8*, i32 } %lpad.val7
}

define linkonce_odr void @_ZN5boost16exception_detail19error_info_injectorINS_15condition_errorEEC1ERKS2_(%"struct.boost::exception_detail::error_info_injector.36"* %this, %"class.boost::condition_error"* %x) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"struct.boost::exception_detail::error_info_injector.36"*, align 4
  %x.addr = alloca %"class.boost::condition_error"*, align 4
  store %"struct.boost::exception_detail::error_info_injector.36"* %this, %"struct.boost::exception_detail::error_info_injector.36"** %this.addr, align 4
  store %"class.boost::condition_error"* %x, %"class.boost::condition_error"** %x.addr, align 4
  %this1 = load %"struct.boost::exception_detail::error_info_injector.36"** %this.addr
  %0 = load %"class.boost::condition_error"** %x.addr
  call void @_ZN5boost16exception_detail19error_info_injectorINS_15condition_errorEEC2ERKS2_(%"struct.boost::exception_detail::error_info_injector.36"* %this1, %"class.boost::condition_error"* %0)
  ret void
}

define linkonce_odr void @_ZN5boost16exception_detail19error_info_injectorINS_15condition_errorEEC2ERKS2_(%"struct.boost::exception_detail::error_info_injector.36"* %this, %"class.boost::condition_error"* %x) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"struct.boost::exception_detail::error_info_injector.36"*, align 4
  %x.addr = alloca %"class.boost::condition_error"*, align 4
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  store %"struct.boost::exception_detail::error_info_injector.36"* %this, %"struct.boost::exception_detail::error_info_injector.36"** %this.addr, align 4
  store %"class.boost::condition_error"* %x, %"class.boost::condition_error"** %x.addr, align 4
  %this1 = load %"struct.boost::exception_detail::error_info_injector.36"** %this.addr
  %0 = bitcast %"struct.boost::exception_detail::error_info_injector.36"* %this1 to %"class.boost::condition_error"*
  %1 = load %"class.boost::condition_error"** %x.addr, align 4
  call void @_ZN5boost15condition_errorC2ERKS0_(%"class.boost::condition_error"* %0, %"class.boost::condition_error"* %1)
  %2 = bitcast %"struct.boost::exception_detail::error_info_injector.36"* %this1 to i8*
  %3 = getelementptr inbounds i8* %2, i64 20
  %4 = bitcast i8* %3 to %"class.boost::exception"*
  invoke void @_ZN5boost9exceptionC2Ev(%"class.boost::exception"* %4)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %entry
  %5 = bitcast %"struct.boost::exception_detail::error_info_injector.36"* %this1 to i8***
  store i8** getelementptr inbounds ([9 x i8*]* @_ZTVN5boost16exception_detail19error_info_injectorINS_15condition_errorEEE, i64 0, i64 2), i8*** %5
  %6 = bitcast %"struct.boost::exception_detail::error_info_injector.36"* %this1 to i8*
  %add.ptr = getelementptr inbounds i8* %6, i32 20
  %7 = bitcast i8* %add.ptr to i8***
  store i8** getelementptr inbounds ([9 x i8*]* @_ZTVN5boost16exception_detail19error_info_injectorINS_15condition_errorEEE, i64 0, i64 7), i8*** %7
  ret void

lpad:                                             ; preds = %entry
  %8 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %9 = extractvalue { i8*, i32 } %8, 0
  store i8* %9, i8** %exn.slot
  %10 = extractvalue { i8*, i32 } %8, 1
  store i32 %10, i32* %ehselector.slot
  %11 = bitcast %"struct.boost::exception_detail::error_info_injector.36"* %this1 to %"class.boost::condition_error"*
  call void @_ZN5boost15condition_errorD2Ev(%"class.boost::condition_error"* %11) nounwind
  br label %eh.resume

eh.resume:                                        ; preds = %lpad
  %exn = load i8** %exn.slot
  %sel = load i32* %ehselector.slot
  %lpad.val = insertvalue { i8*, i32 } undef, i8* %exn, 0
  %lpad.val2 = insertvalue { i8*, i32 } %lpad.val, i32 %sel, 1
  resume { i8*, i32 } %lpad.val2
}

define linkonce_odr void @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_15condition_errorEEEEC1ERKS4_(%"class.boost::exception_detail::clone_impl.35"* %this, %"struct.boost::exception_detail::error_info_injector.36"* %x) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::exception_detail::clone_impl.35"*, align 4
  %x.addr = alloca %"struct.boost::exception_detail::error_info_injector.36"*, align 4
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  store %"class.boost::exception_detail::clone_impl.35"* %this, %"class.boost::exception_detail::clone_impl.35"** %this.addr, align 4
  store %"struct.boost::exception_detail::error_info_injector.36"* %x, %"struct.boost::exception_detail::error_info_injector.36"** %x.addr, align 4
  %this1 = load %"class.boost::exception_detail::clone_impl.35"** %this.addr
  %0 = bitcast %"class.boost::exception_detail::clone_impl.35"* %this1 to i8*
  %1 = getelementptr inbounds i8* %0, i64 40
  %2 = bitcast i8* %1 to %"class.boost::exception_detail::clone_base"*
  call void @_ZN5boost16exception_detail10clone_baseC2Ev(%"class.boost::exception_detail::clone_base"* %2) nounwind
  %3 = bitcast %"class.boost::exception_detail::clone_impl.35"* %this1 to %"struct.boost::exception_detail::error_info_injector.36"*
  %4 = load %"struct.boost::exception_detail::error_info_injector.36"** %x.addr, align 4
  invoke void @_ZN5boost16exception_detail19error_info_injectorINS_15condition_errorEEC2ERKS3_(%"struct.boost::exception_detail::error_info_injector.36"* %3, %"struct.boost::exception_detail::error_info_injector.36"* %4)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %entry
  %5 = bitcast %"class.boost::exception_detail::clone_impl.35"* %this1 to i8***
  store i8** getelementptr inbounds ([21 x i8*]* @_ZTVN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_15condition_errorEEEEE, i64 0, i64 3), i8*** %5
  %6 = bitcast %"class.boost::exception_detail::clone_impl.35"* %this1 to i8*
  %add.ptr = getelementptr inbounds i8* %6, i32 20
  %7 = bitcast i8* %add.ptr to i8***
  store i8** getelementptr inbounds ([21 x i8*]* @_ZTVN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_15condition_errorEEEEE, i64 0, i64 10), i8*** %7
  %8 = bitcast %"class.boost::exception_detail::clone_impl.35"* %this1 to i8*
  %add.ptr2 = getelementptr inbounds i8* %8, i32 40
  %9 = bitcast i8* %add.ptr2 to i8***
  store i8** getelementptr inbounds ([21 x i8*]* @_ZTVN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_15condition_errorEEEEE, i64 0, i64 17), i8*** %9
  %10 = bitcast %"class.boost::exception_detail::clone_impl.35"* %this1 to i8*
  %add.ptr3 = getelementptr inbounds i8* %10, i32 20
  %11 = bitcast i8* %add.ptr3 to %"class.boost::exception"*
  %12 = load %"struct.boost::exception_detail::error_info_injector.36"** %x.addr, align 4
  %13 = icmp eq %"struct.boost::exception_detail::error_info_injector.36"* %12, null
  br i1 %13, label %cast.end, label %cast.notnull

cast.notnull:                                     ; preds = %invoke.cont
  %14 = bitcast %"struct.boost::exception_detail::error_info_injector.36"* %12 to i8*
  %add.ptr4 = getelementptr inbounds i8* %14, i32 20
  %15 = bitcast i8* %add.ptr4 to %"class.boost::exception"*
  br label %cast.end

cast.end:                                         ; preds = %cast.notnull, %invoke.cont
  %cast.result = phi %"class.boost::exception"* [ %15, %cast.notnull ], [ null, %invoke.cont ]
  invoke void @_ZN5boost16exception_detail20copy_boost_exceptionEPNS_9exceptionEPKS1_(%"class.boost::exception"* %11, %"class.boost::exception"* %cast.result)
          to label %invoke.cont6 unwind label %lpad5

invoke.cont6:                                     ; preds = %cast.end
  ret void

lpad:                                             ; preds = %entry
  %16 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %17 = extractvalue { i8*, i32 } %16, 0
  store i8* %17, i8** %exn.slot
  %18 = extractvalue { i8*, i32 } %16, 1
  store i32 %18, i32* %ehselector.slot
  br label %ehcleanup

lpad5:                                            ; preds = %cast.end
  %19 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %20 = extractvalue { i8*, i32 } %19, 0
  store i8* %20, i8** %exn.slot
  %21 = extractvalue { i8*, i32 } %19, 1
  store i32 %21, i32* %ehselector.slot
  %22 = bitcast %"class.boost::exception_detail::clone_impl.35"* %this1 to %"struct.boost::exception_detail::error_info_injector.36"*
  call void @_ZN5boost16exception_detail19error_info_injectorINS_15condition_errorEED2Ev(%"struct.boost::exception_detail::error_info_injector.36"* %22) nounwind
  br label %ehcleanup

ehcleanup:                                        ; preds = %lpad5, %lpad
  %23 = bitcast %"class.boost::exception_detail::clone_impl.35"* %this1 to i8*
  %24 = getelementptr inbounds i8* %23, i64 40
  %25 = bitcast i8* %24 to %"class.boost::exception_detail::clone_base"*
  call void @_ZN5boost16exception_detail10clone_baseD2Ev(%"class.boost::exception_detail::clone_base"* %25) nounwind
  br label %eh.resume

eh.resume:                                        ; preds = %ehcleanup
  %exn = load i8** %exn.slot
  %sel = load i32* %ehselector.slot
  %lpad.val = insertvalue { i8*, i32 } undef, i8* %exn, 0
  %lpad.val7 = insertvalue { i8*, i32 } %lpad.val, i32 %sel, 1
  resume { i8*, i32 } %lpad.val7
}

define linkonce_odr void @_ZN5boost16thread_cv_detail12lock_on_exitINS_11unique_lockINS_5mutexEEEED2Ev(%"struct.boost::thread_cv_detail::lock_on_exit"* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"struct.boost::thread_cv_detail::lock_on_exit"*, align 4
  store %"struct.boost::thread_cv_detail::lock_on_exit"* %this, %"struct.boost::thread_cv_detail::lock_on_exit"** %this.addr, align 4
  %this1 = load %"struct.boost::thread_cv_detail::lock_on_exit"** %this.addr
  %m = getelementptr inbounds %"struct.boost::thread_cv_detail::lock_on_exit"* %this1, i32 0, i32 0
  %0 = load %"class.boost::unique_lock"** %m, align 4
  %tobool = icmp ne %"class.boost::unique_lock"* %0, null
  br i1 %tobool, label %if.then, label %if.end

if.then:                                          ; preds = %entry
  %m2 = getelementptr inbounds %"struct.boost::thread_cv_detail::lock_on_exit"* %this1, i32 0, i32 0
  %1 = load %"class.boost::unique_lock"** %m2, align 4
  call void @_ZN5boost11unique_lockINS_5mutexEE4lockEv(%"class.boost::unique_lock"* %1)
  br label %if.end

if.end:                                           ; preds = %if.then, %entry
  ret void
}

define linkonce_odr void @_ZN5boost6detail20interruption_checkerD2Ev(%"class.boost::detail::interruption_checker"* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::detail::interruption_checker"*, align 4
  %guard = alloca %"class.boost::lock_guard", align 4
  store %"class.boost::detail::interruption_checker"* %this, %"class.boost::detail::interruption_checker"** %this.addr, align 4
  %this1 = load %"class.boost::detail::interruption_checker"** %this.addr
  %set = getelementptr inbounds %"class.boost::detail::interruption_checker"* %this1, i32 0, i32 2
  %0 = load i8* %set, align 1
  %tobool = trunc i8 %0 to i1
  br i1 %tobool, label %if.then, label %if.else

if.then:                                          ; preds = %entry
  %m = getelementptr inbounds %"class.boost::detail::interruption_checker"* %this1, i32 0, i32 1
  %1 = load %union.pthread_mutex_t** %m, align 4
  %call = call i32 @pthread_mutex_unlock(%union.pthread_mutex_t* %1) nounwind
  %tobool2 = icmp ne i32 %call, 0
  br i1 %tobool2, label %cond.false, label %cond.true

cond.true:                                        ; preds = %if.then
  br label %cond.end

cond.false:                                       ; preds = %if.then
  call void @__assert_fail(i8* getelementptr inbounds ([25 x i8]* @.str28, i32 0, i32 0), i8* getelementptr inbounds ([63 x i8]* @.str32, i32 0, i32 0), i32 180, i8* getelementptr inbounds ([61 x i8]* @__PRETTY_FUNCTION__._ZN5boost6detail20interruption_checkerD2Ev, i32 0, i32 0)) noreturn nounwind
  unreachable
                                                  ; No predecessors!
  br label %cond.end

cond.end:                                         ; preds = %2, %cond.true
  %thread_info = getelementptr inbounds %"class.boost::detail::interruption_checker"* %this1, i32 0, i32 0
  %3 = load %"struct.boost::detail::thread_data_base"** %thread_info, align 4
  %data_mutex = getelementptr inbounds %"struct.boost::detail::thread_data_base"* %3, i32 0, i32 4
  call void @_ZN5boost10lock_guardINS_5mutexEEC1ERS1_(%"class.boost::lock_guard"* %guard, %"class.boost::mutex"* %data_mutex)
  %thread_info3 = getelementptr inbounds %"class.boost::detail::interruption_checker"* %this1, i32 0, i32 0
  %4 = load %"struct.boost::detail::thread_data_base"** %thread_info3, align 4
  %cond_mutex = getelementptr inbounds %"struct.boost::detail::thread_data_base"* %4, i32 0, i32 15
  store %union.pthread_mutex_t* null, %union.pthread_mutex_t** %cond_mutex, align 4
  %thread_info4 = getelementptr inbounds %"class.boost::detail::interruption_checker"* %this1, i32 0, i32 0
  %5 = load %"struct.boost::detail::thread_data_base"** %thread_info4, align 4
  %current_cond = getelementptr inbounds %"struct.boost::detail::thread_data_base"* %5, i32 0, i32 16
  store %union.pthread_cond_t* null, %union.pthread_cond_t** %current_cond, align 4
  call void @_ZN5boost10lock_guardINS_5mutexEED1Ev(%"class.boost::lock_guard"* %guard)
  br label %if.end

if.else:                                          ; preds = %entry
  %m5 = getelementptr inbounds %"class.boost::detail::interruption_checker"* %this1, i32 0, i32 1
  %6 = load %union.pthread_mutex_t** %m5, align 4
  %call6 = call i32 @pthread_mutex_unlock(%union.pthread_mutex_t* %6) nounwind
  %tobool7 = icmp ne i32 %call6, 0
  br i1 %tobool7, label %cond.false9, label %cond.true8

cond.true8:                                       ; preds = %if.else
  br label %cond.end10

cond.false9:                                      ; preds = %if.else
  call void @__assert_fail(i8* getelementptr inbounds ([25 x i8]* @.str28, i32 0, i32 0), i8* getelementptr inbounds ([63 x i8]* @.str32, i32 0, i32 0), i32 187, i8* getelementptr inbounds ([61 x i8]* @__PRETTY_FUNCTION__._ZN5boost6detail20interruption_checkerD2Ev, i32 0, i32 0)) noreturn nounwind
  unreachable
                                                  ; No predecessors!
  br label %cond.end10

cond.end10:                                       ; preds = %7, %cond.true8
  br label %if.end

if.end:                                           ; preds = %cond.end10, %cond.end
  ret void
}

define linkonce_odr void @_ZN5boost10lock_guardINS_5mutexEEC1ERS1_(%"class.boost::lock_guard"* %this, %"class.boost::mutex"* %m_) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::lock_guard"*, align 4
  %m_.addr = alloca %"class.boost::mutex"*, align 4
  store %"class.boost::lock_guard"* %this, %"class.boost::lock_guard"** %this.addr, align 4
  store %"class.boost::mutex"* %m_, %"class.boost::mutex"** %m_.addr, align 4
  %this1 = load %"class.boost::lock_guard"** %this.addr
  %0 = load %"class.boost::mutex"** %m_.addr
  call void @_ZN5boost10lock_guardINS_5mutexEEC2ERS1_(%"class.boost::lock_guard"* %this1, %"class.boost::mutex"* %0)
  ret void
}

define linkonce_odr void @_ZN5boost10lock_guardINS_5mutexEED1Ev(%"class.boost::lock_guard"* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::lock_guard"*, align 4
  store %"class.boost::lock_guard"* %this, %"class.boost::lock_guard"** %this.addr, align 4
  %this1 = load %"class.boost::lock_guard"** %this.addr
  call void @_ZN5boost10lock_guardINS_5mutexEED2Ev(%"class.boost::lock_guard"* %this1)
  ret void
}

define linkonce_odr void @_ZN5boost10lock_guardINS_5mutexEED2Ev(%"class.boost::lock_guard"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::lock_guard"*, align 4
  store %"class.boost::lock_guard"* %this, %"class.boost::lock_guard"** %this.addr, align 4
  %this1 = load %"class.boost::lock_guard"** %this.addr
  %m = getelementptr inbounds %"class.boost::lock_guard"* %this1, i32 0, i32 0
  %ref = load %"class.boost::mutex"** %m, align 4
  call void @_ZN5boost5mutex6unlockEv(%"class.boost::mutex"* %ref)
  ret void
}

define linkonce_odr void @_ZN5boost10lock_guardINS_5mutexEEC2ERS1_(%"class.boost::lock_guard"* %this, %"class.boost::mutex"* %m_) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::lock_guard"*, align 4
  %m_.addr = alloca %"class.boost::mutex"*, align 4
  store %"class.boost::lock_guard"* %this, %"class.boost::lock_guard"** %this.addr, align 4
  store %"class.boost::mutex"* %m_, %"class.boost::mutex"** %m_.addr, align 4
  %this1 = load %"class.boost::lock_guard"** %this.addr
  %0 = getelementptr inbounds %"class.boost::lock_guard"* %this1, i32 0, i32 0
  %1 = load %"class.boost::mutex"** %m_.addr, align 4
  store %"class.boost::mutex"* %1, %"class.boost::mutex"** %0, align 4
  %m = getelementptr inbounds %"class.boost::lock_guard"* %this1, i32 0, i32 0
  %ref = load %"class.boost::mutex"** %m, align 4
  call void @_ZN5boost5mutex4lockEv(%"class.boost::mutex"* %ref)
  ret void
}

define linkonce_odr void @_ZN5boost11unique_lockINS_5mutexEE6unlockEv(%"class.boost::unique_lock"* %this) align 2 {
entry:
  %this.addr = alloca %"class.boost::unique_lock"*, align 4
  %ref.tmp = alloca %"class.boost::lock_error", align 4
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  %ref.tmp3 = alloca %"class.boost::lock_error", align 4
  store %"class.boost::unique_lock"* %this, %"class.boost::unique_lock"** %this.addr, align 4
  %this1 = load %"class.boost::unique_lock"** %this.addr
  %m = getelementptr inbounds %"class.boost::unique_lock"* %this1, i32 0, i32 0
  %0 = load %"class.boost::mutex"** %m, align 4
  %cmp = icmp eq %"class.boost::mutex"* %0, null
  br i1 %cmp, label %if.then, label %if.end

if.then:                                          ; preds = %entry
  call void @_ZN5boost10lock_errorC1EiPKc(%"class.boost::lock_error"* %ref.tmp, i32 1, i8* getelementptr inbounds ([31 x i8]* @.str23, i32 0, i32 0))
  invoke void @_ZN5boost15throw_exceptionINS_10lock_errorEEEvRKT_(%"class.boost::lock_error"* %ref.tmp) noreturn
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %if.then
  unreachable

lpad:                                             ; preds = %if.then
  %1 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %2 = extractvalue { i8*, i32 } %1, 0
  store i8* %2, i8** %exn.slot
  %3 = extractvalue { i8*, i32 } %1, 1
  store i32 %3, i32* %ehselector.slot
  call void @_ZN5boost10lock_errorD1Ev(%"class.boost::lock_error"* %ref.tmp) nounwind
  br label %eh.resume

if.end:                                           ; preds = %entry
  %call = call zeroext i1 @_ZNK5boost11unique_lockINS_5mutexEE9owns_lockEv(%"class.boost::unique_lock"* %this1)
  br i1 %call, label %if.end6, label %if.then2

if.then2:                                         ; preds = %if.end
  call void @_ZN5boost10lock_errorC1EiPKc(%"class.boost::lock_error"* %ref.tmp3, i32 1, i8* getelementptr inbounds ([40 x i8]* @.str33, i32 0, i32 0))
  invoke void @_ZN5boost15throw_exceptionINS_10lock_errorEEEvRKT_(%"class.boost::lock_error"* %ref.tmp3) noreturn
          to label %invoke.cont5 unwind label %lpad4

invoke.cont5:                                     ; preds = %if.then2
  unreachable

lpad4:                                            ; preds = %if.then2
  %4 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %5 = extractvalue { i8*, i32 } %4, 0
  store i8* %5, i8** %exn.slot
  %6 = extractvalue { i8*, i32 } %4, 1
  store i32 %6, i32* %ehselector.slot
  call void @_ZN5boost10lock_errorD1Ev(%"class.boost::lock_error"* %ref.tmp3) nounwind
  br label %eh.resume

if.end6:                                          ; preds = %if.end
  %m7 = getelementptr inbounds %"class.boost::unique_lock"* %this1, i32 0, i32 0
  %7 = load %"class.boost::mutex"** %m7, align 4
  call void @_ZN5boost5mutex6unlockEv(%"class.boost::mutex"* %7)
  %is_locked = getelementptr inbounds %"class.boost::unique_lock"* %this1, i32 0, i32 1
  store i8 0, i8* %is_locked, align 1
  ret void

eh.resume:                                        ; preds = %lpad4, %lpad
  %exn = load i8** %exn.slot
  %sel = load i32* %ehselector.slot
  %lpad.val = insertvalue { i8*, i32 } undef, i8* %exn, 0
  %lpad.val8 = insertvalue { i8*, i32 } %lpad.val, i32 %sel, 1
  resume { i8*, i32 } %lpad.val8
}

define linkonce_odr void @_ZN5boost6detail20interruption_checkerC2EP15pthread_mutex_tP14pthread_cond_t(%"class.boost::detail::interruption_checker"* %this, %union.pthread_mutex_t* %cond_mutex, %union.pthread_cond_t* %cond) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::detail::interruption_checker"*, align 4
  %cond_mutex.addr = alloca %union.pthread_mutex_t*, align 4
  %cond.addr = alloca %union.pthread_cond_t*, align 4
  %guard = alloca %"class.boost::lock_guard", align 4
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  store %"class.boost::detail::interruption_checker"* %this, %"class.boost::detail::interruption_checker"** %this.addr, align 4
  store %union.pthread_mutex_t* %cond_mutex, %union.pthread_mutex_t** %cond_mutex.addr, align 4
  store %union.pthread_cond_t* %cond, %union.pthread_cond_t** %cond.addr, align 4
  %this1 = load %"class.boost::detail::interruption_checker"** %this.addr
  %thread_info = getelementptr inbounds %"class.boost::detail::interruption_checker"* %this1, i32 0, i32 0
  %call = call %"struct.boost::detail::thread_data_base"* @_ZN5boost6detail23get_current_thread_dataEv()
  store %"struct.boost::detail::thread_data_base"* %call, %"struct.boost::detail::thread_data_base"** %thread_info, align 4
  %m = getelementptr inbounds %"class.boost::detail::interruption_checker"* %this1, i32 0, i32 1
  %0 = load %union.pthread_mutex_t** %cond_mutex.addr, align 4
  store %union.pthread_mutex_t* %0, %union.pthread_mutex_t** %m, align 4
  %set = getelementptr inbounds %"class.boost::detail::interruption_checker"* %this1, i32 0, i32 2
  %thread_info2 = getelementptr inbounds %"class.boost::detail::interruption_checker"* %this1, i32 0, i32 0
  %1 = load %"struct.boost::detail::thread_data_base"** %thread_info2, align 4
  %tobool = icmp ne %"struct.boost::detail::thread_data_base"* %1, null
  br i1 %tobool, label %land.rhs, label %land.end

land.rhs:                                         ; preds = %entry
  %thread_info3 = getelementptr inbounds %"class.boost::detail::interruption_checker"* %this1, i32 0, i32 0
  %2 = load %"struct.boost::detail::thread_data_base"** %thread_info3, align 4
  %interrupt_enabled = getelementptr inbounds %"struct.boost::detail::thread_data_base"* %2, i32 0, i32 13
  %3 = load i8* %interrupt_enabled, align 1
  %tobool4 = trunc i8 %3 to i1
  br label %land.end

land.end:                                         ; preds = %land.rhs, %entry
  %4 = phi i1 [ false, %entry ], [ %tobool4, %land.rhs ]
  %frombool = zext i1 %4 to i8
  store i8 %frombool, i8* %set, align 1
  %set5 = getelementptr inbounds %"class.boost::detail::interruption_checker"* %this1, i32 0, i32 2
  %5 = load i8* %set5, align 1
  %tobool6 = trunc i8 %5 to i1
  br i1 %tobool6, label %if.then, label %if.else

if.then:                                          ; preds = %land.end
  %thread_info7 = getelementptr inbounds %"class.boost::detail::interruption_checker"* %this1, i32 0, i32 0
  %6 = load %"struct.boost::detail::thread_data_base"** %thread_info7, align 4
  %data_mutex = getelementptr inbounds %"struct.boost::detail::thread_data_base"* %6, i32 0, i32 4
  call void @_ZN5boost10lock_guardINS_5mutexEEC1ERS1_(%"class.boost::lock_guard"* %guard, %"class.boost::mutex"* %data_mutex)
  invoke void @_ZN5boost6detail20interruption_checker22check_for_interruptionEv(%"class.boost::detail::interruption_checker"* %this1)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %if.then
  %7 = load %union.pthread_mutex_t** %cond_mutex.addr, align 4
  %thread_info8 = getelementptr inbounds %"class.boost::detail::interruption_checker"* %this1, i32 0, i32 0
  %8 = load %"struct.boost::detail::thread_data_base"** %thread_info8, align 4
  %cond_mutex9 = getelementptr inbounds %"struct.boost::detail::thread_data_base"* %8, i32 0, i32 15
  store %union.pthread_mutex_t* %7, %union.pthread_mutex_t** %cond_mutex9, align 4
  %9 = load %union.pthread_cond_t** %cond.addr, align 4
  %thread_info10 = getelementptr inbounds %"class.boost::detail::interruption_checker"* %this1, i32 0, i32 0
  %10 = load %"struct.boost::detail::thread_data_base"** %thread_info10, align 4
  %current_cond = getelementptr inbounds %"struct.boost::detail::thread_data_base"* %10, i32 0, i32 16
  store %union.pthread_cond_t* %9, %union.pthread_cond_t** %current_cond, align 4
  %m11 = getelementptr inbounds %"class.boost::detail::interruption_checker"* %this1, i32 0, i32 1
  %11 = load %union.pthread_mutex_t** %m11, align 4
  %call12 = call i32 @pthread_mutex_lock(%union.pthread_mutex_t* %11) nounwind
  %tobool13 = icmp ne i32 %call12, 0
  br i1 %tobool13, label %cond.false, label %cond.true

cond.true:                                        ; preds = %invoke.cont
  br label %cond.end

cond.false:                                       ; preds = %invoke.cont
  call void @__assert_fail(i8* getelementptr inbounds ([23 x i8]* @.str30, i32 0, i32 0), i8* getelementptr inbounds ([63 x i8]* @.str32, i32 0, i32 0), i32 169, i8* getelementptr inbounds ([95 x i8]* @__PRETTY_FUNCTION__._ZN5boost6detail20interruption_checkerC2EP15pthread_mutex_tP14pthread_cond_t, i32 0, i32 0)) noreturn nounwind
  unreachable

lpad:                                             ; preds = %if.then
  %12 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %13 = extractvalue { i8*, i32 } %12, 0
  store i8* %13, i8** %exn.slot
  %14 = extractvalue { i8*, i32 } %12, 1
  store i32 %14, i32* %ehselector.slot
  invoke void @_ZN5boost10lock_guardINS_5mutexEED1Ev(%"class.boost::lock_guard"* %guard)
          to label %invoke.cont14 unwind label %terminate.lpad
                                                  ; No predecessors!
  br label %cond.end

cond.end:                                         ; preds = %15, %cond.true
  call void @_ZN5boost10lock_guardINS_5mutexEED1Ev(%"class.boost::lock_guard"* %guard)
  br label %if.end

invoke.cont14:                                    ; preds = %lpad
  br label %eh.resume

if.else:                                          ; preds = %land.end
  %m15 = getelementptr inbounds %"class.boost::detail::interruption_checker"* %this1, i32 0, i32 1
  %16 = load %union.pthread_mutex_t** %m15, align 4
  %call16 = call i32 @pthread_mutex_lock(%union.pthread_mutex_t* %16) nounwind
  %tobool17 = icmp ne i32 %call16, 0
  br i1 %tobool17, label %cond.false19, label %cond.true18

cond.true18:                                      ; preds = %if.else
  br label %cond.end20

cond.false19:                                     ; preds = %if.else
  call void @__assert_fail(i8* getelementptr inbounds ([23 x i8]* @.str30, i32 0, i32 0), i8* getelementptr inbounds ([63 x i8]* @.str32, i32 0, i32 0), i32 173, i8* getelementptr inbounds ([95 x i8]* @__PRETTY_FUNCTION__._ZN5boost6detail20interruption_checkerC2EP15pthread_mutex_tP14pthread_cond_t, i32 0, i32 0)) noreturn nounwind
  unreachable
                                                  ; No predecessors!
  br label %cond.end20

cond.end20:                                       ; preds = %17, %cond.true18
  br label %if.end

if.end:                                           ; preds = %cond.end20, %cond.end
  ret void

eh.resume:                                        ; preds = %invoke.cont14
  %exn = load i8** %exn.slot
  %sel = load i32* %ehselector.slot
  %lpad.val = insertvalue { i8*, i32 } undef, i8* %exn, 0
  %lpad.val21 = insertvalue { i8*, i32 } %lpad.val, i32 %sel, 1
  resume { i8*, i32 } %lpad.val21

terminate.lpad:                                   ; preds = %lpad
  %18 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          catch i8* null
  call void @_ZSt9terminatev() noreturn nounwind
  unreachable
}

declare %"struct.boost::detail::thread_data_base"* @_ZN5boost6detail23get_current_thread_dataEv()

define linkonce_odr void @_ZN5boost6detail20interruption_checker22check_for_interruptionEv(%"class.boost::detail::interruption_checker"* %this) align 2 {
entry:
  %this.addr = alloca %"class.boost::detail::interruption_checker"*, align 4
  store %"class.boost::detail::interruption_checker"* %this, %"class.boost::detail::interruption_checker"** %this.addr, align 4
  %this1 = load %"class.boost::detail::interruption_checker"** %this.addr
  %thread_info = getelementptr inbounds %"class.boost::detail::interruption_checker"* %this1, i32 0, i32 0
  %0 = load %"struct.boost::detail::thread_data_base"** %thread_info, align 4
  %interrupt_requested = getelementptr inbounds %"struct.boost::detail::thread_data_base"* %0, i32 0, i32 14
  %1 = load i8* %interrupt_requested, align 1
  %tobool = trunc i8 %1 to i1
  br i1 %tobool, label %if.then, label %if.end

if.then:                                          ; preds = %entry
  %thread_info2 = getelementptr inbounds %"class.boost::detail::interruption_checker"* %this1, i32 0, i32 0
  %2 = load %"struct.boost::detail::thread_data_base"** %thread_info2, align 4
  %interrupt_requested3 = getelementptr inbounds %"struct.boost::detail::thread_data_base"* %2, i32 0, i32 14
  store i8 0, i8* %interrupt_requested3, align 1
  %exception = call i8* @__cxa_allocate_exception(i32 1) nounwind
  %3 = bitcast i8* %exception to %"class.boost::thread_interrupted"*
  call void @__cxa_throw(i8* %exception, i8* bitcast ({ i8*, i8* }* @_ZTIN5boost18thread_interruptedE to i8*), i8* null) noreturn
  unreachable

if.end:                                           ; preds = %entry
  ret void
}

define linkonce_odr void @_ZN5boost16thread_cv_detail12lock_on_exitINS_11unique_lockINS_5mutexEEEEC2Ev(%"struct.boost::thread_cv_detail::lock_on_exit"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"struct.boost::thread_cv_detail::lock_on_exit"*, align 4
  store %"struct.boost::thread_cv_detail::lock_on_exit"* %this, %"struct.boost::thread_cv_detail::lock_on_exit"** %this.addr, align 4
  %this1 = load %"struct.boost::thread_cv_detail::lock_on_exit"** %this.addr
  %m = getelementptr inbounds %"struct.boost::thread_cv_detail::lock_on_exit"* %this1, i32 0, i32 0
  store %"class.boost::unique_lock"* null, %"class.boost::unique_lock"** %m, align 4
  ret void
}

define linkonce_odr void @_ZN5boost5mutexD2Ev(%"class.boost::mutex"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::mutex"*, align 4
  %ret = alloca i32, align 4
  store %"class.boost::mutex"* %this, %"class.boost::mutex"** %this.addr, align 4
  %this1 = load %"class.boost::mutex"** %this.addr
  br label %do.body

do.body:                                          ; preds = %do.cond, %entry
  %m = getelementptr inbounds %"class.boost::mutex"* %this1, i32 0, i32 0
  %call = call i32 @pthread_mutex_destroy(%union.pthread_mutex_t* %m) nounwind
  store i32 %call, i32* %ret, align 4
  br label %do.cond

do.cond:                                          ; preds = %do.body
  %0 = load i32* %ret, align 4
  %cmp = icmp eq i32 %0, 4
  br i1 %cmp, label %do.body, label %do.end

do.end:                                           ; preds = %do.cond
  ret void
}

define linkonce_odr void @_ZN5boost5mutexC2Ev(%"class.boost::mutex"* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::mutex"*, align 4
  %res = alloca i32, align 4
  %ref.tmp = alloca %"class.boost::thread_resource_error", align 4
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  store %"class.boost::mutex"* %this, %"class.boost::mutex"** %this.addr, align 4
  %this1 = load %"class.boost::mutex"** %this.addr
  %m = getelementptr inbounds %"class.boost::mutex"* %this1, i32 0, i32 0
  %m2 = getelementptr inbounds %"class.boost::mutex"* %this1, i32 0, i32 0
  %call = call i32 @pthread_mutex_init(%union.pthread_mutex_t* %m2, %union.pthread_mutexattr_t* null) nounwind
  store i32 %call, i32* %res, align 4
  %0 = load i32* %res, align 4
  %tobool = icmp ne i32 %0, 0
  br i1 %tobool, label %if.then, label %if.end

if.then:                                          ; preds = %entry
  %1 = load i32* %res, align 4
  call void @_ZN5boost21thread_resource_errorC1EiPKc(%"class.boost::thread_resource_error"* %ref.tmp, i32 %1, i8* getelementptr inbounds ([55 x i8]* @.str34, i32 0, i32 0))
  invoke void @_ZN5boost15throw_exceptionINS_21thread_resource_errorEEEvRKT_(%"class.boost::thread_resource_error"* %ref.tmp) noreturn
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %if.then
  unreachable

lpad:                                             ; preds = %if.then
  %2 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %3 = extractvalue { i8*, i32 } %2, 0
  store i8* %3, i8** %exn.slot
  %4 = extractvalue { i8*, i32 } %2, 1
  store i32 %4, i32* %ehselector.slot
  call void @_ZN5boost21thread_resource_errorD1Ev(%"class.boost::thread_resource_error"* %ref.tmp) nounwind
  br label %eh.resume

if.end:                                           ; preds = %entry
  ret void

eh.resume:                                        ; preds = %lpad
  %exn = load i8** %exn.slot
  %sel = load i32* %ehselector.slot
  %lpad.val = insertvalue { i8*, i32 } undef, i8* %exn, 0
  %lpad.val3 = insertvalue { i8*, i32 } %lpad.val, i32 %sel, 1
  resume { i8*, i32 } %lpad.val3
}

define linkonce_odr void @_ZN14bounded_bufferD2Ev(%class.bounded_buffer* %this) unnamed_addr inlinehint align 2 {
entry:
  %this.addr = alloca %class.bounded_buffer*, align 4
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  store %class.bounded_buffer* %this, %class.bounded_buffer** %this.addr, align 4
  %this1 = load %class.bounded_buffer** %this.addr
  %monitor = getelementptr inbounds %class.bounded_buffer* %this1, i32 0, i32 6
  invoke void @_ZN5boost5mutexD1Ev(%"class.boost::mutex"* %monitor)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %entry
  %buffer_not_empty = getelementptr inbounds %class.bounded_buffer* %this1, i32 0, i32 5
  invoke void @_ZN5boost22condition_variable_anyD1Ev(%"class.boost::condition_variable_any"* %buffer_not_empty)
          to label %invoke.cont3 unwind label %lpad2

invoke.cont3:                                     ; preds = %invoke.cont
  %buffer_not_full = getelementptr inbounds %class.bounded_buffer* %this1, i32 0, i32 4
  invoke void @_ZN5boost22condition_variable_anyD1Ev(%"class.boost::condition_variable_any"* %buffer_not_full)
          to label %invoke.cont7 unwind label %lpad6

invoke.cont7:                                     ; preds = %invoke.cont3
  %circular_buf = getelementptr inbounds %class.bounded_buffer* %this1, i32 0, i32 3
  invoke void @_ZNSt6vectorIiSaIiEED1Ev(%"class.std::vector"* %circular_buf)
          to label %invoke.cont11 unwind label %lpad10

invoke.cont11:                                    ; preds = %invoke.cont7
  %0 = bitcast %class.bounded_buffer* %this1 to %"class.boost::noncopyable_::noncopyable"*
  call void @_ZN5boost12noncopyable_11noncopyableD2Ev(%"class.boost::noncopyable_::noncopyable"* %0)
  ret void

lpad:                                             ; preds = %entry
  %1 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %2 = extractvalue { i8*, i32 } %1, 0
  store i8* %2, i8** %exn.slot
  %3 = extractvalue { i8*, i32 } %1, 1
  store i32 %3, i32* %ehselector.slot
  %buffer_not_empty4 = getelementptr inbounds %class.bounded_buffer* %this1, i32 0, i32 5
  invoke void @_ZN5boost22condition_variable_anyD1Ev(%"class.boost::condition_variable_any"* %buffer_not_empty4)
          to label %invoke.cont5 unwind label %terminate.lpad

lpad2:                                            ; preds = %invoke.cont
  %4 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %5 = extractvalue { i8*, i32 } %4, 0
  store i8* %5, i8** %exn.slot
  %6 = extractvalue { i8*, i32 } %4, 1
  store i32 %6, i32* %ehselector.slot
  br label %ehcleanup

invoke.cont5:                                     ; preds = %lpad
  br label %ehcleanup

lpad6:                                            ; preds = %invoke.cont3
  %7 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %8 = extractvalue { i8*, i32 } %7, 0
  store i8* %8, i8** %exn.slot
  %9 = extractvalue { i8*, i32 } %7, 1
  store i32 %9, i32* %ehselector.slot
  br label %ehcleanup12

ehcleanup:                                        ; preds = %invoke.cont5, %lpad2
  %buffer_not_full8 = getelementptr inbounds %class.bounded_buffer* %this1, i32 0, i32 4
  invoke void @_ZN5boost22condition_variable_anyD1Ev(%"class.boost::condition_variable_any"* %buffer_not_full8)
          to label %invoke.cont9 unwind label %terminate.lpad

invoke.cont9:                                     ; preds = %ehcleanup
  br label %ehcleanup12

lpad10:                                           ; preds = %invoke.cont7
  %10 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %11 = extractvalue { i8*, i32 } %10, 0
  store i8* %11, i8** %exn.slot
  %12 = extractvalue { i8*, i32 } %10, 1
  store i32 %12, i32* %ehselector.slot
  br label %ehcleanup15

ehcleanup12:                                      ; preds = %invoke.cont9, %lpad6
  %circular_buf13 = getelementptr inbounds %class.bounded_buffer* %this1, i32 0, i32 3
  invoke void @_ZNSt6vectorIiSaIiEED1Ev(%"class.std::vector"* %circular_buf13)
          to label %invoke.cont14 unwind label %terminate.lpad

invoke.cont14:                                    ; preds = %ehcleanup12
  br label %ehcleanup15

ehcleanup15:                                      ; preds = %invoke.cont14, %lpad10
  %13 = bitcast %class.bounded_buffer* %this1 to %"class.boost::noncopyable_::noncopyable"*
  invoke void @_ZN5boost12noncopyable_11noncopyableD2Ev(%"class.boost::noncopyable_::noncopyable"* %13)
          to label %invoke.cont16 unwind label %terminate.lpad

invoke.cont16:                                    ; preds = %ehcleanup15
  br label %eh.resume

eh.resume:                                        ; preds = %invoke.cont16
  %exn = load i8** %exn.slot
  %sel = load i32* %ehselector.slot
  %lpad.val = insertvalue { i8*, i32 } undef, i8* %exn, 0
  %lpad.val17 = insertvalue { i8*, i32 } %lpad.val, i32 %sel, 1
  resume { i8*, i32 } %lpad.val17

terminate.lpad:                                   ; preds = %ehcleanup15, %ehcleanup12, %ehcleanup, %lpad
  %14 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          catch i8* null
  call void @_ZSt9terminatev() noreturn nounwind
  unreachable
}

define linkonce_odr void @_ZN5boost22condition_variable_anyD1Ev(%"class.boost::condition_variable_any"* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::condition_variable_any"*, align 4
  store %"class.boost::condition_variable_any"* %this, %"class.boost::condition_variable_any"** %this.addr, align 4
  %this1 = load %"class.boost::condition_variable_any"** %this.addr
  call void @_ZN5boost22condition_variable_anyD2Ev(%"class.boost::condition_variable_any"* %this1)
  ret void
}

define linkonce_odr void @_ZNSt6vectorIiSaIiEED1Ev(%"class.std::vector"* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.std::vector"*, align 4
  store %"class.std::vector"* %this, %"class.std::vector"** %this.addr, align 4
  %this1 = load %"class.std::vector"** %this.addr
  call void @_ZNSt6vectorIiSaIiEED2Ev(%"class.std::vector"* %this1)
  ret void
}

define linkonce_odr void @_ZNSt6vectorIiSaIiEED2Ev(%"class.std::vector"* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.std::vector"*, align 4
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  store %"class.std::vector"* %this, %"class.std::vector"** %this.addr, align 4
  %this1 = load %"class.std::vector"** %this.addr
  %0 = bitcast %"class.std::vector"* %this1 to %"struct.std::_Vector_base"*
  %_M_impl = getelementptr inbounds %"struct.std::_Vector_base"* %0, i32 0, i32 0
  %_M_start = getelementptr inbounds %"struct.std::_Vector_base<int, std::allocator<int> >::_Vector_impl"* %_M_impl, i32 0, i32 0
  %1 = load i32** %_M_start, align 4
  %2 = bitcast %"class.std::vector"* %this1 to %"struct.std::_Vector_base"*
  %_M_impl2 = getelementptr inbounds %"struct.std::_Vector_base"* %2, i32 0, i32 0
  %_M_finish = getelementptr inbounds %"struct.std::_Vector_base<int, std::allocator<int> >::_Vector_impl"* %_M_impl2, i32 0, i32 1
  %3 = load i32** %_M_finish, align 4
  %4 = bitcast %"class.std::vector"* %this1 to %"struct.std::_Vector_base"*
  %call = invoke %"class.std::allocator.16"* @_ZNSt12_Vector_baseIiSaIiEE19_M_get_Tp_allocatorEv(%"struct.std::_Vector_base"* %4)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %entry
  invoke void @_ZSt8_DestroyIPiiEvT_S1_RSaIT0_E(i32* %1, i32* %3, %"class.std::allocator.16"* %call)
          to label %invoke.cont3 unwind label %lpad

invoke.cont3:                                     ; preds = %invoke.cont
  %5 = bitcast %"class.std::vector"* %this1 to %"struct.std::_Vector_base"*
  call void @_ZNSt12_Vector_baseIiSaIiEED2Ev(%"struct.std::_Vector_base"* %5)
  ret void

lpad:                                             ; preds = %invoke.cont, %entry
  %6 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %7 = extractvalue { i8*, i32 } %6, 0
  store i8* %7, i8** %exn.slot
  %8 = extractvalue { i8*, i32 } %6, 1
  store i32 %8, i32* %ehselector.slot
  %9 = bitcast %"class.std::vector"* %this1 to %"struct.std::_Vector_base"*
  invoke void @_ZNSt12_Vector_baseIiSaIiEED2Ev(%"struct.std::_Vector_base"* %9)
          to label %invoke.cont4 unwind label %terminate.lpad

invoke.cont4:                                     ; preds = %lpad
  br label %eh.resume

eh.resume:                                        ; preds = %invoke.cont4
  %exn = load i8** %exn.slot
  %sel = load i32* %ehselector.slot
  %lpad.val = insertvalue { i8*, i32 } undef, i8* %exn, 0
  %lpad.val5 = insertvalue { i8*, i32 } %lpad.val, i32 %sel, 1
  resume { i8*, i32 } %lpad.val5

terminate.lpad:                                   ; preds = %lpad
  %10 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          catch i8* null
  call void @_ZSt9terminatev() noreturn nounwind
  unreachable
}

define linkonce_odr void @_ZSt8_DestroyIPiiEvT_S1_RSaIT0_E(i32* %__first, i32* %__last, %"class.std::allocator.16"*) inlinehint {
entry:
  %__first.addr = alloca i32*, align 4
  %__last.addr = alloca i32*, align 4
  %.addr = alloca %"class.std::allocator.16"*, align 4
  store i32* %__first, i32** %__first.addr, align 4
  store i32* %__last, i32** %__last.addr, align 4
  store %"class.std::allocator.16"* %0, %"class.std::allocator.16"** %.addr, align 4
  %1 = load i32** %__first.addr, align 4
  %2 = load i32** %__last.addr, align 4
  call void @_ZSt8_DestroyIPiEvT_S1_(i32* %1, i32* %2)
  ret void
}

define linkonce_odr %"class.std::allocator.16"* @_ZNSt12_Vector_baseIiSaIiEE19_M_get_Tp_allocatorEv(%"struct.std::_Vector_base"* %this) nounwind align 2 {
entry:
  %this.addr = alloca %"struct.std::_Vector_base"*, align 4
  store %"struct.std::_Vector_base"* %this, %"struct.std::_Vector_base"** %this.addr, align 4
  %this1 = load %"struct.std::_Vector_base"** %this.addr
  %_M_impl = getelementptr inbounds %"struct.std::_Vector_base"* %this1, i32 0, i32 0
  %0 = bitcast %"struct.std::_Vector_base<int, std::allocator<int> >::_Vector_impl"* %_M_impl to %"class.std::allocator.16"*
  ret %"class.std::allocator.16"* %0
}

define linkonce_odr void @_ZNSt12_Vector_baseIiSaIiEED2Ev(%"struct.std::_Vector_base"* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"struct.std::_Vector_base"*, align 4
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  store %"struct.std::_Vector_base"* %this, %"struct.std::_Vector_base"** %this.addr, align 4
  %this1 = load %"struct.std::_Vector_base"** %this.addr
  %_M_impl = getelementptr inbounds %"struct.std::_Vector_base"* %this1, i32 0, i32 0
  %_M_start = getelementptr inbounds %"struct.std::_Vector_base<int, std::allocator<int> >::_Vector_impl"* %_M_impl, i32 0, i32 0
  %0 = load i32** %_M_start, align 4
  %_M_impl2 = getelementptr inbounds %"struct.std::_Vector_base"* %this1, i32 0, i32 0
  %_M_end_of_storage = getelementptr inbounds %"struct.std::_Vector_base<int, std::allocator<int> >::_Vector_impl"* %_M_impl2, i32 0, i32 2
  %1 = load i32** %_M_end_of_storage, align 4
  %_M_impl3 = getelementptr inbounds %"struct.std::_Vector_base"* %this1, i32 0, i32 0
  %_M_start4 = getelementptr inbounds %"struct.std::_Vector_base<int, std::allocator<int> >::_Vector_impl"* %_M_impl3, i32 0, i32 0
  %2 = load i32** %_M_start4, align 4
  %sub.ptr.lhs.cast = ptrtoint i32* %1 to i32
  %sub.ptr.rhs.cast = ptrtoint i32* %2 to i32
  %sub.ptr.sub = sub i32 %sub.ptr.lhs.cast, %sub.ptr.rhs.cast
  %sub.ptr.div = sdiv exact i32 %sub.ptr.sub, 4
  invoke void @_ZNSt12_Vector_baseIiSaIiEE13_M_deallocateEPij(%"struct.std::_Vector_base"* %this1, i32* %0, i32 %sub.ptr.div)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %entry
  %_M_impl5 = getelementptr inbounds %"struct.std::_Vector_base"* %this1, i32 0, i32 0
  call void @_ZNSt12_Vector_baseIiSaIiEE12_Vector_implD1Ev(%"struct.std::_Vector_base<int, std::allocator<int> >::_Vector_impl"* %_M_impl5) nounwind
  ret void

lpad:                                             ; preds = %entry
  %3 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %4 = extractvalue { i8*, i32 } %3, 0
  store i8* %4, i8** %exn.slot
  %5 = extractvalue { i8*, i32 } %3, 1
  store i32 %5, i32* %ehselector.slot
  %_M_impl6 = getelementptr inbounds %"struct.std::_Vector_base"* %this1, i32 0, i32 0
  call void @_ZNSt12_Vector_baseIiSaIiEE12_Vector_implD1Ev(%"struct.std::_Vector_base<int, std::allocator<int> >::_Vector_impl"* %_M_impl6) nounwind
  br label %eh.resume

eh.resume:                                        ; preds = %lpad
  %exn = load i8** %exn.slot
  %sel = load i32* %ehselector.slot
  %lpad.val = insertvalue { i8*, i32 } undef, i8* %exn, 0
  %lpad.val7 = insertvalue { i8*, i32 } %lpad.val, i32 %sel, 1
  resume { i8*, i32 } %lpad.val7
}

define linkonce_odr void @_ZNSt12_Vector_baseIiSaIiEE13_M_deallocateEPij(%"struct.std::_Vector_base"* %this, i32* %__p, i32 %__n) align 2 {
entry:
  %this.addr = alloca %"struct.std::_Vector_base"*, align 4
  %__p.addr = alloca i32*, align 4
  %__n.addr = alloca i32, align 4
  store %"struct.std::_Vector_base"* %this, %"struct.std::_Vector_base"** %this.addr, align 4
  store i32* %__p, i32** %__p.addr, align 4
  store i32 %__n, i32* %__n.addr, align 4
  %this1 = load %"struct.std::_Vector_base"** %this.addr
  %0 = load i32** %__p.addr, align 4
  %tobool = icmp ne i32* %0, null
  br i1 %tobool, label %if.then, label %if.end

if.then:                                          ; preds = %entry
  %_M_impl = getelementptr inbounds %"struct.std::_Vector_base"* %this1, i32 0, i32 0
  %1 = bitcast %"struct.std::_Vector_base<int, std::allocator<int> >::_Vector_impl"* %_M_impl to %"class.__gnu_cxx::new_allocator.17"*
  %2 = load i32** %__p.addr, align 4
  %3 = load i32* %__n.addr, align 4
  call void @_ZN9__gnu_cxx13new_allocatorIiE10deallocateEPij(%"class.__gnu_cxx::new_allocator.17"* %1, i32* %2, i32 %3)
  br label %if.end

if.end:                                           ; preds = %if.then, %entry
  ret void
}

define linkonce_odr void @_ZNSt12_Vector_baseIiSaIiEE12_Vector_implD1Ev(%"struct.std::_Vector_base<int, std::allocator<int> >::_Vector_impl"* %this) unnamed_addr nounwind inlinehint align 2 {
entry:
  %this.addr = alloca %"struct.std::_Vector_base<int, std::allocator<int> >::_Vector_impl"*, align 4
  store %"struct.std::_Vector_base<int, std::allocator<int> >::_Vector_impl"* %this, %"struct.std::_Vector_base<int, std::allocator<int> >::_Vector_impl"** %this.addr, align 4
  %this1 = load %"struct.std::_Vector_base<int, std::allocator<int> >::_Vector_impl"** %this.addr
  call void @_ZNSt12_Vector_baseIiSaIiEE12_Vector_implD2Ev(%"struct.std::_Vector_base<int, std::allocator<int> >::_Vector_impl"* %this1) nounwind
  ret void
}

define linkonce_odr void @_ZNSt12_Vector_baseIiSaIiEE12_Vector_implD2Ev(%"struct.std::_Vector_base<int, std::allocator<int> >::_Vector_impl"* %this) unnamed_addr nounwind inlinehint align 2 {
entry:
  %this.addr = alloca %"struct.std::_Vector_base<int, std::allocator<int> >::_Vector_impl"*, align 4
  store %"struct.std::_Vector_base<int, std::allocator<int> >::_Vector_impl"* %this, %"struct.std::_Vector_base<int, std::allocator<int> >::_Vector_impl"** %this.addr, align 4
  %this1 = load %"struct.std::_Vector_base<int, std::allocator<int> >::_Vector_impl"** %this.addr
  %0 = bitcast %"struct.std::_Vector_base<int, std::allocator<int> >::_Vector_impl"* %this1 to %"class.std::allocator.16"*
  call void @_ZNSaIiED2Ev(%"class.std::allocator.16"* %0) nounwind
  ret void
}

define linkonce_odr void @_ZNSaIiED2Ev(%"class.std::allocator.16"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.std::allocator.16"*, align 4
  store %"class.std::allocator.16"* %this, %"class.std::allocator.16"** %this.addr, align 4
  %this1 = load %"class.std::allocator.16"** %this.addr
  %0 = bitcast %"class.std::allocator.16"* %this1 to %"class.__gnu_cxx::new_allocator.17"*
  call void @_ZN9__gnu_cxx13new_allocatorIiED2Ev(%"class.__gnu_cxx::new_allocator.17"* %0) nounwind
  ret void
}

define linkonce_odr void @_ZN9__gnu_cxx13new_allocatorIiED2Ev(%"class.__gnu_cxx::new_allocator.17"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.__gnu_cxx::new_allocator.17"*, align 4
  store %"class.__gnu_cxx::new_allocator.17"* %this, %"class.__gnu_cxx::new_allocator.17"** %this.addr, align 4
  %this1 = load %"class.__gnu_cxx::new_allocator.17"** %this.addr
  ret void
}

define linkonce_odr void @_ZN9__gnu_cxx13new_allocatorIiE10deallocateEPij(%"class.__gnu_cxx::new_allocator.17"* %this, i32* %__p, i32) nounwind align 2 {
entry:
  %this.addr = alloca %"class.__gnu_cxx::new_allocator.17"*, align 4
  %__p.addr = alloca i32*, align 4
  %.addr = alloca i32, align 4
  store %"class.__gnu_cxx::new_allocator.17"* %this, %"class.__gnu_cxx::new_allocator.17"** %this.addr, align 4
  store i32* %__p, i32** %__p.addr, align 4
  store i32 %0, i32* %.addr, align 4
  %this1 = load %"class.__gnu_cxx::new_allocator.17"** %this.addr
  %1 = load i32** %__p.addr, align 4
  %2 = bitcast i32* %1 to i8*
  call void @_ZdlPv(i8* %2) nounwind
  ret void
}

define linkonce_odr void @_ZSt8_DestroyIPiEvT_S1_(i32* %__first, i32* %__last) inlinehint {
entry:
  %__first.addr = alloca i32*, align 4
  %__last.addr = alloca i32*, align 4
  store i32* %__first, i32** %__first.addr, align 4
  store i32* %__last, i32** %__last.addr, align 4
  %0 = load i32** %__first.addr, align 4
  %1 = load i32** %__last.addr, align 4
  call void @_ZNSt12_Destroy_auxILb1EE9__destroyIPiEEvT_S3_(i32* %0, i32* %1)
  ret void
}

define linkonce_odr void @_ZNSt12_Destroy_auxILb1EE9__destroyIPiEEvT_S3_(i32*, i32*) nounwind align 2 {
entry:
  %.addr = alloca i32*, align 4
  %.addr1 = alloca i32*, align 4
  store i32* %0, i32** %.addr, align 4
  store i32* %1, i32** %.addr1, align 4
  ret void
}

define linkonce_odr void @_ZN5boost22condition_variable_anyD2Ev(%"class.boost::condition_variable_any"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::condition_variable_any"*, align 4
  store %"class.boost::condition_variable_any"* %this, %"class.boost::condition_variable_any"** %this.addr, align 4
  %this1 = load %"class.boost::condition_variable_any"** %this.addr
  %internal_mutex = getelementptr inbounds %"class.boost::condition_variable_any"* %this1, i32 0, i32 0
  %call = call i32 @pthread_mutex_destroy(%union.pthread_mutex_t* %internal_mutex) nounwind
  %tobool = icmp ne i32 %call, 0
  br i1 %tobool, label %cond.false, label %cond.true

cond.true:                                        ; preds = %entry
  br label %cond.end

cond.false:                                       ; preds = %entry
  call void @__assert_fail(i8* getelementptr inbounds ([40 x i8]* @.str17, i32 0, i32 0), i8* getelementptr inbounds ([70 x i8]* @.str27, i32 0, i32 0), i32 133, i8* getelementptr inbounds ([57 x i8]* @__PRETTY_FUNCTION__._ZN5boost22condition_variable_anyD2Ev, i32 0, i32 0)) noreturn nounwind
  unreachable
                                                  ; No predecessors!
  br label %cond.end

cond.end:                                         ; preds = %0, %cond.true
  %cond = getelementptr inbounds %"class.boost::condition_variable_any"* %this1, i32 0, i32 1
  %call2 = call i32 @pthread_cond_destroy(%union.pthread_cond_t* %cond) nounwind
  %tobool3 = icmp ne i32 %call2, 0
  br i1 %tobool3, label %cond.false5, label %cond.true4

cond.true4:                                       ; preds = %cond.end
  br label %cond.end6

cond.false5:                                      ; preds = %cond.end
  call void @__assert_fail(i8* getelementptr inbounds ([29 x i8]* @.str35, i32 0, i32 0), i8* getelementptr inbounds ([70 x i8]* @.str27, i32 0, i32 0), i32 134, i8* getelementptr inbounds ([57 x i8]* @__PRETTY_FUNCTION__._ZN5boost22condition_variable_anyD2Ev, i32 0, i32 0)) noreturn nounwind
  unreachable
                                                  ; No predecessors!
  br label %cond.end6

cond.end6:                                        ; preds = %1, %cond.true4
  ret void
}

define linkonce_odr void @_ZN14bounded_bufferC2Ei(%class.bounded_buffer* %this, i32 %n) unnamed_addr align 2 {
entry:
  %this.addr = alloca %class.bounded_buffer*, align 4
  %n.addr = alloca i32, align 4
  %ref.tmp = alloca i32, align 4
  %ref.tmp2 = alloca %"class.std::allocator.16", align 1
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  store %class.bounded_buffer* %this, %class.bounded_buffer** %this.addr, align 4
  store i32 %n, i32* %n.addr, align 4
  %this1 = load %class.bounded_buffer** %this.addr
  %0 = bitcast %class.bounded_buffer* %this1 to %"class.boost::noncopyable_::noncopyable"*
  call void @_ZN5boost12noncopyable_11noncopyableC2Ev(%"class.boost::noncopyable_::noncopyable"* %0)
  %begin = getelementptr inbounds %class.bounded_buffer* %this1, i32 0, i32 0
  store i32 0, i32* %begin, align 4
  %end = getelementptr inbounds %class.bounded_buffer* %this1, i32 0, i32 1
  store i32 0, i32* %end, align 4
  %buffered = getelementptr inbounds %class.bounded_buffer* %this1, i32 0, i32 2
  store i32 0, i32* %buffered, align 4
  %circular_buf = getelementptr inbounds %class.bounded_buffer* %this1, i32 0, i32 3
  %1 = load i32* %n.addr, align 4
  store i32 0, i32* %ref.tmp, align 4
  call void @_ZNSaIiEC1Ev(%"class.std::allocator.16"* %ref.tmp2) nounwind
  invoke void @_ZNSt6vectorIiSaIiEEC1EjRKiRKS0_(%"class.std::vector"* %circular_buf, i32 %1, i32* %ref.tmp, %"class.std::allocator.16"* %ref.tmp2)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %entry
  call void @_ZNSaIiED1Ev(%"class.std::allocator.16"* %ref.tmp2) nounwind
  %buffer_not_full = getelementptr inbounds %class.bounded_buffer* %this1, i32 0, i32 4
  invoke void @_ZN5boost22condition_variable_anyC1Ev(%"class.boost::condition_variable_any"* %buffer_not_full)
          to label %invoke.cont4 unwind label %lpad3

invoke.cont4:                                     ; preds = %invoke.cont
  %buffer_not_empty = getelementptr inbounds %class.bounded_buffer* %this1, i32 0, i32 5
  invoke void @_ZN5boost22condition_variable_anyC1Ev(%"class.boost::condition_variable_any"* %buffer_not_empty)
          to label %invoke.cont6 unwind label %lpad5

invoke.cont6:                                     ; preds = %invoke.cont4
  %monitor = getelementptr inbounds %class.bounded_buffer* %this1, i32 0, i32 6
  invoke void @_ZN5boost5mutexC1Ev(%"class.boost::mutex"* %monitor)
          to label %invoke.cont8 unwind label %lpad7

invoke.cont8:                                     ; preds = %invoke.cont6
  ret void

lpad:                                             ; preds = %entry
  %2 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %3 = extractvalue { i8*, i32 } %2, 0
  store i8* %3, i8** %exn.slot
  %4 = extractvalue { i8*, i32 } %2, 1
  store i32 %4, i32* %ehselector.slot
  call void @_ZNSaIiED1Ev(%"class.std::allocator.16"* %ref.tmp2) nounwind
  br label %ehcleanup13

lpad3:                                            ; preds = %invoke.cont
  %5 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %6 = extractvalue { i8*, i32 } %5, 0
  store i8* %6, i8** %exn.slot
  %7 = extractvalue { i8*, i32 } %5, 1
  store i32 %7, i32* %ehselector.slot
  br label %ehcleanup11

lpad5:                                            ; preds = %invoke.cont4
  %8 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %9 = extractvalue { i8*, i32 } %8, 0
  store i8* %9, i8** %exn.slot
  %10 = extractvalue { i8*, i32 } %8, 1
  store i32 %10, i32* %ehselector.slot
  br label %ehcleanup

lpad7:                                            ; preds = %invoke.cont6
  %11 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %12 = extractvalue { i8*, i32 } %11, 0
  store i8* %12, i8** %exn.slot
  %13 = extractvalue { i8*, i32 } %11, 1
  store i32 %13, i32* %ehselector.slot
  invoke void @_ZN5boost22condition_variable_anyD1Ev(%"class.boost::condition_variable_any"* %buffer_not_empty)
          to label %invoke.cont9 unwind label %terminate.lpad

invoke.cont9:                                     ; preds = %lpad7
  br label %ehcleanup

ehcleanup:                                        ; preds = %invoke.cont9, %lpad5
  invoke void @_ZN5boost22condition_variable_anyD1Ev(%"class.boost::condition_variable_any"* %buffer_not_full)
          to label %invoke.cont10 unwind label %terminate.lpad

invoke.cont10:                                    ; preds = %ehcleanup
  br label %ehcleanup11

ehcleanup11:                                      ; preds = %invoke.cont10, %lpad3
  invoke void @_ZNSt6vectorIiSaIiEED1Ev(%"class.std::vector"* %circular_buf)
          to label %invoke.cont12 unwind label %terminate.lpad

invoke.cont12:                                    ; preds = %ehcleanup11
  br label %ehcleanup13

ehcleanup13:                                      ; preds = %invoke.cont12, %lpad
  %14 = bitcast %class.bounded_buffer* %this1 to %"class.boost::noncopyable_::noncopyable"*
  invoke void @_ZN5boost12noncopyable_11noncopyableD2Ev(%"class.boost::noncopyable_::noncopyable"* %14)
          to label %invoke.cont14 unwind label %terminate.lpad

invoke.cont14:                                    ; preds = %ehcleanup13
  br label %eh.resume

eh.resume:                                        ; preds = %invoke.cont14
  %exn = load i8** %exn.slot
  %sel = load i32* %ehselector.slot
  %lpad.val = insertvalue { i8*, i32 } undef, i8* %exn, 0
  %lpad.val15 = insertvalue { i8*, i32 } %lpad.val, i32 %sel, 1
  resume { i8*, i32 } %lpad.val15

terminate.lpad:                                   ; preds = %ehcleanup13, %ehcleanup11, %ehcleanup, %lpad7
  %15 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          catch i8* null
  call void @_ZSt9terminatev() noreturn nounwind
  unreachable
}

define linkonce_odr void @_ZN5boost12noncopyable_11noncopyableC2Ev(%"class.boost::noncopyable_::noncopyable"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::noncopyable_::noncopyable"*, align 4
  store %"class.boost::noncopyable_::noncopyable"* %this, %"class.boost::noncopyable_::noncopyable"** %this.addr, align 4
  %this1 = load %"class.boost::noncopyable_::noncopyable"** %this.addr
  ret void
}

define linkonce_odr void @_ZNSt6vectorIiSaIiEEC1EjRKiRKS0_(%"class.std::vector"* %this, i32 %__n, i32* %__value, %"class.std::allocator.16"* %__a) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.std::vector"*, align 4
  %__n.addr = alloca i32, align 4
  %__value.addr = alloca i32*, align 4
  %__a.addr = alloca %"class.std::allocator.16"*, align 4
  store %"class.std::vector"* %this, %"class.std::vector"** %this.addr, align 4
  store i32 %__n, i32* %__n.addr, align 4
  store i32* %__value, i32** %__value.addr, align 4
  store %"class.std::allocator.16"* %__a, %"class.std::allocator.16"** %__a.addr, align 4
  %this1 = load %"class.std::vector"** %this.addr
  %0 = load i32* %__n.addr, align 4
  %1 = load i32** %__value.addr
  %2 = load %"class.std::allocator.16"** %__a.addr
  call void @_ZNSt6vectorIiSaIiEEC2EjRKiRKS0_(%"class.std::vector"* %this1, i32 %0, i32* %1, %"class.std::allocator.16"* %2)
  ret void
}

define linkonce_odr void @_ZNSaIiEC1Ev(%"class.std::allocator.16"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.std::allocator.16"*, align 4
  store %"class.std::allocator.16"* %this, %"class.std::allocator.16"** %this.addr, align 4
  %this1 = load %"class.std::allocator.16"** %this.addr
  call void @_ZNSaIiEC2Ev(%"class.std::allocator.16"* %this1) nounwind
  ret void
}

define linkonce_odr void @_ZNSaIiED1Ev(%"class.std::allocator.16"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.std::allocator.16"*, align 4
  store %"class.std::allocator.16"* %this, %"class.std::allocator.16"** %this.addr, align 4
  %this1 = load %"class.std::allocator.16"** %this.addr
  call void @_ZNSaIiED2Ev(%"class.std::allocator.16"* %this1) nounwind
  ret void
}

define linkonce_odr void @_ZN5boost22condition_variable_anyC1Ev(%"class.boost::condition_variable_any"* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::condition_variable_any"*, align 4
  store %"class.boost::condition_variable_any"* %this, %"class.boost::condition_variable_any"** %this.addr, align 4
  %this1 = load %"class.boost::condition_variable_any"** %this.addr
  call void @_ZN5boost22condition_variable_anyC2Ev(%"class.boost::condition_variable_any"* %this1)
  ret void
}

define linkonce_odr void @_ZN5boost22condition_variable_anyC2Ev(%"class.boost::condition_variable_any"* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::condition_variable_any"*, align 4
  %res = alloca i32, align 4
  %ref.tmp = alloca %"class.boost::thread_resource_error", align 4
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  %res2 = alloca i32, align 4
  %ref.tmp10 = alloca %"class.boost::thread_resource_error", align 4
  store %"class.boost::condition_variable_any"* %this, %"class.boost::condition_variable_any"** %this.addr, align 4
  %this1 = load %"class.boost::condition_variable_any"** %this.addr
  %internal_mutex = getelementptr inbounds %"class.boost::condition_variable_any"* %this1, i32 0, i32 0
  %cond = getelementptr inbounds %"class.boost::condition_variable_any"* %this1, i32 0, i32 1
  %internal_mutex2 = getelementptr inbounds %"class.boost::condition_variable_any"* %this1, i32 0, i32 0
  %call = call i32 @pthread_mutex_init(%union.pthread_mutex_t* %internal_mutex2, %union.pthread_mutexattr_t* null) nounwind
  store i32 %call, i32* %res, align 4
  %0 = load i32* %res, align 4
  %tobool = icmp ne i32 %0, 0
  br i1 %tobool, label %if.then, label %if.end

if.then:                                          ; preds = %entry
  %1 = load i32* %res, align 4
  call void @_ZN5boost21thread_resource_errorC1EiPKc(%"class.boost::thread_resource_error"* %ref.tmp, i32 %1, i8* getelementptr inbounds ([52 x i8]* @.str36, i32 0, i32 0))
  invoke void @_ZN5boost15throw_exceptionINS_21thread_resource_errorEEEvRKT_(%"class.boost::thread_resource_error"* %ref.tmp) noreturn
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %if.then
  unreachable

lpad:                                             ; preds = %if.then
  %2 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %3 = extractvalue { i8*, i32 } %2, 0
  store i8* %3, i8** %exn.slot
  %4 = extractvalue { i8*, i32 } %2, 1
  store i32 %4, i32* %ehselector.slot
  call void @_ZN5boost21thread_resource_errorD1Ev(%"class.boost::thread_resource_error"* %ref.tmp) nounwind
  br label %eh.resume

if.end:                                           ; preds = %entry
  %cond3 = getelementptr inbounds %"class.boost::condition_variable_any"* %this1, i32 0, i32 1
  %call4 = call i32 @pthread_cond_init(%union.pthread_cond_t* %cond3, %union.pthread_condattr_t* null) nounwind
  store i32 %call4, i32* %res2, align 4
  %5 = load i32* %res2, align 4
  %tobool5 = icmp ne i32 %5, 0
  br i1 %tobool5, label %if.then6, label %if.end13

if.then6:                                         ; preds = %if.end
  %internal_mutex7 = getelementptr inbounds %"class.boost::condition_variable_any"* %this1, i32 0, i32 0
  %call8 = call i32 @pthread_mutex_destroy(%union.pthread_mutex_t* %internal_mutex7) nounwind
  %tobool9 = icmp ne i32 %call8, 0
  br i1 %tobool9, label %cond.false, label %cond.true

cond.true:                                        ; preds = %if.then6
  br label %cond.end

cond.false:                                       ; preds = %if.then6
  call void @__assert_fail(i8* getelementptr inbounds ([40 x i8]* @.str17, i32 0, i32 0), i8* getelementptr inbounds ([70 x i8]* @.str27, i32 0, i32 0), i32 127, i8* getelementptr inbounds ([56 x i8]* @__PRETTY_FUNCTION__._ZN5boost22condition_variable_anyC2Ev, i32 0, i32 0)) noreturn nounwind
  unreachable
                                                  ; No predecessors!
  br label %cond.end

cond.end:                                         ; preds = %6, %cond.true
  %7 = load i32* %res, align 4
  call void @_ZN5boost21thread_resource_errorC1EiPKc(%"class.boost::thread_resource_error"* %ref.tmp10, i32 %7, i8* getelementptr inbounds ([51 x i8]* @.str37, i32 0, i32 0))
  invoke void @_ZN5boost15throw_exceptionINS_21thread_resource_errorEEEvRKT_(%"class.boost::thread_resource_error"* %ref.tmp10) noreturn
          to label %invoke.cont12 unwind label %lpad11

invoke.cont12:                                    ; preds = %cond.end
  unreachable

lpad11:                                           ; preds = %cond.end
  %8 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %9 = extractvalue { i8*, i32 } %8, 0
  store i8* %9, i8** %exn.slot
  %10 = extractvalue { i8*, i32 } %8, 1
  store i32 %10, i32* %ehselector.slot
  call void @_ZN5boost21thread_resource_errorD1Ev(%"class.boost::thread_resource_error"* %ref.tmp10) nounwind
  br label %eh.resume

if.end13:                                         ; preds = %if.end
  ret void

eh.resume:                                        ; preds = %lpad11, %lpad
  %exn = load i8** %exn.slot
  %sel = load i32* %ehselector.slot
  %lpad.val = insertvalue { i8*, i32 } undef, i8* %exn, 0
  %lpad.val14 = insertvalue { i8*, i32 } %lpad.val, i32 %sel, 1
  resume { i8*, i32 } %lpad.val14
}

define linkonce_odr void @_ZNSaIiEC2Ev(%"class.std::allocator.16"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.std::allocator.16"*, align 4
  store %"class.std::allocator.16"* %this, %"class.std::allocator.16"** %this.addr, align 4
  %this1 = load %"class.std::allocator.16"** %this.addr
  %0 = bitcast %"class.std::allocator.16"* %this1 to %"class.__gnu_cxx::new_allocator.17"*
  call void @_ZN9__gnu_cxx13new_allocatorIiEC2Ev(%"class.__gnu_cxx::new_allocator.17"* %0) nounwind
  ret void
}

define linkonce_odr void @_ZN9__gnu_cxx13new_allocatorIiEC2Ev(%"class.__gnu_cxx::new_allocator.17"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.__gnu_cxx::new_allocator.17"*, align 4
  store %"class.__gnu_cxx::new_allocator.17"* %this, %"class.__gnu_cxx::new_allocator.17"** %this.addr, align 4
  %this1 = load %"class.__gnu_cxx::new_allocator.17"** %this.addr
  ret void
}

define linkonce_odr void @_ZNSt6vectorIiSaIiEEC2EjRKiRKS0_(%"class.std::vector"* %this, i32 %__n, i32* %__value, %"class.std::allocator.16"* %__a) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.std::vector"*, align 4
  %__n.addr = alloca i32, align 4
  %__value.addr = alloca i32*, align 4
  %__a.addr = alloca %"class.std::allocator.16"*, align 4
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  store %"class.std::vector"* %this, %"class.std::vector"** %this.addr, align 4
  store i32 %__n, i32* %__n.addr, align 4
  store i32* %__value, i32** %__value.addr, align 4
  store %"class.std::allocator.16"* %__a, %"class.std::allocator.16"** %__a.addr, align 4
  %this1 = load %"class.std::vector"** %this.addr
  %0 = bitcast %"class.std::vector"* %this1 to %"struct.std::_Vector_base"*
  %1 = load i32* %__n.addr, align 4
  %2 = load %"class.std::allocator.16"** %__a.addr, align 4
  call void @_ZNSt12_Vector_baseIiSaIiEEC2EjRKS0_(%"struct.std::_Vector_base"* %0, i32 %1, %"class.std::allocator.16"* %2)
  %3 = load i32* %__n.addr, align 4
  %4 = load i32** %__value.addr, align 4
  invoke void @_ZNSt6vectorIiSaIiEE18_M_fill_initializeEjRKi(%"class.std::vector"* %this1, i32 %3, i32* %4)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %entry
  ret void

lpad:                                             ; preds = %entry
  %5 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %6 = extractvalue { i8*, i32 } %5, 0
  store i8* %6, i8** %exn.slot
  %7 = extractvalue { i8*, i32 } %5, 1
  store i32 %7, i32* %ehselector.slot
  %8 = bitcast %"class.std::vector"* %this1 to %"struct.std::_Vector_base"*
  invoke void @_ZNSt12_Vector_baseIiSaIiEED2Ev(%"struct.std::_Vector_base"* %8)
          to label %invoke.cont2 unwind label %terminate.lpad

invoke.cont2:                                     ; preds = %lpad
  br label %eh.resume

eh.resume:                                        ; preds = %invoke.cont2
  %exn = load i8** %exn.slot
  %sel = load i32* %ehselector.slot
  %lpad.val = insertvalue { i8*, i32 } undef, i8* %exn, 0
  %lpad.val3 = insertvalue { i8*, i32 } %lpad.val, i32 %sel, 1
  resume { i8*, i32 } %lpad.val3

terminate.lpad:                                   ; preds = %lpad
  %9 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          catch i8* null
  call void @_ZSt9terminatev() noreturn nounwind
  unreachable
}

define linkonce_odr void @_ZNSt12_Vector_baseIiSaIiEEC2EjRKS0_(%"struct.std::_Vector_base"* %this, i32 %__n, %"class.std::allocator.16"* %__a) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"struct.std::_Vector_base"*, align 4
  %__n.addr = alloca i32, align 4
  %__a.addr = alloca %"class.std::allocator.16"*, align 4
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  store %"struct.std::_Vector_base"* %this, %"struct.std::_Vector_base"** %this.addr, align 4
  store i32 %__n, i32* %__n.addr, align 4
  store %"class.std::allocator.16"* %__a, %"class.std::allocator.16"** %__a.addr, align 4
  %this1 = load %"struct.std::_Vector_base"** %this.addr
  %_M_impl = getelementptr inbounds %"struct.std::_Vector_base"* %this1, i32 0, i32 0
  %0 = load %"class.std::allocator.16"** %__a.addr, align 4
  call void @_ZNSt12_Vector_baseIiSaIiEE12_Vector_implC1ERKS0_(%"struct.std::_Vector_base<int, std::allocator<int> >::_Vector_impl"* %_M_impl, %"class.std::allocator.16"* %0)
  %1 = load i32* %__n.addr, align 4
  %call = invoke i32* @_ZNSt12_Vector_baseIiSaIiEE11_M_allocateEj(%"struct.std::_Vector_base"* %this1, i32 %1)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %entry
  %_M_impl2 = getelementptr inbounds %"struct.std::_Vector_base"* %this1, i32 0, i32 0
  %_M_start = getelementptr inbounds %"struct.std::_Vector_base<int, std::allocator<int> >::_Vector_impl"* %_M_impl2, i32 0, i32 0
  store i32* %call, i32** %_M_start, align 4
  %_M_impl3 = getelementptr inbounds %"struct.std::_Vector_base"* %this1, i32 0, i32 0
  %_M_start4 = getelementptr inbounds %"struct.std::_Vector_base<int, std::allocator<int> >::_Vector_impl"* %_M_impl3, i32 0, i32 0
  %2 = load i32** %_M_start4, align 4
  %_M_impl5 = getelementptr inbounds %"struct.std::_Vector_base"* %this1, i32 0, i32 0
  %_M_finish = getelementptr inbounds %"struct.std::_Vector_base<int, std::allocator<int> >::_Vector_impl"* %_M_impl5, i32 0, i32 1
  store i32* %2, i32** %_M_finish, align 4
  %_M_impl6 = getelementptr inbounds %"struct.std::_Vector_base"* %this1, i32 0, i32 0
  %_M_start7 = getelementptr inbounds %"struct.std::_Vector_base<int, std::allocator<int> >::_Vector_impl"* %_M_impl6, i32 0, i32 0
  %3 = load i32** %_M_start7, align 4
  %4 = load i32* %__n.addr, align 4
  %add.ptr = getelementptr inbounds i32* %3, i32 %4
  %_M_impl8 = getelementptr inbounds %"struct.std::_Vector_base"* %this1, i32 0, i32 0
  %_M_end_of_storage = getelementptr inbounds %"struct.std::_Vector_base<int, std::allocator<int> >::_Vector_impl"* %_M_impl8, i32 0, i32 2
  store i32* %add.ptr, i32** %_M_end_of_storage, align 4
  ret void

lpad:                                             ; preds = %entry
  %5 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %6 = extractvalue { i8*, i32 } %5, 0
  store i8* %6, i8** %exn.slot
  %7 = extractvalue { i8*, i32 } %5, 1
  store i32 %7, i32* %ehselector.slot
  call void @_ZNSt12_Vector_baseIiSaIiEE12_Vector_implD1Ev(%"struct.std::_Vector_base<int, std::allocator<int> >::_Vector_impl"* %_M_impl) nounwind
  br label %eh.resume

eh.resume:                                        ; preds = %lpad
  %exn = load i8** %exn.slot
  %sel = load i32* %ehselector.slot
  %lpad.val = insertvalue { i8*, i32 } undef, i8* %exn, 0
  %lpad.val9 = insertvalue { i8*, i32 } %lpad.val, i32 %sel, 1
  resume { i8*, i32 } %lpad.val9
}

define linkonce_odr void @_ZNSt6vectorIiSaIiEE18_M_fill_initializeEjRKi(%"class.std::vector"* %this, i32 %__n, i32* %__value) align 2 {
entry:
  %this.addr = alloca %"class.std::vector"*, align 4
  %__n.addr = alloca i32, align 4
  %__value.addr = alloca i32*, align 4
  store %"class.std::vector"* %this, %"class.std::vector"** %this.addr, align 4
  store i32 %__n, i32* %__n.addr, align 4
  store i32* %__value, i32** %__value.addr, align 4
  %this1 = load %"class.std::vector"** %this.addr
  %0 = bitcast %"class.std::vector"* %this1 to %"struct.std::_Vector_base"*
  %_M_impl = getelementptr inbounds %"struct.std::_Vector_base"* %0, i32 0, i32 0
  %_M_start = getelementptr inbounds %"struct.std::_Vector_base<int, std::allocator<int> >::_Vector_impl"* %_M_impl, i32 0, i32 0
  %1 = load i32** %_M_start, align 4
  %2 = load i32* %__n.addr, align 4
  %3 = load i32** %__value.addr, align 4
  %4 = bitcast %"class.std::vector"* %this1 to %"struct.std::_Vector_base"*
  %call = call %"class.std::allocator.16"* @_ZNSt12_Vector_baseIiSaIiEE19_M_get_Tp_allocatorEv(%"struct.std::_Vector_base"* %4)
  call void @_ZSt24__uninitialized_fill_n_aIPijiiEvT_T0_RKT1_RSaIT2_E(i32* %1, i32 %2, i32* %3, %"class.std::allocator.16"* %call)
  %5 = bitcast %"class.std::vector"* %this1 to %"struct.std::_Vector_base"*
  %_M_impl2 = getelementptr inbounds %"struct.std::_Vector_base"* %5, i32 0, i32 0
  %_M_end_of_storage = getelementptr inbounds %"struct.std::_Vector_base<int, std::allocator<int> >::_Vector_impl"* %_M_impl2, i32 0, i32 2
  %6 = load i32** %_M_end_of_storage, align 4
  %7 = bitcast %"class.std::vector"* %this1 to %"struct.std::_Vector_base"*
  %_M_impl3 = getelementptr inbounds %"struct.std::_Vector_base"* %7, i32 0, i32 0
  %_M_finish = getelementptr inbounds %"struct.std::_Vector_base<int, std::allocator<int> >::_Vector_impl"* %_M_impl3, i32 0, i32 1
  store i32* %6, i32** %_M_finish, align 4
  ret void
}

define linkonce_odr void @_ZSt24__uninitialized_fill_n_aIPijiiEvT_T0_RKT1_RSaIT2_E(i32* %__first, i32 %__n, i32* %__x, %"class.std::allocator.16"*) inlinehint {
entry:
  %__first.addr = alloca i32*, align 4
  %__n.addr = alloca i32, align 4
  %__x.addr = alloca i32*, align 4
  %.addr = alloca %"class.std::allocator.16"*, align 4
  store i32* %__first, i32** %__first.addr, align 4
  store i32 %__n, i32* %__n.addr, align 4
  store i32* %__x, i32** %__x.addr, align 4
  store %"class.std::allocator.16"* %0, %"class.std::allocator.16"** %.addr, align 4
  %1 = load i32** %__first.addr, align 4
  %2 = load i32* %__n.addr, align 4
  %3 = load i32** %__x.addr, align 4
  call void @_ZSt20uninitialized_fill_nIPijiEvT_T0_RKT1_(i32* %1, i32 %2, i32* %3)
  ret void
}

define linkonce_odr void @_ZSt20uninitialized_fill_nIPijiEvT_T0_RKT1_(i32* %__first, i32 %__n, i32* %__x) inlinehint {
entry:
  %__first.addr = alloca i32*, align 4
  %__n.addr = alloca i32, align 4
  %__x.addr = alloca i32*, align 4
  store i32* %__first, i32** %__first.addr, align 4
  store i32 %__n, i32* %__n.addr, align 4
  store i32* %__x, i32** %__x.addr, align 4
  %0 = load i32** %__first.addr, align 4
  %1 = load i32* %__n.addr, align 4
  %2 = load i32** %__x.addr, align 4
  call void @_ZNSt22__uninitialized_fill_nILb1EE15__uninit_fill_nIPijiEEvT_T0_RKT1_(i32* %0, i32 %1, i32* %2)
  ret void
}

define linkonce_odr void @_ZNSt22__uninitialized_fill_nILb1EE15__uninit_fill_nIPijiEEvT_T0_RKT1_(i32* %__first, i32 %__n, i32* %__x) align 2 {
entry:
  %__first.addr = alloca i32*, align 4
  %__n.addr = alloca i32, align 4
  %__x.addr = alloca i32*, align 4
  store i32* %__first, i32** %__first.addr, align 4
  store i32 %__n, i32* %__n.addr, align 4
  store i32* %__x, i32** %__x.addr, align 4
  %0 = load i32** %__first.addr, align 4
  %1 = load i32* %__n.addr, align 4
  %2 = load i32** %__x.addr, align 4
  %call = call i32* @_ZSt6fill_nIPijiET_S1_T0_RKT1_(i32* %0, i32 %1, i32* %2)
  ret void
}

define linkonce_odr i32* @_ZSt6fill_nIPijiET_S1_T0_RKT1_(i32* %__first, i32 %__n, i32* %__value) inlinehint {
entry:
  %__first.addr = alloca i32*, align 4
  %__n.addr = alloca i32, align 4
  %__value.addr = alloca i32*, align 4
  store i32* %__first, i32** %__first.addr, align 4
  store i32 %__n, i32* %__n.addr, align 4
  store i32* %__value, i32** %__value.addr, align 4
  %0 = load i32** %__first.addr, align 4
  %call = call i32* @_ZSt12__niter_baseIPiENSt11_Niter_baseIT_E13iterator_typeES2_(i32* %0)
  %1 = load i32* %__n.addr, align 4
  %2 = load i32** %__value.addr, align 4
  %call1 = call i32* @_ZSt10__fill_n_aIPijiEN9__gnu_cxx11__enable_ifIXsr11__is_scalarIT1_EE7__valueET_E6__typeES4_T0_RKS3_(i32* %call, i32 %1, i32* %2)
  ret i32* %call1
}

define linkonce_odr i32* @_ZSt10__fill_n_aIPijiEN9__gnu_cxx11__enable_ifIXsr11__is_scalarIT1_EE7__valueET_E6__typeES4_T0_RKS3_(i32* %__first, i32 %__n, i32* %__value) nounwind inlinehint {
entry:
  %__first.addr = alloca i32*, align 4
  %__n.addr = alloca i32, align 4
  %__value.addr = alloca i32*, align 4
  %__tmp = alloca i32, align 4
  %__niter = alloca i32, align 4
  store i32* %__first, i32** %__first.addr, align 4
  store i32 %__n, i32* %__n.addr, align 4
  store i32* %__value, i32** %__value.addr, align 4
  %0 = load i32** %__value.addr, align 4
  %1 = load i32* %0, align 4
  store i32 %1, i32* %__tmp, align 4
  %2 = load i32* %__n.addr, align 4
  store i32 %2, i32* %__niter, align 4
  br label %for.cond

for.cond:                                         ; preds = %for.inc, %entry
  %3 = load i32* %__niter, align 4
  %cmp = icmp ugt i32 %3, 0
  br i1 %cmp, label %for.body, label %for.end

for.body:                                         ; preds = %for.cond
  %4 = load i32* %__tmp, align 4
  %5 = load i32** %__first.addr, align 4
  store i32 %4, i32* %5, align 4
  br label %for.inc

for.inc:                                          ; preds = %for.body
  %6 = load i32* %__niter, align 4
  %dec = add i32 %6, -1
  store i32 %dec, i32* %__niter, align 4
  %7 = load i32** %__first.addr, align 4
  %incdec.ptr = getelementptr inbounds i32* %7, i32 1
  store i32* %incdec.ptr, i32** %__first.addr, align 4
  br label %for.cond

for.end:                                          ; preds = %for.cond
  %8 = load i32** %__first.addr, align 4
  ret i32* %8
}

define linkonce_odr i32* @_ZSt12__niter_baseIPiENSt11_Niter_baseIT_E13iterator_typeES2_(i32* %__it) inlinehint {
entry:
  %__it.addr = alloca i32*, align 4
  store i32* %__it, i32** %__it.addr, align 4
  %0 = load i32** %__it.addr, align 4
  %call = call i32* @_ZNSt10_Iter_baseIPiLb0EE7_S_baseES0_(i32* %0)
  ret i32* %call
}

define linkonce_odr i32* @_ZNSt10_Iter_baseIPiLb0EE7_S_baseES0_(i32* %__it) nounwind align 2 {
entry:
  %__it.addr = alloca i32*, align 4
  store i32* %__it, i32** %__it.addr, align 4
  %0 = load i32** %__it.addr, align 4
  ret i32* %0
}

define linkonce_odr void @_ZNSt12_Vector_baseIiSaIiEE12_Vector_implC1ERKS0_(%"struct.std::_Vector_base<int, std::allocator<int> >::_Vector_impl"* %this, %"class.std::allocator.16"* %__a) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"struct.std::_Vector_base<int, std::allocator<int> >::_Vector_impl"*, align 4
  %__a.addr = alloca %"class.std::allocator.16"*, align 4
  store %"struct.std::_Vector_base<int, std::allocator<int> >::_Vector_impl"* %this, %"struct.std::_Vector_base<int, std::allocator<int> >::_Vector_impl"** %this.addr, align 4
  store %"class.std::allocator.16"* %__a, %"class.std::allocator.16"** %__a.addr, align 4
  %this1 = load %"struct.std::_Vector_base<int, std::allocator<int> >::_Vector_impl"** %this.addr
  %0 = load %"class.std::allocator.16"** %__a.addr
  call void @_ZNSt12_Vector_baseIiSaIiEE12_Vector_implC2ERKS0_(%"struct.std::_Vector_base<int, std::allocator<int> >::_Vector_impl"* %this1, %"class.std::allocator.16"* %0)
  ret void
}

define linkonce_odr i32* @_ZNSt12_Vector_baseIiSaIiEE11_M_allocateEj(%"struct.std::_Vector_base"* %this, i32 %__n) align 2 {
entry:
  %this.addr = alloca %"struct.std::_Vector_base"*, align 4
  %__n.addr = alloca i32, align 4
  store %"struct.std::_Vector_base"* %this, %"struct.std::_Vector_base"** %this.addr, align 4
  store i32 %__n, i32* %__n.addr, align 4
  %this1 = load %"struct.std::_Vector_base"** %this.addr
  %0 = load i32* %__n.addr, align 4
  %cmp = icmp ne i32 %0, 0
  br i1 %cmp, label %cond.true, label %cond.false

cond.true:                                        ; preds = %entry
  %_M_impl = getelementptr inbounds %"struct.std::_Vector_base"* %this1, i32 0, i32 0
  %1 = bitcast %"struct.std::_Vector_base<int, std::allocator<int> >::_Vector_impl"* %_M_impl to %"class.__gnu_cxx::new_allocator.17"*
  %2 = load i32* %__n.addr, align 4
  %call = call i32* @_ZN9__gnu_cxx13new_allocatorIiE8allocateEjPKv(%"class.__gnu_cxx::new_allocator.17"* %1, i32 %2, i8* null)
  br label %cond.end

cond.false:                                       ; preds = %entry
  br label %cond.end

cond.end:                                         ; preds = %cond.false, %cond.true
  %cond = phi i32* [ %call, %cond.true ], [ null, %cond.false ]
  ret i32* %cond
}

define linkonce_odr i32* @_ZN9__gnu_cxx13new_allocatorIiE8allocateEjPKv(%"class.__gnu_cxx::new_allocator.17"* %this, i32 %__n, i8*) align 2 {
entry:
  %this.addr = alloca %"class.__gnu_cxx::new_allocator.17"*, align 4
  %__n.addr = alloca i32, align 4
  %.addr = alloca i8*, align 4
  store %"class.__gnu_cxx::new_allocator.17"* %this, %"class.__gnu_cxx::new_allocator.17"** %this.addr, align 4
  store i32 %__n, i32* %__n.addr, align 4
  store i8* %0, i8** %.addr, align 4
  %this1 = load %"class.__gnu_cxx::new_allocator.17"** %this.addr
  %1 = load i32* %__n.addr, align 4
  %call = call i32 @_ZNK9__gnu_cxx13new_allocatorIiE8max_sizeEv(%"class.__gnu_cxx::new_allocator.17"* %this1) nounwind
  %cmp = icmp ugt i32 %1, %call
  br i1 %cmp, label %if.then, label %if.end

if.then:                                          ; preds = %entry
  call void @_ZSt17__throw_bad_allocv() noreturn
  unreachable

if.end:                                           ; preds = %entry
  %2 = load i32* %__n.addr, align 4
  %mul = mul i32 %2, 4
  %call2 = call noalias i8* @_Znwj(i32 %mul)
  %3 = bitcast i8* %call2 to i32*
  ret i32* %3
}

define linkonce_odr i32 @_ZNK9__gnu_cxx13new_allocatorIiE8max_sizeEv(%"class.__gnu_cxx::new_allocator.17"* %this) nounwind align 2 {
entry:
  %this.addr = alloca %"class.__gnu_cxx::new_allocator.17"*, align 4
  store %"class.__gnu_cxx::new_allocator.17"* %this, %"class.__gnu_cxx::new_allocator.17"** %this.addr, align 4
  %this1 = load %"class.__gnu_cxx::new_allocator.17"** %this.addr
  ret i32 1073741823
}

declare void @_ZSt17__throw_bad_allocv() noreturn

define linkonce_odr void @_ZNSt12_Vector_baseIiSaIiEE12_Vector_implC2ERKS0_(%"struct.std::_Vector_base<int, std::allocator<int> >::_Vector_impl"* %this, %"class.std::allocator.16"* %__a) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"struct.std::_Vector_base<int, std::allocator<int> >::_Vector_impl"*, align 4
  %__a.addr = alloca %"class.std::allocator.16"*, align 4
  store %"struct.std::_Vector_base<int, std::allocator<int> >::_Vector_impl"* %this, %"struct.std::_Vector_base<int, std::allocator<int> >::_Vector_impl"** %this.addr, align 4
  store %"class.std::allocator.16"* %__a, %"class.std::allocator.16"** %__a.addr, align 4
  %this1 = load %"struct.std::_Vector_base<int, std::allocator<int> >::_Vector_impl"** %this.addr
  %0 = bitcast %"struct.std::_Vector_base<int, std::allocator<int> >::_Vector_impl"* %this1 to %"class.std::allocator.16"*
  %1 = load %"class.std::allocator.16"** %__a.addr, align 4
  call void @_ZNSaIiEC2ERKS_(%"class.std::allocator.16"* %0, %"class.std::allocator.16"* %1) nounwind
  %_M_start = getelementptr inbounds %"struct.std::_Vector_base<int, std::allocator<int> >::_Vector_impl"* %this1, i32 0, i32 0
  store i32* null, i32** %_M_start, align 4
  %_M_finish = getelementptr inbounds %"struct.std::_Vector_base<int, std::allocator<int> >::_Vector_impl"* %this1, i32 0, i32 1
  store i32* null, i32** %_M_finish, align 4
  %_M_end_of_storage = getelementptr inbounds %"struct.std::_Vector_base<int, std::allocator<int> >::_Vector_impl"* %this1, i32 0, i32 2
  store i32* null, i32** %_M_end_of_storage, align 4
  ret void
}

define linkonce_odr void @_ZNSaIiEC2ERKS_(%"class.std::allocator.16"* %this, %"class.std::allocator.16"* %__a) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.std::allocator.16"*, align 4
  %__a.addr = alloca %"class.std::allocator.16"*, align 4
  store %"class.std::allocator.16"* %this, %"class.std::allocator.16"** %this.addr, align 4
  store %"class.std::allocator.16"* %__a, %"class.std::allocator.16"** %__a.addr, align 4
  %this1 = load %"class.std::allocator.16"** %this.addr
  %0 = bitcast %"class.std::allocator.16"* %this1 to %"class.__gnu_cxx::new_allocator.17"*
  %1 = load %"class.std::allocator.16"** %__a.addr, align 4
  %2 = bitcast %"class.std::allocator.16"* %1 to %"class.__gnu_cxx::new_allocator.17"*
  call void @_ZN9__gnu_cxx13new_allocatorIiEC2ERKS1_(%"class.__gnu_cxx::new_allocator.17"* %0, %"class.__gnu_cxx::new_allocator.17"* %2) nounwind
  ret void
}

define linkonce_odr void @_ZN9__gnu_cxx13new_allocatorIiEC2ERKS1_(%"class.__gnu_cxx::new_allocator.17"* %this, %"class.__gnu_cxx::new_allocator.17"*) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.__gnu_cxx::new_allocator.17"*, align 4
  %.addr = alloca %"class.__gnu_cxx::new_allocator.17"*, align 4
  store %"class.__gnu_cxx::new_allocator.17"* %this, %"class.__gnu_cxx::new_allocator.17"** %this.addr, align 4
  store %"class.__gnu_cxx::new_allocator.17"* %0, %"class.__gnu_cxx::new_allocator.17"** %.addr, align 4
  %this1 = load %"class.__gnu_cxx::new_allocator.17"** %this.addr
  ret void
}

define linkonce_odr void @_ZN5boost6system15error_conditionC2EiRKNS0_14error_categoryE(%"class.boost::system::error_condition"* %this, i32 %val, %"class.boost::system::error_category"* %cat) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::system::error_condition"*, align 4
  %val.addr = alloca i32, align 4
  %cat.addr = alloca %"class.boost::system::error_category"*, align 4
  store %"class.boost::system::error_condition"* %this, %"class.boost::system::error_condition"** %this.addr, align 4
  store i32 %val, i32* %val.addr, align 4
  store %"class.boost::system::error_category"* %cat, %"class.boost::system::error_category"** %cat.addr, align 4
  %this1 = load %"class.boost::system::error_condition"** %this.addr
  %m_val = getelementptr inbounds %"class.boost::system::error_condition"* %this1, i32 0, i32 0
  %0 = load i32* %val.addr, align 4
  store i32 %0, i32* %m_val, align 4
  %m_cat = getelementptr inbounds %"class.boost::system::error_condition"* %this1, i32 0, i32 1
  %1 = load %"class.boost::system::error_category"** %cat.addr, align 4
  store %"class.boost::system::error_category"* %1, %"class.boost::system::error_category"** %m_cat, align 4
  ret void
}

define internal void @_GLOBAL__I_a() section ".text.startup" {
entry:
  call void @__cxx_global_var_init()
  call void @__cxx_global_var_init1()
  call void @__cxx_global_var_init2()
  call void @__cxx_global_var_init3()
  call void @__cxx_global_var_init4()
  call void @__cxx_global_var_init5()
  call void @__cxx_global_var_init6()
  call void @__cxx_global_var_init7()
  call void @__cxx_global_var_init8()
  call void @__cxx_global_var_init9()
  call void @__cxx_global_var_init10()
  call void @__cxx_global_var_init11()
  call void @__cxx_global_var_init12()
  call void @__cxx_global_var_init13()
  call void @__cxx_global_var_init14()
  ret void
}

!0 = metadata !{i32 4463725, i32 4463732}         
!1 = metadata !{i32 4464037, i32 4464044}         
