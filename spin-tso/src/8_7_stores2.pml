/*
author: Annika Mütze <muetze.annika@gmail.com>
date: 10.2012

Litmus-Test: Stores Are Seen in a Consistent Order by Other Processors
 */

#define ADRESSE_X 1
#define ADRESSE_Y 2
#include "buffer.pml"


/*Channel der die reads und writes verschickt (Type (also write,read); Adresse; Wert;... )*/
chan channelT1 = [0] of {mtype, short, short, short};
chan channelT2 = [0] of {mtype, short, short, short};
chan channelT3 = [0] of {mtype, short, short, short};
chan channelT4 = [0] of {mtype, short, short, short};

bit r1 = 0;
bit r2 = 0;
bit r3 = 0;
bit r4 = 0;

active proctype process1()
{
	channelT1 ! write, ADRESSE_X, 1, NULL;	
}

active proctype process2()
{
	channelT2 ! write, ADRESSE_Y, 1, NULL;
}

active proctype process3()
{
	atomic{
	channelT3 ! read, ADRESSE_X, NULL, NULL;
	channelT3 ? read, ADRESSE_X, r1, _;
	}
	atomic{
	channelT3 ! read, ADRESSE_Y, NULL, NULL;
	channelT3 ? read, ADRESSE_Y, r2, _; 
	}
}
active proctype process4()
{
	atomic{
	channelT4 ! read, ADRESSE_Y, NULL, NULL;
	channelT4 ? read, ADRESSE_Y, r3, _;
	}
	atomic{
	channelT4 ! read, ADRESSE_X, NULL, NULL;
	channelT4 ? read, ADRESSE_X, r4, _;
	}
/*	atomic{ r1 == 1 -> assert(r4 == 1)};
	atomic{ r2 == 1 -> assert(r3 == 1)};
	atomic{ r1 == 0 -> assert(r4 == 0)};
	atomic{ r2 == 0 -> assert(r3 == 0)}; 
*/
}

init {
	atomic{
	run bufferProcess(channelT1);
	run bufferProcess(channelT2);
	run bufferProcess(channelT3);
	run bufferProcess(channelT4)
	}
}
