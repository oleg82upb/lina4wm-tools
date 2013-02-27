/*
author: Annika Mütze <muetze.annika@gmail.com>
date: 02.2013

abstract MSqueue implementation
*/

#define BUFF_SIZE 10 	//size of Buffer
#define MEM_SIZE 40	//size of memory
 
//-----------------------------------------------------------------------------------------------------------------------------------------------
#include "x86_tso_buffer.pml"

//-------------------------------------------------------------------------------------------------
//abstract Queue implemented as array----------------------
#define ASSIZE 4
short asQueue[ASSIZE];
hidden byte asHead = 0;
hidden byte asTail = -1;
hidden byte asIsEmpty = true; 


inline asEnqueue(asValue)
{
	
	atomic{
	assert(!(((asTail+1) % ASSIZE) == asHead && !asIsEmpty));	//make sure, Queue array is never full
	asTail = (asTail+1) % ASSIZE;								//move tail
	asQueue[asTail] = asValue;									//set new value in the queue
	asIsEmpty = false;											//Queue is no longer empty
	
	}
}

inline asDequeueFail()
{
	assert (asIsEmpty == true);
}

//asValue the value we expect to be at the place head is pointing to
inline asDequeue(asValue, asReturn)
{
	atomic
	{
		//assert(Queue not empty)
		assert (asQueue[asHead] == memory[asValue]);  	//asValue must be the element head is poniting to
		asQueue[asHead] = 0;							//remove element from queue
		head = (head+1) % ASSIZE;						//move at to the next in line
		if
		:: head == (tail+1) % ASSIZE -> asIsEmpty = true;	//mark queue as empty if last element is dequeued
		:: else -> skip
		fi;
	}
}


inline casLPEnqueue(adr, oldValue, newValue, returnValue, controlValue) 
{
	// 2 steps for the executing process, but atomic on memory
	bit success;
	ch ! iCas, adr, oldValue, newValue;
	atomic{
	ch ? iCas, adr, success, _; 
	returnValue = success;
	if 	:: success -> asEnqueue(controlValue);
		:: else -> skip;
	fi
	}
}


inline casLPDequeue(adr, oldValue, newValue, returnValue) 
{
	// 2 steps for the executing process, but atomic on memory
	bit success;
	ch ! iCas, adr, oldValue, newValue;
	atomic{
	ch ? iCas, adr, success, _; 
	returnValue = success;
	if 
		:: success -> asDequeue(oldValue, success); //if successfull, then the popped value is the oldValue
		:: else -> skip;
	fi
	 
	}
}


//------------------------------------------------------------------------------------------------------
//Types for LLVM, actually their length in size of pointers and values
#define Queue  1 	//= {0,1}; (head and tail)
#define Node  1	//= {0,1};
#define I32  0 		// = {0};
#define Ptr  0
#define I1	0		//or better a boolean variable?
short memUse = 1; 	//shows to the next free cell in memory
byte this; 		//Queue instance pointer


chan channelT1 = [0] of {mtype, short, short, short};
chan channelT2 = [0] of {mtype, short, short, short};

inline getelementptr(type, instance, offset, targetRegister)
{
	atomic{
	//simplified version of what llvm does.
	//we don't need the type as long as we assume our memory to hold only values/pointers etc of equal length. 
	//In this case, the offset directly correspond to adding it to instance address. 
	assert(offset <= type); //offset shouldn't be greater than the type range
	targetRegister = instance + offset;
	}
}

inline alloca(type, targetRegister)
{
	atomic{
	//need c_Code here, but for now we could use this to statically define used addresses
	targetRegister = memUse;
	memUse = memUse + type + 1;
	assert(memUse < MEM_SIZE);
	}
}


inline enqueue (this, value){

short this_addr, value_addr, this1, node, head, tail, localTail, next, next2, next3, next7, val, tail4, tail9, tail12;
short v0, v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v12, v14, v16, v22, v24, v26, v29, v31, v33;

entry:
	atomic{
		alloca(Ptr, this_addr);	
		alloca(Ptr, value_addr);
		alloca(Ptr, node);
		alloca(Ptr, localTail);
		alloca(Ptr, next);
		alloca(Node, v0);		//new node
		}
		//???    %exn.slot = alloca i8*
 		//???    %ehselector.slot = alloca i32
		write(this_addr, this);
		write(value_addr, value);
		read(this_addr, this1);
	
invoke_cont:
	write(node, v0);
	read(value_addr, v1);
	read(node, v2);
	getelementptr(Node, v2, 0, val);
	write(val, v1);
	read(node, v3);
	getelementptr(Node, v3, 1, next2);
	write(next2, NULL);
	
doBody:
	getelementptr(Queue, this1, 1, tail);
	read(tail, v4);
	write(localTail, v4);
	read(localTail, v5);
	getelementptr(Node, v5, 1, next3);
	read(next3, v6);
	write(next, v6);
	read(localTail,v7);
	getelementptr(Queue, this1, 1, tail4);
	read(tail4, v8);
	
	if
	:: v7 == v8 -> goto if_then
	:: else -> goto doBody
	fi;

if_then:
	read(next, v9);
	if 
	:: v9 == NULL -> goto if_then6
	:: else -> goto if_else			
	fi;
	
if_then6:
	read(localTail, v10);
	getelementptr(Node, v10, 1, next7);
	read(next, v12);
	read(node, v14);
	cas(next7, v12, v14, v16); 
	if
	:: v16 == false -> goto doBody
	:: else -> goto do_end					
	fi;
	//lpad ???????????????????????????????????????????????
if_else:
	getelementptr(Queue, this1, 1, tail9);
	read(localTail, v22);
	read(next, v24);
	casLPEnqueue(tail9, v22, v24, v26, value);
	if
	:: v26 == false -> goto doBody;
	:: else -> skip;
	fi;
	
do_end:
	getelementptr(Queue, this1, 1, tail12);
	read(localTail, v29);
	read(node, v31);
	casLPEnqueue(tail12, v29, v31, v33, value);
	if
	:: v33 == false -> goto doBody; // skip;//goto doBody; //why do I need this/ what do I do with this???
	:: else-> skip;
	fi;
	
		
	
}

//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
inline dequeue (returnval, valueA){		// why do we need a value for dequeuing???

short retval, this_addr, this_value, localHead, localTail, this1, value_addr, val, next, next2, head, head3, head9, tail, tail8;
short v0, v1, v2, v3, v4, v5, v6, v7, v8, v10, v12, v14, v16, v17, v18, v20, v22, v24;

entry: 
	atomic{
		alloca(Ptr, retval);		
		alloca(Ptr, this_addr);
		alloca(Ptr, this_value);
		alloca(Ptr, localHead);
		alloca(Ptr, localTail);
		alloca(Ptr, next);
		}
		write(this_addr, this);
		write(value_addr, valueA);
		read(this_addr, this1);
		
	->
doBody:
	getelementptr(Queue, this1, 0, head);
	read(head, v0);
	write(localHead, v0);
	getelementptr(Queue, this1, 1, tail);
	read(tail, v1);
	write(localTail, v1);
	read(localHead, v2);
	getelementptr(Node, v2, 1, next2);
	read(next2, v3);
	write(next, v3);
	read(localHead, v4);
	getelementptr(Queue, this1, 0, head3);
	read(head3, v5);
	
	if
	:: v4 == v5 -> goto if_then
	:: else -> goto doBody
	fi;

if_then:
	read(localHead, v6);
	read(localTail, v7);
	if
	:: v6 == v7 -> goto if_then5
	:: else -> goto if_else
	fi;
	
if_then5:
	read(next, v8);
	if
	:: v8 == NULL -> goto if_then7
	:: else -> goto if_end
	fi;
	
if_then7:
	write(retval, false);
	goto end_return;
	
if_end:
	getelementptr(Queue, this1, 1, tail8);
	read(localTail, v10);
	read(next, v12);
	casLPDequeue(tail8, v10, v12, v14);
	if
	:: v14 == false-> goto doBody
	:: else -> 	write(retval, true);
				goto end_return;
	fi;
	
if_else:
	read(next, v16);
	getelementptr(Node, v16, 0, val);
	read(val, v17);
	read(value_addr, v18);
	write(v18, v17);
	getelementptr(Queue, this1, 0, head9);
	read(localHead, v20);
	read(next, v22);
	casLPDequeue(head9, v20, v22, v24);
	if
	:: v24 == false -> goto doBody
	:: else -> 	write(retval, true);
				goto end_return;
	fi;
	

end_return:
	read(retval, returnval);
			
}
//---------------------------------------------------------------------------------------------------------------------------------------
proctype process1(chan ch){
	short returnval;
	short v = 555;
	enqueue(this, v);
	dequeue(returnval, v);
}

proctype process2(chan ch){
//	short returnval2;
//	enqueue(this, 666);
//	dequeue(returnval2);
	skip;
}

init{
atomic{
	alloca(Queue, this)
	run process1(channelT1);
	run bufferProcess(channelT1);
	run process2(channelT2);
	run bufferProcess(channelT2);
	}
}

	