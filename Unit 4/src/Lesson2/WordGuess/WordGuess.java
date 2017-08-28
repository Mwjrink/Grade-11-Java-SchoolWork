/*
WordGuess.java
Max Rink
ICS3U
Nov 5 2015
plays a word guessing game with the user
*/
package Lesson2.WordGuess;

import java.util.Scanner;

public class WordGuess {

	public static void main(String[] args) {
		//create constant Strings secret_word and flag with values of BRAIN and ! respectively
		final String SECRET_WORD = "BRAIN";
		final String FLAG = "!";
		//create two strings wordSoFar and updatedWord with nothing stored in them
		String wordSoFar = "", updatedWord = "";
		//create two strings letterGuess and wordGuess with nothing stored in them
		String letterGuess, wordGuess = "";
		//create integers numGuesses and score with values of 0 and 100
		int numGuesses = 0;
		int score = 100;
		//instantiate new instance of Scanner called input with arguments System.in
		Scanner input = new Scanner(System.in);

		/* begin game */
		System.out.println("WordGuess game. \n");
		for (int i = 0; i < SECRET_WORD.length(); i++) {
			wordSoFar += "-"; // word as dashes
		}
		System.out.println(wordSoFar + "\n"); // display dashes
		/* allow player to make guesses */
		do {
			System.out.print("Enter a letter (" + FLAG + " to guess entire word): ");
			letterGuess = input.nextLine();
			letterGuess = letterGuess.toUpperCase();
			/* increment number of guesses */
			numGuesses += 1;
			if (SECRET_WORD.indexOf(letterGuess) >= 0) {
				updatedWord = wordSoFar.substring(0, SECRET_WORD.indexOf(letterGuess));
				updatedWord += letterGuess;
				updatedWord += wordSoFar.substring(SECRET_WORD.indexOf(letterGuess) + 1, wordSoFar.length());
				wordSoFar = updatedWord;
			}
			/* display guessed letter instead of dash */
			System.out.println(wordSoFar + "\n");
		} while (!letterGuess.equals(FLAG) && !wordSoFar.equals(SECRET_WORD) && numGuesses != 10);
		/* finish game and display message and number of guesses */
		if (letterGuess.equals(FLAG)) {
			System.out.println("What is your guess? ");
			wordGuess = input.nextLine();
			wordGuess = wordGuess.toUpperCase();
		}
		if (wordGuess.equals(SECRET_WORD) || wordSoFar.equals(SECRET_WORD)) {
			System.out.println("You won!");
		} else {
			System.out.println("Sorry. You lose.");
		}
		score -= (numGuesses*10);
		System.out.println("The secret word is " + SECRET_WORD);
		System.out.println("You made " + numGuesses + " guesses.");
		//display score to the screen
		System.out.println("You obtained a final score of " + score);
		input.close();
	}
}
