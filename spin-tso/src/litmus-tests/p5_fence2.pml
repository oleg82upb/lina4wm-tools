/*
* author: Annika Mütze <muetze.annika@gmail.com>
* date: 11.2012
*
*Lithmustest: Fence instruction with two read instruction
* 
*/

#define ADRESSE_X 1
#define ADRESSE_Y 2
#define BUFF_SIZE 5 	//size of Buffer
#define MEM_SIZE 5		//size of memory 

#define PROC_NUMBER 2
#include "../x86_tso_buffer.pml"

/*Channel der die reads und writes verschickt (Type (also write,read); Adresse; Wert;... )*/
chan channelT1 = [0] of {mtype, short, short, short};
chan channelT2 = [0] of {mtype, short, short, short};
short r1 = 0;
short r2 = 0;
short r3 = 0;
short r4 = 0;

proctype process1(chan ch){
	
	write(ADRESSE_X, 1);
	mfence();
	read(ADRESSE_X, r1)
	read(ADRESSE_Y, r2);
	done : skip;
}
proctype process2(chan ch){
	
	write(ADRESSE_Y, 1);
	mfence();
	read(ADRESSE_Y, r3);
	read(ADRESSE_X, r4);
	done : skip;
}

init{
	atomic{
		run process1(channelT1);
		run bufferProcess(channelT1);
		run process2(channelT2);	
		run bufferProcess(channelT2);
		}
}
/*not allowed r2 = 0, r4 = 0;*/
ltl check_0 { [] ((process1 @ done && process2 @ done) ->( ! (r1 == 1 && r2 == 0 && r3 == 1 && r4 == 0)))}; //no
	
ltl check_1 { [] ((process1 @ done && process2 @ done) ->( ! (r1 == 1 && r2 == 0 && r3 == 0 && r4 == 0)))}; //no
ltl check_2 { [] ((process1 @ done && process2 @ done) ->( ! (r1 == 1 && r2 == 0 && r3 == 0 && r4 == 1)))}; //no

ltl check_3 { [] ((process1 @ done && process2 @ done) ->( ! (r1 == 1 && r2 == 1 && r3 == 0 && r4 == 0)))};//no
ltl check_4 { [] ((process1 @ done && process2 @ done) ->( ! (r1 == 1 && r2 == 0 && r3 == 1 && r4 == 1)))};//yes
ltl check_5 { [] ((process1 @ done && process2 @ done) ->( ! (r1 == 1 && r2 == 1 && r3 == 1 && r4 == 0)))};//yes
ltl check_6 { [] ((process1 @ done && process2 @ done) ->( ! (r1 == 1 && r2 == 1 && r3 == 0 && r4 == 1)))};//no
ltl check_7 { [] ((process1 @ done && process2 @ done) ->( ! (r1 == 1 && r2 == 1 && r3 == 1 && r4 == 1)))};//yes
ltl check_8 { [] ((process1 @ done && process2 @ done) ->( ! (r1 == 0 && r2 == 0 && r3 == 0 && r4 == 0)))};//no
ltl check_9 { [] ((process1 @ done && process2 @ done) ->( ! (r1 == 0 && r2 == 0 && r3 == 0 && r4 == 1)))};//no
ltl check_10 { [] ((process1 @ done && process2 @ done) ->( ! (r1 == 0 && r2 == 0 && r3 == 1 && r4 == 0)))};//no
ltl check_11 { [] ((process1 @ done && process2 @ done) ->( ! (r1 == 0 && r2 == 1 && r3 == 0 && r4 == 0)))};//no
ltl check_12 { [] ((process1 @ done && process2 @ done) ->( ! (r1 == 0 && r2 == 0 && r3 == 1 && r4 == 1)))};//no
ltl check_13 { [] ((process1 @ done && process2 @ done) ->( ! (r1 == 0 && r2 == 1 && r3 == 1 && r4 == 0)))};//no
ltl check_14 { [] ((process1 @ done && process2 @ done) ->( ! (r1 == 0 && r2 == 1 && r3 == 0 && r4 == 1)))};//no
ltl check_15 { [] ((process1 @ done && process2 @ done) ->( ! (r1 == 0 && r2 == 1 && r3 == 1 && r4 == 1)))};//no
