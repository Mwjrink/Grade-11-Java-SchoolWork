/*
 * Rectangle1.java
 * Max Rink
 * ICS3U
 * Nov 5 2015
 * calculates perimeter and area of rectangle using a rectangle object
 */
package Lesson3.Rectangle1;

import java.util.Scanner;

public class Rectangle1 {
	int length, width;

	Rectangle1() {length = 4; width = 12;} //default constructor

	Rectangle1(int l, int w) {length = l; width = w;} //overloaded constructor
	//getters and setters
	//getters return values
	//setters set values
	public void setWidth(int i) {width = i;}

	public int getWidth() {return width;}

	public void setLength(int i) {length = i;}

	public int getLength() {return length;}
	
	public int getArea(){return length*width;}
	
	public int getPerimeter(){return length*2+width*2;}
	//end of getters and setters
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		Rectangle1 rect = new Rectangle1(); //new rectangle object
		int l, w, a, p; //integers for area length width and perimeter
		//set variables to defaults
		l = rect.getLength();
		w = rect.getWidth();
		p = rect.getPerimeter();
		a = rect.getArea();
		//display defaults
		System.out.println("length = " + l + " \nwidth = " + w + " \narea = " + a + " \nPerimeter = " + p);
		//get lengths and widths from user
		System.out.print("\nPlease enter a length: ");
		l = input.nextInt();
		System.out.print("Please enter a width: ");
		w = input.nextInt();
		//set lengths and width in a new object
		Rectangle1 rect1 = new Rectangle1(l, w);
		l = rect1.getLength();
		w = rect1.getWidth();
		p = rect1.getPerimeter();
		a = rect1.getArea();
		//display the area length width and perimeter
		System.out.println("length = " + l + " \nwidth = " + w + " \narea = " + a + " \nPerimeter = " + p);
		
		if(input != null){input.close();}
	}
}
