package com.zensar;

public class Address {

		private String street;
		private String area;
		private String city;
		private String state;
		
		public Address()
		{
			street="achchi hai";
			area="or bhi achcha";
			city="shandaar";
			state="zabardast";
		}
		
	public Address(String s,String a,String c,String st)
	{
		street=s;
		area=a;
		city=c;
		state=st;
	}
public void display()
{
	System.out.println("Street Area City State "+street +area +city +state);
}
		
	}


