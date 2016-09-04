/*
 * File: FirstButton.java
 */

import acm.program.*;
import java.awt.event.*;
import javax.swing.*;

public class FirstButton extends ConsoleProgram {
	public void init() {
		setFont("Courier 10 Pitch-24");
	
		add(new JButton("Hi"), SOUTH);
		addActionListeners();
	}
	
	public void actionPerformed(ActionEvent e){
		String cmd = e.getActionCommand();
		if (cmd.equals("Hi")) {
			println("Hello there");
		}
	}
	
	
	//No instance variable needed
}
