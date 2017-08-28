/*
 * Max Rink
 * ICS3U
 * September 25
 * Calculate the average of 5 grades
 */
package Lesson_3.GradeAvg2;
//import scanner
import java.util.Scanner;

public class Lesson3Gradeavg2 {
	//open main method
	public static void main(String[] args) {
		//initialize new instance of the scanner called input
		Scanner input = new Scanner(System.in);
		//create double grade
		double grade;
		//prompt user for 5 grades and add them to grade
		System.out.println("Please enter your first grade");
		grade = input.nextInt();
		System.out.println("Please enter your second grade");
		grade += input.nextInt();
		System.out.println("Please enter your third grade");
		grade += input.nextInt();
		System.out.println("Please enter your fourth grade");
		grade += input.nextInt();
		System.out.println("Please enter your fifth grade");
		grade += input.nextInt();
		//divide grade by 5 in order to calculate the average
		grade /= 5;
		//print average to the screen
		System.out.println("The Average of your grades is " + grade);
		
		//close scanner input
		if (input != null){
			input.close();
		}
	}

}
