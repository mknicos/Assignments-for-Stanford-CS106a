
//	Matt Knicos
//	mknicos@gmail.com


import java.awt.Color;
import acm.program.*;
import acm.graphics.*;
/*
 * This program will draw a target such as one would use in Archery. It is adapted
 * and modified from a previous exercise, with the modifications being that
 * it will be centered on the screen, and have adjustable sizes of each ring with
 * constant variables
 */
@SuppressWarnings("serial")

public class NewTarget extends GraphicsProgram {
	
// Private constants
	
// Size of the outside of the Target
// The inside rings will change based on this since the inside
// rings are relative to the outer target
private static final int OUT_TARGET_RADIUS = 72;

// Radius of White Ring relative to Outer Target Radius
private static final double INSIDE_TARGET_RADIUS = 46.8 ;

//Radius of Bulls eye relative to Outer Target Radius
private static final double BULLSEYE_RADIUS = 21.6 ;

	public void run(){

	int xMid = (getWidth() / 2);
	int yMid = (getHeight() / 2);
	double targetX = xMid - OUT_TARGET_RADIUS;
	double targetY = yMid - OUT_TARGET_RADIUS;
	double targetDiam = OUT_TARGET_RADIUS * 2;  //Compute Outer Target Diameter for ease of reading in program
		
	GOval outterCircle = new GOval(targetX, targetY, targetDiam, targetDiam);
	outterCircle.setFilled(true);
	outterCircle.setColor(Color.RED);
	
	//Determine x,y and size of inner white ring
	double insideX = xMid - INSIDE_TARGET_RADIUS;
	double insideY = yMid - INSIDE_TARGET_RADIUS;
	double innerDiam = 2 * INSIDE_TARGET_RADIUS;
			
	GOval innerCircle  = new GOval(insideX, insideY, innerDiam, innerDiam);
	innerCircle.setFilled(true);
	innerCircle.setColor(Color.WHITE);
	
	//Determine x,y, and size of bulls eye
	double bullsX = xMid - BULLSEYE_RADIUS;
	double bullsY = yMid - BULLSEYE_RADIUS;
	double bullsDiam = 2 * BULLSEYE_RADIUS;
			
	GOval bullsEye = new GOval(bullsX, bullsY, bullsDiam, bullsDiam);
	bullsEye.setFilled(true);
	bullsEye.setColor(Color.RED);
			
			
	add(outterCircle);
	add(innerCircle);
	add(bullsEye);
	
		}

}
	