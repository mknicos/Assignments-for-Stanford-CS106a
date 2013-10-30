
// Matt Knicos
// mknicos@gmail.com


import java.awt.Color;
import acm.program.*;
import acm.graphics.*;
/*
 * This program will draw a target such as one would use in Archery. This version will allow
 * you to change only the constant variable radius of the outer target ring, and all other rings
 * will scale in size relative the the outer ring.
 */
@SuppressWarnings("serial")

public class NewTarget extends GraphicsProgram {
	
// Private constants
	
// Size of the outside of the Target
// The inside rings will change based on this since the inside
// rings are relative to the outer target
private static final int OUT_TARGET_RADIUS = 100;

// Radius of Inner Ring as a percent relative to Outer Target Radius
private static final double INSIDE_TARGET_RADIUS = 0.65 ;

//Radius of Bulls eye as a percent relative to Outer Target Radius
private static final double BULLSEYE_RADIUS = 0.3 ;

	public void run(){

	int xMid = (getWidth() / 2);				//Find mid point of screen
	int yMid = (getHeight() / 2);
	double targetX = xMid - OUT_TARGET_RADIUS;
	double targetY = yMid - OUT_TARGET_RADIUS;
	double targetDiam = OUT_TARGET_RADIUS * 2;  //Compute Outer Target Diameter for ease of reading in program
		
	GOval outterCircle = new GOval(targetX, targetY, targetDiam, targetDiam);
	outterCircle.setFilled(true);
	outterCircle.setColor(Color.RED);
	
	//Determine x,y and size of inner white ring
	double insideRadius = INSIDE_TARGET_RADIUS * OUT_TARGET_RADIUS;
	double insideX = xMid - insideRadius;
	double insideY = yMid - insideRadius;
	double innerDiam = 2 * insideRadius;
			
	GOval innerCircle  = new GOval(insideX, insideY, innerDiam, innerDiam);
	innerCircle.setFilled(true);
	innerCircle.setColor(Color.WHITE);
	
	//Determine x,y, and size of bulls eye
	double bullsRadius = BULLSEYE_RADIUS * OUT_TARGET_RADIUS;
	double bullsX = xMid - bullsRadius;
	double bullsY = yMid - bullsRadius;
	double bullsDiam = 2 * bullsRadius;
			
	GOval bullsEye = new GOval(bullsX, bullsY, bullsDiam, bullsDiam);
	bullsEye.setFilled(true);
	bullsEye.setColor(Color.RED);
			
			
	add(outterCircle);
	add(innerCircle);
	add(bullsEye);
	
		}

}
	