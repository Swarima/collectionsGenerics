package com.zensar;

public class SalesPerson extends WagueEmployee {

	private int noofitems;
	private int commision;
	 double ssalary;
	
	public SalesPerson()
	{
		super();
		noofitems=2;
		commision=4;
	}
	
	public SalesPerson(int id,String n,int d,int m,int y,int h,int r,int nof,int c)
	{
		super(id,n,d,m,y,h,r);
		noofitems=nof;
		commision=c;
	}
	
	public void display()
	{
		System.out.println("noofitems"+" "+commision);
		super.display();
	}
	
	public void calculate()
	{
		super.calculate();
		ssalary=wsalary+noofitems*commision;
		System.out.println("ssalary" +ssalary);
	}
	
}
