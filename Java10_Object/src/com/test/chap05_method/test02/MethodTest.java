package com.test.chap05_method.test02;

public class MethodTest {
	//매개변수, 반환값에 따른 메소드 구분
	
	//1. 매개변수 없고, 반환값(return type)없음.
	//실행하고 끝.
	public void method1() {
		System.out.println("매개변수와 반환값이 없는 메소드");
		return; //요게 생략되었다고 생각하자. jdk에서 자동으로 처리해주는 부분.
	}
	
	//2. 매개변수 없고, 반환값 있음
	public String method2() {
		return "매개변수 없고 반환값 있는 메소드";//데이터타입 정확하게 맞춰줘야 한다.
	}
	//3. 매개변수 있고, 반환값 없음
	public void method3(int num1, int num2) {
		//반환하는 값이 없으므로 이 안에서 사용하고 처리하고 끝.
		int sum = num1 + num2;
		System.out.println("sum : "+sum);
		//return;
	}
	
	//4. 매개변수 있고, 반환값도 있을 때
	public int method4(int num1, int num2) {
		return num1+num2; //꼭 반환값의 데이터타입으로 반환해야함.
	}
	
}

