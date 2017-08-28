package Bowling_app;

public class BowlingGame {
	int knocked;
	int points;
	int people;
	
	/*
	 * pre: int set
	 * post: nothing
	 * sets the value of people
	 */
	public void setPlayers(int players)
	{
		people=players;
	}
	
	
	/*
	 * pre: String pl
	 * post: return points
	 * performs the first turn for a player
	 */
	public int firstTurn(String pl) {
		int pins=10;
		knocked = (int)(11*Math.random());
		pins -= knocked;
		if (pins>0){
			System.out.println(pl+" knocked over "+knocked+" pins!\nThere are "+pins+" pins left standing");
			points = secondTurn(pins, pl);
			return points;
		} else
		{
			System.out.println(pl+" knocked over all ten pins! Thats a strike!");
			return 20;
		}
	}
	
	/*
	 * pre: String pl, int pins
	 * post: return points
	 * performs the second turn for a player
	 */
	private int secondTurn(int pins, String pl) {
		knocked = (int)((pins+1)*Math.random());
		pins-=knocked;
		if (pins>0){
			System.out.println(pl+" knocked over "+knocked+" pins!\nThere are "+pins+" pins left standing");
			int points = 10-pins;
			return points;
		}else{
			System.out.println(pl+" knocked over the last "+knocked+" pins! Thats a spare!");
			return 15;
		}
	}
	
	/*
	 * pre: int[] pla, String[] contend
	 * post: nothing
	 * sorts the array by points each player has and prints them to the screen in the order of points
	 */
	public static void endOfGame(int[] pla, String[] contend) 
	{ 
		for (int index=0; index<pla.length; index++) 
		{ 
			for (int subIndex=index; subIndex<pla.length; subIndex++) 
			{ 
				if (pla[subIndex] > pla[index]) 
				{
					int temp = pla[index]; 
					pla[index] = pla[subIndex]; 
					pla[subIndex] = temp;
					
					String tempor = contend[index];
					contend[index] = contend[subIndex]; 
					contend[subIndex] = tempor;
				}
			}
		}
		int max;
		for (int i = 0; i < pla.length; i++)
		{
			max=i+1;
			System.out.println("Number "+max+" is "+contend[i]+" with "+pla[i]); 
		}
	}
}
