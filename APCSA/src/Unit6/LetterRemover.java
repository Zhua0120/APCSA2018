package Unit6;

public class LetterRemover
{
   private String sentence, sentence1;
   private char lookFor;

	public LetterRemover()
	{
		sentence="";
		lookFor='a' ;
	}

	public LetterRemover(String s, char rem)
	{
		sentence = s;
		lookFor = rem;
		sentence1 = sentence;
	}
		
	public void setRemover(String s, char rem)
	{
		sentence = s;
		lookFor = rem;
		sentence1 = sentence;
	}

	public String removeLetters()
	{
		while (sentence.indexOf(lookFor)==0)
		{
			sentence=sentence.substring(1);
			while (sentence.indexOf(lookFor)>0)
			{
				sentence = sentence.substring(0, sentence.indexOf(lookFor)-1)+
			               sentence.substring(sentence.indexOf(lookFor)+1);
			}
		}
		String cleaned=sentence;
		return cleaned;
	}

	public String toString()
	{
		String output= sentence1 + " - letter to remove " + lookFor + "\n" + removeLetters();
		return output;
	}
}