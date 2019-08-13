import java.util.Scanner;
public class Ass5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		double bs,tsa,comm,ns;
		bs=sc.nextDouble();
		tsa=sc.nextDouble();
		if(tsa>=5000&&tsa<=7500) {
			comm=0.03*tsa;
			ns=bs+comm;
			System.out.println("comm and ns"+"is"+" "+comm +" "+ns);
		}
		else if(tsa>=7501&&tsa<=10500) {
			comm=0.08*tsa;
			ns=bs+comm;
			System.out.println("comm and ns"+"is"+" "+comm +" "+ns);
		}
		else if(tsa>=10501&&tsa<=15000) {
			comm=0.11*tsa;
			ns=bs+comm;
			System.out.println("comm and ns"+"is"+" "+comm +" "+ns);
		}
		else if(tsa>=15000) {
			comm=0.15*tsa;
			ns=bs+comm;
			System.out.println("comm and ns"+"is"+" "+comm +" "+ns);
		}
		else
			System.out.println("invalid value");
	}

}
