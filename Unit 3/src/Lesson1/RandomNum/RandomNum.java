/*
 * RandomNum.java
 * Max Rink
 * ICS3U
 * October 25
 * displays random number in the range specified by user
 */
package Lesson1.RandomNum;

import java.util.Scanner;


public class RandomNum {
	
	public static void main(String[] args) {
		//initialize new instance of scanner called input
		Scanner input = new Scanner(System.in);
		//create three integers a, b and c
		int a, b, c;
		//prompt user for a value for a and b
		System.out.print("Please enter a value for a: ");
		a = input.nextInt();
		System.out.print("Please enter a value for b: ");
		b = input.nextInt();
		//assign c a random value between and b
		c = (int) ((b-a+1)*Math.random() + a);
		//print c to the screen
		System.out.print(c);
		
		//close the scanner
		if(input != null){
			input.close();
		}
	}

}
