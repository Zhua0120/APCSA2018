package LabAssessment;

import java.util.Arrays;
import static java.lang.System.*;
import static java.util.Arrays.*;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.BufferedReader;

class Main {
  public static void main(String[] args) {
    out.println("This is the basketball program!");
    
    try {
      FileReader dataFile = new FileReader("scores.txt");
      BufferedReader buff = new BufferedReader(dataFile);
      
      String Name = buff.readLine();
		  int Teams = Integer.parseInt(buff.readLine());
		  
		  Division theDivision = new Division(Name, Teams);
		
  		for(int i=0; i<Teams; i++)
  		{
  			String Teamname = buff.readLine();
  			String TeamPoints = buff.readLine();			
  			theDivision.addTeam(i,new Team(Teamname, TeamPoints));
  		}
  		
  		out.println("\n\n"+theDivision);
  		theDivision.sort();
  
  		out.println("\n\n"+theDivision);
  		
  		out.println("Highest Team Average = " + theDivision.getBestTeam());
  		out.println("Lowest Team Average = " + theDivision.getWorstTeam());
  		out.println("Division average = " + theDivision.getDivisionAverage());
      
      buff.close();
      dataFile.close();
     }
    catch(FileNotFoundException e) {
        System.out.println("The data file scores.txt was not found or could not be opened.");
      }
      catch (Exception e) {
        System.out.println(e);
      }
  }
}