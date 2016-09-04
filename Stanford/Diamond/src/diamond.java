/**
 * File name: diamond.java
 */
import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class Diamond extends GCompound {
	public void run() {
		private GPolygon createDiamond(double width, double height) {
			GPolygon diamond = new GPolygon();
            diamond.addVertex(-width / 2, 0);
            diamond.addVertex(0, -height/2);
            diamond.addVertex(width / 2, 0);
            diamond.addVertex(0, height /2);
            return diamond;
		}
    }
}