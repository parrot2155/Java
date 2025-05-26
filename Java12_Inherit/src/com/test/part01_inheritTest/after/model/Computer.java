package com.test.part01_inheritTest.after.model;

import java.util.Date;

public class Computer extends Product{//자바에서는 단일상속임.그래서 이중상속을 해줄거임
	private String cpu;
	private int hdd;
	private int ram;
	private String os;
	
	//생성자 만들고
	public Computer() {}

	public Computer(String brand, String productNumber, String productCode, String productName, int price, Date date,
			String cpu, int hdd, int ram, String os) {
		super(brand, productNumber, productCode, productName, price, date);
		this.cpu = cpu;
		this.hdd = hdd;
		this.ram = ram;
		this.os = os;
		System.out.println("Computer 객체 생성");
	}
	
	
	//게터세터 만들고
	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public int getHdd() {
		return hdd;
	}

	public void setHdd(int hdd) {
		this.hdd = hdd;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}
	
	
	//투스트링 만든다
	@Override
	public String toString() {
		return super.toString()+", cpu=" + cpu + ", hdd=" + hdd + ", ram=" + ram + ", os=" + os;
	}
	
	
	
	
	
	
}
