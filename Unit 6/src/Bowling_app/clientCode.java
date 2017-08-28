/*
 * Bowling app
 * Max Rink
 * ICS3U
 * January 13 2016
 * bowling app for playing bowling
 */
package Bowling_app;
import java.util.Scanner;

public class clientCode {
	
	public static void main(String[] args)
	{
		int players;
		Scanner input = new Scanner(System.in);
		System.out.print("How many players are there: ");
		players = input.nextInt();
		String[] contestant = new String[players];
		Bowler[] contender = new Bowler[players];
		int i=0;
		int b=players;
		do{
			System.out.print("Please enter the players name: ");
			contestant[i] = input.next();
			contender[i] = new Bowler();
			i++;
			b--;
		}while(b>0);
		for(i=10; i>0; i--){
			for(int a=0; a<players; a++){
				System.out.println("\n"+contestant[a]+"'s turn:");
				contender[a].turn(contestant[a]);
				contender[a].displayPoints(contestant[a]);
			}
		}
		int[] points = new int[players];
		BowlingGame game = new BowlingGame();
		for(int a=0; a<players; a++){
			points[a]=contender[a].getPoints();
		}
		System.out.println("\nThats the end of the game");
		game.endOfGame(points, contestant);
		input.close();
	}
}
