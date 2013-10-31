//Matt Knicos
//mknicos@gmail.com

import acm.program.*;
@SuppressWarnings("serial")

/*
 * This program will perform the sequence set forth by Douglas Hofstadter. The program
 * will ask for a number from the user, and then based on that number will perform a number of 
 * steps until the number is 1.
 */
public class HailstoneSequence extends ConsoleProgram{
	
	public void run(){
		intro();
		int initNum = readInt("Enter an Integer you would like to start at: ");
		int counter = 0;
		int num = 0;
		while (num != 1){
			if (isEven(initNum)){
				num = operationEven(initNum);
				println(initNum + " is even, so half is: " + num);
				initNum = num;
			}else { 
				num = operationOdd(initNum);
				println(initNum + " is odd, so 3n + 1 is: " + num);
				initNum = num;
			
			}
			counter ++;
		}
		println ("We have reached 1, it took " + counter + " computations");
		
	}
	
	private void intro(){
		//ask user for input and explain program
		println("This program will perform the hailstone sequence");
		println("You pick the number to start with and if it is even: ");
		println("It will be divided by 2");
		println("If it is odd: ");
		println("It will be multiplied by 3, then added to 1");
		println("The sequence will only stop when the result is the integer 1");
	}
	
	
	// This method will be called if the result is an odd number
	private int operationOdd(int result){
		return (result * 3) + 1;
		
		
		
	}
	
	// This method will be called if the result is an even number
	private int operationEven(int result){
		return result / 2;
	}
	
	// This method will determine if the result is even (true)
	private boolean isEven(int result){
		if(result % 2 == 0){
			return true;
		}else return false;
		
		
	}
	
}