/*
 * SurfsUp1.java
 * Max Rink
 * ICS3U
 * September 25
 * displays great day for surfing if waves are above 6 ft
 */
package Lesson1.SurfsUp1;

import java.util.Scanner;


public class SurfsUp1 {
	
	public static void main(String[] args) {
		//initialize new instance of scanner called input
		Scanner input = new Scanner(System.in);
		//create integer h
		int h;
		//prompt user for wave height 
		System.out.print("Please enter the wave height: ");
		h = input.nextInt();
		//if wave height is above 6
		if(h >= 6){
			System.out.print("Great day for surfing!");
		}
		//close scanner input
		if (input != null){
			input.close();
		}
	}

}
