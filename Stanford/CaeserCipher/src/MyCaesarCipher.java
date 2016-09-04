/*
 * File: MyCaesarCipher.java
 */
import acm.program.*;

public class MyCaesarCipher extends ConsoleProgram {
	
	private char encryptChar(char ch, int key){
		if (Character.isUpperCase(ch)) {
			return ((char) ('A' + ((ch - 'A' + key) % 26)));
		} else if (Character.isLowerCase(ch)) {
			return ((char) ('a' + ((ch - 'a' + key) % 26)));
		}
		return ch;
	}
	
	private String encryptCaesar(String str, int key)  {
		if (key < 0) {
			key = 26 - (-key % 26);
		}
		String result = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			result += encryptChar(ch, key);
		}
		return result;
	}
	
	public void run() {
		println("This program uses a Caesar cipher for encryption.");
		int key = readInt("Enter encryption key: ");
		String plaintext = readLine("Plaintext: ");
		String ciphertext = encryptCaesar(plaintext, key);
		println("Ciphertext: " + ciphertext);
		//This is from lexture 13 of the Stanford series. I don't understand why newplain is here.
		String newplain = encryptCaesar(ciphertext, -key);
		println("newplain: " + newplain);		
	}
}