import java.util.*;
public class Vehicle {
	private String registration_num;
	private String vehicle_name;
	private double cost;
	
	public Vehicle()
	{
		registration_num="1A12";
		vehicle_name="bike";
		cost=25000;
	}

	public  void accept()
	{			Scanner sc=new Scanner(System.in);
				System.out.println("enter registration number"+" "+"vehicle name"+" "+"cost");
				registration_num=sc.next();
				vehicle_name=sc.next();
				cost=sc.nextInt();

	}
	
	/**public void display()
	{
		 System.out.println(registration_num+" "+vehicle_name+" "+cost);

	}**/
	public String getRegistration_num() {
		return registration_num;
	}

	public void setRegistration_num(String registration_num) {
		this.registration_num = registration_num;
	}

	public String getVehicle_name() {
		return vehicle_name;
	}

	public void setVehicle_name(String vehicle_name) {
		this.vehicle_name = vehicle_name;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Vehicle [registration_num=" + registration_num + ", vehicle_name=" + vehicle_name + ", cost=" + cost
				+ "]";
	}

	public void update()
	{
		//String n=Vehicle.getRegistration_num();
		//System.out.println(n);
		//Vehicle.setRegistration_num("1501SS98");
		System.out.println(registration_num);
	}
	

	
	
		

		public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Vehicle v1=new Vehicle();
		Vector<Vehicle> v=new Vector<>();
		int choice;
		int c=0;
		while(c<10)
		{
			System.out.println("Enter your choice:"+" "+"1.Insert record"+" "+"2.Update information"+" "+"3.Display records"+" "+"4.Exit");
			choice=sc.nextInt();
		switch(choice)
		{
		case 1:v1.accept();
				v.add(v1);
				break;
				
		case 2:v1.update();
				break;
				
		case 3:	Iterator<Vehicle> it=v.iterator();
		
				while(it.hasNext())
				{
				System.out.println(it.next()+" ");
				}
				break;
			
				
		case 4:System.exit(0);
		
		}
		c++;
		
		

	}

	}
}
