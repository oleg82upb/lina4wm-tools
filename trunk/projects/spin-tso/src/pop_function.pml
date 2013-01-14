inline pop()
{
	short retval, head, thisAddr, ss, ssn, this1, v0, v1, v2, v3;			//some more v_i still missing
	
entry:
atomic {
	allocata(Ptr, retval);
	allocata(Ptr, thisAddr);
	allocata(Ptr, ss);
	allocata(Ptr, ssn);
	}
	write(this, thisAddr);
	read(thisAddr, this1);

body:
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
