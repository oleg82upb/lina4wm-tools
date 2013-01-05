/*
*author: Annika Mütze <muetze.annika@gmail.com>
*date: 12.2012
*
*
*/

#define ADRESSE_X 1
#define ADRESSE_Y 2
#define ADRESSE_Z 3
#define BUFF_SIZE 5 	//size of Buffer
#define MEM_SIZE 5		//size of memory 
#include "sc-model.pml"

short r1 = 0;
short r2 = 0;
short r3 = 0;
short r4 = 0;

proctype process1()
{
	write(ADRESSE_Y, 1);
	write(ADRESSE_X, 1);
	done:skip;	
}

proctype process2()
{
	write(ADRESSE_X, 2);
	write(ADRESSE_Z, 1);
	done:skip;
}

proctype process3()
{
	read(ADRESSE_X, r1);
	read(ADRESSE_X, r2);
	done:skip;
}
proctype process4()
{
	read(ADRESSE_Z, r3);
	read(ADRESSE_Y, r4);
	done:skip;
}

init {
	atomic{
	run process1();
	run process2();
	run process3();
	run process4();
	}
}
ltl check {[]((process1 @ done && process2 @ done && process3 @ done && process4 @ done)
			-> !(r1 == 1 && r2 == 2 && r3 == 1 && r4 == 0))};
