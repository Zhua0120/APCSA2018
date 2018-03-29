package Unit7;
import java.util.Scanner;

public class Journal1 {
	public static void main ( String[] args )
	{
		Scanner Adam = new Scanner(System.in);
		System.out.println("Enter a decimal integer between 255 and 0:: ");
		int input = Adam.nextInt();
		if (input>=128)
		{
			System.out.print("1");
			input=input-128;
		}
		else 
		{
			System.out.print("0");	
		}
		if (input>=64)
		{
			System.out.print("1");
			input=input-64;
		}
		else 
		{
			System.out.print("0");	
		}
		if (input>=32)
		{
			System.out.print("1");
			input=input-32;
		}
		else 
		{
			System.out.print("0");	
		}
		if (input>=16)
		{
			System.out.print("1");
			input=input-16;
		}
		else 
		{
			System.out.print("0");	
		}
		if (input>=8)
		{
			System.out.print("1");
			input=input-8;
		}
		else 
		{
			System.out.print("0");	
		}

		if (input>=4)
		{
			System.out.print("1");
			input=input-4;
		}
		else 
		{
			System.out.print("0");	
		}

		if (input>=2)
		{
			System.out.print("1");
			input=input-2;
		}
		else 
		{
			System.out.print("0");	
		}
		if (input>=1)
		{
			System.out.print("1");
			input=input-1;
		}
		else 
		{
			System.out.print("0");	
		}

	}
}
