package Unit13;

import java.util.Arrays;
import static java.lang.System.*;

public class Lab15a
{
	public static void main(String args[])
	{
		WordSort trialone = new WordSort("abc ABC 12321 fred alexander");
		trialone.sort();
		System.out.println(trialone);
		
		WordSort trialtwo = new WordSort("a zebra friendly acrobatics 435 TONER PRinTeR");
		trialtwo.sort();
		System.out.println(trialtwo);
		
		WordSort trialthree = new WordSort("b x 4 r s y $");
		trialthree.sort();
		System.out.println(trialthree);
		
		WordSort trialfour = new WordSort("123 ABC abc 034 dog cat sally sue bob 2a2");
		trialfour.sort();
		System.out.println(trialfour);
		
	}
}