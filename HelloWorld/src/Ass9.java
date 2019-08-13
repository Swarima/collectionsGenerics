import java.util.Scanner;

public class Ass9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num,res=1;
		System.out.println("Enter a nnumber");
		num=sc.nextInt();
		for(int i=2;i<num/2;i++) {
			if(num%i==0) {
				res=0;
			break;}
		}
		if(res!=0) 
			System.out.println("Prime");
		else
			System.out.println("Not Prime");
	}

}



