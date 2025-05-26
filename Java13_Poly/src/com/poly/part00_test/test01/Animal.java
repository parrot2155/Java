package com.poly.part00_test.test01;


//추상클래스
public abstract class Animal {    //추상클래스 안에
	//추상 메 소드는 상속받는 class가 만드시 구현
	public abstract void bark();  //추상메소드를 만든다.//선언부만 존재 구현부 없음.
	
	public void eat(String str) {
		System.out.println(str+" 먹는다.");
	}
	
	
	
}












