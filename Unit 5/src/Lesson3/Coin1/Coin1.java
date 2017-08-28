/*
 * Coin1.java
 * Max Rink
 * ICS3U
 * Nov 5 2015
 * Flips coin using coin class
 */
package Lesson3.Coin1;

public class Coin1 {
	int faceUp = 0;//var identifying the side that is up

	public void flipCoin() {//flips the coin
		faceUp = (int) (Math.random() + 0.5);
	}

	public int showFace() {//return the side that is up
		return faceUp;
	}

	public static void main(String[] args) {//client code to test class
		Coin1 nickel = new Coin1();
		nickel.flipCoin();
		if (nickel.showFace() == 0) {//print the face that is up to the user
			System.out.println("Heads up!");
		} else {
			System.out.println("Tails up!");
		}
	}
}
