/*
Hailstone_2.java
Max Rink
5 Nov 2015
ICS3U
run the hailstone problem and count the maximum number of tries for the numbers of 1-200
*/
package Assignement.Hailstone.Hailstone2;

public class Hailstone_2 {
	public static void main(String[] args) {
		// create integer nextInSeries and counter
		int nextInSeries, counter;
		// create integers tries and num with values of 0
		int tries = 0, num = 0;
		// create integer isEqual
		int isEqual;
		// for loop that runs 200 times
		for (int initial = 200; initial > 0; initial--) {
			//print the initial number to the screen
			System.out.println("initial number of " + initial + " ");
			//make nextInSeries equal to initial
			nextInSeries = initial;
			//reset counter
			counter = 0;
			//open do while loop
			do {
				isEqual = (nextInSeries % 2);
				switch (isEqual) {
				case 1:
					nextInSeries = nextInSeries * 3 + 1;
					break;
				case 0:
					nextInSeries /= 2;
					break;
				}
				System.out.print(nextInSeries + " ");
				counter++;

			} while (nextInSeries != 1); //run loop until nextInSeries is equal to 1
			//print the starting number and the number of tries it took to complete
			System.out.println("\nStarting number of " + initial + " completed in " + counter + " steps\n");
			if (counter > tries) { //if the number of steps it took the previous initial number is greater than the previously stored maximum 
				//make the maximum tries now equal to the new number of maximum tries
				tries = counter;
				//store the initial value for the maximum tries
				num = initial;
			}
		}
		//print the initial number that resulted in the largest number of tries and the number of steps it took to do so
		System.out.print("The maximum number of tries is " + tries + " for a starting number of " + num);
	}
}
