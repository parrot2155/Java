package com.poly.part00_test.test03;

//인터페이스
public interface Animal {
	//static final String name = "a"; //static final 생략됨
	
	public abstract void bark();
	void eat(String str);
	
	//public static void test 일반적인 변수는 지원하지 않으나 static만 지원함.
	
}
