package Unit7;

import java.util.Scanner;
import static java.lang.System.*;

public class Lab10e
{
	public static void main(String args[])
	{
		Scanner Adam1 = new Scanner(System.in);
		char response;
		System.out.println("Guessing Game - how many numbers? ");
		int input = Adam1.nextInt();
		GuessingGame Andy = new GuessingGame(input);
		Andy.playGame();
	}
}