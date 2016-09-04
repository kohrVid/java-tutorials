/*
 * File: GrayImage.java
 */
import acm.program.*;
import acm.graphics.*;

public class GrayImage extends GraphicsProgram {
	public void run(){
		GImage image = new GImage("peppermint.jpg");
		GImage grayImage = createGrayscaleImage(image);
		
		image.scale(1.0);
		add(image, 10, 50);
		
		grayImage.scale(1.0);
		add(grayImage, 480, 50);
		
	}
	
	/* Creates a grayscale version of the original image */
	private GImage createGrayscaleImage(GImage image) {
		//Gets copy of pixel array from image
		int[][] array = image.getPixelArray();
		
		int height = array.length; //number of rows in grid
		int width = array[0].length; // number of columns in a row
		
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				int pixel = array[i][j];
				
				int r = GImage.getRed(pixel);
				int g = GImage.getGreen(pixel);
				int b = GImage.getBlue(pixel);
				
				int xx = computeLuminosity(r, g, b);
				
				array[i][j] = GImage.createRGBPixel(xx, xx, xx);
			}
		}
		return new GImage(array);
	}
	
	/* Calculates the luminosity of a pixel using NTSE formula */
	private int computeLuminosity(int r, int g, int b) {
		return GMath.round(0.299 * r + 0.587 * g + 0.114 * b);
	}
}