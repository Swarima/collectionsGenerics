package com.zensar;

import java.util.ArrayList;

public class Test {

	public static float calculateCustomerBill(ArrayList<IceCream> icecreams)
	{
		float sum=0f;
		for(IceCream ic:icecreams)
		sum=sum+ic.getPrice();
		return sum;
	}
	
	public static String getflavourOfMaxPriceIcecream(ArrayList<IceCream> icecream) 
	{
		System.out.println();
	}
	
	
	
	public static void main(String[] args) {

			 ArrayList<IceCream> li=new ArrayList<>();
			 li.add(new IceCream("chocolate",20 ));
			 li.add(new IceCream("vanila",12 ));
			 li.add(new IceCream("pista",15 ));
			 li.add(new IceCream("almond",17));
			 System.out.println(calculateCustomerBill(li));

			 

		} 

		
	}


