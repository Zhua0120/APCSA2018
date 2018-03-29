package LabAssessment;

import java.util.Scanner;
import static java.lang.System.*;
import java.lang.Comparable;

public class Team implements Comparable<Team>
{
	private String TeamName;
	private Scores TeamPoints;
	
	public Team()
	{
		setName("");
		setScores("");
	}
	
	public Team(String name, String PointList)
	{
		setName(name);
		setScores(PointList);
	}
	
	public void setName(String name)
	{
		TeamName = name;
	}	
	
	public void setScores(String scoreList)
	{
		TeamPoints =new Scores(scoreList);
	}
	
	public void setScore(int spot, double score)
	{
		TeamPoints.setScore(spot, score);
	}

	public String getName()
	{
		return TeamName;
	}
	
	public int getNumScores()
	{
		return TeamPoints.getNumScores();
	}

	public double getSum()
	{
		return TeamPoints.getSum();
	}
	
	public double getAverage()
	{
		return getSum()/getNumScores();
	}

		public String toString()
	{
		return TeamName+" = " + TeamPoints;
	}	
	public int compareTo(Team d){
		if (getAverage()-d.getAverage()>0) return 1;
		else if(getAverage()-d.getAverage()==0) return 0;
		return -1;
	}
}