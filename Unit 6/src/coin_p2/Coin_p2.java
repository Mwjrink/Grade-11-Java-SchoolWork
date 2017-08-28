package coin_p2;
public class Coin_p2
{

	int face=1;
	String sideofcoin;
	public void flipCoin()
	{
		face = (int)(0.5+(2*Math.random()));
	}
	public int showFace()
	{
		return face;
	}
	//returns a string representing the coin
	public String toString()
	{
		if (face == 0) 
		{ 
			sideofcoin = "The coin is face up";
		}
		else if (face == 1)
		{ 
			sideofcoin = "The coin is tails up";
		}
		return sideofcoin;
	}
}
