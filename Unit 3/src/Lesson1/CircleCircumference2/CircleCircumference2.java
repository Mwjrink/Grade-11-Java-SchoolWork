/*
 * CircleCircumference2.java
 * Max Rink
 * ICS3U
 * September 25
 * Calculates circle circumference and rejects negative values
 */
package Lesson1.CircleCircumference2;

import java.util.Scanner;

public class CircleCircumference2 {

	public static void main(String[] args) {
		//initialize new instance of scanner input
		Scanner input = new Scanner(System.in);
		//create constant double called twopi with value 2*pi
		final double twopi = 6.28318530718;
		//create two doubles radius and circumference
		double radius;
		double circumference;
		//prompt user for an integer radii value
		System.out.println("Please enter the radius of a circle: ");
		radius = input.nextInt();
		//do not perform calculations if input is negative
		if (radius < 0) {
			System.out.print("negative radii are illegal");
		} else {//else calculate the circumference and display it to the screen
			circumference = twopi * radius;

			System.out.println("The Circumference of a circle with a radius of " + radius + " is " + circumference);
		}
		//close scanner input
		if (input != null) {
			input.close();
		}

	}
}
