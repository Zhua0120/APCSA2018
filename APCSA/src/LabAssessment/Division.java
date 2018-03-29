package LabAssessment;

import java.util.ArrayList;
import java.util.Collections;

public class Division
{
	private String name;
	private ArrayList<Team> TeamList;
	
	public Division()
	{
		name="";
		TeamList=new ArrayList<Team>();
	}
	
	public Division(String Name, int Teams)
	{
		this.name=Name;
		TeamList=new ArrayList<Team>();
	
	}
	public ArrayList<Team> giveTeams(){
		return TeamList;
	}
	public void sort(){
		Collections.sort(TeamList);
	}
	public void addTeam(int TeamNum, Team t)
	{
		TeamList.add(t);
	}
	
	public String getDivisionName()
	{
	   return name;	
	}
	
	public double getDivisionAverage()
	{
		double temp=0.0;
		for(int i =0;i<TeamList.size();i++){
			temp+=getTeamAverage(i);
		}
		temp/=TeamList.size();
		return temp;
	}
	
	public double getTeamAverage(int TeamNum)
	{
		return TeamList.get(TeamNum).getAverage();
	}

	public double getTeamAverage(String TeamName)
	{
		int i=0;
		while(!TeamList.get(i).getName().equals(TeamName))i++;
		return getTeamAverage(i);
	}
	
	public String getTeamName(int TeamNum)
	{
		return TeamList.get(TeamNum).getName();
	}

	public String getBestTeam()
	{
	  sort();
	  return TeamList.get(TeamList.size()-1).getName();
	}

	public String getWorstTeam()
	{
	  sort();
	  return TeamList.get(0).getName();
	}
	public String toString()
	{
		String output=""+getDivisionName()+"\n";
		
		for(Team i:TeamList){
			output+=i+"\t"+"avg="+String.format("%.2f", i.getAverage())+"\n";
		}
		return output;
	}  	
}