/*
Prompter.java
Max Rink
ICS3U
Nov 5 2015
Prompts user for number inbetweenuser specified maximums and minimums
*/
package Lesson1.Prompter;

import java.util.Scanner;


public class Prompter {
	
	public static void main(String[] args) {
		//create new instance of the object scanner called input with the arguments System.in
		Scanner input = new Scanner(System.in);
		//create empty integers called min, max and in
		int min, max, in;
		//prompt the user for minimum and maximum values and store them in min and max respectively
		System.out.print("Please enter a minimum value: ");
		min = input.nextInt();
		System.out.print("Please enter a maximum value: ");
		max = input.nextInt();
		
		do{ //open do while loop
			System.out.print("Please enter a number between " + min + " and " + max + ": "); //prompt user for a number and store it in in
			in = input.nextInt();
		}while(!(in >= min && in <= max)); //end loop when the number is between the minimum and maximum values
		
		if(input != null){ //close scanner input if it exists
			input.close();
		}
	}

}
