/* P. Swell, et al, "x86-TSO: a rigorous and usable
   programmer's model for x86 multiprocessors,"
   CACM 53:7, p. 89-97, July 2010,
 */

#define N	16	/* max nr of threads / pids */
#define M	16	/* max memory locations 0..15 */
#define B	4	/* size of write buffer */

short lock;	/* locked by pid + 1 */

byte memory[M];

#define address	byte	/* 0..M   */
#define value	byte	/* 0..255 */

chan buffers[N] = [B] of { address, value };	/* one write-buffer per thread */

inline write(a, v) {
	atomic {
	buffers[_pid]!a,v;
	printf("%d <- %d\n", a, v)
	}
}

inline read(a, into) {	/* read value at a into into */

	atomic {
		lock == 0 || lock == _pid ->
		r3 = 0;
		assert(a >= 0 && a <= M);
		r4 = len(buffers[_pid]);
		do
		:: r4 == 0 -> break
		:: else ->
			buffers[_pid]?r1,r2 ->
			buffers[_pid]!r1,r2;
			if
			:: r1 == a -> into = r2; r3 = 1 /* last one wins */
			:: else
			fi;
			r4--
		od;
		if
		:: r3 == 0 -> into = memory[a]
		:: else
		fi;
		printf("%d -> %d\n", a, into);
	}
}

inline Lock() {
	atomic { lock == 0 -> lock = _pid + 1 }
}

inline Unlock() {
	lock = 0
}

inline tau(i) {
	/* one tau step */
	if
	:: atomic {
		nempty(buffers[i]) ->
		buffers[i]?r1,r2;
		memory[r1] = r2;
		printf("[%d <- %d]\n", r1, r2)
	   }
	:: empty(buffers[i])	
	fi
}

inline fence() {
	do
	:: buffers[_pid]?a,v -> assert(a >= 0 && a <= M); memory[a] = v
	:: empty(buffers[_pid]) -> break
	od
}

/* Peterson's solution to the mutual exclusion problem - 1981 */

/*	bool turn;	-> a == 2
	bool flag[2];	-> a == 0, a == 1 -- so that we can use pid values
 */

byte ncrit;

#define my_flag		(_pid)
#define his_flag	(1 - _pid)
#define turn		(2)

active [2] proctype peterson()
{	byte r1, r2, r3, r4;
	byte r5, r6;

        assert(_pid == 0 || _pid == 1);
again:
        write(my_flag, 1);		/* flag[_pid] = 1; */
        write(turn, _pid);		/* turn = _pid;    */

	do				/* (flag[1 - _pid] == 0 || turn == 1 - _pid); */
	:: read(his_flag, r5);
		if
		:: (r5 == 0) -> break
		:: else
		fi;
	:: read(turn, r6);
		if
		:: (r6 == 1 - _pid) -> break
		:: else
		fi
	od;

        ncrit++;
        assert(ncrit == 1);    	 /* critical section */
        ncrit--;

	write(my_flag, 0);		/* flag[_pid] = 0; */
        goto again
}

active [2] proctype cpu()
{	byte r1, r2;

        assert(_pid == 2 || _pid == 3);
	do
	:: tau(_pid - 2)
	od
}
