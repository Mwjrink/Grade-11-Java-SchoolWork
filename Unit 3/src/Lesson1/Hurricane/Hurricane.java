/* 
 * Hurricane.java
 * Max Rink
 * ICS3U
 * October 25
 * Displays to user what each class of hurricane entails
 */
package Lesson1.Hurricane;

import java.util.Scanner;

public class Hurricane {

	public static void main(String[] args) {
		//initialize new scanner called input
		Scanner input = new Scanner(System.in);
		//create int called cat
		int cat;
		//prompt user for category of hurricane
		System.out.print("What category is the Hurricane: ");
		cat = input.nextInt();
		//switch statement called cat
		switch(cat){
		case 1:System.out.print("74-95 mph or 64-82 kt or 119-153 km/hr ");break; //cat equals 1
		case 2:System.out.print("96-110 mph or 83-95 kt or 154-177 km/hr ");break; //cat equals 2
		case 3:System.out.print("111-130 mph or 96-113 kt or 178-209 km/hr ");break; //cat equals 3
		case 4:System.out.print("131-155 mph or 114-135 kt or 210-249 km/hr ");break; //cat equals 4
		case 5:System.out.print("greater than 155 mph or 135 kt or 249 km/hr ");break; //cat equals 5
		}

	}
}
