; ModuleID = 'fibonacci_heap.cpp'
target datalayout = "e-p:32:32:32-i1:8:8-i8:8:8-i16:16:16-i32:32:32-i64:32:64-f32:32:32-f64:32:64-v64:64:64-v128:128:128-a0:0:64-f80:32:32-n8:16:32-S128"
target triple = "i386-pc-linux-gnu"

%"class.std::ios_base::Init" = type { i8 }
%"class.boost::detail::make_property_map_from_arg_pack_gen" = type { i32 }
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
%"class.boost::random::mersenne_twister_engine" = type { [624 x i32], i32 }
%"class.boost::uniform_int" = type { %"class.boost::random::uniform_int_distribution" }
%"class.boost::random::uniform_int_distribution" = type { i32, i32 }
%"class.boost::random::variate_generator" = type { %"class.boost::random::mersenne_twister_engine"*, %"class.boost::uniform_int" }
%"class.std::vector" = type { %"struct.std::_Vector_base" }
%"struct.std::_Vector_base" = type { %"struct.std::_Vector_base<float, std::allocator<float> >::_Vector_impl" }
%"struct.std::_Vector_base<float, std::allocator<float> >::_Vector_impl" = type { float*, float*, float* }
%"class.std::allocator" = type { i8 }
%"class.boost::indirect_cmp" = type { float*, %"struct.std::less" }
%"struct.std::less" = type { i8 }
%"class.boost::fibonacci_heap" = type { %"class.std::vector.0", %"class.std::vector.5", %"class.std::vector.5", %"class.std::vector.5", %"class.std::vector.10", %"class.std::vector.5", i32, i32, %"struct.boost::typed_identity_property_map", %"class.boost::indirect_cmp", %"class.std::vector.5", %"class.std::vector.5" }
%"class.std::vector.0" = type { %"struct.std::_Vector_base.1" }
%"struct.std::_Vector_base.1" = type { %"struct.std::_Vector_base<int, std::allocator<int> >::_Vector_impl" }
%"struct.std::_Vector_base<int, std::allocator<int> >::_Vector_impl" = type { i32*, i32*, i32* }
%"class.std::vector.5" = type { %"struct.std::_Vector_base.6" }
%"struct.std::_Vector_base.6" = type { %"struct.std::_Vector_base<unsigned int, std::allocator<unsigned int> >::_Vector_impl" }
%"struct.std::_Vector_base<unsigned int, std::allocator<unsigned int> >::_Vector_impl" = type { i32*, i32*, i32* }
%"class.std::vector.10" = type { %"struct.std::_Bvector_base" }
%"struct.std::_Bvector_base" = type { %"struct.std::_Bvector_base<std::allocator<bool> >::_Bvector_impl" }
%"struct.std::_Bvector_base<std::allocator<bool> >::_Bvector_impl" = type { %"struct.std::_Bit_iterator", %"struct.std::_Bit_iterator", i32* }
%"struct.std::_Bit_iterator" = type { %"struct.std::_Bit_iterator_base" }
%"struct.std::_Bit_iterator_base" = type { i32*, i32 }
%"struct.boost::typed_identity_property_map" = type { i8 }
%"class.__gnu_cxx::__normal_iterator" = type { float* }
%"class.std::ostream_iterator" = type { %"class.std::basic_ostream"*, i8* }
%"struct.std::_Bit_reference" = type { i32*, i32 }
%"struct.boost::put_get_helper" = type { i8 }
%"class.__gnu_cxx::new_allocator" = type { i8 }
%"class.__gnu_cxx::__normal_iterator.15" = type { i32* }
%"struct.std::iterator.14" = type { i8 }
%"struct.std::iterator" = type { i8 }
%"struct.mpl_::bool_" = type { i8 }
%"struct.boost::is_integral" = type { i8 }
%"struct.boost::random::detail::subtract" = type { i8 }
%"struct.boost::random::detail::subtract.16" = type { i8 }
%"struct.boost::random::detail::add" = type { i8 }
%"struct.boost::random::detail::add.17" = type { i8 }
%"class.std::allocator.2" = type { i8 }
%"class.std::allocator.7" = type { i8 }
%"class.std::allocator.18" = type { i8 }
%"class.__gnu_cxx::new_allocator.3" = type { i8 }
%"class.__gnu_cxx::new_allocator.12" = type { i8 }
%"class.std::allocator.11" = type { i8 }
%"class.__gnu_cxx::new_allocator.8" = type { i8 }
%"class.__gnu_cxx::new_allocator.19" = type { i8 }

@_ZStL8__ioinit = internal global %"class.std::ios_base::Init" zeroinitializer, align 1
@__dso_handle = external global i8
@_ZN5boost6detailL28make_color_map_from_arg_packE = internal global %"class.boost::detail::make_property_map_from_arg_pack_gen" zeroinitializer, align 4
@_ZSt4cout = external global %"class.std::basic_ostream"
@.str = private unnamed_addr constant [14 x i8] c"heap sorted: \00", align 1
@.str2 = private unnamed_addr constant [2 x i8] c" \00", align 1
@.str3 = private unnamed_addr constant [10 x i8] c"correct: \00", align 1
@.str4 = private unnamed_addr constant [27 x i8] c"fibonacci heap passed test\00", align 1
@.str5 = private unnamed_addr constant [22 x i8] c"vector::_M_insert_aux\00", align 1
@.str6 = private unnamed_addr constant [22 x i8] c"!_compare(_key[v], d)\00", align 1
@.str7 = private unnamed_addr constant [59 x i8] c"/home/thomas/boost_1_52_0/boost/pending/fibonacci_heap.hpp\00", align 1
@__PRETTY_FUNCTION__._ZN5boost14fibonacci_heapIiNS_12indirect_cmpIPfSt4lessIfEEENS_27typed_identity_property_mapIjEEE6updateERKi = private unnamed_addr constant [275 x i8] c"void boost::fibonacci_heap<int, boost::indirect_cmp<float *, std::less<float> >, boost::typed_identity_property_map<unsigned int> >::update(const T &) [T = int, Compare = boost::indirect_cmp<float *, std::less<float> >, ID = boost::typed_identity_property_map<unsigned int>]\00", align 1
@.str8 = private unnamed_addr constant [19 x i8] c"min_arg <= max_arg\00", align 1
@.str9 = private unnamed_addr constant [68 x i8] c"/home/thomas/boost_1_52_0/boost/random/uniform_int_distribution.hpp\00", align 1
@__PRETTY_FUNCTION__._ZN5boost6random24uniform_int_distributionIiEC2Eii = private unnamed_addr constant [105 x i8] c"boost::random::uniform_int_distribution<int>::uniform_int_distribution(IntType, IntType) [IntType = int]\00", align 1
@_ZN5boost6random23mersenne_twister_engineIjLj32ELj624ELj397ELj31ELj2567483615ELj11ELj4294967295ELj7ELj2636928640ELj15ELj4022730752ELj18ELj1812433253EE12default_seedE = weak_odr constant i32 5489, align 4
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
  call void @_ZN5boost6detail35make_property_map_from_arg_pack_genINS_5graph8keywords3tag9color_mapENS_18default_color_typeEEC1ES6_(%"class.boost::detail::make_property_map_from_arg_pack_gen"* @_ZN5boost6detailL28make_color_map_from_arg_packE, i32 0)
  ret void
}

define linkonce_odr void @_ZN5boost6detail35make_property_map_from_arg_pack_genINS_5graph8keywords3tag9color_mapENS_18default_color_typeEEC1ES6_(%"class.boost::detail::make_property_map_from_arg_pack_gen"* %this, i32 %default_value) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::detail::make_property_map_from_arg_pack_gen"*, align 4
  %default_value.addr = alloca i32, align 4
  store %"class.boost::detail::make_property_map_from_arg_pack_gen"* %this, %"class.boost::detail::make_property_map_from_arg_pack_gen"** %this.addr, align 4
  store i32 %default_value, i32* %default_value.addr, align 4
  %this1 = load %"class.boost::detail::make_property_map_from_arg_pack_gen"** %this.addr
  %0 = load i32* %default_value.addr, align 4
  call void @_ZN5boost6detail35make_property_map_from_arg_pack_genINS_5graph8keywords3tag9color_mapENS_18default_color_typeEEC2ES6_(%"class.boost::detail::make_property_map_from_arg_pack_gen"* %this1, i32 %0)
  ret void
}

define i32 @main() {
entry:
  %retval = alloca i32, align 4
  %i = alloca i32, align 4
  %gen = alloca %"class.boost::random::mersenne_twister_engine", align 4
  %N = alloca i32, align 4
  %distrib = alloca %"class.boost::uniform_int", align 4
  %rand_gen = alloca %"class.boost::random::variate_generator", align 4
  %agg.tmp = alloca %"class.boost::uniform_int", align 4
  %t = alloca i32, align 4
  %v = alloca %"class.std::vector", align 4
  %w = alloca %"class.std::vector", align 4
  %ref.tmp = alloca float, align 4
  %ref.tmp4 = alloca %"class.std::allocator", align 1
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  %cmp5 = alloca %"class.boost::indirect_cmp", align 4
  %ref.tmp8 = alloca float*, align 4
  %ref.tmp9 = alloca %"struct.std::less", align 1
  %Q = alloca %"class.boost::fibonacci_heap", align 4
  %ref.tmp11 = alloca %"struct.boost::typed_identity_property_map", align 1
  %c = alloca i32, align 4
  %agg.tmp21 = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %agg.tmp23 = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %u = alloca i32, align 4
  %r = alloca float, align 4
  %agg.tmp64 = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %agg.tmp66 = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %agg.tmp69 = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %agg.tmp71 = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %agg.tmp73 = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %agg.tmp81 = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %agg.tmp83 = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %agg.tmp85 = alloca %"class.std::ostream_iterator", align 4
  %tmp = alloca %"class.std::ostream_iterator", align 4
  %agg.tmp92 = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %agg.tmp94 = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %agg.tmp96 = alloca %"class.std::ostream_iterator", align 4
  %tmp98 = alloca %"class.std::ostream_iterator", align 4
  %cleanup.dest.slot = alloca i32
  store i32 0, i32* %retval
  call void @_ZN5boost6random23mersenne_twister_engineIjLj32ELj624ELj397ELj31ELj2567483615ELj11ELj4294967295ELj7ELj2636928640ELj15ELj4022730752ELj18ELj1812433253EEC1Ev(%"class.boost::random::mersenne_twister_engine"* %gen)
  store i32 2, i32* %N, align 4
  br label %for.cond

for.cond:                                         ; preds = %for.inc114, %entry
  %0 = load i32* %N, align 4
  %cmp = icmp slt i32 %0, 200
  br i1 %cmp, label %for.body, label %for.end116

for.body:                                         ; preds = %for.cond
  %1 = load i32* %N, align 4
  %sub = sub nsw i32 %1, 1
  call void @_ZN5boost11uniform_intIiEC1Eii(%"class.boost::uniform_int"* %distrib, i32 0, i32 %sub)
  %2 = bitcast %"class.boost::uniform_int"* %agg.tmp to i8*
  %3 = bitcast %"class.boost::uniform_int"* %distrib to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %2, i8* %3, i32 8, i32 4, i1 false)
  call void @_ZN5boost6random17variate_generatorIRNS0_23mersenne_twister_engineIjLj32ELj624ELj397ELj31ELj2567483615ELj11ELj4294967295ELj7ELj2636928640ELj15ELj4022730752ELj18ELj1812433253EEENS_11uniform_intIiEEEC1ES4_S6_(%"class.boost::random::variate_generator"* %rand_gen, %"class.boost::random::mersenne_twister_engine"* %gen, %"class.boost::uniform_int"* byval align 4 %agg.tmp)
  store i32 0, i32* %t, align 4
  br label %for.cond1

for.cond1:                                        ; preds = %for.inc111, %for.body
  %4 = load i32* %t, align 4
  %cmp2 = icmp slt i32 %4, 10
  br i1 %cmp2, label %for.body3, label %for.end113

for.body3:                                        ; preds = %for.cond1
  call void @_ZNSt6vectorIfSaIfEEC1Ev(%"class.std::vector"* %v)
  %5 = load i32* %N, align 4
  store float 0.000000e+00, float* %ref.tmp, align 4
  call void @_ZNSaIfEC1Ev(%"class.std::allocator"* %ref.tmp4) nounwind
  invoke void @_ZNSt6vectorIfSaIfEEC1EjRKfRKS0_(%"class.std::vector"* %w, i32 %5, float* %ref.tmp, %"class.std::allocator"* %ref.tmp4)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %for.body3
  call void @_ZNSaIfED1Ev(%"class.std::allocator"* %ref.tmp4) nounwind
  %call = invoke float* @_ZNSt6vectorIfSaIfEEixEj(%"class.std::vector"* %w, i32 0)
          to label %invoke.cont7 unwind label %lpad6

invoke.cont7:                                     ; preds = %invoke.cont
  store float* %call, float** %ref.tmp8, align 4
  invoke void @_ZN5boost12indirect_cmpIPfSt4lessIfEEC1ERKS1_RKS3_(%"class.boost::indirect_cmp"* %cmp5, float** %ref.tmp8, %"struct.std::less"* %ref.tmp9)
          to label %invoke.cont10 unwind label %lpad6

invoke.cont10:                                    ; preds = %invoke.cont7
  %6 = load i32* %N, align 4
  invoke void @_ZN5boost14fibonacci_heapIiNS_12indirect_cmpIPfSt4lessIfEEENS_27typed_identity_property_mapIjEEEC1EjRKS5_RKS7_(%"class.boost::fibonacci_heap"* %Q, i32 %6, %"class.boost::indirect_cmp"* %cmp5, %"struct.boost::typed_identity_property_map"* %ref.tmp11)
          to label %invoke.cont12 unwind label %lpad6

invoke.cont12:                                    ; preds = %invoke.cont10
  store i32 0, i32* %c, align 4
  br label %for.cond13

for.cond13:                                       ; preds = %for.inc, %invoke.cont12
  %7 = load i32* %c, align 4
  %call16 = invoke i32 @_ZNKSt6vectorIfSaIfEE4sizeEv(%"class.std::vector"* %w)
          to label %invoke.cont15 unwind label %lpad14

invoke.cont15:                                    ; preds = %for.cond13
  %cmp17 = icmp ult i32 %7, %call16
  br i1 %cmp17, label %for.body18, label %for.end

for.body18:                                       ; preds = %invoke.cont15
  %8 = load i32* %c, align 4
  %conv = sitofp i32 %8 to float
  %9 = load i32* %c, align 4
  %call20 = invoke float* @_ZNSt6vectorIfSaIfEEixEj(%"class.std::vector"* %w, i32 %9)
          to label %invoke.cont19 unwind label %lpad14

invoke.cont19:                                    ; preds = %for.body18
  store float %conv, float* %call20
  br label %for.inc

for.inc:                                          ; preds = %invoke.cont19
  %10 = load i32* %c, align 4
  %inc = add nsw i32 %10, 1
  store i32 %inc, i32* %c, align 4
  br label %for.cond13

lpad:                                             ; preds = %for.body3
  %11 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %12 = extractvalue { i8*, i32 } %11, 0
  store i8* %12, i8** %exn.slot
  %13 = extractvalue { i8*, i32 } %11, 1
  store i32 %13, i32* %ehselector.slot
  call void @_ZNSaIfED1Ev(%"class.std::allocator"* %ref.tmp4) nounwind
  br label %ehcleanup109

lpad6:                                            ; preds = %cleanup, %invoke.cont10, %invoke.cont7, %invoke.cont
  %14 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %15 = extractvalue { i8*, i32 } %14, 0
  store i8* %15, i8** %exn.slot
  %16 = extractvalue { i8*, i32 } %14, 1
  store i32 %16, i32* %ehselector.slot
  br label %ehcleanup

lpad14:                                           ; preds = %invoke.cont99, %invoke.cont97, %invoke.cont95, %invoke.cont93, %invoke.cont90, %invoke.cont88, %invoke.cont87, %invoke.cont86, %invoke.cont84, %invoke.cont82, %invoke.cont79, %invoke.cont77, %if.then, %invoke.cont74, %invoke.cont72, %invoke.cont70, %invoke.cont68, %invoke.cont67, %invoke.cont65, %for.end63, %invoke.cont59, %invoke.cont57, %invoke.cont55, %for.body54, %invoke.cont46, %invoke.cont43, %invoke.cont38, %invoke.cont36, %for.body35, %for.body28, %invoke.cont24, %invoke.cont22, %for.end, %for.body18, %for.cond13
  %17 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %18 = extractvalue { i8*, i32 } %17, 0
  store i8* %18, i8** %exn.slot
  %19 = extractvalue { i8*, i32 } %17, 1
  store i32 %19, i32* %ehselector.slot
  invoke void @_ZN5boost14fibonacci_heapIiNS_12indirect_cmpIPfSt4lessIfEEENS_27typed_identity_property_mapIjEEED1Ev(%"class.boost::fibonacci_heap"* %Q)
          to label %invoke.cont103 unwind label %terminate.lpad

for.end:                                          ; preds = %invoke.cont15
  invoke void @_ZNSt6vectorIfSaIfEE5beginEv(%"class.__gnu_cxx::__normal_iterator"* sret %agg.tmp21, %"class.std::vector"* %w)
          to label %invoke.cont22 unwind label %lpad14

invoke.cont22:                                    ; preds = %for.end
  invoke void @_ZNSt6vectorIfSaIfEE3endEv(%"class.__gnu_cxx::__normal_iterator"* sret %agg.tmp23, %"class.std::vector"* %w)
          to label %invoke.cont24 unwind label %lpad14

invoke.cont24:                                    ; preds = %invoke.cont22
  invoke void @_ZSt14random_shuffleIN9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEEEEvT_S7_(%"class.__gnu_cxx::__normal_iterator"* byval align 4 %agg.tmp21, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %agg.tmp23)
          to label %invoke.cont25 unwind label %lpad14

invoke.cont25:                                    ; preds = %invoke.cont24
  store i32 0, i32* %i, align 4
  br label %for.cond26

for.cond26:                                       ; preds = %for.inc30, %invoke.cont25
  %20 = load i32* %i, align 4
  %21 = load i32* %N, align 4
  %cmp27 = icmp slt i32 %20, %21
  br i1 %cmp27, label %for.body28, label %for.end32

for.body28:                                       ; preds = %for.cond26
  invoke void @_ZN5boost14fibonacci_heapIiNS_12indirect_cmpIPfSt4lessIfEEENS_27typed_identity_property_mapIjEEE4pushERKi(%"class.boost::fibonacci_heap"* %Q, i32* %i)
          to label %invoke.cont29 unwind label %lpad14

invoke.cont29:                                    ; preds = %for.body28
  br label %for.inc30

for.inc30:                                        ; preds = %invoke.cont29
  %22 = load i32* %i, align 4
  %inc31 = add nsw i32 %22, 1
  store i32 %inc31, i32* %i, align 4
  br label %for.cond26

for.end32:                                        ; preds = %for.cond26
  store i32 0, i32* %i, align 4
  br label %for.cond33

for.cond33:                                       ; preds = %for.inc49, %for.end32
  %23 = load i32* %i, align 4
  %24 = load i32* %N, align 4
  %cmp34 = icmp slt i32 %23, %24
  br i1 %cmp34, label %for.body35, label %for.end51

for.body35:                                       ; preds = %for.cond33
  %call37 = invoke i32 @_ZN5boost6random17variate_generatorIRNS0_23mersenne_twister_engineIjLj32ELj624ELj397ELj31ELj2567483615ELj11ELj4294967295ELj7ELj2636928640ELj15ELj4022730752ELj18ELj1812433253EEENS_11uniform_intIiEEEclEv(%"class.boost::random::variate_generator"* %rand_gen)
          to label %invoke.cont36 unwind label %lpad14

invoke.cont36:                                    ; preds = %for.body35
  store i32 %call37, i32* %u, align 4
  %call39 = invoke i32 @_ZN5boost6random17variate_generatorIRNS0_23mersenne_twister_engineIjLj32ELj624ELj397ELj31ELj2567483615ELj11ELj4294967295ELj7ELj2636928640ELj15ELj4022730752ELj18ELj1812433253EEENS_11uniform_intIiEEEclEv(%"class.boost::random::variate_generator"* %rand_gen)
          to label %invoke.cont38 unwind label %lpad14

invoke.cont38:                                    ; preds = %invoke.cont36
  %conv40 = sitofp i32 %call39 to float
  store float %conv40, float* %r, align 4
  %25 = load float* %r, align 4
  %conv41 = fpext float %25 to double
  %div = fdiv double %conv41, 2.000000e+00
  %conv42 = fptrunc double %div to float
  store float %conv42, float* %r, align 4
  %26 = load i32* %u, align 4
  %call44 = invoke float* @_ZNSt6vectorIfSaIfEEixEj(%"class.std::vector"* %w, i32 %26)
          to label %invoke.cont43 unwind label %lpad14

invoke.cont43:                                    ; preds = %invoke.cont38
  %27 = load float* %call44
  %28 = load float* %r, align 4
  %sub45 = fsub float %27, %28
  %29 = load i32* %u, align 4
  %call47 = invoke float* @_ZNSt6vectorIfSaIfEEixEj(%"class.std::vector"* %w, i32 %29)
          to label %invoke.cont46 unwind label %lpad14

invoke.cont46:                                    ; preds = %invoke.cont43
  store float %sub45, float* %call47
  invoke void @_ZN5boost14fibonacci_heapIiNS_12indirect_cmpIPfSt4lessIfEEENS_27typed_identity_property_mapIjEEE6updateERKi(%"class.boost::fibonacci_heap"* %Q, i32* %u)
          to label %invoke.cont48 unwind label %lpad14

invoke.cont48:                                    ; preds = %invoke.cont46
  br label %for.inc49

for.inc49:                                        ; preds = %invoke.cont48
  %30 = load i32* %i, align 4
  %inc50 = add nsw i32 %30, 1
  store i32 %inc50, i32* %i, align 4
  br label %for.cond33

for.end51:                                        ; preds = %for.cond33
  store i32 0, i32* %i, align 4
  br label %for.cond52

for.cond52:                                       ; preds = %for.inc61, %for.end51
  %31 = load i32* %i, align 4
  %32 = load i32* %N, align 4
  %cmp53 = icmp slt i32 %31, %32
  br i1 %cmp53, label %for.body54, label %for.end63

for.body54:                                       ; preds = %for.cond52
  %call56 = invoke i32* @_ZN5boost14fibonacci_heapIiNS_12indirect_cmpIPfSt4lessIfEEENS_27typed_identity_property_mapIjEEE3topEv(%"class.boost::fibonacci_heap"* %Q)
          to label %invoke.cont55 unwind label %lpad14

invoke.cont55:                                    ; preds = %for.body54
  %33 = load i32* %call56
  %call58 = invoke float* @_ZNSt6vectorIfSaIfEEixEj(%"class.std::vector"* %w, i32 %33)
          to label %invoke.cont57 unwind label %lpad14

invoke.cont57:                                    ; preds = %invoke.cont55
  invoke void @_ZNSt6vectorIfSaIfEE9push_backERKf(%"class.std::vector"* %v, float* %call58)
          to label %invoke.cont59 unwind label %lpad14

invoke.cont59:                                    ; preds = %invoke.cont57
  invoke void @_ZN5boost14fibonacci_heapIiNS_12indirect_cmpIPfSt4lessIfEEENS_27typed_identity_property_mapIjEEE3popEv(%"class.boost::fibonacci_heap"* %Q)
          to label %invoke.cont60 unwind label %lpad14

invoke.cont60:                                    ; preds = %invoke.cont59
  br label %for.inc61

for.inc61:                                        ; preds = %invoke.cont60
  %34 = load i32* %i, align 4
  %inc62 = add nsw i32 %34, 1
  store i32 %inc62, i32* %i, align 4
  br label %for.cond52

for.end63:                                        ; preds = %for.cond52
  invoke void @_ZNSt6vectorIfSaIfEE5beginEv(%"class.__gnu_cxx::__normal_iterator"* sret %agg.tmp64, %"class.std::vector"* %w)
          to label %invoke.cont65 unwind label %lpad14

invoke.cont65:                                    ; preds = %for.end63
  invoke void @_ZNSt6vectorIfSaIfEE3endEv(%"class.__gnu_cxx::__normal_iterator"* sret %agg.tmp66, %"class.std::vector"* %w)
          to label %invoke.cont67 unwind label %lpad14

invoke.cont67:                                    ; preds = %invoke.cont65
  invoke void @_ZSt4sortIN9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEEEEvT_S7_(%"class.__gnu_cxx::__normal_iterator"* byval align 4 %agg.tmp64, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %agg.tmp66)
          to label %invoke.cont68 unwind label %lpad14

invoke.cont68:                                    ; preds = %invoke.cont67
  invoke void @_ZNSt6vectorIfSaIfEE5beginEv(%"class.__gnu_cxx::__normal_iterator"* sret %agg.tmp69, %"class.std::vector"* %v)
          to label %invoke.cont70 unwind label %lpad14

invoke.cont70:                                    ; preds = %invoke.cont68
  invoke void @_ZNSt6vectorIfSaIfEE3endEv(%"class.__gnu_cxx::__normal_iterator"* sret %agg.tmp71, %"class.std::vector"* %v)
          to label %invoke.cont72 unwind label %lpad14

invoke.cont72:                                    ; preds = %invoke.cont70
  invoke void @_ZNSt6vectorIfSaIfEE5beginEv(%"class.__gnu_cxx::__normal_iterator"* sret %agg.tmp73, %"class.std::vector"* %w)
          to label %invoke.cont74 unwind label %lpad14

invoke.cont74:                                    ; preds = %invoke.cont72
  %call76 = invoke zeroext i1 @_ZSt5equalIN9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEEES6_EbT_S7_T0_(%"class.__gnu_cxx::__normal_iterator"* byval align 4 %agg.tmp69, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %agg.tmp71, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %agg.tmp73)
          to label %invoke.cont75 unwind label %lpad14

invoke.cont75:                                    ; preds = %invoke.cont74
  br i1 %call76, label %if.end, label %if.then

if.then:                                          ; preds = %invoke.cont75
  %call78 = invoke %"class.std::basic_ostream"* @_ZNSolsEPFRSoS_E(%"class.std::basic_ostream"* @_ZSt4cout, %"class.std::basic_ostream"* (%"class.std::basic_ostream"*)* @_ZSt4endlIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_)
          to label %invoke.cont77 unwind label %lpad14

invoke.cont77:                                    ; preds = %if.then
  %call80 = invoke %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* %call78, i8* getelementptr inbounds ([14 x i8]* @.str, i32 0, i32 0))
          to label %invoke.cont79 unwind label %lpad14

invoke.cont79:                                    ; preds = %invoke.cont77
  invoke void @_ZNSt6vectorIfSaIfEE5beginEv(%"class.__gnu_cxx::__normal_iterator"* sret %agg.tmp81, %"class.std::vector"* %v)
          to label %invoke.cont82 unwind label %lpad14

invoke.cont82:                                    ; preds = %invoke.cont79
  invoke void @_ZNSt6vectorIfSaIfEE3endEv(%"class.__gnu_cxx::__normal_iterator"* sret %agg.tmp83, %"class.std::vector"* %v)
          to label %invoke.cont84 unwind label %lpad14

invoke.cont84:                                    ; preds = %invoke.cont82
  invoke void @_ZNSt16ostream_iteratorIfcSt11char_traitsIcEEC1ERSoPKc(%"class.std::ostream_iterator"* %agg.tmp85, %"class.std::basic_ostream"* @_ZSt4cout, i8* getelementptr inbounds ([2 x i8]* @.str2, i32 0, i32 0))
          to label %invoke.cont86 unwind label %lpad14

invoke.cont86:                                    ; preds = %invoke.cont84
  invoke void @_ZSt4copyIN9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEEESt16ostream_iteratorIfcSt11char_traitsIcEEET0_T_SC_SB_(%"class.std::ostream_iterator"* sret %tmp, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %agg.tmp81, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %agg.tmp83, %"class.std::ostream_iterator"* %agg.tmp85)
          to label %invoke.cont87 unwind label %lpad14

invoke.cont87:                                    ; preds = %invoke.cont86
  %call89 = invoke %"class.std::basic_ostream"* @_ZNSolsEPFRSoS_E(%"class.std::basic_ostream"* @_ZSt4cout, %"class.std::basic_ostream"* (%"class.std::basic_ostream"*)* @_ZSt4endlIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_)
          to label %invoke.cont88 unwind label %lpad14

invoke.cont88:                                    ; preds = %invoke.cont87
  %call91 = invoke %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* %call89, i8* getelementptr inbounds ([10 x i8]* @.str3, i32 0, i32 0))
          to label %invoke.cont90 unwind label %lpad14

invoke.cont90:                                    ; preds = %invoke.cont88
  invoke void @_ZNSt6vectorIfSaIfEE5beginEv(%"class.__gnu_cxx::__normal_iterator"* sret %agg.tmp92, %"class.std::vector"* %w)
          to label %invoke.cont93 unwind label %lpad14

invoke.cont93:                                    ; preds = %invoke.cont90
  invoke void @_ZNSt6vectorIfSaIfEE3endEv(%"class.__gnu_cxx::__normal_iterator"* sret %agg.tmp94, %"class.std::vector"* %w)
          to label %invoke.cont95 unwind label %lpad14

invoke.cont95:                                    ; preds = %invoke.cont93
  invoke void @_ZNSt16ostream_iteratorIfcSt11char_traitsIcEEC1ERSoPKc(%"class.std::ostream_iterator"* %agg.tmp96, %"class.std::basic_ostream"* @_ZSt4cout, i8* getelementptr inbounds ([2 x i8]* @.str2, i32 0, i32 0))
          to label %invoke.cont97 unwind label %lpad14

invoke.cont97:                                    ; preds = %invoke.cont95
  invoke void @_ZSt4copyIN9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEEESt16ostream_iteratorIfcSt11char_traitsIcEEET0_T_SC_SB_(%"class.std::ostream_iterator"* sret %tmp98, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %agg.tmp92, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %agg.tmp94, %"class.std::ostream_iterator"* %agg.tmp96)
          to label %invoke.cont99 unwind label %lpad14

invoke.cont99:                                    ; preds = %invoke.cont97
  %call101 = invoke %"class.std::basic_ostream"* @_ZNSolsEPFRSoS_E(%"class.std::basic_ostream"* @_ZSt4cout, %"class.std::basic_ostream"* (%"class.std::basic_ostream"*)* @_ZSt4endlIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_)
          to label %invoke.cont100 unwind label %lpad14

invoke.cont100:                                   ; preds = %invoke.cont99
  store i32 -1, i32* %retval
  store i32 1, i32* %cleanup.dest.slot
  br label %cleanup

if.end:                                           ; preds = %invoke.cont75
  store i32 0, i32* %cleanup.dest.slot
  br label %cleanup

cleanup:                                          ; preds = %if.end, %invoke.cont100
  invoke void @_ZN5boost14fibonacci_heapIiNS_12indirect_cmpIPfSt4lessIfEEENS_27typed_identity_property_mapIjEEED1Ev(%"class.boost::fibonacci_heap"* %Q)
          to label %invoke.cont102 unwind label %lpad6

invoke.cont102:                                   ; preds = %cleanup
  invoke void @_ZNSt6vectorIfSaIfEED1Ev(%"class.std::vector"* %w)
          to label %invoke.cont106 unwind label %lpad105

invoke.cont106:                                   ; preds = %invoke.cont102
  call void @_ZNSt6vectorIfSaIfEED1Ev(%"class.std::vector"* %v)
  %cleanup.dest = load i32* %cleanup.dest.slot
  switch i32 %cleanup.dest, label %unreachable [
    i32 0, label %cleanup.cont
    i32 1, label %return
  ]

cleanup.cont:                                     ; preds = %invoke.cont106
  br label %for.inc111

for.inc111:                                       ; preds = %cleanup.cont
  %35 = load i32* %t, align 4
  %inc112 = add nsw i32 %35, 1
  store i32 %inc112, i32* %t, align 4
  br label %for.cond1

invoke.cont103:                                   ; preds = %lpad14
  br label %ehcleanup

lpad105:                                          ; preds = %invoke.cont102
  %36 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %37 = extractvalue { i8*, i32 } %36, 0
  store i8* %37, i8** %exn.slot
  %38 = extractvalue { i8*, i32 } %36, 1
  store i32 %38, i32* %ehselector.slot
  br label %ehcleanup109

ehcleanup:                                        ; preds = %invoke.cont103, %lpad6
  invoke void @_ZNSt6vectorIfSaIfEED1Ev(%"class.std::vector"* %w)
          to label %invoke.cont107 unwind label %terminate.lpad

invoke.cont107:                                   ; preds = %ehcleanup
  br label %ehcleanup109

ehcleanup109:                                     ; preds = %invoke.cont107, %lpad105, %lpad
  invoke void @_ZNSt6vectorIfSaIfEED1Ev(%"class.std::vector"* %v)
          to label %invoke.cont110 unwind label %terminate.lpad

invoke.cont110:                                   ; preds = %ehcleanup109
  br label %eh.resume

for.end113:                                       ; preds = %for.cond1
  br label %for.inc114

for.inc114:                                       ; preds = %for.end113
  %39 = load i32* %N, align 4
  %inc115 = add nsw i32 %39, 1
  store i32 %inc115, i32* %N, align 4
  br label %for.cond

for.end116:                                       ; preds = %for.cond
  %call117 = call %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* @_ZSt4cout, i8* getelementptr inbounds ([27 x i8]* @.str4, i32 0, i32 0))
  %call118 = call %"class.std::basic_ostream"* @_ZNSolsEPFRSoS_E(%"class.std::basic_ostream"* %call117, %"class.std::basic_ostream"* (%"class.std::basic_ostream"*)* @_ZSt4endlIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_)
  store i32 0, i32* %retval
  br label %return

return:                                           ; preds = %for.end116, %invoke.cont106
  %40 = load i32* %retval
  ret i32 %40

eh.resume:                                        ; preds = %invoke.cont110
  %exn = load i8** %exn.slot
  %sel = load i32* %ehselector.slot
  %lpad.val = insertvalue { i8*, i32 } undef, i8* %exn, 0
  %lpad.val119 = insertvalue { i8*, i32 } %lpad.val, i32 %sel, 1
  resume { i8*, i32 } %lpad.val119

terminate.lpad:                                   ; preds = %ehcleanup109, %ehcleanup, %lpad14
  %41 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          catch i8* null
  call void @_ZSt9terminatev() noreturn nounwind
  unreachable

unreachable:                                      ; preds = %invoke.cont106
  unreachable
}

define linkonce_odr void @_ZN5boost6random23mersenne_twister_engineIjLj32ELj624ELj397ELj31ELj2567483615ELj11ELj4294967295ELj7ELj2636928640ELj15ELj4022730752ELj18ELj1812433253EEC1Ev(%"class.boost::random::mersenne_twister_engine"* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::random::mersenne_twister_engine"*, align 4
  store %"class.boost::random::mersenne_twister_engine"* %this, %"class.boost::random::mersenne_twister_engine"** %this.addr, align 4
  %this1 = load %"class.boost::random::mersenne_twister_engine"** %this.addr
  call void @_ZN5boost6random23mersenne_twister_engineIjLj32ELj624ELj397ELj31ELj2567483615ELj11ELj4294967295ELj7ELj2636928640ELj15ELj4022730752ELj18ELj1812433253EEC2Ev(%"class.boost::random::mersenne_twister_engine"* %this1)
  ret void
}

define linkonce_odr void @_ZN5boost11uniform_intIiEC1Eii(%"class.boost::uniform_int"* %this, i32 %min_arg, i32 %max_arg) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::uniform_int"*, align 4
  %min_arg.addr = alloca i32, align 4
  %max_arg.addr = alloca i32, align 4
  store %"class.boost::uniform_int"* %this, %"class.boost::uniform_int"** %this.addr, align 4
  store i32 %min_arg, i32* %min_arg.addr, align 4
  store i32 %max_arg, i32* %max_arg.addr, align 4
  %this1 = load %"class.boost::uniform_int"** %this.addr
  %0 = load i32* %min_arg.addr, align 4
  %1 = load i32* %max_arg.addr, align 4
  call void @_ZN5boost11uniform_intIiEC2Eii(%"class.boost::uniform_int"* %this1, i32 %0, i32 %1)
  ret void
}

define linkonce_odr void @_ZN5boost6random17variate_generatorIRNS0_23mersenne_twister_engineIjLj32ELj624ELj397ELj31ELj2567483615ELj11ELj4294967295ELj7ELj2636928640ELj15ELj4022730752ELj18ELj1812433253EEENS_11uniform_intIiEEEC1ES4_S6_(%"class.boost::random::variate_generator"* %this, %"class.boost::random::mersenne_twister_engine"* %e, %"class.boost::uniform_int"* byval align 4 %d) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::random::variate_generator"*, align 4
  %e.addr = alloca %"class.boost::random::mersenne_twister_engine"*, align 4
  store %"class.boost::random::variate_generator"* %this, %"class.boost::random::variate_generator"** %this.addr, align 4
  store %"class.boost::random::mersenne_twister_engine"* %e, %"class.boost::random::mersenne_twister_engine"** %e.addr, align 4
  %this1 = load %"class.boost::random::variate_generator"** %this.addr
  %0 = load %"class.boost::random::mersenne_twister_engine"** %e.addr
  call void @_ZN5boost6random17variate_generatorIRNS0_23mersenne_twister_engineIjLj32ELj624ELj397ELj31ELj2567483615ELj11ELj4294967295ELj7ELj2636928640ELj15ELj4022730752ELj18ELj1812433253EEENS_11uniform_intIiEEEC2ES4_S6_(%"class.boost::random::variate_generator"* %this1, %"class.boost::random::mersenne_twister_engine"* %0, %"class.boost::uniform_int"* byval align 4 %d)
  ret void
}

declare void @llvm.memcpy.p0i8.p0i8.i32(i8* nocapture, i8* nocapture, i32, i32, i1) nounwind

define linkonce_odr void @_ZNSt6vectorIfSaIfEEC1Ev(%"class.std::vector"* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.std::vector"*, align 4
  store %"class.std::vector"* %this, %"class.std::vector"** %this.addr, align 4
  %this1 = load %"class.std::vector"** %this.addr
  call void @_ZNSt6vectorIfSaIfEEC2Ev(%"class.std::vector"* %this1)
  ret void
}

define linkonce_odr void @_ZNSt6vectorIfSaIfEEC1EjRKfRKS0_(%"class.std::vector"* %this, i32 %__n, float* %__value, %"class.std::allocator"* %__a) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.std::vector"*, align 4
  %__n.addr = alloca i32, align 4
  %__value.addr = alloca float*, align 4
  %__a.addr = alloca %"class.std::allocator"*, align 4
  store %"class.std::vector"* %this, %"class.std::vector"** %this.addr, align 4
  store i32 %__n, i32* %__n.addr, align 4
  store float* %__value, float** %__value.addr, align 4
  store %"class.std::allocator"* %__a, %"class.std::allocator"** %__a.addr, align 4
  %this1 = load %"class.std::vector"** %this.addr
  %0 = load i32* %__n.addr, align 4
  %1 = load float** %__value.addr
  %2 = load %"class.std::allocator"** %__a.addr
  call void @_ZNSt6vectorIfSaIfEEC2EjRKfRKS0_(%"class.std::vector"* %this1, i32 %0, float* %1, %"class.std::allocator"* %2)
  ret void
}

define linkonce_odr void @_ZNSaIfEC1Ev(%"class.std::allocator"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.std::allocator"*, align 4
  store %"class.std::allocator"* %this, %"class.std::allocator"** %this.addr, align 4
  %this1 = load %"class.std::allocator"** %this.addr
  call void @_ZNSaIfEC2Ev(%"class.std::allocator"* %this1) nounwind
  ret void
}

declare i32 @__gxx_personality_v0(...)

define linkonce_odr void @_ZNSaIfED1Ev(%"class.std::allocator"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.std::allocator"*, align 4
  store %"class.std::allocator"* %this, %"class.std::allocator"** %this.addr, align 4
  %this1 = load %"class.std::allocator"** %this.addr
  call void @_ZNSaIfED2Ev(%"class.std::allocator"* %this1) nounwind
  ret void
}

define linkonce_odr void @_ZN5boost12indirect_cmpIPfSt4lessIfEEC1ERKS1_RKS3_(%"class.boost::indirect_cmp"* %this, float** %df, %"struct.std::less"* %c) unnamed_addr inlinehint align 2 {
entry:
  %this.addr = alloca %"class.boost::indirect_cmp"*, align 4
  %df.addr = alloca float**, align 4
  %c.addr = alloca %"struct.std::less"*, align 4
  store %"class.boost::indirect_cmp"* %this, %"class.boost::indirect_cmp"** %this.addr, align 4
  store float** %df, float*** %df.addr, align 4
  store %"struct.std::less"* %c, %"struct.std::less"** %c.addr, align 4
  %this1 = load %"class.boost::indirect_cmp"** %this.addr
  %0 = load float*** %df.addr
  %1 = load %"struct.std::less"** %c.addr
  call void @_ZN5boost12indirect_cmpIPfSt4lessIfEEC2ERKS1_RKS3_(%"class.boost::indirect_cmp"* %this1, float** %0, %"struct.std::less"* %1)
  ret void
}

define linkonce_odr float* @_ZNSt6vectorIfSaIfEEixEj(%"class.std::vector"* %this, i32 %__n) nounwind align 2 {
entry:
  %this.addr = alloca %"class.std::vector"*, align 4
  %__n.addr = alloca i32, align 4
  store %"class.std::vector"* %this, %"class.std::vector"** %this.addr, align 4
  store i32 %__n, i32* %__n.addr, align 4
  %this1 = load %"class.std::vector"** %this.addr
  %0 = bitcast %"class.std::vector"* %this1 to %"struct.std::_Vector_base"*
  %_M_impl = getelementptr inbounds %"struct.std::_Vector_base"* %0, i32 0, i32 0
  %_M_start = getelementptr inbounds %"struct.std::_Vector_base<float, std::allocator<float> >::_Vector_impl"* %_M_impl, i32 0, i32 0
  %1 = load float** %_M_start, align 4
  %2 = load i32* %__n.addr, align 4
  %add.ptr = getelementptr inbounds float* %1, i32 %2
  ret float* %add.ptr
}

define linkonce_odr void @_ZN5boost14fibonacci_heapIiNS_12indirect_cmpIPfSt4lessIfEEENS_27typed_identity_property_mapIjEEEC1EjRKS5_RKS7_(%"class.boost::fibonacci_heap"* %this, i32 %n, %"class.boost::indirect_cmp"* %cmp, %"struct.boost::typed_identity_property_map"* %id) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::fibonacci_heap"*, align 4
  %n.addr = alloca i32, align 4
  %cmp.addr = alloca %"class.boost::indirect_cmp"*, align 4
  %id.addr = alloca %"struct.boost::typed_identity_property_map"*, align 4
  store %"class.boost::fibonacci_heap"* %this, %"class.boost::fibonacci_heap"** %this.addr, align 4
  store i32 %n, i32* %n.addr, align 4
  store %"class.boost::indirect_cmp"* %cmp, %"class.boost::indirect_cmp"** %cmp.addr, align 4
  store %"struct.boost::typed_identity_property_map"* %id, %"struct.boost::typed_identity_property_map"** %id.addr, align 4
  %this1 = load %"class.boost::fibonacci_heap"** %this.addr
  %0 = load i32* %n.addr, align 4
  %1 = load %"class.boost::indirect_cmp"** %cmp.addr
  %2 = load %"struct.boost::typed_identity_property_map"** %id.addr
  call void @_ZN5boost14fibonacci_heapIiNS_12indirect_cmpIPfSt4lessIfEEENS_27typed_identity_property_mapIjEEEC2EjRKS5_RKS7_(%"class.boost::fibonacci_heap"* %this1, i32 %0, %"class.boost::indirect_cmp"* %1, %"struct.boost::typed_identity_property_map"* %2)
  ret void
}

define linkonce_odr i32 @_ZNKSt6vectorIfSaIfEE4sizeEv(%"class.std::vector"* %this) nounwind align 2 {
entry:
  %this.addr = alloca %"class.std::vector"*, align 4
  store %"class.std::vector"* %this, %"class.std::vector"** %this.addr, align 4
  %this1 = load %"class.std::vector"** %this.addr
  %0 = bitcast %"class.std::vector"* %this1 to %"struct.std::_Vector_base"*
  %_M_impl = getelementptr inbounds %"struct.std::_Vector_base"* %0, i32 0, i32 0
  %_M_finish = getelementptr inbounds %"struct.std::_Vector_base<float, std::allocator<float> >::_Vector_impl"* %_M_impl, i32 0, i32 1
  %1 = load float** %_M_finish, align 4
  %2 = bitcast %"class.std::vector"* %this1 to %"struct.std::_Vector_base"*
  %_M_impl2 = getelementptr inbounds %"struct.std::_Vector_base"* %2, i32 0, i32 0
  %_M_start = getelementptr inbounds %"struct.std::_Vector_base<float, std::allocator<float> >::_Vector_impl"* %_M_impl2, i32 0, i32 0
  %3 = load float** %_M_start, align 4
  %sub.ptr.lhs.cast = ptrtoint float* %1 to i32
  %sub.ptr.rhs.cast = ptrtoint float* %3 to i32
  %sub.ptr.sub = sub i32 %sub.ptr.lhs.cast, %sub.ptr.rhs.cast
  %sub.ptr.div = sdiv exact i32 %sub.ptr.sub, 4
  ret i32 %sub.ptr.div
}

define linkonce_odr void @_ZSt14random_shuffleIN9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEEEEvT_S7_(%"class.__gnu_cxx::__normal_iterator"* byval align 4 %__first, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %__last) inlinehint {
entry:
  %__i = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %ref.tmp = alloca i32, align 4
  %agg.tmp = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %agg.tmp2 = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %ref.tmp5 = alloca i32, align 4
  %call = call zeroext i1 @_ZN9__gnu_cxxneIPfSt6vectorIfSaIfEEEEbRKNS_17__normal_iteratorIT_T0_EESA_(%"class.__gnu_cxx::__normal_iterator"* %__first, %"class.__gnu_cxx::__normal_iterator"* %__last)
  br i1 %call, label %if.then, label %if.end

if.then:                                          ; preds = %entry
  store i32 1, i32* %ref.tmp, align 4
  call void @_ZNK9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEEplERKi(%"class.__gnu_cxx::__normal_iterator"* sret %__i, %"class.__gnu_cxx::__normal_iterator"* %__first, i32* %ref.tmp)
  br label %for.cond

for.cond:                                         ; preds = %for.inc, %if.then
  %call1 = call zeroext i1 @_ZN9__gnu_cxxneIPfSt6vectorIfSaIfEEEEbRKNS_17__normal_iteratorIT_T0_EESA_(%"class.__gnu_cxx::__normal_iterator"* %__i, %"class.__gnu_cxx::__normal_iterator"* %__last)
  br i1 %call1, label %for.body, label %for.end

for.body:                                         ; preds = %for.cond
  %0 = bitcast %"class.__gnu_cxx::__normal_iterator"* %agg.tmp to i8*
  %1 = bitcast %"class.__gnu_cxx::__normal_iterator"* %__i to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %0, i8* %1, i32 4, i32 4, i1 false)
  %call3 = call i32 @rand() nounwind
  %call4 = call i32 @_ZN9__gnu_cxxmiIPfSt6vectorIfSaIfEEEENS_17__normal_iteratorIT_T0_E15difference_typeERKS8_SB_(%"class.__gnu_cxx::__normal_iterator"* %__i, %"class.__gnu_cxx::__normal_iterator"* %__first)
  %add = add nsw i32 %call4, 1
  %rem = srem i32 %call3, %add
  store i32 %rem, i32* %ref.tmp5, align 4
  call void @_ZNK9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEEplERKi(%"class.__gnu_cxx::__normal_iterator"* sret %agg.tmp2, %"class.__gnu_cxx::__normal_iterator"* %__first, i32* %ref.tmp5)
  call void @_ZSt9iter_swapIN9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEEES6_EvT_T0_(%"class.__gnu_cxx::__normal_iterator"* byval align 4 %agg.tmp, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %agg.tmp2)
  br label %for.inc

for.inc:                                          ; preds = %for.body
  %call6 = call %"class.__gnu_cxx::__normal_iterator"* @_ZN9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEEppEv(%"class.__gnu_cxx::__normal_iterator"* %__i)
  br label %for.cond

for.end:                                          ; preds = %for.cond
  br label %if.end

if.end:                                           ; preds = %for.end, %entry
  ret void
}

define linkonce_odr void @_ZNSt6vectorIfSaIfEE5beginEv(%"class.__gnu_cxx::__normal_iterator"* noalias sret %agg.result, %"class.std::vector"* %this) align 2 {
entry:
  %this.addr = alloca %"class.std::vector"*, align 4
  store %"class.std::vector"* %this, %"class.std::vector"** %this.addr, align 4
  %this1 = load %"class.std::vector"** %this.addr
  %0 = bitcast %"class.std::vector"* %this1 to %"struct.std::_Vector_base"*
  %_M_impl = getelementptr inbounds %"struct.std::_Vector_base"* %0, i32 0, i32 0
  %_M_start = getelementptr inbounds %"struct.std::_Vector_base<float, std::allocator<float> >::_Vector_impl"* %_M_impl, i32 0, i32 0
  call void @_ZN9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEEC1ERKS1_(%"class.__gnu_cxx::__normal_iterator"* %agg.result, float** %_M_start)
  ret void
}

define linkonce_odr void @_ZNSt6vectorIfSaIfEE3endEv(%"class.__gnu_cxx::__normal_iterator"* noalias sret %agg.result, %"class.std::vector"* %this) align 2 {
entry:
  %this.addr = alloca %"class.std::vector"*, align 4
  store %"class.std::vector"* %this, %"class.std::vector"** %this.addr, align 4
  %this1 = load %"class.std::vector"** %this.addr
  %0 = bitcast %"class.std::vector"* %this1 to %"struct.std::_Vector_base"*
  %_M_impl = getelementptr inbounds %"struct.std::_Vector_base"* %0, i32 0, i32 0
  %_M_finish = getelementptr inbounds %"struct.std::_Vector_base<float, std::allocator<float> >::_Vector_impl"* %_M_impl, i32 0, i32 1
  call void @_ZN9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEEC1ERKS1_(%"class.__gnu_cxx::__normal_iterator"* %agg.result, float** %_M_finish)
  ret void
}

define linkonce_odr void @_ZN5boost14fibonacci_heapIiNS_12indirect_cmpIPfSt4lessIfEEENS_27typed_identity_property_mapIjEEE4pushERKi(%"class.boost::fibonacci_heap"* %this, i32* %d) align 2 {
entry:
  %this.addr = alloca %"class.boost::fibonacci_heap"*, align 4
  %d.addr = alloca i32*, align 4
  %v = alloca i32, align 4
  %tmp = alloca %"struct.std::_Bit_reference", align 4
  %u = alloca i32, align 4
  store %"class.boost::fibonacci_heap"* %this, %"class.boost::fibonacci_heap"** %this.addr, align 4
  store i32* %d, i32** %d.addr, align 4
  %this1 = load %"class.boost::fibonacci_heap"** %this.addr
  %_n = getelementptr inbounds %"class.boost::fibonacci_heap"* %this1, i32 0, i32 6
  %0 = load i32* %_n, align 4
  %inc = add i32 %0, 1
  store i32 %inc, i32* %_n, align 4
  %_id = getelementptr inbounds %"class.boost::fibonacci_heap"* %this1, i32 0, i32 8
  %1 = bitcast %"struct.boost::typed_identity_property_map"* %_id to %"struct.boost::put_get_helper"*
  %2 = load i32** %d.addr, align 4
  %call = call i32 @_ZN5boost3getINS_27typed_identity_property_mapIjEEjiEET0_RKNS_14put_get_helperIS3_T_EERKT1_(%"struct.boost::put_get_helper"* %1, i32* %2)
  store i32 %call, i32* %v, align 4
  %3 = load i32** %d.addr, align 4
  %4 = load i32* %3, align 4
  %_key = getelementptr inbounds %"class.boost::fibonacci_heap"* %this1, i32 0, i32 0
  %5 = load i32* %v, align 4
  %call2 = call i32* @_ZNSt6vectorIiSaIiEEixEj(%"class.std::vector.0"* %_key, i32 %5)
  store i32 %4, i32* %call2
  %call3 = call i32 @_ZNK5boost14fibonacci_heapIiNS_12indirect_cmpIPfSt4lessIfEEENS_27typed_identity_property_mapIjEEE3nilEv(%"class.boost::fibonacci_heap"* %this1)
  %_p = getelementptr inbounds %"class.boost::fibonacci_heap"* %this1, i32 0, i32 3
  %6 = load i32* %v, align 4
  %call4 = call i32* @_ZNSt6vectorIjSaIjEEixEj(%"class.std::vector.5"* %_p, i32 %6)
  store i32 %call3, i32* %call4
  %_degree = getelementptr inbounds %"class.boost::fibonacci_heap"* %this1, i32 0, i32 5
  %7 = load i32* %v, align 4
  %call5 = call i32* @_ZNSt6vectorIjSaIjEEixEj(%"class.std::vector.5"* %_degree, i32 %7)
  store i32 0, i32* %call5
  %_mark = getelementptr inbounds %"class.boost::fibonacci_heap"* %this1, i32 0, i32 4
  %8 = load i32* %v, align 4
  call void @_ZNSt6vectorIbSaIbEEixEj(%"struct.std::_Bit_reference"* sret %tmp, %"class.std::vector.10"* %_mark, i32 %8)
  %call6 = call %"struct.std::_Bit_reference"* @_ZNSt14_Bit_referenceaSEb(%"struct.std::_Bit_reference"* %tmp, i1 zeroext false)
  %call7 = call i32 @_ZNK5boost14fibonacci_heapIiNS_12indirect_cmpIPfSt4lessIfEEENS_27typed_identity_property_mapIjEEE3nilEv(%"class.boost::fibonacci_heap"* %this1)
  %_child = getelementptr inbounds %"class.boost::fibonacci_heap"* %this1, i32 0, i32 10
  %9 = load i32* %v, align 4
  %call8 = call i32* @_ZNSt6vectorIjSaIjEEixEj(%"class.std::vector.5"* %_child, i32 %9)
  store i32 %call7, i32* %call8
  %_root = getelementptr inbounds %"class.boost::fibonacci_heap"* %this1, i32 0, i32 7
  %10 = load i32* %_root, align 4
  %call9 = call i32 @_ZNK5boost14fibonacci_heapIiNS_12indirect_cmpIPfSt4lessIfEEENS_27typed_identity_property_mapIjEEE3nilEv(%"class.boost::fibonacci_heap"* %this1)
  %cmp = icmp eq i32 %10, %call9
  br i1 %cmp, label %if.then, label %if.else

if.then:                                          ; preds = %entry
  %11 = load i32* %v, align 4
  %_right = getelementptr inbounds %"class.boost::fibonacci_heap"* %this1, i32 0, i32 2
  %12 = load i32* %v, align 4
  %call10 = call i32* @_ZNSt6vectorIjSaIjEEixEj(%"class.std::vector.5"* %_right, i32 %12)
  store i32 %11, i32* %call10
  %_left = getelementptr inbounds %"class.boost::fibonacci_heap"* %this1, i32 0, i32 1
  %13 = load i32* %v, align 4
  %call11 = call i32* @_ZNSt6vectorIjSaIjEEixEj(%"class.std::vector.5"* %_left, i32 %13)
  store i32 %11, i32* %call11
  %_root12 = getelementptr inbounds %"class.boost::fibonacci_heap"* %this1, i32 0, i32 7
  store i32 %11, i32* %_root12, align 4
  br label %if.end33

if.else:                                          ; preds = %entry
  %_left14 = getelementptr inbounds %"class.boost::fibonacci_heap"* %this1, i32 0, i32 1
  %_root15 = getelementptr inbounds %"class.boost::fibonacci_heap"* %this1, i32 0, i32 7
  %14 = load i32* %_root15, align 4
  %call16 = call i32* @_ZNSt6vectorIjSaIjEEixEj(%"class.std::vector.5"* %_left14, i32 %14)
  %15 = load i32* %call16
  store i32 %15, i32* %u, align 4
  %16 = load i32* %u, align 4
  %_left17 = getelementptr inbounds %"class.boost::fibonacci_heap"* %this1, i32 0, i32 1
  %17 = load i32* %v, align 4
  %call18 = call i32* @_ZNSt6vectorIjSaIjEEixEj(%"class.std::vector.5"* %_left17, i32 %17)
  store i32 %16, i32* %call18
  %_root19 = getelementptr inbounds %"class.boost::fibonacci_heap"* %this1, i32 0, i32 7
  %18 = load i32* %_root19, align 4
  %_right20 = getelementptr inbounds %"class.boost::fibonacci_heap"* %this1, i32 0, i32 2
  %19 = load i32* %v, align 4
  %call21 = call i32* @_ZNSt6vectorIjSaIjEEixEj(%"class.std::vector.5"* %_right20, i32 %19)
  store i32 %18, i32* %call21
  %20 = load i32* %v, align 4
  %_right22 = getelementptr inbounds %"class.boost::fibonacci_heap"* %this1, i32 0, i32 2
  %21 = load i32* %u, align 4
  %call23 = call i32* @_ZNSt6vectorIjSaIjEEixEj(%"class.std::vector.5"* %_right22, i32 %21)
  store i32 %20, i32* %call23
  %_left24 = getelementptr inbounds %"class.boost::fibonacci_heap"* %this1, i32 0, i32 1
  %_root25 = getelementptr inbounds %"class.boost::fibonacci_heap"* %this1, i32 0, i32 7
  %22 = load i32* %_root25, align 4
  %call26 = call i32* @_ZNSt6vectorIjSaIjEEixEj(%"class.std::vector.5"* %_left24, i32 %22)
  store i32 %20, i32* %call26
  %_compare = getelementptr inbounds %"class.boost::fibonacci_heap"* %this1, i32 0, i32 9
  %23 = load i32** %d.addr, align 4
  %_key27 = getelementptr inbounds %"class.boost::fibonacci_heap"* %this1, i32 0, i32 0
  %_root28 = getelementptr inbounds %"class.boost::fibonacci_heap"* %this1, i32 0, i32 7
  %24 = load i32* %_root28, align 4
  %call29 = call i32* @_ZNSt6vectorIiSaIiEEixEj(%"class.std::vector.0"* %_key27, i32 %24)
  %call30 = call zeroext i1 @_ZNK5boost12indirect_cmpIPfSt4lessIfEEclIiiEEbRKT_RKT0_(%"class.boost::indirect_cmp"* %_compare, i32* %23, i32* %call29)
  br i1 %call30, label %if.then31, label %if.end

if.then31:                                        ; preds = %if.else
  %25 = load i32* %v, align 4
  %_root32 = getelementptr inbounds %"class.boost::fibonacci_heap"* %this1, i32 0, i32 7
  store i32 %25, i32* %_root32, align 4
  br label %if.end

if.end:                                           ; preds = %if.then31, %if.else
  br label %if.end33

if.end33:                                         ; preds = %if.end, %if.then
  ret void
}

define linkonce_odr i32 @_ZN5boost6random17variate_generatorIRNS0_23mersenne_twister_engineIjLj32ELj624ELj397ELj31ELj2567483615ELj11ELj4294967295ELj7ELj2636928640ELj15ELj4022730752ELj18ELj1812433253EEENS_11uniform_intIiEEEclEv(%"class.boost::random::variate_generator"* %this) align 2 {
entry:
  %this.addr = alloca %"class.boost::random::variate_generator"*, align 4
  store %"class.boost::random::variate_generator"* %this, %"class.boost::random::variate_generator"** %this.addr, align 4
  %this1 = load %"class.boost::random::variate_generator"** %this.addr
  %_dist = getelementptr inbounds %"class.boost::random::variate_generator"* %this1, i32 0, i32 1
  %call = call %"class.boost::random::mersenne_twister_engine"* @_ZN5boost6random17variate_generatorIRNS0_23mersenne_twister_engineIjLj32ELj624ELj397ELj31ELj2567483615ELj11ELj4294967295ELj7ELj2636928640ELj15ELj4022730752ELj18ELj1812433253EEENS_11uniform_intIiEEE6engineEv(%"class.boost::random::variate_generator"* %this1)
  %call2 = call i32 @_ZNK5boost11uniform_intIiEclINS_6random23mersenne_twister_engineIjLj32ELj624ELj397ELj31ELj2567483615ELj11ELj4294967295ELj7ELj2636928640ELj15ELj4022730752ELj18ELj1812433253EEEEEiRT_(%"class.boost::uniform_int"* %_dist, %"class.boost::random::mersenne_twister_engine"* %call)
  ret i32 %call2
}

define linkonce_odr void @_ZN5boost14fibonacci_heapIiNS_12indirect_cmpIPfSt4lessIfEEENS_27typed_identity_property_mapIjEEE6updateERKi(%"class.boost::fibonacci_heap"* %this, i32* %d) align 2 {
entry:
  %this.addr = alloca %"class.boost::fibonacci_heap"*, align 4
  %d.addr = alloca i32*, align 4
  %v = alloca i32, align 4
  %p = alloca i32, align 4
  %r = alloca i32, align 4
  %pp = alloca i32, align 4
  %tmp = alloca %"struct.std::_Bit_reference", align 4
  %tmp35 = alloca %"struct.std::_Bit_reference", align 4
  store %"class.boost::fibonacci_heap"* %this, %"class.boost::fibonacci_heap"** %this.addr, align 4
  store i32* %d, i32** %d.addr, align 4
  %this1 = load %"class.boost::fibonacci_heap"** %this.addr
  %_id = getelementptr inbounds %"class.boost::fibonacci_heap"* %this1, i32 0, i32 8
  %0 = bitcast %"struct.boost::typed_identity_property_map"* %_id to %"struct.boost::put_get_helper"*
  %1 = load i32** %d.addr, align 4
  %call = call i32 @_ZN5boost3getINS_27typed_identity_property_mapIjEEjiEET0_RKNS_14put_get_helperIS3_T_EERKT1_(%"struct.boost::put_get_helper"* %0, i32* %1)
  store i32 %call, i32* %v, align 4
  %_compare = getelementptr inbounds %"class.boost::fibonacci_heap"* %this1, i32 0, i32 9
  %_key = getelementptr inbounds %"class.boost::fibonacci_heap"* %this1, i32 0, i32 0
  %2 = load i32* %v, align 4
  %call2 = call i32* @_ZNSt6vectorIiSaIiEEixEj(%"class.std::vector.0"* %_key, i32 %2)
  %3 = load i32** %d.addr, align 4
  %call3 = call zeroext i1 @_ZNK5boost12indirect_cmpIPfSt4lessIfEEclIiiEEbRKT_RKT0_(%"class.boost::indirect_cmp"* %_compare, i32* %call2, i32* %3)
  br i1 %call3, label %cond.false, label %cond.true

cond.true:                                        ; preds = %entry
  br label %cond.end

cond.false:                                       ; preds = %entry
  call void @__assert_fail(i8* getelementptr inbounds ([22 x i8]* @.str6, i32 0, i32 0), i8* getelementptr inbounds ([59 x i8]* @.str7, i32 0, i32 0), i32 177, i8* getelementptr inbounds ([275 x i8]* @__PRETTY_FUNCTION__._ZN5boost14fibonacci_heapIiNS_12indirect_cmpIPfSt4lessIfEEENS_27typed_identity_property_mapIjEEE6updateERKi, i32 0, i32 0)) noreturn nounwind
  unreachable
                                                  ; No predecessors!
  br label %cond.end

cond.end:                                         ; preds = %4, %cond.true
  %5 = load i32** %d.addr, align 4
  %6 = load i32* %5, align 4
  %_key4 = getelementptr inbounds %"class.boost::fibonacci_heap"* %this1, i32 0, i32 0
  %7 = load i32* %v, align 4
  %call5 = call i32* @_ZNSt6vectorIiSaIiEEixEj(%"class.std::vector.0"* %_key4, i32 %7)
  store i32 %6, i32* %call5
  %_p = getelementptr inbounds %"class.boost::fibonacci_heap"* %this1, i32 0, i32 3
  %8 = load i32* %v, align 4
  %call6 = call i32* @_ZNSt6vectorIjSaIjEEixEj(%"class.std::vector.5"* %_p, i32 %8)
  %9 = load i32* %call6
  store i32 %9, i32* %p, align 4
  %10 = load i32* %p, align 4
  %call7 = call i32 @_ZNK5boost14fibonacci_heapIiNS_12indirect_cmpIPfSt4lessIfEEENS_27typed_identity_property_mapIjEEE3nilEv(%"class.boost::fibonacci_heap"* %this1)
  %cmp = icmp eq i32 %10, %call7
  br i1 %cmp, label %if.then, label %if.else

if.then:                                          ; preds = %cond.end
  %_compare8 = getelementptr inbounds %"class.boost::fibonacci_heap"* %this1, i32 0, i32 9
  %11 = load i32** %d.addr, align 4
  %_key9 = getelementptr inbounds %"class.boost::fibonacci_heap"* %this1, i32 0, i32 0
  %_root = getelementptr inbounds %"class.boost::fibonacci_heap"* %this1, i32 0, i32 7
  %12 = load i32* %_root, align 4
  %call10 = call i32* @_ZNSt6vectorIiSaIiEEixEj(%"class.std::vector.0"* %_key9, i32 %12)
  %call11 = call zeroext i1 @_ZNK5boost12indirect_cmpIPfSt4lessIfEEclIiiEEbRKT_RKT0_(%"class.boost::indirect_cmp"* %_compare8, i32* %11, i32* %call10)
  br i1 %call11, label %if.then12, label %if.end

if.then12:                                        ; preds = %if.then
  %13 = load i32* %v, align 4
  %_root13 = getelementptr inbounds %"class.boost::fibonacci_heap"* %this1, i32 0, i32 7
  store i32 %13, i32* %_root13, align 4
  br label %if.end

if.end:                                           ; preds = %if.then12, %if.then
  br label %if.end46

if.else:                                          ; preds = %cond.end
  %_compare14 = getelementptr inbounds %"class.boost::fibonacci_heap"* %this1, i32 0, i32 9
  %14 = load i32** %d.addr, align 4
  %_key15 = getelementptr inbounds %"class.boost::fibonacci_heap"* %this1, i32 0, i32 0
  %15 = load i32* %p, align 4
  %call16 = call i32* @_ZNSt6vectorIiSaIiEEixEj(%"class.std::vector.0"* %_key15, i32 %15)
  %call17 = call zeroext i1 @_ZNK5boost12indirect_cmpIPfSt4lessIfEEclIiiEEbRKT_RKT0_(%"class.boost::indirect_cmp"* %_compare14, i32* %14, i32* %call16)
  br i1 %call17, label %if.then18, label %if.end45

if.then18:                                        ; preds = %if.else
  br label %while.body

while.body:                                       ; preds = %if.then18, %if.end44
  %_degree = getelementptr inbounds %"class.boost::fibonacci_heap"* %this1, i32 0, i32 5
  %16 = load i32* %p, align 4
  %call19 = call i32* @_ZNSt6vectorIjSaIjEEixEj(%"class.std::vector.5"* %_degree, i32 %16)
  %17 = load i32* %call19
  store i32 %17, i32* %r, align 4
  %18 = load i32* %r, align 4
  %cmp20 = icmp uge i32 %18, 2
  br i1 %cmp20, label %if.then21, label %if.end22

if.then21:                                        ; preds = %while.body
  %19 = load i32* %v, align 4
  %20 = load i32* %p, align 4
  call void @_ZN5boost14fibonacci_heapIiNS_12indirect_cmpIPfSt4lessIfEEENS_27typed_identity_property_mapIjEEE18remove_from_familyEjj(%"class.boost::fibonacci_heap"* %this1, i32 %19, i32 %20)
  br label %if.end22

if.end22:                                         ; preds = %if.then21, %while.body
  %21 = load i32* %v, align 4
  %22 = load i32** %d.addr, align 4
  call void @_ZN5boost14fibonacci_heapIiNS_12indirect_cmpIPfSt4lessIfEEENS_27typed_identity_property_mapIjEEE18insert_into_forestEjRKi(%"class.boost::fibonacci_heap"* %this1, i32 %21, i32* %22)
  %_p23 = getelementptr inbounds %"class.boost::fibonacci_heap"* %this1, i32 0, i32 3
  %23 = load i32* %p, align 4
  %call24 = call i32* @_ZNSt6vectorIjSaIjEEixEj(%"class.std::vector.5"* %_p23, i32 %23)
  %24 = load i32* %call24
  store i32 %24, i32* %pp, align 4
  %25 = load i32* %pp, align 4
  %call25 = call i32 @_ZNK5boost14fibonacci_heapIiNS_12indirect_cmpIPfSt4lessIfEEENS_27typed_identity_property_mapIjEEE3nilEv(%"class.boost::fibonacci_heap"* %this1)
  %cmp26 = icmp eq i32 %25, %call25
  br i1 %cmp26, label %if.then27, label %if.end30

if.then27:                                        ; preds = %if.end22
  %_degree28 = getelementptr inbounds %"class.boost::fibonacci_heap"* %this1, i32 0, i32 5
  %26 = load i32* %p, align 4
  %call29 = call i32* @_ZNSt6vectorIjSaIjEEixEj(%"class.std::vector.5"* %_degree28, i32 %26)
  %27 = load i32* %call29
  %dec = add i32 %27, -1
  store i32 %dec, i32* %call29
  br label %while.end

if.end30:                                         ; preds = %if.end22
  %_mark = getelementptr inbounds %"class.boost::fibonacci_heap"* %this1, i32 0, i32 4
  %28 = load i32* %p, align 4
  call void @_ZNSt6vectorIbSaIbEEixEj(%"struct.std::_Bit_reference"* sret %tmp, %"class.std::vector.10"* %_mark, i32 %28)
  %call31 = call zeroext i1 @_ZNKSt14_Bit_referencecvbEv(%"struct.std::_Bit_reference"* %tmp)
  %conv = zext i1 %call31 to i32
  %cmp32 = icmp eq i32 %conv, 0
  br i1 %cmp32, label %if.then33, label %if.else40

if.then33:                                        ; preds = %if.end30
  %_mark34 = getelementptr inbounds %"class.boost::fibonacci_heap"* %this1, i32 0, i32 4
  %29 = load i32* %p, align 4
  call void @_ZNSt6vectorIbSaIbEEixEj(%"struct.std::_Bit_reference"* sret %tmp35, %"class.std::vector.10"* %_mark34, i32 %29)
  %call36 = call %"struct.std::_Bit_reference"* @_ZNSt14_Bit_referenceaSEb(%"struct.std::_Bit_reference"* %tmp35, i1 zeroext true)
  %_degree37 = getelementptr inbounds %"class.boost::fibonacci_heap"* %this1, i32 0, i32 5
  %30 = load i32* %p, align 4
  %call38 = call i32* @_ZNSt6vectorIjSaIjEEixEj(%"class.std::vector.5"* %_degree37, i32 %30)
  %31 = load i32* %call38
  %dec39 = add i32 %31, -1
  store i32 %dec39, i32* %call38
  br label %while.end

if.else40:                                        ; preds = %if.end30
  %_degree41 = getelementptr inbounds %"class.boost::fibonacci_heap"* %this1, i32 0, i32 5
  %32 = load i32* %p, align 4
  %call42 = call i32* @_ZNSt6vectorIjSaIjEEixEj(%"class.std::vector.5"* %_degree41, i32 %32)
  %33 = load i32* %call42
  %dec43 = add i32 %33, -1
  store i32 %dec43, i32* %call42
  br label %if.end44

if.end44:                                         ; preds = %if.else40
  %34 = load i32* %p, align 4
  store i32 %34, i32* %v, align 4
  %35 = load i32* %pp, align 4
  store i32 %35, i32* %p, align 4
  br label %while.body

while.end:                                        ; preds = %if.then33, %if.then27
  br label %if.end45

if.end45:                                         ; preds = %while.end, %if.else
  br label %if.end46

if.end46:                                         ; preds = %if.end45, %if.end
  ret void
}

define linkonce_odr void @_ZNSt6vectorIfSaIfEE9push_backERKf(%"class.std::vector"* %this, float* %__x) align 2 {
entry:
  %this.addr = alloca %"class.std::vector"*, align 4
  %__x.addr = alloca float*, align 4
  %agg.tmp = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  store %"class.std::vector"* %this, %"class.std::vector"** %this.addr, align 4
  store float* %__x, float** %__x.addr, align 4
  %this1 = load %"class.std::vector"** %this.addr
  %0 = bitcast %"class.std::vector"* %this1 to %"struct.std::_Vector_base"*
  %_M_impl = getelementptr inbounds %"struct.std::_Vector_base"* %0, i32 0, i32 0
  %_M_finish = getelementptr inbounds %"struct.std::_Vector_base<float, std::allocator<float> >::_Vector_impl"* %_M_impl, i32 0, i32 1
  %1 = load float** %_M_finish, align 4
  %2 = bitcast %"class.std::vector"* %this1 to %"struct.std::_Vector_base"*
  %_M_impl2 = getelementptr inbounds %"struct.std::_Vector_base"* %2, i32 0, i32 0
  %_M_end_of_storage = getelementptr inbounds %"struct.std::_Vector_base<float, std::allocator<float> >::_Vector_impl"* %_M_impl2, i32 0, i32 2
  %3 = load float** %_M_end_of_storage, align 4
  %cmp = icmp ne float* %1, %3
  br i1 %cmp, label %if.then, label %if.else

if.then:                                          ; preds = %entry
  %4 = bitcast %"class.std::vector"* %this1 to %"struct.std::_Vector_base"*
  %_M_impl3 = getelementptr inbounds %"struct.std::_Vector_base"* %4, i32 0, i32 0
  %5 = bitcast %"struct.std::_Vector_base<float, std::allocator<float> >::_Vector_impl"* %_M_impl3 to %"class.__gnu_cxx::new_allocator"*
  %6 = bitcast %"class.std::vector"* %this1 to %"struct.std::_Vector_base"*
  %_M_impl4 = getelementptr inbounds %"struct.std::_Vector_base"* %6, i32 0, i32 0
  %_M_finish5 = getelementptr inbounds %"struct.std::_Vector_base<float, std::allocator<float> >::_Vector_impl"* %_M_impl4, i32 0, i32 1
  %7 = load float** %_M_finish5, align 4
  %8 = load float** %__x.addr, align 4
  call void @_ZN9__gnu_cxx13new_allocatorIfE9constructEPfRKf(%"class.__gnu_cxx::new_allocator"* %5, float* %7, float* %8)
  %9 = bitcast %"class.std::vector"* %this1 to %"struct.std::_Vector_base"*
  %_M_impl6 = getelementptr inbounds %"struct.std::_Vector_base"* %9, i32 0, i32 0
  %_M_finish7 = getelementptr inbounds %"struct.std::_Vector_base<float, std::allocator<float> >::_Vector_impl"* %_M_impl6, i32 0, i32 1
  %10 = load float** %_M_finish7, align 4
  %incdec.ptr = getelementptr inbounds float* %10, i32 1
  store float* %incdec.ptr, float** %_M_finish7, align 4
  br label %if.end

if.else:                                          ; preds = %entry
  call void @_ZNSt6vectorIfSaIfEE3endEv(%"class.__gnu_cxx::__normal_iterator"* sret %agg.tmp, %"class.std::vector"* %this1)
  %11 = load float** %__x.addr, align 4
  call void @_ZNSt6vectorIfSaIfEE13_M_insert_auxEN9__gnu_cxx17__normal_iteratorIPfS1_EERKf(%"class.std::vector"* %this1, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %agg.tmp, float* %11)
  br label %if.end

if.end:                                           ; preds = %if.else, %if.then
  ret void
}

define linkonce_odr i32* @_ZN5boost14fibonacci_heapIiNS_12indirect_cmpIPfSt4lessIfEEENS_27typed_identity_property_mapIjEEE3topEv(%"class.boost::fibonacci_heap"* %this) nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::fibonacci_heap"*, align 4
  store %"class.boost::fibonacci_heap"* %this, %"class.boost::fibonacci_heap"** %this.addr, align 4
  %this1 = load %"class.boost::fibonacci_heap"** %this.addr
  %_key = getelementptr inbounds %"class.boost::fibonacci_heap"* %this1, i32 0, i32 0
  %_root = getelementptr inbounds %"class.boost::fibonacci_heap"* %this1, i32 0, i32 7
  %0 = load i32* %_root, align 4
  %call = call i32* @_ZNSt6vectorIiSaIiEEixEj(%"class.std::vector.0"* %_key, i32 %0)
  ret i32* %call
}

define linkonce_odr void @_ZN5boost14fibonacci_heapIiNS_12indirect_cmpIPfSt4lessIfEEENS_27typed_identity_property_mapIjEEE3popEv(%"class.boost::fibonacci_heap"* %this) align 2 {
entry:
  %this.addr = alloca %"class.boost::fibonacci_heap"*, align 4
  %h = alloca i32, align 4
  %v = alloca i32, align 4
  %w = alloca i32, align 4
  %agg.tmp = alloca %"class.__gnu_cxx::__normal_iterator.15", align 4
  %agg.tmp29 = alloca %"class.__gnu_cxx::__normal_iterator.15", align 4
  store %"class.boost::fibonacci_heap"* %this, %"class.boost::fibonacci_heap"** %this.addr, align 4
  %this1 = load %"class.boost::fibonacci_heap"** %this.addr
  %_n = getelementptr inbounds %"class.boost::fibonacci_heap"* %this1, i32 0, i32 6
  %0 = load i32* %_n, align 4
  %dec = add i32 %0, -1
  store i32 %dec, i32* %_n, align 4
  store i32 -1, i32* %h, align 4
  %_root = getelementptr inbounds %"class.boost::fibonacci_heap"* %this1, i32 0, i32 7
  %1 = load i32* %_root, align 4
  %call = call i32 @_ZNK5boost14fibonacci_heapIiNS_12indirect_cmpIPfSt4lessIfEEENS_27typed_identity_property_mapIjEEE3nilEv(%"class.boost::fibonacci_heap"* %this1)
  %cmp = icmp ne i32 %1, %call
  br i1 %cmp, label %if.then, label %if.end31

if.then:                                          ; preds = %entry
  %_degree = getelementptr inbounds %"class.boost::fibonacci_heap"* %this1, i32 0, i32 5
  %_root2 = getelementptr inbounds %"class.boost::fibonacci_heap"* %this1, i32 0, i32 7
  %2 = load i32* %_root2, align 4
  %call3 = call i32* @_ZNSt6vectorIjSaIjEEixEj(%"class.std::vector.5"* %_degree, i32 %2)
  %3 = load i32* %call3
  %cmp4 = icmp eq i32 %3, 0
  br i1 %cmp4, label %if.then5, label %if.else

if.then5:                                         ; preds = %if.then
  %_right = getelementptr inbounds %"class.boost::fibonacci_heap"* %this1, i32 0, i32 2
  %_root6 = getelementptr inbounds %"class.boost::fibonacci_heap"* %this1, i32 0, i32 7
  %4 = load i32* %_root6, align 4
  %call7 = call i32* @_ZNSt6vectorIjSaIjEEixEj(%"class.std::vector.5"* %_right, i32 %4)
  %5 = load i32* %call7
  store i32 %5, i32* %v, align 4
  br label %if.end

if.else:                                          ; preds = %if.then
  %_child = getelementptr inbounds %"class.boost::fibonacci_heap"* %this1, i32 0, i32 10
  %_root8 = getelementptr inbounds %"class.boost::fibonacci_heap"* %this1, i32 0, i32 7
  %6 = load i32* %_root8, align 4
  %call9 = call i32* @_ZNSt6vectorIjSaIjEEixEj(%"class.std::vector.5"* %_child, i32 %6)
  %7 = load i32* %call9
  store i32 %7, i32* %w, align 4
  %_right10 = getelementptr inbounds %"class.boost::fibonacci_heap"* %this1, i32 0, i32 2
  %8 = load i32* %w, align 4
  %call11 = call i32* @_ZNSt6vectorIjSaIjEEixEj(%"class.std::vector.5"* %_right10, i32 %8)
  %9 = load i32* %call11
  store i32 %9, i32* %v, align 4
  %_right12 = getelementptr inbounds %"class.boost::fibonacci_heap"* %this1, i32 0, i32 2
  %_root13 = getelementptr inbounds %"class.boost::fibonacci_heap"* %this1, i32 0, i32 7
  %10 = load i32* %_root13, align 4
  %call14 = call i32* @_ZNSt6vectorIjSaIjEEixEj(%"class.std::vector.5"* %_right12, i32 %10)
  %11 = load i32* %call14
  %_right15 = getelementptr inbounds %"class.boost::fibonacci_heap"* %this1, i32 0, i32 2
  %12 = load i32* %w, align 4
  %call16 = call i32* @_ZNSt6vectorIjSaIjEEixEj(%"class.std::vector.5"* %_right15, i32 %12)
  store i32 %11, i32* %call16
  %13 = load i32* %v, align 4
  store i32 %13, i32* %w, align 4
  br label %for.cond

for.cond:                                         ; preds = %for.inc, %if.else
  %14 = load i32* %w, align 4
  %_right17 = getelementptr inbounds %"class.boost::fibonacci_heap"* %this1, i32 0, i32 2
  %_root18 = getelementptr inbounds %"class.boost::fibonacci_heap"* %this1, i32 0, i32 7
  %15 = load i32* %_root18, align 4
  %call19 = call i32* @_ZNSt6vectorIjSaIjEEixEj(%"class.std::vector.5"* %_right17, i32 %15)
  %16 = load i32* %call19
  %cmp20 = icmp ne i32 %14, %16
  br i1 %cmp20, label %for.body, label %for.end

for.body:                                         ; preds = %for.cond
  %call21 = call i32 @_ZNK5boost14fibonacci_heapIiNS_12indirect_cmpIPfSt4lessIfEEENS_27typed_identity_property_mapIjEEE3nilEv(%"class.boost::fibonacci_heap"* %this1)
  %_p = getelementptr inbounds %"class.boost::fibonacci_heap"* %this1, i32 0, i32 3
  %17 = load i32* %w, align 4
  %call22 = call i32* @_ZNSt6vectorIjSaIjEEixEj(%"class.std::vector.5"* %_p, i32 %17)
  store i32 %call21, i32* %call22
  br label %for.inc

for.inc:                                          ; preds = %for.body
  %_right23 = getelementptr inbounds %"class.boost::fibonacci_heap"* %this1, i32 0, i32 2
  %18 = load i32* %w, align 4
  %call24 = call i32* @_ZNSt6vectorIjSaIjEEixEj(%"class.std::vector.5"* %_right23, i32 %18)
  %19 = load i32* %call24
  store i32 %19, i32* %w, align 4
  br label %for.cond

for.end:                                          ; preds = %for.cond
  br label %if.end

if.end:                                           ; preds = %for.end, %if.then5
  br label %while.cond

while.cond:                                       ; preds = %while.body, %if.end
  %20 = load i32* %v, align 4
  %_root25 = getelementptr inbounds %"class.boost::fibonacci_heap"* %this1, i32 0, i32 7
  %21 = load i32* %_root25, align 4
  %cmp26 = icmp ne i32 %20, %21
  br i1 %cmp26, label %while.body, label %while.end

while.body:                                       ; preds = %while.cond
  %_right27 = getelementptr inbounds %"class.boost::fibonacci_heap"* %this1, i32 0, i32 2
  %22 = load i32* %v, align 4
  %call28 = call i32* @_ZNSt6vectorIjSaIjEEixEj(%"class.std::vector.5"* %_right27, i32 %22)
  %23 = load i32* %call28
  store i32 %23, i32* %w, align 4
  %24 = load i32* %v, align 4
  %new_roots = getelementptr inbounds %"class.boost::fibonacci_heap"* %this1, i32 0, i32 11
  call void @_ZNSt6vectorIjSaIjEE5beginEv(%"class.__gnu_cxx::__normal_iterator.15"* sret %agg.tmp, %"class.std::vector.5"* %new_roots)
  call void @_ZN5boost14fibonacci_heapIiNS_12indirect_cmpIPfSt4lessIfEEENS_27typed_identity_property_mapIjEEE21add_tree_to_new_rootsEjN9__gnu_cxx17__normal_iteratorIPjSt6vectorIjSaIjEEEERi(%"class.boost::fibonacci_heap"* %this1, i32 %24, %"class.__gnu_cxx::__normal_iterator.15"* byval align 4 %agg.tmp, i32* %h)
  %25 = load i32* %w, align 4
  store i32 %25, i32* %v, align 4
  br label %while.cond

while.end:                                        ; preds = %while.cond
  %new_roots30 = getelementptr inbounds %"class.boost::fibonacci_heap"* %this1, i32 0, i32 11
  call void @_ZNSt6vectorIjSaIjEE5beginEv(%"class.__gnu_cxx::__normal_iterator.15"* sret %agg.tmp29, %"class.std::vector.5"* %new_roots30)
  call void @_ZN5boost14fibonacci_heapIiNS_12indirect_cmpIPfSt4lessIfEEENS_27typed_identity_property_mapIjEEE17rebuild_root_listEN9__gnu_cxx17__normal_iteratorIPjSt6vectorIjSaIjEEEERi(%"class.boost::fibonacci_heap"* %this1, %"class.__gnu_cxx::__normal_iterator.15"* byval align 4 %agg.tmp29, i32* %h)
  br label %if.end31

if.end31:                                         ; preds = %while.end, %entry
  ret void
}

define linkonce_odr void @_ZSt4sortIN9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEEEEvT_S7_(%"class.__gnu_cxx::__normal_iterator"* byval align 4 %__first, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %__last) inlinehint {
entry:
  %agg.tmp = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %agg.tmp1 = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %agg.tmp4 = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %agg.tmp5 = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %call = call zeroext i1 @_ZN9__gnu_cxxneIPfSt6vectorIfSaIfEEEEbRKNS_17__normal_iteratorIT_T0_EESA_(%"class.__gnu_cxx::__normal_iterator"* %__first, %"class.__gnu_cxx::__normal_iterator"* %__last)
  br i1 %call, label %if.then, label %if.end

if.then:                                          ; preds = %entry
  %0 = bitcast %"class.__gnu_cxx::__normal_iterator"* %agg.tmp to i8*
  %1 = bitcast %"class.__gnu_cxx::__normal_iterator"* %__first to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %0, i8* %1, i32 4, i32 4, i1 false)
  %2 = bitcast %"class.__gnu_cxx::__normal_iterator"* %agg.tmp1 to i8*
  %3 = bitcast %"class.__gnu_cxx::__normal_iterator"* %__last to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %2, i8* %3, i32 4, i32 4, i1 false)
  %call2 = call i32 @_ZN9__gnu_cxxmiIPfSt6vectorIfSaIfEEEENS_17__normal_iteratorIT_T0_E15difference_typeERKS8_SB_(%"class.__gnu_cxx::__normal_iterator"* %__last, %"class.__gnu_cxx::__normal_iterator"* %__first)
  %call3 = call i32 @_ZSt4__lgi(i32 %call2)
  %mul = mul nsw i32 %call3, 2
  call void @_ZSt16__introsort_loopIN9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEEEiEvT_S7_T0_(%"class.__gnu_cxx::__normal_iterator"* byval align 4 %agg.tmp, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %agg.tmp1, i32 %mul)
  %4 = bitcast %"class.__gnu_cxx::__normal_iterator"* %agg.tmp4 to i8*
  %5 = bitcast %"class.__gnu_cxx::__normal_iterator"* %__first to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %4, i8* %5, i32 4, i32 4, i1 false)
  %6 = bitcast %"class.__gnu_cxx::__normal_iterator"* %agg.tmp5 to i8*
  %7 = bitcast %"class.__gnu_cxx::__normal_iterator"* %__last to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %6, i8* %7, i32 4, i32 4, i1 false)
  call void @_ZSt22__final_insertion_sortIN9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEEEEvT_S7_(%"class.__gnu_cxx::__normal_iterator"* byval align 4 %agg.tmp4, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %agg.tmp5)
  br label %if.end

if.end:                                           ; preds = %if.then, %entry
  ret void
}

define linkonce_odr zeroext i1 @_ZSt5equalIN9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEEES6_EbT_S7_T0_(%"class.__gnu_cxx::__normal_iterator"* byval align 4 %__first1, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %__last1, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %__first2) {
entry:
  %agg.tmp = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %agg.tmp1 = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %agg.tmp3 = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %0 = bitcast %"class.__gnu_cxx::__normal_iterator"* %agg.tmp to i8*
  %1 = bitcast %"class.__gnu_cxx::__normal_iterator"* %__first1 to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %0, i8* %1, i32 4, i32 4, i1 false)
  %call = call float* @_ZSt12__niter_baseIN9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEEEENSt11_Niter_baseIT_E13iterator_typeES8_(%"class.__gnu_cxx::__normal_iterator"* byval align 4 %agg.tmp)
  %2 = bitcast %"class.__gnu_cxx::__normal_iterator"* %agg.tmp1 to i8*
  %3 = bitcast %"class.__gnu_cxx::__normal_iterator"* %__last1 to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %2, i8* %3, i32 4, i32 4, i1 false)
  %call2 = call float* @_ZSt12__niter_baseIN9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEEEENSt11_Niter_baseIT_E13iterator_typeES8_(%"class.__gnu_cxx::__normal_iterator"* byval align 4 %agg.tmp1)
  %4 = bitcast %"class.__gnu_cxx::__normal_iterator"* %agg.tmp3 to i8*
  %5 = bitcast %"class.__gnu_cxx::__normal_iterator"* %__first2 to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %4, i8* %5, i32 4, i32 4, i1 false)
  %call4 = call float* @_ZSt12__niter_baseIN9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEEEENSt11_Niter_baseIT_E13iterator_typeES8_(%"class.__gnu_cxx::__normal_iterator"* byval align 4 %agg.tmp3)
  %call5 = call zeroext i1 @_ZSt11__equal_auxIPfS0_EbT_S1_T0_(float* %call, float* %call2, float* %call4)
  ret i1 %call5
}

declare %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"*, i8*)

declare %"class.std::basic_ostream"* @_ZNSolsEPFRSoS_E(%"class.std::basic_ostream"*, %"class.std::basic_ostream"* (%"class.std::basic_ostream"*)*)

declare %"class.std::basic_ostream"* @_ZSt4endlIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_(%"class.std::basic_ostream"*)

define linkonce_odr void @_ZSt4copyIN9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEEESt16ostream_iteratorIfcSt11char_traitsIcEEET0_T_SC_SB_(%"class.std::ostream_iterator"* noalias sret %agg.result, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %__first, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %__last, %"class.std::ostream_iterator"* %__result) {
entry:
  %agg.tmp = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %agg.tmp1 = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %agg.tmp2 = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %agg.tmp3 = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %agg.tmp4 = alloca %"class.std::ostream_iterator", align 4
  %0 = bitcast %"class.__gnu_cxx::__normal_iterator"* %agg.tmp1 to i8*
  %1 = bitcast %"class.__gnu_cxx::__normal_iterator"* %__first to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %0, i8* %1, i32 4, i32 4, i1 false)
  call void @_ZSt12__miter_baseIN9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEEEENSt11_Miter_baseIT_E13iterator_typeES8_(%"class.__gnu_cxx::__normal_iterator"* sret %agg.tmp, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %agg.tmp1)
  %2 = bitcast %"class.__gnu_cxx::__normal_iterator"* %agg.tmp3 to i8*
  %3 = bitcast %"class.__gnu_cxx::__normal_iterator"* %__last to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %2, i8* %3, i32 4, i32 4, i1 false)
  call void @_ZSt12__miter_baseIN9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEEEENSt11_Miter_baseIT_E13iterator_typeES8_(%"class.__gnu_cxx::__normal_iterator"* sret %agg.tmp2, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %agg.tmp3)
  call void @_ZNSt16ostream_iteratorIfcSt11char_traitsIcEEC1ERKS2_(%"class.std::ostream_iterator"* %agg.tmp4, %"class.std::ostream_iterator"* %__result)
  call void @_ZSt14__copy_move_a2ILb0EN9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEEESt16ostream_iteratorIfcSt11char_traitsIcEEET1_T0_SC_SB_(%"class.std::ostream_iterator"* sret %agg.result, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %agg.tmp, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %agg.tmp2, %"class.std::ostream_iterator"* %agg.tmp4)
  ret void
}

define linkonce_odr void @_ZNSt16ostream_iteratorIfcSt11char_traitsIcEEC1ERSoPKc(%"class.std::ostream_iterator"* %this, %"class.std::basic_ostream"* %__s, i8* %__c) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.std::ostream_iterator"*, align 4
  %__s.addr = alloca %"class.std::basic_ostream"*, align 4
  %__c.addr = alloca i8*, align 4
  store %"class.std::ostream_iterator"* %this, %"class.std::ostream_iterator"** %this.addr, align 4
  store %"class.std::basic_ostream"* %__s, %"class.std::basic_ostream"** %__s.addr, align 4
  store i8* %__c, i8** %__c.addr, align 4
  %this1 = load %"class.std::ostream_iterator"** %this.addr
  %0 = load i8** %__c.addr, align 4
  %1 = load %"class.std::basic_ostream"** %__s.addr
  call void @_ZNSt16ostream_iteratorIfcSt11char_traitsIcEEC2ERSoPKc(%"class.std::ostream_iterator"* %this1, %"class.std::basic_ostream"* %1, i8* %0)
  ret void
}

define linkonce_odr void @_ZN5boost14fibonacci_heapIiNS_12indirect_cmpIPfSt4lessIfEEENS_27typed_identity_property_mapIjEEED1Ev(%"class.boost::fibonacci_heap"* %this) unnamed_addr inlinehint align 2 {
entry:
  %this.addr = alloca %"class.boost::fibonacci_heap"*, align 4
  store %"class.boost::fibonacci_heap"* %this, %"class.boost::fibonacci_heap"** %this.addr, align 4
  %this1 = load %"class.boost::fibonacci_heap"** %this.addr
  call void @_ZN5boost14fibonacci_heapIiNS_12indirect_cmpIPfSt4lessIfEEENS_27typed_identity_property_mapIjEEED2Ev(%"class.boost::fibonacci_heap"* %this1)
  ret void
}

declare void @_ZSt9terminatev()

define linkonce_odr void @_ZNSt6vectorIfSaIfEED1Ev(%"class.std::vector"* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.std::vector"*, align 4
  store %"class.std::vector"* %this, %"class.std::vector"** %this.addr, align 4
  %this1 = load %"class.std::vector"** %this.addr
  call void @_ZNSt6vectorIfSaIfEED2Ev(%"class.std::vector"* %this1)
  ret void
}

define linkonce_odr void @_ZSt14__copy_move_a2ILb0EN9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEEESt16ostream_iteratorIfcSt11char_traitsIcEEET1_T0_SC_SB_(%"class.std::ostream_iterator"* noalias sret %agg.result, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %__first, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %__last, %"class.std::ostream_iterator"* %__result) inlinehint {
entry:
  %agg.tmp = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %agg.tmp1 = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %agg.tmp3 = alloca %"class.std::ostream_iterator", align 4
  %agg.tmp4 = alloca %"class.std::ostream_iterator", align 4
  %0 = bitcast %"class.__gnu_cxx::__normal_iterator"* %agg.tmp to i8*
  %1 = bitcast %"class.__gnu_cxx::__normal_iterator"* %__first to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %0, i8* %1, i32 4, i32 4, i1 false)
  %call = call float* @_ZSt12__niter_baseIN9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEEEENSt11_Niter_baseIT_E13iterator_typeES8_(%"class.__gnu_cxx::__normal_iterator"* byval align 4 %agg.tmp)
  %2 = bitcast %"class.__gnu_cxx::__normal_iterator"* %agg.tmp1 to i8*
  %3 = bitcast %"class.__gnu_cxx::__normal_iterator"* %__last to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %2, i8* %3, i32 4, i32 4, i1 false)
  %call2 = call float* @_ZSt12__niter_baseIN9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEEEENSt11_Niter_baseIT_E13iterator_typeES8_(%"class.__gnu_cxx::__normal_iterator"* byval align 4 %agg.tmp1)
  call void @_ZNSt16ostream_iteratorIfcSt11char_traitsIcEEC1ERKS2_(%"class.std::ostream_iterator"* %agg.tmp4, %"class.std::ostream_iterator"* %__result)
  call void @_ZSt12__niter_baseISt16ostream_iteratorIfcSt11char_traitsIcEEENSt11_Niter_baseIT_E13iterator_typeES5_(%"class.std::ostream_iterator"* sret %agg.tmp3, %"class.std::ostream_iterator"* %agg.tmp4)
  call void @_ZSt13__copy_move_aILb0EPfSt16ostream_iteratorIfcSt11char_traitsIcEEET1_T0_S6_S5_(%"class.std::ostream_iterator"* sret %agg.result, float* %call, float* %call2, %"class.std::ostream_iterator"* %agg.tmp3)
  ret void
}

define linkonce_odr void @_ZSt12__miter_baseIN9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEEEENSt11_Miter_baseIT_E13iterator_typeES8_(%"class.__gnu_cxx::__normal_iterator"* noalias sret %agg.result, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %__it) inlinehint {
entry:
  %agg.tmp = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %0 = bitcast %"class.__gnu_cxx::__normal_iterator"* %agg.tmp to i8*
  %1 = bitcast %"class.__gnu_cxx::__normal_iterator"* %__it to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %0, i8* %1, i32 4, i32 4, i1 false)
  call void @_ZNSt10_Iter_baseIN9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEEELb0EE7_S_baseES6_(%"class.__gnu_cxx::__normal_iterator"* sret %agg.result, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %agg.tmp)
  ret void
}

define linkonce_odr void @_ZNSt16ostream_iteratorIfcSt11char_traitsIcEEC1ERKS2_(%"class.std::ostream_iterator"* %this, %"class.std::ostream_iterator"* %__obj) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.std::ostream_iterator"*, align 4
  %__obj.addr = alloca %"class.std::ostream_iterator"*, align 4
  store %"class.std::ostream_iterator"* %this, %"class.std::ostream_iterator"** %this.addr, align 4
  store %"class.std::ostream_iterator"* %__obj, %"class.std::ostream_iterator"** %__obj.addr, align 4
  %this1 = load %"class.std::ostream_iterator"** %this.addr
  %0 = load %"class.std::ostream_iterator"** %__obj.addr
  call void @_ZNSt16ostream_iteratorIfcSt11char_traitsIcEEC2ERKS2_(%"class.std::ostream_iterator"* %this1, %"class.std::ostream_iterator"* %0)
  ret void
}

define linkonce_odr void @_ZNSt16ostream_iteratorIfcSt11char_traitsIcEEC2ERKS2_(%"class.std::ostream_iterator"* %this, %"class.std::ostream_iterator"* %__obj) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.std::ostream_iterator"*, align 4
  %__obj.addr = alloca %"class.std::ostream_iterator"*, align 4
  store %"class.std::ostream_iterator"* %this, %"class.std::ostream_iterator"** %this.addr, align 4
  store %"class.std::ostream_iterator"* %__obj, %"class.std::ostream_iterator"** %__obj.addr, align 4
  %this1 = load %"class.std::ostream_iterator"** %this.addr
  %0 = bitcast %"class.std::ostream_iterator"* %this1 to %"struct.std::iterator.14"*
  %_M_stream = getelementptr inbounds %"class.std::ostream_iterator"* %this1, i32 0, i32 0
  %1 = load %"class.std::ostream_iterator"** %__obj.addr, align 4
  %_M_stream2 = getelementptr inbounds %"class.std::ostream_iterator"* %1, i32 0, i32 0
  %2 = load %"class.std::basic_ostream"** %_M_stream2, align 4
  store %"class.std::basic_ostream"* %2, %"class.std::basic_ostream"** %_M_stream, align 4
  %_M_string = getelementptr inbounds %"class.std::ostream_iterator"* %this1, i32 0, i32 1
  %3 = load %"class.std::ostream_iterator"** %__obj.addr, align 4
  %_M_string3 = getelementptr inbounds %"class.std::ostream_iterator"* %3, i32 0, i32 1
  %4 = load i8** %_M_string3, align 4
  store i8* %4, i8** %_M_string, align 4
  ret void
}

define linkonce_odr void @_ZNSt10_Iter_baseIN9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEEELb0EE7_S_baseES6_(%"class.__gnu_cxx::__normal_iterator"* noalias sret %agg.result, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %__it) nounwind align 2 {
entry:
  %0 = bitcast %"class.__gnu_cxx::__normal_iterator"* %agg.result to i8*
  %1 = bitcast %"class.__gnu_cxx::__normal_iterator"* %__it to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %0, i8* %1, i32 4, i32 4, i1 false)
  ret void
}

define linkonce_odr void @_ZSt13__copy_move_aILb0EPfSt16ostream_iteratorIfcSt11char_traitsIcEEET1_T0_S6_S5_(%"class.std::ostream_iterator"* noalias sret %agg.result, float* %__first, float* %__last, %"class.std::ostream_iterator"* %__result) inlinehint {
entry:
  %__first.addr = alloca float*, align 4
  %__last.addr = alloca float*, align 4
  %__simple = alloca i8, align 1
  %agg.tmp = alloca %"class.std::ostream_iterator", align 4
  store float* %__first, float** %__first.addr, align 4
  store float* %__last, float** %__last.addr, align 4
  store i8 0, i8* %__simple, align 1
  %0 = load float** %__first.addr, align 4
  %1 = load float** %__last.addr, align 4
  call void @_ZNSt16ostream_iteratorIfcSt11char_traitsIcEEC1ERKS2_(%"class.std::ostream_iterator"* %agg.tmp, %"class.std::ostream_iterator"* %__result)
  call void @_ZNSt11__copy_moveILb0ELb0ESt26random_access_iterator_tagE8__copy_mIPfSt16ostream_iteratorIfcSt11char_traitsIcEEEET0_T_S9_S8_(%"class.std::ostream_iterator"* sret %agg.result, float* %0, float* %1, %"class.std::ostream_iterator"* %agg.tmp)
  ret void
}

define linkonce_odr float* @_ZSt12__niter_baseIN9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEEEENSt11_Niter_baseIT_E13iterator_typeES8_(%"class.__gnu_cxx::__normal_iterator"* byval align 4 %__it) inlinehint {
entry:
  %agg.tmp = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %0 = bitcast %"class.__gnu_cxx::__normal_iterator"* %agg.tmp to i8*
  %1 = bitcast %"class.__gnu_cxx::__normal_iterator"* %__it to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %0, i8* %1, i32 4, i32 4, i1 false)
  %call = call float* @_ZNSt10_Iter_baseIN9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEEELb1EE7_S_baseES6_(%"class.__gnu_cxx::__normal_iterator"* byval align 4 %agg.tmp)
  ret float* %call
}

define linkonce_odr void @_ZSt12__niter_baseISt16ostream_iteratorIfcSt11char_traitsIcEEENSt11_Niter_baseIT_E13iterator_typeES5_(%"class.std::ostream_iterator"* noalias sret %agg.result, %"class.std::ostream_iterator"* %__it) inlinehint {
entry:
  %agg.tmp = alloca %"class.std::ostream_iterator", align 4
  call void @_ZNSt16ostream_iteratorIfcSt11char_traitsIcEEC1ERKS2_(%"class.std::ostream_iterator"* %agg.tmp, %"class.std::ostream_iterator"* %__it)
  call void @_ZNSt10_Iter_baseISt16ostream_iteratorIfcSt11char_traitsIcEELb0EE7_S_baseES3_(%"class.std::ostream_iterator"* sret %agg.result, %"class.std::ostream_iterator"* %agg.tmp)
  ret void
}

define linkonce_odr void @_ZNSt10_Iter_baseISt16ostream_iteratorIfcSt11char_traitsIcEELb0EE7_S_baseES3_(%"class.std::ostream_iterator"* noalias sret %agg.result, %"class.std::ostream_iterator"* %__it) align 2 {
entry:
  call void @_ZNSt16ostream_iteratorIfcSt11char_traitsIcEEC1ERKS2_(%"class.std::ostream_iterator"* %agg.result, %"class.std::ostream_iterator"* %__it)
  ret void
}

define linkonce_odr float* @_ZNSt10_Iter_baseIN9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEEELb1EE7_S_baseES6_(%"class.__gnu_cxx::__normal_iterator"* byval align 4 %__it) align 2 {
entry:
  %call = call float** @_ZNK9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEE4baseEv(%"class.__gnu_cxx::__normal_iterator"* %__it)
  %0 = load float** %call
  ret float* %0
}

define linkonce_odr float** @_ZNK9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEE4baseEv(%"class.__gnu_cxx::__normal_iterator"* %this) nounwind align 2 {
entry:
  %this.addr = alloca %"class.__gnu_cxx::__normal_iterator"*, align 4
  store %"class.__gnu_cxx::__normal_iterator"* %this, %"class.__gnu_cxx::__normal_iterator"** %this.addr, align 4
  %this1 = load %"class.__gnu_cxx::__normal_iterator"** %this.addr
  %_M_current = getelementptr inbounds %"class.__gnu_cxx::__normal_iterator"* %this1, i32 0, i32 0
  ret float** %_M_current
}

define linkonce_odr void @_ZNSt11__copy_moveILb0ELb0ESt26random_access_iterator_tagE8__copy_mIPfSt16ostream_iteratorIfcSt11char_traitsIcEEEET0_T_S9_S8_(%"class.std::ostream_iterator"* noalias sret %agg.result, float* %__first, float* %__last, %"class.std::ostream_iterator"* %__result) align 2 {
entry:
  %__first.addr = alloca float*, align 4
  %__last.addr = alloca float*, align 4
  %__n = alloca i32, align 4
  store float* %__first, float** %__first.addr, align 4
  store float* %__last, float** %__last.addr, align 4
  %0 = load float** %__last.addr, align 4
  %1 = load float** %__first.addr, align 4
  %sub.ptr.lhs.cast = ptrtoint float* %0 to i32
  %sub.ptr.rhs.cast = ptrtoint float* %1 to i32
  %sub.ptr.sub = sub i32 %sub.ptr.lhs.cast, %sub.ptr.rhs.cast
  %sub.ptr.div = sdiv exact i32 %sub.ptr.sub, 4
  store i32 %sub.ptr.div, i32* %__n, align 4
  br label %for.cond

for.cond:                                         ; preds = %for.inc, %entry
  %2 = load i32* %__n, align 4
  %cmp = icmp sgt i32 %2, 0
  br i1 %cmp, label %for.body, label %for.end

for.body:                                         ; preds = %for.cond
  %call = call %"class.std::ostream_iterator"* @_ZNSt16ostream_iteratorIfcSt11char_traitsIcEEdeEv(%"class.std::ostream_iterator"* %__result)
  %3 = load float** %__first.addr, align 4
  %call1 = call %"class.std::ostream_iterator"* @_ZNSt16ostream_iteratorIfcSt11char_traitsIcEEaSERKf(%"class.std::ostream_iterator"* %call, float* %3)
  %4 = load float** %__first.addr, align 4
  %incdec.ptr = getelementptr inbounds float* %4, i32 1
  store float* %incdec.ptr, float** %__first.addr, align 4
  %call2 = call %"class.std::ostream_iterator"* @_ZNSt16ostream_iteratorIfcSt11char_traitsIcEEppEv(%"class.std::ostream_iterator"* %__result)
  br label %for.inc

for.inc:                                          ; preds = %for.body
  %5 = load i32* %__n, align 4
  %dec = add nsw i32 %5, -1
  store i32 %dec, i32* %__n, align 4
  br label %for.cond

for.end:                                          ; preds = %for.cond
  call void @_ZNSt16ostream_iteratorIfcSt11char_traitsIcEEC1ERKS2_(%"class.std::ostream_iterator"* %agg.result, %"class.std::ostream_iterator"* %__result)
  ret void
}

define linkonce_odr %"class.std::ostream_iterator"* @_ZNSt16ostream_iteratorIfcSt11char_traitsIcEEdeEv(%"class.std::ostream_iterator"* %this) nounwind align 2 {
entry:
  %this.addr = alloca %"class.std::ostream_iterator"*, align 4
  store %"class.std::ostream_iterator"* %this, %"class.std::ostream_iterator"** %this.addr, align 4
  %this1 = load %"class.std::ostream_iterator"** %this.addr
  ret %"class.std::ostream_iterator"* %this1
}

define linkonce_odr %"class.std::ostream_iterator"* @_ZNSt16ostream_iteratorIfcSt11char_traitsIcEEaSERKf(%"class.std::ostream_iterator"* %this, float* %__value) align 2 {
entry:
  %this.addr = alloca %"class.std::ostream_iterator"*, align 4
  %__value.addr = alloca float*, align 4
  store %"class.std::ostream_iterator"* %this, %"class.std::ostream_iterator"** %this.addr, align 4
  store float* %__value, float** %__value.addr, align 4
  %this1 = load %"class.std::ostream_iterator"** %this.addr
  %_M_stream = getelementptr inbounds %"class.std::ostream_iterator"* %this1, i32 0, i32 0
  %0 = load %"class.std::basic_ostream"** %_M_stream, align 4
  %1 = load float** %__value.addr, align 4
  %2 = load float* %1, align 4
  %call = call %"class.std::basic_ostream"* @_ZNSolsEf(%"class.std::basic_ostream"* %0, float %2)
  %_M_string = getelementptr inbounds %"class.std::ostream_iterator"* %this1, i32 0, i32 1
  %3 = load i8** %_M_string, align 4
  %tobool = icmp ne i8* %3, null
  br i1 %tobool, label %if.then, label %if.end

if.then:                                          ; preds = %entry
  %_M_stream2 = getelementptr inbounds %"class.std::ostream_iterator"* %this1, i32 0, i32 0
  %4 = load %"class.std::basic_ostream"** %_M_stream2, align 4
  %_M_string3 = getelementptr inbounds %"class.std::ostream_iterator"* %this1, i32 0, i32 1
  %5 = load i8** %_M_string3, align 4
  %call4 = call %"class.std::basic_ostream"* @_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(%"class.std::basic_ostream"* %4, i8* %5)
  br label %if.end

if.end:                                           ; preds = %if.then, %entry
  ret %"class.std::ostream_iterator"* %this1
}

define linkonce_odr %"class.std::ostream_iterator"* @_ZNSt16ostream_iteratorIfcSt11char_traitsIcEEppEv(%"class.std::ostream_iterator"* %this) nounwind align 2 {
entry:
  %this.addr = alloca %"class.std::ostream_iterator"*, align 4
  store %"class.std::ostream_iterator"* %this, %"class.std::ostream_iterator"** %this.addr, align 4
  %this1 = load %"class.std::ostream_iterator"** %this.addr
  ret %"class.std::ostream_iterator"* %this1
}

declare %"class.std::basic_ostream"* @_ZNSolsEf(%"class.std::basic_ostream"*, float)

define linkonce_odr void @_ZNSt16ostream_iteratorIfcSt11char_traitsIcEEC2ERSoPKc(%"class.std::ostream_iterator"* %this, %"class.std::basic_ostream"* %__s, i8* %__c) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.std::ostream_iterator"*, align 4
  %__s.addr = alloca %"class.std::basic_ostream"*, align 4
  %__c.addr = alloca i8*, align 4
  store %"class.std::ostream_iterator"* %this, %"class.std::ostream_iterator"** %this.addr, align 4
  store %"class.std::basic_ostream"* %__s, %"class.std::basic_ostream"** %__s.addr, align 4
  store i8* %__c, i8** %__c.addr, align 4
  %this1 = load %"class.std::ostream_iterator"** %this.addr
  %0 = bitcast %"class.std::ostream_iterator"* %this1 to %"struct.std::iterator.14"*
  %_M_stream = getelementptr inbounds %"class.std::ostream_iterator"* %this1, i32 0, i32 0
  %1 = load %"class.std::basic_ostream"** %__s.addr, align 4
  store %"class.std::basic_ostream"* %1, %"class.std::basic_ostream"** %_M_stream, align 4
  %_M_string = getelementptr inbounds %"class.std::ostream_iterator"* %this1, i32 0, i32 1
  %2 = load i8** %__c.addr, align 4
  store i8* %2, i8** %_M_string, align 4
  ret void
}

define linkonce_odr zeroext i1 @_ZSt11__equal_auxIPfS0_EbT_S1_T0_(float* %__first1, float* %__last1, float* %__first2) inlinehint {
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
  %call = call zeroext i1 @_ZNSt7__equalILb0EE5equalIPfS2_EEbT_S3_T0_(float* %0, float* %1, float* %2)
  ret i1 %call
}

define linkonce_odr zeroext i1 @_ZNSt7__equalILb0EE5equalIPfS2_EEbT_S3_T0_(float* %__first1, float* %__last1, float* %__first2) nounwind align 2 {
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

define linkonce_odr zeroext i1 @_ZN9__gnu_cxxneIPfSt6vectorIfSaIfEEEEbRKNS_17__normal_iteratorIT_T0_EESA_(%"class.__gnu_cxx::__normal_iterator"* %__lhs, %"class.__gnu_cxx::__normal_iterator"* %__rhs) nounwind inlinehint {
entry:
  %__lhs.addr = alloca %"class.__gnu_cxx::__normal_iterator"*, align 4
  %__rhs.addr = alloca %"class.__gnu_cxx::__normal_iterator"*, align 4
  store %"class.__gnu_cxx::__normal_iterator"* %__lhs, %"class.__gnu_cxx::__normal_iterator"** %__lhs.addr, align 4
  store %"class.__gnu_cxx::__normal_iterator"* %__rhs, %"class.__gnu_cxx::__normal_iterator"** %__rhs.addr, align 4
  %0 = load %"class.__gnu_cxx::__normal_iterator"** %__lhs.addr, align 4
  %call = call float** @_ZNK9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEE4baseEv(%"class.__gnu_cxx::__normal_iterator"* %0)
  %1 = load float** %call
  %2 = load %"class.__gnu_cxx::__normal_iterator"** %__rhs.addr, align 4
  %call1 = call float** @_ZNK9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEE4baseEv(%"class.__gnu_cxx::__normal_iterator"* %2)
  %3 = load float** %call1
  %cmp = icmp ne float* %1, %3
  ret i1 %cmp
}

define linkonce_odr void @_ZSt16__introsort_loopIN9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEEEiEvT_S7_T0_(%"class.__gnu_cxx::__normal_iterator"* byval align 4 %__first, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %__last, i32 %__depth_limit) {
entry:
  %__depth_limit.addr = alloca i32, align 4
  %agg.tmp = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %agg.tmp2 = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %agg.tmp3 = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %__cut = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %agg.tmp4 = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %agg.tmp5 = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %agg.tmp6 = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %agg.tmp7 = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  store i32 %__depth_limit, i32* %__depth_limit.addr, align 4
  br label %while.cond

while.cond:                                       ; preds = %if.end, %entry
  %call = call i32 @_ZN9__gnu_cxxmiIPfSt6vectorIfSaIfEEEENS_17__normal_iteratorIT_T0_E15difference_typeERKS8_SB_(%"class.__gnu_cxx::__normal_iterator"* %__last, %"class.__gnu_cxx::__normal_iterator"* %__first)
  %cmp = icmp sgt i32 %call, 16
  br i1 %cmp, label %while.body, label %while.end

while.body:                                       ; preds = %while.cond
  %0 = load i32* %__depth_limit.addr, align 4
  %cmp1 = icmp eq i32 %0, 0
  br i1 %cmp1, label %if.then, label %if.end

if.then:                                          ; preds = %while.body
  %1 = bitcast %"class.__gnu_cxx::__normal_iterator"* %agg.tmp to i8*
  %2 = bitcast %"class.__gnu_cxx::__normal_iterator"* %__first to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %1, i8* %2, i32 4, i32 4, i1 false)
  %3 = bitcast %"class.__gnu_cxx::__normal_iterator"* %agg.tmp2 to i8*
  %4 = bitcast %"class.__gnu_cxx::__normal_iterator"* %__last to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %3, i8* %4, i32 4, i32 4, i1 false)
  %5 = bitcast %"class.__gnu_cxx::__normal_iterator"* %agg.tmp3 to i8*
  %6 = bitcast %"class.__gnu_cxx::__normal_iterator"* %__last to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %5, i8* %6, i32 4, i32 4, i1 false)
  call void @_ZSt12partial_sortIN9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEEEEvT_S7_S7_(%"class.__gnu_cxx::__normal_iterator"* byval align 4 %agg.tmp, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %agg.tmp2, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %agg.tmp3)
  br label %while.end

if.end:                                           ; preds = %while.body
  %7 = load i32* %__depth_limit.addr, align 4
  %dec = add nsw i32 %7, -1
  store i32 %dec, i32* %__depth_limit.addr, align 4
  %8 = bitcast %"class.__gnu_cxx::__normal_iterator"* %agg.tmp4 to i8*
  %9 = bitcast %"class.__gnu_cxx::__normal_iterator"* %__first to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %8, i8* %9, i32 4, i32 4, i1 false)
  %10 = bitcast %"class.__gnu_cxx::__normal_iterator"* %agg.tmp5 to i8*
  %11 = bitcast %"class.__gnu_cxx::__normal_iterator"* %__last to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %10, i8* %11, i32 4, i32 4, i1 false)
  call void @_ZSt27__unguarded_partition_pivotIN9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEEEET_S7_S7_(%"class.__gnu_cxx::__normal_iterator"* sret %__cut, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %agg.tmp4, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %agg.tmp5)
  %12 = bitcast %"class.__gnu_cxx::__normal_iterator"* %agg.tmp6 to i8*
  %13 = bitcast %"class.__gnu_cxx::__normal_iterator"* %__cut to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %12, i8* %13, i32 4, i32 4, i1 false)
  %14 = bitcast %"class.__gnu_cxx::__normal_iterator"* %agg.tmp7 to i8*
  %15 = bitcast %"class.__gnu_cxx::__normal_iterator"* %__last to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %14, i8* %15, i32 4, i32 4, i1 false)
  %16 = load i32* %__depth_limit.addr, align 4
  call void @_ZSt16__introsort_loopIN9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEEEiEvT_S7_T0_(%"class.__gnu_cxx::__normal_iterator"* byval align 4 %agg.tmp6, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %agg.tmp7, i32 %16)
  %17 = bitcast %"class.__gnu_cxx::__normal_iterator"* %__last to i8*
  %18 = bitcast %"class.__gnu_cxx::__normal_iterator"* %__cut to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %17, i8* %18, i32 4, i32 4, i1 false)
  br label %while.cond

while.end:                                        ; preds = %if.then, %while.cond
  ret void
}

define linkonce_odr i32 @_ZSt4__lgi(i32 %__n) nounwind inlinehint {
entry:
  %__n.addr = alloca i32, align 4
  store i32 %__n, i32* %__n.addr, align 4
  %0 = load i32* %__n.addr, align 4
  %1 = call i32 @llvm.ctlz.i32(i32 %0, i1 true)
  %sub = sub i32 31, %1
  ret i32 %sub
}

define linkonce_odr i32 @_ZN9__gnu_cxxmiIPfSt6vectorIfSaIfEEEENS_17__normal_iteratorIT_T0_E15difference_typeERKS8_SB_(%"class.__gnu_cxx::__normal_iterator"* %__lhs, %"class.__gnu_cxx::__normal_iterator"* %__rhs) nounwind inlinehint {
entry:
  %__lhs.addr = alloca %"class.__gnu_cxx::__normal_iterator"*, align 4
  %__rhs.addr = alloca %"class.__gnu_cxx::__normal_iterator"*, align 4
  store %"class.__gnu_cxx::__normal_iterator"* %__lhs, %"class.__gnu_cxx::__normal_iterator"** %__lhs.addr, align 4
  store %"class.__gnu_cxx::__normal_iterator"* %__rhs, %"class.__gnu_cxx::__normal_iterator"** %__rhs.addr, align 4
  %0 = load %"class.__gnu_cxx::__normal_iterator"** %__lhs.addr, align 4
  %call = call float** @_ZNK9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEE4baseEv(%"class.__gnu_cxx::__normal_iterator"* %0)
  %1 = load float** %call
  %2 = load %"class.__gnu_cxx::__normal_iterator"** %__rhs.addr, align 4
  %call1 = call float** @_ZNK9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEE4baseEv(%"class.__gnu_cxx::__normal_iterator"* %2)
  %3 = load float** %call1
  %sub.ptr.lhs.cast = ptrtoint float* %1 to i32
  %sub.ptr.rhs.cast = ptrtoint float* %3 to i32
  %sub.ptr.sub = sub i32 %sub.ptr.lhs.cast, %sub.ptr.rhs.cast
  %sub.ptr.div = sdiv exact i32 %sub.ptr.sub, 4
  ret i32 %sub.ptr.div
}

define linkonce_odr void @_ZSt22__final_insertion_sortIN9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEEEEvT_S7_(%"class.__gnu_cxx::__normal_iterator"* byval align 4 %__first, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %__last) {
entry:
  %agg.tmp = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %agg.tmp1 = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %ref.tmp = alloca i32, align 4
  %agg.tmp2 = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %ref.tmp3 = alloca i32, align 4
  %agg.tmp4 = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %agg.tmp5 = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %agg.tmp6 = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %call = call i32 @_ZN9__gnu_cxxmiIPfSt6vectorIfSaIfEEEENS_17__normal_iteratorIT_T0_E15difference_typeERKS8_SB_(%"class.__gnu_cxx::__normal_iterator"* %__last, %"class.__gnu_cxx::__normal_iterator"* %__first)
  %cmp = icmp sgt i32 %call, 16
  br i1 %cmp, label %if.then, label %if.else

if.then:                                          ; preds = %entry
  %0 = bitcast %"class.__gnu_cxx::__normal_iterator"* %agg.tmp to i8*
  %1 = bitcast %"class.__gnu_cxx::__normal_iterator"* %__first to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %0, i8* %1, i32 4, i32 4, i1 false)
  store i32 16, i32* %ref.tmp, align 4
  call void @_ZNK9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEEplERKi(%"class.__gnu_cxx::__normal_iterator"* sret %agg.tmp1, %"class.__gnu_cxx::__normal_iterator"* %__first, i32* %ref.tmp)
  call void @_ZSt16__insertion_sortIN9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEEEEvT_S7_(%"class.__gnu_cxx::__normal_iterator"* byval align 4 %agg.tmp, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %agg.tmp1)
  store i32 16, i32* %ref.tmp3, align 4
  call void @_ZNK9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEEplERKi(%"class.__gnu_cxx::__normal_iterator"* sret %agg.tmp2, %"class.__gnu_cxx::__normal_iterator"* %__first, i32* %ref.tmp3)
  %2 = bitcast %"class.__gnu_cxx::__normal_iterator"* %agg.tmp4 to i8*
  %3 = bitcast %"class.__gnu_cxx::__normal_iterator"* %__last to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %2, i8* %3, i32 4, i32 4, i1 false)
  call void @_ZSt26__unguarded_insertion_sortIN9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEEEEvT_S7_(%"class.__gnu_cxx::__normal_iterator"* byval align 4 %agg.tmp2, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %agg.tmp4)
  br label %if.end

if.else:                                          ; preds = %entry
  %4 = bitcast %"class.__gnu_cxx::__normal_iterator"* %agg.tmp5 to i8*
  %5 = bitcast %"class.__gnu_cxx::__normal_iterator"* %__first to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %4, i8* %5, i32 4, i32 4, i1 false)
  %6 = bitcast %"class.__gnu_cxx::__normal_iterator"* %agg.tmp6 to i8*
  %7 = bitcast %"class.__gnu_cxx::__normal_iterator"* %__last to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %6, i8* %7, i32 4, i32 4, i1 false)
  call void @_ZSt16__insertion_sortIN9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEEEEvT_S7_(%"class.__gnu_cxx::__normal_iterator"* byval align 4 %agg.tmp5, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %agg.tmp6)
  br label %if.end

if.end:                                           ; preds = %if.else, %if.then
  ret void
}

define linkonce_odr void @_ZSt16__insertion_sortIN9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEEEEvT_S7_(%"class.__gnu_cxx::__normal_iterator"* byval align 4 %__first, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %__last) {
entry:
  %__i = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %ref.tmp = alloca i32, align 4
  %__val = alloca float, align 4
  %agg.tmp = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %agg.tmp6 = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %agg.tmp7 = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %ref.tmp8 = alloca i32, align 4
  %tmp = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %agg.tmp10 = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %call = call zeroext i1 @_ZN9__gnu_cxxeqIPfSt6vectorIfSaIfEEEEbRKNS_17__normal_iteratorIT_T0_EESA_(%"class.__gnu_cxx::__normal_iterator"* %__first, %"class.__gnu_cxx::__normal_iterator"* %__last)
  br i1 %call, label %if.then, label %if.end

if.then:                                          ; preds = %entry
  br label %for.end

if.end:                                           ; preds = %entry
  store i32 1, i32* %ref.tmp, align 4
  call void @_ZNK9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEEplERKi(%"class.__gnu_cxx::__normal_iterator"* sret %__i, %"class.__gnu_cxx::__normal_iterator"* %__first, i32* %ref.tmp)
  br label %for.cond

for.cond:                                         ; preds = %for.inc, %if.end
  %call1 = call zeroext i1 @_ZN9__gnu_cxxneIPfSt6vectorIfSaIfEEEEbRKNS_17__normal_iteratorIT_T0_EESA_(%"class.__gnu_cxx::__normal_iterator"* %__i, %"class.__gnu_cxx::__normal_iterator"* %__last)
  br i1 %call1, label %for.body, label %for.end

for.body:                                         ; preds = %for.cond
  %call2 = call float* @_ZNK9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEEdeEv(%"class.__gnu_cxx::__normal_iterator"* %__i)
  %0 = load float* %call2
  %call3 = call float* @_ZNK9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEEdeEv(%"class.__gnu_cxx::__normal_iterator"* %__first)
  %1 = load float* %call3
  %cmp = fcmp olt float %0, %1
  br i1 %cmp, label %if.then4, label %if.else

if.then4:                                         ; preds = %for.body
  %call5 = call float* @_ZNK9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEEdeEv(%"class.__gnu_cxx::__normal_iterator"* %__i)
  %2 = load float* %call5
  store float %2, float* %__val, align 4
  %3 = bitcast %"class.__gnu_cxx::__normal_iterator"* %agg.tmp to i8*
  %4 = bitcast %"class.__gnu_cxx::__normal_iterator"* %__first to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %3, i8* %4, i32 4, i32 4, i1 false)
  %5 = bitcast %"class.__gnu_cxx::__normal_iterator"* %agg.tmp6 to i8*
  %6 = bitcast %"class.__gnu_cxx::__normal_iterator"* %__i to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %5, i8* %6, i32 4, i32 4, i1 false)
  store i32 1, i32* %ref.tmp8, align 4
  call void @_ZNK9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEEplERKi(%"class.__gnu_cxx::__normal_iterator"* sret %agg.tmp7, %"class.__gnu_cxx::__normal_iterator"* %__i, i32* %ref.tmp8)
  call void @_ZSt13copy_backwardIN9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEEES6_ET0_T_S8_S7_(%"class.__gnu_cxx::__normal_iterator"* sret %tmp, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %agg.tmp, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %agg.tmp6, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %agg.tmp7)
  %7 = load float* %__val, align 4
  %call9 = call float* @_ZNK9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEEdeEv(%"class.__gnu_cxx::__normal_iterator"* %__first)
  store float %7, float* %call9
  br label %if.end11

if.else:                                          ; preds = %for.body
  %8 = bitcast %"class.__gnu_cxx::__normal_iterator"* %agg.tmp10 to i8*
  %9 = bitcast %"class.__gnu_cxx::__normal_iterator"* %__i to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %8, i8* %9, i32 4, i32 4, i1 false)
  call void @_ZSt25__unguarded_linear_insertIN9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEEEEvT_(%"class.__gnu_cxx::__normal_iterator"* byval align 4 %agg.tmp10)
  br label %if.end11

if.end11:                                         ; preds = %if.else, %if.then4
  br label %for.inc

for.inc:                                          ; preds = %if.end11
  %call12 = call %"class.__gnu_cxx::__normal_iterator"* @_ZN9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEEppEv(%"class.__gnu_cxx::__normal_iterator"* %__i)
  br label %for.cond

for.end:                                          ; preds = %if.then, %for.cond
  ret void
}

define linkonce_odr void @_ZNK9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEEplERKi(%"class.__gnu_cxx::__normal_iterator"* noalias sret %agg.result, %"class.__gnu_cxx::__normal_iterator"* %this, i32* %__n) align 2 {
entry:
  %this.addr = alloca %"class.__gnu_cxx::__normal_iterator"*, align 4
  %__n.addr = alloca i32*, align 4
  %ref.tmp = alloca float*, align 4
  store %"class.__gnu_cxx::__normal_iterator"* %this, %"class.__gnu_cxx::__normal_iterator"** %this.addr, align 4
  store i32* %__n, i32** %__n.addr, align 4
  %this1 = load %"class.__gnu_cxx::__normal_iterator"** %this.addr
  %_M_current = getelementptr inbounds %"class.__gnu_cxx::__normal_iterator"* %this1, i32 0, i32 0
  %0 = load float** %_M_current, align 4
  %1 = load i32** %__n.addr, align 4
  %2 = load i32* %1, align 4
  %add.ptr = getelementptr inbounds float* %0, i32 %2
  store float* %add.ptr, float** %ref.tmp, align 4
  call void @_ZN9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEEC1ERKS1_(%"class.__gnu_cxx::__normal_iterator"* %agg.result, float** %ref.tmp)
  ret void
}

define linkonce_odr void @_ZSt26__unguarded_insertion_sortIN9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEEEEvT_S7_(%"class.__gnu_cxx::__normal_iterator"* byval align 4 %__first, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %__last) inlinehint {
entry:
  %__i = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %agg.tmp = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %0 = bitcast %"class.__gnu_cxx::__normal_iterator"* %__i to i8*
  %1 = bitcast %"class.__gnu_cxx::__normal_iterator"* %__first to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %0, i8* %1, i32 4, i32 4, i1 false)
  br label %for.cond

for.cond:                                         ; preds = %for.inc, %entry
  %call = call zeroext i1 @_ZN9__gnu_cxxneIPfSt6vectorIfSaIfEEEEbRKNS_17__normal_iteratorIT_T0_EESA_(%"class.__gnu_cxx::__normal_iterator"* %__i, %"class.__gnu_cxx::__normal_iterator"* %__last)
  br i1 %call, label %for.body, label %for.end

for.body:                                         ; preds = %for.cond
  %2 = bitcast %"class.__gnu_cxx::__normal_iterator"* %agg.tmp to i8*
  %3 = bitcast %"class.__gnu_cxx::__normal_iterator"* %__i to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %2, i8* %3, i32 4, i32 4, i1 false)
  call void @_ZSt25__unguarded_linear_insertIN9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEEEEvT_(%"class.__gnu_cxx::__normal_iterator"* byval align 4 %agg.tmp)
  br label %for.inc

for.inc:                                          ; preds = %for.body
  %call1 = call %"class.__gnu_cxx::__normal_iterator"* @_ZN9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEEppEv(%"class.__gnu_cxx::__normal_iterator"* %__i)
  br label %for.cond

for.end:                                          ; preds = %for.cond
  ret void
}

define linkonce_odr void @_ZSt25__unguarded_linear_insertIN9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEEEEvT_(%"class.__gnu_cxx::__normal_iterator"* byval align 4 %__last) {
entry:
  %__val = alloca float, align 4
  %__next = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %call = call float* @_ZNK9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEEdeEv(%"class.__gnu_cxx::__normal_iterator"* %__last)
  %0 = load float* %call
  store float %0, float* %__val, align 4
  %1 = bitcast %"class.__gnu_cxx::__normal_iterator"* %__next to i8*
  %2 = bitcast %"class.__gnu_cxx::__normal_iterator"* %__last to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %1, i8* %2, i32 4, i32 4, i1 false)
  %call1 = call %"class.__gnu_cxx::__normal_iterator"* @_ZN9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEEmmEv(%"class.__gnu_cxx::__normal_iterator"* %__next)
  br label %while.cond

while.cond:                                       ; preds = %while.body, %entry
  %3 = load float* %__val, align 4
  %call2 = call float* @_ZNK9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEEdeEv(%"class.__gnu_cxx::__normal_iterator"* %__next)
  %4 = load float* %call2
  %cmp = fcmp olt float %3, %4
  br i1 %cmp, label %while.body, label %while.end

while.body:                                       ; preds = %while.cond
  %call3 = call float* @_ZNK9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEEdeEv(%"class.__gnu_cxx::__normal_iterator"* %__next)
  %5 = load float* %call3
  %call4 = call float* @_ZNK9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEEdeEv(%"class.__gnu_cxx::__normal_iterator"* %__last)
  store float %5, float* %call4
  %6 = bitcast %"class.__gnu_cxx::__normal_iterator"* %__last to i8*
  %7 = bitcast %"class.__gnu_cxx::__normal_iterator"* %__next to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %6, i8* %7, i32 4, i32 4, i1 false)
  %call5 = call %"class.__gnu_cxx::__normal_iterator"* @_ZN9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEEmmEv(%"class.__gnu_cxx::__normal_iterator"* %__next)
  br label %while.cond

while.end:                                        ; preds = %while.cond
  %8 = load float* %__val, align 4
  %call6 = call float* @_ZNK9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEEdeEv(%"class.__gnu_cxx::__normal_iterator"* %__last)
  store float %8, float* %call6
  ret void
}

define linkonce_odr %"class.__gnu_cxx::__normal_iterator"* @_ZN9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEEppEv(%"class.__gnu_cxx::__normal_iterator"* %this) nounwind align 2 {
entry:
  %this.addr = alloca %"class.__gnu_cxx::__normal_iterator"*, align 4
  store %"class.__gnu_cxx::__normal_iterator"* %this, %"class.__gnu_cxx::__normal_iterator"** %this.addr, align 4
  %this1 = load %"class.__gnu_cxx::__normal_iterator"** %this.addr
  %_M_current = getelementptr inbounds %"class.__gnu_cxx::__normal_iterator"* %this1, i32 0, i32 0
  %0 = load float** %_M_current, align 4
  %incdec.ptr = getelementptr inbounds float* %0, i32 1
  store float* %incdec.ptr, float** %_M_current, align 4
  ret %"class.__gnu_cxx::__normal_iterator"* %this1
}

define linkonce_odr float* @_ZNK9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEEdeEv(%"class.__gnu_cxx::__normal_iterator"* %this) nounwind align 2 {
entry:
  %this.addr = alloca %"class.__gnu_cxx::__normal_iterator"*, align 4
  store %"class.__gnu_cxx::__normal_iterator"* %this, %"class.__gnu_cxx::__normal_iterator"** %this.addr, align 4
  %this1 = load %"class.__gnu_cxx::__normal_iterator"** %this.addr
  %_M_current = getelementptr inbounds %"class.__gnu_cxx::__normal_iterator"* %this1, i32 0, i32 0
  %0 = load float** %_M_current, align 4
  ret float* %0
}

define linkonce_odr %"class.__gnu_cxx::__normal_iterator"* @_ZN9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEEmmEv(%"class.__gnu_cxx::__normal_iterator"* %this) nounwind align 2 {
entry:
  %this.addr = alloca %"class.__gnu_cxx::__normal_iterator"*, align 4
  store %"class.__gnu_cxx::__normal_iterator"* %this, %"class.__gnu_cxx::__normal_iterator"** %this.addr, align 4
  %this1 = load %"class.__gnu_cxx::__normal_iterator"** %this.addr
  %_M_current = getelementptr inbounds %"class.__gnu_cxx::__normal_iterator"* %this1, i32 0, i32 0
  %0 = load float** %_M_current, align 4
  %incdec.ptr = getelementptr inbounds float* %0, i32 -1
  store float* %incdec.ptr, float** %_M_current, align 4
  ret %"class.__gnu_cxx::__normal_iterator"* %this1
}

define linkonce_odr void @_ZN9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEEC1ERKS1_(%"class.__gnu_cxx::__normal_iterator"* %this, float** %__i) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.__gnu_cxx::__normal_iterator"*, align 4
  %__i.addr = alloca float**, align 4
  store %"class.__gnu_cxx::__normal_iterator"* %this, %"class.__gnu_cxx::__normal_iterator"** %this.addr, align 4
  store float** %__i, float*** %__i.addr, align 4
  %this1 = load %"class.__gnu_cxx::__normal_iterator"** %this.addr
  %0 = load float*** %__i.addr
  call void @_ZN9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEEC2ERKS1_(%"class.__gnu_cxx::__normal_iterator"* %this1, float** %0)
  ret void
}

define linkonce_odr void @_ZN9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEEC2ERKS1_(%"class.__gnu_cxx::__normal_iterator"* %this, float** %__i) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.__gnu_cxx::__normal_iterator"*, align 4
  %__i.addr = alloca float**, align 4
  store %"class.__gnu_cxx::__normal_iterator"* %this, %"class.__gnu_cxx::__normal_iterator"** %this.addr, align 4
  store float** %__i, float*** %__i.addr, align 4
  %this1 = load %"class.__gnu_cxx::__normal_iterator"** %this.addr
  %_M_current = getelementptr inbounds %"class.__gnu_cxx::__normal_iterator"* %this1, i32 0, i32 0
  %0 = load float*** %__i.addr, align 4
  %1 = load float** %0, align 4
  store float* %1, float** %_M_current, align 4
  ret void
}

define linkonce_odr zeroext i1 @_ZN9__gnu_cxxeqIPfSt6vectorIfSaIfEEEEbRKNS_17__normal_iteratorIT_T0_EESA_(%"class.__gnu_cxx::__normal_iterator"* %__lhs, %"class.__gnu_cxx::__normal_iterator"* %__rhs) nounwind inlinehint {
entry:
  %__lhs.addr = alloca %"class.__gnu_cxx::__normal_iterator"*, align 4
  %__rhs.addr = alloca %"class.__gnu_cxx::__normal_iterator"*, align 4
  store %"class.__gnu_cxx::__normal_iterator"* %__lhs, %"class.__gnu_cxx::__normal_iterator"** %__lhs.addr, align 4
  store %"class.__gnu_cxx::__normal_iterator"* %__rhs, %"class.__gnu_cxx::__normal_iterator"** %__rhs.addr, align 4
  %0 = load %"class.__gnu_cxx::__normal_iterator"** %__lhs.addr, align 4
  %call = call float** @_ZNK9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEE4baseEv(%"class.__gnu_cxx::__normal_iterator"* %0)
  %1 = load float** %call
  %2 = load %"class.__gnu_cxx::__normal_iterator"** %__rhs.addr, align 4
  %call1 = call float** @_ZNK9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEE4baseEv(%"class.__gnu_cxx::__normal_iterator"* %2)
  %3 = load float** %call1
  %cmp = icmp eq float* %1, %3
  ret i1 %cmp
}

define linkonce_odr void @_ZSt13copy_backwardIN9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEEES6_ET0_T_S8_S7_(%"class.__gnu_cxx::__normal_iterator"* noalias sret %agg.result, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %__first, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %__last, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %__result) {
entry:
  %agg.tmp = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %agg.tmp1 = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %agg.tmp2 = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %agg.tmp3 = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %agg.tmp4 = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %0 = bitcast %"class.__gnu_cxx::__normal_iterator"* %agg.tmp1 to i8*
  %1 = bitcast %"class.__gnu_cxx::__normal_iterator"* %__first to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %0, i8* %1, i32 4, i32 4, i1 false)
  call void @_ZSt12__miter_baseIN9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEEEENSt11_Miter_baseIT_E13iterator_typeES8_(%"class.__gnu_cxx::__normal_iterator"* sret %agg.tmp, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %agg.tmp1)
  %2 = bitcast %"class.__gnu_cxx::__normal_iterator"* %agg.tmp3 to i8*
  %3 = bitcast %"class.__gnu_cxx::__normal_iterator"* %__last to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %2, i8* %3, i32 4, i32 4, i1 false)
  call void @_ZSt12__miter_baseIN9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEEEENSt11_Miter_baseIT_E13iterator_typeES8_(%"class.__gnu_cxx::__normal_iterator"* sret %agg.tmp2, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %agg.tmp3)
  %4 = bitcast %"class.__gnu_cxx::__normal_iterator"* %agg.tmp4 to i8*
  %5 = bitcast %"class.__gnu_cxx::__normal_iterator"* %__result to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %4, i8* %5, i32 4, i32 4, i1 false)
  call void @_ZSt23__copy_move_backward_a2ILb0EN9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEEES6_ET1_T0_S8_S7_(%"class.__gnu_cxx::__normal_iterator"* sret %agg.result, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %agg.tmp, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %agg.tmp2, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %agg.tmp4)
  ret void
}

define linkonce_odr void @_ZSt23__copy_move_backward_a2ILb0EN9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEEES6_ET1_T0_S8_S7_(%"class.__gnu_cxx::__normal_iterator"* noalias sret %agg.result, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %__first, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %__last, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %__result) inlinehint {
entry:
  %agg.tmp = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %agg.tmp1 = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %agg.tmp3 = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %ref.tmp = alloca float*, align 4
  %0 = bitcast %"class.__gnu_cxx::__normal_iterator"* %agg.tmp to i8*
  %1 = bitcast %"class.__gnu_cxx::__normal_iterator"* %__first to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %0, i8* %1, i32 4, i32 4, i1 false)
  %call = call float* @_ZSt12__niter_baseIN9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEEEENSt11_Niter_baseIT_E13iterator_typeES8_(%"class.__gnu_cxx::__normal_iterator"* byval align 4 %agg.tmp)
  %2 = bitcast %"class.__gnu_cxx::__normal_iterator"* %agg.tmp1 to i8*
  %3 = bitcast %"class.__gnu_cxx::__normal_iterator"* %__last to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %2, i8* %3, i32 4, i32 4, i1 false)
  %call2 = call float* @_ZSt12__niter_baseIN9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEEEENSt11_Niter_baseIT_E13iterator_typeES8_(%"class.__gnu_cxx::__normal_iterator"* byval align 4 %agg.tmp1)
  %4 = bitcast %"class.__gnu_cxx::__normal_iterator"* %agg.tmp3 to i8*
  %5 = bitcast %"class.__gnu_cxx::__normal_iterator"* %__result to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %4, i8* %5, i32 4, i32 4, i1 false)
  %call4 = call float* @_ZSt12__niter_baseIN9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEEEENSt11_Niter_baseIT_E13iterator_typeES8_(%"class.__gnu_cxx::__normal_iterator"* byval align 4 %agg.tmp3)
  %call5 = call float* @_ZSt22__copy_move_backward_aILb0EPfS0_ET1_T0_S2_S1_(float* %call, float* %call2, float* %call4)
  store float* %call5, float** %ref.tmp, align 4
  call void @_ZN9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEEC1ERKS1_(%"class.__gnu_cxx::__normal_iterator"* %agg.result, float** %ref.tmp)
  ret void
}

define linkonce_odr float* @_ZSt22__copy_move_backward_aILb0EPfS0_ET1_T0_S2_S1_(float* %__first, float* %__last, float* %__result) inlinehint {
entry:
  %__first.addr = alloca float*, align 4
  %__last.addr = alloca float*, align 4
  %__result.addr = alloca float*, align 4
  %__simple = alloca i8, align 1
  store float* %__first, float** %__first.addr, align 4
  store float* %__last, float** %__last.addr, align 4
  store float* %__result, float** %__result.addr, align 4
  store i8 1, i8* %__simple, align 1
  %0 = load float** %__first.addr, align 4
  %1 = load float** %__last.addr, align 4
  %2 = load float** %__result.addr, align 4
  %call = call float* @_ZNSt20__copy_move_backwardILb0ELb1ESt26random_access_iterator_tagE13__copy_move_bIfEEPT_PKS3_S6_S4_(float* %0, float* %1, float* %2)
  ret float* %call
}

define linkonce_odr float* @_ZNSt20__copy_move_backwardILb0ELb1ESt26random_access_iterator_tagE13__copy_move_bIfEEPT_PKS3_S6_S4_(float* %__first, float* %__last, float* %__result) nounwind align 2 {
entry:
  %__first.addr = alloca float*, align 4
  %__last.addr = alloca float*, align 4
  %__result.addr = alloca float*, align 4
  %_Num = alloca i32, align 4
  store float* %__first, float** %__first.addr, align 4
  store float* %__last, float** %__last.addr, align 4
  store float* %__result, float** %__result.addr, align 4
  %0 = load float** %__last.addr, align 4
  %1 = load float** %__first.addr, align 4
  %sub.ptr.lhs.cast = ptrtoint float* %0 to i32
  %sub.ptr.rhs.cast = ptrtoint float* %1 to i32
  %sub.ptr.sub = sub i32 %sub.ptr.lhs.cast, %sub.ptr.rhs.cast
  %sub.ptr.div = sdiv exact i32 %sub.ptr.sub, 4
  store i32 %sub.ptr.div, i32* %_Num, align 4
  %2 = load i32* %_Num, align 4
  %tobool = icmp ne i32 %2, 0
  br i1 %tobool, label %if.then, label %if.end

if.then:                                          ; preds = %entry
  %3 = load float** %__result.addr, align 4
  %4 = load i32* %_Num, align 4
  %idx.neg = sub i32 0, %4
  %add.ptr = getelementptr inbounds float* %3, i32 %idx.neg
  %5 = bitcast float* %add.ptr to i8*
  %6 = load float** %__first.addr, align 4
  %7 = bitcast float* %6 to i8*
  %8 = load i32* %_Num, align 4
  %mul = mul i32 4, %8
  call void @llvm.memmove.p0i8.p0i8.i32(i8* %5, i8* %7, i32 %mul, i32 4, i1 false)
  br label %if.end

if.end:                                           ; preds = %if.then, %entry
  %9 = load float** %__result.addr, align 4
  %10 = load i32* %_Num, align 4
  %idx.neg1 = sub i32 0, %10
  %add.ptr2 = getelementptr inbounds float* %9, i32 %idx.neg1
  ret float* %add.ptr2
}

declare void @llvm.memmove.p0i8.p0i8.i32(i8* nocapture, i8* nocapture, i32, i32, i1) nounwind

declare i32 @llvm.ctlz.i32(i32, i1) nounwind readnone

define linkonce_odr void @_ZSt12partial_sortIN9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEEEEvT_S7_S7_(%"class.__gnu_cxx::__normal_iterator"* byval align 4 %__first, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %__middle, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %__last) {
entry:
  %agg.tmp = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %agg.tmp1 = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %agg.tmp2 = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %agg.tmp3 = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %agg.tmp4 = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %0 = bitcast %"class.__gnu_cxx::__normal_iterator"* %agg.tmp to i8*
  %1 = bitcast %"class.__gnu_cxx::__normal_iterator"* %__first to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %0, i8* %1, i32 4, i32 4, i1 false)
  %2 = bitcast %"class.__gnu_cxx::__normal_iterator"* %agg.tmp1 to i8*
  %3 = bitcast %"class.__gnu_cxx::__normal_iterator"* %__middle to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %2, i8* %3, i32 4, i32 4, i1 false)
  %4 = bitcast %"class.__gnu_cxx::__normal_iterator"* %agg.tmp2 to i8*
  %5 = bitcast %"class.__gnu_cxx::__normal_iterator"* %__last to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %4, i8* %5, i32 4, i32 4, i1 false)
  call void @_ZSt13__heap_selectIN9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEEEEvT_S7_S7_(%"class.__gnu_cxx::__normal_iterator"* byval align 4 %agg.tmp, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %agg.tmp1, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %agg.tmp2)
  %6 = bitcast %"class.__gnu_cxx::__normal_iterator"* %agg.tmp3 to i8*
  %7 = bitcast %"class.__gnu_cxx::__normal_iterator"* %__first to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %6, i8* %7, i32 4, i32 4, i1 false)
  %8 = bitcast %"class.__gnu_cxx::__normal_iterator"* %agg.tmp4 to i8*
  %9 = bitcast %"class.__gnu_cxx::__normal_iterator"* %__middle to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %8, i8* %9, i32 4, i32 4, i1 false)
  call void @_ZSt9sort_heapIN9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEEEEvT_S7_(%"class.__gnu_cxx::__normal_iterator"* byval align 4 %agg.tmp3, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %agg.tmp4)
  ret void
}

define linkonce_odr void @_ZSt27__unguarded_partition_pivotIN9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEEEET_S7_S7_(%"class.__gnu_cxx::__normal_iterator"* noalias sret %agg.result, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %__first, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %__last) inlinehint {
entry:
  %__mid = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %ref.tmp = alloca i32, align 4
  %agg.tmp = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %agg.tmp1 = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %agg.tmp2 = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %ref.tmp3 = alloca i32, align 4
  %agg.tmp4 = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %ref.tmp5 = alloca i32, align 4
  %agg.tmp6 = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %call = call i32 @_ZN9__gnu_cxxmiIPfSt6vectorIfSaIfEEEENS_17__normal_iteratorIT_T0_E15difference_typeERKS8_SB_(%"class.__gnu_cxx::__normal_iterator"* %__last, %"class.__gnu_cxx::__normal_iterator"* %__first)
  %div = sdiv i32 %call, 2
  store i32 %div, i32* %ref.tmp, align 4
  call void @_ZNK9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEEplERKi(%"class.__gnu_cxx::__normal_iterator"* sret %__mid, %"class.__gnu_cxx::__normal_iterator"* %__first, i32* %ref.tmp)
  %0 = bitcast %"class.__gnu_cxx::__normal_iterator"* %agg.tmp to i8*
  %1 = bitcast %"class.__gnu_cxx::__normal_iterator"* %__first to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %0, i8* %1, i32 4, i32 4, i1 false)
  %2 = bitcast %"class.__gnu_cxx::__normal_iterator"* %agg.tmp1 to i8*
  %3 = bitcast %"class.__gnu_cxx::__normal_iterator"* %__mid to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %2, i8* %3, i32 4, i32 4, i1 false)
  store i32 1, i32* %ref.tmp3, align 4
  call void @_ZNK9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEEmiERKi(%"class.__gnu_cxx::__normal_iterator"* sret %agg.tmp2, %"class.__gnu_cxx::__normal_iterator"* %__last, i32* %ref.tmp3)
  call void @_ZSt19__move_median_firstIN9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEEEEvT_S7_S7_(%"class.__gnu_cxx::__normal_iterator"* byval align 4 %agg.tmp, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %agg.tmp1, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %agg.tmp2)
  store i32 1, i32* %ref.tmp5, align 4
  call void @_ZNK9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEEplERKi(%"class.__gnu_cxx::__normal_iterator"* sret %agg.tmp4, %"class.__gnu_cxx::__normal_iterator"* %__first, i32* %ref.tmp5)
  %4 = bitcast %"class.__gnu_cxx::__normal_iterator"* %agg.tmp6 to i8*
  %5 = bitcast %"class.__gnu_cxx::__normal_iterator"* %__last to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %4, i8* %5, i32 4, i32 4, i1 false)
  %call7 = call float* @_ZNK9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEEdeEv(%"class.__gnu_cxx::__normal_iterator"* %__first)
  call void @_ZSt21__unguarded_partitionIN9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEEEfET_S7_S7_RKT0_(%"class.__gnu_cxx::__normal_iterator"* sret %agg.result, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %agg.tmp4, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %agg.tmp6, float* %call7)
  ret void
}

define linkonce_odr void @_ZSt19__move_median_firstIN9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEEEEvT_S7_S7_(%"class.__gnu_cxx::__normal_iterator"* byval align 4 %__a, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %__b, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %__c) {
entry:
  %agg.tmp = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %agg.tmp6 = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %agg.tmp11 = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %agg.tmp12 = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %agg.tmp24 = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %agg.tmp25 = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %agg.tmp27 = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %agg.tmp28 = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %call = call float* @_ZNK9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEEdeEv(%"class.__gnu_cxx::__normal_iterator"* %__a)
  %0 = load float* %call
  %call1 = call float* @_ZNK9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEEdeEv(%"class.__gnu_cxx::__normal_iterator"* %__b)
  %1 = load float* %call1
  %cmp = fcmp olt float %0, %1
  br i1 %cmp, label %if.then, label %if.else14

if.then:                                          ; preds = %entry
  %call2 = call float* @_ZNK9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEEdeEv(%"class.__gnu_cxx::__normal_iterator"* %__b)
  %2 = load float* %call2
  %call3 = call float* @_ZNK9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEEdeEv(%"class.__gnu_cxx::__normal_iterator"* %__c)
  %3 = load float* %call3
  %cmp4 = fcmp olt float %2, %3
  br i1 %cmp4, label %if.then5, label %if.else

if.then5:                                         ; preds = %if.then
  %4 = bitcast %"class.__gnu_cxx::__normal_iterator"* %agg.tmp to i8*
  %5 = bitcast %"class.__gnu_cxx::__normal_iterator"* %__a to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %4, i8* %5, i32 4, i32 4, i1 false)
  %6 = bitcast %"class.__gnu_cxx::__normal_iterator"* %agg.tmp6 to i8*
  %7 = bitcast %"class.__gnu_cxx::__normal_iterator"* %__b to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %6, i8* %7, i32 4, i32 4, i1 false)
  call void @_ZSt9iter_swapIN9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEEES6_EvT_T0_(%"class.__gnu_cxx::__normal_iterator"* byval align 4 %agg.tmp, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %agg.tmp6)
  br label %if.end13

if.else:                                          ; preds = %if.then
  %call7 = call float* @_ZNK9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEEdeEv(%"class.__gnu_cxx::__normal_iterator"* %__a)
  %8 = load float* %call7
  %call8 = call float* @_ZNK9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEEdeEv(%"class.__gnu_cxx::__normal_iterator"* %__c)
  %9 = load float* %call8
  %cmp9 = fcmp olt float %8, %9
  br i1 %cmp9, label %if.then10, label %if.end

if.then10:                                        ; preds = %if.else
  %10 = bitcast %"class.__gnu_cxx::__normal_iterator"* %agg.tmp11 to i8*
  %11 = bitcast %"class.__gnu_cxx::__normal_iterator"* %__a to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %10, i8* %11, i32 4, i32 4, i1 false)
  %12 = bitcast %"class.__gnu_cxx::__normal_iterator"* %agg.tmp12 to i8*
  %13 = bitcast %"class.__gnu_cxx::__normal_iterator"* %__c to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %12, i8* %13, i32 4, i32 4, i1 false)
  call void @_ZSt9iter_swapIN9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEEES6_EvT_T0_(%"class.__gnu_cxx::__normal_iterator"* byval align 4 %agg.tmp11, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %agg.tmp12)
  br label %if.end

if.end:                                           ; preds = %if.then10, %if.else
  br label %if.end13

if.end13:                                         ; preds = %if.end, %if.then5
  br label %if.end31

if.else14:                                        ; preds = %entry
  %call15 = call float* @_ZNK9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEEdeEv(%"class.__gnu_cxx::__normal_iterator"* %__a)
  %14 = load float* %call15
  %call16 = call float* @_ZNK9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEEdeEv(%"class.__gnu_cxx::__normal_iterator"* %__c)
  %15 = load float* %call16
  %cmp17 = fcmp olt float %14, %15
  br i1 %cmp17, label %if.then18, label %if.else19

if.then18:                                        ; preds = %if.else14
  br label %if.end31

if.else19:                                        ; preds = %if.else14
  %call20 = call float* @_ZNK9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEEdeEv(%"class.__gnu_cxx::__normal_iterator"* %__b)
  %16 = load float* %call20
  %call21 = call float* @_ZNK9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEEdeEv(%"class.__gnu_cxx::__normal_iterator"* %__c)
  %17 = load float* %call21
  %cmp22 = fcmp olt float %16, %17
  br i1 %cmp22, label %if.then23, label %if.else26

if.then23:                                        ; preds = %if.else19
  %18 = bitcast %"class.__gnu_cxx::__normal_iterator"* %agg.tmp24 to i8*
  %19 = bitcast %"class.__gnu_cxx::__normal_iterator"* %__a to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %18, i8* %19, i32 4, i32 4, i1 false)
  %20 = bitcast %"class.__gnu_cxx::__normal_iterator"* %agg.tmp25 to i8*
  %21 = bitcast %"class.__gnu_cxx::__normal_iterator"* %__c to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %20, i8* %21, i32 4, i32 4, i1 false)
  call void @_ZSt9iter_swapIN9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEEES6_EvT_T0_(%"class.__gnu_cxx::__normal_iterator"* byval align 4 %agg.tmp24, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %agg.tmp25)
  br label %if.end29

if.else26:                                        ; preds = %if.else19
  %22 = bitcast %"class.__gnu_cxx::__normal_iterator"* %agg.tmp27 to i8*
  %23 = bitcast %"class.__gnu_cxx::__normal_iterator"* %__a to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %22, i8* %23, i32 4, i32 4, i1 false)
  %24 = bitcast %"class.__gnu_cxx::__normal_iterator"* %agg.tmp28 to i8*
  %25 = bitcast %"class.__gnu_cxx::__normal_iterator"* %__b to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %24, i8* %25, i32 4, i32 4, i1 false)
  call void @_ZSt9iter_swapIN9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEEES6_EvT_T0_(%"class.__gnu_cxx::__normal_iterator"* byval align 4 %agg.tmp27, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %agg.tmp28)
  br label %if.end29

if.end29:                                         ; preds = %if.else26, %if.then23
  br label %if.end30

if.end30:                                         ; preds = %if.end29
  br label %if.end31

if.end31:                                         ; preds = %if.then18, %if.end30, %if.end13
  ret void
}

define linkonce_odr void @_ZNK9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEEmiERKi(%"class.__gnu_cxx::__normal_iterator"* noalias sret %agg.result, %"class.__gnu_cxx::__normal_iterator"* %this, i32* %__n) align 2 {
entry:
  %this.addr = alloca %"class.__gnu_cxx::__normal_iterator"*, align 4
  %__n.addr = alloca i32*, align 4
  %ref.tmp = alloca float*, align 4
  store %"class.__gnu_cxx::__normal_iterator"* %this, %"class.__gnu_cxx::__normal_iterator"** %this.addr, align 4
  store i32* %__n, i32** %__n.addr, align 4
  %this1 = load %"class.__gnu_cxx::__normal_iterator"** %this.addr
  %_M_current = getelementptr inbounds %"class.__gnu_cxx::__normal_iterator"* %this1, i32 0, i32 0
  %0 = load float** %_M_current, align 4
  %1 = load i32** %__n.addr, align 4
  %2 = load i32* %1, align 4
  %idx.neg = sub i32 0, %2
  %add.ptr = getelementptr inbounds float* %0, i32 %idx.neg
  store float* %add.ptr, float** %ref.tmp, align 4
  call void @_ZN9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEEC1ERKS1_(%"class.__gnu_cxx::__normal_iterator"* %agg.result, float** %ref.tmp)
  ret void
}

define linkonce_odr void @_ZSt21__unguarded_partitionIN9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEEEfET_S7_S7_RKT0_(%"class.__gnu_cxx::__normal_iterator"* noalias sret %agg.result, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %__first, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %__last, float* %__pivot) {
entry:
  %__pivot.addr = alloca float*, align 4
  %agg.tmp = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %agg.tmp12 = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  store float* %__pivot, float** %__pivot.addr, align 4
  br label %while.body

while.body:                                       ; preds = %entry, %if.end
  br label %while.cond1

while.cond1:                                      ; preds = %while.body2, %while.body
  %call = call float* @_ZNK9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEEdeEv(%"class.__gnu_cxx::__normal_iterator"* %__first)
  %0 = load float* %call
  %1 = load float** %__pivot.addr, align 4
  %2 = load float* %1, align 4
  %cmp = fcmp olt float %0, %2
  br i1 %cmp, label %while.body2, label %while.end

while.body2:                                      ; preds = %while.cond1
  %call3 = call %"class.__gnu_cxx::__normal_iterator"* @_ZN9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEEppEv(%"class.__gnu_cxx::__normal_iterator"* %__first)
  br label %while.cond1

while.end:                                        ; preds = %while.cond1
  %call4 = call %"class.__gnu_cxx::__normal_iterator"* @_ZN9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEEmmEv(%"class.__gnu_cxx::__normal_iterator"* %__last)
  br label %while.cond5

while.cond5:                                      ; preds = %while.body8, %while.end
  %3 = load float** %__pivot.addr, align 4
  %4 = load float* %3, align 4
  %call6 = call float* @_ZNK9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEEdeEv(%"class.__gnu_cxx::__normal_iterator"* %__last)
  %5 = load float* %call6
  %cmp7 = fcmp olt float %4, %5
  br i1 %cmp7, label %while.body8, label %while.end10

while.body8:                                      ; preds = %while.cond5
  %call9 = call %"class.__gnu_cxx::__normal_iterator"* @_ZN9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEEmmEv(%"class.__gnu_cxx::__normal_iterator"* %__last)
  br label %while.cond5

while.end10:                                      ; preds = %while.cond5
  %call11 = call zeroext i1 @_ZN9__gnu_cxxltIPfSt6vectorIfSaIfEEEEbRKNS_17__normal_iteratorIT_T0_EESA_(%"class.__gnu_cxx::__normal_iterator"* %__first, %"class.__gnu_cxx::__normal_iterator"* %__last)
  br i1 %call11, label %if.end, label %if.then

if.then:                                          ; preds = %while.end10
  %6 = bitcast %"class.__gnu_cxx::__normal_iterator"* %agg.result to i8*
  %7 = bitcast %"class.__gnu_cxx::__normal_iterator"* %__first to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %6, i8* %7, i32 4, i32 4, i1 false)
  ret void

if.end:                                           ; preds = %while.end10
  %8 = bitcast %"class.__gnu_cxx::__normal_iterator"* %agg.tmp to i8*
  %9 = bitcast %"class.__gnu_cxx::__normal_iterator"* %__first to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %8, i8* %9, i32 4, i32 4, i1 false)
  %10 = bitcast %"class.__gnu_cxx::__normal_iterator"* %agg.tmp12 to i8*
  %11 = bitcast %"class.__gnu_cxx::__normal_iterator"* %__last to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %10, i8* %11, i32 4, i32 4, i1 false)
  call void @_ZSt9iter_swapIN9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEEES6_EvT_T0_(%"class.__gnu_cxx::__normal_iterator"* byval align 4 %agg.tmp, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %agg.tmp12)
  %call13 = call %"class.__gnu_cxx::__normal_iterator"* @_ZN9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEEppEv(%"class.__gnu_cxx::__normal_iterator"* %__first)
  br label %while.body
}

define linkonce_odr zeroext i1 @_ZN9__gnu_cxxltIPfSt6vectorIfSaIfEEEEbRKNS_17__normal_iteratorIT_T0_EESA_(%"class.__gnu_cxx::__normal_iterator"* %__lhs, %"class.__gnu_cxx::__normal_iterator"* %__rhs) nounwind inlinehint {
entry:
  %__lhs.addr = alloca %"class.__gnu_cxx::__normal_iterator"*, align 4
  %__rhs.addr = alloca %"class.__gnu_cxx::__normal_iterator"*, align 4
  store %"class.__gnu_cxx::__normal_iterator"* %__lhs, %"class.__gnu_cxx::__normal_iterator"** %__lhs.addr, align 4
  store %"class.__gnu_cxx::__normal_iterator"* %__rhs, %"class.__gnu_cxx::__normal_iterator"** %__rhs.addr, align 4
  %0 = load %"class.__gnu_cxx::__normal_iterator"** %__lhs.addr, align 4
  %call = call float** @_ZNK9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEE4baseEv(%"class.__gnu_cxx::__normal_iterator"* %0)
  %1 = load float** %call
  %2 = load %"class.__gnu_cxx::__normal_iterator"** %__rhs.addr, align 4
  %call1 = call float** @_ZNK9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEE4baseEv(%"class.__gnu_cxx::__normal_iterator"* %2)
  %3 = load float** %call1
  %cmp = icmp ult float* %1, %3
  ret i1 %cmp
}

define linkonce_odr void @_ZSt9iter_swapIN9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEEES6_EvT_T0_(%"class.__gnu_cxx::__normal_iterator"* byval align 4 %__a, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %__b) {
entry:
  %agg.tmp = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %agg.tmp1 = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %0 = bitcast %"class.__gnu_cxx::__normal_iterator"* %agg.tmp to i8*
  %1 = bitcast %"class.__gnu_cxx::__normal_iterator"* %__a to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %0, i8* %1, i32 4, i32 4, i1 false)
  %2 = bitcast %"class.__gnu_cxx::__normal_iterator"* %agg.tmp1 to i8*
  %3 = bitcast %"class.__gnu_cxx::__normal_iterator"* %__b to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %2, i8* %3, i32 4, i32 4, i1 false)
  call void @_ZNSt11__iter_swapILb1EE9iter_swapIN9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEEES8_EEvT_T0_(%"class.__gnu_cxx::__normal_iterator"* byval align 4 %agg.tmp, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %agg.tmp1)
  ret void
}

define linkonce_odr void @_ZNSt11__iter_swapILb1EE9iter_swapIN9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEEES8_EEvT_T0_(%"class.__gnu_cxx::__normal_iterator"* byval align 4 %__a, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %__b) align 2 {
entry:
  %call = call float* @_ZNK9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEEdeEv(%"class.__gnu_cxx::__normal_iterator"* %__a)
  %call1 = call float* @_ZNK9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEEdeEv(%"class.__gnu_cxx::__normal_iterator"* %__b)
  call void @_ZSt4swapIfEvRT_S1_(float* %call, float* %call1)
  ret void
}

define linkonce_odr void @_ZSt4swapIfEvRT_S1_(float* %__a, float* %__b) nounwind inlinehint {
entry:
  %__a.addr = alloca float*, align 4
  %__b.addr = alloca float*, align 4
  %__tmp = alloca float, align 4
  store float* %__a, float** %__a.addr, align 4
  store float* %__b, float** %__b.addr, align 4
  %0 = load float** %__a.addr, align 4
  %1 = load float* %0, align 4
  store float %1, float* %__tmp, align 4
  %2 = load float** %__b.addr, align 4
  %3 = load float* %2, align 4
  %4 = load float** %__a.addr, align 4
  store float %3, float* %4, align 4
  %5 = load float* %__tmp, align 4
  %6 = load float** %__b.addr, align 4
  store float %5, float* %6, align 4
  ret void
}

define linkonce_odr void @_ZSt13__heap_selectIN9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEEEEvT_S7_S7_(%"class.__gnu_cxx::__normal_iterator"* byval align 4 %__first, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %__middle, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %__last) {
entry:
  %agg.tmp = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %agg.tmp1 = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %__i = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %agg.tmp4 = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %agg.tmp5 = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %agg.tmp6 = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %0 = bitcast %"class.__gnu_cxx::__normal_iterator"* %agg.tmp to i8*
  %1 = bitcast %"class.__gnu_cxx::__normal_iterator"* %__first to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %0, i8* %1, i32 4, i32 4, i1 false)
  %2 = bitcast %"class.__gnu_cxx::__normal_iterator"* %agg.tmp1 to i8*
  %3 = bitcast %"class.__gnu_cxx::__normal_iterator"* %__middle to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %2, i8* %3, i32 4, i32 4, i1 false)
  call void @_ZSt9make_heapIN9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEEEEvT_S7_(%"class.__gnu_cxx::__normal_iterator"* byval align 4 %agg.tmp, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %agg.tmp1)
  %4 = bitcast %"class.__gnu_cxx::__normal_iterator"* %__i to i8*
  %5 = bitcast %"class.__gnu_cxx::__normal_iterator"* %__middle to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %4, i8* %5, i32 4, i32 4, i1 false)
  br label %for.cond

for.cond:                                         ; preds = %for.inc, %entry
  %call = call zeroext i1 @_ZN9__gnu_cxxltIPfSt6vectorIfSaIfEEEEbRKNS_17__normal_iteratorIT_T0_EESA_(%"class.__gnu_cxx::__normal_iterator"* %__i, %"class.__gnu_cxx::__normal_iterator"* %__last)
  br i1 %call, label %for.body, label %for.end

for.body:                                         ; preds = %for.cond
  %call2 = call float* @_ZNK9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEEdeEv(%"class.__gnu_cxx::__normal_iterator"* %__i)
  %6 = load float* %call2
  %call3 = call float* @_ZNK9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEEdeEv(%"class.__gnu_cxx::__normal_iterator"* %__first)
  %7 = load float* %call3
  %cmp = fcmp olt float %6, %7
  br i1 %cmp, label %if.then, label %if.end

if.then:                                          ; preds = %for.body
  %8 = bitcast %"class.__gnu_cxx::__normal_iterator"* %agg.tmp4 to i8*
  %9 = bitcast %"class.__gnu_cxx::__normal_iterator"* %__first to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %8, i8* %9, i32 4, i32 4, i1 false)
  %10 = bitcast %"class.__gnu_cxx::__normal_iterator"* %agg.tmp5 to i8*
  %11 = bitcast %"class.__gnu_cxx::__normal_iterator"* %__middle to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %10, i8* %11, i32 4, i32 4, i1 false)
  %12 = bitcast %"class.__gnu_cxx::__normal_iterator"* %agg.tmp6 to i8*
  %13 = bitcast %"class.__gnu_cxx::__normal_iterator"* %__i to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %12, i8* %13, i32 4, i32 4, i1 false)
  call void @_ZSt10__pop_heapIN9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEEEEvT_S7_S7_(%"class.__gnu_cxx::__normal_iterator"* byval align 4 %agg.tmp4, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %agg.tmp5, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %agg.tmp6)
  br label %if.end

if.end:                                           ; preds = %if.then, %for.body
  br label %for.inc

for.inc:                                          ; preds = %if.end
  %call7 = call %"class.__gnu_cxx::__normal_iterator"* @_ZN9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEEppEv(%"class.__gnu_cxx::__normal_iterator"* %__i)
  br label %for.cond

for.end:                                          ; preds = %for.cond
  ret void
}

define linkonce_odr void @_ZSt9sort_heapIN9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEEEEvT_S7_(%"class.__gnu_cxx::__normal_iterator"* byval align 4 %__first, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %__last) {
entry:
  %agg.tmp = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %agg.tmp2 = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %agg.tmp3 = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  br label %while.cond

while.cond:                                       ; preds = %while.body, %entry
  %call = call i32 @_ZN9__gnu_cxxmiIPfSt6vectorIfSaIfEEEENS_17__normal_iteratorIT_T0_E15difference_typeERKS8_SB_(%"class.__gnu_cxx::__normal_iterator"* %__last, %"class.__gnu_cxx::__normal_iterator"* %__first)
  %cmp = icmp sgt i32 %call, 1
  br i1 %cmp, label %while.body, label %while.end

while.body:                                       ; preds = %while.cond
  %call1 = call %"class.__gnu_cxx::__normal_iterator"* @_ZN9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEEmmEv(%"class.__gnu_cxx::__normal_iterator"* %__last)
  %0 = bitcast %"class.__gnu_cxx::__normal_iterator"* %agg.tmp to i8*
  %1 = bitcast %"class.__gnu_cxx::__normal_iterator"* %__first to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %0, i8* %1, i32 4, i32 4, i1 false)
  %2 = bitcast %"class.__gnu_cxx::__normal_iterator"* %agg.tmp2 to i8*
  %3 = bitcast %"class.__gnu_cxx::__normal_iterator"* %__last to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %2, i8* %3, i32 4, i32 4, i1 false)
  %4 = bitcast %"class.__gnu_cxx::__normal_iterator"* %agg.tmp3 to i8*
  %5 = bitcast %"class.__gnu_cxx::__normal_iterator"* %__last to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %4, i8* %5, i32 4, i32 4, i1 false)
  call void @_ZSt10__pop_heapIN9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEEEEvT_S7_S7_(%"class.__gnu_cxx::__normal_iterator"* byval align 4 %agg.tmp, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %agg.tmp2, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %agg.tmp3)
  br label %while.cond

while.end:                                        ; preds = %while.cond
  ret void
}

define linkonce_odr void @_ZSt10__pop_heapIN9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEEEEvT_S7_S7_(%"class.__gnu_cxx::__normal_iterator"* byval align 4 %__first, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %__last, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %__result) inlinehint {
entry:
  %__value = alloca float, align 4
  %agg.tmp = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %call = call float* @_ZNK9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEEdeEv(%"class.__gnu_cxx::__normal_iterator"* %__result)
  %0 = load float* %call
  store float %0, float* %__value, align 4
  %call1 = call float* @_ZNK9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEEdeEv(%"class.__gnu_cxx::__normal_iterator"* %__first)
  %1 = load float* %call1
  %call2 = call float* @_ZNK9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEEdeEv(%"class.__gnu_cxx::__normal_iterator"* %__result)
  store float %1, float* %call2
  %2 = bitcast %"class.__gnu_cxx::__normal_iterator"* %agg.tmp to i8*
  %3 = bitcast %"class.__gnu_cxx::__normal_iterator"* %__first to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %2, i8* %3, i32 4, i32 4, i1 false)
  %call3 = call i32 @_ZN9__gnu_cxxmiIPfSt6vectorIfSaIfEEEENS_17__normal_iteratorIT_T0_E15difference_typeERKS8_SB_(%"class.__gnu_cxx::__normal_iterator"* %__last, %"class.__gnu_cxx::__normal_iterator"* %__first)
  %4 = load float* %__value, align 4
  call void @_ZSt13__adjust_heapIN9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEEEifEvT_T0_S8_T1_(%"class.__gnu_cxx::__normal_iterator"* byval align 4 %agg.tmp, i32 0, i32 %call3, float %4)
  ret void
}

define linkonce_odr void @_ZSt13__adjust_heapIN9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEEEifEvT_T0_S8_T1_(%"class.__gnu_cxx::__normal_iterator"* byval align 4 %__first, i32 %__holeIndex, i32 %__len, float %__value) {
entry:
  %__holeIndex.addr = alloca i32, align 4
  %__len.addr = alloca i32, align 4
  %__value.addr = alloca float, align 4
  %__topIndex = alloca i32, align 4
  %__secondChild = alloca i32, align 4
  %tmp = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %ref.tmp = alloca i32, align 4
  %tmp2 = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %tmp5 = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %tmp7 = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %ref.tmp17 = alloca i32, align 4
  %tmp18 = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %tmp20 = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %agg.tmp = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  store i32 %__holeIndex, i32* %__holeIndex.addr, align 4
  store i32 %__len, i32* %__len.addr, align 4
  store float %__value, float* %__value.addr, align 4
  %0 = load i32* %__holeIndex.addr, align 4
  store i32 %0, i32* %__topIndex, align 4
  %1 = load i32* %__holeIndex.addr, align 4
  store i32 %1, i32* %__secondChild, align 4
  br label %while.cond

while.cond:                                       ; preds = %if.end, %entry
  %2 = load i32* %__secondChild, align 4
  %3 = load i32* %__len.addr, align 4
  %sub = sub nsw i32 %3, 1
  %div = sdiv i32 %sub, 2
  %cmp = icmp slt i32 %2, %div
  br i1 %cmp, label %while.body, label %while.end

while.body:                                       ; preds = %while.cond
  %4 = load i32* %__secondChild, align 4
  %add = add nsw i32 %4, 1
  %mul = mul nsw i32 2, %add
  store i32 %mul, i32* %__secondChild, align 4
  call void @_ZNK9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEEplERKi(%"class.__gnu_cxx::__normal_iterator"* sret %tmp, %"class.__gnu_cxx::__normal_iterator"* %__first, i32* %__secondChild)
  %call = call float* @_ZNK9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEEdeEv(%"class.__gnu_cxx::__normal_iterator"* %tmp)
  %5 = load float* %call
  %6 = load i32* %__secondChild, align 4
  %sub1 = sub nsw i32 %6, 1
  store i32 %sub1, i32* %ref.tmp, align 4
  call void @_ZNK9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEEplERKi(%"class.__gnu_cxx::__normal_iterator"* sret %tmp2, %"class.__gnu_cxx::__normal_iterator"* %__first, i32* %ref.tmp)
  %call3 = call float* @_ZNK9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEEdeEv(%"class.__gnu_cxx::__normal_iterator"* %tmp2)
  %7 = load float* %call3
  %cmp4 = fcmp olt float %5, %7
  br i1 %cmp4, label %if.then, label %if.end

if.then:                                          ; preds = %while.body
  %8 = load i32* %__secondChild, align 4
  %dec = add nsw i32 %8, -1
  store i32 %dec, i32* %__secondChild, align 4
  br label %if.end

if.end:                                           ; preds = %if.then, %while.body
  call void @_ZNK9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEEplERKi(%"class.__gnu_cxx::__normal_iterator"* sret %tmp5, %"class.__gnu_cxx::__normal_iterator"* %__first, i32* %__secondChild)
  %call6 = call float* @_ZNK9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEEdeEv(%"class.__gnu_cxx::__normal_iterator"* %tmp5)
  %9 = load float* %call6
  call void @_ZNK9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEEplERKi(%"class.__gnu_cxx::__normal_iterator"* sret %tmp7, %"class.__gnu_cxx::__normal_iterator"* %__first, i32* %__holeIndex.addr)
  %call8 = call float* @_ZNK9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEEdeEv(%"class.__gnu_cxx::__normal_iterator"* %tmp7)
  store float %9, float* %call8
  %10 = load i32* %__secondChild, align 4
  store i32 %10, i32* %__holeIndex.addr, align 4
  br label %while.cond

while.end:                                        ; preds = %while.cond
  %11 = load i32* %__len.addr, align 4
  %and = and i32 %11, 1
  %cmp9 = icmp eq i32 %and, 0
  br i1 %cmp9, label %land.lhs.true, label %if.end23

land.lhs.true:                                    ; preds = %while.end
  %12 = load i32* %__secondChild, align 4
  %13 = load i32* %__len.addr, align 4
  %sub10 = sub nsw i32 %13, 2
  %div11 = sdiv i32 %sub10, 2
  %cmp12 = icmp eq i32 %12, %div11
  br i1 %cmp12, label %if.then13, label %if.end23

if.then13:                                        ; preds = %land.lhs.true
  %14 = load i32* %__secondChild, align 4
  %add14 = add nsw i32 %14, 1
  %mul15 = mul nsw i32 2, %add14
  store i32 %mul15, i32* %__secondChild, align 4
  %15 = load i32* %__secondChild, align 4
  %sub16 = sub nsw i32 %15, 1
  store i32 %sub16, i32* %ref.tmp17, align 4
  call void @_ZNK9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEEplERKi(%"class.__gnu_cxx::__normal_iterator"* sret %tmp18, %"class.__gnu_cxx::__normal_iterator"* %__first, i32* %ref.tmp17)
  %call19 = call float* @_ZNK9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEEdeEv(%"class.__gnu_cxx::__normal_iterator"* %tmp18)
  %16 = load float* %call19
  call void @_ZNK9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEEplERKi(%"class.__gnu_cxx::__normal_iterator"* sret %tmp20, %"class.__gnu_cxx::__normal_iterator"* %__first, i32* %__holeIndex.addr)
  %call21 = call float* @_ZNK9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEEdeEv(%"class.__gnu_cxx::__normal_iterator"* %tmp20)
  store float %16, float* %call21
  %17 = load i32* %__secondChild, align 4
  %sub22 = sub nsw i32 %17, 1
  store i32 %sub22, i32* %__holeIndex.addr, align 4
  br label %if.end23

if.end23:                                         ; preds = %if.then13, %land.lhs.true, %while.end
  %18 = bitcast %"class.__gnu_cxx::__normal_iterator"* %agg.tmp to i8*
  %19 = bitcast %"class.__gnu_cxx::__normal_iterator"* %__first to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %18, i8* %19, i32 4, i32 4, i1 false)
  %20 = load i32* %__holeIndex.addr, align 4
  %21 = load i32* %__topIndex, align 4
  %22 = load float* %__value.addr, align 4
  call void @_ZSt11__push_heapIN9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEEEifEvT_T0_S8_T1_(%"class.__gnu_cxx::__normal_iterator"* byval align 4 %agg.tmp, i32 %20, i32 %21, float %22)
  ret void
}

define linkonce_odr void @_ZSt11__push_heapIN9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEEEifEvT_T0_S8_T1_(%"class.__gnu_cxx::__normal_iterator"* byval align 4 %__first, i32 %__holeIndex, i32 %__topIndex, float %__value) {
entry:
  %__holeIndex.addr = alloca i32, align 4
  %__topIndex.addr = alloca i32, align 4
  %__value.addr = alloca float, align 4
  %__parent = alloca i32, align 4
  %tmp = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %tmp2 = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %tmp4 = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %tmp8 = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  store i32 %__holeIndex, i32* %__holeIndex.addr, align 4
  store i32 %__topIndex, i32* %__topIndex.addr, align 4
  store float %__value, float* %__value.addr, align 4
  %0 = load i32* %__holeIndex.addr, align 4
  %sub = sub nsw i32 %0, 1
  %div = sdiv i32 %sub, 2
  store i32 %div, i32* %__parent, align 4
  br label %while.cond

while.cond:                                       ; preds = %while.body, %entry
  %1 = load i32* %__holeIndex.addr, align 4
  %2 = load i32* %__topIndex.addr, align 4
  %cmp = icmp sgt i32 %1, %2
  br i1 %cmp, label %land.rhs, label %land.end

land.rhs:                                         ; preds = %while.cond
  call void @_ZNK9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEEplERKi(%"class.__gnu_cxx::__normal_iterator"* sret %tmp, %"class.__gnu_cxx::__normal_iterator"* %__first, i32* %__parent)
  %call = call float* @_ZNK9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEEdeEv(%"class.__gnu_cxx::__normal_iterator"* %tmp)
  %3 = load float* %call
  %4 = load float* %__value.addr, align 4
  %cmp1 = fcmp olt float %3, %4
  br label %land.end

land.end:                                         ; preds = %land.rhs, %while.cond
  %5 = phi i1 [ false, %while.cond ], [ %cmp1, %land.rhs ]
  br i1 %5, label %while.body, label %while.end

while.body:                                       ; preds = %land.end
  call void @_ZNK9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEEplERKi(%"class.__gnu_cxx::__normal_iterator"* sret %tmp2, %"class.__gnu_cxx::__normal_iterator"* %__first, i32* %__parent)
  %call3 = call float* @_ZNK9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEEdeEv(%"class.__gnu_cxx::__normal_iterator"* %tmp2)
  %6 = load float* %call3
  call void @_ZNK9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEEplERKi(%"class.__gnu_cxx::__normal_iterator"* sret %tmp4, %"class.__gnu_cxx::__normal_iterator"* %__first, i32* %__holeIndex.addr)
  %call5 = call float* @_ZNK9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEEdeEv(%"class.__gnu_cxx::__normal_iterator"* %tmp4)
  store float %6, float* %call5
  %7 = load i32* %__parent, align 4
  store i32 %7, i32* %__holeIndex.addr, align 4
  %8 = load i32* %__holeIndex.addr, align 4
  %sub6 = sub nsw i32 %8, 1
  %div7 = sdiv i32 %sub6, 2
  store i32 %div7, i32* %__parent, align 4
  br label %while.cond

while.end:                                        ; preds = %land.end
  %9 = load float* %__value.addr, align 4
  call void @_ZNK9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEEplERKi(%"class.__gnu_cxx::__normal_iterator"* sret %tmp8, %"class.__gnu_cxx::__normal_iterator"* %__first, i32* %__holeIndex.addr)
  %call9 = call float* @_ZNK9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEEdeEv(%"class.__gnu_cxx::__normal_iterator"* %tmp8)
  store float %9, float* %call9
  ret void
}

define linkonce_odr void @_ZSt9make_heapIN9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEEEEvT_S7_(%"class.__gnu_cxx::__normal_iterator"* byval align 4 %__first, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %__last) {
entry:
  %__len = alloca i32, align 4
  %__parent = alloca i32, align 4
  %__value = alloca float, align 4
  %tmp = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %agg.tmp = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %call = call i32 @_ZN9__gnu_cxxmiIPfSt6vectorIfSaIfEEEENS_17__normal_iteratorIT_T0_E15difference_typeERKS8_SB_(%"class.__gnu_cxx::__normal_iterator"* %__last, %"class.__gnu_cxx::__normal_iterator"* %__first)
  %cmp = icmp slt i32 %call, 2
  br i1 %cmp, label %if.then, label %if.end

if.then:                                          ; preds = %entry
  br label %return

if.end:                                           ; preds = %entry
  %call1 = call i32 @_ZN9__gnu_cxxmiIPfSt6vectorIfSaIfEEEENS_17__normal_iteratorIT_T0_E15difference_typeERKS8_SB_(%"class.__gnu_cxx::__normal_iterator"* %__last, %"class.__gnu_cxx::__normal_iterator"* %__first)
  store i32 %call1, i32* %__len, align 4
  %0 = load i32* %__len, align 4
  %sub = sub nsw i32 %0, 2
  %div = sdiv i32 %sub, 2
  store i32 %div, i32* %__parent, align 4
  br label %while.body

while.body:                                       ; preds = %if.end, %if.end5
  call void @_ZNK9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEEplERKi(%"class.__gnu_cxx::__normal_iterator"* sret %tmp, %"class.__gnu_cxx::__normal_iterator"* %__first, i32* %__parent)
  %call2 = call float* @_ZNK9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEEdeEv(%"class.__gnu_cxx::__normal_iterator"* %tmp)
  %1 = load float* %call2
  store float %1, float* %__value, align 4
  %2 = bitcast %"class.__gnu_cxx::__normal_iterator"* %agg.tmp to i8*
  %3 = bitcast %"class.__gnu_cxx::__normal_iterator"* %__first to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %2, i8* %3, i32 4, i32 4, i1 false)
  %4 = load i32* %__parent, align 4
  %5 = load i32* %__len, align 4
  %6 = load float* %__value, align 4
  call void @_ZSt13__adjust_heapIN9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEEEifEvT_T0_S8_T1_(%"class.__gnu_cxx::__normal_iterator"* byval align 4 %agg.tmp, i32 %4, i32 %5, float %6)
  %7 = load i32* %__parent, align 4
  %cmp3 = icmp eq i32 %7, 0
  br i1 %cmp3, label %if.then4, label %if.end5

if.then4:                                         ; preds = %while.body
  br label %return

if.end5:                                          ; preds = %while.body
  %8 = load i32* %__parent, align 4
  %dec = add nsw i32 %8, -1
  store i32 %dec, i32* %__parent, align 4
  br label %while.body

return:                                           ; preds = %if.then4, %if.then
  ret void
}

define linkonce_odr i32 @_ZNK5boost14fibonacci_heapIiNS_12indirect_cmpIPfSt4lessIfEEENS_27typed_identity_property_mapIjEEE3nilEv(%"class.boost::fibonacci_heap"* %this) align 2 {
entry:
  %this.addr = alloca %"class.boost::fibonacci_heap"*, align 4
  store %"class.boost::fibonacci_heap"* %this, %"class.boost::fibonacci_heap"** %this.addr, align 4
  %this1 = load %"class.boost::fibonacci_heap"** %this.addr
  %_left = getelementptr inbounds %"class.boost::fibonacci_heap"* %this1, i32 0, i32 1
  %call = call i32 @_ZNKSt6vectorIjSaIjEE4sizeEv(%"class.std::vector.5"* %_left)
  ret i32 %call
}

define linkonce_odr i32* @_ZNSt6vectorIjSaIjEEixEj(%"class.std::vector.5"* %this, i32 %__n) nounwind align 2 {
entry:
  %this.addr = alloca %"class.std::vector.5"*, align 4
  %__n.addr = alloca i32, align 4
  store %"class.std::vector.5"* %this, %"class.std::vector.5"** %this.addr, align 4
  store i32 %__n, i32* %__n.addr, align 4
  %this1 = load %"class.std::vector.5"** %this.addr
  %0 = bitcast %"class.std::vector.5"* %this1 to %"struct.std::_Vector_base.6"*
  %_M_impl = getelementptr inbounds %"struct.std::_Vector_base.6"* %0, i32 0, i32 0
  %_M_start = getelementptr inbounds %"struct.std::_Vector_base<unsigned int, std::allocator<unsigned int> >::_Vector_impl"* %_M_impl, i32 0, i32 0
  %1 = load i32** %_M_start, align 4
  %2 = load i32* %__n.addr, align 4
  %add.ptr = getelementptr inbounds i32* %1, i32 %2
  ret i32* %add.ptr
}

define linkonce_odr void @_ZN5boost14fibonacci_heapIiNS_12indirect_cmpIPfSt4lessIfEEENS_27typed_identity_property_mapIjEEE21add_tree_to_new_rootsEjN9__gnu_cxx17__normal_iteratorIPjSt6vectorIjSaIjEEEERi(%"class.boost::fibonacci_heap"* %this, i32 %v, %"class.__gnu_cxx::__normal_iterator.15"* byval align 4 %new_roots, i32* %h) inlinehint align 2 {
entry:
  %this.addr = alloca %"class.boost::fibonacci_heap"*, align 4
  %v.addr = alloca i32, align 4
  %h.addr = alloca i32*, align 4
  %r = alloca i32, align 4
  %u = alloca i32, align 4
  %tmp = alloca %"struct.std::_Bit_reference", align 4
  %tmp28 = alloca %"struct.std::_Bit_reference", align 4
  store %"class.boost::fibonacci_heap"* %this, %"class.boost::fibonacci_heap"** %this.addr, align 4
  store i32 %v, i32* %v.addr, align 4
  store i32* %h, i32** %h.addr, align 4
  %this1 = load %"class.boost::fibonacci_heap"** %this.addr
  %_degree = getelementptr inbounds %"class.boost::fibonacci_heap"* %this1, i32 0, i32 5
  %0 = load i32* %v.addr, align 4
  %call = call i32* @_ZNSt6vectorIjSaIjEEixEj(%"class.std::vector.5"* %_degree, i32 %0)
  %1 = load i32* %call
  store i32 %1, i32* %r, align 4
  br label %while.body

while.body:                                       ; preds = %entry, %if.end23
  %2 = load i32** %h.addr, align 4
  %3 = load i32* %2, align 4
  %4 = load i32* %r, align 4
  %cmp = icmp slt i32 %3, %4
  br i1 %cmp, label %if.then, label %if.end

if.then:                                          ; preds = %while.body
  br label %do.body

do.body:                                          ; preds = %do.cond, %if.then
  %5 = load i32** %h.addr, align 4
  %6 = load i32* %5, align 4
  %inc = add nsw i32 %6, 1
  store i32 %inc, i32* %5, align 4
  %7 = load i32** %h.addr, align 4
  %8 = load i32* %7, align 4
  %9 = load i32* %r, align 4
  %cmp2 = icmp eq i32 %8, %9
  br i1 %cmp2, label %cond.true, label %cond.false

cond.true:                                        ; preds = %do.body
  %10 = load i32* %v.addr, align 4
  br label %cond.end

cond.false:                                       ; preds = %do.body
  %call3 = call i32 @_ZNK5boost14fibonacci_heapIiNS_12indirect_cmpIPfSt4lessIfEEENS_27typed_identity_property_mapIjEEE3nilEv(%"class.boost::fibonacci_heap"* %this1)
  br label %cond.end

cond.end:                                         ; preds = %cond.false, %cond.true
  %cond = phi i32 [ %10, %cond.true ], [ %call3, %cond.false ]
  %11 = load i32** %h.addr, align 4
  %call4 = call i32* @_ZNK9__gnu_cxx17__normal_iteratorIPjSt6vectorIjSaIjEEEixERKi(%"class.__gnu_cxx::__normal_iterator.15"* %new_roots, i32* %11)
  store i32 %cond, i32* %call4
  br label %do.cond

do.cond:                                          ; preds = %cond.end
  %12 = load i32** %h.addr, align 4
  %13 = load i32* %12, align 4
  %14 = load i32* %r, align 4
  %cmp5 = icmp slt i32 %13, %14
  br i1 %cmp5, label %do.body, label %do.end

do.end:                                           ; preds = %do.cond
  br label %while.end

if.end:                                           ; preds = %while.body
  %call6 = call i32* @_ZNK9__gnu_cxx17__normal_iteratorIPjSt6vectorIjSaIjEEEixERKi(%"class.__gnu_cxx::__normal_iterator.15"* %new_roots, i32* %r)
  %15 = load i32* %call6
  %call7 = call i32 @_ZNK5boost14fibonacci_heapIiNS_12indirect_cmpIPfSt4lessIfEEENS_27typed_identity_property_mapIjEEE3nilEv(%"class.boost::fibonacci_heap"* %this1)
  %cmp8 = icmp eq i32 %15, %call7
  br i1 %cmp8, label %if.then9, label %if.end11

if.then9:                                         ; preds = %if.end
  %16 = load i32* %v.addr, align 4
  %call10 = call i32* @_ZNK9__gnu_cxx17__normal_iteratorIPjSt6vectorIjSaIjEEEixERKi(%"class.__gnu_cxx::__normal_iterator.15"* %new_roots, i32* %r)
  store i32 %16, i32* %call10
  br label %while.end

if.end11:                                         ; preds = %if.end
  %call12 = call i32* @_ZNK9__gnu_cxx17__normal_iteratorIPjSt6vectorIjSaIjEEEixERKi(%"class.__gnu_cxx::__normal_iterator.15"* %new_roots, i32* %r)
  %17 = load i32* %call12
  store i32 %17, i32* %u, align 4
  %call13 = call i32 @_ZNK5boost14fibonacci_heapIiNS_12indirect_cmpIPfSt4lessIfEEENS_27typed_identity_property_mapIjEEE3nilEv(%"class.boost::fibonacci_heap"* %this1)
  %call14 = call i32* @_ZNK9__gnu_cxx17__normal_iteratorIPjSt6vectorIjSaIjEEEixERKi(%"class.__gnu_cxx::__normal_iterator.15"* %new_roots, i32* %r)
  store i32 %call13, i32* %call14
  %_compare = getelementptr inbounds %"class.boost::fibonacci_heap"* %this1, i32 0, i32 9
  %_key = getelementptr inbounds %"class.boost::fibonacci_heap"* %this1, i32 0, i32 0
  %18 = load i32* %u, align 4
  %call15 = call i32* @_ZNSt6vectorIiSaIiEEixEj(%"class.std::vector.0"* %_key, i32 %18)
  %_key16 = getelementptr inbounds %"class.boost::fibonacci_heap"* %this1, i32 0, i32 0
  %19 = load i32* %v.addr, align 4
  %call17 = call i32* @_ZNSt6vectorIiSaIiEEixEj(%"class.std::vector.0"* %_key16, i32 %19)
  %call18 = call zeroext i1 @_ZNK5boost12indirect_cmpIPfSt4lessIfEEclIiiEEbRKT_RKT0_(%"class.boost::indirect_cmp"* %_compare, i32* %call15, i32* %call17)
  br i1 %call18, label %if.then19, label %if.end23

if.then19:                                        ; preds = %if.end11
  %20 = load i32* %r, align 4
  %_degree20 = getelementptr inbounds %"class.boost::fibonacci_heap"* %this1, i32 0, i32 5
  %21 = load i32* %v.addr, align 4
  %call21 = call i32* @_ZNSt6vectorIjSaIjEEixEj(%"class.std::vector.5"* %_degree20, i32 %21)
  store i32 %20, i32* %call21
  %_mark = getelementptr inbounds %"class.boost::fibonacci_heap"* %this1, i32 0, i32 4
  %22 = load i32* %v.addr, align 4
  call void @_ZNSt6vectorIbSaIbEEixEj(%"struct.std::_Bit_reference"* sret %tmp, %"class.std::vector.10"* %_mark, i32 %22)
  %call22 = call %"struct.std::_Bit_reference"* @_ZNSt14_Bit_referenceaSEb(%"struct.std::_Bit_reference"* %tmp, i1 zeroext false)
  call void @_ZSt4swapIjEvRT_S1_(i32* %u, i32* %v.addr)
  br label %if.end23

if.end23:                                         ; preds = %if.then19, %if.end11
  %23 = load i32* %u, align 4
  %24 = load i32* %v.addr, align 4
  %25 = load i32* %r, align 4
  call void @_ZN5boost14fibonacci_heapIiNS_12indirect_cmpIPfSt4lessIfEEENS_27typed_identity_property_mapIjEEE10make_childEjjj(%"class.boost::fibonacci_heap"* %this1, i32 %23, i32 %24, i32 %25)
  %26 = load i32* %r, align 4
  %inc24 = add nsw i32 %26, 1
  store i32 %inc24, i32* %r, align 4
  br label %while.body

while.end:                                        ; preds = %if.then9, %do.end
  %27 = load i32* %r, align 4
  %_degree25 = getelementptr inbounds %"class.boost::fibonacci_heap"* %this1, i32 0, i32 5
  %28 = load i32* %v.addr, align 4
  %call26 = call i32* @_ZNSt6vectorIjSaIjEEixEj(%"class.std::vector.5"* %_degree25, i32 %28)
  store i32 %27, i32* %call26
  %_mark27 = getelementptr inbounds %"class.boost::fibonacci_heap"* %this1, i32 0, i32 4
  %29 = load i32* %v.addr, align 4
  call void @_ZNSt6vectorIbSaIbEEixEj(%"struct.std::_Bit_reference"* sret %tmp28, %"class.std::vector.10"* %_mark27, i32 %29)
  %call29 = call %"struct.std::_Bit_reference"* @_ZNSt14_Bit_referenceaSEb(%"struct.std::_Bit_reference"* %tmp28, i1 zeroext false)
  ret void
}

define linkonce_odr void @_ZNSt6vectorIjSaIjEE5beginEv(%"class.__gnu_cxx::__normal_iterator.15"* noalias sret %agg.result, %"class.std::vector.5"* %this) align 2 {
entry:
  %this.addr = alloca %"class.std::vector.5"*, align 4
  store %"class.std::vector.5"* %this, %"class.std::vector.5"** %this.addr, align 4
  %this1 = load %"class.std::vector.5"** %this.addr
  %0 = bitcast %"class.std::vector.5"* %this1 to %"struct.std::_Vector_base.6"*
  %_M_impl = getelementptr inbounds %"struct.std::_Vector_base.6"* %0, i32 0, i32 0
  %_M_start = getelementptr inbounds %"struct.std::_Vector_base<unsigned int, std::allocator<unsigned int> >::_Vector_impl"* %_M_impl, i32 0, i32 0
  call void @_ZN9__gnu_cxx17__normal_iteratorIPjSt6vectorIjSaIjEEEC1ERKS1_(%"class.__gnu_cxx::__normal_iterator.15"* %agg.result, i32** %_M_start)
  ret void
}

define linkonce_odr void @_ZN5boost14fibonacci_heapIiNS_12indirect_cmpIPfSt4lessIfEEENS_27typed_identity_property_mapIjEEE17rebuild_root_listEN9__gnu_cxx17__normal_iteratorIPjSt6vectorIjSaIjEEEERi(%"class.boost::fibonacci_heap"* %this, %"class.__gnu_cxx::__normal_iterator.15"* byval align 4 %new_roots, i32* %h) inlinehint align 2 {
entry:
  %this.addr = alloca %"class.boost::fibonacci_heap"*, align 4
  %h.addr = alloca i32*, align 4
  %u = alloca i32, align 4
  %v = alloca i32, align 4
  %w = alloca i32, align 4
  %d = alloca i32, align 4
  store %"class.boost::fibonacci_heap"* %this, %"class.boost::fibonacci_heap"** %this.addr, align 4
  store i32* %h, i32** %h.addr, align 4
  %this1 = load %"class.boost::fibonacci_heap"** %this.addr
  %0 = load i32** %h.addr, align 4
  %1 = load i32* %0, align 4
  %cmp = icmp slt i32 %1, 0
  br i1 %cmp, label %if.then, label %if.else

if.then:                                          ; preds = %entry
  %call = call i32 @_ZNK5boost14fibonacci_heapIiNS_12indirect_cmpIPfSt4lessIfEEENS_27typed_identity_property_mapIjEEE3nilEv(%"class.boost::fibonacci_heap"* %this1)
  %_root = getelementptr inbounds %"class.boost::fibonacci_heap"* %this1, i32 0, i32 7
  store i32 %call, i32* %_root, align 4
  br label %if.end26

if.else:                                          ; preds = %entry
  %2 = load i32** %h.addr, align 4
  %call2 = call i32* @_ZNK9__gnu_cxx17__normal_iteratorIPjSt6vectorIjSaIjEEEixERKi(%"class.__gnu_cxx::__normal_iterator.15"* %new_roots, i32* %2)
  %3 = load i32* %call2
  store i32 %3, i32* %v, align 4
  store i32 %3, i32* %u, align 4
  %_key = getelementptr inbounds %"class.boost::fibonacci_heap"* %this1, i32 0, i32 0
  %4 = load i32* %u, align 4
  %call3 = call i32* @_ZNSt6vectorIiSaIiEEixEj(%"class.std::vector.0"* %_key, i32 %4)
  %5 = load i32* %call3
  store i32 %5, i32* %d, align 4
  %6 = load i32* %u, align 4
  %_root4 = getelementptr inbounds %"class.boost::fibonacci_heap"* %this1, i32 0, i32 7
  store i32 %6, i32* %_root4, align 4
  %7 = load i32** %h.addr, align 4
  %8 = load i32* %7, align 4
  %dec = add nsw i32 %8, -1
  store i32 %dec, i32* %7, align 4
  br label %for.cond

for.cond:                                         ; preds = %for.inc, %if.else
  %9 = load i32** %h.addr, align 4
  %10 = load i32* %9, align 4
  %cmp5 = icmp sge i32 %10, 0
  br i1 %cmp5, label %for.body, label %for.end

for.body:                                         ; preds = %for.cond
  %11 = load i32** %h.addr, align 4
  %call6 = call i32* @_ZNK9__gnu_cxx17__normal_iteratorIPjSt6vectorIjSaIjEEEixERKi(%"class.__gnu_cxx::__normal_iterator.15"* %new_roots, i32* %11)
  %12 = load i32* %call6
  %call7 = call i32 @_ZNK5boost14fibonacci_heapIiNS_12indirect_cmpIPfSt4lessIfEEENS_27typed_identity_property_mapIjEEE3nilEv(%"class.boost::fibonacci_heap"* %this1)
  %cmp8 = icmp ne i32 %12, %call7
  br i1 %cmp8, label %if.then9, label %if.end20

if.then9:                                         ; preds = %for.body
  %13 = load i32** %h.addr, align 4
  %call10 = call i32* @_ZNK9__gnu_cxx17__normal_iteratorIPjSt6vectorIjSaIjEEEixERKi(%"class.__gnu_cxx::__normal_iterator.15"* %new_roots, i32* %13)
  %14 = load i32* %call10
  store i32 %14, i32* %w, align 4
  %15 = load i32* %v, align 4
  %_left = getelementptr inbounds %"class.boost::fibonacci_heap"* %this1, i32 0, i32 1
  %16 = load i32* %w, align 4
  %call11 = call i32* @_ZNSt6vectorIjSaIjEEixEj(%"class.std::vector.5"* %_left, i32 %16)
  store i32 %15, i32* %call11
  %17 = load i32* %w, align 4
  %_right = getelementptr inbounds %"class.boost::fibonacci_heap"* %this1, i32 0, i32 2
  %18 = load i32* %v, align 4
  %call12 = call i32* @_ZNSt6vectorIjSaIjEEixEj(%"class.std::vector.5"* %_right, i32 %18)
  store i32 %17, i32* %call12
  %_compare = getelementptr inbounds %"class.boost::fibonacci_heap"* %this1, i32 0, i32 9
  %_key13 = getelementptr inbounds %"class.boost::fibonacci_heap"* %this1, i32 0, i32 0
  %19 = load i32* %w, align 4
  %call14 = call i32* @_ZNSt6vectorIiSaIiEEixEj(%"class.std::vector.0"* %_key13, i32 %19)
  %call15 = call zeroext i1 @_ZNK5boost12indirect_cmpIPfSt4lessIfEEclIiiEEbRKT_RKT0_(%"class.boost::indirect_cmp"* %_compare, i32* %call14, i32* %d)
  br i1 %call15, label %if.then16, label %if.end

if.then16:                                        ; preds = %if.then9
  %20 = load i32* %w, align 4
  %_root17 = getelementptr inbounds %"class.boost::fibonacci_heap"* %this1, i32 0, i32 7
  store i32 %20, i32* %_root17, align 4
  %_key18 = getelementptr inbounds %"class.boost::fibonacci_heap"* %this1, i32 0, i32 0
  %21 = load i32* %w, align 4
  %call19 = call i32* @_ZNSt6vectorIiSaIiEEixEj(%"class.std::vector.0"* %_key18, i32 %21)
  %22 = load i32* %call19
  store i32 %22, i32* %d, align 4
  br label %if.end

if.end:                                           ; preds = %if.then16, %if.then9
  %23 = load i32* %w, align 4
  store i32 %23, i32* %v, align 4
  br label %if.end20

if.end20:                                         ; preds = %if.end, %for.body
  br label %for.inc

for.inc:                                          ; preds = %if.end20
  %24 = load i32** %h.addr, align 4
  %25 = load i32* %24, align 4
  %dec21 = add nsw i32 %25, -1
  store i32 %dec21, i32* %24, align 4
  br label %for.cond

for.end:                                          ; preds = %for.cond
  %26 = load i32* %u, align 4
  %_right22 = getelementptr inbounds %"class.boost::fibonacci_heap"* %this1, i32 0, i32 2
  %27 = load i32* %v, align 4
  %call23 = call i32* @_ZNSt6vectorIjSaIjEEixEj(%"class.std::vector.5"* %_right22, i32 %27)
  store i32 %26, i32* %call23
  %28 = load i32* %v, align 4
  %_left24 = getelementptr inbounds %"class.boost::fibonacci_heap"* %this1, i32 0, i32 1
  %29 = load i32* %u, align 4
  %call25 = call i32* @_ZNSt6vectorIjSaIjEEixEj(%"class.std::vector.5"* %_left24, i32 %29)
  store i32 %28, i32* %call25
  br label %if.end26

if.end26:                                         ; preds = %for.end, %if.then
  ret void
}

define linkonce_odr i32* @_ZNK9__gnu_cxx17__normal_iteratorIPjSt6vectorIjSaIjEEEixERKi(%"class.__gnu_cxx::__normal_iterator.15"* %this, i32* %__n) nounwind align 2 {
entry:
  %this.addr = alloca %"class.__gnu_cxx::__normal_iterator.15"*, align 4
  %__n.addr = alloca i32*, align 4
  store %"class.__gnu_cxx::__normal_iterator.15"* %this, %"class.__gnu_cxx::__normal_iterator.15"** %this.addr, align 4
  store i32* %__n, i32** %__n.addr, align 4
  %this1 = load %"class.__gnu_cxx::__normal_iterator.15"** %this.addr
  %0 = load i32** %__n.addr, align 4
  %1 = load i32* %0, align 4
  %_M_current = getelementptr inbounds %"class.__gnu_cxx::__normal_iterator.15"* %this1, i32 0, i32 0
  %2 = load i32** %_M_current, align 4
  %arrayidx = getelementptr inbounds i32* %2, i32 %1
  ret i32* %arrayidx
}

define linkonce_odr i32* @_ZNSt6vectorIiSaIiEEixEj(%"class.std::vector.0"* %this, i32 %__n) nounwind align 2 {
entry:
  %this.addr = alloca %"class.std::vector.0"*, align 4
  %__n.addr = alloca i32, align 4
  store %"class.std::vector.0"* %this, %"class.std::vector.0"** %this.addr, align 4
  store i32 %__n, i32* %__n.addr, align 4
  %this1 = load %"class.std::vector.0"** %this.addr
  %0 = bitcast %"class.std::vector.0"* %this1 to %"struct.std::_Vector_base.1"*
  %_M_impl = getelementptr inbounds %"struct.std::_Vector_base.1"* %0, i32 0, i32 0
  %_M_start = getelementptr inbounds %"struct.std::_Vector_base<int, std::allocator<int> >::_Vector_impl"* %_M_impl, i32 0, i32 0
  %1 = load i32** %_M_start, align 4
  %2 = load i32* %__n.addr, align 4
  %add.ptr = getelementptr inbounds i32* %1, i32 %2
  ret i32* %add.ptr
}

define linkonce_odr zeroext i1 @_ZNK5boost12indirect_cmpIPfSt4lessIfEEclIiiEEbRKT_RKT0_(%"class.boost::indirect_cmp"* %this, i32* %u, i32* %v) inlinehint align 2 {
entry:
  %this.addr = alloca %"class.boost::indirect_cmp"*, align 4
  %u.addr = alloca i32*, align 4
  %v.addr = alloca i32*, align 4
  %du = alloca float*, align 4
  %dv = alloca float*, align 4
  store %"class.boost::indirect_cmp"* %this, %"class.boost::indirect_cmp"** %this.addr, align 4
  store i32* %u, i32** %u.addr, align 4
  store i32* %v, i32** %v.addr, align 4
  %this1 = load %"class.boost::indirect_cmp"** %this.addr
  %d = getelementptr inbounds %"class.boost::indirect_cmp"* %this1, i32 0, i32 0
  %0 = load float** %d, align 4
  %1 = load i32** %u.addr, align 4
  %2 = load i32* %1, align 4
  %call = call float* @_Z3getIfERKT_PS1_i(float* %0, i32 %2)
  store float* %call, float** %du, align 4
  %d2 = getelementptr inbounds %"class.boost::indirect_cmp"* %this1, i32 0, i32 0
  %3 = load float** %d2, align 4
  %4 = load i32** %v.addr, align 4
  %5 = load i32* %4, align 4
  %call3 = call float* @_Z3getIfERKT_PS1_i(float* %3, i32 %5)
  store float* %call3, float** %dv, align 4
  %cmp = getelementptr inbounds %"class.boost::indirect_cmp"* %this1, i32 0, i32 1
  %6 = load float** %du, align 4
  %7 = load float** %dv, align 4
  %call4 = call zeroext i1 @_ZNKSt4lessIfEclERKfS2_(%"struct.std::less"* %cmp, float* %6, float* %7)
  ret i1 %call4
}

define linkonce_odr float* @_Z3getIfERKT_PS1_i(float* %pa, i32 %k) nounwind inlinehint {
entry:
  %pa.addr = alloca float*, align 4
  %k.addr = alloca i32, align 4
  store float* %pa, float** %pa.addr, align 4
  store i32 %k, i32* %k.addr, align 4
  %0 = load i32* %k.addr, align 4
  %1 = load float** %pa.addr, align 4
  %arrayidx = getelementptr inbounds float* %1, i32 %0
  ret float* %arrayidx
}

define linkonce_odr zeroext i1 @_ZNKSt4lessIfEclERKfS2_(%"struct.std::less"* %this, float* %__x, float* %__y) nounwind align 2 {
entry:
  %this.addr = alloca %"struct.std::less"*, align 4
  %__x.addr = alloca float*, align 4
  %__y.addr = alloca float*, align 4
  store %"struct.std::less"* %this, %"struct.std::less"** %this.addr, align 4
  store float* %__x, float** %__x.addr, align 4
  store float* %__y, float** %__y.addr, align 4
  %this1 = load %"struct.std::less"** %this.addr
  %0 = load float** %__x.addr, align 4
  %1 = load float* %0, align 4
  %2 = load float** %__y.addr, align 4
  %3 = load float* %2, align 4
  %cmp = fcmp olt float %1, %3
  ret i1 %cmp
}

define linkonce_odr void @_ZN9__gnu_cxx17__normal_iteratorIPjSt6vectorIjSaIjEEEC1ERKS1_(%"class.__gnu_cxx::__normal_iterator.15"* %this, i32** %__i) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.__gnu_cxx::__normal_iterator.15"*, align 4
  %__i.addr = alloca i32**, align 4
  store %"class.__gnu_cxx::__normal_iterator.15"* %this, %"class.__gnu_cxx::__normal_iterator.15"** %this.addr, align 4
  store i32** %__i, i32*** %__i.addr, align 4
  %this1 = load %"class.__gnu_cxx::__normal_iterator.15"** %this.addr
  %0 = load i32*** %__i.addr
  call void @_ZN9__gnu_cxx17__normal_iteratorIPjSt6vectorIjSaIjEEEC2ERKS1_(%"class.__gnu_cxx::__normal_iterator.15"* %this1, i32** %0)
  ret void
}

define linkonce_odr void @_ZN9__gnu_cxx17__normal_iteratorIPjSt6vectorIjSaIjEEEC2ERKS1_(%"class.__gnu_cxx::__normal_iterator.15"* %this, i32** %__i) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.__gnu_cxx::__normal_iterator.15"*, align 4
  %__i.addr = alloca i32**, align 4
  store %"class.__gnu_cxx::__normal_iterator.15"* %this, %"class.__gnu_cxx::__normal_iterator.15"** %this.addr, align 4
  store i32** %__i, i32*** %__i.addr, align 4
  %this1 = load %"class.__gnu_cxx::__normal_iterator.15"** %this.addr
  %_M_current = getelementptr inbounds %"class.__gnu_cxx::__normal_iterator.15"* %this1, i32 0, i32 0
  %0 = load i32*** %__i.addr, align 4
  %1 = load i32** %0, align 4
  store i32* %1, i32** %_M_current, align 4
  ret void
}

define linkonce_odr void @_ZNSt6vectorIbSaIbEEixEj(%"struct.std::_Bit_reference"* noalias sret %agg.result, %"class.std::vector.10"* %this, i32 %__n) align 2 {
entry:
  %this.addr = alloca %"class.std::vector.10"*, align 4
  %__n.addr = alloca i32, align 4
  %tmp = alloca %"struct.std::_Bit_iterator", align 4
  store %"class.std::vector.10"* %this, %"class.std::vector.10"** %this.addr, align 4
  store i32 %__n, i32* %__n.addr, align 4
  %this1 = load %"class.std::vector.10"** %this.addr
  %0 = bitcast %"class.std::vector.10"* %this1 to %"struct.std::_Bvector_base"*
  %_M_impl = getelementptr inbounds %"struct.std::_Bvector_base"* %0, i32 0, i32 0
  %_M_start = getelementptr inbounds %"struct.std::_Bvector_base<std::allocator<bool> >::_Bvector_impl"* %_M_impl, i32 0, i32 0
  %1 = bitcast %"struct.std::_Bit_iterator"* %_M_start to %"struct.std::_Bit_iterator_base"*
  %_M_p = getelementptr inbounds %"struct.std::_Bit_iterator_base"* %1, i32 0, i32 0
  %2 = load i32** %_M_p, align 4
  %3 = load i32* %__n.addr, align 4
  %div = udiv i32 %3, 32
  %add.ptr = getelementptr inbounds i32* %2, i32 %div
  %4 = load i32* %__n.addr, align 4
  %rem = urem i32 %4, 32
  call void @_ZNSt13_Bit_iteratorC1EPmj(%"struct.std::_Bit_iterator"* %tmp, i32* %add.ptr, i32 %rem)
  call void @_ZNKSt13_Bit_iteratordeEv(%"struct.std::_Bit_reference"* sret %agg.result, %"struct.std::_Bit_iterator"* %tmp)
  ret void
}

define linkonce_odr %"struct.std::_Bit_reference"* @_ZNSt14_Bit_referenceaSEb(%"struct.std::_Bit_reference"* %this, i1 zeroext %__x) nounwind align 2 {
entry:
  %this.addr = alloca %"struct.std::_Bit_reference"*, align 4
  %__x.addr = alloca i8, align 1
  store %"struct.std::_Bit_reference"* %this, %"struct.std::_Bit_reference"** %this.addr, align 4
  %frombool = zext i1 %__x to i8
  store i8 %frombool, i8* %__x.addr, align 1
  %this1 = load %"struct.std::_Bit_reference"** %this.addr
  %0 = load i8* %__x.addr, align 1
  %tobool = trunc i8 %0 to i1
  br i1 %tobool, label %if.then, label %if.else

if.then:                                          ; preds = %entry
  %_M_mask = getelementptr inbounds %"struct.std::_Bit_reference"* %this1, i32 0, i32 1
  %1 = load i32* %_M_mask, align 4
  %_M_p = getelementptr inbounds %"struct.std::_Bit_reference"* %this1, i32 0, i32 0
  %2 = load i32** %_M_p, align 4
  %3 = load i32* %2, align 4
  %or = or i32 %3, %1
  store i32 %or, i32* %2, align 4
  br label %if.end

if.else:                                          ; preds = %entry
  %_M_mask2 = getelementptr inbounds %"struct.std::_Bit_reference"* %this1, i32 0, i32 1
  %4 = load i32* %_M_mask2, align 4
  %neg = xor i32 %4, -1
  %_M_p3 = getelementptr inbounds %"struct.std::_Bit_reference"* %this1, i32 0, i32 0
  %5 = load i32** %_M_p3, align 4
  %6 = load i32* %5, align 4
  %and = and i32 %6, %neg
  store i32 %and, i32* %5, align 4
  br label %if.end

if.end:                                           ; preds = %if.else, %if.then
  ret %"struct.std::_Bit_reference"* %this1
}

define linkonce_odr void @_ZSt4swapIjEvRT_S1_(i32* %__a, i32* %__b) nounwind {
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

define linkonce_odr void @_ZN5boost14fibonacci_heapIiNS_12indirect_cmpIPfSt4lessIfEEENS_27typed_identity_property_mapIjEEE10make_childEjjj(%"class.boost::fibonacci_heap"* %this, i32 %u, i32 %v, i32 %r) align 2 {
entry:
  %this.addr = alloca %"class.boost::fibonacci_heap"*, align 4
  %u.addr = alloca i32, align 4
  %v.addr = alloca i32, align 4
  %r.addr = alloca i32, align 4
  %t = alloca i32, align 4
  store %"class.boost::fibonacci_heap"* %this, %"class.boost::fibonacci_heap"** %this.addr, align 4
  store i32 %u, i32* %u.addr, align 4
  store i32 %v, i32* %v.addr, align 4
  store i32 %r, i32* %r.addr, align 4
  %this1 = load %"class.boost::fibonacci_heap"** %this.addr
  %0 = load i32* %r.addr, align 4
  %cmp = icmp eq i32 %0, 0
  br i1 %cmp, label %if.then, label %if.else

if.then:                                          ; preds = %entry
  %1 = load i32* %u.addr, align 4
  %_child = getelementptr inbounds %"class.boost::fibonacci_heap"* %this1, i32 0, i32 10
  %2 = load i32* %v.addr, align 4
  %call = call i32* @_ZNSt6vectorIjSaIjEEixEj(%"class.std::vector.5"* %_child, i32 %2)
  store i32 %1, i32* %call
  %3 = load i32* %u.addr, align 4
  %_left = getelementptr inbounds %"class.boost::fibonacci_heap"* %this1, i32 0, i32 1
  %4 = load i32* %u.addr, align 4
  %call2 = call i32* @_ZNSt6vectorIjSaIjEEixEj(%"class.std::vector.5"* %_left, i32 %4)
  store i32 %3, i32* %call2
  %5 = load i32* %u.addr, align 4
  %_right = getelementptr inbounds %"class.boost::fibonacci_heap"* %this1, i32 0, i32 2
  %6 = load i32* %u.addr, align 4
  %call3 = call i32* @_ZNSt6vectorIjSaIjEEixEj(%"class.std::vector.5"* %_right, i32 %6)
  store i32 %5, i32* %call3
  br label %if.end

if.else:                                          ; preds = %entry
  %_child4 = getelementptr inbounds %"class.boost::fibonacci_heap"* %this1, i32 0, i32 10
  %7 = load i32* %v.addr, align 4
  %call5 = call i32* @_ZNSt6vectorIjSaIjEEixEj(%"class.std::vector.5"* %_child4, i32 %7)
  %8 = load i32* %call5
  store i32 %8, i32* %t, align 4
  %_right6 = getelementptr inbounds %"class.boost::fibonacci_heap"* %this1, i32 0, i32 2
  %9 = load i32* %t, align 4
  %call7 = call i32* @_ZNSt6vectorIjSaIjEEixEj(%"class.std::vector.5"* %_right6, i32 %9)
  %10 = load i32* %call7
  %_right8 = getelementptr inbounds %"class.boost::fibonacci_heap"* %this1, i32 0, i32 2
  %11 = load i32* %u.addr, align 4
  %call9 = call i32* @_ZNSt6vectorIjSaIjEEixEj(%"class.std::vector.5"* %_right8, i32 %11)
  store i32 %10, i32* %call9
  %12 = load i32* %t, align 4
  %_left10 = getelementptr inbounds %"class.boost::fibonacci_heap"* %this1, i32 0, i32 1
  %13 = load i32* %u.addr, align 4
  %call11 = call i32* @_ZNSt6vectorIjSaIjEEixEj(%"class.std::vector.5"* %_left10, i32 %13)
  store i32 %12, i32* %call11
  %14 = load i32* %u.addr, align 4
  %_right12 = getelementptr inbounds %"class.boost::fibonacci_heap"* %this1, i32 0, i32 2
  %15 = load i32* %t, align 4
  %call13 = call i32* @_ZNSt6vectorIjSaIjEEixEj(%"class.std::vector.5"* %_right12, i32 %15)
  store i32 %14, i32* %call13
  %16 = load i32* %u.addr, align 4
  %_left14 = getelementptr inbounds %"class.boost::fibonacci_heap"* %this1, i32 0, i32 1
  %_right15 = getelementptr inbounds %"class.boost::fibonacci_heap"* %this1, i32 0, i32 2
  %17 = load i32* %u.addr, align 4
  %call16 = call i32* @_ZNSt6vectorIjSaIjEEixEj(%"class.std::vector.5"* %_right15, i32 %17)
  %18 = load i32* %call16
  %call17 = call i32* @_ZNSt6vectorIjSaIjEEixEj(%"class.std::vector.5"* %_left14, i32 %18)
  store i32 %16, i32* %call17
  br label %if.end

if.end:                                           ; preds = %if.else, %if.then
  %19 = load i32* %v.addr, align 4
  %_p = getelementptr inbounds %"class.boost::fibonacci_heap"* %this1, i32 0, i32 3
  %20 = load i32* %u.addr, align 4
  %call18 = call i32* @_ZNSt6vectorIjSaIjEEixEj(%"class.std::vector.5"* %_p, i32 %20)
  store i32 %19, i32* %call18
  ret void
}

define linkonce_odr void @_ZNSt13_Bit_iteratorC1EPmj(%"struct.std::_Bit_iterator"* %this, i32* %__x, i32 %__y) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"struct.std::_Bit_iterator"*, align 4
  %__x.addr = alloca i32*, align 4
  %__y.addr = alloca i32, align 4
  store %"struct.std::_Bit_iterator"* %this, %"struct.std::_Bit_iterator"** %this.addr, align 4
  store i32* %__x, i32** %__x.addr, align 4
  store i32 %__y, i32* %__y.addr, align 4
  %this1 = load %"struct.std::_Bit_iterator"** %this.addr
  %0 = load i32** %__x.addr, align 4
  %1 = load i32* %__y.addr, align 4
  call void @_ZNSt13_Bit_iteratorC2EPmj(%"struct.std::_Bit_iterator"* %this1, i32* %0, i32 %1)
  ret void
}

define linkonce_odr void @_ZNKSt13_Bit_iteratordeEv(%"struct.std::_Bit_reference"* noalias sret %agg.result, %"struct.std::_Bit_iterator"* %this) align 2 {
entry:
  %this.addr = alloca %"struct.std::_Bit_iterator"*, align 4
  store %"struct.std::_Bit_iterator"* %this, %"struct.std::_Bit_iterator"** %this.addr, align 4
  %this1 = load %"struct.std::_Bit_iterator"** %this.addr
  %0 = bitcast %"struct.std::_Bit_iterator"* %this1 to %"struct.std::_Bit_iterator_base"*
  %_M_p = getelementptr inbounds %"struct.std::_Bit_iterator_base"* %0, i32 0, i32 0
  %1 = load i32** %_M_p, align 4
  %2 = bitcast %"struct.std::_Bit_iterator"* %this1 to %"struct.std::_Bit_iterator_base"*
  %_M_offset = getelementptr inbounds %"struct.std::_Bit_iterator_base"* %2, i32 0, i32 1
  %3 = load i32* %_M_offset, align 4
  %shl = shl i32 1, %3
  call void @_ZNSt14_Bit_referenceC1EPmm(%"struct.std::_Bit_reference"* %agg.result, i32* %1, i32 %shl)
  ret void
}

define linkonce_odr void @_ZNSt14_Bit_referenceC1EPmm(%"struct.std::_Bit_reference"* %this, i32* %__x, i32 %__y) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"struct.std::_Bit_reference"*, align 4
  %__x.addr = alloca i32*, align 4
  %__y.addr = alloca i32, align 4
  store %"struct.std::_Bit_reference"* %this, %"struct.std::_Bit_reference"** %this.addr, align 4
  store i32* %__x, i32** %__x.addr, align 4
  store i32 %__y, i32* %__y.addr, align 4
  %this1 = load %"struct.std::_Bit_reference"** %this.addr
  %0 = load i32** %__x.addr, align 4
  %1 = load i32* %__y.addr, align 4
  call void @_ZNSt14_Bit_referenceC2EPmm(%"struct.std::_Bit_reference"* %this1, i32* %0, i32 %1)
  ret void
}

define linkonce_odr void @_ZNSt14_Bit_referenceC2EPmm(%"struct.std::_Bit_reference"* %this, i32* %__x, i32 %__y) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"struct.std::_Bit_reference"*, align 4
  %__x.addr = alloca i32*, align 4
  %__y.addr = alloca i32, align 4
  store %"struct.std::_Bit_reference"* %this, %"struct.std::_Bit_reference"** %this.addr, align 4
  store i32* %__x, i32** %__x.addr, align 4
  store i32 %__y, i32* %__y.addr, align 4
  %this1 = load %"struct.std::_Bit_reference"** %this.addr
  %_M_p = getelementptr inbounds %"struct.std::_Bit_reference"* %this1, i32 0, i32 0
  %0 = load i32** %__x.addr, align 4
  store i32* %0, i32** %_M_p, align 4
  %_M_mask = getelementptr inbounds %"struct.std::_Bit_reference"* %this1, i32 0, i32 1
  %1 = load i32* %__y.addr, align 4
  store i32 %1, i32* %_M_mask, align 4
  ret void
}

define linkonce_odr void @_ZNSt13_Bit_iteratorC2EPmj(%"struct.std::_Bit_iterator"* %this, i32* %__x, i32 %__y) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"struct.std::_Bit_iterator"*, align 4
  %__x.addr = alloca i32*, align 4
  %__y.addr = alloca i32, align 4
  store %"struct.std::_Bit_iterator"* %this, %"struct.std::_Bit_iterator"** %this.addr, align 4
  store i32* %__x, i32** %__x.addr, align 4
  store i32 %__y, i32* %__y.addr, align 4
  %this1 = load %"struct.std::_Bit_iterator"** %this.addr
  %0 = bitcast %"struct.std::_Bit_iterator"* %this1 to %"struct.std::_Bit_iterator_base"*
  %1 = load i32** %__x.addr, align 4
  %2 = load i32* %__y.addr, align 4
  call void @_ZNSt18_Bit_iterator_baseC2EPmj(%"struct.std::_Bit_iterator_base"* %0, i32* %1, i32 %2)
  ret void
}

define linkonce_odr void @_ZNSt18_Bit_iterator_baseC2EPmj(%"struct.std::_Bit_iterator_base"* %this, i32* %__x, i32 %__y) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"struct.std::_Bit_iterator_base"*, align 4
  %__x.addr = alloca i32*, align 4
  %__y.addr = alloca i32, align 4
  store %"struct.std::_Bit_iterator_base"* %this, %"struct.std::_Bit_iterator_base"** %this.addr, align 4
  store i32* %__x, i32** %__x.addr, align 4
  store i32 %__y, i32* %__y.addr, align 4
  %this1 = load %"struct.std::_Bit_iterator_base"** %this.addr
  %0 = bitcast %"struct.std::_Bit_iterator_base"* %this1 to %"struct.std::iterator"*
  %_M_p = getelementptr inbounds %"struct.std::_Bit_iterator_base"* %this1, i32 0, i32 0
  %1 = load i32** %__x.addr, align 4
  store i32* %1, i32** %_M_p, align 4
  %_M_offset = getelementptr inbounds %"struct.std::_Bit_iterator_base"* %this1, i32 0, i32 1
  %2 = load i32* %__y.addr, align 4
  store i32 %2, i32* %_M_offset, align 4
  ret void
}

define linkonce_odr i32 @_ZNKSt6vectorIjSaIjEE4sizeEv(%"class.std::vector.5"* %this) nounwind align 2 {
entry:
  %this.addr = alloca %"class.std::vector.5"*, align 4
  store %"class.std::vector.5"* %this, %"class.std::vector.5"** %this.addr, align 4
  %this1 = load %"class.std::vector.5"** %this.addr
  %0 = bitcast %"class.std::vector.5"* %this1 to %"struct.std::_Vector_base.6"*
  %_M_impl = getelementptr inbounds %"struct.std::_Vector_base.6"* %0, i32 0, i32 0
  %_M_finish = getelementptr inbounds %"struct.std::_Vector_base<unsigned int, std::allocator<unsigned int> >::_Vector_impl"* %_M_impl, i32 0, i32 1
  %1 = load i32** %_M_finish, align 4
  %2 = bitcast %"class.std::vector.5"* %this1 to %"struct.std::_Vector_base.6"*
  %_M_impl2 = getelementptr inbounds %"struct.std::_Vector_base.6"* %2, i32 0, i32 0
  %_M_start = getelementptr inbounds %"struct.std::_Vector_base<unsigned int, std::allocator<unsigned int> >::_Vector_impl"* %_M_impl2, i32 0, i32 0
  %3 = load i32** %_M_start, align 4
  %sub.ptr.lhs.cast = ptrtoint i32* %1 to i32
  %sub.ptr.rhs.cast = ptrtoint i32* %3 to i32
  %sub.ptr.sub = sub i32 %sub.ptr.lhs.cast, %sub.ptr.rhs.cast
  %sub.ptr.div = sdiv exact i32 %sub.ptr.sub, 4
  ret i32 %sub.ptr.div
}

define linkonce_odr void @_ZN9__gnu_cxx13new_allocatorIfE9constructEPfRKf(%"class.__gnu_cxx::new_allocator"* %this, float* %__p, float* %__val) nounwind align 2 {
entry:
  %this.addr = alloca %"class.__gnu_cxx::new_allocator"*, align 4
  %__p.addr = alloca float*, align 4
  %__val.addr = alloca float*, align 4
  store %"class.__gnu_cxx::new_allocator"* %this, %"class.__gnu_cxx::new_allocator"** %this.addr, align 4
  store float* %__p, float** %__p.addr, align 4
  store float* %__val, float** %__val.addr, align 4
  %this1 = load %"class.__gnu_cxx::new_allocator"** %this.addr
  %0 = load float** %__p.addr, align 4
  %1 = bitcast float* %0 to i8*
  %new.isnull = icmp eq i8* %1, null
  br i1 %new.isnull, label %new.cont, label %new.notnull

new.notnull:                                      ; preds = %entry
  %2 = bitcast i8* %1 to float*
  %3 = load float** %__val.addr, align 4
  %4 = load float* %3, align 4
  store float %4, float* %2, align 4
  br label %new.cont

new.cont:                                         ; preds = %new.notnull, %entry
  %5 = phi float* [ %2, %new.notnull ], [ null, %entry ]
  ret void
}

define linkonce_odr void @_ZNSt6vectorIfSaIfEE13_M_insert_auxEN9__gnu_cxx17__normal_iteratorIPfS1_EERKf(%"class.std::vector"* %this, %"class.__gnu_cxx::__normal_iterator"* byval align 4 %__position, float* %__x) align 2 {
entry:
  %this.addr = alloca %"class.std::vector"*, align 4
  %__x.addr = alloca float*, align 4
  %__x_copy = alloca float, align 4
  %__len = alloca i32, align 4
  %__elems_before = alloca i32, align 4
  %ref.tmp = alloca %"class.__gnu_cxx::__normal_iterator", align 4
  %__new_start = alloca float*, align 4
  %__new_finish = alloca float*, align 4
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  store %"class.std::vector"* %this, %"class.std::vector"** %this.addr, align 4
  store float* %__x, float** %__x.addr, align 4
  %this1 = load %"class.std::vector"** %this.addr
  %0 = bitcast %"class.std::vector"* %this1 to %"struct.std::_Vector_base"*
  %_M_impl = getelementptr inbounds %"struct.std::_Vector_base"* %0, i32 0, i32 0
  %_M_finish = getelementptr inbounds %"struct.std::_Vector_base<float, std::allocator<float> >::_Vector_impl"* %_M_impl, i32 0, i32 1
  %1 = load float** %_M_finish, align 4
  %2 = bitcast %"class.std::vector"* %this1 to %"struct.std::_Vector_base"*
  %_M_impl2 = getelementptr inbounds %"struct.std::_Vector_base"* %2, i32 0, i32 0
  %_M_end_of_storage = getelementptr inbounds %"struct.std::_Vector_base<float, std::allocator<float> >::_Vector_impl"* %_M_impl2, i32 0, i32 2
  %3 = load float** %_M_end_of_storage, align 4
  %cmp = icmp ne float* %1, %3
  br i1 %cmp, label %if.then, label %if.else

if.then:                                          ; preds = %entry
  %4 = bitcast %"class.std::vector"* %this1 to %"struct.std::_Vector_base"*
  %_M_impl3 = getelementptr inbounds %"struct.std::_Vector_base"* %4, i32 0, i32 0
  %5 = bitcast %"struct.std::_Vector_base<float, std::allocator<float> >::_Vector_impl"* %_M_impl3 to %"class.__gnu_cxx::new_allocator"*
  %6 = bitcast %"class.std::vector"* %this1 to %"struct.std::_Vector_base"*
  %_M_impl4 = getelementptr inbounds %"struct.std::_Vector_base"* %6, i32 0, i32 0
  %_M_finish5 = getelementptr inbounds %"struct.std::_Vector_base<float, std::allocator<float> >::_Vector_impl"* %_M_impl4, i32 0, i32 1
  %7 = load float** %_M_finish5, align 4
  %8 = bitcast %"class.std::vector"* %this1 to %"struct.std::_Vector_base"*
  %_M_impl6 = getelementptr inbounds %"struct.std::_Vector_base"* %8, i32 0, i32 0
  %_M_finish7 = getelementptr inbounds %"struct.std::_Vector_base<float, std::allocator<float> >::_Vector_impl"* %_M_impl6, i32 0, i32 1
  %9 = load float** %_M_finish7, align 4
  %add.ptr = getelementptr inbounds float* %9, i32 -1
  call void @_ZN9__gnu_cxx13new_allocatorIfE9constructEPfRKf(%"class.__gnu_cxx::new_allocator"* %5, float* %7, float* %add.ptr)
  %10 = bitcast %"class.std::vector"* %this1 to %"struct.std::_Vector_base"*
  %_M_impl8 = getelementptr inbounds %"struct.std::_Vector_base"* %10, i32 0, i32 0
  %_M_finish9 = getelementptr inbounds %"struct.std::_Vector_base<float, std::allocator<float> >::_Vector_impl"* %_M_impl8, i32 0, i32 1
  %11 = load float** %_M_finish9, align 4
  %incdec.ptr = getelementptr inbounds float* %11, i32 1
  store float* %incdec.ptr, float** %_M_finish9, align 4
  %12 = load float** %__x.addr, align 4
  %13 = load float* %12, align 4
  store float %13, float* %__x_copy, align 4
  %call = call float** @_ZNK9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEE4baseEv(%"class.__gnu_cxx::__normal_iterator"* %__position)
  %14 = load float** %call
  %15 = bitcast %"class.std::vector"* %this1 to %"struct.std::_Vector_base"*
  %_M_impl10 = getelementptr inbounds %"struct.std::_Vector_base"* %15, i32 0, i32 0
  %_M_finish11 = getelementptr inbounds %"struct.std::_Vector_base<float, std::allocator<float> >::_Vector_impl"* %_M_impl10, i32 0, i32 1
  %16 = load float** %_M_finish11, align 4
  %add.ptr12 = getelementptr inbounds float* %16, i32 -2
  %17 = bitcast %"class.std::vector"* %this1 to %"struct.std::_Vector_base"*
  %_M_impl13 = getelementptr inbounds %"struct.std::_Vector_base"* %17, i32 0, i32 0
  %_M_finish14 = getelementptr inbounds %"struct.std::_Vector_base<float, std::allocator<float> >::_Vector_impl"* %_M_impl13, i32 0, i32 1
  %18 = load float** %_M_finish14, align 4
  %add.ptr15 = getelementptr inbounds float* %18, i32 -1
  %call16 = call float* @_ZSt13copy_backwardIPfS0_ET0_T_S2_S1_(float* %14, float* %add.ptr12, float* %add.ptr15)
  %19 = load float* %__x_copy, align 4
  %call17 = call float* @_ZNK9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEEdeEv(%"class.__gnu_cxx::__normal_iterator"* %__position)
  store float %19, float* %call17
  br label %if.end68

if.else:                                          ; preds = %entry
  %call18 = call i32 @_ZNKSt6vectorIfSaIfEE12_M_check_lenEjPKc(%"class.std::vector"* %this1, i32 1, i8* getelementptr inbounds ([22 x i8]* @.str5, i32 0, i32 0))
  store i32 %call18, i32* %__len, align 4
  call void @_ZNSt6vectorIfSaIfEE5beginEv(%"class.__gnu_cxx::__normal_iterator"* sret %ref.tmp, %"class.std::vector"* %this1)
  %call19 = call i32 @_ZN9__gnu_cxxmiIPfSt6vectorIfSaIfEEEENS_17__normal_iteratorIT_T0_E15difference_typeERKS8_SB_(%"class.__gnu_cxx::__normal_iterator"* %__position, %"class.__gnu_cxx::__normal_iterator"* %ref.tmp)
  store i32 %call19, i32* %__elems_before, align 4
  %20 = bitcast %"class.std::vector"* %this1 to %"struct.std::_Vector_base"*
  %21 = load i32* %__len, align 4
  %call20 = call float* @_ZNSt12_Vector_baseIfSaIfEE11_M_allocateEj(%"struct.std::_Vector_base"* %20, i32 %21)
  store float* %call20, float** %__new_start, align 4
  %22 = load float** %__new_start, align 4
  store float* %22, float** %__new_finish, align 4
  %23 = bitcast %"class.std::vector"* %this1 to %"struct.std::_Vector_base"*
  %_M_impl21 = getelementptr inbounds %"struct.std::_Vector_base"* %23, i32 0, i32 0
  %24 = bitcast %"struct.std::_Vector_base<float, std::allocator<float> >::_Vector_impl"* %_M_impl21 to %"class.__gnu_cxx::new_allocator"*
  %25 = load float** %__new_start, align 4
  %26 = load i32* %__elems_before, align 4
  %add.ptr22 = getelementptr inbounds float* %25, i32 %26
  %27 = load float** %__x.addr, align 4
  invoke void @_ZN9__gnu_cxx13new_allocatorIfE9constructEPfRKf(%"class.__gnu_cxx::new_allocator"* %24, float* %add.ptr22, float* %27)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %if.else
  store float* null, float** %__new_finish, align 4
  %28 = bitcast %"class.std::vector"* %this1 to %"struct.std::_Vector_base"*
  %_M_impl23 = getelementptr inbounds %"struct.std::_Vector_base"* %28, i32 0, i32 0
  %_M_start = getelementptr inbounds %"struct.std::_Vector_base<float, std::allocator<float> >::_Vector_impl"* %_M_impl23, i32 0, i32 0
  %29 = load float** %_M_start, align 4
  %call25 = invoke float** @_ZNK9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEE4baseEv(%"class.__gnu_cxx::__normal_iterator"* %__position)
          to label %invoke.cont24 unwind label %lpad

invoke.cont24:                                    ; preds = %invoke.cont
  %30 = load float** %call25
  %31 = load float** %__new_start, align 4
  %32 = bitcast %"class.std::vector"* %this1 to %"struct.std::_Vector_base"*
  %call27 = invoke %"class.std::allocator"* @_ZNSt12_Vector_baseIfSaIfEE19_M_get_Tp_allocatorEv(%"struct.std::_Vector_base"* %32)
          to label %invoke.cont26 unwind label %lpad

invoke.cont26:                                    ; preds = %invoke.cont24
  %call29 = invoke float* @_ZSt22__uninitialized_move_aIPfS0_SaIfEET0_T_S3_S2_RT1_(float* %29, float* %30, float* %31, %"class.std::allocator"* %call27)
          to label %invoke.cont28 unwind label %lpad

invoke.cont28:                                    ; preds = %invoke.cont26
  store float* %call29, float** %__new_finish, align 4
  %33 = load float** %__new_finish, align 4
  %incdec.ptr30 = getelementptr inbounds float* %33, i32 1
  store float* %incdec.ptr30, float** %__new_finish, align 4
  %call32 = invoke float** @_ZNK9__gnu_cxx17__normal_iteratorIPfSt6vectorIfSaIfEEE4baseEv(%"class.__gnu_cxx::__normal_iterator"* %__position)
          to label %invoke.cont31 unwind label %lpad

invoke.cont31:                                    ; preds = %invoke.cont28
  %34 = load float** %call32
  %35 = bitcast %"class.std::vector"* %this1 to %"struct.std::_Vector_base"*
  %_M_impl33 = getelementptr inbounds %"struct.std::_Vector_base"* %35, i32 0, i32 0
  %_M_finish34 = getelementptr inbounds %"struct.std::_Vector_base<float, std::allocator<float> >::_Vector_impl"* %_M_impl33, i32 0, i32 1
  %36 = load float** %_M_finish34, align 4
  %37 = load float** %__new_finish, align 4
  %38 = bitcast %"class.std::vector"* %this1 to %"struct.std::_Vector_base"*
  %call36 = invoke %"class.std::allocator"* @_ZNSt12_Vector_baseIfSaIfEE19_M_get_Tp_allocatorEv(%"struct.std::_Vector_base"* %38)
          to label %invoke.cont35 unwind label %lpad

invoke.cont35:                                    ; preds = %invoke.cont31
  %call38 = invoke float* @_ZSt22__uninitialized_move_aIPfS0_SaIfEET0_T_S3_S2_RT1_(float* %34, float* %36, float* %37, %"class.std::allocator"* %call36)
          to label %invoke.cont37 unwind label %lpad

invoke.cont37:                                    ; preds = %invoke.cont35
  store float* %call38, float** %__new_finish, align 4
  br label %try.cont

lpad:                                             ; preds = %invoke.cont35, %invoke.cont31, %invoke.cont28, %invoke.cont26, %invoke.cont24, %invoke.cont, %if.else
  %39 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          catch i8* null
  %40 = extractvalue { i8*, i32 } %39, 0
  store i8* %40, i8** %exn.slot
  %41 = extractvalue { i8*, i32 } %39, 1
  store i32 %41, i32* %ehselector.slot
  br label %catch

catch:                                            ; preds = %lpad
  %exn = load i8** %exn.slot
  %42 = call i8* @__cxa_begin_catch(i8* %exn) nounwind
  %43 = load float** %__new_finish, align 4
  %tobool = icmp ne float* %43, null
  br i1 %tobool, label %if.else44, label %if.then39

if.then39:                                        ; preds = %catch
  %44 = bitcast %"class.std::vector"* %this1 to %"struct.std::_Vector_base"*
  %_M_impl40 = getelementptr inbounds %"struct.std::_Vector_base"* %44, i32 0, i32 0
  %45 = bitcast %"struct.std::_Vector_base<float, std::allocator<float> >::_Vector_impl"* %_M_impl40 to %"class.__gnu_cxx::new_allocator"*
  %46 = load float** %__new_start, align 4
  %47 = load i32* %__elems_before, align 4
  %add.ptr41 = getelementptr inbounds float* %46, i32 %47
  invoke void @_ZN9__gnu_cxx13new_allocatorIfE7destroyEPf(%"class.__gnu_cxx::new_allocator"* %45, float* %add.ptr41)
          to label %invoke.cont43 unwind label %lpad42

invoke.cont43:                                    ; preds = %if.then39
  br label %if.end

lpad42:                                           ; preds = %invoke.cont48, %if.end, %invoke.cont45, %if.else44, %if.then39
  %48 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %49 = extractvalue { i8*, i32 } %48, 0
  store i8* %49, i8** %exn.slot
  %50 = extractvalue { i8*, i32 } %48, 1
  store i32 %50, i32* %ehselector.slot
  invoke void @__cxa_end_catch()
          to label %invoke.cont49 unwind label %terminate.lpad

if.else44:                                        ; preds = %catch
  %51 = load float** %__new_start, align 4
  %52 = load float** %__new_finish, align 4
  %53 = bitcast %"class.std::vector"* %this1 to %"struct.std::_Vector_base"*
  %call46 = invoke %"class.std::allocator"* @_ZNSt12_Vector_baseIfSaIfEE19_M_get_Tp_allocatorEv(%"struct.std::_Vector_base"* %53)
          to label %invoke.cont45 unwind label %lpad42

invoke.cont45:                                    ; preds = %if.else44
  invoke void @_ZSt8_DestroyIPffEvT_S1_RSaIT0_E(float* %51, float* %52, %"class.std::allocator"* %call46)
          to label %invoke.cont47 unwind label %lpad42

invoke.cont47:                                    ; preds = %invoke.cont45
  br label %if.end

if.end:                                           ; preds = %invoke.cont47, %invoke.cont43
  %54 = bitcast %"class.std::vector"* %this1 to %"struct.std::_Vector_base"*
  %55 = load float** %__new_start, align 4
  %56 = load i32* %__len, align 4
  invoke void @_ZNSt12_Vector_baseIfSaIfEE13_M_deallocateEPfj(%"struct.std::_Vector_base"* %54, float* %55, i32 %56)
          to label %invoke.cont48 unwind label %lpad42

invoke.cont48:                                    ; preds = %if.end
  invoke void @__cxa_rethrow() noreturn
          to label %unreachable unwind label %lpad42

invoke.cont49:                                    ; preds = %lpad42
  br label %eh.resume

try.cont:                                         ; preds = %invoke.cont37
  %57 = bitcast %"class.std::vector"* %this1 to %"struct.std::_Vector_base"*
  %_M_impl50 = getelementptr inbounds %"struct.std::_Vector_base"* %57, i32 0, i32 0
  %_M_start51 = getelementptr inbounds %"struct.std::_Vector_base<float, std::allocator<float> >::_Vector_impl"* %_M_impl50, i32 0, i32 0
  %58 = load float** %_M_start51, align 4
  %59 = bitcast %"class.std::vector"* %this1 to %"struct.std::_Vector_base"*
  %_M_impl52 = getelementptr inbounds %"struct.std::_Vector_base"* %59, i32 0, i32 0
  %_M_finish53 = getelementptr inbounds %"struct.std::_Vector_base<float, std::allocator<float> >::_Vector_impl"* %_M_impl52, i32 0, i32 1
  %60 = load float** %_M_finish53, align 4
  %61 = bitcast %"class.std::vector"* %this1 to %"struct.std::_Vector_base"*
  %call54 = call %"class.std::allocator"* @_ZNSt12_Vector_baseIfSaIfEE19_M_get_Tp_allocatorEv(%"struct.std::_Vector_base"* %61)
  call void @_ZSt8_DestroyIPffEvT_S1_RSaIT0_E(float* %58, float* %60, %"class.std::allocator"* %call54)
  %62 = bitcast %"class.std::vector"* %this1 to %"struct.std::_Vector_base"*
  %63 = bitcast %"class.std::vector"* %this1 to %"struct.std::_Vector_base"*
  %_M_impl55 = getelementptr inbounds %"struct.std::_Vector_base"* %63, i32 0, i32 0
  %_M_start56 = getelementptr inbounds %"struct.std::_Vector_base<float, std::allocator<float> >::_Vector_impl"* %_M_impl55, i32 0, i32 0
  %64 = load float** %_M_start56, align 4
  %65 = bitcast %"class.std::vector"* %this1 to %"struct.std::_Vector_base"*
  %_M_impl57 = getelementptr inbounds %"struct.std::_Vector_base"* %65, i32 0, i32 0
  %_M_end_of_storage58 = getelementptr inbounds %"struct.std::_Vector_base<float, std::allocator<float> >::_Vector_impl"* %_M_impl57, i32 0, i32 2
  %66 = load float** %_M_end_of_storage58, align 4
  %67 = bitcast %"class.std::vector"* %this1 to %"struct.std::_Vector_base"*
  %_M_impl59 = getelementptr inbounds %"struct.std::_Vector_base"* %67, i32 0, i32 0
  %_M_start60 = getelementptr inbounds %"struct.std::_Vector_base<float, std::allocator<float> >::_Vector_impl"* %_M_impl59, i32 0, i32 0
  %68 = load float** %_M_start60, align 4
  %sub.ptr.lhs.cast = ptrtoint float* %66 to i32
  %sub.ptr.rhs.cast = ptrtoint float* %68 to i32
  %sub.ptr.sub = sub i32 %sub.ptr.lhs.cast, %sub.ptr.rhs.cast
  %sub.ptr.div = sdiv exact i32 %sub.ptr.sub, 4
  call void @_ZNSt12_Vector_baseIfSaIfEE13_M_deallocateEPfj(%"struct.std::_Vector_base"* %62, float* %64, i32 %sub.ptr.div)
  %69 = load float** %__new_start, align 4
  %70 = bitcast %"class.std::vector"* %this1 to %"struct.std::_Vector_base"*
  %_M_impl61 = getelementptr inbounds %"struct.std::_Vector_base"* %70, i32 0, i32 0
  %_M_start62 = getelementptr inbounds %"struct.std::_Vector_base<float, std::allocator<float> >::_Vector_impl"* %_M_impl61, i32 0, i32 0
  store float* %69, float** %_M_start62, align 4
  %71 = load float** %__new_finish, align 4
  %72 = bitcast %"class.std::vector"* %this1 to %"struct.std::_Vector_base"*
  %_M_impl63 = getelementptr inbounds %"struct.std::_Vector_base"* %72, i32 0, i32 0
  %_M_finish64 = getelementptr inbounds %"struct.std::_Vector_base<float, std::allocator<float> >::_Vector_impl"* %_M_impl63, i32 0, i32 1
  store float* %71, float** %_M_finish64, align 4
  %73 = load float** %__new_start, align 4
  %74 = load i32* %__len, align 4
  %add.ptr65 = getelementptr inbounds float* %73, i32 %74
  %75 = bitcast %"class.std::vector"* %this1 to %"struct.std::_Vector_base"*
  %_M_impl66 = getelementptr inbounds %"struct.std::_Vector_base"* %75, i32 0, i32 0
  %_M_end_of_storage67 = getelementptr inbounds %"struct.std::_Vector_base<float, std::allocator<float> >::_Vector_impl"* %_M_impl66, i32 0, i32 2
  store float* %add.ptr65, float** %_M_end_of_storage67, align 4
  br label %if.end68

if.end68:                                         ; preds = %try.cont, %if.then
  ret void

eh.resume:                                        ; preds = %invoke.cont49
  %exn69 = load i8** %exn.slot
  %sel = load i32* %ehselector.slot
  %lpad.val = insertvalue { i8*, i32 } undef, i8* %exn69, 0
  %lpad.val70 = insertvalue { i8*, i32 } %lpad.val, i32 %sel, 1
  resume { i8*, i32 } %lpad.val70

terminate.lpad:                                   ; preds = %lpad42
  %76 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          catch i8* null
  call void @_ZSt9terminatev() noreturn nounwind
  unreachable

unreachable:                                      ; preds = %invoke.cont48
  unreachable
}

define linkonce_odr float* @_ZSt13copy_backwardIPfS0_ET0_T_S2_S1_(float* %__first, float* %__last, float* %__result) inlinehint {
entry:
  %__first.addr = alloca float*, align 4
  %__last.addr = alloca float*, align 4
  %__result.addr = alloca float*, align 4
  store float* %__first, float** %__first.addr, align 4
  store float* %__last, float** %__last.addr, align 4
  store float* %__result, float** %__result.addr, align 4
  %0 = load float** %__first.addr, align 4
  %call = call float* @_ZSt12__miter_baseIPfENSt11_Miter_baseIT_E13iterator_typeES2_(float* %0)
  %1 = load float** %__last.addr, align 4
  %call1 = call float* @_ZSt12__miter_baseIPfENSt11_Miter_baseIT_E13iterator_typeES2_(float* %1)
  %2 = load float** %__result.addr, align 4
  %call2 = call float* @_ZSt23__copy_move_backward_a2ILb0EPfS0_ET1_T0_S2_S1_(float* %call, float* %call1, float* %2)
  ret float* %call2
}

define linkonce_odr i32 @_ZNKSt6vectorIfSaIfEE12_M_check_lenEjPKc(%"class.std::vector"* %this, i32 %__n, i8* %__s) align 2 {
entry:
  %this.addr = alloca %"class.std::vector"*, align 4
  %__n.addr = alloca i32, align 4
  %__s.addr = alloca i8*, align 4
  %__len = alloca i32, align 4
  %ref.tmp = alloca i32, align 4
  store %"class.std::vector"* %this, %"class.std::vector"** %this.addr, align 4
  store i32 %__n, i32* %__n.addr, align 4
  store i8* %__s, i8** %__s.addr, align 4
  %this1 = load %"class.std::vector"** %this.addr
  %call = call i32 @_ZNKSt6vectorIfSaIfEE8max_sizeEv(%"class.std::vector"* %this1)
  %call2 = call i32 @_ZNKSt6vectorIfSaIfEE4sizeEv(%"class.std::vector"* %this1)
  %sub = sub i32 %call, %call2
  %0 = load i32* %__n.addr, align 4
  %cmp = icmp ult i32 %sub, %0
  br i1 %cmp, label %if.then, label %if.end

if.then:                                          ; preds = %entry
  %1 = load i8** %__s.addr, align 4
  call void @_ZSt20__throw_length_errorPKc(i8* %1) noreturn
  unreachable

if.end:                                           ; preds = %entry
  %call3 = call i32 @_ZNKSt6vectorIfSaIfEE4sizeEv(%"class.std::vector"* %this1)
  %call4 = call i32 @_ZNKSt6vectorIfSaIfEE4sizeEv(%"class.std::vector"* %this1)
  store i32 %call4, i32* %ref.tmp, align 4
  %call5 = call i32* @_ZSt3maxIjERKT_S2_S2_(i32* %ref.tmp, i32* %__n.addr)
  %2 = load i32* %call5
  %add = add i32 %call3, %2
  store i32 %add, i32* %__len, align 4
  %3 = load i32* %__len, align 4
  %call6 = call i32 @_ZNKSt6vectorIfSaIfEE4sizeEv(%"class.std::vector"* %this1)
  %cmp7 = icmp ult i32 %3, %call6
  br i1 %cmp7, label %cond.true, label %lor.lhs.false

lor.lhs.false:                                    ; preds = %if.end
  %4 = load i32* %__len, align 4
  %call8 = call i32 @_ZNKSt6vectorIfSaIfEE8max_sizeEv(%"class.std::vector"* %this1)
  %cmp9 = icmp ugt i32 %4, %call8
  br i1 %cmp9, label %cond.true, label %cond.false

cond.true:                                        ; preds = %lor.lhs.false, %if.end
  %call10 = call i32 @_ZNKSt6vectorIfSaIfEE8max_sizeEv(%"class.std::vector"* %this1)
  br label %cond.end

cond.false:                                       ; preds = %lor.lhs.false
  %5 = load i32* %__len, align 4
  br label %cond.end

cond.end:                                         ; preds = %cond.false, %cond.true
  %cond = phi i32 [ %call10, %cond.true ], [ %5, %cond.false ]
  ret i32 %cond
}

define linkonce_odr float* @_ZNSt12_Vector_baseIfSaIfEE11_M_allocateEj(%"struct.std::_Vector_base"* %this, i32 %__n) align 2 {
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
  %1 = bitcast %"struct.std::_Vector_base<float, std::allocator<float> >::_Vector_impl"* %_M_impl to %"class.__gnu_cxx::new_allocator"*
  %2 = load i32* %__n.addr, align 4
  %call = call float* @_ZN9__gnu_cxx13new_allocatorIfE8allocateEjPKv(%"class.__gnu_cxx::new_allocator"* %1, i32 %2, i8* null)
  br label %cond.end

cond.false:                                       ; preds = %entry
  br label %cond.end

cond.end:                                         ; preds = %cond.false, %cond.true
  %cond = phi float* [ %call, %cond.true ], [ null, %cond.false ]
  ret float* %cond
}

define linkonce_odr float* @_ZSt22__uninitialized_move_aIPfS0_SaIfEET0_T_S3_S2_RT1_(float* %__first, float* %__last, float* %__result, %"class.std::allocator"* %__alloc) inlinehint {
entry:
  %__first.addr = alloca float*, align 4
  %__last.addr = alloca float*, align 4
  %__result.addr = alloca float*, align 4
  %__alloc.addr = alloca %"class.std::allocator"*, align 4
  store float* %__first, float** %__first.addr, align 4
  store float* %__last, float** %__last.addr, align 4
  store float* %__result, float** %__result.addr, align 4
  store %"class.std::allocator"* %__alloc, %"class.std::allocator"** %__alloc.addr, align 4
  %0 = load float** %__first.addr, align 4
  %1 = load float** %__last.addr, align 4
  %2 = load float** %__result.addr, align 4
  %3 = load %"class.std::allocator"** %__alloc.addr, align 4
  %call = call float* @_ZSt22__uninitialized_copy_aIPfS0_fET0_T_S2_S1_RSaIT1_E(float* %0, float* %1, float* %2, %"class.std::allocator"* %3)
  ret float* %call
}

define linkonce_odr %"class.std::allocator"* @_ZNSt12_Vector_baseIfSaIfEE19_M_get_Tp_allocatorEv(%"struct.std::_Vector_base"* %this) nounwind align 2 {
entry:
  %this.addr = alloca %"struct.std::_Vector_base"*, align 4
  store %"struct.std::_Vector_base"* %this, %"struct.std::_Vector_base"** %this.addr, align 4
  %this1 = load %"struct.std::_Vector_base"** %this.addr
  %_M_impl = getelementptr inbounds %"struct.std::_Vector_base"* %this1, i32 0, i32 0
  %0 = bitcast %"struct.std::_Vector_base<float, std::allocator<float> >::_Vector_impl"* %_M_impl to %"class.std::allocator"*
  ret %"class.std::allocator"* %0
}

declare i8* @__cxa_begin_catch(i8*)

define linkonce_odr void @_ZN9__gnu_cxx13new_allocatorIfE7destroyEPf(%"class.__gnu_cxx::new_allocator"* %this, float* %__p) nounwind align 2 {
entry:
  %this.addr = alloca %"class.__gnu_cxx::new_allocator"*, align 4
  %__p.addr = alloca float*, align 4
  store %"class.__gnu_cxx::new_allocator"* %this, %"class.__gnu_cxx::new_allocator"** %this.addr, align 4
  store float* %__p, float** %__p.addr, align 4
  %this1 = load %"class.__gnu_cxx::new_allocator"** %this.addr
  %0 = load float** %__p.addr, align 4
  ret void
}

define linkonce_odr void @_ZSt8_DestroyIPffEvT_S1_RSaIT0_E(float* %__first, float* %__last, %"class.std::allocator"*) inlinehint {
entry:
  %__first.addr = alloca float*, align 4
  %__last.addr = alloca float*, align 4
  %.addr = alloca %"class.std::allocator"*, align 4
  store float* %__first, float** %__first.addr, align 4
  store float* %__last, float** %__last.addr, align 4
  store %"class.std::allocator"* %0, %"class.std::allocator"** %.addr, align 4
  %1 = load float** %__first.addr, align 4
  %2 = load float** %__last.addr, align 4
  call void @_ZSt8_DestroyIPfEvT_S1_(float* %1, float* %2)
  ret void
}

define linkonce_odr void @_ZNSt12_Vector_baseIfSaIfEE13_M_deallocateEPfj(%"struct.std::_Vector_base"* %this, float* %__p, i32 %__n) align 2 {
entry:
  %this.addr = alloca %"struct.std::_Vector_base"*, align 4
  %__p.addr = alloca float*, align 4
  %__n.addr = alloca i32, align 4
  store %"struct.std::_Vector_base"* %this, %"struct.std::_Vector_base"** %this.addr, align 4
  store float* %__p, float** %__p.addr, align 4
  store i32 %__n, i32* %__n.addr, align 4
  %this1 = load %"struct.std::_Vector_base"** %this.addr
  %0 = load float** %__p.addr, align 4
  %tobool = icmp ne float* %0, null
  br i1 %tobool, label %if.then, label %if.end

if.then:                                          ; preds = %entry
  %_M_impl = getelementptr inbounds %"struct.std::_Vector_base"* %this1, i32 0, i32 0
  %1 = bitcast %"struct.std::_Vector_base<float, std::allocator<float> >::_Vector_impl"* %_M_impl to %"class.__gnu_cxx::new_allocator"*
  %2 = load float** %__p.addr, align 4
  %3 = load i32* %__n.addr, align 4
  call void @_ZN9__gnu_cxx13new_allocatorIfE10deallocateEPfj(%"class.__gnu_cxx::new_allocator"* %1, float* %2, i32 %3)
  br label %if.end

if.end:                                           ; preds = %if.then, %entry
  ret void
}

declare void @__cxa_rethrow()

declare void @__cxa_end_catch()

define linkonce_odr void @_ZN9__gnu_cxx13new_allocatorIfE10deallocateEPfj(%"class.__gnu_cxx::new_allocator"* %this, float* %__p, i32) nounwind align 2 {
entry:
  %this.addr = alloca %"class.__gnu_cxx::new_allocator"*, align 4
  %__p.addr = alloca float*, align 4
  %.addr = alloca i32, align 4
  store %"class.__gnu_cxx::new_allocator"* %this, %"class.__gnu_cxx::new_allocator"** %this.addr, align 4
  store float* %__p, float** %__p.addr, align 4
  store i32 %0, i32* %.addr, align 4
  %this1 = load %"class.__gnu_cxx::new_allocator"** %this.addr
  %1 = load float** %__p.addr, align 4
  %2 = bitcast float* %1 to i8*
  call void @_ZdlPv(i8* %2) nounwind
  ret void
}

declare void @_ZdlPv(i8*) nounwind

define linkonce_odr void @_ZSt8_DestroyIPfEvT_S1_(float* %__first, float* %__last) inlinehint {
entry:
  %__first.addr = alloca float*, align 4
  %__last.addr = alloca float*, align 4
  store float* %__first, float** %__first.addr, align 4
  store float* %__last, float** %__last.addr, align 4
  %0 = load float** %__first.addr, align 4
  %1 = load float** %__last.addr, align 4
  call void @_ZNSt12_Destroy_auxILb1EE9__destroyIPfEEvT_S3_(float* %0, float* %1)
  ret void
}

define linkonce_odr void @_ZNSt12_Destroy_auxILb1EE9__destroyIPfEEvT_S3_(float*, float*) nounwind align 2 {
entry:
  %.addr = alloca float*, align 4
  %.addr1 = alloca float*, align 4
  store float* %0, float** %.addr, align 4
  store float* %1, float** %.addr1, align 4
  ret void
}

define linkonce_odr float* @_ZSt22__uninitialized_copy_aIPfS0_fET0_T_S2_S1_RSaIT1_E(float* %__first, float* %__last, float* %__result, %"class.std::allocator"*) inlinehint {
entry:
  %__first.addr = alloca float*, align 4
  %__last.addr = alloca float*, align 4
  %__result.addr = alloca float*, align 4
  %.addr = alloca %"class.std::allocator"*, align 4
  store float* %__first, float** %__first.addr, align 4
  store float* %__last, float** %__last.addr, align 4
  store float* %__result, float** %__result.addr, align 4
  store %"class.std::allocator"* %0, %"class.std::allocator"** %.addr, align 4
  %1 = load float** %__first.addr, align 4
  %2 = load float** %__last.addr, align 4
  %3 = load float** %__result.addr, align 4
  %call = call float* @_ZSt18uninitialized_copyIPfS0_ET0_T_S2_S1_(float* %1, float* %2, float* %3)
  ret float* %call
}

define linkonce_odr float* @_ZSt18uninitialized_copyIPfS0_ET0_T_S2_S1_(float* %__first, float* %__last, float* %__result) inlinehint {
entry:
  %__first.addr = alloca float*, align 4
  %__last.addr = alloca float*, align 4
  %__result.addr = alloca float*, align 4
  store float* %__first, float** %__first.addr, align 4
  store float* %__last, float** %__last.addr, align 4
  store float* %__result, float** %__result.addr, align 4
  %0 = load float** %__first.addr, align 4
  %1 = load float** %__last.addr, align 4
  %2 = load float** %__result.addr, align 4
  %call = call float* @_ZNSt20__uninitialized_copyILb1EE13__uninit_copyIPfS2_EET0_T_S4_S3_(float* %0, float* %1, float* %2)
  ret float* %call
}

define linkonce_odr float* @_ZNSt20__uninitialized_copyILb1EE13__uninit_copyIPfS2_EET0_T_S4_S3_(float* %__first, float* %__last, float* %__result) align 2 {
entry:
  %__first.addr = alloca float*, align 4
  %__last.addr = alloca float*, align 4
  %__result.addr = alloca float*, align 4
  store float* %__first, float** %__first.addr, align 4
  store float* %__last, float** %__last.addr, align 4
  store float* %__result, float** %__result.addr, align 4
  %0 = load float** %__first.addr, align 4
  %1 = load float** %__last.addr, align 4
  %2 = load float** %__result.addr, align 4
  %call = call float* @_ZSt4copyIPfS0_ET0_T_S2_S1_(float* %0, float* %1, float* %2)
  ret float* %call
}

define linkonce_odr float* @_ZSt4copyIPfS0_ET0_T_S2_S1_(float* %__first, float* %__last, float* %__result) inlinehint {
entry:
  %__first.addr = alloca float*, align 4
  %__last.addr = alloca float*, align 4
  %__result.addr = alloca float*, align 4
  store float* %__first, float** %__first.addr, align 4
  store float* %__last, float** %__last.addr, align 4
  store float* %__result, float** %__result.addr, align 4
  %0 = load float** %__first.addr, align 4
  %call = call float* @_ZSt12__miter_baseIPfENSt11_Miter_baseIT_E13iterator_typeES2_(float* %0)
  %1 = load float** %__last.addr, align 4
  %call1 = call float* @_ZSt12__miter_baseIPfENSt11_Miter_baseIT_E13iterator_typeES2_(float* %1)
  %2 = load float** %__result.addr, align 4
  %call2 = call float* @_ZSt14__copy_move_a2ILb0EPfS0_ET1_T0_S2_S1_(float* %call, float* %call1, float* %2)
  ret float* %call2
}

define linkonce_odr float* @_ZSt14__copy_move_a2ILb0EPfS0_ET1_T0_S2_S1_(float* %__first, float* %__last, float* %__result) inlinehint {
entry:
  %__first.addr = alloca float*, align 4
  %__last.addr = alloca float*, align 4
  %__result.addr = alloca float*, align 4
  store float* %__first, float** %__first.addr, align 4
  store float* %__last, float** %__last.addr, align 4
  store float* %__result, float** %__result.addr, align 4
  %0 = load float** %__first.addr, align 4
  %call = call float* @_ZSt12__niter_baseIPfENSt11_Niter_baseIT_E13iterator_typeES2_(float* %0)
  %1 = load float** %__last.addr, align 4
  %call1 = call float* @_ZSt12__niter_baseIPfENSt11_Niter_baseIT_E13iterator_typeES2_(float* %1)
  %2 = load float** %__result.addr, align 4
  %call2 = call float* @_ZSt12__niter_baseIPfENSt11_Niter_baseIT_E13iterator_typeES2_(float* %2)
  %call3 = call float* @_ZSt13__copy_move_aILb0EPfS0_ET1_T0_S2_S1_(float* %call, float* %call1, float* %call2)
  ret float* %call3
}

define linkonce_odr float* @_ZSt12__miter_baseIPfENSt11_Miter_baseIT_E13iterator_typeES2_(float* %__it) inlinehint {
entry:
  %__it.addr = alloca float*, align 4
  store float* %__it, float** %__it.addr, align 4
  %0 = load float** %__it.addr, align 4
  %call = call float* @_ZNSt10_Iter_baseIPfLb0EE7_S_baseES0_(float* %0)
  ret float* %call
}

define linkonce_odr float* @_ZNSt10_Iter_baseIPfLb0EE7_S_baseES0_(float* %__it) nounwind align 2 {
entry:
  %__it.addr = alloca float*, align 4
  store float* %__it, float** %__it.addr, align 4
  %0 = load float** %__it.addr, align 4
  ret float* %0
}

define linkonce_odr float* @_ZSt13__copy_move_aILb0EPfS0_ET1_T0_S2_S1_(float* %__first, float* %__last, float* %__result) inlinehint {
entry:
  %__first.addr = alloca float*, align 4
  %__last.addr = alloca float*, align 4
  %__result.addr = alloca float*, align 4
  %__simple = alloca i8, align 1
  store float* %__first, float** %__first.addr, align 4
  store float* %__last, float** %__last.addr, align 4
  store float* %__result, float** %__result.addr, align 4
  store i8 1, i8* %__simple, align 1
  %0 = load float** %__first.addr, align 4
  %1 = load float** %__last.addr, align 4
  %2 = load float** %__result.addr, align 4
  %call = call float* @_ZNSt11__copy_moveILb0ELb1ESt26random_access_iterator_tagE8__copy_mIfEEPT_PKS3_S6_S4_(float* %0, float* %1, float* %2)
  ret float* %call
}

define linkonce_odr float* @_ZSt12__niter_baseIPfENSt11_Niter_baseIT_E13iterator_typeES2_(float* %__it) nounwind inlinehint {
entry:
  %__it.addr = alloca float*, align 4
  store float* %__it, float** %__it.addr, align 4
  %0 = load float** %__it.addr, align 4
  %call = call float* @_ZNSt10_Iter_baseIPfLb0EE7_S_baseES0_(float* %0)
  ret float* %call
}

define linkonce_odr float* @_ZNSt11__copy_moveILb0ELb1ESt26random_access_iterator_tagE8__copy_mIfEEPT_PKS3_S6_S4_(float* %__first, float* %__last, float* %__result) nounwind align 2 {
entry:
  %__first.addr = alloca float*, align 4
  %__last.addr = alloca float*, align 4
  %__result.addr = alloca float*, align 4
  %_Num = alloca i32, align 4
  store float* %__first, float** %__first.addr, align 4
  store float* %__last, float** %__last.addr, align 4
  store float* %__result, float** %__result.addr, align 4
  %0 = load float** %__last.addr, align 4
  %1 = load float** %__first.addr, align 4
  %sub.ptr.lhs.cast = ptrtoint float* %0 to i32
  %sub.ptr.rhs.cast = ptrtoint float* %1 to i32
  %sub.ptr.sub = sub i32 %sub.ptr.lhs.cast, %sub.ptr.rhs.cast
  %sub.ptr.div = sdiv exact i32 %sub.ptr.sub, 4
  store i32 %sub.ptr.div, i32* %_Num, align 4
  %2 = load i32* %_Num, align 4
  %tobool = icmp ne i32 %2, 0
  br i1 %tobool, label %if.then, label %if.end

if.then:                                          ; preds = %entry
  %3 = load float** %__result.addr, align 4
  %4 = bitcast float* %3 to i8*
  %5 = load float** %__first.addr, align 4
  %6 = bitcast float* %5 to i8*
  %7 = load i32* %_Num, align 4
  %mul = mul i32 4, %7
  call void @llvm.memmove.p0i8.p0i8.i32(i8* %4, i8* %6, i32 %mul, i32 4, i1 false)
  br label %if.end

if.end:                                           ; preds = %if.then, %entry
  %8 = load float** %__result.addr, align 4
  %9 = load i32* %_Num, align 4
  %add.ptr = getelementptr inbounds float* %8, i32 %9
  ret float* %add.ptr
}

define linkonce_odr float* @_ZN9__gnu_cxx13new_allocatorIfE8allocateEjPKv(%"class.__gnu_cxx::new_allocator"* %this, i32 %__n, i8*) align 2 {
entry:
  %this.addr = alloca %"class.__gnu_cxx::new_allocator"*, align 4
  %__n.addr = alloca i32, align 4
  %.addr = alloca i8*, align 4
  store %"class.__gnu_cxx::new_allocator"* %this, %"class.__gnu_cxx::new_allocator"** %this.addr, align 4
  store i32 %__n, i32* %__n.addr, align 4
  store i8* %0, i8** %.addr, align 4
  %this1 = load %"class.__gnu_cxx::new_allocator"** %this.addr
  %1 = load i32* %__n.addr, align 4
  %call = call i32 @_ZNK9__gnu_cxx13new_allocatorIfE8max_sizeEv(%"class.__gnu_cxx::new_allocator"* %this1) nounwind
  %cmp = icmp ugt i32 %1, %call
  br i1 %cmp, label %if.then, label %if.end

if.then:                                          ; preds = %entry
  call void @_ZSt17__throw_bad_allocv() noreturn
  unreachable

if.end:                                           ; preds = %entry
  %2 = load i32* %__n.addr, align 4
  %mul = mul i32 %2, 4
  %call2 = call noalias i8* @_Znwj(i32 %mul)
  %3 = bitcast i8* %call2 to float*
  ret float* %3
}

define linkonce_odr i32 @_ZNK9__gnu_cxx13new_allocatorIfE8max_sizeEv(%"class.__gnu_cxx::new_allocator"* %this) nounwind align 2 {
entry:
  %this.addr = alloca %"class.__gnu_cxx::new_allocator"*, align 4
  store %"class.__gnu_cxx::new_allocator"* %this, %"class.__gnu_cxx::new_allocator"** %this.addr, align 4
  %this1 = load %"class.__gnu_cxx::new_allocator"** %this.addr
  ret i32 1073741823
}

declare void @_ZSt17__throw_bad_allocv() noreturn

declare noalias i8* @_Znwj(i32)

define linkonce_odr i32 @_ZNKSt6vectorIfSaIfEE8max_sizeEv(%"class.std::vector"* %this) align 2 {
entry:
  %this.addr = alloca %"class.std::vector"*, align 4
  store %"class.std::vector"* %this, %"class.std::vector"** %this.addr, align 4
  %this1 = load %"class.std::vector"** %this.addr
  %0 = bitcast %"class.std::vector"* %this1 to %"struct.std::_Vector_base"*
  %call = call %"class.std::allocator"* @_ZNKSt12_Vector_baseIfSaIfEE19_M_get_Tp_allocatorEv(%"struct.std::_Vector_base"* %0)
  %1 = bitcast %"class.std::allocator"* %call to %"class.__gnu_cxx::new_allocator"*
  %call2 = call i32 @_ZNK9__gnu_cxx13new_allocatorIfE8max_sizeEv(%"class.__gnu_cxx::new_allocator"* %1) nounwind
  ret i32 %call2
}

declare void @_ZSt20__throw_length_errorPKc(i8*) noreturn

define linkonce_odr i32* @_ZSt3maxIjERKT_S2_S2_(i32* %__a, i32* %__b) nounwind {
entry:
  %retval = alloca i32*, align 4
  %__a.addr = alloca i32*, align 4
  %__b.addr = alloca i32*, align 4
  store i32* %__a, i32** %__a.addr, align 4
  store i32* %__b, i32** %__b.addr, align 4
  %0 = load i32** %__a.addr, align 4
  %1 = load i32* %0, align 4
  %2 = load i32** %__b.addr, align 4
  %3 = load i32* %2, align 4
  %cmp = icmp ult i32 %1, %3
  br i1 %cmp, label %if.then, label %if.end

if.then:                                          ; preds = %entry
  %4 = load i32** %__b.addr, align 4
  store i32* %4, i32** %retval
  br label %return

if.end:                                           ; preds = %entry
  %5 = load i32** %__a.addr, align 4
  store i32* %5, i32** %retval
  br label %return

return:                                           ; preds = %if.end, %if.then
  %6 = load i32** %retval
  ret i32* %6
}

define linkonce_odr %"class.std::allocator"* @_ZNKSt12_Vector_baseIfSaIfEE19_M_get_Tp_allocatorEv(%"struct.std::_Vector_base"* %this) nounwind align 2 {
entry:
  %this.addr = alloca %"struct.std::_Vector_base"*, align 4
  store %"struct.std::_Vector_base"* %this, %"struct.std::_Vector_base"** %this.addr, align 4
  %this1 = load %"struct.std::_Vector_base"** %this.addr
  %_M_impl = getelementptr inbounds %"struct.std::_Vector_base"* %this1, i32 0, i32 0
  %0 = bitcast %"struct.std::_Vector_base<float, std::allocator<float> >::_Vector_impl"* %_M_impl to %"class.std::allocator"*
  ret %"class.std::allocator"* %0
}

define linkonce_odr float* @_ZSt23__copy_move_backward_a2ILb0EPfS0_ET1_T0_S2_S1_(float* %__first, float* %__last, float* %__result) inlinehint {
entry:
  %__first.addr = alloca float*, align 4
  %__last.addr = alloca float*, align 4
  %__result.addr = alloca float*, align 4
  store float* %__first, float** %__first.addr, align 4
  store float* %__last, float** %__last.addr, align 4
  store float* %__result, float** %__result.addr, align 4
  %0 = load float** %__first.addr, align 4
  %call = call float* @_ZSt12__niter_baseIPfENSt11_Niter_baseIT_E13iterator_typeES2_(float* %0)
  %1 = load float** %__last.addr, align 4
  %call1 = call float* @_ZSt12__niter_baseIPfENSt11_Niter_baseIT_E13iterator_typeES2_(float* %1)
  %2 = load float** %__result.addr, align 4
  %call2 = call float* @_ZSt12__niter_baseIPfENSt11_Niter_baseIT_E13iterator_typeES2_(float* %2)
  %call3 = call float* @_ZSt22__copy_move_backward_aILb0EPfS0_ET1_T0_S2_S1_(float* %call, float* %call1, float* %call2)
  ret float* %call3
}

define linkonce_odr i32 @_ZN5boost3getINS_27typed_identity_property_mapIjEEjiEET0_RKNS_14put_get_helperIS3_T_EERKT1_(%"struct.boost::put_get_helper"* %pa, i32* %k) inlinehint {
entry:
  %pa.addr = alloca %"struct.boost::put_get_helper"*, align 4
  %k.addr = alloca i32*, align 4
  %v = alloca i32, align 4
  %ref.tmp = alloca i32, align 4
  store %"struct.boost::put_get_helper"* %pa, %"struct.boost::put_get_helper"** %pa.addr, align 4
  store i32* %k, i32** %k.addr, align 4
  %0 = load %"struct.boost::put_get_helper"** %pa.addr, align 4
  %1 = bitcast %"struct.boost::put_get_helper"* %0 to %"struct.boost::typed_identity_property_map"*
  %2 = load i32** %k.addr, align 4
  %3 = load i32* %2, align 4
  store i32 %3, i32* %ref.tmp, align 4
  %call = call i32 @_ZNK5boost27typed_identity_property_mapIjEixERKj(%"struct.boost::typed_identity_property_map"* %1, i32* %ref.tmp)
  store i32 %call, i32* %v, align 4
  %4 = load i32* %v, align 4
  ret i32 %4
}

declare void @__assert_fail(i8*, i8*, i32, i8*) noreturn nounwind

define linkonce_odr void @_ZN5boost14fibonacci_heapIiNS_12indirect_cmpIPfSt4lessIfEEENS_27typed_identity_property_mapIjEEE18remove_from_familyEjj(%"class.boost::fibonacci_heap"* %this, i32 %v, i32 %p) nounwind inlinehint align 2 {
entry:
  %this.addr = alloca %"class.boost::fibonacci_heap"*, align 4
  %v.addr = alloca i32, align 4
  %p.addr = alloca i32, align 4
  %u = alloca i32, align 4
  %w = alloca i32, align 4
  store %"class.boost::fibonacci_heap"* %this, %"class.boost::fibonacci_heap"** %this.addr, align 4
  store i32 %v, i32* %v.addr, align 4
  store i32 %p, i32* %p.addr, align 4
  %this1 = load %"class.boost::fibonacci_heap"** %this.addr
  %_left = getelementptr inbounds %"class.boost::fibonacci_heap"* %this1, i32 0, i32 1
  %0 = load i32* %v.addr, align 4
  %call = call i32* @_ZNSt6vectorIjSaIjEEixEj(%"class.std::vector.5"* %_left, i32 %0)
  %1 = load i32* %call
  store i32 %1, i32* %u, align 4
  %_right = getelementptr inbounds %"class.boost::fibonacci_heap"* %this1, i32 0, i32 2
  %2 = load i32* %v.addr, align 4
  %call2 = call i32* @_ZNSt6vectorIjSaIjEEixEj(%"class.std::vector.5"* %_right, i32 %2)
  %3 = load i32* %call2
  store i32 %3, i32* %w, align 4
  %4 = load i32* %w, align 4
  %_right3 = getelementptr inbounds %"class.boost::fibonacci_heap"* %this1, i32 0, i32 2
  %5 = load i32* %u, align 4
  %call4 = call i32* @_ZNSt6vectorIjSaIjEEixEj(%"class.std::vector.5"* %_right3, i32 %5)
  store i32 %4, i32* %call4
  %6 = load i32* %u, align 4
  %_left5 = getelementptr inbounds %"class.boost::fibonacci_heap"* %this1, i32 0, i32 1
  %7 = load i32* %w, align 4
  %call6 = call i32* @_ZNSt6vectorIjSaIjEEixEj(%"class.std::vector.5"* %_left5, i32 %7)
  store i32 %6, i32* %call6
  %_child = getelementptr inbounds %"class.boost::fibonacci_heap"* %this1, i32 0, i32 10
  %8 = load i32* %p.addr, align 4
  %call7 = call i32* @_ZNSt6vectorIjSaIjEEixEj(%"class.std::vector.5"* %_child, i32 %8)
  %9 = load i32* %call7
  %10 = load i32* %v.addr, align 4
  %cmp = icmp eq i32 %9, %10
  br i1 %cmp, label %if.then, label %if.end

if.then:                                          ; preds = %entry
  %11 = load i32* %w, align 4
  %_child8 = getelementptr inbounds %"class.boost::fibonacci_heap"* %this1, i32 0, i32 10
  %12 = load i32* %p.addr, align 4
  %call9 = call i32* @_ZNSt6vectorIjSaIjEEixEj(%"class.std::vector.5"* %_child8, i32 %12)
  store i32 %11, i32* %call9
  br label %if.end

if.end:                                           ; preds = %if.then, %entry
  ret void
}

define linkonce_odr void @_ZN5boost14fibonacci_heapIiNS_12indirect_cmpIPfSt4lessIfEEENS_27typed_identity_property_mapIjEEE18insert_into_forestEjRKi(%"class.boost::fibonacci_heap"* %this, i32 %v, i32* %d) inlinehint align 2 {
entry:
  %this.addr = alloca %"class.boost::fibonacci_heap"*, align 4
  %v.addr = alloca i32, align 4
  %d.addr = alloca i32*, align 4
  %u = alloca i32, align 4
  store %"class.boost::fibonacci_heap"* %this, %"class.boost::fibonacci_heap"** %this.addr, align 4
  store i32 %v, i32* %v.addr, align 4
  store i32* %d, i32** %d.addr, align 4
  %this1 = load %"class.boost::fibonacci_heap"** %this.addr
  %call = call i32 @_ZNK5boost14fibonacci_heapIiNS_12indirect_cmpIPfSt4lessIfEEENS_27typed_identity_property_mapIjEEE3nilEv(%"class.boost::fibonacci_heap"* %this1)
  %_p = getelementptr inbounds %"class.boost::fibonacci_heap"* %this1, i32 0, i32 3
  %0 = load i32* %v.addr, align 4
  %call2 = call i32* @_ZNSt6vectorIjSaIjEEixEj(%"class.std::vector.5"* %_p, i32 %0)
  store i32 %call, i32* %call2
  %_left = getelementptr inbounds %"class.boost::fibonacci_heap"* %this1, i32 0, i32 1
  %_root = getelementptr inbounds %"class.boost::fibonacci_heap"* %this1, i32 0, i32 7
  %1 = load i32* %_root, align 4
  %call3 = call i32* @_ZNSt6vectorIjSaIjEEixEj(%"class.std::vector.5"* %_left, i32 %1)
  %2 = load i32* %call3
  store i32 %2, i32* %u, align 4
  %3 = load i32* %u, align 4
  %_left4 = getelementptr inbounds %"class.boost::fibonacci_heap"* %this1, i32 0, i32 1
  %4 = load i32* %v.addr, align 4
  %call5 = call i32* @_ZNSt6vectorIjSaIjEEixEj(%"class.std::vector.5"* %_left4, i32 %4)
  store i32 %3, i32* %call5
  %_root6 = getelementptr inbounds %"class.boost::fibonacci_heap"* %this1, i32 0, i32 7
  %5 = load i32* %_root6, align 4
  %_right = getelementptr inbounds %"class.boost::fibonacci_heap"* %this1, i32 0, i32 2
  %6 = load i32* %v.addr, align 4
  %call7 = call i32* @_ZNSt6vectorIjSaIjEEixEj(%"class.std::vector.5"* %_right, i32 %6)
  store i32 %5, i32* %call7
  %7 = load i32* %v.addr, align 4
  %_right8 = getelementptr inbounds %"class.boost::fibonacci_heap"* %this1, i32 0, i32 2
  %8 = load i32* %u, align 4
  %call9 = call i32* @_ZNSt6vectorIjSaIjEEixEj(%"class.std::vector.5"* %_right8, i32 %8)
  store i32 %7, i32* %call9
  %_left10 = getelementptr inbounds %"class.boost::fibonacci_heap"* %this1, i32 0, i32 1
  %_root11 = getelementptr inbounds %"class.boost::fibonacci_heap"* %this1, i32 0, i32 7
  %9 = load i32* %_root11, align 4
  %call12 = call i32* @_ZNSt6vectorIjSaIjEEixEj(%"class.std::vector.5"* %_left10, i32 %9)
  store i32 %7, i32* %call12
  %_compare = getelementptr inbounds %"class.boost::fibonacci_heap"* %this1, i32 0, i32 9
  %10 = load i32** %d.addr, align 4
  %_key = getelementptr inbounds %"class.boost::fibonacci_heap"* %this1, i32 0, i32 0
  %_root13 = getelementptr inbounds %"class.boost::fibonacci_heap"* %this1, i32 0, i32 7
  %11 = load i32* %_root13, align 4
  %call14 = call i32* @_ZNSt6vectorIiSaIiEEixEj(%"class.std::vector.0"* %_key, i32 %11)
  %call15 = call zeroext i1 @_ZNK5boost12indirect_cmpIPfSt4lessIfEEclIiiEEbRKT_RKT0_(%"class.boost::indirect_cmp"* %_compare, i32* %10, i32* %call14)
  br i1 %call15, label %if.then, label %if.end

if.then:                                          ; preds = %entry
  %12 = load i32* %v.addr, align 4
  %_root16 = getelementptr inbounds %"class.boost::fibonacci_heap"* %this1, i32 0, i32 7
  store i32 %12, i32* %_root16, align 4
  br label %if.end

if.end:                                           ; preds = %if.then, %entry
  ret void
}

define linkonce_odr zeroext i1 @_ZNKSt14_Bit_referencecvbEv(%"struct.std::_Bit_reference"* %this) nounwind align 2 {
entry:
  %this.addr = alloca %"struct.std::_Bit_reference"*, align 4
  store %"struct.std::_Bit_reference"* %this, %"struct.std::_Bit_reference"** %this.addr, align 4
  %this1 = load %"struct.std::_Bit_reference"** %this.addr
  %_M_p = getelementptr inbounds %"struct.std::_Bit_reference"* %this1, i32 0, i32 0
  %0 = load i32** %_M_p, align 4
  %1 = load i32* %0, align 4
  %_M_mask = getelementptr inbounds %"struct.std::_Bit_reference"* %this1, i32 0, i32 1
  %2 = load i32* %_M_mask, align 4
  %and = and i32 %1, %2
  %tobool = icmp ne i32 %and, 0
  %lnot = xor i1 %tobool, true
  %lnot2 = xor i1 %lnot, true
  ret i1 %lnot2
}

define linkonce_odr i32 @_ZNK5boost27typed_identity_property_mapIjEixERKj(%"struct.boost::typed_identity_property_map"* %this, i32* %v) nounwind inlinehint align 2 {
entry:
  %this.addr = alloca %"struct.boost::typed_identity_property_map"*, align 4
  %v.addr = alloca i32*, align 4
  store %"struct.boost::typed_identity_property_map"* %this, %"struct.boost::typed_identity_property_map"** %this.addr, align 4
  store i32* %v, i32** %v.addr, align 4
  %this1 = load %"struct.boost::typed_identity_property_map"** %this.addr
  %0 = load i32** %v.addr, align 4
  %1 = load i32* %0, align 4
  ret i32 %1
}

define linkonce_odr i32 @_ZNK5boost11uniform_intIiEclINS_6random23mersenne_twister_engineIjLj32ELj624ELj397ELj31ELj2567483615ELj11ELj4294967295ELj7ELj2636928640ELj15ELj4022730752ELj18ELj1812433253EEEEEiRT_(%"class.boost::uniform_int"* %this, %"class.boost::random::mersenne_twister_engine"* %eng) align 2 {
entry:
  %this.addr = alloca %"class.boost::uniform_int"*, align 4
  %eng.addr = alloca %"class.boost::random::mersenne_twister_engine"*, align 4
  store %"class.boost::uniform_int"* %this, %"class.boost::uniform_int"** %this.addr, align 4
  store %"class.boost::random::mersenne_twister_engine"* %eng, %"class.boost::random::mersenne_twister_engine"** %eng.addr, align 4
  %this1 = load %"class.boost::uniform_int"** %this.addr
  %0 = bitcast %"class.boost::uniform_int"* %this1 to %"class.boost::random::uniform_int_distribution"*
  %1 = load %"class.boost::random::mersenne_twister_engine"** %eng.addr, align 4
  %call = call i32 @_ZNK5boost6random24uniform_int_distributionIiEclINS0_23mersenne_twister_engineIjLj32ELj624ELj397ELj31ELj2567483615ELj11ELj4294967295ELj7ELj2636928640ELj15ELj4022730752ELj18ELj1812433253EEEEEiRT_(%"class.boost::random::uniform_int_distribution"* %0, %"class.boost::random::mersenne_twister_engine"* %1)
  ret i32 %call
}

define linkonce_odr %"class.boost::random::mersenne_twister_engine"* @_ZN5boost6random17variate_generatorIRNS0_23mersenne_twister_engineIjLj32ELj624ELj397ELj31ELj2567483615ELj11ELj4294967295ELj7ELj2636928640ELj15ELj4022730752ELj18ELj1812433253EEENS_11uniform_intIiEEE6engineEv(%"class.boost::random::variate_generator"* %this) align 2 {
entry:
  %this.addr = alloca %"class.boost::random::variate_generator"*, align 4
  store %"class.boost::random::variate_generator"* %this, %"class.boost::random::variate_generator"** %this.addr, align 4
  %this1 = load %"class.boost::random::variate_generator"** %this.addr
  %_eng = getelementptr inbounds %"class.boost::random::variate_generator"* %this1, i32 0, i32 0
  %ref = load %"class.boost::random::mersenne_twister_engine"** %_eng, align 4
  %call = call %"class.boost::random::mersenne_twister_engine"* @_ZN5boost6random6detail10ptr_helperIRNS0_23mersenne_twister_engineIjLj32ELj624ELj397ELj31ELj2567483615ELj11ELj4294967295ELj7ELj2636928640ELj15ELj4022730752ELj18ELj1812433253EEEE3refES5_(%"class.boost::random::mersenne_twister_engine"* %ref)
  ret %"class.boost::random::mersenne_twister_engine"* %call
}

define linkonce_odr %"class.boost::random::mersenne_twister_engine"* @_ZN5boost6random6detail10ptr_helperIRNS0_23mersenne_twister_engineIjLj32ELj624ELj397ELj31ELj2567483615ELj11ELj4294967295ELj7ELj2636928640ELj15ELj4022730752ELj18ELj1812433253EEEE3refES5_(%"class.boost::random::mersenne_twister_engine"* %r) nounwind align 2 {
entry:
  %r.addr = alloca %"class.boost::random::mersenne_twister_engine"*, align 4
  store %"class.boost::random::mersenne_twister_engine"* %r, %"class.boost::random::mersenne_twister_engine"** %r.addr, align 4
  %0 = load %"class.boost::random::mersenne_twister_engine"** %r.addr, align 4
  ret %"class.boost::random::mersenne_twister_engine"* %0
}

define linkonce_odr i32 @_ZNK5boost6random24uniform_int_distributionIiEclINS0_23mersenne_twister_engineIjLj32ELj624ELj397ELj31ELj2567483615ELj11ELj4294967295ELj7ELj2636928640ELj15ELj4022730752ELj18ELj1812433253EEEEEiRT_(%"class.boost::random::uniform_int_distribution"* %this, %"class.boost::random::mersenne_twister_engine"* %eng) align 2 {
entry:
  %this.addr = alloca %"class.boost::random::uniform_int_distribution"*, align 4
  %eng.addr = alloca %"class.boost::random::mersenne_twister_engine"*, align 4
  store %"class.boost::random::uniform_int_distribution"* %this, %"class.boost::random::uniform_int_distribution"** %this.addr, align 4
  store %"class.boost::random::mersenne_twister_engine"* %eng, %"class.boost::random::mersenne_twister_engine"** %eng.addr, align 4
  %this1 = load %"class.boost::random::uniform_int_distribution"** %this.addr
  %0 = load %"class.boost::random::mersenne_twister_engine"** %eng.addr, align 4
  %_min = getelementptr inbounds %"class.boost::random::uniform_int_distribution"* %this1, i32 0, i32 0
  %1 = load i32* %_min, align 4
  %_max = getelementptr inbounds %"class.boost::random::uniform_int_distribution"* %this1, i32 0, i32 1
  %2 = load i32* %_max, align 4
  %call = call i32 @_ZN5boost6random6detail20generate_uniform_intINS0_23mersenne_twister_engineIjLj32ELj624ELj397ELj31ELj2567483615ELj11ELj4294967295ELj7ELj2636928640ELj15ELj4022730752ELj18ELj1812433253EEEiEET0_RT_S5_S5_(%"class.boost::random::mersenne_twister_engine"* %0, i32 %1, i32 %2)
  ret i32 %call
}

define linkonce_odr i32 @_ZN5boost6random6detail20generate_uniform_intINS0_23mersenne_twister_engineIjLj32ELj624ELj397ELj31ELj2567483615ELj11ELj4294967295ELj7ELj2636928640ELj15ELj4022730752ELj18ELj1812433253EEEiEET0_RT_S5_S5_(%"class.boost::random::mersenne_twister_engine"* %eng, i32 %min_value, i32 %max_value) inlinehint {
entry:
  %eng.addr = alloca %"class.boost::random::mersenne_twister_engine"*, align 4
  %min_value.addr = alloca i32, align 4
  %max_value.addr = alloca i32, align 4
  %agg.tmp = alloca %"struct.mpl_::bool_", align 1
  %ref.tmp = alloca %"struct.boost::is_integral", align 1
  store %"class.boost::random::mersenne_twister_engine"* %eng, %"class.boost::random::mersenne_twister_engine"** %eng.addr, align 4
  store i32 %min_value, i32* %min_value.addr, align 4
  store i32 %max_value, i32* %max_value.addr, align 4
  %0 = load %"class.boost::random::mersenne_twister_engine"** %eng.addr, align 4
  %1 = load i32* %min_value.addr, align 4
  %2 = load i32* %max_value.addr, align 4
  %3 = bitcast %"struct.boost::is_integral"* %ref.tmp to %"struct.mpl_::bool_"*
  %call = call i32 @_ZN5boost6random6detail20generate_uniform_intINS0_23mersenne_twister_engineIjLj32ELj624ELj397ELj31ELj2567483615ELj11ELj4294967295ELj7ELj2636928640ELj15ELj4022730752ELj18ELj1812433253EEEiEET0_RT_S5_S5_N4mpl_5bool_ILb1EEE(%"class.boost::random::mersenne_twister_engine"* %0, i32 %1, i32 %2)
  ret i32 %call
}

define linkonce_odr i32 @_ZN5boost6random6detail20generate_uniform_intINS0_23mersenne_twister_engineIjLj32ELj624ELj397ELj31ELj2567483615ELj11ELj4294967295ELj7ELj2636928640ELj15ELj4022730752ELj18ELj1812433253EEEiEET0_RT_S5_S5_N4mpl_5bool_ILb1EEE(%"class.boost::random::mersenne_twister_engine"* %eng, i32 %min_value, i32 %max_value) {
entry:
  %retval = alloca i32, align 4
  %eng.addr = alloca %"class.boost::random::mersenne_twister_engine"*, align 4
  %min_value.addr = alloca i32, align 4
  %max_value.addr = alloca i32, align 4
  %0 = alloca %"struct.mpl_::bool_", align 1
  %range = alloca i32, align 4
  %tmp = alloca %"struct.boost::random::detail::subtract", align 1
  %bmin = alloca i32, align 4
  %brange = alloca i32, align 4
  %tmp4 = alloca %"struct.boost::random::detail::subtract.16", align 1
  %v = alloca i32, align 4
  %tmp11 = alloca %"struct.boost::random::detail::subtract.16", align 1
  %tmp14 = alloca %"struct.boost::random::detail::add", align 1
  %limit = alloca i32, align 4
  %result = alloca i32, align 4
  %mult = alloca i32, align 4
  %tmp34 = alloca %"struct.boost::random::detail::subtract.16", align 1
  %result_increment = alloca i32, align 4
  %agg.tmp = alloca %"struct.mpl_::bool_", align 1
  %tmp61 = alloca %"struct.boost::random::detail::add", align 1
  %bucket_size = alloca i32, align 4
  %result83 = alloca i32, align 4
  %tmp84 = alloca %"struct.boost::random::detail::subtract.16", align 1
  %tmp90 = alloca %"struct.boost::random::detail::add", align 1
  store %"class.boost::random::mersenne_twister_engine"* %eng, %"class.boost::random::mersenne_twister_engine"** %eng.addr, align 4
  store i32 %min_value, i32* %min_value.addr, align 4
  store i32 %max_value, i32* %max_value.addr, align 4
  %1 = load i32* %max_value.addr, align 4
  %2 = load i32* %min_value.addr, align 4
  %call = call i32 @_ZN5boost6random6detail8subtractIiLb1EEclEii(%"struct.boost::random::detail::subtract"* %tmp, i32 %1, i32 %2)
  store i32 %call, i32* %range, align 4
  %3 = load %"class.boost::random::mersenne_twister_engine"** %eng.addr, align 4
  %call2 = call i32 @_ZN5boost6random23mersenne_twister_engineIjLj32ELj624ELj397ELj31ELj2567483615ELj11ELj4294967295ELj7ELj2636928640ELj15ELj4022730752ELj18ELj1812433253EE3minEv()
  store i32 %call2, i32* %bmin, align 4
  %4 = load %"class.boost::random::mersenne_twister_engine"** %eng.addr, align 4
  %call5 = call i32 @_ZN5boost6random23mersenne_twister_engineIjLj32ELj624ELj397ELj31ELj2567483615ELj11ELj4294967295ELj7ELj2636928640ELj15ELj4022730752ELj18ELj1812433253EE3maxEv()
  %5 = load %"class.boost::random::mersenne_twister_engine"** %eng.addr, align 4
  %call6 = call i32 @_ZN5boost6random23mersenne_twister_engineIjLj32ELj624ELj397ELj31ELj2567483615ELj11ELj4294967295ELj7ELj2636928640ELj15ELj4022730752ELj18ELj1812433253EE3minEv()
  %call7 = call i32 @_ZN5boost6random6detail8subtractIjLb0EEclEjj(%"struct.boost::random::detail::subtract.16"* %tmp4, i32 %call5, i32 %call6)
  store i32 %call7, i32* %brange, align 4
  %6 = load i32* %range, align 4
  %cmp = icmp eq i32 %6, 0
  br i1 %cmp, label %if.then, label %if.else

if.then:                                          ; preds = %entry
  %7 = load i32* %min_value.addr, align 4
  store i32 %7, i32* %retval
  br label %return

if.else:                                          ; preds = %entry
  %8 = load i32* %brange, align 4
  %9 = load i32* %range, align 4
  %cmp8 = icmp eq i32 %8, %9
  br i1 %cmp8, label %if.then9, label %if.else16

if.then9:                                         ; preds = %if.else
  %10 = load %"class.boost::random::mersenne_twister_engine"** %eng.addr, align 4
  %call12 = call i32 @_ZN5boost6random23mersenne_twister_engineIjLj32ELj624ELj397ELj31ELj2567483615ELj11ELj4294967295ELj7ELj2636928640ELj15ELj4022730752ELj18ELj1812433253EEclEv(%"class.boost::random::mersenne_twister_engine"* %10)
  %11 = load i32* %bmin, align 4
  %call13 = call i32 @_ZN5boost6random6detail8subtractIjLb0EEclEjj(%"struct.boost::random::detail::subtract.16"* %tmp11, i32 %call12, i32 %11)
  store i32 %call13, i32* %v, align 4
  %12 = load i32* %v, align 4
  %13 = load i32* %min_value.addr, align 4
  %call15 = call i32 @_ZN5boost6random6detail3addIjiLb1EEclEji(%"struct.boost::random::detail::add"* %tmp14, i32 %12, i32 %13)
  store i32 %call15, i32* %retval
  br label %return

if.else16:                                        ; preds = %if.else
  %14 = load i32* %brange, align 4
  %15 = load i32* %range, align 4
  %cmp17 = icmp ult i32 %14, %15
  br i1 %cmp17, label %if.then18, label %if.else63

if.then18:                                        ; preds = %if.else16
  br label %for.cond

for.cond:                                         ; preds = %if.then59, %if.then56, %if.then51, %if.then18
  %16 = load i32* %range, align 4
  %call20 = call i32 @_ZNSt14numeric_limitsIjE3maxEv() nounwind
  %cmp21 = icmp eq i32 %16, %call20
  br i1 %cmp21, label %if.then22, label %if.else26

if.then22:                                        ; preds = %for.cond
  %17 = load i32* %range, align 4
  %18 = load i32* %brange, align 4
  %add = add i32 %18, 1
  %div = udiv i32 %17, %add
  store i32 %div, i32* %limit, align 4
  %19 = load i32* %range, align 4
  %20 = load i32* %brange, align 4
  %add23 = add i32 %20, 1
  %rem = urem i32 %19, %add23
  %21 = load i32* %brange, align 4
  %cmp24 = icmp eq i32 %rem, %21
  br i1 %cmp24, label %if.then25, label %if.end

if.then25:                                        ; preds = %if.then22
  %22 = load i32* %limit, align 4
  %inc = add i32 %22, 1
  store i32 %inc, i32* %limit, align 4
  br label %if.end

if.end:                                           ; preds = %if.then25, %if.then22
  br label %if.end30

if.else26:                                        ; preds = %for.cond
  %23 = load i32* %range, align 4
  %add27 = add i32 %23, 1
  %24 = load i32* %brange, align 4
  %add28 = add i32 %24, 1
  %div29 = udiv i32 %add27, %add28
  store i32 %div29, i32* %limit, align 4
  br label %if.end30

if.end30:                                         ; preds = %if.else26, %if.end
  store i32 0, i32* %result, align 4
  store i32 1, i32* %mult, align 4
  br label %while.cond

while.cond:                                       ; preds = %if.end42, %if.end30
  %25 = load i32* %mult, align 4
  %26 = load i32* %limit, align 4
  %cmp33 = icmp ule i32 %25, %26
  br i1 %cmp33, label %while.body, label %while.end

while.body:                                       ; preds = %while.cond
  %27 = load %"class.boost::random::mersenne_twister_engine"** %eng.addr, align 4
  %call35 = call i32 @_ZN5boost6random23mersenne_twister_engineIjLj32ELj624ELj397ELj31ELj2567483615ELj11ELj4294967295ELj7ELj2636928640ELj15ELj4022730752ELj18ELj1812433253EEclEv(%"class.boost::random::mersenne_twister_engine"* %27)
  %28 = load i32* %bmin, align 4
  %call36 = call i32 @_ZN5boost6random6detail8subtractIjLb0EEclEjj(%"struct.boost::random::detail::subtract.16"* %tmp34, i32 %call35, i32 %28)
  %29 = load i32* %mult, align 4
  %mul = mul i32 %call36, %29
  %30 = load i32* %result, align 4
  %add37 = add i32 %30, %mul
  store i32 %add37, i32* %result, align 4
  %31 = load i32* %mult, align 4
  %32 = load i32* %brange, align 4
  %mul38 = mul i32 %31, %32
  %33 = load i32* %range, align 4
  %34 = load i32* %mult, align 4
  %sub = sub i32 %33, %34
  %add39 = add i32 %sub, 1
  %cmp40 = icmp eq i32 %mul38, %add39
  br i1 %cmp40, label %if.then41, label %if.end42

if.then41:                                        ; preds = %while.body
  %35 = load i32* %result, align 4
  store i32 %35, i32* %retval
  br label %return

if.end42:                                         ; preds = %while.body
  %36 = load i32* %brange, align 4
  %add43 = add i32 %36, 1
  %37 = load i32* %mult, align 4
  %mul44 = mul i32 %37, %add43
  store i32 %mul44, i32* %mult, align 4
  br label %while.cond

while.end:                                        ; preds = %while.cond
  %38 = load %"class.boost::random::mersenne_twister_engine"** %eng.addr, align 4
  %39 = load i32* %range, align 4
  %40 = load i32* %mult, align 4
  %div46 = udiv i32 %39, %40
  %call47 = call i32 @_ZN5boost6random6detail20generate_uniform_intINS0_23mersenne_twister_engineIjLj32ELj624ELj397ELj31ELj2567483615ELj11ELj4294967295ELj7ELj2636928640ELj15ELj4022730752ELj18ELj1812433253EEEjEET0_RT_S5_S5_N4mpl_5bool_ILb1EEE(%"class.boost::random::mersenne_twister_engine"* %38, i32 0, i32 %div46)
  store i32 %call47, i32* %result_increment, align 4
  %call48 = call i32 @_ZNSt14numeric_limitsIjE3maxEv() nounwind
  %41 = load i32* %mult, align 4
  %div49 = udiv i32 %call48, %41
  %42 = load i32* %result_increment, align 4
  %cmp50 = icmp ult i32 %div49, %42
  br i1 %cmp50, label %if.then51, label %if.end52

if.then51:                                        ; preds = %while.end
  br label %for.cond

if.end52:                                         ; preds = %while.end
  %43 = load i32* %mult, align 4
  %44 = load i32* %result_increment, align 4
  %mul53 = mul i32 %44, %43
  store i32 %mul53, i32* %result_increment, align 4
  %45 = load i32* %result_increment, align 4
  %46 = load i32* %result, align 4
  %add54 = add i32 %46, %45
  store i32 %add54, i32* %result, align 4
  %47 = load i32* %result, align 4
  %48 = load i32* %result_increment, align 4
  %cmp55 = icmp ult i32 %47, %48
  br i1 %cmp55, label %if.then56, label %if.end57

if.then56:                                        ; preds = %if.end52
  br label %for.cond

if.end57:                                         ; preds = %if.end52
  %49 = load i32* %result, align 4
  %50 = load i32* %range, align 4
  %cmp58 = icmp ugt i32 %49, %50
  br i1 %cmp58, label %if.then59, label %if.end60

if.then59:                                        ; preds = %if.end57
  br label %for.cond

if.end60:                                         ; preds = %if.end57
  %51 = load i32* %result, align 4
  %52 = load i32* %min_value.addr, align 4
  %call62 = call i32 @_ZN5boost6random6detail3addIjiLb1EEclEji(%"struct.boost::random::detail::add"* %tmp61, i32 %51, i32 %52)
  store i32 %call62, i32* %retval
  br label %return

if.else63:                                        ; preds = %if.else16
  %53 = load i32* %brange, align 4
  %call65 = call i32 @_ZNSt14numeric_limitsIjE3maxEv() nounwind
  %cmp66 = icmp eq i32 %53, %call65
  br i1 %cmp66, label %if.then67, label %if.else76

if.then67:                                        ; preds = %if.else63
  %54 = load i32* %brange, align 4
  %55 = load i32* %range, align 4
  %add68 = add i32 %55, 1
  %div69 = udiv i32 %54, %add68
  store i32 %div69, i32* %bucket_size, align 4
  %56 = load i32* %brange, align 4
  %57 = load i32* %range, align 4
  %add70 = add i32 %57, 1
  %rem71 = urem i32 %56, %add70
  %58 = load i32* %range, align 4
  %cmp72 = icmp eq i32 %rem71, %58
  br i1 %cmp72, label %if.then73, label %if.end75

if.then73:                                        ; preds = %if.then67
  %59 = load i32* %bucket_size, align 4
  %inc74 = add i32 %59, 1
  store i32 %inc74, i32* %bucket_size, align 4
  br label %if.end75

if.end75:                                         ; preds = %if.then73, %if.then67
  br label %if.end80

if.else76:                                        ; preds = %if.else63
  %60 = load i32* %brange, align 4
  %add77 = add i32 %60, 1
  %61 = load i32* %range, align 4
  %add78 = add i32 %61, 1
  %div79 = udiv i32 %add77, %add78
  store i32 %div79, i32* %bucket_size, align 4
  br label %if.end80

if.end80:                                         ; preds = %if.else76, %if.end75
  br label %for.cond81

for.cond81:                                       ; preds = %if.end92, %if.end80
  %62 = load %"class.boost::random::mersenne_twister_engine"** %eng.addr, align 4
  %call85 = call i32 @_ZN5boost6random23mersenne_twister_engineIjLj32ELj624ELj397ELj31ELj2567483615ELj11ELj4294967295ELj7ELj2636928640ELj15ELj4022730752ELj18ELj1812433253EEclEv(%"class.boost::random::mersenne_twister_engine"* %62)
  %63 = load i32* %bmin, align 4
  %call86 = call i32 @_ZN5boost6random6detail8subtractIjLb0EEclEjj(%"struct.boost::random::detail::subtract.16"* %tmp84, i32 %call85, i32 %63)
  store i32 %call86, i32* %result83, align 4
  %64 = load i32* %bucket_size, align 4
  %65 = load i32* %result83, align 4
  %div87 = udiv i32 %65, %64
  store i32 %div87, i32* %result83, align 4
  %66 = load i32* %result83, align 4
  %67 = load i32* %range, align 4
  %cmp88 = icmp ule i32 %66, %67
  br i1 %cmp88, label %if.then89, label %if.end92

if.then89:                                        ; preds = %for.cond81
  %68 = load i32* %result83, align 4
  %69 = load i32* %min_value.addr, align 4
  %call91 = call i32 @_ZN5boost6random6detail3addIjiLb1EEclEji(%"struct.boost::random::detail::add"* %tmp90, i32 %68, i32 %69)
  store i32 %call91, i32* %retval
  br label %return

if.end92:                                         ; preds = %for.cond81
  br label %for.cond81

return:                                           ; preds = %if.then89, %if.end60, %if.then41, %if.then9, %if.then
  %70 = load i32* %retval
  ret i32 %70
}

define linkonce_odr i32 @_ZN5boost6random6detail8subtractIiLb1EEclEii(%"struct.boost::random::detail::subtract"* %this, i32 %x, i32 %y) nounwind align 2 {
entry:
  %retval = alloca i32, align 4
  %this.addr = alloca %"struct.boost::random::detail::subtract"*, align 4
  %x.addr = alloca i32, align 4
  %y.addr = alloca i32, align 4
  store %"struct.boost::random::detail::subtract"* %this, %"struct.boost::random::detail::subtract"** %this.addr, align 4
  store i32 %x, i32* %x.addr, align 4
  store i32 %y, i32* %y.addr, align 4
  %this1 = load %"struct.boost::random::detail::subtract"** %this.addr
  %0 = load i32* %y.addr, align 4
  %cmp = icmp sge i32 %0, 0
  br i1 %cmp, label %if.then, label %if.end

if.then:                                          ; preds = %entry
  %1 = load i32* %x.addr, align 4
  %2 = load i32* %y.addr, align 4
  %sub = sub i32 %1, %2
  store i32 %sub, i32* %retval
  br label %return

if.end:                                           ; preds = %entry
  %3 = load i32* %x.addr, align 4
  %cmp2 = icmp sge i32 %3, 0
  br i1 %cmp2, label %if.then3, label %if.end7

if.then3:                                         ; preds = %if.end
  %4 = load i32* %x.addr, align 4
  %5 = load i32* %y.addr, align 4
  %add = add nsw i32 %5, 1
  %sub4 = sub nsw i32 0, %add
  %add5 = add i32 %4, %sub4
  %add6 = add i32 %add5, 1
  store i32 %add6, i32* %retval
  br label %return

if.end7:                                          ; preds = %if.end
  %6 = load i32* %x.addr, align 4
  %7 = load i32* %y.addr, align 4
  %sub8 = sub nsw i32 %6, %7
  store i32 %sub8, i32* %retval
  br label %return

return:                                           ; preds = %if.end7, %if.then3, %if.then
  %8 = load i32* %retval
  ret i32 %8
}

define linkonce_odr i32 @_ZN5boost6random23mersenne_twister_engineIjLj32ELj624ELj397ELj31ELj2567483615ELj11ELj4294967295ELj7ELj2636928640ELj15ELj4022730752ELj18ELj1812433253EE3minEv() nounwind align 2 {
entry:
  ret i32 0
}

define linkonce_odr i32 @_ZN5boost6random6detail8subtractIjLb0EEclEjj(%"struct.boost::random::detail::subtract.16"* %this, i32 %x, i32 %y) nounwind align 2 {
entry:
  %this.addr = alloca %"struct.boost::random::detail::subtract.16"*, align 4
  %x.addr = alloca i32, align 4
  %y.addr = alloca i32, align 4
  store %"struct.boost::random::detail::subtract.16"* %this, %"struct.boost::random::detail::subtract.16"** %this.addr, align 4
  store i32 %x, i32* %x.addr, align 4
  store i32 %y, i32* %y.addr, align 4
  %this1 = load %"struct.boost::random::detail::subtract.16"** %this.addr
  %0 = load i32* %x.addr, align 4
  %1 = load i32* %y.addr, align 4
  %sub = sub i32 %0, %1
  ret i32 %sub
}

define linkonce_odr i32 @_ZN5boost6random23mersenne_twister_engineIjLj32ELj624ELj397ELj31ELj2567483615ELj11ELj4294967295ELj7ELj2636928640ELj15ELj4022730752ELj18ELj1812433253EE3maxEv() nounwind align 2 {
entry:
  ret i32 -1
}

define linkonce_odr i32 @_ZN5boost6random23mersenne_twister_engineIjLj32ELj624ELj397ELj31ELj2567483615ELj11ELj4294967295ELj7ELj2636928640ELj15ELj4022730752ELj18ELj1812433253EEclEv(%"class.boost::random::mersenne_twister_engine"* %this) align 2 {
entry:
  %this.addr = alloca %"class.boost::random::mersenne_twister_engine"*, align 4
  %z = alloca i32, align 4
  store %"class.boost::random::mersenne_twister_engine"* %this, %"class.boost::random::mersenne_twister_engine"** %this.addr, align 4
  %this1 = load %"class.boost::random::mersenne_twister_engine"** %this.addr
  %i = getelementptr inbounds %"class.boost::random::mersenne_twister_engine"* %this1, i32 0, i32 1
  %0 = load i32* %i, align 4
  %cmp = icmp eq i32 %0, 624
  br i1 %cmp, label %if.then, label %if.end

if.then:                                          ; preds = %entry
  call void @_ZN5boost6random23mersenne_twister_engineIjLj32ELj624ELj397ELj31ELj2567483615ELj11ELj4294967295ELj7ELj2636928640ELj15ELj4022730752ELj18ELj1812433253EE5twistEv(%"class.boost::random::mersenne_twister_engine"* %this1)
  br label %if.end

if.end:                                           ; preds = %if.then, %entry
  %i2 = getelementptr inbounds %"class.boost::random::mersenne_twister_engine"* %this1, i32 0, i32 1
  %1 = load i32* %i2, align 4
  %x = getelementptr inbounds %"class.boost::random::mersenne_twister_engine"* %this1, i32 0, i32 0
  %arrayidx = getelementptr inbounds [624 x i32]* %x, i32 0, i32 %1
  %2 = load i32* %arrayidx, align 4
  store i32 %2, i32* %z, align 4
  %i3 = getelementptr inbounds %"class.boost::random::mersenne_twister_engine"* %this1, i32 0, i32 1
  %3 = load i32* %i3, align 4
  %inc = add i32 %3, 1
  store i32 %inc, i32* %i3, align 4
  %4 = load i32* %z, align 4
  %shr = lshr i32 %4, 11
  %5 = load i32* %z, align 4
  %xor = xor i32 %5, %shr
  store i32 %xor, i32* %z, align 4
  %6 = load i32* %z, align 4
  %shl = shl i32 %6, 7
  %and = and i32 %shl, -1658038656
  %7 = load i32* %z, align 4
  %xor4 = xor i32 %7, %and
  store i32 %xor4, i32* %z, align 4
  %8 = load i32* %z, align 4
  %shl5 = shl i32 %8, 15
  %and6 = and i32 %shl5, -272236544
  %9 = load i32* %z, align 4
  %xor7 = xor i32 %9, %and6
  store i32 %xor7, i32* %z, align 4
  %10 = load i32* %z, align 4
  %shr8 = lshr i32 %10, 18
  %11 = load i32* %z, align 4
  %xor9 = xor i32 %11, %shr8
  store i32 %xor9, i32* %z, align 4
  %12 = load i32* %z, align 4
  ret i32 %12
}

define linkonce_odr i32 @_ZN5boost6random6detail3addIjiLb1EEclEji(%"struct.boost::random::detail::add"* %this, i32 %x, i32 %y) nounwind align 2 {
entry:
  %retval = alloca i32, align 4
  %this.addr = alloca %"struct.boost::random::detail::add"*, align 4
  %x.addr = alloca i32, align 4
  %y.addr = alloca i32, align 4
  store %"struct.boost::random::detail::add"* %this, %"struct.boost::random::detail::add"** %this.addr, align 4
  store i32 %x, i32* %x.addr, align 4
  store i32 %y, i32* %y.addr, align 4
  %this1 = load %"struct.boost::random::detail::add"** %this.addr
  %0 = load i32* %y.addr, align 4
  %cmp = icmp sge i32 %0, 0
  br i1 %cmp, label %if.then, label %if.end

if.then:                                          ; preds = %entry
  %1 = load i32* %x.addr, align 4
  %2 = load i32* %y.addr, align 4
  %add = add nsw i32 %1, %2
  store i32 %add, i32* %retval
  br label %return

if.end:                                           ; preds = %entry
  %3 = load i32* %x.addr, align 4
  %4 = load i32* %y.addr, align 4
  %add2 = add nsw i32 %4, 1
  %sub = sub nsw i32 0, %add2
  %cmp3 = icmp ugt i32 %3, %sub
  br i1 %cmp3, label %if.then4, label %if.end9

if.then4:                                         ; preds = %if.end
  %5 = load i32* %x.addr, align 4
  %6 = load i32* %y.addr, align 4
  %add5 = add nsw i32 %6, 1
  %sub6 = sub nsw i32 0, %add5
  %sub7 = sub i32 %5, %sub6
  %sub8 = sub i32 %sub7, 1
  store i32 %sub8, i32* %retval
  br label %return

if.end9:                                          ; preds = %if.end
  %7 = load i32* %x.addr, align 4
  %8 = load i32* %y.addr, align 4
  %add10 = add nsw i32 %7, %8
  store i32 %add10, i32* %retval
  br label %return

return:                                           ; preds = %if.end9, %if.then4, %if.then
  %9 = load i32* %retval
  ret i32 %9
}

define linkonce_odr i32 @_ZNSt14numeric_limitsIjE3maxEv() nounwind align 2 {
entry:
  ret i32 -1
}

define linkonce_odr i32 @_ZN5boost6random6detail20generate_uniform_intINS0_23mersenne_twister_engineIjLj32ELj624ELj397ELj31ELj2567483615ELj11ELj4294967295ELj7ELj2636928640ELj15ELj4022730752ELj18ELj1812433253EEEjEET0_RT_S5_S5_N4mpl_5bool_ILb1EEE(%"class.boost::random::mersenne_twister_engine"* %eng, i32 %min_value, i32 %max_value) {
entry:
  %retval = alloca i32, align 4
  %eng.addr = alloca %"class.boost::random::mersenne_twister_engine"*, align 4
  %min_value.addr = alloca i32, align 4
  %max_value.addr = alloca i32, align 4
  %0 = alloca %"struct.mpl_::bool_", align 1
  %range = alloca i32, align 4
  %tmp = alloca %"struct.boost::random::detail::subtract.16", align 1
  %bmin = alloca i32, align 4
  %brange = alloca i32, align 4
  %tmp4 = alloca %"struct.boost::random::detail::subtract.16", align 1
  %v = alloca i32, align 4
  %tmp11 = alloca %"struct.boost::random::detail::subtract.16", align 1
  %tmp14 = alloca %"struct.boost::random::detail::add.17", align 1
  %limit = alloca i32, align 4
  %result = alloca i32, align 4
  %mult = alloca i32, align 4
  %tmp34 = alloca %"struct.boost::random::detail::subtract.16", align 1
  %result_increment = alloca i32, align 4
  %agg.tmp = alloca %"struct.mpl_::bool_", align 1
  %tmp61 = alloca %"struct.boost::random::detail::add.17", align 1
  %bucket_size = alloca i32, align 4
  %result83 = alloca i32, align 4
  %tmp84 = alloca %"struct.boost::random::detail::subtract.16", align 1
  %tmp90 = alloca %"struct.boost::random::detail::add.17", align 1
  store %"class.boost::random::mersenne_twister_engine"* %eng, %"class.boost::random::mersenne_twister_engine"** %eng.addr, align 4
  store i32 %min_value, i32* %min_value.addr, align 4
  store i32 %max_value, i32* %max_value.addr, align 4
  %1 = load i32* %max_value.addr, align 4
  %2 = load i32* %min_value.addr, align 4
  %call = call i32 @_ZN5boost6random6detail8subtractIjLb0EEclEjj(%"struct.boost::random::detail::subtract.16"* %tmp, i32 %1, i32 %2)
  store i32 %call, i32* %range, align 4
  %3 = load %"class.boost::random::mersenne_twister_engine"** %eng.addr, align 4
  %call2 = call i32 @_ZN5boost6random23mersenne_twister_engineIjLj32ELj624ELj397ELj31ELj2567483615ELj11ELj4294967295ELj7ELj2636928640ELj15ELj4022730752ELj18ELj1812433253EE3minEv()
  store i32 %call2, i32* %bmin, align 4
  %4 = load %"class.boost::random::mersenne_twister_engine"** %eng.addr, align 4
  %call5 = call i32 @_ZN5boost6random23mersenne_twister_engineIjLj32ELj624ELj397ELj31ELj2567483615ELj11ELj4294967295ELj7ELj2636928640ELj15ELj4022730752ELj18ELj1812433253EE3maxEv()
  %5 = load %"class.boost::random::mersenne_twister_engine"** %eng.addr, align 4
  %call6 = call i32 @_ZN5boost6random23mersenne_twister_engineIjLj32ELj624ELj397ELj31ELj2567483615ELj11ELj4294967295ELj7ELj2636928640ELj15ELj4022730752ELj18ELj1812433253EE3minEv()
  %call7 = call i32 @_ZN5boost6random6detail8subtractIjLb0EEclEjj(%"struct.boost::random::detail::subtract.16"* %tmp4, i32 %call5, i32 %call6)
  store i32 %call7, i32* %brange, align 4
  %6 = load i32* %range, align 4
  %cmp = icmp eq i32 %6, 0
  br i1 %cmp, label %if.then, label %if.else

if.then:                                          ; preds = %entry
  %7 = load i32* %min_value.addr, align 4
  store i32 %7, i32* %retval
  br label %return

if.else:                                          ; preds = %entry
  %8 = load i32* %brange, align 4
  %9 = load i32* %range, align 4
  %cmp8 = icmp eq i32 %8, %9
  br i1 %cmp8, label %if.then9, label %if.else16

if.then9:                                         ; preds = %if.else
  %10 = load %"class.boost::random::mersenne_twister_engine"** %eng.addr, align 4
  %call12 = call i32 @_ZN5boost6random23mersenne_twister_engineIjLj32ELj624ELj397ELj31ELj2567483615ELj11ELj4294967295ELj7ELj2636928640ELj15ELj4022730752ELj18ELj1812433253EEclEv(%"class.boost::random::mersenne_twister_engine"* %10)
  %11 = load i32* %bmin, align 4
  %call13 = call i32 @_ZN5boost6random6detail8subtractIjLb0EEclEjj(%"struct.boost::random::detail::subtract.16"* %tmp11, i32 %call12, i32 %11)
  store i32 %call13, i32* %v, align 4
  %12 = load i32* %v, align 4
  %13 = load i32* %min_value.addr, align 4
  %call15 = call i32 @_ZN5boost6random6detail3addIjjLb0EEclEjj(%"struct.boost::random::detail::add.17"* %tmp14, i32 %12, i32 %13)
  store i32 %call15, i32* %retval
  br label %return

if.else16:                                        ; preds = %if.else
  %14 = load i32* %brange, align 4
  %15 = load i32* %range, align 4
  %cmp17 = icmp ult i32 %14, %15
  br i1 %cmp17, label %if.then18, label %if.else63

if.then18:                                        ; preds = %if.else16
  br label %for.cond

for.cond:                                         ; preds = %if.then59, %if.then56, %if.then51, %if.then18
  %16 = load i32* %range, align 4
  %call20 = call i32 @_ZNSt14numeric_limitsIjE3maxEv() nounwind
  %cmp21 = icmp eq i32 %16, %call20
  br i1 %cmp21, label %if.then22, label %if.else26

if.then22:                                        ; preds = %for.cond
  %17 = load i32* %range, align 4
  %18 = load i32* %brange, align 4
  %add = add i32 %18, 1
  %div = udiv i32 %17, %add
  store i32 %div, i32* %limit, align 4
  %19 = load i32* %range, align 4
  %20 = load i32* %brange, align 4
  %add23 = add i32 %20, 1
  %rem = urem i32 %19, %add23
  %21 = load i32* %brange, align 4
  %cmp24 = icmp eq i32 %rem, %21
  br i1 %cmp24, label %if.then25, label %if.end

if.then25:                                        ; preds = %if.then22
  %22 = load i32* %limit, align 4
  %inc = add i32 %22, 1
  store i32 %inc, i32* %limit, align 4
  br label %if.end

if.end:                                           ; preds = %if.then25, %if.then22
  br label %if.end30

if.else26:                                        ; preds = %for.cond
  %23 = load i32* %range, align 4
  %add27 = add i32 %23, 1
  %24 = load i32* %brange, align 4
  %add28 = add i32 %24, 1
  %div29 = udiv i32 %add27, %add28
  store i32 %div29, i32* %limit, align 4
  br label %if.end30

if.end30:                                         ; preds = %if.else26, %if.end
  store i32 0, i32* %result, align 4
  store i32 1, i32* %mult, align 4
  br label %while.cond

while.cond:                                       ; preds = %if.end42, %if.end30
  %25 = load i32* %mult, align 4
  %26 = load i32* %limit, align 4
  %cmp33 = icmp ule i32 %25, %26
  br i1 %cmp33, label %while.body, label %while.end

while.body:                                       ; preds = %while.cond
  %27 = load %"class.boost::random::mersenne_twister_engine"** %eng.addr, align 4
  %call35 = call i32 @_ZN5boost6random23mersenne_twister_engineIjLj32ELj624ELj397ELj31ELj2567483615ELj11ELj4294967295ELj7ELj2636928640ELj15ELj4022730752ELj18ELj1812433253EEclEv(%"class.boost::random::mersenne_twister_engine"* %27)
  %28 = load i32* %bmin, align 4
  %call36 = call i32 @_ZN5boost6random6detail8subtractIjLb0EEclEjj(%"struct.boost::random::detail::subtract.16"* %tmp34, i32 %call35, i32 %28)
  %29 = load i32* %mult, align 4
  %mul = mul i32 %call36, %29
  %30 = load i32* %result, align 4
  %add37 = add i32 %30, %mul
  store i32 %add37, i32* %result, align 4
  %31 = load i32* %mult, align 4
  %32 = load i32* %brange, align 4
  %mul38 = mul i32 %31, %32
  %33 = load i32* %range, align 4
  %34 = load i32* %mult, align 4
  %sub = sub i32 %33, %34
  %add39 = add i32 %sub, 1
  %cmp40 = icmp eq i32 %mul38, %add39
  br i1 %cmp40, label %if.then41, label %if.end42

if.then41:                                        ; preds = %while.body
  %35 = load i32* %result, align 4
  store i32 %35, i32* %retval
  br label %return

if.end42:                                         ; preds = %while.body
  %36 = load i32* %brange, align 4
  %add43 = add i32 %36, 1
  %37 = load i32* %mult, align 4
  %mul44 = mul i32 %37, %add43
  store i32 %mul44, i32* %mult, align 4
  br label %while.cond

while.end:                                        ; preds = %while.cond
  %38 = load %"class.boost::random::mersenne_twister_engine"** %eng.addr, align 4
  %39 = load i32* %range, align 4
  %40 = load i32* %mult, align 4
  %div46 = udiv i32 %39, %40
  %call47 = call i32 @_ZN5boost6random6detail20generate_uniform_intINS0_23mersenne_twister_engineIjLj32ELj624ELj397ELj31ELj2567483615ELj11ELj4294967295ELj7ELj2636928640ELj15ELj4022730752ELj18ELj1812433253EEEjEET0_RT_S5_S5_N4mpl_5bool_ILb1EEE(%"class.boost::random::mersenne_twister_engine"* %38, i32 0, i32 %div46)
  store i32 %call47, i32* %result_increment, align 4
  %call48 = call i32 @_ZNSt14numeric_limitsIjE3maxEv() nounwind
  %41 = load i32* %mult, align 4
  %div49 = udiv i32 %call48, %41
  %42 = load i32* %result_increment, align 4
  %cmp50 = icmp ult i32 %div49, %42
  br i1 %cmp50, label %if.then51, label %if.end52

if.then51:                                        ; preds = %while.end
  br label %for.cond

if.end52:                                         ; preds = %while.end
  %43 = load i32* %mult, align 4
  %44 = load i32* %result_increment, align 4
  %mul53 = mul i32 %44, %43
  store i32 %mul53, i32* %result_increment, align 4
  %45 = load i32* %result_increment, align 4
  %46 = load i32* %result, align 4
  %add54 = add i32 %46, %45
  store i32 %add54, i32* %result, align 4
  %47 = load i32* %result, align 4
  %48 = load i32* %result_increment, align 4
  %cmp55 = icmp ult i32 %47, %48
  br i1 %cmp55, label %if.then56, label %if.end57

if.then56:                                        ; preds = %if.end52
  br label %for.cond

if.end57:                                         ; preds = %if.end52
  %49 = load i32* %result, align 4
  %50 = load i32* %range, align 4
  %cmp58 = icmp ugt i32 %49, %50
  br i1 %cmp58, label %if.then59, label %if.end60

if.then59:                                        ; preds = %if.end57
  br label %for.cond

if.end60:                                         ; preds = %if.end57
  %51 = load i32* %result, align 4
  %52 = load i32* %min_value.addr, align 4
  %call62 = call i32 @_ZN5boost6random6detail3addIjjLb0EEclEjj(%"struct.boost::random::detail::add.17"* %tmp61, i32 %51, i32 %52)
  store i32 %call62, i32* %retval
  br label %return

if.else63:                                        ; preds = %if.else16
  %53 = load i32* %brange, align 4
  %call65 = call i32 @_ZNSt14numeric_limitsIjE3maxEv() nounwind
  %cmp66 = icmp eq i32 %53, %call65
  br i1 %cmp66, label %if.then67, label %if.else76

if.then67:                                        ; preds = %if.else63
  %54 = load i32* %brange, align 4
  %55 = load i32* %range, align 4
  %add68 = add i32 %55, 1
  %div69 = udiv i32 %54, %add68
  store i32 %div69, i32* %bucket_size, align 4
  %56 = load i32* %brange, align 4
  %57 = load i32* %range, align 4
  %add70 = add i32 %57, 1
  %rem71 = urem i32 %56, %add70
  %58 = load i32* %range, align 4
  %cmp72 = icmp eq i32 %rem71, %58
  br i1 %cmp72, label %if.then73, label %if.end75

if.then73:                                        ; preds = %if.then67
  %59 = load i32* %bucket_size, align 4
  %inc74 = add i32 %59, 1
  store i32 %inc74, i32* %bucket_size, align 4
  br label %if.end75

if.end75:                                         ; preds = %if.then73, %if.then67
  br label %if.end80

if.else76:                                        ; preds = %if.else63
  %60 = load i32* %brange, align 4
  %add77 = add i32 %60, 1
  %61 = load i32* %range, align 4
  %add78 = add i32 %61, 1
  %div79 = udiv i32 %add77, %add78
  store i32 %div79, i32* %bucket_size, align 4
  br label %if.end80

if.end80:                                         ; preds = %if.else76, %if.end75
  br label %for.cond81

for.cond81:                                       ; preds = %if.end92, %if.end80
  %62 = load %"class.boost::random::mersenne_twister_engine"** %eng.addr, align 4
  %call85 = call i32 @_ZN5boost6random23mersenne_twister_engineIjLj32ELj624ELj397ELj31ELj2567483615ELj11ELj4294967295ELj7ELj2636928640ELj15ELj4022730752ELj18ELj1812433253EEclEv(%"class.boost::random::mersenne_twister_engine"* %62)
  %63 = load i32* %bmin, align 4
  %call86 = call i32 @_ZN5boost6random6detail8subtractIjLb0EEclEjj(%"struct.boost::random::detail::subtract.16"* %tmp84, i32 %call85, i32 %63)
  store i32 %call86, i32* %result83, align 4
  %64 = load i32* %bucket_size, align 4
  %65 = load i32* %result83, align 4
  %div87 = udiv i32 %65, %64
  store i32 %div87, i32* %result83, align 4
  %66 = load i32* %result83, align 4
  %67 = load i32* %range, align 4
  %cmp88 = icmp ule i32 %66, %67
  br i1 %cmp88, label %if.then89, label %if.end92

if.then89:                                        ; preds = %for.cond81
  %68 = load i32* %result83, align 4
  %69 = load i32* %min_value.addr, align 4
  %call91 = call i32 @_ZN5boost6random6detail3addIjjLb0EEclEjj(%"struct.boost::random::detail::add.17"* %tmp90, i32 %68, i32 %69)
  store i32 %call91, i32* %retval
  br label %return

if.end92:                                         ; preds = %for.cond81
  br label %for.cond81

return:                                           ; preds = %if.then89, %if.end60, %if.then41, %if.then9, %if.then
  %70 = load i32* %retval
  ret i32 %70
}

define linkonce_odr i32 @_ZN5boost6random6detail3addIjjLb0EEclEjj(%"struct.boost::random::detail::add.17"* %this, i32 %x, i32 %y) nounwind align 2 {
entry:
  %this.addr = alloca %"struct.boost::random::detail::add.17"*, align 4
  %x.addr = alloca i32, align 4
  %y.addr = alloca i32, align 4
  store %"struct.boost::random::detail::add.17"* %this, %"struct.boost::random::detail::add.17"** %this.addr, align 4
  store i32 %x, i32* %x.addr, align 4
  store i32 %y, i32* %y.addr, align 4
  %this1 = load %"struct.boost::random::detail::add.17"** %this.addr
  %0 = load i32* %x.addr, align 4
  %1 = load i32* %y.addr, align 4
  %add = add i32 %0, %1
  ret i32 %add
}

define linkonce_odr void @_ZN5boost6random23mersenne_twister_engineIjLj32ELj624ELj397ELj31ELj2567483615ELj11ELj4294967295ELj7ELj2636928640ELj15ELj4022730752ELj18ELj1812433253EE5twistEv(%"class.boost::random::mersenne_twister_engine"* %this) nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::random::mersenne_twister_engine"*, align 4
  %upper_mask = alloca i32, align 4
  %lower_mask = alloca i32, align 4
  %unroll_factor = alloca i32, align 4
  %unroll_extra1 = alloca i32, align 4
  %unroll_extra2 = alloca i32, align 4
  %j = alloca i32, align 4
  %y = alloca i32, align 4
  %j15 = alloca i32, align 4
  %y19 = alloca i32, align 4
  %j44 = alloca i32, align 4
  %y48 = alloca i32, align 4
  %j72 = alloca i32, align 4
  %y76 = alloca i32, align 4
  %y101 = alloca i32, align 4
  store %"class.boost::random::mersenne_twister_engine"* %this, %"class.boost::random::mersenne_twister_engine"** %this.addr, align 4
  %this1 = load %"class.boost::random::mersenne_twister_engine"** %this.addr
  store i32 -2147483648, i32* %upper_mask, align 4
  store i32 2147483647, i32* %lower_mask, align 4
  store i32 6, i32* %unroll_factor, align 4
  store i32 5, i32* %unroll_extra1, align 4
  store i32 0, i32* %unroll_extra2, align 4
  store i32 0, i32* %j, align 4
  br label %for.cond

for.cond:                                         ; preds = %for.inc, %entry
  %0 = load i32* %j, align 4
  %cmp = icmp ult i32 %0, 222
  br i1 %cmp, label %for.body, label %for.end

for.body:                                         ; preds = %for.cond
  %1 = load i32* %j, align 4
  %x = getelementptr inbounds %"class.boost::random::mersenne_twister_engine"* %this1, i32 0, i32 0
  %arrayidx = getelementptr inbounds [624 x i32]* %x, i32 0, i32 %1
  %2 = load i32* %arrayidx, align 4
  %and = and i32 %2, -2147483648
  %3 = load i32* %j, align 4
  %add = add i32 %3, 1
  %x2 = getelementptr inbounds %"class.boost::random::mersenne_twister_engine"* %this1, i32 0, i32 0
  %arrayidx3 = getelementptr inbounds [624 x i32]* %x2, i32 0, i32 %add
  %4 = load i32* %arrayidx3, align 4
  %and4 = and i32 %4, 2147483647
  %or = or i32 %and, %and4
  store i32 %or, i32* %y, align 4
  %5 = load i32* %j, align 4
  %add5 = add i32 %5, 397
  %x6 = getelementptr inbounds %"class.boost::random::mersenne_twister_engine"* %this1, i32 0, i32 0
  %arrayidx7 = getelementptr inbounds [624 x i32]* %x6, i32 0, i32 %add5
  %6 = load i32* %arrayidx7, align 4
  %7 = load i32* %y, align 4
  %shr = lshr i32 %7, 1
  %xor = xor i32 %6, %shr
  %8 = load i32* %j, align 4
  %add8 = add i32 %8, 1
  %x9 = getelementptr inbounds %"class.boost::random::mersenne_twister_engine"* %this1, i32 0, i32 0
  %arrayidx10 = getelementptr inbounds [624 x i32]* %x9, i32 0, i32 %add8
  %9 = load i32* %arrayidx10, align 4
  %and11 = and i32 %9, 1
  %mul = mul i32 %and11, -1727483681
  %xor12 = xor i32 %xor, %mul
  %10 = load i32* %j, align 4
  %x13 = getelementptr inbounds %"class.boost::random::mersenne_twister_engine"* %this1, i32 0, i32 0
  %arrayidx14 = getelementptr inbounds [624 x i32]* %x13, i32 0, i32 %10
  store i32 %xor12, i32* %arrayidx14, align 4
  br label %for.inc

for.inc:                                          ; preds = %for.body
  %11 = load i32* %j, align 4
  %inc = add i32 %11, 1
  store i32 %inc, i32* %j, align 4
  br label %for.cond

for.end:                                          ; preds = %for.cond
  store i32 222, i32* %j15, align 4
  br label %for.cond16

for.cond16:                                       ; preds = %for.inc41, %for.end
  %12 = load i32* %j15, align 4
  %cmp17 = icmp ult i32 %12, 227
  br i1 %cmp17, label %for.body18, label %for.end43

for.body18:                                       ; preds = %for.cond16
  %13 = load i32* %j15, align 4
  %x20 = getelementptr inbounds %"class.boost::random::mersenne_twister_engine"* %this1, i32 0, i32 0
  %arrayidx21 = getelementptr inbounds [624 x i32]* %x20, i32 0, i32 %13
  %14 = load i32* %arrayidx21, align 4
  %and22 = and i32 %14, -2147483648
  %15 = load i32* %j15, align 4
  %add23 = add i32 %15, 1
  %x24 = getelementptr inbounds %"class.boost::random::mersenne_twister_engine"* %this1, i32 0, i32 0
  %arrayidx25 = getelementptr inbounds [624 x i32]* %x24, i32 0, i32 %add23
  %16 = load i32* %arrayidx25, align 4
  %and26 = and i32 %16, 2147483647
  %or27 = or i32 %and22, %and26
  store i32 %or27, i32* %y19, align 4
  %17 = load i32* %j15, align 4
  %add28 = add i32 %17, 397
  %x29 = getelementptr inbounds %"class.boost::random::mersenne_twister_engine"* %this1, i32 0, i32 0
  %arrayidx30 = getelementptr inbounds [624 x i32]* %x29, i32 0, i32 %add28
  %18 = load i32* %arrayidx30, align 4
  %19 = load i32* %y19, align 4
  %shr31 = lshr i32 %19, 1
  %xor32 = xor i32 %18, %shr31
  %20 = load i32* %j15, align 4
  %add33 = add i32 %20, 1
  %x34 = getelementptr inbounds %"class.boost::random::mersenne_twister_engine"* %this1, i32 0, i32 0
  %arrayidx35 = getelementptr inbounds [624 x i32]* %x34, i32 0, i32 %add33
  %21 = load i32* %arrayidx35, align 4
  %and36 = and i32 %21, 1
  %mul37 = mul i32 %and36, -1727483681
  %xor38 = xor i32 %xor32, %mul37
  %22 = load i32* %j15, align 4
  %x39 = getelementptr inbounds %"class.boost::random::mersenne_twister_engine"* %this1, i32 0, i32 0
  %arrayidx40 = getelementptr inbounds [624 x i32]* %x39, i32 0, i32 %22
  store i32 %xor38, i32* %arrayidx40, align 4
  br label %for.inc41

for.inc41:                                        ; preds = %for.body18
  %23 = load i32* %j15, align 4
  %inc42 = add i32 %23, 1
  store i32 %inc42, i32* %j15, align 4
  br label %for.cond16

for.end43:                                        ; preds = %for.cond16
  store i32 227, i32* %j44, align 4
  br label %for.cond45

for.cond45:                                       ; preds = %for.inc69, %for.end43
  %24 = load i32* %j44, align 4
  %cmp46 = icmp ult i32 %24, 623
  br i1 %cmp46, label %for.body47, label %for.end71

for.body47:                                       ; preds = %for.cond45
  %25 = load i32* %j44, align 4
  %x49 = getelementptr inbounds %"class.boost::random::mersenne_twister_engine"* %this1, i32 0, i32 0
  %arrayidx50 = getelementptr inbounds [624 x i32]* %x49, i32 0, i32 %25
  %26 = load i32* %arrayidx50, align 4
  %and51 = and i32 %26, -2147483648
  %27 = load i32* %j44, align 4
  %add52 = add i32 %27, 1
  %x53 = getelementptr inbounds %"class.boost::random::mersenne_twister_engine"* %this1, i32 0, i32 0
  %arrayidx54 = getelementptr inbounds [624 x i32]* %x53, i32 0, i32 %add52
  %28 = load i32* %arrayidx54, align 4
  %and55 = and i32 %28, 2147483647
  %or56 = or i32 %and51, %and55
  store i32 %or56, i32* %y48, align 4
  %29 = load i32* %j44, align 4
  %sub = sub i32 %29, 227
  %x57 = getelementptr inbounds %"class.boost::random::mersenne_twister_engine"* %this1, i32 0, i32 0
  %arrayidx58 = getelementptr inbounds [624 x i32]* %x57, i32 0, i32 %sub
  %30 = load i32* %arrayidx58, align 4
  %31 = load i32* %y48, align 4
  %shr59 = lshr i32 %31, 1
  %xor60 = xor i32 %30, %shr59
  %32 = load i32* %j44, align 4
  %add61 = add i32 %32, 1
  %x62 = getelementptr inbounds %"class.boost::random::mersenne_twister_engine"* %this1, i32 0, i32 0
  %arrayidx63 = getelementptr inbounds [624 x i32]* %x62, i32 0, i32 %add61
  %33 = load i32* %arrayidx63, align 4
  %and64 = and i32 %33, 1
  %mul65 = mul i32 %and64, -1727483681
  %xor66 = xor i32 %xor60, %mul65
  %34 = load i32* %j44, align 4
  %x67 = getelementptr inbounds %"class.boost::random::mersenne_twister_engine"* %this1, i32 0, i32 0
  %arrayidx68 = getelementptr inbounds [624 x i32]* %x67, i32 0, i32 %34
  store i32 %xor66, i32* %arrayidx68, align 4
  br label %for.inc69

for.inc69:                                        ; preds = %for.body47
  %35 = load i32* %j44, align 4
  %inc70 = add i32 %35, 1
  store i32 %inc70, i32* %j44, align 4
  br label %for.cond45

for.end71:                                        ; preds = %for.cond45
  store i32 623, i32* %j72, align 4
  br label %for.cond73

for.cond73:                                       ; preds = %for.inc98, %for.end71
  %36 = load i32* %j72, align 4
  %cmp74 = icmp ult i32 %36, 623
  br i1 %cmp74, label %for.body75, label %for.end100

for.body75:                                       ; preds = %for.cond73
  %37 = load i32* %j72, align 4
  %x77 = getelementptr inbounds %"class.boost::random::mersenne_twister_engine"* %this1, i32 0, i32 0
  %arrayidx78 = getelementptr inbounds [624 x i32]* %x77, i32 0, i32 %37
  %38 = load i32* %arrayidx78, align 4
  %and79 = and i32 %38, -2147483648
  %39 = load i32* %j72, align 4
  %add80 = add i32 %39, 1
  %x81 = getelementptr inbounds %"class.boost::random::mersenne_twister_engine"* %this1, i32 0, i32 0
  %arrayidx82 = getelementptr inbounds [624 x i32]* %x81, i32 0, i32 %add80
  %40 = load i32* %arrayidx82, align 4
  %and83 = and i32 %40, 2147483647
  %or84 = or i32 %and79, %and83
  store i32 %or84, i32* %y76, align 4
  %41 = load i32* %j72, align 4
  %sub85 = sub i32 %41, 227
  %x86 = getelementptr inbounds %"class.boost::random::mersenne_twister_engine"* %this1, i32 0, i32 0
  %arrayidx87 = getelementptr inbounds [624 x i32]* %x86, i32 0, i32 %sub85
  %42 = load i32* %arrayidx87, align 4
  %43 = load i32* %y76, align 4
  %shr88 = lshr i32 %43, 1
  %xor89 = xor i32 %42, %shr88
  %44 = load i32* %j72, align 4
  %add90 = add i32 %44, 1
  %x91 = getelementptr inbounds %"class.boost::random::mersenne_twister_engine"* %this1, i32 0, i32 0
  %arrayidx92 = getelementptr inbounds [624 x i32]* %x91, i32 0, i32 %add90
  %45 = load i32* %arrayidx92, align 4
  %and93 = and i32 %45, 1
  %mul94 = mul i32 %and93, -1727483681
  %xor95 = xor i32 %xor89, %mul94
  %46 = load i32* %j72, align 4
  %x96 = getelementptr inbounds %"class.boost::random::mersenne_twister_engine"* %this1, i32 0, i32 0
  %arrayidx97 = getelementptr inbounds [624 x i32]* %x96, i32 0, i32 %46
  store i32 %xor95, i32* %arrayidx97, align 4
  br label %for.inc98

for.inc98:                                        ; preds = %for.body75
  %47 = load i32* %j72, align 4
  %inc99 = add i32 %47, 1
  store i32 %inc99, i32* %j72, align 4
  br label %for.cond73

for.end100:                                       ; preds = %for.cond73
  %x102 = getelementptr inbounds %"class.boost::random::mersenne_twister_engine"* %this1, i32 0, i32 0
  %arrayidx103 = getelementptr inbounds [624 x i32]* %x102, i32 0, i32 623
  %48 = load i32* %arrayidx103, align 4
  %and104 = and i32 %48, -2147483648
  %x105 = getelementptr inbounds %"class.boost::random::mersenne_twister_engine"* %this1, i32 0, i32 0
  %arrayidx106 = getelementptr inbounds [624 x i32]* %x105, i32 0, i32 0
  %49 = load i32* %arrayidx106, align 4
  %and107 = and i32 %49, 2147483647
  %or108 = or i32 %and104, %and107
  store i32 %or108, i32* %y101, align 4
  %x109 = getelementptr inbounds %"class.boost::random::mersenne_twister_engine"* %this1, i32 0, i32 0
  %arrayidx110 = getelementptr inbounds [624 x i32]* %x109, i32 0, i32 396
  %50 = load i32* %arrayidx110, align 4
  %51 = load i32* %y101, align 4
  %shr111 = lshr i32 %51, 1
  %xor112 = xor i32 %50, %shr111
  %x113 = getelementptr inbounds %"class.boost::random::mersenne_twister_engine"* %this1, i32 0, i32 0
  %arrayidx114 = getelementptr inbounds [624 x i32]* %x113, i32 0, i32 0
  %52 = load i32* %arrayidx114, align 4
  %and115 = and i32 %52, 1
  %mul116 = mul i32 %and115, -1727483681
  %xor117 = xor i32 %xor112, %mul116
  %x118 = getelementptr inbounds %"class.boost::random::mersenne_twister_engine"* %this1, i32 0, i32 0
  %arrayidx119 = getelementptr inbounds [624 x i32]* %x118, i32 0, i32 623
  store i32 %xor117, i32* %arrayidx119, align 4
  %i = getelementptr inbounds %"class.boost::random::mersenne_twister_engine"* %this1, i32 0, i32 1
  store i32 0, i32* %i, align 4
  ret void
}

declare i32 @rand() nounwind

define linkonce_odr void @_ZN5boost14fibonacci_heapIiNS_12indirect_cmpIPfSt4lessIfEEENS_27typed_identity_property_mapIjEEEC2EjRKS5_RKS7_(%"class.boost::fibonacci_heap"* %this, i32 %n, %"class.boost::indirect_cmp"* %cmp, %"struct.boost::typed_identity_property_map"* %id) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::fibonacci_heap"*, align 4
  %n.addr = alloca i32, align 4
  %cmp.addr = alloca %"class.boost::indirect_cmp"*, align 4
  %id.addr = alloca %"struct.boost::typed_identity_property_map"*, align 4
  %ref.tmp = alloca i32, align 4
  %ref.tmp2 = alloca %"class.std::allocator.2", align 1
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  %ref.tmp3 = alloca i32, align 4
  %ref.tmp4 = alloca %"class.std::allocator.7", align 1
  %ref.tmp7 = alloca i32, align 4
  %ref.tmp8 = alloca %"class.std::allocator.7", align 1
  %ref.tmp11 = alloca i32, align 4
  %ref.tmp12 = alloca %"class.std::allocator.7", align 1
  %ref.tmp15 = alloca i8, align 1
  %ref.tmp16 = alloca %"class.std::allocator.18", align 1
  %ref.tmp19 = alloca i32, align 4
  %ref.tmp20 = alloca %"class.std::allocator.7", align 1
  %ref.tmp23 = alloca i32, align 4
  %ref.tmp24 = alloca %"class.std::allocator.7", align 1
  %ref.tmp30 = alloca i32, align 4
  %ref.tmp31 = alloca %"class.std::allocator.7", align 1
  store %"class.boost::fibonacci_heap"* %this, %"class.boost::fibonacci_heap"** %this.addr, align 4
  store i32 %n, i32* %n.addr, align 4
  store %"class.boost::indirect_cmp"* %cmp, %"class.boost::indirect_cmp"** %cmp.addr, align 4
  store %"struct.boost::typed_identity_property_map"* %id, %"struct.boost::typed_identity_property_map"** %id.addr, align 4
  %this1 = load %"class.boost::fibonacci_heap"** %this.addr
  %_key = getelementptr inbounds %"class.boost::fibonacci_heap"* %this1, i32 0, i32 0
  %0 = load i32* %n.addr, align 4
  store i32 0, i32* %ref.tmp, align 4
  call void @_ZNSaIiEC1Ev(%"class.std::allocator.2"* %ref.tmp2) nounwind
  invoke void @_ZNSt6vectorIiSaIiEEC1EjRKiRKS0_(%"class.std::vector.0"* %_key, i32 %0, i32* %ref.tmp, %"class.std::allocator.2"* %ref.tmp2)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %entry
  call void @_ZNSaIiED1Ev(%"class.std::allocator.2"* %ref.tmp2) nounwind
  %_left = getelementptr inbounds %"class.boost::fibonacci_heap"* %this1, i32 0, i32 1
  %1 = load i32* %n.addr, align 4
  store i32 0, i32* %ref.tmp3, align 4
  call void @_ZNSaIjEC1Ev(%"class.std::allocator.7"* %ref.tmp4) nounwind
  invoke void @_ZNSt6vectorIjSaIjEEC1EjRKjRKS0_(%"class.std::vector.5"* %_left, i32 %1, i32* %ref.tmp3, %"class.std::allocator.7"* %ref.tmp4)
          to label %invoke.cont6 unwind label %lpad5

invoke.cont6:                                     ; preds = %invoke.cont
  call void @_ZNSaIjED1Ev(%"class.std::allocator.7"* %ref.tmp4) nounwind
  %_right = getelementptr inbounds %"class.boost::fibonacci_heap"* %this1, i32 0, i32 2
  %2 = load i32* %n.addr, align 4
  store i32 0, i32* %ref.tmp7, align 4
  call void @_ZNSaIjEC1Ev(%"class.std::allocator.7"* %ref.tmp8) nounwind
  invoke void @_ZNSt6vectorIjSaIjEEC1EjRKjRKS0_(%"class.std::vector.5"* %_right, i32 %2, i32* %ref.tmp7, %"class.std::allocator.7"* %ref.tmp8)
          to label %invoke.cont10 unwind label %lpad9

invoke.cont10:                                    ; preds = %invoke.cont6
  call void @_ZNSaIjED1Ev(%"class.std::allocator.7"* %ref.tmp8) nounwind
  %_p = getelementptr inbounds %"class.boost::fibonacci_heap"* %this1, i32 0, i32 3
  %3 = load i32* %n.addr, align 4
  store i32 0, i32* %ref.tmp11, align 4
  call void @_ZNSaIjEC1Ev(%"class.std::allocator.7"* %ref.tmp12) nounwind
  invoke void @_ZNSt6vectorIjSaIjEEC1EjRKjRKS0_(%"class.std::vector.5"* %_p, i32 %3, i32* %ref.tmp11, %"class.std::allocator.7"* %ref.tmp12)
          to label %invoke.cont14 unwind label %lpad13

invoke.cont14:                                    ; preds = %invoke.cont10
  call void @_ZNSaIjED1Ev(%"class.std::allocator.7"* %ref.tmp12) nounwind
  %_mark = getelementptr inbounds %"class.boost::fibonacci_heap"* %this1, i32 0, i32 4
  %4 = load i32* %n.addr, align 4
  store i8 0, i8* %ref.tmp15, align 1
  call void @_ZNSaIbEC1Ev(%"class.std::allocator.18"* %ref.tmp16) nounwind
  invoke void @_ZNSt6vectorIbSaIbEEC1EjRKbRKS0_(%"class.std::vector.10"* %_mark, i32 %4, i8* %ref.tmp15, %"class.std::allocator.18"* %ref.tmp16)
          to label %invoke.cont18 unwind label %lpad17

invoke.cont18:                                    ; preds = %invoke.cont14
  call void @_ZNSaIbED1Ev(%"class.std::allocator.18"* %ref.tmp16) nounwind
  %_degree = getelementptr inbounds %"class.boost::fibonacci_heap"* %this1, i32 0, i32 5
  %5 = load i32* %n.addr, align 4
  store i32 0, i32* %ref.tmp19, align 4
  call void @_ZNSaIjEC1Ev(%"class.std::allocator.7"* %ref.tmp20) nounwind
  invoke void @_ZNSt6vectorIjSaIjEEC1EjRKjRKS0_(%"class.std::vector.5"* %_degree, i32 %5, i32* %ref.tmp19, %"class.std::allocator.7"* %ref.tmp20)
          to label %invoke.cont22 unwind label %lpad21

invoke.cont22:                                    ; preds = %invoke.cont18
  call void @_ZNSaIjED1Ev(%"class.std::allocator.7"* %ref.tmp20) nounwind
  %_n = getelementptr inbounds %"class.boost::fibonacci_heap"* %this1, i32 0, i32 6
  store i32 0, i32* %_n, align 4
  %_root = getelementptr inbounds %"class.boost::fibonacci_heap"* %this1, i32 0, i32 7
  %6 = load i32* %n.addr, align 4
  store i32 %6, i32* %_root, align 4
  %_id = getelementptr inbounds %"class.boost::fibonacci_heap"* %this1, i32 0, i32 8
  %7 = load %"struct.boost::typed_identity_property_map"** %id.addr, align 4
  %_compare = getelementptr inbounds %"class.boost::fibonacci_heap"* %this1, i32 0, i32 9
  %8 = load %"class.boost::indirect_cmp"** %cmp.addr, align 4
  %9 = bitcast %"class.boost::indirect_cmp"* %_compare to i8*
  %10 = bitcast %"class.boost::indirect_cmp"* %8 to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %9, i8* %10, i32 8, i32 4, i1 false)
  %_child = getelementptr inbounds %"class.boost::fibonacci_heap"* %this1, i32 0, i32 10
  %11 = load i32* %n.addr, align 4
  store i32 0, i32* %ref.tmp23, align 4
  call void @_ZNSaIjEC1Ev(%"class.std::allocator.7"* %ref.tmp24) nounwind
  invoke void @_ZNSt6vectorIjSaIjEEC1EjRKjRKS0_(%"class.std::vector.5"* %_child, i32 %11, i32* %ref.tmp23, %"class.std::allocator.7"* %ref.tmp24)
          to label %invoke.cont26 unwind label %lpad25

invoke.cont26:                                    ; preds = %invoke.cont22
  call void @_ZNSaIjED1Ev(%"class.std::allocator.7"* %ref.tmp24) nounwind
  %new_roots = getelementptr inbounds %"class.boost::fibonacci_heap"* %this1, i32 0, i32 11
  %12 = load i32* %n.addr, align 4
  %conv = uitofp i32 %12 to float
  %call = invoke float @_ZSt3logf(float %conv)
          to label %invoke.cont28 unwind label %lpad27

invoke.cont28:                                    ; preds = %invoke.cont26
  %conv29 = fptoui float %call to i32
  %add = add i32 %conv29, 5
  store i32 0, i32* %ref.tmp30, align 4
  call void @_ZNSaIjEC1Ev(%"class.std::allocator.7"* %ref.tmp31) nounwind
  invoke void @_ZNSt6vectorIjSaIjEEC1EjRKjRKS0_(%"class.std::vector.5"* %new_roots, i32 %add, i32* %ref.tmp30, %"class.std::allocator.7"* %ref.tmp31)
          to label %invoke.cont33 unwind label %lpad32

invoke.cont33:                                    ; preds = %invoke.cont28
  call void @_ZNSaIjED1Ev(%"class.std::allocator.7"* %ref.tmp31) nounwind
  ret void

lpad:                                             ; preds = %entry
  %13 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %14 = extractvalue { i8*, i32 } %13, 0
  store i8* %14, i8** %exn.slot
  %15 = extractvalue { i8*, i32 } %13, 1
  store i32 %15, i32* %ehselector.slot
  call void @_ZNSaIiED1Ev(%"class.std::allocator.2"* %ref.tmp2) nounwind
  br label %eh.resume

lpad5:                                            ; preds = %invoke.cont
  %16 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %17 = extractvalue { i8*, i32 } %16, 0
  store i8* %17, i8** %exn.slot
  %18 = extractvalue { i8*, i32 } %16, 1
  store i32 %18, i32* %ehselector.slot
  call void @_ZNSaIjED1Ev(%"class.std::allocator.7"* %ref.tmp4) nounwind
  br label %ehcleanup45

lpad9:                                            ; preds = %invoke.cont6
  %19 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %20 = extractvalue { i8*, i32 } %19, 0
  store i8* %20, i8** %exn.slot
  %21 = extractvalue { i8*, i32 } %19, 1
  store i32 %21, i32* %ehselector.slot
  call void @_ZNSaIjED1Ev(%"class.std::allocator.7"* %ref.tmp8) nounwind
  br label %ehcleanup43

lpad13:                                           ; preds = %invoke.cont10
  %22 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %23 = extractvalue { i8*, i32 } %22, 0
  store i8* %23, i8** %exn.slot
  %24 = extractvalue { i8*, i32 } %22, 1
  store i32 %24, i32* %ehselector.slot
  call void @_ZNSaIjED1Ev(%"class.std::allocator.7"* %ref.tmp12) nounwind
  br label %ehcleanup41

lpad17:                                           ; preds = %invoke.cont14
  %25 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %26 = extractvalue { i8*, i32 } %25, 0
  store i8* %26, i8** %exn.slot
  %27 = extractvalue { i8*, i32 } %25, 1
  store i32 %27, i32* %ehselector.slot
  call void @_ZNSaIbED1Ev(%"class.std::allocator.18"* %ref.tmp16) nounwind
  br label %ehcleanup39

lpad21:                                           ; preds = %invoke.cont18
  %28 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %29 = extractvalue { i8*, i32 } %28, 0
  store i8* %29, i8** %exn.slot
  %30 = extractvalue { i8*, i32 } %28, 1
  store i32 %30, i32* %ehselector.slot
  call void @_ZNSaIjED1Ev(%"class.std::allocator.7"* %ref.tmp20) nounwind
  br label %ehcleanup37

lpad25:                                           ; preds = %invoke.cont22
  %31 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %32 = extractvalue { i8*, i32 } %31, 0
  store i8* %32, i8** %exn.slot
  %33 = extractvalue { i8*, i32 } %31, 1
  store i32 %33, i32* %ehselector.slot
  call void @_ZNSaIjED1Ev(%"class.std::allocator.7"* %ref.tmp24) nounwind
  br label %ehcleanup35

lpad27:                                           ; preds = %invoke.cont26
  %34 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %35 = extractvalue { i8*, i32 } %34, 0
  store i8* %35, i8** %exn.slot
  %36 = extractvalue { i8*, i32 } %34, 1
  store i32 %36, i32* %ehselector.slot
  br label %ehcleanup

lpad32:                                           ; preds = %invoke.cont28
  %37 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %38 = extractvalue { i8*, i32 } %37, 0
  store i8* %38, i8** %exn.slot
  %39 = extractvalue { i8*, i32 } %37, 1
  store i32 %39, i32* %ehselector.slot
  call void @_ZNSaIjED1Ev(%"class.std::allocator.7"* %ref.tmp31) nounwind
  br label %ehcleanup

ehcleanup:                                        ; preds = %lpad32, %lpad27
  invoke void @_ZNSt6vectorIjSaIjEED1Ev(%"class.std::vector.5"* %_child)
          to label %invoke.cont34 unwind label %terminate.lpad

invoke.cont34:                                    ; preds = %ehcleanup
  br label %ehcleanup35

ehcleanup35:                                      ; preds = %invoke.cont34, %lpad25
  invoke void @_ZNSt6vectorIjSaIjEED1Ev(%"class.std::vector.5"* %_degree)
          to label %invoke.cont36 unwind label %terminate.lpad

invoke.cont36:                                    ; preds = %ehcleanup35
  br label %ehcleanup37

ehcleanup37:                                      ; preds = %invoke.cont36, %lpad21
  invoke void @_ZNSt6vectorIbSaIbEED1Ev(%"class.std::vector.10"* %_mark)
          to label %invoke.cont38 unwind label %terminate.lpad

invoke.cont38:                                    ; preds = %ehcleanup37
  br label %ehcleanup39

ehcleanup39:                                      ; preds = %invoke.cont38, %lpad17
  invoke void @_ZNSt6vectorIjSaIjEED1Ev(%"class.std::vector.5"* %_p)
          to label %invoke.cont40 unwind label %terminate.lpad

invoke.cont40:                                    ; preds = %ehcleanup39
  br label %ehcleanup41

ehcleanup41:                                      ; preds = %invoke.cont40, %lpad13
  invoke void @_ZNSt6vectorIjSaIjEED1Ev(%"class.std::vector.5"* %_right)
          to label %invoke.cont42 unwind label %terminate.lpad

invoke.cont42:                                    ; preds = %ehcleanup41
  br label %ehcleanup43

ehcleanup43:                                      ; preds = %invoke.cont42, %lpad9
  invoke void @_ZNSt6vectorIjSaIjEED1Ev(%"class.std::vector.5"* %_left)
          to label %invoke.cont44 unwind label %terminate.lpad

invoke.cont44:                                    ; preds = %ehcleanup43
  br label %ehcleanup45

ehcleanup45:                                      ; preds = %invoke.cont44, %lpad5
  invoke void @_ZNSt6vectorIiSaIiEED1Ev(%"class.std::vector.0"* %_key)
          to label %invoke.cont46 unwind label %terminate.lpad

invoke.cont46:                                    ; preds = %ehcleanup45
  br label %eh.resume

eh.resume:                                        ; preds = %invoke.cont46, %lpad
  %exn = load i8** %exn.slot
  %sel = load i32* %ehselector.slot
  %lpad.val = insertvalue { i8*, i32 } undef, i8* %exn, 0
  %lpad.val47 = insertvalue { i8*, i32 } %lpad.val, i32 %sel, 1
  resume { i8*, i32 } %lpad.val47

terminate.lpad:                                   ; preds = %ehcleanup45, %ehcleanup43, %ehcleanup41, %ehcleanup39, %ehcleanup37, %ehcleanup35, %ehcleanup
  %40 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          catch i8* null
  call void @_ZSt9terminatev() noreturn nounwind
  unreachable
}

define linkonce_odr void @_ZNSt6vectorIiSaIiEEC1EjRKiRKS0_(%"class.std::vector.0"* %this, i32 %__n, i32* %__value, %"class.std::allocator.2"* %__a) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.std::vector.0"*, align 4
  %__n.addr = alloca i32, align 4
  %__value.addr = alloca i32*, align 4
  %__a.addr = alloca %"class.std::allocator.2"*, align 4
  store %"class.std::vector.0"* %this, %"class.std::vector.0"** %this.addr, align 4
  store i32 %__n, i32* %__n.addr, align 4
  store i32* %__value, i32** %__value.addr, align 4
  store %"class.std::allocator.2"* %__a, %"class.std::allocator.2"** %__a.addr, align 4
  %this1 = load %"class.std::vector.0"** %this.addr
  %0 = load i32* %__n.addr, align 4
  %1 = load i32** %__value.addr
  %2 = load %"class.std::allocator.2"** %__a.addr
  call void @_ZNSt6vectorIiSaIiEEC2EjRKiRKS0_(%"class.std::vector.0"* %this1, i32 %0, i32* %1, %"class.std::allocator.2"* %2)
  ret void
}

define linkonce_odr void @_ZNSaIiEC1Ev(%"class.std::allocator.2"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.std::allocator.2"*, align 4
  store %"class.std::allocator.2"* %this, %"class.std::allocator.2"** %this.addr, align 4
  %this1 = load %"class.std::allocator.2"** %this.addr
  call void @_ZNSaIiEC2Ev(%"class.std::allocator.2"* %this1) nounwind
  ret void
}

define linkonce_odr void @_ZNSaIiED1Ev(%"class.std::allocator.2"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.std::allocator.2"*, align 4
  store %"class.std::allocator.2"* %this, %"class.std::allocator.2"** %this.addr, align 4
  %this1 = load %"class.std::allocator.2"** %this.addr
  call void @_ZNSaIiED2Ev(%"class.std::allocator.2"* %this1) nounwind
  ret void
}

define linkonce_odr void @_ZNSt6vectorIjSaIjEEC1EjRKjRKS0_(%"class.std::vector.5"* %this, i32 %__n, i32* %__value, %"class.std::allocator.7"* %__a) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.std::vector.5"*, align 4
  %__n.addr = alloca i32, align 4
  %__value.addr = alloca i32*, align 4
  %__a.addr = alloca %"class.std::allocator.7"*, align 4
  store %"class.std::vector.5"* %this, %"class.std::vector.5"** %this.addr, align 4
  store i32 %__n, i32* %__n.addr, align 4
  store i32* %__value, i32** %__value.addr, align 4
  store %"class.std::allocator.7"* %__a, %"class.std::allocator.7"** %__a.addr, align 4
  %this1 = load %"class.std::vector.5"** %this.addr
  %0 = load i32* %__n.addr, align 4
  %1 = load i32** %__value.addr
  %2 = load %"class.std::allocator.7"** %__a.addr
  call void @_ZNSt6vectorIjSaIjEEC2EjRKjRKS0_(%"class.std::vector.5"* %this1, i32 %0, i32* %1, %"class.std::allocator.7"* %2)
  ret void
}

define linkonce_odr void @_ZNSaIjEC1Ev(%"class.std::allocator.7"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.std::allocator.7"*, align 4
  store %"class.std::allocator.7"* %this, %"class.std::allocator.7"** %this.addr, align 4
  %this1 = load %"class.std::allocator.7"** %this.addr
  call void @_ZNSaIjEC2Ev(%"class.std::allocator.7"* %this1) nounwind
  ret void
}

define linkonce_odr void @_ZNSaIjED1Ev(%"class.std::allocator.7"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.std::allocator.7"*, align 4
  store %"class.std::allocator.7"* %this, %"class.std::allocator.7"** %this.addr, align 4
  %this1 = load %"class.std::allocator.7"** %this.addr
  call void @_ZNSaIjED2Ev(%"class.std::allocator.7"* %this1) nounwind
  ret void
}

define linkonce_odr void @_ZNSt6vectorIbSaIbEEC1EjRKbRKS0_(%"class.std::vector.10"* %this, i32 %__n, i8* %__value, %"class.std::allocator.18"* %__a) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.std::vector.10"*, align 4
  %__n.addr = alloca i32, align 4
  %__value.addr = alloca i8*, align 4
  %__a.addr = alloca %"class.std::allocator.18"*, align 4
  store %"class.std::vector.10"* %this, %"class.std::vector.10"** %this.addr, align 4
  store i32 %__n, i32* %__n.addr, align 4
  store i8* %__value, i8** %__value.addr, align 4
  store %"class.std::allocator.18"* %__a, %"class.std::allocator.18"** %__a.addr, align 4
  %this1 = load %"class.std::vector.10"** %this.addr
  %0 = load i32* %__n.addr, align 4
  %1 = load i8** %__value.addr
  %2 = load %"class.std::allocator.18"** %__a.addr
  call void @_ZNSt6vectorIbSaIbEEC2EjRKbRKS0_(%"class.std::vector.10"* %this1, i32 %0, i8* %1, %"class.std::allocator.18"* %2)
  ret void
}

define linkonce_odr void @_ZNSaIbEC1Ev(%"class.std::allocator.18"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.std::allocator.18"*, align 4
  store %"class.std::allocator.18"* %this, %"class.std::allocator.18"** %this.addr, align 4
  %this1 = load %"class.std::allocator.18"** %this.addr
  call void @_ZNSaIbEC2Ev(%"class.std::allocator.18"* %this1) nounwind
  ret void
}

define linkonce_odr void @_ZNSaIbED1Ev(%"class.std::allocator.18"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.std::allocator.18"*, align 4
  store %"class.std::allocator.18"* %this, %"class.std::allocator.18"** %this.addr, align 4
  %this1 = load %"class.std::allocator.18"** %this.addr
  call void @_ZNSaIbED2Ev(%"class.std::allocator.18"* %this1) nounwind
  ret void
}

define linkonce_odr float @_ZSt3logf(float %__x) nounwind inlinehint {
entry:
  %__x.addr = alloca float, align 4
  store float %__x, float* %__x.addr, align 4
  %0 = load float* %__x.addr, align 4
  %call = call float @logf(float %0) nounwind readnone
  ret float %call
}

define linkonce_odr void @_ZNSt6vectorIjSaIjEED1Ev(%"class.std::vector.5"* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.std::vector.5"*, align 4
  store %"class.std::vector.5"* %this, %"class.std::vector.5"** %this.addr, align 4
  %this1 = load %"class.std::vector.5"** %this.addr
  call void @_ZNSt6vectorIjSaIjEED2Ev(%"class.std::vector.5"* %this1)
  ret void
}

define linkonce_odr void @_ZNSt6vectorIbSaIbEED1Ev(%"class.std::vector.10"* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.std::vector.10"*, align 4
  store %"class.std::vector.10"* %this, %"class.std::vector.10"** %this.addr, align 4
  %this1 = load %"class.std::vector.10"** %this.addr
  call void @_ZNSt6vectorIbSaIbEED2Ev(%"class.std::vector.10"* %this1)
  ret void
}

define linkonce_odr void @_ZNSt6vectorIiSaIiEED1Ev(%"class.std::vector.0"* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.std::vector.0"*, align 4
  store %"class.std::vector.0"* %this, %"class.std::vector.0"** %this.addr, align 4
  %this1 = load %"class.std::vector.0"** %this.addr
  call void @_ZNSt6vectorIiSaIiEED2Ev(%"class.std::vector.0"* %this1)
  ret void
}

define linkonce_odr void @_ZNSt6vectorIiSaIiEED2Ev(%"class.std::vector.0"* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.std::vector.0"*, align 4
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  store %"class.std::vector.0"* %this, %"class.std::vector.0"** %this.addr, align 4
  %this1 = load %"class.std::vector.0"** %this.addr
  %0 = bitcast %"class.std::vector.0"* %this1 to %"struct.std::_Vector_base.1"*
  %_M_impl = getelementptr inbounds %"struct.std::_Vector_base.1"* %0, i32 0, i32 0
  %_M_start = getelementptr inbounds %"struct.std::_Vector_base<int, std::allocator<int> >::_Vector_impl"* %_M_impl, i32 0, i32 0
  %1 = load i32** %_M_start, align 4
  %2 = bitcast %"class.std::vector.0"* %this1 to %"struct.std::_Vector_base.1"*
  %_M_impl2 = getelementptr inbounds %"struct.std::_Vector_base.1"* %2, i32 0, i32 0
  %_M_finish = getelementptr inbounds %"struct.std::_Vector_base<int, std::allocator<int> >::_Vector_impl"* %_M_impl2, i32 0, i32 1
  %3 = load i32** %_M_finish, align 4
  %4 = bitcast %"class.std::vector.0"* %this1 to %"struct.std::_Vector_base.1"*
  %call = invoke %"class.std::allocator.2"* @_ZNSt12_Vector_baseIiSaIiEE19_M_get_Tp_allocatorEv(%"struct.std::_Vector_base.1"* %4)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %entry
  invoke void @_ZSt8_DestroyIPiiEvT_S1_RSaIT0_E(i32* %1, i32* %3, %"class.std::allocator.2"* %call)
          to label %invoke.cont3 unwind label %lpad

invoke.cont3:                                     ; preds = %invoke.cont
  %5 = bitcast %"class.std::vector.0"* %this1 to %"struct.std::_Vector_base.1"*
  call void @_ZNSt12_Vector_baseIiSaIiEED2Ev(%"struct.std::_Vector_base.1"* %5)
  ret void

lpad:                                             ; preds = %invoke.cont, %entry
  %6 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %7 = extractvalue { i8*, i32 } %6, 0
  store i8* %7, i8** %exn.slot
  %8 = extractvalue { i8*, i32 } %6, 1
  store i32 %8, i32* %ehselector.slot
  %9 = bitcast %"class.std::vector.0"* %this1 to %"struct.std::_Vector_base.1"*
  invoke void @_ZNSt12_Vector_baseIiSaIiEED2Ev(%"struct.std::_Vector_base.1"* %9)
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

define linkonce_odr void @_ZSt8_DestroyIPiiEvT_S1_RSaIT0_E(i32* %__first, i32* %__last, %"class.std::allocator.2"*) inlinehint {
entry:
  %__first.addr = alloca i32*, align 4
  %__last.addr = alloca i32*, align 4
  %.addr = alloca %"class.std::allocator.2"*, align 4
  store i32* %__first, i32** %__first.addr, align 4
  store i32* %__last, i32** %__last.addr, align 4
  store %"class.std::allocator.2"* %0, %"class.std::allocator.2"** %.addr, align 4
  %1 = load i32** %__first.addr, align 4
  %2 = load i32** %__last.addr, align 4
  call void @_ZSt8_DestroyIPiEvT_S1_(i32* %1, i32* %2)
  ret void
}

define linkonce_odr %"class.std::allocator.2"* @_ZNSt12_Vector_baseIiSaIiEE19_M_get_Tp_allocatorEv(%"struct.std::_Vector_base.1"* %this) nounwind align 2 {
entry:
  %this.addr = alloca %"struct.std::_Vector_base.1"*, align 4
  store %"struct.std::_Vector_base.1"* %this, %"struct.std::_Vector_base.1"** %this.addr, align 4
  %this1 = load %"struct.std::_Vector_base.1"** %this.addr
  %_M_impl = getelementptr inbounds %"struct.std::_Vector_base.1"* %this1, i32 0, i32 0
  %0 = bitcast %"struct.std::_Vector_base<int, std::allocator<int> >::_Vector_impl"* %_M_impl to %"class.std::allocator.2"*
  ret %"class.std::allocator.2"* %0
}

define linkonce_odr void @_ZNSt12_Vector_baseIiSaIiEED2Ev(%"struct.std::_Vector_base.1"* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"struct.std::_Vector_base.1"*, align 4
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  store %"struct.std::_Vector_base.1"* %this, %"struct.std::_Vector_base.1"** %this.addr, align 4
  %this1 = load %"struct.std::_Vector_base.1"** %this.addr
  %_M_impl = getelementptr inbounds %"struct.std::_Vector_base.1"* %this1, i32 0, i32 0
  %_M_start = getelementptr inbounds %"struct.std::_Vector_base<int, std::allocator<int> >::_Vector_impl"* %_M_impl, i32 0, i32 0
  %0 = load i32** %_M_start, align 4
  %_M_impl2 = getelementptr inbounds %"struct.std::_Vector_base.1"* %this1, i32 0, i32 0
  %_M_end_of_storage = getelementptr inbounds %"struct.std::_Vector_base<int, std::allocator<int> >::_Vector_impl"* %_M_impl2, i32 0, i32 2
  %1 = load i32** %_M_end_of_storage, align 4
  %_M_impl3 = getelementptr inbounds %"struct.std::_Vector_base.1"* %this1, i32 0, i32 0
  %_M_start4 = getelementptr inbounds %"struct.std::_Vector_base<int, std::allocator<int> >::_Vector_impl"* %_M_impl3, i32 0, i32 0
  %2 = load i32** %_M_start4, align 4
  %sub.ptr.lhs.cast = ptrtoint i32* %1 to i32
  %sub.ptr.rhs.cast = ptrtoint i32* %2 to i32
  %sub.ptr.sub = sub i32 %sub.ptr.lhs.cast, %sub.ptr.rhs.cast
  %sub.ptr.div = sdiv exact i32 %sub.ptr.sub, 4
  invoke void @_ZNSt12_Vector_baseIiSaIiEE13_M_deallocateEPij(%"struct.std::_Vector_base.1"* %this1, i32* %0, i32 %sub.ptr.div)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %entry
  %_M_impl5 = getelementptr inbounds %"struct.std::_Vector_base.1"* %this1, i32 0, i32 0
  call void @_ZNSt12_Vector_baseIiSaIiEE12_Vector_implD1Ev(%"struct.std::_Vector_base<int, std::allocator<int> >::_Vector_impl"* %_M_impl5) nounwind
  ret void

lpad:                                             ; preds = %entry
  %3 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %4 = extractvalue { i8*, i32 } %3, 0
  store i8* %4, i8** %exn.slot
  %5 = extractvalue { i8*, i32 } %3, 1
  store i32 %5, i32* %ehselector.slot
  %_M_impl6 = getelementptr inbounds %"struct.std::_Vector_base.1"* %this1, i32 0, i32 0
  call void @_ZNSt12_Vector_baseIiSaIiEE12_Vector_implD1Ev(%"struct.std::_Vector_base<int, std::allocator<int> >::_Vector_impl"* %_M_impl6) nounwind
  br label %eh.resume

eh.resume:                                        ; preds = %lpad
  %exn = load i8** %exn.slot
  %sel = load i32* %ehselector.slot
  %lpad.val = insertvalue { i8*, i32 } undef, i8* %exn, 0
  %lpad.val7 = insertvalue { i8*, i32 } %lpad.val, i32 %sel, 1
  resume { i8*, i32 } %lpad.val7
}

define linkonce_odr void @_ZNSt12_Vector_baseIiSaIiEE13_M_deallocateEPij(%"struct.std::_Vector_base.1"* %this, i32* %__p, i32 %__n) align 2 {
entry:
  %this.addr = alloca %"struct.std::_Vector_base.1"*, align 4
  %__p.addr = alloca i32*, align 4
  %__n.addr = alloca i32, align 4
  store %"struct.std::_Vector_base.1"* %this, %"struct.std::_Vector_base.1"** %this.addr, align 4
  store i32* %__p, i32** %__p.addr, align 4
  store i32 %__n, i32* %__n.addr, align 4
  %this1 = load %"struct.std::_Vector_base.1"** %this.addr
  %0 = load i32** %__p.addr, align 4
  %tobool = icmp ne i32* %0, null
  br i1 %tobool, label %if.then, label %if.end

if.then:                                          ; preds = %entry
  %_M_impl = getelementptr inbounds %"struct.std::_Vector_base.1"* %this1, i32 0, i32 0
  %1 = bitcast %"struct.std::_Vector_base<int, std::allocator<int> >::_Vector_impl"* %_M_impl to %"class.__gnu_cxx::new_allocator.3"*
  %2 = load i32** %__p.addr, align 4
  %3 = load i32* %__n.addr, align 4
  call void @_ZN9__gnu_cxx13new_allocatorIiE10deallocateEPij(%"class.__gnu_cxx::new_allocator.3"* %1, i32* %2, i32 %3)
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
  %0 = bitcast %"struct.std::_Vector_base<int, std::allocator<int> >::_Vector_impl"* %this1 to %"class.std::allocator.2"*
  call void @_ZNSaIiED2Ev(%"class.std::allocator.2"* %0) nounwind
  ret void
}

define linkonce_odr void @_ZNSaIiED2Ev(%"class.std::allocator.2"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.std::allocator.2"*, align 4
  store %"class.std::allocator.2"* %this, %"class.std::allocator.2"** %this.addr, align 4
  %this1 = load %"class.std::allocator.2"** %this.addr
  %0 = bitcast %"class.std::allocator.2"* %this1 to %"class.__gnu_cxx::new_allocator.3"*
  call void @_ZN9__gnu_cxx13new_allocatorIiED2Ev(%"class.__gnu_cxx::new_allocator.3"* %0) nounwind
  ret void
}

define linkonce_odr void @_ZN9__gnu_cxx13new_allocatorIiED2Ev(%"class.__gnu_cxx::new_allocator.3"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.__gnu_cxx::new_allocator.3"*, align 4
  store %"class.__gnu_cxx::new_allocator.3"* %this, %"class.__gnu_cxx::new_allocator.3"** %this.addr, align 4
  %this1 = load %"class.__gnu_cxx::new_allocator.3"** %this.addr
  ret void
}

define linkonce_odr void @_ZN9__gnu_cxx13new_allocatorIiE10deallocateEPij(%"class.__gnu_cxx::new_allocator.3"* %this, i32* %__p, i32) nounwind align 2 {
entry:
  %this.addr = alloca %"class.__gnu_cxx::new_allocator.3"*, align 4
  %__p.addr = alloca i32*, align 4
  %.addr = alloca i32, align 4
  store %"class.__gnu_cxx::new_allocator.3"* %this, %"class.__gnu_cxx::new_allocator.3"** %this.addr, align 4
  store i32* %__p, i32** %__p.addr, align 4
  store i32 %0, i32* %.addr, align 4
  %this1 = load %"class.__gnu_cxx::new_allocator.3"** %this.addr
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

define linkonce_odr void @_ZNSt6vectorIbSaIbEED2Ev(%"class.std::vector.10"* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.std::vector.10"*, align 4
  store %"class.std::vector.10"* %this, %"class.std::vector.10"** %this.addr, align 4
  %this1 = load %"class.std::vector.10"** %this.addr
  %0 = bitcast %"class.std::vector.10"* %this1 to %"struct.std::_Bvector_base"*
  call void @_ZNSt13_Bvector_baseISaIbEED2Ev(%"struct.std::_Bvector_base"* %0)
  ret void
}

define linkonce_odr void @_ZNSt13_Bvector_baseISaIbEED2Ev(%"struct.std::_Bvector_base"* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"struct.std::_Bvector_base"*, align 4
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  store %"struct.std::_Bvector_base"* %this, %"struct.std::_Bvector_base"** %this.addr, align 4
  %this1 = load %"struct.std::_Bvector_base"** %this.addr
  invoke void @_ZNSt13_Bvector_baseISaIbEE13_M_deallocateEv(%"struct.std::_Bvector_base"* %this1)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %entry
  %_M_impl = getelementptr inbounds %"struct.std::_Bvector_base"* %this1, i32 0, i32 0
  call void @_ZNSt13_Bvector_baseISaIbEE13_Bvector_implD1Ev(%"struct.std::_Bvector_base<std::allocator<bool> >::_Bvector_impl"* %_M_impl) nounwind
  ret void

lpad:                                             ; preds = %entry
  %0 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %1 = extractvalue { i8*, i32 } %0, 0
  store i8* %1, i8** %exn.slot
  %2 = extractvalue { i8*, i32 } %0, 1
  store i32 %2, i32* %ehselector.slot
  %_M_impl2 = getelementptr inbounds %"struct.std::_Bvector_base"* %this1, i32 0, i32 0
  call void @_ZNSt13_Bvector_baseISaIbEE13_Bvector_implD1Ev(%"struct.std::_Bvector_base<std::allocator<bool> >::_Bvector_impl"* %_M_impl2) nounwind
  br label %eh.resume

eh.resume:                                        ; preds = %lpad
  %exn = load i8** %exn.slot
  %sel = load i32* %ehselector.slot
  %lpad.val = insertvalue { i8*, i32 } undef, i8* %exn, 0
  %lpad.val3 = insertvalue { i8*, i32 } %lpad.val, i32 %sel, 1
  resume { i8*, i32 } %lpad.val3
}

define linkonce_odr void @_ZNSt13_Bvector_baseISaIbEE13_M_deallocateEv(%"struct.std::_Bvector_base"* %this) align 2 {
entry:
  %this.addr = alloca %"struct.std::_Bvector_base"*, align 4
  store %"struct.std::_Bvector_base"* %this, %"struct.std::_Bvector_base"** %this.addr, align 4
  %this1 = load %"struct.std::_Bvector_base"** %this.addr
  %_M_impl = getelementptr inbounds %"struct.std::_Bvector_base"* %this1, i32 0, i32 0
  %_M_start = getelementptr inbounds %"struct.std::_Bvector_base<std::allocator<bool> >::_Bvector_impl"* %_M_impl, i32 0, i32 0
  %0 = bitcast %"struct.std::_Bit_iterator"* %_M_start to %"struct.std::_Bit_iterator_base"*
  %_M_p = getelementptr inbounds %"struct.std::_Bit_iterator_base"* %0, i32 0, i32 0
  %1 = load i32** %_M_p, align 4
  %tobool = icmp ne i32* %1, null
  br i1 %tobool, label %if.then, label %if.end

if.then:                                          ; preds = %entry
  %_M_impl2 = getelementptr inbounds %"struct.std::_Bvector_base"* %this1, i32 0, i32 0
  %2 = bitcast %"struct.std::_Bvector_base<std::allocator<bool> >::_Bvector_impl"* %_M_impl2 to %"class.__gnu_cxx::new_allocator.12"*
  %_M_impl3 = getelementptr inbounds %"struct.std::_Bvector_base"* %this1, i32 0, i32 0
  %_M_start4 = getelementptr inbounds %"struct.std::_Bvector_base<std::allocator<bool> >::_Bvector_impl"* %_M_impl3, i32 0, i32 0
  %3 = bitcast %"struct.std::_Bit_iterator"* %_M_start4 to %"struct.std::_Bit_iterator_base"*
  %_M_p5 = getelementptr inbounds %"struct.std::_Bit_iterator_base"* %3, i32 0, i32 0
  %4 = load i32** %_M_p5, align 4
  %_M_impl6 = getelementptr inbounds %"struct.std::_Bvector_base"* %this1, i32 0, i32 0
  %_M_end_of_storage = getelementptr inbounds %"struct.std::_Bvector_base<std::allocator<bool> >::_Bvector_impl"* %_M_impl6, i32 0, i32 2
  %5 = load i32** %_M_end_of_storage, align 4
  %_M_impl7 = getelementptr inbounds %"struct.std::_Bvector_base"* %this1, i32 0, i32 0
  %_M_start8 = getelementptr inbounds %"struct.std::_Bvector_base<std::allocator<bool> >::_Bvector_impl"* %_M_impl7, i32 0, i32 0
  %6 = bitcast %"struct.std::_Bit_iterator"* %_M_start8 to %"struct.std::_Bit_iterator_base"*
  %_M_p9 = getelementptr inbounds %"struct.std::_Bit_iterator_base"* %6, i32 0, i32 0
  %7 = load i32** %_M_p9, align 4
  %sub.ptr.lhs.cast = ptrtoint i32* %5 to i32
  %sub.ptr.rhs.cast = ptrtoint i32* %7 to i32
  %sub.ptr.sub = sub i32 %sub.ptr.lhs.cast, %sub.ptr.rhs.cast
  %sub.ptr.div = sdiv exact i32 %sub.ptr.sub, 4
  call void @_ZN9__gnu_cxx13new_allocatorImE10deallocateEPmj(%"class.__gnu_cxx::new_allocator.12"* %2, i32* %4, i32 %sub.ptr.div)
  br label %if.end

if.end:                                           ; preds = %if.then, %entry
  ret void
}

define linkonce_odr void @_ZNSt13_Bvector_baseISaIbEE13_Bvector_implD1Ev(%"struct.std::_Bvector_base<std::allocator<bool> >::_Bvector_impl"* %this) unnamed_addr nounwind inlinehint align 2 {
entry:
  %this.addr = alloca %"struct.std::_Bvector_base<std::allocator<bool> >::_Bvector_impl"*, align 4
  store %"struct.std::_Bvector_base<std::allocator<bool> >::_Bvector_impl"* %this, %"struct.std::_Bvector_base<std::allocator<bool> >::_Bvector_impl"** %this.addr, align 4
  %this1 = load %"struct.std::_Bvector_base<std::allocator<bool> >::_Bvector_impl"** %this.addr
  call void @_ZNSt13_Bvector_baseISaIbEE13_Bvector_implD2Ev(%"struct.std::_Bvector_base<std::allocator<bool> >::_Bvector_impl"* %this1) nounwind
  ret void
}

define linkonce_odr void @_ZNSt13_Bvector_baseISaIbEE13_Bvector_implD2Ev(%"struct.std::_Bvector_base<std::allocator<bool> >::_Bvector_impl"* %this) unnamed_addr nounwind inlinehint align 2 {
entry:
  %this.addr = alloca %"struct.std::_Bvector_base<std::allocator<bool> >::_Bvector_impl"*, align 4
  store %"struct.std::_Bvector_base<std::allocator<bool> >::_Bvector_impl"* %this, %"struct.std::_Bvector_base<std::allocator<bool> >::_Bvector_impl"** %this.addr, align 4
  %this1 = load %"struct.std::_Bvector_base<std::allocator<bool> >::_Bvector_impl"** %this.addr
  %0 = bitcast %"struct.std::_Bvector_base<std::allocator<bool> >::_Bvector_impl"* %this1 to %"class.std::allocator.11"*
  call void @_ZNSaImED2Ev(%"class.std::allocator.11"* %0) nounwind
  ret void
}

define linkonce_odr void @_ZNSaImED2Ev(%"class.std::allocator.11"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.std::allocator.11"*, align 4
  store %"class.std::allocator.11"* %this, %"class.std::allocator.11"** %this.addr, align 4
  %this1 = load %"class.std::allocator.11"** %this.addr
  %0 = bitcast %"class.std::allocator.11"* %this1 to %"class.__gnu_cxx::new_allocator.12"*
  call void @_ZN9__gnu_cxx13new_allocatorImED2Ev(%"class.__gnu_cxx::new_allocator.12"* %0) nounwind
  ret void
}

define linkonce_odr void @_ZN9__gnu_cxx13new_allocatorImED2Ev(%"class.__gnu_cxx::new_allocator.12"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.__gnu_cxx::new_allocator.12"*, align 4
  store %"class.__gnu_cxx::new_allocator.12"* %this, %"class.__gnu_cxx::new_allocator.12"** %this.addr, align 4
  %this1 = load %"class.__gnu_cxx::new_allocator.12"** %this.addr
  ret void
}

define linkonce_odr void @_ZN9__gnu_cxx13new_allocatorImE10deallocateEPmj(%"class.__gnu_cxx::new_allocator.12"* %this, i32* %__p, i32) nounwind align 2 {
entry:
  %this.addr = alloca %"class.__gnu_cxx::new_allocator.12"*, align 4
  %__p.addr = alloca i32*, align 4
  %.addr = alloca i32, align 4
  store %"class.__gnu_cxx::new_allocator.12"* %this, %"class.__gnu_cxx::new_allocator.12"** %this.addr, align 4
  store i32* %__p, i32** %__p.addr, align 4
  store i32 %0, i32* %.addr, align 4
  %this1 = load %"class.__gnu_cxx::new_allocator.12"** %this.addr
  %1 = load i32** %__p.addr, align 4
  %2 = bitcast i32* %1 to i8*
  call void @_ZdlPv(i8* %2) nounwind
  ret void
}

define linkonce_odr void @_ZNSt6vectorIjSaIjEED2Ev(%"class.std::vector.5"* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.std::vector.5"*, align 4
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  store %"class.std::vector.5"* %this, %"class.std::vector.5"** %this.addr, align 4
  %this1 = load %"class.std::vector.5"** %this.addr
  %0 = bitcast %"class.std::vector.5"* %this1 to %"struct.std::_Vector_base.6"*
  %_M_impl = getelementptr inbounds %"struct.std::_Vector_base.6"* %0, i32 0, i32 0
  %_M_start = getelementptr inbounds %"struct.std::_Vector_base<unsigned int, std::allocator<unsigned int> >::_Vector_impl"* %_M_impl, i32 0, i32 0
  %1 = load i32** %_M_start, align 4
  %2 = bitcast %"class.std::vector.5"* %this1 to %"struct.std::_Vector_base.6"*
  %_M_impl2 = getelementptr inbounds %"struct.std::_Vector_base.6"* %2, i32 0, i32 0
  %_M_finish = getelementptr inbounds %"struct.std::_Vector_base<unsigned int, std::allocator<unsigned int> >::_Vector_impl"* %_M_impl2, i32 0, i32 1
  %3 = load i32** %_M_finish, align 4
  %4 = bitcast %"class.std::vector.5"* %this1 to %"struct.std::_Vector_base.6"*
  %call = invoke %"class.std::allocator.7"* @_ZNSt12_Vector_baseIjSaIjEE19_M_get_Tp_allocatorEv(%"struct.std::_Vector_base.6"* %4)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %entry
  invoke void @_ZSt8_DestroyIPjjEvT_S1_RSaIT0_E(i32* %1, i32* %3, %"class.std::allocator.7"* %call)
          to label %invoke.cont3 unwind label %lpad

invoke.cont3:                                     ; preds = %invoke.cont
  %5 = bitcast %"class.std::vector.5"* %this1 to %"struct.std::_Vector_base.6"*
  call void @_ZNSt12_Vector_baseIjSaIjEED2Ev(%"struct.std::_Vector_base.6"* %5)
  ret void

lpad:                                             ; preds = %invoke.cont, %entry
  %6 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %7 = extractvalue { i8*, i32 } %6, 0
  store i8* %7, i8** %exn.slot
  %8 = extractvalue { i8*, i32 } %6, 1
  store i32 %8, i32* %ehselector.slot
  %9 = bitcast %"class.std::vector.5"* %this1 to %"struct.std::_Vector_base.6"*
  invoke void @_ZNSt12_Vector_baseIjSaIjEED2Ev(%"struct.std::_Vector_base.6"* %9)
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

define linkonce_odr void @_ZSt8_DestroyIPjjEvT_S1_RSaIT0_E(i32* %__first, i32* %__last, %"class.std::allocator.7"*) inlinehint {
entry:
  %__first.addr = alloca i32*, align 4
  %__last.addr = alloca i32*, align 4
  %.addr = alloca %"class.std::allocator.7"*, align 4
  store i32* %__first, i32** %__first.addr, align 4
  store i32* %__last, i32** %__last.addr, align 4
  store %"class.std::allocator.7"* %0, %"class.std::allocator.7"** %.addr, align 4
  %1 = load i32** %__first.addr, align 4
  %2 = load i32** %__last.addr, align 4
  call void @_ZSt8_DestroyIPjEvT_S1_(i32* %1, i32* %2)
  ret void
}

define linkonce_odr %"class.std::allocator.7"* @_ZNSt12_Vector_baseIjSaIjEE19_M_get_Tp_allocatorEv(%"struct.std::_Vector_base.6"* %this) nounwind align 2 {
entry:
  %this.addr = alloca %"struct.std::_Vector_base.6"*, align 4
  store %"struct.std::_Vector_base.6"* %this, %"struct.std::_Vector_base.6"** %this.addr, align 4
  %this1 = load %"struct.std::_Vector_base.6"** %this.addr
  %_M_impl = getelementptr inbounds %"struct.std::_Vector_base.6"* %this1, i32 0, i32 0
  %0 = bitcast %"struct.std::_Vector_base<unsigned int, std::allocator<unsigned int> >::_Vector_impl"* %_M_impl to %"class.std::allocator.7"*
  ret %"class.std::allocator.7"* %0
}

define linkonce_odr void @_ZNSt12_Vector_baseIjSaIjEED2Ev(%"struct.std::_Vector_base.6"* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"struct.std::_Vector_base.6"*, align 4
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  store %"struct.std::_Vector_base.6"* %this, %"struct.std::_Vector_base.6"** %this.addr, align 4
  %this1 = load %"struct.std::_Vector_base.6"** %this.addr
  %_M_impl = getelementptr inbounds %"struct.std::_Vector_base.6"* %this1, i32 0, i32 0
  %_M_start = getelementptr inbounds %"struct.std::_Vector_base<unsigned int, std::allocator<unsigned int> >::_Vector_impl"* %_M_impl, i32 0, i32 0
  %0 = load i32** %_M_start, align 4
  %_M_impl2 = getelementptr inbounds %"struct.std::_Vector_base.6"* %this1, i32 0, i32 0
  %_M_end_of_storage = getelementptr inbounds %"struct.std::_Vector_base<unsigned int, std::allocator<unsigned int> >::_Vector_impl"* %_M_impl2, i32 0, i32 2
  %1 = load i32** %_M_end_of_storage, align 4
  %_M_impl3 = getelementptr inbounds %"struct.std::_Vector_base.6"* %this1, i32 0, i32 0
  %_M_start4 = getelementptr inbounds %"struct.std::_Vector_base<unsigned int, std::allocator<unsigned int> >::_Vector_impl"* %_M_impl3, i32 0, i32 0
  %2 = load i32** %_M_start4, align 4
  %sub.ptr.lhs.cast = ptrtoint i32* %1 to i32
  %sub.ptr.rhs.cast = ptrtoint i32* %2 to i32
  %sub.ptr.sub = sub i32 %sub.ptr.lhs.cast, %sub.ptr.rhs.cast
  %sub.ptr.div = sdiv exact i32 %sub.ptr.sub, 4
  invoke void @_ZNSt12_Vector_baseIjSaIjEE13_M_deallocateEPjj(%"struct.std::_Vector_base.6"* %this1, i32* %0, i32 %sub.ptr.div)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %entry
  %_M_impl5 = getelementptr inbounds %"struct.std::_Vector_base.6"* %this1, i32 0, i32 0
  call void @_ZNSt12_Vector_baseIjSaIjEE12_Vector_implD1Ev(%"struct.std::_Vector_base<unsigned int, std::allocator<unsigned int> >::_Vector_impl"* %_M_impl5) nounwind
  ret void

lpad:                                             ; preds = %entry
  %3 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %4 = extractvalue { i8*, i32 } %3, 0
  store i8* %4, i8** %exn.slot
  %5 = extractvalue { i8*, i32 } %3, 1
  store i32 %5, i32* %ehselector.slot
  %_M_impl6 = getelementptr inbounds %"struct.std::_Vector_base.6"* %this1, i32 0, i32 0
  call void @_ZNSt12_Vector_baseIjSaIjEE12_Vector_implD1Ev(%"struct.std::_Vector_base<unsigned int, std::allocator<unsigned int> >::_Vector_impl"* %_M_impl6) nounwind
  br label %eh.resume

eh.resume:                                        ; preds = %lpad
  %exn = load i8** %exn.slot
  %sel = load i32* %ehselector.slot
  %lpad.val = insertvalue { i8*, i32 } undef, i8* %exn, 0
  %lpad.val7 = insertvalue { i8*, i32 } %lpad.val, i32 %sel, 1
  resume { i8*, i32 } %lpad.val7
}

define linkonce_odr void @_ZNSt12_Vector_baseIjSaIjEE13_M_deallocateEPjj(%"struct.std::_Vector_base.6"* %this, i32* %__p, i32 %__n) align 2 {
entry:
  %this.addr = alloca %"struct.std::_Vector_base.6"*, align 4
  %__p.addr = alloca i32*, align 4
  %__n.addr = alloca i32, align 4
  store %"struct.std::_Vector_base.6"* %this, %"struct.std::_Vector_base.6"** %this.addr, align 4
  store i32* %__p, i32** %__p.addr, align 4
  store i32 %__n, i32* %__n.addr, align 4
  %this1 = load %"struct.std::_Vector_base.6"** %this.addr
  %0 = load i32** %__p.addr, align 4
  %tobool = icmp ne i32* %0, null
  br i1 %tobool, label %if.then, label %if.end

if.then:                                          ; preds = %entry
  %_M_impl = getelementptr inbounds %"struct.std::_Vector_base.6"* %this1, i32 0, i32 0
  %1 = bitcast %"struct.std::_Vector_base<unsigned int, std::allocator<unsigned int> >::_Vector_impl"* %_M_impl to %"class.__gnu_cxx::new_allocator.8"*
  %2 = load i32** %__p.addr, align 4
  %3 = load i32* %__n.addr, align 4
  call void @_ZN9__gnu_cxx13new_allocatorIjE10deallocateEPjj(%"class.__gnu_cxx::new_allocator.8"* %1, i32* %2, i32 %3)
  br label %if.end

if.end:                                           ; preds = %if.then, %entry
  ret void
}

define linkonce_odr void @_ZNSt12_Vector_baseIjSaIjEE12_Vector_implD1Ev(%"struct.std::_Vector_base<unsigned int, std::allocator<unsigned int> >::_Vector_impl"* %this) unnamed_addr nounwind inlinehint align 2 {
entry:
  %this.addr = alloca %"struct.std::_Vector_base<unsigned int, std::allocator<unsigned int> >::_Vector_impl"*, align 4
  store %"struct.std::_Vector_base<unsigned int, std::allocator<unsigned int> >::_Vector_impl"* %this, %"struct.std::_Vector_base<unsigned int, std::allocator<unsigned int> >::_Vector_impl"** %this.addr, align 4
  %this1 = load %"struct.std::_Vector_base<unsigned int, std::allocator<unsigned int> >::_Vector_impl"** %this.addr
  call void @_ZNSt12_Vector_baseIjSaIjEE12_Vector_implD2Ev(%"struct.std::_Vector_base<unsigned int, std::allocator<unsigned int> >::_Vector_impl"* %this1) nounwind
  ret void
}

define linkonce_odr void @_ZNSt12_Vector_baseIjSaIjEE12_Vector_implD2Ev(%"struct.std::_Vector_base<unsigned int, std::allocator<unsigned int> >::_Vector_impl"* %this) unnamed_addr nounwind inlinehint align 2 {
entry:
  %this.addr = alloca %"struct.std::_Vector_base<unsigned int, std::allocator<unsigned int> >::_Vector_impl"*, align 4
  store %"struct.std::_Vector_base<unsigned int, std::allocator<unsigned int> >::_Vector_impl"* %this, %"struct.std::_Vector_base<unsigned int, std::allocator<unsigned int> >::_Vector_impl"** %this.addr, align 4
  %this1 = load %"struct.std::_Vector_base<unsigned int, std::allocator<unsigned int> >::_Vector_impl"** %this.addr
  %0 = bitcast %"struct.std::_Vector_base<unsigned int, std::allocator<unsigned int> >::_Vector_impl"* %this1 to %"class.std::allocator.7"*
  call void @_ZNSaIjED2Ev(%"class.std::allocator.7"* %0) nounwind
  ret void
}

define linkonce_odr void @_ZNSaIjED2Ev(%"class.std::allocator.7"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.std::allocator.7"*, align 4
  store %"class.std::allocator.7"* %this, %"class.std::allocator.7"** %this.addr, align 4
  %this1 = load %"class.std::allocator.7"** %this.addr
  %0 = bitcast %"class.std::allocator.7"* %this1 to %"class.__gnu_cxx::new_allocator.8"*
  call void @_ZN9__gnu_cxx13new_allocatorIjED2Ev(%"class.__gnu_cxx::new_allocator.8"* %0) nounwind
  ret void
}

define linkonce_odr void @_ZN9__gnu_cxx13new_allocatorIjED2Ev(%"class.__gnu_cxx::new_allocator.8"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.__gnu_cxx::new_allocator.8"*, align 4
  store %"class.__gnu_cxx::new_allocator.8"* %this, %"class.__gnu_cxx::new_allocator.8"** %this.addr, align 4
  %this1 = load %"class.__gnu_cxx::new_allocator.8"** %this.addr
  ret void
}

define linkonce_odr void @_ZN9__gnu_cxx13new_allocatorIjE10deallocateEPjj(%"class.__gnu_cxx::new_allocator.8"* %this, i32* %__p, i32) nounwind align 2 {
entry:
  %this.addr = alloca %"class.__gnu_cxx::new_allocator.8"*, align 4
  %__p.addr = alloca i32*, align 4
  %.addr = alloca i32, align 4
  store %"class.__gnu_cxx::new_allocator.8"* %this, %"class.__gnu_cxx::new_allocator.8"** %this.addr, align 4
  store i32* %__p, i32** %__p.addr, align 4
  store i32 %0, i32* %.addr, align 4
  %this1 = load %"class.__gnu_cxx::new_allocator.8"** %this.addr
  %1 = load i32** %__p.addr, align 4
  %2 = bitcast i32* %1 to i8*
  call void @_ZdlPv(i8* %2) nounwind
  ret void
}

define linkonce_odr void @_ZSt8_DestroyIPjEvT_S1_(i32* %__first, i32* %__last) inlinehint {
entry:
  %__first.addr = alloca i32*, align 4
  %__last.addr = alloca i32*, align 4
  store i32* %__first, i32** %__first.addr, align 4
  store i32* %__last, i32** %__last.addr, align 4
  %0 = load i32** %__first.addr, align 4
  %1 = load i32** %__last.addr, align 4
  call void @_ZNSt12_Destroy_auxILb1EE9__destroyIPjEEvT_S3_(i32* %0, i32* %1)
  ret void
}

define linkonce_odr void @_ZNSt12_Destroy_auxILb1EE9__destroyIPjEEvT_S3_(i32*, i32*) nounwind align 2 {
entry:
  %.addr = alloca i32*, align 4
  %.addr1 = alloca i32*, align 4
  store i32* %0, i32** %.addr, align 4
  store i32* %1, i32** %.addr1, align 4
  ret void
}

declare float @logf(float) nounwind readnone

define linkonce_odr void @_ZNSaIbED2Ev(%"class.std::allocator.18"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.std::allocator.18"*, align 4
  store %"class.std::allocator.18"* %this, %"class.std::allocator.18"** %this.addr, align 4
  %this1 = load %"class.std::allocator.18"** %this.addr
  %0 = bitcast %"class.std::allocator.18"* %this1 to %"class.__gnu_cxx::new_allocator.19"*
  call void @_ZN9__gnu_cxx13new_allocatorIbED2Ev(%"class.__gnu_cxx::new_allocator.19"* %0) nounwind
  ret void
}

define linkonce_odr void @_ZN9__gnu_cxx13new_allocatorIbED2Ev(%"class.__gnu_cxx::new_allocator.19"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.__gnu_cxx::new_allocator.19"*, align 4
  store %"class.__gnu_cxx::new_allocator.19"* %this, %"class.__gnu_cxx::new_allocator.19"** %this.addr, align 4
  %this1 = load %"class.__gnu_cxx::new_allocator.19"** %this.addr
  ret void
}

define linkonce_odr void @_ZNSaIbEC2Ev(%"class.std::allocator.18"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.std::allocator.18"*, align 4
  store %"class.std::allocator.18"* %this, %"class.std::allocator.18"** %this.addr, align 4
  %this1 = load %"class.std::allocator.18"** %this.addr
  %0 = bitcast %"class.std::allocator.18"* %this1 to %"class.__gnu_cxx::new_allocator.19"*
  call void @_ZN9__gnu_cxx13new_allocatorIbEC2Ev(%"class.__gnu_cxx::new_allocator.19"* %0) nounwind
  ret void
}

define linkonce_odr void @_ZN9__gnu_cxx13new_allocatorIbEC2Ev(%"class.__gnu_cxx::new_allocator.19"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.__gnu_cxx::new_allocator.19"*, align 4
  store %"class.__gnu_cxx::new_allocator.19"* %this, %"class.__gnu_cxx::new_allocator.19"** %this.addr, align 4
  %this1 = load %"class.__gnu_cxx::new_allocator.19"** %this.addr
  ret void
}

define linkonce_odr void @_ZNSt6vectorIbSaIbEEC2EjRKbRKS0_(%"class.std::vector.10"* %this, i32 %__n, i8* %__value, %"class.std::allocator.18"* %__a) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.std::vector.10"*, align 4
  %__n.addr = alloca i32, align 4
  %__value.addr = alloca i8*, align 4
  %__a.addr = alloca %"class.std::allocator.18"*, align 4
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  %ref.tmp = alloca i32, align 4
  store %"class.std::vector.10"* %this, %"class.std::vector.10"** %this.addr, align 4
  store i32 %__n, i32* %__n.addr, align 4
  store i8* %__value, i8** %__value.addr, align 4
  store %"class.std::allocator.18"* %__a, %"class.std::allocator.18"** %__a.addr, align 4
  %this1 = load %"class.std::vector.10"** %this.addr
  %0 = bitcast %"class.std::vector.10"* %this1 to %"struct.std::_Bvector_base"*
  %1 = load %"class.std::allocator.18"** %__a.addr, align 4
  call void @_ZNSt13_Bvector_baseISaIbEEC2ERKS0_(%"struct.std::_Bvector_base"* %0, %"class.std::allocator.18"* %1)
  %2 = load i32* %__n.addr, align 4
  invoke void @_ZNSt6vectorIbSaIbEE13_M_initializeEj(%"class.std::vector.10"* %this1, i32 %2)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %entry
  %3 = bitcast %"class.std::vector.10"* %this1 to %"struct.std::_Bvector_base"*
  %_M_impl = getelementptr inbounds %"struct.std::_Bvector_base"* %3, i32 0, i32 0
  %_M_start = getelementptr inbounds %"struct.std::_Bvector_base<std::allocator<bool> >::_Bvector_impl"* %_M_impl, i32 0, i32 0
  %4 = bitcast %"struct.std::_Bit_iterator"* %_M_start to %"struct.std::_Bit_iterator_base"*
  %_M_p = getelementptr inbounds %"struct.std::_Bit_iterator_base"* %4, i32 0, i32 0
  %5 = load i32** %_M_p, align 4
  %6 = bitcast %"class.std::vector.10"* %this1 to %"struct.std::_Bvector_base"*
  %_M_impl2 = getelementptr inbounds %"struct.std::_Bvector_base"* %6, i32 0, i32 0
  %_M_end_of_storage = getelementptr inbounds %"struct.std::_Bvector_base<std::allocator<bool> >::_Bvector_impl"* %_M_impl2, i32 0, i32 2
  %7 = load i32** %_M_end_of_storage, align 4
  %8 = load i8** %__value.addr, align 4
  %9 = load i8* %8, align 1
  %tobool = trunc i8 %9 to i1
  %cond = select i1 %tobool, i32 -1, i32 0
  store i32 %cond, i32* %ref.tmp, align 4
  invoke void @_ZSt4fillIPmiEvT_S1_RKT0_(i32* %5, i32* %7, i32* %ref.tmp)
          to label %invoke.cont3 unwind label %lpad

invoke.cont3:                                     ; preds = %invoke.cont
  ret void

lpad:                                             ; preds = %invoke.cont, %entry
  %10 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %11 = extractvalue { i8*, i32 } %10, 0
  store i8* %11, i8** %exn.slot
  %12 = extractvalue { i8*, i32 } %10, 1
  store i32 %12, i32* %ehselector.slot
  %13 = bitcast %"class.std::vector.10"* %this1 to %"struct.std::_Bvector_base"*
  invoke void @_ZNSt13_Bvector_baseISaIbEED2Ev(%"struct.std::_Bvector_base"* %13)
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
  %14 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          catch i8* null
  call void @_ZSt9terminatev() noreturn nounwind
  unreachable
}

define linkonce_odr void @_ZNSt13_Bvector_baseISaIbEEC2ERKS0_(%"struct.std::_Bvector_base"* %this, %"class.std::allocator.18"* %__a) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"struct.std::_Bvector_base"*, align 4
  %__a.addr = alloca %"class.std::allocator.18"*, align 4
  %ref.tmp = alloca %"class.std::allocator.11", align 1
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  store %"struct.std::_Bvector_base"* %this, %"struct.std::_Bvector_base"** %this.addr, align 4
  store %"class.std::allocator.18"* %__a, %"class.std::allocator.18"** %__a.addr, align 4
  %this1 = load %"struct.std::_Bvector_base"** %this.addr
  %_M_impl = getelementptr inbounds %"struct.std::_Bvector_base"* %this1, i32 0, i32 0
  %0 = load %"class.std::allocator.18"** %__a.addr, align 4
  call void @_ZNSaImEC1IbEERKSaIT_E(%"class.std::allocator.11"* %ref.tmp, %"class.std::allocator.18"* %0) nounwind
  invoke void @_ZNSt13_Bvector_baseISaIbEE13_Bvector_implC1ERKSaImE(%"struct.std::_Bvector_base<std::allocator<bool> >::_Bvector_impl"* %_M_impl, %"class.std::allocator.11"* %ref.tmp)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %entry
  call void @_ZNSaImED1Ev(%"class.std::allocator.11"* %ref.tmp) nounwind
  ret void

lpad:                                             ; preds = %entry
  %1 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %2 = extractvalue { i8*, i32 } %1, 0
  store i8* %2, i8** %exn.slot
  %3 = extractvalue { i8*, i32 } %1, 1
  store i32 %3, i32* %ehselector.slot
  call void @_ZNSaImED1Ev(%"class.std::allocator.11"* %ref.tmp) nounwind
  br label %eh.resume

eh.resume:                                        ; preds = %lpad
  %exn = load i8** %exn.slot
  %sel = load i32* %ehselector.slot
  %lpad.val = insertvalue { i8*, i32 } undef, i8* %exn, 0
  %lpad.val2 = insertvalue { i8*, i32 } %lpad.val, i32 %sel, 1
  resume { i8*, i32 } %lpad.val2
}

define linkonce_odr void @_ZNSt6vectorIbSaIbEE13_M_initializeEj(%"class.std::vector.10"* %this, i32 %__n) align 2 {
entry:
  %this.addr = alloca %"class.std::vector.10"*, align 4
  %__n.addr = alloca i32, align 4
  %__q = alloca i32*, align 4
  %ref.tmp = alloca %"struct.std::_Bit_iterator", align 4
  %ref.tmp4 = alloca %"struct.std::_Bit_iterator", align 4
  store %"class.std::vector.10"* %this, %"class.std::vector.10"** %this.addr, align 4
  store i32 %__n, i32* %__n.addr, align 4
  %this1 = load %"class.std::vector.10"** %this.addr
  %0 = bitcast %"class.std::vector.10"* %this1 to %"struct.std::_Bvector_base"*
  %1 = load i32* %__n.addr, align 4
  %call = call i32* @_ZNSt13_Bvector_baseISaIbEE11_M_allocateEj(%"struct.std::_Bvector_base"* %0, i32 %1)
  store i32* %call, i32** %__q, align 4
  %2 = load i32** %__q, align 4
  %3 = load i32* %__n.addr, align 4
  %add = add i32 %3, 32
  %sub = sub i32 %add, 1
  %div = udiv i32 %sub, 32
  %add.ptr = getelementptr inbounds i32* %2, i32 %div
  %4 = bitcast %"class.std::vector.10"* %this1 to %"struct.std::_Bvector_base"*
  %_M_impl = getelementptr inbounds %"struct.std::_Bvector_base"* %4, i32 0, i32 0
  %_M_end_of_storage = getelementptr inbounds %"struct.std::_Bvector_base<std::allocator<bool> >::_Bvector_impl"* %_M_impl, i32 0, i32 2
  store i32* %add.ptr, i32** %_M_end_of_storage, align 4
  %5 = bitcast %"class.std::vector.10"* %this1 to %"struct.std::_Bvector_base"*
  %_M_impl2 = getelementptr inbounds %"struct.std::_Bvector_base"* %5, i32 0, i32 0
  %_M_start = getelementptr inbounds %"struct.std::_Bvector_base<std::allocator<bool> >::_Bvector_impl"* %_M_impl2, i32 0, i32 0
  %6 = load i32** %__q, align 4
  call void @_ZNSt13_Bit_iteratorC1EPmj(%"struct.std::_Bit_iterator"* %ref.tmp, i32* %6, i32 0)
  %7 = bitcast %"struct.std::_Bit_iterator"* %_M_start to i8*
  %8 = bitcast %"struct.std::_Bit_iterator"* %ref.tmp to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %7, i8* %8, i32 8, i32 4, i1 false)
  %9 = bitcast %"class.std::vector.10"* %this1 to %"struct.std::_Bvector_base"*
  %_M_impl3 = getelementptr inbounds %"struct.std::_Bvector_base"* %9, i32 0, i32 0
  %_M_finish = getelementptr inbounds %"struct.std::_Bvector_base<std::allocator<bool> >::_Bvector_impl"* %_M_impl3, i32 0, i32 1
  %10 = bitcast %"class.std::vector.10"* %this1 to %"struct.std::_Bvector_base"*
  %_M_impl5 = getelementptr inbounds %"struct.std::_Bvector_base"* %10, i32 0, i32 0
  %_M_start6 = getelementptr inbounds %"struct.std::_Bvector_base<std::allocator<bool> >::_Bvector_impl"* %_M_impl5, i32 0, i32 0
  %11 = load i32* %__n.addr, align 4
  call void @_ZNKSt13_Bit_iteratorplEi(%"struct.std::_Bit_iterator"* sret %ref.tmp4, %"struct.std::_Bit_iterator"* %_M_start6, i32 %11)
  %12 = bitcast %"struct.std::_Bit_iterator"* %_M_finish to i8*
  %13 = bitcast %"struct.std::_Bit_iterator"* %ref.tmp4 to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %12, i8* %13, i32 8, i32 4, i1 false)
  ret void
}

define linkonce_odr void @_ZSt4fillIPmiEvT_S1_RKT0_(i32* %__first, i32* %__last, i32* %__value) inlinehint {
entry:
  %__first.addr = alloca i32*, align 4
  %__last.addr = alloca i32*, align 4
  %__value.addr = alloca i32*, align 4
  store i32* %__first, i32** %__first.addr, align 4
  store i32* %__last, i32** %__last.addr, align 4
  store i32* %__value, i32** %__value.addr, align 4
  %0 = load i32** %__first.addr, align 4
  %call = call i32* @_ZSt12__niter_baseIPmENSt11_Niter_baseIT_E13iterator_typeES2_(i32* %0)
  %1 = load i32** %__last.addr, align 4
  %call1 = call i32* @_ZSt12__niter_baseIPmENSt11_Niter_baseIT_E13iterator_typeES2_(i32* %1)
  %2 = load i32** %__value.addr, align 4
  call void @_ZSt8__fill_aIPmiEN9__gnu_cxx11__enable_ifIXsr11__is_scalarIT0_EE7__valueEvE6__typeET_S6_RKS3_(i32* %call, i32* %call1, i32* %2)
  ret void
}

define linkonce_odr void @_ZSt8__fill_aIPmiEN9__gnu_cxx11__enable_ifIXsr11__is_scalarIT0_EE7__valueEvE6__typeET_S6_RKS3_(i32* %__first, i32* %__last, i32* %__value) nounwind inlinehint {
entry:
  %__first.addr = alloca i32*, align 4
  %__last.addr = alloca i32*, align 4
  %__value.addr = alloca i32*, align 4
  %__tmp = alloca i32, align 4
  store i32* %__first, i32** %__first.addr, align 4
  store i32* %__last, i32** %__last.addr, align 4
  store i32* %__value, i32** %__value.addr, align 4
  %0 = load i32** %__value.addr, align 4
  %1 = load i32* %0, align 4
  store i32 %1, i32* %__tmp, align 4
  br label %for.cond

for.cond:                                         ; preds = %for.inc, %entry
  %2 = load i32** %__first.addr, align 4
  %3 = load i32** %__last.addr, align 4
  %cmp = icmp ne i32* %2, %3
  br i1 %cmp, label %for.body, label %for.end

for.body:                                         ; preds = %for.cond
  %4 = load i32* %__tmp, align 4
  %5 = load i32** %__first.addr, align 4
  store i32 %4, i32* %5, align 4
  br label %for.inc

for.inc:                                          ; preds = %for.body
  %6 = load i32** %__first.addr, align 4
  %incdec.ptr = getelementptr inbounds i32* %6, i32 1
  store i32* %incdec.ptr, i32** %__first.addr, align 4
  br label %for.cond

for.end:                                          ; preds = %for.cond
  ret void
}

define linkonce_odr i32* @_ZSt12__niter_baseIPmENSt11_Niter_baseIT_E13iterator_typeES2_(i32* %__it) inlinehint {
entry:
  %__it.addr = alloca i32*, align 4
  store i32* %__it, i32** %__it.addr, align 4
  %0 = load i32** %__it.addr, align 4
  %call = call i32* @_ZNSt10_Iter_baseIPmLb0EE7_S_baseES0_(i32* %0)
  ret i32* %call
}

define linkonce_odr i32* @_ZNSt10_Iter_baseIPmLb0EE7_S_baseES0_(i32* %__it) nounwind align 2 {
entry:
  %__it.addr = alloca i32*, align 4
  store i32* %__it, i32** %__it.addr, align 4
  %0 = load i32** %__it.addr, align 4
  ret i32* %0
}

define linkonce_odr i32* @_ZNSt13_Bvector_baseISaIbEE11_M_allocateEj(%"struct.std::_Bvector_base"* %this, i32 %__n) align 2 {
entry:
  %this.addr = alloca %"struct.std::_Bvector_base"*, align 4
  %__n.addr = alloca i32, align 4
  store %"struct.std::_Bvector_base"* %this, %"struct.std::_Bvector_base"** %this.addr, align 4
  store i32 %__n, i32* %__n.addr, align 4
  %this1 = load %"struct.std::_Bvector_base"** %this.addr
  %_M_impl = getelementptr inbounds %"struct.std::_Bvector_base"* %this1, i32 0, i32 0
  %0 = bitcast %"struct.std::_Bvector_base<std::allocator<bool> >::_Bvector_impl"* %_M_impl to %"class.__gnu_cxx::new_allocator.12"*
  %1 = load i32* %__n.addr, align 4
  %add = add i32 %1, 32
  %sub = sub i32 %add, 1
  %div = udiv i32 %sub, 32
  %call = call i32* @_ZN9__gnu_cxx13new_allocatorImE8allocateEjPKv(%"class.__gnu_cxx::new_allocator.12"* %0, i32 %div, i8* null)
  ret i32* %call
}

define linkonce_odr void @_ZNKSt13_Bit_iteratorplEi(%"struct.std::_Bit_iterator"* noalias sret %agg.result, %"struct.std::_Bit_iterator"* %this, i32 %__i) align 2 {
entry:
  %this.addr = alloca %"struct.std::_Bit_iterator"*, align 4
  %__i.addr = alloca i32, align 4
  %__tmp = alloca %"struct.std::_Bit_iterator", align 4
  store %"struct.std::_Bit_iterator"* %this, %"struct.std::_Bit_iterator"** %this.addr, align 4
  store i32 %__i, i32* %__i.addr, align 4
  %this1 = load %"struct.std::_Bit_iterator"** %this.addr
  %0 = bitcast %"struct.std::_Bit_iterator"* %__tmp to i8*
  %1 = bitcast %"struct.std::_Bit_iterator"* %this1 to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %0, i8* %1, i32 8, i32 4, i1 false)
  %2 = load i32* %__i.addr, align 4
  %call = call %"struct.std::_Bit_iterator"* @_ZNSt13_Bit_iteratorpLEi(%"struct.std::_Bit_iterator"* %__tmp, i32 %2)
  %3 = bitcast %"struct.std::_Bit_iterator"* %agg.result to i8*
  %4 = bitcast %"struct.std::_Bit_iterator"* %call to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %3, i8* %4, i32 8, i32 4, i1 false)
  ret void
}

define linkonce_odr %"struct.std::_Bit_iterator"* @_ZNSt13_Bit_iteratorpLEi(%"struct.std::_Bit_iterator"* %this, i32 %__i) align 2 {
entry:
  %this.addr = alloca %"struct.std::_Bit_iterator"*, align 4
  %__i.addr = alloca i32, align 4
  store %"struct.std::_Bit_iterator"* %this, %"struct.std::_Bit_iterator"** %this.addr, align 4
  store i32 %__i, i32* %__i.addr, align 4
  %this1 = load %"struct.std::_Bit_iterator"** %this.addr
  %0 = bitcast %"struct.std::_Bit_iterator"* %this1 to %"struct.std::_Bit_iterator_base"*
  %1 = load i32* %__i.addr, align 4
  call void @_ZNSt18_Bit_iterator_base7_M_incrEi(%"struct.std::_Bit_iterator_base"* %0, i32 %1)
  ret %"struct.std::_Bit_iterator"* %this1
}

define linkonce_odr void @_ZNSt18_Bit_iterator_base7_M_incrEi(%"struct.std::_Bit_iterator_base"* %this, i32 %__i) nounwind align 2 {
entry:
  %this.addr = alloca %"struct.std::_Bit_iterator_base"*, align 4
  %__i.addr = alloca i32, align 4
  %__n = alloca i32, align 4
  store %"struct.std::_Bit_iterator_base"* %this, %"struct.std::_Bit_iterator_base"** %this.addr, align 4
  store i32 %__i, i32* %__i.addr, align 4
  %this1 = load %"struct.std::_Bit_iterator_base"** %this.addr
  %0 = load i32* %__i.addr, align 4
  %_M_offset = getelementptr inbounds %"struct.std::_Bit_iterator_base"* %this1, i32 0, i32 1
  %1 = load i32* %_M_offset, align 4
  %add = add i32 %0, %1
  store i32 %add, i32* %__n, align 4
  %2 = load i32* %__n, align 4
  %div = sdiv i32 %2, 32
  %_M_p = getelementptr inbounds %"struct.std::_Bit_iterator_base"* %this1, i32 0, i32 0
  %3 = load i32** %_M_p, align 4
  %add.ptr = getelementptr inbounds i32* %3, i32 %div
  store i32* %add.ptr, i32** %_M_p, align 4
  %4 = load i32* %__n, align 4
  %rem = srem i32 %4, 32
  store i32 %rem, i32* %__n, align 4
  %5 = load i32* %__n, align 4
  %cmp = icmp slt i32 %5, 0
  br i1 %cmp, label %if.then, label %if.end

if.then:                                          ; preds = %entry
  %6 = load i32* %__n, align 4
  %add2 = add nsw i32 %6, 32
  store i32 %add2, i32* %__n, align 4
  %_M_p3 = getelementptr inbounds %"struct.std::_Bit_iterator_base"* %this1, i32 0, i32 0
  %7 = load i32** %_M_p3, align 4
  %incdec.ptr = getelementptr inbounds i32* %7, i32 -1
  store i32* %incdec.ptr, i32** %_M_p3, align 4
  br label %if.end

if.end:                                           ; preds = %if.then, %entry
  %8 = load i32* %__n, align 4
  %_M_offset4 = getelementptr inbounds %"struct.std::_Bit_iterator_base"* %this1, i32 0, i32 1
  store i32 %8, i32* %_M_offset4, align 4
  ret void
}

define linkonce_odr i32* @_ZN9__gnu_cxx13new_allocatorImE8allocateEjPKv(%"class.__gnu_cxx::new_allocator.12"* %this, i32 %__n, i8*) align 2 {
entry:
  %this.addr = alloca %"class.__gnu_cxx::new_allocator.12"*, align 4
  %__n.addr = alloca i32, align 4
  %.addr = alloca i8*, align 4
  store %"class.__gnu_cxx::new_allocator.12"* %this, %"class.__gnu_cxx::new_allocator.12"** %this.addr, align 4
  store i32 %__n, i32* %__n.addr, align 4
  store i8* %0, i8** %.addr, align 4
  %this1 = load %"class.__gnu_cxx::new_allocator.12"** %this.addr
  %1 = load i32* %__n.addr, align 4
  %call = call i32 @_ZNK9__gnu_cxx13new_allocatorImE8max_sizeEv(%"class.__gnu_cxx::new_allocator.12"* %this1) nounwind
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

define linkonce_odr i32 @_ZNK9__gnu_cxx13new_allocatorImE8max_sizeEv(%"class.__gnu_cxx::new_allocator.12"* %this) nounwind align 2 {
entry:
  %this.addr = alloca %"class.__gnu_cxx::new_allocator.12"*, align 4
  store %"class.__gnu_cxx::new_allocator.12"* %this, %"class.__gnu_cxx::new_allocator.12"** %this.addr, align 4
  %this1 = load %"class.__gnu_cxx::new_allocator.12"** %this.addr
  ret i32 1073741823
}

define linkonce_odr void @_ZNSt13_Bvector_baseISaIbEE13_Bvector_implC1ERKSaImE(%"struct.std::_Bvector_base<std::allocator<bool> >::_Bvector_impl"* %this, %"class.std::allocator.11"* %__a) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"struct.std::_Bvector_base<std::allocator<bool> >::_Bvector_impl"*, align 4
  %__a.addr = alloca %"class.std::allocator.11"*, align 4
  store %"struct.std::_Bvector_base<std::allocator<bool> >::_Bvector_impl"* %this, %"struct.std::_Bvector_base<std::allocator<bool> >::_Bvector_impl"** %this.addr, align 4
  store %"class.std::allocator.11"* %__a, %"class.std::allocator.11"** %__a.addr, align 4
  %this1 = load %"struct.std::_Bvector_base<std::allocator<bool> >::_Bvector_impl"** %this.addr
  %0 = load %"class.std::allocator.11"** %__a.addr
  call void @_ZNSt13_Bvector_baseISaIbEE13_Bvector_implC2ERKSaImE(%"struct.std::_Bvector_base<std::allocator<bool> >::_Bvector_impl"* %this1, %"class.std::allocator.11"* %0)
  ret void
}

define linkonce_odr void @_ZNSaImEC1IbEERKSaIT_E(%"class.std::allocator.11"* %this, %"class.std::allocator.18"*) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.std::allocator.11"*, align 4
  %.addr = alloca %"class.std::allocator.18"*, align 4
  store %"class.std::allocator.11"* %this, %"class.std::allocator.11"** %this.addr, align 4
  store %"class.std::allocator.18"* %0, %"class.std::allocator.18"** %.addr, align 4
  %this1 = load %"class.std::allocator.11"** %this.addr
  %1 = load %"class.std::allocator.18"** %.addr
  call void @_ZNSaImEC2IbEERKSaIT_E(%"class.std::allocator.11"* %this1, %"class.std::allocator.18"* %1) nounwind
  ret void
}

define linkonce_odr void @_ZNSaImED1Ev(%"class.std::allocator.11"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.std::allocator.11"*, align 4
  store %"class.std::allocator.11"* %this, %"class.std::allocator.11"** %this.addr, align 4
  %this1 = load %"class.std::allocator.11"** %this.addr
  call void @_ZNSaImED2Ev(%"class.std::allocator.11"* %this1) nounwind
  ret void
}

define linkonce_odr void @_ZNSaImEC2IbEERKSaIT_E(%"class.std::allocator.11"* %this, %"class.std::allocator.18"*) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.std::allocator.11"*, align 4
  %.addr = alloca %"class.std::allocator.18"*, align 4
  store %"class.std::allocator.11"* %this, %"class.std::allocator.11"** %this.addr, align 4
  store %"class.std::allocator.18"* %0, %"class.std::allocator.18"** %.addr, align 4
  %this1 = load %"class.std::allocator.11"** %this.addr
  %1 = bitcast %"class.std::allocator.11"* %this1 to %"class.__gnu_cxx::new_allocator.12"*
  call void @_ZN9__gnu_cxx13new_allocatorImEC2Ev(%"class.__gnu_cxx::new_allocator.12"* %1) nounwind
  ret void
}

define linkonce_odr void @_ZN9__gnu_cxx13new_allocatorImEC2Ev(%"class.__gnu_cxx::new_allocator.12"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.__gnu_cxx::new_allocator.12"*, align 4
  store %"class.__gnu_cxx::new_allocator.12"* %this, %"class.__gnu_cxx::new_allocator.12"** %this.addr, align 4
  %this1 = load %"class.__gnu_cxx::new_allocator.12"** %this.addr
  ret void
}

define linkonce_odr void @_ZNSt13_Bvector_baseISaIbEE13_Bvector_implC2ERKSaImE(%"struct.std::_Bvector_base<std::allocator<bool> >::_Bvector_impl"* %this, %"class.std::allocator.11"* %__a) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"struct.std::_Bvector_base<std::allocator<bool> >::_Bvector_impl"*, align 4
  %__a.addr = alloca %"class.std::allocator.11"*, align 4
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  store %"struct.std::_Bvector_base<std::allocator<bool> >::_Bvector_impl"* %this, %"struct.std::_Bvector_base<std::allocator<bool> >::_Bvector_impl"** %this.addr, align 4
  store %"class.std::allocator.11"* %__a, %"class.std::allocator.11"** %__a.addr, align 4
  %this1 = load %"struct.std::_Bvector_base<std::allocator<bool> >::_Bvector_impl"** %this.addr
  %0 = bitcast %"struct.std::_Bvector_base<std::allocator<bool> >::_Bvector_impl"* %this1 to %"class.std::allocator.11"*
  %1 = load %"class.std::allocator.11"** %__a.addr, align 4
  call void @_ZNSaImEC2ERKS_(%"class.std::allocator.11"* %0, %"class.std::allocator.11"* %1) nounwind
  %_M_start = getelementptr inbounds %"struct.std::_Bvector_base<std::allocator<bool> >::_Bvector_impl"* %this1, i32 0, i32 0
  invoke void @_ZNSt13_Bit_iteratorC1Ev(%"struct.std::_Bit_iterator"* %_M_start)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %entry
  %_M_finish = getelementptr inbounds %"struct.std::_Bvector_base<std::allocator<bool> >::_Bvector_impl"* %this1, i32 0, i32 1
  invoke void @_ZNSt13_Bit_iteratorC1Ev(%"struct.std::_Bit_iterator"* %_M_finish)
          to label %invoke.cont2 unwind label %lpad

invoke.cont2:                                     ; preds = %invoke.cont
  %_M_end_of_storage = getelementptr inbounds %"struct.std::_Bvector_base<std::allocator<bool> >::_Bvector_impl"* %this1, i32 0, i32 2
  store i32* null, i32** %_M_end_of_storage, align 4
  ret void

lpad:                                             ; preds = %invoke.cont, %entry
  %2 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %3 = extractvalue { i8*, i32 } %2, 0
  store i8* %3, i8** %exn.slot
  %4 = extractvalue { i8*, i32 } %2, 1
  store i32 %4, i32* %ehselector.slot
  %5 = bitcast %"struct.std::_Bvector_base<std::allocator<bool> >::_Bvector_impl"* %this1 to %"class.std::allocator.11"*
  call void @_ZNSaImED2Ev(%"class.std::allocator.11"* %5) nounwind
  br label %eh.resume

eh.resume:                                        ; preds = %lpad
  %exn = load i8** %exn.slot
  %sel = load i32* %ehselector.slot
  %lpad.val = insertvalue { i8*, i32 } undef, i8* %exn, 0
  %lpad.val3 = insertvalue { i8*, i32 } %lpad.val, i32 %sel, 1
  resume { i8*, i32 } %lpad.val3
}

define linkonce_odr void @_ZNSaImEC2ERKS_(%"class.std::allocator.11"* %this, %"class.std::allocator.11"* %__a) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.std::allocator.11"*, align 4
  %__a.addr = alloca %"class.std::allocator.11"*, align 4
  store %"class.std::allocator.11"* %this, %"class.std::allocator.11"** %this.addr, align 4
  store %"class.std::allocator.11"* %__a, %"class.std::allocator.11"** %__a.addr, align 4
  %this1 = load %"class.std::allocator.11"** %this.addr
  %0 = bitcast %"class.std::allocator.11"* %this1 to %"class.__gnu_cxx::new_allocator.12"*
  %1 = load %"class.std::allocator.11"** %__a.addr, align 4
  %2 = bitcast %"class.std::allocator.11"* %1 to %"class.__gnu_cxx::new_allocator.12"*
  call void @_ZN9__gnu_cxx13new_allocatorImEC2ERKS1_(%"class.__gnu_cxx::new_allocator.12"* %0, %"class.__gnu_cxx::new_allocator.12"* %2) nounwind
  ret void
}

define linkonce_odr void @_ZNSt13_Bit_iteratorC1Ev(%"struct.std::_Bit_iterator"* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"struct.std::_Bit_iterator"*, align 4
  store %"struct.std::_Bit_iterator"* %this, %"struct.std::_Bit_iterator"** %this.addr, align 4
  %this1 = load %"struct.std::_Bit_iterator"** %this.addr
  call void @_ZNSt13_Bit_iteratorC2Ev(%"struct.std::_Bit_iterator"* %this1)
  ret void
}

define linkonce_odr void @_ZNSt13_Bit_iteratorC2Ev(%"struct.std::_Bit_iterator"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"struct.std::_Bit_iterator"*, align 4
  store %"struct.std::_Bit_iterator"* %this, %"struct.std::_Bit_iterator"** %this.addr, align 4
  %this1 = load %"struct.std::_Bit_iterator"** %this.addr
  %0 = bitcast %"struct.std::_Bit_iterator"* %this1 to %"struct.std::_Bit_iterator_base"*
  call void @_ZNSt18_Bit_iterator_baseC2EPmj(%"struct.std::_Bit_iterator_base"* %0, i32* null, i32 0)
  ret void
}

define linkonce_odr void @_ZN9__gnu_cxx13new_allocatorImEC2ERKS1_(%"class.__gnu_cxx::new_allocator.12"* %this, %"class.__gnu_cxx::new_allocator.12"*) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.__gnu_cxx::new_allocator.12"*, align 4
  %.addr = alloca %"class.__gnu_cxx::new_allocator.12"*, align 4
  store %"class.__gnu_cxx::new_allocator.12"* %this, %"class.__gnu_cxx::new_allocator.12"** %this.addr, align 4
  store %"class.__gnu_cxx::new_allocator.12"* %0, %"class.__gnu_cxx::new_allocator.12"** %.addr, align 4
  %this1 = load %"class.__gnu_cxx::new_allocator.12"** %this.addr
  ret void
}

define linkonce_odr void @_ZNSaIjEC2Ev(%"class.std::allocator.7"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.std::allocator.7"*, align 4
  store %"class.std::allocator.7"* %this, %"class.std::allocator.7"** %this.addr, align 4
  %this1 = load %"class.std::allocator.7"** %this.addr
  %0 = bitcast %"class.std::allocator.7"* %this1 to %"class.__gnu_cxx::new_allocator.8"*
  call void @_ZN9__gnu_cxx13new_allocatorIjEC2Ev(%"class.__gnu_cxx::new_allocator.8"* %0) nounwind
  ret void
}

define linkonce_odr void @_ZN9__gnu_cxx13new_allocatorIjEC2Ev(%"class.__gnu_cxx::new_allocator.8"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.__gnu_cxx::new_allocator.8"*, align 4
  store %"class.__gnu_cxx::new_allocator.8"* %this, %"class.__gnu_cxx::new_allocator.8"** %this.addr, align 4
  %this1 = load %"class.__gnu_cxx::new_allocator.8"** %this.addr
  ret void
}

define linkonce_odr void @_ZNSt6vectorIjSaIjEEC2EjRKjRKS0_(%"class.std::vector.5"* %this, i32 %__n, i32* %__value, %"class.std::allocator.7"* %__a) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.std::vector.5"*, align 4
  %__n.addr = alloca i32, align 4
  %__value.addr = alloca i32*, align 4
  %__a.addr = alloca %"class.std::allocator.7"*, align 4
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  store %"class.std::vector.5"* %this, %"class.std::vector.5"** %this.addr, align 4
  store i32 %__n, i32* %__n.addr, align 4
  store i32* %__value, i32** %__value.addr, align 4
  store %"class.std::allocator.7"* %__a, %"class.std::allocator.7"** %__a.addr, align 4
  %this1 = load %"class.std::vector.5"** %this.addr
  %0 = bitcast %"class.std::vector.5"* %this1 to %"struct.std::_Vector_base.6"*
  %1 = load i32* %__n.addr, align 4
  %2 = load %"class.std::allocator.7"** %__a.addr, align 4
  call void @_ZNSt12_Vector_baseIjSaIjEEC2EjRKS0_(%"struct.std::_Vector_base.6"* %0, i32 %1, %"class.std::allocator.7"* %2)
  %3 = load i32* %__n.addr, align 4
  %4 = load i32** %__value.addr, align 4
  invoke void @_ZNSt6vectorIjSaIjEE18_M_fill_initializeEjRKj(%"class.std::vector.5"* %this1, i32 %3, i32* %4)
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
  %8 = bitcast %"class.std::vector.5"* %this1 to %"struct.std::_Vector_base.6"*
  invoke void @_ZNSt12_Vector_baseIjSaIjEED2Ev(%"struct.std::_Vector_base.6"* %8)
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

define linkonce_odr void @_ZNSt12_Vector_baseIjSaIjEEC2EjRKS0_(%"struct.std::_Vector_base.6"* %this, i32 %__n, %"class.std::allocator.7"* %__a) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"struct.std::_Vector_base.6"*, align 4
  %__n.addr = alloca i32, align 4
  %__a.addr = alloca %"class.std::allocator.7"*, align 4
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  store %"struct.std::_Vector_base.6"* %this, %"struct.std::_Vector_base.6"** %this.addr, align 4
  store i32 %__n, i32* %__n.addr, align 4
  store %"class.std::allocator.7"* %__a, %"class.std::allocator.7"** %__a.addr, align 4
  %this1 = load %"struct.std::_Vector_base.6"** %this.addr
  %_M_impl = getelementptr inbounds %"struct.std::_Vector_base.6"* %this1, i32 0, i32 0
  %0 = load %"class.std::allocator.7"** %__a.addr, align 4
  call void @_ZNSt12_Vector_baseIjSaIjEE12_Vector_implC1ERKS0_(%"struct.std::_Vector_base<unsigned int, std::allocator<unsigned int> >::_Vector_impl"* %_M_impl, %"class.std::allocator.7"* %0)
  %1 = load i32* %__n.addr, align 4
  %call = invoke i32* @_ZNSt12_Vector_baseIjSaIjEE11_M_allocateEj(%"struct.std::_Vector_base.6"* %this1, i32 %1)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %entry
  %_M_impl2 = getelementptr inbounds %"struct.std::_Vector_base.6"* %this1, i32 0, i32 0
  %_M_start = getelementptr inbounds %"struct.std::_Vector_base<unsigned int, std::allocator<unsigned int> >::_Vector_impl"* %_M_impl2, i32 0, i32 0
  store i32* %call, i32** %_M_start, align 4
  %_M_impl3 = getelementptr inbounds %"struct.std::_Vector_base.6"* %this1, i32 0, i32 0
  %_M_start4 = getelementptr inbounds %"struct.std::_Vector_base<unsigned int, std::allocator<unsigned int> >::_Vector_impl"* %_M_impl3, i32 0, i32 0
  %2 = load i32** %_M_start4, align 4
  %_M_impl5 = getelementptr inbounds %"struct.std::_Vector_base.6"* %this1, i32 0, i32 0
  %_M_finish = getelementptr inbounds %"struct.std::_Vector_base<unsigned int, std::allocator<unsigned int> >::_Vector_impl"* %_M_impl5, i32 0, i32 1
  store i32* %2, i32** %_M_finish, align 4
  %_M_impl6 = getelementptr inbounds %"struct.std::_Vector_base.6"* %this1, i32 0, i32 0
  %_M_start7 = getelementptr inbounds %"struct.std::_Vector_base<unsigned int, std::allocator<unsigned int> >::_Vector_impl"* %_M_impl6, i32 0, i32 0
  %3 = load i32** %_M_start7, align 4
  %4 = load i32* %__n.addr, align 4
  %add.ptr = getelementptr inbounds i32* %3, i32 %4
  %_M_impl8 = getelementptr inbounds %"struct.std::_Vector_base.6"* %this1, i32 0, i32 0
  %_M_end_of_storage = getelementptr inbounds %"struct.std::_Vector_base<unsigned int, std::allocator<unsigned int> >::_Vector_impl"* %_M_impl8, i32 0, i32 2
  store i32* %add.ptr, i32** %_M_end_of_storage, align 4
  ret void

lpad:                                             ; preds = %entry
  %5 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %6 = extractvalue { i8*, i32 } %5, 0
  store i8* %6, i8** %exn.slot
  %7 = extractvalue { i8*, i32 } %5, 1
  store i32 %7, i32* %ehselector.slot
  call void @_ZNSt12_Vector_baseIjSaIjEE12_Vector_implD1Ev(%"struct.std::_Vector_base<unsigned int, std::allocator<unsigned int> >::_Vector_impl"* %_M_impl) nounwind
  br label %eh.resume

eh.resume:                                        ; preds = %lpad
  %exn = load i8** %exn.slot
  %sel = load i32* %ehselector.slot
  %lpad.val = insertvalue { i8*, i32 } undef, i8* %exn, 0
  %lpad.val9 = insertvalue { i8*, i32 } %lpad.val, i32 %sel, 1
  resume { i8*, i32 } %lpad.val9
}

define linkonce_odr void @_ZNSt6vectorIjSaIjEE18_M_fill_initializeEjRKj(%"class.std::vector.5"* %this, i32 %__n, i32* %__value) align 2 {
entry:
  %this.addr = alloca %"class.std::vector.5"*, align 4
  %__n.addr = alloca i32, align 4
  %__value.addr = alloca i32*, align 4
  store %"class.std::vector.5"* %this, %"class.std::vector.5"** %this.addr, align 4
  store i32 %__n, i32* %__n.addr, align 4
  store i32* %__value, i32** %__value.addr, align 4
  %this1 = load %"class.std::vector.5"** %this.addr
  %0 = bitcast %"class.std::vector.5"* %this1 to %"struct.std::_Vector_base.6"*
  %_M_impl = getelementptr inbounds %"struct.std::_Vector_base.6"* %0, i32 0, i32 0
  %_M_start = getelementptr inbounds %"struct.std::_Vector_base<unsigned int, std::allocator<unsigned int> >::_Vector_impl"* %_M_impl, i32 0, i32 0
  %1 = load i32** %_M_start, align 4
  %2 = load i32* %__n.addr, align 4
  %3 = load i32** %__value.addr, align 4
  %4 = bitcast %"class.std::vector.5"* %this1 to %"struct.std::_Vector_base.6"*
  %call = call %"class.std::allocator.7"* @_ZNSt12_Vector_baseIjSaIjEE19_M_get_Tp_allocatorEv(%"struct.std::_Vector_base.6"* %4)
  call void @_ZSt24__uninitialized_fill_n_aIPjjjjEvT_T0_RKT1_RSaIT2_E(i32* %1, i32 %2, i32* %3, %"class.std::allocator.7"* %call)
  %5 = bitcast %"class.std::vector.5"* %this1 to %"struct.std::_Vector_base.6"*
  %_M_impl2 = getelementptr inbounds %"struct.std::_Vector_base.6"* %5, i32 0, i32 0
  %_M_end_of_storage = getelementptr inbounds %"struct.std::_Vector_base<unsigned int, std::allocator<unsigned int> >::_Vector_impl"* %_M_impl2, i32 0, i32 2
  %6 = load i32** %_M_end_of_storage, align 4
  %7 = bitcast %"class.std::vector.5"* %this1 to %"struct.std::_Vector_base.6"*
  %_M_impl3 = getelementptr inbounds %"struct.std::_Vector_base.6"* %7, i32 0, i32 0
  %_M_finish = getelementptr inbounds %"struct.std::_Vector_base<unsigned int, std::allocator<unsigned int> >::_Vector_impl"* %_M_impl3, i32 0, i32 1
  store i32* %6, i32** %_M_finish, align 4
  ret void
}

define linkonce_odr void @_ZSt24__uninitialized_fill_n_aIPjjjjEvT_T0_RKT1_RSaIT2_E(i32* %__first, i32 %__n, i32* %__x, %"class.std::allocator.7"*) inlinehint {
entry:
  %__first.addr = alloca i32*, align 4
  %__n.addr = alloca i32, align 4
  %__x.addr = alloca i32*, align 4
  %.addr = alloca %"class.std::allocator.7"*, align 4
  store i32* %__first, i32** %__first.addr, align 4
  store i32 %__n, i32* %__n.addr, align 4
  store i32* %__x, i32** %__x.addr, align 4
  store %"class.std::allocator.7"* %0, %"class.std::allocator.7"** %.addr, align 4
  %1 = load i32** %__first.addr, align 4
  %2 = load i32* %__n.addr, align 4
  %3 = load i32** %__x.addr, align 4
  call void @_ZSt20uninitialized_fill_nIPjjjEvT_T0_RKT1_(i32* %1, i32 %2, i32* %3)
  ret void
}

define linkonce_odr void @_ZSt20uninitialized_fill_nIPjjjEvT_T0_RKT1_(i32* %__first, i32 %__n, i32* %__x) inlinehint {
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
  call void @_ZNSt22__uninitialized_fill_nILb1EE15__uninit_fill_nIPjjjEEvT_T0_RKT1_(i32* %0, i32 %1, i32* %2)
  ret void
}

define linkonce_odr void @_ZNSt22__uninitialized_fill_nILb1EE15__uninit_fill_nIPjjjEEvT_T0_RKT1_(i32* %__first, i32 %__n, i32* %__x) align 2 {
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
  %call = call i32* @_ZSt6fill_nIPjjjET_S1_T0_RKT1_(i32* %0, i32 %1, i32* %2)
  ret void
}

define linkonce_odr i32* @_ZSt6fill_nIPjjjET_S1_T0_RKT1_(i32* %__first, i32 %__n, i32* %__value) inlinehint {
entry:
  %__first.addr = alloca i32*, align 4
  %__n.addr = alloca i32, align 4
  %__value.addr = alloca i32*, align 4
  store i32* %__first, i32** %__first.addr, align 4
  store i32 %__n, i32* %__n.addr, align 4
  store i32* %__value, i32** %__value.addr, align 4
  %0 = load i32** %__first.addr, align 4
  %call = call i32* @_ZSt12__niter_baseIPjENSt11_Niter_baseIT_E13iterator_typeES2_(i32* %0)
  %1 = load i32* %__n.addr, align 4
  %2 = load i32** %__value.addr, align 4
  %call1 = call i32* @_ZSt10__fill_n_aIPjjjEN9__gnu_cxx11__enable_ifIXsr11__is_scalarIT1_EE7__valueET_E6__typeES4_T0_RKS3_(i32* %call, i32 %1, i32* %2)
  ret i32* %call1
}

define linkonce_odr i32* @_ZSt10__fill_n_aIPjjjEN9__gnu_cxx11__enable_ifIXsr11__is_scalarIT1_EE7__valueET_E6__typeES4_T0_RKS3_(i32* %__first, i32 %__n, i32* %__value) nounwind inlinehint {
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

define linkonce_odr i32* @_ZSt12__niter_baseIPjENSt11_Niter_baseIT_E13iterator_typeES2_(i32* %__it) inlinehint {
entry:
  %__it.addr = alloca i32*, align 4
  store i32* %__it, i32** %__it.addr, align 4
  %0 = load i32** %__it.addr, align 4
  %call = call i32* @_ZNSt10_Iter_baseIPjLb0EE7_S_baseES0_(i32* %0)
  ret i32* %call
}

define linkonce_odr i32* @_ZNSt10_Iter_baseIPjLb0EE7_S_baseES0_(i32* %__it) nounwind align 2 {
entry:
  %__it.addr = alloca i32*, align 4
  store i32* %__it, i32** %__it.addr, align 4
  %0 = load i32** %__it.addr, align 4
  ret i32* %0
}

define linkonce_odr void @_ZNSt12_Vector_baseIjSaIjEE12_Vector_implC1ERKS0_(%"struct.std::_Vector_base<unsigned int, std::allocator<unsigned int> >::_Vector_impl"* %this, %"class.std::allocator.7"* %__a) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"struct.std::_Vector_base<unsigned int, std::allocator<unsigned int> >::_Vector_impl"*, align 4
  %__a.addr = alloca %"class.std::allocator.7"*, align 4
  store %"struct.std::_Vector_base<unsigned int, std::allocator<unsigned int> >::_Vector_impl"* %this, %"struct.std::_Vector_base<unsigned int, std::allocator<unsigned int> >::_Vector_impl"** %this.addr, align 4
  store %"class.std::allocator.7"* %__a, %"class.std::allocator.7"** %__a.addr, align 4
  %this1 = load %"struct.std::_Vector_base<unsigned int, std::allocator<unsigned int> >::_Vector_impl"** %this.addr
  %0 = load %"class.std::allocator.7"** %__a.addr
  call void @_ZNSt12_Vector_baseIjSaIjEE12_Vector_implC2ERKS0_(%"struct.std::_Vector_base<unsigned int, std::allocator<unsigned int> >::_Vector_impl"* %this1, %"class.std::allocator.7"* %0)
  ret void
}

define linkonce_odr i32* @_ZNSt12_Vector_baseIjSaIjEE11_M_allocateEj(%"struct.std::_Vector_base.6"* %this, i32 %__n) align 2 {
entry:
  %this.addr = alloca %"struct.std::_Vector_base.6"*, align 4
  %__n.addr = alloca i32, align 4
  store %"struct.std::_Vector_base.6"* %this, %"struct.std::_Vector_base.6"** %this.addr, align 4
  store i32 %__n, i32* %__n.addr, align 4
  %this1 = load %"struct.std::_Vector_base.6"** %this.addr
  %0 = load i32* %__n.addr, align 4
  %cmp = icmp ne i32 %0, 0
  br i1 %cmp, label %cond.true, label %cond.false

cond.true:                                        ; preds = %entry
  %_M_impl = getelementptr inbounds %"struct.std::_Vector_base.6"* %this1, i32 0, i32 0
  %1 = bitcast %"struct.std::_Vector_base<unsigned int, std::allocator<unsigned int> >::_Vector_impl"* %_M_impl to %"class.__gnu_cxx::new_allocator.8"*
  %2 = load i32* %__n.addr, align 4
  %call = call i32* @_ZN9__gnu_cxx13new_allocatorIjE8allocateEjPKv(%"class.__gnu_cxx::new_allocator.8"* %1, i32 %2, i8* null)
  br label %cond.end

cond.false:                                       ; preds = %entry
  br label %cond.end

cond.end:                                         ; preds = %cond.false, %cond.true
  %cond = phi i32* [ %call, %cond.true ], [ null, %cond.false ]
  ret i32* %cond
}

define linkonce_odr i32* @_ZN9__gnu_cxx13new_allocatorIjE8allocateEjPKv(%"class.__gnu_cxx::new_allocator.8"* %this, i32 %__n, i8*) align 2 {
entry:
  %this.addr = alloca %"class.__gnu_cxx::new_allocator.8"*, align 4
  %__n.addr = alloca i32, align 4
  %.addr = alloca i8*, align 4
  store %"class.__gnu_cxx::new_allocator.8"* %this, %"class.__gnu_cxx::new_allocator.8"** %this.addr, align 4
  store i32 %__n, i32* %__n.addr, align 4
  store i8* %0, i8** %.addr, align 4
  %this1 = load %"class.__gnu_cxx::new_allocator.8"** %this.addr
  %1 = load i32* %__n.addr, align 4
  %call = call i32 @_ZNK9__gnu_cxx13new_allocatorIjE8max_sizeEv(%"class.__gnu_cxx::new_allocator.8"* %this1) nounwind
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

define linkonce_odr i32 @_ZNK9__gnu_cxx13new_allocatorIjE8max_sizeEv(%"class.__gnu_cxx::new_allocator.8"* %this) nounwind align 2 {
entry:
  %this.addr = alloca %"class.__gnu_cxx::new_allocator.8"*, align 4
  store %"class.__gnu_cxx::new_allocator.8"* %this, %"class.__gnu_cxx::new_allocator.8"** %this.addr, align 4
  %this1 = load %"class.__gnu_cxx::new_allocator.8"** %this.addr
  ret i32 1073741823
}

define linkonce_odr void @_ZNSt12_Vector_baseIjSaIjEE12_Vector_implC2ERKS0_(%"struct.std::_Vector_base<unsigned int, std::allocator<unsigned int> >::_Vector_impl"* %this, %"class.std::allocator.7"* %__a) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"struct.std::_Vector_base<unsigned int, std::allocator<unsigned int> >::_Vector_impl"*, align 4
  %__a.addr = alloca %"class.std::allocator.7"*, align 4
  store %"struct.std::_Vector_base<unsigned int, std::allocator<unsigned int> >::_Vector_impl"* %this, %"struct.std::_Vector_base<unsigned int, std::allocator<unsigned int> >::_Vector_impl"** %this.addr, align 4
  store %"class.std::allocator.7"* %__a, %"class.std::allocator.7"** %__a.addr, align 4
  %this1 = load %"struct.std::_Vector_base<unsigned int, std::allocator<unsigned int> >::_Vector_impl"** %this.addr
  %0 = bitcast %"struct.std::_Vector_base<unsigned int, std::allocator<unsigned int> >::_Vector_impl"* %this1 to %"class.std::allocator.7"*
  %1 = load %"class.std::allocator.7"** %__a.addr, align 4
  call void @_ZNSaIjEC2ERKS_(%"class.std::allocator.7"* %0, %"class.std::allocator.7"* %1) nounwind
  %_M_start = getelementptr inbounds %"struct.std::_Vector_base<unsigned int, std::allocator<unsigned int> >::_Vector_impl"* %this1, i32 0, i32 0
  store i32* null, i32** %_M_start, align 4
  %_M_finish = getelementptr inbounds %"struct.std::_Vector_base<unsigned int, std::allocator<unsigned int> >::_Vector_impl"* %this1, i32 0, i32 1
  store i32* null, i32** %_M_finish, align 4
  %_M_end_of_storage = getelementptr inbounds %"struct.std::_Vector_base<unsigned int, std::allocator<unsigned int> >::_Vector_impl"* %this1, i32 0, i32 2
  store i32* null, i32** %_M_end_of_storage, align 4
  ret void
}

define linkonce_odr void @_ZNSaIjEC2ERKS_(%"class.std::allocator.7"* %this, %"class.std::allocator.7"* %__a) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.std::allocator.7"*, align 4
  %__a.addr = alloca %"class.std::allocator.7"*, align 4
  store %"class.std::allocator.7"* %this, %"class.std::allocator.7"** %this.addr, align 4
  store %"class.std::allocator.7"* %__a, %"class.std::allocator.7"** %__a.addr, align 4
  %this1 = load %"class.std::allocator.7"** %this.addr
  %0 = bitcast %"class.std::allocator.7"* %this1 to %"class.__gnu_cxx::new_allocator.8"*
  %1 = load %"class.std::allocator.7"** %__a.addr, align 4
  %2 = bitcast %"class.std::allocator.7"* %1 to %"class.__gnu_cxx::new_allocator.8"*
  call void @_ZN9__gnu_cxx13new_allocatorIjEC2ERKS1_(%"class.__gnu_cxx::new_allocator.8"* %0, %"class.__gnu_cxx::new_allocator.8"* %2) nounwind
  ret void
}

define linkonce_odr void @_ZN9__gnu_cxx13new_allocatorIjEC2ERKS1_(%"class.__gnu_cxx::new_allocator.8"* %this, %"class.__gnu_cxx::new_allocator.8"*) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.__gnu_cxx::new_allocator.8"*, align 4
  %.addr = alloca %"class.__gnu_cxx::new_allocator.8"*, align 4
  store %"class.__gnu_cxx::new_allocator.8"* %this, %"class.__gnu_cxx::new_allocator.8"** %this.addr, align 4
  store %"class.__gnu_cxx::new_allocator.8"* %0, %"class.__gnu_cxx::new_allocator.8"** %.addr, align 4
  %this1 = load %"class.__gnu_cxx::new_allocator.8"** %this.addr
  ret void
}

define linkonce_odr void @_ZNSaIiEC2Ev(%"class.std::allocator.2"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.std::allocator.2"*, align 4
  store %"class.std::allocator.2"* %this, %"class.std::allocator.2"** %this.addr, align 4
  %this1 = load %"class.std::allocator.2"** %this.addr
  %0 = bitcast %"class.std::allocator.2"* %this1 to %"class.__gnu_cxx::new_allocator.3"*
  call void @_ZN9__gnu_cxx13new_allocatorIiEC2Ev(%"class.__gnu_cxx::new_allocator.3"* %0) nounwind
  ret void
}

define linkonce_odr void @_ZN9__gnu_cxx13new_allocatorIiEC2Ev(%"class.__gnu_cxx::new_allocator.3"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.__gnu_cxx::new_allocator.3"*, align 4
  store %"class.__gnu_cxx::new_allocator.3"* %this, %"class.__gnu_cxx::new_allocator.3"** %this.addr, align 4
  %this1 = load %"class.__gnu_cxx::new_allocator.3"** %this.addr
  ret void
}

define linkonce_odr void @_ZNSt6vectorIiSaIiEEC2EjRKiRKS0_(%"class.std::vector.0"* %this, i32 %__n, i32* %__value, %"class.std::allocator.2"* %__a) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.std::vector.0"*, align 4
  %__n.addr = alloca i32, align 4
  %__value.addr = alloca i32*, align 4
  %__a.addr = alloca %"class.std::allocator.2"*, align 4
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  store %"class.std::vector.0"* %this, %"class.std::vector.0"** %this.addr, align 4
  store i32 %__n, i32* %__n.addr, align 4
  store i32* %__value, i32** %__value.addr, align 4
  store %"class.std::allocator.2"* %__a, %"class.std::allocator.2"** %__a.addr, align 4
  %this1 = load %"class.std::vector.0"** %this.addr
  %0 = bitcast %"class.std::vector.0"* %this1 to %"struct.std::_Vector_base.1"*
  %1 = load i32* %__n.addr, align 4
  %2 = load %"class.std::allocator.2"** %__a.addr, align 4
  call void @_ZNSt12_Vector_baseIiSaIiEEC2EjRKS0_(%"struct.std::_Vector_base.1"* %0, i32 %1, %"class.std::allocator.2"* %2)
  %3 = load i32* %__n.addr, align 4
  %4 = load i32** %__value.addr, align 4
  invoke void @_ZNSt6vectorIiSaIiEE18_M_fill_initializeEjRKi(%"class.std::vector.0"* %this1, i32 %3, i32* %4)
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
  %8 = bitcast %"class.std::vector.0"* %this1 to %"struct.std::_Vector_base.1"*
  invoke void @_ZNSt12_Vector_baseIiSaIiEED2Ev(%"struct.std::_Vector_base.1"* %8)
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

define linkonce_odr void @_ZNSt12_Vector_baseIiSaIiEEC2EjRKS0_(%"struct.std::_Vector_base.1"* %this, i32 %__n, %"class.std::allocator.2"* %__a) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"struct.std::_Vector_base.1"*, align 4
  %__n.addr = alloca i32, align 4
  %__a.addr = alloca %"class.std::allocator.2"*, align 4
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  store %"struct.std::_Vector_base.1"* %this, %"struct.std::_Vector_base.1"** %this.addr, align 4
  store i32 %__n, i32* %__n.addr, align 4
  store %"class.std::allocator.2"* %__a, %"class.std::allocator.2"** %__a.addr, align 4
  %this1 = load %"struct.std::_Vector_base.1"** %this.addr
  %_M_impl = getelementptr inbounds %"struct.std::_Vector_base.1"* %this1, i32 0, i32 0
  %0 = load %"class.std::allocator.2"** %__a.addr, align 4
  call void @_ZNSt12_Vector_baseIiSaIiEE12_Vector_implC1ERKS0_(%"struct.std::_Vector_base<int, std::allocator<int> >::_Vector_impl"* %_M_impl, %"class.std::allocator.2"* %0)
  %1 = load i32* %__n.addr, align 4
  %call = invoke i32* @_ZNSt12_Vector_baseIiSaIiEE11_M_allocateEj(%"struct.std::_Vector_base.1"* %this1, i32 %1)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %entry
  %_M_impl2 = getelementptr inbounds %"struct.std::_Vector_base.1"* %this1, i32 0, i32 0
  %_M_start = getelementptr inbounds %"struct.std::_Vector_base<int, std::allocator<int> >::_Vector_impl"* %_M_impl2, i32 0, i32 0
  store i32* %call, i32** %_M_start, align 4
  %_M_impl3 = getelementptr inbounds %"struct.std::_Vector_base.1"* %this1, i32 0, i32 0
  %_M_start4 = getelementptr inbounds %"struct.std::_Vector_base<int, std::allocator<int> >::_Vector_impl"* %_M_impl3, i32 0, i32 0
  %2 = load i32** %_M_start4, align 4
  %_M_impl5 = getelementptr inbounds %"struct.std::_Vector_base.1"* %this1, i32 0, i32 0
  %_M_finish = getelementptr inbounds %"struct.std::_Vector_base<int, std::allocator<int> >::_Vector_impl"* %_M_impl5, i32 0, i32 1
  store i32* %2, i32** %_M_finish, align 4
  %_M_impl6 = getelementptr inbounds %"struct.std::_Vector_base.1"* %this1, i32 0, i32 0
  %_M_start7 = getelementptr inbounds %"struct.std::_Vector_base<int, std::allocator<int> >::_Vector_impl"* %_M_impl6, i32 0, i32 0
  %3 = load i32** %_M_start7, align 4
  %4 = load i32* %__n.addr, align 4
  %add.ptr = getelementptr inbounds i32* %3, i32 %4
  %_M_impl8 = getelementptr inbounds %"struct.std::_Vector_base.1"* %this1, i32 0, i32 0
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

define linkonce_odr void @_ZNSt6vectorIiSaIiEE18_M_fill_initializeEjRKi(%"class.std::vector.0"* %this, i32 %__n, i32* %__value) align 2 {
entry:
  %this.addr = alloca %"class.std::vector.0"*, align 4
  %__n.addr = alloca i32, align 4
  %__value.addr = alloca i32*, align 4
  store %"class.std::vector.0"* %this, %"class.std::vector.0"** %this.addr, align 4
  store i32 %__n, i32* %__n.addr, align 4
  store i32* %__value, i32** %__value.addr, align 4
  %this1 = load %"class.std::vector.0"** %this.addr
  %0 = bitcast %"class.std::vector.0"* %this1 to %"struct.std::_Vector_base.1"*
  %_M_impl = getelementptr inbounds %"struct.std::_Vector_base.1"* %0, i32 0, i32 0
  %_M_start = getelementptr inbounds %"struct.std::_Vector_base<int, std::allocator<int> >::_Vector_impl"* %_M_impl, i32 0, i32 0
  %1 = load i32** %_M_start, align 4
  %2 = load i32* %__n.addr, align 4
  %3 = load i32** %__value.addr, align 4
  %4 = bitcast %"class.std::vector.0"* %this1 to %"struct.std::_Vector_base.1"*
  %call = call %"class.std::allocator.2"* @_ZNSt12_Vector_baseIiSaIiEE19_M_get_Tp_allocatorEv(%"struct.std::_Vector_base.1"* %4)
  call void @_ZSt24__uninitialized_fill_n_aIPijiiEvT_T0_RKT1_RSaIT2_E(i32* %1, i32 %2, i32* %3, %"class.std::allocator.2"* %call)
  %5 = bitcast %"class.std::vector.0"* %this1 to %"struct.std::_Vector_base.1"*
  %_M_impl2 = getelementptr inbounds %"struct.std::_Vector_base.1"* %5, i32 0, i32 0
  %_M_end_of_storage = getelementptr inbounds %"struct.std::_Vector_base<int, std::allocator<int> >::_Vector_impl"* %_M_impl2, i32 0, i32 2
  %6 = load i32** %_M_end_of_storage, align 4
  %7 = bitcast %"class.std::vector.0"* %this1 to %"struct.std::_Vector_base.1"*
  %_M_impl3 = getelementptr inbounds %"struct.std::_Vector_base.1"* %7, i32 0, i32 0
  %_M_finish = getelementptr inbounds %"struct.std::_Vector_base<int, std::allocator<int> >::_Vector_impl"* %_M_impl3, i32 0, i32 1
  store i32* %6, i32** %_M_finish, align 4
  ret void
}

define linkonce_odr void @_ZSt24__uninitialized_fill_n_aIPijiiEvT_T0_RKT1_RSaIT2_E(i32* %__first, i32 %__n, i32* %__x, %"class.std::allocator.2"*) inlinehint {
entry:
  %__first.addr = alloca i32*, align 4
  %__n.addr = alloca i32, align 4
  %__x.addr = alloca i32*, align 4
  %.addr = alloca %"class.std::allocator.2"*, align 4
  store i32* %__first, i32** %__first.addr, align 4
  store i32 %__n, i32* %__n.addr, align 4
  store i32* %__x, i32** %__x.addr, align 4
  store %"class.std::allocator.2"* %0, %"class.std::allocator.2"** %.addr, align 4
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

define linkonce_odr void @_ZNSt12_Vector_baseIiSaIiEE12_Vector_implC1ERKS0_(%"struct.std::_Vector_base<int, std::allocator<int> >::_Vector_impl"* %this, %"class.std::allocator.2"* %__a) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"struct.std::_Vector_base<int, std::allocator<int> >::_Vector_impl"*, align 4
  %__a.addr = alloca %"class.std::allocator.2"*, align 4
  store %"struct.std::_Vector_base<int, std::allocator<int> >::_Vector_impl"* %this, %"struct.std::_Vector_base<int, std::allocator<int> >::_Vector_impl"** %this.addr, align 4
  store %"class.std::allocator.2"* %__a, %"class.std::allocator.2"** %__a.addr, align 4
  %this1 = load %"struct.std::_Vector_base<int, std::allocator<int> >::_Vector_impl"** %this.addr
  %0 = load %"class.std::allocator.2"** %__a.addr
  call void @_ZNSt12_Vector_baseIiSaIiEE12_Vector_implC2ERKS0_(%"struct.std::_Vector_base<int, std::allocator<int> >::_Vector_impl"* %this1, %"class.std::allocator.2"* %0)
  ret void
}

define linkonce_odr i32* @_ZNSt12_Vector_baseIiSaIiEE11_M_allocateEj(%"struct.std::_Vector_base.1"* %this, i32 %__n) align 2 {
entry:
  %this.addr = alloca %"struct.std::_Vector_base.1"*, align 4
  %__n.addr = alloca i32, align 4
  store %"struct.std::_Vector_base.1"* %this, %"struct.std::_Vector_base.1"** %this.addr, align 4
  store i32 %__n, i32* %__n.addr, align 4
  %this1 = load %"struct.std::_Vector_base.1"** %this.addr
  %0 = load i32* %__n.addr, align 4
  %cmp = icmp ne i32 %0, 0
  br i1 %cmp, label %cond.true, label %cond.false

cond.true:                                        ; preds = %entry
  %_M_impl = getelementptr inbounds %"struct.std::_Vector_base.1"* %this1, i32 0, i32 0
  %1 = bitcast %"struct.std::_Vector_base<int, std::allocator<int> >::_Vector_impl"* %_M_impl to %"class.__gnu_cxx::new_allocator.3"*
  %2 = load i32* %__n.addr, align 4
  %call = call i32* @_ZN9__gnu_cxx13new_allocatorIiE8allocateEjPKv(%"class.__gnu_cxx::new_allocator.3"* %1, i32 %2, i8* null)
  br label %cond.end

cond.false:                                       ; preds = %entry
  br label %cond.end

cond.end:                                         ; preds = %cond.false, %cond.true
  %cond = phi i32* [ %call, %cond.true ], [ null, %cond.false ]
  ret i32* %cond
}

define linkonce_odr i32* @_ZN9__gnu_cxx13new_allocatorIiE8allocateEjPKv(%"class.__gnu_cxx::new_allocator.3"* %this, i32 %__n, i8*) align 2 {
entry:
  %this.addr = alloca %"class.__gnu_cxx::new_allocator.3"*, align 4
  %__n.addr = alloca i32, align 4
  %.addr = alloca i8*, align 4
  store %"class.__gnu_cxx::new_allocator.3"* %this, %"class.__gnu_cxx::new_allocator.3"** %this.addr, align 4
  store i32 %__n, i32* %__n.addr, align 4
  store i8* %0, i8** %.addr, align 4
  %this1 = load %"class.__gnu_cxx::new_allocator.3"** %this.addr
  %1 = load i32* %__n.addr, align 4
  %call = call i32 @_ZNK9__gnu_cxx13new_allocatorIiE8max_sizeEv(%"class.__gnu_cxx::new_allocator.3"* %this1) nounwind
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

define linkonce_odr i32 @_ZNK9__gnu_cxx13new_allocatorIiE8max_sizeEv(%"class.__gnu_cxx::new_allocator.3"* %this) nounwind align 2 {
entry:
  %this.addr = alloca %"class.__gnu_cxx::new_allocator.3"*, align 4
  store %"class.__gnu_cxx::new_allocator.3"* %this, %"class.__gnu_cxx::new_allocator.3"** %this.addr, align 4
  %this1 = load %"class.__gnu_cxx::new_allocator.3"** %this.addr
  ret i32 1073741823
}

define linkonce_odr void @_ZNSt12_Vector_baseIiSaIiEE12_Vector_implC2ERKS0_(%"struct.std::_Vector_base<int, std::allocator<int> >::_Vector_impl"* %this, %"class.std::allocator.2"* %__a) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"struct.std::_Vector_base<int, std::allocator<int> >::_Vector_impl"*, align 4
  %__a.addr = alloca %"class.std::allocator.2"*, align 4
  store %"struct.std::_Vector_base<int, std::allocator<int> >::_Vector_impl"* %this, %"struct.std::_Vector_base<int, std::allocator<int> >::_Vector_impl"** %this.addr, align 4
  store %"class.std::allocator.2"* %__a, %"class.std::allocator.2"** %__a.addr, align 4
  %this1 = load %"struct.std::_Vector_base<int, std::allocator<int> >::_Vector_impl"** %this.addr
  %0 = bitcast %"struct.std::_Vector_base<int, std::allocator<int> >::_Vector_impl"* %this1 to %"class.std::allocator.2"*
  %1 = load %"class.std::allocator.2"** %__a.addr, align 4
  call void @_ZNSaIiEC2ERKS_(%"class.std::allocator.2"* %0, %"class.std::allocator.2"* %1) nounwind
  %_M_start = getelementptr inbounds %"struct.std::_Vector_base<int, std::allocator<int> >::_Vector_impl"* %this1, i32 0, i32 0
  store i32* null, i32** %_M_start, align 4
  %_M_finish = getelementptr inbounds %"struct.std::_Vector_base<int, std::allocator<int> >::_Vector_impl"* %this1, i32 0, i32 1
  store i32* null, i32** %_M_finish, align 4
  %_M_end_of_storage = getelementptr inbounds %"struct.std::_Vector_base<int, std::allocator<int> >::_Vector_impl"* %this1, i32 0, i32 2
  store i32* null, i32** %_M_end_of_storage, align 4
  ret void
}

define linkonce_odr void @_ZNSaIiEC2ERKS_(%"class.std::allocator.2"* %this, %"class.std::allocator.2"* %__a) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.std::allocator.2"*, align 4
  %__a.addr = alloca %"class.std::allocator.2"*, align 4
  store %"class.std::allocator.2"* %this, %"class.std::allocator.2"** %this.addr, align 4
  store %"class.std::allocator.2"* %__a, %"class.std::allocator.2"** %__a.addr, align 4
  %this1 = load %"class.std::allocator.2"** %this.addr
  %0 = bitcast %"class.std::allocator.2"* %this1 to %"class.__gnu_cxx::new_allocator.3"*
  %1 = load %"class.std::allocator.2"** %__a.addr, align 4
  %2 = bitcast %"class.std::allocator.2"* %1 to %"class.__gnu_cxx::new_allocator.3"*
  call void @_ZN9__gnu_cxx13new_allocatorIiEC2ERKS1_(%"class.__gnu_cxx::new_allocator.3"* %0, %"class.__gnu_cxx::new_allocator.3"* %2) nounwind
  ret void
}

define linkonce_odr void @_ZN9__gnu_cxx13new_allocatorIiEC2ERKS1_(%"class.__gnu_cxx::new_allocator.3"* %this, %"class.__gnu_cxx::new_allocator.3"*) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.__gnu_cxx::new_allocator.3"*, align 4
  %.addr = alloca %"class.__gnu_cxx::new_allocator.3"*, align 4
  store %"class.__gnu_cxx::new_allocator.3"* %this, %"class.__gnu_cxx::new_allocator.3"** %this.addr, align 4
  store %"class.__gnu_cxx::new_allocator.3"* %0, %"class.__gnu_cxx::new_allocator.3"** %.addr, align 4
  %this1 = load %"class.__gnu_cxx::new_allocator.3"** %this.addr
  ret void
}

define linkonce_odr void @_ZN5boost12indirect_cmpIPfSt4lessIfEEC2ERKS1_RKS3_(%"class.boost::indirect_cmp"* %this, float** %df, %"struct.std::less"* %c) unnamed_addr nounwind inlinehint align 2 {
entry:
  %this.addr = alloca %"class.boost::indirect_cmp"*, align 4
  %df.addr = alloca float**, align 4
  %c.addr = alloca %"struct.std::less"*, align 4
  store %"class.boost::indirect_cmp"* %this, %"class.boost::indirect_cmp"** %this.addr, align 4
  store float** %df, float*** %df.addr, align 4
  store %"struct.std::less"* %c, %"struct.std::less"** %c.addr, align 4
  %this1 = load %"class.boost::indirect_cmp"** %this.addr
  %d = getelementptr inbounds %"class.boost::indirect_cmp"* %this1, i32 0, i32 0
  %0 = load float*** %df.addr, align 4
  %1 = load float** %0, align 4
  store float* %1, float** %d, align 4
  %cmp = getelementptr inbounds %"class.boost::indirect_cmp"* %this1, i32 0, i32 1
  %2 = load %"struct.std::less"** %c.addr, align 4
  ret void
}

define linkonce_odr void @_ZNSt6vectorIfSaIfEEC2EjRKfRKS0_(%"class.std::vector"* %this, i32 %__n, float* %__value, %"class.std::allocator"* %__a) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.std::vector"*, align 4
  %__n.addr = alloca i32, align 4
  %__value.addr = alloca float*, align 4
  %__a.addr = alloca %"class.std::allocator"*, align 4
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  store %"class.std::vector"* %this, %"class.std::vector"** %this.addr, align 4
  store i32 %__n, i32* %__n.addr, align 4
  store float* %__value, float** %__value.addr, align 4
  store %"class.std::allocator"* %__a, %"class.std::allocator"** %__a.addr, align 4
  %this1 = load %"class.std::vector"** %this.addr
  %0 = bitcast %"class.std::vector"* %this1 to %"struct.std::_Vector_base"*
  %1 = load i32* %__n.addr, align 4
  %2 = load %"class.std::allocator"** %__a.addr, align 4
  call void @_ZNSt12_Vector_baseIfSaIfEEC2EjRKS0_(%"struct.std::_Vector_base"* %0, i32 %1, %"class.std::allocator"* %2)
  %3 = load i32* %__n.addr, align 4
  %4 = load float** %__value.addr, align 4
  invoke void @_ZNSt6vectorIfSaIfEE18_M_fill_initializeEjRKf(%"class.std::vector"* %this1, i32 %3, float* %4)
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
  invoke void @_ZNSt12_Vector_baseIfSaIfEED2Ev(%"struct.std::_Vector_base"* %8)
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

define linkonce_odr void @_ZNSt12_Vector_baseIfSaIfEEC2EjRKS0_(%"struct.std::_Vector_base"* %this, i32 %__n, %"class.std::allocator"* %__a) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"struct.std::_Vector_base"*, align 4
  %__n.addr = alloca i32, align 4
  %__a.addr = alloca %"class.std::allocator"*, align 4
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  store %"struct.std::_Vector_base"* %this, %"struct.std::_Vector_base"** %this.addr, align 4
  store i32 %__n, i32* %__n.addr, align 4
  store %"class.std::allocator"* %__a, %"class.std::allocator"** %__a.addr, align 4
  %this1 = load %"struct.std::_Vector_base"** %this.addr
  %_M_impl = getelementptr inbounds %"struct.std::_Vector_base"* %this1, i32 0, i32 0
  %0 = load %"class.std::allocator"** %__a.addr, align 4
  call void @_ZNSt12_Vector_baseIfSaIfEE12_Vector_implC1ERKS0_(%"struct.std::_Vector_base<float, std::allocator<float> >::_Vector_impl"* %_M_impl, %"class.std::allocator"* %0)
  %1 = load i32* %__n.addr, align 4
  %call = invoke float* @_ZNSt12_Vector_baseIfSaIfEE11_M_allocateEj(%"struct.std::_Vector_base"* %this1, i32 %1)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %entry
  %_M_impl2 = getelementptr inbounds %"struct.std::_Vector_base"* %this1, i32 0, i32 0
  %_M_start = getelementptr inbounds %"struct.std::_Vector_base<float, std::allocator<float> >::_Vector_impl"* %_M_impl2, i32 0, i32 0
  store float* %call, float** %_M_start, align 4
  %_M_impl3 = getelementptr inbounds %"struct.std::_Vector_base"* %this1, i32 0, i32 0
  %_M_start4 = getelementptr inbounds %"struct.std::_Vector_base<float, std::allocator<float> >::_Vector_impl"* %_M_impl3, i32 0, i32 0
  %2 = load float** %_M_start4, align 4
  %_M_impl5 = getelementptr inbounds %"struct.std::_Vector_base"* %this1, i32 0, i32 0
  %_M_finish = getelementptr inbounds %"struct.std::_Vector_base<float, std::allocator<float> >::_Vector_impl"* %_M_impl5, i32 0, i32 1
  store float* %2, float** %_M_finish, align 4
  %_M_impl6 = getelementptr inbounds %"struct.std::_Vector_base"* %this1, i32 0, i32 0
  %_M_start7 = getelementptr inbounds %"struct.std::_Vector_base<float, std::allocator<float> >::_Vector_impl"* %_M_impl6, i32 0, i32 0
  %3 = load float** %_M_start7, align 4
  %4 = load i32* %__n.addr, align 4
  %add.ptr = getelementptr inbounds float* %3, i32 %4
  %_M_impl8 = getelementptr inbounds %"struct.std::_Vector_base"* %this1, i32 0, i32 0
  %_M_end_of_storage = getelementptr inbounds %"struct.std::_Vector_base<float, std::allocator<float> >::_Vector_impl"* %_M_impl8, i32 0, i32 2
  store float* %add.ptr, float** %_M_end_of_storage, align 4
  ret void

lpad:                                             ; preds = %entry
  %5 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %6 = extractvalue { i8*, i32 } %5, 0
  store i8* %6, i8** %exn.slot
  %7 = extractvalue { i8*, i32 } %5, 1
  store i32 %7, i32* %ehselector.slot
  call void @_ZNSt12_Vector_baseIfSaIfEE12_Vector_implD1Ev(%"struct.std::_Vector_base<float, std::allocator<float> >::_Vector_impl"* %_M_impl) nounwind
  br label %eh.resume

eh.resume:                                        ; preds = %lpad
  %exn = load i8** %exn.slot
  %sel = load i32* %ehselector.slot
  %lpad.val = insertvalue { i8*, i32 } undef, i8* %exn, 0
  %lpad.val9 = insertvalue { i8*, i32 } %lpad.val, i32 %sel, 1
  resume { i8*, i32 } %lpad.val9
}

define linkonce_odr void @_ZNSt6vectorIfSaIfEE18_M_fill_initializeEjRKf(%"class.std::vector"* %this, i32 %__n, float* %__value) align 2 {
entry:
  %this.addr = alloca %"class.std::vector"*, align 4
  %__n.addr = alloca i32, align 4
  %__value.addr = alloca float*, align 4
  store %"class.std::vector"* %this, %"class.std::vector"** %this.addr, align 4
  store i32 %__n, i32* %__n.addr, align 4
  store float* %__value, float** %__value.addr, align 4
  %this1 = load %"class.std::vector"** %this.addr
  %0 = bitcast %"class.std::vector"* %this1 to %"struct.std::_Vector_base"*
  %_M_impl = getelementptr inbounds %"struct.std::_Vector_base"* %0, i32 0, i32 0
  %_M_start = getelementptr inbounds %"struct.std::_Vector_base<float, std::allocator<float> >::_Vector_impl"* %_M_impl, i32 0, i32 0
  %1 = load float** %_M_start, align 4
  %2 = load i32* %__n.addr, align 4
  %3 = load float** %__value.addr, align 4
  %4 = bitcast %"class.std::vector"* %this1 to %"struct.std::_Vector_base"*
  %call = call %"class.std::allocator"* @_ZNSt12_Vector_baseIfSaIfEE19_M_get_Tp_allocatorEv(%"struct.std::_Vector_base"* %4)
  call void @_ZSt24__uninitialized_fill_n_aIPfjffEvT_T0_RKT1_RSaIT2_E(float* %1, i32 %2, float* %3, %"class.std::allocator"* %call)
  %5 = bitcast %"class.std::vector"* %this1 to %"struct.std::_Vector_base"*
  %_M_impl2 = getelementptr inbounds %"struct.std::_Vector_base"* %5, i32 0, i32 0
  %_M_end_of_storage = getelementptr inbounds %"struct.std::_Vector_base<float, std::allocator<float> >::_Vector_impl"* %_M_impl2, i32 0, i32 2
  %6 = load float** %_M_end_of_storage, align 4
  %7 = bitcast %"class.std::vector"* %this1 to %"struct.std::_Vector_base"*
  %_M_impl3 = getelementptr inbounds %"struct.std::_Vector_base"* %7, i32 0, i32 0
  %_M_finish = getelementptr inbounds %"struct.std::_Vector_base<float, std::allocator<float> >::_Vector_impl"* %_M_impl3, i32 0, i32 1
  store float* %6, float** %_M_finish, align 4
  ret void
}

define linkonce_odr void @_ZNSt12_Vector_baseIfSaIfEED2Ev(%"struct.std::_Vector_base"* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"struct.std::_Vector_base"*, align 4
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  store %"struct.std::_Vector_base"* %this, %"struct.std::_Vector_base"** %this.addr, align 4
  %this1 = load %"struct.std::_Vector_base"** %this.addr
  %_M_impl = getelementptr inbounds %"struct.std::_Vector_base"* %this1, i32 0, i32 0
  %_M_start = getelementptr inbounds %"struct.std::_Vector_base<float, std::allocator<float> >::_Vector_impl"* %_M_impl, i32 0, i32 0
  %0 = load float** %_M_start, align 4
  %_M_impl2 = getelementptr inbounds %"struct.std::_Vector_base"* %this1, i32 0, i32 0
  %_M_end_of_storage = getelementptr inbounds %"struct.std::_Vector_base<float, std::allocator<float> >::_Vector_impl"* %_M_impl2, i32 0, i32 2
  %1 = load float** %_M_end_of_storage, align 4
  %_M_impl3 = getelementptr inbounds %"struct.std::_Vector_base"* %this1, i32 0, i32 0
  %_M_start4 = getelementptr inbounds %"struct.std::_Vector_base<float, std::allocator<float> >::_Vector_impl"* %_M_impl3, i32 0, i32 0
  %2 = load float** %_M_start4, align 4
  %sub.ptr.lhs.cast = ptrtoint float* %1 to i32
  %sub.ptr.rhs.cast = ptrtoint float* %2 to i32
  %sub.ptr.sub = sub i32 %sub.ptr.lhs.cast, %sub.ptr.rhs.cast
  %sub.ptr.div = sdiv exact i32 %sub.ptr.sub, 4
  invoke void @_ZNSt12_Vector_baseIfSaIfEE13_M_deallocateEPfj(%"struct.std::_Vector_base"* %this1, float* %0, i32 %sub.ptr.div)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %entry
  %_M_impl5 = getelementptr inbounds %"struct.std::_Vector_base"* %this1, i32 0, i32 0
  call void @_ZNSt12_Vector_baseIfSaIfEE12_Vector_implD1Ev(%"struct.std::_Vector_base<float, std::allocator<float> >::_Vector_impl"* %_M_impl5) nounwind
  ret void

lpad:                                             ; preds = %entry
  %3 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %4 = extractvalue { i8*, i32 } %3, 0
  store i8* %4, i8** %exn.slot
  %5 = extractvalue { i8*, i32 } %3, 1
  store i32 %5, i32* %ehselector.slot
  %_M_impl6 = getelementptr inbounds %"struct.std::_Vector_base"* %this1, i32 0, i32 0
  call void @_ZNSt12_Vector_baseIfSaIfEE12_Vector_implD1Ev(%"struct.std::_Vector_base<float, std::allocator<float> >::_Vector_impl"* %_M_impl6) nounwind
  br label %eh.resume

eh.resume:                                        ; preds = %lpad
  %exn = load i8** %exn.slot
  %sel = load i32* %ehselector.slot
  %lpad.val = insertvalue { i8*, i32 } undef, i8* %exn, 0
  %lpad.val7 = insertvalue { i8*, i32 } %lpad.val, i32 %sel, 1
  resume { i8*, i32 } %lpad.val7
}

define linkonce_odr void @_ZNSt12_Vector_baseIfSaIfEE12_Vector_implD1Ev(%"struct.std::_Vector_base<float, std::allocator<float> >::_Vector_impl"* %this) unnamed_addr nounwind inlinehint align 2 {
entry:
  %this.addr = alloca %"struct.std::_Vector_base<float, std::allocator<float> >::_Vector_impl"*, align 4
  store %"struct.std::_Vector_base<float, std::allocator<float> >::_Vector_impl"* %this, %"struct.std::_Vector_base<float, std::allocator<float> >::_Vector_impl"** %this.addr, align 4
  %this1 = load %"struct.std::_Vector_base<float, std::allocator<float> >::_Vector_impl"** %this.addr
  call void @_ZNSt12_Vector_baseIfSaIfEE12_Vector_implD2Ev(%"struct.std::_Vector_base<float, std::allocator<float> >::_Vector_impl"* %this1) nounwind
  ret void
}

define linkonce_odr void @_ZNSt12_Vector_baseIfSaIfEE12_Vector_implD2Ev(%"struct.std::_Vector_base<float, std::allocator<float> >::_Vector_impl"* %this) unnamed_addr nounwind inlinehint align 2 {
entry:
  %this.addr = alloca %"struct.std::_Vector_base<float, std::allocator<float> >::_Vector_impl"*, align 4
  store %"struct.std::_Vector_base<float, std::allocator<float> >::_Vector_impl"* %this, %"struct.std::_Vector_base<float, std::allocator<float> >::_Vector_impl"** %this.addr, align 4
  %this1 = load %"struct.std::_Vector_base<float, std::allocator<float> >::_Vector_impl"** %this.addr
  %0 = bitcast %"struct.std::_Vector_base<float, std::allocator<float> >::_Vector_impl"* %this1 to %"class.std::allocator"*
  call void @_ZNSaIfED2Ev(%"class.std::allocator"* %0) nounwind
  ret void
}

define linkonce_odr void @_ZNSaIfED2Ev(%"class.std::allocator"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.std::allocator"*, align 4
  store %"class.std::allocator"* %this, %"class.std::allocator"** %this.addr, align 4
  %this1 = load %"class.std::allocator"** %this.addr
  %0 = bitcast %"class.std::allocator"* %this1 to %"class.__gnu_cxx::new_allocator"*
  call void @_ZN9__gnu_cxx13new_allocatorIfED2Ev(%"class.__gnu_cxx::new_allocator"* %0) nounwind
  ret void
}

define linkonce_odr void @_ZN9__gnu_cxx13new_allocatorIfED2Ev(%"class.__gnu_cxx::new_allocator"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.__gnu_cxx::new_allocator"*, align 4
  store %"class.__gnu_cxx::new_allocator"* %this, %"class.__gnu_cxx::new_allocator"** %this.addr, align 4
  %this1 = load %"class.__gnu_cxx::new_allocator"** %this.addr
  ret void
}

define linkonce_odr void @_ZSt24__uninitialized_fill_n_aIPfjffEvT_T0_RKT1_RSaIT2_E(float* %__first, i32 %__n, float* %__x, %"class.std::allocator"*) inlinehint {
entry:
  %__first.addr = alloca float*, align 4
  %__n.addr = alloca i32, align 4
  %__x.addr = alloca float*, align 4
  %.addr = alloca %"class.std::allocator"*, align 4
  store float* %__first, float** %__first.addr, align 4
  store i32 %__n, i32* %__n.addr, align 4
  store float* %__x, float** %__x.addr, align 4
  store %"class.std::allocator"* %0, %"class.std::allocator"** %.addr, align 4
  %1 = load float** %__first.addr, align 4
  %2 = load i32* %__n.addr, align 4
  %3 = load float** %__x.addr, align 4
  call void @_ZSt20uninitialized_fill_nIPfjfEvT_T0_RKT1_(float* %1, i32 %2, float* %3)
  ret void
}

define linkonce_odr void @_ZSt20uninitialized_fill_nIPfjfEvT_T0_RKT1_(float* %__first, i32 %__n, float* %__x) inlinehint {
entry:
  %__first.addr = alloca float*, align 4
  %__n.addr = alloca i32, align 4
  %__x.addr = alloca float*, align 4
  store float* %__first, float** %__first.addr, align 4
  store i32 %__n, i32* %__n.addr, align 4
  store float* %__x, float** %__x.addr, align 4
  %0 = load float** %__first.addr, align 4
  %1 = load i32* %__n.addr, align 4
  %2 = load float** %__x.addr, align 4
  call void @_ZNSt22__uninitialized_fill_nILb1EE15__uninit_fill_nIPfjfEEvT_T0_RKT1_(float* %0, i32 %1, float* %2)
  ret void
}

define linkonce_odr void @_ZNSt22__uninitialized_fill_nILb1EE15__uninit_fill_nIPfjfEEvT_T0_RKT1_(float* %__first, i32 %__n, float* %__x) align 2 {
entry:
  %__first.addr = alloca float*, align 4
  %__n.addr = alloca i32, align 4
  %__x.addr = alloca float*, align 4
  store float* %__first, float** %__first.addr, align 4
  store i32 %__n, i32* %__n.addr, align 4
  store float* %__x, float** %__x.addr, align 4
  %0 = load float** %__first.addr, align 4
  %1 = load i32* %__n.addr, align 4
  %2 = load float** %__x.addr, align 4
  %call = call float* @_ZSt6fill_nIPfjfET_S1_T0_RKT1_(float* %0, i32 %1, float* %2)
  ret void
}

define linkonce_odr float* @_ZSt6fill_nIPfjfET_S1_T0_RKT1_(float* %__first, i32 %__n, float* %__value) inlinehint {
entry:
  %__first.addr = alloca float*, align 4
  %__n.addr = alloca i32, align 4
  %__value.addr = alloca float*, align 4
  store float* %__first, float** %__first.addr, align 4
  store i32 %__n, i32* %__n.addr, align 4
  store float* %__value, float** %__value.addr, align 4
  %0 = load float** %__first.addr, align 4
  %call = call float* @_ZSt12__niter_baseIPfENSt11_Niter_baseIT_E13iterator_typeES2_(float* %0)
  %1 = load i32* %__n.addr, align 4
  %2 = load float** %__value.addr, align 4
  %call1 = call float* @_ZSt10__fill_n_aIPfjfEN9__gnu_cxx11__enable_ifIXsr11__is_scalarIT1_EE7__valueET_E6__typeES4_T0_RKS3_(float* %call, i32 %1, float* %2)
  ret float* %call1
}

define linkonce_odr float* @_ZSt10__fill_n_aIPfjfEN9__gnu_cxx11__enable_ifIXsr11__is_scalarIT1_EE7__valueET_E6__typeES4_T0_RKS3_(float* %__first, i32 %__n, float* %__value) nounwind inlinehint {
entry:
  %__first.addr = alloca float*, align 4
  %__n.addr = alloca i32, align 4
  %__value.addr = alloca float*, align 4
  %__tmp = alloca float, align 4
  %__niter = alloca i32, align 4
  store float* %__first, float** %__first.addr, align 4
  store i32 %__n, i32* %__n.addr, align 4
  store float* %__value, float** %__value.addr, align 4
  %0 = load float** %__value.addr, align 4
  %1 = load float* %0, align 4
  store float %1, float* %__tmp, align 4
  %2 = load i32* %__n.addr, align 4
  store i32 %2, i32* %__niter, align 4
  br label %for.cond

for.cond:                                         ; preds = %for.inc, %entry
  %3 = load i32* %__niter, align 4
  %cmp = icmp ugt i32 %3, 0
  br i1 %cmp, label %for.body, label %for.end

for.body:                                         ; preds = %for.cond
  %4 = load float* %__tmp, align 4
  %5 = load float** %__first.addr, align 4
  store float %4, float* %5, align 4
  br label %for.inc

for.inc:                                          ; preds = %for.body
  %6 = load i32* %__niter, align 4
  %dec = add i32 %6, -1
  store i32 %dec, i32* %__niter, align 4
  %7 = load float** %__first.addr, align 4
  %incdec.ptr = getelementptr inbounds float* %7, i32 1
  store float* %incdec.ptr, float** %__first.addr, align 4
  br label %for.cond

for.end:                                          ; preds = %for.cond
  %8 = load float** %__first.addr, align 4
  ret float* %8
}

define linkonce_odr void @_ZNSt12_Vector_baseIfSaIfEE12_Vector_implC1ERKS0_(%"struct.std::_Vector_base<float, std::allocator<float> >::_Vector_impl"* %this, %"class.std::allocator"* %__a) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"struct.std::_Vector_base<float, std::allocator<float> >::_Vector_impl"*, align 4
  %__a.addr = alloca %"class.std::allocator"*, align 4
  store %"struct.std::_Vector_base<float, std::allocator<float> >::_Vector_impl"* %this, %"struct.std::_Vector_base<float, std::allocator<float> >::_Vector_impl"** %this.addr, align 4
  store %"class.std::allocator"* %__a, %"class.std::allocator"** %__a.addr, align 4
  %this1 = load %"struct.std::_Vector_base<float, std::allocator<float> >::_Vector_impl"** %this.addr
  %0 = load %"class.std::allocator"** %__a.addr
  call void @_ZNSt12_Vector_baseIfSaIfEE12_Vector_implC2ERKS0_(%"struct.std::_Vector_base<float, std::allocator<float> >::_Vector_impl"* %this1, %"class.std::allocator"* %0)
  ret void
}

define linkonce_odr void @_ZNSt12_Vector_baseIfSaIfEE12_Vector_implC2ERKS0_(%"struct.std::_Vector_base<float, std::allocator<float> >::_Vector_impl"* %this, %"class.std::allocator"* %__a) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"struct.std::_Vector_base<float, std::allocator<float> >::_Vector_impl"*, align 4
  %__a.addr = alloca %"class.std::allocator"*, align 4
  store %"struct.std::_Vector_base<float, std::allocator<float> >::_Vector_impl"* %this, %"struct.std::_Vector_base<float, std::allocator<float> >::_Vector_impl"** %this.addr, align 4
  store %"class.std::allocator"* %__a, %"class.std::allocator"** %__a.addr, align 4
  %this1 = load %"struct.std::_Vector_base<float, std::allocator<float> >::_Vector_impl"** %this.addr
  %0 = bitcast %"struct.std::_Vector_base<float, std::allocator<float> >::_Vector_impl"* %this1 to %"class.std::allocator"*
  %1 = load %"class.std::allocator"** %__a.addr, align 4
  call void @_ZNSaIfEC2ERKS_(%"class.std::allocator"* %0, %"class.std::allocator"* %1) nounwind
  %_M_start = getelementptr inbounds %"struct.std::_Vector_base<float, std::allocator<float> >::_Vector_impl"* %this1, i32 0, i32 0
  store float* null, float** %_M_start, align 4
  %_M_finish = getelementptr inbounds %"struct.std::_Vector_base<float, std::allocator<float> >::_Vector_impl"* %this1, i32 0, i32 1
  store float* null, float** %_M_finish, align 4
  %_M_end_of_storage = getelementptr inbounds %"struct.std::_Vector_base<float, std::allocator<float> >::_Vector_impl"* %this1, i32 0, i32 2
  store float* null, float** %_M_end_of_storage, align 4
  ret void
}

define linkonce_odr void @_ZNSaIfEC2ERKS_(%"class.std::allocator"* %this, %"class.std::allocator"* %__a) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.std::allocator"*, align 4
  %__a.addr = alloca %"class.std::allocator"*, align 4
  store %"class.std::allocator"* %this, %"class.std::allocator"** %this.addr, align 4
  store %"class.std::allocator"* %__a, %"class.std::allocator"** %__a.addr, align 4
  %this1 = load %"class.std::allocator"** %this.addr
  %0 = bitcast %"class.std::allocator"* %this1 to %"class.__gnu_cxx::new_allocator"*
  %1 = load %"class.std::allocator"** %__a.addr, align 4
  %2 = bitcast %"class.std::allocator"* %1 to %"class.__gnu_cxx::new_allocator"*
  call void @_ZN9__gnu_cxx13new_allocatorIfEC2ERKS1_(%"class.__gnu_cxx::new_allocator"* %0, %"class.__gnu_cxx::new_allocator"* %2) nounwind
  ret void
}

define linkonce_odr void @_ZN9__gnu_cxx13new_allocatorIfEC2ERKS1_(%"class.__gnu_cxx::new_allocator"* %this, %"class.__gnu_cxx::new_allocator"*) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.__gnu_cxx::new_allocator"*, align 4
  %.addr = alloca %"class.__gnu_cxx::new_allocator"*, align 4
  store %"class.__gnu_cxx::new_allocator"* %this, %"class.__gnu_cxx::new_allocator"** %this.addr, align 4
  store %"class.__gnu_cxx::new_allocator"* %0, %"class.__gnu_cxx::new_allocator"** %.addr, align 4
  %this1 = load %"class.__gnu_cxx::new_allocator"** %this.addr
  ret void
}

define linkonce_odr void @_ZNSaIfEC2Ev(%"class.std::allocator"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.std::allocator"*, align 4
  store %"class.std::allocator"* %this, %"class.std::allocator"** %this.addr, align 4
  %this1 = load %"class.std::allocator"** %this.addr
  %0 = bitcast %"class.std::allocator"* %this1 to %"class.__gnu_cxx::new_allocator"*
  call void @_ZN9__gnu_cxx13new_allocatorIfEC2Ev(%"class.__gnu_cxx::new_allocator"* %0) nounwind
  ret void
}

define linkonce_odr void @_ZN9__gnu_cxx13new_allocatorIfEC2Ev(%"class.__gnu_cxx::new_allocator"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.__gnu_cxx::new_allocator"*, align 4
  store %"class.__gnu_cxx::new_allocator"* %this, %"class.__gnu_cxx::new_allocator"** %this.addr, align 4
  %this1 = load %"class.__gnu_cxx::new_allocator"** %this.addr
  ret void
}

define linkonce_odr void @_ZNSt6vectorIfSaIfEED2Ev(%"class.std::vector"* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.std::vector"*, align 4
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  store %"class.std::vector"* %this, %"class.std::vector"** %this.addr, align 4
  %this1 = load %"class.std::vector"** %this.addr
  %0 = bitcast %"class.std::vector"* %this1 to %"struct.std::_Vector_base"*
  %_M_impl = getelementptr inbounds %"struct.std::_Vector_base"* %0, i32 0, i32 0
  %_M_start = getelementptr inbounds %"struct.std::_Vector_base<float, std::allocator<float> >::_Vector_impl"* %_M_impl, i32 0, i32 0
  %1 = load float** %_M_start, align 4
  %2 = bitcast %"class.std::vector"* %this1 to %"struct.std::_Vector_base"*
  %_M_impl2 = getelementptr inbounds %"struct.std::_Vector_base"* %2, i32 0, i32 0
  %_M_finish = getelementptr inbounds %"struct.std::_Vector_base<float, std::allocator<float> >::_Vector_impl"* %_M_impl2, i32 0, i32 1
  %3 = load float** %_M_finish, align 4
  %4 = bitcast %"class.std::vector"* %this1 to %"struct.std::_Vector_base"*
  %call = invoke %"class.std::allocator"* @_ZNSt12_Vector_baseIfSaIfEE19_M_get_Tp_allocatorEv(%"struct.std::_Vector_base"* %4)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %entry
  invoke void @_ZSt8_DestroyIPffEvT_S1_RSaIT0_E(float* %1, float* %3, %"class.std::allocator"* %call)
          to label %invoke.cont3 unwind label %lpad

invoke.cont3:                                     ; preds = %invoke.cont
  %5 = bitcast %"class.std::vector"* %this1 to %"struct.std::_Vector_base"*
  call void @_ZNSt12_Vector_baseIfSaIfEED2Ev(%"struct.std::_Vector_base"* %5)
  ret void

lpad:                                             ; preds = %invoke.cont, %entry
  %6 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %7 = extractvalue { i8*, i32 } %6, 0
  store i8* %7, i8** %exn.slot
  %8 = extractvalue { i8*, i32 } %6, 1
  store i32 %8, i32* %ehselector.slot
  %9 = bitcast %"class.std::vector"* %this1 to %"struct.std::_Vector_base"*
  invoke void @_ZNSt12_Vector_baseIfSaIfEED2Ev(%"struct.std::_Vector_base"* %9)
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

define linkonce_odr void @_ZNSt6vectorIfSaIfEEC2Ev(%"class.std::vector"* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.std::vector"*, align 4
  store %"class.std::vector"* %this, %"class.std::vector"** %this.addr, align 4
  %this1 = load %"class.std::vector"** %this.addr
  %0 = bitcast %"class.std::vector"* %this1 to %"struct.std::_Vector_base"*
  call void @_ZNSt12_Vector_baseIfSaIfEEC2Ev(%"struct.std::_Vector_base"* %0)
  ret void
}

define linkonce_odr void @_ZNSt12_Vector_baseIfSaIfEEC2Ev(%"struct.std::_Vector_base"* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"struct.std::_Vector_base"*, align 4
  store %"struct.std::_Vector_base"* %this, %"struct.std::_Vector_base"** %this.addr, align 4
  %this1 = load %"struct.std::_Vector_base"** %this.addr
  %_M_impl = getelementptr inbounds %"struct.std::_Vector_base"* %this1, i32 0, i32 0
  call void @_ZNSt12_Vector_baseIfSaIfEE12_Vector_implC1Ev(%"struct.std::_Vector_base<float, std::allocator<float> >::_Vector_impl"* %_M_impl)
  ret void
}

define linkonce_odr void @_ZNSt12_Vector_baseIfSaIfEE12_Vector_implC1Ev(%"struct.std::_Vector_base<float, std::allocator<float> >::_Vector_impl"* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"struct.std::_Vector_base<float, std::allocator<float> >::_Vector_impl"*, align 4
  store %"struct.std::_Vector_base<float, std::allocator<float> >::_Vector_impl"* %this, %"struct.std::_Vector_base<float, std::allocator<float> >::_Vector_impl"** %this.addr, align 4
  %this1 = load %"struct.std::_Vector_base<float, std::allocator<float> >::_Vector_impl"** %this.addr
  call void @_ZNSt12_Vector_baseIfSaIfEE12_Vector_implC2Ev(%"struct.std::_Vector_base<float, std::allocator<float> >::_Vector_impl"* %this1)
  ret void
}

define linkonce_odr void @_ZNSt12_Vector_baseIfSaIfEE12_Vector_implC2Ev(%"struct.std::_Vector_base<float, std::allocator<float> >::_Vector_impl"* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"struct.std::_Vector_base<float, std::allocator<float> >::_Vector_impl"*, align 4
  store %"struct.std::_Vector_base<float, std::allocator<float> >::_Vector_impl"* %this, %"struct.std::_Vector_base<float, std::allocator<float> >::_Vector_impl"** %this.addr, align 4
  %this1 = load %"struct.std::_Vector_base<float, std::allocator<float> >::_Vector_impl"** %this.addr
  %0 = bitcast %"struct.std::_Vector_base<float, std::allocator<float> >::_Vector_impl"* %this1 to %"class.std::allocator"*
  call void @_ZNSaIfEC2Ev(%"class.std::allocator"* %0) nounwind
  %_M_start = getelementptr inbounds %"struct.std::_Vector_base<float, std::allocator<float> >::_Vector_impl"* %this1, i32 0, i32 0
  store float* null, float** %_M_start, align 4
  %_M_finish = getelementptr inbounds %"struct.std::_Vector_base<float, std::allocator<float> >::_Vector_impl"* %this1, i32 0, i32 1
  store float* null, float** %_M_finish, align 4
  %_M_end_of_storage = getelementptr inbounds %"struct.std::_Vector_base<float, std::allocator<float> >::_Vector_impl"* %this1, i32 0, i32 2
  store float* null, float** %_M_end_of_storage, align 4
  ret void
}

define linkonce_odr void @_ZN5boost6random17variate_generatorIRNS0_23mersenne_twister_engineIjLj32ELj624ELj397ELj31ELj2567483615ELj11ELj4294967295ELj7ELj2636928640ELj15ELj4022730752ELj18ELj1812433253EEENS_11uniform_intIiEEEC2ES4_S6_(%"class.boost::random::variate_generator"* %this, %"class.boost::random::mersenne_twister_engine"* %e, %"class.boost::uniform_int"* byval align 4 %d) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::random::variate_generator"*, align 4
  %e.addr = alloca %"class.boost::random::mersenne_twister_engine"*, align 4
  store %"class.boost::random::variate_generator"* %this, %"class.boost::random::variate_generator"** %this.addr, align 4
  store %"class.boost::random::mersenne_twister_engine"* %e, %"class.boost::random::mersenne_twister_engine"** %e.addr, align 4
  %this1 = load %"class.boost::random::variate_generator"** %this.addr
  %0 = getelementptr inbounds %"class.boost::random::variate_generator"* %this1, i32 0, i32 0
  %1 = load %"class.boost::random::mersenne_twister_engine"** %e.addr, align 4
  store %"class.boost::random::mersenne_twister_engine"* %1, %"class.boost::random::mersenne_twister_engine"** %0, align 4
  %_dist = getelementptr inbounds %"class.boost::random::variate_generator"* %this1, i32 0, i32 1
  %2 = bitcast %"class.boost::uniform_int"* %_dist to i8*
  %3 = bitcast %"class.boost::uniform_int"* %d to i8*
  call void @llvm.memcpy.p0i8.p0i8.i32(i8* %2, i8* %3, i32 8, i32 4, i1 false)
  ret void
}

define linkonce_odr void @_ZN5boost11uniform_intIiEC2Eii(%"class.boost::uniform_int"* %this, i32 %min_arg, i32 %max_arg) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::uniform_int"*, align 4
  %min_arg.addr = alloca i32, align 4
  %max_arg.addr = alloca i32, align 4
  store %"class.boost::uniform_int"* %this, %"class.boost::uniform_int"** %this.addr, align 4
  store i32 %min_arg, i32* %min_arg.addr, align 4
  store i32 %max_arg, i32* %max_arg.addr, align 4
  %this1 = load %"class.boost::uniform_int"** %this.addr
  %0 = bitcast %"class.boost::uniform_int"* %this1 to %"class.boost::random::uniform_int_distribution"*
  %1 = load i32* %min_arg.addr, align 4
  %2 = load i32* %max_arg.addr, align 4
  call void @_ZN5boost6random24uniform_int_distributionIiEC2Eii(%"class.boost::random::uniform_int_distribution"* %0, i32 %1, i32 %2)
  ret void
}

define linkonce_odr void @_ZN5boost6random24uniform_int_distributionIiEC2Eii(%"class.boost::random::uniform_int_distribution"* %this, i32 %min_arg, i32 %max_arg) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::random::uniform_int_distribution"*, align 4
  %min_arg.addr = alloca i32, align 4
  %max_arg.addr = alloca i32, align 4
  store %"class.boost::random::uniform_int_distribution"* %this, %"class.boost::random::uniform_int_distribution"** %this.addr, align 4
  store i32 %min_arg, i32* %min_arg.addr, align 4
  store i32 %max_arg, i32* %max_arg.addr, align 4
  %this1 = load %"class.boost::random::uniform_int_distribution"** %this.addr
  %_min = getelementptr inbounds %"class.boost::random::uniform_int_distribution"* %this1, i32 0, i32 0
  %0 = load i32* %min_arg.addr, align 4
  store i32 %0, i32* %_min, align 4
  %_max = getelementptr inbounds %"class.boost::random::uniform_int_distribution"* %this1, i32 0, i32 1
  %1 = load i32* %max_arg.addr, align 4
  store i32 %1, i32* %_max, align 4
  %2 = load i32* %min_arg.addr, align 4
  %3 = load i32* %max_arg.addr, align 4
  %cmp = icmp sle i32 %2, %3
  br i1 %cmp, label %cond.true, label %cond.false

cond.true:                                        ; preds = %entry
  br label %cond.end

cond.false:                                       ; preds = %entry
  call void @__assert_fail(i8* getelementptr inbounds ([19 x i8]* @.str8, i32 0, i32 0), i8* getelementptr inbounds ([68 x i8]* @.str9, i32 0, i32 0), i32 318, i8* getelementptr inbounds ([105 x i8]* @__PRETTY_FUNCTION__._ZN5boost6random24uniform_int_distributionIiEC2Eii, i32 0, i32 0)) noreturn nounwind
  unreachable
                                                  ; No predecessors!
  br label %cond.end

cond.end:                                         ; preds = %4, %cond.true
  ret void
}

define linkonce_odr void @_ZN5boost6random23mersenne_twister_engineIjLj32ELj624ELj397ELj31ELj2567483615ELj11ELj4294967295ELj7ELj2636928640ELj15ELj4022730752ELj18ELj1812433253EEC2Ev(%"class.boost::random::mersenne_twister_engine"* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %"class.boost::random::mersenne_twister_engine"*, align 4
  store %"class.boost::random::mersenne_twister_engine"* %this, %"class.boost::random::mersenne_twister_engine"** %this.addr, align 4
  %this1 = load %"class.boost::random::mersenne_twister_engine"** %this.addr
  call void @_ZN5boost6random23mersenne_twister_engineIjLj32ELj624ELj397ELj31ELj2567483615ELj11ELj4294967295ELj7ELj2636928640ELj15ELj4022730752ELj18ELj1812433253EE4seedEv(%"class.boost::random::mersenne_twister_engine"* %this1)
  ret void
}

define linkonce_odr void @_ZN5boost6random23mersenne_twister_engineIjLj32ELj624ELj397ELj31ELj2567483615ELj11ELj4294967295ELj7ELj2636928640ELj15ELj4022730752ELj18ELj1812433253EE4seedEv(%"class.boost::random::mersenne_twister_engine"* %this) align 2 {
entry:
  %this.addr = alloca %"class.boost::random::mersenne_twister_engine"*, align 4
  store %"class.boost::random::mersenne_twister_engine"* %this, %"class.boost::random::mersenne_twister_engine"** %this.addr, align 4
  %this1 = load %"class.boost::random::mersenne_twister_engine"** %this.addr
  call void @_ZN5boost6random23mersenne_twister_engineIjLj32ELj624ELj397ELj31ELj2567483615ELj11ELj4294967295ELj7ELj2636928640ELj15ELj4022730752ELj18ELj1812433253EE4seedERKj(%"class.boost::random::mersenne_twister_engine"* %this1, i32* @_ZN5boost6random23mersenne_twister_engineIjLj32ELj624ELj397ELj31ELj2567483615ELj11ELj4294967295ELj7ELj2636928640ELj15ELj4022730752ELj18ELj1812433253EE12default_seedE)
  ret void
}

define linkonce_odr void @_ZN5boost6random23mersenne_twister_engineIjLj32ELj624ELj397ELj31ELj2567483615ELj11ELj4294967295ELj7ELj2636928640ELj15ELj4022730752ELj18ELj1812433253EE4seedERKj(%"class.boost::random::mersenne_twister_engine"* %this, i32* %value) nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::random::mersenne_twister_engine"*, align 4
  %value.addr = alloca i32*, align 4
  %mask = alloca i32, align 4
  store %"class.boost::random::mersenne_twister_engine"* %this, %"class.boost::random::mersenne_twister_engine"** %this.addr, align 4
  store i32* %value, i32** %value.addr, align 4
  %this1 = load %"class.boost::random::mersenne_twister_engine"** %this.addr
  %call = call i32 @_ZN5boost6random23mersenne_twister_engineIjLj32ELj624ELj397ELj31ELj2567483615ELj11ELj4294967295ELj7ELj2636928640ELj15ELj4022730752ELj18ELj1812433253EE3maxEv()
  store i32 %call, i32* %mask, align 4
  %0 = load i32** %value.addr, align 4
  %1 = load i32* %0, align 4
  %2 = load i32* %mask, align 4
  %and = and i32 %1, %2
  %x = getelementptr inbounds %"class.boost::random::mersenne_twister_engine"* %this1, i32 0, i32 0
  %arrayidx = getelementptr inbounds [624 x i32]* %x, i32 0, i32 0
  store i32 %and, i32* %arrayidx, align 4
  %i = getelementptr inbounds %"class.boost::random::mersenne_twister_engine"* %this1, i32 0, i32 1
  store i32 1, i32* %i, align 4
  br label %for.cond

for.cond:                                         ; preds = %for.inc, %entry
  %i2 = getelementptr inbounds %"class.boost::random::mersenne_twister_engine"* %this1, i32 0, i32 1
  %3 = load i32* %i2, align 4
  %cmp = icmp ult i32 %3, 624
  br i1 %cmp, label %for.body, label %for.end

for.body:                                         ; preds = %for.cond
  %i3 = getelementptr inbounds %"class.boost::random::mersenne_twister_engine"* %this1, i32 0, i32 1
  %4 = load i32* %i3, align 4
  %sub = sub i32 %4, 1
  %x4 = getelementptr inbounds %"class.boost::random::mersenne_twister_engine"* %this1, i32 0, i32 0
  %arrayidx5 = getelementptr inbounds [624 x i32]* %x4, i32 0, i32 %sub
  %5 = load i32* %arrayidx5, align 4
  %i6 = getelementptr inbounds %"class.boost::random::mersenne_twister_engine"* %this1, i32 0, i32 1
  %6 = load i32* %i6, align 4
  %sub7 = sub i32 %6, 1
  %x8 = getelementptr inbounds %"class.boost::random::mersenne_twister_engine"* %this1, i32 0, i32 0
  %arrayidx9 = getelementptr inbounds [624 x i32]* %x8, i32 0, i32 %sub7
  %7 = load i32* %arrayidx9, align 4
  %shr = lshr i32 %7, 30
  %xor = xor i32 %5, %shr
  %mul = mul i32 1812433253, %xor
  %i10 = getelementptr inbounds %"class.boost::random::mersenne_twister_engine"* %this1, i32 0, i32 1
  %8 = load i32* %i10, align 4
  %add = add i32 %mul, %8
  %9 = load i32* %mask, align 4
  %and11 = and i32 %add, %9
  %i12 = getelementptr inbounds %"class.boost::random::mersenne_twister_engine"* %this1, i32 0, i32 1
  %10 = load i32* %i12, align 4
  %x13 = getelementptr inbounds %"class.boost::random::mersenne_twister_engine"* %this1, i32 0, i32 0
  %arrayidx14 = getelementptr inbounds [624 x i32]* %x13, i32 0, i32 %10
  store i32 %and11, i32* %arrayidx14, align 4
  br label %for.inc

for.inc:                                          ; preds = %for.body
  %i15 = getelementptr inbounds %"class.boost::random::mersenne_twister_engine"* %this1, i32 0, i32 1
  %11 = load i32* %i15, align 4
  %inc = add i32 %11, 1
  store i32 %inc, i32* %i15, align 4
  br label %for.cond

for.end:                                          ; preds = %for.cond
  ret void
}

define linkonce_odr void @_ZN5boost6detail35make_property_map_from_arg_pack_genINS_5graph8keywords3tag9color_mapENS_18default_color_typeEEC2ES6_(%"class.boost::detail::make_property_map_from_arg_pack_gen"* %this, i32 %default_value) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %"class.boost::detail::make_property_map_from_arg_pack_gen"*, align 4
  %default_value.addr = alloca i32, align 4
  store %"class.boost::detail::make_property_map_from_arg_pack_gen"* %this, %"class.boost::detail::make_property_map_from_arg_pack_gen"** %this.addr, align 4
  store i32 %default_value, i32* %default_value.addr, align 4
  %this1 = load %"class.boost::detail::make_property_map_from_arg_pack_gen"** %this.addr
  %default_value2 = getelementptr inbounds %"class.boost::detail::make_property_map_from_arg_pack_gen"* %this1, i32 0, i32 0
  %0 = load i32* %default_value.addr, align 4
  store i32 %0, i32* %default_value2, align 4
  ret void
}

define linkonce_odr void @_ZN5boost14fibonacci_heapIiNS_12indirect_cmpIPfSt4lessIfEEENS_27typed_identity_property_mapIjEEED2Ev(%"class.boost::fibonacci_heap"* %this) unnamed_addr inlinehint align 2 {
entry:
  %this.addr = alloca %"class.boost::fibonacci_heap"*, align 4
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  store %"class.boost::fibonacci_heap"* %this, %"class.boost::fibonacci_heap"** %this.addr, align 4
  %this1 = load %"class.boost::fibonacci_heap"** %this.addr
  %new_roots = getelementptr inbounds %"class.boost::fibonacci_heap"* %this1, i32 0, i32 11
  invoke void @_ZNSt6vectorIjSaIjEED1Ev(%"class.std::vector.5"* %new_roots)
          to label %invoke.cont unwind label %lpad

invoke.cont:                                      ; preds = %entry
  %_child = getelementptr inbounds %"class.boost::fibonacci_heap"* %this1, i32 0, i32 10
  invoke void @_ZNSt6vectorIjSaIjEED1Ev(%"class.std::vector.5"* %_child)
          to label %invoke.cont3 unwind label %lpad2

invoke.cont3:                                     ; preds = %invoke.cont
  %_degree = getelementptr inbounds %"class.boost::fibonacci_heap"* %this1, i32 0, i32 5
  invoke void @_ZNSt6vectorIjSaIjEED1Ev(%"class.std::vector.5"* %_degree)
          to label %invoke.cont7 unwind label %lpad6

invoke.cont7:                                     ; preds = %invoke.cont3
  %_mark = getelementptr inbounds %"class.boost::fibonacci_heap"* %this1, i32 0, i32 4
  invoke void @_ZNSt6vectorIbSaIbEED1Ev(%"class.std::vector.10"* %_mark)
          to label %invoke.cont11 unwind label %lpad10

invoke.cont11:                                    ; preds = %invoke.cont7
  %_p = getelementptr inbounds %"class.boost::fibonacci_heap"* %this1, i32 0, i32 3
  invoke void @_ZNSt6vectorIjSaIjEED1Ev(%"class.std::vector.5"* %_p)
          to label %invoke.cont16 unwind label %lpad15

invoke.cont16:                                    ; preds = %invoke.cont11
  %_right = getelementptr inbounds %"class.boost::fibonacci_heap"* %this1, i32 0, i32 2
  invoke void @_ZNSt6vectorIjSaIjEED1Ev(%"class.std::vector.5"* %_right)
          to label %invoke.cont21 unwind label %lpad20

invoke.cont21:                                    ; preds = %invoke.cont16
  %_left = getelementptr inbounds %"class.boost::fibonacci_heap"* %this1, i32 0, i32 1
  invoke void @_ZNSt6vectorIjSaIjEED1Ev(%"class.std::vector.5"* %_left)
          to label %invoke.cont26 unwind label %lpad25

invoke.cont26:                                    ; preds = %invoke.cont21
  %_key = getelementptr inbounds %"class.boost::fibonacci_heap"* %this1, i32 0, i32 0
  call void @_ZNSt6vectorIiSaIiEED1Ev(%"class.std::vector.0"* %_key)
  ret void

lpad:                                             ; preds = %entry
  %0 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %1 = extractvalue { i8*, i32 } %0, 0
  store i8* %1, i8** %exn.slot
  %2 = extractvalue { i8*, i32 } %0, 1
  store i32 %2, i32* %ehselector.slot
  %_child4 = getelementptr inbounds %"class.boost::fibonacci_heap"* %this1, i32 0, i32 10
  invoke void @_ZNSt6vectorIjSaIjEED1Ev(%"class.std::vector.5"* %_child4)
          to label %invoke.cont5 unwind label %terminate.lpad

lpad2:                                            ; preds = %invoke.cont
  %3 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %4 = extractvalue { i8*, i32 } %3, 0
  store i8* %4, i8** %exn.slot
  %5 = extractvalue { i8*, i32 } %3, 1
  store i32 %5, i32* %ehselector.slot
  br label %ehcleanup

invoke.cont5:                                     ; preds = %lpad
  br label %ehcleanup

lpad6:                                            ; preds = %invoke.cont3
  %6 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %7 = extractvalue { i8*, i32 } %6, 0
  store i8* %7, i8** %exn.slot
  %8 = extractvalue { i8*, i32 } %6, 1
  store i32 %8, i32* %ehselector.slot
  br label %ehcleanup12

ehcleanup:                                        ; preds = %invoke.cont5, %lpad2
  %_degree8 = getelementptr inbounds %"class.boost::fibonacci_heap"* %this1, i32 0, i32 5
  invoke void @_ZNSt6vectorIjSaIjEED1Ev(%"class.std::vector.5"* %_degree8)
          to label %invoke.cont9 unwind label %terminate.lpad

invoke.cont9:                                     ; preds = %ehcleanup
  br label %ehcleanup12

lpad10:                                           ; preds = %invoke.cont7
  %9 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %10 = extractvalue { i8*, i32 } %9, 0
  store i8* %10, i8** %exn.slot
  %11 = extractvalue { i8*, i32 } %9, 1
  store i32 %11, i32* %ehselector.slot
  br label %ehcleanup17

ehcleanup12:                                      ; preds = %invoke.cont9, %lpad6
  %_mark13 = getelementptr inbounds %"class.boost::fibonacci_heap"* %this1, i32 0, i32 4
  invoke void @_ZNSt6vectorIbSaIbEED1Ev(%"class.std::vector.10"* %_mark13)
          to label %invoke.cont14 unwind label %terminate.lpad

invoke.cont14:                                    ; preds = %ehcleanup12
  br label %ehcleanup17

lpad15:                                           ; preds = %invoke.cont11
  %12 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %13 = extractvalue { i8*, i32 } %12, 0
  store i8* %13, i8** %exn.slot
  %14 = extractvalue { i8*, i32 } %12, 1
  store i32 %14, i32* %ehselector.slot
  br label %ehcleanup22

ehcleanup17:                                      ; preds = %invoke.cont14, %lpad10
  %_p18 = getelementptr inbounds %"class.boost::fibonacci_heap"* %this1, i32 0, i32 3
  invoke void @_ZNSt6vectorIjSaIjEED1Ev(%"class.std::vector.5"* %_p18)
          to label %invoke.cont19 unwind label %terminate.lpad

invoke.cont19:                                    ; preds = %ehcleanup17
  br label %ehcleanup22

lpad20:                                           ; preds = %invoke.cont16
  %15 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %16 = extractvalue { i8*, i32 } %15, 0
  store i8* %16, i8** %exn.slot
  %17 = extractvalue { i8*, i32 } %15, 1
  store i32 %17, i32* %ehselector.slot
  br label %ehcleanup27

ehcleanup22:                                      ; preds = %invoke.cont19, %lpad15
  %_right23 = getelementptr inbounds %"class.boost::fibonacci_heap"* %this1, i32 0, i32 2
  invoke void @_ZNSt6vectorIjSaIjEED1Ev(%"class.std::vector.5"* %_right23)
          to label %invoke.cont24 unwind label %terminate.lpad

invoke.cont24:                                    ; preds = %ehcleanup22
  br label %ehcleanup27

lpad25:                                           ; preds = %invoke.cont21
  %18 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup
  %19 = extractvalue { i8*, i32 } %18, 0
  store i8* %19, i8** %exn.slot
  %20 = extractvalue { i8*, i32 } %18, 1
  store i32 %20, i32* %ehselector.slot
  br label %ehcleanup30

ehcleanup27:                                      ; preds = %invoke.cont24, %lpad20
  %_left28 = getelementptr inbounds %"class.boost::fibonacci_heap"* %this1, i32 0, i32 1
  invoke void @_ZNSt6vectorIjSaIjEED1Ev(%"class.std::vector.5"* %_left28)
          to label %invoke.cont29 unwind label %terminate.lpad

invoke.cont29:                                    ; preds = %ehcleanup27
  br label %ehcleanup30

ehcleanup30:                                      ; preds = %invoke.cont29, %lpad25
  %_key31 = getelementptr inbounds %"class.boost::fibonacci_heap"* %this1, i32 0, i32 0
  invoke void @_ZNSt6vectorIiSaIiEED1Ev(%"class.std::vector.0"* %_key31)
          to label %invoke.cont32 unwind label %terminate.lpad

invoke.cont32:                                    ; preds = %ehcleanup30
  br label %eh.resume

eh.resume:                                        ; preds = %invoke.cont32
  %exn = load i8** %exn.slot
  %sel = load i32* %ehselector.slot
  %lpad.val = insertvalue { i8*, i32 } undef, i8* %exn, 0
  %lpad.val33 = insertvalue { i8*, i32 } %lpad.val, i32 %sel, 1
  resume { i8*, i32 } %lpad.val33

terminate.lpad:                                   ; preds = %ehcleanup30, %ehcleanup27, %ehcleanup22, %ehcleanup17, %ehcleanup12, %ehcleanup, %lpad
  %21 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          catch i8* null
  call void @_ZSt9terminatev() noreturn nounwind
  unreachable
}

define internal void @_GLOBAL__I_a() section ".text.startup" {
entry:
  call void @__cxx_global_var_init()
  call void @__cxx_global_var_init1()
  ret void
}
