package com.zensar;

public class Manager extends Employee7 {
private double pa;
private double fa;
private double oa;

public Manager()
{
	pa = 0.08* getSalary();
	fa=0.12*getSalary();
	oa=0.04*getSalary();
	
}

public Manager(int id,String n, int s)
{
	super(id,n,s);
}

public void display()
{
	super.display();
System.out.println(pa+" "+fa+" "+oa);
}


public void calgs()
{
System.out.println(getSalary()+pa+fa+oa);

}

public void calns()
{
	System.out.println(getSalary()+(pa+fa+oa)-(0.125)*(getSalary()));
}



}
