//Matt Knicos
//mknicos@gmail.com

import acm.program.*;
@SuppressWarnings("serial")

//This program takes a list of numbers inputed by the user and will print to the 
// screen the largest, and smallest of those numbers.


public class CompareUntilSentinel extends ConsoleProgram{
	
	//Specifies the value of the sentinel
	private static final int SENTINEL = 0;
	
	private void intro(){
		println("This program finds the largest and smalles of a range of numbers.");
		println("Please enter a number and hit enter");
		println("When you are done entering numbers, enter " + SENTINEL);
	}
	
	private void getNumbers(){
		int initNum = readInt("?");
		int MaxNum = initNum;
		int MinNum = initNum;
		if (initNum == 0){
			println("I'm sorry, the first number connot be " + SENTINEL);	
		}
		int input = initNum;
		while(input != SENTINEL){
			input = readInt("?");
			if (input < MinNum){
				MinNum = input;
			}else if (input > MaxNum){
				MaxNum = input;
			}else if {
				
			}
		}
		//after while loop
	}	
		
}