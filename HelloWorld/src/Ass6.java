import java.util.Scanner;
public class Ass6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		long a,b;
		int c=0;
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("For addition press 1" + "For subtraction press 2"+ "For multiplication press 3"+ "For division press 4");
		c=sc.nextInt();
		switch(c) {
		case 1:
		System.out.println("add is" + " "+(a+b));
		break;
		case 2:
		System.out.println("sub is" + " "+(a-b));
		break;
		case 3:
		System.out.println("mul is" + " "+(a*b));
		break;
		case 4:
			if(b==0)
			{
				System.out.println("not divisible");
			}
			else
		System.out.println("div is" + " "+(float)(a/b));
		
			
		break;
		}
	}

}
