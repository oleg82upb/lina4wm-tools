/*
* author: Annika Mütze <muetze.annika@gmail.com>
* date: 09.2012
*
* Litmus-Test: allows two processors to see the writes in diffrent orders. 
* Own write can be seen earlier than that of the other process.
*/

#define ADRESSE_X 1
#define ADRESSE_Y 2
#include "buffer.pml"


/*Channel der die reads und writes verschickt (Type (also write,read); Adresse; Wert;... )*/
chan channelT1 = [0] of {mtype, short, short, short};
chan channelT2 = [0] of {mtype, short, short, short};
bit r1 = 0;
bit r2 = 0;
bit r3 = 0;
bit r4 = 0;

proctype process1()
{
	channelT1 ! write, ADRESSE_X, 1, NULL;
	atomic{
	channelT1 ! read, ADRESSE_X, NULL, NULL;
	channelT1 ? read, ADRESSE_X, r1, NULL;
	}
	atomic{
	channelT1 ! read, ADRESSE_Y, NULL, NULL;
	channelT1 ? read, ADRESSE_Y, r2, NULL;
	}
}

proctype process2()
{
	channelT2 ! write, ADRESSE_Y, 1, NULL;
	atomic{
	channelT2 ! read, ADRESSE_Y, NULL, NULL;
	channelT2 ? read, ADRESSE_Y, r3, NULL;
	}
	atomic{
	channelT2 ! read, ADRESSE_X, NULL, NULL;
	channelT2 ? read, ADRESSE_X, r4, NULL;
	}
	/*assert: allowed r2 = 0 and r4 = 0*/
}

init
{
	run process1();
	run bufferProcess(channelT1);
	run process2();
	run bufferProcess(channelT2)
}