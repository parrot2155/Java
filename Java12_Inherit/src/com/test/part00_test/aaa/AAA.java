package com.test.part00_test.aaa;

public class AAA {
	private int no;
	
	//생성자
	public AAA() {
		System.out.println("AAA생성");
	}
	public AAA(int no) {
		//super(); //부모클래스는 Object이다.
		System.out.println("AAA 생성(no)");
		this.no = no;
	}
	
	//getter & setter
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public void prn() {
		System.out.println("AAA의 prn메소드");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}	
