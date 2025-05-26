package com.silsub2.model.vo;

public class Product {
	private String pName;
	private int price;
	private String brand;
	
	public Product(String pName, int price, String brand) {
		this.pName = pName;
		this.price = price;
		this.brand = brand;
		
	}

	//public void Product() {}
	
	public void setPName(String pName) {
		this.pName = pName;
	}
	public String getPName() {
		return pName;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getBrand() {
		return brand;
	}
	
	public void information() {
		System.out.println(pName+" , "+price+" , "+brand+" , ");
	}
}
