/*
 * Max Rink
 * ICS3U
 * September 25
 * prompts user for a 
 */
package Lesson_3.CircleCircumference;

import java.util.Scanner;

public class Lesson3CircleCircumference {
	
	public static void main(String[] args) {
		//initialize new instance of the scanner called input
		Scanner input = new Scanner(System.in);
		//create a constant double called twopi with the value of 2*pi
		final double twopi = 6.28318530718;
		//create two double variables called radius and circumference
		double radius;
		double circumference;
		//prompt user for the value of a radius
		System.out.println("Please enter the radius of a circle: ");
		radius = input.nextInt();
		//calculate the value of circumference
		circumference = twopi*radius;
		//print circumference to the screen
		System.out.println("The Circumference of a circle with a radius of " + radius + " is " + circumference);
		
		//close scanner input
		if (input != null){
			input.close();
		}
		
	}
}
