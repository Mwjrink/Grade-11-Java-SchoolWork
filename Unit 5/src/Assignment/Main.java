package Assignment;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		Nim game = new Nim();
		String winner = "";
		int in;
		
		System.out.println("Let's play Nim!");
		
		for(;game.getStones() > 0;){
			System.out.println("There are " + game.getStones() + " stones in the pile");
			System.out.print("Please enter how many stones you would like to take from the pile: ");
			in = input.nextInt();
			if(game.turn(in)){
				if(game.getStones() <= 0){
					winner = "The Computer has";
					break;
				}
				System.out.println("The computer takes " + game.drawStones() + "\n");
					winner = "You have";
			} else {
				System.out.println("Nice try\n");
			}
		}
		System.out.print(winner+" won the game");//display the winner
		if(input != null){input.close();}
	}
}


