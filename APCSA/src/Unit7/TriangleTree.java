package Unit7;

public class TriangleTree
{
   private int size;
   private String letter;

	public TriangleTree()
	{
	}

	public TriangleTree(int count, String let)
	{
		size=count;
		letter=let;
	}

	public void setTriangle( String let, int sz )
	{
		size=sz;
		letter=let;
	}

	public String getLetter()
	{
		for (int i=1; i<=size; i++)
		{
			String space ="";
			String notspace ="";
			for (int j=1; j<=size-1 ;j++)
			{
				space=space+" ";
			}
			for (int k=1; k<=size;k++)
			{
				notspace=notspace+letter;
			}
		}
		String tree= space+notspace;
	}

	public String toString()
	{
		String output="";
		return output+"\n";
	}
}