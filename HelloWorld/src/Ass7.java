 import java.util.Scanner;
public class Ass7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a,b,c,d;
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		System.out.println("Enter the numbers" +a+" "+b+" " +c);
		d=(a>b)?((a>c)?(a):(c)):((b>c)?(b):(c));
		System.out.println("Maximum is" +d);


	}

}
