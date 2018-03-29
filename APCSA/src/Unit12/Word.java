package Unit12;

public class Word implements Comparable<Word>
{
	private String word;

	public Word( String s )
	{
		word=s;
	}

	public int compareTo( Word rhs )
	{
		if (word.length()>rhs.word.length()){	
		return 1;
		}
		else if (word.length()<rhs.word.length()){	
		return -1;
		}
		return 0;
	}

	public String toString()
	{
		return "";
	}
}