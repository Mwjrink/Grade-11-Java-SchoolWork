/*
 * Max Rink
 * ICS3U
 * September 25
 * calculates the perimeter of a rectangle with the dimensions 4 x 12
 */
package Lesson_2.RectanglePerimeter;

public class Lesson2RectanglePerimeter {
	
	public static void main(String[] args) {
		//create integer variables length and width with values 4 and 12 respectively
		int width = 4;
		int length = 12;
		//calculate the perimeter using the vairabels width and length
		int perimeter = (2*width)+(2*length);
		//print the perimeter to the screen
		System.out.print("The perimeter of a rectangle with a width of " + width + " and a length of " + length + " is " + perimeter);
		
	}
	
}
