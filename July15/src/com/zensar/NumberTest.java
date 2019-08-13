package com.zensar;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class NumberTest {
	public static void main(String args[])
	{
		double avg;
		List<Double> li=new ArrayList<>();
		li.add(25.70);
		li.add(16.25);
		li.add(45.85);
		li.add(35.5);
		li.add(12.25);
		double sum=0;
		Iterator<Double> it=li.iterator();
		while(it.hasNext())
		{
			sum=sum+it.next();
		}
		System.out.println(avg=(sum)/5);
		for(int i=0;i<li.size();i++)
		{
			
				System.out.println(it1.next());
			}
			
			
			
		}
		
		
	}
}

