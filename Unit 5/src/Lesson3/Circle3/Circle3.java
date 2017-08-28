/*
 * Circle3.java
 * Max Rink
 * ICS3U
 * Nov 5 2015
 * creates a circle class and returns information on it
 */
package Lesson3.Circle3;

import java.util.Scanner;

/**
 * Circle class.
 */
public class Circle3 {
	private static final double PI = 3.14;
	private double radius;

	/**
	 * constructor pre: none post: A Circle object created. Radius initialized
	 * to 1.
	 */

	public Circle3() {
		radius = 1; // default radius
	}

	public Circle3(int i) {
		radius = i;
	}

	/**
	 * Changes the radius of the circle. pre: none post: Radius has been
	 * changed.
	 */
	public void setRadius(double newRadius) {
		radius = newRadius;
	}

	/**
	 * Calculates the area of the circle. pre: none post: The area of the circle
	 * has been returned.
	 */

	public double area() {
		double circleArea;
		circleArea = PI * radius * radius;
		return (circleArea);
	}

	/**
	 * Returns the radius of the circle. pre: none post: The radius of the
	 * circle has been returned.
	 */
	public double getRadius() {
		return (radius);
	}
	//returns circumference
	public double circumference() {
		return 2 * PI * radius;
	}
	//returns area formula
	public String displayAreaFormula() {
		return "pi x radius x radius";
	}
	//client code to test circle class
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		Circle3 spot = new Circle3();

		System.out.println("Circle radius: " + spot.getRadius());
		System.out.println("Circle circumference: " + spot.circumference());

		System.out.print("Enter a radius: ");
		int a = input.nextInt();
		Circle3 spot1 = new Circle3(a);

		System.out.println("Circle radius: " + spot1.getRadius());
		System.out.println("Circle circumference: " + spot1.circumference());
		
		System.out.println("Area formula is " + spot.displayAreaFormula());
		
		if(input != null){input.close();}
	}
}

/*
 * Modify the Circle class to include a class method named displayAreaFormula,
 * as shown in the previous section. Modify existing client code to test the new
 * method.
 */