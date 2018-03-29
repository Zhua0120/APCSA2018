package Unit8;

public class Grades
{
	public static double getSum(double[] numArray)
	{
		double sum=0;
		for(int i=0; i<numArray.length; i++)
		{
			sum=sum+numArray[i];
		}
		return sum;
	}

	public static double getAverage(double[] numArray)
	{
		double total = getSum(numArray);
		double length = numArray.length;
		double average= total/length;
		return average;
	}

	public static String toString(double[] numArray)
	{
		String output="";
		for (int i=0; i<numArray.length;i++){
			output=output+"grade " + i + ":: " +numArray[i] + "\n";
		}
		return output;
	}

}