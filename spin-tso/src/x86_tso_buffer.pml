/*
author: Annika Mütze <muetze.annika@gmail.com>
date: 10.2012

writebuffer model. Read, write, flush, fence and CAS
*/

#define NULL -1

/*Buffer as a 3 dimensional array which represents the queue [(nx3)-matrix]*/
typedef matrix{short line [2]}

mtype = {iWrite, iRead , iMfence, iCas};
/*memory*/
short memory[MEM_SIZE];


inline write(adr, newValue)
{
	ch ! iWrite, adr, newValue, NULL;
}

inline read(adr, target)
{
	atomic{
	short readValue;
	ch ! iRead, adr, NULL, NULL;
	ch ? iRead, adr, readValue, NULL;
	target = readValue;
	}
}

inline mfence()
{
	ch ! iMfence, NULL, NULL, NULL;
}	

inline cas(adr, oldValue, newValue, returnValue) 
{
	bit success;
	atomic{
	ch ! iCas, adr, oldValue, newValue;
	ch ? iCas, adr, success, _; 
	returnValue = success;
	}
}

inline writeB() {
	if
		/*buffer full, need to flush first*/
	:: (((tail+1) % BUFF_SIZE) == head && !isEmpty) -> flushB()	
	:: else -> isEmpty = false; skip;
	fi
		->	
 		tail = (tail+1) % BUFF_SIZE;
		buffer[tail].line[0] = address;
		buffer[tail].line[1] = value;
}


inline readB() {
	i = tail;
	do
	:: i >= head  -> 
			if
			/* if an address in the buffer is equivalent to the searched -> return value*/
			::buffer[i].line[0] == address 
				->  channel ! iRead,address,buffer[i].line[1],NULL;
					break;
			::else -> i--;
			fi
			/*else: access to memory and return value of searched address*/
	::else ->
		channel ! iRead,address,memory[address],NULL;
		break;
	od
}


inline flushB() {
	/*write value in memory: memory[address] = value*/
	memory[buffer[head].line[0]] = buffer[head].line[1];
	/*empty write buffer*/
	buffer[head].line[0] = NULL;
	buffer[head].line[1] = NULL;
						
	/*moving head*/
	head = (head+1) % BUFF_SIZE;
			
	if
	::(head == ((tail+1) % BUFF_SIZE))-> isEmpty = true;
	:: else -> skip;
	fi;
}

inline mfenceB() {
	do
	:: if
		::isEmpty -> break;
		::else -> flushB() 
		fi
	od
}
	
inline casB() {
	do
	:: flushB()
	:: isEmpty -> 
		if
		:: (memory[address] == old) -> memory[address] = new;
		:: else -> skip
		fi
	::else -> break
	od
}

proctype bufferProcess(chan channel)
{		
	/*start resp. end of queue*/
	short head = 0;
	short tail = -1;
	bit isEmpty = true;

	short address = 0;
	short value = 0;
	short c = 0; 
	short i = 0;
	short old = 0;
	short new = 0;
	
	/*writebuffer*/
	matrix buffer [BUFF_SIZE];

	
end:	do 
		::	atomic{ 
				if
				/*WRITE*/
				:: channel ? iWrite(address,value, _) -> writeB();
				/*READ*/
				:: channel ? iRead, address, value, _ -> readB();
				/*FLUSH*/
				:: !isEmpty -> flushB();
				/*FENCE*/
				::channel ? iMfence, _, _ ,_ -> mfenceB();
				/*COMPARE AND SWAP*/
				:: channel ? iCas, address , old, new -> casB();
				fi
			}
		od
}