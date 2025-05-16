package com.test01;

public class WhileTest03 {

	public static void main(String[] args) {
		//1. 1~100까지의 숫자를 출력. 단, 역순으로
		prn01();
		//2. 1~100까지의 숫자 중, 2의 배수만 출력
		prn02();
		//.3 1~100까지의 숫자 중, 7의 배수의 개수와 총 합을 출력
		prn03();

	}
	public static void prn01() {
		System.out.println("1~100 역순으로");
		int i = 100;
		while(i>0) {
			System.out.println(i);
			i--;
		}
	}
	public static void prn02() {
		int i = 1;
		while(2*i<=100) {
			System.out.println("2의 배수는? : "+(2*i));
			i++;
		}
	}
	public static void prn03() {
		int i = 1;
		int count = 0;
		int sum = 0;
		while(i*7<=100) {
			sum += (i*7);
			count++;
			i++;
		}
		System.out.println("1~100 사이의 7의 배수의 합 : "+sum+" , 개수 : "+count);
	}

}
