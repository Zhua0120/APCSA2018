package Unit2;

public class Line {
	private int xOne,yOne, xTwo, yTwo;
	private double slope;

	public void setCoordinates(int x1, int y1, int x2, int y2)
	{
		xOne=x1;
		yOne=y1;
		xTwo=x2;
		yTwo=y2;
	}

	public void calculateSlope( )
	{
		slope=1.0*(yTwo-yOne)/(xTwo-xOne);
	}

	public void print( )
	{
		System.out.println("The slope is ::" + String.format("%.3f",slope));
	}
}