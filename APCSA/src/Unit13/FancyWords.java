package Unit13;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;
import static java.lang.System.*;

public class FancyWords
{
	private String[] wordRay;

	public FancyWords(String sentence)
	{
		setWords(sentence);
	}

	public void setWords(String sentence)
	{
		wordRay = sentence.split(" ");
	}

	public String toString()
	{
		String output="";
		int max = 0;
		for (int i = 0; i<wordRay.length; i++) {
			if (wordRay[i].length()>max) {
				max=wordRay[i].length();
			}
		}
		
		return output+"\n\n";
	}
}