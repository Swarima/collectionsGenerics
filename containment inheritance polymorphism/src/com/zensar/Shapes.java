package com.zensar;
import java.lang.*;

interface Polygon 
{
	
	 public double calPeri();
	 public double calArea();
}
class Triangle implements Polygon
{
	private int height,base,side1,side2,side3;
	
	public Triangle()
	{
		height=base=side1=side2=side3=1;
	}
	public double calArea()
	{
		return 0.5*base*height;
	}
	public double calPeri()
	{
		return side1+side2+side3;
	}
}
class Rectangle implements Polygon
{
	private int len,bre;
	
	public Rectangle()
	{
		len=bre=1;
	}
	public double calArea()
	{
		return len*bre;
	}
	public double calPeri()
	{
		return 2*(len+bre);
	}
}
class Square extends Rectangle
{
	private int len,bre;
	
	public Square()
	{
		len=bre=1;
	}
	public double calArea()
	{
		return len*bre;
	}
	public double calPeri()
	{
		return 2*(len+bre);
	}
}

public class Shapes {
	public static void main(String args[])
	{
		Polygon p1=new Square();
		System.out.println(p1.calPeri());
		System.out.println(p1.calArea());
		StringBuffer sb=new StringBuffer("zensar");
		sb.append('t');
		sb.append('e');
		sb.append('c');
		sb.append("hnologies");
		//String s= new String(sb);
		System.out.println(sb);



	}

}
