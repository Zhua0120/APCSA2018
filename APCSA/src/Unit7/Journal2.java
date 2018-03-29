package Unit7;

import java.util.Scanner;

public class Journal2 {

	public static int reverse(int number)
	{
		int reverse=0;
		int temp=number;
		while (temp>0)
		{
			reverse=reverse*10+temp/10;
			temp=temp/10;
		}
		return reverse;
	}	
	public static boolean isPalindrone(int number)
	{
		return number ==reverse(number);
	}
	
	
	
	 public static void main( String args[] )
	   {
		 System.out.println(isPalindrone(343));		 
		 System.out.println(isPalindrone(344));
	   }
}
