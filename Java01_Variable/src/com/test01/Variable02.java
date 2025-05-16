package com.test01;

import java.util.Scanner;

public class Variable02 {
	//클래스에는 메소드 선언과 변수선언만 가능.
	//메소드 개수는 상관 없음.단 이름이 달라야됨.
	//변수 개수는 상관 없음. 단 이름이 달라야됨.
	
	public static void main(String[] args) {
		//메소드 준비
		Variable02 test = new Variable02();
		//실행
		test.test1();
		//실행 : 상단의 버튼클릭!, ctrl+f11

	}
	
	public void test1() {
		//콘솔창으로부터 키보드로 값 입력받기
		//Scanner 클래스
		
		//준비
		//다른 패키지의 클래스 사용
		//1. java.util.Scanner sc = new java.util.Scanner();
		
		//2. import
		Scanner sc = new Scanner(System.in);
		
		//실행           //만들어져있는 라이브러리 기능들이 많다.
		 
		System.out.println("이름 입력하세요: ");
		String name = sc.nextLine(); //문자열 받아오는 메소드(공백 포함)
									 //next(); 문자열(공백 미포함)
		System.out.println("이름: " + name);
		
		//타입별로 받아올 수 있는 메소드가 존재
		System.out.println("나이 입력하세요: ");
		int age = sc.nextInt();
		System.out.println("나이: " + age);
		
		//문자는 문자열로 받아 charAt(index) 이용하여 받는다.
		char gender = "M".charAt(0); //해당하는 인덱스의 값을 하나만 떼오겠다.
		
	}

}










