package com.zensar;

public class Employee {
private int empid;
private String name;
private Date dob;

public Employee()
{
empid=1;
name="aaa";
dob=new Date();

}

public Employee(int id,String n,int d,int m,int y)
{
	empid=id;
	name=n;
	dob=new Date(d,m,y);
	
}


public void display()
{
	System.out.println(empid +" "+ name);
	dob.display();
}
}
