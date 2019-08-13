package com.zensar;

import java.util.Scanner;

public class InternalStudent extends Stud {
	private String university;
	private double per;
	
	public InternalStudent()
	{    super();
		university="rgpv";
		per=80;
	}
	
	public InternalStudent(int no,String n,int d,int m,int y,String uni,double p)
	{  
		super(no,n,d,m,y);
		university="uni";
		per=p;
	}
	public void accept()
	{
		super.accept();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter Percentage and university");
		per=sc.nextDouble();
		university=sc.next();
	}
	
	public void display()
	{
		super.display();
		System.out.println(university+" "+per);
	}
	
	
	
	
	}
