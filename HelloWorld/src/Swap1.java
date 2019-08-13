import java.util.Scanner;
public class Swap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		System.out.println("Enter the numbers");
		a=sc.nextInt();
		b=sc.nextInt();
		c=a;
		a=b;
		b=c;
		System.out.println("After swapping" + a +" " +b);

	}

}
