package de.upb.lina.cfg.tools;

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
