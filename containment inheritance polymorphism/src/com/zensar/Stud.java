package com.zensar;
import java.util.Scanner;
public class Stud extends Date
{
	private int rollno;
	private String name;
	private Date dob;
	Scanner sc=new Scanner(System.in);
	public Stud()
	{
		rollno=1;
		name="lily";
		dob=new Date();
	}
	public Stud(int no,String n,int d,int m,int y)
	{
		rollno=no;
		name=n;
		dob=new Date(d,m,y);
	}
	
	public void display()
	{
		super.display();
		System.out.println(rollno+" "+name);
	}
	public void accept() {
		super.accept();
		System.out.println("enter rollno,name:");
		rollno=sc.nextInt();
		name=sc.next();
	}
	
}
