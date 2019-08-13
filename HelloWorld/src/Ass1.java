import java.util.Scanner;
public class Ass1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int m1,m2,m3,m4,m5;
		float avg;
		System.out.println("Enter the marks");
		m1=sc.nextInt();
		m2=sc.nextInt();
		m3=sc.nextInt();
		m4=sc.nextInt();
		m5=sc.nextInt();
		avg = (m1+m2+m3+m4+m5)/5;
		System.out.println("average is" + avg);
	}

}
