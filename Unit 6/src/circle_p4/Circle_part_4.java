package circle_p4;
public class Circle_part_4
{ 
	private static final double PI = 3.14; 
	private double radius; 
	private String formula;
	public Circle_part_4(double r)
	{
		radius = r;
	}
	
	public Circle_part_4()
	{ 
		radius = 1; 	//default radius 
	}
	

	public void setRadius(double newRadius) 
	{
		radius = newRadius;
	} 

	public double area() 
	{ 
		double circleArea; 
		circleArea = PI * radius * radius; 
		return (circleArea); 
	}

	public double getRadius() 
	{
		return(radius); 
	}
	
	public double getCircumference()
	{
		double circ = (2*PI)*radius;
		return circ;
	}
	public String displayAreaFormula()
	{
		formula = "Length * Width";
		return formula;
	}
	public boolean equals (Object c)
	{
	Circle_part_4 testObj = (Circle_part_4)c; 
	if (testObj.getRadius() == radius) 
	{
	return(true); 
	}
	else 
	{ 
	return(false); 
	}
	}

	public String toString() 
	{
	String circleString; 
	circleString = "Circle has radius " + radius; 
	return(circleString);
	} 
}
