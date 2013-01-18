// targetvariable = load( address) =  read(address, target)



inline pop()
{
	short retval, head, head2, thisAddr, ss, ssn, this1, v0, v1, v2, v3, v4 v5;			//some more v_i still missing
	
entry:
atomic {
	allocata(Ptr, retval);
	allocata(Ptr, thisAddr);
	allocata(Ptr, ss);
	allocata(Ptr, ssn);
	}
	write(this, thisAddr);
	read(thisAddr, this1);

doBody:
	getelementptr (Stack, this1, 0, head);
	read (head, v0);
	write (ss, v0);
	read(ss, v1);
	
	if 
	:: ss == NULL ->write(retval, NULL);
					goto return;
	:: else -> goto ifend;
	
ifend:
	read (ss,v2);
	getelementptr (Node, v2, 1, next);
	read (next, v3);
	write (ssn, v3);	
	
doCond:
	getelementptr(Stack, this1, 0, head2);
															
	read (ss, v5);											// equals: v5; v4 wäre ein bitcast von head2 (ptr) zu i32  (also 32bit integer) 
	read (ssn, v7);											// v7 in llvm code , da v6 cast
	cas(head2, v5, v7, v9);										//cas(head, ss, ssn); cas(adr, oldValue, newValue, returnValue)
	
	if
	:: v9 == false -> goto doBody
	:: else read(ss,v11);									//v11 in llvm
			write(reval, v11);								//v11 in llvm
			
//return nicht notwendig da in retval der Wert schon steht.
				