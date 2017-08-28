/*
 * Circle1.java
 * Max Rink
 * ICS3U
 * Nov 5 2015
 * creates a circle class and returns information on it
 */
package Lesson3.Circle1;

/**
 * Circle class.
 */
public class Circle1 {
	private static final double PI = 3.14;
	private double radius;

	/**
	 * constructor pre: none post: A Circle object created. Radius initialized
	 * to 1.
	 */

	public Circle1() {
		radius = 1; // default radius
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
	//returns the circumfernce
	public double circumference(){
		return 2*PI*radius;
	}
	//client code to test class
	public static void main(String[] args) { 
		Circle1 spot = new Circle1(); 
		spot.setRadius(3); 
		System.out.println("Circle radius: " + spot.getRadius()); 
		System.out.println("Circle circumference: " + spot.circumference());
	} 
}