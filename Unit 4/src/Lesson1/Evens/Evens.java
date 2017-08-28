/*
Evens.java
Max Rink
ICS3U
Nov 5 2015
print all of the even numbers between 1 and 20
*/
package Lesson1.Evens;

import java.util.Scanner;

public class Evens {

	public static void main(String[] args) {
		//open new instance of scanner called input with arguments System.in
		Scanner input = new Scanner(System.in);
		//create int i with a value of 2
		int i = 2;

		do { //open do while loop
			System.out.println(i); //print i to the screen
			i += 2; //add 2 to i
		} while (i < 21); //end loop when i is equal to or greater than 21

		if (input != null) { //close input if it exists
			input.close();
		}
	}

}
