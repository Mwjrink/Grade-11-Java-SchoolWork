package Bowling_app;

public class Bowler {
	int points;
	
	/*
	 * pre: String pl
	 * post: nothing
	 * starts a game and adds to points
	 */
	public void turn(String pl) {
		BowlingGame gameOne = new BowlingGame();
		points += gameOne.firstTurn(pl);
	}
	
	/*
	 * pre: int set
	 * post: nothing
	 * sets the value of points
	 */
	public void setPoints(int set) {
		points = set;
	}
	
	/*
	 * pre: String pl
	 * post: nothing
	 * displays how many points the player has
	 */
	public void displayPoints(String pl) {
		System.out.println(pl+" has "+points+" points");
	}
	
	/*
	 * pre: nothing
	 * post: points
	 * returns the value of points
	 */
	public int getPoints()
	{
		return points;
	}
}
