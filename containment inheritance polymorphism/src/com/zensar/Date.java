package com.zensar;
import java.util.Scanner;
public class Date {
	private int dd,mm,yy;
	Date()
	{
		dd=1;
		mm=1;
		yy=2200;
	}

	Date(int d,int m,int y)
	{
		dd=d;mm=m;yy=y;
	}
	void display()
	{
		System.out.println(dd+" "+mm+" "+yy);
	
	}
	void accept() {
		Scanner sc=new Scanner(System.in);
	System.out.println("Enter dob");
		dd=sc.nextInt();
		mm=sc.nextInt();
		yy=sc.nextInt();
	}





	
	}
