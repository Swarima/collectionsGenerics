package com.zensar;

public class MarketingExecutive extends Employee7{
	private int kms;
	private double toura;
	private double telea;
 
	public MarketingExecutive()
	{
		kms=4;
		toura=5*kms;
		telea=2000;
	}

	public MarketingExecutive(int k)
	{
		kms=k;
		toura=5*k;
	}

	public void display()
	{
		super.display();
	System.out.println(kms+" "+toura+" "+telea);
	}

	public void calgs()
	{
	System.out.println(getSalary()+toura+telea);

	}


	public void calns()
	{
		System.out.println(getSalary()+toura+telea-(0.125*getSalary()));
		
	}




}

