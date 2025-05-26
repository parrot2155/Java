package com.test.chap05_method.test02;

public class StaticMethodTest {
	//static 메소드
	//static 메모리 공간에 프로그램이 시작되면 준비된다.
	//객체 생성 필요 없이 바로 실행이 가능하다.
	
	public static void staticMethod1() {
		System.out.println("10과 20의 합 : "+(10+20));
	}
	
	public static int staticMethod2() {
		return 10+20;
	}
	
	public static void staticMethod3(String name) {
		System.out.println(name+"님의 방문을 환영합니다.");
	}
	
	public static String staticMethod4(String name) {
		return name+"님 안녕히 가세요.";
	}
	
	
}











