package com.zensar;

public class WagueEmployee extends Employee
{
private int hours;
private int rate;
double wsalary;

public WagueEmployee()
{
	super();
	hours=0;
	rate=0;
}

public WagueEmployee(int id,String n,int d,int m,int y,int h,int r)
{
	super(id,n,d,m,y); // to call paramaterized constructor of parent classs
	hours=h;
	rate=r;
}
public void display()
{
	super.display(); //to display parent class
	System.out.println(hours +" "+ rate);
	//this.display(); present class display
}

public void calculate()
{
	wsalary=hours*rate;
	System.out.println("wsalary" +wsalary);

}
}
