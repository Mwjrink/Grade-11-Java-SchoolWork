/*
AccountSetup.java
Max Rink
ICS3U
Nov 5 2015
prompts user for then displays a username and password within parameters
*/
package Lesson2.AccountSetup;

import java.util.Scanner;

public class AccountSetup {
	public static void main(String[] args) {
		//initialize new scanner called input
		Scanner input = new Scanner(System.in);
		//create strings user and pass to store username and password
		String user, pass;
		//prompt user for a username
		System.out.print("Enter a username: ");
		user = input.next();

		do { //open do-while loop
			System.out.print("Enter a password that is atleast 8 characters: ");
			pass = input.next();
		} while (pass.length() > 8); //condition for do while loop to continue, should the password not be greater than 8 characters
		//make both user and pass lowercase strings
		user.toLowerCase();
		pass.toLowerCase();
		//print accepted username and password
		System.out.print("Your user name is " + user + " and your password is" + pass);
		//close scanner input so long as it exists
		if (input != null) {
			input.close();
		}
	}

}
