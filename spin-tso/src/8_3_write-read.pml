/*
* author: Annika Mütze <muetze.annika@gmail.com>
* date: 09.2012
*
* Litmus-Test: Reordering of reads with older writes is allowed
* when the location differs
*/

#define ADRESSE_X 1
#define ADRESSE_Y 2
#define SIZE 4 			//size of Buffer
#define MAX_SIZE 4		//size of memory 
#include "x86_tso_buffer.pml"
//#include "sc-model.pml"

/*Channel der die reads und writes verschickt (Type (also write,read); Adresse; Wert;... )*/

short r1 = 0;
short r2 = 0;
chan channelT1 = [0] of {mtype, short, short, short};
chan channelT2 = [0] of {mtype, short, short, short};


proctype process1(chan ch)
{

	write(ADRESSE_X, 1);
	read(ADRESSE_Y, r1);
	done:skip;
}

proctype process2(chan ch)
{
	write(ADRESSE_Y, 1);
	read(ADRESSE_X, r2);

	/*assert: allowed r1 = 0 and r2=  0
	*all possibilities are valid*/
	//atomic{ r1 == 1 -> assert (r2 == 0)};
	//atomic{ r1 == 1 -> assert (r2 == 1)};
	//atomic{ r1 == 0 -> assert (r2 == 1)};
	//atomic{ r1 == 0 -> assert (r2 == 0)};
	done:skip;
}

init
{
atomic{
	run process1(channelT1);
	run process2(channelT2);
	run bufferProcess(channelT1);
	run bufferProcess(channelT2);
	}	
}

ltl check { [] ((process1 @ done && process2 @ done) -> (!(r1 == 0 && r2 == 0)))}; 