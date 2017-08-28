/*
Assignment.java
Max Rink
ICS3U
Nov 5 2015
run the necklace problem with user input
*/
package Assignement.Assignment;

import java.util.Scanner;

public class Assignment {
	public static void main(String[] args) {
		//initialize new instance of scanner called input
		Scanner input = new Scanner(System.in);
		//create two integer variables c and d
		int c, d, f, e=0;
		String loop;
		//prompt user for two integer values
		System.out.print("Please enter two single digit integers: ");
		//store inputs in constant integer variables a and b
		final int a = input.nextInt();
		final int b = input.nextInt();
		//make c equivalent to and d to b
		c = a;
		d = b;
		//store initial inputs in loop
		loop = (c + " " + d + " ");
		do{ //open do while loop
			f = (c + d) % 10;
			c = d;
			d = f;
			e++;	//add one to the counter
			//display nest numbers in necklace chain
			loop += d + " ";
		} while(!(c == a && d == b)); //condition for loop to continue
		System.out.println(loop);
		//print tries the program made in order to complete the necklace problem
		System.out.print("Program Completed in " + e + " steps");
		//close scanner input
		if (input != null) {
			input.close();
		}
	}
}
