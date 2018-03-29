package Unit3;

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Lab03c
{
	public static void main( String[] args )
   {
   	//add test cases
   	Scanner quad = new Scanner(System.in);
   	Quadratic q = new Quadratic();
	System.out.println("Enter a :: ");	
	 =quad.nextInt();	
	System.out.println("Enter b :: ");	
	 =quad.nextInt();	
	System.out.println("Enter c :: ");	
	 =quad.nextInt();	

	q.calcRoots();
	q.print();
	
	}
}