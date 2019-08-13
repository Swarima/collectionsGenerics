import java.util.Scanner;
class Stud 
{
	private  int rollno;
	private   String name;
	private  Date dob;
	public Stud()
	{
		rollno=1;
		name="lily";
		dob=new Date();
	}
	public Stud(int no,String n,int d,int m,int y)
	{
		rollno=no;
		name=n;
		dob=new Date(d,m,y);
	}
	
	public void display()
	{
		dob.display();
		System.out.println(rollno+" "+name);
	}
	public void accept() {
		dob.accept();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter rollno,name:");
		rollno=sc.nextInt();
		name=sc.next();
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dob == null) ? 0 : dob.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + rollno;
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
		Stud other = (Stud) obj;
		if (dob == null) {
			if (other.dob != null)
				return false;
		} else if (!dob.equals(other.dob))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (rollno != other.rollno)
			return false;
		return true;
	}
	
		
	}

public class Ass5_1 {
	
	
	public static void main(String[] args) {
		Stud a1=new Stud(1,"abc",12,5,1990);
		Stud a2=new Stud(1,"abc",12,5,1990);
		System.out.println(a1.hashCode());
		System.out.println(a2.hashCode());
		if(a1.equals(a2))
			System.out.println("same");
		else
			System.out.println("not same");

	}

}
