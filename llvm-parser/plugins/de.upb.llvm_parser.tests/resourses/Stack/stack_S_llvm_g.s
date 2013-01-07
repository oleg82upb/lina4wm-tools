;clang stack.cpp -S -emit-llvm -g
; ModuleID = 'stack.cpp'
target datalayout = "e-p:32:32:32-i1:8:8-i8:8:8-i16:16:16-i32:32:32-i64:32:64-f32:32:32-f64:32:64-v64:64:64-v128:128:128-a0:0:64-f80:32:32-n8:16:32-S128"
target triple = "i386-pc-linux-gnu"

%class.Stack = type { %class.Node* }
%class.Node = type { i32, %class.Node* }

@_ZN5StackC1Ev = alias void (%class.Stack*)* @_ZN5StackC2Ev

define void @_ZN5StackC2Ev(%class.Stack* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %class.Stack*, align 4
  store %class.Stack* %this, %class.Stack** %this.addr, align 4
  call void @llvm.dbg.declare(metadata !{%class.Stack** %this.addr}, metadata !43), !dbg !45
  %this1 = load %class.Stack** %this.addr
  %head = getelementptr inbounds %class.Stack* %this1, i32 0, i32 0, !dbg !45
  store volatile %class.Node* null, %class.Node** %head, align 4, !dbg !45
  ret void, !dbg !46
}

declare void @llvm.dbg.declare(metadata, metadata) nounwind readnone

define void @_ZN5Stack4pushEi(%class.Stack* %this, i32 %v) align 2 {
entry:
  %this.addr = alloca %class.Stack*, align 4
  %v.addr = alloca i32, align 4
  %n = alloca %class.Node*, align 4
  %ss = alloca %class.Node*, align 4
  %exn.slot = alloca i8*
  %ehselector.slot = alloca i32
  store %class.Stack* %this, %class.Stack** %this.addr, align 4
  call void @llvm.dbg.declare(metadata !{%class.Stack** %this.addr}, metadata !48), !dbg !49
  store i32 %v, i32* %v.addr, align 4
  call void @llvm.dbg.declare(metadata !{i32* %v.addr}, metadata !50), !dbg !49
  %this1 = load %class.Stack** %this.addr
  call void @llvm.dbg.declare(metadata !{%class.Node** %n}, metadata !51), !dbg !53
  call void @llvm.dbg.declare(metadata !{%class.Node** %ss}, metadata !54), !dbg !53
  %call = call noalias i8* @_Znwj(i32 8), !dbg !55
  %0 = bitcast i8* %call to %class.Node*, !dbg !55
  invoke void @_ZN4NodeC1Ev(%class.Node* %0)
          to label %invoke.cont unwind label %lpad, !dbg !55

invoke.cont:                                      ; preds = %entry
  store %class.Node* %0, %class.Node** %n, align 4, !dbg !55
  %1 = load i32* %v.addr, align 4, !dbg !56
  %2 = load %class.Node** %n, align 4, !dbg !56
  %val = getelementptr inbounds %class.Node* %2, i32 0, i32 0, !dbg !56
  store i32 %1, i32* %val, align 4, !dbg !56
  br label %do.body, !dbg !57

do.body:                                          ; preds = %do.cond, %invoke.cont
  %head = getelementptr inbounds %class.Stack* %this1, i32 0, i32 0, !dbg !58
  %3 = load volatile %class.Node** %head, align 4, !dbg !58
  store %class.Node* %3, %class.Node** %ss, align 4, !dbg !58
  %4 = load %class.Node** %ss, align 4, !dbg !60
  %5 = load %class.Node** %n, align 4, !dbg !60
  %next = getelementptr inbounds %class.Node* %5, i32 0, i32 1, !dbg !60
  store %class.Node* %4, %class.Node** %next, align 4, !dbg !60
  br label %do.cond, !dbg !61

do.cond:                                          ; preds = %do.body
  %head2 = getelementptr inbounds %class.Stack* %this1, i32 0, i32 0, !dbg !62
  %6 = bitcast %class.Node** %head2 to i32*, !dbg !62
  %7 = load %class.Node** %ss, align 4, !dbg !62
  %8 = ptrtoint %class.Node* %7 to i32, !dbg !62
  %9 = load %class.Node** %n, align 4, !dbg !62
  %10 = ptrtoint %class.Node* %9 to i32, !dbg !62
  %11 = cmpxchg i32* %6, i32 %8, i32 %10 seq_cst, !dbg !62
  %12 = icmp eq i32 %11, %8, !dbg !62
  %conv = zext i1 %12 to i32, !dbg !62
  %cmp = icmp eq i32 0, %conv, !dbg !62
  br i1 %cmp, label %do.body, label %do.end, !dbg !62

do.end:                                           ; preds = %do.cond
  ret void, !dbg !63

lpad:                                             ; preds = %entry
  %13 = landingpad { i8*, i32 } personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*)
          cleanup, !dbg !55
  %14 = extractvalue { i8*, i32 } %13, 0, !dbg !55
  store i8* %14, i8** %exn.slot, !dbg !55
  %15 = extractvalue { i8*, i32 } %13, 1, !dbg !55
  store i32 %15, i32* %ehselector.slot, !dbg !55
  call void @_ZdlPv(i8* %call) nounwind, !dbg !55
  br label %eh.resume, !dbg !55

eh.resume:                                        ; preds = %lpad
  %exn = load i8** %exn.slot, !dbg !55
  %sel = load i32* %ehselector.slot, !dbg !55
  %lpad.val = insertvalue { i8*, i32 } undef, i8* %exn, 0, !dbg !55
  %lpad.val3 = insertvalue { i8*, i32 } %lpad.val, i32 %sel, 1, !dbg !55
  resume { i8*, i32 } %lpad.val3, !dbg !55
}

declare noalias i8* @_Znwj(i32)

define linkonce_odr void @_ZN4NodeC1Ev(%class.Node* %this) unnamed_addr align 2 {
entry:
  %this.addr = alloca %class.Node*, align 4
  store %class.Node* %this, %class.Node** %this.addr, align 4
  call void @llvm.dbg.declare(metadata !{%class.Node** %this.addr}, metadata !64), !dbg !65
  %this1 = load %class.Node** %this.addr
  call void @_ZN4NodeC2Ev(%class.Node* %this1), !dbg !65
  ret void, !dbg !65
}

declare i32 @__gxx_personality_v0(...)

declare void @_ZdlPv(i8*) nounwind

define %class.Node* @_ZN5Stack3popEv(%class.Stack* %this) nounwind align 2 {
entry:
  %retval = alloca %class.Node*, align 4
  %this.addr = alloca %class.Stack*, align 4
  %ss = alloca %class.Node*, align 4
  %ssn = alloca %class.Node*, align 4
  store %class.Stack* %this, %class.Stack** %this.addr, align 4
  call void @llvm.dbg.declare(metadata !{%class.Stack** %this.addr}, metadata !66), !dbg !67
  %this1 = load %class.Stack** %this.addr
  call void @llvm.dbg.declare(metadata !{%class.Node** %ss}, metadata !68), !dbg !70
  call void @llvm.dbg.declare(metadata !{%class.Node** %ssn}, metadata !71), !dbg !70
  br label %do.body, !dbg !72

do.body:                                          ; preds = %do.cond, %entry
  %head = getelementptr inbounds %class.Stack* %this1, i32 0, i32 0, !dbg !73
  %0 = load volatile %class.Node** %head, align 4, !dbg !73
  store %class.Node* %0, %class.Node** %ss, align 4, !dbg !73
  %1 = load %class.Node** %ss, align 4, !dbg !75
  %cmp = icmp eq %class.Node* %1, null, !dbg !75
  br i1 %cmp, label %if.then, label %if.end, !dbg !75

if.then:                                          ; preds = %do.body
  store %class.Node* null, %class.Node** %retval, !dbg !76
  br label %return, !dbg !76

if.end:                                           ; preds = %do.body
  %2 = load %class.Node** %ss, align 4, !dbg !78
  %next = getelementptr inbounds %class.Node* %2, i32 0, i32 1, !dbg !78
  %3 = load %class.Node** %next, align 4, !dbg !78
  store %class.Node* %3, %class.Node** %ssn, align 4, !dbg !78
  br label %do.cond, !dbg !79

do.cond:                                          ; preds = %if.end
  %head2 = getelementptr inbounds %class.Stack* %this1, i32 0, i32 0, !dbg !80
  %4 = bitcast %class.Node** %head2 to i32*, !dbg !80
  %5 = load %class.Node** %ss, align 4, !dbg !80
  %6 = ptrtoint %class.Node* %5 to i32, !dbg !80
  %7 = load %class.Node** %ssn, align 4, !dbg !80
  %8 = ptrtoint %class.Node* %7 to i32, !dbg !80
  %9 = cmpxchg i32* %4, i32 %6, i32 %8 seq_cst, !dbg !80
  %10 = icmp eq i32 %9, %6, !dbg !80
  %conv = zext i1 %10 to i32, !dbg !80
  %cmp3 = icmp eq i32 0, %conv, !dbg !80
  br i1 %cmp3, label %do.body, label %do.end, !dbg !80

do.end:                                           ; preds = %do.cond
  %11 = load %class.Node** %ss, align 4, !dbg !81
  store %class.Node* %11, %class.Node** %retval, !dbg !81
  br label %return, !dbg !81

return:                                           ; preds = %do.end, %if.then
  %12 = load %class.Node** %retval, !dbg !82
  ret %class.Node* %12, !dbg !82
}

define linkonce_odr void @_ZN4NodeC2Ev(%class.Node* %this) unnamed_addr nounwind align 2 {
entry:
  %this.addr = alloca %class.Node*, align 4
  store %class.Node* %this, %class.Node** %this.addr, align 4
  call void @llvm.dbg.declare(metadata !{%class.Node** %this.addr}, metadata !83), !dbg !84
  %this1 = load %class.Node** %this.addr
  %val = getelementptr inbounds %class.Node* %this1, i32 0, i32 0, !dbg !84
  store i32 0, i32* %val, align 4, !dbg !84
  ret void, !dbg !85
}

!llvm.dbg.cu = !{!0}

!0 = metadata !{i32 786449, i32 0, i32 4, metadata !"stack.cpp", metadata !"/home/thomas/Dropbox/Arbeit(SHK)/Oleg/Stack", metadata !"clang version 3.3 (trunk 168850)", i1 true, i1 false, metadata !"", i32 0, metadata !1, metadata !1, metadata !3, metadata !1} ; [ DW_TAG_compile_unit ] [/home/thomas/Dropbox/Arbeit(SHK)/Oleg/Stack/stack.cpp] [DW_LANG_C_plus_plus]
!1 = metadata !{metadata !2}
!2 = metadata !{i32 0}
!3 = metadata !{metadata !4}
!4 = metadata !{metadata !5, metadata !39, metadata !40, metadata !41, metadata !42}
!5 = metadata !{i32 786478, i32 0, null, metadata !"Stack", metadata !"Stack", metadata !"_ZN5StackC2Ev", metadata !6, i32 19, metadata !7, i1 false, i1 true, i32 0, i32 0, null, i32 256, i1 false, void (%class.Stack*)* @_ZN5StackC2Ev, null, metadata !26, metadata !1, i32 19} ; [ DW_TAG_subprogram ] [line 19] [def] [Stack]
!6 = metadata !{i32 786473, metadata !"stack.cpp", metadata !"/home/thomas/Dropbox/Arbeit(SHK)/Oleg/Stack", null} ; [ DW_TAG_file_type ]
!7 = metadata !{i32 786453, i32 0, metadata !"", i32 0, i32 0, i64 0, i64 0, i64 0, i32 0, null, metadata !8, i32 0, i32 0} ; [ DW_TAG_subroutine_type ] [line 0, size 0, align 0, offset 0] [from ]
!8 = metadata !{null, metadata !9}
!9 = metadata !{i32 786447, i32 0, metadata !"", i32 0, i32 0, i64 32, i64 32, i64 0, i32 1088, metadata !10} ; [ DW_TAG_pointer_type ] [line 0, size 32, align 32, offset 0] [from Stack]
!10 = metadata !{i32 786434, null, metadata !"Stack", metadata !6, i32 11, i64 32, i64 32, i32 0, i32 0, null, metadata !11, i32 0, null, null} ; [ DW_TAG_class_type ] [Stack] [line 11, size 32, align 32, offset 0] [from ]
!11 = metadata !{metadata !12, metadata !26, metadata !29, metadata !34}
!12 = metadata !{i32 786445, metadata !10, metadata !"head", metadata !6, i32 13, i64 32, i64 32, i64 0, i32 0, metadata !13} ; [ DW_TAG_member ] [head] [line 13, size 32, align 32, offset 0] [from ]
!13 = metadata !{i32 786485, null, metadata !"", null, i32 0, i64 0, i64 0, i64 0, i32 0, metadata !14} ; [ DW_TAG_volatile_type ] [line 0, size 0, align 0, offset 0] [from ]
!14 = metadata !{i32 786447, null, metadata !"", null, i32 0, i64 32, i64 32, i64 0, i32 0, metadata !15} ; [ DW_TAG_pointer_type ] [line 0, size 32, align 32, offset 0] [from Node]
!15 = metadata !{i32 786434, null, metadata !"Node", metadata !6, i32 3, i64 64, i64 32, i32 0, i32 0, null, metadata !16, i32 0, null, null} ; [ DW_TAG_class_type ] [Node] [line 3, size 64, align 32, offset 0] [from ]
!16 = metadata !{metadata !17, metadata !19, metadata !20}
!17 = metadata !{i32 786445, metadata !15, metadata !"val", metadata !6, i32 7, i64 32, i64 32, i64 0, i32 0, metadata !18} ; [ DW_TAG_member ] [val] [line 7, size 32, align 32, offset 0] [from int]
!18 = metadata !{i32 786468, null, metadata !"int", null, i32 0, i64 32, i64 32, i64 0, i32 0, i32 5} ; [ DW_TAG_base_type ] [int] [line 0, size 32, align 32, offset 0, enc DW_ATE_signed]
!19 = metadata !{i32 786445, metadata !15, metadata !"next", metadata !6, i32 8, i64 32, i64 32, i64 32, i32 0, metadata !14} ; [ DW_TAG_member ] [next] [line 8, size 32, align 32, offset 32] [from ]
!20 = metadata !{i32 786478, i32 0, metadata !15, metadata !"Node", metadata !"Node", metadata !"", metadata !6, i32 6, metadata !21, i1 false, i1 false, i32 0, i32 0, null, i32 256, i1 false, null, null, i32 0, metadata !24, i32 6} ; [ DW_TAG_subprogram ] [line 6] [Node]
!21 = metadata !{i32 786453, i32 0, metadata !"", i32 0, i32 0, i64 0, i64 0, i64 0, i32 0, null, metadata !22, i32 0, i32 0} ; [ DW_TAG_subroutine_type ] [line 0, size 0, align 0, offset 0] [from ]
!22 = metadata !{null, metadata !23}
!23 = metadata !{i32 786447, i32 0, metadata !"", i32 0, i32 0, i64 32, i64 32, i64 0, i32 1088, metadata !15} ; [ DW_TAG_pointer_type ] [line 0, size 32, align 32, offset 0] [from Node]
!24 = metadata !{metadata !25}
!25 = metadata !{i32 786468}                      ; [ DW_TAG_base_type ] [line 0, size 0, align 0, offset 0]
!26 = metadata !{i32 786478, i32 0, metadata !10, metadata !"Stack", metadata !"Stack", metadata !"", metadata !6, i32 14, metadata !7, i1 false, i1 false, i32 0, i32 0, null, i32 256, i1 false, null, null, i32 0, metadata !27, i32 14} ; [ DW_TAG_subprogram ] [line 14] [Stack]
!27 = metadata !{metadata !28}
!28 = metadata !{i32 786468}                      ; [ DW_TAG_base_type ] [line 0, size 0, align 0, offset 0]
!29 = metadata !{i32 786478, i32 0, metadata !10, metadata !"push", metadata !"push", metadata !"_ZN5Stack4pushEi", metadata !6, i32 15, metadata !30, i1 false, i1 false, i32 0, i32 0, null, i32 256, i1 false, null, null, i32 0, metadata !32, i32 15} ; [ DW_TAG_subprogram ] [line 15] [push]
!30 = metadata !{i32 786453, i32 0, metadata !"", i32 0, i32 0, i64 0, i64 0, i64 0, i32 0, null, metadata !31, i32 0, i32 0} ; [ DW_TAG_subroutine_type ] [line 0, size 0, align 0, offset 0] [from ]
!31 = metadata !{null, metadata !9, metadata !18}
!32 = metadata !{metadata !33}
!33 = metadata !{i32 786468}                      ; [ DW_TAG_base_type ] [line 0, size 0, align 0, offset 0]
!34 = metadata !{i32 786478, i32 0, metadata !10, metadata !"pop", metadata !"pop", metadata !"_ZN5Stack3popEv", metadata !6, i32 16, metadata !35, i1 false, i1 false, i32 0, i32 0, null, i32 256, i1 false, null, null, i32 0, metadata !37, i32 16} ; [ DW_TAG_subprogram ] [line 16] [pop]
!35 = metadata !{i32 786453, i32 0, metadata !"", i32 0, i32 0, i64 0, i64 0, i64 0, i32 0, null, metadata !36, i32 0, i32 0} ; [ DW_TAG_subroutine_type ] [line 0, size 0, align 0, offset 0] [from ]
!36 = metadata !{metadata !14, metadata !9}
!37 = metadata !{metadata !38}
!38 = metadata !{i32 786468}                      ; [ DW_TAG_base_type ] [line 0, size 0, align 0, offset 0]
!39 = metadata !{i32 786478, i32 0, null, metadata !"push", metadata !"push", metadata !"_ZN5Stack4pushEi", metadata !6, i32 21, metadata !30, i1 false, i1 true, i32 0, i32 0, null, i32 256, i1 false, void (%class.Stack*, i32)* @_ZN5Stack4pushEi, null, metadata !29, metadata !1, i32 22} ; [ DW_TAG_subprogram ] [line 21] [def] [scope 22] [push]
!40 = metadata !{i32 786478, i32 0, null, metadata !"pop", metadata !"pop", metadata !"_ZN5Stack3popEv", metadata !6, i32 32, metadata !35, i1 false, i1 true, i32 0, i32 0, null, i32 256, i1 false, %class.Node* (%class.Stack*)* @_ZN5Stack3popEv, null, metadata !34, metadata !1, i32 33} ; [ DW_TAG_subprogram ] [line 32] [def] [scope 33] [pop]
!41 = metadata !{i32 786478, i32 0, null, metadata !"Node", metadata !"Node", metadata !"_ZN4NodeC1Ev", metadata !6, i32 6, metadata !21, i1 false, i1 true, i32 0, i32 0, null, i32 256, i1 false, void (%class.Node*)* @_ZN4NodeC1Ev, null, metadata !20, metadata !1, i32 6} ; [ DW_TAG_subprogram ] [line 6] [def] [Node]
!42 = metadata !{i32 786478, i32 0, null, metadata !"Node", metadata !"Node", metadata !"_ZN4NodeC2Ev", metadata !6, i32 6, metadata !21, i1 false, i1 true, i32 0, i32 0, null, i32 256, i1 false, void (%class.Node*)* @_ZN4NodeC2Ev, null, metadata !20, metadata !1, i32 6} ; [ DW_TAG_subprogram ] [line 6] [def] [Node]
!43 = metadata !{i32 786689, metadata !5, metadata !"this", metadata !6, i32 16777235, metadata !44, i32 1088, i32 0} ; [ DW_TAG_arg_variable ] [this] [line 19]
!44 = metadata !{i32 786447, null, metadata !"", null, i32 0, i64 32, i64 32, i64 0, i32 0, metadata !10} ; [ DW_TAG_pointer_type ] [line 0, size 32, align 32, offset 0] [from Stack]
!45 = metadata !{i32 19, i32 0, metadata !5, null}
!46 = metadata !{i32 19, i32 0, metadata !47, null}
!47 = metadata !{i32 786443, metadata !5, i32 19, i32 0, metadata !6, i32 0} ; [ DW_TAG_lexical_block ] [/home/thomas/Dropbox/Arbeit(SHK)/Oleg/Stack/stack.cpp]
!48 = metadata !{i32 786689, metadata !39, metadata !"this", metadata !6, i32 16777237, metadata !44, i32 1088, i32 0} ; [ DW_TAG_arg_variable ] [this] [line 21]
!49 = metadata !{i32 21, i32 0, metadata !39, null}
!50 = metadata !{i32 786689, metadata !39, metadata !"v", metadata !6, i32 33554453, metadata !18, i32 0, i32 0} ; [ DW_TAG_arg_variable ] [v] [line 21]
!51 = metadata !{i32 786688, metadata !52, metadata !"n", metadata !6, i32 23, metadata !14, i32 0, i32 0} ; [ DW_TAG_auto_variable ] [n] [line 23]
!52 = metadata !{i32 786443, metadata !39, i32 22, i32 0, metadata !6, i32 1} ; [ DW_TAG_lexical_block ] [/home/thomas/Dropbox/Arbeit(SHK)/Oleg/Stack/stack.cpp]
!53 = metadata !{i32 23, i32 0, metadata !52, null}
!54 = metadata !{i32 786688, metadata !52, metadata !"ss", metadata !6, i32 23, metadata !14, i32 0, i32 0} ; [ DW_TAG_auto_variable ] [ss] [line 23]
!55 = metadata !{i32 24, i32 0, metadata !52, null}
!56 = metadata !{i32 25, i32 0, metadata !52, null}
!57 = metadata !{i32 26, i32 0, metadata !52, null}
!58 = metadata !{i32 27, i32 0, metadata !59, null}
!59 = metadata !{i32 786443, metadata !52, i32 26, i32 0, metadata !6, i32 2} ; [ DW_TAG_lexical_block ] [/home/thomas/Dropbox/Arbeit(SHK)/Oleg/Stack/stack.cpp]
!60 = metadata !{i32 28, i32 0, metadata !59, null}
!61 = metadata !{i32 29, i32 0, metadata !59, null}
!62 = metadata !{i32 29, i32 0, metadata !52, null}
!63 = metadata !{i32 30, i32 0, metadata !52, null}
!64 = metadata !{i32 786689, metadata !41, metadata !"this", metadata !6, i32 16777222, metadata !14, i32 1088, i32 0} ; [ DW_TAG_arg_variable ] [this] [line 6]
!65 = metadata !{i32 6, i32 0, metadata !41, null}
!66 = metadata !{i32 786689, metadata !40, metadata !"this", metadata !6, i32 16777248, metadata !44, i32 1088, i32 0} ; [ DW_TAG_arg_variable ] [this] [line 32]
!67 = metadata !{i32 32, i32 0, metadata !40, null}
!68 = metadata !{i32 786688, metadata !69, metadata !"ss", metadata !6, i32 34, metadata !14, i32 0, i32 0} ; [ DW_TAG_auto_variable ] [ss] [line 34]
!69 = metadata !{i32 786443, metadata !40, i32 33, i32 0, metadata !6, i32 3} ; [ DW_TAG_lexical_block ] [/home/thomas/Dropbox/Arbeit(SHK)/Oleg/Stack/stack.cpp]
!70 = metadata !{i32 34, i32 0, metadata !69, null}
!71 = metadata !{i32 786688, metadata !69, metadata !"ssn", metadata !6, i32 34, metadata !14, i32 0, i32 0} ; [ DW_TAG_auto_variable ] [ssn] [line 34]
!72 = metadata !{i32 35, i32 0, metadata !69, null}
!73 = metadata !{i32 36, i32 0, metadata !74, null}
!74 = metadata !{i32 786443, metadata !69, i32 35, i32 0, metadata !6, i32 4} ; [ DW_TAG_lexical_block ] [/home/thomas/Dropbox/Arbeit(SHK)/Oleg/Stack/stack.cpp]
!75 = metadata !{i32 37, i32 0, metadata !74, null}
!76 = metadata !{i32 39, i32 0, metadata !77, null}
!77 = metadata !{i32 786443, metadata !74, i32 38, i32 0, metadata !6, i32 5} ; [ DW_TAG_lexical_block ] [/home/thomas/Dropbox/Arbeit(SHK)/Oleg/Stack/stack.cpp]
!78 = metadata !{i32 41, i32 0, metadata !74, null}
!79 = metadata !{i32 42, i32 0, metadata !74, null}
!80 = metadata !{i32 42, i32 0, metadata !69, null}
!81 = metadata !{i32 43, i32 0, metadata !69, null}
!82 = metadata !{i32 44, i32 0, metadata !69, null}
!83 = metadata !{i32 786689, metadata !42, metadata !"this", metadata !6, i32 16777222, metadata !14, i32 1088, i32 0} ; [ DW_TAG_arg_variable ] [this] [line 6]
!84 = metadata !{i32 6, i32 0, metadata !42, null}
!85 = metadata !{i32 6, i32 0, metadata !86, null}
!86 = metadata !{i32 786443, metadata !42, i32 6, i32 0, metadata !6, i32 6} ; [ DW_TAG_lexical_block ] [/home/thomas/Dropbox/Arbeit(SHK)/Oleg/Stack/stack.cpp]
