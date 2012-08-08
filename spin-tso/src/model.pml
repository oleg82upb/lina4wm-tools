
/*Array welches die  Queue darstellt (Form: 3-dimensionales Array der Laenge SIZE) das heißt (nx3)-Matrix*/
#define SIZE 5
#define MAX_SIZE 5
#define TRUE 1
#define FALSE 0

//[zahl] gibt Größe an (also die Dimension)
typedef matrix{int zeile [3]}
mtype = {write, read};
/*Channel der die reads und writes verschickt (Type (also write,read); Adresse; Wert;... )*/
chan channel = [0] of {mtype, int, int, int};
/*Writebuffer*/
matrix queue [SIZE];
int memory[MAX_SIZE];

/* ... TODO ... memory initialisieren???? welche Adressen existieren? */
active proctype receiver()
{		
	/*Queue Anfang bzw Ende*/
	int head = -1;
	int tail = -1;
	bit isEmpty = 1;
	int adresse, value,c; 
	int i = 0;
	/*enqueue-Operation der Queue vom Writebuffer (einfügen in Queue wenn ein write-Befehl geschickt wird) und bei read-Befehl Queue bzw Speicher durchsuchen und Wert zurückgeben */
	do 
	:: 	atomic{ 
		if
		:: channel ? write(adresse,value,c) ->
			/*error if buffer full*/
			if
			:: (((tail+1) % SIZE) == head) && (isEmpty == FALSE)-> printf("Buffer full, need to dequeue\n");
			:: else ->	
					if
					/*Initialisierung, wenn der erste Wert gesetzt wird*/
					::(head == -1 && tail == -1) -> head = 0; isEmpty = FALSE;	
					:: else -> skip;	
					fi
					->tail = (tail+1) % SIZE;
					queue[tail].zeile[0] = adresse;
				 	queue[tail].zeile[1] = value;
				 	queue[tail].zeile[2] = c; 
			fi
		
		/*read*/
		
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
			
		/*dequeue*/
		
		:: skip ->
				if 
				:: (isEmpty == TRUE) -> printf("error: queue empty")
				:: else ->
						if
						::(head == ((tail+1) % SIZE))-> isEmpty = TRUE;
						:: else -> skip;
						fi;
						/*Wert in Speicher schreiben: memory[adresse] = value*/
						memory[queue[head].zeile[0]] = queue[head].zeile[1];
						/*Writebuffer leeren .....NOTWENDIG ???*/
					/*queue[head].zeile[0] = NULL;
					queue[head].zeile[1] = NULL;
					queue[head].zeile[2] = NULL;
						*/
						/*head weitersetzen*/
						head = (head+1) % SIZE;
				
				fi
		fi
		}
	od
}
active proctype sender()
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
	channel ! write,x,y,z;
	x++; 
	channel ! write,x,y,z;
	z++; 
	channel ! write,x,y,z;
	y++; 
	channel ! write,x,y,z;
	x++; 
	channel ! write,x,y,z;
	z++; 
	channel ! write,x,y,z;
	
}
