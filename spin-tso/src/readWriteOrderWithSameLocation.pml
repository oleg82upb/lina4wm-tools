#define ADRESSE_X 1
#include "buffer.pml"


/*Channel der die reads und writes verschickt (Type (also write,read); Adresse; Wert;... )*/
chan channelT1 = [0] of {mtype, short, short, short};
bit r1 = 0;

proctype process1(){

	channelT1 ! write, ADRESSE_X, 1, NULL;
	atomic{
	channelT1 ! read, ADRESSE_X, NULL, NULL;
	channelT1 ? read, ADRESSE_X, r1, NULL;
	}
	/* not allowed to reorder with earlier write to same location*/ 
	assert (r1 == 1);
	//assert (r1 == 0);
}

init{
	run process1();
	run bufferProcess(channelT1);
} 