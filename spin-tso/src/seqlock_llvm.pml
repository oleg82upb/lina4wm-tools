/*
author: Annika Mütze <muetze.annika@gmail.com>
date: 06.2013

seqlock implementation

*/

/*
	trying to specify the LLVM-compiled seqlock implementation (seqlock.s)
*/

#define BUFF_SIZE 5 	//size of Buffer
#define MEM_SIZE 10	//size of memory
 
//-----------------------------------------------------------------------------------------------------------------------------------------------
#include "x86_tso_buffer.pml"

//-----------------------------------------------------------------------------------------------------------------------------------------------
//Types for LLVM, actually their length in size of pointers and values
#define I32  0 		// = {0};
#define Ptr  0
short memUse = 1; 	//shows to the next free cell in memory
byte this; 		// instance pointer


chan channelT1 = [0] of {mtype, short, short, short};
chan channelT2 = [0] of {mtype, short, short, short};
chan channelT3 = [0] of {mtype, short, short, short};

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
	//need c_Code here, but for now we could use this to statically define used addresses
	targetRegister = memUse;
	memUse = memUse + type + 1;
	assert(memUse < MEM_SIZE);
	}
}
//--------------------------------------------------------------------------------------------------------------
int x1,x2,c;

inline swrite(word1, word2){

int word1_addr, word2_addr, v0, v1, v2,v3;
entry:
	alloca(I32, word1_addr);
	alloca(I32, word2_addr);
	write(word1_addr, word1);
	write(word2_addr, word2);
	//???read(c,v0);
	//? write(c,v0+1);
	read(word1_addr, v1);
	//? write(x1,v1);
	read(word2_addr, v2);
	//? write(x2,v2);
	//? read(c,v3);
	//? write(c, v3+1);
}



inline sread(word){
int word_addr, c0, v0, v1, v2, v3, v4, v5, v6, v7, rem, arrayidx, arrayidx2;
entry:
	alloca(I32, word_addr);
	alloca(I32, c0);
	write(word_addr, word);
	write(c0,0);
	->
	
doBody1:
	read(c,v0);
	write(c0,0);
	->
	
doCond:
	read(c0,v1);	
	rem = v1 % 2;	//test if its divisible without remainder(engl."Rest") to  check whether c has changed
	if 
	::(rem != 0) -> goto doBody1
	:: else -> goto doEnd
	fi;

doEnd:
	read(x1,v2);
	read(word_addr, v3);
	getelementptr(I32, v3, 0, arrayidx);
	write(arrayidx, v2);
	read(x2,v4);
	read(word_addr,v5);
	getelementptr(I32, v5, 1, arrayidx2);
	write(arrayidx2, v4);
	->
	
doCond3:
	read(c, v6);
	read(c0, v7);
	if
	:: (v6 != v7) -> goto doBody
	:: else -> skip
	fi;	
}

proctype process1 (chan ch){
	swrite(3,5);
}

proctype process2(chan ch){
	int array[2];
	sread(array);
}


init{
	//initalization of array?
	//initalization of global variables?
	x1 = 0;
	x2 = 0;
	c = 0;
	atomic{
		run process1(channelT1);
		run bufferProcess(channelT1);
		run process2(channelT2);
		run bufferProcess(channelT1);
	}
}		
