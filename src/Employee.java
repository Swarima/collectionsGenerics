	class Employee<G> {
	private int eid;
	private String name;
	private double salary; 
	
	public Employee()
	{
		eid=1;
		name="hii";
		salary=1000;
	}
	
	public Employee(int id,String n, int s)
	{
		eid=id;
		name=n;
		salary=s;
	}
	 public double getSalary()
	 {
		 return salary;
	 }
	 void swap(G a,G b)
	 {
	 	G temp;
	 	temp=a;
	 	a=b;
	 	b=temp;
	 	System.out.println(a+" "+b);
	 }

	 public void display()
	 {
		 System.out.println(eid+" "+name+" "+salary);
	 }





	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", salary=" + salary + "]";
	}

	public static void main(String[] args) {
Employee<Employee> e=new Employee<>();
Employee<Employee> e3=new Employee<>(1,"abc",200);


e.swap(e3,e );
	}

	}
