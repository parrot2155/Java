package com.poly.part00_test.test01;

public class Dog extends Animal{
	@Override
	public void bark() {
		//상속받은 클래스에서 반드시 구현 해야한다.
		System.out.println("멍멍");
	}
	
	@Override
	public void eat(String str) {
		System.out.println("강아지가 ");
		super.eat(str);
	}

}
