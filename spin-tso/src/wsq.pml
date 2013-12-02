
alloca(struct_item_t, wsq);
short top, bottom

inline expand(return)
{	
	short newsize, newitems, newq, i, size, size3, size6, ap, ap2, arrayindex, arrayindex2, rem ,rem2;
	short v0, v1, v2, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14, v15, v16, v17, v18, v19, v20, v21, v22, v23;
	atomic{
		alloca(I32, newsize);
		alloca(Ptr, newitems);
		alloca(struct_item_t, newq);
		alloca(I32,i);
	}
	read(wsq,v0);
	getelementptr(struct_item_t, v0, 0,size);
	read(size,v1);
	v1=v1*2
	write(newsize,v1);
	read(newsize,v2);
	alloca(4*v2,newitems);//eig Pointer auf newitems
	//...???...
	read(top,v5);
	write(i,v5);
	
forCond:
	read(i, v6);
	read(bottom, v7);	
	if
	::(v6 < v7) -> goto forBody; 	// in llvm: slt "=" Signed Less Equal (<)
	::else -> goto forEnd;
	fi
	->

forBody:
	read(i, v8);
	read(wsq,v9); //eig Pointer
	getelementptr(struct_item_t, v9, 0, size3);
	read(size3, v10);
	rem = v8 % v10;
	read(wsq, v11); //eig Pointer
	getelemtptr(struct_item_t, v11, 1, ap);
	read(ap, v12);
	getelementptr(I32, v12, rem, arrayindex); //???????????
	read(arrayindex, v13);
	read(i, v14);
	read(newsize, v15);
	rem2 = v14 % v15;
	read(newitems, v16);
	getelementptr(I32, v16, rem2, arraindex2);
	write(arrayindex2, v13);
//-----------------------------
// ersetzbar durch
//	i = i+1;
//	goto forCond;
forInc:
	read(i, v17);
	v17 = v17 + 1;
	write(i, v17); 
	goto forCond;	
//--------------------------

forEnd:
	read(newsize, v18);
	read(newq, v19);
	getelementptr(struct_item_t, v19, 0, size6);
	write(size6, v18);
	read(newitems, v20);
	read(newq, v21);
	getelementptr(struct_item_t, v21, 1, ap2);
	write(ap2, v20);
	read(newq, v22);
	write(wsq, v22);
	read(newq, v23);
	return = v23;		
}	


inline push(task)
{
	short task_addr, b, t, q, size, size2, sub, sub1, return, rem, ap, arrayindex;
	short v0, v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13;
entry:
	atomic{
		alloca(I32,task_addr);
		alloca(I32,b);
		alloca(I32,t);
		alloca(struct_item_t,q);
	}
	write(task_addr,task);
	read(bottom, v0);
	write(b,v0);
	read(top, v1);
	write(t, v1);
	read(wsq, v2);
	write(q,t);
	read(b, v3);
	read(t, v4);
	sub = v3 - v4;
	read(q, v5);
	getelementptr(struct_item_t, v5, 0, size);
	read(size, v6);
	sub1 = v6 - 1;
	if
	::(sub <= sub1) -> 	expand(return);//  return irgendwo deklarieren???
						write(q, return); 
	:: else -> break;
	fi;
	
	read(v7, task_addr);
	read(b, v8);
	read(q, v9);
	getelementptr(struct_item_t, v9, 0, size2);
	read(size2, v10);
	rem = v8 % v10;
	read(q, v11);
	getelementptr(struct_item_t, v11, 1, ap);
	read(ap, v12);
	getelementptr(I32, v12, rem, arrayindex);
	write(arrayindex, v7);
	read(b, v13);
	v13 = v13 +1;
	write(bottom, v13);	
}	
	
inline take()
{
	
	
}


init {
}

