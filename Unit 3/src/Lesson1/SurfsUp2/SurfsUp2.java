/*
 * SurfsUp2.java
 * Max Rink
 * ICS3U
 * September 25
 * Display whether or not to go surfing or body boarding
 */
package Lesson1.SurfsUp2;

import java.util.Scanner;


public class SurfsUp2 {
	
	public static void main(String[] args) {
		//initialize new instance of scanner called input
		Scanner input = new Scanner(System.in);
		//create int h
		int h;
		//prompt user for wave height
		System.out.print("Please enter the wave height: ");
		h = input.nextInt();
		
		if(h >= 6){ //if height is greater than or equal to 6
			System.out.print("Great day for surfing!");
		}else{ //else
			System.out.print("Go body Boarding");
		}
		//close scanner input
		if (input != null){
			input.close();
		}
	}

}
