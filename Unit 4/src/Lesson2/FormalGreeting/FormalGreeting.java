/*
FormalGreeting.java
Max Rink
ICS3U
Nov 5 2015
Determine whether or not user is male or female from their title
*/
package Lesson2.FormalGreeting;

import java.util.Scanner;

public class FormalGreeting {

	public static void main(String[] args) {
		//create new instance of scanner called input with arguments System.in
		Scanner input = new Scanner(System.in);
		//create String called name
		String name;
		//prompt user for their name with the title
		System.out.print("Please enter your Name with title");
		//store input in the String name
		name = input.nextLine();

		if (name.startsWith("Mr.")) { //if the name String, or input, begins with mr.
			System.out.print("Hello Sir"); //display hello sir to the screen
		} else if (name.startsWith("Ms.") || name.startsWith("Miss.") || name.startsWith("Mrs.")) { //if the name String, or input, begins with ms. or miss. or mrs.
			System.out.print("Hello Ma'am"); //display hello Ma'am to the screen
		} else {
			System.out.print("Hello " + name);
		}

		if (input != null) { //close scanner so long as it exists
			input.close();
		}
	}

}
