package de.upb.lina.cfgwizard;

public class ProgramCounter {

	private int counter;

	public ProgramCounter() {
		this.counter = 0;
	}

	public int next() {
		return ++counter;
	}
}
