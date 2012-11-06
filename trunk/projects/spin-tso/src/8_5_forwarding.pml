/*
* author: Annika Mütze <muetze.annika@gmail.com>
* date: 09.2012
*
* Litmus-Test: allows two processors to see the writes in diffrent orders. 
* Own write can be seen earlier than that of the other process.
*/

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
short r3 = 0;
short r4 = 0;

proctype process1(chan ch)
{
	write(ADRESSE_X, 1);
	read(ADRESSE_X, r1);
	read(ADRESSE_Y, r2);
	done:skip;
}

proctype process2(chan ch)
{
	write(ADRESSE_Y, 1);
	read(ADRESSE_Y, r3);
	read(ADRESSE_X, r4);
	done:skip;
}

init
{
	atomic{
	run process1(channelT1);
	run process2(channelT2);
	run bufferProcess(channelT1);
	run bufferProcess(channelT2)
	}
}
/*assert: allowed r2 = 0 and r4 = 0*/
//TODO: find a formula to check this 
//ltl check { [] (process1 @ done && process2 @ done ->( ! (r1 == 1 && r2 == 1)))}; 