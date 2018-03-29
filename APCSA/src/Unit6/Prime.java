package Unit6;

import static java.lang.System.*;
import java.lang.Math;

public class Prime
{
	private int number;

	public Prime()
	{
		number=0;
	}

	public Prime(int num)
	{
		number=num;
	}

	public void setPrime(int num)
	{
		number=num;
	}

	public boolean isPrime()
	{
		if (number<2)
		{
			return true;
		}
		for (int c=2; c<=Math.floor(Math.sqrt(number));c++)
		{
			if (number% c ==0)
			{
				return false;
			}	
		}	
		return true;
	}	
	
	public String toString()
	{
		String output;
			if (isPrime())
			{
				output="The number " + number + " is prime";
			}
			else
			{
				output="The number " + number + " is not prime";
			}
		return output;
	}
}