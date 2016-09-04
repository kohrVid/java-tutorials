/*
 * File: GFace.java
 */

// Note: only need the acm.graphics library
// since this is not actually a programme but
// a class that uses graphics
import acm.graphics.*;

/** Defines a compound GFace class */
public class GFace extends GCompound {
	/* Constants specifying feature size as a fraction
	 * of head size
	 */
	private static final double EYE_WIDTH	= 0.25;
	private static final double EYE_HEIGHT	= 0.15; 
	private static final double NOSE_WIDTH	= 0.25;
	private static final double NOSE_HEIGHT = 0.10;
	private static final double MOUTH_WIDTH = 0.50;
	private static final double MOUTH_HEIGHT= 0.03;
	
	/* Private instance variables */
	private GOval head;
	private GOval leftEye, rightEye;
	private GPolygon nose;
	private GRect mouth;
	
	/**
	 * Creates a new GFace object with the specified
	 * dimensions
	 */
	public GFace(double width, double height) {
		head = new GOval(width, height);
		leftEye = new GOval(EYE_WIDTH * width, EYE_HEIGHT * height);
		rightEye = new GOval(EYE_WIDTH * width, EYE_HEIGHT * height);
		nose = createNose(NOSE_WIDTH * width, NOSE_HEIGHT * height);
		mouth = new GRect(MOUTH_WIDTH * width, MOUTH_HEIGHT * height);
		
		add(head, 0, 0);
		add(leftEye, (0.25 * width) - (EYE_WIDTH * width) / 2,
				(0.50 * height) - (EYE_HEIGHT * height) / 2);
		add(rightEye, (0.75 * width) - (EYE_WIDTH * width) / 2,
				(0.50 * height) - (EYE_HEIGHT * height) / 2);
		add(nose, 0.50 * width, (0.75 - (NOSE_HEIGHT/2)) * height);
		add(mouth, (0.50 * width) - (MOUTH_WIDTH * width) / 2,
				(0.88 * height) - (MOUTH_HEIGHT * height) / 2);
	}
	
	
	
	/* Creates a triangle for the nose */
	private GPolygon createNose(double width, double height){
		GPolygon poly = new GPolygon();
		poly.addVertex(0, -height / 2);
		poly.addVertex(width / 2, height / 2);
		poly.addVertex( -width / 2, height / 2);
		return poly;
	}
}


