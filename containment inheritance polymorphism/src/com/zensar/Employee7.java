package com.zensar;

public class Employee7 {
	private int eid;
	private String name;
	private double salary; 
	
	public Employee7()
	{
		eid=1;
		name="hii";
		salary=1000;
	}
	
	public Employee7(int id,String n, int s)
	{
		eid=id;
		name=n;
		salary=s;
	}
	 public double getSalary()
	 {
		 return salary;
	 }
	
	 public void display()
	 {
		 System.out.println(eid+" "+name+" "+salary);
	 }

}
