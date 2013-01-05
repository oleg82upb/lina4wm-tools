/*
* author: Annika Mütze <muetze.annika@gmail.com>
* date: 11.2012
*
* Litmus-Test: 
*/

#define ADRESSE_X 1
#define ADRESSE_Y 2
#define BUFF_SIZE 4 	//size of Buffer
#define MEM_SIZE 4		//size of memory 
#include "sc-model.pml"


short r1 = 0;
short r2 = 0;
short r3 = 0;


proctype process1()
{

	write(ADRESSE_X, 2);
	read(ADRESSE_Y, r1);
	done:skip;
}

proctype process2()
{
	write(ADRESSE_Y, 1);
	write(ADRESSE_X, 1);
	done:skip;
}
proctype process3()
{
	read(ADRESSE_X, r2);
	read(ADRESSE_X, r3);
	done: skip;
}

init
{
atomic{
	run process1();
	run process2();
	run process3();
	}	
}
	

/*(r1 == 0) && (r2 == 1) && (r3 == 2) ok (allowed)*/

ltl check_0 {[] ((process1 @ done && process3 @ done) -> (!( (r1 == 0) && (r2 == 1) && (r3 == 2))))};

ltl check_1 {[] ((process1 @ done && process3 @ done) -> (!( (r1 == 1) && (r2 == 0) && (r3 == 0))))};
ltl check_2 {[] ((process1 @ done && process3 @ done) -> (!( (r1 == 1) && (r2 == 0) && (r3 == 1))))};
ltl check_3 {[] ((process1 @ done && process3 @ done) -> (!( (r1 == 1) && (r2 == 1) && (r3 == 0))))};
ltl check_4 {[] ((process1 @ done && process3 @ done) -> (!( (r1 == 1) && (r2 == 1) && (r3 == 1))))};
ltl check_5 {[] ((process1 @ done && process3 @ done) -> (!( (r1 == 0) && (r2 == 0) && (r3 == 0))))};
ltl check_6 {[] ((process1 @ done && process3 @ done) -> (!( (r1 == 0) && (r2 == 0) && (r3 == 1))))};
ltl check_7 {[] ((process1 @ done && process3 @ done) -> (!( (r1 == 0) && (r2 == 1) && (r3 == 0))))};
ltl check_8 {[] ((process1 @ done && process3 @ done) -> (!( (r1 == 0) && (r2 == 1) && (r3 == 1))))};

ltl check_9 {[] ((process1 @ done && process3 @ done) -> (!( (r1 == 0) && (r2 == 2) && (r3 == 1))))};
ltl check_10 {[] ((process1 @ done && process3 @ done) -> (!( (r1 == 0) && (r2 == 0) && (r3 == 2))))};
ltl check_11 {[] ((process1 @ done && process3 @ done) -> (!( (r1 == 0) && (r2 == 2) && (r3 == 0))))};
ltl check_12 {[] ((process1 @ done && process3 @ done) -> (!( (r1 == 0) && (r2 == 2) && (r3 == 2))))};
ltl check_13 {[] ((process1 @ done && process3 @ done) -> (!( (r1 == 0) && (r2 == 2) && (r3 == 1))))};
ltl check_14 {[] ((process1 @ done && process3 @ done) -> (!( (r1 == 1) && (r2 == 1) && (r3 == 2))))};
ltl check_15 {[] ((process1 @ done && process3 @ done) -> (!( (r1 == 1) && (r2 == 0) && (r3 == 2))))};
ltl check_16 {[] ((process1 @ done && process3 @ done) -> (!( (r1 == 1) && (r2 == 2) && (r3 == 0))))};
ltl check_17 {[] ((process1 @ done && process3 @ done) -> (!( (r1 == 1) && (r2 == 2) && (r3 == 2))))};
