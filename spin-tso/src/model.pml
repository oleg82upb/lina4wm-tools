
#define SIZE 5
#define MAX_SIZE 5
#define ADRESSE_X 0
#define ADRESSE_Y 1
/*Array welches die  Queue darstellt (Form: 3-dimensionales Array der Laenge SIZE) das heißt (nx3)-Matrix*/
typedef matrix{int zeile [3]}
mtype = {write, read};
/*Channel der die reads und writes verschickt (Type (also write,read); Adresse; Wert;... )*/
chan channelT1 = [0] of {mtype, int, int, int};
chan channelT2 = [0] of {mtype, int, int, int};
/*Writebuffer*/
matrix queue [SIZE];
/*Speicher*/
int memory[MAX_SIZE];

proctype buffer(chan channel)
{		
	/*Queue Anfang bzw Ende*/
	int head = 0;
	int tail = -1;
	bit isEmpty = true;
	int adresse, value,c; 
	int i = 0;
	/*enqueue-Operation der Queue vom Writebuffer (einfügen in Queue wenn ein write-Befehl geschickt wird) und bei read-Befehl Queue bzw Speicher durchsuchen und Wert zurückgeben */
end:	do 
	:: 	atomic{ 
		if
			/*WRITE*/
			:: channel ? write(adresse,value,c) ->
				if
				:: (((tail+1) % SIZE) == head && !isEmpty) -> 	// buffer full, need to dequeue
					/*Wert in Speicher schreiben: memory[adresse] = value*/
					memory[queue[head].zeile[0]] = queue[head].zeile[1];
					/*Writebuffer auf leer setzen*/
					queue[head].zeile[0] = -1;
					queue[head].zeile[1] = -1;
					queue[head].zeile[2] = -1;
					
					/*head weitersetzen*/
					head = (head+1) % SIZE;	
				:: else -> isEmpty = false; skip;
				fi
				->	
 				tail = (tail+1) % SIZE;
				queue[tail].zeile[0] = adresse;
				queue[tail].zeile[1] = value;
				queue[tail].zeile[2] = c;
		
		/*READ*/
		:: channel ? read, adresse, value, c ->
			do
			:: i < SIZE -> 
				if
				/* if Adresse entspricht gesuchter Adresse -> gib zugehörigen Wert zurück*/
				::queue[i].zeile[0] == adresse ->  channel ! read,adresse,queue[i].zeile[1],c;
				::else -> i++;
				fi
			/*Zugriff auf Speicher und Rückgabe des entsprechenden Wertes*/
			::i>=SIZE -> channel ! read,adresse,memory[adresse],c;
			od

		
			
		/*FLUSH*/
		:: !isEmpty ->
						/*Wert in Speicher schreiben: memory[adresse] = value*/
						memory[queue[head].zeile[0]] = queue[head].zeile[1];
						/*Writebuffer leeren*/
						queue[head].zeile[0] = 0;
						queue[head].zeile[1] = 0;
						queue[head].zeile[2] = 0;
						
						/*head weitersetzen*/
						head = (head+1) % SIZE;
						
						if
						::(head == ((tail+1) % SIZE))-> isEmpty = true;
						:: else -> skip;
						fi;
		fi
		}
	od
}
proctype process1()
{
	channelT1 ! write,ADRESSE_X,1,0;
	channelT1 ! write,ADRESSE_X,1,0;
	
}

proctype process2()
{
	int r1 = 0;
	int r2 = 0;
	
	/*Wie ist das mit den letzten beiden Werten?			????????????????????????????????*/
	channelT2 ! read, ADRESSE_X, 0, 0;
	
	/* wird nur ausgeführt wenn auch die Adresse von x ist*/
	channelT2 ? read, ADRESSE_X, r1, 0;
	
	channelT2 ! read, ADRESSE_Y, 0, 0;
	channelT2 ? read, ADRESSE_Y,r2, 0;
}

init
{
	run process1();
	run buffer(channelT1);
	run process2();
	run buffer(channelT2)
}
