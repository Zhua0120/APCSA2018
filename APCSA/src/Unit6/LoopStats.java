package Unit6;

import static java.lang.System.*;

public class LoopStats
{
	private int start, stop;

	public LoopStats()
	{
		start =0;
		stop=0;
	}

	public LoopStats(int beg, int end)
	{
		start=beg;
		stop=end;
	}

	public void setNums(int beg, int end)
	{
		start=beg;
		stop=end;
	}

	public int getEvenCount()
	{
		int evenCount=0;
		for (int i=start;i<=stop;i++)
			if (i%2==0)
			{
				evenCount=evenCount+1;
			}
		return evenCount;
	}

	public int getOddCount()
	{
		int oddCount=0;
		for (int i=start;i<=stop;i++)
			if (i%2==0)
			{
				oddCount=oddCount+1;
			}
		return oddCount;
	}

	public int getTotal()
	{
		int total=0;
		for (int i=start;i<=stop;i++)
		{
			total=total+i;
		}
		return total;
	}
	
	public String toString()
	{
		String output =" "+ start + " " + stop + "\n total " + getTotal()+"\n evenCount " + getEvenCount()+"\n oddCount " + getOddCount();
		return output;
		
	}
}