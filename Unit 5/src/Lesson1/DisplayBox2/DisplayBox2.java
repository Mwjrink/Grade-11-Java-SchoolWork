/*
DisplayBox2.java
Max Rink
ICS3U
November 21 2015
displays a box per user inputed dimensions with the option of uses 
*/
package Lesson1.DisplayBox2;

import java.util.Scanner;

public class DisplayBox2 {
	static protected int length;

	public static void drawBox(int l, int w) {//draws a box
		drawBar(false, l);
		drawBar(true, w);
		drawBar(false, l);
	}

	public static void drawBar(boolean isV, int a) {
		if (isV) {//draw a vertical line
			for (int b = 0; b < a; b++) {
				System.out.print("|");
				for (int b1 = 2; b1 < length; b1++) {
					System.out.print(" ");
				}
				System.out.println("|");
			}
		} else if (!isV) {//draw a horizontal
			for (int b = 0; b < a; b++) {
				System.out.print("-");
				length = a;
			}
			System.out.print("\n");
		}
	}

	public static void drawBox(int l, int w, String foo) {//draw the box with a custom character
		drawBar(false, l, foo);
		drawBar(true, w, foo);
		drawBar(false, l, foo);
	}

	public static void drawBar(boolean isV, int a, String foo) {//draw bars with a custom character
		if (isV) {
			for (int b = 0; b < a; b++) {
				System.out.print(foo);
				for (int b1 = 2; b1 < length; b1++) {
					System.out.print(" ");
				}
				System.out.println(foo);
			}
		} else if (!isV) {
			for (int b = 0; b < a; b++) {
				System.out.print(foo);
				length = a;
			}
			System.out.print("\n");
		}
	}

	public static void main(String[] args) {//client code to test class
		Scanner input = new Scanner(System.in);
		int a, b;
		String foo;

		System.out.print("Please enter the length of the box you wish to draw: ");
		a = input.nextInt();
		System.out.print("Please enter the width of the box you wish to draw: ");
		b = input.nextInt();
		System.out.print(
				"If you would like the box to be drawn using a special character enter that now(otherwise, enter null to continue): ");
		foo = input.next();
		if (foo.contains("null")) {
			drawBox(a, b);
		}else{
			drawBox(a, b, foo);
		}
		if (input != null) {
			input.close();
		}
	}
}
