/*
 * File: SecondButton.java
 */
import acm.program.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SecondButton extends ConsoleProgram {
	public void init(){
		setFont("Courier 10 Pitch-24");
		
		hiButton = new JButton("Hi");
		add(hiButton, SOUTH);
		addActionListeners();
	}
	
	public void actionPerformed(ActionEvent e) {
		if (hiButton == e.getSource()) {
			println("Hello there");
		}
	}
	
	/*Private instance variable */
	private JButton hiButton;
}