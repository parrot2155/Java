package com.test.chap05_method.test02;

public class Run {
	//ctrl + space = 이클립스에서 무적이다. 자동완성
	public static void main(String[] args) {
		MethodTest mt = new MethodTest();
		
		//각종의 메소드 호출(실행)
		
		//1. 매개변수 없고, 반환값(return type)없음.
		mt.method1();
		
		//2. 매개변수 없고, 반환값 있음
		String str = mt.method2();
		System.out.println(str);
		
		//3. 매개변수 있고, 반환값 없음
		mt.method3(10, 20);
		
		//4. 매개변수 있고, 반환값도 있을 때
		System.out.println("res : "+mt.method4(40, 4));
		
		mt.method3(mt.method4(20,30),mt.method4(10,20));
		
		
		
		//static 메소드 실행
		StaticMethodTest.staticMethod1();
		System.out.println("res : "+ StaticMethodTest.staticMethod2());
		StaticMethodTest.staticMethod3("박태욱");
		System.out.println(StaticMethodTest.staticMethod4("박태욱"));
	}
}







