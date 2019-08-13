import java.util.Scanner;
import java.math.*;
public class Ass8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int num,c;
	double d=0;
	Scanner sc=new Scanner(System.in);
	num=sc.nextInt();
	int a;
	a=num;
	while((num%10)>0) {
		c=num%10;
		num=num/10;
		d =d + (Math.pow(c,3));
	}
if(a==d) {
	System.out.println("Armstrong number");
}
else
	System.out.println("not an armstrong number");
	}

}
