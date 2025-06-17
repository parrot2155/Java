package com.poly.part00_test.test01;

public class Cat extends Animal{
	
	@Override
	public void bark() {
		System.out.println("야옹");
	}
	@Override
	public void eat(String str) {
		System.out.println("고양이가 ");
		super.eat(str);
	}
}
