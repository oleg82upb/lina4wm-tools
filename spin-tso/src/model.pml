
#define SIZE 5
#define MAX_SIZE 5
#define TRUE 1
#define FALSE 0

/*Array welches die  Queue darstellt (Form: 3-dimensionales Array der Laenge SIZE) das heißt (nx3)-Matrix*/
typedef matrix{int zeile [3]}
mtype = {write, read};
/*Channel der die reads und writes verschickt (Type (also write,read); Adresse; Wert;... )*/
chan channel = [0] of {mtype, int, int, int};
/*Writebuffer*/
matrix queue [SIZE];
/*Speicher*/
int memory[MAX_SIZE];

active proctype buffer()
{		
	/*Queue Anfang bzw Ende*/
	int head = 0;
	int tail = -1;
	bit isEmpty = TRUE;
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
				:: else -> isEmpty = FALSE; skip;
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
					if
						::(head == ((tail+1) % SIZE))-> isEmpty = TRUE;
						:: else -> /*Wert in Speicher schreiben: memory[adresse] = value*/
									memory[queue[head].zeile[0]] = queue[head].zeile[1];
									/*Writebuffer leeren*/
									queue[head].zeile[0] = -1;
									queue[head].zeile[1] = -1;
									queue[head].zeile[2] = -1;
						
									/*head weitersetzen*/
									head = (head+1) % SIZE;
					fi;
						
		fi
		}
	od
}
active proctype program()
{
	int x = 1;
	int y = 1;
	int z = 1;
	
	y++; 
	channel ! write,x,y,z;
	x++; 
	channel ! write,x,y,z;
	z++; 
	channel ! write,x,y,z;
	y++; 
	channel ! read,x,y,z;
	/*x++; 
	channel ! write,x,y,z;
	z++; 
	channel ! write,x,y,z;
	y++; 
	channel ! write,x,y,z;
	x++; 
	channel ! write,x,y,z;
	z++; 
	channel ! write,x,y,z;
	*/
}
