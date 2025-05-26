package com.test.part01_inheritTest.after.model;

import java.util.Date;

public class SmartPhone extends Computer{
	private String moblieAgency;
	
	public SmartPhone() {}
	public SmartPhone(String brand, String productNumber, String productCode, String productName, int price, Date date,
			String cpu, int hdd, int ram, String os, String moblieAgency) {
		super(brand, productNumber, productCode, productName, price, date, cpu, hdd, ram, os);
		this.moblieAgency = moblieAgency;
	}
	
	//getter setter
	public String getMoblieAgency() {
		return moblieAgency;
	}
	public void setMoblieAgency(String moblieAgency) {
		this.moblieAgency = moblieAgency;
	}
	
	@Override
	public String toString() {
		return super.toString()+", moblieAgency=" + moblieAgency ;
	}
	
	
	
}
