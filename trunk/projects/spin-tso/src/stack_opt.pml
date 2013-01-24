#define BUFF_SIZE 6 	//size of Buffer
#define MEM_SIZE 40	//size of memory
 
//-----------------------------------------------------------------------------------------------------------------------------------------------
#include "x86_tso_buffer.pml"

//-----------------------------------------------------------------------------------------------------------------------------------------------


//abstract Stack implemented as array----------------------
#define ASSIZE 4
short asStack[ASSIZE];
hidden byte asTop = 0;

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

inline casLPPop(adr, oldValue, newValue, returnValue) 
{
	// 2 steps for the executing process, but atomic on memory
	bit success;
	ch ! iCas, adr, oldValue, newValue;
	atomic{
	ch ? iCas, adr, success, _; 
	returnValue = success;
	asPop(oldValue, success); //if successfull, then the popped value is the oldValue 
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
//-----------------------------------------------------------------------------------------------------------
inline push(this, v)

short 

entry: 
atomic{
	alloca(Ptr, thisAddr);
	alloca(I32, vAddr);
	alloca(Ptr, n);
	alloca(Ptr, ss);
	alloca(Node, v0); //new Node();	
}
	write(this_addr, this);
	write(v_addr, v);
	//146ff missing
	
	
//-----------------------------------------------------------------------------------------------------------
inline pop (returnvalue){

short this_addr, retval, ss, ssn, v0, v1, v2, v3, v4, v6, v7, v8, v9, v11, v13, v14, v16, v20, v21;

entry:
atomic{
	alloca(Stack, this_addr);
	alloca(Node, retval);
	alloca(Node, v0);
	alloca(Node, ss);
	alloca(Node, ssn);
	alloca(Node, lv);
}
	write(this_addr, this);
	
bb:
	read(this_addr, v1);
	getelementptr(Stack, v1, 0, v2);
	read(v2, v3);
	write(ss, v3);
	read(ss, v4);
	if
	:: v4 == 0 ->write(v0, NULL); goto bb6;
	::else -> goto bb2;
	fi;
	
bb2:
	read(ss, v6);
	getelementptr(Node, v6, 1,v7);
	read(v7, v8);
	write(ssn, v8);
	read(ssn, v9);
	read(ss, v11);
	read( this_addr, v13);
	getelementptr(Stack, v13, 0, v14);
	casLPPop (v14, v11, v9, v16);
	//108-114??????????????????????ß

bb5:
	read(ss, v20);
	write(v0, v20);

bb6:
	read(v0, v21);
	write(retval, v21);
	
retLabel:
	read(retval, returnvalue);

}
	
	
	
	
	