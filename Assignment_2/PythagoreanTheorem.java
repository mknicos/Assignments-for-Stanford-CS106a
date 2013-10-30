// Matt Knicos
// mknicos@gmail.com

import acm.program.*;
@SuppressWarnings("serial")
// The Pythagorean Theorem states a^2 + b^2 = c^2  where ^2 means squared. This program will ask the user
// for "a" and "b" and print the the screen the value of "c". Its a dialog program put tested and works
// as well as a console program too.



public class PythagoreanTheorem extends DialogProgram {
	public void run(){
		println("Enter values to compute the PythagoreanTheorem.");			//get values from user
		double a = readDouble("a: ");
		double b = readDouble("b: ");
		
		a *= a;		//square a
		b *= b;		//square b
		double c = a + b;
		c = Math.sqrt(c);
		
		println("c = " + c);	
	}
}