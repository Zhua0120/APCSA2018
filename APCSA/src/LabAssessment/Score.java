package LabAssessment;

public class Score {
	private double value;
	public Score(){
		value = 100;
	}
	public Score(double k){
		value = k;
	}
	public String getLetterGrade(){
		
		if(value>=90) return "Great";
		else if (value>=80) return "Good";
		else if (value>=70) return "Ok";
		else if (value >=60) return "Really?";
		return "Quit Now";
	}
	public double getNumScores(){
		return value;
	}
	public String toString(){
		return (String.format("%.2f", getNumScores()));
	}
}
