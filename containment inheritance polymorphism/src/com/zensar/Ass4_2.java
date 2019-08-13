package com.zensar;

interface printable
{
	public void printDetails();
}

class CktPlayer implements printable
{
private String name;
private int runs;

public void printDetails() {
	System.out.println("hiiiii");
}

}

class FtPlayer implements printable
{
	private String name;
	private int goals;
	
	public void printDetails() {
		System.out.println("hello");

}

}


public class Ass4_2 {

	public static void main(String[] args) {
		FtPlayer fp=new FtPlayer();
		fp.printDetails();
		CktPlayer ckt =new CktPlayer();
		ckt.printDetails();
	}
	}


