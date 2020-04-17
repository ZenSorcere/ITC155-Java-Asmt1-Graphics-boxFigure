/*  ITC 155 - ASSIGNMENT 1 - GRAPHICS
 * 	Write a program using the Drawing Panel. The window is 220x150. The background
 * 	is yellow. There are two ovals of size 40x40. They are 80 pixels apart, and the
 * 	left oval's top-left corner is located at position (50, 25). There is a red 
 * 	square wose top two corners exactly intersect the center of the two ovals. Lastly,
 * 	there is a black horizontal line through the center of the square.
 * 
 * 	By: Michael Gilson
 * 	Date: 4/17/2020
 ************************************************************************************/

// Import the java.awt library.
import java.awt.*;

public class Figure {

	public static void main(String[] args) {

	// Instantiate the Drawing Panel object, set teh background to Yellow, and 
	//   instantiate the Graphics "paintbrush".	
		DrawingPanel panel = new DrawingPanel(220, 150);
		panel.setBackground(Color.YELLOW);
		Graphics g = panel.getGraphics();
		
	// Call the boxFigure method, with Graphics and starting x, y points.
		boxFigure(g, 50, 25);
		
		
		} // end main method
	
	// Method to draw the boxFigure with required parameters.
	public static void boxFigure(Graphics g, int x, int y) {
		
	// Draw the two blue ovals, based on the provided x,y coordinates.
		g.setColor(Color.BLUE);
		g.fillOval(x, y, 40, 40);
		g.fillOval(x+80, y, 40, 40);
		
	// Draw the red rectangle, based on the provided x,y coordinates.	
		g.setColor(Color.RED);
		g.fillRect(x+20, y+20, 80, 80);
		
	// Draw the black horizontal line, based on the provided x,y coordinates.
		g.setColor(Color.BLACK);
		g.drawLine(x+20, y+60, x+100, y+60);
		
	} // end boxFigure method
	

} // end Figure class
