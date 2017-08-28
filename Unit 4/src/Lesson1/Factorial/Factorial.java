/*
Factorial.java
Max Rink
ICS3U
Nov 5 2015
calculates and prints the fatorial of the users input
*/
package Lesson1.Factorial;

import java.util.Scanner;


public class Factorial {
	public static void main(String[] args){
		//open new instance of the scanner called input with the arguments System.in
		Scanner input = new Scanner(System.in);
		//create empty integers a and i and b with the value of 1
		int a, b=1, i;
		//prompt and store the users input for a number in i
		System.out.print("Please enter a number: ");
		a = input.nextInt();
		//make i equal to a
		i = a;
		do{ //open do while loop
			b *= i; //multiply b byi and store it in b
			i--; //subtract one from i
		}while(i > 0); //close loop when i is less than or equal to 0
		//print the original number and its factorial to the screen
		System.out.print("The factorial of " + a + " is " + b);
		//close the input if it exists
		if(input != null){
			input.close();
		}
	}
}
