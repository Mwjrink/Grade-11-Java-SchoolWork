package Assignement;

import java.io.*;

public class Hailstone_on_steroids {
	public static void main(String[] args) {
		File dataFile = new File("..\\MaxValue.txt");
		FileWriter out;
		BufferedWriter writeFile;

		long c, x = 0, tries = 0, num = 0;
		int f;
		for (long i = 9223372036854L; i > 0; i--) {
			System.out.println("initial number of " + i + " ");
			c = i;
			x = 0;
			do {
				f = (int) (c % 2);
				switch (f) {
				case 1:
					c = c * 3 + 1;
					break;
				case 0:
					c /= 2;
					break;
				}
				System.out.print(c + " ");
				x++;

			} while (c != 1);
			System.out.println("\nStarting number of " + i + " completed in " + x + " steps\n");
			if (x > tries) {
				System.out.println(x);
				tries = x;
				num = i;
			}
			
			try {
				out = new FileWriter(dataFile);
				writeFile = new BufferedWriter(out);
				writeFile.write("The maximum number of tries is " + tries + " for a starting number of " + num);
				writeFile.newLine();
				writeFile.close();
				out.close();
			} catch (IOException e) {
				System.out.println("Problem writing to file.");
				System.err.println("IOException: " + e.getMessage());
			}
		}
	}
}