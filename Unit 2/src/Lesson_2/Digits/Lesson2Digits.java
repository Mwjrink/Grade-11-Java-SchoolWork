/*
 * Max Rink
 * ICS3U
 * September 25
 * prompts the user for a number then separates out and displays the tens and ones place of the number
 */
package Lesson_2.Digits;

//import scanner in order to use input
import java.util.Scanner;

public class Lesson2Digits {
	
	public static void main(String[] args) {
		//create three empty integer variables
		int number, tens, ones;
		//initialize a new instance of the scanner called input
		Scanner input = new Scanner(System.in);
		//prompt user for an integer
		System.out.println("Please enter a two digit number: ");
		number = input.nextInt();
		//calculate the tens place and ones place of the input
		tens = number/10;
		ones = number%10;
		//display resultant integers to the screen
		System.out.println("The tens and ones column of the number " + number + " are " + tens + " and " + ones + " respectively");
		//close the input
		if (input != null){
			input.close();
		}
	}//close main method
	
}
