/*
project48.java
Max Rink
ICS3U
Nov 12 2015
tests a coin class and uses the tostring method
*/
package coin_p2;

public class project48
{
	public static void main(String[ ] args) 
	{ 
		String coin;
		Coin_p2 nickel = new Coin_p2(); 
		nickel.flipCoin(); 
		coin = nickel.toString();
		System.out.print(coin);
	}
}
