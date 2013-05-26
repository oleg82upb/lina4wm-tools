
/*
author: Annika Mütze <muetze.annika@gmail.com>
date: 05.2013

Burns Mutex SepOps implementation
*/

#define BUFF_SIZE 4 	//size of Buffer
#define MEM_SIZE 5	//size of memory
 
//-----------------------------------------------------------------------------------------------------------------------------------------------
#include "x86_tso_buffer.pml"

//-----------------------------------------------------------------------------------------------------------------------------------------------
		//declaration of the variables

chan channelT1 = [0] of {mtype, short, short, short};
chan channelT2 = [0] of {mtype, short, short, short};

bool f0,f1				// global f0, f1


inline p1_aq()
{
	bool v0;
entry: 
	write(f0,1);

whileCond:
	read(f1, v0);
	if
	:: v0 != 0 -> goto whileCond;
	::else -> skip;
	fi;	
}

inline p1_rel()
{
	write(f0, 0);
}

inline p2_aq()
{
	bool v0, v1;
retry:
	read(f0, v0);
	if
	:: (v0 != 0) -> goto retry;
	:: else -> goto whileEnd;
	fi;

whileEnd:
	write(f1, 1);
	read(f0, v1);
	if
	:: v1 != 0 -> write(f1, 0);
				 goto retry;
	::else -> skip;
	fi;
	
}

inline p2_rel()
{
	write(f1,0);
}
//----------------------------------------------------------------------

proctype process1(chan ch){
	p1_aq();
	printf("P1 in critical section\n");
	p1_rel();
}

proctype process2(chan ch){
	p2_aq();
	printf("P2 in critical section\n");
	p2_rel();
}


init 
{
atomic{
	run process1(channelT1);
	run bufferProcess(channelT1);
	run process2(channelT2);
	run bufferProcess(channelT2);
	}
}