/*
* author: Annika Mütze <muetze.annika@gmail.com>
* date: 09.2012
*
* Litmus-Test: Shows that there is no reordering of reads
* with older writes to the same location.
*/

#define ADRESSE_X 1
#define SIZE 5 			//size of Buffer
#define MAX_SIZE 5		//size of memory 
#include "x86_tso_buffer.pml"


/*Channel der die reads und writes verschickt (Type (also write,read); Adresse; Wert;... )*/
chan channelT1 = [0] of {mtype, short, short, short};
bit r1 = 0;

active proctype process1(){
	channelT1 ! iWrite, ADRESSE_X, 1, NULL;
	atomic{
	channelT1 ! iRead, ADRESSE_X, NULL, NULL;
	channelT1 ? iRead, ADRESSE_X, r1, NULL;
	}
	/* not allowed to reorder with earlier write to same location*/ 
	assert (r1 == 1);
	//assert (r1 == 0);
}

init{
	run bufferProcess(channelT1);
}