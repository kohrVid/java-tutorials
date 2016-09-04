/*
 * File: DragObjects.java
 */
import acm.graphics.*;
import acm.program.*;
import acm.util.RandomGenerator;
import java.awt.event.*;

/** 
 * This class displays a mouse-draggable 
 * rectangle and oval
 */
public class DragObjects extends GraphicsProgram {
	// Initialises the programme
	public void init() {
		GRect rect = new GRect(100, 100, 150, 100);
		rect.setFilled(true);
		add(rect);
		GOval oval = new GOval(90, 90, 190, 100);
		oval.setFilled(true);
		add(oval);
		addMouseListeners();
		addKeyListeners();
	}
	
	// Called on mouse press to record co-ordinates
	// of the click
	public void mousePressed (MouseEvent e) {
		// GPoint has X and Y co-ordinate
		last = new GPoint(e.getPoint());
		gobj = getElementAt(last);
		gobj.sendToFront();
		
	}
	
	//Called on mouse drag to reposition the object
	public void mouseDragged (MouseEvent e) {
		if (gobj != null) {
			gobj.move(e.getX() - last.getX(), e.getY() - last.getY());
			last = new GPoint(e.getPoint());
		}
	}
	
	//Change value of last object dragged
	public void keyTyped(KeyEvent e) {
		if (gobj != null) {
			gobj.setColor(rgen.nextColor());
		}
	}
	
	/* Private instance variables */
	private GObject gobj; /* Object being dragged */
	private GPoint last; /* The last mouse position */
	private RandomGenerator rgen = RandomGenerator.getInstance();

}
