package com.zensar;
import java.util.Scanner;
public class Ass4_3 
{
    public static void printObjects(Stud s)
    {
    	s.display();
    }	
	public static void main(String[] args) {
		Stud []s=new Stud[10];
		int ch;
		Scanner sc=new Scanner(System.in);
		int control=0,loopc=0;
		while(control<s.length) {
		System.out.println("1.for inserting students \n 2.display \n 3.exit");
		System.out.println("Enter choice:");
		ch=sc.nextInt();
		switch(ch)
		{

		case 1:	{
			System.out.println("Enter 1<--internal Student \n 2<--External Student");
				int ch1=sc.nextInt();
				switch(ch1) {
				case 1:
					s[loopc]=new InternalStudent();
					s[loopc].accept();
					loopc++;
					break;
				case 2:
					s[loopc]=new ExternalStudent();
					s[loopc].accept();
					loopc++;
					break;
				}}
		case 2:
			for(int k=0;k<loopc;k++) {
				printObjects(s[k]);
		}
			break;
		case 3:
			System.exit(0);
			
		}
		control++;
		}
	}
}

		
			
			
			
			
			
			
			
			
	