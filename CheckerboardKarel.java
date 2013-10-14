/*
 * File: CheckerboardKarel.java
 * ----------------------------
 * When you finish writing it, the CheckerboardKarel class should draw
 * a checkerboard using beepers, as described in Assignment 1.  You
 * should make sure that your program works for all of the sample
 * worlds supplied in the starter folder.
 */

import stanford.karel.*;
/*
 * Program will fill in an unknown area of length and width with a beeper on every other
 * square in a checker-board pattern
 */

public class CheckerboardKarel extends SuperKarel {
	public void run(){
		fillARow();
		startNextRow();
		fillARow();
		startNextRow();
	}
//		fillARow();
//		returnToStart();
//		changeRow();
//	


/*
 * Will fill a row with beepers on every other square, assumes Karel is facing right on
 * first column 
 */
	private void fillARow(){
		if (noBeepersPresent()){
			putBeeper();
		} else{
			if(frontIsClear()){
				move();
			}
			if(frontIsClear()){
				move();
			}
		}
		while (frontIsClear()){
			move();
				if (frontIsClear()){
					move();
					putBeeper();
				} else {
					turnAround();
					while (frontIsClear()){
						move();
					}
				}
		}
	}
	
	private void startNextRow(){
		turnRight();
		if (frontIsClear()){
			if (noBeepersPresent()){
				move();
				putBeeper();
				turnRight();
			}else {
				move();
			turnRight();
			move();
			putBeeper();
			}
		}
		
	}
	
	
}