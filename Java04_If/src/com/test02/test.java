package com.test02;



public class test {
	public void test01(int no) {
		if(no%5==0) {
			System.out.println("5의 배수입니다.");
		}
	}
	public void test02(int no) {
		if(no%3==0&&no%2==0) {
			System.out.println("2의 배수이면서 3의 배수입니다.");
		}else {
			System.out.println("2와 3의 배수가 아닙니다.");
		}
	}
	public void test03(char ch) {
		
//		if(ch>='A'&&ch<='Z') {
//			System.out.println("대문자입니다.");
//		}else if(ch>='a'&&ch<='z'){
//			System.out.println("소문자입니다.");
//		}else {
//			System.out.println("올바른 알파벳을 입력");
//		}
		
		
		if(Character.isUpperCase(ch)) {
			System.out.println("대문자입니다.");
		}else if(Character.isLowerCase(ch)) {
			System.out.println("소문자입니다.");
		}else {
			System.out.println("올바른 알파벳을 입력");
		}
		//java.lang패키지는 따로 import안해도 어디서든 쓸 수 있다.
	}
}
