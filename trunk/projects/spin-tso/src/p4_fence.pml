/*
* author: Annika Mütze <muetze.annika@gmail.com>
* date: 11.2012
*
*Lithmustest: Fence instruction
* 
*/

#define ADRESSE_X 1
#define ADRESSE_Y 2
#define BUFF_SIZE 5 	//size of Buffer
#define MEM_SIZE 5		//size of memory 
#include "x86_tso_buffer.pml"


/*Channel der die reads und writes verschickt (Type (also write,read); Adresse; Wert;... )*/
chan channelT1 = [0] of {mtype, short, short, short};
chan channelT2 = [0] of {mtype, short, short, short};
short r1 = 0;
short r2 = 0;

proctype process1(chan ch){
	
	write(ADRESSE_X, 1);
	mfence();
	read(ADRESSE_Y, r1);
	done : skip;
}
proctype process2(chan ch){
	
	write(ADRESSE_Y, 1);
	mfence();
	read(ADRESSE_X, r2);
	done : skip;
}

init{
	atomic{
		run process1(channelT1);
		run process2(channelT2);	
		run bufferProcess(channelT1);
		run bufferProcess(channelT2);
		}
}

ltl check { [] ((process1 @ done && process2 @ done) ->  !(r1 == 0 && r2 == 0))};
