/*
OddSum.java
Max Rink
ICS3U
Nov 5 2015
sums all of the odd integers under the users input
*/
package Lesson1.OddSum;

import java.util.Scanner;


public class OddSum {
	
	public static void main(String[] args) {
		//create new instance of scanner called input with the arguments System.in
		Scanner input = new Scanner(System.in);
		//create empty variables i and b
		int i, b;
		//create variable a with value of 1 
		int a = 1;
		//prompt and store the users input for and integer in i
		System.out.print("Please enter an integer: ");
		i = input.nextInt();
		//set b equal to 0
		b = 0;
		do { //open do while loop
			b += a; //add a to b
			a+=2; //add 2 to a
		} while (a < i); //end loop if a is greater than or equal to input
		//print the variable b
		System.out.print(b);
		
		if (input != null) { //close input if it exists
			input.close();
		}
	}
}
