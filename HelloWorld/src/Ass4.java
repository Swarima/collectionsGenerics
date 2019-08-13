import java.util.Scanner;
public class Ass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		double bs,gs =0;
		System.out.println("enter bs");
		bs=sc.nextFloat();
		gs=0.15*(bs)+0.30*(bs)+0.125*(bs);
		System.out.println("ns"+ " "+(gs-(0.12*(gs))));

	}

}
