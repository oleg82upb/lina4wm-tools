#define MEM_SIZE 15	//size of memory
#define NULL 0
#define I32  0 		// = {0};

#define EMPTY 0
#define MYNULL -1

short memory[MEM_SIZE];
short memUse = 1; 	//shows to the next free cell in memory


inline ZN5StackC2Ev(){
0:  instr 
1:  instr 
2headnull: if 
		:: instr; -> goto 2;
		:: instr; -> goto 3headnull;
2:  instr 
3headnull:  instr 

}

inline ZN5Stack4pushEi(){
00:  instr 
01:  instr 
02:  instr 
03valv: if 
		:: instr; -> goto 03;
		:: instr; -> goto 04valv;
03:  instr 
04valv: if 
		:: instr; -> goto 04;
		:: instr; -> goto 05valv;
04:  instr 
05valv: if 
		:: instr; -> goto 05;
		:: instr; -> goto 06valv;
05:  instr 
06valv: if 
		:: instr; -> goto 06;
		:: instr; -> goto 07valv;
06:  instr 
07valv: if 
		:: instr; -> goto 07;
		:: instr; -> goto 08valv;
07:  instr 
08valv: if 
		:: instr; -> goto 08;
		:: instr; -> goto 09valv;
08:  instr 
09valv: if 
		:: instr; -> goto 09;
		:: instr; -> goto 10valv;
09:  instr 
10valv: if 
		:: instr; -> goto 10;
		:: instr; -> goto 11valvv0v3;
10:  instr 
11valvv0v3: if 
		:: instr; -> goto 11v0v3;
		:: instr; -> goto 12valvv0v3;
11v0v3: if 
		:: instr; -> goto 11;
		:: instr; -> goto 12v0v3;
12valvv0v3:  instr 
11:  instr 
12v0v3:  instr 
12:  instr 
13:  instr 
14: if 
		:: instr; -> goto 15;
		:: instr; -> goto 09;
15:  instr 

}

inline ZN5Stack3popEv(){
00:  instr 
01:  instr 
02:  instr 
03:  instr 
04:  instr 
05: if 
		:: instr; -> goto 13;
		:: instr; -> goto 06;
13:  instr 
06:  instr 
14:  instr 
07:  instr 
08:  instr 
09:  instr 
10:  instr 
11:  instr 
12: if 
		:: instr; -> goto 13;
		:: instr; -> goto 03;

}



//Stubs
proctype process1(){
	//TODO: empty stub
}

proctype process2(){
	//TODO: empty stub
}


init{
atomic{
	//TODO: empty stub

	run process1();
	run process2();
	}
}


//standard stuff
inline getelementptr(instance, offset, targetRegister)
{
	atomic{
	//simplified version of what llvm does.
	//we don't need the type as long as we assume our memory to hold only values/pointers etc of equal length. 
	//In this case, the offset directly correspond to adding it to instance address. 
	//assert(offset <= type); //offset shouldn't be greater than the type range
	targetRegister = instance + offset;
	}
}

inline alloca(type, targetRegister)
{
	atomic{
	targetRegister = memUse;
	memUse = memUse + type + 1;
	assert(memUse < MEM_SIZE);
	}
}

inline cas(adr, old, new, result)
{
	atomic{
	if 	:: memory[adr] == old -> memory[adr] = new; result = true;
		:: else -> result = false;
	fi;
	}
}

