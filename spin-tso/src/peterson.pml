#define SIZE 5 			//size of Buffer
#define MAX_SIZE 5		//size of memory 
#include "buffer.pml"

/*Channel der die reads und writes verschickt (Type (also write,read); Adresse; Wert;... )*/
chan bufferChannel1 = [0] of {mtype, short, short, short};
chan bufferChannel2 = [0] of {mtype, short, short, short};
byte ncrit;
short turn = 2;


inline writeI(address, value)
{
	atomic{ 
	b ! write, address, value, NULL;
	}
}

inline readI(a, into)
{
	atomic{
	short r1;
	b ! read( a, NULL, NULL);
	b ? read, a, r1, _ ;
	into = r1;
	}
}


atomic proctype peterson1(chan b)
{	
	short r5, r6;
	bit myFlag = 0; 
	bit hisFlag = 1;
    bit myPid = 0;
again2:
        writeI(myFlag, 1);
        writeI(turn, myPid);

	do			
	:: readI(hisFlag, r5);
		if
		:: (r5 == 0) -> break
		:: else
		fi;
	:: readI(turn, r6);
		if
		:: (r6 == 1) -> break
		:: else
		fi
	od;

        ncrit++;
        assert(ncrit == 1);    	 
        ncrit--;

	writeI(myFlag, 0);		
        goto again2 
}

atomic proctype peterson2(chan b){	
	short r5, r6;
	bit myFlag = 1; 
	bit hisFlag = 0;
	bit myPid = 1;
	

again1: writeI(myFlag, 1);
        writeI(turn, myPid);

	do			
	:: readI(hisFlag, r5);
		if
		:: (r5 == 0) -> break
		:: else
		fi;
	:: readI(turn, r6);
		if
		:: (r6 == 0) -> break
		:: else
		fi
	od;

        ncrit++;
        assert(ncrit == 1);    	 
        ncrit--;

	writeI(myFlag, 0);		
        goto again1 
}

init
{
	
	run bufferProcess(bufferChannel2);
	run bufferProcess(bufferChannel1);
	
}