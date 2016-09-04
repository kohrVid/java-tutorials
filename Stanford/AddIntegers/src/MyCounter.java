/* New Class
 * File name: MyCounter.java
 */

public class MyCounter {
	public MyCounter(int startValue) {
		counter = startValue;
	}
	
	public MyCounter() {
		counter = 1;
	}
	
	public int nextValue() {
		int temp = counter;
		counter++;
		return(temp);
	}
	
	private int counter;
}
