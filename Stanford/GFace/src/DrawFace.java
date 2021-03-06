/*
 * File name: DrawFace.java
 */

import acm.program.*;

public class DrawFace extends GraphicsProgram {
	/** Width of face */
	private static final int FACE_WIDTH = 100;
	
	/** Height of face */
	private static final int FACE_HEIGHT = 200;
	
	public void run() {
		GFace face = new GFace(FACE_WIDTH, FACE_HEIGHT);
		add(face,
				(getWidth() - FACE_WIDTH) / 2,
				(getHeight() - FACE_HEIGHT) / 2);
	}
}