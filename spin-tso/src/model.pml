/*
author: Annika Mütze <muetze.annika@gmail.com>
date: 09.2012

Litmus-Test
*/

#define ADRESSE_X 1
#define ADRESSE_Y 2
#include "buffer.pml"


/*Channel der die reads und writes verschickt (Type (also write,read); Adresse; Wert;... )*/
chan channelT1 = [0] of {mtype, short, short, short};
chan channelT2 = [0] of {mtype, short, short, short};

proctype process1()
{
	channelT1 ! write,ADRESSE_X,1,NULL;
	channelT1 ! write,ADRESSE_Y,1,NULL;
	
}

proctype process2()
{
	short r1 = 0;
	short r2 = 0;
	
	atomic{
	channelT2 ! read, ADRESSE_Y,NULL,NULL;
	channelT2 ? read, ADRESSE_Y, r1, _;
	}

	
	atomic{
	channelT2 ! read, ADRESSE_X, NULL, NULL;
	channelT2 ? read, ADRESSE_X,r2, _;
	}
	/*assert: not allowed r1=1 and r2=0*/
	atomic {r1 == 1 -> assert( (r2 == 1))}
	//atomic {r1 == 1 -> assert( (r2 == 0))}
	//atomic {r1 == 0 -> assert( (r2 == 1))}
	//atomic {r1 == 0 -> assert( (r2 == 0))}

}

init
{
	run process1();
	run bufferProcess(channelT1);
	run process2();
	run bufferProcess(channelT2)
}
