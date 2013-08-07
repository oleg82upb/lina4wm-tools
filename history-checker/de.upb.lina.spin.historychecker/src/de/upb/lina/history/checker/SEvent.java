package de.upb.lina.history.checker;

public class SEvent {

	private int pid;
	private OperationType op;
	private int param1;
	private int param2;
	private int result;
	
	public SEvent(int pid, OperationType op, int param1,
			int param2, int result) {
		super();
		this.pid = pid;
		this.op = op;
		this.param1 = param1;
		this.param2 = param2;
		this.result = result;
	}



	public int getPid() {
		return pid;
	}



	public void setPid(int pid) {
		this.pid = pid;
	}



	public OperationType getOp() {
		return op;
	}



	public void setOp(OperationType op) {
		this.op = op;
	}



	public int getParam1() {
		return param1;
	}



	public void setParam1(int param1) {
		this.param1 = param1;
	}



	public int getParam2() {
		return param2;
	}



	public void setParam2(int param2) {
		this.param2 = param2;
	}



	public int getResult() {
		return result;
	}



	public void setResult(int result) {
		this.result = result;
	}



	@Override
	public boolean equals(Object obj) {
		if (obj instanceof SEvent)
		{
			SEvent e = (SEvent) obj;
			return this.pid == e.pid
					&& this.op == e.op
					&& this.param1 == e.param1
					&& this.param2 == e.param2
					&& this.result == e.result;
		}
		
		if (obj instanceof HEvent)
		{
			HEvent e = (HEvent) obj;
			return this.pid == e.getPid()
					&& this.op == e.getOp();
		}
		return super.equals(obj);
	}

	@Override
	public String toString() {
		String sub = this.pid + "" + this.op +"";
		sub += "("+ param1 + (param2!=0?", " + param2:"")+")";
		sub+= ":" + this.result;
		return sub;
	}

}
