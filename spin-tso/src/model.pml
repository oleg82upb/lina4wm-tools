

#define ADRESSE_X 1
#define ADRESSE_Y 2
#include "buffer.pml"


/*Channel der die reads und writes verschickt (Type (also write,read); Adresse; Wert;... )*/
chan channelT1 = [0] of {mtype, int, int, int};
chan channelT2 = [0] of {mtype, int, int, int};

proctype process1()
{
	channelT1 ! write,ADRESSE_X,1,NULL;
	channelT1 ! write,ADRESSE_Y,1,NULL;
	
}

proctype process2()
{
	int r1 = 0;
	int r2 = 0;
	
	channelT2 ! read, ADRESSE_Y,NULL,NULL;
	
	/* wird nur ausgeführt wenn auch die Adresse von x ist*/
	channelT2 ? read, ADRESSE_Y, r1, _;
	
	channelT2 ! read, ADRESSE_X, NULL, NULL;
	channelT2 ? read, ADRESSE_X,r2, _;
	/*assert: not allowed r1=1 and r2=0*/
	assert( !(r1 == 1 && r2 == 0))
}

init
{
	run process1();
	run bufferProcess(channelT1);
	run process2();
	run bufferProcess(channelT2)
}
