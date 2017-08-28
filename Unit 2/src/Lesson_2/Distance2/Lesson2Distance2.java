/*
 * Max Rink
 * ICS3U
 * September 25
 * prompts user for 3 distances then adds them and displays it to the screen
 */
package Lesson_2.Distance2;

import java.util.Scanner;

public class Lesson2Distance2 {
	
	public static void main(String[] args) {
		//create three doubles called first second third
		double first, second, third;
		//create double called total
		double total;
		//initialize new instance of scanner
		Scanner input = new Scanner(System.in);
		//prompt user for three integer values
		System.out.println("Please enter the distance of the first race segement in km: ");
		first = input.nextDouble();
		System.out.println("Please enter the distance of the second race segement in km: ");
		second = input.nextDouble();
		System.out.println("Please enter the distance of the third race segement in km: ");
		third = input.nextDouble();
		//add inputs together
		total = first+second+third;
		//print inputs to the screen
		System.out.print("The first segment is " + first + "km, the second is " + second + " km, and the third is " + third + " km. \nThe total distance of the race is " + total);
		//close scanner
		if(input != null) {
			input.close();
		}
		
	}
	
}
