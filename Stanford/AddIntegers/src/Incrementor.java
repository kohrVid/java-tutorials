/*
 * File: Incrementor.java
 */

public class Incrementor {

	public Incrementor() {
		counter = 1;
	}
	
	public Incrementor(int startValue) {
		counter = startValue;
	}
	
	public int nextValue() {
		int temp = counter;
		counter++;
		return (temp);
	}
	
	private int counter;
}