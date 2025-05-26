package com.test.part01_inheritTest.before.model;

import java.util.Date;

public class Television {
	//필드
	private String brand;
	private String productNumber;
	private String productCode;
	private String productName;
	private int price;
	private Date date;
	private int inchType;
	
	//생성자(기본, 매개변수)
	public Television() {}
	public Television(String brand, String productNumber,String productCode, String productName, int price, Date date, int inchType ) {
		this.brand = brand;
		this.productNumber = productNumber;
		this.productCode = productCode;
		this.productName = productName;
		this.price = price;
		this.date = date;
		this.inchType = inchType;
	}
	//getter setter
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void setProductNumber(String productNumber) {
		this.productNumber = productNumber;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public void setInchType(int inchType) {
		this.inchType = inchType;
	}
	
	public String getBrand() {
		return brand;
	}
	public String getProductNumber() {
		return productNumber;
	}
	public String getProductCode() {
		return productCode;
	}
	public String getProductName() {
		return productName;
	}
	public int getPrice() {
		return price;
	}
	public Date getDate() {
		return date;
	}
	public int getInchType() {
		return inchType;
	}
	
	
	//prn()
	public void prn() {
		System.out.println("prn() : ");
	}
	
}
