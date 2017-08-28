/*
 * Stages.java
 * Max Rink
 * ICS3U
 * September 25
 * displays your stage in life based on inputed age
 */
package Lesson1.Stages;

import java.util.Scanner;

public class Stages {

	public static void main(String[] args) {
		// initialize new scanner called input
		Scanner input = new Scanner(System.in);
		// create integer variable called age
		int age;
		// prompt user for age
		System.out.print("How old are you: ");
		age = input.nextInt();

		if (age > 18) { // if age is above 18
			System.out.print("adult"); // print adult
		} else {
			if (age <= 18) {
				if (age > 12) { // if age is above 12
					System.out.print("teen"); // print teen
				} else {
					if (age <= 5) { // if age is less than or equal to 5
						System.out.print("toddler"); // print toddler
					} else {
						if (age <= 10) { // if age less than or equal to 10
							System.out.print("child"); // print child
						} else {
							if (age <= 12) { // if age less than or equal to 12
								System.out.print("preteen"); // print preteen
							}
						}
					}
				}
			}
		}
	}
}
