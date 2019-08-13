package com.zensar;

public class IceCream {

	private String flavour;
	private float price;
	private float discount;
	
	
	
	
	public String getFlavour() {
		return flavour;
	}




	public void setFlavour(String flavour) {
		this.flavour = flavour;
	}




	public float getPrice() {
		return price;
	}




	public void setPrice(float price) {
		this.price = price;
	}




	public float getDiscount() {
		return discount;
	}




	public void setDiscount(float discount) {
		this.discount = discount;
	}




	public IceCream(String flavour, float price) {
		this.flavour = flavour;
		this.price = price;
		if(this.flavour.equals("chocolate"))
		{
			discount=10.75f;
			this.price=price-discount;
		}
		else
			discount=5.25f;
		this.price=price-discount;
	}
	}