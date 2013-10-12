/*
* author: Annika Mütze <muetze.annika@gmail.com>
* date: 09.2012
*
* Litmus-Test: Reordering of reads with older writes is allowed
* when the location differs
*/

#define ADRESSE_X 1
#define ADRESSE_Y 2
#define BUFF_SIZE 4 	//size of Buffer
#define MEM_SIZE 4		//size of memory 

#define PROC_NUMBER 2
#include "../x86_tso_buffer_globalarray.pml"


/*channel who send the reads and writes: (messagetype, address, value, extra)*/
chan channelT1 = [0] of {mtype, short, short, short};
chan channelT2 = [0] of {mtype, short, short, short};
short r1 = 0;
short r2 = 0;


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
	done:skip;
}

init
{
atomic{
	run process1(channelT1);
	run bufferProcess(channelT1);
	run process2(channelT2);
	run bufferProcess(channelT2);
	}	
}
	
	/*all possibilities are valid
	*(r1 == 1) && (r2 == 0) ok
	*(r1 == 0) && (r2 == 1) ok
	*(r1 == 1) && (r2 == 1) ok
	*(r1 == 0) && (r2 == 0) ok (allowed)*/

ltl check_0{ [] ((process1 @ done && process2 @ done) -> (!(r1 == 0 && r2 == 0)))};

ltl check_1{ [] ((process1 @ done && process2 @ done) -> (!(r1 == 1 && r2 == 0)))};
ltl check_2{ [] ((process1 @ done && process2 @ done) -> (!(r1 == 0 && r2 == 1)))}; 
ltl check_3{ [] ((process1 @ done && process2 @ done) -> (!(r1 == 1 && r2 == 1)))};
 