package com.test01;

import java.util.Scanner;

public class WhileTest02 {

	public static void main(String[] args) {
		WhileTest02.testDoWhile3();

	}
	
	public static void testDowhile1() {
		int i=1;
		do {
			System.out.println(i);
			i++;
		}while(i<=10);
		System.out.println("do while 종료 후 i : "+i );
		
		//이 시점에서 i=11
		do {
			System.out.println(i);
			i++; //거짓이어도 일단 한번 실행한다.
		}while(i<=10);
		System.out.println("do while 종료 후 i : "+i );
	}
	
	public static void testDoWhile2() {
		//키보드로 영어 문자열 값을 입력 받아 출력하는 걸 변환/
		//단. exit입력할때까지
		//do while을 이용해서.
		Scanner sc = new Scanner(System.in);
		
		String str = "";
		do {
			System.out.println("문자열 : ");
			str = sc.next();
			System.out.println("str : " + str);
		}while(!str.equals("exit"));
		System.out.println("끝. 나가");
	}
	public static void testDoWhile3() {
		//testDoWhile2와 동일하게 동작하도록 구현
		Scanner sc = new Scanner(System.in);
		String str = "";
		do {
			System.out.println("문자열을 입력 : ");
			str = sc.next();
			System.out.println("str : " + str);
			if(str.equals("exit")){
				System.out.println("끝. 나가");
				break;
			}
		}while(true);
	}
	
}













