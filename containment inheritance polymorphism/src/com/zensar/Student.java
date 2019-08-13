package com.zensar;

public class Student {
private int rollno;
private String name;
private Address add;

public Student()
{
	rollno=1;
	name="mouse";
	add=new Address();
}

public Student(int r,String n,String s,String a,String c,String st)
{
	rollno=r;
	name=n;
	add=new Address(s,a,c,st);
}

public void display()
{
	System.out.println(rollno+" "+name+" ");
	add.display();
	
}
}
