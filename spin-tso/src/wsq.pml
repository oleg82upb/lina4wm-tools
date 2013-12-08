/*
author: Annika Mütze <muetze.annika@gmail.com>
date: 12.2013

workstealing queue implementation
*/
/*
	trying to specify the LLVM-compiled workstealingqueue implementation (wsq.s)
*/

#define BUFF_SIZE 12 	//size of Buffer
#define MEM_SIZE 13	//size of memory

//-----------------------------------------------------------------------------------------------------------------------------------------------
#include "x86_tso_buffer.pml"
//-----------------------------------------------------------------------------------------------------------------------------------------------
//Types for LLVM, actually their length in size of pointers and values
#define I32  0 		// = {0};
#define Ptr  0
#define struct_item_t 1
short memUse = 2; 	//shows to the next free cell in memory

//global variable declaration
#define wsq 1
short top, bottom;

chan channelT1 = [0] of {mtype, short, short, short};
chan channelT2 = [0] of {mtype, short, short, short};


inline getelementptr(type, instance, offset, targetRegister)
{
	atomic{
	//simplified version of what llvm does.
	//offset directly correspond to adding it to instance address. 
	assert(offset <= type); //offset shouldn't be greater than the type range
	targetRegister = instance + offset;
	}
}

inline alloca(type, targetRegister)
{
	atomic{
	targetRegister = memUse;
	memUse = memUse + type + 1;
	assert(memUse < MEM_SIZE);
	}
}
//-------------------------------------------------------------------------------------------------

inline expand(returnval){
	
	short newsize, newitems, newq, i, size, size3, size6, ap, ap2, arrayindex, arrayindex2, rem, rem2;
	short v0, v1, v2, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14, v15, v16, v17, v18, v19, v20, v21, v22, v23;

entry:	
	atomic{
		alloca(I32, newsize);
		alloca(Ptr, newitems);
		alloca(Ptr, newq);
		alloca(I32, i);
	}
	read(wsq,v0);
	getelementptr(struct_item_t, v0, 0,size);
	read(size,v1);
	v1=v1*2;
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
	returnval = v23;		
}	


inline push(task)
{
	short task_addr, b, t, q, size, size2, sub, sub1, returnval, rem, ap, arrayindex;
	short v0, v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13;
entry:
	atomic{
		alloca(I32,task_addr);
		alloca(I32,b);
		alloca(I32,t);
		alloca(Ptr,q);
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
	::(sub <= sub1) -> 	expand(returnval);//  return irgendwo deklarieren???
						write(q, returnval); 
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
	
inline take(returnvalue)
{
	atomic{
		alloca(I32, retval);
		alloca(I32, b);
		alloca(Ptr, q);
		alloca(I32, t);
		alloca(I32, task);
	}
	read(bottom, v0);
	v0 = v0 - 1;
	write(b, v0);
	read(wsq, v1);
	write(q, v1);
	read(b, v2);
	write(bottom, v2);
	read(top, v3);
	write(t, v3);
	read(b, v4);
	read(t, v5);
	if
	:: (v4 < v5) -> goto ifThen;
	:: else -> goto ifEnd;
	fi;
	
ifThen:
	read(t, v6);
	write(bottom, v6);
	write(retval, 42);
	goto returnState;
	
ifEnd:
	read(b, v7);
	read(q, v8);
	getelementptr(struct_item_t, v8, 0, size);
	read(size, v9);
	rem = v7 % v9;
	read(q, v10);
	getelementptr(struct_item_t, v10, 1, ap);
	read(ap, v11);
	getelementptr(I32, v11, rem, arrayindex);
	read(arrayindex, v12);
	write(task, v12);
	read(b, v13);
	read(t, v14);
	if
	::(v13 > v14) -> 	read(task, v15);
						write(retval, v15);
						goto returnState;
	:: else -> goto ifEnd3;
	fi;
	
ifEnd3:
	read(t, v16);
	read(t, v17);
	v17 = v17 + 1;
	Cas(top, v16, v17, v18);
	if
	:: (v16 == v18) -> goto ifEnd5;
	:: else -> write(retval, 42); goto returnState;
	fi;

ifEnd5:
	read(t, v20);
	v20 = v20 + 1;
	write(bottom, v20);
	read(task, v21);
	write(retval, v21);
	goto returnState;
	
returnState:
	read(retval, v22);
	returnvalue = v22; 
}

inline steal(){

entry:
	atomic{
		alloca(I32, retval);
		alloca(I32, t);
		alloca(I32, b);
		alloca(Ptr, q);
		alloca(I32, task);
	}
	read(top, v0);
	write(t, v0);
	read(bottom, v1);
	write(b,v1);
	read(wsq, v2);
	
		

proctype process1 (chan ch){
	push(5); 
}

proctype process2 (chan ch){
	push(7); 
}
init{		
	atomic{
		run process1(channelT1);
		run bufferProcess(channelT1);
		run process2(channelT2);
		run bufferProcess(channelT2	);
		//run process3(channelT3);
		//run bufferProcess(channelT3	);
	}
}	

