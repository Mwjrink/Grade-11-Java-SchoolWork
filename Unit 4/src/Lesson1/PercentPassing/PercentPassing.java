/*
PercentPassing.java
Max Rink
ICS3U
Nov 5 2015
determines the percent of the scores the user enters that are above 70
*/
package Lesson1.PercentPassing;

import java.util.Scanner;

public class PercentPassing {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//create three integers with values of 0
		int a=0, b=0, c=0;
		
		do{ //open do while loop
			System.out.print("Please enter a score(negative number to quit): ");
			a = input.nextInt();
			b++;
			//increment c by 1 if a is greater than 70
			if(a > 70){c++;}
			
		}while(a >= 0); //condition for do while loop
		//calculate percentage of scores over 70
		b = (c/b)*100;
		//print percentage
		System.out.print(b + "% of entered integers were over 70%");
		//close scanner input
		if (input != null) {
			input.close();
		}
	}

}
