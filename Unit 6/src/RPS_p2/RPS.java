package RPS_p2;
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
		int n;
		for (int i = 0; i < rounds; i++) 
		{ 
			do{
				System.out.print("Enter your throw (ROCK=l, PAPER=2, SCISSORS=3): "); 
				playerThrow = input.nextInt(); 
				n = rps.validInput(playerThrow);
				if(!(n==1 || n==2 || n==3))
				{
					System.out.print("Invalid move\n");
				}
			} while(n==4);
			rpsOpponent.makeThrow(playerThrow);
 
			rps.makeCompThrow(); 
			rps.announceWinner(rpsOpponent.getThrow(), name); 
		} 
			rps.bigWinner(name);
			input.close();
	}
} 
