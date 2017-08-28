/*
 * Assignment.java
 * Max Rink
 * ICS3U
 * 25 October
 * determines whether or not your car is defective based on the model number
 */

package Assignment;

import java.util.Scanner;

public class Assignment {

	public static void main(String[] args) {
		//initialize new scanner instance called input
		Scanner input = new Scanner(System.in);
		//create integer variable called a
		int a;
		//prompt user for the serial number of their car
		System.out.print("Please enter the model number of you car: ");
		a = input.nextInt();
		input.close();
		
		if (a >= 189 && a <= 195) { //if serial number is between 189 and 195
			System.out.print("Your car is defective. It must be repaired.");
		} else {
			switch (a) {
			case 119: System.out.print("Your car is defective. It must be repaired."); //if serial number is 119
				break;
			case 179: System.out.print("Your car is defective. It must be repaired."); //if serial number is 179
				break;
			case 189: System.out.print("Your car is defective. It must be repaired."); //if serial number is 189
				break;
			case 221: System.out.print("Your car is defective. It must be repaired."); //if serial number is 221
				break;
			case 780: System.out.print("Your car is defective. It must be repaired."); //if serial number is 780
				break;
			default: 
				//otherwise print you car is not defective
				System.out.print("Your car is not defective.");
			break;
			}
		}
	}
}
