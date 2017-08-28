/*
DisplayBox1.java
Max Rink
ICS3U
November 21 2015
displays a box per user inputed dimensions
*/
package Lesson1.DisplayBox1;

import java.util.Scanner;

public class DisplayBox1 {
	static protected int length;
	public static void drawBox(int l, int w) {//draws a box
		drawBar(false, l);
		drawBar(true, w);
		drawBar(false, l);
	}
	//draw a bar
	public static void drawBar(boolean isV, int a) {
		if (isV) {//vertical line
			for (int b = 0; b < a; b++) {
				System.out.print("|");
				for (int b1 = 2; b1 < length; b1++) {
					System.out.print(" ");
				}
				System.out.println("|");
			}
		} else {//horizontal
			for (int b = 0; b < a; b++) {
				System.out.print("-");
				length = a;
			}
			System.out.print("\n");
		}
	}
	//client code to test class
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a, b;

		System.out.print("Please enter the length of the box you wish to draw: ");
		a = input.nextInt();
		System.out.print("Please enter the width of the box you wish to draw: ");
		b = input.nextInt();

		drawBox(a, b);

		if (input != null) {input.close();}
	}
}
