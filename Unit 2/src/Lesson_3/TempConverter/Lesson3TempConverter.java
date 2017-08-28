/*
 * Max Rink
 * ICS3U
 * September 25
 * converts user given farenheit to celsius
 */
package Lesson_3.TempConverter;

import java.util.Scanner;

public class Lesson3TempConverter {
	
	public static void main(String[] args) {
		//initialize new instance of scanner called input
		Scanner input = new Scanner(System.in);
		//create doubles farenheint and celsius
		double farenheit;
		double celsius;
		//prompt user for farenheit value
		System.out.println("Please enter a temperature in fahrenheit: ");
		farenheit = input.nextInt();
		//calculate the value of celsius
		celsius = (farenheit-32);
		celsius *= 0.555555555;
		//print the celsius equivalent of ferenheit to the screen
		System.out.println("The equivalent of " + farenheit + " degrees farenheit in celsius is " + celsius);
		//close scanner input
		if (input != null){
			input.close();
		}
		
	}

}
