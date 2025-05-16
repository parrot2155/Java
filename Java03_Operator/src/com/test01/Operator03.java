package com.test01;

import java.util.Scanner;

public class Operator03 {
	public static void main(String[] args) {
		//new Operator03().test1();
		new Operator03().test2();
		
		

	}
	// && : and
	// || : or
	// 논리값 && 논리값, 논리값 || 논리값
	public void test1() {
		//정수 하나 키보드로 입력받아 1~100 사이의 숫자인지 확인
		
		//스캐너 생성
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 하나 입력: ");
		int num = sc.nextInt();
		
		System.out.println("1부터 100사이인지 확인: "+ (num>=1 && num<=100));
		
		//영어 문자(char) 하나 입력받아 영문 대문자인지 확인
		System.out.print("알파벳 하나 입력 : ");
		char ch = sc.next().charAt(0);
		System.out.println("대문자? "+ (ch>='A'&& ch <='Z'));
		System.out.println(Character.isUpperCase(ch));
		
		System.out.print("계속 하시려면 y혹은 Y를 입력하세요.");
		char ch2 = sc.next().charAt(0);
		System.out.println("확인 : " + (ch2=='y' || ch2 == 'Y'));
	}
	public void test2(){
		//논리값 && 논리값 : 앞의 논리값이 false면 뒤를 실행 안한다.
		//논리값 || 논리값 : 앞의 논리값이 true면 뒤를 실행 안한다.-> 앞false면 뒤를 실행한다.
		
		int num = 10;
		int res = (false && ++ num>0)? num:num; //dead code 절대 실행될 일 없는 코드
		
		System.out.println("&&에서 num " + num); 
		
		res = (true||++num>0)?num:num; //당연히 true라 or 뒤의 연산은 실행될 일 없다.
		System.out.println("&&에서 num " + num); 
		
	
	
	
	
	}
	
	
}






