package rectangle_p3;
import java.util.Scanner;


public class Main
{
	public static void main(String[] args)
	{
		int len, wid, choice;
		rectangle_part_3 first = new rectangle_part_3();
		rectangle_part_3 second = new rectangle_part_3();
		first.lewi();
		Scanner input = new Scanner(System.in);
		System.out.print("Would you like to enter custom dimensions for the rectangle(1 for yes, 0 for no): ");
		choice = input.nextInt();
		if (choice == 0)
		{
			System.out.print("The area is "+first.getArea()+"\nThe perimeter is "+first.getPerimeter());
		}
		else if (choice == 1)
		{
			System.out.print("Enter the length for rectangle 1: ");
			len = input.nextInt();
			System.out.print("Enter the width for rectangle 1: ");
			wid = input.nextInt();
			first.lewi(len, wid);
			String rect;
			rect = first.toString();
			System.out.print(rect);
			System.out.print("\nEnter the length for rectangle 2: ");
			len = input.nextInt();
			System.out.print("Enter the width for rectangle 2: ");
			wid = input.nextInt();
			input.close();
			second.lewi(len, wid);
			second.toString();
		}
		if (first.equals(second)){
			System.out.print("\nThe rectangles are equal");
		}
		else{
			System.out.print("\nThe rectangles are not equal");
		}
	}
}
