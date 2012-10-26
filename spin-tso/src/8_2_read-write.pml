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
bit r1 = 0;
bit r2 = 0;

active proctype process1()
{
	atomic{
	channelT1 ! iRead,ADRESSE_X,NULL,NULL;
	channelT1 ? iRead, ADRESSE_X, r1, _;
	}
	channelT1 ! iWrite,ADRESSE_Y,1,NULL;
	
}

active proctype process2()
{
	atomic{
	channelT2 ! iRead, ADRESSE_Y,NULL,NULL;
	channelT2 ? iRead, ADRESSE_Y, r2, _;
	}
	channelT2 ! iWrite, ADRESSE_X, NULL, NULL;
	
	/*assert: not allowed r1=1 and r2=1*/
	//atomic{ r1 == 1 -> assert (r2 == 0)};
	//atomic{ r1 == 1 -> assert (r2 == 1)};
	//atomic{ r1 == 0 -> assert (r2 == 1)};
	//atomic{ r1 == 0 -> assert (r2 == 0)};
}

init
{
	atomic{
	run bufferProcess(channelT1);
	run bufferProcess(channelT2)
	}
}
