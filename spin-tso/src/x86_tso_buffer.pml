/*
author: Annika Mütze <muetze.annika@gmail.com>
date: 10.2012

writebuffer model. Read, write, flush, fence and CAS
*/

#define NULL -1

/*Array welches die  Queue darstellt (Form: 3-dimensionales Array der Laenge SIZE) das heißt (nx3)-Matrix*/
typedef matrix{short zeile [3]}
mtype = {iWrite, iRead , iMfence, iCas};
/*Speicher*/
short memory[MAX_SIZE];


inline write() {
	if
	:: (((tail+1) % SIZE) == head && !isEmpty) -> 	// buffer full, need to dequeue
		/*Wert in Speicher schreiben: memory[adresse] = value*/
		memory[buffer[head].zeile[0]] = buffer[head].zeile[1];
		/*Writebuffer auf leer setzen*/
		buffer[head].zeile[0] = NULL;
		buffer[head].zeile[1] = NULL;
		buffer[head].zeile[2] = NULL;
					
		/*head weitersetzen*/
		head = (head+1) % SIZE;	
	:: else -> isEmpty = false; skip;
	fi
		->	
 		tail = (tail+1) % SIZE;
		buffer[tail].zeile[0] = adresse;
		buffer[tail].zeile[1] = value;
		buffer[tail].zeile[2] = c;
}

inline read() {
	i = 0;
	do
	:: i < SIZE -> 
			if
			/* if Adresse entspricht gesuchter Adresse -> gib zugehörigen Wert zurück*/
			::buffer[i].zeile[0] == adresse ->  channel ! iRead,adresse,buffer[i].zeile[1],c;
			::else -> i++;
			fi
			/*Zugriff auf Speicher und Rückgabe des entsprechenden Wertes*/
	::else ->
		channel ! iRead,adresse,memory[adresse],c;
		break;
	od
}

inline flush() {
	/*Wert in Speicher schreiben: memory[adresse] = value*/
	memory[buffer[head].zeile[0]] = buffer[head].zeile[1];
	/*Writebuffer leeren*/
	buffer[head].zeile[0] = NULL;
	buffer[head].zeile[1] = NULL;
	buffer[head].zeile[2] = NULL;
						
	/*head weitersetzen*/
	head = (head+1) % SIZE;
			
	if
	::(head == ((tail+1) % SIZE))-> isEmpty = true;
	:: else -> skip;
	fi;
}

inline mfence() {
	do
	:: flush() 
	:: isEmpty -> break
	od
}
	
inline cas() {
	do
	:: flush()
	:: isEmpty -> 
		if
		:: (memory[adresse] == old) -> memory[adresse] = new;
		:: else -> skip
		fi
	::else -> break
	od
}

proctype bufferProcess(chan channel)
{		
	/*Queue Anfang bzw Ende*/
	short head = 0;
	short tail = -1;
	bit isEmpty = true;

	short adresse = 0;
	short value = 0;
	short c = 0; 
	short i = 0;
	short old = 0;
	short new = 0;
	
	/*Writebuffer*/
	matrix buffer [SIZE];
	
	/*enqueue-Operation der Queue vom Writebuffer (einfügen in Queue wenn ein write-Befehl geschickt wird) und bei read-Befehl Queue bzw Speicher durchsuchen und Wert zurückgeben */
end:	do 
		::	atomic{ 
				if
				/*WRITE*/
				:: channel ? iWrite(adresse,value,c) -> write();
				/*READ*/
				:: channel ? iRead, adresse, value, c -> read();
				/*FLUSH*/
				:: !isEmpty -> flush();
				/*FENCE*/
				::channel ? iMfence, _, _ ,_ -> mfence();
				/*COMPARE AND SWAP*/
				:: channel ? iCas, adresse , old, new -> cas();
				fi
			}
		od
}
		
		
