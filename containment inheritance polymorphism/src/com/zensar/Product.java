// assignment day4-4
package com.zensar;

 class Product implements Cloneable {
	public Product(int id, String name, double cost) {
		super();
		this.id = id;
		this.name = name;
		this.cost = cost;
	}
	
	public Product()
	{
		
	}
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", cost=" + cost + "]";
	}

	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	
	
	
	
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(cost);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Product other = (Product) obj;
		if (Double.doubleToLongBits(cost) != Double.doubleToLongBits(other.cost))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}




	private int id;
	private String name;
	private double cost;
	
	
	

	public static void main(String[] args) throws CloneNotSupportedException {
		Product p1=new Product(12,"abc",20000);
		Product p2=new Product(12,"abc",20000);
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		if(p1.equals(p2))
			System.out.println("same");
		else
			System.out.println("not same");


		//Product p2=(Product)p1.clone();
		//System.out.println(p1);
		//System.out.println(p2);
		//p1.setCost(3000);
		//System.out.println(p1);
	
	}
	

}
