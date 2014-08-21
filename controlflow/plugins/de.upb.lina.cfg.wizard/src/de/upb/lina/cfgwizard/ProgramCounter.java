package de.upb.lina.cfgwizard;

public class ProgramCounter {

	private int counter = -1;

	public ProgramCounter() {
		this.counter = -1;
	}

	public int next() {
		counter++;
		return counter;
	}
}
