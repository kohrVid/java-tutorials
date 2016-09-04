/*
 * File: TestScores.java
 */
import acm.program.*;
import java.util.*;

public class TestScores extends ConsoleProgram {
	public void run() {
		setFont("Courier 10 Pitch-24");	
		
		int numScores = readInt("Number of scores: ");
		scores = new int[2][numScores];
	
		initScores();
		println("Scores[0] before increment");
		printList(scores[0]);
	
		incrementScoreList(scores[0]);
		println("Scores[0] after increment");
		printList(scores[0]);
	}
	
	//Initialised score grid to all be 0
	private void initScores() {
		for(int i = 0; i < scores.length; i++) {
			for (int j = 0; j < scores[0].length; j++) {
				scores[i][j] = 0; //0 is default anyways.
				//Note, as scores is an array of arrays
				//, it's length if 2.
			}
		}
	}
	
	/* Prints every element of list on a separate line */
	private void printList(int[] list) {
		for (int i = 0; i < list.length; i++) {
			println(list[i]);
		}
	}
	
	// add 1 to every element of list
	private void incrementScoreList(int[] list) {
		for(int i = 0; i < list.length; i++) {
			list [i] += 1;
		}
	}
	
	/* private instance variable */
	private int[][] scores;
	
}