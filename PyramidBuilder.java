//	Matt Knicos
//	mknicos@gmail.com

import acm.program.*;
import acm.graphics.*;
import java.awt.*;

@SuppressWarnings({ "serial", "unused" })

/*
 * This Program will build a pyramid in on the screen, with the number of 
 * bricks decreasing by one in each row. The pyramid will be centered at the bottom of the screen.
 * 
 * I would like to add user input capabilities into the code in the future, and potentially break things
 * down into seperate methods, although I do believe the code is fairly concise and clear without them.
 *
 */



public class PyramidBuilder extends GraphicsProgram {

	// Private Constants
	
	// Width of each brick in pixels
private static final int BRICK_WIDTH = 30;

	// Height of each brick in pixels
private static final int BRICK_HEIGHT = 12;

	// Number of bricks in the bottom row
private static final int BRICK_IN_BASE = 25;

public void run(){

// Find the starting x,y of the first row of bricks
	int xMid = getWidth() / 2;
	int xStart = xMid - ((BRICK_WIDTH * BRICK_IN_BASE) / 2);
	int yStart = (getHeight() - BRICK_HEIGHT) - 2; // - 2 Allows bottom line of lowest row of bricks to be visible
	
// I started with just building one row of bricks. I ensured
// that it works when i change the Constant Variables
//	int bricksInRow = BRICK_IN_BASE;
//	for (int i = 0; i < bricksInRow; i++){
//			GRect brick = new GRect(xStart, yStart, BRICK_WIDTH, BRICK_HEIGHT);	
//			add(brick);
//			xStart+=BRICK_WIDTH;
//		}

/*
* Then the problem is just trying to use a for loop to repeat the same
* row building technique moving up the Y value on the screen by one brick height
* unit, and decreasing the number of bricks by one each time.. AKA, a for loop
* inside of a for loop
* */


	int bricksInRow = BRICK_IN_BASE;
	for (int row = bricksInRow; row > 0; row --){
		for (int i = 0; i < bricksInRow; i++){
			GRect brick = new GRect(xStart, yStart, BRICK_WIDTH, BRICK_HEIGHT);	
			add(brick);
			xStart+=BRICK_WIDTH;
		}

// Had a lot of interesting patterns forming on the screen while changing the values of
// this section. Definitely took some tweaking. Biggest mistake was thinking that
// the xStart would reset itself after each row. The puzzle was complete when I realized
// I would have to compute the new rows beginning X location each time, and couldn't build off
// of where the last row left off.
	bricksInRow -= 1;
	yStart -= BRICK_HEIGHT;
	xStart = xMid - ((BRICK_WIDTH * bricksInRow) / 2);
	}
}
}
