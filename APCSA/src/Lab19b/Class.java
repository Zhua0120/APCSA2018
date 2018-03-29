package Lab19b;

import java.util.Scanner;
import static java.lang.System.*;
import java.util.Arrays;


import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;

public class Class
{
	private String name;
	private Student[] studentList;
	
	public Class()
	{
		name="";
		studentList=new Student[0];
	}
	
	public Class(String name, int stuCount)
	{
		this.name=name;
		studentList=new Student[stuCount];
	}
	
	public void addStudent(int stuNum, Student s)
	{
		studentList[stuNum]=s;
	}
	
	public String getClassName()
	{
	   return name;	
	}
	
	public double getClassAverage()
	{
		sort();
		double classAverage=0.0;
		for(Student s:studentList){
			classAverage+=s.getAverage();
		}
		classAverage/=studentList.length;
		return classAverage;
	}
	
	public double getStudentAverage(int stuNum)
	{
		return studentList[stuNum].getAverage();
	}

	public double getStudentAverage(String stuName)
	{
		for(Student s:studentList){
			if(s.getName().equals(stuName)){
				return s.getAverage();
			}
		}
		return 0;
	}
	
	public String getStudentName(int stuNum)
	{
		return studentList[stuNum].getName();
	}

	public String getStudentWithHighestAverage()
	{
		sort();
		return studentList[studentList.length-1].getName();
	}

	public String getStudentWithLowestAverage()
	{
		sort();
		return studentList[0].getName();
	}
	
	public String getFailureList(double failingGrade)
	{
		sort();
		String output="";
		for(int i=0;i<studentList.length;i++){
			if(getStudentAverage(i)<=failingGrade){
				output+=getStudentName(i)+" ";
			}
		}
		output+="\n";
		return output;
	}
	
	public void sort(){
		Arrays.sort(studentList);
	}
	
	public String toString()
	{
		String output=""+getClassName();
		for(Student s:studentList){
			output+=s+"\t"+String.format("%.2f", s.getAverage())+"\n";
		}
		return output;
	}  	
}