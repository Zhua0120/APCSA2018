package Unit6;
import java.util.Scanner;

public class Lab08g {
	public static void main ( String[] args )
	{
	Scanner Adam = new Scanner(System.in);
	LoopStats Andy = new LoopStats();
	System.out.println("Enter start:: ");
	int start = Adam.nextInt();
	System.out.println("Enter end:: ");
	int end = Adam.nextInt();
	Andy.setNums(start, end);
	Andy.getEvenCount();
	Andy.getOddCount();
	Andy.getTotal();
	System.out.println(Andy);
	System.out.println("Enter start:: ");
	int start1 = Adam.nextInt();
	System.out.println("Enter end:: ");
	int end1 = Adam.nextInt();
	Andy.setNums(start1, end1);
	Andy.getEvenCount();
	Andy.getOddCount();
	Andy.getTotal();
	System.out.println(Andy);
	System.out.println("Enter start:: ");
	int start2 = Adam.nextInt();
	System.out.println("Enter end:: ");
	int end2 = Adam.nextInt();
	Andy.setNums(start2, end2);
	Andy.getEvenCount();
	Andy.getOddCount();
	Andy.getTotal();
	System.out.println(Andy);
	}
}
