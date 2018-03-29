package Unit8;

public class Lab14d {
	public static void main( String args[] )
	{
		double[] one = {100,90,85,72.5,95.6};
		System.out.println(Grades.toString(one));
		System.out.println(Grades.getAverage(one));
		double[] two = {50.0,100.0,80.0};
		System.out.println(Grades.toString(two));
		System.out.println(Grades.getAverage(two));
		double[] three = {93.4,-90.0,90.0};
		System.out.println(Grades.toString(three));
		System.out.println(Grades.getAverage(three));
		double[] four = {1,2,3,4,5,6,7,8,9};
		System.out.println(Grades.toString(four));
		System.out.println(Grades.getAverage(four));
	}
}