/*
 * SurfsUp3.java
 * Max Rink
 * ICS3U
 * September 25
 * 
 * displays great day for surfing if waves are above 6 ft, 
 * go body boarding if waves are above or equal to 3, 
 * go for a swim if waves are above or equal to 0 
 * and Whoa! What kind of wave is that otherwise
 */
package Lesson1.SurfsUp3;

import java.util.Scanner;

public class SurfsUp3 {

	public static void main(String[] args) {
		//open scanner input
		Scanner input = new Scanner(System.in);
		//create int h
		int h;
		//prompt user the wave height
		System.out.print("Please enter the wave height: ");
		h = input.nextInt();
		
		if (h >= 6) {//if height is above or equal to 6
			System.out.print("Great day for surfing!");
		} else if (h >= 3) {//else if height is above or equal to 3
			System.out.print("Go body boarding!");
		} else if (h >= 0) {//else if height is above or equal to 0
			System.out.print("Go for a swim");
		} else {//else
			System.out.print("Whoa! What kind of surf is that?");
		}
		//close scanner input
		if (input != null) {
			input.close();
		}
	}

}
