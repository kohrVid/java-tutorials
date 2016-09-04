/*
 * File: MyCanvas.java
 */
import acm.program.*;
import acm.graphics.*;
import acm.gui.*;
import acm.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyCanvas extends GCanvas
			implements ComponentListener{
	public MyCanvas(){
		addComponentListener(this);
		rect = new GRect(BOX_WIDTH, BOX_HEIGHT);
		rect.setFilled(true);
	}
	
	public void update() {
		removeAll();
		add(rect, (getWidth() - BOX_WIDTH) / 2,
				(getHeight() - BOX_HEIGHT)/2);
	}

	
	public void componentResized(ComponentEvent e){ update(); }
	public void componentHidden(ComponentEvent e) {}
	public void componentMoved(ComponentEvent e) {}
	public void componentShown(ComponentEvent e) {}
	
	private final double BOX_WIDTH = 50;
	private final double BOX_HEIGHT = 50;
	private GRect rect;
}
		
		
		
		
		
		
		