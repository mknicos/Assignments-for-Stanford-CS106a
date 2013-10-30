// Matt Knicos
// mknicos@gmail.com

import acm.graphics.*;
import acm.program.*;

/*	Stanford's CS106A Assignment 2, Exercise 3
 * 
 * This program will create for rectangle tiles, with spacing, size, and words
 * inside them all changeable through constant variables. The tiles will be centered 
 * on the screen, more exactly, the space between the four tiles will be the center.
 */

@SuppressWarnings("serial")
public class FourTiles extends GraphicsProgram {

// Private Constants
	
// Height and Width of Tiles
private static final double TILE_WIDTH = 200;
private static final double TILE_HEIGHT = 100;

// Space between the tiles, both the vertical distance between the two tiles on
// top of each other, and the horizontal distance between the tiles next to each other
private static final double TILE_SPACE= 50;

// String that will print inside Tiles
private static final String TILE_LABEL = "CS106A";


	public void run(){
		double centerX = getWidth() / 2;	//Find center of screen
		double centerY = getHeight() / 2;
		
		//Find X value of tiles, since the two tiles on the left and two on the right
		// will have the same X value as each other, they can be shared in one variable
		double leftTilesX = centerX - (TILE_SPACE / 2) - TILE_WIDTH;
		double rightTilesX = centerX + (TILE_SPACE / 2);
		
		// Y value of tiles, since the two tiles on top, and the two on bottom will
		// have the same Y value as each other, they can share one variable.
		double topTilesY = centerY - (TILE_SPACE / 2) - TILE_HEIGHT;
		double bottomTilesY = centerY + (TILE_SPACE / 2);
		
		// Add the 4 tiles with labels centered in them to the screen using the creatTile method
		createTile(leftTilesX, topTilesY, TILE_LABEL);  //upper left tile
		createTile(leftTilesX, bottomTilesY, TILE_LABEL);	// lower left tile
		createTile(rightTilesX, topTilesY, TILE_LABEL);	//upper right tile
		createTile(rightTilesX, bottomTilesY, TILE_LABEL); //lower right tile
		
		

	}
	
	
	
	// A method that returns a non-filled rectangle at point x,y with a label centered
	// inside of it which displays what is in the "name"
	
	private void createTile(double tileX, double tileY, String name){
		GRect tile = new GRect (tileX, tileY, TILE_WIDTH, TILE_HEIGHT);
		GLabel text = new GLabel(name);
		add(tile);
		
		//compute coordinates for centering the GLabel text
		double labelX = tileX + (TILE_WIDTH / 2) - (text.getWidth() / 2);
		double labelY = tileY + (TILE_HEIGHT / 2) + (text.getAscent() / 2);	
		text.setLocation(labelX, labelY);
		add(text);
	}
}