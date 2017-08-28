/*
 * Max Rink
 * ICS3U
 * September 25
 * adds three distances then display's the total of the distances
 */
package Lesson_2.Distance1;

public class Lesson2Distance1 {
	
	public static void main(String[] args) {
		//create three doubles with the values of the three race segments
		double first = 12.2;
		double second = 10.6;
		double third = 5.8;
		//add the race segments together and store it in total
		double total = first+second+third;
		//print total to the screen
		System.out.print("The first segment is " + first + "km, the second is " + second + " km, and the third is " + third + " km. \nThe total distance of the race is " + total);
		
	}
	
}
