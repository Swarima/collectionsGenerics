public class Ass10 {

	public static void main(String[] args) {
		int temp=1;
		for(int num=2;num<=100;num++) {
			temp=1;
			for(int check=2;check<num/2;check++) {
				if(num%check==0) {
					temp=0;
					break;
				}
			}
			if(temp!=0) {
				System.out.print(" "+num+" ");
			}
		}
	
	}
}