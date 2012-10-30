/*
author: Annika Mütze <muetze.annika@gmail.com>
date: 09.2012

Litmus-Test: No reordering of writes 
when a read to the same location procedes*/

#define ADRESSE_X 1
#define ADRESSE_Y 2
#define SIZE 5 			//size of Buffer
#define MAX_SIZE 5		//size of memory 
#include "x86_tso_buffer.pml"


/*Channel der die reads und writes verschickt (Type (also write,read); Adresse; Wert;... )*/
chan channelT1 = [0] of {mtype, short, short, short};
chan channelT2 = [0] of {mtype, short, short, short};
short r1 = 0;
short r2 = 0;

active proctype process1()
{
	atomic{
	channelT1 ! iRead,ADRESSE_X,NULL,NULL;
	channelT1 ? iRead, ADRESSE_X, r1, _;
	}
	channelT1 ! iWrite,ADRESSE_Y,1,NULL;
	end: skip;
}

active proctype process2()
{
	atomic{
	channelT2 ! iRead, ADRESSE_Y,NULL,NULL;
	channelT2 ? iRead, ADRESSE_Y, r2, _;
	}
	channelT2 ! iWrite, ADRESSE_X, 1, NULL;	
	end: skip;
}

init
{
	atomic{
	run bufferProcess(channelT1);
	run bufferProcess(channelT2)
	}
}
	// r1 == 1  (r2 == 1)	-> not allowed r1=1 and r2=1*/
	// r1 == 1  (r2 == 0)	-> ok
	// r1 == 0  (r2 == 1)	-> ok
	// r1 == 0  (r2 == 0)	-> ok
ltl check { [] (process1 @ end && process2 @ end ->( ! (r1 == 1 && r2 == 1)))}; 