package com.test.part01_inheritTest.before.model;

import java.util.Date;

public class Desktop {
	//필드
		private String brand;
		private String productNumber;
		private String productCode;
		private String productName;
		private String cpu;
		private int hdd;
		private int ram;
		private String os;
		private int price;
		private Date date;
		private boolean AllInOne;
		
	public Desktop() {}
	public Desktop(String brand, String productNumber,String productCode, String productName,String cpu,int hdd,int ram,String os, int price, Date date, boolean AllInOne) {
		this.brand = brand;
		this.productNumber = productNumber;
		this.productCode = productCode;
		this.productName = productName;
		this.cpu = cpu;
		this.price = price;
		this.date = date;
		this.AllInOne = AllInOne;
	}
}

