/*
 * PSR2.java
 * Max Rink
 * ICS3U
 * 25 October
 * plays rock paper scissors with user
 */

package Lesson2.PSR2;

/* 
 * PSR.java 
 */
import java.util.Scanner;
import java.lang.Math;

/**
 * Plays Paper Scissors Rock against one player.
 */
public class PSR2 {
	public static void main(String[] args) {
		final int ROCK = 1, PAPER = 2, SCISSORS = 3;
		int playerThrow, computerThrow;
		Scanner input = new Scanner(System.in);

		/* prompt player for throw and read number typed */
		System.out.print("Enter your throw (1=Rock, 2 =Paper, 3 = Scissors): ");
		playerThrow = input.nextInt();
		input.close();

		/* Generate computer throw */
		computerThrow = (int) (3 * Math.random() + 1); /*
														 * random int between 1
														 * and 3
														 */

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

		switch (playerThrow) {
		case ROCK:
			switch (computerThrow) {//nested switch statement
			case ROCK: System.out.print("It's a Draw!");
				break;
			case PAPER: System.out.print("Computer Wins!");
				break;
			case SCISSORS: System.out.print("You Won!");
				break;
			}
			break;
		case PAPER:
			switch (computerThrow) {//nested switch statement
			case ROCK: System.out.print("You Won!");
				break;
			case PAPER: System.out.print("It's a Draw!");
				break;
			case SCISSORS: System.out.print("Computer Wins!");
				break;
			}
			break;
		case SCISSORS:
			switch (computerThrow) {//nested switch statement
			case ROCK: System.out.print("Computer Wins!");
				break;
			case PAPER: System.out.print("You Won!");
				break;
			case SCISSORS: System.out.print("It's a Draw!");
				break;
			}
			break;
		}
	}
}
