/*
 * File: CopyFile.java
 */
import acm.program.*;
import acm.util.*;
import java.io.*;
import java.util.*;

public class CopyFile extends ConsoleProgram{
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
			PrintWriter wr = new PrintWriter(new FileWriter("copy.txt"));

			while (true) {
				String line = rd.readLine();
				if (line == null) break;
				 println("Copying line: [" + line + "]");
				 wr.println(line); //copying file to bin folder
			}
			rd.close();
			wr.close();
		} catch (IOException ex){
			throw new ErrorException(ex);
		}
	}
}