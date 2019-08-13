package com.zensar;
import java.util.Scanner;
class Product{
	private int pro_id;
	private String name;
	private double cost;
	private static int count;
	
	Product()
	{
		count++;
	}
	
	Product(int pid,String n,double c) {
		count++;
		}
	
	public static void display()
	{
		System.out.println("no of counts= " +count);
	}
	
	static
	{
		count=0;
	}
}
public class Ass3_1 {

	public static void main(String[] args) {
		Product p1=new Product();
		Product p2=new Product();
		Product p3=new Product();
		Product p4=new Product(1,"xyz",245);
		Product.display();

	}

}
