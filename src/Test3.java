import java.util.*;
class Student implements Comparable<Student>{
	private int rollno;
	private String name;
	private double per;
	
	public double getPer() { //it was private so for accessing in the if condition
		return per;
	}
	public void setPer(double per) {
		this.per = per;
	}
	
	public Student(int rollno, String name, double per) {
		//super();
		this.rollno = rollno;
		this.name = name;
		this.per = per;
	}
	/**@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(per);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Student other = (Student) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(per) != Double.doubleToLongBits(other.per))
			return false;
		if (rollno != other.rollno)
			return false;
		return true;
	}**/
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", per=" + per + "]";
	}
	public int compareTo(Student o)
	{
		if(per>o.per)
			return -1;
		else if(per<o.per)
			return 1;
		else {
			return 0;
		}
}
/**class StudentCompare implements Comparator<Student>
{
	public int compare(Student o1,Student o2)
	{
		if(o1.getPer()>o2.getPer())
		{
			return -1;
		}
		else if(o1.getPer()<o2.getPer())
			
		{
			return 1;
		}
		else {
			return 0;
		}**/
	}




public class Test3 {

	public static void main(String[] args) {
/**Set<Student> s=new HashSet<>();
s.add(new Student(1,"abc",34));
s.add(new Student(2,"adc",32));
	for(Student x:s)
	{
		System.out.println(x);
	}

}
}**/
		/**Map<Integer,String> m=new TreeMap<>();
		m.put(123, "Tushar");
		m.put(30, "Jack");
		m.put(45, "Ram");
		System.out.println(m);
		
		Set<Map.Entry<Integer, String>> s=m.entrySet();
		
		for(Map.Entry<Integer, String> i:s)
		{
			System.out.println(i.getKey()+" "+ i.getValue());
		}
		
		System.out.println();
		
		Set<Integer> ks=m.keySet();
		for(Integer x:ks)
		{
			System.out.println(x+" "+m.get(x));
		}
		**/
		List<Student> list=new ArrayList<>();
		list.add(new Student(1,"abc",45));
		list.add(new Student(2,"abdc",49));
		list.add(new Student(3,"ac",44));
		list.add(new Student(6,"abjc",87));
		//Collections.sort(list,new StudentCompare());
		Collections.sort(list);

		for(Student s:list)
		{
			System.out.println(s);
		}
		
		
	}
}