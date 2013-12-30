/*
author: Annika Mütze <muetze.annika@gmail.com>
date: 12.2013

workstealing queue implementation
*/
/*
	trying to specify the LLVM-compiled workstealingqueue implementation (wsq.s)
*/

#define BUFF_SIZE 5 	//size of Buffer
#define MEM_SIZE 15	//size of memory

//-----------------------------------------------------------------------------------------------------------------------------------------------
#include "x86_tso_buffer.pml"
//-----------------------------------------------------------------------------------------------------------------------------------------------
//Types for LLVM, actually their length in size of pointers and values
#define I32  0 		// = {0};
#define Ptr  0
#define item_t 1	// stands for typedef item_t{short size; short* ap};

short memUse = 1; 	//shows to the next free cell in memory


//global variable declaration
short wsq_ptr, top, bottom;

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
	
	short exp_newsize, exp_newitems, exp_newq, j, exp_size, exp_size3, exp_size6, exp_ap, exp_ap2, exp_arrayindex, exp_arrayindex2;
	short exp_v0, exp_v1, exp_v2, exp_v5, exp_v6, exp_v7, exp_v8, exp_v9, exp_v10, exp_v11, exp_v12, exp_v13, exp_v14, exp_v15, exp_v16, exp_v17, exp_v18, exp_v19, exp_v20, exp_v21, exp_v22, exp_v23;

entry:	
	atomic{
		alloca(I32, exp_newsize);
		//alloca(Ptr, exp_newitems);
		alloca(item_t, exp_newq);
		
		alloca(I32, j);
	}
	getelementptr(item_t, wsq_ptr, 0, exp_size);
	read(exp_size, exp_v1);
	write(exp_newsize, 2*exp_v1);	//isn't it local aswell? so just alloca (exp_v1*2, newitems);
	alloca(exp_newsize, exp_newitems); //creats an array of size newsize
	read(top,exp_v5);
	write(j,exp_v5);
	
forCond:
	read(j, exp_v6);
	read(bottom, exp_v7);	
	if
	::(exp_v6 < exp_v7) -> goto forBody; 	// in llvm: slt "=" Signed Less Equal (<)
	::else -> goto forEnd;
	fi
	->

forBody:
	read(j, exp_v8);
	getelementptr(item_t, wsq_ptr, 0, exp_size3);
	read(exp_size3, exp_v10);
	getelementptr(item_t, wsq_ptr, 1, exp_ap);
	read(exp_ap, exp_v12);
	getelementptr(exp_v10, exp_v12, exp_v8  % exp_v10, exp_arrayindex); // exp_v10 is the size of the "old" wsq_ptr. so loop through this array which has no more than exp_v10 entries.
	read(exp_arrayindex, exp_v13); //exp_13 holds the value which stands in the array at the certain place
	read(j, exp_v14);
	read(exp_newsize, exp_v15);
	read(exp_newitems, exp_v16);
	getelementptr(exp_newsize, exp_v16, exp_v14 % exp_v15, exp_arrayindex2);
	write(exp_arrayindex2, exp_v13); //should write the contain of the old array in the newone
//--------------------------	
/*alternative? Pointerproblem!
	forInc:	
	j = j+1;
	goto forCond;
*/
//--------------------------
	
forInc:
	read(j, exp_v17);
	exp_v17 = exp_v17 + 1;
	write(j, exp_v17); 
	goto forCond;	

forEnd:
	read(exp_newsize, exp_v18);
	getelementptr(item_t, exp_newq, 0, exp_size6);
	write(exp_size6, exp_v18);
	//read(exp_newitems, exp_v20);
	getelementptr(item_t, exp_newq, 1, exp_ap2);
	write(exp_ap2, exp_newitems);  //exp_ap2 = exp_newitems;
	read(exp_newq, exp_v22);
	write(wsq_ptr, exp_v22);
	//wsq_ptr = exp_newq;
	read(exp_newq, exp_v23);
	returnval = exp_v23;		
}	


inline push(task)
{
	short task_addr, b, t, q, size, size2, sub, sub1, returnval, returnvalue, ap, arrayindex;
	short v0, v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13;
entry:
	atomic{
		alloca(I32, task_addr);
		alloca(I32, b);
		alloca(I32, t);
		alloca(Ptr, q);
	}
	write(task_addr,task);
	read(bottom, v0);
	write(b,v0);
	read(top, v1);
	write(t, v1);
	read(wsq_ptr, v2);
	write(q, v2);
	read(b, v3);
	read(t, v4);
	sub = v3 - v4;
	read(q, v5);
	getelementptr(item_t, v5, 0, size);
	read(size, v6);
	sub1 = v6 - 1;
	if
	::(v3-v4 >= v6-1) -> 	expand(returnval);//  return irgendwo deklarieren???
						write(q, returnval); 
	:: else -> skip;
	fi;
	
	read(task_addr, v7);
	read(b, v8);
	read(q, v9);
	getelementptr(item_t, v9, 0, size2);
	read(size2, v10);
	read(q, v11);
	getelementptr(item_t, v11, 1, ap);
	read(ap, v12); //ap is pointer
	getelementptr(v10, v12, v8 % v10, arrayindex);
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
		alloca(item_t, q);
		alloca(I32, t);
		alloca(I32, task);
	}
	read(bottom, v0);
	v0 = v0 - 1;
	write(b, v0);
	read(wsq_ptr, v1);
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
	getelementptr(item_t, v8, 0, size);
	read(size, v9);
	rem = v7 % v9;
	read(q, v10);
	getelementptr(item_t, v10, 1, ap);
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
		alloca(item_t, q);
		alloca(I32, task);
	}
	read(top, v0);
	write(t, v0);
	read(bottom, v1);
	write(b,v1);
	read(wsq_ptr, v2);
	
}		

proctype process1 (chan ch){
	push(333); 
}
/*
proctype process2 (chan ch){
	push(7); 
}
*/
init{
	short wsq;
	atomic{
		alloca(Ptr, wsq_ptr);
		memory[wsq_ptr] = memUse;
		alloca(item_t, wsq);
		alloca(I32, top);
		memory[top]=0;
		alloca(I32, bottom);
		memory[bottom]=0;
		memory[wsq] = 2; //size = 1
		memory[wsq+1] = 6; //ap Pointer points to memorypart of size "memory[wsq]"(= size of wsq) 
		memory[6]=0;
		memUse = memUse + memory[wsq] + 1;
		}
	atomic{
		run process1(channelT1);
		run bufferProcess(channelT1);
	//	run process2(channelT2);
		//run bufferProcess(channelT2	);
		//run process3(channelT3);
		//run bufferProcess(channelT3);
	}
	
}	

