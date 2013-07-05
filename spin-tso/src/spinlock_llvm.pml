/*
*author: Annika Mütze <muetze.annika@gmail.com>
*date: 06.2013
*subject: spinlock implementation: specification of the LLVM-compiled spinlock implementation (spinlock.s)
*/

#define BUFF_SIZE 5 	//size of Buffer
#define MEM_SIZE 10	//size of memory
 
//-----------------------------------------------------------------------------------------------------------------------------------------------
#include "x86_tso_buffer.pml"

//-----------------------------------------------------------------------------------------------------------------------------------------------
//Deklaration of Pointertypes, channels and usefull functions
//Types for LLVM, actually their length in size of pointers and values
#define I32  0 		// = {0};
#define Ptr  0
short memUse = 2; 	//shows to the next free cell in memory, initialized to 2 because PtrX is set to 1

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
//-----------------------------------------------------------------------------------------------------------------------------
				//specific inlines

#define ptrX 1		//global Ptr

inline aquire(){
short v0, v2;

whileBody:

	cas(ptrX,1,0,v0); //cas(adr, oldValue, newValue, returnValue) 
	if
	::(v0 == 1) -> goto End;
	:: else -> goto whileCond1;
	fi;

whileCond1:
	read(ptrX, v2);
	if
	:: v2 == 0 -> goto whileCond1;
	:: else -> goto whileBody;
	fi;
	
End:
	skip;
}

inline release(){

	write(ptrX,1);
}

inline tryaquire(returnvalue){
short retval, v0, v2;

entry:
	alloca(I32, retval);
	cas(ptrX,1,0,v0);
	if
	:: v0 == 1 	-> 	write(retval, 1); goto End;
	:: else 	-> 	write(retval, 0); goto End;
	fi;

End:
	read(retval, returnvalue);
	

/*Alternative: 
inline tryaquire(returnvalue){
short v0, v2;

entry:
	CAS(ptrX,1,0,v0);
	if
	:: v0 == 1 	-> 	write(returnvalue, 1);
	:: else 	-> 	write(returnvalue, 0);
	fi;
*/

}
proctype process1 (chan ch){
	aquire();
critical_sec: printf("crit\n");	//do something...
	release();
	//skip;
}

proctype process2 (chan ch){
	short returnvalue;
	tryaquire(returnvalue);
	if
	:: returnvalue -> critical_sec: printf("crit\n");release();
	::else ->skip
	fi;
}

init{
	memory[1] = 1;
atomic{
	run process1(channelT1);
	run bufferProcess(channelT1);
	run process2(channelT2);
	run bufferProcess(channelT2);
	}
}

ltl neverBothInCrit{ [] !(process1 @ critical_sec && process2 @critical_sec)};

//ac vorher 0 hinter id
//try _> vorher 0 wenn fkt , assert (vorher != 0)
//release (vorher eigenen Id hinterher 0) 
	