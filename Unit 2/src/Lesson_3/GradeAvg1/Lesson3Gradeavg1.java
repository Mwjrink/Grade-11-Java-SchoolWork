/*
 * Max Rink
 * ICS3U
 * September 25
 * prompt and store 5 grade values then calculate and display the average
 */
package Lesson_3.GradeAvg1;

import java.text.NumberFormat;
import java.util.Scanner;

public class Lesson3Gradeavg1 {

	public static void main(String[] args) {
		//initialize new instance of Scanner
		Scanner input = new Scanner(System.in);
		//create 5 integers and a doubel for the grades
		int gradea;
		int gradeb;
		int gradec;
		int graded;
		int gradee;
		double grade;
		//create percent format
		NumberFormat percent = NumberFormat.getPercentInstance();
		//prompt user for 5 grades
		System.out.println("Please enter your first grade");
		gradea = input.nextInt();
		System.out.println("Please enter your second grade");
		gradeb = input.nextInt();
		System.out.println("Please enter your third grade");
		gradec = input.nextInt();
		System.out.println("Please enter your fourth grade");
		graded = input.nextInt();
		System.out.println("Please enter your fifth grade");
		gradee = input.nextInt();
		//calculate the average of the grades
		grade = (gradea+gradeb+gradec+graded+gradee) / 5;
		//print the average to the screen
		System.out.println("The Average of your grades is " + percent.format(grade/100));
		
		//close the scanner input
		if (input != null){
			input.close();
		}
	}

}
