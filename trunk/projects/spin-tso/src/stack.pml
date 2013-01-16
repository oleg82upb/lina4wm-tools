/*
	trying to specify the LLVM-compiled Treiber Stack implementation  
*/

#define BUFF_SIZE 4 	//size of Buffer
#define MEM_SIZE 40	//size of memory
 
//-----------------------------------------------------------------------------------------------------------------------------------------------
#include "x86_tso_buffer.pml"

//-----------------------------------------------------------------------------------------------------------------------------------------------

//abstract Stack implemented as array----------------------
#define ASSIZE 4
short asStack[ASSIZE];
short asTop = 0;

//asValue the value we expect to be on top of the stack
inline asPop(asValue, asReturn)
{
	atomic{
	if
		:: asTop == 0 -> assert(asReturn == false); //stack must be empty
		:: else -> { assert (asStack[asTop] == asValue);  	//asValue must be top element
					 assert (asReturn == true);				//operation must have been successful
					 asStack[asTop] = 0;					//remove element from stack
					 asTop--;								//decrement top
					}
	fi	
	}
}

inline asPush(asValue)
{
	atomic{
	assert(asTop < ASSIZE); //make sure, stack array is never full
	asStack[asTop] = asValue;
	asTop++;
	}
	//should we return something?
}

inline casLPPop(adr, oldValue, newValue, returnValue, controlValue) 
{
	// 2 steps for the executing process, but atomic on memory
	bit success;
	ch ! iCas, adr, oldValue, newValue;
	atomic{
	ch ? iCas, adr, success, _; 
	returnValue = success;
	asPop(controlValue, success);
	}
}
inline casLPPush(adr, oldValue, newValue, returnValue, controlValue) 
{
	// 2 steps for the executing process, but atomic on memory
	bit success;
	ch ! iCas, adr, oldValue, newValue;
	atomic{
	ch ? iCas, adr, success, _; 
	returnValue = success;
	if 	:: success -> asPush(controlValue);
		:: else -> skip;
	fi
	}
}


//Types for LLVM, actually their length in size of pointers and values
#define Stack  0 	//= {0};
#define Node  1	//= {0,1};
#define I32  0 		// = {0};
#define Ptr  0
short memUse = 1; 	//shows to the next free cell in memory
byte this; 		//Stack instance pointer

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






inline push(this, v)
{
short thisAddr, vAddr, n, ss, v0, v1, v2, v3, v4, v5, v7, v9, v11, this1, val, head, head2, next;

entry: 
atomic{	
	//interleaving of memory allocation is unimportant in our case
	//but if done non-atomically, it blows up our state space by a factor of approximately 60!
	alloca(Ptr, thisAddr);
	alloca(I32, vAddr);
	alloca(Ptr, n);
	alloca(Ptr, ss);
	alloca(Node, v0); //new Node();		*
	}
	write(thisAddr, this);
	write(vAddr, v);
	read(thisAddr, this1);
	//* new Node() originally was here
	
invokeCont: 
	write(n, v0);
	read(vAddr, v1);
	read(n, v2);
	getelementptr(Node, v2, 0, val);
	write(val, v1);
		 
doBody: 
	getelementptr(Stack, this, 0, head);
	mfence();
	read(head, v3);		// volatile! use mfence() here?;
	write(ss, v3);
	read(ss, v4);
	read(n, v5);
	getelementptr(Node, v5, 1, next); //FIXME: v5 holds value and is no longer the pointer. 
	write(next, v4);

doCond:
	getelementptr(Stack, this1, 0, head2);
	//bitcast head2 to i32 for cas. we don't need this. its local anyway
	read(ss, v7);
	//ptrtoint ...
	read(n, v9);
	atomic{
	casLPPush(head2, v7, v9, v11, v);
	
	}
	if 
		:: v11 == false -> goto doBody;
		:: else -> skip;;
	fi
//doEnd: 
//	skip; //done

}

proctype process1(chan ch){
	push(this, 666);
	push(this, 333);
}

proctype process2(chan ch){
	push(this, 555);
	push(this, 111);
}

init{
atomic{
	alloca(Stack, this)
	run process1(channelT1);
	run bufferProcess(channelT1);
	run process2(channelT2);
	run bufferProcess(channelT2);
	}
}
