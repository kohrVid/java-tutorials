/*
 * File: TableLayoutExample.java
 */
import acm.program.*;
import acm.gui.*;
import java.awt.event.*;
import javax.swing.*;

public class TableLayoutExample extends Program {
	public void init(){
		setLayout(new TableLayout(2,3));
		add(new JButton("button 1"));
		add(new JButton("button 2"));
		add(new JButton("button 3"));
		add(new JButton("button 4"));
		add(new JButton("button 5"));
		add(new JButton("button 6"));
		addActionListeners();
	}
	
	public void actionPerformed(ActionEvent e){
		//Just ignore the buttons\
	}
}