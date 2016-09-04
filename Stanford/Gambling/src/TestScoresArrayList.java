/*
 * File: TestScoresArrayList.java
 */
import acm.program.*;
import java.util.*;

public class TestScoresArrayList extends ConsoleProgram {
	public void run(){
		setFont("Courier 10 Pitch-24");
		
		int numScores = readInt("Number of scores: ");
		
		initScores(numScores);
		println("Scores after increment");
		printList(scores);
		
	}
	
	private void initScores(int numScores) {
		for(int i = 0; i < numScores; i++){
			scores.add(0); //auto boxing to Integer
		}
	}
	
	private void printList(ArrayList list){
		for(int i = 0; i < list.size(); i++) {
			println(list.get(i));
		}
	}
	
	/*Private instance variables */
	ArrayList<Integer> scores = new ArrayList<Integer>();
}