/*
 * PerfectSquare.java
 * Max Rink
 * ICS3U
 * 25 October
 * determines whether input is a perfect square or not
 */

package Lesson2.PerfectSquare;

import java.util.Scanner;

public class PerfectSquare {
	
	public static void main(String[] args) {
		//initialize new instance of Scanner called input
		Scanner input = new Scanner(System.in);
		//create 2 doubles called in and b
		double in, b;
		//prompt user for integer
		System.out.print("Please enter a number: ");
		in = input.nextInt();
		//calculate square root of input
		b = Math.sqrt(in);
		//truncate the decimal places of input
		b = (int)b;
		//square input
		b *= b;
		//if b is equal to original input number is perfect square
		if(in == b){
			System.out.print("Your number is a perfect square");
		} else {
			System.out.print("Your number is not a perfect square");
		}
		//close scanner input
		if(input != null){
			input.close();
		}
	}
}
