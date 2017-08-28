/*
 * TimeConverter.java
 * Max Rink
 * ICS3U
 * Nov 5 2015
 * converts a number grade to a letter grade
 */
package Lesson1.TimeConverter;

import java.util.Scanner;

public class TimeConverter {
	public static double hoursToMin(double i) {return i * 60;}

	public static double daysToHours(double i) {return i * 24;}

	public static double minToHours(double i) {return i / 60;}

	public static double hoursToDays(double i) {return i / 24;}
	//client code to test class
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String con;
		double in;

		System.out.print("Please choose between converting from hours to minutes, days to hours, minutes to hours, or hours to days: ");
		con = input.nextLine();
		con.toLowerCase();
		if (con.contains("hours to minutes")) {
			System.out.print("enter your number for conversion: ");
			in = input.nextDouble();
			System.out.print(in + " hours in minutes is equal to " + hoursToMin(in));
			
		} else if (con.contains("days to hours")) {
			System.out.print("enter your number for conversion: ");
			in = input.nextDouble();
			System.out.print(in + " days in Hours is equal to " + daysToHours(in));
			
		} else if (con.contains("minutes to hours")) {
			System.out.print("enter your number for conversion: ");
			in = input.nextDouble();
			System.out.print(in + " minutes in hours is equal to " + minToHours(in));
			
		} else if (con.contains("hours to days")) {
			System.out.print("enter your number for conversion: ");
			in = input.nextDouble();
			System.out.print(in + " hours in days is equal to " + hoursToDays(in));
			
		} else {
			System.out.print("invalid conversion type");
		}

		if (input != null) {
			input.close();
		}
	}
}
