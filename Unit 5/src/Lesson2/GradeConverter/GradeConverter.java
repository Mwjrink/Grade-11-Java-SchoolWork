/*
 * GradeConverter.java
 * Max Rink
 * ICS3U
 * Nov 5 2015
 * converts a number grade to a letter grade
 */
package Lesson2.GradeConverter;/* 

*/
import java.util.Scanner;

/**
 * Display the letter grade that corresponds to the numeric grade entered by the
 * user.
 */
public class GradeConverter {
	/**
	 * Determines if a numeric entry is valid. pre: none post: true has been
	 * returned if minNum <= userNum <= maxNum; false has been returned
	 * otherwise
	 */
	public static boolean isValidNumber(int userNum, int minNum, int maxNum) {
		if (minNum <= userNum && userNum <= maxNum) {
			return (true);
		} else {
			return (false);
		}
	}

	/**
	 * Determines the letter grade that corresponds to the numeric grade. pre: 0
	 * <= numGrade <= 100 post: The letter grade A, B, C, D, or F has been
	 * returned.
	 */
	public static String getLetterGrade(int numGrade) {
		switch(numGrade){
		case 69: return ("D+");
		case 79: return ("C+");
		case 89: return ("B+");
		case 100: return ("A+");
		}
		if (numGrade < 60) {
			return ("F");
		} else if (numGrade < 70) {
			return ("D");
		} else if (numGrade < 80) {
			return ("C");
		} else if (numGrade < 90) {
			return ("B");
		} else {
			return ("A");
		}
	}

//client code to test the class
	public static void main(String[] args) {
		final int FLAG = -1;
		final int minValue = 0;
		final int maxValue = 100;
		int numericGrade;
		String letterGrade;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a numeric grade (-1 to quit): ");
		numericGrade = input.nextInt();
		while (numericGrade != FLAG) {
			if (isValidNumber(numericGrade, minValue, maxValue)) {
				letterGrade = getLetterGrade(numericGrade);
				System.out.println("The grade" + numericGrade + " is a(n)" + letterGrade + ".");
			} else {
				System.out.println("Grade entered is not valid.");
			}
			System.out.print("Enter a numeric grade (-1 to quit): ");
			numericGrade = input.nextInt();
			
			if(input != null){input.close();}
		}
	}
}