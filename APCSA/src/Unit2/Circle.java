package Unit2;

public class Circle
{
	private double radius;
	private double area;
	private double pi=3.14159;

	public void setRadius(double rad)
	{
		radius =rad;
	}

	public void calculateArea( )
	{
		area= pi*radius*radius;
	}

	public void print( )
	{
		System.out.println("The area is :: " + area);
	}
}