package circle_p4;

public class project51
{
	public static void main(String[] args) 
	{
		Circle_part_4 spot1 = new Circle_part_4(3.0); 
		Circle_part_4 spot2 = new Circle_part_4(4.0); 
		if (spot1.equals(spot2)) { 
			System.out.println("Objects are equal."); 
		}
		else { 
			System.out.println("Objects are not equal.");
				}
		System.out.println(spot1); 
		System.out.println(spot2); 
		}
}
