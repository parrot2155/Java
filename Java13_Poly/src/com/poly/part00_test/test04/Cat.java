package com.poly.part00_test.test04;

public class Cat extends Animal{

	@Override
	public void bark() {
		System.out.println("야옹");
	}
	
	@Override
	public void eat(String str) {
		System.out.print("고양이가 ");
		super.eat(str);
	}
	
}
