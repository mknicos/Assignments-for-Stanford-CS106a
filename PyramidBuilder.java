//	Matt Knicos
//	mkncios@gmail.com

import acm.program.*;
import acm.graphics.*;

@SuppressWarnings("serial")

/*
 * This Program will build a pyramid in on the screen, with the number of 
 * bricks decreasing by one in each row. The pyramid will be centered at the bottom of the screen.
 */



public class PyramidBuilder extends GraphicsProgram {
	public void run(){
		double x = (getWidth() - BRICK_WIDTH) / 2;
		double y = getHeight() - BRICK_HEIGHT;
		GRect brick = new GRect (x,y, BRICK_WIDTH, BRICK_HEIGHT);
		add(brick);
	}

private static final int BRICK_WIDTH = 30;
private static final int BRICK_HEIGHT = 12;
private static final int BRICK_IN_BASE = 14;
	
}
