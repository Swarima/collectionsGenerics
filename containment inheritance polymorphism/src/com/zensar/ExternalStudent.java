package com.zensar;
import java.util.Scanner;
public class ExternalStudent extends Stud {
	private String s;
	private char grade;
	
	public ExternalStudent()
	{   super();
		s="abc";
		grade='a';
		
	}
	
	public ExternalStudent(String s1,char g,int no,String n,int d,int m,int y)
	{   super(no,n,d,m,y);
		s="s1";
		grade='g';
		
	}
	
	public void accept()
	{
		super.accept();
		Scanner sc=new Scanner(System.in);
		System.out.println("Grade and Institute");
		grade=sc.next().charAt(0);
		s=sc.next();
	}
	
	public void display()
	{
		super.display();
		System.out.println(s+" "+grade);
	}
	

}
