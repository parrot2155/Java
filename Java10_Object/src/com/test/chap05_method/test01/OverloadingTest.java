package com.test.chap05_method.test01;

public class OverloadingTest {
//	public void test() {
//		System.out.println(1);
//		System.out.println('a');
//		System.out.println("b");
//		}
	
	public int test() {
			return 0;
	}
	
	public int test(int a) {
		return 0;
	}
	
	public int test(int a, int b) {
		return 0;
	}
	
	public int test(int b, String s) { //데이터 타입이 다르면 다르다.
		return 0;
	}
	
	public int test(String b, int s) { //순서가 다르면 상관 없다.
		return 0;
	}
	
	//----------------------------------------
	//오버로딩에서 매개변수의 이름은 상관 없다.
	//매개변수의 개수, 순서, 타입이 달라야한다.
//	publuc int test(int b, int a) { 
//		return 0;
//	}
	
	//----------------------------------------
	//static, final키워드는 오버로딩에 상관 없다.
	/*public static int test(String b, int a) {
		return 0;
	}*/
	//----------------------------------------
	
	public String test(int a, int b, String s) {
		return null;
	}
	/*
	* 리턴타입이 다르다고 오버로딩이 적용되지 않는다.
	public int test(int a, int b, String s) {
		return 0;
	}*/
	
	//접근제한자가 다르다고 오버로딩이 적용되지 않는다.
	/*private String test(int a, int b, String s) {
		return null;
	}*/
	
}
