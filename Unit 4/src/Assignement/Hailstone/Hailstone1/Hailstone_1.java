/*
Hailstone_1.java
Max Rink
ICS3U
Nov 5 2015
run the hailstone problem with all of the numbers between 1 and 200
*/
package Assignement.Hailstone.Hailstone1;

public class Hailstone_1 {
	public static void main(String[] args) {
		//create variables c, and f
		int nextInSeries, isEven;
		//create variables e with a value of 0
		int counter = 0;
		//run loop 200 times
		for (int initial = 200; initial > 0; initial--) {
			//display the initial number to the screen
			System.out.println("initial number of " + initial + " ");
			//make nextInSeries equal to 1
			nextInSeries = initial;
			//restart counter
			counter = 0;
			//open do while loop
			do {
				//make is even equal to 1 if nextInSeries is odd and 0 if it's even
				isEven = nextInSeries % 2;
				switch(isEven){
				case 1: nextInSeries = nextInSeries*3+1; //if isEven is odd multiply nextInSeries by 3 and add 1
					break;
				case 0: nextInSeries /= 2; //if isEven is odd multiply nextInSeries by 3 and add 1
					break;
				}
				//print nextInSeries then a space
				System.out.print(nextInSeries + " ");
				counter++; //increase counter by one
			} while (nextInSeries != 1); //run loop until nextInSeries does not equal 1
			//display starting number and how many tries it took to complete
			System.out.println("\nStarting number of " + initial + " completed in " + counter + " steps\n");
		}
		//if the loop did not run forever display that all numbers eventually reach 4 2 1
		System.out.print("All numbers from 1 to 200 eventually reach 4 2 1");
		
	}
}
