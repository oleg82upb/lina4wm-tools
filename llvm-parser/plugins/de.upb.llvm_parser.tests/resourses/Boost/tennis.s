; ModuleID = 'tennis.cpp'
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
%"class.boost::mutex" = type { %union.pthread_mutex_t }
%union.pthread_mutex_t = type { %"struct.<anonymous union>::__pthread_mutex_s" }
%"struct.<anonymous union>::__pthread_mutex_s" = type { i32, i32, i32, i32, i32, %union.anon }
%union.anon = type { i32 }
%"class.boost::condition_variable_any" = type { %union.pthread_mutex_t, %union.pthread_cond_t }
%union.pthread_cond_t = type { %struct.anon, [4 x i8] }
%struct.anon = type { i32, i32, i64, i64, i64, i8*, i32, i32 }
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
%"class.boost::pthread::pthread_mutex_scoped_lock" = type { %union.pthread_mutex_t*, i8 }
%"struct.boost::thread_cv_detail::lock_on_exit" = type { %"class.boost::unique_lock"* }
%"class.boost::detail::interruption_checker" = type { %"struct.boost::detail::thread_data_base"*, %union.pthread_mutex_t*, i8 }
%"struct.boost::detail::thread_data_base" = type { i32 (...)**, %"class.boost::enable_shared_from_this", %"class.boost::shared_ptr", i32, %"class.boost::mutex", %"class.boost::condition_variable", %"class.boost::mutex", %"class.boost::condition_variable", i8, i8, i8, %"struct.boost::detail::thread_exit_callback_node"*, %"class.std::map", i8, i8, %union.pthread_mutex_t*, %union.pthread_cond_t*, %"class.std::vector" }
%"class.boost::enable_shared_from_this" = type { %"class.boost::weak_ptr" }
%"class.boost::weak_ptr" = type { %"struct.boost::detail::thread_data_base"*, %"class.boost::detail::weak_count" }
%"class.boost::detail::weak_count" = type { %"class.boost::detail::sp_counted_base"* }
%"class.boost::detail::sp_counted_base" = type { i32 (...)**, i32, i32 }
%"class.boost::shared_ptr" = type { %"struct.boost::detail::thread_data_base"*, %"class.boost::detail::shared_count" }
%"class.boost::detail::shared_count" = type { %"class.boost::detail::sp_counted_base"* }
%"class.boost::condition_variable" = type { %union.pthread_mutex_t, %union.pthread_cond_t }
%"struct.boost::detail::thread_exit_callback_node" = type opaque
%"class.std::map" = type { %"class.std::_Rb_tree" }
%"class.std::_Rb_tree" = type { %"struct.std::_Rb_tree<const void *, std::pair<const void *const, boost::detail::tss_data_node>, std::_Select1st<std::pair<const void *const, boost::detail::tss_data_node> >, std::less<const void *>, std::allocator<std::pair<const void *const, boost::detail::tss_data_node> > >::_Rb_tree_impl" }
%"struct.std::_Rb_tree<const void *, std::pair<const void *const, boost::detail::tss_data_node>, std::_Select1st<std::pair<const void *const, boost::detail::tss_data_node> >, std::less<const void *>, std::allocator<std::pair<const void *const, boost::detail::tss_data_node> > >::_Rb_tree_impl" = type { %"struct.std::less", %"struct.std::_Rb_tree_node_base", i32 }
%"struct.std::less" = type { i8 }
%"struct.std::_Rb_tree_node_base" = type { i32, %"struct.std::_Rb_tree_node_base"*, %"struct.std::_Rb_tree_node_base"*, %"struct.std::_Rb_tree_node_base"* }
%"class.std::vector" = type { %"struct.std::_Vector_base" }
%"struct.std::_Vector_base" = type { %"struct.std::_Vector_base<std::pair<boost::condition_variable *, boost::mutex *>, std::allocator<std::pair<boost::condition_variable *, boost::mutex *> > >::_Vector_impl" }
%"struct.std::_Vector_base<std::pair<boost::condition_variable *, boost::mutex *>, std::allocator<std::pair<boost::condition_variable *, boost::mutex *> > >::_Vector_impl" = type { %"struct.std::pair"*, %"struct.std::pair"*, %"struct.std::pair"* }
%"struct.std::pair" = type { %"class.boost::condition_variable"*, %"class.boost::mutex"* }
%"class.boost::condition_error" = type { %"class.boost::system::system_error" }
%"class.boost::thread" = type { %"class.boost::shared_ptr" }
%class.thread_adapter = type { void (i8*)*, i8* }
%"struct.boost::xtime" = type { i64, i32 }
%"class.boost::posix_time::ptime" = type { %"class.boost::date_time::base_time" }
%"class.boost::date_time::base_time" = type { %"struct.boost::date_time::counted_time_rep" }
%"struct.boost::date_time::counted_time_rep" = type { %"class.boost::date_time::int_adapter" }
%"class.boost::date_time::int_adapter" = type { i64 }
%"struct.boost::thread::dummy" = type opaque
%"class.boost::posix_time::seconds" = type { %"class.boost::posix_time::time_duration" }
%"class.boost::posix_time::time_duration" = type { %"class.boost::date_time::time_duration" }
%"class.boost::date_time::time_duration" = type { %"class.boost::date_time::int_adapter" }
%"class.boost::date_time::subsecond_duration" = type { %"class.boost::posix_time::time_duration" }
%"class.boost::detail::thread_data" = type { %"struct.boost::detail::thread_data_base", %class.thread_adapter }
%"struct.std::_Rb_tree_node" = type { %"struct.std::_Rb_tree_node_base", %"struct.std::pair.22" }
%"struct.std::pair.22" = type { i8*, %"struct.boost::detail::tss_data_node" }
%"struct.boost::detail::tss_data_node" = type { %"class.boost::shared_ptr.23", i8* }
%"class.boost::shared_ptr.23" = type { %"struct.boost::detail::tss_cleanup_function"*, %"class.boost::detail::shared_count" }
%"struct.boost::detail::tss_cleanup_function" = type opaque
%"class.std::allocator.16" = type { i8 }
%"class.__gnu_cxx::new_allocator.17" = type { i8 }
%"class.std::allocator.24" = type { i8 }
%"class.__gnu_cxx::new_allocator.25" = type { i8 }
%"class.std::allocator.19" = type { i8 }
%"class.__gnu_cxx::new_allocator.20" = type { i8 }
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
%"struct.boost::exception_detail::error_info_injector.28" = type { %"class.boost::condition_error", %"class.boost::exception" }
%"class.boost::exception_detail::clone_impl.27" = type { %"struct.boost::exception_detail::error_info_injector.28", %"class.boost::exception_detail::clone_base" }
%"struct.boost::exception_detail::clone_impl<boost::exception_detail::error_info_injector<boost::condition_error> >::clone_tag" = type { i8 }
%"class.boost::lock_error" = type { %"class.boost::thread_exception" }
%"struct.boost::exception_detail::error_info_injector.31" = type { %"class.boost::lock_error", %"class.boost::exception" }
%"class.boost::exception_detail::clone_impl.30" = type { %"struct.boost::exception_detail::error_info_injector.31", %"class.boost::exception_detail::clone_base" }
%"struct.boost::exception_detail::clone_impl<boost::exception_detail::error_info_injector<boost::lock_error> >::clone_tag" = type { i8 }
%"class.boost::lock_guard" = type { %"class.boost::mutex"* }
%"class.boost::thread_interrupted" = type { i8 }
%"class.boost::noncopyable_::noncopyable" = type { i8 }
%"class.boost::gregorian::date" = type { %"class.boost::date_time::date" }
%"class.boost::date_time::date" = type { i32 }
%"class.boost::gregorian::greg_year" = type { %"class.boost::CV::constrained_value" }
%"class.boost::CV::constrained_value" = type { i16 }
%"class.boost::gregorian::greg_month" = type { %"class.boost::CV::constrained_value.43" }
%"class.boost::CV::constrained_value.43" = type { i16 }
%"class.boost::gregorian::greg_day" = type { %"class.boost::CV::constrained_value.44" }
%"class.boost::CV::constrained_value.44" = type { i16 }
%"struct.boost::less_than_comparable.33" = type { i8 }
%"struct.boost::less_than_comparable" = type { i8 }
%"struct.boost::gregorian::bad_day_of_month" = type { %"class.std::out_of_range" }
%"class.std::out_of_range" = type { %"class.std::logic_error" }
%"class.std::logic_error" = type { %"class.std::exception", %"class.std::basic_string" }
%"struct.boost::exception_detail::error_info_injector.46" = type { %"struct.boost::gregorian::bad_day_of_month", %"class.boost::exception" }
%"class.boost::exception_detail::clone_impl.45" = type { %"struct.boost::exception_detail::error_info_injector.46", %"class.boost::exception_detail::clone_base" }
%"struct.boost::exception_detail::clone_impl<boost::exception_detail::error_info_injector<boost::gregorian::bad_day_of_month> >::clone_tag" = type { i8 }
%"struct.boost::gregorian::bad_month" = type { %"class.std::out_of_range" }
%"struct.boost::exception_detail::error_info_injector.49" = type { %"struct.boost::gregorian::bad_month", %"class.boost::exception" }
%"class.boost::exception_detail::clone_impl.48" = type { %"struct.boost::exception_detail::error_info_injector.49", %"class.boost::exception_detail::clone_base" }
%"struct.boost::exception_detail::clone_impl<boost::exception_detail::error_info_injector<boost::gregorian::bad_month> >::clone_tag" = type { i8 }
%"struct.boost::gregorian::bad_year" = type { %"class.std::out_of_range" }
%"struct.boost::exception_detail::error_info_injector.52" = type { %"struct.boost::gregorian::bad_year", %"class.boost::exception" }
%"class.boost::exception_detail::clone_impl.51" = type { %"struct.boost::exception_detail::error_info_injector.52", %"class.boost::exception_detail::clone_base" }
%"struct.boost::exception_detail::clone_impl<boost::exception_detail::error_info_injector<boost::gregorian::bad_year> >::clone_tag" = type { i8 }
%"struct.boost::date_time::year_month_day_base" = type { %"class.boost::gregorian::greg_year", %"class.boost::gregorian::greg_month", %"class.boost::gregorian::greg_day" }
%"struct.boost::less_than_comparable.38" = type { i8 }
%"class.boost::date_time::int_adapter.54" = type { i32 }
%struct.tm = type { i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i8* }
%struct.timeval = type { i32, i32 }
%struct.timezone = type { i32, i32 }
%"struct.boost::exception_detail::error_info_injector.56" = type { %"class.std::runtime_error", %"class.boost::exception" }
%"class.boost::exception_detail::clone_impl.55" = type { %"struct.boost::exception_detail::error_info_injector.56", %"class.boost::exception_detail::clone_base" }
%"struct.boost::exception_detail::clone_impl<boost::exception_detail::error_info_injector<std::runtime_error> >::clone_tag" = type { i8 }

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
@state = global i32 0, align 4
@mutex = global %"class.boost::mutex" zeroinitializer, align 4
@cond = global %"class.boost::condition_variable_any" zeroinitializer, align 4
@.str15 = private unnamed_addr constant [9 x i8] c"PLAYER-A\00", align 1
@.str16 = private unnamed_addr constant [9 x i8] c"PLAYER-B\00", align 1
@.str17 = private unnamed_addr constant [11 x i8] c"bad player\00", align 1
@_ZTIPKc = external constant i8*
@_ZSt4cout = external global %"class.std::basic_ostream"
@.str18 = private unnamed_addr constant [8 x i8] c": Play.\00", align 1
@.str19 = private unnamed_addr constant [4 x i8] c"---\00", align 1
@.str20 = private unnamed_addr constant [19 x i8] c": Spurious wakeup!\00", align 1
@.str21 = private unnamed_addr constant [8 x i8] c": Gone.\00", align 1
@.str22 = private unnamed_addr constant [15 x i8] c"---Noise ON...\00", align 1
@.str23 = private unnamed_addr constant [16 x i8] c"---Noise OFF...\00", align 1
@.str24 = private unnamed_addr constant [10 x i8] c"GAME OVER\00", align 1
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
@_ZTVN5boost6detail11thread_dataI14thread_adapterEE = linkonce_odr unnamed_addr constant [5 x i8*] [i8* null, i8* bitcast ({ i8*, i8*, i8* }* @_ZTIN5boost6detail11thread_dataI14thread_adapterEE to i8*), i8* bitcast (void (%"class.boost::detail::thread_data"*)* @_ZN5boost6detail11thread_dataI14thread_adapterED1Ev to i8*), i8* bitcast (void (%"class.boost::detail::thread_data"*)* @_ZN5boost6detail11thread_dataI14thread_adapterED0Ev to i8*), i8* bitcast (void (%"class.boost::detail::thread_data"*)* @_ZN5boost6detail11thread_dataI14thread_adapterE3runEv to i8*)]
@_ZTSN5boost6detail11thread_dataI14thread_adapterEE = linkonce_odr constant [47 x i8] c"N5boost6detail11thread_dataI14thread_adapterEE\00"
@_ZTIN5boost6detail16thread_data_baseE = external constant i8*
@_ZTIN5boost6detail11thread_dataI14thread_adapterEE = linkonce_odr unnamed_addr constant { i8*, i8*, i8* } { i8* bitcast (i8** getelementptr inbounds (i8** @_ZTVN10__cxxabiv120__si_class_type_infoE, i32 2) to i8*), i8* getelementptr inbounds ([47 x i8]* @_ZTSN5boost6detail11thread_dataI14thread_adapterEE, i32 0, i32 0), i8* bitcast (i8** @_ZTIN5boost6detail16thread_data_baseE to i8*) }
@_ZTVN5boost6detail16thread_data_baseE = external unnamed_addr constant [5 x i8*]
@.str25 = private unnamed_addr constant [40 x i8] c"!pthread_mutex_destroy(&internal_mutex)\00", align 1
@.str26 = private unnamed_addr constant [74 x i8] c"/home/thomas/boost_1_52_0/boost/thread/pthread/condition_variable_fwd.hpp\00", align 1
@__PRETTY_FUNCTION__._ZN5boost18condition_variableD2Ev = private unnamed_addr constant [49 x i8] c"boost::condition_variable::~condition_variable()\00", align 1
@.str27 = private unnamed_addr constant [5 x i8] c"!ret\00", align 1
@.str28 = private unnamed_addr constant [68 x i8] c"boost:: condition_variable constructor failed in pthread_mutex_init\00", align 1
@__PRETTY_FUNCTION__._ZN5boost18condition_variableC2Ev = private unnamed_addr constant [48 x i8] c"boost::condition_variable::condition_variable()\00", align 1
@.str29 = private unnamed_addr constant [67 x i8] c"boost:: condition_variable constructor failed in pthread_cond_init\00", align 1
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
@_ZTVN5boost6detail17sp_counted_impl_pINS0_11thread_dataI14thread_adapterEEEE = linkonce_odr unnamed_addr constant [7 x i8*] [i8* null, i8* bitcast ({ i8*, i8*, i8* }* @_ZTIN5boost6detail17sp_counted_impl_pINS0_11thread_dataI14thread_adapterEEEE to i8*), i8* bitcast (void (%"class.boost::detail::sp_counted_impl_p"*)* @_ZN5boost6detail17sp_counted_impl_pINS0_11thread_dataI14thread_adapterEEED1Ev to i8*), i8* bitcast (void (%"class.boost::detail::sp_counted_impl_p"*)* @_ZN5boost6detail17sp_counted_impl_pINS0_11thread_dataI14thread_adapterEEED0Ev to i8*), i8* bitcast (void (%"class.boost::detail::sp_counted_impl_p"*)* @_ZN5boost6detail17sp_counted_impl_pINS0_11thread_dataI14thread_adapterEEE7disposeEv to i8*), i8* bitcast (void (%"class.boost::detail::sp_counted_base"*)* @_ZN5boost6detail15sp_counted_base7destroyEv to i8*), i8* bitcast (i8* (%"class.boost::detail::sp_counted_impl_p"*, %"class.std::type_info"*)* @_ZN5boost6detail17sp_counted_impl_pINS0_11thread_dataI14thread_adapterEEE11get_deleterERKSt9type_info to i8*)]
@_ZTSN5boost6detail17sp_counted_impl_pINS0_11thread_dataI14thread_adapterEEEE = linkonce_odr constant [73 x i8] c"N5boost6detail17sp_counted_impl_pINS0_11thread_dataI14thread_adapterEEEE\00"
@_ZTSN5boost6detail15sp_counted_baseE = linkonce_odr constant [33 x i8] c"N5boost6detail15sp_counted_baseE\00"
@_ZTIN5boost6detail15sp_counted_baseE = linkonce_odr unnamed_addr constant { i8*, i8* } { i8* bitcast (i8** getelementptr inbounds (i8** @_ZTVN10__cxxabiv117__class_type_infoE, i32 2) to i8*), i8* getelementptr inbounds ([33 x i8]* @_ZTSN5boost6detail15sp_counted_baseE, i32 0, i32 0) }
@_ZTIN5boost6detail17sp_counted_impl_pINS0_11thread_dataI14thread_adapterEEEE = linkonce_odr unnamed_addr constant { i8*, i8*, i8* } { i8* bitcast (i8** getelementptr inbounds (i8** @_ZTVN10__cxxabiv120__si_class_type_infoE, i32 2) to i8*), i8* getelementptr inbounds ([73 x i8]* @_ZTSN5boost6detail17sp_counted_impl_pINS0_11thread_dataI14thread_adapterEEEE, i32 0, i32 0), i8* bitcast ({ i8*, i8* }* @_ZTIN5boost6detail15sp_counted_baseE to i8*) }
@_ZTVN5boost6detail15sp_counted_baseE = linkonce_odr unnamed_addr constant [7 x i8*] [i8* null, i8* bitcast ({ i8*, i8* }* @_ZTIN5boost6detail15sp_counted_baseE to i8*), i8* bitcast (void (%"class.boost::detail::sp_counted_base"*)* @_ZN5boost6detail15sp_counted_baseD1Ev to i8*), i8* bitcast (void (%"class.boost::detail::sp_counted_base"*)* @_ZN5boost6detail15sp_counted_baseD0Ev to i8*), i8* bitcast (void ()* @__cxa_pure_virtual to i8*), i8* bitcast (void (%"class.boost::detail::sp_counted_base"*)* @_ZN5boost6detail15sp_counted_base7destroyEv to i8*), i8* bitcast (void ()* @__cxa_pure_virtual to i8*)]
@.str30 = private unnamed_addr constant [51 x i8] c"condition_variable_any failed in pthread_cond_wait\00", align 1
@_ZTVN5boost15condition_errorE = linkonce_odr unnamed_addr constant [5 x i8*] [i8* null, i8* bitcast ({ i8*, i8*, i8* }* @_ZTIN5boost15condition_errorE to i8*), i8* bitcast (void (%"class.boost::condition_error"*)* @_ZN5boost15condition_errorD1Ev to i8*), i8* bitcast (void (%"class.boost::condition_error"*)* @_ZN5boost15condition_errorD0Ev to i8*), i8* bitcast (i8* (%"class.boost::system::system_error"*)* @_ZNK5boost6system12system_error4whatEv to i8*)]
@_ZTSN5boost15condition_errorE = linkonce_odr constant [26 x i8] c"N5boost15condition_errorE\00"
@_ZTIN5boost15condition_errorE = linkonce_odr unnamed_addr constant { i8*, i8*, i8* } { i8* bitcast (i8** getelementptr inbounds (i8** @_ZTVN10__cxxabiv120__si_class_type_infoE, i32 2) to i8*), i8* getelementptr inbounds ([26 x i8]* @_ZTSN5boost15condition_errorE, i32 0, i32 0), i8* bitcast ({ i8*, i8*, i8* }* @_ZTIN5boost6system12system_errorE to i8*) }
@_ZTSN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_15condition_errorEEEEE = linkonce_odr constant [90 x i8] c"N5boost16exception_detail10clone_implINS0_19error_info_injectorINS_15condition_errorEEEEE\00"
@_ZTSN5boost16exception_detail19error_info_injectorINS_15condition_errorEEE = linkonce_odr constant [71 x i8] c"N5boost16exception_detail19error_info_injectorINS_15condition_errorEEE\00"
@_ZTIN5boost16exception_detail19error_info_injectorINS_15condition_errorEEE = linkonce_odr unnamed_addr constant { i8*, i8*, i32, i32, i8*, i32, i8*, i32 } { i8* bitcast (i8** getelementptr inbounds (i8** @_ZTVN10__cxxabiv121__vmi_class_type_infoE, i32 2) to i8*), i8* getelementptr inbounds ([71 x i8]* @_ZTSN5boost16exception_detail19error_info_injectorINS_15condition_errorEEE, i32 0, i32 0), i32 0, i32 2, i8* bitcast ({ i8*, i8*, i8* }* @_ZTIN5boost15condition_errorE to i8*), i32 2, i8* bitcast ({ i8*, i8* }* @_ZTIN5boost9exceptionE to i8*), i32 5122 }
@_ZTIN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_15condition_errorEEEEE = linkonce_odr unnamed_addr constant { i8*, i8*, i32, i32, i8*, i32, i8*, i32 } { i8* bitcast (i8** getelementptr inbounds (i8** @_ZTVN10__cxxabiv121__vmi_class_type_infoE, i32 2) to i8*), i8* getelementptr inbounds ([90 x i8]* @_ZTSN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_15condition_errorEEEEE, i32 0, i32 0), i32 0, i32 2, i8* bitcast ({ i8*, i8*, i32, i32, i8*, i32, i8*, i32 }* @_ZTIN5boost16exception_detail19error_info_injectorINS_15condition_errorEEE to i8*), i32 2, i8* bitcast ({ i8*, i8* }* @_ZTIN5boost16exception_detail10clone_baseE to i8*), i32 -3069 }
@_ZTVN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_15condition_errorEEEEE = linkonce_odr unnamed_addr constant [21 x i8*] [i8* inttoptr (i32 40 to i8*), i8* null, i8* bitcast ({ i8*, i8*, i32, i32, i8*, i32, i8*, i32 }* @_ZTIN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_15condition_errorEEEEE to i8*), i8* bitcast (void (%"class.boost::exception_detail::clone_impl.27"*)* @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_15condition_errorEEEED1Ev to i8*), i8* bitcast (void (%"class.boost::exception_detail::clone_impl.27"*)* @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_15condition_errorEEEED0Ev to i8*), i8* bitcast (i8* (%"class.boost::system::system_error"*)* @_ZNK5boost6system12system_error4whatEv to i8*), i8* bitcast (%"class.boost::exception_detail::clone_base"* (%"class.boost::exception_detail::clone_impl.27"*)* @_ZNK5boost16exception_detail10clone_implINS0_19error_info_injectorINS_15condition_errorEEEE5cloneEv to i8*), i8* bitcast (void (%"class.boost::exception_detail::clone_impl.27"*)* @_ZNK5boost16exception_detail10clone_implINS0_19error_info_injectorINS_15condition_errorEEEE7rethrowEv to i8*), i8* inttoptr (i32 -20 to i8*), i8* bitcast ({ i8*, i8*, i32, i32, i8*, i32, i8*, i32 }* @_ZTIN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_15condition_errorEEEEE to i8*), i8* bitcast (void (%"class.boost::exception_detail::clone_impl.27"*)* @_ZThn20_N5boost16exception_detail10clone_implINS0_19error_info_injectorINS_15condition_errorEEEED1Ev to i8*), i8* bitcast (void (%"class.boost::exception_detail::clone_impl.27"*)* @_ZThn20_N5boost16exception_detail10clone_implINS0_19error_info_injectorINS_15condition_errorEEEED0Ev to i8*), i8* inttoptr (i32 -40 to i8*), i8* inttoptr (i32 -40 to i8*), i8* inttoptr (i32 -40 to i8*), i8* inttoptr (i32 -40 to i8*), i8* bitcast ({ i8*, i8*, i32, i32, i8*, i32, i8*, i32 }* @_ZTIN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_15condition_errorEEEEE to i8*), i8* bitcast (%"class.boost::exception_detail::clone_base"* (%"class.boost::exception_detail::clone_impl.27"*)* @_ZTv0_n12_NK5boost16exception_detail10clone_implINS0_19error_info_injectorINS_15condition_errorEEEE5cloneEv to i8*), i8* bitcast (void (%"class.boost::exception_detail::clone_impl.27"*)* @_ZTv0_n16_NK5boost16exception_detail10clone_implINS0_19error_info_injectorINS_15condition_errorEEEE7rethrowEv to i8*), i8* bitcast (void (%"class.boost::exception_detail::clone_impl.27"*)* @_ZTv0_n20_N5boost16exception_detail10clone_implINS0_19error_info_injectorINS_15condition_errorEEEED1Ev to i8*), i8* bitcast (void (%"class.boost::exception_detail::clone_impl.27"*)* @_ZTv0_n20_N5boost16exception_detail10clone_implINS0_19error_info_injectorINS_15condition_errorEEEED0Ev to i8*)]
@_ZTTN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_15condition_errorEEEEE = linkonce_odr unnamed_addr constant [2 x i8*] [i8* bitcast (i8** getelementptr inbounds ([21 x i8*]* @_ZTVN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_15condition_errorEEEEE, i64 0, i64 3) to i8*), i8* bitcast (i8** getelementptr inbounds ([21 x i8*]* @_ZTVN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_15condition_errorEEEEE, i64 0, i64 17) to i8*)]
@_ZTVN5boost16exception_detail19error_info_injectorINS_15condition_errorEEE = linkonce_odr unnamed_addr constant [9 x i8*] [i8* null, i8* bitcast ({ i8*, i8*, i32, i32, i8*, i32, i8*, i32 }* @_ZTIN5boost16exception_detail19error_info_injectorINS_15condition_errorEEE to i8*), i8* bitcast (void (%"struct.boost::exception_detail::error_info_injector.28"*)* @_ZN5boost16exception_detail19error_info_injectorINS_15condition_errorEED1Ev to i8*), i8* bitcast (void (%"struct.boost::exception_detail::error_info_injector.28"*)* @_ZN5boost16exception_detail19error_info_injectorINS_15condition_errorEED0Ev to i8*), i8* bitcast (i8* (%"class.boost::system::system_error"*)* @_ZNK5boost6system12system_error4whatEv to i8*), i8* inttoptr (i32 -20 to i8*), i8* bitcast ({ i8*, i8*, i32, i32, i8*, i32, i8*, i32 }* @_ZTIN5boost16exception_detail19error_info_injectorINS_15condition_errorEEE to i8*), i8* bitcast (void (%"struct.boost::exception_detail::error_info_injector.28"*)* @_ZThn20_N5boost16exception_detail19error_info_injectorINS_15condition_errorEED1Ev to i8*), i8* bitcast (void (%"struct.boost::exception_detail::error_info_injector.28"*)* @_ZThn20_N5boost16exception_detail19error_info_injectorINS_15condition_errorEED0Ev to i8*)]
@.str31 = private unnamed_addr constant [31 x i8] c"boost unique_lock has no mutex\00", align 1
@.str32 = private unnamed_addr constant [41 x i8] c"boost unique_lock owns already the mutex\00", align 1
@.str33 = private unnamed_addr constant [47 x i8] c"boost: mutex lock failed in pthread_mutex_lock\00", align 1
@_ZTVN5boost10lock_errorE = linkonce_odr unnamed_addr constant [5 x i8*] [i8* null, i8* bitcast ({ i8*, i8*, i8* }* @_ZTIN5boost10lock_errorE to i8*), i8* bitcast (void (%"class.boost::lock_error"*)* @_ZN5boost10lock_errorD1Ev to i8*), i8* bitcast (void (%"class.boost::lock_error"*)* @_ZN5boost10lock_errorD0Ev to i8*), i8* bitcast (i8* (%"class.boost::system::system_error"*)* @_ZNK5boost6system12system_error4whatEv to i8*)]
@_ZTSN5boost10lock_errorE = linkonce_odr constant [21 x i8] c"N5boost10lock_errorE\00"
@_ZTIN5boost10lock_errorE = linkonce_odr unnamed_addr constant { i8*, i8*, i8* } { i8* bitcast (i8** getelementptr inbounds (i8** @_ZTVN10__cxxabiv120__si_class_type_infoE, i32 2) to i8*), i8* getelementptr inbounds ([21 x i8]* @_ZTSN5boost10lock_errorE, i32 0, i32 0), i8* bitcast ({ i8*, i8*, i8* }* @_ZTIN5boost16thread_exceptionE to i8*) }
@_ZTSN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_10lock_errorEEEEE = linkonce_odr constant [85 x i8] c"N5boost16exception_detail10clone_implINS0_19error_info_injectorINS_10lock_errorEEEEE\00"
@_ZTSN5boost16exception_detail19error_info_injectorINS_10lock_errorEEE = linkonce_odr constant [66 x i8] c"N5boost16exception_detail19error_info_injectorINS_10lock_errorEEE\00"
@_ZTIN5boost16exception_detail19error_info_injectorINS_10lock_errorEEE = linkonce_odr unnamed_addr constant { i8*, i8*, i32, i32, i8*, i32, i8*, i32 } { i8* bitcast (i8** getelementptr inbounds (i8** @_ZTVN10__cxxabiv121__vmi_class_type_infoE, i32 2) to i8*), i8* getelementptr inbounds ([66 x i8]* @_ZTSN5boost16exception_detail19error_info_injectorINS_10lock_errorEEE, i32 0, i32 0), i32 0, i32 2, i8* bitcast ({ i8*, i8*, i8* }* @_ZTIN5boost10lock_errorE to i8*), i32 2, i8* bitcast ({ i8*, i8* }* @_ZTIN5boost9exceptionE to i8*), i32 5122 }
@_ZTIN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_10lock_errorEEEEE = linkonce_odr unnamed_addr constant { i8*, i8*, i32, i32, i8*, i32, i8*, i32 } { i8* bitcast (i8** getelementptr inbounds (i8** @_ZTVN10__cxxabiv121__vmi_class_type_infoE, i32 2) to i8*), i8* getelementptr inbounds ([85 x i8]* @_ZTSN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_10lock_errorEEEEE, i32 0, i32 0), i32 0, i32 2, i8* bitcast ({ i8*, i8*, i32, i32, i8*, i32, i8*, i32 }* @_ZTIN5boost16exception_detail19error_info_injectorINS_10lock_errorEEE to i8*), i32 2, i8* bitcast ({ i8*, i8* }* @_ZTIN5boost16exception_detail10clone_baseE to i8*), i32 -3069 }
@_ZTVN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_10lock_errorEEEEE = linkonce_odr unnamed_addr constant [21 x i8*] [i8* inttoptr (i32 40 to i8*), i8* null, i8* bitcast ({ i8*, i8*, i32, i32, i8*, i32, i8*, i32 }* @_ZTIN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_10lock_errorEEEEE to i8*), i8* bitcast (void (%"class.boost::exception_detail::clone_impl.30"*)* @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_10lock_errorEEEED1Ev to i8*), i8* bitcast (void (%"class.boost::exception_detail::clone_impl.30"*)* @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_10lock_errorEEEED0Ev to i8*), i8* bitcast (i8* (%"class.boost::system::system_error"*)* @_ZNK5boost6system12system_error4whatEv to i8*), i8* bitcast (%"class.boost::exception_detail::clone_base"* (%"class.boost::exception_detail::clone_impl.30"*)* @_ZNK5boost16exception_detail10clone_implINS0_19error_info_injectorINS_10lock_errorEEEE5cloneEv to i8*), i8* bitcast (void (%"class.boost::exception_detail::clone_impl.30"*)* @_ZNK5boost16exception_detail10clone_implINS0_19error_info_injectorINS_10lock_errorEEEE7rethrowEv to i8*), i8* inttoptr (i32 -20 to i8*), i8* bitcast ({ i8*, i8*, i32, i32, i8*, i32, i8*, i32 }* @_ZTIN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_10lock_errorEEEEE to i8*), i8* bitcast (void (%"class.boost::exception_detail::clone_impl.30"*)* @_ZThn20_N5boost16exception_detail10clone_implINS0_19error_info_injectorINS_10lock_errorEEEED1Ev to i8*), i8* bitcast (void (%"class.boost::exception_detail::clone_impl.30"*)* @_ZThn20_N5boost16exception_detail10clone_implINS0_19error_info_injectorINS_10lock_errorEEEED0Ev to i8*), i8* inttoptr (i32 -40 to i8*), i8* inttoptr (i32 -40 to i8*), i8* inttoptr (i32 -40 to i8*), i8* inttoptr (i32 -40 to i8*), i8* bitcast ({ i8*, i8*, i32, i32, i8*, i32, i8*, i32 }* @_ZTIN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_10lock_errorEEEEE to i8*), i8* bitcast (%"class.boost::exception_detail::clone_base"* (%"class.boost::exception_detail::clone_impl.30"*)* @_ZTv0_n12_NK5boost16exception_detail10clone_implINS0_19error_info_injectorINS_10lock_errorEEEE5cloneEv to i8*), i8* bitcast (void (%"class.boost::exception_detail::clone_impl.30"*)* @_ZTv0_n16_NK5boost16exception_detail10clone_implINS0_19error_info_injectorINS_10lock_errorEEEE7rethrowEv to i8*), i8* bitcast (void (%"class.boost::exception_detail::clone_impl.30"*)* @_ZTv0_n20_N5boost16exception_detail10clone_implINS0_19error_info_injectorINS_10lock_errorEEEED1Ev to i8*), i8* bitcast (void (%"class.boost::exception_detail::clone_impl.30"*)* @_ZTv0_n20_N5boost16exception_detail10clone_implINS0_19error_info_injectorINS_10lock_errorEEEED0Ev to i8*)]
@_ZTTN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_10lock_errorEEEEE = linkonce_odr unnamed_addr constant [2 x i8*] [i8* bitcast (i8** getelementptr inbounds ([21 x i8*]* @_ZTVN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_10lock_errorEEEEE, i64 0, i64 3) to i8*), i8* bitcast (i8** getelementptr inbounds ([21 x i8*]* @_ZTVN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_10lock_errorEEEEE, i64 0, i64 17) to i8*)]
@_ZTVN5boost16exception_detail19error_info_injectorINS_10lock_errorEEE = linkonce_odr unnamed_addr constant [9 x i8*] [i8* null, i8* bitcast ({ i8*, i8*, i32, i32, i8*, i32, i8*, i32 }* @_ZTIN5boost16exception_detail19error_info_injectorINS_10lock_errorEEE to i8*), i8* bitcast (void (%"struct.boost::exception_detail::error_info_injector.31"*)* @_ZN5boost16exception_detail19error_info_injectorINS_10lock_errorEED1Ev to i8*), i8* bitcast (void (%"struct.boost::exception_detail::error_info_injector.31"*)* @_ZN5boost16exception_detail19error_info_injectorINS_10lock_errorEED0Ev to i8*), i8* bitcast (i8* (%"class.boost::system::system_error"*)* @_ZNK5boost6system12system_error4whatEv to i8*), i8* inttoptr (i32 -20 to i8*), i8* bitcast ({ i8*, i8*, i32, i32, i8*, i32, i8*, i32 }* @_ZTIN5boost16exception_detail19error_info_injectorINS_10lock_errorEEE to i8*), i8* bitcast (void (%"struct.boost::exception_detail::error_info_injector.31"*)* @_ZThn20_N5boost16exception_detail19error_info_injectorINS_10lock_errorEED1Ev to i8*), i8* bitcast (void (%"struct.boost::exception_detail::error_info_injector.31"*)* @_ZThn20_N5boost16exception_detail19error_info_injectorINS_10lock_errorEED0Ev to i8*)]
@.str34 = private unnamed_addr constant [25 x i8] c"!pthread_mutex_unlock(m)\00", align 1
@.str35 = private unnamed_addr constant [63 x i8] c"/home/thomas/boost_1_52_0/boost/thread/pthread/thread_data.hpp\00", align 1
@__PRETTY_FUNCTION__._ZN5boost6detail20interruption_checkerD2Ev = private unnamed_addr constant [61 x i8] c"boost::detail::interruption_checker::~interruption_checker()\00", align 1
@.str36 = private unnamed_addr constant [57 x i8] c"/home/thomas/boost_1_52_0/boost/thread/pthread/mutex.hpp\00", align 1
@__PRETTY_FUNCTION__._ZN5boost5mutex6unlockEv = private unnamed_addr constant [28 x i8] c"void boost::mutex::unlock()\00", align 1
@.str37 = private unnamed_addr constant [40 x i8] c"boost unique_lock doesn't own the mutex\00", align 1
@.str38 = private unnamed_addr constant [23 x i8] c"!pthread_mutex_lock(m)\00", align 1
@__PRETTY_FUNCTION__._ZN5boost6detail20interruption_checkerC2EP15pthread_mutex_tP14pthread_cond_t = private unnamed_addr constant [95 x i8] c"boost::detail::interruption_checker::interruption_checker(pthread_mutex_t *, pthread_cond_t *)\00", align 1
@_ZTSN5boost18thread_interruptedE = linkonce_odr constant [29 x i8] c"N5boost18thread_interruptedE\00"
@_ZTIN5boost18thread_interruptedE = linkonce_odr unnamed_addr constant { i8*, i8* } { i8* bitcast (i8** getelementptr inbounds (i8** @_ZTVN10__cxxabiv117__class_type_infoE, i32 2) to i8*), i8* getelementptr inbounds ([29 x i8]* @_ZTSN5boost18thread_interruptedE, i32 0, i32 0) }
@.str39 = private unnamed_addr constant [41 x i8] c"Day of month value is out of range 1..31\00", align 1
@_ZTVN5boost9gregorian16bad_day_of_monthE = linkonce_odr unnamed_addr constant [5 x i8*] [i8* null, i8* bitcast ({ i8*, i8*, i8* }* @_ZTIN5boost9gregorian16bad_day_of_monthE to i8*), i8* bitcast (void (%"struct.boost::gregorian::bad_day_of_month"*)* @_ZN5boost9gregorian16bad_day_of_monthD1Ev to i8*), i8* bitcast (void (%"struct.boost::gregorian::bad_day_of_month"*)* @_ZN5boost9gregorian16bad_day_of_monthD0Ev to i8*), i8* bitcast (i8* (%"class.std::logic_error"*)* @_ZNKSt11logic_error4whatEv to i8*)]
@_ZTSN5boost9gregorian16bad_day_of_monthE = linkonce_odr constant [37 x i8] c"N5boost9gregorian16bad_day_of_monthE\00"
@_ZTISt12out_of_range = external constant i8*
@_ZTIN5boost9gregorian16bad_day_of_monthE = linkonce_odr unnamed_addr constant { i8*, i8*, i8* } { i8* bitcast (i8** getelementptr inbounds (i8** @_ZTVN10__cxxabiv120__si_class_type_infoE, i32 2) to i8*), i8* getelementptr inbounds ([37 x i8]* @_ZTSN5boost9gregorian16bad_day_of_monthE, i32 0, i32 0), i8* bitcast (i8** @_ZTISt12out_of_range to i8*) }
@_ZTSN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian16bad_day_of_monthEEEEE = linkonce_odr constant [101 x i8] c"N5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian16bad_day_of_monthEEEEE\00"
@_ZTSN5boost16exception_detail19error_info_injectorINS_9gregorian16bad_day_of_monthEEE = linkonce_odr constant [82 x i8] c"N5boost16exception_detail19error_info_injectorINS_9gregorian16bad_day_of_monthEEE\00"
@_ZTIN5boost16exception_detail19error_info_injectorINS_9gregorian16bad_day_of_monthEEE = linkonce_odr unnamed_addr constant { i8*, i8*, i32, i32, i8*, i32, i8*, i32 } { i8* bitcast (i8** getelementptr inbounds (i8** @_ZTVN10__cxxabiv121__vmi_class_type_infoE, i32 2) to i8*), i8* getelementptr inbounds ([82 x i8]* @_ZTSN5boost16exception_detail19error_info_injectorINS_9gregorian16bad_day_of_monthEEE, i32 0, i32 0), i32 0, i32 2, i8* bitcast ({ i8*, i8*, i8* }* @_ZTIN5boost9gregorian16bad_day_of_monthE to i8*), i32 2, i8* bitcast ({ i8*, i8* }* @_ZTIN5boost9exceptionE to i8*), i32 2050 }
@_ZTIN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian16bad_day_of_monthEEEEE = linkonce_odr unnamed_addr constant { i8*, i8*, i32, i32, i8*, i32, i8*, i32 } { i8* bitcast (i8** getelementptr inbounds (i8** @_ZTVN10__cxxabiv121__vmi_class_type_infoE, i32 2) to i8*), i8* getelementptr inbounds ([101 x i8]* @_ZTSN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian16bad_day_of_monthEEEEE, i32 0, i32 0), i32 0, i32 2, i8* bitcast ({ i8*, i8*, i32, i32, i8*, i32, i8*, i32 }* @_ZTIN5boost16exception_detail19error_info_injectorINS_9gregorian16bad_day_of_monthEEE to i8*), i32 2, i8* bitcast ({ i8*, i8* }* @_ZTIN5boost16exception_detail10clone_baseE to i8*), i32 -3069 }
@_ZTVN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian16bad_day_of_monthEEEEE = linkonce_odr unnamed_addr constant [21 x i8*] [i8* inttoptr (i32 28 to i8*), i8* null, i8* bitcast ({ i8*, i8*, i32, i32, i8*, i32, i8*, i32 }* @_ZTIN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian16bad_day_of_monthEEEEE to i8*), i8* bitcast (void (%"class.boost::exception_detail::clone_impl.45"*)* @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian16bad_day_of_monthEEEED1Ev to i8*), i8* bitcast (void (%"class.boost::exception_detail::clone_impl.45"*)* @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian16bad_day_of_monthEEEED0Ev to i8*), i8* bitcast (i8* (%"class.std::logic_error"*)* @_ZNKSt11logic_error4whatEv to i8*), i8* bitcast (%"class.boost::exception_detail::clone_base"* (%"class.boost::exception_detail::clone_impl.45"*)* @_ZNK5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian16bad_day_of_monthEEEE5cloneEv to i8*), i8* bitcast (void (%"class.boost::exception_detail::clone_impl.45"*)* @_ZNK5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian16bad_day_of_monthEEEE7rethrowEv to i8*), i8* inttoptr (i32 -8 to i8*), i8* bitcast ({ i8*, i8*, i32, i32, i8*, i32, i8*, i32 }* @_ZTIN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian16bad_day_of_monthEEEEE to i8*), i8* bitcast (void (%"class.boost::exception_detail::clone_impl.45"*)* @_ZThn8_N5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian16bad_day_of_monthEEEED1Ev to i8*), i8* bitcast (void (%"class.boost::exception_detail::clone_impl.45"*)* @_ZThn8_N5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian16bad_day_of_monthEEEED0Ev to i8*), i8* inttoptr (i32 -28 to i8*), i8* inttoptr (i32 -28 to i8*), i8* inttoptr (i32 -28 to i8*), i8* inttoptr (i32 -28 to i8*), i8* bitcast ({ i8*, i8*, i32, i32, i8*, i32, i8*, i32 }* @_ZTIN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian16bad_day_of_monthEEEEE to i8*), i8* bitcast (%"class.boost::exception_detail::clone_base"* (%"class.boost::exception_detail::clone_impl.45"*)* @_ZTv0_n12_NK5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian16bad_day_of_monthEEEE5cloneEv to i8*), i8* bitcast (void (%"class.boost::exception_detail::clone_impl.45"*)* @_ZTv0_n16_NK5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian16bad_day_of_monthEEEE7rethrowEv to i8*), i8* bitcast (void (%"class.boost::exception_detail::clone_impl.45"*)* @_ZTv0_n20_N5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian16bad_day_of_monthEEEED1Ev to i8*), i8* bitcast (void (%"class.boost::exception_detail::clone_impl.45"*)* @_ZTv0_n20_N5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian16bad_day_of_monthEEEED0Ev to i8*)]
@_ZTTN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian16bad_day_of_monthEEEEE = linkonce_odr unnamed_addr constant [2 x i8*] [i8* bitcast (i8** getelementptr inbounds ([21 x i8*]* @_ZTVN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian16bad_day_of_monthEEEEE, i64 0, i64 3) to i8*), i8* bitcast (i8** getelementptr inbounds ([21 x i8*]* @_ZTVN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian16bad_day_of_monthEEEEE, i64 0, i64 17) to i8*)]
@_ZTVN5boost16exception_detail19error_info_injectorINS_9gregorian16bad_day_of_monthEEE = linkonce_odr unnamed_addr constant [9 x i8*] [i8* null, i8* bitcast ({ i8*, i8*, i32, i32, i8*, i32, i8*, i32 }* @_ZTIN5boost16exception_detail19error_info_injectorINS_9gregorian16bad_day_of_monthEEE to i8*), i8* bitcast (void (%"struct.boost::exception_detail::error_info_injector.46"*)* @_ZN5boost16exception_detail19error_info_injectorINS_9gregorian16bad_day_of_monthEED1Ev to i8*), i8* bitcast (void (%"struct.boost::exception_detail::error_info_injector.46"*)* @_ZN5boost16exception_detail19error_info_injectorINS_9gregorian16bad_day_of_monthEED0Ev to i8*), i8* bitcast (i8* (%"class.std::logic_error"*)* @_ZNKSt11logic_error4whatEv to i8*), i8* inttoptr (i32 -8 to i8*), i8* bitcast ({ i8*, i8*, i32, i32, i8*, i32, i8*, i32 }* @_ZTIN5boost16exception_detail19error_info_injectorINS_9gregorian16bad_day_of_monthEEE to i8*), i8* bitcast (void (%"struct.boost::exception_detail::error_info_injector.46"*)* @_ZThn8_N5boost16exception_detail19error_info_injectorINS_9gregorian16bad_day_of_monthEED1Ev to i8*), i8* bitcast (void (%"struct.boost::exception_detail::error_info_injector.46"*)* @_ZThn8_N5boost16exception_detail19error_info_injectorINS_9gregorian16bad_day_of_monthEED0Ev to i8*)]
@_ZTVSt12out_of_range = external unnamed_addr constant [5 x i8*]
@_ZTVSt11logic_error = external unnamed_addr constant [5 x i8*]
@.str40 = private unnamed_addr constant [35 x i8] c"Month number is out of range 1..12\00", align 1
@_ZTVN5boost9gregorian9bad_monthE = linkonce_odr unnamed_addr constant [5 x i8*] [i8* null, i8* bitcast ({ i8*, i8*, i8* }* @_ZTIN5boost9gregorian9bad_monthE to i8*), i8* bitcast (void (%"struct.boost::gregorian::bad_month"*)* @_ZN5boost9gregorian9bad_monthD1Ev to i8*), i8* bitcast (void (%"struct.boost::gregorian::bad_month"*)* @_ZN5boost9gregorian9bad_monthD0Ev to i8*), i8* bitcast (i8* (%"class.std::logic_error"*)* @_ZNKSt11logic_error4whatEv to i8*)]
@_ZTSN5boost9gregorian9bad_monthE = linkonce_odr constant [29 x i8] c"N5boost9gregorian9bad_monthE\00"
@_ZTIN5boost9gregorian9bad_monthE = linkonce_odr unnamed_addr constant { i8*, i8*, i8* } { i8* bitcast (i8** getelementptr inbounds (i8** @_ZTVN10__cxxabiv120__si_class_type_infoE, i32 2) to i8*), i8* getelementptr inbounds ([29 x i8]* @_ZTSN5boost9gregorian9bad_monthE, i32 0, i32 0), i8* bitcast (i8** @_ZTISt12out_of_range to i8*) }
@_ZTSN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian9bad_monthEEEEE = linkonce_odr constant [93 x i8] c"N5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian9bad_monthEEEEE\00"
@_ZTSN5boost16exception_detail19error_info_injectorINS_9gregorian9bad_monthEEE = linkonce_odr constant [74 x i8] c"N5boost16exception_detail19error_info_injectorINS_9gregorian9bad_monthEEE\00"
@_ZTIN5boost16exception_detail19error_info_injectorINS_9gregorian9bad_monthEEE = linkonce_odr unnamed_addr constant { i8*, i8*, i32, i32, i8*, i32, i8*, i32 } { i8* bitcast (i8** getelementptr inbounds (i8** @_ZTVN10__cxxabiv121__vmi_class_type_infoE, i32 2) to i8*), i8* getelementptr inbounds ([74 x i8]* @_ZTSN5boost16exception_detail19error_info_injectorINS_9gregorian9bad_monthEEE, i32 0, i32 0), i32 0, i32 2, i8* bitcast ({ i8*, i8*, i8* }* @_ZTIN5boost9gregorian9bad_monthE to i8*), i32 2, i8* bitcast ({ i8*, i8* }* @_ZTIN5boost9exceptionE to i8*), i32 2050 }
@_ZTIN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian9bad_monthEEEEE = linkonce_odr unnamed_addr constant { i8*, i8*, i32, i32, i8*, i32, i8*, i32 } { i8* bitcast (i8** getelementptr inbounds (i8** @_ZTVN10__cxxabiv121__vmi_class_type_infoE, i32 2) to i8*), i8* getelementptr inbounds ([93 x i8]* @_ZTSN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian9bad_monthEEEEE, i32 0, i32 0), i32 0, i32 2, i8* bitcast ({ i8*, i8*, i32, i32, i8*, i32, i8*, i32 }* @_ZTIN5boost16exception_detail19error_info_injectorINS_9gregorian9bad_monthEEE to i8*), i32 2, i8* bitcast ({ i8*, i8* }* @_ZTIN5boost16exception_detail10clone_baseE to i8*), i32 -3069 }
@_ZTVN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian9bad_monthEEEEE = linkonce_odr unnamed_addr constant [21 x i8*] [i8* inttoptr (i32 28 to i8*), i8* null, i8* bitcast ({ i8*, i8*, i32, i32, i8*, i32, i8*, i32 }* @_ZTIN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian9bad_monthEEEEE to i8*), i8* bitcast (void (%"class.boost::exception_detail::clone_impl.48"*)* @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian9bad_monthEEEED1Ev to i8*), i8* bitcast (void (%"class.boost::exception_detail::clone_impl.48"*)* @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian9bad_monthEEEED0Ev to i8*), i8* bitcast (i8* (%"class.std::logic_error"*)* @_ZNKSt11logic_error4whatEv to i8*), i8* bitcast (%"class.boost::exception_detail::clone_base"* (%"class.boost::exception_detail::clone_impl.48"*)* @_ZNK5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian9bad_monthEEEE5cloneEv to i8*), i8* bitcast (void (%"class.boost::exception_detail::clone_impl.48"*)* @_ZNK5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian9bad_monthEEEE7rethrowEv to i8*), i8* inttoptr (i32 -8 to i8*), i8* bitcast ({ i8*, i8*, i32, i32, i8*, i32, i8*, i32 }* @_ZTIN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian9bad_monthEEEEE to i8*), i8* bitcast (void (%"class.boost::exception_detail::clone_impl.48"*)* @_ZThn8_N5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian9bad_monthEEEED1Ev to i8*), i8* bitcast (void (%"class.boost::exception_detail::clone_impl.48"*)* @_ZThn8_N5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian9bad_monthEEEED0Ev to i8*), i8* inttoptr (i32 -28 to i8*), i8* inttoptr (i32 -28 to i8*), i8* inttoptr (i32 -28 to i8*), i8* inttoptr (i32 -28 to i8*), i8* bitcast ({ i8*, i8*, i32, i32, i8*, i32, i8*, i32 }* @_ZTIN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian9bad_monthEEEEE to i8*), i8* bitcast (%"class.boost::exception_detail::clone_base"* (%"class.boost::exception_detail::clone_impl.48"*)* @_ZTv0_n12_NK5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian9bad_monthEEEE5cloneEv to i8*), i8* bitcast (void (%"class.boost::exception_detail::clone_impl.48"*)* @_ZTv0_n16_NK5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian9bad_monthEEEE7rethrowEv to i8*), i8* bitcast (void (%"class.boost::exception_detail::clone_impl.48"*)* @_ZTv0_n20_N5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian9bad_monthEEEED1Ev to i8*), i8* bitcast (void (%"class.boost::exception_detail::clone_impl.48"*)* @_ZTv0_n20_N5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian9bad_monthEEEED0Ev to i8*)]
@_ZTTN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian9bad_monthEEEEE = linkonce_odr unnamed_addr constant [2 x i8*] [i8* bitcast (i8** getelementptr inbounds ([21 x i8*]* @_ZTVN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian9bad_monthEEEEE, i64 0, i64 3) to i8*), i8* bitcast (i8** getelementptr inbounds ([21 x i8*]* @_ZTVN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian9bad_monthEEEEE, i64 0, i64 17) to i8*)]
@_ZTVN5boost16exception_detail19error_info_injectorINS_9gregorian9bad_monthEEE = linkonce_odr unnamed_addr constant [9 x i8*] [i8* null, i8* bitcast ({ i8*, i8*, i32, i32, i8*, i32, i8*, i32 }* @_ZTIN5boost16exception_detail19error_info_injectorINS_9gregorian9bad_monthEEE to i8*), i8* bitcast (void (%"struct.boost::exception_detail::error_info_injector.49"*)* @_ZN5boost16exception_detail19error_info_injectorINS_9gregorian9bad_monthEED1Ev to i8*), i8* bitcast (void (%"struct.boost::exception_detail::error_info_injector.49"*)* @_ZN5boost16exception_detail19error_info_injectorINS_9gregorian9bad_monthEED0Ev to i8*), i8* bitcast (i8* (%"class.std::logic_error"*)* @_ZNKSt11logic_error4whatEv to i8*), i8* inttoptr (i32 -8 to i8*), i8* bitcast ({ i8*, i8*, i32, i32, i8*, i32, i8*, i32 }* @_ZTIN5boost16exception_detail19error_info_injectorINS_9gregorian9bad_monthEEE to i8*), i8* bitcast (void (%"struct.boost::exception_detail::error_info_injector.49"*)* @_ZThn8_N5boost16exception_detail19error_info_injectorINS_9gregorian9bad_monthEED1Ev to i8*), i8* bitcast (void (%"struct.boost::exception_detail::error_info_injector.49"*)* @_ZThn8_N5boost16exception_detail19error_info_injectorINS_9gregorian9bad_monthEED0Ev to i8*)]
@.str41 = private unnamed_addr constant [40 x i8] c"Year is out of valid range: 1400..10000\00", align 1
@_ZTVN5boost9gregorian8bad_yearE = linkonce_odr unnamed_addr constant [5 x i8*] [i8* null, i8* bitcast ({ i8*, i8*, i8* }* @_ZTIN5boost9gregorian8bad_yearE to i8*), i8* bitcast (void (%"struct.boost::gregorian::bad_year"*)* @_ZN5boost9gregorian8bad_yearD1Ev to i8*), i8* bitcast (void (%"struct.boost::gregorian::bad_year"*)* @_ZN5boost9gregorian8bad_yearD0Ev to i8*), i8* bitcast (i8* (%"class.std::logic_error"*)* @_ZNKSt11logic_error4whatEv to i8*)]
@_ZTSN5boost9gregorian8bad_yearE = linkonce_odr constant [28 x i8] c"N5boost9gregorian8bad_yearE\00"
@_ZTIN5boost9gregorian8bad_yearE = linkonce_odr unnamed_addr constant { i8*, i8*, i8* } { i8* bitcast (i8** getelementptr inbounds (i8** @_ZTVN10__cxxabiv120__si_class_type_infoE, i32 2) to i8*), i8* getelementptr inbounds ([28 x i8]* @_ZTSN5boost9gregorian8bad_yearE, i32 0, i32 0), i8* bitcast (i8** @_ZTISt12out_of_range to i8*) }
@_ZTSN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian8bad_yearEEEEE = linkonce_odr constant [92 x i8] c"N5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian8bad_yearEEEEE\00"
@_ZTSN5boost16exception_detail19error_info_injectorINS_9gregorian8bad_yearEEE = linkonce_odr constant [73 x i8] c"N5boost16exception_detail19error_info_injectorINS_9gregorian8bad_yearEEE\00"
@_ZTIN5boost16exception_detail19error_info_injectorINS_9gregorian8bad_yearEEE = linkonce_odr unnamed_addr constant { i8*, i8*, i32, i32, i8*, i32, i8*, i32 } { i8* bitcast (i8** getelementptr inbounds (i8** @_ZTVN10__cxxabiv121__vmi_class_type_infoE, i32 2) to i8*), i8* getelementptr inbounds ([73 x i8]* @_ZTSN5boost16exception_detail19error_info_injectorINS_9gregorian8bad_yearEEE, i32 0, i32 0), i32 0, i32 2, i8* bitcast ({ i8*, i8*, i8* }* @_ZTIN5boost9gregorian8bad_yearE to i8*), i32 2, i8* bitcast ({ i8*, i8* }* @_ZTIN5boost9exceptionE to i8*), i32 2050 }
@_ZTIN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian8bad_yearEEEEE = linkonce_odr unnamed_addr constant { i8*, i8*, i32, i32, i8*, i32, i8*, i32 } { i8* bitcast (i8** getelementptr inbounds (i8** @_ZTVN10__cxxabiv121__vmi_class_type_infoE, i32 2) to i8*), i8* getelementptr inbounds ([92 x i8]* @_ZTSN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian8bad_yearEEEEE, i32 0, i32 0), i32 0, i32 2, i8* bitcast ({ i8*, i8*, i32, i32, i8*, i32, i8*, i32 }* @_ZTIN5boost16exception_detail19error_info_injectorINS_9gregorian8bad_yearEEE to i8*), i32 2, i8* bitcast ({ i8*, i8* }* @_ZTIN5boost16exception_detail10clone_baseE to i8*), i32 -3069 }
@_ZTVN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian8bad_yearEEEEE = linkonce_odr unnamed_addr constant [21 x i8*] [i8* inttoptr (i32 28 to i8*), i8* null, i8* bitcast ({ i8*, i8*, i32, i32, i8*, i32, i8*, i32 }* @_ZTIN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian8bad_yearEEEEE to i8*), i8* bitcast (void (%"class.boost::exception_detail::clone_impl.51"*)* @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian8bad_yearEEEED1Ev to i8*), i8* bitcast (void (%"class.boost::exception_detail::clone_impl.51"*)* @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian8bad_yearEEEED0Ev to i8*), i8* bitcast (i8* (%"class.std::logic_error"*)* @_ZNKSt11logic_error4whatEv to i8*), i8* bitcast (%"class.boost::exception_detail::clone_base"* (%"class.boost::exception_detail::clone_impl.51"*)* @_ZNK5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian8bad_yearEEEE5cloneEv to i8*), i8* bitcast (void (%"class.boost::exception_detail::clone_impl.51"*)* @_ZNK5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian8bad_yearEEEE7rethrowEv to i8*), i8* inttoptr (i32 -8 to i8*), i8* bitcast ({ i8*, i8*, i32, i32, i8*, i32, i8*, i32 }* @_ZTIN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian8bad_yearEEEEE to i8*), i8* bitcast (void (%"class.boost::exception_detail::clone_impl.51"*)* @_ZThn8_N5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian8bad_yearEEEED1Ev to i8*), i8* bitcast (void (%"class.boost::exception_detail::clone_impl.51"*)* @_ZThn8_N5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian8bad_yearEEEED0Ev to i8*), i8* inttoptr (i32 -28 to i8*), i8* inttoptr (i32 -28 to i8*), i8* inttoptr (i32 -28 to i8*), i8* inttoptr (i32 -28 to i8*), i8* bitcast ({ i8*, i8*, i32, i32, i8*, i32, i8*, i32 }* @_ZTIN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian8bad_yearEEEEE to i8*), i8* bitcast (%"class.boost::exception_detail::clone_base"* (%"class.boost::exception_detail::clone_impl.51"*)* @_ZTv0_n12_NK5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian8bad_yearEEEE5cloneEv to i8*), i8* bitcast (void (%"class.boost::exception_detail::clone_impl.51"*)* @_ZTv0_n16_NK5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian8bad_yearEEEE7rethrowEv to i8*), i8* bitcast (void (%"class.boost::exception_detail::clone_impl.51"*)* @_ZTv0_n20_N5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian8bad_yearEEEED1Ev to i8*), i8* bitcast (void (%"class.boost::exception_detail::clone_impl.51"*)* @_ZTv0_n20_N5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian8bad_yearEEEED0Ev to i8*)]
@_ZTTN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian8bad_yearEEEEE = linkonce_odr unnamed_addr constant [2 x i8*] [i8* bitcast (i8** getelementptr inbounds ([21 x i8*]* @_ZTVN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian8bad_yearEEEEE, i64 0, i64 3) to i8*), i8* bitcast (i8** getelementptr inbounds ([21 x i8*]* @_ZTVN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian8bad_yearEEEEE, i64 0, i64 17) to i8*)]
@_ZTVN5boost16exception_detail19error_info_injectorINS_9gregorian8bad_yearEEE = linkonce_odr unnamed_addr constant [9 x i8*] [i8* null, i8* bitcast ({ i8*, i8*, i32, i32, i8*, i32, i8*, i32 }* @_ZTIN5boost16exception_detail19error_info_injectorINS_9gregorian8bad_yearEEE to i8*), i8* bitcast (void (%"struct.boost::exception_detail::error_info_injector.52"*)* @_ZN5boost16exception_detail19error_info_injectorINS_9gregorian8bad_yearEED1Ev to i8*), i8* bitcast (void (%"struct.boost::exception_detail::error_info_injector.52"*)* @_ZN5boost16exception_detail19error_info_injectorINS_9gregorian8bad_yearEED0Ev to i8*), i8* bitcast (i8* (%"class.std::logic_error"*)* @_ZNKSt11logic_error4whatEv to i8*), i8* inttoptr (i32 -8 to i8*), i8* bitcast ({ i8*, i8*, i32, i32, i8*, i32, i8*, i32 }* @_ZTIN5boost16exception_detail19error_info_injectorINS_9gregorian8bad_yearEEE to i8*), i8* bitcast (void (%"struct.boost::exception_detail::error_info_injector.52"*)* @_ZThn8_N5boost16exception_detail19error_info_injectorINS_9gregorian8bad_yearEED1Ev to i8*), i8* bitcast (void (%"struct.boost::exception_detail::error_info_injector.52"*)* @_ZThn8_N5boost16exception_detail19error_info_injectorINS_9gregorian8bad_yearEED0Ev to i8*)]
@.str42 = private unnamed_addr constant [35 x i8] c"Day of month is not valid for year\00", align 1
@.str43 = private unnamed_addr constant [44 x i8] c"could not convert calendar time to UTC time\00", align 1
@_ZTSN5boost16exception_detail10clone_implINS0_19error_info_injectorISt13runtime_errorEEEE = linkonce_odr constant [86 x i8] c"N5boost16exception_detail10clone_implINS0_19error_info_injectorISt13runtime_errorEEEE\00"
@_ZTSN5boost16exception_detail19error_info_injectorISt13runtime_errorEE = linkonce_odr constant [67 x i8] c"N5boost16exception_detail19error_info_injectorISt13runtime_errorEE\00"
@_ZTIN5boost16exception_detail19error_info_injectorISt13runtime_errorEE = linkonce_odr unnamed_addr constant { i8*, i8*, i32, i32, i8*, i32, i8*, i32 } { i8* bitcast (i8** getelementptr inbounds (i8** @_ZTVN10__cxxabiv121__vmi_class_type_infoE, i32 2) to i8*), i8* getelementptr inbounds ([67 x i8]* @_ZTSN5boost16exception_detail19error_info_injectorISt13runtime_errorEE, i32 0, i32 0), i32 0, i32 2, i8* bitcast (i8** @_ZTISt13runtime_error to i8*), i32 2, i8* bitcast ({ i8*, i8* }* @_ZTIN5boost9exceptionE to i8*), i32 2050 }
@_ZTIN5boost16exception_detail10clone_implINS0_19error_info_injectorISt13runtime_errorEEEE = linkonce_odr unnamed_addr constant { i8*, i8*, i32, i32, i8*, i32, i8*, i32 } { i8* bitcast (i8** getelementptr inbounds (i8** @_ZTVN10__cxxabiv121__vmi_class_type_infoE, i32 2) to i8*), i8* getelementptr inbounds ([86 x i8]* @_ZTSN5boost16exception_detail10clone_implINS0_19error_info_injectorISt13runtime_errorEEEE, i32 0, i32 0), i32 0, i32 2, i8* bitcast ({ i8*, i8*, i32, i32, i8*, i32, i8*, i32 }* @_ZTIN5boost16exception_detail19error_info_injectorISt13runtime_errorEE to i8*), i32 2, i8* bitcast ({ i8*, i8* }* @_ZTIN5boost16exception_detail10clone_baseE to i8*), i32 -3069 }
@_ZTVN5boost16exception_detail10clone_implINS0_19error_info_injectorISt13runtime_errorEEEE = linkonce_odr unnamed_addr constant [21 x i8*] [i8* inttoptr (i32 28 to i8*), i8* null, i8* bitcast ({ i8*, i8*, i32, i32, i8*, i32, i8*, i32 }* @_ZTIN5boost16exception_detail10clone_implINS0_19error_info_injectorISt13runtime_errorEEEE to i8*), i8* bitcast (void (%"class.boost::exception_detail::clone_impl.55"*)* @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorISt13runtime_errorEEED1Ev to i8*), i8* bitcast (void (%"class.boost::exception_detail::clone_impl.55"*)* @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorISt13runtime_errorEEED0Ev to i8*), i8* bitcast (i8* (%"class.std::runtime_error"*)* @_ZNKSt13runtime_error4whatEv to i8*), i8* bitcast (%"class.boost::exception_detail::clone_base"* (%"class.boost::exception_detail::clone_impl.55"*)* @_ZNK5boost16exception_detail10clone_implINS0_19error_info_injectorISt13runtime_errorEEE5cloneEv to i8*), i8* bitcast (void (%"class.boost::exception_detail::clone_impl.55"*)* @_ZNK5boost16exception_detail10clone_implINS0_19error_info_injectorISt13runtime_errorEEE7rethrowEv to i8*), i8* inttoptr (i32 -8 to i8*), i8* bitcast ({ i8*, i8*, i32, i32, i8*, i32, i8*, i32 }* @_ZTIN5boost16exception_detail10clone_implINS0_19error_info_injectorISt13runtime_errorEEEE to i8*), i8* bitcast (void (%"class.boost::exception_detail::clone_impl.55"*)* @_ZThn8_N5boost16exception_detail10clone_implINS0_19error_info_injectorISt13runtime_errorEEED1Ev to i8*), i8* bitcast (void (%"class.boost::exception_detail::clone_impl.55"*)* @_ZThn8_N5boost16exception_detail10clone_implINS0_19error_info_injectorISt13runtime_errorEEED0Ev to i8*), i8* inttoptr (i32 -28 to i8*), i8* inttoptr (i32 -28 to i8*), i8* inttoptr (i32 -28 to i8*), i8* inttoptr (i32 -28 to i8*), i8* bitcast ({ i8*, i8*, i32, i32, i8*, i32, i8*, i32 }* @_ZTIN5boost16exception_detail10clone_implINS0_19error_info_injectorISt13runtime_errorEEEE to i8*), i8* bitcast (%"class.boost::exception_detail::clone_base"* (%"class.boost::exception_detail::clone_impl.55"*)* @_ZTv0_n12_NK5boost16exception_detail10clone_implINS0_19error_info_injectorISt13runtime_errorEEE5cloneEv to i8*), i8* bitcast (void (%"class.boost::exception_detail::clone_impl.55"*)* @_ZTv0_n16_NK5boost16exception_detail10clone_implINS0_19error_info_injectorISt13runtime_errorEEE7rethrowEv to i8*), i8* bitcast (void (%"class.boost::exception_detail::clone_impl.55"*)* @_ZTv0_n20_N5boost16exception_detail10clone_implINS0_19error_info_injectorISt13runtime_errorEEED1Ev to i8*), i8* bitcast (void (%"class.boost::exception_detail::clone_impl.55"*)* @_ZTv0_n20_N5boost16exception_detail10clone_implINS0_19error_info_injectorISt13runtime_errorEEED0Ev to i8*)]
@_ZTTN5boost16exception_detail10clone_implINS0_19error_info_injectorISt13runtime_errorEEEE = linkonce_odr unnamed_addr constant [2 x i8*] [i8* bitcast (i8** getelementptr inbounds ([21 x i8*]* @_ZTVN5boost16exception_detail10clone_implINS0_19error_info_injectorISt13runtime_errorEEEE, i64 0, i64 3) to i8*), i8* bitcast (i8** getelementptr inbounds ([21 x i8*]* @_ZTVN5boost16exception_detail10clone_implINS0_19error_info_injectorISt13runtime_errorEEEE, i64 0, i64 17) to i8*)]
@_ZTVN5boost16exception_detail19error_info_injectorISt13runtime_errorEE = linkonce_odr unnamed_addr constant [9 x i8*] [i8* null, i8* bitcast ({ i8*, i8*, i32, i32, i8*, i32, i8*, i32 }* @_ZTIN5boost16exception_detail19error_info_injectorISt13runtime_errorEE to i8*), i8* bitcast (void (%"struct.boost::exception_detail::error_info_injector.56"*)* @_ZN5boost16exception_detail19error_info_injectorISt13runtime_errorED1Ev to i8*), i8* bitcast (void (%"struct.boost::exception_detail::error_info_injector.56"*)* @_ZN5boost16exception_detail19error_info_injectorISt13runtime_errorED0Ev to i8*), i8* bitcast (i8* (%"class.std::runtime_error"*)* @_ZNKSt13runtime_error4whatEv to i8*), i8* inttoptr (i32 -8 to i8*), i8* bitcast ({ i8*, i8*, i32, i32, i8*, i32, i8*, i32 }* @_ZTIN5boost16exception_detail19error_info_injectorISt13runtime_errorEE to i8*), i8* bitcast (void (%"struct.boost::exception_detail::error_info_injector.56"*)* @_ZThn8_N5boost16exception_detail19error_info_injectorISt13runtime_errorED1Ev to i8*), i8* bitcast (void (%"struct.boost::exception_detail::error_info_injector.56"*)* @_ZThn8_N5boost16exception_detail19error_info_injectorISt13runtime_errorED0Ev to i8*)]
@.str44 = private unnamed_addr constant [31 x i8] c"!pthread_cond_broadcast(&cond)\00", align 1
@.str45 = private unnamed_addr constant [70 x i8] c"/home/thomas/boost_1_52_0/boost/thread/pthread/condition_variable.hpp\00", align 1
@__PRETTY_FUNCTION__._ZN5boost22condition_variable_any10notify_allEv = private unnamed_addr constant [49 x i8] c"void boost::condition_variable_any::notify_all()\00", align 1
@.str46 = private unnamed_addr constant [77 x i8] c"/home/thomas/boost_1_52_0/boost/thread/pthread/pthread_mutex_scoped_lock.hpp\00", align 1
@__PRETTY_FUNCTION__._ZN5boost7pthread25pthread_mutex_scoped_lock6unlockEv = private unnamed_addr constant [57 x i8] c"void boost::pthread::pthread_mutex_scoped_lock::unlock()\00", align 1
@__PRETTY_FUNCTION__._ZN5boost7pthread25pthread_mutex_scoped_lockC2EP15pthread_mutex_t = private unnamed_addr constant [88 x i8] c"boost::pthread::pthread_mutex_scoped_lock::pthread_mutex_scoped_lock(pthread_mutex_t *)\00", align 1
@__PRETTY_FUNCTION__._ZN5boost22condition_variable_anyD2Ev = private unnamed_addr constant [57 x i8] c"boost::condition_variable_any::~condition_variable_any()\00", align 1
@.str47 = private unnamed_addr constant [29 x i8] c"!pthread_cond_destroy(&cond)\00", align 1
@.str48 = private unnamed_addr constant [52 x i8] c"condition_variable_any failed in pthread_mutex_init\00", align 1
@__PRETTY_FUNCTION__._ZN5boost22condition_variable_anyC2Ev = private unnamed_addr constant [56 x i8] c"boost::condition_variable_any::condition_variable_any()\00", align 1
@.str49 = private unnamed_addr constant [51 x i8] c"condition_variable_any failed in pthread_cond_init\00", align 1
@.str50 = private unnamed_addr constant [55 x i8] c"boost:: mutex constructor failed in pthread_mutex_init\00", align 1
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
  call void @_ZN5boost5mutexC1Ev(%"class.boost::mutex"* @mutex)
  %0 = call i32 @__cxa_atexit(void (i8*)* bitcast (void (%"class.boost::mutex"*)* @_ZN5boost5mutexD1Ev to void (i8*)*), i8* bitcast (%"class.boost::mutex"* @mutex to i8*), i8* @__dso_handle) nounwind
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

define internal void @__cxx_global_var_init14() section ".text.startup" {
entry:
  call void @_ZN5boost22condition_variable_anyC1Ev(%"class.boost::condition_variable_any"* @cond)
  %0 = call i32 @__cxa_atexit(void (i8*)* bitcast (void (%"class.boost::condition_variable_any"*)* @_ZN5boost22condition_variable_anyD1Ev to void (i8*)*), i8* bitcast (%"class.boost::condition_variable_any"* @cond to i8*), i8* @__dso_handle) nounwind
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

define linkonce_odr void @_ZN5boost22condition_variable_anyD1Ev(%"class.boost::condition_variable_any"* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::condition_variable_any"*, align 4
  store %"class.boost::condition_variable_any"* %this, %"class.boost::condition_variable_any"** %this.addr, align 4
  %this1 = load %"class.boost::condition_variable_any"** %this.addr
  call void @_ZN5boost22condition_variable_anyD2Ev(%"class.boost::condition_variable_any"* %this1)
  ret void
}

define i8* @_Z11player_namei(i32 %state) {
entry:
  %retval = alloca i8*, align 4
  %state.addr = alloca i32, align 4
  store i32 %state, i32* %state.addr, align 4
  %0 = load i32* %state.addr, align 4
  %cmp = icmp eq i32 %0, 1
  br i1 %cmp, label %if.then, label %if.end

if.then:                                          ; preds = %entry
  store i8* getelementptr inbounds ([9 x i8]* @.str15, i32 0, i32 0), i8** %retval
  br label %return

if.end:                                           ; preds = %entry
  %1 = load i32* %state.addr, align 4
  %cmp1 = icmp eq i32 %1, 2
  br i1 %cmp1, label %if.then2, label %if.end3

if.then2:                                         ; preds = %if.end
  store i8* getelementptr inbounds ([9 x i8]* @.str16, i32 0, i32 0), i8** %retval
  br label %return

if.end3:                                          ; preds = %if.end
  %exception = call i8* @__cxa_allocate_exception(i32 4) nounwind
  %2 = bitcast i8* %exception to i8**
  store i8* getelementptr inbounds ([11 x i8]* @.str17, i32 0, i32 0), i8** %2
  call void @__cxa_throw(i8* %exception, i8* bitcast (i8** @_ZTIPKc to i8*), i8* null) noreturn
  unreachable

return:                                           ; preds = %if.then2, %if.then
  %3 = load i8** %retval
  ret i8* %3
}

declare i8* @__cxa_allocate_exception(i32)

declare void @__cxa_throw(i8*, i8*, i8*)

define void @_Z6playerPv(i8* %param) {
entry:
  %param.addr = alloca i8*, align 4
  %lock = alloca %"class.boost::unique_lock", align 4
  %active = alloca i32, align 4
  %other = alloca i32, align 4
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  store i8* %param, i8** %param.addr, align 4
  call void @_ZN5boost11unique_lockINS_5mutexEEC1ERS1_(%"class.boost::unique_lock"* %lock, %"class.boost::mutex"* @mutex)
  %0 = load i8** %param.addr, align 4
  %1 = ptrtoint i8* %0 to i32
  store i32 %1, i32* %active, align 4
  %2 = load i32* %active, align 4
  %cmp = icmp eq i32 %2, 1
  %cond = select i1 %cmp, i32 2, i32 1
  store i32 %cond, i32* %other, align 4
  br label %while.cond

while.cond:                                       ; preds = %do.end, %entry
  %3 = load i32* @state, align 4
  %cmp1 = icmp slt i32 %3, 3
  br i1 %cmp1, label %while.body, label %while.end

while.body:                                       ; preds = %while.cond
  %4 = load i32* %active, align 4
  %call = invoke i8* @_Z11player_namei(i32 %4)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %while.body
  %call3 = invoke %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* @_ZSt4cout, i8* %call)
          to label %invoke.cont2 unwind label %lpad

invoke.cont2:                                     ; preds = %invoke.cont
  %call5 = invoke %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* %call3, i8* getelementptr inbounds ([8 x i8]* @.str18, i32 0, i32 0))
          to label %invoke.cont4 unwind label %lpad

invoke.cont4:                                     ; preds = %invoke.cont2
  %call7 = invoke %"class.std::basic_ostream"* @_ZNSolsEPFRSoS_E(%"class.std::basic_ostream"* %call5, %"class.std::basic_ostream"* (%"class.std::basic_ostream"*)* @_ZSt4endlIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_)
          to label %invoke.cont6 unwind label %lpad

invoke.cont6:                                     ; preds = %invoke.cont4
  %5 = load i32* %other, align 4
  store i32 %5, i32* @state, align 4
  invoke void @_ZN5boost22condition_variable_any10notify_allEv(%"class.boost::condition_variable_any"* @cond)
          to label %invoke.cont8 unwind label %lpad

invoke.cont8:                                     ; preds = %invoke.cont6
  br label %do.body

do.body:                                          ; preds = %do.cond, %invoke.cont8
  invoke void @_ZN5boost22condition_variable_any4waitINS_11unique_lockINS_5mutexEEEEEvRT_(%"class.boost::condition_variable_any"* @cond, %"class.boost::unique_lock"* %lock)
          to label %invoke.cont9 unwind label %lpad

invoke.cont9:                                     ; preds = %do.body
  %6 = load i32* @state, align 4
  %7 = load i32* %other, align 4
  %cmp10 = icmp eq i32 %6, %7
  br i1 %cmp10, label %if.then, label %if.end

if.then:                                          ; preds = %invoke.cont9
  %call12 = invoke %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* @_ZSt4cout, i8* getelementptr inbounds ([4 x i8]* @.str19, i32 0, i32 0))
          to label %invoke.cont11 unwind label %lpad

invoke.cont11:                                    ; preds = %if.then
  %8 = load i32* %active, align 4
  %call14 = invoke i8* @_Z11player_namei(i32 %8)
          to label %invoke.cont13 unwind label %lpad

invoke.cont13:                                    ; preds = %invoke.cont11
  %call16 = invoke %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* %call12, i8* %call14)
          to label %invoke.cont15 unwind label %lpad

invoke.cont15:                                    ; preds = %invoke.cont13
  %call18 = invoke %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* %call16, i8* getelementptr inbounds ([19 x i8]* @.str20, i32 0, i32 0))
          to label %invoke.cont17 unwind label %lpad

invoke.cont17:                                    ; preds = %invoke.cont15
  %call20 = invoke %"class.std::basic_ostream"* @_ZNSolsEPFRSoS_E(%"class.std::basic_ostream"* %call18, %"class.std::basic_ostream"* (%"class.std::basic_ostream"*)* @_ZSt4endlIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_)
          to label %invoke.cont19 unwind label %lpad

invoke.cont19:                                    ; preds = %invoke.cont17
  br label %if.end

lpad:                                             ; preds = %invoke.cont28, %invoke.cont26, %invoke.cont24, %invoke.cont22, %while.end, %invoke.cont17, %invoke.cont15, %invoke.cont13, %invoke.cont11, %if.then, %do.body, %invoke.cont6, %invoke.cont4, %invoke.cont2, %invoke.cont, %while.body
  %9 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %10 = extractvalue { i8*, i32 } %9, 0
  store i8* %10, i8** %exn.slot
  %11 = extractvalue { i8*, i32 } %9, 1
  store i32 %11, i32* %ehselector.slot
  invoke void @_ZN5boost11unique_lockINS_5mutexEED1Ev(%"class.boost::unique_lock"* %lock)
          to label %invoke.cont31 unwind label %terminate.lpad

if.end:                                           ; preds = %invoke.cont19, %invoke.cont9
  br label %do.cond

do.cond:                                          ; preds = %if.end
  %12 = load i32* @state, align 4
  %13 = load i32* %other, align 4
  %cmp21 = icmp eq i32 %12, %13
  br i1 %cmp21, label %do.body, label %do.end

do.end:                                           ; preds = %do.cond
  br label %while.cond

while.end:                                        ; preds = %while.cond
  %14 = load i32* @state, align 4
  %inc = add nsw i32 %14, 1
  store i32 %inc, i32* @state, align 4
  %15 = load i32* %active, align 4
  %call23 = invoke i8* @_Z11player_namei(i32 %15)
          to label %invoke.cont22 unwind label %lpad

invoke.cont22:                                    ; preds = %while.end
  %call25 = invoke %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* @_ZSt4cout, i8* %call23)
          to label %invoke.cont24 unwind label %lpad

invoke.cont24:                                    ; preds = %invoke.cont22
  %call27 = invoke %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* %call25, i8* getelementptr inbounds ([8 x i8]* @.str21, i32 0, i32 0))
          to label %invoke.cont26 unwind label %lpad

invoke.cont26:                                    ; preds = %invoke.cont24
  %call29 = invoke %"class.std::basic_ostream"* @_ZNSolsEPFRSoS_E(%"class.std::basic_ostream"* %call27, %"class.std::basic_ostream"* (%"class.std::basic_ostream"*)* @_ZSt4endlIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_)
          to label %invoke.cont28 unwind label %lpad

invoke.cont28:                                    ; preds = %invoke.cont26
  invoke void @_ZN5boost22condition_variable_any10notify_allEv(%"class.boost::condition_variable_any"* @cond)
          to label %invoke.cont30 unwind label %lpad

invoke.cont30:                                    ; preds = %invoke.cont28
  call void @_ZN5boost11unique_lockINS_5mutexEED1Ev(%"class.boost::unique_lock"* %lock)
  ret void

invoke.cont31:                                    ; preds = %lpad
  br label %eh.resume

eh.resume:                                        ; preds = %invoke.cont31
  %exn = load i8** %exn.slot
  %sel = load i32* %ehselector.slot
  %lpad.val = insertvalue { i8*, i32 } undef, i8* %exn, 0
  %lpad.val32 = insertvalue { i8*, i32 } %lpad.val, i32 %sel, 1
  resume { i8*, i32 } %lpad.val32

terminate.lpad:                                   ; preds = %lpad
  %16 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
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

declare %"class.std::basic_ostream"* @_ZNSolsEPFRSoS_E(%"class.std::basic_ostream"*, %"class.std::basic_ostream"* (%"class.std::basic_ostream"*)*)

declare %"class.std::basic_ostream"* @_ZSt4endlIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_(%"class.std::basic_ostream"*)

define linkonce_odr void @_ZN5boost22condition_variable_any10notify_allEv(%"class.boost::condition_variable_any"* %this) align 2 {
entry:
  %this.addr = alloca %"class.boost::condition_variable_any"*, align 4
  %internal_lock = alloca %"class.boost::pthread::pthread_mutex_scoped_lock", align 4
  store %"class.boost::condition_variable_any"* %this, %"class.boost::condition_variable_any"** %this.addr, align 4
  %this1 = load %"class.boost::condition_variable_any"** %this.addr
  %internal_mutex = getelementptr inbounds %"class.boost::condition_variable_any"* %this1, i32 0, i32 0
  call void @_ZN5boost7pthread25pthread_mutex_scoped_lockC1EP15pthread_mutex_t(%"class.boost::pthread::pthread_mutex_scoped_lock"* %internal_lock, %union.pthread_mutex_t* %internal_mutex)
  %cond = getelementptr inbounds %"class.boost::condition_variable_any"* %this1, i32 0, i32 1
  %call = call i32 @pthread_cond_broadcast(%union.pthread_cond_t* %cond) nounwind
  %tobool = icmp ne i32 %call, 0
  br i1 %tobool, label %cond.false, label %cond.true

cond.true:                                        ; preds = %entry
  br label %cond.end

cond.false:                                       ; preds = %entry
  call void @__assert_fail(i8* getelementptr inbounds ([31 x i8]* @.str44, i32 0, i32 0), i8* getelementptr inbounds ([70 x i8]* @.str45, i32 0, i32 0), i32 300, i8* getelementptr inbounds ([49 x i8]* @__PRETTY_FUNCTION__._ZN5boost22condition_variable_any10notify_allEv, i32 0, i32 0)) noreturn nounwind
  unreachable
                                                  ; No predecessors!
  br label %cond.end

cond.end:                                         ; preds = %0, %cond.true
  call void @_ZN5boost7pthread25pthread_mutex_scoped_lockD1Ev(%"class.boost::pthread::pthread_mutex_scoped_lock"* %internal_lock)
  ret void
}

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
  call void @_ZN5boost15condition_errorC1EiPKc(%"class.boost::condition_error"* %ref.tmp, i32 %2, i8* getelementptr inbounds ([51 x i8]* @.str30, i32 0, i32 0))
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

define linkonce_odr void @_ZN5boost11unique_lockINS_5mutexEED1Ev(%"class.boost::unique_lock"* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::unique_lock"*, align 4
  store %"class.boost::unique_lock"* %this, %"class.boost::unique_lock"** %this.addr, align 4
  %this1 = load %"class.boost::unique_lock"** %this.addr
  call void @_ZN5boost11unique_lockINS_5mutexEED2Ev(%"class.boost::unique_lock"* %this1)
  ret void
}

define i32 @main(i32 %argc, i8** %argv) {
entry:
  %retval = alloca i32, align 4
  %argc.addr = alloca i32, align 4
  %argv.addr = alloca i8**, align 4
  %thrda = alloca %"class.boost::thread", align 4
  %agg.tmp = alloca %class.thread_adapter, align 4
  %thrdb = alloca %"class.boost::thread", align 4
  %agg.tmp1 = alloca %class.thread_adapter, align 4
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  %xt = alloca %"struct.boost::xtime", align 4
  %ref.tmp = alloca %"class.boost::posix_time::ptime", align 4
  %lock = alloca %"class.boost::unique_lock", align 4
  %i = alloca i32, align 4
  %lock16 = alloca %"class.boost::unique_lock", align 4
  %cleanup.dest.slot = alloca i32
  store i32 0, i32* %retval
  store i32 %argc, i32* %argc.addr, align 4
  store i8** %argv, i8*** %argv.addr, align 4
  store i32 0, i32* @state, align 4
  call void @_ZN14thread_adapterC1EPFvPvES0_(%class.thread_adapter* %agg.tmp, void (i8*)* @_Z6playerPv, i8* inttoptr (i32 1 to i8*))
  call void @_ZN5boost6threadC1I14thread_adapterEET_NS_10disable_ifINS_14is_convertibleIRS3_NS_6detail13thread_move_tIS3_EEEEPNS0_5dummyEE4typeE(%"class.boost::thread"* %thrda, %class.thread_adapter* byval align 4 %agg.tmp, %"struct.boost::thread::dummy"* null)
  invoke void @_ZN14thread_adapterC1EPFvPvES0_(%class.thread_adapter* %agg.tmp1, void (i8*)* @_Z6playerPv, i8* inttoptr (i32 2 to i8*))
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %entry
  invoke void @_ZN5boost6threadC1I14thread_adapterEET_NS_10disable_ifINS_14is_convertibleIRS3_NS_6detail13thread_move_tIS3_EEEEPNS0_5dummyEE4typeE(%"class.boost::thread"* %thrdb, %class.thread_adapter* byval align 4 %agg.tmp1, %"struct.boost::thread::dummy"* null)
          to label %invoke.cont2 unwind label %lpad

invoke.cont2:                                     ; preds = %invoke.cont
  %call = invoke i32 @_ZN5boost9xtime_getEPNS_5xtimeEi(%"struct.boost::xtime"* %xt, i32 1)
          to label %invoke.cont4 unwind label %lpad3

invoke.cont4:                                     ; preds = %invoke.cont2
  %sec = getelementptr inbounds %"struct.boost::xtime"* %xt, i32 0, i32 0
  %0 = load i64* %sec, align 4
  %add = add nsw i64 %0, 1
  store i64 %add, i64* %sec, align 4
  invoke void @_ZNK5boost5xtimecvNS_10posix_time5ptimeEEv(%"class.boost::posix_time::ptime"* sret %ref.tmp, %"struct.boost::xtime"* %xt)
          to label %invoke.cont5 unwind label %lpad3

invoke.cont5:                                     ; preds = %invoke.cont4
  invoke void @_ZN5boost6thread5sleepERKNS_10posix_time5ptimeE(%"class.boost::posix_time::ptime"* %ref.tmp)
          to label %invoke.cont6 unwind label %lpad3

invoke.cont6:                                     ; preds = %invoke.cont5
  invoke void @_ZN5boost11unique_lockINS_5mutexEEC1ERS1_(%"class.boost::unique_lock"* %lock, %"class.boost::mutex"* @mutex)
          to label %invoke.cont7 unwind label %lpad3

invoke.cont7:                                     ; preds = %invoke.cont6
  %call10 = invoke %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* @_ZSt4cout, i8* getelementptr inbounds ([15 x i8]* @.str22, i32 0, i32 0))
          to label %invoke.cont9 unwind label %lpad8

invoke.cont9:                                     ; preds = %invoke.cont7
  %call12 = invoke %"class.std::basic_ostream"* @_ZNSolsEPFRSoS_E(%"class.std::basic_ostream"* %call10, %"class.std::basic_ostream"* (%"class.std::basic_ostream"*)* @_ZSt4endlIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_)
          to label %invoke.cont11 unwind label %lpad8

invoke.cont11:                                    ; preds = %invoke.cont9
  invoke void @_ZN5boost11unique_lockINS_5mutexEED1Ev(%"class.boost::unique_lock"* %lock)
          to label %invoke.cont13 unwind label %lpad3

invoke.cont13:                                    ; preds = %invoke.cont11
  store i32 0, i32* %i, align 4
  br label %for.cond

for.cond:                                         ; preds = %for.inc, %invoke.cont13
  %1 = load i32* %i, align 4
  %cmp = icmp slt i32 %1, 1000000000
  br i1 %cmp, label %for.body, label %for.end

for.body:                                         ; preds = %for.cond
  invoke void @_ZN5boost22condition_variable_any10notify_allEv(%"class.boost::condition_variable_any"* @cond)
          to label %invoke.cont15 unwind label %lpad3

invoke.cont15:                                    ; preds = %for.body
  br label %for.inc

for.inc:                                          ; preds = %invoke.cont15
  %2 = load i32* %i, align 4
  %inc = add nsw i32 %2, 1
  store i32 %inc, i32* %i, align 4
  br label %for.cond

lpad:                                             ; preds = %invoke.cont33, %invoke.cont, %entry
  %3 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %4 = extractvalue { i8*, i32 } %3, 0
  store i8* %4, i8** %exn.slot
  %5 = extractvalue { i8*, i32 } %3, 1
  store i32 %5, i32* %ehselector.slot
  br label %ehcleanup36

lpad3:                                            ; preds = %invoke.cont32, %invoke.cont30, %invoke.cont28, %invoke.cont26, %do.end, %for.end, %for.body, %invoke.cont11, %invoke.cont6, %invoke.cont5, %invoke.cont4, %invoke.cont2
  %6 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %7 = extractvalue { i8*, i32 } %6, 0
  store i8* %7, i8** %exn.slot
  %8 = extractvalue { i8*, i32 } %6, 1
  store i32 %8, i32* %ehselector.slot
  br label %ehcleanup

lpad8:                                            ; preds = %invoke.cont9, %invoke.cont7
  %9 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %10 = extractvalue { i8*, i32 } %9, 0
  store i8* %10, i8** %exn.slot
  %11 = extractvalue { i8*, i32 } %9, 1
  store i32 %11, i32* %ehselector.slot
  invoke void @_ZN5boost11unique_lockINS_5mutexEED1Ev(%"class.boost::unique_lock"* %lock)
          to label %invoke.cont14 unwind label %terminate.lpad

invoke.cont14:                                    ; preds = %lpad8
  br label %ehcleanup

for.end:                                          ; preds = %for.cond
  invoke void @_ZN5boost11unique_lockINS_5mutexEEC1ERS1_(%"class.boost::unique_lock"* %lock16, %"class.boost::mutex"* @mutex)
          to label %invoke.cont17 unwind label %lpad3

invoke.cont17:                                    ; preds = %for.end
  %call20 = invoke %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* @_ZSt4cout, i8* getelementptr inbounds ([16 x i8]* @.str23, i32 0, i32 0))
          to label %invoke.cont19 unwind label %lpad18

invoke.cont19:                                    ; preds = %invoke.cont17
  %call22 = invoke %"class.std::basic_ostream"* @_ZNSolsEPFRSoS_E(%"class.std::basic_ostream"* %call20, %"class.std::basic_ostream"* (%"class.std::basic_ostream"*)* @_ZSt4endlIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_)
          to label %invoke.cont21 unwind label %lpad18

invoke.cont21:                                    ; preds = %invoke.cont19
  store i32 3, i32* @state, align 4
  invoke void @_ZN5boost22condition_variable_any10notify_allEv(%"class.boost::condition_variable_any"* @cond)
          to label %invoke.cont23 unwind label %lpad18

invoke.cont23:                                    ; preds = %invoke.cont21
  br label %do.body

do.body:                                          ; preds = %do.cond, %invoke.cont23
  invoke void @_ZN5boost22condition_variable_any4waitINS_11unique_lockINS_5mutexEEEEEvRT_(%"class.boost::condition_variable_any"* @cond, %"class.boost::unique_lock"* %lock16)
          to label %invoke.cont24 unwind label %lpad18

invoke.cont24:                                    ; preds = %do.body
  br label %do.cond

do.cond:                                          ; preds = %invoke.cont24
  %12 = load i32* @state, align 4
  %cmp25 = icmp ne i32 %12, 5
  br i1 %cmp25, label %do.body, label %do.end

do.end:                                           ; preds = %do.cond
  invoke void @_ZN5boost11unique_lockINS_5mutexEED1Ev(%"class.boost::unique_lock"* %lock16)
          to label %invoke.cont26 unwind label %lpad3

invoke.cont26:                                    ; preds = %do.end
  %call29 = invoke %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* @_ZSt4cout, i8* getelementptr inbounds ([10 x i8]* @.str24, i32 0, i32 0))
          to label %invoke.cont28 unwind label %lpad3

invoke.cont28:                                    ; preds = %invoke.cont26
  %call31 = invoke %"class.std::basic_ostream"* @_ZNSolsEPFRSoS_E(%"class.std::basic_ostream"* %call29, %"class.std::basic_ostream"* (%"class.std::basic_ostream"*)* @_ZSt4endlIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_)
          to label %invoke.cont30 unwind label %lpad3

invoke.cont30:                                    ; preds = %invoke.cont28
  invoke void @_ZN5boost6thread4joinEv(%"class.boost::thread"* %thrda)
          to label %invoke.cont32 unwind label %lpad3

invoke.cont32:                                    ; preds = %invoke.cont30
  invoke void @_ZN5boost6thread4joinEv(%"class.boost::thread"* %thrdb)
          to label %invoke.cont33 unwind label %lpad3

invoke.cont33:                                    ; preds = %invoke.cont32
  store i32 0, i32* %retval
  store i32 1, i32* %cleanup.dest.slot
  invoke void @_ZN5boost6threadD1Ev(%"class.boost::thread"* %thrdb)
          to label %invoke.cont34 unwind label %lpad

lpad18:                                           ; preds = %do.body, %invoke.cont21, %invoke.cont19, %invoke.cont17
  %13 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %14 = extractvalue { i8*, i32 } %13, 0
  store i8* %14, i8** %exn.slot
  %15 = extractvalue { i8*, i32 } %13, 1
  store i32 %15, i32* %ehselector.slot
  invoke void @_ZN5boost11unique_lockINS_5mutexEED1Ev(%"class.boost::unique_lock"* %lock16)
          to label %invoke.cont27 unwind label %terminate.lpad

invoke.cont27:                                    ; preds = %lpad18
  br label %ehcleanup

invoke.cont34:                                    ; preds = %invoke.cont33
  call void @_ZN5boost6threadD1Ev(%"class.boost::thread"* %thrda)
  %16 = load i32* %retval
  ret i32 %16

ehcleanup:                                        ; preds = %invoke.cont27, %invoke.cont14, %lpad3
  invoke void @_ZN5boost6threadD1Ev(%"class.boost::thread"* %thrdb)
          to label %invoke.cont35 unwind label %terminate.lpad

invoke.cont35:                                    ; preds = %ehcleanup
  br label %ehcleanup36

ehcleanup36:                                      ; preds = %invoke.cont35, %lpad
  invoke void @_ZN5boost6threadD1Ev(%"class.boost::thread"* %thrda)
          to label %invoke.cont37 unwind label %terminate.lpad

invoke.cont37:                                    ; preds = %ehcleanup36
  br label %eh.resume

eh.resume:                                        ; preds = %invoke.cont37
  %exn = load i8** %exn.slot
  %sel = load i32* %ehselector.slot
  %lpad.val = insertvalue { i8*, i32 } undef, i8* %exn, 0
  %lpad.val38 = insertvalue { i8*, i32 } %lpad.val, i32 %sel, 1
  resume { i8*, i32 } %lpad.val38

terminate.lpad:                                   ; preds = %ehcleanup36, %ehcleanup, %lpad18, %lpad8
  %17 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          catch i8* null
  call void @_ZSt9terminatev() noreturn nounwind
  unreachable
}

define linkonce_odr void @_ZN5boost6threadC1I14thread_adapterEET_NS_10disable_ifINS_14is_convertibleIRS3_NS_6detail13thread_move_tIS3_EEEEPNS0_5dummyEE4typeE(%"class.boost::thread"* %this, %class.thread_adapter* byval align 4 %f, %"struct.boost::thread::dummy"*) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::thread"*, align 4
  %.addr = alloca %"struct.boost::thread::dummy"*, align 4
  store %"class.boost::thread"* %this, %"class.boost::thread"** %this.addr, align 4
  store %"struct.boost::thread::dummy"* %0, %"struct.boost::thread::dummy"** %.addr, align 4
  %this1 = load %"class.boost::thread"** %this.addr
  %1 = load %"struct.boost::thread::dummy"** %.addr, align 4
  call void @_ZN5boost6threadC2I14thread_adapterEET_NS_10disable_ifINS_14is_convertibleIRS3_NS_6detail13thread_move_tIS3_EEEEPNS0_5dummyEE4typeE(%"class.boost::thread"* %this1, %class.thread_adapter* byval align 4 %f, %"struct.boost::thread::dummy"* %1)
  ret void
}

define linkonce_odr void @_ZN14thread_adapterC1EPFvPvES0_(%class.thread_adapter* %this, void (i8*)* %func, i8* %param) unnamed_addr align 2 {
entry:
  %this.addr = alloca %class.thread_adapter*, align 4
  %func.addr = alloca void (i8*)*, align 4
  %param.addr = alloca i8*, align 4
  store %class.thread_adapter* %this, %class.thread_adapter** %this.addr, align 4
  store void (i8*)* %func, void (i8*)** %func.addr, align 4
  store i8* %param, i8** %param.addr, align 4
  %this1 = load %class.thread_adapter** %this.addr
  %0 = load void (i8*)** %func.addr, align 4
  %1 = load i8** %param.addr, align 4
  call void @_ZN14thread_adapterC2EPFvPvES0_(%class.thread_adapter* %this1, void (i8*)* %0, i8* %1)
  ret void
}

define linkonce_odr i32 @_ZN5boost9xtime_getEPNS_5xtimeEi(%"struct.boost::xtime"* %xtp, i32 %clock_type) inlinehint {
entry:
  %retval = alloca i32, align 4
  %xtp.addr = alloca %"struct.boost::xtime"*, align 4
  %clock_type.addr = alloca i32, align 4
  %ref.tmp = alloca %"struct.boost::xtime", align 4
  %ref.tmp1 = alloca %"class.boost::posix_time::ptime", align 4
  store %"struct.boost::xtime"* %xtp, %"struct.boost::xtime"** %xtp.addr, align 4
  store i32 %clock_type, i32* %clock_type.addr, align 4
  %0 = load i32* %clock_type.addr, align 4
  %cmp = icmp eq i32 %0, 1
  br i1 %cmp, label %if.then, label %if.end

if.then:                                          ; preds = %entry
  %1 = load %"struct.boost::xtime"** %xtp.addr, align 4
  call void @_ZN5boost15get_system_timeEv(%"class.boost::posix_time::ptime"* sret %ref.tmp1)
  call void @_ZN5boost9get_xtimeERKNS_10posix_time5ptimeE(%"struct.boost::xtime"* sret %ref.tmp, %"class.boost::posix_time::ptime"* %ref.tmp1)
  %2 = bitcast %"struct.boost::xtime"* %1 to i8*
  %3 = bitcast %"struct.boost::xtime"* %ref.tmp to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %2, i8* %3, i32 12, i32 4, i1 false)
  %4 = load i32* %clock_type.addr, align 4
  store i32 %4, i32* %retval
  br label %return

if.end:                                           ; preds = %entry
  store i32 0, i32* %retval
  br label %return

return:                                           ; preds = %if.end, %if.then
  %5 = load i32* %retval
  ret i32 %5
}

define linkonce_odr void @_ZN5boost6thread5sleepERKNS_10posix_time5ptimeE(%"class.boost::posix_time::ptime"* %xt) inlinehint align 2 {
entry:
  %xt.addr = alloca %"class.boost::posix_time::ptime"*, align 4
  store %"class.boost::posix_time::ptime"* %xt, %"class.boost::posix_time::ptime"** %xt.addr, align 4
  %0 = load %"class.boost::posix_time::ptime"** %xt.addr, align 4
  call void @_ZN5boost11this_thread5sleepERKNS_10posix_time5ptimeE(%"class.boost::posix_time::ptime"* %0)
  ret void
}

define linkonce_odr void @_ZNK5boost5xtimecvNS_10posix_time5ptimeEEv(%"class.boost::posix_time::ptime"* noalias sret %agg.result, %"struct.boost::xtime"* %this) align 2 {
entry:
  %this.addr = alloca %"struct.boost::xtime"*, align 4
  %tmp = alloca %"class.boost::posix_time::ptime", align 4
  %ref.tmp = alloca %"class.boost::posix_time::seconds", align 4
  %tmp2 = alloca %"class.boost::posix_time::ptime", align 4
  %ref.tmp3 = alloca %"class.boost::date_time::subsecond_duration", align 4
  store %"struct.boost::xtime"* %this, %"struct.boost::xtime"** %this.addr, align 4
  %this1 = load %"struct.boost::xtime"** %this.addr
  call void @_ZN5boost10posix_time11from_time_tEl(%"class.boost::posix_time::ptime"* sret %tmp, i32 0)
  %0 = bitcast %"class.boost::posix_time::ptime"* %tmp to %"class.boost::date_time::base_time"*
  %sec = getelementptr inbounds %"struct.boost::xtime"* %this1, i32 0, i32 0
  %1 = load i64* %sec, align 4
  %conv = trunc i64 %1 to i32
  call void @_ZN5boost10posix_time7secondsC1El(%"class.boost::posix_time::seconds"* %ref.tmp, i32 %conv)
  %2 = bitcast %"class.boost::posix_time::seconds"* %ref.tmp to %"class.boost::posix_time::time_duration"*
  call void @_ZNK5boost9date_time9base_timeINS_10posix_time5ptimeENS0_19counted_time_systemINS0_16counted_time_repINS2_33millisec_posix_time_system_configEEEEEEplERKNS2_13time_durationE(%"class.boost::posix_time::ptime"* sret %tmp2, %"class.boost::date_time::base_time"* %0, %"class.boost::posix_time::time_duration"* %2)
  %3 = bitcast %"class.boost::posix_time::ptime"* %tmp2 to %"class.boost::date_time::base_time"*
  %nsec = getelementptr inbounds %"struct.boost::xtime"* %this1, i32 0, i32 1
  %4 = load i32* %nsec, align 4
  %add = add nsw i32 %4, 500
  %div = sdiv i32 %add, 1000
  %conv4 = sext i32 %div to i64
  call void @_ZN5boost9date_time18subsecond_durationINS_10posix_time13time_durationELx1000000EEC1Ex(%"class.boost::date_time::subsecond_duration"* %ref.tmp3, i64 %conv4)
  %5 = bitcast %"class.boost::date_time::subsecond_duration"* %ref.tmp3 to %"class.boost::posix_time::time_duration"*
  call void @_ZNK5boost9date_time9base_timeINS_10posix_time5ptimeENS0_19counted_time_systemINS0_16counted_time_repINS2_33millisec_posix_time_system_configEEEEEEplERKNS2_13time_durationE(%"class.boost::posix_time::ptime"* sret %agg.result, %"class.boost::date_time::base_time"* %3, %"class.boost::posix_time::time_duration"* %5)
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

define linkonce_odr void @_ZN5boost6threadC2I14thread_adapterEET_NS_10disable_ifINS_14is_convertibleIRS3_NS_6detail13thread_move_tIS3_EEEEPNS0_5dummyEE4typeE(%"class.boost::thread"* %this, %class.thread_adapter* byval align 4 %f, %"struct.boost::thread::dummy"*) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::thread"*, align 4
  %.addr = alloca %"struct.boost::thread::dummy"*, align 4
  %agg.tmp = alloca %class.thread_adapter, align 4
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  store %"class.boost::thread"* %this, %"class.boost::thread"** %this.addr, align 4
  store %"struct.boost::thread::dummy"* %0, %"struct.boost::thread::dummy"** %.addr, align 4
  %this1 = load %"class.boost::thread"** %this.addr
  %thread_info = getelementptr inbounds %"class.boost::thread"* %this1, i32 0, i32 0
  %1 = bitcast %class.thread_adapter* %agg.tmp to i8*
  %2 = bitcast %class.thread_adapter* %f to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %1, i8* %2, i32 8, i32 4, i1 false)
  call void @_ZN5boost6thread16make_thread_infoI14thread_adapterEENS_10shared_ptrINS_6detail16thread_data_baseEEET_(%"class.boost::shared_ptr"* sret %thread_info, %class.thread_adapter* byval align 4 %agg.tmp)
  invoke void @_ZN5boost6thread12start_threadEv(%"class.boost::thread"* %this1)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %entry
  ret void

lpad:                                             ; preds = %entry
  %3 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %4 = extractvalue { i8*, i32 } %3, 0
  store i8* %4, i8** %exn.slot
  %5 = extractvalue { i8*, i32 } %3, 1
  store i32 %5, i32* %ehselector.slot
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
  %6 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          catch i8* null
  call void @_ZSt9terminatev() noreturn nounwind
  unreachable
}

define linkonce_odr void @_ZN5boost6thread16make_thread_infoI14thread_adapterEENS_10shared_ptrINS_6detail16thread_data_baseEEET_(%"class.boost::shared_ptr"* noalias sret %agg.result, %class.thread_adapter* byval align 4 %f) inlinehint align 2 {
entry:
  %call = call %"class.boost::detail::thread_data"* @_ZN5boost6detail8heap_newINS0_11thread_dataI14thread_adapterEES3_EEPT_RT0_(%class.thread_adapter* %f)
  call void @_ZN5boost10shared_ptrINS_6detail16thread_data_baseEEC1INS1_11thread_dataI14thread_adapterEEEEPT_(%"class.boost::shared_ptr"* %agg.result, %"class.boost::detail::thread_data"* %call)
  ret void
}

declare void @llvm.memcpy.p0i8.p0i8.i32(i8* nocapture, i8* nocapture, i32, i32, i1) nounwind

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

define linkonce_odr void @_ZN5boost10shared_ptrINS_6detail16thread_data_baseEEC1INS1_11thread_dataI14thread_adapterEEEEPT_(%"class.boost::shared_ptr"* %this, %"class.boost::detail::thread_data"* %p) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::shared_ptr"*, align 4
  %p.addr = alloca %"class.boost::detail::thread_data"*, align 4
  store %"class.boost::shared_ptr"* %this, %"class.boost::shared_ptr"** %this.addr, align 4
  store %"class.boost::detail::thread_data"* %p, %"class.boost::detail::thread_data"** %p.addr, align 4
  %this1 = load %"class.boost::shared_ptr"** %this.addr
  %0 = load %"class.boost::detail::thread_data"** %p.addr, align 4
  call void @_ZN5boost10shared_ptrINS_6detail16thread_data_baseEEC2INS1_11thread_dataI14thread_adapterEEEEPT_(%"class.boost::shared_ptr"* %this1, %"class.boost::detail::thread_data"* %0)
  ret void
}

define linkonce_odr %"class.boost::detail::thread_data"* @_ZN5boost6detail8heap_newINS0_11thread_dataI14thread_adapterEES3_EEPT_RT0_(%class.thread_adapter* %a1) inlinehint {
entry:
  %a1.addr = alloca %class.thread_adapter*, align 4
  store %class.thread_adapter* %a1, %class.thread_adapter** %a1.addr, align 4
  %0 = load %class.thread_adapter** %a1.addr, align 4
  %call = call %"class.boost::detail::thread_data"* @_ZN5boost6detail13heap_new_implINS0_11thread_dataI14thread_adapterEERS3_EEPT_T0_(%class.thread_adapter* %0)
  ret %"class.boost::detail::thread_data"* %call
}

define linkonce_odr %"class.boost::detail::thread_data"* @_ZN5boost6detail13heap_new_implINS0_11thread_dataI14thread_adapterEERS3_EEPT_T0_(%class.thread_adapter* %a1) inlinehint {
entry:
  %a1.addr = alloca %class.thread_adapter*, align 4
  %agg.tmp = alloca %class.thread_adapter, align 4
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  store %class.thread_adapter* %a1, %class.thread_adapter** %a1.addr, align 4
  %call = call noalias i8* @_Znwj(i32 280)
  %0 = bitcast i8* %call to %"class.boost::detail::thread_data"*
  %1 = load %class.thread_adapter** %a1.addr, align 4
  %2 = bitcast %class.thread_adapter* %agg.tmp to i8*
  %3 = bitcast %class.thread_adapter* %1 to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %2, i8* %3, i32 8, i32 4, i1 false)
  invoke void @_ZN5boost6detail11thread_dataI14thread_adapterEC1ES2_(%"class.boost::detail::thread_data"* %0, %class.thread_adapter* byval align 4 %agg.tmp)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %entry
  ret %"class.boost::detail::thread_data"* %0

lpad:                                             ; preds = %entry
  %4 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %5 = extractvalue { i8*, i32 } %4, 0
  store i8* %5, i8** %exn.slot
  %6 = extractvalue { i8*, i32 } %4, 1
  store i32 %6, i32* %ehselector.slot
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

define linkonce_odr void @_ZN5boost6detail11thread_dataI14thread_adapterEC1ES2_(%"class.boost::detail::thread_data"* %this, %class.thread_adapter* byval align 4 %f_) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::detail::thread_data"*, align 4
  store %"class.boost::detail::thread_data"* %this, %"class.boost::detail::thread_data"** %this.addr, align 4
  %this1 = load %"class.boost::detail::thread_data"** %this.addr
  call void @_ZN5boost6detail11thread_dataI14thread_adapterEC2ES2_(%"class.boost::detail::thread_data"* %this1, %class.thread_adapter* byval align 4 %f_)
  ret void
}

declare void @_ZdlPv(i8*) nounwind

define linkonce_odr void @_ZN5boost6detail11thread_dataI14thread_adapterEC2ES2_(%"class.boost::detail::thread_data"* %this, %class.thread_adapter* byval align 4 %f_) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::detail::thread_data"*, align 4
  store %"class.boost::detail::thread_data"* %this, %"class.boost::detail::thread_data"** %this.addr, align 4
  %this1 = load %"class.boost::detail::thread_data"** %this.addr
  %0 = bitcast %"class.boost::detail::thread_data"* %this1 to %"struct.boost::detail::thread_data_base"*
  call void @_ZN5boost6detail16thread_data_baseC2Ev(%"struct.boost::detail::thread_data_base"* %0)
  %1 = bitcast %"class.boost::detail::thread_data"* %this1 to i8***
  store i8** getelementptr inbounds ([5 x i8*]* @_ZTVN5boost6detail11thread_dataI14thread_adapterEE, i64 0, i64 2), i8*** %1
  %f = getelementptr inbounds %"class.boost::detail::thread_data"* %this1, i32 0, i32 1
  %2 = bitcast %class.thread_adapter* %f to i8*
  %3 = bitcast %class.thread_adapter* %f_ to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %2, i8* %3, i32 8, i32 4, i1 false)
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
  invoke void @_ZNSt6vectorISt4pairIPN5boost18condition_variableEPNS1_5mutexEESaIS6_EEC1Ev(%"class.std::vector"* %notify)
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

define linkonce_odr void @_ZN5boost6detail11thread_dataI14thread_adapterED1Ev(%"class.boost::detail::thread_data"* %this) unnamed_addr inlinehint align 2 {
entry:
  %this.addr = alloca %"class.boost::detail::thread_data"*, align 4
  store %"class.boost::detail::thread_data"* %this, %"class.boost::detail::thread_data"** %this.addr, align 4
  %this1 = load %"class.boost::detail::thread_data"** %this.addr
  call void @_ZN5boost6detail11thread_dataI14thread_adapterED2Ev(%"class.boost::detail::thread_data"* %this1)
  ret void
}

define linkonce_odr void @_ZN5boost6detail11thread_dataI14thread_adapterED0Ev(%"class.boost::detail::thread_data"* %this) unnamed_addr inlinehint align 2 {
entry:
  %this.addr = alloca %"class.boost::detail::thread_data"*, align 4
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  store %"class.boost::detail::thread_data"* %this, %"class.boost::detail::thread_data"** %this.addr, align 4
  %this1 = load %"class.boost::detail::thread_data"** %this.addr
  invoke void @_ZN5boost6detail11thread_dataI14thread_adapterED1Ev(%"class.boost::detail::thread_data"* %this1)
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

define linkonce_odr void @_ZN5boost6detail11thread_dataI14thread_adapterE3runEv(%"class.boost::detail::thread_data"* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::detail::thread_data"*, align 4
  store %"class.boost::detail::thread_data"* %this, %"class.boost::detail::thread_data"** %this.addr, align 4
  %this1 = load %"class.boost::detail::thread_data"** %this.addr
  %f = getelementptr inbounds %"class.boost::detail::thread_data"* %this1, i32 0, i32 1
  call void @_ZNK14thread_adapterclEv(%class.thread_adapter* %f)
  ret void
}

define linkonce_odr void @_ZNK14thread_adapterclEv(%class.thread_adapter* %this) align 2 {
entry:
  %this.addr = alloca %class.thread_adapter*, align 4
  store %class.thread_adapter* %this, %class.thread_adapter** %this.addr, align 4
  %this1 = load %class.thread_adapter** %this.addr
  %_func = getelementptr inbounds %class.thread_adapter* %this1, i32 0, i32 0
  %0 = load void (i8*)** %_func, align 4
  %_param = getelementptr inbounds %class.thread_adapter* %this1, i32 0, i32 1
  %1 = load i8** %_param, align 4
  call void %0(i8* %1)
  ret void
}

define linkonce_odr void @_ZN5boost6detail11thread_dataI14thread_adapterED2Ev(%"class.boost::detail::thread_data"* %this) unnamed_addr inlinehint align 2 {
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

define linkonce_odr void @_ZNSt6vectorISt4pairIPN5boost18condition_variableEPNS1_5mutexEESaIS6_EEC1Ev(%"class.std::vector"* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.std::vector"*, align 4
  store %"class.std::vector"* %this, %"class.std::vector"** %this.addr, align 4
  %this1 = load %"class.std::vector"** %this.addr
  call void @_ZNSt6vectorISt4pairIPN5boost18condition_variableEPNS1_5mutexEESaIS6_EEC2Ev(%"class.std::vector"* %this1)
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
  call void @__assert_fail(i8* getelementptr inbounds ([40 x i8]* @.str25, i32 0, i32 0), i8* getelementptr inbounds ([74 x i8]* @.str26, i32 0, i32 0), i32 52, i8* getelementptr inbounds ([49 x i8]* @__PRETTY_FUNCTION__._ZN5boost18condition_variableD2Ev, i32 0, i32 0)) noreturn nounwind
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
  call void @__assert_fail(i8* getelementptr inbounds ([5 x i8]* @.str27, i32 0, i32 0), i8* getelementptr inbounds ([74 x i8]* @.str26, i32 0, i32 0), i32 57, i8* getelementptr inbounds ([49 x i8]* @__PRETTY_FUNCTION__._ZN5boost18condition_variableD2Ev, i32 0, i32 0)) noreturn nounwind
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
  %0 = bitcast %"struct.std::_Rb_tree<const void *, std::pair<const void *const, boost::detail::tss_data_node>, std::_Select1st<std::pair<const void *const, boost::detail::tss_data_node> >, std::less<const void *>, std::allocator<std::pair<const void *const, boost::detail::tss_data_node> > >::_Rb_tree_impl"* %this1 to %"class.std::allocator.16"*
  call void @_ZNSaISt13_Rb_tree_nodeISt4pairIKPKvN5boost6detail13tss_data_nodeEEEED2Ev(%"class.std::allocator.16"* %0) nounwind
  ret void
}

define linkonce_odr void @_ZNSaISt13_Rb_tree_nodeISt4pairIKPKvN5boost6detail13tss_data_nodeEEEED2Ev(%"class.std::allocator.16"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.std::allocator.16"*, align 4
  store %"class.std::allocator.16"* %this, %"class.std::allocator.16"** %this.addr, align 4
  %this1 = load %"class.std::allocator.16"** %this.addr
  %0 = bitcast %"class.std::allocator.16"* %this1 to %"class.__gnu_cxx::new_allocator.17"*
  call void @_ZN9__gnu_cxx13new_allocatorISt13_Rb_tree_nodeISt4pairIKPKvN5boost6detail13tss_data_nodeEEEED2Ev(%"class.__gnu_cxx::new_allocator.17"* %0) nounwind
  ret void
}

define linkonce_odr void @_ZN9__gnu_cxx13new_allocatorISt13_Rb_tree_nodeISt4pairIKPKvN5boost6detail13tss_data_nodeEEEED2Ev(%"class.__gnu_cxx::new_allocator.17"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.__gnu_cxx::new_allocator.17"*, align 4
  store %"class.__gnu_cxx::new_allocator.17"* %this, %"class.__gnu_cxx::new_allocator.17"** %this.addr, align 4
  %this1 = load %"class.__gnu_cxx::new_allocator.17"** %this.addr
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
  %temp.lvalue = alloca %"class.std::allocator.24", align 1
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  store %"class.std::_Rb_tree"* %this, %"class.std::_Rb_tree"** %this.addr, align 4
  store %"struct.std::_Rb_tree_node"* %__p, %"struct.std::_Rb_tree_node"** %__p.addr, align 4
  %this1 = load %"class.std::_Rb_tree"** %this.addr
  call void @_ZNKSt8_Rb_treeIPKvSt4pairIKS1_N5boost6detail13tss_data_nodeEESt10_Select1stIS7_ESt4lessIS1_ESaIS7_EE13get_allocatorEv(%"class.std::allocator.24"* sret %temp.lvalue, %"class.std::_Rb_tree"* %this1)
  %0 = bitcast %"class.std::allocator.24"* %temp.lvalue to %"class.__gnu_cxx::new_allocator.25"*
  %1 = load %"struct.std::_Rb_tree_node"** %__p.addr, align 4
  %_M_value_field = getelementptr inbounds %"struct.std::_Rb_tree_node"* %1, i32 0, i32 1
  %call = invoke %"struct.std::pair.22"* @_ZSt11__addressofISt4pairIKPKvN5boost6detail13tss_data_nodeEEEPT_RS8_(%"struct.std::pair.22"* %_M_value_field)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %entry
  invoke void @_ZN9__gnu_cxx13new_allocatorISt4pairIKPKvN5boost6detail13tss_data_nodeEEE7destroyEPS8_(%"class.__gnu_cxx::new_allocator.25"* %0, %"struct.std::pair.22"* %call)
          to label %invoke.cont2 unwind label %lpad

invoke.cont2:                                     ; preds = %invoke.cont
  call void @_ZNSaISt4pairIKPKvN5boost6detail13tss_data_nodeEEED1Ev(%"class.std::allocator.24"* %temp.lvalue) nounwind
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
  call void @_ZNSaISt4pairIKPKvN5boost6detail13tss_data_nodeEEED1Ev(%"class.std::allocator.24"* %temp.lvalue) nounwind
  br label %eh.resume

eh.resume:                                        ; preds = %lpad
  %exn = load i8** %exn.slot
  %sel = load i32* %ehselector.slot
  %lpad.val = insertvalue { i8*, i32 } undef, i8* %exn, 0
  %lpad.val3 = insertvalue { i8*, i32 } %lpad.val, i32 %sel, 1
  resume { i8*, i32 } %lpad.val3
}

define linkonce_odr void @_ZNKSt8_Rb_treeIPKvSt4pairIKS1_N5boost6detail13tss_data_nodeEESt10_Select1stIS7_ESt4lessIS1_ESaIS7_EE13get_allocatorEv(%"class.std::allocator.24"* noalias sret %agg.result, %"class.std::_Rb_tree"* %this) align 2 {
entry:
  %this.addr = alloca %"class.std::_Rb_tree"*, align 4
  store %"class.std::_Rb_tree"* %this, %"class.std::_Rb_tree"** %this.addr, align 4
  %this1 = load %"class.std::_Rb_tree"** %this.addr
  %call = call %"class.std::allocator.16"* @_ZNKSt8_Rb_treeIPKvSt4pairIKS1_N5boost6detail13tss_data_nodeEESt10_Select1stIS7_ESt4lessIS1_ESaIS7_EE21_M_get_Node_allocatorEv(%"class.std::_Rb_tree"* %this1)
  call void @_ZNSaISt4pairIKPKvN5boost6detail13tss_data_nodeEEEC1ISt13_Rb_tree_nodeIS6_EEERKSaIT_E(%"class.std::allocator.24"* %agg.result, %"class.std::allocator.16"* %call) nounwind
  ret void
}

define linkonce_odr void @_ZN9__gnu_cxx13new_allocatorISt4pairIKPKvN5boost6detail13tss_data_nodeEEE7destroyEPS8_(%"class.__gnu_cxx::new_allocator.25"* %this, %"struct.std::pair.22"* %__p) align 2 {
entry:
  %this.addr = alloca %"class.__gnu_cxx::new_allocator.25"*, align 4
  %__p.addr = alloca %"struct.std::pair.22"*, align 4
  store %"class.__gnu_cxx::new_allocator.25"* %this, %"class.__gnu_cxx::new_allocator.25"** %this.addr, align 4
  store %"struct.std::pair.22"* %__p, %"struct.std::pair.22"** %__p.addr, align 4
  %this1 = load %"class.__gnu_cxx::new_allocator.25"** %this.addr
  %0 = load %"struct.std::pair.22"** %__p.addr, align 4
  call void @_ZNSt4pairIKPKvN5boost6detail13tss_data_nodeEED1Ev(%"struct.std::pair.22"* %0)
  ret void
}

define linkonce_odr %"struct.std::pair.22"* @_ZSt11__addressofISt4pairIKPKvN5boost6detail13tss_data_nodeEEEPT_RS8_(%"struct.std::pair.22"* %__r) nounwind inlinehint {
entry:
  %__r.addr = alloca %"struct.std::pair.22"*, align 4
  store %"struct.std::pair.22"* %__r, %"struct.std::pair.22"** %__r.addr, align 4
  %0 = load %"struct.std::pair.22"** %__r.addr, align 4
  %1 = bitcast %"struct.std::pair.22"* %0 to i8*
  %2 = bitcast i8* %1 to %"struct.std::pair.22"*
  ret %"struct.std::pair.22"* %2
}

define linkonce_odr void @_ZNSaISt4pairIKPKvN5boost6detail13tss_data_nodeEEED1Ev(%"class.std::allocator.24"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.std::allocator.24"*, align 4
  store %"class.std::allocator.24"* %this, %"class.std::allocator.24"** %this.addr, align 4
  %this1 = load %"class.std::allocator.24"** %this.addr
  call void @_ZNSaISt4pairIKPKvN5boost6detail13tss_data_nodeEEED2Ev(%"class.std::allocator.24"* %this1) nounwind
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
  %0 = bitcast %"struct.std::_Rb_tree<const void *, std::pair<const void *const, boost::detail::tss_data_node>, std::_Select1st<std::pair<const void *const, boost::detail::tss_data_node> >, std::less<const void *>, std::allocator<std::pair<const void *const, boost::detail::tss_data_node> > >::_Rb_tree_impl"* %_M_impl to %"class.std::allocator.16"*
  %1 = bitcast %"class.std::allocator.16"* %0 to %"class.__gnu_cxx::new_allocator.17"*
  %2 = load %"struct.std::_Rb_tree_node"** %__p.addr, align 4
  call void @_ZN9__gnu_cxx13new_allocatorISt13_Rb_tree_nodeISt4pairIKPKvN5boost6detail13tss_data_nodeEEEE10deallocateEPSA_j(%"class.__gnu_cxx::new_allocator.17"* %1, %"struct.std::_Rb_tree_node"* %2, i32 1)
  ret void
}

define linkonce_odr void @_ZN9__gnu_cxx13new_allocatorISt13_Rb_tree_nodeISt4pairIKPKvN5boost6detail13tss_data_nodeEEEE10deallocateEPSA_j(%"class.__gnu_cxx::new_allocator.17"* %this, %"struct.std::_Rb_tree_node"* %__p, i32) nounwind align 2 {
entry:
  %this.addr = alloca %"class.__gnu_cxx::new_allocator.17"*, align 4
  %__p.addr = alloca %"struct.std::_Rb_tree_node"*, align 4
  %.addr = alloca i32, align 4
  store %"class.__gnu_cxx::new_allocator.17"* %this, %"class.__gnu_cxx::new_allocator.17"** %this.addr, align 4
  store %"struct.std::_Rb_tree_node"* %__p, %"struct.std::_Rb_tree_node"** %__p.addr, align 4
  store i32 %0, i32* %.addr, align 4
  %this1 = load %"class.__gnu_cxx::new_allocator.17"** %this.addr
  %1 = load %"struct.std::_Rb_tree_node"** %__p.addr, align 4
  %2 = bitcast %"struct.std::_Rb_tree_node"* %1 to i8*
  call void @_ZdlPv(i8* %2) nounwind
  ret void
}

define linkonce_odr void @_ZNSaISt4pairIKPKvN5boost6detail13tss_data_nodeEEED2Ev(%"class.std::allocator.24"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.std::allocator.24"*, align 4
  store %"class.std::allocator.24"* %this, %"class.std::allocator.24"** %this.addr, align 4
  %this1 = load %"class.std::allocator.24"** %this.addr
  %0 = bitcast %"class.std::allocator.24"* %this1 to %"class.__gnu_cxx::new_allocator.25"*
  call void @_ZN9__gnu_cxx13new_allocatorISt4pairIKPKvN5boost6detail13tss_data_nodeEEED2Ev(%"class.__gnu_cxx::new_allocator.25"* %0) nounwind
  ret void
}

define linkonce_odr void @_ZN9__gnu_cxx13new_allocatorISt4pairIKPKvN5boost6detail13tss_data_nodeEEED2Ev(%"class.__gnu_cxx::new_allocator.25"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.__gnu_cxx::new_allocator.25"*, align 4
  store %"class.__gnu_cxx::new_allocator.25"* %this, %"class.__gnu_cxx::new_allocator.25"** %this.addr, align 4
  %this1 = load %"class.__gnu_cxx::new_allocator.25"** %this.addr
  ret void
}

define linkonce_odr void @_ZNSt4pairIKPKvN5boost6detail13tss_data_nodeEED1Ev(%"struct.std::pair.22"* %this) unnamed_addr inlinehint align 2 {
entry:
  %this.addr = alloca %"struct.std::pair.22"*, align 4
  store %"struct.std::pair.22"* %this, %"struct.std::pair.22"** %this.addr, align 4
  %this1 = load %"struct.std::pair.22"** %this.addr
  call void @_ZNSt4pairIKPKvN5boost6detail13tss_data_nodeEED2Ev(%"struct.std::pair.22"* %this1)
  ret void
}

define linkonce_odr void @_ZNSt4pairIKPKvN5boost6detail13tss_data_nodeEED2Ev(%"struct.std::pair.22"* %this) unnamed_addr inlinehint align 2 {
entry:
  %this.addr = alloca %"struct.std::pair.22"*, align 4
  store %"struct.std::pair.22"* %this, %"struct.std::pair.22"** %this.addr, align 4
  %this1 = load %"struct.std::pair.22"** %this.addr
  %second = getelementptr inbounds %"struct.std::pair.22"* %this1, i32 0, i32 1
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
  call void @_ZN5boost10shared_ptrINS_6detail20tss_cleanup_functionEED1Ev(%"class.boost::shared_ptr.23"* %func)
  ret void
}

define linkonce_odr void @_ZN5boost10shared_ptrINS_6detail20tss_cleanup_functionEED1Ev(%"class.boost::shared_ptr.23"* %this) unnamed_addr inlinehint align 2 {
entry:
  %this.addr = alloca %"class.boost::shared_ptr.23"*, align 4
  store %"class.boost::shared_ptr.23"* %this, %"class.boost::shared_ptr.23"** %this.addr, align 4
  %this1 = load %"class.boost::shared_ptr.23"** %this.addr
  call void @_ZN5boost10shared_ptrINS_6detail20tss_cleanup_functionEED2Ev(%"class.boost::shared_ptr.23"* %this1)
  ret void
}

define linkonce_odr void @_ZN5boost10shared_ptrINS_6detail20tss_cleanup_functionEED2Ev(%"class.boost::shared_ptr.23"* %this) unnamed_addr inlinehint align 2 {
entry:
  %this.addr = alloca %"class.boost::shared_ptr.23"*, align 4
  store %"class.boost::shared_ptr.23"* %this, %"class.boost::shared_ptr.23"** %this.addr, align 4
  %this1 = load %"class.boost::shared_ptr.23"** %this.addr
  %pn = getelementptr inbounds %"class.boost::shared_ptr.23"* %this1, i32 0, i32 1
  call void @_ZN5boost6detail12shared_countD1Ev(%"class.boost::detail::shared_count"* %pn)
  ret void
}

define linkonce_odr void @_ZNSaISt4pairIKPKvN5boost6detail13tss_data_nodeEEEC1ISt13_Rb_tree_nodeIS6_EEERKSaIT_E(%"class.std::allocator.24"* %this, %"class.std::allocator.16"*) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.std::allocator.24"*, align 4
  %.addr = alloca %"class.std::allocator.16"*, align 4
  store %"class.std::allocator.24"* %this, %"class.std::allocator.24"** %this.addr, align 4
  store %"class.std::allocator.16"* %0, %"class.std::allocator.16"** %.addr, align 4
  %this1 = load %"class.std::allocator.24"** %this.addr
  %1 = load %"class.std::allocator.16"** %.addr
  call void @_ZNSaISt4pairIKPKvN5boost6detail13tss_data_nodeEEEC2ISt13_Rb_tree_nodeIS6_EEERKSaIT_E(%"class.std::allocator.24"* %this1, %"class.std::allocator.16"* %1) nounwind
  ret void
}

define linkonce_odr %"class.std::allocator.16"* @_ZNKSt8_Rb_treeIPKvSt4pairIKS1_N5boost6detail13tss_data_nodeEESt10_Select1stIS7_ESt4lessIS1_ESaIS7_EE21_M_get_Node_allocatorEv(%"class.std::_Rb_tree"* %this) nounwind align 2 {
entry:
  %this.addr = alloca %"class.std::_Rb_tree"*, align 4
  store %"class.std::_Rb_tree"* %this, %"class.std::_Rb_tree"** %this.addr, align 4
  %this1 = load %"class.std::_Rb_tree"** %this.addr
  %_M_impl = getelementptr inbounds %"class.std::_Rb_tree"* %this1, i32 0, i32 0
  %0 = bitcast %"struct.std::_Rb_tree<const void *, std::pair<const void *const, boost::detail::tss_data_node>, std::_Select1st<std::pair<const void *const, boost::detail::tss_data_node> >, std::less<const void *>, std::allocator<std::pair<const void *const, boost::detail::tss_data_node> > >::_Rb_tree_impl"* %_M_impl to %"class.std::allocator.16"*
  ret %"class.std::allocator.16"* %0
}

define linkonce_odr void @_ZNSaISt4pairIKPKvN5boost6detail13tss_data_nodeEEEC2ISt13_Rb_tree_nodeIS6_EEERKSaIT_E(%"class.std::allocator.24"* %this, %"class.std::allocator.16"*) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.std::allocator.24"*, align 4
  %.addr = alloca %"class.std::allocator.16"*, align 4
  store %"class.std::allocator.24"* %this, %"class.std::allocator.24"** %this.addr, align 4
  store %"class.std::allocator.16"* %0, %"class.std::allocator.16"** %.addr, align 4
  %this1 = load %"class.std::allocator.24"** %this.addr
  %1 = bitcast %"class.std::allocator.24"* %this1 to %"class.__gnu_cxx::new_allocator.25"*
  call void @_ZN9__gnu_cxx13new_allocatorISt4pairIKPKvN5boost6detail13tss_data_nodeEEEC2Ev(%"class.__gnu_cxx::new_allocator.25"* %1) nounwind
  ret void
}

define linkonce_odr void @_ZN9__gnu_cxx13new_allocatorISt4pairIKPKvN5boost6detail13tss_data_nodeEEEC2Ev(%"class.__gnu_cxx::new_allocator.25"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.__gnu_cxx::new_allocator.25"*, align 4
  store %"class.__gnu_cxx::new_allocator.25"* %this, %"class.__gnu_cxx::new_allocator.25"** %this.addr, align 4
  %this1 = load %"class.__gnu_cxx::new_allocator.25"** %this.addr
  ret void
}

define linkonce_odr void @_ZNSt6vectorISt4pairIPN5boost18condition_variableEPNS1_5mutexEESaIS6_EEC2Ev(%"class.std::vector"* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.std::vector"*, align 4
  store %"class.std::vector"* %this, %"class.std::vector"** %this.addr, align 4
  %this1 = load %"class.std::vector"** %this.addr
  %0 = bitcast %"class.std::vector"* %this1 to %"struct.std::_Vector_base"*
  call void @_ZNSt12_Vector_baseISt4pairIPN5boost18condition_variableEPNS1_5mutexEESaIS6_EEC2Ev(%"struct.std::_Vector_base"* %0)
  ret void
}

define linkonce_odr void @_ZNSt12_Vector_baseISt4pairIPN5boost18condition_variableEPNS1_5mutexEESaIS6_EEC2Ev(%"struct.std::_Vector_base"* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"struct.std::_Vector_base"*, align 4
  store %"struct.std::_Vector_base"* %this, %"struct.std::_Vector_base"** %this.addr, align 4
  %this1 = load %"struct.std::_Vector_base"** %this.addr
  %_M_impl = getelementptr inbounds %"struct.std::_Vector_base"* %this1, i32 0, i32 0
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
  %0 = bitcast %"struct.std::_Vector_base<std::pair<boost::condition_variable *, boost::mutex *>, std::allocator<std::pair<boost::condition_variable *, boost::mutex *> > >::_Vector_impl"* %this1 to %"class.std::allocator.19"*
  call void @_ZNSaISt4pairIPN5boost18condition_variableEPNS0_5mutexEEEC2Ev(%"class.std::allocator.19"* %0) nounwind
  %_M_start = getelementptr inbounds %"struct.std::_Vector_base<std::pair<boost::condition_variable *, boost::mutex *>, std::allocator<std::pair<boost::condition_variable *, boost::mutex *> > >::_Vector_impl"* %this1, i32 0, i32 0
  store %"struct.std::pair"* null, %"struct.std::pair"** %_M_start, align 4
  %_M_finish = getelementptr inbounds %"struct.std::_Vector_base<std::pair<boost::condition_variable *, boost::mutex *>, std::allocator<std::pair<boost::condition_variable *, boost::mutex *> > >::_Vector_impl"* %this1, i32 0, i32 1
  store %"struct.std::pair"* null, %"struct.std::pair"** %_M_finish, align 4
  %_M_end_of_storage = getelementptr inbounds %"struct.std::_Vector_base<std::pair<boost::condition_variable *, boost::mutex *>, std::allocator<std::pair<boost::condition_variable *, boost::mutex *> > >::_Vector_impl"* %this1, i32 0, i32 2
  store %"struct.std::pair"* null, %"struct.std::pair"** %_M_end_of_storage, align 4
  ret void
}

define linkonce_odr void @_ZNSaISt4pairIPN5boost18condition_variableEPNS0_5mutexEEEC2Ev(%"class.std::allocator.19"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.std::allocator.19"*, align 4
  store %"class.std::allocator.19"* %this, %"class.std::allocator.19"** %this.addr, align 4
  %this1 = load %"class.std::allocator.19"** %this.addr
  %0 = bitcast %"class.std::allocator.19"* %this1 to %"class.__gnu_cxx::new_allocator.20"*
  call void @_ZN9__gnu_cxx13new_allocatorISt4pairIPN5boost18condition_variableEPNS2_5mutexEEEC2Ev(%"class.__gnu_cxx::new_allocator.20"* %0) nounwind
  ret void
}

define linkonce_odr void @_ZN9__gnu_cxx13new_allocatorISt4pairIPN5boost18condition_variableEPNS2_5mutexEEEC2Ev(%"class.__gnu_cxx::new_allocator.20"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.__gnu_cxx::new_allocator.20"*, align 4
  store %"class.__gnu_cxx::new_allocator.20"* %this, %"class.__gnu_cxx::new_allocator.20"** %this.addr, align 4
  %this1 = load %"class.__gnu_cxx::new_allocator.20"** %this.addr
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
  %0 = bitcast %"struct.std::_Rb_tree<const void *, std::pair<const void *const, boost::detail::tss_data_node>, std::_Select1st<std::pair<const void *const, boost::detail::tss_data_node> >, std::less<const void *>, std::allocator<std::pair<const void *const, boost::detail::tss_data_node> > >::_Rb_tree_impl"* %this1 to %"class.std::allocator.16"*
  call void @_ZNSaISt13_Rb_tree_nodeISt4pairIKPKvN5boost6detail13tss_data_nodeEEEEC2Ev(%"class.std::allocator.16"* %0) nounwind
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
  %5 = bitcast %"struct.std::_Rb_tree<const void *, std::pair<const void *const, boost::detail::tss_data_node>, std::_Select1st<std::pair<const void *const, boost::detail::tss_data_node> >, std::less<const void *>, std::allocator<std::pair<const void *const, boost::detail::tss_data_node> > >::_Rb_tree_impl"* %this1 to %"class.std::allocator.16"*
  call void @_ZNSaISt13_Rb_tree_nodeISt4pairIKPKvN5boost6detail13tss_data_nodeEEEED2Ev(%"class.std::allocator.16"* %5) nounwind
  br label %eh.resume

eh.resume:                                        ; preds = %lpad
  %exn = load i8** %exn.slot
  %sel = load i32* %ehselector.slot
  %lpad.val = insertvalue { i8*, i32 } undef, i8* %exn, 0
  %lpad.val2 = insertvalue { i8*, i32 } %lpad.val, i32 %sel, 1
  resume { i8*, i32 } %lpad.val2
}

define linkonce_odr void @_ZNSaISt13_Rb_tree_nodeISt4pairIKPKvN5boost6detail13tss_data_nodeEEEEC2Ev(%"class.std::allocator.16"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.std::allocator.16"*, align 4
  store %"class.std::allocator.16"* %this, %"class.std::allocator.16"** %this.addr, align 4
  %this1 = load %"class.std::allocator.16"** %this.addr
  %0 = bitcast %"class.std::allocator.16"* %this1 to %"class.__gnu_cxx::new_allocator.17"*
  call void @_ZN9__gnu_cxx13new_allocatorISt13_Rb_tree_nodeISt4pairIKPKvN5boost6detail13tss_data_nodeEEEEC2Ev(%"class.__gnu_cxx::new_allocator.17"* %0) nounwind
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

define linkonce_odr void @_ZN9__gnu_cxx13new_allocatorISt13_Rb_tree_nodeISt4pairIKPKvN5boost6detail13tss_data_nodeEEEEC2Ev(%"class.__gnu_cxx::new_allocator.17"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.__gnu_cxx::new_allocator.17"*, align 4
  store %"class.__gnu_cxx::new_allocator.17"* %this, %"class.__gnu_cxx::new_allocator.17"** %this.addr, align 4
  %this1 = load %"class.__gnu_cxx::new_allocator.17"** %this.addr
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
  call void @_ZN5boost21thread_resource_errorC1EiPKc(%"class.boost::thread_resource_error"* %ref.tmp, i32 %1, i8* getelementptr inbounds ([68 x i8]* @.str28, i32 0, i32 0))
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
  call void @__assert_fail(i8* getelementptr inbounds ([40 x i8]* @.str25, i32 0, i32 0), i8* getelementptr inbounds ([74 x i8]* @.str26, i32 0, i32 0), i32 46, i8* getelementptr inbounds ([48 x i8]* @__PRETTY_FUNCTION__._ZN5boost18condition_variableC2Ev, i32 0, i32 0)) noreturn nounwind
  unreachable
                                                  ; No predecessors!
  br label %cond.end

cond.end:                                         ; preds = %6, %cond.true
  %7 = load i32* %res2, align 4
  call void @_ZN5boost21thread_resource_errorC1EiPKc(%"class.boost::thread_resource_error"* %ref.tmp10, i32 %7, i8* getelementptr inbounds ([67 x i8]* @.str29, i32 0, i32 0))
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

declare void @_ZNSsC1Ev(%"class.std::basic_string"*)

define linkonce_odr void @_ZN5boost36throw_exception_assert_compatibilityERKSt9exception(%"class.std::exception"*) nounwind inlinehint {
entry:
  %.addr = alloca %"class.std::exception"*, align 4
  store %"class.std::exception"* %0, %"class.std::exception"** %.addr, align 4
  ret void
}

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

define linkonce_odr void @_ZN5boost10shared_ptrINS_6detail16thread_data_baseEEC2INS1_11thread_dataI14thread_adapterEEEEPT_(%"class.boost::shared_ptr"* %this, %"class.boost::detail::thread_data"* %p) unnamed_addr align 2 {
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
  call void @_ZN5boost6detail12shared_countC1INS0_11thread_dataI14thread_adapterEEEEPT_(%"class.boost::detail::shared_count"* %pn, %"class.boost::detail::thread_data"* %2)
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
  invoke void @_ZN5boost6detail26sp_enable_shared_from_thisINS0_16thread_data_baseENS0_11thread_dataI14thread_adapterEES2_EEvPKNS_10shared_ptrIT_EEPKT0_PKNS_23enable_shared_from_thisIT1_EE(%"class.boost::shared_ptr"* %this1, %"class.boost::detail::thread_data"* %3, %"class.boost::enable_shared_from_this"* %cast.result)
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

define linkonce_odr void @_ZN5boost6detail12shared_countC1INS0_11thread_dataI14thread_adapterEEEEPT_(%"class.boost::detail::shared_count"* %this, %"class.boost::detail::thread_data"* %p) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::detail::shared_count"*, align 4
  %p.addr = alloca %"class.boost::detail::thread_data"*, align 4
  store %"class.boost::detail::shared_count"* %this, %"class.boost::detail::shared_count"** %this.addr, align 4
  store %"class.boost::detail::thread_data"* %p, %"class.boost::detail::thread_data"** %p.addr, align 4
  %this1 = load %"class.boost::detail::shared_count"** %this.addr
  %0 = load %"class.boost::detail::thread_data"** %p.addr, align 4
  call void @_ZN5boost6detail12shared_countC2INS0_11thread_dataI14thread_adapterEEEEPT_(%"class.boost::detail::shared_count"* %this1, %"class.boost::detail::thread_data"* %0)
  ret void
}

define linkonce_odr void @_ZN5boost6detail26sp_enable_shared_from_thisINS0_16thread_data_baseENS0_11thread_dataI14thread_adapterEES2_EEvPKNS_10shared_ptrIT_EEPKT0_PKNS_23enable_shared_from_thisIT1_EE(%"class.boost::shared_ptr"* %ppx, %"class.boost::detail::thread_data"* %py, %"class.boost::enable_shared_from_this"* %pe) inlinehint {
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
  call void @_ZNK5boost23enable_shared_from_thisINS_6detail16thread_data_baseEE22_internal_accept_ownerIS2_NS1_11thread_dataI14thread_adapterEEEEvPKNS_10shared_ptrIT_EEPT0_(%"class.boost::enable_shared_from_this"* %1, %"class.boost::shared_ptr"* %2, %"class.boost::detail::thread_data"* %3)
  br label %if.end

if.end:                                           ; preds = %if.then, %entry
  ret void
}

define linkonce_odr void @_ZNK5boost23enable_shared_from_thisINS_6detail16thread_data_baseEE22_internal_accept_ownerIS2_NS1_11thread_dataI14thread_adapterEEEEvPKNS_10shared_ptrIT_EEPT0_(%"class.boost::enable_shared_from_this"* %this, %"class.boost::shared_ptr"* %ppx, %"class.boost::detail::thread_data"* %py) align 2 {
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

define linkonce_odr void @_ZN5boost6detail12shared_countC2INS0_11thread_dataI14thread_adapterEEEEPT_(%"class.boost::detail::shared_count"* %this, %"class.boost::detail::thread_data"* %p) unnamed_addr align 2 {
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
  invoke void @_ZN5boost6detail17sp_counted_impl_pINS0_11thread_dataI14thread_adapterEEEC1EPS4_(%"class.boost::detail::sp_counted_impl_p"* %0, %"class.boost::detail::thread_data"* %1)
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
  invoke void @_ZN5boost14checked_deleteINS_6detail11thread_dataI14thread_adapterEEEEvPT_(%"class.boost::detail::thread_data"* %10)
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

define linkonce_odr void @_ZN5boost6detail17sp_counted_impl_pINS0_11thread_dataI14thread_adapterEEEC1EPS4_(%"class.boost::detail::sp_counted_impl_p"* %this, %"class.boost::detail::thread_data"* %px) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::detail::sp_counted_impl_p"*, align 4
  %px.addr = alloca %"class.boost::detail::thread_data"*, align 4
  store %"class.boost::detail::sp_counted_impl_p"* %this, %"class.boost::detail::sp_counted_impl_p"** %this.addr, align 4
  store %"class.boost::detail::thread_data"* %px, %"class.boost::detail::thread_data"** %px.addr, align 4
  %this1 = load %"class.boost::detail::sp_counted_impl_p"** %this.addr
  %0 = load %"class.boost::detail::thread_data"** %px.addr, align 4
  call void @_ZN5boost6detail17sp_counted_impl_pINS0_11thread_dataI14thread_adapterEEEC2EPS4_(%"class.boost::detail::sp_counted_impl_p"* %this1, %"class.boost::detail::thread_data"* %0)
  ret void
}

define linkonce_odr void @_ZN5boost14checked_deleteINS_6detail11thread_dataI14thread_adapterEEEEvPT_(%"class.boost::detail::thread_data"* %x) inlinehint {
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

define linkonce_odr void @_ZN5boost6detail17sp_counted_impl_pINS0_11thread_dataI14thread_adapterEEEC2EPS4_(%"class.boost::detail::sp_counted_impl_p"* %this, %"class.boost::detail::thread_data"* %px) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::detail::sp_counted_impl_p"*, align 4
  %px.addr = alloca %"class.boost::detail::thread_data"*, align 4
  store %"class.boost::detail::sp_counted_impl_p"* %this, %"class.boost::detail::sp_counted_impl_p"** %this.addr, align 4
  store %"class.boost::detail::thread_data"* %px, %"class.boost::detail::thread_data"** %px.addr, align 4
  %this1 = load %"class.boost::detail::sp_counted_impl_p"** %this.addr
  %0 = bitcast %"class.boost::detail::sp_counted_impl_p"* %this1 to %"class.boost::detail::sp_counted_base"*
  call void @_ZN5boost6detail15sp_counted_baseC2Ev(%"class.boost::detail::sp_counted_base"* %0)
  %1 = bitcast %"class.boost::detail::sp_counted_impl_p"* %this1 to i8***
  store i8** getelementptr inbounds ([7 x i8*]* @_ZTVN5boost6detail17sp_counted_impl_pINS0_11thread_dataI14thread_adapterEEEE, i64 0, i64 2), i8*** %1
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

define linkonce_odr void @_ZN5boost6detail17sp_counted_impl_pINS0_11thread_dataI14thread_adapterEEED1Ev(%"class.boost::detail::sp_counted_impl_p"* %this) unnamed_addr inlinehint align 2 {
entry:
  %this.addr = alloca %"class.boost::detail::sp_counted_impl_p"*, align 4
  store %"class.boost::detail::sp_counted_impl_p"* %this, %"class.boost::detail::sp_counted_impl_p"** %this.addr, align 4
  %this1 = load %"class.boost::detail::sp_counted_impl_p"** %this.addr
  call void @_ZN5boost6detail17sp_counted_impl_pINS0_11thread_dataI14thread_adapterEEED2Ev(%"class.boost::detail::sp_counted_impl_p"* %this1)
  ret void
}

define linkonce_odr void @_ZN5boost6detail17sp_counted_impl_pINS0_11thread_dataI14thread_adapterEEED0Ev(%"class.boost::detail::sp_counted_impl_p"* %this) unnamed_addr inlinehint align 2 {
entry:
  %this.addr = alloca %"class.boost::detail::sp_counted_impl_p"*, align 4
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  store %"class.boost::detail::sp_counted_impl_p"* %this, %"class.boost::detail::sp_counted_impl_p"** %this.addr, align 4
  %this1 = load %"class.boost::detail::sp_counted_impl_p"** %this.addr
  invoke void @_ZN5boost6detail17sp_counted_impl_pINS0_11thread_dataI14thread_adapterEEED1Ev(%"class.boost::detail::sp_counted_impl_p"* %this1)
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

define linkonce_odr void @_ZN5boost6detail17sp_counted_impl_pINS0_11thread_dataI14thread_adapterEEE7disposeEv(%"class.boost::detail::sp_counted_impl_p"* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::detail::sp_counted_impl_p"*, align 4
  store %"class.boost::detail::sp_counted_impl_p"* %this, %"class.boost::detail::sp_counted_impl_p"** %this.addr, align 4
  %this1 = load %"class.boost::detail::sp_counted_impl_p"** %this.addr
  %px_ = getelementptr inbounds %"class.boost::detail::sp_counted_impl_p"* %this1, i32 0, i32 1
  %0 = load %"class.boost::detail::thread_data"** %px_, align 4
  call void @_ZN5boost14checked_deleteINS_6detail11thread_dataI14thread_adapterEEEEvPT_(%"class.boost::detail::thread_data"* %0)
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

define linkonce_odr i8* @_ZN5boost6detail17sp_counted_impl_pINS0_11thread_dataI14thread_adapterEEE11get_deleterERKSt9type_info(%"class.boost::detail::sp_counted_impl_p"* %this, %"class.std::type_info"*) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::detail::sp_counted_impl_p"*, align 4
  %.addr = alloca %"class.std::type_info"*, align 4
  store %"class.boost::detail::sp_counted_impl_p"* %this, %"class.boost::detail::sp_counted_impl_p"** %this.addr, align 4
  store %"class.std::type_info"* %0, %"class.std::type_info"** %.addr, align 4
  %this1 = load %"class.boost::detail::sp_counted_impl_p"** %this.addr
  ret i8* null
}

define linkonce_odr void @_ZN5boost6detail17sp_counted_impl_pINS0_11thread_dataI14thread_adapterEEED2Ev(%"class.boost::detail::sp_counted_impl_p"* %this) unnamed_addr inlinehint align 2 {
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
  %ref.tmp = alloca %"struct.boost::exception_detail::error_info_injector.28", align 4
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  %cleanup.isactive = alloca i1
  store %"class.boost::condition_error"* %e, %"class.boost::condition_error"** %e.addr, align 4
  %0 = load %"class.boost::condition_error"** %e.addr, align 4
  %1 = bitcast %"class.boost::condition_error"* %0 to %"class.std::exception"*
  call void @_ZN5boost36throw_exception_assert_compatibilityERKSt9exception(%"class.std::exception"* %1)
  %exception = call i8* @__cxa_allocate_exception(i32 44) nounwind
  store i1 true, i1* %cleanup.isactive
  %2 = bitcast i8* %exception to %"class.boost::exception_detail::clone_impl.27"*
  %3 = load %"class.boost::condition_error"** %e.addr, align 4
  invoke void @_ZN5boost17enable_error_infoINS_15condition_errorEEENS_16exception_detail29enable_error_info_return_typeIT_E4typeERKS4_(%"struct.boost::exception_detail::error_info_injector.28"* sret %ref.tmp, %"class.boost::condition_error"* %3)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %entry
  invoke void @_ZN5boost24enable_current_exceptionINS_16exception_detail19error_info_injectorINS_15condition_errorEEEEENS1_10clone_implIT_EERKS6_(%"class.boost::exception_detail::clone_impl.27"* sret %2, %"struct.boost::exception_detail::error_info_injector.28"* %ref.tmp)
          to label %invoke.cont2 unwind label %lpad1

invoke.cont2:                                     ; preds = %invoke.cont
  store i1 false, i1* %cleanup.isactive
  invoke void @__cxa_throw(i8* %exception, i8* bitcast ({ i8*, i8*, i32, i32, i8*, i32, i8*, i32 }* @_ZTIN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_15condition_errorEEEEE to i8*), i8* bitcast (void (%"class.boost::exception_detail::clone_impl.27"*)* @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_15condition_errorEEEED1Ev to i8*)) noreturn
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
  call void @_ZN5boost16exception_detail19error_info_injectorINS_15condition_errorEED1Ev(%"struct.boost::exception_detail::error_info_injector.28"* %ref.tmp) nounwind
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

define linkonce_odr void @_ZN5boost24enable_current_exceptionINS_16exception_detail19error_info_injectorINS_15condition_errorEEEEENS1_10clone_implIT_EERKS6_(%"class.boost::exception_detail::clone_impl.27"* noalias sret %agg.result, %"struct.boost::exception_detail::error_info_injector.28"* %x) inlinehint {
entry:
  %x.addr = alloca %"struct.boost::exception_detail::error_info_injector.28"*, align 4
  store %"struct.boost::exception_detail::error_info_injector.28"* %x, %"struct.boost::exception_detail::error_info_injector.28"** %x.addr, align 4
  %0 = load %"struct.boost::exception_detail::error_info_injector.28"** %x.addr, align 4
  call void @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_15condition_errorEEEEC1ERKS4_(%"class.boost::exception_detail::clone_impl.27"* %agg.result, %"struct.boost::exception_detail::error_info_injector.28"* %0)
  ret void
}

define linkonce_odr void @_ZN5boost17enable_error_infoINS_15condition_errorEEENS_16exception_detail29enable_error_info_return_typeIT_E4typeERKS4_(%"struct.boost::exception_detail::error_info_injector.28"* noalias sret %agg.result, %"class.boost::condition_error"* %x) inlinehint {
entry:
  %x.addr = alloca %"class.boost::condition_error"*, align 4
  store %"class.boost::condition_error"* %x, %"class.boost::condition_error"** %x.addr, align 4
  %0 = load %"class.boost::condition_error"** %x.addr, align 4
  call void @_ZN5boost16exception_detail19error_info_injectorINS_15condition_errorEEC1ERKS2_(%"struct.boost::exception_detail::error_info_injector.28"* %agg.result, %"class.boost::condition_error"* %0)
  ret void
}

define linkonce_odr void @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_15condition_errorEEEED1Ev(%"class.boost::exception_detail::clone_impl.27"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::exception_detail::clone_impl.27"*, align 4
  store %"class.boost::exception_detail::clone_impl.27"* %this, %"class.boost::exception_detail::clone_impl.27"** %this.addr, align 4
  %this1 = load %"class.boost::exception_detail::clone_impl.27"** %this.addr
  call void @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_15condition_errorEEEED2Ev(%"class.boost::exception_detail::clone_impl.27"* %this1, i8** getelementptr inbounds ([2 x i8*]* @_ZTTN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_15condition_errorEEEEE, i64 0, i64 0)) nounwind
  %0 = bitcast %"class.boost::exception_detail::clone_impl.27"* %this1 to i8*
  %1 = getelementptr inbounds i8* %0, i64 40
  %2 = bitcast i8* %1 to %"class.boost::exception_detail::clone_base"*
  call void @_ZN5boost16exception_detail10clone_baseD2Ev(%"class.boost::exception_detail::clone_base"* %2) nounwind
  ret void
}

define linkonce_odr void @_ZN5boost16exception_detail19error_info_injectorINS_15condition_errorEED1Ev(%"struct.boost::exception_detail::error_info_injector.28"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"struct.boost::exception_detail::error_info_injector.28"*, align 4
  store %"struct.boost::exception_detail::error_info_injector.28"* %this, %"struct.boost::exception_detail::error_info_injector.28"** %this.addr, align 4
  %this1 = load %"struct.boost::exception_detail::error_info_injector.28"** %this.addr
  call void @_ZN5boost16exception_detail19error_info_injectorINS_15condition_errorEED2Ev(%"struct.boost::exception_detail::error_info_injector.28"* %this1) nounwind
  ret void
}

define linkonce_odr void @_ZN5boost16exception_detail19error_info_injectorINS_15condition_errorEED2Ev(%"struct.boost::exception_detail::error_info_injector.28"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"struct.boost::exception_detail::error_info_injector.28"*, align 4
  store %"struct.boost::exception_detail::error_info_injector.28"* %this, %"struct.boost::exception_detail::error_info_injector.28"** %this.addr, align 4
  %this1 = load %"struct.boost::exception_detail::error_info_injector.28"** %this.addr
  %0 = bitcast %"struct.boost::exception_detail::error_info_injector.28"* %this1 to i8*
  %1 = getelementptr inbounds i8* %0, i64 20
  %2 = bitcast i8* %1 to %"class.boost::exception"*
  call void @_ZN5boost9exceptionD2Ev(%"class.boost::exception"* %2) nounwind
  %3 = bitcast %"struct.boost::exception_detail::error_info_injector.28"* %this1 to %"class.boost::condition_error"*
  call void @_ZN5boost15condition_errorD2Ev(%"class.boost::condition_error"* %3) nounwind
  ret void
}

define linkonce_odr void @_ZThn20_N5boost16exception_detail19error_info_injectorINS_15condition_errorEED1Ev(%"struct.boost::exception_detail::error_info_injector.28"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"struct.boost::exception_detail::error_info_injector.28"*, align 4
  store %"struct.boost::exception_detail::error_info_injector.28"* %this, %"struct.boost::exception_detail::error_info_injector.28"** %this.addr, align 4
  %this1 = load %"struct.boost::exception_detail::error_info_injector.28"** %this.addr
  %0 = bitcast %"struct.boost::exception_detail::error_info_injector.28"* %this1 to i8*
  %1 = getelementptr inbounds i8* %0, i64 -20
  %2 = bitcast i8* %1 to %"struct.boost::exception_detail::error_info_injector.28"*
  call void @_ZN5boost16exception_detail19error_info_injectorINS_15condition_errorEED1Ev(%"struct.boost::exception_detail::error_info_injector.28"* %2) nounwind
  ret void
}

define linkonce_odr void @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_15condition_errorEEEED2Ev(%"class.boost::exception_detail::clone_impl.27"* %this, i8** %vtt) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::exception_detail::clone_impl.27"*, align 4
  %vtt.addr = alloca i8**, align 4
  store %"class.boost::exception_detail::clone_impl.27"* %this, %"class.boost::exception_detail::clone_impl.27"** %this.addr, align 4
  store i8** %vtt, i8*** %vtt.addr, align 4
  %this1 = load %"class.boost::exception_detail::clone_impl.27"** %this.addr
  %vtt2 = load i8*** %vtt.addr
  %0 = bitcast %"class.boost::exception_detail::clone_impl.27"* %this1 to %"struct.boost::exception_detail::error_info_injector.28"*
  call void @_ZN5boost16exception_detail19error_info_injectorINS_15condition_errorEED2Ev(%"struct.boost::exception_detail::error_info_injector.28"* %0) nounwind
  ret void
}

define linkonce_odr void @_ZThn20_N5boost16exception_detail10clone_implINS0_19error_info_injectorINS_15condition_errorEEEED1Ev(%"class.boost::exception_detail::clone_impl.27"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::exception_detail::clone_impl.27"*, align 4
  store %"class.boost::exception_detail::clone_impl.27"* %this, %"class.boost::exception_detail::clone_impl.27"** %this.addr, align 4
  %this1 = load %"class.boost::exception_detail::clone_impl.27"** %this.addr
  %0 = bitcast %"class.boost::exception_detail::clone_impl.27"* %this1 to i8*
  %1 = getelementptr inbounds i8* %0, i64 -20
  %2 = bitcast i8* %1 to %"class.boost::exception_detail::clone_impl.27"*
  call void @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_15condition_errorEEEED1Ev(%"class.boost::exception_detail::clone_impl.27"* %2) nounwind
  ret void
}

define linkonce_odr void @_ZTv0_n20_N5boost16exception_detail10clone_implINS0_19error_info_injectorINS_15condition_errorEEEED1Ev(%"class.boost::exception_detail::clone_impl.27"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::exception_detail::clone_impl.27"*, align 4
  store %"class.boost::exception_detail::clone_impl.27"* %this, %"class.boost::exception_detail::clone_impl.27"** %this.addr, align 4
  %this1 = load %"class.boost::exception_detail::clone_impl.27"** %this.addr
  %0 = bitcast %"class.boost::exception_detail::clone_impl.27"* %this1 to i8*
  %1 = bitcast i8* %0 to i8**
  %2 = load i8** %1
  %3 = getelementptr inbounds i8* %2, i64 -20
  %4 = bitcast i8* %3 to i32*
  %5 = load i32* %4
  %6 = getelementptr inbounds i8* %0, i32 %5
  %7 = bitcast i8* %6 to %"class.boost::exception_detail::clone_impl.27"*
  call void @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_15condition_errorEEEED1Ev(%"class.boost::exception_detail::clone_impl.27"* %7) nounwind
  ret void
}

define linkonce_odr void @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_15condition_errorEEEED0Ev(%"class.boost::exception_detail::clone_impl.27"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::exception_detail::clone_impl.27"*, align 4
  store %"class.boost::exception_detail::clone_impl.27"* %this, %"class.boost::exception_detail::clone_impl.27"** %this.addr, align 4
  %this1 = load %"class.boost::exception_detail::clone_impl.27"** %this.addr
  call void @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_15condition_errorEEEED1Ev(%"class.boost::exception_detail::clone_impl.27"* %this1) nounwind
  %0 = bitcast %"class.boost::exception_detail::clone_impl.27"* %this1 to i8*
  call void @_ZdlPv(i8* %0) nounwind
  ret void
}

define linkonce_odr %"class.boost::exception_detail::clone_base"* @_ZNK5boost16exception_detail10clone_implINS0_19error_info_injectorINS_15condition_errorEEEE5cloneEv(%"class.boost::exception_detail::clone_impl.27"* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::exception_detail::clone_impl.27"*, align 4
  %agg.tmp = alloca %"struct.boost::exception_detail::clone_impl<boost::exception_detail::error_info_injector<boost::condition_error> >::clone_tag", align 1
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  store %"class.boost::exception_detail::clone_impl.27"* %this, %"class.boost::exception_detail::clone_impl.27"** %this.addr, align 4
  %this1 = load %"class.boost::exception_detail::clone_impl.27"** %this.addr
  %call = call noalias i8* @_Znwj(i32 44)
  %0 = bitcast i8* %call to %"class.boost::exception_detail::clone_impl.27"*
  invoke void @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_15condition_errorEEEEC1ERKS5_NS5_9clone_tagE(%"class.boost::exception_detail::clone_impl.27"* %0, %"class.boost::exception_detail::clone_impl.27"* %this1)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %entry
  %1 = icmp eq %"class.boost::exception_detail::clone_impl.27"* %0, null
  br i1 %1, label %cast.end, label %cast.notnull

cast.notnull:                                     ; preds = %invoke.cont
  %2 = bitcast %"class.boost::exception_detail::clone_impl.27"* %0 to i8**
  %vtable = load i8** %2
  %vbase.offset.ptr = getelementptr i8* %vtable, i64 -12
  %3 = bitcast i8* %vbase.offset.ptr to i32*
  %vbase.offset = load i32* %3
  %4 = bitcast %"class.boost::exception_detail::clone_impl.27"* %0 to i8*
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

define linkonce_odr void @_ZNK5boost16exception_detail10clone_implINS0_19error_info_injectorINS_15condition_errorEEEE7rethrowEv(%"class.boost::exception_detail::clone_impl.27"* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::exception_detail::clone_impl.27"*, align 4
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  store %"class.boost::exception_detail::clone_impl.27"* %this, %"class.boost::exception_detail::clone_impl.27"** %this.addr, align 4
  %this1 = load %"class.boost::exception_detail::clone_impl.27"** %this.addr
  %exception = call i8* @__cxa_allocate_exception(i32 44) nounwind
  %0 = bitcast i8* %exception to %"class.boost::exception_detail::clone_impl.27"*
  invoke void @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_15condition_errorEEEEC1ERKS5_(%"class.boost::exception_detail::clone_impl.27"* %0, %"class.boost::exception_detail::clone_impl.27"* %this1)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %entry
  call void @__cxa_throw(i8* %exception, i8* bitcast ({ i8*, i8*, i32, i32, i8*, i32, i8*, i32 }* @_ZTIN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_15condition_errorEEEEE to i8*), i8* bitcast (void (%"class.boost::exception_detail::clone_impl.27"*)* @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_15condition_errorEEEED1Ev to i8*)) noreturn
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

define linkonce_odr void @_ZThn20_N5boost16exception_detail10clone_implINS0_19error_info_injectorINS_15condition_errorEEEED0Ev(%"class.boost::exception_detail::clone_impl.27"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::exception_detail::clone_impl.27"*, align 4
  store %"class.boost::exception_detail::clone_impl.27"* %this, %"class.boost::exception_detail::clone_impl.27"** %this.addr, align 4
  %this1 = load %"class.boost::exception_detail::clone_impl.27"** %this.addr
  %0 = bitcast %"class.boost::exception_detail::clone_impl.27"* %this1 to i8*
  %1 = getelementptr inbounds i8* %0, i64 -20
  %2 = bitcast i8* %1 to %"class.boost::exception_detail::clone_impl.27"*
  call void @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_15condition_errorEEEED0Ev(%"class.boost::exception_detail::clone_impl.27"* %2) nounwind
  ret void
}

define linkonce_odr %"class.boost::exception_detail::clone_base"* @_ZTv0_n12_NK5boost16exception_detail10clone_implINS0_19error_info_injectorINS_15condition_errorEEEE5cloneEv(%"class.boost::exception_detail::clone_impl.27"* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::exception_detail::clone_impl.27"*, align 4
  store %"class.boost::exception_detail::clone_impl.27"* %this, %"class.boost::exception_detail::clone_impl.27"** %this.addr, align 4
  %this1 = load %"class.boost::exception_detail::clone_impl.27"** %this.addr
  %0 = bitcast %"class.boost::exception_detail::clone_impl.27"* %this1 to i8*
  %1 = bitcast i8* %0 to i8**
  %2 = load i8** %1
  %3 = getelementptr inbounds i8* %2, i64 -12
  %4 = bitcast i8* %3 to i32*
  %5 = load i32* %4
  %6 = getelementptr inbounds i8* %0, i32 %5
  %7 = bitcast i8* %6 to %"class.boost::exception_detail::clone_impl.27"*
  %call = call %"class.boost::exception_detail::clone_base"* @_ZNK5boost16exception_detail10clone_implINS0_19error_info_injectorINS_15condition_errorEEEE5cloneEv(%"class.boost::exception_detail::clone_impl.27"* %7)
  ret %"class.boost::exception_detail::clone_base"* %call
}

define linkonce_odr void @_ZTv0_n16_NK5boost16exception_detail10clone_implINS0_19error_info_injectorINS_15condition_errorEEEE7rethrowEv(%"class.boost::exception_detail::clone_impl.27"* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::exception_detail::clone_impl.27"*, align 4
  store %"class.boost::exception_detail::clone_impl.27"* %this, %"class.boost::exception_detail::clone_impl.27"** %this.addr, align 4
  %this1 = load %"class.boost::exception_detail::clone_impl.27"** %this.addr
  %0 = bitcast %"class.boost::exception_detail::clone_impl.27"* %this1 to i8*
  %1 = bitcast i8* %0 to i8**
  %2 = load i8** %1
  %3 = getelementptr inbounds i8* %2, i64 -16
  %4 = bitcast i8* %3 to i32*
  %5 = load i32* %4
  %6 = getelementptr inbounds i8* %0, i32 %5
  %7 = bitcast i8* %6 to %"class.boost::exception_detail::clone_impl.27"*
  call void @_ZNK5boost16exception_detail10clone_implINS0_19error_info_injectorINS_15condition_errorEEEE7rethrowEv(%"class.boost::exception_detail::clone_impl.27"* %7)
  ret void
}

define linkonce_odr void @_ZTv0_n20_N5boost16exception_detail10clone_implINS0_19error_info_injectorINS_15condition_errorEEEED0Ev(%"class.boost::exception_detail::clone_impl.27"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::exception_detail::clone_impl.27"*, align 4
  store %"class.boost::exception_detail::clone_impl.27"* %this, %"class.boost::exception_detail::clone_impl.27"** %this.addr, align 4
  %this1 = load %"class.boost::exception_detail::clone_impl.27"** %this.addr
  %0 = bitcast %"class.boost::exception_detail::clone_impl.27"* %this1 to i8*
  %1 = bitcast i8* %0 to i8**
  %2 = load i8** %1
  %3 = getelementptr inbounds i8* %2, i64 -20
  %4 = bitcast i8* %3 to i32*
  %5 = load i32* %4
  %6 = getelementptr inbounds i8* %0, i32 %5
  %7 = bitcast i8* %6 to %"class.boost::exception_detail::clone_impl.27"*
  call void @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_15condition_errorEEEED0Ev(%"class.boost::exception_detail::clone_impl.27"* %7) nounwind
  ret void
}

define linkonce_odr void @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_15condition_errorEEEEC1ERKS5_(%"class.boost::exception_detail::clone_impl.27"* %this, %"class.boost::exception_detail::clone_impl.27"*) unnamed_addr inlinehint align 2 {
entry:
  %this.addr = alloca %"class.boost::exception_detail::clone_impl.27"*, align 4
  %.addr = alloca %"class.boost::exception_detail::clone_impl.27"*, align 4
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  store %"class.boost::exception_detail::clone_impl.27"* %this, %"class.boost::exception_detail::clone_impl.27"** %this.addr, align 4
  store %"class.boost::exception_detail::clone_impl.27"* %0, %"class.boost::exception_detail::clone_impl.27"** %.addr, align 4
  %this1 = load %"class.boost::exception_detail::clone_impl.27"** %this.addr
  %1 = bitcast %"class.boost::exception_detail::clone_impl.27"* %this1 to i8*
  %2 = getelementptr inbounds i8* %1, i64 40
  %3 = bitcast i8* %2 to %"class.boost::exception_detail::clone_base"*
  %4 = load %"class.boost::exception_detail::clone_impl.27"** %.addr, align 4
  %5 = bitcast %"class.boost::exception_detail::clone_impl.27"* %4 to i8**
  %vtable = load i8** %5
  %vbase.offset.ptr = getelementptr i8* %vtable, i64 -12
  %6 = bitcast i8* %vbase.offset.ptr to i32*
  %vbase.offset = load i32* %6
  %7 = bitcast %"class.boost::exception_detail::clone_impl.27"* %4 to i8*
  %add.ptr = getelementptr inbounds i8* %7, i32 %vbase.offset
  %8 = bitcast i8* %add.ptr to %"class.boost::exception_detail::clone_base"*
  call void @_ZN5boost16exception_detail10clone_baseC2ERKS1_(%"class.boost::exception_detail::clone_base"* %3, %"class.boost::exception_detail::clone_base"* %8) nounwind
  %9 = bitcast %"class.boost::exception_detail::clone_impl.27"* %this1 to %"struct.boost::exception_detail::error_info_injector.28"*
  %10 = load %"class.boost::exception_detail::clone_impl.27"** %.addr, align 4
  %11 = bitcast %"class.boost::exception_detail::clone_impl.27"* %10 to %"struct.boost::exception_detail::error_info_injector.28"*
  invoke void @_ZN5boost16exception_detail19error_info_injectorINS_15condition_errorEEC2ERKS3_(%"struct.boost::exception_detail::error_info_injector.28"* %9, %"struct.boost::exception_detail::error_info_injector.28"* %11)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %entry
  %12 = bitcast %"class.boost::exception_detail::clone_impl.27"* %this1 to i8***
  store i8** getelementptr inbounds ([21 x i8*]* @_ZTVN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_15condition_errorEEEEE, i64 0, i64 3), i8*** %12
  %13 = bitcast %"class.boost::exception_detail::clone_impl.27"* %this1 to i8*
  %add.ptr2 = getelementptr inbounds i8* %13, i32 20
  %14 = bitcast i8* %add.ptr2 to i8***
  store i8** getelementptr inbounds ([21 x i8*]* @_ZTVN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_15condition_errorEEEEE, i64 0, i64 10), i8*** %14
  %15 = bitcast %"class.boost::exception_detail::clone_impl.27"* %this1 to i8*
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
  %20 = bitcast %"class.boost::exception_detail::clone_impl.27"* %this1 to i8*
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

define linkonce_odr void @_ZN5boost16exception_detail19error_info_injectorINS_15condition_errorEEC2ERKS3_(%"struct.boost::exception_detail::error_info_injector.28"* %this, %"struct.boost::exception_detail::error_info_injector.28"*) unnamed_addr inlinehint align 2 {
entry:
  %this.addr = alloca %"struct.boost::exception_detail::error_info_injector.28"*, align 4
  %.addr = alloca %"struct.boost::exception_detail::error_info_injector.28"*, align 4
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  store %"struct.boost::exception_detail::error_info_injector.28"* %this, %"struct.boost::exception_detail::error_info_injector.28"** %this.addr, align 4
  store %"struct.boost::exception_detail::error_info_injector.28"* %0, %"struct.boost::exception_detail::error_info_injector.28"** %.addr, align 4
  %this1 = load %"struct.boost::exception_detail::error_info_injector.28"** %this.addr
  %1 = bitcast %"struct.boost::exception_detail::error_info_injector.28"* %this1 to %"class.boost::condition_error"*
  %2 = load %"struct.boost::exception_detail::error_info_injector.28"** %.addr, align 4
  %3 = bitcast %"struct.boost::exception_detail::error_info_injector.28"* %2 to %"class.boost::condition_error"*
  call void @_ZN5boost15condition_errorC2ERKS0_(%"class.boost::condition_error"* %1, %"class.boost::condition_error"* %3)
  %4 = bitcast %"struct.boost::exception_detail::error_info_injector.28"* %this1 to i8*
  %5 = getelementptr inbounds i8* %4, i64 20
  %6 = bitcast i8* %5 to %"class.boost::exception"*
  %7 = load %"struct.boost::exception_detail::error_info_injector.28"** %.addr, align 4
  %8 = bitcast %"struct.boost::exception_detail::error_info_injector.28"* %7 to i8*
  %add.ptr = getelementptr inbounds i8* %8, i32 20
  %9 = bitcast i8* %add.ptr to %"class.boost::exception"*
  invoke void @_ZN5boost9exceptionC2ERKS0_(%"class.boost::exception"* %6, %"class.boost::exception"* %9)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %entry
  %10 = bitcast %"struct.boost::exception_detail::error_info_injector.28"* %this1 to i8***
  store i8** getelementptr inbounds ([9 x i8*]* @_ZTVN5boost16exception_detail19error_info_injectorINS_15condition_errorEEE, i64 0, i64 2), i8*** %10
  %11 = bitcast %"struct.boost::exception_detail::error_info_injector.28"* %this1 to i8*
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
  %16 = bitcast %"struct.boost::exception_detail::error_info_injector.28"* %this1 to %"class.boost::condition_error"*
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

define linkonce_odr void @_ZN5boost16exception_detail19error_info_injectorINS_15condition_errorEED0Ev(%"struct.boost::exception_detail::error_info_injector.28"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"struct.boost::exception_detail::error_info_injector.28"*, align 4
  store %"struct.boost::exception_detail::error_info_injector.28"* %this, %"struct.boost::exception_detail::error_info_injector.28"** %this.addr, align 4
  %this1 = load %"struct.boost::exception_detail::error_info_injector.28"** %this.addr
  call void @_ZN5boost16exception_detail19error_info_injectorINS_15condition_errorEED1Ev(%"struct.boost::exception_detail::error_info_injector.28"* %this1) nounwind
  %0 = bitcast %"struct.boost::exception_detail::error_info_injector.28"* %this1 to i8*
  call void @_ZdlPv(i8* %0) nounwind
  ret void
}

define linkonce_odr void @_ZThn20_N5boost16exception_detail19error_info_injectorINS_15condition_errorEED0Ev(%"struct.boost::exception_detail::error_info_injector.28"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"struct.boost::exception_detail::error_info_injector.28"*, align 4
  store %"struct.boost::exception_detail::error_info_injector.28"* %this, %"struct.boost::exception_detail::error_info_injector.28"** %this.addr, align 4
  %this1 = load %"struct.boost::exception_detail::error_info_injector.28"** %this.addr
  %0 = bitcast %"struct.boost::exception_detail::error_info_injector.28"* %this1 to i8*
  %1 = getelementptr inbounds i8* %0, i64 -20
  %2 = bitcast i8* %1 to %"struct.boost::exception_detail::error_info_injector.28"*
  call void @_ZN5boost16exception_detail19error_info_injectorINS_15condition_errorEED0Ev(%"struct.boost::exception_detail::error_info_injector.28"* %2) nounwind
  ret void
}

define linkonce_odr void @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_15condition_errorEEEEC1ERKS5_NS5_9clone_tagE(%"class.boost::exception_detail::clone_impl.27"* %this, %"class.boost::exception_detail::clone_impl.27"* %x) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::exception_detail::clone_impl.27"*, align 4
  %x.addr = alloca %"class.boost::exception_detail::clone_impl.27"*, align 4
  %0 = alloca %"struct.boost::exception_detail::clone_impl<boost::exception_detail::error_info_injector<boost::condition_error> >::clone_tag", align 1
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  store %"class.boost::exception_detail::clone_impl.27"* %this, %"class.boost::exception_detail::clone_impl.27"** %this.addr, align 4
  store %"class.boost::exception_detail::clone_impl.27"* %x, %"class.boost::exception_detail::clone_impl.27"** %x.addr, align 4
  %this1 = load %"class.boost::exception_detail::clone_impl.27"** %this.addr
  %1 = bitcast %"class.boost::exception_detail::clone_impl.27"* %this1 to i8*
  %2 = getelementptr inbounds i8* %1, i64 40
  %3 = bitcast i8* %2 to %"class.boost::exception_detail::clone_base"*
  call void @_ZN5boost16exception_detail10clone_baseC2Ev(%"class.boost::exception_detail::clone_base"* %3) nounwind
  %4 = bitcast %"class.boost::exception_detail::clone_impl.27"* %this1 to %"struct.boost::exception_detail::error_info_injector.28"*
  %5 = load %"class.boost::exception_detail::clone_impl.27"** %x.addr, align 4
  %6 = bitcast %"class.boost::exception_detail::clone_impl.27"* %5 to %"struct.boost::exception_detail::error_info_injector.28"*
  invoke void @_ZN5boost16exception_detail19error_info_injectorINS_15condition_errorEEC2ERKS3_(%"struct.boost::exception_detail::error_info_injector.28"* %4, %"struct.boost::exception_detail::error_info_injector.28"* %6)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %entry
  %7 = bitcast %"class.boost::exception_detail::clone_impl.27"* %this1 to i8***
  store i8** getelementptr inbounds ([21 x i8*]* @_ZTVN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_15condition_errorEEEEE, i64 0, i64 3), i8*** %7
  %8 = bitcast %"class.boost::exception_detail::clone_impl.27"* %this1 to i8*
  %add.ptr = getelementptr inbounds i8* %8, i32 20
  %9 = bitcast i8* %add.ptr to i8***
  store i8** getelementptr inbounds ([21 x i8*]* @_ZTVN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_15condition_errorEEEEE, i64 0, i64 10), i8*** %9
  %10 = bitcast %"class.boost::exception_detail::clone_impl.27"* %this1 to i8*
  %add.ptr2 = getelementptr inbounds i8* %10, i32 40
  %11 = bitcast i8* %add.ptr2 to i8***
  store i8** getelementptr inbounds ([21 x i8*]* @_ZTVN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_15condition_errorEEEEE, i64 0, i64 17), i8*** %11
  %12 = bitcast %"class.boost::exception_detail::clone_impl.27"* %this1 to i8*
  %add.ptr3 = getelementptr inbounds i8* %12, i32 20
  %13 = bitcast i8* %add.ptr3 to %"class.boost::exception"*
  %14 = load %"class.boost::exception_detail::clone_impl.27"** %x.addr, align 4
  %15 = icmp eq %"class.boost::exception_detail::clone_impl.27"* %14, null
  br i1 %15, label %cast.end, label %cast.notnull

cast.notnull:                                     ; preds = %invoke.cont
  %16 = bitcast %"class.boost::exception_detail::clone_impl.27"* %14 to i8*
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
  %24 = bitcast %"class.boost::exception_detail::clone_impl.27"* %this1 to %"struct.boost::exception_detail::error_info_injector.28"*
  call void @_ZN5boost16exception_detail19error_info_injectorINS_15condition_errorEED2Ev(%"struct.boost::exception_detail::error_info_injector.28"* %24) nounwind
  br label %ehcleanup

ehcleanup:                                        ; preds = %lpad5, %lpad
  %25 = bitcast %"class.boost::exception_detail::clone_impl.27"* %this1 to i8*
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

define linkonce_odr void @_ZN5boost16exception_detail19error_info_injectorINS_15condition_errorEEC1ERKS2_(%"struct.boost::exception_detail::error_info_injector.28"* %this, %"class.boost::condition_error"* %x) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"struct.boost::exception_detail::error_info_injector.28"*, align 4
  %x.addr = alloca %"class.boost::condition_error"*, align 4
  store %"struct.boost::exception_detail::error_info_injector.28"* %this, %"struct.boost::exception_detail::error_info_injector.28"** %this.addr, align 4
  store %"class.boost::condition_error"* %x, %"class.boost::condition_error"** %x.addr, align 4
  %this1 = load %"struct.boost::exception_detail::error_info_injector.28"** %this.addr
  %0 = load %"class.boost::condition_error"** %x.addr
  call void @_ZN5boost16exception_detail19error_info_injectorINS_15condition_errorEEC2ERKS2_(%"struct.boost::exception_detail::error_info_injector.28"* %this1, %"class.boost::condition_error"* %0)
  ret void
}

define linkonce_odr void @_ZN5boost16exception_detail19error_info_injectorINS_15condition_errorEEC2ERKS2_(%"struct.boost::exception_detail::error_info_injector.28"* %this, %"class.boost::condition_error"* %x) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"struct.boost::exception_detail::error_info_injector.28"*, align 4
  %x.addr = alloca %"class.boost::condition_error"*, align 4
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  store %"struct.boost::exception_detail::error_info_injector.28"* %this, %"struct.boost::exception_detail::error_info_injector.28"** %this.addr, align 4
  store %"class.boost::condition_error"* %x, %"class.boost::condition_error"** %x.addr, align 4
  %this1 = load %"struct.boost::exception_detail::error_info_injector.28"** %this.addr
  %0 = bitcast %"struct.boost::exception_detail::error_info_injector.28"* %this1 to %"class.boost::condition_error"*
  %1 = load %"class.boost::condition_error"** %x.addr, align 4
  call void @_ZN5boost15condition_errorC2ERKS0_(%"class.boost::condition_error"* %0, %"class.boost::condition_error"* %1)
  %2 = bitcast %"struct.boost::exception_detail::error_info_injector.28"* %this1 to i8*
  %3 = getelementptr inbounds i8* %2, i64 20
  %4 = bitcast i8* %3 to %"class.boost::exception"*
  invoke void @_ZN5boost9exceptionC2Ev(%"class.boost::exception"* %4)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %entry
  %5 = bitcast %"struct.boost::exception_detail::error_info_injector.28"* %this1 to i8***
  store i8** getelementptr inbounds ([9 x i8*]* @_ZTVN5boost16exception_detail19error_info_injectorINS_15condition_errorEEE, i64 0, i64 2), i8*** %5
  %6 = bitcast %"struct.boost::exception_detail::error_info_injector.28"* %this1 to i8*
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
  %11 = bitcast %"struct.boost::exception_detail::error_info_injector.28"* %this1 to %"class.boost::condition_error"*
  call void @_ZN5boost15condition_errorD2Ev(%"class.boost::condition_error"* %11) nounwind
  br label %eh.resume

eh.resume:                                        ; preds = %lpad
  %exn = load i8** %exn.slot
  %sel = load i32* %ehselector.slot
  %lpad.val = insertvalue { i8*, i32 } undef, i8* %exn, 0
  %lpad.val2 = insertvalue { i8*, i32 } %lpad.val, i32 %sel, 1
  resume { i8*, i32 } %lpad.val2
}

define linkonce_odr void @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_15condition_errorEEEEC1ERKS4_(%"class.boost::exception_detail::clone_impl.27"* %this, %"struct.boost::exception_detail::error_info_injector.28"* %x) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::exception_detail::clone_impl.27"*, align 4
  %x.addr = alloca %"struct.boost::exception_detail::error_info_injector.28"*, align 4
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  store %"class.boost::exception_detail::clone_impl.27"* %this, %"class.boost::exception_detail::clone_impl.27"** %this.addr, align 4
  store %"struct.boost::exception_detail::error_info_injector.28"* %x, %"struct.boost::exception_detail::error_info_injector.28"** %x.addr, align 4
  %this1 = load %"class.boost::exception_detail::clone_impl.27"** %this.addr
  %0 = bitcast %"class.boost::exception_detail::clone_impl.27"* %this1 to i8*
  %1 = getelementptr inbounds i8* %0, i64 40
  %2 = bitcast i8* %1 to %"class.boost::exception_detail::clone_base"*
  call void @_ZN5boost16exception_detail10clone_baseC2Ev(%"class.boost::exception_detail::clone_base"* %2) nounwind
  %3 = bitcast %"class.boost::exception_detail::clone_impl.27"* %this1 to %"struct.boost::exception_detail::error_info_injector.28"*
  %4 = load %"struct.boost::exception_detail::error_info_injector.28"** %x.addr, align 4
  invoke void @_ZN5boost16exception_detail19error_info_injectorINS_15condition_errorEEC2ERKS3_(%"struct.boost::exception_detail::error_info_injector.28"* %3, %"struct.boost::exception_detail::error_info_injector.28"* %4)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %entry
  %5 = bitcast %"class.boost::exception_detail::clone_impl.27"* %this1 to i8***
  store i8** getelementptr inbounds ([21 x i8*]* @_ZTVN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_15condition_errorEEEEE, i64 0, i64 3), i8*** %5
  %6 = bitcast %"class.boost::exception_detail::clone_impl.27"* %this1 to i8*
  %add.ptr = getelementptr inbounds i8* %6, i32 20
  %7 = bitcast i8* %add.ptr to i8***
  store i8** getelementptr inbounds ([21 x i8*]* @_ZTVN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_15condition_errorEEEEE, i64 0, i64 10), i8*** %7
  %8 = bitcast %"class.boost::exception_detail::clone_impl.27"* %this1 to i8*
  %add.ptr2 = getelementptr inbounds i8* %8, i32 40
  %9 = bitcast i8* %add.ptr2 to i8***
  store i8** getelementptr inbounds ([21 x i8*]* @_ZTVN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_15condition_errorEEEEE, i64 0, i64 17), i8*** %9
  %10 = bitcast %"class.boost::exception_detail::clone_impl.27"* %this1 to i8*
  %add.ptr3 = getelementptr inbounds i8* %10, i32 20
  %11 = bitcast i8* %add.ptr3 to %"class.boost::exception"*
  %12 = load %"struct.boost::exception_detail::error_info_injector.28"** %x.addr, align 4
  %13 = icmp eq %"struct.boost::exception_detail::error_info_injector.28"* %12, null
  br i1 %13, label %cast.end, label %cast.notnull

cast.notnull:                                     ; preds = %invoke.cont
  %14 = bitcast %"struct.boost::exception_detail::error_info_injector.28"* %12 to i8*
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
  %22 = bitcast %"class.boost::exception_detail::clone_impl.27"* %this1 to %"struct.boost::exception_detail::error_info_injector.28"*
  call void @_ZN5boost16exception_detail19error_info_injectorINS_15condition_errorEED2Ev(%"struct.boost::exception_detail::error_info_injector.28"* %22) nounwind
  br label %ehcleanup

ehcleanup:                                        ; preds = %lpad5, %lpad
  %23 = bitcast %"class.boost::exception_detail::clone_impl.27"* %this1 to i8*
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
  call void @_ZN5boost10lock_errorC1EiPKc(%"class.boost::lock_error"* %ref.tmp, i32 1, i8* getelementptr inbounds ([31 x i8]* @.str31, i32 0, i32 0))
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
  call void @_ZN5boost10lock_errorC1EiPKc(%"class.boost::lock_error"* %ref.tmp3, i32 35, i8* getelementptr inbounds ([41 x i8]* @.str32, i32 0, i32 0))
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
  %ref.tmp = alloca %"struct.boost::exception_detail::error_info_injector.31", align 4
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  %cleanup.isactive = alloca i1
  store %"class.boost::lock_error"* %e, %"class.boost::lock_error"** %e.addr, align 4
  %0 = load %"class.boost::lock_error"** %e.addr, align 4
  %1 = bitcast %"class.boost::lock_error"* %0 to %"class.std::exception"*
  call void @_ZN5boost36throw_exception_assert_compatibilityERKSt9exception(%"class.std::exception"* %1)
  %exception = call i8* @__cxa_allocate_exception(i32 44) nounwind
  store i1 true, i1* %cleanup.isactive
  %2 = bitcast i8* %exception to %"class.boost::exception_detail::clone_impl.30"*
  %3 = load %"class.boost::lock_error"** %e.addr, align 4
  invoke void @_ZN5boost17enable_error_infoINS_10lock_errorEEENS_16exception_detail29enable_error_info_return_typeIT_E4typeERKS4_(%"struct.boost::exception_detail::error_info_injector.31"* sret %ref.tmp, %"class.boost::lock_error"* %3)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %entry
  invoke void @_ZN5boost24enable_current_exceptionINS_16exception_detail19error_info_injectorINS_10lock_errorEEEEENS1_10clone_implIT_EERKS6_(%"class.boost::exception_detail::clone_impl.30"* sret %2, %"struct.boost::exception_detail::error_info_injector.31"* %ref.tmp)
          to label %invoke.cont2 unwind label %lpad1

invoke.cont2:                                     ; preds = %invoke.cont
  store i1 false, i1* %cleanup.isactive
  invoke void @__cxa_throw(i8* %exception, i8* bitcast ({ i8*, i8*, i32, i32, i8*, i32, i8*, i32 }* @_ZTIN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_10lock_errorEEEEE to i8*), i8* bitcast (void (%"class.boost::exception_detail::clone_impl.30"*)* @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_10lock_errorEEEED1Ev to i8*)) noreturn
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
  call void @_ZN5boost16exception_detail19error_info_injectorINS_10lock_errorEED1Ev(%"struct.boost::exception_detail::error_info_injector.31"* %ref.tmp) nounwind
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
  call void @_ZN5boost10lock_errorC1EiPKc(%"class.boost::lock_error"* %ref.tmp, i32 %2, i8* getelementptr inbounds ([47 x i8]* @.str33, i32 0, i32 0))
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

define linkonce_odr void @_ZN5boost24enable_current_exceptionINS_16exception_detail19error_info_injectorINS_10lock_errorEEEEENS1_10clone_implIT_EERKS6_(%"class.boost::exception_detail::clone_impl.30"* noalias sret %agg.result, %"struct.boost::exception_detail::error_info_injector.31"* %x) inlinehint {
entry:
  %x.addr = alloca %"struct.boost::exception_detail::error_info_injector.31"*, align 4
  store %"struct.boost::exception_detail::error_info_injector.31"* %x, %"struct.boost::exception_detail::error_info_injector.31"** %x.addr, align 4
  %0 = load %"struct.boost::exception_detail::error_info_injector.31"** %x.addr, align 4
  call void @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_10lock_errorEEEEC1ERKS4_(%"class.boost::exception_detail::clone_impl.30"* %agg.result, %"struct.boost::exception_detail::error_info_injector.31"* %0)
  ret void
}

define linkonce_odr void @_ZN5boost17enable_error_infoINS_10lock_errorEEENS_16exception_detail29enable_error_info_return_typeIT_E4typeERKS4_(%"struct.boost::exception_detail::error_info_injector.31"* noalias sret %agg.result, %"class.boost::lock_error"* %x) inlinehint {
entry:
  %x.addr = alloca %"class.boost::lock_error"*, align 4
  store %"class.boost::lock_error"* %x, %"class.boost::lock_error"** %x.addr, align 4
  %0 = load %"class.boost::lock_error"** %x.addr, align 4
  call void @_ZN5boost16exception_detail19error_info_injectorINS_10lock_errorEEC1ERKS2_(%"struct.boost::exception_detail::error_info_injector.31"* %agg.result, %"class.boost::lock_error"* %0)
  ret void
}

define linkonce_odr void @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_10lock_errorEEEED1Ev(%"class.boost::exception_detail::clone_impl.30"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::exception_detail::clone_impl.30"*, align 4
  store %"class.boost::exception_detail::clone_impl.30"* %this, %"class.boost::exception_detail::clone_impl.30"** %this.addr, align 4
  %this1 = load %"class.boost::exception_detail::clone_impl.30"** %this.addr
  call void @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_10lock_errorEEEED2Ev(%"class.boost::exception_detail::clone_impl.30"* %this1, i8** getelementptr inbounds ([2 x i8*]* @_ZTTN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_10lock_errorEEEEE, i64 0, i64 0)) nounwind
  %0 = bitcast %"class.boost::exception_detail::clone_impl.30"* %this1 to i8*
  %1 = getelementptr inbounds i8* %0, i64 40
  %2 = bitcast i8* %1 to %"class.boost::exception_detail::clone_base"*
  call void @_ZN5boost16exception_detail10clone_baseD2Ev(%"class.boost::exception_detail::clone_base"* %2) nounwind
  ret void
}

define linkonce_odr void @_ZN5boost16exception_detail19error_info_injectorINS_10lock_errorEED1Ev(%"struct.boost::exception_detail::error_info_injector.31"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"struct.boost::exception_detail::error_info_injector.31"*, align 4
  store %"struct.boost::exception_detail::error_info_injector.31"* %this, %"struct.boost::exception_detail::error_info_injector.31"** %this.addr, align 4
  %this1 = load %"struct.boost::exception_detail::error_info_injector.31"** %this.addr
  call void @_ZN5boost16exception_detail19error_info_injectorINS_10lock_errorEED2Ev(%"struct.boost::exception_detail::error_info_injector.31"* %this1) nounwind
  ret void
}

define linkonce_odr void @_ZN5boost16exception_detail19error_info_injectorINS_10lock_errorEED2Ev(%"struct.boost::exception_detail::error_info_injector.31"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"struct.boost::exception_detail::error_info_injector.31"*, align 4
  store %"struct.boost::exception_detail::error_info_injector.31"* %this, %"struct.boost::exception_detail::error_info_injector.31"** %this.addr, align 4
  %this1 = load %"struct.boost::exception_detail::error_info_injector.31"** %this.addr
  %0 = bitcast %"struct.boost::exception_detail::error_info_injector.31"* %this1 to i8*
  %1 = getelementptr inbounds i8* %0, i64 20
  %2 = bitcast i8* %1 to %"class.boost::exception"*
  call void @_ZN5boost9exceptionD2Ev(%"class.boost::exception"* %2) nounwind
  %3 = bitcast %"struct.boost::exception_detail::error_info_injector.31"* %this1 to %"class.boost::lock_error"*
  call void @_ZN5boost10lock_errorD2Ev(%"class.boost::lock_error"* %3) nounwind
  ret void
}

define linkonce_odr void @_ZThn20_N5boost16exception_detail19error_info_injectorINS_10lock_errorEED1Ev(%"struct.boost::exception_detail::error_info_injector.31"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"struct.boost::exception_detail::error_info_injector.31"*, align 4
  store %"struct.boost::exception_detail::error_info_injector.31"* %this, %"struct.boost::exception_detail::error_info_injector.31"** %this.addr, align 4
  %this1 = load %"struct.boost::exception_detail::error_info_injector.31"** %this.addr
  %0 = bitcast %"struct.boost::exception_detail::error_info_injector.31"* %this1 to i8*
  %1 = getelementptr inbounds i8* %0, i64 -20
  %2 = bitcast i8* %1 to %"struct.boost::exception_detail::error_info_injector.31"*
  call void @_ZN5boost16exception_detail19error_info_injectorINS_10lock_errorEED1Ev(%"struct.boost::exception_detail::error_info_injector.31"* %2) nounwind
  ret void
}

define linkonce_odr void @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_10lock_errorEEEED2Ev(%"class.boost::exception_detail::clone_impl.30"* %this, i8** %vtt) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::exception_detail::clone_impl.30"*, align 4
  %vtt.addr = alloca i8**, align 4
  store %"class.boost::exception_detail::clone_impl.30"* %this, %"class.boost::exception_detail::clone_impl.30"** %this.addr, align 4
  store i8** %vtt, i8*** %vtt.addr, align 4
  %this1 = load %"class.boost::exception_detail::clone_impl.30"** %this.addr
  %vtt2 = load i8*** %vtt.addr
  %0 = bitcast %"class.boost::exception_detail::clone_impl.30"* %this1 to %"struct.boost::exception_detail::error_info_injector.31"*
  call void @_ZN5boost16exception_detail19error_info_injectorINS_10lock_errorEED2Ev(%"struct.boost::exception_detail::error_info_injector.31"* %0) nounwind
  ret void
}

define linkonce_odr void @_ZThn20_N5boost16exception_detail10clone_implINS0_19error_info_injectorINS_10lock_errorEEEED1Ev(%"class.boost::exception_detail::clone_impl.30"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::exception_detail::clone_impl.30"*, align 4
  store %"class.boost::exception_detail::clone_impl.30"* %this, %"class.boost::exception_detail::clone_impl.30"** %this.addr, align 4
  %this1 = load %"class.boost::exception_detail::clone_impl.30"** %this.addr
  %0 = bitcast %"class.boost::exception_detail::clone_impl.30"* %this1 to i8*
  %1 = getelementptr inbounds i8* %0, i64 -20
  %2 = bitcast i8* %1 to %"class.boost::exception_detail::clone_impl.30"*
  call void @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_10lock_errorEEEED1Ev(%"class.boost::exception_detail::clone_impl.30"* %2) nounwind
  ret void
}

define linkonce_odr void @_ZTv0_n20_N5boost16exception_detail10clone_implINS0_19error_info_injectorINS_10lock_errorEEEED1Ev(%"class.boost::exception_detail::clone_impl.30"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::exception_detail::clone_impl.30"*, align 4
  store %"class.boost::exception_detail::clone_impl.30"* %this, %"class.boost::exception_detail::clone_impl.30"** %this.addr, align 4
  %this1 = load %"class.boost::exception_detail::clone_impl.30"** %this.addr
  %0 = bitcast %"class.boost::exception_detail::clone_impl.30"* %this1 to i8*
  %1 = bitcast i8* %0 to i8**
  %2 = load i8** %1
  %3 = getelementptr inbounds i8* %2, i64 -20
  %4 = bitcast i8* %3 to i32*
  %5 = load i32* %4
  %6 = getelementptr inbounds i8* %0, i32 %5
  %7 = bitcast i8* %6 to %"class.boost::exception_detail::clone_impl.30"*
  call void @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_10lock_errorEEEED1Ev(%"class.boost::exception_detail::clone_impl.30"* %7) nounwind
  ret void
}

define linkonce_odr void @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_10lock_errorEEEED0Ev(%"class.boost::exception_detail::clone_impl.30"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::exception_detail::clone_impl.30"*, align 4
  store %"class.boost::exception_detail::clone_impl.30"* %this, %"class.boost::exception_detail::clone_impl.30"** %this.addr, align 4
  %this1 = load %"class.boost::exception_detail::clone_impl.30"** %this.addr
  call void @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_10lock_errorEEEED1Ev(%"class.boost::exception_detail::clone_impl.30"* %this1) nounwind
  %0 = bitcast %"class.boost::exception_detail::clone_impl.30"* %this1 to i8*
  call void @_ZdlPv(i8* %0) nounwind
  ret void
}

define linkonce_odr %"class.boost::exception_detail::clone_base"* @_ZNK5boost16exception_detail10clone_implINS0_19error_info_injectorINS_10lock_errorEEEE5cloneEv(%"class.boost::exception_detail::clone_impl.30"* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::exception_detail::clone_impl.30"*, align 4
  %agg.tmp = alloca %"struct.boost::exception_detail::clone_impl<boost::exception_detail::error_info_injector<boost::lock_error> >::clone_tag", align 1
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  store %"class.boost::exception_detail::clone_impl.30"* %this, %"class.boost::exception_detail::clone_impl.30"** %this.addr, align 4
  %this1 = load %"class.boost::exception_detail::clone_impl.30"** %this.addr
  %call = call noalias i8* @_Znwj(i32 44)
  %0 = bitcast i8* %call to %"class.boost::exception_detail::clone_impl.30"*
  invoke void @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_10lock_errorEEEEC1ERKS5_NS5_9clone_tagE(%"class.boost::exception_detail::clone_impl.30"* %0, %"class.boost::exception_detail::clone_impl.30"* %this1)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %entry
  %1 = icmp eq %"class.boost::exception_detail::clone_impl.30"* %0, null
  br i1 %1, label %cast.end, label %cast.notnull

cast.notnull:                                     ; preds = %invoke.cont
  %2 = bitcast %"class.boost::exception_detail::clone_impl.30"* %0 to i8**
  %vtable = load i8** %2
  %vbase.offset.ptr = getelementptr i8* %vtable, i64 -12
  %3 = bitcast i8* %vbase.offset.ptr to i32*
  %vbase.offset = load i32* %3
  %4 = bitcast %"class.boost::exception_detail::clone_impl.30"* %0 to i8*
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

define linkonce_odr void @_ZNK5boost16exception_detail10clone_implINS0_19error_info_injectorINS_10lock_errorEEEE7rethrowEv(%"class.boost::exception_detail::clone_impl.30"* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::exception_detail::clone_impl.30"*, align 4
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  store %"class.boost::exception_detail::clone_impl.30"* %this, %"class.boost::exception_detail::clone_impl.30"** %this.addr, align 4
  %this1 = load %"class.boost::exception_detail::clone_impl.30"** %this.addr
  %exception = call i8* @__cxa_allocate_exception(i32 44) nounwind
  %0 = bitcast i8* %exception to %"class.boost::exception_detail::clone_impl.30"*
  invoke void @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_10lock_errorEEEEC1ERKS5_(%"class.boost::exception_detail::clone_impl.30"* %0, %"class.boost::exception_detail::clone_impl.30"* %this1)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %entry
  call void @__cxa_throw(i8* %exception, i8* bitcast ({ i8*, i8*, i32, i32, i8*, i32, i8*, i32 }* @_ZTIN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_10lock_errorEEEEE to i8*), i8* bitcast (void (%"class.boost::exception_detail::clone_impl.30"*)* @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_10lock_errorEEEED1Ev to i8*)) noreturn
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

define linkonce_odr void @_ZThn20_N5boost16exception_detail10clone_implINS0_19error_info_injectorINS_10lock_errorEEEED0Ev(%"class.boost::exception_detail::clone_impl.30"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::exception_detail::clone_impl.30"*, align 4
  store %"class.boost::exception_detail::clone_impl.30"* %this, %"class.boost::exception_detail::clone_impl.30"** %this.addr, align 4
  %this1 = load %"class.boost::exception_detail::clone_impl.30"** %this.addr
  %0 = bitcast %"class.boost::exception_detail::clone_impl.30"* %this1 to i8*
  %1 = getelementptr inbounds i8* %0, i64 -20
  %2 = bitcast i8* %1 to %"class.boost::exception_detail::clone_impl.30"*
  call void @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_10lock_errorEEEED0Ev(%"class.boost::exception_detail::clone_impl.30"* %2) nounwind
  ret void
}

define linkonce_odr %"class.boost::exception_detail::clone_base"* @_ZTv0_n12_NK5boost16exception_detail10clone_implINS0_19error_info_injectorINS_10lock_errorEEEE5cloneEv(%"class.boost::exception_detail::clone_impl.30"* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::exception_detail::clone_impl.30"*, align 4
  store %"class.boost::exception_detail::clone_impl.30"* %this, %"class.boost::exception_detail::clone_impl.30"** %this.addr, align 4
  %this1 = load %"class.boost::exception_detail::clone_impl.30"** %this.addr
  %0 = bitcast %"class.boost::exception_detail::clone_impl.30"* %this1 to i8*
  %1 = bitcast i8* %0 to i8**
  %2 = load i8** %1
  %3 = getelementptr inbounds i8* %2, i64 -12
  %4 = bitcast i8* %3 to i32*
  %5 = load i32* %4
  %6 = getelementptr inbounds i8* %0, i32 %5
  %7 = bitcast i8* %6 to %"class.boost::exception_detail::clone_impl.30"*
  %call = call %"class.boost::exception_detail::clone_base"* @_ZNK5boost16exception_detail10clone_implINS0_19error_info_injectorINS_10lock_errorEEEE5cloneEv(%"class.boost::exception_detail::clone_impl.30"* %7)
  ret %"class.boost::exception_detail::clone_base"* %call
}

define linkonce_odr void @_ZTv0_n16_NK5boost16exception_detail10clone_implINS0_19error_info_injectorINS_10lock_errorEEEE7rethrowEv(%"class.boost::exception_detail::clone_impl.30"* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::exception_detail::clone_impl.30"*, align 4
  store %"class.boost::exception_detail::clone_impl.30"* %this, %"class.boost::exception_detail::clone_impl.30"** %this.addr, align 4
  %this1 = load %"class.boost::exception_detail::clone_impl.30"** %this.addr
  %0 = bitcast %"class.boost::exception_detail::clone_impl.30"* %this1 to i8*
  %1 = bitcast i8* %0 to i8**
  %2 = load i8** %1
  %3 = getelementptr inbounds i8* %2, i64 -16
  %4 = bitcast i8* %3 to i32*
  %5 = load i32* %4
  %6 = getelementptr inbounds i8* %0, i32 %5
  %7 = bitcast i8* %6 to %"class.boost::exception_detail::clone_impl.30"*
  call void @_ZNK5boost16exception_detail10clone_implINS0_19error_info_injectorINS_10lock_errorEEEE7rethrowEv(%"class.boost::exception_detail::clone_impl.30"* %7)
  ret void
}

define linkonce_odr void @_ZTv0_n20_N5boost16exception_detail10clone_implINS0_19error_info_injectorINS_10lock_errorEEEED0Ev(%"class.boost::exception_detail::clone_impl.30"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::exception_detail::clone_impl.30"*, align 4
  store %"class.boost::exception_detail::clone_impl.30"* %this, %"class.boost::exception_detail::clone_impl.30"** %this.addr, align 4
  %this1 = load %"class.boost::exception_detail::clone_impl.30"** %this.addr
  %0 = bitcast %"class.boost::exception_detail::clone_impl.30"* %this1 to i8*
  %1 = bitcast i8* %0 to i8**
  %2 = load i8** %1
  %3 = getelementptr inbounds i8* %2, i64 -20
  %4 = bitcast i8* %3 to i32*
  %5 = load i32* %4
  %6 = getelementptr inbounds i8* %0, i32 %5
  %7 = bitcast i8* %6 to %"class.boost::exception_detail::clone_impl.30"*
  call void @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_10lock_errorEEEED0Ev(%"class.boost::exception_detail::clone_impl.30"* %7) nounwind
  ret void
}

define linkonce_odr void @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_10lock_errorEEEEC1ERKS5_(%"class.boost::exception_detail::clone_impl.30"* %this, %"class.boost::exception_detail::clone_impl.30"*) unnamed_addr inlinehint align 2 {
entry:
  %this.addr = alloca %"class.boost::exception_detail::clone_impl.30"*, align 4
  %.addr = alloca %"class.boost::exception_detail::clone_impl.30"*, align 4
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  store %"class.boost::exception_detail::clone_impl.30"* %this, %"class.boost::exception_detail::clone_impl.30"** %this.addr, align 4
  store %"class.boost::exception_detail::clone_impl.30"* %0, %"class.boost::exception_detail::clone_impl.30"** %.addr, align 4
  %this1 = load %"class.boost::exception_detail::clone_impl.30"** %this.addr
  %1 = bitcast %"class.boost::exception_detail::clone_impl.30"* %this1 to i8*
  %2 = getelementptr inbounds i8* %1, i64 40
  %3 = bitcast i8* %2 to %"class.boost::exception_detail::clone_base"*
  %4 = load %"class.boost::exception_detail::clone_impl.30"** %.addr, align 4
  %5 = bitcast %"class.boost::exception_detail::clone_impl.30"* %4 to i8**
  %vtable = load i8** %5
  %vbase.offset.ptr = getelementptr i8* %vtable, i64 -12
  %6 = bitcast i8* %vbase.offset.ptr to i32*
  %vbase.offset = load i32* %6
  %7 = bitcast %"class.boost::exception_detail::clone_impl.30"* %4 to i8*
  %add.ptr = getelementptr inbounds i8* %7, i32 %vbase.offset
  %8 = bitcast i8* %add.ptr to %"class.boost::exception_detail::clone_base"*
  call void @_ZN5boost16exception_detail10clone_baseC2ERKS1_(%"class.boost::exception_detail::clone_base"* %3, %"class.boost::exception_detail::clone_base"* %8) nounwind
  %9 = bitcast %"class.boost::exception_detail::clone_impl.30"* %this1 to %"struct.boost::exception_detail::error_info_injector.31"*
  %10 = load %"class.boost::exception_detail::clone_impl.30"** %.addr, align 4
  %11 = bitcast %"class.boost::exception_detail::clone_impl.30"* %10 to %"struct.boost::exception_detail::error_info_injector.31"*
  invoke void @_ZN5boost16exception_detail19error_info_injectorINS_10lock_errorEEC2ERKS3_(%"struct.boost::exception_detail::error_info_injector.31"* %9, %"struct.boost::exception_detail::error_info_injector.31"* %11)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %entry
  %12 = bitcast %"class.boost::exception_detail::clone_impl.30"* %this1 to i8***
  store i8** getelementptr inbounds ([21 x i8*]* @_ZTVN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_10lock_errorEEEEE, i64 0, i64 3), i8*** %12
  %13 = bitcast %"class.boost::exception_detail::clone_impl.30"* %this1 to i8*
  %add.ptr2 = getelementptr inbounds i8* %13, i32 20
  %14 = bitcast i8* %add.ptr2 to i8***
  store i8** getelementptr inbounds ([21 x i8*]* @_ZTVN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_10lock_errorEEEEE, i64 0, i64 10), i8*** %14
  %15 = bitcast %"class.boost::exception_detail::clone_impl.30"* %this1 to i8*
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
  %20 = bitcast %"class.boost::exception_detail::clone_impl.30"* %this1 to i8*
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

define linkonce_odr void @_ZN5boost16exception_detail19error_info_injectorINS_10lock_errorEEC2ERKS3_(%"struct.boost::exception_detail::error_info_injector.31"* %this, %"struct.boost::exception_detail::error_info_injector.31"*) unnamed_addr inlinehint align 2 {
entry:
  %this.addr = alloca %"struct.boost::exception_detail::error_info_injector.31"*, align 4
  %.addr = alloca %"struct.boost::exception_detail::error_info_injector.31"*, align 4
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  store %"struct.boost::exception_detail::error_info_injector.31"* %this, %"struct.boost::exception_detail::error_info_injector.31"** %this.addr, align 4
  store %"struct.boost::exception_detail::error_info_injector.31"* %0, %"struct.boost::exception_detail::error_info_injector.31"** %.addr, align 4
  %this1 = load %"struct.boost::exception_detail::error_info_injector.31"** %this.addr
  %1 = bitcast %"struct.boost::exception_detail::error_info_injector.31"* %this1 to %"class.boost::lock_error"*
  %2 = load %"struct.boost::exception_detail::error_info_injector.31"** %.addr, align 4
  %3 = bitcast %"struct.boost::exception_detail::error_info_injector.31"* %2 to %"class.boost::lock_error"*
  call void @_ZN5boost10lock_errorC2ERKS0_(%"class.boost::lock_error"* %1, %"class.boost::lock_error"* %3)
  %4 = bitcast %"struct.boost::exception_detail::error_info_injector.31"* %this1 to i8*
  %5 = getelementptr inbounds i8* %4, i64 20
  %6 = bitcast i8* %5 to %"class.boost::exception"*
  %7 = load %"struct.boost::exception_detail::error_info_injector.31"** %.addr, align 4
  %8 = bitcast %"struct.boost::exception_detail::error_info_injector.31"* %7 to i8*
  %add.ptr = getelementptr inbounds i8* %8, i32 20
  %9 = bitcast i8* %add.ptr to %"class.boost::exception"*
  invoke void @_ZN5boost9exceptionC2ERKS0_(%"class.boost::exception"* %6, %"class.boost::exception"* %9)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %entry
  %10 = bitcast %"struct.boost::exception_detail::error_info_injector.31"* %this1 to i8***
  store i8** getelementptr inbounds ([9 x i8*]* @_ZTVN5boost16exception_detail19error_info_injectorINS_10lock_errorEEE, i64 0, i64 2), i8*** %10
  %11 = bitcast %"struct.boost::exception_detail::error_info_injector.31"* %this1 to i8*
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
  %16 = bitcast %"struct.boost::exception_detail::error_info_injector.31"* %this1 to %"class.boost::lock_error"*
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

define linkonce_odr void @_ZN5boost16exception_detail19error_info_injectorINS_10lock_errorEED0Ev(%"struct.boost::exception_detail::error_info_injector.31"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"struct.boost::exception_detail::error_info_injector.31"*, align 4
  store %"struct.boost::exception_detail::error_info_injector.31"* %this, %"struct.boost::exception_detail::error_info_injector.31"** %this.addr, align 4
  %this1 = load %"struct.boost::exception_detail::error_info_injector.31"** %this.addr
  call void @_ZN5boost16exception_detail19error_info_injectorINS_10lock_errorEED1Ev(%"struct.boost::exception_detail::error_info_injector.31"* %this1) nounwind
  %0 = bitcast %"struct.boost::exception_detail::error_info_injector.31"* %this1 to i8*
  call void @_ZdlPv(i8* %0) nounwind
  ret void
}

define linkonce_odr void @_ZThn20_N5boost16exception_detail19error_info_injectorINS_10lock_errorEED0Ev(%"struct.boost::exception_detail::error_info_injector.31"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"struct.boost::exception_detail::error_info_injector.31"*, align 4
  store %"struct.boost::exception_detail::error_info_injector.31"* %this, %"struct.boost::exception_detail::error_info_injector.31"** %this.addr, align 4
  %this1 = load %"struct.boost::exception_detail::error_info_injector.31"** %this.addr
  %0 = bitcast %"struct.boost::exception_detail::error_info_injector.31"* %this1 to i8*
  %1 = getelementptr inbounds i8* %0, i64 -20
  %2 = bitcast i8* %1 to %"struct.boost::exception_detail::error_info_injector.31"*
  call void @_ZN5boost16exception_detail19error_info_injectorINS_10lock_errorEED0Ev(%"struct.boost::exception_detail::error_info_injector.31"* %2) nounwind
  ret void
}

define linkonce_odr void @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_10lock_errorEEEEC1ERKS5_NS5_9clone_tagE(%"class.boost::exception_detail::clone_impl.30"* %this, %"class.boost::exception_detail::clone_impl.30"* %x) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::exception_detail::clone_impl.30"*, align 4
  %x.addr = alloca %"class.boost::exception_detail::clone_impl.30"*, align 4
  %0 = alloca %"struct.boost::exception_detail::clone_impl<boost::exception_detail::error_info_injector<boost::lock_error> >::clone_tag", align 1
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  store %"class.boost::exception_detail::clone_impl.30"* %this, %"class.boost::exception_detail::clone_impl.30"** %this.addr, align 4
  store %"class.boost::exception_detail::clone_impl.30"* %x, %"class.boost::exception_detail::clone_impl.30"** %x.addr, align 4
  %this1 = load %"class.boost::exception_detail::clone_impl.30"** %this.addr
  %1 = bitcast %"class.boost::exception_detail::clone_impl.30"* %this1 to i8*
  %2 = getelementptr inbounds i8* %1, i64 40
  %3 = bitcast i8* %2 to %"class.boost::exception_detail::clone_base"*
  call void @_ZN5boost16exception_detail10clone_baseC2Ev(%"class.boost::exception_detail::clone_base"* %3) nounwind
  %4 = bitcast %"class.boost::exception_detail::clone_impl.30"* %this1 to %"struct.boost::exception_detail::error_info_injector.31"*
  %5 = load %"class.boost::exception_detail::clone_impl.30"** %x.addr, align 4
  %6 = bitcast %"class.boost::exception_detail::clone_impl.30"* %5 to %"struct.boost::exception_detail::error_info_injector.31"*
  invoke void @_ZN5boost16exception_detail19error_info_injectorINS_10lock_errorEEC2ERKS3_(%"struct.boost::exception_detail::error_info_injector.31"* %4, %"struct.boost::exception_detail::error_info_injector.31"* %6)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %entry
  %7 = bitcast %"class.boost::exception_detail::clone_impl.30"* %this1 to i8***
  store i8** getelementptr inbounds ([21 x i8*]* @_ZTVN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_10lock_errorEEEEE, i64 0, i64 3), i8*** %7
  %8 = bitcast %"class.boost::exception_detail::clone_impl.30"* %this1 to i8*
  %add.ptr = getelementptr inbounds i8* %8, i32 20
  %9 = bitcast i8* %add.ptr to i8***
  store i8** getelementptr inbounds ([21 x i8*]* @_ZTVN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_10lock_errorEEEEE, i64 0, i64 10), i8*** %9
  %10 = bitcast %"class.boost::exception_detail::clone_impl.30"* %this1 to i8*
  %add.ptr2 = getelementptr inbounds i8* %10, i32 40
  %11 = bitcast i8* %add.ptr2 to i8***
  store i8** getelementptr inbounds ([21 x i8*]* @_ZTVN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_10lock_errorEEEEE, i64 0, i64 17), i8*** %11
  %12 = bitcast %"class.boost::exception_detail::clone_impl.30"* %this1 to i8*
  %add.ptr3 = getelementptr inbounds i8* %12, i32 20
  %13 = bitcast i8* %add.ptr3 to %"class.boost::exception"*
  %14 = load %"class.boost::exception_detail::clone_impl.30"** %x.addr, align 4
  %15 = icmp eq %"class.boost::exception_detail::clone_impl.30"* %14, null
  br i1 %15, label %cast.end, label %cast.notnull

cast.notnull:                                     ; preds = %invoke.cont
  %16 = bitcast %"class.boost::exception_detail::clone_impl.30"* %14 to i8*
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
  %24 = bitcast %"class.boost::exception_detail::clone_impl.30"* %this1 to %"struct.boost::exception_detail::error_info_injector.31"*
  call void @_ZN5boost16exception_detail19error_info_injectorINS_10lock_errorEED2Ev(%"struct.boost::exception_detail::error_info_injector.31"* %24) nounwind
  br label %ehcleanup

ehcleanup:                                        ; preds = %lpad5, %lpad
  %25 = bitcast %"class.boost::exception_detail::clone_impl.30"* %this1 to i8*
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

define linkonce_odr void @_ZN5boost16exception_detail19error_info_injectorINS_10lock_errorEEC1ERKS2_(%"struct.boost::exception_detail::error_info_injector.31"* %this, %"class.boost::lock_error"* %x) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"struct.boost::exception_detail::error_info_injector.31"*, align 4
  %x.addr = alloca %"class.boost::lock_error"*, align 4
  store %"struct.boost::exception_detail::error_info_injector.31"* %this, %"struct.boost::exception_detail::error_info_injector.31"** %this.addr, align 4
  store %"class.boost::lock_error"* %x, %"class.boost::lock_error"** %x.addr, align 4
  %this1 = load %"struct.boost::exception_detail::error_info_injector.31"** %this.addr
  %0 = load %"class.boost::lock_error"** %x.addr
  call void @_ZN5boost16exception_detail19error_info_injectorINS_10lock_errorEEC2ERKS2_(%"struct.boost::exception_detail::error_info_injector.31"* %this1, %"class.boost::lock_error"* %0)
  ret void
}

define linkonce_odr void @_ZN5boost16exception_detail19error_info_injectorINS_10lock_errorEEC2ERKS2_(%"struct.boost::exception_detail::error_info_injector.31"* %this, %"class.boost::lock_error"* %x) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"struct.boost::exception_detail::error_info_injector.31"*, align 4
  %x.addr = alloca %"class.boost::lock_error"*, align 4
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  store %"struct.boost::exception_detail::error_info_injector.31"* %this, %"struct.boost::exception_detail::error_info_injector.31"** %this.addr, align 4
  store %"class.boost::lock_error"* %x, %"class.boost::lock_error"** %x.addr, align 4
  %this1 = load %"struct.boost::exception_detail::error_info_injector.31"** %this.addr
  %0 = bitcast %"struct.boost::exception_detail::error_info_injector.31"* %this1 to %"class.boost::lock_error"*
  %1 = load %"class.boost::lock_error"** %x.addr, align 4
  call void @_ZN5boost10lock_errorC2ERKS0_(%"class.boost::lock_error"* %0, %"class.boost::lock_error"* %1)
  %2 = bitcast %"struct.boost::exception_detail::error_info_injector.31"* %this1 to i8*
  %3 = getelementptr inbounds i8* %2, i64 20
  %4 = bitcast i8* %3 to %"class.boost::exception"*
  invoke void @_ZN5boost9exceptionC2Ev(%"class.boost::exception"* %4)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %entry
  %5 = bitcast %"struct.boost::exception_detail::error_info_injector.31"* %this1 to i8***
  store i8** getelementptr inbounds ([9 x i8*]* @_ZTVN5boost16exception_detail19error_info_injectorINS_10lock_errorEEE, i64 0, i64 2), i8*** %5
  %6 = bitcast %"struct.boost::exception_detail::error_info_injector.31"* %this1 to i8*
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
  %11 = bitcast %"struct.boost::exception_detail::error_info_injector.31"* %this1 to %"class.boost::lock_error"*
  call void @_ZN5boost10lock_errorD2Ev(%"class.boost::lock_error"* %11) nounwind
  br label %eh.resume

eh.resume:                                        ; preds = %lpad
  %exn = load i8** %exn.slot
  %sel = load i32* %ehselector.slot
  %lpad.val = insertvalue { i8*, i32 } undef, i8* %exn, 0
  %lpad.val2 = insertvalue { i8*, i32 } %lpad.val, i32 %sel, 1
  resume { i8*, i32 } %lpad.val2
}

define linkonce_odr void @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_10lock_errorEEEEC1ERKS4_(%"class.boost::exception_detail::clone_impl.30"* %this, %"struct.boost::exception_detail::error_info_injector.31"* %x) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::exception_detail::clone_impl.30"*, align 4
  %x.addr = alloca %"struct.boost::exception_detail::error_info_injector.31"*, align 4
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  store %"class.boost::exception_detail::clone_impl.30"* %this, %"class.boost::exception_detail::clone_impl.30"** %this.addr, align 4
  store %"struct.boost::exception_detail::error_info_injector.31"* %x, %"struct.boost::exception_detail::error_info_injector.31"** %x.addr, align 4
  %this1 = load %"class.boost::exception_detail::clone_impl.30"** %this.addr
  %0 = bitcast %"class.boost::exception_detail::clone_impl.30"* %this1 to i8*
  %1 = getelementptr inbounds i8* %0, i64 40
  %2 = bitcast i8* %1 to %"class.boost::exception_detail::clone_base"*
  call void @_ZN5boost16exception_detail10clone_baseC2Ev(%"class.boost::exception_detail::clone_base"* %2) nounwind
  %3 = bitcast %"class.boost::exception_detail::clone_impl.30"* %this1 to %"struct.boost::exception_detail::error_info_injector.31"*
  %4 = load %"struct.boost::exception_detail::error_info_injector.31"** %x.addr, align 4
  invoke void @_ZN5boost16exception_detail19error_info_injectorINS_10lock_errorEEC2ERKS3_(%"struct.boost::exception_detail::error_info_injector.31"* %3, %"struct.boost::exception_detail::error_info_injector.31"* %4)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %entry
  %5 = bitcast %"class.boost::exception_detail::clone_impl.30"* %this1 to i8***
  store i8** getelementptr inbounds ([21 x i8*]* @_ZTVN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_10lock_errorEEEEE, i64 0, i64 3), i8*** %5
  %6 = bitcast %"class.boost::exception_detail::clone_impl.30"* %this1 to i8*
  %add.ptr = getelementptr inbounds i8* %6, i32 20
  %7 = bitcast i8* %add.ptr to i8***
  store i8** getelementptr inbounds ([21 x i8*]* @_ZTVN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_10lock_errorEEEEE, i64 0, i64 10), i8*** %7
  %8 = bitcast %"class.boost::exception_detail::clone_impl.30"* %this1 to i8*
  %add.ptr2 = getelementptr inbounds i8* %8, i32 40
  %9 = bitcast i8* %add.ptr2 to i8***
  store i8** getelementptr inbounds ([21 x i8*]* @_ZTVN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_10lock_errorEEEEE, i64 0, i64 17), i8*** %9
  %10 = bitcast %"class.boost::exception_detail::clone_impl.30"* %this1 to i8*
  %add.ptr3 = getelementptr inbounds i8* %10, i32 20
  %11 = bitcast i8* %add.ptr3 to %"class.boost::exception"*
  %12 = load %"struct.boost::exception_detail::error_info_injector.31"** %x.addr, align 4
  %13 = icmp eq %"struct.boost::exception_detail::error_info_injector.31"* %12, null
  br i1 %13, label %cast.end, label %cast.notnull

cast.notnull:                                     ; preds = %invoke.cont
  %14 = bitcast %"struct.boost::exception_detail::error_info_injector.31"* %12 to i8*
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
  %22 = bitcast %"class.boost::exception_detail::clone_impl.30"* %this1 to %"struct.boost::exception_detail::error_info_injector.31"*
  call void @_ZN5boost16exception_detail19error_info_injectorINS_10lock_errorEED2Ev(%"struct.boost::exception_detail::error_info_injector.31"* %22) nounwind
  br label %ehcleanup

ehcleanup:                                        ; preds = %lpad5, %lpad
  %23 = bitcast %"class.boost::exception_detail::clone_impl.30"* %this1 to i8*
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
  call void @__assert_fail(i8* getelementptr inbounds ([25 x i8]* @.str34, i32 0, i32 0), i8* getelementptr inbounds ([63 x i8]* @.str35, i32 0, i32 0), i32 180, i8* getelementptr inbounds ([61 x i8]* @__PRETTY_FUNCTION__._ZN5boost6detail20interruption_checkerD2Ev, i32 0, i32 0)) noreturn nounwind
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
  call void @__assert_fail(i8* getelementptr inbounds ([25 x i8]* @.str34, i32 0, i32 0), i8* getelementptr inbounds ([63 x i8]* @.str35, i32 0, i32 0), i32 187, i8* getelementptr inbounds ([61 x i8]* @__PRETTY_FUNCTION__._ZN5boost6detail20interruption_checkerD2Ev, i32 0, i32 0)) noreturn nounwind
  unreachable
                                                  ; No predecessors!
  br label %cond.end10

cond.end10:                                       ; preds = %7, %cond.true8
  br label %if.end

if.end:                                           ; preds = %cond.end10, %cond.end
  ret void
}

declare i32 @pthread_mutex_unlock(%union.pthread_mutex_t*) nounwind

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

define linkonce_odr void @_ZN5boost10lock_guardINS_5mutexEED2Ev(%"class.boost::lock_guard"* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::lock_guard"*, align 4
  store %"class.boost::lock_guard"* %this, %"class.boost::lock_guard"** %this.addr, align 4
  %this1 = load %"class.boost::lock_guard"** %this.addr
  %m = getelementptr inbounds %"class.boost::lock_guard"* %this1, i32 0, i32 0
  %ref = load %"class.boost::mutex"** %m, align 4
  call void @_ZN5boost5mutex6unlockEv(%"class.boost::mutex"* %ref)
  ret void
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
  call void @__assert_fail(i8* getelementptr inbounds ([5 x i8]* @.str27, i32 0, i32 0), i8* getelementptr inbounds ([57 x i8]* @.str36, i32 0, i32 0), i32 79, i8* getelementptr inbounds ([28 x i8]* @__PRETTY_FUNCTION__._ZN5boost5mutex6unlockEv, i32 0, i32 0)) noreturn nounwind
  unreachable
                                                  ; No predecessors!
  br label %cond.end

cond.end:                                         ; preds = %2, %cond.true
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
  call void @_ZN5boost10lock_errorC1EiPKc(%"class.boost::lock_error"* %ref.tmp, i32 1, i8* getelementptr inbounds ([31 x i8]* @.str31, i32 0, i32 0))
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
  call void @_ZN5boost10lock_errorC1EiPKc(%"class.boost::lock_error"* %ref.tmp3, i32 1, i8* getelementptr inbounds ([40 x i8]* @.str37, i32 0, i32 0))
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
  call void @__assert_fail(i8* getelementptr inbounds ([23 x i8]* @.str38, i32 0, i32 0), i8* getelementptr inbounds ([63 x i8]* @.str35, i32 0, i32 0), i32 169, i8* getelementptr inbounds ([95 x i8]* @__PRETTY_FUNCTION__._ZN5boost6detail20interruption_checkerC2EP15pthread_mutex_tP14pthread_cond_t, i32 0, i32 0)) noreturn nounwind
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
  call void @__assert_fail(i8* getelementptr inbounds ([23 x i8]* @.str38, i32 0, i32 0), i8* getelementptr inbounds ([63 x i8]* @.str35, i32 0, i32 0), i32 173, i8* getelementptr inbounds ([95 x i8]* @__PRETTY_FUNCTION__._ZN5boost6detail20interruption_checkerC2EP15pthread_mutex_tP14pthread_cond_t, i32 0, i32 0)) noreturn nounwind
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

define linkonce_odr void @_ZN5boost11unique_lockINS_5mutexEED2Ev(%"class.boost::unique_lock"* %this) unnamed_addr nounwind align 2 {
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

define linkonce_odr void @_ZN5boost10posix_time11from_time_tEl(%"class.boost::posix_time::ptime"* noalias sret %agg.result, i32 %t) inlinehint {
entry:
  %t.addr = alloca i32, align 4
  %start = alloca %"class.boost::posix_time::ptime", align 4
  %agg.tmp = alloca %"class.boost::gregorian::date", align 4
  %agg.tmp1 = alloca %"class.boost::gregorian::greg_year", align 4
  %agg.tmp2 = alloca %"class.boost::gregorian::greg_month", align 4
  %agg.tmp3 = alloca %"class.boost::gregorian::greg_day", align 4
  %ref.tmp = alloca %"class.boost::posix_time::seconds", align 4
  store i32 %t, i32* %t.addr, align 4
  call void @_ZN5boost9gregorian9greg_yearC1Et(%"class.boost::gregorian::greg_year"* %agg.tmp1, i16 zeroext 1970)
  call void @_ZN5boost9gregorian10greg_monthC1Et(%"class.boost::gregorian::greg_month"* %agg.tmp2, i16 zeroext 1)
  call void @_ZN5boost9gregorian8greg_dayC1Et(%"class.boost::gregorian::greg_day"* %agg.tmp3, i16 zeroext 1)
  call void @_ZN5boost9gregorian4dateC1ENS0_9greg_yearENS0_10greg_monthENS0_8greg_dayE(%"class.boost::gregorian::date"* %agg.tmp, %"class.boost::gregorian::greg_year"* byval align 4 %agg.tmp1, %"class.boost::gregorian::greg_month"* byval align 4 %agg.tmp2, %"class.boost::gregorian::greg_day"* byval align 4 %agg.tmp3)
  call void @_ZN5boost10posix_time5ptimeC1ENS_9gregorian4dateE(%"class.boost::posix_time::ptime"* %start, %"class.boost::gregorian::date"* byval align 4 %agg.tmp)
  %0 = bitcast %"class.boost::posix_time::ptime"* %start to %"class.boost::date_time::base_time"*
  %1 = load i32* %t.addr, align 4
  call void @_ZN5boost10posix_time7secondsC1El(%"class.boost::posix_time::seconds"* %ref.tmp, i32 %1)
  %2 = bitcast %"class.boost::posix_time::seconds"* %ref.tmp to %"class.boost::posix_time::time_duration"*
  call void @_ZNK5boost9date_time9base_timeINS_10posix_time5ptimeENS0_19counted_time_systemINS0_16counted_time_repINS2_33millisec_posix_time_system_configEEEEEEplERKNS2_13time_durationE(%"class.boost::posix_time::ptime"* sret %agg.result, %"class.boost::date_time::base_time"* %0, %"class.boost::posix_time::time_duration"* %2)
  ret void
}

define linkonce_odr void @_ZNK5boost9date_time9base_timeINS_10posix_time5ptimeENS0_19counted_time_systemINS0_16counted_time_repINS2_33millisec_posix_time_system_configEEEEEEplERKNS2_13time_durationE(%"class.boost::posix_time::ptime"* noalias sret %agg.result, %"class.boost::date_time::base_time"* %this, %"class.boost::posix_time::time_duration"* %td) align 2 {
entry:
  %this.addr = alloca %"class.boost::date_time::base_time"*, align 4
  %td.addr = alloca %"class.boost::posix_time::time_duration"*, align 4
  %ref.tmp = alloca %"struct.boost::date_time::counted_time_rep", align 4
  %agg.tmp = alloca %"class.boost::posix_time::time_duration", align 4
  store %"class.boost::date_time::base_time"* %this, %"class.boost::date_time::base_time"** %this.addr, align 4
  store %"class.boost::posix_time::time_duration"* %td, %"class.boost::posix_time::time_duration"** %td.addr, align 4
  %this1 = load %"class.boost::date_time::base_time"** %this.addr
  %time_ = getelementptr inbounds %"class.boost::date_time::base_time"* %this1, i32 0, i32 0
  %0 = load %"class.boost::posix_time::time_duration"** %td.addr, align 4
  call void @_ZN5boost10posix_time13time_durationC1ERKS1_(%"class.boost::posix_time::time_duration"* %agg.tmp, %"class.boost::posix_time::time_duration"* %0)
  call void @_ZN5boost9date_time19counted_time_systemINS0_16counted_time_repINS_10posix_time33millisec_posix_time_system_configEEEE17add_time_durationERKS5_NS3_13time_durationE(%"struct.boost::date_time::counted_time_rep"* sret %ref.tmp, %"struct.boost::date_time::counted_time_rep"* %time_, %"class.boost::posix_time::time_duration"* %agg.tmp)
  call void @_ZN5boost10posix_time5ptimeC1ERKNS_9date_time16counted_time_repINS0_33millisec_posix_time_system_configEEE(%"class.boost::posix_time::ptime"* %agg.result, %"struct.boost::date_time::counted_time_rep"* %ref.tmp)
  ret void
}

define linkonce_odr void @_ZN5boost10posix_time7secondsC1El(%"class.boost::posix_time::seconds"* %this, i32 %s) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::posix_time::seconds"*, align 4
  %s.addr = alloca i32, align 4
  store %"class.boost::posix_time::seconds"* %this, %"class.boost::posix_time::seconds"** %this.addr, align 4
  store i32 %s, i32* %s.addr, align 4
  %this1 = load %"class.boost::posix_time::seconds"** %this.addr
  %0 = load i32* %s.addr, align 4
  call void @_ZN5boost10posix_time7secondsC2El(%"class.boost::posix_time::seconds"* %this1, i32 %0)
  ret void
}

define linkonce_odr void @_ZN5boost9date_time18subsecond_durationINS_10posix_time13time_durationELx1000000EEC1Ex(%"class.boost::date_time::subsecond_duration"* %this, i64 %ss) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::date_time::subsecond_duration"*, align 4
  %ss.addr = alloca i64, align 8
  store %"class.boost::date_time::subsecond_duration"* %this, %"class.boost::date_time::subsecond_duration"** %this.addr, align 4
  store i64 %ss, i64* %ss.addr, align 8
  %this1 = load %"class.boost::date_time::subsecond_duration"** %this.addr
  %0 = load i64* %ss.addr, align 8
  call void @_ZN5boost9date_time18subsecond_durationINS_10posix_time13time_durationELx1000000EEC2Ex(%"class.boost::date_time::subsecond_duration"* %this1, i64 %0)
  ret void
}

define linkonce_odr void @_ZN5boost9date_time18subsecond_durationINS_10posix_time13time_durationELx1000000EEC2Ex(%"class.boost::date_time::subsecond_duration"* %this, i64 %ss) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::date_time::subsecond_duration"*, align 4
  %ss.addr = alloca i64, align 8
  %agg.tmp = alloca %"class.boost::date_time::int_adapter", align 4
  store %"class.boost::date_time::subsecond_duration"* %this, %"class.boost::date_time::subsecond_duration"** %this.addr, align 4
  store i64 %ss, i64* %ss.addr, align 8
  %this1 = load %"class.boost::date_time::subsecond_duration"** %this.addr
  %0 = bitcast %"class.boost::date_time::subsecond_duration"* %this1 to %"class.boost::posix_time::time_duration"*
  %1 = load i64* %ss.addr, align 8
  %mul = mul nsw i64 %1, 1
  call void @_ZN5boost9date_time11int_adapterIxEC1Ex(%"class.boost::date_time::int_adapter"* %agg.tmp, i64 %mul)
  call void @_ZN5boost10posix_time13time_durationC2ENS_9date_time11int_adapterIxEE(%"class.boost::posix_time::time_duration"* %0, %"class.boost::date_time::int_adapter"* byval align 4 %agg.tmp)
  ret void
}

define linkonce_odr void @_ZN5boost10posix_time13time_durationC2ENS_9date_time11int_adapterIxEE(%"class.boost::posix_time::time_duration"* %this, %"class.boost::date_time::int_adapter"* byval align 4 %tick_count) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::posix_time::time_duration"*, align 4
  %agg.tmp = alloca %"class.boost::date_time::int_adapter", align 4
  store %"class.boost::posix_time::time_duration"* %this, %"class.boost::posix_time::time_duration"** %this.addr, align 4
  %this1 = load %"class.boost::posix_time::time_duration"** %this.addr
  %0 = bitcast %"class.boost::posix_time::time_duration"* %this1 to %"class.boost::date_time::time_duration"*
  %1 = bitcast %"class.boost::date_time::int_adapter"* %agg.tmp to i8*
  %2 = bitcast %"class.boost::date_time::int_adapter"* %tick_count to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %1, i8* %2, i32 8, i32 4, i1 false)
  call void @_ZN5boost9date_time13time_durationINS_10posix_time13time_durationENS0_22time_resolution_traitsINS0_37time_resolution_traits_adapted64_implELNS0_16time_resolutionsE5ELx1000000ELt6EiEEEC2ENS0_11int_adapterIxEE(%"class.boost::date_time::time_duration"* %0, %"class.boost::date_time::int_adapter"* byval align 4 %agg.tmp)
  ret void
}

define linkonce_odr void @_ZN5boost9date_time11int_adapterIxEC1Ex(%"class.boost::date_time::int_adapter"* %this, i64 %v) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::date_time::int_adapter"*, align 4
  %v.addr = alloca i64, align 8
  store %"class.boost::date_time::int_adapter"* %this, %"class.boost::date_time::int_adapter"** %this.addr, align 4
  store i64 %v, i64* %v.addr, align 8
  %this1 = load %"class.boost::date_time::int_adapter"** %this.addr
  %0 = load i64* %v.addr, align 8
  call void @_ZN5boost9date_time11int_adapterIxEC2Ex(%"class.boost::date_time::int_adapter"* %this1, i64 %0)
  ret void
}

define linkonce_odr void @_ZN5boost9date_time11int_adapterIxEC2Ex(%"class.boost::date_time::int_adapter"* %this, i64 %v) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::date_time::int_adapter"*, align 4
  %v.addr = alloca i64, align 8
  store %"class.boost::date_time::int_adapter"* %this, %"class.boost::date_time::int_adapter"** %this.addr, align 4
  store i64 %v, i64* %v.addr, align 8
  %this1 = load %"class.boost::date_time::int_adapter"** %this.addr
  %value_ = getelementptr inbounds %"class.boost::date_time::int_adapter"* %this1, i32 0, i32 0
  %0 = load i64* %v.addr, align 8
  store i64 %0, i64* %value_, align 4
  ret void
}

define linkonce_odr void @_ZN5boost9date_time13time_durationINS_10posix_time13time_durationENS0_22time_resolution_traitsINS0_37time_resolution_traits_adapted64_implELNS0_16time_resolutionsE5ELx1000000ELt6EiEEEC2ENS0_11int_adapterIxEE(%"class.boost::date_time::time_duration"* %this, %"class.boost::date_time::int_adapter"* byval align 4 %in) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::date_time::time_duration"*, align 4
  store %"class.boost::date_time::time_duration"* %this, %"class.boost::date_time::time_duration"** %this.addr, align 4
  %this1 = load %"class.boost::date_time::time_duration"** %this.addr
  %0 = bitcast %"class.boost::date_time::time_duration"* %this1 to %"struct.boost::less_than_comparable.33"*
  %ticks_ = getelementptr inbounds %"class.boost::date_time::time_duration"* %this1, i32 0, i32 0
  %1 = bitcast %"class.boost::date_time::int_adapter"* %ticks_ to i8*
  %2 = bitcast %"class.boost::date_time::int_adapter"* %in to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %1, i8* %2, i32 8, i32 4, i1 false)
  ret void
}

define linkonce_odr void @_ZN5boost10posix_time7secondsC2El(%"class.boost::posix_time::seconds"* %this, i32 %s) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::posix_time::seconds"*, align 4
  %s.addr = alloca i32, align 4
  store %"class.boost::posix_time::seconds"* %this, %"class.boost::posix_time::seconds"** %this.addr, align 4
  store i32 %s, i32* %s.addr, align 4
  %this1 = load %"class.boost::posix_time::seconds"** %this.addr
  %0 = bitcast %"class.boost::posix_time::seconds"* %this1 to %"class.boost::posix_time::time_duration"*
  %1 = load i32* %s.addr, align 4
  call void @_ZN5boost10posix_time13time_durationC2Eiiix(%"class.boost::posix_time::time_duration"* %0, i32 0, i32 0, i32 %1, i64 0)
  ret void
}

define linkonce_odr void @_ZN5boost10posix_time13time_durationC2Eiiix(%"class.boost::posix_time::time_duration"* %this, i32 %hour, i32 %min, i32 %sec, i64 %fs) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::posix_time::time_duration"*, align 4
  %hour.addr = alloca i32, align 4
  %min.addr = alloca i32, align 4
  %sec.addr = alloca i32, align 4
  %fs.addr = alloca i64, align 8
  store %"class.boost::posix_time::time_duration"* %this, %"class.boost::posix_time::time_duration"** %this.addr, align 4
  store i32 %hour, i32* %hour.addr, align 4
  store i32 %min, i32* %min.addr, align 4
  store i32 %sec, i32* %sec.addr, align 4
  store i64 %fs, i64* %fs.addr, align 8
  %this1 = load %"class.boost::posix_time::time_duration"** %this.addr
  %0 = bitcast %"class.boost::posix_time::time_duration"* %this1 to %"class.boost::date_time::time_duration"*
  %1 = load i32* %hour.addr, align 4
  %2 = load i32* %min.addr, align 4
  %3 = load i32* %sec.addr, align 4
  %4 = load i64* %fs.addr, align 8
  call void @_ZN5boost9date_time13time_durationINS_10posix_time13time_durationENS0_22time_resolution_traitsINS0_37time_resolution_traits_adapted64_implELNS0_16time_resolutionsE5ELx1000000ELt6EiEEEC2Eiiix(%"class.boost::date_time::time_duration"* %0, i32 %1, i32 %2, i32 %3, i64 %4)
  ret void
}

define linkonce_odr void @_ZN5boost9date_time13time_durationINS_10posix_time13time_durationENS0_22time_resolution_traitsINS0_37time_resolution_traits_adapted64_implELNS0_16time_resolutionsE5ELx1000000ELt6EiEEEC2Eiiix(%"class.boost::date_time::time_duration"* %this, i32 %hours_in, i32 %minutes_in, i32 %seconds_in, i64 %frac_sec_in) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::date_time::time_duration"*, align 4
  %hours_in.addr = alloca i32, align 4
  %minutes_in.addr = alloca i32, align 4
  %seconds_in.addr = alloca i32, align 4
  %frac_sec_in.addr = alloca i64, align 8
  store %"class.boost::date_time::time_duration"* %this, %"class.boost::date_time::time_duration"** %this.addr, align 4
  store i32 %hours_in, i32* %hours_in.addr, align 4
  store i32 %minutes_in, i32* %minutes_in.addr, align 4
  store i32 %seconds_in, i32* %seconds_in.addr, align 4
  store i64 %frac_sec_in, i64* %frac_sec_in.addr, align 8
  %this1 = load %"class.boost::date_time::time_duration"** %this.addr
  %0 = bitcast %"class.boost::date_time::time_duration"* %this1 to %"struct.boost::less_than_comparable.33"*
  %ticks_ = getelementptr inbounds %"class.boost::date_time::time_duration"* %this1, i32 0, i32 0
  %1 = load i32* %hours_in.addr, align 4
  %2 = load i32* %minutes_in.addr, align 4
  %3 = load i32* %seconds_in.addr, align 4
  %4 = load i64* %frac_sec_in.addr, align 8
  %call = call i64 @_ZN5boost9date_time22time_resolution_traitsINS0_37time_resolution_traits_adapted64_implELNS0_16time_resolutionsE5ELx1000000ELt6EiE13to_tick_countEiiix(i32 %1, i32 %2, i32 %3, i64 %4)
  call void @_ZN5boost9date_time11int_adapterIxEC1Ex(%"class.boost::date_time::int_adapter"* %ticks_, i64 %call)
  ret void
}

define linkonce_odr i64 @_ZN5boost9date_time22time_resolution_traitsINS0_37time_resolution_traits_adapted64_implELNS0_16time_resolutionsE5ELx1000000ELt6EiE13to_tick_countEiiix(i32 %hours, i32 %minutes, i32 %seconds, i64 %fs) align 2 {
entry:
  %retval = alloca i64, align 4
  %hours.addr = alloca i32, align 4
  %minutes.addr = alloca i32, align 4
  %seconds.addr = alloca i32, align 4
  %fs.addr = alloca i64, align 8
  store i32 %hours, i32* %hours.addr, align 4
  store i32 %minutes, i32* %minutes.addr, align 4
  store i32 %seconds, i32* %seconds.addr, align 4
  store i64 %fs, i64* %fs.addr, align 8
  %0 = load i32* %hours.addr, align 4
  %cmp = icmp slt i32 %0, 0
  br i1 %cmp, label %if.then, label %lor.lhs.false

lor.lhs.false:                                    ; preds = %entry
  %1 = load i32* %minutes.addr, align 4
  %cmp1 = icmp slt i32 %1, 0
  br i1 %cmp1, label %if.then, label %lor.lhs.false2

lor.lhs.false2:                                   ; preds = %lor.lhs.false
  %2 = load i32* %seconds.addr, align 4
  %cmp3 = icmp slt i32 %2, 0
  br i1 %cmp3, label %if.then, label %lor.lhs.false4

lor.lhs.false4:                                   ; preds = %lor.lhs.false2
  %3 = load i64* %fs.addr, align 8
  %cmp5 = icmp slt i64 %3, 0
  br i1 %cmp5, label %if.then, label %if.end

if.then:                                          ; preds = %lor.lhs.false4, %lor.lhs.false2, %lor.lhs.false, %entry
  %4 = load i32* %hours.addr, align 4
  %call = call i32 @_ZN5boost9date_time14absolute_valueIiEET_S2_(i32 %4)
  store i32 %call, i32* %hours.addr, align 4
  %5 = load i32* %minutes.addr, align 4
  %call6 = call i32 @_ZN5boost9date_time14absolute_valueIiEET_S2_(i32 %5)
  store i32 %call6, i32* %minutes.addr, align 4
  %6 = load i32* %seconds.addr, align 4
  %call7 = call i32 @_ZN5boost9date_time14absolute_valueIiEET_S2_(i32 %6)
  store i32 %call7, i32* %seconds.addr, align 4
  %7 = load i64* %fs.addr, align 8
  %call8 = call i64 @_ZN5boost9date_time14absolute_valueIxEET_S2_(i64 %7)
  store i64 %call8, i64* %fs.addr, align 8
  %8 = load i32* %hours.addr, align 4
  %conv = sext i32 %8 to i64
  %mul = mul nsw i64 %conv, 3600
  %9 = load i32* %minutes.addr, align 4
  %conv9 = sext i32 %9 to i64
  %mul10 = mul nsw i64 %conv9, 60
  %add = add nsw i64 %mul, %mul10
  %10 = load i32* %seconds.addr, align 4
  %conv11 = sext i32 %10 to i64
  %add12 = add nsw i64 %add, %conv11
  %call13 = call i64 @_ZN5boost9date_time22time_resolution_traitsINS0_37time_resolution_traits_adapted64_implELNS0_16time_resolutionsE5ELx1000000ELt6EiE10res_adjustEv()
  %mul14 = mul nsw i64 %add12, %call13
  %11 = load i64* %fs.addr, align 8
  %add15 = add nsw i64 %mul14, %11
  %mul16 = mul nsw i64 %add15, -1
  store i64 %mul16, i64* %retval
  br label %return

if.end:                                           ; preds = %lor.lhs.false4
  %12 = load i32* %hours.addr, align 4
  %conv17 = sext i32 %12 to i64
  %mul18 = mul nsw i64 %conv17, 3600
  %13 = load i32* %minutes.addr, align 4
  %conv19 = sext i32 %13 to i64
  %mul20 = mul nsw i64 %conv19, 60
  %add21 = add nsw i64 %mul18, %mul20
  %14 = load i32* %seconds.addr, align 4
  %conv22 = sext i32 %14 to i64
  %add23 = add nsw i64 %add21, %conv22
  %call24 = call i64 @_ZN5boost9date_time22time_resolution_traitsINS0_37time_resolution_traits_adapted64_implELNS0_16time_resolutionsE5ELx1000000ELt6EiE10res_adjustEv()
  %mul25 = mul nsw i64 %add23, %call24
  %15 = load i64* %fs.addr, align 8
  %add26 = add nsw i64 %mul25, %15
  store i64 %add26, i64* %retval
  br label %return

return:                                           ; preds = %if.end, %if.then
  %16 = load i64* %retval
  ret i64 %16
}

define linkonce_odr i32 @_ZN5boost9date_time14absolute_valueIiEET_S2_(i32 %x) nounwind inlinehint {
entry:
  %x.addr = alloca i32, align 4
  store i32 %x, i32* %x.addr, align 4
  %0 = load i32* %x.addr, align 4
  %cmp = icmp slt i32 %0, 0
  br i1 %cmp, label %cond.true, label %cond.false

cond.true:                                        ; preds = %entry
  %1 = load i32* %x.addr, align 4
  %sub = sub nsw i32 0, %1
  br label %cond.end

cond.false:                                       ; preds = %entry
  %2 = load i32* %x.addr, align 4
  br label %cond.end

cond.end:                                         ; preds = %cond.false, %cond.true
  %cond = phi i32 [ %sub, %cond.true ], [ %2, %cond.false ]
  ret i32 %cond
}

define linkonce_odr i64 @_ZN5boost9date_time14absolute_valueIxEET_S2_(i64 %x) nounwind inlinehint {
entry:
  %x.addr = alloca i64, align 8
  store i64 %x, i64* %x.addr, align 8
  %0 = load i64* %x.addr, align 8
  %cmp = icmp slt i64 %0, 0
  br i1 %cmp, label %cond.true, label %cond.false

cond.true:                                        ; preds = %entry
  %1 = load i64* %x.addr, align 8
  %sub = sub nsw i64 0, %1
  br label %cond.end

cond.false:                                       ; preds = %entry
  %2 = load i64* %x.addr, align 8
  br label %cond.end

cond.end:                                         ; preds = %cond.false, %cond.true
  %cond = phi i64 [ %sub, %cond.true ], [ %2, %cond.false ]
  ret i64 %cond
}

define linkonce_odr i64 @_ZN5boost9date_time22time_resolution_traitsINS0_37time_resolution_traits_adapted64_implELNS0_16time_resolutionsE5ELx1000000ELt6EiE10res_adjustEv() nounwind align 2 {
entry:
  ret i64 1000000
}

define linkonce_odr void @_ZN5boost10posix_time5ptimeC1ERKNS_9date_time16counted_time_repINS0_33millisec_posix_time_system_configEEE(%"class.boost::posix_time::ptime"* %this, %"struct.boost::date_time::counted_time_rep"* %rhs) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::posix_time::ptime"*, align 4
  %rhs.addr = alloca %"struct.boost::date_time::counted_time_rep"*, align 4
  store %"class.boost::posix_time::ptime"* %this, %"class.boost::posix_time::ptime"** %this.addr, align 4
  store %"struct.boost::date_time::counted_time_rep"* %rhs, %"struct.boost::date_time::counted_time_rep"** %rhs.addr, align 4
  %this1 = load %"class.boost::posix_time::ptime"** %this.addr
  %0 = load %"struct.boost::date_time::counted_time_rep"** %rhs.addr
  call void @_ZN5boost10posix_time5ptimeC2ERKNS_9date_time16counted_time_repINS0_33millisec_posix_time_system_configEEE(%"class.boost::posix_time::ptime"* %this1, %"struct.boost::date_time::counted_time_rep"* %0)
  ret void
}

define linkonce_odr void @_ZN5boost9date_time19counted_time_systemINS0_16counted_time_repINS_10posix_time33millisec_posix_time_system_configEEEE17add_time_durationERKS5_NS3_13time_durationE(%"struct.boost::date_time::counted_time_rep"* noalias sret %agg.result, %"struct.boost::date_time::counted_time_rep"* %base, %"class.boost::posix_time::time_duration"* %td) align 2 {
entry:
  %base.addr = alloca %"struct.boost::date_time::counted_time_rep"*, align 4
  %agg.tmp = alloca %"class.boost::date_time::int_adapter", align 4
  %tmp = alloca %"class.boost::date_time::int_adapter", align 4
  %ref.tmp = alloca %"class.boost::date_time::int_adapter", align 4
  store %"struct.boost::date_time::counted_time_rep"* %base, %"struct.boost::date_time::counted_time_rep"** %base.addr, align 4
  %0 = load %"struct.boost::date_time::counted_time_rep"** %base.addr, align 4
  %call = call zeroext i1 @_ZNK5boost9date_time16counted_time_repINS_10posix_time33millisec_posix_time_system_configEE10is_specialEv(%"struct.boost::date_time::counted_time_rep"* %0)
  br i1 %call, label %if.then, label %lor.lhs.false

lor.lhs.false:                                    ; preds = %entry
  %1 = bitcast %"class.boost::posix_time::time_duration"* %td to %"class.boost::date_time::time_duration"*
  %call1 = call zeroext i1 @_ZNK5boost9date_time13time_durationINS_10posix_time13time_durationENS0_22time_resolution_traitsINS0_37time_resolution_traits_adapted64_implELNS0_16time_resolutionsE5ELx1000000ELt6EiEEE10is_specialEv(%"class.boost::date_time::time_duration"* %1)
  br i1 %call1, label %if.then, label %if.else

if.then:                                          ; preds = %lor.lhs.false, %entry
  %2 = load %"struct.boost::date_time::counted_time_rep"** %base.addr, align 4
  call void @_ZNK5boost9date_time16counted_time_repINS_10posix_time33millisec_posix_time_system_configEE7get_repEv(%"class.boost::date_time::int_adapter"* sret %tmp, %"struct.boost::date_time::counted_time_rep"* %2)
  %3 = bitcast %"class.boost::posix_time::time_duration"* %td to %"class.boost::date_time::time_duration"*
  call void @_ZNK5boost9date_time13time_durationINS_10posix_time13time_durationENS0_22time_resolution_traitsINS0_37time_resolution_traits_adapted64_implELNS0_16time_resolutionsE5ELx1000000ELt6EiEEE7get_repEv(%"class.boost::date_time::int_adapter"* sret %ref.tmp, %"class.boost::date_time::time_duration"* %3)
  call void @_ZNK5boost9date_time11int_adapterIxEplIxEES2_RKNS1_IT_EE(%"class.boost::date_time::int_adapter"* sret %agg.tmp, %"class.boost::date_time::int_adapter"* %tmp, %"class.boost::date_time::int_adapter"* %ref.tmp)
  call void @_ZN5boost9date_time16counted_time_repINS_10posix_time33millisec_posix_time_system_configEEC1ENS0_11int_adapterIxEE(%"struct.boost::date_time::counted_time_rep"* %agg.result, %"class.boost::date_time::int_adapter"* byval align 4 %agg.tmp)
  br label %return

if.else:                                          ; preds = %lor.lhs.false
  %4 = load %"struct.boost::date_time::counted_time_rep"** %base.addr, align 4
  %call2 = call i64 @_ZNK5boost9date_time16counted_time_repINS_10posix_time33millisec_posix_time_system_configEE10time_countEv(%"struct.boost::date_time::counted_time_rep"* %4)
  %5 = bitcast %"class.boost::posix_time::time_duration"* %td to %"class.boost::date_time::time_duration"*
  %call3 = call i64 @_ZNK5boost9date_time13time_durationINS_10posix_time13time_durationENS0_22time_resolution_traitsINS0_37time_resolution_traits_adapted64_implELNS0_16time_resolutionsE5ELx1000000ELt6EiEEE5ticksEv(%"class.boost::date_time::time_duration"* %5)
  %add = add nsw i64 %call2, %call3
  call void @_ZN5boost9date_time16counted_time_repINS_10posix_time33millisec_posix_time_system_configEEC1Ex(%"struct.boost::date_time::counted_time_rep"* %agg.result, i64 %add)
  br label %return

return:                                           ; preds = %if.else, %if.then
  ret void
}

define linkonce_odr void @_ZN5boost10posix_time13time_durationC1ERKS1_(%"class.boost::posix_time::time_duration"* %this, %"class.boost::posix_time::time_duration"*) unnamed_addr inlinehint align 2 {
entry:
  %this.addr = alloca %"class.boost::posix_time::time_duration"*, align 4
  %.addr = alloca %"class.boost::posix_time::time_duration"*, align 4
  store %"class.boost::posix_time::time_duration"* %this, %"class.boost::posix_time::time_duration"** %this.addr, align 4
  store %"class.boost::posix_time::time_duration"* %0, %"class.boost::posix_time::time_duration"** %.addr, align 4
  %this1 = load %"class.boost::posix_time::time_duration"** %this.addr
  %1 = load %"class.boost::posix_time::time_duration"** %.addr
  call void @_ZN5boost10posix_time13time_durationC2ERKS1_(%"class.boost::posix_time::time_duration"* %this1, %"class.boost::posix_time::time_duration"* %1)
  ret void
}

define linkonce_odr void @_ZN5boost10posix_time13time_durationC2ERKS1_(%"class.boost::posix_time::time_duration"* %this, %"class.boost::posix_time::time_duration"*) unnamed_addr inlinehint align 2 {
entry:
  %this.addr = alloca %"class.boost::posix_time::time_duration"*, align 4
  %.addr = alloca %"class.boost::posix_time::time_duration"*, align 4
  store %"class.boost::posix_time::time_duration"* %this, %"class.boost::posix_time::time_duration"** %this.addr, align 4
  store %"class.boost::posix_time::time_duration"* %0, %"class.boost::posix_time::time_duration"** %.addr, align 4
  %this1 = load %"class.boost::posix_time::time_duration"** %this.addr
  %1 = bitcast %"class.boost::posix_time::time_duration"* %this1 to %"class.boost::date_time::time_duration"*
  %2 = load %"class.boost::posix_time::time_duration"** %.addr, align 4
  %3 = bitcast %"class.boost::posix_time::time_duration"* %2 to %"class.boost::date_time::time_duration"*
  call void @_ZN5boost9date_time13time_durationINS_10posix_time13time_durationENS0_22time_resolution_traitsINS0_37time_resolution_traits_adapted64_implELNS0_16time_resolutionsE5ELx1000000ELt6EiEEEC2ERKS8_(%"class.boost::date_time::time_duration"* %1, %"class.boost::date_time::time_duration"* %3)
  ret void
}

define linkonce_odr void @_ZN5boost9date_time13time_durationINS_10posix_time13time_durationENS0_22time_resolution_traitsINS0_37time_resolution_traits_adapted64_implELNS0_16time_resolutionsE5ELx1000000ELt6EiEEEC2ERKS8_(%"class.boost::date_time::time_duration"* %this, %"class.boost::date_time::time_duration"* %other) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::date_time::time_duration"*, align 4
  %other.addr = alloca %"class.boost::date_time::time_duration"*, align 4
  store %"class.boost::date_time::time_duration"* %this, %"class.boost::date_time::time_duration"** %this.addr, align 4
  store %"class.boost::date_time::time_duration"* %other, %"class.boost::date_time::time_duration"** %other.addr, align 4
  %this1 = load %"class.boost::date_time::time_duration"** %this.addr
  %0 = bitcast %"class.boost::date_time::time_duration"* %this1 to %"struct.boost::less_than_comparable.33"*
  %ticks_ = getelementptr inbounds %"class.boost::date_time::time_duration"* %this1, i32 0, i32 0
  %1 = load %"class.boost::date_time::time_duration"** %other.addr, align 4
  %ticks_2 = getelementptr inbounds %"class.boost::date_time::time_duration"* %1, i32 0, i32 0
  %2 = bitcast %"class.boost::date_time::int_adapter"* %ticks_ to i8*
  %3 = bitcast %"class.boost::date_time::int_adapter"* %ticks_2 to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %2, i8* %3, i32 8, i32 4, i1 false)
  ret void
}

define linkonce_odr zeroext i1 @_ZNK5boost9date_time16counted_time_repINS_10posix_time33millisec_posix_time_system_configEE10is_specialEv(%"struct.boost::date_time::counted_time_rep"* %this) align 2 {
entry:
  %this.addr = alloca %"struct.boost::date_time::counted_time_rep"*, align 4
  store %"struct.boost::date_time::counted_time_rep"* %this, %"struct.boost::date_time::counted_time_rep"** %this.addr, align 4
  %this1 = load %"struct.boost::date_time::counted_time_rep"** %this.addr
  %time_count_ = getelementptr inbounds %"struct.boost::date_time::counted_time_rep"* %this1, i32 0, i32 0
  %call = call zeroext i1 @_ZNK5boost9date_time11int_adapterIxE10is_specialEv(%"class.boost::date_time::int_adapter"* %time_count_)
  ret i1 %call
}

define linkonce_odr zeroext i1 @_ZNK5boost9date_time13time_durationINS_10posix_time13time_durationENS0_22time_resolution_traitsINS0_37time_resolution_traits_adapted64_implELNS0_16time_resolutionsE5ELx1000000ELt6EiEEE10is_specialEv(%"class.boost::date_time::time_duration"* %this) align 2 {
entry:
  %retval = alloca i1, align 1
  %this.addr = alloca %"class.boost::date_time::time_duration"*, align 4
  store %"class.boost::date_time::time_duration"* %this, %"class.boost::date_time::time_duration"** %this.addr, align 4
  %this1 = load %"class.boost::date_time::time_duration"** %this.addr
  %call = call zeroext i1 @_ZN5boost9date_time22time_resolution_traitsINS0_37time_resolution_traits_adapted64_implELNS0_16time_resolutionsE5ELx1000000ELt6EiE10is_adaptedEv()
  br i1 %call, label %if.then, label %if.else

if.then:                                          ; preds = %entry
  %ticks_ = getelementptr inbounds %"class.boost::date_time::time_duration"* %this1, i32 0, i32 0
  %call2 = call zeroext i1 @_ZNK5boost9date_time11int_adapterIxE10is_specialEv(%"class.boost::date_time::int_adapter"* %ticks_)
  store i1 %call2, i1* %retval
  br label %return

if.else:                                          ; preds = %entry
  store i1 false, i1* %retval
  br label %return

return:                                           ; preds = %if.else, %if.then
  %0 = load i1* %retval
  ret i1 %0
}

define linkonce_odr void @_ZN5boost9date_time16counted_time_repINS_10posix_time33millisec_posix_time_system_configEEC1ENS0_11int_adapterIxEE(%"struct.boost::date_time::counted_time_rep"* %this, %"class.boost::date_time::int_adapter"* byval align 4 %count) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"struct.boost::date_time::counted_time_rep"*, align 4
  store %"struct.boost::date_time::counted_time_rep"* %this, %"struct.boost::date_time::counted_time_rep"** %this.addr, align 4
  %this1 = load %"struct.boost::date_time::counted_time_rep"** %this.addr
  call void @_ZN5boost9date_time16counted_time_repINS_10posix_time33millisec_posix_time_system_configEEC2ENS0_11int_adapterIxEE(%"struct.boost::date_time::counted_time_rep"* %this1, %"class.boost::date_time::int_adapter"* byval align 4 %count)
  ret void
}

define linkonce_odr void @_ZNK5boost9date_time16counted_time_repINS_10posix_time33millisec_posix_time_system_configEE7get_repEv(%"class.boost::date_time::int_adapter"* noalias sret %agg.result, %"struct.boost::date_time::counted_time_rep"* %this) nounwind align 2 {
entry:
  %this.addr = alloca %"struct.boost::date_time::counted_time_rep"*, align 4
  store %"struct.boost::date_time::counted_time_rep"* %this, %"struct.boost::date_time::counted_time_rep"** %this.addr, align 4
  %this1 = load %"struct.boost::date_time::counted_time_rep"** %this.addr
  %time_count_ = getelementptr inbounds %"struct.boost::date_time::counted_time_rep"* %this1, i32 0, i32 0
  %0 = bitcast %"class.boost::date_time::int_adapter"* %agg.result to i8*
  %1 = bitcast %"class.boost::date_time::int_adapter"* %time_count_ to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %0, i8* %1, i32 8, i32 4, i1 false)
  ret void
}

define linkonce_odr void @_ZNK5boost9date_time11int_adapterIxEplIxEES2_RKNS1_IT_EE(%"class.boost::date_time::int_adapter"* noalias sret %agg.result, %"class.boost::date_time::int_adapter"* %this, %"class.boost::date_time::int_adapter"* %rhs) inlinehint align 2 {
entry:
  %this.addr = alloca %"class.boost::date_time::int_adapter"*, align 4
  %rhs.addr = alloca %"class.boost::date_time::int_adapter"*, align 4
  store %"class.boost::date_time::int_adapter"* %this, %"class.boost::date_time::int_adapter"** %this.addr, align 4
  store %"class.boost::date_time::int_adapter"* %rhs, %"class.boost::date_time::int_adapter"** %rhs.addr, align 4
  %this1 = load %"class.boost::date_time::int_adapter"** %this.addr
  %call = call zeroext i1 @_ZNK5boost9date_time11int_adapterIxE10is_specialEv(%"class.boost::date_time::int_adapter"* %this1)
  br i1 %call, label %if.then, label %lor.lhs.false

lor.lhs.false:                                    ; preds = %entry
  %0 = load %"class.boost::date_time::int_adapter"** %rhs.addr, align 4
  %call2 = call zeroext i1 @_ZNK5boost9date_time11int_adapterIxE10is_specialEv(%"class.boost::date_time::int_adapter"* %0)
  br i1 %call2, label %if.then, label %if.end29

if.then:                                          ; preds = %lor.lhs.false, %entry
  %call3 = call zeroext i1 @_ZNK5boost9date_time11int_adapterIxE6is_nanEv(%"class.boost::date_time::int_adapter"* %this1)
  br i1 %call3, label %if.then6, label %lor.lhs.false4

lor.lhs.false4:                                   ; preds = %if.then
  %1 = load %"class.boost::date_time::int_adapter"** %rhs.addr, align 4
  %call5 = call zeroext i1 @_ZNK5boost9date_time11int_adapterIxE6is_nanEv(%"class.boost::date_time::int_adapter"* %1)
  br i1 %call5, label %if.then6, label %if.end

if.then6:                                         ; preds = %lor.lhs.false4, %if.then
  call void @_ZN5boost9date_time11int_adapterIxE12not_a_numberEv(%"class.boost::date_time::int_adapter"* sret %agg.result)
  br label %return

if.end:                                           ; preds = %lor.lhs.false4
  %value_ = getelementptr inbounds %"class.boost::date_time::int_adapter"* %this1, i32 0, i32 0
  %2 = load i64* %value_, align 4
  %call7 = call zeroext i1 @_ZN5boost9date_time11int_adapterIxE10is_pos_infEx(i64 %2)
  br i1 %call7, label %land.lhs.true, label %lor.lhs.false10

land.lhs.true:                                    ; preds = %if.end
  %3 = load %"class.boost::date_time::int_adapter"** %rhs.addr, align 4
  %4 = load %"class.boost::date_time::int_adapter"** %rhs.addr, align 4
  %call8 = call i64 @_ZNK5boost9date_time11int_adapterIxE9as_numberEv(%"class.boost::date_time::int_adapter"* %4)
  %call9 = call zeroext i1 @_ZN5boost9date_time11int_adapterIxE10is_neg_infEx(i64 %call8)
  br i1 %call9, label %if.then16, label %lor.lhs.false10

lor.lhs.false10:                                  ; preds = %land.lhs.true, %if.end
  %value_11 = getelementptr inbounds %"class.boost::date_time::int_adapter"* %this1, i32 0, i32 0
  %5 = load i64* %value_11, align 4
  %call12 = call zeroext i1 @_ZN5boost9date_time11int_adapterIxE10is_neg_infEx(i64 %5)
  br i1 %call12, label %land.lhs.true13, label %if.end17

land.lhs.true13:                                  ; preds = %lor.lhs.false10
  %6 = load %"class.boost::date_time::int_adapter"** %rhs.addr, align 4
  %7 = load %"class.boost::date_time::int_adapter"** %rhs.addr, align 4
  %call14 = call i64 @_ZNK5boost9date_time11int_adapterIxE9as_numberEv(%"class.boost::date_time::int_adapter"* %7)
  %call15 = call zeroext i1 @_ZN5boost9date_time11int_adapterIxE10is_pos_infEx(i64 %call14)
  br i1 %call15, label %if.then16, label %if.end17

if.then16:                                        ; preds = %land.lhs.true13, %land.lhs.true
  call void @_ZN5boost9date_time11int_adapterIxE12not_a_numberEv(%"class.boost::date_time::int_adapter"* sret %agg.result)
  br label %return

if.end17:                                         ; preds = %land.lhs.true13, %lor.lhs.false10
  %call18 = call zeroext i1 @_ZNK5boost9date_time11int_adapterIxE11is_infinityEv(%"class.boost::date_time::int_adapter"* %this1)
  br i1 %call18, label %if.then19, label %if.end20

if.then19:                                        ; preds = %if.end17
  %8 = bitcast %"class.boost::date_time::int_adapter"* %agg.result to i8*
  %9 = bitcast %"class.boost::date_time::int_adapter"* %this1 to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %8, i8* %9, i32 8, i32 4, i1 false)
  br label %return

if.end20:                                         ; preds = %if.end17
  %10 = load %"class.boost::date_time::int_adapter"** %rhs.addr, align 4
  %11 = load %"class.boost::date_time::int_adapter"** %rhs.addr, align 4
  %call21 = call i64 @_ZNK5boost9date_time11int_adapterIxE9as_numberEv(%"class.boost::date_time::int_adapter"* %11)
  %call22 = call zeroext i1 @_ZN5boost9date_time11int_adapterIxE10is_pos_infEx(i64 %call21)
  br i1 %call22, label %if.then23, label %if.end24

if.then23:                                        ; preds = %if.end20
  call void @_ZN5boost9date_time11int_adapterIxE12pos_infinityEv(%"class.boost::date_time::int_adapter"* sret %agg.result)
  br label %return

if.end24:                                         ; preds = %if.end20
  %12 = load %"class.boost::date_time::int_adapter"** %rhs.addr, align 4
  %13 = load %"class.boost::date_time::int_adapter"** %rhs.addr, align 4
  %call25 = call i64 @_ZNK5boost9date_time11int_adapterIxE9as_numberEv(%"class.boost::date_time::int_adapter"* %13)
  %call26 = call zeroext i1 @_ZN5boost9date_time11int_adapterIxE10is_neg_infEx(i64 %call25)
  br i1 %call26, label %if.then27, label %if.end28

if.then27:                                        ; preds = %if.end24
  call void @_ZN5boost9date_time11int_adapterIxE12neg_infinityEv(%"class.boost::date_time::int_adapter"* sret %agg.result)
  br label %return

if.end28:                                         ; preds = %if.end24
  br label %if.end29

if.end29:                                         ; preds = %if.end28, %lor.lhs.false
  %value_30 = getelementptr inbounds %"class.boost::date_time::int_adapter"* %this1, i32 0, i32 0
  %14 = load i64* %value_30, align 4
  %15 = load %"class.boost::date_time::int_adapter"** %rhs.addr, align 4
  %call31 = call i64 @_ZNK5boost9date_time11int_adapterIxE9as_numberEv(%"class.boost::date_time::int_adapter"* %15)
  %add = add nsw i64 %14, %call31
  call void @_ZN5boost9date_time11int_adapterIxEC1Ex(%"class.boost::date_time::int_adapter"* %agg.result, i64 %add)
  br label %return

return:                                           ; preds = %if.end29, %if.then27, %if.then23, %if.then19, %if.then16, %if.then6
  ret void
}

define linkonce_odr void @_ZNK5boost9date_time13time_durationINS_10posix_time13time_durationENS0_22time_resolution_traitsINS0_37time_resolution_traits_adapted64_implELNS0_16time_resolutionsE5ELx1000000ELt6EiEEE7get_repEv(%"class.boost::date_time::int_adapter"* noalias sret %agg.result, %"class.boost::date_time::time_duration"* %this) nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::date_time::time_duration"*, align 4
  store %"class.boost::date_time::time_duration"* %this, %"class.boost::date_time::time_duration"** %this.addr, align 4
  %this1 = load %"class.boost::date_time::time_duration"** %this.addr
  %ticks_ = getelementptr inbounds %"class.boost::date_time::time_duration"* %this1, i32 0, i32 0
  %0 = bitcast %"class.boost::date_time::int_adapter"* %agg.result to i8*
  %1 = bitcast %"class.boost::date_time::int_adapter"* %ticks_ to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %0, i8* %1, i32 8, i32 4, i1 false)
  ret void
}

define linkonce_odr void @_ZN5boost9date_time16counted_time_repINS_10posix_time33millisec_posix_time_system_configEEC1Ex(%"struct.boost::date_time::counted_time_rep"* %this, i64 %count) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"struct.boost::date_time::counted_time_rep"*, align 4
  %count.addr = alloca i64, align 8
  store %"struct.boost::date_time::counted_time_rep"* %this, %"struct.boost::date_time::counted_time_rep"** %this.addr, align 4
  store i64 %count, i64* %count.addr, align 8
  %this1 = load %"struct.boost::date_time::counted_time_rep"** %this.addr
  %0 = load i64* %count.addr, align 8
  call void @_ZN5boost9date_time16counted_time_repINS_10posix_time33millisec_posix_time_system_configEEC2Ex(%"struct.boost::date_time::counted_time_rep"* %this1, i64 %0)
  ret void
}

define linkonce_odr i64 @_ZNK5boost9date_time16counted_time_repINS_10posix_time33millisec_posix_time_system_configEE10time_countEv(%"struct.boost::date_time::counted_time_rep"* %this) align 2 {
entry:
  %this.addr = alloca %"struct.boost::date_time::counted_time_rep"*, align 4
  %agg.tmp = alloca %"class.boost::date_time::int_adapter", align 4
  store %"struct.boost::date_time::counted_time_rep"* %this, %"struct.boost::date_time::counted_time_rep"** %this.addr, align 4
  %this1 = load %"struct.boost::date_time::counted_time_rep"** %this.addr
  %time_count_ = getelementptr inbounds %"struct.boost::date_time::counted_time_rep"* %this1, i32 0, i32 0
  %0 = bitcast %"class.boost::date_time::int_adapter"* %agg.tmp to i8*
  %1 = bitcast %"class.boost::date_time::int_adapter"* %time_count_ to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %0, i8* %1, i32 8, i32 4, i1 false)
  %call = call i64 @_ZN5boost9date_time22time_resolution_traitsINS0_37time_resolution_traits_adapted64_implELNS0_16time_resolutionsE5ELx1000000ELt6EiE9as_numberENS0_11int_adapterIxEE(%"class.boost::date_time::int_adapter"* byval align 4 %agg.tmp)
  ret i64 %call
}

define linkonce_odr i64 @_ZNK5boost9date_time13time_durationINS_10posix_time13time_durationENS0_22time_resolution_traitsINS0_37time_resolution_traits_adapted64_implELNS0_16time_resolutionsE5ELx1000000ELt6EiEEE5ticksEv(%"class.boost::date_time::time_duration"* %this) align 2 {
entry:
  %this.addr = alloca %"class.boost::date_time::time_duration"*, align 4
  %agg.tmp = alloca %"class.boost::date_time::int_adapter", align 4
  store %"class.boost::date_time::time_duration"* %this, %"class.boost::date_time::time_duration"** %this.addr, align 4
  %this1 = load %"class.boost::date_time::time_duration"** %this.addr
  %ticks_ = getelementptr inbounds %"class.boost::date_time::time_duration"* %this1, i32 0, i32 0
  %0 = bitcast %"class.boost::date_time::int_adapter"* %agg.tmp to i8*
  %1 = bitcast %"class.boost::date_time::int_adapter"* %ticks_ to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %0, i8* %1, i32 8, i32 4, i1 false)
  %call = call i64 @_ZN5boost9date_time22time_resolution_traitsINS0_37time_resolution_traits_adapted64_implELNS0_16time_resolutionsE5ELx1000000ELt6EiE9as_numberENS0_11int_adapterIxEE(%"class.boost::date_time::int_adapter"* byval align 4 %agg.tmp)
  ret i64 %call
}

define linkonce_odr i64 @_ZN5boost9date_time22time_resolution_traitsINS0_37time_resolution_traits_adapted64_implELNS0_16time_resolutionsE5ELx1000000ELt6EiE9as_numberENS0_11int_adapterIxEE(%"class.boost::date_time::int_adapter"* byval align 4 %i) align 2 {
entry:
  %agg.tmp = alloca %"class.boost::date_time::int_adapter", align 4
  %0 = bitcast %"class.boost::date_time::int_adapter"* %agg.tmp to i8*
  %1 = bitcast %"class.boost::date_time::int_adapter"* %i to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %0, i8* %1, i32 8, i32 4, i1 false)
  %call = call i64 @_ZN5boost9date_time37time_resolution_traits_adapted64_impl9as_numberENS0_11int_adapterIxEE(%"class.boost::date_time::int_adapter"* byval align 4 %agg.tmp)
  ret i64 %call
}

define linkonce_odr i64 @_ZN5boost9date_time37time_resolution_traits_adapted64_impl9as_numberENS0_11int_adapterIxEE(%"class.boost::date_time::int_adapter"* byval align 4 %i) align 2 {
entry:
  %call = call i64 @_ZNK5boost9date_time11int_adapterIxE9as_numberEv(%"class.boost::date_time::int_adapter"* %i)
  ret i64 %call
}

define linkonce_odr i64 @_ZNK5boost9date_time11int_adapterIxE9as_numberEv(%"class.boost::date_time::int_adapter"* %this) nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::date_time::int_adapter"*, align 4
  store %"class.boost::date_time::int_adapter"* %this, %"class.boost::date_time::int_adapter"** %this.addr, align 4
  %this1 = load %"class.boost::date_time::int_adapter"** %this.addr
  %value_ = getelementptr inbounds %"class.boost::date_time::int_adapter"* %this1, i32 0, i32 0
  %0 = load i64* %value_, align 4
  ret i64 %0
}

define linkonce_odr void @_ZN5boost9date_time16counted_time_repINS_10posix_time33millisec_posix_time_system_configEEC2Ex(%"struct.boost::date_time::counted_time_rep"* %this, i64 %count) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"struct.boost::date_time::counted_time_rep"*, align 4
  %count.addr = alloca i64, align 8
  store %"struct.boost::date_time::counted_time_rep"* %this, %"struct.boost::date_time::counted_time_rep"** %this.addr, align 4
  store i64 %count, i64* %count.addr, align 8
  %this1 = load %"struct.boost::date_time::counted_time_rep"** %this.addr
  %time_count_ = getelementptr inbounds %"struct.boost::date_time::counted_time_rep"* %this1, i32 0, i32 0
  %0 = load i64* %count.addr, align 8
  call void @_ZN5boost9date_time11int_adapterIxEC1Ex(%"class.boost::date_time::int_adapter"* %time_count_, i64 %0)
  ret void
}

define linkonce_odr zeroext i1 @_ZNK5boost9date_time11int_adapterIxE10is_specialEv(%"class.boost::date_time::int_adapter"* %this) align 2 {
entry:
  %this.addr = alloca %"class.boost::date_time::int_adapter"*, align 4
  store %"class.boost::date_time::int_adapter"* %this, %"class.boost::date_time::int_adapter"** %this.addr, align 4
  %this1 = load %"class.boost::date_time::int_adapter"** %this.addr
  %call = call zeroext i1 @_ZNK5boost9date_time11int_adapterIxE11is_infinityEv(%"class.boost::date_time::int_adapter"* %this1)
  br i1 %call, label %lor.end, label %lor.rhs

lor.rhs:                                          ; preds = %entry
  %call2 = call zeroext i1 @_ZNK5boost9date_time11int_adapterIxE6is_nanEv(%"class.boost::date_time::int_adapter"* %this1)
  br label %lor.end

lor.end:                                          ; preds = %lor.rhs, %entry
  %0 = phi i1 [ true, %entry ], [ %call2, %lor.rhs ]
  ret i1 %0
}

define linkonce_odr zeroext i1 @_ZNK5boost9date_time11int_adapterIxE6is_nanEv(%"class.boost::date_time::int_adapter"* %this) align 2 {
entry:
  %this.addr = alloca %"class.boost::date_time::int_adapter"*, align 4
  %tmp = alloca %"class.boost::date_time::int_adapter", align 4
  store %"class.boost::date_time::int_adapter"* %this, %"class.boost::date_time::int_adapter"** %this.addr, align 4
  %this1 = load %"class.boost::date_time::int_adapter"** %this.addr
  %value_ = getelementptr inbounds %"class.boost::date_time::int_adapter"* %this1, i32 0, i32 0
  %0 = load i64* %value_, align 4
  call void @_ZN5boost9date_time11int_adapterIxE12not_a_numberEv(%"class.boost::date_time::int_adapter"* sret %tmp)
  %call = call i64 @_ZNK5boost9date_time11int_adapterIxE9as_numberEv(%"class.boost::date_time::int_adapter"* %tmp)
  %cmp = icmp eq i64 %0, %call
  ret i1 %cmp
}

define linkonce_odr void @_ZN5boost9date_time11int_adapterIxE12not_a_numberEv(%"class.boost::date_time::int_adapter"* noalias sret %agg.result) align 2 {
entry:
  %call = call i64 @_ZNSt14numeric_limitsIxE3maxEv() nounwind
  %sub = sub nsw i64 %call, 1
  call void @_ZN5boost9date_time11int_adapterIxEC1Ex(%"class.boost::date_time::int_adapter"* %agg.result, i64 %sub)
  ret void
}

define linkonce_odr zeroext i1 @_ZN5boost9date_time11int_adapterIxE10is_pos_infEx(i64 %v) align 2 {
entry:
  %v.addr = alloca i64, align 8
  %tmp = alloca %"class.boost::date_time::int_adapter", align 4
  store i64 %v, i64* %v.addr, align 8
  %0 = load i64* %v.addr, align 8
  call void @_ZN5boost9date_time11int_adapterIxE12pos_infinityEv(%"class.boost::date_time::int_adapter"* sret %tmp)
  %call = call i64 @_ZNK5boost9date_time11int_adapterIxE9as_numberEv(%"class.boost::date_time::int_adapter"* %tmp)
  %cmp = icmp eq i64 %0, %call
  ret i1 %cmp
}

define linkonce_odr zeroext i1 @_ZN5boost9date_time11int_adapterIxE10is_neg_infEx(i64 %v) align 2 {
entry:
  %v.addr = alloca i64, align 8
  %tmp = alloca %"class.boost::date_time::int_adapter", align 4
  store i64 %v, i64* %v.addr, align 8
  %0 = load i64* %v.addr, align 8
  call void @_ZN5boost9date_time11int_adapterIxE12neg_infinityEv(%"class.boost::date_time::int_adapter"* sret %tmp)
  %call = call i64 @_ZNK5boost9date_time11int_adapterIxE9as_numberEv(%"class.boost::date_time::int_adapter"* %tmp)
  %cmp = icmp eq i64 %0, %call
  ret i1 %cmp
}

define linkonce_odr zeroext i1 @_ZNK5boost9date_time11int_adapterIxE11is_infinityEv(%"class.boost::date_time::int_adapter"* %this) align 2 {
entry:
  %this.addr = alloca %"class.boost::date_time::int_adapter"*, align 4
  %tmp = alloca %"class.boost::date_time::int_adapter", align 4
  %tmp3 = alloca %"class.boost::date_time::int_adapter", align 4
  store %"class.boost::date_time::int_adapter"* %this, %"class.boost::date_time::int_adapter"** %this.addr, align 4
  %this1 = load %"class.boost::date_time::int_adapter"** %this.addr
  %value_ = getelementptr inbounds %"class.boost::date_time::int_adapter"* %this1, i32 0, i32 0
  %0 = load i64* %value_, align 4
  call void @_ZN5boost9date_time11int_adapterIxE12neg_infinityEv(%"class.boost::date_time::int_adapter"* sret %tmp)
  %call = call i64 @_ZNK5boost9date_time11int_adapterIxE9as_numberEv(%"class.boost::date_time::int_adapter"* %tmp)
  %cmp = icmp eq i64 %0, %call
  br i1 %cmp, label %lor.end, label %lor.rhs

lor.rhs:                                          ; preds = %entry
  %value_2 = getelementptr inbounds %"class.boost::date_time::int_adapter"* %this1, i32 0, i32 0
  %1 = load i64* %value_2, align 4
  call void @_ZN5boost9date_time11int_adapterIxE12pos_infinityEv(%"class.boost::date_time::int_adapter"* sret %tmp3)
  %call4 = call i64 @_ZNK5boost9date_time11int_adapterIxE9as_numberEv(%"class.boost::date_time::int_adapter"* %tmp3)
  %cmp5 = icmp eq i64 %1, %call4
  br label %lor.end

lor.end:                                          ; preds = %lor.rhs, %entry
  %2 = phi i1 [ true, %entry ], [ %cmp5, %lor.rhs ]
  ret i1 %2
}

define linkonce_odr void @_ZN5boost9date_time11int_adapterIxE12pos_infinityEv(%"class.boost::date_time::int_adapter"* noalias sret %agg.result) align 2 {
entry:
  %call = call i64 @_ZNSt14numeric_limitsIxE3maxEv() nounwind
  call void @_ZN5boost9date_time11int_adapterIxEC1Ex(%"class.boost::date_time::int_adapter"* %agg.result, i64 %call)
  ret void
}

define linkonce_odr void @_ZN5boost9date_time11int_adapterIxE12neg_infinityEv(%"class.boost::date_time::int_adapter"* noalias sret %agg.result) align 2 {
entry:
  %call = call i64 @_ZNSt14numeric_limitsIxE3minEv() nounwind
  call void @_ZN5boost9date_time11int_adapterIxEC1Ex(%"class.boost::date_time::int_adapter"* %agg.result, i64 %call)
  ret void
}

define linkonce_odr i64 @_ZNSt14numeric_limitsIxE3minEv() nounwind align 2 {
entry:
  ret i64 -9223372036854775808
}

define linkonce_odr i64 @_ZNSt14numeric_limitsIxE3maxEv() nounwind align 2 {
entry:
  ret i64 9223372036854775807
}

define linkonce_odr void @_ZN5boost9date_time16counted_time_repINS_10posix_time33millisec_posix_time_system_configEEC2ENS0_11int_adapterIxEE(%"struct.boost::date_time::counted_time_rep"* %this, %"class.boost::date_time::int_adapter"* byval align 4 %count) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"struct.boost::date_time::counted_time_rep"*, align 4
  store %"struct.boost::date_time::counted_time_rep"* %this, %"struct.boost::date_time::counted_time_rep"** %this.addr, align 4
  %this1 = load %"struct.boost::date_time::counted_time_rep"** %this.addr
  %time_count_ = getelementptr inbounds %"struct.boost::date_time::counted_time_rep"* %this1, i32 0, i32 0
  %0 = bitcast %"class.boost::date_time::int_adapter"* %time_count_ to i8*
  %1 = bitcast %"class.boost::date_time::int_adapter"* %count to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %0, i8* %1, i32 8, i32 4, i1 false)
  ret void
}

define linkonce_odr zeroext i1 @_ZN5boost9date_time22time_resolution_traitsINS0_37time_resolution_traits_adapted64_implELNS0_16time_resolutionsE5ELx1000000ELt6EiE10is_adaptedEv() align 2 {
entry:
  %call = call zeroext i1 @_ZN5boost9date_time37time_resolution_traits_adapted64_impl10is_adaptedEv()
  ret i1 %call
}

define linkonce_odr zeroext i1 @_ZN5boost9date_time37time_resolution_traits_adapted64_impl10is_adaptedEv() nounwind align 2 {
entry:
  ret i1 true
}

define linkonce_odr void @_ZN5boost10posix_time5ptimeC2ERKNS_9date_time16counted_time_repINS0_33millisec_posix_time_system_configEEE(%"class.boost::posix_time::ptime"* %this, %"struct.boost::date_time::counted_time_rep"* %rhs) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::posix_time::ptime"*, align 4
  %rhs.addr = alloca %"struct.boost::date_time::counted_time_rep"*, align 4
  store %"class.boost::posix_time::ptime"* %this, %"class.boost::posix_time::ptime"** %this.addr, align 4
  store %"struct.boost::date_time::counted_time_rep"* %rhs, %"struct.boost::date_time::counted_time_rep"** %rhs.addr, align 4
  %this1 = load %"class.boost::posix_time::ptime"** %this.addr
  %0 = bitcast %"class.boost::posix_time::ptime"* %this1 to %"class.boost::date_time::base_time"*
  %1 = load %"struct.boost::date_time::counted_time_rep"** %rhs.addr, align 4
  call void @_ZN5boost9date_time9base_timeINS_10posix_time5ptimeENS0_19counted_time_systemINS0_16counted_time_repINS2_33millisec_posix_time_system_configEEEEEEC2ERKS7_(%"class.boost::date_time::base_time"* %0, %"struct.boost::date_time::counted_time_rep"* %1)
  ret void
}

define linkonce_odr void @_ZN5boost9date_time9base_timeINS_10posix_time5ptimeENS0_19counted_time_systemINS0_16counted_time_repINS2_33millisec_posix_time_system_configEEEEEEC2ERKS7_(%"class.boost::date_time::base_time"* %this, %"struct.boost::date_time::counted_time_rep"* %rhs) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::date_time::base_time"*, align 4
  %rhs.addr = alloca %"struct.boost::date_time::counted_time_rep"*, align 4
  store %"class.boost::date_time::base_time"* %this, %"class.boost::date_time::base_time"** %this.addr, align 4
  store %"struct.boost::date_time::counted_time_rep"* %rhs, %"struct.boost::date_time::counted_time_rep"** %rhs.addr, align 4
  %this1 = load %"class.boost::date_time::base_time"** %this.addr
  %0 = bitcast %"class.boost::date_time::base_time"* %this1 to %"struct.boost::less_than_comparable"*
  %time_ = getelementptr inbounds %"class.boost::date_time::base_time"* %this1, i32 0, i32 0
  %1 = load %"struct.boost::date_time::counted_time_rep"** %rhs.addr, align 4
  %2 = bitcast %"struct.boost::date_time::counted_time_rep"* %time_ to i8*
  %3 = bitcast %"struct.boost::date_time::counted_time_rep"* %1 to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %2, i8* %3, i32 8, i32 4, i1 false)
  ret void
}

define linkonce_odr void @_ZN5boost10posix_time5ptimeC1ENS_9gregorian4dateE(%"class.boost::posix_time::ptime"* %this, %"class.boost::gregorian::date"* byval align 4 %d) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::posix_time::ptime"*, align 4
  store %"class.boost::posix_time::ptime"* %this, %"class.boost::posix_time::ptime"** %this.addr, align 4
  %this1 = load %"class.boost::posix_time::ptime"** %this.addr
  call void @_ZN5boost10posix_time5ptimeC2ENS_9gregorian4dateE(%"class.boost::posix_time::ptime"* %this1, %"class.boost::gregorian::date"* byval align 4 %d)
  ret void
}

define linkonce_odr void @_ZN5boost9gregorian4dateC1ENS0_9greg_yearENS0_10greg_monthENS0_8greg_dayE(%"class.boost::gregorian::date"* %this, %"class.boost::gregorian::greg_year"* byval align 4 %y, %"class.boost::gregorian::greg_month"* byval align 4 %m, %"class.boost::gregorian::greg_day"* byval align 4 %d) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::gregorian::date"*, align 4
  store %"class.boost::gregorian::date"* %this, %"class.boost::gregorian::date"** %this.addr, align 4
  %this1 = load %"class.boost::gregorian::date"** %this.addr
  call void @_ZN5boost9gregorian4dateC2ENS0_9greg_yearENS0_10greg_monthENS0_8greg_dayE(%"class.boost::gregorian::date"* %this1, %"class.boost::gregorian::greg_year"* byval align 4 %y, %"class.boost::gregorian::greg_month"* byval align 4 %m, %"class.boost::gregorian::greg_day"* byval align 4 %d)
  ret void
}

define linkonce_odr void @_ZN5boost9gregorian9greg_yearC1Et(%"class.boost::gregorian::greg_year"* %this, i16 zeroext %year) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::gregorian::greg_year"*, align 4
  %year.addr = alloca i16, align 2
  store %"class.boost::gregorian::greg_year"* %this, %"class.boost::gregorian::greg_year"** %this.addr, align 4
  store i16 %year, i16* %year.addr, align 2
  %this1 = load %"class.boost::gregorian::greg_year"** %this.addr
  %0 = load i16* %year.addr, align 2
  call void @_ZN5boost9gregorian9greg_yearC2Et(%"class.boost::gregorian::greg_year"* %this1, i16 zeroext %0)
  ret void
}

define linkonce_odr void @_ZN5boost9gregorian10greg_monthC1Et(%"class.boost::gregorian::greg_month"* %this, i16 zeroext %theMonth) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::gregorian::greg_month"*, align 4
  %theMonth.addr = alloca i16, align 2
  store %"class.boost::gregorian::greg_month"* %this, %"class.boost::gregorian::greg_month"** %this.addr, align 4
  store i16 %theMonth, i16* %theMonth.addr, align 2
  %this1 = load %"class.boost::gregorian::greg_month"** %this.addr
  %0 = load i16* %theMonth.addr, align 2
  call void @_ZN5boost9gregorian10greg_monthC2Et(%"class.boost::gregorian::greg_month"* %this1, i16 zeroext %0)
  ret void
}

define linkonce_odr void @_ZN5boost9gregorian8greg_dayC1Et(%"class.boost::gregorian::greg_day"* %this, i16 zeroext %day_of_month) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::gregorian::greg_day"*, align 4
  %day_of_month.addr = alloca i16, align 2
  store %"class.boost::gregorian::greg_day"* %this, %"class.boost::gregorian::greg_day"** %this.addr, align 4
  store i16 %day_of_month, i16* %day_of_month.addr, align 2
  %this1 = load %"class.boost::gregorian::greg_day"** %this.addr
  %0 = load i16* %day_of_month.addr, align 2
  call void @_ZN5boost9gregorian8greg_dayC2Et(%"class.boost::gregorian::greg_day"* %this1, i16 zeroext %0)
  ret void
}

define linkonce_odr void @_ZN5boost9gregorian8greg_dayC2Et(%"class.boost::gregorian::greg_day"* %this, i16 zeroext %day_of_month) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::gregorian::greg_day"*, align 4
  %day_of_month.addr = alloca i16, align 2
  store %"class.boost::gregorian::greg_day"* %this, %"class.boost::gregorian::greg_day"** %this.addr, align 4
  store i16 %day_of_month, i16* %day_of_month.addr, align 2
  %this1 = load %"class.boost::gregorian::greg_day"** %this.addr
  %0 = bitcast %"class.boost::gregorian::greg_day"* %this1 to %"class.boost::CV::constrained_value.44"*
  %1 = load i16* %day_of_month.addr, align 2
  call void @_ZN5boost2CV17constrained_valueINS0_23simple_exception_policyItLt1ELt31ENS_9gregorian16bad_day_of_monthEEEEC2Et(%"class.boost::CV::constrained_value.44"* %0, i16 zeroext %1)
  ret void
}

define linkonce_odr void @_ZN5boost2CV17constrained_valueINS0_23simple_exception_policyItLt1ELt31ENS_9gregorian16bad_day_of_monthEEEEC2Et(%"class.boost::CV::constrained_value.44"* %this, i16 zeroext %value) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::CV::constrained_value.44"*, align 4
  %value.addr = alloca i16, align 2
  store %"class.boost::CV::constrained_value.44"* %this, %"class.boost::CV::constrained_value.44"** %this.addr, align 4
  store i16 %value, i16* %value.addr, align 2
  %this1 = load %"class.boost::CV::constrained_value.44"** %this.addr
  %value_ = getelementptr inbounds %"class.boost::CV::constrained_value.44"* %this1, i32 0, i32 0
  %call = call zeroext i16 @_ZN5boost2CV17constrained_valueINS0_23simple_exception_policyItLt1ELt31ENS_9gregorian16bad_day_of_monthEEEE3minEv()
  store i16 %call, i16* %value_, align 2
  %0 = load i16* %value.addr, align 2
  call void @_ZN5boost2CV17constrained_valueINS0_23simple_exception_policyItLt1ELt31ENS_9gregorian16bad_day_of_monthEEEE6assignEt(%"class.boost::CV::constrained_value.44"* %this1, i16 zeroext %0)
  ret void
}

define linkonce_odr zeroext i16 @_ZN5boost2CV17constrained_valueINS0_23simple_exception_policyItLt1ELt31ENS_9gregorian16bad_day_of_monthEEEE3minEv() align 2 {
entry:
  %call = call zeroext i16 @_ZN5boost2CV23simple_exception_policyItLt1ELt31ENS_9gregorian16bad_day_of_monthEE3minEv()
  ret i16 %call
}

define linkonce_odr void @_ZN5boost2CV17constrained_valueINS0_23simple_exception_policyItLt1ELt31ENS_9gregorian16bad_day_of_monthEEEE6assignEt(%"class.boost::CV::constrained_value.44"* %this, i16 zeroext %value) align 2 {
entry:
  %this.addr = alloca %"class.boost::CV::constrained_value.44"*, align 4
  %value.addr = alloca i16, align 2
  store %"class.boost::CV::constrained_value.44"* %this, %"class.boost::CV::constrained_value.44"** %this.addr, align 4
  store i16 %value, i16* %value.addr, align 2
  %this1 = load %"class.boost::CV::constrained_value.44"** %this.addr
  %0 = load i16* %value.addr, align 2
  %conv = zext i16 %0 to i32
  %add = add nsw i32 %conv, 1
  %call = call zeroext i16 @_ZN5boost2CV17constrained_valueINS0_23simple_exception_policyItLt1ELt31ENS_9gregorian16bad_day_of_monthEEEE3minEv()
  %conv2 = zext i16 %call to i32
  %add3 = add nsw i32 %conv2, 1
  %cmp = icmp slt i32 %add, %add3
  br i1 %cmp, label %if.then, label %if.end

if.then:                                          ; preds = %entry
  %value_ = getelementptr inbounds %"class.boost::CV::constrained_value.44"* %this1, i32 0, i32 0
  %1 = load i16* %value_, align 2
  %2 = load i16* %value.addr, align 2
  call void @_ZN5boost2CV23simple_exception_policyItLt1ELt31ENS_9gregorian16bad_day_of_monthEE8on_errorEttNS0_14violation_enumE(i16 zeroext %1, i16 zeroext %2, i32 0)
  br label %return

if.end:                                           ; preds = %entry
  %3 = load i16* %value.addr, align 2
  %conv4 = zext i16 %3 to i32
  %call5 = call zeroext i16 @_ZN5boost2CV17constrained_valueINS0_23simple_exception_policyItLt1ELt31ENS_9gregorian16bad_day_of_monthEEEE3maxEv()
  %conv6 = zext i16 %call5 to i32
  %cmp7 = icmp sgt i32 %conv4, %conv6
  br i1 %cmp7, label %if.then8, label %if.end10

if.then8:                                         ; preds = %if.end
  %value_9 = getelementptr inbounds %"class.boost::CV::constrained_value.44"* %this1, i32 0, i32 0
  %4 = load i16* %value_9, align 2
  %5 = load i16* %value.addr, align 2
  call void @_ZN5boost2CV23simple_exception_policyItLt1ELt31ENS_9gregorian16bad_day_of_monthEE8on_errorEttNS0_14violation_enumE(i16 zeroext %4, i16 zeroext %5, i32 1)
  br label %return

if.end10:                                         ; preds = %if.end
  %6 = load i16* %value.addr, align 2
  %value_11 = getelementptr inbounds %"class.boost::CV::constrained_value.44"* %this1, i32 0, i32 0
  store i16 %6, i16* %value_11, align 2
  br label %return

return:                                           ; preds = %if.end10, %if.then8, %if.then
  ret void
}

define linkonce_odr void @_ZN5boost2CV23simple_exception_policyItLt1ELt31ENS_9gregorian16bad_day_of_monthEE8on_errorEttNS0_14violation_enumE(i16 zeroext, i16 zeroext, i32) align 2 {
entry:
  %.addr = alloca i16, align 2
  %.addr1 = alloca i16, align 2
  %.addr2 = alloca i32, align 4
  %ref.tmp = alloca %"struct.boost::gregorian::bad_day_of_month", align 4
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  store i16 %0, i16* %.addr, align 2
  store i16 %1, i16* %.addr1, align 2
  store i32 %2, i32* %.addr2, align 4
  call void @_ZN5boost9gregorian16bad_day_of_monthC1Ev(%"struct.boost::gregorian::bad_day_of_month"* %ref.tmp)
  invoke void @_ZN5boost15throw_exceptionINS_9gregorian16bad_day_of_monthEEEvRKT_(%"struct.boost::gregorian::bad_day_of_month"* %ref.tmp) noreturn
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %entry
  unreachable

lpad:                                             ; preds = %entry
  %3 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %4 = extractvalue { i8*, i32 } %3, 0
  store i8* %4, i8** %exn.slot
  %5 = extractvalue { i8*, i32 } %3, 1
  store i32 %5, i32* %ehselector.slot
  call void @_ZN5boost9gregorian16bad_day_of_monthD1Ev(%"struct.boost::gregorian::bad_day_of_month"* %ref.tmp) nounwind
  br label %eh.resume

return:                                           ; No predecessors!
  ret void

eh.resume:                                        ; preds = %lpad
  %exn = load i8** %exn.slot
  %sel = load i32* %ehselector.slot
  %lpad.val = insertvalue { i8*, i32 } undef, i8* %exn, 0
  %lpad.val3 = insertvalue { i8*, i32 } %lpad.val, i32 %sel, 1
  resume { i8*, i32 } %lpad.val3
}

define linkonce_odr zeroext i16 @_ZN5boost2CV17constrained_valueINS0_23simple_exception_policyItLt1ELt31ENS_9gregorian16bad_day_of_monthEEEE3maxEv() align 2 {
entry:
  %call = call zeroext i16 @_ZN5boost2CV23simple_exception_policyItLt1ELt31ENS_9gregorian16bad_day_of_monthEE3maxEv()
  ret i16 %call
}

define linkonce_odr zeroext i16 @_ZN5boost2CV23simple_exception_policyItLt1ELt31ENS_9gregorian16bad_day_of_monthEE3maxEv() nounwind align 2 {
entry:
  ret i16 31
}

define linkonce_odr void @_ZN5boost15throw_exceptionINS_9gregorian16bad_day_of_monthEEEvRKT_(%"struct.boost::gregorian::bad_day_of_month"* %e) noreturn inlinehint {
entry:
  %e.addr = alloca %"struct.boost::gregorian::bad_day_of_month"*, align 4
  %ref.tmp = alloca %"struct.boost::exception_detail::error_info_injector.46", align 4
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  %cleanup.isactive = alloca i1
  store %"struct.boost::gregorian::bad_day_of_month"* %e, %"struct.boost::gregorian::bad_day_of_month"** %e.addr, align 4
  %0 = load %"struct.boost::gregorian::bad_day_of_month"** %e.addr, align 4
  %1 = bitcast %"struct.boost::gregorian::bad_day_of_month"* %0 to %"class.std::exception"*
  call void @_ZN5boost36throw_exception_assert_compatibilityERKSt9exception(%"class.std::exception"* %1)
  %exception = call i8* @__cxa_allocate_exception(i32 32) nounwind
  store i1 true, i1* %cleanup.isactive
  %2 = bitcast i8* %exception to %"class.boost::exception_detail::clone_impl.45"*
  %3 = load %"struct.boost::gregorian::bad_day_of_month"** %e.addr, align 4
  invoke void @_ZN5boost17enable_error_infoINS_9gregorian16bad_day_of_monthEEENS_16exception_detail29enable_error_info_return_typeIT_E4typeERKS5_(%"struct.boost::exception_detail::error_info_injector.46"* sret %ref.tmp, %"struct.boost::gregorian::bad_day_of_month"* %3)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %entry
  invoke void @_ZN5boost24enable_current_exceptionINS_16exception_detail19error_info_injectorINS_9gregorian16bad_day_of_monthEEEEENS1_10clone_implIT_EERKS7_(%"class.boost::exception_detail::clone_impl.45"* sret %2, %"struct.boost::exception_detail::error_info_injector.46"* %ref.tmp)
          to label %invoke.cont2 unwind label %lpad1

invoke.cont2:                                     ; preds = %invoke.cont
  store i1 false, i1* %cleanup.isactive
  invoke void @__cxa_throw(i8* %exception, i8* bitcast ({ i8*, i8*, i32, i32, i8*, i32, i8*, i32 }* @_ZTIN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian16bad_day_of_monthEEEEE to i8*), i8* bitcast (void (%"class.boost::exception_detail::clone_impl.45"*)* @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian16bad_day_of_monthEEEED1Ev to i8*)) noreturn
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
  call void @_ZN5boost16exception_detail19error_info_injectorINS_9gregorian16bad_day_of_monthEED1Ev(%"struct.boost::exception_detail::error_info_injector.46"* %ref.tmp) nounwind
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

define linkonce_odr void @_ZN5boost9gregorian16bad_day_of_monthC1Ev(%"struct.boost::gregorian::bad_day_of_month"* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"struct.boost::gregorian::bad_day_of_month"*, align 4
  store %"struct.boost::gregorian::bad_day_of_month"* %this, %"struct.boost::gregorian::bad_day_of_month"** %this.addr, align 4
  %this1 = load %"struct.boost::gregorian::bad_day_of_month"** %this.addr
  call void @_ZN5boost9gregorian16bad_day_of_monthC2Ev(%"struct.boost::gregorian::bad_day_of_month"* %this1)
  ret void
}

define linkonce_odr void @_ZN5boost9gregorian16bad_day_of_monthD1Ev(%"struct.boost::gregorian::bad_day_of_month"* %this) unnamed_addr nounwind inlinehint align 2 {
entry:
  %this.addr = alloca %"struct.boost::gregorian::bad_day_of_month"*, align 4
  store %"struct.boost::gregorian::bad_day_of_month"* %this, %"struct.boost::gregorian::bad_day_of_month"** %this.addr, align 4
  %this1 = load %"struct.boost::gregorian::bad_day_of_month"** %this.addr
  call void @_ZN5boost9gregorian16bad_day_of_monthD2Ev(%"struct.boost::gregorian::bad_day_of_month"* %this1) nounwind
  ret void
}

define linkonce_odr void @_ZN5boost9gregorian16bad_day_of_monthD2Ev(%"struct.boost::gregorian::bad_day_of_month"* %this) unnamed_addr nounwind inlinehint align 2 {
entry:
  %this.addr = alloca %"struct.boost::gregorian::bad_day_of_month"*, align 4
  store %"struct.boost::gregorian::bad_day_of_month"* %this, %"struct.boost::gregorian::bad_day_of_month"** %this.addr, align 4
  %this1 = load %"struct.boost::gregorian::bad_day_of_month"** %this.addr
  %0 = bitcast %"struct.boost::gregorian::bad_day_of_month"* %this1 to %"class.std::out_of_range"*
  call void @_ZNSt12out_of_rangeD2Ev(%"class.std::out_of_range"* %0) nounwind
  ret void
}

declare void @_ZNSt12out_of_rangeD2Ev(%"class.std::out_of_range"*) nounwind

define linkonce_odr void @_ZN5boost9gregorian16bad_day_of_monthC2Ev(%"struct.boost::gregorian::bad_day_of_month"* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"struct.boost::gregorian::bad_day_of_month"*, align 4
  %ref.tmp = alloca %"class.std::basic_string", align 4
  %ref.tmp2 = alloca %"class.std::allocator", align 1
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  store %"struct.boost::gregorian::bad_day_of_month"* %this, %"struct.boost::gregorian::bad_day_of_month"** %this.addr, align 4
  %this1 = load %"struct.boost::gregorian::bad_day_of_month"** %this.addr
  %0 = bitcast %"struct.boost::gregorian::bad_day_of_month"* %this1 to %"class.std::out_of_range"*
  call void @_ZNSaIcEC1Ev(%"class.std::allocator"* %ref.tmp2) nounwind
  invoke void @_ZNSsC1EPKcRKSaIcE(%"class.std::basic_string"* %ref.tmp, i8* getelementptr inbounds ([41 x i8]* @.str39, i32 0, i32 0), %"class.std::allocator"* %ref.tmp2)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %entry
  invoke void @_ZNSt12out_of_rangeC2ERKSs(%"class.std::out_of_range"* %0, %"class.std::basic_string"* %ref.tmp)
          to label %invoke.cont4 unwind label %lpad3

invoke.cont4:                                     ; preds = %invoke.cont
  invoke void @_ZNSsD1Ev(%"class.std::basic_string"* %ref.tmp)
          to label %invoke.cont5 unwind label %lpad

invoke.cont5:                                     ; preds = %invoke.cont4
  call void @_ZNSaIcED1Ev(%"class.std::allocator"* %ref.tmp2) nounwind
  %1 = bitcast %"struct.boost::gregorian::bad_day_of_month"* %this1 to i8***
  store i8** getelementptr inbounds ([5 x i8*]* @_ZTVN5boost9gregorian16bad_day_of_monthE, i64 0, i64 2), i8*** %1
  ret void

lpad:                                             ; preds = %invoke.cont4, %entry
  %2 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %3 = extractvalue { i8*, i32 } %2, 0
  store i8* %3, i8** %exn.slot
  %4 = extractvalue { i8*, i32 } %2, 1
  store i32 %4, i32* %ehselector.slot
  br label %ehcleanup

lpad3:                                            ; preds = %invoke.cont
  %5 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %6 = extractvalue { i8*, i32 } %5, 0
  store i8* %6, i8** %exn.slot
  %7 = extractvalue { i8*, i32 } %5, 1
  store i32 %7, i32* %ehselector.slot
  invoke void @_ZNSsD1Ev(%"class.std::basic_string"* %ref.tmp)
          to label %invoke.cont6 unwind label %terminate.lpad

invoke.cont6:                                     ; preds = %lpad3
  br label %ehcleanup

ehcleanup:                                        ; preds = %invoke.cont6, %lpad
  call void @_ZNSaIcED1Ev(%"class.std::allocator"* %ref.tmp2) nounwind
  br label %eh.resume

eh.resume:                                        ; preds = %ehcleanup
  %exn = load i8** %exn.slot
  %sel = load i32* %ehselector.slot
  %lpad.val = insertvalue { i8*, i32 } undef, i8* %exn, 0
  %lpad.val7 = insertvalue { i8*, i32 } %lpad.val, i32 %sel, 1
  resume { i8*, i32 } %lpad.val7

terminate.lpad:                                   ; preds = %lpad3
  %8 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          catch i8* null
  call void @_ZSt9terminatev() noreturn nounwind
  unreachable
}

declare void @_ZNSt12out_of_rangeC2ERKSs(%"class.std::out_of_range"*, %"class.std::basic_string"*)

define linkonce_odr void @_ZN5boost9gregorian16bad_day_of_monthD0Ev(%"struct.boost::gregorian::bad_day_of_month"* %this) unnamed_addr nounwind inlinehint align 2 {
entry:
  %this.addr = alloca %"struct.boost::gregorian::bad_day_of_month"*, align 4
  store %"struct.boost::gregorian::bad_day_of_month"* %this, %"struct.boost::gregorian::bad_day_of_month"** %this.addr, align 4
  %this1 = load %"struct.boost::gregorian::bad_day_of_month"** %this.addr
  call void @_ZN5boost9gregorian16bad_day_of_monthD1Ev(%"struct.boost::gregorian::bad_day_of_month"* %this1) nounwind
  %0 = bitcast %"struct.boost::gregorian::bad_day_of_month"* %this1 to i8*
  call void @_ZdlPv(i8* %0) nounwind
  ret void
}

declare i8* @_ZNKSt11logic_error4whatEv(%"class.std::logic_error"*) nounwind

define linkonce_odr void @_ZN5boost24enable_current_exceptionINS_16exception_detail19error_info_injectorINS_9gregorian16bad_day_of_monthEEEEENS1_10clone_implIT_EERKS7_(%"class.boost::exception_detail::clone_impl.45"* noalias sret %agg.result, %"struct.boost::exception_detail::error_info_injector.46"* %x) inlinehint {
entry:
  %x.addr = alloca %"struct.boost::exception_detail::error_info_injector.46"*, align 4
  store %"struct.boost::exception_detail::error_info_injector.46"* %x, %"struct.boost::exception_detail::error_info_injector.46"** %x.addr, align 4
  %0 = load %"struct.boost::exception_detail::error_info_injector.46"** %x.addr, align 4
  call void @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian16bad_day_of_monthEEEEC1ERKS5_(%"class.boost::exception_detail::clone_impl.45"* %agg.result, %"struct.boost::exception_detail::error_info_injector.46"* %0)
  ret void
}

define linkonce_odr void @_ZN5boost17enable_error_infoINS_9gregorian16bad_day_of_monthEEENS_16exception_detail29enable_error_info_return_typeIT_E4typeERKS5_(%"struct.boost::exception_detail::error_info_injector.46"* noalias sret %agg.result, %"struct.boost::gregorian::bad_day_of_month"* %x) inlinehint {
entry:
  %x.addr = alloca %"struct.boost::gregorian::bad_day_of_month"*, align 4
  store %"struct.boost::gregorian::bad_day_of_month"* %x, %"struct.boost::gregorian::bad_day_of_month"** %x.addr, align 4
  %0 = load %"struct.boost::gregorian::bad_day_of_month"** %x.addr, align 4
  call void @_ZN5boost16exception_detail19error_info_injectorINS_9gregorian16bad_day_of_monthEEC1ERKS3_(%"struct.boost::exception_detail::error_info_injector.46"* %agg.result, %"struct.boost::gregorian::bad_day_of_month"* %0)
  ret void
}

define linkonce_odr void @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian16bad_day_of_monthEEEED1Ev(%"class.boost::exception_detail::clone_impl.45"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::exception_detail::clone_impl.45"*, align 4
  store %"class.boost::exception_detail::clone_impl.45"* %this, %"class.boost::exception_detail::clone_impl.45"** %this.addr, align 4
  %this1 = load %"class.boost::exception_detail::clone_impl.45"** %this.addr
  call void @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian16bad_day_of_monthEEEED2Ev(%"class.boost::exception_detail::clone_impl.45"* %this1, i8** getelementptr inbounds ([2 x i8*]* @_ZTTN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian16bad_day_of_monthEEEEE, i64 0, i64 0)) nounwind
  %0 = bitcast %"class.boost::exception_detail::clone_impl.45"* %this1 to i8*
  %1 = getelementptr inbounds i8* %0, i64 28
  %2 = bitcast i8* %1 to %"class.boost::exception_detail::clone_base"*
  call void @_ZN5boost16exception_detail10clone_baseD2Ev(%"class.boost::exception_detail::clone_base"* %2) nounwind
  ret void
}

define linkonce_odr void @_ZN5boost16exception_detail19error_info_injectorINS_9gregorian16bad_day_of_monthEED1Ev(%"struct.boost::exception_detail::error_info_injector.46"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"struct.boost::exception_detail::error_info_injector.46"*, align 4
  store %"struct.boost::exception_detail::error_info_injector.46"* %this, %"struct.boost::exception_detail::error_info_injector.46"** %this.addr, align 4
  %this1 = load %"struct.boost::exception_detail::error_info_injector.46"** %this.addr
  call void @_ZN5boost16exception_detail19error_info_injectorINS_9gregorian16bad_day_of_monthEED2Ev(%"struct.boost::exception_detail::error_info_injector.46"* %this1) nounwind
  ret void
}

define linkonce_odr void @_ZN5boost16exception_detail19error_info_injectorINS_9gregorian16bad_day_of_monthEED2Ev(%"struct.boost::exception_detail::error_info_injector.46"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"struct.boost::exception_detail::error_info_injector.46"*, align 4
  store %"struct.boost::exception_detail::error_info_injector.46"* %this, %"struct.boost::exception_detail::error_info_injector.46"** %this.addr, align 4
  %this1 = load %"struct.boost::exception_detail::error_info_injector.46"** %this.addr
  %0 = bitcast %"struct.boost::exception_detail::error_info_injector.46"* %this1 to i8*
  %1 = getelementptr inbounds i8* %0, i64 8
  %2 = bitcast i8* %1 to %"class.boost::exception"*
  call void @_ZN5boost9exceptionD2Ev(%"class.boost::exception"* %2) nounwind
  %3 = bitcast %"struct.boost::exception_detail::error_info_injector.46"* %this1 to %"struct.boost::gregorian::bad_day_of_month"*
  call void @_ZN5boost9gregorian16bad_day_of_monthD2Ev(%"struct.boost::gregorian::bad_day_of_month"* %3) nounwind
  ret void
}

define linkonce_odr void @_ZThn8_N5boost16exception_detail19error_info_injectorINS_9gregorian16bad_day_of_monthEED1Ev(%"struct.boost::exception_detail::error_info_injector.46"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"struct.boost::exception_detail::error_info_injector.46"*, align 4
  store %"struct.boost::exception_detail::error_info_injector.46"* %this, %"struct.boost::exception_detail::error_info_injector.46"** %this.addr, align 4
  %this1 = load %"struct.boost::exception_detail::error_info_injector.46"** %this.addr
  %0 = bitcast %"struct.boost::exception_detail::error_info_injector.46"* %this1 to i8*
  %1 = getelementptr inbounds i8* %0, i64 -8
  %2 = bitcast i8* %1 to %"struct.boost::exception_detail::error_info_injector.46"*
  call void @_ZN5boost16exception_detail19error_info_injectorINS_9gregorian16bad_day_of_monthEED1Ev(%"struct.boost::exception_detail::error_info_injector.46"* %2) nounwind
  ret void
}

define linkonce_odr void @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian16bad_day_of_monthEEEED2Ev(%"class.boost::exception_detail::clone_impl.45"* %this, i8** %vtt) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::exception_detail::clone_impl.45"*, align 4
  %vtt.addr = alloca i8**, align 4
  store %"class.boost::exception_detail::clone_impl.45"* %this, %"class.boost::exception_detail::clone_impl.45"** %this.addr, align 4
  store i8** %vtt, i8*** %vtt.addr, align 4
  %this1 = load %"class.boost::exception_detail::clone_impl.45"** %this.addr
  %vtt2 = load i8*** %vtt.addr
  %0 = bitcast %"class.boost::exception_detail::clone_impl.45"* %this1 to %"struct.boost::exception_detail::error_info_injector.46"*
  call void @_ZN5boost16exception_detail19error_info_injectorINS_9gregorian16bad_day_of_monthEED2Ev(%"struct.boost::exception_detail::error_info_injector.46"* %0) nounwind
  ret void
}

define linkonce_odr void @_ZThn8_N5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian16bad_day_of_monthEEEED1Ev(%"class.boost::exception_detail::clone_impl.45"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::exception_detail::clone_impl.45"*, align 4
  store %"class.boost::exception_detail::clone_impl.45"* %this, %"class.boost::exception_detail::clone_impl.45"** %this.addr, align 4
  %this1 = load %"class.boost::exception_detail::clone_impl.45"** %this.addr
  %0 = bitcast %"class.boost::exception_detail::clone_impl.45"* %this1 to i8*
  %1 = getelementptr inbounds i8* %0, i64 -8
  %2 = bitcast i8* %1 to %"class.boost::exception_detail::clone_impl.45"*
  call void @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian16bad_day_of_monthEEEED1Ev(%"class.boost::exception_detail::clone_impl.45"* %2) nounwind
  ret void
}

define linkonce_odr void @_ZTv0_n20_N5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian16bad_day_of_monthEEEED1Ev(%"class.boost::exception_detail::clone_impl.45"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::exception_detail::clone_impl.45"*, align 4
  store %"class.boost::exception_detail::clone_impl.45"* %this, %"class.boost::exception_detail::clone_impl.45"** %this.addr, align 4
  %this1 = load %"class.boost::exception_detail::clone_impl.45"** %this.addr
  %0 = bitcast %"class.boost::exception_detail::clone_impl.45"* %this1 to i8*
  %1 = bitcast i8* %0 to i8**
  %2 = load i8** %1
  %3 = getelementptr inbounds i8* %2, i64 -20
  %4 = bitcast i8* %3 to i32*
  %5 = load i32* %4
  %6 = getelementptr inbounds i8* %0, i32 %5
  %7 = bitcast i8* %6 to %"class.boost::exception_detail::clone_impl.45"*
  call void @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian16bad_day_of_monthEEEED1Ev(%"class.boost::exception_detail::clone_impl.45"* %7) nounwind
  ret void
}

define linkonce_odr void @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian16bad_day_of_monthEEEED0Ev(%"class.boost::exception_detail::clone_impl.45"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::exception_detail::clone_impl.45"*, align 4
  store %"class.boost::exception_detail::clone_impl.45"* %this, %"class.boost::exception_detail::clone_impl.45"** %this.addr, align 4
  %this1 = load %"class.boost::exception_detail::clone_impl.45"** %this.addr
  call void @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian16bad_day_of_monthEEEED1Ev(%"class.boost::exception_detail::clone_impl.45"* %this1) nounwind
  %0 = bitcast %"class.boost::exception_detail::clone_impl.45"* %this1 to i8*
  call void @_ZdlPv(i8* %0) nounwind
  ret void
}

define linkonce_odr %"class.boost::exception_detail::clone_base"* @_ZNK5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian16bad_day_of_monthEEEE5cloneEv(%"class.boost::exception_detail::clone_impl.45"* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::exception_detail::clone_impl.45"*, align 4
  %agg.tmp = alloca %"struct.boost::exception_detail::clone_impl<boost::exception_detail::error_info_injector<boost::gregorian::bad_day_of_month> >::clone_tag", align 1
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  store %"class.boost::exception_detail::clone_impl.45"* %this, %"class.boost::exception_detail::clone_impl.45"** %this.addr, align 4
  %this1 = load %"class.boost::exception_detail::clone_impl.45"** %this.addr
  %call = call noalias i8* @_Znwj(i32 32)
  %0 = bitcast i8* %call to %"class.boost::exception_detail::clone_impl.45"*
  invoke void @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian16bad_day_of_monthEEEEC1ERKS6_NS6_9clone_tagE(%"class.boost::exception_detail::clone_impl.45"* %0, %"class.boost::exception_detail::clone_impl.45"* %this1)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %entry
  %1 = icmp eq %"class.boost::exception_detail::clone_impl.45"* %0, null
  br i1 %1, label %cast.end, label %cast.notnull

cast.notnull:                                     ; preds = %invoke.cont
  %2 = bitcast %"class.boost::exception_detail::clone_impl.45"* %0 to i8**
  %vtable = load i8** %2
  %vbase.offset.ptr = getelementptr i8* %vtable, i64 -12
  %3 = bitcast i8* %vbase.offset.ptr to i32*
  %vbase.offset = load i32* %3
  %4 = bitcast %"class.boost::exception_detail::clone_impl.45"* %0 to i8*
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

define linkonce_odr void @_ZNK5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian16bad_day_of_monthEEEE7rethrowEv(%"class.boost::exception_detail::clone_impl.45"* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::exception_detail::clone_impl.45"*, align 4
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  store %"class.boost::exception_detail::clone_impl.45"* %this, %"class.boost::exception_detail::clone_impl.45"** %this.addr, align 4
  %this1 = load %"class.boost::exception_detail::clone_impl.45"** %this.addr
  %exception = call i8* @__cxa_allocate_exception(i32 32) nounwind
  %0 = bitcast i8* %exception to %"class.boost::exception_detail::clone_impl.45"*
  invoke void @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian16bad_day_of_monthEEEEC1ERKS6_(%"class.boost::exception_detail::clone_impl.45"* %0, %"class.boost::exception_detail::clone_impl.45"* %this1)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %entry
  call void @__cxa_throw(i8* %exception, i8* bitcast ({ i8*, i8*, i32, i32, i8*, i32, i8*, i32 }* @_ZTIN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian16bad_day_of_monthEEEEE to i8*), i8* bitcast (void (%"class.boost::exception_detail::clone_impl.45"*)* @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian16bad_day_of_monthEEEED1Ev to i8*)) noreturn
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

define linkonce_odr void @_ZThn8_N5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian16bad_day_of_monthEEEED0Ev(%"class.boost::exception_detail::clone_impl.45"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::exception_detail::clone_impl.45"*, align 4
  store %"class.boost::exception_detail::clone_impl.45"* %this, %"class.boost::exception_detail::clone_impl.45"** %this.addr, align 4
  %this1 = load %"class.boost::exception_detail::clone_impl.45"** %this.addr
  %0 = bitcast %"class.boost::exception_detail::clone_impl.45"* %this1 to i8*
  %1 = getelementptr inbounds i8* %0, i64 -8
  %2 = bitcast i8* %1 to %"class.boost::exception_detail::clone_impl.45"*
  call void @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian16bad_day_of_monthEEEED0Ev(%"class.boost::exception_detail::clone_impl.45"* %2) nounwind
  ret void
}

define linkonce_odr %"class.boost::exception_detail::clone_base"* @_ZTv0_n12_NK5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian16bad_day_of_monthEEEE5cloneEv(%"class.boost::exception_detail::clone_impl.45"* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::exception_detail::clone_impl.45"*, align 4
  store %"class.boost::exception_detail::clone_impl.45"* %this, %"class.boost::exception_detail::clone_impl.45"** %this.addr, align 4
  %this1 = load %"class.boost::exception_detail::clone_impl.45"** %this.addr
  %0 = bitcast %"class.boost::exception_detail::clone_impl.45"* %this1 to i8*
  %1 = bitcast i8* %0 to i8**
  %2 = load i8** %1
  %3 = getelementptr inbounds i8* %2, i64 -12
  %4 = bitcast i8* %3 to i32*
  %5 = load i32* %4
  %6 = getelementptr inbounds i8* %0, i32 %5
  %7 = bitcast i8* %6 to %"class.boost::exception_detail::clone_impl.45"*
  %call = call %"class.boost::exception_detail::clone_base"* @_ZNK5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian16bad_day_of_monthEEEE5cloneEv(%"class.boost::exception_detail::clone_impl.45"* %7)
  ret %"class.boost::exception_detail::clone_base"* %call
}

define linkonce_odr void @_ZTv0_n16_NK5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian16bad_day_of_monthEEEE7rethrowEv(%"class.boost::exception_detail::clone_impl.45"* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::exception_detail::clone_impl.45"*, align 4
  store %"class.boost::exception_detail::clone_impl.45"* %this, %"class.boost::exception_detail::clone_impl.45"** %this.addr, align 4
  %this1 = load %"class.boost::exception_detail::clone_impl.45"** %this.addr
  %0 = bitcast %"class.boost::exception_detail::clone_impl.45"* %this1 to i8*
  %1 = bitcast i8* %0 to i8**
  %2 = load i8** %1
  %3 = getelementptr inbounds i8* %2, i64 -16
  %4 = bitcast i8* %3 to i32*
  %5 = load i32* %4
  %6 = getelementptr inbounds i8* %0, i32 %5
  %7 = bitcast i8* %6 to %"class.boost::exception_detail::clone_impl.45"*
  call void @_ZNK5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian16bad_day_of_monthEEEE7rethrowEv(%"class.boost::exception_detail::clone_impl.45"* %7)
  ret void
}

define linkonce_odr void @_ZTv0_n20_N5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian16bad_day_of_monthEEEED0Ev(%"class.boost::exception_detail::clone_impl.45"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::exception_detail::clone_impl.45"*, align 4
  store %"class.boost::exception_detail::clone_impl.45"* %this, %"class.boost::exception_detail::clone_impl.45"** %this.addr, align 4
  %this1 = load %"class.boost::exception_detail::clone_impl.45"** %this.addr
  %0 = bitcast %"class.boost::exception_detail::clone_impl.45"* %this1 to i8*
  %1 = bitcast i8* %0 to i8**
  %2 = load i8** %1
  %3 = getelementptr inbounds i8* %2, i64 -20
  %4 = bitcast i8* %3 to i32*
  %5 = load i32* %4
  %6 = getelementptr inbounds i8* %0, i32 %5
  %7 = bitcast i8* %6 to %"class.boost::exception_detail::clone_impl.45"*
  call void @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian16bad_day_of_monthEEEED0Ev(%"class.boost::exception_detail::clone_impl.45"* %7) nounwind
  ret void
}

define linkonce_odr void @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian16bad_day_of_monthEEEEC1ERKS6_(%"class.boost::exception_detail::clone_impl.45"* %this, %"class.boost::exception_detail::clone_impl.45"*) unnamed_addr inlinehint align 2 {
entry:
  %this.addr = alloca %"class.boost::exception_detail::clone_impl.45"*, align 4
  %.addr = alloca %"class.boost::exception_detail::clone_impl.45"*, align 4
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  store %"class.boost::exception_detail::clone_impl.45"* %this, %"class.boost::exception_detail::clone_impl.45"** %this.addr, align 4
  store %"class.boost::exception_detail::clone_impl.45"* %0, %"class.boost::exception_detail::clone_impl.45"** %.addr, align 4
  %this1 = load %"class.boost::exception_detail::clone_impl.45"** %this.addr
  %1 = bitcast %"class.boost::exception_detail::clone_impl.45"* %this1 to i8*
  %2 = getelementptr inbounds i8* %1, i64 28
  %3 = bitcast i8* %2 to %"class.boost::exception_detail::clone_base"*
  %4 = load %"class.boost::exception_detail::clone_impl.45"** %.addr, align 4
  %5 = bitcast %"class.boost::exception_detail::clone_impl.45"* %4 to i8**
  %vtable = load i8** %5
  %vbase.offset.ptr = getelementptr i8* %vtable, i64 -12
  %6 = bitcast i8* %vbase.offset.ptr to i32*
  %vbase.offset = load i32* %6
  %7 = bitcast %"class.boost::exception_detail::clone_impl.45"* %4 to i8*
  %add.ptr = getelementptr inbounds i8* %7, i32 %vbase.offset
  %8 = bitcast i8* %add.ptr to %"class.boost::exception_detail::clone_base"*
  call void @_ZN5boost16exception_detail10clone_baseC2ERKS1_(%"class.boost::exception_detail::clone_base"* %3, %"class.boost::exception_detail::clone_base"* %8) nounwind
  %9 = bitcast %"class.boost::exception_detail::clone_impl.45"* %this1 to %"struct.boost::exception_detail::error_info_injector.46"*
  %10 = load %"class.boost::exception_detail::clone_impl.45"** %.addr, align 4
  %11 = bitcast %"class.boost::exception_detail::clone_impl.45"* %10 to %"struct.boost::exception_detail::error_info_injector.46"*
  invoke void @_ZN5boost16exception_detail19error_info_injectorINS_9gregorian16bad_day_of_monthEEC2ERKS4_(%"struct.boost::exception_detail::error_info_injector.46"* %9, %"struct.boost::exception_detail::error_info_injector.46"* %11)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %entry
  %12 = bitcast %"class.boost::exception_detail::clone_impl.45"* %this1 to i8***
  store i8** getelementptr inbounds ([21 x i8*]* @_ZTVN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian16bad_day_of_monthEEEEE, i64 0, i64 3), i8*** %12
  %13 = bitcast %"class.boost::exception_detail::clone_impl.45"* %this1 to i8*
  %add.ptr2 = getelementptr inbounds i8* %13, i32 8
  %14 = bitcast i8* %add.ptr2 to i8***
  store i8** getelementptr inbounds ([21 x i8*]* @_ZTVN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian16bad_day_of_monthEEEEE, i64 0, i64 10), i8*** %14
  %15 = bitcast %"class.boost::exception_detail::clone_impl.45"* %this1 to i8*
  %add.ptr3 = getelementptr inbounds i8* %15, i32 28
  %16 = bitcast i8* %add.ptr3 to i8***
  store i8** getelementptr inbounds ([21 x i8*]* @_ZTVN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian16bad_day_of_monthEEEEE, i64 0, i64 17), i8*** %16
  ret void

lpad:                                             ; preds = %entry
  %17 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %18 = extractvalue { i8*, i32 } %17, 0
  store i8* %18, i8** %exn.slot
  %19 = extractvalue { i8*, i32 } %17, 1
  store i32 %19, i32* %ehselector.slot
  %20 = bitcast %"class.boost::exception_detail::clone_impl.45"* %this1 to i8*
  %21 = getelementptr inbounds i8* %20, i64 28
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

define linkonce_odr void @_ZN5boost16exception_detail19error_info_injectorINS_9gregorian16bad_day_of_monthEEC2ERKS4_(%"struct.boost::exception_detail::error_info_injector.46"* %this, %"struct.boost::exception_detail::error_info_injector.46"*) unnamed_addr inlinehint align 2 {
entry:
  %this.addr = alloca %"struct.boost::exception_detail::error_info_injector.46"*, align 4
  %.addr = alloca %"struct.boost::exception_detail::error_info_injector.46"*, align 4
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  store %"struct.boost::exception_detail::error_info_injector.46"* %this, %"struct.boost::exception_detail::error_info_injector.46"** %this.addr, align 4
  store %"struct.boost::exception_detail::error_info_injector.46"* %0, %"struct.boost::exception_detail::error_info_injector.46"** %.addr, align 4
  %this1 = load %"struct.boost::exception_detail::error_info_injector.46"** %this.addr
  %1 = bitcast %"struct.boost::exception_detail::error_info_injector.46"* %this1 to %"struct.boost::gregorian::bad_day_of_month"*
  %2 = load %"struct.boost::exception_detail::error_info_injector.46"** %.addr, align 4
  %3 = bitcast %"struct.boost::exception_detail::error_info_injector.46"* %2 to %"struct.boost::gregorian::bad_day_of_month"*
  call void @_ZN5boost9gregorian16bad_day_of_monthC2ERKS1_(%"struct.boost::gregorian::bad_day_of_month"* %1, %"struct.boost::gregorian::bad_day_of_month"* %3)
  %4 = bitcast %"struct.boost::exception_detail::error_info_injector.46"* %this1 to i8*
  %5 = getelementptr inbounds i8* %4, i64 8
  %6 = bitcast i8* %5 to %"class.boost::exception"*
  %7 = load %"struct.boost::exception_detail::error_info_injector.46"** %.addr, align 4
  %8 = bitcast %"struct.boost::exception_detail::error_info_injector.46"* %7 to i8*
  %add.ptr = getelementptr inbounds i8* %8, i32 8
  %9 = bitcast i8* %add.ptr to %"class.boost::exception"*
  invoke void @_ZN5boost9exceptionC2ERKS0_(%"class.boost::exception"* %6, %"class.boost::exception"* %9)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %entry
  %10 = bitcast %"struct.boost::exception_detail::error_info_injector.46"* %this1 to i8***
  store i8** getelementptr inbounds ([9 x i8*]* @_ZTVN5boost16exception_detail19error_info_injectorINS_9gregorian16bad_day_of_monthEEE, i64 0, i64 2), i8*** %10
  %11 = bitcast %"struct.boost::exception_detail::error_info_injector.46"* %this1 to i8*
  %add.ptr2 = getelementptr inbounds i8* %11, i32 8
  %12 = bitcast i8* %add.ptr2 to i8***
  store i8** getelementptr inbounds ([9 x i8*]* @_ZTVN5boost16exception_detail19error_info_injectorINS_9gregorian16bad_day_of_monthEEE, i64 0, i64 7), i8*** %12
  ret void

lpad:                                             ; preds = %entry
  %13 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %14 = extractvalue { i8*, i32 } %13, 0
  store i8* %14, i8** %exn.slot
  %15 = extractvalue { i8*, i32 } %13, 1
  store i32 %15, i32* %ehselector.slot
  %16 = bitcast %"struct.boost::exception_detail::error_info_injector.46"* %this1 to %"struct.boost::gregorian::bad_day_of_month"*
  call void @_ZN5boost9gregorian16bad_day_of_monthD2Ev(%"struct.boost::gregorian::bad_day_of_month"* %16) nounwind
  br label %eh.resume

eh.resume:                                        ; preds = %lpad
  %exn = load i8** %exn.slot
  %sel = load i32* %ehselector.slot
  %lpad.val = insertvalue { i8*, i32 } undef, i8* %exn, 0
  %lpad.val3 = insertvalue { i8*, i32 } %lpad.val, i32 %sel, 1
  resume { i8*, i32 } %lpad.val3
}

define linkonce_odr void @_ZN5boost9gregorian16bad_day_of_monthC2ERKS1_(%"struct.boost::gregorian::bad_day_of_month"* %this, %"struct.boost::gregorian::bad_day_of_month"*) unnamed_addr inlinehint align 2 {
entry:
  %this.addr = alloca %"struct.boost::gregorian::bad_day_of_month"*, align 4
  %.addr = alloca %"struct.boost::gregorian::bad_day_of_month"*, align 4
  store %"struct.boost::gregorian::bad_day_of_month"* %this, %"struct.boost::gregorian::bad_day_of_month"** %this.addr, align 4
  store %"struct.boost::gregorian::bad_day_of_month"* %0, %"struct.boost::gregorian::bad_day_of_month"** %.addr, align 4
  %this1 = load %"struct.boost::gregorian::bad_day_of_month"** %this.addr
  %1 = bitcast %"struct.boost::gregorian::bad_day_of_month"* %this1 to %"class.std::out_of_range"*
  %2 = load %"struct.boost::gregorian::bad_day_of_month"** %.addr, align 4
  %3 = bitcast %"struct.boost::gregorian::bad_day_of_month"* %2 to %"class.std::out_of_range"*
  call void @_ZNSt12out_of_rangeC2ERKS_(%"class.std::out_of_range"* %1, %"class.std::out_of_range"* %3)
  %4 = bitcast %"struct.boost::gregorian::bad_day_of_month"* %this1 to i8***
  store i8** getelementptr inbounds ([5 x i8*]* @_ZTVN5boost9gregorian16bad_day_of_monthE, i64 0, i64 2), i8*** %4
  ret void
}

define linkonce_odr void @_ZN5boost16exception_detail19error_info_injectorINS_9gregorian16bad_day_of_monthEED0Ev(%"struct.boost::exception_detail::error_info_injector.46"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"struct.boost::exception_detail::error_info_injector.46"*, align 4
  store %"struct.boost::exception_detail::error_info_injector.46"* %this, %"struct.boost::exception_detail::error_info_injector.46"** %this.addr, align 4
  %this1 = load %"struct.boost::exception_detail::error_info_injector.46"** %this.addr
  call void @_ZN5boost16exception_detail19error_info_injectorINS_9gregorian16bad_day_of_monthEED1Ev(%"struct.boost::exception_detail::error_info_injector.46"* %this1) nounwind
  %0 = bitcast %"struct.boost::exception_detail::error_info_injector.46"* %this1 to i8*
  call void @_ZdlPv(i8* %0) nounwind
  ret void
}

define linkonce_odr void @_ZThn8_N5boost16exception_detail19error_info_injectorINS_9gregorian16bad_day_of_monthEED0Ev(%"struct.boost::exception_detail::error_info_injector.46"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"struct.boost::exception_detail::error_info_injector.46"*, align 4
  store %"struct.boost::exception_detail::error_info_injector.46"* %this, %"struct.boost::exception_detail::error_info_injector.46"** %this.addr, align 4
  %this1 = load %"struct.boost::exception_detail::error_info_injector.46"** %this.addr
  %0 = bitcast %"struct.boost::exception_detail::error_info_injector.46"* %this1 to i8*
  %1 = getelementptr inbounds i8* %0, i64 -8
  %2 = bitcast i8* %1 to %"struct.boost::exception_detail::error_info_injector.46"*
  call void @_ZN5boost16exception_detail19error_info_injectorINS_9gregorian16bad_day_of_monthEED0Ev(%"struct.boost::exception_detail::error_info_injector.46"* %2) nounwind
  ret void
}

define linkonce_odr void @_ZNSt12out_of_rangeC2ERKS_(%"class.std::out_of_range"* %this, %"class.std::out_of_range"*) unnamed_addr inlinehint align 2 {
entry:
  %this.addr = alloca %"class.std::out_of_range"*, align 4
  %.addr = alloca %"class.std::out_of_range"*, align 4
  store %"class.std::out_of_range"* %this, %"class.std::out_of_range"** %this.addr, align 4
  store %"class.std::out_of_range"* %0, %"class.std::out_of_range"** %.addr, align 4
  %this1 = load %"class.std::out_of_range"** %this.addr
  %1 = bitcast %"class.std::out_of_range"* %this1 to %"class.std::logic_error"*
  %2 = load %"class.std::out_of_range"** %.addr, align 4
  %3 = bitcast %"class.std::out_of_range"* %2 to %"class.std::logic_error"*
  call void @_ZNSt11logic_errorC2ERKS_(%"class.std::logic_error"* %1, %"class.std::logic_error"* %3)
  %4 = bitcast %"class.std::out_of_range"* %this1 to i8***
  store i8** getelementptr inbounds ([5 x i8*]* @_ZTVSt12out_of_range, i64 0, i64 2), i8*** %4
  ret void
}

define linkonce_odr void @_ZNSt11logic_errorC2ERKS_(%"class.std::logic_error"* %this, %"class.std::logic_error"*) unnamed_addr inlinehint align 2 {
entry:
  %this.addr = alloca %"class.std::logic_error"*, align 4
  %.addr = alloca %"class.std::logic_error"*, align 4
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  store %"class.std::logic_error"* %this, %"class.std::logic_error"** %this.addr, align 4
  store %"class.std::logic_error"* %0, %"class.std::logic_error"** %.addr, align 4
  %this1 = load %"class.std::logic_error"** %this.addr
  %1 = bitcast %"class.std::logic_error"* %this1 to %"class.std::exception"*
  %2 = load %"class.std::logic_error"** %.addr, align 4
  %3 = bitcast %"class.std::logic_error"* %2 to %"class.std::exception"*
  call void @_ZNSt9exceptionC2ERKS_(%"class.std::exception"* %1, %"class.std::exception"* %3) nounwind
  %4 = bitcast %"class.std::logic_error"* %this1 to i8***
  store i8** getelementptr inbounds ([5 x i8*]* @_ZTVSt11logic_error, i64 0, i64 2), i8*** %4
  %_M_msg = getelementptr inbounds %"class.std::logic_error"* %this1, i32 0, i32 1
  %5 = load %"class.std::logic_error"** %.addr, align 4
  %_M_msg2 = getelementptr inbounds %"class.std::logic_error"* %5, i32 0, i32 1
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
  %9 = bitcast %"class.std::logic_error"* %this1 to %"class.std::exception"*
  call void @_ZNSt9exceptionD2Ev(%"class.std::exception"* %9) nounwind
  br label %eh.resume

eh.resume:                                        ; preds = %lpad
  %exn = load i8** %exn.slot
  %sel = load i32* %ehselector.slot
  %lpad.val = insertvalue { i8*, i32 } undef, i8* %exn, 0
  %lpad.val3 = insertvalue { i8*, i32 } %lpad.val, i32 %sel, 1
  resume { i8*, i32 } %lpad.val3
}

define linkonce_odr void @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian16bad_day_of_monthEEEEC1ERKS6_NS6_9clone_tagE(%"class.boost::exception_detail::clone_impl.45"* %this, %"class.boost::exception_detail::clone_impl.45"* %x) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::exception_detail::clone_impl.45"*, align 4
  %x.addr = alloca %"class.boost::exception_detail::clone_impl.45"*, align 4
  %0 = alloca %"struct.boost::exception_detail::clone_impl<boost::exception_detail::error_info_injector<boost::gregorian::bad_day_of_month> >::clone_tag", align 1
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  store %"class.boost::exception_detail::clone_impl.45"* %this, %"class.boost::exception_detail::clone_impl.45"** %this.addr, align 4
  store %"class.boost::exception_detail::clone_impl.45"* %x, %"class.boost::exception_detail::clone_impl.45"** %x.addr, align 4
  %this1 = load %"class.boost::exception_detail::clone_impl.45"** %this.addr
  %1 = bitcast %"class.boost::exception_detail::clone_impl.45"* %this1 to i8*
  %2 = getelementptr inbounds i8* %1, i64 28
  %3 = bitcast i8* %2 to %"class.boost::exception_detail::clone_base"*
  call void @_ZN5boost16exception_detail10clone_baseC2Ev(%"class.boost::exception_detail::clone_base"* %3) nounwind
  %4 = bitcast %"class.boost::exception_detail::clone_impl.45"* %this1 to %"struct.boost::exception_detail::error_info_injector.46"*
  %5 = load %"class.boost::exception_detail::clone_impl.45"** %x.addr, align 4
  %6 = bitcast %"class.boost::exception_detail::clone_impl.45"* %5 to %"struct.boost::exception_detail::error_info_injector.46"*
  invoke void @_ZN5boost16exception_detail19error_info_injectorINS_9gregorian16bad_day_of_monthEEC2ERKS4_(%"struct.boost::exception_detail::error_info_injector.46"* %4, %"struct.boost::exception_detail::error_info_injector.46"* %6)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %entry
  %7 = bitcast %"class.boost::exception_detail::clone_impl.45"* %this1 to i8***
  store i8** getelementptr inbounds ([21 x i8*]* @_ZTVN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian16bad_day_of_monthEEEEE, i64 0, i64 3), i8*** %7
  %8 = bitcast %"class.boost::exception_detail::clone_impl.45"* %this1 to i8*
  %add.ptr = getelementptr inbounds i8* %8, i32 8
  %9 = bitcast i8* %add.ptr to i8***
  store i8** getelementptr inbounds ([21 x i8*]* @_ZTVN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian16bad_day_of_monthEEEEE, i64 0, i64 10), i8*** %9
  %10 = bitcast %"class.boost::exception_detail::clone_impl.45"* %this1 to i8*
  %add.ptr2 = getelementptr inbounds i8* %10, i32 28
  %11 = bitcast i8* %add.ptr2 to i8***
  store i8** getelementptr inbounds ([21 x i8*]* @_ZTVN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian16bad_day_of_monthEEEEE, i64 0, i64 17), i8*** %11
  %12 = bitcast %"class.boost::exception_detail::clone_impl.45"* %this1 to i8*
  %add.ptr3 = getelementptr inbounds i8* %12, i32 8
  %13 = bitcast i8* %add.ptr3 to %"class.boost::exception"*
  %14 = load %"class.boost::exception_detail::clone_impl.45"** %x.addr, align 4
  %15 = icmp eq %"class.boost::exception_detail::clone_impl.45"* %14, null
  br i1 %15, label %cast.end, label %cast.notnull

cast.notnull:                                     ; preds = %invoke.cont
  %16 = bitcast %"class.boost::exception_detail::clone_impl.45"* %14 to i8*
  %add.ptr4 = getelementptr inbounds i8* %16, i32 8
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
  %24 = bitcast %"class.boost::exception_detail::clone_impl.45"* %this1 to %"struct.boost::exception_detail::error_info_injector.46"*
  call void @_ZN5boost16exception_detail19error_info_injectorINS_9gregorian16bad_day_of_monthEED2Ev(%"struct.boost::exception_detail::error_info_injector.46"* %24) nounwind
  br label %ehcleanup

ehcleanup:                                        ; preds = %lpad5, %lpad
  %25 = bitcast %"class.boost::exception_detail::clone_impl.45"* %this1 to i8*
  %26 = getelementptr inbounds i8* %25, i64 28
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

define linkonce_odr void @_ZN5boost16exception_detail19error_info_injectorINS_9gregorian16bad_day_of_monthEEC1ERKS3_(%"struct.boost::exception_detail::error_info_injector.46"* %this, %"struct.boost::gregorian::bad_day_of_month"* %x) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"struct.boost::exception_detail::error_info_injector.46"*, align 4
  %x.addr = alloca %"struct.boost::gregorian::bad_day_of_month"*, align 4
  store %"struct.boost::exception_detail::error_info_injector.46"* %this, %"struct.boost::exception_detail::error_info_injector.46"** %this.addr, align 4
  store %"struct.boost::gregorian::bad_day_of_month"* %x, %"struct.boost::gregorian::bad_day_of_month"** %x.addr, align 4
  %this1 = load %"struct.boost::exception_detail::error_info_injector.46"** %this.addr
  %0 = load %"struct.boost::gregorian::bad_day_of_month"** %x.addr
  call void @_ZN5boost16exception_detail19error_info_injectorINS_9gregorian16bad_day_of_monthEEC2ERKS3_(%"struct.boost::exception_detail::error_info_injector.46"* %this1, %"struct.boost::gregorian::bad_day_of_month"* %0)
  ret void
}

define linkonce_odr void @_ZN5boost16exception_detail19error_info_injectorINS_9gregorian16bad_day_of_monthEEC2ERKS3_(%"struct.boost::exception_detail::error_info_injector.46"* %this, %"struct.boost::gregorian::bad_day_of_month"* %x) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"struct.boost::exception_detail::error_info_injector.46"*, align 4
  %x.addr = alloca %"struct.boost::gregorian::bad_day_of_month"*, align 4
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  store %"struct.boost::exception_detail::error_info_injector.46"* %this, %"struct.boost::exception_detail::error_info_injector.46"** %this.addr, align 4
  store %"struct.boost::gregorian::bad_day_of_month"* %x, %"struct.boost::gregorian::bad_day_of_month"** %x.addr, align 4
  %this1 = load %"struct.boost::exception_detail::error_info_injector.46"** %this.addr
  %0 = bitcast %"struct.boost::exception_detail::error_info_injector.46"* %this1 to %"struct.boost::gregorian::bad_day_of_month"*
  %1 = load %"struct.boost::gregorian::bad_day_of_month"** %x.addr, align 4
  call void @_ZN5boost9gregorian16bad_day_of_monthC2ERKS1_(%"struct.boost::gregorian::bad_day_of_month"* %0, %"struct.boost::gregorian::bad_day_of_month"* %1)
  %2 = bitcast %"struct.boost::exception_detail::error_info_injector.46"* %this1 to i8*
  %3 = getelementptr inbounds i8* %2, i64 8
  %4 = bitcast i8* %3 to %"class.boost::exception"*
  invoke void @_ZN5boost9exceptionC2Ev(%"class.boost::exception"* %4)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %entry
  %5 = bitcast %"struct.boost::exception_detail::error_info_injector.46"* %this1 to i8***
  store i8** getelementptr inbounds ([9 x i8*]* @_ZTVN5boost16exception_detail19error_info_injectorINS_9gregorian16bad_day_of_monthEEE, i64 0, i64 2), i8*** %5
  %6 = bitcast %"struct.boost::exception_detail::error_info_injector.46"* %this1 to i8*
  %add.ptr = getelementptr inbounds i8* %6, i32 8
  %7 = bitcast i8* %add.ptr to i8***
  store i8** getelementptr inbounds ([9 x i8*]* @_ZTVN5boost16exception_detail19error_info_injectorINS_9gregorian16bad_day_of_monthEEE, i64 0, i64 7), i8*** %7
  ret void

lpad:                                             ; preds = %entry
  %8 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %9 = extractvalue { i8*, i32 } %8, 0
  store i8* %9, i8** %exn.slot
  %10 = extractvalue { i8*, i32 } %8, 1
  store i32 %10, i32* %ehselector.slot
  %11 = bitcast %"struct.boost::exception_detail::error_info_injector.46"* %this1 to %"struct.boost::gregorian::bad_day_of_month"*
  call void @_ZN5boost9gregorian16bad_day_of_monthD2Ev(%"struct.boost::gregorian::bad_day_of_month"* %11) nounwind
  br label %eh.resume

eh.resume:                                        ; preds = %lpad
  %exn = load i8** %exn.slot
  %sel = load i32* %ehselector.slot
  %lpad.val = insertvalue { i8*, i32 } undef, i8* %exn, 0
  %lpad.val2 = insertvalue { i8*, i32 } %lpad.val, i32 %sel, 1
  resume { i8*, i32 } %lpad.val2
}

define linkonce_odr void @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian16bad_day_of_monthEEEEC1ERKS5_(%"class.boost::exception_detail::clone_impl.45"* %this, %"struct.boost::exception_detail::error_info_injector.46"* %x) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::exception_detail::clone_impl.45"*, align 4
  %x.addr = alloca %"struct.boost::exception_detail::error_info_injector.46"*, align 4
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  store %"class.boost::exception_detail::clone_impl.45"* %this, %"class.boost::exception_detail::clone_impl.45"** %this.addr, align 4
  store %"struct.boost::exception_detail::error_info_injector.46"* %x, %"struct.boost::exception_detail::error_info_injector.46"** %x.addr, align 4
  %this1 = load %"class.boost::exception_detail::clone_impl.45"** %this.addr
  %0 = bitcast %"class.boost::exception_detail::clone_impl.45"* %this1 to i8*
  %1 = getelementptr inbounds i8* %0, i64 28
  %2 = bitcast i8* %1 to %"class.boost::exception_detail::clone_base"*
  call void @_ZN5boost16exception_detail10clone_baseC2Ev(%"class.boost::exception_detail::clone_base"* %2) nounwind
  %3 = bitcast %"class.boost::exception_detail::clone_impl.45"* %this1 to %"struct.boost::exception_detail::error_info_injector.46"*
  %4 = load %"struct.boost::exception_detail::error_info_injector.46"** %x.addr, align 4
  invoke void @_ZN5boost16exception_detail19error_info_injectorINS_9gregorian16bad_day_of_monthEEC2ERKS4_(%"struct.boost::exception_detail::error_info_injector.46"* %3, %"struct.boost::exception_detail::error_info_injector.46"* %4)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %entry
  %5 = bitcast %"class.boost::exception_detail::clone_impl.45"* %this1 to i8***
  store i8** getelementptr inbounds ([21 x i8*]* @_ZTVN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian16bad_day_of_monthEEEEE, i64 0, i64 3), i8*** %5
  %6 = bitcast %"class.boost::exception_detail::clone_impl.45"* %this1 to i8*
  %add.ptr = getelementptr inbounds i8* %6, i32 8
  %7 = bitcast i8* %add.ptr to i8***
  store i8** getelementptr inbounds ([21 x i8*]* @_ZTVN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian16bad_day_of_monthEEEEE, i64 0, i64 10), i8*** %7
  %8 = bitcast %"class.boost::exception_detail::clone_impl.45"* %this1 to i8*
  %add.ptr2 = getelementptr inbounds i8* %8, i32 28
  %9 = bitcast i8* %add.ptr2 to i8***
  store i8** getelementptr inbounds ([21 x i8*]* @_ZTVN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian16bad_day_of_monthEEEEE, i64 0, i64 17), i8*** %9
  %10 = bitcast %"class.boost::exception_detail::clone_impl.45"* %this1 to i8*
  %add.ptr3 = getelementptr inbounds i8* %10, i32 8
  %11 = bitcast i8* %add.ptr3 to %"class.boost::exception"*
  %12 = load %"struct.boost::exception_detail::error_info_injector.46"** %x.addr, align 4
  %13 = icmp eq %"struct.boost::exception_detail::error_info_injector.46"* %12, null
  br i1 %13, label %cast.end, label %cast.notnull

cast.notnull:                                     ; preds = %invoke.cont
  %14 = bitcast %"struct.boost::exception_detail::error_info_injector.46"* %12 to i8*
  %add.ptr4 = getelementptr inbounds i8* %14, i32 8
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
  %22 = bitcast %"class.boost::exception_detail::clone_impl.45"* %this1 to %"struct.boost::exception_detail::error_info_injector.46"*
  call void @_ZN5boost16exception_detail19error_info_injectorINS_9gregorian16bad_day_of_monthEED2Ev(%"struct.boost::exception_detail::error_info_injector.46"* %22) nounwind
  br label %ehcleanup

ehcleanup:                                        ; preds = %lpad5, %lpad
  %23 = bitcast %"class.boost::exception_detail::clone_impl.45"* %this1 to i8*
  %24 = getelementptr inbounds i8* %23, i64 28
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

define linkonce_odr zeroext i16 @_ZN5boost2CV23simple_exception_policyItLt1ELt31ENS_9gregorian16bad_day_of_monthEE3minEv() nounwind align 2 {
entry:
  ret i16 1
}

define linkonce_odr void @_ZN5boost9gregorian10greg_monthC2Et(%"class.boost::gregorian::greg_month"* %this, i16 zeroext %theMonth) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::gregorian::greg_month"*, align 4
  %theMonth.addr = alloca i16, align 2
  store %"class.boost::gregorian::greg_month"* %this, %"class.boost::gregorian::greg_month"** %this.addr, align 4
  store i16 %theMonth, i16* %theMonth.addr, align 2
  %this1 = load %"class.boost::gregorian::greg_month"** %this.addr
  %0 = bitcast %"class.boost::gregorian::greg_month"* %this1 to %"class.boost::CV::constrained_value.43"*
  %1 = load i16* %theMonth.addr, align 2
  call void @_ZN5boost2CV17constrained_valueINS0_23simple_exception_policyItLt1ELt12ENS_9gregorian9bad_monthEEEEC2Et(%"class.boost::CV::constrained_value.43"* %0, i16 zeroext %1)
  ret void
}

define linkonce_odr void @_ZN5boost2CV17constrained_valueINS0_23simple_exception_policyItLt1ELt12ENS_9gregorian9bad_monthEEEEC2Et(%"class.boost::CV::constrained_value.43"* %this, i16 zeroext %value) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::CV::constrained_value.43"*, align 4
  %value.addr = alloca i16, align 2
  store %"class.boost::CV::constrained_value.43"* %this, %"class.boost::CV::constrained_value.43"** %this.addr, align 4
  store i16 %value, i16* %value.addr, align 2
  %this1 = load %"class.boost::CV::constrained_value.43"** %this.addr
  %value_ = getelementptr inbounds %"class.boost::CV::constrained_value.43"* %this1, i32 0, i32 0
  %call = call zeroext i16 @_ZN5boost2CV17constrained_valueINS0_23simple_exception_policyItLt1ELt12ENS_9gregorian9bad_monthEEEE3minEv()
  store i16 %call, i16* %value_, align 2
  %0 = load i16* %value.addr, align 2
  call void @_ZN5boost2CV17constrained_valueINS0_23simple_exception_policyItLt1ELt12ENS_9gregorian9bad_monthEEEE6assignEt(%"class.boost::CV::constrained_value.43"* %this1, i16 zeroext %0)
  ret void
}

define linkonce_odr zeroext i16 @_ZN5boost2CV17constrained_valueINS0_23simple_exception_policyItLt1ELt12ENS_9gregorian9bad_monthEEEE3minEv() align 2 {
entry:
  %call = call zeroext i16 @_ZN5boost2CV23simple_exception_policyItLt1ELt12ENS_9gregorian9bad_monthEE3minEv()
  ret i16 %call
}

define linkonce_odr void @_ZN5boost2CV17constrained_valueINS0_23simple_exception_policyItLt1ELt12ENS_9gregorian9bad_monthEEEE6assignEt(%"class.boost::CV::constrained_value.43"* %this, i16 zeroext %value) align 2 {
entry:
  %this.addr = alloca %"class.boost::CV::constrained_value.43"*, align 4
  %value.addr = alloca i16, align 2
  store %"class.boost::CV::constrained_value.43"* %this, %"class.boost::CV::constrained_value.43"** %this.addr, align 4
  store i16 %value, i16* %value.addr, align 2
  %this1 = load %"class.boost::CV::constrained_value.43"** %this.addr
  %0 = load i16* %value.addr, align 2
  %conv = zext i16 %0 to i32
  %add = add nsw i32 %conv, 1
  %call = call zeroext i16 @_ZN5boost2CV17constrained_valueINS0_23simple_exception_policyItLt1ELt12ENS_9gregorian9bad_monthEEEE3minEv()
  %conv2 = zext i16 %call to i32
  %add3 = add nsw i32 %conv2, 1
  %cmp = icmp slt i32 %add, %add3
  br i1 %cmp, label %if.then, label %if.end

if.then:                                          ; preds = %entry
  %value_ = getelementptr inbounds %"class.boost::CV::constrained_value.43"* %this1, i32 0, i32 0
  %1 = load i16* %value_, align 2
  %2 = load i16* %value.addr, align 2
  call void @_ZN5boost2CV23simple_exception_policyItLt1ELt12ENS_9gregorian9bad_monthEE8on_errorEttNS0_14violation_enumE(i16 zeroext %1, i16 zeroext %2, i32 0)
  br label %return

if.end:                                           ; preds = %entry
  %3 = load i16* %value.addr, align 2
  %conv4 = zext i16 %3 to i32
  %call5 = call zeroext i16 @_ZN5boost2CV17constrained_valueINS0_23simple_exception_policyItLt1ELt12ENS_9gregorian9bad_monthEEEE3maxEv()
  %conv6 = zext i16 %call5 to i32
  %cmp7 = icmp sgt i32 %conv4, %conv6
  br i1 %cmp7, label %if.then8, label %if.end10

if.then8:                                         ; preds = %if.end
  %value_9 = getelementptr inbounds %"class.boost::CV::constrained_value.43"* %this1, i32 0, i32 0
  %4 = load i16* %value_9, align 2
  %5 = load i16* %value.addr, align 2
  call void @_ZN5boost2CV23simple_exception_policyItLt1ELt12ENS_9gregorian9bad_monthEE8on_errorEttNS0_14violation_enumE(i16 zeroext %4, i16 zeroext %5, i32 1)
  br label %return

if.end10:                                         ; preds = %if.end
  %6 = load i16* %value.addr, align 2
  %value_11 = getelementptr inbounds %"class.boost::CV::constrained_value.43"* %this1, i32 0, i32 0
  store i16 %6, i16* %value_11, align 2
  br label %return

return:                                           ; preds = %if.end10, %if.then8, %if.then
  ret void
}

define linkonce_odr void @_ZN5boost2CV23simple_exception_policyItLt1ELt12ENS_9gregorian9bad_monthEE8on_errorEttNS0_14violation_enumE(i16 zeroext, i16 zeroext, i32) align 2 {
entry:
  %.addr = alloca i16, align 2
  %.addr1 = alloca i16, align 2
  %.addr2 = alloca i32, align 4
  %ref.tmp = alloca %"struct.boost::gregorian::bad_month", align 4
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  store i16 %0, i16* %.addr, align 2
  store i16 %1, i16* %.addr1, align 2
  store i32 %2, i32* %.addr2, align 4
  call void @_ZN5boost9gregorian9bad_monthC1Ev(%"struct.boost::gregorian::bad_month"* %ref.tmp)
  invoke void @_ZN5boost15throw_exceptionINS_9gregorian9bad_monthEEEvRKT_(%"struct.boost::gregorian::bad_month"* %ref.tmp) noreturn
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %entry
  unreachable

lpad:                                             ; preds = %entry
  %3 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %4 = extractvalue { i8*, i32 } %3, 0
  store i8* %4, i8** %exn.slot
  %5 = extractvalue { i8*, i32 } %3, 1
  store i32 %5, i32* %ehselector.slot
  call void @_ZN5boost9gregorian9bad_monthD1Ev(%"struct.boost::gregorian::bad_month"* %ref.tmp) nounwind
  br label %eh.resume

return:                                           ; No predecessors!
  ret void

eh.resume:                                        ; preds = %lpad
  %exn = load i8** %exn.slot
  %sel = load i32* %ehselector.slot
  %lpad.val = insertvalue { i8*, i32 } undef, i8* %exn, 0
  %lpad.val3 = insertvalue { i8*, i32 } %lpad.val, i32 %sel, 1
  resume { i8*, i32 } %lpad.val3
}

define linkonce_odr zeroext i16 @_ZN5boost2CV17constrained_valueINS0_23simple_exception_policyItLt1ELt12ENS_9gregorian9bad_monthEEEE3maxEv() align 2 {
entry:
  %call = call zeroext i16 @_ZN5boost2CV23simple_exception_policyItLt1ELt12ENS_9gregorian9bad_monthEE3maxEv()
  ret i16 %call
}

define linkonce_odr zeroext i16 @_ZN5boost2CV23simple_exception_policyItLt1ELt12ENS_9gregorian9bad_monthEE3maxEv() nounwind align 2 {
entry:
  ret i16 12
}

define linkonce_odr void @_ZN5boost15throw_exceptionINS_9gregorian9bad_monthEEEvRKT_(%"struct.boost::gregorian::bad_month"* %e) noreturn inlinehint {
entry:
  %e.addr = alloca %"struct.boost::gregorian::bad_month"*, align 4
  %ref.tmp = alloca %"struct.boost::exception_detail::error_info_injector.49", align 4
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  %cleanup.isactive = alloca i1
  store %"struct.boost::gregorian::bad_month"* %e, %"struct.boost::gregorian::bad_month"** %e.addr, align 4
  %0 = load %"struct.boost::gregorian::bad_month"** %e.addr, align 4
  %1 = bitcast %"struct.boost::gregorian::bad_month"* %0 to %"class.std::exception"*
  call void @_ZN5boost36throw_exception_assert_compatibilityERKSt9exception(%"class.std::exception"* %1)
  %exception = call i8* @__cxa_allocate_exception(i32 32) nounwind
  store i1 true, i1* %cleanup.isactive
  %2 = bitcast i8* %exception to %"class.boost::exception_detail::clone_impl.48"*
  %3 = load %"struct.boost::gregorian::bad_month"** %e.addr, align 4
  invoke void @_ZN5boost17enable_error_infoINS_9gregorian9bad_monthEEENS_16exception_detail29enable_error_info_return_typeIT_E4typeERKS5_(%"struct.boost::exception_detail::error_info_injector.49"* sret %ref.tmp, %"struct.boost::gregorian::bad_month"* %3)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %entry
  invoke void @_ZN5boost24enable_current_exceptionINS_16exception_detail19error_info_injectorINS_9gregorian9bad_monthEEEEENS1_10clone_implIT_EERKS7_(%"class.boost::exception_detail::clone_impl.48"* sret %2, %"struct.boost::exception_detail::error_info_injector.49"* %ref.tmp)
          to label %invoke.cont2 unwind label %lpad1

invoke.cont2:                                     ; preds = %invoke.cont
  store i1 false, i1* %cleanup.isactive
  invoke void @__cxa_throw(i8* %exception, i8* bitcast ({ i8*, i8*, i32, i32, i8*, i32, i8*, i32 }* @_ZTIN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian9bad_monthEEEEE to i8*), i8* bitcast (void (%"class.boost::exception_detail::clone_impl.48"*)* @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian9bad_monthEEEED1Ev to i8*)) noreturn
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
  call void @_ZN5boost16exception_detail19error_info_injectorINS_9gregorian9bad_monthEED1Ev(%"struct.boost::exception_detail::error_info_injector.49"* %ref.tmp) nounwind
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

define linkonce_odr void @_ZN5boost9gregorian9bad_monthC1Ev(%"struct.boost::gregorian::bad_month"* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"struct.boost::gregorian::bad_month"*, align 4
  store %"struct.boost::gregorian::bad_month"* %this, %"struct.boost::gregorian::bad_month"** %this.addr, align 4
  %this1 = load %"struct.boost::gregorian::bad_month"** %this.addr
  call void @_ZN5boost9gregorian9bad_monthC2Ev(%"struct.boost::gregorian::bad_month"* %this1)
  ret void
}

define linkonce_odr void @_ZN5boost9gregorian9bad_monthD1Ev(%"struct.boost::gregorian::bad_month"* %this) unnamed_addr nounwind inlinehint align 2 {
entry:
  %this.addr = alloca %"struct.boost::gregorian::bad_month"*, align 4
  store %"struct.boost::gregorian::bad_month"* %this, %"struct.boost::gregorian::bad_month"** %this.addr, align 4
  %this1 = load %"struct.boost::gregorian::bad_month"** %this.addr
  call void @_ZN5boost9gregorian9bad_monthD2Ev(%"struct.boost::gregorian::bad_month"* %this1) nounwind
  ret void
}

define linkonce_odr void @_ZN5boost9gregorian9bad_monthD2Ev(%"struct.boost::gregorian::bad_month"* %this) unnamed_addr nounwind inlinehint align 2 {
entry:
  %this.addr = alloca %"struct.boost::gregorian::bad_month"*, align 4
  store %"struct.boost::gregorian::bad_month"* %this, %"struct.boost::gregorian::bad_month"** %this.addr, align 4
  %this1 = load %"struct.boost::gregorian::bad_month"** %this.addr
  %0 = bitcast %"struct.boost::gregorian::bad_month"* %this1 to %"class.std::out_of_range"*
  call void @_ZNSt12out_of_rangeD2Ev(%"class.std::out_of_range"* %0) nounwind
  ret void
}

define linkonce_odr void @_ZN5boost9gregorian9bad_monthC2Ev(%"struct.boost::gregorian::bad_month"* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"struct.boost::gregorian::bad_month"*, align 4
  %ref.tmp = alloca %"class.std::basic_string", align 4
  %ref.tmp2 = alloca %"class.std::allocator", align 1
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  store %"struct.boost::gregorian::bad_month"* %this, %"struct.boost::gregorian::bad_month"** %this.addr, align 4
  %this1 = load %"struct.boost::gregorian::bad_month"** %this.addr
  %0 = bitcast %"struct.boost::gregorian::bad_month"* %this1 to %"class.std::out_of_range"*
  call void @_ZNSaIcEC1Ev(%"class.std::allocator"* %ref.tmp2) nounwind
  invoke void @_ZNSsC1EPKcRKSaIcE(%"class.std::basic_string"* %ref.tmp, i8* getelementptr inbounds ([35 x i8]* @.str40, i32 0, i32 0), %"class.std::allocator"* %ref.tmp2)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %entry
  invoke void @_ZNSt12out_of_rangeC2ERKSs(%"class.std::out_of_range"* %0, %"class.std::basic_string"* %ref.tmp)
          to label %invoke.cont4 unwind label %lpad3

invoke.cont4:                                     ; preds = %invoke.cont
  invoke void @_ZNSsD1Ev(%"class.std::basic_string"* %ref.tmp)
          to label %invoke.cont5 unwind label %lpad

invoke.cont5:                                     ; preds = %invoke.cont4
  call void @_ZNSaIcED1Ev(%"class.std::allocator"* %ref.tmp2) nounwind
  %1 = bitcast %"struct.boost::gregorian::bad_month"* %this1 to i8***
  store i8** getelementptr inbounds ([5 x i8*]* @_ZTVN5boost9gregorian9bad_monthE, i64 0, i64 2), i8*** %1
  ret void

lpad:                                             ; preds = %invoke.cont4, %entry
  %2 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %3 = extractvalue { i8*, i32 } %2, 0
  store i8* %3, i8** %exn.slot
  %4 = extractvalue { i8*, i32 } %2, 1
  store i32 %4, i32* %ehselector.slot
  br label %ehcleanup

lpad3:                                            ; preds = %invoke.cont
  %5 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %6 = extractvalue { i8*, i32 } %5, 0
  store i8* %6, i8** %exn.slot
  %7 = extractvalue { i8*, i32 } %5, 1
  store i32 %7, i32* %ehselector.slot
  invoke void @_ZNSsD1Ev(%"class.std::basic_string"* %ref.tmp)
          to label %invoke.cont6 unwind label %terminate.lpad

invoke.cont6:                                     ; preds = %lpad3
  br label %ehcleanup

ehcleanup:                                        ; preds = %invoke.cont6, %lpad
  call void @_ZNSaIcED1Ev(%"class.std::allocator"* %ref.tmp2) nounwind
  br label %eh.resume

eh.resume:                                        ; preds = %ehcleanup
  %exn = load i8** %exn.slot
  %sel = load i32* %ehselector.slot
  %lpad.val = insertvalue { i8*, i32 } undef, i8* %exn, 0
  %lpad.val7 = insertvalue { i8*, i32 } %lpad.val, i32 %sel, 1
  resume { i8*, i32 } %lpad.val7

terminate.lpad:                                   ; preds = %lpad3
  %8 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          catch i8* null
  call void @_ZSt9terminatev() noreturn nounwind
  unreachable
}

define linkonce_odr void @_ZN5boost9gregorian9bad_monthD0Ev(%"struct.boost::gregorian::bad_month"* %this) unnamed_addr nounwind inlinehint align 2 {
entry:
  %this.addr = alloca %"struct.boost::gregorian::bad_month"*, align 4
  store %"struct.boost::gregorian::bad_month"* %this, %"struct.boost::gregorian::bad_month"** %this.addr, align 4
  %this1 = load %"struct.boost::gregorian::bad_month"** %this.addr
  call void @_ZN5boost9gregorian9bad_monthD1Ev(%"struct.boost::gregorian::bad_month"* %this1) nounwind
  %0 = bitcast %"struct.boost::gregorian::bad_month"* %this1 to i8*
  call void @_ZdlPv(i8* %0) nounwind
  ret void
}

define linkonce_odr void @_ZN5boost24enable_current_exceptionINS_16exception_detail19error_info_injectorINS_9gregorian9bad_monthEEEEENS1_10clone_implIT_EERKS7_(%"class.boost::exception_detail::clone_impl.48"* noalias sret %agg.result, %"struct.boost::exception_detail::error_info_injector.49"* %x) inlinehint {
entry:
  %x.addr = alloca %"struct.boost::exception_detail::error_info_injector.49"*, align 4
  store %"struct.boost::exception_detail::error_info_injector.49"* %x, %"struct.boost::exception_detail::error_info_injector.49"** %x.addr, align 4
  %0 = load %"struct.boost::exception_detail::error_info_injector.49"** %x.addr, align 4
  call void @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian9bad_monthEEEEC1ERKS5_(%"class.boost::exception_detail::clone_impl.48"* %agg.result, %"struct.boost::exception_detail::error_info_injector.49"* %0)
  ret void
}

define linkonce_odr void @_ZN5boost17enable_error_infoINS_9gregorian9bad_monthEEENS_16exception_detail29enable_error_info_return_typeIT_E4typeERKS5_(%"struct.boost::exception_detail::error_info_injector.49"* noalias sret %agg.result, %"struct.boost::gregorian::bad_month"* %x) inlinehint {
entry:
  %x.addr = alloca %"struct.boost::gregorian::bad_month"*, align 4
  store %"struct.boost::gregorian::bad_month"* %x, %"struct.boost::gregorian::bad_month"** %x.addr, align 4
  %0 = load %"struct.boost::gregorian::bad_month"** %x.addr, align 4
  call void @_ZN5boost16exception_detail19error_info_injectorINS_9gregorian9bad_monthEEC1ERKS3_(%"struct.boost::exception_detail::error_info_injector.49"* %agg.result, %"struct.boost::gregorian::bad_month"* %0)
  ret void
}

define linkonce_odr void @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian9bad_monthEEEED1Ev(%"class.boost::exception_detail::clone_impl.48"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::exception_detail::clone_impl.48"*, align 4
  store %"class.boost::exception_detail::clone_impl.48"* %this, %"class.boost::exception_detail::clone_impl.48"** %this.addr, align 4
  %this1 = load %"class.boost::exception_detail::clone_impl.48"** %this.addr
  call void @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian9bad_monthEEEED2Ev(%"class.boost::exception_detail::clone_impl.48"* %this1, i8** getelementptr inbounds ([2 x i8*]* @_ZTTN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian9bad_monthEEEEE, i64 0, i64 0)) nounwind
  %0 = bitcast %"class.boost::exception_detail::clone_impl.48"* %this1 to i8*
  %1 = getelementptr inbounds i8* %0, i64 28
  %2 = bitcast i8* %1 to %"class.boost::exception_detail::clone_base"*
  call void @_ZN5boost16exception_detail10clone_baseD2Ev(%"class.boost::exception_detail::clone_base"* %2) nounwind
  ret void
}

define linkonce_odr void @_ZN5boost16exception_detail19error_info_injectorINS_9gregorian9bad_monthEED1Ev(%"struct.boost::exception_detail::error_info_injector.49"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"struct.boost::exception_detail::error_info_injector.49"*, align 4
  store %"struct.boost::exception_detail::error_info_injector.49"* %this, %"struct.boost::exception_detail::error_info_injector.49"** %this.addr, align 4
  %this1 = load %"struct.boost::exception_detail::error_info_injector.49"** %this.addr
  call void @_ZN5boost16exception_detail19error_info_injectorINS_9gregorian9bad_monthEED2Ev(%"struct.boost::exception_detail::error_info_injector.49"* %this1) nounwind
  ret void
}

define linkonce_odr void @_ZN5boost16exception_detail19error_info_injectorINS_9gregorian9bad_monthEED2Ev(%"struct.boost::exception_detail::error_info_injector.49"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"struct.boost::exception_detail::error_info_injector.49"*, align 4
  store %"struct.boost::exception_detail::error_info_injector.49"* %this, %"struct.boost::exception_detail::error_info_injector.49"** %this.addr, align 4
  %this1 = load %"struct.boost::exception_detail::error_info_injector.49"** %this.addr
  %0 = bitcast %"struct.boost::exception_detail::error_info_injector.49"* %this1 to i8*
  %1 = getelementptr inbounds i8* %0, i64 8
  %2 = bitcast i8* %1 to %"class.boost::exception"*
  call void @_ZN5boost9exceptionD2Ev(%"class.boost::exception"* %2) nounwind
  %3 = bitcast %"struct.boost::exception_detail::error_info_injector.49"* %this1 to %"struct.boost::gregorian::bad_month"*
  call void @_ZN5boost9gregorian9bad_monthD2Ev(%"struct.boost::gregorian::bad_month"* %3) nounwind
  ret void
}

define linkonce_odr void @_ZThn8_N5boost16exception_detail19error_info_injectorINS_9gregorian9bad_monthEED1Ev(%"struct.boost::exception_detail::error_info_injector.49"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"struct.boost::exception_detail::error_info_injector.49"*, align 4
  store %"struct.boost::exception_detail::error_info_injector.49"* %this, %"struct.boost::exception_detail::error_info_injector.49"** %this.addr, align 4
  %this1 = load %"struct.boost::exception_detail::error_info_injector.49"** %this.addr
  %0 = bitcast %"struct.boost::exception_detail::error_info_injector.49"* %this1 to i8*
  %1 = getelementptr inbounds i8* %0, i64 -8
  %2 = bitcast i8* %1 to %"struct.boost::exception_detail::error_info_injector.49"*
  call void @_ZN5boost16exception_detail19error_info_injectorINS_9gregorian9bad_monthEED1Ev(%"struct.boost::exception_detail::error_info_injector.49"* %2) nounwind
  ret void
}

define linkonce_odr void @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian9bad_monthEEEED2Ev(%"class.boost::exception_detail::clone_impl.48"* %this, i8** %vtt) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::exception_detail::clone_impl.48"*, align 4
  %vtt.addr = alloca i8**, align 4
  store %"class.boost::exception_detail::clone_impl.48"* %this, %"class.boost::exception_detail::clone_impl.48"** %this.addr, align 4
  store i8** %vtt, i8*** %vtt.addr, align 4
  %this1 = load %"class.boost::exception_detail::clone_impl.48"** %this.addr
  %vtt2 = load i8*** %vtt.addr
  %0 = bitcast %"class.boost::exception_detail::clone_impl.48"* %this1 to %"struct.boost::exception_detail::error_info_injector.49"*
  call void @_ZN5boost16exception_detail19error_info_injectorINS_9gregorian9bad_monthEED2Ev(%"struct.boost::exception_detail::error_info_injector.49"* %0) nounwind
  ret void
}

define linkonce_odr void @_ZThn8_N5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian9bad_monthEEEED1Ev(%"class.boost::exception_detail::clone_impl.48"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::exception_detail::clone_impl.48"*, align 4
  store %"class.boost::exception_detail::clone_impl.48"* %this, %"class.boost::exception_detail::clone_impl.48"** %this.addr, align 4
  %this1 = load %"class.boost::exception_detail::clone_impl.48"** %this.addr
  %0 = bitcast %"class.boost::exception_detail::clone_impl.48"* %this1 to i8*
  %1 = getelementptr inbounds i8* %0, i64 -8
  %2 = bitcast i8* %1 to %"class.boost::exception_detail::clone_impl.48"*
  call void @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian9bad_monthEEEED1Ev(%"class.boost::exception_detail::clone_impl.48"* %2) nounwind
  ret void
}

define linkonce_odr void @_ZTv0_n20_N5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian9bad_monthEEEED1Ev(%"class.boost::exception_detail::clone_impl.48"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::exception_detail::clone_impl.48"*, align 4
  store %"class.boost::exception_detail::clone_impl.48"* %this, %"class.boost::exception_detail::clone_impl.48"** %this.addr, align 4
  %this1 = load %"class.boost::exception_detail::clone_impl.48"** %this.addr
  %0 = bitcast %"class.boost::exception_detail::clone_impl.48"* %this1 to i8*
  %1 = bitcast i8* %0 to i8**
  %2 = load i8** %1
  %3 = getelementptr inbounds i8* %2, i64 -20
  %4 = bitcast i8* %3 to i32*
  %5 = load i32* %4
  %6 = getelementptr inbounds i8* %0, i32 %5
  %7 = bitcast i8* %6 to %"class.boost::exception_detail::clone_impl.48"*
  call void @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian9bad_monthEEEED1Ev(%"class.boost::exception_detail::clone_impl.48"* %7) nounwind
  ret void
}

define linkonce_odr void @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian9bad_monthEEEED0Ev(%"class.boost::exception_detail::clone_impl.48"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::exception_detail::clone_impl.48"*, align 4
  store %"class.boost::exception_detail::clone_impl.48"* %this, %"class.boost::exception_detail::clone_impl.48"** %this.addr, align 4
  %this1 = load %"class.boost::exception_detail::clone_impl.48"** %this.addr
  call void @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian9bad_monthEEEED1Ev(%"class.boost::exception_detail::clone_impl.48"* %this1) nounwind
  %0 = bitcast %"class.boost::exception_detail::clone_impl.48"* %this1 to i8*
  call void @_ZdlPv(i8* %0) nounwind
  ret void
}

define linkonce_odr %"class.boost::exception_detail::clone_base"* @_ZNK5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian9bad_monthEEEE5cloneEv(%"class.boost::exception_detail::clone_impl.48"* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::exception_detail::clone_impl.48"*, align 4
  %agg.tmp = alloca %"struct.boost::exception_detail::clone_impl<boost::exception_detail::error_info_injector<boost::gregorian::bad_month> >::clone_tag", align 1
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  store %"class.boost::exception_detail::clone_impl.48"* %this, %"class.boost::exception_detail::clone_impl.48"** %this.addr, align 4
  %this1 = load %"class.boost::exception_detail::clone_impl.48"** %this.addr
  %call = call noalias i8* @_Znwj(i32 32)
  %0 = bitcast i8* %call to %"class.boost::exception_detail::clone_impl.48"*
  invoke void @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian9bad_monthEEEEC1ERKS6_NS6_9clone_tagE(%"class.boost::exception_detail::clone_impl.48"* %0, %"class.boost::exception_detail::clone_impl.48"* %this1)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %entry
  %1 = icmp eq %"class.boost::exception_detail::clone_impl.48"* %0, null
  br i1 %1, label %cast.end, label %cast.notnull

cast.notnull:                                     ; preds = %invoke.cont
  %2 = bitcast %"class.boost::exception_detail::clone_impl.48"* %0 to i8**
  %vtable = load i8** %2
  %vbase.offset.ptr = getelementptr i8* %vtable, i64 -12
  %3 = bitcast i8* %vbase.offset.ptr to i32*
  %vbase.offset = load i32* %3
  %4 = bitcast %"class.boost::exception_detail::clone_impl.48"* %0 to i8*
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

define linkonce_odr void @_ZNK5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian9bad_monthEEEE7rethrowEv(%"class.boost::exception_detail::clone_impl.48"* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::exception_detail::clone_impl.48"*, align 4
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  store %"class.boost::exception_detail::clone_impl.48"* %this, %"class.boost::exception_detail::clone_impl.48"** %this.addr, align 4
  %this1 = load %"class.boost::exception_detail::clone_impl.48"** %this.addr
  %exception = call i8* @__cxa_allocate_exception(i32 32) nounwind
  %0 = bitcast i8* %exception to %"class.boost::exception_detail::clone_impl.48"*
  invoke void @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian9bad_monthEEEEC1ERKS6_(%"class.boost::exception_detail::clone_impl.48"* %0, %"class.boost::exception_detail::clone_impl.48"* %this1)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %entry
  call void @__cxa_throw(i8* %exception, i8* bitcast ({ i8*, i8*, i32, i32, i8*, i32, i8*, i32 }* @_ZTIN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian9bad_monthEEEEE to i8*), i8* bitcast (void (%"class.boost::exception_detail::clone_impl.48"*)* @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian9bad_monthEEEED1Ev to i8*)) noreturn
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

define linkonce_odr void @_ZThn8_N5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian9bad_monthEEEED0Ev(%"class.boost::exception_detail::clone_impl.48"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::exception_detail::clone_impl.48"*, align 4
  store %"class.boost::exception_detail::clone_impl.48"* %this, %"class.boost::exception_detail::clone_impl.48"** %this.addr, align 4
  %this1 = load %"class.boost::exception_detail::clone_impl.48"** %this.addr
  %0 = bitcast %"class.boost::exception_detail::clone_impl.48"* %this1 to i8*
  %1 = getelementptr inbounds i8* %0, i64 -8
  %2 = bitcast i8* %1 to %"class.boost::exception_detail::clone_impl.48"*
  call void @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian9bad_monthEEEED0Ev(%"class.boost::exception_detail::clone_impl.48"* %2) nounwind
  ret void
}

define linkonce_odr %"class.boost::exception_detail::clone_base"* @_ZTv0_n12_NK5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian9bad_monthEEEE5cloneEv(%"class.boost::exception_detail::clone_impl.48"* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::exception_detail::clone_impl.48"*, align 4
  store %"class.boost::exception_detail::clone_impl.48"* %this, %"class.boost::exception_detail::clone_impl.48"** %this.addr, align 4
  %this1 = load %"class.boost::exception_detail::clone_impl.48"** %this.addr
  %0 = bitcast %"class.boost::exception_detail::clone_impl.48"* %this1 to i8*
  %1 = bitcast i8* %0 to i8**
  %2 = load i8** %1
  %3 = getelementptr inbounds i8* %2, i64 -12
  %4 = bitcast i8* %3 to i32*
  %5 = load i32* %4
  %6 = getelementptr inbounds i8* %0, i32 %5
  %7 = bitcast i8* %6 to %"class.boost::exception_detail::clone_impl.48"*
  %call = call %"class.boost::exception_detail::clone_base"* @_ZNK5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian9bad_monthEEEE5cloneEv(%"class.boost::exception_detail::clone_impl.48"* %7)
  ret %"class.boost::exception_detail::clone_base"* %call
}

define linkonce_odr void @_ZTv0_n16_NK5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian9bad_monthEEEE7rethrowEv(%"class.boost::exception_detail::clone_impl.48"* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::exception_detail::clone_impl.48"*, align 4
  store %"class.boost::exception_detail::clone_impl.48"* %this, %"class.boost::exception_detail::clone_impl.48"** %this.addr, align 4
  %this1 = load %"class.boost::exception_detail::clone_impl.48"** %this.addr
  %0 = bitcast %"class.boost::exception_detail::clone_impl.48"* %this1 to i8*
  %1 = bitcast i8* %0 to i8**
  %2 = load i8** %1
  %3 = getelementptr inbounds i8* %2, i64 -16
  %4 = bitcast i8* %3 to i32*
  %5 = load i32* %4
  %6 = getelementptr inbounds i8* %0, i32 %5
  %7 = bitcast i8* %6 to %"class.boost::exception_detail::clone_impl.48"*
  call void @_ZNK5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian9bad_monthEEEE7rethrowEv(%"class.boost::exception_detail::clone_impl.48"* %7)
  ret void
}

define linkonce_odr void @_ZTv0_n20_N5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian9bad_monthEEEED0Ev(%"class.boost::exception_detail::clone_impl.48"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::exception_detail::clone_impl.48"*, align 4
  store %"class.boost::exception_detail::clone_impl.48"* %this, %"class.boost::exception_detail::clone_impl.48"** %this.addr, align 4
  %this1 = load %"class.boost::exception_detail::clone_impl.48"** %this.addr
  %0 = bitcast %"class.boost::exception_detail::clone_impl.48"* %this1 to i8*
  %1 = bitcast i8* %0 to i8**
  %2 = load i8** %1
  %3 = getelementptr inbounds i8* %2, i64 -20
  %4 = bitcast i8* %3 to i32*
  %5 = load i32* %4
  %6 = getelementptr inbounds i8* %0, i32 %5
  %7 = bitcast i8* %6 to %"class.boost::exception_detail::clone_impl.48"*
  call void @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian9bad_monthEEEED0Ev(%"class.boost::exception_detail::clone_impl.48"* %7) nounwind
  ret void
}

define linkonce_odr void @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian9bad_monthEEEEC1ERKS6_(%"class.boost::exception_detail::clone_impl.48"* %this, %"class.boost::exception_detail::clone_impl.48"*) unnamed_addr inlinehint align 2 {
entry:
  %this.addr = alloca %"class.boost::exception_detail::clone_impl.48"*, align 4
  %.addr = alloca %"class.boost::exception_detail::clone_impl.48"*, align 4
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  store %"class.boost::exception_detail::clone_impl.48"* %this, %"class.boost::exception_detail::clone_impl.48"** %this.addr, align 4
  store %"class.boost::exception_detail::clone_impl.48"* %0, %"class.boost::exception_detail::clone_impl.48"** %.addr, align 4
  %this1 = load %"class.boost::exception_detail::clone_impl.48"** %this.addr
  %1 = bitcast %"class.boost::exception_detail::clone_impl.48"* %this1 to i8*
  %2 = getelementptr inbounds i8* %1, i64 28
  %3 = bitcast i8* %2 to %"class.boost::exception_detail::clone_base"*
  %4 = load %"class.boost::exception_detail::clone_impl.48"** %.addr, align 4
  %5 = bitcast %"class.boost::exception_detail::clone_impl.48"* %4 to i8**
  %vtable = load i8** %5
  %vbase.offset.ptr = getelementptr i8* %vtable, i64 -12
  %6 = bitcast i8* %vbase.offset.ptr to i32*
  %vbase.offset = load i32* %6
  %7 = bitcast %"class.boost::exception_detail::clone_impl.48"* %4 to i8*
  %add.ptr = getelementptr inbounds i8* %7, i32 %vbase.offset
  %8 = bitcast i8* %add.ptr to %"class.boost::exception_detail::clone_base"*
  call void @_ZN5boost16exception_detail10clone_baseC2ERKS1_(%"class.boost::exception_detail::clone_base"* %3, %"class.boost::exception_detail::clone_base"* %8) nounwind
  %9 = bitcast %"class.boost::exception_detail::clone_impl.48"* %this1 to %"struct.boost::exception_detail::error_info_injector.49"*
  %10 = load %"class.boost::exception_detail::clone_impl.48"** %.addr, align 4
  %11 = bitcast %"class.boost::exception_detail::clone_impl.48"* %10 to %"struct.boost::exception_detail::error_info_injector.49"*
  invoke void @_ZN5boost16exception_detail19error_info_injectorINS_9gregorian9bad_monthEEC2ERKS4_(%"struct.boost::exception_detail::error_info_injector.49"* %9, %"struct.boost::exception_detail::error_info_injector.49"* %11)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %entry
  %12 = bitcast %"class.boost::exception_detail::clone_impl.48"* %this1 to i8***
  store i8** getelementptr inbounds ([21 x i8*]* @_ZTVN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian9bad_monthEEEEE, i64 0, i64 3), i8*** %12
  %13 = bitcast %"class.boost::exception_detail::clone_impl.48"* %this1 to i8*
  %add.ptr2 = getelementptr inbounds i8* %13, i32 8
  %14 = bitcast i8* %add.ptr2 to i8***
  store i8** getelementptr inbounds ([21 x i8*]* @_ZTVN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian9bad_monthEEEEE, i64 0, i64 10), i8*** %14
  %15 = bitcast %"class.boost::exception_detail::clone_impl.48"* %this1 to i8*
  %add.ptr3 = getelementptr inbounds i8* %15, i32 28
  %16 = bitcast i8* %add.ptr3 to i8***
  store i8** getelementptr inbounds ([21 x i8*]* @_ZTVN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian9bad_monthEEEEE, i64 0, i64 17), i8*** %16
  ret void

lpad:                                             ; preds = %entry
  %17 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %18 = extractvalue { i8*, i32 } %17, 0
  store i8* %18, i8** %exn.slot
  %19 = extractvalue { i8*, i32 } %17, 1
  store i32 %19, i32* %ehselector.slot
  %20 = bitcast %"class.boost::exception_detail::clone_impl.48"* %this1 to i8*
  %21 = getelementptr inbounds i8* %20, i64 28
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

define linkonce_odr void @_ZN5boost16exception_detail19error_info_injectorINS_9gregorian9bad_monthEEC2ERKS4_(%"struct.boost::exception_detail::error_info_injector.49"* %this, %"struct.boost::exception_detail::error_info_injector.49"*) unnamed_addr inlinehint align 2 {
entry:
  %this.addr = alloca %"struct.boost::exception_detail::error_info_injector.49"*, align 4
  %.addr = alloca %"struct.boost::exception_detail::error_info_injector.49"*, align 4
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  store %"struct.boost::exception_detail::error_info_injector.49"* %this, %"struct.boost::exception_detail::error_info_injector.49"** %this.addr, align 4
  store %"struct.boost::exception_detail::error_info_injector.49"* %0, %"struct.boost::exception_detail::error_info_injector.49"** %.addr, align 4
  %this1 = load %"struct.boost::exception_detail::error_info_injector.49"** %this.addr
  %1 = bitcast %"struct.boost::exception_detail::error_info_injector.49"* %this1 to %"struct.boost::gregorian::bad_month"*
  %2 = load %"struct.boost::exception_detail::error_info_injector.49"** %.addr, align 4
  %3 = bitcast %"struct.boost::exception_detail::error_info_injector.49"* %2 to %"struct.boost::gregorian::bad_month"*
  call void @_ZN5boost9gregorian9bad_monthC2ERKS1_(%"struct.boost::gregorian::bad_month"* %1, %"struct.boost::gregorian::bad_month"* %3)
  %4 = bitcast %"struct.boost::exception_detail::error_info_injector.49"* %this1 to i8*
  %5 = getelementptr inbounds i8* %4, i64 8
  %6 = bitcast i8* %5 to %"class.boost::exception"*
  %7 = load %"struct.boost::exception_detail::error_info_injector.49"** %.addr, align 4
  %8 = bitcast %"struct.boost::exception_detail::error_info_injector.49"* %7 to i8*
  %add.ptr = getelementptr inbounds i8* %8, i32 8
  %9 = bitcast i8* %add.ptr to %"class.boost::exception"*
  invoke void @_ZN5boost9exceptionC2ERKS0_(%"class.boost::exception"* %6, %"class.boost::exception"* %9)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %entry
  %10 = bitcast %"struct.boost::exception_detail::error_info_injector.49"* %this1 to i8***
  store i8** getelementptr inbounds ([9 x i8*]* @_ZTVN5boost16exception_detail19error_info_injectorINS_9gregorian9bad_monthEEE, i64 0, i64 2), i8*** %10
  %11 = bitcast %"struct.boost::exception_detail::error_info_injector.49"* %this1 to i8*
  %add.ptr2 = getelementptr inbounds i8* %11, i32 8
  %12 = bitcast i8* %add.ptr2 to i8***
  store i8** getelementptr inbounds ([9 x i8*]* @_ZTVN5boost16exception_detail19error_info_injectorINS_9gregorian9bad_monthEEE, i64 0, i64 7), i8*** %12
  ret void

lpad:                                             ; preds = %entry
  %13 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %14 = extractvalue { i8*, i32 } %13, 0
  store i8* %14, i8** %exn.slot
  %15 = extractvalue { i8*, i32 } %13, 1
  store i32 %15, i32* %ehselector.slot
  %16 = bitcast %"struct.boost::exception_detail::error_info_injector.49"* %this1 to %"struct.boost::gregorian::bad_month"*
  call void @_ZN5boost9gregorian9bad_monthD2Ev(%"struct.boost::gregorian::bad_month"* %16) nounwind
  br label %eh.resume

eh.resume:                                        ; preds = %lpad
  %exn = load i8** %exn.slot
  %sel = load i32* %ehselector.slot
  %lpad.val = insertvalue { i8*, i32 } undef, i8* %exn, 0
  %lpad.val3 = insertvalue { i8*, i32 } %lpad.val, i32 %sel, 1
  resume { i8*, i32 } %lpad.val3
}

define linkonce_odr void @_ZN5boost9gregorian9bad_monthC2ERKS1_(%"struct.boost::gregorian::bad_month"* %this, %"struct.boost::gregorian::bad_month"*) unnamed_addr inlinehint align 2 {
entry:
  %this.addr = alloca %"struct.boost::gregorian::bad_month"*, align 4
  %.addr = alloca %"struct.boost::gregorian::bad_month"*, align 4
  store %"struct.boost::gregorian::bad_month"* %this, %"struct.boost::gregorian::bad_month"** %this.addr, align 4
  store %"struct.boost::gregorian::bad_month"* %0, %"struct.boost::gregorian::bad_month"** %.addr, align 4
  %this1 = load %"struct.boost::gregorian::bad_month"** %this.addr
  %1 = bitcast %"struct.boost::gregorian::bad_month"* %this1 to %"class.std::out_of_range"*
  %2 = load %"struct.boost::gregorian::bad_month"** %.addr, align 4
  %3 = bitcast %"struct.boost::gregorian::bad_month"* %2 to %"class.std::out_of_range"*
  call void @_ZNSt12out_of_rangeC2ERKS_(%"class.std::out_of_range"* %1, %"class.std::out_of_range"* %3)
  %4 = bitcast %"struct.boost::gregorian::bad_month"* %this1 to i8***
  store i8** getelementptr inbounds ([5 x i8*]* @_ZTVN5boost9gregorian9bad_monthE, i64 0, i64 2), i8*** %4
  ret void
}

define linkonce_odr void @_ZN5boost16exception_detail19error_info_injectorINS_9gregorian9bad_monthEED0Ev(%"struct.boost::exception_detail::error_info_injector.49"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"struct.boost::exception_detail::error_info_injector.49"*, align 4
  store %"struct.boost::exception_detail::error_info_injector.49"* %this, %"struct.boost::exception_detail::error_info_injector.49"** %this.addr, align 4
  %this1 = load %"struct.boost::exception_detail::error_info_injector.49"** %this.addr
  call void @_ZN5boost16exception_detail19error_info_injectorINS_9gregorian9bad_monthEED1Ev(%"struct.boost::exception_detail::error_info_injector.49"* %this1) nounwind
  %0 = bitcast %"struct.boost::exception_detail::error_info_injector.49"* %this1 to i8*
  call void @_ZdlPv(i8* %0) nounwind
  ret void
}

define linkonce_odr void @_ZThn8_N5boost16exception_detail19error_info_injectorINS_9gregorian9bad_monthEED0Ev(%"struct.boost::exception_detail::error_info_injector.49"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"struct.boost::exception_detail::error_info_injector.49"*, align 4
  store %"struct.boost::exception_detail::error_info_injector.49"* %this, %"struct.boost::exception_detail::error_info_injector.49"** %this.addr, align 4
  %this1 = load %"struct.boost::exception_detail::error_info_injector.49"** %this.addr
  %0 = bitcast %"struct.boost::exception_detail::error_info_injector.49"* %this1 to i8*
  %1 = getelementptr inbounds i8* %0, i64 -8
  %2 = bitcast i8* %1 to %"struct.boost::exception_detail::error_info_injector.49"*
  call void @_ZN5boost16exception_detail19error_info_injectorINS_9gregorian9bad_monthEED0Ev(%"struct.boost::exception_detail::error_info_injector.49"* %2) nounwind
  ret void
}

define linkonce_odr void @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian9bad_monthEEEEC1ERKS6_NS6_9clone_tagE(%"class.boost::exception_detail::clone_impl.48"* %this, %"class.boost::exception_detail::clone_impl.48"* %x) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::exception_detail::clone_impl.48"*, align 4
  %x.addr = alloca %"class.boost::exception_detail::clone_impl.48"*, align 4
  %0 = alloca %"struct.boost::exception_detail::clone_impl<boost::exception_detail::error_info_injector<boost::gregorian::bad_month> >::clone_tag", align 1
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  store %"class.boost::exception_detail::clone_impl.48"* %this, %"class.boost::exception_detail::clone_impl.48"** %this.addr, align 4
  store %"class.boost::exception_detail::clone_impl.48"* %x, %"class.boost::exception_detail::clone_impl.48"** %x.addr, align 4
  %this1 = load %"class.boost::exception_detail::clone_impl.48"** %this.addr
  %1 = bitcast %"class.boost::exception_detail::clone_impl.48"* %this1 to i8*
  %2 = getelementptr inbounds i8* %1, i64 28
  %3 = bitcast i8* %2 to %"class.boost::exception_detail::clone_base"*
  call void @_ZN5boost16exception_detail10clone_baseC2Ev(%"class.boost::exception_detail::clone_base"* %3) nounwind
  %4 = bitcast %"class.boost::exception_detail::clone_impl.48"* %this1 to %"struct.boost::exception_detail::error_info_injector.49"*
  %5 = load %"class.boost::exception_detail::clone_impl.48"** %x.addr, align 4
  %6 = bitcast %"class.boost::exception_detail::clone_impl.48"* %5 to %"struct.boost::exception_detail::error_info_injector.49"*
  invoke void @_ZN5boost16exception_detail19error_info_injectorINS_9gregorian9bad_monthEEC2ERKS4_(%"struct.boost::exception_detail::error_info_injector.49"* %4, %"struct.boost::exception_detail::error_info_injector.49"* %6)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %entry
  %7 = bitcast %"class.boost::exception_detail::clone_impl.48"* %this1 to i8***
  store i8** getelementptr inbounds ([21 x i8*]* @_ZTVN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian9bad_monthEEEEE, i64 0, i64 3), i8*** %7
  %8 = bitcast %"class.boost::exception_detail::clone_impl.48"* %this1 to i8*
  %add.ptr = getelementptr inbounds i8* %8, i32 8
  %9 = bitcast i8* %add.ptr to i8***
  store i8** getelementptr inbounds ([21 x i8*]* @_ZTVN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian9bad_monthEEEEE, i64 0, i64 10), i8*** %9
  %10 = bitcast %"class.boost::exception_detail::clone_impl.48"* %this1 to i8*
  %add.ptr2 = getelementptr inbounds i8* %10, i32 28
  %11 = bitcast i8* %add.ptr2 to i8***
  store i8** getelementptr inbounds ([21 x i8*]* @_ZTVN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian9bad_monthEEEEE, i64 0, i64 17), i8*** %11
  %12 = bitcast %"class.boost::exception_detail::clone_impl.48"* %this1 to i8*
  %add.ptr3 = getelementptr inbounds i8* %12, i32 8
  %13 = bitcast i8* %add.ptr3 to %"class.boost::exception"*
  %14 = load %"class.boost::exception_detail::clone_impl.48"** %x.addr, align 4
  %15 = icmp eq %"class.boost::exception_detail::clone_impl.48"* %14, null
  br i1 %15, label %cast.end, label %cast.notnull

cast.notnull:                                     ; preds = %invoke.cont
  %16 = bitcast %"class.boost::exception_detail::clone_impl.48"* %14 to i8*
  %add.ptr4 = getelementptr inbounds i8* %16, i32 8
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
  %24 = bitcast %"class.boost::exception_detail::clone_impl.48"* %this1 to %"struct.boost::exception_detail::error_info_injector.49"*
  call void @_ZN5boost16exception_detail19error_info_injectorINS_9gregorian9bad_monthEED2Ev(%"struct.boost::exception_detail::error_info_injector.49"* %24) nounwind
  br label %ehcleanup

ehcleanup:                                        ; preds = %lpad5, %lpad
  %25 = bitcast %"class.boost::exception_detail::clone_impl.48"* %this1 to i8*
  %26 = getelementptr inbounds i8* %25, i64 28
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

define linkonce_odr void @_ZN5boost16exception_detail19error_info_injectorINS_9gregorian9bad_monthEEC1ERKS3_(%"struct.boost::exception_detail::error_info_injector.49"* %this, %"struct.boost::gregorian::bad_month"* %x) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"struct.boost::exception_detail::error_info_injector.49"*, align 4
  %x.addr = alloca %"struct.boost::gregorian::bad_month"*, align 4
  store %"struct.boost::exception_detail::error_info_injector.49"* %this, %"struct.boost::exception_detail::error_info_injector.49"** %this.addr, align 4
  store %"struct.boost::gregorian::bad_month"* %x, %"struct.boost::gregorian::bad_month"** %x.addr, align 4
  %this1 = load %"struct.boost::exception_detail::error_info_injector.49"** %this.addr
  %0 = load %"struct.boost::gregorian::bad_month"** %x.addr
  call void @_ZN5boost16exception_detail19error_info_injectorINS_9gregorian9bad_monthEEC2ERKS3_(%"struct.boost::exception_detail::error_info_injector.49"* %this1, %"struct.boost::gregorian::bad_month"* %0)
  ret void
}

define linkonce_odr void @_ZN5boost16exception_detail19error_info_injectorINS_9gregorian9bad_monthEEC2ERKS3_(%"struct.boost::exception_detail::error_info_injector.49"* %this, %"struct.boost::gregorian::bad_month"* %x) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"struct.boost::exception_detail::error_info_injector.49"*, align 4
  %x.addr = alloca %"struct.boost::gregorian::bad_month"*, align 4
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  store %"struct.boost::exception_detail::error_info_injector.49"* %this, %"struct.boost::exception_detail::error_info_injector.49"** %this.addr, align 4
  store %"struct.boost::gregorian::bad_month"* %x, %"struct.boost::gregorian::bad_month"** %x.addr, align 4
  %this1 = load %"struct.boost::exception_detail::error_info_injector.49"** %this.addr
  %0 = bitcast %"struct.boost::exception_detail::error_info_injector.49"* %this1 to %"struct.boost::gregorian::bad_month"*
  %1 = load %"struct.boost::gregorian::bad_month"** %x.addr, align 4
  call void @_ZN5boost9gregorian9bad_monthC2ERKS1_(%"struct.boost::gregorian::bad_month"* %0, %"struct.boost::gregorian::bad_month"* %1)
  %2 = bitcast %"struct.boost::exception_detail::error_info_injector.49"* %this1 to i8*
  %3 = getelementptr inbounds i8* %2, i64 8
  %4 = bitcast i8* %3 to %"class.boost::exception"*
  invoke void @_ZN5boost9exceptionC2Ev(%"class.boost::exception"* %4)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %entry
  %5 = bitcast %"struct.boost::exception_detail::error_info_injector.49"* %this1 to i8***
  store i8** getelementptr inbounds ([9 x i8*]* @_ZTVN5boost16exception_detail19error_info_injectorINS_9gregorian9bad_monthEEE, i64 0, i64 2), i8*** %5
  %6 = bitcast %"struct.boost::exception_detail::error_info_injector.49"* %this1 to i8*
  %add.ptr = getelementptr inbounds i8* %6, i32 8
  %7 = bitcast i8* %add.ptr to i8***
  store i8** getelementptr inbounds ([9 x i8*]* @_ZTVN5boost16exception_detail19error_info_injectorINS_9gregorian9bad_monthEEE, i64 0, i64 7), i8*** %7
  ret void

lpad:                                             ; preds = %entry
  %8 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %9 = extractvalue { i8*, i32 } %8, 0
  store i8* %9, i8** %exn.slot
  %10 = extractvalue { i8*, i32 } %8, 1
  store i32 %10, i32* %ehselector.slot
  %11 = bitcast %"struct.boost::exception_detail::error_info_injector.49"* %this1 to %"struct.boost::gregorian::bad_month"*
  call void @_ZN5boost9gregorian9bad_monthD2Ev(%"struct.boost::gregorian::bad_month"* %11) nounwind
  br label %eh.resume

eh.resume:                                        ; preds = %lpad
  %exn = load i8** %exn.slot
  %sel = load i32* %ehselector.slot
  %lpad.val = insertvalue { i8*, i32 } undef, i8* %exn, 0
  %lpad.val2 = insertvalue { i8*, i32 } %lpad.val, i32 %sel, 1
  resume { i8*, i32 } %lpad.val2
}

define linkonce_odr void @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian9bad_monthEEEEC1ERKS5_(%"class.boost::exception_detail::clone_impl.48"* %this, %"struct.boost::exception_detail::error_info_injector.49"* %x) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::exception_detail::clone_impl.48"*, align 4
  %x.addr = alloca %"struct.boost::exception_detail::error_info_injector.49"*, align 4
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  store %"class.boost::exception_detail::clone_impl.48"* %this, %"class.boost::exception_detail::clone_impl.48"** %this.addr, align 4
  store %"struct.boost::exception_detail::error_info_injector.49"* %x, %"struct.boost::exception_detail::error_info_injector.49"** %x.addr, align 4
  %this1 = load %"class.boost::exception_detail::clone_impl.48"** %this.addr
  %0 = bitcast %"class.boost::exception_detail::clone_impl.48"* %this1 to i8*
  %1 = getelementptr inbounds i8* %0, i64 28
  %2 = bitcast i8* %1 to %"class.boost::exception_detail::clone_base"*
  call void @_ZN5boost16exception_detail10clone_baseC2Ev(%"class.boost::exception_detail::clone_base"* %2) nounwind
  %3 = bitcast %"class.boost::exception_detail::clone_impl.48"* %this1 to %"struct.boost::exception_detail::error_info_injector.49"*
  %4 = load %"struct.boost::exception_detail::error_info_injector.49"** %x.addr, align 4
  invoke void @_ZN5boost16exception_detail19error_info_injectorINS_9gregorian9bad_monthEEC2ERKS4_(%"struct.boost::exception_detail::error_info_injector.49"* %3, %"struct.boost::exception_detail::error_info_injector.49"* %4)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %entry
  %5 = bitcast %"class.boost::exception_detail::clone_impl.48"* %this1 to i8***
  store i8** getelementptr inbounds ([21 x i8*]* @_ZTVN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian9bad_monthEEEEE, i64 0, i64 3), i8*** %5
  %6 = bitcast %"class.boost::exception_detail::clone_impl.48"* %this1 to i8*
  %add.ptr = getelementptr inbounds i8* %6, i32 8
  %7 = bitcast i8* %add.ptr to i8***
  store i8** getelementptr inbounds ([21 x i8*]* @_ZTVN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian9bad_monthEEEEE, i64 0, i64 10), i8*** %7
  %8 = bitcast %"class.boost::exception_detail::clone_impl.48"* %this1 to i8*
  %add.ptr2 = getelementptr inbounds i8* %8, i32 28
  %9 = bitcast i8* %add.ptr2 to i8***
  store i8** getelementptr inbounds ([21 x i8*]* @_ZTVN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian9bad_monthEEEEE, i64 0, i64 17), i8*** %9
  %10 = bitcast %"class.boost::exception_detail::clone_impl.48"* %this1 to i8*
  %add.ptr3 = getelementptr inbounds i8* %10, i32 8
  %11 = bitcast i8* %add.ptr3 to %"class.boost::exception"*
  %12 = load %"struct.boost::exception_detail::error_info_injector.49"** %x.addr, align 4
  %13 = icmp eq %"struct.boost::exception_detail::error_info_injector.49"* %12, null
  br i1 %13, label %cast.end, label %cast.notnull

cast.notnull:                                     ; preds = %invoke.cont
  %14 = bitcast %"struct.boost::exception_detail::error_info_injector.49"* %12 to i8*
  %add.ptr4 = getelementptr inbounds i8* %14, i32 8
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
  %22 = bitcast %"class.boost::exception_detail::clone_impl.48"* %this1 to %"struct.boost::exception_detail::error_info_injector.49"*
  call void @_ZN5boost16exception_detail19error_info_injectorINS_9gregorian9bad_monthEED2Ev(%"struct.boost::exception_detail::error_info_injector.49"* %22) nounwind
  br label %ehcleanup

ehcleanup:                                        ; preds = %lpad5, %lpad
  %23 = bitcast %"class.boost::exception_detail::clone_impl.48"* %this1 to i8*
  %24 = getelementptr inbounds i8* %23, i64 28
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

define linkonce_odr zeroext i16 @_ZN5boost2CV23simple_exception_policyItLt1ELt12ENS_9gregorian9bad_monthEE3minEv() nounwind align 2 {
entry:
  ret i16 1
}

define linkonce_odr void @_ZN5boost9gregorian9greg_yearC2Et(%"class.boost::gregorian::greg_year"* %this, i16 zeroext %year) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::gregorian::greg_year"*, align 4
  %year.addr = alloca i16, align 2
  store %"class.boost::gregorian::greg_year"* %this, %"class.boost::gregorian::greg_year"** %this.addr, align 4
  store i16 %year, i16* %year.addr, align 2
  %this1 = load %"class.boost::gregorian::greg_year"** %this.addr
  %0 = bitcast %"class.boost::gregorian::greg_year"* %this1 to %"class.boost::CV::constrained_value"*
  %1 = load i16* %year.addr, align 2
  call void @_ZN5boost2CV17constrained_valueINS0_23simple_exception_policyItLt1400ELt10000ENS_9gregorian8bad_yearEEEEC2Et(%"class.boost::CV::constrained_value"* %0, i16 zeroext %1)
  ret void
}

define linkonce_odr void @_ZN5boost2CV17constrained_valueINS0_23simple_exception_policyItLt1400ELt10000ENS_9gregorian8bad_yearEEEEC2Et(%"class.boost::CV::constrained_value"* %this, i16 zeroext %value) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::CV::constrained_value"*, align 4
  %value.addr = alloca i16, align 2
  store %"class.boost::CV::constrained_value"* %this, %"class.boost::CV::constrained_value"** %this.addr, align 4
  store i16 %value, i16* %value.addr, align 2
  %this1 = load %"class.boost::CV::constrained_value"** %this.addr
  %value_ = getelementptr inbounds %"class.boost::CV::constrained_value"* %this1, i32 0, i32 0
  %call = call zeroext i16 @_ZN5boost2CV17constrained_valueINS0_23simple_exception_policyItLt1400ELt10000ENS_9gregorian8bad_yearEEEE3minEv()
  store i16 %call, i16* %value_, align 2
  %0 = load i16* %value.addr, align 2
  call void @_ZN5boost2CV17constrained_valueINS0_23simple_exception_policyItLt1400ELt10000ENS_9gregorian8bad_yearEEEE6assignEt(%"class.boost::CV::constrained_value"* %this1, i16 zeroext %0)
  ret void
}

define linkonce_odr zeroext i16 @_ZN5boost2CV17constrained_valueINS0_23simple_exception_policyItLt1400ELt10000ENS_9gregorian8bad_yearEEEE3minEv() align 2 {
entry:
  %call = call zeroext i16 @_ZN5boost2CV23simple_exception_policyItLt1400ELt10000ENS_9gregorian8bad_yearEE3minEv()
  ret i16 %call
}

define linkonce_odr void @_ZN5boost2CV17constrained_valueINS0_23simple_exception_policyItLt1400ELt10000ENS_9gregorian8bad_yearEEEE6assignEt(%"class.boost::CV::constrained_value"* %this, i16 zeroext %value) align 2 {
entry:
  %this.addr = alloca %"class.boost::CV::constrained_value"*, align 4
  %value.addr = alloca i16, align 2
  store %"class.boost::CV::constrained_value"* %this, %"class.boost::CV::constrained_value"** %this.addr, align 4
  store i16 %value, i16* %value.addr, align 2
  %this1 = load %"class.boost::CV::constrained_value"** %this.addr
  %0 = load i16* %value.addr, align 2
  %conv = zext i16 %0 to i32
  %add = add nsw i32 %conv, 1
  %call = call zeroext i16 @_ZN5boost2CV17constrained_valueINS0_23simple_exception_policyItLt1400ELt10000ENS_9gregorian8bad_yearEEEE3minEv()
  %conv2 = zext i16 %call to i32
  %add3 = add nsw i32 %conv2, 1
  %cmp = icmp slt i32 %add, %add3
  br i1 %cmp, label %if.then, label %if.end

if.then:                                          ; preds = %entry
  %value_ = getelementptr inbounds %"class.boost::CV::constrained_value"* %this1, i32 0, i32 0
  %1 = load i16* %value_, align 2
  %2 = load i16* %value.addr, align 2
  call void @_ZN5boost2CV23simple_exception_policyItLt1400ELt10000ENS_9gregorian8bad_yearEE8on_errorEttNS0_14violation_enumE(i16 zeroext %1, i16 zeroext %2, i32 0)
  br label %return

if.end:                                           ; preds = %entry
  %3 = load i16* %value.addr, align 2
  %conv4 = zext i16 %3 to i32
  %call5 = call zeroext i16 @_ZN5boost2CV17constrained_valueINS0_23simple_exception_policyItLt1400ELt10000ENS_9gregorian8bad_yearEEEE3maxEv()
  %conv6 = zext i16 %call5 to i32
  %cmp7 = icmp sgt i32 %conv4, %conv6
  br i1 %cmp7, label %if.then8, label %if.end10

if.then8:                                         ; preds = %if.end
  %value_9 = getelementptr inbounds %"class.boost::CV::constrained_value"* %this1, i32 0, i32 0
  %4 = load i16* %value_9, align 2
  %5 = load i16* %value.addr, align 2
  call void @_ZN5boost2CV23simple_exception_policyItLt1400ELt10000ENS_9gregorian8bad_yearEE8on_errorEttNS0_14violation_enumE(i16 zeroext %4, i16 zeroext %5, i32 1)
  br label %return

if.end10:                                         ; preds = %if.end
  %6 = load i16* %value.addr, align 2
  %value_11 = getelementptr inbounds %"class.boost::CV::constrained_value"* %this1, i32 0, i32 0
  store i16 %6, i16* %value_11, align 2
  br label %return

return:                                           ; preds = %if.end10, %if.then8, %if.then
  ret void
}

define linkonce_odr void @_ZN5boost2CV23simple_exception_policyItLt1400ELt10000ENS_9gregorian8bad_yearEE8on_errorEttNS0_14violation_enumE(i16 zeroext, i16 zeroext, i32) align 2 {
entry:
  %.addr = alloca i16, align 2
  %.addr1 = alloca i16, align 2
  %.addr2 = alloca i32, align 4
  %ref.tmp = alloca %"struct.boost::gregorian::bad_year", align 4
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  store i16 %0, i16* %.addr, align 2
  store i16 %1, i16* %.addr1, align 2
  store i32 %2, i32* %.addr2, align 4
  call void @_ZN5boost9gregorian8bad_yearC1Ev(%"struct.boost::gregorian::bad_year"* %ref.tmp)
  invoke void @_ZN5boost15throw_exceptionINS_9gregorian8bad_yearEEEvRKT_(%"struct.boost::gregorian::bad_year"* %ref.tmp) noreturn
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %entry
  unreachable

lpad:                                             ; preds = %entry
  %3 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %4 = extractvalue { i8*, i32 } %3, 0
  store i8* %4, i8** %exn.slot
  %5 = extractvalue { i8*, i32 } %3, 1
  store i32 %5, i32* %ehselector.slot
  call void @_ZN5boost9gregorian8bad_yearD1Ev(%"struct.boost::gregorian::bad_year"* %ref.tmp) nounwind
  br label %eh.resume

return:                                           ; No predecessors!
  ret void

eh.resume:                                        ; preds = %lpad
  %exn = load i8** %exn.slot
  %sel = load i32* %ehselector.slot
  %lpad.val = insertvalue { i8*, i32 } undef, i8* %exn, 0
  %lpad.val3 = insertvalue { i8*, i32 } %lpad.val, i32 %sel, 1
  resume { i8*, i32 } %lpad.val3
}

define linkonce_odr zeroext i16 @_ZN5boost2CV17constrained_valueINS0_23simple_exception_policyItLt1400ELt10000ENS_9gregorian8bad_yearEEEE3maxEv() align 2 {
entry:
  %call = call zeroext i16 @_ZN5boost2CV23simple_exception_policyItLt1400ELt10000ENS_9gregorian8bad_yearEE3maxEv()
  ret i16 %call
}

define linkonce_odr zeroext i16 @_ZN5boost2CV23simple_exception_policyItLt1400ELt10000ENS_9gregorian8bad_yearEE3maxEv() nounwind align 2 {
entry:
  ret i16 10000
}

define linkonce_odr void @_ZN5boost15throw_exceptionINS_9gregorian8bad_yearEEEvRKT_(%"struct.boost::gregorian::bad_year"* %e) noreturn inlinehint {
entry:
  %e.addr = alloca %"struct.boost::gregorian::bad_year"*, align 4
  %ref.tmp = alloca %"struct.boost::exception_detail::error_info_injector.52", align 4
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  %cleanup.isactive = alloca i1
  store %"struct.boost::gregorian::bad_year"* %e, %"struct.boost::gregorian::bad_year"** %e.addr, align 4
  %0 = load %"struct.boost::gregorian::bad_year"** %e.addr, align 4
  %1 = bitcast %"struct.boost::gregorian::bad_year"* %0 to %"class.std::exception"*
  call void @_ZN5boost36throw_exception_assert_compatibilityERKSt9exception(%"class.std::exception"* %1)
  %exception = call i8* @__cxa_allocate_exception(i32 32) nounwind
  store i1 true, i1* %cleanup.isactive
  %2 = bitcast i8* %exception to %"class.boost::exception_detail::clone_impl.51"*
  %3 = load %"struct.boost::gregorian::bad_year"** %e.addr, align 4
  invoke void @_ZN5boost17enable_error_infoINS_9gregorian8bad_yearEEENS_16exception_detail29enable_error_info_return_typeIT_E4typeERKS5_(%"struct.boost::exception_detail::error_info_injector.52"* sret %ref.tmp, %"struct.boost::gregorian::bad_year"* %3)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %entry
  invoke void @_ZN5boost24enable_current_exceptionINS_16exception_detail19error_info_injectorINS_9gregorian8bad_yearEEEEENS1_10clone_implIT_EERKS7_(%"class.boost::exception_detail::clone_impl.51"* sret %2, %"struct.boost::exception_detail::error_info_injector.52"* %ref.tmp)
          to label %invoke.cont2 unwind label %lpad1

invoke.cont2:                                     ; preds = %invoke.cont
  store i1 false, i1* %cleanup.isactive
  invoke void @__cxa_throw(i8* %exception, i8* bitcast ({ i8*, i8*, i32, i32, i8*, i32, i8*, i32 }* @_ZTIN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian8bad_yearEEEEE to i8*), i8* bitcast (void (%"class.boost::exception_detail::clone_impl.51"*)* @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian8bad_yearEEEED1Ev to i8*)) noreturn
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
  call void @_ZN5boost16exception_detail19error_info_injectorINS_9gregorian8bad_yearEED1Ev(%"struct.boost::exception_detail::error_info_injector.52"* %ref.tmp) nounwind
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

define linkonce_odr void @_ZN5boost9gregorian8bad_yearC1Ev(%"struct.boost::gregorian::bad_year"* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"struct.boost::gregorian::bad_year"*, align 4
  store %"struct.boost::gregorian::bad_year"* %this, %"struct.boost::gregorian::bad_year"** %this.addr, align 4
  %this1 = load %"struct.boost::gregorian::bad_year"** %this.addr
  call void @_ZN5boost9gregorian8bad_yearC2Ev(%"struct.boost::gregorian::bad_year"* %this1)
  ret void
}

define linkonce_odr void @_ZN5boost9gregorian8bad_yearD1Ev(%"struct.boost::gregorian::bad_year"* %this) unnamed_addr nounwind inlinehint align 2 {
entry:
  %this.addr = alloca %"struct.boost::gregorian::bad_year"*, align 4
  store %"struct.boost::gregorian::bad_year"* %this, %"struct.boost::gregorian::bad_year"** %this.addr, align 4
  %this1 = load %"struct.boost::gregorian::bad_year"** %this.addr
  call void @_ZN5boost9gregorian8bad_yearD2Ev(%"struct.boost::gregorian::bad_year"* %this1) nounwind
  ret void
}

define linkonce_odr void @_ZN5boost9gregorian8bad_yearD2Ev(%"struct.boost::gregorian::bad_year"* %this) unnamed_addr nounwind inlinehint align 2 {
entry:
  %this.addr = alloca %"struct.boost::gregorian::bad_year"*, align 4
  store %"struct.boost::gregorian::bad_year"* %this, %"struct.boost::gregorian::bad_year"** %this.addr, align 4
  %this1 = load %"struct.boost::gregorian::bad_year"** %this.addr
  %0 = bitcast %"struct.boost::gregorian::bad_year"* %this1 to %"class.std::out_of_range"*
  call void @_ZNSt12out_of_rangeD2Ev(%"class.std::out_of_range"* %0) nounwind
  ret void
}

define linkonce_odr void @_ZN5boost9gregorian8bad_yearC2Ev(%"struct.boost::gregorian::bad_year"* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"struct.boost::gregorian::bad_year"*, align 4
  %ref.tmp = alloca %"class.std::basic_string", align 4
  %ref.tmp2 = alloca %"class.std::allocator", align 1
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  store %"struct.boost::gregorian::bad_year"* %this, %"struct.boost::gregorian::bad_year"** %this.addr, align 4
  %this1 = load %"struct.boost::gregorian::bad_year"** %this.addr
  %0 = bitcast %"struct.boost::gregorian::bad_year"* %this1 to %"class.std::out_of_range"*
  call void @_ZNSaIcEC1Ev(%"class.std::allocator"* %ref.tmp2) nounwind
  invoke void @_ZNSsC1EPKcRKSaIcE(%"class.std::basic_string"* %ref.tmp, i8* getelementptr inbounds ([40 x i8]* @.str41, i32 0, i32 0), %"class.std::allocator"* %ref.tmp2)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %entry
  invoke void @_ZNSt12out_of_rangeC2ERKSs(%"class.std::out_of_range"* %0, %"class.std::basic_string"* %ref.tmp)
          to label %invoke.cont4 unwind label %lpad3

invoke.cont4:                                     ; preds = %invoke.cont
  invoke void @_ZNSsD1Ev(%"class.std::basic_string"* %ref.tmp)
          to label %invoke.cont5 unwind label %lpad

invoke.cont5:                                     ; preds = %invoke.cont4
  call void @_ZNSaIcED1Ev(%"class.std::allocator"* %ref.tmp2) nounwind
  %1 = bitcast %"struct.boost::gregorian::bad_year"* %this1 to i8***
  store i8** getelementptr inbounds ([5 x i8*]* @_ZTVN5boost9gregorian8bad_yearE, i64 0, i64 2), i8*** %1
  ret void

lpad:                                             ; preds = %invoke.cont4, %entry
  %2 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %3 = extractvalue { i8*, i32 } %2, 0
  store i8* %3, i8** %exn.slot
  %4 = extractvalue { i8*, i32 } %2, 1
  store i32 %4, i32* %ehselector.slot
  br label %ehcleanup

lpad3:                                            ; preds = %invoke.cont
  %5 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %6 = extractvalue { i8*, i32 } %5, 0
  store i8* %6, i8** %exn.slot
  %7 = extractvalue { i8*, i32 } %5, 1
  store i32 %7, i32* %ehselector.slot
  invoke void @_ZNSsD1Ev(%"class.std::basic_string"* %ref.tmp)
          to label %invoke.cont6 unwind label %terminate.lpad

invoke.cont6:                                     ; preds = %lpad3
  br label %ehcleanup

ehcleanup:                                        ; preds = %invoke.cont6, %lpad
  call void @_ZNSaIcED1Ev(%"class.std::allocator"* %ref.tmp2) nounwind
  br label %eh.resume

eh.resume:                                        ; preds = %ehcleanup
  %exn = load i8** %exn.slot
  %sel = load i32* %ehselector.slot
  %lpad.val = insertvalue { i8*, i32 } undef, i8* %exn, 0
  %lpad.val7 = insertvalue { i8*, i32 } %lpad.val, i32 %sel, 1
  resume { i8*, i32 } %lpad.val7

terminate.lpad:                                   ; preds = %lpad3
  %8 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          catch i8* null
  call void @_ZSt9terminatev() noreturn nounwind
  unreachable
}

define linkonce_odr void @_ZN5boost9gregorian8bad_yearD0Ev(%"struct.boost::gregorian::bad_year"* %this) unnamed_addr nounwind inlinehint align 2 {
entry:
  %this.addr = alloca %"struct.boost::gregorian::bad_year"*, align 4
  store %"struct.boost::gregorian::bad_year"* %this, %"struct.boost::gregorian::bad_year"** %this.addr, align 4
  %this1 = load %"struct.boost::gregorian::bad_year"** %this.addr
  call void @_ZN5boost9gregorian8bad_yearD1Ev(%"struct.boost::gregorian::bad_year"* %this1) nounwind
  %0 = bitcast %"struct.boost::gregorian::bad_year"* %this1 to i8*
  call void @_ZdlPv(i8* %0) nounwind
  ret void
}

define linkonce_odr void @_ZN5boost24enable_current_exceptionINS_16exception_detail19error_info_injectorINS_9gregorian8bad_yearEEEEENS1_10clone_implIT_EERKS7_(%"class.boost::exception_detail::clone_impl.51"* noalias sret %agg.result, %"struct.boost::exception_detail::error_info_injector.52"* %x) inlinehint {
entry:
  %x.addr = alloca %"struct.boost::exception_detail::error_info_injector.52"*, align 4
  store %"struct.boost::exception_detail::error_info_injector.52"* %x, %"struct.boost::exception_detail::error_info_injector.52"** %x.addr, align 4
  %0 = load %"struct.boost::exception_detail::error_info_injector.52"** %x.addr, align 4
  call void @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian8bad_yearEEEEC1ERKS5_(%"class.boost::exception_detail::clone_impl.51"* %agg.result, %"struct.boost::exception_detail::error_info_injector.52"* %0)
  ret void
}

define linkonce_odr void @_ZN5boost17enable_error_infoINS_9gregorian8bad_yearEEENS_16exception_detail29enable_error_info_return_typeIT_E4typeERKS5_(%"struct.boost::exception_detail::error_info_injector.52"* noalias sret %agg.result, %"struct.boost::gregorian::bad_year"* %x) inlinehint {
entry:
  %x.addr = alloca %"struct.boost::gregorian::bad_year"*, align 4
  store %"struct.boost::gregorian::bad_year"* %x, %"struct.boost::gregorian::bad_year"** %x.addr, align 4
  %0 = load %"struct.boost::gregorian::bad_year"** %x.addr, align 4
  call void @_ZN5boost16exception_detail19error_info_injectorINS_9gregorian8bad_yearEEC1ERKS3_(%"struct.boost::exception_detail::error_info_injector.52"* %agg.result, %"struct.boost::gregorian::bad_year"* %0)
  ret void
}

define linkonce_odr void @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian8bad_yearEEEED1Ev(%"class.boost::exception_detail::clone_impl.51"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::exception_detail::clone_impl.51"*, align 4
  store %"class.boost::exception_detail::clone_impl.51"* %this, %"class.boost::exception_detail::clone_impl.51"** %this.addr, align 4
  %this1 = load %"class.boost::exception_detail::clone_impl.51"** %this.addr
  call void @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian8bad_yearEEEED2Ev(%"class.boost::exception_detail::clone_impl.51"* %this1, i8** getelementptr inbounds ([2 x i8*]* @_ZTTN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian8bad_yearEEEEE, i64 0, i64 0)) nounwind
  %0 = bitcast %"class.boost::exception_detail::clone_impl.51"* %this1 to i8*
  %1 = getelementptr inbounds i8* %0, i64 28
  %2 = bitcast i8* %1 to %"class.boost::exception_detail::clone_base"*
  call void @_ZN5boost16exception_detail10clone_baseD2Ev(%"class.boost::exception_detail::clone_base"* %2) nounwind
  ret void
}

define linkonce_odr void @_ZN5boost16exception_detail19error_info_injectorINS_9gregorian8bad_yearEED1Ev(%"struct.boost::exception_detail::error_info_injector.52"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"struct.boost::exception_detail::error_info_injector.52"*, align 4
  store %"struct.boost::exception_detail::error_info_injector.52"* %this, %"struct.boost::exception_detail::error_info_injector.52"** %this.addr, align 4
  %this1 = load %"struct.boost::exception_detail::error_info_injector.52"** %this.addr
  call void @_ZN5boost16exception_detail19error_info_injectorINS_9gregorian8bad_yearEED2Ev(%"struct.boost::exception_detail::error_info_injector.52"* %this1) nounwind
  ret void
}

define linkonce_odr void @_ZN5boost16exception_detail19error_info_injectorINS_9gregorian8bad_yearEED2Ev(%"struct.boost::exception_detail::error_info_injector.52"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"struct.boost::exception_detail::error_info_injector.52"*, align 4
  store %"struct.boost::exception_detail::error_info_injector.52"* %this, %"struct.boost::exception_detail::error_info_injector.52"** %this.addr, align 4
  %this1 = load %"struct.boost::exception_detail::error_info_injector.52"** %this.addr
  %0 = bitcast %"struct.boost::exception_detail::error_info_injector.52"* %this1 to i8*
  %1 = getelementptr inbounds i8* %0, i64 8
  %2 = bitcast i8* %1 to %"class.boost::exception"*
  call void @_ZN5boost9exceptionD2Ev(%"class.boost::exception"* %2) nounwind
  %3 = bitcast %"struct.boost::exception_detail::error_info_injector.52"* %this1 to %"struct.boost::gregorian::bad_year"*
  call void @_ZN5boost9gregorian8bad_yearD2Ev(%"struct.boost::gregorian::bad_year"* %3) nounwind
  ret void
}

define linkonce_odr void @_ZThn8_N5boost16exception_detail19error_info_injectorINS_9gregorian8bad_yearEED1Ev(%"struct.boost::exception_detail::error_info_injector.52"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"struct.boost::exception_detail::error_info_injector.52"*, align 4
  store %"struct.boost::exception_detail::error_info_injector.52"* %this, %"struct.boost::exception_detail::error_info_injector.52"** %this.addr, align 4
  %this1 = load %"struct.boost::exception_detail::error_info_injector.52"** %this.addr
  %0 = bitcast %"struct.boost::exception_detail::error_info_injector.52"* %this1 to i8*
  %1 = getelementptr inbounds i8* %0, i64 -8
  %2 = bitcast i8* %1 to %"struct.boost::exception_detail::error_info_injector.52"*
  call void @_ZN5boost16exception_detail19error_info_injectorINS_9gregorian8bad_yearEED1Ev(%"struct.boost::exception_detail::error_info_injector.52"* %2) nounwind
  ret void
}

define linkonce_odr void @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian8bad_yearEEEED2Ev(%"class.boost::exception_detail::clone_impl.51"* %this, i8** %vtt) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::exception_detail::clone_impl.51"*, align 4
  %vtt.addr = alloca i8**, align 4
  store %"class.boost::exception_detail::clone_impl.51"* %this, %"class.boost::exception_detail::clone_impl.51"** %this.addr, align 4
  store i8** %vtt, i8*** %vtt.addr, align 4
  %this1 = load %"class.boost::exception_detail::clone_impl.51"** %this.addr
  %vtt2 = load i8*** %vtt.addr
  %0 = bitcast %"class.boost::exception_detail::clone_impl.51"* %this1 to %"struct.boost::exception_detail::error_info_injector.52"*
  call void @_ZN5boost16exception_detail19error_info_injectorINS_9gregorian8bad_yearEED2Ev(%"struct.boost::exception_detail::error_info_injector.52"* %0) nounwind
  ret void
}

define linkonce_odr void @_ZThn8_N5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian8bad_yearEEEED1Ev(%"class.boost::exception_detail::clone_impl.51"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::exception_detail::clone_impl.51"*, align 4
  store %"class.boost::exception_detail::clone_impl.51"* %this, %"class.boost::exception_detail::clone_impl.51"** %this.addr, align 4
  %this1 = load %"class.boost::exception_detail::clone_impl.51"** %this.addr
  %0 = bitcast %"class.boost::exception_detail::clone_impl.51"* %this1 to i8*
  %1 = getelementptr inbounds i8* %0, i64 -8
  %2 = bitcast i8* %1 to %"class.boost::exception_detail::clone_impl.51"*
  call void @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian8bad_yearEEEED1Ev(%"class.boost::exception_detail::clone_impl.51"* %2) nounwind
  ret void
}

define linkonce_odr void @_ZTv0_n20_N5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian8bad_yearEEEED1Ev(%"class.boost::exception_detail::clone_impl.51"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::exception_detail::clone_impl.51"*, align 4
  store %"class.boost::exception_detail::clone_impl.51"* %this, %"class.boost::exception_detail::clone_impl.51"** %this.addr, align 4
  %this1 = load %"class.boost::exception_detail::clone_impl.51"** %this.addr
  %0 = bitcast %"class.boost::exception_detail::clone_impl.51"* %this1 to i8*
  %1 = bitcast i8* %0 to i8**
  %2 = load i8** %1
  %3 = getelementptr inbounds i8* %2, i64 -20
  %4 = bitcast i8* %3 to i32*
  %5 = load i32* %4
  %6 = getelementptr inbounds i8* %0, i32 %5
  %7 = bitcast i8* %6 to %"class.boost::exception_detail::clone_impl.51"*
  call void @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian8bad_yearEEEED1Ev(%"class.boost::exception_detail::clone_impl.51"* %7) nounwind
  ret void
}

define linkonce_odr void @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian8bad_yearEEEED0Ev(%"class.boost::exception_detail::clone_impl.51"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::exception_detail::clone_impl.51"*, align 4
  store %"class.boost::exception_detail::clone_impl.51"* %this, %"class.boost::exception_detail::clone_impl.51"** %this.addr, align 4
  %this1 = load %"class.boost::exception_detail::clone_impl.51"** %this.addr
  call void @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian8bad_yearEEEED1Ev(%"class.boost::exception_detail::clone_impl.51"* %this1) nounwind
  %0 = bitcast %"class.boost::exception_detail::clone_impl.51"* %this1 to i8*
  call void @_ZdlPv(i8* %0) nounwind
  ret void
}

define linkonce_odr %"class.boost::exception_detail::clone_base"* @_ZNK5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian8bad_yearEEEE5cloneEv(%"class.boost::exception_detail::clone_impl.51"* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::exception_detail::clone_impl.51"*, align 4
  %agg.tmp = alloca %"struct.boost::exception_detail::clone_impl<boost::exception_detail::error_info_injector<boost::gregorian::bad_year> >::clone_tag", align 1
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  store %"class.boost::exception_detail::clone_impl.51"* %this, %"class.boost::exception_detail::clone_impl.51"** %this.addr, align 4
  %this1 = load %"class.boost::exception_detail::clone_impl.51"** %this.addr
  %call = call noalias i8* @_Znwj(i32 32)
  %0 = bitcast i8* %call to %"class.boost::exception_detail::clone_impl.51"*
  invoke void @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian8bad_yearEEEEC1ERKS6_NS6_9clone_tagE(%"class.boost::exception_detail::clone_impl.51"* %0, %"class.boost::exception_detail::clone_impl.51"* %this1)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %entry
  %1 = icmp eq %"class.boost::exception_detail::clone_impl.51"* %0, null
  br i1 %1, label %cast.end, label %cast.notnull

cast.notnull:                                     ; preds = %invoke.cont
  %2 = bitcast %"class.boost::exception_detail::clone_impl.51"* %0 to i8**
  %vtable = load i8** %2
  %vbase.offset.ptr = getelementptr i8* %vtable, i64 -12
  %3 = bitcast i8* %vbase.offset.ptr to i32*
  %vbase.offset = load i32* %3
  %4 = bitcast %"class.boost::exception_detail::clone_impl.51"* %0 to i8*
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

define linkonce_odr void @_ZNK5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian8bad_yearEEEE7rethrowEv(%"class.boost::exception_detail::clone_impl.51"* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::exception_detail::clone_impl.51"*, align 4
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  store %"class.boost::exception_detail::clone_impl.51"* %this, %"class.boost::exception_detail::clone_impl.51"** %this.addr, align 4
  %this1 = load %"class.boost::exception_detail::clone_impl.51"** %this.addr
  %exception = call i8* @__cxa_allocate_exception(i32 32) nounwind
  %0 = bitcast i8* %exception to %"class.boost::exception_detail::clone_impl.51"*
  invoke void @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian8bad_yearEEEEC1ERKS6_(%"class.boost::exception_detail::clone_impl.51"* %0, %"class.boost::exception_detail::clone_impl.51"* %this1)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %entry
  call void @__cxa_throw(i8* %exception, i8* bitcast ({ i8*, i8*, i32, i32, i8*, i32, i8*, i32 }* @_ZTIN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian8bad_yearEEEEE to i8*), i8* bitcast (void (%"class.boost::exception_detail::clone_impl.51"*)* @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian8bad_yearEEEED1Ev to i8*)) noreturn
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

define linkonce_odr void @_ZThn8_N5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian8bad_yearEEEED0Ev(%"class.boost::exception_detail::clone_impl.51"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::exception_detail::clone_impl.51"*, align 4
  store %"class.boost::exception_detail::clone_impl.51"* %this, %"class.boost::exception_detail::clone_impl.51"** %this.addr, align 4
  %this1 = load %"class.boost::exception_detail::clone_impl.51"** %this.addr
  %0 = bitcast %"class.boost::exception_detail::clone_impl.51"* %this1 to i8*
  %1 = getelementptr inbounds i8* %0, i64 -8
  %2 = bitcast i8* %1 to %"class.boost::exception_detail::clone_impl.51"*
  call void @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian8bad_yearEEEED0Ev(%"class.boost::exception_detail::clone_impl.51"* %2) nounwind
  ret void
}

define linkonce_odr %"class.boost::exception_detail::clone_base"* @_ZTv0_n12_NK5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian8bad_yearEEEE5cloneEv(%"class.boost::exception_detail::clone_impl.51"* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::exception_detail::clone_impl.51"*, align 4
  store %"class.boost::exception_detail::clone_impl.51"* %this, %"class.boost::exception_detail::clone_impl.51"** %this.addr, align 4
  %this1 = load %"class.boost::exception_detail::clone_impl.51"** %this.addr
  %0 = bitcast %"class.boost::exception_detail::clone_impl.51"* %this1 to i8*
  %1 = bitcast i8* %0 to i8**
  %2 = load i8** %1
  %3 = getelementptr inbounds i8* %2, i64 -12
  %4 = bitcast i8* %3 to i32*
  %5 = load i32* %4
  %6 = getelementptr inbounds i8* %0, i32 %5
  %7 = bitcast i8* %6 to %"class.boost::exception_detail::clone_impl.51"*
  %call = call %"class.boost::exception_detail::clone_base"* @_ZNK5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian8bad_yearEEEE5cloneEv(%"class.boost::exception_detail::clone_impl.51"* %7)
  ret %"class.boost::exception_detail::clone_base"* %call
}

define linkonce_odr void @_ZTv0_n16_NK5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian8bad_yearEEEE7rethrowEv(%"class.boost::exception_detail::clone_impl.51"* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::exception_detail::clone_impl.51"*, align 4
  store %"class.boost::exception_detail::clone_impl.51"* %this, %"class.boost::exception_detail::clone_impl.51"** %this.addr, align 4
  %this1 = load %"class.boost::exception_detail::clone_impl.51"** %this.addr
  %0 = bitcast %"class.boost::exception_detail::clone_impl.51"* %this1 to i8*
  %1 = bitcast i8* %0 to i8**
  %2 = load i8** %1
  %3 = getelementptr inbounds i8* %2, i64 -16
  %4 = bitcast i8* %3 to i32*
  %5 = load i32* %4
  %6 = getelementptr inbounds i8* %0, i32 %5
  %7 = bitcast i8* %6 to %"class.boost::exception_detail::clone_impl.51"*
  call void @_ZNK5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian8bad_yearEEEE7rethrowEv(%"class.boost::exception_detail::clone_impl.51"* %7)
  ret void
}

define linkonce_odr void @_ZTv0_n20_N5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian8bad_yearEEEED0Ev(%"class.boost::exception_detail::clone_impl.51"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::exception_detail::clone_impl.51"*, align 4
  store %"class.boost::exception_detail::clone_impl.51"* %this, %"class.boost::exception_detail::clone_impl.51"** %this.addr, align 4
  %this1 = load %"class.boost::exception_detail::clone_impl.51"** %this.addr
  %0 = bitcast %"class.boost::exception_detail::clone_impl.51"* %this1 to i8*
  %1 = bitcast i8* %0 to i8**
  %2 = load i8** %1
  %3 = getelementptr inbounds i8* %2, i64 -20
  %4 = bitcast i8* %3 to i32*
  %5 = load i32* %4
  %6 = getelementptr inbounds i8* %0, i32 %5
  %7 = bitcast i8* %6 to %"class.boost::exception_detail::clone_impl.51"*
  call void @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian8bad_yearEEEED0Ev(%"class.boost::exception_detail::clone_impl.51"* %7) nounwind
  ret void
}

define linkonce_odr void @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian8bad_yearEEEEC1ERKS6_(%"class.boost::exception_detail::clone_impl.51"* %this, %"class.boost::exception_detail::clone_impl.51"*) unnamed_addr inlinehint align 2 {
entry:
  %this.addr = alloca %"class.boost::exception_detail::clone_impl.51"*, align 4
  %.addr = alloca %"class.boost::exception_detail::clone_impl.51"*, align 4
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  store %"class.boost::exception_detail::clone_impl.51"* %this, %"class.boost::exception_detail::clone_impl.51"** %this.addr, align 4
  store %"class.boost::exception_detail::clone_impl.51"* %0, %"class.boost::exception_detail::clone_impl.51"** %.addr, align 4
  %this1 = load %"class.boost::exception_detail::clone_impl.51"** %this.addr
  %1 = bitcast %"class.boost::exception_detail::clone_impl.51"* %this1 to i8*
  %2 = getelementptr inbounds i8* %1, i64 28
  %3 = bitcast i8* %2 to %"class.boost::exception_detail::clone_base"*
  %4 = load %"class.boost::exception_detail::clone_impl.51"** %.addr, align 4
  %5 = bitcast %"class.boost::exception_detail::clone_impl.51"* %4 to i8**
  %vtable = load i8** %5
  %vbase.offset.ptr = getelementptr i8* %vtable, i64 -12
  %6 = bitcast i8* %vbase.offset.ptr to i32*
  %vbase.offset = load i32* %6
  %7 = bitcast %"class.boost::exception_detail::clone_impl.51"* %4 to i8*
  %add.ptr = getelementptr inbounds i8* %7, i32 %vbase.offset
  %8 = bitcast i8* %add.ptr to %"class.boost::exception_detail::clone_base"*
  call void @_ZN5boost16exception_detail10clone_baseC2ERKS1_(%"class.boost::exception_detail::clone_base"* %3, %"class.boost::exception_detail::clone_base"* %8) nounwind
  %9 = bitcast %"class.boost::exception_detail::clone_impl.51"* %this1 to %"struct.boost::exception_detail::error_info_injector.52"*
  %10 = load %"class.boost::exception_detail::clone_impl.51"** %.addr, align 4
  %11 = bitcast %"class.boost::exception_detail::clone_impl.51"* %10 to %"struct.boost::exception_detail::error_info_injector.52"*
  invoke void @_ZN5boost16exception_detail19error_info_injectorINS_9gregorian8bad_yearEEC2ERKS4_(%"struct.boost::exception_detail::error_info_injector.52"* %9, %"struct.boost::exception_detail::error_info_injector.52"* %11)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %entry
  %12 = bitcast %"class.boost::exception_detail::clone_impl.51"* %this1 to i8***
  store i8** getelementptr inbounds ([21 x i8*]* @_ZTVN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian8bad_yearEEEEE, i64 0, i64 3), i8*** %12
  %13 = bitcast %"class.boost::exception_detail::clone_impl.51"* %this1 to i8*
  %add.ptr2 = getelementptr inbounds i8* %13, i32 8
  %14 = bitcast i8* %add.ptr2 to i8***
  store i8** getelementptr inbounds ([21 x i8*]* @_ZTVN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian8bad_yearEEEEE, i64 0, i64 10), i8*** %14
  %15 = bitcast %"class.boost::exception_detail::clone_impl.51"* %this1 to i8*
  %add.ptr3 = getelementptr inbounds i8* %15, i32 28
  %16 = bitcast i8* %add.ptr3 to i8***
  store i8** getelementptr inbounds ([21 x i8*]* @_ZTVN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian8bad_yearEEEEE, i64 0, i64 17), i8*** %16
  ret void

lpad:                                             ; preds = %entry
  %17 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %18 = extractvalue { i8*, i32 } %17, 0
  store i8* %18, i8** %exn.slot
  %19 = extractvalue { i8*, i32 } %17, 1
  store i32 %19, i32* %ehselector.slot
  %20 = bitcast %"class.boost::exception_detail::clone_impl.51"* %this1 to i8*
  %21 = getelementptr inbounds i8* %20, i64 28
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

define linkonce_odr void @_ZN5boost16exception_detail19error_info_injectorINS_9gregorian8bad_yearEEC2ERKS4_(%"struct.boost::exception_detail::error_info_injector.52"* %this, %"struct.boost::exception_detail::error_info_injector.52"*) unnamed_addr inlinehint align 2 {
entry:
  %this.addr = alloca %"struct.boost::exception_detail::error_info_injector.52"*, align 4
  %.addr = alloca %"struct.boost::exception_detail::error_info_injector.52"*, align 4
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  store %"struct.boost::exception_detail::error_info_injector.52"* %this, %"struct.boost::exception_detail::error_info_injector.52"** %this.addr, align 4
  store %"struct.boost::exception_detail::error_info_injector.52"* %0, %"struct.boost::exception_detail::error_info_injector.52"** %.addr, align 4
  %this1 = load %"struct.boost::exception_detail::error_info_injector.52"** %this.addr
  %1 = bitcast %"struct.boost::exception_detail::error_info_injector.52"* %this1 to %"struct.boost::gregorian::bad_year"*
  %2 = load %"struct.boost::exception_detail::error_info_injector.52"** %.addr, align 4
  %3 = bitcast %"struct.boost::exception_detail::error_info_injector.52"* %2 to %"struct.boost::gregorian::bad_year"*
  call void @_ZN5boost9gregorian8bad_yearC2ERKS1_(%"struct.boost::gregorian::bad_year"* %1, %"struct.boost::gregorian::bad_year"* %3)
  %4 = bitcast %"struct.boost::exception_detail::error_info_injector.52"* %this1 to i8*
  %5 = getelementptr inbounds i8* %4, i64 8
  %6 = bitcast i8* %5 to %"class.boost::exception"*
  %7 = load %"struct.boost::exception_detail::error_info_injector.52"** %.addr, align 4
  %8 = bitcast %"struct.boost::exception_detail::error_info_injector.52"* %7 to i8*
  %add.ptr = getelementptr inbounds i8* %8, i32 8
  %9 = bitcast i8* %add.ptr to %"class.boost::exception"*
  invoke void @_ZN5boost9exceptionC2ERKS0_(%"class.boost::exception"* %6, %"class.boost::exception"* %9)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %entry
  %10 = bitcast %"struct.boost::exception_detail::error_info_injector.52"* %this1 to i8***
  store i8** getelementptr inbounds ([9 x i8*]* @_ZTVN5boost16exception_detail19error_info_injectorINS_9gregorian8bad_yearEEE, i64 0, i64 2), i8*** %10
  %11 = bitcast %"struct.boost::exception_detail::error_info_injector.52"* %this1 to i8*
  %add.ptr2 = getelementptr inbounds i8* %11, i32 8
  %12 = bitcast i8* %add.ptr2 to i8***
  store i8** getelementptr inbounds ([9 x i8*]* @_ZTVN5boost16exception_detail19error_info_injectorINS_9gregorian8bad_yearEEE, i64 0, i64 7), i8*** %12
  ret void

lpad:                                             ; preds = %entry
  %13 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %14 = extractvalue { i8*, i32 } %13, 0
  store i8* %14, i8** %exn.slot
  %15 = extractvalue { i8*, i32 } %13, 1
  store i32 %15, i32* %ehselector.slot
  %16 = bitcast %"struct.boost::exception_detail::error_info_injector.52"* %this1 to %"struct.boost::gregorian::bad_year"*
  call void @_ZN5boost9gregorian8bad_yearD2Ev(%"struct.boost::gregorian::bad_year"* %16) nounwind
  br label %eh.resume

eh.resume:                                        ; preds = %lpad
  %exn = load i8** %exn.slot
  %sel = load i32* %ehselector.slot
  %lpad.val = insertvalue { i8*, i32 } undef, i8* %exn, 0
  %lpad.val3 = insertvalue { i8*, i32 } %lpad.val, i32 %sel, 1
  resume { i8*, i32 } %lpad.val3
}

define linkonce_odr void @_ZN5boost9gregorian8bad_yearC2ERKS1_(%"struct.boost::gregorian::bad_year"* %this, %"struct.boost::gregorian::bad_year"*) unnamed_addr inlinehint align 2 {
entry:
  %this.addr = alloca %"struct.boost::gregorian::bad_year"*, align 4
  %.addr = alloca %"struct.boost::gregorian::bad_year"*, align 4
  store %"struct.boost::gregorian::bad_year"* %this, %"struct.boost::gregorian::bad_year"** %this.addr, align 4
  store %"struct.boost::gregorian::bad_year"* %0, %"struct.boost::gregorian::bad_year"** %.addr, align 4
  %this1 = load %"struct.boost::gregorian::bad_year"** %this.addr
  %1 = bitcast %"struct.boost::gregorian::bad_year"* %this1 to %"class.std::out_of_range"*
  %2 = load %"struct.boost::gregorian::bad_year"** %.addr, align 4
  %3 = bitcast %"struct.boost::gregorian::bad_year"* %2 to %"class.std::out_of_range"*
  call void @_ZNSt12out_of_rangeC2ERKS_(%"class.std::out_of_range"* %1, %"class.std::out_of_range"* %3)
  %4 = bitcast %"struct.boost::gregorian::bad_year"* %this1 to i8***
  store i8** getelementptr inbounds ([5 x i8*]* @_ZTVN5boost9gregorian8bad_yearE, i64 0, i64 2), i8*** %4
  ret void
}

define linkonce_odr void @_ZN5boost16exception_detail19error_info_injectorINS_9gregorian8bad_yearEED0Ev(%"struct.boost::exception_detail::error_info_injector.52"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"struct.boost::exception_detail::error_info_injector.52"*, align 4
  store %"struct.boost::exception_detail::error_info_injector.52"* %this, %"struct.boost::exception_detail::error_info_injector.52"** %this.addr, align 4
  %this1 = load %"struct.boost::exception_detail::error_info_injector.52"** %this.addr
  call void @_ZN5boost16exception_detail19error_info_injectorINS_9gregorian8bad_yearEED1Ev(%"struct.boost::exception_detail::error_info_injector.52"* %this1) nounwind
  %0 = bitcast %"struct.boost::exception_detail::error_info_injector.52"* %this1 to i8*
  call void @_ZdlPv(i8* %0) nounwind
  ret void
}

define linkonce_odr void @_ZThn8_N5boost16exception_detail19error_info_injectorINS_9gregorian8bad_yearEED0Ev(%"struct.boost::exception_detail::error_info_injector.52"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"struct.boost::exception_detail::error_info_injector.52"*, align 4
  store %"struct.boost::exception_detail::error_info_injector.52"* %this, %"struct.boost::exception_detail::error_info_injector.52"** %this.addr, align 4
  %this1 = load %"struct.boost::exception_detail::error_info_injector.52"** %this.addr
  %0 = bitcast %"struct.boost::exception_detail::error_info_injector.52"* %this1 to i8*
  %1 = getelementptr inbounds i8* %0, i64 -8
  %2 = bitcast i8* %1 to %"struct.boost::exception_detail::error_info_injector.52"*
  call void @_ZN5boost16exception_detail19error_info_injectorINS_9gregorian8bad_yearEED0Ev(%"struct.boost::exception_detail::error_info_injector.52"* %2) nounwind
  ret void
}

define linkonce_odr void @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian8bad_yearEEEEC1ERKS6_NS6_9clone_tagE(%"class.boost::exception_detail::clone_impl.51"* %this, %"class.boost::exception_detail::clone_impl.51"* %x) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::exception_detail::clone_impl.51"*, align 4
  %x.addr = alloca %"class.boost::exception_detail::clone_impl.51"*, align 4
  %0 = alloca %"struct.boost::exception_detail::clone_impl<boost::exception_detail::error_info_injector<boost::gregorian::bad_year> >::clone_tag", align 1
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  store %"class.boost::exception_detail::clone_impl.51"* %this, %"class.boost::exception_detail::clone_impl.51"** %this.addr, align 4
  store %"class.boost::exception_detail::clone_impl.51"* %x, %"class.boost::exception_detail::clone_impl.51"** %x.addr, align 4
  %this1 = load %"class.boost::exception_detail::clone_impl.51"** %this.addr
  %1 = bitcast %"class.boost::exception_detail::clone_impl.51"* %this1 to i8*
  %2 = getelementptr inbounds i8* %1, i64 28
  %3 = bitcast i8* %2 to %"class.boost::exception_detail::clone_base"*
  call void @_ZN5boost16exception_detail10clone_baseC2Ev(%"class.boost::exception_detail::clone_base"* %3) nounwind
  %4 = bitcast %"class.boost::exception_detail::clone_impl.51"* %this1 to %"struct.boost::exception_detail::error_info_injector.52"*
  %5 = load %"class.boost::exception_detail::clone_impl.51"** %x.addr, align 4
  %6 = bitcast %"class.boost::exception_detail::clone_impl.51"* %5 to %"struct.boost::exception_detail::error_info_injector.52"*
  invoke void @_ZN5boost16exception_detail19error_info_injectorINS_9gregorian8bad_yearEEC2ERKS4_(%"struct.boost::exception_detail::error_info_injector.52"* %4, %"struct.boost::exception_detail::error_info_injector.52"* %6)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %entry
  %7 = bitcast %"class.boost::exception_detail::clone_impl.51"* %this1 to i8***
  store i8** getelementptr inbounds ([21 x i8*]* @_ZTVN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian8bad_yearEEEEE, i64 0, i64 3), i8*** %7
  %8 = bitcast %"class.boost::exception_detail::clone_impl.51"* %this1 to i8*
  %add.ptr = getelementptr inbounds i8* %8, i32 8
  %9 = bitcast i8* %add.ptr to i8***
  store i8** getelementptr inbounds ([21 x i8*]* @_ZTVN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian8bad_yearEEEEE, i64 0, i64 10), i8*** %9
  %10 = bitcast %"class.boost::exception_detail::clone_impl.51"* %this1 to i8*
  %add.ptr2 = getelementptr inbounds i8* %10, i32 28
  %11 = bitcast i8* %add.ptr2 to i8***
  store i8** getelementptr inbounds ([21 x i8*]* @_ZTVN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian8bad_yearEEEEE, i64 0, i64 17), i8*** %11
  %12 = bitcast %"class.boost::exception_detail::clone_impl.51"* %this1 to i8*
  %add.ptr3 = getelementptr inbounds i8* %12, i32 8
  %13 = bitcast i8* %add.ptr3 to %"class.boost::exception"*
  %14 = load %"class.boost::exception_detail::clone_impl.51"** %x.addr, align 4
  %15 = icmp eq %"class.boost::exception_detail::clone_impl.51"* %14, null
  br i1 %15, label %cast.end, label %cast.notnull

cast.notnull:                                     ; preds = %invoke.cont
  %16 = bitcast %"class.boost::exception_detail::clone_impl.51"* %14 to i8*
  %add.ptr4 = getelementptr inbounds i8* %16, i32 8
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
  %24 = bitcast %"class.boost::exception_detail::clone_impl.51"* %this1 to %"struct.boost::exception_detail::error_info_injector.52"*
  call void @_ZN5boost16exception_detail19error_info_injectorINS_9gregorian8bad_yearEED2Ev(%"struct.boost::exception_detail::error_info_injector.52"* %24) nounwind
  br label %ehcleanup

ehcleanup:                                        ; preds = %lpad5, %lpad
  %25 = bitcast %"class.boost::exception_detail::clone_impl.51"* %this1 to i8*
  %26 = getelementptr inbounds i8* %25, i64 28
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

define linkonce_odr void @_ZN5boost16exception_detail19error_info_injectorINS_9gregorian8bad_yearEEC1ERKS3_(%"struct.boost::exception_detail::error_info_injector.52"* %this, %"struct.boost::gregorian::bad_year"* %x) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"struct.boost::exception_detail::error_info_injector.52"*, align 4
  %x.addr = alloca %"struct.boost::gregorian::bad_year"*, align 4
  store %"struct.boost::exception_detail::error_info_injector.52"* %this, %"struct.boost::exception_detail::error_info_injector.52"** %this.addr, align 4
  store %"struct.boost::gregorian::bad_year"* %x, %"struct.boost::gregorian::bad_year"** %x.addr, align 4
  %this1 = load %"struct.boost::exception_detail::error_info_injector.52"** %this.addr
  %0 = load %"struct.boost::gregorian::bad_year"** %x.addr
  call void @_ZN5boost16exception_detail19error_info_injectorINS_9gregorian8bad_yearEEC2ERKS3_(%"struct.boost::exception_detail::error_info_injector.52"* %this1, %"struct.boost::gregorian::bad_year"* %0)
  ret void
}

define linkonce_odr void @_ZN5boost16exception_detail19error_info_injectorINS_9gregorian8bad_yearEEC2ERKS3_(%"struct.boost::exception_detail::error_info_injector.52"* %this, %"struct.boost::gregorian::bad_year"* %x) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"struct.boost::exception_detail::error_info_injector.52"*, align 4
  %x.addr = alloca %"struct.boost::gregorian::bad_year"*, align 4
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  store %"struct.boost::exception_detail::error_info_injector.52"* %this, %"struct.boost::exception_detail::error_info_injector.52"** %this.addr, align 4
  store %"struct.boost::gregorian::bad_year"* %x, %"struct.boost::gregorian::bad_year"** %x.addr, align 4
  %this1 = load %"struct.boost::exception_detail::error_info_injector.52"** %this.addr
  %0 = bitcast %"struct.boost::exception_detail::error_info_injector.52"* %this1 to %"struct.boost::gregorian::bad_year"*
  %1 = load %"struct.boost::gregorian::bad_year"** %x.addr, align 4
  call void @_ZN5boost9gregorian8bad_yearC2ERKS1_(%"struct.boost::gregorian::bad_year"* %0, %"struct.boost::gregorian::bad_year"* %1)
  %2 = bitcast %"struct.boost::exception_detail::error_info_injector.52"* %this1 to i8*
  %3 = getelementptr inbounds i8* %2, i64 8
  %4 = bitcast i8* %3 to %"class.boost::exception"*
  invoke void @_ZN5boost9exceptionC2Ev(%"class.boost::exception"* %4)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %entry
  %5 = bitcast %"struct.boost::exception_detail::error_info_injector.52"* %this1 to i8***
  store i8** getelementptr inbounds ([9 x i8*]* @_ZTVN5boost16exception_detail19error_info_injectorINS_9gregorian8bad_yearEEE, i64 0, i64 2), i8*** %5
  %6 = bitcast %"struct.boost::exception_detail::error_info_injector.52"* %this1 to i8*
  %add.ptr = getelementptr inbounds i8* %6, i32 8
  %7 = bitcast i8* %add.ptr to i8***
  store i8** getelementptr inbounds ([9 x i8*]* @_ZTVN5boost16exception_detail19error_info_injectorINS_9gregorian8bad_yearEEE, i64 0, i64 7), i8*** %7
  ret void

lpad:                                             ; preds = %entry
  %8 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %9 = extractvalue { i8*, i32 } %8, 0
  store i8* %9, i8** %exn.slot
  %10 = extractvalue { i8*, i32 } %8, 1
  store i32 %10, i32* %ehselector.slot
  %11 = bitcast %"struct.boost::exception_detail::error_info_injector.52"* %this1 to %"struct.boost::gregorian::bad_year"*
  call void @_ZN5boost9gregorian8bad_yearD2Ev(%"struct.boost::gregorian::bad_year"* %11) nounwind
  br label %eh.resume

eh.resume:                                        ; preds = %lpad
  %exn = load i8** %exn.slot
  %sel = load i32* %ehselector.slot
  %lpad.val = insertvalue { i8*, i32 } undef, i8* %exn, 0
  %lpad.val2 = insertvalue { i8*, i32 } %lpad.val, i32 %sel, 1
  resume { i8*, i32 } %lpad.val2
}

define linkonce_odr void @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian8bad_yearEEEEC1ERKS5_(%"class.boost::exception_detail::clone_impl.51"* %this, %"struct.boost::exception_detail::error_info_injector.52"* %x) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::exception_detail::clone_impl.51"*, align 4
  %x.addr = alloca %"struct.boost::exception_detail::error_info_injector.52"*, align 4
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  store %"class.boost::exception_detail::clone_impl.51"* %this, %"class.boost::exception_detail::clone_impl.51"** %this.addr, align 4
  store %"struct.boost::exception_detail::error_info_injector.52"* %x, %"struct.boost::exception_detail::error_info_injector.52"** %x.addr, align 4
  %this1 = load %"class.boost::exception_detail::clone_impl.51"** %this.addr
  %0 = bitcast %"class.boost::exception_detail::clone_impl.51"* %this1 to i8*
  %1 = getelementptr inbounds i8* %0, i64 28
  %2 = bitcast i8* %1 to %"class.boost::exception_detail::clone_base"*
  call void @_ZN5boost16exception_detail10clone_baseC2Ev(%"class.boost::exception_detail::clone_base"* %2) nounwind
  %3 = bitcast %"class.boost::exception_detail::clone_impl.51"* %this1 to %"struct.boost::exception_detail::error_info_injector.52"*
  %4 = load %"struct.boost::exception_detail::error_info_injector.52"** %x.addr, align 4
  invoke void @_ZN5boost16exception_detail19error_info_injectorINS_9gregorian8bad_yearEEC2ERKS4_(%"struct.boost::exception_detail::error_info_injector.52"* %3, %"struct.boost::exception_detail::error_info_injector.52"* %4)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %entry
  %5 = bitcast %"class.boost::exception_detail::clone_impl.51"* %this1 to i8***
  store i8** getelementptr inbounds ([21 x i8*]* @_ZTVN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian8bad_yearEEEEE, i64 0, i64 3), i8*** %5
  %6 = bitcast %"class.boost::exception_detail::clone_impl.51"* %this1 to i8*
  %add.ptr = getelementptr inbounds i8* %6, i32 8
  %7 = bitcast i8* %add.ptr to i8***
  store i8** getelementptr inbounds ([21 x i8*]* @_ZTVN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian8bad_yearEEEEE, i64 0, i64 10), i8*** %7
  %8 = bitcast %"class.boost::exception_detail::clone_impl.51"* %this1 to i8*
  %add.ptr2 = getelementptr inbounds i8* %8, i32 28
  %9 = bitcast i8* %add.ptr2 to i8***
  store i8** getelementptr inbounds ([21 x i8*]* @_ZTVN5boost16exception_detail10clone_implINS0_19error_info_injectorINS_9gregorian8bad_yearEEEEE, i64 0, i64 17), i8*** %9
  %10 = bitcast %"class.boost::exception_detail::clone_impl.51"* %this1 to i8*
  %add.ptr3 = getelementptr inbounds i8* %10, i32 8
  %11 = bitcast i8* %add.ptr3 to %"class.boost::exception"*
  %12 = load %"struct.boost::exception_detail::error_info_injector.52"** %x.addr, align 4
  %13 = icmp eq %"struct.boost::exception_detail::error_info_injector.52"* %12, null
  br i1 %13, label %cast.end, label %cast.notnull

cast.notnull:                                     ; preds = %invoke.cont
  %14 = bitcast %"struct.boost::exception_detail::error_info_injector.52"* %12 to i8*
  %add.ptr4 = getelementptr inbounds i8* %14, i32 8
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
  %22 = bitcast %"class.boost::exception_detail::clone_impl.51"* %this1 to %"struct.boost::exception_detail::error_info_injector.52"*
  call void @_ZN5boost16exception_detail19error_info_injectorINS_9gregorian8bad_yearEED2Ev(%"struct.boost::exception_detail::error_info_injector.52"* %22) nounwind
  br label %ehcleanup

ehcleanup:                                        ; preds = %lpad5, %lpad
  %23 = bitcast %"class.boost::exception_detail::clone_impl.51"* %this1 to i8*
  %24 = getelementptr inbounds i8* %23, i64 28
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

define linkonce_odr zeroext i16 @_ZN5boost2CV23simple_exception_policyItLt1400ELt10000ENS_9gregorian8bad_yearEE3minEv() nounwind align 2 {
entry:
  ret i16 1400
}

define linkonce_odr void @_ZN5boost9gregorian4dateC2ENS0_9greg_yearENS0_10greg_monthENS0_8greg_dayE(%"class.boost::gregorian::date"* %this, %"class.boost::gregorian::greg_year"* byval align 4 %y, %"class.boost::gregorian::greg_month"* byval align 4 %m, %"class.boost::gregorian::greg_day"* byval align 4 %d) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::gregorian::date"*, align 4
  %agg.tmp = alloca %"class.boost::gregorian::greg_year", align 4
  %agg.tmp2 = alloca %"class.boost::gregorian::greg_month", align 4
  %agg.tmp3 = alloca %"class.boost::gregorian::greg_day", align 4
  %agg.tmp4 = alloca %"class.boost::gregorian::greg_year", align 4
  %agg.tmp5 = alloca %"class.boost::gregorian::greg_month", align 4
  %ref.tmp = alloca %"struct.boost::gregorian::bad_day_of_month", align 4
  %ref.tmp8 = alloca %"class.std::basic_string", align 4
  %ref.tmp9 = alloca %"class.std::allocator", align 1
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  store %"class.boost::gregorian::date"* %this, %"class.boost::gregorian::date"** %this.addr, align 4
  %this1 = load %"class.boost::gregorian::date"** %this.addr
  %0 = bitcast %"class.boost::gregorian::date"* %this1 to %"class.boost::date_time::date"*
  %1 = bitcast %"class.boost::gregorian::greg_year"* %agg.tmp to i8*
  %2 = bitcast %"class.boost::gregorian::greg_year"* %y to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %1, i8* %2, i32 2, i32 2, i1 false)
  %3 = bitcast %"class.boost::gregorian::greg_month"* %agg.tmp2 to i8*
  %4 = bitcast %"class.boost::gregorian::greg_month"* %m to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %3, i8* %4, i32 2, i32 2, i1 false)
  %5 = bitcast %"class.boost::gregorian::greg_day"* %agg.tmp3 to i8*
  %6 = bitcast %"class.boost::gregorian::greg_day"* %d to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %5, i8* %6, i32 2, i32 2, i1 false)
  call void @_ZN5boost9date_time4dateINS_9gregorian4dateENS2_18gregorian_calendarENS2_13date_durationEEC2ENS2_9greg_yearENS2_10greg_monthENS2_8greg_dayE(%"class.boost::date_time::date"* %0, %"class.boost::gregorian::greg_year"* byval align 4 %agg.tmp, %"class.boost::gregorian::greg_month"* byval align 4 %agg.tmp2, %"class.boost::gregorian::greg_day"* byval align 4 %agg.tmp3)
  %7 = bitcast %"class.boost::gregorian::greg_year"* %agg.tmp4 to i8*
  %8 = bitcast %"class.boost::gregorian::greg_year"* %y to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %7, i8* %8, i32 2, i32 2, i1 false)
  %9 = bitcast %"class.boost::gregorian::greg_month"* %agg.tmp5 to i8*
  %10 = bitcast %"class.boost::gregorian::greg_month"* %m to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %9, i8* %10, i32 2, i32 2, i1 false)
  %call = call zeroext i16 @_ZN5boost9date_time23gregorian_calendar_baseINS0_19year_month_day_baseINS_9gregorian9greg_yearENS3_10greg_monthENS3_8greg_dayEEEjE16end_of_month_dayES4_S5_(%"class.boost::gregorian::greg_year"* byval align 4 %agg.tmp4, %"class.boost::gregorian::greg_month"* byval align 4 %agg.tmp5)
  %conv = zext i16 %call to i32
  %call6 = call zeroext i16 @_ZNK5boost9gregorian8greg_daycvtEv(%"class.boost::gregorian::greg_day"* %d)
  %conv7 = zext i16 %call6 to i32
  %cmp = icmp slt i32 %conv, %conv7
  br i1 %cmp, label %if.then, label %if.end

if.then:                                          ; preds = %entry
  call void @_ZNSaIcEC1Ev(%"class.std::allocator"* %ref.tmp9) nounwind
  invoke void @_ZNSsC1EPKcRKSaIcE(%"class.std::basic_string"* %ref.tmp8, i8* getelementptr inbounds ([35 x i8]* @.str42, i32 0, i32 0), %"class.std::allocator"* %ref.tmp9)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %if.then
  invoke void @_ZN5boost9gregorian16bad_day_of_monthC1ERKSs(%"struct.boost::gregorian::bad_day_of_month"* %ref.tmp, %"class.std::basic_string"* %ref.tmp8)
          to label %invoke.cont11 unwind label %lpad10

invoke.cont11:                                    ; preds = %invoke.cont
  invoke void @_ZN5boost15throw_exceptionINS_9gregorian16bad_day_of_monthEEEvRKT_(%"struct.boost::gregorian::bad_day_of_month"* %ref.tmp) noreturn
          to label %invoke.cont13 unwind label %lpad12

invoke.cont13:                                    ; preds = %invoke.cont11
  unreachable

lpad:                                             ; preds = %20, %if.then
  %11 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %12 = extractvalue { i8*, i32 } %11, 0
  store i8* %12, i8** %exn.slot
  %13 = extractvalue { i8*, i32 } %11, 1
  store i32 %13, i32* %ehselector.slot
  br label %ehcleanup16

lpad10:                                           ; preds = %invoke.cont
  %14 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %15 = extractvalue { i8*, i32 } %14, 0
  store i8* %15, i8** %exn.slot
  %16 = extractvalue { i8*, i32 } %14, 1
  store i32 %16, i32* %ehselector.slot
  br label %ehcleanup

lpad12:                                           ; preds = %invoke.cont11
  %17 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %18 = extractvalue { i8*, i32 } %17, 0
  store i8* %18, i8** %exn.slot
  %19 = extractvalue { i8*, i32 } %17, 1
  store i32 %19, i32* %ehselector.slot
  call void @_ZN5boost9gregorian16bad_day_of_monthD1Ev(%"struct.boost::gregorian::bad_day_of_month"* %ref.tmp) nounwind
  br label %ehcleanup
                                                  ; No predecessors!
  call void @_ZN5boost9gregorian16bad_day_of_monthD1Ev(%"struct.boost::gregorian::bad_day_of_month"* %ref.tmp) nounwind
  invoke void @_ZNSsD1Ev(%"class.std::basic_string"* %ref.tmp8)
          to label %invoke.cont14 unwind label %lpad

invoke.cont14:                                    ; preds = %20
  call void @_ZNSaIcED1Ev(%"class.std::allocator"* %ref.tmp9) nounwind
  br label %if.end

ehcleanup:                                        ; preds = %lpad12, %lpad10
  invoke void @_ZNSsD1Ev(%"class.std::basic_string"* %ref.tmp8)
          to label %invoke.cont15 unwind label %terminate.lpad

invoke.cont15:                                    ; preds = %ehcleanup
  br label %ehcleanup16

ehcleanup16:                                      ; preds = %invoke.cont15, %lpad
  call void @_ZNSaIcED1Ev(%"class.std::allocator"* %ref.tmp9) nounwind
  br label %eh.resume

if.end:                                           ; preds = %invoke.cont14, %entry
  ret void

eh.resume:                                        ; preds = %ehcleanup16
  %exn = load i8** %exn.slot
  %sel = load i32* %ehselector.slot
  %lpad.val = insertvalue { i8*, i32 } undef, i8* %exn, 0
  %lpad.val17 = insertvalue { i8*, i32 } %lpad.val, i32 %sel, 1
  resume { i8*, i32 } %lpad.val17

terminate.lpad:                                   ; preds = %ehcleanup
  %21 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          catch i8* null
  call void @_ZSt9terminatev() noreturn nounwind
  unreachable
}

define linkonce_odr void @_ZN5boost9date_time4dateINS_9gregorian4dateENS2_18gregorian_calendarENS2_13date_durationEEC2ENS2_9greg_yearENS2_10greg_monthENS2_8greg_dayE(%"class.boost::date_time::date"* %this, %"class.boost::gregorian::greg_year"* byval align 4 %y, %"class.boost::gregorian::greg_month"* byval align 4 %m, %"class.boost::gregorian::greg_day"* byval align 4 %d) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::date_time::date"*, align 4
  %ref.tmp = alloca %"struct.boost::date_time::year_month_day_base", align 2
  %agg.tmp = alloca %"class.boost::gregorian::greg_year", align 4
  %agg.tmp2 = alloca %"class.boost::gregorian::greg_month", align 4
  %agg.tmp3 = alloca %"class.boost::gregorian::greg_day", align 4
  store %"class.boost::date_time::date"* %this, %"class.boost::date_time::date"** %this.addr, align 4
  %this1 = load %"class.boost::date_time::date"** %this.addr
  %0 = bitcast %"class.boost::date_time::date"* %this1 to %"struct.boost::less_than_comparable.38"*
  %days_ = getelementptr inbounds %"class.boost::date_time::date"* %this1, i32 0, i32 0
  %1 = bitcast %"class.boost::gregorian::greg_year"* %agg.tmp to i8*
  %2 = bitcast %"class.boost::gregorian::greg_year"* %y to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %1, i8* %2, i32 2, i32 2, i1 false)
  %3 = bitcast %"class.boost::gregorian::greg_month"* %agg.tmp2 to i8*
  %4 = bitcast %"class.boost::gregorian::greg_month"* %m to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %3, i8* %4, i32 2, i32 2, i1 false)
  %5 = bitcast %"class.boost::gregorian::greg_day"* %agg.tmp3 to i8*
  %6 = bitcast %"class.boost::gregorian::greg_day"* %d to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %5, i8* %6, i32 2, i32 2, i1 false)
  call void @_ZN5boost9date_time19year_month_day_baseINS_9gregorian9greg_yearENS2_10greg_monthENS2_8greg_dayEEC1ES3_S4_S5_(%"struct.boost::date_time::year_month_day_base"* %ref.tmp, %"class.boost::gregorian::greg_year"* byval align 4 %agg.tmp, %"class.boost::gregorian::greg_month"* byval align 4 %agg.tmp2, %"class.boost::gregorian::greg_day"* byval align 4 %agg.tmp3)
  %call = call i32 @_ZN5boost9date_time23gregorian_calendar_baseINS0_19year_month_day_baseINS_9gregorian9greg_yearENS3_10greg_monthENS3_8greg_dayEEEjE10day_numberERKS7_(%"struct.boost::date_time::year_month_day_base"* %ref.tmp)
  store i32 %call, i32* %days_, align 4
  ret void
}

define linkonce_odr zeroext i16 @_ZN5boost9date_time23gregorian_calendar_baseINS0_19year_month_day_baseINS_9gregorian9greg_yearENS3_10greg_monthENS3_8greg_dayEEEjE16end_of_month_dayES4_S5_(%"class.boost::gregorian::greg_year"* byval align 4 %year, %"class.boost::gregorian::greg_month"* byval align 4 %month) align 2 {
entry:
  %retval = alloca i16, align 2
  %agg.tmp = alloca %"class.boost::gregorian::greg_year", align 4
  %call = call zeroext i16 @_ZNK5boost9gregorian10greg_monthcvtEv(%"class.boost::gregorian::greg_month"* %month)
  %conv = zext i16 %call to i32
  switch i32 %conv, label %sw.default [
    i32 2, label %sw.bb
    i32 4, label %sw.bb2
    i32 6, label %sw.bb2
    i32 9, label %sw.bb2
    i32 11, label %sw.bb2
  ]

sw.bb:                                            ; preds = %entry
  %0 = bitcast %"class.boost::gregorian::greg_year"* %agg.tmp to i8*
  %1 = bitcast %"class.boost::gregorian::greg_year"* %year to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %0, i8* %1, i32 2, i32 2, i1 false)
  %call1 = call zeroext i1 @_ZN5boost9date_time23gregorian_calendar_baseINS0_19year_month_day_baseINS_9gregorian9greg_yearENS3_10greg_monthENS3_8greg_dayEEEjE12is_leap_yearES4_(%"class.boost::gregorian::greg_year"* byval align 4 %agg.tmp)
  br i1 %call1, label %if.then, label %if.else

if.then:                                          ; preds = %sw.bb
  store i16 29, i16* %retval
  br label %return

if.else:                                          ; preds = %sw.bb
  store i16 28, i16* %retval
  br label %return

sw.bb2:                                           ; preds = %entry, %entry, %entry, %entry
  store i16 30, i16* %retval
  br label %return

sw.default:                                       ; preds = %entry
  store i16 31, i16* %retval
  br label %return

return:                                           ; preds = %sw.default, %sw.bb2, %if.else, %if.then
  %2 = load i16* %retval
  ret i16 %2
}

define linkonce_odr zeroext i16 @_ZNK5boost9gregorian8greg_daycvtEv(%"class.boost::gregorian::greg_day"* %this) nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::gregorian::greg_day"*, align 4
  store %"class.boost::gregorian::greg_day"* %this, %"class.boost::gregorian::greg_day"** %this.addr, align 4
  %this1 = load %"class.boost::gregorian::greg_day"** %this.addr
  %0 = bitcast %"class.boost::gregorian::greg_day"* %this1 to %"class.boost::CV::constrained_value.44"*
  %value_ = getelementptr inbounds %"class.boost::CV::constrained_value.44"* %0, i32 0, i32 0
  %1 = load i16* %value_, align 2
  ret i16 %1
}

define linkonce_odr void @_ZN5boost9gregorian16bad_day_of_monthC1ERKSs(%"struct.boost::gregorian::bad_day_of_month"* %this, %"class.std::basic_string"* %s) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"struct.boost::gregorian::bad_day_of_month"*, align 4
  %s.addr = alloca %"class.std::basic_string"*, align 4
  store %"struct.boost::gregorian::bad_day_of_month"* %this, %"struct.boost::gregorian::bad_day_of_month"** %this.addr, align 4
  store %"class.std::basic_string"* %s, %"class.std::basic_string"** %s.addr, align 4
  %this1 = load %"struct.boost::gregorian::bad_day_of_month"** %this.addr
  %0 = load %"class.std::basic_string"** %s.addr
  call void @_ZN5boost9gregorian16bad_day_of_monthC2ERKSs(%"struct.boost::gregorian::bad_day_of_month"* %this1, %"class.std::basic_string"* %0)
  ret void
}

define linkonce_odr void @_ZN5boost9gregorian16bad_day_of_monthC2ERKSs(%"struct.boost::gregorian::bad_day_of_month"* %this, %"class.std::basic_string"* %s) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"struct.boost::gregorian::bad_day_of_month"*, align 4
  %s.addr = alloca %"class.std::basic_string"*, align 4
  store %"struct.boost::gregorian::bad_day_of_month"* %this, %"struct.boost::gregorian::bad_day_of_month"** %this.addr, align 4
  store %"class.std::basic_string"* %s, %"class.std::basic_string"** %s.addr, align 4
  %this1 = load %"struct.boost::gregorian::bad_day_of_month"** %this.addr
  %0 = bitcast %"struct.boost::gregorian::bad_day_of_month"* %this1 to %"class.std::out_of_range"*
  %1 = load %"class.std::basic_string"** %s.addr, align 4
  call void @_ZNSt12out_of_rangeC2ERKSs(%"class.std::out_of_range"* %0, %"class.std::basic_string"* %1)
  %2 = bitcast %"struct.boost::gregorian::bad_day_of_month"* %this1 to i8***
  store i8** getelementptr inbounds ([5 x i8*]* @_ZTVN5boost9gregorian16bad_day_of_monthE, i64 0, i64 2), i8*** %2
  ret void
}

define linkonce_odr zeroext i16 @_ZNK5boost9gregorian10greg_monthcvtEv(%"class.boost::gregorian::greg_month"* %this) nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::gregorian::greg_month"*, align 4
  store %"class.boost::gregorian::greg_month"* %this, %"class.boost::gregorian::greg_month"** %this.addr, align 4
  %this1 = load %"class.boost::gregorian::greg_month"** %this.addr
  %0 = bitcast %"class.boost::gregorian::greg_month"* %this1 to %"class.boost::CV::constrained_value.43"*
  %value_ = getelementptr inbounds %"class.boost::CV::constrained_value.43"* %0, i32 0, i32 0
  %1 = load i16* %value_, align 2
  ret i16 %1
}

define linkonce_odr zeroext i1 @_ZN5boost9date_time23gregorian_calendar_baseINS0_19year_month_day_baseINS_9gregorian9greg_yearENS3_10greg_monthENS3_8greg_dayEEEjE12is_leap_yearES4_(%"class.boost::gregorian::greg_year"* byval align 4 %year) align 2 {
entry:
  %call = call zeroext i16 @_ZNK5boost9gregorian9greg_yearcvtEv(%"class.boost::gregorian::greg_year"* %year)
  %conv = zext i16 %call to i32
  %rem = srem i32 %conv, 4
  %tobool = icmp ne i32 %rem, 0
  br i1 %tobool, label %land.end, label %land.rhs

land.rhs:                                         ; preds = %entry
  %call1 = call zeroext i16 @_ZNK5boost9gregorian9greg_yearcvtEv(%"class.boost::gregorian::greg_year"* %year)
  %conv2 = zext i16 %call1 to i32
  %rem3 = srem i32 %conv2, 100
  %tobool4 = icmp ne i32 %rem3, 0
  br i1 %tobool4, label %lor.end, label %lor.rhs

lor.rhs:                                          ; preds = %land.rhs
  %call5 = call zeroext i16 @_ZNK5boost9gregorian9greg_yearcvtEv(%"class.boost::gregorian::greg_year"* %year)
  %conv6 = zext i16 %call5 to i32
  %rem7 = srem i32 %conv6, 400
  %tobool8 = icmp ne i32 %rem7, 0
  %lnot = xor i1 %tobool8, true
  br label %lor.end

lor.end:                                          ; preds = %lor.rhs, %land.rhs
  %0 = phi i1 [ true, %land.rhs ], [ %lnot, %lor.rhs ]
  br label %land.end

land.end:                                         ; preds = %lor.end, %entry
  %1 = phi i1 [ false, %entry ], [ %0, %lor.end ]
  ret i1 %1
}

define linkonce_odr zeroext i16 @_ZNK5boost9gregorian9greg_yearcvtEv(%"class.boost::gregorian::greg_year"* %this) nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::gregorian::greg_year"*, align 4
  store %"class.boost::gregorian::greg_year"* %this, %"class.boost::gregorian::greg_year"** %this.addr, align 4
  %this1 = load %"class.boost::gregorian::greg_year"** %this.addr
  %0 = bitcast %"class.boost::gregorian::greg_year"* %this1 to %"class.boost::CV::constrained_value"*
  %value_ = getelementptr inbounds %"class.boost::CV::constrained_value"* %0, i32 0, i32 0
  %1 = load i16* %value_, align 2
  ret i16 %1
}

define linkonce_odr i32 @_ZN5boost9date_time23gregorian_calendar_baseINS0_19year_month_day_baseINS_9gregorian9greg_yearENS3_10greg_monthENS3_8greg_dayEEEjE10day_numberERKS7_(%"struct.boost::date_time::year_month_day_base"* %ymd) nounwind align 2 {
entry:
  %ymd.addr = alloca %"struct.boost::date_time::year_month_day_base"*, align 4
  %a = alloca i16, align 2
  %y = alloca i16, align 2
  %m = alloca i16, align 2
  %d = alloca i32, align 4
  store %"struct.boost::date_time::year_month_day_base"* %ymd, %"struct.boost::date_time::year_month_day_base"** %ymd.addr, align 4
  %0 = load %"struct.boost::date_time::year_month_day_base"** %ymd.addr, align 4
  %month = getelementptr inbounds %"struct.boost::date_time::year_month_day_base"* %0, i32 0, i32 1
  %call = call zeroext i16 @_ZNK5boost9gregorian10greg_monthcvtEv(%"class.boost::gregorian::greg_month"* %month)
  %conv = zext i16 %call to i32
  %sub = sub nsw i32 14, %conv
  %div = sdiv i32 %sub, 12
  %conv1 = trunc i32 %div to i16
  store i16 %conv1, i16* %a, align 2
  %1 = load %"struct.boost::date_time::year_month_day_base"** %ymd.addr, align 4
  %year = getelementptr inbounds %"struct.boost::date_time::year_month_day_base"* %1, i32 0, i32 0
  %call2 = call zeroext i16 @_ZNK5boost9gregorian9greg_yearcvtEv(%"class.boost::gregorian::greg_year"* %year)
  %conv3 = zext i16 %call2 to i32
  %add = add nsw i32 %conv3, 4800
  %2 = load i16* %a, align 2
  %conv4 = zext i16 %2 to i32
  %sub5 = sub nsw i32 %add, %conv4
  %conv6 = trunc i32 %sub5 to i16
  store i16 %conv6, i16* %y, align 2
  %3 = load %"struct.boost::date_time::year_month_day_base"** %ymd.addr, align 4
  %month7 = getelementptr inbounds %"struct.boost::date_time::year_month_day_base"* %3, i32 0, i32 1
  %call8 = call zeroext i16 @_ZNK5boost9gregorian10greg_monthcvtEv(%"class.boost::gregorian::greg_month"* %month7)
  %conv9 = zext i16 %call8 to i32
  %4 = load i16* %a, align 2
  %conv10 = zext i16 %4 to i32
  %mul = mul nsw i32 12, %conv10
  %add11 = add nsw i32 %conv9, %mul
  %sub12 = sub nsw i32 %add11, 3
  %conv13 = trunc i32 %sub12 to i16
  store i16 %conv13, i16* %m, align 2
  %5 = load %"struct.boost::date_time::year_month_day_base"** %ymd.addr, align 4
  %day = getelementptr inbounds %"struct.boost::date_time::year_month_day_base"* %5, i32 0, i32 2
  %call14 = call zeroext i16 @_ZNK5boost9gregorian8greg_daycvtEv(%"class.boost::gregorian::greg_day"* %day)
  %conv15 = zext i16 %call14 to i32
  %6 = load i16* %m, align 2
  %conv16 = zext i16 %6 to i32
  %mul17 = mul nsw i32 153, %conv16
  %add18 = add nsw i32 %mul17, 2
  %div19 = sdiv i32 %add18, 5
  %add20 = add nsw i32 %conv15, %div19
  %7 = load i16* %y, align 2
  %conv21 = zext i16 %7 to i32
  %mul22 = mul nsw i32 365, %conv21
  %add23 = add nsw i32 %add20, %mul22
  %8 = load i16* %y, align 2
  %conv24 = zext i16 %8 to i32
  %div25 = sdiv i32 %conv24, 4
  %add26 = add nsw i32 %add23, %div25
  %9 = load i16* %y, align 2
  %conv27 = zext i16 %9 to i32
  %div28 = sdiv i32 %conv27, 100
  %sub29 = sub nsw i32 %add26, %div28
  %10 = load i16* %y, align 2
  %conv30 = zext i16 %10 to i32
  %div31 = sdiv i32 %conv30, 400
  %add32 = add nsw i32 %sub29, %div31
  %sub33 = sub nsw i32 %add32, 32045
  store i32 %sub33, i32* %d, align 4
  %11 = load i32* %d, align 4
  ret i32 %11
}

define linkonce_odr void @_ZN5boost9date_time19year_month_day_baseINS_9gregorian9greg_yearENS2_10greg_monthENS2_8greg_dayEEC1ES3_S4_S5_(%"struct.boost::date_time::year_month_day_base"* %this, %"class.boost::gregorian::greg_year"* byval align 4 %y, %"class.boost::gregorian::greg_month"* byval align 4 %m, %"class.boost::gregorian::greg_day"* byval align 4 %d) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"struct.boost::date_time::year_month_day_base"*, align 4
  store %"struct.boost::date_time::year_month_day_base"* %this, %"struct.boost::date_time::year_month_day_base"** %this.addr, align 4
  %this1 = load %"struct.boost::date_time::year_month_day_base"** %this.addr
  call void @_ZN5boost9date_time19year_month_day_baseINS_9gregorian9greg_yearENS2_10greg_monthENS2_8greg_dayEEC2ES3_S4_S5_(%"struct.boost::date_time::year_month_day_base"* %this1, %"class.boost::gregorian::greg_year"* byval align 4 %y, %"class.boost::gregorian::greg_month"* byval align 4 %m, %"class.boost::gregorian::greg_day"* byval align 4 %d)
  ret void
}

define linkonce_odr void @_ZN5boost9date_time19year_month_day_baseINS_9gregorian9greg_yearENS2_10greg_monthENS2_8greg_dayEEC2ES3_S4_S5_(%"struct.boost::date_time::year_month_day_base"* %this, %"class.boost::gregorian::greg_year"* byval align 4 %y, %"class.boost::gregorian::greg_month"* byval align 4 %m, %"class.boost::gregorian::greg_day"* byval align 4 %d) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"struct.boost::date_time::year_month_day_base"*, align 4
  store %"struct.boost::date_time::year_month_day_base"* %this, %"struct.boost::date_time::year_month_day_base"** %this.addr, align 4
  %this1 = load %"struct.boost::date_time::year_month_day_base"** %this.addr
  %year = getelementptr inbounds %"struct.boost::date_time::year_month_day_base"* %this1, i32 0, i32 0
  %0 = bitcast %"class.boost::gregorian::greg_year"* %year to i8*
  %1 = bitcast %"class.boost::gregorian::greg_year"* %y to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %0, i8* %1, i32 2, i32 2, i1 false)
  %month = getelementptr inbounds %"struct.boost::date_time::year_month_day_base"* %this1, i32 0, i32 1
  %2 = bitcast %"class.boost::gregorian::greg_month"* %month to i8*
  %3 = bitcast %"class.boost::gregorian::greg_month"* %m to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %2, i8* %3, i32 2, i32 2, i1 false)
  %day = getelementptr inbounds %"struct.boost::date_time::year_month_day_base"* %this1, i32 0, i32 2
  %4 = bitcast %"class.boost::gregorian::greg_day"* %day to i8*
  %5 = bitcast %"class.boost::gregorian::greg_day"* %d to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %4, i8* %5, i32 2, i32 2, i1 false)
  ret void
}

define linkonce_odr void @_ZN5boost10posix_time5ptimeC2ENS_9gregorian4dateE(%"class.boost::posix_time::ptime"* %this, %"class.boost::gregorian::date"* byval align 4 %d) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::posix_time::ptime"*, align 4
  %ref.tmp = alloca %"class.boost::posix_time::time_duration", align 4
  store %"class.boost::posix_time::ptime"* %this, %"class.boost::posix_time::ptime"** %this.addr, align 4
  %this1 = load %"class.boost::posix_time::ptime"** %this.addr
  %0 = bitcast %"class.boost::posix_time::ptime"* %this1 to %"class.boost::date_time::base_time"*
  call void @_ZN5boost10posix_time13time_durationC1Eiiix(%"class.boost::posix_time::time_duration"* %ref.tmp, i32 0, i32 0, i32 0, i64 0)
  call void @_ZN5boost9date_time9base_timeINS_10posix_time5ptimeENS0_19counted_time_systemINS0_16counted_time_repINS2_33millisec_posix_time_system_configEEEEEEC2ERKNS_9gregorian4dateERKNS2_13time_durationENS0_9dst_flagsE(%"class.boost::date_time::base_time"* %0, %"class.boost::gregorian::date"* %d, %"class.boost::posix_time::time_duration"* %ref.tmp, i32 0)
  ret void
}

define linkonce_odr void @_ZN5boost9date_time9base_timeINS_10posix_time5ptimeENS0_19counted_time_systemINS0_16counted_time_repINS2_33millisec_posix_time_system_configEEEEEEC2ERKNS_9gregorian4dateERKNS2_13time_durationENS0_9dst_flagsE(%"class.boost::date_time::base_time"* %this, %"class.boost::gregorian::date"* %day, %"class.boost::posix_time::time_duration"* %td, i32 %dst) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::date_time::base_time"*, align 4
  %day.addr = alloca %"class.boost::gregorian::date"*, align 4
  %td.addr = alloca %"class.boost::posix_time::time_duration"*, align 4
  %dst.addr = alloca i32, align 4
  store %"class.boost::date_time::base_time"* %this, %"class.boost::date_time::base_time"** %this.addr, align 4
  store %"class.boost::gregorian::date"* %day, %"class.boost::gregorian::date"** %day.addr, align 4
  store %"class.boost::posix_time::time_duration"* %td, %"class.boost::posix_time::time_duration"** %td.addr, align 4
  store i32 %dst, i32* %dst.addr, align 4
  %this1 = load %"class.boost::date_time::base_time"** %this.addr
  %0 = bitcast %"class.boost::date_time::base_time"* %this1 to %"struct.boost::less_than_comparable"*
  %time_ = getelementptr inbounds %"class.boost::date_time::base_time"* %this1, i32 0, i32 0
  %1 = load %"class.boost::gregorian::date"** %day.addr, align 4
  %2 = load %"class.boost::posix_time::time_duration"** %td.addr, align 4
  %3 = load i32* %dst.addr, align 4
  call void @_ZN5boost9date_time19counted_time_systemINS0_16counted_time_repINS_10posix_time33millisec_posix_time_system_configEEEE12get_time_repERKNS_9gregorian4dateERKNS3_13time_durationENS0_9dst_flagsE(%"struct.boost::date_time::counted_time_rep"* sret %time_, %"class.boost::gregorian::date"* %1, %"class.boost::posix_time::time_duration"* %2, i32 %3)
  ret void
}

define linkonce_odr void @_ZN5boost10posix_time13time_durationC1Eiiix(%"class.boost::posix_time::time_duration"* %this, i32 %hour, i32 %min, i32 %sec, i64 %fs) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::posix_time::time_duration"*, align 4
  %hour.addr = alloca i32, align 4
  %min.addr = alloca i32, align 4
  %sec.addr = alloca i32, align 4
  %fs.addr = alloca i64, align 8
  store %"class.boost::posix_time::time_duration"* %this, %"class.boost::posix_time::time_duration"** %this.addr, align 4
  store i32 %hour, i32* %hour.addr, align 4
  store i32 %min, i32* %min.addr, align 4
  store i32 %sec, i32* %sec.addr, align 4
  store i64 %fs, i64* %fs.addr, align 8
  %this1 = load %"class.boost::posix_time::time_duration"** %this.addr
  %0 = load i32* %hour.addr, align 4
  %1 = load i32* %min.addr, align 4
  %2 = load i32* %sec.addr, align 4
  %3 = load i64* %fs.addr, align 8
  call void @_ZN5boost10posix_time13time_durationC2Eiiix(%"class.boost::posix_time::time_duration"* %this1, i32 %0, i32 %1, i32 %2, i64 %3)
  ret void
}

define linkonce_odr void @_ZN5boost9date_time19counted_time_systemINS0_16counted_time_repINS_10posix_time33millisec_posix_time_system_configEEEE12get_time_repERKNS_9gregorian4dateERKNS3_13time_durationENS0_9dst_flagsE(%"struct.boost::date_time::counted_time_rep"* noalias sret %agg.result, %"class.boost::gregorian::date"* %day, %"class.boost::posix_time::time_duration"* %tod, i32 %dst) align 2 {
entry:
  %day.addr = alloca %"class.boost::gregorian::date"*, align 4
  %tod.addr = alloca %"class.boost::posix_time::time_duration"*, align 4
  %dst.addr = alloca i32, align 4
  store %"class.boost::gregorian::date"* %day, %"class.boost::gregorian::date"** %day.addr, align 4
  store %"class.boost::posix_time::time_duration"* %tod, %"class.boost::posix_time::time_duration"** %tod.addr, align 4
  store i32 %dst, i32* %dst.addr, align 4
  call void @_ZN5boost9date_time19counted_time_systemINS0_16counted_time_repINS_10posix_time33millisec_posix_time_system_configEEEE10unused_varINS0_9dst_flagsEEEvRKT_(i32* %dst.addr)
  %0 = load %"class.boost::gregorian::date"** %day.addr, align 4
  %1 = load %"class.boost::posix_time::time_duration"** %tod.addr, align 4
  call void @_ZN5boost9date_time16counted_time_repINS_10posix_time33millisec_posix_time_system_configEEC1ERKNS_9gregorian4dateERKNS2_13time_durationE(%"struct.boost::date_time::counted_time_rep"* %agg.result, %"class.boost::gregorian::date"* %0, %"class.boost::posix_time::time_duration"* %1)
  ret void
}

define linkonce_odr void @_ZN5boost9date_time19counted_time_systemINS0_16counted_time_repINS_10posix_time33millisec_posix_time_system_configEEEE10unused_varINS0_9dst_flagsEEEvRKT_(i32*) nounwind align 2 {
entry:
  %.addr = alloca i32*, align 4
  store i32* %0, i32** %.addr, align 4
  ret void
}

define linkonce_odr void @_ZN5boost9date_time16counted_time_repINS_10posix_time33millisec_posix_time_system_configEEC1ERKNS_9gregorian4dateERKNS2_13time_durationE(%"struct.boost::date_time::counted_time_rep"* %this, %"class.boost::gregorian::date"* %d, %"class.boost::posix_time::time_duration"* %time_of_day) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"struct.boost::date_time::counted_time_rep"*, align 4
  %d.addr = alloca %"class.boost::gregorian::date"*, align 4
  %time_of_day.addr = alloca %"class.boost::posix_time::time_duration"*, align 4
  store %"struct.boost::date_time::counted_time_rep"* %this, %"struct.boost::date_time::counted_time_rep"** %this.addr, align 4
  store %"class.boost::gregorian::date"* %d, %"class.boost::gregorian::date"** %d.addr, align 4
  store %"class.boost::posix_time::time_duration"* %time_of_day, %"class.boost::posix_time::time_duration"** %time_of_day.addr, align 4
  %this1 = load %"struct.boost::date_time::counted_time_rep"** %this.addr
  %0 = load %"class.boost::gregorian::date"** %d.addr
  %1 = load %"class.boost::posix_time::time_duration"** %time_of_day.addr
  call void @_ZN5boost9date_time16counted_time_repINS_10posix_time33millisec_posix_time_system_configEEC2ERKNS_9gregorian4dateERKNS2_13time_durationE(%"struct.boost::date_time::counted_time_rep"* %this1, %"class.boost::gregorian::date"* %0, %"class.boost::posix_time::time_duration"* %1)
  ret void
}

define linkonce_odr void @_ZN5boost9date_time16counted_time_repINS_10posix_time33millisec_posix_time_system_configEEC2ERKNS_9gregorian4dateERKNS2_13time_durationE(%"struct.boost::date_time::counted_time_rep"* %this, %"class.boost::gregorian::date"* %d, %"class.boost::posix_time::time_duration"* %time_of_day) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"struct.boost::date_time::counted_time_rep"*, align 4
  %d.addr = alloca %"class.boost::gregorian::date"*, align 4
  %time_of_day.addr = alloca %"class.boost::posix_time::time_duration"*, align 4
  %ref.tmp = alloca %"class.boost::date_time::int_adapter", align 4
  %tmp = alloca %"class.boost::date_time::int_adapter", align 4
  %ref.tmp6 = alloca %"class.boost::date_time::int_adapter.54", align 4
  %ref.tmp8 = alloca %"class.boost::date_time::int_adapter", align 4
  store %"struct.boost::date_time::counted_time_rep"* %this, %"struct.boost::date_time::counted_time_rep"** %this.addr, align 4
  store %"class.boost::gregorian::date"* %d, %"class.boost::gregorian::date"** %d.addr, align 4
  store %"class.boost::posix_time::time_duration"* %time_of_day, %"class.boost::posix_time::time_duration"** %time_of_day.addr, align 4
  %this1 = load %"struct.boost::date_time::counted_time_rep"** %this.addr
  %time_count_ = getelementptr inbounds %"struct.boost::date_time::counted_time_rep"* %this1, i32 0, i32 0
  call void @_ZN5boost9date_time11int_adapterIxEC1Ex(%"class.boost::date_time::int_adapter"* %time_count_, i64 1)
  %0 = load %"class.boost::gregorian::date"** %d.addr, align 4
  %1 = bitcast %"class.boost::gregorian::date"* %0 to %"class.boost::date_time::date"*
  %call = call zeroext i1 @_ZNK5boost9date_time4dateINS_9gregorian4dateENS2_18gregorian_calendarENS2_13date_durationEE11is_infinityEv(%"class.boost::date_time::date"* %1)
  br i1 %call, label %if.then, label %lor.lhs.false

lor.lhs.false:                                    ; preds = %entry
  %2 = load %"class.boost::gregorian::date"** %d.addr, align 4
  %3 = bitcast %"class.boost::gregorian::date"* %2 to %"class.boost::date_time::date"*
  %call2 = call zeroext i1 @_ZNK5boost9date_time4dateINS_9gregorian4dateENS2_18gregorian_calendarENS2_13date_durationEE13is_not_a_dateEv(%"class.boost::date_time::date"* %3)
  br i1 %call2, label %if.then, label %lor.lhs.false3

lor.lhs.false3:                                   ; preds = %lor.lhs.false
  %4 = load %"class.boost::posix_time::time_duration"** %time_of_day.addr, align 4
  %5 = bitcast %"class.boost::posix_time::time_duration"* %4 to %"class.boost::date_time::time_duration"*
  %call4 = call zeroext i1 @_ZNK5boost9date_time13time_durationINS_10posix_time13time_durationENS0_22time_resolution_traitsINS0_37time_resolution_traits_adapted64_implELNS0_16time_resolutionsE5ELx1000000ELt6EiEEE10is_specialEv(%"class.boost::date_time::time_duration"* %5)
  br i1 %call4, label %if.then, label %if.else

if.then:                                          ; preds = %lor.lhs.false3, %lor.lhs.false, %entry
  %time_count_5 = getelementptr inbounds %"struct.boost::date_time::counted_time_rep"* %this1, i32 0, i32 0
  %6 = load %"class.boost::posix_time::time_duration"** %time_of_day.addr, align 4
  %7 = bitcast %"class.boost::posix_time::time_duration"* %6 to %"class.boost::date_time::time_duration"*
  call void @_ZNK5boost9date_time13time_durationINS_10posix_time13time_durationENS0_22time_resolution_traitsINS0_37time_resolution_traits_adapted64_implELNS0_16time_resolutionsE5ELx1000000ELt6EiEEE7get_repEv(%"class.boost::date_time::int_adapter"* sret %tmp, %"class.boost::date_time::time_duration"* %7)
  %8 = load %"class.boost::gregorian::date"** %d.addr, align 4
  %9 = bitcast %"class.boost::gregorian::date"* %8 to %"class.boost::date_time::date"*
  call void @_ZNK5boost9date_time4dateINS_9gregorian4dateENS2_18gregorian_calendarENS2_13date_durationEE9day_countEv(%"class.boost::date_time::int_adapter.54"* sret %ref.tmp6, %"class.boost::date_time::date"* %9)
  call void @_ZNK5boost9date_time11int_adapterIxEplIjEES2_RKNS1_IT_EE(%"class.boost::date_time::int_adapter"* sret %ref.tmp, %"class.boost::date_time::int_adapter"* %tmp, %"class.boost::date_time::int_adapter.54"* %ref.tmp6)
  %10 = bitcast %"class.boost::date_time::int_adapter"* %time_count_5 to i8*
  %11 = bitcast %"class.boost::date_time::int_adapter"* %ref.tmp to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %10, i8* %11, i32 8, i32 4, i1 false)
  br label %if.end

if.else:                                          ; preds = %lor.lhs.false3
  %time_count_7 = getelementptr inbounds %"struct.boost::date_time::counted_time_rep"* %this1, i32 0, i32 0
  %12 = load %"class.boost::gregorian::date"** %d.addr, align 4
  %call9 = call i32 @_ZNK5boost9gregorian4date10day_numberEv(%"class.boost::gregorian::date"* %12)
  %conv = zext i32 %call9 to i64
  %call10 = call i64 @_ZN5boost9date_time16counted_time_repINS_10posix_time33millisec_posix_time_system_configEE16frac_sec_per_dayEv()
  %mul = mul nsw i64 %conv, %call10
  %13 = load %"class.boost::posix_time::time_duration"** %time_of_day.addr, align 4
  %14 = bitcast %"class.boost::posix_time::time_duration"* %13 to %"class.boost::date_time::time_duration"*
  %call11 = call i64 @_ZNK5boost9date_time13time_durationINS_10posix_time13time_durationENS0_22time_resolution_traitsINS0_37time_resolution_traits_adapted64_implELNS0_16time_resolutionsE5ELx1000000ELt6EiEEE5ticksEv(%"class.boost::date_time::time_duration"* %14)
  %add = add nsw i64 %mul, %call11
  call void @_ZN5boost9date_time11int_adapterIxEC1Ex(%"class.boost::date_time::int_adapter"* %ref.tmp8, i64 %add)
  %15 = bitcast %"class.boost::date_time::int_adapter"* %time_count_7 to i8*
  %16 = bitcast %"class.boost::date_time::int_adapter"* %ref.tmp8 to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %15, i8* %16, i32 8, i32 4, i1 false)
  br label %if.end

if.end:                                           ; preds = %if.else, %if.then
  ret void
}

define linkonce_odr zeroext i1 @_ZNK5boost9date_time4dateINS_9gregorian4dateENS2_18gregorian_calendarENS2_13date_durationEE11is_infinityEv(%"class.boost::date_time::date"* %this) align 2 {
entry:
  %this.addr = alloca %"class.boost::date_time::date"*, align 4
  store %"class.boost::date_time::date"* %this, %"class.boost::date_time::date"** %this.addr, align 4
  %this1 = load %"class.boost::date_time::date"** %this.addr
  %days_ = getelementptr inbounds %"class.boost::date_time::date"* %this1, i32 0, i32 0
  %0 = load i32* %days_, align 4
  %call = call zeroext i1 @_ZN5boost9date_time11int_adapterIjE6is_infEj(i32 %0)
  ret i1 %call
}

define linkonce_odr zeroext i1 @_ZNK5boost9date_time4dateINS_9gregorian4dateENS2_18gregorian_calendarENS2_13date_durationEE13is_not_a_dateEv(%"class.boost::date_time::date"* %this) align 2 {
entry:
  %this.addr = alloca %"class.boost::date_time::date"*, align 4
  store %"class.boost::date_time::date"* %this, %"class.boost::date_time::date"** %this.addr, align 4
  %this1 = load %"class.boost::date_time::date"** %this.addr
  %days_ = getelementptr inbounds %"class.boost::date_time::date"* %this1, i32 0, i32 0
  %0 = load i32* %days_, align 4
  %call = call zeroext i1 @_ZN5boost9date_time11int_adapterIjE15is_not_a_numberEj(i32 %0)
  ret i1 %call
}

define linkonce_odr void @_ZNK5boost9date_time11int_adapterIxEplIjEES2_RKNS1_IT_EE(%"class.boost::date_time::int_adapter"* noalias sret %agg.result, %"class.boost::date_time::int_adapter"* %this, %"class.boost::date_time::int_adapter.54"* %rhs) inlinehint align 2 {
entry:
  %this.addr = alloca %"class.boost::date_time::int_adapter"*, align 4
  %rhs.addr = alloca %"class.boost::date_time::int_adapter.54"*, align 4
  store %"class.boost::date_time::int_adapter"* %this, %"class.boost::date_time::int_adapter"** %this.addr, align 4
  store %"class.boost::date_time::int_adapter.54"* %rhs, %"class.boost::date_time::int_adapter.54"** %rhs.addr, align 4
  %this1 = load %"class.boost::date_time::int_adapter"** %this.addr
  %call = call zeroext i1 @_ZNK5boost9date_time11int_adapterIxE10is_specialEv(%"class.boost::date_time::int_adapter"* %this1)
  br i1 %call, label %if.then, label %lor.lhs.false

lor.lhs.false:                                    ; preds = %entry
  %0 = load %"class.boost::date_time::int_adapter.54"** %rhs.addr, align 4
  %call2 = call zeroext i1 @_ZNK5boost9date_time11int_adapterIjE10is_specialEv(%"class.boost::date_time::int_adapter.54"* %0)
  br i1 %call2, label %if.then, label %if.end29

if.then:                                          ; preds = %lor.lhs.false, %entry
  %call3 = call zeroext i1 @_ZNK5boost9date_time11int_adapterIxE6is_nanEv(%"class.boost::date_time::int_adapter"* %this1)
  br i1 %call3, label %if.then6, label %lor.lhs.false4

lor.lhs.false4:                                   ; preds = %if.then
  %1 = load %"class.boost::date_time::int_adapter.54"** %rhs.addr, align 4
  %call5 = call zeroext i1 @_ZNK5boost9date_time11int_adapterIjE6is_nanEv(%"class.boost::date_time::int_adapter.54"* %1)
  br i1 %call5, label %if.then6, label %if.end

if.then6:                                         ; preds = %lor.lhs.false4, %if.then
  call void @_ZN5boost9date_time11int_adapterIxE12not_a_numberEv(%"class.boost::date_time::int_adapter"* sret %agg.result)
  br label %return

if.end:                                           ; preds = %lor.lhs.false4
  %value_ = getelementptr inbounds %"class.boost::date_time::int_adapter"* %this1, i32 0, i32 0
  %2 = load i64* %value_, align 4
  %call7 = call zeroext i1 @_ZN5boost9date_time11int_adapterIxE10is_pos_infEx(i64 %2)
  br i1 %call7, label %land.lhs.true, label %lor.lhs.false10

land.lhs.true:                                    ; preds = %if.end
  %3 = load %"class.boost::date_time::int_adapter.54"** %rhs.addr, align 4
  %4 = load %"class.boost::date_time::int_adapter.54"** %rhs.addr, align 4
  %call8 = call i32 @_ZNK5boost9date_time11int_adapterIjE9as_numberEv(%"class.boost::date_time::int_adapter.54"* %4)
  %call9 = call zeroext i1 @_ZN5boost9date_time11int_adapterIjE10is_neg_infEj(i32 %call8)
  br i1 %call9, label %if.then16, label %lor.lhs.false10

lor.lhs.false10:                                  ; preds = %land.lhs.true, %if.end
  %value_11 = getelementptr inbounds %"class.boost::date_time::int_adapter"* %this1, i32 0, i32 0
  %5 = load i64* %value_11, align 4
  %call12 = call zeroext i1 @_ZN5boost9date_time11int_adapterIxE10is_neg_infEx(i64 %5)
  br i1 %call12, label %land.lhs.true13, label %if.end17

land.lhs.true13:                                  ; preds = %lor.lhs.false10
  %6 = load %"class.boost::date_time::int_adapter.54"** %rhs.addr, align 4
  %7 = load %"class.boost::date_time::int_adapter.54"** %rhs.addr, align 4
  %call14 = call i32 @_ZNK5boost9date_time11int_adapterIjE9as_numberEv(%"class.boost::date_time::int_adapter.54"* %7)
  %call15 = call zeroext i1 @_ZN5boost9date_time11int_adapterIjE10is_pos_infEj(i32 %call14)
  br i1 %call15, label %if.then16, label %if.end17

if.then16:                                        ; preds = %land.lhs.true13, %land.lhs.true
  call void @_ZN5boost9date_time11int_adapterIxE12not_a_numberEv(%"class.boost::date_time::int_adapter"* sret %agg.result)
  br label %return

if.end17:                                         ; preds = %land.lhs.true13, %lor.lhs.false10
  %call18 = call zeroext i1 @_ZNK5boost9date_time11int_adapterIxE11is_infinityEv(%"class.boost::date_time::int_adapter"* %this1)
  br i1 %call18, label %if.then19, label %if.end20

if.then19:                                        ; preds = %if.end17
  %8 = bitcast %"class.boost::date_time::int_adapter"* %agg.result to i8*
  %9 = bitcast %"class.boost::date_time::int_adapter"* %this1 to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %8, i8* %9, i32 8, i32 4, i1 false)
  br label %return

if.end20:                                         ; preds = %if.end17
  %10 = load %"class.boost::date_time::int_adapter.54"** %rhs.addr, align 4
  %11 = load %"class.boost::date_time::int_adapter.54"** %rhs.addr, align 4
  %call21 = call i32 @_ZNK5boost9date_time11int_adapterIjE9as_numberEv(%"class.boost::date_time::int_adapter.54"* %11)
  %call22 = call zeroext i1 @_ZN5boost9date_time11int_adapterIjE10is_pos_infEj(i32 %call21)
  br i1 %call22, label %if.then23, label %if.end24

if.then23:                                        ; preds = %if.end20
  call void @_ZN5boost9date_time11int_adapterIxE12pos_infinityEv(%"class.boost::date_time::int_adapter"* sret %agg.result)
  br label %return

if.end24:                                         ; preds = %if.end20
  %12 = load %"class.boost::date_time::int_adapter.54"** %rhs.addr, align 4
  %13 = load %"class.boost::date_time::int_adapter.54"** %rhs.addr, align 4
  %call25 = call i32 @_ZNK5boost9date_time11int_adapterIjE9as_numberEv(%"class.boost::date_time::int_adapter.54"* %13)
  %call26 = call zeroext i1 @_ZN5boost9date_time11int_adapterIjE10is_neg_infEj(i32 %call25)
  br i1 %call26, label %if.then27, label %if.end28

if.then27:                                        ; preds = %if.end24
  call void @_ZN5boost9date_time11int_adapterIxE12neg_infinityEv(%"class.boost::date_time::int_adapter"* sret %agg.result)
  br label %return

if.end28:                                         ; preds = %if.end24
  br label %if.end29

if.end29:                                         ; preds = %if.end28, %lor.lhs.false
  %value_30 = getelementptr inbounds %"class.boost::date_time::int_adapter"* %this1, i32 0, i32 0
  %14 = load i64* %value_30, align 4
  %15 = load %"class.boost::date_time::int_adapter.54"** %rhs.addr, align 4
  %call31 = call i32 @_ZNK5boost9date_time11int_adapterIjE9as_numberEv(%"class.boost::date_time::int_adapter.54"* %15)
  %conv = zext i32 %call31 to i64
  %add = add nsw i64 %14, %conv
  call void @_ZN5boost9date_time11int_adapterIxEC1Ex(%"class.boost::date_time::int_adapter"* %agg.result, i64 %add)
  br label %return

return:                                           ; preds = %if.end29, %if.then27, %if.then23, %if.then19, %if.then16, %if.then6
  ret void
}

define linkonce_odr void @_ZNK5boost9date_time4dateINS_9gregorian4dateENS2_18gregorian_calendarENS2_13date_durationEE9day_countEv(%"class.boost::date_time::int_adapter.54"* noalias sret %agg.result, %"class.boost::date_time::date"* %this) align 2 {
entry:
  %this.addr = alloca %"class.boost::date_time::date"*, align 4
  store %"class.boost::date_time::date"* %this, %"class.boost::date_time::date"** %this.addr, align 4
  %this1 = load %"class.boost::date_time::date"** %this.addr
  %days_ = getelementptr inbounds %"class.boost::date_time::date"* %this1, i32 0, i32 0
  %0 = load i32* %days_, align 4
  call void @_ZN5boost9date_time11int_adapterIjEC1Ej(%"class.boost::date_time::int_adapter.54"* %agg.result, i32 %0)
  ret void
}

define linkonce_odr i32 @_ZNK5boost9gregorian4date10day_numberEv(%"class.boost::gregorian::date"* %this) nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::gregorian::date"*, align 4
  store %"class.boost::gregorian::date"* %this, %"class.boost::gregorian::date"** %this.addr, align 4
  %this1 = load %"class.boost::gregorian::date"** %this.addr
  %0 = bitcast %"class.boost::gregorian::date"* %this1 to %"class.boost::date_time::date"*
  %days_ = getelementptr inbounds %"class.boost::date_time::date"* %0, i32 0, i32 0
  %1 = load i32* %days_, align 4
  ret i32 %1
}

define linkonce_odr i64 @_ZN5boost9date_time16counted_time_repINS_10posix_time33millisec_posix_time_system_configEE16frac_sec_per_dayEv() nounwind align 2 {
entry:
  %seconds_per_day = alloca i64, align 8
  %fractional_sec_per_sec = alloca i64, align 8
  store i64 86400, i64* %seconds_per_day, align 8
  %call = call i64 @_ZN5boost9date_time22time_resolution_traitsINS0_37time_resolution_traits_adapted64_implELNS0_16time_resolutionsE5ELx1000000ELt6EiE10res_adjustEv()
  store i64 %call, i64* %fractional_sec_per_sec, align 8
  %0 = load i64* %seconds_per_day, align 8
  %1 = load i64* %fractional_sec_per_sec, align 8
  %mul = mul nsw i64 %0, %1
  ret i64 %mul
}

define linkonce_odr void @_ZN5boost9date_time11int_adapterIjEC1Ej(%"class.boost::date_time::int_adapter.54"* %this, i32 %v) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::date_time::int_adapter.54"*, align 4
  %v.addr = alloca i32, align 4
  store %"class.boost::date_time::int_adapter.54"* %this, %"class.boost::date_time::int_adapter.54"** %this.addr, align 4
  store i32 %v, i32* %v.addr, align 4
  %this1 = load %"class.boost::date_time::int_adapter.54"** %this.addr
  %0 = load i32* %v.addr, align 4
  call void @_ZN5boost9date_time11int_adapterIjEC2Ej(%"class.boost::date_time::int_adapter.54"* %this1, i32 %0)
  ret void
}

define linkonce_odr void @_ZN5boost9date_time11int_adapterIjEC2Ej(%"class.boost::date_time::int_adapter.54"* %this, i32 %v) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::date_time::int_adapter.54"*, align 4
  %v.addr = alloca i32, align 4
  store %"class.boost::date_time::int_adapter.54"* %this, %"class.boost::date_time::int_adapter.54"** %this.addr, align 4
  store i32 %v, i32* %v.addr, align 4
  %this1 = load %"class.boost::date_time::int_adapter.54"** %this.addr
  %value_ = getelementptr inbounds %"class.boost::date_time::int_adapter.54"* %this1, i32 0, i32 0
  %0 = load i32* %v.addr, align 4
  store i32 %0, i32* %value_, align 4
  ret void
}

define linkonce_odr zeroext i1 @_ZNK5boost9date_time11int_adapterIjE10is_specialEv(%"class.boost::date_time::int_adapter.54"* %this) align 2 {
entry:
  %this.addr = alloca %"class.boost::date_time::int_adapter.54"*, align 4
  store %"class.boost::date_time::int_adapter.54"* %this, %"class.boost::date_time::int_adapter.54"** %this.addr, align 4
  %this1 = load %"class.boost::date_time::int_adapter.54"** %this.addr
  %call = call zeroext i1 @_ZNK5boost9date_time11int_adapterIjE11is_infinityEv(%"class.boost::date_time::int_adapter.54"* %this1)
  br i1 %call, label %lor.end, label %lor.rhs

lor.rhs:                                          ; preds = %entry
  %call2 = call zeroext i1 @_ZNK5boost9date_time11int_adapterIjE6is_nanEv(%"class.boost::date_time::int_adapter.54"* %this1)
  br label %lor.end

lor.end:                                          ; preds = %lor.rhs, %entry
  %0 = phi i1 [ true, %entry ], [ %call2, %lor.rhs ]
  ret i1 %0
}

define linkonce_odr zeroext i1 @_ZNK5boost9date_time11int_adapterIjE6is_nanEv(%"class.boost::date_time::int_adapter.54"* %this) align 2 {
entry:
  %this.addr = alloca %"class.boost::date_time::int_adapter.54"*, align 4
  %tmp = alloca %"class.boost::date_time::int_adapter.54", align 4
  store %"class.boost::date_time::int_adapter.54"* %this, %"class.boost::date_time::int_adapter.54"** %this.addr, align 4
  %this1 = load %"class.boost::date_time::int_adapter.54"** %this.addr
  %value_ = getelementptr inbounds %"class.boost::date_time::int_adapter.54"* %this1, i32 0, i32 0
  %0 = load i32* %value_, align 4
  call void @_ZN5boost9date_time11int_adapterIjE12not_a_numberEv(%"class.boost::date_time::int_adapter.54"* sret %tmp)
  %call = call i32 @_ZNK5boost9date_time11int_adapterIjE9as_numberEv(%"class.boost::date_time::int_adapter.54"* %tmp)
  %cmp = icmp eq i32 %0, %call
  ret i1 %cmp
}

define linkonce_odr zeroext i1 @_ZN5boost9date_time11int_adapterIjE10is_neg_infEj(i32 %v) align 2 {
entry:
  %v.addr = alloca i32, align 4
  %tmp = alloca %"class.boost::date_time::int_adapter.54", align 4
  store i32 %v, i32* %v.addr, align 4
  %0 = load i32* %v.addr, align 4
  call void @_ZN5boost9date_time11int_adapterIjE12neg_infinityEv(%"class.boost::date_time::int_adapter.54"* sret %tmp)
  %call = call i32 @_ZNK5boost9date_time11int_adapterIjE9as_numberEv(%"class.boost::date_time::int_adapter.54"* %tmp)
  %cmp = icmp eq i32 %0, %call
  ret i1 %cmp
}

define linkonce_odr i32 @_ZNK5boost9date_time11int_adapterIjE9as_numberEv(%"class.boost::date_time::int_adapter.54"* %this) nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::date_time::int_adapter.54"*, align 4
  store %"class.boost::date_time::int_adapter.54"* %this, %"class.boost::date_time::int_adapter.54"** %this.addr, align 4
  %this1 = load %"class.boost::date_time::int_adapter.54"** %this.addr
  %value_ = getelementptr inbounds %"class.boost::date_time::int_adapter.54"* %this1, i32 0, i32 0
  %0 = load i32* %value_, align 4
  ret i32 %0
}

define linkonce_odr zeroext i1 @_ZN5boost9date_time11int_adapterIjE10is_pos_infEj(i32 %v) align 2 {
entry:
  %v.addr = alloca i32, align 4
  %tmp = alloca %"class.boost::date_time::int_adapter.54", align 4
  store i32 %v, i32* %v.addr, align 4
  %0 = load i32* %v.addr, align 4
  call void @_ZN5boost9date_time11int_adapterIjE12pos_infinityEv(%"class.boost::date_time::int_adapter.54"* sret %tmp)
  %call = call i32 @_ZNK5boost9date_time11int_adapterIjE9as_numberEv(%"class.boost::date_time::int_adapter.54"* %tmp)
  %cmp = icmp eq i32 %0, %call
  ret i1 %cmp
}

define linkonce_odr void @_ZN5boost9date_time11int_adapterIjE12pos_infinityEv(%"class.boost::date_time::int_adapter.54"* noalias sret %agg.result) align 2 {
entry:
  %call = call i32 @_ZNSt14numeric_limitsIjE3maxEv() nounwind
  call void @_ZN5boost9date_time11int_adapterIjEC1Ej(%"class.boost::date_time::int_adapter.54"* %agg.result, i32 %call)
  ret void
}

define linkonce_odr i32 @_ZNSt14numeric_limitsIjE3maxEv() nounwind align 2 {
entry:
  ret i32 -1
}

define linkonce_odr void @_ZN5boost9date_time11int_adapterIjE12neg_infinityEv(%"class.boost::date_time::int_adapter.54"* noalias sret %agg.result) align 2 {
entry:
  %call = call i32 @_ZNSt14numeric_limitsIjE3minEv() nounwind
  call void @_ZN5boost9date_time11int_adapterIjEC1Ej(%"class.boost::date_time::int_adapter.54"* %agg.result, i32 %call)
  ret void
}

define linkonce_odr i32 @_ZNSt14numeric_limitsIjE3minEv() nounwind align 2 {
entry:
  ret i32 0
}

define linkonce_odr void @_ZN5boost9date_time11int_adapterIjE12not_a_numberEv(%"class.boost::date_time::int_adapter.54"* noalias sret %agg.result) align 2 {
entry:
  %call = call i32 @_ZNSt14numeric_limitsIjE3maxEv() nounwind
  %sub = sub i32 %call, 1
  call void @_ZN5boost9date_time11int_adapterIjEC1Ej(%"class.boost::date_time::int_adapter.54"* %agg.result, i32 %sub)
  ret void
}

define linkonce_odr zeroext i1 @_ZNK5boost9date_time11int_adapterIjE11is_infinityEv(%"class.boost::date_time::int_adapter.54"* %this) align 2 {
entry:
  %this.addr = alloca %"class.boost::date_time::int_adapter.54"*, align 4
  %tmp = alloca %"class.boost::date_time::int_adapter.54", align 4
  %tmp3 = alloca %"class.boost::date_time::int_adapter.54", align 4
  store %"class.boost::date_time::int_adapter.54"* %this, %"class.boost::date_time::int_adapter.54"** %this.addr, align 4
  %this1 = load %"class.boost::date_time::int_adapter.54"** %this.addr
  %value_ = getelementptr inbounds %"class.boost::date_time::int_adapter.54"* %this1, i32 0, i32 0
  %0 = load i32* %value_, align 4
  call void @_ZN5boost9date_time11int_adapterIjE12neg_infinityEv(%"class.boost::date_time::int_adapter.54"* sret %tmp)
  %call = call i32 @_ZNK5boost9date_time11int_adapterIjE9as_numberEv(%"class.boost::date_time::int_adapter.54"* %tmp)
  %cmp = icmp eq i32 %0, %call
  br i1 %cmp, label %lor.end, label %lor.rhs

lor.rhs:                                          ; preds = %entry
  %value_2 = getelementptr inbounds %"class.boost::date_time::int_adapter.54"* %this1, i32 0, i32 0
  %1 = load i32* %value_2, align 4
  call void @_ZN5boost9date_time11int_adapterIjE12pos_infinityEv(%"class.boost::date_time::int_adapter.54"* sret %tmp3)
  %call4 = call i32 @_ZNK5boost9date_time11int_adapterIjE9as_numberEv(%"class.boost::date_time::int_adapter.54"* %tmp3)
  %cmp5 = icmp eq i32 %1, %call4
  br label %lor.end

lor.end:                                          ; preds = %lor.rhs, %entry
  %2 = phi i1 [ true, %entry ], [ %cmp5, %lor.rhs ]
  ret i1 %2
}

define linkonce_odr zeroext i1 @_ZN5boost9date_time11int_adapterIjE15is_not_a_numberEj(i32 %v) align 2 {
entry:
  %v.addr = alloca i32, align 4
  %tmp = alloca %"class.boost::date_time::int_adapter.54", align 4
  store i32 %v, i32* %v.addr, align 4
  %0 = load i32* %v.addr, align 4
  call void @_ZN5boost9date_time11int_adapterIjE12not_a_numberEv(%"class.boost::date_time::int_adapter.54"* sret %tmp)
  %call = call i32 @_ZNK5boost9date_time11int_adapterIjE9as_numberEv(%"class.boost::date_time::int_adapter.54"* %tmp)
  %cmp = icmp eq i32 %0, %call
  ret i1 %cmp
}

define linkonce_odr zeroext i1 @_ZN5boost9date_time11int_adapterIjE6is_infEj(i32 %v) align 2 {
entry:
  %v.addr = alloca i32, align 4
  %tmp = alloca %"class.boost::date_time::int_adapter.54", align 4
  %tmp1 = alloca %"class.boost::date_time::int_adapter.54", align 4
  store i32 %v, i32* %v.addr, align 4
  %0 = load i32* %v.addr, align 4
  call void @_ZN5boost9date_time11int_adapterIjE12neg_infinityEv(%"class.boost::date_time::int_adapter.54"* sret %tmp)
  %call = call i32 @_ZNK5boost9date_time11int_adapterIjE9as_numberEv(%"class.boost::date_time::int_adapter.54"* %tmp)
  %cmp = icmp eq i32 %0, %call
  br i1 %cmp, label %lor.end, label %lor.rhs

lor.rhs:                                          ; preds = %entry
  %1 = load i32* %v.addr, align 4
  call void @_ZN5boost9date_time11int_adapterIjE12pos_infinityEv(%"class.boost::date_time::int_adapter.54"* sret %tmp1)
  %call2 = call i32 @_ZNK5boost9date_time11int_adapterIjE9as_numberEv(%"class.boost::date_time::int_adapter.54"* %tmp1)
  %cmp3 = icmp eq i32 %1, %call2
  br label %lor.end

lor.end:                                          ; preds = %lor.rhs, %entry
  %2 = phi i1 [ true, %entry ], [ %cmp3, %lor.rhs ]
  ret i1 %2
}

declare void @_ZN5boost11this_thread5sleepERKNS_10posix_time5ptimeE(%"class.boost::posix_time::ptime"*)

define linkonce_odr void @_ZN5boost9get_xtimeERKNS_10posix_time5ptimeE(%"struct.boost::xtime"* noalias sret %agg.result, %"class.boost::posix_time::ptime"* %abs_time) inlinehint {
entry:
  %abs_time.addr = alloca %"class.boost::posix_time::ptime"*, align 4
  %time_since_epoch = alloca %"class.boost::posix_time::time_duration", align 4
  %ref.tmp = alloca %"class.boost::posix_time::ptime", align 4
  store %"class.boost::posix_time::ptime"* %abs_time, %"class.boost::posix_time::ptime"** %abs_time.addr, align 4
  %0 = load %"class.boost::posix_time::ptime"** %abs_time.addr, align 4
  %1 = bitcast %"class.boost::posix_time::ptime"* %0 to %"class.boost::date_time::base_time"*
  call void @_ZN5boost10posix_time11from_time_tEl(%"class.boost::posix_time::ptime"* sret %ref.tmp, i32 0)
  call void @_ZNK5boost9date_time9base_timeINS_10posix_time5ptimeENS0_19counted_time_systemINS0_16counted_time_repINS2_33millisec_posix_time_system_configEEEEEEmiERKS3_(%"class.boost::posix_time::time_duration"* sret %time_since_epoch, %"class.boost::date_time::base_time"* %1, %"class.boost::posix_time::ptime"* %ref.tmp)
  %2 = bitcast %"class.boost::posix_time::time_duration"* %time_since_epoch to %"class.boost::date_time::time_duration"*
  %call = call i32 @_ZNK5boost9date_time13time_durationINS_10posix_time13time_durationENS0_22time_resolution_traitsINS0_37time_resolution_traits_adapted64_implELNS0_16time_resolutionsE5ELx1000000ELt6EiEEE13total_secondsEv(%"class.boost::date_time::time_duration"* %2)
  %conv = sext i32 %call to i64
  %sec = getelementptr inbounds %"struct.boost::xtime"* %agg.result, i32 0, i32 0
  store i64 %conv, i64* %sec, align 4
  %3 = bitcast %"class.boost::posix_time::time_duration"* %time_since_epoch to %"class.boost::date_time::time_duration"*
  %call1 = call i64 @_ZNK5boost9date_time13time_durationINS_10posix_time13time_durationENS0_22time_resolution_traitsINS0_37time_resolution_traits_adapted64_implELNS0_16time_resolutionsE5ELx1000000ELt6EiEEE18fractional_secondsEv(%"class.boost::date_time::time_duration"* %3)
  %call2 = call i64 @_ZN5boost9date_time13time_durationINS_10posix_time13time_durationENS0_22time_resolution_traitsINS0_37time_resolution_traits_adapted64_implELNS0_16time_resolutionsE5ELx1000000ELt6EiEEE16ticks_per_secondEv()
  %div = sdiv i64 1000000000, %call2
  %mul = mul nsw i64 %call1, %div
  %conv3 = trunc i64 %mul to i32
  %nsec = getelementptr inbounds %"struct.boost::xtime"* %agg.result, i32 0, i32 1
  store i32 %conv3, i32* %nsec, align 4
  ret void
}

define linkonce_odr void @_ZN5boost15get_system_timeEv(%"class.boost::posix_time::ptime"* noalias sret %agg.result) inlinehint {
entry:
  call void @_ZN5boost9date_time14microsec_clockINS_10posix_time5ptimeEE14universal_timeEv(%"class.boost::posix_time::ptime"* sret %agg.result)
  ret void
}

define linkonce_odr void @_ZN5boost9date_time14microsec_clockINS_10posix_time5ptimeEE14universal_timeEv(%"class.boost::posix_time::ptime"* noalias sret %agg.result) align 2 {
entry:
  call void @_ZN5boost9date_time14microsec_clockINS_10posix_time5ptimeEE11create_timeEPFP2tmPKlS6_E(%"class.boost::posix_time::ptime"* sret %agg.result, %struct.tm* (i32*, %struct.tm*)* @_ZN5boost9date_time6c_time6gmtimeEPKlP2tm)
  ret void
}

define linkonce_odr void @_ZN5boost9date_time14microsec_clockINS_10posix_time5ptimeEE11create_timeEPFP2tmPKlS6_E(%"class.boost::posix_time::ptime"* noalias sret %agg.result, %struct.tm* (i32*, %struct.tm*)* %converter) align 2 {
entry:
  %converter.addr = alloca %struct.tm* (i32*, %struct.tm*)*, align 4
  %tv = alloca %struct.timeval, align 4
  %t = alloca i32, align 4
  %sub_sec = alloca i32, align 4
  %curr = alloca %struct.tm, align 4
  %curr_ptr = alloca %struct.tm*, align 4
  %d = alloca %"class.boost::gregorian::date", align 4
  %agg.tmp = alloca %"class.boost::gregorian::greg_year", align 4
  %agg.tmp2 = alloca %"class.boost::gregorian::greg_month", align 4
  %agg.tmp5 = alloca %"class.boost::gregorian::greg_day", align 4
  %adjust = alloca i32, align 4
  %td = alloca %"class.boost::posix_time::time_duration", align 4
  %agg.tmp10 = alloca %"class.boost::gregorian::date", align 4
  %agg.tmp11 = alloca %"class.boost::posix_time::time_duration", align 4
  store %struct.tm* (i32*, %struct.tm*)* %converter, %struct.tm* (i32*, %struct.tm*)** %converter.addr, align 4
  %call = call i32 @gettimeofday(%struct.timeval* %tv, %struct.timezone* null) nounwind
  %tv_sec = getelementptr inbounds %struct.timeval* %tv, i32 0, i32 0
  %0 = load i32* %tv_sec, align 4
  store i32 %0, i32* %t, align 4
  %tv_usec = getelementptr inbounds %struct.timeval* %tv, i32 0, i32 1
  %1 = load i32* %tv_usec, align 4
  store i32 %1, i32* %sub_sec, align 4
  %2 = load %struct.tm* (i32*, %struct.tm*)** %converter.addr, align 4
  %call1 = call %struct.tm* %2(i32* %t, %struct.tm* %curr)
  store %struct.tm* %call1, %struct.tm** %curr_ptr, align 4
  %3 = load %struct.tm** %curr_ptr, align 4
  %tm_year = getelementptr inbounds %struct.tm* %3, i32 0, i32 5
  %4 = load i32* %tm_year, align 4
  %add = add nsw i32 %4, 1900
  %conv = trunc i32 %add to i16
  call void @_ZN5boost9gregorian9greg_yearC1Et(%"class.boost::gregorian::greg_year"* %agg.tmp, i16 zeroext %conv)
  %5 = load %struct.tm** %curr_ptr, align 4
  %tm_mon = getelementptr inbounds %struct.tm* %5, i32 0, i32 4
  %6 = load i32* %tm_mon, align 4
  %add3 = add nsw i32 %6, 1
  %conv4 = trunc i32 %add3 to i16
  call void @_ZN5boost9gregorian10greg_monthC1Et(%"class.boost::gregorian::greg_month"* %agg.tmp2, i16 zeroext %conv4)
  %7 = load %struct.tm** %curr_ptr, align 4
  %tm_mday = getelementptr inbounds %struct.tm* %7, i32 0, i32 3
  %8 = load i32* %tm_mday, align 4
  %conv6 = trunc i32 %8 to i16
  call void @_ZN5boost9gregorian8greg_dayC1Et(%"class.boost::gregorian::greg_day"* %agg.tmp5, i16 zeroext %conv6)
  call void @_ZN5boost9gregorian4dateC1ENS0_9greg_yearENS0_10greg_monthENS0_8greg_dayE(%"class.boost::gregorian::date"* %d, %"class.boost::gregorian::greg_year"* byval align 4 %agg.tmp, %"class.boost::gregorian::greg_month"* byval align 4 %agg.tmp2, %"class.boost::gregorian::greg_day"* byval align 4 %agg.tmp5)
  %call7 = call i64 @_ZN5boost9date_time22time_resolution_traitsINS0_37time_resolution_traits_adapted64_implELNS0_16time_resolutionsE5ELx1000000ELt6EiE10res_adjustEv()
  %div = sdiv i64 %call7, 1000000
  %conv8 = trunc i64 %div to i32
  store i32 %conv8, i32* %adjust, align 4
  %9 = load %struct.tm** %curr_ptr, align 4
  %tm_hour = getelementptr inbounds %struct.tm* %9, i32 0, i32 2
  %10 = load i32* %tm_hour, align 4
  %11 = load %struct.tm** %curr_ptr, align 4
  %tm_min = getelementptr inbounds %struct.tm* %11, i32 0, i32 1
  %12 = load i32* %tm_min, align 4
  %13 = load %struct.tm** %curr_ptr, align 4
  %tm_sec = getelementptr inbounds %struct.tm* %13, i32 0, i32 0
  %14 = load i32* %tm_sec, align 4
  %15 = load i32* %sub_sec, align 4
  %16 = load i32* %adjust, align 4
  %mul = mul i32 %15, %16
  %conv9 = zext i32 %mul to i64
  call void @_ZN5boost10posix_time13time_durationC1Eiiix(%"class.boost::posix_time::time_duration"* %td, i32 %10, i32 %12, i32 %14, i64 %conv9)
  %17 = bitcast %"class.boost::gregorian::date"* %agg.tmp10 to i8*
  %18 = bitcast %"class.boost::gregorian::date"* %d to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %17, i8* %18, i32 4, i32 4, i1 false)
  call void @_ZN5boost10posix_time13time_durationC1ERKS1_(%"class.boost::posix_time::time_duration"* %agg.tmp11, %"class.boost::posix_time::time_duration"* %td)
  call void @_ZN5boost10posix_time5ptimeC1ENS_9gregorian4dateENS0_13time_durationE(%"class.boost::posix_time::ptime"* %agg.result, %"class.boost::gregorian::date"* byval align 4 %agg.tmp10, %"class.boost::posix_time::time_duration"* %agg.tmp11)
  ret void
}

define linkonce_odr %struct.tm* @_ZN5boost9date_time6c_time6gmtimeEPKlP2tm(i32* %t, %struct.tm* %result) inlinehint align 2 {
entry:
  %t.addr = alloca i32*, align 4
  %result.addr = alloca %struct.tm*, align 4
  %ref.tmp = alloca %"class.std::runtime_error", align 4
  %ref.tmp1 = alloca %"class.std::basic_string", align 4
  %ref.tmp2 = alloca %"class.std::allocator", align 1
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  store i32* %t, i32** %t.addr, align 4
  store %struct.tm* %result, %struct.tm** %result.addr, align 4
  %0 = load i32** %t.addr, align 4
  %1 = load %struct.tm** %result.addr, align 4
  %call = call %struct.tm* @gmtime_r(i32* %0, %struct.tm* %1) nounwind
  store %struct.tm* %call, %struct.tm** %result.addr, align 4
  %2 = load %struct.tm** %result.addr, align 4
  %tobool = icmp ne %struct.tm* %2, null
  br i1 %tobool, label %if.end, label %if.then

if.then:                                          ; preds = %entry
  call void @_ZNSaIcEC1Ev(%"class.std::allocator"* %ref.tmp2) nounwind
  invoke void @_ZNSsC1EPKcRKSaIcE(%"class.std::basic_string"* %ref.tmp1, i8* getelementptr inbounds ([44 x i8]* @.str43, i32 0, i32 0), %"class.std::allocator"* %ref.tmp2)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %if.then
  invoke void @_ZNSt13runtime_errorC1ERKSs(%"class.std::runtime_error"* %ref.tmp, %"class.std::basic_string"* %ref.tmp1)
          to label %invoke.cont4 unwind label %lpad3

invoke.cont4:                                     ; preds = %invoke.cont
  invoke void @_ZN5boost15throw_exceptionISt13runtime_errorEEvRKT_(%"class.std::runtime_error"* %ref.tmp) noreturn
          to label %invoke.cont6 unwind label %lpad5

invoke.cont6:                                     ; preds = %invoke.cont4
  unreachable

lpad:                                             ; preds = %12, %if.then
  %3 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %4 = extractvalue { i8*, i32 } %3, 0
  store i8* %4, i8** %exn.slot
  %5 = extractvalue { i8*, i32 } %3, 1
  store i32 %5, i32* %ehselector.slot
  br label %ehcleanup9

lpad3:                                            ; preds = %invoke.cont
  %6 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %7 = extractvalue { i8*, i32 } %6, 0
  store i8* %7, i8** %exn.slot
  %8 = extractvalue { i8*, i32 } %6, 1
  store i32 %8, i32* %ehselector.slot
  br label %ehcleanup

lpad5:                                            ; preds = %invoke.cont4
  %9 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %10 = extractvalue { i8*, i32 } %9, 0
  store i8* %10, i8** %exn.slot
  %11 = extractvalue { i8*, i32 } %9, 1
  store i32 %11, i32* %ehselector.slot
  call void @_ZNSt13runtime_errorD1Ev(%"class.std::runtime_error"* %ref.tmp) nounwind
  br label %ehcleanup
                                                  ; No predecessors!
  call void @_ZNSt13runtime_errorD1Ev(%"class.std::runtime_error"* %ref.tmp) nounwind
  invoke void @_ZNSsD1Ev(%"class.std::basic_string"* %ref.tmp1)
          to label %invoke.cont7 unwind label %lpad

invoke.cont7:                                     ; preds = %12
  call void @_ZNSaIcED1Ev(%"class.std::allocator"* %ref.tmp2) nounwind
  br label %if.end

ehcleanup:                                        ; preds = %lpad5, %lpad3
  invoke void @_ZNSsD1Ev(%"class.std::basic_string"* %ref.tmp1)
          to label %invoke.cont8 unwind label %terminate.lpad

invoke.cont8:                                     ; preds = %ehcleanup
  br label %ehcleanup9

ehcleanup9:                                       ; preds = %invoke.cont8, %lpad
  call void @_ZNSaIcED1Ev(%"class.std::allocator"* %ref.tmp2) nounwind
  br label %eh.resume

if.end:                                           ; preds = %invoke.cont7, %entry
  %13 = load %struct.tm** %result.addr, align 4
  ret %struct.tm* %13

eh.resume:                                        ; preds = %ehcleanup9
  %exn = load i8** %exn.slot
  %sel = load i32* %ehselector.slot
  %lpad.val = insertvalue { i8*, i32 } undef, i8* %exn, 0
  %lpad.val10 = insertvalue { i8*, i32 } %lpad.val, i32 %sel, 1
  resume { i8*, i32 } %lpad.val10

terminate.lpad:                                   ; preds = %ehcleanup
  %14 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          catch i8* null
  call void @_ZSt9terminatev() noreturn nounwind
  unreachable
}

declare %struct.tm* @gmtime_r(i32*, %struct.tm*) nounwind

define linkonce_odr void @_ZN5boost15throw_exceptionISt13runtime_errorEEvRKT_(%"class.std::runtime_error"* %e) noreturn inlinehint {
entry:
  %e.addr = alloca %"class.std::runtime_error"*, align 4
  %ref.tmp = alloca %"struct.boost::exception_detail::error_info_injector.56", align 4
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  %cleanup.isactive = alloca i1
  store %"class.std::runtime_error"* %e, %"class.std::runtime_error"** %e.addr, align 4
  %0 = load %"class.std::runtime_error"** %e.addr, align 4
  %1 = bitcast %"class.std::runtime_error"* %0 to %"class.std::exception"*
  call void @_ZN5boost36throw_exception_assert_compatibilityERKSt9exception(%"class.std::exception"* %1)
  %exception = call i8* @__cxa_allocate_exception(i32 32) nounwind
  store i1 true, i1* %cleanup.isactive
  %2 = bitcast i8* %exception to %"class.boost::exception_detail::clone_impl.55"*
  %3 = load %"class.std::runtime_error"** %e.addr, align 4
  invoke void @_ZN5boost17enable_error_infoISt13runtime_errorEENS_16exception_detail29enable_error_info_return_typeIT_E4typeERKS4_(%"struct.boost::exception_detail::error_info_injector.56"* sret %ref.tmp, %"class.std::runtime_error"* %3)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %entry
  invoke void @_ZN5boost24enable_current_exceptionINS_16exception_detail19error_info_injectorISt13runtime_errorEEEENS1_10clone_implIT_EERKS6_(%"class.boost::exception_detail::clone_impl.55"* sret %2, %"struct.boost::exception_detail::error_info_injector.56"* %ref.tmp)
          to label %invoke.cont2 unwind label %lpad1

invoke.cont2:                                     ; preds = %invoke.cont
  store i1 false, i1* %cleanup.isactive
  invoke void @__cxa_throw(i8* %exception, i8* bitcast ({ i8*, i8*, i32, i32, i8*, i32, i8*, i32 }* @_ZTIN5boost16exception_detail10clone_implINS0_19error_info_injectorISt13runtime_errorEEEE to i8*), i8* bitcast (void (%"class.boost::exception_detail::clone_impl.55"*)* @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorISt13runtime_errorEEED1Ev to i8*)) noreturn
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
  call void @_ZN5boost16exception_detail19error_info_injectorISt13runtime_errorED1Ev(%"struct.boost::exception_detail::error_info_injector.56"* %ref.tmp) nounwind
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

declare void @_ZNSt13runtime_errorC1ERKSs(%"class.std::runtime_error"*, %"class.std::basic_string"*)

declare void @_ZNSt13runtime_errorD1Ev(%"class.std::runtime_error"*) nounwind

define linkonce_odr void @_ZN5boost24enable_current_exceptionINS_16exception_detail19error_info_injectorISt13runtime_errorEEEENS1_10clone_implIT_EERKS6_(%"class.boost::exception_detail::clone_impl.55"* noalias sret %agg.result, %"struct.boost::exception_detail::error_info_injector.56"* %x) inlinehint {
entry:
  %x.addr = alloca %"struct.boost::exception_detail::error_info_injector.56"*, align 4
  store %"struct.boost::exception_detail::error_info_injector.56"* %x, %"struct.boost::exception_detail::error_info_injector.56"** %x.addr, align 4
  %0 = load %"struct.boost::exception_detail::error_info_injector.56"** %x.addr, align 4
  call void @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorISt13runtime_errorEEEC1ERKS4_(%"class.boost::exception_detail::clone_impl.55"* %agg.result, %"struct.boost::exception_detail::error_info_injector.56"* %0)
  ret void
}

define linkonce_odr void @_ZN5boost17enable_error_infoISt13runtime_errorEENS_16exception_detail29enable_error_info_return_typeIT_E4typeERKS4_(%"struct.boost::exception_detail::error_info_injector.56"* noalias sret %agg.result, %"class.std::runtime_error"* %x) inlinehint {
entry:
  %x.addr = alloca %"class.std::runtime_error"*, align 4
  store %"class.std::runtime_error"* %x, %"class.std::runtime_error"** %x.addr, align 4
  %0 = load %"class.std::runtime_error"** %x.addr, align 4
  call void @_ZN5boost16exception_detail19error_info_injectorISt13runtime_errorEC1ERKS2_(%"struct.boost::exception_detail::error_info_injector.56"* %agg.result, %"class.std::runtime_error"* %0)
  ret void
}

define linkonce_odr void @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorISt13runtime_errorEEED1Ev(%"class.boost::exception_detail::clone_impl.55"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::exception_detail::clone_impl.55"*, align 4
  store %"class.boost::exception_detail::clone_impl.55"* %this, %"class.boost::exception_detail::clone_impl.55"** %this.addr, align 4
  %this1 = load %"class.boost::exception_detail::clone_impl.55"** %this.addr
  call void @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorISt13runtime_errorEEED2Ev(%"class.boost::exception_detail::clone_impl.55"* %this1, i8** getelementptr inbounds ([2 x i8*]* @_ZTTN5boost16exception_detail10clone_implINS0_19error_info_injectorISt13runtime_errorEEEE, i64 0, i64 0)) nounwind
  %0 = bitcast %"class.boost::exception_detail::clone_impl.55"* %this1 to i8*
  %1 = getelementptr inbounds i8* %0, i64 28
  %2 = bitcast i8* %1 to %"class.boost::exception_detail::clone_base"*
  call void @_ZN5boost16exception_detail10clone_baseD2Ev(%"class.boost::exception_detail::clone_base"* %2) nounwind
  ret void
}

define linkonce_odr void @_ZN5boost16exception_detail19error_info_injectorISt13runtime_errorED1Ev(%"struct.boost::exception_detail::error_info_injector.56"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"struct.boost::exception_detail::error_info_injector.56"*, align 4
  store %"struct.boost::exception_detail::error_info_injector.56"* %this, %"struct.boost::exception_detail::error_info_injector.56"** %this.addr, align 4
  %this1 = load %"struct.boost::exception_detail::error_info_injector.56"** %this.addr
  call void @_ZN5boost16exception_detail19error_info_injectorISt13runtime_errorED2Ev(%"struct.boost::exception_detail::error_info_injector.56"* %this1) nounwind
  ret void
}

define linkonce_odr void @_ZN5boost16exception_detail19error_info_injectorISt13runtime_errorED2Ev(%"struct.boost::exception_detail::error_info_injector.56"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"struct.boost::exception_detail::error_info_injector.56"*, align 4
  store %"struct.boost::exception_detail::error_info_injector.56"* %this, %"struct.boost::exception_detail::error_info_injector.56"** %this.addr, align 4
  %this1 = load %"struct.boost::exception_detail::error_info_injector.56"** %this.addr
  %0 = bitcast %"struct.boost::exception_detail::error_info_injector.56"* %this1 to i8*
  %1 = getelementptr inbounds i8* %0, i64 8
  %2 = bitcast i8* %1 to %"class.boost::exception"*
  call void @_ZN5boost9exceptionD2Ev(%"class.boost::exception"* %2) nounwind
  %3 = bitcast %"struct.boost::exception_detail::error_info_injector.56"* %this1 to %"class.std::runtime_error"*
  call void @_ZNSt13runtime_errorD2Ev(%"class.std::runtime_error"* %3) nounwind
  ret void
}

define linkonce_odr void @_ZThn8_N5boost16exception_detail19error_info_injectorISt13runtime_errorED1Ev(%"struct.boost::exception_detail::error_info_injector.56"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"struct.boost::exception_detail::error_info_injector.56"*, align 4
  store %"struct.boost::exception_detail::error_info_injector.56"* %this, %"struct.boost::exception_detail::error_info_injector.56"** %this.addr, align 4
  %this1 = load %"struct.boost::exception_detail::error_info_injector.56"** %this.addr
  %0 = bitcast %"struct.boost::exception_detail::error_info_injector.56"* %this1 to i8*
  %1 = getelementptr inbounds i8* %0, i64 -8
  %2 = bitcast i8* %1 to %"struct.boost::exception_detail::error_info_injector.56"*
  call void @_ZN5boost16exception_detail19error_info_injectorISt13runtime_errorED1Ev(%"struct.boost::exception_detail::error_info_injector.56"* %2) nounwind
  ret void
}

define linkonce_odr void @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorISt13runtime_errorEEED2Ev(%"class.boost::exception_detail::clone_impl.55"* %this, i8** %vtt) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::exception_detail::clone_impl.55"*, align 4
  %vtt.addr = alloca i8**, align 4
  store %"class.boost::exception_detail::clone_impl.55"* %this, %"class.boost::exception_detail::clone_impl.55"** %this.addr, align 4
  store i8** %vtt, i8*** %vtt.addr, align 4
  %this1 = load %"class.boost::exception_detail::clone_impl.55"** %this.addr
  %vtt2 = load i8*** %vtt.addr
  %0 = bitcast %"class.boost::exception_detail::clone_impl.55"* %this1 to %"struct.boost::exception_detail::error_info_injector.56"*
  call void @_ZN5boost16exception_detail19error_info_injectorISt13runtime_errorED2Ev(%"struct.boost::exception_detail::error_info_injector.56"* %0) nounwind
  ret void
}

define linkonce_odr void @_ZThn8_N5boost16exception_detail10clone_implINS0_19error_info_injectorISt13runtime_errorEEED1Ev(%"class.boost::exception_detail::clone_impl.55"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::exception_detail::clone_impl.55"*, align 4
  store %"class.boost::exception_detail::clone_impl.55"* %this, %"class.boost::exception_detail::clone_impl.55"** %this.addr, align 4
  %this1 = load %"class.boost::exception_detail::clone_impl.55"** %this.addr
  %0 = bitcast %"class.boost::exception_detail::clone_impl.55"* %this1 to i8*
  %1 = getelementptr inbounds i8* %0, i64 -8
  %2 = bitcast i8* %1 to %"class.boost::exception_detail::clone_impl.55"*
  call void @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorISt13runtime_errorEEED1Ev(%"class.boost::exception_detail::clone_impl.55"* %2) nounwind
  ret void
}

define linkonce_odr void @_ZTv0_n20_N5boost16exception_detail10clone_implINS0_19error_info_injectorISt13runtime_errorEEED1Ev(%"class.boost::exception_detail::clone_impl.55"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::exception_detail::clone_impl.55"*, align 4
  store %"class.boost::exception_detail::clone_impl.55"* %this, %"class.boost::exception_detail::clone_impl.55"** %this.addr, align 4
  %this1 = load %"class.boost::exception_detail::clone_impl.55"** %this.addr
  %0 = bitcast %"class.boost::exception_detail::clone_impl.55"* %this1 to i8*
  %1 = bitcast i8* %0 to i8**
  %2 = load i8** %1
  %3 = getelementptr inbounds i8* %2, i64 -20
  %4 = bitcast i8* %3 to i32*
  %5 = load i32* %4
  %6 = getelementptr inbounds i8* %0, i32 %5
  %7 = bitcast i8* %6 to %"class.boost::exception_detail::clone_impl.55"*
  call void @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorISt13runtime_errorEEED1Ev(%"class.boost::exception_detail::clone_impl.55"* %7) nounwind
  ret void
}

define linkonce_odr void @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorISt13runtime_errorEEED0Ev(%"class.boost::exception_detail::clone_impl.55"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::exception_detail::clone_impl.55"*, align 4
  store %"class.boost::exception_detail::clone_impl.55"* %this, %"class.boost::exception_detail::clone_impl.55"** %this.addr, align 4
  %this1 = load %"class.boost::exception_detail::clone_impl.55"** %this.addr
  call void @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorISt13runtime_errorEEED1Ev(%"class.boost::exception_detail::clone_impl.55"* %this1) nounwind
  %0 = bitcast %"class.boost::exception_detail::clone_impl.55"* %this1 to i8*
  call void @_ZdlPv(i8* %0) nounwind
  ret void
}

define linkonce_odr %"class.boost::exception_detail::clone_base"* @_ZNK5boost16exception_detail10clone_implINS0_19error_info_injectorISt13runtime_errorEEE5cloneEv(%"class.boost::exception_detail::clone_impl.55"* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::exception_detail::clone_impl.55"*, align 4
  %agg.tmp = alloca %"struct.boost::exception_detail::clone_impl<boost::exception_detail::error_info_injector<std::runtime_error> >::clone_tag", align 1
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  store %"class.boost::exception_detail::clone_impl.55"* %this, %"class.boost::exception_detail::clone_impl.55"** %this.addr, align 4
  %this1 = load %"class.boost::exception_detail::clone_impl.55"** %this.addr
  %call = call noalias i8* @_Znwj(i32 32)
  %0 = bitcast i8* %call to %"class.boost::exception_detail::clone_impl.55"*
  invoke void @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorISt13runtime_errorEEEC1ERKS5_NS5_9clone_tagE(%"class.boost::exception_detail::clone_impl.55"* %0, %"class.boost::exception_detail::clone_impl.55"* %this1)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %entry
  %1 = icmp eq %"class.boost::exception_detail::clone_impl.55"* %0, null
  br i1 %1, label %cast.end, label %cast.notnull

cast.notnull:                                     ; preds = %invoke.cont
  %2 = bitcast %"class.boost::exception_detail::clone_impl.55"* %0 to i8**
  %vtable = load i8** %2
  %vbase.offset.ptr = getelementptr i8* %vtable, i64 -12
  %3 = bitcast i8* %vbase.offset.ptr to i32*
  %vbase.offset = load i32* %3
  %4 = bitcast %"class.boost::exception_detail::clone_impl.55"* %0 to i8*
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

define linkonce_odr void @_ZNK5boost16exception_detail10clone_implINS0_19error_info_injectorISt13runtime_errorEEE7rethrowEv(%"class.boost::exception_detail::clone_impl.55"* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::exception_detail::clone_impl.55"*, align 4
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  store %"class.boost::exception_detail::clone_impl.55"* %this, %"class.boost::exception_detail::clone_impl.55"** %this.addr, align 4
  %this1 = load %"class.boost::exception_detail::clone_impl.55"** %this.addr
  %exception = call i8* @__cxa_allocate_exception(i32 32) nounwind
  %0 = bitcast i8* %exception to %"class.boost::exception_detail::clone_impl.55"*
  invoke void @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorISt13runtime_errorEEEC1ERKS5_(%"class.boost::exception_detail::clone_impl.55"* %0, %"class.boost::exception_detail::clone_impl.55"* %this1)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %entry
  call void @__cxa_throw(i8* %exception, i8* bitcast ({ i8*, i8*, i32, i32, i8*, i32, i8*, i32 }* @_ZTIN5boost16exception_detail10clone_implINS0_19error_info_injectorISt13runtime_errorEEEE to i8*), i8* bitcast (void (%"class.boost::exception_detail::clone_impl.55"*)* @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorISt13runtime_errorEEED1Ev to i8*)) noreturn
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

define linkonce_odr void @_ZThn8_N5boost16exception_detail10clone_implINS0_19error_info_injectorISt13runtime_errorEEED0Ev(%"class.boost::exception_detail::clone_impl.55"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::exception_detail::clone_impl.55"*, align 4
  store %"class.boost::exception_detail::clone_impl.55"* %this, %"class.boost::exception_detail::clone_impl.55"** %this.addr, align 4
  %this1 = load %"class.boost::exception_detail::clone_impl.55"** %this.addr
  %0 = bitcast %"class.boost::exception_detail::clone_impl.55"* %this1 to i8*
  %1 = getelementptr inbounds i8* %0, i64 -8
  %2 = bitcast i8* %1 to %"class.boost::exception_detail::clone_impl.55"*
  call void @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorISt13runtime_errorEEED0Ev(%"class.boost::exception_detail::clone_impl.55"* %2) nounwind
  ret void
}

define linkonce_odr %"class.boost::exception_detail::clone_base"* @_ZTv0_n12_NK5boost16exception_detail10clone_implINS0_19error_info_injectorISt13runtime_errorEEE5cloneEv(%"class.boost::exception_detail::clone_impl.55"* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::exception_detail::clone_impl.55"*, align 4
  store %"class.boost::exception_detail::clone_impl.55"* %this, %"class.boost::exception_detail::clone_impl.55"** %this.addr, align 4
  %this1 = load %"class.boost::exception_detail::clone_impl.55"** %this.addr
  %0 = bitcast %"class.boost::exception_detail::clone_impl.55"* %this1 to i8*
  %1 = bitcast i8* %0 to i8**
  %2 = load i8** %1
  %3 = getelementptr inbounds i8* %2, i64 -12
  %4 = bitcast i8* %3 to i32*
  %5 = load i32* %4
  %6 = getelementptr inbounds i8* %0, i32 %5
  %7 = bitcast i8* %6 to %"class.boost::exception_detail::clone_impl.55"*
  %call = call %"class.boost::exception_detail::clone_base"* @_ZNK5boost16exception_detail10clone_implINS0_19error_info_injectorISt13runtime_errorEEE5cloneEv(%"class.boost::exception_detail::clone_impl.55"* %7)
  ret %"class.boost::exception_detail::clone_base"* %call
}

define linkonce_odr void @_ZTv0_n16_NK5boost16exception_detail10clone_implINS0_19error_info_injectorISt13runtime_errorEEE7rethrowEv(%"class.boost::exception_detail::clone_impl.55"* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::exception_detail::clone_impl.55"*, align 4
  store %"class.boost::exception_detail::clone_impl.55"* %this, %"class.boost::exception_detail::clone_impl.55"** %this.addr, align 4
  %this1 = load %"class.boost::exception_detail::clone_impl.55"** %this.addr
  %0 = bitcast %"class.boost::exception_detail::clone_impl.55"* %this1 to i8*
  %1 = bitcast i8* %0 to i8**
  %2 = load i8** %1
  %3 = getelementptr inbounds i8* %2, i64 -16
  %4 = bitcast i8* %3 to i32*
  %5 = load i32* %4
  %6 = getelementptr inbounds i8* %0, i32 %5
  %7 = bitcast i8* %6 to %"class.boost::exception_detail::clone_impl.55"*
  call void @_ZNK5boost16exception_detail10clone_implINS0_19error_info_injectorISt13runtime_errorEEE7rethrowEv(%"class.boost::exception_detail::clone_impl.55"* %7)
  ret void
}

define linkonce_odr void @_ZTv0_n20_N5boost16exception_detail10clone_implINS0_19error_info_injectorISt13runtime_errorEEED0Ev(%"class.boost::exception_detail::clone_impl.55"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::exception_detail::clone_impl.55"*, align 4
  store %"class.boost::exception_detail::clone_impl.55"* %this, %"class.boost::exception_detail::clone_impl.55"** %this.addr, align 4
  %this1 = load %"class.boost::exception_detail::clone_impl.55"** %this.addr
  %0 = bitcast %"class.boost::exception_detail::clone_impl.55"* %this1 to i8*
  %1 = bitcast i8* %0 to i8**
  %2 = load i8** %1
  %3 = getelementptr inbounds i8* %2, i64 -20
  %4 = bitcast i8* %3 to i32*
  %5 = load i32* %4
  %6 = getelementptr inbounds i8* %0, i32 %5
  %7 = bitcast i8* %6 to %"class.boost::exception_detail::clone_impl.55"*
  call void @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorISt13runtime_errorEEED0Ev(%"class.boost::exception_detail::clone_impl.55"* %7) nounwind
  ret void
}

define linkonce_odr void @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorISt13runtime_errorEEEC1ERKS5_(%"class.boost::exception_detail::clone_impl.55"* %this, %"class.boost::exception_detail::clone_impl.55"*) unnamed_addr inlinehint align 2 {
entry:
  %this.addr = alloca %"class.boost::exception_detail::clone_impl.55"*, align 4
  %.addr = alloca %"class.boost::exception_detail::clone_impl.55"*, align 4
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  store %"class.boost::exception_detail::clone_impl.55"* %this, %"class.boost::exception_detail::clone_impl.55"** %this.addr, align 4
  store %"class.boost::exception_detail::clone_impl.55"* %0, %"class.boost::exception_detail::clone_impl.55"** %.addr, align 4
  %this1 = load %"class.boost::exception_detail::clone_impl.55"** %this.addr
  %1 = bitcast %"class.boost::exception_detail::clone_impl.55"* %this1 to i8*
  %2 = getelementptr inbounds i8* %1, i64 28
  %3 = bitcast i8* %2 to %"class.boost::exception_detail::clone_base"*
  %4 = load %"class.boost::exception_detail::clone_impl.55"** %.addr, align 4
  %5 = bitcast %"class.boost::exception_detail::clone_impl.55"* %4 to i8**
  %vtable = load i8** %5
  %vbase.offset.ptr = getelementptr i8* %vtable, i64 -12
  %6 = bitcast i8* %vbase.offset.ptr to i32*
  %vbase.offset = load i32* %6
  %7 = bitcast %"class.boost::exception_detail::clone_impl.55"* %4 to i8*
  %add.ptr = getelementptr inbounds i8* %7, i32 %vbase.offset
  %8 = bitcast i8* %add.ptr to %"class.boost::exception_detail::clone_base"*
  call void @_ZN5boost16exception_detail10clone_baseC2ERKS1_(%"class.boost::exception_detail::clone_base"* %3, %"class.boost::exception_detail::clone_base"* %8) nounwind
  %9 = bitcast %"class.boost::exception_detail::clone_impl.55"* %this1 to %"struct.boost::exception_detail::error_info_injector.56"*
  %10 = load %"class.boost::exception_detail::clone_impl.55"** %.addr, align 4
  %11 = bitcast %"class.boost::exception_detail::clone_impl.55"* %10 to %"struct.boost::exception_detail::error_info_injector.56"*
  invoke void @_ZN5boost16exception_detail19error_info_injectorISt13runtime_errorEC2ERKS3_(%"struct.boost::exception_detail::error_info_injector.56"* %9, %"struct.boost::exception_detail::error_info_injector.56"* %11)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %entry
  %12 = bitcast %"class.boost::exception_detail::clone_impl.55"* %this1 to i8***
  store i8** getelementptr inbounds ([21 x i8*]* @_ZTVN5boost16exception_detail10clone_implINS0_19error_info_injectorISt13runtime_errorEEEE, i64 0, i64 3), i8*** %12
  %13 = bitcast %"class.boost::exception_detail::clone_impl.55"* %this1 to i8*
  %add.ptr2 = getelementptr inbounds i8* %13, i32 8
  %14 = bitcast i8* %add.ptr2 to i8***
  store i8** getelementptr inbounds ([21 x i8*]* @_ZTVN5boost16exception_detail10clone_implINS0_19error_info_injectorISt13runtime_errorEEEE, i64 0, i64 10), i8*** %14
  %15 = bitcast %"class.boost::exception_detail::clone_impl.55"* %this1 to i8*
  %add.ptr3 = getelementptr inbounds i8* %15, i32 28
  %16 = bitcast i8* %add.ptr3 to i8***
  store i8** getelementptr inbounds ([21 x i8*]* @_ZTVN5boost16exception_detail10clone_implINS0_19error_info_injectorISt13runtime_errorEEEE, i64 0, i64 17), i8*** %16
  ret void

lpad:                                             ; preds = %entry
  %17 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %18 = extractvalue { i8*, i32 } %17, 0
  store i8* %18, i8** %exn.slot
  %19 = extractvalue { i8*, i32 } %17, 1
  store i32 %19, i32* %ehselector.slot
  %20 = bitcast %"class.boost::exception_detail::clone_impl.55"* %this1 to i8*
  %21 = getelementptr inbounds i8* %20, i64 28
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

define linkonce_odr void @_ZN5boost16exception_detail19error_info_injectorISt13runtime_errorEC2ERKS3_(%"struct.boost::exception_detail::error_info_injector.56"* %this, %"struct.boost::exception_detail::error_info_injector.56"*) unnamed_addr inlinehint align 2 {
entry:
  %this.addr = alloca %"struct.boost::exception_detail::error_info_injector.56"*, align 4
  %.addr = alloca %"struct.boost::exception_detail::error_info_injector.56"*, align 4
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  store %"struct.boost::exception_detail::error_info_injector.56"* %this, %"struct.boost::exception_detail::error_info_injector.56"** %this.addr, align 4
  store %"struct.boost::exception_detail::error_info_injector.56"* %0, %"struct.boost::exception_detail::error_info_injector.56"** %.addr, align 4
  %this1 = load %"struct.boost::exception_detail::error_info_injector.56"** %this.addr
  %1 = bitcast %"struct.boost::exception_detail::error_info_injector.56"* %this1 to %"class.std::runtime_error"*
  %2 = load %"struct.boost::exception_detail::error_info_injector.56"** %.addr, align 4
  %3 = bitcast %"struct.boost::exception_detail::error_info_injector.56"* %2 to %"class.std::runtime_error"*
  call void @_ZNSt13runtime_errorC2ERKS_(%"class.std::runtime_error"* %1, %"class.std::runtime_error"* %3)
  %4 = bitcast %"struct.boost::exception_detail::error_info_injector.56"* %this1 to i8*
  %5 = getelementptr inbounds i8* %4, i64 8
  %6 = bitcast i8* %5 to %"class.boost::exception"*
  %7 = load %"struct.boost::exception_detail::error_info_injector.56"** %.addr, align 4
  %8 = bitcast %"struct.boost::exception_detail::error_info_injector.56"* %7 to i8*
  %add.ptr = getelementptr inbounds i8* %8, i32 8
  %9 = bitcast i8* %add.ptr to %"class.boost::exception"*
  invoke void @_ZN5boost9exceptionC2ERKS0_(%"class.boost::exception"* %6, %"class.boost::exception"* %9)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %entry
  %10 = bitcast %"struct.boost::exception_detail::error_info_injector.56"* %this1 to i8***
  store i8** getelementptr inbounds ([9 x i8*]* @_ZTVN5boost16exception_detail19error_info_injectorISt13runtime_errorEE, i64 0, i64 2), i8*** %10
  %11 = bitcast %"struct.boost::exception_detail::error_info_injector.56"* %this1 to i8*
  %add.ptr2 = getelementptr inbounds i8* %11, i32 8
  %12 = bitcast i8* %add.ptr2 to i8***
  store i8** getelementptr inbounds ([9 x i8*]* @_ZTVN5boost16exception_detail19error_info_injectorISt13runtime_errorEE, i64 0, i64 7), i8*** %12
  ret void

lpad:                                             ; preds = %entry
  %13 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %14 = extractvalue { i8*, i32 } %13, 0
  store i8* %14, i8** %exn.slot
  %15 = extractvalue { i8*, i32 } %13, 1
  store i32 %15, i32* %ehselector.slot
  %16 = bitcast %"struct.boost::exception_detail::error_info_injector.56"* %this1 to %"class.std::runtime_error"*
  call void @_ZNSt13runtime_errorD2Ev(%"class.std::runtime_error"* %16) nounwind
  br label %eh.resume

eh.resume:                                        ; preds = %lpad
  %exn = load i8** %exn.slot
  %sel = load i32* %ehselector.slot
  %lpad.val = insertvalue { i8*, i32 } undef, i8* %exn, 0
  %lpad.val3 = insertvalue { i8*, i32 } %lpad.val, i32 %sel, 1
  resume { i8*, i32 } %lpad.val3
}

define linkonce_odr void @_ZN5boost16exception_detail19error_info_injectorISt13runtime_errorED0Ev(%"struct.boost::exception_detail::error_info_injector.56"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"struct.boost::exception_detail::error_info_injector.56"*, align 4
  store %"struct.boost::exception_detail::error_info_injector.56"* %this, %"struct.boost::exception_detail::error_info_injector.56"** %this.addr, align 4
  %this1 = load %"struct.boost::exception_detail::error_info_injector.56"** %this.addr
  call void @_ZN5boost16exception_detail19error_info_injectorISt13runtime_errorED1Ev(%"struct.boost::exception_detail::error_info_injector.56"* %this1) nounwind
  %0 = bitcast %"struct.boost::exception_detail::error_info_injector.56"* %this1 to i8*
  call void @_ZdlPv(i8* %0) nounwind
  ret void
}

define linkonce_odr void @_ZThn8_N5boost16exception_detail19error_info_injectorISt13runtime_errorED0Ev(%"struct.boost::exception_detail::error_info_injector.56"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"struct.boost::exception_detail::error_info_injector.56"*, align 4
  store %"struct.boost::exception_detail::error_info_injector.56"* %this, %"struct.boost::exception_detail::error_info_injector.56"** %this.addr, align 4
  %this1 = load %"struct.boost::exception_detail::error_info_injector.56"** %this.addr
  %0 = bitcast %"struct.boost::exception_detail::error_info_injector.56"* %this1 to i8*
  %1 = getelementptr inbounds i8* %0, i64 -8
  %2 = bitcast i8* %1 to %"struct.boost::exception_detail::error_info_injector.56"*
  call void @_ZN5boost16exception_detail19error_info_injectorISt13runtime_errorED0Ev(%"struct.boost::exception_detail::error_info_injector.56"* %2) nounwind
  ret void
}

define linkonce_odr void @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorISt13runtime_errorEEEC1ERKS5_NS5_9clone_tagE(%"class.boost::exception_detail::clone_impl.55"* %this, %"class.boost::exception_detail::clone_impl.55"* %x) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::exception_detail::clone_impl.55"*, align 4
  %x.addr = alloca %"class.boost::exception_detail::clone_impl.55"*, align 4
  %0 = alloca %"struct.boost::exception_detail::clone_impl<boost::exception_detail::error_info_injector<std::runtime_error> >::clone_tag", align 1
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  store %"class.boost::exception_detail::clone_impl.55"* %this, %"class.boost::exception_detail::clone_impl.55"** %this.addr, align 4
  store %"class.boost::exception_detail::clone_impl.55"* %x, %"class.boost::exception_detail::clone_impl.55"** %x.addr, align 4
  %this1 = load %"class.boost::exception_detail::clone_impl.55"** %this.addr
  %1 = bitcast %"class.boost::exception_detail::clone_impl.55"* %this1 to i8*
  %2 = getelementptr inbounds i8* %1, i64 28
  %3 = bitcast i8* %2 to %"class.boost::exception_detail::clone_base"*
  call void @_ZN5boost16exception_detail10clone_baseC2Ev(%"class.boost::exception_detail::clone_base"* %3) nounwind
  %4 = bitcast %"class.boost::exception_detail::clone_impl.55"* %this1 to %"struct.boost::exception_detail::error_info_injector.56"*
  %5 = load %"class.boost::exception_detail::clone_impl.55"** %x.addr, align 4
  %6 = bitcast %"class.boost::exception_detail::clone_impl.55"* %5 to %"struct.boost::exception_detail::error_info_injector.56"*
  invoke void @_ZN5boost16exception_detail19error_info_injectorISt13runtime_errorEC2ERKS3_(%"struct.boost::exception_detail::error_info_injector.56"* %4, %"struct.boost::exception_detail::error_info_injector.56"* %6)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %entry
  %7 = bitcast %"class.boost::exception_detail::clone_impl.55"* %this1 to i8***
  store i8** getelementptr inbounds ([21 x i8*]* @_ZTVN5boost16exception_detail10clone_implINS0_19error_info_injectorISt13runtime_errorEEEE, i64 0, i64 3), i8*** %7
  %8 = bitcast %"class.boost::exception_detail::clone_impl.55"* %this1 to i8*
  %add.ptr = getelementptr inbounds i8* %8, i32 8
  %9 = bitcast i8* %add.ptr to i8***
  store i8** getelementptr inbounds ([21 x i8*]* @_ZTVN5boost16exception_detail10clone_implINS0_19error_info_injectorISt13runtime_errorEEEE, i64 0, i64 10), i8*** %9
  %10 = bitcast %"class.boost::exception_detail::clone_impl.55"* %this1 to i8*
  %add.ptr2 = getelementptr inbounds i8* %10, i32 28
  %11 = bitcast i8* %add.ptr2 to i8***
  store i8** getelementptr inbounds ([21 x i8*]* @_ZTVN5boost16exception_detail10clone_implINS0_19error_info_injectorISt13runtime_errorEEEE, i64 0, i64 17), i8*** %11
  %12 = bitcast %"class.boost::exception_detail::clone_impl.55"* %this1 to i8*
  %add.ptr3 = getelementptr inbounds i8* %12, i32 8
  %13 = bitcast i8* %add.ptr3 to %"class.boost::exception"*
  %14 = load %"class.boost::exception_detail::clone_impl.55"** %x.addr, align 4
  %15 = icmp eq %"class.boost::exception_detail::clone_impl.55"* %14, null
  br i1 %15, label %cast.end, label %cast.notnull

cast.notnull:                                     ; preds = %invoke.cont
  %16 = bitcast %"class.boost::exception_detail::clone_impl.55"* %14 to i8*
  %add.ptr4 = getelementptr inbounds i8* %16, i32 8
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
  %24 = bitcast %"class.boost::exception_detail::clone_impl.55"* %this1 to %"struct.boost::exception_detail::error_info_injector.56"*
  call void @_ZN5boost16exception_detail19error_info_injectorISt13runtime_errorED2Ev(%"struct.boost::exception_detail::error_info_injector.56"* %24) nounwind
  br label %ehcleanup

ehcleanup:                                        ; preds = %lpad5, %lpad
  %25 = bitcast %"class.boost::exception_detail::clone_impl.55"* %this1 to i8*
  %26 = getelementptr inbounds i8* %25, i64 28
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

define linkonce_odr void @_ZN5boost16exception_detail19error_info_injectorISt13runtime_errorEC1ERKS2_(%"struct.boost::exception_detail::error_info_injector.56"* %this, %"class.std::runtime_error"* %x) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"struct.boost::exception_detail::error_info_injector.56"*, align 4
  %x.addr = alloca %"class.std::runtime_error"*, align 4
  store %"struct.boost::exception_detail::error_info_injector.56"* %this, %"struct.boost::exception_detail::error_info_injector.56"** %this.addr, align 4
  store %"class.std::runtime_error"* %x, %"class.std::runtime_error"** %x.addr, align 4
  %this1 = load %"struct.boost::exception_detail::error_info_injector.56"** %this.addr
  %0 = load %"class.std::runtime_error"** %x.addr
  call void @_ZN5boost16exception_detail19error_info_injectorISt13runtime_errorEC2ERKS2_(%"struct.boost::exception_detail::error_info_injector.56"* %this1, %"class.std::runtime_error"* %0)
  ret void
}

define linkonce_odr void @_ZN5boost16exception_detail19error_info_injectorISt13runtime_errorEC2ERKS2_(%"struct.boost::exception_detail::error_info_injector.56"* %this, %"class.std::runtime_error"* %x) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"struct.boost::exception_detail::error_info_injector.56"*, align 4
  %x.addr = alloca %"class.std::runtime_error"*, align 4
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  store %"struct.boost::exception_detail::error_info_injector.56"* %this, %"struct.boost::exception_detail::error_info_injector.56"** %this.addr, align 4
  store %"class.std::runtime_error"* %x, %"class.std::runtime_error"** %x.addr, align 4
  %this1 = load %"struct.boost::exception_detail::error_info_injector.56"** %this.addr
  %0 = bitcast %"struct.boost::exception_detail::error_info_injector.56"* %this1 to %"class.std::runtime_error"*
  %1 = load %"class.std::runtime_error"** %x.addr, align 4
  call void @_ZNSt13runtime_errorC2ERKS_(%"class.std::runtime_error"* %0, %"class.std::runtime_error"* %1)
  %2 = bitcast %"struct.boost::exception_detail::error_info_injector.56"* %this1 to i8*
  %3 = getelementptr inbounds i8* %2, i64 8
  %4 = bitcast i8* %3 to %"class.boost::exception"*
  invoke void @_ZN5boost9exceptionC2Ev(%"class.boost::exception"* %4)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %entry
  %5 = bitcast %"struct.boost::exception_detail::error_info_injector.56"* %this1 to i8***
  store i8** getelementptr inbounds ([9 x i8*]* @_ZTVN5boost16exception_detail19error_info_injectorISt13runtime_errorEE, i64 0, i64 2), i8*** %5
  %6 = bitcast %"struct.boost::exception_detail::error_info_injector.56"* %this1 to i8*
  %add.ptr = getelementptr inbounds i8* %6, i32 8
  %7 = bitcast i8* %add.ptr to i8***
  store i8** getelementptr inbounds ([9 x i8*]* @_ZTVN5boost16exception_detail19error_info_injectorISt13runtime_errorEE, i64 0, i64 7), i8*** %7
  ret void

lpad:                                             ; preds = %entry
  %8 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %9 = extractvalue { i8*, i32 } %8, 0
  store i8* %9, i8** %exn.slot
  %10 = extractvalue { i8*, i32 } %8, 1
  store i32 %10, i32* %ehselector.slot
  %11 = bitcast %"struct.boost::exception_detail::error_info_injector.56"* %this1 to %"class.std::runtime_error"*
  call void @_ZNSt13runtime_errorD2Ev(%"class.std::runtime_error"* %11) nounwind
  br label %eh.resume

eh.resume:                                        ; preds = %lpad
  %exn = load i8** %exn.slot
  %sel = load i32* %ehselector.slot
  %lpad.val = insertvalue { i8*, i32 } undef, i8* %exn, 0
  %lpad.val2 = insertvalue { i8*, i32 } %lpad.val, i32 %sel, 1
  resume { i8*, i32 } %lpad.val2
}

define linkonce_odr void @_ZN5boost16exception_detail10clone_implINS0_19error_info_injectorISt13runtime_errorEEEC1ERKS4_(%"class.boost::exception_detail::clone_impl.55"* %this, %"struct.boost::exception_detail::error_info_injector.56"* %x) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::exception_detail::clone_impl.55"*, align 4
  %x.addr = alloca %"struct.boost::exception_detail::error_info_injector.56"*, align 4
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  store %"class.boost::exception_detail::clone_impl.55"* %this, %"class.boost::exception_detail::clone_impl.55"** %this.addr, align 4
  store %"struct.boost::exception_detail::error_info_injector.56"* %x, %"struct.boost::exception_detail::error_info_injector.56"** %x.addr, align 4
  %this1 = load %"class.boost::exception_detail::clone_impl.55"** %this.addr
  %0 = bitcast %"class.boost::exception_detail::clone_impl.55"* %this1 to i8*
  %1 = getelementptr inbounds i8* %0, i64 28
  %2 = bitcast i8* %1 to %"class.boost::exception_detail::clone_base"*
  call void @_ZN5boost16exception_detail10clone_baseC2Ev(%"class.boost::exception_detail::clone_base"* %2) nounwind
  %3 = bitcast %"class.boost::exception_detail::clone_impl.55"* %this1 to %"struct.boost::exception_detail::error_info_injector.56"*
  %4 = load %"struct.boost::exception_detail::error_info_injector.56"** %x.addr, align 4
  invoke void @_ZN5boost16exception_detail19error_info_injectorISt13runtime_errorEC2ERKS3_(%"struct.boost::exception_detail::error_info_injector.56"* %3, %"struct.boost::exception_detail::error_info_injector.56"* %4)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %entry
  %5 = bitcast %"class.boost::exception_detail::clone_impl.55"* %this1 to i8***
  store i8** getelementptr inbounds ([21 x i8*]* @_ZTVN5boost16exception_detail10clone_implINS0_19error_info_injectorISt13runtime_errorEEEE, i64 0, i64 3), i8*** %5
  %6 = bitcast %"class.boost::exception_detail::clone_impl.55"* %this1 to i8*
  %add.ptr = getelementptr inbounds i8* %6, i32 8
  %7 = bitcast i8* %add.ptr to i8***
  store i8** getelementptr inbounds ([21 x i8*]* @_ZTVN5boost16exception_detail10clone_implINS0_19error_info_injectorISt13runtime_errorEEEE, i64 0, i64 10), i8*** %7
  %8 = bitcast %"class.boost::exception_detail::clone_impl.55"* %this1 to i8*
  %add.ptr2 = getelementptr inbounds i8* %8, i32 28
  %9 = bitcast i8* %add.ptr2 to i8***
  store i8** getelementptr inbounds ([21 x i8*]* @_ZTVN5boost16exception_detail10clone_implINS0_19error_info_injectorISt13runtime_errorEEEE, i64 0, i64 17), i8*** %9
  %10 = bitcast %"class.boost::exception_detail::clone_impl.55"* %this1 to i8*
  %add.ptr3 = getelementptr inbounds i8* %10, i32 8
  %11 = bitcast i8* %add.ptr3 to %"class.boost::exception"*
  %12 = load %"struct.boost::exception_detail::error_info_injector.56"** %x.addr, align 4
  %13 = icmp eq %"struct.boost::exception_detail::error_info_injector.56"* %12, null
  br i1 %13, label %cast.end, label %cast.notnull

cast.notnull:                                     ; preds = %invoke.cont
  %14 = bitcast %"struct.boost::exception_detail::error_info_injector.56"* %12 to i8*
  %add.ptr4 = getelementptr inbounds i8* %14, i32 8
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
  %22 = bitcast %"class.boost::exception_detail::clone_impl.55"* %this1 to %"struct.boost::exception_detail::error_info_injector.56"*
  call void @_ZN5boost16exception_detail19error_info_injectorISt13runtime_errorED2Ev(%"struct.boost::exception_detail::error_info_injector.56"* %22) nounwind
  br label %ehcleanup

ehcleanup:                                        ; preds = %lpad5, %lpad
  %23 = bitcast %"class.boost::exception_detail::clone_impl.55"* %this1 to i8*
  %24 = getelementptr inbounds i8* %23, i64 28
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

declare i32 @gettimeofday(%struct.timeval*, %struct.timezone*) nounwind

define linkonce_odr void @_ZN5boost10posix_time5ptimeC1ENS_9gregorian4dateENS0_13time_durationE(%"class.boost::posix_time::ptime"* %this, %"class.boost::gregorian::date"* byval align 4 %d, %"class.boost::posix_time::time_duration"* %td) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::posix_time::ptime"*, align 4
  store %"class.boost::posix_time::ptime"* %this, %"class.boost::posix_time::ptime"** %this.addr, align 4
  %this1 = load %"class.boost::posix_time::ptime"** %this.addr
  call void @_ZN5boost10posix_time5ptimeC2ENS_9gregorian4dateENS0_13time_durationE(%"class.boost::posix_time::ptime"* %this1, %"class.boost::gregorian::date"* byval align 4 %d, %"class.boost::posix_time::time_duration"* %td)
  ret void
}

define linkonce_odr void @_ZN5boost10posix_time5ptimeC2ENS_9gregorian4dateENS0_13time_durationE(%"class.boost::posix_time::ptime"* %this, %"class.boost::gregorian::date"* byval align 4 %d, %"class.boost::posix_time::time_duration"* %td) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::posix_time::ptime"*, align 4
  store %"class.boost::posix_time::ptime"* %this, %"class.boost::posix_time::ptime"** %this.addr, align 4
  %this1 = load %"class.boost::posix_time::ptime"** %this.addr
  %0 = bitcast %"class.boost::posix_time::ptime"* %this1 to %"class.boost::date_time::base_time"*
  call void @_ZN5boost9date_time9base_timeINS_10posix_time5ptimeENS0_19counted_time_systemINS0_16counted_time_repINS2_33millisec_posix_time_system_configEEEEEEC2ERKNS_9gregorian4dateERKNS2_13time_durationENS0_9dst_flagsE(%"class.boost::date_time::base_time"* %0, %"class.boost::gregorian::date"* %d, %"class.boost::posix_time::time_duration"* %td, i32 0)
  ret void
}

define linkonce_odr void @_ZNK5boost9date_time9base_timeINS_10posix_time5ptimeENS0_19counted_time_systemINS0_16counted_time_repINS2_33millisec_posix_time_system_configEEEEEEmiERKS3_(%"class.boost::posix_time::time_duration"* noalias sret %agg.result, %"class.boost::date_time::base_time"* %this, %"class.boost::posix_time::ptime"* %rhs) align 2 {
entry:
  %this.addr = alloca %"class.boost::date_time::base_time"*, align 4
  %rhs.addr = alloca %"class.boost::posix_time::ptime"*, align 4
  store %"class.boost::date_time::base_time"* %this, %"class.boost::date_time::base_time"** %this.addr, align 4
  store %"class.boost::posix_time::ptime"* %rhs, %"class.boost::posix_time::ptime"** %rhs.addr, align 4
  %this1 = load %"class.boost::date_time::base_time"** %this.addr
  %time_ = getelementptr inbounds %"class.boost::date_time::base_time"* %this1, i32 0, i32 0
  %0 = load %"class.boost::posix_time::ptime"** %rhs.addr, align 4
  %1 = bitcast %"class.boost::posix_time::ptime"* %0 to %"class.boost::date_time::base_time"*
  %time_2 = getelementptr inbounds %"class.boost::date_time::base_time"* %1, i32 0, i32 0
  call void @_ZN5boost9date_time19counted_time_systemINS0_16counted_time_repINS_10posix_time33millisec_posix_time_system_configEEEE14subtract_timesERKS5_S8_(%"class.boost::posix_time::time_duration"* sret %agg.result, %"struct.boost::date_time::counted_time_rep"* %time_, %"struct.boost::date_time::counted_time_rep"* %time_2)
  ret void
}

define linkonce_odr i32 @_ZNK5boost9date_time13time_durationINS_10posix_time13time_durationENS0_22time_resolution_traitsINS0_37time_resolution_traits_adapted64_implELNS0_16time_resolutionsE5ELx1000000ELt6EiEEE13total_secondsEv(%"class.boost::date_time::time_duration"* %this) align 2 {
entry:
  %this.addr = alloca %"class.boost::date_time::time_duration"*, align 4
  store %"class.boost::date_time::time_duration"* %this, %"class.boost::date_time::time_duration"** %this.addr, align 4
  %this1 = load %"class.boost::date_time::time_duration"** %this.addr
  %call = call i64 @_ZNK5boost9date_time13time_durationINS_10posix_time13time_durationENS0_22time_resolution_traitsINS0_37time_resolution_traits_adapted64_implELNS0_16time_resolutionsE5ELx1000000ELt6EiEEE5ticksEv(%"class.boost::date_time::time_duration"* %this1)
  %call2 = call i64 @_ZN5boost9date_time13time_durationINS_10posix_time13time_durationENS0_22time_resolution_traitsINS0_37time_resolution_traits_adapted64_implELNS0_16time_resolutionsE5ELx1000000ELt6EiEEE16ticks_per_secondEv()
  %div = sdiv i64 %call, %call2
  %conv = trunc i64 %div to i32
  ret i32 %conv
}

define linkonce_odr i64 @_ZNK5boost9date_time13time_durationINS_10posix_time13time_durationENS0_22time_resolution_traitsINS0_37time_resolution_traits_adapted64_implELNS0_16time_resolutionsE5ELx1000000ELt6EiEEE18fractional_secondsEv(%"class.boost::date_time::time_duration"* %this) align 2 {
entry:
  %this.addr = alloca %"class.boost::date_time::time_duration"*, align 4
  store %"class.boost::date_time::time_duration"* %this, %"class.boost::date_time::time_duration"** %this.addr, align 4
  %this1 = load %"class.boost::date_time::time_duration"** %this.addr
  %call = call i64 @_ZNK5boost9date_time13time_durationINS_10posix_time13time_durationENS0_22time_resolution_traitsINS0_37time_resolution_traits_adapted64_implELNS0_16time_resolutionsE5ELx1000000ELt6EiEEE5ticksEv(%"class.boost::date_time::time_duration"* %this1)
  %call2 = call i64 @_ZN5boost9date_time13time_durationINS_10posix_time13time_durationENS0_22time_resolution_traitsINS0_37time_resolution_traits_adapted64_implELNS0_16time_resolutionsE5ELx1000000ELt6EiEEE16ticks_per_secondEv()
  %rem = srem i64 %call, %call2
  ret i64 %rem
}

define linkonce_odr i64 @_ZN5boost9date_time13time_durationINS_10posix_time13time_durationENS0_22time_resolution_traitsINS0_37time_resolution_traits_adapted64_implELNS0_16time_resolutionsE5ELx1000000ELt6EiEEE16ticks_per_secondEv() nounwind align 2 {
entry:
  %call = call i64 @_ZN5boost9date_time22time_resolution_traitsINS0_37time_resolution_traits_adapted64_implELNS0_16time_resolutionsE5ELx1000000ELt6EiE10res_adjustEv()
  ret i64 %call
}

define linkonce_odr void @_ZN5boost9date_time19counted_time_systemINS0_16counted_time_repINS_10posix_time33millisec_posix_time_system_configEEEE14subtract_timesERKS5_S8_(%"class.boost::posix_time::time_duration"* noalias sret %agg.result, %"struct.boost::date_time::counted_time_rep"* %lhs, %"struct.boost::date_time::counted_time_rep"* %rhs) align 2 {
entry:
  %lhs.addr = alloca %"struct.boost::date_time::counted_time_rep"*, align 4
  %rhs.addr = alloca %"struct.boost::date_time::counted_time_rep"*, align 4
  %tmp = alloca %"class.boost::date_time::int_adapter", align 4
  %ref.tmp = alloca %"class.boost::date_time::int_adapter", align 4
  %tmp2 = alloca %"class.boost::date_time::int_adapter", align 4
  %fs = alloca i64, align 8
  store %"struct.boost::date_time::counted_time_rep"* %lhs, %"struct.boost::date_time::counted_time_rep"** %lhs.addr, align 4
  store %"struct.boost::date_time::counted_time_rep"* %rhs, %"struct.boost::date_time::counted_time_rep"** %rhs.addr, align 4
  %0 = load %"struct.boost::date_time::counted_time_rep"** %lhs.addr, align 4
  %call = call zeroext i1 @_ZNK5boost9date_time16counted_time_repINS_10posix_time33millisec_posix_time_system_configEE10is_specialEv(%"struct.boost::date_time::counted_time_rep"* %0)
  br i1 %call, label %if.then, label %lor.lhs.false

lor.lhs.false:                                    ; preds = %entry
  %1 = load %"struct.boost::date_time::counted_time_rep"** %rhs.addr, align 4
  %call1 = call zeroext i1 @_ZNK5boost9date_time16counted_time_repINS_10posix_time33millisec_posix_time_system_configEE10is_specialEv(%"struct.boost::date_time::counted_time_rep"* %1)
  br i1 %call1, label %if.then, label %if.else

if.then:                                          ; preds = %lor.lhs.false, %entry
  %2 = load %"struct.boost::date_time::counted_time_rep"** %lhs.addr, align 4
  call void @_ZNK5boost9date_time16counted_time_repINS_10posix_time33millisec_posix_time_system_configEE7get_repEv(%"class.boost::date_time::int_adapter"* sret %tmp, %"struct.boost::date_time::counted_time_rep"* %2)
  %3 = load %"struct.boost::date_time::counted_time_rep"** %rhs.addr, align 4
  call void @_ZNK5boost9date_time16counted_time_repINS_10posix_time33millisec_posix_time_system_configEE7get_repEv(%"class.boost::date_time::int_adapter"* sret %ref.tmp, %"struct.boost::date_time::counted_time_rep"* %3)
  call void @_ZNK5boost9date_time11int_adapterIxEmiIxEES2_RKNS1_IT_EE(%"class.boost::date_time::int_adapter"* sret %tmp2, %"class.boost::date_time::int_adapter"* %tmp, %"class.boost::date_time::int_adapter"* %ref.tmp)
  %call3 = call i64 @_ZNK5boost9date_time11int_adapterIxE9as_numberEv(%"class.boost::date_time::int_adapter"* %tmp2)
  %call4 = call i32 @_ZN5boost9date_time11int_adapterIxE10to_specialEx(i64 %call3)
  call void @_ZN5boost10posix_time13time_durationC1ENS_9date_time14special_valuesE(%"class.boost::posix_time::time_duration"* %agg.result, i32 %call4)
  br label %return

if.else:                                          ; preds = %lor.lhs.false
  %4 = load %"struct.boost::date_time::counted_time_rep"** %lhs.addr, align 4
  %call6 = call i64 @_ZNK5boost9date_time16counted_time_repINS_10posix_time33millisec_posix_time_system_configEE10time_countEv(%"struct.boost::date_time::counted_time_rep"* %4)
  %5 = load %"struct.boost::date_time::counted_time_rep"** %rhs.addr, align 4
  %call7 = call i64 @_ZNK5boost9date_time16counted_time_repINS_10posix_time33millisec_posix_time_system_configEE10time_countEv(%"struct.boost::date_time::counted_time_rep"* %5)
  %sub = sub nsw i64 %call6, %call7
  store i64 %sub, i64* %fs, align 8
  %6 = load i64* %fs, align 8
  call void @_ZN5boost10posix_time13time_durationC1Eiiix(%"class.boost::posix_time::time_duration"* %agg.result, i32 0, i32 0, i32 0, i64 %6)
  br label %return

return:                                           ; preds = %if.else, %if.then
  ret void
}

define linkonce_odr void @_ZN5boost10posix_time13time_durationC1ENS_9date_time14special_valuesE(%"class.boost::posix_time::time_duration"* %this, i32 %sv) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::posix_time::time_duration"*, align 4
  %sv.addr = alloca i32, align 4
  store %"class.boost::posix_time::time_duration"* %this, %"class.boost::posix_time::time_duration"** %this.addr, align 4
  store i32 %sv, i32* %sv.addr, align 4
  %this1 = load %"class.boost::posix_time::time_duration"** %this.addr
  %0 = load i32* %sv.addr, align 4
  call void @_ZN5boost10posix_time13time_durationC2ENS_9date_time14special_valuesE(%"class.boost::posix_time::time_duration"* %this1, i32 %0)
  ret void
}

define linkonce_odr i32 @_ZN5boost9date_time11int_adapterIxE10to_specialEx(i64 %v) align 2 {
entry:
  %retval = alloca i32, align 4
  %v.addr = alloca i64, align 8
  store i64 %v, i64* %v.addr, align 8
  %0 = load i64* %v.addr, align 8
  %call = call zeroext i1 @_ZN5boost9date_time11int_adapterIxE15is_not_a_numberEx(i64 %0)
  br i1 %call, label %if.then, label %if.end

if.then:                                          ; preds = %entry
  store i32 0, i32* %retval
  br label %return

if.end:                                           ; preds = %entry
  %1 = load i64* %v.addr, align 8
  %call1 = call zeroext i1 @_ZN5boost9date_time11int_adapterIxE10is_neg_infEx(i64 %1)
  br i1 %call1, label %if.then2, label %if.end3

if.then2:                                         ; preds = %if.end
  store i32 1, i32* %retval
  br label %return

if.end3:                                          ; preds = %if.end
  %2 = load i64* %v.addr, align 8
  %call4 = call zeroext i1 @_ZN5boost9date_time11int_adapterIxE10is_pos_infEx(i64 %2)
  br i1 %call4, label %if.then5, label %if.end6

if.then5:                                         ; preds = %if.end3
  store i32 2, i32* %retval
  br label %return

if.end6:                                          ; preds = %if.end3
  store i32 5, i32* %retval
  br label %return

return:                                           ; preds = %if.end6, %if.then5, %if.then2, %if.then
  %3 = load i32* %retval
  ret i32 %3
}

define linkonce_odr void @_ZNK5boost9date_time11int_adapterIxEmiIxEES2_RKNS1_IT_EE(%"class.boost::date_time::int_adapter"* noalias sret %agg.result, %"class.boost::date_time::int_adapter"* %this, %"class.boost::date_time::int_adapter"* %rhs) inlinehint align 2 {
entry:
  %this.addr = alloca %"class.boost::date_time::int_adapter"*, align 4
  %rhs.addr = alloca %"class.boost::date_time::int_adapter"*, align 4
  store %"class.boost::date_time::int_adapter"* %this, %"class.boost::date_time::int_adapter"** %this.addr, align 4
  store %"class.boost::date_time::int_adapter"* %rhs, %"class.boost::date_time::int_adapter"** %rhs.addr, align 4
  %this1 = load %"class.boost::date_time::int_adapter"** %this.addr
  %call = call zeroext i1 @_ZNK5boost9date_time11int_adapterIxE10is_specialEv(%"class.boost::date_time::int_adapter"* %this1)
  br i1 %call, label %if.then, label %lor.lhs.false

lor.lhs.false:                                    ; preds = %entry
  %0 = load %"class.boost::date_time::int_adapter"** %rhs.addr, align 4
  %call2 = call zeroext i1 @_ZNK5boost9date_time11int_adapterIxE10is_specialEv(%"class.boost::date_time::int_adapter"* %0)
  br i1 %call2, label %if.then, label %if.end29

if.then:                                          ; preds = %lor.lhs.false, %entry
  %call3 = call zeroext i1 @_ZNK5boost9date_time11int_adapterIxE6is_nanEv(%"class.boost::date_time::int_adapter"* %this1)
  br i1 %call3, label %if.then6, label %lor.lhs.false4

lor.lhs.false4:                                   ; preds = %if.then
  %1 = load %"class.boost::date_time::int_adapter"** %rhs.addr, align 4
  %call5 = call zeroext i1 @_ZNK5boost9date_time11int_adapterIxE6is_nanEv(%"class.boost::date_time::int_adapter"* %1)
  br i1 %call5, label %if.then6, label %if.end

if.then6:                                         ; preds = %lor.lhs.false4, %if.then
  call void @_ZN5boost9date_time11int_adapterIxE12not_a_numberEv(%"class.boost::date_time::int_adapter"* sret %agg.result)
  br label %return

if.end:                                           ; preds = %lor.lhs.false4
  %value_ = getelementptr inbounds %"class.boost::date_time::int_adapter"* %this1, i32 0, i32 0
  %2 = load i64* %value_, align 4
  %call7 = call zeroext i1 @_ZN5boost9date_time11int_adapterIxE10is_pos_infEx(i64 %2)
  br i1 %call7, label %land.lhs.true, label %lor.lhs.false10

land.lhs.true:                                    ; preds = %if.end
  %3 = load %"class.boost::date_time::int_adapter"** %rhs.addr, align 4
  %4 = load %"class.boost::date_time::int_adapter"** %rhs.addr, align 4
  %call8 = call i64 @_ZNK5boost9date_time11int_adapterIxE9as_numberEv(%"class.boost::date_time::int_adapter"* %4)
  %call9 = call zeroext i1 @_ZN5boost9date_time11int_adapterIxE10is_pos_infEx(i64 %call8)
  br i1 %call9, label %if.then16, label %lor.lhs.false10

lor.lhs.false10:                                  ; preds = %land.lhs.true, %if.end
  %value_11 = getelementptr inbounds %"class.boost::date_time::int_adapter"* %this1, i32 0, i32 0
  %5 = load i64* %value_11, align 4
  %call12 = call zeroext i1 @_ZN5boost9date_time11int_adapterIxE10is_neg_infEx(i64 %5)
  br i1 %call12, label %land.lhs.true13, label %if.end17

land.lhs.true13:                                  ; preds = %lor.lhs.false10
  %6 = load %"class.boost::date_time::int_adapter"** %rhs.addr, align 4
  %7 = load %"class.boost::date_time::int_adapter"** %rhs.addr, align 4
  %call14 = call i64 @_ZNK5boost9date_time11int_adapterIxE9as_numberEv(%"class.boost::date_time::int_adapter"* %7)
  %call15 = call zeroext i1 @_ZN5boost9date_time11int_adapterIxE10is_neg_infEx(i64 %call14)
  br i1 %call15, label %if.then16, label %if.end17

if.then16:                                        ; preds = %land.lhs.true13, %land.lhs.true
  call void @_ZN5boost9date_time11int_adapterIxE12not_a_numberEv(%"class.boost::date_time::int_adapter"* sret %agg.result)
  br label %return

if.end17:                                         ; preds = %land.lhs.true13, %lor.lhs.false10
  %call18 = call zeroext i1 @_ZNK5boost9date_time11int_adapterIxE11is_infinityEv(%"class.boost::date_time::int_adapter"* %this1)
  br i1 %call18, label %if.then19, label %if.end20

if.then19:                                        ; preds = %if.end17
  %8 = bitcast %"class.boost::date_time::int_adapter"* %agg.result to i8*
  %9 = bitcast %"class.boost::date_time::int_adapter"* %this1 to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %8, i8* %9, i32 8, i32 4, i1 false)
  br label %return

if.end20:                                         ; preds = %if.end17
  %10 = load %"class.boost::date_time::int_adapter"** %rhs.addr, align 4
  %11 = load %"class.boost::date_time::int_adapter"** %rhs.addr, align 4
  %call21 = call i64 @_ZNK5boost9date_time11int_adapterIxE9as_numberEv(%"class.boost::date_time::int_adapter"* %11)
  %call22 = call zeroext i1 @_ZN5boost9date_time11int_adapterIxE10is_pos_infEx(i64 %call21)
  br i1 %call22, label %if.then23, label %if.end24

if.then23:                                        ; preds = %if.end20
  call void @_ZN5boost9date_time11int_adapterIxE12neg_infinityEv(%"class.boost::date_time::int_adapter"* sret %agg.result)
  br label %return

if.end24:                                         ; preds = %if.end20
  %12 = load %"class.boost::date_time::int_adapter"** %rhs.addr, align 4
  %13 = load %"class.boost::date_time::int_adapter"** %rhs.addr, align 4
  %call25 = call i64 @_ZNK5boost9date_time11int_adapterIxE9as_numberEv(%"class.boost::date_time::int_adapter"* %13)
  %call26 = call zeroext i1 @_ZN5boost9date_time11int_adapterIxE10is_neg_infEx(i64 %call25)
  br i1 %call26, label %if.then27, label %if.end28

if.then27:                                        ; preds = %if.end24
  call void @_ZN5boost9date_time11int_adapterIxE12pos_infinityEv(%"class.boost::date_time::int_adapter"* sret %agg.result)
  br label %return

if.end28:                                         ; preds = %if.end24
  br label %if.end29

if.end29:                                         ; preds = %if.end28, %lor.lhs.false
  %value_30 = getelementptr inbounds %"class.boost::date_time::int_adapter"* %this1, i32 0, i32 0
  %14 = load i64* %value_30, align 4
  %15 = load %"class.boost::date_time::int_adapter"** %rhs.addr, align 4
  %call31 = call i64 @_ZNK5boost9date_time11int_adapterIxE9as_numberEv(%"class.boost::date_time::int_adapter"* %15)
  %sub = sub nsw i64 %14, %call31
  call void @_ZN5boost9date_time11int_adapterIxEC1Ex(%"class.boost::date_time::int_adapter"* %agg.result, i64 %sub)
  br label %return

return:                                           ; preds = %if.end29, %if.then27, %if.then23, %if.then19, %if.then16, %if.then6
  ret void
}

define linkonce_odr zeroext i1 @_ZN5boost9date_time11int_adapterIxE15is_not_a_numberEx(i64 %v) align 2 {
entry:
  %v.addr = alloca i64, align 8
  %tmp = alloca %"class.boost::date_time::int_adapter", align 4
  store i64 %v, i64* %v.addr, align 8
  %0 = load i64* %v.addr, align 8
  call void @_ZN5boost9date_time11int_adapterIxE12not_a_numberEv(%"class.boost::date_time::int_adapter"* sret %tmp)
  %call = call i64 @_ZNK5boost9date_time11int_adapterIxE9as_numberEv(%"class.boost::date_time::int_adapter"* %tmp)
  %cmp = icmp eq i64 %0, %call
  ret i1 %cmp
}

define linkonce_odr void @_ZN5boost10posix_time13time_durationC2ENS_9date_time14special_valuesE(%"class.boost::posix_time::time_duration"* %this, i32 %sv) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::posix_time::time_duration"*, align 4
  %sv.addr = alloca i32, align 4
  store %"class.boost::posix_time::time_duration"* %this, %"class.boost::posix_time::time_duration"** %this.addr, align 4
  store i32 %sv, i32* %sv.addr, align 4
  %this1 = load %"class.boost::posix_time::time_duration"** %this.addr
  %0 = bitcast %"class.boost::posix_time::time_duration"* %this1 to %"class.boost::date_time::time_duration"*
  %1 = load i32* %sv.addr, align 4
  call void @_ZN5boost9date_time13time_durationINS_10posix_time13time_durationENS0_22time_resolution_traitsINS0_37time_resolution_traits_adapted64_implELNS0_16time_resolutionsE5ELx1000000ELt6EiEEEC2ENS0_14special_valuesE(%"class.boost::date_time::time_duration"* %0, i32 %1)
  ret void
}

define linkonce_odr void @_ZN5boost9date_time13time_durationINS_10posix_time13time_durationENS0_22time_resolution_traitsINS0_37time_resolution_traits_adapted64_implELNS0_16time_resolutionsE5ELx1000000ELt6EiEEEC2ENS0_14special_valuesE(%"class.boost::date_time::time_duration"* %this, i32 %sv) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::date_time::time_duration"*, align 4
  %sv.addr = alloca i32, align 4
  store %"class.boost::date_time::time_duration"* %this, %"class.boost::date_time::time_duration"** %this.addr, align 4
  store i32 %sv, i32* %sv.addr, align 4
  %this1 = load %"class.boost::date_time::time_duration"** %this.addr
  %0 = bitcast %"class.boost::date_time::time_duration"* %this1 to %"struct.boost::less_than_comparable.33"*
  %ticks_ = getelementptr inbounds %"class.boost::date_time::time_duration"* %this1, i32 0, i32 0
  %1 = load i32* %sv.addr, align 4
  call void @_ZN5boost9date_time11int_adapterIxE12from_specialENS0_14special_valuesE(%"class.boost::date_time::int_adapter"* sret %ticks_, i32 %1)
  ret void
}

define linkonce_odr void @_ZN5boost9date_time11int_adapterIxE12from_specialENS0_14special_valuesE(%"class.boost::date_time::int_adapter"* noalias sret %agg.result, i32 %sv) align 2 {
entry:
  %sv.addr = alloca i32, align 4
  store i32 %sv, i32* %sv.addr, align 4
  %0 = load i32* %sv.addr, align 4
  switch i32 %0, label %sw.default [
    i32 0, label %sw.bb
    i32 1, label %sw.bb1
    i32 2, label %sw.bb2
    i32 4, label %sw.bb3
    i32 3, label %sw.bb4
  ]

sw.bb:                                            ; preds = %entry
  call void @_ZN5boost9date_time11int_adapterIxE12not_a_numberEv(%"class.boost::date_time::int_adapter"* sret %agg.result)
  br label %return

sw.bb1:                                           ; preds = %entry
  call void @_ZN5boost9date_time11int_adapterIxE12neg_infinityEv(%"class.boost::date_time::int_adapter"* sret %agg.result)
  br label %return

sw.bb2:                                           ; preds = %entry
  call void @_ZN5boost9date_time11int_adapterIxE12pos_infinityEv(%"class.boost::date_time::int_adapter"* sret %agg.result)
  br label %return

sw.bb3:                                           ; preds = %entry
  call void @_ZN5boost9date_time11int_adapterIxE3maxEv(%"class.boost::date_time::int_adapter"* sret %agg.result)
  br label %return

sw.bb4:                                           ; preds = %entry
  call void @_ZN5boost9date_time11int_adapterIxE3minEv(%"class.boost::date_time::int_adapter"* sret %agg.result)
  br label %return

sw.default:                                       ; preds = %entry
  call void @_ZN5boost9date_time11int_adapterIxE12not_a_numberEv(%"class.boost::date_time::int_adapter"* sret %agg.result)
  br label %return

return:                                           ; preds = %sw.default, %sw.bb4, %sw.bb3, %sw.bb2, %sw.bb1, %sw.bb
  ret void
}

define linkonce_odr void @_ZN5boost9date_time11int_adapterIxE3maxEv(%"class.boost::date_time::int_adapter"* noalias sret %agg.result) align 2 {
entry:
  %call = call i64 @_ZNSt14numeric_limitsIxE3maxEv() nounwind
  %sub = sub nsw i64 %call, 2
  call void @_ZN5boost9date_time11int_adapterIxEC1Ex(%"class.boost::date_time::int_adapter"* %agg.result, i64 %sub)
  ret void
}

define linkonce_odr void @_ZN5boost9date_time11int_adapterIxE3minEv(%"class.boost::date_time::int_adapter"* noalias sret %agg.result) align 2 {
entry:
  %call = call i64 @_ZNSt14numeric_limitsIxE3minEv() nounwind
  %add = add nsw i64 %call, 1
  call void @_ZN5boost9date_time11int_adapterIxEC1Ex(%"class.boost::date_time::int_adapter"* %agg.result, i64 %add)
  ret void
}

define linkonce_odr void @_ZN14thread_adapterC2EPFvPvES0_(%class.thread_adapter* %this, void (i8*)* %func, i8* %param) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %class.thread_adapter*, align 4
  %func.addr = alloca void (i8*)*, align 4
  %param.addr = alloca i8*, align 4
  store %class.thread_adapter* %this, %class.thread_adapter** %this.addr, align 4
  store void (i8*)* %func, void (i8*)** %func.addr, align 4
  store i8* %param, i8** %param.addr, align 4
  %this1 = load %class.thread_adapter** %this.addr
  %_func = getelementptr inbounds %class.thread_adapter* %this1, i32 0, i32 0
  %0 = load void (i8*)** %func.addr, align 4
  store void (i8*)* %0, void (i8*)** %_func, align 4
  %_param = getelementptr inbounds %class.thread_adapter* %this1, i32 0, i32 1
  %1 = load i8** %param.addr, align 4
  store i8* %1, i8** %_param, align 4
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

declare i32 @pthread_cond_broadcast(%union.pthread_cond_t*) nounwind

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
  call void @__assert_fail(i8* getelementptr inbounds ([25 x i8]* @.str34, i32 0, i32 0), i8* getelementptr inbounds ([77 x i8]* @.str46, i32 0, i32 0), i32 30, i8* getelementptr inbounds ([57 x i8]* @__PRETTY_FUNCTION__._ZN5boost7pthread25pthread_mutex_scoped_lock6unlockEv, i32 0, i32 0)) noreturn nounwind
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
  call void @__assert_fail(i8* getelementptr inbounds ([23 x i8]* @.str38, i32 0, i32 0), i8* getelementptr inbounds ([77 x i8]* @.str46, i32 0, i32 0), i32 26, i8* getelementptr inbounds ([88 x i8]* @__PRETTY_FUNCTION__._ZN5boost7pthread25pthread_mutex_scoped_lockC2EP15pthread_mutex_t, i32 0, i32 0)) noreturn nounwind
  unreachable
                                                  ; No predecessors!
  br label %cond.end

cond.end:                                         ; preds = %2, %cond.true
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
  call void @__assert_fail(i8* getelementptr inbounds ([40 x i8]* @.str25, i32 0, i32 0), i8* getelementptr inbounds ([70 x i8]* @.str45, i32 0, i32 0), i32 133, i8* getelementptr inbounds ([57 x i8]* @__PRETTY_FUNCTION__._ZN5boost22condition_variable_anyD2Ev, i32 0, i32 0)) noreturn nounwind
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
  call void @__assert_fail(i8* getelementptr inbounds ([29 x i8]* @.str47, i32 0, i32 0), i8* getelementptr inbounds ([70 x i8]* @.str45, i32 0, i32 0), i32 134, i8* getelementptr inbounds ([57 x i8]* @__PRETTY_FUNCTION__._ZN5boost22condition_variable_anyD2Ev, i32 0, i32 0)) noreturn nounwind
  unreachable
                                                  ; No predecessors!
  br label %cond.end6

cond.end6:                                        ; preds = %1, %cond.true4
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
  call void @_ZN5boost21thread_resource_errorC1EiPKc(%"class.boost::thread_resource_error"* %ref.tmp, i32 %1, i8* getelementptr inbounds ([52 x i8]* @.str48, i32 0, i32 0))
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
  call void @__assert_fail(i8* getelementptr inbounds ([40 x i8]* @.str25, i32 0, i32 0), i8* getelementptr inbounds ([70 x i8]* @.str45, i32 0, i32 0), i32 127, i8* getelementptr inbounds ([56 x i8]* @__PRETTY_FUNCTION__._ZN5boost22condition_variable_anyC2Ev, i32 0, i32 0)) noreturn nounwind
  unreachable
                                                  ; No predecessors!
  br label %cond.end

cond.end:                                         ; preds = %6, %cond.true
  %7 = load i32* %res, align 4
  call void @_ZN5boost21thread_resource_errorC1EiPKc(%"class.boost::thread_resource_error"* %ref.tmp10, i32 %7, i8* getelementptr inbounds ([51 x i8]* @.str49, i32 0, i32 0))
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
  call void @_ZN5boost21thread_resource_errorC1EiPKc(%"class.boost::thread_resource_error"* %ref.tmp, i32 %1, i8* getelementptr inbounds ([55 x i8]* @.str50, i32 0, i32 0))
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

!0 = metadata !{i32 4023965, i32 4023972}         
!1 = metadata !{i32 4024277, i32 4024284}         
