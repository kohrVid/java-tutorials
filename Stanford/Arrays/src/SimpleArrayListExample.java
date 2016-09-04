/*
 * File: SimpleArrayListExample.java
 */
import acm.program.*;
import java.util.*;

public class SimpleArrayListExample extends ConsoleProgram {
	public void run(){
		setFont("Courier 10 Pitch-24");
		
		ArrayList<String> list = new ArrayList<String>();
		
		readList(list);
		printArrayList(list);

		readList(list);
		printArrayList(list);
	}
	
	private void readList(ArrayList list){
		while (true) {
			String item = readLine("? ");
			if (item.equals("")) break;
			list.add(item);
		}
	}
	
	private void printArrayList(ArrayList list) {
		println("List contains " + list.size() + " elements");
		for (int i =0; i < list.size(); i++) {
			println(list.get(i));
		}
	}
}