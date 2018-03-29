package Unit6;

import java.util.Scanner;

public class Lab09f {
	public static void main ( String[] args )
	{
	Scanner Adam = new Scanner(System.in);
	LetterRemover Andy = new LetterRemover();
	System.out.println("Enter string :: ");
	String initial = Adam.nextLine();
	System.out.println("Enter removed :: ");
	char removed = Adam.next().charAt(0);
	Andy.setRemover(initial, removed);
	Andy.removeLetters();
	System.out.println(Andy);
	}
}
