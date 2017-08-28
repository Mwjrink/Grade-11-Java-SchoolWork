package RPS;
import java.util.Scanner;

public class RPS
{ 
	public static void main(String[] args)
	{
		RPSGame rps = new RPSGame(); 
		RPSPlayer rpsOpponent = new RPSPlayer(); 
		int rounds; 
		int playerThrow; 
		Scanner input = new Scanner(System.in); 
		System.out.print("What is your name: ");
		String name;
		name = input.next();
		System.out.print("How many rounds? "); 
		rounds = input.nextInt(); 
		for (int i = 0; i < rounds; i++) 
		{ 
			System.out.print("Enter your throw (ROCK=l, PAPER=2, SCISSORS=3): "); 
			playerThrow = input.nextInt();  
			rpsOpponent.makeThrow(playerThrow);
 
			rps.makeCompThrow(); 
			rps.announceWinner(rpsOpponent.getThrow(), name); 
		} 
			rps.bigWinner(name);
			input.close();
	}
} 
