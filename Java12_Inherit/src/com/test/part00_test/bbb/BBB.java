package com.test.part00_test.bbb;

import com.test.part00_test.aaa.AAA;

public class BBB extends AAA { //부모클래스 객체부터 만들어진다.
	private int b;
	
	public BBB() {
		System.out.println("BBB 생성()");
	}
	public BBB(int b) {
		super(b);
		System.out.println("BBB 생성(b)");
		this.b = b;
	}
	
	public BBB(int no, int b) {
		super(no);
		this.b = b;
		System.out.println("BBB 생성(no,b)");
		//super.setNo(no); <-이렇게 하지 마셈
	}
	
	
	
	//getter setter
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	
	//합계
	public int getSum() {
		int sum = this.getB()+super.getNo();
		return sum;
	}
	
	@Override  //<-오버라이드 하겠다고 말해줌
	public void prn() {
		System.out.println("BBB의 prn()");
	}
	
}
