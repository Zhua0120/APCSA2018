package Unit14;

import java.util.Scanner;
import java.util.Arrays;
import static java.lang.System.*;

public class FancyWord
{
	private char[][] mat;
	private int line = 0;
	
	public FancyWord()
	{	
	}

   public FancyWord(String s)
	{
	  mat = new char[s.length()][s.length()];
	   
   	   for (int i = 0; i < s.length(); i++){
   		   mat[0][i] = s.charAt(i);
   		   for (int j = i+1; j<s.length()-j; j++) {
   			   mat[j][i]=s.charAt(i);   		   
   		  }
   	   }
	}

	public String toString()
	{
		String output="";
		output = Arrays.deepToString(mat);
		return output+"\n\n";
	}
}