/*
 * File: CLickForFace.java
 * ------------------------------------
 * This programme displays a face in every location
 * that the user clicks on. It is an example of an
 * event-driven programme.
 */

import java.awt.event.MouseEvent;

import acm.program.*;

/** Draws a face wherever the user clicks the mouse */
public class ClickForFace extends GraphicsProgram {
	//Note: no run() in this programme.
	
	// init() method is called when programme starts
	public void init() {
		// Most call this method to be able to  get mouse events
		addMouseListeners();
	}
	
	//This method is called every time user clicks mouse
	public void mouseClicked(MouseEvent e) {
		GFace face = new GFace(FACE_DIAM, FACE_DIAM);
		add(face, e.getX(), e.getY());
	}
	
	/* */
	private static final double FACE_DIAM = 30;
}