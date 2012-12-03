/*
* author: Annika Mütze <muetze.annika@gmail.com>
* date: 09.2012
*
* Litmus-Test: Shows that there is no reordering of reads
* with older writes to the same location.
*/

#define ADRESSE_X 1
#define BUFF_SIZE 5 	//size of Buffer
#define MEM_SIZE 5		//size of memory 
#include "x86_tso_buffer.pml"


/*Channel der die reads und writes verschickt (Type (also write,read); Adresse; Wert;... )*/
chan channelT1 = [0] of {mtype, short, short, short};
short r1 = 0;

proctype process1(chan ch){
	write(ADRESSE_X, 1);
	read(ADRESSE_X, r1);
	/* not allowed to reorder with earlier write to same location*/ 
	//assert (r1 == 1);
	done: skip;
}

init{
	run process1(channelT1);
	run bufferProcess(channelT1);
}

//no reordering of reads with older write to same location
ltl check_0 { [] (process1 @ done -> !(r1 == 0 ))}; 
