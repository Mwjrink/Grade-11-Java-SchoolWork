/*
Exponention.java
Max Rink
ICS3U
November 21 2015
calculates the value of the user inputed base to the power of the user inputed exponent
*/
package Lesson1.Exponention;

import java.util.Scanner;

public class Exponention {
	public static double powerOf(int a, int b){return Math.pow(a, b);}//returns a to the power of b
	//client code to test class
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		int a, b;
		
		System.out.print("Please enter an integer for the base: ");
		a = input.nextInt();
		System.out.print("Please enter an integer for the exponent: ");
		b = input.nextInt();
		
		System.out.print(powerOf(a, b));
		
		if(input != null){
			input.close();
		}
	}
}
