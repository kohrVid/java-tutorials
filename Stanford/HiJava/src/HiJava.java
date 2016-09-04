/*
 * File: HiJava.java
 * ---------------------
 * This class is a blank one that you can change at will. Remember, if you change
 * the class name, you'll need to change the filename so that it matches.
 * Then you can extend GraphicsProgram, ConsoleProgram, or DialogProgram as you like.
 */

import java.awt.Color;

import acm.graphics.*;
import acm.program.*;

public class HiJava extends GraphicsProgram {
	public void run() {
		GLabel label = new GLabel("Hi, yall!", 100, 75);
		label.setFont("SansSerif-36");
		label.setColor(Color.RED);
		add(label);
	}
}

