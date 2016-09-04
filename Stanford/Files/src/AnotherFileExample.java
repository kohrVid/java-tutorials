/*
 * File: AnotherFileExample.java
 */
import acm.program.*;
import acm.util.*;
import java.io.*;
import java.util.*;

public class AnotherFileExample extends ConsoleProgram{
	private BufferedReader openFile(String prompt) {
		BufferedReader rd = null;
		
		while (rd == null) {
			try {
				String filename = readLine(prompt);
				rd = new BufferedReader(new FileReader(filename));
			} catch (IOException ex) {
				println("Nice try punk, that file doesn't exist.");
			}
		}
		return rd;
	}
	
	public void run() {
		setFont("Courier 10 Pitch-24");
		BufferedReader rd = openFile("Please enter filename: ");
		
		try{
			while (true) {
				String line = rd.readLine();
				if (line == null) break;
				 println("Read line: [" + line + "]");
			}
			rd.close();
		} catch (IOException ex){
			throw new ErrorException(ex);
		}
	}
}