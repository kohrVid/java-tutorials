/*
 * File: InteractiveDrawFace.java
 */

import acm.program.*;
import acm.graphics.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class InteractiveDrawFace extends GraphicsProgram {
	
	//init() method is called when programme starts
	public void init(){
		//Button to clear display
		add(new JButton("Clear"), SOUTH);
		
		//Check box to display front or back of face
		checkbox = new JCheckBox("Front");
		checkbox.setSelected(true);
		add(checkbox, SOUTH);
		
		initRadioButtons();
		
		initColourChooser();
		
		//Must all this method to be able to get mouse events
		addMouseListeners();
		
		//Must call this method to get button press events
		addActionListeners();	

	}

	// Called every time user clicks mouse
	public void mouseClicked(MouseEvent e){
		GObject obj;
		double diam = getDiamSize();
		if (checkbox.isSelected()) {
			obj = new GFace(diam, diam);
		} else {
			obj = new GOval(diam, diam);
		}
		obj.setColor(getCurrentColour());
		add(obj, e.getX(), e.getY());
	}
	
	public void actionPerformed(ActionEvent e){
		if (e.getActionCommand().equals("Clear")) {
			removeAll(); //Clears the canvas
		}
	}

	private void initRadioButtons(){
		//Radio button group for size
		ButtonGroup sizeBG = new ButtonGroup();
		smallRB = new JRadioButton("Small");
		medRB = new JRadioButton("Medium");
		largeRB = new JRadioButton("Large");
		
		//Add all radio buttons to button group
		sizeBG.add(smallRB);
		sizeBG.add(medRB);
		sizeBG.add(largeRB);
		
		//Add all radio button to control bar
		add(smallRB, SOUTH);
		add(medRB, SOUTH);
		add(largeRB, SOUTH);
	}
	
	private void initColourChooser(){
		//Create combo box with colour choices
		pickColour = new JComboBox();
		pickColour.addItem("Black");
		pickColour.addItem("Blue");
		pickColour.addItem("Green");
		pickColour.addItem("Red");
		
		//Don't allow user to type in a colour
		pickColour.setEditable(false);
		
		//Set initial colour selection
		pickColour.setSelectedItem("Black");
		
		//Create label (with separation spaces) for combo box
		add(new JLabel("	Colour:"), SOUTH);
		
		//Add combo box to control bar
		add(pickColour, SOUTH);
		
	}
	
	// Returns diameter size corresponding to radio button choice
	private double getDiamSize(){
		double size = 0;
		if (smallRB.isSelected()) {
			size = SMALL_DIAM;
		} else if (medRB.isSelected()) {
			size = MED_DIAM;
		} else if (largeRB.isSelected()) {
			size = LARGE_DIAM;
		}
		return size;
	}
	
	//Return Colour object corresponding to combo box
	private Color getCurrentColour(){
		String name = (String) pickColour.getSelectedItem();
		if(name.equals("Blue")){
			return Color.BLUE;
		} else if (name.equals("Green")) {
			return Color.GREEN;
		} else if (name.equals("Red")) {
			return Color.RED;
		} else return Color.BLACK;
	}

	/* Private constants */
	private static final double SMALL_DIAM = 20;
	private static final double MED_DIAM = 40;
	private static final double LARGE_DIAM = 60;
	
	/* Private instance variables */
	// Use instance variables to keep track of interactors whose
	// "state" you need to check as your program runs
	private JCheckBox checkbox;
	private JRadioButton smallRB;
	private JRadioButton medRB;
	private JRadioButton largeRB;
	private JComboBox pickColour;
}