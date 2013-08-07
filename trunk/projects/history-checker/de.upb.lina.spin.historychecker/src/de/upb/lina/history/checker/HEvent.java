package de.upb.lina.history.checker;


public class HEvent {

	private boolean callReturn;
	private int pid;
	private OperationType op;
	private int param1;
	private int param2;
	
	public HEvent(boolean callReturn, int pid, OperationType op, int param1) {
		super();
		this.callReturn = callReturn;
		this.pid = pid;
		this.op = op;
		this.param1 = param1;
	}

	public HEvent(boolean callReturn, int pid, OperationType op, int param1,
			int param2) {
		super();
		this.callReturn = callReturn;
		this.pid = pid;
		this.op = op;
		this.param1 = param1;
		this.param2 = param2;
	}

	public boolean isCall() {
		return callReturn;
	}

	public int getPid() {
		return pid;
	}

	public OperationType getOp() {
		return op;
	}
	
	public int getOutput() {
		return param1;
	}

	public int getParam1() {
		return param1;
	}

	public int getParam2() {
		return param2;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof HEvent)
		{
			HEvent e = (HEvent) obj;
			return this.callReturn == e.callReturn
					&& this.pid == e.pid
					&& this.op == e.op
					&& this.param1 == e.param1
					&& this.param2 == e.param2;
		}
		return super.equals(obj);
	}

	@Override
	public String toString() {
		String sub = this.callReturn? ("call ") : "ret ";
		sub += "(" + this.pid + ") ";
		sub += this.op;
		sub += "("+ param1 + (param2!=0?", " + param2:"")+")";
		return "( " + sub + ")";
	}
	
	
}
