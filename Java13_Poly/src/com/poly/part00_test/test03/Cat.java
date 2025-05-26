package com.poly.part00_test.test03;

public class Cat implements Animal{ //인터페이스 상속. 클래스 내에서 구현해주던가 추상클래스로 바꾸던가.

	@Override
	public void bark() {
		System.out.println("야옹");
	}

	@Override
	public void eat(String str) {
		System.out.println(str + " 먹는다.");
		
	} 

}
