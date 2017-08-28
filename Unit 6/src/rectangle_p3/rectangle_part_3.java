package rectangle_p3;

public class rectangle_part_3
{
	int length, width;
	int perim, area;
	public String toString()
	{
		perim = length*2 + width*2;
		area = length*width;
		String rect;
		rect = "The area of the rectangle is "+area+"\nThe perimeter is "+perim;
		return rect;
	}
	
	public void lewi()
	{
		length = 4;
		width = 6;
	}
	
	public void lewi(int l, int w)
	{
		length = l;
		width = w;
	}
	
	public int getlength()
	{
		return length;
	}
	public int getwidth()
	{
		return width;
	}
	
	public int getPerimeter()
	{
		perim = length*2 + width*2;
		return perim;
	}
	
	public int getArea()
	{
		area = length*width;
		return area;
	}
	public void displayAreaFormula()
	{
		System.out.print("2 * PI * radius");
	}
	public boolean equals (Object c)
	{
		rectangle_part_3 testObj = (rectangle_part_3)c; 
		if (testObj.getlength() == length && testObj.getwidth() == width) {
			return(true); 
		}
			else { 
				return(false); 
			}
	}
}
