package Unit10;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;
import java.util.Random;

public class MadLib
{
	private ArrayList<String> verbs;
	private ArrayList<String> nouns;
	private ArrayList<String> adjectives;
	
	public MadLib()
	{
	}

	public MadLib(String fileName)
	{
		loadNouns();
		loadVerbs();
		loadAdjectives();
		try{
			Scanner file = new Scanner(new File(fileName));
		}
		catch(Exception e)
		{
			out.println("Houston we have a problem!");
		}
		
	}

	public void loadNouns()
	{
		try{
			Scanner file = new Scanner(new File(System.getProperty("user.dir")+"\\src\\Lab16d\\nouns.dat"));
			while(file.hasNextLine()){
				nouns.add(file.nextLine());
			}
		}
		catch(Exception e)
		{
			out.println("Houston we have a problem!");
		}	
		
	}
	
	public void loadVerbs()
	{
		try{
			Scanner file = new Scanner(new File(System.getProperty("user.dir")+"\\src\\Lab16d\\verbs.dat"));
			while(file.hasNextLine()){
				verbs.add(file.nextLine());
			}
		}
		catch(Exception e)
		{
			out.println("Houston we have a problem!");
		}
	}

	public void loadAdjectives()
	{
		try{
			Scanner file = new Scanner(new File(System.getProperty("user.dir")+"\\src\\Lab16d\\adjectives.dat"));
			while(file.hasNextLine()){
				verbs.add(file.nextLine());
			}
		}
		catch(Exception e)
		{
			out.println("Houston we have a problem!");
		}
	}

	public String getRandomVerb()
	{
		Random r = new Random();
		return verbs.get(r.nextInt(verbs.size()));
	}
	
	public String getRandomNoun()
	{
		Random r = new Random();
		return nouns.get(r.nextInt(nouns.size()));		
	}
	
	public String getRandomAdjective()
	{
		Random r = new Random();
		return adjectives.get(r.nextInt(adjectives.size()));
	}		

	public String toString()
	{
	   return "\n\n\n";
	}
}