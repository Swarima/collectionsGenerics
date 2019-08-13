import java.util.Scanner;
public class Ass14{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a;
		int d=1;
		int n=sc.nextInt();
		int k=n;
			a=n/2;
		while(a!=1 ) {
			if(n%a==0)
				d=d+a;
			a=a-1;

		}
		if(k==d)
		{
			System.out.println("perfect no");
		}
		
		else
			System.out.println("not a perfect no");
		
	
	}

}
