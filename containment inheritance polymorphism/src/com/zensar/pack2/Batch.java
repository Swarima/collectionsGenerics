package com.zensar.pack2;

public class Batch {
	private String CourseName;
	private int BatchStrength;
	
	public Batch()
	{
		CourseName="PCM";
		BatchStrength=30;
		
	}
	
	public Batch(String course,int batch)
	{
		CourseName=course;
		BatchStrength=batch;
		
	}
	
	public static void fun()
	{
		System.out.println("Brand new day");
	}
	
	public void display()
	{
	System.out.println("name and strength is "+CourseName +BatchStrength );
	}
	
	
	
	
	
	
	

}
