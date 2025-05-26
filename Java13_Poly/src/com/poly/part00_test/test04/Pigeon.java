package com.poly.part00_test.test04;

public class Pigeon extends Animal implements Bird{ //추상클래스와 인터페이스 모두 상속을 받을 수 있다.

	@Override
	public void fly() {
		System.out.println("파닥");
	}

	@Override
	public void bark() {
		System.out.println("구구구구");
	}
	
}
