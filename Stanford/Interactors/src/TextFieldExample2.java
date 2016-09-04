/*
 * File: TextFieldExample2.java
 */
import acm.program.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/** this class displays a greeting whenever a name is entered*/
public class TextFieldExample2 extends ConsoleProgram {
	public void init(){
		setFont("Courier 10 Pitch-24");
		nameField = new JTextField(10);
		nameField.setActionCommand("name");
		add(new JLabel("Name"), SOUTH);
		add(nameField, SOUTH);
		nameField.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("name")){
			println("Hello, " + nameField.getText());
		}
	}
	
	/* Private instance variables */
	private JTextField nameField;
}