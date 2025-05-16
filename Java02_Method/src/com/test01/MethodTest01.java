package com.test01;

public class MethodTest01 {

	public static void main(String[] args) {
		
		//static 메소드 실행
		//클래스명.메소드명();
		MethodTest01.publicMethod();
		MethodTest01.protectedMethod();
		MethodTest01.defaultMethod();
		privateMethod();//원칙상으로는 클래스명. 앞에 붙이는게 맞긴 함.
		
		//nonStatidMethod 실행
		//클래스명 변수명 = new 클래스명();
		//변수명.메소드녈();
		MethodTest01 mt = new MethodTest01();
		mt.NonstaticMethod();
		
	
	}
	
	//접근제한자.
	
	//public이런애들 <- 접근제한자.
	
	//public : 어디서나 누구나 접근, 참조 가능하다. (+)
	public static void publicMethod() {
		System.out.println("public method");
	}
	
	//protected 상속일 경우 상속될 곳에서.
	//상속이 아닐경우 캍은 패키지 안에서 접근, 참조 가능하다.  (#)
	protected static void protectedMethod() {
		System.out.println("protected method");
	}
	
	//같은 패키지 안에서 접근, 참조 가능하다. (default)
	static void defaultMethod() {
		System.out.println("default method");
	}
	
	//현재 클래스에서만 접근,참조 가능하다.  (-)
	private static void privateMethod() {
		System.out.println("private method");
	}
	
	
	public void NonstaticMethod() {
	System.out.println("Nonstatic Method");
	}
}











