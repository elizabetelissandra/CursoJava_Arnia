package service;

import java.text.DecimalFormat;

public class Product {
	
	private String name;
	protected double price;
	
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	public String toString() {
		DecimalFormat df = new DecimalFormat("#.00");
		return name + " R$ "+df.format(price);
	}
	
}
