package RPS_p2;

import java.lang.Math;

public class RPSGame 
{ 
	public static final int ROCK = 1, PAPER = 2, SCISSORS = 3; 
	private int compThrow; 
	private int playerWins = 0, computerWins = 0; 
	
	public RPSGame() 
	{ 
		compThrow = (int)(3 * Math.random() + 1); 	// 1, 2, or 3 
		playerWins = 0; 
		computerWins = 0; 
	}


	public void makeCompThrow()
	{ 
		compThrow = (int) (3 * Math.random() + 1); 	// 1, 2, or 3 
	}


	public int getCompThrow() 
	{
		return(compThrow); 
	}


	public void announceWinner(int playerThrow, String name) 
	{
/* Inform player of throws */ 
		System.out.print(name+" throws "); 
		switch(playerThrow) 
		{ 
			case ROCK: System.out.println("ROCK."); 
			break; 
			case PAPER: System.out.println("PAPER."); 
			break; 
			case SCISSORS: System.out.println("SCISSORS."); 
			break;
		} 

		System.out.print("Computer throws "); 
		switch(compThrow) 
		{ 
			case ROCK: System.out.println("ROCK."); 
			break; 
			case PAPER: System.out.println("PAPER."); 
			break; 
			case SCISSORS: System.out.println("SCISSORS."); 
			break;
		}
 
/* Determine and annouce winner */ 
		if (playerThrow == ROCK && compThrow == ROCK) 
		{ 
			System.out.println("It's a draw!");
		}
			else if (playerThrow == ROCK && compThrow == PAPER) 
			{
				System.out.println("Computer wins!"); 
				computerWins += 1; 
			}
				else if (playerThrow == ROCK && compThrow == SCISSORS) 
				{ 
					System.out.println(name+" wins!"); 
					playerWins += 1; 
				}

		if (playerThrow == PAPER && compThrow ==ROCK) 
		{ 
			System.out.println(name+" wins!"); 
			playerWins += 1; 
		}
			else if (playerThrow == PAPER && compThrow ==PAPER) 
			{ 
				System.out.println("It's a draw!"); 
			}
				else if (playerThrow == PAPER && compThrow ==SCISSORS) 
				{
					System.out.println("Computer wins!"); 
					computerWins += 1;
				} 

		if (playerThrow == SCISSORS && compThrow ==ROCK) 
		{ 
			System.out.println("Computer wins!"); 
			computerWins += 1; 
		}
			else if (playerThrow == SCISSORS && compThrow ==	PAPER) 
			{ 
				System.out.println(name+" wins!"); 
				playerWins += 1; 
			}
			else if (playerThrow == SCISSORS && compThrow ==	SCISSORS) 
			{ 
				System.out.println("It's a draw!"); 
			}
	}


				public void bigWinner(String name) 
				{ 
					if (computerWins > playerWins)
					{ 
						System.out.println("Computer wins!"); 
					}
					else if (playerWins > computerWins)
					{ 	
						System.out.println(name+" wins!"); 
					}	
					else 
					{ 
						System.out.println("It's a draw!"); 
					}
				}


				public int validInput(int playerThrow) {
					if (playerThrow > 0 || playerThrow < 4){
					return playerThrow;
					}
					else{
						return 4;
					}
				}
}