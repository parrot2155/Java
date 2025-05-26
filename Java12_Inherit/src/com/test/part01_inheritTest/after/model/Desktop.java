package com.test.part01_inheritTest.after.model;

import java.util.Date;

public class Desktop extends Computer{
	//필드
	private boolean allInOne;
	//생성자
	public Desktop() {}
	public Desktop(String brand, String productNumber, String productCode, String productName, int price, Date date,
			String cpu, int hdd, int ram, String os, boolean allInOne) {
		super(brand, productNumber, productCode, productName, price, date, cpu, hdd, ram, os);
		this.allInOne = allInOne;
		System.out.println("Desktop 객체 생성");
	}
	public boolean isAllInOne() {
		return allInOne;
	}
	public void setAllInOne(boolean allInOne) {
		this.allInOne = allInOne;
	}
	//투스트링
	@Override
	public String toString() {
		return super.toString()+", allInOne=" + allInOne;
	}
	
}
