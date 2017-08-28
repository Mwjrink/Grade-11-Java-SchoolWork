/*
 * Delivery.java
 * Max Rink
 * ICS3U
 * 25 October
 * determines whether or not a package will be accepted or rejected
 */

package Lesson2.Delivery;

import java.util.Scanner;


public class Delivery {
	public static void main(String[] args){
		//initialize new instance of scanner called input
		Scanner input = new Scanner(System.in);
		//create ints a, b and c
		int a, b, c;
		//prompt user for dimensions of package
		System.out.print("Please enter the width of your package: ");
		a = input.nextInt();
		System.out.print("Please enter the height of your package: ");
		b = input.nextInt();
		System.out.print("Please enter the depth of your package: ");
		c = input.nextInt();
		//if any of the dimensions entered are greater then 10 package is rejected
		if(a > 10 || b > 10 || c > 10){
			System.out.print("Rejected");
		} else {
			System.out.print("Accepted");
		}
		//close scanner input
		if(input != null){
			input.close();
		}
	}
}
