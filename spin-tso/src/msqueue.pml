

//Types for LLVM, actually their length in size of pointers and values
#define Queue  0 	//= {0};
#define Node  1	//= {0,1};
#define I32  0 		// = {0};
#define Ptr  0
#define I1	0		//or better a boolean variable?
short memUse = 1; 	//shows to the next free cell in memory
byte this; 		//Queue instance pointer


chan channelT1 = [0] of {mtype, short, short, short};
chan channelT2 = [0] of {mtype, short, short, short};

inline getelementptr(type, instance, offset, targetRegister)
{
	atomic{
	//simplified version of what llvm does.
	//we don't need the type as long as we assume our memory to hold only values/pointers etc of equal length. 
	//In this case, the offset directly correspond to adding it to instance address. 
	assert(offset <= type); //offset shouldn't be greater than the type range
	targetRegister = instance + offset;
	}
}

inline alloca(type, targetRegister)
{
	atomic{
	//need c_Code here, but for now we could use this to statically define used addresses
	targetRegister = memUse;
	memUse = memUse + type + 1;
	assert(memUse < MEM_SIZE);
	}
}


inline enqueue (this, v){

short this_addr, value_addr, node, localTail, next, next2, value, val v1, v2, v3;

entry:
	atomic{
		alloca(Ptr, this_addr);	
		alloca(Ptr, value_addr);
		alloca(Ptr, node);
		alloca(Ptr, localTail);
		alloca(Ptr, next);
		alloca(Node, v0);		//new node
		}
		write(this_addr, this);
		write(value_addr, value);
		read(this_addr, this1);
	
invoke_cont:
	write(node, v0);
	read(value_addr, v1);
	read(node, v2);
	getelementptr(Node, v2, 0, val);
	write(val, v1);
	read(node, v3);
	getelementptr(Node, v3, 1, v3);
	write(next2, NULL);
	->
	
doBody:
	//stopped at line 98
							

}

//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
inline dequeue (returnval){

short this_addr, this_value, retvalue, localHead, localTail, this1, head, tail, next, next2, v0, v1, v2, v3, v4, v5, v6, v7, v8, v10, v12, v14, v16, v17, v18, head3, head9, val, tail8;
//value?
entry: 
	atomic{
		alloca(I1, retval);			//i1 ? oder einfach bool?
		alloca(Ptr, this_addr);
		alloca(I32, this_value);
		alloca(Ptr, localHead);
		alloca(Ptr, localTail);
		alloca(Ptr, next);
		}
		write(this_addr, this);
		write(value_addr, value);
		read(this_addr, this1);
		
	->
doBody:
	getelementptr(Queue, this1, 0, head);
	read(head, v0);
	write(localHead, v0);
	getelemetptr(Queue, this1, 1, tail);
	write(localTail, v1);
	read(localHead, v2);
	getelementptr(Node, v2, 1, next2);
	read(next2, v3);
	write(next, v3);
	read(localHead, v4);
	getelementptr(Queue, this1, 0, head3);
	read(head3, v5);
	
	if
	:: v4 == v5 -> goto if_then
	:: else -> goto if_end13
	fi;

if_then:
	read(localHead,v6);
	read(localTail, v7);
	if
	:: v6 == v7 -> goto if_then5
	:: else -> goto if_else
	fi;
	
if_then5:
	read(next, v8);
	if
	:: v8 == NULL -> goto if_then7
	:: else -> goto if_end
	fi;
	
if_then7:
	write(retval, false);
	goto return;
	
if_end:
	getelementptr(Queue, this1, 1, tail8);
	read(localTail, v10);
	read(next, v12);
	//cas(tail8, v10, v12, v14);
	if
	:: v14 == false-> goto doBody
	:: else -> 	write(retval, true);
				goto return;
	fi;
	
if_else:
	read(next, v16);
	getelementptr(Node, v16, 0, val);
	read(val, v17);
	read(value_addr, v18);
	write(v18, v17);
	getelemetptr(Queue, this1, 0, head9);
	read(localHead, v20);
	read(next, v22);
	//cas(head9, v20, v22, v24);
	if
	:: v24 == true -> 	write(retval, true);
						goto return;
	:: else -> goto doBody
	fi;
	

return:
	read(retval, returnval);
			
}
//---------------------------------------------------------------------------------------------------------------------------------------	