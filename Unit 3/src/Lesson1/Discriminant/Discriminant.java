/*
 * Discriminant.java
 * Max Rink
 * ICS3U
 * September 25
 * determines how many roots a quadratic fuction has
 */
package Lesson1.Discriminant;

import java.util.Scanner;

public class Discriminant {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//create three integers called a, b and c
		int a, b, c;
		//prompt user for a b and c values
		System.out.print("Enter the value for a: ");
		a = input.nextInt();
		System.out.print("Enter the value for b: ");
		b = input.nextInt();
		System.out.print("Enter the value for c: ");
		c = input.nextInt();
		//calculate the discriminants of the inputs
		a = (b * b) - 4 * a * c;
		
		if (a < 0) {
			System.out.print("no roots");		//if discriminat is less than 0
		} else if (a == 0) {
			System.out.print("one root");		//if discriminat is equal to 0
		} else if (a > 0) {
			System.out.print("two roots");		//if discriminat is greater than 0
		}
		//close the scanner input
		if (input != null) {
			input.close();
		}
	}
}
