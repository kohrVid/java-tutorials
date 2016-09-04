/*
 * File: GraphicNumbers.java
 */
import acm.graphics.*;
import acm.program.*;
import java.util.*;
import java.awt.event.*;

public class GraphicNumbers extends GraphicsProgram {
	
	private static final double START_X = 50;
	private static final double START_Y = 100;
	
	public void run(){
		addMouseListeners();
	}
	
	public void mouseClicked(MouseEvent e) {
		//Create a new label
		GLabel lab = new GLabel("#" + labels.size());
		lab.setFont("Courier 10 Pitch-18");
		
		//Move all existing labels down one row
		double dy = lab.getHeight();
		for (int i = 0; i < labels.size(); i++) {
			labels.get(i).move(0, dy);
		}
		
		add(lab, START_X, START_Y); //Add new label to canvas
		labels.add(lab); //Ad new label to the ArrayList
	}
	
	private ArrayList<GLabel> labels = new ArrayList<GLabel>();
}