define void @_Test() nounwind readonly {
entry:
  %b = add i32 5, 0
  %r1 = alloca i32
  store i32 %b, i32* %r1
  %0 = load i32* %r1, align 4, !tbaa !0
  fence singlethread seq_cst             ; yields void  
return:
  ret void
} 