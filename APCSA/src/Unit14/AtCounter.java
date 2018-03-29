package Unit14;

import static java.lang.System.*;

public class AtCounter
{
   private char[][] atMat;
   private int atCount;

	public AtCounter()
	{
		atCount=0;
		atMat = new char[][]{{'@','-','@','-','-','@','-','@','@','@'},
							 {'@','@','@','-','@','@','-','@','-','@'},
							 {'-','-','-','-','-','-','-','@','@','@'},
							 {'-','@','@','@','@','@','-','@','-','@'},
							 {'-','@','-','@','-','@','-','@','-','@'},
							 {'@','@','@','@','@','@','-','@','@','@'},
							 {'-','@','-','@','-','@','-','-','-','@'},
						 	 {'-','@','@','@','-','@','-','-','-','-'},
							 {'-','@','-','@','-','@','-','@','@','@'},
							 {'-','@','@','@','@','@','-','@','@','@'}};
	}

	public int countAts(int r, int c)
	{
		if (r > -1 && r < 10 && c > -1 && c < 10) {
		if (atMat[r][c]=='@'){
			atCount++;
			atMat[r][c]='-';
			countAts(r+1,c);
			countAts(r-1,c);
			countAts(r,c+1); 
			countAts(r,c-1);
			}
		}
		return atCount;
	}
}