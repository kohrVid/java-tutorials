/*
 * File: MouseTracker.java
 */
import java.awt.event.MouseEvent;

import acm.program.*;
import acm.graphics.*;

public class MouseTracker extends GraphicsProgram {
	public void run() {
		label = new GLabel("");
		label.setFont("Liberation Serif-16");
		add(label, 50, 50);
		
		//Must call the method to be able to get mouse events
		addMouseListeners();
	}
	//This method is called every time the mouse moves
	public void mouseMoved(MouseEvent e) {
		label.setLabel("Mouse: (" + e.getX() + ", " + e.getY() + ")");
	}
	
	/* Private instance variable */
	private GLabel label;
}