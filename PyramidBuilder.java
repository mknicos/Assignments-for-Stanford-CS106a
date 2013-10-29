//	Matt Knicos
//	mknicos@gmail.com

import acm.program.*;
import acm.graphics.*;

@SuppressWarnings("serial")

/*
 * This Program will build a pyramid in on the screen, with the number of 
 * bricks decreasing by one in each row. The pyramid will be centered at the bottom of the screen.
 */



public class PyramidBuilder extends GraphicsProgram {

	// Private constants
	
	// Width of each brick in pixels
private static final int BRICK_WIDTH = 30;

	// Height of each brick in pixels
private static final int BRICK_HEIGHT = 12;

	// Number of bricks in the bottom row
private static final int BRICK_IN_BASE = 14;

public void run(){

// Find the starting x,y of the first row of bricks
	int xMid = getWidth() / 2;
	int xStart = xMid - ((BRICK_WIDTH * BRICK_IN_BASE) / 2);
	int yStart = (getHeight() - BRICK_HEIGHT) - 2; // - 2 Allows bottom line of lowest row of bricks to be visible
	
// Build one row of bricks
	int bricksInRow = BRICK_IN_BASE;
	for (int i = 0; i < bricksInRow; i++){
		GRect brick = new GRect(xStart, yStart, BRICK_WIDTH, BRICK_HEIGHT);	
		add(brick);
		xStart+=BRICK_WIDTH;
	}
	
}

}
