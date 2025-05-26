package com.poly.part00_test.test02;

public class Cat extends Base{

	@Override
	public void start() {
		 System.out.println("고양이 걷는다.");
	}

	@Override
	public void stop() {
		System.out.println("고양이 멈췄다.");
	}
	
}
