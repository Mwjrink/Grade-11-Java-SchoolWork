/*
SpanishNumbers.java
Max Rink
ICS3U
November 21 2015
returns the spanish equivalent of a user input
*/
package Lesson1.SpanishNumbers;

import java.util.Scanner;
//returns string spanish number equivalent of a number
public class SpanishNumbers {
	public static void sn(int i) {
		switch (i) {
		case 1:
			System.out.println("uno");
			break;
		case 2:
			System.out.println("dos");
			break;
		case 3:
			System.out.println("tres");
			break;
		case 4:
			System.out.println("cuatro");
			break;
		case 5:
			System.out.println("cinco");
			break;
		case 6:
			System.out.println("seis");
			break;
		case 7:
			System.out.println("siete");
			break;
		case 8:
			System.out.println("ocho");
			break;
		case 9:
			System.out.println("nueve");
			break;
		case 10:
			System.out.println("diez");
			break;
		}
	}
	//client code to test class
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int i;
		for (int a = 0; a < 10; a++) {
			System.out.print("Please enter the number from 1 to 10 that you would like to see in spanish: ");
			i = input.nextInt();
			sn(i);
		}

		if (input != null) {
			input.close();
		}
	}

}
