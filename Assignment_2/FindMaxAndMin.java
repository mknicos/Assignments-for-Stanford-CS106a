//Matt Knicos
//mknicos@gmail.com

import acm.program.*;
@SuppressWarnings("serial")

//This program takes a list of numbers inputed by the user and will print to the 
// screen the largest, and smallest of those numbers.


public class CompareUntilSentinel extends ConsoleProgram{
	
	//Specifies the value of the sentinel
	private static final int SENTINEL = 0;
	
	// Tell the user about the program
	private void intro(){
		println("This program finds the largest and smalles of a range of numbers.");
		println("Please enter a number and hit enter");
		println("When you are done entering numbers, enter " + SENTINEL);
	}
	
	//Allows input of numbers, and a Sentinel to break the program
	private void getNumbers(){
		int initNum = readInt("?");
		int maxNum = initNum;
		int minNum = initNum;
		while (initNum == SENTINEL){
			println("I'm sorry, the first number connot be " + SENTINEL);
			initNum = readInt("?");
		}
		int input = initNum;
		while(true){
			input = readInt("?");
			if (input == SENTINEL){
				break;
			} else if (input < minNum || input == minNum){
				minNum = input;
			} else if (input > maxNum || input == maxNum){
				maxNum = input;
			} else ;
		}
		println("The smallest number is: " + minNum);
		println("The largest number is: " + maxNum);
		
	}
	
	public void run(){
		intro();
		getNumbers();
	}
}