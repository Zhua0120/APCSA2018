package Unit7;

import java.util.Scanner;
import static java.lang.System.*;
import java.lang.Math;

public class GuessingGame
{
	private int upperBound;
	private int goal;
	
	public GuessingGame(int stop)
	{
		upperBound = stop;
		int target = (int) Math.floor(Math.random()*stop);
		goal = target;
	}

	public void playGame()
	{
		int count = 0;
		Scanner Adam = new Scanner(System.in);
		System.out.println("Enter a number betweeen 1 and " + upperBound);
		int guess = Adam.nextInt();
		while (guess != goal)
		{
			System.out.println("Enter a number betweeen 1 and " + upperBound);
			int guess1 = Adam.nextInt();
		}
		
	}

	public String toString()
	{
		String output="";
		return output;
	}
}