/**
 * File: ReplaceString.java
 */
import acm.program.*;
import acm.graphics.*;

public class ReplaceString extends ConsoleProgram {
	private String replaceFirstOccurrence (String str,
			String orig,
			String repl) {
        int index = str.indexOf(orig);
        if (index != -1) {
                str = str.substring(0, index) 
                		+ repl
                		+ str.substring(index+orig.length());
        }
        return str;
	}
	private String Stanfordise(String str) {
		str = replaceFirstOccurrence( str, "florence moore" , "flomo");
        str = replaceFirstOccurrence( str, "memorial church" , "memchu");
        str = replaceFirstOccurrence( str, "computer science" , "CS");
        str = replaceFirstOccurrence( str, "psychology" , "psych");
        str = replaceFirstOccurrence( str, "economics" , "econ");
        str = replaceFirstOccurrence( str, "most fun class" , "CS106A");
        return str;
	}
	public void run() {
       	setFont("Liberation Serif-24");
       	while (true) {
       		String line = readLine("Enter line in \"Stanfordise\": ");
       		if (line.equals("")) break;
       		println("At Stanford, one says: " + Stanfordise(line));
       	}
       	println("Thanks you for visiting Stanford.");
	}
}