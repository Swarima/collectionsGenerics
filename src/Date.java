
import java.util.Scanner;
public class Date {
	private int dd,mm,yy;
	
	Date()
	{
		dd=1;
		mm=1;
		yy=2200;
	}

	Date(int d,int m,int y)
	{
		dd=d;mm=m;yy=y;
	}
	void display()
	{
		System.out.println(dd+" "+mm+" "+yy);
	
	}
	void accept() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter dob");
		dd=sc.nextInt();
		mm=sc.nextInt();
		yy=sc.nextInt();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + dd;
		result = prime * result + mm;
		result = prime * result + yy;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Date other = (Date) obj;
		if (dd != other.dd)
			return false;
		if (mm != other.mm)
			return false;
		if (yy != other.yy)
			return false;
		return true;
	}


}
