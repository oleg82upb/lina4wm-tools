; ModuleID = 'stack.cpp'
target datalayout = "e-p:32:32:32-i1:8:8-i8:8:8-i16:16:16-i32:32:32-i64:32:64-f32:32:32-f64:32:64-v64:64:64-v128:128:128-a0:0:64-f80:32:32-n8:16:32-S128"
target triple = "i386-pc-linux-gnu"

%class.Stack = type { %class.Node* }
%class.Node = type { i32, %class.Node* }

@_ZN5StackC1Ev = alias void (%class.Stack*)* @_ZN5StackC2Ev

define void @_ZN5StackC2Ev(%class.Stack* nocapture %this) unnamed_addr nounwind align 2 {
entry:
  tail call void @llvm.dbg.value(metadata !{%class.Stack* %this}, i64 0, metadata !41), !dbg !66
  %head = getelementptr inbounds %class.Stack* %this, i32 0, i32 0, !dbg !66
  store volatile %class.Node* null, %class.Node** %head, align 4, !dbg !66, !tbaa !67
  ret void, !dbg !70
}

define void @_ZN5Stack4pushEi(%class.Stack* %this, i32 %v) align 2 {
invoke.cont:
  tail call void @llvm.dbg.value(metadata !{%class.Stack* %this}, i64 0, metadata !46), !dbg !72
  tail call void @llvm.dbg.value(metadata !{i32 %v}, i64 0, metadata !47), !dbg !72
  %call = tail call noalias i8* @_Znwj(i32 8), !dbg !73
  %val = bitcast i8* %call to i32*, !dbg !74
  store i32 %v, i32* %val, align 4, !dbg !74, !tbaa !75
  %head = getelementptr inbounds %class.Stack* %this, i32 0, i32 0, !dbg !76
  %next = getelementptr inbounds i8* %call, i32 4, !dbg !78
  %0 = bitcast i8* %next to %class.Node**, !dbg !78
  %1 = bitcast %class.Stack* %this to i32*, !dbg !79
  %2 = ptrtoint i8* %call to i32, !dbg !79
  br label %do.body, !dbg !80

do.body:                                          ; preds = %do.body, %invoke.cont
  %3 = load volatile %class.Node** %head, align 4, !dbg !76, !tbaa !67
  tail call void @llvm.dbg.value(metadata !{%class.Node* %3}, i64 0, metadata !50), !dbg !76
  store %class.Node* %3, %class.Node** %0, align 4, !dbg !78, !tbaa !67
  %4 = ptrtoint %class.Node* %3 to i32, !dbg !79
  %5 = cmpxchg i32* %1, i32 %4, i32 %2 seq_cst, !dbg !79
  %6 = icmp eq i32 %5, %4, !dbg !79
  br i1 %6, label %do.end, label %do.body, !dbg !79

do.end:                                           ; preds = %do.body
  ret void, !dbg !81
}

declare noalias i8* @_Znwj(i32)

define %class.Node* @_ZN5Stack3popEv(%class.Stack* %this) nounwind align 2 {
entry:
  tail call void @llvm.dbg.value(metadata !{%class.Stack* %this}, i64 0, metadata !54), !dbg !82
  %head = getelementptr inbounds %class.Stack* %this, i32 0, i32 0, !dbg !83
  %0 = bitcast %class.Stack* %this to i32*, !dbg !85
  br label %do.body, !dbg !86

do.body:                                          ; preds = %if.end, %entry
  %1 = load volatile %class.Node** %head, align 4, !dbg !83, !tbaa !67
  tail call void @llvm.dbg.value(metadata !{%class.Node* %1}, i64 0, metadata !55), !dbg !83
  %cmp = icmp eq %class.Node* %1, null, !dbg !87
  br i1 %cmp, label %return, label %if.end, !dbg !87

if.end:                                           ; preds = %do.body
  %next = getelementptr inbounds %class.Node* %1, i32 0, i32 1, !dbg !88
  %2 = load %class.Node** %next, align 4, !dbg !88, !tbaa !67
  tail call void @llvm.dbg.value(metadata !{%class.Node* %2}, i64 0, metadata !57), !dbg !88
  %3 = ptrtoint %class.Node* %1 to i32, !dbg !85
  %4 = ptrtoint %class.Node* %2 to i32, !dbg !85
  %5 = cmpxchg i32* %0, i32 %3, i32 %4 seq_cst, !dbg !85
  %6 = icmp eq i32 %5, %3, !dbg !85
  br i1 %6, label %return, label %do.body, !dbg !85

return:                                           ; preds = %if.end, %do.body
  %retval.0 = phi %class.Node* [ null, %do.body ], [ %1, %if.end ]
  ret %class.Node* %retval.0, !dbg !89
}

declare void @llvm.dbg.value(metadata, i64, metadata) nounwind readnone

!llvm.dbg.cu = !{!0}

!0 = metadata !{i32 786449, i32 0, i32 4, metadata !"stack.cpp", metadata !"/home/thomas/Dropbox/Arbeit(SHK)/Oleg/Stack", metadata !"clang version 3.3 (trunk 168850)", i1 true, i1 true, metadata !"", i32 0, metadata !1, metadata !1, metadata !3, metadata !1} ; [ DW_TAG_compile_unit ] [/home/thomas/Dropbox/Arbeit(SHK)/Oleg/Stack/stack.cpp] [DW_LANG_C_plus_plus]
!1 = metadata !{metadata !2}
!2 = metadata !{i32 0}
!3 = metadata !{metadata !4}
!4 = metadata !{metadata !5, metadata !43, metadata !51, metadata !58, metadata !62}
!5 = metadata !{i32 786478, i32 0, null, metadata !"Stack", metadata !"Stack", metadata !"_ZN5StackC2Ev", metadata !6, i32 19, metadata !7, i1 false, i1 true, i32 0, i32 0, null, i32 256, i1 true, void (%class.Stack*)* @_ZN5StackC2Ev, null, metadata !26, metadata !39, i32 19} ; [ DW_TAG_subprogram ] [line 19] [def] [Stack]
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
!20 = metadata !{i32 786478, i32 0, metadata !15, metadata !"Node", metadata !"Node", metadata !"", metadata !6, i32 6, metadata !21, i1 false, i1 false, i32 0, i32 0, null, i32 256, i1 true, null, null, i32 0, metadata !24, i32 6} ; [ DW_TAG_subprogram ] [line 6] [Node]
!21 = metadata !{i32 786453, i32 0, metadata !"", i32 0, i32 0, i64 0, i64 0, i64 0, i32 0, null, metadata !22, i32 0, i32 0} ; [ DW_TAG_subroutine_type ] [line 0, size 0, align 0, offset 0] [from ]
!22 = metadata !{null, metadata !23}
!23 = metadata !{i32 786447, i32 0, metadata !"", i32 0, i32 0, i64 32, i64 32, i64 0, i32 1088, metadata !15} ; [ DW_TAG_pointer_type ] [line 0, size 32, align 32, offset 0] [from Node]
!24 = metadata !{metadata !25}
!25 = metadata !{i32 786468}                      ; [ DW_TAG_base_type ] [line 0, size 0, align 0, offset 0]
!26 = metadata !{i32 786478, i32 0, metadata !10, metadata !"Stack", metadata !"Stack", metadata !"", metadata !6, i32 14, metadata !7, i1 false, i1 false, i32 0, i32 0, null, i32 256, i1 true, null, null, i32 0, metadata !27, i32 14} ; [ DW_TAG_subprogram ] [line 14] [Stack]
!27 = metadata !{metadata !28}
!28 = metadata !{i32 786468}                      ; [ DW_TAG_base_type ] [line 0, size 0, align 0, offset 0]
!29 = metadata !{i32 786478, i32 0, metadata !10, metadata !"push", metadata !"push", metadata !"_ZN5Stack4pushEi", metadata !6, i32 15, metadata !30, i1 false, i1 false, i32 0, i32 0, null, i32 256, i1 true, null, null, i32 0, metadata !32, i32 15} ; [ DW_TAG_subprogram ] [line 15] [push]
!30 = metadata !{i32 786453, i32 0, metadata !"", i32 0, i32 0, i64 0, i64 0, i64 0, i32 0, null, metadata !31, i32 0, i32 0} ; [ DW_TAG_subroutine_type ] [line 0, size 0, align 0, offset 0] [from ]
!31 = metadata !{null, metadata !9, metadata !18}
!32 = metadata !{metadata !33}
!33 = metadata !{i32 786468}                      ; [ DW_TAG_base_type ] [line 0, size 0, align 0, offset 0]
!34 = metadata !{i32 786478, i32 0, metadata !10, metadata !"pop", metadata !"pop", metadata !"_ZN5Stack3popEv", metadata !6, i32 16, metadata !35, i1 false, i1 false, i32 0, i32 0, null, i32 256, i1 true, null, null, i32 0, metadata !37, i32 16} ; [ DW_TAG_subprogram ] [line 16] [pop]
!35 = metadata !{i32 786453, i32 0, metadata !"", i32 0, i32 0, i64 0, i64 0, i64 0, i32 0, null, metadata !36, i32 0, i32 0} ; [ DW_TAG_subroutine_type ] [line 0, size 0, align 0, offset 0] [from ]
!36 = metadata !{metadata !14, metadata !9}
!37 = metadata !{metadata !38}
!38 = metadata !{i32 786468}                      ; [ DW_TAG_base_type ] [line 0, size 0, align 0, offset 0]
!39 = metadata !{metadata !40}
!40 = metadata !{metadata !41}
!41 = metadata !{i32 786689, metadata !5, metadata !"this", metadata !6, i32 16777235, metadata !42, i32 1088, i32 0} ; [ DW_TAG_arg_variable ] [this] [line 19]
!42 = metadata !{i32 786447, null, metadata !"", null, i32 0, i64 32, i64 32, i64 0, i32 0, metadata !10} ; [ DW_TAG_pointer_type ] [line 0, size 32, align 32, offset 0] [from Stack]
!43 = metadata !{i32 786478, i32 0, null, metadata !"push", metadata !"push", metadata !"_ZN5Stack4pushEi", metadata !6, i32 21, metadata !30, i1 false, i1 true, i32 0, i32 0, null, i32 256, i1 true, void (%class.Stack*, i32)* @_ZN5Stack4pushEi, null, metadata !29, metadata !44, i32 22} ; [ DW_TAG_subprogram ] [line 21] [def] [scope 22] [push]
!44 = metadata !{metadata !45}
!45 = metadata !{metadata !46, metadata !47, metadata !48, metadata !50}
!46 = metadata !{i32 786689, metadata !43, metadata !"this", metadata !6, i32 16777237, metadata !42, i32 1088, i32 0} ; [ DW_TAG_arg_variable ] [this] [line 21]
!47 = metadata !{i32 786689, metadata !43, metadata !"v", metadata !6, i32 33554453, metadata !18, i32 0, i32 0} ; [ DW_TAG_arg_variable ] [v] [line 21]
!48 = metadata !{i32 786688, metadata !49, metadata !"n", metadata !6, i32 23, metadata !14, i32 0, i32 0} ; [ DW_TAG_auto_variable ] [n] [line 23]
!49 = metadata !{i32 786443, metadata !43, i32 22, i32 0, metadata !6, i32 1} ; [ DW_TAG_lexical_block ] [/home/thomas/Dropbox/Arbeit(SHK)/Oleg/Stack/stack.cpp]
!50 = metadata !{i32 786688, metadata !49, metadata !"ss", metadata !6, i32 23, metadata !14, i32 0, i32 0} ; [ DW_TAG_auto_variable ] [ss] [line 23]
!51 = metadata !{i32 786478, i32 0, null, metadata !"pop", metadata !"pop", metadata !"_ZN5Stack3popEv", metadata !6, i32 32, metadata !35, i1 false, i1 true, i32 0, i32 0, null, i32 256, i1 true, %class.Node* (%class.Stack*)* @_ZN5Stack3popEv, null, metadata !34, metadata !52, i32 33} ; [ DW_TAG_subprogram ] [line 32] [def] [scope 33] [pop]
!52 = metadata !{metadata !53}
!53 = metadata !{metadata !54, metadata !55, metadata !57}
!54 = metadata !{i32 786689, metadata !51, metadata !"this", metadata !6, i32 16777248, metadata !42, i32 1088, i32 0} ; [ DW_TAG_arg_variable ] [this] [line 32]
!55 = metadata !{i32 786688, metadata !56, metadata !"ss", metadata !6, i32 34, metadata !14, i32 0, i32 0} ; [ DW_TAG_auto_variable ] [ss] [line 34]
!56 = metadata !{i32 786443, metadata !51, i32 33, i32 0, metadata !6, i32 3} ; [ DW_TAG_lexical_block ] [/home/thomas/Dropbox/Arbeit(SHK)/Oleg/Stack/stack.cpp]
!57 = metadata !{i32 786688, metadata !56, metadata !"ssn", metadata !6, i32 34, metadata !14, i32 0, i32 0} ; [ DW_TAG_auto_variable ] [ssn] [line 34]
!58 = metadata !{i32 786478, i32 0, null, metadata !"Node", metadata !"Node", metadata !"_ZN4NodeC1Ev", metadata !6, i32 6, metadata !21, i1 false, i1 true, i32 0, i32 0, null, i32 256, i1 true, null, null, metadata !20, metadata !59, i32 6} ; [ DW_TAG_subprogram ] [line 6] [def] [Node]
!59 = metadata !{metadata !60}
!60 = metadata !{metadata !61}
!61 = metadata !{i32 786689, metadata !58, metadata !"this", metadata !6, i32 16777222, metadata !14, i32 1088, i32 0} ; [ DW_TAG_arg_variable ] [this] [line 6]
!62 = metadata !{i32 786478, i32 0, null, metadata !"Node", metadata !"Node", metadata !"_ZN4NodeC2Ev", metadata !6, i32 6, metadata !21, i1 false, i1 true, i32 0, i32 0, null, i32 256, i1 true, null, null, metadata !20, metadata !63, i32 6} ; [ DW_TAG_subprogram ] [line 6] [def] [Node]
!63 = metadata !{metadata !64}
!64 = metadata !{metadata !65}
!65 = metadata !{i32 786689, metadata !62, metadata !"this", metadata !6, i32 16777222, metadata !14, i32 1088, i32 0} ; [ DW_TAG_arg_variable ] [this] [line 6]
!66 = metadata !{i32 19, i32 0, metadata !5, null}
!67 = metadata !{metadata !"any pointer", metadata !68}
!68 = metadata !{metadata !"omnipotent char", metadata !69}
!69 = metadata !{metadata !"Simple C/C++ TBAA"}
!70 = metadata !{i32 19, i32 0, metadata !71, null}
!71 = metadata !{i32 786443, metadata !5, i32 19, i32 0, metadata !6, i32 0} ; [ DW_TAG_lexical_block ] [/home/thomas/Dropbox/Arbeit(SHK)/Oleg/Stack/stack.cpp]
!72 = metadata !{i32 21, i32 0, metadata !43, null}
!73 = metadata !{i32 24, i32 0, metadata !49, null}
!74 = metadata !{i32 25, i32 0, metadata !49, null}
!75 = metadata !{metadata !"int", metadata !68}
!76 = metadata !{i32 27, i32 0, metadata !77, null}
!77 = metadata !{i32 786443, metadata !49, i32 26, i32 0, metadata !6, i32 2} ; [ DW_TAG_lexical_block ] [/home/thomas/Dropbox/Arbeit(SHK)/Oleg/Stack/stack.cpp]
!78 = metadata !{i32 28, i32 0, metadata !77, null}
!79 = metadata !{i32 29, i32 0, metadata !49, null}
!80 = metadata !{i32 26, i32 0, metadata !49, null}
!81 = metadata !{i32 30, i32 0, metadata !49, null}
!82 = metadata !{i32 32, i32 0, metadata !51, null}
!83 = metadata !{i32 36, i32 0, metadata !84, null}
!84 = metadata !{i32 786443, metadata !56, i32 35, i32 0, metadata !6, i32 4} ; [ DW_TAG_lexical_block ] [/home/thomas/Dropbox/Arbeit(SHK)/Oleg/Stack/stack.cpp]
!85 = metadata !{i32 42, i32 0, metadata !56, null}
!86 = metadata !{i32 35, i32 0, metadata !56, null}
!87 = metadata !{i32 37, i32 0, metadata !84, null}
!88 = metadata !{i32 41, i32 0, metadata !84, null}
!89 = metadata !{i32 44, i32 0, metadata !56, null}
