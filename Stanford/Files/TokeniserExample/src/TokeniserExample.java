/*
 * File: TokeniserExample.java
 */
import acm.program.*;
import java.util.*;

public class TokeniserExample extends ConsoleProgram {
	private void printTokens(String str) {
		StringTokenizer tokeniser = new StringTokenizer(str, " ,");
		for(int count = 0; tokeniser.hasMoreTokens(); count++){
			println("Token #" + count + ": " + tokeniser.nextToken());
		}
	}
	
	public void run() {
		setFont("Liberation Serif-24");
		String line = readLine("Enter line to tokenise: ");
		println("The tokens of the string are: ");
		printTokens(line);
	}
}