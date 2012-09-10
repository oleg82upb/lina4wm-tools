/*
* author: Annika Mütze <muetze.annika@gmail.com>
* date: 09.2012
*
* Litmus-Test: Reordering of reads with older writes is allowed
* when the location differs
*/

#define ADRESSE_X 1
#define ADRESSE_Y 2
#include "buffer.pml"


/*Channel der die reads und writes verschickt (Type (also write,read); Adresse; Wert;... )*/
chan channelT1 = [0] of {mtype, short, short, short};
chan channelT2 = [0] of {mtype, short, short, short};
bit r1 = 0;
bit r2 = 0;

proctype process1()
{
	channelT1 ! write, ADRESSE_X, 1, NULL;
	atomic{
	channelT1 ! read, ADRESSE_Y, NULL, NULL;
	channelT1 ? read, ADRESSE_Y, r1, NULL;
	}
}

proctype process2()
{
	channelT2 ! write, ADRESSE_Y, 1, NULL;
	atomic{
	channelT2 ! read, ADRESSE_X, NULL, NULL;
	channelT2 ? read, ADRESSE_X, r2, NULL;
	}
	/*assert: allowed r1 = 0 and r2=  0
	*all possibilities are valid*/
	//atomic{ r1 == 1 -> assert (r2 == 0)};
	//atomic{ r1 == 1 -> assert (r2 == 1)};
	//atomic{ r1 == 0 -> assert (r2 == 1)};
	//atomic{ r1 == 0 -> assert (r2 == 0)};
}

init
{
	run process1();
	run bufferProcess(channelT1);
	run process2();
	run bufferProcess(channelT2)
}