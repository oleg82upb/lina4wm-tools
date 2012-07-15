
/*Array welches die  Queue darstellt (Form: 3-dimensionales Array der Laenge SIZE) das heißt (nx3)-Matrix*/
#define SIZE 5
//[zahl] gibt Größe an (also die Dimension)
typedef matrix{int spalte [3]}
mtype = {write, read};
/*Channel der die reads und writes verschickt (Type (also write,read); Adresse; Wert;... )*/
chan channel = [0] of {mtype, int, int, int};
/*Writebuffer*/
matrix queue [SIZE];
active proctype receiver()
{		
	/*Queue Anfang bzw Ende*/
	int head = -1;
	int tail = -1;
	int adresse, value,c; 
	int i = 0;
	
	do
	:: channel ? write(adresse,value,c) ->
		/*error if buffer full*/
		if
		:: (head == 0 && tail == SIZE-1 || head == tail+1) -> printf("Buffer full\n");
		:: else ->	if
	/*Initialisierung, wenn der erste Wert gesetzt wird*/
				:: head == -1 && tail == -1 ->head = 0;	
				::(tail == SIZE-1) -> tail = 0;	
				fi
				-> tail ++;
				queue[tail].spalte[0] = adresse;
			 	queue[tail].spalte[1] = value;
			 	queue[tail].spalte[2] = c; 
		fi
	:: channel ? read, adresse, value, c
		->do
		:: i < SIZE -> if
				/* if Adresse entspricht gesuchter Adresse -> gib zugehörigen Wert zurück*/
				::queue[i].spalte[0] = adresse ->  channel ! read,adresse,queue[i].spalte[1],c;
				::else -> i++;
				fi
		::i>=SIZE -> break
		od
	od
}
active proctype sender()
{
	int x = 1;
	int y = 1;
	int z = 1;
	
	y++; channel ! write,x,y,z;
	x++; channel ! write,x,y,z;
	 
	z++; channel ! write,x,y,z;
	
}