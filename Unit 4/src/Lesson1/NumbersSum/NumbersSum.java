/*
NumberSum.java
Max Rink
ICS3U
Nov 5 2015
sums all of the integers under the users input
*/
package Lesson1.NumbersSum;

import java.util.Scanner;

public class NumbersSum {
	public static void main(String[] args) {
		//create new instance of the scanner called input with the arguments System.in
		Scanner input = new Scanner(System.in);
		//create empty integers i and b
		int i, b;
		//create integer a with a value of 1
		int a = 1;
		//prompt and store user input for and integer in i
		System.out.print("Please enter an integer: ");
		i = input.nextInt();
		//set b equal to 0
		b = 0;
		
		do { //open do while loop
			System.out.println(a); //print a to the screen
			a++; //add one to a
			b += a; //add a to b
		} while (a < i); //close loop when a is greater than or equal to input
		
		System.out.print(b); //display the sum to the screen
		
		if (input != null) { //close the input if it exists
			input.close();
		}
	}
}
