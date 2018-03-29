package Unit3;

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Quadratic
{
	private int a, b, c;
	private double rootOne;
	private double rootTwo;

	public Quadratic()
	{
		a=;
		b=;
		c=;
	}

	public Quadratic(int quadA, int quadB, int quadC)
	{
		quadA=a;
		quadB=b;
		quadC=c;
	}

	public void setEquation(int quadA, int quadB, int quadC)
	{
		quadA=a;
		quadB=b;
		quadC=c;
 	}

	public void calcRoots( )
	{
		rootOne=(-b+Math.sqrt((b)*(b)-4*(a)*(c)))/(2*a);
		rootTwo=(-b-Math.sqrt((b)*(b)-4*(a)*(c)))/(2*a);
	}

	public void print( )
	{
		System.out.println("rootone :: " +(String.format("%.3f",rootOne)));
		System.out.println("roottwo :: " +(String.format("%.3f",rootTwo)));
	}
}