/*
 * File: Palindrome.java
 */
import acm.program.*;

public class Palindrome extends ConsoleProgram {
	// Return true if str is a palindrome, false otherwise.
	private boolean isPalindrome(String str) {
		for(int i = 0; i < str.length() / 2; i++) {
			if (str.charAt(i) !=
					str.charAt(str.length() - (i + 1))) {
				return false;
			}
		}
		return true;
	}
	
	public void run() {
		String str = readLine("Enter String: ");
		println("Is a palindrome: " + isPalindrome(str));
	}
}