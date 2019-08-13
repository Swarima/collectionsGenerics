package com.zensar;
class AccountHolder{
	private static int acc;
	private String name;
	private double bal;	
	private int accno;

	static
	{
		acc=1;
	}

public AccountHolder()
{
	accno=++acc;
	name="abc";
	bal=1000;
	}

public AccountHolder(int ac,String n,double b)
{
	accno=++acc;
	name=n;
	bal=b;
}

public void display()
{
	System.out.println("accno "+accno);
}

}
public class Ass3_2 {

	public static void main(String[] args) {
		AccountHolder ah1=new AccountHolder();
		//ah1.display();-+
		

		AccountHolder ah2=new AccountHolder();
		//ah2.display();

		AccountHolder ah3=new AccountHolder();

		AccountHolder ah4=new AccountHolder(1,"lee",100);

		ah1.display();
		ah2.display();
		ah3.display();
		ah4.display();
   
	}

}
