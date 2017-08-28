/*
 * PSR1.java
 * Max Rink
 * ICS3U
 * 25 October
 * plays rock paper scissors with user
 */

package Lesson2.PSR1;

/* 
 * PSR.java 
 */
import java.util.Scanner;
import java.lang.Math;

/**
 * Plays Paper Scissors Rock against one player.
 */
public class PSR1 {
	public static void main(String[] args) {
		final int ROCK = 1, PAPER = 2, SCISSORS = 3;
		int playerThrow, computerThrow;
		Scanner input = new Scanner(System.in);

		/* prompt player for throw and read number typed */
		System.out.print("Enter your throw (1 = Rock, 2 = Paper, 3 = Scissors): ");
		playerThrow = input.nextInt();
		input.close();

		/* Generate computer throw */
		computerThrow = (int) (3 * Math.random() + 1); //random int between 1 and 3

		/* Inform player of throws */
		System.out.print("Player throws ");
		switch (playerThrow) {
		case ROCK:
			System.out.println("ROCK.");
			break;
		case PAPER:
			System.out.println("PAPER.");
			break;
		case SCISSORS:
			System.out.println("SCISSORS.");
			break;
		}
		System.out.print("Computer throws ");
		switch (computerThrow) {
		case ROCK:
			System.out.println("ROCK.");
			break;
		case PAPER:
			System.out.println("PAPER.");
			break;
		case SCISSORS:
			System.out.println("SCISSORS.");
			break;
		}

		/* Determine winner */

		if (playerThrow == ROCK) {
			if (computerThrow == ROCK) {//nested if-else-if statement
				System.out.println("It's a draw!");
			} else if (computerThrow == PAPER) {
				System.out.println("Computer Wins!");
			} else if (computerThrow == SCISSORS) {
				System.out.println("You Won!");
			}
		} else if (playerThrow == PAPER) {
			if (computerThrow == ROCK) {//nested if-else-if statement
				System.out.println("You Won!");
			} else if (computerThrow == PAPER) {
				System.out.println("It's a draw!");
			} else if (computerThrow == SCISSORS) {
				System.out.println("Computer Wins!");
			}
		} else if (playerThrow == SCISSORS) {
			if (computerThrow == ROCK) {//nested if-else-if statement
				System.out.println("Computer Wins!");
			} else if (computerThrow == PAPER) {
				System.out.println("You Won!");
			} else if (computerThrow == SCISSORS) {
				System.out.println("It's a draw!");
			}
		}
	}
}
