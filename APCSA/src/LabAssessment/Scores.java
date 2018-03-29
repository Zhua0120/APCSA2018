package LabAssessment;

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;
import java.util.ArrayList;

public class Scores
{
	private ArrayList<Score> Scores;
	public Scores()
	{
		setScores("");
	}
	
	public Scores(String scoreList)
	{
		setScores(scoreList);		
	}
	
	public void setScores(String scoreList)
	{
		Scanner s = new Scanner(scoreList);
		int n = (s.nextInt());
		String waste = s.next();
		Scores=new ArrayList<Score>();
		for(int i =0;i<n;i++){
			Scores.add(new Score());
		}
	}
	
	public void setScore(int spot, double score)
	{
		Scores.set(spot, new Score());
	}
	
	public double getSum()
	{
		double sum=0.0;
		for(int i =0;i<Scores.size();i++){
			sum+=Scores.get(i).getNumScores();
		}
		return sum;
	}
	
	public double getWorstTeam()
	{
		double low = Double.MAX_VALUE;
		for(int i =0;i<Scores.size();i++)if(Scores.get(i).getNumScores()<low) low = Scores.get(i).getNumScores();
		return low;
	}
	
	public double getBestTeam()
	{
		double high = Double.MIN_VALUE;
		for(int i =0; i<Scores.size();i++) if(Scores.get(i).getNumScores()>high) high=Scores.get(i).getNumScores();

		return high;
	}
	
	public int getNumScores()
	{
		return Scores.size();
	}
	public ArrayList<Score> giveScores(){return Scores;}
	public String toString()
	{
		String output="";
		for(int i =0;i<Scores.size();i++){
			output+=Scores.get(i)+" ";
		}
		return output;
	}	
}