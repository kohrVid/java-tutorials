/* 
File: FilledCircle.java
from lecture 7 of Stanford's Programming Methodology playlist
I don't think this is supposed to work
*/

import acm.graphics.*;
import acm.program.*;
import java.awt.Color;

public class FilledCircle extends GraphicsProgram{
	public void run(){
		filledCircle(10,10,2, Color.RED);
		add(circle);
	}
	
	private GOval filledCircle(int x,
								int y,
								int r,
								Color color) {
		GOval circle = new GOval(x-r, y-r, 2*r, 2*r);
		circle.setFilled(true);
		circle.setColor(color);
		return circle;
	}


}